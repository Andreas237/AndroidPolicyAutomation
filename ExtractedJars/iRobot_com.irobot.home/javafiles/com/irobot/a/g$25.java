// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.a;

import java.util.Locale;

// Referenced classes of package com.irobot.a:
//			g, d

class g$25
	implements j.a
{

	public void a(j.b b)
	{
		g g1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field g a>
	//    2    4:astore_3        
		d d1 = null;
	//    3    5:aconst_null     
	//    4    6:astore_2        
		g1.y = null;
	//    5    7:aload_3         
	//    6    8:aconst_null     
	//    7    9:putfield        #25  <Field j g.y>
		if(b != j.b.XFER_OK)
	//*   8   12:aload_1         
	//*   9   13:getstatic       #31  <Field j$b j$b.XFER_OK>
	//*  10   16:if_acmpeq       51
		{
			b = ((j.b) (String.format(Locale.US, "Firmware Update Failed: %s", new Object[] {
				b.toString()
			})));
	//   11   19:getstatic       #37  <Field Locale Locale.US>
	//   12   22:ldc1            #39  <String "Firmware Update Failed: %s">
	//   13   24:iconst_1        
	//   14   25:anewarray       Object[]
	//   15   28:dup             
	//   16   29:iconst_0        
	//   17   30:aload_1         
	//   18   31:invokevirtual   #43  <Method String j$b.toString()>
	//   19   34:aastore         
	//   20   35:invokestatic    #49  <Method String String.format(Locale, String, Object[])>
	//   21   38:astore_1        
			d1 = new d(d.a.ALOperationFailedError, ((String) (b)));
	//   22   39:new             #51  <Class d>
	//   23   42:dup             
	//   24   43:getstatic       #57  <Field d$a d$a.ALOperationFailedError>
	//   25   46:aload_1         
	//   26   47:invokespecial   #60  <Method void d(d$a, String)>
	//   27   50:astore_2        
		}
		((g.d)a.a).d(a, d1);
	//   28   51:aload_0         
	//   29   52:getfield        #16  <Field g a>
	//   30   55:getfield        #63  <Field g$f g.a>
	//   31   58:checkcast       #65  <Class g$d>
	//   32   61:aload_0         
	//   33   62:getfield        #16  <Field g a>
	//   34   65:aload_2         
	//   35   66:invokeinterface #69  <Method void g$d.d(g, d)>
	//   36   71:return          
	}

	final g a;

	g$25(g g1)
	{
		a = g1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field g a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
