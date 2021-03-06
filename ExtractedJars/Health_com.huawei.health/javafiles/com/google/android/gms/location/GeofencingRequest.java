// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.internal.zzasm;
import java.util.*;

// Referenced classes of package com.google.android.gms.location:
//			zzi, Geofence

public class GeofencingRequest extends zza
{
	public static final class Builder
	{

		public static int zzkh(int i)
		{
			return i & 7;
		//    0    0:iload_0         
		//    1    1:bipush          7
		//    2    3:iand            
		//    3    4:ireturn         
		}

		public Builder addGeofence(Geofence geofence)
		{
			zzac.zzb(((Object) (geofence)), "geofence can't be null.");
		//    0    0:aload_1         
		//    1    1:ldc1            #36  <String "geofence can't be null.">
		//    2    3:invokestatic    #42  <Method Object zzac.zzb(Object, Object)>
		//    3    6:pop             
			zzac.zzb(geofence instanceof zzasm, "Geofence must be created using Geofence.Builder.");
		//    4    7:aload_1         
		//    5    8:instanceof      #44  <Class zzasm>
		//    6   11:ldc1            #46  <String "Geofence must be created using Geofence.Builder.">
		//    7   13:invokestatic    #49  <Method void zzac.zzb(boolean, Object)>
			zzbjO.add(((Object) ((zzasm)geofence)));
		//    8   16:aload_0         
		//    9   17:getfield        #23  <Field List zzbjO>
		//   10   20:aload_1         
		//   11   21:checkcast       #44  <Class zzasm>
		//   12   24:invokeinterface #55  <Method boolean List.add(Object)>
		//   13   29:pop             
			return this;
		//   14   30:aload_0         
		//   15   31:areturn         
		}

		public Builder addGeofences(List list)
		{
			if(list == null || list.isEmpty())
		//*   0    0:aload_1         
		//*   1    1:ifnull          13
		//*   2    4:aload_1         
		//*   3    5:invokeinterface #61  <Method boolean List.isEmpty()>
		//*   4   10:ifeq            15
				return this;
		//    5   13:aload_0         
		//    6   14:areturn         
			list = ((List) (list.iterator()));
		//    7   15:aload_1         
		//    8   16:invokeinterface #65  <Method Iterator List.iterator()>
		//    9   21:astore_1        
			do
			{
				if(!((Iterator) (list)).hasNext())
					break;
		//   10   22:aload_1         
		//   11   23:invokeinterface #70  <Method boolean Iterator.hasNext()>
		//   12   28:ifeq            54
				Geofence geofence = (Geofence)((Iterator) (list)).next();
		//   13   31:aload_1         
		//   14   32:invokeinterface #74  <Method Object Iterator.next()>
		//   15   37:checkcast       #76  <Class Geofence>
		//   16   40:astore_2        
				if(geofence != null)
		//*  17   41:aload_2         
		//*  18   42:ifnull          51
					addGeofence(geofence);
		//   19   45:aload_0         
		//   20   46:aload_2         
		//   21   47:invokevirtual   #78  <Method GeofencingRequest$Builder addGeofence(Geofence)>
		//   22   50:pop             
			} while(true);
		//   23   51:goto            22
			return this;
		//   24   54:aload_0         
		//   25   55:areturn         
		}

		public GeofencingRequest build()
		{
			boolean flag;
			if(!zzbjO.isEmpty())
		//*   0    0:aload_0         
		//*   1    1:getfield        #23  <Field List zzbjO>
		//*   2    4:invokeinterface #61  <Method boolean List.isEmpty()>
		//*   3    9:ifne            17
				flag = true;
		//    4   12:iconst_1        
		//    5   13:istore_1        
			else
		//*   6   14:goto            19
				flag = false;
		//    7   17:iconst_0        
		//    8   18:istore_1        
			zzac.zzb(flag, "No geofence has been added to this request.");
		//    9   19:iload_1         
		//   10   20:ldc1            #84  <String "No geofence has been added to this request.">
		//   11   22:invokestatic    #49  <Method void zzac.zzb(boolean, Object)>
			return new GeofencingRequest(zzbjO, zzbjP, mTag);
		//   12   25:new             #6   <Class GeofencingRequest>
		//   13   28:dup             
		//   14   29:aload_0         
		//   15   30:getfield        #23  <Field List zzbjO>
		//   16   33:aload_0         
		//   17   34:getfield        #25  <Field int zzbjP>
		//   18   37:aload_0         
		//   19   38:getfield        #29  <Field String mTag>
		//   20   41:invokespecial   #87  <Method void GeofencingRequest(List, int, String)>
		//   21   44:areturn         
		}

		public Builder setInitialTrigger(int i)
		{
			zzbjP = zzkh(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokestatic    #91  <Method int zzkh(int)>
		//    3    5:putfield        #25  <Field int zzbjP>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		private String mTag;
		private final List zzbjO = new ArrayList();
		private int zzbjP;

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #20  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #21  <Method void ArrayList()>
		//    6   12:putfield        #23  <Field List zzbjO>
			zzbjP = 5;
		//    7   15:aload_0         
		//    8   16:iconst_5        
		//    9   17:putfield        #25  <Field int zzbjP>
			mTag = "";
		//   10   20:aload_0         
		//   11   21:ldc1            #27  <String "">
		//   12   23:putfield        #29  <Field String mTag>
		//   13   26:return          
		}
	}


	GeofencingRequest(List list, int i, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void zza()>
		zzbjO = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #37  <Field List zzbjO>
		zzbjP = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #39  <Field int zzbjP>
		mTag = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #41  <Field String mTag>
	//   11   19:return          
	}

	public List getGeofences()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #47  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #48  <Method void ArrayList()>
	//    3    7:astore_1        
		((List) (arraylist)).addAll(((java.util.Collection) (zzbjO)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #37  <Field List zzbjO>
	//    7   13:invokeinterface #54  <Method boolean List.addAll(java.util.Collection)>
	//    8   18:pop             
		return ((List) (arraylist));
	//    9   19:aload_1         
	//   10   20:areturn         
	}

	public int getInitialTrigger()
	{
		return zzbjP;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int zzbjP>
	//    2    4:ireturn         
	}

	public String getTag()
	{
		return mTag;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field String mTag>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.location.zzi.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #65  <Method void com.google.android.gms.location.zzi.zza(GeofencingRequest, Parcel, int)>
	//    4    6:return          
	}

	public List zzIf()
	{
		return zzbjO;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field List zzbjO>
	//    2    4:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzi();
	public static final int INITIAL_TRIGGER_DWELL = 4;
	public static final int INITIAL_TRIGGER_ENTER = 1;
	public static final int INITIAL_TRIGGER_EXIT = 2;
	private final String mTag;
	private final List zzbjO;
	private final int zzbjP;

	static 
	{
	//    0    0:new             #27  <Class zzi>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void zzi()>
	//    3    7:putstatic       #32  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
