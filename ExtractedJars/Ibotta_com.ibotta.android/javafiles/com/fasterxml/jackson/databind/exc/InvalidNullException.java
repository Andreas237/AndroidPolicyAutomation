// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.util.ClassUtil;

// Referenced classes of package com.fasterxml.jackson.databind.exc:
//			MismatchedInputException

public class InvalidNullException extends MismatchedInputException
{

	protected InvalidNullException(DeserializationContext deserializationcontext, String s, PropertyName propertyname)
	{
		super(deserializationcontext.getParser(), s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #18  <Method com.fasterxml.jackson.core.JsonParser DeserializationContext.getParser()>
	//    3    5:aload_2         
	//    4    6:invokespecial   #21  <Method void MismatchedInputException(com.fasterxml.jackson.core.JsonParser, String)>
		_propertyName = propertyname;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #23  <Field PropertyName _propertyName>
	//    8   14:return          
	}

	public static InvalidNullException from(DeserializationContext deserializationcontext, PropertyName propertyname, JavaType javatype)
	{
		deserializationcontext = ((DeserializationContext) (new InvalidNullException(deserializationcontext, String.format("Invalid `null` value encountered for property %s", new Object[] {
			ClassUtil.quotedOr(((Object) (propertyname)), "<UNKNOWN>")
		}), propertyname)));
	//    0    0:new             #2   <Class InvalidNullException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #28  <String "Invalid `null` value encountered for property %s">
	//    4    7:iconst_1        
	//    5    8:anewarray       Object[]
	//    6   11:dup             
	//    7   12:iconst_0        
	//    8   13:aload_1         
	//    9   14:ldc1            #32  <String "<UNKNOWN>">
	//   10   16:invokestatic    #38  <Method String ClassUtil.quotedOr(Object, String)>
	//   11   19:aastore         
	//   12   20:invokestatic    #44  <Method String String.format(String, Object[])>
	//   13   23:aload_1         
	//   14   24:invokespecial   #46  <Method void InvalidNullException(DeserializationContext, String, PropertyName)>
	//   15   27:astore_0        
		if(javatype != null)
	//*  16   28:aload_2         
	//*  17   29:ifnull          38
			((InvalidNullException) (deserializationcontext)).setTargetType(javatype);
	//   18   32:aload_0         
	//   19   33:aload_2         
	//   20   34:invokevirtual   #50  <Method MismatchedInputException setTargetType(JavaType)>
	//   21   37:pop             
		return ((InvalidNullException) (deserializationcontext));
	//   22   38:aload_0         
	//   23   39:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final PropertyName _propertyName;
}
