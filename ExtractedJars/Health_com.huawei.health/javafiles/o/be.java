// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package o:
//			bl, bi, bk, fsw, 
//			bh

public final class be
	implements bl, bi
{

	public be()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public final Object b(Object obj)
	{
		obj = ((Object) ((Object[])obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #17  <Class Object[]>
	//    2    4:astore_1        
		ArrayList arraylist = new ArrayList();
	//    3    5:new             #19  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void ArrayList()>
	//    6   12:astore          4
		int j = obj.length;
	//    7   14:aload_1         
	//    8   15:arraylength     
	//    9   16:istore_3        
		for(int i = 0; i < j; i++)
	//*  10   17:iconst_0        
	//*  11   18:istore_2        
	//*  12   19:iload_2         
	//*  13   20:iload_3         
	//*  14   21:icmpge          45
			((List) (arraylist)).add(bk.d(((Object) (obj[i]))));
	//   15   24:aload           4
	//   16   26:aload_1         
	//   17   27:iload_2         
	//   18   28:aaload          
	//   19   29:invokestatic    #25  <Method Object bk.d(Object)>
	//   20   32:invokeinterface #31  <Method boolean List.add(Object)>
	//   21   37:pop             

	//   22   38:iload_2         
	//   23   39:iconst_1        
	//   24   40:iadd            
	//   25   41:istore_2        
	//*  26   42:goto            19
		return ((Object) (arraylist));
	//   27   45:aload           4
	//   28   47:areturn         
	}

	public final Object d(Object obj, Type type)
	{
		if(!((Object) (obj.getClass())).equals(o/fsw))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #36  <Method Class Object.getClass()>
	//*   2    4:ldc1            #38  <Class fsw>
	//*   3    6:invokevirtual   #41  <Method boolean Object.equals(Object)>
	//*   4    9:ifne            14
			return ((Object) (null));
	//    5   12:aconst_null     
	//    6   13:areturn         
		obj = ((Object) ((fsw)obj));
	//    7   14:aload_1         
	//    8   15:checkcast       #38  <Class fsw>
	//    9   18:astore_1        
		if(type instanceof GenericArrayType)
	//*  10   19:aload_2         
	//*  11   20:instanceof      #43  <Class GenericArrayType>
	//*  12   23:ifeq            36
			throw new IllegalArgumentException("Does not support generic array!");
	//   13   26:new             #45  <Class IllegalArgumentException>
	//   14   29:dup             
	//   15   30:ldc1            #47  <String "Does not support generic array!">
	//   16   32:invokespecial   #50  <Method void IllegalArgumentException(String)>
	//   17   35:athrow          
		type = ((Type) (((Class)type).getComponentType()));
	//   18   36:aload_2         
	//   19   37:checkcast       #52  <Class Class>
	//   20   40:invokevirtual   #55  <Method Class Class.getComponentType()>
	//   21   43:astore_2        
		int j = ((fsw) (obj)).d();
	//   22   44:aload_1         
	//   23   45:invokevirtual   #58  <Method int fsw.d()>
	//   24   48:istore          4
		Object obj1 = Array.newInstance(((Class) (type)), j);
	//   25   50:aload_2         
	//   26   51:iload           4
	//   27   53:invokestatic    #64  <Method Object Array.newInstance(Class, int)>
	//   28   56:astore          5
		for(int i = 0; i < j; i++)
	//*  29   58:iconst_0        
	//*  30   59:istore_3        
	//*  31   60:iload_3         
	//*  32   61:iload           4
	//*  33   63:icmpge          88
			Array.set(obj1, i, bh.a(((fsw) (obj)).d(i), type));
	//   34   66:aload           5
	//   35   68:iload_3         
	//   36   69:aload_1         
	//   37   70:iload_3         
	//   38   71:invokevirtual   #67  <Method Object fsw.d(int)>
	//   39   74:aload_2         
	//   40   75:invokestatic    #72  <Method Object bh.a(Object, Type)>
	//   41   78:invokestatic    #76  <Method void Array.set(Object, int, Object)>

	//   42   81:iload_3         
	//   43   82:iconst_1        
	//   44   83:iadd            
	//   45   84:istore_3        
	//*  46   85:goto            60
		return obj1;
	//   47   88:aload           5
	//   48   90:areturn         
	}

	public final boolean e(Class class1)
	{
		return class1.isArray();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #82  <Method boolean Class.isArray()>
	//    2    4:ireturn         
	}
}
