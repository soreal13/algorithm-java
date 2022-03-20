


1번
https://hianna.tistory.com/608
https://blog.naver.com/kkh0977/222266147068

2번
int distance =0;
for(int i=0; i<)


3번
select emp.seq as 'emp_seq', emp.name as 'emp_name', case when dept.name is null then '(발행 전)' else dept.name end as 'dept_name'
from emp emp
left join dept dept on emp.dept_seq = dept.seq
order by emp.seq asc;


4번
select count(*) as '품목수'
from 주문
group by 품목명
where 주문자명 = '홍길동' and date_format(주문일자, %Y-%m-%d) 

5번

select a.담당자명, sum(a.단가 * b.주문수량) as 총주문금액
from
(select 담당자.담당자명, 품목.품목ID, 품목.단가
from 담당자 left join 품목 
on 담당자.담당자ID = 품목.품목 ID) as a
left join 
(select 품목ID, count(*) as 주문수량 
from 주문
where date_format(주문일자, %Y-%m-%d) between date_format(2020-01-01) and date_format(2020-01-31)
group by 품목 ID) as b
on a.품목ID = b.품목ID
where 총주문금액 >= 10000000
order by 총주문금액 desc;


8번 선택정렬 O(N^2)
https://scshim.tistory.com/267