// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.app.Activity;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.*;
import com.google.android.gms.maps.internal.zzai;
import com.google.android.gms.maps.internal.zzc;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.*;

// Referenced classes of package com.google.android.gms.maps:
//			SupportStreetViewPanoramaFragment, MapsInitializer, OnStreetViewPanoramaReadyCallback

static class SupportStreetViewPanoramaFragment$zzb extends zza
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

	static void zza(SupportStreetViewPanoramaFragment$zzb supportstreetviewpanoramafragment$zzb, Activity activity)
	{
		supportstreetviewpanoramafragment$zzb.setActivity(activity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #42  <Method void setActivity(Activity)>
	//    3    5:return          
	}

	public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
	{
		if(zzBN() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #48  <Method com.google.android.gms.dynamic.LifecycleDelegate zzBN()>
	//*   2    4:ifnull          19
		{
			((SupportStreetViewPanoramaFragment$zza)zzBN()).getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #48  <Method com.google.android.gms.dynamic.LifecycleDelegate zzBN()>
	//    5   11:checkcast       #50  <Class SupportStreetViewPanoramaFragment$zza>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #52  <Method void SupportStreetViewPanoramaFragment$zza.getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback)>
			return;
	//    8   18:return          
		} else
		{
			zzboI.add(((Object) (onstreetviewpanoramareadycallback)));
	//    9   19:aload_0         
	//   10   20:getfield        #28  <Field List zzboI>
	//   11   23:aload_1         
	//   12   24:invokeinterface #58  <Method boolean List.add(Object)>
	//   13   29:pop             
			return;
	//   14   30:return          
		}
	}

	public void zzJz()
	{
		if(mActivity == null || zzbor == null || zzBN() != null)
			break MISSING_BLOCK_LABEL_133;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Activity mActivity>
	//    2    4:ifnull          133
	//    3    7:aload_0         
	//    4    8:getfield        #64  <Field zze zzbor>
	//    5   11:ifnull          133
	//    6   14:aload_0         
	//    7   15:invokevirtual   #48  <Method com.google.android.gms.dynamic.LifecycleDelegate zzBN()>
	//    8   18:ifnonnull       133
		try
		{
			MapsInitializer.initialize(((android.content.Context) (mActivity)));
	//    9   21:aload_0         
	//   10   22:getfield        #35  <Field Activity mActivity>
	//   11   25:invokestatic    #70  <Method int MapsInitializer.initialize(android.content.Context)>
	//   12   28:pop             
			com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate istreetviewpanoramafragmentdelegate = zzai.zzbI(((android.content.Context) (mActivity))).zzJ(zzd.zzA(((Object) (mActivity))));
	//   13   29:aload_0         
	//   14   30:getfield        #35  <Field Activity mActivity>
	//   15   33:invokestatic    #76  <Method zzc zzai.zzbI(android.content.Context)>
	//   16   36:aload_0         
	//   17   37:getfield        #35  <Field Activity mActivity>
	//   18   40:invokestatic    #82  <Method com.google.android.gms.dynamic.IObjectWrapper zzd.zzA(Object)>
	//   19   43:invokeinterface #88  <Method com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate zzc.zzJ(com.google.android.gms.dynamic.IObjectWrapper)>
	//   20   48:astore_1        
			zzbor.zza(((com.google.android.gms.dynamic.LifecycleDelegate) (new SupportStreetViewPanoramaFragment$zza(zzaRN, istreetviewpanoramafragmentdelegate))));
	//   21   49:aload_0         
	//   22   50:getfield        #64  <Field zze zzbor>
	//   23   53:new             #50  <Class SupportStreetViewPanoramaFragment$zza>
	//   24   56:dup             
	//   25   57:aload_0         
	//   26   58:getfield        #30  <Field Fragment zzaRN>
	//   27   61:aload_1         
	//   28   62:invokespecial   #91  <Method void SupportStreetViewPanoramaFragment$zza(Fragment, com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate)>
	//   29   65:invokeinterface #96  <Method void zze.zza(com.google.android.gms.dynamic.LifecycleDelegate)>
			OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback;
			for(Iterator iterator = zzboI.iterator(); iterator.hasNext(); ((SupportStreetViewPanoramaFragment$zza)zzBN()).getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback))
	//*  30   70:aload_0         
	//*  31   71:getfield        #28  <Field List zzboI>
	//*  32   74:invokeinterface #100 <Method Iterator List.iterator()>
	//*  33   79:astore_1        
	//*  34   80:aload_1         
	//*  35   81:invokeinterface #106 <Method boolean Iterator.hasNext()>
	//*  36   86:ifeq            113
				onstreetviewpanoramareadycallback = (OnStreetViewPanoramaReadyCallback)iterator.next();
	//   37   89:aload_1         
	//   38   90:invokeinterface #110 <Method Object Iterator.next()>
	//   39   95:checkcast       #112 <Class OnStreetViewPanoramaReadyCallback>
	//   40   98:astore_2        

	//   41   99:aload_0         
	//   42  100:invokevirtual   #48  <Method com.google.android.gms.dynamic.LifecycleDelegate zzBN()>
	//   43  103:checkcast       #50  <Class SupportStreetViewPanoramaFragment$zza>
	//   44  106:aload_2         
	//   45  107:invokevirtual   #52  <Method void SupportStreetViewPanoramaFragment$zza.getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback)>
		}
	//*  46  110:goto            80
	//*  47  113:aload_0         
	//*  48  114:getfield        #28  <Field List zzboI>
	//*  49  117:invokeinterface #115 <Method void List.clear()>
	//*  50  122:return          
		catch(RemoteException remoteexception)
	//*  51  123:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//   52  124:new             #117 <Class RuntimeRemoteException>
	//   53  127:dup             
	//   54  128:aload_1         
	//   55  129:invokespecial   #120 <Method void RuntimeRemoteException(RemoteException)>
	//   56  132:athrow          
		}
	//*  57  133:return          
		catch(GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception)
	//*  58  134:astore_1        
		{
			return;
	//   59  135:return          
		}
		zzboI.clear();
		return;
	}

	public void zza(zze zze1)
	{
		zzbor = zze1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #64  <Field zze zzbor>
		zzJz();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #38  <Method void zzJz()>
	//    5    9:return          
	}

	private Activity mActivity;
	private final Fragment zzaRN;
	private final List zzboI = new ArrayList();
	protected zze zzbor;

	SupportStreetViewPanoramaFragment$zzb(Fragment fragment)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void zza()>
	//    2    4:aload_0         
	//    3    5:new             #25  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void ArrayList()>
	//    6   12:putfield        #28  <Field List zzboI>
		zzaRN = fragment;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #30  <Field Fragment zzaRN>
	//   10   20:return          
	}
}
