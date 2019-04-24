// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.notifications;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.irobot.home.IRobotApplication;
import com.irobot.home.util.*;
import java.util.Map;

// Referenced classes of package com.irobot.home.notifications:
//			a

public class IRobotFirebaseMessagingService extends FirebaseMessagingService
{

	public IRobotFirebaseMessagingService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void FirebaseMessagingService()>
	//    2    4:return          
	}

	public void a(RemoteMessage remotemessage)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #13  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("FCM Message Id: ");
	//    4    8:aload_2         
	//    5    9:ldc1            #16  <String "FCM Message Id: ">
	//    6   11:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(remotemessage.b());
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #26  <Method String RemoteMessage.b()>
	//   11   20:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		o.b("FirebaseMsgService", stringbuilder.toString());
	//   13   24:ldc1            #28  <String "FirebaseMsgService">
	//   14   26:aload_2         
	//   15   27:invokevirtual   #31  <Method String StringBuilder.toString()>
	//   16   30:invokestatic    #36  <Method void o.b(String, String)>
		stringbuilder = new StringBuilder();
	//   17   33:new             #13  <Class StringBuilder>
	//   18   36:dup             
	//   19   37:invokespecial   #14  <Method void StringBuilder()>
	//   20   40:astore_2        
		stringbuilder.append("FCM Notification Message: ");
	//   21   41:aload_2         
	//   22   42:ldc1            #38  <String "FCM Notification Message: ">
	//   23   44:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   24   47:pop             
		stringbuilder.append(((Object) (remotemessage.c())));
	//   25   48:aload_2         
	//   26   49:aload_1         
	//   27   50:invokevirtual   #42  <Method com.google.firebase.messaging.RemoteMessage$a RemoteMessage.c()>
	//   28   53:invokevirtual   #45  <Method StringBuilder StringBuilder.append(Object)>
	//   29   56:pop             
		o.b("FirebaseMsgService", stringbuilder.toString());
	//   30   57:ldc1            #28  <String "FirebaseMsgService">
	//   31   59:aload_2         
	//   32   60:invokevirtual   #31  <Method String StringBuilder.toString()>
	//   33   63:invokestatic    #36  <Method void o.b(String, String)>
		stringbuilder = new StringBuilder();
	//   34   66:new             #13  <Class StringBuilder>
	//   35   69:dup             
	//   36   70:invokespecial   #14  <Method void StringBuilder()>
	//   37   73:astore_2        
		stringbuilder.append("FCM Data Message: ");
	//   38   74:aload_2         
	//   39   75:ldc1            #47  <String "FCM Data Message: ">
	//   40   77:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   41   80:pop             
		stringbuilder.append(((Object) (remotemessage.a())));
	//   42   81:aload_2         
	//   43   82:aload_1         
	//   44   83:invokevirtual   #50  <Method Map RemoteMessage.a()>
	//   45   86:invokevirtual   #45  <Method StringBuilder StringBuilder.append(Object)>
	//   46   89:pop             
		o.b("FirebaseMsgService", stringbuilder.toString());
	//   47   90:ldc1            #28  <String "FirebaseMsgService">
	//   48   92:aload_2         
	//   49   93:invokevirtual   #31  <Method String StringBuilder.toString()>
	//   50   96:invokestatic    #36  <Method void o.b(String, String)>
		if(((IRobotApplication)j.g()).l())
	//*  51   99:invokestatic    #56  <Method android.app.Application j.g()>
	//*  52  102:checkcast       #58  <Class IRobotApplication>
	//*  53  105:invokevirtual   #62  <Method boolean IRobotApplication.l()>
	//*  54  108:ifeq            112
			return;
	//   55  111:return          
		Map map = remotemessage.a();
	//   56  112:aload_1         
	//   57  113:invokevirtual   #50  <Method Map RemoteMessage.a()>
	//   58  116:astore          4
		if(map != null)
	//*  59  118:aload           4
	//*  60  120:ifnull          196
		{
			String s1 = (String)map.get("irbt");
	//   61  123:aload           4
	//   62  125:ldc1            #64  <String "irbt">
	//   63  127:invokeinterface #70  <Method Object Map.get(Object)>
	//   64  132:checkcast       #72  <Class String>
	//   65  135:astore_3        
			String s = (String)map.get("alert");
	//   66  136:aload           4
	//   67  138:ldc1            #74  <String "alert">
	//   68  140:invokeinterface #70  <Method Object Map.get(Object)>
	//   69  145:checkcast       #72  <Class String>
	//   70  148:astore_2        
			remotemessage = ((RemoteMessage) (s));
	//   71  149:aload_2         
	//   72  150:astore_1        
			if(s == null)
	//*  73  151:aload_2         
	//*  74  152:ifnonnull       187
			{
				remotemessage = ((RemoteMessage) (s));
	//   75  155:aload_2         
	//   76  156:astore_1        
				if(map.containsKey("mp_message"))
	//*  77  157:aload           4
	//*  78  159:ldc1            #76  <String "mp_message">
	//*  79  161:invokeinterface #80  <Method boolean Map.containsKey(Object)>
	//*  80  166:ifeq            187
					remotemessage = ((RemoteMessage) (t.a("", (String)map.get("mp_message"))));
	//   81  169:ldc1            #82  <String "">
	//   82  171:aload           4
	//   83  173:ldc1            #76  <String "mp_message">
	//   84  175:invokeinterface #70  <Method Object Map.get(Object)>
	//   85  180:checkcast       #72  <Class String>
	//   86  183:invokestatic    #87  <Method String t.a(String, String)>
	//   87  186:astore_1        
			}
			t.a(s1, ((String) (remotemessage)), getApplicationContext());
	//   88  187:aload_3         
	//   89  188:aload_1         
	//   90  189:aload_0         
	//   91  190:invokevirtual   #91  <Method android.content.Context getApplicationContext()>
	//   92  193:invokestatic    #94  <Method void t.a(String, String, android.content.Context)>
		}
	//   93  196:return          
	}

	public void b(String s)
	{
		super.b(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #97  <Method void FirebaseMessagingService.b(String)>
		(new a()).a(s);
	//    3    5:new             #99  <Class a>
	//    4    8:dup             
	//    5    9:invokespecial   #100 <Method void a()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #102 <Method void a.a(String)>
	//    8   16:return          
	}
}
