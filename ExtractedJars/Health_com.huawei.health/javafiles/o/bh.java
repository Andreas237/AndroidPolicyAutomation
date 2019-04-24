// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.lang.reflect.Type;
import java.util.*;

// Referenced classes of package o:
//			bp, bg, bf, bj, 
//			bo, bd, be, bm, 
//			bl, bn, fsw, fsu

public final class bh
{

	public static final Object a(Object obj, Type type)
	{
		for(Iterator iterator = d.iterator(); iterator.hasNext();)
	//*   0    0:getstatic       #16  <Field List d>
	//*   1    3:invokeinterface #53  <Method Iterator List.iterator()>
	//*   2    8:astore_2        
	//*   3    9:aload_2         
	//*   4   10:invokeinterface #59  <Method boolean Iterator.hasNext()>
	//*   5   15:ifeq            59
		{
			Object obj1 = ((Object) ((bl)iterator.next()));
	//    6   18:aload_2         
	//    7   19:invokeinterface #63  <Method Object Iterator.next()>
	//    8   24:checkcast       #65  <Class bl>
	//    9   27:astore_3        
			if(((bl) (obj1)).e(bn.b(type)))
	//*  10   28:aload_3         
	//*  11   29:aload_1         
	//*  12   30:invokestatic    #71  <Method Class bn.b(Type)>
	//*  13   33:invokeinterface #75  <Method boolean bl.e(Class)>
	//*  14   38:ifeq            56
			{
				obj1 = ((bl) (obj1)).d(obj, type);
	//   15   41:aload_3         
	//   16   42:aload_0         
	//   17   43:aload_1         
	//   18   44:invokeinterface #77  <Method Object bl.d(Object, Type)>
	//   19   49:astore_3        
				if(obj1 != null)
	//*  20   50:aload_3         
	//*  21   51:ifnull          56
					return obj1;
	//   22   54:aload_3         
	//   23   55:areturn         
			}
		}

	//*  24   56:goto            9
		return ((Object) (null));
	//   25   59:aconst_null     
	//   26   60:areturn         
	}

	public static final Object e(String s, Type type)
	{
		if(s == null || s.length() == 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          11
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #86  <Method int String.length()>
	//*   4    8:ifne            13
			return ((Object) (null));
	//    5   11:aconst_null     
	//    6   12:areturn         
		s = s.trim();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #90  <Method String String.trim()>
	//    9   17:astore_0        
		if(s.startsWith("[") && s.endsWith("]"))
	//*  10   18:aload_0         
	//*  11   19:ldc1            #92  <String "[">
	//*  12   21:invokevirtual   #96  <Method boolean String.startsWith(String)>
	//*  13   24:ifeq            49
	//*  14   27:aload_0         
	//*  15   28:ldc1            #98  <String "]">
	//*  16   30:invokevirtual   #101 <Method boolean String.endsWith(String)>
	//*  17   33:ifeq            49
			return a(((Object) (new fsw(s))), type);
	//   18   36:new             #103 <Class fsw>
	//   19   39:dup             
	//   20   40:aload_0         
	//   21   41:invokespecial   #106 <Method void fsw(String)>
	//   22   44:aload_1         
	//   23   45:invokestatic    #108 <Method Object a(Object, Type)>
	//   24   48:areturn         
		if(s.startsWith("{") && s.endsWith("}"))
	//*  25   49:aload_0         
	//*  26   50:ldc1            #110 <String "{">
	//*  27   52:invokevirtual   #96  <Method boolean String.startsWith(String)>
	//*  28   55:ifeq            80
	//*  29   58:aload_0         
	//*  30   59:ldc1            #112 <String "}">
	//*  31   61:invokevirtual   #101 <Method boolean String.endsWith(String)>
	//*  32   64:ifeq            80
			return a(((Object) (new fsu(s))), type);
	//   33   67:new             #114 <Class fsu>
	//   34   70:dup             
	//   35   71:aload_0         
	//   36   72:invokespecial   #115 <Method void fsu(String)>
	//   37   75:aload_1         
	//   38   76:invokestatic    #108 <Method Object a(Object, Type)>
	//   39   79:areturn         
		else
			return a(((Object) (s)), type);
	//   40   80:aload_0         
	//   41   81:aload_1         
	//   42   82:invokestatic    #108 <Method Object a(Object, Type)>
	//   43   85:areturn         
	}

	static List d;

	static 
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #11  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void ArrayList()>
	//    3    7:astore_0        
		d = ((List) (arraylist));
	//    4    8:aload_0         
	//    5    9:putstatic       #16  <Field List d>
		((List) (arraylist)).add(((Object) (new bp())));
	//    6   12:aload_0         
	//    7   13:new             #18  <Class bp>
	//    8   16:dup             
	//    9   17:invokespecial   #19  <Method void bp()>
	//   10   20:invokeinterface #25  <Method boolean List.add(Object)>
	//   11   25:pop             
		d.add(((Object) (new bg())));
	//   12   26:getstatic       #16  <Field List d>
	//   13   29:new             #27  <Class bg>
	//   14   32:dup             
	//   15   33:invokespecial   #28  <Method void bg()>
	//   16   36:invokeinterface #25  <Method boolean List.add(Object)>
	//   17   41:pop             
		d.add(((Object) (new bf())));
	//   18   42:getstatic       #16  <Field List d>
	//   19   45:new             #30  <Class bf>
	//   20   48:dup             
	//   21   49:invokespecial   #31  <Method void bf()>
	//   22   52:invokeinterface #25  <Method boolean List.add(Object)>
	//   23   57:pop             
		d.add(((Object) (new bj())));
	//   24   58:getstatic       #16  <Field List d>
	//   25   61:new             #33  <Class bj>
	//   26   64:dup             
	//   27   65:invokespecial   #34  <Method void bj()>
	//   28   68:invokeinterface #25  <Method boolean List.add(Object)>
	//   29   73:pop             
		d.add(((Object) (new bo())));
	//   30   74:getstatic       #16  <Field List d>
	//   31   77:new             #36  <Class bo>
	//   32   80:dup             
	//   33   81:invokespecial   #37  <Method void bo()>
	//   34   84:invokeinterface #25  <Method boolean List.add(Object)>
	//   35   89:pop             
		d.add(((Object) (new bd())));
	//   36   90:getstatic       #16  <Field List d>
	//   37   93:new             #39  <Class bd>
	//   38   96:dup             
	//   39   97:invokespecial   #40  <Method void bd()>
	//   40  100:invokeinterface #25  <Method boolean List.add(Object)>
	//   41  105:pop             
		d.add(((Object) (new be())));
	//   42  106:getstatic       #16  <Field List d>
	//   43  109:new             #42  <Class be>
	//   44  112:dup             
	//   45  113:invokespecial   #43  <Method void be()>
	//   46  116:invokeinterface #25  <Method boolean List.add(Object)>
	//   47  121:pop             
		d.add(((Object) (new bm())));
	//   48  122:getstatic       #16  <Field List d>
	//   49  125:new             #45  <Class bm>
	//   50  128:dup             
	//   51  129:invokespecial   #46  <Method void bm()>
	//   52  132:invokeinterface #25  <Method boolean List.add(Object)>
	//   53  137:pop             
	//*  54  138:return          
	}
}
