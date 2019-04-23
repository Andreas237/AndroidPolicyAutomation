// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.b.a.a;

import java.nio.ByteBuffer;

// Referenced classes of package com.b.a.a:
//			v, aq, av, aw

final class ah extends v
{

	ah(String s, int i)
	{
		super(s, i, ((w) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #9   <Method void v(String, int, w)>
	//    5    7:return          
	}

	public int a(Object obj)
	{
		java.util.Map.Entry entry = (java.util.Map.Entry)obj;
	//    0    0:aload_1         
	//    1    1:checkcast       #15  <Class java.util.Map$Entry>
	//    2    4:astore_2        
		if(entry.getValue() == null)
	//*   3    5:aload_2         
	//*   4    6:invokeinterface #19  <Method Object java.util.Map$Entry.getValue()>
	//*   5   11:ifnonnull       19
			obj = null;
	//    6   14:aconst_null     
	//    7   15:astore_1        
		else
	//*   8   16:goto            29
			obj = ((Object) (entry.getValue().getClass()));
	//    9   19:aload_2         
	//   10   20:invokeinterface #19  <Method Object java.util.Map$Entry.getValue()>
	//   11   25:invokevirtual   #25  <Method Class Object.getClass()>
	//   12   28:astore_1        
		obj = ((Object) (aq.a(((Class) (obj)))));
	//   13   29:aload_1         
	//   14   30:invokestatic    #30  <Method aq aq.a(Class)>
	//   15   33:astore_1        
		return av.c.b().a(entry.getKey()) + ((aq) (obj)).c().a(entry.getValue()) + 1;
	//   16   34:getstatic       #36  <Field av av.c>
	//   17   37:invokevirtual   #40  <Method aw av.b()>
	//   18   40:aload_2         
	//   19   41:invokeinterface #43  <Method Object java.util.Map$Entry.getKey()>
	//   20   46:invokeinterface #47  <Method int aw.a(Object)>
	//   21   51:aload_1         
	//   22   52:invokevirtual   #49  <Method aw aq.c()>
	//   23   55:aload_2         
	//   24   56:invokeinterface #19  <Method Object java.util.Map$Entry.getValue()>
	//   25   61:invokeinterface #47  <Method int aw.a(Object)>
	//   26   66:iadd            
	//   27   67:iconst_1        
	//   28   68:iadd            
	//   29   69:ireturn         
	}

	public void b(ByteBuffer bytebuffer, Object obj)
	{
		java.util.Map.Entry entry = (java.util.Map.Entry)obj;
	//    0    0:aload_2         
	//    1    1:checkcast       #15  <Class java.util.Map$Entry>
	//    2    4:astore_3        
		if(entry.getValue() == null)
	//*   3    5:aload_3         
	//*   4    6:invokeinterface #19  <Method Object java.util.Map$Entry.getValue()>
	//*   5   11:ifnonnull       19
			obj = null;
	//    6   14:aconst_null     
	//    7   15:astore_2        
		else
	//*   8   16:goto            29
			obj = ((Object) (entry.getValue().getClass()));
	//    9   19:aload_3         
	//   10   20:invokeinterface #19  <Method Object java.util.Map$Entry.getValue()>
	//   11   25:invokevirtual   #25  <Method Class Object.getClass()>
	//   12   28:astore_2        
		obj = ((Object) (aq.a(((Class) (obj)))));
	//   13   29:aload_2         
	//   14   30:invokestatic    #30  <Method aq aq.a(Class)>
	//   15   33:astore_2        
		bytebuffer.put(((aq) (obj)).a());
	//   16   34:aload_1         
	//   17   35:aload_2         
	//   18   36:invokevirtual   #54  <Method byte aq.a()>
	//   19   39:invokevirtual   #60  <Method ByteBuffer ByteBuffer.put(byte)>
	//   20   42:pop             
		av.c.b().a(bytebuffer, entry.getKey());
	//   21   43:getstatic       #36  <Field av av.c>
	//   22   46:invokevirtual   #40  <Method aw av.b()>
	//   23   49:aload_1         
	//   24   50:aload_3         
	//   25   51:invokeinterface #43  <Method Object java.util.Map$Entry.getKey()>
	//   26   56:invokeinterface #62  <Method void aw.a(ByteBuffer, Object)>
		((aq) (obj)).c().a(bytebuffer, entry.getValue());
	//   27   61:aload_2         
	//   28   62:invokevirtual   #49  <Method aw aq.c()>
	//   29   65:aload_1         
	//   30   66:aload_3         
	//   31   67:invokeinterface #19  <Method Object java.util.Map$Entry.getValue()>
	//   32   72:invokeinterface #62  <Method void aw.a(ByteBuffer, Object)>
	//   33   77:return          
	}
}
