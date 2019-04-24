// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.helpers;


public class Transform
{

	public Transform()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
	//    2    4:return          
	}

	public static void appendEscapingCDATA(StringBuilder stringbuilder, String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		int i = s.indexOf("]]>");
	//    3    5:aload_1         
	//    4    6:ldc1            #11  <String "]]>">
	//    5    8:invokevirtual   #39  <Method int String.indexOf(String)>
	//    6   11:istore_2        
		if(i < 0)
	//*   7   12:iload_2         
	//*   8   13:ifge            23
		{
			stringbuilder.append(s);
	//    9   16:aload_0         
	//   10   17:aload_1         
	//   11   18:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   12   21:pop             
			return;
	//   13   22:return          
		}
		int j = 0;
	//   14   23:iconst_0        
	//   15   24:istore_3        
		while(i > -1) 
	//*  16   25:iload_2         
	//*  17   26:iconst_m1       
	//*  18   27:icmple          74
		{
			stringbuilder.append(s.substring(j, i));
	//   19   30:aload_0         
	//   20   31:aload_1         
	//   21   32:iload_3         
	//   22   33:iload_2         
	//   23   34:invokevirtual   #49  <Method String String.substring(int, int)>
	//   24   37:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   25   40:pop             
			stringbuilder.append("]]>]]&gt;<![CDATA[");
	//   26   41:aload_0         
	//   27   42:ldc1            #8   <String "]]>]]&gt;<![CDATA[">
	//   28   44:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   29   47:pop             
			j = CDATA_END_LEN + i;
	//   30   48:getstatic       #29  <Field int CDATA_END_LEN>
	//   31   51:iload_2         
	//   32   52:iadd            
	//   33   53:istore_3        
			if(j < s.length())
	//*  34   54:iload_3         
	//*  35   55:aload_1         
	//*  36   56:invokevirtual   #27  <Method int String.length()>
	//*  37   59:icmpge          73
				i = s.indexOf("]]>", j);
	//   38   62:aload_1         
	//   39   63:ldc1            #11  <String "]]>">
	//   40   65:iload_3         
	//   41   66:invokevirtual   #52  <Method int String.indexOf(String, int)>
	//   42   69:istore_2        
			else
	//*  43   70:goto            25
				return;
	//   44   73:return          
		}
		stringbuilder.append(s.substring(j));
	//   45   74:aload_0         
	//   46   75:aload_1         
	//   47   76:iload_3         
	//   48   77:invokevirtual   #55  <Method String String.substring(int)>
	//   49   80:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   50   83:pop             
	//   51   84:return          
	}

	public static String escapeTags(String s)
	{
		String s1 = s;
	//    0    0:aload_0         
	//    1    1:astore_1        
		if(s != null)
	//*   2    2:aload_0         
	//*   3    3:ifnull          49
		{
			s1 = s;
	//    4    6:aload_0         
	//    5    7:astore_1        
			if(s.length() != 0)
	//*   6    8:aload_0         
	//*   7    9:invokevirtual   #27  <Method int String.length()>
	//*   8   12:ifeq            49
			{
				if(s.indexOf("<") == -1 && s.indexOf(">") == -1)
	//*   9   15:aload_0         
	//*  10   16:ldc1            #59  <String "<">
	//*  11   18:invokevirtual   #39  <Method int String.indexOf(String)>
	//*  12   21:iconst_m1       
	//*  13   22:icmpne          37
	//*  14   25:aload_0         
	//*  15   26:ldc1            #61  <String ">">
	//*  16   28:invokevirtual   #39  <Method int String.indexOf(String)>
	//*  17   31:iconst_m1       
	//*  18   32:icmpne          37
					return s;
	//   19   35:aload_0         
	//   20   36:areturn         
				s1 = escapeTags(new StringBuffer(s));
	//   21   37:new             #63  <Class StringBuffer>
	//   22   40:dup             
	//   23   41:aload_0         
	//   24   42:invokespecial   #66  <Method void StringBuffer(String)>
	//   25   45:invokestatic    #69  <Method String escapeTags(StringBuffer)>
	//   26   48:astore_1        
			}
		}
		return s1;
	//   27   49:aload_1         
	//   28   50:areturn         
	}

	public static String escapeTags(StringBuffer stringbuffer)
	{
		for(int i = 0; i < stringbuffer.length(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:invokevirtual   #70  <Method int StringBuffer.length()>
	//*   5    7:icmpge          63
		{
			int j = ((int) (stringbuffer.charAt(i)));
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:invokevirtual   #74  <Method char StringBuffer.charAt(int)>
	//    9   15:istore_2        
			String s;
			if(j == 60)
	//*  10   16:iload_2         
	//*  11   17:bipush          60
	//*  12   19:icmpne          40
			{
				j = i + 1;
	//   13   22:iload_1         
	//   14   23:iconst_1        
	//   15   24:iadd            
	//   16   25:istore_2        
				s = "&lt;";
	//   17   26:ldc1            #76  <String "&lt;">
	//   18   28:astore_3        
			} else
	//*  19   29:aload_0         
	//*  20   30:iload_1         
	//*  21   31:iload_2         
	//*  22   32:aload_3         
	//*  23   33:invokevirtual   #80  <Method StringBuffer StringBuffer.replace(int, int, String)>
	//*  24   36:pop             
	//*  25   37:goto            56
			{
				if(j != 62)
					continue;
	//   26   40:iload_2         
	//   27   41:bipush          62
	//   28   43:icmpne          56
				j = i + 1;
	//   29   46:iload_1         
	//   30   47:iconst_1        
	//   31   48:iadd            
	//   32   49:istore_2        
				s = "&gt;";
	//   33   50:ldc1            #82  <String "&gt;">
	//   34   52:astore_3        
			}
			stringbuffer.replace(i, j, s);
		}

	//   35   53:goto            29
	//   36   56:iload_1         
	//   37   57:iconst_1        
	//   38   58:iadd            
	//   39   59:istore_1        
	//*  40   60:goto            2
		return stringbuffer.toString();
	//   41   63:aload_0         
	//   42   64:invokevirtual   #86  <Method String StringBuffer.toString()>
	//   43   67:areturn         
	}

	private static final String CDATA_EMBEDED_END = "]]>]]&gt;<![CDATA[";
	private static final String CDATA_END = "]]>";
	private static final int CDATA_END_LEN = "]]>".length();
	private static final String CDATA_PSEUDO_END = "]]&gt;";
	private static final String CDATA_START = "<![CDATA[";

	static 
	{
	//    0    0:ldc1            #11  <String "]]>">
	//    1    2:invokevirtual   #27  <Method int String.length()>
	//    2    5:putstatic       #29  <Field int CDATA_END_LEN>
	//*   3    8:return          
	}
}
