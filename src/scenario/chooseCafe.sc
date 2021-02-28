theme: /

    state: ВыборКафе
        q!: хочу в кафе
            $AnyText::anyText
            
        script:
            chooseCafe($parseTree._anyText, $context);
        
        go!: /ВыбраноКафе