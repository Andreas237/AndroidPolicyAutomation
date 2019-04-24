// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.irobot.core.*;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import java.util.*;

// Referenced classes of package com.irobot.home.fragments:
//			j, u, bm, s, 
//			e

public class bg extends com.irobot.home.fragments.j
{
	private class a extends SettingsUIServiceDataCallback
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
			o.e(com.irobot.home.fragments.bg.a(a), "Service data was null.");
		//    4    6:aload_0         
		//    5    7:getfield        #12  <Field bg a>
		//    6   10:invokestatic    #24  <Method String com.irobot.home.fragments.bg.a(bg)>
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
			String s1 = com.irobot.home.fragments.bg.a(a);
		//   17   30:aload_0         
		//   18   31:getfield        #12  <Field bg a>
		//   19   34:invokestatic    #24  <Method String com.irobot.home.fragments.bg.a(bg)>
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
			o.a(s1, stringbuilder.toString());
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
			static class _cls1
			{

				static final int a[];

				static 
				{
					a = new int[SettingsUIState.values().length];
				//    0    0:invokestatic    #18  <Method SettingsUIState[] SettingsUIState.values()>
				//    1    3:arraylength     
				//    2    4:newarray        int[]
				//    3    6:putstatic       #20  <Field int[] a>
					try
					{
						a[SettingsUIState.VacuumingPresetsHeader.ordinal()] = 1;
				//    4    9:getstatic       #20  <Field int[] a>
				//    5   12:getstatic       #24  <Field SettingsUIState SettingsUIState.VacuumingPresetsHeader>
				//    6   15:invokevirtual   #28  <Method int SettingsUIState.ordinal()>
				//    7   18:iconst_1        
				//    8   19:iastore         
					}
				//*   9   20:getstatic       #20  <Field int[] a>
				//*  10   23:getstatic       #31  <Field SettingsUIState SettingsUIState.CustomCleanOptions>
				//*  11   26:invokevirtual   #28  <Method int SettingsUIState.ordinal()>
				//*  12   29:iconst_2        
				//*  13   30:iastore         
				//*  14   31:getstatic       #20  <Field int[] a>
				//*  15   34:getstatic       #34  <Field SettingsUIState SettingsUIState.CleaningPresets>
				//*  16   37:invokevirtual   #28  <Method int SettingsUIState.ordinal()>
				//*  17   40:iconst_3        
				//*  18   41:iastore         
				//*  19   42:getstatic       #20  <Field int[] a>
				//*  20   45:getstatic       #37  <Field SettingsUIState SettingsUIState.MultiPass>
				//*  21   48:invokevirtual   #28  <Method int SettingsUIState.ordinal()>
				//*  22   51:iconst_4        
				//*  23   52:iastore         
				//*  24   53:getstatic       #20  <Field int[] a>
				//*  25   56:getstatic       #40  <Field SettingsUIState SettingsUIState.CarpetBoost>
				//*  26   59:invokevirtual   #28  <Method int SettingsUIState.ordinal()>
				//*  27   62:iconst_5        
				//*  28   63:iastore         
				//*  29   64:getstatic       #20  <Field int[] a>
				//*  30   67:getstatic       #43  <Field SettingsUIState SettingsUIState.EdgeClean>
				//*  31   70:invokevirtual   #28  <Method int SettingsUIState.ordinal()>
				//*  32   73:bipush          6
				//*  33   75:iastore         
				//*  34   76:getstatic       #20  <Field int[] a>
				//*  35   79:getstatic       #46  <Field SettingsUIState SettingsUIState.RestoreDefaults>
				//*  36   82:invokevirtual   #28  <Method int SettingsUIState.ordinal()>
				//*  37   85:bipush          7
				//*  38   87:iastore         
				//*  39   88:getstatic       #20  <Field int[] a>
				//*  40   91:getstatic       #49  <Field SettingsUIState SettingsUIState.MoppingPreferencesHeader>
				//*  41   94:invokevirtual   #28  <Method int SettingsUIState.ordinal()>
				//*  42   97:bipush          8
				//*  43   99:iastore         
				//*  44  100:getstatic       #20  <Field int[] a>
				//*  45  103:getstatic       #52  <Field SettingsUIState SettingsUIState.PadWetness>
				//*  46  106:invokevirtual   #28  <Method int SettingsUIState.ordinal()>
				//*  47  109:bipush          9
				//*  48  111:iastore         
				//*  49  112:getstatic       #20  <Field int[] a>
				//*  50  115:getstatic       #55  <Field SettingsUIState SettingsUIState.RankOverlap>
				//*  51  118:invokevirtual   #28  <Method int SettingsUIState.ordinal()>
				//*  52  121:bipush          10
				//*  53  123:iastore         
				//*  54  124:return          
					catch(NoSuchFieldError nosuchfielderror) { }
				//   55  125:astore_0        
					try
					{
						a[SettingsUIState.CustomCleanOptions.ordinal()] = 2;
					}
				//*  56  126:goto            20
					catch(NoSuchFieldError nosuchfielderror1) { }
				//   57  129:astore_0        
					try
					{
						a[SettingsUIState.CleaningPresets.ordinal()] = 3;
					}
				//*  58  130:goto            31
					catch(NoSuchFieldError nosuchfielderror2) { }
				//   59  133:astore_0        
					try
					{
						a[SettingsUIState.MultiPass.ordinal()] = 4;
					}
				//*  60  134:goto            42
					catch(NoSuchFieldError nosuchfielderror3) { }
				//   61  137:astore_0        
					try
					{
						a[SettingsUIState.CarpetBoost.ordinal()] = 5;
					}
				//*  62  138:goto            53
					catch(NoSuchFieldError nosuchfielderror4) { }
				//   63  141:astore_0        
					try
					{
						a[SettingsUIState.EdgeClean.ordinal()] = 6;
					}
				//*  64  142:goto            64
					catch(NoSuchFieldError nosuchfielderror5) { }
				//   65  145:astore_0        
					try
					{
						a[SettingsUIState.RestoreDefaults.ordinal()] = 7;
					}
				//*  66  146:goto            76
					catch(NoSuchFieldError nosuchfielderror6) { }
				//   67  149:astore_0        
					try
					{
						a[SettingsUIState.MoppingPreferencesHeader.ordinal()] = 8;
					}
				//*  68  150:goto            88
					catch(NoSuchFieldError nosuchfielderror7) { }
				//   69  153:astore_0        
					try
					{
						a[SettingsUIState.PadWetness.ordinal()] = 9;
					}
				//*  70  154:goto            100
					catch(NoSuchFieldError nosuchfielderror8) { }
				//   71  157:astore_0        
					try
					{
						a[SettingsUIState.RankOverlap.ordinal()] = 10;
					}
				//*  72  158:goto            112
					catch(NoSuchFieldError nosuchfielderror9) { }
				//   73  161:astore_0        
				//*  74  162:return          
				}
			}

