// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.ads.internal.zzbv;
import java.io.InputStream;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzakz, zzarv, zzakb, zzajm, 
//			zzaqw, zzaqx

public final class zzala extends zzakz
{

	public zzala()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void zzakz()>
	//    2    4:return          
	}

	public final WebResourceResponse zza(String s, String s1, int i, String s2, Map map, InputStream inputstream)
	{
		return new WebResourceResponse(s, s1, i, s2, map, inputstream);
	//    0    0:new             #16  <Class WebResourceResponse>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:aload           5
	//    7   11:aload           6
	//    8   13:invokespecial   #19  <Method void WebResourceResponse(String, String, int, String, Map, InputStream)>
	//    9   16:areturn         
	}

	public final zzaqx zza(zzaqw zzaqw, boolean flag)
	{
		return ((zzaqx) (new zzarv(zzaqw, flag)));
	//    0    0:new             #24  <Class zzarv>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokespecial   #27  <Method void zzarv(zzaqw, boolean)>
	//    5    9:areturn         
	}

	public final CookieManager zzax(Context context)
	{
		if(zzrp())
	//*   0    0:invokestatic    #35  <Method boolean zzrp()>
	//*   1    3:ifeq            8
			return null;
	//    2    6:aconst_null     
	//    3    7:areturn         
		try
		{
			context = ((Context) (CookieManager.getInstance()));
	//    4    8:invokestatic    #41  <Method CookieManager CookieManager.getInstance()>
	//    5   11:astore_1        
		}
	//*   6   12:aload_1         
	//*   7   13:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*   8   14:astore_1        
		{
			zzakb.zzb("Failed to obtain CookieManager.", ((Throwable) (context)));
	//    9   15:ldc1            #43  <String "Failed to obtain CookieManager.">
	//   10   17:aload_1         
	//   11   18:invokestatic    #49  <Method void zzakb.zzb(String, Throwable)>
			zzbv.zzeo().zza(((Throwable) (context)), "ApiLevelUtil.getCookieManager");
	//   12   21:invokestatic    #55  <Method zzajm zzbv.zzeo()>
	//   13   24:aload_1         
	//   14   25:ldc1            #57  <String "ApiLevelUtil.getCookieManager">
	//   15   27:invokevirtual   #62  <Method void zzajm.zza(Throwable, String)>
			return null;
	//   16   30:aconst_null     
	//   17   31:areturn         
		}
		return ((CookieManager) (context));
	}

	public final int zzrq()
	{
		return 0x1030226;
	//    0    0:ldc1            #65  <Int 0x1030226>
	//    1    2:ireturn         
	}
}
