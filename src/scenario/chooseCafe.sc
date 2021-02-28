theme: /

    state: ВыборКафе
        q!: [* хочу (в/из/с) кафе]
            [* (выбир*/выбр*) [в/из/с] кафе]
            [(го/давай) [в/из/с] кафе]
            [* закажи (в/из/с) кафе]
            $AnyText::anyText
            
        script:
            chooseCafe($parseTree._anyText, $context);
        
        go!: /ВыбраноКафе