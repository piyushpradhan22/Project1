Rel_CertificationDetails_1037786 = LOAD '/Certification_1037786/CertificationDetails' using PigStorage(',') AS (CertificationOwner:chararray, CertificationCode:chararray, Certificationtitle:chararray, 
CompetencyDimension:chararray, CertficationType:chararray, ComplexityLevel:chararray);

--DUMP Rel_CertificationDetails_1037786;
store Rel_CertificationDetails_1037786 into '/Pig_data_Cert1037786/CertificationDetails';

cert_external = filter Rel_CertificationDetails_1037786 by CertficationType=='External';

--dump cert_external;

store cert_external into '/Pig_data_Cert1037786/cert_external';

