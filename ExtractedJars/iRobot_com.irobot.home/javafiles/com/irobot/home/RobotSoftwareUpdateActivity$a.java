// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			RobotSoftwareUpdateActivity

private class RobotSoftwareUpdateActivity$a extends OTAUIServiceDataCallback
{

	public void onOTAUIServiceDataChanged(OTAUIServiceData otauiservicedata)
	{
		if(otauiservicedata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		Object obj = ((Object) (otauiservicedata.getDataStates()));
	//    3    5:aload_1         
	//    4    6:invokevirtual   #27  <Method ArrayList OTAUIServiceData.getDataStates()>
	//    5    9:astore_2        
		String s = RobotSoftwareUpdateActivity.q();
	//    6   10:invokestatic    #31  <Method String RobotSoftwareUpdateActivity.q()>
	//    7   13:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    8   14:new             #33  <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #34  <Method void StringBuilder()>
	//   11   21:astore          4
		stringbuilder.append("Change list: ");
	//   12   23:aload           4
	//   13   25:ldc1            #36  <String "Change list: ">
	//   14   27:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
		stringbuilder.append(((ArrayList) (obj)).toString());
	//   16   31:aload           4
	//   17   33:aload_2         
	//   18   34:invokevirtual   #45  <Method String ArrayList.toString()>
	//   19   37:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   20   40:pop             
		o.b(s, stringbuilder.toString());
	//   21   41:aload_3         
	//   22   42:aload           4
	//   23   44:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   24   47:invokestatic    #52  <Method void o.b(String, String)>
		obj = ((Object) (((ArrayList) (obj)).iterator()));
	//   25   50:aload_2         
	//   26   51:invokevirtual   #56  <Method Iterator ArrayList.iterator()>
	//   27   54:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   28   55:aload_2         
	//   29   56:invokeinterface #62  <Method boolean Iterator.hasNext()>
	//   30   61:ifeq            135
			OTAUIServiceDataState otauiservicedatastate = (OTAUIServiceDataState)((Iterator) (obj)).next();
	//   31   64:aload_2         
	//   32   65:invokeinterface #66  <Method Object Iterator.next()>
	//   33   70:checkcast       #68  <Class OTAUIServiceDataState>
	//   34   73:astore_3        
			switch(RobotSoftwareUpdateActivity$1.a[otauiservicedatastate.ordinal()])
	//*  35   74:getstatic       #73  <Field int[] RobotSoftwareUpdateActivity$1.a>
	//*  36   77:aload_3         
	//*  37   78:invokevirtual   #77  <Method int OTAUIServiceDataState.ordinal()>
	//*  38   81:iaload          
			{
	//*  39   82:tableswitch     1 2: default 104
	//	               1 121
	//	               2 107
	//*  40  104:goto            55
			case 2: // '\002'
				RobotSoftwareUpdateActivity.a(a, otauiservicedata.getSoftwareUpdateStatus());
	//   41  107:aload_0         
	//   42  108:getfield        #12  <Field RobotSoftwareUpdateActivity a>
	//   43  111:aload_1         
	//   44  112:invokevirtual   #81  <Method com.irobot.core.SoftwareUpdateStatus OTAUIServiceData.getSoftwareUpdateStatus()>
	//   45  115:invokestatic    #84  <Method void RobotSoftwareUpdateActivity.a(RobotSoftwareUpdateActivity, com.irobot.core.SoftwareUpdateStatus)>
				break;

	//*  46  118:goto            55
			case 1: // '\001'
				RobotSoftwareUpdateActivity.a(a, otauiservicedata.getExpeditedOtaStatus());
	//   47  121:aload_0         
	//   48  122:getfield        #12  <Field RobotSoftwareUpdateActivity a>
	//   49  125:aload_1         
	//   50  126:invokevirtual   #88  <Method com.irobot.core.ExpeditedOtaStatus OTAUIServiceData.getExpeditedOtaStatus()>
	//   51  129:invokestatic    #91  <Method void RobotSoftwareUpdateActivity.a(RobotSoftwareUpdateActivity, com.irobot.core.ExpeditedOtaStatus)>
				break;
			}
		} while(true);
	//*  52  132:goto            55
	//   53  135:return          
	}

	final RobotSoftwareUpdateActivity a;

	private RobotSoftwareUpdateActivity$a(RobotSoftwareUpdateActivity robotsoftwareupdateactivity)
	{
		a = robotsoftwareupdateactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field RobotSoftwareUpdateActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void OTAUIServiceDataCallback()>
	//    5    9:return          
	}

	RobotSoftwareUpdateActivity$a(RobotSoftwareUpdateActivity robotsoftwareupdateactivity, RobotSoftwareUpdateActivity$1 robotsoftwareupdateactivity$1)
	{
		this(robotsoftwareupdateactivity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void RobotSoftwareUpdateActivity$a(RobotSoftwareUpdateActivity)>
	//    3    5:return          
	}
}
