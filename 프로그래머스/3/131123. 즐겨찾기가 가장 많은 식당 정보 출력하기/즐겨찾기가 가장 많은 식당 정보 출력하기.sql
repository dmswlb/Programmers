-- 코드를 입력하세요
SELECT A.FOOD_TYPE, B.REST_ID, B.REST_NAME, A.FAVORITES
FROM (
    SELECT FOOD_TYPE, MAX(FAVORITES) FAVORITES
    FROM REST_INFO
    GROUP BY 1
    ) A JOIN REST_INFO B ON A.FOOD_TYPE = B.FOOD_TYPE AND A.FAVORITES = B.FAVORITES
ORDER BY 1 DESC;

/*
select A.foodtype, restid, restname, A.favorites
from restinfo as A inner join (select foodtype, max(favorites) as favorites from restinfo group by foodtype) as B
on A.foodtype=B.foodtype and A.favorites=B.favorites
order by foodtype desc*/