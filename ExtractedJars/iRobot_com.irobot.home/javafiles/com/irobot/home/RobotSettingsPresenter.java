// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.AccountService;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.Assembler;
import com.irobot.core.AssetId;
import com.irobot.core.AssetInfo;
import com.irobot.core.CurrentConnectionStateEvent;
import com.irobot.core.EventType;
import com.irobot.core.HistoryDataState;
import com.irobot.core.HistoryUIService;
import com.irobot.core.HistoryUIServiceData;
import com.irobot.core.HistoryUIServiceDataCallback;
import com.irobot.core.PMIApplicationService;
import com.irobot.core.SettingType;
import com.irobot.core.SettingsSubsystem;
import com.irobot.core.SettingsUIServiceCommand;
import com.irobot.core.SettingsUIServiceData;
import com.irobot.core.SettingsUIServiceDataCallback;
import com.irobot.home.i.a;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			h

public class RobotSettingsPresenter
{
	public static interface a
		extends h.a
	{

		public abstract void a(boolean flag);

		public abstract void b(String s1);

		public abstract void d(boolean flag);

		public abstract void e(boolean flag);

		public abstract void f(boolean flag);

		public abstract void q();

		public abstract void r();

		public abstract void s();

		public abstract void t();

		public abstract void x();

		public abstract void y();
	}

	private class b extends SettingsUIServiceDataCallback
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
					static class _cls2
					{

						static final int a[];
						static final int b[];

						static 
						{
							b = new int[SettingType.values().length];
						//    0    0:invokestatic    #19  <Method SettingType[] SettingType.values()>
						//    1    3:arraylength     
						//    2    4:newarray        int[]
						//    3    6:putstatic       #21  <Field int[] b>
							try
							{
								b[SettingType.PauseOnBinFull.ordinal()] = 1;
						//    4    9:getstatic       #21  <Field int[] b>
						//    5   12:getstatic       #25  <Field SettingType SettingType.PauseOnBinFull>
						//    6   15:invokevirtual   #29  <Method int SettingType.ordinal()>
						//    7   18:iconst_1        
						//    8   19:iastore         
							}
						//*   9   20:getstatic       #21  <Field int[] b>
						//*  10   23:getstatic       #32  <Field SettingType SettingType.MapUploadAllowed>
						//*  11   26:invokevirtual   #29  <Method int SettingType.ordinal()>
						//*  12   29:iconst_2        
						//*  13   30:iastore         
						//*  14   31:invokestatic    #37  <Method HistoryDataState[] HistoryDataState.values()>
						//*  15   34:arraylength     
						//*  16   35:newarray        int[]
						//*  17   37:putstatic       #39  <Field int[] a>
						//*  18   40:getstatic       #39  <Field int[] a>
						//*  19   43:getstatic       #43  <Field HistoryDataState HistoryDataState.DockEvacuation>
						//*  20   46:invokevirtual   #44  <Method int HistoryDataState.ordinal()>
						//*  21   49:iconst_1        
						//*  22   50:iastore         
						//*  23   51:return          
							catch(NoSuchFieldError nosuchfielderror) { }
						//   24   52:astore_0        
							try
							{
								b[SettingType.MapUploadAllowed.ordinal()] = 2;
							}
						//*  25   53:goto            20
							catch(NoSuchFieldError nosuchfielderror1) { }
						//   26   56:astore_0        
							a = new int[HistoryDataState.values().length];
							try
							{
								a[HistoryDataState.DockEvacuation.ordinal()] = 1;
							}
						//*  27   57:goto            31
							catch(NoSuchFieldError nosuchfielderror2) { }
						//   28   60:astore_0        
						//*  29   61:return          
						}
					}

