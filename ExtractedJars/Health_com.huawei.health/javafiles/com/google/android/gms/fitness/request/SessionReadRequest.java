// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzapd;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//			zzba

public class SessionReadRequest extends zza
{
	public static class Builder
	{

		static String zza(Builder builder)
		{
			return builder.zzaWD;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field String zzaWD>
		//    2    4:areturn         
		}

		static String zzb(Builder builder)
		{
			return builder.zzWD;
		//    0    0:aload_0         
		//    1    1:getfield        #52  <Field String zzWD>
		//    2    4:areturn         
		}

		static long zzc(Builder builder)
		{
			return builder.zzafe;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field long zzafe>
		//    2    4:lreturn         
		}

		static long zzd(Builder builder)
		{
			return builder.zzaSt;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field long zzaSt>
		//    2    4:lreturn         
		}

		static List zze(Builder builder)
		{
			return builder.zzaSs;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field List zzaSs>
		//    2    4:areturn         
		}

		static List zzf(Builder builder)
		{
			return builder.zzaVw;
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field List zzaVw>
		//    2    4:areturn         
		}

		static boolean zzg(Builder builder)
		{
			return builder.zzaWE;
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field boolean zzaWE>
		//    2    4:ireturn         
		}

		static boolean zzh(Builder builder)
		{
			return builder.zzaVH;
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field boolean zzaVH>
		//    2    4:ireturn         
		}

		static List zzi(Builder builder)
		{
			return builder.zzaWF;
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
			return new SessionReadRequest(this);
		//   48   84:new             #6   <Class SessionReadRequest>
		//   49   87:dup             
		//   50   88:aload_0         
		//   51   89:aconst_null     
		//   52   90:invokespecial   #82  <Method void SessionReadRequest(SessionReadRequest$Builder, SessionReadRequest$1)>
		//   53   93:areturn         
		}

