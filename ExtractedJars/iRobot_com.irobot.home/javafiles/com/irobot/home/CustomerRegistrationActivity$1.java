// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			CustomerRegistrationActivity

class CustomerRegistrationActivity$1 extends SettingsUIServiceDataCallback
{

	public void onSettingsUIServiceDataChanged(SettingsUIServiceData settingsuiservicedata)
	{
		if(settingsuiservicedata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
		{
			o.e(com.irobot.home.CustomerRegistrationActivity.o(), "Received null service data.");
	//    2    4:invokestatic    #22  <Method String com.irobot.home.CustomerRegistrationActivity.o()>
	//    3    7:ldc1            #24  <String "Received null service data.">
	//    4    9:invokestatic    #30  <Method void o.e(String, String)>
			return;
	//    5   12:return          
		}
		Iterator iterator = settingsuiservicedata.getSettingsChangeList().iterator();
	//    6   13:aload_1         
	//    7   14:invokevirtual   #36  <Method HashSet SettingsUIServiceData.getSettingsChangeList()>
	//    8   17:invokevirtual   #42  <Method Iterator HashSet.iterator()>
	//    9   20:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//   10   21:aload_2         
	//   11   22:invokeinterface #48  <Method boolean Iterator.hasNext()>
	//   12   27:ifeq            73
			SettingType settingtype = (SettingType)iterator.next();
	//   13   30:aload_2         
	//   14   31:invokeinterface #52  <Method Object Iterator.next()>
	//   15   36:checkcast       #54  <Class SettingType>
	//   16   39:astore_3        
			if(CustomerRegistrationActivity$2.b[settingtype.ordinal()] == 1)
	//*  17   40:getstatic       #60  <Field int[] CustomerRegistrationActivity$2.b>
	//*  18   43:aload_3         
	//*  19   44:invokevirtual   #64  <Method int SettingType.ordinal()>
	//*  20   47:iaload          
	//*  21   48:iconst_1        
	//*  22   49:icmpeq          55
	//*  23   52:goto            21
				CustomerRegistrationActivity.a(a, settingsuiservicedata.getStringSetting(SettingType.SerialNumber));
	//   24   55:aload_0         
	//   25   56:getfield        #12  <Field CustomerRegistrationActivity a>
	//   26   59:aload_1         
	//   27   60:getstatic       #68  <Field SettingType SettingType.SerialNumber>
	//   28   63:invokevirtual   #72  <Method String SettingsUIServiceData.getStringSetting(SettingType)>
	//   29   66:invokestatic    #75  <Method String CustomerRegistrationActivity.a(CustomerRegistrationActivity, String)>
	//   30   69:pop             
		} while(true);
	//   31   70:goto            21
		if(!CustomerRegistrationActivity.a(a))
	//*  32   73:aload_0         
	//*  33   74:getfield        #12  <Field CustomerRegistrationActivity a>
	//*  34   77:invokestatic    #78  <Method boolean CustomerRegistrationActivity.a(CustomerRegistrationActivity)>
	//*  35   80:ifne            90
			a.j();
	//   36   83:aload_0         
	//   37   84:getfield        #12  <Field CustomerRegistrationActivity a>
	//   38   87:invokevirtual   #81  <Method void CustomerRegistrationActivity.j()>
		a.i();
	//   39   90:aload_0         
	//   40   91:getfield        #12  <Field CustomerRegistrationActivity a>
	//   41   94:invokevirtual   #84  <Method void CustomerRegistrationActivity.i()>
	//   42   97:return          
	}

	final CustomerRegistrationActivity a;

	CustomerRegistrationActivity$1(CustomerRegistrationActivity customerregistrationactivity)
	{
		a = customerregistrationactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field CustomerRegistrationActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void SettingsUIServiceDataCallback()>
	//    5    9:return          
	}
}
