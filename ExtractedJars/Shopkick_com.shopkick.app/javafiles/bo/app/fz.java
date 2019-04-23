// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import org.json.*;

// Referenced classes of package bo.app:
//			ft

public class fz
{

	public static Object a(String s)
	{
		if(s.trim().startsWith("{"))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #14  <Method String String.trim()>
	//*   2    4:ldc1            #16  <String "{">
	//*   3    6:invokevirtual   #20  <Method boolean String.startsWith(String)>
	//*   4    9:ifeq            21
			return ((Object) (new JSONObject(s)));
	//    5   12:new             #22  <Class JSONObject>
	//    6   15:dup             
	//    7   16:aload_0         
	//    8   17:invokespecial   #26  <Method void JSONObject(String)>
	//    9   20:areturn         
		if(s.trim().startsWith("["))
	//*  10   21:aload_0         
	//*  11   22:invokevirtual   #14  <Method String String.trim()>
	//*  12   25:ldc1            #28  <String "[">
	//*  13   27:invokevirtual   #20  <Method boolean String.startsWith(String)>
	//*  14   30:ifeq            42
			return ((Object) (new JSONArray(s)));
	//   15   33:new             #30  <Class JSONArray>
	//   16   36:dup             
	//   17   37:aload_0         
	//   18   38:invokespecial   #31  <Method void JSONArray(String)>
	//   19   41:areturn         
		if(!s.trim().startsWith("\"") && !s.trim().matches("-?(?:0|[1-9]\\d*)(?:\\.\\d+)?(?:[eE][+-]?\\d+)?"))
	//*  20   42:aload_0         
	//*  21   43:invokevirtual   #14  <Method String String.trim()>
	//*  22   46:ldc1            #33  <String "\"">
	//*  23   48:invokevirtual   #20  <Method boolean String.startsWith(String)>
	//*  24   51:ifne            102
	//*  25   54:aload_0         
	//*  26   55:invokevirtual   #14  <Method String String.trim()>
	//*  27   58:ldc1            #35  <String "-?(?:0|[1-9]\\d*)(?:\\.\\d+)?(?:[eE][+-]?\\d+)?">
	//*  28   60:invokevirtual   #38  <Method boolean String.matches(String)>
	//*  29   63:ifeq            69
	//*  30   66:goto            102
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   31   69:new             #40  <Class StringBuilder>
	//   32   72:dup             
	//   33   73:invokespecial   #43  <Method void StringBuilder()>
	//   34   76:astore_1        
			stringbuilder.append("Unparsable JSON string: ");
	//   35   77:aload_1         
	//   36   78:ldc1            #45  <String "Unparsable JSON string: ">
	//   37   80:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   38   83:pop             
			stringbuilder.append(s);
	//   39   84:aload_1         
	//   40   85:aload_0         
	//   41   86:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   42   89:pop             
			throw new JSONException(stringbuilder.toString());
	//   43   90:new             #51  <Class JSONException>
	//   44   93:dup             
	//   45   94:aload_1         
	//   46   95:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   47   98:invokespecial   #55  <Method void JSONException(String)>
	//   48  101:athrow          
		} else
		{
			return ((Object) (new ft(s) {

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
	//   49  102:new             #6   <Class fz$1>
	//   50  105:dup             
	//   51  106:aload_0         
	//   52  107:invokespecial   #56  <Method void fz$1(String)>
	//   53  110:areturn         
		}
	}
}
