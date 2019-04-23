// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk;

import android.util.Log;
import java.util.*;
import org.json.*;

// Referenced classes of package com.paypal.android.sdk:
//			fi, cd, fc, fa

final class fj
	implements Iterable
{

	public fj(JSONArray jsonarray, JSONObject jsonobject)
	{
		int i;
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		a = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #27  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void ArrayList()>
	//    6   12:putfield        #30  <Field List a>
		i = 0;
	//    7   15:iconst_0        
	//    8   16:istore_3        
_L2:
		Object obj;
		Object obj1;
		int j = jsonarray.length();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #36  <Method int JSONArray.length()>
	//   11   21:istore          4
		obj1 = null;
	//   12   23:aconst_null     
	//   13   24:astore          6
		obj = null;
	//   14   26:aconst_null     
	//   15   27:astore          5
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   16   29:iload_3         
	//   17   30:iload           4
	//   18   32:icmpge          111
		obj1 = ((Object) (fi.a(jsonarray.getJSONObject(i))));
	//   19   35:aload_1         
	//   20   36:iload_3         
	//   21   37:invokevirtual   #40  <Method JSONObject JSONArray.getJSONObject(int)>
	//   22   40:invokestatic    #45  <Method fi fi.a(JSONObject)>
	//   23   43:astore          6
		obj = obj1;
	//   24   45:aload           6
	//   25   47:astore          5
		break MISSING_BLOCK_LABEL_87;
	//   26   49:goto            87
		obj1;
	//   27   52:astore          6
		StringBuilder stringbuilder = new StringBuilder("Error extracting funding source: ");
	//   28   54:new             #47  <Class StringBuilder>
	//   29   57:dup             
	//   30   58:ldc1            #49  <String "Error extracting funding source: ">
	//   31   60:invokespecial   #52  <Method void StringBuilder(String)>
	//   32   63:astore          7
		stringbuilder.append(((JSONException) (obj1)).getMessage());
	//   33   65:aload           7
	//   34   67:aload           6
	//   35   69:invokevirtual   #55  <Method String JSONException.getMessage()>
	//   36   72:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   37   75:pop             
		Log.w("paypal.sdk", stringbuilder.toString());
	//   38   76:ldc1            #61  <String "paypal.sdk">
	//   39   78:aload           7
	//   40   80:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   41   83:invokestatic    #70  <Method int Log.w(String, String)>
	//   42   86:pop             
		if(obj != null)
	//*  43   87:aload           5
	//*  44   89:ifnull          104
			a.add(obj);
	//   45   92:aload_0         
	//   46   93:getfield        #30  <Field List a>
	//   47   96:aload           5
	//   48   98:invokeinterface #76  <Method boolean List.add(Object)>
	//   49  103:pop             
		i++;
	//   50  104:iload_3         
	//   51  105:iconst_1        
	//   52  106:iadd            
	//   53  107:istore_3        
		if(true) goto _L2; else goto _L1
	//   54  108:goto            17
_L1:
		if(jsonobject != null)
	//*  55  111:aload_2         
	//*  56  112:ifnull          171
		{
			try
			{
				jsonarray = ((JSONArray) (fi.a(jsonobject)));
	//   57  115:aload_2         
	//   58  116:invokestatic    #45  <Method fi fi.a(JSONObject)>
	//   59  119:astore_1        
			}
	//*  60  120:goto            156
			// Misplaced declaration of an exception variable
			catch(JSONArray jsonarray)
	//*  61  123:astore_1        
			{
				jsonobject = ((JSONObject) (new StringBuilder("Error parsing backup funding instrument: ")));
	//   62  124:new             #47  <Class StringBuilder>
	//   63  127:dup             
	//   64  128:ldc1            #78  <String "Error parsing backup funding instrument: ">
	//   65  130:invokespecial   #52  <Method void StringBuilder(String)>
	//   66  133:astore_2        
				((StringBuilder) (jsonobject)).append(((JSONException) (jsonarray)).getMessage());
	//   67  134:aload_2         
	//   68  135:aload_1         
	//   69  136:invokevirtual   #55  <Method String JSONException.getMessage()>
	//   70  139:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   71  142:pop             
				Log.w("paypal.sdk", ((StringBuilder) (jsonobject)).toString());
	//   72  143:ldc1            #61  <String "paypal.sdk">
	//   73  145:aload_2         
	//   74  146:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   75  149:invokestatic    #70  <Method int Log.w(String, String)>
	//   76  152:pop             
				jsonarray = ((JSONArray) (obj1));
	//   77  153:aload           6
	//   78  155:astore_1        
			}
			if(jsonarray != null)
	//*  79  156:aload_1         
	//*  80  157:ifnull          171
				a.add(((Object) (jsonarray)));
	//   81  160:aload_0         
	//   82  161:getfield        #30  <Field List a>
	//   83  164:aload_1         
	//   84  165:invokeinterface #76  <Method boolean List.add(Object)>
	//   85  170:pop             
		}
		b = f();
	//   86  171:aload_0         
	//   87  172:aload_0         
	//   88  173:invokespecial   #81  <Method int f()>
	//   89  176:putfield        #83  <Field int b>
		return;
	//   90  179:return          
	}

	private int f()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		Double double1 = Double.valueOf(0.0D);
	//    2    2:dconst_0        
	//    3    3:invokestatic    #89  <Method Double Double.valueOf(double)>
	//    4    6:astore_3        
		int j = 0;
	//    5    7:iconst_0        
	//    6    8:istore_2        
		while(i < a.size()) 
	//*   7    9:iload_1         
	//*   8   10:aload_0         
	//*   9   11:getfield        #30  <Field List a>
	//*  10   14:invokeinterface #92  <Method int List.size()>
	//*  11   19:icmpge          82
		{
			Double double2 = double1;
	//   12   22:aload_3         
	//   13   23:astore          4
			if(((fi)a.get(i)).d().doubleValue() > double1.doubleValue())
	//*  14   25:aload_0         
	//*  15   26:getfield        #30  <Field List a>
	//*  16   29:iload_1         
	//*  17   30:invokeinterface #96  <Method Object List.get(int)>
	//*  18   35:checkcast       #42  <Class fi>
	//*  19   38:invokevirtual   #100 <Method Double fi.d()>
	//*  20   41:invokevirtual   #104 <Method double Double.doubleValue()>
	//*  21   44:aload_3         
	//*  22   45:invokevirtual   #104 <Method double Double.doubleValue()>
	//*  23   48:dcmpl           
	//*  24   49:ifle            72
			{
				double2 = ((fi)a.get(i)).d();
	//   25   52:aload_0         
	//   26   53:getfield        #30  <Field List a>
	//   27   56:iload_1         
	//   28   57:invokeinterface #96  <Method Object List.get(int)>
	//   29   62:checkcast       #42  <Class fi>
	//   30   65:invokevirtual   #100 <Method Double fi.d()>
	//   31   68:astore          4
				j = i;
	//   32   70:iload_1         
	//   33   71:istore_2        
			}
			i++;
	//   34   72:iload_1         
	//   35   73:iconst_1        
	//   36   74:iadd            
	//   37   75:istore_1        
			double1 = double2;
	//   38   76:aload           4
	//   39   78:astore_3        
		}
	//*  40   79:goto            9
		return j;
	//   41   82:iload_2         
	//   42   83:ireturn         
	}

	public final fi a(int i)
	{
		a.size();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field List a>
	//    2    4:invokeinterface #92  <Method int List.size()>
	//    3    9:pop             
		return (fi)a.get(0);
	//    4   10:aload_0         
	//    5   11:getfield        #30  <Field List a>
	//    6   14:iconst_0        
	//    7   15:invokeinterface #96  <Method Object List.get(int)>
	//    8   20:checkcast       #42  <Class fi>
	//    9   23:areturn         
	}

	public final String a()
	{
		return ((fi)a.get(b)).a();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field List a>
	//    2    4:aload_0         
	//    3    5:getfield        #83  <Field int b>
	//    4    8:invokeinterface #96  <Method Object List.get(int)>
	//    5   13:checkcast       #42  <Class fi>
	//    6   16:invokevirtual   #107 <Method String fi.a()>
	//    7   19:areturn         
	}

	public final boolean b()
	{
		String s = ((fi)a.get(b)).f();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field List a>
	//    2    4:aload_0         
	//    3    5:getfield        #83  <Field int b>
	//    4    8:invokeinterface #96  <Method Object List.get(int)>
	//    5   13:checkcast       #42  <Class fi>
	//    6   16:invokevirtual   #110 <Method String fi.f()>
	//    7   19:astore_1        
		if(cd.b(((CharSequence) (s))))
	//*   8   20:aload_1         
	//*   9   21:invokestatic    #115 <Method boolean cd.b(CharSequence)>
	//*  10   24:ifeq            37
			return s.toUpperCase().equals("DELAYED_TRANSFER");
	//   11   27:aload_1         
	//   12   28:invokevirtual   #120 <Method String String.toUpperCase()>
	//   13   31:ldc1            #122 <String "DELAYED_TRANSFER">
	//   14   33:invokevirtual   #125 <Method boolean String.equals(Object)>
	//   15   36:ireturn         
		else
			return false;
	//   16   37:iconst_0        
	//   17   38:ireturn         
	}

	public final String c()
	{
		if(a.size() == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field List a>
	//*   2    4:invokeinterface #92  <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:icmpne          30
			return ((fi)a.get(0)).b();
	//    5   13:aload_0         
	//    6   14:getfield        #30  <Field List a>
	//    7   17:iconst_0        
	//    8   18:invokeinterface #96  <Method Object List.get(int)>
	//    9   23:checkcast       #42  <Class fi>
	//   10   26:invokevirtual   #128 <Method String fi.b()>
	//   11   29:areturn         
		else
			return fa.a(fc.b);
	//   12   30:getstatic       #133 <Field fc fc.b>
	//   13   33:invokestatic    #138 <Method String fa.a(fc)>
	//   14   36:areturn         
	}

	public final String d()
	{
		return ((fi)a.get(b)).e();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field List a>
	//    2    4:aload_0         
	//    3    5:getfield        #83  <Field int b>
	//    4    8:invokeinterface #96  <Method Object List.get(int)>
	//    5   13:checkcast       #42  <Class fi>
	//    6   16:invokevirtual   #141 <Method String fi.e()>
	//    7   19:areturn         
	}

	public final int e()
	{
		return a.size();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field List a>
	//    2    4:invokeinterface #92  <Method int List.size()>
	//    3    9:ireturn         
	}

	public final Iterator iterator()
	{
		return a.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field List a>
	//    2    4:invokeinterface #145 <Method Iterator List.iterator()>
	//    3    9:areturn         
	}

	private List a;
	private int b;

	static 
	{
		((Class) (com/paypal/android/sdk/fj)).getSimpleName();
	//    0    0:ldc1            #2   <Class fj>
	//    1    2:invokevirtual   #18  <Method String Class.getSimpleName()>
	//    2    5:pop             
	//*   3    6:return          
	}
}
