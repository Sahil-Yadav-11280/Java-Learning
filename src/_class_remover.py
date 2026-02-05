import os;
for i in (os.listdir()):
    if i.endswith(".class"):
        os.remove(i)

print("Successfully removed all .class files!")
