// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			OtaMqttActivity

private class OtaMqttActivity$a extends OTAUIServiceDataCallback
{

	public void onOTAUIServiceDataChanged(OTAUIServiceData otauiservicedata)
	{
		if(otauiservicedata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
		{
			o.b(OtaMqttActivity.h(), "null service data");
	//    2    4:invokestatic    #25  <Method String OtaMqttActivity.h()>
	//    3    7:ldc1            #27  <String "null service data">
	//    4    9:invokestatic    #33  <Method void o.b(String, String)>
			return;
	//    5   12:return          
		}
		Object obj = ((Object) (otauiservicedata.getDataStates()));
	//    6   13:aload_1         
	//    7   14:invokevirtual   #39  <Method ArrayList OTAUIServiceData.getDataStates()>
	//    8   17:astore_2        
		String s = OtaMqttActivity.h();
	//    9   18:invokestatic    #25  <Method String OtaMqttActivity.h()>
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
		o.a(s, stringbuilder.toString());
	//   24   49:aload_3         
	//   25   50:aload           4
	//   26   52:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   27   55:invokestatic    #56  <Method void o.a(String, String)>
		obj = ((Object) (((ArrayList) (obj)).iterator()));
	//   28   58:aload_2         
	//   29   59:invokevirtual   #60  <Method Iterator ArrayList.iterator()>
	//   30   62:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   31   63:aload_2         
	//   32   64:invokeinterface #66  <Method boolean Iterator.hasNext()>
	//   33   69:ifeq            143
			OTAUIServiceDataState otauiservicedatastate = (OTAUIServiceDataState)((Iterator) (obj)).next();
	//   34   72:aload_2         
	//   35   73:invokeinterface #70  <Method Object Iterator.next()>
	//   36   78:checkcast       #72  <Class OTAUIServiceDataState>
	//   37   81:astore_3        
			switch(OtaMqttActivity$5.a[otauiservicedatastate.ordinal()])
	//*  38   82:getstatic       #77  <Field int[] OtaMqttActivity$5.a>
	//*  39   85:aload_3         
	//*  40   86:invokevirtual   #81  <Method int OTAUIServiceDataState.ordinal()>
	//*  41   89:iaload          
			{
	//*  42   90:tableswitch     1 2: default 112
	//	               1 129
	//	               2 115
	//*  43  112:goto            63
			case 2: // '\002'
				OtaMqttActivity.a(a, otauiservicedata.getLocalOTAError());
	//   44  115:aload_0         
	//   45  116:getfield        #12  <Field OtaMqttActivity a>
	//   46  119:aload_1         
	//   47  120:invokevirtual   #85  <Method com.irobot.core.LocalOtaError OTAUIServiceData.getLocalOTAError()>
	//   48  123:invokestatic    #88  <Method void OtaMqttActivity.a(OtaMqttActivity, com.irobot.core.LocalOtaError)>
				break;

	//*  49  126:goto            63
			case 1: // '\001'
				OtaMqttActivity.a(a, otauiservicedata.getLocalOTAStatus());
	//   50  129:aload_0         
	//   51  130:getfield        #12  <Field OtaMqttActivity a>
	//   52  133:aload_1         
	//   53  134:invokevirtual   #92  <Method com.irobot.core.LocalOtaStatus OTAUIServiceData.getLocalOTAStatus()>
	//   54  137:invokestatic    #95  <Method void OtaMqttActivity.a(OtaMqttActivity, com.irobot.core.LocalOtaStatus)>
				break;
			}
		} while(true);
	//*  55  140:goto            63
	//   56  143:return          
	}

	final OtaMqttActivity a;

	private OtaMqttActivity$a(OtaMqttActivity otamqttactivity)
	{
		a = otamqttactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field OtaMqttActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void OTAUIServiceDataCallback()>
	//    5    9:return          
	}

	OtaMqttActivity$a(OtaMqttActivity otamqttactivity, OtaMqttActivity$1 otamqttactivity$1)
	{
		this(otamqttactivity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void OtaMqttActivity$a(OtaMqttActivity)>
	//    3    5:return          
	}
}
