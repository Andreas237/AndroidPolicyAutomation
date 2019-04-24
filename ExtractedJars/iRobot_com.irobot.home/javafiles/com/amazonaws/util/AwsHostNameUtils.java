// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amazonaws.util;

import com.amazonaws.internal.config.HostRegexToRegionMapping;
import com.amazonaws.internal.config.InternalConfig;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AwsHostNameUtils
{

	private static String a(String s)
	{
		Object obj = ((Object) (a.matcher(((CharSequence) (s)))));
	//    0    0:getstatic       #18  <Field Pattern a>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #24  <Method Matcher Pattern.matcher(CharSequence)>
	//    3    7:astore_2        
		if(((Matcher) (obj)).matches())
	//*   4    8:aload_2         
	//*   5    9:invokevirtual   #30  <Method boolean Matcher.matches()>
	//*   6   12:ifeq            21
			return ((Matcher) (obj)).group(1);
	//    7   15:aload_2         
	//    8   16:iconst_1        
	//    9   17:invokevirtual   #34  <Method String Matcher.group(int)>
	//   10   20:areturn         
		int i = s.lastIndexOf('.');
	//   11   21:aload_0         
	//   12   22:bipush          46
	//   13   24:invokevirtual   #40  <Method int String.lastIndexOf(int)>
	//   14   27:istore_1        
		if(i == -1)
	//*  15   28:iload_1         
	//*  16   29:iconst_m1       
	//*  17   30:icmpne          36
			return "us-east-1";
	//   18   33:ldc1            #42  <String "us-east-1">
	//   19   35:areturn         
		obj = ((Object) (s.substring(i + 1)));
	//   20   36:aload_0         
	//   21   37:iload_1         
	//   22   38:iconst_1        
	//   23   39:iadd            
	//   24   40:invokevirtual   #45  <Method String String.substring(int)>
	//   25   43:astore_2        
		s = ((String) (obj));
	//   26   44:aload_2         
	//   27   45:astore_0        
		if("us-gov".equals(obj))
	//*  28   46:ldc1            #47  <String "us-gov">
	//*  29   48:aload_2         
	//*  30   49:invokevirtual   #51  <Method boolean String.equals(Object)>
	//*  31   52:ifeq            58
			s = "us-gov-west-1";
	//   32   55:ldc1            #53  <String "us-gov-west-1">
	//   33   57:astore_0        
		return s;
	//   34   58:aload_0         
	//   35   59:areturn         
	}

	public static String a(String s, String s1)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("hostname cannot be null");
	//    2    4:new             #56  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #58  <String "hostname cannot be null">
	//    5   10:invokespecial   #62  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		String s2 = b(s);
	//    7   14:aload_0         
	//    8   15:invokestatic    #65  <Method String b(String)>
	//    9   18:astore_2        
		if(s2 != null)
	//*  10   19:aload_2         
	//*  11   20:ifnull          25
			return s2;
	//   12   23:aload_2         
	//   13   24:areturn         
		if(s.endsWith(".amazonaws.com"))
	//*  14   25:aload_0         
	//*  15   26:ldc1            #67  <String ".amazonaws.com">
	//*  16   28:invokevirtual   #71  <Method boolean String.endsWith(String)>
	//*  17   31:ifeq            53
			return a(s.substring(0, s.length() - ".amazonaws.com".length()));
	//   18   34:aload_0         
	//   19   35:iconst_0        
	//   20   36:aload_0         
	//   21   37:invokevirtual   #75  <Method int String.length()>
	//   22   40:ldc1            #67  <String ".amazonaws.com">
	//   23   42:invokevirtual   #75  <Method int String.length()>
	//   24   45:isub            
	//   25   46:invokevirtual   #78  <Method String String.substring(int, int)>
	//   26   49:invokestatic    #80  <Method String a(String)>
	//   27   52:areturn         
		if(s1 != null)
	//*  28   53:aload_1         
	//*  29   54:ifnull          113
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   30   57:new             #82  <Class StringBuilder>
	//   31   60:dup             
	//   32   61:invokespecial   #84  <Method void StringBuilder()>
	//   33   64:astore_2        
			stringbuilder.append("^(?:.+\\.)?");
	//   34   65:aload_2         
	//   35   66:ldc1            #86  <String "^(?:.+\\.)?">
	//   36   68:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   37   71:pop             
			stringbuilder.append(Pattern.quote(s1));
	//   38   72:aload_2         
	//   39   73:aload_1         
	//   40   74:invokestatic    #93  <Method String Pattern.quote(String)>
	//   41   77:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   42   80:pop             
			stringbuilder.append("[.-]([a-z0-9-]+)\\.");
	//   43   81:aload_2         
	//   44   82:ldc1            #95  <String "[.-]([a-z0-9-]+)\\.">
	//   45   84:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   46   87:pop             
			s = ((String) (Pattern.compile(stringbuilder.toString()).matcher(((CharSequence) (s)))));
	//   47   88:aload_2         
	//   48   89:invokevirtual   #99  <Method String StringBuilder.toString()>
	//   49   92:invokestatic    #16  <Method Pattern Pattern.compile(String)>
	//   50   95:aload_0         
	//   51   96:invokevirtual   #24  <Method Matcher Pattern.matcher(CharSequence)>
	//   52   99:astore_0        
			if(((Matcher) (s)).find())
	//*  53  100:aload_0         
	//*  54  101:invokevirtual   #102 <Method boolean Matcher.find()>
	//*  55  104:ifeq            113
				return ((Matcher) (s)).group(1);
	//   56  107:aload_0         
	//   57  108:iconst_1        
	//   58  109:invokevirtual   #34  <Method String Matcher.group(int)>
	//   59  112:areturn         
		}
		return "us-east-1";
	//   60  113:ldc1            #42  <String "us-east-1">
	//   61  115:areturn         
	}

	public static String a(URI uri)
	{
		uri = ((URI) (uri.getHost()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #109 <Method String URI.getHost()>
	//    2    4:astore_0        
		if(!((String) (uri)).endsWith(".amazonaws.com"))
	//*   3    5:aload_0         
	//*   4    6:ldc1            #67  <String ".amazonaws.com">
	//*   5    8:invokevirtual   #71  <Method boolean String.endsWith(String)>
	//*   6   11:ifne            54
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    7   14:new             #82  <Class StringBuilder>
	//    8   17:dup             
	//    9   18:invokespecial   #84  <Method void StringBuilder()>
	//   10   21:astore_1        
			stringbuilder.append("Cannot parse a service name from an unrecognized endpoint (");
	//   11   22:aload_1         
	//   12   23:ldc1            #111 <String "Cannot parse a service name from an unrecognized endpoint (">
	//   13   25:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   14   28:pop             
			stringbuilder.append(((String) (uri)));
	//   15   29:aload_1         
	//   16   30:aload_0         
	//   17   31:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
			stringbuilder.append(").");
	//   19   35:aload_1         
	//   20   36:ldc1            #113 <String ").">
	//   21   38:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   22   41:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   23   42:new             #56  <Class IllegalArgumentException>
	//   24   45:dup             
	//   25   46:aload_1         
	//   26   47:invokevirtual   #99  <Method String StringBuilder.toString()>
	//   27   50:invokespecial   #62  <Method void IllegalArgumentException(String)>
	//   28   53:athrow          
		}
		uri = ((URI) (((String) (uri)).substring(0, ((String) (uri)).indexOf(".amazonaws.com"))));
	//   29   54:aload_0         
	//   30   55:iconst_0        
	//   31   56:aload_0         
	//   32   57:ldc1            #67  <String ".amazonaws.com">
	//   33   59:invokevirtual   #117 <Method int String.indexOf(String)>
	//   34   62:invokevirtual   #78  <Method String String.substring(int, int)>
	//   35   65:astore_0        
		if(!((String) (uri)).endsWith(".s3") && !a.matcher(((CharSequence) (uri))).matches())
	//*  36   66:aload_0         
	//*  37   67:ldc1            #119 <String ".s3">
	//*  38   69:invokevirtual   #71  <Method boolean String.endsWith(String)>
	//*  39   72:ifne            115
	//*  40   75:getstatic       #18  <Field Pattern a>
	//*  41   78:aload_0         
	//*  42   79:invokevirtual   #24  <Method Matcher Pattern.matcher(CharSequence)>
	//*  43   82:invokevirtual   #30  <Method boolean Matcher.matches()>
	//*  44   85:ifeq            91
	//*  45   88:goto            115
		{
			if(((String) (uri)).indexOf('.') == -1)
	//*  46   91:aload_0         
	//*  47   92:bipush          46
	//*  48   94:invokevirtual   #121 <Method int String.indexOf(int)>
	//*  49   97:iconst_m1       
	//*  50   98:icmpne          103
				return ((String) (uri));
	//   51  101:aload_0         
	//   52  102:areturn         
			else
				return ((String) (uri)).substring(0, ((String) (uri)).indexOf('.'));
	//   53  103:aload_0         
	//   54  104:iconst_0        
	//   55  105:aload_0         
	//   56  106:bipush          46
	//   57  108:invokevirtual   #121 <Method int String.indexOf(int)>
	//   58  111:invokevirtual   #78  <Method String String.substring(int, int)>
	//   59  114:areturn         
		} else
		{
			return "s3";
	//   60  115:ldc1            #123 <String "s3">
	//   61  117:areturn         
		}
	}

	private static String b(String s)
	{
		for(Iterator iterator = com.amazonaws.internal.config.InternalConfig.Factory.a().a().iterator(); iterator.hasNext();)
	//*   0    0:invokestatic    #129 <Method InternalConfig com.amazonaws.internal.config.InternalConfig$Factory.a()>
	//*   1    3:invokevirtual   #134 <Method List InternalConfig.a()>
	//*   2    6:invokeinterface #140 <Method Iterator List.iterator()>
	//*   3   11:astore_1        
	//*   4   12:aload_1         
	//*   5   13:invokeinterface #145 <Method boolean Iterator.hasNext()>
	//*   6   18:ifeq            47
		{
			HostRegexToRegionMapping hostregextoregionmapping = (HostRegexToRegionMapping)iterator.next();
	//    7   21:aload_1         
	//    8   22:invokeinterface #149 <Method Object Iterator.next()>
	//    9   27:checkcast       #151 <Class HostRegexToRegionMapping>
	//   10   30:astore_2        
			if(s.matches(hostregextoregionmapping.a()))
	//*  11   31:aload_0         
	//*  12   32:aload_2         
	//*  13   33:invokevirtual   #153 <Method String HostRegexToRegionMapping.a()>
	//*  14   36:invokevirtual   #155 <Method boolean String.matches(String)>
	//*  15   39:ifeq            12
				return hostregextoregionmapping.b();
	//   16   42:aload_2         
	//   17   43:invokevirtual   #157 <Method String HostRegexToRegionMapping.b()>
	//   18   46:areturn         
		}

		return null;
	//   19   47:aconst_null     
	//   20   48:areturn         
	}

	private static final Pattern a = Pattern.compile("^(?:.+\\.)?s3[.-]([a-z0-9-]+)$");

	static 
	{
	//    0    0:ldc1            #10  <String "^(?:.+\\.)?s3[.-]([a-z0-9-]+)$">
	//    1    2:invokestatic    #16  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #18  <Field Pattern a>
	//*   3    8:return          
	}
}
