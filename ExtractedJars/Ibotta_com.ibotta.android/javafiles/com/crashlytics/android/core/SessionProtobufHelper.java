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

	private static int getBinaryImageSize(ByteString bytestring, ByteString bytestring1)
	{
		int j = CodedOutputStream.computeUInt64Size(1, 0L) + 0 + CodedOutputStream.computeUInt64Size(2, 0L) + CodedOutputStream.computeBytesSize(3, bytestring);
	//    0    0:iconst_1        
	//    1    1:lconst_0        
	//    2    2:invokestatic    #32  <Method int CodedOutputStream.computeUInt64Size(int, long)>
	//    3    5:iconst_0        
	//    4    6:iadd            
	//    5    7:iconst_2        
	//    6    8:lconst_0        
	//    7    9:invokestatic    #32  <Method int CodedOutputStream.computeUInt64Size(int, long)>
	//    8   12:iadd            
	//    9   13:iconst_3        
	//   10   14:aload_0         
	//   11   15:invokestatic    #36  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
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
	//   21   29:invokestatic    #36  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
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
	//    2    2:getfield        #44  <Field int io.fabric.sdk.android.services.common.IdManager$DeviceIdentifierType.protobufIndex>
	//    3    5:invokestatic    #48  <Method int CodedOutputStream.computeEnumSize(int, int)>
	//    4    8:iconst_2        
	//    5    9:aload_1         
	//    6   10:invokestatic    #17  <Method ByteString ByteString.copyFromUtf8(String)>
	//    7   13:invokestatic    #36  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//    8   16:iadd            
	//    9   17:ireturn         
	}

	private static int getEventAppCustomAttributeSize(String s, String s1)
	{
		int i = CodedOutputStream.computeBytesSize(1, ByteString.copyFromUtf8(s));
	//    0    0:iconst_1        
	//    1    1:aload_0         
	//    2    2:invokestatic    #17  <Method ByteString ByteString.copyFromUtf8(String)>
	//    3    5:invokestatic    #36  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//    4    8:istore_2        
		s = s1;
	//    5    9:aload_1         
	//    6   10:astore_0        
		if(s1 == null)
	//*   7   11:aload_1         
	//*   8   12:ifnonnull       18
			s = "";
	//    9   15:ldc1            #52  <String "">
	//   10   17:astore_0        
		return i + CodedOutputStream.computeBytesSize(2, ByteString.copyFromUtf8(s));
	//   11   18:iload_2         
	//   12   19:iconst_2        
	//   13   20:aload_0         
	//   14   21:invokestatic    #17  <Method ByteString ByteString.copyFromUtf8(String)>
	//   15   24:invokestatic    #36  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//   16   27:iadd            
	//   17   28:ireturn         
	}

	private static int getEventAppExecutionExceptionSize(TrimmedThrowableData trimmedthrowabledata, int i, int j)
	{
		int k = CodedOutputStream.computeBytesSize(1, ByteString.copyFromUtf8(trimmedthrowabledata.className));
	//    0    0:iconst_1        
	//    1    1:aload_0         
	//    2    2:getfield        #60  <Field String TrimmedThrowableData.className>
	//    3    5:invokestatic    #17  <Method ByteString ByteString.copyFromUtf8(String)>
	//    4    8:invokestatic    #36  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//    5   11:istore_3        
		boolean flag = false;
	//    6   12:iconst_0        
	//    7   13:istore          5
		int l = k + 0;
	//    8   15:iload_3         
	//    9   16:iconst_0        
	//   10   17:iadd            
	//   11   18:istore          4
		Object obj = ((Object) (trimmedthrowabledata.localizedMessage));
	//   12   20:aload_0         
	//   13   21:getfield        #63  <Field String TrimmedThrowableData.localizedMessage>
	//   14   24:astore          8
		k = l;
	//   15   26:iload           4
	//   16   28:istore_3        
		if(obj != null)
	//*  17   29:aload           8
	//*  18   31:ifnull          47
			k = l + CodedOutputStream.computeBytesSize(3, ByteString.copyFromUtf8(((String) (obj))));
	//   19   34:iload           4
	//   20   36:iconst_3        
	//   21   37:aload           8
	//   22   39:invokestatic    #17  <Method ByteString ByteString.copyFromUtf8(String)>
	//   23   42:invokestatic    #36  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//   24   45:iadd            
	//   25   46:istore_3        
		StackTraceElement astacktraceelement[] = trimmedthrowabledata.stacktrace;
	//   26   47:aload_0         
	//   27   48:getfield        #67  <Field StackTraceElement[] TrimmedThrowableData.stacktrace>
	//   28   51:astore          8
		int i1 = astacktraceelement.length;
	//   29   53:aload           8
	//   30   55:arraylength     
	//   31   56:istore          6
		for(l = 0; l < i1; l++)
	//*  32   58:iconst_0        
	//*  33   59:istore          4
	//*  34   61:iload           4
	//*  35   63:iload           6
	//*  36   65:icmpge          104
		{
			int j1 = getFrameSize(astacktraceelement[l], true);
	//   37   68:aload           8
	//   38   70:iload           4
	//   39   72:aaload          
	//   40   73:iconst_1        
	//   41   74:invokestatic    #71  <Method int getFrameSize(StackTraceElement, boolean)>
	//   42   77:istore          7
			k += CodedOutputStream.computeTagSize(4) + CodedOutputStream.computeRawVarint32Size(j1) + j1;
	//   43   79:iload_3         
	//   44   80:iconst_4        
	//   45   81:invokestatic    #75  <Method int CodedOutputStream.computeTagSize(int)>
	//   46   84:iload           7
	//   47   86:invokestatic    #78  <Method int CodedOutputStream.computeRawVarint32Size(int)>
	//   48   89:iadd            
	//   49   90:iload           7
	//   50   92:iadd            
	//   51   93:iadd            
	//   52   94:istore_3        
		}

	//   53   95:iload           4
	//   54   97:iconst_1        
	//   55   98:iadd            
	//   56   99:istore          4
	//*  57  101:goto            61
		astacktraceelement = ((StackTraceElement []) (trimmedthrowabledata.cause));
	//   58  104:aload_0         
	//   59  105:getfield        #82  <Field TrimmedThrowableData TrimmedThrowableData.cause>
	//   60  108:astore          8
		l = k;
	//   61  110:iload_3         
	//   62  111:istore          4
		if(astacktraceelement != null)
	//*  63  113:aload           8
	//*  64  115:ifnull          184
		{
			l = ((int) (flag));
	//   65  118:iload           5
	//   66  120:istore          4
			trimmedthrowabledata = ((TrimmedThrowableData) (astacktraceelement));
	//   67  122:aload           8
	//   68  124:astore_0        
			if(i < j)
	//*  69  125:iload_1         
	//*  70  126:iload_2         
	//*  71  127:icmpge          155
			{
				i = getEventAppExecutionExceptionSize(((TrimmedThrowableData) (astacktraceelement)), i + 1, j);
	//   72  130:aload           8
	//   73  132:iload_1         
	//   74  133:iconst_1        
	//   75  134:iadd            
	//   76  135:iload_2         
	//   77  136:invokestatic    #84  <Method int getEventAppExecutionExceptionSize(TrimmedThrowableData, int, int)>
	//   78  139:istore_1        
				return k + (CodedOutputStream.computeTagSize(6) + CodedOutputStream.computeRawVarint32Size(i) + i);
	//   79  140:iload_3         
	//   80  141:bipush          6
	//   81  143:invokestatic    #75  <Method int CodedOutputStream.computeTagSize(int)>
	//   82  146:iload_1         
	//   83  147:invokestatic    #78  <Method int CodedOutputStream.computeRawVarint32Size(int)>
	//   84  150:iadd            
	//   85  151:iload_1         
	//   86  152:iadd            
	//   87  153:iadd            
	//   88  154:ireturn         
			}
			while(trimmedthrowabledata != null) 
	//*  89  155:aload_0         
	//*  90  156:ifnull          173
			{
				trimmedthrowabledata = trimmedthrowabledata.cause;
	//   91  159:aload_0         
	//   92  160:getfield        #82  <Field TrimmedThrowableData TrimmedThrowableData.cause>
	//   93  163:astore_0        
				l++;
	//   94  164:iload           4
	//   95  166:iconst_1        
	//   96  167:iadd            
	//   97  168:istore          4
			}
	//*  98  170:goto            155
			l = k + CodedOutputStream.computeUInt32Size(7, l);
	//   99  173:iload_3         
	//  100  174:bipush          7
	//  101  176:iload           4
	//  102  178:invokestatic    #87  <Method int CodedOutputStream.computeUInt32Size(int, int)>
	//  103  181:iadd            
	//  104  182:istore          4
		}
		return l;
	//  105  184:iload           4
	//  106  186:ireturn         
	}

	private static int getEventAppExecutionSignalSize()
	{
		return CodedOutputStream.computeBytesSize(1, SIGNAL_DEFAULT_BYTE_STRING) + 0 + CodedOutputStream.computeBytesSize(2, SIGNAL_DEFAULT_BYTE_STRING) + CodedOutputStream.computeUInt64Size(3, 0L);
	//    0    0:iconst_1        
	//    1    1:getstatic       #19  <Field ByteString SIGNAL_DEFAULT_BYTE_STRING>
	//    2    4:invokestatic    #36  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//    3    7:iconst_0        
	//    4    8:iadd            
	//    5    9:iconst_2        
	//    6   10:getstatic       #19  <Field ByteString SIGNAL_DEFAULT_BYTE_STRING>
	//    7   13:invokestatic    #36  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//    8   16:iadd            
	//    9   17:iconst_3        
	//   10   18:lconst_0        
	//   11   19:invokestatic    #32  <Method int CodedOutputStream.computeUInt64Size(int, long)>
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
	//    4    4:invokestatic    #95  <Method int getThreadSize(Thread, StackTraceElement[], int, boolean)>
	//    5    7:istore          8
		int k = CodedOutputStream.computeTagSize(1);
	//    6    9:iconst_1        
	//    7   10:invokestatic    #75  <Method int CodedOutputStream.computeTagSize(int)>
	//    8   13:istore          9
		int i1 = CodedOutputStream.computeRawVarint32Size(j);
	//    9   15:iload           8
	//   10   17:invokestatic    #78  <Method int CodedOutputStream.computeRawVarint32Size(int)>
	//   11   20:istore          11
		int l = athread.length;
	//   12   22:aload_3         
	//   13   23:arraylength     
	//   14   24:istore          10
		j = k + i1 + j + 0;
	//   15   26:iload           9
	//   16   28:iload           11
	//   17   30:iadd            
	//   18   31:iload           8
	//   19   33:iadd            
	//   20   34:iconst_0        
	//   21   35:iadd            
	//   22   36:istore          8
		for(k = 0; k < l; k++)
	//*  23   38:iconst_0        
	//*  24   39:istore          9
	//*  25   41:iload           9
	//*  26   43:iload           10
	//*  27   45:icmpge          98
		{
			i1 = getThreadSize(athread[k], (StackTraceElement[])list.get(k), 0, false);
	//   28   48:aload_3         
	//   29   49:iload           9
	//   30   51:aaload          
	//   31   52:aload           4
	//   32   54:iload           9
	//   33   56:invokeinterface #101 <Method Object List.get(int)>
	//   34   61:checkcast       #102 <Class StackTraceElement[]>
	//   35   64:iconst_0        
	//   36   65:iconst_0        
	//   37   66:invokestatic    #95  <Method int getThreadSize(Thread, StackTraceElement[], int, boolean)>
	//   38   69:istore          11
			j += CodedOutputStream.computeTagSize(1) + CodedOutputStream.computeRawVarint32Size(i1) + i1;
	//   39   71:iload           8
	//   40   73:iconst_1        
	//   41   74:invokestatic    #75  <Method int CodedOutputStream.computeTagSize(int)>
	//   42   77:iload           11
	//   43   79:invokestatic    #78  <Method int CodedOutputStream.computeRawVarint32Size(int)>
	//   44   82:iadd            
	//   45   83:iload           11
	//   46   85:iadd            
	//   47   86:iadd            
	//   48   87:istore          8
		}

	//   49   89:iload           9
	//   50   91:iconst_1        
	//   51   92:iadd            
	//   52   93:istore          9
	//*  53   95:goto            41
		i = getEventAppExecutionExceptionSize(trimmedthrowabledata, 1, i);
	//   54   98:aload_0         
	//   55   99:iconst_1        
	//   56  100:iload           5
	//   57  102:invokestatic    #84  <Method int getEventAppExecutionExceptionSize(TrimmedThrowableData, int, int)>
	//   58  105:istore          5
		k = CodedOutputStream.computeTagSize(2);
	//   59  107:iconst_2        
	//   60  108:invokestatic    #75  <Method int CodedOutputStream.computeTagSize(int)>
	//   61  111:istore          9
		l = CodedOutputStream.computeRawVarint32Size(i);
	//   62  113:iload           5
	//   63  115:invokestatic    #78  <Method int CodedOutputStream.computeRawVarint32Size(int)>
	//   64  118:istore          10
		i1 = getEventAppExecutionSignalSize();
	//   65  120:invokestatic    #104 <Method int getEventAppExecutionSignalSize()>
	//   66  123:istore          11
		int j1 = CodedOutputStream.computeTagSize(3);
	//   67  125:iconst_3        
	//   68  126:invokestatic    #75  <Method int CodedOutputStream.computeTagSize(int)>
	//   69  129:istore          12
		int k1 = CodedOutputStream.computeRawVarint32Size(i1);
	//   70  131:iload           11
	//   71  133:invokestatic    #78  <Method int CodedOutputStream.computeRawVarint32Size(int)>
	//   72  136:istore          13
		int l1 = getBinaryImageSize(bytestring, bytestring1);
	//   73  138:aload           6
	//   74  140:aload           7
	//   75  142:invokestatic    #106 <Method int getBinaryImageSize(ByteString, ByteString)>
	//   76  145:istore          14
		return j + (k + l + i) + (j1 + k1 + i1) + (CodedOutputStream.computeTagSize(3) + CodedOutputStream.computeRawVarint32Size(l1) + l1);
	//   77  147:iload           8
	//   78  149:iload           9
	//   79  151:iload           10
	//   80  153:iadd            
	//   81  154:iload           5
	//   82  156:iadd            
	//   83  157:iadd            
	//   84  158:iload           12
	//   85  160:iload           13
	//   86  162:iadd            
	//   87  163:iload           11
	//   88  165:iadd            
	//   89  166:iadd            
	//   90  167:iconst_3        
	//   91  168:invokestatic    #75  <Method int CodedOutputStream.computeTagSize(int)>
	//   92  171:iload           14
	//   93  173:invokestatic    #78  <Method int CodedOutputStream.computeRawVarint32Size(int)>
	//   94  176:iadd            
	//   95  177:iload           14
	//   96  179:iadd            
	//   97  180:iadd            
	//   98  181:ireturn         
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
	//    8   12:invokestatic    #112 <Method int getEventAppExecutionSize(TrimmedThrowableData, Thread, StackTraceElement[], Thread[], List, int, ByteString, ByteString)>
	//    9   15:istore          5
		int k = CodedOutputStream.computeTagSize(1);
	//   10   17:iconst_1        
	//   11   18:invokestatic    #75  <Method int CodedOutputStream.computeTagSize(int)>
	//   12   21:istore          11
		int l = CodedOutputStream.computeRawVarint32Size(i);
	//   13   23:iload           5
	//   14   25:invokestatic    #78  <Method int CodedOutputStream.computeRawVarint32Size(int)>
	//   15   28:istore          12
		boolean flag = false;
	//   16   30:iconst_0        
	//   17   31:istore          13
		k = k + l + i + 0;
	//   18   33:iload           11
	//   19   35:iload           12
	//   20   37:iadd            
	//   21   38:iload           5
	//   22   40:iadd            
	//   23   41:iconst_0        
	//   24   42:iadd            
	//   25   43:istore          11
		i = k;
	//   26   45:iload           11
	//   27   47:istore          5
		if(map != null)
	//*  28   49:aload           8
	//*  29   51:ifnull          134
		{
			trimmedthrowabledata = ((TrimmedThrowableData) (map.entrySet().iterator()));
	//   30   54:aload           8
	//   31   56:invokeinterface #118 <Method Set Map.entrySet()>
	//   32   61:invokeinterface #124 <Method Iterator Set.iterator()>
	//   33   66:astore_0        
			do
			{
				i = k;
	//   34   67:iload           11
	//   35   69:istore          5
				if(!((Iterator) (trimmedthrowabledata)).hasNext())
					break;
	//   36   71:aload_0         
	//   37   72:invokeinterface #130 <Method boolean Iterator.hasNext()>
	//   38   77:ifeq            134
				thread = ((Thread) ((java.util.Map.Entry)((Iterator) (trimmedthrowabledata)).next()));
	//   39   80:aload_0         
	//   40   81:invokeinterface #134 <Method Object Iterator.next()>
	//   41   86:checkcast       #136 <Class java.util.Map$Entry>
	//   42   89:astore_1        
				i = getEventAppCustomAttributeSize((String)((java.util.Map.Entry) (thread)).getKey(), (String)((java.util.Map.Entry) (thread)).getValue());
	//   43   90:aload_1         
	//   44   91:invokeinterface #139 <Method Object java.util.Map$Entry.getKey()>
	//   45   96:checkcast       #141 <Class String>
	//   46   99:aload_1         
	//   47  100:invokeinterface #144 <Method Object java.util.Map$Entry.getValue()>
	//   48  105:checkcast       #141 <Class String>
	//   49  108:invokestatic    #146 <Method int getEventAppCustomAttributeSize(String, String)>
	//   50  111:istore          5
				k += CodedOutputStream.computeTagSize(2) + CodedOutputStream.computeRawVarint32Size(i) + i;
	//   51  113:iload           11
	//   52  115:iconst_2        
	//   53  116:invokestatic    #75  <Method int CodedOutputStream.computeTagSize(int)>
	//   54  119:iload           5
	//   55  121:invokestatic    #78  <Method int CodedOutputStream.computeRawVarint32Size(int)>
	//   56  124:iadd            
	//   57  125:iload           5
	//   58  127:iadd            
	//   59  128:iadd            
	//   60  129:istore          11
			} while(true);
	//   61  131:goto            67
		}
		k = i;
	//   62  134:iload           5
	//   63  136:istore          11
		if(runningappprocessinfo != null)
	//*  64  138:aload           9
	//*  65  140:ifnull          167
		{
			if(runningappprocessinfo.importance != 100)
	//*  66  143:aload           9
	//*  67  145:getfield        #151 <Field int android.app.ActivityManager$RunningAppProcessInfo.importance>
	//*  68  148:bipush          100
	//*  69  150:icmpeq          156
				flag = true;
	//   70  153:iconst_1        
	//   71  154:istore          13
			k = i + CodedOutputStream.computeBoolSize(3, flag);
	//   72  156:iload           5
	//   73  158:iconst_3        
	//   74  159:iload           13
	//   75  161:invokestatic    #155 <Method int CodedOutputStream.computeBoolSize(int, boolean)>
	//   76  164:iadd            
	//   77  165:istore          11
		}
		return k + CodedOutputStream.computeUInt32Size(4, j);
	//   78  167:iload           11
	//   79  169:iconst_4        
	//   80  170:iload           10
	//   81  172:invokestatic    #87  <Method int CodedOutputStream.computeUInt32Size(int, int)>
	//   82  175:iadd            
	//   83  176:ireturn         
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
	//    7   10:invokevirtual   #164 <Method float Float.floatValue()>
	//    8   13:invokestatic    #168 <Method int CodedOutputStream.computeFloatSize(int, float)>
	//    9   16:iadd            
	//   10   17:istore          8
		return k + CodedOutputStream.computeSInt32Size(2, i) + CodedOutputStream.computeBoolSize(3, flag) + CodedOutputStream.computeUInt32Size(4, j) + CodedOutputStream.computeUInt64Size(5, l) + CodedOutputStream.computeUInt64Size(6, l1);
	//   11   19:iload           8
	//   12   21:iconst_2        
	//   13   22:iload_1         
	//   14   23:invokestatic    #171 <Method int CodedOutputStream.computeSInt32Size(int, int)>
	//   15   26:iadd            
	//   16   27:iconst_3        
	//   17   28:iload_2         
	//   18   29:invokestatic    #155 <Method int CodedOutputStream.computeBoolSize(int, boolean)>
	//   19   32:iadd            
	//   20   33:iconst_4        
	//   21   34:iload_3         
	//   22   35:invokestatic    #87  <Method int CodedOutputStream.computeUInt32Size(int, int)>
	//   23   38:iadd            
	//   24   39:iconst_5        
	//   25   40:lload           4
	//   26   42:invokestatic    #32  <Method int CodedOutputStream.computeUInt64Size(int, long)>
	//   27   45:iadd            
	//   28   46:bipush          6
	//   29   48:lload           6
	//   30   50:invokestatic    #32  <Method int CodedOutputStream.computeUInt64Size(int, long)>
	//   31   53:iadd            
	//   32   54:ireturn         
	}

	private static int getEventLogSize(ByteString bytestring)
	{
		return CodedOutputStream.computeBytesSize(1, bytestring);
	//    0    0:iconst_1        
	//    1    1:aload_0         
	//    2    2:invokestatic    #36  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//    3    5:ireturn         
	}

	private static int getFrameSize(StackTraceElement stacktraceelement, boolean flag)
	{
		boolean flag2 = stacktraceelement.isNativeMethod();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #178 <Method boolean StackTraceElement.isNativeMethod()>
	//    2    4:istore          5
		boolean flag1 = false;
	//    3    6:iconst_0        
	//    4    7:istore          4
		int i;
		if(flag2)
	//*   5    9:iload           5
	//*   6   11:ifeq            33
			i = CodedOutputStream.computeUInt64Size(1, Math.max(stacktraceelement.getLineNumber(), 0)) + 0;
	//    7   14:iconst_1        
	//    8   15:aload_0         
	//    9   16:invokevirtual   #181 <Method int StackTraceElement.getLineNumber()>
	//   10   19:iconst_0        
	//   11   20:invokestatic    #186 <Method int Math.max(int, int)>
	//   12   23:i2l             
	//   13   24:invokestatic    #32  <Method int CodedOutputStream.computeUInt64Size(int, long)>
	//   14   27:iconst_0        
	//   15   28:iadd            
	//   16   29:istore_2        
		else
	//*  17   30:goto            41
			i = CodedOutputStream.computeUInt64Size(1, 0L) + 0;
	//   18   33:iconst_1        
	//   19   34:lconst_0        
	//   20   35:invokestatic    #32  <Method int CodedOutputStream.computeUInt64Size(int, long)>
	//   21   38:iconst_0        
	//   22   39:iadd            
	//   23   40:istore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   24   41:new             #188 <Class StringBuilder>
	//   25   44:dup             
	//   26   45:invokespecial   #191 <Method void StringBuilder()>
	//   27   48:astore          6
		stringbuilder.append(stacktraceelement.getClassName());
	//   28   50:aload           6
	//   29   52:aload_0         
	//   30   53:invokevirtual   #195 <Method String StackTraceElement.getClassName()>
	//   31   56:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
	//   32   59:pop             
		stringbuilder.append(".");
	//   33   60:aload           6
	//   34   62:ldc1            #201 <String ".">
	//   35   64:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
	//   36   67:pop             
		stringbuilder.append(stacktraceelement.getMethodName());
	//   37   68:aload           6
	//   38   70:aload_0         
	//   39   71:invokevirtual   #204 <Method String StackTraceElement.getMethodName()>
	//   40   74:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
	//   41   77:pop             
		int j = i + CodedOutputStream.computeBytesSize(2, ByteString.copyFromUtf8(stringbuilder.toString()));
	//   42   78:iload_2         
	//   43   79:iconst_2        
	//   44   80:aload           6
	//   45   82:invokevirtual   #207 <Method String StringBuilder.toString()>
	//   46   85:invokestatic    #17  <Method ByteString ByteString.copyFromUtf8(String)>
	//   47   88:invokestatic    #36  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//   48   91:iadd            
	//   49   92:istore_3        
		i = j;
	//   50   93:iload_3         
	//   51   94:istore_2        
		if(stacktraceelement.getFileName() != null)
	//*  52   95:aload_0         
	//*  53   96:invokevirtual   #210 <Method String StackTraceElement.getFileName()>
	//*  54   99:ifnull          116
			i = j + CodedOutputStream.computeBytesSize(3, ByteString.copyFromUtf8(stacktraceelement.getFileName()));
	//   55  102:iload_3         
	//   56  103:iconst_3        
	//   57  104:aload_0         
	//   58  105:invokevirtual   #210 <Method String StackTraceElement.getFileName()>
	//   59  108:invokestatic    #17  <Method ByteString ByteString.copyFromUtf8(String)>
	//   60  111:invokestatic    #36  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//   61  114:iadd            
	//   62  115:istore_2        
		j = i;
	//   63  116:iload_2         
	//   64  117:istore_3        
		if(!stacktraceelement.isNativeMethod())
	//*  65  118:aload_0         
	//*  66  119:invokevirtual   #178 <Method boolean StackTraceElement.isNativeMethod()>
	//*  67  122:ifne            146
		{
			j = i;
	//   68  125:iload_2         
	//   69  126:istore_3        
			if(stacktraceelement.getLineNumber() > 0)
	//*  70  127:aload_0         
	//*  71  128:invokevirtual   #181 <Method int StackTraceElement.getLineNumber()>
	//*  72  131:ifle            146
				j = i + CodedOutputStream.computeUInt64Size(4, stacktraceelement.getLineNumber());
	//   73  134:iload_2         
	//   74  135:iconst_4        
	//   75  136:aload_0         
	//   76  137:invokevirtual   #181 <Method int StackTraceElement.getLineNumber()>
	//   77  140:i2l             
	//   78  141:invokestatic    #32  <Method int CodedOutputStream.computeUInt64Size(int, long)>
	//   79  144:iadd            
	//   80  145:istore_3        
		}
		i = ((int) (flag1));
	//   81  146:iload           4
	//   82  148:istore_2        
		if(flag)
	//*  83  149:iload_1         
	//*  84  150:ifeq            155
			i = 2;
	//   85  153:iconst_2        
	//   86  154:istore_2        
		return j + CodedOutputStream.computeUInt32Size(5, i);
	//   87  155:iload_3         
	//   88  156:iconst_5        
	//   89  157:iload_2         
	//   90  158:invokestatic    #87  <Method int CodedOutputStream.computeUInt32Size(int, int)>
	//   91  161:iadd            
	//   92  162:ireturn         
	}

	private static int getSessionAppOrgSize(ByteString bytestring)
	{
		return CodedOutputStream.computeBytesSize(1, bytestring) + 0;
	//    0    0:iconst_1        
	//    1    1:aload_0         
	//    2    2:invokestatic    #36  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//    3    5:iconst_0        
	//    4    6:iadd            
	//    5    7:ireturn         
	}

	private static int getSessionAppSize(ByteString bytestring, ByteString bytestring1, ByteString bytestring2, ByteString bytestring3, ByteString bytestring4, int i, ByteString bytestring5)
	{
		int j = CodedOutputStream.computeBytesSize(1, bytestring);
	//    0    0:iconst_1        
	//    1    1:aload_0         
	//    2    2:invokestatic    #36  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//    3    5:istore          7
		int k = CodedOutputStream.computeBytesSize(2, bytestring2);
	//    4    7:iconst_2        
	//    5    8:aload_2         
	//    6    9:invokestatic    #36  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//    7   12:istore          8
		int l = CodedOutputStream.computeBytesSize(3, bytestring3);
	//    8   14:iconst_3        
	//    9   15:aload_3         
	//   10   16:invokestatic    #36  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//   11   19:istore          9
		int i1 = getSessionAppOrgSize(bytestring1);
	//   12   21:aload_1         
	//   13   22:invokestatic    #215 <Method int getSessionAppOrgSize(ByteString)>
	//   14   25:istore          10
		k = j + 0 + k + l + (CodedOutputStream.computeTagSize(5) + CodedOutputStream.computeRawVarint32Size(i1) + i1) + CodedOutputStream.computeBytesSize(6, bytestring4);
	//   15   27:iload           7
	//   16   29:iconst_0        
	//   17   30:iadd            
	//   18   31:iload           8
	//   19   33:iadd            
	//   20   34:iload           9
	//   21   36:iadd            
	//   22   37:iconst_5        
	//   23   38:invokestatic    #75  <Method int CodedOutputStream.computeTagSize(int)>
	//   24   41:iload           10
	//   25   43:invokestatic    #78  <Method int CodedOutputStream.computeRawVarint32Size(int)>
	//   26   46:iadd            
	//   27   47:iload           10
	//   28   49:iadd            
	//   29   50:iadd            
	//   30   51:bipush          6
	//   31   53:aload           4
	//   32   55:invokestatic    #36  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
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
	//   41   74:getstatic       #23  <Field ByteString UNITY_PLATFORM_BYTE_STRING>
	//   42   77:invokestatic    #36  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//   43   80:iadd            
	//   44   81:bipush          9
	//   45   83:aload           6
	//   46   85:invokestatic    #36  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//   47   88:iadd            
	//   48   89:istore          7
		return j + CodedOutputStream.computeEnumSize(10, i);
	//   49   91:iload           7
	//   50   93:bipush          10
	//   51   95:iload           5
	//   52   97:invokestatic    #48  <Method int CodedOutputStream.computeEnumSize(int, int)>
	//   53  100:iadd            
	//   54  101:ireturn         
	}

	private static int getSessionDeviceSize(int i, ByteString bytestring, ByteString bytestring1, int j, long l, long l1, 
			boolean flag, Map map, int k, ByteString bytestring2, ByteString bytestring3)
	{
		int i1 = CodedOutputStream.computeBytesSize(1, bytestring);
	//    0    0:iconst_1        
	//    1    1:aload_1         
	//    2    2:invokestatic    #36  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//    3    5:istore          14
		boolean flag1 = false;
	//    4    7:iconst_0        
	//    5    8:istore          13
		int j1 = CodedOutputStream.computeEnumSize(3, i);
	//    6   10:iconst_3        
	//    7   11:iload_0         
	//    8   12:invokestatic    #48  <Method int CodedOutputStream.computeEnumSize(int, int)>
	//    9   15:istore          15
		if(bytestring1 == null)
	//*  10   17:aload_2         
	//*  11   18:ifnonnull       26
			i = 0;
	//   12   21:iconst_0        
	//   13   22:istore_0        
		else
	//*  14   23:goto            32
			i = CodedOutputStream.computeBytesSize(4, bytestring1);
	//   15   26:iconst_4        
	//   16   27:aload_2         
	//   17   28:invokestatic    #36  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//   18   31:istore_0        
		i = i1 + 0 + j1 + i + CodedOutputStream.computeUInt32Size(5, j) + CodedOutputStream.computeUInt64Size(6, l) + CodedOutputStream.computeUInt64Size(7, l1) + CodedOutputStream.computeBoolSize(10, flag);
	//   19   32:iload           14
	//   20   34:iconst_0        
	//   21   35:iadd            
	//   22   36:iload           15
	//   23   38:iadd            
	//   24   39:iload_0         
	//   25   40:iadd            
	//   26   41:iconst_5        
	//   27   42:iload_3         
	//   28   43:invokestatic    #87  <Method int CodedOutputStream.computeUInt32Size(int, int)>
	//   29   46:iadd            
	//   30   47:bipush          6
	//   31   49:lload           4
	//   32   51:invokestatic    #32  <Method int CodedOutputStream.computeUInt64Size(int, long)>
	//   33   54:iadd            
	//   34   55:bipush          7
	//   35   57:lload           6
	//   36   59:invokestatic    #32  <Method int CodedOutputStream.computeUInt64Size(int, long)>
	//   37   62:iadd            
	//   38   63:bipush          10
	//   39   65:iload           8
	//   40   67:invokestatic    #155 <Method int CodedOutputStream.computeBoolSize(int, boolean)>
	//   41   70:iadd            
	//   42   71:istore_0        
		j = i;
	//   43   72:iload_0         
	//   44   73:istore_3        
		if(map != null)
	//*  45   74:aload           9
	//*  46   76:ifnull          153
		{
			bytestring = ((ByteString) (map.entrySet().iterator()));
	//   47   79:aload           9
	//   48   81:invokeinterface #118 <Method Set Map.entrySet()>
	//   49   86:invokeinterface #124 <Method Iterator Set.iterator()>
	//   50   91:astore_1        
			do
			{
				j = i;
	//   51   92:iload_0         
	//   52   93:istore_3        
				if(!((Iterator) (bytestring)).hasNext())
					break;
	//   53   94:aload_1         
	//   54   95:invokeinterface #130 <Method boolean Iterator.hasNext()>
	//   55  100:ifeq            153
				bytestring1 = ((ByteString) ((java.util.Map.Entry)((Iterator) (bytestring)).next()));
	//   56  103:aload_1         
	//   57  104:invokeinterface #134 <Method Object Iterator.next()>
	//   58  109:checkcast       #136 <Class java.util.Map$Entry>
	//   59  112:astore_2        
				j = getDeviceIdentifierSize((io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType)((java.util.Map.Entry) (bytestring1)).getKey(), (String)((java.util.Map.Entry) (bytestring1)).getValue());
	//   60  113:aload_2         
	//   61  114:invokeinterface #139 <Method Object java.util.Map$Entry.getKey()>
	//   62  119:checkcast       #40  <Class io.fabric.sdk.android.services.common.IdManager$DeviceIdentifierType>
	//   63  122:aload_2         
	//   64  123:invokeinterface #144 <Method Object java.util.Map$Entry.getValue()>
	//   65  128:checkcast       #141 <Class String>
	//   66  131:invokestatic    #219 <Method int getDeviceIdentifierSize(io.fabric.sdk.android.services.common.IdManager$DeviceIdentifierType, String)>
	//   67  134:istore_3        
				i += CodedOutputStream.computeTagSize(11) + CodedOutputStream.computeRawVarint32Size(j) + j;
	//   68  135:iload_0         
	//   69  136:bipush          11
	//   70  138:invokestatic    #75  <Method int CodedOutputStream.computeTagSize(int)>
	//   71  141:iload_3         
	//   72  142:invokestatic    #78  <Method int CodedOutputStream.computeRawVarint32Size(int)>
	//   73  145:iadd            
	//   74  146:iload_3         
	//   75  147:iadd            
	//   76  148:iadd            
	//   77  149:istore_0        
			} while(true);
	//   78  150:goto            92
		}
		i1 = CodedOutputStream.computeUInt32Size(12, k);
	//   79  153:bipush          12
	//   80  155:iload           10
	//   81  157:invokestatic    #87  <Method int CodedOutputStream.computeUInt32Size(int, int)>
	//   82  160:istore          14
		if(bytestring2 == null)
	//*  83  162:aload           11
	//*  84  164:ifnonnull       172
			i = 0;
	//   85  167:iconst_0        
	//   86  168:istore_0        
		else
	//*  87  169:goto            180
			i = CodedOutputStream.computeBytesSize(13, bytestring2);
	//   88  172:bipush          13
	//   89  174:aload           11
	//   90  176:invokestatic    #36  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//   91  179:istore_0        
		if(bytestring3 == null)
	//*  92  180:aload           12
	//*  93  182:ifnonnull       192
			k = ((int) (flag1));
	//   94  185:iload           13
	//   95  187:istore          10
		else
	//*  96  189:goto            201
			k = CodedOutputStream.computeBytesSize(14, bytestring3);
	//   97  192:bipush          14
	//   98  194:aload           12
	//   99  196:invokestatic    #36  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//  100  199:istore          10
		return j + i1 + i + k;
	//  101  201:iload_3         
	//  102  202:iload           14
	//  103  204:iadd            
	//  104  205:iload_0         
	//  105  206:iadd            
	//  106  207:iload           10
	//  107  209:iadd            
	//  108  210:ireturn         
	}

	private static int getSessionEventSize(long l, String s, TrimmedThrowableData trimmedthrowabledata, Thread thread, StackTraceElement astacktraceelement[], Thread athread[], List list, 
			int i, Map map, android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo, int j, ByteString bytestring, ByteString bytestring1, Float float1, 
			int k, boolean flag, long l1, long l2, ByteString bytestring2)
	{
		int i1 = CodedOutputStream.computeUInt64Size(1, l);
	//    0    0:iconst_1        
	//    1    1:lload_0         
	//    2    2:invokestatic    #32  <Method int CodedOutputStream.computeUInt64Size(int, long)>
	//    3    5:istore          22
		int j1 = CodedOutputStream.computeBytesSize(2, ByteString.copyFromUtf8(s));
	//    4    7:iconst_2        
	//    5    8:aload_2         
	//    6    9:invokestatic    #17  <Method ByteString ByteString.copyFromUtf8(String)>
	//    7   12:invokestatic    #36  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
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
	//   20   38:invokestatic    #224 <Method int getEventAppSize(TrimmedThrowableData, Thread, StackTraceElement[], Thread[], List, int, ByteString, ByteString, Map, android.app.ActivityManager$RunningAppProcessInfo, int)>
	//   21   41:istore          8
		int k1 = CodedOutputStream.computeTagSize(3);
	//   22   43:iconst_3        
	//   23   44:invokestatic    #75  <Method int CodedOutputStream.computeTagSize(int)>
	//   24   47:istore          24
		int i2 = CodedOutputStream.computeRawVarint32Size(i);
	//   25   49:iload           8
	//   26   51:invokestatic    #78  <Method int CodedOutputStream.computeRawVarint32Size(int)>
	//   27   54:istore          25
		j = getEventDeviceSize(float1, k, flag, j, l1, l2);
	//   28   56:aload           14
	//   29   58:iload           15
	//   30   60:iload           16
	//   31   62:iload           11
	//   32   64:lload           17
	//   33   66:lload           19
	//   34   68:invokestatic    #226 <Method int getEventDeviceSize(Float, int, boolean, int, long, long)>
	//   35   71:istore          11
		j = i1 + 0 + j1 + (k1 + i2 + i) + (CodedOutputStream.computeTagSize(5) + CodedOutputStream.computeRawVarint32Size(j) + j);
	//   36   73:iload           22
	//   37   75:iconst_0        
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
	//   48   90:invokestatic    #75  <Method int CodedOutputStream.computeTagSize(int)>
	//   49   93:iload           11
	//   50   95:invokestatic    #78  <Method int CodedOutputStream.computeRawVarint32Size(int)>
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
	//   61  116:invokestatic    #228 <Method int getEventLogSize(ByteString)>
	//   62  119:istore          8
			i = j + (CodedOutputStream.computeTagSize(6) + CodedOutputStream.computeRawVarint32Size(i) + i);
	//   63  121:iload           11
	//   64  123:bipush          6
	//   65  125:invokestatic    #75  <Method int CodedOutputStream.computeTagSize(int)>
	//   66  128:iload           8
	//   67  130:invokestatic    #78  <Method int CodedOutputStream.computeRawVarint32Size(int)>
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
		return CodedOutputStream.computeEnumSize(1, 3) + 0 + CodedOutputStream.computeBytesSize(2, bytestring) + CodedOutputStream.computeBytesSize(3, bytestring1) + CodedOutputStream.computeBoolSize(4, flag);
	//    0    0:iconst_1        
	//    1    1:iconst_3        
	//    2    2:invokestatic    #48  <Method int CodedOutputStream.computeEnumSize(int, int)>
	//    3    5:iconst_0        
	//    4    6:iadd            
	//    5    7:iconst_2        
	//    6    8:aload_0         
	//    7    9:invokestatic    #36  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//    8   12:iadd            
	//    9   13:iconst_3        
	//   10   14:aload_1         
	//   11   15:invokestatic    #36  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//   12   18:iadd            
	//   13   19:iconst_4        
	//   14   20:iload_2         
	//   15   21:invokestatic    #155 <Method int CodedOutputStream.computeBoolSize(int, boolean)>
	//   16   24:iadd            
	//   17   25:ireturn         
	}

	private static int getThreadSize(Thread thread, StackTraceElement astacktraceelement[], int i, boolean flag)
	{
		int j = CodedOutputStream.computeBytesSize(1, ByteString.copyFromUtf8(thread.getName())) + CodedOutputStream.computeUInt32Size(2, i);
	//    0    0:iconst_1        
	//    1    1:aload_0         
	//    2    2:invokevirtual   #236 <Method String Thread.getName()>
	//    3    5:invokestatic    #17  <Method ByteString ByteString.copyFromUtf8(String)>
	//    4    8:invokestatic    #36  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//    5   11:iconst_2        
	//    6   12:iload_2         
	//    7   13:invokestatic    #87  <Method int CodedOutputStream.computeUInt32Size(int, int)>
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
	//   22   35:invokestatic    #71  <Method int getFrameSize(StackTraceElement, boolean)>
	//   23   38:istore          6
			j += CodedOutputStream.computeTagSize(3) + CodedOutputStream.computeRawVarint32Size(l) + l;
	//   24   40:iload           4
	//   25   42:iconst_3        
	//   26   43:invokestatic    #75  <Method int CodedOutputStream.computeTagSize(int)>
	//   27   46:iload           6
	//   28   48:invokestatic    #78  <Method int CodedOutputStream.computeRawVarint32Size(int)>
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
	//    5    7:invokestatic    #17  <Method ByteString ByteString.copyFromUtf8(String)>
	//    6   10:areturn         
	}

	public static void writeBeginSession(CodedOutputStream codedoutputstream, String s, String s1, long l)
		throws Exception
	{
		codedoutputstream.writeBytes(1, ByteString.copyFromUtf8(s1));
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_2         
	//    3    3:invokestatic    #17  <Method ByteString ByteString.copyFromUtf8(String)>
	//    4    6:invokevirtual   #245 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		codedoutputstream.writeBytes(2, ByteString.copyFromUtf8(s));
	//    5    9:aload_0         
	//    6   10:iconst_2        
	//    7   11:aload_1         
	//    8   12:invokestatic    #17  <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   15:invokevirtual   #245 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		codedoutputstream.writeUInt64(3, l);
	//   10   18:aload_0         
	//   11   19:iconst_3        
	//   12   20:lload_3         
	//   13   21:invokevirtual   #249 <Method void CodedOutputStream.writeUInt64(int, long)>
	//   14   24:return          
	}

	private static void writeFrame(CodedOutputStream codedoutputstream, int i, StackTraceElement stacktraceelement, boolean flag)
		throws Exception
	{
		codedoutputstream.writeTag(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #256 <Method void CodedOutputStream.writeTag(int, int)>
		codedoutputstream.writeRawVarint32(getFrameSize(stacktraceelement, flag));
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:iload_3         
	//    7    9:invokestatic    #71  <Method int getFrameSize(StackTraceElement, boolean)>
	//    8   12:invokevirtual   #260 <Method void CodedOutputStream.writeRawVarint32(int)>
		if(stacktraceelement.isNativeMethod())
	//*   9   15:aload_2         
	//*  10   16:invokevirtual   #178 <Method boolean StackTraceElement.isNativeMethod()>
	//*  11   19:ifeq            39
			codedoutputstream.writeUInt64(1, Math.max(stacktraceelement.getLineNumber(), 0));
	//   12   22:aload_0         
	//   13   23:iconst_1        
	//   14   24:aload_2         
	//   15   25:invokevirtual   #181 <Method int StackTraceElement.getLineNumber()>
	//   16   28:iconst_0        
	//   17   29:invokestatic    #186 <Method int Math.max(int, int)>
	//   18   32:i2l             
	//   19   33:invokevirtual   #249 <Method void CodedOutputStream.writeUInt64(int, long)>
		else
	//*  20   36:goto            45
			codedoutputstream.writeUInt64(1, 0L);
	//   21   39:aload_0         
	//   22   40:iconst_1        
	//   23   41:lconst_0        
	//   24   42:invokevirtual   #249 <Method void CodedOutputStream.writeUInt64(int, long)>
		StringBuilder stringbuilder = new StringBuilder();
	//   25   45:new             #188 <Class StringBuilder>
	//   26   48:dup             
	//   27   49:invokespecial   #191 <Method void StringBuilder()>
	//   28   52:astore          5
		stringbuilder.append(stacktraceelement.getClassName());
	//   29   54:aload           5
	//   30   56:aload_2         
	//   31   57:invokevirtual   #195 <Method String StackTraceElement.getClassName()>
	//   32   60:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
	//   33   63:pop             
		stringbuilder.append(".");
	//   34   64:aload           5
	//   35   66:ldc1            #201 <String ".">
	//   36   68:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
	//   37   71:pop             
		stringbuilder.append(stacktraceelement.getMethodName());
	//   38   72:aload           5
	//   39   74:aload_2         
	//   40   75:invokevirtual   #204 <Method String StackTraceElement.getMethodName()>
	//   41   78:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
	//   42   81:pop             
		codedoutputstream.writeBytes(2, ByteString.copyFromUtf8(stringbuilder.toString()));
	//   43   82:aload_0         
	//   44   83:iconst_2        
	//   45   84:aload           5
	//   46   86:invokevirtual   #207 <Method String StringBuilder.toString()>
	//   47   89:invokestatic    #17  <Method ByteString ByteString.copyFromUtf8(String)>
	//   48   92:invokevirtual   #245 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		if(stacktraceelement.getFileName() != null)
	//*  49   95:aload_2         
	//*  50   96:invokevirtual   #210 <Method String StackTraceElement.getFileName()>
	//*  51   99:ifnull          114
			codedoutputstream.writeBytes(3, ByteString.copyFromUtf8(stacktraceelement.getFileName()));
	//   52  102:aload_0         
	//   53  103:iconst_3        
	//   54  104:aload_2         
	//   55  105:invokevirtual   #210 <Method String StackTraceElement.getFileName()>
	//   56  108:invokestatic    #17  <Method ByteString ByteString.copyFromUtf8(String)>
	//   57  111:invokevirtual   #245 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		boolean flag1 = stacktraceelement.isNativeMethod();
	//   58  114:aload_2         
	//   59  115:invokevirtual   #178 <Method boolean StackTraceElement.isNativeMethod()>
	//   60  118:istore          4
		i = 4;
	//   61  120:iconst_4        
	//   62  121:istore_1        
		if(!flag1 && stacktraceelement.getLineNumber() > 0)
	//*  63  122:iload           4
	//*  64  124:ifne            144
	//*  65  127:aload_2         
	//*  66  128:invokevirtual   #181 <Method int StackTraceElement.getLineNumber()>
	//*  67  131:ifle            144
			codedoutputstream.writeUInt64(4, stacktraceelement.getLineNumber());
	//   68  134:aload_0         
	//   69  135:iconst_4        
	//   70  136:aload_2         
	//   71  137:invokevirtual   #181 <Method int StackTraceElement.getLineNumber()>
	//   72  140:i2l             
	//   73  141:invokevirtual   #249 <Method void CodedOutputStream.writeUInt64(int, long)>
		if(!flag)
	//*  74  144:iload_3         
	//*  75  145:ifeq            151
	//*  76  148:goto            153
			i = 0;
	//   77  151:iconst_0        
	//   78  152:istore_1        
		codedoutputstream.writeUInt32(5, i);
	//   79  153:aload_0         
	//   80  154:iconst_5        
	//   81  155:iload_1         
	//   82  156:invokevirtual   #263 <Method void CodedOutputStream.writeUInt32(int, int)>
	//   83  159:return          
	}

	public static void writeSessionApp(CodedOutputStream codedoutputstream, String s, String s1, String s2, String s3, String s4, int i, String s5)
		throws Exception
	{
		ByteString bytestring = ByteString.copyFromUtf8(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #17  <Method ByteString ByteString.copyFromUtf8(String)>
	//    2    4:astore          8
		s1 = ((String) (ByteString.copyFromUtf8(s1)));
	//    3    6:aload_2         
	//    4    7:invokestatic    #17  <Method ByteString ByteString.copyFromUtf8(String)>
	//    5   10:astore_2        
		s2 = ((String) (ByteString.copyFromUtf8(s2)));
	//    6   11:aload_3         
	//    7   12:invokestatic    #17  <Method ByteString ByteString.copyFromUtf8(String)>
	//    8   15:astore_3        
		s3 = ((String) (ByteString.copyFromUtf8(s3)));
	//    9   16:aload           4
	//   10   18:invokestatic    #17  <Method ByteString ByteString.copyFromUtf8(String)>
	//   11   21:astore          4
		s4 = ((String) (ByteString.copyFromUtf8(s4)));
	//   12   23:aload           5
	//   13   25:invokestatic    #17  <Method ByteString ByteString.copyFromUtf8(String)>
	//   14   28:astore          5
		if(s5 != null)
	//*  15   30:aload           7
	//*  16   32:ifnull          44
			s = ((String) (ByteString.copyFromUtf8(s5)));
	//   17   35:aload           7
	//   18   37:invokestatic    #17  <Method ByteString ByteString.copyFromUtf8(String)>
	//   19   40:astore_1        
		else
	//*  20   41:goto            46
			s = null;
	//   21   44:aconst_null     
	//   22   45:astore_1        
		codedoutputstream.writeTag(7, 2);
	//   23   46:aload_0         
	//   24   47:bipush          7
	//   25   49:iconst_2        
	//   26   50:invokevirtual   #256 <Method void CodedOutputStream.writeTag(int, int)>
		codedoutputstream.writeRawVarint32(getSessionAppSize(bytestring, ((ByteString) (s1)), ((ByteString) (s2)), ((ByteString) (s3)), ((ByteString) (s4)), i, ((ByteString) (s))));
	//   27   53:aload_0         
	//   28   54:aload           8
	//   29   56:aload_2         
	//   30   57:aload_3         
	//   31   58:aload           4
	//   32   60:aload           5
	//   33   62:iload           6
	//   34   64:aload_1         
	//   35   65:invokestatic    #267 <Method int getSessionAppSize(ByteString, ByteString, ByteString, ByteString, ByteString, int, ByteString)>
	//   36   68:invokevirtual   #260 <Method void CodedOutputStream.writeRawVarint32(int)>
		codedoutputstream.writeBytes(1, bytestring);
	//   37   71:aload_0         
	//   38   72:iconst_1        
	//   39   73:aload           8
	//   40   75:invokevirtual   #245 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		codedoutputstream.writeBytes(2, ((ByteString) (s2)));
	//   41   78:aload_0         
	//   42   79:iconst_2        
	//   43   80:aload_3         
	//   44   81:invokevirtual   #245 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		codedoutputstream.writeBytes(3, ((ByteString) (s3)));
	//   45   84:aload_0         
	//   46   85:iconst_3        
	//   47   86:aload           4
	//   48   88:invokevirtual   #245 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		codedoutputstream.writeTag(5, 2);
	//   49   91:aload_0         
	//   50   92:iconst_5        
	//   51   93:iconst_2        
	//   52   94:invokevirtual   #256 <Method void CodedOutputStream.writeTag(int, int)>
		codedoutputstream.writeRawVarint32(getSessionAppOrgSize(((ByteString) (s1))));
	//   53   97:aload_0         
	//   54   98:aload_2         
	//   55   99:invokestatic    #215 <Method int getSessionAppOrgSize(ByteString)>
	//   56  102:invokevirtual   #260 <Method void CodedOutputStream.writeRawVarint32(int)>
		codedoutputstream.writeBytes(1, ((ByteString) (s1)));
	//   57  105:aload_0         
	//   58  106:iconst_1        
	//   59  107:aload_2         
	//   60  108:invokevirtual   #245 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		codedoutputstream.writeBytes(6, ((ByteString) (s4)));
	//   61  111:aload_0         
	//   62  112:bipush          6
	//   63  114:aload           5
	//   64  116:invokevirtual   #245 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		if(s != null)
	//*  65  119:aload_1         
	//*  66  120:ifnull          139
		{
			codedoutputstream.writeBytes(8, UNITY_PLATFORM_BYTE_STRING);
	//   67  123:aload_0         
	//   68  124:bipush          8
	//   69  126:getstatic       #23  <Field ByteString UNITY_PLATFORM_BYTE_STRING>
	//   70  129:invokevirtual   #245 <Method void CodedOutputStream.writeBytes(int, ByteString)>
			codedoutputstream.writeBytes(9, ((ByteString) (s)));
	//   71  132:aload_0         
	//   72  133:bipush          9
	//   73  135:aload_1         
	//   74  136:invokevirtual   #245 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		}
		codedoutputstream.writeEnum(10, i);
	//   75  139:aload_0         
	//   76  140:bipush          10
	//   77  142:iload           6
	//   78  144:invokevirtual   #270 <Method void CodedOutputStream.writeEnum(int, int)>
	//   79  147:return          
	}

	public static void writeSessionDevice(CodedOutputStream codedoutputstream, String s, int i, String s1, int j, long l, long l1, boolean flag, Map map, int k, String s2, String s3)
		throws Exception
	{
		ByteString bytestring = ByteString.copyFromUtf8(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #17  <Method ByteString ByteString.copyFromUtf8(String)>
	//    2    4:astore          14
		s1 = ((String) (stringToByteString(s1)));
	//    3    6:aload_3         
	//    4    7:invokestatic    #274 <Method ByteString stringToByteString(String)>
	//    5   10:astore_3        
		s = ((String) (stringToByteString(s3)));
	//    6   11:aload           13
	//    7   13:invokestatic    #274 <Method ByteString stringToByteString(String)>
	//    8   16:astore_1        
		s2 = ((String) (stringToByteString(s2)));
	//    9   17:aload           12
	//   10   19:invokestatic    #274 <Method ByteString stringToByteString(String)>
	//   11   22:astore          12
		codedoutputstream.writeTag(9, 2);
	//   12   24:aload_0         
	//   13   25:bipush          9
	//   14   27:iconst_2        
	//   15   28:invokevirtual   #256 <Method void CodedOutputStream.writeTag(int, int)>
		codedoutputstream.writeRawVarint32(getSessionDeviceSize(i, bytestring, ((ByteString) (s1)), j, l, l1, flag, map, k, ((ByteString) (s2)), ((ByteString) (s))));
	//   16   31:aload_0         
	//   17   32:iload_2         
	//   18   33:aload           14
	//   19   35:aload_3         
	//   20   36:iload           4
	//   21   38:lload           5
	//   22   40:lload           7
	//   23   42:iload           9
	//   24   44:aload           10
	//   25   46:iload           11
	//   26   48:aload           12
	//   27   50:aload_1         
	//   28   51:invokestatic    #276 <Method int getSessionDeviceSize(int, ByteString, ByteString, int, long, long, boolean, Map, int, ByteString, ByteString)>
	//   29   54:invokevirtual   #260 <Method void CodedOutputStream.writeRawVarint32(int)>
		codedoutputstream.writeBytes(1, bytestring);
	//   30   57:aload_0         
	//   31   58:iconst_1        
	//   32   59:aload           14
	//   33   61:invokevirtual   #245 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		codedoutputstream.writeEnum(3, i);
	//   34   64:aload_0         
	//   35   65:iconst_3        
	//   36   66:iload_2         
	//   37   67:invokevirtual   #270 <Method void CodedOutputStream.writeEnum(int, int)>
		codedoutputstream.writeBytes(4, ((ByteString) (s1)));
	//   38   70:aload_0         
	//   39   71:iconst_4        
	//   40   72:aload_3         
	//   41   73:invokevirtual   #245 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		codedoutputstream.writeUInt32(5, j);
	//   42   76:aload_0         
	//   43   77:iconst_5        
	//   44   78:iload           4
	//   45   80:invokevirtual   #263 <Method void CodedOutputStream.writeUInt32(int, int)>
		codedoutputstream.writeUInt64(6, l);
	//   46   83:aload_0         
	//   47   84:bipush          6
	//   48   86:lload           5
	//   49   88:invokevirtual   #249 <Method void CodedOutputStream.writeUInt64(int, long)>
		codedoutputstream.writeUInt64(7, l1);
	//   50   91:aload_0         
	//   51   92:bipush          7
	//   52   94:lload           7
	//   53   96:invokevirtual   #249 <Method void CodedOutputStream.writeUInt64(int, long)>
		codedoutputstream.writeBool(10, flag);
	//   54   99:aload_0         
	//   55  100:bipush          10
	//   56  102:iload           9
	//   57  104:invokevirtual   #280 <Method void CodedOutputStream.writeBool(int, boolean)>
		for(s1 = ((String) (map.entrySet().iterator())); ((Iterator) (s1)).hasNext(); codedoutputstream.writeBytes(2, ByteString.copyFromUtf8((String)((java.util.Map.Entry) (map)).getValue())))
	//*  58  107:aload           10
	//*  59  109:invokeinterface #118 <Method Set Map.entrySet()>
	//*  60  114:invokeinterface #124 <Method Iterator Set.iterator()>
	//*  61  119:astore_3        
	//*  62  120:aload_3         
	//*  63  121:invokeinterface #130 <Method boolean Iterator.hasNext()>
	//*  64  126:ifeq            213
		{
			map = ((Map) ((java.util.Map.Entry)((Iterator) (s1)).next()));
	//   65  129:aload_3         
	//   66  130:invokeinterface #134 <Method Object Iterator.next()>
	//   67  135:checkcast       #136 <Class java.util.Map$Entry>
	//   68  138:astore          10
			codedoutputstream.writeTag(11, 2);
	//   69  140:aload_0         
	//   70  141:bipush          11
	//   71  143:iconst_2        
	//   72  144:invokevirtual   #256 <Method void CodedOutputStream.writeTag(int, int)>
			codedoutputstream.writeRawVarint32(getDeviceIdentifierSize((io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType)((java.util.Map.Entry) (map)).getKey(), (String)((java.util.Map.Entry) (map)).getValue()));
	//   73  147:aload_0         
	//   74  148:aload           10
	//   75  150:invokeinterface #139 <Method Object java.util.Map$Entry.getKey()>
	//   76  155:checkcast       #40  <Class io.fabric.sdk.android.services.common.IdManager$DeviceIdentifierType>
	//   77  158:aload           10
	//   78  160:invokeinterface #144 <Method Object java.util.Map$Entry.getValue()>
	//   79  165:checkcast       #141 <Class String>
	//   80  168:invokestatic    #219 <Method int getDeviceIdentifierSize(io.fabric.sdk.android.services.common.IdManager$DeviceIdentifierType, String)>
	//   81  171:invokevirtual   #260 <Method void CodedOutputStream.writeRawVarint32(int)>
			codedoutputstream.writeEnum(1, ((io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType)((java.util.Map.Entry) (map)).getKey()).protobufIndex);
	//   82  174:aload_0         
	//   83  175:iconst_1        
	//   84  176:aload           10
	//   85  178:invokeinterface #139 <Method Object java.util.Map$Entry.getKey()>
	//   86  183:checkcast       #40  <Class io.fabric.sdk.android.services.common.IdManager$DeviceIdentifierType>
	//   87  186:getfield        #44  <Field int io.fabric.sdk.android.services.common.IdManager$DeviceIdentifierType.protobufIndex>
	//   88  189:invokevirtual   #270 <Method void CodedOutputStream.writeEnum(int, int)>
		}

	//   89  192:aload_0         
	//   90  193:iconst_2        
	//   91  194:aload           10
	//   92  196:invokeinterface #144 <Method Object java.util.Map$Entry.getValue()>
	//   93  201:checkcast       #141 <Class String>
	//   94  204:invokestatic    #17  <Method ByteString ByteString.copyFromUtf8(String)>
	//   95  207:invokevirtual   #245 <Method void CodedOutputStream.writeBytes(int, ByteString)>
	//*  96  210:goto            120
		codedoutputstream.writeUInt32(12, k);
	//   97  213:aload_0         
	//   98  214:bipush          12
	//   99  216:iload           11
	//  100  218:invokevirtual   #263 <Method void CodedOutputStream.writeUInt32(int, int)>
		if(s2 != null)
	//* 101  221:aload           12
	//* 102  223:ifnull          237
			codedoutputstream.writeBytes(13, ((ByteString) (s2)));
	//  103  226:aload_0         
	//  104  227:bipush          13
	//  105  229:aload           12
	//  106  231:invokevirtual   #245 <Method void CodedOutputStream.writeBytes(int, ByteString)>
	//* 107  234:goto            237
		if(s != null)
	//* 108  237:aload_1         
	//* 109  238:ifnull          248
			codedoutputstream.writeBytes(14, ((ByteString) (s)));
	//  110  241:aload_0         
	//  111  242:bipush          14
	//  112  244:aload_1         
	//  113  245:invokevirtual   #245 <Method void CodedOutputStream.writeBytes(int, ByteString)>
	//  114  248:return          
	}

	public static void writeSessionEvent(CodedOutputStream codedoutputstream, long l, String s, TrimmedThrowableData trimmedthrowabledata, Thread thread, StackTraceElement astacktraceelement[], Thread athread[], 
			List list, Map map, LogFileManager logfilemanager, android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo, int i, String s1, String s2, 
			Float float1, int j, boolean flag, long l1, long l2)
		throws Exception
	{
		ByteString bytestring = ByteString.copyFromUtf8(s1);
	//    0    0:aload           13
	//    1    2:invokestatic    #17  <Method ByteString ByteString.copyFromUtf8(String)>
	//    2    5:astore          22
		if(s2 == null)
	//*   3    7:aload           14
	//*   4    9:ifnonnull       18
			s1 = null;
	//    5   12:aconst_null     
	//    6   13:astore          13
		else
	//*   7   15:goto            33
			s1 = ((String) (ByteString.copyFromUtf8(s2.replace("-", ""))));
	//    8   18:aload           14
	//    9   20:ldc2            #285 <String "-">
	//   10   23:ldc1            #52  <String "">
	//   11   25:invokevirtual   #289 <Method String String.replace(CharSequence, CharSequence)>
	//   12   28:invokestatic    #17  <Method ByteString ByteString.copyFromUtf8(String)>
	//   13   31:astore          13
		s2 = ((String) (logfilemanager.getByteStringForLog()));
	//   14   33:aload           10
	//   15   35:invokevirtual   #295 <Method ByteString LogFileManager.getByteStringForLog()>
	//   16   38:astore          14
		if(s2 == null)
	//*  17   40:aload           14
	//*  18   42:ifnonnull       59
			Fabric.getLogger().d("CrashlyticsCore", "No log data to include with this event.");
	//   19   45:invokestatic    #301 <Method Logger Fabric.getLogger()>
	//   20   48:ldc2            #303 <String "CrashlyticsCore">
	//   21   51:ldc2            #305 <String "No log data to include with this event.">
	//   22   54:invokeinterface #311 <Method void Logger.d(String, String)>
		logfilemanager.clearLog();
	//   23   59:aload           10
	//   24   61:invokevirtual   #314 <Method void LogFileManager.clearLog()>
		codedoutputstream.writeTag(10, 2);
	//   25   64:aload_0         
	//   26   65:bipush          10
	//   27   67:iconst_2        
	//   28   68:invokevirtual   #256 <Method void CodedOutputStream.writeTag(int, int)>
		codedoutputstream.writeRawVarint32(getSessionEventSize(l, s, trimmedthrowabledata, thread, astacktraceelement, athread, list, 8, map, runningappprocessinfo, i, bytestring, ((ByteString) (s1)), float1, j, flag, l1, l2, ((ByteString) (s2))));
	//   29   71:aload_0         
	//   30   72:lload_1         
	//   31   73:aload_3         
	//   32   74:aload           4
	//   33   76:aload           5
	//   34   78:aload           6
	//   35   80:aload           7
	//   36   82:aload           8
	//   37   84:bipush          8
	//   38   86:aload           9
	//   39   88:aload           11
	//   40   90:iload           12
	//   41   92:aload           22
	//   42   94:aload           13
	//   43   96:aload           15
	//   44   98:iload           16
	//   45  100:iload           17
	//   46  102:lload           18
	//   47  104:lload           20
	//   48  106:aload           14
	//   49  108:invokestatic    #316 <Method int getSessionEventSize(long, String, TrimmedThrowableData, Thread, StackTraceElement[], Thread[], List, int, Map, android.app.ActivityManager$RunningAppProcessInfo, int, ByteString, ByteString, Float, int, boolean, long, long, ByteString)>
	//   50  111:invokevirtual   #260 <Method void CodedOutputStream.writeRawVarint32(int)>
		codedoutputstream.writeUInt64(1, l);
	//   51  114:aload_0         
	//   52  115:iconst_1        
	//   53  116:lload_1         
	//   54  117:invokevirtual   #249 <Method void CodedOutputStream.writeUInt64(int, long)>
		codedoutputstream.writeBytes(2, ByteString.copyFromUtf8(s));
	//   55  120:aload_0         
	//   56  121:iconst_2        
	//   57  122:aload_3         
	//   58  123:invokestatic    #17  <Method ByteString ByteString.copyFromUtf8(String)>
	//   59  126:invokevirtual   #245 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		writeSessionEventApp(codedoutputstream, trimmedthrowabledata, thread, astacktraceelement, athread, list, 8, bytestring, ((ByteString) (s1)), map, runningappprocessinfo, i);
	//   60  129:aload_0         
	//   61  130:aload           4
	//   62  132:aload           5
	//   63  134:aload           6
	//   64  136:aload           7
	//   65  138:aload           8
	//   66  140:bipush          8
	//   67  142:aload           22
	//   68  144:aload           13
	//   69  146:aload           9
	//   70  148:aload           11
	//   71  150:iload           12
	//   72  152:invokestatic    #320 <Method void writeSessionEventApp(CodedOutputStream, TrimmedThrowableData, Thread, StackTraceElement[], Thread[], List, int, ByteString, ByteString, Map, android.app.ActivityManager$RunningAppProcessInfo, int)>
		writeSessionEventDevice(codedoutputstream, float1, j, flag, i, l1, l2);
	//   73  155:aload_0         
	//   74  156:aload           15
	//   75  158:iload           16
	//   76  160:iload           17
	//   77  162:iload           12
	//   78  164:lload           18
	//   79  166:lload           20
	//   80  168:invokestatic    #324 <Method void writeSessionEventDevice(CodedOutputStream, Float, int, boolean, int, long, long)>
		writeSessionEventLog(codedoutputstream, ((ByteString) (s2)));
	//   81  171:aload_0         
	//   82  172:aload           14
	//   83  174:invokestatic    #328 <Method void writeSessionEventLog(CodedOutputStream, ByteString)>
	//   84  177:return          
	}

	private static void writeSessionEventApp(CodedOutputStream codedoutputstream, TrimmedThrowableData trimmedthrowabledata, Thread thread, StackTraceElement astacktraceelement[], Thread athread[], List list, int i, ByteString bytestring, 
			ByteString bytestring1, Map map, android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo, int j)
		throws Exception
	{
		codedoutputstream.writeTag(3, 2);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #256 <Method void CodedOutputStream.writeTag(int, int)>
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
	//   16   26:invokestatic    #224 <Method int getEventAppSize(TrimmedThrowableData, Thread, StackTraceElement[], Thread[], List, int, ByteString, ByteString, Map, android.app.ActivityManager$RunningAppProcessInfo, int)>
	//   17   29:invokevirtual   #260 <Method void CodedOutputStream.writeRawVarint32(int)>
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
	//   27   46:invokestatic    #333 <Method void writeSessionEventAppExecution(CodedOutputStream, TrimmedThrowableData, Thread, StackTraceElement[], Thread[], List, int, ByteString, ByteString)>
		if(map != null && !map.isEmpty())
	//*  28   49:aload           9
	//*  29   51:ifnull          70
	//*  30   54:aload           9
	//*  31   56:invokeinterface #336 <Method boolean Map.isEmpty()>
	//*  32   61:ifne            70
			writeSessionEventAppCustomAttributes(codedoutputstream, map);
	//   33   64:aload_0         
	//   34   65:aload           9
	//   35   67:invokestatic    #340 <Method void writeSessionEventAppCustomAttributes(CodedOutputStream, Map)>
		if(runningappprocessinfo != null)
	//*  36   70:aload           10
	//*  37   72:ifnull          101
		{
			boolean flag;
			if(runningappprocessinfo.importance != 100)
	//*  38   75:aload           10
	//*  39   77:getfield        #151 <Field int android.app.ActivityManager$RunningAppProcessInfo.importance>
	//*  40   80:bipush          100
	//*  41   82:icmpeq          91
				flag = true;
	//   42   85:iconst_1        
	//   43   86:istore          12
			else
	//*  44   88:goto            94
				flag = false;
	//   45   91:iconst_0        
	//   46   92:istore          12
			codedoutputstream.writeBool(3, flag);
	//   47   94:aload_0         
	//   48   95:iconst_3        
	//   49   96:iload           12
	//   50   98:invokevirtual   #280 <Method void CodedOutputStream.writeBool(int, boolean)>
		}
		codedoutputstream.writeUInt32(4, j);
	//   51  101:aload_0         
	//   52  102:iconst_4        
	//   53  103:iload           11
	//   54  105:invokevirtual   #263 <Method void CodedOutputStream.writeUInt32(int, int)>
	//   55  108:return          
	}

	private static void writeSessionEventAppCustomAttributes(CodedOutputStream codedoutputstream, Map map)
		throws Exception
	{
		for(Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); codedoutputstream.writeBytes(2, ByteString.copyFromUtf8(((String) (map)))))
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #118 <Method Set Map.entrySet()>
	//*   2    6:invokeinterface #124 <Method Iterator Set.iterator()>
	//*   3   11:astore_3        
	//*   4   12:aload_3         
	//*   5   13:invokeinterface #130 <Method boolean Iterator.hasNext()>
	//*   6   18:ifeq            110
		{
			map = ((Map) ((java.util.Map.Entry)iterator.next()));
	//    7   21:aload_3         
	//    8   22:invokeinterface #134 <Method Object Iterator.next()>
	//    9   27:checkcast       #136 <Class java.util.Map$Entry>
	//   10   30:astore_1        
			codedoutputstream.writeTag(2, 2);
	//   11   31:aload_0         
	//   12   32:iconst_2        
	//   13   33:iconst_2        
	//   14   34:invokevirtual   #256 <Method void CodedOutputStream.writeTag(int, int)>
			codedoutputstream.writeRawVarint32(getEventAppCustomAttributeSize((String)((java.util.Map.Entry) (map)).getKey(), (String)((java.util.Map.Entry) (map)).getValue()));
	//   15   37:aload_0         
	//   16   38:aload_1         
	//   17   39:invokeinterface #139 <Method Object java.util.Map$Entry.getKey()>
	//   18   44:checkcast       #141 <Class String>
	//   19   47:aload_1         
	//   20   48:invokeinterface #144 <Method Object java.util.Map$Entry.getValue()>
	//   21   53:checkcast       #141 <Class String>
	//   22   56:invokestatic    #146 <Method int getEventAppCustomAttributeSize(String, String)>
	//   23   59:invokevirtual   #260 <Method void CodedOutputStream.writeRawVarint32(int)>
			codedoutputstream.writeBytes(1, ByteString.copyFromUtf8((String)((java.util.Map.Entry) (map)).getKey()));
	//   24   62:aload_0         
	//   25   63:iconst_1        
	//   26   64:aload_1         
	//   27   65:invokeinterface #139 <Method Object java.util.Map$Entry.getKey()>
	//   28   70:checkcast       #141 <Class String>
	//   29   73:invokestatic    #17  <Method ByteString ByteString.copyFromUtf8(String)>
	//   30   76:invokevirtual   #245 <Method void CodedOutputStream.writeBytes(int, ByteString)>
			String s = (String)((java.util.Map.Entry) (map)).getValue();
	//   31   79:aload_1         
	//   32   80:invokeinterface #144 <Method Object java.util.Map$Entry.getValue()>
	//   33   85:checkcast       #141 <Class String>
	//   34   88:astore_2        
			map = ((Map) (s));
	//   35   89:aload_2         
	//   36   90:astore_1        
			if(s == null)
	//*  37   91:aload_2         
	//*  38   92:ifnonnull       98
				map = "";
	//   39   95:ldc1            #52  <String "">
	//   40   97:astore_1        
		}

	//   41   98:aload_0         
	//   42   99:iconst_2        
	//   43  100:aload_1         
	//   44  101:invokestatic    #17  <Method ByteString ByteString.copyFromUtf8(String)>
	//   45  104:invokevirtual   #245 <Method void CodedOutputStream.writeBytes(int, ByteString)>
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
	//    3    3:invokevirtual   #256 <Method void CodedOutputStream.writeTag(int, int)>
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
	//   13   20:invokestatic    #112 <Method int getEventAppExecutionSize(TrimmedThrowableData, Thread, StackTraceElement[], Thread[], List, int, ByteString, ByteString)>
	//   14   23:invokevirtual   #260 <Method void CodedOutputStream.writeRawVarint32(int)>
		writeThread(codedoutputstream, thread, astacktraceelement, 4, true);
	//   15   26:aload_0         
	//   16   27:aload_2         
	//   17   28:aload_3         
	//   18   29:iconst_4        
	//   19   30:iconst_1        
	//   20   31:invokestatic    #346 <Method void writeThread(CodedOutputStream, Thread, StackTraceElement[], int, boolean)>
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
	//   35   59:invokeinterface #101 <Method Object List.get(int)>
	//   36   64:checkcast       #102 <Class StackTraceElement[]>
	//   37   67:iconst_0        
	//   38   68:iconst_0        
	//   39   69:invokestatic    #346 <Method void writeThread(CodedOutputStream, Thread, StackTraceElement[], int, boolean)>

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
	//   50   87:invokestatic    #350 <Method void writeSessionEventAppExecutionException(CodedOutputStream, TrimmedThrowableData, int, int, int)>
		codedoutputstream.writeTag(3, 2);
	//   51   90:aload_0         
	//   52   91:iconst_3        
	//   53   92:iconst_2        
	//   54   93:invokevirtual   #256 <Method void CodedOutputStream.writeTag(int, int)>
		codedoutputstream.writeRawVarint32(getEventAppExecutionSignalSize());
	//   55   96:aload_0         
	//   56   97:invokestatic    #104 <Method int getEventAppExecutionSignalSize()>
	//   57  100:invokevirtual   #260 <Method void CodedOutputStream.writeRawVarint32(int)>
		codedoutputstream.writeBytes(1, SIGNAL_DEFAULT_BYTE_STRING);
	//   58  103:aload_0         
	//   59  104:iconst_1        
	//   60  105:getstatic       #19  <Field ByteString SIGNAL_DEFAULT_BYTE_STRING>
	//   61  108:invokevirtual   #245 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		codedoutputstream.writeBytes(2, SIGNAL_DEFAULT_BYTE_STRING);
	//   62  111:aload_0         
	//   63  112:iconst_2        
	//   64  113:getstatic       #19  <Field ByteString SIGNAL_DEFAULT_BYTE_STRING>
	//   65  116:invokevirtual   #245 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		codedoutputstream.writeUInt64(3, 0L);
	//   66  119:aload_0         
	//   67  120:iconst_3        
	//   68  121:lconst_0        
	//   69  122:invokevirtual   #249 <Method void CodedOutputStream.writeUInt64(int, long)>
		codedoutputstream.writeTag(4, 2);
	//   70  125:aload_0         
	//   71  126:iconst_4        
	//   72  127:iconst_2        
	//   73  128:invokevirtual   #256 <Method void CodedOutputStream.writeTag(int, int)>
		codedoutputstream.writeRawVarint32(getBinaryImageSize(bytestring, bytestring1));
	//   74  131:aload_0         
	//   75  132:aload           7
	//   76  134:aload           8
	//   77  136:invokestatic    #106 <Method int getBinaryImageSize(ByteString, ByteString)>
	//   78  139:invokevirtual   #260 <Method void CodedOutputStream.writeRawVarint32(int)>
		codedoutputstream.writeUInt64(1, 0L);
	//   79  142:aload_0         
	//   80  143:iconst_1        
	//   81  144:lconst_0        
	//   82  145:invokevirtual   #249 <Method void CodedOutputStream.writeUInt64(int, long)>
		codedoutputstream.writeUInt64(2, 0L);
	//   83  148:aload_0         
	//   84  149:iconst_2        
	//   85  150:lconst_0        
	//   86  151:invokevirtual   #249 <Method void CodedOutputStream.writeUInt64(int, long)>
		codedoutputstream.writeBytes(3, bytestring);
	//   87  154:aload_0         
	//   88  155:iconst_3        
	//   89  156:aload           7
	//   90  158:invokevirtual   #245 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		if(bytestring1 != null)
	//*  91  161:aload           8
	//*  92  163:ifnull          173
			codedoutputstream.writeBytes(4, bytestring1);
	//   93  166:aload_0         
	//   94  167:iconst_4        
	//   95  168:aload           8
	//   96  170:invokevirtual   #245 <Method void CodedOutputStream.writeBytes(int, ByteString)>
	//   97  173:return          
	}

	private static void writeSessionEventAppExecutionException(CodedOutputStream codedoutputstream, TrimmedThrowableData trimmedthrowabledata, int i, int j, int k)
		throws Exception
	{
		codedoutputstream.writeTag(k, 2);
	//    0    0:aload_0         
	//    1    1:iload           4
	//    2    3:iconst_2        
	//    3    4:invokevirtual   #256 <Method void CodedOutputStream.writeTag(int, int)>
		codedoutputstream.writeRawVarint32(getEventAppExecutionExceptionSize(trimmedthrowabledata, 1, j));
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:iconst_1        
	//    7   10:iload_3         
	//    8   11:invokestatic    #84  <Method int getEventAppExecutionExceptionSize(TrimmedThrowableData, int, int)>
	//    9   14:invokevirtual   #260 <Method void CodedOutputStream.writeRawVarint32(int)>
		codedoutputstream.writeBytes(1, ByteString.copyFromUtf8(trimmedthrowabledata.className));
	//   10   17:aload_0         
	//   11   18:iconst_1        
	//   12   19:aload_1         
	//   13   20:getfield        #60  <Field String TrimmedThrowableData.className>
	//   14   23:invokestatic    #17  <Method ByteString ByteString.copyFromUtf8(String)>
	//   15   26:invokevirtual   #245 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		Object obj = ((Object) (trimmedthrowabledata.localizedMessage));
	//   16   29:aload_1         
	//   17   30:getfield        #63  <Field String TrimmedThrowableData.localizedMessage>
	//   18   33:astore          7
		if(obj != null)
	//*  19   35:aload           7
	//*  20   37:ifnull          50
			codedoutputstream.writeBytes(3, ByteString.copyFromUtf8(((String) (obj))));
	//   21   40:aload_0         
	//   22   41:iconst_3        
	//   23   42:aload           7
	//   24   44:invokestatic    #17  <Method ByteString ByteString.copyFromUtf8(String)>
	//   25   47:invokevirtual   #245 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		StackTraceElement astacktraceelement[] = trimmedthrowabledata.stacktrace;
	//   26   50:aload_1         
	//   27   51:getfield        #67  <Field StackTraceElement[] TrimmedThrowableData.stacktrace>
	//   28   54:astore          7
		int l = astacktraceelement.length;
	//   29   56:aload           7
	//   30   58:arraylength     
	//   31   59:istore          6
		boolean flag = false;
	//   32   61:iconst_0        
	//   33   62:istore          5
		for(k = 0; k < l; k++)
	//*  34   64:iconst_0        
	//*  35   65:istore          4
	//*  36   67:iload           4
	//*  37   69:iload           6
	//*  38   71:icmpge          94
			writeFrame(codedoutputstream, 4, astacktraceelement[k], true);
	//   39   74:aload_0         
	//   40   75:iconst_4        
	//   41   76:aload           7
	//   42   78:iload           4
	//   43   80:aaload          
	//   44   81:iconst_1        
	//   45   82:invokestatic    #353 <Method void writeFrame(CodedOutputStream, int, StackTraceElement, boolean)>

	//   46   85:iload           4
	//   47   87:iconst_1        
	//   48   88:iadd            
	//   49   89:istore          4
	//*  50   91:goto            67
		astacktraceelement = ((StackTraceElement []) (trimmedthrowabledata.cause));
	//   51   94:aload_1         
	//   52   95:getfield        #82  <Field TrimmedThrowableData TrimmedThrowableData.cause>
	//   53   98:astore          7
		if(astacktraceelement != null)
	//*  54  100:aload           7
	//*  55  102:ifnull          156
		{
			k = ((int) (flag));
	//   56  105:iload           5
	//   57  107:istore          4
			trimmedthrowabledata = ((TrimmedThrowableData) (astacktraceelement));
	//   58  109:aload           7
	//   59  111:astore_1        
			if(i < j)
	//*  60  112:iload_2         
	//*  61  113:iload_3         
	//*  62  114:icmpge          130
			{
				writeSessionEventAppExecutionException(codedoutputstream, ((TrimmedThrowableData) (astacktraceelement)), i + 1, j, 6);
	//   63  117:aload_0         
	//   64  118:aload           7
	//   65  120:iload_2         
	//   66  121:iconst_1        
	//   67  122:iadd            
	//   68  123:iload_3         
	//   69  124:bipush          6
	//   70  126:invokestatic    #350 <Method void writeSessionEventAppExecutionException(CodedOutputStream, TrimmedThrowableData, int, int, int)>
				return;
	//   71  129:return          
			}
			while(trimmedthrowabledata != null) 
	//*  72  130:aload_1         
	//*  73  131:ifnull          148
			{
				trimmedthrowabledata = trimmedthrowabledata.cause;
	//   74  134:aload_1         
	//   75  135:getfield        #82  <Field TrimmedThrowableData TrimmedThrowableData.cause>
	//   76  138:astore_1        
				k++;
	//   77  139:iload           4
	//   78  141:iconst_1        
	//   79  142:iadd            
	//   80  143:istore          4
			}
	//*  81  145:goto            130
			codedoutputstream.writeUInt32(7, k);
	//   82  148:aload_0         
	//   83  149:bipush          7
	//   84  151:iload           4
	//   85  153:invokevirtual   #263 <Method void CodedOutputStream.writeUInt32(int, int)>
		}
	//   86  156:return          
	}

	private static void writeSessionEventDevice(CodedOutputStream codedoutputstream, Float float1, int i, boolean flag, int j, long l, long l1)
		throws Exception
	{
		codedoutputstream.writeTag(5, 2);
	//    0    0:aload_0         
	//    1    1:iconst_5        
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #256 <Method void CodedOutputStream.writeTag(int, int)>
		codedoutputstream.writeRawVarint32(getEventDeviceSize(float1, i, flag, j, l, l1));
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:iload_2         
	//    7    9:iload_3         
	//    8   10:iload           4
	//    9   12:lload           5
	//   10   14:lload           7
	//   11   16:invokestatic    #226 <Method int getEventDeviceSize(Float, int, boolean, int, long, long)>
	//   12   19:invokevirtual   #260 <Method void CodedOutputStream.writeRawVarint32(int)>
		if(float1 != null)
	//*  13   22:aload_1         
	//*  14   23:ifnull          35
			codedoutputstream.writeFloat(1, float1.floatValue());
	//   15   26:aload_0         
	//   16   27:iconst_1        
	//   17   28:aload_1         
	//   18   29:invokevirtual   #164 <Method float Float.floatValue()>
	//   19   32:invokevirtual   #357 <Method void CodedOutputStream.writeFloat(int, float)>
		codedoutputstream.writeSInt32(2, i);
	//   20   35:aload_0         
	//   21   36:iconst_2        
	//   22   37:iload_2         
	//   23   38:invokevirtual   #360 <Method void CodedOutputStream.writeSInt32(int, int)>
		codedoutputstream.writeBool(3, flag);
	//   24   41:aload_0         
	//   25   42:iconst_3        
	//   26   43:iload_3         
	//   27   44:invokevirtual   #280 <Method void CodedOutputStream.writeBool(int, boolean)>
		codedoutputstream.writeUInt32(4, j);
	//   28   47:aload_0         
	//   29   48:iconst_4        
	//   30   49:iload           4
	//   31   51:invokevirtual   #263 <Method void CodedOutputStream.writeUInt32(int, int)>
		codedoutputstream.writeUInt64(5, l);
	//   32   54:aload_0         
	//   33   55:iconst_5        
	//   34   56:lload           5
	//   35   58:invokevirtual   #249 <Method void CodedOutputStream.writeUInt64(int, long)>
		codedoutputstream.writeUInt64(6, l1);
	//   36   61:aload_0         
	//   37   62:bipush          6
	//   38   64:lload           7
	//   39   66:invokevirtual   #249 <Method void CodedOutputStream.writeUInt64(int, long)>
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
	//    5    8:invokevirtual   #256 <Method void CodedOutputStream.writeTag(int, int)>
			codedoutputstream.writeRawVarint32(getEventLogSize(bytestring));
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:invokestatic    #228 <Method int getEventLogSize(ByteString)>
	//    9   16:invokevirtual   #260 <Method void CodedOutputStream.writeRawVarint32(int)>
			codedoutputstream.writeBytes(1, bytestring);
	//   10   19:aload_0         
	//   11   20:iconst_1        
	//   12   21:aload_1         
	//   13   22:invokevirtual   #245 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		}
	//   14   25:return          
	}

	public static void writeSessionOS(CodedOutputStream codedoutputstream, boolean flag)
		throws Exception
	{
		ByteString bytestring = ByteString.copyFromUtf8(android.os.Build.VERSION.RELEASE);
	//    0    0:getstatic       #367 <Field String android.os.Build$VERSION.RELEASE>
	//    1    3:invokestatic    #17  <Method ByteString ByteString.copyFromUtf8(String)>
	//    2    6:astore_2        
		ByteString bytestring1 = ByteString.copyFromUtf8(android.os.Build.VERSION.CODENAME);
	//    3    7:getstatic       #370 <Field String android.os.Build$VERSION.CODENAME>
	//    4   10:invokestatic    #17  <Method ByteString ByteString.copyFromUtf8(String)>
	//    5   13:astore_3        
		codedoutputstream.writeTag(8, 2);
	//    6   14:aload_0         
	//    7   15:bipush          8
	//    8   17:iconst_2        
	//    9   18:invokevirtual   #256 <Method void CodedOutputStream.writeTag(int, int)>
		codedoutputstream.writeRawVarint32(getSessionOSSize(bytestring, bytestring1, flag));
	//   10   21:aload_0         
	//   11   22:aload_2         
	//   12   23:aload_3         
	//   13   24:iload_1         
	//   14   25:invokestatic    #372 <Method int getSessionOSSize(ByteString, ByteString, boolean)>
	//   15   28:invokevirtual   #260 <Method void CodedOutputStream.writeRawVarint32(int)>
		codedoutputstream.writeEnum(1, 3);
	//   16   31:aload_0         
	//   17   32:iconst_1        
	//   18   33:iconst_3        
	//   19   34:invokevirtual   #270 <Method void CodedOutputStream.writeEnum(int, int)>
		codedoutputstream.writeBytes(2, bytestring);
	//   20   37:aload_0         
	//   21   38:iconst_2        
	//   22   39:aload_2         
	//   23   40:invokevirtual   #245 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		codedoutputstream.writeBytes(3, bytestring1);
	//   24   43:aload_0         
	//   25   44:iconst_3        
	//   26   45:aload_3         
	//   27   46:invokevirtual   #245 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		codedoutputstream.writeBool(4, flag);
	//   28   49:aload_0         
	//   29   50:iconst_4        
	//   30   51:iload_1         
	//   31   52:invokevirtual   #280 <Method void CodedOutputStream.writeBool(int, boolean)>
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
	//    4    7:ldc1            #52  <String "">
	//    5    9:astore          6
		s = ((String) (ByteString.copyFromUtf8(((String) (obj)))));
	//    6   11:aload           6
	//    7   13:invokestatic    #17  <Method ByteString ByteString.copyFromUtf8(String)>
	//    8   16:astore_1        
		obj = ((Object) (stringToByteString(s1)));
	//    9   17:aload_2         
	//   10   18:invokestatic    #274 <Method ByteString stringToByteString(String)>
	//   11   21:astore          6
		ByteString bytestring = stringToByteString(s2);
	//   12   23:aload_3         
	//   13   24:invokestatic    #274 <Method ByteString stringToByteString(String)>
	//   14   27:astore          7
		int j = CodedOutputStream.computeBytesSize(1, ((ByteString) (s))) + 0;
	//   15   29:iconst_1        
	//   16   30:aload_1         
	//   17   31:invokestatic    #36  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//   18   34:iconst_0        
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
	//   28   51:invokestatic    #36  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
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
	//   38   70:invokestatic    #36  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//   39   73:iadd            
	//   40   74:istore          5
		codedoutputstream.writeTag(6, 2);
	//   41   76:aload_0         
	//   42   77:bipush          6
	//   43   79:iconst_2        
	//   44   80:invokevirtual   #256 <Method void CodedOutputStream.writeTag(int, int)>
		codedoutputstream.writeRawVarint32(j);
	//   45   83:aload_0         
	//   46   84:iload           5
	//   47   86:invokevirtual   #260 <Method void CodedOutputStream.writeRawVarint32(int)>
		codedoutputstream.writeBytes(1, ((ByteString) (s)));
	//   48   89:aload_0         
	//   49   90:iconst_1        
	//   50   91:aload_1         
	//   51   92:invokevirtual   #245 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		if(s1 != null)
	//*  52   95:aload_2         
	//*  53   96:ifnull          106
			codedoutputstream.writeBytes(2, ((ByteString) (obj)));
	//   54   99:aload_0         
	//   55  100:iconst_2        
	//   56  101:aload           6
	//   57  103:invokevirtual   #245 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		if(s2 != null)
	//*  58  106:aload_3         
	//*  59  107:ifnull          117
			codedoutputstream.writeBytes(3, bytestring);
	//   60  110:aload_0         
	//   61  111:iconst_3        
	//   62  112:aload           7
	//   63  114:invokevirtual   #245 <Method void CodedOutputStream.writeBytes(int, ByteString)>
	//   64  117:return          
	}

	private static void writeThread(CodedOutputStream codedoutputstream, Thread thread, StackTraceElement astacktraceelement[], int i, boolean flag)
		throws Exception
	{
		codedoutputstream.writeTag(1, 2);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #256 <Method void CodedOutputStream.writeTag(int, int)>
		codedoutputstream.writeRawVarint32(getThreadSize(thread, astacktraceelement, i, flag));
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:iload_3         
	//    8   10:iload           4
	//    9   12:invokestatic    #95  <Method int getThreadSize(Thread, StackTraceElement[], int, boolean)>
	//   10   15:invokevirtual   #260 <Method void CodedOutputStream.writeRawVarint32(int)>
		codedoutputstream.writeBytes(1, ByteString.copyFromUtf8(thread.getName()));
	//   11   18:aload_0         
	//   12   19:iconst_1        
	//   13   20:aload_1         
	//   14   21:invokevirtual   #236 <Method String Thread.getName()>
	//   15   24:invokestatic    #17  <Method ByteString ByteString.copyFromUtf8(String)>
	//   16   27:invokevirtual   #245 <Method void CodedOutputStream.writeBytes(int, ByteString)>
		codedoutputstream.writeUInt32(2, i);
	//   17   30:aload_0         
	//   18   31:iconst_2        
	//   19   32:iload_3         
	//   20   33:invokevirtual   #263 <Method void CodedOutputStream.writeUInt32(int, int)>
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
	//   35   55:invokestatic    #353 <Method void writeFrame(CodedOutputStream, int, StackTraceElement, boolean)>

	//   36   58:iload_3         
	//   37   59:iconst_1        
	//   38   60:iadd            
	//   39   61:istore_3        
	//*  40   62:goto            42
	//   41   65:return          
	}

	private static final ByteString SIGNAL_DEFAULT_BYTE_STRING = ByteString.copyFromUtf8("0");
	private static final ByteString UNITY_PLATFORM_BYTE_STRING = ByteString.copyFromUtf8("Unity");

	static 
	{
	//    0    0:ldc1            #11  <String "0">
	//    1    2:invokestatic    #17  <Method ByteString ByteString.copyFromUtf8(String)>
	//    2    5:putstatic       #19  <Field ByteString SIGNAL_DEFAULT_BYTE_STRING>
	//    3    8:ldc1            #21  <String "Unity">
	//    4   10:invokestatic    #17  <Method ByteString ByteString.copyFromUtf8(String)>
	//    5   13:putstatic       #23  <Field ByteString UNITY_PLATFORM_BYTE_STRING>
	//*   6   16:return          
	}
}
