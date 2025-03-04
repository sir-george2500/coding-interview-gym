from typing import List

def container_with_most_water(arr: List[int]) -> int:
    """
    Finds the maximum area of water that can be contained between two vertical lines in an array.

    This function implements the two-pointer technique to efficiently determine the largest
    container that can hold water, where each index in the array represents a vertical line
    and the distance between lines represents the width.

    Args:
        arr (List[int]): A list of non-negative integers representing vertical line heights.

    Returns:
        int: The maximum area of water that can be trapped between two lines.

    Example:
        >>> container_with_most_water([1, 8, 6, 2, 5, 4, 8, 3, 7])
        49
        >>> container_with_most_water([1, 1])
        1
        >>> container_with_most_water([4, 3, 2, 1, 4])
        16
    """

    # Initialize two pointers: 'left' at the start and 'right' at the end of the array
    left, right = 0, len(arr) - 1 

    # Variable to track the maximum area found
    max_area = 0

    # Iterate while the two pointers do not cross
    while left <= right:
        # Calculate the area formed by the two pointers
        current_area = (right - left) * min(arr[left], arr[right])

        # Update max_area if the current area is larger
        max_area = max(current_area, max_area)

        # Move the pointer pointing to the shorter line (to maximize height in future iterations)
        if arr[left] < arr[right]:
            left += 1 
        else:
            right -= 1

    # Return the maximum area found
    return max_area

