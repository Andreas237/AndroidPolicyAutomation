// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import java.util.HashMap;

// Referenced classes of package com.facebook.internal:
//			AppEventsLoggerUtility

static final class AppEventsLoggerUtility$1 extends HashMap
{

	AppEventsLoggerUtility$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void HashMap()>
		put(((Object) (aphAPIActivityType.MOBILE_INSTALL_EVENT)), "MOBILE_APP_INSTALL");
	//    2    4:aload_0         
	//    3    5:getstatic       #17  <Field AppEventsLoggerUtility$GraphAPIActivityType AppEventsLoggerUtility$GraphAPIActivityType.MOBILE_INSTALL_EVENT>
	//    4    8:ldc1            #19  <String "MOBILE_APP_INSTALL">
	//    5   10:invokevirtual   #23  <Method Object put(Object, Object)>
	//    6   13:pop             
		put(((Object) (aphAPIActivityType.CUSTOM_APP_EVENTS)), "CUSTOM_APP_EVENTS");
	//    7   14:aload_0         
	//    8   15:getstatic       #26  <Field AppEventsLoggerUtility$GraphAPIActivityType AppEventsLoggerUtility$GraphAPIActivityType.CUSTOM_APP_EVENTS>
	//    9   18:ldc1            #27  <String "CUSTOM_APP_EVENTS">
	//   10   20:invokevirtual   #23  <Method Object put(Object, Object)>
	//   11   23:pop             
	//   12   24:return          
	}
}
