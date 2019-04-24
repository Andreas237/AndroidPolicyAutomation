// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.animation.AlphaAnimation;
import android.widget.*;
import com.irobot.core.*;
import com.irobot.home.model.IRobotModel;
import com.irobot.home.model.a;
import com.irobot.home.rest.CustomerCareRestClient;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomVideoView;
import java.util.*;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, IRobotApplication, VideoHelpActivity_

public class CustomerRegistrationActivity extends BaseFragmentActivity
	implements com.irobot.home.view.CustomVideoView.a
{
	private class a extends MissionUIServiceDataCallback
	{

		public void onMissionUIServiceDataChanged(MissionUIServiceData missionuiservicedata)
		{
			if(missionuiservicedata == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       13
			{
				com.irobot.home.util.o.e(com.irobot.home.CustomerRegistrationActivity.o(), "null service data");
		//    2    4:invokestatic    #25  <Method String com.irobot.home.CustomerRegistrationActivity.o()>
		//    3    7:ldc1            #27  <String "null service data">
		//    4    9:invokestatic    #33  <Method void o.e(String, String)>
				return;
		//    5   12:return          
			}
			Object obj = ((Object) (missionuiservicedata.getMissionDataStates()));
		//    6   13:aload_1         
		//    7   14:invokevirtual   #39  <Method ArrayList MissionUIServiceData.getMissionDataStates()>
		//    8   17:astore_2        
			String s = com.irobot.home.CustomerRegistrationActivity.o();
		//    9   18:invokestatic    #25  <Method String com.irobot.home.CustomerRegistrationActivity.o()>
		//   10   21:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
		//   11   22:new             #41  <Class StringBuilder>
		//   12   25:dup             
		//   13   26:invokespecial   #42  <Method void StringBuilder()>
		//   14   29:astore          4
			stringbuilder.append("Change list: ");
		//   15   31:aload           4
		//   16   33:ldc1            #44  <String "Change list: ">
		//   17   35:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
		//   18   38:pop             
			stringbuilder.append(((ArrayList) (obj)).toString());
		//   19   39:aload           4
		//   20   41:aload_2         
		//   21   42:invokevirtual   #53  <Method String ArrayList.toString()>
		//   22   45:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
		//   23   48:pop             
			com.irobot.home.util.o.b(s, stringbuilder.toString());
		//   24   49:aload_3         
		//   25   50:aload           4
		//   26   52:invokevirtual   #54  <Method String StringBuilder.toString()>
		//   27   55:invokestatic    #57  <Method void o.b(String, String)>
			obj = ((Object) (((ArrayList) (obj)).iterator()));
		//   28   58:aload_2         
		//   29   59:invokevirtual   #61  <Method Iterator ArrayList.iterator()>
		//   30   62:astore_2        
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
		//   31   63:aload_2         
		//   32   64:invokeinterface #67  <Method boolean Iterator.hasNext()>
		//   33   69:ifeq            117
				MissionDataState missiondatastate = (MissionDataState)((Iterator) (obj)).next();
		//   34   72:aload_2         
		//   35   73:invokeinterface #71  <Method Object Iterator.next()>
		//   36   78:checkcast       #73  <Class MissionDataState>
		//   37   81:astore_3        
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
							b[SettingType.SerialNumber.ordinal()] = 1;
					//    4    9:getstatic       #21  <Field int[] b>
					//    5   12:getstatic       #25  <Field SettingType SettingType.SerialNumber>
					//    6   15:invokevirtual   #29  <Method int SettingType.ordinal()>
					//    7   18:iconst_1        
					//    8   19:iastore         
						}
					//*   9   20:invokestatic    #34  <Method MissionDataState[] MissionDataState.values()>
					//*  10   23:arraylength     
					//*  11   24:newarray        int[]
					//*  12   26:putstatic       #36  <Field int[] a>
					//*  13   29:getstatic       #36  <Field int[] a>
					//*  14   32:getstatic       #40  <Field MissionDataState MissionDataState.EvacHelpContentId>
					//*  15   35:invokevirtual   #41  <Method int MissionDataState.ordinal()>
					//*  16   38:iconst_1        
					//*  17   39:iastore         
					//*  18   40:return          
						catch(NoSuchFieldError nosuchfielderror) { }
					//   19   41:astore_0        
						a = new int[MissionDataState.values().length];
						try
						{
							a[MissionDataState.EvacHelpContentId.ordinal()] = 1;
						}
					//*  20   42:goto            20
						catch(NoSuchFieldError nosuchfielderror1) { }
					//   21   45:astore_0        
					//*  22   46:return          
					}
				}

				if(com.irobot.home._cls2.a[missiondatastate.ordinal()] == 1)
		//*  38   82:getstatic       #78  <Field int[] com.irobot.home.CustomerRegistrationActivity$2.a>
		//*  39   85:aload_3         
		//*  40   86:invokevirtual   #82  <Method int MissionDataState.ordinal()>
		//*  41   89:iaload          
		//*  42   90:iconst_1        
		//*  43   91:icmpeq          97
		//*  44   94:goto            63
					com.irobot.home.CustomerRegistrationActivity.a(a, "Error 350".equals(((Object) (missionuiservicedata.getEvacHelpContentId()))));
		//   45   97:aload_0         
		//   46   98:getfield        #12  <Field CustomerRegistrationActivity a>
		//   47  101:ldc1            #84  <String "Error 350">
		//   48  103:aload_1         
		//   49  104:invokevirtual   #87  <Method String MissionUIServiceData.getEvacHelpContentId()>
		//   50  107:invokevirtual   #93  <Method boolean String.equals(Object)>
		//   51  110:invokestatic    #96  <Method boolean com.irobot.home.CustomerRegistrationActivity.a(CustomerRegistrationActivity, boolean)>
		//   52  113:pop             
			} while(true);
		//   53  114:goto            63
		//   54  117:return          
		}

		final CustomerRegistrationActivity a;

		private a()
		{
			a = CustomerRegistrationActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field CustomerRegistrationActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void MissionUIServiceDataCallback()>
		//    5    9:return          
		}

	}


	public CustomerRegistrationActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method void BaseFragmentActivity()>
	//    2    4:aload_0         
	//    3    5:ldc2w           #60  <Double 0.5D>
	//    4    8:putfield        #63  <Field double m>
		t = null;
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:putfield        #65  <Field MissionSubsystem t>
		u = new a();
	//    8   16:aload_0         
	//    9   17:new             #12  <Class CustomerRegistrationActivity$a>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:invokespecial   #68  <Method void CustomerRegistrationActivity$a(CustomerRegistrationActivity, CustomerRegistrationActivity$1)>
	//   14   26:putfield        #70  <Field CustomerRegistrationActivity$a u>
		y = ((SettingsUIServiceDataCallback) (new SettingsUIServiceDataCallback() {

			public void onSettingsUIServiceDataChanged(SettingsUIServiceData settingsuiservicedata)
			{
				if(settingsuiservicedata == null)
			//*   0    0:aload_1         
			//*   1    1:ifnonnull       13
				{
					com.irobot.home.util.o.e(com.irobot.home.CustomerRegistrationActivity.o(), "Received null service data.");
			//    2    4:invokestatic    #22  <Method String com.irobot.home.CustomerRegistrationActivity.o()>
			//    3    7:ldc1            #24  <String "Received null service data.">
			//    4    9:invokestatic    #30  <Method void o.e(String, String)>
					return;
			//    5   12:return          
				}
				Iterator iterator = settingsuiservicedata.getSettingsChangeList().iterator();
			//    6   13:aload_1         
			//    7   14:invokevirtual   #36  <Method HashSet SettingsUIServiceData.getSettingsChangeList()>
			//    8   17:invokevirtual   #42  <Method Iterator HashSet.iterator()>
			//    9   20:astore_2        
				do
				{
					if(!iterator.hasNext())
						break;
			//   10   21:aload_2         
			//   11   22:invokeinterface #48  <Method boolean Iterator.hasNext()>
			//   12   27:ifeq            73
					SettingType settingtype = (SettingType)iterator.next();
			//   13   30:aload_2         
			//   14   31:invokeinterface #52  <Method Object Iterator.next()>
			//   15   36:checkcast       #54  <Class SettingType>
			//   16   39:astore_3        
					if(_cls2.b[settingtype.ordinal()] == 1)
			//*  17   40:getstatic       #60  <Field int[] CustomerRegistrationActivity$2.b>
			//*  18   43:aload_3         
			//*  19   44:invokevirtual   #64  <Method int SettingType.ordinal()>
			//*  20   47:iaload          
			//*  21   48:iconst_1        
			//*  22   49:icmpeq          55
			//*  23   52:goto            21
						com.irobot.home.CustomerRegistrationActivity.a(a, settingsuiservicedata.getStringSetting(SettingType.SerialNumber));
			//   24   55:aload_0         
			//   25   56:getfield        #12  <Field CustomerRegistrationActivity a>
			//   26   59:aload_1         
			//   27   60:getstatic       #68  <Field SettingType SettingType.SerialNumber>
			//   28   63:invokevirtual   #72  <Method String SettingsUIServiceData.getStringSetting(SettingType)>
			//   29   66:invokestatic    #75  <Method String com.irobot.home.CustomerRegistrationActivity.a(CustomerRegistrationActivity, String)>
			//   30   69:pop             
				} while(true);
			//   31   70:goto            21
				if(!com.irobot.home.CustomerRegistrationActivity.a(a))
			//*  32   73:aload_0         
			//*  33   74:getfield        #12  <Field CustomerRegistrationActivity a>
			//*  34   77:invokestatic    #78  <Method boolean com.irobot.home.CustomerRegistrationActivity.a(CustomerRegistrationActivity)>
			//*  35   80:ifne            90
					a.j();
			//   36   83:aload_0         
			//   37   84:getfield        #12  <Field CustomerRegistrationActivity a>
			//   38   87:invokevirtual   #81  <Method void com.irobot.home.CustomerRegistrationActivity.j()>
				a.i();
			//   39   90:aload_0         
			//   40   91:getfield        #12  <Field CustomerRegistrationActivity a>
			//   41   94:invokevirtual   #84  <Method void CustomerRegistrationActivity.i()>
			//   42   97:return          
			}

			final CustomerRegistrationActivity a;

			
			{
				a = CustomerRegistrationActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field CustomerRegistrationActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void SettingsUIServiceDataCallback()>
			//    5    9:return          
			}
		}
));
	//   15   29:aload_0         
	//   16   30:new             #8   <Class CustomerRegistrationActivity$1>
	//   17   33:dup             
	//   18   34:aload_0         
	//   19   35:invokespecial   #73  <Method void CustomerRegistrationActivity$1(CustomerRegistrationActivity)>
	//   20   38:putfield        #75  <Field SettingsUIServiceDataCallback y>
	//   21   41:return          
	}

	static String a(CustomerRegistrationActivity customerregistrationactivity, String s)
	{
		customerregistrationactivity.z = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #78  <Field String z>
		return s;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static boolean a(CustomerRegistrationActivity customerregistrationactivity)
	{
		return customerregistrationactivity.A;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field boolean A>
	//    2    4:ireturn         
	}

	static boolean a(CustomerRegistrationActivity customerregistrationactivity, boolean flag)
	{
		customerregistrationactivity.v = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #84  <Field boolean v>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static String o()
	{
		return l;
	//    0    0:getstatic       #87  <Field String l>
	//    1    3:areturn         
	}

	public void a(int i1, int j1)
	{
		if(j1 != -1007)
	//*   0    0:iload_2         
	//*   1    1:sipush          -1007
	//*   2    4:icmpeq          19
		{
			if(j1 == -1010)
	//*   3    7:iload_2         
	//*   4    8:sipush          -1010
	//*   5   11:icmpne          15
				return;
	//    6   14:return          
			f_();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #91  <Method void f_()>
		}
	//    9   19:return          
	}

	public void e()
	{
		AssetInfo assetinfo = com.irobot.home.util.j.a(b).a();
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field String b>
	//    2    4:invokestatic    #98  <Method a j.a(String)>
	//    3    7:invokevirtual   #103 <Method AssetInfo a.a()>
	//    4   10:astore          4
		Object obj = ((Object) (Assembler.getInstance().getAssetSetupUIService().getServiceData()));
	//    5   12:invokestatic    #109 <Method Assembler Assembler.getInstance()>
	//    6   15:invokevirtual   #113 <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
	//    7   18:invokevirtual   #119 <Method AssetSetupUIServiceData AssetSetupUIService.getServiceData()>
	//    8   21:astore_2        
		if(obj != null)
	//*   9   22:aload_2         
	//*  10   23:ifnull          34
			w = ((AssetSetupUIServiceData) (obj)).getAssetName();
	//   11   26:aload_0         
	//   12   27:aload_2         
	//   13   28:invokevirtual   #124 <Method String AssetSetupUIServiceData.getAssetName()>
	//   14   31:putfield        #126 <Field String w>
		k.setVisibility(8);
	//   15   34:aload_0         
	//   16   35:getfield        #128 <Field ProgressBar k>
	//   17   38:bipush          8
	//   18   40:invokevirtual   #134 <Method void ProgressBar.setVisibility(int)>
		int i1;
		Resources resources;
		if(AssetCapabilityUtils.isMoppingRobot(assetinfo))
	//*  19   43:aload           4
	//*  20   45:invokestatic    #140 <Method boolean AssetCapabilityUtils.isMoppingRobot(AssetInfo)>
	//*  21   48:ifeq            76
		{
			obj = ((Object) (h));
	//   22   51:aload_0         
	//   23   52:getfield        #142 <Field Button h>
	//   24   55:astore_2        
			resources = getResources();
	//   25   56:aload_0         
	//   26   57:invokevirtual   #146 <Method Resources getResources()>
	//   27   60:astore_3        
			i1 = 0x7f0800c7;
	//   28   61:ldc1            #147 <Int 0x7f0800c7>
	//   29   63:istore_1        
		} else
	//*  30   64:aload_2         
	//*  31   65:aload_3         
	//*  32   66:iload_1         
	//*  33   67:invokevirtual   #153 <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
	//*  34   70:invokevirtual   #159 <Method void Button.setBackground(android.graphics.drawable.Drawable)>
	//*  35   73:goto            92
		{
			obj = ((Object) (h));
	//   36   76:aload_0         
	//   37   77:getfield        #142 <Field Button h>
	//   38   80:astore_2        
			resources = getResources();
	//   39   81:aload_0         
	//   40   82:invokevirtual   #146 <Method Resources getResources()>
	//   41   85:astore_3        
			i1 = 0x7f0800c8;
	//   42   86:ldc1            #160 <Int 0x7f0800c8>
	//   43   88:istore_1        
		}
		((Button) (obj)).setBackground(resources.getDrawable(i1));
	//*  44   89:goto            64
		if(AssetCapabilityUtils.isMoppingRobot(assetinfo))
	//*  45   92:aload           4
	//*  46   94:invokestatic    #140 <Method boolean AssetCapabilityUtils.isMoppingRobot(AssetInfo)>
	//*  47   97:ifeq            109
			b(0x7f0f0139);
	//   48  100:aload_0         
	//   49  101:ldc1            #161 <Int 0x7f0f0139>
	//   50  103:invokevirtual   #163 <Method void b(int)>
		else
	//*  51  106:goto            115
			c(0x7f0f07af);
	//   52  109:aload_0         
	//   53  110:ldc1            #164 <Int 0x7f0f07af>
	//   54  112:invokevirtual   #166 <Method void c(int)>
		if(AssetCapabilityUtils.isVacuumingRobot(assetinfo) && !AssetCapabilityUtils.isAwsEnabledAsset(assetinfo))
	//*  55  115:aload           4
	//*  56  117:invokestatic    #169 <Method boolean AssetCapabilityUtils.isVacuumingRobot(AssetInfo)>
	//*  57  120:ifeq            153
	//*  58  123:aload           4
	//*  59  125:invokestatic    #172 <Method boolean AssetCapabilityUtils.isAwsEnabledAsset(AssetInfo)>
	//*  60  128:ifne            153
		{
			CommandTierAgent commandtieragent = Assembler.getInstance().getCommandTierAgent(assetinfo.getAssetId());
	//   61  131:invokestatic    #109 <Method Assembler Assembler.getInstance()>
	//   62  134:aload           4
	//   63  136:invokevirtual   #178 <Method com.irobot.core.AssetId AssetInfo.getAssetId()>
	//   64  139:invokevirtual   #182 <Method CommandTierAgent Assembler.getCommandTierAgent(com.irobot.core.AssetId)>
	//   65  142:astore_2        
			if(commandtieragent != null)
	//*  66  143:aload_2         
	//*  67  144:ifnull          153
				commandtieragent.processV1ProvisioningFinished(assetinfo);
	//   68  147:aload_2         
	//   69  148:aload           4
	//   70  150:invokevirtual   #188 <Method void CommandTierAgent.processV1ProvisioningFinished(AssetInfo)>
		}
		d.setColorFilter(getResources().getColor(0x7f060078), android.graphics.PorterDuff.Mode.MULTIPLY);
	//   71  153:aload_0         
	//   72  154:getfield        #190 <Field ImageButton d>
	//   73  157:aload_0         
	//   74  158:invokevirtual   #146 <Method Resources getResources()>
	//   75  161:ldc1            #191 <Int 0x7f060078>
	//   76  163:invokevirtual   #195 <Method int Resources.getColor(int)>
	//   77  166:getstatic       #201 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.MULTIPLY>
	//   78  169:invokevirtual   #207 <Method void ImageButton.setColorFilter(int, android.graphics.PorterDuff$Mode)>
		n = com.irobot.home.util.j.a(0.0F, 1.0F, 0L, 200L, true);
	//   79  172:aload_0         
	//   80  173:fconst_0        
	//   81  174:fconst_1        
	//   82  175:lconst_0        
	//   83  176:ldc2w           #208 <Long 200L>
	//   84  179:iconst_1        
	//   85  180:invokestatic    #212 <Method AlphaAnimation j.a(float, float, long, long, boolean)>
	//   86  183:putfield        #214 <Field AlphaAnimation n>
		o = com.irobot.home.util.j.a(1.0F, 0.0F, 100L, 200L, true);
	//   87  186:aload_0         
	//   88  187:fconst_1        
	//   89  188:fconst_0        
	//   90  189:ldc2w           #215 <Long 100L>
	//   91  192:ldc2w           #208 <Long 200L>
	//   92  195:iconst_1        
	//   93  196:invokestatic    #212 <Method AlphaAnimation j.a(float, float, long, long, boolean)>
	//   94  199:putfield        #218 <Field AlphaAnimation o>
		k.setProgress(k.getMax());
	//   95  202:aload_0         
	//   96  203:getfield        #128 <Field ProgressBar k>
	//   97  206:aload_0         
	//   98  207:getfield        #128 <Field ProgressBar k>
	//   99  210:invokevirtual   #222 <Method int ProgressBar.getMax()>
	//  100  213:invokevirtual   #225 <Method void ProgressBar.setProgress(int)>
		a = com.irobot.home.util.j.i(((android.content.Context) (this)));
	//  101  216:aload_0         
	//  102  217:aload_0         
	//  103  218:invokestatic    #228 <Method CustomerCareRestClient j.i(android.content.Context)>
	//  104  221:putfield        #230 <Field CustomerCareRestClient a>
		A = AssetCapabilityUtils.isNonCloudCapableMoppingRobot(assetinfo);
	//  105  224:aload_0         
	//  106  225:aload           4
	//  107  227:invokestatic    #233 <Method boolean AssetCapabilityUtils.isNonCloudCapableMoppingRobot(AssetInfo)>
	//  108  230:putfield        #81  <Field boolean A>
		if(A)
	//* 109  233:aload_0         
	//* 110  234:getfield        #81  <Field boolean A>
	//* 111  237:ifeq            260
		{
			e.setVisibility(8);
	//  112  240:aload_0         
	//  113  241:getfield        #235 <Field LinearLayout e>
	//  114  244:bipush          8
	//  115  246:invokevirtual   #238 <Method void LinearLayout.setVisibility(int)>
			f.setVisibility(0);
	//  116  249:aload_0         
	//  117  250:getfield        #240 <Field LinearLayout f>
	//  118  253:iconst_0        
	//  119  254:invokevirtual   #238 <Method void LinearLayout.setVisibility(int)>
		} else
	//* 120  257:goto            277
		{
			e.setVisibility(0);
	//  121  260:aload_0         
	//  122  261:getfield        #235 <Field LinearLayout e>
	//  123  264:iconst_0        
	//  124  265:invokevirtual   #238 <Method void LinearLayout.setVisibility(int)>
			f.setVisibility(8);
	//  125  268:aload_0         
	//  126  269:getfield        #240 <Field LinearLayout f>
	//  127  272:bipush          8
	//  128  274:invokevirtual   #238 <Method void LinearLayout.setVisibility(int)>
		}
		t = Assembler.getInstance().getMissionSubsystem(assetinfo.getAssetId());
	//  129  277:aload_0         
	//  130  278:invokestatic    #109 <Method Assembler Assembler.getInstance()>
	//  131  281:aload           4
	//  132  283:invokevirtual   #178 <Method com.irobot.core.AssetId AssetInfo.getAssetId()>
	//  133  286:invokevirtual   #244 <Method MissionSubsystem Assembler.getMissionSubsystem(com.irobot.core.AssetId)>
	//  134  289:putfield        #65  <Field MissionSubsystem t>
		x = Assembler.getInstance().getSettingsSubsystem(assetinfo.getAssetId());
	//  135  292:aload_0         
	//  136  293:invokestatic    #109 <Method Assembler Assembler.getInstance()>
	//  137  296:aload           4
	//  138  298:invokevirtual   #178 <Method com.irobot.core.AssetId AssetInfo.getAssetId()>
	//  139  301:invokevirtual   #248 <Method SettingsSubsystem Assembler.getSettingsSubsystem(com.irobot.core.AssetId)>
	//  140  304:putfield        #250 <Field SettingsSubsystem x>
	//  141  307:return          
	}

	public void e_()
	{
	//    0    0:return          
	}

	public void f()
	{
		i.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #253 <Field ProgressBar i>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #134 <Method void ProgressBar.setVisibility(int)>
		h.setVisibility(8);
	//    4    8:aload_0         
	//    5    9:getfield        #142 <Field Button h>
	//    6   12:bipush          8
	//    7   14:invokevirtual   #254 <Method void Button.setVisibility(int)>
	//    8   17:return          
	}

	public void f_()
	{
		d.startAnimation(((android.view.animation.Animation) (n)));
	//    0    0:aload_0         
	//    1    1:getfield        #190 <Field ImageButton d>
	//    2    4:aload_0         
	//    3    5:getfield        #214 <Field AlphaAnimation n>
	//    4    8:invokevirtual   #258 <Method void ImageButton.startAnimation(android.view.animation.Animation)>
		d.setClickable(true);
	//    5   11:aload_0         
	//    6   12:getfield        #190 <Field ImageButton d>
	//    7   15:iconst_1        
	//    8   16:invokevirtual   #262 <Method void ImageButton.setClickable(boolean)>
	//    9   19:return          
	}

	public void i()
	{
		i.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #253 <Field ProgressBar i>
	//    2    4:bipush          8
	//    3    6:invokevirtual   #134 <Method void ProgressBar.setVisibility(int)>
		h.setVisibility(0);
	//    4    9:aload_0         
	//    5   10:getfield        #142 <Field Button h>
	//    6   13:iconst_0        
	//    7   14:invokevirtual   #254 <Method void Button.setVisibility(int)>
	//    8   17:return          
	}

	public void j()
	{
		boolean flag;
label0:
		{
			Object obj = ((Object) (com.irobot.home.util.j.a(b)));
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field String b>
	//    2    4:invokestatic    #98  <Method a j.a(String)>
	//    3    7:astore_3        
			if(obj != null)
	//*   4    8:aload_3         
	//*   5    9:ifnull          36
			{
				obj = ((Object) (((com.irobot.home.model.a) (obj)).a()));
	//    6   12:aload_3         
	//    7   13:invokevirtual   #103 <Method AssetInfo a.a()>
	//    8   16:astore_3        
				if(AssetCapabilityUtils.isCloudCapable(((AssetInfo) (obj))) && AssetCapabilityUtils.isMoppingRobot(((AssetInfo) (obj))))
	//*   9   17:aload_3         
	//*  10   18:invokestatic    #265 <Method boolean AssetCapabilityUtils.isCloudCapable(AssetInfo)>
	//*  11   21:ifeq            36
	//*  12   24:aload_3         
	//*  13   25:invokestatic    #140 <Method boolean AssetCapabilityUtils.isMoppingRobot(AssetInfo)>
	//*  14   28:ifeq            36
				{
					flag = true;
	//   15   31:iconst_1        
	//   16   32:istore_1        
					break label0;
	//   17   33:goto            38
				}
			}
			flag = false;
	//   18   36:iconst_0        
	//   19   37:istore_1        
		}
		int i1;
		if(flag)
	//*  20   38:iload_1         
	//*  21   39:ifeq            49
			i1 = 0x7f0e020b;
	//   22   42:ldc2            #266 <Int 0x7f0e020b>
	//   23   45:istore_1        
		else
	//*  24   46:goto            53
			i1 = 0x7f0e01fe;
	//   25   49:ldc2            #267 <Int 0x7f0e01fe>
	//   26   52:istore_1        
		android.net.Uri uri = com.irobot.home.util.j.a(((android.content.Context) (this)), i1);
	//   27   53:aload_0         
	//   28   54:iload_1         
	//   29   55:invokestatic    #270 <Method android.net.Uri j.a(android.content.Context, int)>
	//   30   58:astore_3        
		i1 = com.irobot.home.util.j.a(((android.app.Activity) (this)), uri);
	//   31   59:aload_0         
	//   32   60:aload_3         
	//   33   61:invokestatic    #273 <Method int j.a(android.app.Activity, android.net.Uri)>
	//   34   64:istore_1        
		int j1 = (int)((double)getResources().getDisplayMetrics().heightPixels * 0.5D);
	//   35   65:aload_0         
	//   36   66:invokevirtual   #146 <Method Resources getResources()>
	//   37   69:invokevirtual   #277 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   38   72:getfield        #283 <Field int DisplayMetrics.heightPixels>
	//   39   75:i2d             
	//   40   76:ldc2w           #60  <Double 0.5D>
	//   41   79:dmul            
	//   42   80:d2i             
	//   43   81:istore_2        
		c.setVideoStatusListener(((com.irobot.home.view.CustomVideoView.a) (this)));
	//   44   82:aload_0         
	//   45   83:getfield        #285 <Field CustomVideoView c>
	//   46   86:aload_0         
	//   47   87:invokevirtual   #291 <Method void CustomVideoView.setVideoStatusListener(com.irobot.home.view.CustomVideoView$a)>
		CustomVideoView customvideoview = c;
	//   48   90:aload_0         
	//   49   91:getfield        #285 <Field CustomVideoView c>
	//   50   94:astore          4
		if(i1 >= j1)
	//*  51   96:iload_1         
	//*  52   97:iload_2         
	//*  53   98:icmpge          104
	//*  54  101:goto            106
			i1 = j1;
	//   55  104:iload_2         
	//   56  105:istore_1        
		customvideoview.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.RelativeLayout.LayoutParams(-1, i1))));
	//   57  106:aload           4
	//   58  108:new             #293 <Class android.widget.RelativeLayout$LayoutParams>
	//   59  111:dup             
	//   60  112:iconst_m1       
	//   61  113:iload_1         
	//   62  114:invokespecial   #295 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//   63  117:invokevirtual   #299 <Method void CustomVideoView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		c.setVisibility(0);
	//   64  120:aload_0         
	//   65  121:getfield        #285 <Field CustomVideoView c>
	//   66  124:iconst_0        
	//   67  125:invokevirtual   #300 <Method void CustomVideoView.setVisibility(int)>
		c.setSource(uri);
	//   68  128:aload_0         
	//   69  129:getfield        #285 <Field CustomVideoView c>
	//   70  132:aload_3         
	//   71  133:invokevirtual   #304 <Method void CustomVideoView.setSource(android.net.Uri)>
		c.a();
	//   72  136:aload_0         
	//   73  137:getfield        #285 <Field CustomVideoView c>
	//   74  140:invokevirtual   #306 <Method void CustomVideoView.a()>
		d.setVisibility(4);
	//   75  143:aload_0         
	//   76  144:getfield        #190 <Field ImageButton d>
	//   77  147:iconst_4        
	//   78  148:invokevirtual   #307 <Method void ImageButton.setVisibility(int)>
	//   79  151:return          
	}

	public void k()
	{
		AssetInfo assetinfo = com.irobot.home.util.j.a(b).a();
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field String b>
	//    2    4:invokestatic    #98  <Method a j.a(String)>
	//    3    7:invokevirtual   #103 <Method AssetInfo a.a()>
	//    4   10:astore_2        
		j.h().a(assetinfo);
	//    5   11:aload_0         
	//    6   12:getfield        #309 <Field IRobotApplication j>
	//    7   15:invokevirtual   #314 <Method IRobotModel IRobotApplication.h()>
	//    8   18:aload_2         
	//    9   19:invokevirtual   #318 <Method void IRobotModel.a(AssetInfo)>
		w = ((Object) (g.getText())).toString();
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #320 <Field EditText g>
	//   13   27:invokevirtual   #326 <Method android.text.Editable EditText.getText()>
	//   14   30:invokevirtual   #331 <Method String Object.toString()>
	//   15   33:putfield        #126 <Field String w>
		if(w.isEmpty())
	//*  16   36:aload_0         
	//*  17   37:getfield        #126 <Field String w>
	//*  18   40:invokevirtual   #337 <Method boolean String.isEmpty()>
	//*  19   43:ifeq            76
		{
			int i1;
			if(A)
	//*  20   46:aload_0         
	//*  21   47:getfield        #81  <Field boolean A>
	//*  22   50:ifeq            69
				i1 = 0x7f0f00ed;
	//   23   53:ldc2            #338 <Int 0x7f0f00ed>
	//   24   56:istore_1        
			else
	//*  25   57:aload_0         
	//*  26   58:aload_0         
	//*  27   59:iload_1         
	//*  28   60:invokevirtual   #342 <Method String getString(int)>
	//*  29   63:putfield        #126 <Field String w>
	//*  30   66:goto            76
				i1 = 0x7f0f07ab;
	//   31   69:ldc2            #343 <Int 0x7f0f07ab>
	//   32   72:istore_1        
			w = getString(i1);
		}
	//*  33   73:goto            57
		if(Assembler.getInstance().getAccountService().getAccountInfo() != null && A)
	//*  34   76:invokestatic    #109 <Method Assembler Assembler.getInstance()>
	//*  35   79:invokevirtual   #347 <Method AccountService Assembler.getAccountService()>
	//*  36   82:invokevirtual   #353 <Method com.irobot.core.AccountInfo AccountService.getAccountInfo()>
	//*  37   85:ifnull          99
	//*  38   88:aload_0         
	//*  39   89:getfield        #81  <Field boolean A>
	//*  40   92:ifeq            99
			n();
	//   41   95:aload_0         
	//   42   96:invokevirtual   #355 <Method void n()>
		h.setEnabled(false);
	//   43   99:aload_0         
	//   44  100:getfield        #142 <Field Button h>
	//   45  103:iconst_0        
	//   46  104:invokevirtual   #358 <Method void Button.setEnabled(boolean)>
		i.setVisibility(0);
	//   47  107:aload_0         
	//   48  108:getfield        #253 <Field ProgressBar i>
	//   49  111:iconst_0        
	//   50  112:invokevirtual   #134 <Method void ProgressBar.setVisibility(int)>
		m();
	//   51  115:aload_0         
	//   52  116:invokevirtual   #360 <Method void m()>
		finish();
	//   53  119:aload_0         
	//   54  120:invokevirtual   #363 <Method void finish()>
	//   55  123:return          
	}

	public void l()
	{
		d.setClickable(false);
	//    0    0:aload_0         
	//    1    1:getfield        #190 <Field ImageButton d>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #262 <Method void ImageButton.setClickable(boolean)>
		d.startAnimation(((android.view.animation.Animation) (o)));
	//    4    8:aload_0         
	//    5    9:getfield        #190 <Field ImageButton d>
	//    6   12:aload_0         
	//    7   13:getfield        #218 <Field AlphaAnimation o>
	//    8   16:invokevirtual   #258 <Method void ImageButton.startAnimation(android.view.animation.Animation)>
		c.c();
	//    9   19:aload_0         
	//   10   20:getfield        #285 <Field CustomVideoView c>
	//   11   23:invokevirtual   #365 <Method void CustomVideoView.c()>
	//   12   26:return          
	}

	protected void m()
	{
		if(v)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field boolean v>
	//*   2    4:ifeq            91
		{
			com.irobot.home.VideoHelpActivity_.a(((android.content.Context) (this))).b(0x7f0f00aa).c(0x7f0e0214).a(false).a(com.irobot.home.util.j.b(0x7f030000, getResources())).c(true).d(true).b(true).a();
	//    3    7:aload_0         
	//    4    8:invokestatic    #370 <Method VideoHelpActivity_$a com.irobot.home.VideoHelpActivity_.a(android.content.Context)>
	//    5   11:ldc2            #371 <Int 0x7f0f00aa>
	//    6   14:invokevirtual   #376 <Method VideoHelpActivity_$a VideoHelpActivity_$a.b(int)>
	//    7   17:ldc2            #377 <Int 0x7f0e0214>
	//    8   20:invokevirtual   #379 <Method VideoHelpActivity_$a VideoHelpActivity_$a.c(int)>
	//    9   23:iconst_0        
	//   10   24:invokevirtual   #382 <Method VideoHelpActivity_$a com.irobot.home.VideoHelpActivity_$a.a(boolean)>
	//   11   27:ldc2            #383 <Int 0x7f030000>
	//   12   30:aload_0         
	//   13   31:invokevirtual   #146 <Method Resources getResources()>
	//   14   34:invokestatic    #386 <Method ArrayList j.b(int, Resources)>
	//   15   37:invokevirtual   #389 <Method VideoHelpActivity_$a com.irobot.home.VideoHelpActivity_$a.a(ArrayList)>
	//   16   40:iconst_1        
	//   17   41:invokevirtual   #391 <Method VideoHelpActivity_$a VideoHelpActivity_$a.c(boolean)>
	//   18   44:iconst_1        
	//   19   45:invokevirtual   #393 <Method VideoHelpActivity_$a VideoHelpActivity_$a.d(boolean)>
	//   20   48:iconst_1        
	//   21   49:invokevirtual   #395 <Method VideoHelpActivity_$a VideoHelpActivity_$a.b(boolean)>
	//   22   52:invokevirtual   #398 <Method org.androidannotations.api.a.e com.irobot.home.VideoHelpActivity_$a.a()>
	//   23   55:pop             
			Assembler.getInstance().getPersistenceHandler().writeBool("productTourEvacBagMissingSeen", true);
	//   24   56:invokestatic    #109 <Method Assembler Assembler.getInstance()>
	//   25   59:invokevirtual   #402 <Method PersistenceHandler Assembler.getPersistenceHandler()>
	//   26   62:ldc2            #404 <String "productTourEvacBagMissingSeen">
	//   27   65:iconst_1        
	//   28   66:invokevirtual   #410 <Method void PersistenceHandler.writeBool(String, boolean)>
			AssetInfo assetinfo = com.irobot.home.util.j.a(b).a();
	//   29   69:aload_0         
	//   30   70:getfield        #93  <Field String b>
	//   31   73:invokestatic    #98  <Method a j.a(String)>
	//   32   76:invokevirtual   #103 <Method AssetInfo a.a()>
	//   33   79:astore_1        
			AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.EvacDockBagMissingHelpContent, assetinfo);
	//   34   80:invokestatic    #415 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   35   83:getstatic       #421 <Field ViewId ViewId.EvacDockBagMissingHelpContent>
	//   36   86:aload_1         
	//   37   87:invokevirtual   #425 <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, AssetInfo)>
			return;
	//   38   90:return          
		} else
		{
			com.irobot.home.util.j.a(((android.app.Activity) (this)));
	//   39   91:aload_0         
	//   40   92:invokestatic    #428 <Method void j.a(android.app.Activity)>
			return;
	//   41   95:return          
		}
	}

	public void n()
	{
		Assembler.getInstance().getRegistrationService().registerProductWithProductIdAndProductName(z, w);
	//    0    0:invokestatic    #109 <Method Assembler Assembler.getInstance()>
	//    1    3:invokevirtual   #432 <Method RegistrationService Assembler.getRegistrationService()>
	//    2    6:aload_0         
	//    3    7:getfield        #78  <Field String z>
	//    4   10:aload_0         
	//    5   11:getfield        #126 <Field String w>
	//    6   14:invokevirtual   #438 <Method void RegistrationService.registerProductWithProductIdAndProductName(String, String)>
		SettingsUIServiceData settingsuiservicedata = SettingsUIServiceData.create();
	//    7   17:invokestatic    #444 <Method SettingsUIServiceData SettingsUIServiceData.create()>
	//    8   20:astore_1        
		settingsuiservicedata.setBooleanSetting(SettingType.Registered, true);
	//    9   21:aload_1         
	//   10   22:getstatic       #450 <Field SettingType SettingType.Registered>
	//   11   25:iconst_1        
	//   12   26:invokevirtual   #454 <Method void SettingsUIServiceData.setBooleanSetting(SettingType, boolean)>
		x.sendCommand(SettingsUIServiceCommand.UpdateSetting, settingsuiservicedata);
	//   13   29:aload_0         
	//   14   30:getfield        #250 <Field SettingsSubsystem x>
	//   15   33:getstatic       #460 <Field SettingsUIServiceCommand SettingsUIServiceCommand.UpdateSetting>
	//   16   36:aload_1         
	//   17   37:invokevirtual   #466 <Method void SettingsSubsystem.sendCommand(SettingsUIServiceCommand, SettingsUIServiceData)>
	//   18   40:return          
	}

	public void onBackPressed()
	{
	//    0    0:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #470 <Method void BaseFragmentActivity.onStart()>
		f();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #472 <Method void f()>
		t.registerUISubscriber(((MissionUIServiceDataCallback) (u)));
	//    4    8:aload_0         
	//    5    9:getfield        #65  <Field MissionSubsystem t>
	//    6   12:aload_0         
	//    7   13:getfield        #70  <Field CustomerRegistrationActivity$a u>
	//    8   16:invokevirtual   #478 <Method boolean MissionSubsystem.registerUISubscriber(MissionUIServiceDataCallback)>
	//    9   19:pop             
		x.registerUISubscriber(y);
	//   10   20:aload_0         
	//   11   21:getfield        #250 <Field SettingsSubsystem x>
	//   12   24:aload_0         
	//   13   25:getfield        #75  <Field SettingsUIServiceDataCallback y>
	//   14   28:invokevirtual   #481 <Method boolean SettingsSubsystem.registerUISubscriber(SettingsUIServiceDataCallback)>
	//   15   31:pop             
	//   16   32:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #484 <Method void BaseFragmentActivity.onStop()>
		t.unregisterSubscriber(((MissionUIServiceDataCallback) (u)));
	//    2    4:aload_0         
	//    3    5:getfield        #65  <Field MissionSubsystem t>
	//    4    8:aload_0         
	//    5    9:getfield        #70  <Field CustomerRegistrationActivity$a u>
	//    6   12:invokevirtual   #487 <Method boolean MissionSubsystem.unregisterSubscriber(MissionUIServiceDataCallback)>
	//    7   15:pop             
		x.unregisterSubscriber(y);
	//    8   16:aload_0         
	//    9   17:getfield        #250 <Field SettingsSubsystem x>
	//   10   20:aload_0         
	//   11   21:getfield        #75  <Field SettingsUIServiceDataCallback y>
	//   12   24:invokevirtual   #489 <Method boolean SettingsSubsystem.unregisterSubscriber(SettingsUIServiceDataCallback)>
	//   13   27:pop             
	//   14   28:return          
	}

	private static final String l = "CustomerRegistrationActivity";
	private boolean A;
	CustomerCareRestClient a;
	String b;
	CustomVideoView c;
	ImageButton d;
	LinearLayout e;
	LinearLayout f;
	EditText g;
	Button h;
	ProgressBar i;
	IRobotApplication j;
	ProgressBar k;
	private final double m = 0.5D;
	private AlphaAnimation n;
	private AlphaAnimation o;
	private MissionSubsystem t;
	private a u;
	private boolean v;
	private String w;
	private SettingsSubsystem x;
	private SettingsUIServiceDataCallback y;
	private String z;

	static 
	{
	//    0    0:return          
	}
}
