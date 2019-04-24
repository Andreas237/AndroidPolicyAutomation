// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.*;

// Referenced classes of package com.crashlytics.android.core:
//			ByteString, CodedOutputStream, TrimmedThrowableData, LogFileManager

class SessionProtobufHelper
{

	private SessionProtobufHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
	//    2    4:return          
	}

	private static int getBinaryImageSize(ByteString bytestring, ByteString bytestring1)
	{
		int j = 0 + CodedOutputStream.computeUInt64Size(1, 0L) + CodedOutputStream.computeUInt64Size(2, 0L) + CodedOutputStream.computeBytesSize(3, bytestring);
	//    0    0:iconst_0        
	//    1    1:iconst_1        
	//    2    2:lconst_0        
	//    3    3:invokestatic    #37  <Method int CodedOutputStream.computeUInt64Size(int, long)>
	//    4    6:iadd            
	//    5    7:iconst_2        
	//    6    8:lconst_0        
	//    7    9:invokestatic    #37  <Method int CodedOutputStream.computeUInt64Size(int, long)>
	//    8   12:iadd            
	//    9   13:iconst_3        
	//   10   14:aload_0         
	//   11   15:invokestatic    #41  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//   12   18:iadd            
	//   13   19:istore_3        
		int i = j;
	//   14   20:iload_3         
	//   15   21:istore_2        
		if(bytestring1 != null)
	//*  16   22:aload_1         
	//*  17   23:ifnull          34
			i = j + CodedOutputStream.computeBytesSize(4, bytestring1);
	//   18   26:iload_3         
	//   19   27:iconst_4        
	//   20   28:aload_1         
	//   21   29:invokestatic    #41  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//   22   32:iadd            
	//   23   33:istore_2        
		return i;
	//   24   34:iload_2         
	//   25   35:ireturn         
	}

	private static int getDeviceIdentifierSize(io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType deviceidentifiertype, String s)
	{
		return CodedOutputStream.computeEnumSize(1, deviceidentifiertype.protobufIndex) + CodedOutputStream.computeBytesSize(2, ByteString.copyFromUtf8(s));
	//    0    0:iconst_1        
	//    1    1:aload_0         
	//    2    2:getfield        #49  <Field int io.fabric.sdk.android.services.common.IdManager$DeviceIdentifierType.protobufIndex>
	//    3    5:invokestatic    #53  <Method int CodedOutputStream.computeEnumSize(int, int)>
	//    4    8:iconst_2        
	//    5    9:aload_1         
	//    6   10:invokestatic    #19  <Method ByteString ByteString.copyFromUtf8(String)>
	//    7   13:invokestatic    #41  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//    8   16:iadd            
	//    9   17:ireturn         
	}

	private static int getEventAppCustomAttributeSize(String s, String s1)
	{
		int i = CodedOutputStream.computeBytesSize(1, ByteString.copyFromUtf8(s));
	//    0    0:iconst_1        
	//    1    1:aload_0         
	//    2    2:invokestatic    #19  <Method ByteString ByteString.copyFromUtf8(String)>
	//    3    5:invokestatic    #41  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//    4    8:istore_2        
		s = s1;
	//    5    9:aload_1         
	//    6   10:astore_0        
		if(s1 == null)
	//*   7   11:aload_1         
	//*   8   12:ifnonnull       18
			s = "";
	//    9   15:ldc1            #57  <String "">
	//   10   17:astore_0        
		return i + CodedOutputStream.computeBytesSize(2, ByteString.copyFromUtf8(s));
	//   11   18:iload_2         
	//   12   19:iconst_2        
	//   13   20:aload_0         
	//   14   21:invokestatic    #19  <Method ByteString ByteString.copyFromUtf8(String)>
	//   15   24:invokestatic    #41  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//   16   27:iadd            
	//   17   28:ireturn         
	}

	private static int getEventAppExecutionExceptionSize(TrimmedThrowableData trimmedthrowabledata, int i, int j)
	{
		int k;
label0:
		{
			int l = 0 + CodedOutputStream.computeBytesSize(1, ByteString.copyFromUtf8(trimmedthrowabledata.className));
	//    0    0:iconst_0        
	//    1    1:iconst_1        
	//    2    2:aload_0         
	//    3    3:getfield        #64  <Field String TrimmedThrowableData.className>
	//    4    6:invokestatic    #19  <Method ByteString ByteString.copyFromUtf8(String)>
	//    5    9:invokestatic    #41  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//    6   12:iadd            
	//    7   13:istore          4
			String s = trimmedthrowabledata.localizedMessage;
	//    8   15:aload_0         
	//    9   16:getfield        #67  <Field String TrimmedThrowableData.localizedMessage>
	//   10   19:astore          7
			k = l;
	//   11   21:iload           4
	//   12   23:istore_3        
			if(s != null)
	//*  13   24:aload           7
	//*  14   26:ifnull          42
				k = l + CodedOutputStream.computeBytesSize(3, ByteString.copyFromUtf8(s));
	//   15   29:iload           4
	//   16   31:iconst_3        
	//   17   32:aload           7
	//   18   34:invokestatic    #19  <Method ByteString ByteString.copyFromUtf8(String)>
	//   19   37:invokestatic    #41  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//   20   40:iadd            
	//   21   41:istore_3        
			StackTraceElement astacktraceelement[] = trimmedthrowabledata.stacktrace;
	//   22   42:aload_0         
	//   23   43:getfield        #71  <Field StackTraceElement[] TrimmedThrowableData.stacktrace>
	//   24   46:astore          7
			int i1 = astacktraceelement.length;
	//   25   48:aload           7
	//   26   50:arraylength     
	//   27   51:istore          5
			for(l = 0; l < i1; l++)
	//*  28   53:iconst_0        
	//*  29   54:istore          4
	//*  30   56:iload           4
	//*  31   58:iload           5
	//*  32   60:icmpge          99
			{
				int j1 = getFrameSize(astacktraceelement[l], true);
	//   33   63:aload           7
	//   34   65:iload           4
	//   35   67:aaload          
	//   36   68:iconst_1        
	//   37   69:invokestatic    #75  <Method int getFrameSize(StackTraceElement, boolean)>
	//   38   72:istore          6
				k += CodedOutputStream.computeTagSize(4) + CodedOutputStream.computeRawVarint32Size(j1) + j1;
	//   39   74:iload_3         
	//   40   75:iconst_4        
	//   41   76:invokestatic    #79  <Method int CodedOutputStream.computeTagSize(int)>
	//   42   79:iload           6
	//   43   81:invokestatic    #82  <Method int CodedOutputStream.computeRawVarint32Size(int)>
	//   44   84:iadd            
	//   45   85:iload           6
	//   46   87:iadd            
	//   47   88:iadd            
	//   48   89:istore_3        
			}

	//   49   90:iload           4
	//   50   92:iconst_1        
	//   51   93:iadd            
	//   52   94:istore          4
	//*  53   96:goto            56
			trimmedthrowabledata = trimmedthrowabledata.cause;
	//   54   99:aload_0         
	//   55  100:getfield        #86  <Field TrimmedThrowableData TrimmedThrowableData.cause>
	//   56  103:astore_0        
			l = k;
	//   57  104:iload_3         
	//   58  105:istore          4
			if(trimmedthrowabledata != null)
	//*  59  107:aload_0         
	//*  60  108:ifnull          141
			{
				if(i >= j)
					break label0;
	//   61  111:iload_1         
	//   62  112:iload_2         
	//   63  113:icmpge          144
				i = getEventAppExecutionExceptionSize(trimmedthrowabledata, i + 1, j);
	//   64  116:aload_0         
	//   65  117:iload_1         
	//   66  118:iconst_1        
	//   67  119:iadd            
	//   68  120:iload_2         
	//   69  121:invokestatic    #88  <Method int getEventAppExecutionExceptionSize(TrimmedThrowableData, int, int)>
	//   70  124:istore_1        
				l = k + (CodedOutputStream.computeTagSize(6) + CodedOutputStream.computeRawVarint32Size(i) + i);
	//   71  125:iload_3         
	//   72  126:bipush          6
	//   73  128:invokestatic    #79  <Method int CodedOutputStream.computeTagSize(int)>
	//   74  131:iload_1         
	//   75  132:invokestatic    #82  <Method int CodedOutputStream.computeRawVarint32Size(int)>
	//   76  135:iadd            
	//   77  136:iload_1         
	//   78  137:iadd            
	//   79  138:iadd            
	//   80  139:istore          4
			}
			return l;
	//   81  141:iload           4
	//   82  143:ireturn         
		}
		for(i = 0; trimmedthrowabledata != null; i++)
	//*  83  144:iconst_0        
	//*  84  145:istore_1        
	//*  85  146:aload_0         
	//*  86  147:ifnull          162
			trimmedthrowabledata = trimmedthrowabledata.cause;
	//   87  150:aload_0         
	//   88  151:getfield        #86  <Field TrimmedThrowableData TrimmedThrowableData.cause>
	//   89  154:astore_0        

	//   90  155:iload_1         
	//   91  156:iconst_1        
	//   92  157:iadd            
	//   93  158:istore_1        
	//*  94  159:goto            146
		return k + CodedOutputStream.computeUInt32Size(7, i);
	//   95  162:iload_3         
	//   96  163:bipush          7
	//   97  165:iload_1         
	//   98  166:invokestatic    #91  <Method int CodedOutputStream.computeUInt32Size(int, int)>
	//   99  169:iadd            
	//  100  170:ireturn         
	}

	private static int getEventAppExecutionSignalSize()
	{
		return 0 + CodedOutputStream.computeBytesSize(1, SIGNAL_DEFAULT_BYTE_STRING) + CodedOutputStream.computeBytesSize(2, SIGNAL_DEFAULT_BYTE_STRING) + CodedOutputStream.computeUInt64Size(3, 0L);
	//    0    0:iconst_0        
	//    1    1:iconst_1        
	//    2    2:getstatic       #21  <Field ByteString SIGNAL_DEFAULT_BYTE_STRING>
	//    3    5:invokestatic    #41  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//    4    8:iadd            
	//    5    9:iconst_2        
	//    6   10:getstatic       #21  <Field ByteString SIGNAL_DEFAULT_BYTE_STRING>
	//    7   13:invokestatic    #41  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//    8   16:iadd            
	//    9   17:iconst_3        
	//   10   18:lconst_0        
	//   11   19:invokestatic    #37  <Method int CodedOutputStream.computeUInt64Size(int, long)>
	//   12   22:iadd            
	//   13   23:ireturn         
	}

	private static int getEventAppExecutionSize(TrimmedThrowableData trimmedthrowabledata, Thread thread, StackTraceElement astacktraceelement[], Thread athread[], List list, int i, ByteString bytestring, ByteString bytestring1)
	{
		int j = getThreadSize(thread, astacktraceelement, 4, true);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iconst_4        
	//    3    3:iconst_1        
	//    4    4:invokestatic    #99  <Method int getThreadSize(Thread, StackTraceElement[], int, boolean)>
	//    5    7:istore          8
		j = 0 + (CodedOutputStream.computeTagSize(1) + CodedOutputStream.computeRawVarint32Size(j) + j);
	//    6    9:iconst_0        
	//    7   10:iconst_1        
	//    8   11:invokestatic    #79  <Method int CodedOutputStream.computeTagSize(int)>
	//    9   14:iload           8
	//   10   16:invokestatic    #82  <Method int CodedOutputStream.computeRawVarint32Size(int)>
	//   11   19:iadd            
	//   12   20:iload           8
	//   13   22:iadd            
	//   14   23:iadd            
	//   15   24:istore          8
		int i1 = athread.length;
	//   16   26:aload_3         
	//   17   27:arraylength     
	//   18   28:istore          10
		for(int k = 0; k < i1; k++)
	//*  19   30:iconst_0        
	//*  20   31:istore          9
	//*  21   33:iload           9
	//*  22   35:iload           10
	//*  23   37:icmpge          90
		{
			int j1 = getThreadSize(athread[k], (StackTraceElement[])list.get(k), 0, false);
	//   24   40:aload_3         
	//   25   41:iload           9
	//   26   43:aaload          
	//   27   44:aload           4
	//   28   46:iload           9
	//   29   48:invokeinterface #105 <Method Object List.get(int)>
	//   30   53:checkcast       #106 <Class StackTraceElement[]>
	//   31   56:iconst_0        
	//   32   57:iconst_0        
	//   33   58:invokestatic    #99  <Method int getThreadSize(Thread, StackTraceElement[], int, boolean)>
	//   34   61:istore          11
			j += CodedOutputStream.computeTagSize(1) + CodedOutputStream.computeRawVarint32Size(j1) + j1;
	//   35   63:iload           8
	//   36   65:iconst_1        
	//   37   66:invokestatic    #79  <Method int CodedOutputStream.computeTagSize(int)>
	//   38   69:iload           11
	//   39   71:invokestatic    #82  <Method int CodedOutputStream.computeRawVarint32Size(int)>
	//   40   74:iadd            
	//   41   75:iload           11
	//   42   77:iadd            
	//   43   78:iadd            
	//   44   79:istore          8
		}

	//   45   81:iload           9
	//   46   83:iconst_1        
	//   47   84:iadd            
	//   48   85:istore          9
	//*  49   87:goto            33
		i = getEventAppExecutionExceptionSize(trimmedthrowabledata, 1, i);
	//   50   90:aload_0         
	//   51   91:iconst_1        
	//   52   92:iload           5
	//   53   94:invokestatic    #88  <Method int getEventAppExecutionExceptionSize(TrimmedThrowableData, int, int)>
	//   54   97:istore          5
		int l = CodedOutputStream.computeTagSize(2);
	//   55   99:iconst_2        
	//   56  100:invokestatic    #79  <Method int CodedOutputStream.computeTagSize(int)>
	//   57  103:istore          9
		i1 = CodedOutputStream.computeRawVarint32Size(i);
	//   58  105:iload           5
	//   59  107:invokestatic    #82  <Method int CodedOutputStream.computeRawVarint32Size(int)>
	//   60  110:istore          10
		int k1 = getEventAppExecutionSignalSize();
	//   61  112:invokestatic    #108 <Method int getEventAppExecutionSignalSize()>
	//   62  115:istore          11
		int l1 = CodedOutputStream.computeTagSize(3);
	//   63  117:iconst_3        
	//   64  118:invokestatic    #79  <Method int CodedOutputStream.computeTagSize(int)>
	//   65  121:istore          12
		int i2 = CodedOutputStream.computeRawVarint32Size(k1);
	//   66  123:iload           11
	//   67  125:invokestatic    #82  <Method int CodedOutputStream.computeRawVarint32Size(int)>
	//   68  128:istore          13
		int j2 = getBinaryImageSize(bytestring, bytestring1);
	//   69  130:aload           6
	//   70  132:aload           7
	//   71  134:invokestatic    #110 <Method int getBinaryImageSize(ByteString, ByteString)>
	//   72  137:istore          14
		return j + (l + i1 + i) + (l1 + i2 + k1) + (CodedOutputStream.computeTagSize(3) + CodedOutputStream.computeRawVarint32Size(j2) + j2);
	//   73  139:iload           8
	//   74  141:iload           9
	//   75  143:iload           10
	//   76  145:iadd            
	//   77  146:iload           5
	//   78  148:iadd            
	//   79  149:iadd            
	//   80  150:iload           12
	//   81  152:iload           13
	//   82  154:iadd            
	//   83  155:iload           11
	//   84  157:iadd            
	//   85  158:iadd            
	//   86  159:iconst_3        
	//   87  160:invokestatic    #79  <Method int CodedOutputStream.computeTagSize(int)>
	//   88  163:iload           14
	//   89  165:invokestatic    #82  <Method int CodedOutputStream.computeRawVarint32Size(int)>
	//   90  168:iadd            
	//   91  169:iload           14
	//   92  171:iadd            
	//   93  172:iadd            
	//   94  173:ireturn         
	}

	private static int getEventAppSize(TrimmedThrowableData trimmedthrowabledata, Thread thread, StackTraceElement astacktraceelement[], Thread athread[], List list, int i, ByteString bytestring, ByteString bytestring1, 
			Map map, android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo, int j)
	{
		i = getEventAppExecutionSize(trimmedthrowabledata, thread, astacktraceelement, athread, list, i, bytestring, bytestring1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:aload           6
	//    7   10:aload           7
	//    8   12:invokestatic    #116 <Method int getEventAppExecutionSize(TrimmedThrowableData, Thread, StackTraceElement[], Thread[], List, int, ByteString, ByteString)>
	//    9   15:istore          5
		int k = 0 + (CodedOutputStream.computeTagSize(1) + CodedOutputStream.computeRawVarint32Size(i) + i);
	//   10   17:iconst_0        
	//   11   18:iconst_1        
	//   12   19:invokestatic    #79  <Method int CodedOutputStream.computeTagSize(int)>
	//   13   22:iload           5
	//   14   24:invokestatic    #82  <Method int CodedOutputStream.computeRawVarint32Size(int)>
	//   15   27:iadd            
	//   16   28:iload           5
	//   17   30:iadd            
	//   18   31:iadd            
	//   19   32:istore          11
		i = k;
	//   20   34:iload           11
	//   21   36:istore          5
		if(map != null)
	//*  22   38:aload           8
	//*  23   40:ifnull          123
		{
			trimmedthrowabledata = ((TrimmedThrowableData) (map.entrySet().iterator()));
	//   24   43:aload           8
	//   25   45:invokeinterface #122 <Method Set Map.entrySet()>
	//   26   50:invokeinterface #128 <Method Iterator Set.iterator()>
	//   27   55:astore_0        
			do
			{
				i = k;
	//   28   56:iload           11
	//   29   58:istore          5
				if(!((Iterator) (trimmedthrowabledata)).hasNext())
					break;
	//   30   60:aload_0         
	//   31   61:invokeinterface #134 <Method boolean Iterator.hasNext()>
	//   32   66:ifeq            123
				thread = ((Thread) ((java.util.Map.Entry)((Iterator) (trimmedthrowabledata)).next()));
	//   33   69:aload_0         
	//   34   70:invokeinterface #138 <Method Object Iterator.next()>
	//   35   75:checkcast       #140 <Class java.util.Map$Entry>
	//   36   78:astore_1        
				i = getEventAppCustomAttributeSize((String)((java.util.Map.Entry) (thread)).getKey(), (String)((java.util.Map.Entry) (thread)).getValue());
	//   37   79:aload_1         
	//   38   80:invokeinterface #143 <Method Object java.util.Map$Entry.getKey()>
	//   39   85:checkcast       #145 <Class String>
	//   40   88:aload_1         
	//   41   89:invokeinterface #148 <Method Object java.util.Map$Entry.getValue()>
	//   42   94:checkcast       #145 <Class String>
	//   43   97:invokestatic    #150 <Method int getEventAppCustomAttributeSize(String, String)>
	//   44  100:istore          5
				k += CodedOutputStream.computeTagSize(2) + CodedOutputStream.computeRawVarint32Size(i) + i;
	//   45  102:iload           11
	//   46  104:iconst_2        
	//   47  105:invokestatic    #79  <Method int CodedOutputStream.computeTagSize(int)>
	//   48  108:iload           5
	//   49  110:invokestatic    #82  <Method int CodedOutputStream.computeRawVarint32Size(int)>
	//   50  113:iadd            
	//   51  114:iload           5
	//   52  116:iadd            
	//   53  117:iadd            
	//   54  118:istore          11
			} while(true);
	//   55  120:goto            56
		}
		k = i;
	//   56  123:iload           5
	//   57  125:istore          11
		if(runningappprocessinfo != null)
	//*  58  127:aload           9
	//*  59  129:ifnull          156
		{
			boolean flag;
			if(runningappprocessinfo.importance != 100)
	//*  60  132:aload           9
	//*  61  134:getfield        #155 <Field int android.app.ActivityManager$RunningAppProcessInfo.importance>
	//*  62  137:bipush          100
	//*  63  139:icmpeq          166
				flag = true;
	//   64  142:iconst_1        
	//   65  143:istore          12
			else
	//*  66  145:iload           5
	//*  67  147:iconst_3        
	//*  68  148:iload           12
	//*  69  150:invokestatic    #159 <Method int CodedOutputStream.computeBoolSize(int, boolean)>
	//*  70  153:iadd            
	//*  71  154:istore          11
	//*  72  156:iload           11
	//*  73  158:iconst_4        
	//*  74  159:iload           10
	//*  75  161:invokestatic    #91  <Method int CodedOutputStream.computeUInt32Size(int, int)>
	//*  76  164:iadd            
	//*  77  165:ireturn         
				flag = false;
	//   78  166:iconst_0        
	//   79  167:istore          12
			k = i + CodedOutputStream.computeBoolSize(3, flag);
		}
		return k + CodedOutputStream.computeUInt32Size(4, j);
	//*  80  169:goto            145
	}

	private static int getEventDeviceSize(Float float1, int i, boolean flag, int j, long l, long l1)
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore          8
		if(float1 != null)
	//*   2    3:aload_0         
	//*   3    4:ifnull          19
			k = 0 + CodedOutputStream.computeFloatSize(1, float1.floatValue());
	//    4    7:iconst_0        
	//    5    8:iconst_1        
	//    6    9:aload_0         
	//    7   10:invokevirtual   #168 <Method float Float.floatValue()>
	//    8   13:invokestatic    #172 <Method int CodedOutputStream.computeFloatSize(int, float)>
	//    9   16:iadd            
	//   10   17:istore          8
		return k + CodedOutputStream.computeSInt32Size(2, i) + CodedOutputStream.computeBoolSize(3, flag) + CodedOutputStream.computeUInt32Size(4, j) + CodedOutputStream.computeUInt64Size(5, l) + CodedOutputStream.computeUInt64Size(6, l1);
	//   11   19:iload           8
	//   12   21:iconst_2        
	//   13   22:iload_1         
	//   14   23:invokestatic    #175 <Method int CodedOutputStream.computeSInt32Size(int, int)>
	//   15   26:iadd            
	//   16   27:iconst_3        
	//   17   28:iload_2         
	//   18   29:invokestatic    #159 <Method int CodedOutputStream.computeBoolSize(int, boolean)>
	//   19   32:iadd            
	//   20   33:iconst_4        
	//   21   34:iload_3         
	//   22   35:invokestatic    #91  <Method int CodedOutputStream.computeUInt32Size(int, int)>
	//   23   38:iadd            
	//   24   39:iconst_5        
	//   25   40:lload           4
	//   26   42:invokestatic    #37  <Method int CodedOutputStream.computeUInt64Size(int, long)>
	//   27   45:iadd            
	//   28   46:bipush          6
	//   29   48:lload           6
	//   30   50:invokestatic    #37  <Method int CodedOutputStream.computeUInt64Size(int, long)>
	//   31   53:iadd            
	//   32   54:ireturn         
	}

	private static int getEventLogSize(ByteString bytestring)
	{
		return CodedOutputStream.computeBytesSize(1, bytestring);
	//    0    0:iconst_1        
	//    1    1:aload_0         
	//    2    2:invokestatic    #41  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//    3    5:ireturn         
	}

	private static int getFrameSize(StackTraceElement stacktraceelement, boolean flag)
	{
		byte byte0 = 2;
	//    0    0:iconst_2        
	//    1    1:istore          4
		int i;
		int j;
		if(stacktraceelement.isNativeMethod())
	//*   2    3:aload_0         
	//*   3    4:invokevirtual   #182 <Method boolean StackTraceElement.isNativeMethod()>
	//*   4    7:ifeq            133
			i = 0 + CodedOutputStream.computeUInt64Size(1, Math.max(stacktraceelement.getLineNumber(), 0));
	//    5   10:iconst_0        
	//    6   11:iconst_1        
	//    7   12:aload_0         
	//    8   13:invokevirtual   #185 <Method int StackTraceElement.getLineNumber()>
	//    9   16:iconst_0        
	//   10   17:invokestatic    #190 <Method int Math.max(int, int)>
	//   11   20:i2l             
	//   12   21:invokestatic    #37  <Method int CodedOutputStream.computeUInt64Size(int, long)>
	//   13   24:iadd            
	//   14   25:istore_2        
		else
	//*  15   26:iload_2         
	//*  16   27:iconst_2        
	//*  17   28:new             #192 <Class StringBuilder>
	//*  18   31:dup             
	//*  19   32:invokespecial   #193 <Method void StringBuilder()>
	//*  20   35:aload_0         
	//*  21   36:invokevirtual   #197 <Method String StackTraceElement.getClassName()>
	//*  22   39:invokevirtual   #201 <Method StringBuilder StringBuilder.append(String)>
	//*  23   42:ldc1            #203 <String ".">
	//*  24   44:invokevirtual   #201 <Method StringBuilder StringBuilder.append(String)>
	//*  25   47:aload_0         
	//*  26   48:invokevirtual   #206 <Method String StackTraceElement.getMethodName()>
	//*  27   51:invokevirtual   #201 <Method StringBuilder StringBuilder.append(String)>
	//*  28   54:invokevirtual   #209 <Method String StringBuilder.toString()>
	//*  29   57:invokestatic    #19  <Method ByteString ByteString.copyFromUtf8(String)>
	//*  30   60:invokestatic    #41  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//*  31   63:iadd            
	//*  32   64:istore_3        
	//*  33   65:iload_3         
	//*  34   66:istore_2        
	//*  35   67:aload_0         
	//*  36   68:invokevirtual   #212 <Method String StackTraceElement.getFileName()>
	//*  37   71:ifnull          88
	//*  38   74:iload_3         
	//*  39   75:iconst_3        
	//*  40   76:aload_0         
	//*  41   77:invokevirtual   #212 <Method String StackTraceElement.getFileName()>
	//*  42   80:invokestatic    #19  <Method ByteString ByteString.copyFromUtf8(String)>
	//*  43   83:invokestatic    #41  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//*  44   86:iadd            
	//*  45   87:istore_2        
	//*  46   88:iload_2         
	//*  47   89:istore_3        
	//*  48   90:aload_0         
	//*  49   91:invokevirtual   #182 <Method boolean StackTraceElement.isNativeMethod()>
	//*  50   94:ifne            118
	//*  51   97:iload_2         
	//*  52   98:istore_3        
	//*  53   99:aload_0         
	//*  54  100:invokevirtual   #185 <Method int StackTraceElement.getLineNumber()>
	//*  55  103:ifle            118
	//*  56  106:iload_2         
	//*  57  107:iconst_4        
	//*  58  108:aload_0         
	//*  59  109:invokevirtual   #185 <Method int StackTraceElement.getLineNumber()>
	//*  60  112:i2l             
	//*  61  113:invokestatic    #37  <Method int CodedOutputStream.computeUInt64Size(int, long)>
	//*  62  116:iadd            
	//*  63  117:istore_3        
	//*  64  118:iload_1         
	//*  65  119:ifeq            144
	//*  66  122:iload           4
	//*  67  124:istore_2        
	//*  68  125:iload_3         
	//*  69  126:iconst_5        
	//*  70  127:iload_2         
	//*  71  128:invokestatic    #91  <Method int CodedOutputStream.computeUInt32Size(int, int)>
	//*  72  131:iadd            
	//*  73  132:ireturn         
			i = 0 + CodedOutputStream.computeUInt64Size(1, 0L);
	//   74  133:iconst_0        
	//   75  134:iconst_1        
	//   76  135:lconst_0        
	//   77  136:invokestatic    #37  <Method int CodedOutputStream.computeUInt64Size(int, long)>
	//   78  139:iadd            
	//   79  140:istore_2        
		j = i + CodedOutputStream.computeBytesSize(2, ByteString.copyFromUtf8((new StringBuilder()).append(stacktraceelement.getClassName()).append(".").append(stacktraceelement.getMethodName()).toString()));
		i = j;
		if(stacktraceelement.getFileName() != null)
			i = j + CodedOutputStream.computeBytesSize(3, ByteString.copyFromUtf8(stacktraceelement.getFileName()));
		j = i;
		if(!stacktraceelement.isNativeMethod())
		{
			j = i;
			if(stacktraceelement.getLineNumber() > 0)
				j = i + CodedOutputStream.computeUInt64Size(4, stacktraceelement.getLineNumber());
		}
		if(flag)
			i = ((int) (byte0));
		else
	//*  80  141:goto            26
			i = 0;
	//   81  144:iconst_0        
	//   82  145:istore_2        
		return j + CodedOutputStream.computeUInt32Size(5, i);
	//*  83  146:goto            125
	}

	private static int getSessionAppOrgSize(ByteString bytestring)
	{
		return 0 + CodedOutputStream.computeBytesSize(1, bytestring);
	//    0    0:iconst_0        
	//    1    1:iconst_1        
	//    2    2:aload_0         
	//    3    3:invokestatic    #41  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//    4    6:iadd            
	//    5    7:ireturn         
	}

	private static int getSessionAppSize(ByteString bytestring, ByteString bytestring1, ByteString bytestring2, ByteString bytestring3, ByteString bytestring4, int i, ByteString bytestring5)
	{
		int j = CodedOutputStream.computeBytesSize(1, bytestring);
	//    0    0:iconst_1        
	//    1    1:aload_0         
	//    2    2:invokestatic    #41  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//    3    5:istore          7
		int k = CodedOutputStream.computeBytesSize(2, bytestring2);
	//    4    7:iconst_2        
	//    5    8:aload_2         
	//    6    9:invokestatic    #41  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//    7   12:istore          8
		int l = CodedOutputStream.computeBytesSize(3, bytestring3);
	//    8   14:iconst_3        
	//    9   15:aload_3         
	//   10   16:invokestatic    #41  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//   11   19:istore          9
		int i1 = getSessionAppOrgSize(bytestring1);
	//   12   21:aload_1         
	//   13   22:invokestatic    #217 <Method int getSessionAppOrgSize(ByteString)>
	//   14   25:istore          10
		k = 0 + j + k + l + (CodedOutputStream.computeTagSize(5) + CodedOutputStream.computeRawVarint32Size(i1) + i1) + CodedOutputStream.computeBytesSize(6, bytestring4);
	//   15   27:iconst_0        
	//   16   28:iload           7
	//   17   30:iadd            
	//   18   31:iload           8
	//   19   33:iadd            
	//   20   34:iload           9
	//   21   36:iadd            
	//   22   37:iconst_5        
	//   23   38:invokestatic    #79  <Method int CodedOutputStream.computeTagSize(int)>
	//   24   41:iload           10
	//   25   43:invokestatic    #82  <Method int CodedOutputStream.computeRawVarint32Size(int)>
	//   26   46:iadd            
	//   27   47:iload           10
	//   28   49:iadd            
	//   29   50:iadd            
	//   30   51:bipush          6
	//   31   53:aload           4
	//   32   55:invokestatic    #41  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//   33   58:iadd            
	//   34   59:istore          8
		j = k;
	//   35   61:iload           8
	//   36   63:istore          7
		if(bytestring5 != null)
	//*  37   65:aload           6
	//*  38   67:ifnull          91
			j = k + CodedOutputStream.computeBytesSize(8, UNITY_PLATFORM_BYTE_STRING) + CodedOutputStream.computeBytesSize(9, bytestring5);
	//   39   70:iload           8
	//   40   72:bipush          8
	//   41   74:getstatic       #25  <Field ByteString UNITY_PLATFORM_BYTE_STRING>
	//   42   77:invokestatic    #41  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//   43   80:iadd            
	//   44   81:bipush          9
	//   45   83:aload           6
	//   46   85:invokestatic    #41  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//   47   88:iadd            
	//   48   89:istore          7
		return j + CodedOutputStream.computeEnumSize(10, i);
	//   49   91:iload           7
	//   50   93:bipush          10
	//   51   95:iload           5
	//   52   97:invokestatic    #53  <Method int CodedOutputStream.computeEnumSize(int, int)>
	//   53  100:iadd            
	//   54  101:ireturn         
	}

	private static int getSessionDeviceSize(int i, ByteString bytestring, ByteString bytestring1, int j, long l, long l1, 
			boolean flag, Map map, int k, ByteString bytestring2, ByteString bytestring3)
	{
		int i1 = CodedOutputStream.computeBytesSize(1, bytestring);
	//    0    0:iconst_1        
	//    1    1:aload_1         
	//    2    2:invokestatic    #41  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//    3    5:istore          13
		int j1 = CodedOutputStream.computeEnumSize(3, i);
	//    4    7:iconst_3        
	//    5    8:iload_0         
	//    6    9:invokestatic    #53  <Method int CodedOutputStream.computeEnumSize(int, int)>
	//    7   12:istore          14
		if(bytestring1 == null)
	//*   8   14:aload_2         
	//*   9   15:ifnonnull       141
			i = 0;
	//   10   18:iconst_0        
	//   11   19:istore_0        
		else
	//*  12   20:iconst_0        
	//*  13   21:iload           13
	//*  14   23:iadd            
	//*  15   24:iload           14
	//*  16   26:iadd            
	//*  17   27:iload_0         
	//*  18   28:iadd            
	//*  19   29:iconst_5        
	//*  20   30:iload_3         
	//*  21   31:invokestatic    #91  <Method int CodedOutputStream.computeUInt32Size(int, int)>
	//*  22   34:iadd            
	//*  23   35:bipush          6
	//*  24   37:lload           4
	//*  25   39:invokestatic    #37  <Method int CodedOutputStream.computeUInt64Size(int, long)>
	//*  26   42:iadd            
	//*  27   43:bipush          7
	//*  28   45:lload           6
	//*  29   47:invokestatic    #37  <Method int CodedOutputStream.computeUInt64Size(int, long)>
	//*  30   50:iadd            
	//*  31   51:bipush          10
	//*  32   53:iload           8
	//*  33   55:invokestatic    #159 <Method int CodedOutputStream.computeBoolSize(int, boolean)>
	//*  34   58:iadd            
	//*  35   59:istore_0        
	//*  36   60:iload_0         
	//*  37   61:istore_3        
	//*  38   62:aload           9
	//*  39   64:ifnull          150
	//*  40   67:aload           9
	//*  41   69:invokeinterface #122 <Method Set Map.entrySet()>
	//*  42   74:invokeinterface #128 <Method Iterator Set.iterator()>
	//*  43   79:astore_1        
	//*  44   80:iload_0         
	//*  45   81:istore_3        
	//*  46   82:aload_1         
	//*  47   83:invokeinterface #134 <Method boolean Iterator.hasNext()>
	//*  48   88:ifeq            150
	//*  49   91:aload_1         
	//*  50   92:invokeinterface #138 <Method Object Iterator.next()>
	//*  51   97:checkcast       #140 <Class java.util.Map$Entry>
	//*  52  100:astore_2        
	//*  53  101:aload_2         
	//*  54  102:invokeinterface #143 <Method Object java.util.Map$Entry.getKey()>
	//*  55  107:checkcast       #45  <Class io.fabric.sdk.android.services.common.IdManager$DeviceIdentifierType>
	//*  56  110:aload_2         
	//*  57  111:invokeinterface #148 <Method Object java.util.Map$Entry.getValue()>
	//*  58  116:checkcast       #145 <Class String>
	//*  59  119:invokestatic    #221 <Method int getDeviceIdentifierSize(io.fabric.sdk.android.services.common.IdManager$DeviceIdentifierType, String)>
	//*  60  122:istore_3        
	//*  61  123:iload_0         
	//*  62  124:bipush          11
	//*  63  126:invokestatic    #79  <Method int CodedOutputStream.computeTagSize(int)>
	//*  64  129:iload_3         
	//*  65  130:invokestatic    #82  <Method int CodedOutputStream.computeRawVarint32Size(int)>
	//*  66  133:iadd            
	//*  67  134:iload_3         
	//*  68  135:iadd            
	//*  69  136:iadd            
	//*  70  137:istore_0        
	//*  71  138:goto            80
			i = CodedOutputStream.computeBytesSize(4, bytestring1);
	//   72  141:iconst_4        
	//   73  142:aload_2         
	//   74  143:invokestatic    #41  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//   75  146:istore_0        
		i = 0 + i1 + j1 + i + CodedOutputStream.computeUInt32Size(5, j) + CodedOutputStream.computeUInt64Size(6, l) + CodedOutputStream.computeUInt64Size(7, l1) + CodedOutputStream.computeBoolSize(10, flag);
		j = i;
		if(map != null)
		{
			bytestring = ((ByteString) (map.entrySet().iterator()));
			do
			{
				j = i;
				if(!((Iterator) (bytestring)).hasNext())
					break;
				bytestring1 = ((ByteString) ((java.util.Map.Entry)((Iterator) (bytestring)).next()));
				j = getDeviceIdentifierSize((io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType)((java.util.Map.Entry) (bytestring1)).getKey(), (String)((java.util.Map.Entry) (bytestring1)).getValue());
				i += CodedOutputStream.computeTagSize(11) + CodedOutputStream.computeRawVarint32Size(j) + j;
			} while(true);
		}
	//*  76  147:goto            20
		i1 = CodedOutputStream.computeUInt32Size(12, k);
	//   77  150:bipush          12
	//   78  152:iload           10
	//   79  154:invokestatic    #91  <Method int CodedOutputStream.computeUInt32Size(int, int)>
	//   80  157:istore          13
		if(bytestring2 == null)
	//*  81  159:aload           11
	//*  82  161:ifnonnull       184
			i = 0;
	//   83  164:iconst_0        
	//   84  165:istore_0        
		else
	//*  85  166:aload           12
	//*  86  168:ifnonnull       195
	//*  87  171:iconst_0        
	//*  88  172:istore          10
	//*  89  174:iload_3         
	//*  90  175:iload           13
	//*  91  177:iadd            
	//*  92  178:iload_0         
	//*  93  179:iadd            
	//*  94  180:iload           10
	//*  95  182:iadd            
	//*  96  183:ireturn         
			i = CodedOutputStream.computeBytesSize(13, bytestring2);
	//   97  184:bipush          13
	//   98  186:aload           11
	//   99  188:invokestatic    #41  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//  100  191:istore_0        
		if(bytestring3 == null)
			k = 0;
		else
	//* 101  192:goto            166
			k = CodedOutputStream.computeBytesSize(14, bytestring3);
	//  102  195:bipush          14
	//  103  197:aload           12
	//  104  199:invokestatic    #41  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//  105  202:istore          10
		return j + i1 + i + k;
	//* 106  204:goto            174
	}

	private static int getSessionEventSize(long l, String s, TrimmedThrowableData trimmedthrowabledata, Thread thread, StackTraceElement astacktraceelement[], Thread athread[], List list, 
			int i, Map map, android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo, int j, ByteString bytestring, ByteString bytestring1, Float float1, 
			int k, boolean flag, long l1, long l2, ByteString bytestring2)
	{
		int i1 = CodedOutputStream.computeUInt64Size(1, l);
	//    0    0:iconst_1        
	//    1    1:lload_0         
	//    2    2:invokestatic    #37  <Method int CodedOutputStream.computeUInt64Size(int, long)>
	//    3    5:istore          22
		int j1 = CodedOutputStream.computeBytesSize(2, ByteString.copyFromUtf8(s));
	//    4    7:iconst_2        
	//    5    8:aload_2         
	//    6    9:invokestatic    #19  <Method ByteString ByteString.copyFromUtf8(String)>
	//    7   12:invokestatic    #41  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//    8   15:istore          23
		i = getEventAppSize(trimmedthrowabledata, thread, astacktraceelement, athread, list, i, bytestring, bytestring1, map, runningappprocessinfo, j);
	//    9   17:aload_3         
	//   10   18:aload           4
	//   11   20:aload           5
	//   12   22:aload           6
	//   13   24:aload           7
	//   14   26:iload           8
	//   15   28:aload           12
	//   16   30:aload           13
	//   17   32:aload           9
	//   18   34:aload           10
	//   19   36:iload           11
	//   20   38:invokestatic    #226 <Method int getEventAppSize(TrimmedThrowableData, Thread, StackTraceElement[], Thread[], List, int, ByteString, ByteString, Map, android.app.ActivityManager$RunningAppProcessInfo, int)>
	//   21   41:istore          8
		int k1 = CodedOutputStream.computeTagSize(3);
	//   22   43:iconst_3        
	//   23   44:invokestatic    #79  <Method int CodedOutputStream.computeTagSize(int)>
	//   24   47:istore          24
		int i2 = CodedOutputStream.computeRawVarint32Size(i);
	//   25   49:iload           8
	//   26   51:invokestatic    #82  <Method int CodedOutputStream.computeRawVarint32Size(int)>
	//   27   54:istore          25
		j = getEventDeviceSize(float1, k, flag, j, l1, l2);
	//   28   56:aload           14
	//   29   58:iload           15
	//   30   60:iload           16
	//   31   62:iload           11
	//   32   64:lload           17
	//   33   66:lload           19
	//   34   68:invokestatic    #228 <Method int getEventDeviceSize(Float, int, boolean, int, long, long)>
	//   35   71:istore          11
		j = 0 + i1 + j1 + (k1 + i2 + i) + (CodedOutputStream.computeTagSize(5) + CodedOutputStream.computeRawVarint32Size(j) + j);
	//   36   73:iconst_0        
	//   37   74:iload           22
	//   38   76:iadd            
	//   39   77:iload           23
	//   40   79:iadd            
	//   41   80:iload           24
	//   42   82:iload           25
	//   43   84:iadd            
	//   44   85:iload           8
	//   45   87:iadd            
	//   46   88:iadd            
	//   47   89:iconst_5        
	//   48   90:invokestatic    #79  <Method int CodedOutputStream.computeTagSize(int)>
	//   49   93:iload           11
	//   50   95:invokestatic    #82  <Method int CodedOutputStream.computeRawVarint32Size(int)>
	//   51   98:iadd            
	//   52   99:iload           11
	//   53  101:iadd            
	//   54  102:iadd            
	//   55  103:istore          11
		i = j;
	//   56  105:iload           11
	//   57  107:istore          8
		if(bytestring2 != null)
	//*  58  109:aload           21
	//*  59  111:ifnull          140
		{
			i = getEventLogSize(bytestring2);
	//   60  114:aload           21
	//   61  116:invokestatic    #230 <Method int getEventLogSize(ByteString)>
	//   62  119:istore          8
			i = j + (CodedOutputStream.computeTagSize(6) + CodedOutputStream.computeRawVarint32Size(i) + i);
	//   63  121:iload           11
	//   64  123:bipush          6
	//   65  125:invokestatic    #79  <Method int CodedOutputStream.computeTagSize(int)>
	//   66  128:iload           8
	//   67  130:invokestatic    #82  <Method int CodedOutputStream.computeRawVarint32Size(int)>
	//   68  133:iadd            
	//   69  134:iload           8
	//   70  136:iadd            
	//   71  137:iadd            
	//   72  138:istore          8
		}
		return i;
	//   73  140:iload           8
	//   74  142:ireturn         
	}

	private static int getSessionOSSize(ByteString bytestring, ByteString bytestring1, boolean flag)
	{
		return 0 + CodedOutputStream.computeEnumSize(1, 3) + CodedOutputStream.computeBytesSize(2, bytestring) + CodedOutputStream.computeBytesSize(3, bytestring1) + CodedOutputStream.computeBoolSize(4, flag);
	//    0    0:iconst_0        
	//    1    1:iconst_1        
	//    2    2:iconst_3        
	//    3    3:invokestatic    #53  <Method int CodedOutputStream.computeEnumSize(int, int)>
	//    4    6:iadd            
	//    5    7:iconst_2        
	//    6    8:aload_0         
	//    7    9:invokestatic    #41  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//    8   12:iadd            
	//    9   13:iconst_3        
	//   10   14:aload_1         
	//   11   15:invokestatic    #41  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//   12   18:iadd            
	//   13   19:iconst_4        
	//   14   20:iload_2         
	//   15   21:invokestatic    #159 <Method int CodedOutputStream.computeBoolSize(int, boolean)>
	//   16   24:iadd            
	//   17   25:ireturn         
	}

	private static int getThreadSize(Thread thread, StackTraceElement astacktraceelement[], int i, boolean flag)
	{
		int j = CodedOutputStream.computeBytesSize(1, ByteString.copyFromUtf8(thread.getName())) + CodedOutputStream.computeUInt32Size(2, i);
	//    0    0:iconst_1        
	//    1    1:aload_0         
	//    2    2:invokevirtual   #238 <Method String Thread.getName()>
	//    3    5:invokestatic    #19  <Method ByteString ByteString.copyFromUtf8(String)>
	//    4    8:invokestatic    #41  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//    5   11:iconst_2        
	//    6   12:iload_2         
	//    7   13:invokestatic    #91  <Method int CodedOutputStream.computeUInt32Size(int, int)>
	//    8   16:iadd            
	//    9   17:istore          4
		int k = astacktraceelement.length;
	//   10   19:aload_1         
	//   11   20:arraylength     
	//   12   21:istore          5
		for(i = 0; i < k; i++)
	//*  13   23:iconst_0        
	//*  14   24:istore_2        
	//*  15   25:iload_2         
	//*  16   26:iload           5
	//*  17   28:icmpge          65
		{
			int l = getFrameSize(astacktraceelement[i], flag);
	//   18   31:aload_1         
	//   19   32:iload_2         
	//   20   33:aaload          
	//   21   34:iload_3         
	//   22   35:invokestatic    #75  <Method int getFrameSize(StackTraceElement, boolean)>
	//   23   38:istore          6
			j += CodedOutputStream.computeTagSize(3) + CodedOutputStream.computeRawVarint32Size(l) + l;
	//   24   40:iload           4
	//   25   42:iconst_3        
	//   26   43:invokestatic    #79  <Method int CodedOutputStream.computeTagSize(int)>
	//   27   46:iload           6
	//   28   48:invokestatic    #82  <Method int CodedOutputStream.computeRawVarint32Size(int)>
	//   29   51:iadd            
	//   30   52:iload           6
	//   31   54:iadd            
	//   32   55:iadd            
	//   33   56:istore          4
		}

	//   34   58:iload_2         
	//   35   59:iconst_1        
	//   36   60:iadd            
	//   37   61:istore_2        
	//*  38   62:goto            25
		return j;
	//   39   65:iload           4
	//   40   67:ireturn         
	}

	private static ByteString stringToByteString(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return ByteString.copyFromUtf8(s);
	//    4    6:aload_0         
	//    5    7:invokestatic    #19  <Method ByteString ByteString.copyFromUtf8(String)>
	//    6   10:areturn         
	}

	public static void writeBeginSession(CodedOutputStream codedoutputstream, String s, String s1, long l)
		throws Exception
	{
		codedoutputstream.writeBytes(1, ByteString.copyFromUtf8(s1));
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_2         
	//    3    3:invokestatic    #19  <Method ByteString ByteString.copyFromUtf8(String)>
	//    4    6:invokevirtual   #247 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		codedoutputstream.writeBytes(2, ByteString.copyFromUtf8(s));
	//    5    9:aload_0         
	//    6   10:iconst_2        
	//    7   11:aload_1         
	//    8   12:invokestatic    #19  <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   15:invokevirtual   #247 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		codedoutputstream.writeUInt64(3, l);
	//   10   18:aload_0         
	//   11   19:iconst_3        
	//   12   20:lload_3         
	//   13   21:invokevirtual   #251 <Method void CodedOutputStream.writeUInt64(int, long)>
	//   14   24:return          
	}

	private static void writeFrame(CodedOutputStream codedoutputstream, int i, StackTraceElement stacktraceelement, boolean flag)
		throws Exception
	{
		byte byte0 = 4;
	//    0    0:iconst_4        
	//    1    1:istore          4
		codedoutputstream.writeTag(i, 2);
	//    2    3:aload_0         
	//    3    4:iload_1         
	//    4    5:iconst_2        
	//    5    6:invokevirtual   #258 <Method void CodedOutputStream.writeTag(int, int)>
		codedoutputstream.writeRawVarint32(getFrameSize(stacktraceelement, flag));
	//    6    9:aload_0         
	//    7   10:aload_2         
	//    8   11:iload_3         
	//    9   12:invokestatic    #75  <Method int getFrameSize(StackTraceElement, boolean)>
	//   10   15:invokevirtual   #262 <Method void CodedOutputStream.writeRawVarint32(int)>
		if(stacktraceelement.isNativeMethod())
	//*  11   18:aload_2         
	//*  12   19:invokevirtual   #182 <Method boolean StackTraceElement.isNativeMethod()>
	//*  13   22:ifeq            133
			codedoutputstream.writeUInt64(1, Math.max(stacktraceelement.getLineNumber(), 0));
	//   14   25:aload_0         
	//   15   26:iconst_1        
	//   16   27:aload_2         
	//   17   28:invokevirtual   #185 <Method int StackTraceElement.getLineNumber()>
	//   18   31:iconst_0        
	//   19   32:invokestatic    #190 <Method int Math.max(int, int)>
	//   20   35:i2l             
	//   21   36:invokevirtual   #251 <Method void CodedOutputStream.writeUInt64(int, long)>
		else
	//*  22   39:aload_0         
	//*  23   40:iconst_2        
	//*  24   41:new             #192 <Class StringBuilder>
	//*  25   44:dup             
	//*  26   45:invokespecial   #193 <Method void StringBuilder()>
	//*  27   48:aload_2         
	//*  28   49:invokevirtual   #197 <Method String StackTraceElement.getClassName()>
	//*  29   52:invokevirtual   #201 <Method StringBuilder StringBuilder.append(String)>
	//*  30   55:ldc1            #203 <String ".">
	//*  31   57:invokevirtual   #201 <Method StringBuilder StringBuilder.append(String)>
	//*  32   60:aload_2         
	//*  33   61:invokevirtual   #206 <Method String StackTraceElement.getMethodName()>
	//*  34   64:invokevirtual   #201 <Method StringBuilder StringBuilder.append(String)>
	//*  35   67:invokevirtual   #209 <Method String StringBuilder.toString()>
	//*  36   70:invokestatic    #19  <Method ByteString ByteString.copyFromUtf8(String)>
	//*  37   73:invokevirtual   #247 <Method void CodedOutputStream.writeBytes(int, ByteString)>
	//*  38   76:aload_2         
	//*  39   77:invokevirtual   #212 <Method String StackTraceElement.getFileName()>
	//*  40   80:ifnull          95
	//*  41   83:aload_0         
	//*  42   84:iconst_3        
	//*  43   85:aload_2         
	//*  44   86:invokevirtual   #212 <Method String StackTraceElement.getFileName()>
	//*  45   89:invokestatic    #19  <Method ByteString ByteString.copyFromUtf8(String)>
	//*  46   92:invokevirtual   #247 <Method void CodedOutputStream.writeBytes(int, ByteString)>
	//*  47   95:aload_2         
	//*  48   96:invokevirtual   #182 <Method boolean StackTraceElement.isNativeMethod()>
	//*  49   99:ifne            119
	//*  50  102:aload_2         
	//*  51  103:invokevirtual   #185 <Method int StackTraceElement.getLineNumber()>
	//*  52  106:ifle            119
	//*  53  109:aload_0         
	//*  54  110:iconst_4        
	//*  55  111:aload_2         
	//*  56  112:invokevirtual   #185 <Method int StackTraceElement.getLineNumber()>
	//*  57  115:i2l             
	//*  58  116:invokevirtual   #251 <Method void CodedOutputStream.writeUInt64(int, long)>
	//*  59  119:iload_3         
	//*  60  120:ifeq            142
	//*  61  123:iload           4
	//*  62  125:istore_1        
	//*  63  126:aload_0         
	//*  64  127:iconst_5        
	//*  65  128:iload_1         
	//*  66  129:invokevirtual   #265 <Method void CodedOutputStream.writeUInt32(int, int)>
	//*  67  132:return          
			codedoutputstream.writeUInt64(1, 0L);
	//   68  133:aload_0         
	//   69  134:iconst_1        
	//   70  135:lconst_0        
	//   71  136:invokevirtual   #251 <Method void CodedOutputStream.writeUInt64(int, long)>
		codedoutputstream.writeBytes(2, ByteString.copyFromUtf8((new StringBuilder()).append(stacktraceelement.getClassName()).append(".").append(stacktraceelement.getMethodName()).toString()));
		if(stacktraceelement.getFileName() != null)
			codedoutputstream.writeBytes(3, ByteString.copyFromUtf8(stacktraceelement.getFileName()));
		if(!stacktraceelement.isNativeMethod() && stacktraceelement.getLineNumber() > 0)
			codedoutputstream.writeUInt64(4, stacktraceelement.getLineNumber());
		if(flag)
			i = ((int) (byte0));
		else
	//*  72  139:goto            39
			i = 0;
	//   73  142:iconst_0        
	//   74  143:istore_1        
		codedoutputstream.writeUInt32(5, i);
	//*  75  144:goto            126
	}

	public static void writeSessionApp(CodedOutputStream codedoutputstream, String s, String s1, String s2, String s3, String s4, int i, String s5)
		throws Exception
	{
		ByteString bytestring = ByteString.copyFromUtf8(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #19  <Method ByteString ByteString.copyFromUtf8(String)>
	//    2    4:astore          8
		s1 = ((String) (ByteString.copyFromUtf8(s1)));
	//    3    6:aload_2         
	//    4    7:invokestatic    #19  <Method ByteString ByteString.copyFromUtf8(String)>
	//    5   10:astore_2        
		s2 = ((String) (ByteString.copyFromUtf8(s2)));
	//    6   11:aload_3         
	//    7   12:invokestatic    #19  <Method ByteString ByteString.copyFromUtf8(String)>
	//    8   15:astore_3        
		s3 = ((String) (ByteString.copyFromUtf8(s3)));
	//    9   16:aload           4
	//   10   18:invokestatic    #19  <Method ByteString ByteString.copyFromUtf8(String)>
	//   11   21:astore          4
		s4 = ((String) (ByteString.copyFromUtf8(s4)));
	//   12   23:aload           5
	//   13   25:invokestatic    #19  <Method ByteString ByteString.copyFromUtf8(String)>
	//   14   28:astore          5
		if(s5 != null)
	//*  15   30:aload           7
	//*  16   32:ifnull          143
			s = ((String) (ByteString.copyFromUtf8(s5)));
	//   17   35:aload           7
	//   18   37:invokestatic    #19  <Method ByteString ByteString.copyFromUtf8(String)>
	//   19   40:astore_1        
		else
	//*  20   41:aload_0         
	//*  21   42:bipush          7
	//*  22   44:iconst_2        
	//*  23   45:invokevirtual   #258 <Method void CodedOutputStream.writeTag(int, int)>
	//*  24   48:aload_0         
	//*  25   49:aload           8
	//*  26   51:aload_2         
	//*  27   52:aload_3         
	//*  28   53:aload           4
	//*  29   55:aload           5
	//*  30   57:iload           6
	//*  31   59:aload_1         
	//*  32   60:invokestatic    #269 <Method int getSessionAppSize(ByteString, ByteString, ByteString, ByteString, ByteString, int, ByteString)>
	//*  33   63:invokevirtual   #262 <Method void CodedOutputStream.writeRawVarint32(int)>
	//*  34   66:aload_0         
	//*  35   67:iconst_1        
	//*  36   68:aload           8
	//*  37   70:invokevirtual   #247 <Method void CodedOutputStream.writeBytes(int, ByteString)>
	//*  38   73:aload_0         
	//*  39   74:iconst_2        
	//*  40   75:aload_3         
	//*  41   76:invokevirtual   #247 <Method void CodedOutputStream.writeBytes(int, ByteString)>
	//*  42   79:aload_0         
	//*  43   80:iconst_3        
	//*  44   81:aload           4
	//*  45   83:invokevirtual   #247 <Method void CodedOutputStream.writeBytes(int, ByteString)>
	//*  46   86:aload_0         
	//*  47   87:iconst_5        
	//*  48   88:iconst_2        
	//*  49   89:invokevirtual   #258 <Method void CodedOutputStream.writeTag(int, int)>
	//*  50   92:aload_0         
	//*  51   93:aload_2         
	//*  52   94:invokestatic    #217 <Method int getSessionAppOrgSize(ByteString)>
	//*  53   97:invokevirtual   #262 <Method void CodedOutputStream.writeRawVarint32(int)>
	//*  54  100:aload_0         
	//*  55  101:iconst_1        
	//*  56  102:aload_2         
	//*  57  103:invokevirtual   #247 <Method void CodedOutputStream.writeBytes(int, ByteString)>
	//*  58  106:aload_0         
	//*  59  107:bipush          6
	//*  60  109:aload           5
	//*  61  111:invokevirtual   #247 <Method void CodedOutputStream.writeBytes(int, ByteString)>
	//*  62  114:aload_1         
	//*  63  115:ifnull          134
	//*  64  118:aload_0         
	//*  65  119:bipush          8
	//*  66  121:getstatic       #25  <Field ByteString UNITY_PLATFORM_BYTE_STRING>
	//*  67  124:invokevirtual   #247 <Method void CodedOutputStream.writeBytes(int, ByteString)>
	//*  68  127:aload_0         
	//*  69  128:bipush          9
	//*  70  130:aload_1         
	//*  71  131:invokevirtual   #247 <Method void CodedOutputStream.writeBytes(int, ByteString)>
	//*  72  134:aload_0         
	//*  73  135:bipush          10
	//*  74  137:iload           6
	//*  75  139:invokevirtual   #272 <Method void CodedOutputStream.writeEnum(int, int)>
	//*  76  142:return          
			s = null;
	//   77  143:aconst_null     
	//   78  144:astore_1        
		codedoutputstream.writeTag(7, 2);
		codedoutputstream.writeRawVarint32(getSessionAppSize(bytestring, ((ByteString) (s1)), ((ByteString) (s2)), ((ByteString) (s3)), ((ByteString) (s4)), i, ((ByteString) (s))));
		codedoutputstream.writeBytes(1, bytestring);
		codedoutputstream.writeBytes(2, ((ByteString) (s2)));
		codedoutputstream.writeBytes(3, ((ByteString) (s3)));
		codedoutputstream.writeTag(5, 2);
		codedoutputstream.writeRawVarint32(getSessionAppOrgSize(((ByteString) (s1))));
		codedoutputstream.writeBytes(1, ((ByteString) (s1)));
		codedoutputstream.writeBytes(6, ((ByteString) (s4)));
		if(s != null)
		{
			codedoutputstream.writeBytes(8, UNITY_PLATFORM_BYTE_STRING);
			codedoutputstream.writeBytes(9, ((ByteString) (s)));
		}
		codedoutputstream.writeEnum(10, i);
	//*  79  145:goto            41
	}

	public static void writeSessionDevice(CodedOutputStream codedoutputstream, String s, int i, String s1, int j, long l, long l1, boolean flag, Map map, int k, String s2, String s3)
		throws Exception
	{
		s = ((String) (ByteString.copyFromUtf8(s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #19  <Method ByteString ByteString.copyFromUtf8(String)>
	//    2    4:astore_1        
		ByteString bytestring = stringToByteString(s1);
	//    3    5:aload_3         
	//    4    6:invokestatic    #276 <Method ByteString stringToByteString(String)>
	//    5    9:astore          14
		s1 = ((String) (stringToByteString(s3)));
	//    6   11:aload           13
	//    7   13:invokestatic    #276 <Method ByteString stringToByteString(String)>
	//    8   16:astore_3        
		s2 = ((String) (stringToByteString(s2)));
	//    9   17:aload           12
	//   10   19:invokestatic    #276 <Method ByteString stringToByteString(String)>
	//   11   22:astore          12
		codedoutputstream.writeTag(9, 2);
	//   12   24:aload_0         
	//   13   25:bipush          9
	//   14   27:iconst_2        
	//   15   28:invokevirtual   #258 <Method void CodedOutputStream.writeTag(int, int)>
		codedoutputstream.writeRawVarint32(getSessionDeviceSize(i, ((ByteString) (s)), bytestring, j, l, l1, flag, map, k, ((ByteString) (s2)), ((ByteString) (s1))));
	//   16   31:aload_0         
	//   17   32:iload_2         
	//   18   33:aload_1         
	//   19   34:aload           14
	//   20   36:iload           4
	//   21   38:lload           5
	//   22   40:lload           7
	//   23   42:iload           9
	//   24   44:aload           10
	//   25   46:iload           11
	//   26   48:aload           12
	//   27   50:aload_3         
	//   28   51:invokestatic    #278 <Method int getSessionDeviceSize(int, ByteString, ByteString, int, long, long, boolean, Map, int, ByteString, ByteString)>
	//   29   54:invokevirtual   #262 <Method void CodedOutputStream.writeRawVarint32(int)>
		codedoutputstream.writeBytes(1, ((ByteString) (s)));
	//   30   57:aload_0         
	//   31   58:iconst_1        
	//   32   59:aload_1         
	//   33   60:invokevirtual   #247 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		codedoutputstream.writeEnum(3, i);
	//   34   63:aload_0         
	//   35   64:iconst_3        
	//   36   65:iload_2         
	//   37   66:invokevirtual   #272 <Method void CodedOutputStream.writeEnum(int, int)>
		codedoutputstream.writeBytes(4, bytestring);
	//   38   69:aload_0         
	//   39   70:iconst_4        
	//   40   71:aload           14
	//   41   73:invokevirtual   #247 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		codedoutputstream.writeUInt32(5, j);
	//   42   76:aload_0         
	//   43   77:iconst_5        
	//   44   78:iload           4
	//   45   80:invokevirtual   #265 <Method void CodedOutputStream.writeUInt32(int, int)>
		codedoutputstream.writeUInt64(6, l);
	//   46   83:aload_0         
	//   47   84:bipush          6
	//   48   86:lload           5
	//   49   88:invokevirtual   #251 <Method void CodedOutputStream.writeUInt64(int, long)>
		codedoutputstream.writeUInt64(7, l1);
	//   50   91:aload_0         
	//   51   92:bipush          7
	//   52   94:lload           7
	//   53   96:invokevirtual   #251 <Method void CodedOutputStream.writeUInt64(int, long)>
		codedoutputstream.writeBool(10, flag);
	//   54   99:aload_0         
	//   55  100:bipush          10
	//   56  102:iload           9
	//   57  104:invokevirtual   #282 <Method void CodedOutputStream.writeBool(int, boolean)>
		for(s = ((String) (map.entrySet().iterator())); ((Iterator) (s)).hasNext(); codedoutputstream.writeBytes(2, ByteString.copyFromUtf8((String)((java.util.Map.Entry) (map)).getValue())))
	//*  58  107:aload           10
	//*  59  109:invokeinterface #122 <Method Set Map.entrySet()>
	//*  60  114:invokeinterface #128 <Method Iterator Set.iterator()>
	//*  61  119:astore_1        
	//*  62  120:aload_1         
	//*  63  121:invokeinterface #134 <Method boolean Iterator.hasNext()>
	//*  64  126:ifeq            213
		{
			map = ((Map) ((java.util.Map.Entry)((Iterator) (s)).next()));
	//   65  129:aload_1         
	//   66  130:invokeinterface #138 <Method Object Iterator.next()>
	//   67  135:checkcast       #140 <Class java.util.Map$Entry>
	//   68  138:astore          10
			codedoutputstream.writeTag(11, 2);
	//   69  140:aload_0         
	//   70  141:bipush          11
	//   71  143:iconst_2        
	//   72  144:invokevirtual   #258 <Method void CodedOutputStream.writeTag(int, int)>
			codedoutputstream.writeRawVarint32(getDeviceIdentifierSize((io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType)((java.util.Map.Entry) (map)).getKey(), (String)((java.util.Map.Entry) (map)).getValue()));
	//   73  147:aload_0         
	//   74  148:aload           10
	//   75  150:invokeinterface #143 <Method Object java.util.Map$Entry.getKey()>
	//   76  155:checkcast       #45  <Class io.fabric.sdk.android.services.common.IdManager$DeviceIdentifierType>
	//   77  158:aload           10
	//   78  160:invokeinterface #148 <Method Object java.util.Map$Entry.getValue()>
	//   79  165:checkcast       #145 <Class String>
	//   80  168:invokestatic    #221 <Method int getDeviceIdentifierSize(io.fabric.sdk.android.services.common.IdManager$DeviceIdentifierType, String)>
	//   81  171:invokevirtual   #262 <Method void CodedOutputStream.writeRawVarint32(int)>
			codedoutputstream.writeEnum(1, ((io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType)((java.util.Map.Entry) (map)).getKey()).protobufIndex);
	//   82  174:aload_0         
	//   83  175:iconst_1        
	//   84  176:aload           10
	//   85  178:invokeinterface #143 <Method Object java.util.Map$Entry.getKey()>
	//   86  183:checkcast       #45  <Class io.fabric.sdk.android.services.common.IdManager$DeviceIdentifierType>
	//   87  186:getfield        #49  <Field int io.fabric.sdk.android.services.common.IdManager$DeviceIdentifierType.protobufIndex>
	//   88  189:invokevirtual   #272 <Method void CodedOutputStream.writeEnum(int, int)>
		}

	//   89  192:aload_0         
	//   90  193:iconst_2        
	//   91  194:aload           10
	//   92  196:invokeinterface #148 <Method Object java.util.Map$Entry.getValue()>
	//   93  201:checkcast       #145 <Class String>
	//   94  204:invokestatic    #19  <Method ByteString ByteString.copyFromUtf8(String)>
	//   95  207:invokevirtual   #247 <Method void CodedOutputStream.writeBytes(int, ByteString)>
	//*  96  210:goto            120
		codedoutputstream.writeUInt32(12, k);
	//   97  213:aload_0         
	//   98  214:bipush          12
	//   99  216:iload           11
	//  100  218:invokevirtual   #265 <Method void CodedOutputStream.writeUInt32(int, int)>
		if(s2 != null)
	//* 101  221:aload           12
	//* 102  223:ifnull          234
			codedoutputstream.writeBytes(13, ((ByteString) (s2)));
	//  103  226:aload_0         
	//  104  227:bipush          13
	//  105  229:aload           12
	//  106  231:invokevirtual   #247 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		if(s1 != null)
	//* 107  234:aload_3         
	//* 108  235:ifnull          245
			codedoutputstream.writeBytes(14, ((ByteString) (s1)));
	//  109  238:aload_0         
	//  110  239:bipush          14
	//  111  241:aload_3         
	//  112  242:invokevirtual   #247 <Method void CodedOutputStream.writeBytes(int, ByteString)>
	//  113  245:return          
	}

	public static void writeSessionEvent(CodedOutputStream codedoutputstream, long l, String s, TrimmedThrowableData trimmedthrowabledata, Thread thread, StackTraceElement astacktraceelement[], Thread athread[], 
			List list, Map map, LogFileManager logfilemanager, android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo, int i, String s1, String s2, 
			Float float1, int j, boolean flag, long l1, long l2)
		throws Exception
	{
		ByteString bytestring = ByteString.copyFromUtf8(s1);
	//    0    0:aload           13
	//    1    2:invokestatic    #19  <Method ByteString ByteString.copyFromUtf8(String)>
	//    2    5:astore          22
		if(s2 == null)
	//*   3    7:aload           14
	//*   4    9:ifnonnull       160
			s1 = null;
	//    5   12:aconst_null     
	//    6   13:astore          13
		else
	//*   7   15:aload           10
	//*   8   17:invokevirtual   #291 <Method ByteString LogFileManager.getByteStringForLog()>
	//*   9   20:astore          14
	//*  10   22:aload           14
	//*  11   24:ifnonnull       41
	//*  12   27:invokestatic    #297 <Method Logger Fabric.getLogger()>
	//*  13   30:ldc2            #299 <String "CrashlyticsCore">
	//*  14   33:ldc2            #301 <String "No log data to include with this event.">
	//*  15   36:invokeinterface #307 <Method void Logger.d(String, String)>
	//*  16   41:aload           10
	//*  17   43:invokevirtual   #310 <Method void LogFileManager.clearLog()>
	//*  18   46:aload_0         
	//*  19   47:bipush          10
	//*  20   49:iconst_2        
	//*  21   50:invokevirtual   #258 <Method void CodedOutputStream.writeTag(int, int)>
	//*  22   53:aload_0         
	//*  23   54:lload_1         
	//*  24   55:aload_3         
	//*  25   56:aload           4
	//*  26   58:aload           5
	//*  27   60:aload           6
	//*  28   62:aload           7
	//*  29   64:aload           8
	//*  30   66:bipush          8
	//*  31   68:aload           9
	//*  32   70:aload           11
	//*  33   72:iload           12
	//*  34   74:aload           22
	//*  35   76:aload           13
	//*  36   78:aload           15
	//*  37   80:iload           16
	//*  38   82:iload           17
	//*  39   84:lload           18
	//*  40   86:lload           20
	//*  41   88:aload           14
	//*  42   90:invokestatic    #312 <Method int getSessionEventSize(long, String, TrimmedThrowableData, Thread, StackTraceElement[], Thread[], List, int, Map, android.app.ActivityManager$RunningAppProcessInfo, int, ByteString, ByteString, Float, int, boolean, long, long, ByteString)>
	//*  43   93:invokevirtual   #262 <Method void CodedOutputStream.writeRawVarint32(int)>
	//*  44   96:aload_0         
	//*  45   97:iconst_1        
	//*  46   98:lload_1         
	//*  47   99:invokevirtual   #251 <Method void CodedOutputStream.writeUInt64(int, long)>
	//*  48  102:aload_0         
	//*  49  103:iconst_2        
	//*  50  104:aload_3         
	//*  51  105:invokestatic    #19  <Method ByteString ByteString.copyFromUtf8(String)>
	//*  52  108:invokevirtual   #247 <Method void CodedOutputStream.writeBytes(int, ByteString)>
	//*  53  111:aload_0         
	//*  54  112:aload           4
	//*  55  114:aload           5
	//*  56  116:aload           6
	//*  57  118:aload           7
	//*  58  120:aload           8
	//*  59  122:bipush          8
	//*  60  124:aload           22
	//*  61  126:aload           13
	//*  62  128:aload           9
	//*  63  130:aload           11
	//*  64  132:iload           12
	//*  65  134:invokestatic    #316 <Method void writeSessionEventApp(CodedOutputStream, TrimmedThrowableData, Thread, StackTraceElement[], Thread[], List, int, ByteString, ByteString, Map, android.app.ActivityManager$RunningAppProcessInfo, int)>
	//*  66  137:aload_0         
	//*  67  138:aload           15
	//*  68  140:iload           16
	//*  69  142:iload           17
	//*  70  144:iload           12
	//*  71  146:lload           18
	//*  72  148:lload           20
	//*  73  150:invokestatic    #320 <Method void writeSessionEventDevice(CodedOutputStream, Float, int, boolean, int, long, long)>
	//*  74  153:aload_0         
	//*  75  154:aload           14
	//*  76  156:invokestatic    #324 <Method void writeSessionEventLog(CodedOutputStream, ByteString)>
	//*  77  159:return          
			s1 = ((String) (ByteString.copyFromUtf8(s2.replace("-", ""))));
	//   78  160:aload           14
	//   79  162:ldc2            #326 <String "-">
	//   80  165:ldc1            #57  <String "">
	//   81  167:invokevirtual   #330 <Method String String.replace(CharSequence, CharSequence)>
	//   82  170:invokestatic    #19  <Method ByteString ByteString.copyFromUtf8(String)>
	//   83  173:astore          13
		s2 = ((String) (logfilemanager.getByteStringForLog()));
		if(s2 == null)
			Fabric.getLogger().d("CrashlyticsCore", "No log data to include with this event.");
		logfilemanager.clearLog();
		codedoutputstream.writeTag(10, 2);
		codedoutputstream.writeRawVarint32(getSessionEventSize(l, s, trimmedthrowabledata, thread, astacktraceelement, athread, list, 8, map, runningappprocessinfo, i, bytestring, ((ByteString) (s1)), float1, j, flag, l1, l2, ((ByteString) (s2))));
		codedoutputstream.writeUInt64(1, l);
		codedoutputstream.writeBytes(2, ByteString.copyFromUtf8(s));
		writeSessionEventApp(codedoutputstream, trimmedthrowabledata, thread, astacktraceelement, athread, list, 8, bytestring, ((ByteString) (s1)), map, runningappprocessinfo, i);
		writeSessionEventDevice(codedoutputstream, float1, j, flag, i, l1, l2);
		writeSessionEventLog(codedoutputstream, ((ByteString) (s2)));
	//*  84  175:goto            15
	}

	private static void writeSessionEventApp(CodedOutputStream codedoutputstream, TrimmedThrowableData trimmedthrowabledata, Thread thread, StackTraceElement astacktraceelement[], Thread athread[], List list, int i, ByteString bytestring, 
			ByteString bytestring1, Map map, android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo, int j)
		throws Exception
	{
		codedoutputstream.writeTag(3, 2);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #258 <Method void CodedOutputStream.writeTag(int, int)>
		codedoutputstream.writeRawVarint32(getEventAppSize(trimmedthrowabledata, thread, astacktraceelement, athread, list, i, bytestring, bytestring1, map, runningappprocessinfo, j));
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:aload_3         
	//    8   10:aload           4
	//    9   12:aload           5
	//   10   14:iload           6
	//   11   16:aload           7
	//   12   18:aload           8
	//   13   20:aload           9
	//   14   22:aload           10
	//   15   24:iload           11
	//   16   26:invokestatic    #226 <Method int getEventAppSize(TrimmedThrowableData, Thread, StackTraceElement[], Thread[], List, int, ByteString, ByteString, Map, android.app.ActivityManager$RunningAppProcessInfo, int)>
	//   17   29:invokevirtual   #262 <Method void CodedOutputStream.writeRawVarint32(int)>
		writeSessionEventAppExecution(codedoutputstream, trimmedthrowabledata, thread, astacktraceelement, athread, list, i, bytestring, bytestring1);
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:aload_2         
	//   21   35:aload_3         
	//   22   36:aload           4
	//   23   38:aload           5
	//   24   40:iload           6
	//   25   42:aload           7
	//   26   44:aload           8
	//   27   46:invokestatic    #335 <Method void writeSessionEventAppExecution(CodedOutputStream, TrimmedThrowableData, Thread, StackTraceElement[], Thread[], List, int, ByteString, ByteString)>
		if(map != null && !map.isEmpty())
	//*  28   49:aload           9
	//*  29   51:ifnull          70
	//*  30   54:aload           9
	//*  31   56:invokeinterface #338 <Method boolean Map.isEmpty()>
	//*  32   61:ifne            70
			writeSessionEventAppCustomAttributes(codedoutputstream, map);
	//   33   64:aload_0         
	//   34   65:aload           9
	//   35   67:invokestatic    #342 <Method void writeSessionEventAppCustomAttributes(CodedOutputStream, Map)>
		if(runningappprocessinfo != null)
	//*  36   70:aload           10
	//*  37   72:ifnull          95
		{
			boolean flag;
			if(runningappprocessinfo.importance != 100)
	//*  38   75:aload           10
	//*  39   77:getfield        #155 <Field int android.app.ActivityManager$RunningAppProcessInfo.importance>
	//*  40   80:bipush          100
	//*  41   82:icmpeq          103
				flag = true;
	//   42   85:iconst_1        
	//   43   86:istore          12
			else
	//*  44   88:aload_0         
	//*  45   89:iconst_3        
	//*  46   90:iload           12
	//*  47   92:invokevirtual   #282 <Method void CodedOutputStream.writeBool(int, boolean)>
	//*  48   95:aload_0         
	//*  49   96:iconst_4        
	//*  50   97:iload           11
	//*  51   99:invokevirtual   #265 <Method void CodedOutputStream.writeUInt32(int, int)>
	//*  52  102:return          
				flag = false;
	//   53  103:iconst_0        
	//   54  104:istore          12
			codedoutputstream.writeBool(3, flag);
		}
		codedoutputstream.writeUInt32(4, j);
	//*  55  106:goto            88
	}

	private static void writeSessionEventAppCustomAttributes(CodedOutputStream codedoutputstream, Map map)
		throws Exception
	{
		for(Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); codedoutputstream.writeBytes(2, ByteString.copyFromUtf8(((String) (map)))))
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #122 <Method Set Map.entrySet()>
	//*   2    6:invokeinterface #128 <Method Iterator Set.iterator()>
	//*   3   11:astore_3        
	//*   4   12:aload_3         
	//*   5   13:invokeinterface #134 <Method boolean Iterator.hasNext()>
	//*   6   18:ifeq            110
		{
			map = ((Map) ((java.util.Map.Entry)iterator.next()));
	//    7   21:aload_3         
	//    8   22:invokeinterface #138 <Method Object Iterator.next()>
	//    9   27:checkcast       #140 <Class java.util.Map$Entry>
	//   10   30:astore_1        
			codedoutputstream.writeTag(2, 2);
	//   11   31:aload_0         
	//   12   32:iconst_2        
	//   13   33:iconst_2        
	//   14   34:invokevirtual   #258 <Method void CodedOutputStream.writeTag(int, int)>
			codedoutputstream.writeRawVarint32(getEventAppCustomAttributeSize((String)((java.util.Map.Entry) (map)).getKey(), (String)((java.util.Map.Entry) (map)).getValue()));
	//   15   37:aload_0         
	//   16   38:aload_1         
	//   17   39:invokeinterface #143 <Method Object java.util.Map$Entry.getKey()>
	//   18   44:checkcast       #145 <Class String>
	//   19   47:aload_1         
	//   20   48:invokeinterface #148 <Method Object java.util.Map$Entry.getValue()>
	//   21   53:checkcast       #145 <Class String>
	//   22   56:invokestatic    #150 <Method int getEventAppCustomAttributeSize(String, String)>
	//   23   59:invokevirtual   #262 <Method void CodedOutputStream.writeRawVarint32(int)>
			codedoutputstream.writeBytes(1, ByteString.copyFromUtf8((String)((java.util.Map.Entry) (map)).getKey()));
	//   24   62:aload_0         
	//   25   63:iconst_1        
	//   26   64:aload_1         
	//   27   65:invokeinterface #143 <Method Object java.util.Map$Entry.getKey()>
	//   28   70:checkcast       #145 <Class String>
	//   29   73:invokestatic    #19  <Method ByteString ByteString.copyFromUtf8(String)>
	//   30   76:invokevirtual   #247 <Method void CodedOutputStream.writeBytes(int, ByteString)>
			String s = (String)((java.util.Map.Entry) (map)).getValue();
	//   31   79:aload_1         
	//   32   80:invokeinterface #148 <Method Object java.util.Map$Entry.getValue()>
	//   33   85:checkcast       #145 <Class String>
	//   34   88:astore_2        
			map = ((Map) (s));
	//   35   89:aload_2         
	//   36   90:astore_1        
			if(s == null)
	//*  37   91:aload_2         
	//*  38   92:ifnonnull       98
				map = "";
	//   39   95:ldc1            #57  <String "">
	//   40   97:astore_1        
		}

	//   41   98:aload_0         
	//   42   99:iconst_2        
	//   43  100:aload_1         
	//   44  101:invokestatic    #19  <Method ByteString ByteString.copyFromUtf8(String)>
	//   45  104:invokevirtual   #247 <Method void CodedOutputStream.writeBytes(int, ByteString)>
	//*  46  107:goto            12
	//   47  110:return          
	}

	private static void writeSessionEventAppExecution(CodedOutputStream codedoutputstream, TrimmedThrowableData trimmedthrowabledata, Thread thread, StackTraceElement astacktraceelement[], Thread athread[], List list, int i, ByteString bytestring, 
			ByteString bytestring1)
		throws Exception
	{
		codedoutputstream.writeTag(1, 2);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #258 <Method void CodedOutputStream.writeTag(int, int)>
		codedoutputstream.writeRawVarint32(getEventAppExecutionSize(trimmedthrowabledata, thread, astacktraceelement, athread, list, i, bytestring, bytestring1));
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:aload_3         
	//    8   10:aload           4
	//    9   12:aload           5
	//   10   14:iload           6
	//   11   16:aload           7
	//   12   18:aload           8
	//   13   20:invokestatic    #116 <Method int getEventAppExecutionSize(TrimmedThrowableData, Thread, StackTraceElement[], Thread[], List, int, ByteString, ByteString)>
	//   14   23:invokevirtual   #262 <Method void CodedOutputStream.writeRawVarint32(int)>
		writeThread(codedoutputstream, thread, astacktraceelement, 4, true);
	//   15   26:aload_0         
	//   16   27:aload_2         
	//   17   28:aload_3         
	//   18   29:iconst_4        
	//   19   30:iconst_1        
	//   20   31:invokestatic    #348 <Method void writeThread(CodedOutputStream, Thread, StackTraceElement[], int, boolean)>
		int k = athread.length;
	//   21   34:aload           4
	//   22   36:arraylength     
	//   23   37:istore          10
		for(int j = 0; j < k; j++)
	//*  24   39:iconst_0        
	//*  25   40:istore          9
	//*  26   42:iload           9
	//*  27   44:iload           10
	//*  28   46:icmpge          81
			writeThread(codedoutputstream, athread[j], (StackTraceElement[])list.get(j), 0, false);
	//   29   49:aload_0         
	//   30   50:aload           4
	//   31   52:iload           9
	//   32   54:aaload          
	//   33   55:aload           5
	//   34   57:iload           9
	//   35   59:invokeinterface #105 <Method Object List.get(int)>
	//   36   64:checkcast       #106 <Class StackTraceElement[]>
	//   37   67:iconst_0        
	//   38   68:iconst_0        
	//   39   69:invokestatic    #348 <Method void writeThread(CodedOutputStream, Thread, StackTraceElement[], int, boolean)>

	//   40   72:iload           9
	//   41   74:iconst_1        
	//   42   75:iadd            
	//   43   76:istore          9
	//*  44   78:goto            42
		writeSessionEventAppExecutionException(codedoutputstream, trimmedthrowabledata, 1, i, 2);
	//   45   81:aload_0         
	//   46   82:aload_1         
	//   47   83:iconst_1        
	//   48   84:iload           6
	//   49   86:iconst_2        
	//   50   87:invokestatic    #352 <Method void writeSessionEventAppExecutionException(CodedOutputStream, TrimmedThrowableData, int, int, int)>
		codedoutputstream.writeTag(3, 2);
	//   51   90:aload_0         
	//   52   91:iconst_3        
	//   53   92:iconst_2        
	//   54   93:invokevirtual   #258 <Method void CodedOutputStream.writeTag(int, int)>
		codedoutputstream.writeRawVarint32(getEventAppExecutionSignalSize());
	//   55   96:aload_0         
	//   56   97:invokestatic    #108 <Method int getEventAppExecutionSignalSize()>
	//   57  100:invokevirtual   #262 <Method void CodedOutputStream.writeRawVarint32(int)>
		codedoutputstream.writeBytes(1, SIGNAL_DEFAULT_BYTE_STRING);
	//   58  103:aload_0         
	//   59  104:iconst_1        
	//   60  105:getstatic       #21  <Field ByteString SIGNAL_DEFAULT_BYTE_STRING>
	//   61  108:invokevirtual   #247 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		codedoutputstream.writeBytes(2, SIGNAL_DEFAULT_BYTE_STRING);
	//   62  111:aload_0         
	//   63  112:iconst_2        
	//   64  113:getstatic       #21  <Field ByteString SIGNAL_DEFAULT_BYTE_STRING>
	//   65  116:invokevirtual   #247 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		codedoutputstream.writeUInt64(3, 0L);
	//   66  119:aload_0         
	//   67  120:iconst_3        
	//   68  121:lconst_0        
	//   69  122:invokevirtual   #251 <Method void CodedOutputStream.writeUInt64(int, long)>
		codedoutputstream.writeTag(4, 2);
	//   70  125:aload_0         
	//   71  126:iconst_4        
	//   72  127:iconst_2        
	//   73  128:invokevirtual   #258 <Method void CodedOutputStream.writeTag(int, int)>
		codedoutputstream.writeRawVarint32(getBinaryImageSize(bytestring, bytestring1));
	//   74  131:aload_0         
	//   75  132:aload           7
	//   76  134:aload           8
	//   77  136:invokestatic    #110 <Method int getBinaryImageSize(ByteString, ByteString)>
	//   78  139:invokevirtual   #262 <Method void CodedOutputStream.writeRawVarint32(int)>
		codedoutputstream.writeUInt64(1, 0L);
	//   79  142:aload_0         
	//   80  143:iconst_1        
	//   81  144:lconst_0        
	//   82  145:invokevirtual   #251 <Method void CodedOutputStream.writeUInt64(int, long)>
		codedoutputstream.writeUInt64(2, 0L);
	//   83  148:aload_0         
	//   84  149:iconst_2        
	//   85  150:lconst_0        
	//   86  151:invokevirtual   #251 <Method void CodedOutputStream.writeUInt64(int, long)>
		codedoutputstream.writeBytes(3, bytestring);
	//   87  154:aload_0         
	//   88  155:iconst_3        
	//   89  156:aload           7
	//   90  158:invokevirtual   #247 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		if(bytestring1 != null)
	//*  91  161:aload           8
	//*  92  163:ifnull          173
			codedoutputstream.writeBytes(4, bytestring1);
	//   93  166:aload_0         
	//   94  167:iconst_4        
	//   95  168:aload           8
	//   96  170:invokevirtual   #247 <Method void CodedOutputStream.writeBytes(int, ByteString)>
	//   97  173:return          
	}

	private static void writeSessionEventAppExecutionException(CodedOutputStream codedoutputstream, TrimmedThrowableData trimmedthrowabledata, int i, int j, int k)
		throws Exception
	{
label0:
		{
			codedoutputstream.writeTag(k, 2);
	//    0    0:aload_0         
	//    1    1:iload           4
	//    2    3:iconst_2        
	//    3    4:invokevirtual   #258 <Method void CodedOutputStream.writeTag(int, int)>
			codedoutputstream.writeRawVarint32(getEventAppExecutionExceptionSize(trimmedthrowabledata, 1, j));
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:iconst_1        
	//    7   10:iload_3         
	//    8   11:invokestatic    #88  <Method int getEventAppExecutionExceptionSize(TrimmedThrowableData, int, int)>
	//    9   14:invokevirtual   #262 <Method void CodedOutputStream.writeRawVarint32(int)>
			codedoutputstream.writeBytes(1, ByteString.copyFromUtf8(trimmedthrowabledata.className));
	//   10   17:aload_0         
	//   11   18:iconst_1        
	//   12   19:aload_1         
	//   13   20:getfield        #64  <Field String TrimmedThrowableData.className>
	//   14   23:invokestatic    #19  <Method ByteString ByteString.copyFromUtf8(String)>
	//   15   26:invokevirtual   #247 <Method void CodedOutputStream.writeBytes(int, ByteString)>
			String s = trimmedthrowabledata.localizedMessage;
	//   16   29:aload_1         
	//   17   30:getfield        #67  <Field String TrimmedThrowableData.localizedMessage>
	//   18   33:astore          6
			if(s != null)
	//*  19   35:aload           6
	//*  20   37:ifnull          50
				codedoutputstream.writeBytes(3, ByteString.copyFromUtf8(s));
	//   21   40:aload_0         
	//   22   41:iconst_3        
	//   23   42:aload           6
	//   24   44:invokestatic    #19  <Method ByteString ByteString.copyFromUtf8(String)>
	//   25   47:invokevirtual   #247 <Method void CodedOutputStream.writeBytes(int, ByteString)>
			StackTraceElement astacktraceelement[] = trimmedthrowabledata.stacktrace;
	//   26   50:aload_1         
	//   27   51:getfield        #71  <Field StackTraceElement[] TrimmedThrowableData.stacktrace>
	//   28   54:astore          6
			int l = astacktraceelement.length;
	//   29   56:aload           6
	//   30   58:arraylength     
	//   31   59:istore          5
			for(k = 0; k < l; k++)
	//*  32   61:iconst_0        
	//*  33   62:istore          4
	//*  34   64:iload           4
	//*  35   66:iload           5
	//*  36   68:icmpge          91
				writeFrame(codedoutputstream, 4, astacktraceelement[k], true);
	//   37   71:aload_0         
	//   38   72:iconst_4        
	//   39   73:aload           6
	//   40   75:iload           4
	//   41   77:aaload          
	//   42   78:iconst_1        
	//   43   79:invokestatic    #355 <Method void writeFrame(CodedOutputStream, int, StackTraceElement, boolean)>

	//   44   82:iload           4
	//   45   84:iconst_1        
	//   46   85:iadd            
	//   47   86:istore          4
	//*  48   88:goto            64
			trimmedthrowabledata = trimmedthrowabledata.cause;
	//   49   91:aload_1         
	//   50   92:getfield        #86  <Field TrimmedThrowableData TrimmedThrowableData.cause>
	//   51   95:astore_1        
			if(trimmedthrowabledata != null)
	//*  52   96:aload_1         
	//*  53   97:ifnull          116
			{
				if(i >= j)
					break label0;
	//   54  100:iload_2         
	//   55  101:iload_3         
	//   56  102:icmpge          117
				writeSessionEventAppExecutionException(codedoutputstream, trimmedthrowabledata, i + 1, j, 6);
	//   57  105:aload_0         
	//   58  106:aload_1         
	//   59  107:iload_2         
	//   60  108:iconst_1        
	//   61  109:iadd            
	//   62  110:iload_3         
	//   63  111:bipush          6
	//   64  113:invokestatic    #352 <Method void writeSessionEventAppExecutionException(CodedOutputStream, TrimmedThrowableData, int, int, int)>
			}
			return;
	//   65  116:return          
		}
		for(i = 0; trimmedthrowabledata != null; i++)
	//*  66  117:iconst_0        
	//*  67  118:istore_2        
	//*  68  119:aload_1         
	//*  69  120:ifnull          135
			trimmedthrowabledata = trimmedthrowabledata.cause;
	//   70  123:aload_1         
	//   71  124:getfield        #86  <Field TrimmedThrowableData TrimmedThrowableData.cause>
	//   72  127:astore_1        

	//   73  128:iload_2         
	//   74  129:iconst_1        
	//   75  130:iadd            
	//   76  131:istore_2        
	//*  77  132:goto            119
		codedoutputstream.writeUInt32(7, i);
	//   78  135:aload_0         
	//   79  136:bipush          7
	//   80  138:iload_2         
	//   81  139:invokevirtual   #265 <Method void CodedOutputStream.writeUInt32(int, int)>
	//   82  142:return          
	}

	private static void writeSessionEventDevice(CodedOutputStream codedoutputstream, Float float1, int i, boolean flag, int j, long l, long l1)
		throws Exception
	{
		codedoutputstream.writeTag(5, 2);
	//    0    0:aload_0         
	//    1    1:iconst_5        
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #258 <Method void CodedOutputStream.writeTag(int, int)>
		codedoutputstream.writeRawVarint32(getEventDeviceSize(float1, i, flag, j, l, l1));
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:iload_2         
	//    7    9:iload_3         
	//    8   10:iload           4
	//    9   12:lload           5
	//   10   14:lload           7
	//   11   16:invokestatic    #228 <Method int getEventDeviceSize(Float, int, boolean, int, long, long)>
	//   12   19:invokevirtual   #262 <Method void CodedOutputStream.writeRawVarint32(int)>
		if(float1 != null)
	//*  13   22:aload_1         
	//*  14   23:ifnull          35
			codedoutputstream.writeFloat(1, float1.floatValue());
	//   15   26:aload_0         
	//   16   27:iconst_1        
	//   17   28:aload_1         
	//   18   29:invokevirtual   #168 <Method float Float.floatValue()>
	//   19   32:invokevirtual   #359 <Method void CodedOutputStream.writeFloat(int, float)>
		codedoutputstream.writeSInt32(2, i);
	//   20   35:aload_0         
	//   21   36:iconst_2        
	//   22   37:iload_2         
	//   23   38:invokevirtual   #362 <Method void CodedOutputStream.writeSInt32(int, int)>
		codedoutputstream.writeBool(3, flag);
	//   24   41:aload_0         
	//   25   42:iconst_3        
	//   26   43:iload_3         
	//   27   44:invokevirtual   #282 <Method void CodedOutputStream.writeBool(int, boolean)>
		codedoutputstream.writeUInt32(4, j);
	//   28   47:aload_0         
	//   29   48:iconst_4        
	//   30   49:iload           4
	//   31   51:invokevirtual   #265 <Method void CodedOutputStream.writeUInt32(int, int)>
		codedoutputstream.writeUInt64(5, l);
	//   32   54:aload_0         
	//   33   55:iconst_5        
	//   34   56:lload           5
	//   35   58:invokevirtual   #251 <Method void CodedOutputStream.writeUInt64(int, long)>
		codedoutputstream.writeUInt64(6, l1);
	//   36   61:aload_0         
	//   37   62:bipush          6
	//   38   64:lload           7
	//   39   66:invokevirtual   #251 <Method void CodedOutputStream.writeUInt64(int, long)>
	//   40   69:return          
	}

	private static void writeSessionEventLog(CodedOutputStream codedoutputstream, ByteString bytestring)
		throws Exception
	{
		if(bytestring != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          25
		{
			codedoutputstream.writeTag(6, 2);
	//    2    4:aload_0         
	//    3    5:bipush          6
	//    4    7:iconst_2        
	//    5    8:invokevirtual   #258 <Method void CodedOutputStream.writeTag(int, int)>
			codedoutputstream.writeRawVarint32(getEventLogSize(bytestring));
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:invokestatic    #230 <Method int getEventLogSize(ByteString)>
	//    9   16:invokevirtual   #262 <Method void CodedOutputStream.writeRawVarint32(int)>
			codedoutputstream.writeBytes(1, bytestring);
	//   10   19:aload_0         
	//   11   20:iconst_1        
	//   12   21:aload_1         
	//   13   22:invokevirtual   #247 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		}
	//   14   25:return          
	}

	public static void writeSessionOS(CodedOutputStream codedoutputstream, boolean flag)
		throws Exception
	{
		ByteString bytestring = ByteString.copyFromUtf8(android.os.Build.VERSION.RELEASE);
	//    0    0:getstatic       #369 <Field String android.os.Build$VERSION.RELEASE>
	//    1    3:invokestatic    #19  <Method ByteString ByteString.copyFromUtf8(String)>
	//    2    6:astore_2        
		ByteString bytestring1 = ByteString.copyFromUtf8(android.os.Build.VERSION.CODENAME);
	//    3    7:getstatic       #372 <Field String android.os.Build$VERSION.CODENAME>
	//    4   10:invokestatic    #19  <Method ByteString ByteString.copyFromUtf8(String)>
	//    5   13:astore_3        
		codedoutputstream.writeTag(8, 2);
	//    6   14:aload_0         
	//    7   15:bipush          8
	//    8   17:iconst_2        
	//    9   18:invokevirtual   #258 <Method void CodedOutputStream.writeTag(int, int)>
		codedoutputstream.writeRawVarint32(getSessionOSSize(bytestring, bytestring1, flag));
	//   10   21:aload_0         
	//   11   22:aload_2         
	//   12   23:aload_3         
	//   13   24:iload_1         
	//   14   25:invokestatic    #374 <Method int getSessionOSSize(ByteString, ByteString, boolean)>
	//   15   28:invokevirtual   #262 <Method void CodedOutputStream.writeRawVarint32(int)>
		codedoutputstream.writeEnum(1, 3);
	//   16   31:aload_0         
	//   17   32:iconst_1        
	//   18   33:iconst_3        
	//   19   34:invokevirtual   #272 <Method void CodedOutputStream.writeEnum(int, int)>
		codedoutputstream.writeBytes(2, bytestring);
	//   20   37:aload_0         
	//   21   38:iconst_2        
	//   22   39:aload_2         
	//   23   40:invokevirtual   #247 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		codedoutputstream.writeBytes(3, bytestring1);
	//   24   43:aload_0         
	//   25   44:iconst_3        
	//   26   45:aload_3         
	//   27   46:invokevirtual   #247 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		codedoutputstream.writeBool(4, flag);
	//   28   49:aload_0         
	//   29   50:iconst_4        
	//   30   51:iload_1         
	//   31   52:invokevirtual   #282 <Method void CodedOutputStream.writeBool(int, boolean)>
	//   32   55:return          
	}

	public static void writeSessionUser(CodedOutputStream codedoutputstream, String s, String s1, String s2)
		throws Exception
	{
		Object obj = ((Object) (s));
	//    0    0:aload_1         
	//    1    1:astore          6
		if(s == null)
	//*   2    3:aload_1         
	//*   3    4:ifnonnull       11
			obj = "";
	//    4    7:ldc1            #57  <String "">
	//    5    9:astore          6
		s = ((String) (ByteString.copyFromUtf8(((String) (obj)))));
	//    6   11:aload           6
	//    7   13:invokestatic    #19  <Method ByteString ByteString.copyFromUtf8(String)>
	//    8   16:astore_1        
		obj = ((Object) (stringToByteString(s1)));
	//    9   17:aload_2         
	//   10   18:invokestatic    #276 <Method ByteString stringToByteString(String)>
	//   11   21:astore          6
		ByteString bytestring = stringToByteString(s2);
	//   12   23:aload_3         
	//   13   24:invokestatic    #276 <Method ByteString stringToByteString(String)>
	//   14   27:astore          7
		int j = 0 + CodedOutputStream.computeBytesSize(1, ((ByteString) (s)));
	//   15   29:iconst_0        
	//   16   30:iconst_1        
	//   17   31:aload_1         
	//   18   32:invokestatic    #41  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//   19   35:iadd            
	//   20   36:istore          5
		int i = j;
	//   21   38:iload           5
	//   22   40:istore          4
		if(s1 != null)
	//*  23   42:aload_2         
	//*  24   43:ifnull          57
			i = j + CodedOutputStream.computeBytesSize(2, ((ByteString) (obj)));
	//   25   46:iload           5
	//   26   48:iconst_2        
	//   27   49:aload           6
	//   28   51:invokestatic    #41  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//   29   54:iadd            
	//   30   55:istore          4
		j = i;
	//   31   57:iload           4
	//   32   59:istore          5
		if(s2 != null)
	//*  33   61:aload_3         
	//*  34   62:ifnull          76
			j = i + CodedOutputStream.computeBytesSize(3, bytestring);
	//   35   65:iload           4
	//   36   67:iconst_3        
	//   37   68:aload           7
	//   38   70:invokestatic    #41  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//   39   73:iadd            
	//   40   74:istore          5
		codedoutputstream.writeTag(6, 2);
	//   41   76:aload_0         
	//   42   77:bipush          6
	//   43   79:iconst_2        
	//   44   80:invokevirtual   #258 <Method void CodedOutputStream.writeTag(int, int)>
		codedoutputstream.writeRawVarint32(j);
	//   45   83:aload_0         
	//   46   84:iload           5
	//   47   86:invokevirtual   #262 <Method void CodedOutputStream.writeRawVarint32(int)>
		codedoutputstream.writeBytes(1, ((ByteString) (s)));
	//   48   89:aload_0         
	//   49   90:iconst_1        
	//   50   91:aload_1         
	//   51   92:invokevirtual   #247 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		if(s1 != null)
	//*  52   95:aload_2         
	//*  53   96:ifnull          106
			codedoutputstream.writeBytes(2, ((ByteString) (obj)));
	//   54   99:aload_0         
	//   55  100:iconst_2        
	//   56  101:aload           6
	//   57  103:invokevirtual   #247 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		if(s2 != null)
	//*  58  106:aload_3         
	//*  59  107:ifnull          117
			codedoutputstream.writeBytes(3, bytestring);
	//   60  110:aload_0         
	//   61  111:iconst_3        
	//   62  112:aload           7
	//   63  114:invokevirtual   #247 <Method void CodedOutputStream.writeBytes(int, ByteString)>
	//   64  117:return          
	}

	private static void writeThread(CodedOutputStream codedoutputstream, Thread thread, StackTraceElement astacktraceelement[], int i, boolean flag)
		throws Exception
	{
		codedoutputstream.writeTag(1, 2);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #258 <Method void CodedOutputStream.writeTag(int, int)>
		codedoutputstream.writeRawVarint32(getThreadSize(thread, astacktraceelement, i, flag));
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:iload_3         
	//    8   10:iload           4
	//    9   12:invokestatic    #99  <Method int getThreadSize(Thread, StackTraceElement[], int, boolean)>
	//   10   15:invokevirtual   #262 <Method void CodedOutputStream.writeRawVarint32(int)>
		codedoutputstream.writeBytes(1, ByteString.copyFromUtf8(thread.getName()));
	//   11   18:aload_0         
	//   12   19:iconst_1        
	//   13   20:aload_1         
	//   14   21:invokevirtual   #238 <Method String Thread.getName()>
	//   15   24:invokestatic    #19  <Method ByteString ByteString.copyFromUtf8(String)>
	//   16   27:invokevirtual   #247 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		codedoutputstream.writeUInt32(2, i);
	//   17   30:aload_0         
	//   18   31:iconst_2        
	//   19   32:iload_3         
	//   20   33:invokevirtual   #265 <Method void CodedOutputStream.writeUInt32(int, int)>
		int j = astacktraceelement.length;
	//   21   36:aload_2         
	//   22   37:arraylength     
	//   23   38:istore          5
		for(i = 0; i < j; i++)
	//*  24   40:iconst_0        
	//*  25   41:istore_3        
	//*  26   42:iload_3         
	//*  27   43:iload           5
	//*  28   45:icmpge          65
			writeFrame(codedoutputstream, 3, astacktraceelement[i], flag);
	//   29   48:aload_0         
	//   30   49:iconst_3        
	//   31   50:aload_2         
	//   32   51:iload_3         
	//   33   52:aaload          
	//   34   53:iload           4
	//   35   55:invokestatic    #355 <Method void writeFrame(CodedOutputStream, int, StackTraceElement, boolean)>

	//   36   58:iload_3         
	//   37   59:iconst_1        
	//   38   60:iadd            
	//   39   61:istore_3        
	//*  40   62:goto            42
	//   41   65:return          
	}

	private static final String SIGNAL_DEFAULT = "0";
	private static final ByteString SIGNAL_DEFAULT_BYTE_STRING = ByteString.copyFromUtf8("0");
	private static final ByteString UNITY_PLATFORM_BYTE_STRING = ByteString.copyFromUtf8("Unity");

	static 
	{
	//    0    0:ldc1            #8   <String "0">
	//    1    2:invokestatic    #19  <Method ByteString ByteString.copyFromUtf8(String)>
	//    2    5:putstatic       #21  <Field ByteString SIGNAL_DEFAULT_BYTE_STRING>
	//    3    8:ldc1            #23  <String "Unity">
	//    4   10:invokestatic    #19  <Method ByteString ByteString.copyFromUtf8(String)>
	//    5   13:putstatic       #25  <Field ByteString UNITY_PLATFORM_BYTE_STRING>
	//*   6   16:return          
	}
}
