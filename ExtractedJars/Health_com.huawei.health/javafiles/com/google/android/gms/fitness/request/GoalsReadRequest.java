// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzanu;
import com.google.android.gms.internal.zzaor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.request:
//			zzah

public class GoalsReadRequest extends zza
{
	public static class Builder
	{

		static List zza(Builder builder)
		{
			return builder.zzaWa;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field List zzaWa>
		//    2    4:areturn         
		}

		static List zzb(Builder builder)
		{
			return builder.zzaWb;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field List zzaWb>
		//    2    4:areturn         
		}

		static List zzc(Builder builder)
		{
			return builder.zzaTO;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field List zzaTO>
		//    2    4:areturn         
		}

		public Builder addActivity(String s)
		{
			int i = com.google.android.gms.fitness.zza.zzdU(s);
		//    0    0:aload_1         
		//    1    1:invokestatic    #39  <Method int com.google.android.gms.fitness.zza.zzdU(String)>
		//    2    4:istore_2        
			boolean flag;
			if(i != 4)
		//*   3    5:iload_2         
		//*   4    6:iconst_4        
		//*   5    7:icmpeq          15
				flag = true;
		//    6   10:iconst_1        
		//    7   11:istore_3        
			else
		//*   8   12:goto            17
				flag = false;
		//    9   15:iconst_0        
		//   10   16:istore_3        
			zzac.zza(flag, "Attempting to add an unknown activity");
		//   11   17:iload_3         
		//   12   18:ldc1            #41  <String "Attempting to add an unknown activity">
		//   13   20:invokestatic    #46  <Method void zzac.zza(boolean, Object)>
			zzanu.zza(((Object) (Integer.valueOf(i))), zzaTO);
		//   14   23:iload_2         
		//   15   24:invokestatic    #52  <Method Integer Integer.valueOf(int)>
		//   16   27:aload_0         
		//   17   28:getfield        #26  <Field List zzaTO>
		//   18   31:invokestatic    #57  <Method int zzanu.zza(Object, List)>
		//   19   34:pop             
			return this;
		//   20   35:aload_0         
		//   21   36:areturn         
		}

		public Builder addDataType(DataType datatype)
		{
			zzac.zzb(((Object) (datatype)), "Attempting to use a null data type");
		//    0    0:aload_1         
		//    1    1:ldc1            #61  <String "Attempting to use a null data type">
		//    2    3:invokestatic    #64  <Method Object zzac.zzb(Object, Object)>
		//    3    6:pop             
			if(!zzaWa.contains(((Object) (datatype))))
		//*   4    7:aload_0         
		//*   5    8:getfield        #22  <Field List zzaWa>
		//*   6   11:aload_1         
		//*   7   12:invokeinterface #70  <Method boolean List.contains(Object)>
		//*   8   17:ifne            31
				zzaWa.add(((Object) (datatype)));
		//    9   20:aload_0         
		//   10   21:getfield        #22  <Field List zzaWa>
		//   11   24:aload_1         
		//   12   25:invokeinterface #73  <Method boolean List.add(Object)>
		//   13   30:pop             
			return this;
		//   14   31:aload_0         
		//   15   32:areturn         
		}

		public Builder addObjectiveType(int i)
		{
			boolean flag;
			if(i == 1 || i == 2 || i == 3)
		//*   0    0:iload_1         
		//*   1    1:iconst_1        
		//*   2    2:icmpeq          15
		//*   3    5:iload_1         
		//*   4    6:iconst_2        
		//*   5    7:icmpeq          15
		//*   6   10:iload_1         
		//*   7   11:iconst_3        
		//*   8   12:icmpne          20
				flag = true;
		//    9   15:iconst_1        
		//   10   16:istore_2        
			else
		//*  11   17:goto            22
				flag = false;
		//   12   20:iconst_0        
		//   13   21:istore_2        
			zzac.zza(flag, "Attempting to add an invalid objective type");
		//   14   22:iload_2         
		//   15   23:ldc1            #77  <String "Attempting to add an invalid objective type">
		//   16   25:invokestatic    #46  <Method void zzac.zza(boolean, Object)>
			if(!zzaWb.contains(((Object) (Integer.valueOf(i)))))
		//*  17   28:aload_0         
		//*  18   29:getfield        #24  <Field List zzaWb>
		//*  19   32:iload_1         
		//*  20   33:invokestatic    #52  <Method Integer Integer.valueOf(int)>
		//*  21   36:invokeinterface #70  <Method boolean List.contains(Object)>
		//*  22   41:ifne            58
				zzaWb.add(((Object) (Integer.valueOf(i))));
		//   23   44:aload_0         
		//   24   45:getfield        #24  <Field List zzaWb>
		//   25   48:iload_1         
		//   26   49:invokestatic    #52  <Method Integer Integer.valueOf(int)>
		//   27   52:invokeinterface #73  <Method boolean List.add(Object)>
		//   28   57:pop             
			return this;
		//   29   58:aload_0         
		//   30   59:areturn         
		}

