# IBM MQ JMS application development with Spring Boot

## Pre-request

* Java
* Docker

### Spring Init

* Web

<hr/>
## Create and launch local MQ Server via docker.
`docker run --env LICENSE=accept --env MQ_QMGR_NAME=QM1 --publish 1414:1414 --publish 9443:9443 --detach ibmcom/mq`
<hr/>
## Infos of local MQ Server
`docker ps`
<table><tr>
<td>CONTAINER ID</td>
<td>COMMAND</td>
<td>IMAGE</td>
<td>CREATED</td>
<td>STATUS</td>
<td>PORTS</td>
<td>NAMES</td>
</tr><tr>
<td>62de47eb2a0e</td>
<td>ibmcom/mq</td>
<td>"runmqdevserver"</td>
<td>15 seconds ago</td>
<td>Up 13 seconds</td>
<td>0.0.0.0:1414->1414/tcp, 0.0.0.0:9443->9443/tcp, 9157/tcp</td>
<td>distracted_euler</td>
</tr>
</table>