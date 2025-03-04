def is_palindrome(s: str) -> bool:
    """
    Checks if a given string is a palindrome, ignoring non-alphanumeric characters and case differences.

    A palindrome is a word, phrase, number, or sequence that reads the same forward and backward.
    This function processes the input string by removing non-alphanumeric characters and converting
    all letters to lowercase before checking for palindrome properties using a two-pointer approach.

    Args:
        s (str): The input string to check.

    Returns:
        bool: True if the input string is a palindrome, False otherwise.

    Example:
        >>> is_palindrome("A man, a plan, a canal: Panama")
        True
        >>> is_palindrome("race a car")
        False
        >>> is_palindrome("madam")
        True
    """

    # Preprocess the string: Remove non-alphanumeric characters and convert to lowercase
    cleaned = "".join(char.lower() for char in s if char.isalnum())

    # Initialize two pointers: 'left' starts at the beginning, 'right' at the end
    left, right = 0, len(cleaned) - 1 

    # Compare characters while left pointer is before or at the right pointer
    while left <= right:
        if cleaned[left] != cleaned[right]:  # If characters don’t match, it's not a palindrome
            return False 
        left += 1  # Move left pointer forward
        right -= 1  # Move right pointer backward

    # If all characters match, the string is a palindrome
    return True

