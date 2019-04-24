// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.rolling;

import ch.qos.logback.core.rolling.helper.ArchiveRemover;
import ch.qos.logback.core.rolling.helper.AsynchronousCompressor;
import ch.qos.logback.core.rolling.helper.CompressionMode;
import ch.qos.logback.core.rolling.helper.Compressor;
import ch.qos.logback.core.rolling.helper.FileFilterUtil;
import ch.qos.logback.core.rolling.helper.FileNamePattern;
import ch.qos.logback.core.rolling.helper.RenameUtil;
import java.io.File;
import java.util.Date;
import java.util.concurrent.*;

// Referenced classes of package ch.qos.logback.core.rolling:
//			RollingPolicyBase, TriggeringPolicy, TimeBasedFileNamingAndTriggeringPolicy, DefaultTimeBasedFileNamingAndTriggeringPolicy

public class TimeBasedRollingPolicy extends RollingPolicyBase
	implements TriggeringPolicy
{

	public TimeBasedRollingPolicy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void RollingPolicyBase()>
		renameUtil = new RenameUtil();
	//    2    4:aload_0         
	//    3    5:new             #37  <Class RenameUtil>
	//    4    8:dup             
	//    5    9:invokespecial   #38  <Method void RenameUtil()>
	//    6   12:putfield        #40  <Field RenameUtil renameUtil>
		maxHistory = 0;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #42  <Field int maxHistory>
		cleanHistoryOnStart = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #44  <Field boolean cleanHistoryOnStart>
	//   13   25:return          
	}

	private String transformFileNamePattern2ZipEntry(String s)
	{
		return FileFilterUtil.afterLastSlash(FileFilterUtil.slashify(s));
	//    0    0:aload_1         
	//    1    1:invokestatic    #52  <Method String FileFilterUtil.slashify(String)>
	//    2    4:invokestatic    #55  <Method String FileFilterUtil.afterLastSlash(String)>
	//    3    7:areturn         
	}

	private void waitForAsynchronousJobToStop()
	{
		if(future == null)
			break MISSING_BLOCK_LABEL_41;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Future future>
	//    2    4:ifnull          41
		future.get(30L, TimeUnit.SECONDS);
	//    3    7:aload_0         
	//    4    8:getfield        #62  <Field Future future>
	//    5   11:ldc2w           #63  <Long 30L>
	//    6   14:getstatic       #70  <Field TimeUnit TimeUnit.SECONDS>
	//    7   17:invokeinterface #76  <Method Object Future.get(long, TimeUnit)>
	//    8   22:pop             
		return;
	//    9   23:return          
		Object obj;
		obj;
	//   10   24:astore_1        
		String s;
		s = "Unexpected exception while waiting for compression job to finish";
	//   11   25:ldc1            #78  <String "Unexpected exception while waiting for compression job to finish">
	//   12   27:astore_2        
		break MISSING_BLOCK_LABEL_35;
	//   13   28:goto            35
		obj;
	//   14   31:astore_1        
		s = "Timeout while waiting for compression job to finish";
	//   15   32:ldc1            #80  <String "Timeout while waiting for compression job to finish">
	//   16   34:astore_2        
		addError(s, ((Throwable) (obj)));
	//   17   35:aload_0         
	//   18   36:aload_2         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #84  <Method void addError(String, Throwable)>
	//   21   41:return          
	}

	Future asyncCompress(String s, String s1, String s2)
	{
		return (new AsynchronousCompressor(compressor)).compressAsynchronously(s, s1, s2);
	//    0    0:new             #88  <Class AsynchronousCompressor>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #90  <Field Compressor compressor>
	//    4    8:invokespecial   #93  <Method void AsynchronousCompressor(Compressor)>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:aload_3         
	//    8   14:invokevirtual   #96  <Method Future AsynchronousCompressor.compressAsynchronously(String, String, String)>
	//    9   17:areturn         
	}

	public String getActiveFileName()
	{
		String s = getParentsRawFileProperty();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #101 <Method String getParentsRawFileProperty()>
	//    2    4:astore_1        
		if(s != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return s;
	//    5    9:aload_1         
	//    6   10:areturn         
		else
			return timeBasedFileNamingAndTriggeringPolicy.getCurrentPeriodsFileNameWithoutCompressionSuffix();
	//    7   11:aload_0         
	//    8   12:getfield        #103 <Field TimeBasedFileNamingAndTriggeringPolicy timeBasedFileNamingAndTriggeringPolicy>
	//    9   15:invokeinterface #108 <Method String TimeBasedFileNamingAndTriggeringPolicy.getCurrentPeriodsFileNameWithoutCompressionSuffix()>
	//   10   20:areturn         
	}

	public int getMaxHistory()
	{
		return maxHistory;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int maxHistory>
	//    2    4:ireturn         
	}

	public TimeBasedFileNamingAndTriggeringPolicy getTimeBasedFileNamingAndTriggeringPolicy()
	{
		return timeBasedFileNamingAndTriggeringPolicy;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field TimeBasedFileNamingAndTriggeringPolicy timeBasedFileNamingAndTriggeringPolicy>
	//    2    4:areturn         
	}

	public boolean isCleanHistoryOnStart()
	{
		return cleanHistoryOnStart;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field boolean cleanHistoryOnStart>
	//    2    4:ireturn         
	}

	public boolean isTriggeringEvent(File file, Object obj)
	{
		return timeBasedFileNamingAndTriggeringPolicy.isTriggeringEvent(file, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field TimeBasedFileNamingAndTriggeringPolicy timeBasedFileNamingAndTriggeringPolicy>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #120 <Method boolean TimeBasedFileNamingAndTriggeringPolicy.isTriggeringEvent(File, Object)>
	//    5   11:ireturn         
	}

	Future renamedRawAndAsyncCompress(String s, String s1)
	{
		String s2 = getParentsRawFileProperty();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #101 <Method String getParentsRawFileProperty()>
	//    2    4:astore_3        
		Object obj = ((Object) (new StringBuilder()));
	//    3    5:new             #125 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #126 <Method void StringBuilder()>
	//    6   12:astore          4
		((StringBuilder) (obj)).append(s2);
	//    7   14:aload           4
	//    8   16:aload_3         
	//    9   17:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   10   20:pop             
		((StringBuilder) (obj)).append(System.nanoTime());
	//   11   21:aload           4
	//   12   23:invokestatic    #136 <Method long System.nanoTime()>
	//   13   26:invokevirtual   #139 <Method StringBuilder StringBuilder.append(long)>
	//   14   29:pop             
		((StringBuilder) (obj)).append(".tmp");
	//   15   30:aload           4
	//   16   32:ldc1            #141 <String ".tmp">
	//   17   34:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   18   37:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   19   38:aload           4
	//   20   40:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   21   43:astore          4
		renameUtil.rename(s2, ((String) (obj)));
	//   22   45:aload_0         
	//   23   46:getfield        #40  <Field RenameUtil renameUtil>
	//   24   49:aload_3         
	//   25   50:aload           4
	//   26   52:invokevirtual   #148 <Method void RenameUtil.rename(String, String)>
		return asyncCompress(((String) (obj)), s, s1);
	//   27   55:aload_0         
	//   28   56:aload           4
	//   29   58:aload_1         
	//   30   59:aload_2         
	//   31   60:invokevirtual   #150 <Method Future asyncCompress(String, String, String)>
	//   32   63:areturn         
	}

	public void rollover()
	{
		Object obj = ((Object) (timeBasedFileNamingAndTriggeringPolicy.getElapsedPeriodsFileName()));
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field TimeBasedFileNamingAndTriggeringPolicy timeBasedFileNamingAndTriggeringPolicy>
	//    2    4:invokeinterface #154 <Method String TimeBasedFileNamingAndTriggeringPolicy.getElapsedPeriodsFileName()>
	//    3    9:astore_1        
		String s = FileFilterUtil.afterLastSlash(((String) (obj)));
	//    4   10:aload_1         
	//    5   11:invokestatic    #55  <Method String FileFilterUtil.afterLastSlash(String)>
	//    6   14:astore_2        
		if(compressionMode == CompressionMode.NONE)
	//*   7   15:aload_0         
	//*   8   16:getfield        #158 <Field CompressionMode compressionMode>
	//*   9   19:getstatic       #163 <Field CompressionMode CompressionMode.NONE>
	//*  10   22:if_acmpne       47
		{
			if(getParentsRawFileProperty() != null)
	//*  11   25:aload_0         
	//*  12   26:invokevirtual   #101 <Method String getParentsRawFileProperty()>
	//*  13   29:ifnull          80
				renameUtil.rename(getParentsRawFileProperty(), ((String) (obj)));
	//   14   32:aload_0         
	//   15   33:getfield        #40  <Field RenameUtil renameUtil>
	//   16   36:aload_0         
	//   17   37:invokevirtual   #101 <Method String getParentsRawFileProperty()>
	//   18   40:aload_1         
	//   19   41:invokevirtual   #148 <Method void RenameUtil.rename(String, String)>
		} else
	//*  20   44:goto            80
		{
			if(getParentsRawFileProperty() == null)
	//*  21   47:aload_0         
	//*  22   48:invokevirtual   #101 <Method String getParentsRawFileProperty()>
	//*  23   51:ifnonnull       70
				obj = ((Object) (asyncCompress(((String) (obj)), ((String) (obj)), s)));
	//   24   54:aload_0         
	//   25   55:aload_1         
	//   26   56:aload_1         
	//   27   57:aload_2         
	//   28   58:invokevirtual   #150 <Method Future asyncCompress(String, String, String)>
	//   29   61:astore_1        
			else
	//*  30   62:aload_0         
	//*  31   63:aload_1         
	//*  32   64:putfield        #62  <Field Future future>
	//*  33   67:goto            80
				obj = ((Object) (renamedRawAndAsyncCompress(((String) (obj)), s)));
	//   34   70:aload_0         
	//   35   71:aload_1         
	//   36   72:aload_2         
	//   37   73:invokevirtual   #165 <Method Future renamedRawAndAsyncCompress(String, String)>
	//   38   76:astore_1        
			future = ((Future) (obj));
		}
	//*  39   77:goto            62
		if(archiveRemover != null)
	//*  40   80:aload_0         
	//*  41   81:getfield        #167 <Field ArchiveRemover archiveRemover>
	//*  42   84:ifnull          112
			archiveRemover.clean(new Date(timeBasedFileNamingAndTriggeringPolicy.getCurrentTime()));
	//   43   87:aload_0         
	//   44   88:getfield        #167 <Field ArchiveRemover archiveRemover>
	//   45   91:new             #169 <Class Date>
	//   46   94:dup             
	//   47   95:aload_0         
	//   48   96:getfield        #103 <Field TimeBasedFileNamingAndTriggeringPolicy timeBasedFileNamingAndTriggeringPolicy>
	//   49   99:invokeinterface #172 <Method long TimeBasedFileNamingAndTriggeringPolicy.getCurrentTime()>
	//   50  104:invokespecial   #175 <Method void Date(long)>
	//   51  107:invokeinterface #181 <Method void ArchiveRemover.clean(Date)>
	//   52  112:return          
	}

	public void setCleanHistoryOnStart(boolean flag)
	{
		cleanHistoryOnStart = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #44  <Field boolean cleanHistoryOnStart>
	//    3    5:return          
	}

	public void setMaxHistory(int i)
	{
		maxHistory = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #42  <Field int maxHistory>
	//    3    5:return          
	}

	public void setTimeBasedFileNamingAndTriggeringPolicy(TimeBasedFileNamingAndTriggeringPolicy timebasedfilenamingandtriggeringpolicy)
	{
		timeBasedFileNamingAndTriggeringPolicy = timebasedfilenamingandtriggeringpolicy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #103 <Field TimeBasedFileNamingAndTriggeringPolicy timeBasedFileNamingAndTriggeringPolicy>
	//    3    5:return          
	}

	public void start()
	{
		renameUtil.setContext(context);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field RenameUtil renameUtil>
	//    2    4:aload_0         
	//    3    5:getfield        #193 <Field ch.qos.logback.core.Context context>
	//    4    8:invokevirtual   #197 <Method void RenameUtil.setContext(ch.qos.logback.core.Context)>
		if(fileNamePatternStr != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #200 <Field String fileNamePatternStr>
	//*   7   15:ifnull          292
		{
			fileNamePattern = new FileNamePattern(fileNamePatternStr, context);
	//    8   18:aload_0         
	//    9   19:new             #202 <Class FileNamePattern>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:getfield        #200 <Field String fileNamePatternStr>
	//   13   27:aload_0         
	//   14   28:getfield        #193 <Field ch.qos.logback.core.Context context>
	//   15   31:invokespecial   #205 <Method void FileNamePattern(String, ch.qos.logback.core.Context)>
	//   16   34:putfield        #208 <Field FileNamePattern fileNamePattern>
			determineCompressionMode();
	//   17   37:aload_0         
	//   18   38:invokevirtual   #211 <Method void determineCompressionMode()>
			compressor = new Compressor(compressionMode);
	//   19   41:aload_0         
	//   20   42:new             #213 <Class Compressor>
	//   21   45:dup             
	//   22   46:aload_0         
	//   23   47:getfield        #158 <Field CompressionMode compressionMode>
	//   24   50:invokespecial   #216 <Method void Compressor(CompressionMode)>
	//   25   53:putfield        #90  <Field Compressor compressor>
			compressor.setContext(context);
	//   26   56:aload_0         
	//   27   57:getfield        #90  <Field Compressor compressor>
	//   28   60:aload_0         
	//   29   61:getfield        #193 <Field ch.qos.logback.core.Context context>
	//   30   64:invokevirtual   #217 <Method void Compressor.setContext(ch.qos.logback.core.Context)>
			fileNamePatternWCS = new FileNamePattern(Compressor.computeFileNameStr_WCS(fileNamePatternStr, compressionMode), context);
	//   31   67:aload_0         
	//   32   68:new             #202 <Class FileNamePattern>
	//   33   71:dup             
	//   34   72:aload_0         
	//   35   73:getfield        #200 <Field String fileNamePatternStr>
	//   36   76:aload_0         
	//   37   77:getfield        #158 <Field CompressionMode compressionMode>
	//   38   80:invokestatic    #221 <Method String Compressor.computeFileNameStr_WCS(String, CompressionMode)>
	//   39   83:aload_0         
	//   40   84:getfield        #193 <Field ch.qos.logback.core.Context context>
	//   41   87:invokespecial   #205 <Method void FileNamePattern(String, ch.qos.logback.core.Context)>
	//   42   90:putfield        #223 <Field FileNamePattern fileNamePatternWCS>
			StringBuilder stringbuilder = new StringBuilder();
	//   43   93:new             #125 <Class StringBuilder>
	//   44   96:dup             
	//   45   97:invokespecial   #126 <Method void StringBuilder()>
	//   46  100:astore_1        
			stringbuilder.append("Will use the pattern ");
	//   47  101:aload_1         
	//   48  102:ldc1            #225 <String "Will use the pattern ">
	//   49  104:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   50  107:pop             
			stringbuilder.append(((Object) (fileNamePatternWCS)));
	//   51  108:aload_1         
	//   52  109:aload_0         
	//   53  110:getfield        #223 <Field FileNamePattern fileNamePatternWCS>
	//   54  113:invokevirtual   #228 <Method StringBuilder StringBuilder.append(Object)>
	//   55  116:pop             
			stringbuilder.append(" for the active file");
	//   56  117:aload_1         
	//   57  118:ldc1            #230 <String " for the active file">
	//   58  120:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   59  123:pop             
			addInfo(stringbuilder.toString());
	//   60  124:aload_0         
	//   61  125:aload_1         
	//   62  126:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   63  129:invokevirtual   #234 <Method void addInfo(String)>
			if(compressionMode == CompressionMode.ZIP)
	//*  64  132:aload_0         
	//*  65  133:getfield        #158 <Field CompressionMode compressionMode>
	//*  66  136:getstatic       #237 <Field CompressionMode CompressionMode.ZIP>
	//*  67  139:if_acmpne       165
				zipEntryFileNamePattern = new FileNamePattern(transformFileNamePattern2ZipEntry(fileNamePatternStr), context);
	//   68  142:aload_0         
	//   69  143:new             #202 <Class FileNamePattern>
	//   70  146:dup             
	//   71  147:aload_0         
	//   72  148:aload_0         
	//   73  149:getfield        #200 <Field String fileNamePatternStr>
	//   74  152:invokespecial   #239 <Method String transformFileNamePattern2ZipEntry(String)>
	//   75  155:aload_0         
	//   76  156:getfield        #193 <Field ch.qos.logback.core.Context context>
	//   77  159:invokespecial   #205 <Method void FileNamePattern(String, ch.qos.logback.core.Context)>
	//   78  162:putfield        #242 <Field FileNamePattern zipEntryFileNamePattern>
			if(timeBasedFileNamingAndTriggeringPolicy == null)
	//*  79  165:aload_0         
	//*  80  166:getfield        #103 <Field TimeBasedFileNamingAndTriggeringPolicy timeBasedFileNamingAndTriggeringPolicy>
	//*  81  169:ifnonnull       183
				timeBasedFileNamingAndTriggeringPolicy = ((TimeBasedFileNamingAndTriggeringPolicy) (new DefaultTimeBasedFileNamingAndTriggeringPolicy()));
	//   82  172:aload_0         
	//   83  173:new             #244 <Class DefaultTimeBasedFileNamingAndTriggeringPolicy>
	//   84  176:dup             
	//   85  177:invokespecial   #245 <Method void DefaultTimeBasedFileNamingAndTriggeringPolicy()>
	//   86  180:putfield        #103 <Field TimeBasedFileNamingAndTriggeringPolicy timeBasedFileNamingAndTriggeringPolicy>
			timeBasedFileNamingAndTriggeringPolicy.setContext(context);
	//   87  183:aload_0         
	//   88  184:getfield        #103 <Field TimeBasedFileNamingAndTriggeringPolicy timeBasedFileNamingAndTriggeringPolicy>
	//   89  187:aload_0         
	//   90  188:getfield        #193 <Field ch.qos.logback.core.Context context>
	//   91  191:invokeinterface #246 <Method void TimeBasedFileNamingAndTriggeringPolicy.setContext(ch.qos.logback.core.Context)>
			timeBasedFileNamingAndTriggeringPolicy.setTimeBasedRollingPolicy(this);
	//   92  196:aload_0         
	//   93  197:getfield        #103 <Field TimeBasedFileNamingAndTriggeringPolicy timeBasedFileNamingAndTriggeringPolicy>
	//   94  200:aload_0         
	//   95  201:invokeinterface #250 <Method void TimeBasedFileNamingAndTriggeringPolicy.setTimeBasedRollingPolicy(TimeBasedRollingPolicy)>
			timeBasedFileNamingAndTriggeringPolicy.start();
	//   96  206:aload_0         
	//   97  207:getfield        #103 <Field TimeBasedFileNamingAndTriggeringPolicy timeBasedFileNamingAndTriggeringPolicy>
	//   98  210:invokeinterface #252 <Method void TimeBasedFileNamingAndTriggeringPolicy.start()>
			if(maxHistory != 0)
	//*  99  215:aload_0         
	//* 100  216:getfield        #42  <Field int maxHistory>
	//* 101  219:ifeq            287
			{
				archiveRemover = timeBasedFileNamingAndTriggeringPolicy.getArchiveRemover();
	//  102  222:aload_0         
	//  103  223:aload_0         
	//  104  224:getfield        #103 <Field TimeBasedFileNamingAndTriggeringPolicy timeBasedFileNamingAndTriggeringPolicy>
	//  105  227:invokeinterface #256 <Method ArchiveRemover TimeBasedFileNamingAndTriggeringPolicy.getArchiveRemover()>
	//  106  232:putfield        #167 <Field ArchiveRemover archiveRemover>
				archiveRemover.setMaxHistory(maxHistory);
	//  107  235:aload_0         
	//  108  236:getfield        #167 <Field ArchiveRemover archiveRemover>
	//  109  239:aload_0         
	//  110  240:getfield        #42  <Field int maxHistory>
	//  111  243:invokeinterface #258 <Method void ArchiveRemover.setMaxHistory(int)>
				if(cleanHistoryOnStart)
	//* 112  248:aload_0         
	//* 113  249:getfield        #44  <Field boolean cleanHistoryOnStart>
	//* 114  252:ifeq            287
				{
					addInfo("Cleaning on start up");
	//  115  255:aload_0         
	//  116  256:ldc2            #260 <String "Cleaning on start up">
	//  117  259:invokevirtual   #234 <Method void addInfo(String)>
					archiveRemover.clean(new Date(timeBasedFileNamingAndTriggeringPolicy.getCurrentTime()));
	//  118  262:aload_0         
	//  119  263:getfield        #167 <Field ArchiveRemover archiveRemover>
	//  120  266:new             #169 <Class Date>
	//  121  269:dup             
	//  122  270:aload_0         
	//  123  271:getfield        #103 <Field TimeBasedFileNamingAndTriggeringPolicy timeBasedFileNamingAndTriggeringPolicy>
	//  124  274:invokeinterface #172 <Method long TimeBasedFileNamingAndTriggeringPolicy.getCurrentTime()>
	//  125  279:invokespecial   #175 <Method void Date(long)>
	//  126  282:invokeinterface #181 <Method void ArchiveRemover.clean(Date)>
				}
			}
			super.start();
	//  127  287:aload_0         
	//  128  288:invokespecial   #261 <Method void RollingPolicyBase.start()>
			return;
	//  129  291:return          
		} else
		{
			addWarn("The FileNamePattern option must be set before using TimeBasedRollingPolicy. ");
	//  130  292:aload_0         
	//  131  293:ldc1            #11  <String "The FileNamePattern option must be set before using TimeBasedRollingPolicy. ">
	//  132  295:invokevirtual   #264 <Method void addWarn(String)>
			addWarn("See also http://logback.qos.ch/codes.html#tbr_fnp_not_set");
	//  133  298:aload_0         
	//  134  299:ldc2            #266 <String "See also http://logback.qos.ch/codes.html#tbr_fnp_not_set">
	//  135  302:invokevirtual   #264 <Method void addWarn(String)>
			throw new IllegalStateException("The FileNamePattern option must be set before using TimeBasedRollingPolicy. See also http://logback.qos.ch/codes.html#tbr_fnp_not_set");
	//  136  305:new             #268 <Class IllegalStateException>
	//  137  308:dup             
	//  138  309:ldc2            #270 <String "The FileNamePattern option must be set before using TimeBasedRollingPolicy. See also http://logback.qos.ch/codes.html#tbr_fnp_not_set">
	//  139  312:invokespecial   #272 <Method void IllegalStateException(String)>
	//  140  315:athrow          
		}
	}

	public void stop()
	{
		if(!isStarted())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #276 <Method boolean isStarted()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			waitForAsynchronousJobToStop();
	//    4    8:aload_0         
	//    5    9:invokespecial   #278 <Method void waitForAsynchronousJobToStop()>
			super.stop();
	//    6   12:aload_0         
	//    7   13:invokespecial   #280 <Method void RollingPolicyBase.stop()>
			return;
	//    8   16:return          
		}
	}

	public String toString()
	{
		return "c.q.l.core.rolling.TimeBasedRollingPolicy";
	//    0    0:ldc2            #282 <String "c.q.l.core.rolling.TimeBasedRollingPolicy">
	//    1    3:areturn         
	}

	static final String FNP_NOT_SET = "The FileNamePattern option must be set before using TimeBasedRollingPolicy. ";
	static final int INFINITE_HISTORY = 0;
	private ArchiveRemover archiveRemover;
	boolean cleanHistoryOnStart;
	private Compressor compressor;
	FileNamePattern fileNamePatternWCS;
	Future future;
	private int maxHistory;
	private RenameUtil renameUtil;
	TimeBasedFileNamingAndTriggeringPolicy timeBasedFileNamingAndTriggeringPolicy;
}
