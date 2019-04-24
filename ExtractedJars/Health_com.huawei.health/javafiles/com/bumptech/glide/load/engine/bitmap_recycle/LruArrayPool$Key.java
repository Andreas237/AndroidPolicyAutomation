// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.bitmap_recycle;


// Referenced classes of package com.bumptech.glide.load.engine.bitmap_recycle:
//			Poolable, LruArrayPool

static final class LruArrayPool$Key
	implements Poolable
{

	public boolean equals(Object obj)
	{
		if(obj instanceof LruArrayPool$Key)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class LruArrayPool$Key>
	//*   2    4:ifeq            38
		{
			obj = ((Object) ((LruArrayPool$Key)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class LruArrayPool$Key>
	//    5   11:astore_1        
			return size == ((LruArrayPool$Key) (obj)).size && arrayClass == ((LruArrayPool$Key) (obj)).arrayClass;
	//    6   12:aload_0         
	//    7   13:getfield        #28  <Field int size>
	//    8   16:aload_1         
	//    9   17:getfield        #28  <Field int size>
	//   10   20:icmpne          36
	//   11   23:aload_0         
	//   12   24:getfield        #30  <Field Class arrayClass>
	//   13   27:aload_1         
	//   14   28:getfield        #30  <Field Class arrayClass>
	//   15   31:if_acmpne       36
	//   16   34:iconst_1        
	//   17   35:ireturn         
	//   18   36:iconst_0        
	//   19   37:ireturn         
		} else
		{
			return false;
	//   20   38:iconst_0        
	//   21   39:ireturn         
		}
	}

	public int hashCode()
	{
		int j = size;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int size>
	//    2    4:istore_2        
		int i;
		if(arrayClass != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #30  <Field Class arrayClass>
	//*   5    9:ifnull          23
			i = ((Object) (arrayClass)).hashCode();
	//    6   12:aload_0         
	//    7   13:getfield        #30  <Field Class arrayClass>
	//    8   16:invokevirtual   #34  <Method int Object.hashCode()>
	//    9   19:istore_1        
		else
	//*  10   20:goto            25
			i = 0;
	//   11   23:iconst_0        
	//   12   24:istore_1        
		return j * 31 + i;
	//   13   25:iload_2         
	//   14   26:bipush          31
	//   15   28:imul            
	//   16   29:iload_1         
	//   17   30:iadd            
	//   18   31:ireturn         
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
		return (new StringBuilder()).append("Key{size=").append(size).append("array=").append(((Object) (arrayClass))).append('}').toString();
	//    0    0:new             #48  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #49  <Method void StringBuilder()>
	//    3    7:ldc1            #51  <String "Key{size=">
	//    4    9:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #28  <Field int size>
	//    7   16:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
	//    8   19:ldc1            #60  <String "array=">
	//    9   21:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #30  <Field Class arrayClass>
	//   12   28:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
	//   13   31:bipush          125
	//   14   33:invokevirtual   #66  <Method StringBuilder StringBuilder.append(char)>
	//   15   36:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   16   39:areturn         
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
