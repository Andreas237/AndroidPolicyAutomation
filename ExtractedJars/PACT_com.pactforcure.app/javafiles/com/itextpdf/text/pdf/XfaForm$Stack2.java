// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.util.ArrayList;
import java.util.EmptyStackException;

// Referenced classes of package com.itextpdf.text.pdf:
//			XfaForm

public static class XfaForm$Stack2 extends ArrayList
{

	public boolean empty()
	{
		return size() == 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #23  <Method int size()>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public Object peek()
	{
		if(size() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #23  <Method int size()>
	//*   2    4:ifne            15
			throw new EmptyStackException();
	//    3    7:new             #27  <Class EmptyStackException>
	//    4   10:dup             
	//    5   11:invokespecial   #28  <Method void EmptyStackException()>
	//    6   14:athrow          
		else
			return get(size() - 1);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:invokevirtual   #23  <Method int size()>
	//   10   20:iconst_1        
	//   11   21:isub            
	//   12   22:invokevirtual   #32  <Method Object get(int)>
	//   13   25:areturn         
	}

	public Object pop()
	{
		if(size() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #23  <Method int size()>
	//*   2    4:ifne            15
		{
			throw new EmptyStackException();
	//    3    7:new             #27  <Class EmptyStackException>
	//    4   10:dup             
	//    5   11:invokespecial   #28  <Method void EmptyStackException()>
	//    6   14:athrow          
		} else
		{
			Object obj = get(size() - 1);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:invokevirtual   #23  <Method int size()>
	//   10   20:iconst_1        
	//   11   21:isub            
	//   12   22:invokevirtual   #32  <Method Object get(int)>
	//   13   25:astore_1        
			remove(size() - 1);
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:invokevirtual   #23  <Method int size()>
	//   17   31:iconst_1        
	//   18   32:isub            
	//   19   33:invokevirtual   #38  <Method Object remove(int)>
	//   20   36:pop             
			return obj;
	//   21   37:aload_1         
	//   22   38:areturn         
		}
	}

	public Object push(Object obj)
	{
		add(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #44  <Method boolean add(Object)>
	//    3    5:pop             
		return obj;
	//    4    6:aload_1         
	//    5    7:areturn         
	}

	private static final long serialVersionUID = 0x98ffc494L;

	public XfaForm$Stack2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void ArrayList()>
	//    2    4:return          
	}
}
