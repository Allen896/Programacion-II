class EcuacionLineal:
    def __init__(self, a, b, c, d, e, f):
        self._a = a
        self._b = b
        self._c = c
        self._d = d
        self._e = e
        self._f = f

    def TieneSolucion(self):
        return (self._a * self._d - self._b * self._c) != 0

    def getX(self):
        denominador = self._a * self._d - self._b * self._c
        if denominador == 0:
            return 0
        return (self._e *self._d - self._b * self._f) / denominador
    def getY(self):
        denominador = self._a * self._d - self._b * self._c
        if denominador == 0:
            return 0
        return (self._a * self._f - self._e * self._c) / denominador

    def __str__(self):
        return "ecuacion [{},{},{},{},{},{}]". \
            format(self._a, self._b, self._c, self._d, self._e, self._f)

e1 = EcuacionLineal(9, 4, 3, -5, -6, -21)
print("ecuacion 1 =", e1)
if e1.TieneSolucion():
    print("X =", e1.getX(), ", Y =", e1.getY())
else:
    print("la ecuacion no tiene solucion")

e2 = EcuacionLineal(1,2,2,4,4,5)
print("ecuacion 2 =", e2)
if e2.TieneSolucion():
    print("X =", e2.getX(), ", Y =", e2.getY())
else:
    print("la ecuacion no tiene solucion")