// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			AboutRobotTableViewActivity

private class AboutRobotTableViewActivity$a extends OTAUIServiceDataCallback
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
		StringBuilder stringbuilder = new StringBuilder();
	//    6   10:new             #29  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #30  <Method void StringBuilder()>
	//    9   17:astore          4
		stringbuilder.append("Change list: ");
	//   10   19:aload           4
	//   11   21:ldc1            #32  <String "Change list: ">
	//   12   23:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(((ArrayList) (obj)).toString());
	//   14   27:aload           4
	//   15   29:aload_3         
	//   16   30:invokevirtual   #42  <Method String ArrayList.toString()>
	//   17   33:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
		o.b("AboutRobot", stringbuilder.toString());
	//   19   37:ldc1            #44  <String "AboutRobot">
	//   20   39:aload           4
	//   21   41:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   22   44:invokestatic    #51  <Method void o.b(String, String)>
		obj = ((Object) (((ArrayList) (obj)).iterator()));
	//   23   47:aload_3         
	//   24   48:invokevirtual   #55  <Method Iterator ArrayList.iterator()>
	//   25   51:astore_3        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   26   52:aload_3         
	//   27   53:invokeinterface #61  <Method boolean Iterator.hasNext()>
	//   28   58:ifeq            154
			OTAUIServiceDataState otauiservicedatastate = (OTAUIServiceDataState)((Iterator) (obj)).next();
	//   29   61:aload_3         
	//   30   62:invokeinterface #65  <Method Object Iterator.next()>
	//   31   67:checkcast       #67  <Class OTAUIServiceDataState>
	//   32   70:astore          4
			switch(AboutRobotTableViewActivity$3.a[otauiservicedatastate.ordinal()])
	//*  33   72:getstatic       #72  <Field int[] AboutRobotTableViewActivity$3.a>
	//*  34   75:aload           4
	//*  35   77:invokevirtual   #76  <Method int OTAUIServiceDataState.ordinal()>
	//*  36   80:iaload          
			{
	//*  37   81:tableswitch     1 2: default 104
	//	               1 52
	//	               2 107
	//*  38  104:goto            52
			case 2: // '\002'
				AboutRobotTableViewActivity.a(a, otauiservicedata.getSoftwareUpdateStatus());
	//   39  107:aload_0         
	//   40  108:getfield        #12  <Field AboutRobotTableViewActivity a>
	//   41  111:aload_1         
	//   42  112:invokevirtual   #80  <Method SoftwareUpdateStatus OTAUIServiceData.getSoftwareUpdateStatus()>
	//   43  115:invokestatic    #83  <Method SoftwareUpdateStatus AboutRobotTableViewActivity.a(AboutRobotTableViewActivity, SoftwareUpdateStatus)>
	//   44  118:pop             
				AboutRobotTableViewActivity aboutrobottableviewactivity = a;
	//   45  119:aload_0         
	//   46  120:getfield        #12  <Field AboutRobotTableViewActivity a>
	//   47  123:astore          4
				boolean flag;
				if(AboutRobotTableViewActivity.a(a) == SoftwareUpdateStatus.AvailableAndReady)
	//*  48  125:aload_0         
	//*  49  126:getfield        #12  <Field AboutRobotTableViewActivity a>
	//*  50  129:invokestatic    #86  <Method SoftwareUpdateStatus AboutRobotTableViewActivity.a(AboutRobotTableViewActivity)>
	//*  51  132:getstatic       #92  <Field SoftwareUpdateStatus SoftwareUpdateStatus.AvailableAndReady>
	//*  52  135:if_acmpne       143
					flag = true;
	//   53  138:iconst_1        
	//   54  139:istore_2        
				else
	//*  55  140:goto            145
					flag = false;
	//   56  143:iconst_0        
	//   57  144:istore_2        
				aboutrobottableviewactivity.a(flag);
	//   58  145:aload           4
	//   59  147:iload_2         
	//   60  148:invokevirtual   #95  <Method void AboutRobotTableViewActivity.a(boolean)>
				break;
			}
		} while(true);
	//*  61  151:goto            52
	//   62  154:return          
	}

	final AboutRobotTableViewActivity a;

	private AboutRobotTableViewActivity$a(AboutRobotTableViewActivity aboutrobottableviewactivity)
	{
		a = aboutrobottableviewactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field AboutRobotTableViewActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void OTAUIServiceDataCallback()>
	//    5    9:return          
	}

	AboutRobotTableViewActivity$a(AboutRobotTableViewActivity aboutrobottableviewactivity, AboutRobotTableViewActivity$1 aboutrobottableviewactivity$1)
	{
		this(aboutrobottableviewactivity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void AboutRobotTableViewActivity$a(AboutRobotTableViewActivity)>
	//    3    5:return          
	}
}
