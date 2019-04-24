// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzarg, zzasp, zzaml, zzaqw, 
//			zzajm, zzasi, zzci, zzang, 
//			zznx, zzhs

public final class zzaso
{

	public static zzaqw zza(Context context, zzasi zzasi, String s, boolean flag, boolean flag1, zzci zzci, zzang zzang, zznx zznx, 
			zzbo zzbo, zzw zzw, zzhs zzhs)
		throws zzarg
	{
		try
		{
			context = ((Context) ((zzaqw)zzaml.zzb(((java.util.concurrent.Callable) (new zzasp(context, zzasi, s, flag, flag1, zzci, zzang, zznx, zzbo, zzw, zzhs))))));
	//    0    0:new             #15  <Class zzasp>
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
	//   12   20:aload           10
	//   13   22:invokespecial   #19  <Method void zzasp(Context, zzasi, String, boolean, boolean, zzci, zzang, zznx, zzbo, zzw, zzhs)>
	//   14   25:invokestatic    #25  <Method Object zzaml.zzb(java.util.concurrent.Callable)>
	//   15   28:checkcast       #27  <Class zzaqw>
	//   16   31:astore_0        
		}
	//*  17   32:aload_0         
	//*  18   33:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  19   34:astore_0        
		{
			zzbv.zzeo().zza(((Throwable) (context)), "AdWebViewFactory.newAdWebView2");
	//   20   35:invokestatic    #33  <Method zzajm zzbv.zzeo()>
	//   21   38:aload_0         
	//   22   39:ldc1            #35  <String "AdWebViewFactory.newAdWebView2">
	//   23   41:invokevirtual   #40  <Method void zzajm.zza(Throwable, String)>
			throw new zzarg("Webview initialization failed.", ((Throwable) (context)));
	//   24   44:new             #10  <Class zzarg>
	//   25   47:dup             
	//   26   48:ldc1            #42  <String "Webview initialization failed.">
	//   27   50:aload_0         
	//   28   51:invokespecial   #45  <Method void zzarg(String, Throwable)>
	//   29   54:athrow          
		}
		return ((zzaqw) (context));
	}
}