			com.irobot.home.fragments._cls1.a[((SettingsUIState) (obj1)).ordinal()];
		//   47   98:getstatic       #79  <Field int[] com.irobot.home.fragments.bg$1.a>
		//   48  101:aload           4
		//   49  103:invokevirtual   #83  <Method int SettingsUIState.ordinal()>
		//   50  106:iaload          
			JVM INSTR tableswitch 1 10: default 427
		//		               1 78
		//		               2 358
		//		               3 328
		//		               4 286
		//		               5 258
		//		               6 238
		//		               7 225
		//		               8 78
		//		               9 197
		//		               10 169;
		//   51  107:tableswitch     1 10: default 427
		//		               1 78
		//		               2 358
		//		               3 328
		//		               4 286
		//		               5 258
		//		               6 238
		//		               7 225
		//		               8 78
		//		               9 197
		//		               10 169
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
		//   66  191:invokevirtual   #108 <Method void com.irobot.home.fragments.e.a(RobotRankOverlap)>
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
		//   78  219:invokevirtual   #119 <Method void com.irobot.home.fragments.e.a(RobotPadWetnessLevel)>
			  goto _L7
		//*  79  222:goto            78
_L13:
			bg.b(a).a();
		//   80  225:aload_0         
		//   81  226:getfield        #12  <Field bg a>
		//   82  229:invokestatic    #103 <Method e bg.b(bg)>
		//   83  232:invokevirtual   #121 <Method void com.irobot.home.fragments.e.a()>
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
		//  103  280:invokevirtual   #142 <Method void com.irobot.home.fragments.e.a(CarpetBoostMode)>
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
		//  115  308:invokevirtual   #153 <Method void com.irobot.home.fragments.e.a(MultiPassMode)>
			bg.b(a).a(settingsuiservicedata.getMultiPassModes());
		//  116  311:aload_0         
		//  117  312:getfield        #12  <Field bg a>
		//  118  315:invokestatic    #103 <Method e bg.b(bg)>
		//  119  318:aload_1         
		//  120  319:invokevirtual   #156 <Method ArrayList SettingsUIServiceData.getMultiPassModes()>
		//  121  322:invokevirtual   #159 <Method void com.irobot.home.fragments.e.a(ArrayList)>
			  goto _L7
		//* 122  325:goto            78
_L9:
			int k = settingsuiservicedata.getIntegerSetting(SettingType.CleaningPresets);
		//  123  328:aload_1         
		//  124  329:getstatic       #162 <Field SettingType SettingType.CleaningPresets>
		//  125  332:invokevirtual   #99  <Method int SettingsUIServiceData.getIntegerSetting(SettingType)>
		//  126  335:istore_2        
			obj1 = ((Object) (CleanPresetType.values()[k]));
		//  127  336:invokestatic    #167 <Method CleanPresetType[] CleanPresetType.values()>
		//  128  339:iload_2         
		//  129  340:aaload          
		//  130  341:astore          4
			bg.b(a).a(((CleanPresetType) (obj1)));
		//  131  343:aload_0         
		//  132  344:getfield        #12  <Field bg a>
		//  133  347:invokestatic    #103 <Method e bg.b(bg)>
		//  134  350:aload           4
		//  135  352:invokevirtual   #170 <Method void com.irobot.home.fragments.e.a(CleanPresetType)>
			  goto _L7
		//* 136  355:goto            78
_L8:
			bg.b(a).a(settingsuiservicedata.getCustomPresetsIsVisibile());
		//  137  358:aload_0         
		//  138  359:getfield        #12  <Field bg a>
		//  139  362:invokestatic    #103 <Method e bg.b(bg)>
		//  140  365:aload_1         
		//  141  366:invokevirtual   #173 <Method boolean SettingsUIServiceData.getCustomPresetsIsVisibile()>
		//  142  369:invokevirtual   #175 <Method void com.irobot.home.fragments.e.a(boolean)>
			  goto _L7
		//* 143  372:goto            78
_L16:
			obj2 = ((Object) (com.irobot.home.fragments.bg.a(((bg) (obj2)))));
		//  144  375:aload           5
		//  145  377:invokestatic    #24  <Method String com.irobot.home.fragments.bg.a(bg)>
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

