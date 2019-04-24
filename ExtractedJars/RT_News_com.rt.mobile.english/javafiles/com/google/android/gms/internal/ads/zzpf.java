// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzpg, zzacm, zzpi, zzpj, 
//			zzaqw, zzpk

final class zzpf
{

	public zzpf(zzaqw zzaqw1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		zzbjg = new WeakReference(((Object) (zzaqw1)));
	//    2    4:aload_0         
	//    3    5:new             #16  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #19  <Method void WeakReference(Object)>
	//    7   13:putfield        #21  <Field WeakReference zzbjg>
	//    8   16:return          
	}

	static String zza(zzpf zzpf1, String s)
	{
		zzpf1.zzbjh = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field String zzbjh>
		return s;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static WeakReference zza(zzpf zzpf1)
	{
		return zzpf1.zzbjg;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field WeakReference zzbjg>
	//    2    4:areturn         
	}

	static String zzb(zzpf zzpf1)
	{
		return zzpf1.zzbjh;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String zzbjh>
	//    2    4:areturn         
	}

	public final void zza(zzacm zzacm1)
	{
		zzacm1.zza("/loadHtml", ((com.google.android.gms.ads.internal.gmsg.zzv) (new zzpg(this, zzacm1))));
	//    0    0:aload_1         
	//    1    1:ldc1            #32  <String "/loadHtml">
	//    2    3:new             #34  <Class zzpg>
	//    3    6:dup             
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:invokespecial   #37  <Method void zzpg(zzpf, zzacm)>
	//    7   12:invokeinterface #42  <Method void zzacm.zza(String, com.google.android.gms.ads.internal.gmsg.zzv)>
		zzacm1.zza("/showOverlay", ((com.google.android.gms.ads.internal.gmsg.zzv) (new zzpi(this, zzacm1))));
	//    8   17:aload_1         
	//    9   18:ldc1            #44  <String "/showOverlay">
	//   10   20:new             #46  <Class zzpi>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokespecial   #47  <Method void zzpi(zzpf, zzacm)>
	//   15   29:invokeinterface #42  <Method void zzacm.zza(String, com.google.android.gms.ads.internal.gmsg.zzv)>
		zzacm1.zza("/hideOverlay", ((com.google.android.gms.ads.internal.gmsg.zzv) (new zzpj(this, zzacm1))));
	//   16   34:aload_1         
	//   17   35:ldc1            #49  <String "/hideOverlay">
	//   18   37:new             #51  <Class zzpj>
	//   19   40:dup             
	//   20   41:aload_0         
	//   21   42:aload_1         
	//   22   43:invokespecial   #52  <Method void zzpj(zzpf, zzacm)>
	//   23   46:invokeinterface #42  <Method void zzacm.zza(String, com.google.android.gms.ads.internal.gmsg.zzv)>
		zzaqw zzaqw1 = (zzaqw)zzbjg.get();
	//   24   51:aload_0         
	//   25   52:getfield        #21  <Field WeakReference zzbjg>
	//   26   55:invokevirtual   #56  <Method Object WeakReference.get()>
	//   27   58:checkcast       #58  <Class zzaqw>
	//   28   61:astore_2        
		if(zzaqw1 != null)
	//*  29   62:aload_2         
	//*  30   63:ifnull          83
			zzaqw1.zza("/sendMessageToSdk", ((com.google.android.gms.ads.internal.gmsg.zzv) (new zzpk(this, zzacm1))));
	//   31   66:aload_2         
	//   32   67:ldc1            #60  <String "/sendMessageToSdk">
	//   33   69:new             #62  <Class zzpk>
	//   34   72:dup             
	//   35   73:aload_0         
	//   36   74:aload_1         
	//   37   75:invokespecial   #63  <Method void zzpk(zzpf, zzacm)>
	//   38   78:invokeinterface #64  <Method void zzaqw.zza(String, com.google.android.gms.ads.internal.gmsg.zzv)>
	//   39   83:return          
	}

	private final WeakReference zzbjg;
	private String zzbjh;
}
