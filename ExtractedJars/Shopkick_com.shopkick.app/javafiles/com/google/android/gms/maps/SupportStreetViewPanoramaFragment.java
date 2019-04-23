// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.app.Activity;
import android.os.*;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.*;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.*;
import com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.internal.zzby;
import com.google.android.gms.maps.internal.zzbz;
import com.google.android.gms.maps.internal.zze;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.*;

// Referenced classes of package com.google.android.gms.maps:
//			StreetViewPanoramaOptions, OnStreetViewPanoramaReadyCallback, zzal, MapsInitializer

public class SupportStreetViewPanoramaFragment extends Fragment
{
	static final class zza
		implements StreetViewLifecycleDelegate
	{

		public final void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
		{
			try
			{
				zzbt.getStreetViewPanoramaAsync(((com.google.android.gms.maps.internal.zzbp) (new zzal(this, onstreetviewpanoramareadycallback))));
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field IStreetViewPanoramaFragmentDelegate zzbt>
		//    2    4:new             #40  <Class zzal>
		//    3    7:dup             
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:invokespecial   #43  <Method void zzal(SupportStreetViewPanoramaFragment$zza, OnStreetViewPanoramaReadyCallback)>
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
				bundle2 = fragment.getArguments();
		//    7   13:aload_0         
		//    8   14:getfield        #33  <Field Fragment fragment>
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

		private final Fragment fragment;
		private final IStreetViewPanoramaFragmentDelegate zzbt;

		public zza(Fragment fragment1, IStreetViewPanoramaFragmentDelegate istreetviewpanoramafragmentdelegate)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			zzbt = (IStreetViewPanoramaFragmentDelegate)Preconditions.checkNotNull(((Object) (istreetviewpanoramafragmentdelegate)));
		//    2    4:aload_0         
		//    3    5:aload_2         
		//    4    6:invokestatic    #25  <Method Object Preconditions.checkNotNull(Object)>
		//    5    9:checkcast       #27  <Class IStreetViewPanoramaFragmentDelegate>
		//    6   12:putfield        #29  <Field IStreetViewPanoramaFragmentDelegate zzbt>
			fragment = (Fragment)Preconditions.checkNotNull(((Object) (fragment1)));
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:invokestatic    #25  <Method Object Preconditions.checkNotNull(Object)>
		//   10   20:checkcast       #31  <Class Fragment>
		//   11   23:putfield        #33  <Field Fragment fragment>
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
				break MISSING_BLOCK_LABEL_133;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field Activity zzbd>
		//    2    4:ifnull          133
		//    3    7:aload_0         
		//    4    8:getfield        #50  <Field OnDelegateCreatedListener zzbc>
		//    5   11:ifnull          133
		//    6   14:aload_0         
		//    7   15:invokevirtual   #54  <Method com.google.android.gms.dynamic.LifecycleDelegate getDelegate()>
		//    8   18:ifnonnull       133
			try
			{
				MapsInitializer.initialize(((android.content.Context) (zzbd)));
		//    9   21:aload_0         
		//   10   22:getfield        #37  <Field Activity zzbd>
		//   11   25:invokestatic    #60  <Method int MapsInitializer.initialize(android.content.Context)>
		//   12   28:pop             
				IStreetViewPanoramaFragmentDelegate istreetviewpanoramafragmentdelegate = zzbz.zza(((android.content.Context) (zzbd))).zzd(ObjectWrapper.wrap(((Object) (zzbd))));
		//   13   29:aload_0         
		//   14   30:getfield        #37  <Field Activity zzbd>
		//   15   33:invokestatic    #65  <Method zze zzbz.zza(android.content.Context)>
		//   16   36:aload_0         
		//   17   37:getfield        #37  <Field Activity zzbd>
		//   18   40:invokestatic    #71  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
		//   19   43:invokeinterface #77  <Method IStreetViewPanoramaFragmentDelegate zze.zzd(com.google.android.gms.dynamic.IObjectWrapper)>
		//   20   48:astore_1        
				zzbc.onDelegateCreated(((com.google.android.gms.dynamic.LifecycleDelegate) (new zza(fragment, istreetviewpanoramafragmentdelegate))));
		//   21   49:aload_0         
		//   22   50:getfield        #50  <Field OnDelegateCreatedListener zzbc>
		//   23   53:new             #79  <Class SupportStreetViewPanoramaFragment$zza>
		//   24   56:dup             
		//   25   57:aload_0         
		//   26   58:getfield        #31  <Field Fragment fragment>
		//   27   61:aload_1         
		//   28   62:invokespecial   #82  <Method void SupportStreetViewPanoramaFragment$zza(Fragment, IStreetViewPanoramaFragmentDelegate)>
		//   29   65:invokeinterface #88  <Method void OnDelegateCreatedListener.onDelegateCreated(com.google.android.gms.dynamic.LifecycleDelegate)>
				OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback;
				for(Iterator iterator = zzbv.iterator(); iterator.hasNext(); ((zza)getDelegate()).getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback))
		//*  30   70:aload_0         
		//*  31   71:getfield        #29  <Field List zzbv>
		//*  32   74:invokeinterface #94  <Method Iterator List.iterator()>
		//*  33   79:astore_1        
		//*  34   80:aload_1         
		//*  35   81:invokeinterface #100 <Method boolean Iterator.hasNext()>
		//*  36   86:ifeq            113
					onstreetviewpanoramareadycallback = (OnStreetViewPanoramaReadyCallback)iterator.next();
		//   37   89:aload_1         
		//   38   90:invokeinterface #104 <Method Object Iterator.next()>
		//   39   95:checkcast       #106 <Class OnStreetViewPanoramaReadyCallback>
		//   40   98:astore_2        

		//   41   99:aload_0         
		//   42  100:invokevirtual   #54  <Method com.google.android.gms.dynamic.LifecycleDelegate getDelegate()>
		//   43  103:checkcast       #79  <Class SupportStreetViewPanoramaFragment$zza>
		//   44  106:aload_2         
		//   45  107:invokevirtual   #110 <Method void SupportStreetViewPanoramaFragment$zza.getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback)>
			}
		//*  46  110:goto            80
		//*  47  113:aload_0         
		//*  48  114:getfield        #29  <Field List zzbv>
		//*  49  117:invokeinterface #113 <Method void List.clear()>
		//*  50  122:return          
			catch(RemoteException remoteexception)
		//*  51  123:astore_1        
			{
				throw new RuntimeRemoteException(remoteexception);
		//   52  124:new             #115 <Class RuntimeRemoteException>
		//   53  127:dup             
		//   54  128:aload_1         
		//   55  129:invokespecial   #118 <Method void RuntimeRemoteException(RemoteException)>
		//   56  132:athrow          
			}
		//*  57  133:return          
			catch(GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception)
		//*  58  134:astore_1        
			{
				return;
		//   59  135:return          
			}
			zzbv.clear();
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

		public final void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
		{
			if(getDelegate() != null)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #54  <Method com.google.android.gms.dynamic.LifecycleDelegate getDelegate()>
		//*   2    4:ifnull          19
			{
				((zza)getDelegate()).getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback);
		//    3    7:aload_0         
		//    4    8:invokevirtual   #54  <Method com.google.android.gms.dynamic.LifecycleDelegate getDelegate()>
		//    5   11:checkcast       #79  <Class SupportStreetViewPanoramaFragment$zza>
		//    6   14:aload_1         
		//    7   15:invokevirtual   #110 <Method void SupportStreetViewPanoramaFragment$zza.getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback)>
				return;
		//    8   18:return          
			} else
			{
				zzbv.add(((Object) (onstreetviewpanoramareadycallback)));
		//    9   19:aload_0         
		//   10   20:getfield        #29  <Field List zzbv>
		//   11   23:aload_1         
		//   12   24:invokeinterface #126 <Method boolean List.add(Object)>
		//   13   29:pop             
				return;
		//   14   30:return          
			}
		}

		private final Fragment fragment;
		private OnDelegateCreatedListener zzbc;
		private Activity zzbd;
		private final List zzbv = new ArrayList();

		zzb(Fragment fragment1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void DeferredLifecycleHelper()>
		//    2    4:aload_0         
		//    3    5:new             #26  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #27  <Method void ArrayList()>
		//    6   12:putfield        #29  <Field List zzbv>
			fragment = fragment1;
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:putfield        #31  <Field Fragment fragment>
		//   10   20:return          
		}
	}


	public SupportStreetViewPanoramaFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Fragment()>
	//    2    4:aload_0         
	//    3    5:new             #9   <Class SupportStreetViewPanoramaFragment$zzb>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #19  <Method void SupportStreetViewPanoramaFragment$zzb(Fragment)>
	//    7   13:putfield        #21  <Field SupportStreetViewPanoramaFragment$zzb zzch>
	//    8   16:return          
	}

	public static SupportStreetViewPanoramaFragment newInstance()
	{
		return new SupportStreetViewPanoramaFragment();
	//    0    0:new             #2   <Class SupportStreetViewPanoramaFragment>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void SupportStreetViewPanoramaFragment()>
	//    3    7:areturn         
	}

	public static SupportStreetViewPanoramaFragment newInstance(StreetViewPanoramaOptions streetviewpanoramaoptions)
	{
		SupportStreetViewPanoramaFragment supportstreetviewpanoramafragment = new SupportStreetViewPanoramaFragment();
	//    0    0:new             #2   <Class SupportStreetViewPanoramaFragment>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void SupportStreetViewPanoramaFragment()>
	//    3    7:astore_1        
		Bundle bundle = new Bundle();
	//    4    8:new             #28  <Class Bundle>
	//    5   11:dup             
	//    6   12:invokespecial   #29  <Method void Bundle()>
	//    7   15:astore_2        
		bundle.putParcelable("StreetViewPanoramaOptions", ((android.os.Parcelable) (streetviewpanoramaoptions)));
	//    8   16:aload_2         
	//    9   17:ldc1            #31  <String "StreetViewPanoramaOptions">
	//   10   19:aload_0         
	//   11   20:invokevirtual   #35  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		supportstreetviewpanoramafragment.setArguments(bundle);
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:invokevirtual   #39  <Method void setArguments(Bundle)>
		return supportstreetviewpanoramafragment;
	//   15   28:aload_1         
	//   16   29:areturn         
	}

	public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
	{
		Preconditions.checkMainThread("getStreetViewPanoramaAsync() must be called on the main thread");
	//    0    0:ldc1            #43  <String "getStreetViewPanoramaAsync() must be called on the main thread">
	//    1    2:invokestatic    #49  <Method void Preconditions.checkMainThread(String)>
		zzch.getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback);
	//    2    5:aload_0         
	//    3    6:getfield        #21  <Field SupportStreetViewPanoramaFragment$zzb zzch>
	//    4    9:aload_1         
	//    5   10:invokevirtual   #51  <Method void SupportStreetViewPanoramaFragment$zzb.getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback)>
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
	//    4    7:invokevirtual   #58  <Method ClassLoader Class.getClassLoader()>
	//    5   10:invokevirtual   #62  <Method void Bundle.setClassLoader(ClassLoader)>
		super.onActivityCreated(bundle);
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:invokespecial   #64  <Method void Fragment.onActivityCreated(Bundle)>
	//    9   18:return          
	}

	public void onAttach(Activity activity)
	{
		super.onAttach(activity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #68  <Method void Fragment.onAttach(Activity)>
		zzb.zza(zzch, activity);
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field SupportStreetViewPanoramaFragment$zzb zzch>
	//    5    9:aload_1         
	//    6   10:invokestatic    #71  <Method void SupportStreetViewPanoramaFragment$zzb.zza(SupportStreetViewPanoramaFragment$zzb, Activity)>
	//    7   13:return          
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #74  <Method void Fragment.onCreate(Bundle)>
		zzch.onCreate(bundle);
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field SupportStreetViewPanoramaFragment$zzb zzch>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #75  <Method void SupportStreetViewPanoramaFragment$zzb.onCreate(Bundle)>
	//    7   13:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		return zzch.onCreateView(layoutinflater, viewgroup, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field SupportStreetViewPanoramaFragment$zzb zzch>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #79  <Method View SupportStreetViewPanoramaFragment$zzb.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6   10:areturn         
	}

	public void onDestroy()
	{
		zzch.onDestroy();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field SupportStreetViewPanoramaFragment$zzb zzch>
	//    2    4:invokevirtual   #82  <Method void SupportStreetViewPanoramaFragment$zzb.onDestroy()>
		super.onDestroy();
	//    3    7:aload_0         
	//    4    8:invokespecial   #83  <Method void Fragment.onDestroy()>
	//    5   11:return          
	}

	public void onDestroyView()
	{
		zzch.onDestroyView();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field SupportStreetViewPanoramaFragment$zzb zzch>
	//    2    4:invokevirtual   #86  <Method void SupportStreetViewPanoramaFragment$zzb.onDestroyView()>
		super.onDestroyView();
	//    3    7:aload_0         
	//    4    8:invokespecial   #87  <Method void Fragment.onDestroyView()>
	//    5   11:return          
	}

	public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
	{
		android.os.StrictMode.ThreadPolicy threadpolicy;
		threadpolicy = StrictMode.getThreadPolicy();
	//    0    0:invokestatic    #95  <Method android.os.StrictMode$ThreadPolicy StrictMode.getThreadPolicy()>
	//    1    3:astore          4
		StrictMode.setThreadPolicy((new android.os.StrictMode.ThreadPolicy.Builder(threadpolicy)).permitAll().build());
	//    2    5:new             #97  <Class android.os.StrictMode$ThreadPolicy$Builder>
	//    3    8:dup             
	//    4    9:aload           4
	//    5   11:invokespecial   #100 <Method void android.os.StrictMode$ThreadPolicy$Builder(android.os.StrictMode$ThreadPolicy)>
	//    6   14:invokevirtual   #104 <Method android.os.StrictMode$ThreadPolicy$Builder android.os.StrictMode$ThreadPolicy$Builder.permitAll()>
	//    7   17:invokevirtual   #107 <Method android.os.StrictMode$ThreadPolicy android.os.StrictMode$ThreadPolicy$Builder.build()>
	//    8   20:invokestatic    #110 <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		super.onInflate(activity, attributeset, bundle);
	//    9   23:aload_0         
	//   10   24:aload_1         
	//   11   25:aload_2         
	//   12   26:aload_3         
	//   13   27:invokespecial   #112 <Method void Fragment.onInflate(Activity, AttributeSet, Bundle)>
		zzb.zza(zzch, activity);
	//   14   30:aload_0         
	//   15   31:getfield        #21  <Field SupportStreetViewPanoramaFragment$zzb zzch>
	//   16   34:aload_1         
	//   17   35:invokestatic    #71  <Method void SupportStreetViewPanoramaFragment$zzb.zza(SupportStreetViewPanoramaFragment$zzb, Activity)>
		attributeset = ((AttributeSet) (new Bundle()));
	//   18   38:new             #28  <Class Bundle>
	//   19   41:dup             
	//   20   42:invokespecial   #29  <Method void Bundle()>
	//   21   45:astore_2        
		zzch.onInflate(activity, ((Bundle) (attributeset)), bundle);
	//   22   46:aload_0         
	//   23   47:getfield        #21  <Field SupportStreetViewPanoramaFragment$zzb zzch>
	//   24   50:aload_1         
	//   25   51:aload_2         
	//   26   52:aload_3         
	//   27   53:invokevirtual   #115 <Method void SupportStreetViewPanoramaFragment$zzb.onInflate(Activity, Bundle, Bundle)>
		StrictMode.setThreadPolicy(threadpolicy);
	//   28   56:aload           4
	//   29   58:invokestatic    #110 <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		return;
	//   30   61:return          
		activity;
	//   31   62:astore_1        
		StrictMode.setThreadPolicy(threadpolicy);
	//   32   63:aload           4
	//   33   65:invokestatic    #110 <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		throw activity;
	//   34   68:aload_1         
	//   35   69:athrow          
	}

	public void onLowMemory()
	{
		zzch.onLowMemory();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field SupportStreetViewPanoramaFragment$zzb zzch>
	//    2    4:invokevirtual   #118 <Method void SupportStreetViewPanoramaFragment$zzb.onLowMemory()>
		super.onLowMemory();
	//    3    7:aload_0         
	//    4    8:invokespecial   #119 <Method void Fragment.onLowMemory()>
	//    5   11:return          
	}

	public void onPause()
	{
		zzch.onPause();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field SupportStreetViewPanoramaFragment$zzb zzch>
	//    2    4:invokevirtual   #122 <Method void SupportStreetViewPanoramaFragment$zzb.onPause()>
		super.onPause();
	//    3    7:aload_0         
	//    4    8:invokespecial   #123 <Method void Fragment.onPause()>
	//    5   11:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #126 <Method void Fragment.onResume()>
		zzch.onResume();
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field SupportStreetViewPanoramaFragment$zzb zzch>
	//    4    8:invokevirtual   #127 <Method void SupportStreetViewPanoramaFragment$zzb.onResume()>
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
	//    4    7:invokevirtual   #58  <Method ClassLoader Class.getClassLoader()>
	//    5   10:invokevirtual   #62  <Method void Bundle.setClassLoader(ClassLoader)>
		super.onSaveInstanceState(bundle);
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:invokespecial   #130 <Method void Fragment.onSaveInstanceState(Bundle)>
		zzch.onSaveInstanceState(bundle);
	//    9   18:aload_0         
	//   10   19:getfield        #21  <Field SupportStreetViewPanoramaFragment$zzb zzch>
	//   11   22:aload_1         
	//   12   23:invokevirtual   #131 <Method void SupportStreetViewPanoramaFragment$zzb.onSaveInstanceState(Bundle)>
	//   13   26:return          
	}

	public void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #134 <Method void Fragment.onStart()>
		zzch.onStart();
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field SupportStreetViewPanoramaFragment$zzb zzch>
	//    4    8:invokevirtual   #135 <Method void SupportStreetViewPanoramaFragment$zzb.onStart()>
	//    5   11:return          
	}

	public void onStop()
	{
		zzch.onStop();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field SupportStreetViewPanoramaFragment$zzb zzch>
	//    2    4:invokevirtual   #138 <Method void SupportStreetViewPanoramaFragment$zzb.onStop()>
		super.onStop();
	//    3    7:aload_0         
	//    4    8:invokespecial   #139 <Method void Fragment.onStop()>
	//    5   11:return          
	}

	public void setArguments(Bundle bundle)
	{
		super.setArguments(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #140 <Method void Fragment.setArguments(Bundle)>
	//    3    5:return          
	}

	private final zzb zzch = new zzb(((Fragment) (this)));
}
