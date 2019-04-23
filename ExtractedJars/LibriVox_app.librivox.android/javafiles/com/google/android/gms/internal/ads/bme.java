// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bmc

public final class bme
{

	public transient bme(bmc abmc[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		b = abmc;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field bmc[] b>
		a = abmc.length;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:arraylength     
	//    8   12:putfield        #18  <Field int a>
	//    9   15:return          
	}

	public final bmc a(int i)
	{
		return b[i];
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field bmc[] b>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:areturn         
	}

	public final bmc[] a()
	{
		return (bmc[])((bmc []) (b)).clone();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field bmc[] b>
	//    2    4:invokevirtual   #26  <Method Object _5B_Lcom.google.android.gms.internal.ads.bmc_3B_.clone()>
	//    3    7:checkcast       #22  <Class bmc[]>
	//    4   10:areturn         
	}

	public final boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null && ((Object)this).getClass() == obj.getClass())
	//*   5    7:aload_1         
	//*   6    8:ifnull          42
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #32  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #32  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       25
	//*  12   22:goto            42
		{
			obj = ((Object) ((bme)obj));
	//   13   25:aload_1         
	//   14   26:checkcast       #2   <Class bme>
	//   15   29:astore_1        
			return Arrays.equals(((Object []) (b)), ((Object []) (((bme) (obj)).b)));
	//   16   30:aload_0         
	//   17   31:getfield        #16  <Field bmc[] b>
	//   18   34:aload_1         
	//   19   35:getfield        #16  <Field bmc[] b>
	//   20   38:invokestatic    #37  <Method boolean Arrays.equals(Object[], Object[])>
	//   21   41:ireturn         
		} else
		{
			return false;
	//   22   42:iconst_0        
	//   23   43:ireturn         
		}
	}

	public final int hashCode()
	{
		if(c == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field int c>
	//*   2    4:ifne            22
			c = Arrays.hashCode(((Object []) (b))) + 527;
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #16  <Field bmc[] b>
	//    6   12:invokestatic    #44  <Method int Arrays.hashCode(Object[])>
	//    7   15:sipush          527
	//    8   18:iadd            
	//    9   19:putfield        #41  <Field int c>
		return c;
	//   10   22:aload_0         
	//   11   23:getfield        #41  <Field int c>
	//   12   26:ireturn         
	}

	public final int a;
	private final bmc b[];
	private int c;
}
