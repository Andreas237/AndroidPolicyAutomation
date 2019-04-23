// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.*;
import android.util.AttributeSet;
import android.view.*;
import android.widget.FrameLayout;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.*;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.internal.zzby;
import com.google.android.gms.maps.internal.zzbz;
import com.google.android.gms.maps.internal.zze;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.*;

// Referenced classes of package com.google.android.gms.maps:
//			GoogleMapOptions, OnMapReadyCallback, zzac, MapsInitializer

public class MapView extends FrameLayout
{
	static final class zza
		implements MapLifecycleDelegate
	{

		public final void getMapAsync(OnMapReadyCallback onmapreadycallback)
		{
			try
			{
				zzbg.getMapAsync(((com.google.android.gms.maps.internal.zzap) (new zzac(this, onmapreadycallback))));
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field IMapViewDelegate zzbg>
		//    2    4:new             #42  <Class zzac>
		//    3    7:dup             
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:invokespecial   #45  <Method void zzac(MapView$zza, OnMapReadyCallback)>
		//    7   13:invokeinterface #48  <Method void IMapViewDelegate.getMapAsync(com.google.android.gms.maps.internal.zzap)>
				return;
		//    8   18:return          
			}
			// Misplaced declaration of an exception variable
			catch(OnMapReadyCallback onmapreadycallback)
		//*   9   19:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (onmapreadycallback)));
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
				zzbg.onCreate(bundle1);
		//    7   13:aload_0         
		//    8   14:getfield        #31  <Field IMapViewDelegate zzbg>
		//    9   17:aload_2         
		//   10   18:invokeinterface #65  <Method void IMapViewDelegate.onCreate(Bundle)>
				zzby.zza(bundle1, bundle);
		//   11   23:aload_2         
		//   12   24:aload_1         
		//   13   25:invokestatic    #63  <Method void zzby.zza(Bundle, Bundle)>
				zzbh = (View)ObjectWrapper.unwrap(zzbg.getView());
		//   14   28:aload_0         
		//   15   29:aload_0         
		//   16   30:getfield        #31  <Field IMapViewDelegate zzbg>
		//   17   33:invokeinterface #69  <Method com.google.android.gms.dynamic.IObjectWrapper IMapViewDelegate.getView()>
		//   18   38:invokestatic    #75  <Method Object ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper)>
		//   19   41:checkcast       #77  <Class View>
		//   20   44:putfield        #79  <Field View zzbh>
				parent.removeAllViews();
		//   21   47:aload_0         
		//   22   48:getfield        #35  <Field ViewGroup parent>
		//   23   51:invokevirtual   #82  <Method void ViewGroup.removeAllViews()>
				parent.addView(zzbh);
		//   24   54:aload_0         
		//   25   55:getfield        #35  <Field ViewGroup parent>
		//   26   58:aload_0         
		//   27   59:getfield        #79  <Field View zzbh>
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
			throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
		//    0    0:new             #90  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:ldc1            #92  <String "onCreateView not allowed on MapViewDelegate">
		//    3    6:invokespecial   #95  <Method void UnsupportedOperationException(String)>
		//    4    9:athrow          
		}

		public final void onDestroy()
		{
			try
			{
				zzbg.onDestroy();
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field IMapViewDelegate zzbg>
		//    2    4:invokeinterface #98  <Method void IMapViewDelegate.onDestroy()>
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
			throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
		//    0    0:new             #90  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:ldc1            #101 <String "onDestroyView not allowed on MapViewDelegate">
		//    3    6:invokespecial   #95  <Method void UnsupportedOperationException(String)>
		//    4    9:athrow          
		}

		public final void onEnterAmbient(Bundle bundle)
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
				zzbg.onEnterAmbient(bundle1);
		//    7   13:aload_0         
		//    8   14:getfield        #31  <Field IMapViewDelegate zzbg>
		//    9   17:aload_2         
		//   10   18:invokeinterface #104 <Method void IMapViewDelegate.onEnterAmbient(Bundle)>
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

		public final void onExitAmbient()
		{
			try
			{
				zzbg.onExitAmbient();
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field IMapViewDelegate zzbg>
		//    2    4:invokeinterface #107 <Method void IMapViewDelegate.onExitAmbient()>
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

		public final void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
		{
			throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
		//    0    0:new             #90  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:ldc1            #111 <String "onInflate not allowed on MapViewDelegate">
		//    3    6:invokespecial   #95  <Method void UnsupportedOperationException(String)>
		//    4    9:athrow          
		}

		public final void onLowMemory()
		{
			try
			{
				zzbg.onLowMemory();
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field IMapViewDelegate zzbg>
		//    2    4:invokeinterface #114 <Method void IMapViewDelegate.onLowMemory()>
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
				zzbg.onPause();
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field IMapViewDelegate zzbg>
		//    2    4:invokeinterface #117 <Method void IMapViewDelegate.onPause()>
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
				zzbg.onResume();
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field IMapViewDelegate zzbg>
		//    2    4:invokeinterface #120 <Method void IMapViewDelegate.onResume()>
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
				zzbg.onSaveInstanceState(bundle1);
		//    7   13:aload_0         
		//    8   14:getfield        #31  <Field IMapViewDelegate zzbg>
		//    9   17:aload_2         
		//   10   18:invokeinterface #123 <Method void IMapViewDelegate.onSaveInstanceState(Bundle)>
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
				zzbg.onStart();
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field IMapViewDelegate zzbg>
		//    2    4:invokeinterface #126 <Method void IMapViewDelegate.onStart()>
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
				zzbg.onStop();
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field IMapViewDelegate zzbg>
		//    2    4:invokeinterface #129 <Method void IMapViewDelegate.onStop()>
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
		private final IMapViewDelegate zzbg;
		private View zzbh;

		public zza(ViewGroup viewgroup, IMapViewDelegate imapviewdelegate)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			zzbg = (IMapViewDelegate)Preconditions.checkNotNull(((Object) (imapviewdelegate)));
		//    2    4:aload_0         
		//    3    5:aload_2         
		//    4    6:invokestatic    #27  <Method Object Preconditions.checkNotNull(Object)>
		//    5    9:checkcast       #29  <Class IMapViewDelegate>
		//    6   12:putfield        #31  <Field IMapViewDelegate zzbg>
			parent = (ViewGroup)Preconditions.checkNotNull(((Object) (viewgroup)));
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:invokestatic    #27  <Method Object Preconditions.checkNotNull(Object)>
		//   10   20:checkcast       #33  <Class ViewGroup>
		//   11   23:putfield        #35  <Field ViewGroup parent>
		//   12   26:return          
		}
	}

	static final class zzb extends DeferredLifecycleHelper
	{

		protected final void createDelegate(OnDelegateCreatedListener ondelegatecreatedlistener)
		{
			zzbc = ondelegatecreatedlistener;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #47  <Field OnDelegateCreatedListener zzbc>
			if(zzbc == null || getDelegate() != null)
				break MISSING_BLOCK_LABEL_140;
		//    3    5:aload_0         
		//    4    6:getfield        #47  <Field OnDelegateCreatedListener zzbc>
		//    5    9:ifnull          140
		//    6   12:aload_0         
		//    7   13:invokevirtual   #51  <Method com.google.android.gms.dynamic.LifecycleDelegate getDelegate()>
		//    8   16:ifnonnull       140
			OnMapReadyCallback onmapreadycallback;
			try
			{
				MapsInitializer.initialize(zzbj);
		//    9   19:aload_0         
		//   10   20:getfield        #35  <Field Context zzbj>
		//   11   23:invokestatic    #57  <Method int MapsInitializer.initialize(Context)>
		//   12   26:pop             
				ondelegatecreatedlistener = ((OnDelegateCreatedListener) (zzbz.zza(zzbj).zza(ObjectWrapper.wrap(((Object) (zzbj))), zzbk)));
		//   13   27:aload_0         
		//   14   28:getfield        #35  <Field Context zzbj>
		//   15   31:invokestatic    #63  <Method zze zzbz.zza(Context)>
		//   16   34:aload_0         
		//   17   35:getfield        #35  <Field Context zzbj>
		//   18   38:invokestatic    #69  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
		//   19   41:aload_0         
		//   20   42:getfield        #37  <Field GoogleMapOptions zzbk>
		//   21   45:invokeinterface #74  <Method IMapViewDelegate zze.zza(com.google.android.gms.dynamic.IObjectWrapper, GoogleMapOptions)>
		//   22   50:astore_1        
			}
		//*  23   51:aload_1         
		//*  24   52:ifnonnull       56
		//*  25   55:return          
		//*  26   56:aload_0         
		//*  27   57:getfield        #47  <Field OnDelegateCreatedListener zzbc>
		//*  28   60:new             #76  <Class MapView$zza>
		//*  29   63:dup             
		//*  30   64:aload_0         
		//*  31   65:getfield        #33  <Field ViewGroup zzbi>
		//*  32   68:aload_1         
		//*  33   69:invokespecial   #79  <Method void MapView$zza(ViewGroup, IMapViewDelegate)>
		//*  34   72:invokeinterface #85  <Method void OnDelegateCreatedListener.onDelegateCreated(com.google.android.gms.dynamic.LifecycleDelegate)>
		//*  35   77:aload_0         
		//*  36   78:getfield        #31  <Field List zzbe>
		//*  37   81:invokeinterface #91  <Method Iterator List.iterator()>
		//*  38   86:astore_1        
		//*  39   87:aload_1         
		//*  40   88:invokeinterface #97  <Method boolean Iterator.hasNext()>
		//*  41   93:ifeq            120
		//*  42   96:aload_1         
		//*  43   97:invokeinterface #101 <Method Object Iterator.next()>
		//*  44  102:checkcast       #103 <Class OnMapReadyCallback>
		//*  45  105:astore_2        
		//*  46  106:aload_0         
		//*  47  107:invokevirtual   #51  <Method com.google.android.gms.dynamic.LifecycleDelegate getDelegate()>
		//*  48  110:checkcast       #76  <Class MapView$zza>
		//*  49  113:aload_2         
		//*  50  114:invokevirtual   #107 <Method void MapView$zza.getMapAsync(OnMapReadyCallback)>
		//*  51  117:goto            87
		//*  52  120:aload_0         
		//*  53  121:getfield        #31  <Field List zzbe>
		//*  54  124:invokeinterface #110 <Method void List.clear()>
		//*  55  129:return          
			// Misplaced declaration of an exception variable
			catch(OnDelegateCreatedListener ondelegatecreatedlistener)
		//*  56  130:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (ondelegatecreatedlistener)));
		//   57  131:new             #112 <Class RuntimeRemoteException>
		//   58  134:dup             
		//   59  135:aload_1         
		//   60  136:invokespecial   #115 <Method void RuntimeRemoteException(RemoteException)>
		//   61  139:athrow          
			}
		//*  62  140:return          
			// Misplaced declaration of an exception variable
			catch(OnDelegateCreatedListener ondelegatecreatedlistener)
		//*  63  141:astore_1        
			{
				return;
		//   64  142:return          
			}
			if(ondelegatecreatedlistener == null)
				return;
			zzbc.onDelegateCreated(((com.google.android.gms.dynamic.LifecycleDelegate) (new zza(zzbi, ((IMapViewDelegate) (ondelegatecreatedlistener))))));
			for(ondelegatecreatedlistener = ((OnDelegateCreatedListener) (zzbe.iterator())); ((Iterator) (ondelegatecreatedlistener)).hasNext(); ((zza)getDelegate()).getMapAsync(onmapreadycallback))
				onmapreadycallback = (OnMapReadyCallback)((Iterator) (ondelegatecreatedlistener)).next();

			zzbe.clear();
			return;
		}

		public final void getMapAsync(OnMapReadyCallback onmapreadycallback)
		{
			if(getDelegate() != null)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #51  <Method com.google.android.gms.dynamic.LifecycleDelegate getDelegate()>
		//*   2    4:ifnull          19
			{
				((zza)getDelegate()).getMapAsync(onmapreadycallback);
		//    3    7:aload_0         
		//    4    8:invokevirtual   #51  <Method com.google.android.gms.dynamic.LifecycleDelegate getDelegate()>
		//    5   11:checkcast       #76  <Class MapView$zza>
		//    6   14:aload_1         
		//    7   15:invokevirtual   #107 <Method void MapView$zza.getMapAsync(OnMapReadyCallback)>
				return;
		//    8   18:return          
			} else
			{
				zzbe.add(((Object) (onmapreadycallback)));
		//    9   19:aload_0         
		//   10   20:getfield        #31  <Field List zzbe>
		//   11   23:aload_1         
		//   12   24:invokeinterface #121 <Method boolean List.add(Object)>
		//   13   29:pop             
				return;
		//   14   30:return          
			}
		}

		private OnDelegateCreatedListener zzbc;
		private final List zzbe = new ArrayList();
		private final ViewGroup zzbi;
		private final Context zzbj;
		private final GoogleMapOptions zzbk;

		zzb(ViewGroup viewgroup, Context context, GoogleMapOptions googlemapoptions)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void DeferredLifecycleHelper()>
		//    2    4:aload_0         
		//    3    5:new             #28  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #29  <Method void ArrayList()>
		//    6   12:putfield        #31  <Field List zzbe>
			zzbi = viewgroup;
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:putfield        #33  <Field ViewGroup zzbi>
			zzbj = context;
		//   10   20:aload_0         
		//   11   21:aload_2         
		//   12   22:putfield        #35  <Field Context zzbj>
			zzbk = googlemapoptions;
		//   13   25:aload_0         
		//   14   26:aload_3         
		//   15   27:putfield        #37  <Field GoogleMapOptions zzbk>
		//   16   30:return          
		}
	}


	public MapView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void FrameLayout(Context)>
		zzbf = new zzb(((ViewGroup) (this)), context, ((GoogleMapOptions) (null)));
	//    3    5:aload_0         
	//    4    6:new             #9   <Class MapView$zzb>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:aconst_null     
	//    9   13:invokespecial   #19  <Method void MapView$zzb(ViewGroup, Context, GoogleMapOptions)>
	//   10   16:putfield        #21  <Field MapView$zzb zzbf>
		setClickable(true);
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:invokevirtual   #25  <Method void setClickable(boolean)>
	//   14   24:return          
	}

	public MapView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #29  <Method void FrameLayout(Context, AttributeSet)>
		zzbf = new zzb(((ViewGroup) (this)), context, GoogleMapOptions.createFromAttributes(context, attributeset));
	//    4    6:aload_0         
	//    5    7:new             #9   <Class MapView$zzb>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:aload_1         
	//   10   14:aload_2         
	//   11   15:invokestatic    #35  <Method GoogleMapOptions GoogleMapOptions.createFromAttributes(Context, AttributeSet)>
	//   12   18:invokespecial   #19  <Method void MapView$zzb(ViewGroup, Context, GoogleMapOptions)>
	//   13   21:putfield        #21  <Field MapView$zzb zzbf>
		setClickable(true);
	//   14   24:aload_0         
	//   15   25:iconst_1        
	//   16   26:invokevirtual   #25  <Method void setClickable(boolean)>
	//   17   29:return          
	}

