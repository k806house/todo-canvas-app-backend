theme: /

    state: ДобавлениеБудильника
        q!: (~добавить|~установить|~поставить) 
            [~будильник|~подъем|~вставайка]
            $AnyText::anyText
            
        script:
            addAlarm($parseTree._anyText, $context);
        
        go!: /ДобавленНовыйБудильник
