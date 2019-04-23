// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			auq, aur

final class auy
	implements Iterator
{

	private auy(auq auq1)
	{
		d = auq1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field auq d>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
		a = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #23  <Field int a>
	//    8   14:return          
	}

	auy(auq auq1, aur aur)
	{
		this(auq1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method void auy(auq)>
	//    3    5:return          
	}

	private final Iterator a()
	{
		if(c == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field Iterator c>
	//*   2    4:ifnonnull       28
			c = auq.c(d).entrySet().iterator();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #18  <Field auq d>
	//    6   12:invokestatic    #35  <Method Map auq.c(auq)>
	//    7   15:invokeinterface #41  <Method Set Map.entrySet()>
	//    8   20:invokeinterface #46  <Method Iterator Set.iterator()>
	//    9   25:putfield        #30  <Field Iterator c>
		return c;
	//   10   28:aload_0         
	//   11   29:getfield        #30  <Field Iterator c>
	//   12   32:areturn         
	}

	public final boolean hasNext()
	{
		if(a + 1 >= auq.b(d).size())
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field int a>
	//*   2    4:iconst_1        
	//*   3    5:iadd            
	//*   4    6:aload_0         
	//*   5    7:getfield        #18  <Field auq d>
	//*   6   10:invokestatic    #51  <Method List auq.b(auq)>
	//*   7   13:invokeinterface #57  <Method int List.size()>
	//*   8   18:icmplt          52
			return !auq.c(d).isEmpty() && a().hasNext();
	//    9   21:aload_0         
	//   10   22:getfield        #18  <Field auq d>
	//   11   25:invokestatic    #35  <Method Map auq.c(auq)>
	//   12   28:invokeinterface #60  <Method boolean Map.isEmpty()>
	//   13   33:ifne            50
	//   14   36:aload_0         
	//   15   37:invokespecial   #62  <Method Iterator a()>
	//   16   40:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//   17   45:ifeq            50
	//   18   48:iconst_1        
	//   19   49:ireturn         
	//   20   50:iconst_0        
	//   21   51:ireturn         
		else
			return true;
	//   22   52:iconst_1        
	//   23   53:ireturn         
	}

	public final Object next()
	{
		b = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #68  <Field boolean b>
		int i = a + 1;
	//    3    5:aload_0         
	//    4    6:getfield        #23  <Field int a>
	//    5    9:iconst_1        
	//    6   10:iadd            
	//    7   11:istore_1        
		a = i;
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:putfield        #23  <Field int a>
		if(i < auq.b(d).size())
	//*  11   17:iload_1         
	//*  12   18:aload_0         
	//*  13   19:getfield        #18  <Field auq d>
	//*  14   22:invokestatic    #51  <Method List auq.b(auq)>
	//*  15   25:invokeinterface #57  <Method int List.size()>
	//*  16   30:icmpge          53
			return ((Object) ((java.util.Map.Entry)auq.b(d).get(a)));
	//   17   33:aload_0         
	//   18   34:getfield        #18  <Field auq d>
	//   19   37:invokestatic    #51  <Method List auq.b(auq)>
	//   20   40:aload_0         
	//   21   41:getfield        #23  <Field int a>
	//   22   44:invokeinterface #72  <Method Object List.get(int)>
	//   23   49:checkcast       #74  <Class java.util.Map$Entry>
	//   24   52:areturn         
		else
			return ((Object) ((java.util.Map.Entry)a().next()));
	//   25   53:aload_0         
	//   26   54:invokespecial   #62  <Method Iterator a()>
	//   27   57:invokeinterface #76  <Method Object Iterator.next()>
	//   28   62:checkcast       #74  <Class java.util.Map$Entry>
	//   29   65:areturn         
	}

	public final void remove()
	{
		if(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field boolean b>
	//*   2    4:ifeq            72
		{
			b = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #68  <Field boolean b>
			auq.a(d);
	//    6   12:aload_0         
	//    7   13:getfield        #18  <Field auq d>
	//    8   16:invokestatic    #79  <Method void auq.a(auq)>
			if(a < auq.b(d).size())
	//*   9   19:aload_0         
	//*  10   20:getfield        #23  <Field int a>
	//*  11   23:aload_0         
	//*  12   24:getfield        #18  <Field auq d>
	//*  13   27:invokestatic    #51  <Method List auq.b(auq)>
	//*  14   30:invokeinterface #57  <Method int List.size()>
	//*  15   35:icmpge          62
			{
				auq auq1 = d;
	//   16   38:aload_0         
	//   17   39:getfield        #18  <Field auq d>
	//   18   42:astore_2        
				int i = a;
	//   19   43:aload_0         
	//   20   44:getfield        #23  <Field int a>
	//   21   47:istore_1        
				a = i - 1;
	//   22   48:aload_0         
	//   23   49:iload_1         
	//   24   50:iconst_1        
	//   25   51:isub            
	//   26   52:putfield        #23  <Field int a>
				auq.a(auq1, i);
	//   27   55:aload_2         
	//   28   56:iload_1         
	//   29   57:invokestatic    #82  <Method Object auq.a(auq, int)>
	//   30   60:pop             
				return;
	//   31   61:return          
			} else
			{
				a().remove();
	//   32   62:aload_0         
	//   33   63:invokespecial   #62  <Method Iterator a()>
	//   34   66:invokeinterface #84  <Method void Iterator.remove()>
				return;
	//   35   71:return          
			}
		} else
		{
			throw new IllegalStateException("remove() was called before next()");
	//   36   72:new             #86  <Class IllegalStateException>
	//   37   75:dup             
	//   38   76:ldc1            #88  <String "remove() was called before next()">
	//   39   78:invokespecial   #91  <Method void IllegalStateException(String)>
	//   40   81:athrow          
		}
	}

	private int a;
	private boolean b;
	private Iterator c;
	private final auq d;
}
