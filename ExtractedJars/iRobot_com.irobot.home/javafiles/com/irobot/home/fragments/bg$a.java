// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home.fragments:
//			bg, e

private class bg$a extends SettingsUIServiceDataCallback
{

	public void onSettingsUIServiceDataChanged(SettingsUIServiceData settingsuiservicedata)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(settingsuiservicedata != null) goto _L2; else goto _L1
	//    2    2:aload_1         
	//    3    3:ifnonnull       25
_L1:
		o.e(bg.a(a), "Service data was null.");
	//    4    6:aload_0         
	//    5    7:getfield        #12  <Field bg a>
	//    6   10:invokestatic    #24  <Method String bg.a(bg)>
	//    7   13:ldc1            #26  <String "Service data was null.">
	//    8   15:invokestatic    #32  <Method void o.e(String, String)>
		this;
	//    9   18:aload_0         
		JVM INSTR monitorexit ;
	//   10   19:monitorexit     
		return;
	//   11   20:return          
		settingsuiservicedata;
	//   12   21:astore_1        
		  goto _L3
	//*  13   22:goto            423
_L2:
		Object obj;
		obj = ((Object) (settingsuiservicedata.getSettingsViewStateChangelist()));
	//   14   25:aload_1         
	//   15   26:invokevirtual   #38  <Method ArrayList SettingsUIServiceData.getSettingsViewStateChangelist()>
	//   16   29:astore_3        
		String s = bg.a(a);
	//   17   30:aload_0         
	//   18   31:getfield        #12  <Field bg a>
	//   19   34:invokestatic    #24  <Method String bg.a(bg)>
	//   20   37:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//   21   39:new             #40  <Class StringBuilder>
	//   22   42:dup             
	//   23   43:invokespecial   #41  <Method void StringBuilder()>
	//   24   46:astore          5
		stringbuilder.append("Settings view change list: ");
	//   25   48:aload           5
	//   26   50:ldc1            #43  <String "Settings view change list: ">
	//   27   52:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   28   55:pop             
		stringbuilder.append(obj);
	//   29   56:aload           5
	//   30   58:aload_3         
	//   31   59:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
	//   32   62:pop             
		o.a(s, stringbuilder.toString());
	//   33   63:aload           4
	//   34   65:aload           5
	//   35   67:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   36   70:invokestatic    #56  <Method void o.a(String, String)>
		obj = ((Object) (((ArrayList) (obj)).iterator()));
	//   37   73:aload_3         
	//   38   74:invokevirtual   #62  <Method Iterator ArrayList.iterator()>
	//   39   77:astore_3        
_L7:
		if(!((Iterator) (obj)).hasNext()) goto _L5; else goto _L4
	//   40   78:aload_3         
	//   41   79:invokeinterface #68  <Method boolean Iterator.hasNext()>
	//   42   84:ifeq            420
_L4:
		Object obj1 = ((Object) ((SettingsUIState)((Iterator) (obj)).next()));
	//   43   87:aload_3         
	//   44   88:invokeinterface #72  <Method Object Iterator.next()>
	//   45   93:checkcast       #74  <Class SettingsUIState>
	//   46   96:astore          4
		bg$1.a[((SettingsUIState) (obj1)).ordinal()];
	//   47   98:getstatic       #79  <Field int[] bg$1.a>
	//   48  101:aload           4
	//   49  103:invokevirtual   #83  <Method int SettingsUIState.ordinal()>
	//   50  106:iaload          
		JVM INSTR tableswitch 1 10: default 427
	//	               1 78
	//	               2 358
	//	               3 328
	//	               4 286
	//	               5 258
	//	               6 238
	//	               7 225
	//	               8 78
	//	               9 197
	//	               10 169;
	//   51  107:tableswitch     1 10: default 427
	//	               1 78
	//	               2 358
	//	               3 328
	//	               4 286
	//	               5 258
	//	               6 238
	//	               7 225
	//	               8 78
	//	               9 197
	//	               10 169
		   goto _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L7 _L14 _L15
_L6:
		Object obj2 = ((Object) (a));
	//   52  160:aload_0         
	//   53  161:getfield        #12  <Field bg a>
	//   54  164:astore          5
		  goto _L16
	//*  55  166:goto            375
_L15:
		obj1 = ((Object) (RobotRankOverlap.values()[settingsuiservicedata.getIntegerSetting(SettingType.RobotRankOverlap)]));
	//   56  169:invokestatic    #89  <Method RobotRankOverlap[] RobotRankOverlap.values()>
	//   57  172:aload_1         
	//   58  173:getstatic       #95  <Field SettingType SettingType.RobotRankOverlap>
	//   59  176:invokevirtual   #99  <Method int SettingsUIServiceData.getIntegerSetting(SettingType)>
	//   60  179:aaload          
	//   61  180:astore          4
		bg.b(a).a(((RobotRankOverlap) (obj1)));
	//   62  182:aload_0         
	//   63  183:getfield        #12  <Field bg a>
	//   64  186:invokestatic    #103 <Method e bg.b(bg)>
	//   65  189:aload           4
	//   66  191:invokevirtual   #108 <Method void e.a(RobotRankOverlap)>
		  goto _L7
	//*  67  194:goto            78
_L14:
		obj1 = ((Object) (RobotPadWetnessLevel.values()[settingsuiservicedata.getIntegerSetting(SettingType.RobotPadWetness)]));
	//   68  197:invokestatic    #113 <Method RobotPadWetnessLevel[] RobotPadWetnessLevel.values()>
	//   69  200:aload_1         
	//   70  201:getstatic       #116 <Field SettingType SettingType.RobotPadWetness>
	//   71  204:invokevirtual   #99  <Method int SettingsUIServiceData.getIntegerSetting(SettingType)>
	//   72  207:aaload          
	//   73  208:astore          4
		bg.b(a).a(((RobotPadWetnessLevel) (obj1)));
	//   74  210:aload_0         
	//   75  211:getfield        #12  <Field bg a>
	//   76  214:invokestatic    #103 <Method e bg.b(bg)>
	//   77  217:aload           4
	//   78  219:invokevirtual   #119 <Method void e.a(RobotPadWetnessLevel)>
		  goto _L7
	//*  79  222:goto            78
_L13:
		bg.b(a).a();
	//   80  225:aload_0         
	//   81  226:getfield        #12  <Field bg a>
	//   82  229:invokestatic    #103 <Method e bg.b(bg)>
	//   83  232:invokevirtual   #121 <Method void e.a()>
		  goto _L7
	//*  84  235:goto            78
_L12:
		bg.b(a).b(settingsuiservicedata.getBooleanSetting(SettingType.EdgeClean));
	//   85  238:aload_0         
	//   86  239:getfield        #12  <Field bg a>
	//   87  242:invokestatic    #103 <Method e bg.b(bg)>
	//   88  245:aload_1         
	//   89  246:getstatic       #124 <Field SettingType SettingType.EdgeClean>
	//   90  249:invokevirtual   #128 <Method boolean SettingsUIServiceData.getBooleanSetting(SettingType)>
	//   91  252:invokevirtual   #131 <Method void e.b(boolean)>
		  goto _L7
	//*  92  255:goto            78
_L11:
		obj1 = ((Object) (CarpetBoostMode.values()[settingsuiservicedata.getIntegerSetting(SettingType.CarpetBoost)]));
	//   93  258:invokestatic    #136 <Method CarpetBoostMode[] CarpetBoostMode.values()>
	//   94  261:aload_1         
	//   95  262:getstatic       #139 <Field SettingType SettingType.CarpetBoost>
	//   96  265:invokevirtual   #99  <Method int SettingsUIServiceData.getIntegerSetting(SettingType)>
	//   97  268:aaload          
	//   98  269:astore          4
		bg.b(a).a(((CarpetBoostMode) (obj1)));
	//   99  271:aload_0         
	//  100  272:getfield        #12  <Field bg a>
	//  101  275:invokestatic    #103 <Method e bg.b(bg)>
	//  102  278:aload           4
	//  103  280:invokevirtual   #142 <Method void e.a(CarpetBoostMode)>
		  goto _L7
	//* 104  283:goto            78
_L10:
		obj1 = ((Object) (MultiPassMode.values()[settingsuiservicedata.getIntegerSetting(SettingType.MultiPass)]));
	//  105  286:invokestatic    #147 <Method MultiPassMode[] MultiPassMode.values()>
	//  106  289:aload_1         
	//  107  290:getstatic       #150 <Field SettingType SettingType.MultiPass>
	//  108  293:invokevirtual   #99  <Method int SettingsUIServiceData.getIntegerSetting(SettingType)>
	//  109  296:aaload          
	//  110  297:astore          4
		bg.b(a).a(((MultiPassMode) (obj1)));
	//  111  299:aload_0         
	//  112  300:getfield        #12  <Field bg a>
	//  113  303:invokestatic    #103 <Method e bg.b(bg)>
	//  114  306:aload           4
	//  115  308:invokevirtual   #153 <Method void e.a(MultiPassMode)>
		bg.b(a).a(settingsuiservicedata.getMultiPassModes());
	//  116  311:aload_0         
	//  117  312:getfield        #12  <Field bg a>
	//  118  315:invokestatic    #103 <Method e bg.b(bg)>
	//  119  318:aload_1         
	//  120  319:invokevirtual   #156 <Method ArrayList SettingsUIServiceData.getMultiPassModes()>
	//  121  322:invokevirtual   #159 <Method void e.a(ArrayList)>
		  goto _L7
	//* 122  325:goto            78
_L9:
		int i = settingsuiservicedata.getIntegerSetting(SettingType.CleaningPresets);
	//  123  328:aload_1         
	//  124  329:getstatic       #162 <Field SettingType SettingType.CleaningPresets>
	//  125  332:invokevirtual   #99  <Method int SettingsUIServiceData.getIntegerSetting(SettingType)>
	//  126  335:istore_2        
		obj1 = ((Object) (CleanPresetType.values()[i]));
	//  127  336:invokestatic    #167 <Method CleanPresetType[] CleanPresetType.values()>
	//  128  339:iload_2         
	//  129  340:aaload          
	//  130  341:astore          4
		bg.b(a).a(((CleanPresetType) (obj1)));
	//  131  343:aload_0         
	//  132  344:getfield        #12  <Field bg a>
	//  133  347:invokestatic    #103 <Method e bg.b(bg)>
	//  134  350:aload           4
	//  135  352:invokevirtual   #170 <Method void e.a(CleanPresetType)>
		  goto _L7
	//* 136  355:goto            78
_L8:
		bg.b(a).a(settingsuiservicedata.getCustomPresetsIsVisibile());
	//  137  358:aload_0         
	//  138  359:getfield        #12  <Field bg a>
	//  139  362:invokestatic    #103 <Method e bg.b(bg)>
	//  140  365:aload_1         
	//  141  366:invokevirtual   #173 <Method boolean SettingsUIServiceData.getCustomPresetsIsVisibile()>
	//  142  369:invokevirtual   #175 <Method void e.a(boolean)>
		  goto _L7
	//* 143  372:goto            78
_L16:
		obj2 = ((Object) (bg.a(((bg) (obj2)))));
	//  144  375:aload           5
	//  145  377:invokestatic    #24  <Method String bg.a(bg)>
	//  146  380:astore          5
		StringBuilder stringbuilder1 = new StringBuilder();
	//  147  382:new             #40  <Class StringBuilder>
	//  148  385:dup             
	//  149  386:invokespecial   #41  <Method void StringBuilder()>
	//  150  389:astore          6
		stringbuilder1.append("Received update to unused setting state: ");
	//  151  391:aload           6
	//  152  393:ldc1            #177 <String "Received update to unused setting state: ">
	//  153  395:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//  154  398:pop             
		stringbuilder1.append(obj1);
	//  155  399:aload           6
	//  156  401:aload           4
	//  157  403:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
	//  158  406:pop             
		o.a(((String) (obj2)), stringbuilder1.toString());
	//  159  407:aload           5
	//  160  409:aload           6
	//  161  411:invokevirtual   #54  <Method String StringBuilder.toString()>
	//  162  414:invokestatic    #56  <Method void o.a(String, String)>
		  goto _L7
	//* 163  417:goto            78
_L5:
		this;
	//  164  420:aload_0         
		JVM INSTR monitorexit ;
	//  165  421:monitorexit     
		return;
	//  166  422:return          
	//* 167  423:aload_0         
_L3:
		throw settingsuiservicedata;
	//  168  424:monitorexit     
	//  169  425:aload_1         
	//  170  426:athrow          
	//* 171  427:goto            160
	}

	final bg a;

	private bg$a(bg bg1)
	{
		a = bg1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field bg a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void SettingsUIServiceDataCallback()>
	//    5    9:return          
	}

	bg$a(bg bg1, bg$1 bg$1_1)
	{
		this(bg1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void bg$a(bg)>
	//    3    5:return          
	}
}
