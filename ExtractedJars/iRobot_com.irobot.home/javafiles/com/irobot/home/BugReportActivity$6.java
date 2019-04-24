// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			BugReportActivity

class BugReportActivity$6 extends ApplicationUIServiceDataCallback
{

	public void onApplicationUIServiceDataChanged(ApplicationUIServiceData applicationuiservicedata)
	{
		applicationuiservicedata = ((ApplicationUIServiceData) (applicationuiservicedata.getViewStateChangelist().iterator()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #24  <Method ArrayList ApplicationUIServiceData.getViewStateChangelist()>
	//    2    4:invokevirtual   #30  <Method Iterator ArrayList.iterator()>
	//    3    7:astore_1        
		do
		{
			if(!((Iterator) (applicationuiservicedata)).hasNext())
				break;
	//    4    8:aload_1         
	//    5    9:invokeinterface #36  <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            126
			ApplicationUIState applicationuistate = (ApplicationUIState)((Iterator) (applicationuiservicedata)).next();
	//    7   17:aload_1         
	//    8   18:invokeinterface #40  <Method Object Iterator.next()>
	//    9   23:checkcast       #42  <Class ApplicationUIState>
	//   10   26:astore_2        
			switch(BugReportActivity$7.a[applicationuistate.ordinal()])
	//*  11   27:getstatic       #47  <Field int[] BugReportActivity$7.a>
	//*  12   30:aload_2         
	//*  13   31:invokevirtual   #51  <Method int ApplicationUIState.ordinal()>
	//*  14   34:iaload          
			{
	//*  15   35:tableswitch     1 3: default 60
	//	               1 116
	//	               2 106
	//	               3 96
			default:
				StringBuilder stringbuilder = new StringBuilder();
	//   16   60:new             #53  <Class StringBuilder>
	//   17   63:dup             
	//   18   64:invokespecial   #54  <Method void StringBuilder()>
	//   19   67:astore_3        
				stringbuilder.append("Unhandled ApplicationUIState: ");
	//   20   68:aload_3         
	//   21   69:ldc1            #56  <String "Unhandled ApplicationUIState: ">
	//   22   71:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   23   74:pop             
				stringbuilder.append(applicationuistate.name());
	//   24   75:aload_3         
	//   25   76:aload_2         
	//   26   77:invokevirtual   #64  <Method String ApplicationUIState.name()>
	//   27   80:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   28   83:pop             
				o.d("BugReport", stringbuilder.toString());
	//   29   84:ldc1            #66  <String "BugReport">
	//   30   86:aload_3         
	//   31   87:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   32   90:invokestatic    #75  <Method void o.d(String, String)>
				break;

	//*  33   93:goto            8
			case 3: // '\003'
				BugReportActivity.h(a);
	//   34   96:aload_0         
	//   35   97:getfield        #12  <Field BugReportActivity a>
	//   36  100:invokestatic    #78  <Method void BugReportActivity.h(BugReportActivity)>
				break;

	//*  37  103:goto            8
			case 2: // '\002'
				BugReportActivity.g(a);
	//   38  106:aload_0         
	//   39  107:getfield        #12  <Field BugReportActivity a>
	//   40  110:invokestatic    #81  <Method void BugReportActivity.g(BugReportActivity)>
				break;

	//*  41  113:goto            8
			case 1: // '\001'
				BugReportActivity.f(a);
	//   42  116:aload_0         
	//   43  117:getfield        #12  <Field BugReportActivity a>
	//   44  120:invokestatic    #84  <Method void BugReportActivity.f(BugReportActivity)>
				break;
			}
		} while(true);
	//*  45  123:goto            8
	//   46  126:return          
	}

	final BugReportActivity a;

	BugReportActivity$6(BugReportActivity bugreportactivity)
	{
		a = bugreportactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field BugReportActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void ApplicationUIServiceDataCallback()>
	//    5    9:return          
	}
}
