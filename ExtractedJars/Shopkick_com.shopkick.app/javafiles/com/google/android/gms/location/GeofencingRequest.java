// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.location.zzbh;
import java.util.*;

// Referenced classes of package com.google.android.gms.location:
//			zzq, Geofence

public class GeofencingRequest extends AbstractSafeParcelable
{
	public static final class Builder
	{

		public final Builder addGeofence(Geofence geofence)
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

		public final Builder addGeofences(List list)
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

		public final Builder setInitialTrigger(int i)
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

		public Builder()
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


	GeofencingRequest(List list, int i, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void AbstractSafeParcelable()>
		zzap = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #54  <Field List zzap>
		zzaq = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #56  <Field int zzaq>
		tag = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #58  <Field String tag>
	//   11   19:return          
	}

	public List getGeofences()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #66  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #67  <Method void ArrayList()>
	//    3    7:astore_1        
		((List) (arraylist)).addAll(((java.util.Collection) (zzap)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #54  <Field List zzap>
	//    7   13:invokeinterface #73  <Method boolean List.addAll(java.util.Collection)>
	//    8   18:pop             
		return ((List) (arraylist));
	//    9   19:aload_1         
	//   10   20:areturn         
	}

	public int getInitialTrigger()
	{
		return zzaq;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int zzaq>
	//    2    4:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #79  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #80  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("GeofencingRequest[");
	//    4    8:aload_3         
	//    5    9:ldc1            #82  <String "GeofencingRequest[">
	//    6   11:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append("geofences=");
	//    8   15:aload_3         
	//    9   16:ldc1            #88  <String "geofences=">
	//   10   18:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(((Object) (zzap)));
	//   12   22:aload_3         
	//   13   23:aload_0         
	//   14   24:getfield        #54  <Field List zzap>
	//   15   27:invokevirtual   #91  <Method StringBuilder StringBuilder.append(Object)>
	//   16   30:pop             
		int i = zzaq;
	//   17   31:aload_0         
	//   18   32:getfield        #56  <Field int zzaq>
	//   19   35:istore_1        
		Object obj = ((Object) (new StringBuilder(30)));
	//   20   36:new             #79  <Class StringBuilder>
	//   21   39:dup             
	//   22   40:bipush          30
	//   23   42:invokespecial   #94  <Method void StringBuilder(int)>
	//   24   45:astore_2        
		((StringBuilder) (obj)).append(", initialTrigger=");
	//   25   46:aload_2         
	//   26   47:ldc1            #96  <String ", initialTrigger=">
	//   27   49:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   28   52:pop             
		((StringBuilder) (obj)).append(i);
	//   29   53:aload_2         
	//   30   54:iload_1         
	//   31   55:invokevirtual   #99  <Method StringBuilder StringBuilder.append(int)>
	//   32   58:pop             
		((StringBuilder) (obj)).append(", ");
	//   33   59:aload_2         
	//   34   60:ldc1            #101 <String ", ">
	//   35   62:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   36   65:pop             
		stringbuilder.append(((StringBuilder) (obj)).toString());
	//   37   66:aload_3         
	//   38   67:aload_2         
	//   39   68:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   40   71:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   41   74:pop             
		obj = ((Object) (String.valueOf(((Object) (tag)))));
	//   42   75:aload_0         
	//   43   76:getfield        #58  <Field String tag>
	//   44   79:invokestatic    #109 <Method String String.valueOf(Object)>
	//   45   82:astore_2        
		if(((String) (obj)).length() != 0)
	//*  46   83:aload_2         
	//*  47   84:invokevirtual   #112 <Method int String.length()>
	//*  48   87:ifeq            100
			obj = ((Object) ("tag=".concat(((String) (obj)))));
	//   49   90:ldc1            #114 <String "tag=">
	//   50   92:aload_2         
	//   51   93:invokevirtual   #118 <Method String String.concat(String)>
	//   52   96:astore_2        
		else
	//*  53   97:goto            110
			obj = ((Object) (new String("tag=")));
	//   54  100:new             #105 <Class String>
	//   55  103:dup             
	//   56  104:ldc1            #114 <String "tag=">
	//   57  106:invokespecial   #121 <Method void String(String)>
	//   58  109:astore_2        
		stringbuilder.append(((String) (obj)));
	//   59  110:aload_3         
	//   60  111:aload_2         
	//   61  112:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   62  115:pop             
		stringbuilder.append("]");
	//   63  116:aload_3         
	//   64  117:ldc1            #123 <String "]">
	//   65  119:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   66  122:pop             
		return stringbuilder.toString();
	//   67  123:aload_3         
	//   68  124:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   69  127:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #131 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeTypedList(parcel, 1, zzap, false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #54  <Field List zzap>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #135 <Method void SafeParcelWriter.writeTypedList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeInt(parcel, 2, getInitialTrigger());
	//    9   15:aload_1         
	//   10   16:iconst_2        
	//   11   17:aload_0         
	//   12   18:invokevirtual   #137 <Method int getInitialTrigger()>
	//   13   21:invokestatic    #141 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeString(parcel, 3, tag, false);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:getfield        #58  <Field String tag>
	//   18   30:iconst_0        
	//   19   31:invokestatic    #145 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   20   34:aload_1         
	//   21   35:iload_2         
	//   22   36:invokestatic    #148 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   23   39:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzq();
	public static final int INITIAL_TRIGGER_DWELL = 4;
	public static final int INITIAL_TRIGGER_ENTER = 1;
	public static final int INITIAL_TRIGGER_EXIT = 2;
	private final String tag;
	private final List zzap;
	private final int zzaq;

	static 
	{
	//    0    0:new             #42  <Class zzq>
	//    1    3:dup             
	//    2    4:invokespecial   #45  <Method void zzq()>
	//    3    7:putstatic       #47  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
