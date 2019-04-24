// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.util;

import java.util.Comparator;

// Referenced classes of package com.irobot.home.util:
//			WifiStateReceiver

class WifiStateReceiver$1
	implements Comparator
{

	public int compare(Object obj, Object obj1)
	{
		return ((int) (obj.equals(obj1) ^ true));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #24  <Method boolean Object.equals(Object)>
	//    3    5:iconst_1        
	//    4    6:ixor            
	//    5    7:ireturn         
	}

	final WifiStateReceiver a;

	WifiStateReceiver$1(WifiStateReceiver wifistatereceiver)
	{
		a = wifistatereceiver;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field WifiStateReceiver a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
