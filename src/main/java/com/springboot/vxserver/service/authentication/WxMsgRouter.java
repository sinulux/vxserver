package com.springboot.vxserver.service.authentication;

import com.soecode.wxtools.api.IService;
import com.soecode.wxtools.api.WxMessageRouter;

/**
 * @author wangshibao
 * @ClassName WxMsgRouter
 * @Description 消息路由
 * 这是一个消息路由器：用于定制规则处理来自微信的消息
 * 对来自微信服务器的消息进行过滤和筛选，只针对有效消息进行处理，提高服务器处理效率
 * 通过链式配置路由规则(Rule)，根据规则把来自微信的消息交给handler处理
 * @date 2018/4/21 15:12
 */
public class WxMsgRouter extends WxMessageRouter {

    /*说明：

    配置路由规则时尽量按照从细到粗的原则，否则可能消息可能会被提前处理
    默认情况下消息只会被处理一次，除非使用 {WxMessageRouterRule的next()方法}
    规则的结束必须用{WxMessageRouterRule的end()方法}或者{WxMessageRouterRule的next()方法}，否则不会生效。
    使用方法：

    // 初始化一个路由器，把wxService传入。
    WxMessageRouter router = new WxMessageRouter(wxService);
    // 新建路由规则，通过rule()方法创建新的规则，然后链式填写过滤条件。MSG_TYPE等参数填入WxConst中的常量
    // 这里不作展示，可以查看WxConst代码或官方文档，有注释。
    router.rule().msgType("MSG_TYPE").event("EVENT").
    eventKey("EVENT_KEY").content("CONTENT").
    matcher(matcher).interceptor(interceptor, ...).
    handler(handler, ...).end().rule().msgType("MSG_TYPE")...//另外一个匹配规则.end();
    // 将WxXmlMessage交给消息路由器，处理后得到结果。
    WxXmlOutMessage xmlOutMsg = router.route(wxXmlMessage);
    关于路由规则条件

    对于一条消息(WxXMLMessage)允许多个规则(Rule)去进行过滤和处理。用next()方法去连接两个规则。但是最后必须是以end()方法结束。
    每条规则可以允许多个拦截器(Interceptor)，多个处理器(Handler)处理。返回最后一个Handler处理的结果。
    路由规则还提供正则表达式过滤，对于简单的过滤需求，如只接受数字消息。不想繁琐的建立Matcher匹配器。可以如下写法。
    //正则表达式：^[0-9]*$只接受数字消息，其他消息过滤。
    router.rule().rContent("^[0-9]*$").handler(new DemoHandler()).end();*/


    public WxMsgRouter(IService iService) {
        super(iService);
    }
}
