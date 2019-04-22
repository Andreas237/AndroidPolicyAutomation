// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.*;

public class TokenBufferReadContext extends JsonStreamContext
{

	protected TokenBufferReadContext()
	{
		super(0, -1);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iconst_m1       
	//    3    3:invokespecial   #17  <Method void JsonStreamContext(int, int)>
		_parent = null;
	//    4    6:aload_0         
	//    5    7:aconst_null     
	//    6    8:putfield        #19  <Field JsonStreamContext _parent>
		_startLocation = JsonLocation.NA;
	//    7   11:aload_0         
	//    8   12:getstatic       #24  <Field JsonLocation JsonLocation.NA>
	//    9   15:putfield        #26  <Field JsonLocation _startLocation>
	//   10   18:return          
	}

	protected TokenBufferReadContext(JsonStreamContext jsonstreamcontext, JsonLocation jsonlocation)
	{
		super(jsonstreamcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #31  <Method void JsonStreamContext(JsonStreamContext)>
		_parent = jsonstreamcontext.getParent();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #35  <Method JsonStreamContext JsonStreamContext.getParent()>
	//    6   10:putfield        #19  <Field JsonStreamContext _parent>
		_currentName = jsonstreamcontext.getCurrentName();
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #39  <Method String JsonStreamContext.getCurrentName()>
	//   10   18:putfield        #41  <Field String _currentName>
		_currentValue = jsonstreamcontext.getCurrentValue();
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #45  <Method Object JsonStreamContext.getCurrentValue()>
	//   14   26:putfield        #47  <Field Object _currentValue>
		_startLocation = jsonlocation;
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:putfield        #26  <Field JsonLocation _startLocation>
	//   18   34:return          
	}

	protected TokenBufferReadContext(TokenBufferReadContext tokenbufferreadcontext, int i, int j)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:invokespecial   #17  <Method void JsonStreamContext(int, int)>
		_parent = ((JsonStreamContext) (tokenbufferreadcontext));
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #19  <Field JsonStreamContext _parent>
		_startLocation = tokenbufferreadcontext._startLocation;
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:getfield        #26  <Field JsonLocation _startLocation>
	//   10   16:putfield        #26  <Field JsonLocation _startLocation>
	//   11   19:return          
	}

	public static TokenBufferReadContext createRootContext(JsonStreamContext jsonstreamcontext)
	{
		if(jsonstreamcontext == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       12
			return new TokenBufferReadContext();
	//    2    4:new             #2   <Class TokenBufferReadContext>
	//    3    7:dup             
	//    4    8:invokespecial   #52  <Method void TokenBufferReadContext()>
	//    5   11:areturn         
		else
			return new TokenBufferReadContext(jsonstreamcontext, ((JsonLocation) (null)));
	//    6   12:new             #2   <Class TokenBufferReadContext>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:invokespecial   #54  <Method void TokenBufferReadContext(JsonStreamContext, JsonLocation)>
	//   11   21:areturn         
	}

	public TokenBufferReadContext createChildArrayContext()
	{
		return new TokenBufferReadContext(this, 1, -1);
	//    0    0:new             #2   <Class TokenBufferReadContext>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:iconst_m1       
	//    5    7:invokespecial   #58  <Method void TokenBufferReadContext(TokenBufferReadContext, int, int)>
	//    6   10:areturn         
	}

	public TokenBufferReadContext createChildObjectContext()
	{
		return new TokenBufferReadContext(this, 2, -1);
	//    0    0:new             #2   <Class TokenBufferReadContext>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:iconst_m1       
	//    5    7:invokespecial   #58  <Method void TokenBufferReadContext(TokenBufferReadContext, int, int)>
	//    6   10:areturn         
	}

	public String getCurrentName()
	{
		return _currentName;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field String _currentName>
	//    2    4:areturn         
	}

	public Object getCurrentValue()
	{
		return _currentValue;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Object _currentValue>
	//    2    4:areturn         
	}

	public JsonStreamContext getParent()
	{
		return _parent;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonStreamContext _parent>
	//    2    4:areturn         
	}

	public TokenBufferReadContext parentOrCopy()
	{
		JsonStreamContext jsonstreamcontext = _parent;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonStreamContext _parent>
	//    2    4:astore_1        
		if(jsonstreamcontext instanceof TokenBufferReadContext)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #2   <Class TokenBufferReadContext>
	//*   5    9:ifeq            17
			return (TokenBufferReadContext)jsonstreamcontext;
	//    6   12:aload_1         
	//    7   13:checkcast       #2   <Class TokenBufferReadContext>
	//    8   16:areturn         
		if(jsonstreamcontext == null)
	//*   9   17:aload_1         
	//*  10   18:ifnonnull       29
			return new TokenBufferReadContext();
	//   11   21:new             #2   <Class TokenBufferReadContext>
	//   12   24:dup             
	//   13   25:invokespecial   #52  <Method void TokenBufferReadContext()>
	//   14   28:areturn         
		else
			return new TokenBufferReadContext(jsonstreamcontext, _startLocation);
	//   15   29:new             #2   <Class TokenBufferReadContext>
	//   16   32:dup             
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #26  <Field JsonLocation _startLocation>
	//   20   38:invokespecial   #54  <Method void TokenBufferReadContext(JsonStreamContext, JsonLocation)>
	//   21   41:areturn         
	}

	public void setCurrentName(String s)
		throws JsonProcessingException
	{
		_currentName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #41  <Field String _currentName>
	//    3    5:return          
	}

	public void setCurrentValue(Object obj)
	{
		_currentValue = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #47  <Field Object _currentValue>
	//    3    5:return          
	}

	protected String _currentName;
	protected Object _currentValue;
	protected final JsonStreamContext _parent;
	protected final JsonLocation _startLocation;
}
