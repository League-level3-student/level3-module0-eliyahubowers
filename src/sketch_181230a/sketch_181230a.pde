/* Copy the code into a new Processing sketch and complete then steps. */

//1. create an array of ints. don't initialize it yet.
float one;
float two;
float three;

int[] array;

int reset;
void setup() {
  //2. set the size of your window
  size(700,800);
reset = 0;
  //3. initialize your array with the built in width variable
array = new int[width];
  
  //4. initialize the ints in the array with random numbers
  //   from 0 to the built in height variable
one = random(6)+1;
two = random(6)+1;
three = random(6)+1;

for(int i = 0; i < array.length; i ++){
  array[i] = int(random(height));
}
  //5. call the noStroke() method
  noStroke();
  smooth(8);
}

void draw() {
  //6. set the background color with background(r, g, b);
background(0);

  //7. set the color for your graph
fill(255);

  //8. draw a rectangle for each int in your array.
  //   the x value will be the index of the int
  //   the y value will the height variable
  //   the width is 1
  //   the height is negative the value of the int at that element in the array
for(int i = 0; i < array.length; i ++){
  fill((array[i])/one,(array[i])/two,(array[i])/three);
  rect(i,array[i],1,array[i]*-1);
}

  //9. call the stepSort method
  stepSort(array);
if(reset == 0){
  delay(500);
  randomise(array);
}
  //10. extract the code that randomizes the array into a method.
  

  //11. call the method you made in step 10 when the mouse is pressed
  
}

void stepSort(int[] arr) {
  reset = 0;
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
      reset ++;
    }
  }
}

void randomise(int[] arr){
one = random(6)+1;
two = random(6)+1;
three = random(6)+1;
  for(int i = 0; i < arr.length; i ++){
  arr[i] = int(random(height));
}
}

void mouseClicked(){
  randomise(array);
}