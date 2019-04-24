// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.widget.*;
import com.irobot.core.*;
import com.irobot.home.model.a;
import com.irobot.home.util.e;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import java.util.*;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity

public class CleaningPassSettingsActivity extends BaseFragmentActivity
{
	private class a extends SettingsUIServiceDataCallback
	{

		public void onSettingsUIServiceDataChanged(SettingsUIServiceData settingsuiservicedata)
		{
			if(settingsuiservicedata == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       13
			{
				com.irobot.home.util.o.d(CleaningPassSettingsActivity.i(), "Service data was null.");
		//    2    4:invokestatic    #25  <Method String CleaningPassSettingsActivity.i()>
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
								b[SettingType.MultiPass.ordinal()] = 1;
						//    4    9:getstatic       #21  <Field int[] b>
						//    5   12:getstatic       #25  <Field SettingType SettingType.MultiPass>
						//    6   15:invokevirtual   #29  <Method int SettingType.ordinal()>
						//    7   18:iconst_1        
						//    8   19:iastore         
							}
						//*   9   20:getstatic       #21  <Field int[] b>
						//*  10   23:getstatic       #32  <Field SettingType SettingType.MultiPassModesAvailable>
						//*  11   26:invokevirtual   #29  <Method int SettingType.ordinal()>
						//*  12   29:iconst_2        
						//*  13   30:iastore         
						//*  14   31:invokestatic    #37  <Method MultiPassMode[] MultiPassMode.values()>
						//*  15   34:arraylength     
						//*  16   35:newarray        int[]
						//*  17   37:putstatic       #39  <Field int[] a>
						//*  18   40:getstatic       #39  <Field int[] a>
						//*  19   43:getstatic       #43  <Field MultiPassMode MultiPassMode.Auto>
						//*  20   46:invokevirtual   #44  <Method int MultiPassMode.ordinal()>
						//*  21   49:iconst_1        
						//*  22   50:iastore         
						//*  23   51:getstatic       #39  <Field int[] a>
						//*  24   54:getstatic       #47  <Field MultiPassMode MultiPassMode.One>
						//*  25   57:invokevirtual   #44  <Method int MultiPassMode.ordinal()>
						//*  26   60:iconst_2        
						//*  27   61:iastore         
						//*  28   62:getstatic       #39  <Field int[] a>
						//*  29   65:getstatic       #50  <Field MultiPassMode MultiPassMode.Two>
						//*  30   68:invokevirtual   #44  <Method int MultiPassMode.ordinal()>
						//*  31   71:iconst_3        
						//*  32   72:iastore         
						//*  33   73:return          
							catch(NoSuchFieldError nosuchfielderror) { }
						//   34   74:astore_0        
							try
							{
								b[SettingType.MultiPassModesAvailable.ordinal()] = 2;
							}
						//*  35   75:goto            20
							catch(NoSuchFieldError nosuchfielderror1) { }
						//   36   78:astore_0        
							a = new int[MultiPassMode.values().length];
							try
							{
								a[MultiPassMode.Auto.ordinal()] = 1;
							}
						//*  37   79:goto            31
							catch(NoSuchFieldError nosuchfielderror2) { }
						//   38   82:astore_0        
							try
							{
								a[MultiPassMode.One.ordinal()] = 2;
							}
						//*  39   83:goto            51
							catch(NoSuchFieldError nosuchfielderror3) { }
						//   40   86:astore_0        
							try
							{
								a[MultiPassMode.Two.ordinal()] = 3;
							}
						//*  41   87:goto            62
							catch(NoSuchFieldError nosuchfielderror4) { }
						//   42   90:astore_0        
						//*  43   91:return          
						}
					}

