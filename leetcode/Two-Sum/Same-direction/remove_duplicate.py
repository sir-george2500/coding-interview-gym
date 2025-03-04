from typing import List

def remove_duplicates(arr: List[int]) -> int:
    """
    Removes duplicate elements from a sorted array in-place and returns the length of the unique elements.
    
    This function modifies the given array by moving unique elements to the front while maintaining order.
    It uses the two-pointer technique to efficiently remove duplicates.

    Args:
        arr (List[int]): A list of sorted integers.

    Returns:
        int: The number of unique elements in the modified array.

    Example:
        >>> nums = [1, 1, 2, 2, 3, 4, 4, 5]
        >>> remove_duplicates(nums)
        5
        >>> nums[:5]  # The first 5 elements should be unique
        [1, 2, 3, 4, 5]
    """

    # Pointer 'slow' represents the position of the last unique element
    slow = 0 

    # Iterate over the array using 'fast' pointer
    for fast in range(len(arr)):
        # If a new unique element is found, move 'slow' forward and replace the duplicate
        if arr[slow] != arr[fast]:
            slow += 1  # Move slow pointer forward
            arr[slow], arr[fast] = arr[fast], arr[slow]  # Swap to maintain order

    # The length of unique elements is slow + 1 (since 'slow' is index-based)
    return slow + 1

