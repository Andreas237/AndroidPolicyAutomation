// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.rolling;

import ch.qos.logback.core.rolling.helper.CompressionMode;
import ch.qos.logback.core.rolling.helper.Compressor;
import ch.qos.logback.core.rolling.helper.FileFilterUtil;
import ch.qos.logback.core.rolling.helper.FileNamePattern;
import ch.qos.logback.core.rolling.helper.RenameUtil;
import java.io.File;
import java.util.Date;

// Referenced classes of package ch.qos.logback.core.rolling:
//			RollingPolicyBase

public class FixedWindowRollingPolicy extends RollingPolicyBase
{

	public FixedWindowRollingPolicy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void RollingPolicyBase()>
		util = new RenameUtil();
	//    2    4:aload_0         
	//    3    5:new             #36  <Class RenameUtil>
	//    4    8:dup             
	//    5    9:invokespecial   #37  <Method void RenameUtil()>
	//    6   12:putfield        #39  <Field RenameUtil util>
		minIndex = 1;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #41  <Field int minIndex>
		maxIndex = 7;
	//   10   20:aload_0         
	//   11   21:bipush          7
	//   12   23:putfield        #43  <Field int maxIndex>
	//   13   26:return          
	}

	private String transformFileNamePatternFromInt2Date(String s)
	{
		return FileFilterUtil.afterLastSlash(FileFilterUtil.slashify(s)).replace("%i", "%d{yyyy-MM-dd_HHmm}");
	//    0    0:aload_1         
	//    1    1:invokestatic    #50  <Method String FileFilterUtil.slashify(String)>
	//    2    4:invokestatic    #53  <Method String FileFilterUtil.afterLastSlash(String)>
	//    3    7:ldc1            #55  <String "%i">
	//    4    9:ldc1            #57  <String "%d{yyyy-MM-dd_HHmm}">
	//    5   11:invokevirtual   #63  <Method String String.replace(CharSequence, CharSequence)>
	//    6   14:areturn         
	}

	public String getActiveFileName()
	{
		return getParentsRawFileProperty();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #68  <Method String getParentsRawFileProperty()>
	//    2    4:areturn         
	}

	public int getMaxIndex()
	{
		return maxIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int maxIndex>
	//    2    4:ireturn         
	}

	protected int getMaxWindowSize()
	{
		return MAX_WINDOW_SIZE;
	//    0    0:getstatic       #73  <Field int MAX_WINDOW_SIZE>
	//    1    3:ireturn         
	}

	public int getMinIndex()
	{
		return minIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int minIndex>
	//    2    4:ireturn         
	}

	public void rollover()
	{
		if(maxIndex < 0) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int maxIndex>
	//    2    4:iflt            273
_L1:
		File file = new File(fileNamePattern.convertInt(maxIndex));
	//    3    7:new             #77  <Class File>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #81  <Field FileNamePattern fileNamePattern>
	//    7   15:aload_0         
	//    8   16:getfield        #43  <Field int maxIndex>
	//    9   19:invokevirtual   #87  <Method String FileNamePattern.convertInt(int)>
	//   10   22:invokespecial   #90  <Method void File(String)>
	//   11   25:astore_2        
		if(file.exists())
	//*  12   26:aload_2         
	//*  13   27:invokevirtual   #94  <Method boolean File.exists()>
	//*  14   30:ifeq            38
			file.delete();
	//   15   33:aload_2         
	//   16   34:invokevirtual   #97  <Method boolean File.delete()>
	//   17   37:pop             
		for(int i = maxIndex - 1; i >= minIndex; i--)
	//*  18   38:aload_0         
	//*  19   39:getfield        #43  <Field int maxIndex>
	//*  20   42:iconst_1        
	//*  21   43:isub            
	//*  22   44:istore_1        
	//*  23   45:iload_1         
	//*  24   46:aload_0         
	//*  25   47:getfield        #41  <Field int minIndex>
	//*  26   50:icmplt          133
		{
			String s = fileNamePattern.convertInt(i);
	//   27   53:aload_0         
	//   28   54:getfield        #81  <Field FileNamePattern fileNamePattern>
	//   29   57:iload_1         
	//   30   58:invokevirtual   #87  <Method String FileNamePattern.convertInt(int)>
	//   31   61:astore_2        
			if((new File(s)).exists())
	//*  32   62:new             #77  <Class File>
	//*  33   65:dup             
	//*  34   66:aload_2         
	//*  35   67:invokespecial   #90  <Method void File(String)>
	//*  36   70:invokevirtual   #94  <Method boolean File.exists()>
	//*  37   73:ifeq            97
			{
				util.rename(s, fileNamePattern.convertInt(i + 1));
	//   38   76:aload_0         
	//   39   77:getfield        #39  <Field RenameUtil util>
	//   40   80:aload_2         
	//   41   81:aload_0         
	//   42   82:getfield        #81  <Field FileNamePattern fileNamePattern>
	//   43   85:iload_1         
	//   44   86:iconst_1        
	//   45   87:iadd            
	//   46   88:invokevirtual   #87  <Method String FileNamePattern.convertInt(int)>
	//   47   91:invokevirtual   #101 <Method void RenameUtil.rename(String, String)>
			} else
	//*  48   94:goto            126
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   49   97:new             #103 <Class StringBuilder>
	//   50  100:dup             
	//   51  101:invokespecial   #104 <Method void StringBuilder()>
	//   52  104:astore_3        
				stringbuilder.append("Skipping roll-over for inexistent file ");
	//   53  105:aload_3         
	//   54  106:ldc1            #106 <String "Skipping roll-over for inexistent file ">
	//   55  108:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   56  111:pop             
				stringbuilder.append(s);
	//   57  112:aload_3         
	//   58  113:aload_2         
	//   59  114:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   60  117:pop             
				addInfo(stringbuilder.toString());
	//   61  118:aload_0         
	//   62  119:aload_3         
	//   63  120:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   64  123:invokevirtual   #116 <Method void addInfo(String)>
			}
		}

	//   65  126:iload_1         
	//   66  127:iconst_1        
	//   67  128:isub            
	//   68  129:istore_1        
	//*  69  130:goto            45
		static class _cls1
		{

			static final int $SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode[];

			static 
			{
				$SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode = new int[CompressionMode.values().length];
			//    0    0:invokestatic    #18  <Method CompressionMode[] CompressionMode.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode>
				try
				{
					$SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode[CompressionMode.NONE.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode>
			//    5   12:getstatic       #24  <Field CompressionMode CompressionMode.NONE>
			//    6   15:invokevirtual   #28  <Method int CompressionMode.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode>
			//*  10   23:getstatic       #31  <Field CompressionMode CompressionMode.GZ>
			//*  11   26:invokevirtual   #28  <Method int CompressionMode.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode>
			//*  15   34:getstatic       #34  <Field CompressionMode CompressionMode.ZIP>
			//*  16   37:invokevirtual   #28  <Method int CompressionMode.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   20   43:astore_0        
				try
				{
					$SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode[CompressionMode.GZ.ordinal()] = 2;
				}
			//*  21   44:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   22   47:astore_0        
				try
				{
					$SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode[CompressionMode.ZIP.ordinal()] = 3;
				}
			//*  23   48:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   24   51:astore_0        
			//*  25   52:return          
			}
		}

		_cls1..SwitchMap.ch.qos.logback.core.rolling.helper.CompressionMode[compressionMode.ordinal()];
	//   70  133:getstatic       #120 <Field int[] FixedWindowRollingPolicy$1.$SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode>
	//   71  136:aload_0         
	//   72  137:getfield        #124 <Field CompressionMode compressionMode>
	//   73  140:invokevirtual   #129 <Method int CompressionMode.ordinal()>
	//   74  143:iaload          
		JVM INSTR tableswitch 1 3: default 172
	//	               1 251
	//	               2 215
	//	               3 173;
	//   75  144:tableswitch     1 3: default 172
	//	               1 251
	//	               2 215
	//	               3 173
		   goto _L3 _L4 _L5 _L6
_L3:
		return;
	//   76  172:return          
_L6:
		Compressor compressor1;
		String s1;
		String s2;
		String s3;
		compressor1 = compressor;
	//   77  173:aload_0         
	//   78  174:getfield        #131 <Field Compressor compressor>
	//   79  177:astore_2        
		s1 = getActiveFileName();
	//   80  178:aload_0         
	//   81  179:invokevirtual   #133 <Method String getActiveFileName()>
	//   82  182:astore_3        
		s2 = fileNamePattern.convertInt(minIndex);
	//   83  183:aload_0         
	//   84  184:getfield        #81  <Field FileNamePattern fileNamePattern>
	//   85  187:aload_0         
	//   86  188:getfield        #41  <Field int minIndex>
	//   87  191:invokevirtual   #87  <Method String FileNamePattern.convertInt(int)>
	//   88  194:astore          4
		s3 = zipEntryFileNamePattern.convert(((Object) (new Date())));
	//   89  196:aload_0         
	//   90  197:getfield        #136 <Field FileNamePattern zipEntryFileNamePattern>
	//   91  200:new             #138 <Class Date>
	//   92  203:dup             
	//   93  204:invokespecial   #139 <Method void Date()>
	//   94  207:invokevirtual   #143 <Method String FileNamePattern.convert(Object)>
	//   95  210:astore          5
		  goto _L7
	//*  96  212:goto            241
_L5:
		compressor1 = compressor;
	//   97  215:aload_0         
	//   98  216:getfield        #131 <Field Compressor compressor>
	//   99  219:astore_2        
		s1 = getActiveFileName();
	//  100  220:aload_0         
	//  101  221:invokevirtual   #133 <Method String getActiveFileName()>
	//  102  224:astore_3        
		s2 = fileNamePattern.convertInt(minIndex);
	//  103  225:aload_0         
	//  104  226:getfield        #81  <Field FileNamePattern fileNamePattern>
	//  105  229:aload_0         
	//  106  230:getfield        #41  <Field int minIndex>
	//  107  233:invokevirtual   #87  <Method String FileNamePattern.convertInt(int)>
	//  108  236:astore          4
		s3 = null;
	//  109  238:aconst_null     
	//  110  239:astore          5
_L7:
		compressor1.compress(s1, s2, s3);
	//  111  241:aload_2         
	//  112  242:aload_3         
	//  113  243:aload           4
	//  114  245:aload           5
	//  115  247:invokevirtual   #149 <Method void Compressor.compress(String, String, String)>
		return;
	//  116  250:return          
_L4:
		util.rename(getActiveFileName(), fileNamePattern.convertInt(minIndex));
	//  117  251:aload_0         
	//  118  252:getfield        #39  <Field RenameUtil util>
	//  119  255:aload_0         
	//  120  256:invokevirtual   #133 <Method String getActiveFileName()>
	//  121  259:aload_0         
	//  122  260:getfield        #81  <Field FileNamePattern fileNamePattern>
	//  123  263:aload_0         
	//  124  264:getfield        #41  <Field int minIndex>
	//  125  267:invokevirtual   #87  <Method String FileNamePattern.convertInt(int)>
	//  126  270:invokevirtual   #101 <Method void RenameUtil.rename(String, String)>
_L2:
	//  127  273:return          
	}

	public void setMaxIndex(int i)
	{
		maxIndex = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #43  <Field int maxIndex>
	//    3    5:return          
	}

	public void setMinIndex(int i)
	{
		minIndex = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #41  <Field int minIndex>
	//    3    5:return          
	}

	public void start()
	{
		util.setContext(context);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field RenameUtil util>
	//    2    4:aload_0         
	//    3    5:getfield        #157 <Field ch.qos.logback.core.Context context>
	//    4    8:invokevirtual   #161 <Method void RenameUtil.setContext(ch.qos.logback.core.Context)>
		if(fileNamePatternStr != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #164 <Field String fileNamePatternStr>
	//*   7   15:ifnull          365
		{
			fileNamePattern = new FileNamePattern(fileNamePatternStr, context);
	//    8   18:aload_0         
	//    9   19:new             #83  <Class FileNamePattern>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:getfield        #164 <Field String fileNamePatternStr>
	//   13   27:aload_0         
	//   14   28:getfield        #157 <Field ch.qos.logback.core.Context context>
	//   15   31:invokespecial   #167 <Method void FileNamePattern(String, ch.qos.logback.core.Context)>
	//   16   34:putfield        #81  <Field FileNamePattern fileNamePattern>
			determineCompressionMode();
	//   17   37:aload_0         
	//   18   38:invokevirtual   #170 <Method void determineCompressionMode()>
			if(isParentPrudent())
	//*  19   41:aload_0         
	//*  20   42:invokevirtual   #173 <Method boolean isParentPrudent()>
	//*  21   45:ifeq            70
			{
				addError("Prudent mode is not supported with FixedWindowRollingPolicy.");
	//   22   48:aload_0         
	//   23   49:ldc1            #175 <String "Prudent mode is not supported with FixedWindowRollingPolicy.">
	//   24   51:invokevirtual   #178 <Method void addError(String)>
				addError("See also http://logback.qos.ch/codes.html#tbr_fnp_prudent_unsupported");
	//   25   54:aload_0         
	//   26   55:ldc1            #16  <String "See also http://logback.qos.ch/codes.html#tbr_fnp_prudent_unsupported">
	//   27   57:invokevirtual   #178 <Method void addError(String)>
				throw new IllegalStateException("Prudent mode is not supported.");
	//   28   60:new             #180 <Class IllegalStateException>
	//   29   63:dup             
	//   30   64:ldc1            #182 <String "Prudent mode is not supported.">
	//   31   66:invokespecial   #183 <Method void IllegalStateException(String)>
	//   32   69:athrow          
			}
			if(getParentsRawFileProperty() == null)
	//*  33   70:aload_0         
	//*  34   71:invokevirtual   #68  <Method String getParentsRawFileProperty()>
	//*  35   74:ifnonnull       99
			{
				addError("The File name property must be set before using this rolling policy.");
	//   36   77:aload_0         
	//   37   78:ldc1            #185 <String "The File name property must be set before using this rolling policy.">
	//   38   80:invokevirtual   #178 <Method void addError(String)>
				addError("Please refer to http://logback.qos.ch/codes.html#fwrp_parentFileName_not_set");
	//   39   83:aload_0         
	//   40   84:ldc1            #19  <String "Please refer to http://logback.qos.ch/codes.html#fwrp_parentFileName_not_set">
	//   41   86:invokevirtual   #178 <Method void addError(String)>
				throw new IllegalStateException("The \"File\" option must be set.");
	//   42   89:new             #180 <Class IllegalStateException>
	//   43   92:dup             
	//   44   93:ldc1            #187 <String "The \"File\" option must be set.">
	//   45   95:invokespecial   #183 <Method void IllegalStateException(String)>
	//   46   98:athrow          
			}
			if(maxIndex < minIndex)
	//*  47   99:aload_0         
	//*  48  100:getfield        #43  <Field int maxIndex>
	//*  49  103:aload_0         
	//*  50  104:getfield        #41  <Field int minIndex>
	//*  51  107:icmpge          179
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   52  110:new             #103 <Class StringBuilder>
	//   53  113:dup             
	//   54  114:invokespecial   #104 <Method void StringBuilder()>
	//   55  117:astore_2        
				stringbuilder.append("MaxIndex (");
	//   56  118:aload_2         
	//   57  119:ldc1            #189 <String "MaxIndex (">
	//   58  121:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   59  124:pop             
				stringbuilder.append(maxIndex);
	//   60  125:aload_2         
	//   61  126:aload_0         
	//   62  127:getfield        #43  <Field int maxIndex>
	//   63  130:invokevirtual   #192 <Method StringBuilder StringBuilder.append(int)>
	//   64  133:pop             
				stringbuilder.append(") cannot be smaller than MinIndex (");
	//   65  134:aload_2         
	//   66  135:ldc1            #194 <String ") cannot be smaller than MinIndex (">
	//   67  137:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   68  140:pop             
				stringbuilder.append(minIndex);
	//   69  141:aload_2         
	//   70  142:aload_0         
	//   71  143:getfield        #41  <Field int minIndex>
	//   72  146:invokevirtual   #192 <Method StringBuilder StringBuilder.append(int)>
	//   73  149:pop             
				stringbuilder.append(").");
	//   74  150:aload_2         
	//   75  151:ldc1            #196 <String ").">
	//   76  153:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   77  156:pop             
				addWarn(stringbuilder.toString());
	//   78  157:aload_0         
	//   79  158:aload_2         
	//   80  159:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   81  162:invokevirtual   #199 <Method void addWarn(String)>
				addWarn("Setting maxIndex to equal minIndex.");
	//   82  165:aload_0         
	//   83  166:ldc1            #201 <String "Setting maxIndex to equal minIndex.">
	//   84  168:invokevirtual   #199 <Method void addWarn(String)>
				maxIndex = minIndex;
	//   85  171:aload_0         
	//   86  172:aload_0         
	//   87  173:getfield        #41  <Field int minIndex>
	//   88  176:putfield        #43  <Field int maxIndex>
			}
			int i = getMaxWindowSize();
	//   89  179:aload_0         
	//   90  180:invokevirtual   #203 <Method int getMaxWindowSize()>
	//   91  183:istore_1        
			if(maxIndex - minIndex > i)
	//*  92  184:aload_0         
	//*  93  185:getfield        #43  <Field int maxIndex>
	//*  94  188:aload_0         
	//*  95  189:getfield        #41  <Field int minIndex>
	//*  96  192:isub            
	//*  97  193:iload_1         
	//*  98  194:icmple          245
			{
				addWarn("Large window sizes are not allowed.");
	//   99  197:aload_0         
	//  100  198:ldc1            #205 <String "Large window sizes are not allowed.">
	//  101  200:invokevirtual   #199 <Method void addWarn(String)>
				maxIndex = minIndex + i;
	//  102  203:aload_0         
	//  103  204:aload_0         
	//  104  205:getfield        #41  <Field int minIndex>
	//  105  208:iload_1         
	//  106  209:iadd            
	//  107  210:putfield        #43  <Field int maxIndex>
				StringBuilder stringbuilder1 = new StringBuilder();
	//  108  213:new             #103 <Class StringBuilder>
	//  109  216:dup             
	//  110  217:invokespecial   #104 <Method void StringBuilder()>
	//  111  220:astore_2        
				stringbuilder1.append("MaxIndex reduced to ");
	//  112  221:aload_2         
	//  113  222:ldc1            #207 <String "MaxIndex reduced to ">
	//  114  224:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  115  227:pop             
				stringbuilder1.append(maxIndex);
	//  116  228:aload_2         
	//  117  229:aload_0         
	//  118  230:getfield        #43  <Field int maxIndex>
	//  119  233:invokevirtual   #192 <Method StringBuilder StringBuilder.append(int)>
	//  120  236:pop             
				addWarn(stringbuilder1.toString());
	//  121  237:aload_0         
	//  122  238:aload_2         
	//  123  239:invokevirtual   #113 <Method String StringBuilder.toString()>
	//  124  242:invokevirtual   #199 <Method void addWarn(String)>
			}
			if(fileNamePattern.getIntegerTokenConverter() == null)
	//* 125  245:aload_0         
	//* 126  246:getfield        #81  <Field FileNamePattern fileNamePattern>
	//* 127  249:invokevirtual   #211 <Method ch.qos.logback.core.rolling.helper.IntegerTokenConverter FileNamePattern.getIntegerTokenConverter()>
	//* 128  252:ifnonnull       301
			{
				StringBuilder stringbuilder2 = new StringBuilder();
	//  129  255:new             #103 <Class StringBuilder>
	//  130  258:dup             
	//  131  259:invokespecial   #104 <Method void StringBuilder()>
	//  132  262:astore_2        
				stringbuilder2.append("FileNamePattern [");
	//  133  263:aload_2         
	//  134  264:ldc1            #213 <String "FileNamePattern [">
	//  135  266:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  136  269:pop             
				stringbuilder2.append(fileNamePattern.getPattern());
	//  137  270:aload_2         
	//  138  271:aload_0         
	//  139  272:getfield        #81  <Field FileNamePattern fileNamePattern>
	//  140  275:invokevirtual   #216 <Method String FileNamePattern.getPattern()>
	//  141  278:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  142  281:pop             
				stringbuilder2.append("] does not contain a valid IntegerToken");
	//  143  282:aload_2         
	//  144  283:ldc1            #218 <String "] does not contain a valid IntegerToken">
	//  145  285:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  146  288:pop             
				throw new IllegalStateException(stringbuilder2.toString());
	//  147  289:new             #180 <Class IllegalStateException>
	//  148  292:dup             
	//  149  293:aload_2         
	//  150  294:invokevirtual   #113 <Method String StringBuilder.toString()>
	//  151  297:invokespecial   #183 <Method void IllegalStateException(String)>
	//  152  300:athrow          
			}
			if(compressionMode == CompressionMode.ZIP)
	//* 153  301:aload_0         
	//* 154  302:getfield        #124 <Field CompressionMode compressionMode>
	//* 155  305:getstatic       #221 <Field CompressionMode CompressionMode.ZIP>
	//* 156  308:if_acmpne       334
				zipEntryFileNamePattern = new FileNamePattern(transformFileNamePatternFromInt2Date(fileNamePatternStr), context);
	//  157  311:aload_0         
	//  158  312:new             #83  <Class FileNamePattern>
	//  159  315:dup             
	//  160  316:aload_0         
	//  161  317:aload_0         
	//  162  318:getfield        #164 <Field String fileNamePatternStr>
	//  163  321:invokespecial   #223 <Method String transformFileNamePatternFromInt2Date(String)>
	//  164  324:aload_0         
	//  165  325:getfield        #157 <Field ch.qos.logback.core.Context context>
	//  166  328:invokespecial   #167 <Method void FileNamePattern(String, ch.qos.logback.core.Context)>
	//  167  331:putfield        #136 <Field FileNamePattern zipEntryFileNamePattern>
			compressor = new Compressor(compressionMode);
	//  168  334:aload_0         
	//  169  335:new             #145 <Class Compressor>
	//  170  338:dup             
	//  171  339:aload_0         
	//  172  340:getfield        #124 <Field CompressionMode compressionMode>
	//  173  343:invokespecial   #226 <Method void Compressor(CompressionMode)>
	//  174  346:putfield        #131 <Field Compressor compressor>
			compressor.setContext(context);
	//  175  349:aload_0         
	//  176  350:getfield        #131 <Field Compressor compressor>
	//  177  353:aload_0         
	//  178  354:getfield        #157 <Field ch.qos.logback.core.Context context>
	//  179  357:invokevirtual   #227 <Method void Compressor.setContext(ch.qos.logback.core.Context)>
			super.start();
	//  180  360:aload_0         
	//  181  361:invokespecial   #229 <Method void RollingPolicyBase.start()>
			return;
	//  182  364:return          
		} else
		{
			addError("The \"FileNamePattern\" property must be set before using FixedWindowRollingPolicy. ");
	//  183  365:aload_0         
	//  184  366:ldc1            #10  <String "The \"FileNamePattern\" property must be set before using FixedWindowRollingPolicy. ">
	//  185  368:invokevirtual   #178 <Method void addError(String)>
			addError("See also http://logback.qos.ch/codes.html#tbr_fnp_not_set");
	//  186  371:aload_0         
	//  187  372:ldc1            #231 <String "See also http://logback.qos.ch/codes.html#tbr_fnp_not_set">
	//  188  374:invokevirtual   #178 <Method void addError(String)>
			throw new IllegalStateException("The \"FileNamePattern\" property must be set before using FixedWindowRollingPolicy. See also http://logback.qos.ch/codes.html#tbr_fnp_not_set");
	//  189  377:new             #180 <Class IllegalStateException>
	//  190  380:dup             
	//  191  381:ldc1            #233 <String "The \"FileNamePattern\" property must be set before using FixedWindowRollingPolicy. See also http://logback.qos.ch/codes.html#tbr_fnp_not_set">
	//  192  383:invokespecial   #183 <Method void IllegalStateException(String)>
	//  193  386:athrow          
		}
	}

	static final String FNP_NOT_SET = "The \"FileNamePattern\" property must be set before using FixedWindowRollingPolicy. ";
	private static int MAX_WINDOW_SIZE = 20;
	static final String PRUDENT_MODE_UNSUPPORTED = "See also http://logback.qos.ch/codes.html#tbr_fnp_prudent_unsupported";
	static final String SEE_PARENT_FN_NOT_SET = "Please refer to http://logback.qos.ch/codes.html#fwrp_parentFileName_not_set";
	public static final String ZIP_ENTRY_DATE_PATTERN = "yyyy-MM-dd_HHmm";
	Compressor compressor;
	int maxIndex;
	int minIndex;
	RenameUtil util;

	static 
	{
	//    0    0:return          
	}
}
