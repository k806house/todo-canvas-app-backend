theme: /food

    state: ВыборБлюда
        q!: выбираю завтрак || fromState = /
            $AnyText::anyText
            
        script:
            chooseFood($parseTree._anyText, $context);
        
        go!: /ВыбраноБлюдо