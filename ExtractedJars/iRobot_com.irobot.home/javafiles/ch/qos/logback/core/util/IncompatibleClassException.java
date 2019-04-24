// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.util;


public class IncompatibleClassException extends Exception
{

	IncompatibleClassException(Class class1, Class class2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Exception()>
		requestedClass = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field Class requestedClass>
		obtainedClass = class2;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field Class obtainedClass>
	//    8   14:return          
	}

	private static final long serialVersionUID = 0xda752c83L;
	Class obtainedClass;
	Class requestedClass;
}
