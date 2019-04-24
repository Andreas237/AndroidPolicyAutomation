// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.metadata.scte35:
//			SpliceCommand

public final class SpliceScheduleCommand extends SpliceCommand
{
	public static final class ComponentSplice
	{

		private static ComponentSplice createFromParcel(Parcel parcel)
		{
			return new ComponentSplice(parcel.readInt(), parcel.readLong());
		//    0    0:new             #2   <Class SpliceScheduleCommand$ComponentSplice>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokevirtual   #41  <Method int Parcel.readInt()>
		//    4    8:aload_0         
		//    5    9:invokevirtual   #45  <Method long Parcel.readLong()>
		//    6   12:invokespecial   #24  <Method void SpliceScheduleCommand$ComponentSplice(int, long)>
		//    7   15:areturn         
		}

		private void writeToParcel(Parcel parcel)
		{
			parcel.writeInt(componentTag);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #18  <Field int componentTag>
		//    3    5:invokevirtual   #49  <Method void Parcel.writeInt(int)>
			parcel.writeLong(utcSpliceTime);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #20  <Field long utcSpliceTime>
		//    7   13:invokevirtual   #53  <Method void Parcel.writeLong(long)>
		//    8   16:return          
		}

		public final int componentTag;
		public final long utcSpliceTime;


/*
		static ComponentSplice access$000(Parcel parcel)
		{
			return createFromParcel(parcel);
		//    0    0:aload_0         
		//    1    1:invokestatic    #29  <Method SpliceScheduleCommand$ComponentSplice createFromParcel(Parcel)>
		//    2    4:areturn         
		}

*/


/*
		static void access$200(ComponentSplice componentsplice, Parcel parcel)
		{
			componentsplice.writeToParcel(parcel);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #35  <Method void writeToParcel(Parcel)>
			return;
		//    3    5:return          
		}

*/

		private ComponentSplice(int i, long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			componentTag = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #18  <Field int componentTag>
			utcSpliceTime = l;
		//    5    9:aload_0         
		//    6   10:lload_2         
		//    7   11:putfield        #20  <Field long utcSpliceTime>
		//    8   14:return          
		}

		ComponentSplice(int i, long l, _cls1 _pcls1)
		{
			this(i, l);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:lload_2         
		//    3    3:invokespecial   #24  <Method void SpliceScheduleCommand$ComponentSplice(int, long)>
		//    4    6:return          
		}
	}

	public static final class Event
	{

		private static Event createFromParcel(Parcel parcel)
		{
			return new Event(parcel);
		//    0    0:new             #2   <Class SpliceScheduleCommand$Event>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #106 <Method void SpliceScheduleCommand$Event(Parcel)>
		//    4    8:areturn         
		}

