// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			BetaIdeasActivity

class BetaIdeasActivity$1 extends ApplicationUIServiceDataCallback
{

	public void onApplicationUIServiceDataChanged(ApplicationUIServiceData applicationuiservicedata)
	{
		for(applicationuiservicedata = ((ApplicationUIServiceData) (applicationuiservicedata.getViewStateChangelist().iterator())); ((Iterator) (applicationuiservicedata)).hasNext();)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #24  <Method ArrayList ApplicationUIServiceData.getViewStateChangelist()>
	//*   2    4:invokevirtual   #30  <Method Iterator ArrayList.iterator()>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:invokeinterface #36  <Method boolean Iterator.hasNext()>
	//*   6   14:ifeq            92
		{
			ApplicationUIState applicationuistate = (ApplicationUIState)((Iterator) (applicationuiservicedata)).next();
	//    7   17:aload_1         
	//    8   18:invokeinterface #40  <Method Object Iterator.next()>
	//    9   23:checkcast       #42  <Class ApplicationUIState>
	//   10   26:astore_2        
			if(BetaIdeasActivity$2.a[applicationuistate.ordinal()] != 1)
	//*  11   27:getstatic       #47  <Field int[] BetaIdeasActivity$2.a>
	//*  12   30:aload_2         
	//*  13   31:invokevirtual   #51  <Method int ApplicationUIState.ordinal()>
	//*  14   34:iaload          
	//*  15   35:iconst_1        
	//*  16   36:icmpeq          82
			{
				String s = BetaIdeasActivity.g();
	//   17   39:invokestatic    #55  <Method String BetaIdeasActivity.g()>
	//   18   42:astore_3        
				StringBuilder stringbuilder = new StringBuilder();
	//   19   43:new             #57  <Class StringBuilder>
	//   20   46:dup             
	//   21   47:invokespecial   #58  <Method void StringBuilder()>
	//   22   50:astore          4
				stringbuilder.append("Unhandled ApplicationUIState: ");
	//   23   52:aload           4
	//   24   54:ldc1            #60  <String "Unhandled ApplicationUIState: ">
	//   25   56:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   26   59:pop             
				stringbuilder.append(applicationuistate.name());
	//   27   60:aload           4
	//   28   62:aload_2         
	//   29   63:invokevirtual   #67  <Method String ApplicationUIState.name()>
	//   30   66:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   31   69:pop             
				o.d(s, stringbuilder.toString());
	//   32   70:aload_3         
	//   33   71:aload           4
	//   34   73:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   35   76:invokestatic    #76  <Method void o.d(String, String)>
			} else
	//*  36   79:goto            8
			{
				BetaIdeasActivity.a(a);
	//   37   82:aload_0         
	//   38   83:getfield        #12  <Field BetaIdeasActivity a>
	//   39   86:invokestatic    #78  <Method void BetaIdeasActivity.a(BetaIdeasActivity)>
			}
		}

	//*  40   89:goto            8
	//   41   92:return          
	}

	final BetaIdeasActivity a;

	BetaIdeasActivity$1(BetaIdeasActivity betaideasactivity)
	{
		a = betaideasactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field BetaIdeasActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void ApplicationUIServiceDataCallback()>
	//    5    9:return          
	}
}
