// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home.fragments:
//			be

private class be$a extends OTAUIServiceDataCallback
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
		o.b("RobotCleanFragment", stringbuilder.toString());
	//   19   37:ldc1            #44  <String "RobotCleanFragment">
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
	//   28   58:ifeq            139
			OTAUIServiceDataState otauiservicedatastate = (OTAUIServiceDataState)((Iterator) (obj)).next();
	//   29   61:aload_3         
	//   30   62:invokeinterface #65  <Method Object Iterator.next()>
	//   31   67:checkcast       #67  <Class OTAUIServiceDataState>
	//   32   70:astore          4
			switch(be$5.b[otauiservicedatastate.ordinal()])
	//*  33   72:getstatic       #72  <Field int[] be$5.b>
	//*  34   75:aload           4
	//*  35   77:invokevirtual   #76  <Method int OTAUIServiceDataState.ordinal()>
	//*  36   80:iaload          
			{
	//*  37   81:tableswitch     1 2: default 104
	//	               1 52
	//	               2 107
	//*  38  104:goto            52
			case 2: // '\002'
				be be1 = a;
	//   39  107:aload_0         
	//   40  108:getfield        #12  <Field be a>
	//   41  111:astore          4
				boolean flag;
				if(otauiservicedata.getSoftwareUpdateStatus() == SoftwareUpdateStatus.AvailableAndReady)
	//*  42  113:aload_1         
	//*  43  114:invokevirtual   #80  <Method SoftwareUpdateStatus OTAUIServiceData.getSoftwareUpdateStatus()>
	//*  44  117:getstatic       #86  <Field SoftwareUpdateStatus SoftwareUpdateStatus.AvailableAndReady>
	//*  45  120:if_acmpne       128
					flag = true;
	//   46  123:iconst_1        
	//   47  124:istore_2        
				else
	//*  48  125:goto            130
					flag = false;
	//   49  128:iconst_0        
	//   50  129:istore_2        
				be1.f(flag);
	//   51  130:aload           4
	//   52  132:iload_2         
	//   53  133:invokevirtual   #90  <Method void be.f(boolean)>
				break;
			}
		} while(true);
	//*  54  136:goto            52
	//   55  139:return          
	}

	final be a;

	private be$a(be be1)
	{
		a = be1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field be a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void OTAUIServiceDataCallback()>
	//    5    9:return          
	}

	be$a(be be1, be$1 be$1)
	{
		this(be1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void be$a(be)>
	//    3    5:return          
	}
}
