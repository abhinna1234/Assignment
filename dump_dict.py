import yaml
class test:
    def __init__(self, testid):
        self.__TESTID=testid
    def __iter__(self):
        yield 'TESTID', self.__TESTID
class Employee:
    # Initialize Employee object
    def __init__(self, ID, name, department, job, test):
        self.__name = name
        self.__ID = ID
        self.__department = department
        self.__job = job
        self.__test = dict(test)
    # Set each object
    def set_name(self, name):
        self.__name = name

    def set_ID(self, ID):
        self.__ID = ID

    def set_dept(self, department):
        self.__department = department

    def set_job(self, job):
        self.__job = job

    # Get each object
    def get_name(self):
        return self.name

    def get_ID(self):
        return self.__ID

    def get_department(self):
        return self.__department

    def get_job(self):
        return self.__job

    def __iter__(self):
        yield 'ID', self.__ID
        yield 'Name', self.__name
        yield 'Department', self.__department
        yield 'Job', self.__job
        yield 'test', self.__test

emps = [] 
emp = Employee(1,"Anil", "DEPT1","Engineer", test("MYTEST"))
emps.append(dict(emp))
emp1 = Employee(1,"Abhinna", "DEPT2","Engineer", test("TEST2"))
emps.append(dict(emp1))

with open('result.yml', 'w') as yaml_file:
    yaml.dump(emps, yaml_file, default_flow_style=False)
