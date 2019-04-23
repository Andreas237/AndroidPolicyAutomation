// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aeq

final class aes
	implements Runnable
{

	aes(aeq aeq1, String s, String s1, long l, long l1, 
			boolean flag, int i, int j)
	{
		h = aeq1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field aeq h>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field String a>
		b = s1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field String b>
		c = l;
	//    9   15:aload_0         
	//   10   16:lload           4
	//   11   18:putfield        #29  <Field long c>
		d = l1;
	//   12   21:aload_0         
	//   13   22:lload           6
	//   14   24:putfield        #31  <Field long d>
		e = flag;
	//   15   27:aload_0         
	//   16   28:iload           8
	//   17   30:putfield        #33  <Field boolean e>
		f = i;
	//   18   33:aload_0         
	//   19   34:iload           9
	//   20   36:putfield        #35  <Field int f>
		g = j;
	//   21   39:aload_0         
	//   22   40:iload           10
	//   23   42:putfield        #37  <Field int g>
		super();
	//   24   45:aload_0         
	//   25   46:invokespecial   #40  <Method void Object()>
	//   26   49:return          
	}

	public final void run()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #44  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #45  <Method void HashMap()>
	//    3    7:astore_2        
		((Map) (hashmap)).put("event", "precacheProgress");
	//    4    8:aload_2         
	//    5    9:ldc1            #47  <String "event">
	//    6   11:ldc1            #49  <String "precacheProgress">
	//    7   13:invokeinterface #55  <Method Object Map.put(Object, Object)>
	//    8   18:pop             
		((Map) (hashmap)).put("src", ((Object) (a)));
	//    9   19:aload_2         
	//   10   20:ldc1            #57  <String "src">
	//   11   22:aload_0         
	//   12   23:getfield        #25  <Field String a>
	//   13   26:invokeinterface #55  <Method Object Map.put(Object, Object)>
	//   14   31:pop             
		((Map) (hashmap)).put("cachedSrc", ((Object) (b)));
	//   15   32:aload_2         
	//   16   33:ldc1            #59  <String "cachedSrc">
	//   17   35:aload_0         
	//   18   36:getfield        #27  <Field String b>
	//   19   39:invokeinterface #55  <Method Object Map.put(Object, Object)>
	//   20   44:pop             
		((Map) (hashmap)).put("bufferedDuration", ((Object) (Long.toString(c))));
	//   21   45:aload_2         
	//   22   46:ldc1            #61  <String "bufferedDuration">
	//   23   48:aload_0         
	//   24   49:getfield        #29  <Field long c>
	//   25   52:invokestatic    #67  <Method String Long.toString(long)>
	//   26   55:invokeinterface #55  <Method Object Map.put(Object, Object)>
	//   27   60:pop             
		((Map) (hashmap)).put("totalDuration", ((Object) (Long.toString(d))));
	//   28   61:aload_2         
	//   29   62:ldc1            #69  <String "totalDuration">
	//   30   64:aload_0         
	//   31   65:getfield        #31  <Field long d>
	//   32   68:invokestatic    #67  <Method String Long.toString(long)>
	//   33   71:invokeinterface #55  <Method Object Map.put(Object, Object)>
	//   34   76:pop             
		String s;
		if(e)
	//*  35   77:aload_0         
	//*  36   78:getfield        #33  <Field boolean e>
	//*  37   81:ifeq            90
			s = "1";
	//   38   84:ldc1            #71  <String "1">
	//   39   86:astore_1        
		else
	//*  40   87:goto            93
			s = "0";
	//   41   90:ldc1            #73  <String "0">
	//   42   92:astore_1        
		((Map) (hashmap)).put("cacheReady", ((Object) (s)));
	//   43   93:aload_2         
	//   44   94:ldc1            #75  <String "cacheReady">
	//   45   96:aload_1         
	//   46   97:invokeinterface #55  <Method Object Map.put(Object, Object)>
	//   47  102:pop             
		((Map) (hashmap)).put("playerCount", ((Object) (Integer.toString(f))));
	//   48  103:aload_2         
	//   49  104:ldc1            #77  <String "playerCount">
	//   50  106:aload_0         
	//   51  107:getfield        #35  <Field int f>
	//   52  110:invokestatic    #82  <Method String Integer.toString(int)>
	//   53  113:invokeinterface #55  <Method Object Map.put(Object, Object)>
	//   54  118:pop             
		((Map) (hashmap)).put("playerPreparedCount", ((Object) (Integer.toString(g))));
	//   55  119:aload_2         
	//   56  120:ldc1            #84  <String "playerPreparedCount">
	//   57  122:aload_0         
	//   58  123:getfield        #37  <Field int g>
	//   59  126:invokestatic    #82  <Method String Integer.toString(int)>
	//   60  129:invokeinterface #55  <Method Object Map.put(Object, Object)>
	//   61  134:pop             
		aeq.a(h, "onPrecacheEvent", ((Map) (hashmap)));
	//   62  135:aload_0         
	//   63  136:getfield        #23  <Field aeq h>
	//   64  139:ldc1            #86  <String "onPrecacheEvent">
	//   65  141:aload_2         
	//   66  142:invokestatic    #91  <Method void aeq.a(aeq, String, Map)>
	//   67  145:return          
	}

	private final String a;
	private final String b;
	private final long c;
	private final long d;
	private final boolean e;
	private final int f;
	private final int g;
	private final aeq h;
}
