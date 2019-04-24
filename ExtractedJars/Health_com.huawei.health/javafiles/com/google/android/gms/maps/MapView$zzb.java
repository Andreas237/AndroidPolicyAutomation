// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.*;
import com.google.android.gms.maps.internal.zzai;
import com.google.android.gms.maps.internal.zzc;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.*;

// Referenced classes of package com.google.android.gms.maps:
//			MapView, MapsInitializer, OnMapReadyCallback, GoogleMapOptions

static class MapView$zzb extends zza
{

	public void getMapAsync(OnMapReadyCallback onmapreadycallback)
	{
		if(zzBN() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #43  <Method com.google.android.gms.dynamic.LifecycleDelegate zzBN()>
	//*   2    4:ifnull          19
		{
			((MapView$zza)zzBN()).getMapAsync(onmapreadycallback);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #43  <Method com.google.android.gms.dynamic.LifecycleDelegate zzBN()>
	//    5   11:checkcast       #45  <Class MapView$zza>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #47  <Method void MapView$zza.getMapAsync(OnMapReadyCallback)>
			return;
	//    8   18:return          
		} else
		{
			zzbos.add(((Object) (onmapreadycallback)));
	//    9   19:aload_0         
	//   10   20:getfield        #30  <Field List zzbos>
	//   11   23:aload_1         
	//   12   24:invokeinterface #53  <Method boolean List.add(Object)>
	//   13   29:pop             
			return;
	//   14   30:return          
		}
	}

	public void onEnterAmbient(Bundle bundle)
	{
		if(zzBN() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #43  <Method com.google.android.gms.dynamic.LifecycleDelegate zzBN()>
	//*   2    4:ifnull          18
			((MapView$zza)zzBN()).onEnterAmbient(bundle);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #43  <Method com.google.android.gms.dynamic.LifecycleDelegate zzBN()>
	//    5   11:checkcast       #45  <Class MapView$zza>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #57  <Method void MapView$zza.onEnterAmbient(Bundle)>
	//    8   18:return          
	}

	public void onExitAmbient()
	{
		if(zzBN() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #43  <Method com.google.android.gms.dynamic.LifecycleDelegate zzBN()>
	//*   2    4:ifnull          17
			((MapView$zza)zzBN()).onExitAmbient();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #43  <Method com.google.android.gms.dynamic.LifecycleDelegate zzBN()>
	//    5   11:checkcast       #45  <Class MapView$zza>
	//    6   14:invokevirtual   #60  <Method void MapView$zza.onExitAmbient()>
	//    7   17:return          
	}

	public void zzJz()
	{
		if(zzbor == null || zzBN() != null)
			break MISSING_BLOCK_LABEL_135;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field zze zzbor>
	//    2    4:ifnull          135
	//    3    7:aload_0         
	//    4    8:invokevirtual   #43  <Method com.google.android.gms.dynamic.LifecycleDelegate zzBN()>
	//    5   11:ifnonnull       135
		Object obj;
		OnMapReadyCallback onmapreadycallback;
		try
		{
			MapsInitializer.initialize(mContext);
	//    6   14:aload_0         
	//    7   15:getfield        #34  <Field Context mContext>
	//    8   18:invokestatic    #73  <Method int MapsInitializer.initialize(Context)>
	//    9   21:pop             
			obj = ((Object) (zzai.zzbI(mContext).zza(zzd.zzA(((Object) (mContext))), zzboy)));
	//   10   22:aload_0         
	//   11   23:getfield        #34  <Field Context mContext>
	//   12   26:invokestatic    #79  <Method zzc zzai.zzbI(Context)>
	//   13   29:aload_0         
	//   14   30:getfield        #34  <Field Context mContext>
	//   15   33:invokestatic    #85  <Method com.google.android.gms.dynamic.IObjectWrapper zzd.zzA(Object)>
	//   16   36:aload_0         
	//   17   37:getfield        #36  <Field GoogleMapOptions zzboy>
	//   18   40:invokeinterface #91  <Method com.google.android.gms.maps.internal.IMapViewDelegate zzc.zza(com.google.android.gms.dynamic.IObjectWrapper, GoogleMapOptions)>
	//   19   45:astore_1        
		}
	//*  20   46:aload_1         
	//*  21   47:ifnonnull       51
	//*  22   50:return          
	//*  23   51:aload_0         
	//*  24   52:getfield        #67  <Field zze zzbor>
	//*  25   55:new             #45  <Class MapView$zza>
	//*  26   58:dup             
	//*  27   59:aload_0         
	//*  28   60:getfield        #32  <Field ViewGroup zzbox>
	//*  29   63:aload_1         
	//*  30   64:invokespecial   #94  <Method void MapView$zza(ViewGroup, com.google.android.gms.maps.internal.IMapViewDelegate)>
	//*  31   67:invokeinterface #99  <Method void zze.zza(com.google.android.gms.dynamic.LifecycleDelegate)>
	//*  32   72:aload_0         
	//*  33   73:getfield        #30  <Field List zzbos>
	//*  34   76:invokeinterface #103 <Method Iterator List.iterator()>
	//*  35   81:astore_1        
	//*  36   82:aload_1         
	//*  37   83:invokeinterface #109 <Method boolean Iterator.hasNext()>
	//*  38   88:ifeq            115
	//*  39   91:aload_1         
	//*  40   92:invokeinterface #113 <Method Object Iterator.next()>
	//*  41   97:checkcast       #115 <Class OnMapReadyCallback>
	//*  42  100:astore_2        
	//*  43  101:aload_0         
	//*  44  102:invokevirtual   #43  <Method com.google.android.gms.dynamic.LifecycleDelegate zzBN()>
	//*  45  105:checkcast       #45  <Class MapView$zza>
	//*  46  108:aload_2         
	//*  47  109:invokevirtual   #47  <Method void MapView$zza.getMapAsync(OnMapReadyCallback)>
	//*  48  112:goto            82
	//*  49  115:aload_0         
	//*  50  116:getfield        #30  <Field List zzbos>
	//*  51  119:invokeinterface #118 <Method void List.clear()>
	//*  52  124:return          
		catch(RemoteException remoteexception)
	//*  53  125:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//   54  126:new             #120 <Class RuntimeRemoteException>
	//   55  129:dup             
	//   56  130:aload_1         
	//   57  131:invokespecial   #123 <Method void RuntimeRemoteException(RemoteException)>
	//   58  134:athrow          
		}
	//*  59  135:return          
		catch(GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception)
	//*  60  136:astore_1        
		{
			return;
	//   61  137:return          
		}
		if(obj == null)
			return;
		zzbor.zza(((com.google.android.gms.dynamic.LifecycleDelegate) (new MapView$zza(zzbox, ((com.google.android.gms.maps.internal.IMapViewDelegate) (obj))))));
		for(obj = ((Object) (zzbos.iterator())); ((Iterator) (obj)).hasNext(); ((MapView$zza)zzBN()).getMapAsync(onmapreadycallback))
			onmapreadycallback = (OnMapReadyCallback)((Iterator) (obj)).next();

		zzbos.clear();
		return;
	}

	public void zza(zze zze1)
	{
		zzbor = zze1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #67  <Field zze zzbor>
		zzJz();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #126 <Method void zzJz()>
	//    5    9:return          
	}

	private final Context mContext;
	protected zze zzbor;
	private final List zzbos = new ArrayList();
	private final ViewGroup zzbox;
	private final GoogleMapOptions zzboy;

	MapView$zzb(ViewGroup viewgroup, Context context, GoogleMapOptions googlemapoptions)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void zza()>
	//    2    4:aload_0         
	//    3    5:new             #27  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void ArrayList()>
	//    6   12:putfield        #30  <Field List zzbos>
		zzbox = viewgroup;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #32  <Field ViewGroup zzbox>
		mContext = context;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #34  <Field Context mContext>
		zzboy = googlemapoptions;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #36  <Field GoogleMapOptions zzboy>
	//   16   30:return          
	}
}
