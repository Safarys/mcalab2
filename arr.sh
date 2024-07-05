echo "enter the size of array"
read size
echo "enter the elements"
for((i=0;i<size;i++))
do
	read n[i]
done
echo "array elements are: "
for((i=0;i<size;i++))
do
	echo "${n[$i]}"
done 
