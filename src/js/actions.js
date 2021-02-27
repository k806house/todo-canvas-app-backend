function addNote(note, context) {
    console.log(getRequest(context))
    addAction({
        type: "add_note",
        note: note
    }, context);
}

function addAlarm(alarm, context) {
    addAction({
        type: "add_alarm",
        alarm: alarm,
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