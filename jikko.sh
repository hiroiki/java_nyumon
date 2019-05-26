#!/bin/bash
script=$1
javac $script
#echo "compiled $script" 

class=${script%%.*} 
java $class
#echo "jikkoed $class"