		private static Event parseFromSection(ParsableByteArray parsablebytearray)
		{
			long l3 = parsablebytearray.readUnsignedInt();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #111 <Method long ParsableByteArray.readUnsignedInt()>
		//    2    4:lstore          8
			boolean flag4;
			if((parsablebytearray.readUnsignedByte() & 0x80) != 0)
		//*   3    6:aload_0         
		//*   4    7:invokevirtual   #114 <Method int ParsableByteArray.readUnsignedByte()>
		//*   5   10:sipush          128
		//*   6   13:iand            
		//*   7   14:ifeq            23
				flag4 = true;
		//    8   17:iconst_1        
		//    9   18:istore          13
			else
		//*  10   20:goto            26
				flag4 = false;
		//   11   23:iconst_0        
		//   12   24:istore          13
			ArrayList arraylist = new ArrayList();
		//   13   26:new             #76  <Class ArrayList>
		//   14   29:dup             
		//   15   30:invokespecial   #115 <Method void ArrayList()>
		//   16   33:astore          14
			int i;
			int k;
			int i1;
			long l1;
			long l2;
			boolean flag1;
			boolean flag2;
			boolean flag3;
			if(!flag4)
		//*  17   35:iload           13
		//*  18   37:ifne            253
			{
				i = parsablebytearray.readUnsignedByte();
		//   19   40:aload_0         
		//   20   41:invokevirtual   #114 <Method int ParsableByteArray.readUnsignedByte()>
		//   21   44:istore_1        
				if((i & 0x80) != 0)
		//*  22   45:iload_1         
		//*  23   46:sipush          128
		//*  24   49:iand            
		//*  25   50:ifeq            59
					flag1 = true;
		//   26   53:iconst_1        
		//   27   54:istore          10
				else
		//*  28   56:goto            62
					flag1 = false;
		//   29   59:iconst_0        
		//   30   60:istore          10
				if((i & 0x40) != 0)
		//*  31   62:iload_1         
		//*  32   63:bipush          64
		//*  33   65:iand            
		//*  34   66:ifeq            75
					flag2 = true;
		//   35   69:iconst_1        
		//   36   70:istore          11
				else
		//*  37   72:goto            78
					flag2 = false;
		//   38   75:iconst_0        
		//   39   76:istore          11
				boolean flag;
				if((i & 0x20) != 0)
		//*  40   78:iload_1         
		//*  41   79:bipush          32
		//*  42   81:iand            
		//*  43   82:ifeq            90
					flag = true;
		//   44   85:iconst_1        
		//   45   86:istore_1        
				else
		//*  46   87:goto            92
					flag = false;
		//   47   90:iconst_0        
		//   48   91:istore_1        
				if(flag2)
		//*  49   92:iload           11
		//*  50   94:ifeq            106
					l1 = parsablebytearray.readUnsignedInt();
		//   51   97:aload_0         
		//   52   98:invokevirtual   #111 <Method long ParsableByteArray.readUnsignedInt()>
		//   53  101:lstore          4
				else
		//*  54  103:goto            111
					l1 = 0x1L;
		//   55  106:ldc2w           #116 <Long 0x1L>
		//   56  109:lstore          4
				if(!flag2)
		//*  57  111:iload           11
		//*  58  113:ifne            171
				{
					int l = parsablebytearray.readUnsignedByte();
		//   59  116:aload_0         
		//   60  117:invokevirtual   #114 <Method int ParsableByteArray.readUnsignedByte()>
		//   61  120:istore_3        
					ArrayList arraylist1 = new ArrayList(l);
		//   62  121:new             #76  <Class ArrayList>
		//   63  124:dup             
		//   64  125:iload_3         
		//   65  126:invokespecial   #79  <Method void ArrayList(int)>
		//   66  129:astore          15
					int j = 0;
		//   67  131:iconst_0        
		//   68  132:istore_2        
					do
					{
						arraylist = arraylist1;
		//   69  133:aload           15
		//   70  135:astore          14
						if(j >= l)
							break;
		//   71  137:iload_2         
		//   72  138:iload_3         
		//   73  139:icmpge          171
						arraylist1.add(((Object) (new ComponentSplice(parsablebytearray.readUnsignedByte(), parsablebytearray.readUnsignedInt()))));
		//   74  142:aload           15
		//   75  144:new             #81  <Class SpliceScheduleCommand$ComponentSplice>
		//   76  147:dup             
		//   77  148:aload_0         
		//   78  149:invokevirtual   #114 <Method int ParsableByteArray.readUnsignedByte()>
		//   79  152:aload_0         
		//   80  153:invokevirtual   #111 <Method long ParsableByteArray.readUnsignedInt()>
		//   81  156:aconst_null     
		//   82  157:invokespecial   #120 <Method void SpliceScheduleCommand$ComponentSplice(int, long, SpliceScheduleCommand$1)>
		//   83  160:invokevirtual   #89  <Method boolean ArrayList.add(Object)>
		//   84  163:pop             
						j++;
		//   85  164:iload_2         
		//   86  165:iconst_1        
		//   87  166:iadd            
		//   88  167:istore_2        
					} while(true);
		//   89  168:goto            133
				}
				if(flag)
		//*  90  171:iload_1         
		//*  91  172:ifeq            227
				{
					l2 = parsablebytearray.readUnsignedByte();
		//   92  175:aload_0         
		//   93  176:invokevirtual   #114 <Method int ParsableByteArray.readUnsignedByte()>
		//   94  179:i2l             
		//   95  180:lstore          6
					if((l2 & 128L) != 0L)
		//*  96  182:lload           6
		//*  97  184:ldc2w           #121 <Long 128L>
		//*  98  187:land            
		//*  99  188:lconst_0        
		//* 100  189:lcmp            
		//* 101  190:ifeq            199
						flag3 = true;
		//  102  193:iconst_1        
		//  103  194:istore          12
					else
		//* 104  196:goto            202
						flag3 = false;
		//  105  199:iconst_0        
		//  106  200:istore          12
					l2 = (((l2 & 1L) << 32 | parsablebytearray.readUnsignedInt()) * 1000L) / 90L;
		//  107  202:lload           6
		//  108  204:lconst_1        
		//  109  205:land            
		//  110  206:bipush          32
		//  111  208:lshl            
		//  112  209:aload_0         
		//  113  210:invokevirtual   #111 <Method long ParsableByteArray.readUnsignedInt()>
		//  114  213:lor             
		//  115  214:ldc2w           #123 <Long 1000L>
		//  116  217:lmul            
		//  117  218:ldc2w           #125 <Long 90L>
		//  118  221:ldiv            
		//  119  222:lstore          6
				} else
		//* 120  224:goto            235
				{
					flag3 = false;
		//  121  227:iconst_0        
		//  122  228:istore          12
					l2 = 0x1L;
		//  123  230:ldc2w           #116 <Long 0x1L>
		//  124  233:lstore          6
				}
				flag = ((boolean) (parsablebytearray.readUnsignedShort()));
		//  125  235:aload_0         
		//  126  236:invokevirtual   #129 <Method int ParsableByteArray.readUnsignedShort()>
		//  127  239:istore_1        
				k = parsablebytearray.readUnsignedByte();
		//  128  240:aload_0         
		//  129  241:invokevirtual   #114 <Method int ParsableByteArray.readUnsignedByte()>
		//  130  244:istore_2        
				i1 = parsablebytearray.readUnsignedByte();
		//  131  245:aload_0         
		//  132  246:invokevirtual   #114 <Method int ParsableByteArray.readUnsignedByte()>
		//  133  249:istore_3        
			} else
		//* 134  250:goto            278
			{
				flag1 = false;
		//  135  253:iconst_0        
		//  136  254:istore          10
				l1 = 0x1L;
		//  137  256:ldc2w           #116 <Long 0x1L>
		//  138  259:lstore          4
				flag3 = false;
		//  139  261:iconst_0        
		//  140  262:istore          12
				l2 = 0x1L;
		//  141  264:ldc2w           #116 <Long 0x1L>
		//  142  267:lstore          6
				flag = false;
		//  143  269:iconst_0        
		//  144  270:istore_1        
				k = 0;
		//  145  271:iconst_0        
		//  146  272:istore_2        
				i1 = 0;
		//  147  273:iconst_0        
		//  148  274:istore_3        
				flag2 = false;
		//  149  275:iconst_0        
		//  150  276:istore          11
			}
			return new Event(l3, flag4, flag1, flag2, ((List) (arraylist)), l1, flag3, l2, ((int) (flag)), k, i1);
		//  151  278:new             #2   <Class SpliceScheduleCommand$Event>
		//  152  281:dup             
		//  153  282:lload           8
		//  154  284:iload           13
		//  155  286:iload           10
		//  156  288:iload           11
		//  157  290:aload           14
		//  158  292:lload           4
		//  159  294:iload           12
		//  160  296:lload           6
		//  161  298:iload_1         
		//  162  299:iload_2         
		//  163  300:iload_3         
		//  164  301:invokespecial   #131 <Method void SpliceScheduleCommand$Event(long, boolean, boolean, boolean, List, long, boolean, long, int, int, int)>
		//  165  304:areturn         
		}

