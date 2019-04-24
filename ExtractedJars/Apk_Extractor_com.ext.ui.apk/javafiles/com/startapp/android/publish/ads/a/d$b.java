// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.a;

import com.startapp.android.publish.adsCommon.f.a.a;
import com.startapp.android.publish.adsCommon.f.a.c;
import com.startapp.android.publish.adsCommon.f.a.d;
import com.startapp.android.publish.adsCommon.f.b.b;
import com.startapp.common.a.g;
import java.util.Map;

// Referenced classes of package com.startapp.android.publish.ads.a:
//			d

private class d$b extends a
{

	public void close()
	{
		g.a("MraidMode", 3, "close");
	//    0    0:ldc1            #23  <String "MraidMode">
	//    1    2:iconst_3        
	//    2    3:ldc1            #24  <String "close">
	//    3    5:invokestatic    #30  <Method void g.a(String, int, String)>
		com.startapp.android.publish.ads.a.d.a(com.startapp.android.publish.ads.a.d.this, d.e);
	//    4    8:aload_0         
	//    5    9:getfield        #14  <Field com.startapp.android.publish.ads.a.d this$0>
	//    6   12:getstatic       #36  <Field d d.e>
	//    7   15:invokestatic    #39  <Method d com.startapp.android.publish.ads.a.d.a(com.startapp.android.publish.ads.a.d, d)>
	//    8   18:pop             
		c.a(com.startapp.android.publish.ads.a.d.b(com.startapp.android.publish.ads.a.d.this), com.startapp.android.publish.ads.a.d.this.d);
	//    9   19:aload_0         
	//   10   20:getfield        #14  <Field com.startapp.android.publish.ads.a.d this$0>
	//   11   23:invokestatic    #42  <Method d com.startapp.android.publish.ads.a.d.b(com.startapp.android.publish.ads.a.d)>
	//   12   26:aload_0         
	//   13   27:getfield        #14  <Field com.startapp.android.publish.ads.a.d this$0>
	//   14   30:getfield        #46  <Field android.webkit.WebView com.startapp.android.publish.ads.a.d.d>
	//   15   33:invokestatic    #51  <Method void c.a(d, android.webkit.WebView)>
		f.run();
	//   16   36:aload_0         
	//   17   37:getfield        #14  <Field com.startapp.android.publish.ads.a.d this$0>
	//   18   40:getfield        #55  <Field Runnable d.f>
	//   19   43:invokeinterface #60  <Method void Runnable.run()>
	//   20   48:return          
	}

	public void fireViewableChangeEvent()
	{
		c.a(com.startapp.android.publish.ads.a.d.this.d, d.h(com.startapp.android.publish.ads.a.d.this));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field com.startapp.android.publish.ads.a.d this$0>
	//    2    4:getfield        #46  <Field android.webkit.WebView com.startapp.android.publish.ads.a.d.d>
	//    3    7:aload_0         
	//    4    8:getfield        #14  <Field com.startapp.android.publish.ads.a.d this$0>
	//    5   11:invokestatic    #65  <Method boolean d.h(com.startapp.android.publish.ads.a.d)>
	//    6   14:invokestatic    #68  <Method void c.a(android.webkit.WebView, boolean)>
	//    7   17:return          
	}

	public boolean isFeatureSupported(String s)
	{
		return com.startapp.android.publish.ads.a.d.g(com.startapp.android.publish.ads.a.d.this).a(s);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field com.startapp.android.publish.ads.a.d this$0>
	//    2    4:invokestatic    #74  <Method b com.startapp.android.publish.ads.a.d.g(com.startapp.android.publish.ads.a.d)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #78  <Method boolean b.a(String)>
	//    5   11:ireturn         
	}

