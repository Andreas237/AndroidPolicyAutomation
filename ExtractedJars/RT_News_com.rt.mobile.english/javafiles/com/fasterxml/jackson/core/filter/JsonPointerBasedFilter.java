// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.JsonPointer;

// Referenced classes of package com.fasterxml.jackson.core.filter:
//			TokenFilter

public class JsonPointerBasedFilter extends TokenFilter
{

	public JsonPointerBasedFilter(JsonPointer jsonpointer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TokenFilter()>
		_pathToMatch = jsonpointer;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field JsonPointer _pathToMatch>
	//    5    9:return          
	}

	public JsonPointerBasedFilter(String s)
	{
		this(JsonPointer.compile(s));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #21  <Method JsonPointer JsonPointer.compile(String)>
	//    3    5:invokespecial   #23  <Method void JsonPointerBasedFilter(JsonPointer)>
	//    4    8:return          
	}

	protected boolean _includeScalar()
	{
		return _pathToMatch.matches();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonPointer _pathToMatch>
	//    2    4:invokevirtual   #28  <Method boolean JsonPointer.matches()>
	//    3    7:ireturn         
	}

	public TokenFilter filterStartArray()
	{
		return ((TokenFilter) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public TokenFilter filterStartObject()
	{
		return ((TokenFilter) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public TokenFilter includeElement(int i)
	{
		JsonPointer jsonpointer = _pathToMatch.matchElement(i);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonPointer _pathToMatch>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #37  <Method JsonPointer JsonPointer.matchElement(int)>
	//    4    8:astore_2        
		if(jsonpointer == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       15
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
		if(jsonpointer.matches())
	//*   9   15:aload_2         
	//*  10   16:invokevirtual   #28  <Method boolean JsonPointer.matches()>
	//*  11   19:ifeq            26
			return TokenFilter.INCLUDE_ALL;
	//   12   22:getstatic       #41  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//   13   25:areturn         
		else
			return ((TokenFilter) (new JsonPointerBasedFilter(jsonpointer)));
	//   14   26:new             #2   <Class JsonPointerBasedFilter>
	//   15   29:dup             
	//   16   30:aload_2         
	//   17   31:invokespecial   #23  <Method void JsonPointerBasedFilter(JsonPointer)>
	//   18   34:areturn         
	}

	public TokenFilter includeProperty(String s)
	{
		s = ((String) (_pathToMatch.matchProperty(s)));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonPointer _pathToMatch>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #46  <Method JsonPointer JsonPointer.matchProperty(String)>
	//    4    8:astore_1        
		if(s == null)
	//*   5    9:aload_1         
	//*   6   10:ifnonnull       15
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
		if(((JsonPointer) (s)).matches())
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #28  <Method boolean JsonPointer.matches()>
	//*  11   19:ifeq            26
			return TokenFilter.INCLUDE_ALL;
	//   12   22:getstatic       #41  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//   13   25:areturn         
		else
			return ((TokenFilter) (new JsonPointerBasedFilter(((JsonPointer) (s)))));
	//   14   26:new             #2   <Class JsonPointerBasedFilter>
	//   15   29:dup             
	//   16   30:aload_1         
	//   17   31:invokespecial   #23  <Method void JsonPointerBasedFilter(JsonPointer)>
	//   18   34:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #50  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("[JsonPointerFilter at: ");
	//    4    8:aload_1         
	//    5    9:ldc1            #53  <String "[JsonPointerFilter at: ">
	//    6   11:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (_pathToMatch)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #13  <Field JsonPointer _pathToMatch>
	//   11   20:invokevirtual   #60  <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append("]");
	//   13   24:aload_1         
	//   14   25:ldc1            #62  <String "]">
	//   15   27:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		return stringbuilder.toString();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   19   35:areturn         
	}

	protected final JsonPointer _pathToMatch;
}
