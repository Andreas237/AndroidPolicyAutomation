// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.o.c;

import com.irobot.core.NetworkSessionType;
import java.util.HashMap;

// Referenced classes of package com.irobot.home.o.c:
//			p

static final class p$6 extends HashMap
{

	p$6()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void HashMap()>
		put(((Object) (NetworkSessionType.LocalHttps)), ((Object) (p.a())));
	//    2    4:aload_0         
	//    3    5:getstatic       #17  <Field NetworkSessionType NetworkSessionType.LocalHttps>
	//    4    8:invokestatic    #21  <Method p$a p.a()>
	//    5   11:invokevirtual   #25  <Method Object put(Object, Object)>
	//    6   14:pop             
		put(((Object) (NetworkSessionType.RemoteHttps)), ((Object) (p.b())));
	//    7   15:aload_0         
	//    8   16:getstatic       #28  <Field NetworkSessionType NetworkSessionType.RemoteHttps>
	//    9   19:invokestatic    #31  <Method p$a p.b()>
	//   10   22:invokevirtual   #25  <Method Object put(Object, Object)>
	//   11   25:pop             
		put(((Object) (NetworkSessionType.AwsApiGateway)), ((Object) (p.c())));
	//   12   26:aload_0         
	//   13   27:getstatic       #34  <Field NetworkSessionType NetworkSessionType.AwsApiGateway>
	//   14   30:invokestatic    #37  <Method p$a p.c()>
	//   15   33:invokevirtual   #25  <Method Object put(Object, Object)>
	//   16   36:pop             
		put(((Object) (NetworkSessionType.AwsIoTService)), ((Object) (p.d())));
	//   17   37:aload_0         
	//   18   38:getstatic       #40  <Field NetworkSessionType NetworkSessionType.AwsIoTService>
	//   19   41:invokestatic    #43  <Method p$a p.d()>
	//   20   44:invokevirtual   #25  <Method Object put(Object, Object)>
	//   21   47:pop             
		put(((Object) (NetworkSessionType.LocalSecureSocket)), ((Object) (p.e())));
	//   22   48:aload_0         
	//   23   49:getstatic       #46  <Field NetworkSessionType NetworkSessionType.LocalSecureSocket>
	//   24   52:invokestatic    #49  <Method p$a p.e()>
	//   25   55:invokevirtual   #25  <Method Object put(Object, Object)>
	//   26   58:pop             
	//   27   59:return          
	}
}
