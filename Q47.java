
class Window{    public void get() {            }
}

class PMWindow extends Window{    public void get() {    System.out.println("In PMWindow");
}
}

class MotifWindow extends Window{    public void get() {    System.out.println("In MotifWindow");
}
}

class ScrollBar{    public void get() {            }
}

class PMScrollBar extends ScrollBar{    public void get() {    System.out.println("In PMScrollBar");
}
}

class MotifScrollBar extends ScrollBar{    public void get() {    System.out.println("In MotifScrollBar");
}
}

abstract class WidgetFactory{    public abstract ScrollBar CreateScrollBar();    public abstract Window CreateWindow();        
}

[13:35] Sathyanarayanan P S
bro 47 ovr ah bro

