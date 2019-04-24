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
//			zzaks, zzart, zzaku, zzaml, 
//			zzaqw, zzaqx

public class zzakt extends zzaks
{

	public zzakt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void zzaks()>
	//    2    4:return          
	}

	public zzaqx zza(zzaqw zzaqw, boolean flag)
	{
		return ((zzaqx) (new zzart(zzaqw, flag)));
	//    0    0:new             #16  <Class zzart>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokespecial   #19  <Method void zzart(zzaqw, boolean)>
	//    5    9:areturn         
	}

	public final boolean zza(android.app.DownloadManager.Request request)
	{
		request.allowScanningByMediaScanner();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #25  <Method void android.app.DownloadManager$Request.allowScanningByMediaScanner()>
		request.setNotificationVisibility(1);
	//    2    4:aload_1         
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #29  <Method android.app.DownloadManager$Request android.app.DownloadManager$Request.setNotificationVisibility(int)>
	//    5    9:pop             
		return true;
	//    6   10:iconst_1        
	//    7   11:ireturn         
	}

	public boolean zza(Context context, WebSettings websettings)
	{
		super.zza(context, websettings);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #32  <Method boolean zzaks.zza(Context, WebSettings)>
	//    4    6:pop             
		return ((Boolean)zzaml.zza(context, ((java.util.concurrent.Callable) (new zzaku(this, context, websettings))))).booleanValue();
	//    5    7:aload_1         
	//    6    8:new             #34  <Class zzaku>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:aload_2         
	//   11   15:invokespecial   #37  <Method void zzaku(zzakt, Context, WebSettings)>
	//   12   18:invokestatic    #42  <Method Object zzaml.zza(Context, java.util.concurrent.Callable)>
	//   13   21:checkcast       #44  <Class Boolean>
	//   14   24:invokevirtual   #48  <Method boolean Boolean.booleanValue()>
	//   15   27:ireturn         
	}

	public final boolean zza(Window window)
	{
		window.setFlags(0x1000000, 0x1000000);
	//    0    0:aload_1         
	//    1    1:ldc1            #50  <Int 0x1000000>
	//    2    3:ldc1            #50  <Int 0x1000000>
	//    3    5:invokevirtual   #56  <Method void Window.setFlags(int, int)>
		return true;
	//    4    8:iconst_1        
	//    5    9:ireturn         
	}

	public final Set zzh(Uri uri)
	{
		return uri.getQueryParameterNames();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #64  <Method Set Uri.getQueryParameterNames()>
	//    2    4:areturn         
	}

	public final boolean zzy(View view)
	{
		view.setLayerType(0, ((android.graphics.Paint) (null)));
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #74  <Method void View.setLayerType(int, android.graphics.Paint)>
		return true;
	//    4    6:iconst_1        
	//    5    7:ireturn         
	}

	public final boolean zzz(View view)
	{
		view.setLayerType(1, ((android.graphics.Paint) (null)));
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #74  <Method void View.setLayerType(int, android.graphics.Paint)>
		return true;
	//    4    6:iconst_1        
	//    5    7:ireturn         
	}
}
