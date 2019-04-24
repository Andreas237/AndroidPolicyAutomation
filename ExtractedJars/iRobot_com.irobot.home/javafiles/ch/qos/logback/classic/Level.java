// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic;

import java.io.Serializable;

public final class Level
	implements Serializable
{

	private Level(int i, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #94  <Method void Object()>
		levelInt = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #96  <Field int levelInt>
		levelStr = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #98  <Field String levelStr>
	//    8   14:return          
	}

	public static Level fromLocationAwareLoggerInteger(int i)
	{
		if(i != 0)
	//*   0    0:iload_0         
	//*   1    1:ifeq            77
		{
			if(i != 10)
	//*   2    4:iload_0         
	//*   3    5:bipush          10
	//*   4    7:icmpeq          73
			{
				if(i != 20)
	//*   5   10:iload_0         
	//*   6   11:bipush          20
	//*   7   13:icmpeq          69
				{
					if(i != 30)
	//*   8   16:iload_0         
	//*   9   17:bipush          30
	//*  10   19:icmpeq          65
					{
						if(i != 40)
	//*  11   22:iload_0         
	//*  12   23:bipush          40
	//*  13   25:icmpeq          61
						{
							StringBuilder stringbuilder = new StringBuilder();
	//   14   28:new             #102 <Class StringBuilder>
	//   15   31:dup             
	//   16   32:invokespecial   #103 <Method void StringBuilder()>
	//   17   35:astore_1        
							stringbuilder.append(i);
	//   18   36:aload_1         
	//   19   37:iload_0         
	//   20   38:invokevirtual   #107 <Method StringBuilder StringBuilder.append(int)>
	//   21   41:pop             
							stringbuilder.append(" not a valid level value");
	//   22   42:aload_1         
	//   23   43:ldc1            #109 <String " not a valid level value">
	//   24   45:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   25   48:pop             
							throw new IllegalArgumentException(stringbuilder.toString());
	//   26   49:new             #114 <Class IllegalArgumentException>
	//   27   52:dup             
	//   28   53:aload_1         
	//   29   54:invokevirtual   #118 <Method String StringBuilder.toString()>
	//   30   57:invokespecial   #121 <Method void IllegalArgumentException(String)>
	//   31   60:athrow          
						} else
						{
							return ERROR;
	//   32   61:getstatic       #76  <Field Level ERROR>
	//   33   64:areturn         
						}
					} else
					{
						return WARN;
	//   34   65:getstatic       #79  <Field Level WARN>
	//   35   68:areturn         
					}
				} else
				{
					return INFO;
	//   36   69:getstatic       #82  <Field Level INFO>
	//   37   72:areturn         
				}
			} else
			{
				return DEBUG;
	//   38   73:getstatic       #85  <Field Level DEBUG>
	//   39   76:areturn         
			}
		} else
		{
			return TRACE;
	//   40   77:getstatic       #88  <Field Level TRACE>
	//   41   80:areturn         
		}
	}

	private Object readResolve()
	{
		return ((Object) (toLevel(levelInt)));
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field int levelInt>
	//    2    4:invokestatic    #126 <Method Level toLevel(int)>
	//    3    7:areturn         
	}

	public static Level toLevel(int i)
	{
		return toLevel(i, DEBUG);
	//    0    0:iload_0         
	//    1    1:getstatic       #85  <Field Level DEBUG>
	//    2    4:invokestatic    #129 <Method Level toLevel(int, Level)>
	//    3    7:areturn         
	}

	public static Level toLevel(int i, Level level)
	{
		if(i != 0x80000000)
	//*   0    0:iload_0         
	//*   1    1:ldc1            #11  <Int 0x80000000>
	//*   2    3:icmpeq          72
		{
			if(i != 5000)
	//*   3    6:iload_0         
	//*   4    7:sipush          5000
	//*   5   10:icmpeq          68
			{
				if(i != 10000)
	//*   6   13:iload_0         
	//*   7   14:sipush          10000
	//*   8   17:icmpeq          64
				{
					if(i != 20000)
	//*   9   20:iload_0         
	//*  10   21:sipush          20000
	//*  11   24:icmpeq          60
					{
						if(i != 30000)
	//*  12   27:iload_0         
	//*  13   28:sipush          30000
	//*  14   31:icmpeq          56
						{
							if(i != 40000)
	//*  15   34:iload_0         
	//*  16   35:ldc1            #20  <Int 40000>
	//*  17   37:icmpeq          52
							{
								if(i != 0x7fffffff)
	//*  18   40:iload_0         
	//*  19   41:ldc1            #28  <Int 0x7fffffff>
	//*  20   43:icmpeq          48
									return level;
	//   21   46:aload_1         
	//   22   47:areturn         
								else
									return OFF;
	//   23   48:getstatic       #73  <Field Level OFF>
	//   24   51:areturn         
							} else
							{
								return ERROR;
	//   25   52:getstatic       #76  <Field Level ERROR>
	//   26   55:areturn         
							}
						} else
						{
							return WARN;
	//   27   56:getstatic       #79  <Field Level WARN>
	//   28   59:areturn         
						}
					} else
					{
						return INFO;
	//   29   60:getstatic       #82  <Field Level INFO>
	//   30   63:areturn         
					}
				} else
				{
					return DEBUG;
	//   31   64:getstatic       #85  <Field Level DEBUG>
	//   32   67:areturn         
				}
			} else
			{
				return TRACE;
	//   33   68:getstatic       #88  <Field Level TRACE>
	//   34   71:areturn         
			}
		} else
		{
			return ALL;
	//   35   72:getstatic       #91  <Field Level ALL>
	//   36   75:areturn         
		}
	}

	public static Level toLevel(String s)
	{
		return toLevel(s, DEBUG);
	//    0    0:aload_0         
	//    1    1:getstatic       #85  <Field Level DEBUG>
	//    2    4:invokestatic    #133 <Method Level toLevel(String, Level)>
	//    3    7:areturn         
	}

	public static Level toLevel(String s, Level level)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return level;
	//    2    4:aload_1         
	//    3    5:areturn         
		if(s.equalsIgnoreCase("ALL"))
	//*   4    6:aload_0         
	//*   5    7:ldc1            #89  <String "ALL">
	//*   6    9:invokevirtual   #139 <Method boolean String.equalsIgnoreCase(String)>
	//*   7   12:ifeq            19
			return ALL;
	//    8   15:getstatic       #91  <Field Level ALL>
	//    9   18:areturn         
		if(s.equalsIgnoreCase("TRACE"))
	//*  10   19:aload_0         
	//*  11   20:ldc1            #86  <String "TRACE">
	//*  12   22:invokevirtual   #139 <Method boolean String.equalsIgnoreCase(String)>
	//*  13   25:ifeq            32
			return TRACE;
	//   14   28:getstatic       #88  <Field Level TRACE>
	//   15   31:areturn         
		if(s.equalsIgnoreCase("DEBUG"))
	//*  16   32:aload_0         
	//*  17   33:ldc1            #83  <String "DEBUG">
	//*  18   35:invokevirtual   #139 <Method boolean String.equalsIgnoreCase(String)>
	//*  19   38:ifeq            45
			return DEBUG;
	//   20   41:getstatic       #85  <Field Level DEBUG>
	//   21   44:areturn         
		if(s.equalsIgnoreCase("INFO"))
	//*  22   45:aload_0         
	//*  23   46:ldc1            #80  <String "INFO">
	//*  24   48:invokevirtual   #139 <Method boolean String.equalsIgnoreCase(String)>
	//*  25   51:ifeq            58
			return INFO;
	//   26   54:getstatic       #82  <Field Level INFO>
	//   27   57:areturn         
		if(s.equalsIgnoreCase("WARN"))
	//*  28   58:aload_0         
	//*  29   59:ldc1            #77  <String "WARN">
	//*  30   61:invokevirtual   #139 <Method boolean String.equalsIgnoreCase(String)>
	//*  31   64:ifeq            71
			return WARN;
	//   32   67:getstatic       #79  <Field Level WARN>
	//   33   70:areturn         
		if(s.equalsIgnoreCase("ERROR"))
	//*  34   71:aload_0         
	//*  35   72:ldc1            #74  <String "ERROR">
	//*  36   74:invokevirtual   #139 <Method boolean String.equalsIgnoreCase(String)>
	//*  37   77:ifeq            84
			return ERROR;
	//   38   80:getstatic       #76  <Field Level ERROR>
	//   39   83:areturn         
		if(s.equalsIgnoreCase("OFF"))
	//*  40   84:aload_0         
	//*  41   85:ldc1            #67  <String "OFF">
	//*  42   87:invokevirtual   #139 <Method boolean String.equalsIgnoreCase(String)>
	//*  43   90:ifeq            97
			return OFF;
	//   44   93:getstatic       #73  <Field Level OFF>
	//   45   96:areturn         
		else
			return level;
	//   46   97:aload_1         
	//   47   98:areturn         
	}

	public static int toLocationAwareLoggerInteger(Level level)
	{
		if(level == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("null level parameter is not admitted");
	//    2    4:new             #114 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #143 <String "null level parameter is not admitted">
	//    5   10:invokespecial   #121 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		int i = level.toInt();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #147 <Method int toInt()>
	//    9   18:istore_1        
		if(i != 5000)
	//*  10   19:iload_1         
	//*  11   20:sipush          5000
	//*  12   23:icmpeq          98
		{
			if(i != 10000)
	//*  13   26:iload_1         
	//*  14   27:sipush          10000
	//*  15   30:icmpeq          95
			{
				if(i != 20000)
	//*  16   33:iload_1         
	//*  17   34:sipush          20000
	//*  18   37:icmpeq          92
				{
					if(i != 30000)
	//*  19   40:iload_1         
	//*  20   41:sipush          30000
	//*  21   44:icmpeq          89
					{
						if(i != 40000)
	//*  22   47:iload_1         
	//*  23   48:ldc1            #20  <Int 40000>
	//*  24   50:icmpeq          86
						{
							StringBuilder stringbuilder = new StringBuilder();
	//   25   53:new             #102 <Class StringBuilder>
	//   26   56:dup             
	//   27   57:invokespecial   #103 <Method void StringBuilder()>
	//   28   60:astore_2        
							stringbuilder.append(((Object) (level)));
	//   29   61:aload_2         
	//   30   62:aload_0         
	//   31   63:invokevirtual   #150 <Method StringBuilder StringBuilder.append(Object)>
	//   32   66:pop             
							stringbuilder.append(" not a valid level value");
	//   33   67:aload_2         
	//   34   68:ldc1            #109 <String " not a valid level value">
	//   35   70:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   36   73:pop             
							throw new IllegalArgumentException(stringbuilder.toString());
	//   37   74:new             #114 <Class IllegalArgumentException>
	//   38   77:dup             
	//   39   78:aload_2         
	//   40   79:invokevirtual   #118 <Method String StringBuilder.toString()>
	//   41   82:invokespecial   #121 <Method void IllegalArgumentException(String)>
	//   42   85:athrow          
						} else
						{
							return 40;
	//   43   86:bipush          40
	//   44   88:ireturn         
						}
					} else
					{
						return 30;
	//   45   89:bipush          30
	//   46   91:ireturn         
					}
				} else
				{
					return 20;
	//   47   92:bipush          20
	//   48   94:ireturn         
				}
			} else
			{
				return 10;
	//   49   95:bipush          10
	//   50   97:ireturn         
			}
		} else
		{
			return 0;
	//   51   98:iconst_0        
	//   52   99:ireturn         
		}
	}

	public static Level valueOf(String s)
	{
		return toLevel(s, DEBUG);
	//    0    0:aload_0         
	//    1    1:getstatic       #85  <Field Level DEBUG>
	//    2    4:invokestatic    #133 <Method Level toLevel(String, Level)>
	//    3    7:areturn         
	}

	public boolean isGreaterOrEqual(Level level)
	{
		return levelInt >= level.levelInt;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field int levelInt>
	//    2    4:aload_1         
	//    3    5:getfield        #96  <Field int levelInt>
	//    4    8:icmplt          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public int toInt()
	{
		return levelInt;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field int levelInt>
	//    2    4:ireturn         
	}

	public Integer toInteger()
	{
		int i = levelInt;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field int levelInt>
	//    2    4:istore_1        
		if(i != 0x80000000)
	//*   3    5:iload_1         
	//*   4    6:ldc1            #11  <Int 0x80000000>
	//*   5    8:icmpeq          134
		{
			if(i != 5000)
	//*   6   11:iload_1         
	//*   7   12:sipush          5000
	//*   8   15:icmpeq          130
			{
				if(i != 10000)
	//*   9   18:iload_1         
	//*  10   19:sipush          10000
	//*  11   22:icmpeq          126
				{
					if(i != 20000)
	//*  12   25:iload_1         
	//*  13   26:sipush          20000
	//*  14   29:icmpeq          122
					{
						if(i != 30000)
	//*  15   32:iload_1         
	//*  16   33:sipush          30000
	//*  17   36:icmpeq          118
						{
							if(i != 40000)
	//*  18   39:iload_1         
	//*  19   40:ldc1            #20  <Int 40000>
	//*  20   42:icmpeq          114
							{
								if(i != 0x7fffffff)
	//*  21   45:iload_1         
	//*  22   46:ldc1            #28  <Int 0x7fffffff>
	//*  23   48:icmpeq          110
								{
									StringBuilder stringbuilder = new StringBuilder();
	//   24   51:new             #102 <Class StringBuilder>
	//   25   54:dup             
	//   26   55:invokespecial   #103 <Method void StringBuilder()>
	//   27   58:astore_2        
									stringbuilder.append("Level ");
	//   28   59:aload_2         
	//   29   60:ldc1            #156 <String "Level ">
	//   30   62:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   31   65:pop             
									stringbuilder.append(levelStr);
	//   32   66:aload_2         
	//   33   67:aload_0         
	//   34   68:getfield        #98  <Field String levelStr>
	//   35   71:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   36   74:pop             
									stringbuilder.append(", ");
	//   37   75:aload_2         
	//   38   76:ldc1            #158 <String ", ">
	//   39   78:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   40   81:pop             
									stringbuilder.append(levelInt);
	//   41   82:aload_2         
	//   42   83:aload_0         
	//   43   84:getfield        #96  <Field int levelInt>
	//   44   87:invokevirtual   #107 <Method StringBuilder StringBuilder.append(int)>
	//   45   90:pop             
									stringbuilder.append(" is unknown.");
	//   46   91:aload_2         
	//   47   92:ldc1            #160 <String " is unknown.">
	//   48   94:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   49   97:pop             
									throw new IllegalStateException(stringbuilder.toString());
	//   50   98:new             #162 <Class IllegalStateException>
	//   51  101:dup             
	//   52  102:aload_2         
	//   53  103:invokevirtual   #118 <Method String StringBuilder.toString()>
	//   54  106:invokespecial   #163 <Method void IllegalStateException(String)>
	//   55  109:athrow          
								} else
								{
									return OFF_INTEGER;
	//   56  110:getstatic       #54  <Field Integer OFF_INTEGER>
	//   57  113:areturn         
								}
							} else
							{
								return ERROR_INTEGER;
	//   58  114:getstatic       #56  <Field Integer ERROR_INTEGER>
	//   59  117:areturn         
							}
						} else
						{
							return WARN_INTEGER;
	//   60  118:getstatic       #58  <Field Integer WARN_INTEGER>
	//   61  121:areturn         
						}
					} else
					{
						return INFO_INTEGER;
	//   62  122:getstatic       #60  <Field Integer INFO_INTEGER>
	//   63  125:areturn         
					}
				} else
				{
					return DEBUG_INTEGER;
	//   64  126:getstatic       #62  <Field Integer DEBUG_INTEGER>
	//   65  129:areturn         
				}
			} else
			{
				return TRACE_INTEGER;
	//   66  130:getstatic       #64  <Field Integer TRACE_INTEGER>
	//   67  133:areturn         
			}
		} else
		{
			return ALL_INTEGER;
	//   68  134:getstatic       #66  <Field Integer ALL_INTEGER>
	//   69  137:areturn         
		}
	}

	public String toString()
	{
		return levelStr;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field String levelStr>
	//    2    4:areturn         
	}

	public static final Level ALL = new Level(0x80000000, "ALL");
	public static final int ALL_INT = 0x80000000;
	public static final Integer ALL_INTEGER = Integer.valueOf(0x80000000);
	public static final Level DEBUG = new Level(10000, "DEBUG");
	public static final int DEBUG_INT = 10000;
	public static final Integer DEBUG_INTEGER = Integer.valueOf(10000);
	public static final Level ERROR = new Level(40000, "ERROR");
	public static final int ERROR_INT = 40000;
	public static final Integer ERROR_INTEGER = Integer.valueOf(40000);
	public static final Level INFO = new Level(20000, "INFO");
	public static final int INFO_INT = 20000;
	public static final Integer INFO_INTEGER = Integer.valueOf(20000);
	public static final Level OFF = new Level(0x7fffffff, "OFF");
	public static final int OFF_INT = 0x7fffffff;
	public static final Integer OFF_INTEGER = Integer.valueOf(0x7fffffff);
	public static final Level TRACE = new Level(5000, "TRACE");
	public static final int TRACE_INT = 5000;
	public static final Integer TRACE_INTEGER = Integer.valueOf(5000);
	public static final Level WARN = new Level(30000, "WARN");
	public static final int WARN_INT = 30000;
	public static final Integer WARN_INTEGER = Integer.valueOf(30000);
	private static final long serialVersionUID = 0xfcd34c67L;
	public final int levelInt;
	public final String levelStr;

	static 
	{
	//    0    0:ldc1            #28  <Int 0x7fffffff>
	//    1    2:invokestatic    #52  <Method Integer Integer.valueOf(int)>
	//    2    5:putstatic       #54  <Field Integer OFF_INTEGER>
	//    3    8:ldc1            #20  <Int 40000>
	//    4   10:invokestatic    #52  <Method Integer Integer.valueOf(int)>
	//    5   13:putstatic       #56  <Field Integer ERROR_INTEGER>
	//    6   16:sipush          30000
	//    7   19:invokestatic    #52  <Method Integer Integer.valueOf(int)>
	//    8   22:putstatic       #58  <Field Integer WARN_INTEGER>
	//    9   25:sipush          20000
	//   10   28:invokestatic    #52  <Method Integer Integer.valueOf(int)>
	//   11   31:putstatic       #60  <Field Integer INFO_INTEGER>
	//   12   34:sipush          10000
	//   13   37:invokestatic    #52  <Method Integer Integer.valueOf(int)>
	//   14   40:putstatic       #62  <Field Integer DEBUG_INTEGER>
	//   15   43:sipush          5000
	//   16   46:invokestatic    #52  <Method Integer Integer.valueOf(int)>
	//   17   49:putstatic       #64  <Field Integer TRACE_INTEGER>
	//   18   52:ldc1            #11  <Int 0x80000000>
	//   19   54:invokestatic    #52  <Method Integer Integer.valueOf(int)>
	//   20   57:putstatic       #66  <Field Integer ALL_INTEGER>
	//   21   60:new             #2   <Class Level>
	//   22   63:dup             
	//   23   64:ldc1            #28  <Int 0x7fffffff>
	//   24   66:ldc1            #67  <String "OFF">
	//   25   68:invokespecial   #71  <Method void Level(int, String)>
	//   26   71:putstatic       #73  <Field Level OFF>
	//   27   74:new             #2   <Class Level>
	//   28   77:dup             
	//   29   78:ldc1            #20  <Int 40000>
	//   30   80:ldc1            #74  <String "ERROR">
	//   31   82:invokespecial   #71  <Method void Level(int, String)>
	//   32   85:putstatic       #76  <Field Level ERROR>
	//   33   88:new             #2   <Class Level>
	//   34   91:dup             
	//   35   92:sipush          30000
	//   36   95:ldc1            #77  <String "WARN">
	//   37   97:invokespecial   #71  <Method void Level(int, String)>
	//   38  100:putstatic       #79  <Field Level WARN>
	//   39  103:new             #2   <Class Level>
	//   40  106:dup             
	//   41  107:sipush          20000
	//   42  110:ldc1            #80  <String "INFO">
	//   43  112:invokespecial   #71  <Method void Level(int, String)>
	//   44  115:putstatic       #82  <Field Level INFO>
	//   45  118:new             #2   <Class Level>
	//   46  121:dup             
	//   47  122:sipush          10000
	//   48  125:ldc1            #83  <String "DEBUG">
	//   49  127:invokespecial   #71  <Method void Level(int, String)>
	//   50  130:putstatic       #85  <Field Level DEBUG>
	//   51  133:new             #2   <Class Level>
	//   52  136:dup             
	//   53  137:sipush          5000
	//   54  140:ldc1            #86  <String "TRACE">
	//   55  142:invokespecial   #71  <Method void Level(int, String)>
	//   56  145:putstatic       #88  <Field Level TRACE>
	//   57  148:new             #2   <Class Level>
	//   58  151:dup             
	//   59  152:ldc1            #11  <Int 0x80000000>
	//   60  154:ldc1            #89  <String "ALL">
	//   61  156:invokespecial   #71  <Method void Level(int, String)>
	//   62  159:putstatic       #91  <Field Level ALL>
	//*  63  162:return          
	}
}
