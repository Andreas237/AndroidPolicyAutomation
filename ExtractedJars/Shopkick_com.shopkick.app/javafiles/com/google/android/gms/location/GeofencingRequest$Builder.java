// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.location.zzbh;
import java.util.*;

// Referenced classes of package com.google.android.gms.location:
//			GeofencingRequest, Geofence

public static final class GeofencingRequest$Builder
{

	public final GeofencingRequest$Builder addGeofence(Geofence geofence)
	{
		Preconditions.checkNotNull(((Object) (geofence)), "geofence can't be null.");
	//    0    0:aload_1         
	//    1    1:ldc1            #34  <String "geofence can't be null.">
	//    2    3:invokestatic    #40  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		Preconditions.checkArgument(geofence instanceof zzbh, "Geofence must be created using Geofence.Builder.");
	//    4    7:aload_1         
	//    5    8:instanceof      #42  <Class zzbh>
	//    6   11:ldc1            #44  <String "Geofence must be created using Geofence.Builder.">
	//    7   13:invokestatic    #48  <Method void Preconditions.checkArgument(boolean, Object)>
		zzap.add(((Object) ((zzbh)geofence)));
	//    8   16:aload_0         
	//    9   17:getfield        #23  <Field List zzap>
	//   10   20:aload_1         
	//   11   21:checkcast       #42  <Class zzbh>
	//   12   24:invokeinterface #54  <Method boolean List.add(Object)>
	//   13   29:pop             
		return this;
	//   14   30:aload_0         
	//   15   31:areturn         
	}

	public final GeofencingRequest$Builder addGeofences(List list)
	{
		if(list != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          54
		{
			if(list.isEmpty())
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #60  <Method boolean List.isEmpty()>
	//*   4   10:ifeq            15
				return this;
	//    5   13:aload_0         
	//    6   14:areturn         
			list = ((List) (list.iterator()));
	//    7   15:aload_1         
	//    8   16:invokeinterface #64  <Method Iterator List.iterator()>
	//    9   21:astore_1        
			do
			{
				if(!((Iterator) (list)).hasNext())
					break;
	//   10   22:aload_1         
	//   11   23:invokeinterface #69  <Method boolean Iterator.hasNext()>
	//   12   28:ifeq            54
				Geofence geofence = (Geofence)((Iterator) (list)).next();
	//   13   31:aload_1         
	//   14   32:invokeinterface #73  <Method Object Iterator.next()>
	//   15   37:checkcast       #75  <Class Geofence>
	//   16   40:astore_2        
				if(geofence != null)
	//*  17   41:aload_2         
	//*  18   42:ifnull          22
					addGeofence(geofence);
	//   19   45:aload_0         
	//   20   46:aload_2         
	//   21   47:invokevirtual   #77  <Method GeofencingRequest$Builder addGeofence(Geofence)>
	//   22   50:pop             
			} while(true);
	//   23   51:goto            22
		}
		return this;
	//   24   54:aload_0         
	//   25   55:areturn         
	}

	public final GeofencingRequest build()
	{
		Preconditions.checkArgument(zzap.isEmpty() ^ true, "No geofence has been added to this request.");
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field List zzap>
	//    2    4:invokeinterface #60  <Method boolean List.isEmpty()>
	//    3    9:iconst_1        
	//    4   10:ixor            
	//    5   11:ldc1            #83  <String "No geofence has been added to this request.">
	//    6   13:invokestatic    #48  <Method void Preconditions.checkArgument(boolean, Object)>
		return new GeofencingRequest(zzap, zzaq, tag);
	//    7   16:new             #6   <Class GeofencingRequest>
	//    8   19:dup             
	//    9   20:aload_0         
	//   10   21:getfield        #23  <Field List zzap>
	//   11   24:aload_0         
	//   12   25:getfield        #25  <Field int zzaq>
	//   13   28:aload_0         
	//   14   29:getfield        #29  <Field String tag>
	//   15   32:invokespecial   #86  <Method void GeofencingRequest(List, int, String)>
	//   16   35:areturn         
	}

	public final GeofencingRequest$Builder setInitialTrigger(int i)
	{
		zzaq = i & 7;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:bipush          7
	//    3    4:iand            
	//    4    5:putfield        #25  <Field int zzaq>
		return this;
	//    5    8:aload_0         
	//    6    9:areturn         
	}

	private String tag;
	private final List zzap = new ArrayList();
	private int zzaq;

	public GeofencingRequest$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #20  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void ArrayList()>
	//    6   12:putfield        #23  <Field List zzap>
		zzaq = 5;
	//    7   15:aload_0         
	//    8   16:iconst_5        
	//    9   17:putfield        #25  <Field int zzaq>
		tag = "";
	//   10   20:aload_0         
	//   11   21:ldc1            #27  <String "">
	//   12   23:putfield        #29  <Field String tag>
	//   13   26:return          
	}
}
