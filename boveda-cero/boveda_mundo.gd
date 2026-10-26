extends Node2D

@onready var boveda_recursos: BovedaRecursos = $BovedaRecursos
@onready var panel_control: PanelControl = $PanelControl
@onready var negociador: Ladron = $Negociador

func _process(delta: float) -> void:
	if negociador and negociador.velocity.x != 0:
		boveda_recursos.consumir_stamina(15.0 * delta)
	
	if panel_control and negociador:
		panel_control.actualizar_hud(negociador.salud, int(boveda_recursos.stamina_disponible))
