// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package o:
//			dd, dz, ee, ei, 
//			dj, ds, du, dy, 
//			dw, eh, ec, eb

public class ed
{
	public class a
	{

		public String a;
		final ed b;
		public String c;
		public String d;
		public String e;

		public a()
		{
			b = ed.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field ed b>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
		//    5    9:return          
		}
	}

	public static interface d
	{

		public abstract void a(a a1);
	}


	private ed(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		c = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field Context c>
	//    5    9:return          
	}

	static Context b(ed ed1)
	{
		return ed1.c;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Context c>
	//    2    4:areturn         
	}

	public static ed c(Context context)
	{
		if(d != null)
			break MISSING_BLOCK_LABEL_39;
	//    0    0:getstatic       #31  <Field ed d>
	//    1    3:ifnonnull       39
		Object obj = e;
	//    2    6:getstatic       #22  <Field Object e>
	//    3    9:astore_1        
		obj;
	//    4   10:aload_1         
		JVM INSTR monitorenter ;
	//    5   11:monitorenter    
		if(d == null)
	//*   6   12:getstatic       #31  <Field ed d>
	//*   7   15:ifnonnull       29
			d = new ed(context);
	//    8   18:new             #2   <Class ed>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:invokespecial   #33  <Method void ed(Context)>
	//   12   26:putstatic       #31  <Field ed d>
		obj;
	//   13   29:aload_1         
		JVM INSTR monitorexit ;
	//   14   30:monitorexit     
		break MISSING_BLOCK_LABEL_39;
	//   15   31:goto            39
		context;
	//   16   34:astore_0        
	//*  17   35:aload_1         
		throw context;
	//   18   36:monitorexit     
	//   19   37:aload_0         
	//   20   38:athrow          
		return d;
	//   21   39:getstatic       #31  <Field ed d>
	//   22   42:areturn         
	}