		public Builder enableServerQueries()
		{
			zzaVH = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #42  <Field boolean zzaVH>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder excludePackage(String s)
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

		public Builder read(DataSource datasource)
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

		public Builder read(DataType datatype)
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

		public Builder readSessionsFromAllApps()
		{
			zzaWE = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #40  <Field boolean zzaWE>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setSessionId(String s)
		{
			zzWD = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #52  <Field String zzWD>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setSessionName(String s)
		{
			zzaWD = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #49  <Field String zzaWD>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setTimeInterval(long l, long l1, TimeUnit timeunit)
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

		public Builder()
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


	SessionReadRequest(int i, String s, String s1, long l, long l1, 
			List list, List list1, boolean flag, boolean flag1, List list2, IBinder ibinder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void zza()>
		zzaiI = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #46  <Field int zzaiI>
		zzaWD = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #48  <Field String zzaWD>
		zzWD = s1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #50  <Field String zzWD>
		zzafe = l;
	//   11   19:aload_0         
	//   12   20:lload           4
	//   13   22:putfield        #52  <Field long zzafe>
		zzaSt = l1;
	//   14   25:aload_0         
	//   15   26:lload           6
	//   16   28:putfield        #54  <Field long zzaSt>
		zzaSs = list;
	//   17   31:aload_0         
	//   18   32:aload           8
	//   19   34:putfield        #56  <Field List zzaSs>
		zzaVw = list1;
	//   20   37:aload_0         
	//   21   38:aload           9
	//   22   40:putfield        #58  <Field List zzaVw>
		zzaWE = flag;
	//   23   43:aload_0         
	//   24   44:iload           10
	//   25   46:putfield        #60  <Field boolean zzaWE>
		zzaVH = flag1;
	//   26   49:aload_0         
	//   27   50:iload           11
	//   28   52:putfield        #62  <Field boolean zzaVH>
		zzaWF = list2;
	//   29   55:aload_0         
	//   30   56:aload           12
	//   31   58:putfield        #64  <Field List zzaWF>
		zzaWG = com.google.android.gms.internal.zzapd.zza.zzcH(ibinder);
	//   32   61:aload_0         
	//   33   62:aload           13
	//   34   64:invokestatic    #70  <Method zzapd com.google.android.gms.internal.zzapd$zza.zzcH(IBinder)>
	//   35   67:putfield        #72  <Field zzapd zzaWG>
	//   36   70:return          
	}

	private SessionReadRequest(Builder builder)
	{
		this(com.google.android.gms.fitness.request.Builder.zza(builder), Builder.zzb(builder), Builder.zzc(builder), Builder.zzd(builder), Builder.zze(builder), Builder.zzf(builder), Builder.zzg(builder), Builder.zzh(builder), Builder.zzi(builder), ((zzapd) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #79  <Method String com.google.android.gms.fitness.request.SessionReadRequest$Builder.zza(SessionReadRequest$Builder)>
	//    3    5:aload_1         
	//    4    6:invokestatic    #82  <Method String SessionReadRequest$Builder.zzb(SessionReadRequest$Builder)>
	//    5    9:aload_1         
	//    6   10:invokestatic    #86  <Method long SessionReadRequest$Builder.zzc(SessionReadRequest$Builder)>
	//    7   13:aload_1         
	//    8   14:invokestatic    #89  <Method long SessionReadRequest$Builder.zzd(SessionReadRequest$Builder)>
	//    9   17:aload_1         
	//   10   18:invokestatic    #93  <Method List SessionReadRequest$Builder.zze(SessionReadRequest$Builder)>
	//   11   21:aload_1         
	//   12   22:invokestatic    #96  <Method List SessionReadRequest$Builder.zzf(SessionReadRequest$Builder)>
	//   13   25:aload_1         
	//   14   26:invokestatic    #100 <Method boolean SessionReadRequest$Builder.zzg(SessionReadRequest$Builder)>
	//   15   29:aload_1         
	//   16   30:invokestatic    #103 <Method boolean SessionReadRequest$Builder.zzh(SessionReadRequest$Builder)>
	//   17   33:aload_1         
	//   18   34:invokestatic    #106 <Method List SessionReadRequest$Builder.zzi(SessionReadRequest$Builder)>
	//   19   37:aconst_null     
	//   20   38:invokespecial   #109 <Method void SessionReadRequest(String, String, long, long, List, List, boolean, boolean, List, zzapd)>
	//   21   41:return          
	}


	public SessionReadRequest(SessionReadRequest sessionreadrequest, zzapd zzapd1)
	{
		this(sessionreadrequest.zzaWD, sessionreadrequest.zzWD, sessionreadrequest.zzafe, sessionreadrequest.zzaSt, sessionreadrequest.zzaSs, sessionreadrequest.zzaVw, sessionreadrequest.zzaWE, sessionreadrequest.zzaVH, sessionreadrequest.zzaWF, zzapd1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #48  <Field String zzaWD>
	//    3    5:aload_1         
	//    4    6:getfield        #50  <Field String zzWD>
	//    5    9:aload_1         
	//    6   10:getfield        #52  <Field long zzafe>
	//    7   13:aload_1         
	//    8   14:getfield        #54  <Field long zzaSt>
	//    9   17:aload_1         
	//   10   18:getfield        #56  <Field List zzaSs>
	//   11   21:aload_1         
	//   12   22:getfield        #58  <Field List zzaVw>
	//   13   25:aload_1         
	//   14   26:getfield        #60  <Field boolean zzaWE>
	//   15   29:aload_1         
	//   16   30:getfield        #62  <Field boolean zzaVH>
	//   17   33:aload_1         
	//   18   34:getfield        #64  <Field List zzaWF>
	//   19   37:aload_2         
	//   20   38:invokespecial   #109 <Method void SessionReadRequest(String, String, long, long, List, List, boolean, boolean, List, zzapd)>
	//   21   41:return          
	}

	public SessionReadRequest(String s, String s1, long l, long l1, List list, 
			List list1, boolean flag, boolean flag1, List list2, zzapd zzapd1)
	{
		if(zzapd1 == null)
	//*   0    0:aload           12
	//*   1    2:ifnonnull       11
			zzapd1 = null;
	//    2    5:aconst_null     
	//    3    6:astore          12
		else
	//*   4    8:goto            20
			zzapd1 = ((zzapd) (zzapd1.asBinder()));
	//    5   11:aload           12
	//    6   13:invokeinterface #119 <Method IBinder zzapd.asBinder()>
	//    7   18:astore          12
		this(5, s, s1, l, l1, list, list1, flag, flag1, list2, ((IBinder) (zzapd1)));
	//    8   20:aload_0         
	//    9   21:iconst_5        
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:lload_3         
	//   13   25:lload           5
	//   14   27:aload           7
	//   15   29:aload           8
	//   16   31:iload           9
	//   17   33:iload           10
	//   18   35:aload           11
	//   19   37:aload           12
	//   20   39:invokespecial   #121 <Method void SessionReadRequest(int, String, String, long, long, List, List, boolean, boolean, List, IBinder)>
	//   21   42:return          
	}

	private boolean zzb(SessionReadRequest sessionreadrequest)
	{
		return zzaa.equal(((Object) (zzaWD)), ((Object) (sessionreadrequest.zzaWD))) && zzWD.equals(((Object) (sessionreadrequest.zzWD))) && zzafe == sessionreadrequest.zzafe && zzaSt == sessionreadrequest.zzaSt && zzaa.equal(((Object) (zzaSs)), ((Object) (sessionreadrequest.zzaSs))) && zzaa.equal(((Object) (zzaVw)), ((Object) (sessionreadrequest.zzaVw))) && zzaWE == sessionreadrequest.zzaWE && zzaWF.equals(((Object) (sessionreadrequest.zzaWF))) && zzaVH == sessionreadrequest.zzaVH;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field String zzaWD>
	//    2    4:aload_1         
	//    3    5:getfield        #48  <Field String zzaWD>
	//    4    8:invokestatic    #129 <Method boolean zzaa.equal(Object, Object)>
	//    5   11:ifeq            120
	//    6   14:aload_0         
	//    7   15:getfield        #50  <Field String zzWD>
	//    8   18:aload_1         
	//    9   19:getfield        #50  <Field String zzWD>
	//   10   22:invokevirtual   #135 <Method boolean String.equals(Object)>
	//   11   25:ifeq            120
	//   12   28:aload_0         
	//   13   29:getfield        #52  <Field long zzafe>
	//   14   32:aload_1         
	//   15   33:getfield        #52  <Field long zzafe>
	//   16   36:lcmp            
	//   17   37:ifne            120
	//   18   40:aload_0         
	//   19   41:getfield        #54  <Field long zzaSt>
	//   20   44:aload_1         
	//   21   45:getfield        #54  <Field long zzaSt>
	//   22   48:lcmp            
	//   23   49:ifne            120
	//   24   52:aload_0         
	//   25   53:getfield        #56  <Field List zzaSs>
	//   26   56:aload_1         
	//   27   57:getfield        #56  <Field List zzaSs>
	//   28   60:invokestatic    #129 <Method boolean zzaa.equal(Object, Object)>
	//   29   63:ifeq            120
	//   30   66:aload_0         
	//   31   67:getfield        #58  <Field List zzaVw>
	//   32   70:aload_1         
	//   33   71:getfield        #58  <Field List zzaVw>
	//   34   74:invokestatic    #129 <Method boolean zzaa.equal(Object, Object)>
	//   35   77:ifeq            120
	//   36   80:aload_0         
	//   37   81:getfield        #60  <Field boolean zzaWE>
	//   38   84:aload_1         
	//   39   85:getfield        #60  <Field boolean zzaWE>
	//   40   88:icmpne          120
	//   41   91:aload_0         
	//   42   92:getfield        #64  <Field List zzaWF>
	//   43   95:aload_1         
	//   44   96:getfield        #64  <Field List zzaWF>
	//   45   99:invokeinterface #138 <Method boolean List.equals(Object)>
	//   46  104:ifeq            120
	//   47  107:aload_0         
	//   48  108:getfield        #62  <Field boolean zzaVH>
	//   49  111:aload_1         
	//   50  112:getfield        #62  <Field boolean zzaVH>
	//   51  115:icmpne          120
	//   52  118:iconst_1        
	//   53  119:ireturn         
	//   54  120:iconst_0        
	//   55  121:ireturn         
	}

	public boolean equals(Object obj)
	{
		return this == obj || (obj instanceof SessionReadRequest) && zzb((SessionReadRequest)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       23
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class SessionReadRequest>
	//    5    9:ifeq            25
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class SessionReadRequest>
	//    9   17:invokespecial   #140 <Method boolean zzb(SessionReadRequest)>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public IBinder getCallbackBinder()
	{
		if(zzaWG == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field zzapd zzaWG>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return zzaWG.asBinder();
	//    5    9:aload_0         
	//    6   10:getfield        #72  <Field zzapd zzaWG>
	//    7   13:invokeinterface #119 <Method IBinder zzapd.asBinder()>
	//    8   18:areturn         
	}

	public List getDataSources()
	{
		return zzaVw;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field List zzaVw>
	//    2    4:areturn         
	}

	public List getDataTypes()
	{
		return zzaSs;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field List zzaSs>
	//    2    4:areturn         
	}

	public long getEndTime(TimeUnit timeunit)
	{
		return timeunit.convert(zzaSt, TimeUnit.MILLISECONDS);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #54  <Field long zzaSt>
	//    3    5:getstatic       #154 <Field TimeUnit TimeUnit.MILLISECONDS>
	//    4    8:invokevirtual   #158 <Method long TimeUnit.convert(long, TimeUnit)>
	//    5   11:lreturn         
	}

	public List getExcludedPackages()
	{
		return zzaWF;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field List zzaWF>
	//    2    4:areturn         
	}

	public String getSessionId()
	{
		return zzWD;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field String zzWD>
	//    2    4:areturn         
	}

	public String getSessionName()
	{
		return zzaWD;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field String zzaWD>
	//    2    4:areturn         
	}

	public long getStartTime(TimeUnit timeunit)
	{
		return timeunit.convert(zzafe, TimeUnit.MILLISECONDS);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #52  <Field long zzafe>
	//    3    5:getstatic       #154 <Field TimeUnit TimeUnit.MILLISECONDS>
	//    4    8:invokevirtual   #158 <Method long TimeUnit.convert(long, TimeUnit)>
	//    5   11:lreturn         
	}

	int getVersionCode()
	{
		return zzaiI;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int zzaiI>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			zzaWD, zzWD, Long.valueOf(zzafe), Long.valueOf(zzaSt)
		});
	//    0    0:iconst_4        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #48  <Field String zzaWD>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #50  <Field String zzWD>
	//   11   17:aastore         
	//   12   18:dup             
	//   13   19:iconst_2        
	//   14   20:aload_0         
	//   15   21:getfield        #52  <Field long zzafe>
	//   16   24:invokestatic    #175 <Method Long Long.valueOf(long)>
	//   17   27:aastore         
	//   18   28:dup             
	//   19   29:iconst_3        
	//   20   30:aload_0         
	//   21   31:getfield        #54  <Field long zzaSt>
	//   22   34:invokestatic    #175 <Method Long Long.valueOf(long)>
	//   23   37:aastore         
	//   24   38:invokestatic    #178 <Method int zzaa.hashCode(Object[])>
	//   25   41:ireturn         
	}

	public boolean includeSessionsFromAllApps()
	{
		return zzaWE;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field boolean zzaWE>
	//    2    4:ireturn         
	}

	public String toString()
	{
		return zzaa.zzv(((Object) (this))).zzg("sessionName", ((Object) (zzaWD))).zzg("sessionId", ((Object) (zzWD))).zzg("startTimeMillis", ((Object) (Long.valueOf(zzafe)))).zzg("endTimeMillis", ((Object) (Long.valueOf(zzaSt)))).zzg("dataTypes", ((Object) (zzaSs))).zzg("dataSources", ((Object) (zzaVw))).zzg("sessionsFromAllApps", ((Object) (Boolean.valueOf(zzaWE)))).zzg("excludedPackages", ((Object) (zzaWF))).zzg("useServer", ((Object) (Boolean.valueOf(zzaVH)))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #185 <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #187 <String "sessionName">
	//    3    6:aload_0         
	//    4    7:getfield        #48  <Field String zzaWD>
	//    5   10:invokevirtual   #192 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    6   13:ldc1            #194 <String "sessionId">
	//    7   15:aload_0         
	//    8   16:getfield        #50  <Field String zzWD>
	//    9   19:invokevirtual   #192 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   10   22:ldc1            #196 <String "startTimeMillis">
	//   11   24:aload_0         
	//   12   25:getfield        #52  <Field long zzafe>
	//   13   28:invokestatic    #175 <Method Long Long.valueOf(long)>
	//   14   31:invokevirtual   #192 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   15   34:ldc1            #198 <String "endTimeMillis">
	//   16   36:aload_0         
	//   17   37:getfield        #54  <Field long zzaSt>
	//   18   40:invokestatic    #175 <Method Long Long.valueOf(long)>
	//   19   43:invokevirtual   #192 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   20   46:ldc1            #200 <String "dataTypes">
	//   21   48:aload_0         
	//   22   49:getfield        #56  <Field List zzaSs>
	//   23   52:invokevirtual   #192 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   24   55:ldc1            #202 <String "dataSources">
	//   25   57:aload_0         
	//   26   58:getfield        #58  <Field List zzaVw>
	//   27   61:invokevirtual   #192 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   28   64:ldc1            #204 <String "sessionsFromAllApps">
	//   29   66:aload_0         
	//   30   67:getfield        #60  <Field boolean zzaWE>
	//   31   70:invokestatic    #209 <Method Boolean Boolean.valueOf(boolean)>
	//   32   73:invokevirtual   #192 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   33   76:ldc1            #211 <String "excludedPackages">
	//   34   78:aload_0         
	//   35   79:getfield        #64  <Field List zzaWF>
	//   36   82:invokevirtual   #192 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   37   85:ldc1            #213 <String "useServer">
	//   38   87:aload_0         
	//   39   88:getfield        #62  <Field boolean zzaVH>
	//   40   91:invokestatic    #209 <Method Boolean Boolean.valueOf(boolean)>
	//   41   94:invokevirtual   #192 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   42   97:invokevirtual   #215 <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//   43  100:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.fitness.request.zzba.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #220 <Method void com.google.android.gms.fitness.request.zzba.zza(SessionReadRequest, Parcel, int)>
	//    4    6:return          
	}

	public long zzAm()
	{
		return zzaSt;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field long zzaSt>
	//    2    4:lreturn         
	}

	public boolean zzCS()
	{
		return zzaVH;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field boolean zzaVH>
	//    2    4:ireturn         
	}

	public boolean zzDk()
	{
		return zzaWE;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field boolean zzaWE>
	//    2    4:ireturn         
	}

	public long zzqn()
	{
		return zzafe;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field long zzafe>
	//    2    4:lreturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzba();
	private final String zzWD;
	private final List zzaSs;
	private final long zzaSt;
	private final boolean zzaVH;
	private final List zzaVw;
	private final String zzaWD;
	private boolean zzaWE;
	private final List zzaWF;
	private final zzapd zzaWG;
	private final long zzafe;
	private final int zzaiI;

	static 
	{
	//    0    0:new             #36  <Class zzba>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void zzba()>
	//    3    7:putstatic       #41  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
