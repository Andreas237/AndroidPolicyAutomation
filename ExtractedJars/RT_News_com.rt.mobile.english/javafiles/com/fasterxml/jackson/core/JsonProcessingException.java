// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core;

import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.core:
//			JsonLocation

public class JsonProcessingException extends IOException
{

	protected JsonProcessingException(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void IOException(String)>
	//    3    5:return          
	}

	protected JsonProcessingException(String s, JsonLocation jsonlocation)
	{
		this(s, jsonlocation, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #19  <Method void JsonProcessingException(String, JsonLocation, Throwable)>
	//    5    7:return          
	}

	protected JsonProcessingException(String s, JsonLocation jsonlocation, Throwable throwable)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void IOException(String)>
		if(throwable != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          15
			initCause(throwable);
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #23  <Method Throwable initCause(Throwable)>
	//    8   14:pop             
		_location = jsonlocation;
	//    9   15:aload_0         
	//   10   16:aload_2         
	//   11   17:putfield        #25  <Field JsonLocation _location>
	//   12   20:return          
	}

	protected JsonProcessingException(String s, Throwable throwable)
	{
		this(s, ((JsonLocation) (null)), throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:invokespecial   #19  <Method void JsonProcessingException(String, JsonLocation, Throwable)>
	//    5    7:return          
	}

	protected JsonProcessingException(Throwable throwable)
	{
		this(((String) (null)), ((JsonLocation) (null)), throwable);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:aload_1         
	//    4    4:invokespecial   #19  <Method void JsonProcessingException(String, JsonLocation, Throwable)>
	//    5    7:return          
	}

	public JsonLocation getLocation()
	{
		return _location;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field JsonLocation _location>
	//    2    4:areturn         
	}

	public String getMessage()
	{
		Object obj;
label0:
		{
			obj = ((Object) (super.getMessage()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method String IOException.getMessage()>
	//    2    4:astore_2        
			String s = ((String) (obj));
	//    3    5:aload_2         
	//    4    6:astore_1        
			if(obj == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       14
				s = "N/A";
	//    7   11:ldc1            #35  <String "N/A">
	//    8   13:astore_1        
			JsonLocation jsonlocation = getLocation();
	//    9   14:aload_0         
	//   10   15:invokevirtual   #37  <Method JsonLocation getLocation()>
	//   11   18:astore_3        
			String s1 = getMessageSuffix();
	//   12   19:aload_0         
	//   13   20:invokevirtual   #40  <Method String getMessageSuffix()>
	//   14   23:astore          4
			if(jsonlocation == null)
	//*  15   25:aload_3         
	//*  16   26:ifnonnull       36
			{
				obj = ((Object) (s));
	//   17   29:aload_1         
	//   18   30:astore_2        
				if(s1 == null)
					break label0;
	//   19   31:aload           4
	//   20   33:ifnull          96
			}
			obj = ((Object) (new StringBuilder(100)));
	//   21   36:new             #42  <Class StringBuilder>
	//   22   39:dup             
	//   23   40:bipush          100
	//   24   42:invokespecial   #45  <Method void StringBuilder(int)>
	//   25   45:astore_2        
			((StringBuilder) (obj)).append(s);
	//   26   46:aload_2         
	//   27   47:aload_1         
	//   28   48:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   29   51:pop             
			if(s1 != null)
	//*  30   52:aload           4
	//*  31   54:ifnull          64
				((StringBuilder) (obj)).append(s1);
	//   32   57:aload_2         
	//   33   58:aload           4
	//   34   60:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   35   63:pop             
			if(jsonlocation != null)
	//*  36   64:aload_3         
	//*  37   65:ifnull          91
			{
				((StringBuilder) (obj)).append('\n');
	//   38   68:aload_2         
	//   39   69:bipush          10
	//   40   71:invokevirtual   #52  <Method StringBuilder StringBuilder.append(char)>
	//   41   74:pop             
				((StringBuilder) (obj)).append(" at ");
	//   42   75:aload_2         
	//   43   76:ldc1            #54  <String " at ">
	//   44   78:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   45   81:pop             
				((StringBuilder) (obj)).append(jsonlocation.toString());
	//   46   82:aload_2         
	//   47   83:aload_3         
	//   48   84:invokevirtual   #59  <Method String JsonLocation.toString()>
	//   49   87:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   50   90:pop             
			}
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   51   91:aload_2         
	//   52   92:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   53   95:astore_2        
		}
		return ((String) (obj));
	//   54   96:aload_2         
	//   55   97:areturn         
	}

	protected String getMessageSuffix()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String getOriginalMessage()
	{
		return super.getMessage();
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method String IOException.getMessage()>
	//    2    4:areturn         
	}

	public Object getProcessor()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #42  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #66  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(((Object)this).getClass().getName());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #72  <Method Class Object.getClass()>
	//    7   13:invokevirtual   #77  <Method String Class.getName()>
	//    8   16:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append(": ");
	//   10   20:aload_1         
	//   11   21:ldc1            #79  <String ": ">
	//   12   23:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(getMessage());
	//   14   27:aload_1         
	//   15   28:aload_0         
	//   16   29:invokevirtual   #80  <Method String getMessage()>
	//   17   32:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
		return stringbuilder.toString();
	//   19   36:aload_1         
	//   20   37:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   21   40:areturn         
	}

	static final long serialVersionUID = 123L;
	protected JsonLocation _location;
}
