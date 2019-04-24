// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbab, zzbbt, zzbbq

final class zzbbp extends zzbab
	implements zzbbt, RandomAccess
{

	zzbbp()
	{
		this(new int[10], 0);
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:newarray        int[]
	//    3    5:iconst_0        
	//    4    6:invokespecial   #29  <Method void zzbbp(int[], int)>
	//    5    9:return          
	}

	private zzbbp(int ai[], int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void zzbab()>
		zzdup = ai;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #32  <Field int[] zzdup>
		size = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #34  <Field int size>
	//    8   14:return          
	}

	private final void zzbk(int i)
	{
		if(i >= 0 && i < size)
	//*   0    0:iload_1         
	//*   1    1:iflt            16
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #34  <Field int size>
	//*   5    9:icmplt          15
	//*   6   12:goto            16
			return;
	//    7   15:return          
		else
			throw new IndexOutOfBoundsException(zzbl(i));
	//    8   16:new             #38  <Class IndexOutOfBoundsException>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:iload_1         
	//   12   22:invokespecial   #42  <Method String zzbl(int)>
	//   13   25:invokespecial   #45  <Method void IndexOutOfBoundsException(String)>
	//   14   28:athrow          
	}

	private final String zzbl(int i)
	{
		int j = size;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int size>
	//    2    4:istore_2        
		StringBuilder stringbuilder = new StringBuilder(35);
	//    3    5:new             #47  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:bipush          35
	//    6   11:invokespecial   #49  <Method void StringBuilder(int)>
	//    7   14:astore_3        
		stringbuilder.append("Index:");
	//    8   15:aload_3         
	//    9   16:ldc1            #51  <String "Index:">
	//   10   18:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(i);
	//   12   22:aload_3         
	//   13   23:iload_1         
	//   14   24:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
	//   15   27:pop             
		stringbuilder.append(", Size:");
	//   16   28:aload_3         
	//   17   29:ldc1            #60  <String ", Size:">
	//   18   31:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   19   34:pop             
		stringbuilder.append(j);
	//   20   35:aload_3         
	//   21   36:iload_2         
	//   22   37:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
	//   23   40:pop             
		return stringbuilder.toString();
	//   24   41:aload_3         
	//   25   42:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   26   45:areturn         
	}

	private final void zzy(int i, int j)
	{
		((zzbab)this).zzaba();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #69  <Method void zzbab.zzaba()>
		if(i >= 0 && i <= size)
	//*   2    4:iload_1         
	//*   3    5:iflt            130
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:getfield        #34  <Field int size>
	//*   7   13:icmple          19
	//*   8   16:goto            130
		{
			if(size < zzdup.length)
	//*   9   19:aload_0         
	//*  10   20:getfield        #34  <Field int size>
	//*  11   23:aload_0         
	//*  12   24:getfield        #32  <Field int[] zzdup>
	//*  13   27:arraylength     
	//*  14   28:icmpge          55
			{
				System.arraycopy(((Object) (zzdup)), i, ((Object) (zzdup)), i + 1, size - i);
	//   15   31:aload_0         
	//   16   32:getfield        #32  <Field int[] zzdup>
	//   17   35:iload_1         
	//   18   36:aload_0         
	//   19   37:getfield        #32  <Field int[] zzdup>
	//   20   40:iload_1         
	//   21   41:iconst_1        
	//   22   42:iadd            
	//   23   43:aload_0         
	//   24   44:getfield        #34  <Field int size>
	//   25   47:iload_1         
	//   26   48:isub            
	//   27   49:invokestatic    #75  <Method void System.arraycopy(Object, int, Object, int, int)>
			} else
	//*  28   52:goto            102
			{
				int ai[] = new int[(size * 3) / 2 + 1];
	//   29   55:aload_0         
	//   30   56:getfield        #34  <Field int size>
	//   31   59:iconst_3        
	//   32   60:imul            
	//   33   61:iconst_2        
	//   34   62:idiv            
	//   35   63:iconst_1        
	//   36   64:iadd            
	//   37   65:newarray        int[]
	//   38   67:astore_3        
				System.arraycopy(((Object) (zzdup)), 0, ((Object) (ai)), 0, i);
	//   39   68:aload_0         
	//   40   69:getfield        #32  <Field int[] zzdup>
	//   41   72:iconst_0        
	//   42   73:aload_3         
	//   43   74:iconst_0        
	//   44   75:iload_1         
	//   45   76:invokestatic    #75  <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (zzdup)), i, ((Object) (ai)), i + 1, size - i);
	//   46   79:aload_0         
	//   47   80:getfield        #32  <Field int[] zzdup>
	//   48   83:iload_1         
	//   49   84:aload_3         
	//   50   85:iload_1         
	//   51   86:iconst_1        
	//   52   87:iadd            
	//   53   88:aload_0         
	//   54   89:getfield        #34  <Field int size>
	//   55   92:iload_1         
	//   56   93:isub            
	//   57   94:invokestatic    #75  <Method void System.arraycopy(Object, int, Object, int, int)>
				zzdup = ai;
	//   58   97:aload_0         
	//   59   98:aload_3         
	//   60   99:putfield        #32  <Field int[] zzdup>
			}
			zzdup[i] = j;
	//   61  102:aload_0         
	//   62  103:getfield        #32  <Field int[] zzdup>
	//   63  106:iload_1         
	//   64  107:iload_2         
	//   65  108:iastore         
			size = size + 1;
	//   66  109:aload_0         
	//   67  110:aload_0         
	//   68  111:getfield        #34  <Field int size>
	//   69  114:iconst_1        
	//   70  115:iadd            
	//   71  116:putfield        #34  <Field int size>
			modCount = modCount + 1;
	//   72  119:aload_0         
	//   73  120:aload_0         
	//   74  121:getfield        #78  <Field int modCount>
	//   75  124:iconst_1        
	//   76  125:iadd            
	//   77  126:putfield        #78  <Field int modCount>
			return;
	//   78  129:return          
		} else
		{
			throw new IndexOutOfBoundsException(zzbl(i));
	//   79  130:new             #38  <Class IndexOutOfBoundsException>
	//   80  133:dup             
	//   81  134:aload_0         
	//   82  135:iload_1         
	//   83  136:invokespecial   #42  <Method String zzbl(int)>
	//   84  139:invokespecial   #45  <Method void IndexOutOfBoundsException(String)>
	//   85  142:athrow          
		}
	}

	public final void add(int i, Object obj)
	{
		zzy(i, ((Integer)obj).intValue());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #82  <Class Integer>
	//    4    6:invokevirtual   #86  <Method int Integer.intValue()>
	//    5    9:invokespecial   #88  <Method void zzy(int, int)>
	//    6   12:return          
	}

	public final boolean addAll(Collection collection)
	{
		((zzbab)this).zzaba();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #69  <Method void zzbab.zzaba()>
		zzbbq.checkNotNull(((Object) (collection)));
	//    2    4:aload_1         
	//    3    5:invokestatic    #96  <Method Object zzbbq.checkNotNull(Object)>
	//    4    8:pop             
		if(!(collection instanceof zzbbp))
	//*   5    9:aload_1         
	//*   6   10:instanceof      #2   <Class zzbbp>
	//*   7   13:ifne            22
			return super.addAll(collection);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #98  <Method boolean zzbab.addAll(Collection)>
	//   11   21:ireturn         
		collection = ((Collection) ((zzbbp)collection));
	//   12   22:aload_1         
	//   13   23:checkcast       #2   <Class zzbbp>
	//   14   26:astore_1        
		if(((zzbbp) (collection)).size == 0)
	//*  15   27:aload_1         
	//*  16   28:getfield        #34  <Field int size>
	//*  17   31:ifne            36
			return false;
	//   18   34:iconst_0        
	//   19   35:ireturn         
		if(0x7fffffff - size < ((zzbbp) (collection)).size)
	//*  20   36:ldc1            #99  <Int 0x7fffffff>
	//*  21   38:aload_0         
	//*  22   39:getfield        #34  <Field int size>
	//*  23   42:isub            
	//*  24   43:aload_1         
	//*  25   44:getfield        #34  <Field int size>
	//*  26   47:icmpge          58
			throw new OutOfMemoryError();
	//   27   50:new             #101 <Class OutOfMemoryError>
	//   28   53:dup             
	//   29   54:invokespecial   #102 <Method void OutOfMemoryError()>
	//   30   57:athrow          
		int i = size + ((zzbbp) (collection)).size;
	//   31   58:aload_0         
	//   32   59:getfield        #34  <Field int size>
	//   33   62:aload_1         
	//   34   63:getfield        #34  <Field int size>
	//   35   66:iadd            
	//   36   67:istore_2        
		if(i > zzdup.length)
	//*  37   68:iload_2         
	//*  38   69:aload_0         
	//*  39   70:getfield        #32  <Field int[] zzdup>
	//*  40   73:arraylength     
	//*  41   74:icmple          89
			zzdup = Arrays.copyOf(zzdup, i);
	//   42   77:aload_0         
	//   43   78:aload_0         
	//   44   79:getfield        #32  <Field int[] zzdup>
	//   45   82:iload_2         
	//   46   83:invokestatic    #108 <Method int[] Arrays.copyOf(int[], int)>
	//   47   86:putfield        #32  <Field int[] zzdup>
		System.arraycopy(((Object) (((zzbbp) (collection)).zzdup)), 0, ((Object) (zzdup)), size, ((zzbbp) (collection)).size);
	//   48   89:aload_1         
	//   49   90:getfield        #32  <Field int[] zzdup>
	//   50   93:iconst_0        
	//   51   94:aload_0         
	//   52   95:getfield        #32  <Field int[] zzdup>
	//   53   98:aload_0         
	//   54   99:getfield        #34  <Field int size>
	//   55  102:aload_1         
	//   56  103:getfield        #34  <Field int size>
	//   57  106:invokestatic    #75  <Method void System.arraycopy(Object, int, Object, int, int)>
		size = i;
	//   58  109:aload_0         
	//   59  110:iload_2         
	//   60  111:putfield        #34  <Field int size>
		modCount = modCount + 1;
	//   61  114:aload_0         
	//   62  115:aload_0         
	//   63  116:getfield        #78  <Field int modCount>
	//   64  119:iconst_1        
	//   65  120:iadd            
	//   66  121:putfield        #78  <Field int modCount>
		return true;
	//   67  124:iconst_1        
	//   68  125:ireturn         
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
		if(!(obj instanceof zzbbp))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzbbp>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #114 <Method boolean zzbab.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((zzbbp)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class zzbbp>
	//   14   24:astore_1        
		if(size != ((zzbbp) (obj)).size)
	//*  15   25:aload_0         
	//*  16   26:getfield        #34  <Field int size>
	//*  17   29:aload_1         
	//*  18   30:getfield        #34  <Field int size>
	//*  19   33:icmpeq          38
			return false;
	//   20   36:iconst_0        
	//   21   37:ireturn         
		obj = ((Object) (((zzbbp) (obj)).zzdup));
	//   22   38:aload_1         
	//   23   39:getfield        #32  <Field int[] zzdup>
	//   24   42:astore_1        
		for(int i = 0; i < size; i++)
	//*  25   43:iconst_0        
	//*  26   44:istore_2        
	//*  27   45:iload_2         
	//*  28   46:aload_0         
	//*  29   47:getfield        #34  <Field int size>
	//*  30   50:icmpge          74
			if(zzdup[i] != obj[i])
	//*  31   53:aload_0         
	//*  32   54:getfield        #32  <Field int[] zzdup>
	//*  33   57:iload_2         
	//*  34   58:iaload          
	//*  35   59:aload_1         
	//*  36   60:iload_2         
	//*  37   61:iaload          
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

	public final Object get(int i)
	{
		return ((Object) (Integer.valueOf(getInt(i))));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #120 <Method int getInt(int)>
	//    3    5:invokestatic    #124 <Method Integer Integer.valueOf(int)>
	//    4    8:areturn         
	}

	public final int getInt(int i)
	{
		zzbk(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #126 <Method void zzbk(int)>
		return zzdup[i];
	//    3    5:aload_0         
	//    4    6:getfield        #32  <Field int[] zzdup>
	//    5    9:iload_1         
	//    6   10:iaload          
	//    7   11:ireturn         
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
	//*   6    6:getfield        #34  <Field int size>
	//*   7    9:icmpge          31
			j = j * 31 + zzdup[i];
	//    8   12:iload_2         
	//    9   13:bipush          31
	//   10   15:imul            
	//   11   16:aload_0         
	//   12   17:getfield        #32  <Field int[] zzdup>
	//   13   20:iload_1         
	//   14   21:iaload          
	//   15   22:iadd            
	//   16   23:istore_2        

	//   17   24:iload_1         
	//   18   25:iconst_1        
	//   19   26:iadd            
	//   20   27:istore_1        
	//*  21   28:goto            4
		return j;
	//   22   31:iload_2         
	//   23   32:ireturn         
	}

	public final Object remove(int i)
	{
		((zzbab)this).zzaba();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #69  <Method void zzbab.zzaba()>
		zzbk(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #126 <Method void zzbk(int)>
		int j = zzdup[i];
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field int[] zzdup>
	//    7   13:iload_1         
	//    8   14:iaload          
	//    9   15:istore_2        
		if(i < size - 1)
	//*  10   16:iload_1         
	//*  11   17:aload_0         
	//*  12   18:getfield        #34  <Field int size>
	//*  13   21:iconst_1        
	//*  14   22:isub            
	//*  15   23:icmpge          47
			System.arraycopy(((Object) (zzdup)), i + 1, ((Object) (zzdup)), i, size - i);
	//   16   26:aload_0         
	//   17   27:getfield        #32  <Field int[] zzdup>
	//   18   30:iload_1         
	//   19   31:iconst_1        
	//   20   32:iadd            
	//   21   33:aload_0         
	//   22   34:getfield        #32  <Field int[] zzdup>
	//   23   37:iload_1         
	//   24   38:aload_0         
	//   25   39:getfield        #34  <Field int size>
	//   26   42:iload_1         
	//   27   43:isub            
	//   28   44:invokestatic    #75  <Method void System.arraycopy(Object, int, Object, int, int)>
		size = size - 1;
	//   29   47:aload_0         
	//   30   48:aload_0         
	//   31   49:getfield        #34  <Field int size>
	//   32   52:iconst_1        
	//   33   53:isub            
	//   34   54:putfield        #34  <Field int size>
		modCount = modCount + 1;
	//   35   57:aload_0         
	//   36   58:aload_0         
	//   37   59:getfield        #78  <Field int modCount>
	//   38   62:iconst_1        
	//   39   63:iadd            
	//   40   64:putfield        #78  <Field int modCount>
		return ((Object) (Integer.valueOf(j)));
	//   41   67:iload_2         
	//   42   68:invokestatic    #124 <Method Integer Integer.valueOf(int)>
	//   43   71:areturn         
	}

	public final boolean remove(Object obj)
	{
		((zzbab)this).zzaba();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #69  <Method void zzbab.zzaba()>
		for(int i = 0; i < size; i++)
	//*   2    4:iconst_0        
	//*   3    5:istore_2        
	//*   4    6:iload_2         
	//*   5    7:aload_0         
	//*   6    8:getfield        #34  <Field int size>
	//*   7   11:icmpge          80
			if(obj.equals(((Object) (Integer.valueOf(zzdup[i])))))
	//*   8   14:aload_1         
	//*   9   15:aload_0         
	//*  10   16:getfield        #32  <Field int[] zzdup>
	//*  11   19:iload_2         
	//*  12   20:iaload          
	//*  13   21:invokestatic    #124 <Method Integer Integer.valueOf(int)>
	//*  14   24:invokevirtual   #131 <Method boolean Object.equals(Object)>
	//*  15   27:ifeq            73
			{
				System.arraycopy(((Object) (zzdup)), i + 1, ((Object) (zzdup)), i, size - i);
	//   16   30:aload_0         
	//   17   31:getfield        #32  <Field int[] zzdup>
	//   18   34:iload_2         
	//   19   35:iconst_1        
	//   20   36:iadd            
	//   21   37:aload_0         
	//   22   38:getfield        #32  <Field int[] zzdup>
	//   23   41:iload_2         
	//   24   42:aload_0         
	//   25   43:getfield        #34  <Field int size>
	//   26   46:iload_2         
	//   27   47:isub            
	//   28   48:invokestatic    #75  <Method void System.arraycopy(Object, int, Object, int, int)>
				size = size - 1;
	//   29   51:aload_0         
	//   30   52:aload_0         
	//   31   53:getfield        #34  <Field int size>
	//   32   56:iconst_1        
	//   33   57:isub            
	//   34   58:putfield        #34  <Field int size>
				modCount = modCount + 1;
	//   35   61:aload_0         
	//   36   62:aload_0         
	//   37   63:getfield        #78  <Field int modCount>
	//   38   66:iconst_1        
	//   39   67:iadd            
	//   40   68:putfield        #78  <Field int modCount>
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

	protected final void removeRange(int i, int j)
	{
		((zzbab)this).zzaba();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #69  <Method void zzbab.zzaba()>
		if(j < i)
	//*   2    4:iload_2         
	//*   3    5:iload_1         
	//*   4    6:icmpge          19
		{
			throw new IndexOutOfBoundsException("toIndex < fromIndex");
	//    5    9:new             #38  <Class IndexOutOfBoundsException>
	//    6   12:dup             
	//    7   13:ldc1            #134 <String "toIndex < fromIndex">
	//    8   15:invokespecial   #45  <Method void IndexOutOfBoundsException(String)>
	//    9   18:athrow          
		} else
		{
			System.arraycopy(((Object) (zzdup)), j, ((Object) (zzdup)), i, size - j);
	//   10   19:aload_0         
	//   11   20:getfield        #32  <Field int[] zzdup>
	//   12   23:iload_2         
	//   13   24:aload_0         
	//   14   25:getfield        #32  <Field int[] zzdup>
	//   15   28:iload_1         
	//   16   29:aload_0         
	//   17   30:getfield        #34  <Field int size>
	//   18   33:iload_2         
	//   19   34:isub            
	//   20   35:invokestatic    #75  <Method void System.arraycopy(Object, int, Object, int, int)>
			size = size - (j - i);
	//   21   38:aload_0         
	//   22   39:aload_0         
	//   23   40:getfield        #34  <Field int size>
	//   24   43:iload_2         
	//   25   44:iload_1         
	//   26   45:isub            
	//   27   46:isub            
	//   28   47:putfield        #34  <Field int size>
			modCount = modCount + 1;
	//   29   50:aload_0         
	//   30   51:aload_0         
	//   31   52:getfield        #78  <Field int modCount>
	//   32   55:iconst_1        
	//   33   56:iadd            
	//   34   57:putfield        #78  <Field int modCount>
			return;
	//   35   60:return          
		}
	}

	public final Object set(int i, Object obj)
	{
		int j = ((Integer)obj).intValue();
	//    0    0:aload_2         
	//    1    1:checkcast       #82  <Class Integer>
	//    2    4:invokevirtual   #86  <Method int Integer.intValue()>
	//    3    7:istore_3        
		((zzbab)this).zzaba();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #69  <Method void zzbab.zzaba()>
		zzbk(i);
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:invokespecial   #126 <Method void zzbk(int)>
		int k = zzdup[i];
	//    9   17:aload_0         
	//   10   18:getfield        #32  <Field int[] zzdup>
	//   11   21:iload_1         
	//   12   22:iaload          
	//   13   23:istore          4
		zzdup[i] = j;
	//   14   25:aload_0         
	//   15   26:getfield        #32  <Field int[] zzdup>
	//   16   29:iload_1         
	//   17   30:iload_3         
	//   18   31:iastore         
		return ((Object) (Integer.valueOf(k)));
	//   19   32:iload           4
	//   20   34:invokestatic    #124 <Method Integer Integer.valueOf(int)>
	//   21   37:areturn         
	}

	public final int size()
	{
		return size;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int size>
	//    2    4:ireturn         
	}

	public final zzbbt zzbm(int i)
	{
		if(i < size)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #34  <Field int size>
	//*   3    5:icmpge          16
			throw new IllegalArgumentException();
	//    4    8:new             #140 <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:invokespecial   #141 <Method void IllegalArgumentException()>
	//    7   15:athrow          
		else
			return ((zzbbt) (new zzbbp(Arrays.copyOf(zzdup, i), size)));
	//    8   16:new             #2   <Class zzbbp>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:getfield        #32  <Field int[] zzdup>
	//   12   24:iload_1         
	//   13   25:invokestatic    #108 <Method int[] Arrays.copyOf(int[], int)>
	//   14   28:aload_0         
	//   15   29:getfield        #34  <Field int size>
	//   16   32:invokespecial   #29  <Method void zzbbp(int[], int)>
	//   17   35:areturn         
	}

	public final void zzco(int i)
	{
		zzy(size, i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #34  <Field int size>
	//    3    5:iload_1         
	//    4    6:invokespecial   #88  <Method void zzy(int, int)>
	//    5    9:return          
	}

	private static final zzbbp zzduo;
	private int size;
	private int zzdup[];

	static 
	{
		zzbbp zzbbp1 = new zzbbp();
	//    0    0:new             #2   <Class zzbbp>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void zzbbp()>
	//    3    7:astore_0        
		zzduo = zzbbp1;
	//    4    8:aload_0         
	//    5    9:putstatic       #22  <Field zzbbp zzduo>
		((zzbab) (zzbbp1)).zzaaz();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #25  <Method void zzbab.zzaaz()>
	//*   8   16:return          
	}
}
