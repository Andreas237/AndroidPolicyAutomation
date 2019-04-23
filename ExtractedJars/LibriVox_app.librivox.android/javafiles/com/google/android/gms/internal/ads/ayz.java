// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ayy

final class ayz
	implements Iterator
{

	ayz(ayy ayy1)
	{
		b = ayy1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ayy b>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
		a = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #19  <Field int a>
	//    8   14:return          
	}

	public final boolean hasNext()
	{
		return a < b.a.size() || b.b.hasNext();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int a>
	//    2    4:aload_0         
	//    3    5:getfield        #14  <Field ayy b>
	//    4    8:getfield        #27  <Field List ayy.a>
	//    5   11:invokeinterface #33  <Method int List.size()>
	//    6   16:icmplt          39
	//    7   19:aload_0         
	//    8   20:getfield        #14  <Field ayy b>
	//    9   23:getfield        #36  <Field Iterator ayy.b>
	//   10   26:invokeinterface #38  <Method boolean Iterator.hasNext()>
	//   11   31:ifeq            37
	//   12   34:goto            39
	//   13   37:iconst_0        
	//   14   38:ireturn         
	//   15   39:iconst_1        
	//   16   40:ireturn         
	}

	public final Object next()
	{
		do
		{
			if(a < b.a.size())
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field int a>
	//*   2    4:aload_0         
	//*   3    5:getfield        #14  <Field ayy b>
	//*   4    8:getfield        #27  <Field List ayy.a>
	//*   5   11:invokeinterface #33  <Method int List.size()>
	//*   6   16:icmpge          47
			{
				List list = b.a;
	//    7   19:aload_0         
	//    8   20:getfield        #14  <Field ayy b>
	//    9   23:getfield        #27  <Field List ayy.a>
	//   10   26:astore_2        
				int i = a;
	//   11   27:aload_0         
	//   12   28:getfield        #19  <Field int a>
	//   13   31:istore_1        
				a = i + 1;
	//   14   32:aload_0         
	//   15   33:iload_1         
	//   16   34:iconst_1        
	//   17   35:iadd            
	//   18   36:putfield        #19  <Field int a>
				return list.get(i);
	//   19   39:aload_2         
	//   20   40:iload_1         
	//   21   41:invokeinterface #44  <Method Object List.get(int)>
	//   22   46:areturn         
			}
			b.a.add(b.b.next());
	//   23   47:aload_0         
	//   24   48:getfield        #14  <Field ayy b>
	//   25   51:getfield        #27  <Field List ayy.a>
	//   26   54:aload_0         
	//   27   55:getfield        #14  <Field ayy b>
	//   28   58:getfield        #36  <Field Iterator ayy.b>
	//   29   61:invokeinterface #46  <Method Object Iterator.next()>
	//   30   66:invokeinterface #50  <Method boolean List.add(Object)>
	//   31   71:pop             
		} while(true);
	//   32   72:goto            0
	}

	public final void remove()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #53  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #54  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	private int a;
	private final ayy b;
}
