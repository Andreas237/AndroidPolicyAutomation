// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.baidu.android.pushservice.e.a;
import com.baidu.android.pushservice.f.k;
import com.baidu.android.pushservice.h.f;
import com.baidu.android.pushservice.h.u;
import com.baidu.android.pushservice.message.PublicMsg;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class CommandService extends Service
{

	public CommandService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Service()>
	//    2    4:return          
	}

	private void a(Intent intent)
	{
		Object obj = ((Object) (u.c(((Context) (this)), getPackageName(), intent.getAction())));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #17  <Method String getPackageName()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #22  <Method String Intent.getAction()>
	//    5    9:invokestatic    #28  <Method String u.c(Context, String, String)>
	//    6   12:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    7   13:new             #30  <Class StringBuilder>
	//    8   16:dup             
	//    9   17:invokespecial   #31  <Method void StringBuilder()>
	//   10   20:astore_3        
		stringbuilder.append("CommandService#onStartCommand#reflectReceiver#recevier = ");
	//   11   21:aload_3         
	//   12   22:ldc1            #33  <String "CommandService#onStartCommand#reflectReceiver#recevier = ">
	//   13   24:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
		stringbuilder.append(((String) (obj)));
	//   15   28:aload_3         
	//   16   29:aload_2         
	//   17   30:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   18   33:pop             
		u.b(stringbuilder.toString(), ((Context) (this)));
	//   19   34:aload_3         
	//   20   35:invokevirtual   #40  <Method String StringBuilder.toString()>
	//   21   38:aload_0         
	//   22   39:invokestatic    #44  <Method void u.b(String, Context)>
		if(TextUtils.isEmpty(((CharSequence) (obj))))
	//*  23   42:aload_2         
	//*  24   43:invokestatic    #50  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  25   46:ifeq            113
		{
			obj = ((Object) (new StringBuilder()));
	//   26   49:new             #30  <Class StringBuilder>
	//   27   52:dup             
	//   28   53:invokespecial   #31  <Method void StringBuilder()>
	//   29   56:astore_2        
			((StringBuilder) (obj)).append(" reflectReceiver error: receiver for: ");
	//   30   57:aload_2         
	//   31   58:ldc1            #52  <String " reflectReceiver error: receiver for: ">
	//   32   60:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   33   63:pop             
			((StringBuilder) (obj)).append(intent.getAction());
	//   34   64:aload_2         
	//   35   65:aload_1         
	//   36   66:invokevirtual   #22  <Method String Intent.getAction()>
	//   37   69:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   38   72:pop             
			((StringBuilder) (obj)).append(" not found, package: ");
	//   39   73:aload_2         
	//   40   74:ldc1            #54  <String " not found, package: ">
	//   41   76:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   42   79:pop             
			((StringBuilder) (obj)).append(getPackageName());
	//   43   80:aload_2         
	//   44   81:aload_0         
	//   45   82:invokevirtual   #17  <Method String getPackageName()>
	//   46   85:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   47   88:pop             
			com.baidu.android.pushservice.e.a.b("CommandService", ((StringBuilder) (obj)).toString());
	//   48   89:ldc1            #56  <String "CommandService">
	//   49   91:aload_2         
	//   50   92:invokevirtual   #40  <Method String StringBuilder.toString()>
	//   51   95:invokestatic    #61  <Method void a.b(String, String)>
			intent.setPackage(getPackageName());
	//   52   98:aload_1         
	//   53   99:aload_0         
	//   54  100:invokevirtual   #17  <Method String getPackageName()>
	//   55  103:invokevirtual   #65  <Method Intent Intent.setPackage(String)>
	//   56  106:pop             
			sendBroadcast(intent);
	//   57  107:aload_0         
	//   58  108:aload_1         
	//   59  109:invokevirtual   #68  <Method void sendBroadcast(Intent)>
			return;
	//   60  112:return          
		}
		try
		{
			Object obj2 = ((Object) (Class.forName(((String) (obj)))));
	//   61  113:aload_2         
	//   62  114:invokestatic    #74  <Method Class Class.forName(String)>
	//   63  117:astore          4
			Object obj1 = ((Class) (obj2)).getConstructor(new Class[0]).newInstance(new Object[0]);
	//   64  119:aload           4
	//   65  121:iconst_0        
	//   66  122:anewarray       Class[]
	//   67  125:invokevirtual   #78  <Method Constructor Class.getConstructor(Class[])>
	//   68  128:iconst_0        
	//   69  129:anewarray       Object[]
	//   70  132:invokevirtual   #86  <Method Object Constructor.newInstance(Object[])>
	//   71  135:astore_3        
			obj2 = ((Object) (((Class) (obj2)).getMethod("onReceive", new Class[] {
				android/content/Context, android/content/Intent
			})));
	//   72  136:aload           4
	//   73  138:ldc1            #88  <String "onReceive">
	//   74  140:iconst_2        
	//   75  141:anewarray       Class[]
	//   76  144:dup             
	//   77  145:iconst_0        
	//   78  146:ldc1            #90  <Class Context>
	//   79  148:aastore         
	//   80  149:dup             
	//   81  150:iconst_1        
	//   82  151:ldc1            #19  <Class Intent>
	//   83  153:aastore         
	//   84  154:invokevirtual   #94  <Method Method Class.getMethod(String, Class[])>
	//   85  157:astore          4
			intent.setClassName(getPackageName(), ((String) (obj)));
	//   86  159:aload_1         
	//   87  160:aload_0         
	//   88  161:invokevirtual   #17  <Method String getPackageName()>
	//   89  164:aload_2         
	//   90  165:invokevirtual   #98  <Method Intent Intent.setClassName(String, String)>
	//   91  168:pop             
			((Method) (obj2)).invoke(obj1, new Object[] {
				getApplicationContext(), intent
			});
	//   92  169:aload           4
	//   93  171:aload_3         
	//   94  172:iconst_2        
	//   95  173:anewarray       Object[]
	//   96  176:dup             
	//   97  177:iconst_0        
	//   98  178:aload_0         
	//   99  179:invokevirtual   #102 <Method Context getApplicationContext()>
	//  100  182:aastore         
	//  101  183:dup             
	//  102  184:iconst_1        
	//  103  185:aload_1         
	//  104  186:aastore         
	//  105  187:invokevirtual   #108 <Method Object Method.invoke(Object, Object[])>
	//  106  190:pop             
			return;
	//  107  191:return          
		}
		// Misplaced declaration of an exception variable
		catch(Intent intent)
	//* 108  192:astore_1        
		{
			com.baidu.android.pushservice.e.a.a("CommandService", ((Throwable) (intent)));
	//  109  193:ldc1            #56  <String "CommandService">
	//  110  195:aload_1         
	//  111  196:invokestatic    #111 <Method void a.a(String, Throwable)>
		}
	//  112  199:return          
	}

	private void b(Intent intent)
	{
		String s;
		String s1;
		s = intent.getStringExtra("bd.cross.request.SOURCE_SERVICE");
	//    0    0:aload_1         
	//    1    1:ldc1            #113 <String "bd.cross.request.SOURCE_SERVICE">
	//    2    3:invokevirtual   #117 <Method String Intent.getStringExtra(String)>
	//    3    6:astore_2        
		s1 = intent.getStringExtra("bd.cross.request.SOURCE_PACKAGE");
	//    4    7:aload_1         
	//    5    8:ldc1            #119 <String "bd.cross.request.SOURCE_PACKAGE">
	//    6   10:invokevirtual   #117 <Method String Intent.getStringExtra(String)>
	//    7   13:astore_3        
		if(TextUtils.isEmpty(((CharSequence) (s))))
			break MISSING_BLOCK_LABEL_67;
	//    8   14:aload_2         
	//    9   15:invokestatic    #50  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   10   18:ifne            67
		if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*  11   21:aload_3         
	//*  12   22:invokestatic    #50  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  13   25:ifeq            29
			return;
	//   14   28:return          
		try
		{
			intent.setPackage(s1);
	//   15   29:aload_1         
	//   16   30:aload_3         
	//   17   31:invokevirtual   #65  <Method Intent Intent.setPackage(String)>
	//   18   34:pop             
			intent.setClassName(s1, s);
	//   19   35:aload_1         
	//   20   36:aload_3         
	//   21   37:aload_2         
	//   22   38:invokevirtual   #98  <Method Intent Intent.setClassName(String, String)>
	//   23   41:pop             
			intent.setAction("com.baidu.android.pushservice.action.CROSS_REQUEST");
	//   24   42:aload_1         
	//   25   43:ldc1            #121 <String "com.baidu.android.pushservice.action.CROSS_REQUEST">
	//   26   45:invokevirtual   #124 <Method Intent Intent.setAction(String)>
	//   27   48:pop             
			intent.putExtra("bd.cross.request.SENDING", false);
	//   28   49:aload_1         
	//   29   50:ldc1            #126 <String "bd.cross.request.SENDING">
	//   30   52:iconst_0        
	//   31   53:invokevirtual   #130 <Method Intent Intent.putExtra(String, boolean)>
	//   32   56:pop             
			getApplicationContext().startService(intent);
	//   33   57:aload_0         
	//   34   58:invokevirtual   #102 <Method Context getApplicationContext()>
	//   35   61:aload_1         
	//   36   62:invokevirtual   #134 <Method android.content.ComponentName Context.startService(Intent)>
	//   37   65:pop             
			return;
	//   38   66:return          
		}
	//*  39   67:return          
		// Misplaced declaration of an exception variable
		catch(Intent intent)
	//*  40   68:astore_1        
		{
			com.baidu.android.pushservice.e.a.a("CommandService", ((Throwable) (intent)));
	//   41   69:ldc1            #56  <String "CommandService">
	//   42   71:aload_1         
	//   43   72:invokestatic    #111 <Method void a.a(String, Throwable)>
		}
		break MISSING_BLOCK_LABEL_75;
		return;
	//   44   75:return          
	}

	public IBinder onBind(Intent intent)
	{
		com.baidu.android.pushservice.e.a.c("CommandService", "onBind initSuc: ");
	//    0    0:ldc1            #56  <String "CommandService">
	//    1    2:ldc1            #138 <String "onBind initSuc: ">
	//    2    4:invokestatic    #140 <Method void a.c(String, String)>
		return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
	}

	public void onCreate()
	{
		com.baidu.android.pushservice.e.a.c("CommandService", "-- CommandService oncreate -- ");
	//    0    0:ldc1            #56  <String "CommandService">
	//    1    2:ldc1            #143 <String "-- CommandService oncreate -- ">
	//    2    4:invokestatic    #140 <Method void a.c(String, String)>
		super.onCreate();
	//    3    7:aload_0         
	//    4    8:invokespecial   #145 <Method void Service.onCreate()>
	//    5   11:return          
	}

	public void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #148 <Method void Service.onDestroy()>
	//    2    4:return          
	}

	public int onStartCommand(Intent intent, int i, int j)
	{
		Object obj;
		if(intent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       10
		{
			stopSelf();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #155 <Method void stopSelf()>
			return 2;
	//    4    8:iconst_2        
	//    5    9:ireturn         
		}
		Object obj2 = ((Object) (intent.getAction()));
	//    6   10:aload_1         
	//    7   11:invokevirtual   #22  <Method String Intent.getAction()>
	//    8   14:astore          7
		obj = ((Object) (new StringBuilder()));
	//    9   16:new             #30  <Class StringBuilder>
	//   10   19:dup             
	//   11   20:invokespecial   #31  <Method void StringBuilder()>
	//   12   23:astore          5
		((StringBuilder) (obj)).append("action = ");
	//   13   25:aload           5
	//   14   27:ldc1            #157 <String "action = ">
	//   15   29:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		((StringBuilder) (obj)).append(((String) (obj2)));
	//   17   33:aload           5
	//   18   35:aload           7
	//   19   37:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   20   40:pop             
		com.baidu.android.pushservice.e.a.c("CommandService", ((StringBuilder) (obj)).toString());
	//   21   41:ldc1            #56  <String "CommandService">
	//   22   43:aload           5
	//   23   45:invokevirtual   #40  <Method String StringBuilder.toString()>
	//   24   48:invokestatic    #140 <Method void a.c(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   25   51:new             #30  <Class StringBuilder>
	//   26   54:dup             
	//   27   55:invokespecial   #31  <Method void StringBuilder()>
	//   28   58:astore          5
		((StringBuilder) (obj)).append("CommandService#onStartCommand#action = ");
	//   29   60:aload           5
	//   30   62:ldc1            #159 <String "CommandService#onStartCommand#action = ">
	//   31   64:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   32   67:pop             
		((StringBuilder) (obj)).append(((String) (obj2)));
	//   33   68:aload           5
	//   34   70:aload           7
	//   35   72:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   36   75:pop             
		u.b(((StringBuilder) (obj)).toString(), ((Context) (this)));
	//   37   76:aload           5
	//   38   78:invokevirtual   #40  <Method String StringBuilder.toString()>
	//   39   81:aload_0         
	//   40   82:invokestatic    #44  <Method void u.b(String, Context)>
		boolean flag;
		Object obj1;
		String s;
		try
		{
			flag = "com.baidu.android.pushservice.action.passthrough.notification.CLICK".equals(obj2);
	//   41   85:ldc1            #161 <String "com.baidu.android.pushservice.action.passthrough.notification.CLICK">
	//   42   87:aload           7
	//   43   89:invokevirtual   #167 <Method boolean String.equals(Object)>
	//   44   92:istore          4
		}
	//*  45   94:aconst_null     
	//*  46   95:astore          6
	//*  47   97:aconst_null     
	//*  48   98:astore          5
	//*  49  100:iload           4
	//*  50  102:ifne            445
	//*  51  105:ldc1            #169 <String "com.baidu.android.pushservice.action.passthrough.notification.DELETE">
	//*  52  107:aload           7
	//*  53  109:invokevirtual   #167 <Method boolean String.equals(Object)>
	//*  54  112:ifne            445
	//*  55  115:ldc1            #171 <String "com.baidu.android.pushservice.action.passthrough.notification.NOTIFIED">
	//*  56  117:aload           7
	//*  57  119:invokevirtual   #167 <Method boolean String.equals(Object)>
	//*  58  122:ifeq            128
	//*  59  125:goto            445
	//*  60  128:ldc1            #173 <String "com.baidu.android.pushservice.action.privatenotification.CLICK">
	//*  61  130:aload           7
	//*  62  132:invokevirtual   #167 <Method boolean String.equals(Object)>
	//*  63  135:ifne            272
	//*  64  138:ldc1            #175 <String "com.baidu.android.pushservice.action.privatenotification.DELETE">
	//*  65  140:aload           7
	//*  66  142:invokevirtual   #167 <Method boolean String.equals(Object)>
	//*  67  145:ifeq            151
	//*  68  148:goto            272
	//*  69  151:aload_1         
	//*  70  152:ldc1            #177 <String "command_type">
	//*  71  154:invokevirtual   #181 <Method boolean Intent.hasExtra(String)>
	//*  72  157:ifeq            203
	//*  73  160:aload_1         
	//*  74  161:ldc1            #177 <String "command_type">
	//*  75  163:invokevirtual   #117 <Method String Intent.getStringExtra(String)>
	//*  76  166:astore          5
	//*  77  168:new             #30  <Class StringBuilder>
	//*  78  171:dup             
	//*  79  172:invokespecial   #31  <Method void StringBuilder()>
	//*  80  175:astore          6
	//*  81  177:aload           6
	//*  82  179:ldc1            #183 <String "-- command_type -- ">
	//*  83  181:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//*  84  184:pop             
	//*  85  185:aload           6
	//*  86  187:aload           5
	//*  87  189:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//*  88  192:pop             
	//*  89  193:ldc1            #56  <String "CommandService">
	//*  90  195:aload           6
	//*  91  197:invokevirtual   #40  <Method String StringBuilder.toString()>
	//*  92  200:invokestatic    #140 <Method void a.c(String, String)>
	//*  93  203:ldc1            #185 <String "reflect_receiver">
	//*  94  205:aload           5
	//*  95  207:invokevirtual   #167 <Method boolean String.equals(Object)>
	//*  96  210:ifeq            221
	//*  97  213:aload_0         
	//*  98  214:aload_1         
	//*  99  215:invokespecial   #187 <Method void a(Intent)>
	//* 100  218:goto            266
	//* 101  221:aload_1         
	//* 102  222:ldc1            #189 <String "bd.cross.request.COMMAND_TYPE">
	//* 103  224:invokevirtual   #181 <Method boolean Intent.hasExtra(String)>
	//* 104  227:ifeq            266
	//* 105  230:aload_1         
	//* 106  231:ldc1            #189 <String "bd.cross.request.COMMAND_TYPE">
	//* 107  233:invokevirtual   #117 <Method String Intent.getStringExtra(String)>
	//* 108  236:astore          5
	//* 109  238:ldc1            #191 <String "bd.cross.command.MESSAGE_DELIVER">
	//* 110  240:aload           5
	//* 111  242:invokevirtual   #167 <Method boolean String.equals(Object)>
	//* 112  245:ifeq            251
	//* 113  248:goto            213
	//* 114  251:ldc1            #193 <String "bd.cross.command.MESSAGE_ACK">
	//* 115  253:aload           5
	//* 116  255:invokevirtual   #167 <Method boolean String.equals(Object)>
	//* 117  258:ifeq            266
	//* 118  261:aload_0         
	//* 119  262:aload_1         
	//* 120  263:invokespecial   #195 <Method void b(Intent)>
	//* 121  266:aload_0         
	//* 122  267:invokevirtual   #155 <Method void stopSelf()>
	//* 123  270:iconst_2        
	//* 124  271:ireturn         
	//* 125  272:aload_1         
	//* 126  273:ldc1            #197 <String "public_msg">
	//* 127  275:invokevirtual   #201 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//* 128  278:checkcast       #203 <Class PublicMsg>
	//* 129  281:astore          6
	//* 130  283:aload_1         
	//* 131  284:ldc1            #205 <String "app_id">
	//* 132  286:invokevirtual   #117 <Method String Intent.getStringExtra(String)>
	//* 133  289:astore          8
	//* 134  291:aload_1         
	//* 135  292:ldc1            #207 <String "msg_id">
	//* 136  294:invokevirtual   #117 <Method String Intent.getStringExtra(String)>
	//* 137  297:astore          5
	//* 138  299:aload           6
	//* 139  301:aload_0         
	//* 140  302:invokevirtual   #102 <Method Context getApplicationContext()>
	//* 141  305:aload           7
	//* 142  307:aload           5
	//* 143  309:aload           8
	//* 144  311:invokevirtual   #211 <Method void PublicMsg.handlePrivateNotification(Context, String, String, String)>
	//* 145  314:aload_1         
	//* 146  315:ldc1            #213 <String "hw_push_type">
	//* 147  317:iconst_0        
	//* 148  318:invokevirtual   #217 <Method int Intent.getIntExtra(String, int)>
	//* 149  321:istore_2        
	//* 150  322:aload_1         
	//* 151  323:ldc1            #219 <String "hw_gid">
	//* 152  325:invokevirtual   #117 <Method String Intent.getStringExtra(String)>
	//* 153  328:astore_1        
	//* 154  329:ldc1            #173 <String "com.baidu.android.pushservice.action.privatenotification.CLICK">
	//* 155  331:aload           7
	//* 156  333:invokevirtual   #167 <Method boolean String.equals(Object)>
	//* 157  336:ifeq            386
	//* 158  339:aload_0         
	//* 159  340:invokevirtual   #102 <Method Context getApplicationContext()>
	//* 160  343:astore          6
	//* 161  345:new             #30  <Class StringBuilder>
	//* 162  348:dup             
	//* 163  349:invokespecial   #31  <Method void StringBuilder()>
	//* 164  352:astore          7
	//* 165  354:aload           7
	//* 166  356:aload_1         
	//* 167  357:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//* 168  360:pop             
	//* 169  361:aload           7
	//* 170  363:ldc1            #221 <String "">
	//* 171  365:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//* 172  368:pop             
	//* 173  369:aload           6
	//* 174  371:aload           5
	//* 175  373:iload_2         
	//* 176  374:aload           7
	//* 177  376:invokevirtual   #40  <Method String StringBuilder.toString()>
	//* 178  379:iconst_1        
	//* 179  380:invokestatic    #226 <Method void f.a(Context, String, int, String, int)>
	//* 180  383:goto            439
	//* 181  386:ldc1            #175 <String "com.baidu.android.pushservice.action.privatenotification.DELETE">
	//* 182  388:aload           7
	//* 183  390:invokevirtual   #167 <Method boolean String.equals(Object)>
	//* 184  393:ifeq            439
	//* 185  396:aload_0         
	//* 186  397:invokevirtual   #102 <Method Context getApplicationContext()>
	//* 187  400:astore          6
	//* 188  402:new             #30  <Class StringBuilder>
	//* 189  405:dup             
	//* 190  406:invokespecial   #31  <Method void StringBuilder()>
	//* 191  409:astore          7
	//* 192  411:aload           7
	//* 193  413:aload_1         
	//* 194  414:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//* 195  417:pop             
	//* 196  418:aload           7
	//* 197  420:ldc1            #221 <String "">
	//* 198  422:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//* 199  425:pop             
	//* 200  426:aload           6
	//* 201  428:aload           5
	//* 202  430:iload_2         
	//* 203  431:aload           7
	//* 204  433:invokevirtual   #40  <Method String StringBuilder.toString()>
	//* 205  436:invokestatic    #229 <Method void f.a(Context, String, int, String)>
	//* 206  439:aload_0         
	//* 207  440:invokevirtual   #155 <Method void stopSelf()>
	//* 208  443:iconst_2        
	//* 209  444:ireturn         
	//* 210  445:ldc1            #231 <String "push_passthrough: receive  click delete and notified action">
	//* 211  447:aload_0         
	//* 212  448:invokevirtual   #102 <Method Context getApplicationContext()>
	//* 213  451:invokestatic    #44  <Method void u.b(String, Context)>
	//* 214  454:new             #30  <Class StringBuilder>
	//* 215  457:dup             
	//* 216  458:invokespecial   #31  <Method void StringBuilder()>
	//* 217  461:astore          5
	//* 218  463:aload           5
	//* 219  465:ldc1            #233 <String "handle passthrough notification ">
	//* 220  467:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//* 221  470:pop             
	//* 222  471:aload           5
	//* 223  473:aload           7
	//* 224  475:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//* 225  478:pop             
	//* 226  479:ldc1            #56  <String "CommandService">
	//* 227  481:aload           5
	//* 228  483:invokevirtual   #40  <Method String StringBuilder.toString()>
	//* 229  486:invokestatic    #140 <Method void a.c(String, String)>
	//* 230  489:aload_1         
	//* 231  490:ldc1            #205 <String "app_id">
	//* 232  492:invokevirtual   #181 <Method boolean Intent.hasExtra(String)>
	//* 233  495:ifeq            586
	//* 234  498:aload_1         
	//* 235  499:ldc1            #205 <String "app_id">
	//* 236  501:invokevirtual   #117 <Method String Intent.getStringExtra(String)>
	//* 237  504:astore          5
	//* 238  506:goto            509
	//* 239  509:aload_1         
	//* 240  510:ldc1            #207 <String "msg_id">
	//* 241  512:invokevirtual   #181 <Method boolean Intent.hasExtra(String)>
	//* 242  515:ifeq            526
	//* 243  518:aload_1         
	//* 244  519:ldc1            #207 <String "msg_id">
	//* 245  521:invokevirtual   #117 <Method String Intent.getStringExtra(String)>
	//* 246  524:astore          6
	//* 247  526:aload_0         
	//* 248  527:invokevirtual   #102 <Method Context getApplicationContext()>
	//* 249  530:aload           6
	//* 250  532:aload           5
	//* 251  534:aload           7
	//* 252  536:invokestatic    #237 <Method void k.a(Context, String, String, String)>
	//* 253  539:aload_0         
	//* 254  540:invokevirtual   #155 <Method void stopSelf()>
	//* 255  543:iconst_2        
	//* 256  544:ireturn         
		// Misplaced declaration of an exception variable
		catch(Intent intent)
	//* 257  545:astore_1        
		{
			obj = ((Object) (new StringBuilder()));
	//  258  546:new             #30  <Class StringBuilder>
	//  259  549:dup             
	//  260  550:invokespecial   #31  <Method void StringBuilder()>
	//  261  553:astore          5
			((StringBuilder) (obj)).append("runtime e: ");
	//  262  555:aload           5
	//  263  557:ldc1            #239 <String "runtime e: ">
	//  264  559:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//  265  562:pop             
			((StringBuilder) (obj)).append(((Object) (intent)));
	//  266  563:aload           5
	//  267  565:aload_1         
	//  268  566:invokevirtual   #242 <Method StringBuilder StringBuilder.append(Object)>
	//  269  569:pop             
			com.baidu.android.pushservice.e.a.e("CommandService", ((StringBuilder) (obj)).toString());
	//  270  570:ldc1            #56  <String "CommandService">
	//  271  572:aload           5
	//  272  574:invokevirtual   #40  <Method String StringBuilder.toString()>
	//  273  577:invokestatic    #245 <Method void a.e(String, String)>
			stopSelf();
	//  274  580:aload_0         
	//  275  581:invokevirtual   #155 <Method void stopSelf()>
			return 2;
	//  276  584:iconst_2        
	//  277  585:ireturn         
		}
		obj1 = null;
		obj = null;
		if(flag)
			break MISSING_BLOCK_LABEL_445;
		if("com.baidu.android.pushservice.action.passthrough.notification.DELETE".equals(obj2) || "com.baidu.android.pushservice.action.passthrough.notification.NOTIFIED".equals(obj2))
			break MISSING_BLOCK_LABEL_445;
		if("com.baidu.android.pushservice.action.privatenotification.CLICK".equals(obj2) || "com.baidu.android.pushservice.action.privatenotification.DELETE".equals(obj2))
			break MISSING_BLOCK_LABEL_272;
		if(intent.hasExtra("command_type"))
		{
			obj = ((Object) (intent.getStringExtra("command_type")));
			obj1 = ((Object) (new StringBuilder()));
			((StringBuilder) (obj1)).append("-- command_type -- ");
			((StringBuilder) (obj1)).append(((String) (obj)));
			com.baidu.android.pushservice.e.a.c("CommandService", ((StringBuilder) (obj1)).toString());
		}
		if(!"reflect_receiver".equals(obj)) goto _L2; else goto _L1
_L1:
		a(intent);
		break; /* Loop/switch isn't completed */
_L2:
		if(!intent.hasExtra("bd.cross.request.COMMAND_TYPE"))
			break; /* Loop/switch isn't completed */
		if("bd.cross.command.MESSAGE_DELIVER".equals(obj = ((Object) (intent.getStringExtra("bd.cross.request.COMMAND_TYPE")))))
			continue; /* Loop/switch isn't completed */
		if("bd.cross.command.MESSAGE_ACK".equals(obj))
			b(intent);
		break; /* Loop/switch isn't completed */
		if(true) goto _L1; else goto _L3
_L3:
		stopSelf();
		return 2;
		obj1 = ((Object) ((PublicMsg)intent.getParcelableExtra("public_msg")));
		s = intent.getStringExtra("app_id");
		obj = ((Object) (intent.getStringExtra("msg_id")));
		((PublicMsg) (obj1)).handlePrivateNotification(getApplicationContext(), ((String) (obj2)), ((String) (obj)), s);
		i = intent.getIntExtra("hw_push_type", 0);
		intent = ((Intent) (intent.getStringExtra("hw_gid")));
		if("com.baidu.android.pushservice.action.privatenotification.CLICK".equals(obj2))
		{
			obj1 = ((Object) (getApplicationContext()));
			obj2 = ((Object) (new StringBuilder()));
			((StringBuilder) (obj2)).append(((String) (intent)));
			((StringBuilder) (obj2)).append("");
			f.a(((Context) (obj1)), ((String) (obj)), i, ((StringBuilder) (obj2)).toString(), 1);
			break MISSING_BLOCK_LABEL_439;
		}
		if("com.baidu.android.pushservice.action.privatenotification.DELETE".equals(obj2))
		{
			obj1 = ((Object) (getApplicationContext()));
			obj2 = ((Object) (new StringBuilder()));
			((StringBuilder) (obj2)).append(((String) (intent)));
			((StringBuilder) (obj2)).append("");
			f.a(((Context) (obj1)), ((String) (obj)), i, ((StringBuilder) (obj2)).toString());
		}
		stopSelf();
		return 2;
		u.b("push_passthrough: receive  click delete and notified action", getApplicationContext());
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("handle passthrough notification ");
		((StringBuilder) (obj)).append(((String) (obj2)));
		com.baidu.android.pushservice.e.a.c("CommandService", ((StringBuilder) (obj)).toString());
		if(!intent.hasExtra("app_id")) goto _L5; else goto _L4
_L4:
		obj = ((Object) (intent.getStringExtra("app_id")));
_L7:
		if(intent.hasExtra("msg_id"))
			obj1 = ((Object) (intent.getStringExtra("msg_id")));
		k.a(getApplicationContext(), ((String) (obj1)), ((String) (obj)), ((String) (obj2)));
		stopSelf();
		return 2;
_L5:
		obj = null;
	//  278  586:aconst_null     
	//  279  587:astore          5
		if(true) goto _L7; else goto _L6
	//  280  589:goto            509
_L6:
	}

	public boolean onUnbind(Intent intent)
	{
		return super.onUnbind(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #249 <Method boolean Service.onUnbind(Intent)>
	//    3    5:ireturn         
	}
}
