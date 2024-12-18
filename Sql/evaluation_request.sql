create table if not exists evaluation_request(
correlation_id bigint not null,
order_id varchar(255) null,
payment_link varchar(255) null,
payment_type varchar(255) null,
office_der_email varchar(255) null,
email_to_client varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint evaluation_request_pk primary key(correlation_id));