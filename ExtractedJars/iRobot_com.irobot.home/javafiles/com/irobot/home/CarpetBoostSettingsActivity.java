// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.Intent;
import android.widget.CheckedTextView;
import android.widget.RelativeLayout;
import com.irobot.core.*;
import com.irobot.home.model.a;
import com.irobot.home.util.e;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import java.util.*;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity

public class CarpetBoostSettingsActivity extends BaseFragmentActivity
{
	private class a extends SettingsUIServiceDataCallback
	{

		public void onSettingsUIServiceDataChanged(SettingsUIServiceData settingsuiservicedata)
		{
			if(settingsuiservicedata == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       13
			{
				o.d(com.irobot.home.CarpetBoostSettingsActivity.j(), "Service data was null.");
		//    2    4:invokestatic    #25  <Method String com.irobot.home.CarpetBoostSettingsActivity.j()>
		//    3    7:ldc1            #27  <String "Service data was null.">
		//    4    9:invokestatic    #33  <Method void o.d(String, String)>
				return;
		//    5   12:return          
			}
			Iterator iterator = settingsuiservicedata.getSettingsChangeList().iterator();
		//    6   13:aload_1         
		//    7   14:invokevirtual   #39  <Method HashSet SettingsUIServiceData.getSettingsChangeList()>
		//    8   17:invokevirtual   #45  <Method Iterator HashSet.iterator()>
		//    9   20:astore          6
			do
			{
				if(iterator.hasNext())
		//*  10   22:aload           6
		//*  11   24:invokeinterface #51  <Method boolean Iterator.hasNext()>
		//*  12   29:ifeq            116
				{
					SettingType settingtype = (SettingType)iterator.next();
		//   13   32:aload           6
		//   14   34:invokeinterface #55  <Method Object Iterator.next()>
		//   15   39:checkcast       #57  <Class SettingType>
		//   16   42:astore          7
					static class _cls1
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
								b[SettingType.CarpetBoost.ordinal()] = 1;
						//    4    9:getstatic       #21  <Field int[] b>
						//    5   12:getstatic       #25  <Field SettingType SettingType.CarpetBoost>
						//    6   15:invokevirtual   #29  <Method int SettingType.ordinal()>
						//    7   18:iconst_1        
						//    8   19:iastore         
							}
						//*   9   20:getstatic       #21  <Field int[] b>
						//*  10   23:getstatic       #32  <Field SettingType SettingType.CarpetBoostModesAvailable>
						//*  11   26:invokevirtual   #29  <Method int SettingType.ordinal()>
						//*  12   29:iconst_2        
						//*  13   30:iastore         
						//*  14   31:invokestatic    #37  <Method CarpetBoostMode[] CarpetBoostMode.values()>
						//*  15   34:arraylength     
						//*  16   35:newarray        int[]
						//*  17   37:putstatic       #39  <Field int[] a>
						//*  18   40:getstatic       #39  <Field int[] a>
						//*  19   43:getstatic       #43  <Field CarpetBoostMode CarpetBoostMode.Auto>
						//*  20   46:invokevirtual   #44  <Method int CarpetBoostMode.ordinal()>
						//*  21   49:iconst_1        
						//*  22   50:iastore         
						//*  23   51:getstatic       #39  <Field int[] a>
						//*  24   54:getstatic       #47  <Field CarpetBoostMode CarpetBoostMode.Eco>
						//*  25   57:invokevirtual   #44  <Method int CarpetBoostMode.ordinal()>
						//*  26   60:iconst_2        
						//*  27   61:iastore         
						//*  28   62:getstatic       #39  <Field int[] a>
						//*  29   65:getstatic       #50  <Field CarpetBoostMode CarpetBoostMode.Performance>
						//*  30   68:invokevirtual   #44  <Method int CarpetBoostMode.ordinal()>
						//*  31   71:iconst_3        
						//*  32   72:iastore         
						//*  33   73:return          
							catch(NoSuchFieldError nosuchfielderror) { }
						//   34   74:astore_0        
							try
							{
								b[SettingType.CarpetBoostModesAvailable.ordinal()] = 2;
							}
						//*  35   75:goto            20
							catch(NoSuchFieldError nosuchfielderror1) { }
						//   36   78:astore_0        
							a = new int[CarpetBoostMode.values().length];
							try
							{
								a[CarpetBoostMode.Auto.ordinal()] = 1;
							}
						//*  37   79:goto            31
							catch(NoSuchFieldError nosuchfielderror2) { }
						//   38   82:astore_0        
							try
							{
								a[CarpetBoostMode.Eco.ordinal()] = 2;
							}
						//*  39   83:goto            51
							catch(NoSuchFieldError nosuchfielderror3) { }
						//   40   86:astore_0        
							try
							{
								a[CarpetBoostMode.Performance.ordinal()] = 3;
							}
						//*  41   87:goto            62
							catch(NoSuchFieldError nosuchfielderror4) { }
						//   42   90:astore_0        
						//*  43   91:return          
						}
					}

					switch(_cls1.b[settingtype.ordinal()])
		//*  17   44:getstatic       #63  <Field int[] CarpetBoostSettingsActivity$1.b>
		//*  18   47:aload           7
		//*  19   49:invokevirtual   #67  <Method int SettingType.ordinal()>
		//*  20   52:iaload          
					{
		//*  21   53:tableswitch     1 2: default 76
		//		               1 94
		//		               2 79
		//*  22   76:goto            22
					case 2: // '\002'
						com.irobot.home.CarpetBoostSettingsActivity.a(a, settingsuiservicedata.getCarpetBoostModes());
		//   23   79:aload_0         
		//   24   80:getfield        #12  <Field CarpetBoostSettingsActivity a>
		//   25   83:aload_1         
		//   26   84:invokevirtual   #71  <Method ArrayList SettingsUIServiceData.getCarpetBoostModes()>
		//   27   87:invokestatic    #74  <Method ArrayList com.irobot.home.CarpetBoostSettingsActivity.a(CarpetBoostSettingsActivity, ArrayList)>
		//   28   90:pop             
						break;

		//*  29   91:goto            22
					case 1: // '\001'
						com.irobot.home.CarpetBoostSettingsActivity.a(a, CarpetBoostMode.values()[settingsuiservicedata.getIntegerSetting(SettingType.CarpetBoost)]);
		//   30   94:aload_0         
		//   31   95:getfield        #12  <Field CarpetBoostSettingsActivity a>
		//   32   98:invokestatic    #80  <Method CarpetBoostMode[] CarpetBoostMode.values()>
		//   33  101:aload_1         
		//   34  102:getstatic       #84  <Field SettingType SettingType.CarpetBoost>
		//   35  105:invokevirtual   #88  <Method int SettingsUIServiceData.getIntegerSetting(SettingType)>
		//   36  108:aaload          
		//   37  109:invokestatic    #91  <Method CarpetBoostMode com.irobot.home.CarpetBoostSettingsActivity.a(CarpetBoostSettingsActivity, CarpetBoostMode)>
		//   38  112:pop             
						break;
					}
					continue;
		//   39  113:goto            22
				}
				settingsuiservicedata = ((SettingsUIServiceData) (settingsuiservicedata.getAvailableSettings()));
		//   40  116:aload_1         
		//   41  117:invokevirtual   #94  <Method HashSet SettingsUIServiceData.getAvailableSettings()>
		//   42  120:astore_1        
				boolean flag3 = ((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.CarpetBoost)));
		//   43  121:aload_1         
		//   44  122:getstatic       #84  <Field SettingType SettingType.CarpetBoost>
		//   45  125:invokevirtual   #98  <Method boolean HashSet.contains(Object)>
		//   46  128:istore          5
				boolean flag2 = false;
		//   47  130:iconst_0        
		//   48  131:istore          4
				boolean flag;
				if(flag3 && ((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.CarpetBoostModesAvailable))))
		//*  49  133:iload           5
		//*  50  135:ifeq            153
		//*  51  138:aload_1         
		//*  52  139:getstatic       #101 <Field SettingType SettingType.CarpetBoostModesAvailable>
		//*  53  142:invokevirtual   #98  <Method boolean HashSet.contains(Object)>
		//*  54  145:ifeq            153
					flag = true;
		//   55  148:iconst_1        
		//   56  149:istore_2        
				else
		//*  57  150:goto            155
					flag = false;
		//   58  153:iconst_0        
		//   59  154:istore_2        
				boolean flag1 = flag2;
		//   60  155:iload           4
		//   61  157:istore_3        
				if(com.irobot.home.CarpetBoostSettingsActivity.a(a) != null)
		//*  62  158:aload_0         
		//*  63  159:getfield        #12  <Field CarpetBoostSettingsActivity a>
		//*  64  162:invokestatic    #104 <Method CarpetBoostMode com.irobot.home.CarpetBoostSettingsActivity.a(CarpetBoostSettingsActivity)>
		//*  65  165:ifnull          183
				{
					flag1 = flag2;
		//   66  168:iload           4
		//   67  170:istore_3        
					if(CarpetBoostSettingsActivity.b(a) != null)
		//*  68  171:aload_0         
		//*  69  172:getfield        #12  <Field CarpetBoostSettingsActivity a>
		//*  70  175:invokestatic    #107 <Method ArrayList CarpetBoostSettingsActivity.b(CarpetBoostSettingsActivity)>
		//*  71  178:ifnull          183
						flag1 = true;
		//   72  181:iconst_1        
		//   73  182:istore_3        
				}
				if(flag && flag1)
		//*  74  183:iload_2         
		//*  75  184:ifeq            212
		//*  76  187:iload_3         
		//*  77  188:ifeq            212
					a.a(CarpetBoostSettingsActivity.b(a), com.irobot.home.CarpetBoostSettingsActivity.a(a));
		//   78  191:aload_0         
		//   79  192:getfield        #12  <Field CarpetBoostSettingsActivity a>
		//   80  195:aload_0         
		//   81  196:getfield        #12  <Field CarpetBoostSettingsActivity a>
		//   82  199:invokestatic    #107 <Method ArrayList CarpetBoostSettingsActivity.b(CarpetBoostSettingsActivity)>
		//   83  202:aload_0         
		//   84  203:getfield        #12  <Field CarpetBoostSettingsActivity a>
		//   85  206:invokestatic    #104 <Method CarpetBoostMode com.irobot.home.CarpetBoostSettingsActivity.a(CarpetBoostSettingsActivity)>
		//   86  209:invokevirtual   #110 <Method void com.irobot.home.CarpetBoostSettingsActivity.a(ArrayList, CarpetBoostMode)>
				break;
			} while(true);
		//   87  212:return          
		}

		final CarpetBoostSettingsActivity a;

		private a()
		{
			a = CarpetBoostSettingsActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field CarpetBoostSettingsActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void SettingsUIServiceDataCallback()>
		//    5    9:return          
		}

	}


	public CarpetBoostSettingsActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void BaseFragmentActivity()>
		l = ((SettingsUIServiceDataCallback) (new a(((_cls1) (null)))));
	//    2    4:aload_0         
	//    3    5:new             #8   <Class CarpetBoostSettingsActivity$a>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #55  <Method void CarpetBoostSettingsActivity$a(CarpetBoostSettingsActivity, CarpetBoostSettingsActivity$1)>
	//    8   14:putfield        #57  <Field SettingsUIServiceDataCallback l>
		m = null;
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:putfield        #59  <Field ArrayList m>
		n = null;
	//   12   22:aload_0         
	//   13   23:aconst_null     
	//   14   24:putfield        #61  <Field CarpetBoostMode n>
	//   15   27:return          
	}

	static CarpetBoostMode a(CarpetBoostSettingsActivity carpetboostsettingsactivity)
	{
		return carpetboostsettingsactivity.n;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field CarpetBoostMode n>
	//    2    4:areturn         
	}

	static CarpetBoostMode a(CarpetBoostSettingsActivity carpetboostsettingsactivity, CarpetBoostMode carpetboostmode)
	{
		carpetboostsettingsactivity.n = carpetboostmode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #61  <Field CarpetBoostMode n>
		return carpetboostmode;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static ArrayList a(CarpetBoostSettingsActivity carpetboostsettingsactivity, ArrayList arraylist)
	{
		carpetboostsettingsactivity.m = arraylist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #59  <Field ArrayList m>
		return arraylist;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private void a(CarpetBoostMode carpetboostmode)
	{
label0:
		{
			b(carpetboostmode);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void b(CarpetBoostMode)>
			if(j)
	//*   3    5:aload_0         
	//*   4    6:getfield        #69  <Field boolean j>
	//*   5    9:ifeq            13
				return;
	//    6   12:return          
			AnalyticsSubsystem analyticssubsystem;
			AssetInfo assetinfo;
			CarpetBoostMode carpetboostmode1;
			switch(com.irobot.home._cls1.a[carpetboostmode.ordinal()])
	//*   7   13:getstatic       #72  <Field int[] com.irobot.home.CarpetBoostSettingsActivity$1.a>
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #78  <Method int CarpetBoostMode.ordinal()>
	//*  10   20:iaload          
			{
	//*  11   21:tableswitch     1 3: default 48
	//	               1 85
	//	               2 68
	//	               3 51
			default:
				break label0;
	//   12   48:goto            106

			case 3: // '\003'
				analyticssubsystem = AnalyticsSubsystem.getInstance();
	//   13   51:invokestatic    #84  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   14   54:astore_2        
				assetinfo = i;
	//   15   55:aload_0         
	//   16   56:getfield        #86  <Field AssetInfo i>
	//   17   59:astore_3        
				carpetboostmode1 = CarpetBoostMode.Performance;
	//   18   60:getstatic       #89  <Field CarpetBoostMode CarpetBoostMode.Performance>
	//   19   63:astore          4
				break;
	//   20   65:goto            99

			case 2: // '\002'
				analyticssubsystem = AnalyticsSubsystem.getInstance();
	//   21   68:invokestatic    #84  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   22   71:astore_2        
				assetinfo = i;
	//   23   72:aload_0         
	//   24   73:getfield        #86  <Field AssetInfo i>
	//   25   76:astore_3        
				carpetboostmode1 = CarpetBoostMode.Eco;
	//   26   77:getstatic       #92  <Field CarpetBoostMode CarpetBoostMode.Eco>
	//   27   80:astore          4
				break;
	//   28   82:goto            99

			case 1: // '\001'
				analyticssubsystem = AnalyticsSubsystem.getInstance();
	//   29   85:invokestatic    #84  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   30   88:astore_2        
				assetinfo = i;
	//   31   89:aload_0         
	//   32   90:getfield        #86  <Field AssetInfo i>
	//   33   93:astore_3        
				carpetboostmode1 = CarpetBoostMode.Auto;
	//   34   94:getstatic       #95  <Field CarpetBoostMode CarpetBoostMode.Auto>
	//   35   97:astore          4
				break;
			}
			analyticssubsystem.trackCarpetBoostSettingChanged(assetinfo, carpetboostmode1);
	//   36   99:aload_2         
	//   37  100:aload_3         
	//   38  101:aload           4
	//   39  103:invokevirtual   #99  <Method void AnalyticsSubsystem.trackCarpetBoostSettingChanged(AssetInfo, CarpetBoostMode)>
		}
		SettingsUIServiceData settingsuiservicedata = SettingsUIServiceData.create();
	//   40  106:invokestatic    #105 <Method SettingsUIServiceData SettingsUIServiceData.create()>
	//   41  109:astore_2        
		settingsuiservicedata.setIntegerSetting(SettingType.CarpetBoost, carpetboostmode.ordinal());
	//   42  110:aload_2         
	//   43  111:getstatic       #111 <Field SettingType SettingType.CarpetBoost>
	//   44  114:aload_1         
	//   45  115:invokevirtual   #78  <Method int CarpetBoostMode.ordinal()>
	//   46  118:invokevirtual   #115 <Method void SettingsUIServiceData.setIntegerSetting(SettingType, int)>
		k.sendCommand(SettingsUIServiceCommand.SetCleaningPreference, settingsuiservicedata);
	//   47  121:aload_0         
	//   48  122:getfield        #117 <Field SettingsSubsystem k>
	//   49  125:getstatic       #123 <Field SettingsUIServiceCommand SettingsUIServiceCommand.SetCleaningPreference>
	//   50  128:aload_2         
	//   51  129:invokevirtual   #129 <Method void SettingsSubsystem.sendCommand(SettingsUIServiceCommand, SettingsUIServiceData)>
	//   52  132:return          
	}

	static ArrayList b(CarpetBoostSettingsActivity carpetboostsettingsactivity)
	{
		return carpetboostsettingsactivity.m;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field ArrayList m>
	//    2    4:areturn         
	}

	private void b(CarpetBoostMode carpetboostmode)
	{
		f.setChecked(carpetboostmode.equals(((Object) (CarpetBoostMode.Performance))));
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field CheckedTextView f>
	//    2    4:aload_1         
	//    3    5:getstatic       #89  <Field CarpetBoostMode CarpetBoostMode.Performance>
	//    4    8:invokevirtual   #136 <Method boolean CarpetBoostMode.equals(Object)>
	//    5   11:invokevirtual   #142 <Method void CheckedTextView.setChecked(boolean)>
		g.setChecked(carpetboostmode.equals(((Object) (CarpetBoostMode.Eco))));
	//    6   14:aload_0         
	//    7   15:getfield        #144 <Field CheckedTextView g>
	//    8   18:aload_1         
	//    9   19:getstatic       #92  <Field CarpetBoostMode CarpetBoostMode.Eco>
	//   10   22:invokevirtual   #136 <Method boolean CarpetBoostMode.equals(Object)>
	//   11   25:invokevirtual   #142 <Method void CheckedTextView.setChecked(boolean)>
		e.setChecked(carpetboostmode.equals(((Object) (CarpetBoostMode.Auto))));
	//   12   28:aload_0         
	//   13   29:getfield        #146 <Field CheckedTextView e>
	//   14   32:aload_1         
	//   15   33:getstatic       #95  <Field CarpetBoostMode CarpetBoostMode.Auto>
	//   16   36:invokevirtual   #136 <Method boolean CarpetBoostMode.equals(Object)>
	//   17   39:invokevirtual   #142 <Method void CheckedTextView.setChecked(boolean)>
	//   18   42:return          
	}

	static String j()
	{
		return h;
	//    0    0:getstatic       #48  <Field String h>
	//    1    3:areturn         
	}

	public void a(ArrayList arraylist, CarpetBoostMode carpetboostmode)
	{
		if(arraylist.contains(((Object) (CarpetBoostMode.Auto))))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #95  <Field CarpetBoostMode CarpetBoostMode.Auto>
	//*   2    4:invokevirtual   #152 <Method boolean ArrayList.contains(Object)>
	//*   3    7:ifeq            40
		{
			e = ((CheckedTextView) (com.irobot.home.util.j.b(b, getString(0x7f0f0189))));
	//    4   10:aload_0         
	//    5   11:aload_0         
	//    6   12:getfield        #154 <Field RelativeLayout b>
	//    7   15:aload_0         
	//    8   16:ldc1            #155 <Int 0x7f0f0189>
	//    9   18:invokevirtual   #159 <Method String getString(int)>
	//   10   21:invokestatic    #162 <Method com.irobot.home.view.CustomCheckedTextView j.b(RelativeLayout, String)>
	//   11   24:putfield        #146 <Field CheckedTextView e>
			com.irobot.home.util.j.a(b, getString(0x7f0f018a));
	//   12   27:aload_0         
	//   13   28:getfield        #154 <Field RelativeLayout b>
	//   14   31:aload_0         
	//   15   32:ldc1            #163 <Int 0x7f0f018a>
	//   16   34:invokevirtual   #159 <Method String getString(int)>
	//   17   37:invokestatic    #166 <Method void j.a(RelativeLayout, String)>
		}
		if(arraylist.contains(((Object) (CarpetBoostMode.Performance))))
	//*  18   40:aload_1         
	//*  19   41:getstatic       #89  <Field CarpetBoostMode CarpetBoostMode.Performance>
	//*  20   44:invokevirtual   #152 <Method boolean ArrayList.contains(Object)>
	//*  21   47:ifeq            80
		{
			f = ((CheckedTextView) (com.irobot.home.util.j.b(c, getString(0x7f0f018e))));
	//   22   50:aload_0         
	//   23   51:aload_0         
	//   24   52:getfield        #168 <Field RelativeLayout c>
	//   25   55:aload_0         
	//   26   56:ldc1            #169 <Int 0x7f0f018e>
	//   27   58:invokevirtual   #159 <Method String getString(int)>
	//   28   61:invokestatic    #162 <Method com.irobot.home.view.CustomCheckedTextView j.b(RelativeLayout, String)>
	//   29   64:putfield        #132 <Field CheckedTextView f>
			com.irobot.home.util.j.a(c, getString(0x7f0f018f));
	//   30   67:aload_0         
	//   31   68:getfield        #168 <Field RelativeLayout c>
	//   32   71:aload_0         
	//   33   72:ldc1            #170 <Int 0x7f0f018f>
	//   34   74:invokevirtual   #159 <Method String getString(int)>
	//   35   77:invokestatic    #166 <Method void j.a(RelativeLayout, String)>
		}
		if(arraylist.contains(((Object) (CarpetBoostMode.Eco))))
	//*  36   80:aload_1         
	//*  37   81:getstatic       #92  <Field CarpetBoostMode CarpetBoostMode.Eco>
	//*  38   84:invokevirtual   #152 <Method boolean ArrayList.contains(Object)>
	//*  39   87:ifeq            120
		{
			g = ((CheckedTextView) (com.irobot.home.util.j.b(d, getString(0x7f0f018b))));
	//   40   90:aload_0         
	//   41   91:aload_0         
	//   42   92:getfield        #172 <Field RelativeLayout d>
	//   43   95:aload_0         
	//   44   96:ldc1            #173 <Int 0x7f0f018b>
	//   45   98:invokevirtual   #159 <Method String getString(int)>
	//   46  101:invokestatic    #162 <Method com.irobot.home.view.CustomCheckedTextView j.b(RelativeLayout, String)>
	//   47  104:putfield        #144 <Field CheckedTextView g>
			com.irobot.home.util.j.a(d, getString(0x7f0f018c));
	//   48  107:aload_0         
	//   49  108:getfield        #172 <Field RelativeLayout d>
	//   50  111:aload_0         
	//   51  112:ldc1            #174 <Int 0x7f0f018c>
	//   52  114:invokevirtual   #159 <Method String getString(int)>
	//   53  117:invokestatic    #166 <Method void j.a(RelativeLayout, String)>
		}
		j = true;
	//   54  120:aload_0         
	//   55  121:iconst_1        
	//   56  122:putfield        #69  <Field boolean j>
		b(carpetboostmode);
	//   57  125:aload_0         
	//   58  126:aload_2         
	//   59  127:invokespecial   #67  <Method void b(CarpetBoostMode)>
		j = false;
	//   60  130:aload_0         
	//   61  131:iconst_0        
	//   62  132:putfield        #69  <Field boolean j>
	//   63  135:return          
	}

	void e()
	{
		b(0x7f0f08c5);
	//    0    0:aload_0         
	//    1    1:ldc1            #177 <Int 0x7f0f08c5>
	//    2    3:invokevirtual   #180 <Method void b(int)>
		i = com.irobot.home.util.j.a(a).a();
	//    3    6:aload_0         
	//    4    7:aload_0         
	//    5    8:getfield        #182 <Field String a>
	//    6   11:invokestatic    #185 <Method a j.a(String)>
	//    7   14:invokevirtual   #190 <Method AssetInfo a.a()>
	//    8   17:putfield        #86  <Field AssetInfo i>
		k = Assembler.getInstance().getSettingsSubsystem(i.getAssetId());
	//    9   20:aload_0         
	//   10   21:invokestatic    #195 <Method Assembler Assembler.getInstance()>
	//   11   24:aload_0         
	//   12   25:getfield        #86  <Field AssetInfo i>
	//   13   28:invokevirtual   #201 <Method com.irobot.core.AssetId AssetInfo.getAssetId()>
	//   14   31:invokevirtual   #205 <Method SettingsSubsystem Assembler.getSettingsSubsystem(com.irobot.core.AssetId)>
	//   15   34:putfield        #117 <Field SettingsSubsystem k>
		AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.CarpetBoostSetting, i);
	//   16   37:invokestatic    #84  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   17   40:getstatic       #211 <Field ViewId ViewId.CarpetBoostSetting>
	//   18   43:aload_0         
	//   19   44:getfield        #86  <Field AssetInfo i>
	//   20   47:invokevirtual   #215 <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, AssetInfo)>
	//   21   50:return          
	}

	void f()
	{
		a(CarpetBoostMode.Auto);
	//    0    0:aload_0         
	//    1    1:getstatic       #95  <Field CarpetBoostMode CarpetBoostMode.Auto>
	//    2    4:invokespecial   #217 <Method void a(CarpetBoostMode)>
	//    3    7:return          
	}

	void g()
	{
		a(CarpetBoostMode.Performance);
	//    0    0:aload_0         
	//    1    1:getstatic       #89  <Field CarpetBoostMode CarpetBoostMode.Performance>
	//    2    4:invokespecial   #217 <Method void a(CarpetBoostMode)>
	//    3    7:return          
	}

	void h()
	{
		a(CarpetBoostMode.Eco);
	//    0    0:aload_0         
	//    1    1:getstatic       #92  <Field CarpetBoostMode CarpetBoostMode.Eco>
	//    2    4:invokespecial   #217 <Method void a(CarpetBoostMode)>
	//    3    7:return          
	}

	CarpetBoostMode i()
	{
		if(f != null && f.isChecked())
	//*   0    0:aload_0         
	//*   1    1:getfield        #132 <Field CheckedTextView f>
	//*   2    4:ifnull          21
	//*   3    7:aload_0         
	//*   4    8:getfield        #132 <Field CheckedTextView f>
	//*   5   11:invokevirtual   #222 <Method boolean CheckedTextView.isChecked()>
	//*   6   14:ifeq            21
			return CarpetBoostMode.Performance;
	//    7   17:getstatic       #89  <Field CarpetBoostMode CarpetBoostMode.Performance>
	//    8   20:areturn         
		if(g != null && g.isChecked())
	//*   9   21:aload_0         
	//*  10   22:getfield        #144 <Field CheckedTextView g>
	//*  11   25:ifnull          42
	//*  12   28:aload_0         
	//*  13   29:getfield        #144 <Field CheckedTextView g>
	//*  14   32:invokevirtual   #222 <Method boolean CheckedTextView.isChecked()>
	//*  15   35:ifeq            42
			return CarpetBoostMode.Eco;
	//   16   38:getstatic       #92  <Field CarpetBoostMode CarpetBoostMode.Eco>
	//   17   41:areturn         
		if(e != null && e.isChecked())
	//*  18   42:aload_0         
	//*  19   43:getfield        #146 <Field CheckedTextView e>
	//*  20   46:ifnull          63
	//*  21   49:aload_0         
	//*  22   50:getfield        #146 <Field CheckedTextView e>
	//*  23   53:invokevirtual   #222 <Method boolean CheckedTextView.isChecked()>
	//*  24   56:ifeq            63
			return CarpetBoostMode.Auto;
	//   25   59:getstatic       #95  <Field CarpetBoostMode CarpetBoostMode.Auto>
	//   26   62:areturn         
		else
			return null;
	//   27   63:aconst_null     
	//   28   64:areturn         
	}

	public void onBackPressed()
	{
		Intent intent = new Intent();
	//    0    0:new             #225 <Class Intent>
	//    1    3:dup             
	//    2    4:invokespecial   #226 <Method void Intent()>
	//    3    7:astore_1        
		com.irobot.home.util.e.a(((Enum) (i()))).b(intent);
	//    4    8:aload_0         
	//    5    9:invokevirtual   #228 <Method CarpetBoostMode i()>
	//    6   12:invokestatic    #233 <Method com.irobot.home.util.e$b e.a(Enum)>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #238 <Method void com.irobot.home.util.e$b.b(Intent)>
		setResult(0, intent);
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:aload_1         
	//   12   22:invokevirtual   #242 <Method void setResult(int, Intent)>
		finish();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #245 <Method void finish()>
	//   15   29:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #248 <Method void BaseFragmentActivity.onStart()>
		k.registerUISubscriber(l);
	//    2    4:aload_0         
	//    3    5:getfield        #117 <Field SettingsSubsystem k>
	//    4    8:aload_0         
	//    5    9:getfield        #57  <Field SettingsUIServiceDataCallback l>
	//    6   12:invokevirtual   #252 <Method boolean SettingsSubsystem.registerUISubscriber(SettingsUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #255 <Method void BaseFragmentActivity.onStop()>
		k.unregisterSubscriber(l);
	//    2    4:aload_0         
	//    3    5:getfield        #117 <Field SettingsSubsystem k>
	//    4    8:aload_0         
	//    5    9:getfield        #57  <Field SettingsUIServiceDataCallback l>
	//    6   12:invokevirtual   #258 <Method boolean SettingsSubsystem.unregisterSubscriber(SettingsUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	private static final String h = com.irobot.home.util.j.r(((Class) (com/irobot/home/CarpetBoostSettingsActivity)).getSimpleName());
	String a;
	RelativeLayout b;
	RelativeLayout c;
	RelativeLayout d;
	CheckedTextView e;
	CheckedTextView f;
	CheckedTextView g;
	private AssetInfo i;
	private boolean j;
	private SettingsSubsystem k;
	private SettingsUIServiceDataCallback l;
	private ArrayList m;
	private CarpetBoostMode n;

	static 
	{
	//    0    0:ldc1            #2   <Class CarpetBoostSettingsActivity>
	//    1    2:invokevirtual   #40  <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #46  <Method String j.r(String)>
	//    3    8:putstatic       #48  <Field String h>
	//*   4   11:return          
	}
}
