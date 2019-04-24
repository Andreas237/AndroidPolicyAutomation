// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			CarpetBoostSettingsActivity

private class CarpetBoostSettingsActivity$a extends SettingsUIServiceDataCallback
{

	public void onSettingsUIServiceDataChanged(SettingsUIServiceData settingsuiservicedata)
	{
		if(settingsuiservicedata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
		{
			o.d(CarpetBoostSettingsActivity.j(), "Service data was null.");
	//    2    4:invokestatic    #25  <Method String CarpetBoostSettingsActivity.j()>
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
				switch(CarpetBoostSettingsActivity$1.b[settingtype.ordinal()])
	//*  17   44:getstatic       #63  <Field int[] CarpetBoostSettingsActivity$1.b>
	//*  18   47:aload           7
	//*  19   49:invokevirtual   #67  <Method int SettingType.ordinal()>
	//*  20   52:iaload          
				{
	//*  21   53:tableswitch     1 2: default 76
	//	               1 94
	//	               2 79
	//*  22   76:goto            22
				case 2: // '\002'
					CarpetBoostSettingsActivity.a(a, settingsuiservicedata.getCarpetBoostModes());
	//   23   79:aload_0         
	//   24   80:getfield        #12  <Field CarpetBoostSettingsActivity a>
	//   25   83:aload_1         
	//   26   84:invokevirtual   #71  <Method java.util.ArrayList SettingsUIServiceData.getCarpetBoostModes()>
	//   27   87:invokestatic    #74  <Method java.util.ArrayList CarpetBoostSettingsActivity.a(CarpetBoostSettingsActivity, java.util.ArrayList)>
	//   28   90:pop             
					break;

	//*  29   91:goto            22
				case 1: // '\001'
					CarpetBoostSettingsActivity.a(a, CarpetBoostMode.values()[settingsuiservicedata.getIntegerSetting(SettingType.CarpetBoost)]);
	//   30   94:aload_0         
	//   31   95:getfield        #12  <Field CarpetBoostSettingsActivity a>
	//   32   98:invokestatic    #80  <Method CarpetBoostMode[] CarpetBoostMode.values()>
	//   33  101:aload_1         
	//   34  102:getstatic       #84  <Field SettingType SettingType.CarpetBoost>
	//   35  105:invokevirtual   #88  <Method int SettingsUIServiceData.getIntegerSetting(SettingType)>
	//   36  108:aaload          
	//   37  109:invokestatic    #91  <Method CarpetBoostMode CarpetBoostSettingsActivity.a(CarpetBoostSettingsActivity, CarpetBoostMode)>
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
			if(CarpetBoostSettingsActivity.a(a) != null)
	//*  62  158:aload_0         
	//*  63  159:getfield        #12  <Field CarpetBoostSettingsActivity a>
	//*  64  162:invokestatic    #104 <Method CarpetBoostMode CarpetBoostSettingsActivity.a(CarpetBoostSettingsActivity)>
	//*  65  165:ifnull          183
			{
				flag1 = flag2;
	//   66  168:iload           4
	//   67  170:istore_3        
				if(CarpetBoostSettingsActivity.b(a) != null)
	//*  68  171:aload_0         
	//*  69  172:getfield        #12  <Field CarpetBoostSettingsActivity a>
	//*  70  175:invokestatic    #107 <Method java.util.ArrayList CarpetBoostSettingsActivity.b(CarpetBoostSettingsActivity)>
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
				a.a(CarpetBoostSettingsActivity.b(a), CarpetBoostSettingsActivity.a(a));
	//   78  191:aload_0         
	//   79  192:getfield        #12  <Field CarpetBoostSettingsActivity a>
	//   80  195:aload_0         
	//   81  196:getfield        #12  <Field CarpetBoostSettingsActivity a>
	//   82  199:invokestatic    #107 <Method java.util.ArrayList CarpetBoostSettingsActivity.b(CarpetBoostSettingsActivity)>
	//   83  202:aload_0         
	//   84  203:getfield        #12  <Field CarpetBoostSettingsActivity a>
	//   85  206:invokestatic    #104 <Method CarpetBoostMode CarpetBoostSettingsActivity.a(CarpetBoostSettingsActivity)>
	//   86  209:invokevirtual   #110 <Method void CarpetBoostSettingsActivity.a(java.util.ArrayList, CarpetBoostMode)>
			break;
		} while(true);
	//   87  212:return          
	}

	final CarpetBoostSettingsActivity a;

	private CarpetBoostSettingsActivity$a(CarpetBoostSettingsActivity carpetboostsettingsactivity)
	{
		a = carpetboostsettingsactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field CarpetBoostSettingsActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void SettingsUIServiceDataCallback()>
	//    5    9:return          
	}

	CarpetBoostSettingsActivity$a(CarpetBoostSettingsActivity carpetboostsettingsactivity, CarpetBoostSettingsActivity$1 carpetboostsettingsactivity$1)
	{
		this(carpetboostsettingsactivity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void CarpetBoostSettingsActivity$a(CarpetBoostSettingsActivity)>
	//    3    5:return          
	}
}
