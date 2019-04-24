// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core;

import ch.qos.logback.core.joran.spi.ConsoleTarget;
import ch.qos.logback.core.status.Status;
import ch.qos.logback.core.status.WarnStatus;
import java.util.Arrays;

// Referenced classes of package ch.qos.logback.core:
//			OutputStreamAppender

public class ConsoleAppender extends OutputStreamAppender
{

	public ConsoleAppender()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void OutputStreamAppender()>
		target = ConsoleTarget.SystemOut;
	//    2    4:aload_0         
	//    3    5:getstatic       #17  <Field ConsoleTarget ConsoleTarget.SystemOut>
	//    4    8:putfield        #19  <Field ConsoleTarget target>
	//    5   11:return          
	}

	private void targetWarn(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #24  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("[");
	//    4    8:aload_2         
	//    5    9:ldc1            #27  <String "[">
	//    6   11:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(s);
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		stringbuilder.append("] should be one of ");
	//   12   21:aload_2         
	//   13   22:ldc1            #33  <String "] should be one of ">
	//   14   24:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		stringbuilder.append(Arrays.toString(((Object []) (ConsoleTarget.values()))));
	//   16   28:aload_2         
	//   17   29:invokestatic    #37  <Method ConsoleTarget[] ConsoleTarget.values()>
	//   18   32:invokestatic    #43  <Method String Arrays.toString(Object[])>
	//   19   35:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
		s = ((String) (new WarnStatus(stringbuilder.toString(), ((Object) (this)))));
	//   21   39:new             #45  <Class WarnStatus>
	//   22   42:dup             
	//   23   43:aload_2         
	//   24   44:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   25   47:aload_0         
	//   26   48:invokespecial   #51  <Method void WarnStatus(String, Object)>
	//   27   51:astore_1        
		((Status) (s)).add(((Status) (new WarnStatus("Using previously set target, System.out by default.", ((Object) (this))))));
	//   28   52:aload_1         
	//   29   53:new             #45  <Class WarnStatus>
	//   30   56:dup             
	//   31   57:ldc1            #53  <String "Using previously set target, System.out by default.">
	//   32   59:aload_0         
	//   33   60:invokespecial   #51  <Method void WarnStatus(String, Object)>
	//   34   63:invokeinterface #59  <Method void Status.add(Status)>
		addStatus(((Status) (s)));
	//   35   68:aload_0         
	//   36   69:aload_1         
	//   37   70:invokevirtual   #62  <Method void addStatus(Status)>
	//   38   73:return          
	}

	public String getTarget()
	{
		return target.getName();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ConsoleTarget target>
	//    2    4:invokevirtual   #66  <Method String ConsoleTarget.getName()>
	//    3    7:areturn         
	}

	public void setTarget(String s)
	{
		ConsoleTarget consoletarget = ConsoleTarget.findByName(s.trim());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #72  <Method String String.trim()>
	//    2    4:invokestatic    #76  <Method ConsoleTarget ConsoleTarget.findByName(String)>
	//    3    7:astore_2        
		if(consoletarget == null)
	//*   4    8:aload_2         
	//*   5    9:ifnonnull       18
		{
			targetWarn(s);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokespecial   #78  <Method void targetWarn(String)>
			return;
	//    9   17:return          
		} else
		{
			target = consoletarget;
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:putfield        #19  <Field ConsoleTarget target>
			return;
	//   13   23:return          
		}
	}

	public void start()
	{
		setOutputStream(target.getStream());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #19  <Field ConsoleTarget target>
	//    3    5:invokevirtual   #83  <Method java.io.OutputStream ConsoleTarget.getStream()>
	//    4    8:invokevirtual   #87  <Method void setOutputStream(java.io.OutputStream)>
		super.start();
	//    5   11:aload_0         
	//    6   12:invokespecial   #89  <Method void OutputStreamAppender.start()>
	//    7   15:return          
	}

	protected ConsoleTarget target;
}
