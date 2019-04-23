// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.bitmap_recycle;


// Referenced classes of package com.bumptech.glide.load.engine.bitmap_recycle:
//			Poolable, SizeStrategy

static final class SizeStrategy$Key
	implements Poolable
{

	public boolean equals(Object obj)
	{
		boolean flag1 = obj instanceof SizeStrategy$Key;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class SizeStrategy$Key>
	//    2    4:istore_3        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		if(flag1)
	//*   5    7:iload_3         
	//*   6    8:ifeq            31
		{
			obj = ((Object) ((SizeStrategy$Key)obj));
	//    7   11:aload_1         
	//    8   12:checkcast       #2   <Class SizeStrategy$Key>
	//    9   15:astore_1        
			if(size == ((SizeStrategy$Key) (obj)).size)
	//*  10   16:aload_0         
	//*  11   17:getfield        #26  <Field int size>
	//*  12   20:aload_1         
	//*  13   21:getfield        #26  <Field int size>
	//*  14   24:icmpne          29
				flag = true;
	//   15   27:iconst_1        
	//   16   28:istore_2        
			return flag;
	//   17   29:iload_2         
	//   18   30:ireturn         
		} else
		{
			return false;
	//   19   31:iconst_0        
	//   20   32:ireturn         
		}
	}

	public int hashCode()
	{
		return size;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int size>
	//    2    4:ireturn         
	}

	public void init(int i)
	{
		size = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #26  <Field int size>
	//    3    5:return          
	}

	public void offer()
	{
		pool.offer(((Poolable) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field SizeStrategy$KeyPool pool>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #36  <Method void SizeStrategy$KeyPool.offer(Poolable)>
	//    4    8:return          
	}

	public String toString()
	{
		return SizeStrategy.getBitmapString(size);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int size>
	//    2    4:invokestatic    #42  <Method String SizeStrategy.getBitmapString(int)>
	//    3    7:areturn         
	}

	private final ool pool;
	int size;

	SizeStrategy$Key(ool ool)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		pool = ool;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field SizeStrategy$KeyPool pool>
	//    5    9:return          
	}
}
