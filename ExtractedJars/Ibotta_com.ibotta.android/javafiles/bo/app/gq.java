// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.newrelic.agent.android.instrumentation.JSONArrayInstrumentation;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import org.json.JSONException;

// Referenced classes of package bo.app:
//			gk

public class gq
{

	public static Object a(String s)
	{
		if(s.trim().startsWith("{"))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #15  <Method String String.trim()>
	//*   2    4:ldc1            #17  <String "{">
	//*   3    6:invokevirtual   #21  <Method boolean String.startsWith(String)>
	//*   4    9:ifeq            17
			return ((Object) (JSONObjectInstrumentation.init(s)));
	//    5   12:aload_0         
	//    6   13:invokestatic    #27  <Method org.json.JSONObject JSONObjectInstrumentation.init(String)>
	//    7   16:areturn         
		if(s.trim().startsWith("["))
	//*   8   17:aload_0         
	//*   9   18:invokevirtual   #15  <Method String String.trim()>
	//*  10   21:ldc1            #29  <String "[">
	//*  11   23:invokevirtual   #21  <Method boolean String.startsWith(String)>
	//*  12   26:ifeq            34
			return ((Object) (JSONArrayInstrumentation.init(s)));
	//   13   29:aload_0         
	//   14   30:invokestatic    #34  <Method org.json.JSONArray JSONArrayInstrumentation.init(String)>
	//   15   33:areturn         
		if(!s.trim().startsWith("\"") && !s.trim().matches("-?(?:0|[1-9]\\d*)(?:\\.\\d+)?(?:[eE][+-]?\\d+)?"))
	//*  16   34:aload_0         
	//*  17   35:invokevirtual   #15  <Method String String.trim()>
	//*  18   38:ldc1            #36  <String "\"">
	//*  19   40:invokevirtual   #21  <Method boolean String.startsWith(String)>
	//*  20   43:ifne            94
	//*  21   46:aload_0         
	//*  22   47:invokevirtual   #15  <Method String String.trim()>
	//*  23   50:ldc1            #38  <String "-?(?:0|[1-9]\\d*)(?:\\.\\d+)?(?:[eE][+-]?\\d+)?">
	//*  24   52:invokevirtual   #41  <Method boolean String.matches(String)>
	//*  25   55:ifeq            61
	//*  26   58:goto            94
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   27   61:new             #43  <Class StringBuilder>
	//   28   64:dup             
	//   29   65:invokespecial   #47  <Method void StringBuilder()>
	//   30   68:astore_1        
			stringbuilder.append("Unparsable JSON string: ");
	//   31   69:aload_1         
	//   32   70:ldc1            #49  <String "Unparsable JSON string: ">
	//   33   72:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   34   75:pop             
			stringbuilder.append(s);
	//   35   76:aload_1         
	//   36   77:aload_0         
	//   37   78:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   38   81:pop             
			throw new JSONException(stringbuilder.toString());
	//   39   82:new             #55  <Class JSONException>
	//   40   85:dup             
	//   41   86:aload_1         
	//   42   87:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   43   90:invokespecial   #61  <Method void JSONException(String)>
	//   44   93:athrow          
		} else
		{
			return ((Object) (new gk(s) {

				public String a()
				{
					return a;
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field String a>
				//    2    4:areturn         
				}

				final String a;

			
			{
				a = s;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field String a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
));
	//   45   94:new             #6   <Class gq$1>
	//   46   97:dup             
	//   47   98:aload_0         
	//   48   99:invokespecial   #62  <Method void gq$1(String)>
	//   49  102:areturn         
		}
	}
}
