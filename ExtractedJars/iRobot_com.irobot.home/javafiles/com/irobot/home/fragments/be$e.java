// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.app.Activity;
import android.content.SharedPreferences;
import com.irobot.core.*;
import com.irobot.home.util.b;
import com.irobot.home.util.o;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.irobot.home.fragments:
//			be

private class be$e extends SettingsUIServiceDataCallback
{

	public void onSettingsUIServiceDataChanged(SettingsUIServiceData settingsuiservicedata)
	{
		if(settingsuiservicedata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			o.d("RobotCleanFragment", "Received null data.");
	//    2    4:ldc1            #24  <String "RobotCleanFragment">
	//    3    6:ldc1            #26  <String "Received null data.">
	//    4    8:invokestatic    #32  <Method void o.d(String, String)>
			return;
	//    5   11:return          
		}
		Object obj = ((Object) (settingsuiservicedata.getSettingsChangeList().iterator()));
	//    6   12:aload_1         
	//    7   13:invokevirtual   #38  <Method HashSet SettingsUIServiceData.getSettingsChangeList()>
	//    8   16:invokevirtual   #44  <Method Iterator HashSet.iterator()>
	//    9   19:astore          4
		do
		{
			if(((Iterator) (obj)).hasNext())
	//*  10   21:aload           4
	//*  11   23:invokeinterface #50  <Method boolean Iterator.hasNext()>
	//*  12   28:ifeq            143
			{
				SettingType settingtype = (SettingType)((Iterator) (obj)).next();
	//   13   31:aload           4
	//   14   33:invokeinterface #54  <Method Object Iterator.next()>
	//   15   38:checkcast       #56  <Class SettingType>
	//   16   41:astore          5
				switch(be$5.k[settingtype.ordinal()])
	//*  17   43:getstatic       #62  <Field int[] be$5.k>
	//*  18   46:aload           5
	//*  19   48:invokevirtual   #66  <Method int SettingType.ordinal()>
	//*  20   51:iaload          
				{
	//*  21   52:tableswitch     1 3: default 80
	//	               1 119
	//	               2 101
	//	               3 83
	//*  22   80:goto            21
				case 3: // '\003'
					be.d(a, settingsuiservicedata.getBooleanSetting(SettingType.PMapLearningAllowed));
	//   23   83:aload_0         
	//   24   84:getfield        #13  <Field be a>
	//   25   87:aload_1         
	//   26   88:getstatic       #70  <Field SettingType SettingType.PMapLearningAllowed>
	//   27   91:invokevirtual   #74  <Method boolean SettingsUIServiceData.getBooleanSetting(SettingType)>
	//   28   94:invokestatic    #77  <Method boolean be.d(be, boolean)>
	//   29   97:pop             
					break;

	//*  30   98:goto            21
				case 2: // '\002'
					be.c(a, settingsuiservicedata.getBooleanSetting(SettingType.MapUploadAllowed));
	//   31  101:aload_0         
	//   32  102:getfield        #13  <Field be a>
	//   33  105:aload_1         
	//   34  106:getstatic       #80  <Field SettingType SettingType.MapUploadAllowed>
	//   35  109:invokevirtual   #74  <Method boolean SettingsUIServiceData.getBooleanSetting(SettingType)>
	//   36  112:invokestatic    #83  <Method boolean be.c(be, boolean)>
	//   37  115:pop             
					break;

	//*  38  116:goto            21
				case 1: // '\001'
					int i = settingsuiservicedata.getIntegerSetting(SettingType.Schedule);
	//   39  119:aload_1         
	//   40  120:getstatic       #86  <Field SettingType SettingType.Schedule>
	//   41  123:invokevirtual   #90  <Method int SettingsUIServiceData.getIntegerSetting(SettingType)>
	//   42  126:istore_2        
					be.a(a, ScheduleTypeSupported.values()[i]);
	//   43  127:aload_0         
	//   44  128:getfield        #13  <Field be a>
	//   45  131:invokestatic    #96  <Method ScheduleTypeSupported[] ScheduleTypeSupported.values()>
	//   46  134:iload_2         
	//   47  135:aaload          
	//   48  136:invokestatic    #99  <Method ScheduleTypeSupported be.a(be, ScheduleTypeSupported)>
	//   49  139:pop             
					break;
				}
				continue;
	//   50  140:goto            21
			}
			settingsuiservicedata = ((SettingsUIServiceData) (settingsuiservicedata.getAvailableSettings()));
	//   51  143:aload_1         
	//   52  144:invokevirtual   #102 <Method HashSet SettingsUIServiceData.getAvailableSettings()>
	//   53  147:astore_1        
			obj = ((Object) (a));
	//   54  148:aload_0         
	//   55  149:getfield        #13  <Field be a>
	//   56  152:astore          4
			boolean flag;
			if(!((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.CleaningPreferenceAvailable))) && !((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.CleaningPresets))) && !((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.RobotPadWetness))) && !((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.RobotRankOverlap))))
	//*  57  154:aload_1         
	//*  58  155:getstatic       #105 <Field SettingType SettingType.CleaningPreferenceAvailable>
	//*  59  158:invokevirtual   #109 <Method boolean HashSet.contains(Object)>
	//*  60  161:ifne            202
	//*  61  164:aload_1         
	//*  62  165:getstatic       #112 <Field SettingType SettingType.CleaningPresets>
	//*  63  168:invokevirtual   #109 <Method boolean HashSet.contains(Object)>
	//*  64  171:ifne            202
	//*  65  174:aload_1         
	//*  66  175:getstatic       #115 <Field SettingType SettingType.RobotPadWetness>
	//*  67  178:invokevirtual   #109 <Method boolean HashSet.contains(Object)>
	//*  68  181:ifne            202
	//*  69  184:aload_1         
	//*  70  185:getstatic       #118 <Field SettingType SettingType.RobotRankOverlap>
	//*  71  188:invokevirtual   #109 <Method boolean HashSet.contains(Object)>
	//*  72  191:ifeq            197
	//*  73  194:goto            202
				flag = false;
	//   74  197:iconst_0        
	//   75  198:istore_3        
			else
	//*  76  199:goto            204
				flag = true;
	//   77  202:iconst_1        
	//   78  203:istore_3        
			be.e(((be) (obj)), flag);
	//   79  204:aload           4
	//   80  206:iload_3         
	//   81  207:invokestatic    #120 <Method boolean be.e(be, boolean)>
	//   82  210:pop             
			be.f(a);
	//   83  211:aload_0         
	//   84  212:getfield        #13  <Field be a>
	//   85  215:invokestatic    #123 <Method void be.f(be)>
			flag = a.getActivity().getSharedPreferences("DEVEL", 0).getBoolean("use_demo_map", false);
	//   86  218:aload_0         
	//   87  219:getfield        #13  <Field be a>
	//   88  222:invokevirtual   #127 <Method Activity be.getActivity()>
	//   89  225:ldc1            #129 <String "DEVEL">
	//   90  227:iconst_0        
	//   91  228:invokevirtual   #135 <Method SharedPreferences Activity.getSharedPreferences(String, int)>
	//   92  231:ldc1            #137 <String "use_demo_map">
	//   93  233:iconst_0        
	//   94  234:invokeinterface #143 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   95  239:istore_3        
			if(!((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.PersistentMaps))) && (!flag || !"release".equalsIgnoreCase("dev") && !"release".equalsIgnoreCase("debug")))
	//*  96  240:aload_1         
	//*  97  241:getstatic       #146 <Field SettingType SettingType.PersistentMaps>
	//*  98  244:invokevirtual   #109 <Method boolean HashSet.contains(Object)>
	//*  99  247:ifne            287
	//* 100  250:iload_3         
	//* 101  251:ifeq            277
	//* 102  254:ldc1            #148 <String "release">
	//* 103  256:ldc1            #150 <String "dev">
	//* 104  258:invokevirtual   #156 <Method boolean String.equalsIgnoreCase(String)>
	//* 105  261:ifne            287
	//* 106  264:ldc1            #148 <String "release">
	//* 107  266:ldc1            #158 <String "debug">
	//* 108  268:invokevirtual   #156 <Method boolean String.equalsIgnoreCase(String)>
	//* 109  271:ifeq            277
	//* 110  274:goto            287
				be.h(a);
	//  111  277:aload_0         
	//  112  278:getfield        #13  <Field be a>
	//  113  281:invokestatic    #161 <Method void be.h(be)>
			else
	//* 114  284:goto            294
				be.g(a);
	//  115  287:aload_0         
	//  116  288:getfield        #13  <Field be a>
	//  117  291:invokestatic    #164 <Method void be.g(be)>
			be.f(a, ((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.StaticMaps))));
	//  118  294:aload_0         
	//  119  295:getfield        #13  <Field be a>
	//  120  298:aload_1         
	//  121  299:getstatic       #167 <Field SettingType SettingType.StaticMaps>
	//  122  302:invokevirtual   #109 <Method boolean HashSet.contains(Object)>
	//  123  305:invokestatic    #169 <Method boolean be.f(be, boolean)>
	//  124  308:pop             
			be.g(a, ((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.CleaningPresets))));
	//  125  309:aload_0         
	//  126  310:getfield        #13  <Field be a>
	//  127  313:aload_1         
	//  128  314:getstatic       #112 <Field SettingType SettingType.CleaningPresets>
	//  129  317:invokevirtual   #109 <Method boolean HashSet.contains(Object)>
	//  130  320:invokestatic    #171 <Method boolean be.g(be, boolean)>
	//  131  323:pop             
			be.i(a).b(((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.PauseOnBinFull))) ^ true);
	//  132  324:aload_0         
	//  133  325:getfield        #13  <Field be a>
	//  134  328:invokestatic    #175 <Method b be.i(be)>
	//  135  331:aload_1         
	//  136  332:getstatic       #178 <Field SettingType SettingType.PauseOnBinFull>
	//  137  335:invokevirtual   #109 <Method boolean HashSet.contains(Object)>
	//  138  338:iconst_1        
	//  139  339:ixor            
	//  140  340:invokevirtual   #184 <Method void b.b(boolean)>
			break;
		} while(true);
	//  141  343:return          
	}

	final be a;

	private be$e(be be1)
	{
		a = be1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field be a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void SettingsUIServiceDataCallback()>
	//    5    9:return          
	}

	be$e(be be1, be$1 be$1)
	{
		this(be1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void be$e(be)>
	//    3    5:return          
	}
}
