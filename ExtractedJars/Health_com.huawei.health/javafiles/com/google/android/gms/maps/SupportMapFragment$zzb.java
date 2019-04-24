// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.*;
import com.google.android.gms.maps.internal.zzai;
import com.google.android.gms.maps.internal.zzc;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.*;

// Referenced classes of package com.google.android.gms.maps:
//			SupportMapFragment, MapsInitializer, OnMapReadyCallback

static class SupportMapFragment$zzb extends zza
{

	private void setActivity(Activity activity)
	{
		mActivity = activity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field Activity mActivity>
		zzJz();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #38  <Method void zzJz()>
	//    5    9:return          
	}

	static void zza(SupportMapFragment$zzb supportmapfragment$zzb, Activity activity)
	{
		supportmapfragment$zzb.setActivity(activity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #42  <Method void setActivity(Activity)>
	//    3    5:return          
	}

	public void getMapAsync(OnMapReadyCallback onmapreadycallback)
	{
		if(zzBN() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #48  <Method com.google.android.gms.dynamic.LifecycleDelegate zzBN()>
	//*   2    4:ifnull          19
		{
			((SupportMapFragment$zza)zzBN()).getMapAsync(onmapreadycallback);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #48  <Method com.google.android.gms.dynamic.LifecycleDelegate zzBN()>
	//    5   11:checkcast       #50  <Class SupportMapFragment$zza>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #52  <Method void SupportMapFragment$zza.getMapAsync(OnMapReadyCallback)>
			return;
	//    8   18:return          
		} else
		{
			zzbos.add(((Object) (onmapreadycallback)));
	//    9   19:aload_0         
	//   10   20:getfield        #28  <Field List zzbos>
	//   11   23:aload_1         
	//   12   24:invokeinterface #58  <Method boolean List.add(Object)>
	//   13   29:pop             
			return;
	//   14   30:return          
		}
	}

	public void onEnterAmbient(Bundle bundle)
	{
		if(zzBN() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #48  <Method com.google.android.gms.dynamic.LifecycleDelegate zzBN()>
	//*   2    4:ifnull          18
			((SupportMapFragment$zza)zzBN()).onEnterAmbient(bundle);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #48  <Method com.google.android.gms.dynamic.LifecycleDelegate zzBN()>
	//    5   11:checkcast       #50  <Class SupportMapFragment$zza>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #62  <Method void SupportMapFragment$zza.onEnterAmbient(Bundle)>
	//    8   18:return          
	}

	public void onExitAmbient()
	{
		if(zzBN() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #48  <Method com.google.android.gms.dynamic.LifecycleDelegate zzBN()>
	//*   2    4:ifnull          17
			((SupportMapFragment$zza)zzBN()).onExitAmbient();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #48  <Method com.google.android.gms.dynamic.LifecycleDelegate zzBN()>
	//    5   11:checkcast       #50  <Class SupportMapFragment$zza>
	//    6   14:invokevirtual   #65  <Method void SupportMapFragment$zza.onExitAmbient()>
	//    7   17:return          
	}

	public void zzJz()
	{
		if(mActivity == null || zzbor == null || zzBN() != null)
			break MISSING_BLOCK_LABEL_138;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Activity mActivity>
	//    2    4:ifnull          138
	//    3    7:aload_0         
	//    4    8:getfield        #71  <Field zze zzbor>
	//    5   11:ifnull          138
	//    6   14:aload_0         
	//    7   15:invokevirtual   #48  <Method com.google.android.gms.dynamic.LifecycleDelegate zzBN()>
	//    8   18:ifnonnull       138
		Object obj;
		OnMapReadyCallback onmapreadycallback;
		try
		{
			MapsInitializer.initialize(((android.content.Context) (mActivity)));
	//    9   21:aload_0         
	//   10   22:getfield        #35  <Field Activity mActivity>
	//   11   25:invokestatic    #77  <Method int MapsInitializer.initialize(android.content.Context)>
	//   12   28:pop             
			obj = ((Object) (zzai.zzbI(((android.content.Context) (mActivity))).zzI(zzd.zzA(((Object) (mActivity))))));
	//   13   29:aload_0         
	//   14   30:getfield        #35  <Field Activity mActivity>
	//   15   33:invokestatic    #83  <Method zzc zzai.zzbI(android.content.Context)>
	//   16   36:aload_0         
	//   17   37:getfield        #35  <Field Activity mActivity>
	//   18   40:invokestatic    #89  <Method com.google.android.gms.dynamic.IObjectWrapper zzd.zzA(Object)>
	//   19   43:invokeinterface #95  <Method com.google.android.gms.maps.internal.IMapFragmentDelegate zzc.zzI(com.google.android.gms.dynamic.IObjectWrapper)>
	//   20   48:astore_1        
		}
	//*  21   49:aload_1         
	//*  22   50:ifnonnull       54
	//*  23   53:return          
	//*  24   54:aload_0         
	//*  25   55:getfield        #71  <Field zze zzbor>
	//*  26   58:new             #50  <Class SupportMapFragment$zza>
	//*  27   61:dup             
	//*  28   62:aload_0         
	//*  29   63:getfield        #30  <Field Fragment zzaRN>
	//*  30   66:aload_1         
	//*  31   67:invokespecial   #98  <Method void SupportMapFragment$zza(Fragment, com.google.android.gms.maps.internal.IMapFragmentDelegate)>
	//*  32   70:invokeinterface #103 <Method void zze.zza(com.google.android.gms.dynamic.LifecycleDelegate)>
	//*  33   75:aload_0         
	//*  34   76:getfield        #28  <Field List zzbos>
	//*  35   79:invokeinterface #107 <Method Iterator List.iterator()>
	//*  36   84:astore_1        
	//*  37   85:aload_1         
	//*  38   86:invokeinterface #113 <Method boolean Iterator.hasNext()>
	//*  39   91:ifeq            118
	//*  40   94:aload_1         
	//*  41   95:invokeinterface #117 <Method Object Iterator.next()>
	//*  42  100:checkcast       #119 <Class OnMapReadyCallback>
	//*  43  103:astore_2        
	//*  44  104:aload_0         
	//*  45  105:invokevirtual   #48  <Method com.google.android.gms.dynamic.LifecycleDelegate zzBN()>
	//*  46  108:checkcast       #50  <Class SupportMapFragment$zza>
	//*  47  111:aload_2         
	//*  48  112:invokevirtual   #52  <Method void SupportMapFragment$zza.getMapAsync(OnMapReadyCallback)>
	//*  49  115:goto            85
	//*  50  118:aload_0         
	//*  51  119:getfield        #28  <Field List zzbos>
	//*  52  122:invokeinterface #122 <Method void List.clear()>
	//*  53  127:return          
		catch(RemoteException remoteexception)
	//*  54  128:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//   55  129:new             #124 <Class RuntimeRemoteException>
	//   56  132:dup             
	//   57  133:aload_1         
	//   58  134:invokespecial   #127 <Method void RuntimeRemoteException(RemoteException)>
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
		zzbor.zza(((com.google.android.gms.dynamic.LifecycleDelegate) (new SupportMapFragment$zza(zzaRN, ((com.google.android.gms.maps.internal.IMapFragmentDelegate) (obj))))));
		for(obj = ((Object) (zzbos.iterator())); ((Iterator) (obj)).hasNext(); ((SupportMapFragment$zza)zzBN()).getMapAsync(onmapreadycallback))
			onmapreadycallback = (OnMapReadyCallback)((Iterator) (obj)).next();

		zzbos.clear();
		return;
	}

	public void zza(zze zze1)
	{
		zzbor = zze1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #71  <Field zze zzbor>
		zzJz();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #38  <Method void zzJz()>
	//    5    9:return          
	}

	private Activity mActivity;
	private final Fragment zzaRN;
	protected zze zzbor;
	private final List zzbos = new ArrayList();

	SupportMapFragment$zzb(Fragment fragment)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void zza()>
	//    2    4:aload_0         
	//    3    5:new             #25  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void ArrayList()>
	//    6   12:putfield        #28  <Field List zzbos>
		zzaRN = fragment;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #30  <Field Fragment zzaRN>
	//   10   20:return          
	}
}
