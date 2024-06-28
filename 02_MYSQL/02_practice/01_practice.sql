select * from TB_DEPARTMENT; --  학과테이블
select * from TB_STUDENT; -- 학생테이블
select * from TB_PROFESSOR; -- 교수테이블
select * from TB_CLASS; -- 수업테이블
select * from TB_CLASS_PROFESSOR; -- 수업교수테이블
select * from TB_GRADE; -- 학점테이블


SELECT
        STUDENT_NAME
FROM
        tb_student
WHERE
        ABSENCE_YN = 'Y' AND SUBSTR(STUDENT_SSN, 8, 1) = 2 AND DEPARTMENT_NO = (
            SELECT
                    DEPARTMENT_NO
            FROM
                    tb_department
            WHERE tb_department.DEPARTMENT_NO = '001'
    );

SELECT
        DEPARTMENT_NAME
    ,   CATEGORY
FROM
        tb_department
WHERE
        CAPACITY >= 20 AND CAPACITY <=30;

SELECT
        PROFESSOR_NAME
FROM
        tb_professor
WHERE
        DEPARTMENT_NO IS NULL;

SELECT
        DEPARTMENT_NO
FROM
        tb_student
WHERE
        DEPARTMENT_NO IS NULL;

SELECT
        CLASS_NO
FROM
        tb_class
WHERE
        PREATTENDING_CLASS_NO IS NOT NULL;

SELECT
        CATEGORY
FROM
        tb_department
GROUP BY
        CATEGORY
ORDER BY
        CATEGORY ASC ;

SELECT
        STUDENT_NO
     ,  STUDENT_NAME
    ,   STUDENT_SSN
FROM
        tb_student
WHERE
        ABSENCE_YN = 'N' AND SUBSTR(ENTRANCE_DATE, 3,2) = '19' AND SUBSTR(STUDENT_ADDRESS,1,2) = '전주'
ORDER BY
        STUDENT_NAME ASC ;

