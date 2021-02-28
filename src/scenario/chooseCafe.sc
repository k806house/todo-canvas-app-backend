theme: /

    state: ВыборКафе
        q!: хочу (в/из/с) кафе
            $AnyText::anyText
            
        script:
            chooseCafe($parseTree._anyText, $context);
        
        go!: /ВыбраноКафе