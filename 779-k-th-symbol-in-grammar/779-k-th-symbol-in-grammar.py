class Solution(object):
    def kthGrammar(self, N, K):
        if N==1:
            return 0
        parent=self.kthGrammar(N-1,K/2+K%2)
        isKOdd=K%2==1
        if parent==1:
            return 1 if isKOdd else 0
        else:
            return 0 if isKOdd else 1
        