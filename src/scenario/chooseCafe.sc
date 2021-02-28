theme: /

    state: ВыборКафе
        q!: {[(выбир*/выбр*) $cafe]
        		 [хочу (в/из/с) $cafe]
        	 	 [го в $cafe]
        	 	 [* давай в $cafe]
        	     [* закажи (в/из/с) $cafe]
        	     [$cafe]
            $AnyText::anyText
            
        script:
            chooseCafe($parseTree._anyText, $context);
        
        go!: /ВыбраноКафе