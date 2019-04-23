// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.state;

import android.content.*;
import android.content.pm.*;
import android.location.Location;
import android.support.v4.content.LocalBroadcastManager;
import io.radar.sdk.RadarReceiver;
import io.radar.sdk.internal.*;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package io.radar.sdk.state:
//			StateManagerRepository

public final class StateManager
{

	public StateManager(Context context1, StateManagerRepository statemanagerrepository)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (context1)), "context");
	//    0    0:aload_1         
	//    1    1:ldc1            #41  <String "context">
	//    2    3:invokestatic    #47  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (statemanagerrepository)), "stateManagerRepository");
	//    3    6:aload_2         
	//    4    7:ldc1            #48  <String "stateManagerRepository">
	//    5    9:invokestatic    #47  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		super();
	//    6   12:aload_0         
	//    7   13:invokespecial   #51  <Method void Object()>
		context = context1;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #53  <Field Context context>
		stateManagerRepository = statemanagerrepository;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:putfield        #55  <Field StateManagerRepository stateManagerRepository>
	//   14   26:aload_0         
	//   15   27:bipush          70
	//   16   29:putfield        #57  <Field int THRESHOLD_DISTANCE>
	//   17   32:aload_0         
	//   18   33:ldc1            #58  <Int 0x222e0>
	//   19   35:putfield        #60  <Field int THRESHOLD_TIME>
	//   20   38:return          
	}

	private final boolean isStopped(Location location)
	{
		Location location1 = stateManagerRepository.getLastMovingLocation$sdk_release();
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field StateManagerRepository stateManagerRepository>
	//    2    4:invokevirtual   #70  <Method Location StateManagerRepository.getLastMovingLocation$sdk_release()>
	//    3    7:astore          9
		boolean flag1 = false;
	//    4    9:iconst_0        
	//    5   10:istore          4
		if(location1 != null)
	//*   6   12:aload           9
	//*   7   14:ifnull          71
		{
			float f = location.distanceTo(location1);
	//    8   17:aload_1         
	//    9   18:aload           9
	//   10   20:invokevirtual   #76  <Method float Location.distanceTo(Location)>
	//   11   23:fstore_2        
			long l = location.getTime();
	//   12   24:aload_1         
	//   13   25:invokevirtual   #80  <Method long Location.getTime()>
	//   14   28:lstore          5
			long l1 = location1.getTime();
	//   15   30:aload           9
	//   16   32:invokevirtual   #80  <Method long Location.getTime()>
	//   17   35:lstore          7
			boolean flag = flag1;
	//   18   37:iload           4
	//   19   39:istore_3        
			if(f <= (float)THRESHOLD_DISTANCE)
	//*  20   40:fload_2         
	//*  21   41:aload_0         
	//*  22   42:getfield        #57  <Field int THRESHOLD_DISTANCE>
	//*  23   45:i2f             
	//*  24   46:fcmpg           
	//*  25   47:ifgt            69
			{
				flag = flag1;
	//   26   50:iload           4
	//   27   52:istore_3        
				if(l - l1 >= (long)THRESHOLD_TIME)
	//*  28   53:lload           5
	//*  29   55:lload           7
	//*  30   57:lsub            
	//*  31   58:aload_0         
	//*  32   59:getfield        #60  <Field int THRESHOLD_TIME>
	//*  33   62:i2l             
	//*  34   63:lcmp            
	//*  35   64:iflt            69
					flag = true;
	//   36   67:iconst_1        
	//   37   68:istore_3        
			}
			return flag;
	//   38   69:iload_3         
	//   39   70:ireturn         
		} else
		{
			return false;
	//   40   71:iconst_0        
	//   41   72:ireturn         
		}
	}

	private final void saveLocation(Location location)
	{
		Location location1 = stateManagerRepository.getLastMovingLocation$sdk_release();
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field StateManagerRepository stateManagerRepository>
	//    2    4:invokevirtual   #70  <Method Location StateManagerRepository.getLastMovingLocation$sdk_release()>
	//    3    7:astore_2        
		if(location1 == null || location.distanceTo(location1) > (float)THRESHOLD_DISTANCE)
	//*   4    8:aload_2         
	//*   5    9:ifnull          26
	//*   6   12:aload_1         
	//*   7   13:aload_2         
	//*   8   14:invokevirtual   #76  <Method float Location.distanceTo(Location)>
	//*   9   17:aload_0         
	//*  10   18:getfield        #57  <Field int THRESHOLD_DISTANCE>
	//*  11   21:i2f             
	//*  12   22:fcmpl           
	//*  13   23:ifle            34
			stateManagerRepository.setLastMovingLocation$sdk_release(location);
	//   14   26:aload_0         
	//   15   27:getfield        #55  <Field StateManagerRepository stateManagerRepository>
	//   16   30:aload_1         
	//   17   31:invokevirtual   #84  <Method void StateManagerRepository.setLastMovingLocation$sdk_release(Location)>
	//   18   34:return          
	}

	private final void sendLocationUpdate(Location location, boolean flag)
	{
		location = ((Location) (RadarReceiver.Companion.createLocationIntent$sdk_release(location, flag)));
	//    0    0:getstatic       #91  <Field io.radar.sdk.RadarReceiver$Companion RadarReceiver.Companion>
	//    1    3:aload_1         
	//    2    4:iload_2         
	//    3    5:invokevirtual   #97  <Method Intent io.radar.sdk.RadarReceiver$Companion.createLocationIntent$sdk_release(Location, boolean)>
	//    4    8:astore_1        
		LocalBroadcastManager.getInstance(context).sendBroadcast(((Intent) (location)));
	//    5    9:aload_0         
	//    6   10:getfield        #53  <Field Context context>
	//    7   13:invokestatic    #103 <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #107 <Method boolean LocalBroadcastManager.sendBroadcast(Intent)>
	//   10   20:pop             
		Iterator iterator = context.getPackageManager().queryBroadcastReceivers(((Intent) (location)), 0).iterator();
	//   11   21:aload_0         
	//   12   22:getfield        #53  <Field Context context>
	//   13   25:invokevirtual   #113 <Method PackageManager Context.getPackageManager()>
	//   14   28:aload_1         
	//   15   29:iconst_0        
	//   16   30:invokevirtual   #119 <Method List PackageManager.queryBroadcastReceivers(Intent, int)>
	//   17   33:invokeinterface #125 <Method Iterator List.iterator()>
	//   18   38:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   19   39:aload_3         
	//   20   40:invokeinterface #131 <Method boolean Iterator.hasNext()>
	//   21   45:ifeq            134
			ResolveInfo resolveinfo = (ResolveInfo)iterator.next();
	//   22   48:aload_3         
	//   23   49:invokeinterface #135 <Method Object Iterator.next()>
	//   24   54:checkcast       #137 <Class ResolveInfo>
	//   25   57:astore          4
			Intent intent = new Intent(((Intent) (location)));
	//   26   59:new             #139 <Class Intent>
	//   27   62:dup             
	//   28   63:aload_1         
	//   29   64:invokespecial   #142 <Method void Intent(Intent)>
	//   30   67:astore          5
			if(Intrinsics.areEqual(((Object) (context.getPackageName())), ((Object) (resolveinfo.activityInfo.packageName))))
	//*  31   69:aload_0         
	//*  32   70:getfield        #53  <Field Context context>
	//*  33   73:invokevirtual   #146 <Method String Context.getPackageName()>
	//*  34   76:aload           4
	//*  35   78:getfield        #150 <Field ActivityInfo ResolveInfo.activityInfo>
	//*  36   81:getfield        #156 <Field String ActivityInfo.packageName>
	//*  37   84:invokestatic    #160 <Method boolean Intrinsics.areEqual(Object, Object)>
	//*  38   87:ifeq            39
			{
				intent.setComponent(new ComponentName(resolveinfo.activityInfo.applicationInfo.packageName, resolveinfo.activityInfo.name));
	//   39   90:aload           5
	//   40   92:new             #162 <Class ComponentName>
	//   41   95:dup             
	//   42   96:aload           4
	//   43   98:getfield        #150 <Field ActivityInfo ResolveInfo.activityInfo>
	//   44  101:getfield        #166 <Field ApplicationInfo ActivityInfo.applicationInfo>
	//   45  104:getfield        #169 <Field String ApplicationInfo.packageName>
	//   46  107:aload           4
	//   47  109:getfield        #150 <Field ActivityInfo ResolveInfo.activityInfo>
	//   48  112:getfield        #172 <Field String ActivityInfo.name>
	//   49  115:invokespecial   #175 <Method void ComponentName(String, String)>
	//   50  118:invokevirtual   #179 <Method Intent Intent.setComponent(ComponentName)>
	//   51  121:pop             
				context.sendBroadcast(intent);
	//   52  122:aload_0         
	//   53  123:getfield        #53  <Field Context context>
	//   54  126:aload           5
	//   55  128:invokevirtual   #181 <Method void Context.sendBroadcast(Intent)>
			}
		} while(true);
	//   56  131:goto            39
	//   57  134:return          
	}

	public final RadarState updateState$sdk_release(Location location)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (location)), "location");
	//    0    0:aload_1         
	//    1    1:ldc1            #183 <String "location">
	//    2    3:invokestatic    #47  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		boolean flag = isStopped(location);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #185 <Method boolean isStopped(Location)>
	//    6   11:istore_2        
		sendLocationUpdate(location, flag);
	//    7   12:aload_0         
	//    8   13:aload_1         
	//    9   14:iload_2         
	//   10   15:invokespecial   #187 <Method void sendLocationUpdate(Location, boolean)>
		RadarState radarstate = stateManagerRepository.getCurrentState$sdk_release();
	//   11   18:aload_0         
	//   12   19:getfield        #55  <Field StateManagerRepository stateManagerRepository>
	//   13   22:invokevirtual   #191 <Method RadarState StateManagerRepository.getCurrentState$sdk_release()>
	//   14   25:astore_3        
		if(radarstate instanceof Moving)
	//*  15   26:aload_3         
	//*  16   27:instanceof      #193 <Class Moving>
	//*  17   30:ifeq            68
		{
			if(flag)
	//*  18   33:iload_2         
	//*  19   34:ifeq            53
				radarstate = (RadarState)new Stopped(location, true);
	//   20   37:new             #195 <Class Stopped>
	//   21   40:dup             
	//   22   41:aload_1         
	//   23   42:iconst_1        
	//   24   43:invokespecial   #197 <Method void Stopped(Location, boolean)>
	//   25   46:checkcast       #199 <Class RadarState>
	//   26   49:astore_3        
			else
	//*  27   50:goto            124
				radarstate = (RadarState)new Moving(location);
	//   28   53:new             #193 <Class Moving>
	//   29   56:dup             
	//   30   57:aload_1         
	//   31   58:invokespecial   #201 <Method void Moving(Location)>
	//   32   61:checkcast       #199 <Class RadarState>
	//   33   64:astore_3        
		} else
	//*  34   65:goto            124
		if(radarstate instanceof Stopped)
	//*  35   68:aload_3         
	//*  36   69:instanceof      #195 <Class Stopped>
	//*  37   72:ifeq            112
		{
			if(flag)
	//*  38   75:iload_2         
	//*  39   76:ifeq            97
				radarstate = (RadarState)Stopped.copy$default((Stopped)radarstate, ((Location) (null)), false, 1, ((Object) (null)));
	//   40   79:aload_3         
	//   41   80:checkcast       #195 <Class Stopped>
	//   42   83:aconst_null     
	//   43   84:iconst_0        
	//   44   85:iconst_1        
	//   45   86:aconst_null     
	//   46   87:invokestatic    #205 <Method Stopped Stopped.copy$default(Stopped, Location, boolean, int, Object)>
	//   47   90:checkcast       #199 <Class RadarState>
	//   48   93:astore_3        
			else
	//*  49   94:goto            124
				radarstate = (RadarState)new Moving(location);
	//   50   97:new             #193 <Class Moving>
	//   51  100:dup             
	//   52  101:aload_1         
	//   53  102:invokespecial   #201 <Method void Moving(Location)>
	//   54  105:checkcast       #199 <Class RadarState>
	//   55  108:astore_3        
		} else
	//*  56  109:goto            124
		{
			radarstate = (RadarState)new Moving(location);
	//   57  112:new             #193 <Class Moving>
	//   58  115:dup             
	//   59  116:aload_1         
	//   60  117:invokespecial   #201 <Method void Moving(Location)>
	//   61  120:checkcast       #199 <Class RadarState>
	//   62  123:astore_3        
		}
		saveLocation(location);
	//   63  124:aload_0         
	//   64  125:aload_1         
	//   65  126:invokespecial   #207 <Method void saveLocation(Location)>
		stateManagerRepository.setCurrentState$sdk_release(radarstate);
	//   66  129:aload_0         
	//   67  130:getfield        #55  <Field StateManagerRepository stateManagerRepository>
	//   68  133:aload_3         
	//   69  134:invokevirtual   #211 <Method void StateManagerRepository.setCurrentState$sdk_release(RadarState)>
		Object obj;
		if(radarstate instanceof Stopped)
	//*  70  137:aload_3         
	//*  71  138:instanceof      #195 <Class Stopped>
	//*  72  141:ifeq            192
		{
			obj = ((Object) (new StringBuilder()));
	//   73  144:new             #213 <Class StringBuilder>
	//   74  147:dup             
	//   75  148:invokespecial   #214 <Method void StringBuilder()>
	//   76  151:astore          4
			((StringBuilder) (obj)).append("stopped(justStopped=");
	//   77  153:aload           4
	//   78  155:ldc1            #216 <String "stopped(justStopped=">
	//   79  157:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   80  160:pop             
			((StringBuilder) (obj)).append(((Stopped)radarstate).getJustStopped());
	//   81  161:aload           4
	//   82  163:aload_3         
	//   83  164:checkcast       #195 <Class Stopped>
	//   84  167:invokevirtual   #223 <Method boolean Stopped.getJustStopped()>
	//   85  170:invokevirtual   #226 <Method StringBuilder StringBuilder.append(boolean)>
	//   86  173:pop             
			((StringBuilder) (obj)).append(')');
	//   87  174:aload           4
	//   88  176:bipush          41
	//   89  178:invokevirtual   #229 <Method StringBuilder StringBuilder.append(char)>
	//   90  181:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   91  182:aload           4
	//   92  184:invokevirtual   #232 <Method String StringBuilder.toString()>
	//   93  187:astore          4
		} else
	//*  94  189:goto            196
		{
			obj = "moving";
	//   95  192:ldc1            #234 <String "moving">
	//   96  194:astore          4
		}
		RadarLogger radarlogger = RadarLogger.INSTANCE;
	//   97  196:getstatic       #240 <Field RadarLogger RadarLogger.INSTANCE>
	//   98  199:astore          5
		StringBuilder stringbuilder = new StringBuilder();
	//   99  201:new             #213 <Class StringBuilder>
	//  100  204:dup             
	//  101  205:invokespecial   #214 <Method void StringBuilder()>
	//  102  208:astore          6
		stringbuilder.append("New state ");
	//  103  210:aload           6
	//  104  212:ldc1            #242 <String "New state ">
	//  105  214:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  106  217:pop             
		stringbuilder.append(((String) (obj)));
	//  107  218:aload           6
	//  108  220:aload           4
	//  109  222:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  110  225:pop             
		stringbuilder.append(" with location (");
	//  111  226:aload           6
	//  112  228:ldc1            #244 <String " with location (">
	//  113  230:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  114  233:pop             
		stringbuilder.append(location.getLatitude());
	//  115  234:aload           6
	//  116  236:aload_1         
	//  117  237:invokevirtual   #248 <Method double Location.getLatitude()>
	//  118  240:invokevirtual   #251 <Method StringBuilder StringBuilder.append(double)>
	//  119  243:pop             
		stringbuilder.append(", ");
	//  120  244:aload           6
	//  121  246:ldc1            #253 <String ", ">
	//  122  248:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  123  251:pop             
		stringbuilder.append(location.getLongitude());
	//  124  252:aload           6
	//  125  254:aload_1         
	//  126  255:invokevirtual   #256 <Method double Location.getLongitude()>
	//  127  258:invokevirtual   #251 <Method StringBuilder StringBuilder.append(double)>
	//  128  261:pop             
		stringbuilder.append(')');
	//  129  262:aload           6
	//  130  264:bipush          41
	//  131  266:invokevirtual   #229 <Method StringBuilder StringBuilder.append(char)>
	//  132  269:pop             
		RadarLogger.d$default(radarlogger, stringbuilder.toString(), ((Throwable) (null)), 2, ((Object) (null)));
	//  133  270:aload           5
	//  134  272:aload           6
	//  135  274:invokevirtual   #232 <Method String StringBuilder.toString()>
	//  136  277:aconst_null     
	//  137  278:iconst_2        
	//  138  279:aconst_null     
	//  139  280:invokestatic    #260 <Method void RadarLogger.d$default(RadarLogger, String, Throwable, int, Object)>
		return radarstate;
	//  140  283:aload_3         
	//  141  284:areturn         
	}

	public final RadarState updateState$sdk_release(List list)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (list)), "locations");
	//    0    0:aload_1         
	//    1    1:ldc2            #263 <String "locations">
	//    2    4:invokestatic    #47  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Stopped stopped = (Stopped)null;
	//    3    7:aconst_null     
	//    4    8:checkcast       #195 <Class Stopped>
	//    5   11:astore_2        
		Iterator iterator = ((Iterable)list).iterator();
	//    6   12:aload_1         
	//    7   13:checkcast       #265 <Class Iterable>
	//    8   16:invokeinterface #266 <Method Iterator Iterable.iterator()>
	//    9   21:astore_3        
		list = ((List) (stopped));
	//   10   22:aload_2         
	//   11   23:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//   12   24:aload_3         
	//   13   25:invokeinterface #131 <Method boolean Iterator.hasNext()>
	//   14   30:ifeq            71
			Object obj = ((Object) (updateState$sdk_release((Location)iterator.next())));
	//   15   33:aload_0         
	//   16   34:aload_3         
	//   17   35:invokeinterface #135 <Method Object Iterator.next()>
	//   18   40:checkcast       #72  <Class Location>
	//   19   43:invokevirtual   #268 <Method RadarState updateState$sdk_release(Location)>
	//   20   46:astore_2        
			if(obj instanceof Stopped)
	//*  21   47:aload_2         
	//*  22   48:instanceof      #195 <Class Stopped>
	//*  23   51:ifeq            24
			{
				obj = ((Object) ((Stopped)obj));
	//   24   54:aload_2         
	//   25   55:checkcast       #195 <Class Stopped>
	//   26   58:astore_2        
				if(((Stopped) (obj)).getJustStopped())
	//*  27   59:aload_2         
	//*  28   60:invokevirtual   #223 <Method boolean Stopped.getJustStopped()>
	//*  29   63:ifeq            24
					list = ((List) (obj));
	//   30   66:aload_2         
	//   31   67:astore_1        
			}
		} while(true);
	//   32   68:goto            24
		if(list != null)
	//*  33   71:aload_1         
	//*  34   72:ifnull          80
			return (RadarState)list;
	//   35   75:aload_1         
	//   36   76:checkcast       #199 <Class RadarState>
	//   37   79:areturn         
		list = ((List) (stateManagerRepository.getCurrentState$sdk_release()));
	//   38   80:aload_0         
	//   39   81:getfield        #55  <Field StateManagerRepository stateManagerRepository>
	//   40   84:invokevirtual   #191 <Method RadarState StateManagerRepository.getCurrentState$sdk_release()>
	//   41   87:astore_1        
		if(list == null)
	//*  42   88:aload_1         
	//*  43   89:ifnonnull       95
			Intrinsics.throwNpe();
	//   44   92:invokestatic    #271 <Method void Intrinsics.throwNpe()>
		return ((RadarState) (list));
	//   45   95:aload_1         
	//   46   96:areturn         
	}

	private final int THRESHOLD_DISTANCE = 70;
	private final int THRESHOLD_TIME = 0x222e0;
	private final Context context;
	private final StateManagerRepository stateManagerRepository;
}
