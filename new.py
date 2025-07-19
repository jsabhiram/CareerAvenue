class Monster:
    def __init__(self,x,y):
        self.power=x
        self.bonus=y
    def desc(self):
        return {self.power+self.bonus}
def srt(lst):
    for i in range(len(lst)):
        for j in range(i+1,len(lst)):
            if(lst[i].power>lst[j].power):
                temp=lst[i]
                lst[i]=lst[j]
                lst[j]=temp
    return lst

data=[]
print("--------------------------------------------------")
n=(input("Enter the game stats:"))
#process
try:
    total=n.split(" ")
    print(total)
    n=int(total[0])
    exp=int(total[1])
    # print("Error")
    c=2
    while(c<len(total)):
        m=Monster(total[c],total[c+1])
        c=c+2
        print("Entered")
        data.append(m)
        new_data=srt(data)
        
except:
    print("Invalid input")
for i in new_data:
    print(i.desc())
print("--------------------------------------------------")