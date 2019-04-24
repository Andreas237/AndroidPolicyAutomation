// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.*;
import android.widget.FrameLayout;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.dynamic.*;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.internal.zzah;
import com.google.android.gms.maps.internal.zzai;
import com.google.android.gms.maps.internal.zzc;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.*;

// Referenced classes of package com.google.android.gms.maps:
//			StreetViewPanoramaOptions, OnStreetViewPanoramaReadyCallback, StreetViewPanorama

public class StreetViewPanoramaView extends FrameLayout
{
	static class zza
		implements StreetViewLifecycleDelegate
	{

		public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
		{
			try
			{
				zzboR.getStreetViewPanoramaAsync(((com.google.android.gms.maps.internal.zzaf) (new com.google.android.gms.maps.internal.zzaf.zza(this, onstreetviewpanoramareadycallback) {

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

		public zza(ViewGroup viewgroup, IStreetViewPanoramaViewDelegate istreetviewpanoramaviewdelegate)
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

	static class zzb extends com.google.android.gms.dynamic.zza
	{

		public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
		{
			if(zzBN() != null)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #43  <Method com.google.android.gms.dynamic.LifecycleDelegate zzBN()>
		//*   2    4:ifnull          19
			{
				((zza)zzBN()).getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback);
		//    3    7:aload_0         
		//    4    8:invokevirtual   #43  <Method com.google.android.gms.dynamic.LifecycleDelegate zzBN()>
		//    5   11:checkcast       #45  <Class StreetViewPanoramaView$zza>
		//    6   14:aload_1         
		//    7   15:invokevirtual   #47  <Method void StreetViewPanoramaView$zza.getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback)>
				return;
		//    8   18:return          
			} else
			{
				zzboI.add(((Object) (onstreetviewpanoramareadycallback)));
		//    9   19:aload_0         
		//   10   20:getfield        #30  <Field List zzboI>
		//   11   23:aload_1         
		//   12   24:invokeinterface #53  <Method boolean List.add(Object)>
		//   13   29:pop             
				return;
		//   14   30:return          
			}
		}

		public void zzJz()
		{
			if(zzbor == null || zzBN() != null)
				break MISSING_BLOCK_LABEL_122;
		//    0    0:aload_0         
		//    1    1:getfield        #60  <Field zze zzbor>
		//    2    4:ifnull          122
		//    3    7:aload_0         
		//    4    8:invokevirtual   #43  <Method com.google.android.gms.dynamic.LifecycleDelegate zzBN()>
		//    5   11:ifnonnull       122
			try
			{
				IStreetViewPanoramaViewDelegate istreetviewpanoramaviewdelegate = zzai.zzbI(mContext).zza(zzd.zzA(((Object) (mContext))), zzboT);
		//    6   14:aload_0         
		//    7   15:getfield        #34  <Field Context mContext>
		//    8   18:invokestatic    #66  <Method zzc zzai.zzbI(Context)>
		//    9   21:aload_0         
		//   10   22:getfield        #34  <Field Context mContext>
		//   11   25:invokestatic    #72  <Method com.google.android.gms.dynamic.IObjectWrapper zzd.zzA(Object)>
		//   12   28:aload_0         
		//   13   29:getfield        #36  <Field StreetViewPanoramaOptions zzboT>
		//   14   32:invokeinterface #78  <Method IStreetViewPanoramaViewDelegate zzc.zza(com.google.android.gms.dynamic.IObjectWrapper, StreetViewPanoramaOptions)>
		//   15   37:astore_1        
				zzbor.zza(((com.google.android.gms.dynamic.LifecycleDelegate) (new zza(zzbox, istreetviewpanoramaviewdelegate))));
		//   16   38:aload_0         
		//   17   39:getfield        #60  <Field zze zzbor>
		//   18   42:new             #45  <Class StreetViewPanoramaView$zza>
		//   19   45:dup             
		//   20   46:aload_0         
		//   21   47:getfield        #32  <Field ViewGroup zzbox>
		//   22   50:aload_1         
		//   23   51:invokespecial   #81  <Method void StreetViewPanoramaView$zza(ViewGroup, IStreetViewPanoramaViewDelegate)>
		//   24   54:invokeinterface #86  <Method void zze.zza(com.google.android.gms.dynamic.LifecycleDelegate)>
				OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback;
				for(Iterator iterator = zzboI.iterator(); iterator.hasNext(); ((zza)zzBN()).getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback))
		//*  25   59:aload_0         
		//*  26   60:getfield        #30  <Field List zzboI>
		//*  27   63:invokeinterface #90  <Method Iterator List.iterator()>
		//*  28   68:astore_1        
		//*  29   69:aload_1         
		//*  30   70:invokeinterface #96  <Method boolean Iterator.hasNext()>
		//*  31   75:ifeq            102
					onstreetviewpanoramareadycallback = (OnStreetViewPanoramaReadyCallback)iterator.next();
		//   32   78:aload_1         
		//   33   79:invokeinterface #100 <Method Object Iterator.next()>
		//   34   84:checkcast       #102 <Class OnStreetViewPanoramaReadyCallback>
		//   35   87:astore_2        

		//   36   88:aload_0         
		//   37   89:invokevirtual   #43  <Method com.google.android.gms.dynamic.LifecycleDelegate zzBN()>
		//   38   92:checkcast       #45  <Class StreetViewPanoramaView$zza>
		//   39   95:aload_2         
		//   40   96:invokevirtual   #47  <Method void StreetViewPanoramaView$zza.getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback)>
			}
		//*  41   99:goto            69
		//*  42  102:aload_0         
		//*  43  103:getfield        #30  <Field List zzboI>
		//*  44  106:invokeinterface #105 <Method void List.clear()>
		//*  45  111:return          
			catch(RemoteException remoteexception)
		//*  46  112:astore_1        
			{
				throw new RuntimeRemoteException(remoteexception);
		//   47  113:new             #107 <Class RuntimeRemoteException>
		//   48  116:dup             
		//   49  117:aload_1         
		//   50  118:invokespecial   #110 <Method void RuntimeRemoteException(RemoteException)>
		//   51  121:athrow          
			}
		//*  52  122:return          
			catch(GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception)
		//*  53  123:astore_1        
			{
				return;
		//   54  124:return          
			}
			zzboI.clear();
			return;
		}

		public void zza(zze zze1)
		{
			zzbor = zze1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #60  <Field zze zzbor>
			zzJz();
		//    3    5:aload_0         
		//    4    6:invokevirtual   #113 <Method void zzJz()>
		//    5    9:return          
		}

		private final Context mContext;
		private final List zzboI = new ArrayList();
		private final StreetViewPanoramaOptions zzboT;
		protected zze zzbor;
		private final ViewGroup zzbox;

		zzb(ViewGroup viewgroup, Context context, StreetViewPanoramaOptions streetviewpanoramaoptions)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void zza()>
		//    2    4:aload_0         
		//    3    5:new             #27  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #28  <Method void ArrayList()>
		//    6   12:putfield        #30  <Field List zzboI>
			zzbox = viewgroup;
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:putfield        #32  <Field ViewGroup zzbox>
			mContext = context;
		//   10   20:aload_0         
		//   11   21:aload_2         
		//   12   22:putfield        #34  <Field Context mContext>
			zzboT = streetviewpanoramaoptions;
		//   13   25:aload_0         
		//   14   26:aload_3         
		//   15   27:putfield        #36  <Field StreetViewPanoramaOptions zzboT>
		//   16   30:return          
		}
	}


	public StreetViewPanoramaView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void FrameLayout(Context)>
		zzboQ = new zzb(((ViewGroup) (this)), context, ((StreetViewPanoramaOptions) (null)));
	//    3    5:aload_0         
	//    4    6:new             #11  <Class StreetViewPanoramaView$zzb>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:aconst_null     
	//    9   13:invokespecial   #21  <Method void StreetViewPanoramaView$zzb(ViewGroup, Context, StreetViewPanoramaOptions)>
	//   10   16:putfield        #23  <Field StreetViewPanoramaView$zzb zzboQ>
	//   11   19:return          
	}

	public StreetViewPanoramaView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #27  <Method void FrameLayout(Context, AttributeSet)>
		zzboQ = new zzb(((ViewGroup) (this)), context, ((StreetViewPanoramaOptions) (null)));
	//    4    6:aload_0         
	//    5    7:new             #11  <Class StreetViewPanoramaView$zzb>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:aconst_null     
	//   10   14:invokespecial   #21  <Method void StreetViewPanoramaView$zzb(ViewGroup, Context, StreetViewPanoramaOptions)>
	//   11   17:putfield        #23  <Field StreetViewPanoramaView$zzb zzboQ>
	//   12   20:return          
	}

	public StreetViewPanoramaView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #30  <Method void FrameLayout(Context, AttributeSet, int)>
		zzboQ = new zzb(((ViewGroup) (this)), context, ((StreetViewPanoramaOptions) (null)));
	//    5    7:aload_0         
	//    6    8:new             #11  <Class StreetViewPanoramaView$zzb>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:aconst_null     
	//   11   15:invokespecial   #21  <Method void StreetViewPanoramaView$zzb(ViewGroup, Context, StreetViewPanoramaOptions)>
	//   12   18:putfield        #23  <Field StreetViewPanoramaView$zzb zzboQ>
	//   13   21:return          
	}

	public StreetViewPanoramaView(Context context, StreetViewPanoramaOptions streetviewpanoramaoptions)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void FrameLayout(Context)>
		zzboQ = new zzb(((ViewGroup) (this)), context, streetviewpanoramaoptions);
	//    3    5:aload_0         
	//    4    6:new             #11  <Class StreetViewPanoramaView$zzb>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:invokespecial   #21  <Method void StreetViewPanoramaView$zzb(ViewGroup, Context, StreetViewPanoramaOptions)>
	//   10   16:putfield        #23  <Field StreetViewPanoramaView$zzb zzboQ>
	//   11   19:return          
	}

