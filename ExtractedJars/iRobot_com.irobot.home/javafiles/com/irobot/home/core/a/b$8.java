// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.core.a;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home.core.a:
//			b

class b$8 extends ApplicationUIServiceDataCallback
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
	//    6   14:ifeq            133
			ApplicationUIState applicationuistate = (ApplicationUIState)((Iterator) (applicationuiservicedata)).next();
	//    7   17:aload_1         
	//    8   18:invokeinterface #40  <Method Object Iterator.next()>
	//    9   23:checkcast       #42  <Class ApplicationUIState>
	//   10   26:astore_2        
			switch(b$9.a[applicationuistate.ordinal()])
	//*  11   27:getstatic       #47  <Field int[] b$9.a>
	//*  12   30:aload_2         
	//*  13   31:invokevirtual   #51  <Method int ApplicationUIState.ordinal()>
	//*  14   34:iaload          
			{
	//*  15   35:tableswitch     1 3: default 60
	//	               1 123
	//	               2 113
	//	               3 103
			default:
				String s = b.b();
	//   16   60:invokestatic    #55  <Method String b.b()>
	//   17   63:astore_3        
				StringBuilder stringbuilder = new StringBuilder();
	//   18   64:new             #57  <Class StringBuilder>
	//   19   67:dup             
	//   20   68:invokespecial   #58  <Method void StringBuilder()>
	//   21   71:astore          4
				stringbuilder.append("Unhandled ApplicationUIState: ");
	//   22   73:aload           4
	//   23   75:ldc1            #60  <String "Unhandled ApplicationUIState: ">
	//   24   77:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   25   80:pop             
				stringbuilder.append(applicationuistate.name());
	//   26   81:aload           4
	//   27   83:aload_2         
	//   28   84:invokevirtual   #67  <Method String ApplicationUIState.name()>
	//   29   87:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   30   90:pop             
				o.d(s, stringbuilder.toString());
	//   31   91:aload_3         
	//   32   92:aload           4
	//   33   94:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   34   97:invokestatic    #76  <Method void o.d(String, String)>
				break;

	//*  35  100:goto            8
			case 3: // '\003'
				b.e(a);
	//   36  103:aload_0         
	//   37  104:getfield        #12  <Field b a>
	//   38  107:invokestatic    #79  <Method void b.e(b)>
				break;

	//*  39  110:goto            8
			case 2: // '\002'
				b.d(a);
	//   40  113:aload_0         
	//   41  114:getfield        #12  <Field b a>
	//   42  117:invokestatic    #81  <Method void b.d(b)>
				break;

	//*  43  120:goto            8
			case 1: // '\001'
				b.c(a);
	//   44  123:aload_0         
	//   45  124:getfield        #12  <Field b a>
	//   46  127:invokestatic    #84  <Method void b.c(b)>
				break;
			}
		} while(true);
	//*  47  130:goto            8
	//   48  133:return          
	}

	final b a;

	b$8(b b1)
	{
		a = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field b a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void ApplicationUIServiceDataCallback()>
	//    5    9:return          
	}
}
