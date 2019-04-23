// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import android.util.Pair;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;

// Referenced classes of package com.craftar:
//			HttpUtils, CLog

public static class HttpUtils$URLParameterBuilder
{

	public void addParameter(String s, String s1)
	{
		try
		{
			s = URLEncoder.encode(s, "utf-8");
	//    0    0:aload_1         
	//    1    1:ldc1            #26  <String "utf-8">
	//    2    3:invokestatic    #32  <Method String URLEncoder.encode(String, String)>
	//    3    6:astore_1        
			s1 = URLEncoder.encode(s1, "utf-8");
	//    4    7:aload_2         
	//    5    8:ldc1            #26  <String "utf-8">
	//    6   10:invokestatic    #32  <Method String URLEncoder.encode(String, String)>
	//    7   13:astore_2        
			params.add(((Object) (new Pair(((Object) (s)), ((Object) (s1))))));
	//    8   14:aload_0         
	//    9   15:getfield        #19  <Field ArrayList params>
	//   10   18:new             #34  <Class Pair>
	//   11   21:dup             
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:invokespecial   #37  <Method void Pair(Object, Object)>
	//   15   27:invokevirtual   #41  <Method boolean ArrayList.add(Object)>
	//   16   30:pop             
			return;
	//   17   31:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  18   32:astore_1        
		{
			s1 = ((String) (new StringBuilder()));
	//   19   33:new             #43  <Class StringBuilder>
	//   20   36:dup             
	//   21   37:invokespecial   #44  <Method void StringBuilder()>
	//   22   40:astore_2        
		}
		((StringBuilder) (s1)).append("Could not add parameter: ");
	//   23   41:aload_2         
	//   24   42:ldc1            #46  <String "Could not add parameter: ">
	//   25   44:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   26   47:pop             
		((StringBuilder) (s1)).append(((UnsupportedEncodingException) (s)).getLocalizedMessage());
	//   27   48:aload_2         
	//   28   49:aload_1         
	//   29   50:invokevirtual   #54  <Method String UnsupportedEncodingException.getLocalizedMessage()>
	//   30   53:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   31   56:pop             
		CLog.e(((StringBuilder) (s1)).toString());
	//   32   57:aload_2         
	//   33   58:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   34   61:invokestatic    #63  <Method void CLog.e(String)>
		((UnsupportedEncodingException) (s)).printStackTrace();
	//   35   64:aload_1         
	//   36   65:invokevirtual   #66  <Method void UnsupportedEncodingException.printStackTrace()>
	//   37   68:return          
	}

	public String getURLParameters()
	{
		Object obj = "";
	//    0    0:ldc1            #69  <String "">
	//    1    2:astore_2        
		for(int i = 0; i < params.size(); i++)
	//*   2    3:iconst_0        
	//*   3    4:istore_1        
	//*   4    5:iload_1         
	//*   5    6:aload_0         
	//*   6    7:getfield        #19  <Field ArrayList params>
	//*   7   10:invokevirtual   #73  <Method int ArrayList.size()>
	//*   8   13:icmpge          132
		{
			Object obj1 = ((Object) ((Pair)params.get(i)));
	//    9   16:aload_0         
	//   10   17:getfield        #19  <Field ArrayList params>
	//   11   20:iload_1         
	//   12   21:invokevirtual   #77  <Method Object ArrayList.get(int)>
	//   13   24:checkcast       #34  <Class Pair>
	//   14   27:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   15   28:new             #43  <Class StringBuilder>
	//   16   31:dup             
	//   17   32:invokespecial   #44  <Method void StringBuilder()>
	//   18   35:astore          4
			stringbuilder.append(((String) (obj)));
	//   19   37:aload           4
	//   20   39:aload_2         
	//   21   40:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   22   43:pop             
			stringbuilder.append((String)((Pair) (obj1)).first);
	//   23   44:aload           4
	//   24   46:aload_3         
	//   25   47:getfield        #81  <Field Object Pair.first>
	//   26   50:checkcast       #83  <Class String>
	//   27   53:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   28   56:pop             
			stringbuilder.append("=");
	//   29   57:aload           4
	//   30   59:ldc1            #85  <String "=">
	//   31   61:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   32   64:pop             
			stringbuilder.append((String)((Pair) (obj1)).second);
	//   33   65:aload           4
	//   34   67:aload_3         
	//   35   68:getfield        #88  <Field Object Pair.second>
	//   36   71:checkcast       #83  <Class String>
	//   37   74:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   38   77:pop             
			obj1 = ((Object) (stringbuilder.toString()));
	//   39   78:aload           4
	//   40   80:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   41   83:astore_3        
			obj = obj1;
	//   42   84:aload_3         
	//   43   85:astore_2        
			if(i < params.size() - 1)
	//*  44   86:iload_1         
	//*  45   87:aload_0         
	//*  46   88:getfield        #19  <Field ArrayList params>
	//*  47   91:invokevirtual   #73  <Method int ArrayList.size()>
	//*  48   94:iconst_1        
	//*  49   95:isub            
	//*  50   96:icmpge          125
			{
				obj = ((Object) (new StringBuilder()));
	//   51   99:new             #43  <Class StringBuilder>
	//   52  102:dup             
	//   53  103:invokespecial   #44  <Method void StringBuilder()>
	//   54  106:astore_2        
				((StringBuilder) (obj)).append(((String) (obj1)));
	//   55  107:aload_2         
	//   56  108:aload_3         
	//   57  109:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   58  112:pop             
				((StringBuilder) (obj)).append("&");
	//   59  113:aload_2         
	//   60  114:ldc1            #90  <String "&">
	//   61  116:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   62  119:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   63  120:aload_2         
	//   64  121:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   65  124:astore_2        
			}
		}

	//   66  125:iload_1         
	//   67  126:iconst_1        
	//   68  127:iadd            
	//   69  128:istore_1        
	//*  70  129:goto            5
		return ((String) (obj));
	//   71  132:aload_2         
	//   72  133:areturn         
	}

	private ArrayList params;

	public HttpUtils$URLParameterBuilder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		params = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #16  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void ArrayList()>
	//    6   12:putfield        #19  <Field ArrayList params>
	//    7   15:return          
	}
}
