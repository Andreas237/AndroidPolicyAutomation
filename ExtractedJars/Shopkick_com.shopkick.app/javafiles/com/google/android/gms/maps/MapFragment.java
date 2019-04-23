// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.*;
import android.util.AttributeSet;
import android.view.*;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.*;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.internal.zzby;
import com.google.android.gms.maps.internal.zzbz;
import com.google.android.gms.maps.internal.zze;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.*;

// Referenced classes of package com.google.android.gms.maps:
//			GoogleMapOptions, OnMapReadyCallback, zzab, MapsInitializer

public class MapFragment extends Fragment
{
	static final class zza
		implements MapLifecycleDelegate
	{

		public final void getMapAsync(OnMapReadyCallback onmapreadycallback)
		{
			try
			{
				zzba.getMapAsync(((com.google.android.gms.maps.internal.zzap) (new zzab(this, onmapreadycallback))));
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field IMapFragmentDelegate zzba>
		//    2    4:new             #40  <Class zzab>
		//    3    7:dup             
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:invokespecial   #43  <Method void zzab(MapFragment$zza, OnMapReadyCallback)>
		//    7   13:invokeinterface #46  <Method void IMapFragmentDelegate.getMapAsync(com.google.android.gms.maps.internal.zzap)>
				return;
		//    8   18:return          
			}
			// Misplaced declaration of an exception variable
			catch(OnMapReadyCallback onmapreadycallback)
		//*   9   19:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (onmapreadycallback)));
		//   10   20:new             #48  <Class RuntimeRemoteException>
		//   11   23:dup             
		//   12   24:aload_1         
		//   13   25:invokespecial   #51  <Method void RuntimeRemoteException(RemoteException)>
		//   14   28:athrow          
			}
		}

		public final void onCreate(Bundle bundle)
		{
			Bundle bundle1;
			Bundle bundle2;
			try
			{
				bundle1 = new Bundle();
		//    0    0:new             #55  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #56  <Method void Bundle()>
		//    3    7:astore_2        
				zzby.zza(bundle, bundle1);
		//    4    8:aload_1         
		//    5    9:aload_2         
		//    6   10:invokestatic    #61  <Method void zzby.zza(Bundle, Bundle)>
				bundle2 = zzaz.getArguments();
		//    7   13:aload_0         
		//    8   14:getfield        #33  <Field Fragment zzaz>
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
		//*  22   43:invokestatic    #78  <Method void zzby.zza(Bundle, String, android.os.Parcelable)>
		//*  23   46:aload_0         
		//*  24   47:getfield        #29  <Field IMapFragmentDelegate zzba>
		//*  25   50:aload_2         
		//*  26   51:invokeinterface #80  <Method void IMapFragmentDelegate.onCreate(Bundle)>
		//*  27   56:aload_2         
		//*  28   57:aload_1         
		//*  29   58:invokestatic    #61  <Method void zzby.zza(Bundle, Bundle)>
		//*  30   61:return          
			// Misplaced declaration of an exception variable
			catch(Bundle bundle)
		//*  31   62:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (bundle)));
		//   32   63:new             #48  <Class RuntimeRemoteException>
		//   33   66:dup             
		//   34   67:aload_1         
		//   35   68:invokespecial   #51  <Method void RuntimeRemoteException(RemoteException)>
		//   36   71:athrow          
			}
			if(bundle2 == null)
				break MISSING_BLOCK_LABEL_46;
			if(bundle2.containsKey("MapOptions"))
				zzby.zza(bundle1, "MapOptions", bundle2.getParcelable("MapOptions"));
			zzba.onCreate(bundle1);
			zzby.zza(bundle1, bundle);
			return;
		}

