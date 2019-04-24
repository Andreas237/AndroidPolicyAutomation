// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.rolling;

import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.rolling.helper.CompressionMode;
import ch.qos.logback.core.rolling.helper.FileNamePattern;
import java.io.File;
import java.io.IOException;

// Referenced classes of package ch.qos.logback.core.rolling:
//			RollingPolicyBase, RollingPolicy, RolloverFailure, TriggeringPolicy

public class RollingFileAppender extends FileAppender
{

	public RollingFileAppender()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void FileAppender()>
	//    2    4:return          
	}

	private boolean fileAndPatternCollide()
	{
		if(triggeringPolicy instanceof RollingPolicyBase)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field TriggeringPolicy triggeringPolicy>
	//*   2    4:instanceof      #34  <Class RollingPolicyBase>
	//*   3    7:ifeq            46
		{
			Object obj = ((Object) (((RollingPolicyBase)triggeringPolicy).fileNamePattern));
	//    4   10:aload_0         
	//    5   11:getfield        #32  <Field TriggeringPolicy triggeringPolicy>
	//    6   14:checkcast       #34  <Class RollingPolicyBase>
	//    7   17:getfield        #38  <Field FileNamePattern RollingPolicyBase.fileNamePattern>
	//    8   20:astore_1        
			if(obj != null && fileName != null)
	//*   9   21:aload_1         
	//*  10   22:ifnull          46
	//*  11   25:aload_0         
	//*  12   26:getfield        #41  <Field String fileName>
	//*  13   29:ifnull          46
			{
				obj = ((Object) (((FileNamePattern) (obj)).toRegex()));
	//   14   32:aload_1         
	//   15   33:invokevirtual   #47  <Method String FileNamePattern.toRegex()>
	//   16   36:astore_1        
				return fileName.matches(((String) (obj)));
	//   17   37:aload_0         
	//   18   38:getfield        #41  <Field String fileName>
	//   19   41:aload_1         
	//   20   42:invokevirtual   #53  <Method boolean String.matches(String)>
	//   21   45:ireturn         
			}
		}
		return false;
	//   22   46:iconst_0        
	//   23   47:ireturn         
	}

	public String getFile()
	{
		return rollingPolicy.getActiveFileName();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field RollingPolicy rollingPolicy>
	//    2    4:invokeinterface #61  <Method String RollingPolicy.getActiveFileName()>
	//    3    9:areturn         
	}

	public RollingPolicy getRollingPolicy()
	{
		return rollingPolicy;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field RollingPolicy rollingPolicy>
	//    2    4:areturn         
	}

	public TriggeringPolicy getTriggeringPolicy()
	{
		return triggeringPolicy;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field TriggeringPolicy triggeringPolicy>
	//    2    4:areturn         
	}

	public void rollover()
	{
		ch.qos.logback.core.spi.LogbackLock logbacklock = lock;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field ch.qos.logback.core.spi.LogbackLock lock>
	//    2    4:astore_1        
		logbacklock;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		closeOutputStream();
	//    5    7:aload_0         
	//    6    8:invokevirtual   #79  <Method void closeOutputStream()>
		rollingPolicy.rollover();
	//    7   11:aload_0         
	//    8   12:getfield        #56  <Field RollingPolicy rollingPolicy>
	//    9   15:invokeinterface #81  <Method void RollingPolicy.rollover()>
		  goto _L1
	//*  10   20:goto            34
_L4:
		addWarn("RolloverFailure occurred. Deferring rollover");
	//   11   23:aload_0         
	//   12   24:ldc1            #83  <String "RolloverFailure occurred. Deferring rollover">
	//   13   26:invokevirtual   #87  <Method void addWarn(String)>
		append = true;
	//   14   29:aload_0         
	//   15   30:iconst_1        
	//   16   31:putfield        #91  <Field boolean append>
_L1:
		String s = rollingPolicy.getActiveFileName();
	//   17   34:aload_0         
	//   18   35:getfield        #56  <Field RollingPolicy rollingPolicy>
	//   19   38:invokeinterface #61  <Method String RollingPolicy.getActiveFileName()>
	//   20   43:astore_2        
		currentlyActiveFile = new File(s);
	//   21   44:aload_0         
	//   22   45:new             #93  <Class File>
	//   23   48:dup             
	//   24   49:aload_2         
	//   25   50:invokespecial   #95  <Method void File(String)>
	//   26   53:putfield        #97  <Field File currentlyActiveFile>
		openFile(s);
	//   27   56:aload_0         
	//   28   57:aload_2         
	//   29   58:invokevirtual   #100 <Method boolean openFile(String)>
	//   30   61:pop             
		  goto _L2
	//*  31   62:goto            108
		IOException ioexception;
		ioexception;
	//   32   65:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   33   66:new             #102 <Class StringBuilder>
	//   34   69:dup             
	//   35   70:invokespecial   #103 <Method void StringBuilder()>
	//   36   73:astore          4
		stringbuilder.append("openFile(");
	//   37   75:aload           4
	//   38   77:ldc1            #105 <String "openFile(">
	//   39   79:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   40   82:pop             
		stringbuilder.append(s);
	//   41   83:aload           4
	//   42   85:aload_2         
	//   43   86:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   44   89:pop             
		stringbuilder.append(") failed");
	//   45   90:aload           4
	//   46   92:ldc1            #110 <String ") failed">
	//   47   94:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   48   97:pop             
		addError(stringbuilder.toString(), ((Throwable) (ioexception)));
	//   49   98:aload_0         
	//   50   99:aload           4
	//   51  101:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   52  104:aload_3         
	//   53  105:invokevirtual   #117 <Method void addError(String, Throwable)>
_L2:
		logbacklock;
	//   54  108:aload_1         
		JVM INSTR monitorexit ;
	//   55  109:monitorexit     
		return;
	//   56  110:return          
		Object obj;
		obj;
	//   57  111:astore_2        
		logbacklock;
	//   58  112:aload_1         
		JVM INSTR monitorexit ;
	//   59  113:monitorexit     
		throw obj;
	//   60  114:aload_2         
	//   61  115:athrow          
		obj;
	//   62  116:astore_2        
		if(true) goto _L4; else goto _L3
_L3:
	//*  63  117:goto            23
	}

	public void setFile(String s)
	{
		if(s != null && (triggeringPolicy != null || rollingPolicy != null))
	//*   0    0:aload_1         
	//*   1    1:ifnull          30
	//*   2    4:aload_0         
	//*   3    5:getfield        #32  <Field TriggeringPolicy triggeringPolicy>
	//*   4    8:ifnonnull       18
	//*   5   11:aload_0         
	//*   6   12:getfield        #56  <Field RollingPolicy rollingPolicy>
	//*   7   15:ifnull          30
		{
			addError("File property must be set before any triggeringPolicy or rollingPolicy properties");
	//    8   18:aload_0         
	//    9   19:ldc1            #120 <String "File property must be set before any triggeringPolicy or rollingPolicy properties">
	//   10   21:invokevirtual   #122 <Method void addError(String)>
			addError("Visit http://logback.qos.ch/codes.html#rfa_file_after for more information");
	//   11   24:aload_0         
	//   12   25:ldc1            #124 <String "Visit http://logback.qos.ch/codes.html#rfa_file_after for more information">
	//   13   27:invokevirtual   #122 <Method void addError(String)>
		}
		super.setFile(s);
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:invokespecial   #126 <Method void FileAppender.setFile(String)>
	//   17   35:return          
	}

	public void setRollingPolicy(RollingPolicy rollingpolicy)
	{
		rollingPolicy = rollingpolicy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #56  <Field RollingPolicy rollingPolicy>
		if(rollingPolicy instanceof TriggeringPolicy)
	//*   3    5:aload_0         
	//*   4    6:getfield        #56  <Field RollingPolicy rollingPolicy>
	//*   5    9:instanceof      #130 <Class TriggeringPolicy>
	//*   6   12:ifeq            23
			triggeringPolicy = (TriggeringPolicy)rollingpolicy;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:checkcast       #130 <Class TriggeringPolicy>
	//   10   20:putfield        #32  <Field TriggeringPolicy triggeringPolicy>
	//   11   23:return          
	}

	public void setTriggeringPolicy(TriggeringPolicy triggeringpolicy)
	{
		triggeringPolicy = triggeringpolicy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field TriggeringPolicy triggeringPolicy>
		if(triggeringpolicy instanceof RollingPolicy)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #58  <Class RollingPolicy>
	//*   5    9:ifeq            20
			rollingPolicy = (RollingPolicy)triggeringpolicy;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #58  <Class RollingPolicy>
	//    9   17:putfield        #56  <Field RollingPolicy rollingPolicy>
	//   10   20:return          
	}

	public void start()
	{
		if(triggeringPolicy == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field TriggeringPolicy triggeringPolicy>
	//*   2    4:ifnonnull       71
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    7:new             #102 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #103 <Method void StringBuilder()>
	//    6   14:astore_1        
			stringbuilder.append("No TriggeringPolicy was set for the RollingFileAppender named ");
	//    7   15:aload_1         
	//    8   16:ldc1            #136 <String "No TriggeringPolicy was set for the RollingFileAppender named ">
	//    9   18:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
			stringbuilder.append(getName());
	//   11   22:aload_1         
	//   12   23:aload_0         
	//   13   24:invokevirtual   #139 <Method String getName()>
	//   14   27:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
			addWarn(stringbuilder.toString());
	//   16   31:aload_0         
	//   17   32:aload_1         
	//   18   33:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   19   36:invokevirtual   #87  <Method void addWarn(String)>
			stringbuilder = new StringBuilder();
	//   20   39:new             #102 <Class StringBuilder>
	//   21   42:dup             
	//   22   43:invokespecial   #103 <Method void StringBuilder()>
	//   23   46:astore_1        
			stringbuilder.append("For more information, please visit ");
	//   24   47:aload_1         
	//   25   48:ldc1            #141 <String "For more information, please visit ">
	//   26   50:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   27   53:pop             
			stringbuilder.append(RFA_NO_TP_URL);
	//   28   54:aload_1         
	//   29   55:getstatic       #143 <Field String RFA_NO_TP_URL>
	//   30   58:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   31   61:pop             
			addWarn(stringbuilder.toString());
	//   32   62:aload_0         
	//   33   63:aload_1         
	//   34   64:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   35   67:invokevirtual   #87  <Method void addWarn(String)>
			return;
	//   36   70:return          
		}
		if(!append)
	//*  37   71:aload_0         
	//*  38   72:getfield        #91  <Field boolean append>
	//*  39   75:ifne            89
		{
			addWarn("Append mode is mandatory for RollingFileAppender");
	//   40   78:aload_0         
	//   41   79:ldc1            #145 <String "Append mode is mandatory for RollingFileAppender">
	//   42   81:invokevirtual   #87  <Method void addWarn(String)>
			append = true;
	//   43   84:aload_0         
	//   44   85:iconst_1        
	//   45   86:putfield        #91  <Field boolean append>
		}
		if(rollingPolicy == null)
	//*  46   89:aload_0         
	//*  47   90:getfield        #56  <Field RollingPolicy rollingPolicy>
	//*  48   93:ifnonnull       160
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   49   96:new             #102 <Class StringBuilder>
	//   50   99:dup             
	//   51  100:invokespecial   #103 <Method void StringBuilder()>
	//   52  103:astore_1        
			stringbuilder1.append("No RollingPolicy was set for the RollingFileAppender named ");
	//   53  104:aload_1         
	//   54  105:ldc1            #147 <String "No RollingPolicy was set for the RollingFileAppender named ">
	//   55  107:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   56  110:pop             
			stringbuilder1.append(getName());
	//   57  111:aload_1         
	//   58  112:aload_0         
	//   59  113:invokevirtual   #139 <Method String getName()>
	//   60  116:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   61  119:pop             
			addError(stringbuilder1.toString());
	//   62  120:aload_0         
	//   63  121:aload_1         
	//   64  122:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   65  125:invokevirtual   #122 <Method void addError(String)>
			stringbuilder1 = new StringBuilder();
	//   66  128:new             #102 <Class StringBuilder>
	//   67  131:dup             
	//   68  132:invokespecial   #103 <Method void StringBuilder()>
	//   69  135:astore_1        
			stringbuilder1.append("For more information, please visit ");
	//   70  136:aload_1         
	//   71  137:ldc1            #141 <String "For more information, please visit ">
	//   72  139:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   73  142:pop             
			stringbuilder1.append(RFA_NO_RP_URL);
	//   74  143:aload_1         
	//   75  144:getstatic       #149 <Field String RFA_NO_RP_URL>
	//   76  147:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   77  150:pop             
			addError(stringbuilder1.toString());
	//   78  151:aload_0         
	//   79  152:aload_1         
	//   80  153:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   81  156:invokevirtual   #122 <Method void addError(String)>
			return;
	//   82  159:return          
		}
		if(fileAndPatternCollide())
	//*  83  160:aload_0         
	//*  84  161:invokespecial   #151 <Method boolean fileAndPatternCollide()>
	//*  85  164:ifeq            205
		{
			addError("File property collides with fileNamePattern. Aborting.");
	//   86  167:aload_0         
	//   87  168:ldc1            #153 <String "File property collides with fileNamePattern. Aborting.">
	//   88  170:invokevirtual   #122 <Method void addError(String)>
			StringBuilder stringbuilder2 = new StringBuilder();
	//   89  173:new             #102 <Class StringBuilder>
	//   90  176:dup             
	//   91  177:invokespecial   #103 <Method void StringBuilder()>
	//   92  180:astore_1        
			stringbuilder2.append("For more information, please visit ");
	//   93  181:aload_1         
	//   94  182:ldc1            #141 <String "For more information, please visit ">
	//   95  184:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   96  187:pop             
			stringbuilder2.append(COLLISION_URL);
	//   97  188:aload_1         
	//   98  189:getstatic       #155 <Field String COLLISION_URL>
	//   99  192:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  100  195:pop             
			addError(stringbuilder2.toString());
	//  101  196:aload_0         
	//  102  197:aload_1         
	//  103  198:invokevirtual   #113 <Method String StringBuilder.toString()>
	//  104  201:invokevirtual   #122 <Method void addError(String)>
			return;
	//  105  204:return          
		}
		if(isPrudent())
	//* 106  205:aload_0         
	//* 107  206:invokevirtual   #158 <Method boolean isPrudent()>
	//* 108  209:ifeq            252
		{
			if(rawFileProperty() != null)
	//* 109  212:aload_0         
	//* 110  213:invokevirtual   #161 <Method String rawFileProperty()>
	//* 111  216:ifnull          230
			{
				addWarn("Setting \"File\" property to null on account of prudent mode");
	//  112  219:aload_0         
	//  113  220:ldc1            #163 <String "Setting \"File\" property to null on account of prudent mode">
	//  114  222:invokevirtual   #87  <Method void addWarn(String)>
				setFile(((String) (null)));
	//  115  225:aload_0         
	//  116  226:aconst_null     
	//  117  227:invokevirtual   #164 <Method void setFile(String)>
			}
			if(rollingPolicy.getCompressionMode() != CompressionMode.NONE)
	//* 118  230:aload_0         
	//* 119  231:getfield        #56  <Field RollingPolicy rollingPolicy>
	//* 120  234:invokeinterface #168 <Method CompressionMode RollingPolicy.getCompressionMode()>
	//* 121  239:getstatic       #174 <Field CompressionMode CompressionMode.NONE>
	//* 122  242:if_acmpeq       252
			{
				addError("Compression is not supported in prudent mode. Aborting");
	//  123  245:aload_0         
	//  124  246:ldc1            #176 <String "Compression is not supported in prudent mode. Aborting">
	//  125  248:invokevirtual   #122 <Method void addError(String)>
				return;
	//  126  251:return          
			}
		}
		currentlyActiveFile = new File(getFile());
	//  127  252:aload_0         
	//  128  253:new             #93  <Class File>
	//  129  256:dup             
	//  130  257:aload_0         
	//  131  258:invokevirtual   #178 <Method String getFile()>
	//  132  261:invokespecial   #95  <Method void File(String)>
	//  133  264:putfield        #97  <Field File currentlyActiveFile>
		StringBuilder stringbuilder3 = new StringBuilder();
	//  134  267:new             #102 <Class StringBuilder>
	//  135  270:dup             
	//  136  271:invokespecial   #103 <Method void StringBuilder()>
	//  137  274:astore_1        
		stringbuilder3.append("Active log file name: ");
	//  138  275:aload_1         
	//  139  276:ldc1            #180 <String "Active log file name: ">
	//  140  278:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  141  281:pop             
		stringbuilder3.append(getFile());
	//  142  282:aload_1         
	//  143  283:aload_0         
	//  144  284:invokevirtual   #178 <Method String getFile()>
	//  145  287:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//  146  290:pop             
		addInfo(stringbuilder3.toString());
	//  147  291:aload_0         
	//  148  292:aload_1         
	//  149  293:invokevirtual   #113 <Method String StringBuilder.toString()>
	//  150  296:invokevirtual   #183 <Method void addInfo(String)>
		super.start();
	//  151  299:aload_0         
	//  152  300:invokespecial   #185 <Method void FileAppender.start()>
	//  153  303:return          
	}

	public void stop()
	{
		if(rollingPolicy != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field RollingPolicy rollingPolicy>
	//*   2    4:ifnull          16
			rollingPolicy.stop();
	//    3    7:aload_0         
	//    4    8:getfield        #56  <Field RollingPolicy rollingPolicy>
	//    5   11:invokeinterface #188 <Method void RollingPolicy.stop()>
		if(triggeringPolicy != null)
	//*   6   16:aload_0         
	//*   7   17:getfield        #32  <Field TriggeringPolicy triggeringPolicy>
	//*   8   20:ifnull          32
			triggeringPolicy.stop();
	//    9   23:aload_0         
	//   10   24:getfield        #32  <Field TriggeringPolicy triggeringPolicy>
	//   11   27:invokeinterface #189 <Method void TriggeringPolicy.stop()>
		super.stop();
	//   12   32:aload_0         
	//   13   33:invokespecial   #190 <Method void FileAppender.stop()>
	//   14   36:return          
	}

	protected void subAppend(Object obj)
	{
		synchronized(triggeringPolicy)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field TriggeringPolicy triggeringPolicy>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if(triggeringPolicy.isTriggeringEvent(currentlyActiveFile, obj))
	//*   5    7:aload_0         
	//*   6    8:getfield        #32  <Field TriggeringPolicy triggeringPolicy>
	//*   7   11:aload_0         
	//*   8   12:getfield        #97  <Field File currentlyActiveFile>
	//*   9   15:aload_1         
	//*  10   16:invokeinterface #196 <Method boolean TriggeringPolicy.isTriggeringEvent(File, Object)>
	//*  11   21:ifeq            28
				rollover();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #197 <Method void rollover()>
		}
	//   14   28:aload_2         
	//   15   29:monitorexit     
		super.subAppend(obj);
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:invokespecial   #199 <Method void FileAppender.subAppend(Object)>
		return;
	//   19   35:return          
		obj;
	//   20   36:astore_1        
		triggeringpolicy;
	//   21   37:aload_2         
		JVM INSTR monitorexit ;
	//   22   38:monitorexit     
		throw obj;
	//   23   39:aload_1         
	//   24   40:athrow          
	}

	private static String COLLISION_URL = "http://logback.qos.ch/codes.html#rfa_collision";
	private static String RFA_NO_RP_URL = "http://logback.qos.ch/codes.html#rfa_no_rp";
	private static String RFA_NO_TP_URL = "http://logback.qos.ch/codes.html#rfa_no_tp";
	File currentlyActiveFile;
	RollingPolicy rollingPolicy;
	TriggeringPolicy triggeringPolicy;

	static 
	{
	//    0    0:return          
	}
}
