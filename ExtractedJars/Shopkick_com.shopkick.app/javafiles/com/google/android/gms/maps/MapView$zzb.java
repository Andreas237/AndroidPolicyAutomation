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
//			MapView, MapsInitializer, OnMapReadyCallback, GoogleMapOptions

static final class MapView$zzb extends DeferredLifecycleHelper
{

	protected final void createDelegate(OnDelegateCreatedListener ondelegatecreatedlistener)
	{
		zzbc = ondelegatecreatedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #47  <Field OnDelegateCreatedListener zzbc>
		if(zzbc == null || getDelegate() != null)
			break MISSING_BLOCK_LABEL_140;
	//    3    5:aload_0         
	//    4    6:getfield        #47  <Field OnDelegateCreatedListener zzbc>
	//    5    9:ifnull          140
	//    6   12:aload_0         
	//    7   13:invokevirtual   #51  <Method com.google.android.gms.dynamic.LifecycleDelegate getDelegate()>
	//    8   16:ifnonnull       140
		OnMapReadyCallback onmapreadycallback;
		try
		{
			MapsInitializer.initialize(zzbj);
	//    9   19:aload_0         
	//   10   20:getfield        #35  <Field Context zzbj>
	//   11   23:invokestatic    #57  <Method int MapsInitializer.initialize(Context)>
	//   12   26:pop             
			ondelegatecreatedlistener = ((OnDelegateCreatedListener) (zzbz.zza(zzbj).zza(ObjectWrapper.wrap(((Object) (zzbj))), zzbk)));
	//   13   27:aload_0         
	//   14   28:getfield        #35  <Field Context zzbj>
	//   15   31:invokestatic    #63  <Method zze zzbz.zza(Context)>
	//   16   34:aload_0         
	//   17   35:getfield        #35  <Field Context zzbj>
	//   18   38:invokestatic    #69  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   19   41:aload_0         
	//   20   42:getfield        #37  <Field GoogleMapOptions zzbk>
	//   21   45:invokeinterface #74  <Method com.google.android.gms.maps.internal.IMapViewDelegate zze.zza(com.google.android.gms.dynamic.IObjectWrapper, GoogleMapOptions)>
	//   22   50:astore_1        
		}
	//*  23   51:aload_1         
	//*  24   52:ifnonnull       56
	//*  25   55:return          
	//*  26   56:aload_0         
	//*  27   57:getfield        #47  <Field OnDelegateCreatedListener zzbc>
	//*  28   60:new             #76  <Class MapView$zza>
	//*  29   63:dup             
	//*  30   64:aload_0         
	//*  31   65:getfield        #33  <Field ViewGroup zzbi>
	//*  32   68:aload_1         
	//*  33   69:invokespecial   #79  <Method void MapView$zza(ViewGroup, com.google.android.gms.maps.internal.IMapViewDelegate)>
	//*  34   72:invokeinterface #85  <Method void OnDelegateCreatedListener.onDelegateCreated(com.google.android.gms.dynamic.LifecycleDelegate)>
	//*  35   77:aload_0         
	//*  36   78:getfield        #31  <Field List zzbe>
	//*  37   81:invokeinterface #91  <Method Iterator List.iterator()>
	//*  38   86:astore_1        
	//*  39   87:aload_1         
	//*  40   88:invokeinterface #97  <Method boolean Iterator.hasNext()>
	//*  41   93:ifeq            120
	//*  42   96:aload_1         
	//*  43   97:invokeinterface #101 <Method Object Iterator.next()>
	//*  44  102:checkcast       #103 <Class OnMapReadyCallback>
	//*  45  105:astore_2        
	//*  46  106:aload_0         
	//*  47  107:invokevirtual   #51  <Method com.google.android.gms.dynamic.LifecycleDelegate getDelegate()>
	//*  48  110:checkcast       #76  <Class MapView$zza>
	//*  49  113:aload_2         
	//*  50  114:invokevirtual   #107 <Method void MapView$zza.getMapAsync(OnMapReadyCallback)>
	//*  51  117:goto            87
	//*  52  120:aload_0         
	//*  53  121:getfield        #31  <Field List zzbe>
	//*  54  124:invokeinterface #110 <Method void List.clear()>
	//*  55  129:return          
		// Misplaced declaration of an exception variable
		catch(OnDelegateCreatedListener ondelegatecreatedlistener)
	//*  56  130:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (ondelegatecreatedlistener)));
	//   57  131:new             #112 <Class RuntimeRemoteException>
	//   58  134:dup             
	//   59  135:aload_1         
	//   60  136:invokespecial   #115 <Method void RuntimeRemoteException(RemoteException)>
	//   61  139:athrow          
		}
	//*  62  140:return          
		// Misplaced declaration of an exception variable
		catch(OnDelegateCreatedListener ondelegatecreatedlistener)
	//*  63  141:astore_1        
		{
			return;
	//   64  142:return          
		}
		if(ondelegatecreatedlistener == null)
			return;
		zzbc.onDelegateCreated(((com.google.android.gms.dynamic.LifecycleDelegate) (new MapView$zza(zzbi, ((com.google.android.gms.maps.internal.IMapViewDelegate) (ondelegatecreatedlistener))))));
		for(ondelegatecreatedlistener = ((OnDelegateCreatedListener) (zzbe.iterator())); ((Iterator) (ondelegatecreatedlistener)).hasNext(); ((MapView$zza)getDelegate()).getMapAsync(onmapreadycallback))
			onmapreadycallback = (OnMapReadyCallback)((Iterator) (ondelegatecreatedlistener)).next();

		zzbe.clear();
		return;
	}

	public final void getMapAsync(OnMapReadyCallback onmapreadycallback)
	{
		if(getDelegate() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #51  <Method com.google.android.gms.dynamic.LifecycleDelegate getDelegate()>
	//*   2    4:ifnull          19
		{
			((MapView$zza)getDelegate()).getMapAsync(onmapreadycallback);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #51  <Method com.google.android.gms.dynamic.LifecycleDelegate getDelegate()>
	//    5   11:checkcast       #76  <Class MapView$zza>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #107 <Method void MapView$zza.getMapAsync(OnMapReadyCallback)>
			return;
	//    8   18:return          
		} else
		{
			zzbe.add(((Object) (onmapreadycallback)));
	//    9   19:aload_0         
	//   10   20:getfield        #31  <Field List zzbe>
	//   11   23:aload_1         
	//   12   24:invokeinterface #121 <Method boolean List.add(Object)>
	//   13   29:pop             
			return;
	//   14   30:return          
		}
	}

	private OnDelegateCreatedListener zzbc;
	private final List zzbe = new ArrayList();
	private final ViewGroup zzbi;
	private final Context zzbj;
	private final GoogleMapOptions zzbk;

	MapView$zzb(ViewGroup viewgroup, Context context, GoogleMapOptions googlemapoptions)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void DeferredLifecycleHelper()>
	//    2    4:aload_0         
	//    3    5:new             #28  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #29  <Method void ArrayList()>
	//    6   12:putfield        #31  <Field List zzbe>
		zzbi = viewgroup;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #33  <Field ViewGroup zzbi>
		zzbj = context;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #35  <Field Context zzbj>
		zzbk = googlemapoptions;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #37  <Field GoogleMapOptions zzbk>
	//   16   30:return          
	}
}
