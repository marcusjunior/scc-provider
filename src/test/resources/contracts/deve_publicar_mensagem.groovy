import org.springframework.cloud.contract.spec.Contract

Contract.make {
    label("publicacao_kafka")
    input {
        triggeredBy("publicarMensagem()")
    }
    outputMessage {
        sentTo("v13jy9uz-default")
        body('teste vitor 2')
    }
}