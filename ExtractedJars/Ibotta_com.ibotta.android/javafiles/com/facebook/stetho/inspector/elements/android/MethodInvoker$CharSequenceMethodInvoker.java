// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;


// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			MethodInvoker

private static class MethodInvoker$CharSequenceMethodInvoker extends MethodInvoker.TypedMethodInvoker
{

	CharSequence convertArgument(String s)
	{
		return ((CharSequence) (s));
	//    0    0:aload_1         
	//    1    1:areturn         
	}

	volatile Object convertArgument(String s)
	{
		return ((Object) (convertArgument(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #21  <Method CharSequence convertArgument(String)>
	//    3    5:areturn         
	}

	MethodInvoker$CharSequenceMethodInvoker()
	{
		super(java/lang/CharSequence);
	//    0    0:aload_0         
	//    1    1:ldc1            #12  <Class CharSequence>
	//    2    3:invokespecial   #15  <Method void MethodInvoker$TypedMethodInvoker(Class)>
	//    3    6:return          
	}
}
