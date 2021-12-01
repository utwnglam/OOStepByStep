1. To write a `Person` class, it must have `id`, `name` and `age` attributes, 
and an `introduce` method.
    We judge whether it is the same person by `id` attribute.
    The `introduce` method returns a string like:

    >My name is Tom. I am 21 years old.

2. Write another `Student` class which inherit from the `Person` class. 
    Besides `id`, `name` and `age` attributes, the `Student` class also should have `klass` attributes. 
    There is also an `introduce` method,
    The `introduce` method returns a string like:

    >My name is Tom. I am 21 years old. I am a Student. I am at Class 2.

    The `klass` attribute is an `Object` which has `number` and `leader` attribute.
    But the `leader` attribute is `not` in the constructor.

3. When you build an instance of `Student` you need pass
    the `Klass` instance to the constructor of `Student`.
    You can find more details in the test case.
    The `Klass` has an `assignLeader` method, which will take an instance of `Student` as parameter.
    It means setting that student as the leader of the `Klass`. 
    If the leader of `Klass` is Tom, then Tom calls the `introduce`
    method should return:

    >My name is Tom. I am 21 years old. I am a Student. I am Leader of Class 2.

    If Tom is not the leader, just return the old strings:
    
    >My name is Tom. I am 21 years old. I am a Student. I am at Class 2.

4. Write another `Teacher` class which extends the `Person` class.
    In addition to the `id`, `name`, and `age` attributes,
    it also has `Klass` attribute, and an `introduce` method,
    The `introduce` method should return a string when the `Klass` is not null:

    >My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2.
    
    If the `Klass` is null, it should return：
    
    >My name is Tom. I am 21 years old. I am a Teacher. I teach No Class.

5. Write an introduceWith method in `Teacher` class, pass in a `student` as parameter, such as Jerry, 
    if Jerry is a class taught by Teacher, the return form is as follows:
    
    >My name is Tom. I am 21 years old. I am a Teacher. I teach Jerry.
    
    if not should return：
    
    >My name is Tom. I am 21 years old. I am a Teacher. I don't teach Jerry.

6. `Klass` has an `appendMember` method that accepts an instance of `Student` as parameter.
    This means adding a student to the school class.
    If the student does not join the class, when we call the `assignLeader` method 
    the assignment will not succeed. The `assignLeader` method need to print the following sentence:

    >It is not one of us.
    
    All the subclass of `Person` , should call `Person#introduce` method to get following
    text：
    
    >My name is Tom. I am 21 years old.
    
    caution: try to avoid duplicate code.