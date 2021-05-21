terraform {
  backend "s3" {
    bucket = "terraform-state-jithendar"
    key    = "rs-instances/mongo.tfstate"
    region = "us-east-1"
  }
}