// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;


// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			MethodInvoker

private static class MethodInvoker$IntegerMethodInvoker extends MethodInvoker.TypedMethodInvoker
{

	Integer convertArgument(String s)
	{
		return Integer.valueOf(Integer.parseInt(s));
	//    0    0:aload_1         
	//    1    1:invokestatic    #26  <Method int Integer.parseInt(String)>
	//    2    4:invokestatic    #30  <Method Integer Integer.valueOf(int)>
	//    3    7:areturn         
	}

	volatile Object convertArgument(String s)
	{
		return ((Object) (convertArgument(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #33  <Method Integer convertArgument(String)>
	//    3    5:areturn         
	}

	MethodInvoker$IntegerMethodInvoker()
	{
		super(Integer.TYPE);
	//    0    0:aload_0         
	//    1    1:getstatic       #16  <Field Class Integer.TYPE>
	//    2    4:invokespecial   #19  <Method void MethodInvoker$TypedMethodInvoker(Class)>
	//    3    7:return          
	}
}
