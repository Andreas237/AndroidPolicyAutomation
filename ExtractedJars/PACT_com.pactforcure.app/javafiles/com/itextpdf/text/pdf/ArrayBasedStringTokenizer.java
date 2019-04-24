// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayBasedStringTokenizer
{

	public ArrayBasedStringTokenizer(String as[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		regex = Pattern.compile(getRegexFromTokens(as));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #15  <Method String getRegexFromTokens(String[])>
	//    6   10:invokestatic    #21  <Method Pattern Pattern.compile(String)>
	//    7   13:putfield        #23  <Field Pattern regex>
	//    8   16:return          
	}

	private String getRegexFromTokens(String as[])
	{
		StringBuilder stringbuilder = new StringBuilder(100);
	//    0    0:new             #26  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          100
	//    3    6:invokespecial   #29  <Method void StringBuilder(int)>
	//    4    9:astore          4
		int j = as.length;
	//    5   11:aload_1         
	//    6   12:arraylength     
	//    7   13:istore_3        
		for(int i = 0; i < j; i++)
	//*   8   14:iconst_0        
	//*   9   15:istore_2        
	//*  10   16:iload_2         
	//*  11   17:iload_3         
	//*  12   18:icmpge          51
		{
			String s = as[i];
	//   13   21:aload_1         
	//   14   22:iload_2         
	//   15   23:aaload          
	//   16   24:astore          5
			stringbuilder.append("(").append(s).append(")|");
	//   17   26:aload           4
	//   18   28:ldc1            #31  <String "(">
	//   19   30:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   20   33:aload           5
	//   21   35:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   22   38:ldc1            #37  <String ")|">
	//   23   40:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   24   43:pop             
		}

	//   25   44:iload_2         
	//   26   45:iconst_1        
	//   27   46:iadd            
	//   28   47:istore_2        
	//*  29   48:goto            16
		stringbuilder.setLength(stringbuilder.length() - 1);
	//   30   51:aload           4
	//   31   53:aload           4
	//   32   55:invokevirtual   #41  <Method int StringBuilder.length()>
	//   33   58:iconst_1        
	//   34   59:isub            
	//   35   60:invokevirtual   #44  <Method void StringBuilder.setLength(int)>
		return stringbuilder.toString();
	//   36   63:aload           4
	//   37   65:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   38   68:areturn         
	}

	public String[] tokenize(String s)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #52  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #53  <Method void ArrayList()>
	//    3    7:astore_3        
		Matcher matcher = regex.matcher(((CharSequence) (s)));
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field Pattern regex>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #57  <Method Matcher Pattern.matcher(CharSequence)>
	//    8   16:astore          4
		int i;
		for(i = 0; matcher.find(); i = matcher.end())
	//*   9   18:iconst_0        
	//*  10   19:istore_2        
	//*  11   20:aload           4
	//*  12   22:invokevirtual   #63  <Method boolean Matcher.find()>
	//*  13   25:ifeq            78
		{
			String s1 = s.substring(i, matcher.start());
	//   14   28:aload_1         
	//   15   29:iload_2         
	//   16   30:aload           4
	//   17   32:invokevirtual   #66  <Method int Matcher.start()>
	//   18   35:invokevirtual   #72  <Method String String.substring(int, int)>
	//   19   38:astore          5
			if(s1.length() > 0)
	//*  20   40:aload           5
	//*  21   42:invokevirtual   #73  <Method int String.length()>
	//*  22   45:ifle            57
				((List) (arraylist)).add(((Object) (s1)));
	//   23   48:aload_3         
	//   24   49:aload           5
	//   25   51:invokeinterface #79  <Method boolean List.add(Object)>
	//   26   56:pop             
			((List) (arraylist)).add(((Object) (matcher.group())));
	//   27   57:aload_3         
	//   28   58:aload           4
	//   29   60:invokevirtual   #82  <Method String Matcher.group()>
	//   30   63:invokeinterface #79  <Method boolean List.add(Object)>
	//   31   68:pop             
		}

	//   32   69:aload           4
	//   33   71:invokevirtual   #85  <Method int Matcher.end()>
	//   34   74:istore_2        
	//*  35   75:goto            20
		s = s.substring(i, s.length());
	//   36   78:aload_1         
	//   37   79:iload_2         
	//   38   80:aload_1         
	//   39   81:invokevirtual   #73  <Method int String.length()>
	//   40   84:invokevirtual   #72  <Method String String.substring(int, int)>
	//   41   87:astore_1        
		if(s.length() > 0)
	//*  42   88:aload_1         
	//*  43   89:invokevirtual   #73  <Method int String.length()>
	//*  44   92:ifle            103
			((List) (arraylist)).add(((Object) (s)));
	//   45   95:aload_3         
	//   46   96:aload_1         
	//   47   97:invokeinterface #79  <Method boolean List.add(Object)>
	//   48  102:pop             
		return (String[])((List) (arraylist)).toArray(((Object []) (new String[0])));
	//   49  103:aload_3         
	//   50  104:iconst_0        
	//   51  105:anewarray       String[]
	//   52  108:invokeinterface #89  <Method Object[] List.toArray(Object[])>
	//   53  113:checkcast       #91  <Class String[]>
	//   54  116:areturn         
	}

	private final Pattern regex;
}
