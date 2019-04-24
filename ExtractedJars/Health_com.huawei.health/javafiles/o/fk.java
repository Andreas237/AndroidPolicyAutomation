// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package o:
//			ei, ed, dd

public class fk
{

	public fk()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static String e(Context context, Map map)
	{
		o/fk;
	//    0    0:ldc1            #2   <Class fk>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		HashMap hashmap = new HashMap();
	//    2    3:new             #13  <Class HashMap>
	//    3    6:dup             
	//    4    7:invokespecial   #14  <Method void HashMap()>
	//    5   10:astore_2        
		((Map) (hashmap)).put("utdid", ((Object) (ei.d(map, "utdid", ""))));
	//    6   11:aload_2         
	//    7   12:ldc1            #16  <String "utdid">
	//    8   14:aload_1         
	//    9   15:ldc1            #16  <String "utdid">
	//   10   17:ldc1            #18  <String "">
	//   11   19:invokestatic    #24  <Method String ei.d(Map, String, String)>
	//   12   22:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   13   27:pop             
		((Map) (hashmap)).put("tid", ((Object) (ei.d(map, "tid", ""))));
	//   14   28:aload_2         
	//   15   29:ldc1            #32  <String "tid">
	//   16   31:aload_1         
	//   17   32:ldc1            #32  <String "tid">
	//   18   34:ldc1            #18  <String "">
	//   19   36:invokestatic    #24  <Method String ei.d(Map, String, String)>
	//   20   39:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   21   44:pop             
		((Map) (hashmap)).put("userId", ((Object) (ei.d(map, "userId", ""))));
	//   22   45:aload_2         
	//   23   46:ldc1            #34  <String "userId">
	//   24   48:aload_1         
	//   25   49:ldc1            #34  <String "userId">
	//   26   51:ldc1            #18  <String "">
	//   27   53:invokestatic    #24  <Method String ei.d(Map, String, String)>
	//   28   56:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   29   61:pop             
		ed.c(context).c(0, ((Map) (hashmap)), ((ed.d) (null)));
	//   30   62:aload_0         
	//   31   63:invokestatic    #40  <Method ed ed.c(Context)>
	//   32   66:iconst_0        
	//   33   67:aload_2         
	//   34   68:aconst_null     
	//   35   69:invokevirtual   #43  <Method void ed.c(int, Map, ed$d)>
		context = ((Context) (dd.a(context)));
	//   36   72:aload_0         
	//   37   73:invokestatic    #49  <Method String dd.a(Context)>
	//   38   76:astore_0        
		o/fk;
	//   39   77:ldc1            #2   <Class fk>
		JVM INSTR monitorexit ;
	//   40   79:monitorexit     
		return ((String) (context));
	//   41   80:aload_0         
	//   42   81:areturn         
		context;
	//   43   82:astore_0        
	//*  44   83:ldc1            #2   <Class fk>
		throw context;
	//   45   85:monitorexit     
	//   46   86:aload_0         
	//   47   87:athrow          
	}
}
