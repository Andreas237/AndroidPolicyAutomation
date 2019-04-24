// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.b;

import com.mixpanel.android.a.f;
import com.mixpanel.android.java_websocket.a.a;
import com.mixpanel.android.java_websocket.b.c;
import com.mixpanel.android.java_websocket.e.h;
import java.net.Socket;
import java.net.URI;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.b:
//			e

private class e$b extends a
{

	public void a(h h)
	{
		f.a("MixpanelAPI.EditorCnctn", "Websocket connected");
	//    0    0:ldc1            #29  <String "MixpanelAPI.EditorCnctn">
	//    1    2:ldc1            #31  <String "Websocket connected">
	//    2    4:invokestatic    #36  <Method void f.a(String, String)>
	//    3    7:return          
	}

	public void a(Exception exception)
	{
		if(exception != null && exception.getMessage() != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          45
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #43  <Method String Exception.getMessage()>
	//*   4    8:ifnull          45
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #45  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #46  <Method void StringBuilder()>
	//    8   18:astore_2        
			stringbuilder.append("Websocket Error: ");
	//    9   19:aload_2         
	//   10   20:ldc1            #48  <String "Websocket Error: ">
	//   11   22:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
			stringbuilder.append(exception.getMessage());
	//   13   26:aload_2         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #43  <Method String Exception.getMessage()>
	//   16   31:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:pop             
			f.e("MixpanelAPI.EditorCnctn", stringbuilder.toString());
	//   18   35:ldc1            #29  <String "MixpanelAPI.EditorCnctn">
	//   19   37:aload_2         
	//   20   38:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   21   41:invokestatic    #58  <Method void f.e(String, String)>
			return;
	//   22   44:return          
		} else
		{
			f.e("MixpanelAPI.EditorCnctn", "Unknown websocket error occurred");
	//   23   45:ldc1            #29  <String "MixpanelAPI.EditorCnctn">
	//   24   47:ldc1            #60  <String "Unknown websocket error occurred">
	//   25   49:invokestatic    #58  <Method void f.e(String, String)>
			return;
	//   26   52:return          
		}
	}

