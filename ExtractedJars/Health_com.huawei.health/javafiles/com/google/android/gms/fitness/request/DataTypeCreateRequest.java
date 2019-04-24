// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.fitness.data.Field;
import com.google.android.gms.internal.zzaoo;
import java.util.*;

// Referenced classes of package com.google.android.gms.fitness.request:
//			zzm

public class DataTypeCreateRequest extends zza
{
	public static class Builder
	{

		static String zza(Builder builder)
		{
			return builder.mName;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field String mName>
		//    2    4:areturn         
		}

		static List zzb(Builder builder)
		{
			return builder.zzaVS;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field List zzaVS>
		//    2    4:areturn         
		}

		public Builder addField(Field field)
		{
			if(!zzaVS.contains(((Object) (field))))
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field List zzaVS>
		//*   2    4:aload_1         
		//*   3    5:invokeinterface #36  <Method boolean List.contains(Object)>
		//*   4   10:ifne            24
				zzaVS.add(((Object) (field)));
		//    5   13:aload_0         
		//    6   14:getfield        #21  <Field List zzaVS>
		//    7   17:aload_1         
		//    8   18:invokeinterface #39  <Method boolean List.add(Object)>
		//    9   23:pop             
			return this;
		//   10   24:aload_0         
		//   11   25:areturn         
		}

		public Builder addField(String s, int i)
		{
			boolean flag;
			if(s != null && !s.isEmpty())
		//*   0    0:aload_1         
		//*   1    1:ifnull          16
		//*   2    4:aload_1         
		//*   3    5:invokevirtual   #46  <Method boolean String.isEmpty()>
		//*   4    8:ifne            16
				flag = true;
		//    5   11:iconst_1        
		//    6   12:istore_3        
			else
		//*   7   13:goto            18
				flag = false;
		//    8   16:iconst_0        
		//    9   17:istore_3        
			zzac.zzb(flag, "Invalid name specified");
		//   10   18:iload_3         
		//   11   19:ldc1            #48  <String "Invalid name specified">
		//   12   21:invokestatic    #53  <Method void zzac.zzb(boolean, Object)>
			return addField(Field.zzn(s, i));
		//   13   24:aload_0         
		//   14   25:aload_1         
		//   15   26:iload_2         
		//   16   27:invokestatic    #59  <Method Field Field.zzn(String, int)>
		//   17   30:invokevirtual   #61  <Method DataTypeCreateRequest$Builder addField(Field)>
		//   18   33:areturn         
		}

		public DataTypeCreateRequest build()
		{
			boolean flag;
			if(mName != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field String mName>
		//*   2    4:ifnull          12
				flag = true;
		//    3    7:iconst_1        
		//    4    8:istore_1        
			else
		//*   5    9:goto            14
				flag = false;
		//    6   12:iconst_0        
		//    7   13:istore_1        
			zzac.zza(flag, "Must set the name");
		//    8   14:iload_1         
		//    9   15:ldc1            #65  <String "Must set the name">
		//   10   17:invokestatic    #67  <Method void zzac.zza(boolean, Object)>
			if(!zzaVS.isEmpty())
		//*  11   20:aload_0         
		//*  12   21:getfield        #21  <Field List zzaVS>
		//*  13   24:invokeinterface #68  <Method boolean List.isEmpty()>
		//*  14   29:ifne            37
				flag = true;
		//   15   32:iconst_1        
		//   16   33:istore_1        
			else
		//*  17   34:goto            39
				flag = false;
		//   18   37:iconst_0        
		//   19   38:istore_1        
			zzac.zza(flag, "Must specify the data fields");
		//   20   39:iload_1         
		//   21   40:ldc1            #70  <String "Must specify the data fields">
		//   22   42:invokestatic    #67  <Method void zzac.zza(boolean, Object)>
			return new DataTypeCreateRequest(this);
		//   23   45:new             #6   <Class DataTypeCreateRequest>
		//   24   48:dup             
		//   25   49:aload_0         
		//   26   50:aconst_null     
		//   27   51:invokespecial   #73  <Method void DataTypeCreateRequest(DataTypeCreateRequest$Builder, DataTypeCreateRequest$1)>
		//   28   54:areturn         
		}

		public Builder setName(String s)
		{
			mName = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #26  <Field String mName>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private String mName;
		private List zzaVS;

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			zzaVS = ((List) (new ArrayList()));
		//    2    4:aload_0         
		//    3    5:new             #18  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #19  <Method void ArrayList()>
		//    6   12:putfield        #21  <Field List zzaVS>
		//    7   15:return          
		}
	}


	DataTypeCreateRequest(int i, String s, List list, IBinder ibinder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void zza()>
		zzaiI = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #35  <Field int zzaiI>
		mName = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #37  <Field String mName>
		zzaVS = Collections.unmodifiableList(list);
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:invokestatic    #43  <Method List Collections.unmodifiableList(List)>
	//   11   19:putfield        #45  <Field List zzaVS>
		zzaVT = com.google.android.gms.internal.zzaoo.zza.zzcs(ibinder);
	//   12   22:aload_0         
	//   13   23:aload           4
	//   14   25:invokestatic    #51  <Method zzaoo com.google.android.gms.internal.zzaoo$zza.zzcs(IBinder)>
	//   15   28:putfield        #53  <Field zzaoo zzaVT>
	//   16   31:return          
	}

