// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.util;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;

public class LevelToSyslogSeverity
{

	public LevelToSyslogSeverity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static int convert(ILoggingEvent iloggingevent)
	{
		iloggingevent = ((ILoggingEvent) (iloggingevent.getLevel()));
	//    0    0:aload_0         
	//    1    1:invokeinterface #17  <Method Level ILoggingEvent.getLevel()>
	//    2    6:astore_0        
		int i = ((Level) (iloggingevent)).levelInt;
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field int Level.levelInt>
	//    5   11:istore_1        
		if(i != 5000 && i != 10000)
	//*   6   12:iload_1         
	//*   7   13:sipush          5000
	//*   8   16:icmpeq          93
	//*   9   19:iload_1         
	//*  10   20:sipush          10000
	//*  11   23:icmpeq          93
		{
			if(i != 20000)
	//*  12   26:iload_1         
	//*  13   27:sipush          20000
	//*  14   30:icmpeq          90
			{
				if(i != 30000)
	//*  15   33:iload_1         
	//*  16   34:sipush          30000
	//*  17   37:icmpeq          88
				{
					if(i != 40000)
	//*  18   40:iload_1         
	//*  19   41:ldc1            #24  <Int 40000>
	//*  20   43:icmpeq          86
					{
						StringBuilder stringbuilder = new StringBuilder();
	//   21   46:new             #26  <Class StringBuilder>
	//   22   49:dup             
	//   23   50:invokespecial   #27  <Method void StringBuilder()>
	//   24   53:astore_2        
						stringbuilder.append("Level ");
	//   25   54:aload_2         
	//   26   55:ldc1            #29  <String "Level ">
	//   27   57:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   28   60:pop             
						stringbuilder.append(((Object) (iloggingevent)));
	//   29   61:aload_2         
	//   30   62:aload_0         
	//   31   63:invokevirtual   #36  <Method StringBuilder StringBuilder.append(Object)>
	//   32   66:pop             
						stringbuilder.append(" is not a valid level for a printing method");
	//   33   67:aload_2         
	//   34   68:ldc1            #38  <String " is not a valid level for a printing method">
	//   35   70:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   36   73:pop             
						throw new IllegalArgumentException(stringbuilder.toString());
	//   37   74:new             #40  <Class IllegalArgumentException>
	//   38   77:dup             
	//   39   78:aload_2         
	//   40   79:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   41   82:invokespecial   #47  <Method void IllegalArgumentException(String)>
	//   42   85:athrow          
					} else
					{
						return 3;
	//   43   86:iconst_3        
	//   44   87:ireturn         
					}
				} else
				{
					return 4;
	//   45   88:iconst_4        
	//   46   89:ireturn         
				}
			} else
			{
				return 6;
	//   47   90:bipush          6
	//   48   92:ireturn         
			}
		} else
		{
			return 7;
	//   49   93:bipush          7
	//   50   95:ireturn         
		}
	}
}
