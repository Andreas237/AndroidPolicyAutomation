// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aqk, ast, auh, aso

final class ase extends aqk
	implements ast, auh, RandomAccess
{

	ase()
	{
		this(new float[10], 0);
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:newarray        float[]
	//    3    5:iconst_0        
	//    4    6:invokespecial   #29  <Method void ase(float[], int)>
	//    5    9:return          
	}

	private ase(float af[], int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void aqk()>
		b = af;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #32  <Field float[] b>
		c = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #34  <Field int c>
	//    8   14:return          
	}

	private final void a(int i, float f)
	{
		((aqk)this).c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method void aqk.c()>
		if(i >= 0)
	//*   2    4:iload_1         
	//*   3    5:iflt            122
		{
			int j = c;
	//    4    8:aload_0         
	//    5    9:getfield        #34  <Field int c>
	//    6   12:istore_3        
			if(i <= j)
	//*   7   13:iload_1         
	//*   8   14:iload_3         
	//*   9   15:icmpgt          122
			{
				float af[] = b;
	//   10   18:aload_0         
	//   11   19:getfield        #32  <Field float[] b>
	//   12   22:astore          4
				if(j < af.length)
	//*  13   24:iload_3         
	//*  14   25:aload           4
	//*  15   27:arraylength     
	//*  16   28:icmpge          48
				{
					System.arraycopy(((Object) (af)), i, ((Object) (af)), i + 1, j - i);
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
					float af1[] = new float[(j * 3) / 2 + 1];
	//   28   48:iload_3         
	//   29   49:iconst_3        
	//   30   50:imul            
	//   31   51:iconst_2        
	//   32   52:idiv            
	//   33   53:iconst_1        
	//   34   54:iadd            
	//   35   55:newarray        float[]
	//   36   57:astore          5
					System.arraycopy(((Object) (af)), 0, ((Object) (af1)), 0, i);
	//   37   59:aload           4
	//   38   61:iconst_0        
	//   39   62:aload           5
	//   40   64:iconst_0        
	//   41   65:iload_1         
	//   42   66:invokestatic    #43  <Method void System.arraycopy(Object, int, Object, int, int)>
					System.arraycopy(((Object) (b)), i, ((Object) (af1)), i + 1, c - i);
	//   43   69:aload_0         
	//   44   70:getfield        #32  <Field float[] b>
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
					b = af1;
	//   55   88:aload_0         
	//   56   89:aload           5
	//   57   91:putfield        #32  <Field float[] b>
				}
				b[i] = f;
	//   58   94:aload_0         
	//   59   95:getfield        #32  <Field float[] b>
	//   60   98:iload_1         
	//   61   99:fload_2         
	//   62  100:fastore         
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
		throw new IndexOutOfBoundsException(c(i));
	//   76  122:new             #48  <Class IndexOutOfBoundsException>
	//   77  125:dup             
	//   78  126:aload_0         
	//   79  127:iload_1         
	//   80  128:invokespecial   #51  <Method String c(int)>
	//   81  131:invokespecial   #54  <Method void IndexOutOfBoundsException(String)>
	//   82  134:athrow          
	}

	private final void b(int i)
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
			throw new IndexOutOfBoundsException(c(i));
	//    7   13:new             #48  <Class IndexOutOfBoundsException>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:invokespecial   #51  <Method String c(int)>
	//   12   22:invokespecial   #54  <Method void IndexOutOfBoundsException(String)>
	//   13   25:athrow          
	}

	private final String c(int i)
	{
		int j = c;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int c>
	//    2    4:istore_2        
		StringBuilder stringbuilder = new StringBuilder(35);
	//    3    5:new             #57  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:bipush          35
	//    6   11:invokespecial   #59  <Method void StringBuilder(int)>
	//    7   14:astore_3        
		stringbuilder.append("Index:");
	//    8   15:aload_3         
	//    9   16:ldc1            #61  <String "Index:">
	//   10   18:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(i);
	//   12   22:aload_3         
	//   13   23:iload_1         
	//   14   24:invokevirtual   #68  <Method StringBuilder StringBuilder.append(int)>
	//   15   27:pop             
		stringbuilder.append(", Size:");
	//   16   28:aload_3         
	//   17   29:ldc1            #70  <String ", Size:">
	//   18   31:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   19   34:pop             
		stringbuilder.append(j);
	//   20   35:aload_3         
	//   21   36:iload_2         
	//   22   37:invokevirtual   #68  <Method StringBuilder StringBuilder.append(int)>
	//   23   40:pop             
		return stringbuilder.toString();
	//   24   41:aload_3         
	//   25   42:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   26   45:areturn         
	}

	public final ast a(int i)
	{
		if(i >= c)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #34  <Field int c>
	//*   3    5:icmplt          28
			return ((ast) (new ase(Arrays.copyOf(b, i), c)));
	//    4    8:new             #2   <Class ase>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #32  <Field float[] b>
	//    8   16:iload_1         
	//    9   17:invokestatic    #81  <Method float[] Arrays.copyOf(float[], int)>
	//   10   20:aload_0         
	//   11   21:getfield        #34  <Field int c>
	//   12   24:invokespecial   #29  <Method void ase(float[], int)>
	//   13   27:areturn         
		else
			throw new IllegalArgumentException();
	//   14   28:new             #83  <Class IllegalArgumentException>
	//   15   31:dup             
	//   16   32:invokespecial   #84  <Method void IllegalArgumentException()>
	//   17   35:athrow          
	}

	public final void a(float f)
	{
		a(c, f);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #34  <Field int c>
	//    3    5:fload_1         
	//    4    6:invokespecial   #87  <Method void a(int, float)>
	//    5    9:return          
	}

	public final void add(int i, Object obj)
	{
		a(i, ((Float)obj).floatValue());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #91  <Class Float>
	//    4    6:invokevirtual   #95  <Method float Float.floatValue()>
	//    5    9:invokespecial   #87  <Method void a(int, float)>
	//    6   12:return          
	}

	public final boolean addAll(Collection collection)
	{
		((aqk)this).c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method void aqk.c()>
		aso.a(((Object) (collection)));
	//    2    4:aload_1         
	//    3    5:invokestatic    #102 <Method Object aso.a(Object)>
	//    4    8:pop             
		if(!(collection instanceof ase))
	//*   5    9:aload_1         
	//*   6   10:instanceof      #2   <Class ase>
	//*   7   13:ifne            22
			return super.addAll(collection);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #104 <Method boolean aqk.addAll(Collection)>
	//   11   21:ireturn         
		collection = ((Collection) ((ase)collection));
	//   12   22:aload_1         
	//   13   23:checkcast       #2   <Class ase>
	//   14   26:astore_1        
		int i = ((ase) (collection)).c;
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
	//*  25   43:ldc1            #105 <Int 0x7fffffff>
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
			float af[] = b;
	//   34   55:aload_0         
	//   35   56:getfield        #32  <Field float[] b>
	//   36   59:astore          4
			if(i > af.length)
	//*  37   61:iload_2         
	//*  38   62:aload           4
	//*  39   64:arraylength     
	//*  40   65:icmple          78
				b = Arrays.copyOf(af, i);
	//   41   68:aload_0         
	//   42   69:aload           4
	//   43   71:iload_2         
	//   44   72:invokestatic    #81  <Method float[] Arrays.copyOf(float[], int)>
	//   45   75:putfield        #32  <Field float[] b>
			System.arraycopy(((Object) (((ase) (collection)).b)), 0, ((Object) (b)), c, ((ase) (collection)).c);
	//   46   78:aload_1         
	//   47   79:getfield        #32  <Field float[] b>
	//   48   82:iconst_0        
	//   49   83:aload_0         
	//   50   84:getfield        #32  <Field float[] b>
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
		if(!(obj instanceof ase))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class ase>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #112 <Method boolean aqk.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((ase)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class ase>
	//   14   24:astore_1        
		if(c != ((ase) (obj)).c)
	//*  15   25:aload_0         
	//*  16   26:getfield        #34  <Field int c>
	//*  17   29:aload_1         
	//*  18   30:getfield        #34  <Field int c>
	//*  19   33:icmpeq          38
			return false;
	//   20   36:iconst_0        
	//   21   37:ireturn         
		obj = ((Object) (((ase) (obj)).b));
	//   22   38:aload_1         
	//   23   39:getfield        #32  <Field float[] b>
	//   24   42:astore_1        
		for(int i = 0; i < c; i++)
	//*  25   43:iconst_0        
	//*  26   44:istore_2        
	//*  27   45:iload_2         
	//*  28   46:aload_0         
	//*  29   47:getfield        #34  <Field int c>
	//*  30   50:icmpge          75
			if(b[i] != obj[i])
	//*  31   53:aload_0         
	//*  32   54:getfield        #32  <Field float[] b>
	//*  33   57:iload_2         
	//*  34   58:faload          
	//*  35   59:aload_1         
	//*  36   60:iload_2         
	//*  37   61:faload          
	//*  38   62:fcmpl           
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
		b(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #116 <Method void b(int)>
		return ((Object) (Float.valueOf(b[i])));
	//    3    5:aload_0         
	//    4    6:getfield        #32  <Field float[] b>
	//    5    9:iload_1         
	//    6   10:faload          
	//    7   11:invokestatic    #120 <Method Float Float.valueOf(float)>
	//    8   14:areturn         
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
	//*   7    9:icmpge          34
			j = j * 31 + Float.floatToIntBits(b[i]);
	//    8   12:iload_2         
	//    9   13:bipush          31
	//   10   15:imul            
	//   11   16:aload_0         
	//   12   17:getfield        #32  <Field float[] b>
	//   13   20:iload_1         
	//   14   21:faload          
	//   15   22:invokestatic    #126 <Method int Float.floatToIntBits(float)>
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
		((aqk)this).c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method void aqk.c()>
		b(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #116 <Method void b(int)>
		float af[] = b;
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field float[] b>
	//    7   13:astore          4
		float f = af[i];
	//    8   15:aload           4
	//    9   17:iload_1         
	//   10   18:faload          
	//   11   19:fstore_2        
		int j = c;
	//   12   20:aload_0         
	//   13   21:getfield        #34  <Field int c>
	//   14   24:istore_3        
		if(i < j - 1)
	//*  15   25:iload_1         
	//*  16   26:iload_3         
	//*  17   27:iconst_1        
	//*  18   28:isub            
	//*  19   29:icmpge          46
			System.arraycopy(((Object) (af)), i + 1, ((Object) (af)), i, j - i);
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
		return ((Object) (Float.valueOf(f)));
	//   42   66:fload_2         
	//   43   67:invokestatic    #120 <Method Float Float.valueOf(float)>
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
			if(obj.equals(((Object) (Float.valueOf(b[i])))))
	//*   8   14:aload_1         
	//*   9   15:aload_0         
	//*  10   16:getfield        #32  <Field float[] b>
	//*  11   19:iload_2         
	//*  12   20:faload          
	//*  13   21:invokestatic    #120 <Method Float Float.valueOf(float)>
	//*  14   24:invokevirtual   #130 <Method boolean Object.equals(Object)>
	//*  15   27:ifeq            72
			{
				obj = ((Object) (b));
	//   16   30:aload_0         
	//   17   31:getfield        #32  <Field float[] b>
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
			float af[] = b;
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field float[] b>
	//    7   13:astore_3        
			System.arraycopy(((Object) (af)), j, ((Object) (af)), i, c - j);
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
	//   34   54:ldc1            #134 <String "toIndex < fromIndex">
	//   35   56:invokespecial   #54  <Method void IndexOutOfBoundsException(String)>
	//   36   59:athrow          
		}
	}

	public final Object set(int i, Object obj)
	{
		float f = ((Float)obj).floatValue();
	//    0    0:aload_2         
	//    1    1:checkcast       #91  <Class Float>
	//    2    4:invokevirtual   #95  <Method float Float.floatValue()>
	//    3    7:fstore_3        
		((aqk)this).c();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #37  <Method void aqk.c()>
		b(i);
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:invokespecial   #116 <Method void b(int)>
		obj = ((Object) (b));
	//    9   17:aload_0         
	//   10   18:getfield        #32  <Field float[] b>
	//   11   21:astore_2        
		float f1 = obj[i];
	//   12   22:aload_2         
	//   13   23:iload_1         
	//   14   24:faload          
	//   15   25:fstore          4
		obj[i] = f;
	//   16   27:aload_2         
	//   17   28:iload_1         
	//   18   29:fload_3         
	//   19   30:fastore         
		return ((Object) (Float.valueOf(f1)));
	//   20   31:fload           4
	//   21   33:invokestatic    #120 <Method Float Float.valueOf(float)>
	//   22   36:areturn         
	}

	public final int size()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int c>
	//    2    4:ireturn         
	}

	private static final ase a;
	private float b[];
	private int c;

	static 
	{
		ase ase1 = new ase();
	//    0    0:new             #2   <Class ase>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void ase()>
	//    3    7:astore_0        
		a = ase1;
	//    4    8:aload_0         
	//    5    9:putstatic       #23  <Field ase a>
		((aqk) (ase1)).b();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #25  <Method void aqk.b()>
	//*   8   16:return          
	}
}