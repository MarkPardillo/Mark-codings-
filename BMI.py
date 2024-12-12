name1 = "Mark"
weight_kg1 = 54
height_m1 = 1.64

name2 = "John"
weight_kg2 = 54
height_m2 = 1.64

name3 = "Fritch"
weight_kg3 = 54
height_m3 = 1.64


def bmi_calculator(name, weight_kg, height_m):
    bmi = weight_kg / (height_m ** 2)
    print("BMI is")
    print(round (bmi))
    
    if bmi < 18.5:
        return name + " " + "is underweight"
    elif bmi >= 18.5 <= 25.0:
        return name + " " + "is Normal"
    elif 25.0 > bmi <= 30.0:
        return name + " " + "is overweight"  
    else:
        return name + " " + "Obese"      
            
result1 = bmi_calculator(name1, weight_kg1, height_m1)
result2 = bmi_calculator(name2, weight_kg2, height_m2)
result3 = bmi_calculator(name3, weight_kg3, height_m3)

print(result1)
print(result2)
print(result3)
