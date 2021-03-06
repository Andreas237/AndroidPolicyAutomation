// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class TokenFilter
{

	protected TokenFilter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	protected boolean _includeScalar()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void filterFinishArray()
	{
	//    0    0:return          
	}

	public void filterFinishObject()
	{
	//    0    0:return          
	}

	public TokenFilter filterStartArray()
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public TokenFilter filterStartObject()
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public boolean includeBinary()
	{
		return _includeScalar();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #25  <Method boolean _includeScalar()>
	//    2    4:ireturn         
	}

	public boolean includeBoolean(boolean flag)
	{
		return _includeScalar();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #25  <Method boolean _includeScalar()>
	//    2    4:ireturn         
	}

	public TokenFilter includeElement(int i)
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public boolean includeEmbeddedValue(Object obj)
	{
		return _includeScalar();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #25  <Method boolean _includeScalar()>
	//    2    4:ireturn         
	}

	public boolean includeNull()
	{
		return _includeScalar();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #25  <Method boolean _includeScalar()>
	//    2    4:ireturn         
	}

	public boolean includeNumber(double d)
	{
		return _includeScalar();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #25  <Method boolean _includeScalar()>
	//    2    4:ireturn         
	}

	public boolean includeNumber(float f)
	{
		return _includeScalar();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #25  <Method boolean _includeScalar()>
	//    2    4:ireturn         
	}

	public boolean includeNumber(int i)
	{
		return _includeScalar();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #25  <Method boolean _includeScalar()>
	//    2    4:ireturn         
	}

	public boolean includeNumber(long l)
	{
		return _includeScalar();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #25  <Method boolean _includeScalar()>
	//    2    4:ireturn         
	}

	public boolean includeNumber(BigDecimal bigdecimal)
	{
		return _includeScalar();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #25  <Method boolean _includeScalar()>
	//    2    4:ireturn         
	}

	public boolean includeNumber(BigInteger biginteger)
	{
		return _includeScalar();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #25  <Method boolean _includeScalar()>
	//    2    4:ireturn         
	}

	public TokenFilter includeProperty(String s)
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public boolean includeRawValue()
	{
		return _includeScalar();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #25  <Method boolean _includeScalar()>
	//    2    4:ireturn         
	}

	public TokenFilter includeRootValue(int i)
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public boolean includeString(String s)
	{
		return _includeScalar();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #25  <Method boolean _includeScalar()>
	//    2    4:ireturn         
	}

	public boolean includeValue(JsonParser jsonparser)
		throws IOException
	{
		return _includeScalar();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #25  <Method boolean _includeScalar()>
	//    2    4:ireturn         
	}

	public String toString()
	{
		if(this == INCLUDE_ALL)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #13  <Field TokenFilter INCLUDE_ALL>
	//*   2    4:if_acmpne       10
			return "TokenFilter.INCLUDE_ALL";
	//    3    7:ldc1            #54  <String "TokenFilter.INCLUDE_ALL">
	//    4    9:areturn         
		else
			return super.toString();
	//    5   10:aload_0         
	//    6   11:invokespecial   #56  <Method String Object.toString()>
	//    7   14:areturn         
	}

	public static final TokenFilter INCLUDE_ALL = new TokenFilter();

	static 
	{
	//    0    0:new             #2   <Class TokenFilter>
	//    1    3:dup             
	//    2    4:invokespecial   #11  <Method void TokenFilter()>
	//    3    7:putstatic       #13  <Field TokenFilter INCLUDE_ALL>
	//*   4   10:return          
	}
}
