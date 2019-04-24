// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			NotificationSettingsActivity

private class NotificationSettingsActivity$a extends AccountUIServiceDataCallback
{

	public void onAccountUIServiceDataChanged(AccountUIServiceData accountuiservicedata)
	{
		if(accountuiservicedata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
		{
			o.e(NotificationSettingsActivity.f(), "service data is null");
	//    2    4:invokestatic    #25  <Method String NotificationSettingsActivity.f()>
	//    3    7:ldc1            #27  <String "service data is null">
	//    4    9:invokestatic    #33  <Method void o.e(String, String)>
			return;
	//    5   12:return          
		}
		Object obj = ((Object) (accountuiservicedata.getViewStates()));
	//    6   13:aload_1         
	//    7   14:invokevirtual   #39  <Method ArrayList AccountUIServiceData.getViewStates()>
	//    8   17:astore_2        
		String s = NotificationSettingsActivity.f();
	//    9   18:invokestatic    #25  <Method String NotificationSettingsActivity.f()>
	//   10   21:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   11   22:new             #41  <Class StringBuilder>
	//   12   25:dup             
	//   13   26:invokespecial   #42  <Method void StringBuilder()>
	//   14   29:astore          4
		stringbuilder.append("View change list: ");
	//   15   31:aload           4
	//   16   33:ldc1            #44  <String "View change list: ">
	//   17   35:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
		stringbuilder.append(((ArrayList) (obj)).toString());
	//   19   39:aload           4
	//   20   41:aload_2         
	//   21   42:invokevirtual   #53  <Method String ArrayList.toString()>
	//   22   45:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   23   48:pop             
		o.b(s, stringbuilder.toString());
	//   24   49:aload_3         
	//   25   50:aload           4
	//   26   52:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   27   55:invokestatic    #57  <Method void o.b(String, String)>
		obj = ((Object) (((ArrayList) (obj)).iterator()));
	//   28   58:aload_2         
	//   29   59:invokevirtual   #61  <Method Iterator ArrayList.iterator()>
	//   30   62:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   31   63:aload_2         
	//   32   64:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//   33   69:ifeq            185
			AccountViewState accountviewstate = (AccountViewState)((Iterator) (obj)).next();
	//   34   72:aload_2         
	//   35   73:invokeinterface #71  <Method Object Iterator.next()>
	//   36   78:checkcast       #73  <Class AccountViewState>
	//   37   81:astore_3        
			switch(NotificationSettingsActivity$1.a[accountviewstate.ordinal()])
	//*  38   82:getstatic       #78  <Field int[] NotificationSettingsActivity$1.a>
	//*  39   85:aload_3         
	//*  40   86:invokevirtual   #82  <Method int AccountViewState.ordinal()>
	//*  41   89:iaload          
			{
	//*  42   90:tableswitch     1 5: default 124
	//	               1 175
	//	               2 165
	//	               3 155
	//	               4 141
	//	               5 127
	//*  43  124:goto            63
			case 5: // '\005'
				NotificationSettingsActivity.a(a, accountuiservicedata.getUpdatedPushNotificationSetting());
	//   44  127:aload_0         
	//   45  128:getfield        #12  <Field NotificationSettingsActivity a>
	//   46  131:aload_1         
	//   47  132:invokevirtual   #85  <Method ArrayList AccountUIServiceData.getUpdatedPushNotificationSetting()>
	//   48  135:invokestatic    #88  <Method void NotificationSettingsActivity.a(NotificationSettingsActivity, ArrayList)>
				break;

	//*  49  138:goto            63
			case 4: // '\004'
				NotificationSettingsActivity.a(a, accountuiservicedata.getFailedPushNotificationSettingStatus());
	//   50  141:aload_0         
	//   51  142:getfield        #12  <Field NotificationSettingsActivity a>
	//   52  145:aload_1         
	//   53  146:invokevirtual   #92  <Method com.irobot.core.PushNotificationsGetSettingsFailedStatus AccountUIServiceData.getFailedPushNotificationSettingStatus()>
	//   54  149:invokestatic    #95  <Method void NotificationSettingsActivity.a(NotificationSettingsActivity, com.irobot.core.PushNotificationsGetSettingsFailedStatus)>
				break;

	//*  55  152:goto            63
			case 3: // '\003'
				NotificationSettingsActivity.c(a);
	//   56  155:aload_0         
	//   57  156:getfield        #12  <Field NotificationSettingsActivity a>
	//   58  159:invokestatic    #98  <Method void NotificationSettingsActivity.c(NotificationSettingsActivity)>
				break;

	//*  59  162:goto            63
			case 2: // '\002'
				NotificationSettingsActivity.b(a);
	//   60  165:aload_0         
	//   61  166:getfield        #12  <Field NotificationSettingsActivity a>
	//   62  169:invokestatic    #100 <Method void NotificationSettingsActivity.b(NotificationSettingsActivity)>
				break;

	//*  63  172:goto            63
			case 1: // '\001'
				NotificationSettingsActivity.a(a);
	//   64  175:aload_0         
	//   65  176:getfield        #12  <Field NotificationSettingsActivity a>
	//   66  179:invokestatic    #102 <Method void NotificationSettingsActivity.a(NotificationSettingsActivity)>
				break;
			}
		} while(true);
	//*  67  182:goto            63
	//   68  185:return          
	}

	final NotificationSettingsActivity a;

	private NotificationSettingsActivity$a(NotificationSettingsActivity notificationsettingsactivity)
	{
		a = notificationsettingsactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field NotificationSettingsActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void AccountUIServiceDataCallback()>
	//    5    9:return          
	}

	NotificationSettingsActivity$a(NotificationSettingsActivity notificationsettingsactivity, NotificationSettingsActivity$1 notificationsettingsactivity$1)
	{
		this(notificationsettingsactivity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void NotificationSettingsActivity$a(NotificationSettingsActivity)>
	//    3    5:return          
	}
}
