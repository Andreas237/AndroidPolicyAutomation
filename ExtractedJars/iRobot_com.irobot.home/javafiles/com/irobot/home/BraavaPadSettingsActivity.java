// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import com.irobot.core.*;
import com.irobot.home.b.w;
import com.irobot.home.model.PadSettings;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import java.util.*;

// Referenced classes of package com.irobot.home:
//			BaseListActivity

public class BraavaPadSettingsActivity extends BaseListActivity
	implements com.irobot.home.b.w.b
{

	public BraavaPadSettingsActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void BaseListActivity()>
	//    2    4:return          
	}

	static w a(BraavaPadSettingsActivity braavapadsettingsactivity)
	{
		return braavapadsettingsactivity.f;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field w f>
	//    2    4:areturn         
	}

	private void c()
	{
		b(0x7f0f013e);
	//    0    0:aload_0         
	//    1    1:ldc1            #29  <Int 0x7f0f013e>
	//    2    3:invokevirtual   #33  <Method void b(int)>
		ListView listview = getListView();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #37  <Method ListView getListView()>
	//    5   10:astore_1        
		listview.addHeaderView(getLayoutInflater().inflate(0x7f0b012b, ((android.view.ViewGroup) (null))), ((Object) (null)), false);
	//    6   11:aload_1         
	//    7   12:aload_0         
	//    8   13:invokevirtual   #41  <Method LayoutInflater getLayoutInflater()>
	//    9   16:ldc1            #42  <Int 0x7f0b012b>
	//   10   18:aconst_null     
	//   11   19:invokevirtual   #48  <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//   12   22:aconst_null     
	//   13   23:iconst_0        
	//   14   24:invokevirtual   #54  <Method void ListView.addHeaderView(View, Object, boolean)>
		listview.setHeaderDividersEnabled(false);
	//   15   27:aload_1         
	//   16   28:iconst_0        
	//   17   29:invokevirtual   #58  <Method void ListView.setHeaderDividersEnabled(boolean)>
		View view = getLayoutInflater().inflate(0x7f0b012a, ((android.view.ViewGroup) (null)));
	//   18   32:aload_0         
	//   19   33:invokevirtual   #41  <Method LayoutInflater getLayoutInflater()>
	//   20   36:ldc1            #59  <Int 0x7f0b012a>
	//   21   38:aconst_null     
	//   22   39:invokevirtual   #48  <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//   23   42:astore_2        
		listview.addFooterView(view, ((Object) (null)), false);
	//   24   43:aload_1         
	//   25   44:aload_2         
	//   26   45:aconst_null     
	//   27   46:iconst_0        
	//   28   47:invokevirtual   #62  <Method void ListView.addFooterView(View, Object, boolean)>
		listview.setFooterDividersEnabled(false);
	//   29   50:aload_1         
	//   30   51:iconst_0        
	//   31   52:invokevirtual   #65  <Method void ListView.setFooterDividersEnabled(boolean)>
		d = (Button)view.findViewById(0x7f09033a);
	//   32   55:aload_0         
	//   33   56:aload_2         
	//   34   57:ldc1            #66  <Int 0x7f09033a>
	//   35   59:invokevirtual   #72  <Method View View.findViewById(int)>
	//   36   62:checkcast       #74  <Class Button>
	//   37   65:putfield        #76  <Field Button d>
		d.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view1)
			{
				for(view1 = ((View) (a.e.entrySet().iterator())); ((Iterator) (view1)).hasNext(); ((PadSettings)((java.util.Map.Entry)((Iterator) (view1)).next()).getValue()).a(2));
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BraavaPadSettingsActivity a>
			//    2    4:getfield        #26  <Field Map BraavaPadSettingsActivity.e>
			//    3    7:invokeinterface #32  <Method Set Map.entrySet()>
			//    4   12:invokeinterface #38  <Method Iterator Set.iterator()>
			//    5   17:astore_1        
			//    6   18:aload_1         
			//    7   19:invokeinterface #44  <Method boolean Iterator.hasNext()>
			//    8   24:ifeq            51
			//    9   27:aload_1         
			//   10   28:invokeinterface #48  <Method Object Iterator.next()>
			//   11   33:checkcast       #50  <Class java.util.Map$Entry>
			//   12   36:invokeinterface #53  <Method Object java.util.Map$Entry.getValue()>
			//   13   41:checkcast       #55  <Class PadSettings>
			//   14   44:iconst_2        
			//   15   45:invokevirtual   #58  <Method void PadSettings.a(int)>
			//*  16   48:goto            18
				com.irobot.home.BraavaPadSettingsActivity.a(a).notifyDataSetChanged();
			//   17   51:aload_0         
			//   18   52:getfield        #17  <Field BraavaPadSettingsActivity a>
			//   19   55:invokestatic    #61  <Method w com.irobot.home.BraavaPadSettingsActivity.a(BraavaPadSettingsActivity)>
			//   20   58:invokevirtual   #66  <Method void w.notifyDataSetChanged()>
				a.a(RobotPadCategory.All, 2);
			//   21   61:aload_0         
			//   22   62:getfield        #17  <Field BraavaPadSettingsActivity a>
			//   23   65:getstatic       #72  <Field RobotPadCategory RobotPadCategory.All>
			//   24   68:iconst_2        
			//   25   69:invokevirtual   #75  <Method void com.irobot.home.BraavaPadSettingsActivity.a(RobotPadCategory, int)>
				a.b();
			//   26   72:aload_0         
			//   27   73:getfield        #17  <Field BraavaPadSettingsActivity a>
			//   28   76:invokevirtual   #78  <Method void BraavaPadSettingsActivity.b()>
			//   29   79:return          
			}

			final BraavaPadSettingsActivity a;

			
			{
				a = BraavaPadSettingsActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BraavaPadSettingsActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   38   68:aload_0         
	//   39   69:getfield        #76  <Field Button d>
	//   40   72:new             #8   <Class BraavaPadSettingsActivity$1>
	//   41   75:dup             
	//   42   76:aload_0         
	//   43   77:invokespecial   #79  <Method void BraavaPadSettingsActivity$1(BraavaPadSettingsActivity)>
	//   44   80:invokevirtual   #83  <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
	//   45   83:return          
	}

	private void d()
	{
		f = new w(((android.content.Context) (this)), ((com.irobot.home.b.w.b) (this)));
	//    0    0:aload_0         
	//    1    1:new             #85  <Class w>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokespecial   #88  <Method void w(android.content.Context, com.irobot.home.b.w$b)>
	//    6   10:putfield        #28  <Field w f>
		java.util.Map.Entry entry;
		for(Iterator iterator = e.entrySet().iterator(); iterator.hasNext(); f.add(entry.getValue()))
	//*   7   13:aload_0         
	//*   8   14:getfield        #90  <Field Map e>
	//*   9   17:invokeinterface #96  <Method Set Map.entrySet()>
	//*  10   22:invokeinterface #102 <Method Iterator Set.iterator()>
	//*  11   27:astore_1        
	//*  12   28:aload_1         
	//*  13   29:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//*  14   34:ifeq            63
			entry = (java.util.Map.Entry)iterator.next();
	//   15   37:aload_1         
	//   16   38:invokeinterface #112 <Method Object Iterator.next()>
	//   17   43:checkcast       #114 <Class java.util.Map$Entry>
	//   18   46:astore_2        

	//   19   47:aload_0         
	//   20   48:getfield        #28  <Field w f>
	//   21   51:aload_2         
	//   22   52:invokeinterface #117 <Method Object java.util.Map$Entry.getValue()>
	//   23   57:invokevirtual   #121 <Method void w.add(Object)>
	//*  24   60:goto            28
		setListAdapter(((android.widget.ListAdapter) (f)));
	//   25   63:aload_0         
	//   26   64:aload_0         
	//   27   65:getfield        #28  <Field w f>
	//   28   68:invokevirtual   #125 <Method void setListAdapter(android.widget.ListAdapter)>
		b();
	//   29   71:aload_0         
	//   30   72:invokevirtual   #127 <Method void b()>
	//   31   75:return          
	}

	void a()
	{
		Object obj = ((Object) (j.a(c).a()));
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field String c>
	//    2    4:invokestatic    #134 <Method a j.a(String)>
	//    3    7:invokevirtual   #139 <Method AssetInfo a.a()>
	//    4   10:astore_1        
		g = Assembler.getInstance().getSettingsSubsystem(((AssetInfo) (obj)).getAssetId());
	//    5   11:aload_0         
	//    6   12:invokestatic    #145 <Method Assembler Assembler.getInstance()>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #151 <Method com.irobot.core.AssetId AssetInfo.getAssetId()>
	//    9   19:invokevirtual   #155 <Method SettingsSubsystem Assembler.getSettingsSubsystem(com.irobot.core.AssetId)>
	//   10   22:putfield        #157 <Field SettingsSubsystem g>
		AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.BraavaPadOptions, ((AssetInfo) (obj)));
	//   11   25:invokestatic    #162 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   12   28:getstatic       #168 <Field ViewId ViewId.BraavaPadOptions>
	//   13   31:aload_1         
	//   14   32:invokevirtual   #172 <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, AssetInfo)>
		c();
	//   15   35:aload_0         
	//   16   36:invokespecial   #174 <Method void c()>
		obj = ((Object) (g.getServiceData().getWetnessLevels()));
	//   17   39:aload_0         
	//   18   40:getfield        #157 <Field SettingsSubsystem g>
	//   19   43:invokevirtual   #180 <Method SettingsUIServiceData SettingsSubsystem.getServiceData()>
	//   20   46:invokevirtual   #186 <Method HashMap SettingsUIServiceData.getWetnessLevels()>
	//   21   49:astore_1        
		Iterator iterator = e.entrySet().iterator();
	//   22   50:aload_0         
	//   23   51:getfield        #90  <Field Map e>
	//   24   54:invokeinterface #96  <Method Set Map.entrySet()>
	//   25   59:invokeinterface #102 <Method Iterator Set.iterator()>
	//   26   64:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//   27   65:aload_2         
	//   28   66:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//   29   71:ifeq            128
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   30   74:aload_2         
	//   31   75:invokeinterface #112 <Method Object Iterator.next()>
	//   32   80:checkcast       #114 <Class java.util.Map$Entry>
	//   33   83:astore_3        
			if(((HashMap) (obj)).containsKey(entry.getKey()))
	//*  34   84:aload_1         
	//*  35   85:aload_3         
	//*  36   86:invokeinterface #189 <Method Object java.util.Map$Entry.getKey()>
	//*  37   91:invokevirtual   #195 <Method boolean HashMap.containsKey(Object)>
	//*  38   94:ifeq            65
				((PadSettings)entry.getValue()).a(((Integer)((HashMap) (obj)).get(entry.getKey())).intValue());
	//   39   97:aload_3         
	//   40   98:invokeinterface #117 <Method Object java.util.Map$Entry.getValue()>
	//   41  103:checkcast       #197 <Class PadSettings>
	//   42  106:aload_1         
	//   43  107:aload_3         
	//   44  108:invokeinterface #189 <Method Object java.util.Map$Entry.getKey()>
	//   45  113:invokevirtual   #201 <Method Object HashMap.get(Object)>
	//   46  116:checkcast       #203 <Class Integer>
	//   47  119:invokevirtual   #207 <Method int Integer.intValue()>
	//   48  122:invokevirtual   #209 <Method void PadSettings.a(int)>
		} while(true);
	//   49  125:goto            65
		d();
	//   50  128:aload_0         
	//   51  129:invokespecial   #211 <Method void d()>
	//   52  132:return          
	}

	public void a(RobotPadCategory robotpadcategory, int i)
	{
		if(g != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #157 <Field SettingsSubsystem g>
	//*   2    4:ifnull          31
		{
			SettingsUIServiceData settingsuiservicedata = SettingsUIServiceData.create();
	//    3    7:invokestatic    #215 <Method SettingsUIServiceData SettingsUIServiceData.create()>
	//    4   10:astore_3        
			settingsuiservicedata.setWetnessLevelSettingValue(WetnessLevelSettingValue.create(robotpadcategory, i));
	//    5   11:aload_3         
	//    6   12:aload_1         
	//    7   13:iload_2         
	//    8   14:invokestatic    #220 <Method WetnessLevelSettingValue WetnessLevelSettingValue.create(RobotPadCategory, int)>
	//    9   17:invokevirtual   #224 <Method void SettingsUIServiceData.setWetnessLevelSettingValue(WetnessLevelSettingValue)>
			g.sendCommand(SettingsUIServiceCommand.UpdateSetting, settingsuiservicedata);
	//   10   20:aload_0         
	//   11   21:getfield        #157 <Field SettingsSubsystem g>
	//   12   24:getstatic       #230 <Field SettingsUIServiceCommand SettingsUIServiceCommand.UpdateSetting>
	//   13   27:aload_3         
	//   14   28:invokevirtual   #234 <Method void SettingsSubsystem.sendCommand(SettingsUIServiceCommand, SettingsUIServiceData)>
		}
	//   15   31:return          
	}

	public void a(PadSettings padsettings)
	{
		RobotPadCategory robotpadcategory = padsettings.a();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #238 <Method RobotPadCategory PadSettings.a()>
	//    2    4:astore_3        
		int i = padsettings.d();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #240 <Method int PadSettings.d()>
	//    5    9:istore_2        
		a(robotpadcategory, i);
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:iload_2         
	//    9   13:invokevirtual   #242 <Method void a(RobotPadCategory, int)>
		b();
	//   10   16:aload_0         
	//   11   17:invokevirtual   #127 <Method void b()>
		padsettings = ((PadSettings) (j.a(c).a()));
	//   12   20:aload_0         
	//   13   21:getfield        #129 <Field String c>
	//   14   24:invokestatic    #134 <Method a j.a(String)>
	//   15   27:invokevirtual   #139 <Method AssetInfo a.a()>
	//   16   30:astore_1        
		AnalyticsSubsystem.getInstance().trackBraavaPadOptionsChanged(((AssetInfo) (padsettings)), robotpadcategory, i);
	//   17   31:invokestatic    #162 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   18   34:aload_1         
	//   19   35:aload_3         
	//   20   36:iload_2         
	//   21   37:invokevirtual   #246 <Method void AnalyticsSubsystem.trackBraavaPadOptionsChanged(AssetInfo, RobotPadCategory, int)>
	//   22   40:return          
	}

	public void b()
	{
		boolean flag;
label0:
		{
			for(Iterator iterator = e.entrySet().iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #90  <Field Map e>
	//*   2    4:invokeinterface #96  <Method Set Map.entrySet()>
	//*   3    9:invokeinterface #102 <Method Iterator Set.iterator()>
	//*   4   14:astore_2        
	//*   5   15:aload_2         
	//*   6   16:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//*   7   21:ifeq            52
				if(!((PadSettings)((java.util.Map.Entry)iterator.next()).getValue()).e())
	//*   8   24:aload_2         
	//*   9   25:invokeinterface #112 <Method Object Iterator.next()>
	//*  10   30:checkcast       #114 <Class java.util.Map$Entry>
	//*  11   33:invokeinterface #117 <Method Object java.util.Map$Entry.getValue()>
	//*  12   38:checkcast       #197 <Class PadSettings>
	//*  13   41:invokevirtual   #248 <Method boolean PadSettings.e()>
	//*  14   44:ifne            15
				{
					flag = true;
	//   15   47:iconst_1        
	//   16   48:istore_1        
					break label0;
	//   17   49:goto            54
				}

			flag = false;
	//   18   52:iconst_0        
	//   19   53:istore_1        
		}
		d.setEnabled(flag);
	//   20   54:aload_0         
	//   21   55:getfield        #76  <Field Button d>
	//   22   58:iload_1         
	//   23   59:invokevirtual   #251 <Method void Button.setEnabled(boolean)>
	//   24   62:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #255 <Method void BaseListActivity.onCreate(Bundle)>
		e = ((Map) (new HashMap()));
	//    3    5:aload_0         
	//    4    6:new             #191 <Class HashMap>
	//    5    9:dup             
	//    6   10:invokespecial   #256 <Method void HashMap()>
	//    7   13:putfield        #90  <Field Map e>
		e.put(((Object) (RobotPadCategory.Wet)), ((Object) (new PadSettings(RobotPadCategory.Wet, getString(0x7f0f00fd), 0x7f08017e))));
	//    8   16:aload_0         
	//    9   17:getfield        #90  <Field Map e>
	//   10   20:getstatic       #262 <Field RobotPadCategory RobotPadCategory.Wet>
	//   11   23:new             #197 <Class PadSettings>
	//   12   26:dup             
	//   13   27:getstatic       #262 <Field RobotPadCategory RobotPadCategory.Wet>
	//   14   30:aload_0         
	//   15   31:ldc2            #263 <Int 0x7f0f00fd>
	//   16   34:invokevirtual   #267 <Method String getString(int)>
	//   17   37:ldc2            #268 <Int 0x7f08017e>
	//   18   40:invokespecial   #271 <Method void PadSettings(RobotPadCategory, String, int)>
	//   19   43:invokeinterface #275 <Method Object Map.put(Object, Object)>
	//   20   48:pop             
		e.put(((Object) (RobotPadCategory.Damp)), ((Object) (new PadSettings(RobotPadCategory.Damp, getString(0x7f0f00fb), 0x7f080179))));
	//   21   49:aload_0         
	//   22   50:getfield        #90  <Field Map e>
	//   23   53:getstatic       #278 <Field RobotPadCategory RobotPadCategory.Damp>
	//   24   56:new             #197 <Class PadSettings>
	//   25   59:dup             
	//   26   60:getstatic       #278 <Field RobotPadCategory RobotPadCategory.Damp>
	//   27   63:aload_0         
	//   28   64:ldc2            #279 <Int 0x7f0f00fb>
	//   29   67:invokevirtual   #267 <Method String getString(int)>
	//   30   70:ldc2            #280 <Int 0x7f080179>
	//   31   73:invokespecial   #271 <Method void PadSettings(RobotPadCategory, String, int)>
	//   32   76:invokeinterface #275 <Method Object Map.put(Object, Object)>
	//   33   81:pop             
		e.put(((Object) (RobotPadCategory.ReusableWet)), ((Object) (new PadSettings(RobotPadCategory.ReusableWet, getString(0x7f0f0166), 0x7f08017d))));
	//   34   82:aload_0         
	//   35   83:getfield        #90  <Field Map e>
	//   36   86:getstatic       #283 <Field RobotPadCategory RobotPadCategory.ReusableWet>
	//   37   89:new             #197 <Class PadSettings>
	//   38   92:dup             
	//   39   93:getstatic       #283 <Field RobotPadCategory RobotPadCategory.ReusableWet>
	//   40   96:aload_0         
	//   41   97:ldc2            #284 <Int 0x7f0f0166>
	//   42  100:invokevirtual   #267 <Method String getString(int)>
	//   43  103:ldc2            #285 <Int 0x7f08017d>
	//   44  106:invokespecial   #271 <Method void PadSettings(RobotPadCategory, String, int)>
	//   45  109:invokeinterface #275 <Method Object Map.put(Object, Object)>
	//   46  114:pop             
		e.put(((Object) (RobotPadCategory.ReusableDamp)), ((Object) (new PadSettings(RobotPadCategory.ReusableDamp, getString(0x7f0f0164), 0x7f08017b))));
	//   47  115:aload_0         
	//   48  116:getfield        #90  <Field Map e>
	//   49  119:getstatic       #288 <Field RobotPadCategory RobotPadCategory.ReusableDamp>
	//   50  122:new             #197 <Class PadSettings>
	//   51  125:dup             
	//   52  126:getstatic       #288 <Field RobotPadCategory RobotPadCategory.ReusableDamp>
	//   53  129:aload_0         
	//   54  130:ldc2            #289 <Int 0x7f0f0164>
	//   55  133:invokevirtual   #267 <Method String getString(int)>
	//   56  136:ldc2            #290 <Int 0x7f08017b>
	//   57  139:invokespecial   #271 <Method void PadSettings(RobotPadCategory, String, int)>
	//   58  142:invokeinterface #275 <Method Object Map.put(Object, Object)>
	//   59  147:pop             
	//   60  148:return          
	}

	String c;
	Button d;
	Map e;
	private w f;
	private SettingsSubsystem g;
}
