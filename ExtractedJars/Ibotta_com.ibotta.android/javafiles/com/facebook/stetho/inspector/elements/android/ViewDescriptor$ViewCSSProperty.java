// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			ViewDescriptor

private abstract class ViewDescriptor$ViewCSSProperty
{

	public final android.view.ViewDebug.ExportedProperty getAnnotation()
	{
		return mAnnotation;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field android.view.ViewDebug$ExportedProperty mAnnotation>
	//    2    4:areturn         
	}

	public final String getCSSName()
	{
		return mCSSName;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String mCSSName>
	//    2    4:areturn         
	}

	public abstract Object getValue(View view)
		throws InvocationTargetException, IllegalAccessException;

	private final android.view.ViewDebug.ExportedProperty mAnnotation;
	private final String mCSSName;
	final ViewDescriptor this$0;

	public ViewDescriptor$ViewCSSProperty(String s, android.view.ViewDebug.ExportedProperty exportedproperty)
	{
		this$0 = ViewDescriptor.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field ViewDescriptor this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
		mCSSName = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field String mCSSName>
		mAnnotation = exportedproperty;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #25  <Field android.view.ViewDebug$ExportedProperty mAnnotation>
	//   11   19:return          
	}
}
