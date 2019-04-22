// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;


// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			MethodInvoker

private static class MethodInvoker$FloatMethodInvoker extends MethodInvoker$TypedMethodInvoker
{

	Float convertArgument(String s)
	{
		return Float.valueOf(Float.parseFloat(s));
	//    0    0:aload_1         
	//    1    1:invokestatic    #26  <Method float Float.parseFloat(String)>
	//    2    4:invokestatic    #30  <Method Float Float.valueOf(float)>
	//    3    7:areturn         
	}

	volatile Object convertArgument(String s)
	{
		return ((Object) (convertArgument(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #33  <Method Float convertArgument(String)>
	//    3    5:areturn         
	}

	MethodInvoker$FloatMethodInvoker()
	{
		super(Float.TYPE);
	//    0    0:aload_0         
	//    1    1:getstatic       #16  <Field Class Float.TYPE>
	//    2    4:invokespecial   #19  <Method void MethodInvoker$TypedMethodInvoker(Class)>
	//    3    7:return          
	}
}
