// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.fitness.data.Field;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.request:
//			DataTypeCreateRequest

public static class DataTypeCreateRequest$Builder
{

	static String zza(DataTypeCreateRequest$Builder datatypecreaterequest$builder)
	{
		return datatypecreaterequest$builder.mName;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String mName>
	//    2    4:areturn         
	}

	static List zzb(DataTypeCreateRequest$Builder datatypecreaterequest$builder)
	{
		return datatypecreaterequest$builder.zzaVS;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field List zzaVS>
	//    2    4:areturn         
	}

	public DataTypeCreateRequest$Builder addField(Field field)
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

	public DataTypeCreateRequest$Builder addField(String s, int i)
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
		return new DataTypeCreateRequest(this, ((DataTypeCreateRequest._cls1) (null)));
	//   23   45:new             #6   <Class DataTypeCreateRequest>
	//   24   48:dup             
	//   25   49:aload_0         
	//   26   50:aconst_null     
	//   27   51:invokespecial   #73  <Method void DataTypeCreateRequest(DataTypeCreateRequest$Builder, DataTypeCreateRequest$1)>
	//   28   54:areturn         
	}

	public DataTypeCreateRequest$Builder setName(String s)
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

	public DataTypeCreateRequest$Builder()
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
