// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.*;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.internal.zzah;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//			StreetViewPanoramaFragment, OnStreetViewPanoramaReadyCallback, StreetViewPanorama

static class StreetViewPanoramaFragment$zza
	implements StreetViewLifecycleDelegate
{

	public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
	{
		try
		{
			zzboG.getStreetViewPanoramaAsync(((com.google.android.gms.maps.internal.zzaf) (new com.google.android.gms.maps.internal.zzaf.zza(onstreetviewpanoramareadycallback) {

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
	//    1    1:getfield        #30  <Field IStreetViewPanoramaFragmentDelegate zzboG>
	//    2    4:new             #11  <Class StreetViewPanoramaFragment$zza$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #42  <Method void StreetViewPanoramaFragment$zza$1(StreetViewPanoramaFragment$zza, OnStreetViewPanoramaReadyCallback)>
	//    7   13:invokeinterface #45  <Method void IStreetViewPanoramaFragmentDelegate.getStreetViewPanoramaAsync(com.google.android.gms.maps.internal.zzaf)>
			return;
	//    8   18:return          
		}
		// Misplaced declaration of an exception variable
		catch(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
	//*   9   19:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (onstreetviewpanoramareadycallback)));
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
			bundle2 = zzaRK.getArguments();
	//    7   13:aload_0         
	//    8   14:getfield        #34  <Field Fragment zzaRK>
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
	//*  22   43:invokestatic    #78  <Method void zzah.zza(Bundle, String, android.os.Parcelable)>
	//*  23   46:aload_0         
	//*  24   47:getfield        #30  <Field IStreetViewPanoramaFragmentDelegate zzboG>
	//*  25   50:aload_2         
	//*  26   51:invokeinterface #80  <Method void IStreetViewPanoramaFragmentDelegate.onCreate(Bundle)>
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
		if(bundle2.containsKey("StreetViewPanoramaOptions"))
			zzah.zza(bundle1, "StreetViewPanoramaOptions", bundle2.getParcelable("StreetViewPanoramaOptions"));
		zzboG.onCreate(bundle1);
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
			layoutinflater = ((LayoutInflater) (zzboG.onCreateView(zzd.zzA(((Object) (layoutinflater))), zzd.zzA(((Object) (viewgroup))), bundle1)));
	//    7   15:aload_0         
	//    8   16:getfield        #30  <Field IStreetViewPanoramaFragmentDelegate zzboG>
	//    9   19:aload_1         
	//   10   20:invokestatic    #88  <Method com.google.android.gms.dynamic.IObjectWrapper zzd.zzA(Object)>
	//   11   23:aload_2         
	//   12   24:invokestatic    #88  <Method com.google.android.gms.dynamic.IObjectWrapper zzd.zzA(Object)>
	//   13   27:aload           4
	//   14   29:invokeinterface #91  <Method com.google.android.gms.dynamic.IObjectWrapper IStreetViewPanoramaFragmentDelegate.onCreateView(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper, Bundle)>
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
			zzboG.onDestroy();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field IStreetViewPanoramaFragmentDelegate zzboG>
	//    2    4:invokeinterface #100 <Method void IStreetViewPanoramaFragmentDelegate.onDestroy()>
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
			zzboG.onDestroyView();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field IStreetViewPanoramaFragmentDelegate zzboG>
	//    2    4:invokeinterface #103 <Method void IStreetViewPanoramaFragmentDelegate.onDestroyView()>
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
		try
		{
			bundle = new Bundle();
	//    0    0:new             #54  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #55  <Method void Bundle()>
	//    3    7:astore_2        
			zzah.zzd(bundle1, bundle);
	//    4    8:aload_3         
	//    5    9:aload_2         
	//    6   10:invokestatic    #61  <Method void zzah.zzd(Bundle, Bundle)>
			zzboG.onInflate(zzd.zzA(((Object) (activity))), ((StreetViewPanoramaOptions) (null)), bundle);
	//    7   13:aload_0         
	//    8   14:getfield        #30  <Field IStreetViewPanoramaFragmentDelegate zzboG>
	//    9   17:aload_1         
	//   10   18:invokestatic    #88  <Method com.google.android.gms.dynamic.IObjectWrapper zzd.zzA(Object)>
	//   11   21:aconst_null     
	//   12   22:aload_2         
	//   13   23:invokeinterface #108 <Method void IStreetViewPanoramaFragmentDelegate.onInflate(com.google.android.gms.dynamic.IObjectWrapper, StreetViewPanoramaOptions, Bundle)>
			zzah.zzd(bundle, bundle1);
	//   14   28:aload_2         
	//   15   29:aload_3         
	//   16   30:invokestatic    #61  <Method void zzah.zzd(Bundle, Bundle)>
			return;
	//   17   33:return          
		}
		// Misplaced declaration of an exception variable
		catch(Activity activity)
	//*  18   34:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (activity)));
	//   19   35:new             #47  <Class RuntimeRemoteException>
	//   20   38:dup             
	//   21   39:aload_1         
	//   22   40:invokespecial   #50  <Method void RuntimeRemoteException(RemoteException)>
	//   23   43:athrow          
		}
	}

	public void onLowMemory()
	{
		try
		{
			zzboG.onLowMemory();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field IStreetViewPanoramaFragmentDelegate zzboG>
	//    2    4:invokeinterface #111 <Method void IStreetViewPanoramaFragmentDelegate.onLowMemory()>
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
			zzboG.onPause();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field IStreetViewPanoramaFragmentDelegate zzboG>
	//    2    4:invokeinterface #114 <Method void IStreetViewPanoramaFragmentDelegate.onPause()>
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
			zzboG.onResume();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field IStreetViewPanoramaFragmentDelegate zzboG>
	//    2    4:invokeinterface #117 <Method void IStreetViewPanoramaFragmentDelegate.onResume()>
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
			zzboG.onSaveInstanceState(bundle1);
	//    7   13:aload_0         
	//    8   14:getfield        #30  <Field IStreetViewPanoramaFragmentDelegate zzboG>
	//    9   17:aload_2         
	//   10   18:invokeinterface #120 <Method void IStreetViewPanoramaFragmentDelegate.onSaveInstanceState(Bundle)>
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
	//    0    0:return          
	}

	public void onStop()
	{
	//    0    0:return          
	}

	private final Fragment zzaRK;
	private final IStreetViewPanoramaFragmentDelegate zzboG;

	public StreetViewPanoramaFragment$zza(Fragment fragment, IStreetViewPanoramaFragmentDelegate istreetviewpanoramafragmentdelegate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		zzboG = (IStreetViewPanoramaFragmentDelegate)zzac.zzw(((Object) (istreetviewpanoramafragmentdelegate)));
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokestatic    #26  <Method Object zzac.zzw(Object)>
	//    5    9:checkcast       #28  <Class IStreetViewPanoramaFragmentDelegate>
	//    6   12:putfield        #30  <Field IStreetViewPanoramaFragmentDelegate zzboG>
		zzaRK = (Fragment)zzac.zzw(((Object) (fragment)));
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokestatic    #26  <Method Object zzac.zzw(Object)>
	//   10   20:checkcast       #32  <Class Fragment>
	//   11   23:putfield        #34  <Field Fragment zzaRK>
	//   12   26:return          
	}
}
