// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.bitmap_recycle;


// Referenced classes of package com.bumptech.glide.load.engine.bitmap_recycle:
//			Poolable, LruArrayPool

private static final class LruArrayPool$Key
	implements Poolable
{

	public boolean equals(Object obj)
	{
		boolean flag = obj instanceof LruArrayPool$Key;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class LruArrayPool$Key>
	//    2    4:istore_2        
		boolean flag2 = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		if(flag)
	//*   5    7:iload_2         
	//*   6    8:ifeq            46
		{
			obj = ((Object) ((LruArrayPool$Key)obj));
	//    7   11:aload_1         
	//    8   12:checkcast       #2   <Class LruArrayPool$Key>
	//    9   15:astore_1        
			boolean flag1 = flag2;
	//   10   16:iload_3         
	//   11   17:istore_2        
			if(size == ((LruArrayPool$Key) (obj)).size)
	//*  12   18:aload_0         
	//*  13   19:getfield        #28  <Field int size>
	//*  14   22:aload_1         
	//*  15   23:getfield        #28  <Field int size>
	//*  16   26:icmpne          44
			{
				flag1 = flag2;
	//   17   29:iload_3         
	//   18   30:istore_2        
				if(arrayClass == ((LruArrayPool$Key) (obj)).arrayClass)
	//*  19   31:aload_0         
	//*  20   32:getfield        #30  <Field Class arrayClass>
	//*  21   35:aload_1         
	//*  22   36:getfield        #30  <Field Class arrayClass>
	//*  23   39:if_acmpne       44
					flag1 = true;
	//   24   42:iconst_1        
	//   25   43:istore_2        
			}
			return flag1;
	//   26   44:iload_2         
	//   27   45:ireturn         
		} else
		{
			return false;
	//   28   46:iconst_0        
	//   29   47:ireturn         
		}
	}

	public int hashCode()
	{
		int j = size;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int size>
	//    2    4:istore_2        
		Class class1 = arrayClass;
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field Class arrayClass>
	//    5    9:astore_3        
		int i;
		if(class1 != null)
	//*   6   10:aload_3         
	//*   7   11:ifnull          22
			i = ((Object) (class1)).hashCode();
	//    8   14:aload_3         
	//    9   15:invokevirtual   #34  <Method int Object.hashCode()>
	//   10   18:istore_1        
		else
	//*  11   19:goto            24
			i = 0;
	//   12   22:iconst_0        
	//   13   23:istore_1        
		return j * 31 + i;
	//   14   24:iload_2         
	//   15   25:bipush          31
	//   16   27:imul            
	//   17   28:iload_1         
	//   18   29:iadd            
	//   19   30:ireturn         
	}

	void init(int i, Class class1)
	{
		size = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #28  <Field int size>
		arrayClass = class1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #30  <Field Class arrayClass>
	//    6   10:return          
	}

	public void offer()
	{
		pool.offer(((Poolable) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field LruArrayPool$KeyPool pool>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #44  <Method void LruArrayPool$KeyPool.offer(Poolable)>
	//    4    8:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #48  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #49  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Key{size=");
	//    4    8:aload_1         
	//    5    9:ldc1            #51  <String "Key{size=">
	//    6   11:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(size);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #28  <Field int size>
	//   11   20:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		stringbuilder.append("array=");
	//   13   24:aload_1         
	//   14   25:ldc1            #60  <String "array=">
	//   15   27:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(((Object) (arrayClass)));
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #30  <Field Class arrayClass>
	//   20   36:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
	//   21   39:pop             
		stringbuilder.append('}');
	//   22   40:aload_1         
	//   23   41:bipush          125
	//   24   43:invokevirtual   #66  <Method StringBuilder StringBuilder.append(char)>
	//   25   46:pop             
		return stringbuilder.toString();
	//   26   47:aload_1         
	//   27   48:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   28   51:areturn         
	}

	private Class arrayClass;
	private final ool pool;
	int size;

	LruArrayPool$Key(ool ool)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		pool = ool;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field LruArrayPool$KeyPool pool>
	//    5    9:return          
	}
}
