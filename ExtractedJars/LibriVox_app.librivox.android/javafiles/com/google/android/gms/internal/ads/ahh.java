// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ahj, zm, afn, wi, 
//			afx, ahb, bad, zzbbi, 
//			ad, bse

public final class ahh
{

	public static afn a(Context context, ahb ahb, String s, boolean flag, boolean flag1, bad bad, zzbbi zzbbi, ad ad, 
			ap ap, bs bs, bse bse)
	{
		try
		{
			context = ((Context) ((afn)zm.a(((java.util.concurrent.Callable) (new ahj(context, ahb, s, flag, flag1, bad, zzbbi, ad, ap, bs))))));
	//    0    0:new             #12  <Class ahj>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:iload           4
	//    7   10:aload           5
	//    8   12:aload           6
	//    9   14:aload           7
	//   10   16:aload           8
	//   11   18:aload           9
	//   12   20:invokespecial   #16  <Method void ahj(Context, ahb, String, boolean, boolean, bad, zzbbi, ad, ap, bs)>
	//   13   23:invokestatic    #21  <Method Object zm.a(java.util.concurrent.Callable)>
	//   14   26:checkcast       #23  <Class afn>
	//   15   29:astore_0        
		}
	//*  16   30:aload_0         
	//*  17   31:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  18   32:astore_0        
		{
			aw.i().a(((Throwable) (context)), "AdWebViewFactory.newAdWebView2");
	//   19   33:invokestatic    #29  <Method wi aw.i()>
	//   20   36:aload_0         
	//   21   37:ldc1            #31  <String "AdWebViewFactory.newAdWebView2">
	//   22   39:invokevirtual   #36  <Method void wi.a(Throwable, String)>
			throw new afx("Webview initialization failed.", ((Throwable) (context)));
	//   23   42:new             #38  <Class afx>
	//   24   45:dup             
	//   25   46:ldc1            #40  <String "Webview initialization failed.">
	//   26   48:aload_0         
	//   27   49:invokespecial   #43  <Method void afx(String, Throwable)>
	//   28   52:athrow          
		}
		return ((afn) (context));
	}
}
