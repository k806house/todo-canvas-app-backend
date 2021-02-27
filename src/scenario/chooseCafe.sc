theme: /

    state: ВыборКафе
        q!: (~хотеть|~выбрать|~давать) 
            $AnyText::anyText
            
        script:
            chooseCafe($parseTree._anyText, $context);
        
        go!: /ВыбраноКафе
