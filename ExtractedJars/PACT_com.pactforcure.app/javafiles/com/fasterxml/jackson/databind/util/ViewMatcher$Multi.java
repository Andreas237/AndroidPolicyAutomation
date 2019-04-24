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
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		for(int j = _views.length; i < j; i++)
	//*   2    2:aload_0         
	//*   3    3:getfield        #21  <Field Class[] _views>
	//*   4    6:arraylength     
	//*   5    7:istore_3        
	//*   6    8:iload_2         
	//*   7    9:iload_3         
	//*   8   10:icmpge          45
		{
			Class class2 = _views[i];
	//    9   13:aload_0         
	//   10   14:getfield        #21  <Field Class[] _views>
	//   11   17:iload_2         
	//   12   18:aaload          
	//   13   19:astore          4
			if(class1 == class2 || class2.isAssignableFrom(class1))
	//*  14   21:aload_1         
	//*  15   22:aload           4
	//*  16   24:if_acmpeq       36
	//*  17   27:aload           4
	//*  18   29:aload_1         
	//*  19   30:invokevirtual   #31  <Method boolean Class.isAssignableFrom(Class)>
	//*  20   33:ifeq            38
				return true;
	//   21   36:iconst_1        
	//   22   37:ireturn         
		}

	//   23   38:iload_2         
	//   24   39:iconst_1        
	//   25   40:iadd            
	//   26   41:istore_2        
	//*  27   42:goto            8
		return false;
	//   28   45:iconst_0        
	//   29   46:ireturn         
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
