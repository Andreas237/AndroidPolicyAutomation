// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzta, zzuu, zzwg, zzuq

final class zzvj extends zzta
	implements zzuu, zzwg, RandomAccess
{

	zzvj()
	{
		this(new long[10], 0);
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:newarray        long[]
	//    3    5:iconst_0        
	//    4    6:invokespecial   #31  <Method void zzvj(long[], int)>
	//    5    9:return          
	}

	private zzvj(long al[], int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void zzta()>
		zzcag = al;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #34  <Field long[] zzcag>
		size = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #36  <Field int size>
	//    8   14:return          
	}

	private final void zzaj(int i)
	{
		if(i >= 0 && i < size)
	//*   0    0:iload_1         
	//*   1    1:iflt            16
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #36  <Field int size>
	//*   5    9:icmplt          15
	//*   6   12:goto            16
			return;
	//    7   15:return          
		else
			throw new IndexOutOfBoundsException(zzak(i));
	//    8   16:new             #40  <Class IndexOutOfBoundsException>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:iload_1         
	//   12   22:invokespecial   #44  <Method String zzak(int)>
	//   13   25:invokespecial   #47  <Method void IndexOutOfBoundsException(String)>
	//   14   28:athrow          
	}

	private final String zzak(int i)
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
		((zzta)this).zzua();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method void zzta.zzua()>
		if(i >= 0 && i <= size)
	//*   2    4:iload_1         
	//*   3    5:iflt            134
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:getfield        #36  <Field int size>
	//*   7   13:icmple          19
	//*   8   16:goto            134
		{
			if(size < zzcag.length)
	//*   9   19:aload_0         
	//*  10   20:getfield        #36  <Field int size>
	//*  11   23:aload_0         
	//*  12   24:getfield        #34  <Field long[] zzcag>
	//*  13   27:arraylength     
	//*  14   28:icmpge          55
			{
				System.arraycopy(((Object) (zzcag)), i, ((Object) (zzcag)), i + 1, size - i);
	//   15   31:aload_0         
	//   16   32:getfield        #34  <Field long[] zzcag>
	//   17   35:iload_1         
	//   18   36:aload_0         
	//   19   37:getfield        #34  <Field long[] zzcag>
	//   20   40:iload_1         
	//   21   41:iconst_1        
	//   22   42:iadd            
	//   23   43:aload_0         
	//   24   44:getfield        #36  <Field int size>
	//   25   47:iload_1         
	//   26   48:isub            
	//   27   49:invokestatic    #77  <Method void System.arraycopy(Object, int, Object, int, int)>
			} else
	//*  28   52:goto            106
			{
				long al[] = new long[(size * 3) / 2 + 1];
	//   29   55:aload_0         
	//   30   56:getfield        #36  <Field int size>
	//   31   59:iconst_3        
	//   32   60:imul            
	//   33   61:iconst_2        
	//   34   62:idiv            
	//   35   63:iconst_1        
	//   36   64:iadd            
	//   37   65:newarray        long[]
	//   38   67:astore          4
				System.arraycopy(((Object) (zzcag)), 0, ((Object) (al)), 0, i);
	//   39   69:aload_0         
	//   40   70:getfield        #34  <Field long[] zzcag>
	//   41   73:iconst_0        
	//   42   74:aload           4
	//   43   76:iconst_0        
	//   44   77:iload_1         
	//   45   78:invokestatic    #77  <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (zzcag)), i, ((Object) (al)), i + 1, size - i);
	//   46   81:aload_0         
	//   47   82:getfield        #34  <Field long[] zzcag>
	//   48   85:iload_1         
	//   49   86:aload           4
	//   50   88:iload_1         
	//   51   89:iconst_1        
	//   52   90:iadd            
	//   53   91:aload_0         
	//   54   92:getfield        #36  <Field int size>
	//   55   95:iload_1         
	//   56   96:isub            
	//   57   97:invokestatic    #77  <Method void System.arraycopy(Object, int, Object, int, int)>
				zzcag = al;
	//   58  100:aload_0         
	//   59  101:aload           4
	//   60  103:putfield        #34  <Field long[] zzcag>
			}
			zzcag[i] = l;
	//   61  106:aload_0         
	//   62  107:getfield        #34  <Field long[] zzcag>
	//   63  110:iload_1         
	//   64  111:lload_2         
	//   65  112:lastore         
			size = size + 1;
	//   66  113:aload_0         
	//   67  114:aload_0         
	//   68  115:getfield        #36  <Field int size>
	//   69  118:iconst_1        
	//   70  119:iadd            
	//   71  120:putfield        #36  <Field int size>
			modCount = modCount + 1;
	//   72  123:aload_0         
	//   73  124:aload_0         
	//   74  125:getfield        #80  <Field int modCount>
	//   75  128:iconst_1        
	//   76  129:iadd            
	//   77  130:putfield        #80  <Field int modCount>
			return;
	//   78  133:return          
		} else
		{
			throw new IndexOutOfBoundsException(zzak(i));
	//   79  134:new             #40  <Class IndexOutOfBoundsException>
	//   80  137:dup             
	//   81  138:aload_0         
	//   82  139:iload_1         
	//   83  140:invokespecial   #44  <Method String zzak(int)>
	//   84  143:invokespecial   #47  <Method void IndexOutOfBoundsException(String)>
	//   85  146:athrow          
		}
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
		((zzta)this).zzua();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method void zzta.zzua()>
		zzuq.checkNotNull(((Object) (collection)));
	//    2    4:aload_1         
	//    3    5:invokestatic    #98  <Method Object zzuq.checkNotNull(Object)>
	//    4    8:pop             
		if(!(collection instanceof zzvj))
	//*   5    9:aload_1         
	//*   6   10:instanceof      #2   <Class zzvj>
	//*   7   13:ifne            22
			return super.addAll(collection);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #100 <Method boolean zzta.addAll(Collection)>
	//   11   21:ireturn         
		collection = ((Collection) ((zzvj)collection));
	//   12   22:aload_1         
	//   13   23:checkcast       #2   <Class zzvj>
	//   14   26:astore_1        
		if(((zzvj) (collection)).size == 0)
	//*  15   27:aload_1         
	//*  16   28:getfield        #36  <Field int size>
	//*  17   31:ifne            36
			return false;
	//   18   34:iconst_0        
	//   19   35:ireturn         
		if(0x7fffffff - size < ((zzvj) (collection)).size)
	//*  20   36:ldc1            #101 <Int 0x7fffffff>
	//*  21   38:aload_0         
	//*  22   39:getfield        #36  <Field int size>
	//*  23   42:isub            
	//*  24   43:aload_1         
	//*  25   44:getfield        #36  <Field int size>
	//*  26   47:icmpge          58
			throw new OutOfMemoryError();
	//   27   50:new             #103 <Class OutOfMemoryError>
	//   28   53:dup             
	//   29   54:invokespecial   #104 <Method void OutOfMemoryError()>
	//   30   57:athrow          
		int i = size + ((zzvj) (collection)).size;
	//   31   58:aload_0         
	//   32   59:getfield        #36  <Field int size>
	//   33   62:aload_1         
	//   34   63:getfield        #36  <Field int size>
	//   35   66:iadd            
	//   36   67:istore_2        
		if(i > zzcag.length)
	//*  37   68:iload_2         
	//*  38   69:aload_0         
	//*  39   70:getfield        #34  <Field long[] zzcag>
	//*  40   73:arraylength     
	//*  41   74:icmple          89
			zzcag = Arrays.copyOf(zzcag, i);
	//   42   77:aload_0         
	//   43   78:aload_0         
	//   44   79:getfield        #34  <Field long[] zzcag>
	//   45   82:iload_2         
	//   46   83:invokestatic    #110 <Method long[] Arrays.copyOf(long[], int)>
	//   47   86:putfield        #34  <Field long[] zzcag>
		System.arraycopy(((Object) (((zzvj) (collection)).zzcag)), 0, ((Object) (zzcag)), size, ((zzvj) (collection)).size);
	//   48   89:aload_1         
	//   49   90:getfield        #34  <Field long[] zzcag>
	//   50   93:iconst_0        
	//   51   94:aload_0         
	//   52   95:getfield        #34  <Field long[] zzcag>
	//   53   98:aload_0         
	//   54   99:getfield        #36  <Field int size>
	//   55  102:aload_1         
	//   56  103:getfield        #36  <Field int size>
	//   57  106:invokestatic    #77  <Method void System.arraycopy(Object, int, Object, int, int)>
		size = i;
	//   58  109:aload_0         
	//   59  110:iload_2         
	//   60  111:putfield        #36  <Field int size>
		modCount = modCount + 1;
	//   61  114:aload_0         
	//   62  115:aload_0         
	//   63  116:getfield        #80  <Field int modCount>
	//   64  119:iconst_1        
	//   65  120:iadd            
	//   66  121:putfield        #80  <Field int modCount>
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
		if(!(obj instanceof zzvj))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzvj>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #116 <Method boolean zzta.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((zzvj)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class zzvj>
	//   14   24:astore_1        
		if(size != ((zzvj) (obj)).size)
	//*  15   25:aload_0         
	//*  16   26:getfield        #36  <Field int size>
	//*  17   29:aload_1         
	//*  18   30:getfield        #36  <Field int size>
	//*  19   33:icmpeq          38
			return false;
	//   20   36:iconst_0        
	//   21   37:ireturn         
		obj = ((Object) (((zzvj) (obj)).zzcag));
	//   22   38:aload_1         
	//   23   39:getfield        #34  <Field long[] zzcag>
	//   24   42:astore_1        
		for(int i = 0; i < size; i++)
	//*  25   43:iconst_0        
	//*  26   44:istore_2        
	//*  27   45:iload_2         
	//*  28   46:aload_0         
	//*  29   47:getfield        #36  <Field int size>
	//*  30   50:icmpge          75
			if(zzcag[i] != obj[i])
	//*  31   53:aload_0         
	//*  32   54:getfield        #34  <Field long[] zzcag>
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
		zzaj(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #128 <Method void zzaj(int)>
		return zzcag[i];
	//    3    5:aload_0         
	//    4    6:getfield        #34  <Field long[] zzcag>
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
			j = j * 31 + zzuq.zzbd(zzcag[i]);
	//    8   12:iload_2         
	//    9   13:bipush          31
	//   10   15:imul            
	//   11   16:aload_0         
	//   12   17:getfield        #34  <Field long[] zzcag>
	//   13   20:iload_1         
	//   14   21:laload          
	//   15   22:invokestatic    #134 <Method int zzuq.zzbd(long)>
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
		((zzta)this).zzua();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method void zzta.zzua()>
		zzaj(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #128 <Method void zzaj(int)>
		long l = zzcag[i];
	//    5    9:aload_0         
	//    6   10:getfield        #34  <Field long[] zzcag>
	//    7   13:iload_1         
	//    8   14:laload          
	//    9   15:lstore_2        
		if(i < size - 1)
	//*  10   16:iload_1         
	//*  11   17:aload_0         
	//*  12   18:getfield        #36  <Field int size>
	//*  13   21:iconst_1        
	//*  14   22:isub            
	//*  15   23:icmpge          49
			System.arraycopy(((Object) (zzcag)), i + 1, ((Object) (zzcag)), i, size - i - 1);
	//   16   26:aload_0         
	//   17   27:getfield        #34  <Field long[] zzcag>
	//   18   30:iload_1         
	//   19   31:iconst_1        
	//   20   32:iadd            
	//   21   33:aload_0         
	//   22   34:getfield        #34  <Field long[] zzcag>
	//   23   37:iload_1         
	//   24   38:aload_0         
	//   25   39:getfield        #36  <Field int size>
	//   26   42:iload_1         
	//   27   43:isub            
	//   28   44:iconst_1        
	//   29   45:isub            
	//   30   46:invokestatic    #77  <Method void System.arraycopy(Object, int, Object, int, int)>
		size = size - 1;
	//   31   49:aload_0         
	//   32   50:aload_0         
	//   33   51:getfield        #36  <Field int size>
	//   34   54:iconst_1        
	//   35   55:isub            
	//   36   56:putfield        #36  <Field int size>
		modCount = modCount + 1;
	//   37   59:aload_0         
	//   38   60:aload_0         
	//   39   61:getfield        #80  <Field int modCount>
	//   40   64:iconst_1        
	//   41   65:iadd            
	//   42   66:putfield        #80  <Field int modCount>
		return ((Object) (Long.valueOf(l)));
	//   43   69:lload_2         
	//   44   70:invokestatic    #126 <Method Long Long.valueOf(long)>
	//   45   73:areturn         
	}

	public final boolean remove(Object obj)
	{
		((zzta)this).zzua();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method void zzta.zzua()>
		for(int i = 0; i < size; i++)
	//*   2    4:iconst_0        
	//*   3    5:istore_2        
	//*   4    6:iload_2         
	//*   5    7:aload_0         
	//*   6    8:getfield        #36  <Field int size>
	//*   7   11:icmpge          82
			if(obj.equals(((Object) (Long.valueOf(zzcag[i])))))
	//*   8   14:aload_1         
	//*   9   15:aload_0         
	//*  10   16:getfield        #34  <Field long[] zzcag>
	//*  11   19:iload_2         
	//*  12   20:laload          
	//*  13   21:invokestatic    #126 <Method Long Long.valueOf(long)>
	//*  14   24:invokevirtual   #138 <Method boolean Object.equals(Object)>
	//*  15   27:ifeq            75
			{
				System.arraycopy(((Object) (zzcag)), i + 1, ((Object) (zzcag)), i, size - i - 1);
	//   16   30:aload_0         
	//   17   31:getfield        #34  <Field long[] zzcag>
	//   18   34:iload_2         
	//   19   35:iconst_1        
	//   20   36:iadd            
	//   21   37:aload_0         
	//   22   38:getfield        #34  <Field long[] zzcag>
	//   23   41:iload_2         
	//   24   42:aload_0         
	//   25   43:getfield        #36  <Field int size>
	//   26   46:iload_2         
	//   27   47:isub            
	//   28   48:iconst_1        
	//   29   49:isub            
	//   30   50:invokestatic    #77  <Method void System.arraycopy(Object, int, Object, int, int)>
				size = size - 1;
	//   31   53:aload_0         
	//   32   54:aload_0         
	//   33   55:getfield        #36  <Field int size>
	//   34   58:iconst_1        
	//   35   59:isub            
	//   36   60:putfield        #36  <Field int size>
				modCount = modCount + 1;
	//   37   63:aload_0         
	//   38   64:aload_0         
	//   39   65:getfield        #80  <Field int modCount>
	//   40   68:iconst_1        
	//   41   69:iadd            
	//   42   70:putfield        #80  <Field int modCount>
				return true;
	//   43   73:iconst_1        
	//   44   74:ireturn         
			}

	//   45   75:iload_2         
	//   46   76:iconst_1        
	//   47   77:iadd            
	//   48   78:istore_2        
	//*  49   79:goto            6
		return false;
	//   50   82:iconst_0        
	//   51   83:ireturn         
	}

	protected final void removeRange(int i, int j)
	{
		((zzta)this).zzua();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method void zzta.zzua()>
		if(j < i)
	//*   2    4:iload_2         
	//*   3    5:iload_1         
	//*   4    6:icmpge          19
		{
			throw new IndexOutOfBoundsException("toIndex < fromIndex");
	//    5    9:new             #40  <Class IndexOutOfBoundsException>
	//    6   12:dup             
	//    7   13:ldc1            #142 <String "toIndex < fromIndex">
	//    8   15:invokespecial   #47  <Method void IndexOutOfBoundsException(String)>
	//    9   18:athrow          
		} else
		{
			System.arraycopy(((Object) (zzcag)), j, ((Object) (zzcag)), i, size - j);
	//   10   19:aload_0         
	//   11   20:getfield        #34  <Field long[] zzcag>
	//   12   23:iload_2         
	//   13   24:aload_0         
	//   14   25:getfield        #34  <Field long[] zzcag>
	//   15   28:iload_1         
	//   16   29:aload_0         
	//   17   30:getfield        #36  <Field int size>
	//   18   33:iload_2         
	//   19   34:isub            
	//   20   35:invokestatic    #77  <Method void System.arraycopy(Object, int, Object, int, int)>
			size = size - (j - i);
	//   21   38:aload_0         
	//   22   39:aload_0         
	//   23   40:getfield        #36  <Field int size>
	//   24   43:iload_2         
	//   25   44:iload_1         
	//   26   45:isub            
	//   27   46:isub            
	//   28   47:putfield        #36  <Field int size>
			modCount = modCount + 1;
	//   29   50:aload_0         
	//   30   51:aload_0         
	//   31   52:getfield        #80  <Field int modCount>
	//   32   55:iconst_1        
	//   33   56:iadd            
	//   34   57:putfield        #80  <Field int modCount>
			return;
	//   35   60:return          
		}
	}

	public final Object set(int i, Object obj)
	{
		long l = ((Long)obj).longValue();
	//    0    0:aload_2         
	//    1    1:checkcast       #84  <Class Long>
	//    2    4:invokevirtual   #88  <Method long Long.longValue()>
	//    3    7:lstore_3        
		((zzta)this).zzua();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #71  <Method void zzta.zzua()>
		zzaj(i);
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:invokespecial   #128 <Method void zzaj(int)>
		long l1 = zzcag[i];
	//    9   17:aload_0         
	//   10   18:getfield        #34  <Field long[] zzcag>
	//   11   21:iload_1         
	//   12   22:laload          
	//   13   23:lstore          5
		zzcag[i] = l;
	//   14   25:aload_0         
	//   15   26:getfield        #34  <Field long[] zzcag>
	//   16   29:iload_1         
	//   17   30:lload_3         
	//   18   31:lastore         
		return ((Object) (Long.valueOf(l1)));
	//   19   32:lload           5
	//   20   34:invokestatic    #126 <Method Long Long.valueOf(long)>
	//   21   37:areturn         
	}

	public final int size()
	{
		return size;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int size>
	//    2    4:ireturn         
	}

	public final zzuu zzal(int i)
	{
		if(i < size)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #36  <Field int size>
	//*   3    5:icmpge          16
			throw new IllegalArgumentException();
	//    4    8:new             #148 <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:invokespecial   #149 <Method void IllegalArgumentException()>
	//    7   15:athrow          
		else
			return ((zzuu) (new zzvj(Arrays.copyOf(zzcag, i), size)));
	//    8   16:new             #2   <Class zzvj>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:getfield        #34  <Field long[] zzcag>
	//   12   24:iload_1         
	//   13   25:invokestatic    #110 <Method long[] Arrays.copyOf(long[], int)>
	//   14   28:aload_0         
	//   15   29:getfield        #36  <Field int size>
	//   16   32:invokespecial   #31  <Method void zzvj(long[], int)>
	//   17   35:areturn         
	}

	public final void zzbe(long l)
	{
		zzk(size, l);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #36  <Field int size>
	//    3    5:lload_1         
	//    4    6:invokespecial   #90  <Method void zzk(int, long)>
	//    5    9:return          
	}

	private static final zzvj zzcaf;
	private int size;
	private long zzcag[];

	static 
	{
		zzvj zzvj1 = new zzvj();
	//    0    0:new             #2   <Class zzvj>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void zzvj()>
	//    3    7:astore_0        
		zzcaf = zzvj1;
	//    4    8:aload_0         
	//    5    9:putstatic       #24  <Field zzvj zzcaf>
		((zzta) (zzvj1)).zzsw();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #27  <Method void zzta.zzsw()>
	//*   8   16:return          
	}
}
