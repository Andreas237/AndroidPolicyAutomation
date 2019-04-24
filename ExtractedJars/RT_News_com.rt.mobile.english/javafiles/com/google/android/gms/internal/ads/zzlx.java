// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import java.util.*;

public final class zzlx
{

	public zzlx()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #35  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #36  <Method void HashSet()>
	//    6   12:putfield        #38  <Field HashSet zzasp>
	//    7   15:aload_0         
	//    8   16:new             #40  <Class Bundle>
	//    9   19:dup             
	//   10   20:invokespecial   #41  <Method void Bundle()>
	//   11   23:putfield        #43  <Field Bundle zzask>
	//   12   26:aload_0         
	//   13   27:new             #45  <Class HashMap>
	//   14   30:dup             
	//   15   31:invokespecial   #46  <Method void HashMap()>
	//   16   34:putfield        #48  <Field HashMap zzasq>
	//   17   37:aload_0         
	//   18   38:new             #35  <Class HashSet>
	//   19   41:dup             
	//   20   42:invokespecial   #36  <Method void HashSet()>
	//   21   45:putfield        #50  <Field HashSet zzasr>
	//   22   48:aload_0         
	//   23   49:new             #40  <Class Bundle>
	//   24   52:dup             
	//   25   53:invokespecial   #41  <Method void Bundle()>
	//   26   56:putfield        #52  <Field Bundle zzaqv>
	//   27   59:aload_0         
	//   28   60:new             #35  <Class HashSet>
	//   29   63:dup             
	//   30   64:invokespecial   #36  <Method void HashSet()>
	//   31   67:putfield        #54  <Field HashSet zzass>
		zzaqn = -1;
	//   32   70:aload_0         
	//   33   71:iconst_m1       
	//   34   72:putfield        #56  <Field int zzaqn>
		zzvm = false;
	//   35   75:aload_0         
	//   36   76:iconst_0        
	//   37   77:putfield        #58  <Field boolean zzvm>
		zzaqq = -1;
	//   38   80:aload_0         
	//   39   81:iconst_m1       
	//   40   82:putfield        #60  <Field int zzaqq>
	//   41   85:return          
	}

	static Date zza(zzlx zzlx1)
	{
		return zzlx1.zzhl;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Date zzhl>
	//    2    4:areturn         
	}

	static String zzb(zzlx zzlx1)
	{
		return zzlx1.zzaqt;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field String zzaqt>
	//    2    4:areturn         
	}

	static int zzc(zzlx zzlx1)
	{
		return zzlx1.zzaqn;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int zzaqn>
	//    2    4:ireturn         
	}

	static HashSet zzd(zzlx zzlx1)
	{
		return zzlx1.zzasp;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field HashSet zzasp>
	//    2    4:areturn         
	}

	static Location zze(zzlx zzlx1)
	{
		return zzlx1.zzhp;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field Location zzhp>
	//    2    4:areturn         
	}

	static boolean zzf(zzlx zzlx1)
	{
		return zzlx1.zzvm;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field boolean zzvm>
	//    2    4:ireturn         
	}

	static Bundle zzg(zzlx zzlx1)
	{
		return zzlx1.zzask;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Bundle zzask>
	//    2    4:areturn         
	}

	static HashMap zzh(zzlx zzlx1)
	{
		return zzlx1.zzasq;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field HashMap zzasq>
	//    2    4:areturn         
	}

	static String zzi(zzlx zzlx1)
	{
		return zzlx1.zzaqr;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field String zzaqr>
	//    2    4:areturn         
	}

	static String zzj(zzlx zzlx1)
	{
		return zzlx1.zzaqx;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field String zzaqx>
	//    2    4:areturn         
	}

	static int zzk(zzlx zzlx1)
	{
		return zzlx1.zzaqq;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int zzaqq>
	//    2    4:ireturn         
	}

	static HashSet zzl(zzlx zzlx1)
	{
		return zzlx1.zzasr;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field HashSet zzasr>
	//    2    4:areturn         
	}

	static Bundle zzm(zzlx zzlx1)
	{
		return zzlx1.zzaqv;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Bundle zzaqv>
	//    2    4:areturn         
	}

	static HashSet zzn(zzlx zzlx1)
	{
		return zzlx1.zzass;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field HashSet zzass>
	//    2    4:areturn         
	}

	static boolean zzo(zzlx zzlx1)
	{
		return zzlx1.zzaqz;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field boolean zzaqz>
	//    2    4:ireturn         
	}

	public final void setManualImpressionsEnabled(boolean flag)
	{
		zzvm = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #58  <Field boolean zzvm>
	//    3    5:return          
	}

	public final void zza(NetworkExtras networkextras)
	{
		if(networkextras instanceof AdMobExtras)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #102 <Class AdMobExtras>
	//*   2    4:ifeq            21
		{
			zza(com/google/ads/mediation/admob/AdMobAdapter, ((AdMobExtras)networkextras).getExtras());
	//    3    7:aload_0         
	//    4    8:ldc1            #104 <Class AdMobAdapter>
	//    5   10:aload_1         
	//    6   11:checkcast       #102 <Class AdMobExtras>
	//    7   14:invokevirtual   #108 <Method Bundle AdMobExtras.getExtras()>
	//    8   17:invokevirtual   #111 <Method void zza(Class, Bundle)>
			return;
	//    9   20:return          
		} else
		{
			zzasq.put(((Object) (((Object) (networkextras)).getClass())), ((Object) (networkextras)));
	//   10   21:aload_0         
	//   11   22:getfield        #48  <Field HashMap zzasq>
	//   12   25:aload_1         
	//   13   26:invokevirtual   #115 <Method Class Object.getClass()>
	//   14   29:aload_1         
	//   15   30:invokevirtual   #119 <Method Object HashMap.put(Object, Object)>
	//   16   33:pop             
			return;
	//   17   34:return          
		}
	}

	public final void zza(Class class1, Bundle bundle)
	{
		zzask.putBundle(class1.getName(), bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Bundle zzask>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #126 <Method String Class.getName()>
	//    4    8:aload_2         
	//    5    9:invokevirtual   #130 <Method void Bundle.putBundle(String, Bundle)>
	//    6   12:return          
	}

	public final void zza(Date date)
	{
		zzhl = date;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #65  <Field Date zzhl>
	//    3    5:return          
	}

	public final void zzac(String s)
	{
		zzasp.add(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field HashSet zzasp>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #139 <Method boolean HashSet.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public final void zzad(String s)
	{
		zzasr.add(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field HashSet zzasr>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #139 <Method boolean HashSet.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public final void zzae(String s)
	{
		zzasr.remove(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field HashSet zzasr>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #144 <Method boolean HashSet.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public final void zzaf(String s)
	{
		zzaqt = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #69  <Field String zzaqt>
	//    3    5:return          
	}

	public final void zzag(String s)
	{
		zzaqr = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #86  <Field String zzaqr>
	//    3    5:return          
	}

	public final void zzah(String s)
	{
		zzaqx = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #89  <Field String zzaqx>
	//    3    5:return          
	}

	public final void zzai(String s)
	{
		zzass.add(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field HashSet zzass>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #139 <Method boolean HashSet.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public final void zzb(Location location)
	{
		zzhp = location;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #77  <Field Location zzhp>
	//    3    5:return          
	}

	public final void zzb(Class class1, Bundle bundle)
	{
		if(zzask.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field Bundle zzask>
	//*   2    4:ldc1            #151 <String "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter">
	//*   3    6:invokevirtual   #155 <Method Bundle Bundle.getBundle(String)>
	//*   4    9:ifnonnull       28
			zzask.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
	//    5   12:aload_0         
	//    6   13:getfield        #43  <Field Bundle zzask>
	//    7   16:ldc1            #151 <String "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter">
	//    8   18:new             #40  <Class Bundle>
	//    9   21:dup             
	//   10   22:invokespecial   #41  <Method void Bundle()>
	//   11   25:invokevirtual   #130 <Method void Bundle.putBundle(String, Bundle)>
		zzask.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(class1.getName(), bundle);
	//   12   28:aload_0         
	//   13   29:getfield        #43  <Field Bundle zzask>
	//   14   32:ldc1            #151 <String "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter">
	//   15   34:invokevirtual   #155 <Method Bundle Bundle.getBundle(String)>
	//   16   37:aload_1         
	//   17   38:invokevirtual   #126 <Method String Class.getName()>
	//   18   41:aload_2         
	//   19   42:invokevirtual   #130 <Method void Bundle.putBundle(String, Bundle)>
	//   20   45:return          
	}

	public final void zzc(String s, String s1)
	{
		zzaqv.putString(s, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Bundle zzaqv>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #160 <Method void Bundle.putString(String, String)>
	//    5    9:return          
	}

	public final void zzj(boolean flag)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #162 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #164 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #168 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public final void zzk(boolean flag)
	{
		zzaqz = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #96  <Field boolean zzaqz>
	//    3    5:return          
	}

	public final void zzt(int i)
	{
		zzaqn = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #56  <Field int zzaqn>
	//    3    5:return          
	}

	private int zzaqn;
	private int zzaqq;
	private String zzaqr;
	private String zzaqt;
	private final Bundle zzaqv = new Bundle();
	private String zzaqx;
	private boolean zzaqz;
	private final Bundle zzask = new Bundle();
	private final HashSet zzasp = new HashSet();
	private final HashMap zzasq = new HashMap();
	private final HashSet zzasr = new HashSet();
	private final HashSet zzass = new HashSet();
	private Date zzhl;
	private Location zzhp;
	private boolean zzvm;
}
