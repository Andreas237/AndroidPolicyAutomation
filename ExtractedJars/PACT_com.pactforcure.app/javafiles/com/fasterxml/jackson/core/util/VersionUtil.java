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
		Version version1;
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		version1 = null;
	//    2    4:aconst_null     
	//    3    5:astore_1        
		Version version2 = versionFor(((Object)this).getClass());
	//    4    6:aload_0         
	//    5    7:invokevirtual   #30  <Method Class Object.getClass()>
	//    6   10:invokestatic    #34  <Method Version versionFor(Class)>
	//    7   13:astore_2        
		version1 = version2;
	//    8   14:aload_2         
	//    9   15:astore_1        
_L2:
		Version version3 = version1;
	//   10   16:aload_1         
	//   11   17:astore_2        
		if(version1 == null)
	//*  12   18:aload_1         
	//*  13   19:ifnonnull       26
			version3 = Version.unknownVersion();
	//   14   22:invokestatic    #40  <Method Version Version.unknownVersion()>
	//   15   25:astore_2        
		_v = version3;
	//   16   26:aload_0         
	//   17   27:aload_2         
	//   18   28:putfield        #42  <Field Version _v>
		return;
	//   19   31:return          
		Exception exception;
		exception;
	//   20   32:astore_2        
		System.err.println((new StringBuilder()).append("ERROR: Failed to load Version information from ").append(((Object) (((Object)this).getClass()))).toString());
	//   21   33:getstatic       #48  <Field PrintStream System.err>
	//   22   36:new             #50  <Class StringBuilder>
	//   23   39:dup             
	//   24   40:invokespecial   #51  <Method void StringBuilder()>
	//   25   43:ldc1            #53  <String "ERROR: Failed to load Version information from ">
	//   26   45:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   27   48:aload_0         
	//   28   49:invokevirtual   #30  <Method Class Object.getClass()>
	//   29   52:invokevirtual   #60  <Method StringBuilder StringBuilder.append(Object)>
	//   30   55:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   31   58:invokevirtual   #70  <Method void PrintStream.println(String)>
		if(true) goto _L2; else goto _L1
	//   32   61:goto            16
