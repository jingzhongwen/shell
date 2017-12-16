<h1>命令行程序模版</h1>
<h2>需要<h2>
1.java6及以上<br>
2.mvn2以上<br>
<h2>使用方式</h2>
1.在工程下运行:<code>mvn archtype:create-from-project</code><br>
2.到generated-sourced/archetype下执行<code>mvn install/deploy</code><br>
3.通过命令行或者IDE创建工程<br>
<h2>特性</h2>
1.使用maven-assembly-plugin把相关jar和script一起打包<br>
2.简单的java启动脚本，将所有classpath加入，并且运行<br>
3.使用common-cli处理命令行参数<br>
<h2>建议</h2>
1.适用于命令行工具类项目，比如数据库迁移<br>
2.命令行项目尽量保持简单，复杂情况可以通过管道来实现<br>

