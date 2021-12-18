# spring-points
Learn spring points

# 如何积累某种软件技术的经验？
* 一般没有专门的时间学习所有的“鱼”(所有的知识点）。只能慢慢积累，但慢慢积累，你就要熟练在日常工作中的“渔”。想要要日常工作中渔，你就要有方便的环境和工作让你渔。
* 之所以长进的慢，就是因为懒惰，不愿意研究和总结“渔”的技术，就用已有的渔技术干活，不注意在日常工作中探索新的渔的技术。譬如说IntelliJ那么多功能，你只会刚开始学的那点。
* 理解该软件技术的基本方向，整体架构和设计思想。权威的资料一定是在官网上，一定是作者给出的介绍。以Spring为例，就是在spring官网上，相关的video介绍->SpringOnePlatform 2017 talks.
* 快速研究代码行为的环境。
  * 最快的速度，可能还是大牛给你讲清楚。如果的记忆够好，你就不用再看源代码了。记忆不好你还得看看源代码。
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
  * 下载代码，环境准备的过程略去，假设代码环境已经配好，在IDE里，有个可编译和可运行的代码，二进制的构件也可以匹配到源代码。如果没有，就要专门花精力整理好。
  * 应当有个地方记录note, note里还可以放截图，可以画图。最好两个大屏幕。1. IDE ,  2. Offical Reference Doc (例如spring refrence doc:https://docs.spring.io/spring-framework/docs/5.3.14/reference/pdf/core.pdf) 3.  Word to record note and Google for searching; 4. Git to manage the code and store the notes. 5. Other code reading tool: SourceTrail? SourceInsight? Linux Tool? 4. Run/Debug env. some times we can't run the code in IDE.
  * 探索代码的时候，常见的问题。我脑海里，现在毫无想法。头脑风暴（胡扯）一下。问题可能分不同层次，高层次：系统是如何启动的，系统是如何关闭的。低层次：找到了一个感兴趣的函数，到这个函数的调用栈，调用这个函数的源头是什么。不同语言的问题不一样，如果是python, 你可能还要问这个变量的类型是什么。遇到实在不理解的地方，是要跳过去还是要去Google?
  * 如何回答上面的工具？什么思路，什么工具。
  * 探索代码一些技巧。静态探索：用可视化工具看调用关系,如SourceTrail，动态探索：在目标点抛异常，看stack.
  * 代码的复杂度到是多少？复杂到很难看懂？那说明这也不是一份好代码。能不看就不看吧。著名的项目都是要管控复杂度的，听说Linux的源码函数的平均行数很短。
  * 代码的复杂度在哪里？抽象？面向对象的抽象层次越多越复杂。可能你没能掌握面向对象，所以看不懂人家写的面向对象的代码。
  * 如果编程语言是动态语言，像Python, 可能复杂度更高，因为缺乏类型信息。所以Python并不适合大型项目。
  * 圈复杂度。
  * 类的继承深度，类的成员数。
  * 追踪类的动态调用， 追踪子类调用父类的函数。我很容易在子类调用父类函数的时候迷失。SourceTrail能比较容易地追踪这种情况吗？
  * 与普通的函数调用比，对象方法的动态调用增加了代码复杂度？增加了代码抽象程度？不能说是增加的代码复杂度，如果没有类，可能代码更复杂。
  * 如果只有函数调用的代码，跟踪起来比较容易，如果有了类层次结构，又该如何跟踪呢？如果像是Spring,又增加了依赖注入，自动配置又该如何追踪呢？
  * 在费力看代码之前，你要仔细阅读理解相关的API docs. 如果要了解一个类，那就先看一下对应的Java Doc. 而不是深入代码。
  * 理解核心类，抓住骨架，可能会让事半功倍。Spring的 BeanFactory。但是如何理解一个核心类呢？如何理解一个类呢？不像理解一个函数，输入输出简单明了。
  * 研究的入门是什么，刚开始或者你不熟悉的功能，你不可能脱离实际的例子，直接钻到源代码里看，你一般还是写一个例子，从例子中开始，例子中，你肯定要创建类，调用方法，就从这里为主线开始研究。
  * 要学会在类的层次结构中穿梭，这才叫掌握了面向对象，也是面向对象的一个基本要求，看懂大牛如何写面向对象，你自己才能写好面向对象。
  * 如何理解一个对象？
    1.	看api doc, 看作者如何解释这个对象；
    2.	看代码呢？先不管它实现了哪些interface. 就只看这个类本身。他的构造函数是什么，需要什么参数，这个类才能生成一个对象。如果设计的好，那么这些参数就是规定这个对象的所有可能性，是这个对象的数据源。
    3.	然后在看公开接口，看这个对象提供了什么服务，看函数说明，大体的代码实现。肯定也逃脱不了crud+verify。整理一下这些接口的逻辑关系。
    4.	然后在去看构造函数如何存成成员变量。
    5.	研究其他所有的成员变量和函数。可能。
    6.	很多产品级代码，很多验证性和异常处理的代码，是否有工具可以一键隐藏这些代码，就可以更快地看清楚主要逻辑。

* 在更高层次去看，研究者在从入门到精通？研究者会经历什么，路径什么？什么能证明研究者在一步一步前进，直到精通。
* 

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
* 除了阅读代码，还要会阅读代码历史.Github commit/PR, diff. 这是另外一个话题。不是此处的重点。
* 代码调用可视化的好处，可以让你看看你的代码调用关系是否混乱，如果混乱，有可视化的帮助，你也以更低的成本研究出如何调整和重构。如果没有这个，你就是在森林里穿梭，除非你是个最强大脑，脑海中可以绘制出全局地图，否则你就会迷路，更谈不上重构了。这也像不看地图玩游戏，肯定被秒杀。
