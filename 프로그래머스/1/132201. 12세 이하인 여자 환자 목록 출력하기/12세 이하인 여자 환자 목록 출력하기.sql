# -- 코드를 입력하세요
# SELECT PT_NAME, PT_NO, GEND_CD, AGE, IFNULL(TLNO,'NONE') AS TLNO
# from PATIENT WHERE AGE<=12 AND GEND_CD='W' ORDER BY AGE DESC;

SELECT PT_NAME,	PT_NO,	GEND_CD,AGE,ifnull(TLNO,'NONE') as TLNO
from PATIENT
where (AGE<=12) and (GEND_CD='W')
order by AGE DESC, PT_NAME