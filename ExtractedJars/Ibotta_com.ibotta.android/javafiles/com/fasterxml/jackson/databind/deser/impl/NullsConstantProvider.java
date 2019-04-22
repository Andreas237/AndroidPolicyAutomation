// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.Serializable;

public class NullsConstantProvider
	implements NullValueProvider, Serializable
{

	protected NullsConstantProvider(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		_nullValue = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #34  <Field Object _nullValue>
		if(_nullValue == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #34  <Field Object _nullValue>
	//*   7   13:ifnonnull       23
			obj = ((Object) (AccessPattern.ALWAYS_NULL));
	//    8   16:getstatic       #39  <Field AccessPattern AccessPattern.ALWAYS_NULL>
	//    9   19:astore_1        
		else
	//*  10   20:goto            27
			obj = ((Object) (AccessPattern.CONSTANT));
	//   11   23:getstatic       #42  <Field AccessPattern AccessPattern.CONSTANT>
	//   12   26:astore_1        
		_access = ((AccessPattern) (obj));
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:putfield        #44  <Field AccessPattern _access>
	//   16   32:return          
	}

	public static NullsConstantProvider forValue(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return NULLER;
	//    2    4:getstatic       #29  <Field NullsConstantProvider NULLER>
	//    3    7:areturn         
		else
			return new NullsConstantProvider(obj);
	//    4    8:new             #2   <Class NullsConstantProvider>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #25  <Method void NullsConstantProvider(Object)>
	//    8   16:areturn         
	}

	public static boolean isSkipper(NullValueProvider nullvalueprovider)
	{
		return nullvalueprovider == SKIPPER;
	//    0    0:aload_0         
	//    1    1:getstatic       #27  <Field NullsConstantProvider SKIPPER>
	//    2    4:if_acmpne       9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public static NullsConstantProvider nuller()
	{
		return NULLER;
	//    0    0:getstatic       #29  <Field NullsConstantProvider NULLER>
	//    1    3:areturn         
	}

	public static NullsConstantProvider skipper()
	{
		return SKIPPER;
	//    0    0:getstatic       #27  <Field NullsConstantProvider SKIPPER>
	//    1    3:areturn         
	}

	public AccessPattern getNullAccessPattern()
	{
		return _access;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field AccessPattern _access>
	//    2    4:areturn         
	}

	public Object getNullValue(DeserializationContext deserializationcontext)
	{
		return _nullValue;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Object _nullValue>
	//    2    4:areturn         
	}

	private static final NullsConstantProvider NULLER = new NullsConstantProvider(((Object) (null)));
	private static final NullsConstantProvider SKIPPER = new NullsConstantProvider(((Object) (null)));
	private static final long serialVersionUID = 1L;
	protected final AccessPattern _access;
	protected final Object _nullValue;

	static 
	{
	//    0    0:new             #2   <Class NullsConstantProvider>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #25  <Method void NullsConstantProvider(Object)>
	//    4    8:putstatic       #27  <Field NullsConstantProvider SKIPPER>
	//    5   11:new             #2   <Class NullsConstantProvider>
	//    6   14:dup             
	//    7   15:aconst_null     
	//    8   16:invokespecial   #25  <Method void NullsConstantProvider(Object)>
	//    9   19:putstatic       #29  <Field NullsConstantProvider NULLER>
	//*  10   22:return          
	}
}
