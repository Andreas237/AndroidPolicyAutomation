// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bnf, zzfs

public final class bjm
{

	public transient bjm(zzfs azzfs[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		boolean flag;
		if(azzfs.length > 0)
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:ifle            14
			flag = true;
	//    5    9:iconst_1        
	//    6   10:istore_2        
		else
	//*   7   11:goto            16
			flag = false;
	//    8   14:iconst_0        
	//    9   15:istore_2        
		bnf.b(flag);
	//   10   16:iload_2         
	//   11   17:invokestatic    #19  <Method void bnf.b(boolean)>
		b = azzfs;
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:putfield        #21  <Field zzfs[] b>
		a = azzfs.length;
	//   15   25:aload_0         
	//   16   26:aload_1         
	//   17   27:arraylength     
	//   18   28:putfield        #23  <Field int a>
	//   19   31:return          
	}

	public final int a(zzfs zzfs)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		do
		{
			zzfs azzfs[] = b;
	//    2    2:aload_0         
	//    3    3:getfield        #21  <Field zzfs[] b>
	//    4    6:astore_3        
			if(i < azzfs.length)
	//*   5    7:iload_2         
	//*   6    8:aload_3         
	//*   7    9:arraylength     
	//*   8   10:icmpge          29
			{
				if(zzfs == azzfs[i])
	//*   9   13:aload_1         
	//*  10   14:aload_3         
	//*  11   15:iload_2         
	//*  12   16:aaload          
	//*  13   17:if_acmpne       22
					return i;
	//   14   20:iload_2         
	//   15   21:ireturn         
				i++;
	//   16   22:iload_2         
	//   17   23:iconst_1        
	//   18   24:iadd            
	//   19   25:istore_2        
			} else
	//*  20   26:goto            2
			{
				return -1;
	//   21   29:iconst_m1       
	//   22   30:ireturn         
			}
		} while(true);
	}

	public final zzfs a(int i)
	{
		return b[i];
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzfs[] b>
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
	//*   8   12:invokevirtual   #32  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #32  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((bjm)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class bjm>
	//   16   28:astore_1        
			return a == ((bjm) (obj)).a && Arrays.equals(((Object []) (b)), ((Object []) (((bjm) (obj)).b)));
	//   17   29:aload_0         
	//   18   30:getfield        #23  <Field int a>
	//   19   33:aload_1         
	//   20   34:getfield        #23  <Field int a>
	//   21   37:icmpne          56
	//   22   40:aload_0         
	//   23   41:getfield        #21  <Field zzfs[] b>
	//   24   44:aload_1         
	//   25   45:getfield        #21  <Field zzfs[] b>
	//   26   48:invokestatic    #37  <Method boolean Arrays.equals(Object[], Object[])>
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
		if(c == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field int c>
	//*   2    4:ifne            22
			c = Arrays.hashCode(((Object []) (b))) + 527;
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #21  <Field zzfs[] b>
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
	private final zzfs b[];
	private int c;
}
