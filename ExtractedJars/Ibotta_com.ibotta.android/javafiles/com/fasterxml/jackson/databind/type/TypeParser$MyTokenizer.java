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

	public boolean hasMoreTokens()
	{
		return _pushbackToken != null || super.hasMoreTokens();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String _pushbackToken>
	//    2    4:ifnonnull       19
	//    3    7:aload_0         
	//    4    8:invokespecial   #39  <Method boolean StringTokenizer.hasMoreTokens()>
	//    5   11:ifeq            17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	public String nextToken()
	{
		String s = _pushbackToken;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String _pushbackToken>
	//    2    4:astore_1        
		if(s != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
		{
			_pushbackToken = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #37  <Field String _pushbackToken>
			return s;
	//    8   14:aload_1         
	//    9   15:areturn         
		} else
		{
			String s1 = super.nextToken();
	//   10   16:aload_0         
	//   11   17:invokespecial   #42  <Method String StringTokenizer.nextToken()>
	//   12   20:astore_1        
			_index = _index + s1.length();
	//   13   21:aload_0         
	//   14   22:aload_0         
	//   15   23:getfield        #27  <Field int _index>
	//   16   26:aload_1         
	//   17   27:invokevirtual   #46  <Method int String.length()>
	//   18   30:iadd            
	//   19   31:putfield        #27  <Field int _index>
			return s1.trim();
	//   20   34:aload_1         
	//   21   35:invokevirtual   #49  <Method String String.trim()>
	//   22   38:areturn         
		}
	}

	public void pushBack(String s)
	{
		_pushbackToken = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field String _pushbackToken>
	//    3    5:return          
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
