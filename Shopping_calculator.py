books = 150
pens = 10
notebooks = 25
discount = 0.15

total = (books * 2) + (pens * 5) + (notebooks * 3)
print(f"Total: {total}")

if total >= 350:
    discounted_price = discount * total
    print(f"Discounted Amount: {discounted_price}")
    print(f"Total Bills: {total - discounted_price}")
else:
    print("No Discount")