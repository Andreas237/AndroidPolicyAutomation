// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice;

import android.content.*;
import android.net.Uri;
import android.text.TextUtils;
import com.baidu.android.pushservice.b.b;
import com.baidu.android.pushservice.b.f;
import com.baidu.android.pushservice.b.h;
import com.baidu.android.pushservice.b.j;
import com.baidu.android.pushservice.e.a;
import com.baidu.android.pushservice.g.c;
import com.baidu.android.pushservice.g.d;
import com.baidu.android.pushservice.h.t;
import com.baidu.android.pushservice.h.u;

// Referenced classes of package com.baidu.android.pushservice:
//			PushSettings

public class RegistrationReceiver extends BroadcastReceiver
{

	public RegistrationReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	static void a(Context context, Intent intent)
	{
		d(context, intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #16  <Method void d(Context, Intent)>
	//    3    5:return          
	}

	static void a(Context context, f f1)
	{
		Intent intent = new Intent();
	//    0    0:new             #19  <Class Intent>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void Intent()>
	//    3    7:astore_2        
		intent.setAction("com.baidu.android.pushservice.action.METHOD");
	//    4    8:aload_2         
	//    5    9:ldc1            #22  <String "com.baidu.android.pushservice.action.METHOD">
	//    6   11:invokevirtual   #26  <Method Intent Intent.setAction(String)>
	//    7   14:pop             
		intent.putExtra("method", "com.baidu.android.pushservice.action.UNBINDAPP");
	//    8   15:aload_2         
	//    9   16:ldc1            #28  <String "method">
	//   10   18:ldc1            #30  <String "com.baidu.android.pushservice.action.UNBINDAPP">
	//   11   20:invokevirtual   #34  <Method Intent Intent.putExtra(String, String)>
	//   12   23:pop             
		intent.putExtra("package_name", f1.c());
	//   13   24:aload_2         
	//   14   25:ldc1            #36  <String "package_name">
	//   15   27:aload_1         
	//   16   28:invokevirtual   #42  <Method String f.c()>
	//   17   31:invokevirtual   #34  <Method Intent Intent.putExtra(String, String)>
	//   18   34:pop             
		intent.putExtra("app_id", f1.a());
	//   19   35:aload_2         
	//   20   36:ldc1            #44  <String "app_id">
	//   21   38:aload_1         
	//   22   39:invokevirtual   #46  <Method String f.a()>
	//   23   42:invokevirtual   #34  <Method Intent Intent.putExtra(String, String)>
	//   24   45:pop             
		intent.putExtra("user_id", f1.f);
	//   25   46:aload_2         
	//   26   47:ldc1            #48  <String "user_id">
	//   27   49:aload_1         
	//   28   50:getfield        #52  <Field String f.f>
	//   29   53:invokevirtual   #34  <Method Intent Intent.putExtra(String, String)>
	//   30   56:pop             
		t.a(context, intent);
	//   31   57:aload_0         
	//   32   58:aload_2         
	//   33   59:invokestatic    #56  <Method void t.a(Context, Intent)>
	//   34   62:return          
	}

	static void b(Context context, Intent intent)
	{
		e(context, intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #60  <Method void e(Context, Intent)>
	//    3    5:return          
	}

	static void c(Context context, Intent intent)
	{
		f(context, intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #62  <Method void f(Context, Intent)>
	//    3    5:return          
	}

	private static void d(Context context, Intent intent)
	{
		String s = intent.getStringExtra("r_sync_from");
	//    0    0:aload_1         
	//    1    1:ldc1            #64  <String "r_sync_from">
	//    2    3:invokevirtual   #68  <Method String Intent.getStringExtra(String)>
	//    3    6:astore_2        
		if(context.getPackageName().equals(((Object) (s))))
	//*   4    7:aload_0         
	//*   5    8:invokevirtual   #73  <Method String Context.getPackageName()>
	//*   6   11:aload_2         
	//*   7   12:invokevirtual   #79  <Method boolean String.equals(Object)>
	//*   8   15:ifeq            19
			return;
	//    9   18:return          
		intent = ((Intent) (intent.getStringExtra("r_sync_rdata_v2")));
	//   10   19:aload_1         
	//   11   20:ldc1            #81  <String "r_sync_rdata_v2">
	//   12   22:invokevirtual   #68  <Method String Intent.getStringExtra(String)>
	//   13   25:astore_1        
		if(!TextUtils.isEmpty(((CharSequence) (intent))))
	//*  14   26:aload_1         
	//*  15   27:invokestatic    #87  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  16   30:ifne            86
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   17   33:new             #89  <Class StringBuilder>
	//   18   36:dup             
	//   19   37:invokespecial   #90  <Method void StringBuilder()>
	//   20   40:astore_3        
			stringbuilder.append("handleRegisterSync rdataV2: ");
	//   21   41:aload_3         
	//   22   42:ldc1            #92  <String "handleRegisterSync rdataV2: ">
	//   23   44:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   24   47:pop             
			stringbuilder.append(((String) (intent)));
	//   25   48:aload_3         
	//   26   49:aload_1         
	//   27   50:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   28   53:pop             
			stringbuilder.append(" from: ");
	//   29   54:aload_3         
	//   30   55:ldc1            #98  <String " from: ">
	//   31   57:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   32   60:pop             
			stringbuilder.append(s);
	//   33   61:aload_3         
	//   34   62:aload_2         
	//   35   63:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   36   66:pop             
			com.baidu.android.pushservice.e.a.b("RegistrationReceiver", stringbuilder.toString());
	//   37   67:ldc1            #100 <String "RegistrationReceiver">
	//   38   69:aload_3         
	//   39   70:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   40   73:invokestatic    #108 <Method void a.b(String, String)>
			com.baidu.android.pushservice.b.b.a(context).a("r_v2", ((String) (intent)));
	//   41   76:aload_0         
	//   42   77:invokestatic    #113 <Method b b.a(Context)>
	//   43   80:ldc1            #115 <String "r_v2">
	//   44   82:aload_1         
	//   45   83:invokevirtual   #117 <Method void b.a(String, String)>
		}
	//   46   86:return          
	}

	private static void e(Context context, Intent intent)
	{
		String s = intent.getStringExtra("r_sync_from");
	//    0    0:aload_1         
	//    1    1:ldc1            #64  <String "r_sync_from">
	//    2    3:invokevirtual   #68  <Method String Intent.getStringExtra(String)>
	//    3    6:astore_2        
		if(context.getPackageName().equals(((Object) (s))))
	//*   4    7:aload_0         
	//*   5    8:invokevirtual   #73  <Method String Context.getPackageName()>
	//*   6   11:aload_2         
	//*   7   12:invokevirtual   #79  <Method boolean String.equals(Object)>
	//*   8   15:ifeq            19
			return;
	//    9   18:return          
		intent = ((Intent) (intent.getStringExtra("r_sync_rdata_v2")));
	//   10   19:aload_1         
	//   11   20:ldc1            #81  <String "r_sync_rdata_v2">
	//   12   22:invokevirtual   #68  <Method String Intent.getStringExtra(String)>
	//   13   25:astore_1        
		if(!TextUtils.isEmpty(((CharSequence) (intent))))
	//*  14   26:aload_1         
	//*  15   27:invokestatic    #87  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  16   30:ifne            43
			j.a(context).a("com.baidu.push.webr", ((String) (intent)));
	//   17   33:aload_0         
	//   18   34:invokestatic    #122 <Method j j.a(Context)>
	//   19   37:ldc1            #124 <String "com.baidu.push.webr">
	//   20   39:aload_1         
	//   21   40:invokevirtual   #125 <Method void j.a(String, String)>
	//   22   43:return          
	}

	private static void f(Context context, Intent intent)
	{
		String s = intent.getStringExtra("r_sync_sdk_from");
	//    0    0:aload_1         
	//    1    1:ldc1            #127 <String "r_sync_sdk_from">
	//    2    3:invokevirtual   #68  <Method String Intent.getStringExtra(String)>
	//    3    6:astore_2        
		if(context.getPackageName().equals(((Object) (s))))
	//*   4    7:aload_0         
	//*   5    8:invokevirtual   #73  <Method String Context.getPackageName()>
	//*   6   11:aload_2         
	//*   7   12:invokevirtual   #79  <Method boolean String.equals(Object)>
	//*   8   15:ifeq            19
			return;
	//    9   18:return          
		intent = ((Intent) (intent.getStringExtra("r_sync_rdata_v2")));
	//   10   19:aload_1         
	//   11   20:ldc1            #81  <String "r_sync_rdata_v2">
	//   12   22:invokevirtual   #68  <Method String Intent.getStringExtra(String)>
	//   13   25:astore_1        
		if(!TextUtils.isEmpty(((CharSequence) (intent))))
	//*  14   26:aload_1         
	//*  15   27:invokestatic    #87  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  16   30:ifne            43
			h.a(context).a("com.baidu.push.sdkr", ((String) (intent)));
	//   17   33:aload_0         
	//   18   34:invokestatic    #132 <Method h h.a(Context)>
	//   19   37:ldc1            #134 <String "com.baidu.push.sdkr">
	//   20   39:aload_1         
	//   21   40:invokevirtual   #135 <Method void h.a(String, String)>
	//   22   43:return          
	}

	public void onReceive(Context context, Intent intent)
	{
		String s = intent.getAction();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #141 <Method String Intent.getAction()>
	//    2    4:astore          4
		boolean flag;
		StringBuilder stringbuilder;
		try
		{
			intent.getByteArrayExtra("baidu_message_secur_info");
	//    3    6:aload_2         
	//    4    7:ldc1            #143 <String "baidu_message_secur_info">
	//    5    9:invokevirtual   #147 <Method byte[] Intent.getByteArrayExtra(String)>
	//    6   12:pop             
		}
	//*   7   13:ldc1            #149 <String "android.intent.action.PACKAGE_REMOVED">
	//*   8   15:aload           4
	//*   9   17:invokevirtual   #79  <Method boolean String.equals(Object)>
	//*  10   20:ifeq            209
	//*  11   23:aload_1         
	//*  12   24:invokestatic    #155 <Method String u.x(Context)>
	//*  13   27:astore          4
	//*  14   29:aload           4
	//*  15   31:invokestatic    #87  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  16   34:ifne            57
	//*  17   37:aload_1         
	//*  18   38:invokevirtual   #73  <Method String Context.getPackageName()>
	//*  19   41:aload           4
	//*  20   43:invokevirtual   #79  <Method boolean String.equals(Object)>
	//*  21   46:ifne            57
	//*  22   49:ldc1            #100 <String "RegistrationReceiver">
	//*  23   51:ldc1            #157 <String "not hightest package return">
	//*  24   53:invokestatic    #108 <Method void a.b(String, String)>
	//*  25   56:return          
	//*  26   57:aload_2         
	//*  27   58:invokevirtual   #161 <Method Uri Intent.getData()>
	//*  28   61:invokevirtual   #166 <Method String Uri.getSchemeSpecificPart()>
	//*  29   64:astore          4
	//*  30   66:aload_2         
	//*  31   67:ldc1            #168 <String "android.intent.extra.REPLACING">
	//*  32   69:iconst_0        
	//*  33   70:invokevirtual   #172 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//*  34   73:istore_3        
	//*  35   74:new             #89  <Class StringBuilder>
	//*  36   77:dup             
	//*  37   78:invokespecial   #90  <Method void StringBuilder()>
	//*  38   81:astore_2        
	//*  39   82:aload_2         
	//*  40   83:ldc1            #174 <String "start for ACTION_PACKAGE_REMOVED\uFF0Creplacing\uFF1A">
	//*  41   85:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//*  42   88:pop             
	//*  43   89:aload_2         
	//*  44   90:iload_3         
	//*  45   91:invokevirtual   #177 <Method StringBuilder StringBuilder.append(boolean)>
	//*  46   94:pop             
	//*  47   95:aload_2         
	//*  48   96:ldc1            #179 <String " ,packageName: ">
	//*  49   98:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//*  50  101:pop             
	//*  51  102:aload_2         
	//*  52  103:aload           4
	//*  53  105:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//*  54  108:pop             
	//*  55  109:ldc1            #100 <String "RegistrationReceiver">
	//*  56  111:aload_2         
	//*  57  112:invokevirtual   #103 <Method String StringBuilder.toString()>
	//*  58  115:invokestatic    #108 <Method void a.b(String, String)>
	//*  59  118:iload_3         
	//*  60  119:ifne            128
	//*  61  122:aload_1         
	//*  62  123:aload           4
	//*  63  125:invokestatic    #184 <Method void com.baidu.android.pushservice.PushSettings.c(Context, String)>
	//*  64  128:aload_1         
	//*  65  129:invokestatic    #113 <Method b b.a(Context)>
	//*  66  132:aload           4
	//*  67  134:invokevirtual   #187 <Method f b.c(String)>
	//*  68  137:astore_2        
	//*  69  138:iload_3         
	//*  70  139:ifne            246
	//*  71  142:aload_2         
	//*  72  143:ifnull          246
	//*  73  146:aload_1         
	//*  74  147:invokevirtual   #73  <Method String Context.getPackageName()>
	//*  75  150:aload_2         
	//*  76  151:invokevirtual   #42  <Method String f.c()>
	//*  77  154:invokevirtual   #79  <Method boolean String.equals(Object)>
	//*  78  157:ifne            246
	//*  79  160:new             #89  <Class StringBuilder>
	//*  80  163:dup             
	//*  81  164:invokespecial   #90  <Method void StringBuilder()>
	//*  82  167:astore          5
	//*  83  169:aload           5
	//*  84  171:ldc1            #189 <String "unregister registered push client : ">
	//*  85  173:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//*  86  176:pop             
	//*  87  177:aload           5
	//*  88  179:aload           4
	//*  89  181:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//*  90  184:pop             
	//*  91  185:ldc1            #100 <String "RegistrationReceiver">
	//*  92  187:aload           5
	//*  93  189:invokevirtual   #103 <Method String StringBuilder.toString()>
	//*  94  192:invokestatic    #108 <Method void a.b(String, String)>
	//*  95  195:aload_1         
	//*  96  196:aload_2         
	//*  97  197:invokestatic    #191 <Method void a(Context, f)>
	//*  98  200:return          
	//*  99  201:astore_1        
	//* 100  202:ldc1            #100 <String "RegistrationReceiver">
	//* 101  204:aload_1         
	//* 102  205:invokestatic    #194 <Method void a.a(String, Throwable)>
	//* 103  208:return          
	//* 104  209:ldc1            #196 <String "com.baidu.android.pushservice.action.BIND_SYNC">
	//* 105  211:aload           4
	//* 106  213:invokevirtual   #79  <Method boolean String.equals(Object)>
	//* 107  216:ifeq            241
	//* 108  219:invokestatic    #201 <Method d d.a()>
	//* 109  222:new             #6   <Class RegistrationReceiver$1>
	//* 110  225:dup             
	//* 111  226:aload_0         
	//* 112  227:ldc1            #203 <String "register_sync">
	//* 113  229:bipush          99
	//* 114  231:aload_2         
	//* 115  232:aload_1         
	//* 116  233:invokespecial   #206 <Method void RegistrationReceiver$1(RegistrationReceiver, String, short, Intent, Context)>
	//* 117  236:invokevirtual   #209 <Method boolean d.a(c)>
	//* 118  239:pop             
	//* 119  240:return          
	//* 120  241:aload_1         
	//* 121  242:aload_2         
	//* 122  243:invokestatic    #211 <Method void t.b(Context, Intent)>
	//* 123  246:return          
	//* 124  247:ldc1            #100 <String "RegistrationReceiver">
	//* 125  249:ldc1            #213 <String "attack by null Serializable data and return">
	//* 126  251:invokestatic    #215 <Method void a.c(String, String)>
	//* 127  254:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			com.baidu.android.pushservice.e.a.c("RegistrationReceiver", "attack by null Serializable data and return");
			return;
		}
		if(!"android.intent.action.PACKAGE_REMOVED".equals(((Object) (s))))
			break MISSING_BLOCK_LABEL_209;
		try
		{
			s = u.x(context);
			if(!TextUtils.isEmpty(((CharSequence) (s))) && !context.getPackageName().equals(((Object) (s))))
			{
				com.baidu.android.pushservice.e.a.b("RegistrationReceiver", "not hightest package return");
				return;
			}
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			com.baidu.android.pushservice.e.a.a("RegistrationReceiver", ((Throwable) (context)));
			return;
		}
		s = intent.getData().getSchemeSpecificPart();
		flag = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
		intent = ((Intent) (new StringBuilder()));
		((StringBuilder) (intent)).append("start for ACTION_PACKAGE_REMOVED\uFF0Creplacing\uFF1A");
		((StringBuilder) (intent)).append(flag);
		((StringBuilder) (intent)).append(" ,packageName: ");
		((StringBuilder) (intent)).append(s);
		com.baidu.android.pushservice.e.a.b("RegistrationReceiver", ((StringBuilder) (intent)).toString());
		if(flag)
			break MISSING_BLOCK_LABEL_128;
		com.baidu.android.pushservice.PushSettings.c(context, s);
		intent = ((Intent) (com.baidu.android.pushservice.b.b.a(context).c(s)));
		if(flag || intent == null)
			break MISSING_BLOCK_LABEL_246;
		if(!context.getPackageName().equals(((Object) (((f) (intent)).c()))))
		{
			stringbuilder = new StringBuilder();
			stringbuilder.append("unregister registered push client : ");
			stringbuilder.append(s);
			com.baidu.android.pushservice.e.a.b("RegistrationReceiver", stringbuilder.toString());
			a(context, ((f) (intent)));
			return;
		}
		break MISSING_BLOCK_LABEL_246;
		if("com.baidu.android.pushservice.action.BIND_SYNC".equals(((Object) (s))))
		{
			com.baidu.android.pushservice.g.d.a().a(((c) (new c("register_sync", (short)99, intent, context) {

				public void a()
				{
					if(!a.hasExtra("r_sync_type")) goto _L2; else goto _L1
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field Intent a>
				//    2    4:ldc1            #30  <String "r_sync_type">
				//    3    6:invokevirtual   #36  <Method boolean Intent.hasExtra(String)>
				//    4    9:ifeq            77
_L1:
					a.getIntExtra("r_sync_type", 0);
				//    5   12:aload_0         
				//    6   13:getfield        #21  <Field Intent a>
				//    7   16:ldc1            #30  <String "r_sync_type">
				//    8   18:iconst_0        
				//    9   19:invokevirtual   #40  <Method int Intent.getIntExtra(String, int)>
					JVM INSTR tableswitch 0 3: default 52
				//				               0 77
				//				               1 65
				//				               2 88
				//				               3 53;
				//   10   22:tableswitch     0 3: default 52
				//				               0 77
				//				               1 65
				//				               2 88
				//				               3 53
					   goto _L3 _L2 _L4 _L5 _L6
_L3:
					return;
				//   11   52:return          
_L6:
					com.baidu.android.pushservice.RegistrationReceiver.c(b, a);
				//   12   53:aload_0         
				//   13   54:getfield        #23  <Field Context b>
				//   14   57:aload_0         
				//   15   58:getfield        #21  <Field Intent a>
				//   16   61:invokestatic    #42  <Method void com.baidu.android.pushservice.RegistrationReceiver.c(Context, Intent)>
					return;
				//   17   64:return          
_L4:
					com.baidu.android.pushservice.RegistrationReceiver.b(b, a);
				//   18   65:aload_0         
				//   19   66:getfield        #23  <Field Context b>
				//   20   69:aload_0         
				//   21   70:getfield        #21  <Field Intent a>
				//   22   73:invokestatic    #44  <Method void com.baidu.android.pushservice.RegistrationReceiver.b(Context, Intent)>
					return;
				//   23   76:return          
_L2:
					com.baidu.android.pushservice.RegistrationReceiver.a(b, a);
				//   24   77:aload_0         
				//   25   78:getfield        #23  <Field Context b>
				//   26   81:aload_0         
				//   27   82:getfield        #21  <Field Intent a>
				//   28   85:invokestatic    #46  <Method void com.baidu.android.pushservice.RegistrationReceiver.a(Context, Intent)>
_L5:
				//   29   88:return          
				}

				final Intent a;
				final Context b;
				final RegistrationReceiver c;

			
			{
				c = RegistrationReceiver.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field RegistrationReceiver c>
				a = intent;
			//    3    5:aload_0         
			//    4    6:aload           4
			//    5    8:putfield        #21  <Field Intent a>
				b = context;
			//    6   11:aload_0         
			//    7   12:aload           5
			//    8   14:putfield        #23  <Field Context b>
				super(s, word0);
			//    9   17:aload_0         
			//   10   18:aload_2         
			//   11   19:iload_3         
			//   12   20:invokespecial   #26  <Method void c(String, short)>
			//   13   23:return          
			}
			}
)));
			return;
		}
		t.b(context, intent);
	//* 128  255:astore_1        
	//* 129  256:goto            247
	}
}
