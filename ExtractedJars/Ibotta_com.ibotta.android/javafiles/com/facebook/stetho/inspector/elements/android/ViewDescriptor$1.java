// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import java.util.Comparator;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			ViewDescriptor

class ViewDescriptor$1
	implements Comparator
{

	public int compare(ewCSSProperty ewcssproperty, ewCSSProperty ewcssproperty1)
	{
		return ewcssproperty.getCSSName().compareTo(ewcssproperty1.getCSSName());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #30  <Method String ViewDescriptor$ViewCSSProperty.getCSSName()>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #30  <Method String ViewDescriptor$ViewCSSProperty.getCSSName()>
	//    4    8:invokevirtual   #36  <Method int String.compareTo(String)>
	//    5   11:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((ewCSSProperty)obj, (ewCSSProperty)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class ViewDescriptor$ViewCSSProperty>
	//    3    5:aload_2         
	//    4    6:checkcast       #26  <Class ViewDescriptor$ViewCSSProperty>
	//    5    9:invokevirtual   #39  <Method int compare(ViewDescriptor$ViewCSSProperty, ViewDescriptor$ViewCSSProperty)>
	//    6   12:ireturn         
	}

	final ViewDescriptor this$0;

	ViewDescriptor$1()
	{
		this$0 = ViewDescriptor.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field ViewDescriptor this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
