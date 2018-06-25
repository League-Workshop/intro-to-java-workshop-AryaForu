PImage mustache;
PImage friend;


void setup(){
  friend = loadImage("friend.jpg");
  size(800,600);
  friend.resize(width,height);
  mustache = loadImage("moustache.png"); 
  mustache.resize(500,150);
  
}

void draw(){
  background(friend);
  if(mousePressed){
 image(mustache, 120,190);} 
}