1 安装环境

首先，安装 Docker（社区版

yum install -y docker-ce  # 安装docker

systemctl start docker    # 启动docker服务

2.拉取服务端Docker

docker pull kiraimai/genshin-server:V3.4

5.git clone 本项目

6.cd到项目路径

7.修改docker-start.sh

docker run -dit \

-v /home/misakimei/CTOS/Genshin-Server:/var/grasscutter \ #改为自己项目路径名称

--name=GenshinServer \

--net=host \

-v /sys/fs/cgroup:/sys/fs/cgroup \

--restart always \

--privileged=true kiraimai/genshin-server:V3.4 /bin/bash


8.启动docker-start.sh

9.启动守护进程service-start.sh

10.打开本地http://[Your IP address]:9001/查看状态

11.进入守护进程查看服务端后台

supervisorctl

grasscutter                      RUNNING   pid 691, uptime 0:04:36

proxy                            RUNNING   pid 692, uptime 0:04:36

fg grasscutter 

输入help查看指令
