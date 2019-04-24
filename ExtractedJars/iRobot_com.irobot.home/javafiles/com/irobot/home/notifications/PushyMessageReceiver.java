// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.notifications;

import android.content.*;
import com.irobot.core.AccountService;
import com.irobot.core.Assembler;
import com.irobot.home.IRobotApplication;
import com.irobot.home.util.*;
import org.json.JSONException;
import org.json.JSONObject;

public class PushyMessageReceiver extends BroadcastReceiver
{

	public PushyMessageReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	private JSONObject a(String s)
	{
		try
		{
			s = ((String) (new JSONObject(s)));
	//    0    0:new             #31  <Class JSONObject>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #34  <Method void JSONObject(String)>
	//    4    8:astore_1        
		}
	//*   5    9:aload_1         
	//*   6   10:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   7   11:astore_1        
		{
			String s1 = a;
	//    8   12:getstatic       #22  <Field String a>
	//    9   15:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   10   16:new             #36  <Class StringBuilder>
	//   11   19:dup             
	//   12   20:invokespecial   #37  <Method void StringBuilder()>
	//   13   23:astore_3        
			stringbuilder.append("Failed to convert to json : ");
	//   14   24:aload_3         
	//   15   25:ldc1            #39  <String "Failed to convert to json : ">
	//   16   27:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   17   30:pop             
			stringbuilder.append(((JSONException) (s)).getMessage());
	//   18   31:aload_3         
	//   19   32:aload_1         
	//   20   33:invokevirtual   #46  <Method String JSONException.getMessage()>
	//   21   36:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   22   39:pop             
			o.e(s1, stringbuilder.toString());
	//   23   40:aload_2         
	//   24   41:aload_3         
	//   25   42:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   26   45:invokestatic    #55  <Method void o.e(String, String)>
			return null;
	//   27   48:aconst_null     
	//   28   49:areturn         
		}
		return ((JSONObject) (s));
	}

	public void onReceive(Context context, Intent intent)
	{
		if(((IRobotApplication)j.g()).l())
	//*   0    0:invokestatic    #61  <Method android.app.Application j.g()>
	//*   1    3:checkcast       #63  <Class IRobotApplication>
	//*   2    6:invokevirtual   #67  <Method boolean IRobotApplication.l()>
	//*   3    9:ifeq            21
		{
			o.b(a, "Ignoring push notification. App is in foreground");
	//    4   12:getstatic       #22  <Field String a>
	//    5   15:ldc1            #69  <String "Ignoring push notification. App is in foreground">
	//    6   17:invokestatic    #72  <Method void o.b(String, String)>
			return;
	//    7   20:return          
		}
		if(!Assembler.getInstance().getAccountService().isAccountProviderSessionValid())
	//*   8   21:invokestatic    #78  <Method Assembler Assembler.getInstance()>
	//*   9   24:invokevirtual   #82  <Method AccountService Assembler.getAccountService()>
	//*  10   27:invokevirtual   #87  <Method boolean AccountService.isAccountProviderSessionValid()>
	//*  11   30:ifne            42
		{
			o.b(a, "Ignoring push notification. User not logged in");
	//   12   33:getstatic       #22  <Field String a>
	//   13   36:ldc1            #89  <String "Ignoring push notification. User not logged in">
	//   14   38:invokestatic    #72  <Method void o.b(String, String)>
			return;
	//   15   41:return          
		}
		intent = ((Intent) (a(intent.getStringExtra("data"))));
	//   16   42:aload_0         
	//   17   43:aload_2         
	//   18   44:ldc1            #91  <String "data">
	//   19   46:invokevirtual   #96  <Method String Intent.getStringExtra(String)>
	//   20   49:invokespecial   #98  <Method JSONObject a(String)>
	//   21   52:astore_2        
		if(intent == null)
	//*  22   53:aload_2         
	//*  23   54:ifnonnull       66
		{
			o.e(a, "Ignoring push notification. Error converting to json.");
	//   24   57:getstatic       #22  <Field String a>
	//   25   60:ldc1            #100 <String "Ignoring push notification. Error converting to json.">
	//   26   62:invokestatic    #55  <Method void o.e(String, String)>
			return;
	//   27   65:return          
		}
		try
		{
			t.a(((JSONObject) (intent)).getString("irbt"), ((JSONObject) (intent)).getString("alert"), context);
	//   28   66:aload_2         
	//   29   67:ldc1            #102 <String "irbt">
	//   30   69:invokevirtual   #105 <Method String JSONObject.getString(String)>
	//   31   72:aload_2         
	//   32   73:ldc1            #107 <String "alert">
	//   33   75:invokevirtual   #105 <Method String JSONObject.getString(String)>
	//   34   78:aload_1         
	//   35   79:invokestatic    #112 <Method void t.a(String, String, Context)>
			return;
	//   36   82:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  37   83:astore_1        
		{
			intent = ((Intent) (a));
	//   38   84:getstatic       #22  <Field String a>
	//   39   87:astore_2        
		}
		StringBuilder stringbuilder = new StringBuilder();
	//   40   88:new             #36  <Class StringBuilder>
	//   41   91:dup             
	//   42   92:invokespecial   #37  <Method void StringBuilder()>
	//   43   95:astore_3        
		stringbuilder.append("Send notification util method failed: ");
	//   44   96:aload_3         
	//   45   97:ldc1            #114 <String "Send notification util method failed: ">
	//   46   99:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   47  102:pop             
		stringbuilder.append(((JSONException) (context)).getMessage());
	//   48  103:aload_3         
	//   49  104:aload_1         
	//   50  105:invokevirtual   #46  <Method String JSONException.getMessage()>
	//   51  108:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   52  111:pop             
		o.d(((String) (intent)), stringbuilder.toString());
	//   53  112:aload_2         
	//   54  113:aload_3         
	//   55  114:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   56  117:invokestatic    #117 <Method void o.d(String, String)>
	//   57  120:return          
	}

	private static final String a = j.r(((Class) (com/irobot/home/notifications/PushyMessageReceiver)).getSimpleName());

	static 
	{
	//    0    0:ldc1            #2   <Class PushyMessageReceiver>
	//    1    2:invokevirtual   #14  <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #20  <Method String j.r(String)>
	//    3    8:putstatic       #22  <Field String a>
	//*   4   11:return          
	}
}
