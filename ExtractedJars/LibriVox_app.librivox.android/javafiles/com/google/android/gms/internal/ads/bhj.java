// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bno, bgu, bhi

final class bhj
{

	bhj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
	//    2    4:return          
	}

	public final void a(int i1)
	{
		bno bno1 = q;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field bno q>
	//    2    4:astore_2        
		if(bno1 == null || bno1.c() < i1)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #45  <Method int bno.c()>
	//*   7   13:iload_1         
	//*   8   14:icmpge          29
			q = new bno(i1);
	//    9   17:aload_0         
	//   10   18:new             #42  <Class bno>
	//   11   21:dup             
	//   12   22:iload_1         
	//   13   23:invokespecial   #47  <Method void bno(int)>
	//   14   26:putfield        #40  <Field bno q>
		p = i1;
	//   15   29:aload_0         
	//   16   30:iload_1         
	//   17   31:putfield        #49  <Field int p>
		m = true;
	//   18   34:aload_0         
	//   19   35:iconst_1        
	//   20   36:putfield        #51  <Field boolean m>
		r = true;
	//   21   39:aload_0         
	//   22   40:iconst_1        
	//   23   41:putfield        #53  <Field boolean r>
	//   24   44:return          
	}

	public final long b(int i1)
	{
		return k[i1] + (long)j[i1];
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field long[] k>
	//    2    4:iload_1         
	//    3    5:laload          
	//    4    6:aload_0         
	//    5    7:getfield        #58  <Field int[] j>
	//    6   10:iload_1         
	//    7   11:iaload          
	//    8   12:i2l             
	//    9   13:ladd            
	//   10   14:lreturn         
	}

	public bgu a;
	public long b;
	public long c;
	public long d;
	public int e;
	public int f;
	public long g[];
	public int h[];
	public int i[];
	public int j[];
	public long k[];
	public boolean l[];
	public boolean m;
	public boolean n[];
	public bhi o;
	public int p;
	public bno q;
	public boolean r;
	public long s;
}
