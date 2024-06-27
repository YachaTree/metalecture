-- 민트미역국과 같은 카테고리의 메뉴들의 정보를 조회하세요
select
        *
from
        tbl_menu
where
    category_code = (select
                         category_code
                     from
                         tbl_menu
                     where
                         menu_name = '민트미역국');

