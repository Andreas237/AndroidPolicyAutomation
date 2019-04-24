// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.rolling.RollingFileAppender;
import ch.qos.logback.core.rolling.RolloverFailure;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.EnvUtil;
import ch.qos.logback.core.util.FileUtil;
import java.io.File;

// Referenced classes of package ch.qos.logback.core.rolling.helper:
//			FileStoreUtil

public class RenameUtil extends ContextAwareBase
{

	public RenameUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void ContextAwareBase()>
	//    2    4:return          
	}

	boolean areOnDifferentVolumes(File file, File file1)
	{
		if(!EnvUtil.isJDK7OrHigher())
	//*   0    0:invokestatic    #24  <Method boolean EnvUtil.isJDK7OrHigher()>
	//*   1    3:ifne            8
			return false;
	//    2    6:iconst_0        
	//    3    7:ireturn         
		file1 = file1.getParentFile();
	//    4    8:aload_2         
	//    5    9:invokevirtual   #30  <Method File File.getParentFile()>
	//    6   12:astore_2        
		boolean flag;
		try
		{
			flag = FileStoreUtil.areOnSameFileStore(file, file1);
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokestatic    #35  <Method boolean FileStoreUtil.areOnSameFileStore(File, File)>
	//   10   18:istore_3        
		}
	//*  11   19:iload_3         
	//*  12   20:iconst_1        
	//*  13   21:ixor            
	//*  14   22:ireturn         
		// Misplaced declaration of an exception variable
		catch(File file)
	//*  15   23:astore_1        
		{
			addWarn("Error while checking file store equality", ((Throwable) (file)));
	//   16   24:aload_0         
	//   17   25:ldc1            #37  <String "Error while checking file store equality">
	//   18   27:aload_1         
	//   19   28:invokevirtual   #41  <Method void addWarn(String, Throwable)>
			return false;
	//   20   31:iconst_0        
	//   21   32:ireturn         
		}
		return flag ^ true;
	}

	void createMissingTargetDirsIfNecessary(File file)
	{
		if(FileUtil.isParentDirectoryCreationRequired(file) && !FileUtil.createMissingParentDirectories(file))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #49  <Method boolean FileUtil.isParentDirectoryCreationRequired(File)>
	//*   2    4:ifeq            57
	//*   3    7:aload_1         
	//*   4    8:invokestatic    #52  <Method boolean FileUtil.createMissingParentDirectories(File)>
	//*   5   11:ifne            57
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   14:new             #54  <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #55  <Method void StringBuilder()>
	//    9   21:astore_2        
			stringbuilder.append("Failed to create parent directories for [");
	//   10   22:aload_2         
	//   11   23:ldc1            #57  <String "Failed to create parent directories for [">
	//   12   25:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   13   28:pop             
			stringbuilder.append(file.getAbsolutePath());
	//   14   29:aload_2         
	//   15   30:aload_1         
	//   16   31:invokevirtual   #65  <Method String File.getAbsolutePath()>
	//   17   34:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   18   37:pop             
			stringbuilder.append("]");
	//   19   38:aload_2         
	//   20   39:ldc1            #67  <String "]">
	//   21   41:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   22   44:pop             
			throw new RolloverFailure(stringbuilder.toString());
	//   23   45:new             #18  <Class RolloverFailure>
	//   24   48:dup             
	//   25   49:aload_2         
	//   26   50:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   27   53:invokespecial   #73  <Method void RolloverFailure(String)>
	//   28   56:athrow          
		} else
		{
			return;
	//   29   57:return          
		}
	}

	public void rename(String s, String s1)
	{
		if(s.equals(((Object) (s1))))
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:invokevirtual   #81  <Method boolean String.equals(Object)>
	//*   3    5:ifeq            45
		{
			s1 = ((String) (new StringBuilder()));
	//    4    8:new             #54  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #55  <Method void StringBuilder()>
	//    7   15:astore_2        
			((StringBuilder) (s1)).append("Source and target files are the same [");
	//    8   16:aload_2         
	//    9   17:ldc1            #83  <String "Source and target files are the same [">
	//   10   19:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
			((StringBuilder) (s1)).append(s);
	//   12   23:aload_2         
	//   13   24:aload_1         
	//   14   25:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   15   28:pop             
			((StringBuilder) (s1)).append("]. Skipping.");
	//   16   29:aload_2         
	//   17   30:ldc1            #85  <String "]. Skipping.">
	//   18   32:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   19   35:pop             
			addWarn(((StringBuilder) (s1)).toString());
	//   20   36:aload_0         
	//   21   37:aload_2         
	//   22   38:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   23   41:invokevirtual   #87  <Method void addWarn(String)>
			return;
	//   24   44:return          
		}
		File file = new File(s);
	//   25   45:new             #26  <Class File>
	//   26   48:dup             
	//   27   49:aload_1         
	//   28   50:invokespecial   #88  <Method void File(String)>
	//   29   53:astore_3        
		if(file.exists())
	//*  30   54:aload_3         
	//*  31   55:invokevirtual   #91  <Method boolean File.exists()>
	//*  32   58:ifeq            338
		{
			File file1 = new File(s1);
	//   33   61:new             #26  <Class File>
	//   34   64:dup             
	//   35   65:aload_2         
	//   36   66:invokespecial   #88  <Method void File(String)>
	//   37   69:astore          4
			createMissingTargetDirsIfNecessary(file1);
	//   38   71:aload_0         
	//   39   72:aload           4
	//   40   74:invokevirtual   #93  <Method void createMissingTargetDirsIfNecessary(File)>
			StringBuilder stringbuilder1 = new StringBuilder();
	//   41   77:new             #54  <Class StringBuilder>
	//   42   80:dup             
	//   43   81:invokespecial   #55  <Method void StringBuilder()>
	//   44   84:astore          5
			stringbuilder1.append("Renaming file [");
	//   45   86:aload           5
	//   46   88:ldc1            #95  <String "Renaming file [">
	//   47   90:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   48   93:pop             
			stringbuilder1.append(((Object) (file)));
	//   49   94:aload           5
	//   50   96:aload_3         
	//   51   97:invokevirtual   #98  <Method StringBuilder StringBuilder.append(Object)>
	//   52  100:pop             
			stringbuilder1.append("] to [");
	//   53  101:aload           5
	//   54  103:ldc1            #100 <String "] to [">
	//   55  105:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   56  108:pop             
			stringbuilder1.append(((Object) (file1)));
	//   57  109:aload           5
	//   58  111:aload           4
	//   59  113:invokevirtual   #98  <Method StringBuilder StringBuilder.append(Object)>
	//   60  116:pop             
			stringbuilder1.append("]");
	//   61  117:aload           5
	//   62  119:ldc1            #67  <String "]">
	//   63  121:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   64  124:pop             
			addInfo(stringbuilder1.toString());
	//   65  125:aload_0         
	//   66  126:aload           5
	//   67  128:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   68  131:invokevirtual   #103 <Method void addInfo(String)>
			if(!file.renameTo(file1))
	//*  69  134:aload_3         
	//*  70  135:aload           4
	//*  71  137:invokevirtual   #106 <Method boolean File.renameTo(File)>
	//*  72  140:ifne            337
			{
				StringBuilder stringbuilder2 = new StringBuilder();
	//   73  143:new             #54  <Class StringBuilder>
	//   74  146:dup             
	//   75  147:invokespecial   #55  <Method void StringBuilder()>
	//   76  150:astore          5
				stringbuilder2.append("Failed to rename file [");
	//   77  152:aload           5
	//   78  154:ldc1            #108 <String "Failed to rename file [">
	//   79  156:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   80  159:pop             
				stringbuilder2.append(((Object) (file)));
	//   81  160:aload           5
	//   82  162:aload_3         
	//   83  163:invokevirtual   #98  <Method StringBuilder StringBuilder.append(Object)>
	//   84  166:pop             
				stringbuilder2.append("] as [");
	//   85  167:aload           5
	//   86  169:ldc1            #110 <String "] as [">
	//   87  171:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   88  174:pop             
				stringbuilder2.append(((Object) (file1)));
	//   89  175:aload           5
	//   90  177:aload           4
	//   91  179:invokevirtual   #98  <Method StringBuilder StringBuilder.append(Object)>
	//   92  182:pop             
				stringbuilder2.append("].");
	//   93  183:aload           5
	//   94  185:ldc1            #112 <String "].">
	//   95  187:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   96  190:pop             
				addWarn(stringbuilder2.toString());
	//   97  191:aload_0         
	//   98  192:aload           5
	//   99  194:invokevirtual   #70  <Method String StringBuilder.toString()>
	//  100  197:invokevirtual   #87  <Method void addWarn(String)>
				if(areOnDifferentVolumes(file, file1))
	//* 101  200:aload_0         
	//* 102  201:aload_3         
	//* 103  202:aload           4
	//* 104  204:invokevirtual   #114 <Method boolean areOnDifferentVolumes(File, File)>
	//* 105  207:ifeq            266
				{
					StringBuilder stringbuilder = new StringBuilder();
	//  106  210:new             #54  <Class StringBuilder>
	//  107  213:dup             
	//  108  214:invokespecial   #55  <Method void StringBuilder()>
	//  109  217:astore_3        
					stringbuilder.append("Detected different file systems for source [");
	//  110  218:aload_3         
	//  111  219:ldc1            #116 <String "Detected different file systems for source [">
	//  112  221:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//  113  224:pop             
					stringbuilder.append(s);
	//  114  225:aload_3         
	//  115  226:aload_1         
	//  116  227:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//  117  230:pop             
					stringbuilder.append("] and target [");
	//  118  231:aload_3         
	//  119  232:ldc1            #118 <String "] and target [">
	//  120  234:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//  121  237:pop             
					stringbuilder.append(s1);
	//  122  238:aload_3         
	//  123  239:aload_2         
	//  124  240:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//  125  243:pop             
					stringbuilder.append("]. Attempting rename by copying.");
	//  126  244:aload_3         
	//  127  245:ldc1            #120 <String "]. Attempting rename by copying.">
	//  128  247:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//  129  250:pop             
					addWarn(stringbuilder.toString());
	//  130  251:aload_0         
	//  131  252:aload_3         
	//  132  253:invokevirtual   #70  <Method String StringBuilder.toString()>
	//  133  256:invokevirtual   #87  <Method void addWarn(String)>
					renameByCopying(s, s1);
	//  134  259:aload_0         
	//  135  260:aload_1         
	//  136  261:aload_2         
	//  137  262:invokevirtual   #123 <Method void renameByCopying(String, String)>
					return;
	//  138  265:return          
				}
				s = ((String) (new StringBuilder()));
	//  139  266:new             #54  <Class StringBuilder>
	//  140  269:dup             
	//  141  270:invokespecial   #55  <Method void StringBuilder()>
	//  142  273:astore_1        
				((StringBuilder) (s)).append("Please consider leaving the [file] option of ");
	//  143  274:aload_1         
	//  144  275:ldc1            #125 <String "Please consider leaving the [file] option of ">
	//  145  277:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//  146  280:pop             
				((StringBuilder) (s)).append(((Class) (ch/qos/logback/core/rolling/RollingFileAppender)).getSimpleName());
	//  147  281:aload_1         
	//  148  282:ldc1            #127 <Class RollingFileAppender>
	//  149  284:invokevirtual   #132 <Method String Class.getSimpleName()>
	//  150  287:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//  151  290:pop             
				((StringBuilder) (s)).append(" empty.");
	//  152  291:aload_1         
	//  153  292:ldc1            #134 <String " empty.">
	//  154  294:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//  155  297:pop             
				addWarn(((StringBuilder) (s)).toString());
	//  156  298:aload_0         
	//  157  299:aload_1         
	//  158  300:invokevirtual   #70  <Method String StringBuilder.toString()>
	//  159  303:invokevirtual   #87  <Method void addWarn(String)>
				s = ((String) (new StringBuilder()));
	//  160  306:new             #54  <Class StringBuilder>
	//  161  309:dup             
	//  162  310:invokespecial   #55  <Method void StringBuilder()>
	//  163  313:astore_1        
				((StringBuilder) (s)).append("See also ");
	//  164  314:aload_1         
	//  165  315:ldc1            #136 <String "See also ">
	//  166  317:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//  167  320:pop             
				((StringBuilder) (s)).append(RENAMING_ERROR_URL);
	//  168  321:aload_1         
	//  169  322:getstatic       #138 <Field String RENAMING_ERROR_URL>
	//  170  325:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//  171  328:pop             
				addWarn(((StringBuilder) (s)).toString());
	//  172  329:aload_0         
	//  173  330:aload_1         
	//  174  331:invokevirtual   #70  <Method String StringBuilder.toString()>
	//  175  334:invokevirtual   #87  <Method void addWarn(String)>
			}
			return;
	//  176  337:return          
		} else
		{
			s1 = ((String) (new StringBuilder()));
	//  177  338:new             #54  <Class StringBuilder>
	//  178  341:dup             
	//  179  342:invokespecial   #55  <Method void StringBuilder()>
	//  180  345:astore_2        
			((StringBuilder) (s1)).append("File [");
	//  181  346:aload_2         
	//  182  347:ldc1            #140 <String "File [">
	//  183  349:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//  184  352:pop             
			((StringBuilder) (s1)).append(s);
	//  185  353:aload_2         
	//  186  354:aload_1         
	//  187  355:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//  188  358:pop             
			((StringBuilder) (s1)).append("] does not exist.");
	//  189  359:aload_2         
	//  190  360:ldc1            #142 <String "] does not exist.">
	//  191  362:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//  192  365:pop             
			throw new RolloverFailure(((StringBuilder) (s1)).toString());
	//  193  366:new             #18  <Class RolloverFailure>
	//  194  369:dup             
	//  195  370:aload_2         
	//  196  371:invokevirtual   #70  <Method String StringBuilder.toString()>
	//  197  374:invokespecial   #73  <Method void RolloverFailure(String)>
	//  198  377:athrow          
		}
	}

	public void renameByCopying(String s, String s1)
	{
		(new FileUtil(getContext())).copy(s, s1);
	//    0    0:new             #45  <Class FileUtil>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #146 <Method ch.qos.logback.core.Context getContext()>
	//    4    8:invokespecial   #149 <Method void FileUtil(ch.qos.logback.core.Context)>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #152 <Method void FileUtil.copy(String, String)>
		if(!(new File(s)).delete())
	//*   8   16:new             #26  <Class File>
	//*   9   19:dup             
	//*  10   20:aload_1         
	//*  11   21:invokespecial   #88  <Method void File(String)>
	//*  12   24:invokevirtual   #155 <Method boolean File.delete()>
	//*  13   27:ifne            59
		{
			s1 = ((String) (new StringBuilder()));
	//   14   30:new             #54  <Class StringBuilder>
	//   15   33:dup             
	//   16   34:invokespecial   #55  <Method void StringBuilder()>
	//   17   37:astore_2        
			((StringBuilder) (s1)).append("Could not delete ");
	//   18   38:aload_2         
	//   19   39:ldc1            #157 <String "Could not delete ">
	//   20   41:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   21   44:pop             
			((StringBuilder) (s1)).append(s);
	//   22   45:aload_2         
	//   23   46:aload_1         
	//   24   47:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   25   50:pop             
			addWarn(((StringBuilder) (s1)).toString());
	//   26   51:aload_0         
	//   27   52:aload_2         
	//   28   53:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   29   56:invokevirtual   #87  <Method void addWarn(String)>
		}
	//   30   59:return          
	}

	public String toString()
	{
		return "c.q.l.co.rolling.helper.RenameUtil";
	//    0    0:ldc1            #159 <String "c.q.l.co.rolling.helper.RenameUtil">
	//    1    2:areturn         
	}

	static String RENAMING_ERROR_URL = "http://logback.qos.ch/codes.html#renamingError";

	static 
	{
	//    0    0:return          
	}
}
