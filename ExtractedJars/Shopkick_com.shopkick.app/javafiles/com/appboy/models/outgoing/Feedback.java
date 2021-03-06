// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.models.outgoing;

import bo.app.ce;
import com.appboy.models.IPutIntoJson;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

public final class Feedback
	implements IPutIntoJson
{

	public Feedback(String s, String s1, boolean flag, ce ce1, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		if(!StringUtils.isNullOrBlank(s))
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #37  <Method boolean StringUtils.isNullOrBlank(String)>
	//*   4    8:ifne            39
		{
			b = s;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #39  <Field String b>
			c = s1;
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:putfield        #41  <Field String c>
			d = flag;
	//   11   21:aload_0         
	//   12   22:iload_3         
	//   13   23:putfield        #43  <Field boolean d>
			e = ce1;
	//   14   26:aload_0         
	//   15   27:aload           4
	//   16   29:putfield        #45  <Field ce e>
			f = s2;
	//   17   32:aload_0         
	//   18   33:aload           5
	//   19   35:putfield        #47  <Field String f>
			return;
	//   20   38:return          
		} else
		{
			throw new IllegalArgumentException("Message cannot be null or blank");
	//   21   39:new             #49  <Class IllegalArgumentException>
	//   22   42:dup             
	//   23   43:ldc1            #51  <String "Message cannot be null or blank">
	//   24   45:invokespecial   #54  <Method void IllegalArgumentException(String)>
	//   25   48:athrow          
		}
	}

	public volatile Object forJsonPut()
	{
		return ((Object) (forJsonPut()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #59  <Method JSONObject forJsonPut()>
	//    2    4:areturn         
	}

	public JSONObject forJsonPut()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #63  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #64  <Method void JSONObject()>
	//    3    7:astore_1        
		jsonobject.put("message", ((Object) (StringUtils.checkNotNullOrEmpty(b))));
	//    4    8:aload_1         
	//    5    9:ldc1            #66  <String "message">
	//    6   11:aload_0         
	//    7   12:getfield        #39  <Field String b>
	//    8   15:invokestatic    #70  <Method String StringUtils.checkNotNullOrEmpty(String)>
	//    9   18:invokevirtual   #74  <Method JSONObject JSONObject.put(String, Object)>
	//   10   21:pop             
		jsonobject.put("reply_to", ((Object) (c)));
	//   11   22:aload_1         
	//   12   23:ldc1            #76  <String "reply_to">
	//   13   25:aload_0         
	//   14   26:getfield        #41  <Field String c>
	//   15   29:invokevirtual   #74  <Method JSONObject JSONObject.put(String, Object)>
	//   16   32:pop             
		jsonobject.put("is_bug", d);
	//   17   33:aload_1         
	//   18   34:ldc1            #78  <String "is_bug">
	//   19   36:aload_0         
	//   20   37:getfield        #43  <Field boolean d>
	//   21   40:invokevirtual   #81  <Method JSONObject JSONObject.put(String, boolean)>
	//   22   43:pop             
		if(e != null)
	//*  23   44:aload_0         
	//*  24   45:getfield        #45  <Field ce e>
	//*  25   48:ifnull          65
			jsonobject.put("device", ((Object) (e.a())));
	//   26   51:aload_1         
	//   27   52:ldc1            #83  <String "device">
	//   28   54:aload_0         
	//   29   55:getfield        #45  <Field ce e>
	//   30   58:invokevirtual   #87  <Method JSONObject ce.a()>
	//   31   61:invokevirtual   #74  <Method JSONObject JSONObject.put(String, Object)>
	//   32   64:pop             
		if(StringUtils.isNullOrEmpty(f))
			break MISSING_BLOCK_LABEL_99;
	//   33   65:aload_0         
	//   34   66:getfield        #47  <Field String f>
	//   35   69:invokestatic    #90  <Method boolean StringUtils.isNullOrEmpty(String)>
	//   36   72:ifne            99
		jsonobject.put("user_id", ((Object) (f)));
	//   37   75:aload_1         
	//   38   76:ldc1            #92  <String "user_id">
	//   39   78:aload_0         
	//   40   79:getfield        #47  <Field String f>
	//   41   82:invokevirtual   #74  <Method JSONObject JSONObject.put(String, Object)>
	//   42   85:pop             
		return jsonobject;
	//   43   86:aload_1         
	//   44   87:areturn         
		JSONException jsonexception;
		jsonexception;
	//   45   88:astore_2        
		AppboyLogger.e(a, "Caught exception creating feedback Json.", ((Throwable) (jsonexception)));
	//   46   89:getstatic       #26  <Field String a>
	//   47   92:ldc1            #94  <String "Caught exception creating feedback Json.">
	//   48   94:aload_2         
	//   49   95:invokestatic    #97  <Method int AppboyLogger.e(String, String, Throwable)>
	//   50   98:pop             
		return jsonobject;
	//   51   99:aload_1         
	//   52  100:areturn         
	}

	public String getMessage()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String b>
	//    2    4:areturn         
	}

	public String getReplyToEmail()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field String c>
	//    2    4:areturn         
	}

	public boolean isReportingABug()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field boolean d>
	//    2    4:ireturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(com/appboy/models/outgoing/Feedback);
	private final String b;
	private final String c;
	private final boolean d;
	private final ce e;
	private final String f;

	static 
	{
	//    0    0:ldc1            #2   <Class Feedback>
	//    1    2:invokestatic    #24  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #26  <Field String a>
	//*   3    8:return          
	}
}
