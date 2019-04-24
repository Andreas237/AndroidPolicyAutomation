// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//			SessionReadRequest

public static class SessionReadRequest$Builder
{

	static String zza(SessionReadRequest$Builder sessionreadrequest$builder)
	{
		return sessionreadrequest$builder.zzaWD;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field String zzaWD>
	//    2    4:areturn         
	}

	static String zzb(SessionReadRequest$Builder sessionreadrequest$builder)
	{
		return sessionreadrequest$builder.zzWD;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field String zzWD>
	//    2    4:areturn         
	}

	static long zzc(SessionReadRequest$Builder sessionreadrequest$builder)
	{
		return sessionreadrequest$builder.zzafe;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field long zzafe>
	//    2    4:lreturn         
	}

	static long zzd(SessionReadRequest$Builder sessionreadrequest$builder)
	{
		return sessionreadrequest$builder.zzaSt;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field long zzaSt>
	//    2    4:lreturn         
	}

	static List zze(SessionReadRequest$Builder sessionreadrequest$builder)
	{
		return sessionreadrequest$builder.zzaSs;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field List zzaSs>
	//    2    4:areturn         
	}

	static List zzf(SessionReadRequest$Builder sessionreadrequest$builder)
	{
		return sessionreadrequest$builder.zzaVw;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field List zzaVw>
	//    2    4:areturn         
	}

	static boolean zzg(SessionReadRequest$Builder sessionreadrequest$builder)
	{
		return sessionreadrequest$builder.zzaWE;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field boolean zzaWE>
	//    2    4:ireturn         
	}

	static boolean zzh(SessionReadRequest$Builder sessionreadrequest$builder)
	{
		return sessionreadrequest$builder.zzaVH;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field boolean zzaVH>
	//    2    4:ireturn         
	}

	static List zzi(SessionReadRequest$Builder sessionreadrequest$builder)
	{
		return sessionreadrequest$builder.zzaWF;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field List zzaWF>
	//    2    4:areturn         
	}

