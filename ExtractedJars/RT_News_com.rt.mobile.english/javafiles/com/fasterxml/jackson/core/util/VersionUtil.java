// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.Versioned;
import java.io.*;
import java.util.Properties;
import java.util.regex.Pattern;

public class VersionUtil
{

	protected VersionUtil()
	{
		Exception exception;
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		Object obj;
		Object obj1;
		try
		{
			obj = ((Object) (versionFor(((Object)this).getClass())));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #30  <Method Class Object.getClass()>
	//    4    8:invokestatic    #34  <Method Version versionFor(Class)>
	//    5   11:astore_1        
		}
	//*   6   12:goto            53
	//*   7   15:getstatic       #40  <Field PrintStream System.err>
	//*   8   18:astore_1        
	//*   9   19:new             #42  <Class StringBuilder>
	//*  10   22:dup             
	//*  11   23:invokespecial   #43  <Method void StringBuilder()>
	//*  12   26:astore_2        
	//*  13   27:aload_2         
	//*  14   28:ldc1            #45  <String "ERROR: Failed to load Version information from ">
	//*  15   30:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//*  16   33:pop             
	//*  17   34:aload_2         
	//*  18   35:aload_0         
	//*  19   36:invokevirtual   #30  <Method Class Object.getClass()>
	//*  20   39:invokevirtual   #52  <Method StringBuilder StringBuilder.append(Object)>
	//*  21   42:pop             
	//*  22   43:aload_1         
	//*  23   44:aload_2         
	//*  24   45:invokevirtual   #56  <Method String StringBuilder.toString()>
	//*  25   48:invokevirtual   #62  <Method void PrintStream.println(String)>
	//*  26   51:aconst_null     
	//*  27   52:astore_1        
	//*  28   53:aload_1         
	//*  29   54:astore_2        
	//*  30   55:aload_1         
	//*  31   56:ifnonnull       63
	//*  32   59:invokestatic    #68  <Method Version Version.unknownVersion()>
	//*  33   62:astore_2        
	//*  34   63:aload_0         
	//*  35   64:aload_2         
	//*  36   65:putfield        #70  <Field Version _v>
	//*  37   68:return          
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			obj = ((Object) (System.err));
			obj1 = ((Object) (new StringBuilder()));
			((StringBuilder) (obj1)).append("ERROR: Failed to load Version information from ");
			((StringBuilder) (obj1)).append(((Object) (((Object)this).getClass())));
			((PrintStream) (obj)).println(((StringBuilder) (obj1)).toString());
			obj = null;
		}
		obj1 = obj;
		if(obj == null)
			obj1 = ((Object) (Version.unknownVersion()));
		_v = ((Version) (obj1));
	//*  38   69:astore_1        
	//*  39   70:goto            15
	}

	private static final void _close(Closeable closeable)
	{
		try
		{
			closeable.close();
	//    0    0:aload_0         
	//    1    1:invokeinterface #79  <Method void Closeable.close()>
			return;
	//    2    6:return          
		}
		// Misplaced declaration of an exception variable
		catch(Closeable closeable)
	//*   3    7:astore_0        
		{
			return;
	//    4    8:return          
		}
	}

	public static Version mavenVersionFor(ClassLoader classloader, String s, String s1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #42  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #43  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("META-INF/maven/");
	//    4    8:aload_3         
	//    5    9:ldc1            #84  <String "META-INF/maven/">
	//    6   11:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(s.replaceAll("\\.", "/"));
	//    8   15:aload_3         
	//    9   16:aload_1         
	//   10   17:ldc1            #86  <String "\\.">
	//   11   19:ldc1            #88  <String "/">
	//   12   21:invokevirtual   #94  <Method String String.replaceAll(String, String)>
	//   13   24:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
		stringbuilder.append("/");
	//   15   28:aload_3         
	//   16   29:ldc1            #88  <String "/">
	//   17   31:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
		stringbuilder.append(s1);
	//   19   35:aload_3         
	//   20   36:aload_2         
	//   21   37:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   22   40:pop             
		stringbuilder.append("/pom.properties");
	//   23   41:aload_3         
	//   24   42:ldc1            #96  <String "/pom.properties">
	//   25   44:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   26   47:pop             
		classloader = ((ClassLoader) (classloader.getResourceAsStream(stringbuilder.toString())));
	//   27   48:aload_0         
	//   28   49:aload_3         
	//   29   50:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   30   53:invokevirtual   #102 <Method java.io.InputStream ClassLoader.getResourceAsStream(String)>
	//   31   56:astore_0        
		if(classloader == null) goto _L2; else goto _L1
	//   32   57:aload_0         
	//   33   58:ifnull          117
_L1:
		s = ((String) (new Properties()));
	//   34   61:new             #104 <Class Properties>
	//   35   64:dup             
	//   36   65:invokespecial   #105 <Method void Properties()>
	//   37   68:astore_1        
		((Properties) (s)).load(((java.io.InputStream) (classloader)));
	//   38   69:aload_1         
	//   39   70:aload_0         
	//   40   71:invokevirtual   #109 <Method void Properties.load(java.io.InputStream)>
		s1 = ((Properties) (s)).getProperty("version");
	//   41   74:aload_1         
	//   42   75:ldc1            #111 <String "version">
	//   43   77:invokevirtual   #115 <Method String Properties.getProperty(String)>
	//   44   80:astore_2        
		String s2 = ((Properties) (s)).getProperty("artifactId");
	//   45   81:aload_1         
	//   46   82:ldc1            #117 <String "artifactId">
	//   47   84:invokevirtual   #115 <Method String Properties.getProperty(String)>
	//   48   87:astore_3        
		s = ((String) (parseVersion(s1, ((Properties) (s)).getProperty("groupId"), s2)));
	//   49   88:aload_2         
	//   50   89:aload_1         
	//   51   90:ldc1            #119 <String "groupId">
	//   52   92:invokevirtual   #115 <Method String Properties.getProperty(String)>
	//   53   95:aload_3         
	//   54   96:invokestatic    #123 <Method Version parseVersion(String, String, String)>
	//   55   99:astore_1        
		_close(((Closeable) (classloader)));
	//   56  100:aload_0         
	//   57  101:invokestatic    #125 <Method void _close(Closeable)>
		return ((Version) (s));
	//   58  104:aload_1         
	//   59  105:areturn         
		s;
	//   60  106:astore_1        
		_close(((Closeable) (classloader)));
	//   61  107:aload_0         
	//   62  108:invokestatic    #125 <Method void _close(Closeable)>
		throw s;
	//   63  111:aload_1         
	//   64  112:athrow          
_L4:
		_close(((Closeable) (classloader)));
	//   65  113:aload_0         
	//   66  114:invokestatic    #125 <Method void _close(Closeable)>
_L2:
		return Version.unknownVersion();
	//   67  117:invokestatic    #68  <Method Version Version.unknownVersion()>
	//   68  120:areturn         
		s;
	//   69  121:astore_1        
		if(true) goto _L4; else goto _L3
_L3:
	//*  70  122:goto            113
	}

	public static Version packageVersionFor(Class class1)
	{
		Object obj;
		obj = ((Object) (new StringBuilder()));
	//    0    0:new             #42  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #43  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (obj)).append(class1.getPackage().getName());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #133 <Method Package Class.getPackage()>
	//    7   13:invokevirtual   #138 <Method String Package.getName()>
	//    8   16:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		((StringBuilder) (obj)).append(".PackageVersion");
	//   10   20:aload_1         
	//   11   21:ldc1            #140 <String ".PackageVersion">
	//   12   23:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		obj = ((Object) (Class.forName(((StringBuilder) (obj)).toString(), true, class1.getClassLoader())));
	//   14   27:aload_1         
	//   15   28:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   16   31:iconst_1        
	//   17   32:aload_0         
	//   18   33:invokevirtual   #144 <Method ClassLoader Class.getClassLoader()>
	//   19   36:invokestatic    #148 <Method Class Class.forName(String, boolean, ClassLoader)>
	//   20   39:astore_1        
		try
		{
			class1 = ((Class) (((Versioned)((Class) (obj)).newInstance()).version()));
	//   21   40:aload_1         
	//   22   41:invokevirtual   #152 <Method Object Class.newInstance()>
	//   23   44:checkcast       #154 <Class Versioned>
	//   24   47:invokeinterface #156 <Method Version Versioned.version()>
	//   25   52:astore_0        
		}
	//*  26   53:goto            91
	//*  27   56:new             #42  <Class StringBuilder>
	//*  28   59:dup             
	//*  29   60:invokespecial   #43  <Method void StringBuilder()>
	//*  30   63:astore_0        
	//*  31   64:aload_0         
	//*  32   65:ldc1            #158 <String "Failed to get Versioned out of ">
	//*  33   67:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//*  34   70:pop             
	//*  35   71:aload_0         
	//*  36   72:aload_1         
	//*  37   73:invokevirtual   #52  <Method StringBuilder StringBuilder.append(Object)>
	//*  38   76:pop             
	//*  39   77:new             #160 <Class IllegalArgumentException>
	//*  40   80:dup             
	//*  41   81:aload_0         
	//*  42   82:invokevirtual   #56  <Method String StringBuilder.toString()>
	//*  43   85:invokespecial   #162 <Method void IllegalArgumentException(String)>
	//*  44   88:athrow          
	//*  45   89:aconst_null     
	//*  46   90:astore_0        
	//*  47   91:aload_0         
	//*  48   92:astore_1        
	//*  49   93:aload_0         
	//*  50   94:ifnonnull       101
	//*  51   97:invokestatic    #68  <Method Version Version.unknownVersion()>
	//*  52  100:astore_1        
	//*  53  101:aload_1         
	//*  54  102:areturn         
	//*  55  103:astore_0        
	//*  56  104:goto            89
		// Misplaced declaration of an exception variable
		catch(Class class1)
		{
			try
			{
				class1 = ((Class) (new StringBuilder()));
				((StringBuilder) (class1)).append("Failed to get Versioned out of ");
				((StringBuilder) (class1)).append(obj);
				throw new IllegalArgumentException(((StringBuilder) (class1)).toString());
			}
			// Misplaced declaration of an exception variable
			catch(Class class1)
			{
				class1 = null;
			}
		}
		obj = ((Object) (class1));
		if(class1 == null)
			obj = ((Object) (Version.unknownVersion()));
		return ((Version) (obj));
	//*  57  107:astore_0        
	//*  58  108:goto            56
	}

	public static Version parseVersion(String s, String s1, String s2)
	{
		if(s != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          101
		{
			s = s.trim();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #167 <Method String String.trim()>
	//    4    8:astore_0        
			if(s.length() > 0)
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #171 <Method int String.length()>
	//*   7   13:ifle            101
			{
				s = ((String) (V_SEP.split(((CharSequence) (s)))));
	//    8   16:getstatic       #20  <Field Pattern V_SEP>
	//    9   19:aload_0         
	//   10   20:invokevirtual   #175 <Method String[] Pattern.split(CharSequence)>
	//   11   23:astore_0        
				int j = 0;
	//   12   24:iconst_0        
	//   13   25:istore          4
				int k = parseVersionPart(((String) (s[0])));
	//   14   27:aload_0         
	//   15   28:iconst_0        
	//   16   29:aaload          
	//   17   30:invokestatic    #179 <Method int parseVersionPart(String)>
	//   18   33:istore          5
				int i;
				if(s.length > 1)
	//*  19   35:aload_0         
	//*  20   36:arraylength     
	//*  21   37:iconst_1        
	//*  22   38:icmple          51
					i = parseVersionPart(((String) (s[1])));
	//   23   41:aload_0         
	//   24   42:iconst_1        
	//   25   43:aaload          
	//   26   44:invokestatic    #179 <Method int parseVersionPart(String)>
	//   27   47:istore_3        
				else
	//*  28   48:goto            53
					i = 0;
	//   29   51:iconst_0        
	//   30   52:istore_3        
				if(s.length > 2)
	//*  31   53:aload_0         
	//*  32   54:arraylength     
	//*  33   55:iconst_2        
	//*  34   56:icmple          67
					j = parseVersionPart(((String) (s[2])));
	//   35   59:aload_0         
	//   36   60:iconst_2        
	//   37   61:aaload          
	//   38   62:invokestatic    #179 <Method int parseVersionPart(String)>
	//   39   65:istore          4
				if(s.length > 3)
	//*  40   67:aload_0         
	//*  41   68:arraylength     
	//*  42   69:iconst_3        
	//*  43   70:icmple          80
					s = ((String) (s[3]));
	//   44   73:aload_0         
	//   45   74:iconst_3        
	//   46   75:aaload          
	//   47   76:astore_0        
				else
	//*  48   77:goto            85
					s = null;
	//   49   80:aconst_null     
	//   50   81:astore_0        
	//*  51   82:goto            77
				return new Version(k, i, j, s, s1, s2);
	//   52   85:new             #64  <Class Version>
	//   53   88:dup             
	//   54   89:iload           5
	//   55   91:iload_3         
	//   56   92:iload           4
	//   57   94:aload_0         
	//   58   95:aload_1         
	//   59   96:aload_2         
	//   60   97:invokespecial   #182 <Method void Version(int, int, int, String, String, String)>
	//   61  100:areturn         
			}
		}
		return Version.unknownVersion();
	//   62  101:invokestatic    #68  <Method Version Version.unknownVersion()>
	//   63  104:areturn         
	}

	protected static int parseVersionPart(String s)
	{
		int k = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #171 <Method int String.length()>
	//    2    4:istore_3        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		int j = 0;
	//    5    7:iconst_0        
	//    6    8:istore_2        
		do
		{
			if(i >= k)
				break;
	//    7    9:iload_1         
	//    8   10:iload_3         
	//    9   11:icmpge          55
			char c = s.charAt(i);
	//   10   14:aload_0         
	//   11   15:iload_1         
	//   12   16:invokevirtual   #186 <Method char String.charAt(int)>
	//   13   19:istore          4
			if(c > '9')
				break;
	//   14   21:iload           4
	//   15   23:bipush          57
	//   16   25:icmpgt          55
			if(c < '0')
	//*  17   28:iload           4
	//*  18   30:bipush          48
	//*  19   32:icmpge          37
				return j;
	//   20   35:iload_2         
	//   21   36:ireturn         
			j = j * 10 + (c - 48);
	//   22   37:iload_2         
	//   23   38:bipush          10
	//   24   40:imul            
	//   25   41:iload           4
	//   26   43:bipush          48
	//   27   45:isub            
	//   28   46:iadd            
	//   29   47:istore_2        
			i++;
	//   30   48:iload_1         
	//   31   49:iconst_1        
	//   32   50:iadd            
	//   33   51:istore_1        
		} while(true);
	//   34   52:goto            9
		return j;
	//   35   55:iload_2         
	//   36   56:ireturn         
	}

	public static final void throwInternal()
	{
		throw new RuntimeException("Internal error: this code path should never get executed");
	//    0    0:new             #189 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #191 <String "Internal error: this code path should never get executed">
	//    3    6:invokespecial   #192 <Method void RuntimeException(String)>
	//    4    9:athrow          
	}

	public static Version versionFor(Class class1)
	{
		Version version1 = packageVersionFor(class1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #194 <Method Version packageVersionFor(Class)>
	//    2    4:astore_1        
		class1 = ((Class) (version1));
	//    3    5:aload_1         
	//    4    6:astore_0        
		if(version1 == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       15
			class1 = ((Class) (Version.unknownVersion()));
	//    7   11:invokestatic    #68  <Method Version Version.unknownVersion()>
	//    8   14:astore_0        
		return ((Version) (class1));
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	public Version version()
	{
		return _v;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field Version _v>
	//    2    4:areturn         
	}

	private static final Pattern V_SEP = Pattern.compile("[-_./;:]");
	private final Version _v;

	static 
	{
	//    0    0:ldc1            #12  <String "[-_./;:]">
	//    1    2:invokestatic    #18  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #20  <Field Pattern V_SEP>
	//*   3    8:return          
	}
}
