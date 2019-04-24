// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;


// Referenced classes of package com.fasterxml.jackson.databind.util:
//			ViewMatcher

private static final class ViewMatcher$Single extends ViewMatcher
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

	public ViewMatcher$Single(Class class1)
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
