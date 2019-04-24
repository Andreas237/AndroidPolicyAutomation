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
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.internal.zzah;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//			StreetViewPanoramaView, OnStreetViewPanoramaReadyCallback, StreetViewPanorama

static class StreetViewPanoramaView$zza
	implements StreetViewLifecycleDelegate
{

	public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
	{
		try
		{
			zzboR.getStreetViewPanoramaAsync(((com.google.android.gms.maps.internal.zzaf) (new com.google.android.gms.maps.internal.zzaf.zza(onstreetviewpanoramareadycallback) {

				public void zza(IStreetViewPanoramaDelegate istreetviewpanoramadelegate)
					throws RemoteException
				{
					zzboH.onStreetViewPanoramaReady(new StreetViewPanorama(istreetviewpanoramadelegate));
				//    0    0:aload_0         
				//    1    1:getfield        #18  <Field OnStreetViewPanoramaReadyCallback zzboH>
				//    2    4:new             #27  <Class StreetViewPanorama>
				//    3    7:dup             
				//    4    8:aload_1         
				//    5    9:invokespecial   #29  <Method void StreetViewPanorama(IStreetViewPanoramaDelegate)>
				//    6   12:invokeinterface #35  <Method void OnStreetViewPanoramaReadyCallback.onStreetViewPanoramaReady(StreetViewPanorama)>
				//    7   17:return          
				}

				final OnStreetViewPanoramaReadyCallback zzboH;

			
			{
				zzboH = onstreetviewpanoramareadycallback;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #18  <Field OnStreetViewPanoramaReadyCallback zzboH>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void com.google.android.gms.maps.internal.zzaf$zza()>
			//    5    9:return          
			}
			}
)));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field IStreetViewPanoramaViewDelegate zzboR>
	//    2    4:new             #11  <Class StreetViewPanoramaView$zza$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #44  <Method void StreetViewPanoramaView$zza$1(StreetViewPanoramaView$zza, OnStreetViewPanoramaReadyCallback)>
	//    7   13:invokeinterface #47  <Method void IStreetViewPanoramaViewDelegate.getStreetViewPanoramaAsync(com.google.android.gms.maps.internal.zzaf)>
			return;
	//    8   18:return          
		}
		// Misplaced declaration of an exception variable
		catch(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
	//*   9   19:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (onstreetviewpanoramareadycallback)));
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
			zzboR.onCreate(bundle1);
	//    7   13:aload_0         
	//    8   14:getfield        #32  <Field IStreetViewPanoramaViewDelegate zzboR>
	//    9   17:aload_2         
	//   10   18:invokeinterface #65  <Method void IStreetViewPanoramaViewDelegate.onCreate(Bundle)>
			zzah.zzd(bundle1, bundle);
	//   11   23:aload_2         
	//   12   24:aload_1         
	//   13   25:invokestatic    #63  <Method void zzah.zzd(Bundle, Bundle)>
			zzboS = (View)zzd.zzF(zzboR.getView());
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #32  <Field IStreetViewPanoramaViewDelegate zzboR>
	//   17   33:invokeinterface #69  <Method com.google.android.gms.dynamic.IObjectWrapper IStreetViewPanoramaViewDelegate.getView()>
	//   18   38:invokestatic    #75  <Method Object zzd.zzF(com.google.android.gms.dynamic.IObjectWrapper)>
	//   19   41:checkcast       #77  <Class View>
	//   20   44:putfield        #79  <Field View zzboS>
			zzbou.removeAllViews();
	//   21   47:aload_0         
	//   22   48:getfield        #36  <Field ViewGroup zzbou>
	//   23   51:invokevirtual   #82  <Method void ViewGroup.removeAllViews()>
			zzbou.addView(zzboS);
	//   24   54:aload_0         
	//   25   55:getfield        #36  <Field ViewGroup zzbou>
	//   26   58:aload_0         
	//   27   59:getfield        #79  <Field View zzboS>
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
		throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
	//    0    0:new             #90  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #92  <String "onCreateView not allowed on StreetViewPanoramaViewDelegate">
	//    3    6:invokespecial   #95  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public void onDestroy()
	{
		try
		{
			zzboR.onDestroy();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field IStreetViewPanoramaViewDelegate zzboR>
	//    2    4:invokeinterface #98  <Method void IStreetViewPanoramaViewDelegate.onDestroy()>
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
		throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
	//    0    0:new             #90  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #101 <String "onDestroyView not allowed on StreetViewPanoramaViewDelegate">
	//    3    6:invokespecial   #95  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
	{
		throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
	//    0    0:new             #90  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #105 <String "onInflate not allowed on StreetViewPanoramaViewDelegate">
	//    3    6:invokespecial   #95  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public void onLowMemory()
	{
		try
		{
			zzboR.onLowMemory();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field IStreetViewPanoramaViewDelegate zzboR>
	//    2    4:invokeinterface #108 <Method void IStreetViewPanoramaViewDelegate.onLowMemory()>
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
			zzboR.onPause();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field IStreetViewPanoramaViewDelegate zzboR>
	//    2    4:invokeinterface #111 <Method void IStreetViewPanoramaViewDelegate.onPause()>
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
			zzboR.onResume();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field IStreetViewPanoramaViewDelegate zzboR>
	//    2    4:invokeinterface #114 <Method void IStreetViewPanoramaViewDelegate.onResume()>
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
			zzboR.onSaveInstanceState(bundle1);
	//    7   13:aload_0         
	//    8   14:getfield        #32  <Field IStreetViewPanoramaViewDelegate zzboR>
	//    9   17:aload_2         
	//   10   18:invokeinterface #117 <Method void IStreetViewPanoramaViewDelegate.onSaveInstanceState(Bundle)>
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
	//    0    0:return          
	}

	public void onStop()
	{
	//    0    0:return          
	}

	private final IStreetViewPanoramaViewDelegate zzboR;
	private View zzboS;
	private final ViewGroup zzbou;

	public StreetViewPanoramaView$zza(ViewGroup viewgroup, IStreetViewPanoramaViewDelegate istreetviewpanoramaviewdelegate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		zzboR = (IStreetViewPanoramaViewDelegate)zzac.zzw(((Object) (istreetviewpanoramaviewdelegate)));
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokestatic    #28  <Method Object zzac.zzw(Object)>
	//    5    9:checkcast       #30  <Class IStreetViewPanoramaViewDelegate>
	//    6   12:putfield        #32  <Field IStreetViewPanoramaViewDelegate zzboR>
		zzbou = (ViewGroup)zzac.zzw(((Object) (viewgroup)));
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokestatic    #28  <Method Object zzac.zzw(Object)>
	//   10   20:checkcast       #34  <Class ViewGroup>
	//   11   23:putfield        #36  <Field ViewGroup zzbou>
	//   12   26:return          
	}
}
