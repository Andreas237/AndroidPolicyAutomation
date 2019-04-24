// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.metadata.scte35:
//			SpliceCommand, TimeSignalCommand

public final class SpliceInsertCommand extends SpliceCommand
{
	public static final class ComponentSplice
	{

		public static ComponentSplice createFromParcel(Parcel parcel)
		{
			return new ComponentSplice(parcel.readInt(), parcel.readLong(), parcel.readLong());
		//    0    0:new             #2   <Class SpliceInsertCommand$ComponentSplice>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokevirtual   #35  <Method int Parcel.readInt()>
		//    4    8:aload_0         
		//    5    9:invokevirtual   #39  <Method long Parcel.readLong()>
		//    6   12:aload_0         
		//    7   13:invokevirtual   #39  <Method long Parcel.readLong()>
		//    8   16:invokespecial   #27  <Method void SpliceInsertCommand$ComponentSplice(int, long, long)>
		//    9   19:areturn         
		}

		public void writeToParcel(Parcel parcel)
		{
			parcel.writeInt(componentTag);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #19  <Field int componentTag>
		//    3    5:invokevirtual   #45  <Method void Parcel.writeInt(int)>
			parcel.writeLong(componentSplicePts);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #21  <Field long componentSplicePts>
		//    7   13:invokevirtual   #49  <Method void Parcel.writeLong(long)>
			parcel.writeLong(componentSplicePlaybackPositionUs);
		//    8   16:aload_1         
		//    9   17:aload_0         
		//   10   18:getfield        #23  <Field long componentSplicePlaybackPositionUs>
		//   11   21:invokevirtual   #49  <Method void Parcel.writeLong(long)>
		//   12   24:return          
		}

		public final long componentSplicePlaybackPositionUs;
		public final long componentSplicePts;
		public final int componentTag;

		private ComponentSplice(int i, long l, long l1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			componentTag = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #19  <Field int componentTag>
			componentSplicePts = l;
		//    5    9:aload_0         
		//    6   10:lload_2         
		//    7   11:putfield        #21  <Field long componentSplicePts>
			componentSplicePlaybackPositionUs = l1;
		//    8   14:aload_0         
		//    9   15:lload           4
		//   10   17:putfield        #23  <Field long componentSplicePlaybackPositionUs>
		//   11   20:return          
		}

		ComponentSplice(int i, long l, long l1, _cls1 _pcls1)
		{
			this(i, l, l1);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:lload_2         
		//    3    3:lload           4
		//    4    5:invokespecial   #27  <Method void SpliceInsertCommand$ComponentSplice(int, long, long)>
		//    5    8:return          
		}
	}


	private SpliceInsertCommand(long l, boolean flag, boolean flag1, boolean flag2, boolean flag3, long l1, long l2, List list, boolean flag4, long l3, 
			int i, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void SpliceCommand()>
		spliceEventId = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #42  <Field long spliceEventId>
		spliceEventCancelIndicator = flag;
	//    5    9:aload_0         
	//    6   10:iload_3         
	//    7   11:putfield        #44  <Field boolean spliceEventCancelIndicator>
		outOfNetworkIndicator = flag1;
	//    8   14:aload_0         
	//    9   15:iload           4
	//   10   17:putfield        #46  <Field boolean outOfNetworkIndicator>
		programSpliceFlag = flag2;
	//   11   20:aload_0         
	//   12   21:iload           5
	//   13   23:putfield        #48  <Field boolean programSpliceFlag>
		spliceImmediateFlag = flag3;
	//   14   26:aload_0         
	//   15   27:iload           6
	//   16   29:putfield        #50  <Field boolean spliceImmediateFlag>
		programSplicePts = l1;
	//   17   32:aload_0         
	//   18   33:lload           7
	//   19   35:putfield        #52  <Field long programSplicePts>
		programSplicePlaybackPositionUs = l2;
	//   20   38:aload_0         
	//   21   39:lload           9
	//   22   41:putfield        #54  <Field long programSplicePlaybackPositionUs>
		componentSpliceList = Collections.unmodifiableList(list);
	//   23   44:aload_0         
	//   24   45:aload           11
	//   25   47:invokestatic    #60  <Method List Collections.unmodifiableList(List)>
	//   26   50:putfield        #62  <Field List componentSpliceList>
		autoReturn = flag4;
	//   27   53:aload_0         
	//   28   54:iload           12
	//   29   56:putfield        #64  <Field boolean autoReturn>
		breakDurationUs = l3;
	//   30   59:aload_0         
	//   31   60:lload           13
	//   32   62:putfield        #66  <Field long breakDurationUs>
		uniqueProgramId = i;
	//   33   65:aload_0         
	//   34   66:iload           15
	//   35   68:putfield        #68  <Field int uniqueProgramId>
		availNum = j;
	//   36   71:aload_0         
	//   37   72:iload           16
	//   38   74:putfield        #70  <Field int availNum>
		availsExpected = k;
	//   39   77:aload_0         
	//   40   78:iload           17
	//   41   80:putfield        #72  <Field int availsExpected>
	//   42   83:return          
	}

