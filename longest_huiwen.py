class Solution(object):
    max = 0
    substr = ""

    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        if len(s) == 1:
            substr = s
        else:
            for i in range(len(s)):
                self.findSubstr(s, i, i)
                self.findSubstr(s, i, i + 1)
        return Solution.substr

    def findSubstr(self, str, left, right):
        while (left >= 0) and (right < len(str)) and (str[left] == str[right]):
            sublen = right - left + 1
            if sublen > Solution.max:
                Solution.max = sublen
                Solution.substr = str[left:right + 1]
            left -= 1
            right += 1

if __name__ == '__main__':
    s=Solution()
    print s.longestPalindrome("cbbd")