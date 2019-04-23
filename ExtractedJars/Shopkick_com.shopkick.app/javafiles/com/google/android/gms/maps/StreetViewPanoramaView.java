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
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.internal.zzby;
import com.google.android.gms.maps.internal.zzbz;
import com.google.android.gms.maps.internal.zze;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.*;

// Referenced classes of package com.google.android.gms.maps:
//			StreetViewPanoramaOptions, OnStreetViewPanoramaReadyCallback, zzaj, MapsInitializer

public class StreetViewPanoramaView extends FrameLayout
{
	static final class zza
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

		public zza(ViewGroup viewgroup, IStreetViewPanoramaViewDelegate istreetviewpanoramaviewdelegate)
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

	static final class zzb extends DeferredLifecycleHelper
	{

		protected final void createDelegate(OnDelegateCreatedListener ondelegatecreatedlistener)
		{
			zzbc = ondelegatecreatedlistener;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #47  <Field OnDelegateCreatedListener zzbc>
			if(zzbc == null || getDelegate() != null)
				break MISSING_BLOCK_LABEL_135;
		//    3    5:aload_0         
		//    4    6:getfield        #47  <Field OnDelegateCreatedListener zzbc>
		//    5    9:ifnull          135
		//    6   12:aload_0         
		//    7   13:invokevirtual   #51  <Method com.google.android.gms.dynamic.LifecycleDelegate getDelegate()>
		//    8   16:ifnonnull       135
			try
			{
				MapsInitializer.initialize(zzbj);
		//    9   19:aload_0         
		//   10   20:getfield        #35  <Field Context zzbj>
		//   11   23:invokestatic    #57  <Method int MapsInitializer.initialize(Context)>
		//   12   26:pop             
				ondelegatecreatedlistener = ((OnDelegateCreatedListener) (zzbz.zza(zzbj).zza(ObjectWrapper.wrap(((Object) (zzbj))), zzcf)));
		//   13   27:aload_0         
		//   14   28:getfield        #35  <Field Context zzbj>
		//   15   31:invokestatic    #63  <Method zze zzbz.zza(Context)>
		//   16   34:aload_0         
		//   17   35:getfield        #35  <Field Context zzbj>
		//   18   38:invokestatic    #69  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
		//   19   41:aload_0         
		//   20   42:getfield        #37  <Field StreetViewPanoramaOptions zzcf>
		//   21   45:invokeinterface #74  <Method IStreetViewPanoramaViewDelegate zze.zza(com.google.android.gms.dynamic.IObjectWrapper, StreetViewPanoramaOptions)>
		//   22   50:astore_1        
				zzbc.onDelegateCreated(((com.google.android.gms.dynamic.LifecycleDelegate) (new zza(zzbi, ((IStreetViewPanoramaViewDelegate) (ondelegatecreatedlistener))))));
		//   23   51:aload_0         
		//   24   52:getfield        #47  <Field OnDelegateCreatedListener zzbc>
		//   25   55:new             #76  <Class StreetViewPanoramaView$zza>
		//   26   58:dup             
		//   27   59:aload_0         
		//   28   60:getfield        #33  <Field ViewGroup zzbi>
		//   29   63:aload_1         
		//   30   64:invokespecial   #79  <Method void StreetViewPanoramaView$zza(ViewGroup, IStreetViewPanoramaViewDelegate)>
		//   31   67:invokeinterface #85  <Method void OnDelegateCreatedListener.onDelegateCreated(com.google.android.gms.dynamic.LifecycleDelegate)>
				OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback;
				for(ondelegatecreatedlistener = ((OnDelegateCreatedListener) (zzbv.iterator())); ((Iterator) (ondelegatecreatedlistener)).hasNext(); ((zza)getDelegate()).getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback))
		//*  32   72:aload_0         
		//*  33   73:getfield        #31  <Field List zzbv>
		//*  34   76:invokeinterface #91  <Method Iterator List.iterator()>
		//*  35   81:astore_1        
		//*  36   82:aload_1         
		//*  37   83:invokeinterface #97  <Method boolean Iterator.hasNext()>
		//*  38   88:ifeq            115
					onstreetviewpanoramareadycallback = (OnStreetViewPanoramaReadyCallback)((Iterator) (ondelegatecreatedlistener)).next();
		//   39   91:aload_1         
		//   40   92:invokeinterface #101 <Method Object Iterator.next()>
		//   41   97:checkcast       #103 <Class OnStreetViewPanoramaReadyCallback>
		//   42  100:astore_2        

		//   43  101:aload_0         
		//   44  102:invokevirtual   #51  <Method com.google.android.gms.dynamic.LifecycleDelegate getDelegate()>
		//   45  105:checkcast       #76  <Class StreetViewPanoramaView$zza>
		//   46  108:aload_2         
		//   47  109:invokevirtual   #107 <Method void StreetViewPanoramaView$zza.getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback)>
			}
		//*  48  112:goto            82
		//*  49  115:aload_0         
		//*  50  116:getfield        #31  <Field List zzbv>
		//*  51  119:invokeinterface #110 <Method void List.clear()>
		//*  52  124:return          
			// Misplaced declaration of an exception variable
			catch(OnDelegateCreatedListener ondelegatecreatedlistener)
		//*  53  125:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (ondelegatecreatedlistener)));
		//   54  126:new             #112 <Class RuntimeRemoteException>
		//   55  129:dup             
		//   56  130:aload_1         
		//   57  131:invokespecial   #115 <Method void RuntimeRemoteException(RemoteException)>
		//   58  134:athrow          
			}
		//*  59  135:return          
			// Misplaced declaration of an exception variable
			catch(OnDelegateCreatedListener ondelegatecreatedlistener)
		//*  60  136:astore_1        
			{
				return;
		//   61  137:return          
			}
			zzbv.clear();
			return;
		}

		public final void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
		{
			if(getDelegate() != null)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #51  <Method com.google.android.gms.dynamic.LifecycleDelegate getDelegate()>
		//*   2    4:ifnull          19
			{
				((zza)getDelegate()).getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback);
		//    3    7:aload_0         
		//    4    8:invokevirtual   #51  <Method com.google.android.gms.dynamic.LifecycleDelegate getDelegate()>
		//    5   11:checkcast       #76  <Class StreetViewPanoramaView$zza>
		//    6   14:aload_1         
		//    7   15:invokevirtual   #107 <Method void StreetViewPanoramaView$zza.getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback)>
				return;
		//    8   18:return          
			} else
			{
				zzbv.add(((Object) (onstreetviewpanoramareadycallback)));
		//    9   19:aload_0         
		//   10   20:getfield        #31  <Field List zzbv>
		//   11   23:aload_1         
		//   12   24:invokeinterface #121 <Method boolean List.add(Object)>
		//   13   29:pop             
				return;
		//   14   30:return          
			}
		}

		private OnDelegateCreatedListener zzbc;
		private final ViewGroup zzbi;
		private final Context zzbj;
		private final List zzbv = new ArrayList();
		private final StreetViewPanoramaOptions zzcf;

		zzb(ViewGroup viewgroup, Context context, StreetViewPanoramaOptions streetviewpanoramaoptions)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void DeferredLifecycleHelper()>
		//    2    4:aload_0         
		//    3    5:new             #28  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #29  <Method void ArrayList()>
		//    6   12:putfield        #31  <Field List zzbv>
			zzbi = viewgroup;
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:putfield        #33  <Field ViewGroup zzbi>
			zzbj = context;
		//   10   20:aload_0         
		//   11   21:aload_2         
		//   12   22:putfield        #35  <Field Context zzbj>
			zzcf = streetviewpanoramaoptions;
		//   13   25:aload_0         
		//   14   26:aload_3         
		//   15   27:putfield        #37  <Field StreetViewPanoramaOptions zzcf>
		//   16   30:return          
		}
	}


	public StreetViewPanoramaView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void FrameLayout(Context)>
		zzcc = new zzb(((ViewGroup) (this)), context, ((StreetViewPanoramaOptions) (null)));
	//    3    5:aload_0         
	//    4    6:new             #9   <Class StreetViewPanoramaView$zzb>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:aconst_null     
	//    9   13:invokespecial   #19  <Method void StreetViewPanoramaView$zzb(ViewGroup, Context, StreetViewPanoramaOptions)>
	//   10   16:putfield        #21  <Field StreetViewPanoramaView$zzb zzcc>
	//   11   19:return          
	}

	public StreetViewPanoramaView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #25  <Method void FrameLayout(Context, AttributeSet)>
		zzcc = new zzb(((ViewGroup) (this)), context, ((StreetViewPanoramaOptions) (null)));
	//    4    6:aload_0         
	//    5    7:new             #9   <Class StreetViewPanoramaView$zzb>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:aconst_null     
	//   10   14:invokespecial   #19  <Method void StreetViewPanoramaView$zzb(ViewGroup, Context, StreetViewPanoramaOptions)>
	//   11   17:putfield        #21  <Field StreetViewPanoramaView$zzb zzcc>
	//   12   20:return          
	}

	public StreetViewPanoramaView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #28  <Method void FrameLayout(Context, AttributeSet, int)>
		zzcc = new zzb(((ViewGroup) (this)), context, ((StreetViewPanoramaOptions) (null)));
	//    5    7:aload_0         
	//    6    8:new             #9   <Class StreetViewPanoramaView$zzb>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:aconst_null     
	//   11   15:invokespecial   #19  <Method void StreetViewPanoramaView$zzb(ViewGroup, Context, StreetViewPanoramaOptions)>
	//   12   18:putfield        #21  <Field StreetViewPanoramaView$zzb zzcc>
	//   13   21:return          
	}

	public StreetViewPanoramaView(Context context, StreetViewPanoramaOptions streetviewpanoramaoptions)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void FrameLayout(Context)>
		zzcc = new zzb(((ViewGroup) (this)), context, streetviewpanoramaoptions);
	//    3    5:aload_0         
	//    4    6:new             #9   <Class StreetViewPanoramaView$zzb>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:invokespecial   #19  <Method void StreetViewPanoramaView$zzb(ViewGroup, Context, StreetViewPanoramaOptions)>
	//   10   16:putfield        #21  <Field StreetViewPanoramaView$zzb zzcc>
	//   11   19:return          
	}

	public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
	{
		Preconditions.checkMainThread("getStreetViewPanoramaAsync() must be called on the main thread");
	//    0    0:ldc1            #33  <String "getStreetViewPanoramaAsync() must be called on the main thread">
	//    1    2:invokestatic    #39  <Method void Preconditions.checkMainThread(String)>
		zzcc.getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback);
	//    2    5:aload_0         
	//    3    6:getfield        #21  <Field StreetViewPanoramaView$zzb zzcc>
	//    4    9:aload_1         
	//    5   10:invokevirtual   #41  <Method void StreetViewPanoramaView$zzb.getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback)>
	//    6   13:return          
	}

	public final void onCreate(Bundle bundle)
	{
		android.os.StrictMode.ThreadPolicy threadpolicy;
		threadpolicy = StrictMode.getThreadPolicy();
	//    0    0:invokestatic    #49  <Method android.os.StrictMode$ThreadPolicy StrictMode.getThreadPolicy()>
	//    1    3:astore_2        
		StrictMode.setThreadPolicy((new android.os.StrictMode.ThreadPolicy.Builder(threadpolicy)).permitAll().build());
	//    2    4:new             #51  <Class android.os.StrictMode$ThreadPolicy$Builder>
	//    3    7:dup             
	//    4    8:aload_2         
	//    5    9:invokespecial   #54  <Method void android.os.StrictMode$ThreadPolicy$Builder(android.os.StrictMode$ThreadPolicy)>
	//    6   12:invokevirtual   #58  <Method android.os.StrictMode$ThreadPolicy$Builder android.os.StrictMode$ThreadPolicy$Builder.permitAll()>
	//    7   15:invokevirtual   #61  <Method android.os.StrictMode$ThreadPolicy android.os.StrictMode$ThreadPolicy$Builder.build()>
	//    8   18:invokestatic    #64  <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		zzcc.onCreate(bundle);
	//    9   21:aload_0         
	//   10   22:getfield        #21  <Field StreetViewPanoramaView$zzb zzcc>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #66  <Method void StreetViewPanoramaView$zzb.onCreate(Bundle)>
		if(zzcc.getDelegate() == null)
	//*  13   29:aload_0         
	//*  14   30:getfield        #21  <Field StreetViewPanoramaView$zzb zzcc>
	//*  15   33:invokevirtual   #70  <Method com.google.android.gms.dynamic.LifecycleDelegate StreetViewPanoramaView$zzb.getDelegate()>
	//*  16   36:ifnonnull       43
			DeferredLifecycleHelper.showGooglePlayUnavailableMessage(((FrameLayout) (this)));
	//   17   39:aload_0         
	//   18   40:invokestatic    #76  <Method void DeferredLifecycleHelper.showGooglePlayUnavailableMessage(FrameLayout)>
		StrictMode.setThreadPolicy(threadpolicy);
	//   19   43:aload_2         
	//   20   44:invokestatic    #64  <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		return;
	//   21   47:return          
		bundle;
	//   22   48:astore_1        
		StrictMode.setThreadPolicy(threadpolicy);
	//   23   49:aload_2         
	//   24   50:invokestatic    #64  <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		throw bundle;
	//   25   53:aload_1         
	//   26   54:athrow          
	}

	public void onDestroy()
	{
		zzcc.onDestroy();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field StreetViewPanoramaView$zzb zzcc>
	//    2    4:invokevirtual   #80  <Method void StreetViewPanoramaView$zzb.onDestroy()>
	//    3    7:return          
	}

	public final void onLowMemory()
	{
		zzcc.onLowMemory();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field StreetViewPanoramaView$zzb zzcc>
	//    2    4:invokevirtual   #83  <Method void StreetViewPanoramaView$zzb.onLowMemory()>
	//    3    7:return          
	}

	public final void onPause()
	{
		zzcc.onPause();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field StreetViewPanoramaView$zzb zzcc>
	//    2    4:invokevirtual   #86  <Method void StreetViewPanoramaView$zzb.onPause()>
	//    3    7:return          
	}

	public void onResume()
	{
		zzcc.onResume();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field StreetViewPanoramaView$zzb zzcc>
	//    2    4:invokevirtual   #89  <Method void StreetViewPanoramaView$zzb.onResume()>
	//    3    7:return          
	}

	public final void onSaveInstanceState(Bundle bundle)
	{
		zzcc.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field StreetViewPanoramaView$zzb zzcc>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #92  <Method void StreetViewPanoramaView$zzb.onSaveInstanceState(Bundle)>
	//    4    8:return          
	}

	public void onStart()
	{
		zzcc.onStart();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field StreetViewPanoramaView$zzb zzcc>
	//    2    4:invokevirtual   #95  <Method void StreetViewPanoramaView$zzb.onStart()>
	//    3    7:return          
	}

	public void onStop()
	{
		zzcc.onStop();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field StreetViewPanoramaView$zzb zzcc>
	//    2    4:invokevirtual   #98  <Method void StreetViewPanoramaView$zzb.onStop()>
	//    3    7:return          
	}

	private final zzb zzcc;
}
