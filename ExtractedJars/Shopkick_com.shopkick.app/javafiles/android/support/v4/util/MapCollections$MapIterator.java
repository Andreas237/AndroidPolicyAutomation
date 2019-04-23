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
		if(mEntryValid)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field boolean mEntryValid>
	//*   2    4:ifeq            81
		{
			boolean flag = obj instanceof java.util.Map.Entry;
	//    3    7:aload_1         
	//    4    8:instanceof      #9   <Class java.util.Map$Entry>
	//    5   11:istore_2        
			boolean flag1 = false;
	//    6   12:iconst_0        
	//    7   13:istore_3        
			if(!flag)
	//*   8   14:iload_2         
	//*   9   15:ifne            20
				return false;
	//   10   18:iconst_0        
	//   11   19:ireturn         
			obj = ((Object) ((java.util.Map.Entry)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #9   <Class java.util.Map$Entry>
	//   14   24:astore_1        
			flag = flag1;
	//   15   25:iload_3         
	//   16   26:istore_2        
			if(ContainerHelpers.equal(((java.util.Map.Entry) (obj)).getKey(), colGetEntry(mIndex, 0)))
	//*  17   27:aload_1         
	//*  18   28:invokeinterface #43  <Method Object java.util.Map$Entry.getKey()>
	//*  19   33:aload_0         
	//*  20   34:getfield        #23  <Field MapCollections this$0>
	//*  21   37:aload_0         
	//*  22   38:getfield        #36  <Field int mIndex>
	//*  23   41:iconst_0        
	//*  24   42:invokevirtual   #47  <Method Object MapCollections.colGetEntry(int, int)>
	//*  25   45:invokestatic    #53  <Method boolean ContainerHelpers.equal(Object, Object)>
	//*  26   48:ifeq            79
			{
				flag = flag1;
	//   27   51:iload_3         
	//   28   52:istore_2        
				if(ContainerHelpers.equal(((java.util.Map.Entry) (obj)).getValue(), colGetEntry(mIndex, 1)))
	//*  29   53:aload_1         
	//*  30   54:invokeinterface #56  <Method Object java.util.Map$Entry.getValue()>
	//*  31   59:aload_0         
	//*  32   60:getfield        #23  <Field MapCollections this$0>
	//*  33   63:aload_0         
	//*  34   64:getfield        #36  <Field int mIndex>
	//*  35   67:iconst_1        
	//*  36   68:invokevirtual   #47  <Method Object MapCollections.colGetEntry(int, int)>
	//*  37   71:invokestatic    #53  <Method boolean ContainerHelpers.equal(Object, Object)>
	//*  38   74:ifeq            79
					flag = true;
	//   39   77:iconst_1        
	//   40   78:istore_2        
			}
			return flag;
	//   41   79:iload_2         
	//   42   80:ireturn         
		} else
		{
			throw new IllegalStateException("This container does not support retaining Map.Entry objects");
	//   43   81:new             #58  <Class IllegalStateException>
	//   44   84:dup             
	//   45   85:ldc1            #60  <String "This container does not support retaining Map.Entry objects">
	//   46   87:invokespecial   #63  <Method void IllegalStateException(String)>
	//   47   90:athrow          
		}
	}

	public Object getKey()
	{
		if(mEntryValid)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field boolean mEntryValid>
	//*   2    4:ifeq            20
			return colGetEntry(mIndex, 0);
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field MapCollections this$0>
	//    5   11:aload_0         
	//    6   12:getfield        #36  <Field int mIndex>
	//    7   15:iconst_0        
	//    8   16:invokevirtual   #47  <Method Object MapCollections.colGetEntry(int, int)>
	//    9   19:areturn         
		else
			throw new IllegalStateException("This container does not support retaining Map.Entry objects");
	//   10   20:new             #58  <Class IllegalStateException>
	//   11   23:dup             
	//   12   24:ldc1            #60  <String "This container does not support retaining Map.Entry objects">
	//   13   26:invokespecial   #63  <Method void IllegalStateException(String)>
	//   14   29:athrow          
	}

	public Object getValue()
	{
		if(mEntryValid)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field boolean mEntryValid>
	//*   2    4:ifeq            20
			return colGetEntry(mIndex, 1);
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field MapCollections this$0>
	//    5   11:aload_0         
	//    6   12:getfield        #36  <Field int mIndex>
	//    7   15:iconst_1        
	//    8   16:invokevirtual   #47  <Method Object MapCollections.colGetEntry(int, int)>
	//    9   19:areturn         
		else
			throw new IllegalStateException("This container does not support retaining Map.Entry objects");
	//   10   20:new             #58  <Class IllegalStateException>
	//   11   23:dup             
	//   12   24:ldc1            #60  <String "This container does not support retaining Map.Entry objects">
	//   13   26:invokespecial   #63  <Method void IllegalStateException(String)>
	//   14   29:athrow          
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
		if(mEntryValid)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field boolean mEntryValid>
	//*   2    4:ifeq            72
		{
			Object obj = ((Object) (MapCollections.this));
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field MapCollections this$0>
	//    5   11:astore_3        
			int i = mIndex;
	//    6   12:aload_0         
	//    7   13:getfield        #36  <Field int mIndex>
	//    8   16:istore_1        
			int j = 0;
	//    9   17:iconst_0        
	//   10   18:istore_2        
			obj = ((MapCollections) (obj)).colGetEntry(i, 0);
	//   11   19:aload_3         
	//   12   20:iload_1         
	//   13   21:iconst_0        
	//   14   22:invokevirtual   #47  <Method Object MapCollections.colGetEntry(int, int)>
	//   15   25:astore_3        
			Object obj1 = colGetEntry(mIndex, 1);
	//   16   26:aload_0         
	//   17   27:getfield        #23  <Field MapCollections this$0>
	//   18   30:aload_0         
	//   19   31:getfield        #36  <Field int mIndex>
	//   20   34:iconst_1        
	//   21   35:invokevirtual   #47  <Method Object MapCollections.colGetEntry(int, int)>
	//   22   38:astore          4
			if(obj == null)
	//*  23   40:aload_3         
	//*  24   41:ifnonnull       49
				i = 0;
	//   25   44:iconst_0        
	//   26   45:istore_1        
			else
	//*  27   46:goto            54
				i = obj.hashCode();
	//   28   49:aload_3         
	//   29   50:invokevirtual   #71  <Method int Object.hashCode()>
	//   30   53:istore_1        
			if(obj1 != null)
	//*  31   54:aload           4
	//*  32   56:ifnonnull       62
	//*  33   59:goto            68
				j = obj1.hashCode();
	//   34   62:aload           4
	//   35   64:invokevirtual   #71  <Method int Object.hashCode()>
	//   36   67:istore_2        
			return i ^ j;
	//   37   68:iload_1         
	//   38   69:iload_2         
	//   39   70:ixor            
	//   40   71:ireturn         
		} else
		{
			throw new IllegalStateException("This container does not support retaining Map.Entry objects");
	//   41   72:new             #58  <Class IllegalStateException>
	//   42   75:dup             
	//   43   76:ldc1            #60  <String "This container does not support retaining Map.Entry objects">
	//   44   78:invokespecial   #63  <Method void IllegalStateException(String)>
	//   45   81:athrow          
		}
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
		if(hasNext())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #77  <Method boolean hasNext()>
	//*   2    4:ifeq            24
		{
			mIndex = mIndex + 1;
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field int mIndex>
	//    6   12:iconst_1        
	//    7   13:iadd            
	//    8   14:putfield        #36  <Field int mIndex>
			mEntryValid = true;
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:putfield        #28  <Field boolean mEntryValid>
			return ((java.util.Map.Entry) (this));
	//   12   22:aload_0         
	//   13   23:areturn         
		} else
		{
			throw new NoSuchElementException();
	//   14   24:new             #79  <Class NoSuchElementException>
	//   15   27:dup             
	//   16   28:invokespecial   #80  <Method void NoSuchElementException()>
	//   17   31:athrow          
		}
	}

	public void remove()
	{
		if(mEntryValid)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field boolean mEntryValid>
	//*   2    4:ifeq            44
		{
			colRemoveAt(mIndex);
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field MapCollections this$0>
	//    5   11:aload_0         
	//    6   12:getfield        #36  <Field int mIndex>
	//    7   15:invokevirtual   #86  <Method void MapCollections.colRemoveAt(int)>
			mIndex = mIndex - 1;
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #36  <Field int mIndex>
	//   11   23:iconst_1        
	//   12   24:isub            
	//   13   25:putfield        #36  <Field int mIndex>
			mEnd = mEnd - 1;
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #34  <Field int mEnd>
	//   17   33:iconst_1        
	//   18   34:isub            
	//   19   35:putfield        #34  <Field int mEnd>
			mEntryValid = false;
	//   20   38:aload_0         
	//   21   39:iconst_0        
	//   22   40:putfield        #28  <Field boolean mEntryValid>
			return;
	//   23   43:return          
		} else
		{
			throw new IllegalStateException();
	//   24   44:new             #58  <Class IllegalStateException>
	//   25   47:dup             
	//   26   48:invokespecial   #87  <Method void IllegalStateException()>
	//   27   51:athrow          
		}
	}

	public Object setValue(Object obj)
	{
		if(mEntryValid)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field boolean mEntryValid>
	//*   2    4:ifeq            20
			return colSetValue(mIndex, obj);
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field MapCollections this$0>
	//    5   11:aload_0         
	//    6   12:getfield        #36  <Field int mIndex>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #93  <Method Object MapCollections.colSetValue(int, Object)>
	//    9   19:areturn         
		else
			throw new IllegalStateException("This container does not support retaining Map.Entry objects");
	//   10   20:new             #58  <Class IllegalStateException>
	//   11   23:dup             
	//   12   24:ldc1            #60  <String "This container does not support retaining Map.Entry objects">
	//   13   26:invokespecial   #63  <Method void IllegalStateException(String)>
	//   14   29:athrow          
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
