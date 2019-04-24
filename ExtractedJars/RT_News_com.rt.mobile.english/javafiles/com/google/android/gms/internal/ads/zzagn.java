// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzafr, zzang, zzwg, zzwk, 
//			zzwn, zzwf

public final class zzagn
	implements zzafr
{

	public zzagn(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		zzckt = zzbv.zzey().zzb(context, zzang.zzsl()).zza("google.afma.request.getAdDictionary", ((zzwi) (zzwk.zzbrc)), ((zzwh) (zzwk.zzbrc)));
	//    2    4:aload_0         
	//    3    5:invokestatic    #22  <Method zzwg zzbv.zzey()>
	//    4    8:aload_1         
	//    5    9:invokestatic    #28  <Method zzang zzang.zzsl()>
	//    6   12:invokevirtual   #34  <Method zzwn zzwg.zzb(Context, zzang)>
	//    7   15:ldc1            #36  <String "google.afma.request.getAdDictionary">
	//    8   17:getstatic       #42  <Field zzwj zzwk.zzbrc>
	//    9   20:getstatic       #42  <Field zzwj zzwk.zzbrc>
	//   10   23:invokevirtual   #48  <Method zzwf zzwn.zza(String, zzwi, zzwh)>
	//   11   26:putfield        #50  <Field zzwf zzckt>
		zzcko = zzbv.zzey().zzb(context, zzang.zzsl()).zza("google.afma.sdkConstants.getSdkConstants", ((zzwi) (zzwk.zzbrc)), ((zzwh) (zzwk.zzbrc)));
	//   12   29:aload_0         
	//   13   30:invokestatic    #22  <Method zzwg zzbv.zzey()>
	//   14   33:aload_1         
	//   15   34:invokestatic    #28  <Method zzang zzang.zzsl()>
	//   16   37:invokevirtual   #34  <Method zzwn zzwg.zzb(Context, zzang)>
	//   17   40:ldc1            #52  <String "google.afma.sdkConstants.getSdkConstants">
	//   18   42:getstatic       #42  <Field zzwj zzwk.zzbrc>
	//   19   45:getstatic       #42  <Field zzwj zzwk.zzbrc>
	//   20   48:invokevirtual   #48  <Method zzwf zzwn.zza(String, zzwi, zzwh)>
	//   21   51:putfield        #54  <Field zzwf zzcko>
	//   22   54:return          
	}

	public final zzwf zzof()
	{
		return zzckt;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzwf zzckt>
	//    2    4:areturn         
	}

	public final zzwf zzog()
	{
		return zzcko;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field zzwf zzcko>
	//    2    4:areturn         
	}

	private zzwf zzcko;
	private zzwf zzckt;
}
