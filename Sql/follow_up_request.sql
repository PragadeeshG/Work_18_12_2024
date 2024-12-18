create table if not exists follow_up_request(
correlation_id bigint not null,
payment_id varchar(255) null,
initial_evaluation_completed_date varchar(255) null,
payment_status varchar(255) null,
follow_up_appointment_date varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint follow_up_request_pk primary key(correlation_id));