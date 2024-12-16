--liquidbase formatted sql
--changeset Bukevsky:20241124-00-0-create-journal-tu152.sql
--comment Создание таблицы журнала ТУ-152

CREATE TABLE IF NOT EXISTS locomotive_technical_state_log (
    id BIGSERIAL PRIMARY KEY,         -- Идентификатор записи
    date DATE,                        -- Дата
    direction VARCHAR(255),           -- Направление
    train VARCHAR(255),               -- Номер поезда
    weight INT,                       -- Вес
    axles VARCHAR(255),               -- Оси
    acceptance_time TIME,             -- Время приемки
    arrival_driver VARCHAR(255),      -- Водитель на прибытие
    arrival_assistant VARCHAR(255),   -- Помощник на прибытие
    arrival_time TIME,                -- Время прибытия
    departure_driver VARCHAR(255),    -- Водитель на отправление
    departure_assistant VARCHAR(255), -- Помощник на отправление
    departure_time TIME,              -- Время отправления
    fuel_option VARCHAR(255),         -- Опция топлива
    electricity_reading VARCHAR(255), -- Показания электричества
    fuel_amount INT,                  -- Количество топлива
    comments TEXT,                    -- Комментарии
    signature_given BOOLEAN,          -- Подпись дана
    signature_received BOOLEAN,       -- Подпись получена
    repair_date DATE,                 -- Дата ремонта
    position VARCHAR(255),            -- Позиция
    signature BOOLEAN
    );

comment on table locomotive_technical_state_log is 'Журнал ТУ-152';
COMMENT ON COLUMN locomotive_technical_state_log.id IS 'Уникальный идентификатор записи';
COMMENT ON COLUMN locomotive_technical_state_log.date IS 'Дата записи в журнале';
COMMENT ON COLUMN locomotive_technical_state_log.direction IS 'Направление движения';
COMMENT ON COLUMN locomotive_technical_state_log.train IS 'Номер поезда';
COMMENT ON COLUMN locomotive_technical_state_log.weight IS 'Вес состава (в тоннах)';
COMMENT ON COLUMN locomotive_technical_state_log.axles IS 'Количество осей состава';
COMMENT ON COLUMN locomotive_technical_state_log.acceptance_time IS 'Время приемки локомотива';
COMMENT ON COLUMN locomotive_technical_state_log.arrival_driver IS 'Имя водителя прибывающего состава';
COMMENT ON COLUMN locomotive_technical_state_log.arrival_assistant IS 'Имя помощника водителя прибывающего состава';
COMMENT ON COLUMN locomotive_technical_state_log.arrival_time IS 'Время прибытия состава';
COMMENT ON COLUMN locomotive_technical_state_log.departure_driver IS 'Имя водителя отправляющегося состава';
COMMENT ON COLUMN locomotive_technical_state_log.departure_assistant IS 'Имя помощника водителя отправляющегося состава';
COMMENT ON COLUMN locomotive_technical_state_log.departure_time IS 'Время отправления состава';
COMMENT ON COLUMN locomotive_technical_state_log.fuel_option IS 'Опция топлива (например, дизель или электричество)';
COMMENT ON COLUMN locomotive_technical_state_log.electricity_reading IS 'Показания электроэнергии';
COMMENT ON COLUMN locomotive_technical_state_log.fuel_amount IS 'Количество топлива (в литрах)';
COMMENT ON COLUMN locomotive_technical_state_log.comments IS 'Примечания или комментарии';
COMMENT ON COLUMN locomotive_technical_state_log.signature_given IS 'Подтверждение подписи передающей стороны';
COMMENT ON COLUMN locomotive_technical_state_log.signature_received IS 'Подтверждение подписи принимающей стороны';
COMMENT ON COLUMN locomotive_technical_state_log.repair_date IS 'Дата ремонта';
COMMENT ON COLUMN locomotive_technical_state_log.position IS 'Позиция локомотива';
COMMENT ON COLUMN locomotive_technical_state_log.signature IS 'Итоговая подпись';