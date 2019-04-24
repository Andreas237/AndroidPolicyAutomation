// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

public class ViewMatcher
	implements Serializable
{
	private static final class Multi extends ViewMatcher
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

		public Multi(Class aclass[])
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

	private static final class Single extends ViewMatcher
	{

		public boolean isVisibleForView(Class class1)
		{
			return class1 == _view || _view.isAssignableFrom(class1);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #19  <Field Class _view>
		//    3    5:if_acmpeq       19
		//    4    8:aload_0         
		//    5    9:getfield        #19  <Field Class _view>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #29  <Method boolean Class.isAssignableFrom(Class)>
		//    8   16:ifeq            21
		//    9   19:iconst_1        
		//   10   20:ireturn         
		//   11   21:iconst_0        
		//   12   22:ireturn         
		}

		private static final long serialVersionUID = 1L;
		private final Class _view;

		public Single(Class class1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void ViewMatcher()>
			_view = class1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field Class _view>
		//    5    9:return          
		}
	}


	public ViewMatcher()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:return          
	}

	public static ViewMatcher construct(Class aclass[])
	{
		if(aclass == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return EMPTY;
	//    2    4:getstatic       #25  <Field ViewMatcher EMPTY>
	//    3    7:areturn         
		switch(aclass.length)
	//*   4    8:aload_0         
	//*   5    9:arraylength     
		{
	//*   6   10:tableswitch     0 1: default 32
	//	               0 41
	//	               1 45
		default:
			return ((ViewMatcher) (new Multi(aclass)));
	//    7   32:new             #8   <Class ViewMatcher$Multi>
	//    8   35:dup             
	//    9   36:aload_0         
	//   10   37:invokespecial   #32  <Method void ViewMatcher$Multi(Class[])>
	//   11   40:areturn         

		case 0: // '\0'
			return EMPTY;
	//   12   41:getstatic       #25  <Field ViewMatcher EMPTY>
	//   13   44:areturn         

		case 1: // '\001'
			return ((ViewMatcher) (new Single(aclass[0])));
	//   14   45:new             #11  <Class ViewMatcher$Single>
	//   15   48:dup             
	//   16   49:aload_0         
	//   17   50:iconst_0        
	//   18   51:aaload          
	//   19   52:invokespecial   #35  <Method void ViewMatcher$Single(Class)>
	//   20   55:areturn         
		}
	}

	public boolean isVisibleForView(Class class1)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected static final ViewMatcher EMPTY = new ViewMatcher();
	private static final long serialVersionUID = 1L;

	static 
	{
	//    0    0:new             #2   <Class ViewMatcher>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void ViewMatcher()>
	//    3    7:putstatic       #25  <Field ViewMatcher EMPTY>
	//*   4   10:return          
	}
}
