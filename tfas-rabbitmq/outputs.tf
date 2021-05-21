output "rabbitmq_PIP" {
  value = aws_instance.rabbitmq.public_ip
}