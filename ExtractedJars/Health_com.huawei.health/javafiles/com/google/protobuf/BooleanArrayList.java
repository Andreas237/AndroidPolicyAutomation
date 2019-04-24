// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.util.*;

// Referenced classes of package com.google.protobuf:
//			AbstractProtobufList, PrimitiveNonBoxingCollection, Internal

final class BooleanArrayList extends AbstractProtobufList
	implements Internal.BooleanList, RandomAccess, PrimitiveNonBoxingCollection
{

	BooleanArrayList()
	{
		this(new boolean[10], 0);
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:newarray        boolean[]
	//    3    5:iconst_0        
	//    4    6:invokespecial   #31  <Method void BooleanArrayList(boolean[], int)>
	//    5    9:return          
	}

	private BooleanArrayList(boolean aflag[], int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void AbstractProtobufList()>
		array = aflag;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #34  <Field boolean[] array>
		size = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #36  <Field int size>
	//    8   14:return          
	}

	private void addBoolean(int i, boolean flag)
	{
		ensureIsMutable();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method void ensureIsMutable()>
		if(i < 0 || i > size)
	//*   2    4:iload_1         
	//*   3    5:iflt            16
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:getfield        #36  <Field int size>
	//*   7   13:icmple          29
			throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
	//    8   16:new             #43  <Class IndexOutOfBoundsException>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:iload_1         
	//   12   22:invokespecial   #47  <Method String makeOutOfBoundsExceptionMessage(int)>
	//   13   25:invokespecial   #50  <Method void IndexOutOfBoundsException(String)>
	//   14   28:athrow          
		if(size < array.length)
	//*  15   29:aload_0         
	//*  16   30:getfield        #36  <Field int size>
	//*  17   33:aload_0         
	//*  18   34:getfield        #34  <Field boolean[] array>
	//*  19   37:arraylength     
	//*  20   38:icmpge          65
		{
			System.arraycopy(((Object) (array)), i, ((Object) (array)), i + 1, size - i);
	//   21   41:aload_0         
	//   22   42:getfield        #34  <Field boolean[] array>
	//   23   45:iload_1         
	//   24   46:aload_0         
	//   25   47:getfield        #34  <Field boolean[] array>
	//   26   50:iload_1         
	//   27   51:iconst_1        
	//   28   52:iadd            
	//   29   53:aload_0         
	//   30   54:getfield        #36  <Field int size>
	//   31   57:iload_1         
	//   32   58:isub            
	//   33   59:invokestatic    #56  <Method void System.arraycopy(Object, int, Object, int, int)>
		} else
	//*  34   62:goto            112
		{
			boolean aflag[] = new boolean[(size * 3) / 2 + 1];
	//   35   65:aload_0         
	//   36   66:getfield        #36  <Field int size>
	//   37   69:iconst_3        
	//   38   70:imul            
	//   39   71:iconst_2        
	//   40   72:idiv            
	//   41   73:iconst_1        
	//   42   74:iadd            
	//   43   75:newarray        boolean[]
	//   44   77:astore_3        
			System.arraycopy(((Object) (array)), 0, ((Object) (aflag)), 0, i);
	//   45   78:aload_0         
	//   46   79:getfield        #34  <Field boolean[] array>
	//   47   82:iconst_0        
	//   48   83:aload_3         
	//   49   84:iconst_0        
	//   50   85:iload_1         
	//   51   86:invokestatic    #56  <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (array)), i, ((Object) (aflag)), i + 1, size - i);
	//   52   89:aload_0         
	//   53   90:getfield        #34  <Field boolean[] array>
	//   54   93:iload_1         
	//   55   94:aload_3         
	//   56   95:iload_1         
	//   57   96:iconst_1        
	//   58   97:iadd            
	//   59   98:aload_0         
	//   60   99:getfield        #36  <Field int size>
	//   61  102:iload_1         
	//   62  103:isub            
	//   63  104:invokestatic    #56  <Method void System.arraycopy(Object, int, Object, int, int)>
			array = aflag;
	//   64  107:aload_0         
	//   65  108:aload_3         
	//   66  109:putfield        #34  <Field boolean[] array>
		}
		array[i] = flag;
	//   67  112:aload_0         
	//   68  113:getfield        #34  <Field boolean[] array>
	//   69  116:iload_1         
	//   70  117:iload_2         
	//   71  118:bastore         
		size = size + 1;
	//   72  119:aload_0         
	//   73  120:aload_0         
	//   74  121:getfield        #36  <Field int size>
	//   75  124:iconst_1        
	//   76  125:iadd            
	//   77  126:putfield        #36  <Field int size>
		modCount = modCount + 1;
	//   78  129:aload_0         
	//   79  130:aload_0         
	//   80  131:getfield        #59  <Field int modCount>
	//   81  134:iconst_1        
	//   82  135:iadd            
	//   83  136:putfield        #59  <Field int modCount>
	//   84  139:return          
	}

	public static BooleanArrayList emptyList()
	{
		return EMPTY_LIST;
	//    0    0:getstatic       #24  <Field BooleanArrayList EMPTY_LIST>
	//    1    3:areturn         
	}

	private void ensureIndexInRange(int i)
	{
		if(i < 0 || i >= size)
	//*   0    0:iload_1         
	//*   1    1:iflt            12
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #36  <Field int size>
	//*   5    9:icmplt          25
			throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
	//    6   12:new             #43  <Class IndexOutOfBoundsException>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:invokespecial   #47  <Method String makeOutOfBoundsExceptionMessage(int)>
	//   11   21:invokespecial   #50  <Method void IndexOutOfBoundsException(String)>
	//   12   24:athrow          
		else
			return;
	//   13   25:return          
	}

	private String makeOutOfBoundsExceptionMessage(int i)
	{
		return (new StringBuilder()).append("Index:").append(i).append(", Size:").append(size).toString();
	//    0    0:new             #65  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #66  <Method void StringBuilder()>
	//    3    7:ldc1            #68  <String "Index:">
	//    4    9:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #75  <Method StringBuilder StringBuilder.append(int)>
	//    7   16:ldc1            #77  <String ", Size:">
	//    8   18:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//    9   21:aload_0         
	//   10   22:getfield        #36  <Field int size>
	//   11   25:invokevirtual   #75  <Method StringBuilder StringBuilder.append(int)>
	//   12   28:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   13   31:areturn         
	}

	public void add(int i, Boolean boolean1)
	{
		addBoolean(i, boolean1.booleanValue());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #89  <Method boolean Boolean.booleanValue()>
	//    4    6:invokespecial   #91  <Method void addBoolean(int, boolean)>
	//    5    9:return          
	}

	public volatile void add(int i, Object obj)
	{
		add(i, (Boolean)obj);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #85  <Class Boolean>
	//    4    6:invokevirtual   #94  <Method void add(int, Boolean)>
	//    5    9:return          
	}

	public boolean addAll(Collection collection)
	{
		ensureIsMutable();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method void ensureIsMutable()>
		Internal.checkNotNull(((Object) (collection)));
	//    2    4:aload_1         
	//    3    5:invokestatic    #102 <Method Object Internal.checkNotNull(Object)>
	//    4    8:pop             
		if(!(collection instanceof BooleanArrayList))
	//*   5    9:aload_1         
	//*   6   10:instanceof      #2   <Class BooleanArrayList>
	//*   7   13:ifne            22
			return super.addAll(collection);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #104 <Method boolean AbstractProtobufList.addAll(Collection)>
	//   11   21:ireturn         
		collection = ((Collection) ((BooleanArrayList)collection));
	//   12   22:aload_1         
	//   13   23:checkcast       #2   <Class BooleanArrayList>
	//   14   26:astore_1        
		if(((BooleanArrayList) (collection)).size == 0)
	//*  15   27:aload_1         
	//*  16   28:getfield        #36  <Field int size>
	//*  17   31:ifne            36
			return false;
	//   18   34:iconst_0        
	//   19   35:ireturn         
		if(0x7fffffff - size < ((BooleanArrayList) (collection)).size)
	//*  20   36:ldc1            #105 <Int 0x7fffffff>
	//*  21   38:aload_0         
	//*  22   39:getfield        #36  <Field int size>
	//*  23   42:isub            
	//*  24   43:aload_1         
	//*  25   44:getfield        #36  <Field int size>
	//*  26   47:icmpge          58
			throw new OutOfMemoryError();
	//   27   50:new             #107 <Class OutOfMemoryError>
	//   28   53:dup             
	//   29   54:invokespecial   #108 <Method void OutOfMemoryError()>
	//   30   57:athrow          
		int i = size + ((BooleanArrayList) (collection)).size;
	//   31   58:aload_0         
	//   32   59:getfield        #36  <Field int size>
	//   33   62:aload_1         
	//   34   63:getfield        #36  <Field int size>
	//   35   66:iadd            
	//   36   67:istore_2        
		if(i > array.length)
	//*  37   68:iload_2         
	//*  38   69:aload_0         
	//*  39   70:getfield        #34  <Field boolean[] array>
	//*  40   73:arraylength     
	//*  41   74:icmple          89
			array = Arrays.copyOf(array, i);
	//   42   77:aload_0         
	//   43   78:aload_0         
	//   44   79:getfield        #34  <Field boolean[] array>
	//   45   82:iload_2         
	//   46   83:invokestatic    #114 <Method boolean[] Arrays.copyOf(boolean[], int)>
	//   47   86:putfield        #34  <Field boolean[] array>
		System.arraycopy(((Object) (((BooleanArrayList) (collection)).array)), 0, ((Object) (array)), size, ((BooleanArrayList) (collection)).size);
	//   48   89:aload_1         
	//   49   90:getfield        #34  <Field boolean[] array>
	//   50   93:iconst_0        
	//   51   94:aload_0         
	//   52   95:getfield        #34  <Field boolean[] array>
	//   53   98:aload_0         
	//   54   99:getfield        #36  <Field int size>
	//   55  102:aload_1         
	//   56  103:getfield        #36  <Field int size>
	//   57  106:invokestatic    #56  <Method void System.arraycopy(Object, int, Object, int, int)>
		size = i;
	//   58  109:aload_0         
	//   59  110:iload_2         
	//   60  111:putfield        #36  <Field int size>
		modCount = modCount + 1;
	//   61  114:aload_0         
	//   62  115:aload_0         
	//   63  116:getfield        #59  <Field int modCount>
	//   64  119:iconst_1        
	//   65  120:iadd            
	//   66  121:putfield        #59  <Field int modCount>
		return true;
	//   67  124:iconst_1        
	//   68  125:ireturn         
	}

	public void addBoolean(boolean flag)
	{
		addBoolean(size, flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #36  <Field int size>
	//    3    5:iload_1         
	//    4    6:invokespecial   #91  <Method void addBoolean(int, boolean)>
	//    5    9:return          
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof BooleanArrayList))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class BooleanArrayList>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #121 <Method boolean AbstractProtobufList.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((BooleanArrayList)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class BooleanArrayList>
	//   14   24:astore_1        
		if(size != ((BooleanArrayList) (obj)).size)
	//*  15   25:aload_0         
	//*  16   26:getfield        #36  <Field int size>
	//*  17   29:aload_1         
	//*  18   30:getfield        #36  <Field int size>
	//*  19   33:icmpeq          38
			return false;
	//   20   36:iconst_0        
	//   21   37:ireturn         
		obj = ((Object) (((BooleanArrayList) (obj)).array));
	//   22   38:aload_1         
	//   23   39:getfield        #34  <Field boolean[] array>
	//   24   42:astore_1        
		for(int i = 0; i < size; i++)
	//*  25   43:iconst_0        
	//*  26   44:istore_2        
	//*  27   45:iload_2         
	//*  28   46:aload_0         
	//*  29   47:getfield        #36  <Field int size>
	//*  30   50:icmpge          74
			if(array[i] != obj[i])
	//*  31   53:aload_0         
	//*  32   54:getfield        #34  <Field boolean[] array>
	//*  33   57:iload_2         
	//*  34   58:baload          
	//*  35   59:aload_1         
	//*  36   60:iload_2         
	//*  37   61:baload          
	//*  38   62:icmpeq          67
				return false;
	//   39   65:iconst_0        
	//   40   66:ireturn         

	//   41   67:iload_2         
	//   42   68:iconst_1        
	//   43   69:iadd            
	//   44   70:istore_2        
	//*  45   71:goto            45
		return true;
	//   46   74:iconst_1        
	//   47   75:ireturn         
	}

	public Boolean get(int i)
	{
		return Boolean.valueOf(getBoolean(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #127 <Method boolean getBoolean(int)>
	//    3    5:invokestatic    #131 <Method Boolean Boolean.valueOf(boolean)>
	//    4    8:areturn         
	}

	public volatile Object get(int i)
	{
		return ((Object) (get(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #134 <Method Boolean get(int)>
	//    3    5:areturn         
	}

	public boolean getBoolean(int i)
	{
		ensureIndexInRange(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #136 <Method void ensureIndexInRange(int)>
		return array[i];
	//    3    5:aload_0         
	//    4    6:getfield        #34  <Field boolean[] array>
	//    5    9:iload_1         
	//    6   10:baload          
	//    7   11:ireturn         
	}

	public int hashCode()
	{
		int j = 1;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		for(int i = 0; i < size; i++)
	//*   2    2:iconst_0        
	//*   3    3:istore_1        
	//*   4    4:iload_1         
	//*   5    5:aload_0         
	//*   6    6:getfield        #36  <Field int size>
	//*   7    9:icmpge          34
			j = j * 31 + Internal.hashBoolean(array[i]);
	//    8   12:iload_2         
	//    9   13:bipush          31
	//   10   15:imul            
	//   11   16:aload_0         
	//   12   17:getfield        #34  <Field boolean[] array>
	//   13   20:iload_1         
	//   14   21:baload          
	//   15   22:invokestatic    #142 <Method int Internal.hashBoolean(boolean)>
	//   16   25:iadd            
	//   17   26:istore_2        

	//   18   27:iload_1         
	//   19   28:iconst_1        
	//   20   29:iadd            
	//   21   30:istore_1        
	//*  22   31:goto            4
		return j;
	//   23   34:iload_2         
	//   24   35:ireturn         
	}

	public Internal.BooleanList mutableCopyWithCapacity(int i)
	{
		if(i < size)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #36  <Field int size>
	//*   3    5:icmpge          16
			throw new IllegalArgumentException();
	//    4    8:new             #146 <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:invokespecial   #147 <Method void IllegalArgumentException()>
	//    7   15:athrow          
		else
			return ((Internal.BooleanList) (new BooleanArrayList(Arrays.copyOf(array, i), size)));
	//    8   16:new             #2   <Class BooleanArrayList>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:getfield        #34  <Field boolean[] array>
	//   12   24:iload_1         
	//   13   25:invokestatic    #114 <Method boolean[] Arrays.copyOf(boolean[], int)>
	//   14   28:aload_0         
	//   15   29:getfield        #36  <Field int size>
	//   16   32:invokespecial   #31  <Method void BooleanArrayList(boolean[], int)>
	//   17   35:areturn         
	}

	public volatile Internal.ProtobufList mutableCopyWithCapacity(int i)
	{
		return ((Internal.ProtobufList) (mutableCopyWithCapacity(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #150 <Method Internal$BooleanList mutableCopyWithCapacity(int)>
	//    3    5:areturn         
	}

	public Boolean remove(int i)
	{
		ensureIsMutable();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method void ensureIsMutable()>
		ensureIndexInRange(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #136 <Method void ensureIndexInRange(int)>
		boolean flag = array[i];
	//    5    9:aload_0         
	//    6   10:getfield        #34  <Field boolean[] array>
	//    7   13:iload_1         
	//    8   14:baload          
	//    9   15:istore_2        
		System.arraycopy(((Object) (array)), i + 1, ((Object) (array)), i, size - i);
	//   10   16:aload_0         
	//   11   17:getfield        #34  <Field boolean[] array>
	//   12   20:iload_1         
	//   13   21:iconst_1        
	//   14   22:iadd            
	//   15   23:aload_0         
	//   16   24:getfield        #34  <Field boolean[] array>
	//   17   27:iload_1         
	//   18   28:aload_0         
	//   19   29:getfield        #36  <Field int size>
	//   20   32:iload_1         
	//   21   33:isub            
	//   22   34:invokestatic    #56  <Method void System.arraycopy(Object, int, Object, int, int)>
		size = size - 1;
	//   23   37:aload_0         
	//   24   38:aload_0         
	//   25   39:getfield        #36  <Field int size>
	//   26   42:iconst_1        
	//   27   43:isub            
	//   28   44:putfield        #36  <Field int size>
		modCount = modCount + 1;
	//   29   47:aload_0         
	//   30   48:aload_0         
	//   31   49:getfield        #59  <Field int modCount>
	//   32   52:iconst_1        
	//   33   53:iadd            
	//   34   54:putfield        #59  <Field int modCount>
		return Boolean.valueOf(flag);
	//   35   57:iload_2         
	//   36   58:invokestatic    #131 <Method Boolean Boolean.valueOf(boolean)>
	//   37   61:areturn         
	}

	public volatile Object remove(int i)
	{
		return ((Object) (remove(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #153 <Method Boolean remove(int)>
	//    3    5:areturn         
	}

	public boolean remove(Object obj)
	{
		ensureIsMutable();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method void ensureIsMutable()>
		for(int i = 0; i < size; i++)
	//*   2    4:iconst_0        
	//*   3    5:istore_2        
	//*   4    6:iload_2         
	//*   5    7:aload_0         
	//*   6    8:getfield        #36  <Field int size>
	//*   7   11:icmpge          80
			if(obj.equals(((Object) (Boolean.valueOf(array[i])))))
	//*   8   14:aload_1         
	//*   9   15:aload_0         
	//*  10   16:getfield        #34  <Field boolean[] array>
	//*  11   19:iload_2         
	//*  12   20:baload          
	//*  13   21:invokestatic    #131 <Method Boolean Boolean.valueOf(boolean)>
	//*  14   24:invokevirtual   #156 <Method boolean Object.equals(Object)>
	//*  15   27:ifeq            73
			{
				System.arraycopy(((Object) (array)), i + 1, ((Object) (array)), i, size - i);
	//   16   30:aload_0         
	//   17   31:getfield        #34  <Field boolean[] array>
	//   18   34:iload_2         
	//   19   35:iconst_1        
	//   20   36:iadd            
	//   21   37:aload_0         
	//   22   38:getfield        #34  <Field boolean[] array>
	//   23   41:iload_2         
	//   24   42:aload_0         
	//   25   43:getfield        #36  <Field int size>
	//   26   46:iload_2         
	//   27   47:isub            
	//   28   48:invokestatic    #56  <Method void System.arraycopy(Object, int, Object, int, int)>
				size = size - 1;
	//   29   51:aload_0         
	//   30   52:aload_0         
	//   31   53:getfield        #36  <Field int size>
	//   32   56:iconst_1        
	//   33   57:isub            
	//   34   58:putfield        #36  <Field int size>
				modCount = modCount + 1;
	//   35   61:aload_0         
	//   36   62:aload_0         
	//   37   63:getfield        #59  <Field int modCount>
	//   38   66:iconst_1        
	//   39   67:iadd            
	//   40   68:putfield        #59  <Field int modCount>
				return true;
	//   41   71:iconst_1        
	//   42   72:ireturn         
			}

	//   43   73:iload_2         
	//   44   74:iconst_1        
	//   45   75:iadd            
	//   46   76:istore_2        
	//*  47   77:goto            6
		return false;
	//   48   80:iconst_0        
	//   49   81:ireturn         
	}

	public Boolean set(int i, Boolean boolean1)
	{
		return Boolean.valueOf(setBoolean(i, boolean1.booleanValue()));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #89  <Method boolean Boolean.booleanValue()>
	//    4    6:invokevirtual   #162 <Method boolean setBoolean(int, boolean)>
	//    5    9:invokestatic    #131 <Method Boolean Boolean.valueOf(boolean)>
	//    6   12:areturn         
	}

	public volatile Object set(int i, Object obj)
	{
		return ((Object) (set(i, (Boolean)obj)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #85  <Class Boolean>
	//    4    6:invokevirtual   #165 <Method Boolean set(int, Boolean)>
	//    5    9:areturn         
	}

	public boolean setBoolean(int i, boolean flag)
	{
		ensureIsMutable();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method void ensureIsMutable()>
		ensureIndexInRange(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #136 <Method void ensureIndexInRange(int)>
		boolean flag1 = array[i];
	//    5    9:aload_0         
	//    6   10:getfield        #34  <Field boolean[] array>
	//    7   13:iload_1         
	//    8   14:baload          
	//    9   15:istore_3        
		array[i] = flag;
	//   10   16:aload_0         
	//   11   17:getfield        #34  <Field boolean[] array>
	//   12   20:iload_1         
	//   13   21:iload_2         
	//   14   22:bastore         
		return flag1;
	//   15   23:iload_3         
	//   16   24:ireturn         
	}

	public int size()
	{
		return size;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int size>
	//    2    4:ireturn         
	}

	private static final BooleanArrayList EMPTY_LIST;
	private boolean array[];
	private int size;

	static 
	{
		EMPTY_LIST = new BooleanArrayList();
	//    0    0:new             #2   <Class BooleanArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void BooleanArrayList()>
	//    3    7:putstatic       #24  <Field BooleanArrayList EMPTY_LIST>
		EMPTY_LIST.makeImmutable();
	//    4   10:getstatic       #24  <Field BooleanArrayList EMPTY_LIST>
	//    5   13:invokevirtual   #27  <Method void makeImmutable()>
	//*   6   16:return          
	}
}
