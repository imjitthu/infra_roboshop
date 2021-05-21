variable "INSTANCE_TYPE" {
    default = ""
}

variable "R53_ZONE_ID" {}

variable "DOMAIN" {default = ""}

variable "COMPONENT" {}
variable "AMI" {}
variable "PASSWORD" {}
variable "USER" {}
variable "ERLANG" {
    default = "https://packages.erlang-solutions.com/erlang/rpm/centos/7/x86_64/esl-erlang_23.0-1~centos~7_amd64.rpm"
}
variable "RABBITMQ" {
    default = "https://packagecloud.io/install/repositories/rabbitmq/rabbitmq-server/script.rpm.sh"
}

