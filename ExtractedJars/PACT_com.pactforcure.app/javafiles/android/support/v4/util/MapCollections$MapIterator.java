// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package android.support.v4.util:
//			MapCollections, ContainerHelpers

final class MapCollections$MapIterator
	implements Iterator, java.util.Map.Entry
{

	public final boolean equals(Object obj)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		if(!mEntryValid)
	//*   2    2:aload_0         
	//*   3    3:getfield        #28  <Field boolean mEntryValid>
	//*   4    6:ifne            19
			throw new IllegalStateException("This container does not support retaining Map.Entry objects");
	//    5    9:new             #41  <Class IllegalStateException>
	//    6   12:dup             
	//    7   13:ldc1            #43  <String "This container does not support retaining Map.Entry objects">
	//    8   15:invokespecial   #46  <Method void IllegalStateException(String)>
	//    9   18:athrow          
		if(!(obj instanceof java.util.Map.Entry))
	//*  10   19:aload_1         
	//*  11   20:instanceof      #9   <Class java.util.Map$Entry>
	//*  12   23:ifne            28
			return false;
	//   13   26:iconst_0        
	//   14   27:ireturn         
		obj = ((Object) ((java.util.Map.Entry)obj));
	//   15   28:aload_1         
	//   16   29:checkcast       #9   <Class java.util.Map$Entry>
	//   17   32:astore_1        
		if(!ContainerHelpers.equal(((java.util.Map.Entry) (obj)).getKey(), colGetEntry(mIndex, 0)) || !ContainerHelpers.equal(((java.util.Map.Entry) (obj)).getValue(), colGetEntry(mIndex, 1)))
	//*  18   33:aload_1         
	//*  19   34:invokeinterface #50  <Method Object java.util.Map$Entry.getKey()>
	//*  20   39:aload_0         
	//*  21   40:getfield        #23  <Field MapCollections this$0>
	//*  22   43:aload_0         
	//*  23   44:getfield        #36  <Field int mIndex>
	//*  24   47:iconst_0        
	//*  25   48:invokevirtual   #54  <Method Object MapCollections.colGetEntry(int, int)>
	//*  26   51:invokestatic    #60  <Method boolean ContainerHelpers.equal(Object, Object)>
	//*  27   54:ifeq            83
	//*  28   57:aload_1         
	//*  29   58:invokeinterface #63  <Method Object java.util.Map$Entry.getValue()>
	//*  30   63:aload_0         
	//*  31   64:getfield        #23  <Field MapCollections this$0>
	//*  32   67:aload_0         
	//*  33   68:getfield        #36  <Field int mIndex>
	//*  34   71:iconst_1        
	//*  35   72:invokevirtual   #54  <Method Object MapCollections.colGetEntry(int, int)>
	//*  36   75:invokestatic    #60  <Method boolean ContainerHelpers.equal(Object, Object)>
	//*  37   78:ifeq            83
	//*  38   81:iload_2         
	//*  39   82:ireturn         
			flag = false;
	//   40   83:iconst_0        
	//   41   84:istore_2        
		return flag;
	//*  42   85:goto            81
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
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(!mEntryValid)
	//*   2    2:aload_0         
	//*   3    3:getfield        #28  <Field boolean mEntryValid>
	//*   4    6:ifne            19
			throw new IllegalStateException("This container does not support retaining Map.Entry objects");
	//    5    9:new             #41  <Class IllegalStateException>
	//    6   12:dup             
	//    7   13:ldc1            #43  <String "This container does not support retaining Map.Entry objects">
	//    8   15:invokespecial   #46  <Method void IllegalStateException(String)>
	//    9   18:athrow          
		Object obj = colGetEntry(mIndex, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #23  <Field MapCollections this$0>
	//   12   23:aload_0         
	//   13   24:getfield        #36  <Field int mIndex>
	//   14   27:iconst_0        
	//   15   28:invokevirtual   #54  <Method Object MapCollections.colGetEntry(int, int)>
	//   16   31:astore_3        
		Object obj1 = colGetEntry(mIndex, 1);
	//   17   32:aload_0         
	//   18   33:getfield        #23  <Field MapCollections this$0>
	//   19   36:aload_0         
	//   20   37:getfield        #36  <Field int mIndex>
	//   21   40:iconst_1        
	//   22   41:invokevirtual   #54  <Method Object MapCollections.colGetEntry(int, int)>
	//   23   44:astore          4
		int i;
		if(obj == null)
	//*  24   46:aload_3         
	//*  25   47:ifnonnull       61
			i = 0;
	//   26   50:iconst_0        
	//   27   51:istore_1        
		else
	//*  28   52:aload           4
	//*  29   54:ifnonnull       69
	//*  30   57:iload_2         
	//*  31   58:iload_1         
	//*  32   59:ixor            
	//*  33   60:ireturn         
			i = obj.hashCode();
	//   34   61:aload_3         
	//   35   62:invokevirtual   #71  <Method int Object.hashCode()>
	//   36   65:istore_1        
		if(obj1 != null)
	//*  37   66:goto            52
			j = obj1.hashCode();
	//   38   69:aload           4
	//   39   71:invokevirtual   #71  <Method int Object.hashCode()>
	//   40   74:istore_2        
		return ((int) (j ^ i));
	//*  41   75:goto            57
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
		if(!hasNext())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #77  <Method boolean hasNext()>
	//*   2    4:ifne            15
		{
			throw new NoSuchElementException();
	//    3    7:new             #79  <Class NoSuchElementException>
	//    4   10:dup             
	//    5   11:invokespecial   #80  <Method void NoSuchElementException()>
	//    6   14:athrow          
		} else
		{
			mIndex = mIndex + 1;
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #36  <Field int mIndex>
	//   10   20:iconst_1        
	//   11   21:iadd            
	//   12   22:putfield        #36  <Field int mIndex>
			mEntryValid = true;
	//   13   25:aload_0         
	//   14   26:iconst_1        
	//   15   27:putfield        #28  <Field boolean mEntryValid>
			return ((java.util.Map.Entry) (this));
	//   16   30:aload_0         
	//   17   31:areturn         
		}
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
	//    5   11:invokespecial   #83  <Method void IllegalStateException()>
	//    6   14:athrow          
		} else
		{
			colRemoveAt(mIndex);
	//    7   15:aload_0         
	//    8   16:getfield        #23  <Field MapCollections this$0>
	//    9   19:aload_0         
	//   10   20:getfield        #36  <Field int mIndex>
	//   11   23:invokevirtual   #87  <Method void MapCollections.colRemoveAt(int)>
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
	//   13   26:invokevirtual   #93  <Method Object MapCollections.colSetValue(int, Object)>
	//   14   29:areturn         
	}

	public final String toString()
	{
		return (new StringBuilder()).append(getKey()).append("=").append(getValue()).toString();
	//    0    0:new             #98  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #99  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #100 <Method Object getKey()>
	//    5   11:invokevirtual   #104 <Method StringBuilder StringBuilder.append(Object)>
	//    6   14:ldc1            #106 <String "=">
	//    7   16:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//    8   19:aload_0         
	//    9   20:invokevirtual   #110 <Method Object getValue()>
	//   10   23:invokevirtual   #104 <Method StringBuilder StringBuilder.append(Object)>
	//   11   26:invokevirtual   #112 <Method String StringBuilder.toString()>
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
