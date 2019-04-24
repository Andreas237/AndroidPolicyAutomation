// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.HashSet;

// Referenced classes of package com.irobot.home:
//			MoreTableViewActivity

private class MoreTableViewActivity$b extends SettingsUIServiceDataCallback
{

	public void onSettingsUIServiceDataChanged(SettingsUIServiceData settingsuiservicedata)
	{
		if(settingsuiservicedata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
		{
			o.d(MoreTableViewActivity.l(), "Received null data.");
	//    2    4:invokestatic    #26  <Method String MoreTableViewActivity.l()>
	//    3    7:ldc1            #28  <String "Received null data.">
	//    4    9:invokestatic    #34  <Method void o.d(String, String)>
			return;
	//    5   12:return          
		}
		settingsuiservicedata = ((SettingsUIServiceData) (settingsuiservicedata.getAvailableSettings()));
	//    6   13:aload_1         
	//    7   14:invokevirtual   #40  <Method HashSet SettingsUIServiceData.getAvailableSettings()>
	//    8   17:astore_1        
		MoreTableViewActivity moretableviewactivity = a;
	//    9   18:aload_0         
	//   10   19:getfield        #13  <Field MoreTableViewActivity a>
	//   11   22:astore_3        
		boolean flag;
		if(!((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.CleaningPreferenceAvailable))) && !((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.CleaningPresets))) && !((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.RobotPadWetness))) && !((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.RobotRankOverlap))))
	//*  12   23:aload_1         
	//*  13   24:getstatic       #46  <Field SettingType SettingType.CleaningPreferenceAvailable>
	//*  14   27:invokevirtual   #52  <Method boolean HashSet.contains(Object)>
	//*  15   30:ifne            71
	//*  16   33:aload_1         
	//*  17   34:getstatic       #55  <Field SettingType SettingType.CleaningPresets>
	//*  18   37:invokevirtual   #52  <Method boolean HashSet.contains(Object)>
	//*  19   40:ifne            71
	//*  20   43:aload_1         
	//*  21   44:getstatic       #58  <Field SettingType SettingType.RobotPadWetness>
	//*  22   47:invokevirtual   #52  <Method boolean HashSet.contains(Object)>
	//*  23   50:ifne            71
	//*  24   53:aload_1         
	//*  25   54:getstatic       #61  <Field SettingType SettingType.RobotRankOverlap>
	//*  26   57:invokevirtual   #52  <Method boolean HashSet.contains(Object)>
	//*  27   60:ifeq            66
	//*  28   63:goto            71
			flag = false;
	//   29   66:iconst_0        
	//   30   67:istore_2        
		else
	//*  31   68:goto            73
			flag = true;
	//   32   71:iconst_1        
	//   33   72:istore_2        
		MoreTableViewActivity.a(moretableviewactivity, flag);
	//   34   73:aload_3         
	//   35   74:iload_2         
	//   36   75:invokestatic    #64  <Method boolean MoreTableViewActivity.a(MoreTableViewActivity, boolean)>
	//   37   78:pop             
		MoreTableViewActivity.a(a);
	//   38   79:aload_0         
	//   39   80:getfield        #13  <Field MoreTableViewActivity a>
	//   40   83:invokestatic    #66  <Method void MoreTableViewActivity.a(MoreTableViewActivity)>
		MoreTableViewActivity.b(a, ((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.CleaningPresets))));
	//   41   86:aload_0         
	//   42   87:getfield        #13  <Field MoreTableViewActivity a>
	//   43   90:aload_1         
	//   44   91:getstatic       #55  <Field SettingType SettingType.CleaningPresets>
	//   45   94:invokevirtual   #52  <Method boolean HashSet.contains(Object)>
	//   46   97:invokestatic    #68  <Method boolean MoreTableViewActivity.b(MoreTableViewActivity, boolean)>
	//   47  100:pop             
	//   48  101:return          
	}

	final MoreTableViewActivity a;

	private MoreTableViewActivity$b(MoreTableViewActivity moretableviewactivity)
	{
		a = moretableviewactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field MoreTableViewActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void SettingsUIServiceDataCallback()>
	//    5    9:return          
	}

	MoreTableViewActivity$b(MoreTableViewActivity moretableviewactivity, MoreTableViewActivity$1 moretableviewactivity$1)
	{
		this(moretableviewactivity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void MoreTableViewActivity$b(MoreTableViewActivity)>
	//    3    5:return          
	}
}
