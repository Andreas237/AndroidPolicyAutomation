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
