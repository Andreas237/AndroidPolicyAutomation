// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			PickABraavaActivity

class PickABraavaActivity$9 extends SettingsUIServiceDataCallback
{

	public void onSettingsUIServiceDataChanged(SettingsUIServiceData settingsuiservicedata)
	{
		if(settingsuiservicedata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			o.e("PickABraava", "Service data was null.");
	//    2    4:ldc1            #31  <String "PickABraava">
	//    3    6:ldc1            #33  <String "Service data was null.">
	//    4    8:invokestatic    #39  <Method void o.e(String, String)>
			return;
	//    5   11:return          
		}
		Iterator iterator = settingsuiservicedata.getSettingsChangeList().iterator();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #45  <Method HashSet SettingsUIServiceData.getSettingsChangeList()>
	//    8   16:invokevirtual   #51  <Method Iterator HashSet.iterator()>
	//    9   19:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//   10   20:aload_2         
	//   11   21:invokeinterface #57  <Method boolean Iterator.hasNext()>
	//   12   26:ifeq            92
			SettingType settingtype = (SettingType)iterator.next();
	//   13   29:aload_2         
	//   14   30:invokeinterface #61  <Method Object Iterator.next()>
	//   15   35:checkcast       #63  <Class SettingType>
	//   16   38:astore_3        
			if(PickABraavaActivity$3.a[settingtype.ordinal()] == 1)
	//*  17   39:getstatic       #68  <Field int[] PickABraavaActivity$3.a>
	//*  18   42:aload_3         
	//*  19   43:invokevirtual   #72  <Method int SettingType.ordinal()>
	//*  20   46:iaload          
	//*  21   47:iconst_1        
	//*  22   48:icmpeq          54
	//*  23   51:goto            20
			{
				a.unregisterSubscriber(((SettingsUIServiceDataCallback) (this)));
	//   24   54:aload_0         
	//   25   55:getfield        #21  <Field SettingsSubsystem a>
	//   26   58:aload_0         
	//   27   59:invokevirtual   #78  <Method boolean SettingsSubsystem.unregisterSubscriber(SettingsUIServiceDataCallback)>
	//   28   62:pop             
				PickABraavaActivity.a(c, settingsuiservicedata.getBooleanSetting(SettingType.Registered));
	//   29   63:aload_0         
	//   30   64:getfield        #19  <Field PickABraavaActivity c>
	//   31   67:aload_1         
	//   32   68:getstatic       #82  <Field SettingType SettingType.Registered>
	//   33   71:invokevirtual   #86  <Method boolean SettingsUIServiceData.getBooleanSetting(SettingType)>
	//   34   74:invokestatic    #89  <Method boolean PickABraavaActivity.a(PickABraavaActivity, boolean)>
	//   35   77:pop             
				c.a(b);
	//   36   78:aload_0         
	//   37   79:getfield        #19  <Field PickABraavaActivity c>
	//   38   82:aload_0         
	//   39   83:getfield        #23  <Field String b>
	//   40   86:invokevirtual   #92  <Method void PickABraavaActivity.a(String)>
			}
		} while(true);
	//   41   89:goto            20
	//   42   92:return          
	}

	final SettingsSubsystem a;
	final String b;
	final PickABraavaActivity c;

	PickABraavaActivity$9(PickABraavaActivity pickabraavaactivity, SettingsSubsystem settingssubsystem, String s)
	{
		c = pickabraavaactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field PickABraavaActivity c>
		a = settingssubsystem;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field SettingsSubsystem a>
		b = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #23  <Field String b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #26  <Method void SettingsUIServiceDataCallback()>
	//   11   19:return          
	}
}
