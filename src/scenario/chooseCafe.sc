theme: /

    state: ВыборКафе
        q!: (~кафе) 
            $AnyText::anyText
            
        script:
            chooseCafe($parseTree._anyText, $context);
        
        go!: /ВыбраноКафе