	private SpliceInsertCommand(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void SpliceCommand()>
		spliceEventId = parcel.readLong();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #81  <Method long Parcel.readLong()>
	//    5    9:putfield        #42  <Field long spliceEventId>
		byte byte0 = parcel.readByte();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #85  <Method byte Parcel.readByte()>
	//    8   16:istore_2        
		boolean flag1 = false;
	//    9   17:iconst_0        
	//   10   18:istore          5
		boolean flag;
		if(byte0 == 1)
	//*  11   20:iload_2         
	//*  12   21:iconst_1        
	//*  13   22:icmpne          31
			flag = true;
	//   14   25:iconst_1        
	//   15   26:istore          4
		else
	//*  16   28:goto            34
			flag = false;
	//   17   31:iconst_0        
	//   18   32:istore          4
		spliceEventCancelIndicator = flag;
	//   19   34:aload_0         
	//   20   35:iload           4
	//   21   37:putfield        #44  <Field boolean spliceEventCancelIndicator>
		if(parcel.readByte() == 1)
	//*  22   40:aload_1         
	//*  23   41:invokevirtual   #85  <Method byte Parcel.readByte()>
	//*  24   44:iconst_1        
	//*  25   45:icmpne          54
			flag = true;
	//   26   48:iconst_1        
	//   27   49:istore          4
		else
	//*  28   51:goto            57
			flag = false;
	//   29   54:iconst_0        
	//   30   55:istore          4
		outOfNetworkIndicator = flag;
	//   31   57:aload_0         
	//   32   58:iload           4
	//   33   60:putfield        #46  <Field boolean outOfNetworkIndicator>
		if(parcel.readByte() == 1)
	//*  34   63:aload_1         
	//*  35   64:invokevirtual   #85  <Method byte Parcel.readByte()>
	//*  36   67:iconst_1        
	//*  37   68:icmpne          77
			flag = true;
	//   38   71:iconst_1        
	//   39   72:istore          4
		else
	//*  40   74:goto            80
			flag = false;
	//   41   77:iconst_0        
	//   42   78:istore          4
		programSpliceFlag = flag;
	//   43   80:aload_0         
	//   44   81:iload           4
	//   45   83:putfield        #48  <Field boolean programSpliceFlag>
		if(parcel.readByte() == 1)
	//*  46   86:aload_1         
	//*  47   87:invokevirtual   #85  <Method byte Parcel.readByte()>
	//*  48   90:iconst_1        
	//*  49   91:icmpne          100
			flag = true;
	//   50   94:iconst_1        
	//   51   95:istore          4
		else
	//*  52   97:goto            103
			flag = false;
	//   53  100:iconst_0        
	//   54  101:istore          4
		spliceImmediateFlag = flag;
	//   55  103:aload_0         
	//   56  104:iload           4
	//   57  106:putfield        #50  <Field boolean spliceImmediateFlag>
		programSplicePts = parcel.readLong();
	//   58  109:aload_0         
	//   59  110:aload_1         
	//   60  111:invokevirtual   #81  <Method long Parcel.readLong()>
	//   61  114:putfield        #52  <Field long programSplicePts>
		programSplicePlaybackPositionUs = parcel.readLong();
	//   62  117:aload_0         
	//   63  118:aload_1         
	//   64  119:invokevirtual   #81  <Method long Parcel.readLong()>
	//   65  122:putfield        #54  <Field long programSplicePlaybackPositionUs>
		int j = parcel.readInt();
	//   66  125:aload_1         
	//   67  126:invokevirtual   #89  <Method int Parcel.readInt()>
	//   68  129:istore_3        
		ArrayList arraylist = new ArrayList(j);
	//   69  130:new             #91  <Class ArrayList>
	//   70  133:dup             
	//   71  134:iload_3         
	//   72  135:invokespecial   #94  <Method void ArrayList(int)>
	//   73  138:astore          6
		for(int i = 0; i < j; i++)
	//*  74  140:iconst_0        
	//*  75  141:istore_2        
	//*  76  142:iload_2         
	//*  77  143:iload_3         
	//*  78  144:icmpge          166
			((List) (arraylist)).add(((Object) (ComponentSplice.createFromParcel(parcel))));
	//   79  147:aload           6
	//   80  149:aload_1         
	//   81  150:invokestatic    #98  <Method SpliceInsertCommand$ComponentSplice SpliceInsertCommand$ComponentSplice.createFromParcel(Parcel)>
	//   82  153:invokeinterface #104 <Method boolean List.add(Object)>
	//   83  158:pop             

	//   84  159:iload_2         
	//   85  160:iconst_1        
	//   86  161:iadd            
	//   87  162:istore_2        
	//*  88  163:goto            142
		componentSpliceList = Collections.unmodifiableList(((List) (arraylist)));
	//   89  166:aload_0         
	//   90  167:aload           6
	//   91  169:invokestatic    #60  <Method List Collections.unmodifiableList(List)>
	//   92  172:putfield        #62  <Field List componentSpliceList>
		flag = flag1;
	//   93  175:iload           5
	//   94  177:istore          4
		if(parcel.readByte() == 1)
	//*  95  179:aload_1         
	//*  96  180:invokevirtual   #85  <Method byte Parcel.readByte()>
	//*  97  183:iconst_1        
	//*  98  184:icmpne          190
			flag = true;
	//   99  187:iconst_1        
	//  100  188:istore          4
		autoReturn = flag;
	//  101  190:aload_0         
	//  102  191:iload           4
	//  103  193:putfield        #64  <Field boolean autoReturn>
		breakDurationUs = parcel.readLong();
	//  104  196:aload_0         
	//  105  197:aload_1         
	//  106  198:invokevirtual   #81  <Method long Parcel.readLong()>
	//  107  201:putfield        #66  <Field long breakDurationUs>
		uniqueProgramId = parcel.readInt();
	//  108  204:aload_0         
	//  109  205:aload_1         
	//  110  206:invokevirtual   #89  <Method int Parcel.readInt()>
	//  111  209:putfield        #68  <Field int uniqueProgramId>
		availNum = parcel.readInt();
	//  112  212:aload_0         
	//  113  213:aload_1         
	//  114  214:invokevirtual   #89  <Method int Parcel.readInt()>
	//  115  217:putfield        #70  <Field int availNum>
		availsExpected = parcel.readInt();
	//  116  220:aload_0         
	//  117  221:aload_1         
	//  118  222:invokevirtual   #89  <Method int Parcel.readInt()>
	//  119  225:putfield        #72  <Field int availsExpected>
	//  120  228:return          
	}


