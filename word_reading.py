def count_reading_methods(word):
  dict = {"a": 2, "e": 2, "i": 2, "o": 2, "u": 2}

  count = 1
  for char in word:
    char = char.lower()
    count *= dict[char]
  return count


name = input()
result = count_reading_methods(name)
print(result)
 
