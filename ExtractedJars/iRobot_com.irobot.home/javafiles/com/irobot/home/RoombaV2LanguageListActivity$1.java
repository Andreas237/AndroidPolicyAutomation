// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			RoombaV2LanguageListActivity

class RoombaV2LanguageListActivity$1 extends SettingsUIServiceDataCallback
{

	public void onSettingsUIServiceDataChanged(SettingsUIServiceData settingsuiservicedata)
	{
		if(settingsuiservicedata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			o.e("AwsLangListActivity", "Service data was null.");
	//    2    4:ldc1            #27  <String "AwsLangListActivity">
	//    3    6:ldc1            #29  <String "Service data was null.">
	//    4    8:invokestatic    #35  <Method void o.e(String, String)>
			return;
	//    5   11:return          
		}
		Iterator iterator = settingsuiservicedata.getSettingsChangeList().iterator();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #41  <Method HashSet SettingsUIServiceData.getSettingsChangeList()>
	//    8   16:invokevirtual   #47  <Method Iterator HashSet.iterator()>
	//    9   19:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//   10   20:aload_2         
	//   11   21:invokeinterface #53  <Method boolean Iterator.hasNext()>
	//   12   26:ifeq            77
			SettingType settingtype = (SettingType)iterator.next();
	//   13   29:aload_2         
	//   14   30:invokeinterface #57  <Method Object Iterator.next()>
	//   15   35:checkcast       #59  <Class SettingType>
	//   16   38:astore_3        
			if(RoombaV2LanguageListActivity$5.a[settingtype.ordinal()] == 1)
	//*  17   39:getstatic       #64  <Field int[] RoombaV2LanguageListActivity$5.a>
	//*  18   42:aload_3         
	//*  19   43:invokevirtual   #68  <Method int SettingType.ordinal()>
	//*  20   46:iaload          
	//*  21   47:iconst_1        
	//*  22   48:icmpeq          54
	//*  23   51:goto            20
			{
				a.unregisterSubscriber(((SettingsUIServiceDataCallback) (this)));
	//   24   54:aload_0         
	//   25   55:getfield        #19  <Field SettingsSubsystem a>
	//   26   58:aload_0         
	//   27   59:invokevirtual   #74  <Method boolean SettingsSubsystem.unregisterSubscriber(SettingsUIServiceDataCallback)>
	//   28   62:pop             
				b.processAvailableLanguages(settingsuiservicedata.getAvailableLanguages());
	//   29   63:aload_0         
	//   30   64:getfield        #17  <Field RoombaV2LanguageListActivity b>
	//   31   67:aload_1         
	//   32   68:invokevirtual   #78  <Method java.util.ArrayList SettingsUIServiceData.getAvailableLanguages()>
	//   33   71:invokevirtual   #82  <Method void RoombaV2LanguageListActivity.processAvailableLanguages(java.util.ArrayList)>
			}
		} while(true);
	//   34   74:goto            20
	//   35   77:return          
	}

	final SettingsSubsystem a;
	final RoombaV2LanguageListActivity b;

	RoombaV2LanguageListActivity$1(RoombaV2LanguageListActivity roombav2languagelistactivity, SettingsSubsystem settingssubsystem)
	{
		b = roombav2languagelistactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field RoombaV2LanguageListActivity b>
		a = settingssubsystem;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field SettingsSubsystem a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void SettingsUIServiceDataCallback()>
	//    8   14:return          
	}
}
