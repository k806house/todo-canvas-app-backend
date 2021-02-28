require: slotfilling/slotFilling.sc
  module = sys.zb-common
  
# Подключение javascript обработчиков
require: js/getters.js
require: js/reply.js
require: js/actions.js
require: js/findItem.js

# Подключение сценарных файлов
require: scenario/addNote.sc
require: scenario/doNote.sc
require: scenario/chooseCafe.sc
require: scenario/chooseFood.sc
require: scenario/order.sc
require: scenario/cancel.sc
require: scenario/deleteNote.sc
require: scenario/serverActions.sc


patterns:
    $AnyText = $nonEmptyGarbage
    
    # Паттерны для запуска сценария
    $OpenSkipWords = (хочу|мне|мое|моё|пожалуйста|в|прошу|тебя|может|с)
    $OpenKeyWords = (включи|включить|включай|запусти|запустить|запускай|играть|
        поиграть|поиграем|навык|игра|игру|скил|скилл|приложение|апп|сыграем|
        открой|поиграй со мной|сыграть|давай играть|активируй|давай|поиграем)
    $projectName = (Завтра завтрак)
    $cafe = (кафе*/ресторан*/заведение/бистро/трактир/харчевн*/пельмен*/чебуречн*/кофейн*/жевальн*)


theme: /
    state: Запуск
        # При запуске приложения с кнопки прилетит сообщение /start.
        q!: $regex</start>
        
        # При запуске приложения с голоса прилетит сказанная фраза.
        q!: [$repeat<$OpenSkipWords>] 
            $repeat<$OpenKeyWords>
            [$repeat<$OpenSkipWords>] 
            $projectName
            
        a: Начнём!
        a: Мы привезем тебе завтрак в выбранное время и разбудим незадолго до прибытия курьера. Тебе нужно выбрать заведение, затем выбрать блюда на завтрак и конечно указать время и место доставки.


    state: Fallback
        event!: noMatch
        a: Я не понимаю.
