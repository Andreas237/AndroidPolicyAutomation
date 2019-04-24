// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.util;

import java.util.Iterator;

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
		Object obj = colGetEntry(mIndex, mOffset);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field MapCollections this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #40  <Field int mIndex>
	//    4    8:aload_0         
	//    5    9:getfield        #29  <Field int mOffset>
	//    6   12:invokevirtual   #46  <Method Object MapCollections.colGetEntry(int, int)>
	//    7   15:astore_1        
		mIndex = mIndex + 1;
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #40  <Field int mIndex>
	//   11   21:iconst_1        
	//   12   22:iadd            
	//   13   23:putfield        #40  <Field int mIndex>
		mCanRemove = true;
	//   14   26:aload_0         
	//   15   27:iconst_1        
	//   16   28:putfield        #27  <Field boolean mCanRemove>
		return obj;
	//   17   31:aload_1         
	//   18   32:areturn         
	}

	public void remove()
	{
		if(!mCanRemove)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field boolean mCanRemove>
	//*   2    4:ifne            15
		{
			throw new IllegalStateException();
	//    3    7:new             #51  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:invokespecial   #52  <Method void IllegalStateException()>
	//    6   14:athrow          
		} else
		{
			mIndex = mIndex - 1;
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #40  <Field int mIndex>
	//   10   20:iconst_1        
	//   11   21:isub            
	//   12   22:putfield        #40  <Field int mIndex>
			mSize = mSize - 1;
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #35  <Field int mSize>
	//   16   30:iconst_1        
	//   17   31:isub            
	//   18   32:putfield        #35  <Field int mSize>
			mCanRemove = false;
	//   19   35:aload_0         
	//   20   36:iconst_0        
	//   21   37:putfield        #27  <Field boolean mCanRemove>
			colRemoveAt(mIndex);
	//   22   40:aload_0         
	//   23   41:getfield        #22  <Field MapCollections this$0>
	//   24   44:aload_0         
	//   25   45:getfield        #40  <Field int mIndex>
	//   26   48:invokevirtual   #56  <Method void MapCollections.colRemoveAt(int)>
			return;
	//   27   51:return          
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
