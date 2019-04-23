// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bks, bfj, bld

public final class bkt
	implements bks
{

	public bkt(bfj bfj1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = bfj1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field bfj a>
	//    5    9:return          
	}

	public final int a()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final int a(long l)
	{
		return a.a;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field bfj a>
	//    2    4:getfield        #23  <Field int bfj.a>
	//    3    7:ireturn         
	}

	public final int a(long l, long l1)
	{
		return a.a(l);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field bfj a>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #26  <Method int bfj.a(long)>
	//    4    8:ireturn         
	}

	public final long a(int i)
	{
		return a.e[i];
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field bfj a>
	//    2    4:getfield        #31  <Field long[] bfj.e>
	//    3    7:iload_1         
	//    4    8:laload          
	//    5    9:lreturn         
	}

	public final long a(int i, long l)
	{
		return a.d[i];
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field bfj a>
	//    2    4:getfield        #35  <Field long[] bfj.d>
	//    3    7:iload_1         
	//    4    8:laload          
	//    5    9:lreturn         
	}

	public final bld b(int i)
	{
		return new bld(((String) (null)), a.c[i], a.b[i]);
	//    0    0:new             #39  <Class bld>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:aload_0         
	//    4    6:getfield        #15  <Field bfj a>
	//    5    9:getfield        #42  <Field long[] bfj.c>
	//    6   12:iload_1         
	//    7   13:laload          
	//    8   14:aload_0         
	//    9   15:getfield        #15  <Field bfj a>
	//   10   18:getfield        #45  <Field int[] bfj.b>
	//   11   21:iload_1         
	//   12   22:iaload          
	//   13   23:i2l             
	//   14   24:invokespecial   #48  <Method void bld(String, long, long)>
	//   15   27:areturn         
	}

	public final boolean b()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private final bfj a;
}
