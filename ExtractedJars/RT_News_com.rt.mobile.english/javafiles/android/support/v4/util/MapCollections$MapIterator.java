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

	public boolean equals(Object obj)
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
		boolean flag = obj instanceof java.util.Map.Entry;
	//    8   17:aload_1         
	//    9   18:instanceof      #9   <Class java.util.Map$Entry>
	//   10   21:istore_2        
		boolean flag1 = false;
	//   11   22:iconst_0        
	//   12   23:istore_3        
		if(!flag)
	//*  13   24:iload_2         
	//*  14   25:ifne            30
			return false;
	//   15   28:iconst_0        
	//   16   29:ireturn         
		obj = ((Object) ((java.util.Map.Entry)obj));
	//   17   30:aload_1         
	//   18   31:checkcast       #9   <Class java.util.Map$Entry>
	//   19   34:astore_1        
		flag = flag1;
	//   20   35:iload_3         
	//   21   36:istore_2        
		if(ContainerHelpers.equal(((java.util.Map.Entry) (obj)).getKey(), colGetEntry(mIndex, 0)))
	//*  22   37:aload_1         
	//*  23   38:invokeinterface #50  <Method Object java.util.Map$Entry.getKey()>
	//*  24   43:aload_0         
	//*  25   44:getfield        #23  <Field MapCollections this$0>
	//*  26   47:aload_0         
	//*  27   48:getfield        #36  <Field int mIndex>
	//*  28   51:iconst_0        
	//*  29   52:invokevirtual   #54  <Method Object MapCollections.colGetEntry(int, int)>
	//*  30   55:invokestatic    #60  <Method boolean ContainerHelpers.equal(Object, Object)>
	//*  31   58:ifeq            89
		{
			flag = flag1;
	//   32   61:iload_3         
	//   33   62:istore_2        
			if(ContainerHelpers.equal(((java.util.Map.Entry) (obj)).getValue(), colGetEntry(mIndex, 1)))
	//*  34   63:aload_1         
	//*  35   64:invokeinterface #63  <Method Object java.util.Map$Entry.getValue()>
	//*  36   69:aload_0         
	//*  37   70:getfield        #23  <Field MapCollections this$0>
	//*  38   73:aload_0         
	//*  39   74:getfield        #36  <Field int mIndex>
	//*  40   77:iconst_1        
	//*  41   78:invokevirtual   #54  <Method Object MapCollections.colGetEntry(int, int)>
	//*  42   81:invokestatic    #60  <Method boolean ContainerHelpers.equal(Object, Object)>
	//*  43   84:ifeq            89
				flag = true;
	//   44   87:iconst_1        
	//   45   88:istore_2        
		}
		return flag;
	//   46   89:iload_2         
	//   47   90:ireturn         
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

	public int hashCode()
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
		Object obj = ((Object) (MapCollections.this));
	//    8   17:aload_0         
	//    9   18:getfield        #23  <Field MapCollections this$0>
	//   10   21:astore_3        
		int i = mIndex;
	//   11   22:aload_0         
	//   12   23:getfield        #36  <Field int mIndex>
	//   13   26:istore_1        
		int j = 0;
	//   14   27:iconst_0        
	//   15   28:istore_2        
		obj = ((MapCollections) (obj)).colGetEntry(i, 0);
	//   16   29:aload_3         
	//   17   30:iload_1         
	//   18   31:iconst_0        
	//   19   32:invokevirtual   #54  <Method Object MapCollections.colGetEntry(int, int)>
	//   20   35:astore_3        
		Object obj1 = colGetEntry(mIndex, 1);
	//   21   36:aload_0         
	//   22   37:getfield        #23  <Field MapCollections this$0>
	//   23   40:aload_0         
	//   24   41:getfield        #36  <Field int mIndex>
	//   25   44:iconst_1        
	//   26   45:invokevirtual   #54  <Method Object MapCollections.colGetEntry(int, int)>
	//   27   48:astore          4
		if(obj == null)
	//*  28   50:aload_3         
	//*  29   51:ifnonnull       59
			i = 0;
	//   30   54:iconst_0        
	//   31   55:istore_1        
		else
	//*  32   56:goto            64
			i = obj.hashCode();
	//   33   59:aload_3         
	//   34   60:invokevirtual   #71  <Method int Object.hashCode()>
	//   35   63:istore_1        
		if(obj1 != null)
	//*  36   64:aload           4
	//*  37   66:ifnonnull       72
	//*  38   69:goto            78
			j = obj1.hashCode();
	//   39   72:aload           4
	//   40   74:invokevirtual   #71  <Method int Object.hashCode()>
	//   41   77:istore_2        
		return i ^ j;
	//   42   78:iload_1         
	//   43   79:iload_2         
	//   44   80:ixor            
	//   45   81:ireturn         
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

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #98  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #99  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(getKey());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #100 <Method Object getKey()>
	//    7   13:invokevirtual   #104 <Method StringBuilder StringBuilder.append(Object)>
	//    8   16:pop             
		stringbuilder.append("=");
	//    9   17:aload_1         
	//   10   18:ldc1            #106 <String "=">
	//   11   20:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(getValue());
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:invokevirtual   #110 <Method Object getValue()>
	//   16   29:invokevirtual   #104 <Method StringBuilder StringBuilder.append(Object)>
	//   17   32:pop             
		return stringbuilder.toString();
	//   18   33:aload_1         
	//   19   34:invokevirtual   #112 <Method String StringBuilder.toString()>
	//   20   37:areturn         
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
