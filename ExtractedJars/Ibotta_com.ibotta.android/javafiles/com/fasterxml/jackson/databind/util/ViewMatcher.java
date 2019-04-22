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
			Class class2 = _view;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Class _view>
		//    2    4:astore_2        
			return class1 == class2 || class2.isAssignableFrom(class1);
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:if_acmpeq       23
		//    6   10:aload_2         
		//    7   11:aload_1         
		//    8   12:invokevirtual   #29  <Method boolean Class.isAssignableFrom(Class)>
		//    9   15:ifeq            21
		//   10   18:goto            23
		//   11   21:iconst_0        
		//   12   22:ireturn         
		//   13   23:iconst_1        
		//   14   24:ireturn         
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
	//	               0 52
	//	               1 41
		default:
			return ((ViewMatcher) (new Multi(aclass)));
	//    7   32:new             #8   <Class ViewMatcher$Multi>
	//    8   35:dup             
	//    9   36:aload_0         
	//   10   37:invokespecial   #32  <Method void ViewMatcher$Multi(Class[])>
	//   11   40:areturn         

		case 1: // '\001'
			return ((ViewMatcher) (new Single(aclass[0])));
	//   12   41:new             #11  <Class ViewMatcher$Single>
	//   13   44:dup             
	//   14   45:aload_0         
	//   15   46:iconst_0        
	//   16   47:aaload          
	//   17   48:invokespecial   #35  <Method void ViewMatcher$Single(Class)>
	//   18   51:areturn         

		case 0: // '\0'
			return EMPTY;
	//   19   52:getstatic       #25  <Field ViewMatcher EMPTY>
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
