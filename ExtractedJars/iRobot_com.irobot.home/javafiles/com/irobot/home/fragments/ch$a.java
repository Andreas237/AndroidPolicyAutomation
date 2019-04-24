// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home.fragments:
//			ch

private class ch$a extends OTAUIServiceDataCallback
{

	public void onOTAUIServiceDataChanged(OTAUIServiceData otauiservicedata)
	{
		if(otauiservicedata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
		{
			o.b(ch.e(), "null service data");
	//    2    4:invokestatic    #25  <Method String ch.e()>
	//    3    7:ldc1            #27  <String "null service data">
	//    4    9:invokestatic    #33  <Method void o.b(String, String)>
			return;
	//    5   12:return          
		}
		Object obj = ((Object) (otauiservicedata.getDataStates()));
	//    6   13:aload_1         
	//    7   14:invokevirtual   #39  <Method ArrayList OTAUIServiceData.getDataStates()>
	//    8   17:astore_2        
		String s = ch.e();
	//    9   18:invokestatic    #25  <Method String ch.e()>
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
	//   33   69:ifeq            171
			OTAUIServiceDataState otauiservicedatastate = (OTAUIServiceDataState)((Iterator) (obj)).next();
	//   34   72:aload_2         
	//   35   73:invokeinterface #70  <Method Object Iterator.next()>
	//   36   78:checkcast       #72  <Class OTAUIServiceDataState>
	//   37   81:astore_3        
			switch(ch$3.a[otauiservicedatastate.ordinal()])
	//*  38   82:getstatic       #77  <Field int[] ch$3.a>
	//*  39   85:aload_3         
	//*  40   86:invokevirtual   #81  <Method int OTAUIServiceDataState.ordinal()>
	//*  41   89:iaload          
			{
	//*  42   90:tableswitch     1 4: default 120
	//	               1 157
	//	               2 147
	//	               3 133
	//	               4 123
	//*  43  120:goto            63
			case 4: // '\004'
				ch.b(a);
	//   44  123:aload_0         
	//   45  124:getfield        #12  <Field ch a>
	//   46  127:invokestatic    #83  <Method void ch.b(ch)>
				break;

	//*  47  130:goto            63
			case 3: // '\003'
				ch.a(a, otauiservicedata.getOnDemandOTAError());
	//   48  133:aload_0         
	//   49  134:getfield        #12  <Field ch a>
	//   50  137:aload_1         
	//   51  138:invokevirtual   #87  <Method com.irobot.core.OnDemandOTAError OTAUIServiceData.getOnDemandOTAError()>
	//   52  141:invokestatic    #90  <Method void ch.a(ch, com.irobot.core.OnDemandOTAError)>
				break;

	//*  53  144:goto            63
			case 2: // '\002'
				ch.a(a);
	//   54  147:aload_0         
	//   55  148:getfield        #12  <Field ch a>
	//   56  151:invokestatic    #92  <Method void ch.a(ch)>
				break;

	//*  57  154:goto            63
			case 1: // '\001'
				ch.a(a, otauiservicedata.getOnDemandOTAStatus());
	//   58  157:aload_0         
	//   59  158:getfield        #12  <Field ch a>
	//   60  161:aload_1         
	//   61  162:invokevirtual   #96  <Method com.irobot.core.OtaUpdateStatus OTAUIServiceData.getOnDemandOTAStatus()>
	//   62  165:invokestatic    #99  <Method void ch.a(ch, com.irobot.core.OtaUpdateStatus)>
				break;
			}
		} while(true);
	//*  63  168:goto            63
	//   64  171:return          
	}

	final ch a;

	private ch$a(ch ch1)
	{
		a = ch1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field ch a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void OTAUIServiceDataCallback()>
	//    5    9:return          
	}

	ch$a(ch ch1, ch$1 ch$1)
	{
		this(ch1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void ch$a(ch)>
	//    3    5:return          
	}
}
