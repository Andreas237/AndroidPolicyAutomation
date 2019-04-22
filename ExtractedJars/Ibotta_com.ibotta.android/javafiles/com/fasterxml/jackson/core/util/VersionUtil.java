// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.Versioned;
import java.lang.reflect.Constructor;
import java.util.regex.Pattern;

public class VersionUtil
{

	public static Version packageVersionFor(Class class1)
	{
		Object obj;
		obj = ((Object) (new StringBuilder()));
	//    0    0:new             #25  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (obj)).append(class1.getPackage().getName());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #34  <Method Package Class.getPackage()>
	//    7   13:invokevirtual   #40  <Method String Package.getName()>
	//    8   16:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		((StringBuilder) (obj)).append(".PackageVersion");
	//   10   20:aload_1         
	//   11   21:ldc1            #46  <String ".PackageVersion">
	//   12   23:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		obj = ((Object) (Class.forName(((StringBuilder) (obj)).toString(), true, class1.getClassLoader())));
	//   14   27:aload_1         
	//   15   28:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   16   31:iconst_1        
	//   17   32:aload_0         
	//   18   33:invokevirtual   #53  <Method ClassLoader Class.getClassLoader()>
	//   19   36:invokestatic    #57  <Method Class Class.forName(String, boolean, ClassLoader)>
	//   20   39:astore_1        
		try
		{
			class1 = ((Class) (((Versioned)((Class) (obj)).getDeclaredConstructor(new Class[0]).newInstance(new Object[0])).version()));
	//   21   40:aload_1         
	//   22   41:iconst_0        
	//   23   42:anewarray       Class[]
	//   24   45:invokevirtual   #61  <Method Constructor Class.getDeclaredConstructor(Class[])>
	//   25   48:iconst_0        
	//   26   49:anewarray       Object[]
	//   27   52:invokevirtual   #67  <Method Object Constructor.newInstance(Object[])>
	//   28   55:checkcast       #69  <Class Versioned>
	//   29   58:invokeinterface #73  <Method Version Versioned.version()>
	//   30   63:astore_0        
		}
	//*  31   64:goto            102
	//*  32   67:new             #25  <Class StringBuilder>
	//*  33   70:dup             
	//*  34   71:invokespecial   #28  <Method void StringBuilder()>
	//*  35   74:astore_0        
	//*  36   75:aload_0         
	//*  37   76:ldc1            #75  <String "Failed to get Versioned out of ">
	//*  38   78:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//*  39   81:pop             
	//*  40   82:aload_0         
	//*  41   83:aload_1         
	//*  42   84:invokevirtual   #78  <Method StringBuilder StringBuilder.append(Object)>
	//*  43   87:pop             
	//*  44   88:new             #80  <Class IllegalArgumentException>
	//*  45   91:dup             
	//*  46   92:aload_0         
	//*  47   93:invokevirtual   #49  <Method String StringBuilder.toString()>
	//*  48   96:invokespecial   #83  <Method void IllegalArgumentException(String)>
	//*  49   99:athrow          
	//*  50  100:aconst_null     
	//*  51  101:astore_0        
	//*  52  102:aload_0         
	//*  53  103:astore_1        
	//*  54  104:aload_0         
	//*  55  105:ifnonnull       112
	//*  56  108:invokestatic    #88  <Method Version Version.unknownVersion()>
	//*  57  111:astore_1        
	//*  58  112:aload_1         
	//*  59  113:areturn         
	//*  60  114:astore_0        
	//*  61  115:goto            100
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
	//*  62  118:astore_0        
	//*  63  119:goto            67
	}

