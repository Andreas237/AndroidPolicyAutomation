// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson;


// Referenced classes of package com.google.gson:
//			JsonParseException

public final class JsonSyntaxException extends JsonParseException
{

	public JsonSyntaxException(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void JsonParseException(String)>
	//    3    5:return          
	}

	public JsonSyntaxException(String s, Throwable throwable)
	{
		super(s, throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #16  <Method void JsonParseException(String, Throwable)>
	//    4    6:return          
	}

	public JsonSyntaxException(Throwable throwable)
	{
		super(throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void JsonParseException(Throwable)>
	//    3    5:return          
	}

	private static final long serialVersionUID = 1L;
}