	public void setOrientationProperties(Map map)
	{
		g.a("MraidMode", 3, (new StringBuilder()).append("setOrientationProperties: ").append(((Object) (map))).toString());
	//    0    0:ldc1            #23  <String "MraidMode">
	//    1    2:iconst_3        
	//    2    3:new             #82  <Class StringBuilder>
	//    3    6:dup             
	//    4    7:invokespecial   #84  <Method void StringBuilder()>
	//    5   10:ldc1            #86  <String "setOrientationProperties: ">
	//    6   12:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #93  <Method StringBuilder StringBuilder.append(Object)>
	//    9   19:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   10   22:invokestatic    #30  <Method void g.a(String, int, String)>
		boolean flag = Boolean.parseBoolean((String)map.get("allowOrientationChange"));
	//   11   25:aload_1         
	//   12   26:ldc1            #99  <String "allowOrientationChange">
	//   13   28:invokeinterface #105 <Method Object Map.get(Object)>
	//   14   33:checkcast       #107 <Class String>
	//   15   36:invokestatic    #112 <Method boolean Boolean.parseBoolean(String)>
	//   16   39:istore_2        
		map = ((Map) ((String)map.get("forceOrientation")));
	//   17   40:aload_1         
	//   18   41:ldc1            #114 <String "forceOrientation">
	//   19   43:invokeinterface #105 <Method Object Map.get(Object)>
	//   20   48:checkcast       #107 <Class String>
	//   21   51:astore_1        
		if(d.f(com.startapp.android.publish.ads.a.d.this).a != flag || d.f(com.startapp.android.publish.ads.a.d.this).b != com.startapp.android.publish.adsCommon.f.c.a.a(((String) (map))))
	//*  22   52:aload_0         
	//*  23   53:getfield        #14  <Field com.startapp.android.publish.ads.a.d this$0>
	//*  24   56:invokestatic    #117 <Method com.startapp.android.publish.adsCommon.f.c.a d.f(com.startapp.android.publish.ads.a.d)>
	//*  25   59:getfield        #122 <Field boolean com.startapp.android.publish.adsCommon.f.c.a.a>
	//*  26   62:iload_2         
	//*  27   63:icmpne          83
	//*  28   66:aload_0         
	//*  29   67:getfield        #14  <Field com.startapp.android.publish.ads.a.d this$0>
	//*  30   70:invokestatic    #117 <Method com.startapp.android.publish.adsCommon.f.c.a d.f(com.startapp.android.publish.ads.a.d)>
	//*  31   73:getfield        #125 <Field int com.startapp.android.publish.adsCommon.f.c.a.b>
	//*  32   76:aload_1         
	//*  33   77:invokestatic    #128 <Method int com.startapp.android.publish.adsCommon.f.c.a.a(String)>
	//*  34   80:icmpeq          126
		{
			d.f(com.startapp.android.publish.ads.a.d.this).a = flag;
	//   35   83:aload_0         
	//   36   84:getfield        #14  <Field com.startapp.android.publish.ads.a.d this$0>
	//   37   87:invokestatic    #117 <Method com.startapp.android.publish.adsCommon.f.c.a d.f(com.startapp.android.publish.ads.a.d)>
	//   38   90:iload_2         
	//   39   91:putfield        #122 <Field boolean com.startapp.android.publish.adsCommon.f.c.a.a>
			d.f(com.startapp.android.publish.ads.a.d.this).b = com.startapp.android.publish.adsCommon.f.c.a.a(((String) (map)));
	//   40   94:aload_0         
	//   41   95:getfield        #14  <Field com.startapp.android.publish.ads.a.d this$0>
	//   42   98:invokestatic    #117 <Method com.startapp.android.publish.adsCommon.f.c.a d.f(com.startapp.android.publish.ads.a.d)>
	//   43  101:aload_1         
	//   44  102:invokestatic    #128 <Method int com.startapp.android.publish.adsCommon.f.c.a.a(String)>
	//   45  105:putfield        #125 <Field int com.startapp.android.publish.adsCommon.f.c.a.b>
			applyOrientationProperties(com.startapp.android.publish.ads.a.d.this.b(), d.f(com.startapp.android.publish.ads.a.d.this));
	//   46  108:aload_0         
	//   47  109:aload_0         
	//   48  110:getfield        #14  <Field com.startapp.android.publish.ads.a.d this$0>
	//   49  113:invokevirtual   #131 <Method android.app.Activity com.startapp.android.publish.ads.a.d.b()>
	//   50  116:aload_0         
	//   51  117:getfield        #14  <Field com.startapp.android.publish.ads.a.d this$0>
	//   52  120:invokestatic    #117 <Method com.startapp.android.publish.adsCommon.f.c.a d.f(com.startapp.android.publish.ads.a.d)>
	//   53  123:invokevirtual   #135 <Method void applyOrientationProperties(android.app.Activity, com.startapp.android.publish.adsCommon.f.c.a)>
		}
	//   54  126:return          
	}

