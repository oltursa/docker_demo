oscar@192.168.1.176
denjos@192.168.1.141

https://www.youtube.com/watch?v=hY6pthfoNjw
kitty
ssh-keygen
ssh-copy-id -i <file> <server>
oscar



boxes, paquete para vagrant enviroments
vagrant box list

vagrant box add <name>
vagrant init {title}
vagrant up
---------------------------------------------
vagrant ssh
vagrant halt
vagrant destroy



-- vagrant debe ejecutarse en forma no interactiva
aprovisonamiento
sudo apt purge nginx
------------ docker
sudo apt-get install apt-transport-https ca-certificates curl gnupg-agent software-properties-common
curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -
sudo apt-key fingerprint 0EBFCD88
sudo add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable"
sudo apt-get install -y docker-ce docker-ce-cli containerd.io
sudo usermod -aG docker ${USER}

---------------------------------------- docker comandos
docker run -it ubuntu


docker, crear contenedores ligeros
vagrant, facilita la creacion de vm 


APROVICIONAMIENTO, -provision
vagrant provision

vagrant reload


config.vm.box - operating system
config.vm.provider - virtualbox
config.vm.network - how your host sees your box
config.vm.synced_folder - how you access files from your computer
config.vm.provision - what we want setup



https://www.youtube.com/watch?v=kDGy4CVW4N0