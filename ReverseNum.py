class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        
        xabs=abs(x)
        if x>=0:
            flag=1
        if x<0:
            flag=-1
        temp=xabs
        
        result=0
        
        while temp>0:
            every=temp%10
            temp=temp/10
            if temp!=0:
                result=(result+every)*10
            if temp==0:
                result=result+every
        
        if result>2**31-1:
            return 0
        else:
            return flag*result