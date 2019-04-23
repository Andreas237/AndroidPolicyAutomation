// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.models.IPutIntoJson;
import com.appboy.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			bw, cf

public class cg
	implements bw, IPutIntoJson
{
	public static class a
	{

		public a a()
		{
			b = Boolean.valueOf(true);
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:invokestatic    #25  <Method Boolean Boolean.valueOf(boolean)>
		//    3    5:putfield        #27  <Field Boolean b>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public a a(cf cf1)
		{
			d = cf1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #30  <Field cf d>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public a a(String s)
		{
			a = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #33  <Field String a>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public a b()
		{
			c = Boolean.valueOf(true);
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:invokestatic    #25  <Method Boolean Boolean.valueOf(boolean)>
		//    3    5:putfield        #35  <Field Boolean c>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public cg c()
		{
			return new cg(a, b, c, d);
		//    0    0:new             #6   <Class cg>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #33  <Field String a>
		//    4    8:aload_0         
		//    5    9:getfield        #27  <Field Boolean b>
		//    6   12:aload_0         
		//    7   13:getfield        #35  <Field Boolean c>
		//    8   16:aload_0         
		//    9   17:getfield        #30  <Field cf d>
		//   10   20:aconst_null     
		//   11   21:invokespecial   #39  <Method void cg(String, Boolean, Boolean, cf, cg$1)>
		//   12   24:areturn         
		}

		private String a;
		private Boolean b;
		private Boolean c;
		private cf d;

		public a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
		//    2    4:return          
		}
	}


	private cg(String s, Boolean boolean1, Boolean boolean2, cf cf1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field String a>
		b = boolean1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #29  <Field Boolean b>
		c = boolean2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #31  <Field Boolean c>
		d = cf1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #33  <Field cf d>
	//   14   25:return          
	}


	public JSONObject a()
	{
		JSONException jsonexception;
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #42  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #43  <Method void JSONObject()>
	//    3    7:astore_1        
		try
		{
			if(!StringUtils.isNullOrEmpty(a))
	//*   4    8:aload_0         
	//*   5    9:getfield        #27  <Field String a>
	//*   6   12:invokestatic    #49  <Method boolean StringUtils.isNullOrEmpty(String)>
	//*   7   15:ifne            29
				jsonobject.put("user_id", ((Object) (a)));
	//    8   18:aload_1         
	//    9   19:ldc1            #51  <String "user_id">
	//   10   21:aload_0         
	//   11   22:getfield        #27  <Field String a>
	//   12   25:invokevirtual   #55  <Method JSONObject JSONObject.put(String, Object)>
	//   13   28:pop             
			if(b != null)
	//*  14   29:aload_0         
	//*  15   30:getfield        #29  <Field Boolean b>
	//*  16   33:ifnull          47
				jsonobject.put("feed", ((Object) (b)));
	//   17   36:aload_1         
	//   18   37:ldc1            #57  <String "feed">
	//   19   39:aload_0         
	//   20   40:getfield        #29  <Field Boolean b>
	//   21   43:invokevirtual   #55  <Method JSONObject JSONObject.put(String, Object)>
	//   22   46:pop             
			if(c != null)
	//*  23   47:aload_0         
	//*  24   48:getfield        #31  <Field Boolean c>
	//*  25   51:ifnull          65
				jsonobject.put("triggers", ((Object) (c)));
	//   26   54:aload_1         
	//   27   55:ldc1            #59  <String "triggers">
	//   28   57:aload_0         
	//   29   58:getfield        #31  <Field Boolean c>
	//   30   61:invokevirtual   #55  <Method JSONObject JSONObject.put(String, Object)>
	//   31   64:pop             
			if(d != null)
	//*  32   65:aload_0         
	//*  33   66:getfield        #33  <Field cf d>
	//*  34   69:ifnull          86
				jsonobject.put("config", ((Object) (d.a())));
	//   35   72:aload_1         
	//   36   73:ldc1            #61  <String "config">
	//   37   75:aload_0         
	//   38   76:getfield        #33  <Field cf d>
	//   39   79:invokevirtual   #65  <Method JSONObject cf.a()>
	//   40   82:invokevirtual   #55  <Method JSONObject JSONObject.put(String, Object)>
	//   41   85:pop             
		}
	//*  42   86:aload_1         
	//*  43   87:areturn         
	//*  44   88:aconst_null     
	//*  45   89:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONException jsonexception)
		{
			return null;
		}
		return jsonobject;
	//*  46   90:astore_1        
	//*  47   91:goto            88
	}

	public boolean b()
	{
		JSONObject jsonobject = a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #67  <Method JSONObject a()>
	//    2    4:astore_1        
		if(jsonobject.length() == 0)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #71  <Method int JSONObject.length()>
	//*   5    9:ifne            14
			return true;
	//    6   12:iconst_1        
	//    7   13:ireturn         
		if(jsonobject.length() == 1)
	//*   8   14:aload_1         
	//*   9   15:invokevirtual   #71  <Method int JSONObject.length()>
	//*  10   18:iconst_1        
	//*  11   19:icmpne          29
			return jsonobject.has("user_id");
	//   12   22:aload_1         
	//   13   23:ldc1            #51  <String "user_id">
	//   14   25:invokevirtual   #74  <Method boolean JSONObject.has(String)>
	//   15   28:ireturn         
		else
			return false;
	//   16   29:iconst_0        
	//   17   30:ireturn         
	}

	public boolean c()
	{
		return d != null;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field cf d>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean d()
	{
		return c != null;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Boolean c>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean e()
	{
		return b != null;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Boolean b>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean f()
	{
		return StringUtils.isNullOrEmpty(a) ^ true;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String a>
	//    2    4:invokestatic    #49  <Method boolean StringUtils.isNullOrEmpty(String)>
	//    3    7:iconst_1        
	//    4    8:ixor            
	//    5    9:ireturn         
	}

	public Object forJsonPut()
	{
		return ((Object) (a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #67  <Method JSONObject a()>
	//    2    4:areturn         
	}

	private final String a;
	private final Boolean b;
	private final Boolean c;
	private final cf d;
}
