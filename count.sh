#!/bin/bash
echo "enter the word to search:"
read target_word

echo "enter the filename:"
read filename


count=$(grep -o -w "$target_word" "$filename"|wc -l)
echo "word count is $count"

