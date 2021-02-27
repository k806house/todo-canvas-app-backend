function addNote(note, context) {
    console.log("PIPISKA");
    addAction({
        type: "add_note",
        note: note
    }, context);
}

function addAlarm(alarm, context) {
    addAction({
        type: "add_alarm",
        alarm: alarm,
        user_id: getRequest(context).rawRequest.uuid.userId,
    }, context);
}

function chooseCafe(cafe, context) {
    console.log(cafe);
    addAction({
        type: "choose_cafe",
        user_id: getRequest(context).rawRequest.uuid.userId,
        cafe: cafe,
    }, context);
    console.log("kekis");
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