		public GoalsReadRequest build()
		{
			boolean flag;
			if(!zzaWa.isEmpty())
		//*   0    0:aload_0         
		//*   1    1:getfield        #22  <Field List zzaWa>
		//*   2    4:invokeinterface #83  <Method boolean List.isEmpty()>
		//*   3    9:ifne            17
				flag = true;
		//    4   12:iconst_1        
		//    5   13:istore_1        
			else
		//*   6   14:goto            19
				flag = false;
		//    7   17:iconst_0        
		//    8   18:istore_1        
			zzac.zza(flag, "At least one data type should be specified.");
		//    9   19:iload_1         
		//   10   20:ldc1            #85  <String "At least one data type should be specified.">
		//   11   22:invokestatic    #46  <Method void zzac.zza(boolean, Object)>
			return new GoalsReadRequest(this);
		//   12   25:new             #6   <Class GoalsReadRequest>
		//   13   28:dup             
		//   14   29:aload_0         
		//   15   30:aconst_null     
		//   16   31:invokespecial   #88  <Method void GoalsReadRequest(GoalsReadRequest$Builder, GoalsReadRequest$1)>
		//   17   34:areturn         
		}

		private final List zzaTO = new ArrayList();
		private final List zzaWa = new ArrayList();
		private final List zzaWb = new ArrayList();

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #19  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #20  <Method void ArrayList()>
		//    6   12:putfield        #22  <Field List zzaWa>
		//    7   15:aload_0         
		//    8   16:new             #19  <Class ArrayList>
		//    9   19:dup             
		//   10   20:invokespecial   #20  <Method void ArrayList()>
		//   11   23:putfield        #24  <Field List zzaWb>
		//   12   26:aload_0         
		//   13   27:new             #19  <Class ArrayList>
		//   14   30:dup             
		//   15   31:invokespecial   #20  <Method void ArrayList()>
		//   16   34:putfield        #26  <Field List zzaTO>
		//   17   37:return          
		}
	}


	GoalsReadRequest(int i, IBinder ibinder, List list, List list1, List list2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void zza()>
		versionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #36  <Field int versionCode>
		if(ibinder == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       18
			ibinder = null;
	//    7   13:aconst_null     
	//    8   14:astore_2        
		else
	//*   9   15:goto            23
			ibinder = ((IBinder) (com.google.android.gms.internal.zzaor.zza.zzcv(ibinder)));
	//   10   18:aload_2         
	//   11   19:invokestatic    #42  <Method zzaor com.google.android.gms.internal.zzaor$zza.zzcv(IBinder)>
	//   12   22:astore_2        
		zzaVZ = ((zzaor) (ibinder));
	//   13   23:aload_0         
	//   14   24:aload_2         
	//   15   25:putfield        #44  <Field zzaor zzaVZ>
		zzaWa = list;
	//   16   28:aload_0         
	//   17   29:aload_3         
	//   18   30:putfield        #46  <Field List zzaWa>
		zzaWb = list1;
	//   19   33:aload_0         
	//   20   34:aload           4
	//   21   36:putfield        #48  <Field List zzaWb>
		zzaTO = list2;
	//   22   39:aload_0         
	//   23   40:aload           5
	//   24   42:putfield        #50  <Field List zzaTO>
	//   25   45:return          
	}

	private GoalsReadRequest(Builder builder)
	{
		this(((zzaor) (null)), com.google.android.gms.fitness.request.Builder.zza(builder), Builder.zzb(builder), Builder.zzc(builder));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokestatic    #57  <Method List com.google.android.gms.fitness.request.GoalsReadRequest$Builder.zza(GoalsReadRequest$Builder)>
	//    4    6:aload_1         
	//    5    7:invokestatic    #60  <Method List GoalsReadRequest$Builder.zzb(GoalsReadRequest$Builder)>
	//    6   10:aload_1         
	//    7   11:invokestatic    #63  <Method List GoalsReadRequest$Builder.zzc(GoalsReadRequest$Builder)>
	//    8   14:invokespecial   #66  <Method void GoalsReadRequest(zzaor, List, List, List)>
	//    9   17:return          
	}


	public GoalsReadRequest(GoalsReadRequest goalsreadrequest, zzaor zzaor1)
	{
		this(zzaor1, goalsreadrequest.getDataTypes(), goalsreadrequest.zzCZ(), goalsreadrequest.zzCs());
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #74  <Method List getDataTypes()>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #77  <Method List zzCZ()>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #80  <Method List zzCs()>
	//    8   14:invokespecial   #66  <Method void GoalsReadRequest(zzaor, List, List, List)>
	//    9   17:return          
	}

	private GoalsReadRequest(zzaor zzaor1, List list, List list1, List list2)
	{
		if(zzaor1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			zzaor1 = null;
	//    2    4:aconst_null     
	//    3    5:astore_1        
		else
	//*   4    6:goto            16
			zzaor1 = ((zzaor) (zzaor1.asBinder()));
	//    5    9:aload_1         
	//    6   10:invokeinterface #86  <Method IBinder zzaor.asBinder()>
	//    7   15:astore_1        
		this(1, ((IBinder) (zzaor1)), list, list1, list2);
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:aload_3         
	//   13   21:aload           4
	//   14   23:invokespecial   #88  <Method void GoalsReadRequest(int, IBinder, List, List, List)>
	//   15   26:return          
	}

	private boolean zzb(GoalsReadRequest goalsreadrequest)
	{
		return zzaa.equal(((Object) (zzaWa)), ((Object) (goalsreadrequest.zzaWa))) && zzaa.equal(((Object) (zzaWb)), ((Object) (goalsreadrequest.zzaWb))) && zzaa.equal(((Object) (zzaTO)), ((Object) (goalsreadrequest.zzaTO)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field List zzaWa>
	//    2    4:aload_1         
	//    3    5:getfield        #46  <Field List zzaWa>
	//    4    8:invokestatic    #96  <Method boolean zzaa.equal(Object, Object)>
	//    5   11:ifeq            44
	//    6   14:aload_0         
	//    7   15:getfield        #48  <Field List zzaWb>
	//    8   18:aload_1         
	//    9   19:getfield        #48  <Field List zzaWb>
	//   10   22:invokestatic    #96  <Method boolean zzaa.equal(Object, Object)>
	//   11   25:ifeq            44
	//   12   28:aload_0         
	//   13   29:getfield        #50  <Field List zzaTO>
	//   14   32:aload_1         
	//   15   33:getfield        #50  <Field List zzaTO>
	//   16   36:invokestatic    #96  <Method boolean zzaa.equal(Object, Object)>
	//   17   39:ifeq            44
	//   18   42:iconst_1        
	//   19   43:ireturn         
	//   20   44:iconst_0        
	//   21   45:ireturn         
	}

	public boolean equals(Object obj)
	{
		return this == obj || (obj instanceof GoalsReadRequest) && zzb((GoalsReadRequest)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       23
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class GoalsReadRequest>
	//    5    9:ifeq            25
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class GoalsReadRequest>
	//    9   17:invokespecial   #100 <Method boolean zzb(GoalsReadRequest)>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public List getActivityNames()
	{
		if(zzaTO.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field List zzaTO>
	//*   2    4:invokeinterface #107 <Method boolean List.isEmpty()>
	//*   3    9:ifeq            14
			return null;
	//    4   12:aconst_null     
	//    5   13:areturn         
		ArrayList arraylist = new ArrayList();
	//    6   14:new             #109 <Class ArrayList>
	//    7   17:dup             
	//    8   18:invokespecial   #110 <Method void ArrayList()>
	//    9   21:astore_1        
		for(Iterator iterator = zzaTO.iterator(); iterator.hasNext(); ((List) (arraylist)).add(((Object) (com.google.android.gms.fitness.zza.getName(((Integer)iterator.next()).intValue())))));
	//   10   22:aload_0         
	//   11   23:getfield        #50  <Field List zzaTO>
	//   12   26:invokeinterface #114 <Method Iterator List.iterator()>
	//   13   31:astore_2        
	//   14   32:aload_2         
	//   15   33:invokeinterface #119 <Method boolean Iterator.hasNext()>
	//   16   38:ifeq            66
	//   17   41:aload_1         
	//   18   42:aload_2         
	//   19   43:invokeinterface #123 <Method Object Iterator.next()>
	//   20   48:checkcast       #125 <Class Integer>
	//   21   51:invokevirtual   #129 <Method int Integer.intValue()>
	//   22   54:invokestatic    #135 <Method String com.google.android.gms.fitness.zza.getName(int)>
	//   23   57:invokeinterface #138 <Method boolean List.add(Object)>
	//   24   62:pop             
	//*  25   63:goto            32
		return ((List) (arraylist));
	//   26   66:aload_1         
	//   27   67:areturn         
	}

	public IBinder getCallbackBinder()
	{
		return zzaVZ.asBinder();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field zzaor zzaVZ>
	//    2    4:invokeinterface #86  <Method IBinder zzaor.asBinder()>
	//    3    9:areturn         
	}

	public List getDataTypes()
	{
		return zzaWa;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field List zzaWa>
	//    2    4:areturn         
	}

	public List getObjectiveTypes()
	{
		if(zzaWb.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field List zzaWb>
	//*   2    4:invokeinterface #107 <Method boolean List.isEmpty()>
	//*   3    9:ifeq            14
			return null;
	//    4   12:aconst_null     
	//    5   13:areturn         
		else
			return zzaWb;
	//    6   14:aload_0         
	//    7   15:getfield        #48  <Field List zzaWb>
	//    8   18:areturn         
	}

	int getVersionCode()
	{
		return versionCode;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int versionCode>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			zzaWa, zzaWb, getActivityNames()
		});
	//    0    0:iconst_3        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #46  <Field List zzaWa>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #48  <Field List zzaWb>
	//   11   17:aastore         
	//   12   18:dup             
	//   13   19:iconst_2        
	//   14   20:aload_0         
	//   15   21:invokevirtual   #149 <Method List getActivityNames()>
	//   16   24:aastore         
	//   17   25:invokestatic    #152 <Method int zzaa.hashCode(Object[])>
	//   18   28:ireturn         
	}

	public String toString()
	{
		return zzaa.zzv(((Object) (this))).zzg("dataTypes", ((Object) (zzaWa))).zzg("objectiveTypes", ((Object) (zzaWb))).zzg("activities", ((Object) (getActivityNames()))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #158 <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #160 <String "dataTypes">
	//    3    6:aload_0         
	//    4    7:getfield        #46  <Field List zzaWa>
	//    5   10:invokevirtual   #166 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    6   13:ldc1            #168 <String "objectiveTypes">
	//    7   15:aload_0         
	//    8   16:getfield        #48  <Field List zzaWb>
	//    9   19:invokevirtual   #166 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   10   22:ldc1            #170 <String "activities">
	//   11   24:aload_0         
	//   12   25:invokevirtual   #149 <Method List getActivityNames()>
	//   13   28:invokevirtual   #166 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   14   31:invokevirtual   #172 <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//   15   34:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.fitness.request.zzah.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #177 <Method void com.google.android.gms.fitness.request.zzah.zza(GoalsReadRequest, Parcel, int)>
	//    4    6:return          
	}

	public List zzCZ()
	{
		return zzaWb;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field List zzaWb>
	//    2    4:areturn         
	}

	public List zzCs()
	{
		return zzaTO;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field List zzaTO>
	//    2    4:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzah();
	private final int versionCode;
	private final List zzaTO;
	private final zzaor zzaVZ;
	private final List zzaWa;
	private final List zzaWb;

	static 
	{
	//    0    0:new             #26  <Class zzah>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void zzah()>
	//    3    7:putstatic       #31  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
