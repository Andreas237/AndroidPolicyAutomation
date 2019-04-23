// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aqk, ast, auh, aso

final class asn extends aqk
	implements ast, auh, RandomAccess
{

	asn()
	{
		this(new int[10], 0);
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:newarray        int[]
	//    3    5:iconst_0        
	//    4    6:invokespecial   #29  <Method void asn(int[], int)>
	//    5    9:return          
	}

	private asn(int ai[], int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void aqk()>
		b = ai;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #32  <Field int[] b>
		c = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #34  <Field int c>
	//    8   14:return          
	}

	private final void a(int i, int j)
	{
		((aqk)this).c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method void aqk.c()>
		if(i >= 0)
	//*   2    4:iload_1         
	//*   3    5:iflt            122
		{
			int k = c;
	//    4    8:aload_0         
	//    5    9:getfield        #34  <Field int c>
	//    6   12:istore_3        
			if(i <= k)
	//*   7   13:iload_1         
	//*   8   14:iload_3         
	//*   9   15:icmpgt          122
			{
				int ai[] = b;
	//   10   18:aload_0         
	//   11   19:getfield        #32  <Field int[] b>
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
	//   26   42:invokestatic    #43  <Method void System.arraycopy(Object, int, Object, int, int)>
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
	//   42   66:invokestatic    #43  <Method void System.arraycopy(Object, int, Object, int, int)>
					System.arraycopy(((Object) (b)), i, ((Object) (ai1)), i + 1, c - i);
	//   43   69:aload_0         
	//   44   70:getfield        #32  <Field int[] b>
	//   45   73:iload_1         
	//   46   74:aload           5
	//   47   76:iload_1         
	//   48   77:iconst_1        
	//   49   78:iadd            
	//   50   79:aload_0         
	//   51   80:getfield        #34  <Field int c>
	//   52   83:iload_1         
	//   53   84:isub            
	//   54   85:invokestatic    #43  <Method void System.arraycopy(Object, int, Object, int, int)>
					b = ai1;
	//   55   88:aload_0         
	//   56   89:aload           5
	//   57   91:putfield        #32  <Field int[] b>
				}
				b[i] = j;
	//   58   94:aload_0         
	//   59   95:getfield        #32  <Field int[] b>
	//   60   98:iload_1         
	//   61   99:iload_2         
	//   62  100:iastore         
				c = c + 1;
	//   63  101:aload_0         
	//   64  102:aload_0         
	//   65  103:getfield        #34  <Field int c>
	//   66  106:iconst_1        
	//   67  107:iadd            
	//   68  108:putfield        #34  <Field int c>
				modCount = modCount + 1;
	//   69  111:aload_0         
	//   70  112:aload_0         
	//   71  113:getfield        #46  <Field int modCount>
	//   72  116:iconst_1        
	//   73  117:iadd            
	//   74  118:putfield        #46  <Field int modCount>
				return;
	//   75  121:return          
			}
		}
		throw new IndexOutOfBoundsException(e(i));
	//   76  122:new             #48  <Class IndexOutOfBoundsException>
	//   77  125:dup             
	//   78  126:aload_0         
	//   79  127:iload_1         
	//   80  128:invokespecial   #52  <Method String e(int)>
	//   81  131:invokespecial   #55  <Method void IndexOutOfBoundsException(String)>
	//   82  134:athrow          
	}

	public static asn d()
	{
		return a;
	//    0    0:getstatic       #23  <Field asn a>
	//    1    3:areturn         
	}

	private final void d(int i)
	{
		if(i >= 0 && i < c)
	//*   0    0:iload_1         
	//*   1    1:iflt            13
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #34  <Field int c>
	//*   5    9:icmpge          13
			return;
	//    6   12:return          
		else
			throw new IndexOutOfBoundsException(e(i));
	//    7   13:new             #48  <Class IndexOutOfBoundsException>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:invokespecial   #52  <Method String e(int)>
	//   12   22:invokespecial   #55  <Method void IndexOutOfBoundsException(String)>
	//   13   25:athrow          
	}

	private final String e(int i)
	{
		int j = c;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int c>
	//    2    4:istore_2        
		StringBuilder stringbuilder = new StringBuilder(35);
	//    3    5:new             #60  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:bipush          35
	//    6   11:invokespecial   #62  <Method void StringBuilder(int)>
	//    7   14:astore_3        
		stringbuilder.append("Index:");
	//    8   15:aload_3         
	//    9   16:ldc1            #64  <String "Index:">
	//   10   18:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(i);
	//   12   22:aload_3         
	//   13   23:iload_1         
	//   14   24:invokevirtual   #71  <Method StringBuilder StringBuilder.append(int)>
	//   15   27:pop             
		stringbuilder.append(", Size:");
	//   16   28:aload_3         
	//   17   29:ldc1            #73  <String ", Size:">
	//   18   31:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   19   34:pop             
		stringbuilder.append(j);
	//   20   35:aload_3         
	//   21   36:iload_2         
	//   22   37:invokevirtual   #71  <Method StringBuilder StringBuilder.append(int)>
	//   23   40:pop             
		return stringbuilder.toString();
	//   24   41:aload_3         
	//   25   42:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   26   45:areturn         
	}

	public final ast a(int i)
	{
		if(i >= c)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #34  <Field int c>
	//*   3    5:icmplt          28
			return ((ast) (new asn(Arrays.copyOf(b, i), c)));
	//    4    8:new             #2   <Class asn>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #32  <Field int[] b>
	//    8   16:iload_1         
	//    9   17:invokestatic    #84  <Method int[] Arrays.copyOf(int[], int)>
	//   10   20:aload_0         
	//   11   21:getfield        #34  <Field int c>
	//   12   24:invokespecial   #29  <Method void asn(int[], int)>
	//   13   27:areturn         
		else
			throw new IllegalArgumentException();
	//   14   28:new             #86  <Class IllegalArgumentException>
	//   15   31:dup             
	//   16   32:invokespecial   #87  <Method void IllegalArgumentException()>
	//   17   35:athrow          
	}

	public final void add(int i, Object obj)
	{
		a(i, ((Integer)obj).intValue());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #91  <Class Integer>
	//    4    6:invokevirtual   #95  <Method int Integer.intValue()>
	//    5    9:invokespecial   #97  <Method void a(int, int)>
	//    6   12:return          
	}

	public final boolean addAll(Collection collection)
	{
		((aqk)this).c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method void aqk.c()>
		aso.a(((Object) (collection)));
	//    2    4:aload_1         
	//    3    5:invokestatic    #104 <Method Object aso.a(Object)>
	//    4    8:pop             
		if(!(collection instanceof asn))
	//*   5    9:aload_1         
	//*   6   10:instanceof      #2   <Class asn>
	//*   7   13:ifne            22
			return super.addAll(collection);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #106 <Method boolean aqk.addAll(Collection)>
	//   11   21:ireturn         
		collection = ((Collection) ((asn)collection));
	//   12   22:aload_1         
	//   13   23:checkcast       #2   <Class asn>
	//   14   26:astore_1        
		int i = ((asn) (collection)).c;
	//   15   27:aload_1         
	//   16   28:getfield        #34  <Field int c>
	//   17   31:istore_2        
		if(i == 0)
	//*  18   32:iload_2         
	//*  19   33:ifne            38
			return false;
	//   20   36:iconst_0        
	//   21   37:ireturn         
		int j = c;
	//   22   38:aload_0         
	//   23   39:getfield        #34  <Field int c>
	//   24   42:istore_3        
		if(0x7fffffff - j >= i)
	//*  25   43:ldc1            #107 <Int 0x7fffffff>
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
			int ai[] = b;
	//   34   55:aload_0         
	//   35   56:getfield        #32  <Field int[] b>
	//   36   59:astore          4
			if(i > ai.length)
	//*  37   61:iload_2         
	//*  38   62:aload           4
	//*  39   64:arraylength     
	//*  40   65:icmple          78
				b = Arrays.copyOf(ai, i);
	//   41   68:aload_0         
	//   42   69:aload           4
	//   43   71:iload_2         
	//   44   72:invokestatic    #84  <Method int[] Arrays.copyOf(int[], int)>
	//   45   75:putfield        #32  <Field int[] b>
			System.arraycopy(((Object) (((asn) (collection)).b)), 0, ((Object) (b)), c, ((asn) (collection)).c);
	//   46   78:aload_1         
	//   47   79:getfield        #32  <Field int[] b>
	//   48   82:iconst_0        
	//   49   83:aload_0         
	//   50   84:getfield        #32  <Field int[] b>
	//   51   87:aload_0         
	//   52   88:getfield        #34  <Field int c>
	//   53   91:aload_1         
	//   54   92:getfield        #34  <Field int c>
	//   55   95:invokestatic    #43  <Method void System.arraycopy(Object, int, Object, int, int)>
			c = i;
	//   56   98:aload_0         
	//   57   99:iload_2         
	//   58  100:putfield        #34  <Field int c>
			modCount = modCount + 1;
	//   59  103:aload_0         
	//   60  104:aload_0         
	//   61  105:getfield        #46  <Field int modCount>
	//   62  108:iconst_1        
	//   63  109:iadd            
	//   64  110:putfield        #46  <Field int modCount>
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

	public final int b(int i)
	{
		d(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #113 <Method void d(int)>
		return b[i];
	//    3    5:aload_0         
	//    4    6:getfield        #32  <Field int[] b>
	//    5    9:iload_1         
	//    6   10:iaload          
	//    7   11:ireturn         
	}

	public final void c(int i)
	{
		a(c, i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #34  <Field int c>
	//    3    5:iload_1         
	//    4    6:invokespecial   #97  <Method void a(int, int)>
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
		if(!(obj instanceof asn))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class asn>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #117 <Method boolean aqk.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((asn)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class asn>
	//   14   24:astore_1        
		if(c != ((asn) (obj)).c)
	//*  15   25:aload_0         
	//*  16   26:getfield        #34  <Field int c>
	//*  17   29:aload_1         
	//*  18   30:getfield        #34  <Field int c>
	//*  19   33:icmpeq          38
			return false;
	//   20   36:iconst_0        
	//   21   37:ireturn         
		obj = ((Object) (((asn) (obj)).b));
	//   22   38:aload_1         
	//   23   39:getfield        #32  <Field int[] b>
	//   24   42:astore_1        
		for(int i = 0; i < c; i++)
	//*  25   43:iconst_0        
	//*  26   44:istore_2        
	//*  27   45:iload_2         
	//*  28   46:aload_0         
	//*  29   47:getfield        #34  <Field int c>
	//*  30   50:icmpge          74
			if(b[i] != obj[i])
	//*  31   53:aload_0         
	//*  32   54:getfield        #32  <Field int[] b>
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
		return ((Object) (Integer.valueOf(b(i))));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #121 <Method int b(int)>
	//    3    5:invokestatic    #125 <Method Integer Integer.valueOf(int)>
	//    4    8:areturn         
	}

	public final int hashCode()
	{
		int j = 1;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		for(int i = 0; i < c; i++)
	//*   2    2:iconst_0        
	//*   3    3:istore_1        
	//*   4    4:iload_1         
	//*   5    5:aload_0         
	//*   6    6:getfield        #34  <Field int c>
	//*   7    9:icmpge          31
			j = j * 31 + b[i];
	//    8   12:iload_2         
	//    9   13:bipush          31
	//   10   15:imul            
	//   11   16:aload_0         
	//   12   17:getfield        #32  <Field int[] b>
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
		((aqk)this).c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method void aqk.c()>
		d(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #113 <Method void d(int)>
		int ai[] = b;
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field int[] b>
	//    7   13:astore          4
		int j = ai[i];
	//    8   15:aload           4
	//    9   17:iload_1         
	//   10   18:iaload          
	//   11   19:istore_2        
		int k = c;
	//   12   20:aload_0         
	//   13   21:getfield        #34  <Field int c>
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
	//   29   43:invokestatic    #43  <Method void System.arraycopy(Object, int, Object, int, int)>
		c = c - 1;
	//   30   46:aload_0         
	//   31   47:aload_0         
	//   32   48:getfield        #34  <Field int c>
	//   33   51:iconst_1        
	//   34   52:isub            
	//   35   53:putfield        #34  <Field int c>
		modCount = modCount + 1;
	//   36   56:aload_0         
	//   37   57:aload_0         
	//   38   58:getfield        #46  <Field int modCount>
	//   39   61:iconst_1        
	//   40   62:iadd            
	//   41   63:putfield        #46  <Field int modCount>
		return ((Object) (Integer.valueOf(j)));
	//   42   66:iload_2         
	//   43   67:invokestatic    #125 <Method Integer Integer.valueOf(int)>
	//   44   70:areturn         
	}

	public final boolean remove(Object obj)
	{
		((aqk)this).c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method void aqk.c()>
		for(int i = 0; i < c; i++)
	//*   2    4:iconst_0        
	//*   3    5:istore_2        
	//*   4    6:iload_2         
	//*   5    7:aload_0         
	//*   6    8:getfield        #34  <Field int c>
	//*   7   11:icmpge          79
			if(obj.equals(((Object) (Integer.valueOf(b[i])))))
	//*   8   14:aload_1         
	//*   9   15:aload_0         
	//*  10   16:getfield        #32  <Field int[] b>
	//*  11   19:iload_2         
	//*  12   20:iaload          
	//*  13   21:invokestatic    #125 <Method Integer Integer.valueOf(int)>
	//*  14   24:invokevirtual   #130 <Method boolean Object.equals(Object)>
	//*  15   27:ifeq            72
			{
				obj = ((Object) (b));
	//   16   30:aload_0         
	//   17   31:getfield        #32  <Field int[] b>
	//   18   34:astore_1        
				System.arraycopy(obj, i + 1, obj, i, c - i);
	//   19   35:aload_1         
	//   20   36:iload_2         
	//   21   37:iconst_1        
	//   22   38:iadd            
	//   23   39:aload_1         
	//   24   40:iload_2         
	//   25   41:aload_0         
	//   26   42:getfield        #34  <Field int c>
	//   27   45:iload_2         
	//   28   46:isub            
	//   29   47:invokestatic    #43  <Method void System.arraycopy(Object, int, Object, int, int)>
				c = c - 1;
	//   30   50:aload_0         
	//   31   51:aload_0         
	//   32   52:getfield        #34  <Field int c>
	//   33   55:iconst_1        
	//   34   56:isub            
	//   35   57:putfield        #34  <Field int c>
				modCount = modCount + 1;
	//   36   60:aload_0         
	//   37   61:aload_0         
	//   38   62:getfield        #46  <Field int modCount>
	//   39   65:iconst_1        
	//   40   66:iadd            
	//   41   67:putfield        #46  <Field int modCount>
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
		((aqk)this).c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method void aqk.c()>
		if(j >= i)
	//*   2    4:iload_2         
	//*   3    5:iload_1         
	//*   4    6:icmplt          50
		{
			int ai[] = b;
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field int[] b>
	//    7   13:astore_3        
			System.arraycopy(((Object) (ai)), j, ((Object) (ai)), i, c - j);
	//    8   14:aload_3         
	//    9   15:iload_2         
	//   10   16:aload_3         
	//   11   17:iload_1         
	//   12   18:aload_0         
	//   13   19:getfield        #34  <Field int c>
	//   14   22:iload_2         
	//   15   23:isub            
	//   16   24:invokestatic    #43  <Method void System.arraycopy(Object, int, Object, int, int)>
			c = c - (j - i);
	//   17   27:aload_0         
	//   18   28:aload_0         
	//   19   29:getfield        #34  <Field int c>
	//   20   32:iload_2         
	//   21   33:iload_1         
	//   22   34:isub            
	//   23   35:isub            
	//   24   36:putfield        #34  <Field int c>
			modCount = modCount + 1;
	//   25   39:aload_0         
	//   26   40:aload_0         
	//   27   41:getfield        #46  <Field int modCount>
	//   28   44:iconst_1        
	//   29   45:iadd            
	//   30   46:putfield        #46  <Field int modCount>
			return;
	//   31   49:return          
		} else
		{
			throw new IndexOutOfBoundsException("toIndex < fromIndex");
	//   32   50:new             #48  <Class IndexOutOfBoundsException>
	//   33   53:dup             
	//   34   54:ldc1            #133 <String "toIndex < fromIndex">
	//   35   56:invokespecial   #55  <Method void IndexOutOfBoundsException(String)>
	//   36   59:athrow          
		}
	}

	public final Object set(int i, Object obj)
	{
		int j = ((Integer)obj).intValue();
	//    0    0:aload_2         
	//    1    1:checkcast       #91  <Class Integer>
	//    2    4:invokevirtual   #95  <Method int Integer.intValue()>
	//    3    7:istore_3        
		((aqk)this).c();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #37  <Method void aqk.c()>
		d(i);
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:invokespecial   #113 <Method void d(int)>
		obj = ((Object) (b));
	//    9   17:aload_0         
	//   10   18:getfield        #32  <Field int[] b>
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
	//   21   33:invokestatic    #125 <Method Integer Integer.valueOf(int)>
	//   22   36:areturn         
	}

	public final int size()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int c>
	//    2    4:ireturn         
	}

	private static final asn a;
	private int b[];
	private int c;

	static 
	{
		asn asn1 = new asn();
	//    0    0:new             #2   <Class asn>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void asn()>
	//    3    7:astore_0        
		a = asn1;
	//    4    8:aload_0         
	//    5    9:putstatic       #23  <Field asn a>
		((aqk) (asn1)).b();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #25  <Method void aqk.b()>
	//*   8   16:return          
	}
}
