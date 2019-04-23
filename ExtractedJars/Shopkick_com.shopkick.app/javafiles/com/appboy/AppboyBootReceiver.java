// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import android.content.*;
import bo.app.do;
import com.appboy.support.AppboyLogger;

// Referenced classes of package com.appboy:
//			Appboy

public class AppboyBootReceiver extends BroadcastReceiver
{

	public AppboyBootReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	boolean a(Context context, Intent intent)
	{
		if(intent == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
		{
			AppboyLogger.w(a, "Null intent received. Doing nothing.");
	//    2    4:getstatic       #16  <Field String a>
	//    3    7:ldc1            #24  <String "Null intent received. Doing nothing.">
	//    4    9:invokestatic    #28  <Method int AppboyLogger.w(String, String)>
	//    5   12:pop             
			return false;
	//    6   13:iconst_0        
	//    7   14:ireturn         
		}
		if(context == null)
	//*   8   15:aload_1         
	//*   9   16:ifnonnull       65
		{
			context = ((Context) (a));
	//   10   19:getstatic       #16  <Field String a>
	//   11   22:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   12   23:new             #30  <Class StringBuilder>
	//   13   26:dup             
	//   14   27:invokespecial   #31  <Method void StringBuilder()>
	//   15   30:astore_3        
			stringbuilder.append("Null context received for intent ");
	//   16   31:aload_3         
	//   17   32:ldc1            #33  <String "Null context received for intent ">
	//   18   34:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			stringbuilder.append(intent.toString());
	//   20   38:aload_3         
	//   21   39:aload_2         
	//   22   40:invokevirtual   #43  <Method String Intent.toString()>
	//   23   43:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   24   46:pop             
			stringbuilder.append(". Doing nothing.");
	//   25   47:aload_3         
	//   26   48:ldc1            #45  <String ". Doing nothing.">
	//   27   50:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   28   53:pop             
			AppboyLogger.w(((String) (context)), stringbuilder.toString());
	//   29   54:aload_1         
	//   30   55:aload_3         
	//   31   56:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   32   59:invokestatic    #28  <Method int AppboyLogger.w(String, String)>
	//   33   62:pop             
			return false;
	//   34   63:iconst_0        
	//   35   64:ireturn         
		}
		String s = a;
	//   36   65:getstatic       #16  <Field String a>
	//   37   68:astore_3        
		StringBuilder stringbuilder2 = new StringBuilder();
	//   38   69:new             #30  <Class StringBuilder>
	//   39   72:dup             
	//   40   73:invokespecial   #31  <Method void StringBuilder()>
	//   41   76:astore          4
		stringbuilder2.append("Received broadcast message. Message: ");
	//   42   78:aload           4
	//   43   80:ldc1            #48  <String "Received broadcast message. Message: ">
	//   44   82:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   45   85:pop             
		stringbuilder2.append(intent.toString());
	//   46   86:aload           4
	//   47   88:aload_2         
	//   48   89:invokevirtual   #43  <Method String Intent.toString()>
	//   49   92:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   50   95:pop             
		AppboyLogger.i(s, stringbuilder2.toString());
	//   51   96:aload_3         
	//   52   97:aload           4
	//   53   99:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   54  102:invokestatic    #51  <Method int AppboyLogger.i(String, String)>
	//   55  105:pop             
		if("android.intent.action.BOOT_COMPLETED".equals(((Object) (intent.getAction()))))
	//*  56  106:ldc1            #53  <String "android.intent.action.BOOT_COMPLETED">
	//*  57  108:aload_2         
	//*  58  109:invokevirtual   #56  <Method String Intent.getAction()>
	//*  59  112:invokevirtual   #62  <Method boolean String.equals(Object)>
	//*  60  115:ifeq            138
		{
			AppboyLogger.i(a, "Boot complete intent received. Initializing.");
	//   61  118:getstatic       #16  <Field String a>
	//   62  121:ldc1            #64  <String "Boot complete intent received. Initializing.">
	//   63  123:invokestatic    #51  <Method int AppboyLogger.i(String, String)>
	//   64  126:pop             
			bo.app.do.a(context);
	//   65  127:aload_1         
	//   66  128:invokestatic    #69  <Method void do.a(Context)>
			Appboy.getInstance(context);
	//   67  131:aload_1         
	//   68  132:invokestatic    #75  <Method Appboy Appboy.getInstance(Context)>
	//   69  135:pop             
			return true;
	//   70  136:iconst_1        
	//   71  137:ireturn         
		} else
		{
			context = ((Context) (a));
	//   72  138:getstatic       #16  <Field String a>
	//   73  141:astore_1        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   74  142:new             #30  <Class StringBuilder>
	//   75  145:dup             
	//   76  146:invokespecial   #31  <Method void StringBuilder()>
	//   77  149:astore_3        
			stringbuilder1.append("Unknown intent ");
	//   78  150:aload_3         
	//   79  151:ldc1            #77  <String "Unknown intent ">
	//   80  153:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   81  156:pop             
			stringbuilder1.append(intent.toString());
	//   82  157:aload_3         
	//   83  158:aload_2         
	//   84  159:invokevirtual   #43  <Method String Intent.toString()>
	//   85  162:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   86  165:pop             
			stringbuilder1.append(" received. Doing nothing.");
	//   87  166:aload_3         
	//   88  167:ldc1            #79  <String " received. Doing nothing.">
	//   89  169:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   90  172:pop             
			AppboyLogger.w(((String) (context)), stringbuilder1.toString());
	//   91  173:aload_1         
	//   92  174:aload_3         
	//   93  175:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   94  178:invokestatic    #28  <Method int AppboyLogger.w(String, String)>
	//   95  181:pop             
			return false;
	//   96  182:iconst_0        
	//   97  183:ireturn         
		}
	}

	public void onReceive(Context context, Intent intent)
	{
		a(context, intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #84  <Method boolean a(Context, Intent)>
	//    4    6:pop             
	//    5    7:return          
	}

	private static final String a = AppboyLogger.getAppboyLogTag(com/appboy/AppboyBootReceiver);

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyBootReceiver>
	//    1    2:invokestatic    #14  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #16  <Field String a>
	//*   3    8:return          
	}
}
