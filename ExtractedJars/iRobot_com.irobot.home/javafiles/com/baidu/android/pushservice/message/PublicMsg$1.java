// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice.message;

import android.content.Context;
import com.baidu.android.pushservice.c.b;
import com.baidu.android.pushservice.e.a;
import com.baidu.android.pushservice.g.c;
import com.baidu.android.pushservice.h;
import java.util.HashMap;

// Referenced classes of package com.baidu.android.pushservice.message:
//			PublicMsg

class PublicMsg$1 extends c
{

	public void a()
	{
		Object obj;
		StringBuilder stringbuilder1;
		try
		{
			obj = ((Object) (new HashMap()));
	//    0    0:new             #38  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void HashMap()>
	//    3    7:astore_1        
			com.baidu.android.pushservice.c.b.b(((HashMap) (obj)));
	//    4    8:aload_1         
	//    5    9:invokestatic    #45  <Method void b.b(HashMap)>
			((HashMap) (obj)).put("method", "linkhit");
	//    6   12:aload_1         
	//    7   13:ldc1            #47  <String "method">
	//    8   15:ldc1            #49  <String "linkhit">
	//    9   17:invokevirtual   #53  <Method Object HashMap.put(Object, Object)>
	//   10   20:pop             
			((HashMap) (obj)).put("channel_token", ((Object) (a)));
	//   11   21:aload_1         
	//   12   22:ldc1            #55  <String "channel_token">
	//   13   24:aload_0         
	//   14   25:getfield        #23  <Field String a>
	//   15   28:invokevirtual   #53  <Method Object HashMap.put(Object, Object)>
	//   16   31:pop             
			((HashMap) (obj)).put("data", ((Object) (b)));
	//   17   32:aload_1         
	//   18   33:ldc1            #57  <String "data">
	//   19   35:aload_0         
	//   20   36:getfield        #25  <Field String b>
	//   21   39:invokevirtual   #53  <Method Object HashMap.put(Object, Object)>
	//   22   42:pop             
			StringBuilder stringbuilder = new StringBuilder();
	//   23   43:new             #59  <Class StringBuilder>
	//   24   46:dup             
	//   25   47:invokespecial   #60  <Method void StringBuilder()>
	//   26   50:astore_2        
			stringbuilder.append("linkhit param -- ");
	//   27   51:aload_2         
	//   28   52:ldc1            #62  <String "linkhit param -- ">
	//   29   54:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   30   57:pop             
			stringbuilder.append(com.baidu.android.pushservice.c.b.a(((HashMap) (obj))));
	//   31   58:aload_2         
	//   32   59:aload_1         
	//   33   60:invokestatic    #69  <Method String b.a(HashMap)>
	//   34   63:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   35   66:pop             
			com.baidu.android.pushservice.e.a.c("PublicMsg", stringbuilder.toString());
	//   36   67:ldc1            #71  <String "PublicMsg">
	//   37   69:aload_2         
	//   38   70:invokevirtual   #75  <Method String StringBuilder.toString()>
	//   39   73:invokestatic    #80  <Method void a.c(String, String)>
			stringbuilder = new StringBuilder();
	//   40   76:new             #59  <Class StringBuilder>
	//   41   79:dup             
	//   42   80:invokespecial   #60  <Method void StringBuilder()>
	//   43   83:astore_2        
			stringbuilder.append(h.e());
	//   44   84:aload_2         
	//   45   85:invokestatic    #84  <Method String h.e()>
	//   46   88:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   47   91:pop             
			stringbuilder.append(c);
	//   48   92:aload_2         
	//   49   93:aload_0         
	//   50   94:getfield        #27  <Field String c>
	//   51   97:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   52  100:pop             
			obj = ((Object) (com.baidu.android.pushservice.d.b.a(stringbuilder.toString(), "POST", ((HashMap) (obj)))));
	//   53  101:aload_2         
	//   54  102:invokevirtual   #75  <Method String StringBuilder.toString()>
	//   55  105:ldc1            #86  <String "POST">
	//   56  107:aload_1         
	//   57  108:invokestatic    #91  <Method com.baidu.android.pushservice.d.a com.baidu.android.pushservice.d.b.a(String, String, HashMap)>
	//   58  111:astore_1        
			if(((com.baidu.android.pushservice.d.a) (obj)).b() == 200)
	//*  59  112:aload_1         
	//*  60  113:invokevirtual   #96  <Method int com.baidu.android.pushservice.d.a.b()>
	//*  61  116:sipush          200
	//*  62  119:icmpne          137
			{
				com.baidu.android.pushservice.e.b.c("PublicMsg", "<<< public msg send result return OK!", d.getApplicationContext());
	//   63  122:ldc1            #71  <String "PublicMsg">
	//   64  124:ldc1            #98  <String "<<< public msg send result return OK!">
	//   65  126:aload_0         
	//   66  127:getfield        #29  <Field Context d>
	//   67  130:invokevirtual   #104 <Method Context Context.getApplicationContext()>
	//   68  133:invokestatic    #109 <Method void com.baidu.android.pushservice.e.b.c(String, String, Context)>
				return;
	//   69  136:return          
			}
		}
	//*  70  137:new             #59  <Class StringBuilder>
	//*  71  140:dup             
	//*  72  141:invokespecial   #60  <Method void StringBuilder()>
	//*  73  144:astore_2        
	//*  74  145:aload_2         
	//*  75  146:ldc1            #111 <String "networkRegister request failed, code=">
	//*  76  148:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//*  77  151:pop             
	//*  78  152:aload_2         
	//*  79  153:aload_1         
	//*  80  154:invokevirtual   #96  <Method int com.baidu.android.pushservice.d.a.b()>
	//*  81  157:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
	//*  82  160:pop             
	//*  83  161:aload_2         
	//*  84  162:ldc1            #116 <String ", err=">
	//*  85  164:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//*  86  167:pop             
	//*  87  168:aload_2         
	//*  88  169:aload_1         
	//*  89  170:invokevirtual   #119 <Method java.io.InputStream com.baidu.android.pushservice.d.a.a()>
	//*  90  173:invokestatic    #124 <Method String com.baidu.android.pushservice.f.a.b.a(java.io.InputStream)>
	//*  91  176:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//*  92  179:pop             
	//*  93  180:ldc1            #71  <String "PublicMsg">
	//*  94  182:aload_2         
	//*  95  183:invokevirtual   #75  <Method String StringBuilder.toString()>
	//*  96  186:invokestatic    #126 <Method void a.e(String, String)>
	//*  97  189:return          
		catch(Exception exception)
	//*  98  190:astore_1        
		{
			StringBuilder stringbuilder2 = new StringBuilder();
	//   99  191:new             #59  <Class StringBuilder>
	//  100  194:dup             
	//  101  195:invokespecial   #60  <Method void StringBuilder()>
	//  102  198:astore_2        
			stringbuilder2.append("error : ");
	//  103  199:aload_2         
	//  104  200:ldc1            #128 <String "error : ">
	//  105  202:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//  106  205:pop             
			stringbuilder2.append(exception.getMessage());
	//  107  206:aload_2         
	//  108  207:aload_1         
	//  109  208:invokevirtual   #131 <Method String Exception.getMessage()>
	//  110  211:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//  111  214:pop             
			com.baidu.android.pushservice.e.b.b("PublicMsg", stringbuilder2.toString(), d.getApplicationContext());
	//  112  215:ldc1            #71  <String "PublicMsg">
	//  113  217:aload_2         
	//  114  218:invokevirtual   #75  <Method String StringBuilder.toString()>
	//  115  221:aload_0         
	//  116  222:getfield        #29  <Field Context d>
	//  117  225:invokevirtual   #104 <Method Context Context.getApplicationContext()>
	//  118  228:invokestatic    #133 <Method void com.baidu.android.pushservice.e.b.b(String, String, Context)>
			return;
	//  119  231:return          
		}
		stringbuilder1 = new StringBuilder();
		stringbuilder1.append("networkRegister request failed, code=");
		stringbuilder1.append(((com.baidu.android.pushservice.d.a) (obj)).b());
		stringbuilder1.append(", err=");
		stringbuilder1.append(com.baidu.android.pushservice.f.a.b.a(((com.baidu.android.pushservice.d.a) (obj)).a()));
		com.baidu.android.pushservice.e.a.e("PublicMsg", stringbuilder1.toString());
		return;
	}

	final String a;
	final String b;
	final String c;
	final Context d;
	final PublicMsg e;

	PublicMsg$1(PublicMsg publicmsg, String s, short word0, String s1, String s2, String s3, Context context)
	{
		e = publicmsg;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field PublicMsg e>
		a = s1;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #23  <Field String a>
		b = s2;
	//    6   11:aload_0         
	//    7   12:aload           5
	//    8   14:putfield        #25  <Field String b>
		c = s3;
	//    9   17:aload_0         
	//   10   18:aload           6
	//   11   20:putfield        #27  <Field String c>
		d = context;
	//   12   23:aload_0         
	//   13   24:aload           7
	//   14   26:putfield        #29  <Field Context d>
		super(s, word0);
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:iload_3         
	//   18   32:invokespecial   #32  <Method void c(String, short)>
	//   19   35:return          
	}
}
