terraform {
  backend "s3" {
    bucket = "terraform-state-jithendar"
    key    = "rs-instances/rabbitmq.tfstate"
    region = "us-east-1"
  }
}