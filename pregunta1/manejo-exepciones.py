"""
    Ejemplos de manejo de exepciones
"""

# try:

print("Ingrese las edades de estudiantes")

limite = input("Ingrese el numero de estudiantes\n")
limite = int(limite)
suma = 0
contador = 1

while(contador <= limite):
    edad = input("Ingrese la edad del estudiante %d: \n" % contador)
    edad = int(edad)
    suma = suma + edad
    contador = contador + 1
promedio = suma / limite
print("El valor promedio de edades es %f" % (promedio))
# except NameError as e:
#     print("Existe un error:(%s): %s" % (e.__class__, e))
# 
# except ValueError as e:
#     print("Existe un error (%s): %s" % (e.__class__, e))
# 
# except ZeroDivisionError as e:
#     print("Existe un error (%s): %s" % (e.__class__, e))
# 
# except Exception as e:
#    print("Existe un error (%s): %s" % (e.__class__, e))
