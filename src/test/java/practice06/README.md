1. To write a `Person` class, it must have `name` and `age` attributes, and an `introduce` method.
    The `introduce` method returns a string like:

    >My name is Tom. I am 21 years old.

2. Write another `Student` class which inherit from the `Person` class. 
    Besides `name` and `age` attributes, the `Student` class also should have `klass` attributes. 
    There is also an `introduce` method,
    The `introduce` method returns a string like:

    >My name is Tom. I am 21 years old. I am a Student. I am at Class 2.

    The `klass` attribute is an `Object` which has `number` attribute.
    When you build the `Student` you should pass an instance of `Klass` to `Student` class.

3. Write another `Teacher` class which inherit from the `Person` class. 
    Besides `name` and `age` attributes, the `Teacher` class also should have`klass` attributes. 
    There is also an `introduce` method,
    if the `klass` attribute is null , the `introduce` should return:
    >My name is Tom. I am 21 years old. I am a Teacher. I teach No Class.

    otherwise, the `introduce` should return:

    >My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2.

4. Write an introduceWith method in `Teacher` class, pass in a `student` as parameter, such as Jerry, 
    if Jerry is a class taught by Teacher, the return form is as follows:
    
    >My name is Tom. I am 21 years old. I am a Teacher. I teach Jerry.
    
    if not should return：
    
    >My name is Tom. I am 21 years old. I am a Teacher. I don't teach Jerry.
    
    All the subclass of `Person` , should call `Person#introduce` method to get following
    text：
    
    >My name is Tom. I am 21 years old.
    
    caution: try to avoid duplicate code.
