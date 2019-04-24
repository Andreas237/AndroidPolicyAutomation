// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.internal.zzah;
import com.google.android.gms.maps.internal.zzai;
import com.google.android.gms.maps.internal.zzc;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps:
//			GoogleMapOptions, OnMapReadyCallback, GoogleMap, MapsInitializer

public class SupportMapFragment extends Fragment
{
	static class zza
		implements MapLifecycleDelegate
	{

		public void getMapAsync(OnMapReadyCallback onmapreadycallback)
		{
			try
			{
				zzbop.getMapAsync(((com.google.android.gms.maps.internal.zzt) (new com.google.android.gms.maps.internal.zzt.zza(this, onmapreadycallback) {

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

		public zza(Fragment fragment, IMapFragmentDelegate imapfragmentdelegate)
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

	static class zzb extends com.google.android.gms.dynamic.zza
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

		static void zza(zzb zzb1, Activity activity)
		{
			zzb1.setActivity(activity);
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
				((zza)zzBN()).getMapAsync(onmapreadycallback);
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
				((zza)zzBN()).onEnterAmbient(bundle);
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
				((zza)zzBN()).onExitAmbient();
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
		//   19   43:invokeinterface #95  <Method IMapFragmentDelegate zzc.zzI(com.google.android.gms.dynamic.IObjectWrapper)>
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
		//*  31   67:invokespecial   #98  <Method void SupportMapFragment$zza(Fragment, IMapFragmentDelegate)>
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
			zzbor.zza(((com.google.android.gms.dynamic.LifecycleDelegate) (new zza(zzaRN, ((IMapFragmentDelegate) (obj))))));
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

		zzb(Fragment fragment)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void com.google.android.gms.dynamic.zza()>
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


	public SupportMapFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Fragment()>
	//    2    4:aload_0         
	//    3    5:new             #11  <Class SupportMapFragment$zzb>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #21  <Method void SupportMapFragment$zzb(Fragment)>
	//    7   13:putfield        #23  <Field SupportMapFragment$zzb zzboU>
	//    8   16:return          
	}

	public static SupportMapFragment newInstance()
	{
		return new SupportMapFragment();
	//    0    0:new             #2   <Class SupportMapFragment>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void SupportMapFragment()>
	//    3    7:areturn         
	}

	public static SupportMapFragment newInstance(GoogleMapOptions googlemapoptions)
	{
		SupportMapFragment supportmapfragment = new SupportMapFragment();
	//    0    0:new             #2   <Class SupportMapFragment>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void SupportMapFragment()>
	//    3    7:astore_1        
		Bundle bundle = new Bundle();
	//    4    8:new             #30  <Class Bundle>
	//    5   11:dup             
	//    6   12:invokespecial   #31  <Method void Bundle()>
	//    7   15:astore_2        
		bundle.putParcelable("MapOptions", ((android.os.Parcelable) (googlemapoptions)));
	//    8   16:aload_2         
	//    9   17:ldc1            #33  <String "MapOptions">
	//   10   19:aload_0         
	//   11   20:invokevirtual   #37  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		supportmapfragment.setArguments(bundle);
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:invokevirtual   #41  <Method void setArguments(Bundle)>
		return supportmapfragment;
	//   15   28:aload_1         
	//   16   29:areturn         
	}

	public void getMapAsync(OnMapReadyCallback onmapreadycallback)
	{
		zzac.zzdj("getMapAsync must be called on the main thread.");
	//    0    0:ldc1            #45  <String "getMapAsync must be called on the main thread.">
	//    1    2:invokestatic    #51  <Method void zzac.zzdj(String)>
		zzboU.getMapAsync(onmapreadycallback);
	//    2    5:aload_0         
	//    3    6:getfield        #23  <Field SupportMapFragment$zzb zzboU>
	//    4    9:aload_1         
	//    5   10:invokevirtual   #53  <Method void SupportMapFragment$zzb.getMapAsync(OnMapReadyCallback)>
	//    6   13:return          
	}

	public void onActivityCreated(Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          13
			bundle.setClassLoader(((Class) (com/google/android/gms/maps/SupportMapFragment)).getClassLoader());
	//    2    4:aload_1         
	//    3    5:ldc1            #2   <Class SupportMapFragment>
	//    4    7:invokevirtual   #60  <Method ClassLoader Class.getClassLoader()>
	//    5   10:invokevirtual   #64  <Method void Bundle.setClassLoader(ClassLoader)>
		super.onActivityCreated(bundle);
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:invokespecial   #66  <Method void Fragment.onActivityCreated(Bundle)>
	//    9   18:return          
	}

	public void onAttach(Activity activity)
	{
		super.onAttach(activity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #70  <Method void Fragment.onAttach(Activity)>
		zzb.zza(zzboU, activity);
	//    3    5:aload_0         
	//    4    6:getfield        #23  <Field SupportMapFragment$zzb zzboU>
	//    5    9:aload_1         
	//    6   10:invokestatic    #73  <Method void SupportMapFragment$zzb.zza(SupportMapFragment$zzb, Activity)>
	//    7   13:return          
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #76  <Method void Fragment.onCreate(Bundle)>
		zzboU.onCreate(bundle);
	//    3    5:aload_0         
	//    4    6:getfield        #23  <Field SupportMapFragment$zzb zzboU>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #77  <Method void SupportMapFragment$zzb.onCreate(Bundle)>
	//    7   13:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		layoutinflater = ((LayoutInflater) (zzboU.onCreateView(layoutinflater, viewgroup, bundle)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field SupportMapFragment$zzb zzboU>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #81  <Method View SupportMapFragment$zzb.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6   10:astore_1        
		((View) (layoutinflater)).setClickable(true);
	//    7   11:aload_1         
	//    8   12:iconst_1        
	//    9   13:invokevirtual   #87  <Method void View.setClickable(boolean)>
		return ((View) (layoutinflater));
	//   10   16:aload_1         
	//   11   17:areturn         
	}

	public void onDestroy()
	{
		zzboU.onDestroy();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field SupportMapFragment$zzb zzboU>
	//    2    4:invokevirtual   #90  <Method void SupportMapFragment$zzb.onDestroy()>
		super.onDestroy();
	//    3    7:aload_0         
	//    4    8:invokespecial   #91  <Method void Fragment.onDestroy()>
	//    5   11:return          
	}

	public void onDestroyView()
	{
		zzboU.onDestroyView();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field SupportMapFragment$zzb zzboU>
	//    2    4:invokevirtual   #94  <Method void SupportMapFragment$zzb.onDestroyView()>
		super.onDestroyView();
	//    3    7:aload_0         
	//    4    8:invokespecial   #95  <Method void Fragment.onDestroyView()>
	//    5   11:return          
	}

	public final void onEnterAmbient(Bundle bundle)
	{
		zzac.zzdj("onEnterAmbient must be called on the main thread.");
	//    0    0:ldc1            #98  <String "onEnterAmbient must be called on the main thread.">
	//    1    2:invokestatic    #51  <Method void zzac.zzdj(String)>
		zzboU.onEnterAmbient(bundle);
	//    2    5:aload_0         
	//    3    6:getfield        #23  <Field SupportMapFragment$zzb zzboU>
	//    4    9:aload_1         
	//    5   10:invokevirtual   #100 <Method void SupportMapFragment$zzb.onEnterAmbient(Bundle)>
	//    6   13:return          
	}

	public final void onExitAmbient()
	{
		zzac.zzdj("onExitAmbient must be called on the main thread.");
	//    0    0:ldc1            #103 <String "onExitAmbient must be called on the main thread.">
	//    1    2:invokestatic    #51  <Method void zzac.zzdj(String)>
		zzboU.onExitAmbient();
	//    2    5:aload_0         
	//    3    6:getfield        #23  <Field SupportMapFragment$zzb zzboU>
	//    4    9:invokevirtual   #105 <Method void SupportMapFragment$zzb.onExitAmbient()>
	//    5   12:return          
	}

	public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
	{
		super.onInflate(activity, attributeset, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #109 <Method void Fragment.onInflate(Activity, AttributeSet, Bundle)>
		zzb.zza(zzboU, activity);
	//    5    7:aload_0         
	//    6    8:getfield        #23  <Field SupportMapFragment$zzb zzboU>
	//    7   11:aload_1         
	//    8   12:invokestatic    #73  <Method void SupportMapFragment$zzb.zza(SupportMapFragment$zzb, Activity)>
		attributeset = ((AttributeSet) (GoogleMapOptions.createFromAttributes(((android.content.Context) (activity)), attributeset)));
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokestatic    #115 <Method GoogleMapOptions GoogleMapOptions.createFromAttributes(android.content.Context, AttributeSet)>
	//   12   20:astore_2        
		Bundle bundle1 = new Bundle();
	//   13   21:new             #30  <Class Bundle>
	//   14   24:dup             
	//   15   25:invokespecial   #31  <Method void Bundle()>
	//   16   28:astore          4
		bundle1.putParcelable("MapOptions", ((android.os.Parcelable) (attributeset)));
	//   17   30:aload           4
	//   18   32:ldc1            #33  <String "MapOptions">
	//   19   34:aload_2         
	//   20   35:invokevirtual   #37  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		zzboU.onInflate(activity, bundle1, bundle);
	//   21   38:aload_0         
	//   22   39:getfield        #23  <Field SupportMapFragment$zzb zzboU>
	//   23   42:aload_1         
	//   24   43:aload           4
	//   25   45:aload_3         
	//   26   46:invokevirtual   #118 <Method void SupportMapFragment$zzb.onInflate(Activity, Bundle, Bundle)>
	//   27   49:return          
	}

	public void onLowMemory()
	{
		zzboU.onLowMemory();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field SupportMapFragment$zzb zzboU>
	//    2    4:invokevirtual   #121 <Method void SupportMapFragment$zzb.onLowMemory()>
		super.onLowMemory();
	//    3    7:aload_0         
	//    4    8:invokespecial   #122 <Method void Fragment.onLowMemory()>
	//    5   11:return          
	}

	public void onPause()
	{
		zzboU.onPause();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field SupportMapFragment$zzb zzboU>
	//    2    4:invokevirtual   #125 <Method void SupportMapFragment$zzb.onPause()>
		super.onPause();
	//    3    7:aload_0         
	//    4    8:invokespecial   #126 <Method void Fragment.onPause()>
	//    5   11:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #129 <Method void Fragment.onResume()>
		zzboU.onResume();
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field SupportMapFragment$zzb zzboU>
	//    4    8:invokevirtual   #130 <Method void SupportMapFragment$zzb.onResume()>
	//    5   11:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          13
			bundle.setClassLoader(((Class) (com/google/android/gms/maps/SupportMapFragment)).getClassLoader());
	//    2    4:aload_1         
	//    3    5:ldc1            #2   <Class SupportMapFragment>
	//    4    7:invokevirtual   #60  <Method ClassLoader Class.getClassLoader()>
	//    5   10:invokevirtual   #64  <Method void Bundle.setClassLoader(ClassLoader)>
		super.onSaveInstanceState(bundle);
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:invokespecial   #133 <Method void Fragment.onSaveInstanceState(Bundle)>
		zzboU.onSaveInstanceState(bundle);
	//    9   18:aload_0         
	//   10   19:getfield        #23  <Field SupportMapFragment$zzb zzboU>
	//   11   22:aload_1         
	//   12   23:invokevirtual   #134 <Method void SupportMapFragment$zzb.onSaveInstanceState(Bundle)>
	//   13   26:return          
	}

	public void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #137 <Method void Fragment.onStart()>
		zzboU.onStart();
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field SupportMapFragment$zzb zzboU>
	//    4    8:invokevirtual   #138 <Method void SupportMapFragment$zzb.onStart()>
	//    5   11:return          
	}

	public void onStop()
	{
		zzboU.onStop();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field SupportMapFragment$zzb zzboU>
	//    2    4:invokevirtual   #141 <Method void SupportMapFragment$zzb.onStop()>
		super.onStop();
	//    3    7:aload_0         
	//    4    8:invokespecial   #142 <Method void Fragment.onStop()>
	//    5   11:return          
	}

	public void setArguments(Bundle bundle)
	{
		super.setArguments(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #143 <Method void Fragment.setArguments(Bundle)>
	//    3    5:return          
	}

	private final zzb zzboU = new zzb(((Fragment) (this)));
}
