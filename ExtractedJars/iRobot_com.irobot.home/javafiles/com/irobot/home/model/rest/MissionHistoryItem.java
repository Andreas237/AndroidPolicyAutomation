// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model.rest;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.irobot.core.*;
import com.irobot.home.util.o;
import java.text.SimpleDateFormat;
import java.util.*;

public class MissionHistoryItem
	implements Parcelable
{

	public MissionHistoryItem()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #164 <Method void Object()>
		date = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #166 <String "">
	//    4    7:putfield        #168 <Field String date>
		nMssn = 0;
	//    5   10:aload_0         
	//    6   11:iconst_0        
	//    7   12:putfield        #170 <Field int nMssn>
		mMapId = "";
	//    8   15:aload_0         
	//    9   16:ldc1            #166 <String "">
	//   10   18:putfield        #172 <Field String mMapId>
		done = "";
	//   11   21:aload_0         
	//   12   22:ldc1            #166 <String "">
	//   13   24:putfield        #174 <Field String done>
		cleanMode = 0;
	//   14   27:aload_0         
	//   15   28:iconst_0        
	//   16   29:putfield        #176 <Field int cleanMode>
		batteryType = 0;
	//   17   32:aload_0         
	//   18   33:iconst_0        
	//   19   34:putfield        #178 <Field int batteryType>
		complete = 0;
	//   20   37:aload_0         
	//   21   38:iconst_0        
	//   22   39:putfield        #180 <Field int complete>
		sqft = 0;
	//   23   42:aload_0         
	//   24   43:iconst_0        
	//   25   44:putfield        #182 <Field int sqft>
		runM = 0;
	//   26   47:aload_0         
	//   27   48:iconst_0        
	//   28   49:putfield        #184 <Field int runM>
		commandType = "";
	//   29   52:aload_0         
	//   30   53:ldc1            #166 <String "">
	//   31   55:putfield        #186 <Field String commandType>
	//   32   58:return          
	}

	public MissionHistoryItem(Parcel parcel)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #188 <Method void MissionHistoryItem()>
		date = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #194 <Method String Parcel.readString()>
	//    5    9:putfield        #168 <Field String date>
		nMssn = parcel.readInt();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #198 <Method int Parcel.readInt()>
	//    9   17:putfield        #170 <Field int nMssn>
		mMapId = parcel.readString();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #194 <Method String Parcel.readString()>
	//   13   25:putfield        #172 <Field String mMapId>
		done = parcel.readString();
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #194 <Method String Parcel.readString()>
	//   17   33:putfield        #174 <Field String done>
		flags = parcel.readInt();
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #198 <Method int Parcel.readInt()>
	//   21   41:putfield        #200 <Field int flags>
		chrgM = parcel.readInt();
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokevirtual   #198 <Method int Parcel.readInt()>
	//   25   49:putfield        #202 <Field int chrgM>
		pauseM = parcel.readInt();
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:invokevirtual   #198 <Method int Parcel.readInt()>
	//   29   57:putfield        #204 <Field int pauseM>
		doneM = parcel.readInt();
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:invokevirtual   #198 <Method int Parcel.readInt()>
	//   33   65:putfield        #206 <Field int doneM>
		dirt = parcel.readInt();
	//   34   68:aload_0         
	//   35   69:aload_1         
	//   36   70:invokevirtual   #198 <Method int Parcel.readInt()>
	//   37   73:putfield        #208 <Field int dirt>
		chrgs = parcel.readInt();
	//   38   76:aload_0         
	//   39   77:aload_1         
	//   40   78:invokevirtual   #198 <Method int Parcel.readInt()>
	//   41   81:putfield        #210 <Field int chrgs>
		saves = parcel.readInt();
	//   42   84:aload_0         
	//   43   85:aload_1         
	//   44   86:invokevirtual   #198 <Method int Parcel.readInt()>
	//   45   89:putfield        #212 <Field int saves>
		evacs = parcel.readInt();
	//   46   92:aload_0         
	//   47   93:aload_1         
	//   48   94:invokevirtual   #198 <Method int Parcel.readInt()>
	//   49   97:putfield        #214 <Field int evacs>
		pauseId = parcel.readInt();
	//   50  100:aload_0         
	//   51  101:aload_1         
	//   52  102:invokevirtual   #198 <Method int Parcel.readInt()>
	//   53  105:putfield        #216 <Field int pauseId>
		cleanMode = parcel.readInt();
	//   54  108:aload_0         
	//   55  109:aload_1         
	//   56  110:invokevirtual   #198 <Method int Parcel.readInt()>
	//   57  113:putfield        #176 <Field int cleanMode>
		batteryType = parcel.readInt();
	//   58  116:aload_0         
	//   59  117:aload_1         
	//   60  118:invokevirtual   #198 <Method int Parcel.readInt()>
	//   61  121:putfield        #178 <Field int batteryType>
		complete = parcel.readInt();
	//   62  124:aload_0         
	//   63  125:aload_1         
	//   64  126:invokevirtual   #198 <Method int Parcel.readInt()>
	//   65  129:putfield        #180 <Field int complete>
		sqft = parcel.readInt();
	//   66  132:aload_0         
	//   67  133:aload_1         
	//   68  134:invokevirtual   #198 <Method int Parcel.readInt()>
	//   69  137:putfield        #182 <Field int sqft>
		runM = parcel.readInt();
	//   70  140:aload_0         
	//   71  141:aload_1         
	//   72  142:invokevirtual   #198 <Method int Parcel.readInt()>
	//   73  145:putfield        #184 <Field int runM>
		commandType = parcel.readString();
	//   74  148:aload_0         
	//   75  149:aload_1         
	//   76  150:invokevirtual   #194 <Method String Parcel.readString()>
	//   77  153:putfield        #186 <Field String commandType>
		startTime = parcel.readInt();
	//   78  156:aload_0         
	//   79  157:aload_1         
	//   80  158:invokevirtual   #198 <Method int Parcel.readInt()>
	//   81  161:putfield        #218 <Field int startTime>
		timeStamp = parcel.readInt();
	//   82  164:aload_0         
	//   83  165:aload_1         
	//   84  166:invokevirtual   #198 <Method int Parcel.readInt()>
	//   85  169:putfield        #220 <Field int timeStamp>
		missionDurationInMinutes = parcel.readInt();
	//   86  172:aload_0         
	//   87  173:aload_1         
	//   88  174:invokevirtual   #198 <Method int Parcel.readInt()>
	//   89  177:putfield        #222 <Field int missionDurationInMinutes>
	//   90  180:return          
	}

	public MissionHistoryItem(RobotMissionHistoryItem robotmissionhistoryitem)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #164 <Method void Object()>
		date = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #166 <String "">
	//    4    7:putfield        #168 <Field String date>
		boolean flag = false;
	//    5   10:iconst_0        
	//    6   11:istore_3        
		nMssn = 0;
	//    7   12:aload_0         
	//    8   13:iconst_0        
	//    9   14:putfield        #170 <Field int nMssn>
		mMapId = "";
	//   10   17:aload_0         
	//   11   18:ldc1            #166 <String "">
	//   12   20:putfield        #172 <Field String mMapId>
		done = "";
	//   13   23:aload_0         
	//   14   24:ldc1            #166 <String "">
	//   15   26:putfield        #174 <Field String done>
		cleanMode = 0;
	//   16   29:aload_0         
	//   17   30:iconst_0        
	//   18   31:putfield        #176 <Field int cleanMode>
		batteryType = 0;
	//   19   34:aload_0         
	//   20   35:iconst_0        
	//   21   36:putfield        #178 <Field int batteryType>
		complete = 0;
	//   22   39:aload_0         
	//   23   40:iconst_0        
	//   24   41:putfield        #180 <Field int complete>
		sqft = 0;
	//   25   44:aload_0         
	//   26   45:iconst_0        
	//   27   46:putfield        #182 <Field int sqft>
		runM = 0;
	//   28   49:aload_0         
	//   29   50:iconst_0        
	//   30   51:putfield        #184 <Field int runM>
		commandType = "";
	//   31   54:aload_0         
	//   32   55:ldc1            #166 <String "">
	//   33   57:putfield        #186 <Field String commandType>
		date = (new SimpleDateFormat("yyyyMMdd HH:mm:ss")).format(new Date((long)robotmissionhistoryitem.getTimestamp() * 1000L));
	//   34   60:aload_0         
	//   35   61:new             #225 <Class SimpleDateFormat>
	//   36   64:dup             
	//   37   65:ldc1            #227 <String "yyyyMMdd HH:mm:ss">
	//   38   67:invokespecial   #230 <Method void SimpleDateFormat(String)>
	//   39   70:new             #232 <Class Date>
	//   40   73:dup             
	//   41   74:aload_1         
	//   42   75:invokevirtual   #237 <Method int RobotMissionHistoryItem.getTimestamp()>
	//   43   78:i2l             
	//   44   79:ldc2w           #238 <Long 1000L>
	//   45   82:lmul            
	//   46   83:invokespecial   #242 <Method void Date(long)>
	//   47   86:invokevirtual   #246 <Method String SimpleDateFormat.format(Date)>
	//   48   89:putfield        #168 <Field String date>
		nMssn = robotmissionhistoryitem.getMissionId();
	//   49   92:aload_0         
	//   50   93:aload_1         
	//   51   94:invokevirtual   #249 <Method int RobotMissionHistoryItem.getMissionId()>
	//   52   97:putfield        #170 <Field int nMssn>
		done = (String)mCompletionStatusMap.get(((Object) (robotmissionhistoryitem.getCompletionStatus())));
	//   53  100:aload_0         
	//   54  101:getstatic       #132 <Field Map mCompletionStatusMap>
	//   55  104:aload_1         
	//   56  105:invokevirtual   #253 <Method RobotMissionHistoryCompletionStatus RobotMissionHistoryItem.getCompletionStatus()>
	//   57  108:invokeinterface #257 <Method Object Map.get(Object)>
	//   58  113:checkcast       #259 <Class String>
	//   59  116:putfield        #174 <Field String done>
		boolean flag1;
		if(robotmissionhistoryitem.getRobotSpecificStates().get(((Object) (RobotMissionBooleanStatusType.BinIsFull))) != null)
	//*  60  119:aload_1         
	//*  61  120:invokevirtual   #263 <Method HashMap RobotMissionHistoryItem.getRobotSpecificStates()>
	//*  62  123:getstatic       #269 <Field RobotMissionBooleanStatusType RobotMissionBooleanStatusType.BinIsFull>
	//*  63  126:invokevirtual   #270 <Method Object HashMap.get(Object)>
	//*  64  129:ifnull          153
			flag1 = ((Boolean)robotmissionhistoryitem.getRobotSpecificStates().get(((Object) (RobotMissionBooleanStatusType.BinIsFull)))).booleanValue();
	//   65  132:aload_1         
	//   66  133:invokevirtual   #263 <Method HashMap RobotMissionHistoryItem.getRobotSpecificStates()>
	//   67  136:getstatic       #269 <Field RobotMissionBooleanStatusType RobotMissionBooleanStatusType.BinIsFull>
	//   68  139:invokevirtual   #270 <Method Object HashMap.get(Object)>
	//   69  142:checkcast       #272 <Class Boolean>
	//   70  145:invokevirtual   #275 <Method boolean Boolean.booleanValue()>
	//   71  148:istore          5
		else
	//*  72  150:goto            156
			flag1 = false;
	//   73  153:iconst_0        
	//   74  154:istore          5
		boolean flag2;
		if(robotmissionhistoryitem.getRobotSpecificStates().get(((Object) (RobotMissionBooleanStatusType.BinIsRemoved))) != null)
	//*  75  156:aload_1         
	//*  76  157:invokevirtual   #263 <Method HashMap RobotMissionHistoryItem.getRobotSpecificStates()>
	//*  77  160:getstatic       #278 <Field RobotMissionBooleanStatusType RobotMissionBooleanStatusType.BinIsRemoved>
	//*  78  163:invokevirtual   #270 <Method Object HashMap.get(Object)>
	//*  79  166:ifnull          190
			flag2 = ((Boolean)robotmissionhistoryitem.getRobotSpecificStates().get(((Object) (RobotMissionBooleanStatusType.BinIsRemoved)))).booleanValue();
	//   80  169:aload_1         
	//   81  170:invokevirtual   #263 <Method HashMap RobotMissionHistoryItem.getRobotSpecificStates()>
	//   82  173:getstatic       #278 <Field RobotMissionBooleanStatusType RobotMissionBooleanStatusType.BinIsRemoved>
	//   83  176:invokevirtual   #270 <Method Object HashMap.get(Object)>
	//   84  179:checkcast       #272 <Class Boolean>
	//   85  182:invokevirtual   #275 <Method boolean Boolean.booleanValue()>
	//   86  185:istore          6
		else
	//*  87  187:goto            193
			flag2 = false;
	//   88  190:iconst_0        
	//   89  191:istore          6
		boolean flag3;
		if(robotmissionhistoryitem.getRobotSpecificStates().get(((Object) (RobotMissionBooleanStatusType.DockIsKnown))) != null)
	//*  90  193:aload_1         
	//*  91  194:invokevirtual   #263 <Method HashMap RobotMissionHistoryItem.getRobotSpecificStates()>
	//*  92  197:getstatic       #281 <Field RobotMissionBooleanStatusType RobotMissionBooleanStatusType.DockIsKnown>
	//*  93  200:invokevirtual   #270 <Method Object HashMap.get(Object)>
	//*  94  203:ifnull          227
			flag3 = ((Boolean)robotmissionhistoryitem.getRobotSpecificStates().get(((Object) (RobotMissionBooleanStatusType.DockIsKnown)))).booleanValue();
	//   95  206:aload_1         
	//   96  207:invokevirtual   #263 <Method HashMap RobotMissionHistoryItem.getRobotSpecificStates()>
	//   97  210:getstatic       #281 <Field RobotMissionBooleanStatusType RobotMissionBooleanStatusType.DockIsKnown>
	//   98  213:invokevirtual   #270 <Method Object HashMap.get(Object)>
	//   99  216:checkcast       #272 <Class Boolean>
	//  100  219:invokevirtual   #275 <Method boolean Boolean.booleanValue()>
	//  101  222:istore          7
		else
	//* 102  224:goto            230
			flag3 = false;
	//  103  227:iconst_0        
	//  104  228:istore          7
		boolean flag4;
		if(robotmissionhistoryitem.getRobotSpecificStates().get(((Object) (RobotMissionBooleanStatusType.AudioIsActive))) != null)
	//* 105  230:aload_1         
	//* 106  231:invokevirtual   #263 <Method HashMap RobotMissionHistoryItem.getRobotSpecificStates()>
	//* 107  234:getstatic       #284 <Field RobotMissionBooleanStatusType RobotMissionBooleanStatusType.AudioIsActive>
	//* 108  237:invokevirtual   #270 <Method Object HashMap.get(Object)>
	//* 109  240:ifnull          264
			flag4 = ((Boolean)robotmissionhistoryitem.getRobotSpecificStates().get(((Object) (RobotMissionBooleanStatusType.AudioIsActive)))).booleanValue();
	//  110  243:aload_1         
	//  111  244:invokevirtual   #263 <Method HashMap RobotMissionHistoryItem.getRobotSpecificStates()>
	//  112  247:getstatic       #284 <Field RobotMissionBooleanStatusType RobotMissionBooleanStatusType.AudioIsActive>
	//  113  250:invokevirtual   #270 <Method Object HashMap.get(Object)>
	//  114  253:checkcast       #272 <Class Boolean>
	//  115  256:invokevirtual   #275 <Method boolean Boolean.booleanValue()>
	//  116  259:istore          8
		else
	//* 117  261:goto            267
			flag4 = false;
	//  118  264:iconst_0        
	//  119  265:istore          8
		int i;
		if(flag1)
	//* 120  267:iload           5
	//* 121  269:ifeq            284
			i = 1 << RobotMissionBooleanStatusType.BinIsFull.ordinal();
	//  122  272:iconst_1        
	//  123  273:getstatic       #269 <Field RobotMissionBooleanStatusType RobotMissionBooleanStatusType.BinIsFull>
	//  124  276:invokevirtual   #287 <Method int RobotMissionBooleanStatusType.ordinal()>
	//  125  279:ishl            
	//  126  280:istore_2        
		else
	//* 127  281:goto            286
			i = 0;
	//  128  284:iconst_0        
	//  129  285:istore_2        
		flags = i;
	//  130  286:aload_0         
	//  131  287:iload_2         
	//  132  288:putfield        #200 <Field int flags>
		int j = flags;
	//  133  291:aload_0         
	//  134  292:getfield        #200 <Field int flags>
	//  135  295:istore          4
		if(flag2)
	//* 136  297:iload           6
	//* 137  299:ifeq            314
			i = 1 << RobotMissionBooleanStatusType.BinIsRemoved.ordinal();
	//  138  302:iconst_1        
	//  139  303:getstatic       #278 <Field RobotMissionBooleanStatusType RobotMissionBooleanStatusType.BinIsRemoved>
	//  140  306:invokevirtual   #287 <Method int RobotMissionBooleanStatusType.ordinal()>
	//  141  309:ishl            
	//  142  310:istore_2        
		else
	//* 143  311:goto            316
			i = 0;
	//  144  314:iconst_0        
	//  145  315:istore_2        
		flags = j + i;
	//  146  316:aload_0         
	//  147  317:iload           4
	//  148  319:iload_2         
	//  149  320:iadd            
	//  150  321:putfield        #200 <Field int flags>
		j = flags;
	//  151  324:aload_0         
	//  152  325:getfield        #200 <Field int flags>
	//  153  328:istore          4
		if(flag3)
	//* 154  330:iload           7
	//* 155  332:ifeq            347
			i = 1 << RobotMissionBooleanStatusType.DockIsKnown.ordinal();
	//  156  335:iconst_1        
	//  157  336:getstatic       #281 <Field RobotMissionBooleanStatusType RobotMissionBooleanStatusType.DockIsKnown>
	//  158  339:invokevirtual   #287 <Method int RobotMissionBooleanStatusType.ordinal()>
	//  159  342:ishl            
	//  160  343:istore_2        
		else
	//* 161  344:goto            349
			i = 0;
	//  162  347:iconst_0        
	//  163  348:istore_2        
		flags = j + i;
	//  164  349:aload_0         
	//  165  350:iload           4
	//  166  352:iload_2         
	//  167  353:iadd            
	//  168  354:putfield        #200 <Field int flags>
		j = flags;
	//  169  357:aload_0         
	//  170  358:getfield        #200 <Field int flags>
	//  171  361:istore          4
		i = ((int) (flag));
	//  172  363:iload_3         
	//  173  364:istore_2        
		if(flag4)
	//* 174  365:iload           8
	//* 175  367:ifeq            379
			i = 1 << RobotMissionBooleanStatusType.AudioIsActive.ordinal();
	//  176  370:iconst_1        
	//  177  371:getstatic       #284 <Field RobotMissionBooleanStatusType RobotMissionBooleanStatusType.AudioIsActive>
	//  178  374:invokevirtual   #287 <Method int RobotMissionBooleanStatusType.ordinal()>
	//  179  377:ishl            
	//  180  378:istore_2        
		flags = j + i;
	//  181  379:aload_0         
	//  182  380:iload           4
	//  183  382:iload_2         
	//  184  383:iadd            
	//  185  384:putfield        #200 <Field int flags>
		sqft = robotmissionhistoryitem.getSquareFeetCovered();
	//  186  387:aload_0         
	//  187  388:aload_1         
	//  188  389:invokevirtual   #290 <Method int RobotMissionHistoryItem.getSquareFeetCovered()>
	//  189  392:putfield        #182 <Field int sqft>
		runM = robotmissionhistoryitem.getMinutesRunning();
	//  190  395:aload_0         
	//  191  396:aload_1         
	//  192  397:invokevirtual   #293 <Method int RobotMissionHistoryItem.getMinutesRunning()>
	//  193  400:putfield        #184 <Field int runM>
		chrgM = robotmissionhistoryitem.getMinutesCharging();
	//  194  403:aload_0         
	//  195  404:aload_1         
	//  196  405:invokevirtual   #296 <Method int RobotMissionHistoryItem.getMinutesCharging()>
	//  197  408:putfield        #202 <Field int chrgM>
		pauseM = robotmissionhistoryitem.getMinutesPaused();
	//  198  411:aload_0         
	//  199  412:aload_1         
	//  200  413:invokevirtual   #299 <Method int RobotMissionHistoryItem.getMinutesPaused()>
	//  201  416:putfield        #204 <Field int pauseM>
		doneM = robotmissionhistoryitem.getMinutesDone();
	//  202  419:aload_0         
	//  203  420:aload_1         
	//  204  421:invokevirtual   #302 <Method int RobotMissionHistoryItem.getMinutesDone()>
	//  205  424:putfield        #206 <Field int doneM>
		dirt = ((int) (robotmissionhistoryitem.getNumberOfDirtDetects()));
	//  206  427:aload_0         
	//  207  428:aload_1         
	//  208  429:invokevirtual   #306 <Method short RobotMissionHistoryItem.getNumberOfDirtDetects()>
	//  209  432:putfield        #208 <Field int dirt>
		chrgs = ((int) (robotmissionhistoryitem.getNumberOfTimesCharged()));
	//  210  435:aload_0         
	//  211  436:aload_1         
	//  212  437:invokevirtual   #309 <Method short RobotMissionHistoryItem.getNumberOfTimesCharged()>
	//  213  440:putfield        #210 <Field int chrgs>
		saves = ((int) (robotmissionhistoryitem.getNumberOfRescues()));
	//  214  443:aload_0         
	//  215  444:aload_1         
	//  216  445:invokevirtual   #312 <Method short RobotMissionHistoryItem.getNumberOfRescues()>
	//  217  448:putfield        #212 <Field int saves>
		pauseId = ((int) (robotmissionhistoryitem.getErrorCode()));
	//  218  451:aload_0         
	//  219  452:aload_1         
	//  220  453:invokevirtual   #315 <Method short RobotMissionHistoryItem.getErrorCode()>
	//  221  456:putfield        #216 <Field int pauseId>
		commandType = robotmissionhistoryitem.getCommandType();
	//  222  459:aload_0         
	//  223  460:aload_1         
	//  224  461:invokevirtual   #318 <Method String RobotMissionHistoryItem.getCommandType()>
	//  225  464:putfield        #186 <Field String commandType>
		startTime = robotmissionhistoryitem.getStartTime();
	//  226  467:aload_0         
	//  227  468:aload_1         
	//  228  469:invokevirtual   #321 <Method int RobotMissionHistoryItem.getStartTime()>
	//  229  472:putfield        #218 <Field int startTime>
		timeStamp = robotmissionhistoryitem.getTimestamp();
	//  230  475:aload_0         
	//  231  476:aload_1         
	//  232  477:invokevirtual   #237 <Method int RobotMissionHistoryItem.getTimestamp()>
	//  233  480:putfield        #220 <Field int timeStamp>
		missionDurationInMinutes = robotmissionhistoryitem.getMissionDurationInMinutes();
	//  234  483:aload_0         
	//  235  484:aload_1         
	//  236  485:invokevirtual   #324 <Method int RobotMissionHistoryItem.getMissionDurationInMinutes()>
	//  237  488:putfield        #222 <Field int missionDurationInMinutes>
	//  238  491:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getBatteryType()
	{
		return batteryType;
	//    0    0:aload_0         
	//    1    1:getfield        #178 <Field int batteryType>
	//    2    4:ireturn         
	}

	public int getChrgM()
	{
		return chrgM;
	//    0    0:aload_0         
	//    1    1:getfield        #202 <Field int chrgM>
	//    2    4:ireturn         
	}

	public int getChrgs()
	{
		return chrgs;
	//    0    0:aload_0         
	//    1    1:getfield        #210 <Field int chrgs>
	//    2    4:ireturn         
	}

	public int getCleanMode()
	{
		return cleanMode;
	//    0    0:aload_0         
	//    1    1:getfield        #176 <Field int cleanMode>
	//    2    4:ireturn         
	}

	public String getCommandType()
	{
		return commandType;
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field String commandType>
	//    2    4:areturn         
	}

	public int getComplete()
	{
		return complete;
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field int complete>
	//    2    4:ireturn         
	}

	public RobotMissionHistoryCompletionStatus getCompletionStatus()
	{
		if(mCompletionStatusMapReversed.containsKey(((Object) (done))))
	//*   0    0:getstatic       #162 <Field Map mCompletionStatusMapReversed>
	//*   1    3:aload_0         
	//*   2    4:getfield        #174 <Field String done>
	//*   3    7:invokeinterface #334 <Method boolean Map.containsKey(Object)>
	//*   4   12:ifeq            31
			return (RobotMissionHistoryCompletionStatus)mCompletionStatusMapReversed.get(((Object) (done)));
	//    5   15:getstatic       #162 <Field Map mCompletionStatusMapReversed>
	//    6   18:aload_0         
	//    7   19:getfield        #174 <Field String done>
	//    8   22:invokeinterface #257 <Method Object Map.get(Object)>
	//    9   27:checkcast       #87  <Class RobotMissionHistoryCompletionStatus>
	//   10   30:areturn         
		else
			return null;
	//   11   31:aconst_null     
	//   12   32:areturn         
	}

	public String getCompletionStatusString(Context context)
	{
		Object obj;
label0:
		{
label1:
			{
label2:
				{
					obj = ((Object) (getCompletionStatus()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #337 <Method RobotMissionHistoryCompletionStatus getCompletionStatus()>
	//    2    4:astore_3        
					if(done == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #174 <Field String done>
	//*   5    9:ifnonnull       15
						return "";
	//    6   12:ldc1            #166 <String "">
	//    7   14:areturn         
					static class _cls2
					{

						static final int $SwitchMap$com$irobot$core$RobotMissionHistoryCompletionStatus[];

						static 
						{
							$SwitchMap$com$irobot$core$RobotMissionHistoryCompletionStatus = new int[RobotMissionHistoryCompletionStatus.values().length];
						//    0    0:invokestatic    #18  <Method RobotMissionHistoryCompletionStatus[] RobotMissionHistoryCompletionStatus.values()>
						//    1    3:arraylength     
						//    2    4:newarray        int[]
						//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$irobot$core$RobotMissionHistoryCompletionStatus>
							try
							{
								$SwitchMap$com$irobot$core$RobotMissionHistoryCompletionStatus[RobotMissionHistoryCompletionStatus.None.ordinal()] = 1;
						//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$irobot$core$RobotMissionHistoryCompletionStatus>
						//    5   12:getstatic       #24  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.None>
						//    6   15:invokevirtual   #28  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
						//    7   18:iconst_1        
						//    8   19:iastore         
							}
						//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$irobot$core$RobotMissionHistoryCompletionStatus>
						//*  10   23:getstatic       #31  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Busy>
						//*  11   26:invokevirtual   #28  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
						//*  12   29:iconst_2        
						//*  13   30:iastore         
						//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$irobot$core$RobotMissionHistoryCompletionStatus>
						//*  15   34:getstatic       #34  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Completed>
						//*  16   37:invokevirtual   #28  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
						//*  17   40:iconst_3        
						//*  18   41:iastore         
						//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$irobot$core$RobotMissionHistoryCompletionStatus>
						//*  20   45:getstatic       #37  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Full>
						//*  21   48:invokevirtual   #28  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
						//*  22   51:iconst_4        
						//*  23   52:iastore         
						//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$irobot$core$RobotMissionHistoryCompletionStatus>
						//*  25   56:getstatic       #40  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Stuck>
						//*  26   59:invokevirtual   #28  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
						//*  27   62:iconst_5        
						//*  28   63:iastore         
						//*  29   64:getstatic       #20  <Field int[] $SwitchMap$com$irobot$core$RobotMissionHistoryCompletionStatus>
						//*  30   67:getstatic       #43  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.LowBattery>
						//*  31   70:invokevirtual   #28  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
						//*  32   73:bipush          6
						//*  33   75:iastore         
						//*  34   76:getstatic       #20  <Field int[] $SwitchMap$com$irobot$core$RobotMissionHistoryCompletionStatus>
						//*  35   79:getstatic       #46  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Canceled>
						//*  36   82:invokevirtual   #28  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
						//*  37   85:bipush          7
						//*  38   87:iastore         
						//*  39   88:getstatic       #20  <Field int[] $SwitchMap$com$irobot$core$RobotMissionHistoryCompletionStatus>
						//*  40   91:getstatic       #49  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.ClockError>
						//*  41   94:invokevirtual   #28  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
						//*  42   97:bipush          8
						//*  43   99:iastore         
						//*  44  100:getstatic       #20  <Field int[] $SwitchMap$com$irobot$core$RobotMissionHistoryCompletionStatus>
						//*  45  103:getstatic       #52  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Incomplete>
						//*  46  106:invokevirtual   #28  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
						//*  47  109:bipush          9
						//*  48  111:iastore         
						//*  49  112:getstatic       #20  <Field int[] $SwitchMap$com$irobot$core$RobotMissionHistoryCompletionStatus>
						//*  50  115:getstatic       #55  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Empty>
						//*  51  118:invokevirtual   #28  <Method int RobotMissionHistoryCompletionStatus.ordinal()>
						//*  52  121:bipush          10
						//*  53  123:iastore         
						//*  54  124:return          
							catch(NoSuchFieldError nosuchfielderror) { }
						//   55  125:astore_0        
							try
							{
								$SwitchMap$com$irobot$core$RobotMissionHistoryCompletionStatus[RobotMissionHistoryCompletionStatus.Busy.ordinal()] = 2;
							}
						//*  56  126:goto            20
							catch(NoSuchFieldError nosuchfielderror1) { }
						//   57  129:astore_0        
							try
							{
								$SwitchMap$com$irobot$core$RobotMissionHistoryCompletionStatus[RobotMissionHistoryCompletionStatus.Completed.ordinal()] = 3;
							}
						//*  58  130:goto            31
							catch(NoSuchFieldError nosuchfielderror2) { }
						//   59  133:astore_0        
							try
							{
								$SwitchMap$com$irobot$core$RobotMissionHistoryCompletionStatus[RobotMissionHistoryCompletionStatus.Full.ordinal()] = 4;
							}
						//*  60  134:goto            42
							catch(NoSuchFieldError nosuchfielderror3) { }
						//   61  137:astore_0        
							try
							{
								$SwitchMap$com$irobot$core$RobotMissionHistoryCompletionStatus[RobotMissionHistoryCompletionStatus.Stuck.ordinal()] = 5;
							}
						//*  62  138:goto            53
							catch(NoSuchFieldError nosuchfielderror4) { }
						//   63  141:astore_0        
							try
							{
								$SwitchMap$com$irobot$core$RobotMissionHistoryCompletionStatus[RobotMissionHistoryCompletionStatus.LowBattery.ordinal()] = 6;
							}
						//*  64  142:goto            64
							catch(NoSuchFieldError nosuchfielderror5) { }
						//   65  145:astore_0        
							try
							{
								$SwitchMap$com$irobot$core$RobotMissionHistoryCompletionStatus[RobotMissionHistoryCompletionStatus.Canceled.ordinal()] = 7;
							}
						//*  66  146:goto            76
							catch(NoSuchFieldError nosuchfielderror6) { }
						//   67  149:astore_0        
							try
							{
								$SwitchMap$com$irobot$core$RobotMissionHistoryCompletionStatus[RobotMissionHistoryCompletionStatus.ClockError.ordinal()] = 8;
							}
						//*  68  150:goto            88
							catch(NoSuchFieldError nosuchfielderror7) { }
						//   69  153:astore_0        
							try
							{
								$SwitchMap$com$irobot$core$RobotMissionHistoryCompletionStatus[RobotMissionHistoryCompletionStatus.Incomplete.ordinal()] = 9;
							}
						//*  70  154:goto            100
							catch(NoSuchFieldError nosuchfielderror8) { }
						//   71  157:astore_0        
							try
							{
								$SwitchMap$com$irobot$core$RobotMissionHistoryCompletionStatus[RobotMissionHistoryCompletionStatus.Empty.ordinal()] = 10;
							}
						//*  72  158:goto            112
							catch(NoSuchFieldError nosuchfielderror9) { }
						//   73  161:astore_0        
						//*  74  162:return          
						}
					}

					int i;
					switch(_cls2..SwitchMap.com.irobot.core.RobotMissionHistoryCompletionStatus[((RobotMissionHistoryCompletionStatus) (obj)).ordinal()])
	//*   8   15:getstatic       #341 <Field int[] MissionHistoryItem$2.$SwitchMap$com$irobot$core$RobotMissionHistoryCompletionStatus>
	//*   9   18:aload_3         
	//*  10   19:invokevirtual   #342 <Method int RobotMissionHistoryCompletionStatus.ordinal()>
	//*  11   22:iaload          
					{
	//*  12   23:tableswitch     1 10: default 76
	//	               1 161
	//	               2 146
	//	               3 136
	//	               4 129
	//	               5 122
	//	               6 115
	//	               7 108
	//	               8 101
	//	               9 94
	//	               10 79
					default:
						return "";
	//   13   76:ldc1            #166 <String "">
	//   14   78:areturn         

					case 1: // '\001'
						break label1;

					case 2: // '\002'
						break label2;

					case 10: // '\n'
						obj = ((Object) (context.getString(0x7f0f0212)));
	//   15   79:aload_1         
	//   16   80:ldc2            #343 <Int 0x7f0f0212>
	//   17   83:invokevirtual   #349 <Method String Context.getString(int)>
	//   18   86:astore_3        
						context = "Empty state returned for completion status.";
	//   19   87:ldc2            #351 <String "Empty state returned for completion status.">
	//   20   90:astore_1        
						break label0;
	//   21   91:goto            173

					case 9: // '\t'
						i = 0x7f0f0211;
	//   22   94:ldc2            #352 <Int 0x7f0f0211>
	//   23   97:istore_2        
						break;
	//   24   98:goto            140

					case 8: // '\b'
						i = 0x7f0f0210;
	//   25  101:ldc2            #353 <Int 0x7f0f0210>
	//   26  104:istore_2        
						break;
	//   27  105:goto            140

					case 7: // '\007'
						i = 0x7f0f020f;
	//   28  108:ldc2            #354 <Int 0x7f0f020f>
	//   29  111:istore_2        
						break;
	//   30  112:goto            140

					case 6: // '\006'
						i = 0x7f0f020e;
	//   31  115:ldc2            #355 <Int 0x7f0f020e>
	//   32  118:istore_2        
						break;
	//   33  119:goto            140

					case 5: // '\005'
						i = 0x7f0f020d;
	//   34  122:ldc2            #356 <Int 0x7f0f020d>
	//   35  125:istore_2        
						break;
	//   36  126:goto            140

					case 4: // '\004'
						i = 0x7f0f020c;
	//   37  129:ldc2            #357 <Int 0x7f0f020c>
	//   38  132:istore_2        
						break;
	//   39  133:goto            140

					case 3: // '\003'
						i = 0x7f0f020b;
	//   40  136:ldc2            #358 <Int 0x7f0f020b>
	//   41  139:istore_2        
						break;
					}
					return context.getString(i);
	//   42  140:aload_1         
	//   43  141:iload_2         
	//   44  142:invokevirtual   #349 <Method String Context.getString(int)>
	//   45  145:areturn         
				}
				obj = ((Object) (context.getString(0x7f0f020a)));
	//   46  146:aload_1         
	//   47  147:ldc2            #359 <Int 0x7f0f020a>
	//   48  150:invokevirtual   #349 <Method String Context.getString(int)>
	//   49  153:astore_3        
				context = "Busy state returned for completion status.";
	//   50  154:ldc2            #361 <String "Busy state returned for completion status.">
	//   51  157:astore_1        
				break label0;
	//   52  158:goto            173
			}
			obj = ((Object) (context.getString(0x7f0f0209)));
	//   53  161:aload_1         
	//   54  162:ldc2            #362 <Int 0x7f0f0209>
	//   55  165:invokevirtual   #349 <Method String Context.getString(int)>
	//   56  168:astore_3        
			context = "None state returned for completion status.";
	//   57  169:ldc2            #364 <String "None state returned for completion status.">
	//   58  172:astore_1        
		}
		o.e("MissionHistoryItem", ((String) (context)));
	//   59  173:ldc2            #366 <String "MissionHistoryItem">
	//   60  176:aload_1         
	//   61  177:invokestatic    #372 <Method void o.e(String, String)>
		return ((String) (obj));
	//   62  180:aload_3         
	//   63  181:areturn         
	}

	public Date getDate()
	{
		return (new SimpleDateFormat("yyyyMMdd HH:mm")).parse(date);
	//    0    0:new             #225 <Class SimpleDateFormat>
	//    1    3:dup             
	//    2    4:ldc2            #376 <String "yyyyMMdd HH:mm">
	//    3    7:invokespecial   #230 <Method void SimpleDateFormat(String)>
	//    4   10:aload_0         
	//    5   11:getfield        #168 <Field String date>
	//    6   14:invokevirtual   #380 <Method Date SimpleDateFormat.parse(String)>
	//    7   17:areturn         
	}

	public int getDirt()
	{
		return dirt;
	//    0    0:aload_0         
	//    1    1:getfield        #208 <Field int dirt>
	//    2    4:ireturn         
	}

	public float getDistanceTraveled()
	{
		return (float)sqft / 0.561F;
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field int sqft>
	//    2    4:i2f             
	//    3    5:ldc1            #47  <Float 0.561F>
	//    4    7:fdiv            
	//    5    8:freturn         
	}

	public String getDone()
	{
		return done;
	//    0    0:aload_0         
	//    1    1:getfield        #174 <Field String done>
	//    2    4:areturn         
	}

	public int getDoneM()
	{
		return doneM;
	//    0    0:aload_0         
	//    1    1:getfield        #206 <Field int doneM>
	//    2    4:ireturn         
	}

	public int getDuration()
	{
		return runM + chrgM + pauseM;
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field int runM>
	//    2    4:aload_0         
	//    3    5:getfield        #202 <Field int chrgM>
	//    4    8:iadd            
	//    5    9:aload_0         
	//    6   10:getfield        #204 <Field int pauseM>
	//    7   13:iadd            
	//    8   14:ireturn         
	}

	public int getEvacs()
	{
		return evacs;
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field int evacs>
	//    2    4:ireturn         
	}

	public int getFlags()
	{
		return flags;
	//    0    0:aload_0         
	//    1    1:getfield        #200 <Field int flags>
	//    2    4:ireturn         
	}

	public String getMapId()
	{
		return mMapId;
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field String mMapId>
	//    2    4:areturn         
	}

	public int getMissionDurationInMinutes()
	{
		return missionDurationInMinutes;
	//    0    0:aload_0         
	//    1    1:getfield        #222 <Field int missionDurationInMinutes>
	//    2    4:ireturn         
	}

	public int getMissonId()
	{
		return nMssn;
	//    0    0:aload_0         
	//    1    1:getfield        #170 <Field int nMssn>
	//    2    4:ireturn         
	}

	public int getPauseId()
	{
		return pauseId;
	//    0    0:aload_0         
	//    1    1:getfield        #216 <Field int pauseId>
	//    2    4:ireturn         
	}

	public int getPauseM()
	{
		return pauseM;
	//    0    0:aload_0         
	//    1    1:getfield        #204 <Field int pauseM>
	//    2    4:ireturn         
	}

	public int getRunM()
	{
		return runM;
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field int runM>
	//    2    4:ireturn         
	}

	public int getSaves()
	{
		return saves;
	//    0    0:aload_0         
	//    1    1:getfield        #212 <Field int saves>
	//    2    4:ireturn         
	}

	public int getSqft()
	{
		return sqft;
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field int sqft>
	//    2    4:ireturn         
	}

	public int getStartTime()
	{
		return startTime;
	//    0    0:aload_0         
	//    1    1:getfield        #218 <Field int startTime>
	//    2    4:ireturn         
	}

	public int getTimeStamp()
	{
		return timeStamp;
	//    0    0:aload_0         
	//    1    1:getfield        #220 <Field int timeStamp>
	//    2    4:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #399 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #400 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("date: ");
	//    4    8:aload_1         
	//    5    9:ldc2            #402 <String "date: ">
	//    6   12:invokevirtual   #406 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(date);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #168 <Field String date>
	//   11   21:invokevirtual   #406 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder.append(", nMssn: ");
	//   13   25:aload_1         
	//   14   26:ldc2            #408 <String ", nMssn: ">
	//   15   29:invokevirtual   #406 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		stringbuilder.append(nMssn);
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #170 <Field int nMssn>
	//   20   38:invokevirtual   #411 <Method StringBuilder StringBuilder.append(int)>
	//   21   41:pop             
		stringbuilder.append(", mMapId: ");
	//   22   42:aload_1         
	//   23   43:ldc2            #413 <String ", mMapId: ">
	//   24   46:invokevirtual   #406 <Method StringBuilder StringBuilder.append(String)>
	//   25   49:pop             
		stringbuilder.append(mMapId);
	//   26   50:aload_1         
	//   27   51:aload_0         
	//   28   52:getfield        #172 <Field String mMapId>
	//   29   55:invokevirtual   #406 <Method StringBuilder StringBuilder.append(String)>
	//   30   58:pop             
		stringbuilder.append(", done: ");
	//   31   59:aload_1         
	//   32   60:ldc2            #415 <String ", done: ">
	//   33   63:invokevirtual   #406 <Method StringBuilder StringBuilder.append(String)>
	//   34   66:pop             
		stringbuilder.append(done);
	//   35   67:aload_1         
	//   36   68:aload_0         
	//   37   69:getfield        #174 <Field String done>
	//   38   72:invokevirtual   #406 <Method StringBuilder StringBuilder.append(String)>
	//   39   75:pop             
		stringbuilder.append(", flags: ");
	//   40   76:aload_1         
	//   41   77:ldc2            #417 <String ", flags: ">
	//   42   80:invokevirtual   #406 <Method StringBuilder StringBuilder.append(String)>
	//   43   83:pop             
		stringbuilder.append(flags);
	//   44   84:aload_1         
	//   45   85:aload_0         
	//   46   86:getfield        #200 <Field int flags>
	//   47   89:invokevirtual   #411 <Method StringBuilder StringBuilder.append(int)>
	//   48   92:pop             
		stringbuilder.append(", chargeM: ");
	//   49   93:aload_1         
	//   50   94:ldc2            #419 <String ", chargeM: ">
	//   51   97:invokevirtual   #406 <Method StringBuilder StringBuilder.append(String)>
	//   52  100:pop             
		stringbuilder.append(chrgM);
	//   53  101:aload_1         
	//   54  102:aload_0         
	//   55  103:getfield        #202 <Field int chrgM>
	//   56  106:invokevirtual   #411 <Method StringBuilder StringBuilder.append(int)>
	//   57  109:pop             
		stringbuilder.append(", pauseM: ");
	//   58  110:aload_1         
	//   59  111:ldc2            #421 <String ", pauseM: ">
	//   60  114:invokevirtual   #406 <Method StringBuilder StringBuilder.append(String)>
	//   61  117:pop             
		stringbuilder.append(pauseM);
	//   62  118:aload_1         
	//   63  119:aload_0         
	//   64  120:getfield        #204 <Field int pauseM>
	//   65  123:invokevirtual   #411 <Method StringBuilder StringBuilder.append(int)>
	//   66  126:pop             
		stringbuilder.append(", doneM: ");
	//   67  127:aload_1         
	//   68  128:ldc2            #423 <String ", doneM: ">
	//   69  131:invokevirtual   #406 <Method StringBuilder StringBuilder.append(String)>
	//   70  134:pop             
		stringbuilder.append(doneM);
	//   71  135:aload_1         
	//   72  136:aload_0         
	//   73  137:getfield        #206 <Field int doneM>
	//   74  140:invokevirtual   #411 <Method StringBuilder StringBuilder.append(int)>
	//   75  143:pop             
		stringbuilder.append(", dirt: ");
	//   76  144:aload_1         
	//   77  145:ldc2            #425 <String ", dirt: ">
	//   78  148:invokevirtual   #406 <Method StringBuilder StringBuilder.append(String)>
	//   79  151:pop             
		stringbuilder.append(dirt);
	//   80  152:aload_1         
	//   81  153:aload_0         
	//   82  154:getfield        #208 <Field int dirt>
	//   83  157:invokevirtual   #411 <Method StringBuilder StringBuilder.append(int)>
	//   84  160:pop             
		stringbuilder.append(", chrgs: ");
	//   85  161:aload_1         
	//   86  162:ldc2            #427 <String ", chrgs: ">
	//   87  165:invokevirtual   #406 <Method StringBuilder StringBuilder.append(String)>
	//   88  168:pop             
		stringbuilder.append(chrgs);
	//   89  169:aload_1         
	//   90  170:aload_0         
	//   91  171:getfield        #210 <Field int chrgs>
	//   92  174:invokevirtual   #411 <Method StringBuilder StringBuilder.append(int)>
	//   93  177:pop             
		stringbuilder.append(", saves: ");
	//   94  178:aload_1         
	//   95  179:ldc2            #429 <String ", saves: ">
	//   96  182:invokevirtual   #406 <Method StringBuilder StringBuilder.append(String)>
	//   97  185:pop             
		stringbuilder.append(saves);
	//   98  186:aload_1         
	//   99  187:aload_0         
	//  100  188:getfield        #212 <Field int saves>
	//  101  191:invokevirtual   #411 <Method StringBuilder StringBuilder.append(int)>
	//  102  194:pop             
		stringbuilder.append(", evacs: ");
	//  103  195:aload_1         
	//  104  196:ldc2            #431 <String ", evacs: ">
	//  105  199:invokevirtual   #406 <Method StringBuilder StringBuilder.append(String)>
	//  106  202:pop             
		stringbuilder.append(evacs);
	//  107  203:aload_1         
	//  108  204:aload_0         
	//  109  205:getfield        #214 <Field int evacs>
	//  110  208:invokevirtual   #411 <Method StringBuilder StringBuilder.append(int)>
	//  111  211:pop             
		stringbuilder.append(", pauseId: ");
	//  112  212:aload_1         
	//  113  213:ldc2            #433 <String ", pauseId: ">
	//  114  216:invokevirtual   #406 <Method StringBuilder StringBuilder.append(String)>
	//  115  219:pop             
		stringbuilder.append(pauseId);
	//  116  220:aload_1         
	//  117  221:aload_0         
	//  118  222:getfield        #216 <Field int pauseId>
	//  119  225:invokevirtual   #411 <Method StringBuilder StringBuilder.append(int)>
	//  120  228:pop             
		stringbuilder.append(", cleanMode: ");
	//  121  229:aload_1         
	//  122  230:ldc2            #435 <String ", cleanMode: ">
	//  123  233:invokevirtual   #406 <Method StringBuilder StringBuilder.append(String)>
	//  124  236:pop             
		stringbuilder.append(cleanMode);
	//  125  237:aload_1         
	//  126  238:aload_0         
	//  127  239:getfield        #176 <Field int cleanMode>
	//  128  242:invokevirtual   #411 <Method StringBuilder StringBuilder.append(int)>
	//  129  245:pop             
		stringbuilder.append(", batType: ");
	//  130  246:aload_1         
	//  131  247:ldc2            #437 <String ", batType: ">
	//  132  250:invokevirtual   #406 <Method StringBuilder StringBuilder.append(String)>
	//  133  253:pop             
		stringbuilder.append(batteryType);
	//  134  254:aload_1         
	//  135  255:aload_0         
	//  136  256:getfield        #178 <Field int batteryType>
	//  137  259:invokevirtual   #411 <Method StringBuilder StringBuilder.append(int)>
	//  138  262:pop             
		stringbuilder.append(", complete: ");
	//  139  263:aload_1         
	//  140  264:ldc2            #439 <String ", complete: ">
	//  141  267:invokevirtual   #406 <Method StringBuilder StringBuilder.append(String)>
	//  142  270:pop             
		stringbuilder.append(complete);
	//  143  271:aload_1         
	//  144  272:aload_0         
	//  145  273:getfield        #180 <Field int complete>
	//  146  276:invokevirtual   #411 <Method StringBuilder StringBuilder.append(int)>
	//  147  279:pop             
		stringbuilder.append(", sqft: ");
	//  148  280:aload_1         
	//  149  281:ldc2            #441 <String ", sqft: ">
	//  150  284:invokevirtual   #406 <Method StringBuilder StringBuilder.append(String)>
	//  151  287:pop             
		stringbuilder.append(sqft);
	//  152  288:aload_1         
	//  153  289:aload_0         
	//  154  290:getfield        #182 <Field int sqft>
	//  155  293:invokevirtual   #411 <Method StringBuilder StringBuilder.append(int)>
	//  156  296:pop             
		stringbuilder.append(", runM: ");
	//  157  297:aload_1         
	//  158  298:ldc2            #443 <String ", runM: ">
	//  159  301:invokevirtual   #406 <Method StringBuilder StringBuilder.append(String)>
	//  160  304:pop             
		stringbuilder.append(runM);
	//  161  305:aload_1         
	//  162  306:aload_0         
	//  163  307:getfield        #184 <Field int runM>
	//  164  310:invokevirtual   #411 <Method StringBuilder StringBuilder.append(int)>
	//  165  313:pop             
		stringbuilder.append(", commandType: ");
	//  166  314:aload_1         
	//  167  315:ldc2            #445 <String ", commandType: ">
	//  168  318:invokevirtual   #406 <Method StringBuilder StringBuilder.append(String)>
	//  169  321:pop             
		stringbuilder.append(commandType);
	//  170  322:aload_1         
	//  171  323:aload_0         
	//  172  324:getfield        #186 <Field String commandType>
	//  173  327:invokevirtual   #406 <Method StringBuilder StringBuilder.append(String)>
	//  174  330:pop             
		return stringbuilder.toString();
	//  175  331:aload_1         
	//  176  332:invokevirtual   #447 <Method String StringBuilder.toString()>
	//  177  335:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(date);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #168 <Field String date>
	//    3    5:invokevirtual   #452 <Method void Parcel.writeString(String)>
		parcel.writeInt(nMssn);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #170 <Field int nMssn>
	//    7   13:invokevirtual   #456 <Method void Parcel.writeInt(int)>
		parcel.writeString(mMapId);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #172 <Field String mMapId>
	//   11   21:invokevirtual   #452 <Method void Parcel.writeString(String)>
		parcel.writeString(done);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #174 <Field String done>
	//   15   29:invokevirtual   #452 <Method void Parcel.writeString(String)>
		parcel.writeInt(flags);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #200 <Field int flags>
	//   19   37:invokevirtual   #456 <Method void Parcel.writeInt(int)>
		parcel.writeInt(chrgM);
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #202 <Field int chrgM>
	//   23   45:invokevirtual   #456 <Method void Parcel.writeInt(int)>
		parcel.writeInt(pauseM);
	//   24   48:aload_1         
	//   25   49:aload_0         
	//   26   50:getfield        #204 <Field int pauseM>
	//   27   53:invokevirtual   #456 <Method void Parcel.writeInt(int)>
		parcel.writeInt(doneM);
	//   28   56:aload_1         
	//   29   57:aload_0         
	//   30   58:getfield        #206 <Field int doneM>
	//   31   61:invokevirtual   #456 <Method void Parcel.writeInt(int)>
		parcel.writeInt(dirt);
	//   32   64:aload_1         
	//   33   65:aload_0         
	//   34   66:getfield        #208 <Field int dirt>
	//   35   69:invokevirtual   #456 <Method void Parcel.writeInt(int)>
		parcel.writeInt(chrgs);
	//   36   72:aload_1         
	//   37   73:aload_0         
	//   38   74:getfield        #210 <Field int chrgs>
	//   39   77:invokevirtual   #456 <Method void Parcel.writeInt(int)>
		parcel.writeInt(saves);
	//   40   80:aload_1         
	//   41   81:aload_0         
	//   42   82:getfield        #212 <Field int saves>
	//   43   85:invokevirtual   #456 <Method void Parcel.writeInt(int)>
		parcel.writeInt(evacs);
	//   44   88:aload_1         
	//   45   89:aload_0         
	//   46   90:getfield        #214 <Field int evacs>
	//   47   93:invokevirtual   #456 <Method void Parcel.writeInt(int)>
		parcel.writeInt(pauseId);
	//   48   96:aload_1         
	//   49   97:aload_0         
	//   50   98:getfield        #216 <Field int pauseId>
	//   51  101:invokevirtual   #456 <Method void Parcel.writeInt(int)>
		parcel.writeInt(cleanMode);
	//   52  104:aload_1         
	//   53  105:aload_0         
	//   54  106:getfield        #176 <Field int cleanMode>
	//   55  109:invokevirtual   #456 <Method void Parcel.writeInt(int)>
		parcel.writeInt(batteryType);
	//   56  112:aload_1         
	//   57  113:aload_0         
	//   58  114:getfield        #178 <Field int batteryType>
	//   59  117:invokevirtual   #456 <Method void Parcel.writeInt(int)>
		parcel.writeInt(complete);
	//   60  120:aload_1         
	//   61  121:aload_0         
	//   62  122:getfield        #180 <Field int complete>
	//   63  125:invokevirtual   #456 <Method void Parcel.writeInt(int)>
		parcel.writeInt(sqft);
	//   64  128:aload_1         
	//   65  129:aload_0         
	//   66  130:getfield        #182 <Field int sqft>
	//   67  133:invokevirtual   #456 <Method void Parcel.writeInt(int)>
		parcel.writeInt(runM);
	//   68  136:aload_1         
	//   69  137:aload_0         
	//   70  138:getfield        #184 <Field int runM>
	//   71  141:invokevirtual   #456 <Method void Parcel.writeInt(int)>
		parcel.writeString(commandType);
	//   72  144:aload_1         
	//   73  145:aload_0         
	//   74  146:getfield        #186 <Field String commandType>
	//   75  149:invokevirtual   #452 <Method void Parcel.writeString(String)>
		parcel.writeInt(startTime);
	//   76  152:aload_1         
	//   77  153:aload_0         
	//   78  154:getfield        #218 <Field int startTime>
	//   79  157:invokevirtual   #456 <Method void Parcel.writeInt(int)>
		parcel.writeInt(timeStamp);
	//   80  160:aload_1         
	//   81  161:aload_0         
	//   82  162:getfield        #220 <Field int timeStamp>
	//   83  165:invokevirtual   #456 <Method void Parcel.writeInt(int)>
		parcel.writeInt(missionDurationInMinutes);
	//   84  168:aload_1         
	//   85  169:aload_0         
	//   86  170:getfield        #222 <Field int missionDurationInMinutes>
	//   87  173:invokevirtual   #456 <Method void Parcel.writeInt(int)>
	//   88  176:return          
	}

	private static final transient String COMPLETION_STATUS_BUSY = "busy";
	private static final transient String COMPLETION_STATUS_CANCELED = "cncl";
	private static final transient String COMPLETION_STATUS_CLOCK_ERROR = "schErr";
	private static final transient String COMPLETION_STATUS_COMPLETED = "ok";
	private static final transient String COMPLETION_STATUS_EMPTY = "empty";
	private static final transient String COMPLETION_STATUS_FULL = "full";
	private static final transient String COMPLETION_STATUS_INCOMPLETE = "inc";
	private static final transient String COMPLETION_STATUS_LOW_BATTERY = "bat";
	private static final transient String COMPLETION_STATUS_NONE = "none";
	private static final transient String COMPLETION_STATUS_STUCK = "stuck";
	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public MissionHistoryItem createFromParcel(Parcel parcel)
		{
			return new MissionHistoryItem(parcel);
		//    0    0:new             #9   <Class MissionHistoryItem>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void MissionHistoryItem(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method MissionHistoryItem createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public MissionHistoryItem[] newArray(int i)
		{
			return new MissionHistoryItem[i];
		//    0    0:iload_1         
		//    1    1:anewarray       MissionHistoryItem[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method MissionHistoryItem[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private static final float ROBOT_CLEANING_MOUTH_WIDTH = 0.561F;
	private static transient Map mCompletionStatusMap;
	private static transient Map mCompletionStatusMapReversed;
	private int batteryType;
	private int chrgM;
	private int chrgs;
	private int cleanMode;
	private String commandType;
	private int complete;
	private String date;
	private int dirt;
	private String done;
	private int doneM;
	private int evacs;
	private int flags;
	private String mMapId;
	private int missionDurationInMinutes;
	private int nMssn;
	private int pauseId;
	private int pauseM;
	private int runM;
	private int saves;
	private int sqft;
	private int startTime;
	private int timeStamp;

	static 
	{
	//    0    0:new             #8   <Class MissionHistoryItem$1>
	//    1    3:dup             
	//    2    4:invokespecial   #80  <Method void MissionHistoryItem$1()>
	//    3    7:putstatic       #82  <Field android.os.Parcelable$Creator CREATOR>
		HashMap hashmap = new HashMap();
	//    4   10:new             #84  <Class HashMap>
	//    5   13:dup             
	//    6   14:invokespecial   #85  <Method void HashMap()>
	//    7   17:astore_0        
		((Map) (hashmap)).put(((Object) (RobotMissionHistoryCompletionStatus.Completed)), "ok");
	//    8   18:aload_0         
	//    9   19:getstatic       #91  <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Completed>
	//   10   22:ldc1            #23  <String "ok">
	//   11   24:invokeinterface #97  <Method Object Map.put(Object, Object)>
	//   12   29:pop             
		((Map) (hashmap)).put(((Object) (RobotMissionHistoryCompletionStatus.Full)), "full");
	//   13   30:aload_0         
	//   14   31:getstatic       #100 <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Full>
	//   15   34:ldc1            #29  <String "full">
	//   16   36:invokeinterface #97  <Method Object Map.put(Object, Object)>
	//   17   41:pop             
		((Map) (hashmap)).put(((Object) (RobotMissionHistoryCompletionStatus.Stuck)), "stuck");
	//   18   42:aload_0         
	//   19   43:getstatic       #103 <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Stuck>
	//   20   46:ldc1            #41  <String "stuck">
	//   21   48:invokeinterface #97  <Method Object Map.put(Object, Object)>
	//   22   53:pop             
		((Map) (hashmap)).put(((Object) (RobotMissionHistoryCompletionStatus.Canceled)), "cncl");
	//   23   54:aload_0         
	//   24   55:getstatic       #106 <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Canceled>
	//   25   58:ldc1            #17  <String "cncl">
	//   26   60:invokeinterface #97  <Method Object Map.put(Object, Object)>
	//   27   65:pop             
		((Map) (hashmap)).put(((Object) (RobotMissionHistoryCompletionStatus.LowBattery)), "bat");
	//   28   66:aload_0         
	//   29   67:getstatic       #109 <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.LowBattery>
	//   30   70:ldc1            #35  <String "bat">
	//   31   72:invokeinterface #97  <Method Object Map.put(Object, Object)>
	//   32   77:pop             
		((Map) (hashmap)).put(((Object) (RobotMissionHistoryCompletionStatus.ClockError)), "schErr");
	//   33   78:aload_0         
	//   34   79:getstatic       #112 <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.ClockError>
	//   35   82:ldc1            #20  <String "schErr">
	//   36   84:invokeinterface #97  <Method Object Map.put(Object, Object)>
	//   37   89:pop             
		((Map) (hashmap)).put(((Object) (RobotMissionHistoryCompletionStatus.Busy)), "busy");
	//   38   90:aload_0         
	//   39   91:getstatic       #115 <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Busy>
	//   40   94:ldc1            #14  <String "busy">
	//   41   96:invokeinterface #97  <Method Object Map.put(Object, Object)>
	//   42  101:pop             
		((Map) (hashmap)).put(((Object) (RobotMissionHistoryCompletionStatus.None)), "none");
	//   43  102:aload_0         
	//   44  103:getstatic       #118 <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.None>
	//   45  106:ldc1            #38  <String "none">
	//   46  108:invokeinterface #97  <Method Object Map.put(Object, Object)>
	//   47  113:pop             
		((Map) (hashmap)).put(((Object) (RobotMissionHistoryCompletionStatus.Incomplete)), "inc");
	//   48  114:aload_0         
	//   49  115:getstatic       #121 <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Incomplete>
	//   50  118:ldc1            #32  <String "inc">
	//   51  120:invokeinterface #97  <Method Object Map.put(Object, Object)>
	//   52  125:pop             
		((Map) (hashmap)).put(((Object) (RobotMissionHistoryCompletionStatus.Empty)), "empty");
	//   53  126:aload_0         
	//   54  127:getstatic       #124 <Field RobotMissionHistoryCompletionStatus RobotMissionHistoryCompletionStatus.Empty>
	//   55  130:ldc1            #26  <String "empty">
	//   56  132:invokeinterface #97  <Method Object Map.put(Object, Object)>
	//   57  137:pop             
		mCompletionStatusMap = Collections.unmodifiableMap(((Map) (hashmap)));
	//   58  138:aload_0         
	//   59  139:invokestatic    #130 <Method Map Collections.unmodifiableMap(Map)>
	//   60  142:putstatic       #132 <Field Map mCompletionStatusMap>
		hashmap = new HashMap();
	//   61  145:new             #84  <Class HashMap>
	//   62  148:dup             
	//   63  149:invokespecial   #85  <Method void HashMap()>
	//   64  152:astore_0        
		java.util.Map.Entry entry;
		for(Iterator iterator = mCompletionStatusMap.entrySet().iterator(); iterator.hasNext(); ((Map) (hashmap)).put(entry.getValue(), entry.getKey()))
	//*  65  153:getstatic       #132 <Field Map mCompletionStatusMap>
	//*  66  156:invokeinterface #136 <Method Set Map.entrySet()>
	//*  67  161:invokeinterface #142 <Method Iterator Set.iterator()>
	//*  68  166:astore_1        
	//*  69  167:aload_1         
	//*  70  168:invokeinterface #148 <Method boolean Iterator.hasNext()>
	//*  71  173:ifeq            208
			entry = (java.util.Map.Entry)iterator.next();
	//   72  176:aload_1         
	//   73  177:invokeinterface #152 <Method Object Iterator.next()>
	//   74  182:checkcast       #154 <Class java.util.Map$Entry>
	//   75  185:astore_2        

	//   76  186:aload_0         
	//   77  187:aload_2         
	//   78  188:invokeinterface #157 <Method Object java.util.Map$Entry.getValue()>
	//   79  193:aload_2         
	//   80  194:invokeinterface #160 <Method Object java.util.Map$Entry.getKey()>
	//   81  199:invokeinterface #97  <Method Object Map.put(Object, Object)>
	//   82  204:pop             
	//*  83  205:goto            167
		mCompletionStatusMapReversed = Collections.unmodifiableMap(((Map) (hashmap)));
	//   84  208:aload_0         
	//   85  209:invokestatic    #130 <Method Map Collections.unmodifiableMap(Map)>
	//   86  212:putstatic       #162 <Field Map mCompletionStatusMapReversed>
	//*  87  215:return          
	}
}
