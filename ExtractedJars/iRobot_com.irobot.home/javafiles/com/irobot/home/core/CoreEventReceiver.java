// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.core;

import com.irobot.core.*;
import com.irobot.home.IRobotApplication;
import com.irobot.home.model.*;
import com.irobot.home.model.rest.History;
import com.irobot.home.model.rest.MissionHistory;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.*;

// Referenced classes of package com.irobot.home.core:
//			a

public class CoreEventReceiver extends a
{

	public CoreEventReceiver(IRobotApplication irobotapplication, EventBusHandler eventbushandler)
	{
		super(eventbushandler);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #12  <Method void a(EventBusHandler)>
		b = new WeakReference(((Object) (irobotapplication)));
	//    3    5:new             #14  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #17  <Method void WeakReference(Object)>
	//    7   13:putstatic       #19  <Field WeakReference b>
	//    8   16:return          
	}

	private void a(AssetEvent assetevent)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Robot robot = j.c(assetevent.assetId());
	//    2    2:aload_1         
	//    3    3:invokevirtual   #28  <Method AssetId AssetEvent.assetId()>
	//    4    6:invokestatic    #34  <Method Robot j.c(AssetId)>
	//    5    9:astore_2        
		if(robot == null) goto _L2; else goto _L1
	//    6   10:aload_2         
	//    7   11:ifnull          107
_L1:
		if(!(assetevent instanceof RobotBinFullEvent)) goto _L4; else goto _L3
	//    8   14:aload_1         
	//    9   15:instanceof      #36  <Class RobotBinFullEvent>
	//   10   18:ifeq            35
_L3:
		robot.b().a((RobotBinFullEvent)assetevent);
	//   11   21:aload_2         
	//   12   22:invokevirtual   #41  <Method MissionStatus Robot.b()>
	//   13   25:aload_1         
	//   14   26:checkcast       #36  <Class RobotBinFullEvent>
	//   15   29:invokevirtual   #46  <Method void MissionStatus.a(RobotBinFullEvent)>
		  goto _L5
	//*  16   32:goto            113
_L4:
		if(!(assetevent instanceof RobotMissionStatusEvent)) goto _L7; else goto _L6
	//   17   35:aload_1         
	//   18   36:instanceof      #48  <Class RobotMissionStatusEvent>
	//   19   39:ifeq            56
_L6:
		robot.b().a((RobotMissionStatusEvent)assetevent);
	//   20   42:aload_2         
	//   21   43:invokevirtual   #41  <Method MissionStatus Robot.b()>
	//   22   46:aload_1         
	//   23   47:checkcast       #48  <Class RobotMissionStatusEvent>
	//   24   50:invokevirtual   #51  <Method void MissionStatus.a(RobotMissionStatusEvent)>
		  goto _L5
	//*  25   53:goto            113
_L7:
		if(!(assetevent instanceof RobotBatteryLevelEvent)) goto _L9; else goto _L8
	//   26   56:aload_1         
	//   27   57:instanceof      #53  <Class RobotBatteryLevelEvent>
	//   28   60:ifeq            77
_L8:
		robot.b().a((RobotBatteryLevelEvent)assetevent);
	//   29   63:aload_2         
	//   30   64:invokevirtual   #41  <Method MissionStatus Robot.b()>
	//   31   67:aload_1         
	//   32   68:checkcast       #53  <Class RobotBatteryLevelEvent>
	//   33   71:invokevirtual   #56  <Method void MissionStatus.a(RobotBatteryLevelEvent)>
		  goto _L5
	//*  34   74:goto            113
_L9:
		if(!(assetevent instanceof RobotReadinessEvent)) goto _L11; else goto _L10
	//   35   77:aload_1         
	//   36   78:instanceof      #58  <Class RobotReadinessEvent>
	//   37   81:ifeq            121
_L10:
		robot.b().a((RobotReadinessEvent)assetevent);
	//   38   84:aload_2         
	//   39   85:invokevirtual   #41  <Method MissionStatus Robot.b()>
	//   40   88:aload_1         
	//   41   89:checkcast       #58  <Class RobotReadinessEvent>
	//   42   92:invokevirtual   #61  <Method void MissionStatus.a(RobotReadinessEvent)>
		  goto _L5
	//*  43   95:goto            113
_L13:
		o.e("CoreEventReceiver", ((String) (assetevent)));
	//   44   98:ldc1            #63  <String "CoreEventReceiver">
	//   45  100:aload_1         
	//   46  101:invokestatic    #69  <Method void o.e(String, String)>
		  goto _L5
	//*  47  104:goto            113
_L2:
		assetevent = "updateMissionStatusAndId failed: null robot";
	//   48  107:ldc1            #71  <String "updateMissionStatusAndId failed: null robot">
	//   49  109:astore_1        
		continue; /* Loop/switch isn't completed */
	//   50  110:goto            98
_L5:
		this;
	//   51  113:aload_0         
		JVM INSTR monitorexit ;
	//   52  114:monitorexit     
		return;
	//   53  115:return          
		assetevent;
	//   54  116:astore_1        
	//*  55  117:aload_0         
		throw assetevent;
	//   56  118:monitorexit     
	//   57  119:aload_1         
	//   58  120:athrow          
_L11:
		assetevent = "updateMissionStatusAndId failed: event not handled";
	//   59  121:ldc1            #73  <String "updateMissionStatusAndId failed: event not handled">
	//   60  123:astore_1        
		if(true) goto _L13; else goto _L12
	//   61  124:goto            98
_L12:
	}

	private void a(AssetGenericEvent assetgenericevent)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Robot robot = j.o(assetgenericevent.assetId());
	//    2    2:aload_1         
	//    3    3:invokevirtual   #79  <Method String AssetGenericEvent.assetId()>
	//    4    6:invokestatic    #83  <Method Robot j.o(String)>
	//    5    9:astore_2        
		if(robot == null)
			break MISSING_BLOCK_LABEL_25;
	//    6   10:aload_2         
	//    7   11:ifnull          25
		robot.b().a(assetgenericevent);
	//    8   14:aload_2         
	//    9   15:invokevirtual   #41  <Method MissionStatus Robot.b()>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #85  <Method void MissionStatus.a(AssetGenericEvent)>
		break MISSING_BLOCK_LABEL_32;
	//   12   22:goto            32
		o.e("CoreEventReceiver", "updateMissionStatusAndId failed: null robot");
	//   13   25:ldc1            #63  <String "CoreEventReceiver">
	//   14   27:ldc1            #71  <String "updateMissionStatusAndId failed: null robot">
	//   15   29:invokestatic    #69  <Method void o.e(String, String)>
		this;
	//   16   32:aload_0         
		JVM INSTR monitorexit ;
	//   17   33:monitorexit     
		return;
	//   18   34:return          
		assetgenericevent;
	//   19   35:astore_1        
	//*  20   36:aload_0         
		throw assetgenericevent;
	//   21   37:monitorexit     
	//   22   38:aload_1         
	//   23   39:athrow          
	}

	public void onAssetAccumulatedHistoryEvent(AssetAccumulatedHistoryEvent assetaccumulatedhistoryevent)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		((StringBuilder) (obj)).append("AssetAccumulatedHistoryEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc1            #95  <String "AssetAccumulatedHistoryEvent received for asset ID: ">
	//    6   11:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (obj)).append(assetaccumulatedhistoryevent.assetId().getId());
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #102 <Method AssetId AssetAccumulatedHistoryEvent.assetId()>
	//   11   20:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   23:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		o.b("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   14   27:ldc1            #63  <String "CoreEventReceiver">
	//   15   29:aload_2         
	//   16   30:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   33:invokestatic    #112 <Method void o.b(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   18   36:new             #90  <Class StringBuilder>
	//   19   39:dup             
	//   20   40:invokespecial   #93  <Method void StringBuilder()>
	//   21   43:astore_2        
		((StringBuilder) (obj)).append("** Total Job Time: ");
	//   22   44:aload_2         
	//   23   45:ldc1            #114 <String "** Total Job Time: ">
	//   24   47:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   25   50:pop             
		((StringBuilder) (obj)).append(assetaccumulatedhistoryevent.totalJobMinutes());
	//   26   51:aload_2         
	//   27   52:aload_1         
	//   28   53:invokevirtual   #118 <Method int AssetAccumulatedHistoryEvent.totalJobMinutes()>
	//   29   56:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//   30   59:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   31   60:ldc1            #63  <String "CoreEventReceiver">
	//   32   62:aload_2         
	//   33   63:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   34   66:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   35   69:new             #90  <Class StringBuilder>
	//   36   72:dup             
	//   37   73:invokespecial   #93  <Method void StringBuilder()>
	//   38   76:astore_2        
		((StringBuilder) (obj)).append("** Number of Cleaning Jobs: ");
	//   39   77:aload_2         
	//   40   78:ldc1            #125 <String "** Number of Cleaning Jobs: ">
	//   41   80:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   42   83:pop             
		((StringBuilder) (obj)).append(assetaccumulatedhistoryevent.numberOfCleaningJobs());
	//   43   84:aload_2         
	//   44   85:aload_1         
	//   45   86:invokevirtual   #128 <Method int AssetAccumulatedHistoryEvent.numberOfCleaningJobs()>
	//   46   89:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//   47   92:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   48   93:ldc1            #63  <String "CoreEventReceiver">
	//   49   95:aload_2         
	//   50   96:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   51   99:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   52  102:new             #90  <Class StringBuilder>
	//   53  105:dup             
	//   54  106:invokespecial   #93  <Method void StringBuilder()>
	//   55  109:astore_2        
		((StringBuilder) (obj)).append("** Total Distance Traveled: ");
	//   56  110:aload_2         
	//   57  111:ldc1            #130 <String "** Total Distance Traveled: ">
	//   58  113:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   59  116:pop             
		((StringBuilder) (obj)).append(assetaccumulatedhistoryevent.totalFeetTraveled());
	//   60  117:aload_2         
	//   61  118:aload_1         
	//   62  119:invokevirtual   #133 <Method int AssetAccumulatedHistoryEvent.totalFeetTraveled()>
	//   63  122:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//   64  125:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   65  126:ldc1            #63  <String "CoreEventReceiver">
	//   66  128:aload_2         
	//   67  129:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   68  132:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   69  135:new             #90  <Class StringBuilder>
	//   70  138:dup             
	//   71  139:invokespecial   #93  <Method void StringBuilder()>
	//   72  142:astore_2        
		((StringBuilder) (obj)).append("** Number of Dirt Detect Events: ");
	//   73  143:aload_2         
	//   74  144:ldc1            #135 <String "** Number of Dirt Detect Events: ">
	//   75  146:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   76  149:pop             
		((StringBuilder) (obj)).append(assetaccumulatedhistoryevent.dirtDetectCount());
	//   77  150:aload_2         
	//   78  151:aload_1         
	//   79  152:invokevirtual   #138 <Method int AssetAccumulatedHistoryEvent.dirtDetectCount()>
	//   80  155:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//   81  158:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   82  159:ldc1            #63  <String "CoreEventReceiver">
	//   83  161:aload_2         
	//   84  162:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   85  165:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   86  168:new             #90  <Class StringBuilder>
	//   87  171:dup             
	//   88  172:invokespecial   #93  <Method void StringBuilder()>
	//   89  175:astore_2        
		((StringBuilder) (obj)).append("** Total Area Cleaned: ");
	//   90  176:aload_2         
	//   91  177:ldc1            #140 <String "** Total Area Cleaned: ">
	//   92  179:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   93  182:pop             
		((StringBuilder) (obj)).append(assetaccumulatedhistoryevent.totalSquareFeetCleaned());
	//   94  183:aload_2         
	//   95  184:aload_1         
	//   96  185:invokevirtual   #143 <Method int AssetAccumulatedHistoryEvent.totalSquareFeetCleaned()>
	//   97  188:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//   98  191:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   99  192:ldc1            #63  <String "CoreEventReceiver">
	//  100  194:aload_2         
	//  101  195:invokevirtual   #110 <Method String StringBuilder.toString()>
	//  102  198:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (new StringBuilder()));
	//  103  201:new             #90  <Class StringBuilder>
	//  104  204:dup             
	//  105  205:invokespecial   #93  <Method void StringBuilder()>
	//  106  208:astore_2        
		((StringBuilder) (obj)).append("** Average Job Time: ");
	//  107  209:aload_2         
	//  108  210:ldc1            #145 <String "** Average Job Time: ">
	//  109  212:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  110  215:pop             
		((StringBuilder) (obj)).append(assetaccumulatedhistoryevent.averageMinutesPerJob());
	//  111  216:aload_2         
	//  112  217:aload_1         
	//  113  218:invokevirtual   #148 <Method int AssetAccumulatedHistoryEvent.averageMinutesPerJob()>
	//  114  221:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//  115  224:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//  116  225:ldc1            #63  <String "CoreEventReceiver">
	//  117  227:aload_2         
	//  118  228:invokevirtual   #110 <Method String StringBuilder.toString()>
	//  119  231:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (j.c(assetaccumulatedhistoryevent.assetId())));
	//  120  234:aload_1         
	//  121  235:invokevirtual   #102 <Method AssetId AssetAccumulatedHistoryEvent.assetId()>
	//  122  238:invokestatic    #34  <Method Robot j.c(AssetId)>
	//  123  241:astore_2        
		if(obj != null)
	//* 124  242:aload_2         
	//* 125  243:ifnull          254
			((Robot) (obj)).m().updateFromEvent(assetaccumulatedhistoryevent);
	//  126  246:aload_2         
	//  127  247:invokevirtual   #152 <Method History Robot.m()>
	//  128  250:aload_1         
	//  129  251:invokevirtual   #157 <Method void History.updateFromEvent(AssetAccumulatedHistoryEvent)>
	//  130  254:return          
	}

	public void onAssetAudioVersionEvent(AssetAudioVersionEvent assetaudioversionevent)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		((StringBuilder) (obj)).append("AssetAudioVersionEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc1            #162 <String "AssetAudioVersionEvent received for asset ID: ">
	//    6   11:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (obj)).append(assetaudioversionevent.assetId().getId());
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #165 <Method AssetId AssetAudioVersionEvent.assetId()>
	//   11   20:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   23:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		o.b("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   14   27:ldc1            #63  <String "CoreEventReceiver">
	//   15   29:aload_2         
	//   16   30:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   33:invokestatic    #112 <Method void o.b(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   18   36:new             #90  <Class StringBuilder>
	//   19   39:dup             
	//   20   40:invokespecial   #93  <Method void StringBuilder()>
	//   21   43:astore_2        
		((StringBuilder) (obj)).append("** Audio Version: ");
	//   22   44:aload_2         
	//   23   45:ldc1            #167 <String "** Audio Version: ">
	//   24   47:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   25   50:pop             
		((StringBuilder) (obj)).append(((int) (assetaudioversionevent.audioVersion())));
	//   26   51:aload_2         
	//   27   52:aload_1         
	//   28   53:invokevirtual   #171 <Method short AssetAudioVersionEvent.audioVersion()>
	//   29   56:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//   30   59:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   31   60:ldc1            #63  <String "CoreEventReceiver">
	//   32   62:aload_2         
	//   33   63:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   34   66:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (j.c(assetaudioversionevent.assetId())));
	//   35   69:aload_1         
	//   36   70:invokevirtual   #165 <Method AssetId AssetAudioVersionEvent.assetId()>
	//   37   73:invokestatic    #34  <Method Robot j.c(AssetId)>
	//   38   76:astore_2        
		if(obj != null)
	//*  39   77:aload_2         
	//*  40   78:ifnull          89
			((Robot) (obj)).a.a(assetaudioversionevent);
	//   41   81:aload_2         
	//   42   82:getfield        #174 <Field RobotSystem Robot.a>
	//   43   85:aload_1         
	//   44   86:invokevirtual   #178 <Method void RobotSystem.a(AssetAudioVersionEvent)>
	//   45   89:return          
	}

	public void onAssetBatteryTypeEvent(AssetBatteryTypeEvent assetbatterytypeevent)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		((StringBuilder) (obj)).append("AssetBatteryTypeEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc1            #182 <String "AssetBatteryTypeEvent received for asset ID: ">
	//    6   11:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (obj)).append(assetbatterytypeevent.assetId().getId());
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #185 <Method AssetId AssetBatteryTypeEvent.assetId()>
	//   11   20:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   23:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		o.b("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   14   27:ldc1            #63  <String "CoreEventReceiver">
	//   15   29:aload_2         
	//   16   30:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   33:invokestatic    #112 <Method void o.b(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   18   36:new             #90  <Class StringBuilder>
	//   19   39:dup             
	//   20   40:invokespecial   #93  <Method void StringBuilder()>
	//   21   43:astore_2        
		((StringBuilder) (obj)).append("** Battery Type: ");
	//   22   44:aload_2         
	//   23   45:ldc1            #187 <String "** Battery Type: ">
	//   24   47:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   25   50:pop             
		((StringBuilder) (obj)).append(assetbatterytypeevent.batteryType().name());
	//   26   51:aload_2         
	//   27   52:aload_1         
	//   28   53:invokevirtual   #191 <Method BatteryType AssetBatteryTypeEvent.batteryType()>
	//   29   56:invokevirtual   #196 <Method String BatteryType.name()>
	//   30   59:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   31   62:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   32   63:ldc1            #63  <String "CoreEventReceiver">
	//   33   65:aload_2         
	//   34   66:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   35   69:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (j.c(assetbatterytypeevent.assetId())));
	//   36   72:aload_1         
	//   37   73:invokevirtual   #185 <Method AssetId AssetBatteryTypeEvent.assetId()>
	//   38   76:invokestatic    #34  <Method Robot j.c(AssetId)>
	//   39   79:astore_2        
		if(obj != null)
	//*  40   80:aload_2         
	//*  41   81:ifnull          92
			((Robot) (obj)).a.a(assetbatterytypeevent);
	//   42   84:aload_2         
	//   43   85:getfield        #174 <Field RobotSystem Robot.a>
	//   44   88:aload_1         
	//   45   89:invokevirtual   #198 <Method void RobotSystem.a(AssetBatteryTypeEvent)>
	//   46   92:return          
	}

	public void onAssetCloudConfigEvent(AssetCloudConfigEvent assetcloudconfigevent)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		((StringBuilder) (obj)).append("AssetCloudConfigEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc1            #202 <String "AssetCloudConfigEvent received for asset ID: ">
	//    6   11:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (obj)).append(assetcloudconfigevent.assetId().getId());
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #205 <Method AssetId AssetCloudConfigEvent.assetId()>
	//   11   20:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   23:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		o.b("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   14   27:ldc1            #63  <String "CoreEventReceiver">
	//   15   29:aload_2         
	//   16   30:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   33:invokestatic    #112 <Method void o.b(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   18   36:new             #90  <Class StringBuilder>
	//   19   39:dup             
	//   20   40:invokespecial   #93  <Method void StringBuilder()>
	//   21   43:astore_2        
		((StringBuilder) (obj)).append("** Cloud URL: ");
	//   22   44:aload_2         
	//   23   45:ldc1            #207 <String "** Cloud URL: ">
	//   24   47:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   25   50:pop             
		((StringBuilder) (obj)).append(assetcloudconfigevent.cloudConfigHost());
	//   26   51:aload_2         
	//   27   52:aload_1         
	//   28   53:invokevirtual   #210 <Method String AssetCloudConfigEvent.cloudConfigHost()>
	//   29   56:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   30   59:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   31   60:ldc1            #63  <String "CoreEventReceiver">
	//   32   62:aload_2         
	//   33   63:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   34   66:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (j.c(assetcloudconfigevent.assetId())));
	//   35   69:aload_1         
	//   36   70:invokevirtual   #205 <Method AssetId AssetCloudConfigEvent.assetId()>
	//   37   73:invokestatic    #34  <Method Robot j.c(AssetId)>
	//   38   76:astore_2        
		if(obj != null)
	//*  39   77:aload_2         
	//*  40   78:ifnull          89
			((Robot) (obj)).p().a(assetcloudconfigevent);
	//   41   81:aload_2         
	//   42   82:invokevirtual   #214 <Method CloudConfig Robot.p()>
	//   43   85:aload_1         
	//   44   86:invokevirtual   #218 <Method void CloudConfig.a(AssetCloudConfigEvent)>
	//   45   89:return          
	}

	public void onAssetGenericEvent(AssetGenericEvent assetgenericevent)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("AssetGenericEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc1            #221 <String "AssetGenericEvent received for asset ID: ">
	//    6   11:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(assetgenericevent.assetId());
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #79  <Method String AssetGenericEvent.assetId()>
	//   11   20:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(" type: ");
	//   13   24:aload_2         
	//   14   25:ldc1            #223 <String " type: ">
	//   15   27:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(assetgenericevent.id());
	//   17   31:aload_2         
	//   18   32:aload_1         
	//   19   33:invokevirtual   #226 <Method String AssetGenericEvent.id()>
	//   20   36:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		o.b("CoreEventReceiver", stringbuilder.toString());
	//   22   40:ldc1            #63  <String "CoreEventReceiver">
	//   23   42:aload_2         
	//   24   43:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   25   46:invokestatic    #112 <Method void o.b(String, String)>
		a(assetgenericevent);
	//   26   49:aload_0         
	//   27   50:aload_1         
	//   28   51:invokespecial   #227 <Method void a(AssetGenericEvent)>
	//   29   54:return          
	}

	public void onAssetLocationCountryEvent(AssetLocationCountryEvent assetlocationcountryevent)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("AssetLocationCountryEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc1            #231 <String "AssetLocationCountryEvent received for asset ID: ">
	//    6   11:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(assetlocationcountryevent.assetId().getId());
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #234 <Method AssetId AssetLocationCountryEvent.assetId()>
	//   11   20:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   23:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		o.b("CoreEventReceiver", stringbuilder.toString());
	//   14   27:ldc1            #63  <String "CoreEventReceiver">
	//   15   29:aload_2         
	//   16   30:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   33:invokestatic    #112 <Method void o.b(String, String)>
		stringbuilder = new StringBuilder();
	//   18   36:new             #90  <Class StringBuilder>
	//   19   39:dup             
	//   20   40:invokespecial   #93  <Method void StringBuilder()>
	//   21   43:astore_2        
		stringbuilder.append("** Country Code: ");
	//   22   44:aload_2         
	//   23   45:ldc1            #236 <String "** Country Code: ">
	//   24   47:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   25   50:pop             
		stringbuilder.append(assetlocationcountryevent.countryCode());
	//   26   51:aload_2         
	//   27   52:aload_1         
	//   28   53:invokevirtual   #239 <Method String AssetLocationCountryEvent.countryCode()>
	//   29   56:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   30   59:pop             
		o.a("CoreEventReceiver", stringbuilder.toString());
	//   31   60:ldc1            #63  <String "CoreEventReceiver">
	//   32   62:aload_2         
	//   33   63:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   34   66:invokestatic    #123 <Method void o.a(String, String)>
	//   35   69:return          
	}

	public void onAssetLocationPostalCodeEvent(AssetLocationPostalCodeEvent assetlocationpostalcodeevent)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("AssetLocationPostalCodeEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc1            #243 <String "AssetLocationPostalCodeEvent received for asset ID: ">
	//    6   11:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(assetlocationpostalcodeevent.assetId().getId());
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #246 <Method AssetId AssetLocationPostalCodeEvent.assetId()>
	//   11   20:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   23:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		o.b("CoreEventReceiver", stringbuilder.toString());
	//   14   27:ldc1            #63  <String "CoreEventReceiver">
	//   15   29:aload_2         
	//   16   30:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   33:invokestatic    #112 <Method void o.b(String, String)>
		stringbuilder = new StringBuilder();
	//   18   36:new             #90  <Class StringBuilder>
	//   19   39:dup             
	//   20   40:invokespecial   #93  <Method void StringBuilder()>
	//   21   43:astore_2        
		stringbuilder.append("** Postal Code: ");
	//   22   44:aload_2         
	//   23   45:ldc1            #248 <String "** Postal Code: ">
	//   24   47:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   25   50:pop             
		stringbuilder.append(assetlocationpostalcodeevent.postalCode());
	//   26   51:aload_2         
	//   27   52:aload_1         
	//   28   53:invokevirtual   #251 <Method String AssetLocationPostalCodeEvent.postalCode()>
	//   29   56:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   30   59:pop             
		o.a("CoreEventReceiver", stringbuilder.toString());
	//   31   60:ldc1            #63  <String "CoreEventReceiver">
	//   32   62:aload_2         
	//   33   63:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   34   66:invokestatic    #123 <Method void o.a(String, String)>
	//   35   69:return          
	}

	public void onAssetMissingEvent(AssetMissingEvent assetmissingevent)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("AssetMissingEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc1            #255 <String "AssetMissingEvent received for asset ID: ">
	//    6   11:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(assetmissingevent.assetId().getId());
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #258 <Method AssetId AssetMissingEvent.assetId()>
	//   11   20:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   23:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		o.b("CoreEventReceiver", stringbuilder.toString());
	//   14   27:ldc1            #63  <String "CoreEventReceiver">
	//   15   29:aload_2         
	//   16   30:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   33:invokestatic    #112 <Method void o.b(String, String)>
		stringbuilder = new StringBuilder();
	//   18   36:new             #90  <Class StringBuilder>
	//   19   39:dup             
	//   20   40:invokespecial   #93  <Method void StringBuilder()>
	//   21   43:astore_2        
		stringbuilder.append("** Missing: ");
	//   22   44:aload_2         
	//   23   45:ldc2            #260 <String "** Missing: ">
	//   24   48:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
		stringbuilder.append(assetmissingevent.isMissing());
	//   26   52:aload_2         
	//   27   53:aload_1         
	//   28   54:invokevirtual   #264 <Method boolean AssetMissingEvent.isMissing()>
	//   29   57:invokevirtual   #267 <Method StringBuilder StringBuilder.append(boolean)>
	//   30   60:pop             
		o.a("CoreEventReceiver", stringbuilder.toString());
	//   31   61:ldc1            #63  <String "CoreEventReceiver">
	//   32   63:aload_2         
	//   33   64:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   34   67:invokestatic    #123 <Method void o.a(String, String)>
	//   35   70:return          
	}

	public void onAssetNetworkSettingsEvent(AssetNetworkSettingsEvent assetnetworksettingsevent)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		((StringBuilder) (obj)).append("AssetNetworkSettingsEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #271 <String "AssetNetworkSettingsEvent received for asset ID: ">
	//    6   12:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (obj)).append(assetnetworksettingsevent.assetId().getId());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #274 <Method AssetId AssetNetworkSettingsEvent.assetId()>
	//   11   21:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		o.b("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   14   28:ldc1            #63  <String "CoreEventReceiver">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #112 <Method void o.b(String, String)>
		obj = ((Object) (j.a(((java.util.List) (assetnetworksettingsevent.bssid())))));
	//   18   37:aload_1         
	//   19   38:invokevirtual   #278 <Method ArrayList AssetNetworkSettingsEvent.bssid()>
	//   20   41:invokestatic    #281 <Method String j.a(java.util.List)>
	//   21   44:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   22   45:new             #90  <Class StringBuilder>
	//   23   48:dup             
	//   24   49:invokespecial   #93  <Method void StringBuilder()>
	//   25   52:astore_3        
		stringbuilder.append("** DHCP Enabled: ");
	//   26   53:aload_3         
	//   27   54:ldc2            #283 <String "** DHCP Enabled: ">
	//   28   57:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   29   60:pop             
		stringbuilder.append(assetnetworksettingsevent.isDhcpEnabled());
	//   30   61:aload_3         
	//   31   62:aload_1         
	//   32   63:invokevirtual   #286 <Method boolean AssetNetworkSettingsEvent.isDhcpEnabled()>
	//   33   66:invokevirtual   #267 <Method StringBuilder StringBuilder.append(boolean)>
	//   34   69:pop             
		o.a("CoreEventReceiver", stringbuilder.toString());
	//   35   70:ldc1            #63  <String "CoreEventReceiver">
	//   36   72:aload_3         
	//   37   73:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   38   76:invokestatic    #123 <Method void o.a(String, String)>
		stringbuilder = new StringBuilder();
	//   39   79:new             #90  <Class StringBuilder>
	//   40   82:dup             
	//   41   83:invokespecial   #93  <Method void StringBuilder()>
	//   42   86:astore_3        
		stringbuilder.append("** Subnet Mask: ");
	//   43   87:aload_3         
	//   44   88:ldc2            #288 <String "** Subnet Mask: ">
	//   45   91:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   46   94:pop             
		stringbuilder.append(NetworkAddress.IPv4NumericToDottedDecimal(assetnetworksettingsevent.subnetMask()));
	//   47   95:aload_3         
	//   48   96:aload_1         
	//   49   97:invokevirtual   #292 <Method long AssetNetworkSettingsEvent.subnetMask()>
	//   50  100:invokestatic    #298 <Method String NetworkAddress.IPv4NumericToDottedDecimal(long)>
	//   51  103:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   52  106:pop             
		o.a("CoreEventReceiver", stringbuilder.toString());
	//   53  107:ldc1            #63  <String "CoreEventReceiver">
	//   54  109:aload_3         
	//   55  110:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   56  113:invokestatic    #123 <Method void o.a(String, String)>
		stringbuilder = new StringBuilder();
	//   57  116:new             #90  <Class StringBuilder>
	//   58  119:dup             
	//   59  120:invokespecial   #93  <Method void StringBuilder()>
	//   60  123:astore_3        
		stringbuilder.append("** Gateway: ");
	//   61  124:aload_3         
	//   62  125:ldc2            #300 <String "** Gateway: ">
	//   63  128:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   64  131:pop             
		stringbuilder.append(NetworkAddress.IPv4NumericToDottedDecimal(assetnetworksettingsevent.gateway()));
	//   65  132:aload_3         
	//   66  133:aload_1         
	//   67  134:invokevirtual   #303 <Method long AssetNetworkSettingsEvent.gateway()>
	//   68  137:invokestatic    #298 <Method String NetworkAddress.IPv4NumericToDottedDecimal(long)>
	//   69  140:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   70  143:pop             
		o.a("CoreEventReceiver", stringbuilder.toString());
	//   71  144:ldc1            #63  <String "CoreEventReceiver">
	//   72  146:aload_3         
	//   73  147:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   74  150:invokestatic    #123 <Method void o.a(String, String)>
		stringbuilder = new StringBuilder();
	//   75  153:new             #90  <Class StringBuilder>
	//   76  156:dup             
	//   77  157:invokespecial   #93  <Method void StringBuilder()>
	//   78  160:astore_3        
		stringbuilder.append("** DNS1: ");
	//   79  161:aload_3         
	//   80  162:ldc2            #305 <String "** DNS1: ">
	//   81  165:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   82  168:pop             
		stringbuilder.append(NetworkAddress.IPv4NumericToDottedDecimal(assetnetworksettingsevent.dns1()));
	//   83  169:aload_3         
	//   84  170:aload_1         
	//   85  171:invokevirtual   #308 <Method long AssetNetworkSettingsEvent.dns1()>
	//   86  174:invokestatic    #298 <Method String NetworkAddress.IPv4NumericToDottedDecimal(long)>
	//   87  177:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   88  180:pop             
		o.a("CoreEventReceiver", stringbuilder.toString());
	//   89  181:ldc1            #63  <String "CoreEventReceiver">
	//   90  183:aload_3         
	//   91  184:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   92  187:invokestatic    #123 <Method void o.a(String, String)>
		stringbuilder = new StringBuilder();
	//   93  190:new             #90  <Class StringBuilder>
	//   94  193:dup             
	//   95  194:invokespecial   #93  <Method void StringBuilder()>
	//   96  197:astore_3        
		stringbuilder.append("** DNS2: ");
	//   97  198:aload_3         
	//   98  199:ldc2            #310 <String "** DNS2: ">
	//   99  202:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  100  205:pop             
		stringbuilder.append(NetworkAddress.IPv4NumericToDottedDecimal(assetnetworksettingsevent.dns2()));
	//  101  206:aload_3         
	//  102  207:aload_1         
	//  103  208:invokevirtual   #313 <Method long AssetNetworkSettingsEvent.dns2()>
	//  104  211:invokestatic    #298 <Method String NetworkAddress.IPv4NumericToDottedDecimal(long)>
	//  105  214:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  106  217:pop             
		o.a("CoreEventReceiver", stringbuilder.toString());
	//  107  218:ldc1            #63  <String "CoreEventReceiver">
	//  108  220:aload_3         
	//  109  221:invokevirtual   #110 <Method String StringBuilder.toString()>
	//  110  224:invokestatic    #123 <Method void o.a(String, String)>
		stringbuilder = new StringBuilder();
	//  111  227:new             #90  <Class StringBuilder>
	//  112  230:dup             
	//  113  231:invokespecial   #93  <Method void StringBuilder()>
	//  114  234:astore_3        
		stringbuilder.append("** BSSID: ");
	//  115  235:aload_3         
	//  116  236:ldc2            #315 <String "** BSSID: ">
	//  117  239:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  118  242:pop             
		stringbuilder.append(((String) (obj)));
	//  119  243:aload_3         
	//  120  244:aload_2         
	//  121  245:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  122  248:pop             
		o.a("CoreEventReceiver", stringbuilder.toString());
	//  123  249:ldc1            #63  <String "CoreEventReceiver">
	//  124  251:aload_3         
	//  125  252:invokevirtual   #110 <Method String StringBuilder.toString()>
	//  126  255:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (new StringBuilder()));
	//  127  258:new             #90  <Class StringBuilder>
	//  128  261:dup             
	//  129  262:invokespecial   #93  <Method void StringBuilder()>
	//  130  265:astore_2        
		((StringBuilder) (obj)).append("** Security Type: ");
	//  131  266:aload_2         
	//  132  267:ldc2            #317 <String "** Security Type: ">
	//  133  270:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  134  273:pop             
		((StringBuilder) (obj)).append(assetnetworksettingsevent.securityType().name());
	//  135  274:aload_2         
	//  136  275:aload_1         
	//  137  276:invokevirtual   #321 <Method WifiSecurityType AssetNetworkSettingsEvent.securityType()>
	//  138  279:invokevirtual   #324 <Method String WifiSecurityType.name()>
	//  139  282:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  140  285:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//  141  286:ldc1            #63  <String "CoreEventReceiver">
	//  142  288:aload_2         
	//  143  289:invokevirtual   #110 <Method String StringBuilder.toString()>
	//  144  292:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (j.c(assetnetworksettingsevent.assetId())));
	//  145  295:aload_1         
	//  146  296:invokevirtual   #274 <Method AssetId AssetNetworkSettingsEvent.assetId()>
	//  147  299:invokestatic    #34  <Method Robot j.c(AssetId)>
	//  148  302:astore_2        
		if(obj != null)
	//* 149  303:aload_2         
	//* 150  304:ifnull          315
			((Robot) (obj)).d().a(assetnetworksettingsevent);
	//  151  307:aload_2         
	//  152  308:invokevirtual   #328 <Method NetworkSettings Robot.d()>
	//  153  311:aload_1         
	//  154  312:invokevirtual   #332 <Method void NetworkSettings.a(AssetNetworkSettingsEvent)>
	//  155  315:return          
	}

	public void onAssetNetworkStatusEvent(AssetNetworkStatusEvent assetnetworkstatusevent)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		((StringBuilder) (obj)).append("AssetNetworkStatusEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #336 <String "AssetNetworkStatusEvent received for asset ID: ">
	//    6   12:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (obj)).append(assetnetworkstatusevent.assetId().getId());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #339 <Method AssetId AssetNetworkStatusEvent.assetId()>
	//   11   21:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		o.b("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   14   28:ldc1            #63  <String "CoreEventReceiver">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #112 <Method void o.b(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   18   37:new             #90  <Class StringBuilder>
	//   19   40:dup             
	//   20   41:invokespecial   #93  <Method void StringBuilder()>
	//   21   44:astore_2        
		((StringBuilder) (obj)).append("** Connection State: ");
	//   22   45:aload_2         
	//   23   46:ldc2            #341 <String "** Connection State: ">
	//   24   49:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
		((StringBuilder) (obj)).append(assetnetworkstatusevent.stationState().name());
	//   26   53:aload_2         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #345 <Method StationConnectionState AssetNetworkStatusEvent.stationState()>
	//   29   58:invokevirtual   #348 <Method String StationConnectionState.name()>
	//   30   61:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   31   64:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   32   65:ldc1            #63  <String "CoreEventReceiver">
	//   33   67:aload_2         
	//   34   68:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   35   71:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   36   74:new             #90  <Class StringBuilder>
	//   37   77:dup             
	//   38   78:invokespecial   #93  <Method void StringBuilder()>
	//   39   81:astore_2        
		((StringBuilder) (obj)).append("** Cloud State: ");
	//   40   82:aload_2         
	//   41   83:ldc2            #350 <String "** Cloud State: ">
	//   42   86:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   43   89:pop             
		((StringBuilder) (obj)).append(assetnetworkstatusevent.cloudState().name());
	//   44   90:aload_2         
	//   45   91:aload_1         
	//   46   92:invokevirtual   #354 <Method CloudServerState AssetNetworkStatusEvent.cloudState()>
	//   47   95:invokevirtual   #357 <Method String CloudServerState.name()>
	//   48   98:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   49  101:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   50  102:ldc1            #63  <String "CoreEventReceiver">
	//   51  104:aload_2         
	//   52  105:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   53  108:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (j.c(assetnetworkstatusevent.assetId())));
	//   54  111:aload_1         
	//   55  112:invokevirtual   #339 <Method AssetId AssetNetworkStatusEvent.assetId()>
	//   56  115:invokestatic    #34  <Method Robot j.c(AssetId)>
	//   57  118:astore_2        
		if(obj != null)
	//*  58  119:aload_2         
	//*  59  120:ifnull          131
			((Robot) (obj)).d().a(assetnetworkstatusevent);
	//   60  123:aload_2         
	//   61  124:invokevirtual   #328 <Method NetworkSettings Robot.d()>
	//   62  127:aload_1         
	//   63  128:invokevirtual   #359 <Method void NetworkSettings.a(AssetNetworkStatusEvent)>
	//   64  131:return          
	}

	public void onAssetOtaUpdateStatusEvent(AssetOtaUpdateStatusEvent assetotaupdatestatusevent)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		((StringBuilder) (obj)).append("AssetOtaUpdateStatusEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #363 <String "AssetOtaUpdateStatusEvent received for asset ID: ">
	//    6   12:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (obj)).append(assetotaupdatestatusevent.assetId().getId());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #366 <Method AssetId AssetOtaUpdateStatusEvent.assetId()>
	//   11   21:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		o.b("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   14   28:ldc1            #63  <String "CoreEventReceiver">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #112 <Method void o.b(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   18   37:new             #90  <Class StringBuilder>
	//   19   40:dup             
	//   20   41:invokespecial   #93  <Method void StringBuilder()>
	//   21   44:astore_2        
		((StringBuilder) (obj)).append("** OTA Status: ");
	//   22   45:aload_2         
	//   23   46:ldc2            #368 <String "** OTA Status: ">
	//   24   49:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
		((StringBuilder) (obj)).append(assetotaupdatestatusevent.status().name());
	//   26   53:aload_2         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #372 <Method OtaUpdateStatus AssetOtaUpdateStatusEvent.status()>
	//   29   58:invokevirtual   #375 <Method String OtaUpdateStatus.name()>
	//   30   61:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   31   64:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   32   65:ldc1            #63  <String "CoreEventReceiver">
	//   33   67:aload_2         
	//   34   68:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   35   71:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   36   74:new             #90  <Class StringBuilder>
	//   37   77:dup             
	//   38   78:invokespecial   #93  <Method void StringBuilder()>
	//   39   81:astore_2        
		((StringBuilder) (obj)).append("** OTA Error: ");
	//   40   82:aload_2         
	//   41   83:ldc2            #377 <String "** OTA Error: ">
	//   42   86:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   43   89:pop             
		((StringBuilder) (obj)).append(assetotaupdatestatusevent.error().name());
	//   44   90:aload_2         
	//   45   91:aload_1         
	//   46   92:invokevirtual   #381 <Method OtaUpdateError AssetOtaUpdateStatusEvent.error()>
	//   47   95:invokevirtual   #384 <Method String OtaUpdateError.name()>
	//   48   98:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   49  101:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   50  102:ldc1            #63  <String "CoreEventReceiver">
	//   51  104:aload_2         
	//   52  105:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   53  108:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   54  111:new             #90  <Class StringBuilder>
	//   55  114:dup             
	//   56  115:invokespecial   #93  <Method void StringBuilder()>
	//   57  118:astore_2        
		((StringBuilder) (obj)).append("** Package Label: ");
	//   58  119:aload_2         
	//   59  120:ldc2            #386 <String "** Package Label: ">
	//   60  123:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   61  126:pop             
		((StringBuilder) (obj)).append(assetotaupdatestatusevent.packageLabel());
	//   62  127:aload_2         
	//   63  128:aload_1         
	//   64  129:invokevirtual   #389 <Method String AssetOtaUpdateStatusEvent.packageLabel()>
	//   65  132:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   66  135:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   67  136:ldc1            #63  <String "CoreEventReceiver">
	//   68  138:aload_2         
	//   69  139:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   70  142:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (j.c(assetotaupdatestatusevent.assetId())));
	//   71  145:aload_1         
	//   72  146:invokevirtual   #366 <Method AssetId AssetOtaUpdateStatusEvent.assetId()>
	//   73  149:invokestatic    #34  <Method Robot j.c(AssetId)>
	//   74  152:astore_2        
		if(obj != null)
	//*  75  153:aload_2         
	//*  76  154:ifnull          165
			((Robot) (obj)).o().a(assetotaupdatestatusevent);
	//   77  157:aload_2         
	//   78  158:invokevirtual   #392 <Method OtaUpgradeStatus Robot.o()>
	//   79  161:aload_1         
	//   80  162:invokevirtual   #396 <Method void OtaUpgradeStatus.a(AssetOtaUpdateStatusEvent)>
	//   81  165:return          
	}

	public void onAssetRegistrationDateEvent(AssetRegistrationDateEvent assetregistrationdateevent)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("AssetRegistrationDateEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #400 <String "AssetRegistrationDateEvent received for asset ID: ">
	//    6   12:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(assetregistrationdateevent.assetId().getId());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #403 <Method AssetId AssetRegistrationDateEvent.assetId()>
	//   11   21:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		o.b("CoreEventReceiver", stringbuilder.toString());
	//   14   28:ldc1            #63  <String "CoreEventReceiver">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #112 <Method void o.b(String, String)>
		stringbuilder = new StringBuilder();
	//   18   37:new             #90  <Class StringBuilder>
	//   19   40:dup             
	//   20   41:invokespecial   #93  <Method void StringBuilder()>
	//   21   44:astore_2        
		stringbuilder.append("** Registration Date: ");
	//   22   45:aload_2         
	//   23   46:ldc2            #405 <String "** Registration Date: ">
	//   24   49:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
		stringbuilder.append(((Object) (assetregistrationdateevent.registrationDate())));
	//   26   53:aload_2         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #409 <Method Date AssetRegistrationDateEvent.registrationDate()>
	//   29   58:invokevirtual   #412 <Method StringBuilder StringBuilder.append(Object)>
	//   30   61:pop             
		o.a("CoreEventReceiver", stringbuilder.toString());
	//   31   62:ldc1            #63  <String "CoreEventReceiver">
	//   32   64:aload_2         
	//   33   65:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   34   68:invokestatic    #123 <Method void o.a(String, String)>
		Robot robot = j.c(assetregistrationdateevent.assetId());
	//   35   71:aload_1         
	//   36   72:invokevirtual   #403 <Method AssetId AssetRegistrationDateEvent.assetId()>
	//   37   75:invokestatic    #34  <Method Robot j.c(AssetId)>
	//   38   78:astore_3        
		if(robot != null)
	//*  39   79:aload_3         
	//*  40   80:ifnull          165
		{
			if(assetregistrationdateevent.registrationDate().getTime() < 0L)
	//*  41   83:aload_1         
	//*  42   84:invokevirtual   #409 <Method Date AssetRegistrationDateEvent.registrationDate()>
	//*  43   87:invokevirtual   #417 <Method long Date.getTime()>
	//*  44   90:lconst_0        
	//*  45   91:lcmp            
	//*  46   92:ifge            154
			{
				String s = robot.a().e().a();
	//   47   95:aload_3         
	//   48   96:invokevirtual   #420 <Method RobotPreferences Robot.a()>
	//   49   99:invokevirtual   #425 <Method RobotAxedaPreferences RobotPreferences.e()>
	//   50  102:invokevirtual   #429 <Method String RobotAxedaPreferences.a()>
	//   51  105:astore_2        
				assetregistrationdateevent = ((AssetRegistrationDateEvent) (s));
	//   52  106:aload_2         
	//   53  107:astore_1        
				if(!j.i(s))
	//*  54  108:aload_2         
	//*  55  109:invokestatic    #433 <Method boolean j.i(String)>
	//*  56  112:ifne            139
					assetregistrationdateevent = ((AssetRegistrationDateEvent) ((new SimpleDateFormat("yyyy-MM-dd", Locale.US)).format(new Date())));
	//   57  115:new             #435 <Class SimpleDateFormat>
	//   58  118:dup             
	//   59  119:ldc2            #437 <String "yyyy-MM-dd">
	//   60  122:getstatic       #443 <Field Locale Locale.US>
	//   61  125:invokespecial   #446 <Method void SimpleDateFormat(String, Locale)>
	//   62  128:new             #414 <Class Date>
	//   63  131:dup             
	//   64  132:invokespecial   #447 <Method void Date()>
	//   65  135:invokevirtual   #451 <Method String SimpleDateFormat.format(Date)>
	//   66  138:astore_1        
				Assembler.getInstance().getCommandTierAgent(robot.s()).setRegistrationDate(((String) (assetregistrationdateevent)));
	//   67  139:invokestatic    #457 <Method Assembler Assembler.getInstance()>
	//   68  142:aload_3         
	//   69  143:invokevirtual   #460 <Method AssetId Robot.s()>
	//   70  146:invokevirtual   #464 <Method CommandTierAgent Assembler.getCommandTierAgent(AssetId)>
	//   71  149:aload_1         
	//   72  150:invokevirtual   #470 <Method void CommandTierAgent.setRegistrationDate(String)>
				return;
	//   73  153:return          
			}
			robot.a().e().a(assetregistrationdateevent);
	//   74  154:aload_3         
	//   75  155:invokevirtual   #420 <Method RobotPreferences Robot.a()>
	//   76  158:invokevirtual   #425 <Method RobotAxedaPreferences RobotPreferences.e()>
	//   77  161:aload_1         
	//   78  162:invokevirtual   #472 <Method void RobotAxedaPreferences.a(AssetRegistrationDateEvent)>
		}
	//   79  165:return          
	}

	public void onAssetSkuEvent(AssetSkuEvent assetskuevent)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		((StringBuilder) (obj)).append("AssetSkuEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #476 <String "AssetSkuEvent received for asset ID: ">
	//    6   12:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (obj)).append(assetskuevent.assetId().getId());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #479 <Method AssetId AssetSkuEvent.assetId()>
	//   11   21:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		o.b("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   14   28:ldc1            #63  <String "CoreEventReceiver">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #112 <Method void o.b(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   18   37:new             #90  <Class StringBuilder>
	//   19   40:dup             
	//   20   41:invokespecial   #93  <Method void StringBuilder()>
	//   21   44:astore_2        
		((StringBuilder) (obj)).append("** Robot sku: ");
	//   22   45:aload_2         
	//   23   46:ldc2            #481 <String "** Robot sku: ">
	//   24   49:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
		((StringBuilder) (obj)).append(assetskuevent.sku());
	//   26   53:aload_2         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #484 <Method String AssetSkuEvent.sku()>
	//   29   58:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   30   61:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   31   62:ldc1            #63  <String "CoreEventReceiver">
	//   32   64:aload_2         
	//   33   65:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   34   68:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (j.c(assetskuevent.assetId())));
	//   35   71:aload_1         
	//   36   72:invokevirtual   #479 <Method AssetId AssetSkuEvent.assetId()>
	//   37   75:invokestatic    #34  <Method Robot j.c(AssetId)>
	//   38   78:astore_2        
		if(obj != null)
	//*  39   79:aload_2         
	//*  40   80:ifnull          88
			((Robot) (obj)).a(assetskuevent);
	//   41   83:aload_2         
	//   42   84:aload_1         
	//   43   85:invokevirtual   #486 <Method void Robot.a(AssetSkuEvent)>
	//   44   88:return          
	}

	public void onAssetSkuFailureEvent(AssetSkuFailureEvent assetskufailureevent)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("AssetSkuFailureEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #490 <String "AssetSkuFailureEvent received for asset ID: ">
	//    6   12:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(assetskufailureevent.assetId().getId());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #493 <Method AssetId AssetSkuFailureEvent.assetId()>
	//   11   21:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		o.b("CoreEventReceiver", stringbuilder.toString());
	//   14   28:ldc1            #63  <String "CoreEventReceiver">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #112 <Method void o.b(String, String)>
		assetskufailureevent = ((AssetSkuFailureEvent) (j.c(assetskufailureevent.assetId())));
	//   18   37:aload_1         
	//   19   38:invokevirtual   #493 <Method AssetId AssetSkuFailureEvent.assetId()>
	//   20   41:invokestatic    #34  <Method Robot j.c(AssetId)>
	//   21   44:astore_1        
		if(assetskufailureevent != null)
	//*  22   45:aload_1         
	//*  23   46:ifnull          53
			((Robot) (assetskufailureevent)).y();
	//   24   49:aload_1         
	//   25   50:invokevirtual   #496 <Method void Robot.y()>
	//   26   53:return          
	}

	public void onAssetSoftwareLastUpdatedEvent(AssetSoftwareLastUpdatedEvent assetsoftwarelastupdatedevent)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("AssetSoftwareLastUpdatedEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #500 <String "AssetSoftwareLastUpdatedEvent received for asset ID: ">
	//    6   12:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(assetsoftwarelastupdatedevent.assetId().getId());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #503 <Method AssetId AssetSoftwareLastUpdatedEvent.assetId()>
	//   11   21:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		o.b("CoreEventReceiver", stringbuilder.toString());
	//   14   28:ldc1            #63  <String "CoreEventReceiver">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #112 <Method void o.b(String, String)>
		stringbuilder = new StringBuilder();
	//   18   37:new             #90  <Class StringBuilder>
	//   19   40:dup             
	//   20   41:invokespecial   #93  <Method void StringBuilder()>
	//   21   44:astore_2        
		stringbuilder.append("** Software Last Updated: ");
	//   22   45:aload_2         
	//   23   46:ldc2            #505 <String "** Software Last Updated: ">
	//   24   49:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
		stringbuilder.append(((Object) (assetsoftwarelastupdatedevent.lastUpdateTime())));
	//   26   53:aload_2         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #508 <Method Date AssetSoftwareLastUpdatedEvent.lastUpdateTime()>
	//   29   58:invokevirtual   #412 <Method StringBuilder StringBuilder.append(Object)>
	//   30   61:pop             
		o.a("CoreEventReceiver", stringbuilder.toString());
	//   31   62:ldc1            #63  <String "CoreEventReceiver">
	//   32   64:aload_2         
	//   33   65:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   34   68:invokestatic    #123 <Method void o.a(String, String)>
	//   35   71:return          
	}

	public void onAssetSoftwareVersionEvent(AssetSoftwareVersionEvent assetsoftwareversionevent)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("AssetSoftwareVersionEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #512 <String "AssetSoftwareVersionEvent received for asset ID: ">
	//    6   12:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(assetsoftwareversionevent.assetId().getId());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #515 <Method AssetId AssetSoftwareVersionEvent.assetId()>
	//   11   21:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		o.b("CoreEventReceiver", stringbuilder.toString());
	//   14   28:ldc1            #63  <String "CoreEventReceiver">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #112 <Method void o.b(String, String)>
		stringbuilder = new StringBuilder();
	//   18   37:new             #90  <Class StringBuilder>
	//   19   40:dup             
	//   20   41:invokespecial   #93  <Method void StringBuilder()>
	//   21   44:astore_2        
		stringbuilder.append("** Software Version: ");
	//   22   45:aload_2         
	//   23   46:ldc2            #517 <String "** Software Version: ">
	//   24   49:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
		stringbuilder.append(assetsoftwareversionevent.softwareVersion());
	//   26   53:aload_2         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #520 <Method String AssetSoftwareVersionEvent.softwareVersion()>
	//   29   58:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   30   61:pop             
		o.a("CoreEventReceiver", stringbuilder.toString());
	//   31   62:ldc1            #63  <String "CoreEventReceiver">
	//   32   64:aload_2         
	//   33   65:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   34   68:invokestatic    #123 <Method void o.a(String, String)>
	//   35   71:return          
	}

	public void onAssetTimeEvent(AssetTimeEvent assettimeevent)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		((StringBuilder) (obj)).append("AssetTimeEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #524 <String "AssetTimeEvent received for asset ID: ">
	//    6   12:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (obj)).append(assettimeevent.assetId().getId());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #527 <Method AssetId AssetTimeEvent.assetId()>
	//   11   21:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		o.b("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   14   28:ldc1            #63  <String "CoreEventReceiver">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #112 <Method void o.b(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   18   37:new             #90  <Class StringBuilder>
	//   19   40:dup             
	//   20   41:invokespecial   #93  <Method void StringBuilder()>
	//   21   44:astore_2        
		((StringBuilder) (obj)).append("** Day: ");
	//   22   45:aload_2         
	//   23   46:ldc2            #529 <String "** Day: ">
	//   24   49:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
		((StringBuilder) (obj)).append(assettimeevent.day().name());
	//   26   53:aload_2         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #533 <Method DayOfTheWeek AssetTimeEvent.day()>
	//   29   58:invokevirtual   #536 <Method String DayOfTheWeek.name()>
	//   30   61:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   31   64:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   32   65:ldc1            #63  <String "CoreEventReceiver">
	//   33   67:aload_2         
	//   34   68:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   35   71:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   36   74:new             #90  <Class StringBuilder>
	//   37   77:dup             
	//   38   78:invokespecial   #93  <Method void StringBuilder()>
	//   39   81:astore_2        
		((StringBuilder) (obj)).append("** Hour: ");
	//   40   82:aload_2         
	//   41   83:ldc2            #538 <String "** Hour: ">
	//   42   86:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   43   89:pop             
		((StringBuilder) (obj)).append(((int) (assettimeevent.hour())));
	//   44   90:aload_2         
	//   45   91:aload_1         
	//   46   92:invokevirtual   #541 <Method short AssetTimeEvent.hour()>
	//   47   95:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//   48   98:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   49   99:ldc1            #63  <String "CoreEventReceiver">
	//   50  101:aload_2         
	//   51  102:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   52  105:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   53  108:new             #90  <Class StringBuilder>
	//   54  111:dup             
	//   55  112:invokespecial   #93  <Method void StringBuilder()>
	//   56  115:astore_2        
		((StringBuilder) (obj)).append("** Minute: ");
	//   57  116:aload_2         
	//   58  117:ldc2            #543 <String "** Minute: ">
	//   59  120:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   60  123:pop             
		((StringBuilder) (obj)).append(((int) (assettimeevent.minute())));
	//   61  124:aload_2         
	//   62  125:aload_1         
	//   63  126:invokevirtual   #546 <Method short AssetTimeEvent.minute()>
	//   64  129:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//   65  132:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   66  133:ldc1            #63  <String "CoreEventReceiver">
	//   67  135:aload_2         
	//   68  136:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   69  139:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (j.c(assettimeevent.assetId())));
	//   70  142:aload_1         
	//   71  143:invokevirtual   #527 <Method AssetId AssetTimeEvent.assetId()>
	//   72  146:invokestatic    #34  <Method Robot j.c(AssetId)>
	//   73  149:astore_2        
		if(obj != null)
	//*  74  150:aload_2         
	//*  75  151:ifnull          162
			((Robot) (obj)).c().a(assettimeevent);
	//   76  154:aload_2         
	//   77  155:invokevirtual   #549 <Method HourMinTime Robot.c()>
	//   78  158:aload_1         
	//   79  159:invokevirtual   #553 <Method void HourMinTime.a(AssetTimeEvent)>
	//   80  162:return          
	}

	public void onAssetUmiVersionEvent(AssetUmiVersionEvent assetumiversionevent)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		((StringBuilder) (obj)).append("AssetUmiVersionEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #557 <String "AssetUmiVersionEvent received for asset ID: ">
	//    6   12:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (obj)).append(assetumiversionevent.assetId().getId());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #560 <Method AssetId AssetUmiVersionEvent.assetId()>
	//   11   21:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		o.b("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   14   28:ldc1            #63  <String "CoreEventReceiver">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #112 <Method void o.b(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   18   37:new             #90  <Class StringBuilder>
	//   19   40:dup             
	//   20   41:invokespecial   #93  <Method void StringBuilder()>
	//   21   44:astore_2        
		((StringBuilder) (obj)).append("** UMI Version: ");
	//   22   45:aload_2         
	//   23   46:ldc2            #562 <String "** UMI Version: ">
	//   24   49:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
		((StringBuilder) (obj)).append(((int) (assetumiversionevent.umiVersion())));
	//   26   53:aload_2         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #565 <Method short AssetUmiVersionEvent.umiVersion()>
	//   29   58:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//   30   61:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   31   62:ldc1            #63  <String "CoreEventReceiver">
	//   32   64:aload_2         
	//   33   65:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   34   68:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (j.c(assetumiversionevent.assetId())));
	//   35   71:aload_1         
	//   36   72:invokevirtual   #560 <Method AssetId AssetUmiVersionEvent.assetId()>
	//   37   75:invokestatic    #34  <Method Robot j.c(AssetId)>
	//   38   78:astore_2        
		if(obj != null)
	//*  39   79:aload_2         
	//*  40   80:ifnull          91
			((Robot) (obj)).a.a(assetumiversionevent);
	//   41   83:aload_2         
	//   42   84:getfield        #174 <Field RobotSystem Robot.a>
	//   43   87:aload_1         
	//   44   88:invokevirtual   #567 <Method void RobotSystem.a(AssetUmiVersionEvent)>
	//   45   91:return          
	}

	public void onAssetWifiSignalStrengthEvent(AssetWifiSignalStrengthEvent assetwifisignalstrengthevent)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		((StringBuilder) (obj)).append("AssetWifiSignalStrengthEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #571 <String "AssetWifiSignalStrengthEvent received for asset ID: ">
	//    6   12:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (obj)).append(assetwifisignalstrengthevent.assetId().getId());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #574 <Method AssetId AssetWifiSignalStrengthEvent.assetId()>
	//   11   21:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		o.b("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   14   28:ldc1            #63  <String "CoreEventReceiver">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #112 <Method void o.b(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   18   37:new             #90  <Class StringBuilder>
	//   19   40:dup             
	//   20   41:invokespecial   #93  <Method void StringBuilder()>
	//   21   44:astore_2        
		((StringBuilder) (obj)).append("** Signal Strength: ");
	//   22   45:aload_2         
	//   23   46:ldc2            #576 <String "** Signal Strength: ">
	//   24   49:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
		((StringBuilder) (obj)).append(((int) (assetwifisignalstrengthevent.signalStrength())));
	//   26   53:aload_2         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #579 <Method short AssetWifiSignalStrengthEvent.signalStrength()>
	//   29   58:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//   30   61:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   31   62:ldc1            #63  <String "CoreEventReceiver">
	//   32   64:aload_2         
	//   33   65:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   34   68:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (j.c(assetwifisignalstrengthevent.assetId())));
	//   35   71:aload_1         
	//   36   72:invokevirtual   #574 <Method AssetId AssetWifiSignalStrengthEvent.assetId()>
	//   37   75:invokestatic    #34  <Method Robot j.c(AssetId)>
	//   38   78:astore_2        
		if(obj != null)
	//*  39   79:aload_2         
	//*  40   80:ifnull          91
			((Robot) (obj)).d().a(assetwifisignalstrengthevent);
	//   41   83:aload_2         
	//   42   84:invokevirtual   #328 <Method NetworkSettings Robot.d()>
	//   43   87:aload_1         
	//   44   88:invokevirtual   #581 <Method void NetworkSettings.a(AssetWifiSignalStrengthEvent)>
	//   45   91:return          
	}

	public void onBadAssetPasswordEvent(BadAssetPasswordEvent badassetpasswordevent)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		((StringBuilder) (obj)).append("BadAssetPasswordEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #585 <String "BadAssetPasswordEvent received for asset ID: ">
	//    6   12:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (obj)).append(badassetpasswordevent.assetId().getId());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #588 <Method AssetId BadAssetPasswordEvent.assetId()>
	//   11   21:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		o.b("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   14   28:ldc1            #63  <String "CoreEventReceiver">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #112 <Method void o.b(String, String)>
		obj = ((Object) ((IRobotApplication)b.get()));
	//   18   37:getstatic       #19  <Field WeakReference b>
	//   19   40:invokevirtual   #592 <Method Object WeakReference.get()>
	//   20   43:checkcast       #594 <Class IRobotApplication>
	//   21   46:astore_2        
		if(obj == null)
	//*  22   47:aload_2         
	//*  23   48:ifnonnull       60
		{
			o.e("CoreEventReceiver", "Null IRobotApplication reference in onBadAssetPasswordEvent()");
	//   24   51:ldc1            #63  <String "CoreEventReceiver">
	//   25   53:ldc2            #596 <String "Null IRobotApplication reference in onBadAssetPasswordEvent()">
	//   26   56:invokestatic    #69  <Method void o.e(String, String)>
			return;
	//   27   59:return          
		} else
		{
			((IRobotApplication) (obj)).c(badassetpasswordevent.assetId().getId());
	//   28   60:aload_2         
	//   29   61:aload_1         
	//   30   62:invokevirtual   #588 <Method AssetId BadAssetPasswordEvent.assetId()>
	//   31   65:invokevirtual   #107 <Method String AssetId.getId()>
	//   32   68:invokevirtual   #598 <Method void IRobotApplication.c(String)>
			return;
	//   33   71:return          
		}
	}

	public void onCertificateErrorEvent(CertificateErrorEvent certificateerrorevent)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("CertificateErrorEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #602 <String "CertificateErrorEvent received for asset ID: ">
	//    6   12:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(certificateerrorevent.assetId().getId());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #605 <Method AssetId CertificateErrorEvent.assetId()>
	//   11   21:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		o.b("CoreEventReceiver", stringbuilder.toString());
	//   14   28:ldc1            #63  <String "CoreEventReceiver">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #112 <Method void o.b(String, String)>
	//   18   37:return          
	}

	public void onConnectFailureEvent(ConnectFailureEvent connectfailureevent)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("ConnectFailureEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #609 <String "ConnectFailureEvent received for asset ID: ">
	//    6   12:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(connectfailureevent.assetId().getId());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #612 <Method AssetId ConnectFailureEvent.assetId()>
	//   11   21:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		o.b("CoreEventReceiver", stringbuilder.toString());
	//   14   28:ldc1            #63  <String "CoreEventReceiver">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #112 <Method void o.b(String, String)>
		stringbuilder = new StringBuilder();
	//   18   37:new             #90  <Class StringBuilder>
	//   19   40:dup             
	//   20   41:invokespecial   #93  <Method void StringBuilder()>
	//   21   44:astore_2        
		stringbuilder.append("** Reason: ");
	//   22   45:aload_2         
	//   23   46:ldc2            #614 <String "** Reason: ">
	//   24   49:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
		stringbuilder.append(connectfailureevent.reason().name());
	//   26   53:aload_2         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #618 <Method ConnectFailureReason ConnectFailureEvent.reason()>
	//   29   58:invokevirtual   #621 <Method String ConnectFailureReason.name()>
	//   30   61:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   31   64:pop             
		o.b("CoreEventReceiver", stringbuilder.toString());
	//   32   65:ldc1            #63  <String "CoreEventReceiver">
	//   33   67:aload_2         
	//   34   68:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   35   71:invokestatic    #112 <Method void o.b(String, String)>
	//   36   74:return          
	}

	public void onConnectionStateEvent(ConnectionStateEvent connectionstateevent)
	{
		AssetId assetid = connectionstateevent.assetId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #626 <Method AssetId ConnectionStateEvent.assetId()>
	//    2    4:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #90  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #93  <Method void StringBuilder()>
	//    6   12:astore_3        
		stringbuilder.append("ConnectionStateEvent received for asset ID: ");
	//    7   13:aload_3         
	//    8   14:ldc2            #628 <String "ConnectionStateEvent received for asset ID: ">
	//    9   17:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   10   20:pop             
		stringbuilder.append(assetid.getId());
	//   11   21:aload_3         
	//   12   22:aload_2         
	//   13   23:invokevirtual   #107 <Method String AssetId.getId()>
	//   14   26:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		o.b("CoreEventReceiver", stringbuilder.toString());
	//   16   30:ldc1            #63  <String "CoreEventReceiver">
	//   17   32:aload_3         
	//   18   33:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   19   36:invokestatic    #112 <Method void o.b(String, String)>
		StringBuilder stringbuilder1;
		for(connectionstateevent = ((ConnectionStateEvent) (connectionstateevent.networkState().entrySet().iterator())); ((Iterator) (connectionstateevent)).hasNext(); o.b("CoreEventReceiver", stringbuilder1.toString()))
	//*  20   39:aload_1         
	//*  21   40:invokevirtual   #632 <Method HashMap ConnectionStateEvent.networkState()>
	//*  22   43:invokevirtual   #638 <Method Set HashMap.entrySet()>
	//*  23   46:invokeinterface #644 <Method Iterator Set.iterator()>
	//*  24   51:astore_1        
	//*  25   52:aload_1         
	//*  26   53:invokeinterface #649 <Method boolean Iterator.hasNext()>
	//*  27   58:ifeq            141
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (connectionstateevent)).next();
	//   28   61:aload_1         
	//   29   62:invokeinterface #652 <Method Object Iterator.next()>
	//   30   67:checkcast       #654 <Class java.util.Map$Entry>
	//   31   70:astore_2        
			stringbuilder1 = new StringBuilder();
	//   32   71:new             #90  <Class StringBuilder>
	//   33   74:dup             
	//   34   75:invokespecial   #93  <Method void StringBuilder()>
	//   35   78:astore_3        
			stringbuilder1.append("** Network Type/State: ");
	//   36   79:aload_3         
	//   37   80:ldc2            #656 <String "** Network Type/State: ">
	//   38   83:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   39   86:pop             
			stringbuilder1.append(((NetworkType)entry.getKey()).name());
	//   40   87:aload_3         
	//   41   88:aload_2         
	//   42   89:invokeinterface #659 <Method Object java.util.Map$Entry.getKey()>
	//   43   94:checkcast       #661 <Class NetworkType>
	//   44   97:invokevirtual   #662 <Method String NetworkType.name()>
	//   45  100:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   46  103:pop             
			stringbuilder1.append(", ");
	//   47  104:aload_3         
	//   48  105:ldc2            #664 <String ", ">
	//   49  108:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   50  111:pop             
			stringbuilder1.append(((NetworkState)entry.getValue()).name());
	//   51  112:aload_3         
	//   52  113:aload_2         
	//   53  114:invokeinterface #667 <Method Object java.util.Map$Entry.getValue()>
	//   54  119:checkcast       #669 <Class NetworkState>
	//   55  122:invokevirtual   #670 <Method String NetworkState.name()>
	//   56  125:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   57  128:pop             
		}

	//   58  129:ldc1            #63  <String "CoreEventReceiver">
	//   59  131:aload_3         
	//   60  132:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   61  135:invokestatic    #112 <Method void o.b(String, String)>
	//*  62  138:goto            52
	//   63  141:return          
	}

	public void onRobotAudioPlayingEvent(RobotAudioPlayingEvent robotaudioplayingevent)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		((StringBuilder) (obj)).append("RobotAudioPlayingEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #674 <String "RobotAudioPlayingEvent received for asset ID: ">
	//    6   12:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (obj)).append(robotaudioplayingevent.assetId().getId());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #677 <Method AssetId RobotAudioPlayingEvent.assetId()>
	//   11   21:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		o.b("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   14   28:ldc1            #63  <String "CoreEventReceiver">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #112 <Method void o.b(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   18   37:new             #90  <Class StringBuilder>
	//   19   40:dup             
	//   20   41:invokespecial   #93  <Method void StringBuilder()>
	//   21   44:astore_2        
		((StringBuilder) (obj)).append("** Audio Active: ");
	//   22   45:aload_2         
	//   23   46:ldc2            #679 <String "** Audio Active: ">
	//   24   49:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
		((StringBuilder) (obj)).append(robotaudioplayingevent.isAudioActive());
	//   26   53:aload_2         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #682 <Method boolean RobotAudioPlayingEvent.isAudioActive()>
	//   29   58:invokevirtual   #267 <Method StringBuilder StringBuilder.append(boolean)>
	//   30   61:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   31   62:ldc1            #63  <String "CoreEventReceiver">
	//   32   64:aload_2         
	//   33   65:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   34   68:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (j.c(robotaudioplayingevent.assetId())));
	//   35   71:aload_1         
	//   36   72:invokevirtual   #677 <Method AssetId RobotAudioPlayingEvent.assetId()>
	//   37   75:invokestatic    #34  <Method Robot j.c(AssetId)>
	//   38   78:astore_2        
		if(obj != null)
	//*  39   79:aload_2         
	//*  40   80:ifnull          91
			((Robot) (obj)).b().a(robotaudioplayingevent);
	//   41   83:aload_2         
	//   42   84:invokevirtual   #41  <Method MissionStatus Robot.b()>
	//   43   87:aload_1         
	//   44   88:invokevirtual   #684 <Method void MissionStatus.a(RobotAudioPlayingEvent)>
	//   45   91:return          
	}

	public void onRobotBatteryLevelEvent(RobotBatteryLevelEvent robotbatterylevelevent)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("RobotBatteryLevelEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #687 <String "RobotBatteryLevelEvent received for asset ID: ">
	//    6   12:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(robotbatterylevelevent.assetId().getId());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #688 <Method AssetId RobotBatteryLevelEvent.assetId()>
	//   11   21:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		o.b("CoreEventReceiver", stringbuilder.toString());
	//   14   28:ldc1            #63  <String "CoreEventReceiver">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #112 <Method void o.b(String, String)>
		stringbuilder = new StringBuilder();
	//   18   37:new             #90  <Class StringBuilder>
	//   19   40:dup             
	//   20   41:invokespecial   #93  <Method void StringBuilder()>
	//   21   44:astore_2        
		stringbuilder.append("** Battery Level: ");
	//   22   45:aload_2         
	//   23   46:ldc2            #690 <String "** Battery Level: ">
	//   24   49:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
		stringbuilder.append(((int) (robotbatterylevelevent.currentBatteryLevel())));
	//   26   53:aload_2         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #693 <Method short RobotBatteryLevelEvent.currentBatteryLevel()>
	//   29   58:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//   30   61:pop             
		o.a("CoreEventReceiver", stringbuilder.toString());
	//   31   62:ldc1            #63  <String "CoreEventReceiver">
	//   32   64:aload_2         
	//   33   65:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   34   68:invokestatic    #123 <Method void o.a(String, String)>
		a(((AssetEvent) (robotbatterylevelevent)));
	//   35   71:aload_0         
	//   36   72:aload_1         
	//   37   73:invokespecial   #695 <Method void a(AssetEvent)>
	//   38   76:return          
	}

	public void onRobotBinFullEvent(RobotBinFullEvent robotbinfullevent)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("RobotBinFullEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #698 <String "RobotBinFullEvent received for asset ID: ">
	//    6   12:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(robotbinfullevent.assetId().getId());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #699 <Method AssetId RobotBinFullEvent.assetId()>
	//   11   21:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		o.b("CoreEventReceiver", stringbuilder.toString());
	//   14   28:ldc1            #63  <String "CoreEventReceiver">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #112 <Method void o.b(String, String)>
		stringbuilder = new StringBuilder();
	//   18   37:new             #90  <Class StringBuilder>
	//   19   40:dup             
	//   20   41:invokespecial   #93  <Method void StringBuilder()>
	//   21   44:astore_2        
		stringbuilder.append("** Bin Full: ");
	//   22   45:aload_2         
	//   23   46:ldc2            #701 <String "** Bin Full: ">
	//   24   49:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
		stringbuilder.append(robotbinfullevent.isBinFull());
	//   26   53:aload_2         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #704 <Method boolean RobotBinFullEvent.isBinFull()>
	//   29   58:invokevirtual   #267 <Method StringBuilder StringBuilder.append(boolean)>
	//   30   61:pop             
		o.a("CoreEventReceiver", stringbuilder.toString());
	//   31   62:ldc1            #63  <String "CoreEventReceiver">
	//   32   64:aload_2         
	//   33   65:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   34   68:invokestatic    #123 <Method void o.a(String, String)>
		a(((AssetEvent) (robotbinfullevent)));
	//   35   71:aload_0         
	//   36   72:aload_1         
	//   37   73:invokespecial   #695 <Method void a(AssetEvent)>
	//   38   76:return          
	}

	public void onRobotBinRemovalEvent(RobotBinRemovalEvent robotbinremovalevent)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		((StringBuilder) (obj)).append("RobotBinRemovalEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #708 <String "RobotBinRemovalEvent received for asset ID: ">
	//    6   12:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (obj)).append(robotbinremovalevent.assetId().getId());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #711 <Method AssetId RobotBinRemovalEvent.assetId()>
	//   11   21:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		o.b("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   14   28:ldc1            #63  <String "CoreEventReceiver">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #112 <Method void o.b(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   18   37:new             #90  <Class StringBuilder>
	//   19   40:dup             
	//   20   41:invokespecial   #93  <Method void StringBuilder()>
	//   21   44:astore_2        
		((StringBuilder) (obj)).append("** Bin Removed: ");
	//   22   45:aload_2         
	//   23   46:ldc2            #713 <String "** Bin Removed: ">
	//   24   49:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
		((StringBuilder) (obj)).append(robotbinremovalevent.isBinRemoved());
	//   26   53:aload_2         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #716 <Method boolean RobotBinRemovalEvent.isBinRemoved()>
	//   29   58:invokevirtual   #267 <Method StringBuilder StringBuilder.append(boolean)>
	//   30   61:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   31   62:ldc1            #63  <String "CoreEventReceiver">
	//   32   64:aload_2         
	//   33   65:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   34   68:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (j.c(robotbinremovalevent.assetId())));
	//   35   71:aload_1         
	//   36   72:invokevirtual   #711 <Method AssetId RobotBinRemovalEvent.assetId()>
	//   37   75:invokestatic    #34  <Method Robot j.c(AssetId)>
	//   38   78:astore_2        
		if(obj != null)
	//*  39   79:aload_2         
	//*  40   80:ifnull          91
			((Robot) (obj)).b().a(robotbinremovalevent);
	//   41   83:aload_2         
	//   42   84:invokevirtual   #41  <Method MissionStatus Robot.b()>
	//   43   87:aload_1         
	//   44   88:invokevirtual   #718 <Method void MissionStatus.a(RobotBinRemovalEvent)>
	//   45   91:return          
	}

	public void onRobotDockEvent(RobotDockEvent robotdockevent)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("RobotDockEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #722 <String "RobotDockEvent received for asset ID: ">
	//    6   12:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(robotdockevent.assetId().getId());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #725 <Method AssetId RobotDockEvent.assetId()>
	//   11   21:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		o.b("CoreEventReceiver", stringbuilder.toString());
	//   14   28:ldc1            #63  <String "CoreEventReceiver">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #112 <Method void o.b(String, String)>
		stringbuilder = new StringBuilder();
	//   18   37:new             #90  <Class StringBuilder>
	//   19   40:dup             
	//   20   41:invokespecial   #93  <Method void StringBuilder()>
	//   21   44:astore_2        
		stringbuilder.append("** Dock Known: ");
	//   22   45:aload_2         
	//   23   46:ldc2            #727 <String "** Dock Known: ">
	//   24   49:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
		stringbuilder.append(robotdockevent.getDockState().isDockKnown());
	//   26   53:aload_2         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #731 <Method DockState RobotDockEvent.getDockState()>
	//   29   58:invokevirtual   #736 <Method boolean DockState.isDockKnown()>
	//   30   61:invokevirtual   #267 <Method StringBuilder StringBuilder.append(boolean)>
	//   31   64:pop             
		o.a("CoreEventReceiver", stringbuilder.toString());
	//   32   65:ldc1            #63  <String "CoreEventReceiver">
	//   33   67:aload_2         
	//   34   68:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   35   71:invokestatic    #123 <Method void o.a(String, String)>
	//   36   74:return          
	}

	public void onRobotErrorEvent(RobotErrorEvent roboterrorevent)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		((StringBuilder) (obj)).append("RobotErrorEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #740 <String "RobotErrorEvent received for asset ID: ">
	//    6   12:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (obj)).append(roboterrorevent.assetId().getId());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #743 <Method AssetId RobotErrorEvent.assetId()>
	//   11   21:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		o.b("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   14   28:ldc1            #63  <String "CoreEventReceiver">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #112 <Method void o.b(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   18   37:new             #90  <Class StringBuilder>
	//   19   40:dup             
	//   20   41:invokespecial   #93  <Method void StringBuilder()>
	//   21   44:astore_2        
		((StringBuilder) (obj)).append("** Error Code: ");
	//   22   45:aload_2         
	//   23   46:ldc2            #745 <String "** Error Code: ">
	//   24   49:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
		((StringBuilder) (obj)).append(((int) (roboterrorevent.robotErrorCode())));
	//   26   53:aload_2         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #748 <Method short RobotErrorEvent.robotErrorCode()>
	//   29   58:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//   30   61:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   31   62:ldc1            #63  <String "CoreEventReceiver">
	//   32   64:aload_2         
	//   33   65:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   34   68:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (j.c(roboterrorevent.assetId())));
	//   35   71:aload_1         
	//   36   72:invokevirtual   #743 <Method AssetId RobotErrorEvent.assetId()>
	//   37   75:invokestatic    #34  <Method Robot j.c(AssetId)>
	//   38   78:astore_2        
		if(obj != null)
	//*  39   79:aload_2         
	//*  40   80:ifnull          91
			((Robot) (obj)).b().a(roboterrorevent);
	//   41   83:aload_2         
	//   42   84:invokevirtual   #41  <Method MissionStatus Robot.b()>
	//   43   87:aload_1         
	//   44   88:invokevirtual   #750 <Method void MissionStatus.a(RobotErrorEvent)>
	//   45   91:return          
	}

	public void onRobotLanguageEvent(RobotLanguageEvent robotlanguageevent)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		((StringBuilder) (obj)).append("RobotLanguageEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #754 <String "RobotLanguageEvent received for asset ID: ">
	//    6   12:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (obj)).append(robotlanguageevent.assetId().getId());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #757 <Method AssetId RobotLanguageEvent.assetId()>
	//   11   21:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		o.b("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   14   28:ldc1            #63  <String "CoreEventReceiver">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #112 <Method void o.b(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   18   37:new             #90  <Class StringBuilder>
	//   19   40:dup             
	//   20   41:invokespecial   #93  <Method void StringBuilder()>
	//   21   44:astore_2        
		((StringBuilder) (obj)).append("** Language Index: ");
	//   22   45:aload_2         
	//   23   46:ldc2            #759 <String "** Language Index: ">
	//   24   49:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
		((StringBuilder) (obj)).append(robotlanguageevent.robotLanguage());
	//   26   53:aload_2         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #762 <Method int RobotLanguageEvent.robotLanguage()>
	//   29   58:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//   30   61:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   31   62:ldc1            #63  <String "CoreEventReceiver">
	//   32   64:aload_2         
	//   33   65:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   34   68:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (j.c(robotlanguageevent.assetId())));
	//   35   71:aload_1         
	//   36   72:invokevirtual   #757 <Method AssetId RobotLanguageEvent.assetId()>
	//   37   75:invokestatic    #34  <Method Robot j.c(AssetId)>
	//   38   78:astore_2        
		if(obj != null)
	//*  39   79:aload_2         
	//*  40   80:ifnull          91
			((Robot) (obj)).a().a(robotlanguageevent);
	//   41   83:aload_2         
	//   42   84:invokevirtual   #420 <Method RobotPreferences Robot.a()>
	//   43   87:aload_1         
	//   44   88:invokevirtual   #764 <Method void RobotPreferences.a(RobotLanguageEvent)>
	//   45   91:return          
	}

	public void onRobotLanguagesAvailableEvent(RobotLanguagesAvailableEvent robotlanguagesavailableevent)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		((StringBuilder) (obj)).append("RobotLanguagesAvailableEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #768 <String "RobotLanguagesAvailableEvent received for asset ID: ">
	//    6   12:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (obj)).append(robotlanguagesavailableevent.assetId().getId());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #771 <Method AssetId RobotLanguagesAvailableEvent.assetId()>
	//   11   21:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		o.b("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   14   28:ldc1            #63  <String "CoreEventReceiver">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #112 <Method void o.b(String, String)>
		StringBuilder stringbuilder;
		for(obj = ((Object) (robotlanguagesavailableevent.getLanguages().iterator())); ((Iterator) (obj)).hasNext(); o.a("CoreEventReceiver", stringbuilder.toString()))
	//*  18   37:aload_1         
	//*  19   38:invokevirtual   #774 <Method ArrayList RobotLanguagesAvailableEvent.getLanguages()>
	//*  20   41:invokevirtual   #777 <Method Iterator ArrayList.iterator()>
	//*  21   44:astore_2        
	//*  22   45:aload_2         
	//*  23   46:invokeinterface #649 <Method boolean Iterator.hasNext()>
	//*  24   51:ifeq            133
		{
			RobotLanguage robotlanguage = (RobotLanguage)((Iterator) (obj)).next();
	//   25   54:aload_2         
	//   26   55:invokeinterface #652 <Method Object Iterator.next()>
	//   27   60:checkcast       #779 <Class RobotLanguage>
	//   28   63:astore_3        
			stringbuilder = new StringBuilder();
	//   29   64:new             #90  <Class StringBuilder>
	//   30   67:dup             
	//   31   68:invokespecial   #93  <Method void StringBuilder()>
	//   32   71:astore          4
			stringbuilder.append("** Available Language: ");
	//   33   73:aload           4
	//   34   75:ldc2            #781 <String "** Available Language: ">
	//   35   78:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   36   81:pop             
			stringbuilder.append(robotlanguage.getName());
	//   37   82:aload           4
	//   38   84:aload_3         
	//   39   85:invokevirtual   #784 <Method String RobotLanguage.getName()>
	//   40   88:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   41   91:pop             
			stringbuilder.append("[");
	//   42   92:aload           4
	//   43   94:ldc2            #786 <String "[">
	//   44   97:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   45  100:pop             
			stringbuilder.append(robotlanguage.getId());
	//   46  101:aload           4
	//   47  103:aload_3         
	//   48  104:invokevirtual   #788 <Method int RobotLanguage.getId()>
	//   49  107:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//   50  110:pop             
			stringbuilder.append("]");
	//   51  111:aload           4
	//   52  113:ldc2            #790 <String "]">
	//   53  116:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   54  119:pop             
		}

	//   55  120:ldc1            #63  <String "CoreEventReceiver">
	//   56  122:aload           4
	//   57  124:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   58  127:invokestatic    #123 <Method void o.a(String, String)>
	//*  59  130:goto            45
		obj = ((Object) (j.c(robotlanguagesavailableevent.assetId())));
	//   60  133:aload_1         
	//   61  134:invokevirtual   #771 <Method AssetId RobotLanguagesAvailableEvent.assetId()>
	//   62  137:invokestatic    #34  <Method Robot j.c(AssetId)>
	//   63  140:astore_2        
		if(obj != null)
	//*  64  141:aload_2         
	//*  65  142:ifnull          153
			((Robot) (obj)).k().a(robotlanguagesavailableevent);
	//   66  145:aload_2         
	//   67  146:invokevirtual   #794 <Method RobotAvailableLanguages Robot.k()>
	//   68  149:aload_1         
	//   69  150:invokevirtual   #798 <Method void RobotAvailableLanguages.a(RobotLanguagesAvailableEvent)>
	//   70  153:return          
	}

	public void onRobotMissionAreaCoveredEvent(RobotMissionAreaCoveredEvent robotmissionareacoveredevent)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("RobotMissionAreaCoveredEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #802 <String "RobotMissionAreaCoveredEvent received for asset ID: ">
	//    6   12:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(robotmissionareacoveredevent.assetId().getId());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #805 <Method AssetId RobotMissionAreaCoveredEvent.assetId()>
	//   11   21:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		o.b("CoreEventReceiver", stringbuilder.toString());
	//   14   28:ldc1            #63  <String "CoreEventReceiver">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #112 <Method void o.b(String, String)>
		stringbuilder = new StringBuilder();
	//   18   37:new             #90  <Class StringBuilder>
	//   19   40:dup             
	//   20   41:invokespecial   #93  <Method void StringBuilder()>
	//   21   44:astore_2        
		stringbuilder.append("** Mission Area Covered: ");
	//   22   45:aload_2         
	//   23   46:ldc2            #807 <String "** Mission Area Covered: ">
	//   24   49:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
		stringbuilder.append(robotmissionareacoveredevent.squareFeet());
	//   26   53:aload_2         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #810 <Method int RobotMissionAreaCoveredEvent.squareFeet()>
	//   29   58:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//   30   61:pop             
		o.a("CoreEventReceiver", stringbuilder.toString());
	//   31   62:ldc1            #63  <String "CoreEventReceiver">
	//   32   64:aload_2         
	//   33   65:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   34   68:invokestatic    #123 <Method void o.a(String, String)>
	//   35   71:return          
	}

	public void onRobotMissionHistoryEvent(RobotMissionHistoryEvent robotmissionhistoryevent)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		((StringBuilder) (obj)).append("RobotMissionHistoryEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #814 <String "RobotMissionHistoryEvent received for asset ID: ">
	//    6   12:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (obj)).append(robotmissionhistoryevent.assetId().getId());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #817 <Method AssetId RobotMissionHistoryEvent.assetId()>
	//   11   21:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		o.b("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   14   28:ldc1            #63  <String "CoreEventReceiver">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #112 <Method void o.b(String, String)>
		if(!robotmissionhistoryevent.missions().isEmpty())
	//*  18   37:aload_1         
	//*  19   38:invokevirtual   #820 <Method ArrayList RobotMissionHistoryEvent.missions()>
	//*  20   41:invokevirtual   #823 <Method boolean ArrayList.isEmpty()>
	//*  21   44:ifne            723
		{
			obj = ((Object) ((RobotMissionHistoryItem)robotmissionhistoryevent.missions().get(0)));
	//   22   47:aload_1         
	//   23   48:invokevirtual   #820 <Method ArrayList RobotMissionHistoryEvent.missions()>
	//   24   51:iconst_0        
	//   25   52:invokevirtual   #826 <Method Object ArrayList.get(int)>
	//   26   55:checkcast       #828 <Class RobotMissionHistoryItem>
	//   27   58:astore_2        
			Object obj1 = ((Object) (new StringBuilder()));
	//   28   59:new             #90  <Class StringBuilder>
	//   29   62:dup             
	//   30   63:invokespecial   #93  <Method void StringBuilder()>
	//   31   66:astore_3        
			((StringBuilder) (obj1)).append("** Timestamp: ");
	//   32   67:aload_3         
	//   33   68:ldc2            #830 <String "** Timestamp: ">
	//   34   71:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   35   74:pop             
			((StringBuilder) (obj1)).append(((RobotMissionHistoryItem) (obj)).getTimestamp());
	//   36   75:aload_3         
	//   37   76:aload_2         
	//   38   77:invokevirtual   #833 <Method int RobotMissionHistoryItem.getTimestamp()>
	//   39   80:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//   40   83:pop             
			o.a("CoreEventReceiver", ((StringBuilder) (obj1)).toString());
	//   41   84:ldc1            #63  <String "CoreEventReceiver">
	//   42   86:aload_3         
	//   43   87:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   44   90:invokestatic    #123 <Method void o.a(String, String)>
			obj1 = ((Object) (new StringBuilder()));
	//   45   93:new             #90  <Class StringBuilder>
	//   46   96:dup             
	//   47   97:invokespecial   #93  <Method void StringBuilder()>
	//   48  100:astore_3        
			((StringBuilder) (obj1)).append("** Mission ID: ");
	//   49  101:aload_3         
	//   50  102:ldc2            #835 <String "** Mission ID: ">
	//   51  105:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   52  108:pop             
			((StringBuilder) (obj1)).append(((RobotMissionHistoryItem) (obj)).getMissionId());
	//   53  109:aload_3         
	//   54  110:aload_2         
	//   55  111:invokevirtual   #838 <Method int RobotMissionHistoryItem.getMissionId()>
	//   56  114:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//   57  117:pop             
			o.a("CoreEventReceiver", ((StringBuilder) (obj1)).toString());
	//   58  118:ldc1            #63  <String "CoreEventReceiver">
	//   59  120:aload_3         
	//   60  121:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   61  124:invokestatic    #123 <Method void o.a(String, String)>
			obj1 = ((Object) (new StringBuilder()));
	//   62  127:new             #90  <Class StringBuilder>
	//   63  130:dup             
	//   64  131:invokespecial   #93  <Method void StringBuilder()>
	//   65  134:astore_3        
			((StringBuilder) (obj1)).append("** Completion Status: ");
	//   66  135:aload_3         
	//   67  136:ldc2            #840 <String "** Completion Status: ">
	//   68  139:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   69  142:pop             
			((StringBuilder) (obj1)).append(((RobotMissionHistoryItem) (obj)).getCompletionStatus().name());
	//   70  143:aload_3         
	//   71  144:aload_2         
	//   72  145:invokevirtual   #844 <Method RobotMissionHistoryCompletionStatus RobotMissionHistoryItem.getCompletionStatus()>
	//   73  148:invokevirtual   #847 <Method String RobotMissionHistoryCompletionStatus.name()>
	//   74  151:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   75  154:pop             
			o.a("CoreEventReceiver", ((StringBuilder) (obj1)).toString());
	//   76  155:ldc1            #63  <String "CoreEventReceiver">
	//   77  157:aload_3         
	//   78  158:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   79  161:invokestatic    #123 <Method void o.a(String, String)>
			StringBuilder stringbuilder;
			for(obj1 = ((Object) (((RobotMissionHistoryItem) (obj)).getRobotSpecificStates().entrySet().iterator())); ((Iterator) (obj1)).hasNext(); o.a("CoreEventReceiver", stringbuilder.toString()))
	//*  80  164:aload_2         
	//*  81  165:invokevirtual   #850 <Method HashMap RobotMissionHistoryItem.getRobotSpecificStates()>
	//*  82  168:invokevirtual   #638 <Method Set HashMap.entrySet()>
	//*  83  171:invokeinterface #644 <Method Iterator Set.iterator()>
	//*  84  176:astore_3        
	//*  85  177:aload_3         
	//*  86  178:invokeinterface #649 <Method boolean Iterator.hasNext()>
	//*  87  183:ifeq            275
			{
				java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
	//   88  186:aload_3         
	//   89  187:invokeinterface #652 <Method Object Iterator.next()>
	//   90  192:checkcast       #654 <Class java.util.Map$Entry>
	//   91  195:astore          4
				stringbuilder = new StringBuilder();
	//   92  197:new             #90  <Class StringBuilder>
	//   93  200:dup             
	//   94  201:invokespecial   #93  <Method void StringBuilder()>
	//   95  204:astore          5
				stringbuilder.append("** Mission Flag Status: ");
	//   96  206:aload           5
	//   97  208:ldc2            #852 <String "** Mission Flag Status: ">
	//   98  211:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   99  214:pop             
				stringbuilder.append(((RobotMissionBooleanStatusType)entry.getKey()).name());
	//  100  215:aload           5
	//  101  217:aload           4
	//  102  219:invokeinterface #659 <Method Object java.util.Map$Entry.getKey()>
	//  103  224:checkcast       #854 <Class RobotMissionBooleanStatusType>
	//  104  227:invokevirtual   #855 <Method String RobotMissionBooleanStatusType.name()>
	//  105  230:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  106  233:pop             
				stringbuilder.append(", ");
	//  107  234:aload           5
	//  108  236:ldc2            #664 <String ", ">
	//  109  239:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  110  242:pop             
				stringbuilder.append(((Boolean)entry.getValue()).booleanValue());
	//  111  243:aload           5
	//  112  245:aload           4
	//  113  247:invokeinterface #667 <Method Object java.util.Map$Entry.getValue()>
	//  114  252:checkcast       #857 <Class Boolean>
	//  115  255:invokevirtual   #860 <Method boolean Boolean.booleanValue()>
	//  116  258:invokevirtual   #267 <Method StringBuilder StringBuilder.append(boolean)>
	//  117  261:pop             
			}

	//  118  262:ldc1            #63  <String "CoreEventReceiver">
	//  119  264:aload           5
	//  120  266:invokevirtual   #110 <Method String StringBuilder.toString()>
	//  121  269:invokestatic    #123 <Method void o.a(String, String)>
	//* 122  272:goto            177
			obj1 = ((Object) (new StringBuilder()));
	//  123  275:new             #90  <Class StringBuilder>
	//  124  278:dup             
	//  125  279:invokespecial   #93  <Method void StringBuilder()>
	//  126  282:astore_3        
			((StringBuilder) (obj1)).append("** Square Feet Covered: ");
	//  127  283:aload_3         
	//  128  284:ldc2            #862 <String "** Square Feet Covered: ">
	//  129  287:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  130  290:pop             
			((StringBuilder) (obj1)).append(((RobotMissionHistoryItem) (obj)).getSquareFeetCovered());
	//  131  291:aload_3         
	//  132  292:aload_2         
	//  133  293:invokevirtual   #865 <Method int RobotMissionHistoryItem.getSquareFeetCovered()>
	//  134  296:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//  135  299:pop             
			o.a("CoreEventReceiver", ((StringBuilder) (obj1)).toString());
	//  136  300:ldc1            #63  <String "CoreEventReceiver">
	//  137  302:aload_3         
	//  138  303:invokevirtual   #110 <Method String StringBuilder.toString()>
	//  139  306:invokestatic    #123 <Method void o.a(String, String)>
			obj1 = ((Object) (new StringBuilder()));
	//  140  309:new             #90  <Class StringBuilder>
	//  141  312:dup             
	//  142  313:invokespecial   #93  <Method void StringBuilder()>
	//  143  316:astore_3        
			((StringBuilder) (obj1)).append("** Minutes Running: ");
	//  144  317:aload_3         
	//  145  318:ldc2            #867 <String "** Minutes Running: ">
	//  146  321:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  147  324:pop             
			((StringBuilder) (obj1)).append(((RobotMissionHistoryItem) (obj)).getMinutesRunning());
	//  148  325:aload_3         
	//  149  326:aload_2         
	//  150  327:invokevirtual   #870 <Method int RobotMissionHistoryItem.getMinutesRunning()>
	//  151  330:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//  152  333:pop             
			o.a("CoreEventReceiver", ((StringBuilder) (obj1)).toString());
	//  153  334:ldc1            #63  <String "CoreEventReceiver">
	//  154  336:aload_3         
	//  155  337:invokevirtual   #110 <Method String StringBuilder.toString()>
	//  156  340:invokestatic    #123 <Method void o.a(String, String)>
			obj1 = ((Object) (new StringBuilder()));
	//  157  343:new             #90  <Class StringBuilder>
	//  158  346:dup             
	//  159  347:invokespecial   #93  <Method void StringBuilder()>
	//  160  350:astore_3        
			((StringBuilder) (obj1)).append("** Minutes Charging: ");
	//  161  351:aload_3         
	//  162  352:ldc2            #872 <String "** Minutes Charging: ">
	//  163  355:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  164  358:pop             
			((StringBuilder) (obj1)).append(((RobotMissionHistoryItem) (obj)).getMinutesCharging());
	//  165  359:aload_3         
	//  166  360:aload_2         
	//  167  361:invokevirtual   #875 <Method int RobotMissionHistoryItem.getMinutesCharging()>
	//  168  364:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//  169  367:pop             
			o.a("CoreEventReceiver", ((StringBuilder) (obj1)).toString());
	//  170  368:ldc1            #63  <String "CoreEventReceiver">
	//  171  370:aload_3         
	//  172  371:invokevirtual   #110 <Method String StringBuilder.toString()>
	//  173  374:invokestatic    #123 <Method void o.a(String, String)>
			obj1 = ((Object) (new StringBuilder()));
	//  174  377:new             #90  <Class StringBuilder>
	//  175  380:dup             
	//  176  381:invokespecial   #93  <Method void StringBuilder()>
	//  177  384:astore_3        
			((StringBuilder) (obj1)).append("** Minutes Paused: ");
	//  178  385:aload_3         
	//  179  386:ldc2            #877 <String "** Minutes Paused: ">
	//  180  389:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  181  392:pop             
			((StringBuilder) (obj1)).append(((RobotMissionHistoryItem) (obj)).getMinutesPaused());
	//  182  393:aload_3         
	//  183  394:aload_2         
	//  184  395:invokevirtual   #880 <Method int RobotMissionHistoryItem.getMinutesPaused()>
	//  185  398:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//  186  401:pop             
			o.a("CoreEventReceiver", ((StringBuilder) (obj1)).toString());
	//  187  402:ldc1            #63  <String "CoreEventReceiver">
	//  188  404:aload_3         
	//  189  405:invokevirtual   #110 <Method String StringBuilder.toString()>
	//  190  408:invokestatic    #123 <Method void o.a(String, String)>
			obj1 = ((Object) (new StringBuilder()));
	//  191  411:new             #90  <Class StringBuilder>
	//  192  414:dup             
	//  193  415:invokespecial   #93  <Method void StringBuilder()>
	//  194  418:astore_3        
			((StringBuilder) (obj1)).append("** Mission Duration: ");
	//  195  419:aload_3         
	//  196  420:ldc2            #882 <String "** Mission Duration: ">
	//  197  423:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  198  426:pop             
			((StringBuilder) (obj1)).append(((RobotMissionHistoryItem) (obj)).getMissionDurationInMinutes());
	//  199  427:aload_3         
	//  200  428:aload_2         
	//  201  429:invokevirtual   #885 <Method int RobotMissionHistoryItem.getMissionDurationInMinutes()>
	//  202  432:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//  203  435:pop             
			o.a("CoreEventReceiver", ((StringBuilder) (obj1)).toString());
	//  204  436:ldc1            #63  <String "CoreEventReceiver">
	//  205  438:aload_3         
	//  206  439:invokevirtual   #110 <Method String StringBuilder.toString()>
	//  207  442:invokestatic    #123 <Method void o.a(String, String)>
			obj1 = ((Object) (new StringBuilder()));
	//  208  445:new             #90  <Class StringBuilder>
	//  209  448:dup             
	//  210  449:invokespecial   #93  <Method void StringBuilder()>
	//  211  452:astore_3        
			((StringBuilder) (obj1)).append("** Dirt Detect Count: ");
	//  212  453:aload_3         
	//  213  454:ldc2            #887 <String "** Dirt Detect Count: ">
	//  214  457:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  215  460:pop             
			((StringBuilder) (obj1)).append(((int) (((RobotMissionHistoryItem) (obj)).getNumberOfDirtDetects())));
	//  216  461:aload_3         
	//  217  462:aload_2         
	//  218  463:invokevirtual   #890 <Method short RobotMissionHistoryItem.getNumberOfDirtDetects()>
	//  219  466:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//  220  469:pop             
			o.a("CoreEventReceiver", ((StringBuilder) (obj1)).toString());
	//  221  470:ldc1            #63  <String "CoreEventReceiver">
	//  222  472:aload_3         
	//  223  473:invokevirtual   #110 <Method String StringBuilder.toString()>
	//  224  476:invokestatic    #123 <Method void o.a(String, String)>
			obj1 = ((Object) (new StringBuilder()));
	//  225  479:new             #90  <Class StringBuilder>
	//  226  482:dup             
	//  227  483:invokespecial   #93  <Method void StringBuilder()>
	//  228  486:astore_3        
			((StringBuilder) (obj1)).append("** Number of Charges: ");
	//  229  487:aload_3         
	//  230  488:ldc2            #892 <String "** Number of Charges: ">
	//  231  491:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  232  494:pop             
			((StringBuilder) (obj1)).append(((int) (((RobotMissionHistoryItem) (obj)).getNumberOfTimesCharged())));
	//  233  495:aload_3         
	//  234  496:aload_2         
	//  235  497:invokevirtual   #895 <Method short RobotMissionHistoryItem.getNumberOfTimesCharged()>
	//  236  500:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//  237  503:pop             
			o.a("CoreEventReceiver", ((StringBuilder) (obj1)).toString());
	//  238  504:ldc1            #63  <String "CoreEventReceiver">
	//  239  506:aload_3         
	//  240  507:invokevirtual   #110 <Method String StringBuilder.toString()>
	//  241  510:invokestatic    #123 <Method void o.a(String, String)>
			obj1 = ((Object) (new StringBuilder()));
	//  242  513:new             #90  <Class StringBuilder>
	//  243  516:dup             
	//  244  517:invokespecial   #93  <Method void StringBuilder()>
	//  245  520:astore_3        
			((StringBuilder) (obj1)).append("** Number of Rescues: ");
	//  246  521:aload_3         
	//  247  522:ldc2            #897 <String "** Number of Rescues: ">
	//  248  525:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  249  528:pop             
			((StringBuilder) (obj1)).append(((int) (((RobotMissionHistoryItem) (obj)).getNumberOfRescues())));
	//  250  529:aload_3         
	//  251  530:aload_2         
	//  252  531:invokevirtual   #900 <Method short RobotMissionHistoryItem.getNumberOfRescues()>
	//  253  534:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//  254  537:pop             
			o.a("CoreEventReceiver", ((StringBuilder) (obj1)).toString());
	//  255  538:ldc1            #63  <String "CoreEventReceiver">
	//  256  540:aload_3         
	//  257  541:invokevirtual   #110 <Method String StringBuilder.toString()>
	//  258  544:invokestatic    #123 <Method void o.a(String, String)>
			obj1 = ((Object) (new StringBuilder()));
	//  259  547:new             #90  <Class StringBuilder>
	//  260  550:dup             
	//  261  551:invokespecial   #93  <Method void StringBuilder()>
	//  262  554:astore_3        
			((StringBuilder) (obj1)).append("** Error Code: ");
	//  263  555:aload_3         
	//  264  556:ldc2            #745 <String "** Error Code: ">
	//  265  559:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  266  562:pop             
			((StringBuilder) (obj1)).append(((int) (((RobotMissionHistoryItem) (obj)).getErrorCode())));
	//  267  563:aload_3         
	//  268  564:aload_2         
	//  269  565:invokevirtual   #903 <Method short RobotMissionHistoryItem.getErrorCode()>
	//  270  568:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//  271  571:pop             
			o.a("CoreEventReceiver", ((StringBuilder) (obj1)).toString());
	//  272  572:ldc1            #63  <String "CoreEventReceiver">
	//  273  574:aload_3         
	//  274  575:invokevirtual   #110 <Method String StringBuilder.toString()>
	//  275  578:invokestatic    #123 <Method void o.a(String, String)>
			obj1 = ((Object) (new StringBuilder()));
	//  276  581:new             #90  <Class StringBuilder>
	//  277  584:dup             
	//  278  585:invokespecial   #93  <Method void StringBuilder()>
	//  279  588:astore_3        
			((StringBuilder) (obj1)).append("** Wi-Fi Signal Strength: ");
	//  280  589:aload_3         
	//  281  590:ldc2            #905 <String "** Wi-Fi Signal Strength: ">
	//  282  593:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  283  596:pop             
			((StringBuilder) (obj1)).append(((Object) (((RobotMissionHistoryItem) (obj)).getWifiSignalStrengthHistory())));
	//  284  597:aload_3         
	//  285  598:aload_2         
	//  286  599:invokevirtual   #908 <Method ArrayList RobotMissionHistoryItem.getWifiSignalStrengthHistory()>
	//  287  602:invokevirtual   #412 <Method StringBuilder StringBuilder.append(Object)>
	//  288  605:pop             
			o.a("CoreEventReceiver", ((StringBuilder) (obj1)).toString());
	//  289  606:ldc1            #63  <String "CoreEventReceiver">
	//  290  608:aload_3         
	//  291  609:invokevirtual   #110 <Method String StringBuilder.toString()>
	//  292  612:invokestatic    #123 <Method void o.a(String, String)>
			obj = "";
	//  293  615:ldc2            #910 <String "">
	//  294  618:astore_2        
			for(obj1 = ((Object) (robotmissionhistoryevent.missions().iterator())); ((Iterator) (obj1)).hasNext();)
	//* 295  619:aload_1         
	//* 296  620:invokevirtual   #820 <Method ArrayList RobotMissionHistoryEvent.missions()>
	//* 297  623:invokevirtual   #777 <Method Iterator ArrayList.iterator()>
	//* 298  626:astore_3        
	//* 299  627:aload_3         
	//* 300  628:invokeinterface #649 <Method boolean Iterator.hasNext()>
	//* 301  633:ifeq            692
			{
				RobotMissionHistoryItem robotmissionhistoryitem = (RobotMissionHistoryItem)((Iterator) (obj1)).next();
	//  302  636:aload_3         
	//  303  637:invokeinterface #652 <Method Object Iterator.next()>
	//  304  642:checkcast       #828 <Class RobotMissionHistoryItem>
	//  305  645:astore          4
				StringBuilder stringbuilder1 = new StringBuilder();
	//  306  647:new             #90  <Class StringBuilder>
	//  307  650:dup             
	//  308  651:invokespecial   #93  <Method void StringBuilder()>
	//  309  654:astore          5
				stringbuilder1.append(((String) (obj)));
	//  310  656:aload           5
	//  311  658:aload_2         
	//  312  659:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  313  662:pop             
				stringbuilder1.append(robotmissionhistoryitem.getMissionId());
	//  314  663:aload           5
	//  315  665:aload           4
	//  316  667:invokevirtual   #838 <Method int RobotMissionHistoryItem.getMissionId()>
	//  317  670:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//  318  673:pop             
				stringbuilder1.append(" ");
	//  319  674:aload           5
	//  320  676:ldc2            #912 <String " ">
	//  321  679:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  322  682:pop             
				obj = ((Object) (stringbuilder1.toString()));
	//  323  683:aload           5
	//  324  685:invokevirtual   #110 <Method String StringBuilder.toString()>
	//  325  688:astore_2        
			}

	//* 326  689:goto            627
			obj1 = ((Object) (new StringBuilder()));
	//  327  692:new             #90  <Class StringBuilder>
	//  328  695:dup             
	//  329  696:invokespecial   #93  <Method void StringBuilder()>
	//  330  699:astore_3        
			((StringBuilder) (obj1)).append("RobotMissionHistoryEvent - All Mission Ids: ");
	//  331  700:aload_3         
	//  332  701:ldc2            #914 <String "RobotMissionHistoryEvent - All Mission Ids: ">
	//  333  704:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  334  707:pop             
			((StringBuilder) (obj1)).append(((String) (obj)));
	//  335  708:aload_3         
	//  336  709:aload_2         
	//  337  710:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  338  713:pop             
			o.a("CoreEventReceiver", ((StringBuilder) (obj1)).toString());
	//  339  714:ldc1            #63  <String "CoreEventReceiver">
	//  340  716:aload_3         
	//  341  717:invokevirtual   #110 <Method String StringBuilder.toString()>
	//  342  720:invokestatic    #123 <Method void o.a(String, String)>
		}
		obj = ((Object) (j.c(robotmissionhistoryevent.assetId())));
	//  343  723:aload_1         
	//  344  724:invokevirtual   #817 <Method AssetId RobotMissionHistoryEvent.assetId()>
	//  345  727:invokestatic    #34  <Method Robot j.c(AssetId)>
	//  346  730:astore_2        
		if(obj != null)
	//* 347  731:aload_2         
	//* 348  732:ifnull          743
			((Robot) (obj)).n().updateFromEvent(robotmissionhistoryevent);
	//  349  735:aload_2         
	//  350  736:invokevirtual   #918 <Method MissionHistory Robot.n()>
	//  351  739:aload_1         
	//  352  740:invokevirtual   #922 <Method void MissionHistory.updateFromEvent(RobotMissionHistoryEvent)>
	//  353  743:return          
	}

	public void onRobotMissionStatusEvent(RobotMissionStatusEvent robotmissionstatusevent)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("RobotMissionStatusEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #925 <String "RobotMissionStatusEvent received for asset ID: ">
	//    6   12:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(robotmissionstatusevent.assetId().getId());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #926 <Method AssetId RobotMissionStatusEvent.assetId()>
	//   11   21:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		o.b("CoreEventReceiver", stringbuilder.toString());
	//   14   28:ldc1            #63  <String "CoreEventReceiver">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #112 <Method void o.b(String, String)>
		stringbuilder = new StringBuilder();
	//   18   37:new             #90  <Class StringBuilder>
	//   19   40:dup             
	//   20   41:invokespecial   #93  <Method void StringBuilder()>
	//   21   44:astore_2        
		stringbuilder.append("** Mission Type: ");
	//   22   45:aload_2         
	//   23   46:ldc2            #928 <String "** Mission Type: ">
	//   24   49:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
		stringbuilder.append(((Object) (robotmissionstatusevent.missionType())));
	//   26   53:aload_2         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #932 <Method com.irobot.core.RobotMissionType RobotMissionStatusEvent.missionType()>
	//   29   58:invokevirtual   #412 <Method StringBuilder StringBuilder.append(Object)>
	//   30   61:pop             
		o.a("CoreEventReceiver", stringbuilder.toString());
	//   31   62:ldc1            #63  <String "CoreEventReceiver">
	//   32   64:aload_2         
	//   33   65:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   34   68:invokestatic    #123 <Method void o.a(String, String)>
		stringbuilder = new StringBuilder();
	//   35   71:new             #90  <Class StringBuilder>
	//   36   74:dup             
	//   37   75:invokespecial   #93  <Method void StringBuilder()>
	//   38   78:astore_2        
		stringbuilder.append("** Mission Phase: ");
	//   39   79:aload_2         
	//   40   80:ldc2            #934 <String "** Mission Phase: ">
	//   41   83:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   42   86:pop             
		stringbuilder.append(((Object) (robotmissionstatusevent.missionPhase())));
	//   43   87:aload_2         
	//   44   88:aload_1         
	//   45   89:invokevirtual   #938 <Method com.irobot.core.RobotMissionPhase RobotMissionStatusEvent.missionPhase()>
	//   46   92:invokevirtual   #412 <Method StringBuilder StringBuilder.append(Object)>
	//   47   95:pop             
		o.a("CoreEventReceiver", stringbuilder.toString());
	//   48   96:ldc1            #63  <String "CoreEventReceiver">
	//   49   98:aload_2         
	//   50   99:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   51  102:invokestatic    #123 <Method void o.a(String, String)>
		stringbuilder = new StringBuilder();
	//   52  105:new             #90  <Class StringBuilder>
	//   53  108:dup             
	//   54  109:invokespecial   #93  <Method void StringBuilder()>
	//   55  112:astore_2        
		stringbuilder.append("** Minutes Until Expired: ");
	//   56  113:aload_2         
	//   57  114:ldc2            #940 <String "** Minutes Until Expired: ">
	//   58  117:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   59  120:pop             
		stringbuilder.append(((int) (robotmissionstatusevent.minutesUntilExpired())));
	//   60  121:aload_2         
	//   61  122:aload_1         
	//   62  123:invokevirtual   #943 <Method short RobotMissionStatusEvent.minutesUntilExpired()>
	//   63  126:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//   64  129:pop             
		o.a("CoreEventReceiver", stringbuilder.toString());
	//   65  130:ldc1            #63  <String "CoreEventReceiver">
	//   66  132:aload_2         
	//   67  133:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   68  136:invokestatic    #123 <Method void o.a(String, String)>
		stringbuilder = new StringBuilder();
	//   69  139:new             #90  <Class StringBuilder>
	//   70  142:dup             
	//   71  143:invokespecial   #93  <Method void StringBuilder()>
	//   72  146:astore_2        
		stringbuilder.append("** Minutes Until Recharged: ");
	//   73  147:aload_2         
	//   74  148:ldc2            #945 <String "** Minutes Until Recharged: ">
	//   75  151:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   76  154:pop             
		stringbuilder.append(((int) (robotmissionstatusevent.minutesUntilRecharged())));
	//   77  155:aload_2         
	//   78  156:aload_1         
	//   79  157:invokevirtual   #948 <Method short RobotMissionStatusEvent.minutesUntilRecharged()>
	//   80  160:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//   81  163:pop             
		o.a("CoreEventReceiver", stringbuilder.toString());
	//   82  164:ldc1            #63  <String "CoreEventReceiver">
	//   83  166:aload_2         
	//   84  167:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   85  170:invokestatic    #123 <Method void o.a(String, String)>
		stringbuilder = new StringBuilder();
	//   86  173:new             #90  <Class StringBuilder>
	//   87  176:dup             
	//   88  177:invokespecial   #93  <Method void StringBuilder()>
	//   89  180:astore_2        
		stringbuilder.append("** Mission Duration: ");
	//   90  181:aload_2         
	//   91  182:ldc2            #882 <String "** Mission Duration: ">
	//   92  185:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   93  188:pop             
		stringbuilder.append(robotmissionstatusevent.missionDuration());
	//   94  189:aload_2         
	//   95  190:aload_1         
	//   96  191:invokevirtual   #951 <Method int RobotMissionStatusEvent.missionDuration()>
	//   97  194:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//   98  197:pop             
		o.a("CoreEventReceiver", stringbuilder.toString());
	//   99  198:ldc1            #63  <String "CoreEventReceiver">
	//  100  200:aload_2         
	//  101  201:invokevirtual   #110 <Method String StringBuilder.toString()>
	//  102  204:invokestatic    #123 <Method void o.a(String, String)>
		a(((AssetEvent) (robotmissionstatusevent)));
	//  103  207:aload_0         
	//  104  208:aload_1         
	//  105  209:invokespecial   #695 <Method void a(AssetEvent)>
	//  106  212:return          
	}

	public void onRobotNameEvent(RobotNameEvent robotnameevent)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		((StringBuilder) (obj)).append("RobotNameEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #955 <String "RobotNameEvent received for asset ID: ">
	//    6   12:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (obj)).append(robotnameevent.assetId().getId());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #958 <Method AssetId RobotNameEvent.assetId()>
	//   11   21:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		o.b("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   14   28:ldc1            #63  <String "CoreEventReceiver">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #112 <Method void o.b(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   18   37:new             #90  <Class StringBuilder>
	//   19   40:dup             
	//   20   41:invokespecial   #93  <Method void StringBuilder()>
	//   21   44:astore_2        
		((StringBuilder) (obj)).append("** Robot Name: ");
	//   22   45:aload_2         
	//   23   46:ldc2            #960 <String "** Robot Name: ">
	//   24   49:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
		((StringBuilder) (obj)).append(robotnameevent.robotName());
	//   26   53:aload_2         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #963 <Method String RobotNameEvent.robotName()>
	//   29   58:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   30   61:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   31   62:ldc1            #63  <String "CoreEventReceiver">
	//   32   64:aload_2         
	//   33   65:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   34   68:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (j.c(robotnameevent.assetId())));
	//   35   71:aload_1         
	//   36   72:invokevirtual   #958 <Method AssetId RobotNameEvent.assetId()>
	//   37   75:invokestatic    #34  <Method Robot j.c(AssetId)>
	//   38   78:astore_2        
		if(obj != null)
	//*  39   79:aload_2         
	//*  40   80:ifnull          91
			((Robot) (obj)).a().a(robotnameevent);
	//   41   83:aload_2         
	//   42   84:invokevirtual   #420 <Method RobotPreferences Robot.a()>
	//   43   87:aload_1         
	//   44   88:invokevirtual   #965 <Method void RobotPreferences.a(RobotNameEvent)>
	//   45   91:return          
	}

	public void onRobotPasswordEvent(RobotPasswordEvent robotpasswordevent)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		((StringBuilder) (obj)).append("RobotPasswordEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #969 <String "RobotPasswordEvent received for asset ID: ">
	//    6   12:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (obj)).append(robotpasswordevent.assetId().getId());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #972 <Method AssetId RobotPasswordEvent.assetId()>
	//   11   21:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		o.b("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   14   28:ldc1            #63  <String "CoreEventReceiver">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #112 <Method void o.b(String, String)>
		obj = ((Object) (j.c(robotpasswordevent.assetId())));
	//   18   37:aload_1         
	//   19   38:invokevirtual   #972 <Method AssetId RobotPasswordEvent.assetId()>
	//   20   41:invokestatic    #34  <Method Robot j.c(AssetId)>
	//   21   44:astore_2        
		if(obj != null)
	//*  22   45:aload_2         
	//*  23   46:ifnull          55
		{
			((Robot) (obj)).a(robotpasswordevent);
	//   24   49:aload_2         
	//   25   50:aload_1         
	//   26   51:invokevirtual   #974 <Method void Robot.a(RobotPasswordEvent)>
			return;
	//   27   54:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   28   55:new             #90  <Class StringBuilder>
	//   29   58:dup             
	//   30   59:invokespecial   #93  <Method void StringBuilder()>
	//   31   62:astore_2        
			stringbuilder.append("RobotPasswordEvent did not find asset ID: ");
	//   32   63:aload_2         
	//   33   64:ldc2            #976 <String "RobotPasswordEvent did not find asset ID: ">
	//   34   67:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   35   70:pop             
			stringbuilder.append(robotpasswordevent.assetId().getId());
	//   36   71:aload_2         
	//   37   72:aload_1         
	//   38   73:invokevirtual   #972 <Method AssetId RobotPasswordEvent.assetId()>
	//   39   76:invokevirtual   #107 <Method String AssetId.getId()>
	//   40   79:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   41   82:pop             
			o.d("CoreEventReceiver", stringbuilder.toString());
	//   42   83:ldc1            #63  <String "CoreEventReceiver">
	//   43   85:aload_2         
	//   44   86:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   45   89:invokestatic    #978 <Method void o.d(String, String)>
			return;
	//   46   92:return          
		}
	}

	public void onRobotPoseEvent(RobotPoseEvent robotposeevent)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("RobotPoseEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #982 <String "RobotPoseEvent received for asset ID: ">
	//    6   12:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(robotposeevent.assetId().getId());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #985 <Method AssetId RobotPoseEvent.assetId()>
	//   11   21:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		o.b("CoreEventReceiver", stringbuilder.toString());
	//   14   28:ldc1            #63  <String "CoreEventReceiver">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #112 <Method void o.b(String, String)>
		stringbuilder = new StringBuilder();
	//   18   37:new             #90  <Class StringBuilder>
	//   19   40:dup             
	//   20   41:invokespecial   #93  <Method void StringBuilder()>
	//   21   44:astore_2        
		stringbuilder.append("** Theta: ");
	//   22   45:aload_2         
	//   23   46:ldc2            #987 <String "** Theta: ">
	//   24   49:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
		stringbuilder.append(((int) (robotposeevent.theta())));
	//   26   53:aload_2         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #990 <Method short RobotPoseEvent.theta()>
	//   29   58:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//   30   61:pop             
		o.a("CoreEventReceiver", stringbuilder.toString());
	//   31   62:ldc1            #63  <String "CoreEventReceiver">
	//   32   64:aload_2         
	//   33   65:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   34   68:invokestatic    #123 <Method void o.a(String, String)>
		stringbuilder = new StringBuilder();
	//   35   71:new             #90  <Class StringBuilder>
	//   36   74:dup             
	//   37   75:invokespecial   #93  <Method void StringBuilder()>
	//   38   78:astore_2        
		stringbuilder.append("** X-Position: ");
	//   39   79:aload_2         
	//   40   80:ldc2            #992 <String "** X-Position: ">
	//   41   83:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   42   86:pop             
		stringbuilder.append(((int) (robotposeevent.xPosition())));
	//   43   87:aload_2         
	//   44   88:aload_1         
	//   45   89:invokevirtual   #995 <Method short RobotPoseEvent.xPosition()>
	//   46   92:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//   47   95:pop             
		o.a("CoreEventReceiver", stringbuilder.toString());
	//   48   96:ldc1            #63  <String "CoreEventReceiver">
	//   49   98:aload_2         
	//   50   99:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   51  102:invokestatic    #123 <Method void o.a(String, String)>
		stringbuilder = new StringBuilder();
	//   52  105:new             #90  <Class StringBuilder>
	//   53  108:dup             
	//   54  109:invokespecial   #93  <Method void StringBuilder()>
	//   55  112:astore_2        
		stringbuilder.append("** Y-Position: ");
	//   56  113:aload_2         
	//   57  114:ldc2            #997 <String "** Y-Position: ">
	//   58  117:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   59  120:pop             
		stringbuilder.append(((int) (robotposeevent.yPosition())));
	//   60  121:aload_2         
	//   61  122:aload_1         
	//   62  123:invokevirtual   #1000 <Method short RobotPoseEvent.yPosition()>
	//   63  126:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//   64  129:pop             
		o.a("CoreEventReceiver", stringbuilder.toString());
	//   65  130:ldc1            #63  <String "CoreEventReceiver">
	//   66  132:aload_2         
	//   67  133:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   68  136:invokestatic    #123 <Method void o.a(String, String)>
	//   69  139:return          
	}

	public void onRobotPreferencesEvent(RobotPreferencesEvent robotpreferencesevent)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		((StringBuilder) (obj)).append("RobotPreferencesEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #1004 <String "RobotPreferencesEvent received for asset ID: ">
	//    6   12:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (obj)).append(robotpreferencesevent.assetId().getId());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #1007 <Method AssetId RobotPreferencesEvent.assetId()>
	//   11   21:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		o.b("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   14   28:ldc1            #63  <String "CoreEventReceiver">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #112 <Method void o.b(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   18   37:new             #90  <Class StringBuilder>
	//   19   40:dup             
	//   20   41:invokespecial   #93  <Method void StringBuilder()>
	//   21   44:astore_2        
		((StringBuilder) (obj)).append("** Two Pass: ");
	//   22   45:aload_2         
	//   23   46:ldc2            #1009 <String "** Two Pass: ">
	//   24   49:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
		((StringBuilder) (obj)).append(robotpreferencesevent.isCleanButton());
	//   26   53:aload_2         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #1012 <Method boolean RobotPreferencesEvent.isCleanButton()>
	//   29   58:invokevirtual   #267 <Method StringBuilder StringBuilder.append(boolean)>
	//   30   61:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   31   62:ldc1            #63  <String "CoreEventReceiver">
	//   32   64:aload_2         
	//   33   65:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   34   68:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   35   71:new             #90  <Class StringBuilder>
	//   36   74:dup             
	//   37   75:invokespecial   #93  <Method void StringBuilder()>
	//   38   78:astore_2        
		((StringBuilder) (obj)).append("** Edge Clean: ");
	//   39   79:aload_2         
	//   40   80:ldc2            #1014 <String "** Edge Clean: ">
	//   41   83:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   42   86:pop             
		((StringBuilder) (obj)).append(robotpreferencesevent.isOpenOnly() ^ true);
	//   43   87:aload_2         
	//   44   88:aload_1         
	//   45   89:invokevirtual   #1017 <Method boolean RobotPreferencesEvent.isOpenOnly()>
	//   46   92:iconst_1        
	//   47   93:ixor            
	//   48   94:invokevirtual   #267 <Method StringBuilder StringBuilder.append(boolean)>
	//   49   97:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   50   98:ldc1            #63  <String "CoreEventReceiver">
	//   51  100:aload_2         
	//   52  101:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   53  104:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   54  107:new             #90  <Class StringBuilder>
	//   55  110:dup             
	//   56  111:invokespecial   #93  <Method void StringBuilder()>
	//   57  114:astore_2        
		((StringBuilder) (obj)).append("** Schedule Hold: ");
	//   58  115:aload_2         
	//   59  116:ldc2            #1019 <String "** Schedule Hold: ">
	//   60  119:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   61  122:pop             
		((StringBuilder) (obj)).append(robotpreferencesevent.isSchedHold());
	//   62  123:aload_2         
	//   63  124:aload_1         
	//   64  125:invokevirtual   #1022 <Method boolean RobotPreferencesEvent.isSchedHold()>
	//   65  128:invokevirtual   #267 <Method StringBuilder StringBuilder.append(boolean)>
	//   66  131:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   67  132:ldc1            #63  <String "CoreEventReceiver">
	//   68  134:aload_2         
	//   69  135:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   70  138:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   71  141:new             #90  <Class StringBuilder>
	//   72  144:dup             
	//   73  145:invokespecial   #93  <Method void StringBuilder()>
	//   74  148:astore_2        
		((StringBuilder) (obj)).append("** Manual Update: ");
	//   75  149:aload_2         
	//   76  150:ldc2            #1024 <String "** Manual Update: ">
	//   77  153:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   78  156:pop             
		((StringBuilder) (obj)).append(robotpreferencesevent.isManUpd());
	//   79  157:aload_2         
	//   80  158:aload_1         
	//   81  159:invokevirtual   #1027 <Method boolean RobotPreferencesEvent.isManUpd()>
	//   82  162:invokevirtual   #267 <Method StringBuilder StringBuilder.append(boolean)>
	//   83  165:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   84  166:ldc1            #63  <String "CoreEventReceiver">
	//   85  168:aload_2         
	//   86  169:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   87  172:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   88  175:new             #90  <Class StringBuilder>
	//   89  178:dup             
	//   90  179:invokespecial   #93  <Method void StringBuilder()>
	//   91  182:astore_2        
		((StringBuilder) (obj)).append("** Carpet Boost: ");
	//   92  183:aload_2         
	//   93  184:ldc2            #1029 <String "** Carpet Boost: ">
	//   94  187:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   95  190:pop             
		((StringBuilder) (obj)).append(robotpreferencesevent.isNoBoost() ^ true);
	//   96  191:aload_2         
	//   97  192:aload_1         
	//   98  193:invokevirtual   #1032 <Method boolean RobotPreferencesEvent.isNoBoost()>
	//   99  196:iconst_1        
	//  100  197:ixor            
	//  101  198:invokevirtual   #267 <Method StringBuilder StringBuilder.append(boolean)>
	//  102  201:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//  103  202:ldc1            #63  <String "CoreEventReceiver">
	//  104  204:aload_2         
	//  105  205:invokevirtual   #110 <Method String StringBuilder.toString()>
	//  106  208:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (new StringBuilder()));
	//  107  211:new             #90  <Class StringBuilder>
	//  108  214:dup             
	//  109  215:invokespecial   #93  <Method void StringBuilder()>
	//  110  218:astore_2        
		((StringBuilder) (obj)).append("** Bin Pause: ");
	//  111  219:aload_2         
	//  112  220:ldc2            #1034 <String "** Bin Pause: ">
	//  113  223:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  114  226:pop             
		((StringBuilder) (obj)).append(robotpreferencesevent.isBinPause());
	//  115  227:aload_2         
	//  116  228:aload_1         
	//  117  229:invokevirtual   #1037 <Method boolean RobotPreferencesEvent.isBinPause()>
	//  118  232:invokevirtual   #267 <Method StringBuilder StringBuilder.append(boolean)>
	//  119  235:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//  120  236:ldc1            #63  <String "CoreEventReceiver">
	//  121  238:aload_2         
	//  122  239:invokevirtual   #110 <Method String StringBuilder.toString()>
	//  123  242:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (new StringBuilder()));
	//  124  245:new             #90  <Class StringBuilder>
	//  125  248:dup             
	//  126  249:invokespecial   #93  <Method void StringBuilder()>
	//  127  252:astore_2        
		((StringBuilder) (obj)).append("** Vacuum High: ");
	//  128  253:aload_2         
	//  129  254:ldc2            #1039 <String "** Vacuum High: ">
	//  130  257:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  131  260:pop             
		((StringBuilder) (obj)).append(robotpreferencesevent.isVacuumHigh());
	//  132  261:aload_2         
	//  133  262:aload_1         
	//  134  263:invokevirtual   #1042 <Method boolean RobotPreferencesEvent.isVacuumHigh()>
	//  135  266:invokevirtual   #267 <Method StringBuilder StringBuilder.append(boolean)>
	//  136  269:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//  137  270:ldc1            #63  <String "CoreEventReceiver">
	//  138  272:aload_2         
	//  139  273:invokevirtual   #110 <Method String StringBuilder.toString()>
	//  140  276:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (new StringBuilder()));
	//  141  279:new             #90  <Class StringBuilder>
	//  142  282:dup             
	//  143  283:invokespecial   #93  <Method void StringBuilder()>
	//  144  286:astore_2        
		((StringBuilder) (obj)).append("** No Persistent Pass: ");
	//  145  287:aload_2         
	//  146  288:ldc2            #1044 <String "** No Persistent Pass: ">
	//  147  291:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  148  294:pop             
		((StringBuilder) (obj)).append(robotpreferencesevent.isNoPersistentPass());
	//  149  295:aload_2         
	//  150  296:aload_1         
	//  151  297:invokevirtual   #1047 <Method boolean RobotPreferencesEvent.isNoPersistentPass()>
	//  152  300:invokevirtual   #267 <Method StringBuilder StringBuilder.append(boolean)>
	//  153  303:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//  154  304:ldc1            #63  <String "CoreEventReceiver">
	//  155  306:aload_2         
	//  156  307:invokevirtual   #110 <Method String StringBuilder.toString()>
	//  157  310:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (new StringBuilder()));
	//  158  313:new             #90  <Class StringBuilder>
	//  159  316:dup             
	//  160  317:invokespecial   #93  <Method void StringBuilder()>
	//  161  320:astore_2        
		((StringBuilder) (obj)).append("** Eco Charge: ");
	//  162  321:aload_2         
	//  163  322:ldc2            #1049 <String "** Eco Charge: ">
	//  164  325:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  165  328:pop             
		((StringBuilder) (obj)).append(robotpreferencesevent.isEcoCharge());
	//  166  329:aload_2         
	//  167  330:aload_1         
	//  168  331:invokevirtual   #1052 <Method boolean RobotPreferencesEvent.isEcoCharge()>
	//  169  334:invokevirtual   #267 <Method StringBuilder StringBuilder.append(boolean)>
	//  170  337:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//  171  338:ldc1            #63  <String "CoreEventReceiver">
	//  172  340:aload_2         
	//  173  341:invokevirtual   #110 <Method String StringBuilder.toString()>
	//  174  344:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (new StringBuilder()));
	//  175  347:new             #90  <Class StringBuilder>
	//  176  350:dup             
	//  177  351:invokespecial   #93  <Method void StringBuilder()>
	//  178  354:astore_2        
		((StringBuilder) (obj)).append("** No Auto Passes: ");
	//  179  355:aload_2         
	//  180  356:ldc2            #1054 <String "** No Auto Passes: ">
	//  181  359:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  182  362:pop             
		((StringBuilder) (obj)).append(robotpreferencesevent.isNoAutomaticNumberOfPasses());
	//  183  363:aload_2         
	//  184  364:aload_1         
	//  185  365:invokevirtual   #1057 <Method boolean RobotPreferencesEvent.isNoAutomaticNumberOfPasses()>
	//  186  368:invokevirtual   #267 <Method StringBuilder StringBuilder.append(boolean)>
	//  187  371:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//  188  372:ldc1            #63  <String "CoreEventReceiver">
	//  189  374:aload_2         
	//  190  375:invokevirtual   #110 <Method String StringBuilder.toString()>
	//  191  378:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (j.c(robotpreferencesevent.assetId())));
	//  192  381:aload_1         
	//  193  382:invokevirtual   #1007 <Method AssetId RobotPreferencesEvent.assetId()>
	//  194  385:invokestatic    #34  <Method Robot j.c(AssetId)>
	//  195  388:astore_2        
		if(obj != null)
	//* 196  389:aload_2         
	//* 197  390:ifnull          401
			((Robot) (obj)).a().a(robotpreferencesevent);
	//  198  393:aload_2         
	//  199  394:invokevirtual   #420 <Method RobotPreferences Robot.a()>
	//  200  397:aload_1         
	//  201  398:invokevirtual   #1059 <Method void RobotPreferences.a(RobotPreferencesEvent)>
	//  202  401:return          
	}

	public void onRobotReadinessEvent(RobotReadinessEvent robotreadinessevent)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("RobotReadinessEvent received for asset Id: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #1062 <String "RobotReadinessEvent received for asset Id: ">
	//    6   12:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(robotreadinessevent.assetId().getId());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #1063 <Method AssetId RobotReadinessEvent.assetId()>
	//   11   21:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		o.b("CoreEventReceiver", stringbuilder.toString());
	//   14   28:ldc1            #63  <String "CoreEventReceiver">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #112 <Method void o.b(String, String)>
		stringbuilder = new StringBuilder();
	//   18   37:new             #90  <Class StringBuilder>
	//   19   40:dup             
	//   20   41:invokespecial   #93  <Method void StringBuilder()>
	//   21   44:astore_2        
		stringbuilder.append("** Readiness State: ");
	//   22   45:aload_2         
	//   23   46:ldc2            #1065 <String "** Readiness State: ">
	//   24   49:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
		stringbuilder.append(((Object) (robotreadinessevent.readinessState())));
	//   26   53:aload_2         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #1069 <Method com.irobot.core.RobotReadinessState RobotReadinessEvent.readinessState()>
	//   29   58:invokevirtual   #412 <Method StringBuilder StringBuilder.append(Object)>
	//   30   61:pop             
		o.a("CoreEventReceiver", stringbuilder.toString());
	//   31   62:ldc1            #63  <String "CoreEventReceiver">
	//   32   64:aload_2         
	//   33   65:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   34   68:invokestatic    #123 <Method void o.a(String, String)>
		a(((AssetEvent) (robotreadinessevent)));
	//   35   71:aload_0         
	//   36   72:aload_1         
	//   37   73:invokespecial   #695 <Method void a(AssetEvent)>
	//   38   76:return          
	}

	public void onRobotScheduleEvent(RobotScheduleEvent robotscheduleevent)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("RobotScheduleEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #1073 <String "RobotScheduleEvent received for asset ID: ">
	//    6   12:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(robotscheduleevent.assetId().getId());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #1076 <Method AssetId RobotScheduleEvent.assetId()>
	//   11   21:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		o.b("CoreEventReceiver", stringbuilder.toString());
	//   14   28:ldc1            #63  <String "CoreEventReceiver">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #112 <Method void o.b(String, String)>
		StringBuilder stringbuilder1;
		for(Iterator iterator = robotscheduleevent.scheduleMap().keySet().iterator(); iterator.hasNext(); o.a("CoreEventReceiver", stringbuilder1.toString()))
	//*  18   37:aload_1         
	//*  19   38:invokevirtual   #1079 <Method HashMap RobotScheduleEvent.scheduleMap()>
	//*  20   41:invokevirtual   #1082 <Method Set HashMap.keySet()>
	//*  21   44:invokeinterface #644 <Method Iterator Set.iterator()>
	//*  22   49:astore_2        
	//*  23   50:aload_2         
	//*  24   51:invokeinterface #649 <Method boolean Iterator.hasNext()>
	//*  25   56:ifeq            186
		{
			DayOfTheWeek dayoftheweek = (DayOfTheWeek)iterator.next();
	//   26   59:aload_2         
	//   27   60:invokeinterface #652 <Method Object Iterator.next()>
	//   28   65:checkcast       #535 <Class DayOfTheWeek>
	//   29   68:astore_3        
			ScheduleDay scheduleday = (ScheduleDay)robotscheduleevent.scheduleMap().get(((Object) (dayoftheweek)));
	//   30   69:aload_1         
	//   31   70:invokevirtual   #1079 <Method HashMap RobotScheduleEvent.scheduleMap()>
	//   32   73:aload_3         
	//   33   74:invokevirtual   #1085 <Method Object HashMap.get(Object)>
	//   34   77:checkcast       #1087 <Class ScheduleDay>
	//   35   80:astore          4
			stringbuilder1 = new StringBuilder();
	//   36   82:new             #90  <Class StringBuilder>
	//   37   85:dup             
	//   38   86:invokespecial   #93  <Method void StringBuilder()>
	//   39   89:astore          5
			stringbuilder1.append("** Schedule: ");
	//   40   91:aload           5
	//   41   93:ldc2            #1089 <String "** Schedule: ">
	//   42   96:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   43   99:pop             
			stringbuilder1.append(dayoftheweek.name());
	//   44  100:aload           5
	//   45  102:aload_3         
	//   46  103:invokevirtual   #536 <Method String DayOfTheWeek.name()>
	//   47  106:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   48  109:pop             
			stringbuilder1.append(", ");
	//   49  110:aload           5
	//   50  112:ldc2            #664 <String ", ">
	//   51  115:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   52  118:pop             
			stringbuilder1.append(scheduleday.getHour());
	//   53  119:aload           5
	//   54  121:aload           4
	//   55  123:invokevirtual   #1092 <Method int ScheduleDay.getHour()>
	//   56  126:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//   57  129:pop             
			stringbuilder1.append(", ");
	//   58  130:aload           5
	//   59  132:ldc2            #664 <String ", ">
	//   60  135:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   61  138:pop             
			stringbuilder1.append(scheduleday.getMinute());
	//   62  139:aload           5
	//   63  141:aload           4
	//   64  143:invokevirtual   #1095 <Method int ScheduleDay.getMinute()>
	//   65  146:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//   66  149:pop             
			stringbuilder1.append(", ");
	//   67  150:aload           5
	//   68  152:ldc2            #664 <String ", ">
	//   69  155:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   70  158:pop             
			stringbuilder1.append(scheduleday.getCycle().name());
	//   71  159:aload           5
	//   72  161:aload           4
	//   73  163:invokevirtual   #1099 <Method ScheduleCycleType ScheduleDay.getCycle()>
	//   74  166:invokevirtual   #1102 <Method String ScheduleCycleType.name()>
	//   75  169:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   76  172:pop             
		}

	//   77  173:ldc1            #63  <String "CoreEventReceiver">
	//   78  175:aload           5
	//   79  177:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   80  180:invokestatic    #123 <Method void o.a(String, String)>
	//*  81  183:goto            50
	//   82  186:return          
	}

	public void onRobotTimeZoneEvent(RobotTimeZoneEvent robottimezoneevent)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		((StringBuilder) (obj)).append("RobotTimeZoneEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #1106 <String "RobotTimeZoneEvent received for asset ID: ">
	//    6   12:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (obj)).append(robottimezoneevent.assetId().getId());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #1109 <Method AssetId RobotTimeZoneEvent.assetId()>
	//   11   21:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		o.b("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   14   28:ldc1            #63  <String "CoreEventReceiver">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #112 <Method void o.b(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   18   37:new             #90  <Class StringBuilder>
	//   19   40:dup             
	//   20   41:invokespecial   #93  <Method void StringBuilder()>
	//   21   44:astore_2        
		((StringBuilder) (obj)).append("** Time Zone: ");
	//   22   45:aload_2         
	//   23   46:ldc2            #1111 <String "** Time Zone: ">
	//   24   49:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
		((StringBuilder) (obj)).append(robottimezoneevent.robotTimeZone());
	//   26   53:aload_2         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #1114 <Method String RobotTimeZoneEvent.robotTimeZone()>
	//   29   58:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   30   61:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   31   62:ldc1            #63  <String "CoreEventReceiver">
	//   32   64:aload_2         
	//   33   65:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   34   68:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (j.c(robottimezoneevent.assetId())));
	//   35   71:aload_1         
	//   36   72:invokevirtual   #1109 <Method AssetId RobotTimeZoneEvent.assetId()>
	//   37   75:invokestatic    #34  <Method Robot j.c(AssetId)>
	//   38   78:astore_2        
		if(obj != null)
	//*  39   79:aload_2         
	//*  40   80:ifnull          102
		{
			((Robot) (obj)).a().a(robottimezoneevent);
	//   41   83:aload_2         
	//   42   84:invokevirtual   #420 <Method RobotPreferences Robot.a()>
	//   43   87:aload_1         
	//   44   88:invokevirtual   #1116 <Method void RobotPreferences.a(RobotTimeZoneEvent)>
			((Robot) (obj)).a().e().a(robottimezoneevent);
	//   45   91:aload_2         
	//   46   92:invokevirtual   #420 <Method RobotPreferences Robot.a()>
	//   47   95:invokevirtual   #425 <Method RobotAxedaPreferences RobotPreferences.e()>
	//   48   98:aload_1         
	//   49   99:invokevirtual   #1117 <Method void RobotAxedaPreferences.a(RobotTimeZoneEvent)>
		}
	//   50  102:return          
	}

	public void onWifiConfigEvent(WifiConfigEvent wificonfigevent)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_2        
		((StringBuilder) (obj)).append("WifiConfigEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #1121 <String "WifiConfigEvent received for asset ID: ">
	//    6   12:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (obj)).append(wificonfigevent.assetId().getId());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #1124 <Method AssetId WifiConfigEvent.assetId()>
	//   11   21:invokevirtual   #107 <Method String AssetId.getId()>
	//   12   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		o.b("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   14   28:ldc1            #63  <String "CoreEventReceiver">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #112 <Method void o.b(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   18   37:new             #90  <Class StringBuilder>
	//   19   40:dup             
	//   20   41:invokespecial   #93  <Method void StringBuilder()>
	//   21   44:astore_2        
		((StringBuilder) (obj)).append("** SSID: ");
	//   22   45:aload_2         
	//   23   46:ldc2            #1126 <String "** SSID: ">
	//   24   49:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
		((StringBuilder) (obj)).append(wificonfigevent.ssid());
	//   26   53:aload_2         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #1129 <Method String WifiConfigEvent.ssid()>
	//   29   58:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   30   61:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   31   62:ldc1            #63  <String "CoreEventReceiver">
	//   32   64:aload_2         
	//   33   65:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   34   68:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   35   71:new             #90  <Class StringBuilder>
	//   36   74:dup             
	//   37   75:invokespecial   #93  <Method void StringBuilder()>
	//   38   78:astore_2        
		((StringBuilder) (obj)).append("** Password: ");
	//   39   79:aload_2         
	//   40   80:ldc2            #1131 <String "** Password: ">
	//   41   83:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   42   86:pop             
		((StringBuilder) (obj)).append(wificonfigevent.password());
	//   43   87:aload_2         
	//   44   88:aload_1         
	//   45   89:invokevirtual   #1134 <Method String WifiConfigEvent.password()>
	//   46   92:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   47   95:pop             
		o.a("CoreEventReceiver", ((StringBuilder) (obj)).toString());
	//   48   96:ldc1            #63  <String "CoreEventReceiver">
	//   49   98:aload_2         
	//   50   99:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   51  102:invokestatic    #123 <Method void o.a(String, String)>
		obj = ((Object) (j.c(wificonfigevent.assetId())));
	//   52  105:aload_1         
	//   53  106:invokevirtual   #1124 <Method AssetId WifiConfigEvent.assetId()>
	//   54  109:invokestatic    #34  <Method Robot j.c(AssetId)>
	//   55  112:astore_2        
		if(obj != null)
	//*  56  113:aload_2         
	//*  57  114:ifnull          125
			((Robot) (obj)).d().a(wificonfigevent);
	//   58  117:aload_2         
	//   59  118:invokevirtual   #328 <Method NetworkSettings Robot.d()>
	//   60  121:aload_1         
	//   61  122:invokevirtual   #1136 <Method void NetworkSettings.a(WifiConfigEvent)>
	//   62  125:return          
	}

	private static WeakReference b;
}
