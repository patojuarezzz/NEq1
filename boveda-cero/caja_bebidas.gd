class_name CajaBebidas extends Area2D

@export var recarga_stamina: float = 10.0

func _ready() -> void:
	body_entered.connect(_on_body_entered)

func _on_body_entered(body: Node2D) -> void:
	if body is Ladron:
		var boveda = get_parent().get_node_or_null("BovedaRecursos")
		if boveda:
			boveda.recargar_stamina(recarga_stamina)
