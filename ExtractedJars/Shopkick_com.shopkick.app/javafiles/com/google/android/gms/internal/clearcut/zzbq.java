// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzav, zzcn, zzci

final class zzbq extends zzav
	implements zzcn, RandomAccess
{

	zzbq()
	{
		this(new double[10], 0);
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:newarray        double[]
	//    3    5:iconst_0        
	//    4    6:invokespecial   #29  <Method void zzbq(double[], int)>
	//    5    9:return          
	}

	private zzbq(double ad[], int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void zzav()>
		zzgk = ad;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #32  <Field double[] zzgk>
		size = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #34  <Field int size>
	//    8   14:return          
	}

	private final void zzc(int i, double d)
	{
		((zzav)this).zzw();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method void zzav.zzw()>
		if(i >= 0)
	//*   2    4:iload_1         
	//*   3    5:iflt            127
		{
			int j = size;
	//    4    8:aload_0         
	//    5    9:getfield        #34  <Field int size>
	//    6   12:istore          4
			if(i <= j)
	//*   7   14:iload_1         
	//*   8   15:iload           4
	//*   9   17:icmpgt          127
			{
				double ad[] = zzgk;
	//   10   20:aload_0         
	//   11   21:getfield        #32  <Field double[] zzgk>
	//   12   24:astore          5
				if(j < ad.length)
	//*  13   26:iload           4
	//*  14   28:aload           5
	//*  15   30:arraylength     
	//*  16   31:icmpge          52
				{
					System.arraycopy(((Object) (ad)), i, ((Object) (ad)), i + 1, j - i);
	//   17   34:aload           5
	//   18   36:iload_1         
	//   19   37:aload           5
	//   20   39:iload_1         
	//   21   40:iconst_1        
	//   22   41:iadd            
	//   23   42:iload           4
	//   24   44:iload_1         
	//   25   45:isub            
	//   26   46:invokestatic    #45  <Method void System.arraycopy(Object, int, Object, int, int)>
				} else
	//*  27   49:goto            99
				{
					double ad1[] = new double[(j * 3) / 2 + 1];
	//   28   52:iload           4
	//   29   54:iconst_3        
	//   30   55:imul            
	//   31   56:iconst_2        
	//   32   57:idiv            
	//   33   58:iconst_1        
	//   34   59:iadd            
	//   35   60:newarray        double[]
	//   36   62:astore          6
					System.arraycopy(((Object) (ad)), 0, ((Object) (ad1)), 0, i);
	//   37   64:aload           5
	//   38   66:iconst_0        
	//   39   67:aload           6
	//   40   69:iconst_0        
	//   41   70:iload_1         
	//   42   71:invokestatic    #45  <Method void System.arraycopy(Object, int, Object, int, int)>
					System.arraycopy(((Object) (zzgk)), i, ((Object) (ad1)), i + 1, size - i);
	//   43   74:aload_0         
	//   44   75:getfield        #32  <Field double[] zzgk>
	//   45   78:iload_1         
	//   46   79:aload           6
	//   47   81:iload_1         
	//   48   82:iconst_1        
	//   49   83:iadd            
	//   50   84:aload_0         
	//   51   85:getfield        #34  <Field int size>
	//   52   88:iload_1         
	//   53   89:isub            
	//   54   90:invokestatic    #45  <Method void System.arraycopy(Object, int, Object, int, int)>
					zzgk = ad1;
	//   55   93:aload_0         
	//   56   94:aload           6
	//   57   96:putfield        #32  <Field double[] zzgk>
				}
				zzgk[i] = d;
	//   58   99:aload_0         
	//   59  100:getfield        #32  <Field double[] zzgk>
	//   60  103:iload_1         
	//   61  104:dload_2         
	//   62  105:dastore         
				size = size + 1;
	//   63  106:aload_0         
	//   64  107:aload_0         
	//   65  108:getfield        #34  <Field int size>
	//   66  111:iconst_1        
	//   67  112:iadd            
	//   68  113:putfield        #34  <Field int size>
				modCount = modCount + 1;
	//   69  116:aload_0         
	//   70  117:aload_0         
	//   71  118:getfield        #48  <Field int modCount>
	//   72  121:iconst_1        
	//   73  122:iadd            
	//   74  123:putfield        #48  <Field int modCount>
				return;
	//   75  126:return          
			}
		}
		throw new IndexOutOfBoundsException(zzh(i));
	//   76  127:new             #50  <Class IndexOutOfBoundsException>
	//   77  130:dup             
	//   78  131:aload_0         
	//   79  132:iload_1         
	//   80  133:invokespecial   #54  <Method String zzh(int)>
	//   81  136:invokespecial   #57  <Method void IndexOutOfBoundsException(String)>
	//   82  139:athrow          
	}

	private final void zzg(int i)
	{
		if(i >= 0 && i < size)
	//*   0    0:iload_1         
	//*   1    1:iflt            13
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #34  <Field int size>
	//*   5    9:icmpge          13
			return;
	//    6   12:return          
		else
			throw new IndexOutOfBoundsException(zzh(i));
	//    7   13:new             #50  <Class IndexOutOfBoundsException>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:invokespecial   #54  <Method String zzh(int)>
	//   12   22:invokespecial   #57  <Method void IndexOutOfBoundsException(String)>
	//   13   25:athrow          
	}

	private final String zzh(int i)
	{
		int j = size;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int size>
	//    2    4:istore_2        
		StringBuilder stringbuilder = new StringBuilder(35);
	//    3    5:new             #61  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:bipush          35
	//    6   11:invokespecial   #63  <Method void StringBuilder(int)>
	//    7   14:astore_3        
		stringbuilder.append("Index:");
	//    8   15:aload_3         
	//    9   16:ldc1            #65  <String "Index:">
	//   10   18:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(i);
	//   12   22:aload_3         
	//   13   23:iload_1         
	//   14   24:invokevirtual   #72  <Method StringBuilder StringBuilder.append(int)>
	//   15   27:pop             
		stringbuilder.append(", Size:");
	//   16   28:aload_3         
	//   17   29:ldc1            #74  <String ", Size:">
	//   18   31:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   19   34:pop             
		stringbuilder.append(j);
	//   20   35:aload_3         
	//   21   36:iload_2         
	//   22   37:invokevirtual   #72  <Method StringBuilder StringBuilder.append(int)>
	//   23   40:pop             
		return stringbuilder.toString();
	//   24   41:aload_3         
	//   25   42:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   26   45:areturn         
	}

	public final void add(int i, Object obj)
	{
		zzc(i, ((Double)obj).doubleValue());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #82  <Class Double>
	//    4    6:invokevirtual   #86  <Method double Double.doubleValue()>
	//    5    9:invokespecial   #88  <Method void zzc(int, double)>
	//    6   12:return          
	}

	public final boolean addAll(Collection collection)
	{
		((zzav)this).zzw();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method void zzav.zzw()>
		zzci.checkNotNull(((Object) (collection)));
	//    2    4:aload_1         
	//    3    5:invokestatic    #96  <Method Object zzci.checkNotNull(Object)>
	//    4    8:pop             
		if(!(collection instanceof zzbq))
	//*   5    9:aload_1         
	//*   6   10:instanceof      #2   <Class zzbq>
	//*   7   13:ifne            22
			return super.addAll(collection);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #98  <Method boolean zzav.addAll(Collection)>
	//   11   21:ireturn         
		collection = ((Collection) ((zzbq)collection));
	//   12   22:aload_1         
	//   13   23:checkcast       #2   <Class zzbq>
	//   14   26:astore_1        
		int i = ((zzbq) (collection)).size;
	//   15   27:aload_1         
	//   16   28:getfield        #34  <Field int size>
	//   17   31:istore_2        
		if(i == 0)
	//*  18   32:iload_2         
	//*  19   33:ifne            38
			return false;
	//   20   36:iconst_0        
	//   21   37:ireturn         
		int j = size;
	//   22   38:aload_0         
	//   23   39:getfield        #34  <Field int size>
	//   24   42:istore_3        
		if(0x7fffffff - j >= i)
	//*  25   43:ldc1            #99  <Int 0x7fffffff>
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
			double ad[] = zzgk;
	//   34   55:aload_0         
	//   35   56:getfield        #32  <Field double[] zzgk>
	//   36   59:astore          4
			if(i > ad.length)
	//*  37   61:iload_2         
	//*  38   62:aload           4
	//*  39   64:arraylength     
	//*  40   65:icmple          78
				zzgk = Arrays.copyOf(ad, i);
	//   41   68:aload_0         
	//   42   69:aload           4
	//   43   71:iload_2         
	//   44   72:invokestatic    #105 <Method double[] Arrays.copyOf(double[], int)>
	//   45   75:putfield        #32  <Field double[] zzgk>
			System.arraycopy(((Object) (((zzbq) (collection)).zzgk)), 0, ((Object) (zzgk)), size, ((zzbq) (collection)).size);
	//   46   78:aload_1         
	//   47   79:getfield        #32  <Field double[] zzgk>
	//   48   82:iconst_0        
	//   49   83:aload_0         
	//   50   84:getfield        #32  <Field double[] zzgk>
	//   51   87:aload_0         
	//   52   88:getfield        #34  <Field int size>
	//   53   91:aload_1         
	//   54   92:getfield        #34  <Field int size>
	//   55   95:invokestatic    #45  <Method void System.arraycopy(Object, int, Object, int, int)>
			size = i;
	//   56   98:aload_0         
	//   57   99:iload_2         
	//   58  100:putfield        #34  <Field int size>
			modCount = modCount + 1;
	//   59  103:aload_0         
	//   60  104:aload_0         
	//   61  105:getfield        #48  <Field int modCount>
	//   62  108:iconst_1        
	//   63  109:iadd            
	//   64  110:putfield        #48  <Field int modCount>
			return true;
	//   65  113:iconst_1        
	//   66  114:ireturn         
		} else
		{
			throw new OutOfMemoryError();
	//   67  115:new             #107 <Class OutOfMemoryError>
	//   68  118:dup             
	//   69  119:invokespecial   #108 <Method void OutOfMemoryError()>
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
		if(!(obj instanceof zzbq))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzbq>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #114 <Method boolean zzav.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((zzbq)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class zzbq>
	//   14   24:astore_1        
		if(size != ((zzbq) (obj)).size)
	//*  15   25:aload_0         
	//*  16   26:getfield        #34  <Field int size>
	//*  17   29:aload_1         
	//*  18   30:getfield        #34  <Field int size>
	//*  19   33:icmpeq          38
			return false;
	//   20   36:iconst_0        
	//   21   37:ireturn         
		obj = ((Object) (((zzbq) (obj)).zzgk));
	//   22   38:aload_1         
	//   23   39:getfield        #32  <Field double[] zzgk>
	//   24   42:astore_1        
		for(int i = 0; i < size; i++)
	//*  25   43:iconst_0        
	//*  26   44:istore_2        
	//*  27   45:iload_2         
	//*  28   46:aload_0         
	//*  29   47:getfield        #34  <Field int size>
	//*  30   50:icmpge          75
			if(zzgk[i] != obj[i])
	//*  31   53:aload_0         
	//*  32   54:getfield        #32  <Field double[] zzgk>
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

	public final Object get(int i)
	{
		zzg(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #118 <Method void zzg(int)>
		return ((Object) (Double.valueOf(zzgk[i])));
	//    3    5:aload_0         
	//    4    6:getfield        #32  <Field double[] zzgk>
	//    5    9:iload_1         
	//    6   10:daload          
	//    7   11:invokestatic    #122 <Method Double Double.valueOf(double)>
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
	//*   6    6:getfield        #34  <Field int size>
	//*   7    9:icmpge          37
			j = j * 31 + zzci.zzl(Double.doubleToLongBits(zzgk[i]));
	//    8   12:iload_2         
	//    9   13:bipush          31
	//   10   15:imul            
	//   11   16:aload_0         
	//   12   17:getfield        #32  <Field double[] zzgk>
	//   13   20:iload_1         
	//   14   21:daload          
	//   15   22:invokestatic    #128 <Method long Double.doubleToLongBits(double)>
	//   16   25:invokestatic    #132 <Method int zzci.zzl(long)>
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

	public final Object remove(int i)
	{
		((zzav)this).zzw();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method void zzav.zzw()>
		zzg(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #118 <Method void zzg(int)>
		double ad[] = zzgk;
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field double[] zzgk>
	//    7   13:astore          5
		double d = ad[i];
	//    8   15:aload           5
	//    9   17:iload_1         
	//   10   18:daload          
	//   11   19:dstore_2        
		int j = size;
	//   12   20:aload_0         
	//   13   21:getfield        #34  <Field int size>
	//   14   24:istore          4
		if(i < j - 1)
	//*  15   26:iload_1         
	//*  16   27:iload           4
	//*  17   29:iconst_1        
	//*  18   30:isub            
	//*  19   31:icmpge          49
			System.arraycopy(((Object) (ad)), i + 1, ((Object) (ad)), i, j - i);
	//   20   34:aload           5
	//   21   36:iload_1         
	//   22   37:iconst_1        
	//   23   38:iadd            
	//   24   39:aload           5
	//   25   41:iload_1         
	//   26   42:iload           4
	//   27   44:iload_1         
	//   28   45:isub            
	//   29   46:invokestatic    #45  <Method void System.arraycopy(Object, int, Object, int, int)>
		size = size - 1;
	//   30   49:aload_0         
	//   31   50:aload_0         
	//   32   51:getfield        #34  <Field int size>
	//   33   54:iconst_1        
	//   34   55:isub            
	//   35   56:putfield        #34  <Field int size>
		modCount = modCount + 1;
	//   36   59:aload_0         
	//   37   60:aload_0         
	//   38   61:getfield        #48  <Field int modCount>
	//   39   64:iconst_1        
	//   40   65:iadd            
	//   41   66:putfield        #48  <Field int modCount>
		return ((Object) (Double.valueOf(d)));
	//   42   69:dload_2         
	//   43   70:invokestatic    #122 <Method Double Double.valueOf(double)>
	//   44   73:areturn         
	}

	public final boolean remove(Object obj)
	{
		((zzav)this).zzw();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method void zzav.zzw()>
		for(int i = 0; i < size; i++)
	//*   2    4:iconst_0        
	//*   3    5:istore_2        
	//*   4    6:iload_2         
	//*   5    7:aload_0         
	//*   6    8:getfield        #34  <Field int size>
	//*   7   11:icmpge          79
			if(obj.equals(((Object) (Double.valueOf(zzgk[i])))))
	//*   8   14:aload_1         
	//*   9   15:aload_0         
	//*  10   16:getfield        #32  <Field double[] zzgk>
	//*  11   19:iload_2         
	//*  12   20:daload          
	//*  13   21:invokestatic    #122 <Method Double Double.valueOf(double)>
	//*  14   24:invokevirtual   #136 <Method boolean Object.equals(Object)>
	//*  15   27:ifeq            72
			{
				obj = ((Object) (zzgk));
	//   16   30:aload_0         
	//   17   31:getfield        #32  <Field double[] zzgk>
	//   18   34:astore_1        
				System.arraycopy(obj, i + 1, obj, i, size - i);
	//   19   35:aload_1         
	//   20   36:iload_2         
	//   21   37:iconst_1        
	//   22   38:iadd            
	//   23   39:aload_1         
	//   24   40:iload_2         
	//   25   41:aload_0         
	//   26   42:getfield        #34  <Field int size>
	//   27   45:iload_2         
	//   28   46:isub            
	//   29   47:invokestatic    #45  <Method void System.arraycopy(Object, int, Object, int, int)>
				size = size - 1;
	//   30   50:aload_0         
	//   31   51:aload_0         
	//   32   52:getfield        #34  <Field int size>
	//   33   55:iconst_1        
	//   34   56:isub            
	//   35   57:putfield        #34  <Field int size>
				modCount = modCount + 1;
	//   36   60:aload_0         
	//   37   61:aload_0         
	//   38   62:getfield        #48  <Field int modCount>
	//   39   65:iconst_1        
	//   40   66:iadd            
	//   41   67:putfield        #48  <Field int modCount>
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
		((zzav)this).zzw();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method void zzav.zzw()>
		if(j >= i)
	//*   2    4:iload_2         
	//*   3    5:iload_1         
	//*   4    6:icmplt          50
		{
			double ad[] = zzgk;
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field double[] zzgk>
	//    7   13:astore_3        
			System.arraycopy(((Object) (ad)), j, ((Object) (ad)), i, size - j);
	//    8   14:aload_3         
	//    9   15:iload_2         
	//   10   16:aload_3         
	//   11   17:iload_1         
	//   12   18:aload_0         
	//   13   19:getfield        #34  <Field int size>
	//   14   22:iload_2         
	//   15   23:isub            
	//   16   24:invokestatic    #45  <Method void System.arraycopy(Object, int, Object, int, int)>
			size = size - (j - i);
	//   17   27:aload_0         
	//   18   28:aload_0         
	//   19   29:getfield        #34  <Field int size>
	//   20   32:iload_2         
	//   21   33:iload_1         
	//   22   34:isub            
	//   23   35:isub            
	//   24   36:putfield        #34  <Field int size>
			modCount = modCount + 1;
	//   25   39:aload_0         
	//   26   40:aload_0         
	//   27   41:getfield        #48  <Field int modCount>
	//   28   44:iconst_1        
	//   29   45:iadd            
	//   30   46:putfield        #48  <Field int modCount>
			return;
	//   31   49:return          
		} else
		{
			throw new IndexOutOfBoundsException("toIndex < fromIndex");
	//   32   50:new             #50  <Class IndexOutOfBoundsException>
	//   33   53:dup             
	//   34   54:ldc1            #140 <String "toIndex < fromIndex">
	//   35   56:invokespecial   #57  <Method void IndexOutOfBoundsException(String)>
	//   36   59:athrow          
		}
	}

	public final Object set(int i, Object obj)
	{
		double d = ((Double)obj).doubleValue();
	//    0    0:aload_2         
	//    1    1:checkcast       #82  <Class Double>
	//    2    4:invokevirtual   #86  <Method double Double.doubleValue()>
	//    3    7:dstore_3        
		((zzav)this).zzw();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #39  <Method void zzav.zzw()>
		zzg(i);
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:invokespecial   #118 <Method void zzg(int)>
		obj = ((Object) (zzgk));
	//    9   17:aload_0         
	//   10   18:getfield        #32  <Field double[] zzgk>
	//   11   21:astore_2        
		double d1 = obj[i];
	//   12   22:aload_2         
	//   13   23:iload_1         
	//   14   24:daload          
	//   15   25:dstore          5
		obj[i] = d;
	//   16   27:aload_2         
	//   17   28:iload_1         
	//   18   29:dload_3         
	//   19   30:dastore         
		return ((Object) (Double.valueOf(d1)));
	//   20   31:dload           5
	//   21   33:invokestatic    #122 <Method Double Double.valueOf(double)>
	//   22   36:areturn         
	}

	public final int size()
	{
		return size;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int size>
	//    2    4:ireturn         
	}

	public final void zzc(double d)
	{
		zzc(size, d);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #34  <Field int size>
	//    3    5:dload_1         
	//    4    6:invokespecial   #88  <Method void zzc(int, double)>
	//    5    9:return          
	}

	public final zzcn zzi(int i)
	{
		if(i >= size)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #34  <Field int size>
	//*   3    5:icmplt          28
			return ((zzcn) (new zzbq(Arrays.copyOf(zzgk, i), size)));
	//    4    8:new             #2   <Class zzbq>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #32  <Field double[] zzgk>
	//    8   16:iload_1         
	//    9   17:invokestatic    #105 <Method double[] Arrays.copyOf(double[], int)>
	//   10   20:aload_0         
	//   11   21:getfield        #34  <Field int size>
	//   12   24:invokespecial   #29  <Method void zzbq(double[], int)>
	//   13   27:areturn         
		else
			throw new IllegalArgumentException();
	//   14   28:new             #147 <Class IllegalArgumentException>
	//   15   31:dup             
	//   16   32:invokespecial   #148 <Method void IllegalArgumentException()>
	//   17   35:athrow          
	}

	private static final zzbq zzgj;
	private int size;
	private double zzgk[];

	static 
	{
		zzbq zzbq1 = new zzbq();
	//    0    0:new             #2   <Class zzbq>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void zzbq()>
	//    3    7:astore_0        
		zzgj = zzbq1;
	//    4    8:aload_0         
	//    5    9:putstatic       #22  <Field zzbq zzgj>
		((zzav) (zzbq1)).zzv();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #25  <Method void zzav.zzv()>
	//*   8   16:return          
	}
}
