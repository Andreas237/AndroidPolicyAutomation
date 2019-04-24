// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.IBinder;
import android.os.Process;
import android.text.TextUtils;
import com.baidu.android.pushservice.e.a;
import com.baidu.android.pushservice.e.b;
import com.baidu.android.pushservice.h.d;
import com.baidu.android.pushservice.h.q;
import com.baidu.android.pushservice.h.u;
import org.json.JSONObject;

// Referenced classes of package com.baidu.android.pushservice:
//			g, SDcardRemovedReceiver, a

public class PushService extends Service
{

	public PushService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Service()>
		a = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #27  <Field boolean a>
		b = new Handler();
	//    5    9:aload_0         
	//    6   10:new             #29  <Class Handler>
	//    7   13:dup             
	//    8   14:invokespecial   #30  <Method void Handler()>
	//    9   17:putfield        #32  <Field Handler b>
		d = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #34  <Field boolean d>
		e = new Runnable() {

			public void run()
			{
				a.stopSelf();
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field PushService a>
			//    2    4:invokevirtual   #22  <Method void PushService.stopSelf()>
				com.baidu.android.pushservice.g.b();
			//    3    7:invokestatic    #27  <Method void com.baidu.android.pushservice.g.b()>
				boolean flag;
				if(com.baidu.android.pushservice.PushService.a(a) > 0)
			//*   4   10:aload_0         
			//*   5   11:getfield        #14  <Field PushService a>
			//*   6   14:invokestatic    #30  <Method int com.baidu.android.pushservice.PushService.a(PushService)>
			//*   7   17:ifle            25
					flag = true;
			//    8   20:iconst_1        
			//    9   21:istore_1        
				else
			//*  10   22:goto            27
					flag = false;
			//   11   25:iconst_0        
			//   12   26:istore_1        
				if(flag & (true ^ a.getPackageName().equals(((Object) (u.y(a.getApplicationContext()))))))
			//*  13   27:iload_1         
			//*  14   28:iconst_1        
			//*  15   29:aload_0         
			//*  16   30:getfield        #14  <Field PushService a>
			//*  17   33:invokevirtual   #34  <Method String PushService.getPackageName()>
			//*  18   36:aload_0         
			//*  19   37:getfield        #14  <Field PushService a>
			//*  20   40:invokevirtual   #38  <Method Context PushService.getApplicationContext()>
			//*  21   43:invokestatic    #44  <Method String u.y(Context)>
			//*  22   46:invokevirtual   #50  <Method boolean String.equals(Object)>
			//*  23   49:ixor            
			//*  24   50:iand            
			//*  25   51:ifeq            61
					a.onDestroy();
			//   26   54:aload_0         
			//   27   55:getfield        #14  <Field PushService a>
			//   28   58:invokevirtual   #53  <Method void PushService.onDestroy()>
			//   29   61:return          
			}

			final PushService a;

			
			{
				a = PushService.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field PushService a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   13   25:aload_0         
	//   14   26:new             #6   <Class PushService$1>
	//   15   29:dup             
	//   16   30:aload_0         
	//   17   31:invokespecial   #37  <Method void PushService$1(PushService)>
	//   18   34:putfield        #39  <Field Runnable e>
		f = 0;
	//   19   37:aload_0         
	//   20   38:iconst_0        
	//   21   39:putfield        #41  <Field int f>
	//   22   42:aload_0         
	//   23   43:new             #8   <Class PushService$2>
	//   24   46:dup             
	//   25   47:aload_0         
	//   26   48:invokespecial   #42  <Method void PushService$2(PushService)>
	//   27   51:putfield        #44  <Field com.baidu.android.pushservice.a.a$a g>
	//   28   54:return          
	}

	static int a(PushService pushservice)
	{
		return pushservice.f;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int f>
	//    2    4:ireturn         
	}

	static String a(PushService pushservice, String s, String s1)
	{
		return pushservice.a(s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #50  <Method String a(String, String)>
	//    4    6:areturn         
	}

	private String a(String s, String s1)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #54  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #55  <Method void JSONObject()>
	//    3    7:astore_3        
		try
		{
			jsonobject.put("error", 30602);
	//    4    8:aload_3         
	//    5    9:ldc1            #57  <String "error">
	//    6   11:sipush          30602
	//    7   14:invokevirtual   #61  <Method JSONObject JSONObject.put(String, int)>
	//    8   17:pop             
			if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   9   18:aload_1         
	//*  10   19:invokestatic    #67  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  11   22:ifne            33
				jsonobject.put("app_id", ((Object) (s)));
	//   12   25:aload_3         
	//   13   26:ldc1            #69  <String "app_id">
	//   14   28:aload_1         
	//   15   29:invokevirtual   #72  <Method JSONObject JSONObject.put(String, Object)>
	//   16   32:pop             
			if(!TextUtils.isEmpty(((CharSequence) (s1))))
	//*  17   33:aload_2         
	//*  18   34:invokestatic    #67  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  19   37:ifne            48
				jsonobject.put("api_key", ((Object) (s1)));
	//   20   40:aload_3         
	//   21   41:ldc1            #74  <String "api_key">
	//   22   43:aload_2         
	//   23   44:invokevirtual   #72  <Method JSONObject JSONObject.put(String, Object)>
	//   24   47:pop             
			jsonobject.put("error_msg", "NOT SUPPORTED ANYMORE");
	//   25   48:aload_3         
	//   26   49:ldc1            #76  <String "error_msg">
	//   27   51:ldc1            #78  <String "NOT SUPPORTED ANYMORE">
	//   28   53:invokevirtual   #72  <Method JSONObject JSONObject.put(String, Object)>
	//   29   56:pop             
		}
	//*  30   57:goto            67
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  31   60:astore_1        
		{
			com.baidu.android.pushservice.e.a.a("PushService", ((Throwable) (s)));
	//   32   61:ldc1            #80  <String "PushService">
	//   33   63:aload_1         
	//   34   64:invokestatic    #85  <Method void a.a(String, Throwable)>
		}
		return jsonobject.toString();
	//   35   67:aload_3         
	//   36   68:invokevirtual   #89  <Method String JSONObject.toString()>
	//   37   71:areturn         
	}

	private void a(boolean flag, boolean flag1)
	{
		a = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #27  <Field boolean a>
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #92  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #93  <Method void StringBuilder()>
	//    6   12:astore_3        
		stringbuilder.append("stopSelf : exitOnDestroy=");
	//    7   13:aload_3         
	//    8   14:ldc1            #95  <String "stopSelf : exitOnDestroy=">
	//    9   16:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   10   19:pop             
		stringbuilder.append(flag);
	//   11   20:aload_3         
	//   12   21:iload_1         
	//   13   22:invokevirtual   #102 <Method StringBuilder StringBuilder.append(boolean)>
	//   14   25:pop             
		stringbuilder.append(" --- immediate=");
	//   15   26:aload_3         
	//   16   27:ldc1            #104 <String " --- immediate=">
	//   17   29:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   18   32:pop             
		stringbuilder.append(flag1);
	//   19   33:aload_3         
	//   20   34:iload_2         
	//   21   35:invokevirtual   #102 <Method StringBuilder StringBuilder.append(boolean)>
	//   22   38:pop             
		com.baidu.android.pushservice.e.b.a("PushService", stringbuilder.toString(), getApplicationContext());
	//   23   39:ldc1            #80  <String "PushService">
	//   24   41:aload_3         
	//   25   42:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   26   45:aload_0         
	//   27   46:invokevirtual   #109 <Method Context getApplicationContext()>
	//   28   49:invokestatic    #114 <Method void b.a(String, String, Context)>
		if(flag1)
	//*  29   52:iload_2         
	//*  30   53:ifeq            66
		{
			e.run();
	//   31   56:aload_0         
	//   32   57:getfield        #39  <Field Runnable e>
	//   33   60:invokeinterface #119 <Method void Runnable.run()>
			return;
	//   34   65:return          
		} else
		{
			b.removeCallbacks(e);
	//   35   66:aload_0         
	//   36   67:getfield        #32  <Field Handler b>
	//   37   70:aload_0         
	//   38   71:getfield        #39  <Field Runnable e>
	//   39   74:invokevirtual   #123 <Method void Handler.removeCallbacks(Runnable)>
			b.postDelayed(e, 1000L);
	//   40   77:aload_0         
	//   41   78:getfield        #32  <Field Handler b>
	//   42   81:aload_0         
	//   43   82:getfield        #39  <Field Runnable e>
	//   44   85:ldc2w           #124 <Long 1000L>
	//   45   88:invokevirtual   #129 <Method boolean Handler.postDelayed(Runnable, long)>
	//   46   91:pop             
			return;
	//   47   92:return          
		}
	}

	public IBinder onBind(Intent intent)
	{
		f = f + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #41  <Field int f>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #41  <Field int f>
		StringBuilder stringbuilder = new StringBuilder();
	//    6   10:new             #92  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #93  <Method void StringBuilder()>
	//    9   17:astore_2        
		stringbuilder.append("onBind(");
	//   10   18:aload_2         
	//   11   19:ldc1            #133 <String "onBind(">
	//   12   21:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   24:pop             
		stringbuilder.append(f);
	//   14   25:aload_2         
	//   15   26:aload_0         
	//   16   27:getfield        #41  <Field int f>
	//   17   30:invokevirtual   #136 <Method StringBuilder StringBuilder.append(int)>
	//   18   33:pop             
		stringbuilder.append("), intent=");
	//   19   34:aload_2         
	//   20   35:ldc1            #138 <String "), intent=">
	//   21   37:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   22   40:pop             
		stringbuilder.append(((Object) (intent)));
	//   23   41:aload_2         
	//   24   42:aload_1         
	//   25   43:invokevirtual   #141 <Method StringBuilder StringBuilder.append(Object)>
	//   26   46:pop             
		stringbuilder.append(" cur: ");
	//   27   47:aload_2         
	//   28   48:ldc1            #143 <String " cur: ">
	//   29   50:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   30   53:pop             
		stringbuilder.append(getApplicationContext().getPackageName());
	//   31   54:aload_2         
	//   32   55:aload_0         
	//   33   56:invokevirtual   #109 <Method Context getApplicationContext()>
	//   34   59:invokevirtual   #148 <Method String Context.getPackageName()>
	//   35   62:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   36   65:pop             
		stringbuilder.append(" initSuc: ");
	//   37   66:aload_2         
	//   38   67:ldc1            #150 <String " initSuc: ">
	//   39   69:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   40   72:pop             
		stringbuilder.append(d);
	//   41   73:aload_2         
	//   42   74:aload_0         
	//   43   75:getfield        #34  <Field boolean d>
	//   44   78:invokevirtual   #102 <Method StringBuilder StringBuilder.append(boolean)>
	//   45   81:pop             
		com.baidu.android.pushservice.e.a.c("PushService", stringbuilder.toString());
	//   46   82:ldc1            #80  <String "PushService">
	//   47   84:aload_2         
	//   48   85:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   49   88:invokestatic    #153 <Method void a.c(String, String)>
		if(d)
	//*  50   91:aload_0         
	//*  51   92:getfield        #34  <Field boolean d>
	//*  52   95:ifeq            103
			return ((IBinder) (g));
	//   53   98:aload_0         
	//   54   99:getfield        #44  <Field com.baidu.android.pushservice.a.a$a g>
	//   55  102:areturn         
		else
			return null;
	//   56  103:aconst_null     
	//   57  104:areturn         
	}

	public void onCreate()
	{
		super.onCreate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #156 <Method void Service.onCreate()>
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #92  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #93  <Method void StringBuilder()>
	//    5   11:astore_1        
		stringbuilder.append("onCreate from : ");
	//    6   12:aload_1         
	//    7   13:ldc1            #158 <String "onCreate from : ">
	//    8   15:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(getPackageName());
	//   10   19:aload_1         
	//   11   20:aload_0         
	//   12   21:invokevirtual   #159 <Method String getPackageName()>
	//   13   24:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
		com.baidu.android.pushservice.e.b.a("PushService", stringbuilder.toString(), getApplicationContext());
	//   15   28:ldc1            #80  <String "PushService">
	//   16   30:aload_1         
	//   17   31:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   18   34:aload_0         
	//   19   35:invokevirtual   #109 <Method Context getApplicationContext()>
	//   20   38:invokestatic    #114 <Method void b.a(String, String, Context)>
		stringbuilder = new StringBuilder();
	//   21   41:new             #92  <Class StringBuilder>
	//   22   44:dup             
	//   23   45:invokespecial   #93  <Method void StringBuilder()>
	//   24   48:astore_1        
		stringbuilder.append("PushService onCreate from : ");
	//   25   49:aload_1         
	//   26   50:ldc1            #161 <String "PushService onCreate from : ">
	//   27   52:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   28   55:pop             
		stringbuilder.append(getPackageName());
	//   29   56:aload_1         
	//   30   57:aload_0         
	//   31   58:invokevirtual   #159 <Method String getPackageName()>
	//   32   61:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   33   64:pop             
		stringbuilder.append(" at Time :");
	//   34   65:aload_1         
	//   35   66:ldc1            #163 <String " at Time :">
	//   36   68:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   37   71:pop             
		stringbuilder.append(System.currentTimeMillis());
	//   38   72:aload_1         
	//   39   73:invokestatic    #169 <Method long System.currentTimeMillis()>
	//   40   76:invokevirtual   #172 <Method StringBuilder StringBuilder.append(long)>
	//   41   79:pop             
		u.b(stringbuilder.toString(), getApplicationContext());
	//   42   80:aload_1         
	//   43   81:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   44   84:aload_0         
	//   45   85:invokevirtual   #109 <Method Context getApplicationContext()>
	//   46   88:invokestatic    #177 <Method void u.b(String, Context)>
		d = com.baidu.android.pushservice.g.a(((Context) (this))).a();
	//   47   91:aload_0         
	//   48   92:aload_0         
	//   49   93:invokestatic    #182 <Method g com.baidu.android.pushservice.g.a(Context)>
	//   50   96:invokevirtual   #185 <Method boolean com.baidu.android.pushservice.g.a()>
	//   51   99:putfield        #34  <Field boolean d>
		if(!d)
	//*  52  102:aload_0         
	//*  53  103:getfield        #34  <Field boolean d>
	//*  54  106:ifne            116
		{
			a(true, true);
	//   55  109:aload_0         
	//   56  110:iconst_1        
	//   57  111:iconst_1        
	//   58  112:invokespecial   #187 <Method void a(boolean, boolean)>
			return;
	//   59  115:return          
		}
		try
		{
			c = new SDcardRemovedReceiver();
	//   60  116:aload_0         
	//   61  117:new             #189 <Class SDcardRemovedReceiver>
	//   62  120:dup             
	//   63  121:invokespecial   #190 <Method void SDcardRemovedReceiver()>
	//   64  124:putfield        #192 <Field SDcardRemovedReceiver c>
			IntentFilter intentfilter = new IntentFilter();
	//   65  127:new             #194 <Class IntentFilter>
	//   66  130:dup             
	//   67  131:invokespecial   #195 <Method void IntentFilter()>
	//   68  134:astore_1        
			intentfilter.addAction("android.intent.action.MEDIA_BAD_REMOVAL");
	//   69  135:aload_1         
	//   70  136:ldc1            #197 <String "android.intent.action.MEDIA_BAD_REMOVAL">
	//   71  138:invokevirtual   #201 <Method void IntentFilter.addAction(String)>
			intentfilter.addAction("android.intent.action.MEDIA_REMOVED");
	//   72  141:aload_1         
	//   73  142:ldc1            #203 <String "android.intent.action.MEDIA_REMOVED">
	//   74  144:invokevirtual   #201 <Method void IntentFilter.addAction(String)>
			registerReceiver(((android.content.BroadcastReceiver) (c)), intentfilter);
	//   75  147:aload_0         
	//   76  148:aload_0         
	//   77  149:getfield        #192 <Field SDcardRemovedReceiver c>
	//   78  152:aload_1         
	//   79  153:invokevirtual   #207 <Method Intent registerReceiver(android.content.BroadcastReceiver, IntentFilter)>
	//   80  156:pop             
			return;
	//   81  157:return          
		}
		catch(Exception exception)
	//*  82  158:astore_1        
		{
			com.baidu.android.pushservice.e.a.a("PushService", ((Throwable) (exception)));
	//   83  159:ldc1            #80  <String "PushService">
	//   84  161:aload_1         
	//   85  162:invokestatic    #85  <Method void a.a(String, Throwable)>
		}
	//   86  165:return          
	}

	public void onDestroy()
	{
		Exception exception;
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #210 <Method void Service.onDestroy()>
		q.b(getApplicationContext(), ((String) (null)));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #109 <Method Context getApplicationContext()>
	//    4    8:aconst_null     
	//    5    9:invokestatic    #215 <Method void q.b(Context, String)>
		StringBuilder stringbuilder = new StringBuilder();
	//    6   12:new             #92  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #93  <Method void StringBuilder()>
	//    9   19:astore_1        
		stringbuilder.append("onDestroy from : ");
	//   10   20:aload_1         
	//   11   21:ldc1            #217 <String "onDestroy from : ">
	//   12   23:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(getPackageName());
	//   14   27:aload_1         
	//   15   28:aload_0         
	//   16   29:invokevirtual   #159 <Method String getPackageName()>
	//   17   32:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
		com.baidu.android.pushservice.e.b.a("PushService", stringbuilder.toString(), getApplicationContext());
	//   19   36:ldc1            #80  <String "PushService">
	//   20   38:aload_1         
	//   21   39:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   22   42:aload_0         
	//   23   43:invokevirtual   #109 <Method Context getApplicationContext()>
	//   24   46:invokestatic    #114 <Method void b.a(String, String, Context)>
		stringbuilder = new StringBuilder();
	//   25   49:new             #92  <Class StringBuilder>
	//   26   52:dup             
	//   27   53:invokespecial   #93  <Method void StringBuilder()>
	//   28   56:astore_1        
		stringbuilder.append("PushService onDestroy from : ");
	//   29   57:aload_1         
	//   30   58:ldc1            #219 <String "PushService onDestroy from : ">
	//   31   60:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   32   63:pop             
		stringbuilder.append(getPackageName());
	//   33   64:aload_1         
	//   34   65:aload_0         
	//   35   66:invokevirtual   #159 <Method String getPackageName()>
	//   36   69:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   37   72:pop             
		stringbuilder.append(" at Time :");
	//   38   73:aload_1         
	//   39   74:ldc1            #163 <String " at Time :">
	//   40   76:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   41   79:pop             
		stringbuilder.append(System.currentTimeMillis());
	//   42   80:aload_1         
	//   43   81:invokestatic    #169 <Method long System.currentTimeMillis()>
	//   44   84:invokevirtual   #172 <Method StringBuilder StringBuilder.append(long)>
	//   45   87:pop             
		u.b(stringbuilder.toString(), getApplicationContext());
	//   46   88:aload_1         
	//   47   89:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   48   92:aload_0         
	//   49   93:invokevirtual   #109 <Method Context getApplicationContext()>
	//   50   96:invokestatic    #177 <Method void u.b(String, Context)>
		try
		{
			unregisterReceiver(((android.content.BroadcastReceiver) (c)));
	//   51   99:aload_0         
	//   52  100:aload_0         
	//   53  101:getfield        #192 <Field SDcardRemovedReceiver c>
	//   54  104:invokevirtual   #223 <Method void unregisterReceiver(android.content.BroadcastReceiver)>
		}
	//*  55  107:goto            117
	//*  56  110:ldc1            #80  <String "PushService">
	//*  57  112:ldc1            #225 <String "sdcard receiver unregister failed">
	//*  58  114:invokestatic    #153 <Method void a.c(String, String)>
	//*  59  117:invokestatic    #227 <Method void com.baidu.android.pushservice.g.b()>
	//*  60  120:aload_0         
	//*  61  121:getfield        #27  <Field boolean a>
	//*  62  124:ifeq            133
	//*  63  127:invokestatic    #233 <Method int Process.myPid()>
	//*  64  130:invokestatic    #237 <Method void Process.killProcess(int)>
	//*  65  133:return          
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			com.baidu.android.pushservice.e.a.c("PushService", "sdcard receiver unregister failed");
		}
		com.baidu.android.pushservice.g.b();
		if(a)
			Process.killProcess(Process.myPid());
	//*  66  134:astore_1        
	//*  67  135:goto            110
	}

