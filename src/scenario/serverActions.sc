# Когда приходит ServerAction, сообщение прилетает в состояние, 
# с условием на вход action_id.
# пример:
#     event!: action_id

theme: /
    
    state: ЗаданиеВыполнено
        event!: done
        event!: DONE

        random: 
            a: Молодец!
            a: Красавичка!
            a: Супер

        buttons:
            "Запиши купить молоко"
            "Добавь запись помыть машину" 

           
    state: ДобавленаНоваяЗапись
        event!: note_added
        event!: NOTE_ADDED

        random: 
            a: Добавлено!
            a: Сохранено!
            a: Записано!
        
        buttons:
            "Запиши купить молоко"
            "Добавь запись помыть машину" 
            
    state: ДобавленНовыйБудильник
        event!: alarm_added
        event!: ALARM_ADDED

        random: 
            a: Океюшки!
        
        buttons:
            "Поставь будильник на 7:40"
            
    state: ВыбраноКафе
        event!: cafe_chosen
        event!: CAFE_CHOSEN

        random: 
            a: Океюшки!
            a: Заебись!
            a: Понял, братишка!
        
        buttons:
            "Хочу чебуречную"