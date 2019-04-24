// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//			SettableBeanProperty

public abstract class ValueInstantiator
{

	public ValueInstantiator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	protected Object _createFromStringFallbacks(DeserializationContext deserializationcontext, String s)
		throws IOException, JsonProcessingException
	{
		if(canCreateFromBoolean())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #19  <Method boolean canCreateFromBoolean()>
	//*   2    4:ifeq            44
		{
			String s1 = s.trim();
	//    3    7:aload_2         
	//    4    8:invokevirtual   #25  <Method String String.trim()>
	//    5   11:astore_3        
			if("true".equals(((Object) (s1))))
	//*   6   12:ldc1            #27  <String "true">
	//*   7   14:aload_3         
	//*   8   15:invokevirtual   #31  <Method boolean String.equals(Object)>
	//*   9   18:ifeq            28
				return createFromBoolean(deserializationcontext, true);
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:iconst_1        
	//   13   24:invokevirtual   #35  <Method Object createFromBoolean(DeserializationContext, boolean)>
	//   14   27:areturn         
			if("false".equals(((Object) (s1))))
	//*  15   28:ldc1            #37  <String "false">
	//*  16   30:aload_3         
	//*  17   31:invokevirtual   #31  <Method boolean String.equals(Object)>
	//*  18   34:ifeq            44
				return createFromBoolean(deserializationcontext, false);
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:iconst_0        
	//   22   40:invokevirtual   #35  <Method Object createFromBoolean(DeserializationContext, boolean)>
	//   23   43:areturn         
		}
		if(s.length() == 0 && deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT))
	//*  24   44:aload_2         
	//*  25   45:invokevirtual   #41  <Method int String.length()>
	//*  26   48:ifne            63
	//*  27   51:aload_1         
	//*  28   52:getstatic       #47  <Field DeserializationFeature DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT>
	//*  29   55:invokevirtual   #53  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  30   58:ifeq            63
			return ((Object) (null));
	//   31   61:aconst_null     
	//   32   62:areturn         
		else
			throw deserializationcontext.mappingException("Can not instantiate value of type %s from String value ('%s'); no single-String constructor/factory method", new Object[] {
				getValueTypeDesc(), s
			});
	//   33   63:aload_1         
	//   34   64:ldc1            #55  <String "Can not instantiate value of type %s from String value ('%s'); no single-String constructor/factory method">
	//   35   66:iconst_2        
	//   36   67:anewarray       Object[]
	//   37   70:dup             
	//   38   71:iconst_0        
	//   39   72:aload_0         
	//   40   73:invokevirtual   #58  <Method String getValueTypeDesc()>
	//   41   76:aastore         
	//   42   77:dup             
	//   43   78:iconst_1        
	//   44   79:aload_2         
	//   45   80:aastore         
	//   46   81:invokevirtual   #62  <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.mappingException(String, Object[])>
	//   47   84:athrow          
	}

	public boolean canCreateFromBoolean()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean canCreateFromDouble()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean canCreateFromInt()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean canCreateFromLong()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean canCreateFromObjectWith()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean canCreateFromString()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean canCreateUsingArrayDelegate()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean canCreateUsingDefault()
	{
		return getDefaultCreator() != null;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #74  <Method AnnotatedWithParams getDefaultCreator()>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean canCreateUsingDelegate()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean canInstantiate()
	{
		return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #78  <Method boolean canCreateUsingDefault()>
	//    2    4:ifne            56
	//    3    7:aload_0         
	//    4    8:invokevirtual   #80  <Method boolean canCreateUsingDelegate()>
	//    5   11:ifne            56
	//    6   14:aload_0         
	//    7   15:invokevirtual   #82  <Method boolean canCreateFromObjectWith()>
	//    8   18:ifne            56
	//    9   21:aload_0         
	//   10   22:invokevirtual   #84  <Method boolean canCreateFromString()>
	//   11   25:ifne            56
	//   12   28:aload_0         
	//   13   29:invokevirtual   #86  <Method boolean canCreateFromInt()>
	//   14   32:ifne            56
	//   15   35:aload_0         
	//   16   36:invokevirtual   #88  <Method boolean canCreateFromLong()>
	//   17   39:ifne            56
	//   18   42:aload_0         
	//   19   43:invokevirtual   #90  <Method boolean canCreateFromDouble()>
	//   20   46:ifne            56
	//   21   49:aload_0         
	//   22   50:invokevirtual   #19  <Method boolean canCreateFromBoolean()>
	//   23   53:ifeq            58
	//   24   56:iconst_1        
	//   25   57:ireturn         
	//   26   58:iconst_0        
	//   27   59:ireturn         
	}

	public Object createFromBoolean(DeserializationContext deserializationcontext, boolean flag)
		throws IOException
	{
		throw deserializationcontext.mappingException("Can not instantiate value of type %s from Boolean value (%s)", new Object[] {
			getValueTypeDesc(), Boolean.valueOf(flag)
		});
	//    0    0:aload_1         
	//    1    1:ldc1            #92  <String "Can not instantiate value of type %s from Boolean value (%s)">
	//    2    3:iconst_2        
	//    3    4:anewarray       Object[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:aload_0         
	//    7   10:invokevirtual   #58  <Method String getValueTypeDesc()>
	//    8   13:aastore         
	//    9   14:dup             
	//   10   15:iconst_1        
	//   11   16:iload_2         
	//   12   17:invokestatic    #98  <Method Boolean Boolean.valueOf(boolean)>
	//   13   20:aastore         
	//   14   21:invokevirtual   #62  <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.mappingException(String, Object[])>
	//   15   24:athrow          
	}

	public Object createFromDouble(DeserializationContext deserializationcontext, double d)
		throws IOException
	{
		throw deserializationcontext.mappingException("Can not instantiate value of type %s from Floating-point number (%s, double)", new Object[] {
			getValueTypeDesc(), Double.valueOf(d)
		});
	//    0    0:aload_1         
	//    1    1:ldc1            #102 <String "Can not instantiate value of type %s from Floating-point number (%s, double)">
	//    2    3:iconst_2        
	//    3    4:anewarray       Object[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:aload_0         
	//    7   10:invokevirtual   #58  <Method String getValueTypeDesc()>
	//    8   13:aastore         
	//    9   14:dup             
	//   10   15:iconst_1        
	//   11   16:dload_2         
	//   12   17:invokestatic    #107 <Method Double Double.valueOf(double)>
	//   13   20:aastore         
	//   14   21:invokevirtual   #62  <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.mappingException(String, Object[])>
	//   15   24:athrow          
	}

	public Object createFromInt(DeserializationContext deserializationcontext, int i)
		throws IOException
	{
		throw deserializationcontext.mappingException("Can not instantiate value of type %s from Integer number (%s, int)", new Object[] {
			getValueTypeDesc(), Integer.valueOf(i)
		});
	//    0    0:aload_1         
	//    1    1:ldc1            #111 <String "Can not instantiate value of type %s from Integer number (%s, int)">
	//    2    3:iconst_2        
	//    3    4:anewarray       Object[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:aload_0         
	//    7   10:invokevirtual   #58  <Method String getValueTypeDesc()>
	//    8   13:aastore         
	//    9   14:dup             
	//   10   15:iconst_1        
	//   11   16:iload_2         
	//   12   17:invokestatic    #116 <Method Integer Integer.valueOf(int)>
	//   13   20:aastore         
	//   14   21:invokevirtual   #62  <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.mappingException(String, Object[])>
	//   15   24:athrow          
	}

	public Object createFromLong(DeserializationContext deserializationcontext, long l)
		throws IOException
	{
		throw deserializationcontext.mappingException("Can not instantiate value of type %s from Integer number (%s, long)", new Object[] {
			getValueTypeDesc(), Long.valueOf(l)
		});
	//    0    0:aload_1         
	//    1    1:ldc1            #120 <String "Can not instantiate value of type %s from Integer number (%s, long)">
	//    2    3:iconst_2        
	//    3    4:anewarray       Object[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:aload_0         
	//    7   10:invokevirtual   #58  <Method String getValueTypeDesc()>
	//    8   13:aastore         
	//    9   14:dup             
	//   10   15:iconst_1        
	//   11   16:lload_2         
	//   12   17:invokestatic    #125 <Method Long Long.valueOf(long)>
	//   13   20:aastore         
	//   14   21:invokevirtual   #62  <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.mappingException(String, Object[])>
	//   15   24:athrow          
	}

	public Object createFromObjectWith(DeserializationContext deserializationcontext, Object aobj[])
		throws IOException
	{
		throw deserializationcontext.mappingException("Can not instantiate value of type %s with arguments", new Object[] {
			getValueTypeDesc()
		});
	//    0    0:aload_1         
	//    1    1:ldc1            #129 <String "Can not instantiate value of type %s with arguments">
	//    2    3:iconst_1        
	//    3    4:anewarray       Object[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:aload_0         
	//    7   10:invokevirtual   #58  <Method String getValueTypeDesc()>
	//    8   13:aastore         
	//    9   14:invokevirtual   #62  <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.mappingException(String, Object[])>
	//   10   17:athrow          
	}

	public Object createFromString(DeserializationContext deserializationcontext, String s)
		throws IOException
	{
		return _createFromStringFallbacks(deserializationcontext, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #132 <Method Object _createFromStringFallbacks(DeserializationContext, String)>
	//    4    6:areturn         
	}

	public Object createUsingArrayDelegate(DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		throw deserializationcontext.mappingException("Can not instantiate value of type %s using delegate", new Object[] {
			getValueTypeDesc()
		});
	//    0    0:aload_1         
	//    1    1:ldc1            #136 <String "Can not instantiate value of type %s using delegate">
	//    2    3:iconst_1        
	//    3    4:anewarray       Object[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:aload_0         
	//    7   10:invokevirtual   #58  <Method String getValueTypeDesc()>
	//    8   13:aastore         
	//    9   14:invokevirtual   #62  <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.mappingException(String, Object[])>
	//   10   17:athrow          
	}

	public Object createUsingDefault(DeserializationContext deserializationcontext)
		throws IOException
	{
		throw deserializationcontext.mappingException("Can not instantiate value of type %s; no default creator found", new Object[] {
			getValueTypeDesc()
		});
	//    0    0:aload_1         
	//    1    1:ldc1            #140 <String "Can not instantiate value of type %s; no default creator found">
	//    2    3:iconst_1        
	//    3    4:anewarray       Object[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:aload_0         
	//    7   10:invokevirtual   #58  <Method String getValueTypeDesc()>
	//    8   13:aastore         
	//    9   14:invokevirtual   #62  <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.mappingException(String, Object[])>
	//   10   17:athrow          
	}

	public Object createUsingDelegate(DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		throw deserializationcontext.mappingException("Can not instantiate value of type %s using delegate", new Object[] {
			getValueTypeDesc()
		});
	//    0    0:aload_1         
	//    1    1:ldc1            #136 <String "Can not instantiate value of type %s using delegate">
	//    2    3:iconst_1        
	//    3    4:anewarray       Object[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:aload_0         
	//    7   10:invokevirtual   #58  <Method String getValueTypeDesc()>
	//    8   13:aastore         
	//    9   14:invokevirtual   #62  <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.mappingException(String, Object[])>
	//   10   17:athrow          
	}

	public AnnotatedWithParams getArrayDelegateCreator()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public JavaType getArrayDelegateType(DeserializationConfig deserializationconfig)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public AnnotatedWithParams getDefaultCreator()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public AnnotatedWithParams getDelegateCreator()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public JavaType getDelegateType(DeserializationConfig deserializationconfig)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig deserializationconfig)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public AnnotatedParameter getIncompleteParameter()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public abstract String getValueTypeDesc();

	public AnnotatedWithParams getWithArgsCreator()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}
}
