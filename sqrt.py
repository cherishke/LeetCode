class Solution(object):
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        low=1
        high=x
        if x<=1:
            return x
        else:
            while low<=high:
                mid=low+(high-low)/2
                sqrt=x/mid
                if sqrt==mid:
                    return sqrt
                if sqrt<mid:
                    high=mid-1
                else:
                    low=mid+1
            return high