		private void writeToParcel(Parcel parcel)
		{
			parcel.writeLong(spliceEventId);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #30  <Field long spliceEventId>
		//    3    5:invokevirtual   #135 <Method void Parcel.writeLong(long)>
			parcel.writeByte((byte)spliceEventCancelIndicator);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #32  <Field boolean spliceEventCancelIndicator>
		//    7   13:int2byte        
		//    8   14:invokevirtual   #139 <Method void Parcel.writeByte(byte)>
			parcel.writeByte((byte)outOfNetworkIndicator);
		//    9   17:aload_1         
		//   10   18:aload_0         
		//   11   19:getfield        #34  <Field boolean outOfNetworkIndicator>
		//   12   22:int2byte        
		//   13   23:invokevirtual   #139 <Method void Parcel.writeByte(byte)>
			parcel.writeByte((byte)programSpliceFlag);
		//   14   26:aload_1         
		//   15   27:aload_0         
		//   16   28:getfield        #36  <Field boolean programSpliceFlag>
		//   17   31:int2byte        
		//   18   32:invokevirtual   #139 <Method void Parcel.writeByte(byte)>
			int j = componentSpliceList.size();
		//   19   35:aload_0         
		//   20   36:getfield        #44  <Field List componentSpliceList>
		//   21   39:invokeinterface #144 <Method int List.size()>
		//   22   44:istore_3        
			parcel.writeInt(j);
		//   23   45:aload_1         
		//   24   46:iload_3         
		//   25   47:invokevirtual   #147 <Method void Parcel.writeInt(int)>
			for(int i = 0; i < j; i++)
		//*  26   50:iconst_0        
		//*  27   51:istore_2        
		//*  28   52:iload_2         
		//*  29   53:iload_3         
		//*  30   54:icmpge          81
				((ComponentSplice)componentSpliceList.get(i)).writeToParcel(parcel);
		//   31   57:aload_0         
		//   32   58:getfield        #44  <Field List componentSpliceList>
		//   33   61:iload_2         
		//   34   62:invokeinterface #151 <Method Object List.get(int)>
		//   35   67:checkcast       #81  <Class SpliceScheduleCommand$ComponentSplice>
		//   36   70:aload_1         
		//   37   71:invokestatic    #155 <Method void SpliceScheduleCommand$ComponentSplice.access$200(SpliceScheduleCommand$ComponentSplice, Parcel)>

		//   38   74:iload_2         
		//   39   75:iconst_1        
		//   40   76:iadd            
		//   41   77:istore_2        
		//*  42   78:goto            52
			parcel.writeLong(utcSpliceTime);
		//   43   81:aload_1         
		//   44   82:aload_0         
		//   45   83:getfield        #46  <Field long utcSpliceTime>
		//   46   86:invokevirtual   #135 <Method void Parcel.writeLong(long)>
			parcel.writeByte((byte)autoReturn);
		//   47   89:aload_1         
		//   48   90:aload_0         
		//   49   91:getfield        #48  <Field boolean autoReturn>
		//   50   94:int2byte        
		//   51   95:invokevirtual   #139 <Method void Parcel.writeByte(byte)>
			parcel.writeLong(breakDurationUs);
		//   52   98:aload_1         
		//   53   99:aload_0         
		//   54  100:getfield        #50  <Field long breakDurationUs>
		//   55  103:invokevirtual   #135 <Method void Parcel.writeLong(long)>
			parcel.writeInt(uniqueProgramId);
		//   56  106:aload_1         
		//   57  107:aload_0         
		//   58  108:getfield        #52  <Field int uniqueProgramId>
		//   59  111:invokevirtual   #147 <Method void Parcel.writeInt(int)>
			parcel.writeInt(availNum);
		//   60  114:aload_1         
		//   61  115:aload_0         
		//   62  116:getfield        #54  <Field int availNum>
		//   63  119:invokevirtual   #147 <Method void Parcel.writeInt(int)>
			parcel.writeInt(availsExpected);
		//   64  122:aload_1         
		//   65  123:aload_0         
		//   66  124:getfield        #56  <Field int availsExpected>
		//   67  127:invokevirtual   #147 <Method void Parcel.writeInt(int)>
		//   68  130:return          
		}

