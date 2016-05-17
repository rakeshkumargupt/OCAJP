import java.io.*;
class ExceptionWithConstructorBase{
 public ExceptionWithConstructorBase() throws RuntimeException{}

}

class ExceptionWithConstructor extends ExceptionWithConstructorBase{
 public ExceptionWithConstructor() {}
}