	public int onStartCommand(Intent intent, int i, int j)
	{
label0:
		{
			if(intent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       26
			{
				intent = new Intent();
	//    2    4:new             #241 <Class Intent>
	//    3    7:dup             
	//    4    8:invokespecial   #242 <Method void Intent()>
	//    5   11:astore_1        
				com.baidu.android.pushservice.e.b.c("PushService", "--- onStart by null intent!", getApplicationContext());
	//    6   12:ldc1            #80  <String "PushService">
	//    7   14:ldc1            #244 <String "--- onStart by null intent!">
	//    8   16:aload_0         
	//    9   17:invokevirtual   #109 <Method Context getApplicationContext()>
	//   10   20:invokestatic    #246 <Method void b.c(String, String, Context)>
			} else
	//*  11   23:goto            154
			{
				try
				{
					String s = intent.toUri(0);
	//   12   26:aload_1         
	//   13   27:iconst_0        
	//   14   28:invokevirtual   #250 <Method String Intent.toUri(int)>
	//   15   31:astore          4
					StringBuilder stringbuilder1 = new StringBuilder();
	//   16   33:new             #92  <Class StringBuilder>
	//   17   36:dup             
	//   18   37:invokespecial   #93  <Method void StringBuilder()>
	//   19   40:astore          5
					stringbuilder1.append("-- onStartCommand -- ");
	//   20   42:aload           5
	//   21   44:ldc1            #252 <String "-- onStartCommand -- ">
	//   22   46:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   23   49:pop             
					stringbuilder1.append(s);
	//   24   50:aload           5
	//   25   52:aload           4
	//   26   54:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   27   57:pop             
					com.baidu.android.pushservice.e.a.c("PushService", stringbuilder1.toString());
	//   28   58:ldc1            #80  <String "PushService">
	//   29   60:aload           5
	//   30   62:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   31   65:invokestatic    #153 <Method void a.c(String, String)>
					stringbuilder1 = new StringBuilder();
	//   32   68:new             #92  <Class StringBuilder>
	//   33   71:dup             
	//   34   72:invokespecial   #93  <Method void StringBuilder()>
	//   35   75:astore          5
					stringbuilder1.append("PushService onStartCommand from ");
	//   36   77:aload           5
	//   37   79:ldc1            #254 <String "PushService onStartCommand from ">
	//   38   81:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   39   84:pop             
					stringbuilder1.append(getPackageName());
	//   40   85:aload           5
	//   41   87:aload_0         
	//   42   88:invokevirtual   #159 <Method String getPackageName()>
	//   43   91:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   44   94:pop             
					stringbuilder1.append(" Intent ");
	//   45   95:aload           5
	//   46   97:ldc2            #256 <String " Intent ">
	//   47  100:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   48  103:pop             
					stringbuilder1.append(s);
	//   49  104:aload           5
	//   50  106:aload           4
	//   51  108:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   52  111:pop             
					stringbuilder1.append(" at Time ");
	//   53  112:aload           5
	//   54  114:ldc2            #258 <String " at Time ">
	//   55  117:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   56  120:pop             
					stringbuilder1.append(System.currentTimeMillis());
	//   57  121:aload           5
	//   58  123:invokestatic    #169 <Method long System.currentTimeMillis()>
	//   59  126:invokevirtual   #172 <Method StringBuilder StringBuilder.append(long)>
	//   60  129:pop             
					u.b(stringbuilder1.toString(), getApplicationContext());
	//   61  130:aload           5
	//   62  132:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   63  135:aload_0         
	//   64  136:invokevirtual   #109 <Method Context getApplicationContext()>
	//   65  139:invokestatic    #177 <Method void u.b(String, Context)>
				}
	//*  66  142:goto            154
				catch(Exception exception)
	//*  67  145:astore          4
				{
					com.baidu.android.pushservice.e.a.a("PushService", ((Throwable) (exception)));
	//   68  147:ldc1            #80  <String "PushService">
	//   69  149:aload           4
	//   70  151:invokestatic    #85  <Method void a.a(String, Throwable)>
				}
			}
			b.removeCallbacks(e);
	//   71  154:aload_0         
	//   72  155:getfield        #32  <Field Handler b>
	//   73  158:aload_0         
	//   74  159:getfield        #39  <Field Runnable e>
	//   75  162:invokevirtual   #123 <Method void Handler.removeCallbacks(Runnable)>
			if("com.baidu.android.pushservice.action.CROSS_REQUEST".equals(((Object) (intent.getAction()))))
	//*  76  165:ldc2            #260 <String "com.baidu.android.pushservice.action.CROSS_REQUEST">
	//*  77  168:aload_1         
	//*  78  169:invokevirtual   #263 <Method String Intent.getAction()>
	//*  79  172:invokevirtual   #269 <Method boolean String.equals(Object)>
	//*  80  175:ifeq            186
				com.baidu.android.pushservice.h.d.a(getApplicationContext(), intent);
	//   81  178:aload_0         
	//   82  179:invokevirtual   #109 <Method Context getApplicationContext()>
	//   83  182:aload_1         
	//   84  183:invokestatic    #274 <Method void d.a(Context, Intent)>
			try
			{
				d = com.baidu.android.pushservice.g.a(((Context) (this))).a(intent);
	//   85  186:aload_0         
	//   86  187:aload_0         
	//   87  188:invokestatic    #182 <Method g com.baidu.android.pushservice.g.a(Context)>
	//   88  191:aload_1         
	//   89  192:invokevirtual   #277 <Method boolean com.baidu.android.pushservice.g.a(Intent)>
	//   90  195:putfield        #34  <Field boolean d>
				if(d)
					break label0;
	//   91  198:aload_0         
	//   92  199:getfield        #34  <Field boolean d>
	//   93  202:ifne            213
				a(true, true);
	//   94  205:aload_0         
	//   95  206:iconst_1        
	//   96  207:iconst_1        
	//   97  208:invokespecial   #187 <Method void a(boolean, boolean)>
			}
	//*  98  211:iconst_2        
	//*  99  212:ireturn         
	//* 100  213:iconst_1        
	//* 101  214:ireturn         
			// Misplaced declaration of an exception variable
			catch(Intent intent)
	//* 102  215:astore_1        
			{
				StringBuilder stringbuilder = new StringBuilder();
	//  103  216:new             #92  <Class StringBuilder>
	//  104  219:dup             
	//  105  220:invokespecial   #93  <Method void StringBuilder()>
	//  106  223:astore          4
				stringbuilder.append("error : ");
	//  107  225:aload           4
	//  108  227:ldc2            #279 <String "error : ">
	//  109  230:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  110  233:pop             
				stringbuilder.append(((Object) (intent)));
	//  111  234:aload           4
	//  112  236:aload_1         
	//  113  237:invokevirtual   #141 <Method StringBuilder StringBuilder.append(Object)>
	//  114  240:pop             
				com.baidu.android.pushservice.e.a.e("PushService", stringbuilder.toString());
	//  115  241:ldc1            #80  <String "PushService">
	//  116  243:aload           4
	//  117  245:invokevirtual   #105 <Method String StringBuilder.toString()>
	//  118  248:invokestatic    #281 <Method void a.e(String, String)>
				a(true, true);
	//  119  251:aload_0         
	//  120  252:iconst_1        
	//  121  253:iconst_1        
	//  122  254:invokespecial   #187 <Method void a(boolean, boolean)>
				return 2;
	//  123  257:iconst_2        
	//  124  258:ireturn         
			}
			return 2;
		}
		return 1;
	}

	public boolean onUnbind(Intent intent)
	{
		f = f - 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #41  <Field int f>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:putfield        #41  <Field int f>
		StringBuilder stringbuilder = new StringBuilder();
	//    6   10:new             #92  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #93  <Method void StringBuilder()>
	//    9   17:astore_2        
		stringbuilder.append("onUnbind(");
	//   10   18:aload_2         
	//   11   19:ldc2            #284 <String "onUnbind(">
	//   12   22:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   13   25:pop             
		stringbuilder.append(f);
	//   14   26:aload_2         
	//   15   27:aload_0         
	//   16   28:getfield        #41  <Field int f>
	//   17   31:invokevirtual   #136 <Method StringBuilder StringBuilder.append(int)>
	//   18   34:pop             
		stringbuilder.append("), intent=");
	//   19   35:aload_2         
	//   20   36:ldc1            #138 <String "), intent=">
	//   21   38:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   22   41:pop             
		stringbuilder.append(((Object) (intent)));
	//   23   42:aload_2         
	//   24   43:aload_1         
	//   25   44:invokevirtual   #141 <Method StringBuilder StringBuilder.append(Object)>
	//   26   47:pop             
		com.baidu.android.pushservice.e.a.c("PushService", stringbuilder.toString());
	//   27   48:ldc1            #80  <String "PushService">
	//   28   50:aload_2         
	//   29   51:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   30   54:invokestatic    #153 <Method void a.c(String, String)>
		return super.onUnbind(intent);
	//   31   57:aload_0         
	//   32   58:aload_1         
	//   33   59:invokespecial   #286 <Method boolean Service.onUnbind(Intent)>
	//   34   62:ireturn         
	}

	private boolean a;
	private Handler b;
	private SDcardRemovedReceiver c;
	private boolean d;
	private Runnable e;
	private int f;
	private final com.baidu.android.pushservice.a.a.a g = new com.baidu.android.pushservice.a.a.a() {

		public int a(String s, int i)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public String a()
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public String a(String s)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public String a(String s, int i, boolean flag, int j, int k)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public void a(String s, String s1, com.baidu.android.pushservice.a.b b1)
		{
			b1.b(30602, com.baidu.android.pushservice.PushService.a(a, s, ((String) (null))));
		//    0    0:aload_3         
		//    1    1:sipush          30602
		//    2    4:aload_0         
		//    3    5:getfield        #12  <Field PushService a>
		//    4    8:aload_1         
		//    5    9:aconst_null     
		//    6   10:invokestatic    #24  <Method String com.baidu.android.pushservice.PushService.a(PushService, String, String)>
		//    7   13:invokeinterface #30  <Method void com.baidu.android.pushservice.a.b.b(int, String)>
		//    8   18:return          
		}

		public void a(String s, String s1, boolean flag, com.baidu.android.pushservice.a.b b1)
		{
			b1.a(30602, com.baidu.android.pushservice.PushService.a(a, s, ((String) (null))));
		//    0    0:aload           4
		//    1    2:sipush          30602
		//    2    5:aload_0         
		//    3    6:getfield        #12  <Field PushService a>
		//    4    9:aload_1         
		//    5   10:aconst_null     
		//    6   11:invokestatic    #24  <Method String com.baidu.android.pushservice.PushService.a(PushService, String, String)>
		//    7   14:invokeinterface #33  <Method void com.baidu.android.pushservice.a.b.a(int, String)>
		//    8   19:return          
		}

		public void a(String s, String s1, boolean flag, String s2, com.baidu.android.pushservice.a.b b1)
		{
			b1.a(30602, com.baidu.android.pushservice.PushService.a(a, s, s));
		//    0    0:aload           5
		//    1    2:sipush          30602
		//    2    5:aload_0         
		//    3    6:getfield        #12  <Field PushService a>
		//    4    9:aload_1         
		//    5   10:aload_1         
		//    6   11:invokestatic    #24  <Method String com.baidu.android.pushservice.PushService.a(PushService, String, String)>
		//    7   14:invokeinterface #33  <Method void com.baidu.android.pushservice.a.b.a(int, String)>
		//    8   19:return          
		}

		public boolean a(String s, String s1)
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public boolean a(String s, String s1, int i)
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public boolean a(String s, String s1, String s2, String s3)
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public boolean a(String s, boolean flag)
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public int b(String s)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int b(String s, int i)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public String b()
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public void b(String s, String s1, com.baidu.android.pushservice.a.b b1)
		{
			b1.c(30602, com.baidu.android.pushservice.PushService.a(a, s, ((String) (null))));
		//    0    0:aload_3         
		//    1    1:sipush          30602
		//    2    4:aload_0         
		//    3    5:getfield        #12  <Field PushService a>
		//    4    8:aload_1         
		//    5    9:aconst_null     
		//    6   10:invokestatic    #24  <Method String com.baidu.android.pushservice.PushService.a(PushService, String, String)>
		//    7   13:invokeinterface #42  <Method void com.baidu.android.pushservice.a.b.c(int, String)>
		//    8   18:return          
		}

		public boolean b(String s, String s1)
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public int c()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #45  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #46  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("getPushVersion ");
		//    4    8:aload_1         
		//    5    9:ldc1            #48  <String "getPushVersion ">
		//    6   11:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(((int) (com.baidu.android.pushservice.a.a())));
		//    8   15:aload_1         
		//    9   16:invokestatic    #57  <Method short com.baidu.android.pushservice.a.a()>
		//   10   19:invokevirtual   #60  <Method StringBuilder StringBuilder.append(int)>
		//   11   22:pop             
			com.baidu.android.pushservice.e.a.c("PushService", stringbuilder.toString());
		//   12   23:ldc1            #62  <String "PushService">
		//   13   25:aload_1         
		//   14   26:invokevirtual   #65  <Method String StringBuilder.toString()>
		//   15   29:invokestatic    #70  <Method void a.c(String, String)>
			return ((int) (com.baidu.android.pushservice.a.a()));
		//   16   32:invokestatic    #57  <Method short com.baidu.android.pushservice.a.a()>
		//   17   35:ireturn         
		}

		public int c(String s)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int c(String s, int i)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int d(String s)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean e(String s)
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public String f(String s)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		final PushService a;

			
			{
				a = PushService.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field PushService a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void com.baidu.android.pushservice.a.a$a()>
			//    5    9:return          
			}
	}
;
}