		private a()
		{
			a = bg.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field bg a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void SettingsUIServiceDataCallback()>
		//    5    9:return          
		}

	}


	public bg()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void com.irobot.home.fragments.j()>
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class bg>
	//    4    7:invokevirtual   #32  <Method String Class.getSimpleName()>
	//    5   10:putfield        #34  <Field String d>
		b = false;
	//    6   13:aload_0         
	//    7   14:iconst_0        
	//    8   15:putfield        #36  <Field boolean b>
	//    9   18:aload_0         
	//   10   19:new             #8   <Class bg$a>
	//   11   22:dup             
	//   12   23:aload_0         
	//   13   24:aconst_null     
	//   14   25:invokespecial   #39  <Method void bg$a(bg, bg$1)>
	//   15   28:putfield        #41  <Field bg$a e>
	//   16   31:return          
	}

	static String a(bg bg1)
	{
		return bg1.d;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field String d>
	//    2    4:areturn         
	}

	static e b(bg bg1)
	{
		return bg1.i;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field e i>
	//    2    4:areturn         
	}

	private void c()
	{
		FragmentTransaction fragmenttransaction = getChildFragmentManager().beginTransaction();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #50  <Method FragmentManager getChildFragmentManager()>
	//    2    4:invokevirtual   #56  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//    3    7:astore_2        
		Object obj;
		if(c != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #58  <Field HashMap c>
	//*   6   12:ifnull          43
		{
			obj = ((Object) (com.irobot.home.fragments.u.a(a, f, c, b)));
	//    7   15:aload_0         
	//    8   16:getfield        #60  <Field String a>
	//    9   19:aload_0         
	//   10   20:getfield        #62  <Field SettingsSubsystem f>
	//   11   23:aload_0         
	//   12   24:getfield        #58  <Field HashMap c>
	//   13   27:aload_0         
	//   14   28:getfield        #36  <Field boolean b>
	//   15   31:invokestatic    #67  <Method u com.irobot.home.fragments.u.a(String, SettingsSubsystem, HashMap, boolean)>
	//   16   34:astore_1        
		} else
	//*  17   35:aload_0         
	//*  18   36:aload_1         
	//*  19   37:putfield        #46  <Field e i>
	//*  20   40:goto            119
		{
			obj = ((Object) (j.a(a).a().getSku()));
	//   21   43:aload_0         
	//   22   44:getfield        #60  <Field String a>
	//   23   47:invokestatic    #72  <Method a j.a(String)>
	//   24   50:invokevirtual   #77  <Method AssetInfo a.a()>
	//   25   53:invokevirtual   #82  <Method String AssetInfo.getSku()>
	//   26   56:astore_1        
			if(SkuUtils.isSkuOfType(SkuType.SanMarino, ((String) (obj))))
	//*  27   57:getstatic       #88  <Field SkuType SkuType.SanMarino>
	//*  28   60:aload_1         
	//*  29   61:invokestatic    #94  <Method boolean SkuUtils.isSkuOfType(SkuType, String)>
	//*  30   64:ifeq            82
				obj = ((Object) (com.irobot.home.fragments.bm.a(a, f)));
	//   31   67:aload_0         
	//   32   68:getfield        #60  <Field String a>
	//   33   71:aload_0         
	//   34   72:getfield        #62  <Field SettingsSubsystem f>
	//   35   75:invokestatic    #99  <Method bm com.irobot.home.fragments.bm.a(String, SettingsSubsystem)>
	//   36   78:astore_1        
			else
	//*  37   79:goto            35
			if(b)
	//*  38   82:aload_0         
	//*  39   83:getfield        #36  <Field boolean b>
	//*  40   86:ifeq            104
				obj = ((Object) (com.irobot.home.fragments.u.a(a, f)));
	//   41   89:aload_0         
	//   42   90:getfield        #60  <Field String a>
	//   43   93:aload_0         
	//   44   94:getfield        #62  <Field SettingsSubsystem f>
	//   45   97:invokestatic    #102 <Method u com.irobot.home.fragments.u.a(String, SettingsSubsystem)>
	//   46  100:astore_1        
			else
	//*  47  101:goto            35
				obj = ((Object) (com.irobot.home.fragments.s.a(a, f)));
	//   48  104:aload_0         
	//   49  105:getfield        #60  <Field String a>
	//   50  108:aload_0         
	//   51  109:getfield        #62  <Field SettingsSubsystem f>
	//   52  112:invokestatic    #107 <Method s com.irobot.home.fragments.s.a(String, SettingsSubsystem)>
	//   53  115:astore_1        
		}
		i = ((e) (obj));
	//*  54  116:goto            35
		fragmenttransaction.add(0x7f0901a1, ((android.support.v4.app.Fragment) (i)));
	//   55  119:aload_2         
	//   56  120:ldc1            #108 <Int 0x7f0901a1>
	//   57  122:aload_0         
	//   58  123:getfield        #46  <Field e i>
	//   59  126:invokevirtual   #114 <Method FragmentTransaction FragmentTransaction.add(int, android.support.v4.app.Fragment)>
	//   60  129:pop             
		fragmenttransaction.commit();
	//   61  130:aload_2         
	//   62  131:invokevirtual   #118 <Method int FragmentTransaction.commit()>
	//   63  134:pop             
	//   64  135:return          
	}

	public void a()
	{
		AssetInfo assetinfo = j.a(a).a();
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field String a>
	//    2    4:invokestatic    #72  <Method a j.a(String)>
	//    3    7:invokevirtual   #77  <Method AssetInfo a.a()>
	//    4   10:astore_1        
		f = Assembler.getInstance().getSettingsSubsystem(assetinfo.getAssetId());
	//    5   11:aload_0         
	//    6   12:invokestatic    #124 <Method Assembler Assembler.getInstance()>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #128 <Method com.irobot.core.AssetId AssetInfo.getAssetId()>
	//    9   19:invokevirtual   #132 <Method SettingsSubsystem Assembler.getSettingsSubsystem(com.irobot.core.AssetId)>
	//   10   22:putfield        #62  <Field SettingsSubsystem f>
		c();
	//   11   25:aload_0         
	//   12   26:invokespecial   #134 <Method void c()>
	//   13   29:return          
	}

	public HashMap b()
	{
		if(i == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field e i>
	//*   2    4:ifnonnull       12
			return c;
	//    3    7:aload_0         
	//    4    8:getfield        #58  <Field HashMap c>
	//    5   11:areturn         
		else
			return ((u)i).d();
	//    6   12:aload_0         
	//    7   13:getfield        #46  <Field e i>
	//    8   16:checkcast       #64  <Class u>
	//    9   19:invokevirtual   #137 <Method HashMap u.d()>
	//   10   22:areturn         
	}

	public void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #142 <Method void j.onStart()>
		f.registerUISubscriber(((SettingsUIServiceDataCallback) (e)));
	//    2    4:aload_0         
	//    3    5:getfield        #62  <Field SettingsSubsystem f>
	//    4    8:aload_0         
	//    5    9:getfield        #41  <Field bg$a e>
	//    6   12:invokevirtual   #148 <Method boolean SettingsSubsystem.registerUISubscriber(SettingsUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	public void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #151 <Method void j.onStop()>
		f.unregisterSubscriber(((SettingsUIServiceDataCallback) (e)));
	//    2    4:aload_0         
	//    3    5:getfield        #62  <Field SettingsSubsystem f>
	//    4    8:aload_0         
	//    5    9:getfield        #41  <Field bg$a e>
	//    6   12:invokevirtual   #154 <Method boolean SettingsSubsystem.unregisterSubscriber(SettingsUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	String a;
	boolean b;
	protected volatile HashMap c;
	private final String d = ((Class) (com/irobot/home/fragments/bg)).getSimpleName();
	private final a e = new a(((_cls1) (null)));
	private SettingsSubsystem f;
	private e i;
}
