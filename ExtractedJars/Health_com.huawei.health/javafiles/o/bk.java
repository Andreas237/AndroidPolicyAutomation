// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.util.*;

// Referenced classes of package o:
//			bp, bg, bf, bj, 
//			bd, be, bm, bn, 
//			fsu, fsw, bi

public final class bk
{

	public static String c(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		obj = d(obj);
	//    4    6:aload_0         
	//    5    7:invokestatic    #50  <Method Object d(Object)>
	//    6   10:astore_0        
		if(bn.e(obj.getClass()))
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #54  <Method Class Object.getClass()>
	//*   9   15:invokestatic    #59  <Method boolean bn.e(Class)>
	//*  10   18:ifeq            29
			return fsu.a(obj.toString());
	//   11   21:aload_0         
	//   12   22:invokevirtual   #63  <Method String Object.toString()>
	//   13   25:invokestatic    #69  <Method String fsu.a(String)>
	//   14   28:areturn         
		if(((Class) (java/util/Collection)).isAssignableFrom(obj.getClass()))
	//*  15   29:ldc1            #71  <Class Collection>
	//*  16   31:aload_0         
	//*  17   32:invokevirtual   #54  <Method Class Object.getClass()>
	//*  18   35:invokevirtual   #76  <Method boolean Class.isAssignableFrom(Class)>
	//*  19   38:ifeq            56
			return (new fsw(((Collection) ((List)obj)))).toString();
	//   20   41:new             #78  <Class fsw>
	//   21   44:dup             
	//   22   45:aload_0         
	//   23   46:checkcast       #21  <Class List>
	//   24   49:invokespecial   #81  <Method void fsw(Collection)>
	//   25   52:invokevirtual   #82  <Method String fsw.toString()>
	//   26   55:areturn         
		if(((Class) (java/util/Map)).isAssignableFrom(obj.getClass()))
	//*  27   56:ldc1            #84  <Class Map>
	//*  28   58:aload_0         
	//*  29   59:invokevirtual   #54  <Method Class Object.getClass()>
	//*  30   62:invokevirtual   #76  <Method boolean Class.isAssignableFrom(Class)>
	//*  31   65:ifeq            83
			return (new fsu((Map)obj)).toString();
	//   32   68:new             #65  <Class fsu>
	//   33   71:dup             
	//   34   72:aload_0         
	//   35   73:checkcast       #84  <Class Map>
	//   36   76:invokespecial   #87  <Method void fsu(Map)>
	//   37   79:invokevirtual   #88  <Method String fsu.toString()>
	//   38   82:areturn         
		else
			throw new IllegalArgumentException((new StringBuilder("Unsupported Class : ")).append(((Object) (obj.getClass()))).toString());
	//   39   83:new             #90  <Class IllegalArgumentException>
	//   40   86:dup             
	//   41   87:new             #92  <Class StringBuilder>
	//   42   90:dup             
	//   43   91:ldc1            #94  <String "Unsupported Class : ">
	//   44   93:invokespecial   #97  <Method void StringBuilder(String)>
	//   45   96:aload_0         
	//   46   97:invokevirtual   #54  <Method Class Object.getClass()>
	//   47  100:invokevirtual   #101 <Method StringBuilder StringBuilder.append(Object)>
	//   48  103:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   49  106:invokespecial   #103 <Method void IllegalArgumentException(String)>
	//   50  109:athrow          
	}

