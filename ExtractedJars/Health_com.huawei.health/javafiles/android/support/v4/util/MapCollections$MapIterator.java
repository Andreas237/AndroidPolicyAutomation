// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.util;

import java.util.Iterator;

// Referenced classes of package android.support.v4.util:
//			MapCollections, ContainerHelpers

final class MapCollections$MapIterator
	implements Iterator, java.util.Map.Entry
{

	public final boolean equals(Object obj)
	{
		if(!mEntryValid)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field boolean mEntryValid>
	//*   2    4:ifne            17
			throw new IllegalStateException("This container does not support retaining Map.Entry objects");
	//    3    7:new             #41  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #43  <String "This container does not support retaining Map.Entry objects">
	//    6   13:invokespecial   #46  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		if(!(obj instanceof java.util.Map.Entry))
	//*   8   17:aload_1         
	//*   9   18:instanceof      #9   <Class java.util.Map$Entry>
	//*  10   21:ifne            26
			return false;
	//   11   24:iconst_0        
	//   12   25:ireturn         
		obj = ((Object) ((java.util.Map.Entry)obj));
	//   13   26:aload_1         
	//   14   27:checkcast       #9   <Class java.util.Map$Entry>
	//   15   30:astore_1        
		return ContainerHelpers.equal(((java.util.Map.Entry) (obj)).getKey(), colGetEntry(mIndex, 0)) && ContainerHelpers.equal(((java.util.Map.Entry) (obj)).getValue(), colGetEntry(mIndex, 1));
	//   16   31:aload_1         
	//   17   32:invokeinterface #50  <Method Object java.util.Map$Entry.getKey()>
	//   18   37:aload_0         
	//   19   38:getfield        #23  <Field MapCollections this$0>
	//   20   41:aload_0         
	//   21   42:getfield        #36  <Field int mIndex>
	//   22   45:iconst_0        
	//   23   46:invokevirtual   #54  <Method Object MapCollections.colGetEntry(int, int)>
	//   24   49:invokestatic    #60  <Method boolean ContainerHelpers.equal(Object, Object)>
	//   25   52:ifeq            81
	//   26   55:aload_1         
	//   27   56:invokeinterface #63  <Method Object java.util.Map$Entry.getValue()>
	//   28   61:aload_0         
	//   29   62:getfield        #23  <Field MapCollections this$0>
	//   30   65:aload_0         
	//   31   66:getfield        #36  <Field int mIndex>
	//   32   69:iconst_1        
	//   33   70:invokevirtual   #54  <Method Object MapCollections.colGetEntry(int, int)>
	//   34   73:invokestatic    #60  <Method boolean ContainerHelpers.equal(Object, Object)>
	//   35   76:ifeq            81
	//   36   79:iconst_1        
	//   37   80:ireturn         
	//   38   81:iconst_0        
	//   39   82:ireturn         
	}

	public Object getKey()
	{
		if(!mEntryValid)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field boolean mEntryValid>
	//*   2    4:ifne            17
			throw new IllegalStateException("This container does not support retaining Map.Entry objects");
	//    3    7:new             #41  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #43  <String "This container does not support retaining Map.Entry objects">
	//    6   13:invokespecial   #46  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		else
			return colGetEntry(mIndex, 0);
	//    8   17:aload_0         
	//    9   18:getfield        #23  <Field MapCollections this$0>
	//   10   21:aload_0         
	//   11   22:getfield        #36  <Field int mIndex>
	//   12   25:iconst_0        
	//   13   26:invokevirtual   #54  <Method Object MapCollections.colGetEntry(int, int)>
	//   14   29:areturn         
	}

	public Object getValue()
	{
		if(!mEntryValid)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field boolean mEntryValid>
	//*   2    4:ifne            17
			throw new IllegalStateException("This container does not support retaining Map.Entry objects");
	//    3    7:new             #41  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #43  <String "This container does not support retaining Map.Entry objects">
	//    6   13:invokespecial   #46  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		else
			return colGetEntry(mIndex, 1);
	//    8   17:aload_0         
	//    9   18:getfield        #23  <Field MapCollections this$0>
	//   10   21:aload_0         
	//   11   22:getfield        #36  <Field int mIndex>
	//   12   25:iconst_1        
	//   13   26:invokevirtual   #54  <Method Object MapCollections.colGetEntry(int, int)>
	//   14   29:areturn         
	}

	public boolean hasNext()
	{
		return mIndex < mEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int mIndex>
	//    2    4:aload_0         
	//    3    5:getfield        #34  <Field int mEnd>
	//    4    8:icmpge          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public final int hashCode()
	{
		if(!mEntryValid)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field boolean mEntryValid>
	//*   2    4:ifne            17
			throw new IllegalStateException("This container does not support retaining Map.Entry objects");
	//    3    7:new             #41  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #43  <String "This container does not support retaining Map.Entry objects">
	//    6   13:invokespecial   #46  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		Object obj = colGetEntry(mIndex, 0);
	//    8   17:aload_0         
	//    9   18:getfield        #23  <Field MapCollections this$0>
	//   10   21:aload_0         
	//   11   22:getfield        #36  <Field int mIndex>
	//   12   25:iconst_0        
	//   13   26:invokevirtual   #54  <Method Object MapCollections.colGetEntry(int, int)>
	//   14   29:astore_3        
		Object obj1 = colGetEntry(mIndex, 1);
	//   15   30:aload_0         
	//   16   31:getfield        #23  <Field MapCollections this$0>
	//   17   34:aload_0         
	//   18   35:getfield        #36  <Field int mIndex>
	//   19   38:iconst_1        
	//   20   39:invokevirtual   #54  <Method Object MapCollections.colGetEntry(int, int)>
	//   21   42:astore          4
		int i;
		if(obj == null)
	//*  22   44:aload_3         
	//*  23   45:ifnonnull       53
			i = 0;
	//   24   48:iconst_0        
	//   25   49:istore_1        
		else
	//*  26   50:goto            58
			i = obj.hashCode();
	//   27   53:aload_3         
	//   28   54:invokevirtual   #71  <Method int Object.hashCode()>
	//   29   57:istore_1        
		int j;
		if(obj1 == null)
	//*  30   58:aload           4
	//*  31   60:ifnonnull       68
			j = 0;
	//   32   63:iconst_0        
	//   33   64:istore_2        
		else
	//*  34   65:goto            74
			j = obj1.hashCode();
	//   35   68:aload           4
	//   36   70:invokevirtual   #71  <Method int Object.hashCode()>
	//   37   73:istore_2        
		return i ^ j;
	//   38   74:iload_1         
	//   39   75:iload_2         
	//   40   76:ixor            
	//   41   77:ireturn         
	}

	public volatile Object next()
	{
		return ((Object) (next()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method java.util.Map$Entry next()>
	//    2    4:areturn         
	}

	public java.util.Map.Entry next()
	{
		mIndex = mIndex + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #36  <Field int mIndex>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #36  <Field int mIndex>
		mEntryValid = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #28  <Field boolean mEntryValid>
		return ((java.util.Map.Entry) (this));
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	public void remove()
	{
		if(!mEntryValid)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field boolean mEntryValid>
	//*   2    4:ifne            15
		{
			throw new IllegalStateException();
	//    3    7:new             #41  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:invokespecial   #78  <Method void IllegalStateException()>
	//    6   14:athrow          
		} else
		{
			colRemoveAt(mIndex);
	//    7   15:aload_0         
	//    8   16:getfield        #23  <Field MapCollections this$0>
	//    9   19:aload_0         
	//   10   20:getfield        #36  <Field int mIndex>
	//   11   23:invokevirtual   #82  <Method void MapCollections.colRemoveAt(int)>
			mIndex = mIndex - 1;
	//   12   26:aload_0         
	//   13   27:aload_0         
	//   14   28:getfield        #36  <Field int mIndex>
	//   15   31:iconst_1        
	//   16   32:isub            
	//   17   33:putfield        #36  <Field int mIndex>
			mEnd = mEnd - 1;
	//   18   36:aload_0         
	//   19   37:aload_0         
	//   20   38:getfield        #34  <Field int mEnd>
	//   21   41:iconst_1        
	//   22   42:isub            
	//   23   43:putfield        #34  <Field int mEnd>
			mEntryValid = false;
	//   24   46:aload_0         
	//   25   47:iconst_0        
	//   26   48:putfield        #28  <Field boolean mEntryValid>
			return;
	//   27   51:return          
		}
	}

	public Object setValue(Object obj)
	{
		if(!mEntryValid)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field boolean mEntryValid>
	//*   2    4:ifne            17
			throw new IllegalStateException("This container does not support retaining Map.Entry objects");
	//    3    7:new             #41  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #43  <String "This container does not support retaining Map.Entry objects">
	//    6   13:invokespecial   #46  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		else
			return colSetValue(mIndex, obj);
	//    8   17:aload_0         
	//    9   18:getfield        #23  <Field MapCollections this$0>
	//   10   21:aload_0         
	//   11   22:getfield        #36  <Field int mIndex>
	//   12   25:aload_1         
	//   13   26:invokevirtual   #88  <Method Object MapCollections.colSetValue(int, Object)>
	//   14   29:areturn         
	}

	public final String toString()
	{
		return (new StringBuilder()).append(getKey()).append("=").append(getValue()).toString();
	//    0    0:new             #93  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #94  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #95  <Method Object getKey()>
	//    5   11:invokevirtual   #99  <Method StringBuilder StringBuilder.append(Object)>
	//    6   14:ldc1            #101 <String "=">
	//    7   16:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//    8   19:aload_0         
	//    9   20:invokevirtual   #105 <Method Object getValue()>
	//   10   23:invokevirtual   #99  <Method StringBuilder StringBuilder.append(Object)>
	//   11   26:invokevirtual   #107 <Method String StringBuilder.toString()>
	//   12   29:areturn         
	}

	int mEnd;
	boolean mEntryValid;
	int mIndex;
	final MapCollections this$0;

	MapCollections$MapIterator()
	{
		this$0 = MapCollections.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field MapCollections this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #26  <Method void Object()>
		mEntryValid = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #28  <Field boolean mEntryValid>
		mEnd = colGetSize() - 1;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #32  <Method int MapCollections.colGetSize()>
	//   11   19:iconst_1        
	//   12   20:isub            
	//   13   21:putfield        #34  <Field int mEnd>
		mIndex = -1;
	//   14   24:aload_0         
	//   15   25:iconst_m1       
	//   16   26:putfield        #36  <Field int mIndex>
	//   17   29:return          
	}
}
