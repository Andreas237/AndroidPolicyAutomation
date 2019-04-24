// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.pattern.Converter;
import ch.qos.logback.core.pattern.LiteralConverter;
import ch.qos.logback.core.spi.ContextAwareBase;
import java.io.File;
import java.util.Date;

// Referenced classes of package ch.qos.logback.core.rolling.helper:
//			ArchiveRemover, FileFilterUtil, RollingCalendar, FileNamePattern, 
//			DateTokenConverter

public abstract class DefaultArchiveRemover extends ContextAwareBase
	implements ArchiveRemover
{

	public DefaultArchiveRemover(FileNamePattern filenamepattern, RollingCalendar rollingcalendar)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void ContextAwareBase()>
		lastHeartBeat = -1L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #15  <Long -1L>
	//    4    8:putfield        #31  <Field long lastHeartBeat>
		fileNamePattern = filenamepattern;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #33  <Field FileNamePattern fileNamePattern>
		rc = rollingcalendar;
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:putfield        #35  <Field RollingCalendar rc>
		parentClean = computeParentCleaningFlag(filenamepattern);
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #39  <Method boolean computeParentCleaningFlag(FileNamePattern)>
	//   15   27:putfield        #41  <Field boolean parentClean>
	//   16   30:return          
	}

	private void removeFolderIfEmpty(File file, int i)
	{
		if(i >= 3)
	//*   0    0:iload_2         
	//*   1    1:iconst_3        
	//*   2    2:icmplt          6
			return;
	//    3    5:return          
		if(file.isDirectory() && FileFilterUtil.isEmptyDirectory(file))
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #50  <Method boolean File.isDirectory()>
	//*   6   10:ifeq            72
	//*   7   13:aload_1         
	//*   8   14:invokestatic    #56  <Method boolean FileFilterUtil.isEmptyDirectory(File)>
	//*   9   17:ifeq            72
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   10   20:new             #58  <Class StringBuilder>
	//   11   23:dup             
	//   12   24:invokespecial   #59  <Method void StringBuilder()>
	//   13   27:astore_3        
			stringbuilder.append("deleting folder [");
	//   14   28:aload_3         
	//   15   29:ldc1            #61  <String "deleting folder [">
	//   16   31:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:pop             
			stringbuilder.append(((Object) (file)));
	//   18   35:aload_3         
	//   19   36:aload_1         
	//   20   37:invokevirtual   #68  <Method StringBuilder StringBuilder.append(Object)>
	//   21   40:pop             
			stringbuilder.append("]");
	//   22   41:aload_3         
	//   23   42:ldc1            #70  <String "]">
	//   24   44:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   25   47:pop             
			addInfo(stringbuilder.toString());
	//   26   48:aload_0         
	//   27   49:aload_3         
	//   28   50:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   29   53:invokevirtual   #78  <Method void addInfo(String)>
			file.delete();
	//   30   56:aload_1         
	//   31   57:invokevirtual   #81  <Method boolean File.delete()>
	//   32   60:pop             
			removeFolderIfEmpty(file.getParentFile(), i + 1);
	//   33   61:aload_0         
	//   34   62:aload_1         
	//   35   63:invokevirtual   #85  <Method File File.getParentFile()>
	//   36   66:iload_2         
	//   37   67:iconst_1        
	//   38   68:iadd            
	//   39   69:invokespecial   #87  <Method void removeFolderIfEmpty(File, int)>
		}
	//   40   72:return          
	}

	public void clean(Date date)
	{
		long l = date.getTime();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #95  <Method long Date.getTime()>
	//    2    4:lstore          4
		int j = computeElapsedPeriodsSinceLastClean(l);
	//    3    6:aload_0         
	//    4    7:lload           4
	//    5    9:invokevirtual   #99  <Method int computeElapsedPeriodsSinceLastClean(long)>
	//    6   12:istore_3        
		lastHeartBeat = l;
	//    7   13:aload_0         
	//    8   14:lload           4
	//    9   16:putfield        #31  <Field long lastHeartBeat>
		if(j > 1)
	//*  10   19:iload_3         
	//*  11   20:iconst_1        
	//*  12   21:icmple          57
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   13   24:new             #58  <Class StringBuilder>
	//   14   27:dup             
	//   15   28:invokespecial   #59  <Method void StringBuilder()>
	//   16   31:astore          6
			stringbuilder.append("periodsElapsed = ");
	//   17   33:aload           6
	//   18   35:ldc1            #101 <String "periodsElapsed = ">
	//   19   37:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   20   40:pop             
			stringbuilder.append(j);
	//   21   41:aload           6
	//   22   43:iload_3         
	//   23   44:invokevirtual   #104 <Method StringBuilder StringBuilder.append(int)>
	//   24   47:pop             
			addInfo(stringbuilder.toString());
	//   25   48:aload_0         
	//   26   49:aload           6
	//   27   51:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   28   54:invokevirtual   #78  <Method void addInfo(String)>
		}
		for(int i = 0; i < j; i++)
	//*  29   57:iconst_0        
	//*  30   58:istore_2        
	//*  31   59:iload_2         
	//*  32   60:iload_3         
	//*  33   61:icmpge          82
			cleanByPeriodOffset(date, periodOffsetForDeletionTarget - i);
	//   34   64:aload_0         
	//   35   65:aload_1         
	//   36   66:aload_0         
	//   37   67:getfield        #106 <Field int periodOffsetForDeletionTarget>
	//   38   70:iload_2         
	//   39   71:isub            
	//   40   72:invokevirtual   #110 <Method void cleanByPeriodOffset(Date, int)>

	//   41   75:iload_2         
	//   42   76:iconst_1        
	//   43   77:iadd            
	//   44   78:istore_2        
	//*  45   79:goto            59
	//   46   82:return          
	}

	abstract void cleanByPeriodOffset(Date date, int i);

	int computeElapsedPeriodsSinceLastClean(long l)
	{
		long l2 = lastHeartBeat;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field long lastHeartBeat>
	//    2    4:lstore          5
		long l1 = 1L;
	//    3    6:lconst_1        
	//    4    7:lstore_3        
		if(l2 == -1L)
	//*   5    8:lload           5
	//*   6   10:ldc2w           #15  <Long -1L>
	//*   7   13:lcmp            
	//*   8   14:ifne            54
		{
			addInfo("first clean up after appender initialization");
	//    9   17:aload_0         
	//   10   18:ldc1            #112 <String "first clean up after appender initialization">
	//   11   20:invokevirtual   #78  <Method void addInfo(String)>
			l1 = rc.periodsElapsed(l, 0x49970000L + l);
	//   12   23:aload_0         
	//   13   24:getfield        #35  <Field RollingCalendar rc>
	//   14   27:lload_1         
	//   15   28:ldc2w           #9   <Long 0x49970000L>
	//   16   31:lload_1         
	//   17   32:ladd            
	//   18   33:invokevirtual   #118 <Method long RollingCalendar.periodsElapsed(long, long)>
	//   19   36:lstore_3        
			l = l1;
	//   20   37:lload_3         
	//   21   38:lstore_1        
			if(l1 > 336L)
	//*  22   39:lload_3         
	//*  23   40:ldc2w           #119 <Long 336L>
	//*  24   43:lcmp            
	//*  25   44:ifle            111
				l = 336L;
	//   26   47:ldc2w           #119 <Long 336L>
	//   27   50:lstore_1        
		} else
	//*  28   51:goto            111
		{
			l = rc.periodsElapsed(lastHeartBeat, l);
	//   29   54:aload_0         
	//   30   55:getfield        #35  <Field RollingCalendar rc>
	//   31   58:aload_0         
	//   32   59:getfield        #31  <Field long lastHeartBeat>
	//   33   62:lload_1         
	//   34   63:invokevirtual   #118 <Method long RollingCalendar.periodsElapsed(long, long)>
	//   35   66:lstore_1        
			if(l < 1L)
	//*  36   67:lload_1         
	//*  37   68:lconst_1        
	//*  38   69:lcmp            
	//*  39   70:ifge            111
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   40   73:new             #58  <Class StringBuilder>
	//   41   76:dup             
	//   42   77:invokespecial   #59  <Method void StringBuilder()>
	//   43   80:astore          7
				stringbuilder.append("Unexpected periodsElapsed value ");
	//   44   82:aload           7
	//   45   84:ldc1            #122 <String "Unexpected periodsElapsed value ">
	//   46   86:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   47   89:pop             
				stringbuilder.append(l);
	//   48   90:aload           7
	//   49   92:lload_1         
	//   50   93:invokevirtual   #125 <Method StringBuilder StringBuilder.append(long)>
	//   51   96:pop             
				addWarn(stringbuilder.toString());
	//   52   97:aload_0         
	//   53   98:aload           7
	//   54  100:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   55  103:invokevirtual   #128 <Method void addWarn(String)>
				l = l1;
	//   56  106:lload_3         
	//   57  107:lstore_1        
			}
		}
	//*  58  108:goto            111
		return (int)l;
	//   59  111:lload_1         
	//   60  112:l2i             
	//   61  113:ireturn         
	}

	boolean computeParentCleaningFlag(FileNamePattern filenamepattern)
	{
		if(filenamepattern.getPrimaryDateTokenConverter().getDatePattern().indexOf('/') != -1)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #134 <Method DateTokenConverter FileNamePattern.getPrimaryDateTokenConverter()>
	//*   2    4:invokevirtual   #139 <Method String DateTokenConverter.getDatePattern()>
	//*   3    7:bipush          47
	//*   4    9:invokevirtual   #145 <Method int String.indexOf(int)>
	//*   5   12:iconst_m1       
	//*   6   13:icmpeq          18
			return true;
	//    7   16:iconst_1        
	//    8   17:ireturn         
		filenamepattern = ((FileNamePattern) (filenamepattern.headTokenConverter));
	//    9   18:aload_1         
	//   10   19:getfield        #149 <Field Converter FileNamePattern.headTokenConverter>
	//   11   22:astore_1        
		Object obj;
		do
		{
			obj = ((Object) (filenamepattern));
	//   12   23:aload_1         
	//   13   24:astore_2        
			if(filenamepattern == null)
				break;
	//   14   25:aload_1         
	//   15   26:ifnull          49
			if(filenamepattern instanceof DateTokenConverter)
	//*  16   29:aload_1         
	//*  17   30:instanceof      #136 <Class DateTokenConverter>
	//*  18   33:ifeq            41
			{
				obj = ((Object) (filenamepattern));
	//   19   36:aload_1         
	//   20   37:astore_2        
				break;
	//   21   38:goto            49
			}
			filenamepattern = ((FileNamePattern) (((Converter) (filenamepattern)).getNext()));
	//   22   41:aload_1         
	//   23   42:invokevirtual   #155 <Method Converter Converter.getNext()>
	//   24   45:astore_1        
		} while(true);
	//   25   46:goto            23
		for(; obj != null; obj = ((Object) (((Converter) (obj)).getNext())))
	//*  26   49:aload_2         
	//*  27   50:ifnull          84
			if((obj instanceof LiteralConverter) && ((Converter) (obj)).convert(((Object) (null))).indexOf('/') != -1)
	//*  28   53:aload_2         
	//*  29   54:instanceof      #157 <Class LiteralConverter>
	//*  30   57:ifeq            76
	//*  31   60:aload_2         
	//*  32   61:aconst_null     
	//*  33   62:invokevirtual   #161 <Method String Converter.convert(Object)>
	//*  34   65:bipush          47
	//*  35   67:invokevirtual   #145 <Method int String.indexOf(int)>
	//*  36   70:iconst_m1       
	//*  37   71:icmpeq          76
				return true;
	//   38   74:iconst_1        
	//   39   75:ireturn         

	//   40   76:aload_2         
	//   41   77:invokevirtual   #155 <Method Converter Converter.getNext()>
	//   42   80:astore_2        
	//*  43   81:goto            49
		return false;
	//   44   84:iconst_0        
	//   45   85:ireturn         
	}

	void removeFolderIfEmpty(File file)
	{
		removeFolderIfEmpty(file, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #87  <Method void removeFolderIfEmpty(File, int)>
	//    4    6:return          
	}

	public void setMaxHistory(int i)
	{
		periodOffsetForDeletionTarget = -i - 1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:ineg            
	//    3    3:iconst_1        
	//    4    4:isub            
	//    5    5:putfield        #106 <Field int periodOffsetForDeletionTarget>
	//    6    8:return          
	}

	protected static final long INACTIVITY_TOLERANCE_IN_MILLIS = 0x49970000L;
	static final int MAX_VALUE_FOR_INACTIVITY_PERIODS = 336;
	protected static final long UNINITIALIZED = -1L;
	final FileNamePattern fileNamePattern;
	long lastHeartBeat;
	final boolean parentClean;
	int periodOffsetForDeletionTarget;
	final RollingCalendar rc;
}
