1. To write a `Person` class, it must have `name` and `age` attributes, and an `introduce` method.
    The `introduce` method returns a string like:

    >My name is Tom. I am 21 years old.

2. Write another `Student` class which inherit from the `Person` class. 
    Besides `name` and `age` attributes, the `Student` class also should have `klass` attributes. 
    There is also an `introduce` method,
    The `introduce` method returns a string like:

    >My name is Tom. I am 21 years old. I am a Student. I am at Class 2.

3. Write another `Teacher` class which inherit from the `Person` class. 
    Besides `name` and `age` attributes, the `Teacher` class also should have`klass` attributes. 
    There is also an `introduce` method,
    if the `klass` attribute is null , the `introduce` should return:
    >My name is Tom. I am 21 years old. I am a Teacher. I teach No Class.

    otherwise, the `introduce` should return:

    >My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2.

    All the subclass `introduce` method 
    should get the following sentence from `Person#inroduce`
    
    >My name is Tom. I am 21 years old.


