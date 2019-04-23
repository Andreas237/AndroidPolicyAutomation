// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.internal.ads:
//			oe, wx

final class of
	implements Runnable
{

	of(oe oe1)
	{
		a = oe1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field oe a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		if(!oe.a(a).get())
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field oe a>
	//*   2    4:invokestatic    #22  <Method AtomicBoolean oe.a(oe)>
	//*   3    7:invokevirtual   #28  <Method boolean AtomicBoolean.get()>
	//*   4   10:ifne            14
		{
			return;
	//    5   13:return          
		} else
		{
			wx.c("Timed out waiting for WebView to finish loading.");
	//    6   14:ldc1            #30  <String "Timed out waiting for WebView to finish loading.">
	//    7   16:invokestatic    #36  <Method void wx.c(String)>
			a.b();
	//    8   19:aload_0         
	//    9   20:getfield        #12  <Field oe a>
	//   10   23:invokevirtual   #39  <Method void oe.b()>
			return;
	//   11   26:return          
		}
	}

	private final oe a;
}
