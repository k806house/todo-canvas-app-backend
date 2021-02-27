function addNote(note, context) {
    addAction({
        type: "add_note",
        note: note
    }, context);
}

function addAlarm(alarm, context) {
    addAction({
        type: "add_alarm",
        alarm: alarm,
        user_id: getRequest(context).rawRequest.uuid.userId
    }, context);
}

function chooseCafe(cafe, context) {
    addAction({
        type: "choose_cafe",
        user_id: getRequest(context).rawRequest.userId,
        cafe: cafe
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
