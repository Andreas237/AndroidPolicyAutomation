// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			BaseCleanActivity

class BaseCleanActivity$1 extends SettingsUIServiceDataCallback
{

	public void onSettingsUIServiceDataChanged(SettingsUIServiceData settingsuiservicedata)
	{
		Iterator iterator = settingsuiservicedata.getSettingsChangeList().iterator();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #24  <Method HashSet SettingsUIServiceData.getSettingsChangeList()>
	//    2    4:invokevirtual   #30  <Method Iterator HashSet.iterator()>
	//    3    7:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    4    8:aload_2         
	//    5    9:invokeinterface #36  <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            100
			SettingType settingtype = (SettingType)iterator.next();
	//    7   17:aload_2         
	//    8   18:invokeinterface #40  <Method Object Iterator.next()>
	//    9   23:checkcast       #42  <Class SettingType>
	//   10   26:astore_3        
			if(BaseCleanActivity$6.a[settingtype.ordinal()] == 1)
	//*  11   27:getstatic       #47  <Field int[] BaseCleanActivity$6.a>
	//*  12   30:aload_3         
	//*  13   31:invokevirtual   #51  <Method int SettingType.ordinal()>
	//*  14   34:iaload          
	//*  15   35:iconst_1        
	//*  16   36:icmpeq          42
	//*  17   39:goto            8
			{
				String s = settingsuiservicedata.getStringSetting(SettingType.Name);
	//   18   42:aload_1         
	//   19   43:getstatic       #55  <Field SettingType SettingType.Name>
	//   20   46:invokevirtual   #59  <Method String SettingsUIServiceData.getStringSetting(SettingType)>
	//   21   49:astore_3        
				a.b(s);
	//   22   50:aload_0         
	//   23   51:getfield        #12  <Field BaseCleanActivity a>
	//   24   54:aload_3         
	//   25   55:invokevirtual   #63  <Method void BaseCleanActivity.b(String)>
				String s1 = BaseCleanActivity.t();
	//   26   58:invokestatic    #67  <Method String BaseCleanActivity.t()>
	//   27   61:astore          4
				StringBuilder stringbuilder = new StringBuilder();
	//   28   63:new             #69  <Class StringBuilder>
	//   29   66:dup             
	//   30   67:invokespecial   #70  <Method void StringBuilder()>
	//   31   70:astore          5
				stringbuilder.append("Robot name is: ");
	//   32   72:aload           5
	//   33   74:ldc1            #72  <String "Robot name is: ">
	//   34   76:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   35   79:pop             
				stringbuilder.append(s);
	//   36   80:aload           5
	//   37   82:aload_3         
	//   38   83:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   39   86:pop             
				o.b(s1, stringbuilder.toString());
	//   40   87:aload           4
	//   41   89:aload           5
	//   42   91:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   43   94:invokestatic    #84  <Method void o.b(String, String)>
			}
		} while(true);
	//   44   97:goto            8
	//   45  100:return          
	}

	final BaseCleanActivity a;

	BaseCleanActivity$1(BaseCleanActivity basecleanactivity)
	{
		a = basecleanactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field BaseCleanActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void SettingsUIServiceDataCallback()>
	//    5    9:return          
	}
}
