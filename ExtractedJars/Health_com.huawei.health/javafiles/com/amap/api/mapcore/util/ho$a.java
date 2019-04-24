// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.amap.api.mapcore.util:
//			ho

static class ho$a
{

	public static ho$a a(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #37  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            15
			return new ho$a();
	//    3    7:new             #2   <Class ho$a>
	//    4   10:dup             
	//    5   11:invokespecial   #38  <Method void ho$a()>
	//    6   14:areturn         
		try
		{
			s = ((String) (new JSONObject(s)));
	//    7   15:new             #40  <Class JSONObject>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #43  <Method void JSONObject(String)>
	//   11   23:astore_0        
			s = ((String) (new ho$a(((JSONObject) (s)).optString("mk", ""), ((JSONObject) (s)).optString("ak", ""), ((JSONObject) (s)).optString("bk", ""), ((JSONObject) (s)).optString("ik", ""), ((JSONObject) (s)).optString("nk", ""))));
	//   12   24:new             #2   <Class ho$a>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:ldc1            #45  <String "mk">
	//   16   31:ldc1            #47  <String "">
	//   17   33:invokevirtual   #51  <Method String JSONObject.optString(String, String)>
	//   18   36:aload_0         
	//   19   37:ldc1            #53  <String "ak">
	//   20   39:ldc1            #47  <String "">
	//   21   41:invokevirtual   #51  <Method String JSONObject.optString(String, String)>
	//   22   44:aload_0         
	//   23   45:ldc1            #55  <String "bk">
	//   24   47:ldc1            #47  <String "">
	//   25   49:invokevirtual   #51  <Method String JSONObject.optString(String, String)>
	//   26   52:aload_0         
	//   27   53:ldc1            #57  <String "ik">
	//   28   55:ldc1            #47  <String "">
	//   29   57:invokevirtual   #51  <Method String JSONObject.optString(String, String)>
	//   30   60:aload_0         
	//   31   61:ldc1            #59  <String "nk">
	//   32   63:ldc1            #47  <String "">
	//   33   65:invokevirtual   #51  <Method String JSONObject.optString(String, String)>
	//   34   68:invokespecial   #61  <Method void ho$a(String, String, String, String, String)>
	//   35   71:astore_0        
		}
	//*  36   72:aload_0         
	//*  37   73:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  38   74:astore_0        
		{
			return new ho$a();
	//   39   75:new             #2   <Class ho$a>
	//   40   78:dup             
	//   41   79:invokespecial   #38  <Method void ho$a()>
	//   42   82:areturn         
		}
		return ((ho$a) (s));
	}

	public static List b(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #37  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            15
			return ((List) (new ArrayList()));
	//    3    7:new             #64  <Class ArrayList>
	//    4   10:dup             
	//    5   11:invokespecial   #65  <Method void ArrayList()>
	//    6   14:areturn         
		ArrayList arraylist = new ArrayList();
	//    7   15:new             #64  <Class ArrayList>
	//    8   18:dup             
	//    9   19:invokespecial   #65  <Method void ArrayList()>
	//   10   22:astore_2        
		int i;
		try
		{
			s = ((String) (new JSONArray(s)));
	//   11   23:new             #67  <Class JSONArray>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:invokespecial   #68  <Method void JSONArray(String)>
	//   15   31:astore_0        
		}
	//*  16   32:iconst_0        
	//*  17   33:istore_1        
	//*  18   34:iload_1         
	//*  19   35:aload_0         
	//*  20   36:invokevirtual   #72  <Method int JSONArray.length()>
	//*  21   39:icmpge          64
	//*  22   42:aload_2         
	//*  23   43:aload_0         
	//*  24   44:iload_1         
	//*  25   45:invokevirtual   #76  <Method String JSONArray.getString(int)>
	//*  26   48:invokestatic    #78  <Method ho$a a(String)>
	//*  27   51:invokeinterface #84  <Method boolean List.add(Object)>
	//*  28   56:pop             
	//*  29   57:iload_1         
	//*  30   58:iconst_1        
	//*  31   59:iadd            
	//*  32   60:istore_1        
	//*  33   61:goto            34
	//*  34   64:aload_2         
	//*  35   65:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  36   66:astore_0        
		{
			((Throwable) (s)).printStackTrace();
	//   37   67:aload_0         
	//   38   68:invokevirtual   #87  <Method void Throwable.printStackTrace()>
			return ((List) (arraylist));
	//   39   71:aload_2         
	//   40   72:areturn         
		}
		i = 0;
		if(i >= ((JSONArray) (s)).length())
			break; /* Loop/switch isn't completed */
		((List) (arraylist)).add(((Object) (a(((JSONArray) (s)).getString(i)))));
		i++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_34;
_L1:
		return ((List) (arraylist));
	}

	public String a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String a>
	//    2    4:areturn         
	}

	public String b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String b>
	//    2    4:areturn         
	}

	public String c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String c>
	//    2    4:areturn         
	}

	public String d()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String d>
	//    2    4:areturn         
	}

	public String e()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String e>
	//    2    4:areturn         
	}

	private String a;
	private String b;
	private String c;
	private String d;
	private String e;

	public ho$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public ho$a(String s, String s1, String s2, String s3, String s4)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field String a>
		b = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field String b>
		c = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #24  <Field String c>
		d = s3;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #26  <Field String d>
		e = s4;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #28  <Field String e>
	//   17   31:return          
	}
}
