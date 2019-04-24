// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.os;

import java.util.Locale;

final class LocaleHelper
{

	LocaleHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	static Locale forLanguageTag(String s)
	{
		if(s.contains("-"))
	//*   0    0:aload_0         
	//*   1    1:ldc1            #17  <String "-">
	//*   2    3:invokevirtual   #23  <Method boolean String.contains(CharSequence)>
	//*   3    6:ifeq            76
		{
			String as[] = s.split("-");
	//    4    9:aload_0         
	//    5   10:ldc1            #17  <String "-">
	//    6   12:invokevirtual   #27  <Method String[] String.split(String)>
	//    7   15:astore_1        
			if(as.length > 2)
	//*   8   16:aload_1         
	//*   9   17:arraylength     
	//*  10   18:iconst_2        
	//*  11   19:icmple          39
				return new Locale(as[0], as[1], as[2]);
	//   12   22:new             #29  <Class Locale>
	//   13   25:dup             
	//   14   26:aload_1         
	//   15   27:iconst_0        
	//   16   28:aaload          
	//   17   29:aload_1         
	//   18   30:iconst_1        
	//   19   31:aaload          
	//   20   32:aload_1         
	//   21   33:iconst_2        
	//   22   34:aaload          
	//   23   35:invokespecial   #32  <Method void Locale(String, String, String)>
	//   24   38:areturn         
			if(as.length > 1)
	//*  25   39:aload_1         
	//*  26   40:arraylength     
	//*  27   41:iconst_1        
	//*  28   42:icmple          59
				return new Locale(as[0], as[1]);
	//   29   45:new             #29  <Class Locale>
	//   30   48:dup             
	//   31   49:aload_1         
	//   32   50:iconst_0        
	//   33   51:aaload          
	//   34   52:aload_1         
	//   35   53:iconst_1        
	//   36   54:aaload          
	//   37   55:invokespecial   #35  <Method void Locale(String, String)>
	//   38   58:areturn         
			if(as.length == 1)
	//*  39   59:aload_1         
	//*  40   60:arraylength     
	//*  41   61:iconst_1        
	//*  42   62:icmpne          161
				return new Locale(as[0]);
	//   43   65:new             #29  <Class Locale>
	//   44   68:dup             
	//   45   69:aload_1         
	//   46   70:iconst_0        
	//   47   71:aaload          
	//   48   72:invokespecial   #38  <Method void Locale(String)>
	//   49   75:areturn         
		} else
		if(s.contains("_"))
	//*  50   76:aload_0         
	//*  51   77:ldc1            #40  <String "_">
	//*  52   79:invokevirtual   #23  <Method boolean String.contains(CharSequence)>
	//*  53   82:ifeq            152
		{
			String as1[] = s.split("_");
	//   54   85:aload_0         
	//   55   86:ldc1            #40  <String "_">
	//   56   88:invokevirtual   #27  <Method String[] String.split(String)>
	//   57   91:astore_1        
			if(as1.length > 2)
	//*  58   92:aload_1         
	//*  59   93:arraylength     
	//*  60   94:iconst_2        
	//*  61   95:icmple          115
				return new Locale(as1[0], as1[1], as1[2]);
	//   62   98:new             #29  <Class Locale>
	//   63  101:dup             
	//   64  102:aload_1         
	//   65  103:iconst_0        
	//   66  104:aaload          
	//   67  105:aload_1         
	//   68  106:iconst_1        
	//   69  107:aaload          
	//   70  108:aload_1         
	//   71  109:iconst_2        
	//   72  110:aaload          
	//   73  111:invokespecial   #32  <Method void Locale(String, String, String)>
	//   74  114:areturn         
			if(as1.length > 1)
	//*  75  115:aload_1         
	//*  76  116:arraylength     
	//*  77  117:iconst_1        
	//*  78  118:icmple          135
				return new Locale(as1[0], as1[1]);
	//   79  121:new             #29  <Class Locale>
	//   80  124:dup             
	//   81  125:aload_1         
	//   82  126:iconst_0        
	//   83  127:aaload          
	//   84  128:aload_1         
	//   85  129:iconst_1        
	//   86  130:aaload          
	//   87  131:invokespecial   #35  <Method void Locale(String, String)>
	//   88  134:areturn         
			if(as1.length == 1)
	//*  89  135:aload_1         
	//*  90  136:arraylength     
	//*  91  137:iconst_1        
	//*  92  138:icmpne          161
				return new Locale(as1[0]);
	//   93  141:new             #29  <Class Locale>
	//   94  144:dup             
	//   95  145:aload_1         
	//   96  146:iconst_0        
	//   97  147:aaload          
	//   98  148:invokespecial   #38  <Method void Locale(String)>
	//   99  151:areturn         
		} else
		{
			return new Locale(s);
	//  100  152:new             #29  <Class Locale>
	//  101  155:dup             
	//  102  156:aload_0         
	//  103  157:invokespecial   #38  <Method void Locale(String)>
	//  104  160:areturn         
		}
		throw new IllegalArgumentException((new StringBuilder()).append("Can not parse language tag: [").append(s).append("]").toString());
	//  105  161:new             #42  <Class IllegalArgumentException>
	//  106  164:dup             
	//  107  165:new             #44  <Class StringBuilder>
	//  108  168:dup             
	//  109  169:invokespecial   #45  <Method void StringBuilder()>
	//  110  172:ldc1            #47  <String "Can not parse language tag: [">
	//  111  174:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  112  177:aload_0         
	//  113  178:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  114  181:ldc1            #53  <String "]">
	//  115  183:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  116  186:invokevirtual   #57  <Method String StringBuilder.toString()>
	//  117  189:invokespecial   #58  <Method void IllegalArgumentException(String)>
	//  118  192:athrow          
	}

	static String toLanguageTag(Locale locale)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #44  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #45  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(locale.getLanguage());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #63  <Method String Locale.getLanguage()>
	//    7   13:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
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
	//   19   36:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
			stringbuilder.append(locale.getCountry());
	//   21   40:aload_1         
	//   22   41:aload_0         
	//   23   42:invokevirtual   #66  <Method String Locale.getCountry()>
	//   24   45:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   25   48:pop             
		}
		return stringbuilder.toString();
	//   26   49:aload_1         
	//   27   50:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   28   53:areturn         
	}
}
