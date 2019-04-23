// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			auq, aur

final class aus
	implements Iterator
{

	private aus(auq auq1)
	{
		c = auq1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field auq c>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
		a = auq.b(c).size();
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #16  <Field auq c>
	//    8   14:invokestatic    #24  <Method List auq.b(auq)>
	//    9   17:invokeinterface #30  <Method int List.size()>
	//   10   22:putfield        #32  <Field int a>
	//   11   25:return          
	}

	aus(auq auq1, aur aur)
	{
		this(auq1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #36  <Method void aus(auq)>
	//    3    5:return          
	}

	private final Iterator a()
	{
		if(b == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field Iterator b>
	//*   2    4:ifnonnull       28
			b = auq.d(c).entrySet().iterator();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #16  <Field auq c>
	//    6   12:invokestatic    #43  <Method Map auq.d(auq)>
	//    7   15:invokeinterface #49  <Method Set Map.entrySet()>
	//    8   20:invokeinterface #54  <Method Iterator Set.iterator()>
	//    9   25:putfield        #39  <Field Iterator b>
		return b;
	//   10   28:aload_0         
	//   11   29:getfield        #39  <Field Iterator b>
	//   12   32:areturn         
	}

	public final boolean hasNext()
	{
		int i = a;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int a>
	//    2    4:istore_1        
		return i > 0 && i <= auq.b(c).size() || a().hasNext();
	//    3    5:iload_1         
	//    4    6:ifle            25
	//    5    9:iload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #16  <Field auq c>
	//    8   14:invokestatic    #24  <Method List auq.b(auq)>
	//    9   17:invokeinterface #30  <Method int List.size()>
	//   10   22:icmple          37
	//   11   25:aload_0         
	//   12   26:invokespecial   #58  <Method Iterator a()>
	//   13   29:invokeinterface #60  <Method boolean Iterator.hasNext()>
	//   14   34:ifeq            39
	//   15   37:iconst_1        
	//   16   38:ireturn         
	//   17   39:iconst_0        
	//   18   40:ireturn         
	}

	public final Object next()
	{
		if(a().hasNext())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #58  <Method Iterator a()>
	//*   2    4:invokeinterface #60  <Method boolean Iterator.hasNext()>
	//*   3    9:ifeq            25
		{
			return ((Object) ((java.util.Map.Entry)a().next()));
	//    4   12:aload_0         
	//    5   13:invokespecial   #58  <Method Iterator a()>
	//    6   16:invokeinterface #64  <Method Object Iterator.next()>
	//    7   21:checkcast       #66  <Class java.util.Map$Entry>
	//    8   24:areturn         
		} else
		{
			List list = auq.b(c);
	//    9   25:aload_0         
	//   10   26:getfield        #16  <Field auq c>
	//   11   29:invokestatic    #24  <Method List auq.b(auq)>
	//   12   32:astore_2        
			int i = a - 1;
	//   13   33:aload_0         
	//   14   34:getfield        #32  <Field int a>
	//   15   37:iconst_1        
	//   16   38:isub            
	//   17   39:istore_1        
			a = i;
	//   18   40:aload_0         
	//   19   41:iload_1         
	//   20   42:putfield        #32  <Field int a>
			return ((Object) ((java.util.Map.Entry)list.get(i)));
	//   21   45:aload_2         
	//   22   46:iload_1         
	//   23   47:invokeinterface #70  <Method Object List.get(int)>
	//   24   52:checkcast       #66  <Class java.util.Map$Entry>
	//   25   55:areturn         
		}
	}

	public final void remove()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #73  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #74  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	private int a;
	private Iterator b;
	private final auq c;
}
