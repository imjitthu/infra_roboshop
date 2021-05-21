terraform {
  backend "s3" {
    bucket = "terraform-state-jithendar"
    key    = "rs-instances/catalogue.tfstate"
    region = "us-east-1"
  }
}