// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.HashSet;

// Referenced classes of package com.irobot.home.fragments:
//			ao

private class ao$a extends SettingsUIServiceDataCallback
{

	public void onSettingsUIServiceDataChanged(SettingsUIServiceData settingsuiservicedata)
	{
		if(settingsuiservicedata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
		{
			o.d(ao.b(), "Service data is null.");
	//    2    4:invokestatic    #25  <Method String ao.b()>
	//    3    7:ldc1            #27  <String "Service data is null.">
	//    4    9:invokestatic    #33  <Method void o.d(String, String)>
			return;
	//    5   12:return          
		} else
		{
			settingsuiservicedata = ((SettingsUIServiceData) (settingsuiservicedata.getAvailableSettings()));
	//    6   13:aload_1         
	//    7   14:invokevirtual   #39  <Method HashSet SettingsUIServiceData.getAvailableSettings()>
	//    8   17:astore_1        
			ao.a(a, ((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.AreaCleaned))));
	//    9   18:aload_0         
	//   10   19:getfield        #12  <Field ao a>
	//   11   22:aload_1         
	//   12   23:getstatic       #45  <Field SettingType SettingType.AreaCleaned>
	//   13   26:invokevirtual   #51  <Method boolean HashSet.contains(Object)>
	//   14   29:invokestatic    #54  <Method boolean ao.a(ao, boolean)>
	//   15   32:pop             
			ao.a(a);
	//   16   33:aload_0         
	//   17   34:getfield        #12  <Field ao a>
	//   18   37:invokestatic    #56  <Method void ao.a(ao)>
			return;
	//   19   40:return          
		}
	}

	final ao a;

	private ao$a(ao ao1)
	{
		a = ao1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field ao a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void SettingsUIServiceDataCallback()>
	//    5    9:return          
	}

	ao$a(ao ao1, ao$1 ao$1)
	{
		this(ao1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void ao$a(ao)>
	//    3    5:return          
	}
}
