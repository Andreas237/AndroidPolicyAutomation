// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice.c;

import android.content.Context;
import com.baidu.android.pushservice.e.a;
import java.util.HashMap;

// Referenced classes of package com.baidu.android.pushservice.c:
//			d, b, l

public class z extends d
{

	public z(l l1, Context context)
	{
		super(l1, context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #8   <Method void d(l, Context)>
	//    4    6:return          
	}

	protected void a(HashMap hashmap)
	{
		b.b(hashmap);
	//    0    0:aload_1         
	//    1    1:invokestatic    #16  <Method void b.b(HashMap)>
		hashmap.put("method", "unbindapp");
	//    2    4:aload_1         
	//    3    5:ldc1            #18  <String "method">
	//    4    7:ldc1            #20  <String "unbindapp">
	//    5    9:invokevirtual   #26  <Method Object HashMap.put(Object, Object)>
	//    6   12:pop             
		hashmap.put("appid", ((Object) (b.f)));
	//    7   13:aload_1         
	//    8   14:ldc1            #28  <String "appid">
	//    9   16:aload_0         
	//   10   17:getfield        #31  <Field l b>
	//   11   20:getfield        #37  <Field String l.f>
	//   12   23:invokevirtual   #26  <Method Object HashMap.put(Object, Object)>
	//   13   26:pop             
		StringBuilder stringbuilder = new StringBuilder();
	//   14   27:new             #39  <Class StringBuilder>
	//   15   30:dup             
	//   16   31:invokespecial   #42  <Method void StringBuilder()>
	//   17   34:astore_2        
		stringbuilder.append("UNBINDAPP param -- ");
	//   18   35:aload_2         
	//   19   36:ldc1            #44  <String "UNBINDAPP param -- ">
	//   20   38:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
		stringbuilder.append(com.baidu.android.pushservice.c.b.a(hashmap));
	//   22   42:aload_2         
	//   23   43:aload_1         
	//   24   44:invokestatic    #51  <Method String com.baidu.android.pushservice.c.b.a(HashMap)>
	//   25   47:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   26   50:pop             
		com.baidu.android.pushservice.e.a.c("UnbindApp", stringbuilder.toString());
	//   27   51:ldc1            #53  <String "UnbindApp">
	//   28   53:aload_2         
	//   29   54:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   30   57:invokestatic    #63  <Method void a.c(String, String)>
	//   31   60:return          
	}
}
