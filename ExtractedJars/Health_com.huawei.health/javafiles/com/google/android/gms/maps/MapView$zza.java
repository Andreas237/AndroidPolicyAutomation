// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.*;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.internal.zzah;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//			MapView, OnMapReadyCallback, GoogleMap

static class MapView$zza
	implements MapLifecycleDelegate
{

	public void getMapAsync(OnMapReadyCallback onmapreadycallback)
	{
		try
		{
			zzbov.getMapAsync(((com.google.android.gms.maps.internal.zzt) (new com.google.android.gms.maps.internal.zzt.zza(onmapreadycallback) {

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
	//    1    1:getfield        #32  <Field IMapViewDelegate zzbov>
	//    2    4:new             #11  <Class MapView$zza$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #44  <Method void MapView$zza$1(MapView$zza, OnMapReadyCallback)>
	//    7   13:invokeinterface #47  <Method void IMapViewDelegate.getMapAsync(com.google.android.gms.maps.internal.zzt)>
			return;
	//    8   18:return          
		}
		// Misplaced declaration of an exception variable
		catch(OnMapReadyCallback onmapreadycallback)
	//*   9   19:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (onmapreadycallback)));
	//   10   20:new             #49  <Class RuntimeRemoteException>
	//   11   23:dup             
	//   12   24:aload_1         
	//   13   25:invokespecial   #52  <Method void RuntimeRemoteException(RemoteException)>
	//   14   28:athrow          
		}
	}

	public void onCreate(Bundle bundle)
	{
		try
		{
			Bundle bundle1 = new Bundle();
	//    0    0:new             #56  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #57  <Method void Bundle()>
	//    3    7:astore_2        
			zzah.zzd(bundle, bundle1);
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokestatic    #63  <Method void zzah.zzd(Bundle, Bundle)>
			zzbov.onCreate(bundle1);
	//    7   13:aload_0         
	//    8   14:getfield        #32  <Field IMapViewDelegate zzbov>
	//    9   17:aload_2         
	//   10   18:invokeinterface #65  <Method void IMapViewDelegate.onCreate(Bundle)>
			zzah.zzd(bundle1, bundle);
	//   11   23:aload_2         
	//   12   24:aload_1         
	//   13   25:invokestatic    #63  <Method void zzah.zzd(Bundle, Bundle)>
			zzbow = (View)zzd.zzF(zzbov.getView());
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #32  <Field IMapViewDelegate zzbov>
	//   17   33:invokeinterface #69  <Method com.google.android.gms.dynamic.IObjectWrapper IMapViewDelegate.getView()>
	//   18   38:invokestatic    #75  <Method Object zzd.zzF(com.google.android.gms.dynamic.IObjectWrapper)>
	//   19   41:checkcast       #77  <Class View>
	//   20   44:putfield        #79  <Field View zzbow>
			zzbou.removeAllViews();
	//   21   47:aload_0         
	//   22   48:getfield        #36  <Field ViewGroup zzbou>
	//   23   51:invokevirtual   #82  <Method void ViewGroup.removeAllViews()>
			zzbou.addView(zzbow);
	//   24   54:aload_0         
	//   25   55:getfield        #36  <Field ViewGroup zzbou>
	//   26   58:aload_0         
	//   27   59:getfield        #79  <Field View zzbow>
	//   28   62:invokevirtual   #86  <Method void ViewGroup.addView(View)>
			return;
	//   29   65:return          
		}
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
	//*  30   66:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (bundle)));
	//   31   67:new             #49  <Class RuntimeRemoteException>
	//   32   70:dup             
	//   33   71:aload_1         
	//   34   72:invokespecial   #52  <Method void RuntimeRemoteException(RemoteException)>
	//   35   75:athrow          
		}
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
	//    0    0:new             #90  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #92  <String "onCreateView not allowed on MapViewDelegate">
	//    3    6:invokespecial   #95  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public void onDestroy()
	{
		try
		{
			zzbov.onDestroy();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field IMapViewDelegate zzbov>
	//    2    4:invokeinterface #98  <Method void IMapViewDelegate.onDestroy()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    5   11:new             #49  <Class RuntimeRemoteException>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #52  <Method void RuntimeRemoteException(RemoteException)>
	//    9   19:athrow          
		}
	}

	public void onDestroyView()
	{
		throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
	//    0    0:new             #90  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #101 <String "onDestroyView not allowed on MapViewDelegate">
	//    3    6:invokespecial   #95  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public void onEnterAmbient(Bundle bundle)
	{
		try
		{
			Bundle bundle1 = new Bundle();
	//    0    0:new             #56  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #57  <Method void Bundle()>
	//    3    7:astore_2        
			zzah.zzd(bundle, bundle1);
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokestatic    #63  <Method void zzah.zzd(Bundle, Bundle)>
			zzbov.onEnterAmbient(bundle1);
	//    7   13:aload_0         
	//    8   14:getfield        #32  <Field IMapViewDelegate zzbov>
	//    9   17:aload_2         
	//   10   18:invokeinterface #104 <Method void IMapViewDelegate.onEnterAmbient(Bundle)>
			zzah.zzd(bundle1, bundle);
	//   11   23:aload_2         
	//   12   24:aload_1         
	//   13   25:invokestatic    #63  <Method void zzah.zzd(Bundle, Bundle)>
			return;
	//   14   28:return          
		}
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
	//*  15   29:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (bundle)));
	//   16   30:new             #49  <Class RuntimeRemoteException>
	//   17   33:dup             
	//   18   34:aload_1         
	//   19   35:invokespecial   #52  <Method void RuntimeRemoteException(RemoteException)>
	//   20   38:athrow          
		}
	}

	public void onExitAmbient()
	{
		try
		{
			zzbov.onExitAmbient();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field IMapViewDelegate zzbov>
	//    2    4:invokeinterface #107 <Method void IMapViewDelegate.onExitAmbient()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    5   11:new             #49  <Class RuntimeRemoteException>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #52  <Method void RuntimeRemoteException(RemoteException)>
	//    9   19:athrow          
		}
	}

	public void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
	{
		throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
	//    0    0:new             #90  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #111 <String "onInflate not allowed on MapViewDelegate">
	//    3    6:invokespecial   #95  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public void onLowMemory()
	{
		try
		{
			zzbov.onLowMemory();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field IMapViewDelegate zzbov>
	//    2    4:invokeinterface #114 <Method void IMapViewDelegate.onLowMemory()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    5   11:new             #49  <Class RuntimeRemoteException>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #52  <Method void RuntimeRemoteException(RemoteException)>
	//    9   19:athrow          
		}
	}

	public void onPause()
	{
		try
		{
			zzbov.onPause();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field IMapViewDelegate zzbov>
	//    2    4:invokeinterface #117 <Method void IMapViewDelegate.onPause()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    5   11:new             #49  <Class RuntimeRemoteException>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #52  <Method void RuntimeRemoteException(RemoteException)>
	//    9   19:athrow          
		}
	}

	public void onResume()
	{
		try
		{
			zzbov.onResume();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field IMapViewDelegate zzbov>
	//    2    4:invokeinterface #120 <Method void IMapViewDelegate.onResume()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    5   11:new             #49  <Class RuntimeRemoteException>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #52  <Method void RuntimeRemoteException(RemoteException)>
	//    9   19:athrow          
		}
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		try
		{
			Bundle bundle1 = new Bundle();
	//    0    0:new             #56  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #57  <Method void Bundle()>
	//    3    7:astore_2        
			zzah.zzd(bundle, bundle1);
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokestatic    #63  <Method void zzah.zzd(Bundle, Bundle)>
			zzbov.onSaveInstanceState(bundle1);
	//    7   13:aload_0         
	//    8   14:getfield        #32  <Field IMapViewDelegate zzbov>
	//    9   17:aload_2         
	//   10   18:invokeinterface #123 <Method void IMapViewDelegate.onSaveInstanceState(Bundle)>
			zzah.zzd(bundle1, bundle);
	//   11   23:aload_2         
	//   12   24:aload_1         
	//   13   25:invokestatic    #63  <Method void zzah.zzd(Bundle, Bundle)>
			return;
	//   14   28:return          
		}
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
	//*  15   29:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (bundle)));
	//   16   30:new             #49  <Class RuntimeRemoteException>
	//   17   33:dup             
	//   18   34:aload_1         
	//   19   35:invokespecial   #52  <Method void RuntimeRemoteException(RemoteException)>
	//   20   38:athrow          
		}
	}

	public void onStart()
	{
		try
		{
			zzbov.onStart();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field IMapViewDelegate zzbov>
	//    2    4:invokeinterface #126 <Method void IMapViewDelegate.onStart()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    5   11:new             #49  <Class RuntimeRemoteException>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #52  <Method void RuntimeRemoteException(RemoteException)>
	//    9   19:athrow          
		}
	}

	public void onStop()
	{
		try
		{
			zzbov.onStop();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field IMapViewDelegate zzbov>
	//    2    4:invokeinterface #129 <Method void IMapViewDelegate.onStop()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    5   11:new             #49  <Class RuntimeRemoteException>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #52  <Method void RuntimeRemoteException(RemoteException)>
	//    9   19:athrow          
		}
	}

	private final ViewGroup zzbou;
	private final IMapViewDelegate zzbov;
	private View zzbow;

	public MapView$zza(ViewGroup viewgroup, IMapViewDelegate imapviewdelegate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		zzbov = (IMapViewDelegate)zzac.zzw(((Object) (imapviewdelegate)));
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokestatic    #28  <Method Object zzac.zzw(Object)>
	//    5    9:checkcast       #30  <Class IMapViewDelegate>
	//    6   12:putfield        #32  <Field IMapViewDelegate zzbov>
		zzbou = (ViewGroup)zzac.zzw(((Object) (viewgroup)));
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokestatic    #28  <Method Object zzac.zzw(Object)>
	//   10   20:checkcast       #34  <Class ViewGroup>
	//   11   23:putfield        #36  <Field ViewGroup zzbou>
	//   12   26:return          
	}
}