	public a b()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		a a1 = new a();
	//    2    2:new             #6   <Class ed$a>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:invokespecial   #39  <Method void ed$a(ed)>
	//    6   10:astore_2        
		boolean flag = false;
	//    7   11:iconst_0        
	//    8   12:istore_1        
		a1.d = dd.c(c, "");
	//    9   13:aload_2         
	//   10   14:aload_0         
	//   11   15:getfield        #26  <Field Context c>
	//   12   18:ldc1            #41  <String "">
	//   13   20:invokestatic    #46  <Method String dd.c(Context, String)>
	//   14   23:putfield        #49  <Field String ed$a.d>
		a1.c = dz.h(c);
	//   15   26:aload_2         
	//   16   27:aload_0         
	//   17   28:getfield        #26  <Field Context c>
	//   18   31:invokestatic    #55  <Method String dz.h(Context)>
	//   19   34:putfield        #57  <Field String ed$a.c>
		a1.e = dd.a(c);
	//   20   37:aload_2         
	//   21   38:aload_0         
	//   22   39:getfield        #26  <Field Context c>
	//   23   42:invokestatic    #59  <Method String dd.a(Context)>
	//   24   45:putfield        #61  <Field String ed$a.e>
		a1.a = ee.c(c);
	//   25   48:aload_2         
	//   26   49:aload_0         
	//   27   50:getfield        #26  <Field Context c>
	//   28   53:invokestatic    #65  <Method String ee.c(Context)>
	//   29   56:putfield        #67  <Field String ed$a.a>
		if(ei.b(a1.e))
	//*  30   59:aload_2         
	//*  31   60:getfield        #61  <Field String ed$a.e>
	//*  32   63:invokestatic    #72  <Method boolean ei.b(String)>
	//*  33   66:ifeq            71
			flag = true;
	//   34   69:iconst_1        
	//   35   70:istore_1        
		if(flag)
			break MISSING_BLOCK_LABEL_95;
	//   36   71:iload_1         
	//   37   72:ifne            95
		if(!ei.b(a1.d) && !ei.b(a1.c))
			break MISSING_BLOCK_LABEL_108;
	//   38   75:aload_2         
	//   39   76:getfield        #49  <Field String ed$a.d>
	//   40   79:invokestatic    #72  <Method boolean ei.b(String)>
	//   41   82:ifne            95
	//   42   85:aload_2         
	//   43   86:getfield        #57  <Field String ed$a.c>
	//   44   89:invokestatic    #72  <Method boolean ei.b(String)>
	//   45   92:ifeq            108
		c(0, ((Map) (new HashMap())), ((d) (null)));
	//   46   95:aload_0         
	//   47   96:iconst_0        
	//   48   97:new             #74  <Class HashMap>
	//   49  100:dup             
	//   50  101:invokespecial   #75  <Method void HashMap()>
	//   51  104:aconst_null     
	//   52  105:invokevirtual   #78  <Method void c(int, Map, ed$d)>
_L2:
		this;
	//   53  108:aload_0         
		JVM INSTR monitorexit ;
	//   54  109:monitorexit     
		return a1;
	//   55  110:aload_2         
	//   56  111:areturn         
		Exception exception;
		exception;
	//   57  112:astore_2        
	//*  58  113:aload_0         
		throw exception;
	//   59  114:monitorexit     
	//   60  115:aload_2         
	//   61  116:athrow          
		Throwable throwable;
		throwable;
	//   62  117:astore_3        
		if(true) goto _L2; else goto _L1
_L1:
	//*  63  118:goto            108
	}

	public void c(int i, Map map, d d1)
	{
		dj.d().c(i);
	//    0    0:invokestatic    #83  <Method dj dj.d()>
	//    1    3:iload_1         
	//    2    4:invokevirtual   #86  <Method void dj.c(int)>
		Object obj = ((Object) (dz.e(c)));
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field Context c>
	//    5   11:invokestatic    #88  <Method String dz.e(Context)>
	//    6   14:astore          4
		String s = dj.d().c();
	//    7   16:invokestatic    #83  <Method dj dj.d()>
	//    8   19:invokevirtual   #91  <Method String dj.c()>
	//    9   22:astore          5
		if(ei.a(((String) (obj))) && !ei.e(((String) (obj)), s))
	//*  10   24:aload           4
	//*  11   26:invokestatic    #93  <Method boolean ei.a(String)>
	//*  12   29:ifeq            66
	//*  13   32:aload           4
	//*  14   34:aload           5
	//*  15   36:invokestatic    #96  <Method boolean ei.e(String, String)>
	//*  16   39:ifne            66
		{
			ds.a(c);
	//   17   42:aload_0         
	//   18   43:getfield        #26  <Field Context c>
	//   19   46:invokestatic    #100 <Method void ds.a(Context)>
			du.c(c);
	//   20   49:aload_0         
	//   21   50:getfield        #26  <Field Context c>
	//   22   53:invokestatic    #104 <Method void du.c(Context)>
			dy.c(c);
	//   23   56:aload_0         
	//   24   57:getfield        #26  <Field Context c>
	//   25   60:invokestatic    #107 <Method void dy.c(Context)>
			dw.g();
	//   26   63:invokestatic    #112 <Method void dw.g()>
		}
		if(!ei.e(((String) (obj)), s))
	//*  27   66:aload           4
	//*  28   68:aload           5
	//*  29   70:invokestatic    #96  <Method boolean ei.e(String, String)>
	//*  30   73:ifne            85
			dz.e(c, s);
	//   31   76:aload_0         
	//   32   77:getfield        #26  <Field Context c>
	//   33   80:aload           5
	//   34   82:invokestatic    #115 <Method void dz.e(Context, String)>
		obj = ((Object) (ei.d(map, "utdid", "")));
	//   35   85:aload_2         
	//   36   86:ldc1            #117 <String "utdid">
	//   37   88:ldc1            #41  <String "">
	//   38   90:invokestatic    #120 <Method String ei.d(Map, String, String)>
	//   39   93:astore          4
		s = ei.d(map, "tid", "");
	//   40   95:aload_2         
	//   41   96:ldc1            #122 <String "tid">
	//   42   98:ldc1            #41  <String "">
	//   43  100:invokestatic    #120 <Method String ei.d(Map, String, String)>
	//   44  103:astore          5
		String s1 = ei.d(map, "userId", "");
	//   45  105:aload_2         
	//   46  106:ldc1            #124 <String "userId">
	//   47  108:ldc1            #41  <String "">
	//   48  110:invokestatic    #120 <Method String ei.d(Map, String, String)>
	//   49  113:astore          6
		map = ((Map) (obj));
	//   50  115:aload           4
	//   51  117:astore_2        
		if(ei.b(((String) (obj))))
	//*  52  118:aload           4
	//*  53  120:invokestatic    #72  <Method boolean ei.b(String)>
	//*  54  123:ifeq            134
			map = ((Map) (eh.b(c)));
	//   55  126:aload_0         
	//   56  127:getfield        #26  <Field Context c>
	//   57  130:invokestatic    #128 <Method String eh.b(Context)>
	//   58  133:astore_2        
		obj = ((Object) (new HashMap()));
	//   59  134:new             #74  <Class HashMap>
	//   60  137:dup             
	//   61  138:invokespecial   #75  <Method void HashMap()>
	//   62  141:astore          4
		((Map) (obj)).put("utdid", ((Object) (map)));
	//   63  143:aload           4
	//   64  145:ldc1            #117 <String "utdid">
	//   65  147:aload_2         
	//   66  148:invokeinterface #134 <Method Object Map.put(Object, Object)>
	//   67  153:pop             
		((Map) (obj)).put("tid", ((Object) (s)));
	//   68  154:aload           4
	//   69  156:ldc1            #122 <String "tid">
	//   70  158:aload           5
	//   71  160:invokeinterface #134 <Method Object Map.put(Object, Object)>
	//   72  165:pop             
		((Map) (obj)).put("userId", ((Object) (s1)));
	//   73  166:aload           4
	//   74  168:ldc1            #124 <String "userId">
	//   75  170:aload           6
	//   76  172:invokeinterface #134 <Method Object Map.put(Object, Object)>
	//   77  177:pop             
		((Map) (obj)).put("appName", "");
	//   78  178:aload           4
	//   79  180:ldc1            #136 <String "appName">
	//   80  182:ldc1            #41  <String "">
	//   81  184:invokeinterface #134 <Method Object Map.put(Object, Object)>
	//   82  189:pop             
		((Map) (obj)).put("appKeyClient", "");
	//   83  190:aload           4
	//   84  192:ldc1            #138 <String "appKeyClient">
	//   85  194:ldc1            #41  <String "">
	//   86  196:invokeinterface #134 <Method Object Map.put(Object, Object)>
	//   87  201:pop             
		((Map) (obj)).put("appchannel", "");
	//   88  202:aload           4
	//   89  204:ldc1            #140 <String "appchannel">
	//   90  206:ldc1            #41  <String "">
	//   91  208:invokeinterface #134 <Method Object Map.put(Object, Object)>
	//   92  213:pop             
		((Map) (obj)).put("rpcVersion", "8");
	//   93  214:aload           4
	//   94  216:ldc1            #142 <String "rpcVersion">
	//   95  218:ldc1            #144 <String "8">
	//   96  220:invokeinterface #134 <Method Object Map.put(Object, Object)>
	//   97  225:pop             
		ec.d().c(((Runnable) (new eb(this, ((Map) (obj)), d1))));
	//   98  226:invokestatic    #149 <Method ec ec.d()>
	//   99  229:new             #151 <Class eb>
	//  100  232:dup             
	//  101  233:aload_0         
	//  102  234:aload           4
	//  103  236:aload_3         
	//  104  237:invokespecial   #154 <Method void eb(ed, Map, ed$d)>
	//  105  240:invokevirtual   #157 <Method void ec.c(Runnable)>
	//  106  243:return          
	}

	private static ed d;
	private static Object e = new Object();
	private Context c;

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void Object()>
	//    3    7:putstatic       #22  <Field Object e>
	//*   4   10:return          
	}
}
