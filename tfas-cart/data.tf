terraform {
  backend "s3" {
    bucket = "terraform-state-jithendar"
    key    = "rs-instances/cart.tfstate"
    region = "us-east-1"
  }
}