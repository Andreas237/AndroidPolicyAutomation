// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzta, zzuu, zzwg, zzuq

final class zzty extends zzta
	implements zzuu, zzwg, RandomAccess
{

	zzty()
	{
		this(new double[10], 0);
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:newarray        double[]
	//    3    5:iconst_0        
	//    4    6:invokespecial   #31  <Method void zzty(double[], int)>
	//    5    9:return          
	}

	private zzty(double ad[], int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void zzta()>
		zzbuy = ad;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #34  <Field double[] zzbuy>
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
	//*   1    1:iflt            13
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #36  <Field int size>
	//*   5    9:icmpge          13
			return;
	//    6   12:return          
		else
			throw new IndexOutOfBoundsException(zzak(i));
	//    7   13:new             #40  <Class IndexOutOfBoundsException>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:invokespecial   #44  <Method String zzak(int)>
	//   12   22:invokespecial   #47  <Method void IndexOutOfBoundsException(String)>
	//   13   25:athrow          
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

	private final void zzc(int i, double d)
	{
		((zzta)this).zzua();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method void zzta.zzua()>
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
				double ad[] = zzbuy;
	//   10   20:aload_0         
	//   11   21:getfield        #34  <Field double[] zzbuy>
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
	//   26   46:invokestatic    #77  <Method void System.arraycopy(Object, int, Object, int, int)>
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
	//   42   71:invokestatic    #77  <Method void System.arraycopy(Object, int, Object, int, int)>
					System.arraycopy(((Object) (zzbuy)), i, ((Object) (ad1)), i + 1, size - i);
	//   43   74:aload_0         
	//   44   75:getfield        #34  <Field double[] zzbuy>
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
					zzbuy = ad1;
	//   55   93:aload_0         
	//   56   94:aload           6
	//   57   96:putfield        #34  <Field double[] zzbuy>
				}
				zzbuy[i] = d;
	//   58   99:aload_0         
	//   59  100:getfield        #34  <Field double[] zzbuy>
	//   60  103:iload_1         
	//   61  104:dload_2         
	//   62  105:dastore         
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
		throw new IndexOutOfBoundsException(zzak(i));
	//   76  127:new             #40  <Class IndexOutOfBoundsException>
	//   77  130:dup             
	//   78  131:aload_0         
	//   79  132:iload_1         
	//   80  133:invokespecial   #44  <Method String zzak(int)>
	//   81  136:invokespecial   #47  <Method void IndexOutOfBoundsException(String)>
	//   82  139:athrow          
	}

	public final void add(int i, Object obj)
	{
		zzc(i, ((Double)obj).doubleValue());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #84  <Class Double>
	//    4    6:invokevirtual   #88  <Method double Double.doubleValue()>
	//    5    9:invokespecial   #90  <Method void zzc(int, double)>
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
		if(!(collection instanceof zzty))
	//*   5    9:aload_1         
	//*   6   10:instanceof      #2   <Class zzty>
	//*   7   13:ifne            22
			return super.addAll(collection);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #100 <Method boolean zzta.addAll(Collection)>
	//   11   21:ireturn         
		collection = ((Collection) ((zzty)collection));
	//   12   22:aload_1         
	//   13   23:checkcast       #2   <Class zzty>
	//   14   26:astore_1        
		int i = ((zzty) (collection)).size;
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
			double ad[] = zzbuy;
	//   34   55:aload_0         
	//   35   56:getfield        #34  <Field double[] zzbuy>
	//   36   59:astore          4
			if(i > ad.length)
	//*  37   61:iload_2         
	//*  38   62:aload           4
	//*  39   64:arraylength     
	//*  40   65:icmple          78
				zzbuy = Arrays.copyOf(ad, i);
	//   41   68:aload_0         
	//   42   69:aload           4
	//   43   71:iload_2         
	//   44   72:invokestatic    #107 <Method double[] Arrays.copyOf(double[], int)>
	//   45   75:putfield        #34  <Field double[] zzbuy>
			System.arraycopy(((Object) (((zzty) (collection)).zzbuy)), 0, ((Object) (zzbuy)), size, ((zzty) (collection)).size);
	//   46   78:aload_1         
	//   47   79:getfield        #34  <Field double[] zzbuy>
	//   48   82:iconst_0        
	//   49   83:aload_0         
	//   50   84:getfield        #34  <Field double[] zzbuy>
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
		if(!(obj instanceof zzty))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzty>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #116 <Method boolean zzta.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((zzty)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class zzty>
	//   14   24:astore_1        
		if(size != ((zzty) (obj)).size)
	//*  15   25:aload_0         
	//*  16   26:getfield        #36  <Field int size>
	//*  17   29:aload_1         
	//*  18   30:getfield        #36  <Field int size>
	//*  19   33:icmpeq          38
			return false;
	//   20   36:iconst_0        
	//   21   37:ireturn         
		obj = ((Object) (((zzty) (obj)).zzbuy));
	//   22   38:aload_1         
	//   23   39:getfield        #34  <Field double[] zzbuy>
	//   24   42:astore_1        
		for(int i = 0; i < size; i++)
	//*  25   43:iconst_0        
	//*  26   44:istore_2        
	//*  27   45:iload_2         
	//*  28   46:aload_0         
	//*  29   47:getfield        #36  <Field int size>
	//*  30   50:icmpge          81
			if(Double.doubleToLongBits(zzbuy[i]) != Double.doubleToLongBits(obj[i]))
	//*  31   53:aload_0         
	//*  32   54:getfield        #34  <Field double[] zzbuy>
	//*  33   57:iload_2         
	//*  34   58:daload          
	//*  35   59:invokestatic    #120 <Method long Double.doubleToLongBits(double)>
	//*  36   62:aload_1         
	//*  37   63:iload_2         
	//*  38   64:daload          
	//*  39   65:invokestatic    #120 <Method long Double.doubleToLongBits(double)>
	//*  40   68:lcmp            
	//*  41   69:ifeq            74
				return false;
	//   42   72:iconst_0        
	//   43   73:ireturn         

	//   44   74:iload_2         
	//   45   75:iconst_1        
	//   46   76:iadd            
	//   47   77:istore_2        
	//*  48   78:goto            45
		return true;
	//   49   81:iconst_1        
	//   50   82:ireturn         
	}

	public final Object get(int i)
	{
		zzaj(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #124 <Method void zzaj(int)>
		return ((Object) (Double.valueOf(zzbuy[i])));
	//    3    5:aload_0         
	//    4    6:getfield        #34  <Field double[] zzbuy>
	//    5    9:iload_1         
	//    6   10:daload          
	//    7   11:invokestatic    #128 <Method Double Double.valueOf(double)>
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
	//*   7    9:icmpge          37
			j = j * 31 + zzuq.zzbd(Double.doubleToLongBits(zzbuy[i]));
	//    8   12:iload_2         
	//    9   13:bipush          31
	//   10   15:imul            
	//   11   16:aload_0         
	//   12   17:getfield        #34  <Field double[] zzbuy>
	//   13   20:iload_1         
	//   14   21:daload          
	//   15   22:invokestatic    #120 <Method long Double.doubleToLongBits(double)>
	//   16   25:invokestatic    #134 <Method int zzuq.zzbd(long)>
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
		((zzta)this).zzua();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method void zzta.zzua()>
		zzaj(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #124 <Method void zzaj(int)>
		double ad[] = zzbuy;
	//    5    9:aload_0         
	//    6   10:getfield        #34  <Field double[] zzbuy>
	//    7   13:astore          5
		double d = ad[i];
	//    8   15:aload           5
	//    9   17:iload_1         
	//   10   18:daload          
	//   11   19:dstore_2        
		int j = size;
	//   12   20:aload_0         
	//   13   21:getfield        #36  <Field int size>
	//   14   24:istore          4
		if(i < j - 1)
	//*  15   26:iload_1         
	//*  16   27:iload           4
	//*  17   29:iconst_1        
	//*  18   30:isub            
	//*  19   31:icmpge          51
			System.arraycopy(((Object) (ad)), i + 1, ((Object) (ad)), i, j - i - 1);
	//   20   34:aload           5
	//   21   36:iload_1         
	//   22   37:iconst_1        
	//   23   38:iadd            
	//   24   39:aload           5
	//   25   41:iload_1         
	//   26   42:iload           4
	//   27   44:iload_1         
	//   28   45:isub            
	//   29   46:iconst_1        
	//   30   47:isub            
	//   31   48:invokestatic    #77  <Method void System.arraycopy(Object, int, Object, int, int)>
		size = size - 1;
	//   32   51:aload_0         
	//   33   52:aload_0         
	//   34   53:getfield        #36  <Field int size>
	//   35   56:iconst_1        
	//   36   57:isub            
	//   37   58:putfield        #36  <Field int size>
		modCount = modCount + 1;
	//   38   61:aload_0         
	//   39   62:aload_0         
	//   40   63:getfield        #80  <Field int modCount>
	//   41   66:iconst_1        
	//   42   67:iadd            
	//   43   68:putfield        #80  <Field int modCount>
		return ((Object) (Double.valueOf(d)));
	//   44   71:dload_2         
	//   45   72:invokestatic    #128 <Method Double Double.valueOf(double)>
	//   46   75:areturn         
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
	//*   7   11:icmpge          81
			if(obj.equals(((Object) (Double.valueOf(zzbuy[i])))))
	//*   8   14:aload_1         
	//*   9   15:aload_0         
	//*  10   16:getfield        #34  <Field double[] zzbuy>
	//*  11   19:iload_2         
	//*  12   20:daload          
	//*  13   21:invokestatic    #128 <Method Double Double.valueOf(double)>
	//*  14   24:invokevirtual   #138 <Method boolean Object.equals(Object)>
	//*  15   27:ifeq            74
			{
				obj = ((Object) (zzbuy));
	//   16   30:aload_0         
	//   17   31:getfield        #34  <Field double[] zzbuy>
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
	//   31   49:invokestatic    #77  <Method void System.arraycopy(Object, int, Object, int, int)>
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
	//   40   64:getfield        #80  <Field int modCount>
	//   41   67:iconst_1        
	//   42   68:iadd            
	//   43   69:putfield        #80  <Field int modCount>
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
	//    1    1:invokevirtual   #71  <Method void zzta.zzua()>
		if(j >= i)
	//*   2    4:iload_2         
	//*   3    5:iload_1         
	//*   4    6:icmplt          50
		{
			double ad[] = zzbuy;
	//    5    9:aload_0         
	//    6   10:getfield        #34  <Field double[] zzbuy>
	//    7   13:astore_3        
			System.arraycopy(((Object) (ad)), j, ((Object) (ad)), i, size - j);
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
		double d = ((Double)obj).doubleValue();
	//    0    0:aload_2         
	//    1    1:checkcast       #84  <Class Double>
	//    2    4:invokevirtual   #88  <Method double Double.doubleValue()>
	//    3    7:dstore_3        
		((zzta)this).zzua();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #71  <Method void zzta.zzua()>
		zzaj(i);
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:invokespecial   #124 <Method void zzaj(int)>
		obj = ((Object) (zzbuy));
	//    9   17:aload_0         
	//   10   18:getfield        #34  <Field double[] zzbuy>
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
	//   21   33:invokestatic    #128 <Method Double Double.valueOf(double)>
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
			return ((zzuu) (new zzty(Arrays.copyOf(zzbuy, i), size)));
	//    4    8:new             #2   <Class zzty>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #34  <Field double[] zzbuy>
	//    8   16:iload_1         
	//    9   17:invokestatic    #107 <Method double[] Arrays.copyOf(double[], int)>
	//   10   20:aload_0         
	//   11   21:getfield        #36  <Field int size>
	//   12   24:invokespecial   #31  <Method void zzty(double[], int)>
	//   13   27:areturn         
		else
			throw new IllegalArgumentException();
	//   14   28:new             #148 <Class IllegalArgumentException>
	//   15   31:dup             
	//   16   32:invokespecial   #149 <Method void IllegalArgumentException()>
	//   17   35:athrow          
	}

	public final void zzd(double d)
	{
		zzc(size, d);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #36  <Field int size>
	//    3    5:dload_1         
	//    4    6:invokespecial   #90  <Method void zzc(int, double)>
	//    5    9:return          
	}

	private static final zzty zzbux;
	private int size;
	private double zzbuy[];

	static 
	{
		zzty zzty1 = new zzty();
	//    0    0:new             #2   <Class zzty>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void zzty()>
	//    3    7:astore_0        
		zzbux = zzty1;
	//    4    8:aload_0         
	//    5    9:putstatic       #24  <Field zzty zzbux>
		((zzta) (zzty1)).zzsw();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #27  <Method void zzta.zzsw()>
	//*   8   16:return          
	}
}
