# 本项目说明
1, 组件化开发,使用kotlin 语言,本项目是一个工具集合项目,每一个工具,是一个module.
2,工具类型,比如有,尺子,水平仪,模拟GPS定位等 小工具合集.
3,使用第三方,dokit作为性能检测的一个工具.只限于debug版本使用.
4,模块分为app,library和module

# 项目架构
## app空壳工程，依赖所有的业务组件，不存放任何逻辑代码。
## lib-base业务公共模块，存放各个业务组件的公共部分，如BaseActivity，BaseApplication，基础域名，各种全局常量等，所有业务模块只需要依赖此模块即可，无需依赖其他模块。
## lib-common基础公共模块，最底层的库，依赖了各种功能组件(lib_xxxx)、第三方SDK（友盟，bugly等），二次封装各种工具类和开源库，存放各种自定义view（如圆角imageview）等跟业务无任何关系的东西。

# 依赖关系图
> App -> main -> base -> common



