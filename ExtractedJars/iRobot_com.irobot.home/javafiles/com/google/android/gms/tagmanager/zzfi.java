// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zzri;
import com.google.android.gms.internal.measurement.zzrm;
import java.util.*;

final class zzfi
{

	public zzfi()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #22  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void HashSet()>
	//    6   12:putfield        #25  <Field Set zzbfj>
	//    7   15:aload_0         
	//    8   16:new             #27  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #28  <Method void HashMap()>
	//   11   23:putfield        #30  <Field Map zzbft>
	//   12   26:aload_0         
	//   13   27:new             #27  <Class HashMap>
	//   14   30:dup             
	//   15   31:invokespecial   #28  <Method void HashMap()>
	//   16   34:putfield        #32  <Field Map zzbfv>
	//   17   37:aload_0         
	//   18   38:new             #27  <Class HashMap>
	//   19   41:dup             
	//   20   42:invokespecial   #28  <Method void HashMap()>
	//   21   45:putfield        #34  <Field Map zzbfu>
	//   22   48:aload_0         
	//   23   49:new             #27  <Class HashMap>
	//   24   52:dup             
	//   25   53:invokespecial   #28  <Method void HashMap()>
	//   26   56:putfield        #36  <Field Map zzbfw>
	//   27   59:return          
	}

	public final void zza(zzrm zzrm)
	{
		zzbfj.add(((Object) (zzrm)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Set zzbfj>
	//    2    4:aload_1         
	//    3    5:invokeinterface #45  <Method boolean Set.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public final void zza(zzrm zzrm, zzri zzri)
	{
		List list = (List)zzbft.get(((Object) (zzrm)));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Map zzbft>
	//    2    4:aload_1         
	//    3    5:invokeinterface #52  <Method Object Map.get(Object)>
	//    4   10:checkcast       #54  <Class List>
	//    5   13:astore          4
		Object obj = ((Object) (list));
	//    6   15:aload           4
	//    7   17:astore_3        
		if(list == null)
	//*   8   18:aload           4
	//*   9   20:ifnonnull       43
		{
			obj = ((Object) (new ArrayList()));
	//   10   23:new             #56  <Class ArrayList>
	//   11   26:dup             
	//   12   27:invokespecial   #57  <Method void ArrayList()>
	//   13   30:astore_3        
			zzbft.put(((Object) (zzrm)), obj);
	//   14   31:aload_0         
	//   15   32:getfield        #30  <Field Map zzbft>
	//   16   35:aload_1         
	//   17   36:aload_3         
	//   18   37:invokeinterface #61  <Method Object Map.put(Object, Object)>
	//   19   42:pop             
		}
		((List) (obj)).add(((Object) (zzri)));
	//   20   43:aload_3         
	//   21   44:aload_2         
	//   22   45:invokeinterface #62  <Method boolean List.add(Object)>
	//   23   50:pop             
	//   24   51:return          
	}

	public final void zza(zzrm zzrm, String s)
	{
		List list = (List)zzbfv.get(((Object) (zzrm)));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Map zzbfv>
	//    2    4:aload_1         
	//    3    5:invokeinterface #52  <Method Object Map.get(Object)>
	//    4   10:checkcast       #54  <Class List>
	//    5   13:astore          4
		Object obj = ((Object) (list));
	//    6   15:aload           4
	//    7   17:astore_3        
		if(list == null)
	//*   8   18:aload           4
	//*   9   20:ifnonnull       43
		{
			obj = ((Object) (new ArrayList()));
	//   10   23:new             #56  <Class ArrayList>
	//   11   26:dup             
	//   12   27:invokespecial   #57  <Method void ArrayList()>
	//   13   30:astore_3        
			zzbfv.put(((Object) (zzrm)), obj);
	//   14   31:aload_0         
	//   15   32:getfield        #32  <Field Map zzbfv>
	//   16   35:aload_1         
	//   17   36:aload_3         
	//   18   37:invokeinterface #61  <Method Object Map.put(Object, Object)>
	//   19   42:pop             
		}
		((List) (obj)).add(((Object) (s)));
	//   20   43:aload_3         
	//   21   44:aload_2         
	//   22   45:invokeinterface #62  <Method boolean List.add(Object)>
	//   23   50:pop             
	//   24   51:return          
	}

	public final void zzb(zzri zzri)
	{
		zzbfx = zzri;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #67  <Field zzri zzbfx>
	//    3    5:return          
	}

	public final void zzb(zzrm zzrm, zzri zzri)
	{
		List list = (List)zzbfu.get(((Object) (zzrm)));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Map zzbfu>
	//    2    4:aload_1         
	//    3    5:invokeinterface #52  <Method Object Map.get(Object)>
	//    4   10:checkcast       #54  <Class List>
	//    5   13:astore          4
		Object obj = ((Object) (list));
	//    6   15:aload           4
	//    7   17:astore_3        
		if(list == null)
	//*   8   18:aload           4
	//*   9   20:ifnonnull       43
		{
			obj = ((Object) (new ArrayList()));
	//   10   23:new             #56  <Class ArrayList>
	//   11   26:dup             
	//   12   27:invokespecial   #57  <Method void ArrayList()>
	//   13   30:astore_3        
			zzbfu.put(((Object) (zzrm)), obj);
	//   14   31:aload_0         
	//   15   32:getfield        #34  <Field Map zzbfu>
	//   16   35:aload_1         
	//   17   36:aload_3         
	//   18   37:invokeinterface #61  <Method Object Map.put(Object, Object)>
	//   19   42:pop             
		}
		((List) (obj)).add(((Object) (zzri)));
	//   20   43:aload_3         
	//   21   44:aload_2         
	//   22   45:invokeinterface #62  <Method boolean List.add(Object)>
	//   23   50:pop             
	//   24   51:return          
	}

	public final void zzb(zzrm zzrm, String s)
	{
		List list = (List)zzbfw.get(((Object) (zzrm)));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Map zzbfw>
	//    2    4:aload_1         
	//    3    5:invokeinterface #52  <Method Object Map.get(Object)>
	//    4   10:checkcast       #54  <Class List>
	//    5   13:astore          4
		Object obj = ((Object) (list));
	//    6   15:aload           4
	//    7   17:astore_3        
		if(list == null)
	//*   8   18:aload           4
	//*   9   20:ifnonnull       43
		{
			obj = ((Object) (new ArrayList()));
	//   10   23:new             #56  <Class ArrayList>
	//   11   26:dup             
	//   12   27:invokespecial   #57  <Method void ArrayList()>
	//   13   30:astore_3        
			zzbfw.put(((Object) (zzrm)), obj);
	//   14   31:aload_0         
	//   15   32:getfield        #36  <Field Map zzbfw>
	//   16   35:aload_1         
	//   17   36:aload_3         
	//   18   37:invokeinterface #61  <Method Object Map.put(Object, Object)>
	//   19   42:pop             
		}
		((List) (obj)).add(((Object) (s)));
	//   20   43:aload_3         
	//   21   44:aload_2         
	//   22   45:invokeinterface #62  <Method boolean List.add(Object)>
	//   23   50:pop             
	//   24   51:return          
	}

	public final Set zzpx()
	{
		return zzbfj;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Set zzbfj>
	//    2    4:areturn         
	}

	public final Map zzpy()
	{
		return zzbft;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Map zzbft>
	//    2    4:areturn         
	}

	public final Map zzpz()
	{
		return zzbfv;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Map zzbfv>
	//    2    4:areturn         
	}

	public final Map zzqa()
	{
		return zzbfw;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Map zzbfw>
	//    2    4:areturn         
	}

	public final Map zzqb()
	{
		return zzbfu;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Map zzbfu>
	//    2    4:areturn         
	}

	public final zzri zzqc()
	{
		return zzbfx;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field zzri zzbfx>
	//    2    4:areturn         
	}

	private final Set zzbfj = new HashSet();
	private final Map zzbft = new HashMap();
	private final Map zzbfu = new HashMap();
	private final Map zzbfv = new HashMap();
	private final Map zzbfw = new HashMap();
	private zzri zzbfx;
}
