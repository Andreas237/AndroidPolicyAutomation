// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import java.util.concurrent.Executor;

// Referenced classes of package bo.app:
//			cq, co, cj, a, 
//			d, aa, dc, dh, 
//			bl, cp

public class ct
	implements cq
{

	public ct(a a1, d d1, aa aa, aa aa1, Executor executor, dc dc, dh dh)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		a = a1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field a a>
		b = d1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #30  <Field d b>
		c = aa;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #32  <Field aa c>
		d = aa1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #34  <Field aa d>
		e = executor;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #36  <Field Executor e>
		f = dc;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #38  <Field dc f>
		g = dh;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #40  <Field dh g>
	//   23   43:return          
	}

	public void a(bl bl)
	{
		h = bl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #44  <Field bl h>
	//    3    5:return          
	}

	public void a(cp cp)
	{
		cp = ((cp) ((co)cp));
	//    0    0:aload_1         
	//    1    1:checkcast       #47  <Class co>
	//    2    4:astore_1        
		e.execute(((Runnable) (new cj(((co) (cp)), a, b, c, d, f, h, g))));
	//    3    5:aload_0         
	//    4    6:getfield        #36  <Field Executor e>
	//    5    9:new             #49  <Class cj>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #28  <Field a a>
	//   10   18:aload_0         
	//   11   19:getfield        #30  <Field d b>
	//   12   22:aload_0         
	//   13   23:getfield        #32  <Field aa c>
	//   14   26:aload_0         
	//   15   27:getfield        #34  <Field aa d>
	//   16   30:aload_0         
	//   17   31:getfield        #38  <Field dc f>
	//   18   34:aload_0         
	//   19   35:getfield        #44  <Field bl h>
	//   20   38:aload_0         
	//   21   39:getfield        #40  <Field dh g>
	//   22   42:invokespecial   #52  <Method void cj(co, a, d, aa, aa, dc, bl, dh)>
	//   23   45:invokeinterface #58  <Method void Executor.execute(Runnable)>
	//   24   50:return          
	}

	public void b(cp cp)
	{
		(new cj((co)cp, a, b, c, d, f, h, g)).run();
	//    0    0:new             #49  <Class cj>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:checkcast       #47  <Class co>
	//    4    8:aload_0         
	//    5    9:getfield        #28  <Field a a>
	//    6   12:aload_0         
	//    7   13:getfield        #30  <Field d b>
	//    8   16:aload_0         
	//    9   17:getfield        #32  <Field aa c>
	//   10   20:aload_0         
	//   11   21:getfield        #34  <Field aa d>
	//   12   24:aload_0         
	//   13   25:getfield        #38  <Field dc f>
	//   14   28:aload_0         
	//   15   29:getfield        #44  <Field bl h>
	//   16   32:aload_0         
	//   17   33:getfield        #40  <Field dh g>
	//   18   36:invokespecial   #52  <Method void cj(co, a, d, aa, aa, dc, bl, dh)>
	//   19   39:invokevirtual   #61  <Method void cj.run()>
	//   20   42:return          
	}

	private final a a;
	private final d b;
	private final aa c;
	private final aa d;
	private final Executor e;
	private final dc f;
	private final dh g;
	private bl h;
}
