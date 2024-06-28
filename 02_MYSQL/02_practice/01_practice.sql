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