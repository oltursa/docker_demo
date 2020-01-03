Vagrant.configure("2") do |config|
  config.vm.box = "ubuntu/bionic64"
  config.vm.provision "shell", path: 'init.sh'
  config.vm.synced_folder "./proyecto" , "/home/vagrant/oscar", type: "virtualbox"
  # config.vm.provision "shell", inline: <<-SHELL
  #   apt-get update
  #   apt-get install -y nginx
  # SHELL
end