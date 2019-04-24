// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.view.*;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.internal.zzah;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//			SupportMapFragment, GoogleMapOptions, OnMapReadyCallback, GoogleMap

static class SupportMapFragment$zza
	implements MapLifecycleDelegate
{

	public void getMapAsync(OnMapReadyCallback onmapreadycallback)
	{
		try
		{
			zzbop.getMapAsync(((com.google.android.gms.maps.internal.zzt) (new com.google.android.gms.maps.internal.zzt.zza(onmapreadycallback) {

				public void zza(IGoogleMapDelegate igooglemapdelegate)
					throws RemoteException
				{
					zzboq.onMapReady(new GoogleMap(igooglemapdelegate));
				//    0    0:aload_0         
				//    1    1:getfield        #18  <Field OnMapReadyCallback zzboq>
				//    2    4:new             #27  <Class GoogleMap>
				//    3    7:dup             
				//    4    8:aload_1         
				//    5    9:invokespecial   #29  <Method void GoogleMap(IGoogleMapDelegate)>
				//    6   12:invokeinterface #35  <Method void OnMapReadyCallback.onMapReady(GoogleMap)>
				//    7   17:return          
				}

				final OnMapReadyCallback zzboq;

			
			{
				zzboq = onmapreadycallback;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #18  <Field OnMapReadyCallback zzboq>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void com.google.android.gms.maps.internal.zzt$zza()>
			//    5    9:return          
			}
			}
)));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field IMapFragmentDelegate zzbop>
	//    2    4:new             #11  <Class SupportMapFragment$zza$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #42  <Method void SupportMapFragment$zza$1(SupportMapFragment$zza, OnMapReadyCallback)>
	//    7   13:invokeinterface #45  <Method void IMapFragmentDelegate.getMapAsync(com.google.android.gms.maps.internal.zzt)>
			return;
	//    8   18:return          
		}
		// Misplaced declaration of an exception variable
		catch(OnMapReadyCallback onmapreadycallback)
	//*   9   19:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (onmapreadycallback)));
	//   10   20:new             #47  <Class RuntimeRemoteException>
	//   11   23:dup             
	//   12   24:aload_1         
	//   13   25:invokespecial   #50  <Method void RuntimeRemoteException(RemoteException)>
	//   14   28:athrow          
		}
	}

	public void onCreate(Bundle bundle)
	{
		Bundle bundle1;
		Bundle bundle2;
		try
		{
			bundle1 = new Bundle();
	//    0    0:new             #54  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #55  <Method void Bundle()>
	//    3    7:astore_2        
			zzah.zzd(bundle, bundle1);
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokestatic    #61  <Method void zzah.zzd(Bundle, Bundle)>
			bundle2 = zzaRN.getArguments();
	//    7   13:aload_0         
	//    8   14:getfield        #34  <Field Fragment zzaRN>
	//    9   17:invokevirtual   #65  <Method Bundle Fragment.getArguments()>
	//   10   20:astore_3        
		}
	//*  11   21:aload_3         
	//*  12   22:ifnull          46
	//*  13   25:aload_3         
	//*  14   26:ldc1            #67  <String "MapOptions">
	//*  15   28:invokevirtual   #71  <Method boolean Bundle.containsKey(String)>
	//*  16   31:ifeq            46
	//*  17   34:aload_2         
	//*  18   35:ldc1            #67  <String "MapOptions">
	//*  19   37:aload_3         
	//*  20   38:ldc1            #67  <String "MapOptions">
	//*  21   40:invokevirtual   #75  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//*  22   43:invokestatic    #78  <Method void zzah.zza(Bundle, String, android.os.Parcelable)>
	//*  23   46:aload_0         
	//*  24   47:getfield        #30  <Field IMapFragmentDelegate zzbop>
	//*  25   50:aload_2         
	//*  26   51:invokeinterface #80  <Method void IMapFragmentDelegate.onCreate(Bundle)>
	//*  27   56:aload_2         
	//*  28   57:aload_1         
	//*  29   58:invokestatic    #61  <Method void zzah.zzd(Bundle, Bundle)>
	//*  30   61:return          
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
	//*  31   62:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (bundle)));
	//   32   63:new             #47  <Class RuntimeRemoteException>
	//   33   66:dup             
	//   34   67:aload_1         
	//   35   68:invokespecial   #50  <Method void RuntimeRemoteException(RemoteException)>
	//   36   71:athrow          
		}
		if(bundle2 == null)
			break MISSING_BLOCK_LABEL_46;
		if(bundle2.containsKey("MapOptions"))
			zzah.zza(bundle1, "MapOptions", bundle2.getParcelable("MapOptions"));
		zzbop.onCreate(bundle1);
		zzah.zzd(bundle1, bundle);
		return;
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		try
		{
			Bundle bundle1 = new Bundle();
	//    0    0:new             #54  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #55  <Method void Bundle()>
	//    3    7:astore          4
			zzah.zzd(bundle, bundle1);
	//    4    9:aload_3         
	//    5   10:aload           4
	//    6   12:invokestatic    #61  <Method void zzah.zzd(Bundle, Bundle)>
			layoutinflater = ((LayoutInflater) (zzbop.onCreateView(zzd.zzA(((Object) (layoutinflater))), zzd.zzA(((Object) (viewgroup))), bundle1)));
	//    7   15:aload_0         
	//    8   16:getfield        #30  <Field IMapFragmentDelegate zzbop>
	//    9   19:aload_1         
	//   10   20:invokestatic    #88  <Method com.google.android.gms.dynamic.IObjectWrapper zzd.zzA(Object)>
	//   11   23:aload_2         
	//   12   24:invokestatic    #88  <Method com.google.android.gms.dynamic.IObjectWrapper zzd.zzA(Object)>
	//   13   27:aload           4
	//   14   29:invokeinterface #91  <Method com.google.android.gms.dynamic.IObjectWrapper IMapFragmentDelegate.onCreateView(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper, Bundle)>
	//   15   34:astore_1        
			zzah.zzd(bundle1, bundle);
	//   16   35:aload           4
	//   17   37:aload_3         
	//   18   38:invokestatic    #61  <Method void zzah.zzd(Bundle, Bundle)>
		}
	//*  19   41:goto            54
		// Misplaced declaration of an exception variable
		catch(LayoutInflater layoutinflater)
	//*  20   44:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (layoutinflater)));
	//   21   45:new             #47  <Class RuntimeRemoteException>
	//   22   48:dup             
	//   23   49:aload_1         
	//   24   50:invokespecial   #50  <Method void RuntimeRemoteException(RemoteException)>
	//   25   53:athrow          
		}
		return (View)zzd.zzF(((com.google.android.gms.dynamic.IObjectWrapper) (layoutinflater)));
	//   26   54:aload_1         
	//   27   55:invokestatic    #95  <Method Object zzd.zzF(com.google.android.gms.dynamic.IObjectWrapper)>
	//   28   58:checkcast       #97  <Class View>
	//   29   61:areturn         
	}

	public void onDestroy()
	{
		try
		{
			zzbop.onDestroy();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field IMapFragmentDelegate zzbop>
	//    2    4:invokeinterface #100 <Method void IMapFragmentDelegate.onDestroy()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    5   11:new             #47  <Class RuntimeRemoteException>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #50  <Method void RuntimeRemoteException(RemoteException)>
	//    9   19:athrow          
		}
	}

	public void onDestroyView()
	{
		try
		{
			zzbop.onDestroyView();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field IMapFragmentDelegate zzbop>
	//    2    4:invokeinterface #103 <Method void IMapFragmentDelegate.onDestroyView()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    5   11:new             #47  <Class RuntimeRemoteException>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #50  <Method void RuntimeRemoteException(RemoteException)>
	//    9   19:athrow          
		}
	}

	public void onEnterAmbient(Bundle bundle)
	{
		try
		{
			Bundle bundle1 = new Bundle();
	//    0    0:new             #54  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #55  <Method void Bundle()>
	//    3    7:astore_2        
			zzah.zzd(bundle, bundle1);
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokestatic    #61  <Method void zzah.zzd(Bundle, Bundle)>
			zzbop.onEnterAmbient(bundle1);
	//    7   13:aload_0         
	//    8   14:getfield        #30  <Field IMapFragmentDelegate zzbop>
	//    9   17:aload_2         
	//   10   18:invokeinterface #106 <Method void IMapFragmentDelegate.onEnterAmbient(Bundle)>
			zzah.zzd(bundle1, bundle);
	//   11   23:aload_2         
	//   12   24:aload_1         
	//   13   25:invokestatic    #61  <Method void zzah.zzd(Bundle, Bundle)>
			return;
	//   14   28:return          
		}
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
	//*  15   29:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (bundle)));
	//   16   30:new             #47  <Class RuntimeRemoteException>
	//   17   33:dup             
	//   18   34:aload_1         
	//   19   35:invokespecial   #50  <Method void RuntimeRemoteException(RemoteException)>
	//   20   38:athrow          
		}
	}

	public void onExitAmbient()
	{
		try
		{
			zzbop.onExitAmbient();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field IMapFragmentDelegate zzbop>
	//    2    4:invokeinterface #109 <Method void IMapFragmentDelegate.onExitAmbient()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    5   11:new             #47  <Class RuntimeRemoteException>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #50  <Method void RuntimeRemoteException(RemoteException)>
	//    9   19:athrow          
		}
	}

	public void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
	{
		bundle = ((Bundle) ((GoogleMapOptions)bundle.getParcelable("MapOptions")));
	//    0    0:aload_2         
	//    1    1:ldc1            #67  <String "MapOptions">
	//    2    3:invokevirtual   #75  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//    3    6:checkcast       #113 <Class GoogleMapOptions>
	//    4    9:astore_2        
		try
		{
			Bundle bundle2 = new Bundle();
	//    5   10:new             #54  <Class Bundle>
	//    6   13:dup             
	//    7   14:invokespecial   #55  <Method void Bundle()>
	//    8   17:astore          4
			zzah.zzd(bundle1, bundle2);
	//    9   19:aload_3         
	//   10   20:aload           4
	//   11   22:invokestatic    #61  <Method void zzah.zzd(Bundle, Bundle)>
			zzbop.onInflate(zzd.zzA(((Object) (activity))), ((GoogleMapOptions) (bundle)), bundle2);
	//   12   25:aload_0         
	//   13   26:getfield        #30  <Field IMapFragmentDelegate zzbop>
	//   14   29:aload_1         
	//   15   30:invokestatic    #88  <Method com.google.android.gms.dynamic.IObjectWrapper zzd.zzA(Object)>
	//   16   33:aload_2         
	//   17   34:aload           4
	//   18   36:invokeinterface #116 <Method void IMapFragmentDelegate.onInflate(com.google.android.gms.dynamic.IObjectWrapper, GoogleMapOptions, Bundle)>
			zzah.zzd(bundle2, bundle1);
	//   19   41:aload           4
	//   20   43:aload_3         
	//   21   44:invokestatic    #61  <Method void zzah.zzd(Bundle, Bundle)>
			return;
	//   22   47:return          
		}
		// Misplaced declaration of an exception variable
		catch(Activity activity)
	//*  23   48:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (activity)));
	//   24   49:new             #47  <Class RuntimeRemoteException>
	//   25   52:dup             
	//   26   53:aload_1         
	//   27   54:invokespecial   #50  <Method void RuntimeRemoteException(RemoteException)>
	//   28   57:athrow          
		}
	}

	public void onLowMemory()
	{
		try
		{
			zzbop.onLowMemory();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field IMapFragmentDelegate zzbop>
	//    2    4:invokeinterface #119 <Method void IMapFragmentDelegate.onLowMemory()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    5   11:new             #47  <Class RuntimeRemoteException>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #50  <Method void RuntimeRemoteException(RemoteException)>
	//    9   19:athrow          
		}
	}

	public void onPause()
	{
		try
		{
			zzbop.onPause();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field IMapFragmentDelegate zzbop>
	//    2    4:invokeinterface #122 <Method void IMapFragmentDelegate.onPause()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    5   11:new             #47  <Class RuntimeRemoteException>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #50  <Method void RuntimeRemoteException(RemoteException)>
	//    9   19:athrow          
		}
	}

	public void onResume()
	{
		try
		{
			zzbop.onResume();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field IMapFragmentDelegate zzbop>
	//    2    4:invokeinterface #125 <Method void IMapFragmentDelegate.onResume()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    5   11:new             #47  <Class RuntimeRemoteException>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #50  <Method void RuntimeRemoteException(RemoteException)>
	//    9   19:athrow          
		}
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		try
		{
			Bundle bundle1 = new Bundle();
	//    0    0:new             #54  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #55  <Method void Bundle()>
	//    3    7:astore_2        
			zzah.zzd(bundle, bundle1);
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokestatic    #61  <Method void zzah.zzd(Bundle, Bundle)>
			zzbop.onSaveInstanceState(bundle1);
	//    7   13:aload_0         
	//    8   14:getfield        #30  <Field IMapFragmentDelegate zzbop>
	//    9   17:aload_2         
	//   10   18:invokeinterface #128 <Method void IMapFragmentDelegate.onSaveInstanceState(Bundle)>
			zzah.zzd(bundle1, bundle);
	//   11   23:aload_2         
	//   12   24:aload_1         
	//   13   25:invokestatic    #61  <Method void zzah.zzd(Bundle, Bundle)>
			return;
	//   14   28:return          
		}
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
	//*  15   29:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (bundle)));
	//   16   30:new             #47  <Class RuntimeRemoteException>
	//   17   33:dup             
	//   18   34:aload_1         
	//   19   35:invokespecial   #50  <Method void RuntimeRemoteException(RemoteException)>
	//   20   38:athrow          
		}
	}

	public void onStart()
	{
		try
		{
			zzbop.onStart();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field IMapFragmentDelegate zzbop>
	//    2    4:invokeinterface #131 <Method void IMapFragmentDelegate.onStart()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    5   11:new             #47  <Class RuntimeRemoteException>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #50  <Method void RuntimeRemoteException(RemoteException)>
	//    9   19:athrow          
		}
	}

	public void onStop()
	{
		try
		{
			zzbop.onStop();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field IMapFragmentDelegate zzbop>
	//    2    4:invokeinterface #134 <Method void IMapFragmentDelegate.onStop()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    5   11:new             #47  <Class RuntimeRemoteException>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #50  <Method void RuntimeRemoteException(RemoteException)>
	//    9   19:athrow          
		}
	}

	private final Fragment zzaRN;
	private final IMapFragmentDelegate zzbop;

	public SupportMapFragment$zza(Fragment fragment, IMapFragmentDelegate imapfragmentdelegate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		zzbop = (IMapFragmentDelegate)zzac.zzw(((Object) (imapfragmentdelegate)));
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokestatic    #26  <Method Object zzac.zzw(Object)>
	//    5    9:checkcast       #28  <Class IMapFragmentDelegate>
	//    6   12:putfield        #30  <Field IMapFragmentDelegate zzbop>
		zzaRN = (Fragment)zzac.zzw(((Object) (fragment)));
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokestatic    #26  <Method Object zzac.zzw(Object)>
	//   10   20:checkcast       #32  <Class Fragment>
	//   11   23:putfield        #34  <Field Fragment zzaRN>
	//   12   26:return          
	}
}