	public SessionReadRequest build()
	{
		boolean flag;
		if(zzafe > 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field long zzafe>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifle            14
			flag = true;
	//    5    9:iconst_1        
	//    6   10:istore_1        
		else
	//*   7   11:goto            16
			flag = false;
	//    8   14:iconst_0        
	//    9   15:istore_1        
		zzac.zzb(flag, "Invalid start time: %s", new Object[] {
			Long.valueOf(zzafe)
		});
	//   10   16:iload_1         
	//   11   17:ldc1            #66  <String "Invalid start time: %s">
	//   12   19:iconst_1        
	//   13   20:anewarray       Object[]
	//   14   23:dup             
	//   15   24:iconst_0        
	//   16   25:aload_0         
	//   17   26:getfield        #29  <Field long zzafe>
	//   18   29:invokestatic    #72  <Method Long Long.valueOf(long)>
	//   19   32:aastore         
	//   20   33:invokestatic    #77  <Method void zzac.zzb(boolean, String, Object[])>
		if(zzaSt > 0L && zzaSt > zzafe)
	//*  21   36:aload_0         
	//*  22   37:getfield        #31  <Field long zzaSt>
	//*  23   40:lconst_0        
	//*  24   41:lcmp            
	//*  25   42:ifle            62
	//*  26   45:aload_0         
	//*  27   46:getfield        #31  <Field long zzaSt>
	//*  28   49:aload_0         
	//*  29   50:getfield        #29  <Field long zzafe>
	//*  30   53:lcmp            
	//*  31   54:ifle            62
			flag = true;
	//   32   57:iconst_1        
	//   33   58:istore_1        
		else
	//*  34   59:goto            64
			flag = false;
	//   35   62:iconst_0        
	//   36   63:istore_1        
		zzac.zzb(flag, "Invalid end time: %s", new Object[] {
			Long.valueOf(zzaSt)
		});
	//   37   64:iload_1         
	//   38   65:ldc1            #79  <String "Invalid end time: %s">
	//   39   67:iconst_1        
	//   40   68:anewarray       Object[]
	//   41   71:dup             
	//   42   72:iconst_0        
	//   43   73:aload_0         
	//   44   74:getfield        #31  <Field long zzaSt>
	//   45   77:invokestatic    #72  <Method Long Long.valueOf(long)>
	//   46   80:aastore         
	//   47   81:invokestatic    #77  <Method void zzac.zzb(boolean, String, Object[])>
		return new SessionReadRequest(this, ((SessionReadRequest._cls1) (null)));
	//   48   84:new             #6   <Class SessionReadRequest>
	//   49   87:dup             
	//   50   88:aload_0         
	//   51   89:aconst_null     
	//   52   90:invokespecial   #82  <Method void SessionReadRequest(SessionReadRequest$Builder, SessionReadRequest$1)>
	//   53   93:areturn         
	}

	public SessionReadRequest$Builder enableServerQueries()
	{
		zzaVH = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #42  <Field boolean zzaVH>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public SessionReadRequest$Builder excludePackage(String s)
	{
		zzac.zzb(((Object) (s)), "Attempting to use a null package name");
	//    0    0:aload_1         
	//    1    1:ldc1            #88  <String "Attempting to use a null package name">
	//    2    3:invokestatic    #91  <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		if(!zzaWF.contains(((Object) (s))))
	//*   4    7:aload_0         
	//*   5    8:getfield        #44  <Field List zzaWF>
	//*   6   11:aload_1         
	//*   7   12:invokeinterface #97  <Method boolean List.contains(Object)>
	//*   8   17:ifne            31
			zzaWF.add(((Object) (s)));
	//    9   20:aload_0         
	//   10   21:getfield        #44  <Field List zzaWF>
	//   11   24:aload_1         
	//   12   25:invokeinterface #100 <Method boolean List.add(Object)>
	//   13   30:pop             
		return this;
	//   14   31:aload_0         
	//   15   32:areturn         
	}

	public SessionReadRequest$Builder read(DataSource datasource)
	{
		zzac.zzb(((Object) (datasource)), "Attempting to add a null data source");
	//    0    0:aload_1         
	//    1    1:ldc1            #104 <String "Attempting to add a null data source">
	//    2    3:invokestatic    #91  <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		if(!zzaVw.contains(((Object) (datasource))))
	//*   4    7:aload_0         
	//*   5    8:getfield        #38  <Field List zzaVw>
	//*   6   11:aload_1         
	//*   7   12:invokeinterface #97  <Method boolean List.contains(Object)>
	//*   8   17:ifne            31
			zzaVw.add(((Object) (datasource)));
	//    9   20:aload_0         
	//   10   21:getfield        #38  <Field List zzaVw>
	//   11   24:aload_1         
	//   12   25:invokeinterface #100 <Method boolean List.add(Object)>
	//   13   30:pop             
		return this;
	//   14   31:aload_0         
	//   15   32:areturn         
	}

	public SessionReadRequest$Builder read(DataType datatype)
	{
		zzac.zzb(((Object) (datatype)), "Attempting to use a null data type");
	//    0    0:aload_1         
	//    1    1:ldc1            #107 <String "Attempting to use a null data type">
	//    2    3:invokestatic    #91  <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		if(!zzaSs.contains(((Object) (datatype))))
	//*   4    7:aload_0         
	//*   5    8:getfield        #36  <Field List zzaSs>
	//*   6   11:aload_1         
	//*   7   12:invokeinterface #97  <Method boolean List.contains(Object)>
	//*   8   17:ifne            31
			zzaSs.add(((Object) (datatype)));
	//    9   20:aload_0         
	//   10   21:getfield        #36  <Field List zzaSs>
	//   11   24:aload_1         
	//   12   25:invokeinterface #100 <Method boolean List.add(Object)>
	//   13   30:pop             
		return this;
	//   14   31:aload_0         
	//   15   32:areturn         
	}

	public SessionReadRequest$Builder readSessionsFromAllApps()
	{
		zzaWE = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #40  <Field boolean zzaWE>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public SessionReadRequest$Builder setSessionId(String s)
	{
		zzWD = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #52  <Field String zzWD>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public SessionReadRequest$Builder setSessionName(String s)
	{
		zzaWD = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #49  <Field String zzaWD>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public SessionReadRequest$Builder setTimeInterval(long l, long l1, TimeUnit timeunit)
	{
		zzafe = timeunit.toMillis(l);
	//    0    0:aload_0         
	//    1    1:aload           5
	//    2    3:lload_1         
	//    3    4:invokevirtual   #118 <Method long TimeUnit.toMillis(long)>
	//    4    7:putfield        #29  <Field long zzafe>
		zzaSt = timeunit.toMillis(l1);
	//    5   10:aload_0         
	//    6   11:aload           5
	//    7   13:lload_3         
	//    8   14:invokevirtual   #118 <Method long TimeUnit.toMillis(long)>
	//    9   17:putfield        #31  <Field long zzaSt>
		return this;
	//   10   20:aload_0         
	//   11   21:areturn         
	}

	private String zzWD;
	private List zzaSs;
	private long zzaSt;
	private boolean zzaVH;
	private List zzaVw;
	private String zzaWD;
	private boolean zzaWE;
	private List zzaWF;
	private long zzafe;

	public SessionReadRequest$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		zzafe = 0L;
	//    2    4:aload_0         
	//    3    5:lconst_0        
	//    4    6:putfield        #29  <Field long zzafe>
		zzaSt = 0L;
	//    5    9:aload_0         
	//    6   10:lconst_0        
	//    7   11:putfield        #31  <Field long zzaSt>
		zzaSs = ((List) (new ArrayList()));
	//    8   14:aload_0         
	//    9   15:new             #33  <Class ArrayList>
	//   10   18:dup             
	//   11   19:invokespecial   #34  <Method void ArrayList()>
	//   12   22:putfield        #36  <Field List zzaSs>
		zzaVw = ((List) (new ArrayList()));
	//   13   25:aload_0         
	//   14   26:new             #33  <Class ArrayList>
	//   15   29:dup             
	//   16   30:invokespecial   #34  <Method void ArrayList()>
	//   17   33:putfield        #38  <Field List zzaVw>
		zzaWE = false;
	//   18   36:aload_0         
	//   19   37:iconst_0        
	//   20   38:putfield        #40  <Field boolean zzaWE>
		zzaVH = false;
	//   21   41:aload_0         
	//   22   42:iconst_0        
	//   23   43:putfield        #42  <Field boolean zzaVH>
		zzaWF = ((List) (new ArrayList()));
	//   24   46:aload_0         
	//   25   47:new             #33  <Class ArrayList>
	//   26   50:dup             
	//   27   51:invokespecial   #34  <Method void ArrayList()>
	//   28   54:putfield        #44  <Field List zzaWF>
	//   29   57:return          
	}
}
