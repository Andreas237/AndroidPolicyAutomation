// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzta, zzuu, zzwg, zzuq

final class zztc extends zzta
	implements zzuu, zzwg, RandomAccess
{

	zztc()
	{
		this(new boolean[10], 0);
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:newarray        boolean[]
	//    3    5:iconst_0        
	//    4    6:invokespecial   #31  <Method void zztc(boolean[], int)>
	//    5    9:return          
	}

	private zztc(boolean aflag[], int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void zzta()>
		zzbtp = aflag;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #34  <Field boolean[] zzbtp>
		size = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #36  <Field int size>
	//    8   14:return          
	}

	private final void zza(int i, boolean flag)
	{
		((zzta)this).zzua();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method void zzta.zzua()>
		if(i >= 0)
	//*   2    4:iload_1         
	//*   3    5:iflt            122
		{
			int j = size;
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field int size>
	//    6   12:istore_3        
			if(i <= j)
	//*   7   13:iload_1         
	//*   8   14:iload_3         
	//*   9   15:icmpgt          122
			{
				boolean aflag[] = zzbtp;
	//   10   18:aload_0         
	//   11   19:getfield        #34  <Field boolean[] zzbtp>
	//   12   22:astore          4
				if(j < aflag.length)
	//*  13   24:iload_3         
	//*  14   25:aload           4
	//*  15   27:arraylength     
	//*  16   28:icmpge          48
				{
					System.arraycopy(((Object) (aflag)), i, ((Object) (aflag)), i + 1, j - i);
	//   17   31:aload           4
	//   18   33:iload_1         
	//   19   34:aload           4
	//   20   36:iload_1         
	//   21   37:iconst_1        
	//   22   38:iadd            
	//   23   39:iload_3         
	//   24   40:iload_1         
	//   25   41:isub            
	//   26   42:invokestatic    #47  <Method void System.arraycopy(Object, int, Object, int, int)>
				} else
	//*  27   45:goto            94
				{
					boolean aflag1[] = new boolean[(j * 3) / 2 + 1];
	//   28   48:iload_3         
	//   29   49:iconst_3        
	//   30   50:imul            
	//   31   51:iconst_2        
	//   32   52:idiv            
	//   33   53:iconst_1        
	//   34   54:iadd            
	//   35   55:newarray        boolean[]
	//   36   57:astore          5
					System.arraycopy(((Object) (aflag)), 0, ((Object) (aflag1)), 0, i);
	//   37   59:aload           4
	//   38   61:iconst_0        
	//   39   62:aload           5
	//   40   64:iconst_0        
	//   41   65:iload_1         
	//   42   66:invokestatic    #47  <Method void System.arraycopy(Object, int, Object, int, int)>
					System.arraycopy(((Object) (zzbtp)), i, ((Object) (aflag1)), i + 1, size - i);
	//   43   69:aload_0         
	//   44   70:getfield        #34  <Field boolean[] zzbtp>
	//   45   73:iload_1         
	//   46   74:aload           5
	//   47   76:iload_1         
	//   48   77:iconst_1        
	//   49   78:iadd            
	//   50   79:aload_0         
	//   51   80:getfield        #36  <Field int size>
	//   52   83:iload_1         
	//   53   84:isub            
	//   54   85:invokestatic    #47  <Method void System.arraycopy(Object, int, Object, int, int)>
					zzbtp = aflag1;
	//   55   88:aload_0         
	//   56   89:aload           5
	//   57   91:putfield        #34  <Field boolean[] zzbtp>
				}
				zzbtp[i] = flag;
	//   58   94:aload_0         
	//   59   95:getfield        #34  <Field boolean[] zzbtp>
	//   60   98:iload_1         
	//   61   99:iload_2         
	//   62  100:bastore         
				size = size + 1;
	//   63  101:aload_0         
	//   64  102:aload_0         
	//   65  103:getfield        #36  <Field int size>
	//   66  106:iconst_1        
	//   67  107:iadd            
	//   68  108:putfield        #36  <Field int size>
				modCount = modCount + 1;
	//   69  111:aload_0         
	//   70  112:aload_0         
	//   71  113:getfield        #50  <Field int modCount>
	//   72  116:iconst_1        
	//   73  117:iadd            
	//   74  118:putfield        #50  <Field int modCount>
				return;
	//   75  121:return          
			}
		}
		throw new IndexOutOfBoundsException(zzak(i));
	//   76  122:new             #52  <Class IndexOutOfBoundsException>
	//   77  125:dup             
	//   78  126:aload_0         
	//   79  127:iload_1         
	//   80  128:invokespecial   #56  <Method String zzak(int)>
	//   81  131:invokespecial   #59  <Method void IndexOutOfBoundsException(String)>
	//   82  134:athrow          
	}

	private final void zzaj(int i)
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
			throw new IndexOutOfBoundsException(zzak(i));
	//    7   13:new             #52  <Class IndexOutOfBoundsException>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:invokespecial   #56  <Method String zzak(int)>
	//   12   22:invokespecial   #59  <Method void IndexOutOfBoundsException(String)>
	//   13   25:athrow          
	}

	private final String zzak(int i)
	{
		int j = size;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int size>
	//    2    4:istore_2        
		StringBuilder stringbuilder = new StringBuilder(35);
	//    3    5:new             #63  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:bipush          35
	//    6   11:invokespecial   #65  <Method void StringBuilder(int)>
	//    7   14:astore_3        
		stringbuilder.append("Index:");
	//    8   15:aload_3         
	//    9   16:ldc1            #67  <String "Index:">
	//   10   18:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(i);
	//   12   22:aload_3         
	//   13   23:iload_1         
	//   14   24:invokevirtual   #74  <Method StringBuilder StringBuilder.append(int)>
	//   15   27:pop             
		stringbuilder.append(", Size:");
	//   16   28:aload_3         
	//   17   29:ldc1            #76  <String ", Size:">
	//   18   31:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   19   34:pop             
		stringbuilder.append(j);
	//   20   35:aload_3         
	//   21   36:iload_2         
	//   22   37:invokevirtual   #74  <Method StringBuilder StringBuilder.append(int)>
	//   23   40:pop             
		return stringbuilder.toString();
	//   24   41:aload_3         
	//   25   42:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   26   45:areturn         
	}

	public final void add(int i, Object obj)
	{
		zza(i, ((Boolean)obj).booleanValue());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #84  <Class Boolean>
	//    4    6:invokevirtual   #88  <Method boolean Boolean.booleanValue()>
	//    5    9:invokespecial   #90  <Method void zza(int, boolean)>
	//    6   12:return          
	}

	public final boolean addAll(Collection collection)
	{
		((zzta)this).zzua();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method void zzta.zzua()>
		zzuq.checkNotNull(((Object) (collection)));
	//    2    4:aload_1         
	//    3    5:invokestatic    #98  <Method Object zzuq.checkNotNull(Object)>
	//    4    8:pop             
		if(!(collection instanceof zztc))
	//*   5    9:aload_1         
	//*   6   10:instanceof      #2   <Class zztc>
	//*   7   13:ifne            22
			return super.addAll(collection);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #100 <Method boolean zzta.addAll(Collection)>
	//   11   21:ireturn         
		collection = ((Collection) ((zztc)collection));
	//   12   22:aload_1         
	//   13   23:checkcast       #2   <Class zztc>
	//   14   26:astore_1        
		int i = ((zztc) (collection)).size;
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
			boolean aflag[] = zzbtp;
	//   34   55:aload_0         
	//   35   56:getfield        #34  <Field boolean[] zzbtp>
	//   36   59:astore          4
			if(i > aflag.length)
	//*  37   61:iload_2         
	//*  38   62:aload           4
	//*  39   64:arraylength     
	//*  40   65:icmple          78
				zzbtp = Arrays.copyOf(aflag, i);
	//   41   68:aload_0         
	//   42   69:aload           4
	//   43   71:iload_2         
	//   44   72:invokestatic    #107 <Method boolean[] Arrays.copyOf(boolean[], int)>
	//   45   75:putfield        #34  <Field boolean[] zzbtp>
			System.arraycopy(((Object) (((zztc) (collection)).zzbtp)), 0, ((Object) (zzbtp)), size, ((zztc) (collection)).size);
	//   46   78:aload_1         
	//   47   79:getfield        #34  <Field boolean[] zzbtp>
	//   48   82:iconst_0        
	//   49   83:aload_0         
	//   50   84:getfield        #34  <Field boolean[] zzbtp>
	//   51   87:aload_0         
	//   52   88:getfield        #36  <Field int size>
	//   53   91:aload_1         
	//   54   92:getfield        #36  <Field int size>
	//   55   95:invokestatic    #47  <Method void System.arraycopy(Object, int, Object, int, int)>
			size = i;
	//   56   98:aload_0         
	//   57   99:iload_2         
	//   58  100:putfield        #36  <Field int size>
			modCount = modCount + 1;
	//   59  103:aload_0         
	//   60  104:aload_0         
	//   61  105:getfield        #50  <Field int modCount>
	//   62  108:iconst_1        
	//   63  109:iadd            
	//   64  110:putfield        #50  <Field int modCount>
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

	public final void addBoolean(boolean flag)
	{
		zza(size, flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #36  <Field int size>
	//    3    5:iload_1         
	//    4    6:invokespecial   #90  <Method void zza(int, boolean)>
	//    5    9:return          
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
		if(!(obj instanceof zztc))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zztc>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #118 <Method boolean zzta.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((zztc)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class zztc>
	//   14   24:astore_1        
		if(size != ((zztc) (obj)).size)
	//*  15   25:aload_0         
	//*  16   26:getfield        #36  <Field int size>
	//*  17   29:aload_1         
	//*  18   30:getfield        #36  <Field int size>
	//*  19   33:icmpeq          38
			return false;
	//   20   36:iconst_0        
	//   21   37:ireturn         
		obj = ((Object) (((zztc) (obj)).zzbtp));
	//   22   38:aload_1         
	//   23   39:getfield        #34  <Field boolean[] zzbtp>
	//   24   42:astore_1        
		for(int i = 0; i < size; i++)
	//*  25   43:iconst_0        
	//*  26   44:istore_2        
	//*  27   45:iload_2         
	//*  28   46:aload_0         
	//*  29   47:getfield        #36  <Field int size>
	//*  30   50:icmpge          74
			if(zzbtp[i] != obj[i])
	//*  31   53:aload_0         
	//*  32   54:getfield        #34  <Field boolean[] zzbtp>
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

	public final Object get(int i)
	{
		zzaj(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #122 <Method void zzaj(int)>
		return ((Object) (Boolean.valueOf(zzbtp[i])));
	//    3    5:aload_0         
	//    4    6:getfield        #34  <Field boolean[] zzbtp>
	//    5    9:iload_1         
	//    6   10:baload          
	//    7   11:invokestatic    #126 <Method Boolean Boolean.valueOf(boolean)>
	//    8   14:areturn         
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
			j = j * 31 + zzuq.zzu(zzbtp[i]);
	//    8   12:iload_2         
	//    9   13:bipush          31
	//   10   15:imul            
	//   11   16:aload_0         
	//   12   17:getfield        #34  <Field boolean[] zzbtp>
	//   13   20:iload_1         
	//   14   21:baload          
	//   15   22:invokestatic    #132 <Method int zzuq.zzu(boolean)>
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
	//    1    1:invokevirtual   #41  <Method void zzta.zzua()>
		zzaj(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #122 <Method void zzaj(int)>
		boolean aflag[] = zzbtp;
	//    5    9:aload_0         
	//    6   10:getfield        #34  <Field boolean[] zzbtp>
	//    7   13:astore          4
		boolean flag = aflag[i];
	//    8   15:aload           4
	//    9   17:iload_1         
	//   10   18:baload          
	//   11   19:istore_3        
		int j = size;
	//   12   20:aload_0         
	//   13   21:getfield        #36  <Field int size>
	//   14   24:istore_2        
		if(i < j - 1)
	//*  15   25:iload_1         
	//*  16   26:iload_2         
	//*  17   27:iconst_1        
	//*  18   28:isub            
	//*  19   29:icmpge          48
			System.arraycopy(((Object) (aflag)), i + 1, ((Object) (aflag)), i, j - i - 1);
	//   20   32:aload           4
	//   21   34:iload_1         
	//   22   35:iconst_1        
	//   23   36:iadd            
	//   24   37:aload           4
	//   25   39:iload_1         
	//   26   40:iload_2         
	//   27   41:iload_1         
	//   28   42:isub            
	//   29   43:iconst_1        
	//   30   44:isub            
	//   31   45:invokestatic    #47  <Method void System.arraycopy(Object, int, Object, int, int)>
		size = size - 1;
	//   32   48:aload_0         
	//   33   49:aload_0         
	//   34   50:getfield        #36  <Field int size>
	//   35   53:iconst_1        
	//   36   54:isub            
	//   37   55:putfield        #36  <Field int size>
		modCount = modCount + 1;
	//   38   58:aload_0         
	//   39   59:aload_0         
	//   40   60:getfield        #50  <Field int modCount>
	//   41   63:iconst_1        
	//   42   64:iadd            
	//   43   65:putfield        #50  <Field int modCount>
		return ((Object) (Boolean.valueOf(flag)));
	//   44   68:iload_3         
	//   45   69:invokestatic    #126 <Method Boolean Boolean.valueOf(boolean)>
	//   46   72:areturn         
	}

	public final boolean remove(Object obj)
	{
		((zzta)this).zzua();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method void zzta.zzua()>
		for(int i = 0; i < size; i++)
	//*   2    4:iconst_0        
	//*   3    5:istore_2        
	//*   4    6:iload_2         
	//*   5    7:aload_0         
	//*   6    8:getfield        #36  <Field int size>
	//*   7   11:icmpge          81
			if(obj.equals(((Object) (Boolean.valueOf(zzbtp[i])))))
	//*   8   14:aload_1         
	//*   9   15:aload_0         
	//*  10   16:getfield        #34  <Field boolean[] zzbtp>
	//*  11   19:iload_2         
	//*  12   20:baload          
	//*  13   21:invokestatic    #126 <Method Boolean Boolean.valueOf(boolean)>
	//*  14   24:invokevirtual   #136 <Method boolean Object.equals(Object)>
	//*  15   27:ifeq            74
			{
				obj = ((Object) (zzbtp));
	//   16   30:aload_0         
	//   17   31:getfield        #34  <Field boolean[] zzbtp>
	//   18   34:astore_1        
				System.arraycopy(obj, i + 1, obj, i, size - i - 1);
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
	//   29   47:iconst_1        
	//   30   48:isub            
	//   31   49:invokestatic    #47  <Method void System.arraycopy(Object, int, Object, int, int)>
				size = size - 1;
	//   32   52:aload_0         
	//   33   53:aload_0         
	//   34   54:getfield        #36  <Field int size>
	//   35   57:iconst_1        
	//   36   58:isub            
	//   37   59:putfield        #36  <Field int size>
				modCount = modCount + 1;
	//   38   62:aload_0         
	//   39   63:aload_0         
	//   40   64:getfield        #50  <Field int modCount>
	//   41   67:iconst_1        
	//   42   68:iadd            
	//   43   69:putfield        #50  <Field int modCount>
				return true;
	//   44   72:iconst_1        
	//   45   73:ireturn         
			}

	//   46   74:iload_2         
	//   47   75:iconst_1        
	//   48   76:iadd            
	//   49   77:istore_2        
	//*  50   78:goto            6
		return false;
	//   51   81:iconst_0        
	//   52   82:ireturn         
	}

	protected final void removeRange(int i, int j)
	{
		((zzta)this).zzua();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method void zzta.zzua()>
		if(j >= i)
	//*   2    4:iload_2         
	//*   3    5:iload_1         
	//*   4    6:icmplt          50
		{
			boolean aflag[] = zzbtp;
	//    5    9:aload_0         
	//    6   10:getfield        #34  <Field boolean[] zzbtp>
	//    7   13:astore_3        
			System.arraycopy(((Object) (aflag)), j, ((Object) (aflag)), i, size - j);
	//    8   14:aload_3         
	//    9   15:iload_2         
	//   10   16:aload_3         
	//   11   17:iload_1         
	//   12   18:aload_0         
	//   13   19:getfield        #36  <Field int size>
	//   14   22:iload_2         
	//   15   23:isub            
	//   16   24:invokestatic    #47  <Method void System.arraycopy(Object, int, Object, int, int)>
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
	//   27   41:getfield        #50  <Field int modCount>
	//   28   44:iconst_1        
	//   29   45:iadd            
	//   30   46:putfield        #50  <Field int modCount>
			return;
	//   31   49:return          
		} else
		{
			throw new IndexOutOfBoundsException("toIndex < fromIndex");
	//   32   50:new             #52  <Class IndexOutOfBoundsException>
	//   33   53:dup             
	//   34   54:ldc1            #140 <String "toIndex < fromIndex">
	//   35   56:invokespecial   #59  <Method void IndexOutOfBoundsException(String)>
	//   36   59:athrow          
		}
	}

	public final Object set(int i, Object obj)
	{
		byte byte0 = ((byte) (((Boolean)obj).booleanValue()));
	//    0    0:aload_2         
	//    1    1:checkcast       #84  <Class Boolean>
	//    2    4:invokevirtual   #88  <Method boolean Boolean.booleanValue()>
	//    3    7:istore_3        
		((zzta)this).zzua();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #41  <Method void zzta.zzua()>
		zzaj(i);
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:invokespecial   #122 <Method void zzaj(int)>
		obj = ((Object) (zzbtp));
	//    9   17:aload_0         
	//   10   18:getfield        #34  <Field boolean[] zzbtp>
	//   11   21:astore_2        
		boolean flag = ((boolean) (obj[i]));
	//   12   22:aload_2         
	//   13   23:iload_1         
	//   14   24:baload          
	//   15   25:istore          4
		obj[i] = byte0;
	//   16   27:aload_2         
	//   17   28:iload_1         
	//   18   29:iload_3         
	//   19   30:bastore         
		return ((Object) (Boolean.valueOf(flag)));
	//   20   31:iload           4
	//   21   33:invokestatic    #126 <Method Boolean Boolean.valueOf(boolean)>
	//   22   36:areturn         
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
		if(i >= size)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #36  <Field int size>
	//*   3    5:icmplt          28
			return ((zzuu) (new zztc(Arrays.copyOf(zzbtp, i), size)));
	//    4    8:new             #2   <Class zztc>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #34  <Field boolean[] zzbtp>
	//    8   16:iload_1         
	//    9   17:invokestatic    #107 <Method boolean[] Arrays.copyOf(boolean[], int)>
	//   10   20:aload_0         
	//   11   21:getfield        #36  <Field int size>
	//   12   24:invokespecial   #31  <Method void zztc(boolean[], int)>
	//   13   27:areturn         
		else
			throw new IllegalArgumentException();
	//   14   28:new             #146 <Class IllegalArgumentException>
	//   15   31:dup             
	//   16   32:invokespecial   #147 <Method void IllegalArgumentException()>
	//   17   35:athrow          
	}

	private static final zztc zzbto;
	private int size;
	private boolean zzbtp[];

	static 
	{
		zztc zztc1 = new zztc();
	//    0    0:new             #2   <Class zztc>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void zztc()>
	//    3    7:astore_0        
		zzbto = zztc1;
	//    4    8:aload_0         
	//    5    9:putstatic       #24  <Field zztc zzbto>
		((zzta) (zztc1)).zzsw();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #27  <Method void zzta.zzsw()>
	//*   8   16:return          
	}
}
