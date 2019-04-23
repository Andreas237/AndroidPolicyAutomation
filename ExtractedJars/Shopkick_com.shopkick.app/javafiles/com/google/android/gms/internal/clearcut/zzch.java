// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzav, zzcn, zzci

final class zzch extends zzav
	implements zzcn, RandomAccess
{

	zzch()
	{
		this(new int[10], 0);
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:newarray        int[]
	//    3    5:iconst_0        
	//    4    6:invokespecial   #29  <Method void zzch(int[], int)>
	//    5    9:return          
	}

	private zzch(int ai[], int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void zzav()>
		zzks = ai;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #32  <Field int[] zzks>
		size = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #34  <Field int size>
	//    8   14:return          
	}

	public static zzch zzbk()
	{
		return zzkr;
	//    0    0:getstatic       #22  <Field zzch zzkr>
	//    1    3:areturn         
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
	//    7   13:new             #40  <Class IndexOutOfBoundsException>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:invokespecial   #44  <Method String zzh(int)>
	//   12   22:invokespecial   #47  <Method void IndexOutOfBoundsException(String)>
	//   13   25:athrow          
	}

	private final String zzh(int i)
	{
		int j = size;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int size>
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

	private final void zzo(int i, int j)
	{
		((zzav)this).zzw();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method void zzav.zzw()>
		if(i >= 0)
	//*   2    4:iload_1         
	//*   3    5:iflt            122
		{
			int k = size;
	//    4    8:aload_0         
	//    5    9:getfield        #34  <Field int size>
	//    6   12:istore_3        
			if(i <= k)
	//*   7   13:iload_1         
	//*   8   14:iload_3         
	//*   9   15:icmpgt          122
			{
				int ai[] = zzks;
	//   10   18:aload_0         
	//   11   19:getfield        #32  <Field int[] zzks>
	//   12   22:astore          4
				if(k < ai.length)
	//*  13   24:iload_3         
	//*  14   25:aload           4
	//*  15   27:arraylength     
	//*  16   28:icmpge          48
				{
					System.arraycopy(((Object) (ai)), i, ((Object) (ai)), i + 1, k - i);
	//   17   31:aload           4
	//   18   33:iload_1         
	//   19   34:aload           4
	//   20   36:iload_1         
	//   21   37:iconst_1        
	//   22   38:iadd            
	//   23   39:iload_3         
	//   24   40:iload_1         
	//   25   41:isub            
	//   26   42:invokestatic    #77  <Method void System.arraycopy(Object, int, Object, int, int)>
				} else
	//*  27   45:goto            94
				{
					int ai1[] = new int[(k * 3) / 2 + 1];
	//   28   48:iload_3         
	//   29   49:iconst_3        
	//   30   50:imul            
	//   31   51:iconst_2        
	//   32   52:idiv            
	//   33   53:iconst_1        
	//   34   54:iadd            
	//   35   55:newarray        int[]
	//   36   57:astore          5
					System.arraycopy(((Object) (ai)), 0, ((Object) (ai1)), 0, i);
	//   37   59:aload           4
	//   38   61:iconst_0        
	//   39   62:aload           5
	//   40   64:iconst_0        
	//   41   65:iload_1         
	//   42   66:invokestatic    #77  <Method void System.arraycopy(Object, int, Object, int, int)>
					System.arraycopy(((Object) (zzks)), i, ((Object) (ai1)), i + 1, size - i);
	//   43   69:aload_0         
	//   44   70:getfield        #32  <Field int[] zzks>
	//   45   73:iload_1         
	//   46   74:aload           5
	//   47   76:iload_1         
	//   48   77:iconst_1        
	//   49   78:iadd            
	//   50   79:aload_0         
	//   51   80:getfield        #34  <Field int size>
	//   52   83:iload_1         
	//   53   84:isub            
	//   54   85:invokestatic    #77  <Method void System.arraycopy(Object, int, Object, int, int)>
					zzks = ai1;
	//   55   88:aload_0         
	//   56   89:aload           5
	//   57   91:putfield        #32  <Field int[] zzks>
				}
				zzks[i] = j;
	//   58   94:aload_0         
	//   59   95:getfield        #32  <Field int[] zzks>
	//   60   98:iload_1         
	//   61   99:iload_2         
	//   62  100:iastore         
				size = size + 1;
	//   63  101:aload_0         
	//   64  102:aload_0         
	//   65  103:getfield        #34  <Field int size>
	//   66  106:iconst_1        
	//   67  107:iadd            
	//   68  108:putfield        #34  <Field int size>
				modCount = modCount + 1;
	//   69  111:aload_0         
	//   70  112:aload_0         
	//   71  113:getfield        #80  <Field int modCount>
	//   72  116:iconst_1        
	//   73  117:iadd            
	//   74  118:putfield        #80  <Field int modCount>
				return;
	//   75  121:return          
			}
		}
		throw new IndexOutOfBoundsException(zzh(i));
	//   76  122:new             #40  <Class IndexOutOfBoundsException>
	//   77  125:dup             
	//   78  126:aload_0         
	//   79  127:iload_1         
	//   80  128:invokespecial   #44  <Method String zzh(int)>
	//   81  131:invokespecial   #47  <Method void IndexOutOfBoundsException(String)>
	//   82  134:athrow          
	}

	public final void add(int i, Object obj)
	{
		zzo(i, ((Integer)obj).intValue());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #84  <Class Integer>
	//    4    6:invokevirtual   #88  <Method int Integer.intValue()>
	//    5    9:invokespecial   #90  <Method void zzo(int, int)>
	//    6   12:return          
	}

	public final boolean addAll(Collection collection)
	{
		((zzav)this).zzw();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method void zzav.zzw()>
		zzci.checkNotNull(((Object) (collection)));
	//    2    4:aload_1         
	//    3    5:invokestatic    #98  <Method Object zzci.checkNotNull(Object)>
	//    4    8:pop             
		if(!(collection instanceof zzch))
	//*   5    9:aload_1         
	//*   6   10:instanceof      #2   <Class zzch>
	//*   7   13:ifne            22
			return super.addAll(collection);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #100 <Method boolean zzav.addAll(Collection)>
	//   11   21:ireturn         
		collection = ((Collection) ((zzch)collection));
	//   12   22:aload_1         
	//   13   23:checkcast       #2   <Class zzch>
	//   14   26:astore_1        
		int i = ((zzch) (collection)).size;
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
			int ai[] = zzks;
	//   34   55:aload_0         
	//   35   56:getfield        #32  <Field int[] zzks>
	//   36   59:astore          4
			if(i > ai.length)
	//*  37   61:iload_2         
	//*  38   62:aload           4
	//*  39   64:arraylength     
	//*  40   65:icmple          78
				zzks = Arrays.copyOf(ai, i);
	//   41   68:aload_0         
	//   42   69:aload           4
	//   43   71:iload_2         
	//   44   72:invokestatic    #107 <Method int[] Arrays.copyOf(int[], int)>
	//   45   75:putfield        #32  <Field int[] zzks>
			System.arraycopy(((Object) (((zzch) (collection)).zzks)), 0, ((Object) (zzks)), size, ((zzch) (collection)).size);
	//   46   78:aload_1         
	//   47   79:getfield        #32  <Field int[] zzks>
	//   48   82:iconst_0        
	//   49   83:aload_0         
	//   50   84:getfield        #32  <Field int[] zzks>
	//   51   87:aload_0         
	//   52   88:getfield        #34  <Field int size>
	//   53   91:aload_1         
	//   54   92:getfield        #34  <Field int size>
	//   55   95:invokestatic    #77  <Method void System.arraycopy(Object, int, Object, int, int)>
			size = i;
	//   56   98:aload_0         
	//   57   99:iload_2         
	//   58  100:putfield        #34  <Field int size>
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
		if(!(obj instanceof zzch))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzch>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #116 <Method boolean zzav.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((zzch)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class zzch>
	//   14   24:astore_1        
		if(size != ((zzch) (obj)).size)
	//*  15   25:aload_0         
	//*  16   26:getfield        #34  <Field int size>
	//*  17   29:aload_1         
	//*  18   30:getfield        #34  <Field int size>
	//*  19   33:icmpeq          38
			return false;
	//   20   36:iconst_0        
	//   21   37:ireturn         
		obj = ((Object) (((zzch) (obj)).zzks));
	//   22   38:aload_1         
	//   23   39:getfield        #32  <Field int[] zzks>
	//   24   42:astore_1        
		for(int i = 0; i < size; i++)
	//*  25   43:iconst_0        
	//*  26   44:istore_2        
	//*  27   45:iload_2         
	//*  28   46:aload_0         
	//*  29   47:getfield        #34  <Field int size>
	//*  30   50:icmpge          74
			if(zzks[i] != obj[i])
	//*  31   53:aload_0         
	//*  32   54:getfield        #32  <Field int[] zzks>
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
	//    2    2:invokevirtual   #122 <Method int getInt(int)>
	//    3    5:invokestatic    #126 <Method Integer Integer.valueOf(int)>
	//    4    8:areturn         
	}

	public final int getInt(int i)
	{
		zzg(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #128 <Method void zzg(int)>
		return zzks[i];
	//    3    5:aload_0         
	//    4    6:getfield        #32  <Field int[] zzks>
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
			j = j * 31 + zzks[i];
	//    8   12:iload_2         
	//    9   13:bipush          31
	//   10   15:imul            
	//   11   16:aload_0         
	//   12   17:getfield        #32  <Field int[] zzks>
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
		((zzav)this).zzw();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method void zzav.zzw()>
		zzg(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #128 <Method void zzg(int)>
		int ai[] = zzks;
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field int[] zzks>
	//    7   13:astore          4
		int j = ai[i];
	//    8   15:aload           4
	//    9   17:iload_1         
	//   10   18:iaload          
	//   11   19:istore_2        
		int k = size;
	//   12   20:aload_0         
	//   13   21:getfield        #34  <Field int size>
	//   14   24:istore_3        
		if(i < k - 1)
	//*  15   25:iload_1         
	//*  16   26:iload_3         
	//*  17   27:iconst_1        
	//*  18   28:isub            
	//*  19   29:icmpge          46
			System.arraycopy(((Object) (ai)), i + 1, ((Object) (ai)), i, k - i);
	//   20   32:aload           4
	//   21   34:iload_1         
	//   22   35:iconst_1        
	//   23   36:iadd            
	//   24   37:aload           4
	//   25   39:iload_1         
	//   26   40:iload_3         
	//   27   41:iload_1         
	//   28   42:isub            
	//   29   43:invokestatic    #77  <Method void System.arraycopy(Object, int, Object, int, int)>
		size = size - 1;
	//   30   46:aload_0         
	//   31   47:aload_0         
	//   32   48:getfield        #34  <Field int size>
	//   33   51:iconst_1        
	//   34   52:isub            
	//   35   53:putfield        #34  <Field int size>
		modCount = modCount + 1;
	//   36   56:aload_0         
	//   37   57:aload_0         
	//   38   58:getfield        #80  <Field int modCount>
	//   39   61:iconst_1        
	//   40   62:iadd            
	//   41   63:putfield        #80  <Field int modCount>
		return ((Object) (Integer.valueOf(j)));
	//   42   66:iload_2         
	//   43   67:invokestatic    #126 <Method Integer Integer.valueOf(int)>
	//   44   70:areturn         
	}

	public final boolean remove(Object obj)
	{
		((zzav)this).zzw();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method void zzav.zzw()>
		for(int i = 0; i < size; i++)
	//*   2    4:iconst_0        
	//*   3    5:istore_2        
	//*   4    6:iload_2         
	//*   5    7:aload_0         
	//*   6    8:getfield        #34  <Field int size>
	//*   7   11:icmpge          79
			if(obj.equals(((Object) (Integer.valueOf(zzks[i])))))
	//*   8   14:aload_1         
	//*   9   15:aload_0         
	//*  10   16:getfield        #32  <Field int[] zzks>
	//*  11   19:iload_2         
	//*  12   20:iaload          
	//*  13   21:invokestatic    #126 <Method Integer Integer.valueOf(int)>
	//*  14   24:invokevirtual   #133 <Method boolean Object.equals(Object)>
	//*  15   27:ifeq            72
			{
				obj = ((Object) (zzks));
	//   16   30:aload_0         
	//   17   31:getfield        #32  <Field int[] zzks>
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
	//   29   47:invokestatic    #77  <Method void System.arraycopy(Object, int, Object, int, int)>
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
		((zzav)this).zzw();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method void zzav.zzw()>
		if(j >= i)
	//*   2    4:iload_2         
	//*   3    5:iload_1         
	//*   4    6:icmplt          50
		{
			int ai[] = zzks;
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field int[] zzks>
	//    7   13:astore_3        
			System.arraycopy(((Object) (ai)), j, ((Object) (ai)), i, size - j);
	//    8   14:aload_3         
	//    9   15:iload_2         
	//   10   16:aload_3         
	//   11   17:iload_1         
	//   12   18:aload_0         
	//   13   19:getfield        #34  <Field int size>
	//   14   22:iload_2         
	//   15   23:isub            
	//   16   24:invokestatic    #77  <Method void System.arraycopy(Object, int, Object, int, int)>
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
	//   34   54:ldc1            #136 <String "toIndex < fromIndex">
	//   35   56:invokespecial   #47  <Method void IndexOutOfBoundsException(String)>
	//   36   59:athrow          
		}
	}

	public final Object set(int i, Object obj)
	{
		int j = ((Integer)obj).intValue();
	//    0    0:aload_2         
	//    1    1:checkcast       #84  <Class Integer>
	//    2    4:invokevirtual   #88  <Method int Integer.intValue()>
	//    3    7:istore_3        
		((zzav)this).zzw();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #71  <Method void zzav.zzw()>
		zzg(i);
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:invokespecial   #128 <Method void zzg(int)>
		obj = ((Object) (zzks));
	//    9   17:aload_0         
	//   10   18:getfield        #32  <Field int[] zzks>
	//   11   21:astore_2        
		int k = obj[i];
	//   12   22:aload_2         
	//   13   23:iload_1         
	//   14   24:iaload          
	//   15   25:istore          4
		obj[i] = j;
	//   16   27:aload_2         
	//   17   28:iload_1         
	//   18   29:iload_3         
	//   19   30:iastore         
		return ((Object) (Integer.valueOf(k)));
	//   20   31:iload           4
	//   21   33:invokestatic    #126 <Method Integer Integer.valueOf(int)>
	//   22   36:areturn         
	}

	public final int size()
	{
		return size;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int size>
	//    2    4:ireturn         
	}

	public final void zzac(int i)
	{
		zzo(size, i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #34  <Field int size>
	//    3    5:iload_1         
	//    4    6:invokespecial   #90  <Method void zzo(int, int)>
	//    5    9:return          
	}

	public final zzcn zzi(int i)
	{
		if(i >= size)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #34  <Field int size>
	//*   3    5:icmplt          28
			return ((zzcn) (new zzch(Arrays.copyOf(zzks, i), size)));
	//    4    8:new             #2   <Class zzch>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #32  <Field int[] zzks>
	//    8   16:iload_1         
	//    9   17:invokestatic    #107 <Method int[] Arrays.copyOf(int[], int)>
	//   10   20:aload_0         
	//   11   21:getfield        #34  <Field int size>
	//   12   24:invokespecial   #29  <Method void zzch(int[], int)>
	//   13   27:areturn         
		else
			throw new IllegalArgumentException();
	//   14   28:new             #143 <Class IllegalArgumentException>
	//   15   31:dup             
	//   16   32:invokespecial   #144 <Method void IllegalArgumentException()>
	//   17   35:athrow          
	}

	private static final zzch zzkr;
	private int size;
	private int zzks[];

	static 
	{
		zzch zzch1 = new zzch();
	//    0    0:new             #2   <Class zzch>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void zzch()>
	//    3    7:astore_0        
		zzkr = zzch1;
	//    4    8:aload_0         
	//    5    9:putstatic       #22  <Field zzch zzkr>
		((zzav) (zzch1)).zzv();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #25  <Method void zzav.zzv()>
	//*   8   16:return          
	}
}
