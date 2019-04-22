// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.logging.Logger;

public abstract class Java7Support
{

	public Java7Support()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
	//    2    4:return          
	}

	public static Java7Support instance()
	{
		return IMPL;
	//    0    0:getstatic       #42  <Field Java7Support IMPL>
	//    1    3:areturn         
	}

	public abstract PropertyName findConstructorName(AnnotatedParameter annotatedparameter);

	public abstract Boolean findTransient(Annotated annotated);

	public abstract JsonDeserializer getDeserializerForJavaNioFilePath(Class class1);

	public abstract JsonSerializer getSerializerForJavaNioFilePath(Class class1);

	public abstract Boolean hasCreatorAnnotation(Annotated annotated);

	private static final Java7Support IMPL;

	static 
	{
		Throwable throwable;
		Java7Support java7support;
		try
		{
			java7support = (Java7Support)ClassUtil.createInstance(Class.forName("com.fasterxml.jackson.databind.ext.Java7SupportImpl"), false);
	//    0    0:ldc1            #12  <String "com.fasterxml.jackson.databind.ext.Java7SupportImpl">
	//    1    2:invokestatic    #18  <Method Class Class.forName(String)>
	//    2    5:iconst_0        
	//    3    6:invokestatic    #24  <Method Object ClassUtil.createInstance(Class, boolean)>
	//    4    9:checkcast       #2   <Class Java7Support>
	//    5   12:astore_0        
		}
	//*   6   13:goto            31
	//*   7   16:ldc1            #2   <Class Java7Support>
	//*   8   18:invokevirtual   #28  <Method String Class.getName()>
	//*   9   21:invokestatic    #34  <Method Logger Logger.getLogger(String)>
	//*  10   24:ldc1            #36  <String "Unable to load JDK7 types (annotations, java.nio.file.Path): no Java7 support added">
	//*  11   26:invokevirtual   #40  <Method void Logger.warning(String)>
	//*  12   29:aconst_null     
	//*  13   30:astore_0        
	//*  14   31:aload_0         
	//*  15   32:putstatic       #42  <Field Java7Support IMPL>
	//*  16   35:return          
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
		{
			Logger.getLogger(((Class) (com/fasterxml/jackson/databind/ext/Java7Support)).getName()).warning("Unable to load JDK7 types (annotations, java.nio.file.Path): no Java7 support added");
			java7support = null;
		}
		IMPL = java7support;
	//*  17   36:astore_0        
	//*  18   37:goto            16
	}
}
