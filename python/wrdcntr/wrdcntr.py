
__all__ = ['WordCounter']

class WordCounter():
    
    def __init__(self, sc):
        self.sc = sc
        
    def count(self, file):
        return self.sc.textFile(file)\
            .flatMap(lambda line: line.split())\
            .map(lambda word: (word, 1)).countByKey()
