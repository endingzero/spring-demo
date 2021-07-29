## 基础实现
BeanDefinition，用于定义 Bean 实例化信息，现在的实现是以一个 Object 存放对象
BeanFactory，代表了 Bean 对象的工厂，可以存放 Bean 定义到 Map 中以及获取。


## 增加模板模式getBean

## 使用策略模式创建bean



## 05
BeanFactory，已经存在的 Bean 工厂接口用于获取 Bean 对象，这次新增加了按照类型获取 Bean 的方法：<T> T getBean(String name, Class<T> requiredType)
ListableBeanFactory，是一个扩展 Bean 工厂接口的接口，新增加了 getBeansOfType、getBeanDefinitionNames() 方法，在 Spring 源码中还有其他扩展方法。
HierarchicalBeanFactory，在 Spring 源码中它提供了可以获取父类 BeanFactory 方法，属于是一种扩展工厂的层次子接口。Sub-interface implemented by bean factories that can be part of a hierarchy.
AutowireCapableBeanFactory，是一个自动化处理Bean工厂配置的接口，目前案例工程中还没有做相应的实现，后续逐步完善。
ConfigurableBeanFactory，可获取 BeanPostProcessor、BeanClassLoader等的一个配置化接口。
ConfigurableListableBeanFactory，提供分析和修改Bean以及预先实例化的操作接口，不过目前只有一个 getBeanDefinition 方法。

