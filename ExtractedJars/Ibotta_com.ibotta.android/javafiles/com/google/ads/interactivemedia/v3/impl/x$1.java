// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;

import android.view.SurfaceHolder;
import com.google.ads.interactivemedia.v3.a.g;

// Referenced classes of package com.google.ads.interactivemedia.v3.impl:
//			x

class x$1
	implements android.view.aceHolder.Callback
{

	public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
	{
	//    0    0:return          
	}

	public void surfaceCreated(SurfaceHolder surfaceholder)
	{
		x.a(b, true);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field x b>
	//    2    4:iconst_1        
	//    3    5:invokestatic    #31  <Method boolean x.a(x, boolean)>
	//    4    8:pop             
		if(x.a(b) == x$f.c || x.a(b) == x$f.d)
	//*   5    9:aload_0         
	//*   6   10:getfield        #18  <Field x b>
	//*   7   13:invokestatic    #34  <Method x$f x.a(x)>
	//*   8   16:getstatic       #40  <Field x$f x$f.c>
	//*   9   19:if_acmpeq       35
	//*  10   22:aload_0         
	//*  11   23:getfield        #18  <Field x b>
	//*  12   26:invokestatic    #34  <Method x$f x.a(x)>
	//*  13   29:getstatic       #43  <Field x$f x$f.d>
	//*  14   32:if_acmpne       49
			x.a(b, surfaceholder.getSurface(), false);
	//   15   35:aload_0         
	//   16   36:getfield        #18  <Field x b>
	//   17   39:aload_1         
	//   18   40:invokeinterface #49  <Method android.view.Surface SurfaceHolder.getSurface()>
	//   19   45:iconst_0        
	//   20   46:invokestatic    #52  <Method void x.a(x, android.view.Surface, boolean)>
		if(x.a(b) == x$f.c)
	//*  21   49:aload_0         
	//*  22   50:getfield        #18  <Field x b>
	//*  23   53:invokestatic    #34  <Method x$f x.a(x)>
	//*  24   56:getstatic       #40  <Field x$f x$f.c>
	//*  25   59:if_acmpne       72
			a.a(true);
	//   26   62:aload_0         
	//   27   63:getfield        #20  <Field g a>
	//   28   66:iconst_1        
	//   29   67:invokeinterface #57  <Method void g.a(boolean)>
	//   30   72:return          
	}

	public void surfaceDestroyed(SurfaceHolder surfaceholder)
	{
		x.a(b, ((android.view.Surface) (null)), true);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field x b>
	//    2    4:aconst_null     
	//    3    5:iconst_1        
	//    4    6:invokestatic    #52  <Method void x.a(x, android.view.Surface, boolean)>
		a.a(false);
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field g a>
	//    7   13:iconst_0        
	//    8   14:invokeinterface #57  <Method void g.a(boolean)>
		x.a(b, false);
	//    9   19:aload_0         
	//   10   20:getfield        #18  <Field x b>
	//   11   23:iconst_0        
	//   12   24:invokestatic    #31  <Method boolean x.a(x, boolean)>
	//   13   27:pop             
	//   14   28:return          
	}

	final g a;
	final x b;

	x$1(x x1, g g1)
	{
		b = x1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field x b>
		a = g1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field g a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
