theme: /

    state: ДобавлениеБудильника
        q!: (~добавить|~установить|~поставить) 
            [~будильник|~подъем|~вставайка]
            $AnyText::anyText
            
        script:
            addNote($parseTree._anyText, $context);
        
        go!: /ДобавленНовыйБудильник
