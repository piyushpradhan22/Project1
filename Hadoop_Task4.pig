Rel_CDPCompletionData_1037786 = LOAD '/Certification_1037786/CDPCompletionStatus' using PigStorage(',') AS (EmpNo:chararray, RoleCapability:chararray, EmpPUCode:chararray, SBUCode:chararray, CertificationCode:chararray, CertificationTitle:chararray, Competency:chararray, CertificationType:chararray, CerttificationGroup:chararray,
ContactBasedProgram_Y_N:chararray, ExamDate:chararray, Onsite_Offshore:chararray, AttendanceStatus:chararray,
Marks:chararray, Result:chararray, Status1:chararray, txtPlanCategory:chararray, SkillID1:chararray, Complexity:chararray);

--DUMP Rel_CDPCompletionData_1037786;

--store Rel_CDPCompletionData_1037786 into '/Pig_data_CDP1037786/CDPCompletionStatus';

split Rel_CDPCompletionData_1037786 into CDP_On_Demand if txtPlanCategory=='On Demand', CDP_Need_Based if txtPlanCategory=='Need Based', CDP_Role_Based if txtPlanCategory=='Role Based';

dump CDP_On_Demand;
dump CDP_Need_Based;
dump CDP_Role_Based;
