1. To write a `Person` class, it must have `name` and `age` attributes, and an `introduce` method.
    The `introduce` method returns a string like:

    >My name is Tom. I am 21 years old.

2. Write another `Student` class which inherit from the `Person` class. 
    Besides `name` and `age` attributes, the `Student` class also should have `klass` attributes. 
    There is also an `introduce` method,
    The `introduce` method returns a string like:

    >My name is Tom. I am 21 years old. I am a Student. I am at Class 2.

3. Write another `Worker` class which inherit from the `Person` class,
    But it only has `name` and `age` attributes. 
    There is also an `introduce` method,
    The `introduce` method returns a string like:
    
    >My name is Tom. I am 21 years old. I am a Worker. I have a job.
    
    The following sentence in the three class：should get from `Person#introduce` method
    
    >My name is Tom. I am 21 years old.
