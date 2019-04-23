// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk;

import org.json.*;

// Referenced classes of package com.paypal.android.sdk:
//			ef, cj, ca, ab

public abstract class eu extends ef
{

	public eu(cj cj, ca ca, ab ab, String s)
	{
		super(cj, ca, ab, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #8   <Method void ef(cj, ca, ab, String)>
	//    6    9:return          
	}

	protected final void b(JSONObject jsonobject)
	{
		Object obj;
		String s;
		Object obj1;
		String s1;
		String s3;
		String s4;
		s3 = jsonobject.getString("name");
	//    0    0:aload_1         
	//    1    1:ldc1            #15  <String "name">
	//    2    3:invokevirtual   #21  <Method String JSONObject.getString(String)>
	//    3    6:astore          8
		s4 = jsonobject.getString("message");
	//    4    8:aload_1         
	//    5    9:ldc1            #23  <String "message">
	//    6   11:invokevirtual   #21  <Method String JSONObject.getString(String)>
	//    7   14:astore          9
		s1 = "";
	//    8   16:ldc1            #25  <String "">
	//    9   18:astore          5
		obj1 = "";
	//   10   20:ldc1            #25  <String "">
	//   11   22:astore          4
		obj = ((Object) (s1));
	//   12   24:aload           5
	//   13   26:astore_2        
		s = ((String) (obj1));
	//   14   27:aload           4
	//   15   29:astore_3        
		Object obj2 = ((Object) (jsonobject.getJSONArray("details").getJSONObject(0)));
	//   16   30:aload_1         
	//   17   31:ldc1            #27  <String "details">
	//   18   33:invokevirtual   #31  <Method JSONArray JSONObject.getJSONArray(String)>
	//   19   36:iconst_0        
	//   20   37:invokevirtual   #37  <Method JSONObject JSONArray.getJSONObject(int)>
	//   21   40:astore          6
		obj = ((Object) (s1));
	//   22   42:aload           5
	//   23   44:astore_2        
		s = ((String) (obj1));
	//   24   45:aload           4
	//   25   47:astore_3        
		jsonobject = ((JSONObject) (((JSONObject) (obj2)).getString("field")));
	//   26   48:aload           6
	//   27   50:ldc1            #39  <String "field">
	//   28   52:invokevirtual   #21  <Method String JSONObject.getString(String)>
	//   29   55:astore_1        
		obj = ((Object) (jsonobject));
	//   30   56:aload_1         
	//   31   57:astore_2        
		s = ((String) (obj1));
	//   32   58:aload           4
	//   33   60:astore_3        
		obj2 = ((Object) (((JSONObject) (obj2)).getString("issue")));
	//   34   61:aload           6
	//   35   63:ldc1            #41  <String "issue">
	//   36   65:invokevirtual   #21  <Method String JSONObject.getString(String)>
	//   37   68:astore          6
		String s2;
		s2 = s3;
	//   38   70:aload           8
	//   39   72:astore          7
		obj1 = ((Object) (jsonobject));
	//   40   74:aload_1         
	//   41   75:astore          4
		s1 = ((String) (obj2));
	//   42   77:aload           6
	//   43   79:astore          5
		obj = ((Object) (jsonobject));
	//   44   81:aload_1         
	//   45   82:astore_2        
		s = ((String) (obj2));
	//   46   83:aload           6
	//   47   85:astore_3        
		if(!s3.equals("VALIDATION_ERROR"))
			break MISSING_BLOCK_LABEL_132;
	//   48   86:aload           8
	//   49   88:ldc1            #43  <String "VALIDATION_ERROR">
	//   50   90:invokevirtual   #49  <Method boolean String.equals(Object)>
	//   51   93:ifeq            132
		s2 = s3;
	//   52   96:aload           8
	//   53   98:astore          7
		obj1 = ((Object) (jsonobject));
	//   54  100:aload_1         
	//   55  101:astore          4
		s1 = ((String) (obj2));
	//   56  103:aload           6
	//   57  105:astore          5
		obj = ((Object) (jsonobject));
	//   58  107:aload_1         
	//   59  108:astore_2        
		s = ((String) (obj2));
	//   60  109:aload           6
	//   61  111:astore_3        
		if(((String) (jsonobject)).contains("amount.currency"))
	//*  62  112:aload_1         
	//*  63  113:ldc1            #51  <String "amount.currency">
	//*  64  115:invokevirtual   #55  <Method boolean String.contains(CharSequence)>
	//*  65  118:ifeq            132
		{
			s2 = "pp_service_error_bad_currency";
	//   66  121:ldc1            #57  <String "pp_service_error_bad_currency">
	//   67  123:astore          7
			s1 = ((String) (obj2));
	//   68  125:aload           6
	//   69  127:astore          5
			obj1 = ((Object) (jsonobject));
	//   70  129:aload_1         
	//   71  130:astore          4
		}
_L2:
		jsonobject = ((JSONObject) (new StringBuilder("field:")));
	//   72  132:new             #59  <Class StringBuilder>
	//   73  135:dup             
	//   74  136:ldc1            #61  <String "field:">
	//   75  138:invokespecial   #64  <Method void StringBuilder(String)>
	//   76  141:astore_1        
		((StringBuilder) (jsonobject)).append(((String) (obj1)));
	//   77  142:aload_1         
	//   78  143:aload           4
	//   79  145:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   80  148:pop             
		((StringBuilder) (jsonobject)).append(", issue:");
	//   81  149:aload_1         
	//   82  150:ldc1            #70  <String ", issue:">
	//   83  152:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   84  155:pop             
		((StringBuilder) (jsonobject)).append(s1);
	//   85  156:aload_1         
	//   86  157:aload           5
	//   87  159:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   88  162:pop             
		a(s2, s4, ((StringBuilder) (jsonobject)).toString());
	//   89  163:aload_0         
	//   90  164:aload           7
	//   91  166:aload           9
	//   92  168:aload_1         
	//   93  169:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   94  172:invokevirtual   #78  <Method void a(String, String, String)>
		return;
	//   95  175:return          
		jsonobject;
	//   96  176:astore_1        
		s2 = s3;
	//   97  177:aload           8
	//   98  179:astore          7
		obj1 = obj;
	//   99  181:aload_2         
	//  100  182:astore          4
		s1 = s;
	//  101  184:aload_3         
	//  102  185:astore          5
		if(true) goto _L2; else goto _L1
	//  103  187:goto            132
_L1:
	}
}
