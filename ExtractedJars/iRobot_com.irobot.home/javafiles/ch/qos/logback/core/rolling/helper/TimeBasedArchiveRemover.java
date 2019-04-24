// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.rolling.helper;

import java.io.File;
import java.util.Date;

// Referenced classes of package ch.qos.logback.core.rolling.helper:
//			DefaultArchiveRemover, RollingCalendar, FileNamePattern

public class TimeBasedArchiveRemover extends DefaultArchiveRemover
{

	public TimeBasedArchiveRemover(FileNamePattern filenamepattern, RollingCalendar rollingcalendar)
	{
		super(filenamepattern, rollingcalendar);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #8   <Method void DefaultArchiveRemover(FileNamePattern, RollingCalendar)>
	//    4    6:return          
	}

	protected void cleanByPeriodOffset(Date date, int i)
	{
		date = rc.getRelativeDate(date, i);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field RollingCalendar rc>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #21  <Method Date RollingCalendar.getRelativeDate(Date, int)>
	//    5    9:astore_1        
		date = ((Date) (new File(fileNamePattern.convert(((Object) (date))))));
	//    6   10:new             #23  <Class File>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #27  <Field FileNamePattern fileNamePattern>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #33  <Method String FileNamePattern.convert(Object)>
	//   12   22:invokespecial   #36  <Method void File(String)>
	//   13   25:astore_1        
		if(((File) (date)).exists() && ((File) (date)).isFile())
	//*  14   26:aload_1         
	//*  15   27:invokevirtual   #40  <Method boolean File.exists()>
	//*  16   30:ifeq            89
	//*  17   33:aload_1         
	//*  18   34:invokevirtual   #43  <Method boolean File.isFile()>
	//*  19   37:ifeq            89
		{
			((File) (date)).delete();
	//   20   40:aload_1         
	//   21   41:invokevirtual   #46  <Method boolean File.delete()>
	//   22   44:pop             
			StringBuilder stringbuilder = new StringBuilder();
	//   23   45:new             #48  <Class StringBuilder>
	//   24   48:dup             
	//   25   49:invokespecial   #51  <Method void StringBuilder()>
	//   26   52:astore_3        
			stringbuilder.append("deleting ");
	//   27   53:aload_3         
	//   28   54:ldc1            #53  <String "deleting ">
	//   29   56:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   30   59:pop             
			stringbuilder.append(((Object) (date)));
	//   31   60:aload_3         
	//   32   61:aload_1         
	//   33   62:invokevirtual   #60  <Method StringBuilder StringBuilder.append(Object)>
	//   34   65:pop             
			addInfo(stringbuilder.toString());
	//   35   66:aload_0         
	//   36   67:aload_3         
	//   37   68:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   38   71:invokevirtual   #67  <Method void addInfo(String)>
			if(parentClean)
	//*  39   74:aload_0         
	//*  40   75:getfield        #71  <Field boolean parentClean>
	//*  41   78:ifeq            89
				removeFolderIfEmpty(((File) (date)).getParentFile());
	//   42   81:aload_0         
	//   43   82:aload_1         
	//   44   83:invokevirtual   #75  <Method File File.getParentFile()>
	//   45   86:invokevirtual   #79  <Method void removeFolderIfEmpty(File)>
		}
	//   46   89:return          
	}

	public String toString()
	{
		return "c.q.l.core.rolling.helper.TimeBasedArchiveRemover";
	//    0    0:ldc1            #81  <String "c.q.l.core.rolling.helper.TimeBasedArchiveRemover">
	//    1    2:areturn         
	}
}
