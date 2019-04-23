// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzef, zzge, zzhr, zzga

final class zzgt extends zzef
	implements zzge, zzhr, RandomAccess
{

	zzgt()
	{
		this(new long[10], 0);
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:newarray        long[]
	//    3    5:iconst_0        
	//    4    6:invokespecial   #31  <Method void zzgt(long[], int)>
	//    5    9:return          
	}

	private zzgt(long al[], int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void zzef()>
		zzyr = al;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #34  <Field long[] zzyr>
		size = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #36  <Field int size>
	//    8   14:return          
	}

	private final void zzaf(int i)
	{
		if(i >= 0 && i < size)
	//*   0    0:iload_1         
	//*   1    1:iflt            13
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #36  <Field int size>
	//*   5    9:icmpge          13
			return;
	//    6   12:return          
		else
			throw new IndexOutOfBoundsException(zzag(i));
	//    7   13:new             #40  <Class IndexOutOfBoundsException>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:invokespecial   #44  <Method String zzag(int)>
	//   12   22:invokespecial   #47  <Method void IndexOutOfBoundsException(String)>
	//   13   25:athrow          
	}

	private final String zzag(int i)
	{
		int j = size;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int size>
	//    2    4:istore_2        
		StringBuilder stringbuilder = new StringBuilder(35);
	//    3    5:new             #49  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:bipush          35
	//    6   11:invokespecial   #51  <Method void StringBuilder(int)>
	//    7   14:astore_3        
		stringbuilder.append("Index:");
	//    8   15:aload_3         
	//    9   16:ldc1            #53  <String "Index:">
	//   10   18:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(i);
	//   12   22:aload_3         
	//   13   23:iload_1         
	//   14   24:invokevirtual   #60  <Method StringBuilder StringBuilder.append(int)>
	//   15   27:pop             
		stringbuilder.append(", Size:");
	//   16   28:aload_3         
	//   17   29:ldc1            #62  <String ", Size:">
	//   18   31:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   19   34:pop             
		stringbuilder.append(j);
	//   20   35:aload_3         
	//   21   36:iload_2         
	//   22   37:invokevirtual   #60  <Method StringBuilder StringBuilder.append(int)>
	//   23   40:pop             
		return stringbuilder.toString();
	//   24   41:aload_3         
	//   25   42:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   26   45:areturn         
	}

	private final void zzk(int i, long l)
	{
		((zzef)this).zzcj();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method void zzef.zzcj()>
		if(i >= 0)
	//*   2    4:iload_1         
	//*   3    5:iflt            127
		{
			int j = size;
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field int size>
	//    6   12:istore          4
			if(i <= j)
	//*   7   14:iload_1         
	//*   8   15:iload           4
	//*   9   17:icmpgt          127
			{
				long al[] = zzyr;
	//   10   20:aload_0         
	//   11   21:getfield        #34  <Field long[] zzyr>
	//   12   24:astore          5
				if(j < al.length)
	//*  13   26:iload           4
	//*  14   28:aload           5
	//*  15   30:arraylength     
	//*  16   31:icmpge          52
				{
					System.arraycopy(((Object) (al)), i, ((Object) (al)), i + 1, j - i);
	//   17   34:aload           5
	//   18   36:iload_1         
	//   19   37:aload           5
	//   20   39:iload_1         
	//   21   40:iconst_1        
	//   22   41:iadd            
	//   23   42:iload           4
	//   24   44:iload_1         
	//   25   45:isub            
	//   26   46:invokestatic    #77  <Method void System.arraycopy(Object, int, Object, int, int)>
				} else
	//*  27   49:goto            99
				{
					long al1[] = new long[(j * 3) / 2 + 1];
	//   28   52:iload           4
	//   29   54:iconst_3        
	//   30   55:imul            
	//   31   56:iconst_2        
	//   32   57:idiv            
	//   33   58:iconst_1        
	//   34   59:iadd            
	//   35   60:newarray        long[]
	//   36   62:astore          6
					System.arraycopy(((Object) (al)), 0, ((Object) (al1)), 0, i);
	//   37   64:aload           5
	//   38   66:iconst_0        
	//   39   67:aload           6
	//   40   69:iconst_0        
	//   41   70:iload_1         
	//   42   71:invokestatic    #77  <Method void System.arraycopy(Object, int, Object, int, int)>
					System.arraycopy(((Object) (zzyr)), i, ((Object) (al1)), i + 1, size - i);
	//   43   74:aload_0         
	//   44   75:getfield        #34  <Field long[] zzyr>
	//   45   78:iload_1         
	//   46   79:aload           6
	//   47   81:iload_1         
	//   48   82:iconst_1        
	//   49   83:iadd            
	//   50   84:aload_0         
	//   51   85:getfield        #36  <Field int size>
	//   52   88:iload_1         
	//   53   89:isub            
	//   54   90:invokestatic    #77  <Method void System.arraycopy(Object, int, Object, int, int)>
					zzyr = al1;
	//   55   93:aload_0         
	//   56   94:aload           6
	//   57   96:putfield        #34  <Field long[] zzyr>
				}
				zzyr[i] = l;
	//   58   99:aload_0         
	//   59  100:getfield        #34  <Field long[] zzyr>
	//   60  103:iload_1         
	//   61  104:lload_2         
	//   62  105:lastore         
				size = size + 1;
	//   63  106:aload_0         
	//   64  107:aload_0         
	//   65  108:getfield        #36  <Field int size>
	//   66  111:iconst_1        
	//   67  112:iadd            
	//   68  113:putfield        #36  <Field int size>
				modCount = modCount + 1;
	//   69  116:aload_0         
	//   70  117:aload_0         
	//   71  118:getfield        #80  <Field int modCount>
	//   72  121:iconst_1        
	//   73  122:iadd            
	//   74  123:putfield        #80  <Field int modCount>
				return;
	//   75  126:return          
			}
		}
		throw new IndexOutOfBoundsException(zzag(i));
	//   76  127:new             #40  <Class IndexOutOfBoundsException>
	//   77  130:dup             
	//   78  131:aload_0         
	//   79  132:iload_1         
	//   80  133:invokespecial   #44  <Method String zzag(int)>
	//   81  136:invokespecial   #47  <Method void IndexOutOfBoundsException(String)>
	//   82  139:athrow          
	}

	public final void add(int i, Object obj)
	{
		zzk(i, ((Long)obj).longValue());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #84  <Class Long>
	//    4    6:invokevirtual   #88  <Method long Long.longValue()>
	//    5    9:invokespecial   #90  <Method void zzk(int, long)>
	//    6   12:return          
	}

	public final boolean addAll(Collection collection)
	{
		((zzef)this).zzcj();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method void zzef.zzcj()>
		zzga.checkNotNull(((Object) (collection)));
	//    2    4:aload_1         
	//    3    5:invokestatic    #98  <Method Object zzga.checkNotNull(Object)>
	//    4    8:pop             
		if(!(collection instanceof zzgt))
	//*   5    9:aload_1         
	//*   6   10:instanceof      #2   <Class zzgt>
	//*   7   13:ifne            22
			return super.addAll(collection);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #100 <Method boolean zzef.addAll(Collection)>
	//   11   21:ireturn         
		collection = ((Collection) ((zzgt)collection));
	//   12   22:aload_1         
	//   13   23:checkcast       #2   <Class zzgt>
	//   14   26:astore_1        
		int i = ((zzgt) (collection)).size;
	//   15   27:aload_1         
	//   16   28:getfield        #36  <Field int size>
	//   17   31:istore_2        
		if(i == 0)
	//*  18   32:iload_2         
	//*  19   33:ifne            38
			return false;
	//   20   36:iconst_0        
	//   21   37:ireturn         
		int j = size;
	//   22   38:aload_0         
	//   23   39:getfield        #36  <Field int size>
	//   24   42:istore_3        
		if(0x7fffffff - j >= i)
	//*  25   43:ldc1            #101 <Int 0x7fffffff>
	//*  26   45:iload_3         
	//*  27   46:isub            
	//*  28   47:iload_2         
	//*  29   48:icmplt          115
		{
			i = j + i;
	//   30   51:iload_3         
	//   31   52:iload_2         
	//   32   53:iadd            
	//   33   54:istore_2        
			long al[] = zzyr;
	//   34   55:aload_0         
	//   35   56:getfield        #34  <Field long[] zzyr>
	//   36   59:astore          4
			if(i > al.length)
	//*  37   61:iload_2         
	//*  38   62:aload           4
	//*  39   64:arraylength     
	//*  40   65:icmple          78
				zzyr = Arrays.copyOf(al, i);
	//   41   68:aload_0         
	//   42   69:aload           4
	//   43   71:iload_2         
	//   44   72:invokestatic    #107 <Method long[] Arrays.copyOf(long[], int)>
	//   45   75:putfield        #34  <Field long[] zzyr>
			System.arraycopy(((Object) (((zzgt) (collection)).zzyr)), 0, ((Object) (zzyr)), size, ((zzgt) (collection)).size);
	//   46   78:aload_1         
	//   47   79:getfield        #34  <Field long[] zzyr>
	//   48   82:iconst_0        
	//   49   83:aload_0         
	//   50   84:getfield        #34  <Field long[] zzyr>
	//   51   87:aload_0         
	//   52   88:getfield        #36  <Field int size>
	//   53   91:aload_1         
	//   54   92:getfield        #36  <Field int size>
	//   55   95:invokestatic    #77  <Method void System.arraycopy(Object, int, Object, int, int)>
			size = i;
	//   56   98:aload_0         
	//   57   99:iload_2         
	//   58  100:putfield        #36  <Field int size>
			modCount = modCount + 1;
	//   59  103:aload_0         
	//   60  104:aload_0         
	//   61  105:getfield        #80  <Field int modCount>
	//   62  108:iconst_1        
	//   63  109:iadd            
	//   64  110:putfield        #80  <Field int modCount>
			return true;
	//   65  113:iconst_1        
	//   66  114:ireturn         
		} else
		{
			throw new OutOfMemoryError();
	//   67  115:new             #109 <Class OutOfMemoryError>
	//   68  118:dup             
	//   69  119:invokespecial   #110 <Method void OutOfMemoryError()>
	//   70  122:athrow          
		}
	}

	public final boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof zzgt))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzgt>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #116 <Method boolean zzef.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((zzgt)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class zzgt>
	//   14   24:astore_1        
		if(size != ((zzgt) (obj)).size)
	//*  15   25:aload_0         
	//*  16   26:getfield        #36  <Field int size>
	//*  17   29:aload_1         
	//*  18   30:getfield        #36  <Field int size>
	//*  19   33:icmpeq          38
			return false;
	//   20   36:iconst_0        
	//   21   37:ireturn         
		obj = ((Object) (((zzgt) (obj)).zzyr));
	//   22   38:aload_1         
	//   23   39:getfield        #34  <Field long[] zzyr>
	//   24   42:astore_1        
		for(int i = 0; i < size; i++)
	//*  25   43:iconst_0        
	//*  26   44:istore_2        
	//*  27   45:iload_2         
	//*  28   46:aload_0         
	//*  29   47:getfield        #36  <Field int size>
	//*  30   50:icmpge          75
			if(zzyr[i] != obj[i])
	//*  31   53:aload_0         
	//*  32   54:getfield        #34  <Field long[] zzyr>
	//*  33   57:iload_2         
	//*  34   58:laload          
	//*  35   59:aload_1         
	//*  36   60:iload_2         
	//*  37   61:laload          
	//*  38   62:lcmp            
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

	public final Object get(int i)
	{
		return ((Object) (Long.valueOf(getLong(i))));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #122 <Method long getLong(int)>
	//    3    5:invokestatic    #126 <Method Long Long.valueOf(long)>
	//    4    8:areturn         
	}

	public final long getLong(int i)
	{
		zzaf(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #128 <Method void zzaf(int)>
		return zzyr[i];
	//    3    5:aload_0         
	//    4    6:getfield        #34  <Field long[] zzyr>
	//    5    9:iload_1         
	//    6   10:laload          
	//    7   11:lreturn         
	}

	public final int hashCode()
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
			j = j * 31 + zzga.zzo(zzyr[i]);
	//    8   12:iload_2         
	//    9   13:bipush          31
	//   10   15:imul            
	//   11   16:aload_0         
	//   12   17:getfield        #34  <Field long[] zzyr>
	//   13   20:iload_1         
	//   14   21:laload          
	//   15   22:invokestatic    #134 <Method int zzga.zzo(long)>
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

	public final Object remove(int i)
	{
		((zzef)this).zzcj();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method void zzef.zzcj()>
		zzaf(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #128 <Method void zzaf(int)>
		long al[] = zzyr;
	//    5    9:aload_0         
	//    6   10:getfield        #34  <Field long[] zzyr>
	//    7   13:astore          5
		long l = al[i];
	//    8   15:aload           5
	//    9   17:iload_1         
	//   10   18:laload          
	//   11   19:lstore_3        
		int j = size;
	//   12   20:aload_0         
	//   13   21:getfield        #36  <Field int size>
	//   14   24:istore_2        
		if(i < j - 1)
	//*  15   25:iload_1         
	//*  16   26:iload_2         
	//*  17   27:iconst_1        
	//*  18   28:isub            
	//*  19   29:icmpge          46
			System.arraycopy(((Object) (al)), i + 1, ((Object) (al)), i, j - i);
	//   20   32:aload           5
	//   21   34:iload_1         
	//   22   35:iconst_1        
	//   23   36:iadd            
	//   24   37:aload           5
	//   25   39:iload_1         
	//   26   40:iload_2         
	//   27   41:iload_1         
	//   28   42:isub            
	//   29   43:invokestatic    #77  <Method void System.arraycopy(Object, int, Object, int, int)>
		size = size - 1;
	//   30   46:aload_0         
	//   31   47:aload_0         
	//   32   48:getfield        #36  <Field int size>
	//   33   51:iconst_1        
	//   34   52:isub            
	//   35   53:putfield        #36  <Field int size>
		modCount = modCount + 1;
	//   36   56:aload_0         
	//   37   57:aload_0         
	//   38   58:getfield        #80  <Field int modCount>
	//   39   61:iconst_1        
	//   40   62:iadd            
	//   41   63:putfield        #80  <Field int modCount>
		return ((Object) (Long.valueOf(l)));
	//   42   66:lload_3         
	//   43   67:invokestatic    #126 <Method Long Long.valueOf(long)>
	//   44   70:areturn         
	}

	public final boolean remove(Object obj)
	{
		((zzef)this).zzcj();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method void zzef.zzcj()>
		for(int i = 0; i < size; i++)
	//*   2    4:iconst_0        
	//*   3    5:istore_2        
	//*   4    6:iload_2         
	//*   5    7:aload_0         
	//*   6    8:getfield        #36  <Field int size>
	//*   7   11:icmpge          79
			if(obj.equals(((Object) (Long.valueOf(zzyr[i])))))
	//*   8   14:aload_1         
	//*   9   15:aload_0         
	//*  10   16:getfield        #34  <Field long[] zzyr>
	//*  11   19:iload_2         
	//*  12   20:laload          
	//*  13   21:invokestatic    #126 <Method Long Long.valueOf(long)>
	//*  14   24:invokevirtual   #138 <Method boolean Object.equals(Object)>
	//*  15   27:ifeq            72
			{
				obj = ((Object) (zzyr));
	//   16   30:aload_0         
	//   17   31:getfield        #34  <Field long[] zzyr>
	//   18   34:astore_1        
				System.arraycopy(obj, i + 1, obj, i, size - i);
	//   19   35:aload_1         
	//   20   36:iload_2         
	//   21   37:iconst_1        
	//   22   38:iadd            
	//   23   39:aload_1         
	//   24   40:iload_2         
	//   25   41:aload_0         
	//   26   42:getfield        #36  <Field int size>
	//   27   45:iload_2         
	//   28   46:isub            
	//   29   47:invokestatic    #77  <Method void System.arraycopy(Object, int, Object, int, int)>
				size = size - 1;
	//   30   50:aload_0         
	//   31   51:aload_0         
	//   32   52:getfield        #36  <Field int size>
	//   33   55:iconst_1        
	//   34   56:isub            
	//   35   57:putfield        #36  <Field int size>
				modCount = modCount + 1;
	//   36   60:aload_0         
	//   37   61:aload_0         
	//   38   62:getfield        #80  <Field int modCount>
	//   39   65:iconst_1        
	//   40   66:iadd            
	//   41   67:putfield        #80  <Field int modCount>
				return true;
	//   42   70:iconst_1        
	//   43   71:ireturn         
			}

	//   44   72:iload_2         
	//   45   73:iconst_1        
	//   46   74:iadd            
	//   47   75:istore_2        
	//*  48   76:goto            6
		return false;
	//   49   79:iconst_0        
	//   50   80:ireturn         
	}

	protected final void removeRange(int i, int j)
	{
		((zzef)this).zzcj();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method void zzef.zzcj()>
		if(j >= i)
	//*   2    4:iload_2         
	//*   3    5:iload_1         
	//*   4    6:icmplt          50
		{
			long al[] = zzyr;
	//    5    9:aload_0         
	//    6   10:getfield        #34  <Field long[] zzyr>
	//    7   13:astore_3        
			System.arraycopy(((Object) (al)), j, ((Object) (al)), i, size - j);
	//    8   14:aload_3         
	//    9   15:iload_2         
	//   10   16:aload_3         
	//   11   17:iload_1         
	//   12   18:aload_0         
	//   13   19:getfield        #36  <Field int size>
	//   14   22:iload_2         
	//   15   23:isub            
	//   16   24:invokestatic    #77  <Method void System.arraycopy(Object, int, Object, int, int)>
			size = size - (j - i);
	//   17   27:aload_0         
	//   18   28:aload_0         
	//   19   29:getfield        #36  <Field int size>
	//   20   32:iload_2         
	//   21   33:iload_1         
	//   22   34:isub            
	//   23   35:isub            
	//   24   36:putfield        #36  <Field int size>
			modCount = modCount + 1;
	//   25   39:aload_0         
	//   26   40:aload_0         
	//   27   41:getfield        #80  <Field int modCount>
	//   28   44:iconst_1        
	//   29   45:iadd            
	//   30   46:putfield        #80  <Field int modCount>
			return;
	//   31   49:return          
		} else
		{
			throw new IndexOutOfBoundsException("toIndex < fromIndex");
	//   32   50:new             #40  <Class IndexOutOfBoundsException>
	//   33   53:dup             
	//   34   54:ldc1            #142 <String "toIndex < fromIndex">
	//   35   56:invokespecial   #47  <Method void IndexOutOfBoundsException(String)>
	//   36   59:athrow          
		}
	}

	public final Object set(int i, Object obj)
	{
		long l = ((Long)obj).longValue();
	//    0    0:aload_2         
	//    1    1:checkcast       #84  <Class Long>
	//    2    4:invokevirtual   #88  <Method long Long.longValue()>
	//    3    7:lstore_3        
		((zzef)this).zzcj();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #71  <Method void zzef.zzcj()>
		zzaf(i);
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:invokespecial   #128 <Method void zzaf(int)>
		obj = ((Object) (zzyr));
	//    9   17:aload_0         
	//   10   18:getfield        #34  <Field long[] zzyr>
	//   11   21:astore_2        
		long l1 = obj[i];
	//   12   22:aload_2         
	//   13   23:iload_1         
	//   14   24:laload          
	//   15   25:lstore          5
		obj[i] = l;
	//   16   27:aload_2         
	//   17   28:iload_1         
	//   18   29:lload_3         
	//   19   30:lastore         
		return ((Object) (Long.valueOf(l1)));
	//   20   31:lload           5
	//   21   33:invokestatic    #126 <Method Long Long.valueOf(long)>
	//   22   36:areturn         
	}

	public final int size()
	{
		return size;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int size>
	//    2    4:ireturn         
	}

	public final zzge zzah(int i)
	{
		if(i >= size)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #36  <Field int size>
	//*   3    5:icmplt          28
			return ((zzge) (new zzgt(Arrays.copyOf(zzyr, i), size)));
	//    4    8:new             #2   <Class zzgt>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #34  <Field long[] zzyr>
	//    8   16:iload_1         
	//    9   17:invokestatic    #107 <Method long[] Arrays.copyOf(long[], int)>
	//   10   20:aload_0         
	//   11   21:getfield        #36  <Field int size>
	//   12   24:invokespecial   #31  <Method void zzgt(long[], int)>
	//   13   27:areturn         
		else
			throw new IllegalArgumentException();
	//   14   28:new             #148 <Class IllegalArgumentException>
	//   15   31:dup             
	//   16   32:invokespecial   #149 <Method void IllegalArgumentException()>
	//   17   35:athrow          
	}

	public final void zzp(long l)
	{
		zzk(size, l);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #36  <Field int size>
	//    3    5:lload_1         
	//    4    6:invokespecial   #90  <Method void zzk(int, long)>
	//    5    9:return          
	}

	private static final zzgt zzyq;
	private int size;
	private long zzyr[];

	static 
	{
		zzgt zzgt1 = new zzgt();
	//    0    0:new             #2   <Class zzgt>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void zzgt()>
	//    3    7:astore_0        
		zzyq = zzgt1;
	//    4    8:aload_0         
	//    5    9:putstatic       #24  <Field zzgt zzyq>
		((zzef) (zzgt1)).zzci();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #27  <Method void zzef.zzci()>
	//*   8   16:return          
	}
}
