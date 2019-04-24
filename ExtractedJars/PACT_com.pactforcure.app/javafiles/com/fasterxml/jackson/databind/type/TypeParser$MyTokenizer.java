// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.type;

import java.util.StringTokenizer;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//			TypeParser

static final class TypeParser$MyTokenizer extends StringTokenizer
{

	public String getAllInput()
	{
		return _input;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String _input>
	//    2    4:areturn         
	}

	public String getRemainingInput()
	{
		return _input.substring(_index);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String _input>
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field int _index>
	//    4    8:invokevirtual   #33  <Method String String.substring(int)>
	//    5   11:areturn         
	}

	public String getUsedInput()
	{
		return _input.substring(0, _index);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String _input>
	//    2    4:iconst_0        
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field int _index>
	//    5    9:invokevirtual   #37  <Method String String.substring(int, int)>
	//    6   12:areturn         
	}

	public boolean hasMoreTokens()
	{
		return _pushbackToken != null || super.hasMoreTokens();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field String _pushbackToken>
	//    2    4:ifnonnull       14
	//    3    7:aload_0         
	//    4    8:invokespecial   #43  <Method boolean StringTokenizer.hasMoreTokens()>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public String nextToken()
	{
		String s;
		if(_pushbackToken != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field String _pushbackToken>
	//*   2    4:ifnull          32
		{
			s = _pushbackToken;
	//    3    7:aload_0         
	//    4    8:getfield        #41  <Field String _pushbackToken>
	//    5   11:astore_1        
			_pushbackToken = null;
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:putfield        #41  <Field String _pushbackToken>
		} else
	//*   9   17:aload_0         
	//*  10   18:aload_0         
	//*  11   19:getfield        #27  <Field int _index>
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #48  <Method int String.length()>
	//*  14   26:iadd            
	//*  15   27:putfield        #27  <Field int _index>
	//*  16   30:aload_1         
	//*  17   31:areturn         
		{
			s = super.nextToken();
	//   18   32:aload_0         
	//   19   33:invokespecial   #50  <Method String StringTokenizer.nextToken()>
	//   20   36:astore_1        
		}
		_index = _index + s.length();
		return s;
	//*  21   37:goto            17
	}

	public void pushBack(String s)
	{
		_pushbackToken = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #41  <Field String _pushbackToken>
		_index = _index - s.length();
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #27  <Field int _index>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #48  <Method int String.length()>
	//    8   14:isub            
	//    9   15:putfield        #27  <Field int _index>
	//   10   18:return          
	}

	protected int _index;
	protected final String _input;
	protected String _pushbackToken;

	public TypeParser$MyTokenizer(String s)
	{
		super(s, "<,>", true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #16  <String "<,>">
	//    3    4:iconst_1        
	//    4    5:invokespecial   #19  <Method void StringTokenizer(String, String, boolean)>
		_input = s;
	//    5    8:aload_0         
	//    6    9:aload_1         
	//    7   10:putfield        #21  <Field String _input>
	//    8   13:return          
	}
}
