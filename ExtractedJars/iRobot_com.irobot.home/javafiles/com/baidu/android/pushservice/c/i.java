// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice.c;

import android.content.Context;
import com.baidu.android.pushservice.e.a;
import java.util.HashMap;

// Referenced classes of package com.baidu.android.pushservice.c:
//			c, b, l

public class i extends c
{

	public i(l l, Context context, String s)
	{
		super(l, context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #11  <Method void c(l, Context)>
		d = s;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #13  <Field String d>
	//    7   11:return          
	}

	protected void a(HashMap hashmap)
	{
		super.a(hashmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void com.baidu.android.pushservice.c.c.a(HashMap)>
		hashmap.put("method", "gmsgcount");
	//    3    5:aload_1         
	//    4    6:ldc1            #20  <String "method">
	//    5    8:ldc1            #22  <String "gmsgcount">
	//    6   10:invokevirtual   #28  <Method Object HashMap.put(Object, Object)>
	//    7   13:pop             
		hashmap.put("gid", ((Object) (d)));
	//    8   14:aload_1         
	//    9   15:ldc1            #30  <String "gid">
	//   10   17:aload_0         
	//   11   18:getfield        #13  <Field String d>
	//   12   21:invokevirtual   #28  <Method Object HashMap.put(Object, Object)>
	//   13   24:pop             
		StringBuilder stringbuilder = new StringBuilder();
	//   14   25:new             #32  <Class StringBuilder>
	//   15   28:dup             
	//   16   29:invokespecial   #35  <Method void StringBuilder()>
	//   17   32:astore_2        
		stringbuilder.append("CountGmsg param -- ");
	//   18   33:aload_2         
	//   19   34:ldc1            #37  <String "CountGmsg param -- ">
	//   20   36:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append(com.baidu.android.pushservice.c.b.a(hashmap));
	//   22   40:aload_2         
	//   23   41:aload_1         
	//   24   42:invokestatic    #46  <Method String com.baidu.android.pushservice.c.b.a(HashMap)>
	//   25   45:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   26   48:pop             
		com.baidu.android.pushservice.e.a.c("CountGmsg", stringbuilder.toString());
	//   27   49:ldc1            #48  <String "CountGmsg">
	//   28   51:aload_2         
	//   29   52:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   30   55:invokestatic    #58  <Method void a.c(String, String)>
	//   31   58:return          
	}

	protected String d;
}
