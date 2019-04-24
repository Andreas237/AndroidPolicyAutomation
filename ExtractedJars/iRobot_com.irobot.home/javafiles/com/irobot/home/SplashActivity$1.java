// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			SplashActivity

class SplashActivity$1 extends ApplicationUIServiceDataCallback
{

	public void onApplicationUIServiceDataChanged(ApplicationUIServiceData applicationuiservicedata)
	{
		Iterator iterator = applicationuiservicedata.getViewStateChangelist().iterator();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #24  <Method ArrayList ApplicationUIServiceData.getViewStateChangelist()>
	//    2    4:invokevirtual   #30  <Method Iterator ArrayList.iterator()>
	//    3    7:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//    4    9:aload           4
	//    5   11:invokeinterface #36  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            174
			ApplicationUIState applicationuistate = (ApplicationUIState)iterator.next();
	//    7   19:aload           4
	//    8   21:invokeinterface #40  <Method Object Iterator.next()>
	//    9   26:checkcast       #42  <Class ApplicationUIState>
	//   10   29:astore          5
			int i = SplashActivity$9.a[applicationuistate.ordinal()];
	//   11   31:getstatic       #47  <Field int[] SplashActivity$9.a>
	//   12   34:aload           5
	//   13   36:invokevirtual   #51  <Method int ApplicationUIState.ordinal()>
	//   14   39:iaload          
	//   15   40:istore_2        
			boolean flag = true;
	//   16   41:iconst_1        
	//   17   42:istore_3        
			switch(i)
	//*  18   43:iload_2         
			{
	//*  19   44:tableswitch     1 3: default 72
	//	               1 162
	//	               2 118
	//	               3 118
			default:
				String s = SplashActivity.h();
	//   20   72:invokestatic    #55  <Method String SplashActivity.h()>
	//   21   75:astore          6
				StringBuilder stringbuilder = new StringBuilder();
	//   22   77:new             #57  <Class StringBuilder>
	//   23   80:dup             
	//   24   81:invokespecial   #58  <Method void StringBuilder()>
	//   25   84:astore          7
				stringbuilder.append("Unhandled ApplicationUIState: ");
	//   26   86:aload           7
	//   27   88:ldc1            #60  <String "Unhandled ApplicationUIState: ">
	//   28   90:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   29   93:pop             
				stringbuilder.append(applicationuistate.name());
	//   30   94:aload           7
	//   31   96:aload           5
	//   32   98:invokevirtual   #67  <Method String ApplicationUIState.name()>
	//   33  101:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   34  104:pop             
				o.d(s, stringbuilder.toString());
	//   35  105:aload           6
	//   36  107:aload           7
	//   37  109:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   38  112:invokestatic    #76  <Method void o.d(String, String)>
				break;

	//*  39  115:goto            9
			case 2: // '\002'
			case 3: // '\003'
				String s1 = applicationuiservicedata.getApplicationVersion();
	//   40  118:aload_1         
	//   41  119:invokevirtual   #79  <Method String ApplicationUIServiceData.getApplicationVersion()>
	//   42  122:astore          6
				String s2 = applicationuiservicedata.getAppDownloadUrl();
	//   43  124:aload_1         
	//   44  125:invokevirtual   #82  <Method String ApplicationUIServiceData.getAppDownloadUrl()>
	//   45  128:astore          7
				SplashActivity splashactivity = a;
	//   46  130:aload_0         
	//   47  131:getfield        #12  <Field SplashActivity a>
	//   48  134:astore          8
				if(applicationuistate != ApplicationUIState.NewAppVersionAvailable)
	//*  49  136:aload           5
	//*  50  138:getstatic       #86  <Field ApplicationUIState ApplicationUIState.NewAppVersionAvailable>
	//*  51  141:if_acmpne       147
	//*  52  144:goto            149
					flag = false;
	//   53  147:iconst_0        
	//   54  148:istore_3        
				splashactivity.a(s1, s2, flag);
	//   55  149:aload           8
	//   56  151:aload           6
	//   57  153:aload           7
	//   58  155:iload_3         
	//   59  156:invokevirtual   #89  <Method void SplashActivity.a(String, String, boolean)>
				break;

	//*  60  159:goto            9
			case 1: // '\001'
				SplashActivity.a(a, true);
	//   61  162:aload_0         
	//   62  163:getfield        #12  <Field SplashActivity a>
	//   63  166:iconst_1        
	//   64  167:invokestatic    #92  <Method boolean SplashActivity.a(SplashActivity, boolean)>
	//   65  170:pop             
				break;
			}
		} while(true);
	//*  66  171:goto            9
	//   67  174:return          
	}

	final SplashActivity a;

	SplashActivity$1(SplashActivity splashactivity)
	{
		a = splashactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field SplashActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void ApplicationUIServiceDataCallback()>
	//    5    9:return          
	}
}
