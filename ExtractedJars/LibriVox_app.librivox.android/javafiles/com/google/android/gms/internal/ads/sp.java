// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.aw;

// Referenced classes of package com.google.android.gms.internal.ads:
//			sn, wi, wx, zzasm, 
//			rs, zzasi

final class sp
	implements Runnable
{

	sp(sn sn1, zzasi zzasi, rs rs1)
	{
		c = sn1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field sn c>
		a = zzasi;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field zzasi a>
		b = rs1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #20  <Field rs b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #23  <Method void Object()>
	//   11   19:return          
	}

	public final void run()
	{
		Object obj;
		try
		{
			obj = ((Object) (c.a(a)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field sn c>
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field zzasi a>
	//    4    8:invokevirtual   #34  <Method zzasm sn.a(zzasi)>
	//    5   11:astore_1        
		}
	//*   6   12:goto            33
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*   7   15:astore_1        
		{
			aw.i().a(((Throwable) (obj)), "AdRequestServiceImpl.loadAdAsync");
	//    8   16:invokestatic    #40  <Method wi aw.i()>
	//    9   19:aload_1         
	//   10   20:ldc1            #42  <String "AdRequestServiceImpl.loadAdAsync">
	//   11   22:invokevirtual   #47  <Method void wi.a(Throwable, String)>
			wx.c("Could not fetch ad response due to an Exception.", ((Throwable) (obj)));
	//   12   25:ldc1            #49  <String "Could not fetch ad response due to an Exception.">
	//   13   27:aload_1         
	//   14   28:invokestatic    #54  <Method void wx.c(String, Throwable)>
			obj = null;
	//   15   31:aconst_null     
	//   16   32:astore_1        
		}
		Object obj1 = obj;
	//   17   33:aload_1         
	//   18   34:astore_2        
		if(obj == null)
	//*  19   35:aload_1         
	//*  20   36:ifnonnull       48
			obj1 = ((Object) (new zzasm(0)));
	//   21   39:new             #56  <Class zzasm>
	//   22   42:dup             
	//   23   43:iconst_0        
	//   24   44:invokespecial   #59  <Method void zzasm(int)>
	//   25   47:astore_2        
		try
		{
			b.a(((zzasm) (obj1)));
	//   26   48:aload_0         
	//   27   49:getfield        #20  <Field rs b>
	//   28   52:aload_2         
	//   29   53:invokeinterface #64  <Method void rs.a(zzasm)>
			return;
	//   30   58:return          
		}
		catch(RemoteException remoteexception)
	//*  31   59:astore_1        
		{
			wx.c("Fail to forward ad response.", ((Throwable) (remoteexception)));
	//   32   60:ldc1            #66  <String "Fail to forward ad response.">
	//   33   62:aload_1         
	//   34   63:invokestatic    #54  <Method void wx.c(String, Throwable)>
		}
	//   35   66:return          
	}

	private final zzasi a;
	private final rs b;
	private final sn c;
}
