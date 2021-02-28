function addNote(note, context) {
    addAction({
        type: "add_note",
        note: note
    }, context);
}

function doneNote(id, context){
    addAction({
        type: "done_note",
        id: id
    }, context);
}

function deleteNote(id, context){
    addAction({
        type: "delete_note",
        id: id
    }, context);
}

function chooseCafe(cafe, context) {
    addAction({
        type: "choose_cafe",
        user_id: getRequest(context).uuid.userId,
        cafe: cafe
    }, context);
}

function chooseFood(food, context) {
    addAction({
        type: "choose_food",
        user_id: getRequest(context).uuid.userId,
        food: food
    }, context);
}

function checkout(order, context) {
    addAction({
        type: "checkout",
        user_id: getRequest(context).uuid.userId,
        order: order
    }, context);
}


function cancel(id, context) {
    addAction({
        type: "cancel",
        id: id
    }, context);
}