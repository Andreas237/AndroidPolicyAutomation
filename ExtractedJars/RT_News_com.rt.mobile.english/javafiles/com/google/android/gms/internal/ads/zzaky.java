// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebSettings;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzakv

public class zzaky extends zzakv
{

	public zzaky()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void zzakv()>
	//    2    4:return          
	}

	public final void setBackground(View view, Drawable drawable)
	{
		view.setBackground(drawable);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #19  <Method void View.setBackground(Drawable)>
	//    3    5:return          
	}

	public final void zza(ViewTreeObserver viewtreeobserver, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
	{
		viewtreeobserver.removeOnGlobalLayoutListener(ongloballayoutlistener);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #27  <Method void ViewTreeObserver.removeOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
	//    3    5:return          
	}

	public boolean zza(Context context, WebSettings websettings)
	{
		super.zza(context, websettings);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #30  <Method boolean zzakv.zza(Context, WebSettings)>
	//    4    6:pop             
		websettings.setAllowFileAccessFromFileURLs(false);
	//    5    7:aload_2         
	//    6    8:iconst_0        
	//    7    9:invokevirtual   #36  <Method void WebSettings.setAllowFileAccessFromFileURLs(boolean)>
		websettings.setAllowUniversalAccessFromFileURLs(false);
	//    8   12:aload_2         
	//    9   13:iconst_0        
	//   10   14:invokevirtual   #39  <Method void WebSettings.setAllowUniversalAccessFromFileURLs(boolean)>
		return true;
	//   11   17:iconst_1        
	//   12   18:ireturn         
	}
}
