theme: /

    state: Кафе

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
            
    state: Заказ
     	q!: * [хочу] [сделать] заказ
     	a: Сначала выберем заведение, откуда доставим завтрак!
     	go!: /Кафе