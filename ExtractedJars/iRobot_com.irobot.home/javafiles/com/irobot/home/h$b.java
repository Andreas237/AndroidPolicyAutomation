// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			h

private class h$b extends SettingsUIServiceDataCallback
{

	public void onSettingsUIServiceDataChanged(SettingsUIServiceData settingsuiservicedata)
	{
		if(settingsuiservicedata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
		{
			o.d(h.c(), "Service data was null.");
	//    2    4:invokestatic    #26  <Method String h.c()>
	//    3    7:ldc1            #28  <String "Service data was null.">
	//    4    9:invokestatic    #34  <Method void o.d(String, String)>
			return;
	//    5   12:return          
		}
		Object obj = ((Object) (settingsuiservicedata.getSettingsChangeList().iterator()));
	//    6   13:aload_1         
	//    7   14:invokevirtual   #40  <Method HashSet SettingsUIServiceData.getSettingsChangeList()>
	//    8   17:invokevirtual   #46  <Method Iterator HashSet.iterator()>
	//    9   20:astore          4
		do
		{
			boolean flag;
label0:
			{
				if(((Iterator) (obj)).hasNext())
	//*  10   22:aload           4
	//*  11   24:invokeinterface #52  <Method boolean Iterator.hasNext()>
	//*  12   29:ifeq            112
				{
					SettingType settingtype = (SettingType)((Iterator) (obj)).next();
	//   13   32:aload           4
	//   14   34:invokeinterface #56  <Method Object Iterator.next()>
	//   15   39:checkcast       #58  <Class SettingType>
	//   16   42:astore          5
					switch(h$1.a[settingtype.ordinal()])
	//*  17   44:getstatic       #63  <Field int[] h$1.a>
	//*  18   47:aload           5
	//*  19   49:invokevirtual   #67  <Method int SettingType.ordinal()>
	//*  20   52:iaload          
					{
	//*  21   53:tableswitch     1 2: default 76
	//	               1 97
	//	               2 79
	//*  22   76:goto            22
					case 2: // '\002'
						h.a(a, settingsuiservicedata.getIntegerSetting(SettingType.RobotLanguage));
	//   23   79:aload_0         
	//   24   80:getfield        #13  <Field h a>
	//   25   83:aload_1         
	//   26   84:getstatic       #71  <Field SettingType SettingType.RobotLanguage>
	//   27   87:invokevirtual   #75  <Method int SettingsUIServiceData.getIntegerSetting(SettingType)>
	//   28   90:invokestatic    #78  <Method int h.a(h, int)>
	//   29   93:pop             
						break;

	//*  30   94:goto            22
					case 1: // '\001'
						h.a(a, settingsuiservicedata.getAvailableLanguages());
	//   31   97:aload_0         
	//   32   98:getfield        #13  <Field h a>
	//   33  101:aload_1         
	//   34  102:invokevirtual   #82  <Method java.util.ArrayList SettingsUIServiceData.getAvailableLanguages()>
	//   35  105:invokestatic    #85  <Method java.util.ArrayList h.a(h, java.util.ArrayList)>
	//   36  108:pop             
						break;
					}
					continue;
	//   37  109:goto            22
				}
				settingsuiservicedata = ((SettingsUIServiceData) (settingsuiservicedata.getAvailableSettings()));
	//   38  112:aload_1         
	//   39  113:invokevirtual   #88  <Method HashSet SettingsUIServiceData.getAvailableSettings()>
	//   40  116:astore_1        
				obj = ((Object) (a));
	//   41  117:aload_0         
	//   42  118:getfield        #13  <Field h a>
	//   43  121:astore          4
				flag = ((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.RobotLanguage)));
	//   44  123:aload_1         
	//   45  124:getstatic       #71  <Field SettingType SettingType.RobotLanguage>
	//   46  127:invokevirtual   #92  <Method boolean HashSet.contains(Object)>
	//   47  130:istore_2        
				boolean flag1 = false;
	//   48  131:iconst_0        
	//   49  132:istore_3        
				if(flag && ((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.RobotLanguagesAvailable))))
	//*  50  133:iload_2         
	//*  51  134:ifeq            152
	//*  52  137:aload_1         
	//*  53  138:getstatic       #95  <Field SettingType SettingType.RobotLanguagesAvailable>
	//*  54  141:invokevirtual   #92  <Method boolean HashSet.contains(Object)>
	//*  55  144:ifeq            152
					flag = true;
	//   56  147:iconst_1        
	//   57  148:istore_2        
				else
	//*  58  149:goto            154
					flag = false;
	//   59  152:iconst_0        
	//   60  153:istore_2        
				h.a(((h) (obj)), flag);
	//   61  154:aload           4
	//   62  156:iload_2         
	//   63  157:invokestatic    #98  <Method void h.a(h, boolean)>
				obj = ((Object) (h.a(a)));
	//   64  160:aload_0         
	//   65  161:getfield        #13  <Field h a>
	//   66  164:invokestatic    #101 <Method h$a h.a(h)>
	//   67  167:astore          4
				if(!((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.SingleLanguageOta))))
	//*  68  169:aload_1         
	//*  69  170:getstatic       #104 <Field SettingType SettingType.SingleLanguageOta>
	//*  70  173:invokevirtual   #92  <Method boolean HashSet.contains(Object)>
	//*  71  176:ifne            191
				{
					flag = flag1;
	//   72  179:iload_3         
	//   73  180:istore_2        
					if(!((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.MultiLanguageOta))))
						break label0;
	//   74  181:aload_1         
	//   75  182:getstatic       #107 <Field SettingType SettingType.MultiLanguageOta>
	//   76  185:invokevirtual   #92  <Method boolean HashSet.contains(Object)>
	//   77  188:ifeq            193
				}
				flag = true;
	//   78  191:iconst_1        
	//   79  192:istore_2        
			}
			((h$a) (obj)).a(flag);
	//   80  193:aload           4
	//   81  195:iload_2         
	//   82  196:invokeinterface #112 <Method void h$a.a(boolean)>
			break;
		} while(true);
	//   83  201:return          
	}

	final h a;

	private h$b(h h1)
	{
		a = h1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field h a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void SettingsUIServiceDataCallback()>
	//    5    9:return          
	}

	h$b(h h1, h$1 h$1_1)
	{
		this(h1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void h$b(h)>
	//    3    5:return          
	}
}