	private DataTypeCreateRequest(Builder builder)
	{
		this(com.google.android.gms.fitness.request.Builder.zza(builder), Builder.zzb(builder), ((zzaoo) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #60  <Method String com.google.android.gms.fitness.request.DataTypeCreateRequest$Builder.zza(DataTypeCreateRequest$Builder)>
	//    3    5:aload_1         
	//    4    6:invokestatic    #64  <Method List DataTypeCreateRequest$Builder.zzb(DataTypeCreateRequest$Builder)>
	//    5    9:aconst_null     
	//    6   10:invokespecial   #67  <Method void DataTypeCreateRequest(String, List, zzaoo)>
	//    7   13:return          
	}


	public DataTypeCreateRequest(DataTypeCreateRequest datatypecreaterequest, zzaoo zzaoo1)
	{
		this(datatypecreaterequest.mName, datatypecreaterequest.zzaVS, zzaoo1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #37  <Field String mName>
	//    3    5:aload_1         
	//    4    6:getfield        #45  <Field List zzaVS>
	//    5    9:aload_2         
	//    6   10:invokespecial   #67  <Method void DataTypeCreateRequest(String, List, zzaoo)>
	//    7   13:return          
	}

	public DataTypeCreateRequest(String s, List list, zzaoo zzaoo1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void zza()>
		zzaiI = 3;
	//    2    4:aload_0         
	//    3    5:iconst_3        
	//    4    6:putfield        #35  <Field int zzaiI>
		mName = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #37  <Field String mName>
		zzaVS = Collections.unmodifiableList(list);
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:invokestatic    #43  <Method List Collections.unmodifiableList(List)>
	//   11   19:putfield        #45  <Field List zzaVS>
		zzaVT = zzaoo1;
	//   12   22:aload_0         
	//   13   23:aload_3         
	//   14   24:putfield        #53  <Field zzaoo zzaVT>
	//   15   27:return          
	}

	private boolean zzb(DataTypeCreateRequest datatypecreaterequest)
	{
		return zzaa.equal(((Object) (mName)), ((Object) (datatypecreaterequest.mName))) && zzaa.equal(((Object) (zzaVS)), ((Object) (datatypecreaterequest.zzaVS)));
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String mName>
	//    2    4:aload_1         
	//    3    5:getfield        #37  <Field String mName>
	//    4    8:invokestatic    #79  <Method boolean zzaa.equal(Object, Object)>
	//    5   11:ifeq            30
	//    6   14:aload_0         
	//    7   15:getfield        #45  <Field List zzaVS>
	//    8   18:aload_1         
	//    9   19:getfield        #45  <Field List zzaVS>
	//   10   22:invokestatic    #79  <Method boolean zzaa.equal(Object, Object)>
	//   11   25:ifeq            30
	//   12   28:iconst_1        
	//   13   29:ireturn         
	//   14   30:iconst_0        
	//   15   31:ireturn         
	}

	public boolean equals(Object obj)
	{
		return obj == this || (obj instanceof DataTypeCreateRequest) && zzb((DataTypeCreateRequest)obj);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:if_acmpeq       23
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class DataTypeCreateRequest>
	//    5    9:ifeq            25
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class DataTypeCreateRequest>
	//    9   17:invokespecial   #83  <Method boolean zzb(DataTypeCreateRequest)>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public IBinder getCallbackBinder()
	{
		if(zzaVT == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field zzaoo zzaVT>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return zzaVT.asBinder();
	//    5    9:aload_0         
	//    6   10:getfield        #53  <Field zzaoo zzaVT>
	//    7   13:invokeinterface #90  <Method IBinder zzaoo.asBinder()>
	//    8   18:areturn         
	}

	public List getFields()
	{
		return zzaVS;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field List zzaVS>
	//    2    4:areturn         
	}

	public String getName()
	{
		return mName;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String mName>
	//    2    4:areturn         
	}

	int getVersionCode()
	{
		return zzaiI;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field int zzaiI>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			mName, zzaVS
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #37  <Field String mName>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #45  <Field List zzaVS>
	//   11   17:aastore         
	//   12   18:invokestatic    #103 <Method int zzaa.hashCode(Object[])>
	//   13   21:ireturn         
	}

	public String toString()
	{
		return zzaa.zzv(((Object) (this))).zzg("name", ((Object) (mName))).zzg("fields", ((Object) (zzaVS))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #108 <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #110 <String "name">
	//    3    6:aload_0         
	//    4    7:getfield        #37  <Field String mName>
	//    5   10:invokevirtual   #116 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    6   13:ldc1            #118 <String "fields">
	//    7   15:aload_0         
	//    8   16:getfield        #45  <Field List zzaVS>
	//    9   19:invokevirtual   #116 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   10   22:invokevirtual   #120 <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//   11   25:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.fitness.request.zzm.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #125 <Method void com.google.android.gms.fitness.request.zzm.zza(DataTypeCreateRequest, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzm();
	private final String mName;
	private final List zzaVS;
	private final zzaoo zzaVT;
	private final int zzaiI;

	static 
	{
	//    0    0:new             #25  <Class zzm>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void zzm()>
	//    3    7:putstatic       #30  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
