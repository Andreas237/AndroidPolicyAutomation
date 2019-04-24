// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.rolling;

import ch.qos.logback.core.rolling.helper.ArchiveRemover;
import ch.qos.logback.core.rolling.helper.FileNamePattern;
import ch.qos.logback.core.rolling.helper.TimeBasedArchiveRemover;
import java.io.File;

// Referenced classes of package ch.qos.logback.core.rolling:
//			TimeBasedFileNamingAndTriggeringPolicyBase, TimeBasedRollingPolicy

public class DefaultTimeBasedFileNamingAndTriggeringPolicy extends TimeBasedFileNamingAndTriggeringPolicyBase
{

	public DefaultTimeBasedFileNamingAndTriggeringPolicy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void TimeBasedFileNamingAndTriggeringPolicyBase()>
	//    2    4:return          
	}

	public boolean isTriggeringEvent(File file, Object obj)
	{
		long l = getCurrentTime();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #16  <Method long getCurrentTime()>
	//    2    4:lstore_3        
		if(l >= nextCheck)
	//*   3    5:lload_3         
	//*   4    6:aload_0         
	//*   5    7:getfield        #20  <Field long nextCheck>
	//*   6   10:lcmp            
	//*   7   11:iflt            74
		{
			file = ((File) (dateInCurrentPeriod));
	//    8   14:aload_0         
	//    9   15:getfield        #24  <Field java.util.Date dateInCurrentPeriod>
	//   10   18:astore_1        
			obj = ((Object) (new StringBuilder()));
	//   11   19:new             #26  <Class StringBuilder>
	//   12   22:dup             
	//   13   23:invokespecial   #27  <Method void StringBuilder()>
	//   14   26:astore_2        
			((StringBuilder) (obj)).append("Elapsed period: ");
	//   15   27:aload_2         
	//   16   28:ldc1            #29  <String "Elapsed period: ">
	//   17   30:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   18   33:pop             
			((StringBuilder) (obj)).append(((Object) (file)));
	//   19   34:aload_2         
	//   20   35:aload_1         
	//   21   36:invokevirtual   #36  <Method StringBuilder StringBuilder.append(Object)>
	//   22   39:pop             
			addInfo(((StringBuilder) (obj)).toString());
	//   23   40:aload_0         
	//   24   41:aload_2         
	//   25   42:invokevirtual   #40  <Method String StringBuilder.toString()>
	//   26   45:invokevirtual   #44  <Method void addInfo(String)>
			elapsedPeriodsFileName = tbrp.fileNamePatternWCS.convert(((Object) (file)));
	//   27   48:aload_0         
	//   28   49:aload_0         
	//   29   50:getfield        #48  <Field TimeBasedRollingPolicy tbrp>
	//   30   53:getfield        #54  <Field FileNamePattern TimeBasedRollingPolicy.fileNamePatternWCS>
	//   31   56:aload_1         
	//   32   57:invokevirtual   #60  <Method String FileNamePattern.convert(Object)>
	//   33   60:putfield        #64  <Field String elapsedPeriodsFileName>
			setDateInCurrentPeriod(l);
	//   34   63:aload_0         
	//   35   64:lload_3         
	//   36   65:invokevirtual   #68  <Method void setDateInCurrentPeriod(long)>
			computeNextCheck();
	//   37   68:aload_0         
	//   38   69:invokevirtual   #71  <Method void computeNextCheck()>
			return true;
	//   39   72:iconst_1        
	//   40   73:ireturn         
		} else
		{
			return false;
	//   41   74:iconst_0        
	//   42   75:ireturn         
		}
	}

	public void start()
	{
		super.start();
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method void TimeBasedFileNamingAndTriggeringPolicyBase.start()>
		archiveRemover = ((ArchiveRemover) (new TimeBasedArchiveRemover(tbrp.fileNamePattern, rc)));
	//    2    4:aload_0         
	//    3    5:new             #78  <Class TimeBasedArchiveRemover>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:getfield        #48  <Field TimeBasedRollingPolicy tbrp>
	//    7   13:getfield        #81  <Field FileNamePattern TimeBasedRollingPolicy.fileNamePattern>
	//    8   16:aload_0         
	//    9   17:getfield        #85  <Field ch.qos.logback.core.rolling.helper.RollingCalendar rc>
	//   10   20:invokespecial   #88  <Method void TimeBasedArchiveRemover(FileNamePattern, ch.qos.logback.core.rolling.helper.RollingCalendar)>
	//   11   23:putfield        #92  <Field ArchiveRemover archiveRemover>
		archiveRemover.setContext(context);
	//   12   26:aload_0         
	//   13   27:getfield        #92  <Field ArchiveRemover archiveRemover>
	//   14   30:aload_0         
	//   15   31:getfield        #96  <Field ch.qos.logback.core.Context context>
	//   16   34:invokeinterface #102 <Method void ArchiveRemover.setContext(ch.qos.logback.core.Context)>
		started = true;
	//   17   39:aload_0         
	//   18   40:iconst_1        
	//   19   41:putfield        #106 <Field boolean started>
	//   20   44:return          
	}

	public String toString()
	{
		return "c.q.l.core.rolling.DefaultTimeBasedFileNamingAndTriggeringPolicy";
	//    0    0:ldc1            #108 <String "c.q.l.core.rolling.DefaultTimeBasedFileNamingAndTriggeringPolicy">
	//    1    2:areturn         
	}
}
