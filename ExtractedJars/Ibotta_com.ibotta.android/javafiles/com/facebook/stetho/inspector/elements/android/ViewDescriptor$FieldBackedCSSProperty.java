// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			ViewDescriptor

private final class ViewDescriptor$FieldBackedCSSProperty extends ViewDescriptor.ViewCSSProperty
{

	public Object getValue(View view)
		throws InvocationTargetException, IllegalAccessException
	{
		return mField.get(((Object) (view)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Field mField>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #39  <Method Object Field.get(Object)>
	//    4    8:areturn         
	}

	private final Field mField;
	final ViewDescriptor this$0;

	public ViewDescriptor$FieldBackedCSSProperty(Field field, String s, android.view.ViewDebug.ExportedProperty exportedproperty)
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
		mField = field;
	//    8   13:aload_0         
	//    9   14:aload_2         
	//   10   15:putfield        #21  <Field Field mField>
		mField.setAccessible(true);
	//   11   18:aload_0         
	//   12   19:getfield        #21  <Field Field mField>
	//   13   22:iconst_1        
	//   14   23:invokevirtual   #27  <Method void Field.setAccessible(boolean)>
	//   15   26:return          
	}
}
