// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.zza;
import com.google.android.gms.internal.zzanu;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.request:
//			GoalsReadRequest

public static class GoalsReadRequest$Builder
{

	static List zza(GoalsReadRequest$Builder goalsreadrequest$builder)
	{
		return goalsreadrequest$builder.zzaWa;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field List zzaWa>
	//    2    4:areturn         
	}

	static List zzb(GoalsReadRequest$Builder goalsreadrequest$builder)
	{
		return goalsreadrequest$builder.zzaWb;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field List zzaWb>
	//    2    4:areturn         
	}

	static List zzc(GoalsReadRequest$Builder goalsreadrequest$builder)
	{
		return goalsreadrequest$builder.zzaTO;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field List zzaTO>
	//    2    4:areturn         
	}

	public GoalsReadRequest$Builder addActivity(String s)
	{
		int i = com.google.android.gms.fitness.zza.zzdU(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #39  <Method int zza.zzdU(String)>
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

	public GoalsReadRequest$Builder addDataType(DataType datatype)
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

	public GoalsReadRequest$Builder addObjectiveType(int i)
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
		return new GoalsReadRequest(this, ((GoalsReadRequest._cls1) (null)));
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

	public GoalsReadRequest$Builder()
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
