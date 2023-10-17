class cse:
    var=10
    def __init__(self,a):
        print("Im a parameterised constructor with value",a)
    def study(self): 
        print("Im Studying in CSE")
x=cse(10)
x.study()
print(x.var)
