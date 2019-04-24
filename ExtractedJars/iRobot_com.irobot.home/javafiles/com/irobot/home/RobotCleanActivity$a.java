// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.fragments.be;
import com.irobot.home.fragments.bk;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			RobotCleanActivity

protected class RobotCleanActivity$a extends MissionUIServiceDataCallback
	implements com.irobot.home.fragments.i.a
{

	public void a()
	{
		RobotCleanActivity.a(a, MissionStatusAction.Custom);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field RobotCleanActivity a>
	//    2    4:getstatic       #24  <Field MissionStatusAction MissionStatusAction.Custom>
	//    3    7:invokestatic    #27  <Method void RobotCleanActivity.a(RobotCleanActivity, MissionStatusAction)>
	//    4   10:return          
	}

	public void a(MissionStatusAction missionstatusaction)
	{
		RobotCleanActivity.a(a, missionstatusaction);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field RobotCleanActivity a>
	//    2    4:aload_1         
	//    3    5:invokestatic    #27  <Method void RobotCleanActivity.a(RobotCleanActivity, MissionStatusAction)>
	//    4    8:return          
	}

	public void onMissionUIServiceDataChanged(MissionUIServiceData missionuiservicedata)
	{
		if(missionuiservicedata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
		{
			o.e(RobotCleanActivity.N(), "null service data");
	//    2    4:invokestatic    #34  <Method String RobotCleanActivity.N()>
	//    3    7:ldc1            #36  <String "null service data">
	//    4    9:invokestatic    #42  <Method void o.e(String, String)>
			return;
	//    5   12:return          
		}
		if(!a.isFinishing())
	//*   6   13:aload_0         
	//*   7   14:getfield        #14  <Field RobotCleanActivity a>
	//*   8   17:invokevirtual   #46  <Method boolean RobotCleanActivity.isFinishing()>
	//*   9   20:ifne            551
		{
			if(a.isDestroyed())
	//*  10   23:aload_0         
	//*  11   24:getfield        #14  <Field RobotCleanActivity a>
	//*  12   27:invokevirtual   #49  <Method boolean RobotCleanActivity.isDestroyed()>
	//*  13   30:ifeq            34
				return;
	//   14   33:return          
			Object obj = ((Object) (missionuiservicedata.getMissionDataStates()));
	//   15   34:aload_1         
	//   16   35:invokevirtual   #55  <Method ArrayList MissionUIServiceData.getMissionDataStates()>
	//   17   38:astore          5
			String s = RobotCleanActivity.N();
	//   18   40:invokestatic    #34  <Method String RobotCleanActivity.N()>
	//   19   43:astore          6
			StringBuilder stringbuilder = new StringBuilder();
	//   20   45:new             #57  <Class StringBuilder>
	//   21   48:dup             
	//   22   49:invokespecial   #58  <Method void StringBuilder()>
	//   23   52:astore          7
			stringbuilder.append("Change list: ");
	//   24   54:aload           7
	//   25   56:ldc1            #60  <String "Change list: ">
	//   26   58:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   27   61:pop             
			stringbuilder.append(((ArrayList) (obj)).toString());
	//   28   62:aload           7
	//   29   64:aload           5
	//   30   66:invokevirtual   #69  <Method String ArrayList.toString()>
	//   31   69:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   32   72:pop             
			o.b(s, stringbuilder.toString());
	//   33   73:aload           6
	//   34   75:aload           7
	//   35   77:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   36   80:invokestatic    #73  <Method void o.b(String, String)>
			obj = ((Object) (((ArrayList) (obj)).iterator()));
	//   37   83:aload           5
	//   38   85:invokevirtual   #77  <Method Iterator ArrayList.iterator()>
	//   39   88:astore          5
			boolean flag = false;
	//   40   90:iconst_0        
	//   41   91:istore_2        
			boolean flag1 = false;
	//   42   92:iconst_0        
	//   43   93:istore_3        
			do
			{
				if(((Iterator) (obj)).hasNext())
	//*  44   94:aload           5
	//*  45   96:invokeinterface #82  <Method boolean Iterator.hasNext()>
	//*  46  101:ifeq            539
				{
					MissionDataState missiondatastate = (MissionDataState)((Iterator) (obj)).next();
	//   47  104:aload           5
	//   48  106:invokeinterface #86  <Method Object Iterator.next()>
	//   49  111:checkcast       #88  <Class MissionDataState>
	//   50  114:astore          6
					switch(RobotCleanActivity$4.a[missiondatastate.ordinal()])
	//*  51  116:getstatic       #93  <Field int[] RobotCleanActivity$4.a>
	//*  52  119:aload           6
	//*  53  121:invokevirtual   #97  <Method int MissionDataState.ordinal()>
	//*  54  124:iaload          
					{
	//*  55  125:tableswitch     1 11: default 184
	//	               1 485
	//	               2 463
	//	               3 424
	//	               4 391
	//	               5 358
	//	               6 341
	//	               7 324
	//	               8 225
	//	               9 208
	//	               10 94
	//	               11 187
	//*  56  184:goto            94
					case 11: // '\013'
						boolean flag2 = missionuiservicedata.getIsTraining();
	//   57  187:aload_1         
	//   58  188:invokevirtual   #100 <Method boolean MissionUIServiceData.getIsTraining()>
	//   59  191:istore          4
						RobotCleanActivity.c(a).b(flag2);
	//   60  193:aload_0         
	//   61  194:getfield        #14  <Field RobotCleanActivity a>
	//   62  197:invokestatic    #104 <Method bk RobotCleanActivity.c(RobotCleanActivity)>
	//   63  200:iload           4
	//   64  202:invokevirtual   #109 <Method void bk.b(boolean)>
						break;

	//*  65  205:goto            94
					case 9: // '\t'
						RobotCleanActivity.d(a).d(missionuiservicedata.getHelpContentId());
	//   66  208:aload_0         
	//   67  209:getfield        #14  <Field RobotCleanActivity a>
	//   68  212:invokestatic    #113 <Method be RobotCleanActivity.d(RobotCleanActivity)>
	//   69  215:aload_1         
	//   70  216:invokevirtual   #116 <Method String MissionUIServiceData.getHelpContentId()>
	//   71  219:invokevirtual   #121 <Method void be.d(String)>
						break;

	//*  72  222:goto            94
					case 8: // '\b'
						String s1 = missionuiservicedata.getStatusMessage();
	//   73  225:aload_1         
	//   74  226:invokevirtual   #124 <Method String MissionUIServiceData.getStatusMessage()>
	//   75  229:astore          6
						Object obj1 = ((Object) (missionuiservicedata.getStatusMessageArgs()));
	//   76  231:aload_1         
	//   77  232:invokevirtual   #127 <Method ArrayList MissionUIServiceData.getStatusMessageArgs()>
	//   78  235:astore          7
						s1 = j.a(((android.content.Context) (a)), s1, ((ArrayList) (obj1)));
	//   79  237:aload_0         
	//   80  238:getfield        #14  <Field RobotCleanActivity a>
	//   81  241:aload           6
	//   82  243:aload           7
	//   83  245:invokestatic    #132 <Method String j.a(android.content.Context, String, ArrayList)>
	//   84  248:astore          6
						obj1 = ((Object) (RobotCleanActivity.N()));
	//   85  250:invokestatic    #34  <Method String RobotCleanActivity.N()>
	//   86  253:astore          7
						StringBuilder stringbuilder1 = new StringBuilder();
	//   87  255:new             #57  <Class StringBuilder>
	//   88  258:dup             
	//   89  259:invokespecial   #58  <Method void StringBuilder()>
	//   90  262:astore          8
						stringbuilder1.append("Resolved status text: ");
	//   91  264:aload           8
	//   92  266:ldc1            #134 <String "Resolved status text: ">
	//   93  268:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   94  271:pop             
						stringbuilder1.append(s1);
	//   95  272:aload           8
	//   96  274:aload           6
	//   97  276:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   98  279:pop             
						o.b(((String) (obj1)), stringbuilder1.toString());
	//   99  280:aload           7
	//  100  282:aload           8
	//  101  284:invokevirtual   #70  <Method String StringBuilder.toString()>
	//  102  287:invokestatic    #73  <Method void o.b(String, String)>
						if(!missionuiservicedata.getIsStatusConnectionRelated())
	//* 103  290:aload_1         
	//* 104  291:invokevirtual   #137 <Method boolean MissionUIServiceData.getIsStatusConnectionRelated()>
	//* 105  294:ifne            309
							RobotCleanActivity.c(a).b(s1);
	//  106  297:aload_0         
	//  107  298:getfield        #14  <Field RobotCleanActivity a>
	//  108  301:invokestatic    #104 <Method bk RobotCleanActivity.c(RobotCleanActivity)>
	//  109  304:aload           6
	//  110  306:invokevirtual   #139 <Method void bk.b(String)>
						RobotCleanActivity.d(a).c(s1);
	//  111  309:aload_0         
	//  112  310:getfield        #14  <Field RobotCleanActivity a>
	//  113  313:invokestatic    #113 <Method be RobotCleanActivity.d(RobotCleanActivity)>
	//  114  316:aload           6
	//  115  318:invokevirtual   #141 <Method void be.c(String)>
						break;

	//* 116  321:goto            94
					case 7: // '\007'
						RobotCleanActivity.c(a).c(((int) (missionuiservicedata.getPauseResumeTime())));
	//  117  324:aload_0         
	//  118  325:getfield        #14  <Field RobotCleanActivity a>
	//  119  328:invokestatic    #104 <Method bk RobotCleanActivity.c(RobotCleanActivity)>
	//  120  331:aload_1         
	//  121  332:invokevirtual   #145 <Method short MissionUIServiceData.getPauseResumeTime()>
	//  122  335:invokevirtual   #148 <Method void bk.c(int)>
						break;

	//* 123  338:goto            94
					case 6: // '\006'
						RobotCleanActivity.c(a).b(((int) (missionuiservicedata.getPauseExpireTime())));
	//  124  341:aload_0         
	//  125  342:getfield        #14  <Field RobotCleanActivity a>
	//  126  345:invokestatic    #104 <Method bk RobotCleanActivity.c(RobotCleanActivity)>
	//  127  348:aload_1         
	//  128  349:invokevirtual   #151 <Method short MissionUIServiceData.getPauseExpireTime()>
	//  129  352:invokevirtual   #153 <Method void bk.b(int)>
						break;

	//* 130  355:goto            94
					case 5: // '\005'
						boolean flag3 = missionuiservicedata.getIsTankLow();
	//  131  358:aload_1         
	//  132  359:invokevirtual   #156 <Method boolean MissionUIServiceData.getIsTankLow()>
	//  133  362:istore          4
						RobotCleanActivity.c(a).c(flag3);
	//  134  364:aload_0         
	//  135  365:getfield        #14  <Field RobotCleanActivity a>
	//  136  368:invokestatic    #104 <Method bk RobotCleanActivity.c(RobotCleanActivity)>
	//  137  371:iload           4
	//  138  373:invokevirtual   #158 <Method void bk.c(boolean)>
						RobotCleanActivity.d(a).c(flag3);
	//  139  376:aload_0         
	//  140  377:getfield        #14  <Field RobotCleanActivity a>
	//  141  380:invokestatic    #113 <Method be RobotCleanActivity.d(RobotCleanActivity)>
	//  142  383:iload           4
	//  143  385:invokevirtual   #159 <Method void be.c(boolean)>
						break;

	//* 144  388:goto            94
					case 4: // '\004'
						boolean flag4 = missionuiservicedata.getIsBinfull();
	//  145  391:aload_1         
	//  146  392:invokevirtual   #162 <Method boolean MissionUIServiceData.getIsBinfull()>
	//  147  395:istore          4
						RobotCleanActivity.c(a).a(flag4);
	//  148  397:aload_0         
	//  149  398:getfield        #14  <Field RobotCleanActivity a>
	//  150  401:invokestatic    #104 <Method bk RobotCleanActivity.c(RobotCleanActivity)>
	//  151  404:iload           4
	//  152  406:invokevirtual   #164 <Method void bk.a(boolean)>
						RobotCleanActivity.d(a).a(flag4);
	//  153  409:aload_0         
	//  154  410:getfield        #14  <Field RobotCleanActivity a>
	//  155  413:invokestatic    #113 <Method be RobotCleanActivity.d(RobotCleanActivity)>
	//  156  416:iload           4
	//  157  418:invokevirtual   #165 <Method void be.a(boolean)>
						break;

	//* 158  421:goto            94
					case 3: // '\003'
						RobotCleanActivity.a(a, missionuiservicedata.getIsCharging());
	//  159  424:aload_0         
	//  160  425:getfield        #14  <Field RobotCleanActivity a>
	//  161  428:aload_1         
	//  162  429:invokevirtual   #168 <Method boolean MissionUIServiceData.getIsCharging()>
	//  163  432:invokestatic    #171 <Method boolean RobotCleanActivity.a(RobotCleanActivity, boolean)>
	//  164  435:pop             
						RobotCleanActivity.b(a);
	//  165  436:aload_0         
	//  166  437:getfield        #14  <Field RobotCleanActivity a>
	//  167  440:invokestatic    #173 <Method void RobotCleanActivity.b(RobotCleanActivity)>
						RobotCleanActivity.c(a).f(RobotCleanActivity.e(a));
	//  168  443:aload_0         
	//  169  444:getfield        #14  <Field RobotCleanActivity a>
	//  170  447:invokestatic    #104 <Method bk RobotCleanActivity.c(RobotCleanActivity)>
	//  171  450:aload_0         
	//  172  451:getfield        #14  <Field RobotCleanActivity a>
	//  173  454:invokestatic    #176 <Method boolean RobotCleanActivity.e(RobotCleanActivity)>
	//  174  457:invokevirtual   #179 <Method void bk.f(boolean)>
						break;

	//* 175  460:goto            94
					case 2: // '\002'
						RobotCleanActivity.a(a, ((int) (missionuiservicedata.getBatteryLevelPercentage())));
	//  176  463:aload_0         
	//  177  464:getfield        #14  <Field RobotCleanActivity a>
	//  178  467:aload_1         
	//  179  468:invokevirtual   #182 <Method short MissionUIServiceData.getBatteryLevelPercentage()>
	//  180  471:invokestatic    #185 <Method int RobotCleanActivity.a(RobotCleanActivity, int)>
	//  181  474:pop             
						RobotCleanActivity.b(a);
	//  182  475:aload_0         
	//  183  476:getfield        #14  <Field RobotCleanActivity a>
	//  184  479:invokestatic    #173 <Method void RobotCleanActivity.b(RobotCleanActivity)>
						break;

	//* 185  482:goto            94
					case 1: // '\001'
						com.irobot.core.ResolvedMissionStatus resolvedmissionstatus = missionuiservicedata.getResolvedMissionStatus();
	//  186  485:aload_1         
	//  187  486:invokevirtual   #189 <Method com.irobot.core.ResolvedMissionStatus MissionUIServiceData.getResolvedMissionStatus()>
	//  188  489:astore          6
						RobotCleanActivity.c(a).a(resolvedmissionstatus);
	//  189  491:aload_0         
	//  190  492:getfield        #14  <Field RobotCleanActivity a>
	//  191  495:invokestatic    #104 <Method bk RobotCleanActivity.c(RobotCleanActivity)>
	//  192  498:aload           6
	//  193  500:invokevirtual   #192 <Method void bk.a(com.irobot.core.ResolvedMissionStatus)>
						RobotCleanActivity.d(a).a(resolvedmissionstatus);
	//  194  503:aload_0         
	//  195  504:getfield        #14  <Field RobotCleanActivity a>
	//  196  507:invokestatic    #113 <Method be RobotCleanActivity.d(RobotCleanActivity)>
	//  197  510:aload           6
	//  198  512:invokevirtual   #193 <Method void be.a(com.irobot.core.ResolvedMissionStatus)>
						RobotCleanActivity.c(a).e(missionuiservicedata.isPaused());
	//  199  515:aload_0         
	//  200  516:getfield        #14  <Field RobotCleanActivity a>
	//  201  519:invokestatic    #104 <Method bk RobotCleanActivity.c(RobotCleanActivity)>
	//  202  522:aload_1         
	//  203  523:invokevirtual   #196 <Method boolean MissionUIServiceData.isPaused()>
	//  204  526:invokevirtual   #198 <Method void bk.e(boolean)>
						flag1 = missionuiservicedata.isPaused();
	//  205  529:aload_1         
	//  206  530:invokevirtual   #196 <Method boolean MissionUIServiceData.isPaused()>
	//  207  533:istore_3        
						flag = true;
	//  208  534:iconst_1        
	//  209  535:istore_2        
						break;
					}
					continue;
	//  210  536:goto            94
				}
				if(flag)
	//* 211  539:iload_2         
	//* 212  540:ifeq            551
					RobotCleanActivity.b(a, flag1);
	//  213  543:aload_0         
	//  214  544:getfield        #14  <Field RobotCleanActivity a>
	//  215  547:iload_3         
	//  216  548:invokestatic    #201 <Method void RobotCleanActivity.b(RobotCleanActivity, boolean)>
				break;
			} while(true);
		}
	//  217  551:return          
	}

	final RobotCleanActivity a;

	protected RobotCleanActivity$a(RobotCleanActivity robotcleanactivity)
	{
		a = robotcleanactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field RobotCleanActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void MissionUIServiceDataCallback()>
	//    5    9:return          
	}
}
