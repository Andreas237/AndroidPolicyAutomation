// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import java.util.*;

public final class w extends Enum
{

	private w(String s, int j, String s1)
	{
		super(s, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #102 <Method void Enum(String, int)>
		h = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #104 <Field String h>
	//    7   11:return          
	}

	public static w valueOf(String s)
	{
		return (w)Enum.valueOf(bo/app/w, s);
	//    0    0:ldc1            #2   <Class w>
	//    1    2:aload_0         
	//    2    3:invokestatic    #111 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class w>
	//    4    9:areturn         
	}

	public static w[] values()
	{
		return (w[])((w []) (i)).clone();
	//    0    0:getstatic       #63  <Field w[] i>
	//    1    3:invokevirtual   #117 <Method Object _5B_Lbo.app.w_3B_.clone()>
	//    2    6:checkcast       #114 <Class w[]>
	//    3    9:areturn         
	}

	public String a()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field String h>
	//    2    4:areturn         
	}

	public static final w a;
	public static final w b;
	public static final w c;
	public static final w d;
	public static final w e;
	public static final w f;
	private static final Map g;
	private static final w i[];
	private final String h;

	static 
	{
		a = new w("UNKNOWN", 0, "unknown");
	//    0    0:new             #2   <Class w>
	//    1    3:dup             
	//    2    4:ldc1            #23  <String "UNKNOWN">
	//    3    6:iconst_0        
	//    4    7:ldc1            #25  <String "unknown">
	//    5    9:invokespecial   #29  <Method void w(String, int, String)>
	//    6   12:putstatic       #31  <Field w a>
		b = new w("NONE", 1, "none");
	//    7   15:new             #2   <Class w>
	//    8   18:dup             
	//    9   19:ldc1            #33  <String "NONE">
	//   10   21:iconst_1        
	//   11   22:ldc1            #35  <String "none">
	//   12   24:invokespecial   #29  <Method void w(String, int, String)>
	//   13   27:putstatic       #37  <Field w b>
		c = new w("TWO_G", 2, "2g");
	//   14   30:new             #2   <Class w>
	//   15   33:dup             
	//   16   34:ldc1            #39  <String "TWO_G">
	//   17   36:iconst_2        
	//   18   37:ldc1            #41  <String "2g">
	//   19   39:invokespecial   #29  <Method void w(String, int, String)>
	//   20   42:putstatic       #43  <Field w c>
		d = new w("THREE_G", 3, "3g");
	//   21   45:new             #2   <Class w>
	//   22   48:dup             
	//   23   49:ldc1            #45  <String "THREE_G">
	//   24   51:iconst_3        
	//   25   52:ldc1            #47  <String "3g">
	//   26   54:invokespecial   #29  <Method void w(String, int, String)>
	//   27   57:putstatic       #49  <Field w d>
		e = new w("FOUR_G", 4, "4g");
	//   28   60:new             #2   <Class w>
	//   29   63:dup             
	//   30   64:ldc1            #51  <String "FOUR_G">
	//   31   66:iconst_4        
	//   32   67:ldc1            #53  <String "4g">
	//   33   69:invokespecial   #29  <Method void w(String, int, String)>
	//   34   72:putstatic       #55  <Field w e>
		f = new w("WIFI", 5, "wifi");
	//   35   75:new             #2   <Class w>
	//   36   78:dup             
	//   37   79:ldc1            #57  <String "WIFI">
	//   38   81:iconst_5        
	//   39   82:ldc1            #59  <String "wifi">
	//   40   84:invokespecial   #29  <Method void w(String, int, String)>
	//   41   87:putstatic       #61  <Field w f>
		i = (new w[] {
			a, b, c, d, e, f
		});
	//   42   90:bipush          6
	//   43   92:anewarray       w[]
	//   44   95:dup             
	//   45   96:iconst_0        
	//   46   97:getstatic       #31  <Field w a>
	//   47  100:aastore         
	//   48  101:dup             
	//   49  102:iconst_1        
	//   50  103:getstatic       #37  <Field w b>
	//   51  106:aastore         
	//   52  107:dup             
	//   53  108:iconst_2        
	//   54  109:getstatic       #43  <Field w c>
	//   55  112:aastore         
	//   56  113:dup             
	//   57  114:iconst_3        
	//   58  115:getstatic       #49  <Field w d>
	//   59  118:aastore         
	//   60  119:dup             
	//   61  120:iconst_4        
	//   62  121:getstatic       #55  <Field w e>
	//   63  124:aastore         
	//   64  125:dup             
	//   65  126:iconst_5        
	//   66  127:getstatic       #61  <Field w f>
	//   67  130:aastore         
	//   68  131:putstatic       #63  <Field w[] i>
		g = ((Map) (new HashMap()));
	//   69  134:new             #65  <Class HashMap>
	//   70  137:dup             
	//   71  138:invokespecial   #67  <Method void HashMap()>
	//   72  141:putstatic       #69  <Field Map g>
		w w1;
		for(Iterator iterator = EnumSet.allOf(bo/app/w).iterator(); iterator.hasNext(); g.put(((Object) (w1.a())), ((Object) (w1))))
	//*  73  144:ldc1            #2   <Class w>
	//*  74  146:invokestatic    #75  <Method EnumSet EnumSet.allOf(Class)>
	//*  75  149:invokevirtual   #79  <Method Iterator EnumSet.iterator()>
	//*  76  152:astore_0        
	//*  77  153:aload_0         
	//*  78  154:invokeinterface #85  <Method boolean Iterator.hasNext()>
	//*  79  159:ifeq            189
			w1 = (w)iterator.next();
	//   80  162:aload_0         
	//   81  163:invokeinterface #89  <Method Object Iterator.next()>
	//   82  168:checkcast       #2   <Class w>
	//   83  171:astore_1        

	//   84  172:getstatic       #69  <Field Map g>
	//   85  175:aload_1         
	//   86  176:invokevirtual   #92  <Method String a()>
	//   87  179:aload_1         
	//   88  180:invokeinterface #98  <Method Object Map.put(Object, Object)>
	//   89  185:pop             
	//*  90  186:goto            153
	//*  91  189:return          
	}
}
