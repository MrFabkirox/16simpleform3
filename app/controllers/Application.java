package controllers;

import java.util.Arrays;
import java.util.Random;

import models.User;

import play.*;
import play.data.Form;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
    	Random r = new Random();
    	r.nextInt(2);
        return ok(index.render("16simpleform3 "+ r));
    }
    
    final static Form<User> userForm = Form.form(User.class);
    
    public static Result form() {
        return ok(view2.render(userForm));
    }
    
    public static Result show() {
    	Form<User> userFiled = userForm.bindFromRequest();
    	User filed = userFiled.get();
        return ok(view3.render(filed));
    }
    
    
}
