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
import com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.internal.zzby;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//			StreetViewPanoramaFragment, zzah, OnStreetViewPanoramaReadyCallback

static final class StreetViewPanoramaFragment$zza
	implements StreetViewLifecycleDelegate
{

	public final void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
	{
		try
		{
			zzbt.getStreetViewPanoramaAsync(((com.google.android.gms.maps.internal.zzbp) (new zzah(this, onstreetviewpanoramareadycallback))));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field IStreetViewPanoramaFragmentDelegate zzbt>
	//    2    4:new             #40  <Class zzah>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #43  <Method void zzah(StreetViewPanoramaFragment$zza, OnStreetViewPanoramaReadyCallback)>
	//    7   13:invokeinterface #46  <Method void IStreetViewPanoramaFragmentDelegate.getStreetViewPanoramaAsync(com.google.android.gms.maps.internal.zzbp)>
			return;
	//    8   18:return          
		}
		// Misplaced declaration of an exception variable
		catch(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
	//*   9   19:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (onstreetviewpanoramareadycallback)));
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
	//*  14   26:ldc1            #67  <String "StreetViewPanoramaOptions">
	//*  15   28:invokevirtual   #71  <Method boolean Bundle.containsKey(String)>
	//*  16   31:ifeq            46
	//*  17   34:aload_2         
	//*  18   35:ldc1            #67  <String "StreetViewPanoramaOptions">
	//*  19   37:aload_3         
	//*  20   38:ldc1            #67  <String "StreetViewPanoramaOptions">
	//*  21   40:invokevirtual   #75  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//*  22   43:invokestatic    #78  <Method void zzby.zza(Bundle, String, android.os.Parcelable)>
	//*  23   46:aload_0         
	//*  24   47:getfield        #29  <Field IStreetViewPanoramaFragmentDelegate zzbt>
	//*  25   50:aload_2         
	//*  26   51:invokeinterface #80  <Method void IStreetViewPanoramaFragmentDelegate.onCreate(Bundle)>
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
		if(bundle2.containsKey("StreetViewPanoramaOptions"))
			zzby.zza(bundle1, "StreetViewPanoramaOptions", bundle2.getParcelable("StreetViewPanoramaOptions"));
		zzbt.onCreate(bundle1);
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
			layoutinflater = ((LayoutInflater) (zzbt.onCreateView(ObjectWrapper.wrap(((Object) (layoutinflater))), ObjectWrapper.wrap(((Object) (viewgroup))), bundle1)));
	//    7   15:aload_0         
	//    8   16:getfield        #29  <Field IStreetViewPanoramaFragmentDelegate zzbt>
	//    9   19:aload_1         
	//   10   20:invokestatic    #88  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   11   23:aload_2         
	//   12   24:invokestatic    #88  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   13   27:aload           4
	//   14   29:invokeinterface #91  <Method com.google.android.gms.dynamic.IObjectWrapper IStreetViewPanoramaFragmentDelegate.onCreateView(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper, Bundle)>
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
			zzbt.onDestroy();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field IStreetViewPanoramaFragmentDelegate zzbt>
	//    2    4:invokeinterface #100 <Method void IStreetViewPanoramaFragmentDelegate.onDestroy()>
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
			zzbt.onDestroyView();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field IStreetViewPanoramaFragmentDelegate zzbt>
	//    2    4:invokeinterface #103 <Method void IStreetViewPanoramaFragmentDelegate.onDestroyView()>
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
		try
		{
			bundle = new Bundle();
	//    0    0:new             #55  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #56  <Method void Bundle()>
	//    3    7:astore_2        
			zzby.zza(bundle1, bundle);
	//    4    8:aload_3         
	//    5    9:aload_2         
	//    6   10:invokestatic    #61  <Method void zzby.zza(Bundle, Bundle)>
			zzbt.onInflate(ObjectWrapper.wrap(((Object) (activity))), ((StreetViewPanoramaOptions) (null)), bundle);
	//    7   13:aload_0         
	//    8   14:getfield        #29  <Field IStreetViewPanoramaFragmentDelegate zzbt>
	//    9   17:aload_1         
	//   10   18:invokestatic    #88  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   11   21:aconst_null     
	//   12   22:aload_2         
	//   13   23:invokeinterface #108 <Method void IStreetViewPanoramaFragmentDelegate.onInflate(com.google.android.gms.dynamic.IObjectWrapper, StreetViewPanoramaOptions, Bundle)>
			zzby.zza(bundle, bundle1);
	//   14   28:aload_2         
	//   15   29:aload_3         
	//   16   30:invokestatic    #61  <Method void zzby.zza(Bundle, Bundle)>
			return;
	//   17   33:return          
		}
		// Misplaced declaration of an exception variable
		catch(Activity activity)
	//*  18   34:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (activity)));
	//   19   35:new             #48  <Class RuntimeRemoteException>
	//   20   38:dup             
	//   21   39:aload_1         
	//   22   40:invokespecial   #51  <Method void RuntimeRemoteException(RemoteException)>
	//   23   43:athrow          
		}
	}

	public final void onLowMemory()
	{
		try
		{
			zzbt.onLowMemory();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field IStreetViewPanoramaFragmentDelegate zzbt>
	//    2    4:invokeinterface #111 <Method void IStreetViewPanoramaFragmentDelegate.onLowMemory()>
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
			zzbt.onPause();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field IStreetViewPanoramaFragmentDelegate zzbt>
	//    2    4:invokeinterface #114 <Method void IStreetViewPanoramaFragmentDelegate.onPause()>
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
			zzbt.onResume();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field IStreetViewPanoramaFragmentDelegate zzbt>
	//    2    4:invokeinterface #117 <Method void IStreetViewPanoramaFragmentDelegate.onResume()>
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
			zzbt.onSaveInstanceState(bundle1);
	//    7   13:aload_0         
	//    8   14:getfield        #29  <Field IStreetViewPanoramaFragmentDelegate zzbt>
	//    9   17:aload_2         
	//   10   18:invokeinterface #120 <Method void IStreetViewPanoramaFragmentDelegate.onSaveInstanceState(Bundle)>
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
			zzbt.onStart();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field IStreetViewPanoramaFragmentDelegate zzbt>
	//    2    4:invokeinterface #123 <Method void IStreetViewPanoramaFragmentDelegate.onStart()>
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
			zzbt.onStop();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field IStreetViewPanoramaFragmentDelegate zzbt>
	//    2    4:invokeinterface #126 <Method void IStreetViewPanoramaFragmentDelegate.onStop()>
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
	private final IStreetViewPanoramaFragmentDelegate zzbt;

	public StreetViewPanoramaFragment$zza(Fragment fragment, IStreetViewPanoramaFragmentDelegate istreetviewpanoramafragmentdelegate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		zzbt = (IStreetViewPanoramaFragmentDelegate)Preconditions.checkNotNull(((Object) (istreetviewpanoramafragmentdelegate)));
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokestatic    #25  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #27  <Class IStreetViewPanoramaFragmentDelegate>
	//    6   12:putfield        #29  <Field IStreetViewPanoramaFragmentDelegate zzbt>
		zzaz = (Fragment)Preconditions.checkNotNull(((Object) (fragment)));
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokestatic    #25  <Method Object Preconditions.checkNotNull(Object)>
	//   10   20:checkcast       #31  <Class Fragment>
	//   11   23:putfield        #33  <Field Fragment zzaz>
	//   12   26:return          
	}
}