	static SpliceInsertCommand parseFromSection(ParsableByteArray parsablebytearray, long l, TimestampAdjuster timestampadjuster)
	{
		long l3 = parsablebytearray.readUnsignedInt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #114 <Method long ParsableByteArray.readUnsignedInt()>
	//    2    4:lstore          12
		boolean flag5;
		if((parsablebytearray.readUnsignedByte() & 0x80) != 0)
	//*   3    6:aload_0         
	//*   4    7:invokevirtual   #117 <Method int ParsableByteArray.readUnsignedByte()>
	//*   5   10:sipush          128
	//*   6   13:iand            
	//*   7   14:ifeq            23
			flag5 = true;
	//    8   17:iconst_1        
	//    9   18:istore          18
		else
	//*  10   20:goto            26
			flag5 = false;
	//   11   23:iconst_0        
	//   12   24:istore          18
		Object obj = ((Object) (Collections.emptyList()));
	//   13   26:invokestatic    #121 <Method List Collections.emptyList()>
	//   14   29:astore          19
		int i;
		int j;
		int i1;
		long l1;
		boolean flag1;
		boolean flag2;
		boolean flag3;
		boolean flag4;
		if(!flag5)
	//*  15   31:iload           18
	//*  16   33:ifne            314
		{
			j = parsablebytearray.readUnsignedByte();
	//   17   36:aload_0         
	//   18   37:invokevirtual   #117 <Method int ParsableByteArray.readUnsignedByte()>
	//   19   40:istore          5
			if((j & 0x80) != 0)
	//*  20   42:iload           5
	//*  21   44:sipush          128
	//*  22   47:iand            
	//*  23   48:ifeq            57
				flag1 = true;
	//   24   51:iconst_1        
	//   25   52:istore          14
			else
	//*  26   54:goto            60
				flag1 = false;
	//   27   57:iconst_0        
	//   28   58:istore          14
			if((j & 0x40) != 0)
	//*  29   60:iload           5
	//*  30   62:bipush          64
	//*  31   64:iand            
	//*  32   65:ifeq            74
				flag2 = true;
	//   33   68:iconst_1        
	//   34   69:istore          15
			else
	//*  35   71:goto            77
				flag2 = false;
	//   36   74:iconst_0        
	//   37   75:istore          15
			boolean flag;
			if((j & 0x20) != 0)
	//*  38   77:iload           5
	//*  39   79:bipush          32
	//*  40   81:iand            
	//*  41   82:ifeq            91
				flag = true;
	//   42   85:iconst_1        
	//   43   86:istore          4
			else
	//*  44   88:goto            94
				flag = false;
	//   45   91:iconst_0        
	//   46   92:istore          4
			if((j & 0x10) != 0)
	//*  47   94:iload           5
	//*  48   96:bipush          16
	//*  49   98:iand            
	//*  50   99:ifeq            108
				flag3 = true;
	//   51  102:iconst_1        
	//   52  103:istore          16
			else
	//*  53  105:goto            111
				flag3 = false;
	//   54  108:iconst_0        
	//   55  109:istore          16
			if(flag2 && !flag3)
	//*  56  111:iload           15
	//*  57  113:ifeq            131
	//*  58  116:iload           16
	//*  59  118:ifne            131
				l1 = TimeSignalCommand.parseSpliceTime(parsablebytearray, l);
	//   60  121:aload_0         
	//   61  122:lload_1         
	//   62  123:invokestatic    #127 <Method long TimeSignalCommand.parseSpliceTime(ParsableByteArray, long)>
	//   63  126:lstore          8
			else
	//*  64  128:goto            136
				l1 = 0x1L;
	//   65  131:ldc2w           #128 <Long 0x1L>
	//   66  134:lstore          8
			if(!flag2)
	//*  67  136:iload           15
	//*  68  138:ifne            233
			{
				j = parsablebytearray.readUnsignedByte();
	//   69  141:aload_0         
	//   70  142:invokevirtual   #117 <Method int ParsableByteArray.readUnsignedByte()>
	//   71  145:istore          5
				ArrayList arraylist = new ArrayList(j);
	//   72  147:new             #91  <Class ArrayList>
	//   73  150:dup             
	//   74  151:iload           5
	//   75  153:invokespecial   #94  <Method void ArrayList(int)>
	//   76  156:astore          20
				int k = 0;
	//   77  158:iconst_0        
	//   78  159:istore          6
				do
				{
					obj = ((Object) (arraylist));
	//   79  161:aload           20
	//   80  163:astore          19
					if(k >= j)
						break;
	//   81  165:iload           6
	//   82  167:iload           5
	//   83  169:icmpge          233
					int j1 = parsablebytearray.readUnsignedByte();
	//   84  172:aload_0         
	//   85  173:invokevirtual   #117 <Method int ParsableByteArray.readUnsignedByte()>
	//   86  176:istore          7
					long l2;
					if(!flag3)
	//*  87  178:iload           16
	//*  88  180:ifne            193
						l2 = TimeSignalCommand.parseSpliceTime(parsablebytearray, l);
	//   89  183:aload_0         
	//   90  184:lload_1         
	//   91  185:invokestatic    #127 <Method long TimeSignalCommand.parseSpliceTime(ParsableByteArray, long)>
	//   92  188:lstore          10
					else
	//*  93  190:goto            198
						l2 = 0x1L;
	//   94  193:ldc2w           #128 <Long 0x1L>
	//   95  196:lstore          10
					((List) (arraylist)).add(((Object) (new ComponentSplice(j1, l2, timestampadjuster.adjustTsTimestamp(l2)))));
	//   96  198:aload           20
	//   97  200:new             #8   <Class SpliceInsertCommand$ComponentSplice>
	//   98  203:dup             
	//   99  204:iload           7
	//  100  206:lload           10
	//  101  208:aload_3         
	//  102  209:lload           10
	//  103  211:invokevirtual   #135 <Method long TimestampAdjuster.adjustTsTimestamp(long)>
	//  104  214:aconst_null     
	//  105  215:invokespecial   #138 <Method void SpliceInsertCommand$ComponentSplice(int, long, long, SpliceInsertCommand$1)>
	//  106  218:invokeinterface #104 <Method boolean List.add(Object)>
	//  107  223:pop             
					k++;
	//  108  224:iload           6
	//  109  226:iconst_1        
	//  110  227:iadd            
	//  111  228:istore          6
				} while(true);
	//  112  230:goto            161
			}
			if(flag)
	//* 113  233:iload           4
	//* 114  235:ifeq            286
			{
				l = parsablebytearray.readUnsignedByte();
	//  115  238:aload_0         
	//  116  239:invokevirtual   #117 <Method int ParsableByteArray.readUnsignedByte()>
	//  117  242:i2l             
	//  118  243:lstore_1        
				if((l & 128L) != 0L)
	//* 119  244:lload_1         
	//* 120  245:ldc2w           #139 <Long 128L>
	//* 121  248:land            
	//* 122  249:lconst_0        
	//* 123  250:lcmp            
	//* 124  251:ifeq            260
					flag4 = true;
	//  125  254:iconst_1        
	//  126  255:istore          17
				else
	//* 127  257:goto            263
					flag4 = false;
	//  128  260:iconst_0        
	//  129  261:istore          17
				l = (((l & 1L) << 32 | parsablebytearray.readUnsignedInt()) * 1000L) / 90L;
	//  130  263:lload_1         
	//  131  264:lconst_1        
	//  132  265:land            
	//  133  266:bipush          32
	//  134  268:lshl            
	//  135  269:aload_0         
	//  136  270:invokevirtual   #114 <Method long ParsableByteArray.readUnsignedInt()>
	//  137  273:lor             
	//  138  274:ldc2w           #141 <Long 1000L>
	//  139  277:lmul            
	//  140  278:ldc2w           #143 <Long 90L>
	//  141  281:ldiv            
	//  142  282:lstore_1        
			} else
	//* 143  283:goto            293
			{
				flag4 = false;
	//  144  286:iconst_0        
	//  145  287:istore          17
				l = 0x1L;
	//  146  289:ldc2w           #128 <Long 0x1L>
	//  147  292:lstore_1        
			}
			i1 = parsablebytearray.readUnsignedShort();
	//  148  293:aload_0         
	//  149  294:invokevirtual   #147 <Method int ParsableByteArray.readUnsignedShort()>
	//  150  297:istore          6
			i = parsablebytearray.readUnsignedByte();
	//  151  299:aload_0         
	//  152  300:invokevirtual   #117 <Method int ParsableByteArray.readUnsignedByte()>
	//  153  303:istore          4
			j = parsablebytearray.readUnsignedByte();
	//  154  305:aload_0         
	//  155  306:invokevirtual   #117 <Method int ParsableByteArray.readUnsignedByte()>
	//  156  309:istore          5
		} else
	//* 157  311:goto            344
		{
			flag1 = false;
	//  158  314:iconst_0        
	//  159  315:istore          14
			flag2 = false;
	//  160  317:iconst_0        
	//  161  318:istore          15
			flag3 = false;
	//  162  320:iconst_0        
	//  163  321:istore          16
			l1 = 0x1L;
	//  164  323:ldc2w           #128 <Long 0x1L>
	//  165  326:lstore          8
			flag4 = false;
	//  166  328:iconst_0        
	//  167  329:istore          17
			l = 0x1L;
	//  168  331:ldc2w           #128 <Long 0x1L>
	//  169  334:lstore_1        
			i1 = 0;
	//  170  335:iconst_0        
	//  171  336:istore          6
			i = 0;
	//  172  338:iconst_0        
	//  173  339:istore          4
			j = 0;
	//  174  341:iconst_0        
	//  175  342:istore          5
		}
		return new SpliceInsertCommand(l3, flag5, flag1, flag2, flag3, l1, timestampadjuster.adjustTsTimestamp(l1), ((List) (obj)), flag4, l, i1, i, j);
	//  176  344:new             #2   <Class SpliceInsertCommand>
	//  177  347:dup             
	//  178  348:lload           12
	//  179  350:iload           18
	//  180  352:iload           14
	//  181  354:iload           15
	//  182  356:iload           16
	//  183  358:lload           8
	//  184  360:aload_3         
	//  185  361:lload           8
	//  186  363:invokevirtual   #135 <Method long TimestampAdjuster.adjustTsTimestamp(long)>
	//  187  366:aload           19
	//  188  368:iload           17
	//  189  370:lload_1         
	//  190  371:iload           6
	//  191  373:iload           4
	//  192  375:iload           5
	//  193  377:invokespecial   #149 <Method void SpliceInsertCommand(long, boolean, boolean, boolean, boolean, long, long, List, boolean, long, int, int, int)>
	//  194  380:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeLong(spliceEventId);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #42  <Field long spliceEventId>
	//    3    5:invokevirtual   #155 <Method void Parcel.writeLong(long)>
		parcel.writeByte((byte)spliceEventCancelIndicator);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #44  <Field boolean spliceEventCancelIndicator>
	//    7   13:int2byte        
	//    8   14:invokevirtual   #159 <Method void Parcel.writeByte(byte)>
		parcel.writeByte((byte)outOfNetworkIndicator);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #46  <Field boolean outOfNetworkIndicator>
	//   12   22:int2byte        
	//   13   23:invokevirtual   #159 <Method void Parcel.writeByte(byte)>
		parcel.writeByte((byte)programSpliceFlag);
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:getfield        #48  <Field boolean programSpliceFlag>
	//   17   31:int2byte        
	//   18   32:invokevirtual   #159 <Method void Parcel.writeByte(byte)>
		parcel.writeByte((byte)spliceImmediateFlag);
	//   19   35:aload_1         
	//   20   36:aload_0         
	//   21   37:getfield        #50  <Field boolean spliceImmediateFlag>
	//   22   40:int2byte        
	//   23   41:invokevirtual   #159 <Method void Parcel.writeByte(byte)>
		parcel.writeLong(programSplicePts);
	//   24   44:aload_1         
	//   25   45:aload_0         
	//   26   46:getfield        #52  <Field long programSplicePts>
	//   27   49:invokevirtual   #155 <Method void Parcel.writeLong(long)>
		parcel.writeLong(programSplicePlaybackPositionUs);
	//   28   52:aload_1         
	//   29   53:aload_0         
	//   30   54:getfield        #54  <Field long programSplicePlaybackPositionUs>
	//   31   57:invokevirtual   #155 <Method void Parcel.writeLong(long)>
		int j = componentSpliceList.size();
	//   32   60:aload_0         
	//   33   61:getfield        #62  <Field List componentSpliceList>
	//   34   64:invokeinterface #162 <Method int List.size()>
	//   35   69:istore_3        
		parcel.writeInt(j);
	//   36   70:aload_1         
	//   37   71:iload_3         
	//   38   72:invokevirtual   #165 <Method void Parcel.writeInt(int)>
		for(i = 0; i < j; i++)
	//*  39   75:iconst_0        
	//*  40   76:istore_2        
	//*  41   77:iload_2         
	//*  42   78:iload_3         
	//*  43   79:icmpge          106
			((ComponentSplice)componentSpliceList.get(i)).writeToParcel(parcel);
	//   44   82:aload_0         
	//   45   83:getfield        #62  <Field List componentSpliceList>
	//   46   86:iload_2         
	//   47   87:invokeinterface #169 <Method Object List.get(int)>
	//   48   92:checkcast       #8   <Class SpliceInsertCommand$ComponentSplice>
	//   49   95:aload_1         
	//   50   96:invokevirtual   #171 <Method void SpliceInsertCommand$ComponentSplice.writeToParcel(Parcel)>

	//   51   99:iload_2         
	//   52  100:iconst_1        
	//   53  101:iadd            
	//   54  102:istore_2        
	//*  55  103:goto            77
		parcel.writeByte((byte)autoReturn);
	//   56  106:aload_1         
	//   57  107:aload_0         
	//   58  108:getfield        #64  <Field boolean autoReturn>
	//   59  111:int2byte        
	//   60  112:invokevirtual   #159 <Method void Parcel.writeByte(byte)>
		parcel.writeLong(breakDurationUs);
	//   61  115:aload_1         
	//   62  116:aload_0         
	//   63  117:getfield        #66  <Field long breakDurationUs>
	//   64  120:invokevirtual   #155 <Method void Parcel.writeLong(long)>
		parcel.writeInt(uniqueProgramId);
	//   65  123:aload_1         
	//   66  124:aload_0         
	//   67  125:getfield        #68  <Field int uniqueProgramId>
	//   68  128:invokevirtual   #165 <Method void Parcel.writeInt(int)>
		parcel.writeInt(availNum);
	//   69  131:aload_1         
	//   70  132:aload_0         
	//   71  133:getfield        #70  <Field int availNum>
	//   72  136:invokevirtual   #165 <Method void Parcel.writeInt(int)>
		parcel.writeInt(availsExpected);
	//   73  139:aload_1         
	//   74  140:aload_0         
	//   75  141:getfield        #72  <Field int availsExpected>
	//   76  144:invokevirtual   #165 <Method void Parcel.writeInt(int)>
	//   77  147:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public SpliceInsertCommand createFromParcel(Parcel parcel)
		{
			return new SpliceInsertCommand(parcel);
		//    0    0:new             #9   <Class SpliceInsertCommand>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #19  <Method void SpliceInsertCommand(Parcel, SpliceInsertCommand$1)>
		//    5    9:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method SpliceInsertCommand createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public SpliceInsertCommand[] newArray(int i)
		{
			return new SpliceInsertCommand[i];
		//    0    0:iload_1         
		//    1    1:anewarray       SpliceInsertCommand[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method SpliceInsertCommand[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public final boolean autoReturn;
	public final int availNum;
	public final int availsExpected;
	public final long breakDurationUs;
	public final List componentSpliceList;
	public final boolean outOfNetworkIndicator;
	public final boolean programSpliceFlag;
	public final long programSplicePlaybackPositionUs;
	public final long programSplicePts;
	public final boolean spliceEventCancelIndicator;
	public final long spliceEventId;
	public final boolean spliceImmediateFlag;
	public final int uniqueProgramId;

	static 
	{
	//    0    0:new             #6   <Class SpliceInsertCommand$1>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void SpliceInsertCommand$1()>
	//    3    7:putstatic       #37  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
