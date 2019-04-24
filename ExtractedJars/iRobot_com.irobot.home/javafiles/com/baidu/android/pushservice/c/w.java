// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice.c;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.baidu.android.pushservice.e.a;
import java.util.HashMap;

// Referenced classes of package com.baidu.android.pushservice.c:
//			c, b, l, x, 
//			w

public class w extends c
{
	public static interface a
		extends x
	{

		public void a(View view)
		{
			b = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #23  <Field boolean b>
			int i = a.c;
		//    3    5:aload_0         
		//    4    6:getfield        #19  <Field w a>
		//    5    9:getfield        #27  <Field int w.c>
		//    6   12:istore_2        
			x x1 = null;
		//    7   13:aconst_null     
		//    8   14:astore_3        
			if(i > -1)
		//*   9   15:iload_2         
		//*  10   16:iconst_m1       
		//*  11   17:icmple          26
				view.setLayerType(2, ((android.graphics.Paint) (null)));
		//   12   20:aload_1         
		//   13   21:iconst_2        
		//   14   22:aconst_null     
		//   15   23:invokevirtual   #33  <Method void View.setLayerType(int, android.graphics.Paint)>
			if(a.a != null)
		//*  16   26:aload_0         
		//*  17   27:getfield        #19  <Field w a>
		//*  18   30:getfield        #36  <Field Runnable android.support.v4.view.w.a>
		//*  19   33:ifnull          60
			{
				Runnable runnable = a.a;
		//   20   36:aload_0         
		//   21   37:getfield        #19  <Field w a>
		//   22   40:getfield        #36  <Field Runnable android.support.v4.view.w.a>
		//   23   43:astore          4
				a.a = null;
		//   24   45:aload_0         
		//   25   46:getfield        #19  <Field w a>
		//   26   49:aconst_null     
		//   27   50:putfield        #36  <Field Runnable android.support.v4.view.w.a>
				runnable.run();
		//   28   53:aload           4
		//   29   55:invokeinterface #41  <Method void Runnable.run()>
			}
			Object obj = view.getTag(0x7e000000);
		//   30   60:aload_1         
		//   31   61:ldc1            #42  <Int 0x7e000000>
		//   32   63:invokevirtual   #46  <Method Object View.getTag(int)>
		//   33   66:astore          4
			if(obj instanceof x)
		//*  34   68:aload           4
		//*  35   70:instanceof      #6   <Class x>
		//*  36   73:ifeq            82
				x1 = (x)obj;
		//   37   76:aload           4
		//   38   78:checkcast       #6   <Class x>
		//   39   81:astore_3        
			if(x1 != null)
		//*  40   82:aload_3         
		//*  41   83:ifnull          93
				x1.a(view);
		//   42   86:aload_3         
		//   43   87:aload_1         
		//   44   88:invokeinterface #48  <Method void android.support.v4.view.x.a(View)>
		//   45   93:return          
		}

		public void b(View view)
		{
			int i = a.c;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field w a>
		//    2    4:getfield        #27  <Field int w.c>
		//    3    7:istore_2        
			x x1 = null;
		//    4    8:aconst_null     
		//    5    9:astore_3        
			if(i > -1)
		//*   6   10:iload_2         
		//*   7   11:iconst_m1       
		//*   8   12:icmple          35
			{
				view.setLayerType(a.c, ((android.graphics.Paint) (null)));
		//    9   15:aload_1         
		//   10   16:aload_0         
		//   11   17:getfield        #19  <Field w a>
		//   12   20:getfield        #27  <Field int w.c>
		//   13   23:aconst_null     
		//   14   24:invokevirtual   #33  <Method void View.setLayerType(int, android.graphics.Paint)>
				a.c = -1;
		//   15   27:aload_0         
		//   16   28:getfield        #19  <Field w a>
		//   17   31:iconst_m1       
		//   18   32:putfield        #27  <Field int w.c>
			}
			if(android.os.Build.VERSION.SDK_INT >= 16 || !b)
		//*  19   35:getstatic       #53  <Field int android.os.Build$VERSION.SDK_INT>
		//*  20   38:bipush          16
		//*  21   40:icmpge          50
		//*  22   43:aload_0         
		//*  23   44:getfield        #23  <Field boolean b>
		//*  24   47:ifne            122
			{
				if(a.b != null)
		//*  25   50:aload_0         
		//*  26   51:getfield        #19  <Field w a>
		//*  27   54:getfield        #55  <Field Runnable w.b>
		//*  28   57:ifnull          84
				{
					Runnable runnable = a.b;
		//   29   60:aload_0         
		//   30   61:getfield        #19  <Field w a>
		//   31   64:getfield        #55  <Field Runnable w.b>
		//   32   67:astore          4
					a.b = null;
		//   33   69:aload_0         
		//   34   70:getfield        #19  <Field w a>
		//   35   73:aconst_null     
		//   36   74:putfield        #55  <Field Runnable w.b>
					runnable.run();
		//   37   77:aload           4
		//   38   79:invokeinterface #41  <Method void Runnable.run()>
				}
				Object obj = view.getTag(0x7e000000);
		//   39   84:aload_1         
		//   40   85:ldc1            #42  <Int 0x7e000000>
		//   41   87:invokevirtual   #46  <Method Object View.getTag(int)>
		//   42   90:astore          4
				if(obj instanceof x)
		//*  43   92:aload           4
		//*  44   94:instanceof      #6   <Class x>
		//*  45   97:ifeq            106
					x1 = (x)obj;
		//   46  100:aload           4
		//   47  102:checkcast       #6   <Class x>
		//   48  105:astore_3        
				if(x1 != null)
		//*  49  106:aload_3         
		//*  50  107:ifnull          117
					x1.b(view);
		//   51  110:aload_3         
		//   52  111:aload_1         
		//   53  112:invokeinterface #57  <Method void x.b(View)>
				b = true;
		//   54  117:aload_0         
		//   55  118:iconst_1        
		//   56  119:putfield        #23  <Field boolean b>
			}
		//   57  122:return          
		}

		public void c(View view)
		{
			Object obj = view.getTag(0x7e000000);
		//    0    0:aload_1         
		//    1    1:ldc1            #42  <Int 0x7e000000>
		//    2    3:invokevirtual   #46  <Method Object View.getTag(int)>
		//    3    6:astore_2        
			if(obj instanceof x)
		//*   4    7:aload_2         
		//*   5    8:instanceof      #6   <Class x>
		//*   6   11:ifeq            22
				obj = ((Object) ((x)obj));
		//    7   14:aload_2         
		//    8   15:checkcast       #6   <Class x>
		//    9   18:astore_2        
			else
		//*  10   19:goto            24
				obj = null;
		//   11   22:aconst_null     
		//   12   23:astore_2        
			if(obj != null)
		//*  13   24:aload_2         
		//*  14   25:ifnull          35
				((x) (obj)).c(view);
		//   15   28:aload_2         
		//   16   29:aload_1         
		//   17   30:invokeinterface #59  <Method void x.c(View)>
		//   18   35:return          
		}

		w a;
		boolean b;

		a(w w1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			a = w1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field w a>
		//    5    9:return          
		}
	}


