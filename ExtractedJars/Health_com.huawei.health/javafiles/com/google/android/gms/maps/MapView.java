// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.*;
import android.widget.FrameLayout;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.dynamic.*;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.internal.zzah;
import com.google.android.gms.maps.internal.zzai;
import com.google.android.gms.maps.internal.zzc;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.*;

// Referenced classes of package com.google.android.gms.maps:
//			GoogleMapOptions, OnMapReadyCallback, GoogleMap, MapsInitializer

public class MapView extends FrameLayout
{
	static class zza
		implements MapLifecycleDelegate
	{

		public void getMapAsync(OnMapReadyCallback onmapreadycallback)
		{
			try
			{
				zzbov.getMapAsync(((com.google.android.gms.maps.internal.zzt) (new com.google.android.gms.maps.internal.zzt.zza(this, onmapreadycallback) {

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

		public zza(ViewGroup viewgroup, IMapViewDelegate imapviewdelegate)
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

	static class zzb extends com.google.android.gms.dynamic.zza
	{

		public void getMapAsync(OnMapReadyCallback onmapreadycallback)
		{
			if(zzBN() != null)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #43  <Method com.google.android.gms.dynamic.LifecycleDelegate zzBN()>
		//*   2    4:ifnull          19
			{
				((zza)zzBN()).getMapAsync(onmapreadycallback);
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
				((zza)zzBN()).onEnterAmbient(bundle);
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
				((zza)zzBN()).onExitAmbient();
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
		//   18   40:invokeinterface #91  <Method IMapViewDelegate zzc.zza(com.google.android.gms.dynamic.IObjectWrapper, GoogleMapOptions)>
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
		//*  30   64:invokespecial   #94  <Method void MapView$zza(ViewGroup, IMapViewDelegate)>
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
			zzbor.zza(((com.google.android.gms.dynamic.LifecycleDelegate) (new zza(zzbox, ((IMapViewDelegate) (obj))))));
			for(obj = ((Object) (zzbos.iterator())); ((Iterator) (obj)).hasNext(); ((zza)zzBN()).getMapAsync(onmapreadycallback))
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

		zzb(ViewGroup viewgroup, Context context, GoogleMapOptions googlemapoptions)
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


	public MapView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void FrameLayout(Context)>
		zzbot = new zzb(((ViewGroup) (this)), context, ((GoogleMapOptions) (null)));
	//    3    5:aload_0         
	//    4    6:new             #11  <Class MapView$zzb>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:aconst_null     
	//    9   13:invokespecial   #21  <Method void MapView$zzb(ViewGroup, Context, GoogleMapOptions)>
	//   10   16:putfield        #23  <Field MapView$zzb zzbot>
		zzJA();
	//   11   19:aload_0         
	//   12   20:invokespecial   #27  <Method void zzJA()>
	//   13   23:return          
	}

	public MapView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #31  <Method void FrameLayout(Context, AttributeSet)>
		zzbot = new zzb(((ViewGroup) (this)), context, GoogleMapOptions.createFromAttributes(context, attributeset));
	//    4    6:aload_0         
	//    5    7:new             #11  <Class MapView$zzb>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:aload_1         
	//   10   14:aload_2         
	//   11   15:invokestatic    #37  <Method GoogleMapOptions GoogleMapOptions.createFromAttributes(Context, AttributeSet)>
	//   12   18:invokespecial   #21  <Method void MapView$zzb(ViewGroup, Context, GoogleMapOptions)>
	//   13   21:putfield        #23  <Field MapView$zzb zzbot>
		zzJA();
	//   14   24:aload_0         
	//   15   25:invokespecial   #27  <Method void zzJA()>
	//   16   28:return          
	}

	public MapView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #40  <Method void FrameLayout(Context, AttributeSet, int)>
		zzbot = new zzb(((ViewGroup) (this)), context, GoogleMapOptions.createFromAttributes(context, attributeset));
	//    5    7:aload_0         
	//    6    8:new             #11  <Class MapView$zzb>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:aload_1         
	//   11   15:aload_2         
	//   12   16:invokestatic    #37  <Method GoogleMapOptions GoogleMapOptions.createFromAttributes(Context, AttributeSet)>
	//   13   19:invokespecial   #21  <Method void MapView$zzb(ViewGroup, Context, GoogleMapOptions)>
	//   14   22:putfield        #23  <Field MapView$zzb zzbot>
		zzJA();
	//   15   25:aload_0         
	//   16   26:invokespecial   #27  <Method void zzJA()>
	//   17   29:return          
	}

	public MapView(Context context, GoogleMapOptions googlemapoptions)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void FrameLayout(Context)>
		zzbot = new zzb(((ViewGroup) (this)), context, googlemapoptions);
	//    3    5:aload_0         
	//    4    6:new             #11  <Class MapView$zzb>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:invokespecial   #21  <Method void MapView$zzb(ViewGroup, Context, GoogleMapOptions)>
	//   10   16:putfield        #23  <Field MapView$zzb zzbot>
		zzJA();
	//   11   19:aload_0         
	//   12   20:invokespecial   #27  <Method void zzJA()>
	//   13   23:return          
	}

	private void zzJA()
	{
		setClickable(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #45  <Method void setClickable(boolean)>
	//    3    5:return          
	}

	public void getMapAsync(OnMapReadyCallback onmapreadycallback)
	{
		zzac.zzdj("getMapAsync() must be called on the main thread");
	//    0    0:ldc1            #49  <String "getMapAsync() must be called on the main thread">
	//    1    2:invokestatic    #55  <Method void zzac.zzdj(String)>
		zzbot.getMapAsync(onmapreadycallback);
	//    2    5:aload_0         
	//    3    6:getfield        #23  <Field MapView$zzb zzbot>
	//    4    9:aload_1         
	//    5   10:invokevirtual   #57  <Method void MapView$zzb.getMapAsync(OnMapReadyCallback)>
	//    6   13:return          
	}

	public final void onCreate(Bundle bundle)
	{
		zzbot.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field MapView$zzb zzbot>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #61  <Method void MapView$zzb.onCreate(Bundle)>
		if(zzbot.zzBN() == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #23  <Field MapView$zzb zzbot>
	//*   6   12:invokevirtual   #65  <Method com.google.android.gms.dynamic.LifecycleDelegate MapView$zzb.zzBN()>
	//*   7   15:ifnonnull       22
			com.google.android.gms.dynamic.zza.zzb(((FrameLayout) (this)));
	//    8   18:aload_0         
	//    9   19:invokestatic    #70  <Method void zza.zzb(FrameLayout)>
	//   10   22:return          
	}

	public final void onDestroy()
	{
		zzbot.onDestroy();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field MapView$zzb zzbot>
	//    2    4:invokevirtual   #73  <Method void MapView$zzb.onDestroy()>
	//    3    7:return          
	}

	public final void onEnterAmbient(Bundle bundle)
	{
		zzac.zzdj("onEnterAmbient() must be called on the main thread");
	//    0    0:ldc1            #76  <String "onEnterAmbient() must be called on the main thread">
	//    1    2:invokestatic    #55  <Method void zzac.zzdj(String)>
		zzbot.onEnterAmbient(bundle);
	//    2    5:aload_0         
	//    3    6:getfield        #23  <Field MapView$zzb zzbot>
	//    4    9:aload_1         
	//    5   10:invokevirtual   #78  <Method void MapView$zzb.onEnterAmbient(Bundle)>
	//    6   13:return          
	}

	public final void onExitAmbient()
	{
		zzac.zzdj("onExitAmbient() must be called on the main thread");
	//    0    0:ldc1            #81  <String "onExitAmbient() must be called on the main thread">
	//    1    2:invokestatic    #55  <Method void zzac.zzdj(String)>
		zzbot.onExitAmbient();
	//    2    5:aload_0         
	//    3    6:getfield        #23  <Field MapView$zzb zzbot>
	//    4    9:invokevirtual   #83  <Method void MapView$zzb.onExitAmbient()>
	//    5   12:return          
	}

	public final void onLowMemory()
	{
		zzbot.onLowMemory();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field MapView$zzb zzbot>
	//    2    4:invokevirtual   #86  <Method void MapView$zzb.onLowMemory()>
	//    3    7:return          
	}

	public final void onPause()
	{
		zzbot.onPause();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field MapView$zzb zzbot>
	//    2    4:invokevirtual   #89  <Method void MapView$zzb.onPause()>
	//    3    7:return          
	}

	public final void onResume()
	{
		zzbot.onResume();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field MapView$zzb zzbot>
	//    2    4:invokevirtual   #92  <Method void MapView$zzb.onResume()>
	//    3    7:return          
	}

	public final void onSaveInstanceState(Bundle bundle)
	{
		zzbot.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field MapView$zzb zzbot>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #95  <Method void MapView$zzb.onSaveInstanceState(Bundle)>
	//    4    8:return          
	}

	public final void onStart()
	{
		zzbot.onStart();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field MapView$zzb zzbot>
	//    2    4:invokevirtual   #98  <Method void MapView$zzb.onStart()>
	//    3    7:return          
	}

	public final void onStop()
	{
		zzbot.onStop();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field MapView$zzb zzbot>
	//    2    4:invokevirtual   #101 <Method void MapView$zzb.onStop()>
	//    3    7:return          
	}

	private final zzb zzbot;
}
