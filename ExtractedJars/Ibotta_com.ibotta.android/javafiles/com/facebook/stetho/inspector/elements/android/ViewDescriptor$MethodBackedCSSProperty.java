// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			ViewDescriptor

private final class ViewDescriptor$MethodBackedCSSProperty extends ViewDescriptor.ViewCSSProperty
{

	public Object getValue(View view)
		throws InvocationTargetException, IllegalAccessException
	{
		return mMethod.invoke(((Object) (view)), new Object[0]);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Method mMethod>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:anewarray       Object[]
	//    5    9:invokevirtual   #41  <Method Object Method.invoke(Object, Object[])>
	//    6   12:areturn         
	}

	private final Method mMethod;
	final ViewDescriptor this$0;

	public ViewDescriptor$MethodBackedCSSProperty(Method method, String s, android.view.ViewDebug.ExportedProperty exportedproperty)
	{
		this$0 = ViewDescriptor.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field ViewDescriptor this$0>
		super(ViewDescriptor.this, s, exportedproperty);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:invokespecial   #19  <Method void ViewDescriptor$ViewCSSProperty(ViewDescriptor, String, android.view.ViewDebug$ExportedProperty)>
		mMethod = method;
	//    8   13:aload_0         
	//    9   14:aload_2         
	//   10   15:putfield        #21  <Field Method mMethod>
		mMethod.setAccessible(true);
	//   11   18:aload_0         
	//   12   19:getfield        #21  <Field Method mMethod>
	//   13   22:iconst_1        
	//   14   23:invokevirtual   #27  <Method void Method.setAccessible(boolean)>
	//   15   26:return          
	}
}
