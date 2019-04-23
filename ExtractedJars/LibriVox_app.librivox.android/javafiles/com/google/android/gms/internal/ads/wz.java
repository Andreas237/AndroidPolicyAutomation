// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import com.google.android.gms.ads.internal.aw;

// Referenced classes of package com.google.android.gms.internal.ads:
//			wi, xg

public final class wz extends Handler
{

	public wz(Looper looper)
	{
		super(looper);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void Handler(Looper)>
	//    3    5:return          
	}

	public final void dispatchMessage(Message message)
	{
		try
		{
			super.dispatchMessage(message);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void Handler.dispatchMessage(Message)>
			return;
	//    3    5:return          
		}
		// Misplaced declaration of an exception variable
		catch(Message message)
	//*   4    6:astore_1        
		{
			aw.e();
	//    5    7:invokestatic    #22  <Method xg aw.e()>
	//    6   10:pop             
		}
		xg.a(aw.i().l(), ((Throwable) (message)));
	//    7   11:invokestatic    #26  <Method wi aw.i()>
	//    8   14:invokevirtual   #32  <Method android.content.Context wi.l()>
	//    9   17:aload_1         
	//   10   18:invokestatic    #38  <Method void xg.a(android.content.Context, Throwable)>
		throw message;
	//   11   21:aload_1         
	//   12   22:athrow          
	}

	public final void handleMessage(Message message)
	{
		try
		{
			super.handleMessage(message);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #43  <Method void Handler.handleMessage(Message)>
			return;
	//    3    5:return          
		}
		// Misplaced declaration of an exception variable
		catch(Message message)
	//*   4    6:astore_1        
		{
			aw.i().a(((Throwable) (message)), "AdMobHandler.handleMessage");
	//    5    7:invokestatic    #26  <Method wi aw.i()>
	//    6   10:aload_1         
	//    7   11:ldc1            #45  <String "AdMobHandler.handleMessage">
	//    8   13:invokevirtual   #48  <Method void wi.a(Throwable, String)>
		}
	//    9   16:return          
	}
}
