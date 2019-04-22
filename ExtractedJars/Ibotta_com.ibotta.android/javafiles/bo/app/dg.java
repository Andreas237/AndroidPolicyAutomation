// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import java.util.concurrent.Executor;

// Referenced classes of package bo.app:
//			dd, cv, db, d, 
//			g, ad, dr, dx, 
//			dn, bt, dc

public class dg
	implements dd
{

	public dg(d d1, g g1, ad ad, ad ad1, Executor executor, dr dr, dx dx, 
			dn dn)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		a = d1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #30  <Field d a>
		b = g1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #32  <Field g b>
		c = ad;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #34  <Field ad c>
		d = ad1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #36  <Field ad d>
		e = executor;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #38  <Field Executor e>
		f = dr;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #40  <Field dr f>
		g = dx;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #42  <Field dx g>
		h = dn;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #44  <Field dn h>
	//   26   49:return          
	}

	private cv a(db db1)
	{
		return new cv(db1, a, b, c, d, f, i, g, h);
	//    0    0:new             #49  <Class cv>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field d a>
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field g b>
	//    7   13:aload_0         
	//    8   14:getfield        #34  <Field ad c>
	//    9   17:aload_0         
	//   10   18:getfield        #36  <Field ad d>
	//   11   21:aload_0         
	//   12   22:getfield        #40  <Field dr f>
	//   13   25:aload_0         
	//   14   26:getfield        #51  <Field bt i>
	//   15   29:aload_0         
	//   16   30:getfield        #42  <Field dx g>
	//   17   33:aload_0         
	//   18   34:getfield        #44  <Field dn h>
	//   19   37:invokespecial   #54  <Method void cv(db, d, g, ad, ad, dr, bt, dx, dn)>
	//   20   40:areturn         
	}

	public void a(bt bt)
	{
		i = bt;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field bt i>
	//    3    5:return          
	}

	public void a(dc dc)
	{
		dc = ((dc) ((db)dc));
	//    0    0:aload_1         
	//    1    1:checkcast       #59  <Class db>
	//    2    4:astore_1        
		e.execute(((Runnable) (a(((db) (dc))))));
	//    3    5:aload_0         
	//    4    6:getfield        #38  <Field Executor e>
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #61  <Method cv a(db)>
	//    8   14:invokeinterface #67  <Method void Executor.execute(Runnable)>
	//    9   19:return          
	}

	public void b(dc dc)
	{
		a((db)dc).run();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #59  <Class db>
	//    3    5:invokespecial   #61  <Method cv a(db)>
	//    4    8:invokevirtual   #70  <Method void cv.run()>
	//    5   11:return          
	}

	private final d a;
	private final g b;
	private final ad c;
	private final ad d;
	private final Executor e;
	private final dr f;
	private final dx g;
	private final dn h;
	private bt i;
}