					switch(_cls2.b[settingtype.ordinal()])
		//*  17   41:getstatic       #63  <Field int[] RobotSettingsPresenter$2.b>
		//*  18   44:aload           4
		//*  19   46:invokevirtual   #67  <Method int SettingType.ordinal()>
		//*  20   49:iaload          
					{
		//*  21   50:tableswitch     1 2: default 72
		//		               1 96
		//		               2 75
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
						com.irobot.home.RobotSettingsPresenter.a(a, Boolean.valueOf(settingsuiservicedata.getBooleanSetting(SettingType.PauseOnBinFull)));
		//   32   96:aload_0         
		//   33   97:getfield        #13  <Field RobotSettingsPresenter a>
		//   34  100:aload_1         
		//   35  101:getstatic       #87  <Field SettingType SettingType.PauseOnBinFull>
		//   36  104:invokevirtual   #75  <Method boolean SettingsUIServiceData.getBooleanSetting(SettingType)>
		//   37  107:invokestatic    #81  <Method Boolean Boolean.valueOf(boolean)>
		//   38  110:invokestatic    #89  <Method Boolean com.irobot.home.RobotSettingsPresenter.a(RobotSettingsPresenter, Boolean)>
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
					com.irobot.home.RobotSettingsPresenter.a(a).t();
		//   48  132:aload_0         
		//   49  133:getfield        #13  <Field RobotSettingsPresenter a>
		//   50  136:invokestatic    #102 <Method RobotSettingsPresenter$a com.irobot.home.RobotSettingsPresenter.a(RobotSettingsPresenter)>
		//   51  139:invokeinterface #107 <Method void RobotSettingsPresenter$a.t()>
				else
		//*  52  144:goto            159
					com.irobot.home.RobotSettingsPresenter.a(a).x();
		//   53  147:aload_0         
		//   54  148:getfield        #13  <Field RobotSettingsPresenter a>
		//   55  151:invokestatic    #102 <Method RobotSettingsPresenter$a com.irobot.home.RobotSettingsPresenter.a(RobotSettingsPresenter)>
		//   56  154:invokeinterface #110 <Method void RobotSettingsPresenter$a.x()>
				obj = ((Object) (com.irobot.home.RobotSettingsPresenter.a(a)));
		//   57  159:aload_0         
		//   58  160:getfield        #13  <Field RobotSettingsPresenter a>
		//   59  163:invokestatic    #102 <Method RobotSettingsPresenter$a com.irobot.home.RobotSettingsPresenter.a(RobotSettingsPresenter)>
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
				((a) (obj)).a(flag);
		//   75  197:aload_3         
		//   76  198:iload_2         
		//   77  199:invokeinterface #119 <Method void com.irobot.home.RobotSettingsPresenter$a.a(boolean)>
				if(((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.PauseOnBinFull))) && RobotSettingsPresenter.b(a) != null)
		//*  78  204:aload_1         
		//*  79  205:getstatic       #87  <Field SettingType SettingType.PauseOnBinFull>
		//*  80  208:invokevirtual   #99  <Method boolean HashSet.contains(Object)>
		//*  81  211:ifeq            249
		//*  82  214:aload_0         
		//*  83  215:getfield        #13  <Field RobotSettingsPresenter a>
		//*  84  218:invokestatic    #122 <Method Boolean RobotSettingsPresenter.b(RobotSettingsPresenter)>
		//*  85  221:ifnull          249
					com.irobot.home.RobotSettingsPresenter.a(a).d(RobotSettingsPresenter.b(a).booleanValue());
		//   86  224:aload_0         
		//   87  225:getfield        #13  <Field RobotSettingsPresenter a>
		//   88  228:invokestatic    #102 <Method RobotSettingsPresenter$a com.irobot.home.RobotSettingsPresenter.a(RobotSettingsPresenter)>
		//   89  231:aload_0         
		//   90  232:getfield        #13  <Field RobotSettingsPresenter a>
		//   91  235:invokestatic    #122 <Method Boolean RobotSettingsPresenter.b(RobotSettingsPresenter)>
		//   92  238:invokevirtual   #125 <Method boolean Boolean.booleanValue()>
		//   93  241:invokeinterface #127 <Method void RobotSettingsPresenter$a.d(boolean)>
				else
		//*  94  246:goto            261
					com.irobot.home.RobotSettingsPresenter.a(a).q();
		//   95  249:aload_0         
		//   96  250:getfield        #13  <Field RobotSettingsPresenter a>
		//   97  253:invokestatic    #102 <Method RobotSettingsPresenter$a com.irobot.home.RobotSettingsPresenter.a(RobotSettingsPresenter)>
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
							com.irobot.home.RobotSettingsPresenter.a(a).f(RobotSettingsPresenter.c(a).booleanValue());
		//  111  291:aload_0         
		//  112  292:getfield        #13  <Field RobotSettingsPresenter a>
		//  113  295:invokestatic    #102 <Method RobotSettingsPresenter$a com.irobot.home.RobotSettingsPresenter.a(RobotSettingsPresenter)>
		//  114  298:aload_0         
		//  115  299:getfield        #13  <Field RobotSettingsPresenter a>
		//  116  302:invokestatic    #132 <Method Boolean RobotSettingsPresenter.c(RobotSettingsPresenter)>
		//  117  305:invokevirtual   #125 <Method boolean Boolean.booleanValue()>
		//  118  308:invokeinterface #138 <Method void RobotSettingsPresenter$a.f(boolean)>
							return;
		//  119  313:return          
						} else
						{
							com.irobot.home.RobotSettingsPresenter.a(a).e(RobotSettingsPresenter.c(a).booleanValue());
		//  120  314:aload_0         
		//  121  315:getfield        #13  <Field RobotSettingsPresenter a>
		//  122  318:invokestatic    #102 <Method RobotSettingsPresenter$a com.irobot.home.RobotSettingsPresenter.a(RobotSettingsPresenter)>
		//  123  321:aload_0         
		//  124  322:getfield        #13  <Field RobotSettingsPresenter a>
		//  125  325:invokestatic    #132 <Method Boolean RobotSettingsPresenter.c(RobotSettingsPresenter)>
		//  126  328:invokevirtual   #125 <Method boolean Boolean.booleanValue()>
		//  127  331:invokeinterface #141 <Method void RobotSettingsPresenter$a.e(boolean)>
							com.irobot.home.RobotSettingsPresenter.a(a).s();
		//  128  336:aload_0         
		//  129  337:getfield        #13  <Field RobotSettingsPresenter a>
		//  130  340:invokestatic    #102 <Method RobotSettingsPresenter$a com.irobot.home.RobotSettingsPresenter.a(RobotSettingsPresenter)>
		//  131  343:invokeinterface #144 <Method void RobotSettingsPresenter$a.s()>
							return;
		//  132  348:return          
						}
				} else
				{
					com.irobot.home.RobotSettingsPresenter.a(a).s();
		//  133  349:aload_0         
		//  134  350:getfield        #13  <Field RobotSettingsPresenter a>
		//  135  353:invokestatic    #102 <Method RobotSettingsPresenter$a com.irobot.home.RobotSettingsPresenter.a(RobotSettingsPresenter)>
		//  136  356:invokeinterface #144 <Method void RobotSettingsPresenter$a.s()>
					com.irobot.home.RobotSettingsPresenter.a(a).r();
		//  137  361:aload_0         
		//  138  362:getfield        #13  <Field RobotSettingsPresenter a>
		//  139  365:invokestatic    #102 <Method RobotSettingsPresenter$a com.irobot.home.RobotSettingsPresenter.a(RobotSettingsPresenter)>
		//  140  368:invokeinterface #147 <Method void RobotSettingsPresenter$a.r()>
				}
				break;
			} while(true);
		//  141  373:return          
		}

		final RobotSettingsPresenter a;

		private b()
		{
			a = RobotSettingsPresenter.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field RobotSettingsPresenter a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void SettingsUIServiceDataCallback()>
		//    5    9:return          
		}

	}


	public RobotSettingsPresenter(a a1, AssetInfo assetinfo, Assembler assembler)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void Object()>
		e = ((SettingsUIServiceDataCallback) (new b()));
	//    2    4:aload_0         
	//    3    5:new             #13  <Class RobotSettingsPresenter$b>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #63  <Method void RobotSettingsPresenter$b(RobotSettingsPresenter, RobotSettingsPresenter$1)>
	//    8   14:putfield        #65  <Field SettingsUIServiceDataCallback e>
		l = null;
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:putfield        #67  <Field Boolean l>
		m = null;
	//   12   22:aload_0         
	//   13   23:aconst_null     
	//   14   24:putfield        #69  <Field Boolean m>
		n = ((HistoryUIServiceDataCallback) (new HistoryUIServiceDataCallback() {

			public void onHistoryUIServiceDataChanged(HistoryUIServiceData historyuiservicedata)
			{
				Iterator iterator = historyuiservicedata.getDataStates().iterator();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #24  <Method ArrayList HistoryUIServiceData.getDataStates()>
			//    2    4:invokevirtual   #30  <Method Iterator ArrayList.iterator()>
			//    3    7:astore_2        
				do
				{
					if(!iterator.hasNext())
						break;
			//    4    8:aload_2         
			//    5    9:invokeinterface #36  <Method boolean Iterator.hasNext()>
			//    6   14:ifeq            77
					HistoryDataState historydatastate = (HistoryDataState)iterator.next();
			//    7   17:aload_2         
			//    8   18:invokeinterface #40  <Method Object Iterator.next()>
			//    9   23:checkcast       #42  <Class HistoryDataState>
			//   10   26:astore_3        
					o.a(RobotSettingsPresenter.c(), historydatastate.name());
			//   11   27:invokestatic    #46  <Method String RobotSettingsPresenter.c()>
			//   12   30:aload_3         
			//   13   31:invokevirtual   #49  <Method String HistoryDataState.name()>
			//   14   34:invokestatic    #54  <Method void o.a(String, String)>
					if(com.irobot.home._cls2.a[historydatastate.ordinal()] == 1 && !historyuiservicedata.getDockEvacuationLifeTimeData().isEmpty())
			//*  15   37:getstatic       #59  <Field int[] com.irobot.home.RobotSettingsPresenter$2.a>
			//*  16   40:aload_3         
			//*  17   41:invokevirtual   #63  <Method int HistoryDataState.ordinal()>
			//*  18   44:iaload          
			//*  19   45:iconst_1        
			//*  20   46:icmpeq          52
			//*  21   49:goto            8
			//*  22   52:aload_1         
			//*  23   53:invokevirtual   #66  <Method ArrayList HistoryUIServiceData.getDockEvacuationLifeTimeData()>
			//*  24   56:invokevirtual   #69  <Method boolean ArrayList.isEmpty()>
			//*  25   59:ifne            8
						com.irobot.home.RobotSettingsPresenter.a(a).y();
			//   26   62:aload_0         
			//   27   63:getfield        #12  <Field RobotSettingsPresenter a>
			//   28   66:invokestatic    #72  <Method RobotSettingsPresenter$a com.irobot.home.RobotSettingsPresenter.a(RobotSettingsPresenter)>
			//   29   69:invokeinterface #77  <Method void RobotSettingsPresenter$a.y()>
				} while(true);
			//   30   74:goto            8
			//   31   77:return          
			}

			final RobotSettingsPresenter a;

			
			{
				a = RobotSettingsPresenter.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field RobotSettingsPresenter a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void HistoryUIServiceDataCallback()>
			//    5    9:return          
			}
		}
));
	//   15   27:aload_0         
	//   16   28:new             #6   <Class RobotSettingsPresenter$1>
	//   17   31:dup             
	//   18   32:aload_0         
	//   19   33:invokespecial   #72  <Method void RobotSettingsPresenter$1(RobotSettingsPresenter)>
	//   20   36:putfield        #74  <Field HistoryUIServiceDataCallback n>
		b = a1;
	//   21   39:aload_0         
	//   22   40:aload_1         
	//   23   41:putfield        #76  <Field RobotSettingsPresenter$a b>
		c = assetinfo;
	//   24   44:aload_0         
	//   25   45:aload_2         
	//   26   46:putfield        #78  <Field AssetInfo c>
		d = assembler.getSettingsSubsystem(assetinfo.getAssetId());
	//   27   49:aload_0         
	//   28   50:aload_3         
	//   29   51:aload_2         
	//   30   52:invokevirtual   #84  <Method AssetId AssetInfo.getAssetId()>
	//   31   55:invokevirtual   #90  <Method SettingsSubsystem Assembler.getSettingsSubsystem(AssetId)>
	//   32   58:putfield        #92  <Field SettingsSubsystem d>
		f = assembler.getHistoryUIService(assetinfo.getAssetId());
	//   33   61:aload_0         
	//   34   62:aload_3         
	//   35   63:aload_2         
	//   36   64:invokevirtual   #84  <Method AssetId AssetInfo.getAssetId()>
	//   37   67:invokevirtual   #96  <Method HistoryUIService Assembler.getHistoryUIService(AssetId)>
	//   38   70:putfield        #98  <Field HistoryUIService f>
		g = (com.irobot.home.i.a)assembler.getDomainEventBus();
	//   39   73:aload_0         
	//   40   74:aload_3         
	//   41   75:invokevirtual   #102 <Method com.irobot.core.EventBusHandler Assembler.getDomainEventBus()>
	//   42   78:checkcast       #104 <Class a>
	//   43   81:putfield        #106 <Field a g>
		h = assembler.getAnalyticsSubsystem();
	//   44   84:aload_0         
	//   45   85:aload_3         
	//   46   86:invokevirtual   #110 <Method AnalyticsSubsystem Assembler.getAnalyticsSubsystem()>
	//   47   89:putfield        #112 <Field AnalyticsSubsystem h>
		i = new h(((h.a) (a1)), assetinfo.getAssetId(), assembler);
	//   48   92:aload_0         
	//   49   93:new             #114 <Class h>
	//   50   96:dup             
	//   51   97:aload_1         
	//   52   98:aload_2         
	//   53   99:invokevirtual   #84  <Method AssetId AssetInfo.getAssetId()>
	//   54  102:aload_3         
	//   55  103:invokespecial   #117 <Method void h(h$a, AssetId, Assembler)>
	//   56  106:putfield        #119 <Field h i>
		j = assembler.getAccountService();
	//   57  109:aload_0         
	//   58  110:aload_3         
	//   59  111:invokevirtual   #123 <Method AccountService Assembler.getAccountService()>
	//   60  114:putfield        #125 <Field AccountService j>
		k = assembler.getPMIApplicationService();
	//   61  117:aload_0         
	//   62  118:aload_3         
	//   63  119:invokevirtual   #129 <Method PMIApplicationService Assembler.getPMIApplicationService()>
	//   64  122:putfield        #131 <Field PMIApplicationService k>
	//   65  125:return          
	}

	static a a(RobotSettingsPresenter robotsettingspresenter)
	{
		return robotsettingspresenter.b;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field RobotSettingsPresenter$a b>
	//    2    4:areturn         
	}

	static Boolean a(RobotSettingsPresenter robotsettingspresenter, Boolean boolean1)
	{
		robotsettingspresenter.l = boolean1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #67  <Field Boolean l>
		return boolean1;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static Boolean b(RobotSettingsPresenter robotsettingspresenter)
	{
		return robotsettingspresenter.l;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Boolean l>
	//    2    4:areturn         
	}

	static Boolean b(RobotSettingsPresenter robotsettingspresenter, Boolean boolean1)
	{
		robotsettingspresenter.m = boolean1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #69  <Field Boolean m>
		return boolean1;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static Boolean c(RobotSettingsPresenter robotsettingspresenter)
	{
		return robotsettingspresenter.m;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field Boolean m>
	//    2    4:areturn         
	}

	static String c()
	{
		return a;
	//    0    0:getstatic       #55  <Field String a>
	//    1    3:areturn         
	}

	public void a()
	{
		g.a(((Object) (this)), EventType.CurrentConnectionStateEvent);
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field a g>
	//    2    4:aload_0         
	//    3    5:getstatic       #140 <Field EventType EventType.CurrentConnectionStateEvent>
	//    4    8:invokevirtual   #143 <Method void a.a(Object, EventType)>
		i.a();
	//    5   11:aload_0         
	//    6   12:getfield        #119 <Field h i>
	//    7   15:invokevirtual   #145 <Method void com.irobot.home.h.a()>
		d.registerUISubscriber(e);
	//    8   18:aload_0         
	//    9   19:getfield        #92  <Field SettingsSubsystem d>
	//   10   22:aload_0         
	//   11   23:getfield        #65  <Field SettingsUIServiceDataCallback e>
	//   12   26:invokevirtual   #151 <Method boolean SettingsSubsystem.registerUISubscriber(SettingsUIServiceDataCallback)>
	//   13   29:pop             
		f.registerUISubscriber(n);
	//   14   30:aload_0         
	//   15   31:getfield        #98  <Field HistoryUIService f>
	//   16   34:aload_0         
	//   17   35:getfield        #74  <Field HistoryUIServiceDataCallback n>
	//   18   38:invokevirtual   #156 <Method boolean HistoryUIService.registerUISubscriber(HistoryUIServiceDataCallback)>
	//   19   41:pop             
	//   20   42:return          
	}

	public void a(boolean flag)
	{
		SettingsUIServiceData settingsuiservicedata = SettingsUIServiceData.create();
	//    0    0:invokestatic    #163 <Method SettingsUIServiceData SettingsUIServiceData.create()>
	//    1    3:astore_2        
		settingsuiservicedata.setBooleanSetting(SettingType.MapUploadAllowed, flag);
	//    2    4:aload_2         
	//    3    5:getstatic       #169 <Field SettingType SettingType.MapUploadAllowed>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #173 <Method void SettingsUIServiceData.setBooleanSetting(SettingType, boolean)>
		d.sendCommand(SettingsUIServiceCommand.UpdateSetting, settingsuiservicedata);
	//    6   12:aload_0         
	//    7   13:getfield        #92  <Field SettingsSubsystem d>
	//    8   16:getstatic       #179 <Field SettingsUIServiceCommand SettingsUIServiceCommand.UpdateSetting>
	//    9   19:aload_2         
	//   10   20:invokevirtual   #183 <Method void SettingsSubsystem.sendCommand(SettingsUIServiceCommand, SettingsUIServiceData)>
		h.trackCleanMapEnabledSettingChanged(c, flag);
	//   11   23:aload_0         
	//   12   24:getfield        #112 <Field AnalyticsSubsystem h>
	//   13   27:aload_0         
	//   14   28:getfield        #78  <Field AssetInfo c>
	//   15   31:iload_1         
	//   16   32:invokevirtual   #189 <Method void AnalyticsSubsystem.trackCleanMapEnabledSettingChanged(AssetInfo, boolean)>
	//   17   35:return          
	}

	public void b()
	{
		d.unregisterSubscriber(e);
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field SettingsSubsystem d>
	//    2    4:aload_0         
	//    3    5:getfield        #65  <Field SettingsUIServiceDataCallback e>
	//    4    8:invokevirtual   #192 <Method boolean SettingsSubsystem.unregisterSubscriber(SettingsUIServiceDataCallback)>
	//    5   11:pop             
		g.a(((Object) (this)));
	//    6   12:aload_0         
	//    7   13:getfield        #106 <Field a g>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #195 <Method void a.a(Object)>
		i.b();
	//   10   20:aload_0         
	//   11   21:getfield        #119 <Field h i>
	//   12   24:invokevirtual   #197 <Method void h.b()>
		f.unregisterSubscriber(n);
	//   13   27:aload_0         
	//   14   28:getfield        #98  <Field HistoryUIService f>
	//   15   31:aload_0         
	//   16   32:getfield        #74  <Field HistoryUIServiceDataCallback n>
	//   17   35:invokevirtual   #199 <Method boolean HistoryUIService.unregisterSubscriber(HistoryUIServiceDataCallback)>
	//   18   38:pop             
	//   19   39:return          
	}

	public void onCurrentConnectionStateEvent(CurrentConnectionStateEvent currentconnectionstateevent)
	{
		currentconnectionstateevent = ((CurrentConnectionStateEvent) (currentconnectionstateevent.assetId().getId()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #207 <Method AssetId CurrentConnectionStateEvent.assetId()>
	//    2    4:invokevirtual   #212 <Method String AssetId.getId()>
	//    3    7:astore_1        
		b.b(com.irobot.home.util.j.a(((String) (currentconnectionstateevent))).a().getName());
	//    4    8:aload_0         
	//    5    9:getfield        #76  <Field RobotSettingsPresenter$a b>
	//    6   12:aload_1         
	//    7   13:invokestatic    #215 <Method com.irobot.home.model.a j.a(String)>
	//    8   16:invokevirtual   #220 <Method AssetInfo com.irobot.home.model.a.a()>
	//    9   19:invokevirtual   #223 <Method String AssetInfo.getName()>
	//   10   22:invokeinterface #226 <Method void RobotSettingsPresenter$a.b(String)>
	//   11   27:return          
	}

	private static final String a = com.irobot.home.util.j.r(((Class) (com/irobot/home/RobotSettingsPresenter)).getSimpleName());
	private a b;
	private AssetInfo c;
	private SettingsSubsystem d;
	private SettingsUIServiceDataCallback e;
	private HistoryUIService f;
	private com.irobot.home.i.a g;
	private AnalyticsSubsystem h;
	private h i;
	private AccountService j;
	private PMIApplicationService k;
	private Boolean l;
	private Boolean m;
	private HistoryUIServiceDataCallback n;

	static 
	{
	//    0    0:ldc1            #2   <Class RobotSettingsPresenter>
	//    1    2:invokevirtual   #47  <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #53  <Method String j.r(String)>
	//    3    8:putstatic       #55  <Field String a>
	//*   4   11:return          
	}
}