		public final boolean autoReturn;
		public final int availNum;
		public final int availsExpected;
		public final long breakDurationUs;
		public final List componentSpliceList;
		public final boolean outOfNetworkIndicator;
		public final boolean programSpliceFlag;
		public final boolean spliceEventCancelIndicator;
		public final long spliceEventId;
		public final int uniqueProgramId;
		public final long utcSpliceTime;


/*
		static Event access$300(Parcel parcel)
		{
			return createFromParcel(parcel);
		//    0    0:aload_0         
		//    1    1:invokestatic    #94  <Method SpliceScheduleCommand$Event createFromParcel(Parcel)>
		//    2    4:areturn         
		}

*/


/*
		static Event access$400(ParsableByteArray parsablebytearray)
		{
			return parseFromSection(parsablebytearray);
		//    0    0:aload_0         
		//    1    1:invokestatic    #99  <Method SpliceScheduleCommand$Event parseFromSection(ParsableByteArray)>
		//    2    4:areturn         
		}

*/


/*
		static void access$500(Event event, Parcel parcel)
		{
			event.writeToParcel(parcel);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #104 <Method void writeToParcel(Parcel)>
			return;
		//    3    5:return          
		}

*/

		private Event(long l, boolean flag, boolean flag1, boolean flag2, List list, long l1, boolean flag3, long l2, int i, int j, int k)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #28  <Method void Object()>
			spliceEventId = l;
		//    2    4:aload_0         
		//    3    5:lload_1         
		//    4    6:putfield        #30  <Field long spliceEventId>
			spliceEventCancelIndicator = flag;
		//    5    9:aload_0         
		//    6   10:iload_3         
		//    7   11:putfield        #32  <Field boolean spliceEventCancelIndicator>
			outOfNetworkIndicator = flag1;
		//    8   14:aload_0         
		//    9   15:iload           4
		//   10   17:putfield        #34  <Field boolean outOfNetworkIndicator>
			programSpliceFlag = flag2;
		//   11   20:aload_0         
		//   12   21:iload           5
		//   13   23:putfield        #36  <Field boolean programSpliceFlag>
			componentSpliceList = Collections.unmodifiableList(list);
		//   14   26:aload_0         
		//   15   27:aload           6
		//   16   29:invokestatic    #42  <Method List Collections.unmodifiableList(List)>
		//   17   32:putfield        #44  <Field List componentSpliceList>
			utcSpliceTime = l1;
		//   18   35:aload_0         
		//   19   36:lload           7
		//   20   38:putfield        #46  <Field long utcSpliceTime>
			autoReturn = flag3;
		//   21   41:aload_0         
		//   22   42:iload           9
		//   23   44:putfield        #48  <Field boolean autoReturn>
			breakDurationUs = l2;
		//   24   47:aload_0         
		//   25   48:lload           10
		//   26   50:putfield        #50  <Field long breakDurationUs>
			uniqueProgramId = i;
		//   27   53:aload_0         
		//   28   54:iload           12
		//   29   56:putfield        #52  <Field int uniqueProgramId>
			availNum = j;
		//   30   59:aload_0         
		//   31   60:iload           13
		//   32   62:putfield        #54  <Field int availNum>
			availsExpected = k;
		//   33   65:aload_0         
		//   34   66:iload           14
		//   35   68:putfield        #56  <Field int availsExpected>
		//   36   71:return          
		}

