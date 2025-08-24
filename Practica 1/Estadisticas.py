class Estadistica:
    def __init__(self, numeros):
        self._numeros = numeros

    def promedio(self):
        suma = 0
        for num in self._numeros:
            suma = suma + num
        return suma / 10 # n = 10

    def desviacion(self):
        prom = self.promedio()
        suma_cuadrados = 0
        for num in self._numeros:
            suma_cuadrados = suma_cuadrados + (num - prom) ** 2
        return (suma_cuadrados / 9) ** 0.5  # n-1 = 9

    def __str__(self):
        return "estadistica [{}]". \
            format(self._numeros)


# Programa de prueba
print(" Estadistica ")
datos = [1.9, 2.5, 3.7, 2, 1, 6, 3, 4, 5, 2]

estadistica = Estadistica(datos)
print("Datos:", estadistica)
print("El promedio es", estadistica.promedio())
print("La desviación estándar es", estadistica.desviacion())