// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			gl

public class gp
{

	public gp()
	{
		this(true, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aconst_null     
	//    3    3:invokespecial   #23  <Method void gp(boolean, String)>
	//    4    6:return          
	}

	private gp(boolean flag, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		f = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #28  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #29  <Method void ArrayList()>
	//    6   12:putfield        #31  <Field List f>
		g = ((List) (new ArrayList()));
	//    7   15:aload_0         
	//    8   16:new             #28  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #29  <Method void ArrayList()>
	//   11   23:putfield        #33  <Field List g>
		h = ((List) (new ArrayList()));
	//   12   26:aload_0         
	//   13   27:new             #28  <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #29  <Method void ArrayList()>
	//   16   34:putfield        #35  <Field List h>
		a = flag;
	//   17   37:aload_0         
	//   18   38:iload_1         
	//   19   39:putfield        #37  <Field boolean a>
		String s1 = s;
	//   20   42:aload_2         
	//   21   43:astore_3        
		if(s == null)
	//*  22   44:aload_2         
	//*  23   45:ifnonnull       51
			s1 = "";
	//   24   48:ldc1            #39  <String "">
	//   25   50:astore_3        
		b = new StringBuilder(s1);
	//   26   51:aload_0         
	//   27   52:new             #41  <Class StringBuilder>
	//   28   55:dup             
	//   29   56:aload_3         
	//   30   57:invokespecial   #44  <Method void StringBuilder(String)>
	//   31   60:putfield        #46  <Field StringBuilder b>
	//   32   63:return          
	}

	private static String a(Object obj)
	{
		if(obj instanceof JSONArray)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #49  <Class JSONArray>
	//*   2    4:ifeq            10
			return "a JSON array";
	//    3    7:ldc1            #51  <String "a JSON array">
	//    4    9:areturn         
		if(obj instanceof JSONObject)
	//*   5   10:aload_0         
	//*   6   11:instanceof      #53  <Class JSONObject>
	//*   7   14:ifeq            20
			return "a JSON object";
	//    8   17:ldc1            #55  <String "a JSON object">
	//    9   19:areturn         
		else
			return obj.toString();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #59  <Method String Object.toString()>
	//   12   24:areturn         
	}

	private String b(String s, Object obj, Object obj1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #41  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #61  <Method void StringBuilder()>
	//    3    7:astore          4
		stringbuilder.append(s);
	//    4    9:aload           4
	//    5   11:aload_1         
	//    6   12:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append("\nExpected: ");
	//    8   16:aload           4
	//    9   18:ldc1            #67  <String "\nExpected: ">
	//   10   20:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		stringbuilder.append(a(obj));
	//   12   24:aload           4
	//   13   26:aload_2         
	//   14   27:invokestatic    #69  <Method String a(Object)>
	//   15   30:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
		stringbuilder.append("\n     got: ");
	//   17   34:aload           4
	//   18   36:ldc1            #71  <String "\n     got: ">
	//   19   38:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   20   41:pop             
		stringbuilder.append(a(obj1));
	//   21   42:aload           4
	//   22   44:aload_3         
	//   23   45:invokestatic    #69  <Method String a(Object)>
	//   24   48:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
		stringbuilder.append("\n");
	//   26   52:aload           4
	//   27   54:ldc1            #73  <String "\n">
	//   28   56:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   29   59:pop             
		return stringbuilder.toString();
	//   30   60:aload           4
	//   31   62:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   32   65:areturn         
	}

	private String c(String s, Object obj)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #41  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #61  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append(s);
	//    4    8:aload_3         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//    7   13:pop             
		stringbuilder.append("\nExpected: ");
	//    8   14:aload_3         
	//    9   15:ldc1            #67  <String "\nExpected: ">
	//   10   17:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		stringbuilder.append(a(obj));
	//   12   21:aload_3         
	//   13   22:aload_2         
	//   14   23:invokestatic    #69  <Method String a(Object)>
	//   15   26:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   16   29:pop             
		stringbuilder.append("\n     but none found\n");
	//   17   30:aload_3         
	//   18   31:ldc1            #77  <String "\n     but none found\n">
	//   19   33:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   20   36:pop             
		return stringbuilder.toString();
	//   21   37:aload_3         
	//   22   38:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   23   41:areturn         
	}

