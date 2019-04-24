// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.rolling;

import ch.qos.logback.core.rolling.helper.ArchiveRemover;
import ch.qos.logback.core.rolling.helper.CompressionMode;
import ch.qos.logback.core.rolling.helper.FileFilterUtil;
import ch.qos.logback.core.rolling.helper.FileNamePattern;
import ch.qos.logback.core.rolling.helper.SizeAndTimeBasedArchiveRemover;
import ch.qos.logback.core.util.FileSize;
import java.io.File;
import java.util.Date;

// Referenced classes of package ch.qos.logback.core.rolling:
//			TimeBasedFileNamingAndTriggeringPolicyBase, TimeBasedRollingPolicy

public class SizeAndTimeBasedFNATP extends TimeBasedFileNamingAndTriggeringPolicyBase
{

	public SizeAndTimeBasedFNATP()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void TimeBasedFileNamingAndTriggeringPolicyBase()>
		currentPeriodsCounter = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #20  <Field int currentPeriodsCounter>
		invocationMask = 1;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #22  <Field int invocationMask>
	//    8   14:return          
	}

	private String getFileNameIncludingCompressionSuffix(Date date, int i)
	{
		return tbrp.fileNamePattern.convertMultipleArguments(new Object[] {
			dateInCurrentPeriod, Integer.valueOf(i)
		});
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field TimeBasedRollingPolicy tbrp>
	//    2    4:getfield        #35  <Field FileNamePattern TimeBasedRollingPolicy.fileNamePattern>
	//    3    7:iconst_2        
	//    4    8:anewarray       Object[]
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:aload_0         
	//    8   14:getfield        #41  <Field Date dateInCurrentPeriod>
	//    9   17:aastore         
	//   10   18:dup             
	//   11   19:iconst_1        
	//   12   20:iload_2         
	//   13   21:invokestatic    #47  <Method Integer Integer.valueOf(int)>
	//   14   24:aastore         
	//   15   25:invokevirtual   #53  <Method String FileNamePattern.convertMultipleArguments(Object[])>
	//   16   28:areturn         
	}

	void computeCurrentPeriodsHighestCounterValue(String s)
	{
		File afile[] = FileFilterUtil.filesInFolderMatchingStemRegex((new File(getCurrentPeriodsFileNameWithoutCompressionSuffix())).getParentFile(), s);
	//    0    0:new             #57  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #61  <Method String getCurrentPeriodsFileNameWithoutCompressionSuffix()>
	//    4    8:invokespecial   #63  <Method void File(String)>
	//    5   11:invokevirtual   #67  <Method File File.getParentFile()>
	//    6   14:aload_1         
	//    7   15:invokestatic    #73  <Method File[] FileFilterUtil.filesInFolderMatchingStemRegex(File, String)>
	//    8   18:astore_2        
		if(afile != null && afile.length != 0)
	//*   9   19:aload_2         
	//*  10   20:ifnull          74
	//*  11   23:aload_2         
	//*  12   24:arraylength     
	//*  13   25:ifne            31
	//*  14   28:goto            74
		{
			currentPeriodsCounter = FileFilterUtil.findHighestCounter(afile, s);
	//   15   31:aload_0         
	//   16   32:aload_2         
	//   17   33:aload_1         
	//   18   34:invokestatic    #77  <Method int FileFilterUtil.findHighestCounter(File[], String)>
	//   19   37:putfield        #20  <Field int currentPeriodsCounter>
			if(tbrp.getParentsRawFileProperty() != null || tbrp.compressionMode != CompressionMode.NONE)
	//*  20   40:aload_0         
	//*  21   41:getfield        #29  <Field TimeBasedRollingPolicy tbrp>
	//*  22   44:invokevirtual   #80  <Method String TimeBasedRollingPolicy.getParentsRawFileProperty()>
	//*  23   47:ifnonnull       63
	//*  24   50:aload_0         
	//*  25   51:getfield        #29  <Field TimeBasedRollingPolicy tbrp>
	//*  26   54:getfield        #84  <Field CompressionMode TimeBasedRollingPolicy.compressionMode>
	//*  27   57:getstatic       #89  <Field CompressionMode CompressionMode.NONE>
	//*  28   60:if_acmpeq       73
				currentPeriodsCounter = currentPeriodsCounter + 1;
	//   29   63:aload_0         
	//   30   64:aload_0         
	//   31   65:getfield        #20  <Field int currentPeriodsCounter>
	//   32   68:iconst_1        
	//   33   69:iadd            
	//   34   70:putfield        #20  <Field int currentPeriodsCounter>
			return;
	//   35   73:return          
		} else
		{
			currentPeriodsCounter = 0;
	//   36   74:aload_0         
	//   37   75:iconst_0        
	//   38   76:putfield        #20  <Field int currentPeriodsCounter>
			return;
	//   39   79:return          
		}
	}

	protected ArchiveRemover createArchiveRemover()
	{
		return ((ArchiveRemover) (new SizeAndTimeBasedArchiveRemover(tbrp.fileNamePattern, rc)));
	//    0    0:new             #93  <Class SizeAndTimeBasedArchiveRemover>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field TimeBasedRollingPolicy tbrp>
	//    4    8:getfield        #35  <Field FileNamePattern TimeBasedRollingPolicy.fileNamePattern>
	//    5   11:aload_0         
	//    6   12:getfield        #97  <Field ch.qos.logback.core.rolling.helper.RollingCalendar rc>
	//    7   15:invokespecial   #100 <Method void SizeAndTimeBasedArchiveRemover(FileNamePattern, ch.qos.logback.core.rolling.helper.RollingCalendar)>
	//    8   18:areturn         
	}

	public String getCurrentPeriodsFileNameWithoutCompressionSuffix()
	{
		return tbrp.fileNamePatternWCS.convertMultipleArguments(new Object[] {
			dateInCurrentPeriod, Integer.valueOf(currentPeriodsCounter)
		});
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field TimeBasedRollingPolicy tbrp>
	//    2    4:getfield        #103 <Field FileNamePattern TimeBasedRollingPolicy.fileNamePatternWCS>
	//    3    7:iconst_2        
	//    4    8:anewarray       Object[]
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:aload_0         
	//    8   14:getfield        #41  <Field Date dateInCurrentPeriod>
	//    9   17:aastore         
	//   10   18:dup             
	//   11   19:iconst_1        
	//   12   20:aload_0         
	//   13   21:getfield        #20  <Field int currentPeriodsCounter>
	//   14   24:invokestatic    #47  <Method Integer Integer.valueOf(int)>
	//   15   27:aastore         
	//   16   28:invokevirtual   #53  <Method String FileNamePattern.convertMultipleArguments(Object[])>
	//   17   31:areturn         
	}

	public String getMaxFileSize()
	{
		return maxFileSizeAsString;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field String maxFileSizeAsString>
	//    2    4:areturn         
	}

	public boolean isTriggeringEvent(File file, Object obj)
	{
		long l = getCurrentTime();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #112 <Method long getCurrentTime()>
	//    2    4:lstore          4
		if(l >= nextCheck)
	//*   3    6:lload           4
	//*   4    8:aload_0         
	//*   5    9:getfield        #116 <Field long nextCheck>
	//*   6   12:lcmp            
	//*   7   13:iflt            70
		{
			file = ((File) (dateInCurrentPeriod));
	//    8   16:aload_0         
	//    9   17:getfield        #41  <Field Date dateInCurrentPeriod>
	//   10   20:astore_1        
			elapsedPeriodsFileName = tbrp.fileNamePatternWCS.convertMultipleArguments(new Object[] {
				file, Integer.valueOf(currentPeriodsCounter)
			});
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #29  <Field TimeBasedRollingPolicy tbrp>
	//   14   26:getfield        #103 <Field FileNamePattern TimeBasedRollingPolicy.fileNamePatternWCS>
	//   15   29:iconst_2        
	//   16   30:anewarray       Object[]
	//   17   33:dup             
	//   18   34:iconst_0        
	//   19   35:aload_1         
	//   20   36:aastore         
	//   21   37:dup             
	//   22   38:iconst_1        
	//   23   39:aload_0         
	//   24   40:getfield        #20  <Field int currentPeriodsCounter>
	//   25   43:invokestatic    #47  <Method Integer Integer.valueOf(int)>
	//   26   46:aastore         
	//   27   47:invokevirtual   #53  <Method String FileNamePattern.convertMultipleArguments(Object[])>
	//   28   50:putfield        #119 <Field String elapsedPeriodsFileName>
			currentPeriodsCounter = 0;
	//   29   53:aload_0         
	//   30   54:iconst_0        
	//   31   55:putfield        #20  <Field int currentPeriodsCounter>
			setDateInCurrentPeriod(l);
	//   32   58:aload_0         
	//   33   59:lload           4
	//   34   61:invokevirtual   #123 <Method void setDateInCurrentPeriod(long)>
			computeNextCheck();
	//   35   64:aload_0         
	//   36   65:invokevirtual   #126 <Method void computeNextCheck()>
			return true;
	//   37   68:iconst_1        
	//   38   69:ireturn         
		}
		int i = invocationCounter + 1;
	//   39   70:aload_0         
	//   40   71:getfield        #128 <Field int invocationCounter>
	//   41   74:iconst_1        
	//   42   75:iadd            
	//   43   76:istore_3        
		invocationCounter = i;
	//   44   77:aload_0         
	//   45   78:iload_3         
	//   46   79:putfield        #128 <Field int invocationCounter>
		if((i & invocationMask) != invocationMask)
	//*  47   82:iload_3         
	//*  48   83:aload_0         
	//*  49   84:getfield        #22  <Field int invocationMask>
	//*  50   87:iand            
	//*  51   88:aload_0         
	//*  52   89:getfield        #22  <Field int invocationMask>
	//*  53   92:icmpeq          97
			return false;
	//   54   95:iconst_0        
	//   55   96:ireturn         
		if(invocationMask < 15)
	//*  56   97:aload_0         
	//*  57   98:getfield        #22  <Field int invocationMask>
	//*  58  101:bipush          15
	//*  59  103:icmpge          118
			invocationMask = (invocationMask << 1) + 1;
	//   60  106:aload_0         
	//   61  107:aload_0         
	//   62  108:getfield        #22  <Field int invocationMask>
	//   63  111:iconst_1        
	//   64  112:ishl            
	//   65  113:iconst_1        
	//   66  114:iadd            
	//   67  115:putfield        #22  <Field int invocationMask>
		if(file.length() >= maxFileSize.getSize())
	//*  68  118:aload_1         
	//*  69  119:invokevirtual   #131 <Method long File.length()>
	//*  70  122:aload_0         
	//*  71  123:getfield        #133 <Field FileSize maxFileSize>
	//*  72  126:invokevirtual   #138 <Method long FileSize.getSize()>
	//*  73  129:lcmp            
	//*  74  130:iflt            180
		{
			elapsedPeriodsFileName = tbrp.fileNamePatternWCS.convertMultipleArguments(new Object[] {
				dateInCurrentPeriod, Integer.valueOf(currentPeriodsCounter)
			});
	//   75  133:aload_0         
	//   76  134:aload_0         
	//   77  135:getfield        #29  <Field TimeBasedRollingPolicy tbrp>
	//   78  138:getfield        #103 <Field FileNamePattern TimeBasedRollingPolicy.fileNamePatternWCS>
	//   79  141:iconst_2        
	//   80  142:anewarray       Object[]
	//   81  145:dup             
	//   82  146:iconst_0        
	//   83  147:aload_0         
	//   84  148:getfield        #41  <Field Date dateInCurrentPeriod>
	//   85  151:aastore         
	//   86  152:dup             
	//   87  153:iconst_1        
	//   88  154:aload_0         
	//   89  155:getfield        #20  <Field int currentPeriodsCounter>
	//   90  158:invokestatic    #47  <Method Integer Integer.valueOf(int)>
	//   91  161:aastore         
	//   92  162:invokevirtual   #53  <Method String FileNamePattern.convertMultipleArguments(Object[])>
	//   93  165:putfield        #119 <Field String elapsedPeriodsFileName>
			currentPeriodsCounter = currentPeriodsCounter + 1;
	//   94  168:aload_0         
	//   95  169:aload_0         
	//   96  170:getfield        #20  <Field int currentPeriodsCounter>
	//   97  173:iconst_1        
	//   98  174:iadd            
	//   99  175:putfield        #20  <Field int currentPeriodsCounter>
			return true;
	//  100  178:iconst_1        
	//  101  179:ireturn         
		} else
		{
			return false;
	//  102  180:iconst_0        
	//  103  181:ireturn         
		}
	}

	public void setMaxFileSize(String s)
	{
		maxFileSizeAsString = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #106 <Field String maxFileSizeAsString>
		maxFileSize = FileSize.valueOf(s);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokestatic    #144 <Method FileSize FileSize.valueOf(String)>
	//    6   10:putfield        #133 <Field FileSize maxFileSize>
	//    7   13:return          
	}

	public void start()
	{
		super.start();
	//    0    0:aload_0         
	//    1    1:invokespecial   #147 <Method void TimeBasedFileNamingAndTriggeringPolicyBase.start()>
		archiveRemover = createArchiveRemover();
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #149 <Method ArchiveRemover createArchiveRemover()>
	//    5    9:putfield        #153 <Field ArchiveRemover archiveRemover>
		archiveRemover.setContext(context);
	//    6   12:aload_0         
	//    7   13:getfield        #153 <Field ArchiveRemover archiveRemover>
	//    8   16:aload_0         
	//    9   17:getfield        #157 <Field ch.qos.logback.core.Context context>
	//   10   20:invokeinterface #163 <Method void ArchiveRemover.setContext(ch.qos.logback.core.Context)>
		computeCurrentPeriodsHighestCounterValue(FileFilterUtil.afterLastSlash(tbrp.fileNamePattern.toRegexForFixedDate(dateInCurrentPeriod)));
	//   11   25:aload_0         
	//   12   26:aload_0         
	//   13   27:getfield        #29  <Field TimeBasedRollingPolicy tbrp>
	//   14   30:getfield        #35  <Field FileNamePattern TimeBasedRollingPolicy.fileNamePattern>
	//   15   33:aload_0         
	//   16   34:getfield        #41  <Field Date dateInCurrentPeriod>
	//   17   37:invokevirtual   #167 <Method String FileNamePattern.toRegexForFixedDate(Date)>
	//   18   40:invokestatic    #171 <Method String FileFilterUtil.afterLastSlash(String)>
	//   19   43:invokevirtual   #173 <Method void computeCurrentPeriodsHighestCounterValue(String)>
		started = true;
	//   20   46:aload_0         
	//   21   47:iconst_1        
	//   22   48:putfield        #177 <Field boolean started>
	//   23   51:return          
	}

	int currentPeriodsCounter;
	private int invocationCounter;
	private int invocationMask;
	FileSize maxFileSize;
	String maxFileSizeAsString;
}
