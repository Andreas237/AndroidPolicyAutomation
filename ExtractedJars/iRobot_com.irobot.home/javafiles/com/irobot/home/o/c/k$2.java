// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.o.c;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.HashMap;

// Referenced classes of package com.irobot.home.o.c:
//			k, o, j

class k$2
	implements Runnable
{

	public void run()
	{
		o.b("LSSNSessionHandler", "executing LSS end session");
	//    0    0:ldc1            #28  <String "LSSNSessionHandler">
	//    1    2:ldc1            #30  <String "executing LSS end session">
	//    2    4:invokestatic    #35  <Method void o.b(String, String)>
		String s = k.a(((AssetIdNetworkSessionAttribute)a.get(((Object) (NetworkSessionAttributeKey.AssetId)))).assetId(), ((NetworkAddressNetworkSessionAttribute)a.get(((Object) (NetworkSessionAttributeKey.NetworkAddress)))).address());
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field HashMap a>
	//    5   11:getstatic       #41  <Field NetworkSessionAttributeKey NetworkSessionAttributeKey.AssetId>
	//    6   14:invokevirtual   #47  <Method Object HashMap.get(Object)>
	//    7   17:checkcast       #49  <Class AssetIdNetworkSessionAttribute>
	//    8   20:invokevirtual   #53  <Method com.irobot.core.AssetId AssetIdNetworkSessionAttribute.assetId()>
	//    9   23:aload_0         
	//   10   24:getfield        #21  <Field HashMap a>
	//   11   27:getstatic       #56  <Field NetworkSessionAttributeKey NetworkSessionAttributeKey.NetworkAddress>
	//   12   30:invokevirtual   #47  <Method Object HashMap.get(Object)>
	//   13   33:checkcast       #58  <Class NetworkAddressNetworkSessionAttribute>
	//   14   36:invokevirtual   #62  <Method com.irobot.core.NetworkAddress NetworkAddressNetworkSessionAttribute.address()>
	//   15   39:invokestatic    #65  <Method String k.a(com.irobot.core.AssetId, com.irobot.core.NetworkAddress)>
	//   16   42:astore_1        
		com.irobot.home.o.c.o o1 = (com.irobot.home.o.c.o)k.c(b).get(((Object) (s)));
	//   17   43:aload_0         
	//   18   44:getfield        #19  <Field k b>
	//   19   47:invokestatic    #69  <Method HashMap k.c(k)>
	//   20   50:aload_1         
	//   21   51:invokevirtual   #47  <Method Object HashMap.get(Object)>
	//   22   54:checkcast       #71  <Class com.irobot.home.o.c.o>
	//   23   57:astore_2        
		if(!(o1 instanceof j))
	//*  24   58:aload_2         
	//*  25   59:instanceof      #73  <Class j>
	//*  26   62:ifne            73
		{
			o.e("LSSNSessionHandler", "Session is null in end session.");
	//   27   65:ldc1            #28  <String "LSSNSessionHandler">
	//   28   67:ldc1            #75  <String "Session is null in end session.">
	//   29   69:invokestatic    #78  <Method void o.e(String, String)>
			return;
	//   30   72:return          
		} else
		{
			((j)o1).g();
	//   31   73:aload_2         
	//   32   74:checkcast       #73  <Class j>
	//   33   77:invokevirtual   #81  <Method void j.g()>
			k.c(b).remove(((Object) (s)));
	//   34   80:aload_0         
	//   35   81:getfield        #19  <Field k b>
	//   36   84:invokestatic    #69  <Method HashMap k.c(k)>
	//   37   87:aload_1         
	//   38   88:invokevirtual   #84  <Method Object HashMap.remove(Object)>
	//   39   91:pop             
			return;
	//   40   92:return          
		}
	}

	final HashMap a;
	final k b;

	k$2(k k1, HashMap hashmap)
	{
		b = k1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field k b>
		a = hashmap;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field HashMap a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
