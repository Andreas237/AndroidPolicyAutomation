// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.metadata.scte35;

import com.google.android.exoplayer2.metadata.*;
import com.google.android.exoplayer2.util.*;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.exoplayer2.metadata.scte35:
//			TimeSignalCommand, SpliceInsertCommand, SpliceScheduleCommand, PrivateCommand, 
//			SpliceNullCommand

public final class SpliceInfoDecoder
	implements MetadataDecoder
{

	public SpliceInfoDecoder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #29  <Class ParsableByteArray>
	//    4    8:dup             
	//    5    9:invokespecial   #30  <Method void ParsableByteArray()>
	//    6   12:putfield        #32  <Field ParsableByteArray sectionData>
	//    7   15:aload_0         
	//    8   16:new             #34  <Class ParsableBitArray>
	//    9   19:dup             
	//   10   20:invokespecial   #35  <Method void ParsableBitArray()>
	//   11   23:putfield        #37  <Field ParsableBitArray sectionHeader>
	//   12   26:return          
	}

	public Metadata decode(MetadataInputBuffer metadatainputbuffer)
		throws MetadataDecoderException
	{
		if(timestampAdjuster == null || metadatainputbuffer.subsampleOffsetUs != timestampAdjuster.getTimestampOffsetUs())
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field TimestampAdjuster timestampAdjuster>
	//*   2    4:ifnull          22
	//*   3    7:aload_1         
	//*   4    8:getfield        #50  <Field long MetadataInputBuffer.subsampleOffsetUs>
	//*   5   11:aload_0         
	//*   6   12:getfield        #44  <Field TimestampAdjuster timestampAdjuster>
	//*   7   15:invokevirtual   #56  <Method long TimestampAdjuster.getTimestampOffsetUs()>
	//*   8   18:lcmp            
	//*   9   19:ifeq            54
		{
			timestampAdjuster = new TimestampAdjuster(metadatainputbuffer.timeUs);
	//   10   22:aload_0         
	//   11   23:new             #52  <Class TimestampAdjuster>
	//   12   26:dup             
	//   13   27:aload_1         
	//   14   28:getfield        #59  <Field long MetadataInputBuffer.timeUs>
	//   15   31:invokespecial   #62  <Method void TimestampAdjuster(long)>
	//   16   34:putfield        #44  <Field TimestampAdjuster timestampAdjuster>
			timestampAdjuster.adjustSampleTimestamp(metadatainputbuffer.timeUs - metadatainputbuffer.subsampleOffsetUs);
	//   17   37:aload_0         
	//   18   38:getfield        #44  <Field TimestampAdjuster timestampAdjuster>
	//   19   41:aload_1         
	//   20   42:getfield        #59  <Field long MetadataInputBuffer.timeUs>
	//   21   45:aload_1         
	//   22   46:getfield        #50  <Field long MetadataInputBuffer.subsampleOffsetUs>
	//   23   49:lsub            
	//   24   50:invokevirtual   #66  <Method long TimestampAdjuster.adjustSampleTimestamp(long)>
	//   25   53:pop2            
		}
		metadatainputbuffer = ((MetadataInputBuffer) (metadatainputbuffer.data));
	//   26   54:aload_1         
	//   27   55:getfield        #70  <Field ByteBuffer MetadataInputBuffer.data>
	//   28   58:astore_1        
		byte abyte0[] = ((ByteBuffer) (metadatainputbuffer)).array();
	//   29   59:aload_1         
	//   30   60:invokevirtual   #76  <Method byte[] ByteBuffer.array()>
	//   31   63:astore          6
		int i = ((ByteBuffer) (metadatainputbuffer)).limit();
	//   32   65:aload_1         
	//   33   66:invokevirtual   #80  <Method int ByteBuffer.limit()>
	//   34   69:istore_2        
		sectionData.reset(abyte0, i);
	//   35   70:aload_0         
	//   36   71:getfield        #32  <Field ParsableByteArray sectionData>
	//   37   74:aload           6
	//   38   76:iload_2         
	//   39   77:invokevirtual   #84  <Method void ParsableByteArray.reset(byte[], int)>
		sectionHeader.reset(abyte0, i);
	//   40   80:aload_0         
	//   41   81:getfield        #37  <Field ParsableBitArray sectionHeader>
	//   42   84:aload           6
	//   43   86:iload_2         
	//   44   87:invokevirtual   #85  <Method void ParsableBitArray.reset(byte[], int)>
		sectionHeader.skipBits(39);
	//   45   90:aload_0         
	//   46   91:getfield        #37  <Field ParsableBitArray sectionHeader>
	//   47   94:bipush          39
	//   48   96:invokevirtual   #89  <Method void ParsableBitArray.skipBits(int)>
		long l = (long)sectionHeader.readBits(1) << 32 | (long)sectionHeader.readBits(32);
	//   49   99:aload_0         
	//   50  100:getfield        #37  <Field ParsableBitArray sectionHeader>
	//   51  103:iconst_1        
	//   52  104:invokevirtual   #93  <Method int ParsableBitArray.readBits(int)>
	//   53  107:i2l             
	//   54  108:bipush          32
	//   55  110:lshl            
	//   56  111:aload_0         
	//   57  112:getfield        #37  <Field ParsableBitArray sectionHeader>
	//   58  115:bipush          32
	//   59  117:invokevirtual   #93  <Method int ParsableBitArray.readBits(int)>
	//   60  120:i2l             
	//   61  121:lor             
	//   62  122:lstore          4
		sectionHeader.skipBits(20);
	//   63  124:aload_0         
	//   64  125:getfield        #37  <Field ParsableBitArray sectionHeader>
	//   65  128:bipush          20
	//   66  130:invokevirtual   #89  <Method void ParsableBitArray.skipBits(int)>
		i = sectionHeader.readBits(12);
	//   67  133:aload_0         
	//   68  134:getfield        #37  <Field ParsableBitArray sectionHeader>
	//   69  137:bipush          12
	//   70  139:invokevirtual   #93  <Method int ParsableBitArray.readBits(int)>
	//   71  142:istore_2        
		int j = sectionHeader.readBits(8);
	//   72  143:aload_0         
	//   73  144:getfield        #37  <Field ParsableBitArray sectionHeader>
	//   74  147:bipush          8
	//   75  149:invokevirtual   #93  <Method int ParsableBitArray.readBits(int)>
	//   76  152:istore_3        
		metadatainputbuffer = null;
	//   77  153:aconst_null     
	//   78  154:astore_1        
		sectionData.skipBytes(14);
	//   79  155:aload_0         
	//   80  156:getfield        #32  <Field ParsableByteArray sectionData>
	//   81  159:bipush          14
	//   82  161:invokevirtual   #96  <Method void ParsableByteArray.skipBytes(int)>
		if(j != 0)
	//*  83  164:iload_3         
	//*  84  165:ifeq            266
		{
			if(j != 255)
	//*  85  168:iload_3         
	//*  86  169:sipush          255
	//*  87  172:icmpeq          252
				switch(j)
	//*  88  175:iload_3         
				{
	//*  89  176:tableswitch     4 6: default 204
	//	               4 241
	//	               5 224
	//	               6 207
	//*  90  204:goto            274
				case 6: // '\006'
					metadatainputbuffer = ((MetadataInputBuffer) (TimeSignalCommand.parseFromSection(sectionData, l, timestampAdjuster)));
	//   91  207:aload_0         
	//   92  208:getfield        #32  <Field ParsableByteArray sectionData>
	//   93  211:lload           4
	//   94  213:aload_0         
	//   95  214:getfield        #44  <Field TimestampAdjuster timestampAdjuster>
	//   96  217:invokestatic    #102 <Method TimeSignalCommand TimeSignalCommand.parseFromSection(ParsableByteArray, long, TimestampAdjuster)>
	//   97  220:astore_1        
					break;

	//*  98  221:goto            274
				case 5: // '\005'
					metadatainputbuffer = ((MetadataInputBuffer) (SpliceInsertCommand.parseFromSection(sectionData, l, timestampAdjuster)));
	//   99  224:aload_0         
	//  100  225:getfield        #32  <Field ParsableByteArray sectionData>
	//  101  228:lload           4
	//  102  230:aload_0         
	//  103  231:getfield        #44  <Field TimestampAdjuster timestampAdjuster>
	//  104  234:invokestatic    #107 <Method SpliceInsertCommand SpliceInsertCommand.parseFromSection(ParsableByteArray, long, TimestampAdjuster)>
	//  105  237:astore_1        
					break;

	//* 106  238:goto            274
				case 4: // '\004'
					metadatainputbuffer = ((MetadataInputBuffer) (SpliceScheduleCommand.parseFromSection(sectionData)));
	//  107  241:aload_0         
	//  108  242:getfield        #32  <Field ParsableByteArray sectionData>
	//  109  245:invokestatic    #112 <Method SpliceScheduleCommand SpliceScheduleCommand.parseFromSection(ParsableByteArray)>
	//  110  248:astore_1        
					break;
				}
			else
	//* 111  249:goto            274
				metadatainputbuffer = ((MetadataInputBuffer) (PrivateCommand.parseFromSection(sectionData, i, l)));
	//  112  252:aload_0         
	//  113  253:getfield        #32  <Field ParsableByteArray sectionData>
	//  114  256:iload_2         
	//  115  257:lload           4
	//  116  259:invokestatic    #117 <Method PrivateCommand PrivateCommand.parseFromSection(ParsableByteArray, int, long)>
	//  117  262:astore_1        
		} else
	//* 118  263:goto            274
		{
			metadatainputbuffer = ((MetadataInputBuffer) (new SpliceNullCommand()));
	//  119  266:new             #119 <Class SpliceNullCommand>
	//  120  269:dup             
	//  121  270:invokespecial   #120 <Method void SpliceNullCommand()>
	//  122  273:astore_1        
		}
		if(metadatainputbuffer == null)
	//* 123  274:aload_1         
	//* 124  275:ifnonnull       290
			return new Metadata(new com.google.android.exoplayer2.metadata.Metadata.Entry[0]);
	//  125  278:new             #122 <Class Metadata>
	//  126  281:dup             
	//  127  282:iconst_0        
	//  128  283:anewarray       com.google.android.exoplayer2.metadata.Metadata.Entry[]
	//  129  286:invokespecial   #127 <Method void Metadata(com.google.android.exoplayer2.metadata.Metadata$Entry[])>
	//  130  289:areturn         
		else
			return new Metadata(new com.google.android.exoplayer2.metadata.Metadata.Entry[] {
				metadatainputbuffer
			});
	//  131  290:new             #122 <Class Metadata>
	//  132  293:dup             
	//  133  294:iconst_1        
	//  134  295:anewarray       com.google.android.exoplayer2.metadata.Metadata.Entry[]
	//  135  298:dup             
	//  136  299:iconst_0        
	//  137  300:aload_1         
	//  138  301:aastore         
	//  139  302:invokespecial   #127 <Method void Metadata(com.google.android.exoplayer2.metadata.Metadata$Entry[])>
	//  140  305:areturn         
	}

	private static final int TYPE_PRIVATE_COMMAND = 255;
	private static final int TYPE_SPLICE_INSERT = 5;
	private static final int TYPE_SPLICE_NULL = 0;
	private static final int TYPE_SPLICE_SCHEDULE = 4;
	private static final int TYPE_TIME_SIGNAL = 6;
	private final ParsableByteArray sectionData = new ParsableByteArray();
	private final ParsableBitArray sectionHeader = new ParsableBitArray();
	private TimestampAdjuster timestampAdjuster;
}
