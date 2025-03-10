from typing import List

# Pattern Explanation:
# This approach uses the two-pointer technique to move all zeros to the end of the list 
# while maintaining the relative order of non-zero elements. 
# - The `slow` pointer tracks the position where the next non-zero element should be placed.
# - The `fast` pointer iterates through the list, searching for non-zero elements.
# - When a non-zero element is found, it is swapped with the element at the `slow` pointer's position.
# - After swapping, the `slow` pointer moves forward.
# - The `fast` pointer continues to traverse the entire list.

def move_zeros(nums: List[int]) -> None:
    slow = 0  # `slow` pointer keeps track of the position to place the next non-zero element
    
    for fast in range(len(nums)):  # `fast` pointer iterates through the list
        if nums[fast] != 0:  # When a non-zero element is found
            nums[slow], nums[fast] = nums[fast], nums[slow]  # Swap the elements
            slow += 1  # Move `slow` pointer forward for the next non-zero placement

