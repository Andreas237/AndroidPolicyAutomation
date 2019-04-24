// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice.h;

import android.content.Context;
import com.baidu.android.pushservice.d.a;
import com.baidu.android.pushservice.d.b;
import com.baidu.android.pushservice.g.c;

// Referenced classes of package com.baidu.android.pushservice.h:
//			f

static final class f$3 extends c
{

	public void a()
	{
		Object obj = ((Object) (com.baidu.android.pushservice.h.f.a(a, b, c, d, false, 2)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Context a>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field String b>
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field int c>
	//    6   12:aload_0         
	//    7   13:getfield        #25  <Field String d>
	//    8   16:iconst_0        
	//    9   17:iconst_2        
	//   10   18:invokestatic    #35  <Method java.util.HashMap com.baidu.android.pushservice.h.f.a(Context, String, int, String, boolean, int)>
	//   11   21:astore_1        
		try
		{
			com.baidu.android.pushservice.h.f.a(a, b, "010202");
	//   12   22:aload_0         
	//   13   23:getfield        #19  <Field Context a>
	//   14   26:aload_0         
	//   15   27:getfield        #21  <Field String b>
	//   16   30:ldc1            #37  <String "010202">
	//   17   32:invokestatic    #40  <Method void com.baidu.android.pushservice.h.f.a(Context, String, String)>
			obj = ((Object) (com.baidu.android.pushservice.d.b.a("https://hack.tuisong.baidu.com/statistics/msg_action", "POST", ((java.util.HashMap) (obj)), "BCCS_SDK/3.0")));
	//   18   35:ldc1            #42  <String "https://hack.tuisong.baidu.com/statistics/msg_action">
	//   19   37:ldc1            #44  <String "POST">
	//   20   39:aload_1         
	//   21   40:ldc1            #46  <String "BCCS_SDK/3.0">
	//   22   42:invokestatic    #51  <Method a b.a(String, String, java.util.HashMap, String)>
	//   23   45:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   24   46:new             #53  <Class StringBuilder>
	//   25   49:dup             
	//   26   50:invokespecial   #55  <Method void StringBuilder()>
	//   27   53:astore_2        
			stringbuilder.append("sendHttpNotificationDeleted, msgId: ");
	//   28   54:aload_2         
	//   29   55:ldc1            #57  <String "sendHttpNotificationDeleted, msgId: ">
	//   30   57:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   31   60:pop             
			stringbuilder.append(b);
	//   32   61:aload_2         
	//   33   62:aload_0         
	//   34   63:getfield        #21  <Field String b>
	//   35   66:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   36   69:pop             
			stringbuilder.append(" result: ");
	//   37   70:aload_2         
	//   38   71:ldc1            #63  <String " result: ">
	//   39   73:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   40   76:pop             
			stringbuilder.append(((a) (obj)).b());
	//   41   77:aload_2         
	//   42   78:aload_1         
	//   43   79:invokevirtual   #68  <Method int a.b()>
	//   44   82:invokevirtual   #71  <Method StringBuilder StringBuilder.append(int)>
	//   45   85:pop             
			com.baidu.android.pushservice.e.a.c("HttpMessageAction", stringbuilder.toString());
	//   46   86:ldc1            #73  <String "HttpMessageAction">
	//   47   88:aload_2         
	//   48   89:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   49   92:invokestatic    #82  <Method void com.baidu.android.pushservice.e.a.c(String, String)>
			return;
	//   50   95:return          
		}
		catch(Exception exception)
	//*  51   96:astore_1        
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   52   97:new             #53  <Class StringBuilder>
	//   53  100:dup             
	//   54  101:invokespecial   #55  <Method void StringBuilder()>
	//   55  104:astore_2        
			stringbuilder1.append("sendHttpNotificationDeleted, Exception: ");
	//   56  105:aload_2         
	//   57  106:ldc1            #84  <String "sendHttpNotificationDeleted, Exception: ">
	//   58  108:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   59  111:pop             
			stringbuilder1.append(exception.getMessage());
	//   60  112:aload_2         
	//   61  113:aload_1         
	//   62  114:invokevirtual   #87  <Method String Exception.getMessage()>
	//   63  117:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   64  120:pop             
			com.baidu.android.pushservice.e.a.e("HttpMessageAction", stringbuilder1.toString());
	//   65  121:ldc1            #73  <String "HttpMessageAction">
	//   66  123:aload_2         
	//   67  124:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   68  127:invokestatic    #90  <Method void com.baidu.android.pushservice.e.a.e(String, String)>
			com.baidu.android.pushservice.e.a.a("HttpMessageAction", ((Throwable) (exception)));
	//   69  130:ldc1            #73  <String "HttpMessageAction">
	//   70  132:aload_1         
	//   71  133:invokestatic    #93  <Method void com.baidu.android.pushservice.e.a.a(String, Throwable)>
			return;
	//   72  136:return          
		}
	}

	final Context a;
	final String b;
	final int c;
	final String d;

	f$3(String s, short word0, Context context, String s1, int i, String s2)
	{
		a = context;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #19  <Field Context a>
		b = s1;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #21  <Field String b>
		c = i;
	//    6   11:aload_0         
	//    7   12:iload           5
	//    8   14:putfield        #23  <Field int c>
		d = s2;
	//    9   17:aload_0         
	//   10   18:aload           6
	//   11   20:putfield        #25  <Field String d>
		super(s, word0);
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:iload_2         
	//   15   26:invokespecial   #28  <Method void c(String, short)>
	//   16   29:return          
	}
}
