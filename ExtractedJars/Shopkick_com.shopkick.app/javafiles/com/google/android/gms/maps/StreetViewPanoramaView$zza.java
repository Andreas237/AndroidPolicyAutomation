// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.*;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.internal.zzby;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//			StreetViewPanoramaView, zzaj, OnStreetViewPanoramaReadyCallback

static final class StreetViewPanoramaView$zza
	implements StreetViewLifecycleDelegate
{

	public final void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
	{
		try
		{
			zzcd.getStreetViewPanoramaAsync(((com.google.android.gms.maps.internal.zzbp) (new zzaj(this, onstreetviewpanoramareadycallback))));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field IStreetViewPanoramaViewDelegate zzcd>
	//    2    4:new             #42  <Class zzaj>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #45  <Method void zzaj(StreetViewPanoramaView$zza, OnStreetViewPanoramaReadyCallback)>
	//    7   13:invokeinterface #48  <Method void IStreetViewPanoramaViewDelegate.getStreetViewPanoramaAsync(com.google.android.gms.maps.internal.zzbp)>
			return;
	//    8   18:return          
		}
		// Misplaced declaration of an exception variable
		catch(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
	//*   9   19:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (onstreetviewpanoramareadycallback)));
	//   10   20:new             #50  <Class RuntimeRemoteException>
	//   11   23:dup             
	//   12   24:aload_1         
	//   13   25:invokespecial   #53  <Method void RuntimeRemoteException(RemoteException)>
	//   14   28:athrow          
		}
	}

	public final void onCreate(Bundle bundle)
	{
		try
		{
			Bundle bundle1 = new Bundle();
	//    0    0:new             #57  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #58  <Method void Bundle()>
	//    3    7:astore_2        
			zzby.zza(bundle, bundle1);
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokestatic    #63  <Method void zzby.zza(Bundle, Bundle)>
			zzcd.onCreate(bundle1);
	//    7   13:aload_0         
	//    8   14:getfield        #31  <Field IStreetViewPanoramaViewDelegate zzcd>
	//    9   17:aload_2         
	//   10   18:invokeinterface #65  <Method void IStreetViewPanoramaViewDelegate.onCreate(Bundle)>
			zzby.zza(bundle1, bundle);
	//   11   23:aload_2         
	//   12   24:aload_1         
	//   13   25:invokestatic    #63  <Method void zzby.zza(Bundle, Bundle)>
			zzce = (View)ObjectWrapper.unwrap(zzcd.getView());
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #31  <Field IStreetViewPanoramaViewDelegate zzcd>
	//   17   33:invokeinterface #69  <Method com.google.android.gms.dynamic.IObjectWrapper IStreetViewPanoramaViewDelegate.getView()>
	//   18   38:invokestatic    #75  <Method Object ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper)>
	//   19   41:checkcast       #77  <Class View>
	//   20   44:putfield        #79  <Field View zzce>
			parent.removeAllViews();
	//   21   47:aload_0         
	//   22   48:getfield        #35  <Field ViewGroup parent>
	//   23   51:invokevirtual   #82  <Method void ViewGroup.removeAllViews()>
			parent.addView(zzce);
	//   24   54:aload_0         
	//   25   55:getfield        #35  <Field ViewGroup parent>
	//   26   58:aload_0         
	//   27   59:getfield        #79  <Field View zzce>
	//   28   62:invokevirtual   #86  <Method void ViewGroup.addView(View)>
			return;
	//   29   65:return          
		}
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
	//*  30   66:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (bundle)));
	//   31   67:new             #50  <Class RuntimeRemoteException>
	//   32   70:dup             
	//   33   71:aload_1         
	//   34   72:invokespecial   #53  <Method void RuntimeRemoteException(RemoteException)>
	//   35   75:athrow          
		}
	}

	public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
	//    0    0:new             #90  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #92  <String "onCreateView not allowed on StreetViewPanoramaViewDelegate">
	//    3    6:invokespecial   #95  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public final void onDestroy()
	{
		try
		{
			zzcd.onDestroy();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field IStreetViewPanoramaViewDelegate zzcd>
	//    2    4:invokeinterface #98  <Method void IStreetViewPanoramaViewDelegate.onDestroy()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    5   11:new             #50  <Class RuntimeRemoteException>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #53  <Method void RuntimeRemoteException(RemoteException)>
	//    9   19:athrow          
		}
	}

	public final void onDestroyView()
	{
		throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
	//    0    0:new             #90  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #101 <String "onDestroyView not allowed on StreetViewPanoramaViewDelegate">
	//    3    6:invokespecial   #95  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public final void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
	{
		throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
	//    0    0:new             #90  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #105 <String "onInflate not allowed on StreetViewPanoramaViewDelegate">
	//    3    6:invokespecial   #95  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public final void onLowMemory()
	{
		try
		{
			zzcd.onLowMemory();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field IStreetViewPanoramaViewDelegate zzcd>
	//    2    4:invokeinterface #108 <Method void IStreetViewPanoramaViewDelegate.onLowMemory()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    5   11:new             #50  <Class RuntimeRemoteException>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #53  <Method void RuntimeRemoteException(RemoteException)>
	//    9   19:athrow          
		}
	}

	public final void onPause()
	{
		try
		{
			zzcd.onPause();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field IStreetViewPanoramaViewDelegate zzcd>
	//    2    4:invokeinterface #111 <Method void IStreetViewPanoramaViewDelegate.onPause()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    5   11:new             #50  <Class RuntimeRemoteException>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #53  <Method void RuntimeRemoteException(RemoteException)>
	//    9   19:athrow          
		}
	}

	public final void onResume()
	{
		try
		{
			zzcd.onResume();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field IStreetViewPanoramaViewDelegate zzcd>
	//    2    4:invokeinterface #114 <Method void IStreetViewPanoramaViewDelegate.onResume()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    5   11:new             #50  <Class RuntimeRemoteException>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #53  <Method void RuntimeRemoteException(RemoteException)>
	//    9   19:athrow          
		}
	}

	public final void onSaveInstanceState(Bundle bundle)
	{
		try
		{
			Bundle bundle1 = new Bundle();
	//    0    0:new             #57  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #58  <Method void Bundle()>
	//    3    7:astore_2        
			zzby.zza(bundle, bundle1);
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokestatic    #63  <Method void zzby.zza(Bundle, Bundle)>
			zzcd.onSaveInstanceState(bundle1);
	//    7   13:aload_0         
	//    8   14:getfield        #31  <Field IStreetViewPanoramaViewDelegate zzcd>
	//    9   17:aload_2         
	//   10   18:invokeinterface #117 <Method void IStreetViewPanoramaViewDelegate.onSaveInstanceState(Bundle)>
			zzby.zza(bundle1, bundle);
	//   11   23:aload_2         
	//   12   24:aload_1         
	//   13   25:invokestatic    #63  <Method void zzby.zza(Bundle, Bundle)>
			return;
	//   14   28:return          
		}
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
	//*  15   29:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (bundle)));
	//   16   30:new             #50  <Class RuntimeRemoteException>
	//   17   33:dup             
	//   18   34:aload_1         
	//   19   35:invokespecial   #53  <Method void RuntimeRemoteException(RemoteException)>
	//   20   38:athrow          
		}
	}

	public final void onStart()
	{
		try
		{
			zzcd.onStart();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field IStreetViewPanoramaViewDelegate zzcd>
	//    2    4:invokeinterface #120 <Method void IStreetViewPanoramaViewDelegate.onStart()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    5   11:new             #50  <Class RuntimeRemoteException>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #53  <Method void RuntimeRemoteException(RemoteException)>
	//    9   19:athrow          
		}
	}

	public final void onStop()
	{
		try
		{
			zzcd.onStop();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field IStreetViewPanoramaViewDelegate zzcd>
	//    2    4:invokeinterface #123 <Method void IStreetViewPanoramaViewDelegate.onStop()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    5   11:new             #50  <Class RuntimeRemoteException>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #53  <Method void RuntimeRemoteException(RemoteException)>
	//    9   19:athrow          
		}
	}

	private final ViewGroup parent;
	private final IStreetViewPanoramaViewDelegate zzcd;
	private View zzce;

	public StreetViewPanoramaView$zza(ViewGroup viewgroup, IStreetViewPanoramaViewDelegate istreetviewpanoramaviewdelegate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		zzcd = (IStreetViewPanoramaViewDelegate)Preconditions.checkNotNull(((Object) (istreetviewpanoramaviewdelegate)));
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokestatic    #27  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #29  <Class IStreetViewPanoramaViewDelegate>
	//    6   12:putfield        #31  <Field IStreetViewPanoramaViewDelegate zzcd>
		parent = (ViewGroup)Preconditions.checkNotNull(((Object) (viewgroup)));
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokestatic    #27  <Method Object Preconditions.checkNotNull(Object)>
	//   10   20:checkcast       #33  <Class ViewGroup>
	//   11   23:putfield        #35  <Field ViewGroup parent>
	//   12   26:return          
	}
}
