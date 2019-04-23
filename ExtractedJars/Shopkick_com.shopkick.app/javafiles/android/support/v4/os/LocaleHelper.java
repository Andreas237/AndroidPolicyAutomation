// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.os;

import java.util.Locale;

final class LocaleHelper
{

	private LocaleHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	static Locale forLanguageTag(String s)
	{
label0:
		{
			if(s.contains("-"))
	//*   0    0:aload_0         
	//*   1    1:ldc1            #17  <String "-">
	//*   2    3:invokevirtual   #23  <Method boolean String.contains(CharSequence)>
	//*   3    6:ifeq            77
			{
				String as[] = s.split("-", -1);
	//    4    9:aload_0         
	//    5   10:ldc1            #17  <String "-">
	//    6   12:iconst_m1       
	//    7   13:invokevirtual   #27  <Method String[] String.split(String, int)>
	//    8   16:astore_1        
				if(as.length > 2)
	//*   9   17:aload_1         
	//*  10   18:arraylength     
	//*  11   19:iconst_2        
	//*  12   20:icmple          40
					return new Locale(as[0], as[1], as[2]);
	//   13   23:new             #29  <Class Locale>
	//   14   26:dup             
	//   15   27:aload_1         
	//   16   28:iconst_0        
	//   17   29:aaload          
	//   18   30:aload_1         
	//   19   31:iconst_1        
	//   20   32:aaload          
	//   21   33:aload_1         
	//   22   34:iconst_2        
	//   23   35:aaload          
	//   24   36:invokespecial   #32  <Method void Locale(String, String, String)>
	//   25   39:areturn         
				if(as.length > 1)
	//*  26   40:aload_1         
	//*  27   41:arraylength     
	//*  28   42:iconst_1        
	//*  29   43:icmple          60
					return new Locale(as[0], as[1]);
	//   30   46:new             #29  <Class Locale>
	//   31   49:dup             
	//   32   50:aload_1         
	//   33   51:iconst_0        
	//   34   52:aaload          
	//   35   53:aload_1         
	//   36   54:iconst_1        
	//   37   55:aaload          
	//   38   56:invokespecial   #35  <Method void Locale(String, String)>
	//   39   59:areturn         
				if(as.length == 1)
	//*  40   60:aload_1         
	//*  41   61:arraylength     
	//*  42   62:iconst_1        
	//*  43   63:icmpne          154
					return new Locale(as[0]);
	//   44   66:new             #29  <Class Locale>
	//   45   69:dup             
	//   46   70:aload_1         
	//   47   71:iconst_0        
	//   48   72:aaload          
	//   49   73:invokespecial   #38  <Method void Locale(String)>
	//   50   76:areturn         
			} else
			{
				if(!s.contains("_"))
					break label0;
	//   51   77:aload_0         
	//   52   78:ldc1            #40  <String "_">
	//   53   80:invokevirtual   #23  <Method boolean String.contains(CharSequence)>
	//   54   83:ifeq            194
				String as1[] = s.split("_", -1);
	//   55   86:aload_0         
	//   56   87:ldc1            #40  <String "_">
	//   57   89:iconst_m1       
	//   58   90:invokevirtual   #27  <Method String[] String.split(String, int)>
	//   59   93:astore_1        
				if(as1.length > 2)
	//*  60   94:aload_1         
	//*  61   95:arraylength     
	//*  62   96:iconst_2        
	//*  63   97:icmple          117
					return new Locale(as1[0], as1[1], as1[2]);
	//   64  100:new             #29  <Class Locale>
	//   65  103:dup             
	//   66  104:aload_1         
	//   67  105:iconst_0        
	//   68  106:aaload          
	//   69  107:aload_1         
	//   70  108:iconst_1        
	//   71  109:aaload          
	//   72  110:aload_1         
	//   73  111:iconst_2        
	//   74  112:aaload          
	//   75  113:invokespecial   #32  <Method void Locale(String, String, String)>
	//   76  116:areturn         
				if(as1.length > 1)
	//*  77  117:aload_1         
	//*  78  118:arraylength     
	//*  79  119:iconst_1        
	//*  80  120:icmple          137
					return new Locale(as1[0], as1[1]);
	//   81  123:new             #29  <Class Locale>
	//   82  126:dup             
	//   83  127:aload_1         
	//   84  128:iconst_0        
	//   85  129:aaload          
	//   86  130:aload_1         
	//   87  131:iconst_1        
	//   88  132:aaload          
	//   89  133:invokespecial   #35  <Method void Locale(String, String)>
	//   90  136:areturn         
				if(as1.length == 1)
	//*  91  137:aload_1         
	//*  92  138:arraylength     
	//*  93  139:iconst_1        
	//*  94  140:icmpne          154
					return new Locale(as1[0]);
	//   95  143:new             #29  <Class Locale>
	//   96  146:dup             
	//   97  147:aload_1         
	//   98  148:iconst_0        
	//   99  149:aaload          
	//  100  150:invokespecial   #38  <Method void Locale(String)>
	//  101  153:areturn         
			}
			StringBuilder stringbuilder = new StringBuilder();
	//  102  154:new             #42  <Class StringBuilder>
	//  103  157:dup             
	//  104  158:invokespecial   #43  <Method void StringBuilder()>
	//  105  161:astore_1        
			stringbuilder.append("Can not parse language tag: [");
	//  106  162:aload_1         
	//  107  163:ldc1            #45  <String "Can not parse language tag: [">
	//  108  165:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//  109  168:pop             
			stringbuilder.append(s);
	//  110  169:aload_1         
	//  111  170:aload_0         
	//  112  171:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//  113  174:pop             
			stringbuilder.append("]");
	//  114  175:aload_1         
	//  115  176:ldc1            #51  <String "]">
	//  116  178:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//  117  181:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//  118  182:new             #53  <Class IllegalArgumentException>
	//  119  185:dup             
	//  120  186:aload_1         
	//  121  187:invokevirtual   #57  <Method String StringBuilder.toString()>
	//  122  190:invokespecial   #58  <Method void IllegalArgumentException(String)>
	//  123  193:athrow          
		}
		return new Locale(s);
	//  124  194:new             #29  <Class Locale>
	//  125  197:dup             
	//  126  198:aload_0         
	//  127  199:invokespecial   #38  <Method void Locale(String)>
	//  128  202:areturn         
	}

	static String toLanguageTag(Locale locale)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #42  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #43  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(locale.getLanguage());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #63  <Method String Locale.getLanguage()>
	//    7   13:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		String s = locale.getCountry();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #66  <Method String Locale.getCountry()>
	//   11   21:astore_2        
		if(s != null && !s.isEmpty())
	//*  12   22:aload_2         
	//*  13   23:ifnull          49
	//*  14   26:aload_2         
	//*  15   27:invokevirtual   #70  <Method boolean String.isEmpty()>
	//*  16   30:ifne            49
		{
			stringbuilder.append("-");
	//   17   33:aload_1         
	//   18   34:ldc1            #17  <String "-">
	//   19   36:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
			stringbuilder.append(locale.getCountry());
	//   21   40:aload_1         
	//   22   41:aload_0         
	//   23   42:invokevirtual   #66  <Method String Locale.getCountry()>
	//   24   45:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   25   48:pop             
		}
		return stringbuilder.toString();
	//   26   49:aload_1         
	//   27   50:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   28   53:areturn         
	}
}
