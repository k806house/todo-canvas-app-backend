theme: /

    state: Кафе

    	state: ВыборКафе
        	q!: {[(выбир*/выбр*) $cafe]
        		 [хочу (в/из/с) $cafe]
        	 	 [го в $cafe]
        	 	 [* давай в $cafe]
        	     [* закажи (в/из/с) $cafe]
        	     [$cafe]
                 $AnyText::anyText}
            
        	script:
            	chooseCafe($parseTree._anyText, $context);
        
        	go!: /ВыбраноКафе

        state: КакиеКафе
        	q!: [* (какие/что) есть]
        	    [* (посоветуй/советуешь/совет) *]
        	    [* (предложить/предложишь) *]
        	a: У нас есть 
        	go!: /Кафе/ВыборКафе

    state: Заказ
     	q!: [хочу] [сделать] заказ
     	a: Сначала выберем заведение, откуда доставим завтрак!
     	go!: /Кафе
ы