	public static Object d(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
		for(Iterator iterator = e.iterator(); iterator.hasNext();)
	//*   4    6:getstatic       #16  <Field List e>
	//*   5    9:invokeinterface #107 <Method Iterator List.iterator()>
	//*   6   14:astore_1        
	//*   7   15:aload_1         
	//*   8   16:invokeinterface #113 <Method boolean Iterator.hasNext()>
	//*   9   21:ifeq            64
		{
			Object obj1 = ((Object) ((bi)iterator.next()));
	//   10   24:aload_1         
	//   11   25:invokeinterface #117 <Method Object Iterator.next()>
	//   12   30:checkcast       #119 <Class bi>
	//   13   33:astore_2        
			if(((bi) (obj1)).e(obj.getClass()))
	//*  14   34:aload_2         
	//*  15   35:aload_0         
	//*  16   36:invokevirtual   #54  <Method Class Object.getClass()>
	//*  17   39:invokeinterface #120 <Method boolean bi.e(Class)>
	//*  18   44:ifeq            61
			{
				obj1 = ((bi) (obj1)).b(obj);
	//   19   47:aload_2         
	//   20   48:aload_0         
	//   21   49:invokeinterface #123 <Method Object bi.b(Object)>
	//   22   54:astore_2        
				if(obj1 != null)
	//*  23   55:aload_2         
	//*  24   56:ifnull          61
					return obj1;
	//   25   59:aload_2         
	//   26   60:areturn         
			}
		}

	//*  27   61:goto            15
		throw new IllegalArgumentException((new StringBuilder("Unsupported Class : ")).append(((Object) (obj.getClass()))).toString());
	//   28   64:new             #90  <Class IllegalArgumentException>
	//   29   67:dup             
	//   30   68:new             #92  <Class StringBuilder>
	//   31   71:dup             
	//   32   72:ldc1            #94  <String "Unsupported Class : ">
	//   33   74:invokespecial   #97  <Method void StringBuilder(String)>
	//   34   77:aload_0         
	//   35   78:invokevirtual   #54  <Method Class Object.getClass()>
	//   36   81:invokevirtual   #101 <Method StringBuilder StringBuilder.append(Object)>
	//   37   84:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   38   87:invokespecial   #103 <Method void IllegalArgumentException(String)>
	//   39   90:athrow          
	}

	private static List e;

	static 
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #11  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void ArrayList()>
	//    3    7:astore_0        
		e = ((List) (arraylist));
	//    4    8:aload_0         
	//    5    9:putstatic       #16  <Field List e>
		((List) (arraylist)).add(((Object) (new bp())));
	//    6   12:aload_0         
	//    7   13:new             #18  <Class bp>
	//    8   16:dup             
	//    9   17:invokespecial   #19  <Method void bp()>
	//   10   20:invokeinterface #25  <Method boolean List.add(Object)>
	//   11   25:pop             
		e.add(((Object) (new bg())));
	//   12   26:getstatic       #16  <Field List e>
	//   13   29:new             #27  <Class bg>
	//   14   32:dup             
	//   15   33:invokespecial   #28  <Method void bg()>
	//   16   36:invokeinterface #25  <Method boolean List.add(Object)>
	//   17   41:pop             
		e.add(((Object) (new bf())));
	//   18   42:getstatic       #16  <Field List e>
	//   19   45:new             #30  <Class bf>
	//   20   48:dup             
	//   21   49:invokespecial   #31  <Method void bf()>
	//   22   52:invokeinterface #25  <Method boolean List.add(Object)>
	//   23   57:pop             
		e.add(((Object) (new bj())));
	//   24   58:getstatic       #16  <Field List e>
	//   25   61:new             #33  <Class bj>
	//   26   64:dup             
	//   27   65:invokespecial   #34  <Method void bj()>
	//   28   68:invokeinterface #25  <Method boolean List.add(Object)>
	//   29   73:pop             
		e.add(((Object) (new bd())));
	//   30   74:getstatic       #16  <Field List e>
	//   31   77:new             #36  <Class bd>
	//   32   80:dup             
	//   33   81:invokespecial   #37  <Method void bd()>
	//   34   84:invokeinterface #25  <Method boolean List.add(Object)>
	//   35   89:pop             
		e.add(((Object) (new be())));
	//   36   90:getstatic       #16  <Field List e>
	//   37   93:new             #39  <Class be>
	//   38   96:dup             
	//   39   97:invokespecial   #40  <Method void be()>
	//   40  100:invokeinterface #25  <Method boolean List.add(Object)>
	//   41  105:pop             
		e.add(((Object) (new bm())));
	//   42  106:getstatic       #16  <Field List e>
	//   43  109:new             #42  <Class bm>
	//   44  112:dup             
	//   45  113:invokespecial   #43  <Method void bm()>
	//   46  116:invokeinterface #25  <Method boolean List.add(Object)>
	//   47  121:pop             
	//*  48  122:return          
	}
}
