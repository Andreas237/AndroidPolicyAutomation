// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.*;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			acd, ays, aza, ayu, 
//			xz, ayy, abc

public class ayr
	implements acd, Closeable, Iterator
{

	public ayr()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
		h = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #49  <Field abc h>
		c = 0L;
	//    5    9:aload_0         
	//    6   10:lconst_0        
	//    7   11:putfield        #51  <Field long c>
		d = 0L;
	//    8   14:aload_0         
	//    9   15:lconst_0        
	//   10   16:putfield        #53  <Field long d>
		e = 0L;
	//   11   19:aload_0         
	//   12   20:lconst_0        
	//   13   21:putfield        #55  <Field long e>
		i = ((List) (new ArrayList()));
	//   14   24:aload_0         
	//   15   25:new             #57  <Class ArrayList>
	//   16   28:dup             
	//   17   29:invokespecial   #58  <Method void ArrayList()>
	//   18   32:putfield        #60  <Field List i>
	//   19   35:return          
	}

	private final abc a()
	{
		Object obj;
		obj = ((Object) (h));
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field abc h>
	//    2    4:astore_1        
		if(obj != null && obj != f)
	//*   3    5:aload_1         
	//*   4    6:ifnull          23
	//*   5    9:aload_1         
	//*   6   10:getstatic       #37  <Field abc f>
	//*   7   13:if_acmpeq       23
		{
			h = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #49  <Field abc h>
			return ((abc) (obj));
	//   11   21:aload_1         
	//   12   22:areturn         
		}
		obj = ((Object) (b));
	//   13   23:aload_0         
	//   14   24:getfield        #67  <Field ayu b>
	//   15   27:astore_1        
		if(obj == null || c >= e)
			break MISSING_BLOCK_LABEL_112;
	//   16   28:aload_1         
	//   17   29:ifnull          112
	//   18   32:aload_0         
	//   19   33:getfield        #51  <Field long c>
	//   20   36:aload_0         
	//   21   37:getfield        #55  <Field long e>
	//   22   40:lcmp            
	//   23   41:ifge            112
		obj;
	//   24   44:aload_1         
		JVM INSTR monitorenter ;
	//   25   45:monitorenter    
		abc abc1;
		b.a(c);
	//   26   46:aload_0         
	//   27   47:getfield        #67  <Field ayu b>
	//   28   50:aload_0         
	//   29   51:getfield        #51  <Field long c>
	//   30   54:invokeinterface #72  <Method void ayu.a(long)>
		abc1 = a.a(b, ((acd) (this)));
	//   31   59:aload_0         
	//   32   60:getfield        #74  <Field xz a>
	//   33   63:aload_0         
	//   34   64:getfield        #67  <Field ayu b>
	//   35   67:aload_0         
	//   36   68:invokeinterface #79  <Method abc xz.a(ayu, acd)>
	//   37   73:astore_2        
		c = b.b();
	//   38   74:aload_0         
	//   39   75:aload_0         
	//   40   76:getfield        #67  <Field ayu b>
	//   41   79:invokeinterface #82  <Method long ayu.b()>
	//   42   84:putfield        #51  <Field long c>
		obj;
	//   43   87:aload_1         
		JVM INSTR monitorexit ;
	//   44   88:monitorexit     
		return abc1;
	//   45   89:aload_2         
	//   46   90:areturn         
		Exception exception;
		exception;
	//   47   91:astore_2        
		obj;
	//   48   92:aload_1         
		JVM INSTR monitorexit ;
	//   49   93:monitorexit     
		try
		{
			throw exception;
	//   50   94:aload_2         
	//   51   95:athrow          
		}
	//*  52   96:new             #84  <Class NoSuchElementException>
	//*  53   99:dup             
	//*  54  100:invokespecial   #85  <Method void NoSuchElementException()>
	//*  55  103:athrow          
	//*  56  104:new             #84  <Class NoSuchElementException>
	//*  57  107:dup             
	//*  58  108:invokespecial   #85  <Method void NoSuchElementException()>
	//*  59  111:athrow          
	//*  60  112:aload_0         
	//*  61  113:getstatic       #37  <Field abc f>
	//*  62  116:putfield        #49  <Field abc h>
	//*  63  119:new             #84  <Class NoSuchElementException>
	//*  64  122:dup             
	//*  65  123:invokespecial   #85  <Method void NoSuchElementException()>
	//*  66  126:athrow          
		// Misplaced declaration of an exception variable
		catch(Object obj1)
		{
			throw new NoSuchElementException();
		}
	//*  67  127:astore_1        
	//*  68  128:goto            104
		// Misplaced declaration of an exception variable
		catch(Object obj1)
		{
			throw new NoSuchElementException();
		}
		Object obj1;
		h = f;
		throw new NoSuchElementException();
	//*  69  131:astore_1        
	//*  70  132:goto            96
	}

	public void a(ayu ayu1, long l, xz xz1)
	{
		b = ayu1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #67  <Field ayu b>
		long l1 = ayu1.b();
	//    3    5:aload_1         
	//    4    6:invokeinterface #82  <Method long ayu.b()>
	//    5   11:lstore          5
		d = l1;
	//    6   13:aload_0         
	//    7   14:lload           5
	//    8   16:putfield        #53  <Field long d>
		c = l1;
	//    9   19:aload_0         
	//   10   20:lload           5
	//   11   22:putfield        #51  <Field long c>
		ayu1.a(ayu1.b() + l);
	//   12   25:aload_1         
	//   13   26:aload_1         
	//   14   27:invokeinterface #82  <Method long ayu.b()>
	//   15   32:lload_2         
	//   16   33:ladd            
	//   17   34:invokeinterface #72  <Method void ayu.a(long)>
		e = ayu1.b();
	//   18   39:aload_0         
	//   19   40:aload_1         
	//   20   41:invokeinterface #82  <Method long ayu.b()>
	//   21   46:putfield        #55  <Field long e>
		a = xz1;
	//   22   49:aload_0         
	//   23   50:aload           4
	//   24   52:putfield        #74  <Field xz a>
	//   25   55:return          
	}

	public final List b()
	{
		if(b != null && h != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field ayu b>
	//*   2    4:ifnull          30
	//*   3    7:aload_0         
	//*   4    8:getfield        #49  <Field abc h>
	//*   5   11:getstatic       #37  <Field abc f>
	//*   6   14:if_acmpeq       30
			return ((List) (new ayy(i, ((Iterator) (this)))));
	//    7   17:new             #89  <Class ayy>
	//    8   20:dup             
	//    9   21:aload_0         
	//   10   22:getfield        #60  <Field List i>
	//   11   25:aload_0         
	//   12   26:invokespecial   #92  <Method void ayy(List, Iterator)>
	//   13   29:areturn         
		else
			return i;
	//   14   30:aload_0         
	//   15   31:getfield        #60  <Field List i>
	//   16   34:areturn         
	}

	public void close()
	{
		b.close();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field ayu b>
	//    2    4:invokeinterface #95  <Method void ayu.close()>
	//    3    9:return          
	}

	public boolean hasNext()
	{
		NoSuchElementException nosuchelementexception;
		abc abc1 = h;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field abc h>
	//    2    4:astore_1        
		if(abc1 == f)
	//*   3    5:aload_1         
	//*   4    6:getstatic       #37  <Field abc f>
	//*   5    9:if_acmpne       14
			return false;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		if(abc1 != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          20
			return true;
	//   10   18:iconst_1        
	//   11   19:ireturn         
		try
		{
			h = (abc)next();
	//   12   20:aload_0         
	//   13   21:aload_0         
	//   14   22:invokevirtual   #101 <Method Object next()>
	//   15   25:checkcast       #103 <Class abc>
	//   16   28:putfield        #49  <Field abc h>
		}
	//*  17   31:iconst_1        
	//*  18   32:ireturn         
	//*  19   33:aload_0         
	//*  20   34:getstatic       #37  <Field abc f>
	//*  21   37:putfield        #49  <Field abc h>
	//*  22   40:iconst_0        
	//*  23   41:ireturn         
		// Misplaced declaration of an exception variable
		catch(NoSuchElementException nosuchelementexception)
		{
			h = f;
			return false;
		}
		return true;
	//*  24   42:astore_1        
	//*  25   43:goto            33
	}

	public Object next()
	{
		return ((Object) (a()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #105 <Method abc a()>
	//    2    4:areturn         
	}

	public void remove()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #108 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #109 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #113 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #114 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append(((Object)this).getClass().getSimpleName());
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #118 <Method Class Object.getClass()>
	//    7   13:invokevirtual   #123 <Method String Class.getSimpleName()>
	//    8   16:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append("[");
	//   10   20:aload_2         
	//   11   21:ldc1            #129 <String "[">
	//   12   23:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		for(int j = 0; j < i.size(); j++)
	//*  14   27:iconst_0        
	//*  15   28:istore_1        
	//*  16   29:iload_1         
	//*  17   30:aload_0         
	//*  18   31:getfield        #60  <Field List i>
	//*  19   34:invokeinterface #135 <Method int List.size()>
	//*  20   39:icmpge          81
		{
			if(j > 0)
	//*  21   42:iload_1         
	//*  22   43:ifle            53
				stringbuilder.append(";");
	//   23   46:aload_2         
	//   24   47:ldc1            #137 <String ";">
	//   25   49:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
			stringbuilder.append(((Object) ((abc)i.get(j))).toString());
	//   27   53:aload_2         
	//   28   54:aload_0         
	//   29   55:getfield        #60  <Field List i>
	//   30   58:iload_1         
	//   31   59:invokeinterface #141 <Method Object List.get(int)>
	//   32   64:checkcast       #103 <Class abc>
	//   33   67:invokevirtual   #143 <Method String Object.toString()>
	//   34   70:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   35   73:pop             
		}

	//   36   74:iload_1         
	//   37   75:iconst_1        
	//   38   76:iadd            
	//   39   77:istore_1        
	//*  40   78:goto            29
		stringbuilder.append("]");
	//   41   81:aload_2         
	//   42   82:ldc1            #145 <String "]">
	//   43   84:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   44   87:pop             
		return stringbuilder.toString();
	//   45   88:aload_2         
	//   46   89:invokevirtual   #146 <Method String StringBuilder.toString()>
	//   47   92:areturn         
	}

	private static final abc f = new ays("eof ");
	private static aza g = aza.a(com/google/android/gms/internal/ads/ayr);
	protected xz a;
	protected ayu b;
	long c;
	long d;
	long e;
	private abc h;
	private List i;

	static 
	{
	//    0    0:new             #29  <Class ays>
	//    1    3:dup             
	//    2    4:ldc1            #31  <String "eof ">
	//    3    6:invokespecial   #35  <Method void ays(String)>
	//    4    9:putstatic       #37  <Field abc f>
	//    5   12:ldc1            #2   <Class ayr>
	//    6   14:invokestatic    #42  <Method aza aza.a(Class)>
	//    7   17:putstatic       #44  <Field aza g>
	//*   8   20:return          
	}
}
