theme: /food

    state: ВыборБлюда
        q!: выбираю завтрак || fromState = /Кафе/ВыборКафе
            $AnyText::anyText
            
        script:
            chooseFood($parseTree._anyText, $context);
        
        go!: /ВыбраноБлюдо