		private Event(Parcel parcel)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #28  <Method void Object()>
			spliceEventId = parcel.readLong();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #66  <Method long Parcel.readLong()>
		//    5    9:putfield        #30  <Field long spliceEventId>
			byte byte0 = parcel.readByte();
		//    6   12:aload_1         
		//    7   13:invokevirtual   #70  <Method byte Parcel.readByte()>
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
		//   21   37:putfield        #32  <Field boolean spliceEventCancelIndicator>
			if(parcel.readByte() == 1)
		//*  22   40:aload_1         
		//*  23   41:invokevirtual   #70  <Method byte Parcel.readByte()>
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
		//   33   60:putfield        #34  <Field boolean outOfNetworkIndicator>
			if(parcel.readByte() == 1)
		//*  34   63:aload_1         
		//*  35   64:invokevirtual   #70  <Method byte Parcel.readByte()>
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
		//   45   83:putfield        #36  <Field boolean programSpliceFlag>
			int j = parcel.readInt();
		//   46   86:aload_1         
		//   47   87:invokevirtual   #74  <Method int Parcel.readInt()>
		//   48   90:istore_3        
			ArrayList arraylist = new ArrayList(j);
		//   49   91:new             #76  <Class ArrayList>
		//   50   94:dup             
		//   51   95:iload_3         
		//   52   96:invokespecial   #79  <Method void ArrayList(int)>
		//   53   99:astore          6
			for(int i = 0; i < j; i++)
		//*  54  101:iconst_0        
		//*  55  102:istore_2        
		//*  56  103:iload_2         
		//*  57  104:iload_3         
		//*  58  105:icmpge          125
				arraylist.add(((Object) (ComponentSplice.createFromParcel(parcel))));
		//   59  108:aload           6
		//   60  110:aload_1         
		//   61  111:invokestatic    #85  <Method SpliceScheduleCommand$ComponentSplice SpliceScheduleCommand$ComponentSplice.access$000(Parcel)>
		//   62  114:invokevirtual   #89  <Method boolean ArrayList.add(Object)>
		//   63  117:pop             

