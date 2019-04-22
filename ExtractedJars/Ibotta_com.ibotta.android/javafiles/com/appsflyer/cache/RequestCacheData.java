// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appsflyer.cache;

import java.util.Scanner;

public class RequestCacheData
{

	public RequestCacheData(String s, String s1, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		_fld02CB = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field String _fld02CB>
		_fld02CA = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #18  <Field String _fld02CA>
		_fld02CE = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #20  <Field String _fld02CE>
	//   11   19:return          
	}

	public RequestCacheData(char ac[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		ac = ((char []) (new Scanner(new String(ac))));
	//    2    4:new             #24  <Class Scanner>
	//    3    7:dup             
	//    4    8:new             #26  <Class String>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokespecial   #28  <Method void String(char[])>
	//    8   16:invokespecial   #31  <Method void Scanner(String)>
	//    9   19:astore_1        
		do
		{
			if(!((Scanner) (ac)).hasNextLine())
				break;
	//   10   20:aload_1         
	//   11   21:invokevirtual   #35  <Method boolean Scanner.hasNextLine()>
	//   12   24:ifeq            105
			String s = ((Scanner) (ac)).nextLine();
	//   13   27:aload_1         
	//   14   28:invokevirtual   #39  <Method String Scanner.nextLine()>
	//   15   31:astore_2        
			if(s.startsWith("url="))
	//*  16   32:aload_2         
	//*  17   33:ldc1            #41  <String "url=">
	//*  18   35:invokevirtual   #45  <Method boolean String.startsWith(String)>
	//*  19   38:ifeq            56
				_fld02CB = s.substring(4).trim();
	//   20   41:aload_0         
	//   21   42:aload_2         
	//   22   43:iconst_4        
	//   23   44:invokevirtual   #49  <Method String String.substring(int)>
	//   24   47:invokevirtual   #52  <Method String String.trim()>
	//   25   50:putfield        #16  <Field String _fld02CB>
			else
	//*  26   53:goto            20
			if(s.startsWith("version="))
	//*  27   56:aload_2         
	//*  28   57:ldc1            #54  <String "version=">
	//*  29   59:invokevirtual   #45  <Method boolean String.startsWith(String)>
	//*  30   62:ifeq            81
				_fld02CE = s.substring(8).trim();
	//   31   65:aload_0         
	//   32   66:aload_2         
	//   33   67:bipush          8
	//   34   69:invokevirtual   #49  <Method String String.substring(int)>
	//   35   72:invokevirtual   #52  <Method String String.trim()>
	//   36   75:putfield        #20  <Field String _fld02CE>
			else
	//*  37   78:goto            20
			if(s.startsWith("data="))
	//*  38   81:aload_2         
	//*  39   82:ldc1            #56  <String "data=">
	//*  40   84:invokevirtual   #45  <Method boolean String.startsWith(String)>
	//*  41   87:ifeq            20
				_fld02CA = s.substring(5).trim();
	//   42   90:aload_0         
	//   43   91:aload_2         
	//   44   92:iconst_5        
	//   45   93:invokevirtual   #49  <Method String String.substring(int)>
	//   46   96:invokevirtual   #52  <Method String String.trim()>
	//   47   99:putfield        #18  <Field String _fld02CA>
		} while(true);
	//   48  102:goto            20
		((Scanner) (ac)).close();
	//   49  105:aload_1         
	//   50  106:invokevirtual   #59  <Method void Scanner.close()>
	//   51  109:return          
	}

	public String getCacheKey()
	{
		return _fld0971;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field String _fld0971>
	//    2    4:areturn         
	}

	public String getPostData()
	{
		return _fld02CA;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field String _fld02CA>
	//    2    4:areturn         
	}

	public String getRequestURL()
	{
		return _fld02CB;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field String _fld02CB>
	//    2    4:areturn         
	}

	public String getVersion()
	{
		return _fld02CE;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String _fld02CE>
	//    2    4:areturn         
	}

	public void setCacheKey(String s)
	{
		_fld0971 = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #62  <Field String _fld0971>
	//    3    5:return          
	}

	private String _fld02CA;
	private String _fld02CB;
	private String _fld02CE;
	private String _fld0971;
}
