// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import com.google.android.gms.d.h;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			bv, ay, aa, j

abstract class cj extends bv
{

	public cj(int i, h h1)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #11  <Method void bv(int)>
		a = h1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #13  <Field h a>
	//    6   10:return          
	}

	public void a(Status status)
	{
		a.b(((Exception) (new q(status))));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field h a>
	//    2    4:new             #17  <Class q>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #19  <Method void q(Status)>
	//    6   12:invokevirtual   #25  <Method boolean h.b(Exception)>
	//    7   15:pop             
	//    8   16:return          
	}

	public void a(aa aa, boolean flag)
	{
	//    0    0:return          
	}

	public final void a(j j)
	{
		try
		{
			d(j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #36  <Method void d(j)>
			return;
	//    3    5:return          
		}
	//*   4    6:astore_1        
	//*   5    7:aload_0         
	//*   6    8:aload_1         
	//*   7    9:invokevirtual   #41  <Method void ay.a(RuntimeException)>
	//*   8   12:return          
	//*   9   13:astore_1        
	//*  10   14:aload_0         
	//*  11   15:aload_1         
	//*  12   16:invokestatic    #44  <Method Status ay.a(RemoteException)>
	//*  13   19:invokevirtual   #46  <Method void ay.a(Status)>
	//*  14   22:return          
		// Misplaced declaration of an exception variable
		catch(j j)
	//*  15   23:astore_1        
		{
			((ay)this).a(ay.a(((RemoteException) (j))));
	//   16   24:aload_0         
	//   17   25:aload_1         
	//   18   26:invokestatic    #44  <Method Status ay.a(RemoteException)>
	//   19   29:invokevirtual   #46  <Method void ay.a(Status)>
		}
		// Misplaced declaration of an exception variable
		catch(j j)
		{
			((ay)this).a(ay.a(((RemoteException) (j))));
			return;
		}
		// Misplaced declaration of an exception variable
		catch(j j)
		{
			((ay)this).a(((RuntimeException) (j)));
			return;
		}
		throw j;
	//   20   32:aload_1         
	//   21   33:athrow          
	}

	public void a(RuntimeException runtimeexception)
	{
		a.b(((Exception) (runtimeexception)));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field h a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #25  <Method boolean h.b(Exception)>
	//    4    8:pop             
	//    5    9:return          
	}

	protected abstract void d(j j);

	protected final h a;
}
