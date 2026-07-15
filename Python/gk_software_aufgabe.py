money = [500,200,100,50,20,10,5,2,1,0.50,0.20,0.10,0.05,0.02,0.01]
names = ["500 Euro bill",
         "200 Euro bill",
         "100 Euro bill",
         "50 Euro bill",
         "20 Euro bill",
         "10 Euro bill",
         "5 Euro bill",
         "2 Euro coin",
         "1 Euro coin",
         "50 Cent coin",
         "20 Cent coin",
         "10 Cent coin",
         "5 Cent coin",
         "2 Cent coin",
         "1 Cent coin"]

due_amount = float(input("Due amount: "))
received_amount =float(input("Received amount: "))

change = round((received_amount - due_amount) * 20) / 20

print(f"\n Change: {change:.2f} Euro\n")

for i in range(len(money)):
    count = int(change // money[i])

    if count > 0:
        print(f"{names[i]}: {count}")

    change = round(change - count * money[i], 2)

