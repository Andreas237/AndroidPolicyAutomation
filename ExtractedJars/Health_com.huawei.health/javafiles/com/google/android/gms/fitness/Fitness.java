// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness;

import android.content.Intent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.*;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness:
//			BleApi, ConfigApi, GoalsApi, HistoryApi, 
//			RecordingApi, SensorsApi, SessionsApi

public class Fitness
{

	private Fitness()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #185 <Method void Object()>
	//    2    4:return          
	}

	public static long getEndTime(Intent intent, TimeUnit timeunit)
	{
		long l = intent.getLongExtra("vnd.google.fitness.end_time", -1L);
	//    0    0:aload_0         
	//    1    1:ldc1            #28  <String "vnd.google.fitness.end_time">
	//    2    3:ldc2w           #188 <Long -1L>
	//    3    6:invokevirtual   #195 <Method long Intent.getLongExtra(String, long)>
	//    4    9:lstore_2        
		if(l == -1L)
	//*   5   10:lload_2         
	//*   6   11:ldc2w           #188 <Long -1L>
	//*   7   14:lcmp            
	//*   8   15:ifne            22
			return -1L;
	//    9   18:ldc2w           #188 <Long -1L>
	//   10   21:lreturn         
		else
			return timeunit.convert(l, TimeUnit.MILLISECONDS);
	//   11   22:aload_1         
	//   12   23:lload_2         
	//   13   24:getstatic       #201 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   14   27:invokevirtual   #205 <Method long TimeUnit.convert(long, TimeUnit)>
	//   15   30:lreturn         
	}

	public static long getStartTime(Intent intent, TimeUnit timeunit)
	{
		long l = intent.getLongExtra("vnd.google.fitness.start_time", -1L);
	//    0    0:aload_0         
	//    1    1:ldc1            #31  <String "vnd.google.fitness.start_time">
	//    2    3:ldc2w           #188 <Long -1L>
	//    3    6:invokevirtual   #195 <Method long Intent.getLongExtra(String, long)>
	//    4    9:lstore_2        
		if(l == -1L)
	//*   5   10:lload_2         
	//*   6   11:ldc2w           #188 <Long -1L>
	//*   7   14:lcmp            
	//*   8   15:ifne            22
			return -1L;
	//    9   18:ldc2w           #188 <Long -1L>
	//   10   21:lreturn         
		else
			return timeunit.convert(l, TimeUnit.MILLISECONDS);
	//   11   22:aload_1         
	//   12   23:lload_2         
	//   13   24:getstatic       #201 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   14   27:invokevirtual   #205 <Method long TimeUnit.convert(long, TimeUnit)>
	//   15   30:lreturn         
	}

	private static BleApi zzBU()
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #212 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          16
			return ((BleApi) (new zzapj()));
	//    3    8:new             #214 <Class zzapj>
	//    4   11:dup             
	//    5   12:invokespecial   #215 <Method void zzapj()>
	//    6   15:areturn         
		else
			return ((BleApi) (new zzaps()));
	//    7   16:new             #217 <Class zzaps>
	//    8   19:dup             
	//    9   20:invokespecial   #218 <Method void zzaps()>
	//   10   23:areturn         
	}

	public static final String ACTION_TRACK = "vnd.google.fitness.TRACK";
	public static final String ACTION_VIEW = "vnd.google.fitness.VIEW";
	public static final String ACTION_VIEW_GOAL = "vnd.google.fitness.VIEW_GOAL";
	public static final Void API = null;
	public static final Api BLE_API;
	public static final BleApi BleApi = zzBU();
	public static final Api CONFIG_API;
	public static final ConfigApi ConfigApi = new zzapk();
	public static final String EXTRA_END_TIME = "vnd.google.fitness.end_time";
	public static final String EXTRA_START_TIME = "vnd.google.fitness.start_time";
	public static final Api GOALS_API;
	public static final GoalsApi GoalsApi = new zzapl();
	public static final Api HISTORY_API;
	public static final HistoryApi HistoryApi = new zzapm();
	public static final Api RECORDING_API;
	public static final RecordingApi RecordingApi = new zzapo();
	public static final Scope SCOPE_ACTIVITY_READ = new Scope("https://www.googleapis.com/auth/fitness.activity.read");
	public static final Scope SCOPE_ACTIVITY_READ_WRITE = new Scope("https://www.googleapis.com/auth/fitness.activity.write");
	public static final Scope SCOPE_BODY_READ = new Scope("https://www.googleapis.com/auth/fitness.body.read");
	public static final Scope SCOPE_BODY_READ_WRITE = new Scope("https://www.googleapis.com/auth/fitness.body.write");
	public static final Scope SCOPE_LOCATION_READ = new Scope("https://www.googleapis.com/auth/fitness.location.read");
	public static final Scope SCOPE_LOCATION_READ_WRITE = new Scope("https://www.googleapis.com/auth/fitness.location.write");
	public static final Scope SCOPE_NUTRITION_READ = new Scope("https://www.googleapis.com/auth/fitness.nutrition.read");
	public static final Scope SCOPE_NUTRITION_READ_WRITE = new Scope("https://www.googleapis.com/auth/fitness.nutrition.write");
	public static final Api SENSORS_API;
	public static final Api SESSIONS_API;
	public static final SensorsApi SensorsApi = new zzapp();
	public static final SessionsApi SessionsApi = new zzapq();
	public static final Api zzaKN;
	public static final zzapi zzaSf = new zzapn();

	static 
	{
	//    0    0:aconst_null     
	//    1    1:putstatic       #62  <Field Void API>
		SENSORS_API = zzaoj.API;
	//    2    4:getstatic       #66  <Field Api zzaoj.API>
	//    3    7:putstatic       #68  <Field Api SENSORS_API>
	//    4   10:new             #70  <Class zzapp>
	//    5   13:dup             
	//    6   14:invokespecial   #73  <Method void zzapp()>
	//    7   17:putstatic       #75  <Field SensorsApi SensorsApi>
		RECORDING_API = zzaoi.API;
	//    8   20:getstatic       #78  <Field Api zzaoi.API>
	//    9   23:putstatic       #80  <Field Api RECORDING_API>
	//   10   26:new             #82  <Class zzapo>
	//   11   29:dup             
	//   12   30:invokespecial   #83  <Method void zzapo()>
	//   13   33:putstatic       #85  <Field RecordingApi RecordingApi>
		SESSIONS_API = zzaok.API;
	//   14   36:getstatic       #88  <Field Api zzaok.API>
	//   15   39:putstatic       #90  <Field Api SESSIONS_API>
	//   16   42:new             #92  <Class zzapq>
	//   17   45:dup             
	//   18   46:invokespecial   #93  <Method void zzapq()>
	//   19   49:putstatic       #95  <Field SessionsApi SessionsApi>
		HISTORY_API = zzaog.API;
	//   20   52:getstatic       #98  <Field Api zzaog.API>
	//   21   55:putstatic       #100 <Field Api HISTORY_API>
	//   22   58:new             #102 <Class zzapm>
	//   23   61:dup             
	//   24   62:invokespecial   #103 <Method void zzapm()>
	//   25   65:putstatic       #105 <Field HistoryApi HistoryApi>
		GOALS_API = zzaof.API;
	//   26   68:getstatic       #108 <Field Api zzaof.API>
	//   27   71:putstatic       #110 <Field Api GOALS_API>
	//   28   74:new             #112 <Class zzapl>
	//   29   77:dup             
	//   30   78:invokespecial   #113 <Method void zzapl()>
	//   31   81:putstatic       #115 <Field GoalsApi GoalsApi>
		CONFIG_API = zzaoe.API;
	//   32   84:getstatic       #118 <Field Api zzaoe.API>
	//   33   87:putstatic       #120 <Field Api CONFIG_API>
	//   34   90:new             #122 <Class zzapk>
	//   35   93:dup             
	//   36   94:invokespecial   #123 <Method void zzapk()>
	//   37   97:putstatic       #125 <Field ConfigApi ConfigApi>
		BLE_API = zzaod.API;
	//   38  100:getstatic       #128 <Field Api zzaod.API>
	//   39  103:putstatic       #130 <Field Api BLE_API>
	//   40  106:invokestatic    #134 <Method BleApi zzBU()>
	//   41  109:putstatic       #136 <Field BleApi BleApi>
		zzaKN = zzaoh.API;
	//   42  112:getstatic       #139 <Field Api zzaoh.API>
	//   43  115:putstatic       #141 <Field Api zzaKN>
	//   44  118:new             #143 <Class zzapn>
	//   45  121:dup             
	//   46  122:invokespecial   #144 <Method void zzapn()>
	//   47  125:putstatic       #146 <Field zzapi zzaSf>
	//   48  128:new             #148 <Class Scope>
	//   49  131:dup             
	//   50  132:ldc1            #150 <String "https://www.googleapis.com/auth/fitness.activity.read">
	//   51  134:invokespecial   #153 <Method void Scope(String)>
	//   52  137:putstatic       #155 <Field Scope SCOPE_ACTIVITY_READ>
	//   53  140:new             #148 <Class Scope>
	//   54  143:dup             
	//   55  144:ldc1            #157 <String "https://www.googleapis.com/auth/fitness.activity.write">
	//   56  146:invokespecial   #153 <Method void Scope(String)>
	//   57  149:putstatic       #159 <Field Scope SCOPE_ACTIVITY_READ_WRITE>
	//   58  152:new             #148 <Class Scope>
	//   59  155:dup             
	//   60  156:ldc1            #161 <String "https://www.googleapis.com/auth/fitness.location.read">
	//   61  158:invokespecial   #153 <Method void Scope(String)>
	//   62  161:putstatic       #163 <Field Scope SCOPE_LOCATION_READ>
	//   63  164:new             #148 <Class Scope>
	//   64  167:dup             
	//   65  168:ldc1            #165 <String "https://www.googleapis.com/auth/fitness.location.write">
	//   66  170:invokespecial   #153 <Method void Scope(String)>
	//   67  173:putstatic       #167 <Field Scope SCOPE_LOCATION_READ_WRITE>
	//   68  176:new             #148 <Class Scope>
	//   69  179:dup             
	//   70  180:ldc1            #169 <String "https://www.googleapis.com/auth/fitness.body.read">
	//   71  182:invokespecial   #153 <Method void Scope(String)>
	//   72  185:putstatic       #171 <Field Scope SCOPE_BODY_READ>
	//   73  188:new             #148 <Class Scope>
	//   74  191:dup             
	//   75  192:ldc1            #173 <String "https://www.googleapis.com/auth/fitness.body.write">
	//   76  194:invokespecial   #153 <Method void Scope(String)>
	//   77  197:putstatic       #175 <Field Scope SCOPE_BODY_READ_WRITE>
	//   78  200:new             #148 <Class Scope>
	//   79  203:dup             
	//   80  204:ldc1            #177 <String "https://www.googleapis.com/auth/fitness.nutrition.read">
	//   81  206:invokespecial   #153 <Method void Scope(String)>
	//   82  209:putstatic       #179 <Field Scope SCOPE_NUTRITION_READ>
	//   83  212:new             #148 <Class Scope>
	//   84  215:dup             
	//   85  216:ldc1            #181 <String "https://www.googleapis.com/auth/fitness.nutrition.write">
	//   86  218:invokespecial   #153 <Method void Scope(String)>
	//   87  221:putstatic       #183 <Field Scope SCOPE_NUTRITION_READ_WRITE>
	//*  88  224:return          
	}
}
