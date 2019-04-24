// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			CustomerRegistrationActivity

private class CustomerRegistrationActivity$a extends MissionUIServiceDataCallback
{

	public void onMissionUIServiceDataChanged(MissionUIServiceData missionuiservicedata)
	{
		if(missionuiservicedata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
		{
			o.e(com.irobot.home.CustomerRegistrationActivity.o(), "null service data");
	//    2    4:invokestatic    #25  <Method String com.irobot.home.CustomerRegistrationActivity.o()>
	//    3    7:ldc1            #27  <String "null service data">
	//    4    9:invokestatic    #33  <Method void o.e(String, String)>
			return;
	//    5   12:return          
		}
		Object obj = ((Object) (missionuiservicedata.getMissionDataStates()));
	//    6   13:aload_1         
	//    7   14:invokevirtual   #39  <Method ArrayList MissionUIServiceData.getMissionDataStates()>
	//    8   17:astore_2        
		String s = com.irobot.home.CustomerRegistrationActivity.o();
	//    9   18:invokestatic    #25  <Method String com.irobot.home.CustomerRegistrationActivity.o()>
	//   10   21:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   11   22:new             #41  <Class StringBuilder>
	//   12   25:dup             
	//   13   26:invokespecial   #42  <Method void StringBuilder()>
	//   14   29:astore          4
		stringbuilder.append("Change list: ");
	//   15   31:aload           4
	//   16   33:ldc1            #44  <String "Change list: ">
	//   17   35:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
		stringbuilder.append(((ArrayList) (obj)).toString());
	//   19   39:aload           4
	//   20   41:aload_2         
	//   21   42:invokevirtual   #53  <Method String ArrayList.toString()>
	//   22   45:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   23   48:pop             
		o.b(s, stringbuilder.toString());
	//   24   49:aload_3         
	//   25   50:aload           4
	//   26   52:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   27   55:invokestatic    #57  <Method void o.b(String, String)>
		obj = ((Object) (((ArrayList) (obj)).iterator()));
	//   28   58:aload_2         
	//   29   59:invokevirtual   #61  <Method Iterator ArrayList.iterator()>
	//   30   62:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   31   63:aload_2         
	//   32   64:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//   33   69:ifeq            117
			MissionDataState missiondatastate = (MissionDataState)((Iterator) (obj)).next();
	//   34   72:aload_2         
	//   35   73:invokeinterface #71  <Method Object Iterator.next()>
	//   36   78:checkcast       #73  <Class MissionDataState>
	//   37   81:astore_3        
			if(CustomerRegistrationActivity$2.a[missiondatastate.ordinal()] == 1)
	//*  38   82:getstatic       #78  <Field int[] CustomerRegistrationActivity$2.a>
	//*  39   85:aload_3         
	//*  40   86:invokevirtual   #82  <Method int MissionDataState.ordinal()>
	//*  41   89:iaload          
	//*  42   90:iconst_1        
	//*  43   91:icmpeq          97
	//*  44   94:goto            63
				CustomerRegistrationActivity.a(a, "Error 350".equals(((Object) (missionuiservicedata.getEvacHelpContentId()))));
	//   45   97:aload_0         
	//   46   98:getfield        #12  <Field CustomerRegistrationActivity a>
	//   47  101:ldc1            #84  <String "Error 350">
	//   48  103:aload_1         
	//   49  104:invokevirtual   #87  <Method String MissionUIServiceData.getEvacHelpContentId()>
	//   50  107:invokevirtual   #93  <Method boolean String.equals(Object)>
	//   51  110:invokestatic    #96  <Method boolean CustomerRegistrationActivity.a(CustomerRegistrationActivity, boolean)>
	//   52  113:pop             
		} while(true);
	//   53  114:goto            63
	//   54  117:return          
	}

	final CustomerRegistrationActivity a;

	private CustomerRegistrationActivity$a(CustomerRegistrationActivity customerregistrationactivity)
	{
		a = customerregistrationactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field CustomerRegistrationActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void MissionUIServiceDataCallback()>
	//    5    9:return          
	}

	CustomerRegistrationActivity$a(CustomerRegistrationActivity customerregistrationactivity, CustomerRegistrationActivity$1 customerregistrationactivity$1)
	{
		this(customerregistrationactivity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void CustomerRegistrationActivity$a(CustomerRegistrationActivity)>
	//    3    5:return          
	}
}
