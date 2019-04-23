// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import android.content.Intent;
import bo.app.bf;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;

// Referenced classes of package com.appboy:
//			Appboy

class Appboy$3
	implements Runnable
{

	public void run()
	{
		String s = a.getStringExtra("cid");
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Intent a>
	//    2    4:ldc1            #30  <String "cid">
	//    3    6:invokevirtual   #36  <Method String Intent.getStringExtra(String)>
	//    4    9:astore_1        
		if(!StringUtils.isNullOrBlank(s))
	//*   5   10:aload_1         
	//*   6   11:invokestatic    #42  <Method boolean StringUtils.isNullOrBlank(String)>
	//*   7   14:ifne            62
		{
			String s1 = Appboy.b();
	//    8   17:invokestatic    #45  <Method String Appboy.b()>
	//    9   20:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   10   21:new             #47  <Class StringBuilder>
	//   11   24:dup             
	//   12   25:invokespecial   #48  <Method void StringBuilder()>
	//   13   28:astore_3        
			stringbuilder.append("Logging push click to Appboy. Campaign Id: ");
	//   14   29:aload_3         
	//   15   30:ldc1            #50  <String "Logging push click to Appboy. Campaign Id: ">
	//   16   32:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
			stringbuilder.append(s);
	//   18   36:aload_3         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
			AppboyLogger.i(s1, stringbuilder.toString());
	//   22   42:aload_2         
	//   23   43:aload_3         
	//   24   44:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   25   47:invokestatic    #63  <Method int AppboyLogger.i(String, String)>
	//   26   50:pop             
			b.logPushNotificationOpened(s);
	//   27   51:aload_0         
	//   28   52:getfield        #19  <Field Appboy b>
	//   29   55:aload_1         
	//   30   56:invokevirtual   #66  <Method void Appboy.logPushNotificationOpened(String)>
			break MISSING_BLOCK_LABEL_71;
	//   31   59:goto            71
		}
		AppboyLogger.i(Appboy.b(), "No campaign Id associated with this notification. Not logging push click to Appboy.");
	//   32   62:invokestatic    #45  <Method String Appboy.b()>
	//   33   65:ldc1            #68  <String "No campaign Id associated with this notification. Not logging push click to Appboy.">
	//   34   67:invokestatic    #63  <Method int AppboyLogger.i(String, String)>
	//   35   70:pop             
		if(a.hasExtra("ab_push_fetch_test_triggers_key") && a.getStringExtra("ab_push_fetch_test_triggers_key").equals("true"))
	//*  36   71:aload_0         
	//*  37   72:getfield        #21  <Field Intent a>
	//*  38   75:ldc1            #70  <String "ab_push_fetch_test_triggers_key">
	//*  39   77:invokevirtual   #73  <Method boolean Intent.hasExtra(String)>
	//*  40   80:ifeq            141
	//*  41   83:aload_0         
	//*  42   84:getfield        #21  <Field Intent a>
	//*  43   87:ldc1            #70  <String "ab_push_fetch_test_triggers_key">
	//*  44   89:invokevirtual   #36  <Method String Intent.getStringExtra(String)>
	//*  45   92:ldc1            #75  <String "true">
	//*  46   94:invokevirtual   #81  <Method boolean String.equals(Object)>
	//*  47   97:ifeq            141
		{
			AppboyLogger.i(Appboy.b(), "Push contained key for fetching test triggers, fetching triggers.");
	//   48  100:invokestatic    #45  <Method String Appboy.b()>
	//   49  103:ldc1            #83  <String "Push contained key for fetching test triggers, fetching triggers.">
	//   50  105:invokestatic    #63  <Method int AppboyLogger.i(String, String)>
	//   51  108:pop             
			b.g.a((new bo.app.cg.a()).b());
	//   52  109:aload_0         
	//   53  110:getfield        #19  <Field Appboy b>
	//   54  113:getfield        #87  <Field bf Appboy.g>
	//   55  116:new             #89  <Class bo.app.cg$a>
	//   56  119:dup             
	//   57  120:invokespecial   #90  <Method void bo.app.cg$a()>
	//   58  123:invokevirtual   #93  <Method bo.app.cg$a bo.app.cg$a.b()>
	//   59  126:invokevirtual   #98  <Method void bf.a(bo.app.cg$a)>
			return;
	//   60  129:return          
		}
		break MISSING_BLOCK_LABEL_141;
		Exception exception;
		exception;
	//   61  130:astore_1        
		AppboyLogger.w(Appboy.b(), "Error logging push notification", ((Throwable) (exception)));
	//   62  131:invokestatic    #45  <Method String Appboy.b()>
	//   63  134:ldc1            #100 <String "Error logging push notification">
	//   64  136:aload_1         
	//   65  137:invokestatic    #104 <Method int AppboyLogger.w(String, String, Throwable)>
	//   66  140:pop             
	//   67  141:return          
	}

	final Intent a;
	final Appboy b;

	Appboy$3(Appboy appboy, Intent intent)
	{
		b = appboy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field Appboy b>
		a = intent;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Intent a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
