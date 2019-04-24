// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.util;

import com.gigya.socialize.GSObject;
import com.gigya.socialize.android.GSPluginFragment;
import com.gigya.socialize.android.event.GSPluginListener;
import com.irobot.core.AnalyticsSubsystem;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.irobot.home.util:
//			g, o

static final class g$1
	implements GSPluginListener
{

	public void onError(GSPluginFragment gspluginfragment, GSObject gsobject)
	{
		gspluginfragment = ((GSPluginFragment) (g.a()));
	//    0    0:invokestatic    #29  <Method String g.a()>
	//    1    3:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #31  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #32  <Method void StringBuilder()>
	//    5   11:astore          4
		stringbuilder.append("onError: ");
	//    6   13:aload           4
	//    7   15:ldc1            #34  <String "onError: ">
	//    8   17:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
		stringbuilder.append(((Object) (gsobject)));
	//   10   21:aload           4
	//   11   23:aload_2         
	//   12   24:invokevirtual   #41  <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
		o.b(((String) (gspluginfragment)), stringbuilder.toString());
	//   14   28:aload_1         
	//   15   29:aload           4
	//   16   31:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #49  <Method void o.b(String, String)>
		int i = gsobject.getInt("errorCode", -1);
	//   18   37:aload_2         
	//   19   38:ldc1            #51  <String "errorCode">
	//   20   40:iconst_m1       
	//   21   41:invokevirtual   #57  <Method int GSObject.getInt(String, int)>
	//   22   44:istore_3        
		gspluginfragment = ((GSPluginFragment) (gsobject.getString("errorDetails", "")));
	//   23   45:aload_2         
	//   24   46:ldc1            #59  <String "errorDetails">
	//   25   48:ldc1            #61  <String "">
	//   26   50:invokevirtual   #65  <Method String GSObject.getString(String, String)>
	//   27   53:astore_1        
		gsobject = ((GSObject) (gsobject.getString("errorMessage", "")));
	//   28   54:aload_2         
	//   29   55:ldc1            #67  <String "errorMessage">
	//   30   57:ldc1            #61  <String "">
	//   31   59:invokevirtual   #65  <Method String GSObject.getString(String, String)>
	//   32   62:astore_2        
		AnalyticsSubsystem.getInstance().trackAccountError(i, ((String) (gsobject)), ((String) (gspluginfragment)), a);
	//   33   63:invokestatic    #73  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   34   66:iload_3         
	//   35   67:aload_2         
	//   36   68:aload_1         
	//   37   69:aload_0         
	//   38   70:getfield        #23  <Field boolean a>
	//   39   73:invokevirtual   #77  <Method void AnalyticsSubsystem.trackAccountError(int, String, String, boolean)>
		if(b != null)
	//*  40   76:aload_0         
	//*  41   77:getfield        #18  <Field g$a b>
	//*  42   80:ifnull          93
			b.b(i);
	//   43   83:aload_0         
	//   44   84:getfield        #18  <Field g$a b>
	//   45   87:iload_3         
	//   46   88:invokeinterface #82  <Method void g$a.b(int)>
	//   47   93:return          
	}

	public void onEvent(GSPluginFragment gspluginfragment, GSObject gsobject)
	{
		int i;
		gspluginfragment = ((GSPluginFragment) (gsobject.getString("eventName", ((String) (null)))));
	//    0    0:aload_2         
	//    1    1:ldc1            #87  <String "eventName">
	//    2    3:aconst_null     
	//    3    4:invokevirtual   #65  <Method String GSObject.getString(String, String)>
	//    4    7:astore_1        
		String s = g.a();
	//    5    8:invokestatic    #29  <Method String g.a()>
	//    6   11:astore          5
		StringBuilder stringbuilder = new StringBuilder();
	//    7   13:new             #31  <Class StringBuilder>
	//    8   16:dup             
	//    9   17:invokespecial   #32  <Method void StringBuilder()>
	//   10   20:astore          6
		stringbuilder.append("onEvent: ");
	//   11   22:aload           6
	//   12   24:ldc1            #89  <String "onEvent: ">
	//   13   26:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
		stringbuilder.append(((String) (gspluginfragment)));
	//   15   30:aload           6
	//   16   32:aload_1         
	//   17   33:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
		o.b(s, stringbuilder.toString());
	//   19   37:aload           5
	//   20   39:aload           6
	//   21   41:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   22   44:invokestatic    #49  <Method void o.b(String, String)>
		if(!((String) (gspluginfragment)).equals("afterSubmit") || b == null)
			break MISSING_BLOCK_LABEL_108;
	//   23   47:aload_1         
	//   24   48:ldc1            #91  <String "afterSubmit">
	//   25   50:invokevirtual   #97  <Method boolean String.equals(Object)>
	//   26   53:ifeq            108
	//   27   56:aload_0         
	//   28   57:getfield        #18  <Field g$a b>
	//   29   60:ifnull          108
		i = -1;
	//   30   63:iconst_m1       
	//   31   64:istore_3        
		int j = (new JSONObject(gsobject.getString("response", ""))).getInt("errorCode");
	//   32   65:new             #99  <Class JSONObject>
	//   33   68:dup             
	//   34   69:aload_2         
	//   35   70:ldc1            #101 <String "response">
	//   36   72:ldc1            #61  <String "">
	//   37   74:invokevirtual   #65  <Method String GSObject.getString(String, String)>
	//   38   77:invokespecial   #104 <Method void JSONObject(String)>
	//   39   80:ldc1            #51  <String "errorCode">
	//   40   82:invokevirtual   #107 <Method int JSONObject.getInt(String)>
	//   41   85:istore          4
		i = j;
	//   42   87:iload           4
	//   43   89:istore_3        
		break MISSING_BLOCK_LABEL_98;
	//   44   90:goto            98
		gspluginfragment;
	//   45   93:astore_1        
		((JSONException) (gspluginfragment)).printStackTrace();
	//   46   94:aload_1         
	//   47   95:invokevirtual   #110 <Method void JSONException.printStackTrace()>
		b.a(i);
	//   48   98:aload_0         
	//   49   99:getfield        #18  <Field g$a b>
	//   50  102:iload_3         
	//   51  103:invokeinterface #112 <Method void g$a.a(int)>
	//   52  108:return          
	}

	public void onLoad(GSPluginFragment gspluginfragment, GSObject gsobject)
	{
		gspluginfragment = ((GSPluginFragment) (g.a()));
	//    0    0:invokestatic    #29  <Method String g.a()>
	//    1    3:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #31  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #32  <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("onLoad:");
	//    6   12:aload_3         
	//    7   13:ldc1            #115 <String "onLoad:">
	//    8   15:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(((Object) (gsobject)));
	//   10   19:aload_3         
	//   11   20:aload_2         
	//   12   21:invokevirtual   #41  <Method StringBuilder StringBuilder.append(Object)>
	//   13   24:pop             
		o.b(((String) (gspluginfragment)), stringbuilder.toString());
	//   14   25:aload_1         
	//   15   26:aload_3         
	//   16   27:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   17   30:invokestatic    #49  <Method void o.b(String, String)>
		a = true;
	//   18   33:aload_0         
	//   19   34:iconst_1        
	//   20   35:putfield        #23  <Field boolean a>
	//   21   38:return          
	}

	boolean a;
	final g$a b;

	g$1(g$a g$a1)
	{
		b = g$a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field g$a b>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
		a = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #23  <Field boolean a>
	//    8   14:return          
	}
}