	public void a(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #45  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #46  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Received message from editor:\n");
	//    4    8:aload_2         
	//    5    9:ldc1            #65  <String "Received message from editor:\n">
	//    6   11:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(s);
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		f.a("MixpanelAPI.EditorCnctn", stringbuilder.toString());
	//   12   21:ldc1            #29  <String "MixpanelAPI.EditorCnctn">
	//   13   23:aload_2         
	//   14   24:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   15   27:invokestatic    #36  <Method void f.a(String, String)>
		JSONObject jsonobject;
		String s1;
		jsonobject = new JSONObject(s);
	//   16   30:new             #67  <Class JSONObject>
	//   17   33:dup             
	//   18   34:aload_1         
	//   19   35:invokespecial   #69  <Method void JSONObject(String)>
	//   20   38:astore_2        
		s1 = jsonobject.getString("type");
	//   21   39:aload_2         
	//   22   40:ldc1            #71  <String "type">
	//   23   42:invokevirtual   #75  <Method String JSONObject.getString(String)>
	//   24   45:astore_3        
		if(s1.equals("device_info_request"))
	//*  25   46:aload_3         
	//*  26   47:ldc1            #77  <String "device_info_request">
	//*  27   49:invokevirtual   #83  <Method boolean String.equals(Object)>
	//*  28   52:ifeq            68
		{
			com.mixpanel.android.b.e.a(c).a();
	//   29   55:aload_0         
	//   30   56:getfield        #13  <Field e c>
	//   31   59:invokestatic    #86  <Method e$a com.mixpanel.android.b.e.a(e)>
	//   32   62:invokeinterface #90  <Method void com.mixpanel.android.b.e$a.a()>
			return;
	//   33   67:return          
		}
		if(s1.equals("snapshot_request"))
	//*  34   68:aload_3         
	//*  35   69:ldc1            #92  <String "snapshot_request">
	//*  36   71:invokevirtual   #83  <Method boolean String.equals(Object)>
	//*  37   74:ifeq            91
		{
			com.mixpanel.android.b.e.a(c).a(jsonobject);
	//   38   77:aload_0         
	//   39   78:getfield        #13  <Field e c>
	//   40   81:invokestatic    #86  <Method e$a com.mixpanel.android.b.e.a(e)>
	//   41   84:aload_2         
	//   42   85:invokeinterface #95  <Method void com.mixpanel.android.b.e$a.a(JSONObject)>
			return;
	//   43   90:return          
		}
		if(s1.equals("change_request"))
	//*  44   91:aload_3         
	//*  45   92:ldc1            #97  <String "change_request">
	//*  46   94:invokevirtual   #83  <Method boolean String.equals(Object)>
	//*  47   97:ifeq            114
		{
			com.mixpanel.android.b.e.a(c).b(jsonobject);
	//   48  100:aload_0         
	//   49  101:getfield        #13  <Field e c>
	//   50  104:invokestatic    #86  <Method e$a com.mixpanel.android.b.e.a(e)>
	//   51  107:aload_2         
	//   52  108:invokeinterface #99  <Method void e$a.b(JSONObject)>
			return;
	//   53  113:return          
		}
		if(s1.equals("event_binding_request"))
	//*  54  114:aload_3         
	//*  55  115:ldc1            #101 <String "event_binding_request">
	//*  56  117:invokevirtual   #83  <Method boolean String.equals(Object)>
	//*  57  120:ifeq            137
		{
			com.mixpanel.android.b.e.a(c).d(jsonobject);
	//   58  123:aload_0         
	//   59  124:getfield        #13  <Field e c>
	//   60  127:invokestatic    #86  <Method e$a com.mixpanel.android.b.e.a(e)>
	//   61  130:aload_2         
	//   62  131:invokeinterface #104 <Method void e$a.d(JSONObject)>
			return;
	//   63  136:return          
		}
		if(s1.equals("clear_request"))
	//*  64  137:aload_3         
	//*  65  138:ldc1            #106 <String "clear_request">
	//*  66  140:invokevirtual   #83  <Method boolean String.equals(Object)>
	//*  67  143:ifeq            160
		{
			com.mixpanel.android.b.e.a(c).c(jsonobject);
	//   68  146:aload_0         
	//   69  147:getfield        #13  <Field e c>
	//   70  150:invokestatic    #86  <Method e$a com.mixpanel.android.b.e.a(e)>
	//   71  153:aload_2         
	//   72  154:invokeinterface #108 <Method void com.mixpanel.android.b.e$a.c(JSONObject)>
			return;
	//   73  159:return          
		}
		try
		{
			if(s1.equals("tweak_request"))
	//*  74  160:aload_3         
	//*  75  161:ldc1            #110 <String "tweak_request">
	//*  76  163:invokevirtual   #83  <Method boolean String.equals(Object)>
	//*  77  166:ifeq            215
			{
				com.mixpanel.android.b.e.a(c).e(jsonobject);
	//   78  169:aload_0         
	//   79  170:getfield        #13  <Field e c>
	//   80  173:invokestatic    #86  <Method e$a com.mixpanel.android.b.e.a(e)>
	//   81  176:aload_2         
	//   82  177:invokeinterface #112 <Method void e$a.e(JSONObject)>
				return;
	//   83  182:return          
			}
		}
		catch(JSONException jsonexception)
	//*  84  183:astore_2        
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   85  184:new             #45  <Class StringBuilder>
	//   86  187:dup             
	//   87  188:invokespecial   #46  <Method void StringBuilder()>
	//   88  191:astore_3        
			stringbuilder1.append("Bad JSON received:");
	//   89  192:aload_3         
	//   90  193:ldc1            #114 <String "Bad JSON received:">
	//   91  195:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   92  198:pop             
			stringbuilder1.append(s);
	//   93  199:aload_3         
	//   94  200:aload_1         
	//   95  201:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   96  204:pop             
			f.e("MixpanelAPI.EditorCnctn", stringbuilder1.toString(), ((Throwable) (jsonexception)));
	//   97  205:ldc1            #29  <String "MixpanelAPI.EditorCnctn">
	//   98  207:aload_3         
	//   99  208:invokevirtual   #55  <Method String StringBuilder.toString()>
	//  100  211:aload_2         
	//  101  212:invokestatic    #117 <Method void f.e(String, String, Throwable)>
		}
		return;
	//  102  215:return          
	}

	public void b(int i, String s, boolean flag)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #45  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #46  <Method void StringBuilder()>
	//    3    7:astore          4
		stringbuilder.append("WebSocket closed. Code: ");
	//    4    9:aload           4
	//    5   11:ldc1            #120 <String "WebSocket closed. Code: ">
	//    6   13:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		stringbuilder.append(i);
	//    8   17:aload           4
	//    9   19:iload_1         
	//   10   20:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//   11   23:pop             
		stringbuilder.append(", reason: ");
	//   12   24:aload           4
	//   13   26:ldc1            #125 <String ", reason: ">
	//   14   28:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
		stringbuilder.append(s);
	//   16   32:aload           4
	//   17   34:aload_2         
	//   18   35:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
		stringbuilder.append("\nURI: ");
	//   20   39:aload           4
	//   21   41:ldc1            #127 <String "\nURI: ">
	//   22   43:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   23   46:pop             
		stringbuilder.append(((Object) (e.b(c))));
	//   24   47:aload           4
	//   25   49:aload_0         
	//   26   50:getfield        #13  <Field e c>
	//   27   53:invokestatic    #130 <Method URI e.b(e)>
	//   28   56:invokevirtual   #133 <Method StringBuilder StringBuilder.append(Object)>
	//   29   59:pop             
		f.a("MixpanelAPI.EditorCnctn", stringbuilder.toString());
	//   30   60:ldc1            #29  <String "MixpanelAPI.EditorCnctn">
	//   31   62:aload           4
	//   32   64:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   33   67:invokestatic    #36  <Method void f.a(String, String)>
		com.mixpanel.android.b.e.a(c).b();
	//   34   70:aload_0         
	//   35   71:getfield        #13  <Field e c>
	//   36   74:invokestatic    #86  <Method e$a com.mixpanel.android.b.e.a(e)>
	//   37   77:invokeinterface #135 <Method void e$a.b()>
	//   38   82:return          
	}

	final e c;

	public e$b(e e1, URI uri, int i, Socket socket)
	{
		c = e1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field e c>
		super(uri, ((com.mixpanel.android.java_websocket.b.a) (new c())), ((java.util.Map) (null)), i);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:new             #15  <Class c>
	//    6   10:dup             
	//    7   11:invokespecial   #18  <Method void c()>
	//    8   14:aconst_null     
	//    9   15:iload_3         
	//   10   16:invokespecial   #21  <Method void a(URI, com.mixpanel.android.java_websocket.b.a, java.util.Map, int)>
		a(socket);
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:invokevirtual   #25  <Method void a(Socket)>
	//   14   25:return          
	}
}
