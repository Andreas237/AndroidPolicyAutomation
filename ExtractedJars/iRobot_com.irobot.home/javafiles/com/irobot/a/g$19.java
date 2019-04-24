// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.a;

import android.util.Log;
import java.util.Locale;

// Referenced classes of package com.irobot.a:
//			g, d

class g$19
	implements j.a
{

	public void a(j.b b)
	{
		g g1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field g a>
	//    2    4:astore_3        
		Object obj = null;
	//    3    5:aconst_null     
	//    4    6:astore_2        
		g1.y = null;
	//    5    7:aload_3         
	//    6    8:aconst_null     
	//    7    9:putfield        #25  <Field j g.y>
		if(b != j.b.XFER_OK)
	//*   8   12:aload_1         
	//*   9   13:getstatic       #31  <Field j$b j$b.XFER_OK>
	//*  10   16:if_acmpeq       61
		{
			b = ((j.b) (String.format(Locale.US, "Identify Robot Failed: %s", new Object[] {
				b.toString()
			})));
	//   11   19:getstatic       #37  <Field Locale Locale.US>
	//   12   22:ldc1            #39  <String "Identify Robot Failed: %s">
	//   13   24:iconst_1        
	//   14   25:anewarray       Object[]
	//   15   28:dup             
	//   16   29:iconst_0        
	//   17   30:aload_1         
	//   18   31:invokevirtual   #43  <Method String j$b.toString()>
	//   19   34:aastore         
	//   20   35:invokestatic    #49  <Method String String.format(Locale, String, Object[])>
	//   21   38:astore_1        
			Log.i("ALRobot", ((String) (b)));
	//   22   39:ldc1            #51  <String "ALRobot">
	//   23   41:aload_1         
	//   24   42:invokestatic    #57  <Method int Log.i(String, String)>
	//   25   45:pop             
			b = ((j.b) (new d(d.a.ALOperationFailedError, ((String) (b)))));
	//   26   46:new             #59  <Class d>
	//   27   49:dup             
	//   28   50:getstatic       #65  <Field d$a d$a.ALOperationFailedError>
	//   29   53:aload_1         
	//   30   54:invokespecial   #68  <Method void d(d$a, String)>
	//   31   57:astore_1        
		} else
	//*  32   58:goto            71
		{
			a.n = true;
	//   33   61:aload_0         
	//   34   62:getfield        #17  <Field g a>
	//   35   65:iconst_1        
	//   36   66:putfield        #72  <Field boolean g.n>
			b = ((j.b) (obj));
	//   37   69:aload_2         
	//   38   70:astore_1        
		}
		((g.g)a.a).r(a, ((d) (b)));
	//   39   71:aload_0         
	//   40   72:getfield        #17  <Field g a>
	//   41   75:getfield        #75  <Field g$f g.a>
	//   42   78:checkcast       #77  <Class g$g>
	//   43   81:aload_0         
	//   44   82:getfield        #17  <Field g a>
	//   45   85:aload_1         
	//   46   86:invokeinterface #81  <Method void g$g.r(g, d)>
	//   47   91:return          
	}

	final g a;

	g$19(g g1)
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
