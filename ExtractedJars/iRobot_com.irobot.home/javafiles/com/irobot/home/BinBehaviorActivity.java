// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.view.View;
import android.widget.CheckedTextView;
import android.widget.RelativeLayout;
import com.irobot.core.*;
import com.irobot.home.model.a;
import com.irobot.home.model.rest.RobotErrorHelpContent;
import com.irobot.home.model.rest.RobotErrorHelpContentList;
import com.irobot.home.rest.CustomerCareRestClient;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomTextView;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity

public class BinBehaviorActivity extends BaseFragmentActivity
{

	public BinBehaviorActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void BaseFragmentActivity()>
	//    2    4:return          
	}

	private void a(boolean flag)
	{
		f.setChecked(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field CheckedTextView f>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #43  <Method void CheckedTextView.setChecked(boolean)>
		g.setChecked(flag ^ true);
	//    4    8:aload_0         
	//    5    9:getfield        #45  <Field CheckedTextView g>
	//    6   12:iload_1         
	//    7   13:iconst_1        
	//    8   14:ixor            
	//    9   15:invokevirtual   #43  <Method void CheckedTextView.setChecked(boolean)>
	//   10   18:return          
	}

	private void b(boolean flag)
	{
		a(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #49  <Method void a(boolean)>
		Object obj = ((Object) (i.getAssetId()));
	//    3    5:aload_0         
	//    4    6:getfield        #51  <Field AssetInfo i>
	//    5    9:invokevirtual   #57  <Method AssetId AssetInfo.getAssetId()>
	//    6   12:astore_2        
		obj = ((Object) (l.getAsset(((AssetId) (obj)).getId())));
	//    7   13:aload_0         
	//    8   14:getfield        #59  <Field PMIApplicationService l>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #65  <Method String AssetId.getId()>
	//   11   21:invokevirtual   #71  <Method PMIAssetService PMIApplicationService.getAsset(String)>
	//   12   24:astore_2        
		if(obj != null)
	//*  13   25:aload_2         
	//*  14   26:ifnull          66
		{
			try
			{
				JSONObject jsonobject = new JSONObject();
	//   15   29:new             #73  <Class JSONObject>
	//   16   32:dup             
	//   17   33:invokespecial   #74  <Method void JSONObject()>
	//   18   36:astore_3        
				jsonobject.put("binPause", flag);
	//   19   37:aload_3         
	//   20   38:ldc1            #76  <String "binPause">
	//   21   40:iload_1         
	//   22   41:invokevirtual   #80  <Method JSONObject JSONObject.put(String, boolean)>
	//   23   44:pop             
				((PMIAssetService) (obj)).postStateCommand("SetBinPause", jsonobject.toString());
	//   24   45:aload_2         
	//   25   46:ldc1            #82  <String "SetBinPause">
	//   26   48:aload_3         
	//   27   49:invokevirtual   #85  <Method String JSONObject.toString()>
	//   28   52:invokevirtual   #91  <Method void PMIAssetService.postStateCommand(String, String)>
			}
	//*  29   55:goto            89
			catch(JSONException jsonexception)
	//*  30   58:astore_2        
			{
				jsonexception.printStackTrace();
	//   31   59:aload_2         
	//   32   60:invokevirtual   #94  <Method void JSONException.printStackTrace()>
			}
		} else
	//*  33   63:goto            89
		{
			SettingsUIServiceData settingsuiservicedata = SettingsUIServiceData.create();
	//   34   66:invokestatic    #100 <Method SettingsUIServiceData SettingsUIServiceData.create()>
	//   35   69:astore_2        
			settingsuiservicedata.setBooleanSetting(SettingType.PauseOnBinFull, flag);
	//   36   70:aload_2         
	//   37   71:getstatic       #106 <Field SettingType SettingType.PauseOnBinFull>
	//   38   74:iload_1         
	//   39   75:invokevirtual   #110 <Method void SettingsUIServiceData.setBooleanSetting(SettingType, boolean)>
			j.sendCommand(SettingsUIServiceCommand.UpdateSetting, settingsuiservicedata);
	//   40   78:aload_0         
	//   41   79:getfield        #112 <Field SettingsSubsystem j>
	//   42   82:getstatic       #118 <Field SettingsUIServiceCommand SettingsUIServiceCommand.UpdateSetting>
	//   43   85:aload_2         
	//   44   86:invokevirtual   #124 <Method void SettingsSubsystem.sendCommand(SettingsUIServiceCommand, SettingsUIServiceData)>
		}
		k.trackFinishWhenBinFullSettingChanged(i, flag);
	//   45   89:aload_0         
	//   46   90:getfield        #126 <Field AnalyticsSubsystem k>
	//   47   93:aload_0         
	//   48   94:getfield        #51  <Field AssetInfo i>
	//   49   97:iload_1         
	//   50   98:invokevirtual   #132 <Method void AnalyticsSubsystem.trackFinishWhenBinFullSettingChanged(AssetInfo, boolean)>
	//   51  101:return          
	}

	void e()
	{
		i = com.irobot.home.util.j.a(a).a();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #134 <Field String a>
	//    3    5:invokestatic    #139 <Method a j.a(String)>
	//    4    8:invokevirtual   #144 <Method AssetInfo a.a()>
	//    5   11:putfield        #51  <Field AssetInfo i>
		j = Assembler.getInstance().getSettingsSubsystem(i.getAssetId());
	//    6   14:aload_0         
	//    7   15:invokestatic    #150 <Method Assembler Assembler.getInstance()>
	//    8   18:aload_0         
	//    9   19:getfield        #51  <Field AssetInfo i>
	//   10   22:invokevirtual   #57  <Method AssetId AssetInfo.getAssetId()>
	//   11   25:invokevirtual   #154 <Method SettingsSubsystem Assembler.getSettingsSubsystem(AssetId)>
	//   12   28:putfield        #112 <Field SettingsSubsystem j>
		k = Assembler.getInstance().getAnalyticsSubsystem();
	//   13   31:aload_0         
	//   14   32:invokestatic    #150 <Method Assembler Assembler.getInstance()>
	//   15   35:invokevirtual   #158 <Method AnalyticsSubsystem Assembler.getAnalyticsSubsystem()>
	//   16   38:putfield        #126 <Field AnalyticsSubsystem k>
		l = Assembler.getInstance().getPMIApplicationService();
	//   17   41:aload_0         
	//   18   42:invokestatic    #150 <Method Assembler Assembler.getInstance()>
	//   19   45:invokevirtual   #162 <Method PMIApplicationService Assembler.getPMIApplicationService()>
	//   20   48:putfield        #59  <Field PMIApplicationService l>
		b(0x7f0f00e4);
	//   21   51:aload_0         
	//   22   52:ldc1            #163 <Int 0x7f0f00e4>
	//   23   54:invokevirtual   #166 <Method void b(int)>
		f = ((CheckedTextView) (com.irobot.home.util.j.b(c, getString(0x7f0f0603))));
	//   24   57:aload_0         
	//   25   58:aload_0         
	//   26   59:getfield        #168 <Field RelativeLayout c>
	//   27   62:aload_0         
	//   28   63:ldc1            #169 <Int 0x7f0f0603>
	//   29   65:invokevirtual   #173 <Method String getString(int)>
	//   30   68:invokestatic    #176 <Method com.irobot.home.view.CustomCheckedTextView j.b(RelativeLayout, String)>
	//   31   71:putfield        #38  <Field CheckedTextView f>
		com.irobot.home.util.j.a(c, getString(0x7f0f0304));
	//   32   74:aload_0         
	//   33   75:getfield        #168 <Field RelativeLayout c>
	//   34   78:aload_0         
	//   35   79:ldc1            #177 <Int 0x7f0f0304>
	//   36   81:invokevirtual   #173 <Method String getString(int)>
	//   37   84:invokestatic    #180 <Method void j.a(RelativeLayout, String)>
		g = ((CheckedTextView) (com.irobot.home.util.j.b(d, getString(0x7f0f041f))));
	//   38   87:aload_0         
	//   39   88:aload_0         
	//   40   89:getfield        #182 <Field RelativeLayout d>
	//   41   92:aload_0         
	//   42   93:ldc1            #183 <Int 0x7f0f041f>
	//   43   95:invokevirtual   #173 <Method String getString(int)>
	//   44   98:invokestatic    #176 <Method com.irobot.home.view.CustomCheckedTextView j.b(RelativeLayout, String)>
	//   45  101:putfield        #45  <Field CheckedTextView g>
		com.irobot.home.util.j.a(d, getString(0x7f0f0305));
	//   46  104:aload_0         
	//   47  105:getfield        #182 <Field RelativeLayout d>
	//   48  108:aload_0         
	//   49  109:ldc1            #184 <Int 0x7f0f0305>
	//   50  111:invokevirtual   #173 <Method String getString(int)>
	//   51  114:invokestatic    #180 <Method void j.a(RelativeLayout, String)>
		a(b);
	//   52  117:aload_0         
	//   53  118:aload_0         
	//   54  119:getfield        #186 <Field boolean b>
	//   55  122:invokespecial   #49  <Method void a(boolean)>
		((CustomTextView)e.findViewById(0x7f09019d)).setText(0x7f0f00e3);
	//   56  125:aload_0         
	//   57  126:getfield        #188 <Field View e>
	//   58  129:ldc1            #189 <Int 0x7f09019d>
	//   59  131:invokevirtual   #195 <Method View View.findViewById(int)>
	//   60  134:checkcast       #197 <Class CustomTextView>
	//   61  137:ldc1            #198 <Int 0x7f0f00e3>
	//   62  139:invokevirtual   #201 <Method void CustomTextView.setText(int)>
	//   63  142:return          
	}

	public void f()
	{
		a(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #49  <Method void a(boolean)>
		b(true);
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:invokespecial   #203 <Method void b(boolean)>
	//    6   10:return          
	}

	public void g()
	{
		a(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #49  <Method void a(boolean)>
		b(false);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokespecial   #203 <Method void b(boolean)>
	//    6   10:return          
	}

	public void h()
	{
		try
		{
			m = com.irobot.home.util.j.i(((android.content.Context) (this)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokestatic    #208 <Method CustomerCareRestClient j.i(android.content.Context)>
	//    3    5:putfield        #210 <Field CustomerCareRestClient m>
			Iterator iterator = m.getRobotErrorHelp(com.irobot.home.util.j.a(Locale.getDefault()), com.irobot.home.util.j.o(), i.getSku()).otherContent.iterator();
	//    4    8:aload_0         
	//    5    9:getfield        #210 <Field CustomerCareRestClient m>
	//    6   12:invokestatic    #216 <Method Locale Locale.getDefault()>
	//    7   15:invokestatic    #219 <Method String j.a(Locale)>
	//    8   18:invokestatic    #222 <Method String j.o()>
	//    9   21:aload_0         
	//   10   22:getfield        #51  <Field AssetInfo i>
	//   11   25:invokevirtual   #225 <Method String AssetInfo.getSku()>
	//   12   28:invokeinterface #231 <Method RobotErrorHelpContentList CustomerCareRestClient.getRobotErrorHelp(String, String, String)>
	//   13   33:getfield        #237 <Field List RobotErrorHelpContentList.otherContent>
	//   14   36:invokeinterface #243 <Method Iterator List.iterator()>
	//   15   41:astore_1        
			do
			{
				if(!iterator.hasNext())
					break;
	//   16   42:aload_1         
	//   17   43:invokeinterface #249 <Method boolean Iterator.hasNext()>
	//   18   48:ifeq            127
				RobotErrorHelpContent roboterrorhelpcontent = (RobotErrorHelpContent)iterator.next();
	//   19   51:aload_1         
	//   20   52:invokeinterface #253 <Method Object Iterator.next()>
	//   21   57:checkcast       #255 <Class RobotErrorHelpContent>
	//   22   60:astore_2        
				if(roboterrorhelpcontent.id.equals("bin_full_explanation"))
	//*  23   61:aload_2         
	//*  24   62:getfield        #258 <Field String RobotErrorHelpContent.id>
	//*  25   65:ldc2            #260 <String "bin_full_explanation">
	//*  26   68:invokevirtual   #266 <Method boolean String.equals(Object)>
	//*  27   71:ifeq            42
					com.irobot.home.util.j.a(((android.app.Activity) (this)), roboterrorhelpcontent.content);
	//   28   74:aload_0         
	//   29   75:aload_2         
	//   30   76:getfield        #269 <Field String RobotErrorHelpContent.content>
	//   31   79:invokestatic    #272 <Method void j.a(android.app.Activity, String)>
			} while(true);
	//   32   82:goto            42
		}
		catch(Exception exception)
	//*  33   85:astore_1        
		{
			if(exception != null)
	//*  34   86:aload_1         
	//*  35   87:ifnull          127
			{
				String s = h;
	//   36   90:getstatic       #274 <Field String h>
	//   37   93:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//   38   94:new             #276 <Class StringBuilder>
	//   39   97:dup             
	//   40   98:invokespecial   #277 <Method void StringBuilder()>
	//   41  101:astore_3        
				stringbuilder.append("learnMoreBinBehavior: ");
	//   42  102:aload_3         
	//   43  103:ldc2            #279 <String "learnMoreBinBehavior: ">
	//   44  106:invokevirtual   #283 <Method StringBuilder StringBuilder.append(String)>
	//   45  109:pop             
				stringbuilder.append(exception.getMessage());
	//   46  110:aload_3         
	//   47  111:aload_1         
	//   48  112:invokevirtual   #286 <Method String Exception.getMessage()>
	//   49  115:invokevirtual   #283 <Method StringBuilder StringBuilder.append(String)>
	//   50  118:pop             
				o.e(s, stringbuilder.toString());
	//   51  119:aload_2         
	//   52  120:aload_3         
	//   53  121:invokevirtual   #287 <Method String StringBuilder.toString()>
	//   54  124:invokestatic    #291 <Method void o.e(String, String)>
			}
		}
	//   55  127:return          
	}

	private static final String h = "BinBehaviorActivity";
	String a;
	boolean b;
	RelativeLayout c;
	RelativeLayout d;
	View e;
	CheckedTextView f;
	CheckedTextView g;
	private AssetInfo i;
	private SettingsSubsystem j;
	private AnalyticsSubsystem k;
	private PMIApplicationService l;
	private CustomerCareRestClient m;

	static 
	{
	//    0    0:return          
	}
}