_L1:
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
		classloader = ((ClassLoader) (classloader.getResourceAsStream((new StringBuilder()).append("META-INF/maven/").append(s.replaceAll("\\.", "/")).append("/").append(s1).append("/pom.properties").toString())));
	//    0    0:aload_0         
	//    1    1:new             #50  <Class StringBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #51  <Method void StringBuilder()>
	//    4    8:ldc1            #84  <String "META-INF/maven/">
	//    5   10:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//    6   13:aload_1         
	//    7   14:ldc1            #86  <String "\\.">
	//    8   16:ldc1            #88  <String "/">
	//    9   18:invokevirtual   #94  <Method String String.replaceAll(String, String)>
	//   10   21:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:ldc1            #88  <String "/">
	//   12   26:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   13   29:aload_2         
	//   14   30:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   15   33:ldc1            #96  <String "/pom.properties">
	//   16   35:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   17   38:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   18   41:invokevirtual   #102 <Method java.io.InputStream ClassLoader.getResourceAsStream(String)>
	//   19   44:astore_0        
		if(classloader == null)
			break MISSING_BLOCK_LABEL_99;
	//   20   45:aload_0         
	//   21   46:ifnull          99
		s = ((String) (new Properties()));
	//   22   49:new             #104 <Class Properties>
	//   23   52:dup             
	//   24   53:invokespecial   #105 <Method void Properties()>
	//   25   56:astore_1        
		((Properties) (s)).load(((java.io.InputStream) (classloader)));
	//   26   57:aload_1         
	//   27   58:aload_0         
	//   28   59:invokevirtual   #109 <Method void Properties.load(java.io.InputStream)>
		s1 = ((Properties) (s)).getProperty("version");
	//   29   62:aload_1         
	//   30   63:ldc1            #111 <String "version">
	//   31   65:invokevirtual   #115 <Method String Properties.getProperty(String)>
	//   32   68:astore_2        
		String s2 = ((Properties) (s)).getProperty("artifactId");
	//   33   69:aload_1         
	//   34   70:ldc1            #117 <String "artifactId">
	//   35   72:invokevirtual   #115 <Method String Properties.getProperty(String)>
	//   36   75:astore_3        
		s = ((String) (parseVersion(s1, ((Properties) (s)).getProperty("groupId"), s2)));
	//   37   76:aload_2         
	//   38   77:aload_1         
	//   39   78:ldc1            #119 <String "groupId">
	//   40   80:invokevirtual   #115 <Method String Properties.getProperty(String)>
	//   41   83:aload_3         
	//   42   84:invokestatic    #123 <Method Version parseVersion(String, String, String)>
	//   43   87:astore_1        
		_close(((Closeable) (classloader)));
	//   44   88:aload_0         
	//   45   89:invokestatic    #125 <Method void _close(Closeable)>
		return ((Version) (s));
	//   46   92:aload_1         
	//   47   93:areturn         
		s;
	//   48   94:astore_1        
		_close(((Closeable) (classloader)));
	//   49   95:aload_0         
	//   50   96:invokestatic    #125 <Method void _close(Closeable)>
		return Version.unknownVersion();
	//   51   99:invokestatic    #40  <Method Version Version.unknownVersion()>
	//   52  102:areturn         
		s;
	//   53  103:astore_1        
		_close(((Closeable) (classloader)));
	//   54  104:aload_0         
	//   55  105:invokestatic    #125 <Method void _close(Closeable)>
		throw s;
	//   56  108:aload_1         
	//   57  109:athrow          
	}

	public static Version packageVersionFor(Class class1)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		Class class2 = Class.forName((new StringBuilder()).append(class1.getPackage().getName()).append(".PackageVersion").toString(), true, class1.getClassLoader());
	//    2    2:new             #50  <Class StringBuilder>
	//    3    5:dup             
	//    4    6:invokespecial   #51  <Method void StringBuilder()>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #133 <Method Package Class.getPackage()>
	//    7   13:invokevirtual   #138 <Method String Package.getName()>
	//    8   16:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:ldc1            #140 <String ".PackageVersion">
	//   10   21:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   12   27:iconst_1        
	//   13   28:aload_0         
	//   14   29:invokevirtual   #144 <Method ClassLoader Class.getClassLoader()>
	//   15   32:invokestatic    #148 <Method Class Class.forName(String, boolean, ClassLoader)>
	//   16   35:astore_2        
		try
		{
			class1 = ((Class) (((Versioned)class2.newInstance()).version()));
	//   17   36:aload_2         
	//   18   37:invokevirtual   #152 <Method Object Class.newInstance()>
	//   19   40:checkcast       #154 <Class Versioned>
	//   20   43:invokeinterface #156 <Method Version Versioned.version()>
	//   21   48:astore_0        
		}
	//*  22   49:aload_0         
	//*  23   50:astore_1        
	//*  24   51:aload_0         
	//*  25   52:ifnonnull       59
	//*  26   55:invokestatic    #40  <Method Version Version.unknownVersion()>
	//*  27   58:astore_1        
	//*  28   59:aload_1         
	//*  29   60:areturn         
		// Misplaced declaration of an exception variable
		catch(Class class1)
	//*  30   61:astore_0        
		{
			try
			{
				throw new IllegalArgumentException((new StringBuilder()).append("Failed to get Versioned out of ").append(((Object) (class2))).toString());
	//   31   62:new             #158 <Class IllegalArgumentException>
	//   32   65:dup             
	//   33   66:new             #50  <Class StringBuilder>
	//   34   69:dup             
	//   35   70:invokespecial   #51  <Method void StringBuilder()>
	//   36   73:ldc1            #160 <String "Failed to get Versioned out of ">
	//   37   75:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   38   78:aload_2         
	//   39   79:invokevirtual   #60  <Method StringBuilder StringBuilder.append(Object)>
	//   40   82:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   41   85:invokespecial   #162 <Method void IllegalArgumentException(String)>
	//   42   88:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(Class class1)
	//*  43   89:astore_0        
			{
				class1 = ((Class) (obj));
	//   44   90:aload_1         
	//   45   91:astore_0        
			}
		}
		obj = ((Object) (class1));
		if(class1 == null)
			obj = ((Object) (Version.unknownVersion()));
		return ((Version) (obj));
	//*  46   92:goto            49
	}

	public static Version parseVersion(String s, String s1, String s2)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(s != null)
	//*   2    3:aload_0         
	//*   3    4:ifnull          98
		{
			s = s.trim();
	//    4    7:aload_0         
	//    5    8:invokevirtual   #167 <Method String String.trim()>
	//    6   11:astore_0        
			if(s.length() > 0)
	//*   7   12:aload_0         
	//*   8   13:invokevirtual   #171 <Method int String.length()>
	//*   9   16:ifle            98
			{
				s = ((String) (V_SEP.split(((CharSequence) (s)))));
	//   10   19:getstatic       #20  <Field Pattern V_SEP>
	//   11   22:aload_0         
	//   12   23:invokevirtual   #175 <Method String[] Pattern.split(CharSequence)>
	//   13   26:astore_0        
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
	//*  22   38:icmple          88
					i = parseVersionPart(((String) (s[1])));
	//   23   41:aload_0         
	//   24   42:iconst_1        
	//   25   43:aaload          
	//   26   44:invokestatic    #179 <Method int parseVersionPart(String)>
	//   27   47:istore_3        
				else
	//*  28   48:aload_0         
	//*  29   49:arraylength     
	//*  30   50:iconst_2        
	//*  31   51:icmple          62
	//*  32   54:aload_0         
	//*  33   55:iconst_2        
	//*  34   56:aaload          
	//*  35   57:invokestatic    #179 <Method int parseVersionPart(String)>
	//*  36   60:istore          4
	//*  37   62:aload_0         
	//*  38   63:arraylength     
	//*  39   64:iconst_3        
	//*  40   65:icmple          93
	//*  41   68:aload_0         
	//*  42   69:iconst_3        
	//*  43   70:aaload          
	//*  44   71:astore_0        
	//*  45   72:new             #36  <Class Version>
	//*  46   75:dup             
	//*  47   76:iload           5
	//*  48   78:iload_3         
	//*  49   79:iload           4
	//*  50   81:aload_0         
	//*  51   82:aload_1         
	//*  52   83:aload_2         
	//*  53   84:invokespecial   #182 <Method void Version(int, int, int, String, String, String)>
	//*  54   87:areturn         
					i = 0;
	//   55   88:iconst_0        
	//   56   89:istore_3        
				if(s.length > 2)
					j = parseVersionPart(((String) (s[2])));
				if(s.length > 3)
					s = ((String) (s[3]));
				else
	//*  57   90:goto            48
					s = null;
	//   58   93:aconst_null     
	//   59   94:astore_0        
				return new Version(k, i, j, s, s1, s2);
			}
		}
	//*  60   95:goto            72
		return Version.unknownVersion();
	//   61   98:invokestatic    #40  <Method Version Version.unknownVersion()>
	//   62  101:areturn         
	}

	protected static int parseVersionPart(String s)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int i = 0;
	//    2    2:iconst_0        
	//    3    3:istore_1        
		int k = s.length();
	//    4    4:aload_0         
	//    5    5:invokevirtual   #171 <Method int String.length()>
	//    6    8:istore_3        
		do
		{
			char c;
label0:
			{
				if(i < k)
	//*   7    9:iload_1         
	//*   8   10:iload_3         
	//*   9   11:icmpge          35
				{
					c = s.charAt(i);
	//   10   14:aload_0         
	//   11   15:iload_1         
	//   12   16:invokevirtual   #186 <Method char String.charAt(int)>
	//   13   19:istore          4
					if(c <= '9' && c >= '0')
						break label0;
	//   14   21:iload           4
	//   15   23:bipush          57
	//   16   25:icmpgt          35
	//   17   28:iload           4
	//   18   30:bipush          48
	//   19   32:icmpge          37
				}
				return j;
	//   20   35:iload_2         
	//   21   36:ireturn         
			}
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
	//    7   11:invokestatic    #40  <Method Version Version.unknownVersion()>
	//    8   14:astore_0        
		return ((Version) (class1));
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	public Version version()
	{
		return _v;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Version _v>
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
