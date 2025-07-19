class Monster:
    def __init__(self,x,y):
        self.power=x
        self.bonus=y
    def desc(self):
        return {self.power+self.bonus}
    

print("--------------------------------------------------")
n=(input("Enter the game stats:"))
#process
try:
    total=n.split(" ")
    n=total[0],exp=total[1]
    for i in range(2,len(total)-2):
        m=Monster(total[i],total[i+1])
        m.desc()
except:
    print("Invalid input")

print("--------------------------------------------------")