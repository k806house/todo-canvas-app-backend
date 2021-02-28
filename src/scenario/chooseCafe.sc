theme: /

    state: ВыборКафе
        q!: [* хочу (в/из/с)] 
            [* (выбер*/выбир*/выбр*) [в/из/с]]
            [(го/давай) [в/из/с]]
            [* закажи (в/из/с)]
            кафе
            $AnyText::anyText
            
        script:
            chooseCafe($parseTree._anyText, $context);
        
        go!: /ВыбраноКафе