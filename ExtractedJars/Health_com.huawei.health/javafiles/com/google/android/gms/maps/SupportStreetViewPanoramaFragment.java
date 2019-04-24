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
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.internal.zzah;
import com.google.android.gms.maps.internal.zzai;
import com.google.android.gms.maps.internal.zzc;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps:
//			StreetViewPanoramaOptions, OnStreetViewPanoramaReadyCallback, StreetViewPanorama, MapsInitializer

public class SupportStreetViewPanoramaFragment extends Fragment
{
	static class zza
		implements StreetViewLifecycleDelegate
	{

		public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
		{
			try
			{
				zzboG.getStreetViewPanoramaAsync(((com.google.android.gms.maps.internal.zzaf) (new com.google.android.gms.maps.internal.zzaf.zza(this, onstreetviewpanoramareadycallback) {

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
		//    2    4:new             #11  <Class SupportStreetViewPanoramaFragment$zza$1>
		//    3    7:dup             
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:invokespecial   #42  <Method void SupportStreetViewPanoramaFragment$zza$1(SupportStreetViewPanoramaFragment$zza, OnStreetViewPanoramaReadyCallback)>
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
				bundle2 = zzaRN.getArguments();
		//    7   13:aload_0         
		//    8   14:getfield        #34  <Field Fragment zzaRN>
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

		private final Fragment zzaRN;
		private final IStreetViewPanoramaFragmentDelegate zzboG;

		public zza(Fragment fragment, IStreetViewPanoramaFragmentDelegate istreetviewpanoramafragmentdelegate)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			zzboG = (IStreetViewPanoramaFragmentDelegate)zzac.zzw(((Object) (istreetviewpanoramafragmentdelegate)));
		//    2    4:aload_0         
		//    3    5:aload_2         
		//    4    6:invokestatic    #26  <Method Object zzac.zzw(Object)>
		//    5    9:checkcast       #28  <Class IStreetViewPanoramaFragmentDelegate>
		//    6   12:putfield        #30  <Field IStreetViewPanoramaFragmentDelegate zzboG>
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

		public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
		{
			if(zzBN() != null)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #48  <Method com.google.android.gms.dynamic.LifecycleDelegate zzBN()>
		//*   2    4:ifnull          19
			{
				((zza)zzBN()).getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback);
		//    3    7:aload_0         
		//    4    8:invokevirtual   #48  <Method com.google.android.gms.dynamic.LifecycleDelegate zzBN()>
		//    5   11:checkcast       #50  <Class SupportStreetViewPanoramaFragment$zza>
		//    6   14:aload_1         
		//    7   15:invokevirtual   #52  <Method void SupportStreetViewPanoramaFragment$zza.getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback)>
				return;
		//    8   18:return          
			} else
			{
				zzboI.add(((Object) (onstreetviewpanoramareadycallback)));
		//    9   19:aload_0         
		//   10   20:getfield        #28  <Field List zzboI>
		//   11   23:aload_1         
		//   12   24:invokeinterface #58  <Method boolean List.add(Object)>
		//   13   29:pop             
				return;
		//   14   30:return          
			}
		}

		public void zzJz()
		{
			if(mActivity == null || zzbor == null || zzBN() != null)
				break MISSING_BLOCK_LABEL_133;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field Activity mActivity>
		//    2    4:ifnull          133
		//    3    7:aload_0         
		//    4    8:getfield        #64  <Field zze zzbor>
		//    5   11:ifnull          133
		//    6   14:aload_0         
		//    7   15:invokevirtual   #48  <Method com.google.android.gms.dynamic.LifecycleDelegate zzBN()>
		//    8   18:ifnonnull       133
			try
			{
				MapsInitializer.initialize(((android.content.Context) (mActivity)));
		//    9   21:aload_0         
		//   10   22:getfield        #35  <Field Activity mActivity>
		//   11   25:invokestatic    #70  <Method int MapsInitializer.initialize(android.content.Context)>
		//   12   28:pop             
				IStreetViewPanoramaFragmentDelegate istreetviewpanoramafragmentdelegate = zzai.zzbI(((android.content.Context) (mActivity))).zzJ(zzd.zzA(((Object) (mActivity))));
		//   13   29:aload_0         
		//   14   30:getfield        #35  <Field Activity mActivity>
		//   15   33:invokestatic    #76  <Method zzc zzai.zzbI(android.content.Context)>
		//   16   36:aload_0         
		//   17   37:getfield        #35  <Field Activity mActivity>
		//   18   40:invokestatic    #82  <Method com.google.android.gms.dynamic.IObjectWrapper zzd.zzA(Object)>
		//   19   43:invokeinterface #88  <Method IStreetViewPanoramaFragmentDelegate zzc.zzJ(com.google.android.gms.dynamic.IObjectWrapper)>
		//   20   48:astore_1        
				zzbor.zza(((com.google.android.gms.dynamic.LifecycleDelegate) (new zza(zzaRN, istreetviewpanoramafragmentdelegate))));
		//   21   49:aload_0         
		//   22   50:getfield        #64  <Field zze zzbor>
		//   23   53:new             #50  <Class SupportStreetViewPanoramaFragment$zza>
		//   24   56:dup             
		//   25   57:aload_0         
		//   26   58:getfield        #30  <Field Fragment zzaRN>
		//   27   61:aload_1         
		//   28   62:invokespecial   #91  <Method void SupportStreetViewPanoramaFragment$zza(Fragment, IStreetViewPanoramaFragmentDelegate)>
		//   29   65:invokeinterface #96  <Method void zze.zza(com.google.android.gms.dynamic.LifecycleDelegate)>
				OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback;
				for(Iterator iterator = zzboI.iterator(); iterator.hasNext(); ((zza)zzBN()).getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback))
		//*  30   70:aload_0         
		//*  31   71:getfield        #28  <Field List zzboI>
		//*  32   74:invokeinterface #100 <Method Iterator List.iterator()>
		//*  33   79:astore_1        
		//*  34   80:aload_1         
		//*  35   81:invokeinterface #106 <Method boolean Iterator.hasNext()>
		//*  36   86:ifeq            113
					onstreetviewpanoramareadycallback = (OnStreetViewPanoramaReadyCallback)iterator.next();
		//   37   89:aload_1         
		//   38   90:invokeinterface #110 <Method Object Iterator.next()>
		//   39   95:checkcast       #112 <Class OnStreetViewPanoramaReadyCallback>
		//   40   98:astore_2        

		//   41   99:aload_0         
		//   42  100:invokevirtual   #48  <Method com.google.android.gms.dynamic.LifecycleDelegate zzBN()>
		//   43  103:checkcast       #50  <Class SupportStreetViewPanoramaFragment$zza>
		//   44  106:aload_2         
		//   45  107:invokevirtual   #52  <Method void SupportStreetViewPanoramaFragment$zza.getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback)>
			}
		//*  46  110:goto            80
		//*  47  113:aload_0         
		//*  48  114:getfield        #28  <Field List zzboI>
		//*  49  117:invokeinterface #115 <Method void List.clear()>
		//*  50  122:return          
			catch(RemoteException remoteexception)
		//*  51  123:astore_1        
			{
				throw new RuntimeRemoteException(remoteexception);
		//   52  124:new             #117 <Class RuntimeRemoteException>
		//   53  127:dup             
		//   54  128:aload_1         
		//   55  129:invokespecial   #120 <Method void RuntimeRemoteException(RemoteException)>
		//   56  132:athrow          
			}
		//*  57  133:return          
			catch(GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception)
		//*  58  134:astore_1        
			{
				return;
		//   59  135:return          
			}
			zzboI.clear();
			return;
		}

		public void zza(zze zze1)
		{
			zzbor = zze1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #64  <Field zze zzbor>
			zzJz();
		//    3    5:aload_0         
		//    4    6:invokevirtual   #38  <Method void zzJz()>
		//    5    9:return          
		}

		private Activity mActivity;
		private final Fragment zzaRN;
		private final List zzboI = new ArrayList();
		protected zze zzbor;

		zzb(Fragment fragment)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void com.google.android.gms.dynamic.zza()>
		//    2    4:aload_0         
		//    3    5:new             #25  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #26  <Method void ArrayList()>
		//    6   12:putfield        #28  <Field List zzboI>
			zzaRN = fragment;
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:putfield        #30  <Field Fragment zzaRN>
		//   10   20:return          
		}
	}


	public SupportStreetViewPanoramaFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Fragment()>
	//    2    4:aload_0         
	//    3    5:new             #11  <Class SupportStreetViewPanoramaFragment$zzb>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #21  <Method void SupportStreetViewPanoramaFragment$zzb(Fragment)>
	//    7   13:putfield        #23  <Field SupportStreetViewPanoramaFragment$zzb zzboV>
	//    8   16:return          
	}

	public static SupportStreetViewPanoramaFragment newInstance()
	{
		return new SupportStreetViewPanoramaFragment();
	//    0    0:new             #2   <Class SupportStreetViewPanoramaFragment>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void SupportStreetViewPanoramaFragment()>
	//    3    7:areturn         
	}

	public static SupportStreetViewPanoramaFragment newInstance(StreetViewPanoramaOptions streetviewpanoramaoptions)
	{
		SupportStreetViewPanoramaFragment supportstreetviewpanoramafragment = new SupportStreetViewPanoramaFragment();
	//    0    0:new             #2   <Class SupportStreetViewPanoramaFragment>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void SupportStreetViewPanoramaFragment()>
	//    3    7:astore_1        
		Bundle bundle = new Bundle();
	//    4    8:new             #30  <Class Bundle>
	//    5   11:dup             
	//    6   12:invokespecial   #31  <Method void Bundle()>
	//    7   15:astore_2        
		bundle.putParcelable("StreetViewPanoramaOptions", ((android.os.Parcelable) (streetviewpanoramaoptions)));
	//    8   16:aload_2         
	//    9   17:ldc1            #33  <String "StreetViewPanoramaOptions">
	//   10   19:aload_0         
	//   11   20:invokevirtual   #37  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		supportstreetviewpanoramafragment.setArguments(bundle);
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:invokevirtual   #41  <Method void setArguments(Bundle)>
		return supportstreetviewpanoramafragment;
	//   15   28:aload_1         
	//   16   29:areturn         
	}

	public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
	{
		zzac.zzdj("getStreetViewPanoramaAsync() must be called on the main thread");
	//    0    0:ldc1            #45  <String "getStreetViewPanoramaAsync() must be called on the main thread">
	//    1    2:invokestatic    #51  <Method void zzac.zzdj(String)>
		zzboV.getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback);
	//    2    5:aload_0         
	//    3    6:getfield        #23  <Field SupportStreetViewPanoramaFragment$zzb zzboV>
	//    4    9:aload_1         
	//    5   10:invokevirtual   #53  <Method void SupportStreetViewPanoramaFragment$zzb.getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback)>
	//    6   13:return          
	}

	public void onActivityCreated(Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          13
			bundle.setClassLoader(((Class) (com/google/android/gms/maps/SupportStreetViewPanoramaFragment)).getClassLoader());
	//    2    4:aload_1         
	//    3    5:ldc1            #2   <Class SupportStreetViewPanoramaFragment>
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
		zzb.zza(zzboV, activity);
	//    3    5:aload_0         
	//    4    6:getfield        #23  <Field SupportStreetViewPanoramaFragment$zzb zzboV>
	//    5    9:aload_1         
	//    6   10:invokestatic    #73  <Method void SupportStreetViewPanoramaFragment$zzb.zza(SupportStreetViewPanoramaFragment$zzb, Activity)>
	//    7   13:return          
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #76  <Method void Fragment.onCreate(Bundle)>
		zzboV.onCreate(bundle);
	//    3    5:aload_0         
	//    4    6:getfield        #23  <Field SupportStreetViewPanoramaFragment$zzb zzboV>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #77  <Method void SupportStreetViewPanoramaFragment$zzb.onCreate(Bundle)>
	//    7   13:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		return zzboV.onCreateView(layoutinflater, viewgroup, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field SupportStreetViewPanoramaFragment$zzb zzboV>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #81  <Method View SupportStreetViewPanoramaFragment$zzb.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6   10:areturn         
	}

	public void onDestroy()
	{
		zzboV.onDestroy();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field SupportStreetViewPanoramaFragment$zzb zzboV>
	//    2    4:invokevirtual   #84  <Method void SupportStreetViewPanoramaFragment$zzb.onDestroy()>
		super.onDestroy();
	//    3    7:aload_0         
	//    4    8:invokespecial   #85  <Method void Fragment.onDestroy()>
	//    5   11:return          
	}

	public void onDestroyView()
	{
		zzboV.onDestroyView();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field SupportStreetViewPanoramaFragment$zzb zzboV>
	//    2    4:invokevirtual   #88  <Method void SupportStreetViewPanoramaFragment$zzb.onDestroyView()>
		super.onDestroyView();
	//    3    7:aload_0         
	//    4    8:invokespecial   #89  <Method void Fragment.onDestroyView()>
	//    5   11:return          
	}

	public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
	{
		super.onInflate(activity, attributeset, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #93  <Method void Fragment.onInflate(Activity, AttributeSet, Bundle)>
		zzb.zza(zzboV, activity);
	//    5    7:aload_0         
	//    6    8:getfield        #23  <Field SupportStreetViewPanoramaFragment$zzb zzboV>
	//    7   11:aload_1         
	//    8   12:invokestatic    #73  <Method void SupportStreetViewPanoramaFragment$zzb.zza(SupportStreetViewPanoramaFragment$zzb, Activity)>
		attributeset = ((AttributeSet) (new Bundle()));
	//    9   15:new             #30  <Class Bundle>
	//   10   18:dup             
	//   11   19:invokespecial   #31  <Method void Bundle()>
	//   12   22:astore_2        
		zzboV.onInflate(activity, ((Bundle) (attributeset)), bundle);
	//   13   23:aload_0         
	//   14   24:getfield        #23  <Field SupportStreetViewPanoramaFragment$zzb zzboV>
	//   15   27:aload_1         
	//   16   28:aload_2         
	//   17   29:aload_3         
	//   18   30:invokevirtual   #96  <Method void SupportStreetViewPanoramaFragment$zzb.onInflate(Activity, Bundle, Bundle)>
	//   19   33:return          
	}

	public void onLowMemory()
	{
		zzboV.onLowMemory();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field SupportStreetViewPanoramaFragment$zzb zzboV>
	//    2    4:invokevirtual   #99  <Method void SupportStreetViewPanoramaFragment$zzb.onLowMemory()>
		super.onLowMemory();
	//    3    7:aload_0         
	//    4    8:invokespecial   #100 <Method void Fragment.onLowMemory()>
	//    5   11:return          
	}

	public void onPause()
	{
		zzboV.onPause();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field SupportStreetViewPanoramaFragment$zzb zzboV>
	//    2    4:invokevirtual   #103 <Method void SupportStreetViewPanoramaFragment$zzb.onPause()>
		super.onPause();
	//    3    7:aload_0         
	//    4    8:invokespecial   #104 <Method void Fragment.onPause()>
	//    5   11:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #107 <Method void Fragment.onResume()>
		zzboV.onResume();
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field SupportStreetViewPanoramaFragment$zzb zzboV>
	//    4    8:invokevirtual   #108 <Method void SupportStreetViewPanoramaFragment$zzb.onResume()>
	//    5   11:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          13
			bundle.setClassLoader(((Class) (com/google/android/gms/maps/SupportStreetViewPanoramaFragment)).getClassLoader());
	//    2    4:aload_1         
	//    3    5:ldc1            #2   <Class SupportStreetViewPanoramaFragment>
	//    4    7:invokevirtual   #60  <Method ClassLoader Class.getClassLoader()>
	//    5   10:invokevirtual   #64  <Method void Bundle.setClassLoader(ClassLoader)>
		super.onSaveInstanceState(bundle);
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:invokespecial   #111 <Method void Fragment.onSaveInstanceState(Bundle)>
		zzboV.onSaveInstanceState(bundle);
	//    9   18:aload_0         
	//   10   19:getfield        #23  <Field SupportStreetViewPanoramaFragment$zzb zzboV>
	//   11   22:aload_1         
	//   12   23:invokevirtual   #112 <Method void SupportStreetViewPanoramaFragment$zzb.onSaveInstanceState(Bundle)>
	//   13   26:return          
	}

	public void setArguments(Bundle bundle)
	{
		super.setArguments(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #113 <Method void Fragment.setArguments(Bundle)>
	//    3    5:return          
	}

	private final zzb zzboV = new zzb(((Fragment) (this)));
}
