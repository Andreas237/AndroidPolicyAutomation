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
		if(obj instanceof SizeStrategy$Key)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class SizeStrategy$Key>
	//*   2    4:ifeq            27
		{
			obj = ((Object) ((SizeStrategy$Key)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class SizeStrategy$Key>
	//    5   11:astore_1        
			return size == ((SizeStrategy$Key) (obj)).size;
	//    6   12:aload_0         
	//    7   13:getfield        #25  <Field int size>
	//    8   16:aload_1         
	//    9   17:getfield        #25  <Field int size>
	//   10   20:icmpne          25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
		} else
		{
			return false;
	//   15   27:iconst_0        
	//   16   28:ireturn         
		}
	}

	public int hashCode()
	{
		return size;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int size>
	//    2    4:ireturn         
	}

	public void init(int i)
	{
		size = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #25  <Field int size>
	//    3    5:return          
	}

	public void offer()
	{
		pool.offer(((Poolable) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field SizeStrategy$KeyPool pool>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #35  <Method void SizeStrategy$KeyPool.offer(Poolable)>
	//    4    8:return          
	}

	public String toString()
	{
		return SizeStrategy.getBitmapString(size);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int size>
	//    2    4:invokestatic    #41  <Method String SizeStrategy.getBitmapString(int)>
	//    3    7:areturn         
	}

	private final ool pool;
	int size;

	SizeStrategy$Key(ool ool)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		pool = ool;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field SizeStrategy$KeyPool pool>
	//    5    9:return          
	}
}
