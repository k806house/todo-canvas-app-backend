theme: /order

    state: ВыборБлюда
        q!: оформить заказ || fromState = /food
            $AnyText::anyText
            
        script:
            checkout($parseTree._anyText, $context);
        
        go!: /ЗаказОформлен