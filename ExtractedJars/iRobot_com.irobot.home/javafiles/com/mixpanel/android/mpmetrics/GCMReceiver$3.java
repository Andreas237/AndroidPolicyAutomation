// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.mpmetrics;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//			GCMReceiver, j

class GCMReceiver$3
	implements j.a
{

	public void a(j j1)
	{
		if(!j1.f())
			break MISSING_BLOCK_LABEL_86;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #39  <Method boolean j.f()>
	//    2    4:ifeq            86
		JSONObject jsonobject1 = new JSONObject();
	//    3    7:new             #41  <Class JSONObject>
	//    4   10:dup             
	//    5   11:invokespecial   #42  <Method void JSONObject()>
	//    6   14:astore_3        
		JSONObject jsonobject = jsonobject1;
	//    7   15:aload_3         
	//    8   16:astore_2        
		try
		{
			if(a != null)
	//*   9   17:aload_0         
	//*  10   18:getfield        #22  <Field String a>
	//*  11   21:ifnull          36
				jsonobject = new JSONObject(a);
	//   12   24:new             #41  <Class JSONObject>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:getfield        #22  <Field String a>
	//   16   32:invokespecial   #45  <Method void JSONObject(String)>
	//   17   35:astore_2        
		}
	//*  18   36:aload_2         
	//*  19   37:ldc1            #47  <String "campaign_id">
	//*  20   39:aload_0         
	//*  21   40:getfield        #24  <Field String b>
	//*  22   43:invokestatic    #53  <Method Integer Integer.valueOf(String)>
	//*  23   46:invokevirtual   #57  <Method int Integer.intValue()>
	//*  24   49:invokevirtual   #61  <Method JSONObject JSONObject.put(String, int)>
	//*  25   52:pop             
	//*  26   53:aload_2         
	//*  27   54:ldc1            #63  <String "message_id">
	//*  28   56:aload_0         
	//*  29   57:getfield        #26  <Field String c>
	//*  30   60:invokestatic    #53  <Method Integer Integer.valueOf(String)>
	//*  31   63:invokevirtual   #57  <Method int Integer.intValue()>
	//*  32   66:invokevirtual   #61  <Method JSONObject JSONObject.put(String, int)>
	//*  33   69:pop             
	//*  34   70:aload_2         
	//*  35   71:ldc1            #65  <String "message_type">
	//*  36   73:ldc1            #67  <String "push">
	//*  37   75:invokevirtual   #70  <Method JSONObject JSONObject.put(String, Object)>
	//*  38   78:pop             
	//*  39   79:aload_1         
	//*  40   80:ldc1            #72  <String "$campaign_received">
	//*  41   82:aload_2         
	//*  42   83:invokevirtual   #75  <Method void j.a(String, JSONObject)>
	//*  43   86:return          
		catch(JSONException jsonexception)
	//*  44   87:astore_2        
		{
			jsonexception = ((JSONException) (jsonobject1));
	//   45   88:aload_3         
	//   46   89:astore_2        
		}
		jsonobject.put("campaign_id", Integer.valueOf(b).intValue());
		jsonobject.put("message_id", Integer.valueOf(c).intValue());
		jsonobject.put("message_type", "push");
		j1.a("$campaign_received", jsonobject);
		return;
	//*  47   90:goto            36
		j1;
	//   48   93:astore_1        
	//   49   94:return          
	}

	final String a;
	final String b;
	final String c;
	final GCMReceiver d;

	GCMReceiver$3(GCMReceiver gcmreceiver, String s, String s1, String s2)
	{
		d = gcmreceiver;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field GCMReceiver d>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field String a>
		b = s1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field String b>
		c = s2;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #26  <Field String c>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #29  <Method void Object()>
	//   14   25:return          
	}
}
