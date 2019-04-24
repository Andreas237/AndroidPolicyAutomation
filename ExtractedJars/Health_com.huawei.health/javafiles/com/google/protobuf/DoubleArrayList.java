// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.util.*;

// Referenced classes of package com.google.protobuf:
//			AbstractProtobufList, PrimitiveNonBoxingCollection, Internal

final class DoubleArrayList extends AbstractProtobufList
	implements Internal.DoubleList, RandomAccess, PrimitiveNonBoxingCollection
{

	DoubleArrayList()
	{
		this(new double[10], 0);
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:newarray        double[]
	//    3    5:iconst_0        
	//    4    6:invokespecial   #31  <Method void DoubleArrayList(double[], int)>
	//    5    9:return          
	}

	private DoubleArrayList(double ad[], int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void AbstractProtobufList()>
		array = ad;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #34  <Field double[] array>
		size = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #36  <Field int size>
	//    8   14:return          
	}

	private void addDouble(int i, double d)
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
	//*  18   34:getfield        #34  <Field double[] array>
	//*  19   37:arraylength     
	//*  20   38:icmpge          65
		{
			System.arraycopy(((Object) (array)), i, ((Object) (array)), i + 1, size - i);
	//   21   41:aload_0         
	//   22   42:getfield        #34  <Field double[] array>
	//   23   45:iload_1         
	//   24   46:aload_0         
	//   25   47:getfield        #34  <Field double[] array>
	//   26   50:iload_1         
	//   27   51:iconst_1        
	//   28   52:iadd            
	//   29   53:aload_0         
	//   30   54:getfield        #36  <Field int size>
	//   31   57:iload_1         
	//   32   58:isub            
	//   33   59:invokestatic    #56  <Method void System.arraycopy(Object, int, Object, int, int)>
		} else
	//*  34   62:goto            116
		{
			double ad[] = new double[(size * 3) / 2 + 1];
	//   35   65:aload_0         
	//   36   66:getfield        #36  <Field int size>
	//   37   69:iconst_3        
	//   38   70:imul            
	//   39   71:iconst_2        
	//   40   72:idiv            
	//   41   73:iconst_1        
	//   42   74:iadd            
	//   43   75:newarray        double[]
	//   44   77:astore          4
			System.arraycopy(((Object) (array)), 0, ((Object) (ad)), 0, i);
	//   45   79:aload_0         
	//   46   80:getfield        #34  <Field double[] array>
	//   47   83:iconst_0        
	//   48   84:aload           4
	//   49   86:iconst_0        
	//   50   87:iload_1         
	//   51   88:invokestatic    #56  <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (array)), i, ((Object) (ad)), i + 1, size - i);
	//   52   91:aload_0         
	//   53   92:getfield        #34  <Field double[] array>
	//   54   95:iload_1         
	//   55   96:aload           4
	//   56   98:iload_1         
	//   57   99:iconst_1        
	//   58  100:iadd            
	//   59  101:aload_0         
	//   60  102:getfield        #36  <Field int size>
	//   61  105:iload_1         
	//   62  106:isub            
	//   63  107:invokestatic    #56  <Method void System.arraycopy(Object, int, Object, int, int)>
			array = ad;
	//   64  110:aload_0         
	//   65  111:aload           4
	//   66  113:putfield        #34  <Field double[] array>
		}
		array[i] = d;
	//   67  116:aload_0         
	//   68  117:getfield        #34  <Field double[] array>
	//   69  120:iload_1         
	//   70  121:dload_2         
	//   71  122:dastore         
		size = size + 1;
	//   72  123:aload_0         
	//   73  124:aload_0         
	//   74  125:getfield        #36  <Field int size>
	//   75  128:iconst_1        
	//   76  129:iadd            
	//   77  130:putfield        #36  <Field int size>
		modCount = modCount + 1;
	//   78  133:aload_0         
	//   79  134:aload_0         
	//   80  135:getfield        #59  <Field int modCount>
	//   81  138:iconst_1        
	//   82  139:iadd            
	//   83  140:putfield        #59  <Field int modCount>
	//   84  143:return          
	}

	public static DoubleArrayList emptyList()
	{
		return EMPTY_LIST;
	//    0    0:getstatic       #24  <Field DoubleArrayList EMPTY_LIST>
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

	public void add(int i, Double double1)
	{
		addDouble(i, double1.doubleValue());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #89  <Method double Double.doubleValue()>
	//    4    6:invokespecial   #91  <Method void addDouble(int, double)>
	//    5    9:return          
	}

	public volatile void add(int i, Object obj)
	{
		add(i, (Double)obj);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #85  <Class Double>
	//    4    6:invokevirtual   #94  <Method void add(int, Double)>
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
		if(!(collection instanceof DoubleArrayList))
	//*   5    9:aload_1         
	//*   6   10:instanceof      #2   <Class DoubleArrayList>
	//*   7   13:ifne            22
			return super.addAll(collection);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #104 <Method boolean AbstractProtobufList.addAll(Collection)>
	//   11   21:ireturn         
		collection = ((Collection) ((DoubleArrayList)collection));
	//   12   22:aload_1         
	//   13   23:checkcast       #2   <Class DoubleArrayList>
	//   14   26:astore_1        
		if(((DoubleArrayList) (collection)).size == 0)
	//*  15   27:aload_1         
	//*  16   28:getfield        #36  <Field int size>
	//*  17   31:ifne            36
			return false;
	//   18   34:iconst_0        
	//   19   35:ireturn         
		if(0x7fffffff - size < ((DoubleArrayList) (collection)).size)
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
		int i = size + ((DoubleArrayList) (collection)).size;
	//   31   58:aload_0         
	//   32   59:getfield        #36  <Field int size>
	//   33   62:aload_1         
	//   34   63:getfield        #36  <Field int size>
	//   35   66:iadd            
	//   36   67:istore_2        
		if(i > array.length)
	//*  37   68:iload_2         
	//*  38   69:aload_0         
	//*  39   70:getfield        #34  <Field double[] array>
	//*  40   73:arraylength     
	//*  41   74:icmple          89
			array = Arrays.copyOf(array, i);
	//   42   77:aload_0         
	//   43   78:aload_0         
	//   44   79:getfield        #34  <Field double[] array>
	//   45   82:iload_2         
	//   46   83:invokestatic    #114 <Method double[] Arrays.copyOf(double[], int)>
	//   47   86:putfield        #34  <Field double[] array>
		System.arraycopy(((Object) (((DoubleArrayList) (collection)).array)), 0, ((Object) (array)), size, ((DoubleArrayList) (collection)).size);
	//   48   89:aload_1         
	//   49   90:getfield        #34  <Field double[] array>
	//   50   93:iconst_0        
	//   51   94:aload_0         
	//   52   95:getfield        #34  <Field double[] array>
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

	public void addDouble(double d)
	{
		addDouble(size, d);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #36  <Field int size>
	//    3    5:dload_1         
	//    4    6:invokespecial   #91  <Method void addDouble(int, double)>
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
		if(!(obj instanceof DoubleArrayList))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class DoubleArrayList>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #121 <Method boolean AbstractProtobufList.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((DoubleArrayList)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class DoubleArrayList>
	//   14   24:astore_1        
		if(size != ((DoubleArrayList) (obj)).size)
	//*  15   25:aload_0         
	//*  16   26:getfield        #36  <Field int size>
	//*  17   29:aload_1         
	//*  18   30:getfield        #36  <Field int size>
	//*  19   33:icmpeq          38
			return false;
	//   20   36:iconst_0        
	//   21   37:ireturn         
		obj = ((Object) (((DoubleArrayList) (obj)).array));
	//   22   38:aload_1         
	//   23   39:getfield        #34  <Field double[] array>
	//   24   42:astore_1        
		for(int i = 0; i < size; i++)
	//*  25   43:iconst_0        
	//*  26   44:istore_2        
	//*  27   45:iload_2         
	//*  28   46:aload_0         
	//*  29   47:getfield        #36  <Field int size>
	//*  30   50:icmpge          75
			if(array[i] != obj[i])
	//*  31   53:aload_0         
	//*  32   54:getfield        #34  <Field double[] array>
	//*  33   57:iload_2         
	//*  34   58:daload          
	//*  35   59:aload_1         
	//*  36   60:iload_2         
	//*  37   61:daload          
	//*  38   62:dcmpl           
	//*  39   63:ifeq            68
				return false;
	//   40   66:iconst_0        
	//   41   67:ireturn         

	//   42   68:iload_2         
	//   43   69:iconst_1        
	//   44   70:iadd            
	//   45   71:istore_2        
	//*  46   72:goto            45
		return true;
	//   47   75:iconst_1        
	//   48   76:ireturn         
	}

	public Double get(int i)
	{
		return Double.valueOf(getDouble(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #127 <Method double getDouble(int)>
	//    3    5:invokestatic    #131 <Method Double Double.valueOf(double)>
	//    4    8:areturn         
	}

	public volatile Object get(int i)
	{
		return ((Object) (get(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #134 <Method Double get(int)>
	//    3    5:areturn         
	}

	public double getDouble(int i)
	{
		ensureIndexInRange(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #136 <Method void ensureIndexInRange(int)>
		return array[i];
	//    3    5:aload_0         
	//    4    6:getfield        #34  <Field double[] array>
	//    5    9:iload_1         
	//    6   10:daload          
	//    7   11:dreturn         
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
	//*   7    9:icmpge          37
			j = j * 31 + Internal.hashLong(Double.doubleToLongBits(array[i]));
	//    8   12:iload_2         
	//    9   13:bipush          31
	//   10   15:imul            
	//   11   16:aload_0         
	//   12   17:getfield        #34  <Field double[] array>
	//   13   20:iload_1         
	//   14   21:daload          
	//   15   22:invokestatic    #142 <Method long Double.doubleToLongBits(double)>
	//   16   25:invokestatic    #146 <Method int Internal.hashLong(long)>
	//   17   28:iadd            
	//   18   29:istore_2        

	//   19   30:iload_1         
	//   20   31:iconst_1        
	//   21   32:iadd            
	//   22   33:istore_1        
	//*  23   34:goto            4
		return j;
	//   24   37:iload_2         
	//   25   38:ireturn         
	}

	public Internal.DoubleList mutableCopyWithCapacity(int i)
	{
		if(i < size)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #36  <Field int size>
	//*   3    5:icmpge          16
			throw new IllegalArgumentException();
	//    4    8:new             #150 <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:invokespecial   #151 <Method void IllegalArgumentException()>
	//    7   15:athrow          
		else
			return ((Internal.DoubleList) (new DoubleArrayList(Arrays.copyOf(array, i), size)));
	//    8   16:new             #2   <Class DoubleArrayList>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:getfield        #34  <Field double[] array>
	//   12   24:iload_1         
	//   13   25:invokestatic    #114 <Method double[] Arrays.copyOf(double[], int)>
	//   14   28:aload_0         
	//   15   29:getfield        #36  <Field int size>
	//   16   32:invokespecial   #31  <Method void DoubleArrayList(double[], int)>
	//   17   35:areturn         
	}

	public volatile Internal.ProtobufList mutableCopyWithCapacity(int i)
	{
		return ((Internal.ProtobufList) (mutableCopyWithCapacity(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #154 <Method Internal$DoubleList mutableCopyWithCapacity(int)>
	//    3    5:areturn         
	}

	public Double remove(int i)
	{
		ensureIsMutable();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method void ensureIsMutable()>
		ensureIndexInRange(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #136 <Method void ensureIndexInRange(int)>
		double d = array[i];
	//    5    9:aload_0         
	//    6   10:getfield        #34  <Field double[] array>
	//    7   13:iload_1         
	//    8   14:daload          
	//    9   15:dstore_2        
		System.arraycopy(((Object) (array)), i + 1, ((Object) (array)), i, size - i);
	//   10   16:aload_0         
	//   11   17:getfield        #34  <Field double[] array>
	//   12   20:iload_1         
	//   13   21:iconst_1        
	//   14   22:iadd            
	//   15   23:aload_0         
	//   16   24:getfield        #34  <Field double[] array>
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
		return Double.valueOf(d);
	//   35   57:dload_2         
	//   36   58:invokestatic    #131 <Method Double Double.valueOf(double)>
	//   37   61:areturn         
	}

	public volatile Object remove(int i)
	{
		return ((Object) (remove(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #157 <Method Double remove(int)>
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
			if(obj.equals(((Object) (Double.valueOf(array[i])))))
	//*   8   14:aload_1         
	//*   9   15:aload_0         
	//*  10   16:getfield        #34  <Field double[] array>
	//*  11   19:iload_2         
	//*  12   20:daload          
	//*  13   21:invokestatic    #131 <Method Double Double.valueOf(double)>
	//*  14   24:invokevirtual   #160 <Method boolean Object.equals(Object)>
	//*  15   27:ifeq            73
			{
				System.arraycopy(((Object) (array)), i + 1, ((Object) (array)), i, size - i);
	//   16   30:aload_0         
	//   17   31:getfield        #34  <Field double[] array>
	//   18   34:iload_2         
	//   19   35:iconst_1        
	//   20   36:iadd            
	//   21   37:aload_0         
	//   22   38:getfield        #34  <Field double[] array>
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

	public Double set(int i, Double double1)
	{
		return Double.valueOf(setDouble(i, double1.doubleValue()));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #89  <Method double Double.doubleValue()>
	//    4    6:invokevirtual   #166 <Method double setDouble(int, double)>
	//    5    9:invokestatic    #131 <Method Double Double.valueOf(double)>
	//    6   12:areturn         
	}

	public volatile Object set(int i, Object obj)
	{
		return ((Object) (set(i, (Double)obj)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #85  <Class Double>
	//    4    6:invokevirtual   #169 <Method Double set(int, Double)>
	//    5    9:areturn         
	}

	public double setDouble(int i, double d)
	{
		ensureIsMutable();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method void ensureIsMutable()>
		ensureIndexInRange(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #136 <Method void ensureIndexInRange(int)>
		double d1 = array[i];
	//    5    9:aload_0         
	//    6   10:getfield        #34  <Field double[] array>
	//    7   13:iload_1         
	//    8   14:daload          
	//    9   15:dstore          4
		array[i] = d;
	//   10   17:aload_0         
	//   11   18:getfield        #34  <Field double[] array>
	//   12   21:iload_1         
	//   13   22:dload_2         
	//   14   23:dastore         
		return d1;
	//   15   24:dload           4
	//   16   26:dreturn         
	}

	public int size()
	{
		return size;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int size>
	//    2    4:ireturn         
	}

	private static final DoubleArrayList EMPTY_LIST;
	private double array[];
	private int size;

	static 
	{
		EMPTY_LIST = new DoubleArrayList();
	//    0    0:new             #2   <Class DoubleArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void DoubleArrayList()>
	//    3    7:putstatic       #24  <Field DoubleArrayList EMPTY_LIST>
		EMPTY_LIST.makeImmutable();
	//    4   10:getstatic       #24  <Field DoubleArrayList EMPTY_LIST>
	//    5   13:invokevirtual   #27  <Method void makeImmutable()>
	//*   6   16:return          
	}
}