	public MapView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #38  <Method void FrameLayout(Context, AttributeSet, int)>
		zzbf = new zzb(((ViewGroup) (this)), context, GoogleMapOptions.createFromAttributes(context, attributeset));
	//    5    7:aload_0         
	//    6    8:new             #9   <Class MapView$zzb>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:aload_1         
	//   11   15:aload_2         
	//   12   16:invokestatic    #35  <Method GoogleMapOptions GoogleMapOptions.createFromAttributes(Context, AttributeSet)>
	//   13   19:invokespecial   #19  <Method void MapView$zzb(ViewGroup, Context, GoogleMapOptions)>
	//   14   22:putfield        #21  <Field MapView$zzb zzbf>
		setClickable(true);
	//   15   25:aload_0         
	//   16   26:iconst_1        
	//   17   27:invokevirtual   #25  <Method void setClickable(boolean)>
	//   18   30:return          
	}

	public MapView(Context context, GoogleMapOptions googlemapoptions)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void FrameLayout(Context)>
		zzbf = new zzb(((ViewGroup) (this)), context, googlemapoptions);
	//    3    5:aload_0         
	//    4    6:new             #9   <Class MapView$zzb>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:invokespecial   #19  <Method void MapView$zzb(ViewGroup, Context, GoogleMapOptions)>
	//   10   16:putfield        #21  <Field MapView$zzb zzbf>
		setClickable(true);
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:invokevirtual   #25  <Method void setClickable(boolean)>
	//   14   24:return          
	}

	public void getMapAsync(OnMapReadyCallback onmapreadycallback)
	{
		Preconditions.checkMainThread("getMapAsync() must be called on the main thread");
	//    0    0:ldc1            #43  <String "getMapAsync() must be called on the main thread">
	//    1    2:invokestatic    #49  <Method void Preconditions.checkMainThread(String)>
		zzbf.getMapAsync(onmapreadycallback);
	//    2    5:aload_0         
	//    3    6:getfield        #21  <Field MapView$zzb zzbf>
	//    4    9:aload_1         
	//    5   10:invokevirtual   #51  <Method void MapView$zzb.getMapAsync(OnMapReadyCallback)>
	//    6   13:return          
	}

	public final void onCreate(Bundle bundle)
	{
		android.os.StrictMode.ThreadPolicy threadpolicy;
		threadpolicy = StrictMode.getThreadPolicy();
	//    0    0:invokestatic    #59  <Method android.os.StrictMode$ThreadPolicy StrictMode.getThreadPolicy()>
	//    1    3:astore_2        
		StrictMode.setThreadPolicy((new android.os.StrictMode.ThreadPolicy.Builder(threadpolicy)).permitAll().build());
	//    2    4:new             #61  <Class android.os.StrictMode$ThreadPolicy$Builder>
	//    3    7:dup             
	//    4    8:aload_2         
	//    5    9:invokespecial   #64  <Method void android.os.StrictMode$ThreadPolicy$Builder(android.os.StrictMode$ThreadPolicy)>
	//    6   12:invokevirtual   #68  <Method android.os.StrictMode$ThreadPolicy$Builder android.os.StrictMode$ThreadPolicy$Builder.permitAll()>
	//    7   15:invokevirtual   #71  <Method android.os.StrictMode$ThreadPolicy android.os.StrictMode$ThreadPolicy$Builder.build()>
	//    8   18:invokestatic    #74  <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		zzbf.onCreate(bundle);
	//    9   21:aload_0         
	//   10   22:getfield        #21  <Field MapView$zzb zzbf>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #76  <Method void MapView$zzb.onCreate(Bundle)>
		if(zzbf.getDelegate() == null)
	//*  13   29:aload_0         
	//*  14   30:getfield        #21  <Field MapView$zzb zzbf>
	//*  15   33:invokevirtual   #80  <Method com.google.android.gms.dynamic.LifecycleDelegate MapView$zzb.getDelegate()>
	//*  16   36:ifnonnull       43
			DeferredLifecycleHelper.showGooglePlayUnavailableMessage(((FrameLayout) (this)));
	//   17   39:aload_0         
	//   18   40:invokestatic    #86  <Method void DeferredLifecycleHelper.showGooglePlayUnavailableMessage(FrameLayout)>
		StrictMode.setThreadPolicy(threadpolicy);
	//   19   43:aload_2         
	//   20   44:invokestatic    #74  <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		return;
	//   21   47:return          
		bundle;
	//   22   48:astore_1        
		StrictMode.setThreadPolicy(threadpolicy);
	//   23   49:aload_2         
	//   24   50:invokestatic    #74  <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		throw bundle;
	//   25   53:aload_1         
	//   26   54:athrow          
	}

	public final void onDestroy()
	{
		zzbf.onDestroy();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MapView$zzb zzbf>
	//    2    4:invokevirtual   #90  <Method void MapView$zzb.onDestroy()>
	//    3    7:return          
	}

	public final void onEnterAmbient(Bundle bundle)
	{
		Preconditions.checkMainThread("onEnterAmbient() must be called on the main thread");
	//    0    0:ldc1            #93  <String "onEnterAmbient() must be called on the main thread">
	//    1    2:invokestatic    #49  <Method void Preconditions.checkMainThread(String)>
		zzb zzb1 = zzbf;
	//    2    5:aload_0         
	//    3    6:getfield        #21  <Field MapView$zzb zzbf>
	//    4    9:astore_2        
		if(zzb1.getDelegate() != null)
	//*   5   10:aload_2         
	//*   6   11:invokevirtual   #80  <Method com.google.android.gms.dynamic.LifecycleDelegate MapView$zzb.getDelegate()>
	//*   7   14:ifnull          28
			((zza)zzb1.getDelegate()).onEnterAmbient(bundle);
	//    8   17:aload_2         
	//    9   18:invokevirtual   #80  <Method com.google.android.gms.dynamic.LifecycleDelegate MapView$zzb.getDelegate()>
	//   10   21:checkcast       #6   <Class MapView$zza>
	//   11   24:aload_1         
	//   12   25:invokevirtual   #95  <Method void MapView$zza.onEnterAmbient(Bundle)>
	//   13   28:return          
	}

	public final void onExitAmbient()
	{
		Preconditions.checkMainThread("onExitAmbient() must be called on the main thread");
	//    0    0:ldc1            #98  <String "onExitAmbient() must be called on the main thread">
	//    1    2:invokestatic    #49  <Method void Preconditions.checkMainThread(String)>
		zzb zzb1 = zzbf;
	//    2    5:aload_0         
	//    3    6:getfield        #21  <Field MapView$zzb zzbf>
	//    4    9:astore_1        
		if(zzb1.getDelegate() != null)
	//*   5   10:aload_1         
	//*   6   11:invokevirtual   #80  <Method com.google.android.gms.dynamic.LifecycleDelegate MapView$zzb.getDelegate()>
	//*   7   14:ifnull          27
			((zza)zzb1.getDelegate()).onExitAmbient();
	//    8   17:aload_1         
	//    9   18:invokevirtual   #80  <Method com.google.android.gms.dynamic.LifecycleDelegate MapView$zzb.getDelegate()>
	//   10   21:checkcast       #6   <Class MapView$zza>
	//   11   24:invokevirtual   #100 <Method void MapView$zza.onExitAmbient()>
	//   12   27:return          
	}

	public final void onLowMemory()
	{
		zzbf.onLowMemory();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MapView$zzb zzbf>
	//    2    4:invokevirtual   #103 <Method void MapView$zzb.onLowMemory()>
	//    3    7:return          
	}

	public final void onPause()
	{
		zzbf.onPause();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MapView$zzb zzbf>
	//    2    4:invokevirtual   #106 <Method void MapView$zzb.onPause()>
	//    3    7:return          
	}

	public final void onResume()
	{
		zzbf.onResume();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MapView$zzb zzbf>
	//    2    4:invokevirtual   #109 <Method void MapView$zzb.onResume()>
	//    3    7:return          
	}

	public final void onSaveInstanceState(Bundle bundle)
	{
		zzbf.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MapView$zzb zzbf>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #112 <Method void MapView$zzb.onSaveInstanceState(Bundle)>
	//    4    8:return          
	}

	public final void onStart()
	{
		zzbf.onStart();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MapView$zzb zzbf>
	//    2    4:invokevirtual   #115 <Method void MapView$zzb.onStart()>
	//    3    7:return          
	}

	public final void onStop()
	{
		zzbf.onStop();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MapView$zzb zzbf>
	//    2    4:invokevirtual   #118 <Method void MapView$zzb.onStop()>
	//    3    7:return          
	}

	private final zzb zzbf;
}
