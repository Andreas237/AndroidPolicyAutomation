// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.measurement;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Label
{

	public Label(String s, String s1, Boolean boolean1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field String name>
		value = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #18  <Field String value>
		aggregate = boolean1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #20  <Field Boolean aggregate>
	//   11   19:return          
	}

	private String a(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #25  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void StringBuilder()>
	//    3    7:astore          5
		int j = s.length();
	//    4    9:aload_1         
	//    5   10:invokevirtual   #32  <Method int String.length()>
	//    6   13:istore          4
		for(int i = 0; i < j; i++)
	//*   7   15:iconst_0        
	//*   8   16:istore_3        
	//*   9   17:iload_3         
	//*  10   18:iload           4
	//*  11   20:icmpge          88
		{
			char c = Character.toLowerCase(s.charAt(i));
	//   12   23:aload_1         
	//   13   24:iload_3         
	//   14   25:invokevirtual   #36  <Method char String.charAt(int)>
	//   15   28:invokestatic    #42  <Method char Character.toLowerCase(char)>
	//   16   31:istore_2        
			if(c >= 'a' && c <= 'z' || c >= '0' && c <= '9' || c == '_' || c == '-' || c == '.')
	//*  17   32:iload_2         
	//*  18   33:bipush          97
	//*  19   35:icmplt          44
	//*  20   38:iload_2         
	//*  21   39:bipush          122
	//*  22   41:icmple          74
	//*  23   44:iload_2         
	//*  24   45:bipush          48
	//*  25   47:icmplt          56
	//*  26   50:iload_2         
	//*  27   51:bipush          57
	//*  28   53:icmple          74
	//*  29   56:iload_2         
	//*  30   57:bipush          95
	//*  31   59:icmpeq          74
	//*  32   62:iload_2         
	//*  33   63:bipush          45
	//*  34   65:icmpeq          74
	//*  35   68:iload_2         
	//*  36   69:bipush          46
	//*  37   71:icmpne          81
				stringbuilder.append(c);
	//   38   74:aload           5
	//   39   76:iload_2         
	//   40   77:invokevirtual   #46  <Method StringBuilder StringBuilder.append(char)>
	//   41   80:pop             
		}

	//   42   81:iload_3         
	//   43   82:iconst_1        
	//   44   83:iadd            
	//   45   84:istore_3        
	//*  46   85:goto            17
		return stringbuilder.toString();
	//   47   88:aload           5
	//   48   90:invokevirtual   #50  <Method String StringBuilder.toString()>
	//   49   93:areturn         
	}

	public String pack()
	{
		Object obj;
		String s;
		obj = ((Object) (new StringBuilder()));
	//    0    0:new             #25  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void StringBuilder()>
	//    3    7:astore_1        
		if(name == null || value == null)
			break MISSING_BLOCK_LABEL_86;
	//    4    8:aload_0         
	//    5    9:getfield        #16  <Field String name>
	//    6   12:ifnull          86
	//    7   15:aload_0         
	//    8   16:getfield        #18  <Field String value>
	//    9   19:ifnull          86
		s = a(name);
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #16  <Field String name>
	//   13   27:invokespecial   #55  <Method String a(String)>
	//   14   30:astore_2        
		if(s.length() <= 0)
			break MISSING_BLOCK_LABEL_86;
	//   15   31:aload_2         
	//   16   32:invokevirtual   #32  <Method int String.length()>
	//   17   35:ifle            86
		((StringBuilder) (obj)).append("&");
	//   18   38:aload_1         
	//   19   39:ldc1            #57  <String "&">
	//   20   41:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   21   44:pop             
		((StringBuilder) (obj)).append(s);
	//   22   45:aload_1         
	//   23   46:aload_2         
	//   24   47:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   25   50:pop             
		((StringBuilder) (obj)).append("=");
	//   26   51:aload_1         
	//   27   52:ldc1            #62  <String "=">
	//   28   54:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   29   57:pop             
		((StringBuilder) (obj)).append(URLEncoder.encode(value, "UTF-8").replace("+", "%20"));
	//   30   58:aload_1         
	//   31   59:aload_0         
	//   32   60:getfield        #18  <Field String value>
	//   33   63:ldc1            #64  <String "UTF-8">
	//   34   65:invokestatic    #70  <Method String URLEncoder.encode(String, String)>
	//   35   68:ldc1            #72  <String "+">
	//   36   70:ldc1            #74  <String "%20">
	//   37   72:invokevirtual   #78  <Method String String.replace(CharSequence, CharSequence)>
	//   38   75:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   39   78:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   40   79:aload_1         
	//   41   80:invokevirtual   #50  <Method String StringBuilder.toString()>
	//   42   83:astore_1        
		return ((String) (obj));
	//   43   84:aload_1         
	//   44   85:areturn         
_L2:
		return "";
	//   45   86:ldc1            #80  <String "">
	//   46   88:areturn         
		UnsupportedEncodingException unsupportedencodingexception;
		unsupportedencodingexception;
	//   47   89:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  48   90:goto            86
	}

	public Boolean aggregate;
	public String name;
	public String value;
}
