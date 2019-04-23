// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


public class bex
{

	public bex()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public void a()
	{
		a = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #13  <Field int a>
	//    3    5:return          
	}

	public final void a(int i)
	{
		a = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #13  <Field int a>
	//    3    5:return          
	}

	public final void b(int i)
	{
		a = a | 0x80000000;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #13  <Field int a>
	//    3    5:ldc1            #16  <Int 0x80000000>
	//    4    7:ior             
	//    5    8:putfield        #13  <Field int a>
	//    6   11:return          
	}

	public final boolean b()
	{
		return c(0x80000000);
	//    0    0:aload_0         
	//    1    1:ldc1            #16  <Int 0x80000000>
	//    2    3:invokevirtual   #21  <Method boolean c(int)>
	//    3    6:ireturn         
	}

	public final boolean c()
	{
		return c(4);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:invokevirtual   #21  <Method boolean c(int)>
	//    3    5:ireturn         
	}

	protected final boolean c(int i)
	{
		return (a & i) == i;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field int a>
	//    2    4:iload_1         
	//    3    5:iand            
	//    4    6:iload_1         
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public final boolean d()
	{
		return c(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #21  <Method boolean c(int)>
	//    3    5:ireturn         
	}

	private int a;
}
