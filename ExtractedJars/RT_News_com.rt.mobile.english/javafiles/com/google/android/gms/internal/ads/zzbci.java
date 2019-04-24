// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbab, zzbbt, zzbbq

final class zzbci extends zzbab
	implements zzbbt, RandomAccess
{

	zzbci()
	{
		this(new long[10], 0);
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:newarray        long[]
	//    3    5:iconst_0        
	//    4    6:invokespecial   #29  <Method void zzbci(long[], int)>
	//    5    9:return          
	}

	private zzbci(long al[], int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void zzbab()>
		zzdvu = al;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #32  <Field long[] zzdvu>
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

	private final void zzk(int i, long l)
	{
		((zzbab)this).zzaba();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #69  <Method void zzbab.zzaba()>
		if(i >= 0 && i <= size)
	//*   2    4:iload_1         
	//*   3    5:iflt            134
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:getfield        #34  <Field int size>
	//*   7   13:icmple          19
	//*   8   16:goto            134
		{
			if(size < zzdvu.length)
	//*   9   19:aload_0         
	//*  10   20:getfield        #34  <Field int size>
	//*  11   23:aload_0         
	//*  12   24:getfield        #32  <Field long[] zzdvu>
	//*  13   27:arraylength     
	//*  14   28:icmpge          55
			{
				System.arraycopy(((Object) (zzdvu)), i, ((Object) (zzdvu)), i + 1, size - i);
	//   15   31:aload_0         
	//   16   32:getfield        #32  <Field long[] zzdvu>
	//   17   35:iload_1         
	//   18   36:aload_0         
	//   19   37:getfield        #32  <Field long[] zzdvu>
	//   20   40:iload_1         
	//   21   41:iconst_1        
	//   22   42:iadd            
	//   23   43:aload_0         
	//   24   44:getfield        #34  <Field int size>
	//   25   47:iload_1         
	//   26   48:isub            
	//   27   49:invokestatic    #75  <Method void System.arraycopy(Object, int, Object, int, int)>
			} else
	//*  28   52:goto            106
			{
				long al[] = new long[(size * 3) / 2 + 1];
	//   29   55:aload_0         
	//   30   56:getfield        #34  <Field int size>
	//   31   59:iconst_3        
	//   32   60:imul            
	//   33   61:iconst_2        
	//   34   62:idiv            
	//   35   63:iconst_1        
	//   36   64:iadd            
	//   37   65:newarray        long[]
	//   38   67:astore          4
				System.arraycopy(((Object) (zzdvu)), 0, ((Object) (al)), 0, i);
	//   39   69:aload_0         
	//   40   70:getfield        #32  <Field long[] zzdvu>
	//   41   73:iconst_0        
	//   42   74:aload           4
	//   43   76:iconst_0        
	//   44   77:iload_1         
	//   45   78:invokestatic    #75  <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (zzdvu)), i, ((Object) (al)), i + 1, size - i);
	//   46   81:aload_0         
	//   47   82:getfield        #32  <Field long[] zzdvu>
	//   48   85:iload_1         
	//   49   86:aload           4
	//   50   88:iload_1         
	//   51   89:iconst_1        
	//   52   90:iadd            
	//   53   91:aload_0         
	//   54   92:getfield        #34  <Field int size>
	//   55   95:iload_1         
	//   56   96:isub            
	//   57   97:invokestatic    #75  <Method void System.arraycopy(Object, int, Object, int, int)>
				zzdvu = al;
	//   58  100:aload_0         
	//   59  101:aload           4
	//   60  103:putfield        #32  <Field long[] zzdvu>
			}
			zzdvu[i] = l;
	//   61  106:aload_0         
	//   62  107:getfield        #32  <Field long[] zzdvu>
	//   63  110:iload_1         
	//   64  111:lload_2         
	//   65  112:lastore         
			size = size + 1;
	//   66  113:aload_0         
	//   67  114:aload_0         
	//   68  115:getfield        #34  <Field int size>
	//   69  118:iconst_1        
	//   70  119:iadd            
	//   71  120:putfield        #34  <Field int size>
			modCount = modCount + 1;
	//   72  123:aload_0         
	//   73  124:aload_0         
	//   74  125:getfield        #78  <Field int modCount>
	//   75  128:iconst_1        
	//   76  129:iadd            
	//   77  130:putfield        #78  <Field int modCount>
			return;
	//   78  133:return          
		} else
		{
			throw new IndexOutOfBoundsException(zzbl(i));
	//   79  134:new             #38  <Class IndexOutOfBoundsException>
	//   80  137:dup             
	//   81  138:aload_0         
	//   82  139:iload_1         
	//   83  140:invokespecial   #42  <Method String zzbl(int)>
	//   84  143:invokespecial   #45  <Method void IndexOutOfBoundsException(String)>
	//   85  146:athrow          
		}
	}

	public final void add(int i, Object obj)
	{
		zzk(i, ((Long)obj).longValue());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #82  <Class Long>
	//    4    6:invokevirtual   #86  <Method long Long.longValue()>
	//    5    9:invokespecial   #88  <Method void zzk(int, long)>
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
		if(!(collection instanceof zzbci))
	//*   5    9:aload_1         
	//*   6   10:instanceof      #2   <Class zzbci>
	//*   7   13:ifne            22
			return super.addAll(collection);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #98  <Method boolean zzbab.addAll(Collection)>
	//   11   21:ireturn         
		collection = ((Collection) ((zzbci)collection));
	//   12   22:aload_1         
	//   13   23:checkcast       #2   <Class zzbci>
	//   14   26:astore_1        
		if(((zzbci) (collection)).size == 0)
	//*  15   27:aload_1         
	//*  16   28:getfield        #34  <Field int size>
	//*  17   31:ifne            36
			return false;
	//   18   34:iconst_0        
	//   19   35:ireturn         
		if(0x7fffffff - size < ((zzbci) (collection)).size)
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
		int i = size + ((zzbci) (collection)).size;
	//   31   58:aload_0         
	//   32   59:getfield        #34  <Field int size>
	//   33   62:aload_1         
	//   34   63:getfield        #34  <Field int size>
	//   35   66:iadd            
	//   36   67:istore_2        
		if(i > zzdvu.length)
	//*  37   68:iload_2         
	//*  38   69:aload_0         
	//*  39   70:getfield        #32  <Field long[] zzdvu>
	//*  40   73:arraylength     
	//*  41   74:icmple          89
			zzdvu = Arrays.copyOf(zzdvu, i);
	//   42   77:aload_0         
	//   43   78:aload_0         
	//   44   79:getfield        #32  <Field long[] zzdvu>
	//   45   82:iload_2         
	//   46   83:invokestatic    #108 <Method long[] Arrays.copyOf(long[], int)>
	//   47   86:putfield        #32  <Field long[] zzdvu>
		System.arraycopy(((Object) (((zzbci) (collection)).zzdvu)), 0, ((Object) (zzdvu)), size, ((zzbci) (collection)).size);
	//   48   89:aload_1         
	//   49   90:getfield        #32  <Field long[] zzdvu>
	//   50   93:iconst_0        
	//   51   94:aload_0         
	//   52   95:getfield        #32  <Field long[] zzdvu>
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
		if(!(obj instanceof zzbci))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzbci>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #114 <Method boolean zzbab.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((zzbci)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class zzbci>
	//   14   24:astore_1        
		if(size != ((zzbci) (obj)).size)
	//*  15   25:aload_0         
	//*  16   26:getfield        #34  <Field int size>
	//*  17   29:aload_1         
	//*  18   30:getfield        #34  <Field int size>
	//*  19   33:icmpeq          38
			return false;
	//   20   36:iconst_0        
	//   21   37:ireturn         
		obj = ((Object) (((zzbci) (obj)).zzdvu));
	//   22   38:aload_1         
	//   23   39:getfield        #32  <Field long[] zzdvu>
	//   24   42:astore_1        
		for(int i = 0; i < size; i++)
	//*  25   43:iconst_0        
	//*  26   44:istore_2        
	//*  27   45:iload_2         
	//*  28   46:aload_0         
	//*  29   47:getfield        #34  <Field int size>
	//*  30   50:icmpge          75
			if(zzdvu[i] != obj[i])
	//*  31   53:aload_0         
	//*  32   54:getfield        #32  <Field long[] zzdvu>
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
	//    2    2:invokevirtual   #120 <Method long getLong(int)>
	//    3    5:invokestatic    #124 <Method Long Long.valueOf(long)>
	//    4    8:areturn         
	}

	public final long getLong(int i)
	{
		zzbk(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #126 <Method void zzbk(int)>
		return zzdvu[i];
	//    3    5:aload_0         
	//    4    6:getfield        #32  <Field long[] zzdvu>
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
	//*   6    6:getfield        #34  <Field int size>
	//*   7    9:icmpge          34
			j = j * 31 + zzbbq.zzv(zzdvu[i]);
	//    8   12:iload_2         
	//    9   13:bipush          31
	//   10   15:imul            
	//   11   16:aload_0         
	//   12   17:getfield        #32  <Field long[] zzdvu>
	//   13   20:iload_1         
	//   14   21:laload          
	//   15   22:invokestatic    #132 <Method int zzbbq.zzv(long)>
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
		((zzbab)this).zzaba();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #69  <Method void zzbab.zzaba()>
		zzbk(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #126 <Method void zzbk(int)>
		long l = zzdvu[i];
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field long[] zzdvu>
	//    7   13:iload_1         
	//    8   14:laload          
	//    9   15:lstore_2        
		if(i < size - 1)
	//*  10   16:iload_1         
	//*  11   17:aload_0         
	//*  12   18:getfield        #34  <Field int size>
	//*  13   21:iconst_1        
	//*  14   22:isub            
	//*  15   23:icmpge          47
			System.arraycopy(((Object) (zzdvu)), i + 1, ((Object) (zzdvu)), i, size - i);
	//   16   26:aload_0         
	//   17   27:getfield        #32  <Field long[] zzdvu>
	//   18   30:iload_1         
	//   19   31:iconst_1        
	//   20   32:iadd            
	//   21   33:aload_0         
	//   22   34:getfield        #32  <Field long[] zzdvu>
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
		return ((Object) (Long.valueOf(l)));
	//   41   67:lload_2         
	//   42   68:invokestatic    #124 <Method Long Long.valueOf(long)>
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
			if(obj.equals(((Object) (Long.valueOf(zzdvu[i])))))
	//*   8   14:aload_1         
	//*   9   15:aload_0         
	//*  10   16:getfield        #32  <Field long[] zzdvu>
	//*  11   19:iload_2         
	//*  12   20:laload          
	//*  13   21:invokestatic    #124 <Method Long Long.valueOf(long)>
	//*  14   24:invokevirtual   #136 <Method boolean Object.equals(Object)>
	//*  15   27:ifeq            73
			{
				System.arraycopy(((Object) (zzdvu)), i + 1, ((Object) (zzdvu)), i, size - i);
	//   16   30:aload_0         
	//   17   31:getfield        #32  <Field long[] zzdvu>
	//   18   34:iload_2         
	//   19   35:iconst_1        
	//   20   36:iadd            
	//   21   37:aload_0         
	//   22   38:getfield        #32  <Field long[] zzdvu>
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
	//    7   13:ldc1            #140 <String "toIndex < fromIndex">
	//    8   15:invokespecial   #45  <Method void IndexOutOfBoundsException(String)>
	//    9   18:athrow          
		} else
		{
			System.arraycopy(((Object) (zzdvu)), j, ((Object) (zzdvu)), i, size - j);
	//   10   19:aload_0         
	//   11   20:getfield        #32  <Field long[] zzdvu>
	//   12   23:iload_2         
	//   13   24:aload_0         
	//   14   25:getfield        #32  <Field long[] zzdvu>
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
		long l = ((Long)obj).longValue();
	//    0    0:aload_2         
	//    1    1:checkcast       #82  <Class Long>
	//    2    4:invokevirtual   #86  <Method long Long.longValue()>
	//    3    7:lstore_3        
		((zzbab)this).zzaba();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #69  <Method void zzbab.zzaba()>
		zzbk(i);
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:invokespecial   #126 <Method void zzbk(int)>
		long l1 = zzdvu[i];
	//    9   17:aload_0         
	//   10   18:getfield        #32  <Field long[] zzdvu>
	//   11   21:iload_1         
	//   12   22:laload          
	//   13   23:lstore          5
		zzdvu[i] = l;
	//   14   25:aload_0         
	//   15   26:getfield        #32  <Field long[] zzdvu>
	//   16   29:iload_1         
	//   17   30:lload_3         
	//   18   31:lastore         
		return ((Object) (Long.valueOf(l1)));
	//   19   32:lload           5
	//   20   34:invokestatic    #124 <Method Long Long.valueOf(long)>
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
	//    4    8:new             #146 <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:invokespecial   #147 <Method void IllegalArgumentException()>
	//    7   15:athrow          
		else
			return ((zzbbt) (new zzbci(Arrays.copyOf(zzdvu, i), size)));
	//    8   16:new             #2   <Class zzbci>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:getfield        #32  <Field long[] zzdvu>
	//   12   24:iload_1         
	//   13   25:invokestatic    #108 <Method long[] Arrays.copyOf(long[], int)>
	//   14   28:aload_0         
	//   15   29:getfield        #34  <Field int size>
	//   16   32:invokespecial   #29  <Method void zzbci(long[], int)>
	//   17   35:areturn         
	}

	public final void zzw(long l)
	{
		zzk(size, l);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #34  <Field int size>
	//    3    5:lload_1         
	//    4    6:invokespecial   #88  <Method void zzk(int, long)>
	//    5    9:return          
	}

	private static final zzbci zzdvt;
	private int size;
	private long zzdvu[];

	static 
	{
		zzbci zzbci1 = new zzbci();
	//    0    0:new             #2   <Class zzbci>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void zzbci()>
	//    3    7:astore_0        
		zzdvt = zzbci1;
	//    4    8:aload_0         
	//    5    9:putstatic       #22  <Field zzbci zzdvt>
		((zzbab) (zzbci1)).zzaaz();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #25  <Method void zzbab.zzaaz()>
	//*   8   16:return          
	}
}
