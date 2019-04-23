// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.*;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.internal.zzby;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//			MapFragment, zzab, GoogleMapOptions, OnMapReadyCallback

static final class MapFragment$zza
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

	public MapFragment$zza(Fragment fragment, IMapFragmentDelegate imapfragmentdelegate)
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
