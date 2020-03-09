CREATE TABLE public.profiles_table
(
    id bigint ,
    company character varying(255) COLLATE pg_catalog."default",
    department character varying(255) COLLATE pg_catalog."default",
    job_title character varying(255) COLLATE pg_catalog."default",
    skill character varying(255) COLLATE pg_catalog."default",
    username character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT profiles_table_pkey PRIMARY KEY (id)
);



