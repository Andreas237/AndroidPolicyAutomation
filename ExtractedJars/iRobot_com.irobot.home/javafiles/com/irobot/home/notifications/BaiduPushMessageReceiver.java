// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.notifications;

import android.content.Context;
import android.os.AsyncTask;
import com.baidu.android.pushservice.PushMessageReceiver;
import com.irobot.core.PushNotificationType;
import com.irobot.home.IRobotApplication;
import com.irobot.home.util.*;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class BaiduPushMessageReceiver extends PushMessageReceiver
{

	public BaiduPushMessageReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void PushMessageReceiver()>
	//    2    4:return          
	}

	private String a(JSONObject jsonobject, String s)
	{
		try
		{
			jsonobject = ((JSONObject) (jsonobject.getString(s)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #25  <Method String JSONObject.getString(String)>
	//    3    5:astore_1        
		}
	//*   4    6:goto            60
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//*   5    9:astore_1        
		{
			String s1 = a;
	//    6   10:getstatic       #27  <Field String a>
	//    7   13:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//    8   14:new             #29  <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #30  <Method void StringBuilder()>
	//   11   21:astore          4
			stringbuilder.append("Error getting value for field: ");
	//   12   23:aload           4
	//   13   25:ldc1            #32  <String "Error getting value for field: ">
	//   14   27:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
			stringbuilder.append(s);
	//   16   31:aload           4
	//   17   33:aload_2         
	//   18   34:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			o.d(s1, stringbuilder.toString());
	//   20   38:aload_3         
	//   21   39:aload           4
	//   22   41:invokevirtual   #40  <Method String StringBuilder.toString()>
	//   23   44:invokestatic    #46  <Method void o.d(String, String)>
			o.d(a, ((JSONException) (jsonobject)).getMessage());
	//   24   47:getstatic       #27  <Field String a>
	//   25   50:aload_1         
	//   26   51:invokevirtual   #49  <Method String JSONException.getMessage()>
	//   27   54:invokestatic    #46  <Method void o.d(String, String)>
			jsonobject = "";
	//   28   57:ldc1            #51  <String "">
	//   29   59:astore_1        
		}
		if(!j.i(((String) (jsonobject))))
	//*  30   60:aload_1         
	//*  31   61:invokestatic    #57  <Method boolean j.i(String)>
	//*  32   64:ifne            104
		{
			String s2 = a;
	//   33   67:getstatic       #27  <Field String a>
	//   34   70:astore_3        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   35   71:new             #29  <Class StringBuilder>
	//   36   74:dup             
	//   37   75:invokespecial   #30  <Method void StringBuilder()>
	//   38   78:astore          4
			stringbuilder1.append("Invalid value for key: ");
	//   39   80:aload           4
	//   40   82:ldc1            #59  <String "Invalid value for key: ">
	//   41   84:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   42   87:pop             
			stringbuilder1.append(s);
	//   43   88:aload           4
	//   44   90:aload_2         
	//   45   91:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   46   94:pop             
			o.d(s2, stringbuilder1.toString());
	//   47   95:aload_3         
	//   48   96:aload           4
	//   49   98:invokevirtual   #40  <Method String StringBuilder.toString()>
	//   50  101:invokestatic    #46  <Method void o.d(String, String)>
		}
		return ((String) (jsonobject));
	//   51  104:aload_1         
	//   52  105:areturn         
	}

	private JSONObject a(String s)
	{
		try
		{
			s = ((String) (new JSONObject(s)));
	//    0    0:new             #21  <Class JSONObject>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #63  <Method void JSONObject(String)>
	//    4    8:astore_1        
		}
	//*   5    9:aload_1         
	//*   6   10:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   7   11:astore_1        
		{
			String s1 = a;
	//    8   12:getstatic       #27  <Field String a>
	//    9   15:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   10   16:new             #29  <Class StringBuilder>
	//   11   19:dup             
	//   12   20:invokespecial   #30  <Method void StringBuilder()>
	//   13   23:astore_3        
			stringbuilder.append("Failed to convert to json : ");
	//   14   24:aload_3         
	//   15   25:ldc1            #65  <String "Failed to convert to json : ">
	//   16   27:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   17   30:pop             
			stringbuilder.append(((JSONException) (s)).getMessage());
	//   18   31:aload_3         
	//   19   32:aload_1         
	//   20   33:invokevirtual   #49  <Method String JSONException.getMessage()>
	//   21   36:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   22   39:pop             
			o.e(s1, stringbuilder.toString());
	//   23   40:aload_2         
	//   24   41:aload_3         
	//   25   42:invokevirtual   #40  <Method String StringBuilder.toString()>
	//   26   45:invokestatic    #68  <Method void o.e(String, String)>
			return null;
	//   27   48:aconst_null     
	//   28   49:areturn         
		}
		return ((JSONObject) (s));
	}

	private int b(JSONObject jsonobject, String s)
	{
		int i;
		try
		{
			i = jsonobject.getInt(s);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #74  <Method int JSONObject.getInt(String)>
	//    3    5:istore_3        
		}
	//*   4    6:iload_3         
	//*   5    7:ireturn         
	//*   6    8:iconst_m1       
	//*   7    9:ireturn         
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
		{
			return -1;
		}
		return i;
	//*   8   10:astore_1        
	//*   9   11:goto            8
	}

	public void onBind(Context context, int i, String s, String s1, String s2, String s3)
	{
		context = ((Context) (new StringBuilder()));
	//    0    0:new             #29  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (context)).append("onBind errorCode=");
	//    4    8:aload_1         
	//    5    9:ldc1            #78  <String "onBind errorCode=">
	//    6   11:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (context)).append(i);
	//    8   15:aload_1         
	//    9   16:iload_2         
	//   10   17:invokevirtual   #81  <Method StringBuilder StringBuilder.append(int)>
	//   11   20:pop             
		((StringBuilder) (context)).append(" appid=");
	//   12   21:aload_1         
	//   13   22:ldc1            #83  <String " appid=">
	//   14   24:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		((StringBuilder) (context)).append(s);
	//   16   28:aload_1         
	//   17   29:aload_3         
	//   18   30:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   19   33:pop             
		((StringBuilder) (context)).append(" userId=");
	//   20   34:aload_1         
	//   21   35:ldc1            #85  <String " userId=">
	//   22   37:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   23   40:pop             
		((StringBuilder) (context)).append(s1);
	//   24   41:aload_1         
	//   25   42:aload           4
	//   26   44:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   27   47:pop             
		((StringBuilder) (context)).append(" channelId=");
	//   28   48:aload_1         
	//   29   49:ldc1            #87  <String " channelId=">
	//   30   51:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   31   54:pop             
		((StringBuilder) (context)).append(s2);
	//   32   55:aload_1         
	//   33   56:aload           5
	//   34   58:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   35   61:pop             
		((StringBuilder) (context)).append(" requestId=");
	//   36   62:aload_1         
	//   37   63:ldc1            #89  <String " requestId=">
	//   38   65:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   39   68:pop             
		((StringBuilder) (context)).append(s3);
	//   40   69:aload_1         
	//   41   70:aload           6
	//   42   72:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   43   75:pop             
		context = ((Context) (((StringBuilder) (context)).toString()));
	//   44   76:aload_1         
	//   45   77:invokevirtual   #40  <Method String StringBuilder.toString()>
	//   46   80:astore_1        
		j.u(s1);
	//   47   81:aload           4
	//   48   83:invokestatic    #92  <Method void j.u(String)>
		o.b(a, ((String) (context)));
	//   49   86:getstatic       #27  <Field String a>
	//   50   89:aload_1         
	//   51   90:invokestatic    #94  <Method void o.b(String, String)>
	//   52   93:return          
	}

	public void onDelTags(Context context, int i, List list, List list1, String s)
	{
		context = ((Context) (new StringBuilder()));
	//    0    0:new             #29  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (context)).append("onDelTags errorCode=");
	//    4    8:aload_1         
	//    5    9:ldc1            #98  <String "onDelTags errorCode=">
	//    6   11:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (context)).append(i);
	//    8   15:aload_1         
	//    9   16:iload_2         
	//   10   17:invokevirtual   #81  <Method StringBuilder StringBuilder.append(int)>
	//   11   20:pop             
		((StringBuilder) (context)).append(" sucessTags=");
	//   12   21:aload_1         
	//   13   22:ldc1            #100 <String " sucessTags=">
	//   14   24:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		((StringBuilder) (context)).append(((Object) (list)));
	//   16   28:aload_1         
	//   17   29:aload_3         
	//   18   30:invokevirtual   #103 <Method StringBuilder StringBuilder.append(Object)>
	//   19   33:pop             
		((StringBuilder) (context)).append(" failTags=");
	//   20   34:aload_1         
	//   21   35:ldc1            #105 <String " failTags=">
	//   22   37:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   23   40:pop             
		((StringBuilder) (context)).append(((Object) (list1)));
	//   24   41:aload_1         
	//   25   42:aload           4
	//   26   44:invokevirtual   #103 <Method StringBuilder StringBuilder.append(Object)>
	//   27   47:pop             
		((StringBuilder) (context)).append(" requestId=");
	//   28   48:aload_1         
	//   29   49:ldc1            #89  <String " requestId=">
	//   30   51:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   31   54:pop             
		((StringBuilder) (context)).append(s);
	//   32   55:aload_1         
	//   33   56:aload           5
	//   34   58:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   35   61:pop             
		context = ((Context) (((StringBuilder) (context)).toString()));
	//   36   62:aload_1         
	//   37   63:invokevirtual   #40  <Method String StringBuilder.toString()>
	//   38   66:astore_1        
		o.b(a, ((String) (context)));
	//   39   67:getstatic       #27  <Field String a>
	//   40   70:aload_1         
	//   41   71:invokestatic    #94  <Method void o.b(String, String)>
	//   42   74:return          
	}

	public void onListTags(Context context, int i, List list, String s)
	{
		context = ((Context) (new StringBuilder()));
	//    0    0:new             #29  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (context)).append("onListTags errorCode=");
	//    4    8:aload_1         
	//    5    9:ldc1            #111 <String "onListTags errorCode=">
	//    6   11:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (context)).append(i);
	//    8   15:aload_1         
	//    9   16:iload_2         
	//   10   17:invokevirtual   #81  <Method StringBuilder StringBuilder.append(int)>
	//   11   20:pop             
		((StringBuilder) (context)).append(" tags=");
	//   12   21:aload_1         
	//   13   22:ldc1            #113 <String " tags=">
	//   14   24:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		((StringBuilder) (context)).append(((Object) (list)));
	//   16   28:aload_1         
	//   17   29:aload_3         
	//   18   30:invokevirtual   #103 <Method StringBuilder StringBuilder.append(Object)>
	//   19   33:pop             
		context = ((Context) (((StringBuilder) (context)).toString()));
	//   20   34:aload_1         
	//   21   35:invokevirtual   #40  <Method String StringBuilder.toString()>
	//   22   38:astore_1        
		o.b(a, ((String) (context)));
	//   23   39:getstatic       #27  <Field String a>
	//   24   42:aload_1         
	//   25   43:invokestatic    #94  <Method void o.b(String, String)>
	//   26   46:return          
	}

	public void onMessage(Context context, String s, String s1)
	{
		context = ((Context) (new StringBuilder()));
	//    0    0:new             #29  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (context)).append(" message=\"");
	//    4    8:aload_1         
	//    5    9:ldc1            #118 <String " message=\"">
	//    6   11:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (context)).append(s);
	//    8   15:aload_1         
	//    9   16:aload_2         
	//   10   17:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		((StringBuilder) (context)).append("\" customContentString=");
	//   12   21:aload_1         
	//   13   22:ldc1            #120 <String "\" customContentString=">
	//   14   24:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		((StringBuilder) (context)).append(s1);
	//   16   28:aload_1         
	//   17   29:aload_3         
	//   18   30:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   19   33:pop             
		context = ((Context) (((StringBuilder) (context)).toString()));
	//   20   34:aload_1         
	//   21   35:invokevirtual   #40  <Method String StringBuilder.toString()>
	//   22   38:astore_1        
		o.b(a, ((String) (context)));
	//   23   39:getstatic       #27  <Field String a>
	//   24   42:aload_1         
	//   25   43:invokestatic    #94  <Method void o.b(String, String)>
		context = ((Context) ((IRobotApplication)j.g()));
	//   26   46:invokestatic    #124 <Method android.app.Application j.g()>
	//   27   49:checkcast       #126 <Class IRobotApplication>
	//   28   52:astore_1        
		if(((IRobotApplication) (context)).l())
	//*  29   53:aload_1         
	//*  30   54:invokevirtual   #130 <Method boolean IRobotApplication.l()>
	//*  31   57:ifeq            69
		{
			o.b(a, "Ignoring push notification. App is in foreground");
	//   32   60:getstatic       #27  <Field String a>
	//   33   63:ldc1            #132 <String "Ignoring push notification. App is in foreground">
	//   34   65:invokestatic    #94  <Method void o.b(String, String)>
			return;
	//   35   68:return          
		}
		Object obj = ((Object) (a(s)));
	//   36   69:aload_0         
	//   37   70:aload_2         
	//   38   71:invokespecial   #134 <Method JSONObject a(String)>
	//   39   74:astore          7
		if(obj == null)
	//*  40   76:aload           7
	//*  41   78:ifnonnull       90
		{
			o.e(a, "Ignoring push notification. Error converting to json");
	//   42   81:getstatic       #27  <Field String a>
	//   43   84:ldc1            #136 <String "Ignoring push notification. Error converting to json">
	//   44   86:invokestatic    #68  <Method void o.e(String, String)>
			return;
	//   45   89:return          
		}
		int i = b(((JSONObject) (obj)), "cr_nMssn");
	//   46   90:aload_0         
	//   47   91:aload           7
	//   48   93:ldc1            #138 <String "cr_nMssn">
	//   49   95:invokespecial   #140 <Method int b(JSONObject, String)>
	//   50   98:istore          4
		int k = b(((JSONObject) (obj)), "cse_err");
	//   51  100:aload_0         
	//   52  101:aload           7
	//   53  103:ldc1            #142 <String "cse_err">
	//   54  105:invokespecial   #140 <Method int b(JSONObject, String)>
	//   55  108:istore          5
		s = t.a(((JSONObject) (obj)), ((IRobotApplication) (context)).getApplicationContext(), "dt", "tlk", "rn", true);
	//   56  110:aload           7
	//   57  112:aload_1         
	//   58  113:invokevirtual   #146 <Method Context IRobotApplication.getApplicationContext()>
	//   59  116:ldc1            #148 <String "dt">
	//   60  118:ldc1            #150 <String "tlk">
	//   61  120:ldc1            #152 <String "rn">
	//   62  122:iconst_1        
	//   63  123:invokestatic    #157 <Method String t.a(JSONObject, Context, String, String, String, boolean)>
	//   64  126:astore_2        
		s1 = t.a(((JSONObject) (obj)), ((IRobotApplication) (context)).getApplicationContext(), "db", "lk", "rn", true);
	//   65  127:aload           7
	//   66  129:aload_1         
	//   67  130:invokevirtual   #146 <Method Context IRobotApplication.getApplicationContext()>
	//   68  133:ldc1            #159 <String "db">
	//   69  135:ldc1            #161 <String "lk">
	//   70  137:ldc1            #152 <String "rn">
	//   71  139:iconst_1        
	//   72  140:invokestatic    #157 <Method String t.a(JSONObject, Context, String, String, String, boolean)>
	//   73  143:astore_3        
		if(i == -1 && k == -1)
	//*  74  144:iload           4
	//*  75  146:iconst_m1       
	//*  76  147:icmpne          167
	//*  77  150:iload           5
	//*  78  152:iconst_m1       
	//*  79  153:icmpne          167
		{
			t.a(((IRobotApplication) (context)).getApplicationContext(), s, s1, ((String) (null)));
	//   80  156:aload_1         
	//   81  157:invokevirtual   #146 <Method Context IRobotApplication.getApplicationContext()>
	//   82  160:aload_2         
	//   83  161:aload_3         
	//   84  162:aconst_null     
	//   85  163:invokestatic    #164 <Method void t.a(Context, String, String, String)>
			return;
	//   86  166:return          
		}
		String s2 = a(((JSONObject) (obj)), "rid");
	//   87  167:aload_0         
	//   88  168:aload           7
	//   89  170:ldc1            #166 <String "rid">
	//   90  172:invokespecial   #168 <Method String a(JSONObject, String)>
	//   91  175:astore          6
		obj = ((Object) (a(((JSONObject) (obj)), "sku")));
	//   92  177:aload_0         
	//   93  178:aload           7
	//   94  180:ldc1            #170 <String "sku">
	//   95  182:invokespecial   #168 <Method String a(JSONObject, String)>
	//   96  185:astore          7
		if(i != -1)
	//*  97  187:iload           4
	//*  98  189:iconst_m1       
	//*  99  190:icmpeq          211
		{
			t.a(((IRobotApplication) (context)).getApplicationContext(), PushNotificationType.CleaningReport, s, s1, s2, i, 0);
	//  100  193:aload_1         
	//  101  194:invokevirtual   #146 <Method Context IRobotApplication.getApplicationContext()>
	//  102  197:getstatic       #176 <Field PushNotificationType PushNotificationType.CleaningReport>
	//  103  200:aload_2         
	//  104  201:aload_3         
	//  105  202:aload           6
	//  106  204:iload           4
	//  107  206:iconst_0        
	//  108  207:invokestatic    #179 <Method void t.a(Context, PushNotificationType, String, String, String, int, int)>
			return;
	//  109  210:return          
		} else
		{
			((AsyncTask) (new AsyncTask(((IRobotApplication) (context)), s, s1, s2, ((String) (obj)), k) {

				protected Object doInBackground(Object aobj[])
				{
					t.a(a.getApplicationContext(), PushNotificationType.CleaningStopError, b, c, d, e, f);
				//    0    0:aload_0         
				//    1    1:getfield        #26  <Field IRobotApplication a>
				//    2    4:invokevirtual   #48  <Method Context IRobotApplication.getApplicationContext()>
				//    3    7:getstatic       #54  <Field PushNotificationType PushNotificationType.CleaningStopError>
				//    4   10:aload_0         
				//    5   11:getfield        #28  <Field String b>
				//    6   14:aload_0         
				//    7   15:getfield        #30  <Field String c>
				//    8   18:aload_0         
				//    9   19:getfield        #32  <Field String d>
				//   10   22:aload_0         
				//   11   23:getfield        #34  <Field String e>
				//   12   26:aload_0         
				//   13   27:getfield        #36  <Field int f>
				//   14   30:invokestatic    #59  <Method void t.a(Context, PushNotificationType, String, String, String, String, int)>
					return ((Object) (null));
				//   15   33:aconst_null     
				//   16   34:areturn         
				}

				final IRobotApplication a;
				final String b;
				final String c;
				final String d;
				final String e;
				final int f;
				final BaiduPushMessageReceiver g;

			
			{
				g = BaiduPushMessageReceiver.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field BaiduPushMessageReceiver g>
				a = irobotapplication;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field IRobotApplication a>
				b = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field String b>
				c = s1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #30  <Field String c>
				d = s2;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #32  <Field String d>
				e = s3;
			//   15   27:aload_0         
			//   16   28:aload           6
			//   17   30:putfield        #34  <Field String e>
				f = i;
			//   18   33:aload_0         
			//   19   34:iload           7
			//   20   36:putfield        #36  <Field int f>
				super();
			//   21   39:aload_0         
			//   22   40:invokespecial   #39  <Method void AsyncTask()>
			//   23   43:return          
			}
			}
)).execute(new Object[0]);
	//  110  211:new             #6   <Class BaiduPushMessageReceiver$1>
	//  111  214:dup             
	//  112  215:aload_0         
	//  113  216:aload_1         
	//  114  217:aload_2         
	//  115  218:aload_3         
	//  116  219:aload           6
	//  117  221:aload           7
	//  118  223:iload           5
	//  119  225:invokespecial   #182 <Method void BaiduPushMessageReceiver$1(BaiduPushMessageReceiver, IRobotApplication, String, String, String, String, int)>
	//  120  228:iconst_0        
	//  121  229:anewarray       Object[]
	//  122  232:invokevirtual   #190 <Method AsyncTask AsyncTask.execute(Object[])>
	//  123  235:pop             
			return;
	//  124  236:return          
		}
	}

	public void onNotificationArrived(Context context, String s, String s1, String s2)
	{
		context = ((Context) (new StringBuilder()));
	//    0    0:new             #29  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (context)).append("onNotificationArrived  title=\"");
	//    4    8:aload_1         
	//    5    9:ldc1            #193 <String "onNotificationArrived  title=\"">
	//    6   11:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (context)).append(s);
	//    8   15:aload_1         
	//    9   16:aload_2         
	//   10   17:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		((StringBuilder) (context)).append("\" description=\"");
	//   12   21:aload_1         
	//   13   22:ldc1            #195 <String "\" description=\"">
	//   14   24:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		((StringBuilder) (context)).append(s1);
	//   16   28:aload_1         
	//   17   29:aload_3         
	//   18   30:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   19   33:pop             
		((StringBuilder) (context)).append("\" customContent=");
	//   20   34:aload_1         
	//   21   35:ldc1            #197 <String "\" customContent=">
	//   22   37:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   23   40:pop             
		((StringBuilder) (context)).append(s2);
	//   24   41:aload_1         
	//   25   42:aload           4
	//   26   44:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   27   47:pop             
		context = ((Context) (((StringBuilder) (context)).toString()));
	//   28   48:aload_1         
	//   29   49:invokevirtual   #40  <Method String StringBuilder.toString()>
	//   30   52:astore_1        
		o.b(a, ((String) (context)));
	//   31   53:getstatic       #27  <Field String a>
	//   32   56:aload_1         
	//   33   57:invokestatic    #94  <Method void o.b(String, String)>
	//   34   60:return          
	}

	public void onNotificationClicked(Context context, String s, String s1, String s2)
	{
		context = ((Context) (new StringBuilder()));
	//    0    0:new             #29  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (context)).append(" title=\"");
	//    4    8:aload_1         
	//    5    9:ldc1            #200 <String " title=\"">
	//    6   11:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (context)).append(s);
	//    8   15:aload_1         
	//    9   16:aload_2         
	//   10   17:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		((StringBuilder) (context)).append("\" description=\"");
	//   12   21:aload_1         
	//   13   22:ldc1            #195 <String "\" description=\"">
	//   14   24:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		((StringBuilder) (context)).append(s1);
	//   16   28:aload_1         
	//   17   29:aload_3         
	//   18   30:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   19   33:pop             
		((StringBuilder) (context)).append("\" customContent=");
	//   20   34:aload_1         
	//   21   35:ldc1            #197 <String "\" customContent=">
	//   22   37:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   23   40:pop             
		((StringBuilder) (context)).append(s2);
	//   24   41:aload_1         
	//   25   42:aload           4
	//   26   44:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   27   47:pop             
		context = ((Context) (((StringBuilder) (context)).toString()));
	//   28   48:aload_1         
	//   29   49:invokevirtual   #40  <Method String StringBuilder.toString()>
	//   30   52:astore_1        
		o.b(a, ((String) (context)));
	//   31   53:getstatic       #27  <Field String a>
	//   32   56:aload_1         
	//   33   57:invokestatic    #94  <Method void o.b(String, String)>
	//   34   60:return          
	}

	public void onSetTags(Context context, int i, List list, List list1, String s)
	{
		context = ((Context) (new StringBuilder()));
	//    0    0:new             #29  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (context)).append("onSetTags errorCode=");
	//    4    8:aload_1         
	//    5    9:ldc1            #203 <String "onSetTags errorCode=">
	//    6   11:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (context)).append(i);
	//    8   15:aload_1         
	//    9   16:iload_2         
	//   10   17:invokevirtual   #81  <Method StringBuilder StringBuilder.append(int)>
	//   11   20:pop             
		((StringBuilder) (context)).append(" sucessTags=");
	//   12   21:aload_1         
	//   13   22:ldc1            #100 <String " sucessTags=">
	//   14   24:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		((StringBuilder) (context)).append(((Object) (list)));
	//   16   28:aload_1         
	//   17   29:aload_3         
	//   18   30:invokevirtual   #103 <Method StringBuilder StringBuilder.append(Object)>
	//   19   33:pop             
		((StringBuilder) (context)).append(" failTags=");
	//   20   34:aload_1         
	//   21   35:ldc1            #105 <String " failTags=">
	//   22   37:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   23   40:pop             
		((StringBuilder) (context)).append(((Object) (list1)));
	//   24   41:aload_1         
	//   25   42:aload           4
	//   26   44:invokevirtual   #103 <Method StringBuilder StringBuilder.append(Object)>
	//   27   47:pop             
		((StringBuilder) (context)).append(" requestId=");
	//   28   48:aload_1         
	//   29   49:ldc1            #89  <String " requestId=">
	//   30   51:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   31   54:pop             
		((StringBuilder) (context)).append(s);
	//   32   55:aload_1         
	//   33   56:aload           5
	//   34   58:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   35   61:pop             
		context = ((Context) (((StringBuilder) (context)).toString()));
	//   36   62:aload_1         
	//   37   63:invokevirtual   #40  <Method String StringBuilder.toString()>
	//   38   66:astore_1        
		o.b(a, ((String) (context)));
	//   39   67:getstatic       #27  <Field String a>
	//   40   70:aload_1         
	//   41   71:invokestatic    #94  <Method void o.b(String, String)>
	//   42   74:return          
	}

	public void onUnbind(Context context, int i, String s)
	{
		context = ((Context) (new StringBuilder()));
	//    0    0:new             #29  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (context)).append("onUnbind errorCode=");
	//    4    8:aload_1         
	//    5    9:ldc1            #207 <String "onUnbind errorCode=">
	//    6   11:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (context)).append(i);
	//    8   15:aload_1         
	//    9   16:iload_2         
	//   10   17:invokevirtual   #81  <Method StringBuilder StringBuilder.append(int)>
	//   11   20:pop             
		((StringBuilder) (context)).append(" requestId = ");
	//   12   21:aload_1         
	//   13   22:ldc1            #209 <String " requestId = ">
	//   14   24:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		((StringBuilder) (context)).append(s);
	//   16   28:aload_1         
	//   17   29:aload_3         
	//   18   30:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   19   33:pop             
		context = ((Context) (((StringBuilder) (context)).toString()));
	//   20   34:aload_1         
	//   21   35:invokevirtual   #40  <Method String StringBuilder.toString()>
	//   22   38:astore_1        
		o.b(a, ((String) (context)));
	//   23   39:getstatic       #27  <Field String a>
	//   24   42:aload_1         
	//   25   43:invokestatic    #94  <Method void o.b(String, String)>
	//   26   46:return          
	}

	private static final String a = "BaiduPushMessageReceiver";

	static 
	{
	//    0    0:return          
	}
}
