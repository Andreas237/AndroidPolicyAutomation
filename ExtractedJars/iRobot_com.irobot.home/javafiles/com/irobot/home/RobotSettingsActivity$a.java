// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			RobotSettingsActivity

private class RobotSettingsActivity$a extends OTAUIServiceDataCallback
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
	//    5    9:astore_3        
		String s = RobotSettingsActivity.z();
	//    6   10:invokestatic    #31  <Method String RobotSettingsActivity.z()>
	//    7   13:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//    8   15:new             #33  <Class StringBuilder>
	//    9   18:dup             
	//   10   19:invokespecial   #34  <Method void StringBuilder()>
	//   11   22:astore          5
		stringbuilder.append("Change list: ");
	//   12   24:aload           5
	//   13   26:ldc1            #36  <String "Change list: ">
	//   14   28:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
		stringbuilder.append(((ArrayList) (obj)).toString());
	//   16   32:aload           5
	//   17   34:aload_3         
	//   18   35:invokevirtual   #45  <Method String ArrayList.toString()>
	//   19   38:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   20   41:pop             
		o.b(s, stringbuilder.toString());
	//   21   42:aload           4
	//   22   44:aload           5
	//   23   46:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   24   49:invokestatic    #52  <Method void o.b(String, String)>
		obj = ((Object) (((ArrayList) (obj)).iterator()));
	//   25   52:aload_3         
	//   26   53:invokevirtual   #56  <Method Iterator ArrayList.iterator()>
	//   27   56:astore_3        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   28   57:aload_3         
	//   29   58:invokeinterface #62  <Method boolean Iterator.hasNext()>
	//   30   63:ifeq            143
			OTAUIServiceDataState otauiservicedatastate = (OTAUIServiceDataState)((Iterator) (obj)).next();
	//   31   66:aload_3         
	//   32   67:invokeinterface #66  <Method Object Iterator.next()>
	//   33   72:checkcast       #68  <Class OTAUIServiceDataState>
	//   34   75:astore          4
			switch(RobotSettingsActivity$2.a[otauiservicedatastate.ordinal()])
	//*  35   77:getstatic       #73  <Field int[] RobotSettingsActivity$2.a>
	//*  36   80:aload           4
	//*  37   82:invokevirtual   #77  <Method int OTAUIServiceDataState.ordinal()>
	//*  38   85:iaload          
			{
	//*  39   86:tableswitch     1 2: default 108
	//	               1 57
	//	               2 111
	//*  40  108:goto            57
			case 2: // '\002'
				RobotSettingsActivity robotsettingsactivity = a;
	//   41  111:aload_0         
	//   42  112:getfield        #12  <Field RobotSettingsActivity a>
	//   43  115:astore          4
				boolean flag;
				if(otauiservicedata.getSoftwareUpdateStatus() == SoftwareUpdateStatus.AvailableAndReady)
	//*  44  117:aload_1         
	//*  45  118:invokevirtual   #81  <Method SoftwareUpdateStatus OTAUIServiceData.getSoftwareUpdateStatus()>
	//*  46  121:getstatic       #87  <Field SoftwareUpdateStatus SoftwareUpdateStatus.AvailableAndReady>
	//*  47  124:if_acmpne       132
					flag = true;
	//   48  127:iconst_1        
	//   49  128:istore_2        
				else
	//*  50  129:goto            134
					flag = false;
	//   51  132:iconst_0        
	//   52  133:istore_2        
				robotsettingsactivity.g(flag);
	//   53  134:aload           4
	//   54  136:iload_2         
	//   55  137:invokevirtual   #91  <Method void RobotSettingsActivity.g(boolean)>
				break;
			}
		} while(true);
	//*  56  140:goto            57
	//   57  143:return          
	}

	final RobotSettingsActivity a;

	private RobotSettingsActivity$a(RobotSettingsActivity robotsettingsactivity)
	{
		a = robotsettingsactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field RobotSettingsActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void OTAUIServiceDataCallback()>
	//    5    9:return          
	}

	RobotSettingsActivity$a(RobotSettingsActivity robotsettingsactivity, RobotSettingsActivity$1 robotsettingsactivity$1)
	{
		this(robotsettingsactivity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void RobotSettingsActivity$a(RobotSettingsActivity)>
	//    3    5:return          
	}
}
