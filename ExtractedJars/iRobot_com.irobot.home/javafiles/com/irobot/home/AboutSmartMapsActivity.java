// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.Intent;
import android.widget.ImageButton;
import com.irobot.core.*;
import com.irobot.home.b.c;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.view.CustomViewPager;
import java.util.HashSet;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, MoppingRobotSmartMapIntroductionActivity_, SmartMapTipsActivity_

public class AboutSmartMapsActivity extends BaseFragmentActivity
	implements com.irobot.home.b.c.a
{

	public AboutSmartMapsActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void BaseFragmentActivity()>
	//    2    4:return          
	}

	void e()
	{
		Object obj = ((Object) (j.j().a()));
	//    0    0:invokestatic    #42  <Method a j.j()>
	//    1    3:invokevirtual   #47  <Method AssetInfo a.a()>
	//    2    6:astore_2        
		boolean flag;
		if(AssetCapabilityUtils.isCloudCapable(((AssetInfo) (obj))) && AssetCapabilityUtils.isMoppingRobot(((AssetInfo) (obj))))
	//*   3    7:aload_2         
	//*   4    8:invokestatic    #53  <Method boolean AssetCapabilityUtils.isCloudCapable(AssetInfo)>
	//*   5   11:ifeq            26
	//*   6   14:aload_2         
	//*   7   15:invokestatic    #56  <Method boolean AssetCapabilityUtils.isMoppingRobot(AssetInfo)>
	//*   8   18:ifeq            26
			flag = true;
	//    9   21:iconst_1        
	//   10   22:istore_1        
		else
	//*  11   23:goto            28
			flag = false;
	//   12   26:iconst_0        
	//   13   27:istore_1        
		f = flag;
	//   14   28:aload_0         
	//   15   29:iload_1         
	//   16   30:putfield        #58  <Field boolean f>
		e = Assembler.getInstance().getSettingsSubsystem(((AssetInfo) (obj)).getAssetId());
	//   17   33:aload_0         
	//   18   34:invokestatic    #64  <Method Assembler Assembler.getInstance()>
	//   19   37:aload_2         
	//   20   38:invokevirtual   #70  <Method com.irobot.core.AssetId AssetInfo.getAssetId()>
	//   21   41:invokevirtual   #74  <Method SettingsSubsystem Assembler.getSettingsSubsystem(com.irobot.core.AssetId)>
	//   22   44:putfield        #76  <Field SettingsSubsystem e>
		obj = ((Object) (e.getServiceData().getStringSetting(SettingType.Name)));
	//   23   47:aload_0         
	//   24   48:getfield        #76  <Field SettingsSubsystem e>
	//   25   51:invokevirtual   #82  <Method SettingsUIServiceData SettingsSubsystem.getServiceData()>
	//   26   54:getstatic       #88  <Field SettingType SettingType.Name>
	//   27   57:invokevirtual   #94  <Method String SettingsUIServiceData.getStringSetting(SettingType)>
	//   28   60:astore_2        
		if(d == null && j.i(((String) (obj))))
	//*  29   61:aload_0         
	//*  30   62:getfield        #96  <Field c d>
	//*  31   65:ifnonnull       104
	//*  32   68:aload_2         
	//*  33   69:invokestatic    #100 <Method boolean j.i(String)>
	//*  34   72:ifeq            104
		{
			d = new c(((android.content.Context) (this)), ((com.irobot.home.b.c.a) (this)), ((String) (obj)), ((android.support.v4.view.ViewPager) (a)));
	//   35   75:aload_0         
	//   36   76:new             #102 <Class c>
	//   37   79:dup             
	//   38   80:aload_0         
	//   39   81:aload_0         
	//   40   82:aload_2         
	//   41   83:aload_0         
	//   42   84:getfield        #104 <Field CustomViewPager a>
	//   43   87:invokespecial   #107 <Method void c(android.content.Context, com.irobot.home.b.c$a, String, android.support.v4.view.ViewPager)>
	//   44   90:putfield        #96  <Field c d>
			a.setAdapter(((android.support.v4.view.p) (d)));
	//   45   93:aload_0         
	//   46   94:getfield        #104 <Field CustomViewPager a>
	//   47   97:aload_0         
	//   48   98:getfield        #96  <Field c d>
	//   49  101:invokevirtual   #113 <Method void CustomViewPager.setAdapter(android.support.v4.view.p)>
		}
		a.setPagingEnabled(false);
	//   50  104:aload_0         
	//   51  105:getfield        #104 <Field CustomViewPager a>
	//   52  108:iconst_0        
	//   53  109:invokevirtual   #117 <Method void CustomViewPager.setPagingEnabled(boolean)>
	//   54  112:return          
	}

	void f()
	{
		switch(a.getCurrentItem())
	//*   0    0:aload_0         
	//*   1    1:getfield        #104 <Field CustomViewPager a>
	//*   2    4:invokevirtual   #121 <Method int CustomViewPager.getCurrentItem()>
		{
	//*   3    7:tableswitch     0 2: default 32
	//	               0 65
	//	               1 50
	//	               2 35
	//*   4   32:goto            77
		case 2: // '\002'
			AnalyticsSubsystem.getInstance().trackPMapsSectionIntroCompleteCancelButtonPressed(j.j().a());
	//    5   35:invokestatic    #126 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    6   38:invokestatic    #42  <Method a j.j()>
	//    7   41:invokevirtual   #47  <Method AssetInfo a.a()>
	//    8   44:invokevirtual   #130 <Method void AnalyticsSubsystem.trackPMapsSectionIntroCompleteCancelButtonPressed(AssetInfo)>
			break;

	//*   9   47:goto            77
		case 1: // '\001'
			AnalyticsSubsystem.getInstance().trackPMapsSectionIntro2CancelButtonPressed(j.j().a());
	//   10   50:invokestatic    #126 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   11   53:invokestatic    #42  <Method a j.j()>
	//   12   56:invokevirtual   #47  <Method AssetInfo a.a()>
	//   13   59:invokevirtual   #133 <Method void AnalyticsSubsystem.trackPMapsSectionIntro2CancelButtonPressed(AssetInfo)>
			break;

	//*  14   62:goto            77
		case 0: // '\0'
			AnalyticsSubsystem.getInstance().trackPMapsSectionIntro1CancelButtonPressed(j.j().a());
	//   15   65:invokestatic    #126 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   16   68:invokestatic    #42  <Method a j.j()>
	//   17   71:invokevirtual   #47  <Method AssetInfo a.a()>
	//   18   74:invokevirtual   #136 <Method void AnalyticsSubsystem.trackPMapsSectionIntro1CancelButtonPressed(AssetInfo)>
			break;
		}
		finish();
	//   19   77:aload_0         
	//   20   78:invokevirtual   #139 <Method void finish()>
	//   21   81:return          
	}

	public void g()
	{
		Object obj = ((Object) (j.j().a()));
	//    0    0:invokestatic    #42  <Method a j.j()>
	//    1    3:invokevirtual   #47  <Method AssetInfo a.a()>
	//    2    6:astore_2        
		AnalyticsSubsystem.getInstance().trackPMapsSectionIntro3ActivateButtonPressed(((AssetInfo) (obj)));
	//    3    7:invokestatic    #126 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    4   10:aload_2         
	//    5   11:invokevirtual   #143 <Method void AnalyticsSubsystem.trackPMapsSectionIntro3ActivateButtonPressed(AssetInfo)>
		obj = ((Object) (e.getServiceData()));
	//    6   14:aload_0         
	//    7   15:getfield        #76  <Field SettingsSubsystem e>
	//    8   18:invokevirtual   #82  <Method SettingsUIServiceData SettingsSubsystem.getServiceData()>
	//    9   21:astore_2        
		boolean flag;
		if(!f && ((SettingsUIServiceData) (obj)).getAvailableSettings().contains(((Object) (SettingType.PMapLearningAllowed))))
	//*  10   22:aload_0         
	//*  11   23:getfield        #58  <Field boolean f>
	//*  12   26:ifne            47
	//*  13   29:aload_2         
	//*  14   30:invokevirtual   #147 <Method HashSet SettingsUIServiceData.getAvailableSettings()>
	//*  15   33:getstatic       #150 <Field SettingType SettingType.PMapLearningAllowed>
	//*  16   36:invokevirtual   #156 <Method boolean HashSet.contains(Object)>
	//*  17   39:ifeq            47
			flag = true;
	//   18   42:iconst_1        
	//   19   43:istore_1        
		else
	//*  20   44:goto            49
			flag = false;
	//   21   47:iconst_0        
	//   22   48:istore_1        
		if(flag)
	//*  23   49:iload_1         
	//*  24   50:ifeq            77
		{
			SettingsUIServiceData settingsuiservicedata = SettingsUIServiceData.create();
	//   25   53:invokestatic    #159 <Method SettingsUIServiceData SettingsUIServiceData.create()>
	//   26   56:astore_2        
			settingsuiservicedata.setBooleanSetting(SettingType.PMapLearningAllowed, true);
	//   27   57:aload_2         
	//   28   58:getstatic       #150 <Field SettingType SettingType.PMapLearningAllowed>
	//   29   61:iconst_1        
	//   30   62:invokevirtual   #163 <Method void SettingsUIServiceData.setBooleanSetting(SettingType, boolean)>
			e.sendCommand(SettingsUIServiceCommand.UpdateSetting, settingsuiservicedata);
	//   31   65:aload_0         
	//   32   66:getfield        #76  <Field SettingsSubsystem e>
	//   33   69:getstatic       #169 <Field SettingsUIServiceCommand SettingsUIServiceCommand.UpdateSetting>
	//   34   72:aload_2         
	//   35   73:invokevirtual   #173 <Method void SettingsSubsystem.sendCommand(SettingsUIServiceCommand, SettingsUIServiceData)>
			return;
	//   36   76:return          
		} else
		{
			startActivity(new Intent(((android.content.Context) (this)), com/irobot/home/MoppingRobotSmartMapIntroductionActivity_));
	//   37   77:aload_0         
	//   38   78:new             #175 <Class Intent>
	//   39   81:dup             
	//   40   82:aload_0         
	//   41   83:ldc1            #177 <Class MoppingRobotSmartMapIntroductionActivity_>
	//   42   85:invokespecial   #180 <Method void Intent(android.content.Context, Class)>
	//   43   88:invokevirtual   #184 <Method void startActivity(Intent)>
			return;
	//   44   91:return          
		}
	}

	public void h()
	{
		com.irobot.home.SmartMapTipsActivity_.a(((android.content.Context) (this))).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #190 <Method SmartMapTipsActivity_$a com.irobot.home.SmartMapTipsActivity_.a(android.content.Context)>
	//    2    4:invokevirtual   #195 <Method org.androidannotations.api.a.e com.irobot.home.SmartMapTipsActivity_$a.a()>
	//    3    7:pop             
		finish();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #139 <Method void finish()>
	//    6   12:return          
	}

	public void onBackPressed()
	{
		int i = a.getCurrentItem();
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field CustomViewPager a>
	//    2    4:invokevirtual   #121 <Method int CustomViewPager.getCurrentItem()>
	//    3    7:istore_1        
		if(i <= 0)
	//*   4    8:iload_1         
	//*   5    9:ifgt            17
		{
			super.onBackPressed();
	//    6   12:aload_0         
	//    7   13:invokespecial   #198 <Method void BaseFragmentActivity.onBackPressed()>
			return;
	//    8   16:return          
		} else
		{
			a.setCurrentItem(i - 1);
	//    9   17:aload_0         
	//   10   18:getfield        #104 <Field CustomViewPager a>
	//   11   21:iload_1         
	//   12   22:iconst_1        
	//   13   23:isub            
	//   14   24:invokevirtual   #202 <Method void CustomViewPager.setCurrentItem(int)>
			return;
	//   15   27:return          
		}
	}

	private static final String c = j.r(((Class) (com/irobot/home/AboutSmartMapsActivity)).getSimpleName());
	CustomViewPager a;
	ImageButton b;
	private c d;
	private SettingsSubsystem e;
	private boolean f;

	static 
	{
	//    0    0:ldc1            #2   <Class AboutSmartMapsActivity>
	//    1    2:invokevirtual   #26  <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #32  <Method String j.r(String)>
	//    3    8:putstatic       #34  <Field String c>
	//*   4   11:return          
	}
}
