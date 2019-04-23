// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package android.support.v4.util:
//			MapCollections

final class MapCollections$ArrayIterator
	implements Iterator
{

	public boolean hasNext()
	{
		return mIndex < mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int mIndex>
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field int mSize>
	//    4    8:icmpge          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public Object next()
	{
		if(hasNext())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #44  <Method boolean hasNext()>
	//*   2    4:ifeq            40
		{
			Object obj = colGetEntry(mIndex, mOffset);
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field MapCollections this$0>
	//    5   11:aload_0         
	//    6   12:getfield        #40  <Field int mIndex>
	//    7   15:aload_0         
	//    8   16:getfield        #29  <Field int mOffset>
	//    9   19:invokevirtual   #48  <Method Object MapCollections.colGetEntry(int, int)>
	//   10   22:astore_1        
			mIndex = mIndex + 1;
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:getfield        #40  <Field int mIndex>
	//   14   28:iconst_1        
	//   15   29:iadd            
	//   16   30:putfield        #40  <Field int mIndex>
			mCanRemove = true;
	//   17   33:aload_0         
	//   18   34:iconst_1        
	//   19   35:putfield        #27  <Field boolean mCanRemove>
			return obj;
	//   20   38:aload_1         
	//   21   39:areturn         
		} else
		{
			throw new NoSuchElementException();
	//   22   40:new             #50  <Class NoSuchElementException>
	//   23   43:dup             
	//   24   44:invokespecial   #51  <Method void NoSuchElementException()>
	//   25   47:athrow          
		}
	}

	public void remove()
	{
		if(mCanRemove)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field boolean mCanRemove>
	//*   2    4:ifeq            44
		{
			mIndex = mIndex - 1;
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #40  <Field int mIndex>
	//    6   12:iconst_1        
	//    7   13:isub            
	//    8   14:putfield        #40  <Field int mIndex>
			mSize = mSize - 1;
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #35  <Field int mSize>
	//   12   22:iconst_1        
	//   13   23:isub            
	//   14   24:putfield        #35  <Field int mSize>
			mCanRemove = false;
	//   15   27:aload_0         
	//   16   28:iconst_0        
	//   17   29:putfield        #27  <Field boolean mCanRemove>
			colRemoveAt(mIndex);
	//   18   32:aload_0         
	//   19   33:getfield        #22  <Field MapCollections this$0>
	//   20   36:aload_0         
	//   21   37:getfield        #40  <Field int mIndex>
	//   22   40:invokevirtual   #58  <Method void MapCollections.colRemoveAt(int)>
			return;
	//   23   43:return          
		} else
		{
			throw new IllegalStateException();
	//   24   44:new             #60  <Class IllegalStateException>
	//   25   47:dup             
	//   26   48:invokespecial   #61  <Method void IllegalStateException()>
	//   27   51:athrow          
		}
	}

	boolean mCanRemove;
	int mIndex;
	final int mOffset;
	int mSize;
	final MapCollections this$0;

	MapCollections$ArrayIterator(int i)
	{
		this$0 = MapCollections.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field MapCollections this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #25  <Method void Object()>
		mCanRemove = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #27  <Field boolean mCanRemove>
		mOffset = i;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #29  <Field int mOffset>
		mSize = colGetSize();
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #33  <Method int MapCollections.colGetSize()>
	//   14   24:putfield        #35  <Field int mSize>
	//   15   27:return          
	}
}