	private String d(String s, Object obj)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #41  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #61  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append(s);
	//    4    8:aload_3         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//    7   13:pop             
		stringbuilder.append("\nUnexpected: ");
	//    8   14:aload_3         
	//    9   15:ldc1            #79  <String "\nUnexpected: ">
	//   10   17:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		stringbuilder.append(a(obj));
	//   12   21:aload_3         
	//   13   22:aload_2         
	//   14   23:invokestatic    #69  <Method String a(Object)>
	//   15   26:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   16   29:pop             
		stringbuilder.append("\n");
	//   17   30:aload_3         
	//   18   31:ldc1            #73  <String "\n">
	//   19   33:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   20   36:pop             
		return stringbuilder.toString();
	//   21   37:aload_3         
	//   22   38:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   23   41:areturn         
	}

	public gp a(String s, Object obj)
	{
		g.add(((Object) (new gl(s, obj, ((Object) (null))))));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field List g>
	//    2    4:new             #82  <Class gl>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #85  <Method void gl(String, Object, Object)>
	//    8   14:invokeinterface #91  <Method boolean List.add(Object)>
	//    9   19:pop             
		a(c(s, obj));
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:invokespecial   #93  <Method String c(String, Object)>
	//   15   27:invokevirtual   #95  <Method void a(String)>
		return this;
	//   16   30:aload_0         
	//   17   31:areturn         
	}

	public gp a(String s, Object obj, Object obj1)
	{
		f.add(((Object) (new gl(s, obj, obj1))));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field List f>
	//    2    4:new             #82  <Class gl>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokespecial   #85  <Method void gl(String, Object, Object)>
	//    8   14:invokeinterface #91  <Method boolean List.add(Object)>
	//    9   19:pop             
		c = s;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #98  <Field String c>
		d = obj;
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:putfield        #100 <Field Object d>
		e = obj1;
	//   16   30:aload_0         
	//   17   31:aload_3         
	//   18   32:putfield        #102 <Field Object e>
		a(b(s, obj, obj1));
	//   19   35:aload_0         
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:aload_2         
	//   23   39:aload_3         
	//   24   40:invokespecial   #104 <Method String b(String, Object, Object)>
	//   25   43:invokevirtual   #95  <Method void a(String)>
		return this;
	//   26   46:aload_0         
	//   27   47:areturn         
	}

	public void a(String s)
	{
		a = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #37  <Field boolean a>
		if(b.length() == 0)
	//*   3    5:aload_0         
	//*   4    6:getfield        #46  <Field StringBuilder b>
	//*   5    9:invokevirtual   #108 <Method int StringBuilder.length()>
	//*   6   12:ifne            25
		{
			b.append(s);
	//    7   15:aload_0         
	//    8   16:getfield        #46  <Field StringBuilder b>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
			return;
	//   12   24:return          
		} else
		{
			StringBuilder stringbuilder = b;
	//   13   25:aload_0         
	//   14   26:getfield        #46  <Field StringBuilder b>
	//   15   29:astore_2        
			stringbuilder.append(" ; ");
	//   16   30:aload_2         
	//   17   31:ldc1            #110 <String " ; ">
	//   18   33:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   19   36:pop             
			stringbuilder.append(s);
	//   20   37:aload_2         
	//   21   38:aload_1         
	//   22   39:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   23   42:pop             
			return;
	//   24   43:return          
		}
	}

	public boolean a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field boolean a>
	//    2    4:ireturn         
	}

	public gp b(String s, Object obj)
	{
		h.add(((Object) (new gl(s, ((Object) (null)), obj))));
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List h>
	//    2    4:new             #82  <Class gl>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:aconst_null     
	//    6   10:aload_2         
	//    7   11:invokespecial   #85  <Method void gl(String, Object, Object)>
	//    8   14:invokeinterface #91  <Method boolean List.add(Object)>
	//    9   19:pop             
		a(d(s, obj));
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:invokespecial   #113 <Method String d(String, Object)>
	//   15   27:invokevirtual   #95  <Method void a(String)>
		return this;
	//   16   30:aload_0         
	//   17   31:areturn         
	}

	public boolean b()
	{
		return a ^ true;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field boolean a>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:ireturn         
	}

	public String c()
	{
		return b.toString();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field StringBuilder b>
	//    2    4:invokevirtual   #74  <Method String StringBuilder.toString()>
	//    3    7:areturn         
	}

	public String toString()
	{
		return b.toString();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field StringBuilder b>
	//    2    4:invokevirtual   #74  <Method String StringBuilder.toString()>
	//    3    7:areturn         
	}

	private boolean a;
	private StringBuilder b;
	private String c;
	private Object d;
	private Object e;
	private final List f;
	private final List g;
	private final List h;
}
