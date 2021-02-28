theme: /

    state: ВыборКафе
        q!: хочу в кафе
            (Чебуречная СССР|Lambic)
            
        script:
            chooseCafe($parseTree._anyText, $context);
        
        go!: /ВыбраноКафе