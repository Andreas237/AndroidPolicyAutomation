// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			MoreTableViewActivity

private class MoreTableViewActivity$a extends OTAUIServiceDataCallback
{

	public void onOTAUIServiceDataChanged(OTAUIServiceData otauiservicedata)
	{
		if(otauiservicedata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		Iterator iterator = otauiservicedata.getDataStates().iterator();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #27  <Method ArrayList OTAUIServiceData.getDataStates()>
	//    5    9:invokevirtual   #33  <Method Iterator ArrayList.iterator()>
	//    6   12:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//    7   13:aload_3         
	//    8   14:invokeinterface #39  <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            99
			OTAUIServiceDataState otauiservicedatastate = (OTAUIServiceDataState)iterator.next();
	//   10   22:aload_3         
	//   11   23:invokeinterface #43  <Method Object Iterator.next()>
	//   12   28:checkcast       #45  <Class OTAUIServiceDataState>
	//   13   31:astore          4
			switch(MoreTableViewActivity$1.a[otauiservicedatastate.ordinal()])
	//*  14   33:getstatic       #50  <Field int[] MoreTableViewActivity$1.a>
	//*  15   36:aload           4
	//*  16   38:invokevirtual   #54  <Method int OTAUIServiceDataState.ordinal()>
	//*  17   41:iaload          
			{
	//*  18   42:tableswitch     1 2: default 64
	//	               1 13
	//	               2 67
	//*  19   64:goto            13
			case 2: // '\002'
				MoreTableViewActivity moretableviewactivity = a;
	//   20   67:aload_0         
	//   21   68:getfield        #12  <Field MoreTableViewActivity a>
	//   22   71:astore          4
				boolean flag;
				if(otauiservicedata.getSoftwareUpdateStatus() == SoftwareUpdateStatus.AvailableAndReady)
	//*  23   73:aload_1         
	//*  24   74:invokevirtual   #58  <Method SoftwareUpdateStatus OTAUIServiceData.getSoftwareUpdateStatus()>
	//*  25   77:getstatic       #64  <Field SoftwareUpdateStatus SoftwareUpdateStatus.AvailableAndReady>
	//*  26   80:if_acmpne       88
					flag = true;
	//   27   83:iconst_1        
	//   28   84:istore_2        
				else
	//*  29   85:goto            90
					flag = false;
	//   30   88:iconst_0        
	//   31   89:istore_2        
				moretableviewactivity.a(flag);
	//   32   90:aload           4
	//   33   92:iload_2         
	//   34   93:invokevirtual   #67  <Method void MoreTableViewActivity.a(boolean)>
				break;
			}
		} while(true);
	//*  35   96:goto            13
	//   36   99:return          
	}

	final MoreTableViewActivity a;

	private MoreTableViewActivity$a(MoreTableViewActivity moretableviewactivity)
	{
		a = moretableviewactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field MoreTableViewActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void OTAUIServiceDataCallback()>
	//    5    9:return          
	}

	MoreTableViewActivity$a(MoreTableViewActivity moretableviewactivity, MoreTableViewActivity$1 moretableviewactivity$1)
	{
		this(moretableviewactivity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void MoreTableViewActivity$a(MoreTableViewActivity)>
	//    3    5:return          
	}
}
