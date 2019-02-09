insert into roles (`id`, `name`) values (1, 'USER');
insert into roles (`id`, `name`) values (2, 'ADMIN');

insert into users (`id`, `name`, `email`, `password`, `local_date_time`) values (1, 'name1', 'email1', '{noop}password1', now());

insert into users_roles (`user_id`, `role_id`) values (1, 1);
insert into users_roles (`user_id`, `role_id`) values (1, 2);