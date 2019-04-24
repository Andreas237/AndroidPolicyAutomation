// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.rolling;

import ch.qos.logback.core.rolling.helper.ArchiveRemover;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.FileNamePattern;
import ch.qos.logback.core.rolling.helper.RollingCalendar;
import ch.qos.logback.core.spi.ContextAwareBase;
import java.io.File;
import java.util.Date;

// Referenced classes of package ch.qos.logback.core.rolling:
//			TimeBasedFileNamingAndTriggeringPolicy, TimeBasedRollingPolicy

public abstract class TimeBasedFileNamingAndTriggeringPolicyBase extends ContextAwareBase
	implements TimeBasedFileNamingAndTriggeringPolicy
{

	public TimeBasedFileNamingAndTriggeringPolicyBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void ContextAwareBase()>
		archiveRemover = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #29  <Field ArchiveRemover archiveRemover>
		artificialCurrentTime = -1L;
	//    5    9:aload_0         
	//    6   10:ldc2w           #30  <Long -1L>
	//    7   13:putfield        #33  <Field long artificialCurrentTime>
		dateInCurrentPeriod = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #35  <Field Date dateInCurrentPeriod>
		started = false;
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:putfield        #37  <Field boolean started>
	//   14   26:return          
	}

	protected void computeNextCheck()
	{
		nextCheck = rc.getNextTriggeringMillis(dateInCurrentPeriod);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #41  <Field RollingCalendar rc>
	//    3    5:aload_0         
	//    4    6:getfield        #35  <Field Date dateInCurrentPeriod>
	//    5    9:invokevirtual   #47  <Method long RollingCalendar.getNextTriggeringMillis(Date)>
	//    6   12:putfield        #49  <Field long nextCheck>
	//    7   15:return          
	}

	public ArchiveRemover getArchiveRemover()
	{
		return archiveRemover;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ArchiveRemover archiveRemover>
	//    2    4:areturn         
	}

	public String getCurrentPeriodsFileNameWithoutCompressionSuffix()
	{
		return tbrp.fileNamePatternWCS.convert(((Object) (dateInCurrentPeriod)));
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field TimeBasedRollingPolicy tbrp>
	//    2    4:getfield        #61  <Field FileNamePattern TimeBasedRollingPolicy.fileNamePatternWCS>
	//    3    7:aload_0         
	//    4    8:getfield        #35  <Field Date dateInCurrentPeriod>
	//    5   11:invokevirtual   #67  <Method String FileNamePattern.convert(Object)>
	//    6   14:areturn         
	}

	public long getCurrentTime()
	{
		if(artificialCurrentTime >= 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field long artificialCurrentTime>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:iflt            14
			return artificialCurrentTime;
	//    5    9:aload_0         
	//    6   10:getfield        #33  <Field long artificialCurrentTime>
	//    7   13:lreturn         
		else
			return System.currentTimeMillis();
	//    8   14:invokestatic    #74  <Method long System.currentTimeMillis()>
	//    9   17:lreturn         
	}

	public String getElapsedPeriodsFileName()
	{
		return elapsedPeriodsFileName;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field String elapsedPeriodsFileName>
	//    2    4:areturn         
	}

	public boolean isStarted()
	{
		return started;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field boolean started>
	//    2    4:ireturn         
	}

	public void setCurrentTime(long l)
	{
		artificialCurrentTime = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #33  <Field long artificialCurrentTime>
	//    3    5:return          
	}

	protected void setDateInCurrentPeriod(long l)
	{
		dateInCurrentPeriod.setTime(l);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Date dateInCurrentPeriod>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #87  <Method void Date.setTime(long)>
	//    4    8:return          
	}

	public void setDateInCurrentPeriod(Date date)
	{
		dateInCurrentPeriod = date;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field Date dateInCurrentPeriod>
	//    3    5:return          
	}

	public void setTimeBasedRollingPolicy(TimeBasedRollingPolicy timebasedrollingpolicy)
	{
		tbrp = timebasedrollingpolicy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #55  <Field TimeBasedRollingPolicy tbrp>
	//    3    5:return          
	}

	public void start()
	{
		Object obj = ((Object) (tbrp.fileNamePattern.getPrimaryDateTokenConverter()));
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field TimeBasedRollingPolicy tbrp>
	//    2    4:getfield        #96  <Field FileNamePattern TimeBasedRollingPolicy.fileNamePattern>
	//    3    7:invokevirtual   #100 <Method DateTokenConverter FileNamePattern.getPrimaryDateTokenConverter()>
	//    4   10:astore_1        
		if(obj == null)
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       64
		{
			obj = ((Object) (new StringBuilder()));
	//    7   15:new             #102 <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #103 <Method void StringBuilder()>
	//   10   22:astore_1        
			((StringBuilder) (obj)).append("FileNamePattern [");
	//   11   23:aload_1         
	//   12   24:ldc1            #105 <String "FileNamePattern [">
	//   13   26:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
			((StringBuilder) (obj)).append(tbrp.fileNamePattern.getPattern());
	//   15   30:aload_1         
	//   16   31:aload_0         
	//   17   32:getfield        #55  <Field TimeBasedRollingPolicy tbrp>
	//   18   35:getfield        #96  <Field FileNamePattern TimeBasedRollingPolicy.fileNamePattern>
	//   19   38:invokevirtual   #112 <Method String FileNamePattern.getPattern()>
	//   20   41:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   21   44:pop             
			((StringBuilder) (obj)).append("] does not contain a valid DateToken");
	//   22   45:aload_1         
	//   23   46:ldc1            #114 <String "] does not contain a valid DateToken">
	//   24   48:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
			throw new IllegalStateException(((StringBuilder) (obj)).toString());
	//   26   52:new             #116 <Class IllegalStateException>
	//   27   55:dup             
	//   28   56:aload_1         
	//   29   57:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   30   60:invokespecial   #122 <Method void IllegalStateException(String)>
	//   31   63:athrow          
		}
		rc = new RollingCalendar();
	//   32   64:aload_0         
	//   33   65:new             #43  <Class RollingCalendar>
	//   34   68:dup             
	//   35   69:invokespecial   #123 <Method void RollingCalendar()>
	//   36   72:putfield        #41  <Field RollingCalendar rc>
		rc.init(((DateTokenConverter) (obj)).getDatePattern());
	//   37   75:aload_0         
	//   38   76:getfield        #41  <Field RollingCalendar rc>
	//   39   79:aload_1         
	//   40   80:invokevirtual   #128 <Method String DateTokenConverter.getDatePattern()>
	//   41   83:invokevirtual   #131 <Method void RollingCalendar.init(String)>
		StringBuilder stringbuilder = new StringBuilder();
	//   42   86:new             #102 <Class StringBuilder>
	//   43   89:dup             
	//   44   90:invokespecial   #103 <Method void StringBuilder()>
	//   45   93:astore_2        
		stringbuilder.append("The date pattern is '");
	//   46   94:aload_2         
	//   47   95:ldc1            #133 <String "The date pattern is '">
	//   48   97:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   49  100:pop             
		stringbuilder.append(((DateTokenConverter) (obj)).getDatePattern());
	//   50  101:aload_2         
	//   51  102:aload_1         
	//   52  103:invokevirtual   #128 <Method String DateTokenConverter.getDatePattern()>
	//   53  106:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   54  109:pop             
		stringbuilder.append("' from file name pattern '");
	//   55  110:aload_2         
	//   56  111:ldc1            #135 <String "' from file name pattern '">
	//   57  113:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   58  116:pop             
		stringbuilder.append(tbrp.fileNamePattern.getPattern());
	//   59  117:aload_2         
	//   60  118:aload_0         
	//   61  119:getfield        #55  <Field TimeBasedRollingPolicy tbrp>
	//   62  122:getfield        #96  <Field FileNamePattern TimeBasedRollingPolicy.fileNamePattern>
	//   63  125:invokevirtual   #112 <Method String FileNamePattern.getPattern()>
	//   64  128:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   65  131:pop             
		stringbuilder.append("'.");
	//   66  132:aload_2         
	//   67  133:ldc1            #137 <String "'.">
	//   68  135:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   69  138:pop             
		addInfo(stringbuilder.toString());
	//   70  139:aload_0         
	//   71  140:aload_2         
	//   72  141:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   73  144:invokevirtual   #140 <Method void addInfo(String)>
		rc.printPeriodicity(((ContextAwareBase) (this)));
	//   74  147:aload_0         
	//   75  148:getfield        #41  <Field RollingCalendar rc>
	//   76  151:aload_0         
	//   77  152:invokevirtual   #144 <Method void RollingCalendar.printPeriodicity(ContextAwareBase)>
		setDateInCurrentPeriod(new Date(getCurrentTime()));
	//   78  155:aload_0         
	//   79  156:new             #84  <Class Date>
	//   80  159:dup             
	//   81  160:aload_0         
	//   82  161:invokevirtual   #146 <Method long getCurrentTime()>
	//   83  164:invokespecial   #148 <Method void Date(long)>
	//   84  167:invokevirtual   #150 <Method void setDateInCurrentPeriod(Date)>
		if(tbrp.getParentsRawFileProperty() != null)
	//*  85  170:aload_0         
	//*  86  171:getfield        #55  <Field TimeBasedRollingPolicy tbrp>
	//*  87  174:invokevirtual   #153 <Method String TimeBasedRollingPolicy.getParentsRawFileProperty()>
	//*  88  177:ifnull          224
		{
			obj = ((Object) (new File(tbrp.getParentsRawFileProperty())));
	//   89  180:new             #155 <Class File>
	//   90  183:dup             
	//   91  184:aload_0         
	//   92  185:getfield        #55  <Field TimeBasedRollingPolicy tbrp>
	//   93  188:invokevirtual   #153 <Method String TimeBasedRollingPolicy.getParentsRawFileProperty()>
	//   94  191:invokespecial   #156 <Method void File(String)>
	//   95  194:astore_1        
			if(((File) (obj)).exists() && ((File) (obj)).canRead())
	//*  96  195:aload_1         
	//*  97  196:invokevirtual   #159 <Method boolean File.exists()>
	//*  98  199:ifeq            224
	//*  99  202:aload_1         
	//* 100  203:invokevirtual   #162 <Method boolean File.canRead()>
	//* 101  206:ifeq            224
				setDateInCurrentPeriod(new Date(((File) (obj)).lastModified()));
	//  102  209:aload_0         
	//  103  210:new             #84  <Class Date>
	//  104  213:dup             
	//  105  214:aload_1         
	//  106  215:invokevirtual   #165 <Method long File.lastModified()>
	//  107  218:invokespecial   #148 <Method void Date(long)>
	//  108  221:invokevirtual   #150 <Method void setDateInCurrentPeriod(Date)>
		}
		obj = ((Object) (new StringBuilder()));
	//  109  224:new             #102 <Class StringBuilder>
	//  110  227:dup             
	//  111  228:invokespecial   #103 <Method void StringBuilder()>
	//  112  231:astore_1        
		((StringBuilder) (obj)).append("Setting initial period to ");
	//  113  232:aload_1         
	//  114  233:ldc1            #167 <String "Setting initial period to ">
	//  115  235:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//  116  238:pop             
		((StringBuilder) (obj)).append(((Object) (dateInCurrentPeriod)));
	//  117  239:aload_1         
	//  118  240:aload_0         
	//  119  241:getfield        #35  <Field Date dateInCurrentPeriod>
	//  120  244:invokevirtual   #170 <Method StringBuilder StringBuilder.append(Object)>
	//  121  247:pop             
		addInfo(((StringBuilder) (obj)).toString());
	//  122  248:aload_0         
	//  123  249:aload_1         
	//  124  250:invokevirtual   #119 <Method String StringBuilder.toString()>
	//  125  253:invokevirtual   #140 <Method void addInfo(String)>
		computeNextCheck();
	//  126  256:aload_0         
	//  127  257:invokevirtual   #172 <Method void computeNextCheck()>
	//  128  260:return          
	}

	public void stop()
	{
		started = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #37  <Field boolean started>
	//    3    5:return          
	}

	protected ArchiveRemover archiveRemover;
	protected long artificialCurrentTime;
	protected Date dateInCurrentPeriod;
	protected String elapsedPeriodsFileName;
	protected long nextCheck;
	protected RollingCalendar rc;
	protected boolean started;
	protected TimeBasedRollingPolicy tbrp;
}
