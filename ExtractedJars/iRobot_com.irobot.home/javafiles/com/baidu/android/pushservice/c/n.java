// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice.c;

import android.content.Context;
import com.baidu.android.pushservice.e.a;
import java.util.HashMap;

// Referenced classes of package com.baidu.android.pushservice.c:
//			c, b, l

public class n extends c
{

	public n(l l, Context context, String s, int i, int j)
	{
		super(l, context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #14  <Method void c(l, Context)>
		d = 1;
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:putfield        #16  <Field int d>
		e = 1;
	//    7   11:aload_0         
	//    8   12:iconst_1        
	//    9   13:putfield        #18  <Field int e>
		f = s;
	//   10   16:aload_0         
	//   11   17:aload_3         
	//   12   18:putfield        #20  <Field String f>
		d = i;
	//   13   21:aload_0         
	//   14   22:iload           4
	//   15   24:putfield        #16  <Field int d>
		e = j;
	//   16   27:aload_0         
	//   17   28:iload           5
	//   18   30:putfield        #18  <Field int e>
	//   19   33:return          
	}

	protected void a(HashMap hashmap)
	{
		super.a(hashmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void com.baidu.android.pushservice.c.c.a(HashMap)>
		hashmap.put("method", "fetchgmsg");
	//    3    5:aload_1         
	//    4    6:ldc1            #27  <String "method">
	//    5    8:ldc1            #29  <String "fetchgmsg">
	//    6   10:invokevirtual   #35  <Method Object HashMap.put(Object, Object)>
	//    7   13:pop             
		hashmap.put("gid", ((Object) (f)));
	//    8   14:aload_1         
	//    9   15:ldc1            #37  <String "gid">
	//   10   17:aload_0         
	//   11   18:getfield        #20  <Field String f>
	//   12   21:invokevirtual   #35  <Method Object HashMap.put(Object, Object)>
	//   13   24:pop             
		StringBuilder stringbuilder = new StringBuilder();
	//   14   25:new             #39  <Class StringBuilder>
	//   15   28:dup             
	//   16   29:invokespecial   #42  <Method void StringBuilder()>
	//   17   32:astore_2        
		stringbuilder.append(d);
	//   18   33:aload_2         
	//   19   34:aload_0         
	//   20   35:getfield        #16  <Field int d>
	//   21   38:invokevirtual   #46  <Method StringBuilder StringBuilder.append(int)>
	//   22   41:pop             
		stringbuilder.append("");
	//   23   42:aload_2         
	//   24   43:ldc1            #48  <String "">
	//   25   45:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   26   48:pop             
		hashmap.put("fetch_type", ((Object) (stringbuilder.toString())));
	//   27   49:aload_1         
	//   28   50:ldc1            #53  <String "fetch_type">
	//   29   52:aload_2         
	//   30   53:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   31   56:invokevirtual   #35  <Method Object HashMap.put(Object, Object)>
	//   32   59:pop             
		stringbuilder = new StringBuilder();
	//   33   60:new             #39  <Class StringBuilder>
	//   34   63:dup             
	//   35   64:invokespecial   #42  <Method void StringBuilder()>
	//   36   67:astore_2        
		stringbuilder.append(e);
	//   37   68:aload_2         
	//   38   69:aload_0         
	//   39   70:getfield        #18  <Field int e>
	//   40   73:invokevirtual   #46  <Method StringBuilder StringBuilder.append(int)>
	//   41   76:pop             
		stringbuilder.append("");
	//   42   77:aload_2         
	//   43   78:ldc1            #48  <String "">
	//   44   80:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   45   83:pop             
		hashmap.put("fetch_num", ((Object) (stringbuilder.toString())));
	//   46   84:aload_1         
	//   47   85:ldc1            #59  <String "fetch_num">
	//   48   87:aload_2         
	//   49   88:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   50   91:invokevirtual   #35  <Method Object HashMap.put(Object, Object)>
	//   51   94:pop             
		stringbuilder = new StringBuilder();
	//   52   95:new             #39  <Class StringBuilder>
	//   53   98:dup             
	//   54   99:invokespecial   #42  <Method void StringBuilder()>
	//   55  102:astore_2        
		stringbuilder.append("FETCHGmsg param -- ");
	//   56  103:aload_2         
	//   57  104:ldc1            #61  <String "FETCHGmsg param -- ">
	//   58  106:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   59  109:pop             
		stringbuilder.append(com.baidu.android.pushservice.c.b.a(hashmap));
	//   60  110:aload_2         
	//   61  111:aload_1         
	//   62  112:invokestatic    #66  <Method String com.baidu.android.pushservice.c.b.a(HashMap)>
	//   63  115:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   64  118:pop             
		com.baidu.android.pushservice.e.a.c("FetchGmsg", stringbuilder.toString());
	//   65  119:ldc1            #68  <String "FetchGmsg">
	//   66  121:aload_2         
	//   67  122:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   68  125:invokestatic    #74  <Method void a.c(String, String)>
	//   69  128:return          
	}

	int d;
	int e;
	String f;
}
