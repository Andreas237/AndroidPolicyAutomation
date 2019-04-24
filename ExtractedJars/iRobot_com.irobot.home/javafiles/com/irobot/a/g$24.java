// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.a;

import java.util.Locale;

// Referenced classes of package com.irobot.a:
//			g, d

class g$24
	implements j.a
{

	public void a(j.b b)
	{
		a.y = null;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field g a>
	//    2    4:aconst_null     
	//    3    5:putfield        #25  <Field j g.y>
		if(b != j.b.XFER_OK)
	//*   4    8:aload_1         
	//*   5    9:getstatic       #31  <Field j$b j$b.XFER_OK>
	//*   6   12:if_acmpeq       65
		{
			b = ((j.b) (String.format(Locale.US, "Connection Interval Failed: %s", new Object[] {
				b.toString()
			})));
	//    7   15:getstatic       #37  <Field Locale Locale.US>
	//    8   18:ldc1            #39  <String "Connection Interval Failed: %s">
	//    9   20:iconst_1        
	//   10   21:anewarray       Object[]
	//   11   24:dup             
	//   12   25:iconst_0        
	//   13   26:aload_1         
	//   14   27:invokevirtual   #43  <Method String j$b.toString()>
	//   15   30:aastore         
	//   16   31:invokestatic    #49  <Method String String.format(Locale, String, Object[])>
	//   17   34:astore_1        
			b = ((j.b) (new d(d.a.ALOperationFailedError, ((String) (b)))));
	//   18   35:new             #51  <Class d>
	//   19   38:dup             
	//   20   39:getstatic       #57  <Field d$a d$a.ALOperationFailedError>
	//   21   42:aload_1         
	//   22   43:invokespecial   #60  <Method void d(d$a, String)>
	//   23   46:astore_1        
			a.a.o(a, ((d) (b)));
	//   24   47:aload_0         
	//   25   48:getfield        #17  <Field g a>
	//   26   51:getfield        #63  <Field g$f g.a>
	//   27   54:aload_0         
	//   28   55:getfield        #17  <Field g a>
	//   29   58:aload_1         
	//   30   59:invokeinterface #69  <Method void g$f.o(g, d)>
			return;
	//   31   64:return          
		} else
		{
			a.a.o(a, ((d) (null)));
	//   32   65:aload_0         
	//   33   66:getfield        #17  <Field g a>
	//   34   69:getfield        #63  <Field g$f g.a>
	//   35   72:aload_0         
	//   36   73:getfield        #17  <Field g a>
	//   37   76:aconst_null     
	//   38   77:invokeinterface #69  <Method void g$f.o(g, d)>
			return;
	//   39   82:return          
		}
	}

	final g a;

	g$24(g g1)
	{
		a = g1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field g a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
