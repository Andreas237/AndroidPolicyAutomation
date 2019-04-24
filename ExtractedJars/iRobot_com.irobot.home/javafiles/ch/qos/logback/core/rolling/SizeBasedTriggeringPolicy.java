// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.rolling;

import ch.qos.logback.core.util.FileSize;
import ch.qos.logback.core.util.InvocationGate;
import java.io.File;

// Referenced classes of package ch.qos.logback.core.rolling:
//			TriggeringPolicyBase

public class SizeBasedTriggeringPolicy extends TriggeringPolicyBase
{

	public SizeBasedTriggeringPolicy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void TriggeringPolicyBase()>
		maxFileSizeAsString = Long.toString(0xa00000L);
	//    2    4:aload_0         
	//    3    5:ldc2w           #8   <Long 0xa00000L>
	//    4    8:invokestatic    #28  <Method String Long.toString(long)>
	//    5   11:putfield        #30  <Field String maxFileSizeAsString>
		invocationGate = new InvocationGate();
	//    6   14:aload_0         
	//    7   15:new             #32  <Class InvocationGate>
	//    8   18:dup             
	//    9   19:invokespecial   #33  <Method void InvocationGate()>
	//   10   22:putfield        #35  <Field InvocationGate invocationGate>
	//   11   25:return          
	}

	public SizeBasedTriggeringPolicy(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void TriggeringPolicyBase()>
		maxFileSizeAsString = Long.toString(0xa00000L);
	//    2    4:aload_0         
	//    3    5:ldc2w           #8   <Long 0xa00000L>
	//    4    8:invokestatic    #28  <Method String Long.toString(long)>
	//    5   11:putfield        #30  <Field String maxFileSizeAsString>
		invocationGate = new InvocationGate();
	//    6   14:aload_0         
	//    7   15:new             #32  <Class InvocationGate>
	//    8   18:dup             
	//    9   19:invokespecial   #33  <Method void InvocationGate()>
	//   10   22:putfield        #35  <Field InvocationGate invocationGate>
		setMaxFileSize(s);
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:invokevirtual   #40  <Method void setMaxFileSize(String)>
	//   14   30:return          
	}

	public String getMaxFileSize()
	{
		return maxFileSizeAsString;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String maxFileSizeAsString>
	//    2    4:areturn         
	}

	public boolean isTriggeringEvent(File file, Object obj)
	{
		boolean flag1 = invocationGate.skipFurtherWork();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field InvocationGate invocationGate>
	//    2    4:invokevirtual   #48  <Method boolean InvocationGate.skipFurtherWork()>
	//    3    7:istore          4
		boolean flag = false;
	//    4    9:iconst_0        
	//    5   10:istore_3        
		if(flag1)
	//*   6   11:iload           4
	//*   7   13:ifeq            18
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		long l = System.currentTimeMillis();
	//   10   18:invokestatic    #54  <Method long System.currentTimeMillis()>
	//   11   21:lstore          5
		invocationGate.updateMaskIfNecessary(l);
	//   12   23:aload_0         
	//   13   24:getfield        #35  <Field InvocationGate invocationGate>
	//   14   27:lload           5
	//   15   29:invokevirtual   #58  <Method void InvocationGate.updateMaskIfNecessary(long)>
		if(file.length() >= maxFileSize.getSize())
	//*  16   32:aload_1         
	//*  17   33:invokevirtual   #63  <Method long File.length()>
	//*  18   36:aload_0         
	//*  19   37:getfield        #65  <Field FileSize maxFileSize>
	//*  20   40:invokevirtual   #70  <Method long FileSize.getSize()>
	//*  21   43:lcmp            
	//*  22   44:iflt            49
			flag = true;
	//   23   47:iconst_1        
	//   24   48:istore_3        
		return flag;
	//   25   49:iload_3         
	//   26   50:ireturn         
	}

	public void setMaxFileSize(String s)
	{
		maxFileSizeAsString = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field String maxFileSizeAsString>
		maxFileSize = FileSize.valueOf(s);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokestatic    #76  <Method FileSize FileSize.valueOf(String)>
	//    6   10:putfield        #65  <Field FileSize maxFileSize>
	//    7   13:return          
	}

	long toFileSize(String s)
	{
		int i;
		long l;
		String s1;
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       8
			return 0xa00000L;
	//    2    4:ldc2w           #8   <Long 0xa00000L>
	//    3    7:lreturn         
		s1 = s.trim().toUpperCase();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #85  <Method String String.trim()>
	//    6   12:invokevirtual   #88  <Method String String.toUpperCase()>
	//    7   15:astore          8
		l = 1L;
	//    8   17:lconst_1        
	//    9   18:lstore_3        
		i = s1.indexOf("KB");
	//   10   19:aload           8
	//   11   21:ldc1            #90  <String "KB">
	//   12   23:invokevirtual   #94  <Method int String.indexOf(String)>
	//   13   26:istore_2        
		if(i == -1) goto _L2; else goto _L1
	//   14   27:iload_2         
	//   15   28:iconst_m1       
	//   16   29:icmpeq          48
_L1:
		l = 1024L;
	//   17   32:ldc2w           #95  <Long 1024L>
	//   18   35:lstore_3        
_L4:
		Object obj;
		obj = ((Object) (s1.substring(0, i)));
	//   19   36:aload           8
	//   20   38:iconst_0        
	//   21   39:iload_2         
	//   22   40:invokevirtual   #100 <Method String String.substring(int, int)>
	//   23   43:astore          7
		break; /* Loop/switch isn't completed */
	//   24   45:goto            92
_L2:
		i = s1.indexOf("MB");
	//   25   48:aload           8
	//   26   50:ldc1            #102 <String "MB">
	//   27   52:invokevirtual   #94  <Method int String.indexOf(String)>
	//   28   55:istore_2        
		if(i != -1)
	//*  29   56:iload_2         
	//*  30   57:iconst_m1       
	//*  31   58:icmpeq          68
		{
			l = 0x100000L;
	//   32   61:ldc2w           #103 <Long 0x100000L>
	//   33   64:lstore_3        
			continue; /* Loop/switch isn't completed */
	//   34   65:goto            36
		}
		i = s1.indexOf("GB");
	//   35   68:aload           8
	//   36   70:ldc1            #106 <String "GB">
	//   37   72:invokevirtual   #94  <Method int String.indexOf(String)>
	//   38   75:istore_2        
		obj = ((Object) (s1));
	//   39   76:aload           8
	//   40   78:astore          7
		if(i == -1)
			break; /* Loop/switch isn't completed */
	//   41   80:iload_2         
	//   42   81:iconst_m1       
	//   43   82:icmpeq          92
		l = 0x40000000L;
	//   44   85:ldc2w           #107 <Long 0x40000000L>
	//   45   88:lstore_3        
		if(true) goto _L4; else goto _L3
	//   46   89:goto            36
_L3:
		if(obj == null)
			break MISSING_BLOCK_LABEL_207;
	//   47   92:aload           7
	//   48   94:ifnull          207
		long l1 = Long.valueOf(((String) (obj))).longValue();
	//   49   97:aload           7
	//   50   99:invokestatic    #111 <Method Long Long.valueOf(String)>
	//   51  102:invokevirtual   #114 <Method long Long.longValue()>
	//   52  105:lstore          5
		return l1 * l;
	//   53  107:lload           5
	//   54  109:lload_3         
	//   55  110:lmul            
	//   56  111:lreturn         
		NumberFormatException numberformatexception;
		numberformatexception;
	//   57  112:astore          8
		StringBuilder stringbuilder = new StringBuilder();
	//   58  114:new             #116 <Class StringBuilder>
	//   59  117:dup             
	//   60  118:invokespecial   #117 <Method void StringBuilder()>
	//   61  121:astore          9
		stringbuilder.append("[");
	//   62  123:aload           9
	//   63  125:ldc1            #119 <String "[">
	//   64  127:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   65  130:pop             
		stringbuilder.append(((String) (obj)));
	//   66  131:aload           9
	//   67  133:aload           7
	//   68  135:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   69  138:pop             
		stringbuilder.append("] is not in proper int format. Please refer to ");
	//   70  139:aload           9
	//   71  141:ldc1            #125 <String "] is not in proper int format. Please refer to ">
	//   72  143:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   73  146:pop             
		stringbuilder.append("http://logback.qos.ch/codes.html#sbtp_size_format");
	//   74  147:aload           9
	//   75  149:ldc1            #13  <String "http://logback.qos.ch/codes.html#sbtp_size_format">
	//   76  151:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   77  154:pop             
		addError(stringbuilder.toString());
	//   78  155:aload_0         
	//   79  156:aload           9
	//   80  158:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   81  161:invokevirtual   #130 <Method void addError(String)>
		obj = ((Object) (new StringBuilder()));
	//   82  164:new             #116 <Class StringBuilder>
	//   83  167:dup             
	//   84  168:invokespecial   #117 <Method void StringBuilder()>
	//   85  171:astore          7
		((StringBuilder) (obj)).append("[");
	//   86  173:aload           7
	//   87  175:ldc1            #119 <String "[">
	//   88  177:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   89  180:pop             
		((StringBuilder) (obj)).append(s);
	//   90  181:aload           7
	//   91  183:aload_1         
	//   92  184:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   93  187:pop             
		((StringBuilder) (obj)).append("] not in expected format.");
	//   94  188:aload           7
	//   95  190:ldc1            #132 <String "] not in expected format.">
	//   96  192:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   97  195:pop             
		addError(((StringBuilder) (obj)).toString(), ((Throwable) (numberformatexception)));
	//   98  196:aload_0         
	//   99  197:aload           7
	//  100  199:invokevirtual   #127 <Method String StringBuilder.toString()>
	//  101  202:aload           8
	//  102  204:invokevirtual   #135 <Method void addError(String, Throwable)>
		return 0xa00000L;
	//  103  207:ldc2w           #8   <Long 0xa00000L>
	//  104  210:lreturn         
	}

	public static final long DEFAULT_MAX_FILE_SIZE = 0xa00000L;
	public static final String SEE_SIZE_FORMAT = "http://logback.qos.ch/codes.html#sbtp_size_format";
	private InvocationGate invocationGate;
	FileSize maxFileSize;
	String maxFileSizeAsString;
}
