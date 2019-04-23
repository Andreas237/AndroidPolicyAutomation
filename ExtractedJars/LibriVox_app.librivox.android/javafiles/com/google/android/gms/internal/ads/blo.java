// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bks, bld

final class blo
	implements bks
{

	public blo(bld bld)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = bld;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field bld a>
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
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public final int a(long l, long l1)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final long a(int i)
	{
		return 0L;
	//    0    0:lconst_0        
	//    1    1:lreturn         
	}

	public final long a(int i, long l)
	{
		return l;
	//    0    0:lload_2         
	//    1    1:lreturn         
	}

	public final bld b(int i)
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field bld a>
	//    2    4:areturn         
	}

	public final boolean b()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private final bld a;
}
