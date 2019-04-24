// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.fragments.ac;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			BaseCleanActivity

private class BaseCleanActivity$a extends NotificationCenterUIServiceDataCallback
{

	public void onNotificationCenterUIServiceDataChanged(NotificationCenterUIServiceData notificationcenteruiservicedata)
	{
		if(notificationcenteruiservicedata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
		{
			o.e(BaseCleanActivity.t(), "[HKC] NotificationCenterServiceData was null.");
	//    2    4:invokestatic    #25  <Method String BaseCleanActivity.t()>
	//    3    7:ldc1            #27  <String "[HKC] NotificationCenterServiceData was null.">
	//    4    9:invokestatic    #33  <Method void o.e(String, String)>
			return;
	//    5   12:return          
		}
		Iterator iterator = notificationcenteruiservicedata.getDataStateChangelist().iterator();
	//    6   13:aload_1         
	//    7   14:invokevirtual   #39  <Method ArrayList NotificationCenterUIServiceData.getDataStateChangelist()>
	//    8   17:invokevirtual   #45  <Method Iterator ArrayList.iterator()>
	//    9   20:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   10   21:aload_3         
	//   11   22:invokeinterface #51  <Method boolean Iterator.hasNext()>
	//   12   27:ifeq            256
			NotificationCenterServiceDataState notificationcenterservicedatastate = (NotificationCenterServiceDataState)iterator.next();
	//   13   30:aload_3         
	//   14   31:invokeinterface #55  <Method Object Iterator.next()>
	//   15   36:checkcast       #57  <Class NotificationCenterServiceDataState>
	//   16   39:astore          4
			switch(BaseCleanActivity$6.b[notificationcenterservicedatastate.ordinal()])
	//*  17   41:getstatic       #63  <Field int[] BaseCleanActivity$6.b>
	//*  18   44:aload           4
	//*  19   46:invokevirtual   #67  <Method int NotificationCenterServiceDataState.ordinal()>
	//*  20   49:iaload          
			{
	//*  21   50:tableswitch     1 3: default 76
	//	               1 111
	//	               2 90
	//	               3 79
	//*  22   76:goto            21
			case 3: // '\003'
				o.b(BaseCleanActivity.t(), "[HKC] Invalid notification center service!");
	//   23   79:invokestatic    #25  <Method String BaseCleanActivity.t()>
	//   24   82:ldc1            #69  <String "[HKC] Invalid notification center service!">
	//   25   84:invokestatic    #71  <Method void o.b(String, String)>
				break;

	//*  26   87:goto            21
			case 2: // '\002'
				o.b(BaseCleanActivity.t(), "[HKC] Failed to receive list of notifications!");
	//   27   90:invokestatic    #25  <Method String BaseCleanActivity.t()>
	//   28   93:ldc1            #73  <String "[HKC] Failed to receive list of notifications!">
	//   29   95:invokestatic    #71  <Method void o.b(String, String)>
				a.i.b();
	//   30   98:aload_0         
	//   31   99:getfield        #12  <Field BaseCleanActivity a>
	//   32  102:getfield        #77  <Field ac BaseCleanActivity.i>
	//   33  105:invokevirtual   #81  <Method void ac.b()>
				break;

	//*  34  108:goto            21
			case 1: // '\001'
				String s = BaseCleanActivity.t();
	//   35  111:invokestatic    #25  <Method String BaseCleanActivity.t()>
	//   36  114:astore          4
				StringBuilder stringbuilder = new StringBuilder();
	//   37  116:new             #83  <Class StringBuilder>
	//   38  119:dup             
	//   39  120:invokespecial   #84  <Method void StringBuilder()>
	//   40  123:astore          5
				stringbuilder.append("[HKC] Received list of ");
	//   41  125:aload           5
	//   42  127:ldc1            #86  <String "[HKC] Received list of ">
	//   43  129:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   44  132:pop             
				stringbuilder.append(String.valueOf(notificationcenteruiservicedata.getNotificationList().size()));
	//   45  133:aload           5
	//   46  135:aload_1         
	//   47  136:invokevirtual   #93  <Method ArrayList NotificationCenterUIServiceData.getNotificationList()>
	//   48  139:invokevirtual   #96  <Method int ArrayList.size()>
	//   49  142:invokestatic    #102 <Method String String.valueOf(int)>
	//   50  145:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   51  148:pop             
				stringbuilder.append(" notifications successfully");
	//   52  149:aload           5
	//   53  151:ldc1            #104 <String " notifications successfully">
	//   54  153:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   55  156:pop             
				o.b(s, stringbuilder.toString());
	//   56  157:aload           4
	//   57  159:aload           5
	//   58  161:invokevirtual   #107 <Method String StringBuilder.toString()>
	//   59  164:invokestatic    #71  <Method void o.b(String, String)>
				BaseCleanActivity.a(a, notificationcenteruiservicedata.getUnreadNotifications());
	//   60  167:aload_0         
	//   61  168:getfield        #12  <Field BaseCleanActivity a>
	//   62  171:aload_1         
	//   63  172:invokevirtual   #110 <Method ArrayList NotificationCenterUIServiceData.getUnreadNotifications()>
	//   64  175:invokestatic    #113 <Method ArrayList BaseCleanActivity.a(BaseCleanActivity, ArrayList)>
	//   65  178:pop             
				if(BaseCleanActivity.a(a) != null)
	//*  66  179:aload_0         
	//*  67  180:getfield        #12  <Field BaseCleanActivity a>
	//*  68  183:invokestatic    #116 <Method ArrayList BaseCleanActivity.a(BaseCleanActivity)>
	//*  69  186:ifnull          221
				{
					BaseCleanActivity.a(a).addAll(((java.util.Collection) (notificationcenteruiservicedata.getReadNotifications())));
	//   70  189:aload_0         
	//   71  190:getfield        #12  <Field BaseCleanActivity a>
	//   72  193:invokestatic    #116 <Method ArrayList BaseCleanActivity.a(BaseCleanActivity)>
	//   73  196:aload_1         
	//   74  197:invokevirtual   #119 <Method ArrayList NotificationCenterUIServiceData.getReadNotifications()>
	//   75  200:invokevirtual   #123 <Method boolean ArrayList.addAll(java.util.Collection)>
	//   76  203:pop             
					a.i.a(BaseCleanActivity.a(a));
	//   77  204:aload_0         
	//   78  205:getfield        #12  <Field BaseCleanActivity a>
	//   79  208:getfield        #77  <Field ac BaseCleanActivity.i>
	//   80  211:aload_0         
	//   81  212:getfield        #12  <Field BaseCleanActivity a>
	//   82  215:invokestatic    #116 <Method ArrayList BaseCleanActivity.a(BaseCleanActivity)>
	//   83  218:invokevirtual   #126 <Method void ac.a(ArrayList)>
				}
				boolean flag;
				if(notificationcenteruiservicedata.getUnreadNotifications() != null && notificationcenteruiservicedata.getUnreadNotifications().size() > 0)
	//*  84  221:aload_1         
	//*  85  222:invokevirtual   #110 <Method ArrayList NotificationCenterUIServiceData.getUnreadNotifications()>
	//*  86  225:ifnull          243
	//*  87  228:aload_1         
	//*  88  229:invokevirtual   #110 <Method ArrayList NotificationCenterUIServiceData.getUnreadNotifications()>
	//*  89  232:invokevirtual   #96  <Method int ArrayList.size()>
	//*  90  235:ifle            243
					flag = true;
	//   91  238:iconst_1        
	//   92  239:istore_2        
				else
	//*  93  240:goto            245
					flag = false;
	//   94  243:iconst_0        
	//   95  244:istore_2        
				BaseCleanActivity.a(a, flag);
	//   96  245:aload_0         
	//   97  246:getfield        #12  <Field BaseCleanActivity a>
	//   98  249:iload_2         
	//   99  250:invokestatic    #129 <Method void BaseCleanActivity.a(BaseCleanActivity, boolean)>
				break;
			}
		} while(true);
	//* 100  253:goto            21
	//  101  256:return          
	}

	final BaseCleanActivity a;

	private BaseCleanActivity$a(BaseCleanActivity basecleanactivity)
	{
		a = basecleanactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field BaseCleanActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void NotificationCenterUIServiceDataCallback()>
	//    5    9:return          
	}

	BaseCleanActivity$a(BaseCleanActivity basecleanactivity, BaseCleanActivity$1 basecleanactivity$1)
	{
		this(basecleanactivity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void BaseCleanActivity$a(BaseCleanActivity)>
	//    3    5:return          
	}
}
