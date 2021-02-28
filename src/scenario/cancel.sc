theme: /
 
    state: Отмена 
        q!: (отмен*) [*] || fromState = /food || fromState = /order
        
        script:
            cancel($context);
        
        go!: /Отменяем