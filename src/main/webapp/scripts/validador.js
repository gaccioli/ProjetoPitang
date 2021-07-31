

function validar() {
	let nome = frmUsuario.nome_cad.value
	let email = frmUsuario.email_cad.value
	let fone_ddd = frmUsuario.fone_ddd_cad.value
	let fone_numero = frmUsuario.fone_numero_cad.value
	let fone_tipo = frmUsuario.fone_tipo_cad.value
	let senha = frmUsuario.senha_cad.value
	if (nome === "") {
		alert('Preencha o campo Nome')
		frmUsuario.nome_cad.value()
		return false
	} else if (email === "") {
		alert('Preencha o campo Email')
		frmUsuario.email_cad.value()
		return false
		
	} else if (fone_ddd === "") {
		alert('Preencha o campo DDD do Telefone')
		frmUsuario.fone_ddd_cad.value()
		return false
	}
	
	else if (fone_numero === "") {
		alert('Preencha o campo Numero do Telefone')
		frmUsuario.fone_numero_cad.value()
		return false
	}
	
	else if (fone_tipo === "") {
		alert('Preencha o campo do Tipo do Telefone')
		frmUsuario.fone_tipo_cad.value()
		return false
	}
	else if (senha === "") {
		alert('Preencha o campo Senha')
		frmUsuario.senha_cad.value()
		return false
	}
	
	else {
		document.forms["frmUsuario"].submit()
	}
}