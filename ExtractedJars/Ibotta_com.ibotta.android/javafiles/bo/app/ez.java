// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.StringUtils;
import java.util.*;
import org.json.*;

// Referenced classes of package bo.app:
//			ey, ft, fr

public final class ez
	implements ey
{

	public ez(JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		b = ((Set) (new HashSet()));
	//    2    4:aload_0         
	//    3    5:new             #18  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void HashSet()>
	//    6   12:putfield        #21  <Field Set b>
		jsonobject = jsonobject.getJSONObject("data");
	//    7   15:aload_1         
	//    8   16:ldc1            #23  <String "data">
	//    9   18:invokevirtual   #29  <Method JSONObject JSONObject.getJSONObject(String)>
	//   10   21:astore_1        
		a = jsonobject.getString("id");
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:ldc1            #31  <String "id">
	//   14   26:invokevirtual   #35  <Method String JSONObject.getString(String)>
	//   15   29:putfield        #37  <Field String a>
		jsonobject = ((JSONObject) (jsonobject.optJSONArray("buttons")));
	//   16   32:aload_1         
	//   17   33:ldc1            #39  <String "buttons">
	//   18   35:invokevirtual   #43  <Method JSONArray JSONObject.optJSONArray(String)>
	//   19   38:astore_1        
		if(jsonobject != null)
	//*  20   39:aload_1         
	//*  21   40:ifnull          75
		{
			for(int i = 0; i < ((JSONArray) (jsonobject)).length(); i++)
	//*  22   43:iconst_0        
	//*  23   44:istore_2        
	//*  24   45:iload_2         
	//*  25   46:aload_1         
	//*  26   47:invokevirtual   #49  <Method int JSONArray.length()>
	//*  27   50:icmpge          75
				b.add(((Object) (((JSONArray) (jsonobject)).getString(i))));
	//   28   53:aload_0         
	//   29   54:getfield        #21  <Field Set b>
	//   30   57:aload_1         
	//   31   58:iload_2         
	//   32   59:invokevirtual   #52  <Method String JSONArray.getString(int)>
	//   33   62:invokeinterface #58  <Method boolean Set.add(Object)>
	//   34   67:pop             

	//   35   68:iload_2         
	//   36   69:iconst_1        
	//   37   70:iadd            
	//   38   71:istore_2        
		}
	//*  39   72:goto            45
	//   40   75:return          
	}

	public JSONObject a()
	{
		JSONObject jsonobject;
		JSONObject jsonobject1;
		JSONArray jsonarray;
		try
		{
			jsonobject = new JSONObject();
	//    0    0:new             #25  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #63  <Method void JSONObject()>
	//    3    7:astore_1        
			jsonobject.put("type", "iam_click");
	//    4    8:aload_1         
	//    5    9:ldc1            #65  <String "type">
	//    6   11:ldc1            #67  <String "iam_click">
	//    7   13:invokevirtual   #71  <Method JSONObject JSONObject.put(String, Object)>
	//    8   16:pop             
			jsonobject1 = new JSONObject();
	//    9   17:new             #25  <Class JSONObject>
	//   10   20:dup             
	//   11   21:invokespecial   #63  <Method void JSONObject()>
	//   12   24:astore_2        
			jsonobject1.put("id", ((Object) (a)));
	//   13   25:aload_2         
	//   14   26:ldc1            #31  <String "id">
	//   15   28:aload_0         
	//   16   29:getfield        #37  <Field String a>
	//   17   32:invokevirtual   #71  <Method JSONObject JSONObject.put(String, Object)>
	//   18   35:pop             
			if(b.size() <= 0)
				break MISSING_BLOCK_LABEL_103;
	//   19   36:aload_0         
	//   20   37:getfield        #21  <Field Set b>
	//   21   40:invokeinterface #74  <Method int Set.size()>
	//   22   45:ifle            103
			jsonarray = new JSONArray();
	//   23   48:new             #45  <Class JSONArray>
	//   24   51:dup             
	//   25   52:invokespecial   #75  <Method void JSONArray()>
	//   26   55:astore_3        
			for(Iterator iterator = b.iterator(); iterator.hasNext(); jsonarray.put(((Object) ((String)iterator.next()))));
	//   27   56:aload_0         
	//   28   57:getfield        #21  <Field Set b>
	//   29   60:invokeinterface #79  <Method Iterator Set.iterator()>
	//   30   65:astore          4
	//   31   67:aload           4
	//   32   69:invokeinterface #85  <Method boolean Iterator.hasNext()>
	//   33   74:ifeq            95
	//   34   77:aload_3         
	//   35   78:aload           4
	//   36   80:invokeinterface #89  <Method Object Iterator.next()>
	//   37   85:checkcast       #91  <Class String>
	//   38   88:invokevirtual   #94  <Method JSONArray JSONArray.put(Object)>
	//   39   91:pop             
		}
	//*  40   92:goto            67
	//*  41   95:aload_2         
	//*  42   96:ldc1            #39  <String "buttons">
	//*  43   98:aload_3         
	//*  44   99:invokevirtual   #71  <Method JSONObject JSONObject.put(String, Object)>
	//*  45  102:pop             
	//*  46  103:aload_1         
	//*  47  104:ldc1            #23  <String "data">
	//*  48  106:aload_2         
	//*  49  107:invokevirtual   #71  <Method JSONObject JSONObject.put(String, Object)>
	//*  50  110:pop             
	//*  51  111:aload_1         
	//*  52  112:areturn         
	//*  53  113:aconst_null     
	//*  54  114:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONException jsonexception)
		{
			return null;
		}
		jsonobject1.put("buttons", ((Object) (jsonarray)));
		jsonobject.put("data", ((Object) (jsonobject1)));
		JSONException jsonexception;
		return jsonobject;
	//*  55  115:astore_1        
	//*  56  116:goto            113
	}

	public boolean a(fr fr)
	{
		boolean flag = fr instanceof ft;
	//    0    0:aload_1         
	//    1    1:instanceof      #97  <Class ft>
	//    2    4:istore_2        
		boolean flag2 = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		if(flag)
	//*   5    7:iload_2         
	//*   6    8:ifeq            94
		{
			fr = ((fr) ((ft)fr));
	//    7   11:aload_1         
	//    8   12:checkcast       #97  <Class ft>
	//    9   15:astore_1        
			if(!StringUtils.isNullOrBlank(((ft) (fr)).a()) && ((ft) (fr)).a().equals(((Object) (a))))
	//*  10   16:aload_1         
	//*  11   17:invokevirtual   #100 <Method String ft.a()>
	//*  12   20:invokestatic    #106 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  13   23:ifne            94
	//*  14   26:aload_1         
	//*  15   27:invokevirtual   #100 <Method String ft.a()>
	//*  16   30:aload_0         
	//*  17   31:getfield        #37  <Field String a>
	//*  18   34:invokevirtual   #109 <Method boolean String.equals(Object)>
	//*  19   37:ifeq            94
				if(b.size() > 0)
	//*  20   40:aload_0         
	//*  21   41:getfield        #21  <Field Set b>
	//*  22   44:invokeinterface #74  <Method int Set.size()>
	//*  23   49:ifle            86
				{
					boolean flag1 = flag2;
	//   24   52:iload_3         
	//   25   53:istore_2        
					if(!StringUtils.isNullOrBlank(((ft) (fr)).f()))
	//*  26   54:aload_1         
	//*  27   55:invokevirtual   #112 <Method String ft.f()>
	//*  28   58:invokestatic    #106 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  29   61:ifne            84
					{
						flag1 = flag2;
	//   30   64:iload_3         
	//   31   65:istore_2        
						if(b.contains(((Object) (((ft) (fr)).f()))))
	//*  32   66:aload_0         
	//*  33   67:getfield        #21  <Field Set b>
	//*  34   70:aload_1         
	//*  35   71:invokevirtual   #112 <Method String ft.f()>
	//*  36   74:invokeinterface #115 <Method boolean Set.contains(Object)>
	//*  37   79:ifeq            84
							flag1 = true;
	//   38   82:iconst_1        
	//   39   83:istore_2        
					}
					return flag1;
	//   40   84:iload_2         
	//   41   85:ireturn         
				} else
				{
					return StringUtils.isNullOrBlank(((ft) (fr)).f());
	//   42   86:aload_1         
	//   43   87:invokevirtual   #112 <Method String ft.f()>
	//   44   90:invokestatic    #106 <Method boolean StringUtils.isNullOrBlank(String)>
	//   45   93:ireturn         
				}
		}
		return false;
	//   46   94:iconst_0        
	//   47   95:ireturn         
	}

	public Object forJsonPut()
	{
		return ((Object) (a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #118 <Method JSONObject a()>
	//    2    4:areturn         
	}

	private String a;
	private Set b;
}
