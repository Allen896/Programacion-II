import math


class EcuacionCuadratica:
    def __init__(self,a ,b, c):
        self._a = a
        self._b = b
        self._c = c
    def getDiscriminante(self):
        return self._b ** 2 -4 * self._a * self._c

    def getRaiz1(self):
        discriminante = self.getDiscriminante()
        if discriminante < 0:
            return 0
        return (-self._b + math.sqrt(discriminante) ) / (2 * self._a)

    def getRaiz2(self):
        discriminante = self.getDiscriminante()
        if discriminante < 0:
            return 0
        return (-self._b - discriminante ** 0.5) / (2 * self._a)

    def __str__(self):
        return "ecuacion [{},{},{}]" . \
            format(self._a,self._b,self._a)

print("Ecuacion Cuadratica")

e1 = EcuacionCuadratica(1.0,3,1)
print("Ecuacion 1 =", e1)
discri1 = e1.getDiscriminante()
if discri1 > 0:
    print(e1.getRaiz1(), "y" , e1.getRaiz2())
elif discri1 == 0:
    print(e1.getRaiz1())
else:
    print("la ecuacion no tiene raices")

e2 = EcuacionCuadratica(1,2.0,1)
print("Ecuacion 2 =", e2)
discri2 = e2.getDiscriminante()
if discri2 > 0:
    print(e2.getRaiz1(), "y" , e2.getRaiz2())
elif discri2 == 0:
    print(e2.getRaiz1())
else:
    print("la ecuacion no tiene raices")

e3 = EcuacionCuadratica(1,2,3)
print("Ecuacion 3 =", e3)
discri3 = e3.getDiscriminante()
if discri3 > 0:
    print(e3.getRaiz1(), "y" , e3.getRaiz2())
elif discri3 == 0:
    print(e3.getRaiz1())
else:
    print("la ecuacion no tiene raices")