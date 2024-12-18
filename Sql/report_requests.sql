create table if not exists report_requests(
request_count bigint not null,
correlation_id bigint null,
additional_report_charges varchar(255) null,
office_manager_email varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint report_requests_pk primary key(request_count));