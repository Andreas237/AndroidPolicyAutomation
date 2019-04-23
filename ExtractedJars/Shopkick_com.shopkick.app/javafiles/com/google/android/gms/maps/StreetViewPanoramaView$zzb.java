// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.*;
import com.google.android.gms.maps.internal.zzbz;
import com.google.android.gms.maps.internal.zze;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.*;

// Referenced classes of package com.google.android.gms.maps:
//			StreetViewPanoramaView, MapsInitializer, OnStreetViewPanoramaReadyCallback, StreetViewPanoramaOptions

static final class StreetViewPanoramaView$zzb extends DeferredLifecycleHelper
{

	protected final void createDelegate(OnDelegateCreatedListener ondelegatecreatedlistener)
	{
		zzbc = ondelegatecreatedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #47  <Field OnDelegateCreatedListener zzbc>
		if(zzbc == null || getDelegate() != null)
			break MISSING_BLOCK_LABEL_135;
	//    3    5:aload_0         
	//    4    6:getfield        #47  <Field OnDelegateCreatedListener zzbc>
	//    5    9:ifnull          135
	//    6   12:aload_0         
	//    7   13:invokevirtual   #51  <Method com.google.android.gms.dynamic.LifecycleDelegate getDelegate()>
	//    8   16:ifnonnull       135
		try
		{
			MapsInitializer.initialize(zzbj);
	//    9   19:aload_0         
	//   10   20:getfield        #35  <Field Context zzbj>
	//   11   23:invokestatic    #57  <Method int MapsInitializer.initialize(Context)>
	//   12   26:pop             
			ondelegatecreatedlistener = ((OnDelegateCreatedListener) (zzbz.zza(zzbj).zza(ObjectWrapper.wrap(((Object) (zzbj))), zzcf)));
	//   13   27:aload_0         
	//   14   28:getfield        #35  <Field Context zzbj>
	//   15   31:invokestatic    #63  <Method zze zzbz.zza(Context)>
	//   16   34:aload_0         
	//   17   35:getfield        #35  <Field Context zzbj>
	//   18   38:invokestatic    #69  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   19   41:aload_0         
	//   20   42:getfield        #37  <Field StreetViewPanoramaOptions zzcf>
	//   21   45:invokeinterface #74  <Method com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate zze.zza(com.google.android.gms.dynamic.IObjectWrapper, StreetViewPanoramaOptions)>
	//   22   50:astore_1        
			zzbc.onDelegateCreated(((com.google.android.gms.dynamic.LifecycleDelegate) (new StreetViewPanoramaView$zza(zzbi, ((com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate) (ondelegatecreatedlistener))))));
	//   23   51:aload_0         
	//   24   52:getfield        #47  <Field OnDelegateCreatedListener zzbc>
	//   25   55:new             #76  <Class StreetViewPanoramaView$zza>
	//   26   58:dup             
	//   27   59:aload_0         
	//   28   60:getfield        #33  <Field ViewGroup zzbi>
	//   29   63:aload_1         
	//   30   64:invokespecial   #79  <Method void StreetViewPanoramaView$zza(ViewGroup, com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate)>
	//   31   67:invokeinterface #85  <Method void OnDelegateCreatedListener.onDelegateCreated(com.google.android.gms.dynamic.LifecycleDelegate)>
			OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback;
			for(ondelegatecreatedlistener = ((OnDelegateCreatedListener) (zzbv.iterator())); ((Iterator) (ondelegatecreatedlistener)).hasNext(); ((StreetViewPanoramaView$zza)getDelegate()).getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback))
	//*  32   72:aload_0         
	//*  33   73:getfield        #31  <Field List zzbv>
	//*  34   76:invokeinterface #91  <Method Iterator List.iterator()>
	//*  35   81:astore_1        
	//*  36   82:aload_1         
	//*  37   83:invokeinterface #97  <Method boolean Iterator.hasNext()>
	//*  38   88:ifeq            115
				onstreetviewpanoramareadycallback = (OnStreetViewPanoramaReadyCallback)((Iterator) (ondelegatecreatedlistener)).next();
	//   39   91:aload_1         
	//   40   92:invokeinterface #101 <Method Object Iterator.next()>
	//   41   97:checkcast       #103 <Class OnStreetViewPanoramaReadyCallback>
	//   42  100:astore_2        

	//   43  101:aload_0         
	//   44  102:invokevirtual   #51  <Method com.google.android.gms.dynamic.LifecycleDelegate getDelegate()>
	//   45  105:checkcast       #76  <Class StreetViewPanoramaView$zza>
	//   46  108:aload_2         
	//   47  109:invokevirtual   #107 <Method void StreetViewPanoramaView$zza.getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback)>
		}
	//*  48  112:goto            82
	//*  49  115:aload_0         
	//*  50  116:getfield        #31  <Field List zzbv>
	//*  51  119:invokeinterface #110 <Method void List.clear()>
	//*  52  124:return          
		// Misplaced declaration of an exception variable
		catch(OnDelegateCreatedListener ondelegatecreatedlistener)
	//*  53  125:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (ondelegatecreatedlistener)));
	//   54  126:new             #112 <Class RuntimeRemoteException>
	//   55  129:dup             
	//   56  130:aload_1         
	//   57  131:invokespecial   #115 <Method void RuntimeRemoteException(RemoteException)>
	//   58  134:athrow          
		}
	//*  59  135:return          
		// Misplaced declaration of an exception variable
		catch(OnDelegateCreatedListener ondelegatecreatedlistener)
	//*  60  136:astore_1        
		{
			return;
	//   61  137:return          
		}
		zzbv.clear();
		return;
	}

	public final void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
	{
		if(getDelegate() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #51  <Method com.google.android.gms.dynamic.LifecycleDelegate getDelegate()>
	//*   2    4:ifnull          19
		{
			((StreetViewPanoramaView$zza)getDelegate()).getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #51  <Method com.google.android.gms.dynamic.LifecycleDelegate getDelegate()>
	//    5   11:checkcast       #76  <Class StreetViewPanoramaView$zza>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #107 <Method void StreetViewPanoramaView$zza.getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback)>
			return;
	//    8   18:return          
		} else
		{
			zzbv.add(((Object) (onstreetviewpanoramareadycallback)));
	//    9   19:aload_0         
	//   10   20:getfield        #31  <Field List zzbv>
	//   11   23:aload_1         
	//   12   24:invokeinterface #121 <Method boolean List.add(Object)>
	//   13   29:pop             
			return;
	//   14   30:return          
		}
	}

	private OnDelegateCreatedListener zzbc;
	private final ViewGroup zzbi;
	private final Context zzbj;
	private final List zzbv = new ArrayList();
	private final StreetViewPanoramaOptions zzcf;

	StreetViewPanoramaView$zzb(ViewGroup viewgroup, Context context, StreetViewPanoramaOptions streetviewpanoramaoptions)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void DeferredLifecycleHelper()>
	//    2    4:aload_0         
	//    3    5:new             #28  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #29  <Method void ArrayList()>
	//    6   12:putfield        #31  <Field List zzbv>
		zzbi = viewgroup;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #33  <Field ViewGroup zzbi>
		zzbj = context;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #35  <Field Context zzbj>
		zzcf = streetviewpanoramaoptions;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #37  <Field StreetViewPanoramaOptions zzcf>
	//   16   30:return          
	}
}
