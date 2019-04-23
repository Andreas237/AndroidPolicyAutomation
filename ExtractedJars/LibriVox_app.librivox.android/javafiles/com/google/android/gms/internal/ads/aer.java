// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aeq

final class aer
	implements Runnable
{

	aer(aeq aeq1, String s, String s1, int i, int j, boolean flag)
	{
		f = aeq1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field aeq f>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field String a>
		b = s1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field String b>
		c = i;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #26  <Field int c>
		d = j;
	//   12   21:aload_0         
	//   13   22:iload           5
	//   14   24:putfield        #28  <Field int d>
	//   15   27:aload_0         
	//   16   28:iconst_0        
	//   17   29:putfield        #30  <Field boolean e>
		super();
	//   18   32:aload_0         
	//   19   33:invokespecial   #33  <Method void Object()>
	//   20   36:return          
	}

	public final void run()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #37  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void HashMap()>
	//    3    7:astore_2        
		((Map) (hashmap)).put("event", "precacheProgress");
	//    4    8:aload_2         
	//    5    9:ldc1            #40  <String "event">
	//    6   11:ldc1            #42  <String "precacheProgress">
	//    7   13:invokeinterface #48  <Method Object Map.put(Object, Object)>
	//    8   18:pop             
		((Map) (hashmap)).put("src", ((Object) (a)));
	//    9   19:aload_2         
	//   10   20:ldc1            #50  <String "src">
	//   11   22:aload_0         
	//   12   23:getfield        #22  <Field String a>
	//   13   26:invokeinterface #48  <Method Object Map.put(Object, Object)>
	//   14   31:pop             
		((Map) (hashmap)).put("cachedSrc", ((Object) (b)));
	//   15   32:aload_2         
	//   16   33:ldc1            #52  <String "cachedSrc">
	//   17   35:aload_0         
	//   18   36:getfield        #24  <Field String b>
	//   19   39:invokeinterface #48  <Method Object Map.put(Object, Object)>
	//   20   44:pop             
		((Map) (hashmap)).put("bytesLoaded", ((Object) (Integer.toString(c))));
	//   21   45:aload_2         
	//   22   46:ldc1            #54  <String "bytesLoaded">
	//   23   48:aload_0         
	//   24   49:getfield        #26  <Field int c>
	//   25   52:invokestatic    #60  <Method String Integer.toString(int)>
	//   26   55:invokeinterface #48  <Method Object Map.put(Object, Object)>
	//   27   60:pop             
		((Map) (hashmap)).put("totalBytes", ((Object) (Integer.toString(d))));
	//   28   61:aload_2         
	//   29   62:ldc1            #62  <String "totalBytes">
	//   30   64:aload_0         
	//   31   65:getfield        #28  <Field int d>
	//   32   68:invokestatic    #60  <Method String Integer.toString(int)>
	//   33   71:invokeinterface #48  <Method Object Map.put(Object, Object)>
	//   34   76:pop             
		String s;
		if(e)
	//*  35   77:aload_0         
	//*  36   78:getfield        #30  <Field boolean e>
	//*  37   81:ifeq            90
			s = "1";
	//   38   84:ldc1            #64  <String "1">
	//   39   86:astore_1        
		else
	//*  40   87:goto            93
			s = "0";
	//   41   90:ldc1            #66  <String "0">
	//   42   92:astore_1        
		((Map) (hashmap)).put("cacheReady", ((Object) (s)));
	//   43   93:aload_2         
	//   44   94:ldc1            #68  <String "cacheReady">
	//   45   96:aload_1         
	//   46   97:invokeinterface #48  <Method Object Map.put(Object, Object)>
	//   47  102:pop             
		aeq.a(f, "onPrecacheEvent", ((Map) (hashmap)));
	//   48  103:aload_0         
	//   49  104:getfield        #20  <Field aeq f>
	//   50  107:ldc1            #70  <String "onPrecacheEvent">
	//   51  109:aload_2         
	//   52  110:invokestatic    #75  <Method void aeq.a(aeq, String, Map)>
	//   53  113:return          
	}

	private final String a;
	private final String b;
	private final int c;
	private final int d;
	private final boolean e = false;
	private final aeq f;
}