	public w(l l, Context context, String s)
	{
		super(l, context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #16  <Method void c(l, Context)>
		d = s;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #18  <Field String d>
	//    7   11:return          
	}

	protected void a(Intent intent)
	{
		super.a(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void com.baidu.android.pushservice.c.c.a(Intent)>
		if(intent != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          38
		{
			int i = intent.getIntExtra("error_msg", -1);
	//    5    9:aload_1         
	//    6   10:ldc1            #24  <String "error_msg">
	//    7   12:iconst_m1       
	//    8   13:invokevirtual   #30  <Method int Intent.getIntExtra(String, int)>
	//    9   16:istore_2        
			if(i != 0 && e != null)
	//*  10   17:iload_2         
	//*  11   18:ifeq            38
	//*  12   21:aload_0         
	//*  13   22:getfield        #32  <Field w$a e>
	//*  14   25:ifnull          38
				e.a(i);
	//   15   28:aload_0         
	//   16   29:getfield        #32  <Field w$a e>
	//   17   32:iload_2         
	//   18   33:invokeinterface #35  <Method void com.baidu.android.pushservice.c.w$a.a(int)>
		}
	//   19   38:return          
	}

	protected void a(HashMap hashmap)
	{
		super.a(hashmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #38  <Method void com.baidu.android.pushservice.c.c.a(HashMap)>
		hashmap.put("method", "settags");
	//    3    5:aload_1         
	//    4    6:ldc1            #40  <String "method">
	//    5    8:ldc1            #42  <String "settags">
	//    6   10:invokevirtual   #48  <Method Object HashMap.put(Object, Object)>
	//    7   13:pop             
		hashmap.put("tags", ((Object) (d)));
	//    8   14:aload_1         
	//    9   15:ldc1            #50  <String "tags">
	//   10   17:aload_0         
	//   11   18:getfield        #18  <Field String d>
	//   12   21:invokevirtual   #48  <Method Object HashMap.put(Object, Object)>
	//   13   24:pop             
		StringBuilder stringbuilder = new StringBuilder();
	//   14   25:new             #52  <Class StringBuilder>
	//   15   28:dup             
	//   16   29:invokespecial   #55  <Method void StringBuilder()>
	//   17   32:astore_2        
		stringbuilder.append("SetTags param -- ");
	//   18   33:aload_2         
	//   19   34:ldc1            #57  <String "SetTags param -- ">
	//   20   36:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append(com.baidu.android.pushservice.c.b.a(hashmap));
	//   22   40:aload_2         
	//   23   41:aload_1         
	//   24   42:invokestatic    #66  <Method String com.baidu.android.pushservice.c.b.a(HashMap)>
	//   25   45:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   26   48:pop             
		com.baidu.android.pushservice.e.a.c("SetTags", stringbuilder.toString());
	//   27   49:ldc1            #68  <String "SetTags">
	//   28   51:aload_2         
	//   29   52:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   30   55:invokestatic    #78  <Method void a.c(String, String)>
	//   31   58:return          
	}

	protected String b(String s)
	{
		if(e != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field w$a e>
	//*   2    4:ifnull          17
			e.a(0);
	//    3    7:aload_0         
	//    4    8:getfield        #32  <Field w$a e>
	//    5   11:iconst_0        
	//    6   12:invokeinterface #35  <Method void com.baidu.android.pushservice.c.w$a.a(int)>
		return super.b(s);
	//    7   17:aload_0         
	//    8   18:aload_1         
	//    9   19:invokespecial   #84  <Method String c.b(String)>
	//   10   22:areturn         
	}

	protected String d;
	protected a e;
}
