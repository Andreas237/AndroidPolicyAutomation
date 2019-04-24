// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.jul;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;

public class JULHelper
{

	public JULHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	public static java.util.logging.Level asJULLevel(Level level)
	{
		if(level == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("Unexpected level [null]");
	//    2    4:new             #14  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #16  <String "Unexpected level [null]">
	//    5   10:invokespecial   #19  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		int i = level.levelInt;
	//    7   14:aload_0         
	//    8   15:getfield        #25  <Field int Level.levelInt>
	//    9   18:istore_1        
		if(i != 0x80000000)
	//*  10   19:iload_1         
	//*  11   20:ldc1            #26  <Int 0x80000000>
	//*  12   22:icmpeq          129
		{
			if(i != 5000)
	//*  13   25:iload_1         
	//*  14   26:sipush          5000
	//*  15   29:icmpeq          125
			{
				if(i != 10000)
	//*  16   32:iload_1         
	//*  17   33:sipush          10000
	//*  18   36:icmpeq          121
				{
					if(i != 20000)
	//*  19   39:iload_1         
	//*  20   40:sipush          20000
	//*  21   43:icmpeq          117
					{
						if(i != 30000)
	//*  22   46:iload_1         
	//*  23   47:sipush          30000
	//*  24   50:icmpeq          113
						{
							if(i != 40000)
	//*  25   53:iload_1         
	//*  26   54:ldc1            #27  <Int 40000>
	//*  27   56:icmpeq          109
							{
								if(i != 0x7fffffff)
	//*  28   59:iload_1         
	//*  29   60:ldc1            #28  <Int 0x7fffffff>
	//*  30   62:icmpeq          105
								{
									StringBuilder stringbuilder = new StringBuilder();
	//   31   65:new             #30  <Class StringBuilder>
	//   32   68:dup             
	//   33   69:invokespecial   #31  <Method void StringBuilder()>
	//   34   72:astore_2        
									stringbuilder.append("Unexpected level [");
	//   35   73:aload_2         
	//   36   74:ldc1            #33  <String "Unexpected level [">
	//   37   76:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   38   79:pop             
									stringbuilder.append(((Object) (level)));
	//   39   80:aload_2         
	//   40   81:aload_0         
	//   41   82:invokevirtual   #40  <Method StringBuilder StringBuilder.append(Object)>
	//   42   85:pop             
									stringbuilder.append("]");
	//   43   86:aload_2         
	//   44   87:ldc1            #42  <String "]">
	//   45   89:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   46   92:pop             
									throw new IllegalArgumentException(stringbuilder.toString());
	//   47   93:new             #14  <Class IllegalArgumentException>
	//   48   96:dup             
	//   49   97:aload_2         
	//   50   98:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   51  101:invokespecial   #19  <Method void IllegalArgumentException(String)>
	//   52  104:athrow          
								} else
								{
									return java.util.logging.Level.OFF;
	//   53  105:getstatic       #52  <Field java.util.logging.Level java.util.logging.Level.OFF>
	//   54  108:areturn         
								}
							} else
							{
								return java.util.logging.Level.SEVERE;
	//   55  109:getstatic       #55  <Field java.util.logging.Level java.util.logging.Level.SEVERE>
	//   56  112:areturn         
							}
						} else
						{
							return java.util.logging.Level.WARNING;
	//   57  113:getstatic       #58  <Field java.util.logging.Level java.util.logging.Level.WARNING>
	//   58  116:areturn         
						}
					} else
					{
						return java.util.logging.Level.INFO;
	//   59  117:getstatic       #61  <Field java.util.logging.Level java.util.logging.Level.INFO>
	//   60  120:areturn         
					}
				} else
				{
					return java.util.logging.Level.FINE;
	//   61  121:getstatic       #64  <Field java.util.logging.Level java.util.logging.Level.FINE>
	//   62  124:areturn         
				}
			} else
			{
				return java.util.logging.Level.FINEST;
	//   63  125:getstatic       #67  <Field java.util.logging.Level java.util.logging.Level.FINEST>
	//   64  128:areturn         
			}
		} else
		{
			return java.util.logging.Level.ALL;
	//   65  129:getstatic       #70  <Field java.util.logging.Level java.util.logging.Level.ALL>
	//   66  132:areturn         
		}
	}

	public static java.util.logging.Logger asJULLogger(Logger logger)
	{
		return asJULLogger(logger.getName());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #77  <Method String Logger.getName()>
	//    2    4:invokestatic    #80  <Method java.util.logging.Logger asJULLogger(String)>
	//    3    7:areturn         
	}

	public static java.util.logging.Logger asJULLogger(String s)
	{
		return java.util.logging.Logger.getLogger(asJULLoggerName(s));
	//    0    0:aload_0         
	//    1    1:invokestatic    #84  <Method String asJULLoggerName(String)>
	//    2    4:invokestatic    #89  <Method java.util.logging.Logger java.util.logging.Logger.getLogger(String)>
	//    3    7:areturn         
	}

	public static String asJULLoggerName(String s)
	{
		String s1 = s;
	//    0    0:aload_0         
	//    1    1:astore_1        
		if("ROOT".equals(((Object) (s))))
	//*   2    2:ldc1            #91  <String "ROOT">
	//*   3    4:aload_0         
	//*   4    5:invokevirtual   #97  <Method boolean String.equals(Object)>
	//*   5    8:ifeq            14
			s1 = "";
	//    6   11:ldc1            #99  <String "">
	//    7   13:astore_1        
		return s1;
	//    8   14:aload_1         
	//    9   15:areturn         
	}

	public static final boolean isRegularNonRootLogger(java.util.logging.Logger logger)
	{
		if(logger == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		else
			return logger.getName().equals("") ^ true;
	//    4    6:aload_0         
	//    5    7:invokevirtual   #102 <Method String java.util.logging.Logger.getName()>
	//    6   10:ldc1            #99  <String "">
	//    7   12:invokevirtual   #97  <Method boolean String.equals(Object)>
	//    8   15:iconst_1        
	//    9   16:ixor            
	//   10   17:ireturn         
	}

	public static final boolean isRoot(java.util.logging.Logger logger)
	{
		if(logger == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		else
			return logger.getName().equals("");
	//    4    6:aload_0         
	//    5    7:invokevirtual   #102 <Method String java.util.logging.Logger.getName()>
	//    6   10:ldc1            #99  <String "">
	//    7   12:invokevirtual   #97  <Method boolean String.equals(Object)>
	//    8   15:ireturn         
	}
}
