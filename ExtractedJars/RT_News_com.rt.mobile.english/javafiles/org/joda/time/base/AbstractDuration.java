// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.joda.time.base;

import org.joda.time.*;
import org.joda.time.format.FormatUtils;

public abstract class AbstractDuration
	implements ReadableDuration
{

	protected AbstractDuration()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((ReadableDuration)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #6   <Class ReadableDuration>
	//    3    5:invokevirtual   #16  <Method int compareTo(ReadableDuration)>
	//    4    8:ireturn         
	}

	public int compareTo(ReadableDuration readableduration)
	{
		long l = getMillis();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method long getMillis()>
	//    2    4:lstore_2        
		long l1 = readableduration.getMillis();
	//    3    5:aload_1         
	//    4    6:invokeinterface #21  <Method long ReadableDuration.getMillis()>
	//    5   11:lstore          4
		if(l < l1)
	//*   6   13:lload_2         
	//*   7   14:lload           4
	//*   8   16:lcmp            
	//*   9   17:ifge            22
			return -1;
	//   10   20:iconst_m1       
	//   11   21:ireturn         
		return l <= l1 ? 0 : 1;
	//   12   22:lload_2         
	//   13   23:lload           4
	//   14   25:lcmp            
	//   15   26:ifle            31
	//   16   29:iconst_1        
	//   17   30:ireturn         
	//   18   31:iconst_0        
	//   19   32:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof ReadableDuration))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #6   <Class ReadableDuration>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((ReadableDuration)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #6   <Class ReadableDuration>
	//   12   20:astore_1        
		return getMillis() == ((ReadableDuration) (obj)).getMillis();
	//   13   21:aload_0         
	//   14   22:invokevirtual   #20  <Method long getMillis()>
	//   15   25:aload_1         
	//   16   26:invokeinterface #21  <Method long ReadableDuration.getMillis()>
	//   17   31:lcmp            
	//   18   32:ifne            37
	//   19   35:iconst_1        
	//   20   36:ireturn         
	//   21   37:iconst_0        
	//   22   38:ireturn         
	}

	public int hashCode()
	{
		long l = getMillis();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method long getMillis()>
	//    2    4:lstore_1        
		return (int)(l ^ l >>> 32);
	//    3    5:lload_1         
	//    4    6:lload_1         
	//    5    7:bipush          32
	//    6    9:lushr           
	//    7   10:lxor            
	//    8   11:l2i             
	//    9   12:ireturn         
	}

	public boolean isEqual(ReadableDuration readableduration)
	{
		Object obj = ((Object) (readableduration));
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(readableduration == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       10
			obj = ((Object) (Duration.ZERO));
	//    4    6:getstatic       #33  <Field Duration Duration.ZERO>
	//    5    9:astore_2        
		return compareTo(((ReadableDuration) (obj))) == 0;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #16  <Method int compareTo(ReadableDuration)>
	//    9   15:ifne            20
	//   10   18:iconst_1        
	//   11   19:ireturn         
	//   12   20:iconst_0        
	//   13   21:ireturn         
	}

	public boolean isLongerThan(ReadableDuration readableduration)
	{
		Object obj = ((Object) (readableduration));
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(readableduration == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       10
			obj = ((Object) (Duration.ZERO));
	//    4    6:getstatic       #33  <Field Duration Duration.ZERO>
	//    5    9:astore_2        
		return compareTo(((ReadableDuration) (obj))) > 0;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #16  <Method int compareTo(ReadableDuration)>
	//    9   15:ifle            20
	//   10   18:iconst_1        
	//   11   19:ireturn         
	//   12   20:iconst_0        
	//   13   21:ireturn         
	}

	public boolean isShorterThan(ReadableDuration readableduration)
	{
		Object obj = ((Object) (readableduration));
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(readableduration == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       10
			obj = ((Object) (Duration.ZERO));
	//    4    6:getstatic       #33  <Field Duration Duration.ZERO>
	//    5    9:astore_2        
		return compareTo(((ReadableDuration) (obj))) < 0;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #16  <Method int compareTo(ReadableDuration)>
	//    9   15:ifge            20
	//   10   18:iconst_1        
	//   11   19:ireturn         
	//   12   20:iconst_0        
	//   13   21:ireturn         
	}

	public Duration toDuration()
	{
		return new Duration(getMillis());
	//    0    0:new             #29  <Class Duration>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #20  <Method long getMillis()>
	//    4    8:invokespecial   #40  <Method void Duration(long)>
	//    5   11:areturn         
	}

	public Period toPeriod()
	{
		return new Period(getMillis());
	//    0    0:new             #44  <Class Period>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #20  <Method long getMillis()>
	//    4    8:invokespecial   #45  <Method void Period(long)>
	//    5   11:areturn         
	}

	public String toString()
	{
		long l = getMillis();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method long getMillis()>
	//    2    4:lstore          5
		StringBuffer stringbuffer = new StringBuffer();
	//    3    6:new             #50  <Class StringBuffer>
	//    4    9:dup             
	//    5   10:invokespecial   #51  <Method void StringBuffer()>
	//    6   13:astore          7
		stringbuffer.append("PT");
	//    7   15:aload           7
	//    8   17:ldc1            #53  <String "PT">
	//    9   19:invokevirtual   #57  <Method StringBuffer StringBuffer.append(String)>
	//   10   22:pop             
		boolean flag;
		if(l < 0L)
	//*  11   23:lload           5
	//*  12   25:lconst_0        
	//*  13   26:lcmp            
	//*  14   27:ifge            35
			flag = true;
	//   15   30:iconst_1        
	//   16   31:istore_1        
		else
	//*  17   32:goto            37
			flag = false;
	//   18   35:iconst_0        
	//   19   36:istore_1        
		FormatUtils.appendUnpaddedInteger(stringbuffer, l);
	//   20   37:aload           7
	//   21   39:lload           5
	//   22   41:invokestatic    #63  <Method void FormatUtils.appendUnpaddedInteger(StringBuffer, long)>
		do
		{
			int i = stringbuffer.length();
	//   23   44:aload           7
	//   24   46:invokevirtual   #66  <Method int StringBuffer.length()>
	//   25   49:istore          4
			byte byte0;
			if(flag)
	//*  26   51:iload_1         
	//*  27   52:ifeq            61
				byte0 = 7;
	//   28   55:bipush          7
	//   29   57:istore_2        
			else
	//*  30   58:goto            64
				byte0 = 6;
	//   31   61:bipush          6
	//   32   63:istore_2        
			byte byte1 = 3;
	//   33   64:iconst_3        
	//   34   65:istore_3        
			if(i >= byte0)
				break;
	//   35   66:iload           4
	//   36   68:iload_2         
	//   37   69:icmpge          95
			if(flag)
	//*  38   72:iload_1         
	//*  39   73:ifeq            81
				byte0 = byte1;
	//   40   76:iload_3         
	//   41   77:istore_2        
			else
	//*  42   78:goto            83
				byte0 = 2;
	//   43   81:iconst_2        
	//   44   82:istore_2        
			stringbuffer.insert(((int) (byte0)), "0");
	//   45   83:aload           7
	//   46   85:iload_2         
	//   47   86:ldc1            #68  <String "0">
	//   48   88:invokevirtual   #72  <Method StringBuffer StringBuffer.insert(int, String)>
	//   49   91:pop             
		} while(true);
	//   50   92:goto            44
		if((l / 1000L) * 1000L == l)
	//*  51   95:lload           5
	//*  52   97:ldc2w           #73  <Long 1000L>
	//*  53  100:ldiv            
	//*  54  101:ldc2w           #73  <Long 1000L>
	//*  55  104:lmul            
	//*  56  105:lload           5
	//*  57  107:lcmp            
	//*  58  108:ifne            126
			stringbuffer.setLength(stringbuffer.length() - 3);
	//   59  111:aload           7
	//   60  113:aload           7
	//   61  115:invokevirtual   #66  <Method int StringBuffer.length()>
	//   62  118:iconst_3        
	//   63  119:isub            
	//   64  120:invokevirtual   #78  <Method void StringBuffer.setLength(int)>
		else
	//*  65  123:goto            141
			stringbuffer.insert(stringbuffer.length() - 3, ".");
	//   66  126:aload           7
	//   67  128:aload           7
	//   68  130:invokevirtual   #66  <Method int StringBuffer.length()>
	//   69  133:iconst_3        
	//   70  134:isub            
	//   71  135:ldc1            #80  <String ".">
	//   72  137:invokevirtual   #72  <Method StringBuffer StringBuffer.insert(int, String)>
	//   73  140:pop             
		stringbuffer.append('S');
	//   74  141:aload           7
	//   75  143:bipush          83
	//   76  145:invokevirtual   #83  <Method StringBuffer StringBuffer.append(char)>
	//   77  148:pop             
		return stringbuffer.toString();
	//   78  149:aload           7
	//   79  151:invokevirtual   #85  <Method String StringBuffer.toString()>
	//   80  154:areturn         
	}
}
