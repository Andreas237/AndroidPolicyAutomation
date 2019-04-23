// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.*;
import com.google.android.gms.maps.internal.zzbz;
import com.google.android.gms.maps.internal.zze;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.*;

// Referenced classes of package com.google.android.gms.maps:
//			MapFragment, MapsInitializer, OnMapReadyCallback

static final class MapFragment$zzb extends DeferredLifecycleHelper
{

	private final void setActivity(Activity activity)
	{
		zzbd = activity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field Activity zzbd>
		zzc();
	//    3    5:aload_0         
	//    4    6:invokespecial   #40  <Method void zzc()>
	//    5    9:return          
	}

	static void zza(MapFragment$zzb mapfragment$zzb, Activity activity)
	{
		mapfragment$zzb.setActivity(activity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #44  <Method void setActivity(Activity)>
	//    3    5:return          
	}

	private final void zzc()
	{
		if(zzbd == null || zzbc == null || getDelegate() != null)
			break MISSING_BLOCK_LABEL_138;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field Activity zzbd>
	//    2    4:ifnull          138
	//    3    7:aload_0         
	//    4    8:getfield        #50  <Field OnDelegateCreatedListener zzbc>
	//    5   11:ifnull          138
	//    6   14:aload_0         
	//    7   15:invokevirtual   #54  <Method com.google.android.gms.dynamic.LifecycleDelegate getDelegate()>
	//    8   18:ifnonnull       138
		Object obj;
		OnMapReadyCallback onmapreadycallback;
		try
		{
			MapsInitializer.initialize(((android.content.Context) (zzbd)));
	//    9   21:aload_0         
	//   10   22:getfield        #37  <Field Activity zzbd>
	//   11   25:invokestatic    #60  <Method int MapsInitializer.initialize(android.content.Context)>
	//   12   28:pop             
			obj = ((Object) (zzbz.zza(((android.content.Context) (zzbd))).zzc(ObjectWrapper.wrap(((Object) (zzbd))))));
	//   13   29:aload_0         
	//   14   30:getfield        #37  <Field Activity zzbd>
	//   15   33:invokestatic    #65  <Method zze zzbz.zza(android.content.Context)>
	//   16   36:aload_0         
	//   17   37:getfield        #37  <Field Activity zzbd>
	//   18   40:invokestatic    #71  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   19   43:invokeinterface #76  <Method com.google.android.gms.maps.internal.IMapFragmentDelegate zze.zzc(com.google.android.gms.dynamic.IObjectWrapper)>
	//   20   48:astore_1        
		}
	//*  21   49:aload_1         
	//*  22   50:ifnonnull       54
	//*  23   53:return          
	//*  24   54:aload_0         
	//*  25   55:getfield        #50  <Field OnDelegateCreatedListener zzbc>
	//*  26   58:new             #78  <Class MapFragment$zza>
	//*  27   61:dup             
	//*  28   62:aload_0         
	//*  29   63:getfield        #31  <Field Fragment zzaz>
	//*  30   66:aload_1         
	//*  31   67:invokespecial   #81  <Method void MapFragment$zza(Fragment, com.google.android.gms.maps.internal.IMapFragmentDelegate)>
	//*  32   70:invokeinterface #87  <Method void OnDelegateCreatedListener.onDelegateCreated(com.google.android.gms.dynamic.LifecycleDelegate)>
	//*  33   75:aload_0         
	//*  34   76:getfield        #29  <Field List zzbe>
	//*  35   79:invokeinterface #93  <Method Iterator List.iterator()>
	//*  36   84:astore_1        
	//*  37   85:aload_1         
	//*  38   86:invokeinterface #99  <Method boolean Iterator.hasNext()>
	//*  39   91:ifeq            118
	//*  40   94:aload_1         
	//*  41   95:invokeinterface #103 <Method Object Iterator.next()>
	//*  42  100:checkcast       #105 <Class OnMapReadyCallback>
	//*  43  103:astore_2        
	//*  44  104:aload_0         
	//*  45  105:invokevirtual   #54  <Method com.google.android.gms.dynamic.LifecycleDelegate getDelegate()>
	//*  46  108:checkcast       #78  <Class MapFragment$zza>
	//*  47  111:aload_2         
	//*  48  112:invokevirtual   #109 <Method void MapFragment$zza.getMapAsync(OnMapReadyCallback)>
	//*  49  115:goto            85
	//*  50  118:aload_0         
	//*  51  119:getfield        #29  <Field List zzbe>
	//*  52  122:invokeinterface #112 <Method void List.clear()>
	//*  53  127:return          
		catch(RemoteException remoteexception)
	//*  54  128:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//   55  129:new             #114 <Class RuntimeRemoteException>
	//   56  132:dup             
	//   57  133:aload_1         
	//   58  134:invokespecial   #117 <Method void RuntimeRemoteException(RemoteException)>
	//   59  137:athrow          
		}
	//*  60  138:return          
		catch(GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception)
	//*  61  139:astore_1        
		{
			return;
	//   62  140:return          
		}
		if(obj == null)
			return;
		zzbc.onDelegateCreated(((com.google.android.gms.dynamic.LifecycleDelegate) (new MapFragment$zza(zzaz, ((com.google.android.gms.maps.internal.IMapFragmentDelegate) (obj))))));
		for(obj = ((Object) (zzbe.iterator())); ((Iterator) (obj)).hasNext(); ((MapFragment$zza)getDelegate()).getMapAsync(onmapreadycallback))
			onmapreadycallback = (OnMapReadyCallback)((Iterator) (obj)).next();

		zzbe.clear();
		return;
	}

	protected final void createDelegate(OnDelegateCreatedListener ondelegatecreatedlistener)
	{
		zzbc = ondelegatecreatedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #50  <Field OnDelegateCreatedListener zzbc>
		zzc();
	//    3    5:aload_0         
	//    4    6:invokespecial   #40  <Method void zzc()>
	//    5    9:return          
	}

	public final void getMapAsync(OnMapReadyCallback onmapreadycallback)
	{
		if(getDelegate() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #54  <Method com.google.android.gms.dynamic.LifecycleDelegate getDelegate()>
	//*   2    4:ifnull          19
		{
			((MapFragment$zza)getDelegate()).getMapAsync(onmapreadycallback);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #54  <Method com.google.android.gms.dynamic.LifecycleDelegate getDelegate()>
	//    5   11:checkcast       #78  <Class MapFragment$zza>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #109 <Method void MapFragment$zza.getMapAsync(OnMapReadyCallback)>
			return;
	//    8   18:return          
		} else
		{
			zzbe.add(((Object) (onmapreadycallback)));
	//    9   19:aload_0         
	//   10   20:getfield        #29  <Field List zzbe>
	//   11   23:aload_1         
	//   12   24:invokeinterface #125 <Method boolean List.add(Object)>
	//   13   29:pop             
			return;
	//   14   30:return          
		}
	}

	private final Fragment zzaz;
	private OnDelegateCreatedListener zzbc;
	private Activity zzbd;
	private final List zzbe = new ArrayList();

	MapFragment$zzb(Fragment fragment)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void DeferredLifecycleHelper()>
	//    2    4:aload_0         
	//    3    5:new             #26  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #27  <Method void ArrayList()>
	//    6   12:putfield        #29  <Field List zzbe>
		zzaz = fragment;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #31  <Field Fragment zzaz>
	//   10   20:return          
	}
}
