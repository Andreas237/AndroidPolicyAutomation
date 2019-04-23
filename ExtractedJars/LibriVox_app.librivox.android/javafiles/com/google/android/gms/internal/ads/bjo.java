// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bjm

public final class bjo
{

	public transient bjo(bjm abjm[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		c = abjm;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field bjm[] c>
		b = abjm.length;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:arraylength     
	//    8   12:putfield        #28  <Field int b>
	//    9   15:return          
	}

	public final int a(bjm bjm1)
	{
		for(int i = 0; i < b; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #28  <Field int b>
	//*   5    7:icmpge          29
			if(c[i] == bjm1)
	//*   6   10:aload_0         
	//*   7   11:getfield        #26  <Field bjm[] c>
	//*   8   14:iload_2         
	//*   9   15:aaload          
	//*  10   16:aload_1         
	//*  11   17:if_acmpne       22
				return i;
	//   12   20:iload_2         
	//   13   21:ireturn         

	//   14   22:iload_2         
	//   15   23:iconst_1        
	//   16   24:iadd            
	//   17   25:istore_2        
	//*  18   26:goto            2
		return -1;
	//   19   29:iconst_m1       
	//   20   30:ireturn         
	}

	public final bjm a(int i)
	{
		return c[i];
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field bjm[] c>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:areturn         
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
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          58
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #36  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #36  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((bjo)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class bjo>
	//   16   28:astore_1        
			return b == ((bjo) (obj)).b && Arrays.equals(((Object []) (c)), ((Object []) (((bjo) (obj)).c)));
	//   17   29:aload_0         
	//   18   30:getfield        #28  <Field int b>
	//   19   33:aload_1         
	//   20   34:getfield        #28  <Field int b>
	//   21   37:icmpne          56
	//   22   40:aload_0         
	//   23   41:getfield        #26  <Field bjm[] c>
	//   24   44:aload_1         
	//   25   45:getfield        #26  <Field bjm[] c>
	//   26   48:invokestatic    #41  <Method boolean Arrays.equals(Object[], Object[])>
	//   27   51:ifeq            56
	//   28   54:iconst_1        
	//   29   55:ireturn         
	//   30   56:iconst_0        
	//   31   57:ireturn         
		} else
		{
			return false;
	//   32   58:iconst_0        
	//   33   59:ireturn         
		}
	}

	public final int hashCode()
	{
		if(d == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field int d>
	//*   2    4:ifne            18
			d = Arrays.hashCode(((Object []) (c)));
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #26  <Field bjm[] c>
	//    6   12:invokestatic    #48  <Method int Arrays.hashCode(Object[])>
	//    7   15:putfield        #45  <Field int d>
		return d;
	//    8   18:aload_0         
	//    9   19:getfield        #45  <Field int d>
	//   10   22:ireturn         
	}

	public static final bjo a = new bjo(new bjm[0]);
	public final int b;
	private final bjm c[];
	private int d;

	static 
	{
	//    0    0:new             #2   <Class bjo>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:anewarray       bjm[]
	//    4    8:invokespecial   #19  <Method void bjo(bjm[])>
	//    5   11:putstatic       #21  <Field bjo a>
	//*   6   14:return          
	}
}
