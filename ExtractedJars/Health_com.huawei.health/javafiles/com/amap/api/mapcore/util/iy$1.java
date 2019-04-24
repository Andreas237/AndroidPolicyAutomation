// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;

// Referenced classes of package com.amap.api.mapcore.util:
//			iy, gy, iw

final class iy$1
	implements Runnable
{

	public final void run()
	{
		if(!a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field boolean a>
	//*   2    4:ifne            26
		{
			g.a(b, c.a());
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field iy g>
	//    5   11:aload_0         
	//    6   12:getfield        #30  <Field Context b>
	//    7   15:aload_0         
	//    8   16:getfield        #32  <Field gy c>
	//    9   19:invokevirtual   #48  <Method String gy.a()>
	//   10   22:invokevirtual   #51  <Method void iy.a(Context, String)>
			return;
	//   11   25:return          
		}
		g.a(b, c.a(), d);
	//   12   26:aload_0         
	//   13   27:getfield        #26  <Field iy g>
	//   14   30:aload_0         
	//   15   31:getfield        #30  <Field Context b>
	//   16   34:aload_0         
	//   17   35:getfield        #32  <Field gy c>
	//   18   38:invokevirtual   #48  <Method String gy.a()>
	//   19   41:aload_0         
	//   20   42:getfield        #34  <Field boolean d>
	//   21   45:invokevirtual   #54  <Method void iy.a(Context, String, boolean)>
		if(!d)
	//*  22   48:aload_0         
	//*  23   49:getfield        #34  <Field boolean d>
	//*  24   52:ifne            56
			return;
	//   25   55:return          
		if(!iw.a(e))
	//*  26   56:aload_0         
	//*  27   57:getfield        #36  <Field iw e>
	//*  28   60:invokestatic    #59  <Method boolean iw.a(iw)>
	//*  29   63:ifne            67
		{
			return;
	//   30   66:return          
		} else
		{
			g.a(b, c, e, iy.a(g), f);
	//   31   67:aload_0         
	//   32   68:getfield        #26  <Field iy g>
	//   33   71:aload_0         
	//   34   72:getfield        #30  <Field Context b>
	//   35   75:aload_0         
	//   36   76:getfield        #32  <Field gy c>
	//   37   79:aload_0         
	//   38   80:getfield        #36  <Field iw e>
	//   39   83:aload_0         
	//   40   84:getfield        #26  <Field iy g>
	//   41   87:invokestatic    #62  <Method iw iy.a(iy)>
	//   42   90:aload_0         
	//   43   91:getfield        #38  <Field iw f>
	//   44   94:invokevirtual   #65  <Method void iy.a(Context, gy, iw, iw, iw)>
			return;
	//   45   97:return          
		}
	}

	private boolean a;
	private Context b;
	private gy c;
	private boolean d;
	private iw e;
	private iw f;
	private iy g;

	iy$1(iy iy1, boolean flag, Context context, gy gy1, boolean flag1, iw iw1, iw iw2)
	{
		g = iy1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field iy g>
		a = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #28  <Field boolean a>
		b = context;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #30  <Field Context b>
		c = gy1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #32  <Field gy c>
		d = flag1;
	//   12   21:aload_0         
	//   13   22:iload           5
	//   14   24:putfield        #34  <Field boolean d>
		e = iw1;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #36  <Field iw e>
		f = iw2;
	//   18   33:aload_0         
	//   19   34:aload           7
	//   20   36:putfield        #38  <Field iw f>
		super();
	//   21   39:aload_0         
	//   22   40:invokespecial   #41  <Method void Object()>
	//   23   43:return          
	}
}
