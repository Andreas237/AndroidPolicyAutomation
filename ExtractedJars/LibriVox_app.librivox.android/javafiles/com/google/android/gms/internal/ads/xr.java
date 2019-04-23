// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal.ads:
//			xq, agm, xs, zm, 
//			afn, bse, afo

public class xr extends xq
{

	public xr()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void xq()>
	//    2    4:return          
	}

	public afo a(afn afn, bse bse, boolean flag)
	{
		return ((afo) (new agm(afn, bse, flag)));
	//    0    0:new             #16  <Class agm>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokespecial   #19  <Method void agm(afn, bse, boolean)>
	//    6   10:areturn         
	}

	public final Set a(Uri uri)
	{
		return uri.getQueryParameterNames();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #26  <Method Set Uri.getQueryParameterNames()>
	//    2    4:areturn         
	}

	public final boolean a(android.app.DownloadManager.Request request)
	{
		request.allowScanningByMediaScanner();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #32  <Method void android.app.DownloadManager$Request.allowScanningByMediaScanner()>
		request.setNotificationVisibility(1);
	//    2    4:aload_1         
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #36  <Method android.app.DownloadManager$Request android.app.DownloadManager$Request.setNotificationVisibility(int)>
	//    5    9:pop             
		return true;
	//    6   10:iconst_1        
	//    7   11:ireturn         
	}

	public boolean a(Context context, WebSettings websettings)
	{
		super.a(context, websettings);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #39  <Method boolean xq.a(Context, WebSettings)>
	//    4    6:pop             
		return ((Boolean)zm.a(context, ((java.util.concurrent.Callable) (new xs(this, context, websettings))))).booleanValue();
	//    5    7:aload_1         
	//    6    8:new             #41  <Class xs>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:aload_2         
	//   11   15:invokespecial   #44  <Method void xs(xr, Context, WebSettings)>
	//   12   18:invokestatic    #49  <Method Object zm.a(Context, java.util.concurrent.Callable)>
	//   13   21:checkcast       #51  <Class Boolean>
	//   14   24:invokevirtual   #55  <Method boolean Boolean.booleanValue()>
	//   15   27:ireturn         
	}

	public final boolean a(Window window)
	{
		window.setFlags(0x1000000, 0x1000000);
	//    0    0:aload_1         
	//    1    1:ldc1            #57  <Int 0x1000000>
	//    2    3:ldc1            #57  <Int 0x1000000>
	//    3    5:invokevirtual   #63  <Method void Window.setFlags(int, int)>
		return true;
	//    4    8:iconst_1        
	//    5    9:ireturn         
	}

	public final boolean b(View view)
	{
		view.setLayerType(0, ((android.graphics.Paint) (null)));
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #71  <Method void View.setLayerType(int, android.graphics.Paint)>
		return true;
	//    4    6:iconst_1        
	//    5    7:ireturn         
	}

	public final boolean c(View view)
	{
		view.setLayerType(1, ((android.graphics.Paint) (null)));
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #71  <Method void View.setLayerType(int, android.graphics.Paint)>
		return true;
	//    4    6:iconst_1        
	//    5    7:ireturn         
	}
}
