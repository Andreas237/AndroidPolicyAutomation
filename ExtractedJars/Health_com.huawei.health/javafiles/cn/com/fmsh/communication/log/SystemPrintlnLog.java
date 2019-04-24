// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.log;

import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.Level;
import java.io.PrintStream;

public class SystemPrintlnLog
	implements FMLog
{

	public SystemPrintlnLog()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		level = Level.DEBUG;
	//    2    4:aload_0         
	//    3    5:getstatic       #19  <Field Level Level.DEBUG>
	//    4    8:putfield        #21  <Field Level level>
	//    5   11:return          
	}

	public void debug(String s, String s1)
	{
		if(level.getId() <= Level.DEBUG.getId())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Level level>
	//*   2    4:invokevirtual   #28  <Method int Level.getId()>
	//*   3    7:getstatic       #19  <Field Level Level.DEBUG>
	//*   4   10:invokevirtual   #28  <Method int Level.getId()>
	//*   5   13:icmpgt          47
			System.out.println((new StringBuilder("DEBUG--")).append(s).append(" ").append(s1).toString());
	//    6   16:getstatic       #34  <Field PrintStream System.out>
	//    7   19:new             #36  <Class StringBuilder>
	//    8   22:dup             
	//    9   23:ldc1            #38  <String "DEBUG--">
	//   10   25:invokespecial   #41  <Method void StringBuilder(String)>
	//   11   28:aload_1         
	//   12   29:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   13   32:ldc1            #47  <String " ">
	//   14   34:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   15   37:aload_2         
	//   16   38:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   17   41:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   18   44:invokevirtual   #56  <Method void PrintStream.println(String)>
	//   19   47:return          
	}

	public void error(String s, String s1)
	{
		if(level.getId() <= Level.ERROR.getId())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Level level>
	//*   2    4:invokevirtual   #28  <Method int Level.getId()>
	//*   3    7:getstatic       #60  <Field Level Level.ERROR>
	//*   4   10:invokevirtual   #28  <Method int Level.getId()>
	//*   5   13:icmpgt          47
			System.out.println((new StringBuilder("ERROR--")).append(s).append(" ").append(s1).toString());
	//    6   16:getstatic       #34  <Field PrintStream System.out>
	//    7   19:new             #36  <Class StringBuilder>
	//    8   22:dup             
	//    9   23:ldc1            #62  <String "ERROR--">
	//   10   25:invokespecial   #41  <Method void StringBuilder(String)>
	//   11   28:aload_1         
	//   12   29:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   13   32:ldc1            #47  <String " ">
	//   14   34:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   15   37:aload_2         
	//   16   38:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   17   41:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   18   44:invokevirtual   #56  <Method void PrintStream.println(String)>
	//   19   47:return          
	}

	public boolean getShowLogFlag()
	{
		return showLogFlag;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field boolean showLogFlag>
	//    2    4:ireturn         
	}

	public Level getShowLogLevel()
	{
		return level;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Level level>
	//    2    4:areturn         
	}

	public void info(String s, String s1)
	{
		if(level.getId() <= Level.INFO.getId())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Level level>
	//*   2    4:invokevirtual   #28  <Method int Level.getId()>
	//*   3    7:getstatic       #72  <Field Level Level.INFO>
	//*   4   10:invokevirtual   #28  <Method int Level.getId()>
	//*   5   13:icmpgt          47
			System.out.println((new StringBuilder("INFO--")).append(s).append(" ").append(s1).toString());
	//    6   16:getstatic       #34  <Field PrintStream System.out>
	//    7   19:new             #36  <Class StringBuilder>
	//    8   22:dup             
	//    9   23:ldc1            #74  <String "INFO--">
	//   10   25:invokespecial   #41  <Method void StringBuilder(String)>
	//   11   28:aload_1         
	//   12   29:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   13   32:ldc1            #47  <String " ">
	//   14   34:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   15   37:aload_2         
	//   16   38:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   17   41:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   18   44:invokevirtual   #56  <Method void PrintStream.println(String)>
	//   19   47:return          
	}

	public void setShowLogFlag(boolean flag)
	{
		showLogFlag = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #66  <Field boolean showLogFlag>
	//    3    5:return          
	}

	public void setShowLogLevel(Level level1)
	{
		level = level1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field Level level>
	//    3    5:return          
	}

	public void warn(String s, String s1)
	{
		if(level.getId() <= Level.WARNING.getId())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Level level>
	//*   2    4:invokevirtual   #28  <Method int Level.getId()>
	//*   3    7:getstatic       #82  <Field Level Level.WARNING>
	//*   4   10:invokevirtual   #28  <Method int Level.getId()>
	//*   5   13:icmpgt          47
			System.out.println((new StringBuilder("WARN--")).append(s).append(" ").append(s1).toString());
	//    6   16:getstatic       #34  <Field PrintStream System.out>
	//    7   19:new             #36  <Class StringBuilder>
	//    8   22:dup             
	//    9   23:ldc1            #84  <String "WARN--">
	//   10   25:invokespecial   #41  <Method void StringBuilder(String)>
	//   11   28:aload_1         
	//   12   29:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   13   32:ldc1            #47  <String " ">
	//   14   34:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   15   37:aload_2         
	//   16   38:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   17   41:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   18   44:invokevirtual   #56  <Method void PrintStream.println(String)>
	//   19   47:return          
	}

	private Level level;
	private boolean showLogFlag;
}
