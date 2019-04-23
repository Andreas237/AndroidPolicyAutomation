// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.EOFException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bfw, bfo, bno, bfx, 
//			zzfs

public final class bfl
	implements bfw
{

	public bfl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public final int a(bfo bfo1, int i, boolean flag)
	{
		i = bfo1.a(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokeinterface #18  <Method int bfo.a(int)>
	//    3    7:istore_2        
		if(i == -1)
	//*   4    8:iload_2         
	//*   5    9:iconst_m1       
	//*   6   10:icmpne          27
		{
			if(flag)
	//*   7   13:iload_3         
	//*   8   14:ifeq            19
				return -1;
	//    9   17:iconst_m1       
	//   10   18:ireturn         
			else
				throw new EOFException();
	//   11   19:new             #20  <Class EOFException>
	//   12   22:dup             
	//   13   23:invokespecial   #21  <Method void EOFException()>
	//   14   26:athrow          
		} else
		{
			return i;
	//   15   27:iload_2         
	//   16   28:ireturn         
		}
	}

	public final void a(long l, int i, int j, int k, bfx bfx)
	{
	//    0    0:return          
	}

	public final void a(bno bno1, int i)
	{
		bno1.d(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #29  <Method void bno.d(int)>
	//    3    5:return          
	}

	public final void a(zzfs zzfs)
	{
	//    0    0:return          
	}
}
