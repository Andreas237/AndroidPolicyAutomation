// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zz, ww, wt, abe, 
//			wx, aaq

public final class wv
{

	public static void a(Context context)
	{
		if(!zz.a(context))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #12  <Method boolean zz.a(Context)>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(!zz.b())
	//*   4    8:invokestatic    #16  <Method boolean zz.b()>
	//*   5   11:ifne            40
		{
			context = ((Context) ((abe)((wt) (new ww(context))).c()));
	//    6   14:new             #18  <Class ww>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:invokespecial   #21  <Method void ww(Context)>
	//   10   22:invokevirtual   #27  <Method Object wt.c()>
	//   11   25:checkcast       #29  <Class abe>
	//   12   28:astore_0        
			wx.d("Updating ad debug logging enablement.");
	//   13   29:ldc1            #31  <String "Updating ad debug logging enablement.">
	//   14   31:invokestatic    #37  <Method void wx.d(String)>
			aaq.a(((abe) (context)), "AdDebugLogUpdater.updateEnablement");
	//   15   34:aload_0         
	//   16   35:ldc1            #39  <String "AdDebugLogUpdater.updateEnablement">
	//   17   37:invokestatic    #44  <Method void aaq.a(abe, String)>
		}
	//   18   40:return          
	}
}
