// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileSize
{

	FileSize(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
		size = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #48  <Field long size>
	//    5    9:return          
	}

	public static FileSize valueOf(String s)
	{
label0:
		{
			Object obj;
label1:
			{
				obj = ((Object) (FILE_SIZE_PATTERN.matcher(((CharSequence) (s)))));
	//    0    0:getstatic       #41  <Field Pattern FILE_SIZE_PATTERN>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #54  <Method Matcher Pattern.matcher(CharSequence)>
	//    3    7:astore          5
				if(!((Matcher) (obj)).matches())
					break label0;
	//    4    9:aload           5
	//    5   11:invokevirtual   #60  <Method boolean Matcher.matches()>
	//    6   14:ifeq            148
				s = ((Matcher) (obj)).group(1);
	//    7   17:aload           5
	//    8   19:iconst_1        
	//    9   20:invokevirtual   #64  <Method String Matcher.group(int)>
	//   10   23:astore_0        
				obj = ((Object) (((Matcher) (obj)).group(2)));
	//   11   24:aload           5
	//   12   26:iconst_2        
	//   13   27:invokevirtual   #64  <Method String Matcher.group(int)>
	//   14   30:astore          5
				long l1 = Long.valueOf(s).longValue();
	//   15   32:aload_0         
	//   16   33:invokestatic    #69  <Method Long Long.valueOf(String)>
	//   17   36:invokevirtual   #73  <Method long Long.longValue()>
	//   18   39:lstore_3        
				long l;
				if(((String) (obj)).equalsIgnoreCase(""))
	//*  19   40:aload           5
	//*  20   42:ldc1            #75  <String "">
	//*  21   44:invokevirtual   #81  <Method boolean String.equalsIgnoreCase(String)>
	//*  22   47:ifeq            55
					l = 1L;
	//   23   50:lconst_1        
	//   24   51:lstore_1        
				else
	//*  25   52:goto            103
				if(((String) (obj)).equalsIgnoreCase("kb"))
	//*  26   55:aload           5
	//*  27   57:ldc1            #83  <String "kb">
	//*  28   59:invokevirtual   #81  <Method boolean String.equalsIgnoreCase(String)>
	//*  29   62:ifeq            72
					l = 1024L;
	//   30   65:ldc2w           #15  <Long 1024L>
	//   31   68:lstore_1        
				else
	//*  32   69:goto            103
				if(((String) (obj)).equalsIgnoreCase("mb"))
	//*  33   72:aload           5
	//*  34   74:ldc1            #85  <String "mb">
	//*  35   76:invokevirtual   #81  <Method boolean String.equalsIgnoreCase(String)>
	//*  36   79:ifeq            89
				{
					l = 0x100000L;
	//   37   82:ldc2w           #22  <Long 0x100000L>
	//   38   85:lstore_1        
				} else
	//*  39   86:goto            103
				{
					if(!((String) (obj)).equalsIgnoreCase("gb"))
						break label1;
	//   40   89:aload           5
	//   41   91:ldc1            #87  <String "gb">
	//   42   93:invokevirtual   #81  <Method boolean String.equalsIgnoreCase(String)>
	//   43   96:ifeq            114
					l = 0x40000000L;
	//   44   99:ldc2w           #12  <Long 0x40000000L>
	//   45  102:lstore_1        
				}
				return new FileSize(l1 * l);
	//   46  103:new             #2   <Class FileSize>
	//   47  106:dup             
	//   48  107:lload_3         
	//   49  108:lload_1         
	//   50  109:lmul            
	//   51  110:invokespecial   #89  <Method void FileSize(long)>
	//   52  113:areturn         
			}
			s = ((String) (new StringBuilder()));
	//   53  114:new             #91  <Class StringBuilder>
	//   54  117:dup             
	//   55  118:invokespecial   #92  <Method void StringBuilder()>
	//   56  121:astore_0        
			((StringBuilder) (s)).append("Unexpected ");
	//   57  122:aload_0         
	//   58  123:ldc1            #94  <String "Unexpected ">
	//   59  125:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   60  128:pop             
			((StringBuilder) (s)).append(((String) (obj)));
	//   61  129:aload_0         
	//   62  130:aload           5
	//   63  132:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   64  135:pop             
			throw new IllegalStateException(((StringBuilder) (s)).toString());
	//   65  136:new             #100 <Class IllegalStateException>
	//   66  139:dup             
	//   67  140:aload_0         
	//   68  141:invokevirtual   #104 <Method String StringBuilder.toString()>
	//   69  144:invokespecial   #107 <Method void IllegalStateException(String)>
	//   70  147:athrow          
		}
		StringBuilder stringbuilder = new StringBuilder();
	//   71  148:new             #91  <Class StringBuilder>
	//   72  151:dup             
	//   73  152:invokespecial   #92  <Method void StringBuilder()>
	//   74  155:astore          5
		stringbuilder.append("String value [");
	//   75  157:aload           5
	//   76  159:ldc1            #109 <String "String value [">
	//   77  161:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   78  164:pop             
		stringbuilder.append(s);
	//   79  165:aload           5
	//   80  167:aload_0         
	//   81  168:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   82  171:pop             
		stringbuilder.append("] is not in the expected format.");
	//   83  172:aload           5
	//   84  174:ldc1            #111 <String "] is not in the expected format.">
	//   85  176:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   86  179:pop             
		throw new IllegalArgumentException(stringbuilder.toString());
	//   87  180:new             #113 <Class IllegalArgumentException>
	//   88  183:dup             
	//   89  184:aload           5
	//   90  186:invokevirtual   #104 <Method String StringBuilder.toString()>
	//   91  189:invokespecial   #114 <Method void IllegalArgumentException(String)>
	//   92  192:athrow          
	}

	public long getSize()
	{
		return size;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field long size>
	//    2    4:lreturn         
	}

	private static final int DOUBLE_GROUP = 1;
	private static final Pattern FILE_SIZE_PATTERN = Pattern.compile("([0-9]+)\\s*(|kb|mb|gb)s?", 2);
	static final long GB_COEFFICIENT = 0x40000000L;
	static final long KB_COEFFICIENT = 1024L;
	private static final String LENGTH_PART = "([0-9]+)";
	static final long MB_COEFFICIENT = 0x100000L;
	private static final int UNIT_GROUP = 2;
	private static final String UNIT_PART = "(|kb|mb|gb)s?";
	final long size;

	static 
	{
	//    0    0:ldc1            #33  <String "([0-9]+)\\s*(|kb|mb|gb)s?">
	//    1    2:iconst_2        
	//    2    3:invokestatic    #39  <Method Pattern Pattern.compile(String, int)>
	//    3    6:putstatic       #41  <Field Pattern FILE_SIZE_PATTERN>
	//*   4    9:return          
	}
}
