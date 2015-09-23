package controllers;


import models.Task;
import play.*;
import play.mvc.*;
import play.data.*;

import views.html.*;

import  play.data.Form;

public class Application extends Controller {


    Form<Task> taskForm = Form.form(Task.class);
    public Task task = new Task();

    public Result index() {
        return redirect(routes.Application.tasks());//redirect the request to the index method
    }

    public Result hello(String name){
        return ok(views.html.hello.render(name));
    }

    public Result hello2(String welcomeMessage){
        return ok(views.html.hello2.render(welcomeMessage));
    }
    
    public Result login(){
        return ok();
    }



    //tasks
    public  Result tasks() {
        return ok(
                views.html.index.render(task.all(), taskForm)
        );
    }


    public  Result newTask() {
        Form<Task> filledForm = taskForm.bindFromRequest();
        if(filledForm.hasErrors()) {
            return badRequest(
                    views.html.index.render(task.all(), filledForm)
            );
        } else {
            Task.create(filledForm.get());
            return redirect(routes.Application.tasks());
        }
    }

    public  Result deleteTask(Long id) {
        return TODO;
    }

}

