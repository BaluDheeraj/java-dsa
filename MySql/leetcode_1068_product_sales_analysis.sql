--Write your MySQL query statement below
select year ,price,product_name
 from sales s left join product p 
 on s.product_id=p.product_id;

 
