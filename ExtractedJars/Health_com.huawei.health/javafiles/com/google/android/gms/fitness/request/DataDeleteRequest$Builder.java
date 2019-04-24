// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.fitness.data.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//			DataDeleteRequest

public static class DataDeleteRequest$Builder
{

	private void zzCQ()
	{
		if(zzaVx.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field List zzaVx>
	//*   2    4:invokeinterface #45  <Method boolean List.isEmpty()>
	//*   3    9:ifeq            13
			return;
	//    4   12:return          
		boolean flag;
		Session session;
		for(Iterator iterator = zzaVx.iterator(); iterator.hasNext(); zzac.zza(flag, "Session %s is outside the time interval [%d, %d]", new Object[] {
	session, Long.valueOf(zzafe), Long.valueOf(zzaSt)
}))
	//*   5   13:aload_0         
	//*   6   14:getfield        #33  <Field List zzaVx>
	//*   7   17:invokeinterface #49  <Method Iterator List.iterator()>
	//*   8   22:astore_2        
	//*   9   23:aload_2         
	//*  10   24:invokeinterface #54  <Method boolean Iterator.hasNext()>
	//*  11   29:ifeq            116
		{
			session = (Session)iterator.next();
	//   12   32:aload_2         
	//   13   33:invokeinterface #58  <Method Object Iterator.next()>
	//   14   38:checkcast       #60  <Class Session>
	//   15   41:astore_3        
			if(session.getStartTime(TimeUnit.MILLISECONDS) >= zzafe && session.getEndTime(TimeUnit.MILLISECONDS) <= zzaSt)
	//*  16   42:aload_3         
	//*  17   43:getstatic       #66  <Field TimeUnit TimeUnit.MILLISECONDS>
	//*  18   46:invokevirtual   #70  <Method long Session.getStartTime(TimeUnit)>
	//*  19   49:aload_0         
	//*  20   50:getfield        #72  <Field long zzafe>
	//*  21   53:lcmp            
	//*  22   54:iflt            77
	//*  23   57:aload_3         
	//*  24   58:getstatic       #66  <Field TimeUnit TimeUnit.MILLISECONDS>
	//*  25   61:invokevirtual   #75  <Method long Session.getEndTime(TimeUnit)>
	//*  26   64:aload_0         
	//*  27   65:getfield        #77  <Field long zzaSt>
	//*  28   68:lcmp            
	//*  29   69:ifgt            77
				flag = true;
	//   30   72:iconst_1        
	//   31   73:istore_1        
			else
	//*  32   74:goto            79
				flag = false;
	//   33   77:iconst_0        
	//   34   78:istore_1        
		}

	//   35   79:iload_1         
	//   36   80:ldc1            #79  <String "Session %s is outside the time interval [%d, %d]">
	//   37   82:iconst_3        
	//   38   83:anewarray       Object[]
	//   39   86:dup             
	//   40   87:iconst_0        
	//   41   88:aload_3         
	//   42   89:aastore         
	//   43   90:dup             
	//   44   91:iconst_1        
	//   45   92:aload_0         
	//   46   93:getfield        #72  <Field long zzafe>
	//   47   96:invokestatic    #85  <Method Long Long.valueOf(long)>
	//   48   99:aastore         
	//   49  100:dup             
	//   50  101:iconst_2        
	//   51  102:aload_0         
	//   52  103:getfield        #77  <Field long zzaSt>
	//   53  106:invokestatic    #85  <Method Long Long.valueOf(long)>
	//   54  109:aastore         
	//   55  110:invokestatic    #91  <Method void zzac.zza(boolean, String, Object[])>
	//*  56  113:goto            23
	//   57  116:return          
	}

	static long zza(DataDeleteRequest$Builder datadeleterequest$builder)
	{
		return datadeleterequest$builder.zzafe;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field long zzafe>
	//    2    4:lreturn         
	}

	static long zzb(DataDeleteRequest$Builder datadeleterequest$builder)
	{
		return datadeleterequest$builder.zzaSt;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field long zzaSt>
	//    2    4:lreturn         
	}

	static List zzc(DataDeleteRequest$Builder datadeleterequest$builder)
	{
		return datadeleterequest$builder.zzaVw;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field List zzaVw>
	//    2    4:areturn         
	}

	static List zzd(DataDeleteRequest$Builder datadeleterequest$builder)
	{
		return datadeleterequest$builder.zzaSs;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field List zzaSs>
	//    2    4:areturn         
	}

	static List zze(DataDeleteRequest$Builder datadeleterequest$builder)
	{
		return datadeleterequest$builder.zzaVx;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field List zzaVx>
	//    2    4:areturn         
	}

	static boolean zzf(DataDeleteRequest$Builder datadeleterequest$builder)
	{
		return datadeleterequest$builder.zzaVy;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field boolean zzaVy>
	//    2    4:ireturn         
	}

	static boolean zzg(DataDeleteRequest$Builder datadeleterequest$builder)
	{
		return datadeleterequest$builder.zzaVz;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field boolean zzaVz>
	//    2    4:ireturn         
	}

	public DataDeleteRequest$Builder addDataSource(DataSource datasource)
	{
		boolean flag;
		if(!zzaVy)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field boolean zzaVy>
	//*   2    4:ifne            12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		zzac.zzb(flag, "All data is already marked for deletion.  addDataSource() cannot be combined with deleteAllData()");
	//    8   14:iload_2         
	//    9   15:ldc1            #104 <String "All data is already marked for deletion.  addDataSource() cannot be combined with deleteAllData()">
	//   10   17:invokestatic    #107 <Method void zzac.zzb(boolean, Object)>
		if(datasource != null)
	//*  11   20:aload_1         
	//*  12   21:ifnull          29
			flag = true;
	//   13   24:iconst_1        
	//   14   25:istore_2        
		else
	//*  15   26:goto            31
			flag = false;
	//   16   29:iconst_0        
	//   17   30:istore_2        
		zzac.zzb(flag, "Must specify a valid data source");
	//   18   31:iload_2         
	//   19   32:ldc1            #109 <String "Must specify a valid data source">
	//   20   34:invokestatic    #107 <Method void zzac.zzb(boolean, Object)>
		if(!zzaVw.contains(((Object) (datasource))))
	//*  21   37:aload_0         
	//*  22   38:getfield        #29  <Field List zzaVw>
	//*  23   41:aload_1         
	//*  24   42:invokeinterface #113 <Method boolean List.contains(Object)>
	//*  25   47:ifne            61
			zzaVw.add(((Object) (datasource)));
	//   26   50:aload_0         
	//   27   51:getfield        #29  <Field List zzaVw>
	//   28   54:aload_1         
	//   29   55:invokeinterface #116 <Method boolean List.add(Object)>
	//   30   60:pop             
		return this;
	//   31   61:aload_0         
	//   32   62:areturn         
	}

	public DataDeleteRequest$Builder addDataType(DataType datatype)
	{
		boolean flag;
		if(!zzaVy)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field boolean zzaVy>
	//*   2    4:ifne            12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		zzac.zzb(flag, "All data is already marked for deletion.  addDataType() cannot be combined with deleteAllData()");
	//    8   14:iload_2         
	//    9   15:ldc1            #120 <String "All data is already marked for deletion.  addDataType() cannot be combined with deleteAllData()">
	//   10   17:invokestatic    #107 <Method void zzac.zzb(boolean, Object)>
		if(datatype != null)
	//*  11   20:aload_1         
	//*  12   21:ifnull          29
			flag = true;
	//   13   24:iconst_1        
	//   14   25:istore_2        
		else
	//*  15   26:goto            31
			flag = false;
	//   16   29:iconst_0        
	//   17   30:istore_2        
		zzac.zzb(flag, "Must specify a valid data type");
	//   18   31:iload_2         
	//   19   32:ldc1            #122 <String "Must specify a valid data type">
	//   20   34:invokestatic    #107 <Method void zzac.zzb(boolean, Object)>
		if(!zzaSs.contains(((Object) (datatype))))
	//*  21   37:aload_0         
	//*  22   38:getfield        #31  <Field List zzaSs>
	//*  23   41:aload_1         
	//*  24   42:invokeinterface #113 <Method boolean List.contains(Object)>
	//*  25   47:ifne            61
			zzaSs.add(((Object) (datatype)));
	//   26   50:aload_0         
	//   27   51:getfield        #31  <Field List zzaSs>
	//   28   54:aload_1         
	//   29   55:invokeinterface #116 <Method boolean List.add(Object)>
	//   30   60:pop             
		return this;
	//   31   61:aload_0         
	//   32   62:areturn         
	}

	public DataDeleteRequest$Builder addSession(Session session)
	{
		boolean flag;
		if(!zzaVz)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field boolean zzaVz>
	//*   2    4:ifne            12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		zzac.zzb(flag, "All sessions already marked for deletion.  addSession() cannot be combined with deleteAllSessions()");
	//    8   14:iload_2         
	//    9   15:ldc1            #126 <String "All sessions already marked for deletion.  addSession() cannot be combined with deleteAllSessions()">
	//   10   17:invokestatic    #107 <Method void zzac.zzb(boolean, Object)>
		if(session != null)
	//*  11   20:aload_1         
	//*  12   21:ifnull          29
			flag = true;
	//   13   24:iconst_1        
	//   14   25:istore_2        
		else
	//*  15   26:goto            31
			flag = false;
	//   16   29:iconst_0        
	//   17   30:istore_2        
		zzac.zzb(flag, "Must specify a valid session");
	//   18   31:iload_2         
	//   19   32:ldc1            #128 <String "Must specify a valid session">
	//   20   34:invokestatic    #107 <Method void zzac.zzb(boolean, Object)>
		if(session.getEndTime(TimeUnit.MILLISECONDS) > 0L)
	//*  21   37:aload_1         
	//*  22   38:getstatic       #66  <Field TimeUnit TimeUnit.MILLISECONDS>
	//*  23   41:invokevirtual   #75  <Method long Session.getEndTime(TimeUnit)>
	//*  24   44:lconst_0        
	//*  25   45:lcmp            
	//*  26   46:ifle            54
			flag = true;
	//   27   49:iconst_1        
	//   28   50:istore_2        
		else
	//*  29   51:goto            56
			flag = false;
	//   30   54:iconst_0        
	//   31   55:istore_2        
		zzac.zzb(flag, "Cannot delete an ongoing session. Please stop the session prior to deleting it");
	//   32   56:iload_2         
	//   33   57:ldc1            #130 <String "Cannot delete an ongoing session. Please stop the session prior to deleting it">
	//   34   59:invokestatic    #107 <Method void zzac.zzb(boolean, Object)>
		zzaVx.add(((Object) (session)));
	//   35   62:aload_0         
	//   36   63:getfield        #33  <Field List zzaVx>
	//   37   66:aload_1         
	//   38   67:invokeinterface #116 <Method boolean List.add(Object)>
	//   39   72:pop             
		return this;
	//   40   73:aload_0         
	//   41   74:areturn         
	}

	public DataDeleteRequest build()
	{
		boolean flag2;
		if(zzafe > 0L && zzaSt > zzafe)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field long zzafe>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifle            26
	//*   5    9:aload_0         
	//*   6   10:getfield        #77  <Field long zzaSt>
	//*   7   13:aload_0         
	//*   8   14:getfield        #72  <Field long zzafe>
	//*   9   17:lcmp            
	//*  10   18:ifle            26
			flag2 = true;
	//   11   21:iconst_1        
	//   12   22:istore_3        
		else
	//*  13   23:goto            28
			flag2 = false;
	//   14   26:iconst_0        
	//   15   27:istore_3        
		zzac.zza(flag2, "Must specify a valid time interval");
	//   16   28:iload_3         
	//   17   29:ldc1            #134 <String "Must specify a valid time interval">
	//   18   31:invokestatic    #136 <Method void zzac.zza(boolean, Object)>
		boolean flag;
		if(zzaVy || !zzaVw.isEmpty() || !zzaSs.isEmpty())
	//*  19   34:aload_0         
	//*  20   35:getfield        #35  <Field boolean zzaVy>
	//*  21   38:ifne            65
	//*  22   41:aload_0         
	//*  23   42:getfield        #29  <Field List zzaVw>
	//*  24   45:invokeinterface #45  <Method boolean List.isEmpty()>
	//*  25   50:ifeq            65
	//*  26   53:aload_0         
	//*  27   54:getfield        #31  <Field List zzaSs>
	//*  28   57:invokeinterface #45  <Method boolean List.isEmpty()>
	//*  29   62:ifne            70
			flag = true;
	//   30   65:iconst_1        
	//   31   66:istore_1        
		else
	//*  32   67:goto            72
			flag = false;
	//   33   70:iconst_0        
	//   34   71:istore_1        
		boolean flag1;
		if(zzaVz || !zzaVx.isEmpty())
	//*  35   72:aload_0         
	//*  36   73:getfield        #37  <Field boolean zzaVz>
	//*  37   76:ifne            91
	//*  38   79:aload_0         
	//*  39   80:getfield        #33  <Field List zzaVx>
	//*  40   83:invokeinterface #45  <Method boolean List.isEmpty()>
	//*  41   88:ifne            96
			flag1 = true;
	//   42   91:iconst_1        
	//   43   92:istore_2        
		else
	//*  44   93:goto            98
			flag1 = false;
	//   45   96:iconst_0        
	//   46   97:istore_2        
		if(flag || flag1)
	//*  47   98:iload_1         
	//*  48   99:ifne            106
	//*  49  102:iload_2         
	//*  50  103:ifeq            111
			flag2 = true;
	//   51  106:iconst_1        
	//   52  107:istore_3        
		else
	//*  53  108:goto            113
			flag2 = false;
	//   54  111:iconst_0        
	//   55  112:istore_3        
		zzac.zza(flag2, "No data or session marked for deletion");
	//   56  113:iload_3         
	//   57  114:ldc1            #138 <String "No data or session marked for deletion">
	//   58  116:invokestatic    #136 <Method void zzac.zza(boolean, Object)>
		zzCQ();
	//   59  119:aload_0         
	//   60  120:invokespecial   #140 <Method void zzCQ()>
		return new DataDeleteRequest(this, ((DataDeleteRequest._cls1) (null)));
	//   61  123:new             #6   <Class DataDeleteRequest>
	//   62  126:dup             
	//   63  127:aload_0         
	//   64  128:aconst_null     
	//   65  129:invokespecial   #143 <Method void DataDeleteRequest(DataDeleteRequest$Builder, DataDeleteRequest$1)>
	//   66  132:areturn         
	}

	public DataDeleteRequest$Builder deleteAllData()
	{
		zzac.zzb(zzaSs.isEmpty(), "Specific data type already added for deletion. deleteAllData() will delete all data types and cannot be combined with addDataType()");
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field List zzaSs>
	//    2    4:invokeinterface #45  <Method boolean List.isEmpty()>
	//    3    9:ldc1            #147 <String "Specific data type already added for deletion. deleteAllData() will delete all data types and cannot be combined with addDataType()">
	//    4   11:invokestatic    #107 <Method void zzac.zzb(boolean, Object)>
		zzac.zzb(zzaVw.isEmpty(), "Specific data source already added for deletion. deleteAllData() will delete all data sources and cannot be combined with addDataSource()");
	//    5   14:aload_0         
	//    6   15:getfield        #29  <Field List zzaVw>
	//    7   18:invokeinterface #45  <Method boolean List.isEmpty()>
	//    8   23:ldc1            #149 <String "Specific data source already added for deletion. deleteAllData() will delete all data sources and cannot be combined with addDataSource()">
	//    9   25:invokestatic    #107 <Method void zzac.zzb(boolean, Object)>
		zzaVy = true;
	//   10   28:aload_0         
	//   11   29:iconst_1        
	//   12   30:putfield        #35  <Field boolean zzaVy>
		return this;
	//   13   33:aload_0         
	//   14   34:areturn         
	}

	public DataDeleteRequest$Builder deleteAllSessions()
	{
		zzac.zzb(zzaVx.isEmpty(), "Specific session already added for deletion. deleteAllData() will delete all sessions and cannot be combined with addSession()");
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field List zzaVx>
	//    2    4:invokeinterface #45  <Method boolean List.isEmpty()>
	//    3    9:ldc1            #152 <String "Specific session already added for deletion. deleteAllData() will delete all sessions and cannot be combined with addSession()">
	//    4   11:invokestatic    #107 <Method void zzac.zzb(boolean, Object)>
		zzaVz = true;
	//    5   14:aload_0         
	//    6   15:iconst_1        
	//    7   16:putfield        #37  <Field boolean zzaVz>
		return this;
	//    8   19:aload_0         
	//    9   20:areturn         
	}

	public DataDeleteRequest$Builder setTimeInterval(long l, long l1, TimeUnit timeunit)
	{
		boolean flag;
		if(l > 0L)
	//*   0    0:lload_1         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifle            12
			flag = true;
	//    4    6:iconst_1        
	//    5    7:istore          6
		else
	//*   6    9:goto            15
			flag = false;
	//    7   12:iconst_0        
	//    8   13:istore          6
		zzac.zzb(flag, "Invalid start time :%d", new Object[] {
			Long.valueOf(l)
		});
	//    9   15:iload           6
	//   10   17:ldc1            #156 <String "Invalid start time :%d">
	//   11   19:iconst_1        
	//   12   20:anewarray       Object[]
	//   13   23:dup             
	//   14   24:iconst_0        
	//   15   25:lload_1         
	//   16   26:invokestatic    #85  <Method Long Long.valueOf(long)>
	//   17   29:aastore         
	//   18   30:invokestatic    #158 <Method void zzac.zzb(boolean, String, Object[])>
		if(l1 > l)
	//*  19   33:lload_3         
	//*  20   34:lload_1         
	//*  21   35:lcmp            
	//*  22   36:ifle            45
			flag = true;
	//   23   39:iconst_1        
	//   24   40:istore          6
		else
	//*  25   42:goto            48
			flag = false;
	//   26   45:iconst_0        
	//   27   46:istore          6
		zzac.zzb(flag, "Invalid end time :%d", new Object[] {
			Long.valueOf(l1)
		});
	//   28   48:iload           6
	//   29   50:ldc1            #160 <String "Invalid end time :%d">
	//   30   52:iconst_1        
	//   31   53:anewarray       Object[]
	//   32   56:dup             
	//   33   57:iconst_0        
	//   34   58:lload_3         
	//   35   59:invokestatic    #85  <Method Long Long.valueOf(long)>
	//   36   62:aastore         
	//   37   63:invokestatic    #158 <Method void zzac.zzb(boolean, String, Object[])>
		zzafe = timeunit.toMillis(l);
	//   38   66:aload_0         
	//   39   67:aload           5
	//   40   69:lload_1         
	//   41   70:invokevirtual   #164 <Method long TimeUnit.toMillis(long)>
	//   42   73:putfield        #72  <Field long zzafe>
		zzaSt = timeunit.toMillis(l1);
	//   43   76:aload_0         
	//   44   77:aload           5
	//   45   79:lload_3         
	//   46   80:invokevirtual   #164 <Method long TimeUnit.toMillis(long)>
	//   47   83:putfield        #77  <Field long zzaSt>
		return this;
	//   48   86:aload_0         
	//   49   87:areturn         
	}

	private List zzaSs;
	private long zzaSt;
	private List zzaVw;
	private List zzaVx;
	private boolean zzaVy;
	private boolean zzaVz;
	private long zzafe;

	public DataDeleteRequest$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		zzaVw = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #26  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #27  <Method void ArrayList()>
	//    6   12:putfield        #29  <Field List zzaVw>
		zzaSs = ((List) (new ArrayList()));
	//    7   15:aload_0         
	//    8   16:new             #26  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #27  <Method void ArrayList()>
	//   11   23:putfield        #31  <Field List zzaSs>
		zzaVx = ((List) (new ArrayList()));
	//   12   26:aload_0         
	//   13   27:new             #26  <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #27  <Method void ArrayList()>
	//   16   34:putfield        #33  <Field List zzaVx>
		zzaVy = false;
	//   17   37:aload_0         
	//   18   38:iconst_0        
	//   19   39:putfield        #35  <Field boolean zzaVy>
		zzaVz = false;
	//   20   42:aload_0         
	//   21   43:iconst_0        
	//   22   44:putfield        #37  <Field boolean zzaVz>
	//   23   47:return          
	}
}
