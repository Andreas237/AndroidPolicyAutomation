// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.rolling.helper;

import java.io.File;
import java.util.Date;

// Referenced classes of package ch.qos.logback.core.rolling.helper:
//			DefaultArchiveRemover, RollingCalendar, FileNamePattern, FileFilterUtil

public class SizeAndTimeBasedArchiveRemover extends DefaultArchiveRemover
{

	public SizeAndTimeBasedArchiveRemover(FileNamePattern filenamepattern, RollingCalendar rollingcalendar)
	{
		super(filenamepattern, rollingcalendar);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #8   <Method void DefaultArchiveRemover(FileNamePattern, RollingCalendar)>
	//    4    6:return          
	}

	public void cleanByPeriodOffset(Date date, int i)
	{
		Object obj = ((Object) (rc.getRelativeDate(date, i)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field RollingCalendar rc>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #21  <Method Date RollingCalendar.getRelativeDate(Date, int)>
	//    5    9:astore          4
		date = ((Date) (FileFilterUtil.afterLastSlash(fileNamePattern.toRegexForFixedDate(((Date) (obj))))));
	//    6   11:aload_0         
	//    7   12:getfield        #25  <Field FileNamePattern fileNamePattern>
	//    8   15:aload           4
	//    9   17:invokevirtual   #31  <Method String FileNamePattern.toRegexForFixedDate(Date)>
	//   10   20:invokestatic    #37  <Method String FileFilterUtil.afterLastSlash(String)>
	//   11   23:astore_1        
		FileNamePattern filenamepattern = fileNamePattern;
	//   12   24:aload_0         
	//   13   25:getfield        #25  <Field FileNamePattern fileNamePattern>
	//   14   28:astore          5
		i = 0;
	//   15   30:iconst_0        
	//   16   31:istore_2        
		obj = ((Object) ((new File(filenamepattern.convertMultipleArguments(new Object[] {
			obj, Integer.valueOf(0)
		}))).getAbsoluteFile().getAbsoluteFile().getParentFile()));
	//   17   32:new             #39  <Class File>
	//   18   35:dup             
	//   19   36:aload           5
	//   20   38:iconst_2        
	//   21   39:anewarray       Object[]
	//   22   42:dup             
	//   23   43:iconst_0        
	//   24   44:aload           4
	//   25   46:aastore         
	//   26   47:dup             
	//   27   48:iconst_1        
	//   28   49:iconst_0        
	//   29   50:invokestatic    #47  <Method Integer Integer.valueOf(int)>
	//   30   53:aastore         
	//   31   54:invokevirtual   #51  <Method String FileNamePattern.convertMultipleArguments(Object[])>
	//   32   57:invokespecial   #54  <Method void File(String)>
	//   33   60:invokevirtual   #58  <Method File File.getAbsoluteFile()>
	//   34   63:invokevirtual   #58  <Method File File.getAbsoluteFile()>
	//   35   66:invokevirtual   #61  <Method File File.getParentFile()>
	//   36   69:astore          4
		date = ((Date) (FileFilterUtil.filesInFolderMatchingStemRegex(((File) (obj)), ((String) (date)))));
	//   37   71:aload           4
	//   38   73:aload_1         
	//   39   74:invokestatic    #65  <Method File[] FileFilterUtil.filesInFolderMatchingStemRegex(File, String)>
	//   40   77:astore_1        
		for(int j = date.length; i < j; i++)
	//*  41   78:aload_1         
	//*  42   79:arraylength     
	//*  43   80:istore_3        
	//*  44   81:iload_2         
	//*  45   82:iload_3         
	//*  46   83:icmpge          100
			((File) (date[i])).delete();
	//   47   86:aload_1         
	//   48   87:iload_2         
	//   49   88:aaload          
	//   50   89:invokevirtual   #69  <Method boolean File.delete()>
	//   51   92:pop             

	//   52   93:iload_2         
	//   53   94:iconst_1        
	//   54   95:iadd            
	//   55   96:istore_2        
	//*  56   97:goto            81
		if(parentClean)
	//*  57  100:aload_0         
	//*  58  101:getfield        #73  <Field boolean parentClean>
	//*  59  104:ifeq            113
			removeFolderIfEmpty(((File) (obj)));
	//   60  107:aload_0         
	//   61  108:aload           4
	//   62  110:invokevirtual   #77  <Method void removeFolderIfEmpty(File)>
	//   63  113:return          
	}
}