		//   64  118:iload_2         
		//   65  119:iconst_1        
		//   66  120:iadd            
		//   67  121:istore_2        
		//*  68  122:goto            103
			componentSpliceList = Collections.unmodifiableList(((List) (arraylist)));
		//   69  125:aload_0         
		//   70  126:aload           6
		//   71  128:invokestatic    #42  <Method List Collections.unmodifiableList(List)>
		//   72  131:putfield        #44  <Field List componentSpliceList>
			utcSpliceTime = parcel.readLong();
		//   73  134:aload_0         
		//   74  135:aload_1         
		//   75  136:invokevirtual   #66  <Method long Parcel.readLong()>
		//   76  139:putfield        #46  <Field long utcSpliceTime>
			flag = flag1;
		//   77  142:iload           5
		//   78  144:istore          4
			if(parcel.readByte() == 1)
		//*  79  146:aload_1         
		//*  80  147:invokevirtual   #70  <Method byte Parcel.readByte()>
		//*  81  150:iconst_1        
		//*  82  151:icmpne          157
				flag = true;
		//   83  154:iconst_1        
		//   84  155:istore          4
			autoReturn = flag;
		//   85  157:aload_0         
		//   86  158:iload           4
		//   87  160:putfield        #48  <Field boolean autoReturn>
			breakDurationUs = parcel.readLong();
		//   88  163:aload_0         
		//   89  164:aload_1         
		//   90  165:invokevirtual   #66  <Method long Parcel.readLong()>
		//   91  168:putfield        #50  <Field long breakDurationUs>
			uniqueProgramId = parcel.readInt();
		//   92  171:aload_0         
		//   93  172:aload_1         
		//   94  173:invokevirtual   #74  <Method int Parcel.readInt()>
		//   95  176:putfield        #52  <Field int uniqueProgramId>
			availNum = parcel.readInt();
		//   96  179:aload_0         
		//   97  180:aload_1         
		//   98  181:invokevirtual   #74  <Method int Parcel.readInt()>
		//   99  184:putfield        #54  <Field int availNum>
			availsExpected = parcel.readInt();
		//  100  187:aload_0         
		//  101  188:aload_1         
		//  102  189:invokevirtual   #74  <Method int Parcel.readInt()>
		//  103  192:putfield        #56  <Field int availsExpected>
		//  104  195:return          
		}
	}


	private SpliceScheduleCommand(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void SpliceCommand()>
		int j = parcel.readInt();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #34  <Method int Parcel.readInt()>
	//    4    8:istore_3        
		ArrayList arraylist = new ArrayList(j);
	//    5    9:new             #36  <Class ArrayList>
	//    6   12:dup             
	//    7   13:iload_3         
	//    8   14:invokespecial   #39  <Method void ArrayList(int)>
	//    9   17:astore          4
		for(int i = 0; i < j; i++)
	//*  10   19:iconst_0        
	//*  11   20:istore_2        
	//*  12   21:iload_2         
	//*  13   22:iload_3         
	//*  14   23:icmpge          43
			arraylist.add(((Object) (Event.createFromParcel(parcel))));
	//   15   26:aload           4
	//   16   28:aload_1         
	//   17   29:invokestatic    #43  <Method SpliceScheduleCommand$Event SpliceScheduleCommand$Event.access$300(Parcel)>
	//   18   32:invokevirtual   #47  <Method boolean ArrayList.add(Object)>
	//   19   35:pop             

	//   20   36:iload_2         
	//   21   37:iconst_1        
	//   22   38:iadd            
	//   23   39:istore_2        
	//*  24   40:goto            21
		events = Collections.unmodifiableList(((List) (arraylist)));
	//   25   43:aload_0         
	//   26   44:aload           4
	//   27   46:invokestatic    #53  <Method List Collections.unmodifiableList(List)>
	//   28   49:putfield        #55  <Field List events>
	//   29   52:return          
	}


	private SpliceScheduleCommand(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void SpliceCommand()>
		events = Collections.unmodifiableList(list);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #53  <Method List Collections.unmodifiableList(List)>
	//    5    9:putfield        #55  <Field List events>
	//    6   12:return          
	}

	static SpliceScheduleCommand parseFromSection(ParsableByteArray parsablebytearray)
	{
		int j = parsablebytearray.readUnsignedByte();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #68  <Method int ParsableByteArray.readUnsignedByte()>
	//    2    4:istore_2        
		ArrayList arraylist = new ArrayList(j);
	//    3    5:new             #36  <Class ArrayList>
	//    4    8:dup             
	//    5    9:iload_2         
	//    6   10:invokespecial   #39  <Method void ArrayList(int)>
	//    7   13:astore_3        
		for(int i = 0; i < j; i++)
	//*   8   14:iconst_0        
	//*   9   15:istore_1        
	//*  10   16:iload_1         
	//*  11   17:iload_2         
	//*  12   18:icmpge          37
			arraylist.add(((Object) (Event.parseFromSection(parsablebytearray))));
	//   13   21:aload_3         
	//   14   22:aload_0         
	//   15   23:invokestatic    #72  <Method SpliceScheduleCommand$Event SpliceScheduleCommand$Event.access$400(ParsableByteArray)>
	//   16   26:invokevirtual   #47  <Method boolean ArrayList.add(Object)>
	//   17   29:pop             

	//   18   30:iload_1         
	//   19   31:iconst_1        
	//   20   32:iadd            
	//   21   33:istore_1        
	//*  22   34:goto            16
		return new SpliceScheduleCommand(((List) (arraylist)));
	//   23   37:new             #2   <Class SpliceScheduleCommand>
	//   24   40:dup             
	//   25   41:aload_3         
	//   26   42:invokespecial   #74  <Method void SpliceScheduleCommand(List)>
	//   27   45:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = events.size();
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field List events>
	//    2    4:invokeinterface #81  <Method int List.size()>
	//    3    9:istore_3        
		parcel.writeInt(j);
	//    4   10:aload_1         
	//    5   11:iload_3         
	//    6   12:invokevirtual   #84  <Method void Parcel.writeInt(int)>
		for(i = 0; i < j; i++)
	//*   7   15:iconst_0        
	//*   8   16:istore_2        
	//*   9   17:iload_2         
	//*  10   18:iload_3         
	//*  11   19:icmpge          46
			((Event)events.get(i)).writeToParcel(parcel);
	//   12   22:aload_0         
	//   13   23:getfield        #55  <Field List events>
	//   14   26:iload_2         
	//   15   27:invokeinterface #88  <Method Object List.get(int)>
	//   16   32:checkcast       #11  <Class SpliceScheduleCommand$Event>
	//   17   35:aload_1         
	//   18   36:invokestatic    #92  <Method void SpliceScheduleCommand$Event.access$500(SpliceScheduleCommand$Event, Parcel)>

	//   19   39:iload_2         
	//   20   40:iconst_1        
	//   21   41:iadd            
	//   22   42:istore_2        
	//*  23   43:goto            17
	//   24   46:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public SpliceScheduleCommand createFromParcel(Parcel parcel)
		{
			return new SpliceScheduleCommand(parcel);
		//    0    0:new             #9   <Class SpliceScheduleCommand>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #19  <Method void SpliceScheduleCommand(Parcel, SpliceScheduleCommand$1)>
		//    5    9:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method SpliceScheduleCommand createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public SpliceScheduleCommand[] newArray(int i)
		{
			return new SpliceScheduleCommand[i];
		//    0    0:iload_1         
		//    1    1:anewarray       SpliceScheduleCommand[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method SpliceScheduleCommand[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public final List events;

	static 
	{
	//    0    0:new             #6   <Class SpliceScheduleCommand$1>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void SpliceScheduleCommand$1()>
	//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
