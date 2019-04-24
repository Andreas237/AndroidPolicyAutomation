// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaqe, zzaqh, zzapw

public final class zzaqg
	implements Iterable
{

	public zzaqg()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #17  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void ArrayList()>
	//    6   12:putfield        #20  <Field List zzday>
	//    7   15:return          
	}

	public static boolean zzb(zzapw zzapw)
	{
		zzapw = ((zzapw) (zzc(zzapw)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #27  <Method zzaqe zzc(zzapw)>
	//    2    4:astore_0        
		if(zzapw != null)
	//*   3    5:aload_0         
	//*   4    6:ifnull          18
		{
			((zzaqe) (zzapw)).zzdav.abort();
	//    5    9:aload_0         
	//    6   10:getfield        #33  <Field zzaqh zzaqe.zzdav>
	//    7   13:invokevirtual   #38  <Method void zzaqh.abort()>
			return true;
	//    8   16:iconst_1        
	//    9   17:ireturn         
		} else
		{
			return false;
	//   10   18:iconst_0        
	//   11   19:ireturn         
		}
	}

	static zzaqe zzc(zzapw zzapw)
	{
		for(Iterator iterator1 = zzbv.zzff().iterator(); iterator1.hasNext();)
	//*   0    0:invokestatic    #44  <Method zzaqg zzbv.zzff()>
	//*   1    3:invokevirtual   #48  <Method Iterator iterator()>
	//*   2    6:astore_1        
	//*   3    7:aload_1         
	//*   4    8:invokeinterface #54  <Method boolean Iterator.hasNext()>
	//*   5   13:ifeq            36
		{
			zzaqe zzaqe1 = (zzaqe)iterator1.next();
	//    6   16:aload_1         
	//    7   17:invokeinterface #58  <Method Object Iterator.next()>
	//    8   22:checkcast       #29  <Class zzaqe>
	//    9   25:astore_2        
			if(zzaqe1.zzcyg == zzapw)
	//*  10   26:aload_2         
	//*  11   27:getfield        #62  <Field zzapw zzaqe.zzcyg>
	//*  12   30:aload_0         
	//*  13   31:if_acmpne       7
				return zzaqe1;
	//   14   34:aload_2         
	//   15   35:areturn         
		}

		return null;
	//   16   36:aconst_null     
	//   17   37:areturn         
	}

	public final Iterator iterator()
	{
		return zzday.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field List zzday>
	//    2    4:invokeinterface #65  <Method Iterator List.iterator()>
	//    3    9:areturn         
	}

	public final void zza(zzaqe zzaqe1)
	{
		zzday.add(((Object) (zzaqe1)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field List zzday>
	//    2    4:aload_1         
	//    3    5:invokeinterface #73  <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public final void zzb(zzaqe zzaqe1)
	{
		zzday.remove(((Object) (zzaqe1)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field List zzday>
	//    2    4:aload_1         
	//    3    5:invokeinterface #76  <Method boolean List.remove(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public final int zztx()
	{
		return zzday.size();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field List zzday>
	//    2    4:invokeinterface #81  <Method int List.size()>
	//    3    9:ireturn         
	}

	private final List zzday = new ArrayList();
}
