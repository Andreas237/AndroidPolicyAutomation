// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.nfcos.client.libs.log;

import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.Level;
import java.io.PrintStream;

public class FMLog4Windows
	implements FMLog
{

	public FMLog4Windows()
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
	//*   5   13:icmpgt          45
			System.out.println((new StringBuilder(String.valueOf(((Object) (s))))).append(" ").append(s1).toString());
	//    6   16:getstatic       #34  <Field PrintStream System.out>
	//    7   19:new             #36  <Class StringBuilder>
	//    8   22:dup             
	//    9   23:aload_1         
	//   10   24:invokestatic    #42  <Method String String.valueOf(Object)>
	//   11   27:invokespecial   #45  <Method void StringBuilder(String)>
	//   12   30:ldc1            #47  <String " ">
	//   13   32:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   14   35:aload_2         
	//   15   36:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   16   39:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   17   42:invokevirtual   #60  <Method void PrintStream.println(String)>
	//   18   45:return          
	}

	public void error(String s, String s1)
	{
		if(level.getId() <= Level.ERROR.getId())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Level level>
	//*   2    4:invokevirtual   #28  <Method int Level.getId()>
	//*   3    7:getstatic       #64  <Field Level Level.ERROR>
	//*   4   10:invokevirtual   #28  <Method int Level.getId()>
	//*   5   13:icmpgt          45
			System.out.println((new StringBuilder(String.valueOf(((Object) (s))))).append(" ").append(s1).toString());
	//    6   16:getstatic       #34  <Field PrintStream System.out>
	//    7   19:new             #36  <Class StringBuilder>
	//    8   22:dup             
	//    9   23:aload_1         
	//   10   24:invokestatic    #42  <Method String String.valueOf(Object)>
	//   11   27:invokespecial   #45  <Method void StringBuilder(String)>
	//   12   30:ldc1            #47  <String " ">
	//   13   32:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   14   35:aload_2         
	//   15   36:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   16   39:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   17   42:invokevirtual   #60  <Method void PrintStream.println(String)>
	//   18   45:return          
	}

	public boolean getShowLogFlag()
	{
		return showLogFlag;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field boolean showLogFlag>
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
	//*   3    7:getstatic       #74  <Field Level Level.INFO>
	//*   4   10:invokevirtual   #28  <Method int Level.getId()>
	//*   5   13:icmpgt          45
			System.out.println((new StringBuilder(String.valueOf(((Object) (s))))).append(" ").append(s1).toString());
	//    6   16:getstatic       #34  <Field PrintStream System.out>
	//    7   19:new             #36  <Class StringBuilder>
	//    8   22:dup             
	//    9   23:aload_1         
	//   10   24:invokestatic    #42  <Method String String.valueOf(Object)>
	//   11   27:invokespecial   #45  <Method void StringBuilder(String)>
	//   12   30:ldc1            #47  <String " ">
	//   13   32:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   14   35:aload_2         
	//   15   36:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   16   39:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   17   42:invokevirtual   #60  <Method void PrintStream.println(String)>
	//   18   45:return          
	}

	public void setShowLogFlag(boolean flag)
	{
		showLogFlag = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #68  <Field boolean showLogFlag>
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
	//*   5   13:icmpgt          45
			System.out.println((new StringBuilder(String.valueOf(((Object) (s))))).append(" ").append(s1).toString());
	//    6   16:getstatic       #34  <Field PrintStream System.out>
	//    7   19:new             #36  <Class StringBuilder>
	//    8   22:dup             
	//    9   23:aload_1         
	//   10   24:invokestatic    #42  <Method String String.valueOf(Object)>
	//   11   27:invokespecial   #45  <Method void StringBuilder(String)>
	//   12   30:ldc1            #47  <String " ">
	//   13   32:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   14   35:aload_2         
	//   15   36:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   16   39:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   17   42:invokevirtual   #60  <Method void PrintStream.println(String)>
	//   18   45:return          
	}

	private Level level;
	private boolean showLogFlag;
}
