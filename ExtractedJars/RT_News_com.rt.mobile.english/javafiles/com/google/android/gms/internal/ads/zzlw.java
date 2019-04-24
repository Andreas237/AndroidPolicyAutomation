// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzlx, zzkb, zzamu

public final class zzlw
{

	public zzlw(zzlx zzlx1)
	{
		this(zzlx1, ((SearchAdRequest) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #37  <Method void zzlw(zzlx, SearchAdRequest)>
	//    4    6:return          
	}

	public zzlw(zzlx zzlx1, SearchAdRequest searchadrequest)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		zzhl = zzlx.zza(zzlx1);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #47  <Method Date zzlx.zza(zzlx)>
	//    5    9:putfield        #49  <Field Date zzhl>
		zzaqt = zzlx.zzb(zzlx1);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #53  <Method String zzlx.zzb(zzlx)>
	//    9   17:putfield        #55  <Field String zzaqt>
		zzaqn = zzlx.zzc(zzlx1);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #59  <Method int zzlx.zzc(zzlx)>
	//   13   25:putfield        #61  <Field int zzaqn>
		zzhn = Collections.unmodifiableSet(((Set) (zzlx.zzd(zzlx1))));
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokestatic    #65  <Method java.util.HashSet zzlx.zzd(zzlx)>
	//   17   33:invokestatic    #71  <Method Set Collections.unmodifiableSet(Set)>
	//   18   36:putfield        #73  <Field Set zzhn>
		zzhp = zzlx.zze(zzlx1);
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:invokestatic    #77  <Method Location zzlx.zze(zzlx)>
	//   22   44:putfield        #79  <Field Location zzhp>
		zzvm = zzlx.zzf(zzlx1);
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:invokestatic    #83  <Method boolean zzlx.zzf(zzlx)>
	//   26   52:putfield        #85  <Field boolean zzvm>
		zzask = zzlx.zzg(zzlx1);
	//   27   55:aload_0         
	//   28   56:aload_1         
	//   29   57:invokestatic    #89  <Method Bundle zzlx.zzg(zzlx)>
	//   30   60:putfield        #91  <Field Bundle zzask>
		zzasl = Collections.unmodifiableMap(((Map) (zzlx.zzh(zzlx1))));
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:invokestatic    #95  <Method java.util.HashMap zzlx.zzh(zzlx)>
	//   34   68:invokestatic    #99  <Method Map Collections.unmodifiableMap(Map)>
	//   35   71:putfield        #101 <Field Map zzasl>
		zzaqr = zzlx.zzi(zzlx1);
	//   36   74:aload_0         
	//   37   75:aload_1         
	//   38   76:invokestatic    #104 <Method String zzlx.zzi(zzlx)>
	//   39   79:putfield        #106 <Field String zzaqr>
		zzaqx = zzlx.zzj(zzlx1);
	//   40   82:aload_0         
	//   41   83:aload_1         
	//   42   84:invokestatic    #109 <Method String zzlx.zzj(zzlx)>
	//   43   87:putfield        #111 <Field String zzaqx>
		zzasm = searchadrequest;
	//   44   90:aload_0         
	//   45   91:aload_2         
	//   46   92:putfield        #113 <Field SearchAdRequest zzasm>
		zzaqq = zzlx.zzk(zzlx1);
	//   47   95:aload_0         
	//   48   96:aload_1         
	//   49   97:invokestatic    #116 <Method int zzlx.zzk(zzlx)>
	//   50  100:putfield        #118 <Field int zzaqq>
		zzasn = Collections.unmodifiableSet(((Set) (zzlx.zzl(zzlx1))));
	//   51  103:aload_0         
	//   52  104:aload_1         
	//   53  105:invokestatic    #121 <Method java.util.HashSet zzlx.zzl(zzlx)>
	//   54  108:invokestatic    #71  <Method Set Collections.unmodifiableSet(Set)>
	//   55  111:putfield        #123 <Field Set zzasn>
		zzaqv = zzlx.zzm(zzlx1);
	//   56  114:aload_0         
	//   57  115:aload_1         
	//   58  116:invokestatic    #126 <Method Bundle zzlx.zzm(zzlx)>
	//   59  119:putfield        #128 <Field Bundle zzaqv>
		zzaso = Collections.unmodifiableSet(((Set) (zzlx.zzn(zzlx1))));
	//   60  122:aload_0         
	//   61  123:aload_1         
	//   62  124:invokestatic    #131 <Method java.util.HashSet zzlx.zzn(zzlx)>
	//   63  127:invokestatic    #71  <Method Set Collections.unmodifiableSet(Set)>
	//   64  130:putfield        #133 <Field Set zzaso>
		zzaqz = zzlx.zzo(zzlx1);
	//   65  133:aload_0         
	//   66  134:aload_1         
	//   67  135:invokestatic    #136 <Method boolean zzlx.zzo(zzlx)>
	//   68  138:putfield        #138 <Field boolean zzaqz>
	//   69  141:return          
	}

	public final Date getBirthday()
	{
		return zzhl;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field Date zzhl>
	//    2    4:areturn         
	}

	public final String getContentUrl()
	{
		return zzaqt;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field String zzaqt>
	//    2    4:areturn         
	}

	public final Bundle getCustomEventExtrasBundle(Class class1)
	{
		Bundle bundle = zzask.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field Bundle zzask>
	//    2    4:ldc1            #146 <String "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter">
	//    3    6:invokevirtual   #152 <Method Bundle Bundle.getBundle(String)>
	//    4    9:astore_2        
		if(bundle != null)
	//*   5   10:aload_2         
	//*   6   11:ifnull          23
			return bundle.getBundle(class1.getName());
	//    7   14:aload_2         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #157 <Method String Class.getName()>
	//   10   19:invokevirtual   #152 <Method Bundle Bundle.getBundle(String)>
	//   11   22:areturn         
		else
			return null;
	//   12   23:aconst_null     
	//   13   24:areturn         
	}

	public final Bundle getCustomTargeting()
	{
		return zzaqv;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field Bundle zzaqv>
	//    2    4:areturn         
	}

	public final int getGender()
	{
		return zzaqn;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int zzaqn>
	//    2    4:ireturn         
	}

	public final Set getKeywords()
	{
		return zzhn;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field Set zzhn>
	//    2    4:areturn         
	}

	public final Location getLocation()
	{
		return zzhp;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Location zzhp>
	//    2    4:areturn         
	}

	public final boolean getManualImpressionsEnabled()
	{
		return zzvm;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field boolean zzvm>
	//    2    4:ireturn         
	}

	public final NetworkExtras getNetworkExtras(Class class1)
	{
		return (NetworkExtras)zzasl.get(((Object) (class1)));
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field Map zzasl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #179 <Method Object Map.get(Object)>
	//    4   10:checkcast       #181 <Class NetworkExtras>
	//    5   13:areturn         
	}

	public final Bundle getNetworkExtrasBundle(Class class1)
	{
		return zzask.getBundle(class1.getName());
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field Bundle zzask>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #157 <Method String Class.getName()>
	//    4    8:invokevirtual   #152 <Method Bundle Bundle.getBundle(String)>
	//    5   11:areturn         
	}

	public final String getPublisherProvidedId()
	{
		return zzaqr;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field String zzaqr>
	//    2    4:areturn         
	}

	public final boolean isDesignedForFamilies()
	{
		return zzaqz;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field boolean zzaqz>
	//    2    4:ireturn         
	}

	public final boolean isTestDevice(Context context)
	{
		Set set = zzasn;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field Set zzasn>
	//    2    4:astore_2        
		zzkb.zzif();
	//    3    5:invokestatic    #195 <Method zzamu zzkb.zzif()>
	//    4    8:pop             
		return set.contains(((Object) (zzamu.zzbc(context))));
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokestatic    #201 <Method String zzamu.zzbc(Context)>
	//    8   14:invokeinterface #207 <Method boolean Set.contains(Object)>
	//    9   19:ireturn         
	}

	public final String zzip()
	{
		return zzaqx;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field String zzaqx>
	//    2    4:areturn         
	}

	public final SearchAdRequest zziq()
	{
		return zzasm;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field SearchAdRequest zzasm>
	//    2    4:areturn         
	}

	public final Map zzir()
	{
		return zzasl;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field Map zzasl>
	//    2    4:areturn         
	}

	public final Bundle zzis()
	{
		return zzask;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field Bundle zzask>
	//    2    4:areturn         
	}

	public final int zzit()
	{
		return zzaqq;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field int zzaqq>
	//    2    4:ireturn         
	}

	public final Set zziu()
	{
		return zzaso;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field Set zzaso>
	//    2    4:areturn         
	}

	private final int zzaqn;
	private final int zzaqq;
	private final String zzaqr;
	private final String zzaqt;
	private final Bundle zzaqv;
	private final String zzaqx;
	private final boolean zzaqz;
	private final Bundle zzask;
	private final Map zzasl;
	private final SearchAdRequest zzasm;
	private final Set zzasn;
	private final Set zzaso;
	private final Date zzhl;
	private final Set zzhn;
	private final Location zzhp;
	private final boolean zzvm;
}
