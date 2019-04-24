// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zzrm;
import java.util.*;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzfg, zzeq, zzfb

final class zzfe
	implements zzfg
{

	zzfe(zzfb zzfb, Map map, Map map1, Map map2, Map map3)
	{
		zzbfn = map;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field Map zzbfn>
		zzbfo = map1;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #17  <Field Map zzbfo>
		zzbfp = map2;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #19  <Field Map zzbfp>
		zzbfq = map3;
	//    9   16:aload_0         
	//   10   17:aload           5
	//   11   19:putfield        #21  <Field Map zzbfq>
		super();
	//   12   22:aload_0         
	//   13   23:invokespecial   #24  <Method void Object()>
	//   14   26:return          
	}

	public final void zza(zzrm zzrm, Set set, Set set1, zzeq zzeq1)
	{
		List list = (List)zzbfn.get(((Object) (zzrm)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Map zzbfn>
	//    2    4:aload_1         
	//    3    5:invokeinterface #33  <Method Object Map.get(Object)>
	//    4   10:checkcast       #35  <Class List>
	//    5   13:astore          5
		zzbfo.get(((Object) (zzrm)));
	//    6   15:aload_0         
	//    7   16:getfield        #17  <Field Map zzbfo>
	//    8   19:aload_1         
	//    9   20:invokeinterface #33  <Method Object Map.get(Object)>
	//   10   25:pop             
		if(list != null)
	//*  11   26:aload           5
	//*  12   28:ifnull          48
		{
			set.addAll(((java.util.Collection) (list)));
	//   13   31:aload_2         
	//   14   32:aload           5
	//   15   34:invokeinterface #41  <Method boolean Set.addAll(java.util.Collection)>
	//   16   39:pop             
			zzeq1.zzpc();
	//   17   40:aload           4
	//   18   42:invokeinterface #47  <Method zzeo zzeq.zzpc()>
	//   19   47:pop             
		}
		set = ((Set) ((List)zzbfp.get(((Object) (zzrm)))));
	//   20   48:aload_0         
	//   21   49:getfield        #19  <Field Map zzbfp>
	//   22   52:aload_1         
	//   23   53:invokeinterface #33  <Method Object Map.get(Object)>
	//   24   58:checkcast       #35  <Class List>
	//   25   61:astore_2        
		zzbfq.get(((Object) (zzrm)));
	//   26   62:aload_0         
	//   27   63:getfield        #21  <Field Map zzbfq>
	//   28   66:aload_1         
	//   29   67:invokeinterface #33  <Method Object Map.get(Object)>
	//   30   72:pop             
		if(set != null)
	//*  31   73:aload_2         
	//*  32   74:ifnull          93
		{
			set1.addAll(((java.util.Collection) (set)));
	//   33   77:aload_3         
	//   34   78:aload_2         
	//   35   79:invokeinterface #41  <Method boolean Set.addAll(java.util.Collection)>
	//   36   84:pop             
			zzeq1.zzpd();
	//   37   85:aload           4
	//   38   87:invokeinterface #50  <Method zzeo zzeq.zzpd()>
	//   39   92:pop             
		}
	//   40   93:return          
	}

	private final Map zzbfn;
	private final Map zzbfo;
	private final Map zzbfp;
	private final Map zzbfq;
}
