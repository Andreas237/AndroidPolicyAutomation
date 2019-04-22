// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.utilities;

import com.firebase.client.Logger;
import java.io.PrintStream;
import java.util.*;

public class DefaultLogger
	implements Logger
{

	public DefaultLogger(com.firebase.client.Logger.Level level, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		if(list != null)
	//*   2    4:aload_2         
	//*   3    5:ifnull          23
			enabledComponents = ((Set) (new HashSet(((java.util.Collection) (list)))));
	//    4    8:aload_0         
	//    5    9:new             #20  <Class HashSet>
	//    6   12:dup             
	//    7   13:aload_2         
	//    8   14:invokespecial   #23  <Method void HashSet(java.util.Collection)>
	//    9   17:putfield        #25  <Field Set enabledComponents>
		else
	//*  10   20:goto            28
			enabledComponents = null;
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:putfield        #25  <Field Set enabledComponents>
		minLevel = level;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:putfield        #27  <Field com.firebase.client.Logger$Level minLevel>
	//   17   33:return          
	}

	protected String buildLogMessage(com.firebase.client.Logger.Level level, String s, String s1, long l)
	{
		Date date = new Date(l);
	//    0    0:new             #34  <Class Date>
	//    1    3:dup             
	//    2    4:lload           4
	//    3    6:invokespecial   #37  <Method void Date(long)>
	//    4    9:astore          6
		StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #39  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #40  <Method void StringBuilder()>
	//    8   18:astore          7
		stringbuilder.append(date.toString());
	//    9   20:aload           7
	//   10   22:aload           6
	//   11   24:invokevirtual   #44  <Method String Date.toString()>
	//   12   27:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   13   30:pop             
		stringbuilder.append(" ");
	//   14   31:aload           7
	//   15   33:ldc1            #50  <String " ">
	//   16   35:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   17   38:pop             
		stringbuilder.append("[");
	//   18   39:aload           7
	//   19   41:ldc1            #52  <String "[">
	//   20   43:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   21   46:pop             
		stringbuilder.append(((Object) (level)));
	//   22   47:aload           7
	//   23   49:aload_1         
	//   24   50:invokevirtual   #55  <Method StringBuilder StringBuilder.append(Object)>
	//   25   53:pop             
		stringbuilder.append("] ");
	//   26   54:aload           7
	//   27   56:ldc1            #57  <String "] ">
	//   28   58:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   29   61:pop             
		stringbuilder.append(s);
	//   30   62:aload           7
	//   31   64:aload_2         
	//   32   65:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   33   68:pop             
		stringbuilder.append(": ");
	//   34   69:aload           7
	//   35   71:ldc1            #59  <String ": ">
	//   36   73:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   37   76:pop             
		stringbuilder.append(s1);
	//   38   77:aload           7
	//   39   79:aload_3         
	//   40   80:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   41   83:pop             
		return stringbuilder.toString();
	//   42   84:aload           7
	//   43   86:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   44   89:areturn         
	}

	protected void debug(String s, String s1)
	{
		System.out.println(s1);
	//    0    0:getstatic       #68  <Field PrintStream System.out>
	//    1    3:aload_2         
	//    2    4:invokevirtual   #74  <Method void PrintStream.println(String)>
	//    3    7:return          
	}

	protected void error(String s, String s1)
	{
		System.err.println(s1);
	//    0    0:getstatic       #78  <Field PrintStream System.err>
	//    1    3:aload_2         
	//    2    4:invokevirtual   #74  <Method void PrintStream.println(String)>
	//    3    7:return          
	}

	public com.firebase.client.Logger.Level getLogLevel()
	{
		return minLevel;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field com.firebase.client.Logger$Level minLevel>
	//    2    4:areturn         
	}

	protected void info(String s, String s1)
	{
		System.out.println(s1);
	//    0    0:getstatic       #68  <Field PrintStream System.out>
	//    1    3:aload_2         
	//    2    4:invokevirtual   #74  <Method void PrintStream.println(String)>
	//    3    7:return          
	}

	public void onLogMessage(com.firebase.client.Logger.Level level, String s, String s1, long l)
	{
		if(shouldLog(level, s))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:aload_2         
	//*   3    3:invokevirtual   #87  <Method boolean shouldLog(com.firebase.client.Logger$Level, String)>
	//*   4    6:ifeq            93
		{
			s1 = buildLogMessage(level, s, s1, l);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:lload           4
	//   10   15:invokevirtual   #89  <Method String buildLogMessage(com.firebase.client.Logger$Level, String, String, long)>
	//   11   18:astore_3        
			static class _cls1
			{

				static final int $SwitchMap$com$firebase$client$Logger$Level[];

				static 
				{
					$SwitchMap$com$firebase$client$Logger$Level = new int[com.firebase.client.Logger.Level.values().length];
				//    0    0:invokestatic    #18  <Method com.firebase.client.Logger$Level[] com.firebase.client.Logger$Level.values()>
				//    1    3:arraylength     
				//    2    4:newarray        int[]
				//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$firebase$client$Logger$Level>
					try
					{
						$SwitchMap$com$firebase$client$Logger$Level[com.firebase.client.Logger.Level.ERROR.ordinal()] = 1;
				//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$firebase$client$Logger$Level>
				//    5   12:getstatic       #24  <Field com.firebase.client.Logger$Level com.firebase.client.Logger$Level.ERROR>
				//    6   15:invokevirtual   #28  <Method int com.firebase.client.Logger$Level.ordinal()>
				//    7   18:iconst_1        
				//    8   19:iastore         
					}
				//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$firebase$client$Logger$Level>
				//*  10   23:getstatic       #31  <Field com.firebase.client.Logger$Level com.firebase.client.Logger$Level.WARN>
				//*  11   26:invokevirtual   #28  <Method int com.firebase.client.Logger$Level.ordinal()>
				//*  12   29:iconst_2        
				//*  13   30:iastore         
				//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$firebase$client$Logger$Level>
				//*  15   34:getstatic       #34  <Field com.firebase.client.Logger$Level com.firebase.client.Logger$Level.INFO>
				//*  16   37:invokevirtual   #28  <Method int com.firebase.client.Logger$Level.ordinal()>
				//*  17   40:iconst_3        
				//*  18   41:iastore         
				//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$firebase$client$Logger$Level>
				//*  20   45:getstatic       #37  <Field com.firebase.client.Logger$Level com.firebase.client.Logger$Level.DEBUG>
				//*  21   48:invokevirtual   #28  <Method int com.firebase.client.Logger$Level.ordinal()>
				//*  22   51:iconst_4        
				//*  23   52:iastore         
				//*  24   53:return          
					catch(NoSuchFieldError nosuchfielderror) { }
				//   25   54:astore_0        
					try
					{
						$SwitchMap$com$firebase$client$Logger$Level[com.firebase.client.Logger.Level.WARN.ordinal()] = 2;
					}
				//*  26   55:goto            20
					catch(NoSuchFieldError nosuchfielderror1) { }
				//   27   58:astore_0        
					try
					{
						$SwitchMap$com$firebase$client$Logger$Level[com.firebase.client.Logger.Level.INFO.ordinal()] = 3;
					}
				//*  28   59:goto            31
					catch(NoSuchFieldError nosuchfielderror2) { }
				//   29   62:astore_0        
					try
					{
						$SwitchMap$com$firebase$client$Logger$Level[com.firebase.client.Logger.Level.DEBUG.ordinal()] = 4;
					}
				//*  30   63:goto            42
					catch(NoSuchFieldError nosuchfielderror3) { }
				//   31   66:astore_0        
				//*  32   67:return          
				}
			}

			switch(_cls1..SwitchMap.com.firebase.client.Logger.Level[level.ordinal()])
	//*  12   19:getstatic       #93  <Field int[] DefaultLogger$1.$SwitchMap$com$firebase$client$Logger$Level>
	//*  13   22:aload_1         
	//*  14   23:invokevirtual   #99  <Method int com.firebase.client.Logger$Level.ordinal()>
	//*  15   26:iaload          
			{
	//*  16   27:tableswitch     1 4: default 56
	//	               1 87
	//	               2 80
	//	               3 73
	//	               4 66
			default:
				throw new RuntimeException("Should not reach here!");
	//   17   56:new             #101 <Class RuntimeException>
	//   18   59:dup             
	//   19   60:ldc1            #103 <String "Should not reach here!">
	//   20   62:invokespecial   #105 <Method void RuntimeException(String)>
	//   21   65:athrow          

			case 4: // '\004'
				debug(s, s1);
	//   22   66:aload_0         
	//   23   67:aload_2         
	//   24   68:aload_3         
	//   25   69:invokevirtual   #107 <Method void debug(String, String)>
				return;
	//   26   72:return          

			case 3: // '\003'
				info(s, s1);
	//   27   73:aload_0         
	//   28   74:aload_2         
	//   29   75:aload_3         
	//   30   76:invokevirtual   #109 <Method void info(String, String)>
				return;
	//   31   79:return          

			case 2: // '\002'
				warn(s, s1);
	//   32   80:aload_0         
	//   33   81:aload_2         
	//   34   82:aload_3         
	//   35   83:invokevirtual   #112 <Method void warn(String, String)>
				return;
	//   36   86:return          

			case 1: // '\001'
				error(s, s1);
	//   37   87:aload_0         
	//   38   88:aload_2         
	//   39   89:aload_3         
	//   40   90:invokevirtual   #114 <Method void error(String, String)>
				break;
			}
		}
	//   41   93:return          
	}

	protected boolean shouldLog(com.firebase.client.Logger.Level level, String s)
	{
		return level.ordinal() >= minLevel.ordinal() && (enabledComponents == null || level.ordinal() > com.firebase.client.Logger.Level.DEBUG.ordinal() || enabledComponents.contains(((Object) (s))));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #99  <Method int com.firebase.client.Logger$Level.ordinal()>
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field com.firebase.client.Logger$Level minLevel>
	//    4    8:invokevirtual   #99  <Method int com.firebase.client.Logger$Level.ordinal()>
	//    5   11:icmplt          49
	//    6   14:aload_0         
	//    7   15:getfield        #25  <Field Set enabledComponents>
	//    8   18:ifnull          47
	//    9   21:aload_1         
	//   10   22:invokevirtual   #99  <Method int com.firebase.client.Logger$Level.ordinal()>
	//   11   25:getstatic       #117 <Field com.firebase.client.Logger$Level com.firebase.client.Logger$Level.DEBUG>
	//   12   28:invokevirtual   #99  <Method int com.firebase.client.Logger$Level.ordinal()>
	//   13   31:icmpgt          47
	//   14   34:aload_0         
	//   15   35:getfield        #25  <Field Set enabledComponents>
	//   16   38:aload_2         
	//   17   39:invokeinterface #123 <Method boolean Set.contains(Object)>
	//   18   44:ifeq            49
	//   19   47:iconst_1        
	//   20   48:ireturn         
	//   21   49:iconst_0        
	//   22   50:ireturn         
	}

	protected void warn(String s, String s1)
	{
		System.out.println(s1);
	//    0    0:getstatic       #68  <Field PrintStream System.out>
	//    1    3:aload_2         
	//    2    4:invokevirtual   #74  <Method void PrintStream.println(String)>
	//    3    7:return          
	}

	private final Set enabledComponents;
	private final com.firebase.client.Logger.Level minLevel;
}