	public static Version parseVersion(String s, String s1, String s2)
	{
		if(s != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          101
		{
			s = s.trim();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #97  <Method String String.trim()>
	//    4    8:astore_0        
			if(s.length() > 0)
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #101 <Method int String.length()>
	//*   7   13:ifle            101
			{
				s = ((String) (V_SEP.split(((CharSequence) (s)))));
	//    8   16:getstatic       #18  <Field Pattern V_SEP>
	//    9   19:aload_0         
	//   10   20:invokevirtual   #105 <Method String[] Pattern.split(CharSequence)>
	//   11   23:astore_0        
				int k = parseVersionPart(((String) (s[0])));
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:aaload          
	//   15   27:invokestatic    #109 <Method int parseVersionPart(String)>
	//   16   30:istore          5
				int i;
				if(s.length > 1)
	//*  17   32:aload_0         
	//*  18   33:arraylength     
	//*  19   34:iconst_1        
	//*  20   35:icmple          48
					i = parseVersionPart(((String) (s[1])));
	//   21   38:aload_0         
	//   22   39:iconst_1        
	//   23   40:aaload          
	//   24   41:invokestatic    #109 <Method int parseVersionPart(String)>
	//   25   44:istore_3        
				else
	//*  26   45:goto            50
					i = 0;
	//   27   48:iconst_0        
	//   28   49:istore_3        
				int j;
				if(s.length > 2)
	//*  29   50:aload_0         
	//*  30   51:arraylength     
	//*  31   52:iconst_2        
	//*  32   53:icmple          67
					j = parseVersionPart(((String) (s[2])));
	//   33   56:aload_0         
	//   34   57:iconst_2        
	//   35   58:aaload          
	//   36   59:invokestatic    #109 <Method int parseVersionPart(String)>
	//   37   62:istore          4
				else
	//*  38   64:goto            70
					j = 0;
	//   39   67:iconst_0        
	//   40   68:istore          4
				if(s.length > 3)
	//*  41   70:aload_0         
	//*  42   71:arraylength     
	//*  43   72:iconst_3        
	//*  44   73:icmple          83
					s = ((String) (s[3]));
	//   45   76:aload_0         
	//   46   77:iconst_3        
	//   47   78:aaload          
	//   48   79:astore_0        
				else
	//*  49   80:goto            85
					s = null;
	//   50   83:aconst_null     
	//   51   84:astore_0        
				return new Version(k, i, j, s, s1, s2);
	//   52   85:new             #85  <Class Version>
	//   53   88:dup             
	//   54   89:iload           5
	//   55   91:iload_3         
	//   56   92:iload           4
	//   57   94:aload_0         
	//   58   95:aload_1         
	//   59   96:aload_2         
	//   60   97:invokespecial   #112 <Method void Version(int, int, int, String, String, String)>
	//   61  100:areturn         
			}
		}
		return Version.unknownVersion();
	//   62  101:invokestatic    #88  <Method Version Version.unknownVersion()>
	//   63  104:areturn         
	}

	protected static int parseVersionPart(String s)
	{
		int k = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #101 <Method int String.length()>
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
	//   12   16:invokevirtual   #116 <Method char String.charAt(int)>
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
	//    0    0:new             #119 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #121 <String "Internal error: this code path should never get executed">
	//    3    6:invokespecial   #122 <Method void RuntimeException(String)>
	//    4    9:athrow          
	}

	public static Version versionFor(Class class1)
	{
		Version version = packageVersionFor(class1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #125 <Method Version packageVersionFor(Class)>
	//    2    4:astore_1        
		class1 = ((Class) (version));
	//    3    5:aload_1         
	//    4    6:astore_0        
		if(version == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       15
			class1 = ((Class) (Version.unknownVersion()));
	//    7   11:invokestatic    #88  <Method Version Version.unknownVersion()>
	//    8   14:astore_0        
		return ((Version) (class1));
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	private static final Pattern V_SEP = Pattern.compile("[-_./;:]");

	static 
	{
	//    0    0:ldc1            #10  <String "[-_./;:]">
	//    1    2:invokestatic    #16  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #18  <Field Pattern V_SEP>
	//*   3    8:return          
	}
}
