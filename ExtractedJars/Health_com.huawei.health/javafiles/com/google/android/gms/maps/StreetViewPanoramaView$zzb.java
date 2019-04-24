// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.*;
import com.google.android.gms.maps.internal.zzai;
import com.google.android.gms.maps.internal.zzc;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.*;

// Referenced classes of package com.google.android.gms.maps:
//			StreetViewPanoramaView, OnStreetViewPanoramaReadyCallback, StreetViewPanoramaOptions

static class StreetViewPanoramaView$zzb extends zza
{

	public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
	{
		if(zzBN() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #43  <Method com.google.android.gms.dynamic.LifecycleDelegate zzBN()>
	//*   2    4:ifnull          19
		{
			((StreetViewPanoramaView$zza)zzBN()).getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback);
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
			com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate istreetviewpanoramaviewdelegate = zzai.zzbI(mContext).zza(zzd.zzA(((Object) (mContext))), zzboT);
	//    6   14:aload_0         
	//    7   15:getfield        #34  <Field Context mContext>
	//    8   18:invokestatic    #66  <Method zzc zzai.zzbI(Context)>
	//    9   21:aload_0         
	//   10   22:getfield        #34  <Field Context mContext>
	//   11   25:invokestatic    #72  <Method com.google.android.gms.dynamic.IObjectWrapper zzd.zzA(Object)>
	//   12   28:aload_0         
	//   13   29:getfield        #36  <Field StreetViewPanoramaOptions zzboT>
	//   14   32:invokeinterface #78  <Method com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate zzc.zza(com.google.android.gms.dynamic.IObjectWrapper, StreetViewPanoramaOptions)>
	//   15   37:astore_1        
			zzbor.zza(((com.google.android.gms.dynamic.LifecycleDelegate) (new StreetViewPanoramaView$zza(zzbox, istreetviewpanoramaviewdelegate))));
	//   16   38:aload_0         
	//   17   39:getfield        #60  <Field zze zzbor>
	//   18   42:new             #45  <Class StreetViewPanoramaView$zza>
	//   19   45:dup             
	//   20   46:aload_0         
	//   21   47:getfield        #32  <Field ViewGroup zzbox>
	//   22   50:aload_1         
	//   23   51:invokespecial   #81  <Method void StreetViewPanoramaView$zza(ViewGroup, com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate)>
	//   24   54:invokeinterface #86  <Method void zze.zza(com.google.android.gms.dynamic.LifecycleDelegate)>
			OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback;
			for(Iterator iterator = zzboI.iterator(); iterator.hasNext(); ((StreetViewPanoramaView$zza)zzBN()).getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback))
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

	StreetViewPanoramaView$zzb(ViewGroup viewgroup, Context context, StreetViewPanoramaOptions streetviewpanoramaoptions)
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
