// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			RobotSettingsPresenter

private class RobotSettingsPresenter$b extends SettingsUIServiceDataCallback
{

	public void onSettingsUIServiceDataChanged(SettingsUIServiceData settingsuiservicedata)
	{
		if(settingsuiservicedata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
		{
			o.d(RobotSettingsPresenter.c(), "Service data was null.");
	//    2    4:invokestatic    #26  <Method String RobotSettingsPresenter.c()>
	//    3    7:ldc1            #28  <String "Service data was null.">
	//    4    9:invokestatic    #34  <Method void o.d(String, String)>
			return;
	//    5   12:return          
		}
		Object obj = ((Object) (settingsuiservicedata.getSettingsChangeList().iterator()));
	//    6   13:aload_1         
	//    7   14:invokevirtual   #40  <Method HashSet SettingsUIServiceData.getSettingsChangeList()>
	//    8   17:invokevirtual   #46  <Method Iterator HashSet.iterator()>
	//    9   20:astore_3        
		do
		{
			if(((Iterator) (obj)).hasNext())
	//*  10   21:aload_3         
	//*  11   22:invokeinterface #52  <Method boolean Iterator.hasNext()>
	//*  12   27:ifeq            117
			{
				SettingType settingtype = (SettingType)((Iterator) (obj)).next();
	//   13   30:aload_3         
	//   14   31:invokeinterface #56  <Method Object Iterator.next()>
	//   15   36:checkcast       #58  <Class SettingType>
	//   16   39:astore          4
				switch(RobotSettingsPresenter$2.b[settingtype.ordinal()])
	//*  17   41:getstatic       #63  <Field int[] RobotSettingsPresenter$2.b>
	//*  18   44:aload           4
	//*  19   46:invokevirtual   #67  <Method int SettingType.ordinal()>
	//*  20   49:iaload          
				{
	//*  21   50:tableswitch     1 2: default 72
	//	               1 96
	//	               2 75
	//*  22   72:goto            21
				case 2: // '\002'
					RobotSettingsPresenter.b(a, Boolean.valueOf(settingsuiservicedata.getBooleanSetting(SettingType.MapUploadAllowed)));
	//   23   75:aload_0         
	//   24   76:getfield        #13  <Field RobotSettingsPresenter a>
	//   25   79:aload_1         
	//   26   80:getstatic       #71  <Field SettingType SettingType.MapUploadAllowed>
	//   27   83:invokevirtual   #75  <Method boolean SettingsUIServiceData.getBooleanSetting(SettingType)>
	//   28   86:invokestatic    #81  <Method Boolean Boolean.valueOf(boolean)>
	//   29   89:invokestatic    #84  <Method Boolean RobotSettingsPresenter.b(RobotSettingsPresenter, Boolean)>
	//   30   92:pop             
					break;

	//*  31   93:goto            21
				case 1: // '\001'
					RobotSettingsPresenter.a(a, Boolean.valueOf(settingsuiservicedata.getBooleanSetting(SettingType.PauseOnBinFull)));
	//   32   96:aload_0         
	//   33   97:getfield        #13  <Field RobotSettingsPresenter a>
	//   34  100:aload_1         
	//   35  101:getstatic       #87  <Field SettingType SettingType.PauseOnBinFull>
	//   36  104:invokevirtual   #75  <Method boolean SettingsUIServiceData.getBooleanSetting(SettingType)>
	//   37  107:invokestatic    #81  <Method Boolean Boolean.valueOf(boolean)>
	//   38  110:invokestatic    #89  <Method Boolean RobotSettingsPresenter.a(RobotSettingsPresenter, Boolean)>
	//   39  113:pop             
					break;
				}
				continue;
	//   40  114:goto            21
			}
			settingsuiservicedata = ((SettingsUIServiceData) (settingsuiservicedata.getAvailableSettings()));
	//   41  117:aload_1         
	//   42  118:invokevirtual   #92  <Method HashSet SettingsUIServiceData.getAvailableSettings()>
	//   43  121:astore_1        
			if(((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.VeryLowPowerMode))))
	//*  44  122:aload_1         
	//*  45  123:getstatic       #95  <Field SettingType SettingType.VeryLowPowerMode>
	//*  46  126:invokevirtual   #99  <Method boolean HashSet.contains(Object)>
	//*  47  129:ifeq            147
				RobotSettingsPresenter.a(a).t();
	//   48  132:aload_0         
	//   49  133:getfield        #13  <Field RobotSettingsPresenter a>
	//   50  136:invokestatic    #102 <Method RobotSettingsPresenter$a RobotSettingsPresenter.a(RobotSettingsPresenter)>
	//   51  139:invokeinterface #107 <Method void RobotSettingsPresenter$a.t()>
			else
	//*  52  144:goto            159
				RobotSettingsPresenter.a(a).x();
	//   53  147:aload_0         
	//   54  148:getfield        #13  <Field RobotSettingsPresenter a>
	//   55  151:invokestatic    #102 <Method RobotSettingsPresenter$a RobotSettingsPresenter.a(RobotSettingsPresenter)>
	//   56  154:invokeinterface #110 <Method void RobotSettingsPresenter$a.x()>
			obj = ((Object) (RobotSettingsPresenter.a(a)));
	//   57  159:aload_0         
	//   58  160:getfield        #13  <Field RobotSettingsPresenter a>
	//   59  163:invokestatic    #102 <Method RobotSettingsPresenter$a RobotSettingsPresenter.a(RobotSettingsPresenter)>
	//   60  166:astore_3        
			boolean flag;
			if(!((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.SingleLanguageOta))) && !((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.MultiLanguageOta))))
	//*  61  167:aload_1         
	//*  62  168:getstatic       #113 <Field SettingType SettingType.SingleLanguageOta>
	//*  63  171:invokevirtual   #99  <Method boolean HashSet.contains(Object)>
	//*  64  174:ifne            195
	//*  65  177:aload_1         
	//*  66  178:getstatic       #116 <Field SettingType SettingType.MultiLanguageOta>
	//*  67  181:invokevirtual   #99  <Method boolean HashSet.contains(Object)>
	//*  68  184:ifeq            190
	//*  69  187:goto            195
				flag = false;
	//   70  190:iconst_0        
	//   71  191:istore_2        
			else
	//*  72  192:goto            197
				flag = true;
	//   73  195:iconst_1        
	//   74  196:istore_2        
			((RobotSettingsPresenter$a) (obj)).a(flag);
	//   75  197:aload_3         
	//   76  198:iload_2         
	//   77  199:invokeinterface #119 <Method void RobotSettingsPresenter$a.a(boolean)>
			if(((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.PauseOnBinFull))) && RobotSettingsPresenter.b(a) != null)
	//*  78  204:aload_1         
	//*  79  205:getstatic       #87  <Field SettingType SettingType.PauseOnBinFull>
	//*  80  208:invokevirtual   #99  <Method boolean HashSet.contains(Object)>
	//*  81  211:ifeq            249
	//*  82  214:aload_0         
	//*  83  215:getfield        #13  <Field RobotSettingsPresenter a>
	//*  84  218:invokestatic    #122 <Method Boolean RobotSettingsPresenter.b(RobotSettingsPresenter)>
	//*  85  221:ifnull          249
				RobotSettingsPresenter.a(a).d(RobotSettingsPresenter.b(a).booleanValue());
	//   86  224:aload_0         
	//   87  225:getfield        #13  <Field RobotSettingsPresenter a>
	//   88  228:invokestatic    #102 <Method RobotSettingsPresenter$a RobotSettingsPresenter.a(RobotSettingsPresenter)>
	//   89  231:aload_0         
	//   90  232:getfield        #13  <Field RobotSettingsPresenter a>
	//   91  235:invokestatic    #122 <Method Boolean RobotSettingsPresenter.b(RobotSettingsPresenter)>
	//   92  238:invokevirtual   #125 <Method boolean Boolean.booleanValue()>
	//   93  241:invokeinterface #127 <Method void RobotSettingsPresenter$a.d(boolean)>
			else
	//*  94  246:goto            261
				RobotSettingsPresenter.a(a).q();
	//   95  249:aload_0         
	//   96  250:getfield        #13  <Field RobotSettingsPresenter a>
	//   97  253:invokestatic    #102 <Method RobotSettingsPresenter$a RobotSettingsPresenter.a(RobotSettingsPresenter)>
	//   98  256:invokeinterface #130 <Method void RobotSettingsPresenter$a.q()>
			if(((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.MapUploadAllowed))))
	//*  99  261:aload_1         
	//* 100  262:getstatic       #71  <Field SettingType SettingType.MapUploadAllowed>
	//* 101  265:invokevirtual   #99  <Method boolean HashSet.contains(Object)>
	//* 102  268:ifeq            349
			{
				if(RobotSettingsPresenter.c(a) != null)
	//* 103  271:aload_0         
	//* 104  272:getfield        #13  <Field RobotSettingsPresenter a>
	//* 105  275:invokestatic    #132 <Method Boolean RobotSettingsPresenter.c(RobotSettingsPresenter)>
	//* 106  278:ifnull          373
					if(((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.PersistentMaps))))
	//* 107  281:aload_1         
	//* 108  282:getstatic       #135 <Field SettingType SettingType.PersistentMaps>
	//* 109  285:invokevirtual   #99  <Method boolean HashSet.contains(Object)>
	//* 110  288:ifeq            314
					{
						RobotSettingsPresenter.a(a).f(RobotSettingsPresenter.c(a).booleanValue());
	//  111  291:aload_0         
	//  112  292:getfield        #13  <Field RobotSettingsPresenter a>
	//  113  295:invokestatic    #102 <Method RobotSettingsPresenter$a RobotSettingsPresenter.a(RobotSettingsPresenter)>
	//  114  298:aload_0         
	//  115  299:getfield        #13  <Field RobotSettingsPresenter a>
	//  116  302:invokestatic    #132 <Method Boolean RobotSettingsPresenter.c(RobotSettingsPresenter)>
	//  117  305:invokevirtual   #125 <Method boolean Boolean.booleanValue()>
	//  118  308:invokeinterface #138 <Method void RobotSettingsPresenter$a.f(boolean)>
						return;
	//  119  313:return          
					} else
					{
						RobotSettingsPresenter.a(a).e(RobotSettingsPresenter.c(a).booleanValue());
	//  120  314:aload_0         
	//  121  315:getfield        #13  <Field RobotSettingsPresenter a>
	//  122  318:invokestatic    #102 <Method RobotSettingsPresenter$a RobotSettingsPresenter.a(RobotSettingsPresenter)>
	//  123  321:aload_0         
	//  124  322:getfield        #13  <Field RobotSettingsPresenter a>
	//  125  325:invokestatic    #132 <Method Boolean RobotSettingsPresenter.c(RobotSettingsPresenter)>
	//  126  328:invokevirtual   #125 <Method boolean Boolean.booleanValue()>
	//  127  331:invokeinterface #141 <Method void RobotSettingsPresenter$a.e(boolean)>
						RobotSettingsPresenter.a(a).s();
	//  128  336:aload_0         
	//  129  337:getfield        #13  <Field RobotSettingsPresenter a>
	//  130  340:invokestatic    #102 <Method RobotSettingsPresenter$a RobotSettingsPresenter.a(RobotSettingsPresenter)>
	//  131  343:invokeinterface #144 <Method void RobotSettingsPresenter$a.s()>
						return;
	//  132  348:return          
					}
			} else
			{
				RobotSettingsPresenter.a(a).s();
	//  133  349:aload_0         
	//  134  350:getfield        #13  <Field RobotSettingsPresenter a>
	//  135  353:invokestatic    #102 <Method RobotSettingsPresenter$a RobotSettingsPresenter.a(RobotSettingsPresenter)>
	//  136  356:invokeinterface #144 <Method void RobotSettingsPresenter$a.s()>
				RobotSettingsPresenter.a(a).r();
	//  137  361:aload_0         
	//  138  362:getfield        #13  <Field RobotSettingsPresenter a>
	//  139  365:invokestatic    #102 <Method RobotSettingsPresenter$a RobotSettingsPresenter.a(RobotSettingsPresenter)>
	//  140  368:invokeinterface #147 <Method void RobotSettingsPresenter$a.r()>
			}
			break;
		} while(true);
	//  141  373:return          
	}

	final RobotSettingsPresenter a;

	private RobotSettingsPresenter$b(RobotSettingsPresenter robotsettingspresenter)
	{
		a = robotsettingspresenter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field RobotSettingsPresenter a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void SettingsUIServiceDataCallback()>
	//    5    9:return          
	}

	RobotSettingsPresenter$b(RobotSettingsPresenter robotsettingspresenter, RobotSettingsPresenter$1 robotsettingspresenter$1)
	{
		this(robotsettingspresenter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void RobotSettingsPresenter$b(RobotSettingsPresenter)>
	//    3    5:return          
	}
}
