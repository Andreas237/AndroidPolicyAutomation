// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.util;

import com.pactforcure.app.studies.LanguageNotSupportedException;
import java.util.Locale;

// Referenced classes of package com.pactforcure.app.util:
//			LanguageUtils

public class FormattingUtils
{

	public FormattingUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	private static String enOrdinal(int i)
	{
		switch(i % 100)
	//*   0    0:iload_0         
	//*   1    1:bipush          100
	//*   2    3:irem            
		{
	//*   3    4:tableswitch     11 13: default 32
	//	               11 114
	//	               12 114
	//	               13 114
		default:
			return (new StringBuilder()).append(i).append((new String[] {
				"th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th"
			})[i % 10]).toString();
	//    4   32:new             #13  <Class StringBuilder>
	//    5   35:dup             
	//    6   36:invokespecial   #14  <Method void StringBuilder()>
	//    7   39:iload_0         
	//    8   40:invokevirtual   #18  <Method StringBuilder StringBuilder.append(int)>
	//    9   43:bipush          10
	//   10   45:anewarray       String[]
	//   11   48:dup             
	//   12   49:iconst_0        
	//   13   50:ldc1            #22  <String "th">
	//   14   52:aastore         
	//   15   53:dup             
	//   16   54:iconst_1        
	//   17   55:ldc1            #24  <String "st">
	//   18   57:aastore         
	//   19   58:dup             
	//   20   59:iconst_2        
	//   21   60:ldc1            #26  <String "nd">
	//   22   62:aastore         
	//   23   63:dup             
	//   24   64:iconst_3        
	//   25   65:ldc1            #28  <String "rd">
	//   26   67:aastore         
	//   27   68:dup             
	//   28   69:iconst_4        
	//   29   70:ldc1            #22  <String "th">
	//   30   72:aastore         
	//   31   73:dup             
	//   32   74:iconst_5        
	//   33   75:ldc1            #22  <String "th">
	//   34   77:aastore         
	//   35   78:dup             
	//   36   79:bipush          6
	//   37   81:ldc1            #22  <String "th">
	//   38   83:aastore         
	//   39   84:dup             
	//   40   85:bipush          7
	//   41   87:ldc1            #22  <String "th">
	//   42   89:aastore         
	//   43   90:dup             
	//   44   91:bipush          8
	//   45   93:ldc1            #22  <String "th">
	//   46   95:aastore         
	//   47   96:dup             
	//   48   97:bipush          9
	//   49   99:ldc1            #22  <String "th">
	//   50  101:aastore         
	//   51  102:iload_0         
	//   52  103:bipush          10
	//   53  105:irem            
	//   54  106:aaload          
	//   55  107:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   56  110:invokevirtual   #35  <Method String StringBuilder.toString()>
	//   57  113:areturn         

		case 11: // '\013'
		case 12: // '\f'
		case 13: // '\r'
			return (new StringBuilder()).append(i).append("th").toString();
	//   58  114:new             #13  <Class StringBuilder>
	//   59  117:dup             
	//   60  118:invokespecial   #14  <Method void StringBuilder()>
	//   61  121:iload_0         
	//   62  122:invokevirtual   #18  <Method StringBuilder StringBuilder.append(int)>
	//   63  125:ldc1            #22  <String "th">
	//   64  127:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   65  130:invokevirtual   #35  <Method String StringBuilder.toString()>
	//   66  133:areturn         
		}
	}

	private static String esOrdinal(int i)
	{
		return (new StringBuilder()).append(Integer.toString(i)).append("\272").toString();
	//    0    0:new             #13  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void StringBuilder()>
	//    3    7:iload_0         
	//    4    8:invokestatic    #40  <Method String Integer.toString(int)>
	//    5   11:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//    6   14:ldc1            #42  <String "\272">
	//    7   16:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:invokevirtual   #35  <Method String StringBuilder.toString()>
	//    9   22:areturn         
	}

	public static String ordinal(int i)
	{
		return ordinal(i, LanguageUtils.simpleLangTag(Locale.getDefault()));
	//    0    0:iload_0         
	//    1    1:invokestatic    #49  <Method Locale Locale.getDefault()>
	//    2    4:invokestatic    #55  <Method String LanguageUtils.simpleLangTag(Locale)>
	//    3    7:invokestatic    #58  <Method String ordinal(int, String)>
	//    4   10:areturn         
	}

	private static String ordinal(int i, String s)
	{
label0:
		{
			try
			{
				if(s.equals("en"))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #62  <String "en">
	//*   2    3:invokevirtual   #66  <Method boolean String.equals(Object)>
	//*   3    6:ifeq            14
					return enOrdinal(i);
	//    4    9:iload_0         
	//    5   10:invokestatic    #68  <Method String enOrdinal(int)>
	//    6   13:areturn         
				if(!s.equals("es"))
					break label0;
	//    7   14:aload_1         
	//    8   15:ldc1            #70  <String "es">
	//    9   17:invokevirtual   #66  <Method boolean String.equals(Object)>
	//   10   20:ifeq            34
				s = esOrdinal(i);
	//   11   23:iload_0         
	//   12   24:invokestatic    #72  <Method String esOrdinal(int)>
	//   13   27:astore_1        
			}
	//*  14   28:aload_1         
	//*  15   29:areturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  16   30:astore_1        
			{
				return "";
	//   17   31:ldc1            #74  <String "">
	//   18   33:areturn         
			}
			return s;
		}
		throw new LanguageNotSupportedException("ordinals for the desired locale have not been implemented");
	//   19   34:new             #76  <Class LanguageNotSupportedException>
	//   20   37:dup             
	//   21   38:ldc1            #78  <String "ordinals for the desired locale have not been implemented">
	//   22   40:invokespecial   #81  <Method void LanguageNotSupportedException(String)>
	//   23   43:athrow          
	}

	public static String ordinal(String s)
	{
		try
		{
			s = ordinal(Integer.valueOf(s).intValue());
	//    0    0:aload_0         
	//    1    1:invokestatic    #86  <Method Integer Integer.valueOf(String)>
	//    2    4:invokevirtual   #90  <Method int Integer.intValue()>
	//    3    7:invokestatic    #92  <Method String ordinal(int)>
	//    4   10:astore_0        
		}
	//*   5   11:aload_0         
	//*   6   12:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   7   13:astore_0        
		{
			return "";
	//    8   14:ldc1            #74  <String "">
	//    9   16:areturn         
		}
		return s;
	}
}
