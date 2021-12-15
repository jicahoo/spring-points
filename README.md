# spring-points
Learn spring points

# 如何积累某种软件技术的经验？
* 一般没有专门的时间学习所有的“鱼”(所有的知识点）。只能慢慢积累，但慢慢积累，你就要熟练在日常工作中的“渔”。想要要日常工作中渔，你就要有方便的环境和工作让你渔。
* 理解该软件技术的基本方向，整体架构和设计思想。权威的资料一定是在官网上，一定是作者给出的介绍。以Spring为例，就是在spring官网上，相关的video介绍->SpringOnePlatform 2017 talks.
* 快速研究代码行为的环境。
  * 稳定的没有墙的网络环境。很慢的网络可能会引起奇奇怪怪的问题，浪费时间。很多时候都要到网络上取数据，最常见的情况就是取第三方依赖包。如果有墙，肯定也会遇到各种问题。
  * 强劲的电脑。如果电脑配置太低，干什么都很慢，就影响心情。
  * 熟练你所用的操作系统。ubuntu。软件的CRUD要懂。
  * 适合的IDE，并且熟悉IDE。JebBrains
  * 版本兼容问题也要搞清楚
  * 常见的代码例子（可运行的）
  * 研究代码的一个小技巧，是再我写的代码里故意抛出异常，看Call Stack。
  * 我们可以按照基本架构看个大概。我们不可能把所有的代码逻辑都走一遍，我们抓住骨架。
  * 我们要用具体和聚焦的简单例子去研究这个框架的实现原理。我们不可能抛开具体用例，直接冲到代码里面看。就像开车一样，我们只有理解开车是什么，才能知道某些车的内部设计为什么是这样。我们不可能直接打开引擎盖，去研究内部结构和原理。每一个赛车手并不是汽车工程师。虽然赛车手还是知道汽车基本知识的。所以我们要那个具体用例，去看这个lib和框架是如何运作完成这个目标的。我们有基本用例去研究基本框架来入门，有高级用例去研究高级功能。
 
* 高效浏览代码的环境
* 专门花时间学习包管理工具（Maven, Gradle...)
* 研究者在研究一些具体代码行为时，设计一个研究代码的流程图？研究者应该打开什么界面，在各个界面中，是如何流转的，以达到研究者的目标的？或者状态图？研究者在研究这个框架的时候处于什么状态，遇到什么问题，如何反应（去google)，如何进去下一个状态, 又是如何进入一个错误的方向的。  
* 在更高层次去看，研究者在从入门到精通？研究者会经历什么，路径什么？什么能证明研究者在一步一步前进，直到精通。

# Tools focusing on code reading
* https://plugins.jetbrains.com/plugin/12304-call-graph
* SourceTrail
* SourceInsight
* SourceGraph
* OpenGrok
* https://codemap.app/
* https://plugins.jetbrains.com/plugin/16701-appmap (also support VS code?)
* https://appland.com/docs/appmap-overview.html
* Online code explore: Github, SourceGraph, OpenGrok (Web).  Fast; Sometimes, we need to explore code online.
* Offline code explore (Download code to your computer): SourceInsight, SourceTrail;  When you haven't download, need time to download it. 