					switch(_cls2.b[settingtype.ordinal()])
		//*  17   44:getstatic       #63  <Field int[] CleaningPassSettingsActivity$2.b>
		//*  18   47:aload           7
		//*  19   49:invokevirtual   #67  <Method int SettingType.ordinal()>
		//*  20   52:iaload          
					{
		//*  21   53:tableswitch     1 2: default 76
		//		               1 94
		//		               2 79
		//*  22   76:goto            22
					case 2: // '\002'
						com.irobot.home.CleaningPassSettingsActivity.a(a, settingsuiservicedata.getMultiPassModes());
		//   23   79:aload_0         
		//   24   80:getfield        #12  <Field CleaningPassSettingsActivity a>
		//   25   83:aload_1         
		//   26   84:invokevirtual   #71  <Method ArrayList SettingsUIServiceData.getMultiPassModes()>
		//   27   87:invokestatic    #74  <Method ArrayList com.irobot.home.CleaningPassSettingsActivity.a(CleaningPassSettingsActivity, ArrayList)>
		//   28   90:pop             
						break;

		//*  29   91:goto            22
					case 1: // '\001'
						CleaningPassSettingsActivity.b(a, MultiPassMode.values()[settingsuiservicedata.getIntegerSetting(SettingType.MultiPass)]);
		//   30   94:aload_0         
		//   31   95:getfield        #12  <Field CleaningPassSettingsActivity a>
		//   32   98:invokestatic    #80  <Method MultiPassMode[] MultiPassMode.values()>
		//   33  101:aload_1         
		//   34  102:getstatic       #84  <Field SettingType SettingType.MultiPass>
		//   35  105:invokevirtual   #88  <Method int SettingsUIServiceData.getIntegerSetting(SettingType)>
		//   36  108:aaload          
		//   37  109:invokestatic    #91  <Method MultiPassMode CleaningPassSettingsActivity.b(CleaningPassSettingsActivity, MultiPassMode)>
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
				boolean flag3 = ((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.MultiPass)));
		//   43  121:aload_1         
		//   44  122:getstatic       #84  <Field SettingType SettingType.MultiPass>
		//   45  125:invokevirtual   #98  <Method boolean HashSet.contains(Object)>
		//   46  128:istore          5
				boolean flag2 = false;
		//   47  130:iconst_0        
		//   48  131:istore          4
				boolean flag;
				if(flag3 && ((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.MultiPassModesAvailable))))
		//*  49  133:iload           5
		//*  50  135:ifeq            153
		//*  51  138:aload_1         
		//*  52  139:getstatic       #101 <Field SettingType SettingType.MultiPassModesAvailable>
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
				if(CleaningPassSettingsActivity.b(a) != null)
		//*  62  158:aload_0         
		//*  63  159:getfield        #12  <Field CleaningPassSettingsActivity a>
		//*  64  162:invokestatic    #104 <Method MultiPassMode CleaningPassSettingsActivity.b(CleaningPassSettingsActivity)>
		//*  65  165:ifnull          183
				{
					flag1 = flag2;
		//   66  168:iload           4
		//   67  170:istore_3        
					if(CleaningPassSettingsActivity.c(a) != null)
		//*  68  171:aload_0         
		//*  69  172:getfield        #12  <Field CleaningPassSettingsActivity a>
		//*  70  175:invokestatic    #108 <Method ArrayList CleaningPassSettingsActivity.c(CleaningPassSettingsActivity)>
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
					a.a(CleaningPassSettingsActivity.c(a), CleaningPassSettingsActivity.b(a));
		//   78  191:aload_0         
		//   79  192:getfield        #12  <Field CleaningPassSettingsActivity a>
		//   80  195:aload_0         
		//   81  196:getfield        #12  <Field CleaningPassSettingsActivity a>
		//   82  199:invokestatic    #108 <Method ArrayList CleaningPassSettingsActivity.c(CleaningPassSettingsActivity)>
		//   83  202:aload_0         
		//   84  203:getfield        #12  <Field CleaningPassSettingsActivity a>
		//   85  206:invokestatic    #104 <Method MultiPassMode CleaningPassSettingsActivity.b(CleaningPassSettingsActivity)>
		//   86  209:invokevirtual   #111 <Method void com.irobot.home.CleaningPassSettingsActivity.a(ArrayList, MultiPassMode)>
				break;
			} while(true);
		//   87  212:return          
		}

		final CleaningPassSettingsActivity a;

		private a()
		{
			a = CleaningPassSettingsActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field CleaningPassSettingsActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void SettingsUIServiceDataCallback()>
		//    5    9:return          
		}

	}


	public CleaningPassSettingsActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void BaseFragmentActivity()>
		b = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #55  <Field boolean b>
		t = ((SettingsUIServiceDataCallback) (new a()));
	//    5    9:aload_0         
	//    6   10:new             #10  <Class CleaningPassSettingsActivity$a>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:invokespecial   #58  <Method void CleaningPassSettingsActivity$a(CleaningPassSettingsActivity, CleaningPassSettingsActivity$1)>
	//   11   19:putfield        #60  <Field SettingsUIServiceDataCallback t>
		u = null;
	//   12   22:aload_0         
	//   13   23:aconst_null     
	//   14   24:putfield        #62  <Field ArrayList u>
		v = null;
	//   15   27:aload_0         
	//   16   28:aconst_null     
	//   17   29:putfield        #64  <Field MultiPassMode v>
		w = null;
	//   18   32:aload_0         
	//   19   33:aconst_null     
	//   20   34:putfield        #66  <Field MultiPassMode w>
		x = new Handler();
	//   21   37:aload_0         
	//   22   38:new             #68  <Class Handler>
	//   23   41:dup             
	//   24   42:invokespecial   #69  <Method void Handler()>
	//   25   45:putfield        #71  <Field Handler x>
	//   26   48:aload_0         
	//   27   49:new             #6   <Class CleaningPassSettingsActivity$1>
	//   28   52:dup             
	//   29   53:aload_0         
	//   30   54:invokespecial   #74  <Method void CleaningPassSettingsActivity$1(CleaningPassSettingsActivity)>
	//   31   57:putfield        #76  <Field Runnable y>
	//   32   60:return          
	}

	static MultiPassMode a(CleaningPassSettingsActivity cleaningpasssettingsactivity)
	{
		return cleaningpasssettingsactivity.w;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field MultiPassMode w>
	//    2    4:areturn         
	}

	static ArrayList a(CleaningPassSettingsActivity cleaningpasssettingsactivity, ArrayList arraylist)
	{
		cleaningpasssettingsactivity.u = arraylist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #62  <Field ArrayList u>
		return arraylist;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static void a(CleaningPassSettingsActivity cleaningpasssettingsactivity, MultiPassMode multipassmode)
	{
		cleaningpasssettingsactivity.b(multipassmode);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #82  <Method void b(MultiPassMode)>
	//    3    5:return          
	}

	static MultiPassMode b(CleaningPassSettingsActivity cleaningpasssettingsactivity)
	{
		return cleaningpasssettingsactivity.v;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field MultiPassMode v>
	//    2    4:areturn         
	}

	static MultiPassMode b(CleaningPassSettingsActivity cleaningpasssettingsactivity, MultiPassMode multipassmode)
	{
		cleaningpasssettingsactivity.v = multipassmode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #64  <Field MultiPassMode v>
		return multipassmode;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private void b(MultiPassMode multipassmode)
	{
		w = multipassmode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #66  <Field MultiPassMode w>
		multipassmode = w;
	//    3    5:aload_0         
	//    4    6:getfield        #66  <Field MultiPassMode w>
	//    5    9:astore_1        
		byte byte0 = 0;
	//    6   10:iconst_0        
	//    7   11:istore_2        
		boolean flag;
		if(multipassmode != null)
	//*   8   12:aload_1         
	//*   9   13:ifnull          21
			flag = true;
	//   10   16:iconst_1        
	//   11   17:istore_3        
		else
	//*  12   18:goto            23
			flag = false;
	//   13   21:iconst_0        
	//   14   22:istore_3        
		multipassmode = ((MultiPassMode) (f));
	//   15   23:aload_0         
	//   16   24:getfield        #85  <Field RelativeLayout f>
	//   17   27:astore_1        
		if(!flag)
	//*  18   28:iload_3         
	//*  19   29:ifeq            35
	//*  20   32:goto            38
			byte0 = 8;
	//   21   35:bipush          8
	//   22   37:istore_2        
		((RelativeLayout) (multipassmode)).setVisibility(((int) (byte0)));
	//   23   38:aload_1         
	//   24   39:iload_2         
	//   25   40:invokevirtual   #91  <Method void RelativeLayout.setVisibility(int)>
		h.setEnabled(flag);
	//   26   43:aload_0         
	//   27   44:getfield        #93  <Field ProgressBar h>
	//   28   47:iload_3         
	//   29   48:invokevirtual   #99  <Method void ProgressBar.setEnabled(boolean)>
		if(flag)
	//*  30   51:iload_3         
	//*  31   52:ifeq            71
		{
			x.postDelayed(y, 2000L);
	//   32   55:aload_0         
	//   33   56:getfield        #71  <Field Handler x>
	//   34   59:aload_0         
	//   35   60:getfield        #76  <Field Runnable y>
	//   36   63:ldc2w           #100 <Long 2000L>
	//   37   66:invokevirtual   #105 <Method boolean Handler.postDelayed(Runnable, long)>
	//   38   69:pop             
			return;
	//   39   70:return          
		} else
		{
			x.removeCallbacks(y);
	//   40   71:aload_0         
	//   41   72:getfield        #71  <Field Handler x>
	//   42   75:aload_0         
	//   43   76:getfield        #76  <Field Runnable y>
	//   44   79:invokevirtual   #109 <Method void Handler.removeCallbacks(Runnable)>
			return;
	//   45   82:return          
		}
	}

	static ArrayList c(CleaningPassSettingsActivity cleaningpasssettingsactivity)
	{
		return cleaningpasssettingsactivity.u;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field ArrayList u>
	//    2    4:areturn         
	}

	private void c(MultiPassMode multipassmode)
	{
label0:
		{
label1:
			{
				if(m)
					break label0;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field boolean m>
	//    2    4:ifne            140
				if(!b)
	//*   3    7:aload_0         
	//*   4    8:getfield        #55  <Field boolean b>
	//*   5   11:ifne            15
					return;
	//    6   14:return          
				b(multipassmode);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #82  <Method void b(MultiPassMode)>
				AnalyticsSubsystem analyticssubsystem;
				AssetInfo assetinfo;
				MultiPassMode multipassmode1;
				switch(com.irobot.home._cls2.a[multipassmode.ordinal()])
	//*  10   20:getstatic       #115 <Field int[] com.irobot.home.CleaningPassSettingsActivity$2.a>
	//*  11   23:aload_1         
	//*  12   24:invokevirtual   #121 <Method int MultiPassMode.ordinal()>
	//*  13   27:iaload          
				{
	//*  14   28:tableswitch     1 3: default 56
	//	               1 93
	//	               2 76
	//	               3 59
				default:
					break label1;
	//   15   56:goto            114

				case 3: // '\003'
					analyticssubsystem = AnalyticsSubsystem.getInstance();
	//   16   59:invokestatic    #127 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   17   62:astore_2        
					assetinfo = n;
	//   18   63:aload_0         
	//   19   64:getfield        #129 <Field AssetInfo n>
	//   20   67:astore_3        
					multipassmode1 = MultiPassMode.Two;
	//   21   68:getstatic       #132 <Field MultiPassMode MultiPassMode.Two>
	//   22   71:astore          4
					break;
	//   23   73:goto            107

				case 2: // '\002'
					analyticssubsystem = AnalyticsSubsystem.getInstance();
	//   24   76:invokestatic    #127 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   25   79:astore_2        
					assetinfo = n;
	//   26   80:aload_0         
	//   27   81:getfield        #129 <Field AssetInfo n>
	//   28   84:astore_3        
					multipassmode1 = MultiPassMode.One;
	//   29   85:getstatic       #135 <Field MultiPassMode MultiPassMode.One>
	//   30   88:astore          4
					break;
	//   31   90:goto            107

				case 1: // '\001'
					analyticssubsystem = AnalyticsSubsystem.getInstance();
	//   32   93:invokestatic    #127 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   33   96:astore_2        
					assetinfo = n;
	//   34   97:aload_0         
	//   35   98:getfield        #129 <Field AssetInfo n>
	//   36  101:astore_3        
					multipassmode1 = MultiPassMode.Auto;
	//   37  102:getstatic       #138 <Field MultiPassMode MultiPassMode.Auto>
	//   38  105:astore          4
					break;
				}
				analyticssubsystem.trackCleaningPassesSettingChanged(assetinfo, multipassmode1);
	//   39  107:aload_2         
	//   40  108:aload_3         
	//   41  109:aload           4
	//   42  111:invokevirtual   #142 <Method void AnalyticsSubsystem.trackCleaningPassesSettingChanged(AssetInfo, MultiPassMode)>
			}
			SettingsUIServiceData settingsuiservicedata = SettingsUIServiceData.create();
	//   43  114:invokestatic    #148 <Method SettingsUIServiceData SettingsUIServiceData.create()>
	//   44  117:astore_2        
			settingsuiservicedata.setIntegerSetting(SettingType.MultiPass, multipassmode.ordinal());
	//   45  118:aload_2         
	//   46  119:getstatic       #154 <Field SettingType SettingType.MultiPass>
	//   47  122:aload_1         
	//   48  123:invokevirtual   #121 <Method int MultiPassMode.ordinal()>
	//   49  126:invokevirtual   #158 <Method void SettingsUIServiceData.setIntegerSetting(SettingType, int)>
			o.sendCommand(SettingsUIServiceCommand.SetCleaningPreference, settingsuiservicedata);
	//   50  129:aload_0         
	//   51  130:getfield        #160 <Field SettingsSubsystem o>
	//   52  133:getstatic       #166 <Field SettingsUIServiceCommand SettingsUIServiceCommand.SetCleaningPreference>
	//   53  136:aload_2         
	//   54  137:invokevirtual   #172 <Method void SettingsSubsystem.sendCommand(SettingsUIServiceCommand, SettingsUIServiceData)>
		}
	//   55  140:return          
	}

	static String i()
	{
		return l;
	//    0    0:getstatic       #175 <Field String l>
	//    1    3:areturn         
	}

	void a(MultiPassMode multipassmode)
	{
		v = multipassmode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #64  <Field MultiPassMode v>
		if(i != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #177 <Field CheckedTextView i>
	//*   5    9:ifnull          26
			i.setChecked(multipassmode.equals(((Object) (MultiPassMode.Auto))));
	//    6   12:aload_0         
	//    7   13:getfield        #177 <Field CheckedTextView i>
	//    8   16:aload_1         
	//    9   17:getstatic       #138 <Field MultiPassMode MultiPassMode.Auto>
	//   10   20:invokevirtual   #181 <Method boolean MultiPassMode.equals(Object)>
	//   11   23:invokevirtual   #186 <Method void CheckedTextView.setChecked(boolean)>
		if(j != null)
	//*  12   26:aload_0         
	//*  13   27:getfield        #188 <Field CheckedTextView j>
	//*  14   30:ifnull          47
			j.setChecked(multipassmode.equals(((Object) (MultiPassMode.One))));
	//   15   33:aload_0         
	//   16   34:getfield        #188 <Field CheckedTextView j>
	//   17   37:aload_1         
	//   18   38:getstatic       #135 <Field MultiPassMode MultiPassMode.One>
	//   19   41:invokevirtual   #181 <Method boolean MultiPassMode.equals(Object)>
	//   20   44:invokevirtual   #186 <Method void CheckedTextView.setChecked(boolean)>
		if(k != null)
	//*  21   47:aload_0         
	//*  22   48:getfield        #190 <Field CheckedTextView k>
	//*  23   51:ifnull          68
			k.setChecked(multipassmode.equals(((Object) (MultiPassMode.Two))));
	//   24   54:aload_0         
	//   25   55:getfield        #190 <Field CheckedTextView k>
	//   26   58:aload_1         
	//   27   59:getstatic       #132 <Field MultiPassMode MultiPassMode.Two>
	//   28   62:invokevirtual   #181 <Method boolean MultiPassMode.equals(Object)>
	//   29   65:invokevirtual   #186 <Method void CheckedTextView.setChecked(boolean)>
	//   30   68:return          
	}

	public void a(ArrayList arraylist, MultiPassMode multipassmode)
	{
		if(arraylist.contains(((Object) (MultiPassMode.Auto))))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #138 <Field MultiPassMode MultiPassMode.Auto>
	//*   2    4:invokevirtual   #196 <Method boolean ArrayList.contains(Object)>
	//*   3    7:ifeq            51
		{
			i = ((CheckedTextView) (com.irobot.home.util.j.b(c, getString(0x7f0f05b5))));
	//    4   10:aload_0         
	//    5   11:aload_0         
	//    6   12:getfield        #198 <Field RelativeLayout c>
	//    7   15:aload_0         
	//    8   16:ldc1            #199 <Int 0x7f0f05b5>
	//    9   18:invokevirtual   #203 <Method String getString(int)>
	//   10   21:invokestatic    #208 <Method com.irobot.home.view.CustomCheckedTextView j.b(RelativeLayout, String)>
	//   11   24:putfield        #177 <Field CheckedTextView i>
			com.irobot.home.util.j.a(c, getString(0x7f0f05b6));
	//   12   27:aload_0         
	//   13   28:getfield        #198 <Field RelativeLayout c>
	//   14   31:aload_0         
	//   15   32:ldc1            #209 <Int 0x7f0f05b6>
	//   16   34:invokevirtual   #203 <Method String getString(int)>
	//   17   37:invokestatic    #212 <Method void j.a(RelativeLayout, String)>
			g.setVisibility(0);
	//   18   40:aload_0         
	//   19   41:getfield        #214 <Field View g>
	//   20   44:iconst_0        
	//   21   45:invokevirtual   #217 <Method void View.setVisibility(int)>
		} else
	//*  22   48:goto            69
		{
			c.setVisibility(8);
	//   23   51:aload_0         
	//   24   52:getfield        #198 <Field RelativeLayout c>
	//   25   55:bipush          8
	//   26   57:invokevirtual   #91  <Method void RelativeLayout.setVisibility(int)>
			g.setVisibility(8);
	//   27   60:aload_0         
	//   28   61:getfield        #214 <Field View g>
	//   29   64:bipush          8
	//   30   66:invokevirtual   #217 <Method void View.setVisibility(int)>
		}
		if(arraylist.contains(((Object) (MultiPassMode.One))))
	//*  31   69:aload_1         
	//*  32   70:getstatic       #135 <Field MultiPassMode MultiPassMode.One>
	//*  33   73:invokevirtual   #196 <Method boolean ArrayList.contains(Object)>
	//*  34   76:ifeq            109
		{
			j = ((CheckedTextView) (com.irobot.home.util.j.b(d, getString(0x7f0f05b9))));
	//   35   79:aload_0         
	//   36   80:aload_0         
	//   37   81:getfield        #219 <Field RelativeLayout d>
	//   38   84:aload_0         
	//   39   85:ldc1            #220 <Int 0x7f0f05b9>
	//   40   87:invokevirtual   #203 <Method String getString(int)>
	//   41   90:invokestatic    #208 <Method com.irobot.home.view.CustomCheckedTextView j.b(RelativeLayout, String)>
	//   42   93:putfield        #188 <Field CheckedTextView j>
			com.irobot.home.util.j.a(d, getString(0x7f0f0917));
	//   43   96:aload_0         
	//   44   97:getfield        #219 <Field RelativeLayout d>
	//   45  100:aload_0         
	//   46  101:ldc1            #221 <Int 0x7f0f0917>
	//   47  103:invokevirtual   #203 <Method String getString(int)>
	//   48  106:invokestatic    #212 <Method void j.a(RelativeLayout, String)>
		}
		if(arraylist.contains(((Object) (MultiPassMode.Two))))
	//*  49  109:aload_1         
	//*  50  110:getstatic       #132 <Field MultiPassMode MultiPassMode.Two>
	//*  51  113:invokevirtual   #196 <Method boolean ArrayList.contains(Object)>
	//*  52  116:ifeq            149
		{
			k = ((CheckedTextView) (com.irobot.home.util.j.b(e, getString(0x7f0f05b7))));
	//   53  119:aload_0         
	//   54  120:aload_0         
	//   55  121:getfield        #223 <Field RelativeLayout e>
	//   56  124:aload_0         
	//   57  125:ldc1            #224 <Int 0x7f0f05b7>
	//   58  127:invokevirtual   #203 <Method String getString(int)>
	//   59  130:invokestatic    #208 <Method com.irobot.home.view.CustomCheckedTextView j.b(RelativeLayout, String)>
	//   60  133:putfield        #190 <Field CheckedTextView k>
			com.irobot.home.util.j.a(e, getString(0x7f0f0918));
	//   61  136:aload_0         
	//   62  137:getfield        #223 <Field RelativeLayout e>
	//   63  140:aload_0         
	//   64  141:ldc1            #225 <Int 0x7f0f0918>
	//   65  143:invokevirtual   #203 <Method String getString(int)>
	//   66  146:invokestatic    #212 <Method void j.a(RelativeLayout, String)>
		}
		m = true;
	//   67  149:aload_0         
	//   68  150:iconst_1        
	//   69  151:putfield        #112 <Field boolean m>
		a(multipassmode);
	//   70  154:aload_0         
	//   71  155:aload_2         
	//   72  156:invokevirtual   #227 <Method void a(MultiPassMode)>
		m = false;
	//   73  159:aload_0         
	//   74  160:iconst_0        
	//   75  161:putfield        #112 <Field boolean m>
		if(w != null && v == w)
	//*  76  164:aload_0         
	//*  77  165:getfield        #66  <Field MultiPassMode w>
	//*  78  168:ifnull          187
	//*  79  171:aload_0         
	//*  80  172:getfield        #64  <Field MultiPassMode v>
	//*  81  175:aload_0         
	//*  82  176:getfield        #66  <Field MultiPassMode w>
	//*  83  179:if_acmpne       187
			b(((MultiPassMode) (null)));
	//   84  182:aload_0         
	//   85  183:aconst_null     
	//   86  184:invokespecial   #82  <Method void b(MultiPassMode)>
	//   87  187:return          
	}

	void e()
	{
		b(0x7f0f07eb);
	//    0    0:aload_0         
	//    1    1:ldc1            #230 <Int 0x7f0f07eb>
	//    2    3:invokevirtual   #232 <Method void b(int)>
		n = com.irobot.home.util.j.a(a).a();
	//    3    6:aload_0         
	//    4    7:aload_0         
	//    5    8:getfield        #234 <Field String a>
	//    6   11:invokestatic    #237 <Method a j.a(String)>
	//    7   14:invokevirtual   #242 <Method AssetInfo a.a()>
	//    8   17:putfield        #129 <Field AssetInfo n>
		o = Assembler.getInstance().getSettingsSubsystem(n.getAssetId());
	//    9   20:aload_0         
	//   10   21:invokestatic    #247 <Method Assembler Assembler.getInstance()>
	//   11   24:aload_0         
	//   12   25:getfield        #129 <Field AssetInfo n>
	//   13   28:invokevirtual   #253 <Method com.irobot.core.AssetId AssetInfo.getAssetId()>
	//   14   31:invokevirtual   #257 <Method SettingsSubsystem Assembler.getSettingsSubsystem(com.irobot.core.AssetId)>
	//   15   34:putfield        #160 <Field SettingsSubsystem o>
		AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.CleaningPassesSetting, n);
	//   16   37:invokestatic    #127 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   17   40:getstatic       #263 <Field ViewId ViewId.CleaningPassesSetting>
	//   18   43:aload_0         
	//   19   44:getfield        #129 <Field AssetInfo n>
	//   20   47:invokevirtual   #267 <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, AssetInfo)>
	//   21   50:return          
	}

	void f()
	{
		c(MultiPassMode.Auto);
	//    0    0:aload_0         
	//    1    1:getstatic       #138 <Field MultiPassMode MultiPassMode.Auto>
	//    2    4:invokespecial   #269 <Method void c(MultiPassMode)>
	//    3    7:return          
	}

	void g()
	{
		c(MultiPassMode.One);
	//    0    0:aload_0         
	//    1    1:getstatic       #135 <Field MultiPassMode MultiPassMode.One>
	//    2    4:invokespecial   #269 <Method void c(MultiPassMode)>
	//    3    7:return          
	}

	void h()
	{
		c(MultiPassMode.Two);
	//    0    0:aload_0         
	//    1    1:getstatic       #132 <Field MultiPassMode MultiPassMode.Two>
	//    2    4:invokespecial   #269 <Method void c(MultiPassMode)>
	//    3    7:return          
	}

	public void onBackPressed()
	{
		Intent intent = new Intent();
	//    0    0:new             #272 <Class Intent>
	//    1    3:dup             
	//    2    4:invokespecial   #273 <Method void Intent()>
	//    3    7:astore_1        
		com.irobot.home.util.e.a(((Enum) (v))).b(intent);
	//    4    8:aload_0         
	//    5    9:getfield        #64  <Field MultiPassMode v>
	//    6   12:invokestatic    #278 <Method com.irobot.home.util.e$b e.a(Enum)>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #283 <Method void com.irobot.home.util.e$b.b(Intent)>
		setResult(1, intent);
	//    9   19:aload_0         
	//   10   20:iconst_1        
	//   11   21:aload_1         
	//   12   22:invokevirtual   #287 <Method void setResult(int, Intent)>
		finish();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #290 <Method void finish()>
	//   15   29:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #293 <Method void BaseFragmentActivity.onStart()>
		o.registerUISubscriber(t);
	//    2    4:aload_0         
	//    3    5:getfield        #160 <Field SettingsSubsystem o>
	//    4    8:aload_0         
	//    5    9:getfield        #60  <Field SettingsUIServiceDataCallback t>
	//    6   12:invokevirtual   #297 <Method boolean SettingsSubsystem.registerUISubscriber(SettingsUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #300 <Method void BaseFragmentActivity.onStop()>
		o.unregisterSubscriber(t);
	//    2    4:aload_0         
	//    3    5:getfield        #160 <Field SettingsSubsystem o>
	//    4    8:aload_0         
	//    5    9:getfield        #60  <Field SettingsUIServiceDataCallback t>
	//    6   12:invokevirtual   #303 <Method boolean SettingsSubsystem.unregisterSubscriber(SettingsUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	private static final String l = "CleaningPassSettingsActivity";
	String a;
	boolean b;
	RelativeLayout c;
	RelativeLayout d;
	RelativeLayout e;
	RelativeLayout f;
	View g;
	ProgressBar h;
	CheckedTextView i;
	CheckedTextView j;
	CheckedTextView k;
	private boolean m;
	private AssetInfo n;
	private SettingsSubsystem o;
	private SettingsUIServiceDataCallback t;
	private ArrayList u;
	private MultiPassMode v;
	private MultiPassMode w;
	private Handler x;
	private final Runnable y = new Runnable() {

		public void run()
		{
			if(com.irobot.home.CleaningPassSettingsActivity.a(a) != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field CleaningPassSettingsActivity a>
		//*   2    4:invokestatic    #22  <Method MultiPassMode com.irobot.home.CleaningPassSettingsActivity.a(CleaningPassSettingsActivity)>
		//*   3    7:ifnull          18
				com.irobot.home.CleaningPassSettingsActivity.a(a, ((MultiPassMode) (null)));
		//    4   10:aload_0         
		//    5   11:getfield        #14  <Field CleaningPassSettingsActivity a>
		//    6   14:aconst_null     
		//    7   15:invokestatic    #25  <Method void com.irobot.home.CleaningPassSettingsActivity.a(CleaningPassSettingsActivity, MultiPassMode)>
		//    8   18:return          
		}

		final CleaningPassSettingsActivity a;

			
			{
				a = CleaningPassSettingsActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field CleaningPassSettingsActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;

	static 
	{
	//    0    0:return          
	}
}