	public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
	{
		zzac.zzdj("getStreetViewPanoramaAsync() must be called on the main thread");
	//    0    0:ldc1            #35  <String "getStreetViewPanoramaAsync() must be called on the main thread">
	//    1    2:invokestatic    #41  <Method void zzac.zzdj(String)>
		zzboQ.getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback);
	//    2    5:aload_0         
	//    3    6:getfield        #23  <Field StreetViewPanoramaView$zzb zzboQ>
	//    4    9:aload_1         
	//    5   10:invokevirtual   #43  <Method void StreetViewPanoramaView$zzb.getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback)>
	//    6   13:return          
	}

	public final void onCreate(Bundle bundle)
	{
		zzboQ.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field StreetViewPanoramaView$zzb zzboQ>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #47  <Method void StreetViewPanoramaView$zzb.onCreate(Bundle)>
		if(zzboQ.zzBN() == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #23  <Field StreetViewPanoramaView$zzb zzboQ>
	//*   6   12:invokevirtual   #51  <Method com.google.android.gms.dynamic.LifecycleDelegate StreetViewPanoramaView$zzb.zzBN()>
	//*   7   15:ifnonnull       22
			com.google.android.gms.dynamic.zza.zzb(((FrameLayout) (this)));
	//    8   18:aload_0         
	//    9   19:invokestatic    #56  <Method void zza.zzb(FrameLayout)>
	//   10   22:return          
	}

	public final void onDestroy()
	{
		zzboQ.onDestroy();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field StreetViewPanoramaView$zzb zzboQ>
	//    2    4:invokevirtual   #60  <Method void StreetViewPanoramaView$zzb.onDestroy()>
	//    3    7:return          
	}

	public final void onLowMemory()
	{
		zzboQ.onLowMemory();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field StreetViewPanoramaView$zzb zzboQ>
	//    2    4:invokevirtual   #63  <Method void StreetViewPanoramaView$zzb.onLowMemory()>
	//    3    7:return          
	}

	public final void onPause()
	{
		zzboQ.onPause();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field StreetViewPanoramaView$zzb zzboQ>
	//    2    4:invokevirtual   #66  <Method void StreetViewPanoramaView$zzb.onPause()>
	//    3    7:return          
	}

	public final void onResume()
	{
		zzboQ.onResume();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field StreetViewPanoramaView$zzb zzboQ>
	//    2    4:invokevirtual   #69  <Method void StreetViewPanoramaView$zzb.onResume()>
	//    3    7:return          
	}

	public final void onSaveInstanceState(Bundle bundle)
	{
		zzboQ.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field StreetViewPanoramaView$zzb zzboQ>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #72  <Method void StreetViewPanoramaView$zzb.onSaveInstanceState(Bundle)>
	//    4    8:return          
	}

	private final zzb zzboQ;
}
