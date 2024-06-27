select
    m.menu_code
,   m.menu_name
,   m.category_code
,   c.category_name
from
    tbl_menu m
join
    tbl_category c
on
    m.category_code = c.category_code;

select
        menu_code
     ,  menu_name
     ,  category_code
     ,  category_name
from
        tbl_menu
join
        tbl_category
using
        (category_code);

select
        a.category_name
     ,  b.menu_name
from
        tbl_category a
left join
        tbl_menu b
on
        a.category_code =  b.category_code;

select /*  */
        b.menu_name
     ,  a.category_name
from
        tbl_menu b
right join
        tbl_category a
on
        a.category_code =  b.category_code;
