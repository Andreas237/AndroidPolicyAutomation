// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//			ViewMatcher

private static final class ViewMatcher$Multi extends ViewMatcher
	implements Serializable
{

	public boolean isVisibleForView(Class class1)
	{
		int j = _views.length;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Class[] _views>
	//    2    4:arraylength     
	//    3    5:istore_3        
		for(int i = 0; i < j;)
	//*   4    6:iconst_0        
	//*   5    7:istore_2        
	//*   6    8:iload_2         
	//*   7    9:iload_3         
	//*   8   10:icmpge          48
		{
			Class class2 = _views[i];
	//    9   13:aload_0         
	//   10   14:getfield        #21  <Field Class[] _views>
	//   11   17:iload_2         
	//   12   18:aaload          
	//   13   19:astore          4
			if(class1 != class2 && !class2.isAssignableFrom(class1))
	//*  14   21:aload_1         
	//*  15   22:aload           4
	//*  16   24:if_acmpeq       46
	//*  17   27:aload           4
	//*  18   29:aload_1         
	//*  19   30:invokevirtual   #31  <Method boolean Class.isAssignableFrom(Class)>
	//*  20   33:ifeq            39
	//*  21   36:goto            46
				i++;
	//   22   39:iload_2         
	//   23   40:iconst_1        
	//   24   41:iadd            
	//   25   42:istore_2        
			else
	//*  26   43:goto            8
				return true;
	//   27   46:iconst_1        
	//   28   47:ireturn         
		}

		return false;
	//   29   48:iconst_0        
	//   30   49:ireturn         
	}

	private static final long serialVersionUID = 1L;
	private final Class _views[];

	public ViewMatcher$Multi(Class aclass[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void ViewMatcher()>
		_views = aclass;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field Class[] _views>
	//    5    9:return          
	}
}
