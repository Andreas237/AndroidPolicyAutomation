// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;

// Referenced classes of package com.amap.api.mapcore.util:
//			iy, iv, gy, iw, 
//			it, io

final class iy$2
	implements Runnable
{

	public final void run()
	{
		iw iw1 = iv.b(a);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Context a>
	//    2    4:invokestatic    #32  <Method iw iv.b(Context)>
	//    3    7:astore_1        
		if(!b.a().equals(((Object) (iw1.a()))))
	//*   4    8:aload_0         
	//*   5    9:getfield        #22  <Field gy b>
	//*   6   12:invokevirtual   #37  <Method String gy.a()>
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #40  <Method String iw.a()>
	//*   9   19:invokevirtual   #46  <Method boolean String.equals(Object)>
	//*  10   22:ifne            26
			return;
	//   11   25:return          
		if(!iy.a(c, a, iw1, b))
	//*  12   26:aload_0         
	//*  13   27:getfield        #18  <Field iy c>
	//*  14   30:aload_0         
	//*  15   31:getfield        #20  <Field Context a>
	//*  16   34:aload_1         
	//*  17   35:aload_0         
	//*  18   36:getfield        #22  <Field gy b>
	//*  19   39:invokestatic    #49  <Method boolean iy.a(iy, Context, iw, gy)>
	//*  20   42:ifne            63
		{
			iy.b(c).a(b.a());
	//   21   45:aload_0         
	//   22   46:getfield        #18  <Field iy c>
	//   23   49:invokestatic    #52  <Method it iy.b(iy)>
	//   24   52:aload_0         
	//   25   53:getfield        #22  <Field gy b>
	//   26   56:invokevirtual   #37  <Method String gy.a()>
	//   27   59:invokevirtual   #57  <Method void it.a(String)>
			return;
	//   28   62:return          
		}
		iw iw2 = iv.a(a);
	//   29   63:aload_0         
	//   30   64:getfield        #20  <Field Context a>
	//   31   67:invokestatic    #59  <Method iw iv.a(Context)>
	//   32   70:astore_2        
		if(!iy.a(c, iw2, iw1))
	//*  33   71:aload_0         
	//*  34   72:getfield        #18  <Field iy c>
	//*  35   75:aload_2         
	//*  36   76:aload_1         
	//*  37   77:invokestatic    #62  <Method boolean iy.a(iy, iw, iw)>
	//*  38   80:ifne            98
		{
			iy.b(c).a(iw1.a());
	//   39   83:aload_0         
	//   40   84:getfield        #18  <Field iy c>
	//   41   87:invokestatic    #52  <Method it iy.b(iy)>
	//   42   90:aload_1         
	//   43   91:invokevirtual   #40  <Method String iw.a()>
	//   44   94:invokevirtual   #57  <Method void it.a(String)>
			return;
	//   45   97:return          
		} else
		{
			io.a(a, iy.c(c));
	//   46   98:aload_0         
	//   47   99:getfield        #20  <Field Context a>
	//   48  102:aload_0         
	//   49  103:getfield        #18  <Field iy c>
	//   50  106:invokestatic    #65  <Method ik iy.c(iy)>
	//   51  109:invokestatic    #70  <Method void io.a(Context, ik)>
			return;
	//   52  112:return          
		}
	}

	private Context a;
	private gy b;
	private iy c;

	iy$2(iy iy1, Context context, gy gy1)
	{
		c = iy1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field iy c>
		a = context;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field Context a>
		b = gy1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #22  <Field gy b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #25  <Method void Object()>
	//   11   19:return          
	}
}
