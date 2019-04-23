// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.app.Activity;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.*;
import com.google.android.gms.maps.internal.zzbz;
import com.google.android.gms.maps.internal.zze;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.*;

// Referenced classes of package com.google.android.gms.maps:
//			SupportStreetViewPanoramaFragment, MapsInitializer, OnStreetViewPanoramaReadyCallback

static final class SupportStreetViewPanoramaFragment$zzb extends DeferredLifecycleHelper
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

	static void zza(SupportStreetViewPanoramaFragment$zzb supportstreetviewpanoramafragment$zzb, Activity activity)
	{
		supportstreetviewpanoramafragment$zzb.setActivity(activity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #44  <Method void setActivity(Activity)>
	//    3    5:return          
	}

	private final void zzc()
	{
		if(zzbd == null || zzbc == null || getDelegate() != null)
			break MISSING_BLOCK_LABEL_133;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field Activity zzbd>
	//    2    4:ifnull          133
	//    3    7:aload_0         
	//    4    8:getfield        #50  <Field OnDelegateCreatedListener zzbc>
	//    5   11:ifnull          133
	//    6   14:aload_0         
	//    7   15:invokevirtual   #54  <Method com.google.android.gms.dynamic.LifecycleDelegate getDelegate()>
	//    8   18:ifnonnull       133
		try
		{
			MapsInitializer.initialize(((android.content.Context) (zzbd)));
	//    9   21:aload_0         
	//   10   22:getfield        #37  <Field Activity zzbd>
	//   11   25:invokestatic    #60  <Method int MapsInitializer.initialize(android.content.Context)>
	//   12   28:pop             
			com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate istreetviewpanoramafragmentdelegate = zzbz.zza(((android.content.Context) (zzbd))).zzd(ObjectWrapper.wrap(((Object) (zzbd))));
	//   13   29:aload_0         
	//   14   30:getfield        #37  <Field Activity zzbd>
	//   15   33:invokestatic    #65  <Method zze zzbz.zza(android.content.Context)>
	//   16   36:aload_0         
	//   17   37:getfield        #37  <Field Activity zzbd>
	//   18   40:invokestatic    #71  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   19   43:invokeinterface #77  <Method com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate zze.zzd(com.google.android.gms.dynamic.IObjectWrapper)>
	//   20   48:astore_1        
			zzbc.onDelegateCreated(((com.google.android.gms.dynamic.LifecycleDelegate) (new SupportStreetViewPanoramaFragment$zza(fragment, istreetviewpanoramafragmentdelegate))));
	//   21   49:aload_0         
	//   22   50:getfield        #50  <Field OnDelegateCreatedListener zzbc>
	//   23   53:new             #79  <Class SupportStreetViewPanoramaFragment$zza>
	//   24   56:dup             
	//   25   57:aload_0         
	//   26   58:getfield        #31  <Field Fragment fragment>
	//   27   61:aload_1         
	//   28   62:invokespecial   #82  <Method void SupportStreetViewPanoramaFragment$zza(Fragment, com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate)>
	//   29   65:invokeinterface #88  <Method void OnDelegateCreatedListener.onDelegateCreated(com.google.android.gms.dynamic.LifecycleDelegate)>
			OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback;
			for(Iterator iterator = zzbv.iterator(); iterator.hasNext(); ((SupportStreetViewPanoramaFragment$zza)getDelegate()).getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback))
	//*  30   70:aload_0         
	//*  31   71:getfield        #29  <Field List zzbv>
	//*  32   74:invokeinterface #94  <Method Iterator List.iterator()>
	//*  33   79:astore_1        
	//*  34   80:aload_1         
	//*  35   81:invokeinterface #100 <Method boolean Iterator.hasNext()>
	//*  36   86:ifeq            113
				onstreetviewpanoramareadycallback = (OnStreetViewPanoramaReadyCallback)iterator.next();
	//   37   89:aload_1         
	//   38   90:invokeinterface #104 <Method Object Iterator.next()>
	//   39   95:checkcast       #106 <Class OnStreetViewPanoramaReadyCallback>
	//   40   98:astore_2        

	//   41   99:aload_0         
	//   42  100:invokevirtual   #54  <Method com.google.android.gms.dynamic.LifecycleDelegate getDelegate()>
	//   43  103:checkcast       #79  <Class SupportStreetViewPanoramaFragment$zza>
	//   44  106:aload_2         
	//   45  107:invokevirtual   #110 <Method void SupportStreetViewPanoramaFragment$zza.getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback)>
		}
	//*  46  110:goto            80
	//*  47  113:aload_0         
	//*  48  114:getfield        #29  <Field List zzbv>
	//*  49  117:invokeinterface #113 <Method void List.clear()>
	//*  50  122:return          
		catch(RemoteException remoteexception)
	//*  51  123:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//   52  124:new             #115 <Class RuntimeRemoteException>
	//   53  127:dup             
	//   54  128:aload_1         
	//   55  129:invokespecial   #118 <Method void RuntimeRemoteException(RemoteException)>
	//   56  132:athrow          
		}
	//*  57  133:return          
		catch(GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception)
	//*  58  134:astore_1        
		{
			return;
	//   59  135:return          
		}
		zzbv.clear();
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

	public final void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
	{
		if(getDelegate() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #54  <Method com.google.android.gms.dynamic.LifecycleDelegate getDelegate()>
	//*   2    4:ifnull          19
		{
			((SupportStreetViewPanoramaFragment$zza)getDelegate()).getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #54  <Method com.google.android.gms.dynamic.LifecycleDelegate getDelegate()>
	//    5   11:checkcast       #79  <Class SupportStreetViewPanoramaFragment$zza>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #110 <Method void SupportStreetViewPanoramaFragment$zza.getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback)>
			return;
	//    8   18:return          
		} else
		{
			zzbv.add(((Object) (onstreetviewpanoramareadycallback)));
	//    9   19:aload_0         
	//   10   20:getfield        #29  <Field List zzbv>
	//   11   23:aload_1         
	//   12   24:invokeinterface #126 <Method boolean List.add(Object)>
	//   13   29:pop             
			return;
	//   14   30:return          
		}
	}

	private final Fragment fragment;
	private OnDelegateCreatedListener zzbc;
	private Activity zzbd;
	private final List zzbv = new ArrayList();

	SupportStreetViewPanoramaFragment$zzb(Fragment fragment1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void DeferredLifecycleHelper()>
	//    2    4:aload_0         
	//    3    5:new             #26  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #27  <Method void ArrayList()>
	//    6   12:putfield        #29  <Field List zzbv>
		fragment = fragment1;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #31  <Field Fragment fragment>
	//   10   20:return          
	}
}
