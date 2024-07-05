#!/bin/bash
add()
{
	i=$1
	j=$2
	((k=i+j))
	echo "sum is $k"
}
mul()
{
	i=$1
	j=$2
	((k=i*j))
	echo "product is $k"
}
sub()
{
	i=$1
	j=$2
	((k=i- j))
	echo "difference is $k"
}
echo "enter options: 1.add , 2.mul ,3.sub"

read i
case $i in
	1) add 1 2 ;;
	2) mul 1 2 ;;
	3) sub 1 2 ;;
esac
