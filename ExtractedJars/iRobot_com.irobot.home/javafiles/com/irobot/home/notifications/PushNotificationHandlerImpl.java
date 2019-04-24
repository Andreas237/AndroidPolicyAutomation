// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.notifications;

import android.app.Application;
import com.google.firebase.iid.FirebaseInstanceId;
import com.irobot.core.Assembler;
import com.irobot.core.EventType;
import com.irobot.core.PushNotificationHandler;
import com.irobot.core.PushNotificationService;
import com.irobot.core.PushRegistrationStatusEvent;
import com.irobot.home.i.a;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import java.io.IOException;
import me.pushy.sdk.Pushy;

public class PushNotificationHandlerImpl extends PushNotificationHandler
{

	public PushNotificationHandlerImpl(Application application)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void PushNotificationHandler()>
		b = application;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #31  <Field Application b>
		if(j.w())
	//*   5    9:invokestatic    #35  <Method boolean j.w()>
	//*   6   12:ifeq            41
		{
			Pushy.setEnterpriseConfig("https://irobot.pushy.me", "ssl://irobot.pushy.me", ((android.content.Context) (b)));
	//    7   15:ldc1            #37  <String "https://irobot.pushy.me">
	//    8   17:ldc1            #39  <String "ssl://irobot.pushy.me">
	//    9   19:aload_0         
	//   10   20:getfield        #31  <Field Application b>
	//   11   23:invokestatic    #45  <Method void Pushy.setEnterpriseConfig(String, String, android.content.Context)>
			Pushy.listen(((android.content.Context) (b)));
	//   12   26:aload_0         
	//   13   27:getfield        #31  <Field Application b>
	//   14   30:invokestatic    #49  <Method void Pushy.listen(android.content.Context)>
			o.b(a, "Pushy - invoke Pushy's internal listening service and set Enterprise Config");
	//   15   33:getstatic       #24  <Field String a>
	//   16   36:ldc1            #51  <String "Pushy - invoke Pushy's internal listening service and set Enterprise Config">
	//   17   38:invokestatic    #56  <Method void o.b(String, String)>
		}
	//   18   41:return          
	}

	public boolean checkNotificationsEnabled()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void onPushRegistrationStatusEvent(PushRegistrationStatusEvent pushregistrationstatusevent)
	{
		o.b(a, "PushRegistrationStatusEvent received");
	//    0    0:getstatic       #24  <Field String a>
	//    1    3:ldc1            #62  <String "PushRegistrationStatusEvent received">
	//    2    5:invokestatic    #56  <Method void o.b(String, String)>
		String s = a;
	//    3    8:getstatic       #24  <Field String a>
	//    4   11:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    5   12:new             #64  <Class StringBuilder>
	//    6   15:dup             
	//    7   16:invokespecial   #65  <Method void StringBuilder()>
	//    8   19:astore_3        
		stringbuilder.append("** Registration Successful: ");
	//    9   20:aload_3         
	//   10   21:ldc1            #67  <String "** Registration Successful: ">
	//   11   23:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   12   26:pop             
		stringbuilder.append(pushregistrationstatusevent.registrationSuccessful());
	//   13   27:aload_3         
	//   14   28:aload_1         
	//   15   29:invokevirtual   #76  <Method boolean PushRegistrationStatusEvent.registrationSuccessful()>
	//   16   32:invokevirtual   #79  <Method StringBuilder StringBuilder.append(boolean)>
	//   17   35:pop             
		o.a(s, stringbuilder.toString());
	//   18   36:aload_2         
	//   19   37:aload_3         
	//   20   38:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   21   41:invokestatic    #84  <Method void o.a(String, String)>
	//   22   44:return          
	}

	public void registerForNotifications()
	{
		Assembler assembler;
		com.irobot.core.PushPlatformType pushplatformtype;
		if(j.u())
			break MISSING_BLOCK_LABEL_217;
	//    0    0:invokestatic    #91  <Method boolean j.u()>
	//    1    3:ifne            217
		assembler = Assembler.getInstance();
	//    2    6:invokestatic    #97  <Method Assembler Assembler.getInstance()>
	//    3    9:astore_3        
		((a)assembler.getDomainEventBus()).a(((Object) (this)), EventType.PushRegistrationStatusEvent);
	//    4   10:aload_3         
	//    5   11:invokevirtual   #101 <Method com.irobot.core.EventBusHandler Assembler.getDomainEventBus()>
	//    6   14:checkcast       #103 <Class a>
	//    7   17:aload_0         
	//    8   18:getstatic       #109 <Field EventType EventType.PushRegistrationStatusEvent>
	//    9   21:invokevirtual   #112 <Method void a.a(Object, EventType)>
		j.A();
	//   10   24:invokestatic    #115 <Method String j.A()>
	//   11   27:pop             
		pushplatformtype = j.z();
	//   12   28:invokestatic    #119 <Method com.irobot.core.PushPlatformType j.z()>
	//   13   31:astore          4
		if(!j.w())
			break MISSING_BLOCK_LABEL_136;
	//   14   33:invokestatic    #35  <Method boolean j.w()>
	//   15   36:ifeq            136
		String s = Pushy.register(((android.content.Context) (b)));
	//   16   39:aload_0         
	//   17   40:getfield        #31  <Field Application b>
	//   18   43:invokestatic    #123 <Method String Pushy.register(android.content.Context)>
	//   19   46:astore_1        
		String s1 = a;
	//   20   47:getstatic       #24  <Field String a>
	//   21   50:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   22   51:new             #64  <Class StringBuilder>
	//   23   54:dup             
	//   24   55:invokespecial   #65  <Method void StringBuilder()>
	//   25   58:astore          5
		stringbuilder.append("Pushy device token: ");
	//   26   60:aload           5
	//   27   62:ldc1            #125 <String "Pushy device token: ">
	//   28   64:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   29   67:pop             
		stringbuilder.append(s);
	//   30   68:aload           5
	//   31   70:aload_1         
	//   32   71:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   33   74:pop             
		o.b(s1, stringbuilder.toString());
	//   34   75:aload_2         
	//   35   76:aload           5
	//   36   78:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   37   81:invokestatic    #56  <Method void o.b(String, String)>
		break MISSING_BLOCK_LABEL_180;
	//   38   84:goto            180
		Exception exception;
		exception;
	//   39   87:astore_2        
		break MISSING_BLOCK_LABEL_94;
	//   40   88:goto            94
		exception;
	//   41   91:astore_2        
		s = null;
	//   42   92:aconst_null     
	//   43   93:astore_1        
		String s3 = a;
	//   44   94:getstatic       #24  <Field String a>
	//   45   97:astore          5
		StringBuilder stringbuilder2 = new StringBuilder();
	//   46   99:new             #64  <Class StringBuilder>
	//   47  102:dup             
	//   48  103:invokespecial   #65  <Method void StringBuilder()>
	//   49  106:astore          6
		stringbuilder2.append("Pushy device token registration failed: ");
	//   50  108:aload           6
	//   51  110:ldc1            #127 <String "Pushy device token registration failed: ">
	//   52  112:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   53  115:pop             
		stringbuilder2.append(((Object) (exception)));
	//   54  116:aload           6
	//   55  118:aload_2         
	//   56  119:invokevirtual   #130 <Method StringBuilder StringBuilder.append(Object)>
	//   57  122:pop             
		o.d(s3, stringbuilder2.toString());
	//   58  123:aload           5
	//   59  125:aload           6
	//   60  127:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   61  130:invokestatic    #133 <Method void o.d(String, String)>
		break MISSING_BLOCK_LABEL_180;
	//   62  133:goto            180
		s = FirebaseInstanceId.a().d();
	//   63  136:invokestatic    #138 <Method FirebaseInstanceId FirebaseInstanceId.a()>
	//   64  139:invokevirtual   #140 <Method String FirebaseInstanceId.d()>
	//   65  142:astore_1        
		String s2 = a;
	//   66  143:getstatic       #24  <Field String a>
	//   67  146:astore_2        
		StringBuilder stringbuilder1 = new StringBuilder();
	//   68  147:new             #64  <Class StringBuilder>
	//   69  150:dup             
	//   70  151:invokespecial   #65  <Method void StringBuilder()>
	//   71  154:astore          5
		stringbuilder1.append("Firebase token: ");
	//   72  156:aload           5
	//   73  158:ldc1            #142 <String "Firebase token: ">
	//   74  160:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   75  163:pop             
		stringbuilder1.append(s);
	//   76  164:aload           5
	//   77  166:aload_1         
	//   78  167:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   79  170:pop             
		o.b(s2, stringbuilder1.toString());
	//   80  171:aload_2         
	//   81  172:aload           5
	//   82  174:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   83  177:invokestatic    #56  <Method void o.b(String, String)>
		if(!j.i(s))
	//*  84  180:aload_1         
	//*  85  181:invokestatic    #146 <Method boolean j.i(String)>
	//*  86  184:ifne            196
		{
			o.e(a, "Cannot register for push notifications! Push token is invalid!");
	//   87  187:getstatic       #24  <Field String a>
	//   88  190:ldc1            #148 <String "Cannot register for push notifications! Push token is invalid!">
	//   89  192:invokestatic    #151 <Method void o.e(String, String)>
			return;
	//   90  195:return          
		}
		assembler.getPushNotificationService().registerPushNotificationToken(s, pushplatformtype);
	//   91  196:aload_3         
	//   92  197:invokevirtual   #155 <Method PushNotificationService Assembler.getPushNotificationService()>
	//   93  200:aload_1         
	//   94  201:aload           4
	//   95  203:invokevirtual   #161 <Method void PushNotificationService.registerPushNotificationToken(String, com.irobot.core.PushPlatformType)>
		com.irobot.home.d.a.a().a(s);
	//   96  206:invokestatic    #166 <Method com.irobot.home.d.a com.irobot.home.d.a.a()>
	//   97  209:aload_1         
	//   98  210:invokevirtual   #169 <Method void com.irobot.home.d.a.a(String)>
		j.a(false);
	//   99  213:iconst_0        
	//  100  214:invokestatic    #172 <Method void j.a(boolean)>
	//  101  217:return          
	}

	public void unregisterForNotifications()
	{
		IOException ioexception;
		if(j.w())
	//*   0    0:invokestatic    #35  <Method boolean j.w()>
	//*   1    3:ifeq            7
			return;
	//    2    6:return          
		try
		{
			o.b(a, "unregisterForNotifications: Resetting Firebase Instance ID and revoking all tokens.");
	//    3    7:getstatic       #24  <Field String a>
	//    4   10:ldc1            #177 <String "unregisterForNotifications: Resetting Firebase Instance ID and revoking all tokens.">
	//    5   12:invokestatic    #56  <Method void o.b(String, String)>
			FirebaseInstanceId.a().c();
	//    6   15:invokestatic    #138 <Method FirebaseInstanceId FirebaseInstanceId.a()>
	//    7   18:invokevirtual   #180 <Method void FirebaseInstanceId.c()>
			com.irobot.home.d.a.a().c();
	//    8   21:invokestatic    #166 <Method com.irobot.home.d.a com.irobot.home.d.a.a()>
	//    9   24:invokevirtual   #181 <Method void com.irobot.home.d.a.c()>
			j.a(false);
	//   10   27:iconst_0        
	//   11   28:invokestatic    #172 <Method void j.a(boolean)>
			return;
	//   12   31:return          
		}
	//*  13   32:getstatic       #24  <Field String a>
	//*  14   35:ldc1            #183 <String "unregisterForNotifications: Failed to delete Firebase Instance ID.">
	//*  15   37:invokestatic    #151 <Method void o.e(String, String)>
	//*  16   40:return          
		// Misplaced declaration of an exception variable
		catch(IOException ioexception)
		{
			o.e(a, "unregisterForNotifications: Failed to delete Firebase Instance ID.");
		}
	//*  17   41:astore_1        
	//*  18   42:goto            32
	}

	private static final String a = j.r(((Class) (com/irobot/home/notifications/PushNotificationHandlerImpl)).getSimpleName());
	private Application b;

	static 
	{
	//    0    0:ldc1            #2   <Class PushNotificationHandlerImpl>
	//    1    2:invokevirtual   #16  <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #22  <Method String j.r(String)>
	//    3    8:putstatic       #24  <Field String a>
	//*   4   11:return          
	}
}
