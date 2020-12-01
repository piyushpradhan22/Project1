create database CertificationDB_1037786;
use CertificationDB_1037786;

create table CertificationDetails (CertificationOwner varchar(20), CertificationCode varchar(20), Certificationtitle varchar(80), 
CompetencyDimension varchar(15), CertficationType varchar(15), ComplexityLevel varchar(15));

create table CDPCompletionStatus (EmpNo int, RoleCapability varchar(80), EmpPUCode varchar(15), SBUCode varchar(30), CertificationCode varchar(100),
CertificationTitle varchar(100), Competency varchar(20), CertificationType varchar(20), CerttificationGroup varchar(20),
ContactBasedProgram_Y_N varchar(20), ExamDate varchar(30), Onsite_Offshore varchar(20), AttendanceStatus varchar(20),
Marks int, Result varchar(20), Status1 varchar(20), txtPlanCategory varchar(20), SkillID1 int, Complexity varchar(20)); 
show tables;

#alter table CertificationDetails change CertificationOwner CertificationOwner longtext;
alter table CDPCompletionStatus add (test  date);
#alter table CDPCompletionStatus drop column test;

update CDPCompletionStatus set RoleCapability = 'Principal - Education_ Training & Assessment' where EmpNo='682970' and EmpNo='63712';

drop table CDPCompletionStatus;
select * from CertificationDetails;
select * from CDPCompletionStatus;
show databases;