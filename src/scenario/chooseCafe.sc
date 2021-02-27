theme: /

    state: ВыборКафе
        q!: выбираю кафе 
            $AnyText::anyText
            
        script:
            chooseCafe($parseTree._anyText, $context);
        
        go!: /ВыбраноКафе
