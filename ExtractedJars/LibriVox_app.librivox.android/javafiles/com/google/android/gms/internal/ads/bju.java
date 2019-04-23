// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bfw, bfl, bjv, zzfs, 
//			bfo, bfx, bno

final class bju
	implements bfw
{

	public bju(int i, int j, zzfs zzfs1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		b = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #21  <Field int b>
		c = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #23  <Field int c>
		d = zzfs1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #25  <Field zzfs d>
	//   11   19:return          
	}

	public final int a(bfo bfo, int i, boolean flag)
	{
		return e.a(bfo, i, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field bfw e>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokeinterface #31  <Method int bfw.a(bfo, int, boolean)>
	//    6   12:ireturn         
	}

	public final void a(long l, int i, int j, int k, bfx bfx)
	{
		e.a(l, i, j, k, bfx);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field bfw e>
	//    2    4:lload_1         
	//    3    5:iload_3         
	//    4    6:iload           4
	//    5    8:iload           5
	//    6   10:aload           6
	//    7   12:invokeinterface #34  <Method void bfw.a(long, int, int, int, bfx)>
	//    8   17:return          
	}

	public final void a(bjv bjv1)
	{
		if(bjv1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       16
		{
			e = ((bfw) (new bfl()));
	//    2    4:aload_0         
	//    3    5:new             #37  <Class bfl>
	//    4    8:dup             
	//    5    9:invokespecial   #38  <Method void bfl()>
	//    6   12:putfield        #29  <Field bfw e>
			return;
	//    7   15:return          
		}
		e = bjv1.a(b, c);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #21  <Field int b>
	//   12   22:aload_0         
	//   13   23:getfield        #23  <Field int c>
	//   14   26:invokeinterface #43  <Method bfw bjv.a(int, int)>
	//   15   31:putfield        #29  <Field bfw e>
		bjv1 = ((bjv) (e));
	//   16   34:aload_0         
	//   17   35:getfield        #29  <Field bfw e>
	//   18   38:astore_1        
		if(bjv1 != null)
	//*  19   39:aload_1         
	//*  20   40:ifnull          53
			((bfw) (bjv1)).a(a);
	//   21   43:aload_1         
	//   22   44:aload_0         
	//   23   45:getfield        #45  <Field zzfs a>
	//   24   48:invokeinterface #48  <Method void bfw.a(zzfs)>
	//   25   53:return          
	}

	public final void a(bno bno, int i)
	{
		e.a(bno, i);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field bfw e>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokeinterface #51  <Method void bfw.a(bno, int)>
	//    5   11:return          
	}

	public final void a(zzfs zzfs1)
	{
		a = zzfs1.a(d);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #25  <Field zzfs d>
	//    4    6:invokevirtual   #56  <Method zzfs zzfs.a(zzfs)>
	//    5    9:putfield        #45  <Field zzfs a>
		e.a(a);
	//    6   12:aload_0         
	//    7   13:getfield        #29  <Field bfw e>
	//    8   16:aload_0         
	//    9   17:getfield        #45  <Field zzfs a>
	//   10   20:invokeinterface #48  <Method void bfw.a(zzfs)>
	//   11   25:return          
	}

	public zzfs a;
	private final int b;
	private final int c;
	private final zzfs d;
	private bfw e;
}
