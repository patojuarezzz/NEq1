class_name BovedaRecursos extends Node2D

@export var stamina_disponible: float = 100.0

func obtener_stamina() -> int:
	return int(stamina_disponible)

func recargar_stamina(cantidad: float) -> void:
	stamina_disponible = clamp(stamina_disponible + cantidad, 0.0, 100.0)

func consumir_stamina(cantidad: float) -> bool:
	if stamina_disponible >= cantidad:
		stamina_disponible -= cantidad
		return true
	return false