		public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
		{
			try
			{
				Bundle bundle1 = new Bundle();
		//    0    0:new             #55  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #56  <Method void Bundle()>
		//    3    7:astore          4
				zzby.zza(bundle, bundle1);
		//    4    9:aload_3         
		//    5   10:aload           4
		//    6   12:invokestatic    #61  <Method void zzby.zza(Bundle, Bundle)>
				layoutinflater = ((LayoutInflater) (zzba.onCreateView(ObjectWrapper.wrap(((Object) (layoutinflater))), ObjectWrapper.wrap(((Object) (viewgroup))), bundle1)));
		//    7   15:aload_0         
		//    8   16:getfield        #29  <Field IMapFragmentDelegate zzba>
		//    9   19:aload_1         
		//   10   20:invokestatic    #88  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
		//   11   23:aload_2         
		//   12   24:invokestatic    #88  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
		//   13   27:aload           4
		//   14   29:invokeinterface #91  <Method com.google.android.gms.dynamic.IObjectWrapper IMapFragmentDelegate.onCreateView(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper, Bundle)>
		//   15   34:astore_1        
				zzby.zza(bundle1, bundle);
		//   16   35:aload           4
		//   17   37:aload_3         
		//   18   38:invokestatic    #61  <Method void zzby.zza(Bundle, Bundle)>
			}
		//*  19   41:aload_1         
		//*  20   42:invokestatic    #95  <Method Object ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper)>
		//*  21   45:checkcast       #97  <Class View>
		//*  22   48:areturn         
			// Misplaced declaration of an exception variable
			catch(LayoutInflater layoutinflater)
		//*  23   49:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (layoutinflater)));
		//   24   50:new             #48  <Class RuntimeRemoteException>
		//   25   53:dup             
		//   26   54:aload_1         
		//   27   55:invokespecial   #51  <Method void RuntimeRemoteException(RemoteException)>
		//   28   58:athrow          
			}
			return (View)ObjectWrapper.unwrap(((com.google.android.gms.dynamic.IObjectWrapper) (layoutinflater)));
		}

		public final void onDestroy()
		{
			try
			{
				zzba.onDestroy();
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field IMapFragmentDelegate zzba>
		//    2    4:invokeinterface #100 <Method void IMapFragmentDelegate.onDestroy()>
				return;
		//    3    9:return          
			}
			catch(RemoteException remoteexception)
		//*   4   10:astore_1        
			{
				throw new RuntimeRemoteException(remoteexception);
		//    5   11:new             #48  <Class RuntimeRemoteException>
		//    6   14:dup             
		//    7   15:aload_1         
		//    8   16:invokespecial   #51  <Method void RuntimeRemoteException(RemoteException)>
		//    9   19:athrow          
			}
		}

		public final void onDestroyView()
		{
			try
			{
				zzba.onDestroyView();
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field IMapFragmentDelegate zzba>
		//    2    4:invokeinterface #103 <Method void IMapFragmentDelegate.onDestroyView()>
				return;
		//    3    9:return          
			}
			catch(RemoteException remoteexception)
		//*   4   10:astore_1        
			{
				throw new RuntimeRemoteException(remoteexception);
		//    5   11:new             #48  <Class RuntimeRemoteException>
		//    6   14:dup             
		//    7   15:aload_1         
		//    8   16:invokespecial   #51  <Method void RuntimeRemoteException(RemoteException)>
		//    9   19:athrow          
			}
		}

		public final void onEnterAmbient(Bundle bundle)
		{
			try
			{
				Bundle bundle1 = new Bundle();
		//    0    0:new             #55  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #56  <Method void Bundle()>
		//    3    7:astore_2        
				zzby.zza(bundle, bundle1);
		//    4    8:aload_1         
		//    5    9:aload_2         
		//    6   10:invokestatic    #61  <Method void zzby.zza(Bundle, Bundle)>
				zzba.onEnterAmbient(bundle1);
		//    7   13:aload_0         
		//    8   14:getfield        #29  <Field IMapFragmentDelegate zzba>
		//    9   17:aload_2         
		//   10   18:invokeinterface #106 <Method void IMapFragmentDelegate.onEnterAmbient(Bundle)>
				zzby.zza(bundle1, bundle);
		//   11   23:aload_2         
		//   12   24:aload_1         
		//   13   25:invokestatic    #61  <Method void zzby.zza(Bundle, Bundle)>
				return;
		//   14   28:return          
			}
			// Misplaced declaration of an exception variable
			catch(Bundle bundle)
		//*  15   29:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (bundle)));
		//   16   30:new             #48  <Class RuntimeRemoteException>
		//   17   33:dup             
		//   18   34:aload_1         
		//   19   35:invokespecial   #51  <Method void RuntimeRemoteException(RemoteException)>
		//   20   38:athrow          
			}
		}

		public final void onExitAmbient()
		{
			try
			{
				zzba.onExitAmbient();
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field IMapFragmentDelegate zzba>
		//    2    4:invokeinterface #109 <Method void IMapFragmentDelegate.onExitAmbient()>
				return;
		//    3    9:return          
			}
			catch(RemoteException remoteexception)
		//*   4   10:astore_1        
			{
				throw new RuntimeRemoteException(remoteexception);
		//    5   11:new             #48  <Class RuntimeRemoteException>
		//    6   14:dup             
		//    7   15:aload_1         
		//    8   16:invokespecial   #51  <Method void RuntimeRemoteException(RemoteException)>
		//    9   19:athrow          
			}
		}

		public final void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
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
		//    5   10:new             #55  <Class Bundle>
		//    6   13:dup             
		//    7   14:invokespecial   #56  <Method void Bundle()>
		//    8   17:astore          4
				zzby.zza(bundle1, bundle2);
		//    9   19:aload_3         
		//   10   20:aload           4
		//   11   22:invokestatic    #61  <Method void zzby.zza(Bundle, Bundle)>
				zzba.onInflate(ObjectWrapper.wrap(((Object) (activity))), ((GoogleMapOptions) (bundle)), bundle2);
		//   12   25:aload_0         
		//   13   26:getfield        #29  <Field IMapFragmentDelegate zzba>
		//   14   29:aload_1         
		//   15   30:invokestatic    #88  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
		//   16   33:aload_2         
		//   17   34:aload           4
		//   18   36:invokeinterface #116 <Method void IMapFragmentDelegate.onInflate(com.google.android.gms.dynamic.IObjectWrapper, GoogleMapOptions, Bundle)>
				zzby.zza(bundle2, bundle1);
		//   19   41:aload           4
		//   20   43:aload_3         
		//   21   44:invokestatic    #61  <Method void zzby.zza(Bundle, Bundle)>
				return;
		//   22   47:return          
			}
			// Misplaced declaration of an exception variable
			catch(Activity activity)
		//*  23   48:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (activity)));
		//   24   49:new             #48  <Class RuntimeRemoteException>
		//   25   52:dup             
		//   26   53:aload_1         
		//   27   54:invokespecial   #51  <Method void RuntimeRemoteException(RemoteException)>
		//   28   57:athrow          
			}
		}

		public final void onLowMemory()
		{
			try
			{
				zzba.onLowMemory();
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field IMapFragmentDelegate zzba>
		//    2    4:invokeinterface #119 <Method void IMapFragmentDelegate.onLowMemory()>
				return;
		//    3    9:return          
			}
			catch(RemoteException remoteexception)
		//*   4   10:astore_1        
			{
				throw new RuntimeRemoteException(remoteexception);
		//    5   11:new             #48  <Class RuntimeRemoteException>
		//    6   14:dup             
		//    7   15:aload_1         
		//    8   16:invokespecial   #51  <Method void RuntimeRemoteException(RemoteException)>
		//    9   19:athrow          
			}
		}

		public final void onPause()
		{
			try
			{
				zzba.onPause();
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field IMapFragmentDelegate zzba>
		//    2    4:invokeinterface #122 <Method void IMapFragmentDelegate.onPause()>
				return;
		//    3    9:return          
			}
			catch(RemoteException remoteexception)
		//*   4   10:astore_1        
			{
				throw new RuntimeRemoteException(remoteexception);
		//    5   11:new             #48  <Class RuntimeRemoteException>
		//    6   14:dup             
		//    7   15:aload_1         
		//    8   16:invokespecial   #51  <Method void RuntimeRemoteException(RemoteException)>
		//    9   19:athrow          
			}
		}

		public final void onResume()
		{
			try
			{
				zzba.onResume();
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field IMapFragmentDelegate zzba>
		//    2    4:invokeinterface #125 <Method void IMapFragmentDelegate.onResume()>
				return;
		//    3    9:return          
			}
			catch(RemoteException remoteexception)
		//*   4   10:astore_1        
			{
				throw new RuntimeRemoteException(remoteexception);
		//    5   11:new             #48  <Class RuntimeRemoteException>
		//    6   14:dup             
		//    7   15:aload_1         
		//    8   16:invokespecial   #51  <Method void RuntimeRemoteException(RemoteException)>
		//    9   19:athrow          
			}
		}

		public final void onSaveInstanceState(Bundle bundle)
		{
			try
			{
				Bundle bundle1 = new Bundle();
		//    0    0:new             #55  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #56  <Method void Bundle()>
		//    3    7:astore_2        
				zzby.zza(bundle, bundle1);
		//    4    8:aload_1         
		//    5    9:aload_2         
		//    6   10:invokestatic    #61  <Method void zzby.zza(Bundle, Bundle)>
				zzba.onSaveInstanceState(bundle1);
		//    7   13:aload_0         
		//    8   14:getfield        #29  <Field IMapFragmentDelegate zzba>
		//    9   17:aload_2         
		//   10   18:invokeinterface #128 <Method void IMapFragmentDelegate.onSaveInstanceState(Bundle)>
				zzby.zza(bundle1, bundle);
		//   11   23:aload_2         
		//   12   24:aload_1         
		//   13   25:invokestatic    #61  <Method void zzby.zza(Bundle, Bundle)>
				return;
		//   14   28:return          
			}
			// Misplaced declaration of an exception variable
			catch(Bundle bundle)
		//*  15   29:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (bundle)));
		//   16   30:new             #48  <Class RuntimeRemoteException>
		//   17   33:dup             
		//   18   34:aload_1         
		//   19   35:invokespecial   #51  <Method void RuntimeRemoteException(RemoteException)>
		//   20   38:athrow          
			}
		}

		public final void onStart()
		{
			try
			{
				zzba.onStart();
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field IMapFragmentDelegate zzba>
		//    2    4:invokeinterface #131 <Method void IMapFragmentDelegate.onStart()>
				return;
		//    3    9:return          
			}
			catch(RemoteException remoteexception)
		//*   4   10:astore_1        
			{
				throw new RuntimeRemoteException(remoteexception);
		//    5   11:new             #48  <Class RuntimeRemoteException>
		//    6   14:dup             
		//    7   15:aload_1         
		//    8   16:invokespecial   #51  <Method void RuntimeRemoteException(RemoteException)>
		//    9   19:athrow          
			}
		}

		public final void onStop()
		{
			try
			{
				zzba.onStop();
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field IMapFragmentDelegate zzba>
		//    2    4:invokeinterface #134 <Method void IMapFragmentDelegate.onStop()>
				return;
		//    3    9:return          
			}
			catch(RemoteException remoteexception)
		//*   4   10:astore_1        
			{
				throw new RuntimeRemoteException(remoteexception);
		//    5   11:new             #48  <Class RuntimeRemoteException>
		//    6   14:dup             
		//    7   15:aload_1         
		//    8   16:invokespecial   #51  <Method void RuntimeRemoteException(RemoteException)>
		//    9   19:athrow          
			}
		}

		private final Fragment zzaz;
		private final IMapFragmentDelegate zzba;

		public zza(Fragment fragment, IMapFragmentDelegate imapfragmentdelegate)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			zzba = (IMapFragmentDelegate)Preconditions.checkNotNull(((Object) (imapfragmentdelegate)));
		//    2    4:aload_0         
		//    3    5:aload_2         
		//    4    6:invokestatic    #25  <Method Object Preconditions.checkNotNull(Object)>
		//    5    9:checkcast       #27  <Class IMapFragmentDelegate>
		//    6   12:putfield        #29  <Field IMapFragmentDelegate zzba>
			zzaz = (Fragment)Preconditions.checkNotNull(((Object) (fragment)));
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:invokestatic    #25  <Method Object Preconditions.checkNotNull(Object)>
		//   10   20:checkcast       #31  <Class Fragment>
		//   11   23:putfield        #33  <Field Fragment zzaz>
		//   12   26:return          
		}
	}

	static final class zzb extends DeferredLifecycleHelper
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

		static void zza(zzb zzb1, Activity activity)
		{
			zzb1.setActivity(activity);
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
		//   19   43:invokeinterface #76  <Method IMapFragmentDelegate zze.zzc(com.google.android.gms.dynamic.IObjectWrapper)>
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
		//*  31   67:invokespecial   #81  <Method void MapFragment$zza(Fragment, IMapFragmentDelegate)>
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
			zzbc.onDelegateCreated(((com.google.android.gms.dynamic.LifecycleDelegate) (new zza(zzaz, ((IMapFragmentDelegate) (obj))))));
			for(obj = ((Object) (zzbe.iterator())); ((Iterator) (obj)).hasNext(); ((zza)getDelegate()).getMapAsync(onmapreadycallback))
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
				((zza)getDelegate()).getMapAsync(onmapreadycallback);
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

		zzb(Fragment fragment)
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


	public MapFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Fragment()>
	//    2    4:aload_0         
	//    3    5:new             #9   <Class MapFragment$zzb>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #22  <Method void MapFragment$zzb(Fragment)>
	//    7   13:putfield        #24  <Field MapFragment$zzb zzay>
	//    8   16:return          
	}

	public static MapFragment newInstance()
	{
		return new MapFragment();
	//    0    0:new             #2   <Class MapFragment>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void MapFragment()>
	//    3    7:areturn         
	}

	public static MapFragment newInstance(GoogleMapOptions googlemapoptions)
	{
		MapFragment mapfragment = new MapFragment();
	//    0    0:new             #2   <Class MapFragment>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void MapFragment()>
	//    3    7:astore_1        
		Bundle bundle = new Bundle();
	//    4    8:new             #31  <Class Bundle>
	//    5   11:dup             
	//    6   12:invokespecial   #32  <Method void Bundle()>
	//    7   15:astore_2        
		bundle.putParcelable("MapOptions", ((android.os.Parcelable) (googlemapoptions)));
	//    8   16:aload_2         
	//    9   17:ldc1            #34  <String "MapOptions">
	//   10   19:aload_0         
	//   11   20:invokevirtual   #38  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		mapfragment.setArguments(bundle);
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:invokevirtual   #42  <Method void setArguments(Bundle)>
		return mapfragment;
	//   15   28:aload_1         
	//   16   29:areturn         
	}

	public void getMapAsync(OnMapReadyCallback onmapreadycallback)
	{
		Preconditions.checkMainThread("getMapAsync must be called on the main thread.");
	//    0    0:ldc1            #46  <String "getMapAsync must be called on the main thread.">
	//    1    2:invokestatic    #52  <Method void Preconditions.checkMainThread(String)>
		zzay.getMapAsync(onmapreadycallback);
	//    2    5:aload_0         
	//    3    6:getfield        #24  <Field MapFragment$zzb zzay>
	//    4    9:aload_1         
	//    5   10:invokevirtual   #54  <Method void MapFragment$zzb.getMapAsync(OnMapReadyCallback)>
	//    6   13:return          
	}

	public void onActivityCreated(Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          13
			bundle.setClassLoader(((Class) (com/google/android/gms/maps/MapFragment)).getClassLoader());
	//    2    4:aload_1         
	//    3    5:ldc1            #2   <Class MapFragment>
	//    4    7:invokevirtual   #61  <Method ClassLoader Class.getClassLoader()>
	//    5   10:invokevirtual   #65  <Method void Bundle.setClassLoader(ClassLoader)>
		super.onActivityCreated(bundle);
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:invokespecial   #67  <Method void Fragment.onActivityCreated(Bundle)>
	//    9   18:return          
	}

	public void onAttach(Activity activity)
	{
		super.onAttach(activity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #71  <Method void Fragment.onAttach(Activity)>
		zzb.zza(zzay, activity);
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field MapFragment$zzb zzay>
	//    5    9:aload_1         
	//    6   10:invokestatic    #74  <Method void MapFragment$zzb.zza(MapFragment$zzb, Activity)>
	//    7   13:return          
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #77  <Method void Fragment.onCreate(Bundle)>
		zzay.onCreate(bundle);
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field MapFragment$zzb zzay>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #78  <Method void MapFragment$zzb.onCreate(Bundle)>
	//    7   13:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		layoutinflater = ((LayoutInflater) (zzay.onCreateView(layoutinflater, viewgroup, bundle)));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field MapFragment$zzb zzay>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #82  <Method View MapFragment$zzb.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6   10:astore_1        
		((View) (layoutinflater)).setClickable(true);
	//    7   11:aload_1         
	//    8   12:iconst_1        
	//    9   13:invokevirtual   #88  <Method void View.setClickable(boolean)>
		return ((View) (layoutinflater));
	//   10   16:aload_1         
	//   11   17:areturn         
	}

	public void onDestroy()
	{
		zzay.onDestroy();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field MapFragment$zzb zzay>
	//    2    4:invokevirtual   #91  <Method void MapFragment$zzb.onDestroy()>
		super.onDestroy();
	//    3    7:aload_0         
	//    4    8:invokespecial   #92  <Method void Fragment.onDestroy()>
	//    5   11:return          
	}

	public void onDestroyView()
	{
		zzay.onDestroyView();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field MapFragment$zzb zzay>
	//    2    4:invokevirtual   #95  <Method void MapFragment$zzb.onDestroyView()>
		super.onDestroyView();
	//    3    7:aload_0         
	//    4    8:invokespecial   #96  <Method void Fragment.onDestroyView()>
	//    5   11:return          
	}

	public final void onEnterAmbient(Bundle bundle)
	{
		Preconditions.checkMainThread("onEnterAmbient must be called on the main thread.");
	//    0    0:ldc1            #99  <String "onEnterAmbient must be called on the main thread.">
	//    1    2:invokestatic    #52  <Method void Preconditions.checkMainThread(String)>
		zzb zzb1 = zzay;
	//    2    5:aload_0         
	//    3    6:getfield        #24  <Field MapFragment$zzb zzay>
	//    4    9:astore_2        
		if(zzb1.getDelegate() != null)
	//*   5   10:aload_2         
	//*   6   11:invokevirtual   #103 <Method com.google.android.gms.dynamic.LifecycleDelegate MapFragment$zzb.getDelegate()>
	//*   7   14:ifnull          28
			((zza)zzb1.getDelegate()).onEnterAmbient(bundle);
	//    8   17:aload_2         
	//    9   18:invokevirtual   #103 <Method com.google.android.gms.dynamic.LifecycleDelegate MapFragment$zzb.getDelegate()>
	//   10   21:checkcast       #6   <Class MapFragment$zza>
	//   11   24:aload_1         
	//   12   25:invokevirtual   #105 <Method void MapFragment$zza.onEnterAmbient(Bundle)>
	//   13   28:return          
	}

	public final void onExitAmbient()
	{
		Preconditions.checkMainThread("onExitAmbient must be called on the main thread.");
	//    0    0:ldc1            #108 <String "onExitAmbient must be called on the main thread.">
	//    1    2:invokestatic    #52  <Method void Preconditions.checkMainThread(String)>
		zzb zzb1 = zzay;
	//    2    5:aload_0         
	//    3    6:getfield        #24  <Field MapFragment$zzb zzay>
	//    4    9:astore_1        
		if(zzb1.getDelegate() != null)
	//*   5   10:aload_1         
	//*   6   11:invokevirtual   #103 <Method com.google.android.gms.dynamic.LifecycleDelegate MapFragment$zzb.getDelegate()>
	//*   7   14:ifnull          27
			((zza)zzb1.getDelegate()).onExitAmbient();
	//    8   17:aload_1         
	//    9   18:invokevirtual   #103 <Method com.google.android.gms.dynamic.LifecycleDelegate MapFragment$zzb.getDelegate()>
	//   10   21:checkcast       #6   <Class MapFragment$zza>
	//   11   24:invokevirtual   #110 <Method void MapFragment$zza.onExitAmbient()>
	//   12   27:return          
	}

	public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
	{
		android.os.StrictMode.ThreadPolicy threadpolicy;
		threadpolicy = StrictMode.getThreadPolicy();
	//    0    0:invokestatic    #120 <Method android.os.StrictMode$ThreadPolicy StrictMode.getThreadPolicy()>
	//    1    3:astore          4
		StrictMode.setThreadPolicy((new android.os.StrictMode.ThreadPolicy.Builder(threadpolicy)).permitAll().build());
	//    2    5:new             #122 <Class android.os.StrictMode$ThreadPolicy$Builder>
	//    3    8:dup             
	//    4    9:aload           4
	//    5   11:invokespecial   #125 <Method void android.os.StrictMode$ThreadPolicy$Builder(android.os.StrictMode$ThreadPolicy)>
	//    6   14:invokevirtual   #129 <Method android.os.StrictMode$ThreadPolicy$Builder android.os.StrictMode$ThreadPolicy$Builder.permitAll()>
	//    7   17:invokevirtual   #132 <Method android.os.StrictMode$ThreadPolicy android.os.StrictMode$ThreadPolicy$Builder.build()>
	//    8   20:invokestatic    #135 <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		super.onInflate(activity, attributeset, bundle);
	//    9   23:aload_0         
	//   10   24:aload_1         
	//   11   25:aload_2         
	//   12   26:aload_3         
	//   13   27:invokespecial   #137 <Method void Fragment.onInflate(Activity, AttributeSet, Bundle)>
		zzb.zza(zzay, activity);
	//   14   30:aload_0         
	//   15   31:getfield        #24  <Field MapFragment$zzb zzay>
	//   16   34:aload_1         
	//   17   35:invokestatic    #74  <Method void MapFragment$zzb.zza(MapFragment$zzb, Activity)>
		attributeset = ((AttributeSet) (GoogleMapOptions.createFromAttributes(((android.content.Context) (activity)), attributeset)));
	//   18   38:aload_1         
	//   19   39:aload_2         
	//   20   40:invokestatic    #143 <Method GoogleMapOptions GoogleMapOptions.createFromAttributes(android.content.Context, AttributeSet)>
	//   21   43:astore_2        
		Bundle bundle1 = new Bundle();
	//   22   44:new             #31  <Class Bundle>
	//   23   47:dup             
	//   24   48:invokespecial   #32  <Method void Bundle()>
	//   25   51:astore          5
		bundle1.putParcelable("MapOptions", ((android.os.Parcelable) (attributeset)));
	//   26   53:aload           5
	//   27   55:ldc1            #34  <String "MapOptions">
	//   28   57:aload_2         
	//   29   58:invokevirtual   #38  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		zzay.onInflate(activity, bundle1, bundle);
	//   30   61:aload_0         
	//   31   62:getfield        #24  <Field MapFragment$zzb zzay>
	//   32   65:aload_1         
	//   33   66:aload           5
	//   34   68:aload_3         
	//   35   69:invokevirtual   #146 <Method void MapFragment$zzb.onInflate(Activity, Bundle, Bundle)>
		StrictMode.setThreadPolicy(threadpolicy);
	//   36   72:aload           4
	//   37   74:invokestatic    #135 <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		return;
	//   38   77:return          
		activity;
	//   39   78:astore_1        
		StrictMode.setThreadPolicy(threadpolicy);
	//   40   79:aload           4
	//   41   81:invokestatic    #135 <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		throw activity;
	//   42   84:aload_1         
	//   43   85:athrow          
	}

	public void onLowMemory()
	{
		zzay.onLowMemory();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field MapFragment$zzb zzay>
	//    2    4:invokevirtual   #150 <Method void MapFragment$zzb.onLowMemory()>
		super.onLowMemory();
	//    3    7:aload_0         
	//    4    8:invokespecial   #151 <Method void Fragment.onLowMemory()>
	//    5   11:return          
	}

	public void onPause()
	{
		zzay.onPause();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field MapFragment$zzb zzay>
	//    2    4:invokevirtual   #154 <Method void MapFragment$zzb.onPause()>
		super.onPause();
	//    3    7:aload_0         
	//    4    8:invokespecial   #155 <Method void Fragment.onPause()>
	//    5   11:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #158 <Method void Fragment.onResume()>
		zzay.onResume();
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field MapFragment$zzb zzay>
	//    4    8:invokevirtual   #159 <Method void MapFragment$zzb.onResume()>
	//    5   11:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          13
			bundle.setClassLoader(((Class) (com/google/android/gms/maps/MapFragment)).getClassLoader());
	//    2    4:aload_1         
	//    3    5:ldc1            #2   <Class MapFragment>
	//    4    7:invokevirtual   #61  <Method ClassLoader Class.getClassLoader()>
	//    5   10:invokevirtual   #65  <Method void Bundle.setClassLoader(ClassLoader)>
		super.onSaveInstanceState(bundle);
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:invokespecial   #162 <Method void Fragment.onSaveInstanceState(Bundle)>
		zzay.onSaveInstanceState(bundle);
	//    9   18:aload_0         
	//   10   19:getfield        #24  <Field MapFragment$zzb zzay>
	//   11   22:aload_1         
	//   12   23:invokevirtual   #163 <Method void MapFragment$zzb.onSaveInstanceState(Bundle)>
	//   13   26:return          
	}

	public void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #166 <Method void Fragment.onStart()>
		zzay.onStart();
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field MapFragment$zzb zzay>
	//    4    8:invokevirtual   #167 <Method void MapFragment$zzb.onStart()>
	//    5   11:return          
	}

	public void onStop()
	{
		zzay.onStop();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field MapFragment$zzb zzay>
	//    2    4:invokevirtual   #170 <Method void MapFragment$zzb.onStop()>
		super.onStop();
	//    3    7:aload_0         
	//    4    8:invokespecial   #171 <Method void Fragment.onStop()>
	//    5   11:return          
	}

	public void setArguments(Bundle bundle)
	{
		super.setArguments(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #172 <Method void Fragment.setArguments(Bundle)>
	//    3    5:return          
	}

	private final zzb zzay = new zzb(((Fragment) (this)));
}