	public void useCustomClose(String s)
	{
label0:
		{
			g.a("MraidMode", 3, (new StringBuilder()).append("useCustomClose: ").append(s).toString());
	//    0    0:ldc1            #23  <String "MraidMode">
	//    1    2:iconst_3        
	//    2    3:new             #82  <Class StringBuilder>
	//    3    6:dup             
	//    4    7:invokespecial   #84  <Method void StringBuilder()>
	//    5   10:ldc1            #141 <String "useCustomClose: ">
	//    6   12:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   10   22:invokestatic    #30  <Method void g.a(String, int, String)>
			boolean flag = Boolean.parseBoolean(s);
	//   11   25:aload_1         
	//   12   26:invokestatic    #112 <Method boolean Boolean.parseBoolean(String)>
	//   13   29:istore_2        
			if(com.startapp.android.publish.ads.a.d.c(com.startapp.android.publish.ads.a.d.this) != flag)
	//*  14   30:aload_0         
	//*  15   31:getfield        #14  <Field com.startapp.android.publish.ads.a.d this$0>
	//*  16   34:invokestatic    #144 <Method boolean com.startapp.android.publish.ads.a.d.c(com.startapp.android.publish.ads.a.d)>
	//*  17   37:iload_2         
	//*  18   38:icmpeq          61
			{
				com.startapp.android.publish.ads.a.d.a(com.startapp.android.publish.ads.a.d.this, flag);
	//   19   41:aload_0         
	//   20   42:getfield        #14  <Field com.startapp.android.publish.ads.a.d this$0>
	//   21   45:iload_2         
	//   22   46:invokestatic    #147 <Method boolean com.startapp.android.publish.ads.a.d.a(com.startapp.android.publish.ads.a.d, boolean)>
	//   23   49:pop             
				if(!flag)
					break label0;
	//   24   50:iload_2         
	//   25   51:ifeq            62
				com.startapp.android.publish.ads.a.d.d(com.startapp.android.publish.ads.a.d.this);
	//   26   54:aload_0         
	//   27   55:getfield        #14  <Field com.startapp.android.publish.ads.a.d this$0>
	//   28   58:invokestatic    #150 <Method void com.startapp.android.publish.ads.a.d.d(com.startapp.android.publish.ads.a.d)>
			}
			return;
	//   29   61:return          
		}
		d.e(com.startapp.android.publish.ads.a.d.this);
	//   30   62:aload_0         
	//   31   63:getfield        #14  <Field com.startapp.android.publish.ads.a.d this$0>
	//   32   66:invokestatic    #152 <Method void d.e(com.startapp.android.publish.ads.a.d)>
	//   33   69:return          
	}

	final com.startapp.android.publish.ads.a.d this$0;

	public d$b(com.startapp.android.publish.adsCommon.f.a.a$a a$a)
	{
		this$0 = com.startapp.android.publish.ads.a.d.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field com.startapp.android.publish.ads.a.d this$0>
		super(a$a);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #17  <Method void a(com.startapp.android.publish.adsCommon.f.a.a$a)>
	//    6   10:return          
	}
}
