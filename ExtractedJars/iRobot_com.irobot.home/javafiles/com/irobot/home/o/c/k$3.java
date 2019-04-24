// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.o.c;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.HashMap;
import junit.b.a;

// Referenced classes of package com.irobot.home.o.c:
//			k, h

class k$3
	implements Runnable
{

	public void run()
	{
		o.b("LSSNSessionHandler", "sending binary data over LSS session");
	//    0    0:ldc1            #38  <String "LSSNSessionHandler">
	//    1    2:ldc1            #40  <String "sending binary data over LSS session">
	//    2    4:invokestatic    #45  <Method void o.b(String, String)>
		junit.b.a.a("Local secure socket Network Session requires a network address.", a.containsKey(((Object) (RequestAttributeKey.NetworkAddress))));
	//    3    7:ldc1            #47  <String "Local secure socket Network Session requires a network address.">
	//    4    9:aload_0         
	//    5   10:getfield        #25  <Field HashMap a>
	//    6   13:getstatic       #53  <Field RequestAttributeKey RequestAttributeKey.NetworkAddress>
	//    7   16:invokevirtual   #59  <Method boolean HashMap.containsKey(Object)>
	//    8   19:invokestatic    #64  <Method void a.a(String, boolean)>
		boolean flag;
		Object obj;
		NullPointerException nullpointerexception;
		if(b != null)
	//*   9   22:aload_0         
	//*  10   23:getfield        #27  <Field AssetId b>
	//*  11   26:ifnull          109
			flag = true;
	//   12   29:iconst_1        
	//   13   30:istore_1        
		else
	//*  14   31:goto            34
	//*  15   34:ldc1            #66  <String "Local secure socket Network Session requires an asset id.">
	//*  16   36:iload_1         
	//*  17   37:invokestatic    #64  <Method void a.a(String, boolean)>
	//*  18   40:aload_0         
	//*  19   41:getfield        #25  <Field HashMap a>
	//*  20   44:getstatic       #53  <Field RequestAttributeKey RequestAttributeKey.NetworkAddress>
	//*  21   47:invokevirtual   #70  <Method Object HashMap.get(Object)>
	//*  22   50:checkcast       #72  <Class NetworkAddressRequestAttribute>
	//*  23   53:invokevirtual   #76  <Method com.irobot.core.NetworkAddress NetworkAddressRequestAttribute.address()>
	//*  24   56:astore_2        
	//*  25   57:aload_0         
	//*  26   58:getfield        #27  <Field AssetId b>
	//*  27   61:aload_2         
	//*  28   62:invokestatic    #79  <Method String com.irobot.home.o.c.k.a(AssetId, com.irobot.core.NetworkAddress)>
	//*  29   65:astore_2        
	//*  30   66:aload_0         
	//*  31   67:getfield        #23  <Field k d>
	//*  32   70:invokestatic    #82  <Method HashMap k.c(k)>
	//*  33   73:aload_2         
	//*  34   74:invokevirtual   #70  <Method Object HashMap.get(Object)>
	//*  35   77:checkcast       #84  <Class h>
	//*  36   80:astore_2        
	//*  37   81:aload_2         
	//*  38   82:ifnonnull       86
	//*  39   85:return          
	//*  40   86:aload_2         
	//*  41   87:aload_0         
	//*  42   88:getfield        #29  <Field byte[] c>
	//*  43   91:invokeinterface #87  <Method void com.irobot.home.o.c.h.a(byte[])>
	//*  44   96:return          
	//*  45   97:ldc1            #38  <String "LSSNSessionHandler">
	//*  46   99:ldc1            #89  <String "Invalid request attribute passed to send binary request.">
	//*  47  101:invokestatic    #92  <Method void o.e(String, String)>
	//*  48  104:return          
	//*  49  105:astore_2        
	//*  50  106:goto            97
			flag = false;
	//   51  109:iconst_0        
	//   52  110:istore_1        
		junit.b.a.a("Local secure socket Network Session requires an asset id.", flag);
		obj = ((Object) (((NetworkAddressRequestAttribute)a.get(((Object) (RequestAttributeKey.NetworkAddress)))).address()));
		obj = ((Object) (com.irobot.home.o.c.k.a(b, ((com.irobot.core.NetworkAddress) (obj)))));
		obj = ((Object) ((h)k.c(d).get(obj)));
		if(obj == null)
			return;
		try
		{
			((h) (obj)).a(c);
			return;
		}
		// Misplaced declaration of an exception variable
		catch(NullPointerException nullpointerexception)
		{
			o.e("LSSNSessionHandler", "Invalid request attribute passed to send binary request.");
		}
		return;
	//*  53  111:goto            34
	}

	final HashMap a;
	final AssetId b;
	final byte c[];
	final k d;

	k$3(k k1, HashMap hashmap, AssetId assetid, byte abyte0[])
	{
		d = k1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field k d>
		a = hashmap;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field HashMap a>
		b = assetid;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field AssetId b>
		c = abyte0;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #29  <Field byte[] c>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #32  <Method void Object()>
	//   14   25:return          
	}
}
