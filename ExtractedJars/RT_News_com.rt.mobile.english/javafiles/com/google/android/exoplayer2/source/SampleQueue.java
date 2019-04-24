// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.CryptoInfo;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.upstream.Allocation;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.exoplayer2.source:
//			SampleMetadataQueue

public final class SampleQueue
	implements TrackOutput
{
	private static final class AllocationNode
	{

		public AllocationNode clear()
		{
			allocation = null;
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:putfield        #31  <Field Allocation allocation>
			AllocationNode allocationnode = next;
		//    3    5:aload_0         
		//    4    6:getfield        #33  <Field SampleQueue$AllocationNode next>
		//    5    9:astore_1        
			next = null;
		//    6   10:aload_0         
		//    7   11:aconst_null     
		//    8   12:putfield        #33  <Field SampleQueue$AllocationNode next>
			return allocationnode;
		//    9   15:aload_1         
		//   10   16:areturn         
		}

		public void initialize(Allocation allocation1, AllocationNode allocationnode)
		{
			allocation = allocation1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #31  <Field Allocation allocation>
			next = allocationnode;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #33  <Field SampleQueue$AllocationNode next>
			wasInitialized = true;
		//    6   10:aload_0         
		//    7   11:iconst_1        
		//    8   12:putfield        #37  <Field boolean wasInitialized>
		//    9   15:return          
		}

		public int translateOffset(long l)
		{
			return (int)(l - startPosition) + allocation.offset;
		//    0    0:lload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #24  <Field long startPosition>
		//    3    5:lsub            
		//    4    6:l2i             
		//    5    7:aload_0         
		//    6    8:getfield        #31  <Field Allocation allocation>
		//    7   11:getfield        #45  <Field int Allocation.offset>
		//    8   14:iadd            
		//    9   15:ireturn         
		}

		public Allocation allocation;
		public final long endPosition;
		public AllocationNode next;
		public final long startPosition;
		public boolean wasInitialized;

		public AllocationNode(long l, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			startPosition = l;
		//    2    4:aload_0         
		//    3    5:lload_1         
		//    4    6:putfield        #24  <Field long startPosition>
			endPosition = l + (long)i;
		//    5    9:aload_0         
		//    6   10:lload_1         
		//    7   11:iload_3         
		//    8   12:i2l             
		//    9   13:ladd            
		//   10   14:putfield        #26  <Field long endPosition>
		//   11   17:return          
		}
	}

	public static interface UpstreamFormatChangedListener
	{

		public abstract void onUpstreamFormatChanged(Format format1);
	}


	public SampleQueue(Allocator allocator1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
		allocator = allocator1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #48  <Field Allocator allocator>
		allocationLength = allocator1.getIndividualAllocationLength();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokeinterface #54  <Method int Allocator.getIndividualAllocationLength()>
	//    8   16:putfield        #56  <Field int allocationLength>
	//    9   19:aload_0         
	//   10   20:new             #58  <Class SampleMetadataQueue>
	//   11   23:dup             
	//   12   24:invokespecial   #59  <Method void SampleMetadataQueue()>
	//   13   27:putfield        #61  <Field SampleMetadataQueue metadataQueue>
	//   14   30:aload_0         
	//   15   31:new             #63  <Class SampleMetadataQueue$SampleExtrasHolder>
	//   16   34:dup             
	//   17   35:invokespecial   #64  <Method void SampleMetadataQueue$SampleExtrasHolder()>
	//   18   38:putfield        #66  <Field SampleMetadataQueue$SampleExtrasHolder extrasHolder>
	//   19   41:aload_0         
	//   20   42:new             #68  <Class ParsableByteArray>
	//   21   45:dup             
	//   22   46:bipush          32
	//   23   48:invokespecial   #71  <Method void ParsableByteArray(int)>
	//   24   51:putfield        #73  <Field ParsableByteArray scratch>
		firstAllocationNode = new AllocationNode(0L, allocationLength);
	//   25   54:aload_0         
	//   26   55:new             #8   <Class SampleQueue$AllocationNode>
	//   27   58:dup             
	//   28   59:lconst_0        
	//   29   60:aload_0         
	//   30   61:getfield        #56  <Field int allocationLength>
	//   31   64:invokespecial   #76  <Method void SampleQueue$AllocationNode(long, int)>
	//   32   67:putfield        #78  <Field SampleQueue$AllocationNode firstAllocationNode>
		readAllocationNode = firstAllocationNode;
	//   33   70:aload_0         
	//   34   71:aload_0         
	//   35   72:getfield        #78  <Field SampleQueue$AllocationNode firstAllocationNode>
	//   36   75:putfield        #80  <Field SampleQueue$AllocationNode readAllocationNode>
		writeAllocationNode = firstAllocationNode;
	//   37   78:aload_0         
	//   38   79:aload_0         
	//   39   80:getfield        #78  <Field SampleQueue$AllocationNode firstAllocationNode>
	//   40   83:putfield        #82  <Field SampleQueue$AllocationNode writeAllocationNode>
	//   41   86:return          
	}

	private void advanceReadTo(long l)
	{
		for(; l >= readAllocationNode.endPosition; readAllocationNode = readAllocationNode.next);
	//    0    0:lload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #80  <Field SampleQueue$AllocationNode readAllocationNode>
	//    3    5:getfield        #88  <Field long SampleQueue$AllocationNode.endPosition>
	//    4    8:lcmp            
	//    5    9:iflt            26
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #80  <Field SampleQueue$AllocationNode readAllocationNode>
	//    9   17:getfield        #91  <Field SampleQueue$AllocationNode SampleQueue$AllocationNode.next>
	//   10   20:putfield        #80  <Field SampleQueue$AllocationNode readAllocationNode>
	//*  11   23:goto            0
	//   12   26:return          
	}

	private void clearAllocationNodes(AllocationNode allocationnode)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:539)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s2stmt(TypeTransformer.java:820)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:843)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #95  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #97  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:539)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s2stmt(TypeTransformer.java:820)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:843)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #102 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	private void discardDownstreamTo(long l)
	{
		if(l == -1L)
	//*   0    0:lload_1         
	//*   1    1:ldc2w           #104 <Long -1L>
	//*   2    4:lcmp            
	//*   3    5:ifne            9
			return;
	//    4    8:return          
		for(; l >= firstAllocationNode.endPosition; firstAllocationNode = firstAllocationNode.clear())
	//*   5    9:lload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #78  <Field SampleQueue$AllocationNode firstAllocationNode>
	//*   8   14:getfield        #88  <Field long SampleQueue$AllocationNode.endPosition>
	//*   9   17:lcmp            
	//*  10   18:iflt            51
			allocator.release(firstAllocationNode.allocation);
	//   11   21:aload_0         
	//   12   22:getfield        #48  <Field Allocator allocator>
	//   13   25:aload_0         
	//   14   26:getfield        #78  <Field SampleQueue$AllocationNode firstAllocationNode>
	//   15   29:getfield        #109 <Field Allocation SampleQueue$AllocationNode.allocation>
	//   16   32:invokeinterface #113 <Method void Allocator.release(Allocation)>

	//   17   37:aload_0         
	//   18   38:aload_0         
	//   19   39:getfield        #78  <Field SampleQueue$AllocationNode firstAllocationNode>
	//   20   42:invokevirtual   #117 <Method SampleQueue$AllocationNode SampleQueue$AllocationNode.clear()>
	//   21   45:putfield        #78  <Field SampleQueue$AllocationNode firstAllocationNode>
	//*  22   48:goto            9
		if(readAllocationNode.startPosition < firstAllocationNode.startPosition)
	//*  23   51:aload_0         
	//*  24   52:getfield        #80  <Field SampleQueue$AllocationNode readAllocationNode>
	//*  25   55:getfield        #120 <Field long SampleQueue$AllocationNode.startPosition>
	//*  26   58:aload_0         
	//*  27   59:getfield        #78  <Field SampleQueue$AllocationNode firstAllocationNode>
	//*  28   62:getfield        #120 <Field long SampleQueue$AllocationNode.startPosition>
	//*  29   65:lcmp            
	//*  30   66:ifge            77
			readAllocationNode = firstAllocationNode;
	//   31   69:aload_0         
	//   32   70:aload_0         
	//   33   71:getfield        #78  <Field SampleQueue$AllocationNode firstAllocationNode>
	//   34   74:putfield        #80  <Field SampleQueue$AllocationNode readAllocationNode>
	//   35   77:return          
	}

	private static Format getAdjustedSampleFormat(Format format1, long l)
	{
		if(format1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		Format format2 = format1;
	//    4    6:aload_0         
	//    5    7:astore_3        
		if(l != 0L)
	//*   6    8:lload_1         
	//*   7    9:lconst_0        
	//*   8   10:lcmp            
	//*   9   11:ifeq            38
		{
			format2 = format1;
	//   10   14:aload_0         
	//   11   15:astore_3        
			if(format1.subsampleOffsetUs != 0xffffffffL)
	//*  12   16:aload_0         
	//*  13   17:getfield        #127 <Field long Format.subsampleOffsetUs>
	//*  14   20:ldc2w           #128 <Long 0xffffffffL>
	//*  15   23:lcmp            
	//*  16   24:ifeq            38
				format2 = format1.copyWithSubsampleOffsetUs(format1.subsampleOffsetUs + l);
	//   17   27:aload_0         
	//   18   28:aload_0         
	//   19   29:getfield        #127 <Field long Format.subsampleOffsetUs>
	//   20   32:lload_1         
	//   21   33:ladd            
	//   22   34:invokevirtual   #133 <Method Format Format.copyWithSubsampleOffsetUs(long)>
	//   23   37:astore_3        
		}
		return format2;
	//   24   38:aload_3         
	//   25   39:areturn         
	}

	private void postAppend(int i)
	{
		totalBytesWritten = totalBytesWritten + (long)i;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #136 <Field long totalBytesWritten>
	//    3    5:iload_1         
	//    4    6:i2l             
	//    5    7:ladd            
	//    6    8:putfield        #136 <Field long totalBytesWritten>
		if(totalBytesWritten == writeAllocationNode.endPosition)
	//*   7   11:aload_0         
	//*   8   12:getfield        #136 <Field long totalBytesWritten>
	//*   9   15:aload_0         
	//*  10   16:getfield        #82  <Field SampleQueue$AllocationNode writeAllocationNode>
	//*  11   19:getfield        #88  <Field long SampleQueue$AllocationNode.endPosition>
	//*  12   22:lcmp            
	//*  13   23:ifne            37
			writeAllocationNode = writeAllocationNode.next;
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #82  <Field SampleQueue$AllocationNode writeAllocationNode>
	//   17   31:getfield        #91  <Field SampleQueue$AllocationNode SampleQueue$AllocationNode.next>
	//   18   34:putfield        #82  <Field SampleQueue$AllocationNode writeAllocationNode>
	//   19   37:return          
	}

	private int preAppend(int i)
	{
		if(!writeAllocationNode.wasInitialized)
	//*   0    0:aload_0         
	//*   1    1:getfield        #82  <Field SampleQueue$AllocationNode writeAllocationNode>
	//*   2    4:getfield        #141 <Field boolean SampleQueue$AllocationNode.wasInitialized>
	//*   3    7:ifne            44
			writeAllocationNode.initialize(allocator.allocate(), new AllocationNode(writeAllocationNode.endPosition, allocationLength));
	//    4   10:aload_0         
	//    5   11:getfield        #82  <Field SampleQueue$AllocationNode writeAllocationNode>
	//    6   14:aload_0         
	//    7   15:getfield        #48  <Field Allocator allocator>
	//    8   18:invokeinterface #145 <Method Allocation Allocator.allocate()>
	//    9   23:new             #8   <Class SampleQueue$AllocationNode>
	//   10   26:dup             
	//   11   27:aload_0         
	//   12   28:getfield        #82  <Field SampleQueue$AllocationNode writeAllocationNode>
	//   13   31:getfield        #88  <Field long SampleQueue$AllocationNode.endPosition>
	//   14   34:aload_0         
	//   15   35:getfield        #56  <Field int allocationLength>
	//   16   38:invokespecial   #76  <Method void SampleQueue$AllocationNode(long, int)>
	//   17   41:invokevirtual   #149 <Method void SampleQueue$AllocationNode.initialize(Allocation, SampleQueue$AllocationNode)>
		return Math.min(i, (int)(writeAllocationNode.endPosition - totalBytesWritten));
	//   18   44:iload_1         
	//   19   45:aload_0         
	//   20   46:getfield        #82  <Field SampleQueue$AllocationNode writeAllocationNode>
	//   21   49:getfield        #88  <Field long SampleQueue$AllocationNode.endPosition>
	//   22   52:aload_0         
	//   23   53:getfield        #136 <Field long totalBytesWritten>
	//   24   56:lsub            
	//   25   57:l2i             
	//   26   58:invokestatic    #155 <Method int Math.min(int, int)>
	//   27   61:ireturn         
	}

	private void readData(long l, ByteBuffer bytebuffer, int i)
	{
		advanceReadTo(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #159 <Method void advanceReadTo(long)>
		do
		{
			if(i <= 0)
				break;
	//    3    5:iload           4
	//    4    7:ifle            91
			int j = Math.min(i, (int)(readAllocationNode.endPosition - l));
	//    5   10:iload           4
	//    6   12:aload_0         
	//    7   13:getfield        #80  <Field SampleQueue$AllocationNode readAllocationNode>
	//    8   16:getfield        #88  <Field long SampleQueue$AllocationNode.endPosition>
	//    9   19:lload_1         
	//   10   20:lsub            
	//   11   21:l2i             
	//   12   22:invokestatic    #155 <Method int Math.min(int, int)>
	//   13   25:istore          5
			bytebuffer.put(readAllocationNode.allocation.data, readAllocationNode.translateOffset(l), j);
	//   14   27:aload_3         
	//   15   28:aload_0         
	//   16   29:getfield        #80  <Field SampleQueue$AllocationNode readAllocationNode>
	//   17   32:getfield        #109 <Field Allocation SampleQueue$AllocationNode.allocation>
	//   18   35:getfield        #165 <Field byte[] Allocation.data>
	//   19   38:aload_0         
	//   20   39:getfield        #80  <Field SampleQueue$AllocationNode readAllocationNode>
	//   21   42:lload_1         
	//   22   43:invokevirtual   #169 <Method int SampleQueue$AllocationNode.translateOffset(long)>
	//   23   46:iload           5
	//   24   48:invokevirtual   #175 <Method ByteBuffer ByteBuffer.put(byte[], int, int)>
	//   25   51:pop             
			i -= j;
	//   26   52:iload           4
	//   27   54:iload           5
	//   28   56:isub            
	//   29   57:istore          4
			l += j;
	//   30   59:lload_1         
	//   31   60:iload           5
	//   32   62:i2l             
	//   33   63:ladd            
	//   34   64:lstore_1        
			if(l == readAllocationNode.endPosition)
	//*  35   65:lload_1         
	//*  36   66:aload_0         
	//*  37   67:getfield        #80  <Field SampleQueue$AllocationNode readAllocationNode>
	//*  38   70:getfield        #88  <Field long SampleQueue$AllocationNode.endPosition>
	//*  39   73:lcmp            
	//*  40   74:ifne            88
				readAllocationNode = readAllocationNode.next;
	//   41   77:aload_0         
	//   42   78:aload_0         
	//   43   79:getfield        #80  <Field SampleQueue$AllocationNode readAllocationNode>
	//   44   82:getfield        #91  <Field SampleQueue$AllocationNode SampleQueue$AllocationNode.next>
	//   45   85:putfield        #80  <Field SampleQueue$AllocationNode readAllocationNode>
		} while(true);
	//   46   88:goto            5
	//   47   91:return          
	}

	private void readData(long l, byte abyte0[], int i)
	{
		advanceReadTo(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #159 <Method void advanceReadTo(long)>
		int j = i;
	//    3    5:iload           4
	//    4    7:istore          5
		do
		{
			if(j <= 0)
				break;
	//    5    9:iload           5
	//    6   11:ifle            99
			int k = Math.min(j, (int)(readAllocationNode.endPosition - l));
	//    7   14:iload           5
	//    8   16:aload_0         
	//    9   17:getfield        #80  <Field SampleQueue$AllocationNode readAllocationNode>
	//   10   20:getfield        #88  <Field long SampleQueue$AllocationNode.endPosition>
	//   11   23:lload_1         
	//   12   24:lsub            
	//   13   25:l2i             
	//   14   26:invokestatic    #155 <Method int Math.min(int, int)>
	//   15   29:istore          6
			System.arraycopy(((Object) (readAllocationNode.allocation.data)), readAllocationNode.translateOffset(l), ((Object) (abyte0)), i - j, k);
	//   16   31:aload_0         
	//   17   32:getfield        #80  <Field SampleQueue$AllocationNode readAllocationNode>
	//   18   35:getfield        #109 <Field Allocation SampleQueue$AllocationNode.allocation>
	//   19   38:getfield        #165 <Field byte[] Allocation.data>
	//   20   41:aload_0         
	//   21   42:getfield        #80  <Field SampleQueue$AllocationNode readAllocationNode>
	//   22   45:lload_1         
	//   23   46:invokevirtual   #169 <Method int SampleQueue$AllocationNode.translateOffset(long)>
	//   24   49:aload_3         
	//   25   50:iload           4
	//   26   52:iload           5
	//   27   54:isub            
	//   28   55:iload           6
	//   29   57:invokestatic    #182 <Method void System.arraycopy(Object, int, Object, int, int)>
			j -= k;
	//   30   60:iload           5
	//   31   62:iload           6
	//   32   64:isub            
	//   33   65:istore          5
			l += k;
	//   34   67:lload_1         
	//   35   68:iload           6
	//   36   70:i2l             
	//   37   71:ladd            
	//   38   72:lstore_1        
			if(l == readAllocationNode.endPosition)
	//*  39   73:lload_1         
	//*  40   74:aload_0         
	//*  41   75:getfield        #80  <Field SampleQueue$AllocationNode readAllocationNode>
	//*  42   78:getfield        #88  <Field long SampleQueue$AllocationNode.endPosition>
	//*  43   81:lcmp            
	//*  44   82:ifne            96
				readAllocationNode = readAllocationNode.next;
	//   45   85:aload_0         
	//   46   86:aload_0         
	//   47   87:getfield        #80  <Field SampleQueue$AllocationNode readAllocationNode>
	//   48   90:getfield        #91  <Field SampleQueue$AllocationNode SampleQueue$AllocationNode.next>
	//   49   93:putfield        #80  <Field SampleQueue$AllocationNode readAllocationNode>
		} while(true);
	//   50   96:goto            9
	//   51   99:return          
	}

	private void readEncryptionData(DecoderInputBuffer decoderinputbuffer, SampleMetadataQueue.SampleExtrasHolder sampleextrasholder)
	{
		boolean flag;
		int l;
		boolean flag1;
		long l1;
		int ai[];
label0:
		{
			l1 = sampleextrasholder.offset;
	//    0    0:aload_2         
	//    1    1:getfield        #187 <Field long SampleMetadataQueue$SampleExtrasHolder.offset>
	//    2    4:lstore          7
			ParsableByteArray parsablebytearray = scratch;
	//    3    6:aload_0         
	//    4    7:getfield        #73  <Field ParsableByteArray scratch>
	//    5   10:astore          11
			l = 1;
	//    6   12:iconst_1        
	//    7   13:istore          4
			parsablebytearray.reset(1);
	//    8   15:aload           11
	//    9   17:iconst_1        
	//   10   18:invokevirtual   #190 <Method void ParsableByteArray.reset(int)>
			readData(l1, scratch.data, 1);
	//   11   21:aload_0         
	//   12   22:lload           7
	//   13   24:aload_0         
	//   14   25:getfield        #73  <Field ParsableByteArray scratch>
	//   15   28:getfield        #191 <Field byte[] ParsableByteArray.data>
	//   16   31:iconst_1        
	//   17   32:invokespecial   #193 <Method void readData(long, byte[], int)>
			l1++;
	//   18   35:lload           7
	//   19   37:lconst_1        
	//   20   38:ladd            
	//   21   39:lstore          7
			ai = ((int []) (scratch.data));
	//   22   41:aload_0         
	//   23   42:getfield        #73  <Field ParsableByteArray scratch>
	//   24   45:getfield        #191 <Field byte[] ParsableByteArray.data>
	//   25   48:astore          11
			flag1 = false;
	//   26   50:iconst_0        
	//   27   51:istore          5
			int i1 = ((int) (ai[0]));
	//   28   53:aload           11
	//   29   55:iconst_0        
	//   30   56:baload          
	//   31   57:istore          6
			if((i1 & 0x80) != 0)
	//*  32   59:iload           6
	//*  33   61:sipush          128
	//*  34   64:iand            
	//*  35   65:ifeq            73
				flag = true;
	//   36   68:iconst_1        
	//   37   69:istore_3        
			else
	//*  38   70:goto            75
				flag = false;
	//   39   73:iconst_0        
	//   40   74:istore_3        
			i1 &= 0x7f;
	//   41   75:iload           6
	//   42   77:bipush          127
	//   43   79:iand            
	//   44   80:istore          6
			if(decoderinputbuffer.cryptoInfo.iv == null)
	//*  45   82:aload_1         
	//*  46   83:getfield        #199 <Field CryptoInfo DecoderInputBuffer.cryptoInfo>
	//*  47   86:getfield        #204 <Field byte[] CryptoInfo.iv>
	//*  48   89:ifnonnull       103
				decoderinputbuffer.cryptoInfo.iv = new byte[16];
	//   49   92:aload_1         
	//   50   93:getfield        #199 <Field CryptoInfo DecoderInputBuffer.cryptoInfo>
	//   51   96:bipush          16
	//   52   98:newarray        byte[]
	//   53  100:putfield        #204 <Field byte[] CryptoInfo.iv>
			readData(l1, decoderinputbuffer.cryptoInfo.iv, i1);
	//   54  103:aload_0         
	//   55  104:lload           7
	//   56  106:aload_1         
	//   57  107:getfield        #199 <Field CryptoInfo DecoderInputBuffer.cryptoInfo>
	//   58  110:getfield        #204 <Field byte[] CryptoInfo.iv>
	//   59  113:iload           6
	//   60  115:invokespecial   #193 <Method void readData(long, byte[], int)>
			l1 += i1;
	//   61  118:lload           7
	//   62  120:iload           6
	//   63  122:i2l             
	//   64  123:ladd            
	//   65  124:lstore          7
			if(flag)
	//*  66  126:iload_3         
	//*  67  127:ifeq            172
			{
				scratch.reset(2);
	//   68  130:aload_0         
	//   69  131:getfield        #73  <Field ParsableByteArray scratch>
	//   70  134:iconst_2        
	//   71  135:invokevirtual   #190 <Method void ParsableByteArray.reset(int)>
				readData(l1, scratch.data, 2);
	//   72  138:aload_0         
	//   73  139:lload           7
	//   74  141:aload_0         
	//   75  142:getfield        #73  <Field ParsableByteArray scratch>
	//   76  145:getfield        #191 <Field byte[] ParsableByteArray.data>
	//   77  148:iconst_2        
	//   78  149:invokespecial   #193 <Method void readData(long, byte[], int)>
				l1 += 2L;
	//   79  152:lload           7
	//   80  154:ldc2w           #205 <Long 2L>
	//   81  157:ladd            
	//   82  158:lstore          7
				l = scratch.readUnsignedShort();
	//   83  160:aload_0         
	//   84  161:getfield        #73  <Field ParsableByteArray scratch>
	//   85  164:invokevirtual   #209 <Method int ParsableByteArray.readUnsignedShort()>
	//   86  167:istore          4
			}
	//*  87  169:goto            175
	//*  88  172:goto            169
			int ai1[] = decoderinputbuffer.cryptoInfo.numBytesOfClearData;
	//   89  175:aload_1         
	//   90  176:getfield        #199 <Field CryptoInfo DecoderInputBuffer.cryptoInfo>
	//   91  179:getfield        #213 <Field int[] CryptoInfo.numBytesOfClearData>
	//   92  182:astore          12
			if(ai1 != null)
	//*  93  184:aload           12
	//*  94  186:ifnull          207
			{
				ai = ai1;
	//   95  189:aload           12
	//   96  191:astore          11
				if(ai1.length >= l)
	//*  97  193:aload           12
	//*  98  195:arraylength     
	//*  99  196:iload           4
	//* 100  198:icmpge          204
					break label0;
	//  101  201:goto            207
			}
	//* 102  204:goto            216
			ai = new int[l];
	//  103  207:iload           4
	//  104  209:newarray        int[]
	//  105  211:astore          11
		}
	//* 106  213:goto            204
		int ai2[];
label1:
		{
			int ai3[] = decoderinputbuffer.cryptoInfo.numBytesOfEncryptedData;
	//  107  216:aload_1         
	//  108  217:getfield        #199 <Field CryptoInfo DecoderInputBuffer.cryptoInfo>
	//  109  220:getfield        #216 <Field int[] CryptoInfo.numBytesOfEncryptedData>
	//  110  223:astore          13
			if(ai3 != null)
	//* 111  225:aload           13
	//* 112  227:ifnull          248
			{
				ai2 = ai3;
	//  113  230:aload           13
	//  114  232:astore          12
				if(ai3.length >= l)
	//* 115  234:aload           13
	//* 116  236:arraylength     
	//* 117  237:iload           4
	//* 118  239:icmpge          245
					break label1;
	//  119  242:goto            248
			}
	//* 120  245:goto            257
			ai2 = new int[l];
	//  121  248:iload           4
	//  122  250:newarray        int[]
	//  123  252:astore          12
		}
	//* 124  254:goto            245
		if(flag)
	//* 125  257:iload_3         
	//* 126  258:ifeq            349
		{
			int i = 6 * l;
	//  127  261:bipush          6
	//  128  263:iload           4
	//  129  265:imul            
	//  130  266:istore_3        
			scratch.reset(i);
	//  131  267:aload_0         
	//  132  268:getfield        #73  <Field ParsableByteArray scratch>
	//  133  271:iload_3         
	//  134  272:invokevirtual   #190 <Method void ParsableByteArray.reset(int)>
			readData(l1, scratch.data, i);
	//  135  275:aload_0         
	//  136  276:lload           7
	//  137  278:aload_0         
	//  138  279:getfield        #73  <Field ParsableByteArray scratch>
	//  139  282:getfield        #191 <Field byte[] ParsableByteArray.data>
	//  140  285:iload_3         
	//  141  286:invokespecial   #193 <Method void readData(long, byte[], int)>
			long l2 = i;
	//  142  289:iload_3         
	//  143  290:i2l             
	//  144  291:lstore          9
			scratch.setPosition(0);
	//  145  293:aload_0         
	//  146  294:getfield        #73  <Field ParsableByteArray scratch>
	//  147  297:iconst_0        
	//  148  298:invokevirtual   #219 <Method void ParsableByteArray.setPosition(int)>
			for(int j = ((int) (flag1)); j < l; j++)
	//* 149  301:iload           5
	//* 150  303:istore_3        
	//* 151  304:iload_3         
	//* 152  305:iload           4
	//* 153  307:icmpge          339
			{
				ai[j] = scratch.readUnsignedShort();
	//  154  310:aload           11
	//  155  312:iload_3         
	//  156  313:aload_0         
	//  157  314:getfield        #73  <Field ParsableByteArray scratch>
	//  158  317:invokevirtual   #209 <Method int ParsableByteArray.readUnsignedShort()>
	//  159  320:iastore         
				ai2[j] = scratch.readUnsignedIntToInt();
	//  160  321:aload           12
	//  161  323:iload_3         
	//  162  324:aload_0         
	//  163  325:getfield        #73  <Field ParsableByteArray scratch>
	//  164  328:invokevirtual   #222 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//  165  331:iastore         
			}

	//  166  332:iload_3         
	//  167  333:iconst_1        
	//  168  334:iadd            
	//  169  335:istore_3        
	//* 170  336:goto            304
			l1 += l2;
	//  171  339:lload           7
	//  172  341:lload           9
	//  173  343:ladd            
	//  174  344:lstore          7
		} else
	//* 175  346:goto            371
		{
			ai[0] = 0;
	//  176  349:aload           11
	//  177  351:iconst_0        
	//  178  352:iconst_0        
	//  179  353:iastore         
			ai2[0] = sampleextrasholder.size - (int)(l1 - sampleextrasholder.offset);
	//  180  354:aload           12
	//  181  356:iconst_0        
	//  182  357:aload_2         
	//  183  358:getfield        #225 <Field int SampleMetadataQueue$SampleExtrasHolder.size>
	//  184  361:lload           7
	//  185  363:aload_2         
	//  186  364:getfield        #187 <Field long SampleMetadataQueue$SampleExtrasHolder.offset>
	//  187  367:lsub            
	//  188  368:l2i             
	//  189  369:isub            
	//  190  370:iastore         
		}
		com.google.android.exoplayer2.extractor.TrackOutput.CryptoData cryptodata = sampleextrasholder.cryptoData;
	//  191  371:aload_2         
	//  192  372:getfield        #229 <Field com.google.android.exoplayer2.extractor.TrackOutput$CryptoData SampleMetadataQueue$SampleExtrasHolder.cryptoData>
	//  193  375:astore          13
		decoderinputbuffer.cryptoInfo.set(l, ai, ai2, cryptodata.encryptionKey, decoderinputbuffer.cryptoInfo.iv, cryptodata.cryptoMode, cryptodata.encryptedBlocks, cryptodata.clearBlocks);
	//  194  377:aload_1         
	//  195  378:getfield        #199 <Field CryptoInfo DecoderInputBuffer.cryptoInfo>
	//  196  381:iload           4
	//  197  383:aload           11
	//  198  385:aload           12
	//  199  387:aload           13
	//  200  389:getfield        #234 <Field byte[] com.google.android.exoplayer2.extractor.TrackOutput$CryptoData.encryptionKey>
	//  201  392:aload_1         
	//  202  393:getfield        #199 <Field CryptoInfo DecoderInputBuffer.cryptoInfo>
	//  203  396:getfield        #204 <Field byte[] CryptoInfo.iv>
	//  204  399:aload           13
	//  205  401:getfield        #237 <Field int com.google.android.exoplayer2.extractor.TrackOutput$CryptoData.cryptoMode>
	//  206  404:aload           13
	//  207  406:getfield        #240 <Field int com.google.android.exoplayer2.extractor.TrackOutput$CryptoData.encryptedBlocks>
	//  208  409:aload           13
	//  209  411:getfield        #243 <Field int com.google.android.exoplayer2.extractor.TrackOutput$CryptoData.clearBlocks>
	//  210  414:invokevirtual   #247 <Method void CryptoInfo.set(int, int[], int[], byte[], byte[], int, int, int)>
		int k = (int)(l1 - sampleextrasholder.offset);
	//  211  417:lload           7
	//  212  419:aload_2         
	//  213  420:getfield        #187 <Field long SampleMetadataQueue$SampleExtrasHolder.offset>
	//  214  423:lsub            
	//  215  424:l2i             
	//  216  425:istore_3        
		sampleextrasholder.offset = sampleextrasholder.offset + (long)k;
	//  217  426:aload_2         
	//  218  427:aload_2         
	//  219  428:getfield        #187 <Field long SampleMetadataQueue$SampleExtrasHolder.offset>
	//  220  431:iload_3         
	//  221  432:i2l             
	//  222  433:ladd            
	//  223  434:putfield        #187 <Field long SampleMetadataQueue$SampleExtrasHolder.offset>
		sampleextrasholder.size = sampleextrasholder.size - k;
	//  224  437:aload_2         
	//  225  438:aload_2         
	//  226  439:getfield        #225 <Field int SampleMetadataQueue$SampleExtrasHolder.size>
	//  227  442:iload_3         
	//  228  443:isub            
	//  229  444:putfield        #225 <Field int SampleMetadataQueue$SampleExtrasHolder.size>
	//  230  447:return          
	}

	public int advanceTo(long l, boolean flag, boolean flag1)
	{
		return metadataQueue.advanceTo(l, flag, flag1);
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field SampleMetadataQueue metadataQueue>
	//    2    4:lload_1         
	//    3    5:iload_3         
	//    4    6:iload           4
	//    5    8:invokevirtual   #251 <Method int SampleMetadataQueue.advanceTo(long, boolean, boolean)>
	//    6   11:ireturn         
	}

	public int advanceToEnd()
	{
		return metadataQueue.advanceToEnd();
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field SampleMetadataQueue metadataQueue>
	//    2    4:invokevirtual   #254 <Method int SampleMetadataQueue.advanceToEnd()>
	//    3    7:ireturn         
	}

	public void discardTo(long l, boolean flag, boolean flag1)
	{
		discardDownstreamTo(metadataQueue.discardTo(l, flag, flag1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field SampleMetadataQueue metadataQueue>
	//    3    5:lload_1         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #259 <Method long SampleMetadataQueue.discardTo(long, boolean, boolean)>
	//    7   12:invokespecial   #261 <Method void discardDownstreamTo(long)>
	//    8   15:return          
	}

	public void discardToEnd()
	{
		discardDownstreamTo(metadataQueue.discardToEnd());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field SampleMetadataQueue metadataQueue>
	//    3    5:invokevirtual   #265 <Method long SampleMetadataQueue.discardToEnd()>
	//    4    8:invokespecial   #261 <Method void discardDownstreamTo(long)>
	//    5   11:return          
	}

	public void discardToRead()
	{
		discardDownstreamTo(metadataQueue.discardToRead());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field SampleMetadataQueue metadataQueue>
	//    3    5:invokevirtual   #268 <Method long SampleMetadataQueue.discardToRead()>
	//    4    8:invokespecial   #261 <Method void discardDownstreamTo(long)>
	//    5   11:return          
	}

	public void discardUpstreamSamples(int i)
	{
		totalBytesWritten = metadataQueue.discardUpstreamSamples(i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field SampleMetadataQueue metadataQueue>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #272 <Method long SampleMetadataQueue.discardUpstreamSamples(int)>
	//    5    9:putfield        #136 <Field long totalBytesWritten>
		if(totalBytesWritten != 0L && totalBytesWritten != firstAllocationNode.startPosition)
	//*   6   12:aload_0         
	//*   7   13:getfield        #136 <Field long totalBytesWritten>
	//*   8   16:lconst_0        
	//*   9   17:lcmp            
	//*  10   18:ifeq            140
	//*  11   21:aload_0         
	//*  12   22:getfield        #136 <Field long totalBytesWritten>
	//*  13   25:aload_0         
	//*  14   26:getfield        #78  <Field SampleQueue$AllocationNode firstAllocationNode>
	//*  15   29:getfield        #120 <Field long SampleQueue$AllocationNode.startPosition>
	//*  16   32:lcmp            
	//*  17   33:ifne            39
	//*  18   36:goto            140
		{
			AllocationNode allocationnode;
			for(allocationnode = firstAllocationNode; totalBytesWritten > allocationnode.endPosition; allocationnode = allocationnode.next);
	//   19   39:aload_0         
	//   20   40:getfield        #78  <Field SampleQueue$AllocationNode firstAllocationNode>
	//   21   43:astore_2        
	//   22   44:aload_0         
	//   23   45:getfield        #136 <Field long totalBytesWritten>
	//   24   48:aload_2         
	//   25   49:getfield        #88  <Field long SampleQueue$AllocationNode.endPosition>
	//   26   52:lcmp            
	//   27   53:ifle            64
	//   28   56:aload_2         
	//   29   57:getfield        #91  <Field SampleQueue$AllocationNode SampleQueue$AllocationNode.next>
	//   30   60:astore_2        
	//*  31   61:goto            44
			AllocationNode allocationnode2 = allocationnode.next;
	//   32   64:aload_2         
	//   33   65:getfield        #91  <Field SampleQueue$AllocationNode SampleQueue$AllocationNode.next>
	//   34   68:astore          4
			clearAllocationNodes(allocationnode2);
	//   35   70:aload_0         
	//   36   71:aload           4
	//   37   73:invokespecial   #274 <Method void clearAllocationNodes(SampleQueue$AllocationNode)>
			allocationnode.next = new AllocationNode(allocationnode.endPosition, allocationLength);
	//   38   76:aload_2         
	//   39   77:new             #8   <Class SampleQueue$AllocationNode>
	//   40   80:dup             
	//   41   81:aload_2         
	//   42   82:getfield        #88  <Field long SampleQueue$AllocationNode.endPosition>
	//   43   85:aload_0         
	//   44   86:getfield        #56  <Field int allocationLength>
	//   45   89:invokespecial   #76  <Method void SampleQueue$AllocationNode(long, int)>
	//   46   92:putfield        #91  <Field SampleQueue$AllocationNode SampleQueue$AllocationNode.next>
			AllocationNode allocationnode1;
			if(totalBytesWritten == allocationnode.endPosition)
	//*  47   95:aload_0         
	//*  48   96:getfield        #136 <Field long totalBytesWritten>
	//*  49   99:aload_2         
	//*  50  100:getfield        #88  <Field long SampleQueue$AllocationNode.endPosition>
	//*  51  103:lcmp            
	//*  52  104:ifne            115
				allocationnode1 = allocationnode.next;
	//   53  107:aload_2         
	//   54  108:getfield        #91  <Field SampleQueue$AllocationNode SampleQueue$AllocationNode.next>
	//   55  111:astore_3        
			else
	//*  56  112:goto            117
				allocationnode1 = allocationnode;
	//   57  115:aload_2         
	//   58  116:astore_3        
			writeAllocationNode = allocationnode1;
	//   59  117:aload_0         
	//   60  118:aload_3         
	//   61  119:putfield        #82  <Field SampleQueue$AllocationNode writeAllocationNode>
			if(readAllocationNode == allocationnode2)
	//*  62  122:aload_0         
	//*  63  123:getfield        #80  <Field SampleQueue$AllocationNode readAllocationNode>
	//*  64  126:aload           4
	//*  65  128:if_acmpne       183
			{
				readAllocationNode = allocationnode.next;
	//   66  131:aload_0         
	//   67  132:aload_2         
	//   68  133:getfield        #91  <Field SampleQueue$AllocationNode SampleQueue$AllocationNode.next>
	//   69  136:putfield        #80  <Field SampleQueue$AllocationNode readAllocationNode>
				return;
	//   70  139:return          
			}
		} else
		{
			clearAllocationNodes(firstAllocationNode);
	//   71  140:aload_0         
	//   72  141:aload_0         
	//   73  142:getfield        #78  <Field SampleQueue$AllocationNode firstAllocationNode>
	//   74  145:invokespecial   #274 <Method void clearAllocationNodes(SampleQueue$AllocationNode)>
			firstAllocationNode = new AllocationNode(totalBytesWritten, allocationLength);
	//   75  148:aload_0         
	//   76  149:new             #8   <Class SampleQueue$AllocationNode>
	//   77  152:dup             
	//   78  153:aload_0         
	//   79  154:getfield        #136 <Field long totalBytesWritten>
	//   80  157:aload_0         
	//   81  158:getfield        #56  <Field int allocationLength>
	//   82  161:invokespecial   #76  <Method void SampleQueue$AllocationNode(long, int)>
	//   83  164:putfield        #78  <Field SampleQueue$AllocationNode firstAllocationNode>
			readAllocationNode = firstAllocationNode;
	//   84  167:aload_0         
	//   85  168:aload_0         
	//   86  169:getfield        #78  <Field SampleQueue$AllocationNode firstAllocationNode>
	//   87  172:putfield        #80  <Field SampleQueue$AllocationNode readAllocationNode>
			writeAllocationNode = firstAllocationNode;
	//   88  175:aload_0         
	//   89  176:aload_0         
	//   90  177:getfield        #78  <Field SampleQueue$AllocationNode firstAllocationNode>
	//   91  180:putfield        #82  <Field SampleQueue$AllocationNode writeAllocationNode>
		}
	//   92  183:return          
	}

	public void format(Format format1)
	{
		Format format2 = getAdjustedSampleFormat(format1, sampleOffsetUs);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #278 <Field long sampleOffsetUs>
	//    3    5:invokestatic    #280 <Method Format getAdjustedSampleFormat(Format, long)>
	//    4    8:astore_3        
		boolean flag = metadataQueue.format(format2);
	//    5    9:aload_0         
	//    6   10:getfield        #61  <Field SampleMetadataQueue metadataQueue>
	//    7   13:aload_3         
	//    8   14:invokevirtual   #283 <Method boolean SampleMetadataQueue.format(Format)>
	//    9   17:istore_2        
		lastUnadjustedFormat = format1;
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:putfield        #285 <Field Format lastUnadjustedFormat>
		pendingFormatAdjustment = false;
	//   13   23:aload_0         
	//   14   24:iconst_0        
	//   15   25:putfield        #287 <Field boolean pendingFormatAdjustment>
		if(upstreamFormatChangeListener != null && flag)
	//*  16   28:aload_0         
	//*  17   29:getfield        #289 <Field SampleQueue$UpstreamFormatChangedListener upstreamFormatChangeListener>
	//*  18   32:ifnull          49
	//*  19   35:iload_2         
	//*  20   36:ifeq            49
			upstreamFormatChangeListener.onUpstreamFormatChanged(format2);
	//   21   39:aload_0         
	//   22   40:getfield        #289 <Field SampleQueue$UpstreamFormatChangedListener upstreamFormatChangeListener>
	//   23   43:aload_3         
	//   24   44:invokeinterface #292 <Method void SampleQueue$UpstreamFormatChangedListener.onUpstreamFormatChanged(Format)>
	//   25   49:return          
	}

	public int getFirstIndex()
	{
		return metadataQueue.getFirstIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field SampleMetadataQueue metadataQueue>
	//    2    4:invokevirtual   #295 <Method int SampleMetadataQueue.getFirstIndex()>
	//    3    7:ireturn         
	}

	public long getFirstTimestampUs()
	{
		return metadataQueue.getFirstTimestampUs();
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field SampleMetadataQueue metadataQueue>
	//    2    4:invokevirtual   #298 <Method long SampleMetadataQueue.getFirstTimestampUs()>
	//    3    7:lreturn         
	}

	public long getLargestQueuedTimestampUs()
	{
		return metadataQueue.getLargestQueuedTimestampUs();
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field SampleMetadataQueue metadataQueue>
	//    2    4:invokevirtual   #301 <Method long SampleMetadataQueue.getLargestQueuedTimestampUs()>
	//    3    7:lreturn         
	}

	public int getReadIndex()
	{
		return metadataQueue.getReadIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field SampleMetadataQueue metadataQueue>
	//    2    4:invokevirtual   #304 <Method int SampleMetadataQueue.getReadIndex()>
	//    3    7:ireturn         
	}

	public Format getUpstreamFormat()
	{
		return metadataQueue.getUpstreamFormat();
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field SampleMetadataQueue metadataQueue>
	//    2    4:invokevirtual   #308 <Method Format SampleMetadataQueue.getUpstreamFormat()>
	//    3    7:areturn         
	}

	public int getWriteIndex()
	{
		return metadataQueue.getWriteIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field SampleMetadataQueue metadataQueue>
	//    2    4:invokevirtual   #311 <Method int SampleMetadataQueue.getWriteIndex()>
	//    3    7:ireturn         
	}

	public boolean hasNextSample()
	{
		return metadataQueue.hasNextSample();
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field SampleMetadataQueue metadataQueue>
	//    2    4:invokevirtual   #315 <Method boolean SampleMetadataQueue.hasNextSample()>
	//    3    7:ireturn         
	}

	public int peekSourceId()
	{
		return metadataQueue.peekSourceId();
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field SampleMetadataQueue metadataQueue>
	//    2    4:invokevirtual   #318 <Method int SampleMetadataQueue.peekSourceId()>
	//    3    7:ireturn         
	}

	public int read(FormatHolder formatholder, DecoderInputBuffer decoderinputbuffer, boolean flag, boolean flag1, long l)
	{
		switch(metadataQueue.read(formatholder, decoderinputbuffer, flag, flag1, downstreamFormat, extrasHolder))
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field SampleMetadataQueue metadataQueue>
	//*   2    4:aload_1         
	//*   3    5:aload_2         
	//*   4    6:iload_3         
	//*   5    7:iload           4
	//*   6    9:aload_0         
	//*   7   10:getfield        #322 <Field Format downstreamFormat>
	//*   8   13:aload_0         
	//*   9   14:getfield        #66  <Field SampleMetadataQueue$SampleExtrasHolder extrasHolder>
	//*  10   17:invokevirtual   #325 <Method int SampleMetadataQueue.read(FormatHolder, DecoderInputBuffer, boolean, boolean, Format, SampleMetadataQueue$SampleExtrasHolder)>
		{
	//*  11   20:tableswitch     -5 -3: default 48
	//	               -5 135
	//	               -4 59
	//	               -3 56
		default:
			throw new IllegalStateException();
	//   12   48:new             #327 <Class IllegalStateException>
	//   13   51:dup             
	//   14   52:invokespecial   #328 <Method void IllegalStateException()>
	//   15   55:athrow          

		case -3: 
			return -3;
	//   16   56:bipush          -3
	//   17   58:ireturn         

		case -4: 
			if(!decoderinputbuffer.isEndOfStream())
	//*  18   59:aload_2         
	//*  19   60:invokevirtual   #331 <Method boolean DecoderInputBuffer.isEndOfStream()>
	//*  20   63:ifne            132
			{
				if(decoderinputbuffer.timeUs < l)
	//*  21   66:aload_2         
	//*  22   67:getfield        #334 <Field long DecoderInputBuffer.timeUs>
	//*  23   70:lload           5
	//*  24   72:lcmp            
	//*  25   73:ifge            83
					decoderinputbuffer.addFlag(0x80000000);
	//   26   76:aload_2         
	//   27   77:ldc2            #335 <Int 0x80000000>
	//   28   80:invokevirtual   #338 <Method void DecoderInputBuffer.addFlag(int)>
				if(decoderinputbuffer.isEncrypted())
	//*  29   83:aload_2         
	//*  30   84:invokevirtual   #341 <Method boolean DecoderInputBuffer.isEncrypted()>
	//*  31   87:ifeq            99
					readEncryptionData(decoderinputbuffer, extrasHolder);
	//   32   90:aload_0         
	//   33   91:aload_2         
	//   34   92:aload_0         
	//   35   93:getfield        #66  <Field SampleMetadataQueue$SampleExtrasHolder extrasHolder>
	//   36   96:invokespecial   #343 <Method void readEncryptionData(DecoderInputBuffer, SampleMetadataQueue$SampleExtrasHolder)>
				decoderinputbuffer.ensureSpaceForWrite(extrasHolder.size);
	//   37   99:aload_2         
	//   38  100:aload_0         
	//   39  101:getfield        #66  <Field SampleMetadataQueue$SampleExtrasHolder extrasHolder>
	//   40  104:getfield        #225 <Field int SampleMetadataQueue$SampleExtrasHolder.size>
	//   41  107:invokevirtual   #346 <Method void DecoderInputBuffer.ensureSpaceForWrite(int)>
				readData(extrasHolder.offset, decoderinputbuffer.data, extrasHolder.size);
	//   42  110:aload_0         
	//   43  111:aload_0         
	//   44  112:getfield        #66  <Field SampleMetadataQueue$SampleExtrasHolder extrasHolder>
	//   45  115:getfield        #187 <Field long SampleMetadataQueue$SampleExtrasHolder.offset>
	//   46  118:aload_2         
	//   47  119:getfield        #349 <Field ByteBuffer DecoderInputBuffer.data>
	//   48  122:aload_0         
	//   49  123:getfield        #66  <Field SampleMetadataQueue$SampleExtrasHolder extrasHolder>
	//   50  126:getfield        #225 <Field int SampleMetadataQueue$SampleExtrasHolder.size>
	//   51  129:invokespecial   #351 <Method void readData(long, ByteBuffer, int)>
			}
			return -4;
	//   52  132:bipush          -4
	//   53  134:ireturn         

		case -5: 
			downstreamFormat = formatholder.format;
	//   54  135:aload_0         
	//   55  136:aload_1         
	//   56  137:getfield        #355 <Field Format FormatHolder.format>
	//   57  140:putfield        #322 <Field Format downstreamFormat>
			return -5;
	//   58  143:bipush          -5
	//   59  145:ireturn         
		}
	}

	public void reset()
	{
		reset(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #358 <Method void reset(boolean)>
	//    3    5:return          
	}

	public void reset(boolean flag)
	{
		metadataQueue.reset(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field SampleMetadataQueue metadataQueue>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #359 <Method void SampleMetadataQueue.reset(boolean)>
		clearAllocationNodes(firstAllocationNode);
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #78  <Field SampleQueue$AllocationNode firstAllocationNode>
	//    7   13:invokespecial   #274 <Method void clearAllocationNodes(SampleQueue$AllocationNode)>
		firstAllocationNode = new AllocationNode(0L, allocationLength);
	//    8   16:aload_0         
	//    9   17:new             #8   <Class SampleQueue$AllocationNode>
	//   10   20:dup             
	//   11   21:lconst_0        
	//   12   22:aload_0         
	//   13   23:getfield        #56  <Field int allocationLength>
	//   14   26:invokespecial   #76  <Method void SampleQueue$AllocationNode(long, int)>
	//   15   29:putfield        #78  <Field SampleQueue$AllocationNode firstAllocationNode>
		readAllocationNode = firstAllocationNode;
	//   16   32:aload_0         
	//   17   33:aload_0         
	//   18   34:getfield        #78  <Field SampleQueue$AllocationNode firstAllocationNode>
	//   19   37:putfield        #80  <Field SampleQueue$AllocationNode readAllocationNode>
		writeAllocationNode = firstAllocationNode;
	//   20   40:aload_0         
	//   21   41:aload_0         
	//   22   42:getfield        #78  <Field SampleQueue$AllocationNode firstAllocationNode>
	//   23   45:putfield        #82  <Field SampleQueue$AllocationNode writeAllocationNode>
		totalBytesWritten = 0L;
	//   24   48:aload_0         
	//   25   49:lconst_0        
	//   26   50:putfield        #136 <Field long totalBytesWritten>
		allocator.trim();
	//   27   53:aload_0         
	//   28   54:getfield        #48  <Field Allocator allocator>
	//   29   57:invokeinterface #362 <Method void Allocator.trim()>
	//   30   62:return          
	}

	public void rewind()
	{
		metadataQueue.rewind();
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field SampleMetadataQueue metadataQueue>
	//    2    4:invokevirtual   #365 <Method void SampleMetadataQueue.rewind()>
		readAllocationNode = firstAllocationNode;
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #78  <Field SampleQueue$AllocationNode firstAllocationNode>
	//    6   12:putfield        #80  <Field SampleQueue$AllocationNode readAllocationNode>
	//    7   15:return          
	}

	public int sampleData(ExtractorInput extractorinput, int i, boolean flag)
		throws IOException, InterruptedException
	{
		i = preAppend(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokespecial   #373 <Method int preAppend(int)>
	//    3    5:istore_2        
		i = extractorinput.read(writeAllocationNode.allocation.data, writeAllocationNode.translateOffset(totalBytesWritten), i);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #82  <Field SampleQueue$AllocationNode writeAllocationNode>
	//    7   11:getfield        #109 <Field Allocation SampleQueue$AllocationNode.allocation>
	//    8   14:getfield        #165 <Field byte[] Allocation.data>
	//    9   17:aload_0         
	//   10   18:getfield        #82  <Field SampleQueue$AllocationNode writeAllocationNode>
	//   11   21:aload_0         
	//   12   22:getfield        #136 <Field long totalBytesWritten>
	//   13   25:invokevirtual   #169 <Method int SampleQueue$AllocationNode.translateOffset(long)>
	//   14   28:iload_2         
	//   15   29:invokeinterface #378 <Method int ExtractorInput.read(byte[], int, int)>
	//   16   34:istore_2        
		if(i == -1)
	//*  17   35:iload_2         
	//*  18   36:iconst_m1       
	//*  19   37:icmpne          54
		{
			if(flag)
	//*  20   40:iload_3         
	//*  21   41:ifeq            46
				return -1;
	//   22   44:iconst_m1       
	//   23   45:ireturn         
			else
				throw new EOFException();
	//   24   46:new             #380 <Class EOFException>
	//   25   49:dup             
	//   26   50:invokespecial   #381 <Method void EOFException()>
	//   27   53:athrow          
		} else
		{
			postAppend(i);
	//   28   54:aload_0         
	//   29   55:iload_2         
	//   30   56:invokespecial   #383 <Method void postAppend(int)>
			return i;
	//   31   59:iload_2         
	//   32   60:ireturn         
		}
	}

	public void sampleData(ParsableByteArray parsablebytearray, int i)
	{
		while(i > 0) 
	//*   0    0:iload_2         
	//*   1    1:ifle            48
		{
			int j = preAppend(i);
	//    2    4:aload_0         
	//    3    5:iload_2         
	//    4    6:invokespecial   #373 <Method int preAppend(int)>
	//    5    9:istore_3        
			parsablebytearray.readBytes(writeAllocationNode.allocation.data, writeAllocationNode.translateOffset(totalBytesWritten), j);
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:getfield        #82  <Field SampleQueue$AllocationNode writeAllocationNode>
	//    9   15:getfield        #109 <Field Allocation SampleQueue$AllocationNode.allocation>
	//   10   18:getfield        #165 <Field byte[] Allocation.data>
	//   11   21:aload_0         
	//   12   22:getfield        #82  <Field SampleQueue$AllocationNode writeAllocationNode>
	//   13   25:aload_0         
	//   14   26:getfield        #136 <Field long totalBytesWritten>
	//   15   29:invokevirtual   #169 <Method int SampleQueue$AllocationNode.translateOffset(long)>
	//   16   32:iload_3         
	//   17   33:invokevirtual   #389 <Method void ParsableByteArray.readBytes(byte[], int, int)>
			i -= j;
	//   18   36:iload_2         
	//   19   37:iload_3         
	//   20   38:isub            
	//   21   39:istore_2        
			postAppend(j);
	//   22   40:aload_0         
	//   23   41:iload_3         
	//   24   42:invokespecial   #383 <Method void postAppend(int)>
		}
	//*  25   45:goto            0
	//   26   48:return          
	}

	public void sampleMetadata(long l, int i, int j, int k, com.google.android.exoplayer2.extractor.TrackOutput.CryptoData cryptodata)
	{
		if(pendingFormatAdjustment)
	//*   0    0:aload_0         
	//*   1    1:getfield        #287 <Field boolean pendingFormatAdjustment>
	//*   2    4:ifeq            15
			format(lastUnadjustedFormat);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #285 <Field Format lastUnadjustedFormat>
	//    6   12:invokevirtual   #393 <Method void format(Format)>
		if(pendingSplice)
	//*   7   15:aload_0         
	//*   8   16:getfield        #395 <Field boolean pendingSplice>
	//*   9   19:ifeq            49
			if((i & 1) != 0)
	//*  10   22:iload_3         
	//*  11   23:iconst_1        
	//*  12   24:iand            
	//*  13   25:ifeq            48
			{
				if(!metadataQueue.attemptSplice(l))
	//*  14   28:aload_0         
	//*  15   29:getfield        #61  <Field SampleMetadataQueue metadataQueue>
	//*  16   32:lload_1         
	//*  17   33:invokevirtual   #399 <Method boolean SampleMetadataQueue.attemptSplice(long)>
	//*  18   36:ifne            40
					return;
	//   19   39:return          
				pendingSplice = false;
	//   20   40:aload_0         
	//   21   41:iconst_0        
	//   22   42:putfield        #395 <Field boolean pendingSplice>
			} else
	//*  23   45:goto            49
			{
				return;
	//   24   48:return          
			}
		long l1 = sampleOffsetUs;
	//   25   49:aload_0         
	//   26   50:getfield        #278 <Field long sampleOffsetUs>
	//   27   53:lstore          7
		long l2 = totalBytesWritten;
	//   28   55:aload_0         
	//   29   56:getfield        #136 <Field long totalBytesWritten>
	//   30   59:lstore          9
		long l3 = j;
	//   31   61:iload           4
	//   32   63:i2l             
	//   33   64:lstore          11
		long l4 = k;
	//   34   66:iload           5
	//   35   68:i2l             
	//   36   69:lstore          13
		metadataQueue.commitSample(l + l1, i, l2 - l3 - l4, j, cryptodata);
	//   37   71:aload_0         
	//   38   72:getfield        #61  <Field SampleMetadataQueue metadataQueue>
	//   39   75:lload_1         
	//   40   76:lload           7
	//   41   78:ladd            
	//   42   79:iload_3         
	//   43   80:lload           9
	//   44   82:lload           11
	//   45   84:lsub            
	//   46   85:lload           13
	//   47   87:lsub            
	//   48   88:iload           4
	//   49   90:aload           6
	//   50   92:invokevirtual   #403 <Method void SampleMetadataQueue.commitSample(long, int, long, int, com.google.android.exoplayer2.extractor.TrackOutput$CryptoData)>
	//   51   95:return          
	}

	public boolean setReadPosition(int i)
	{
		return metadataQueue.setReadPosition(i);
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field SampleMetadataQueue metadataQueue>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #407 <Method boolean SampleMetadataQueue.setReadPosition(int)>
	//    4    8:ireturn         
	}

	public void setSampleOffsetUs(long l)
	{
		if(sampleOffsetUs != l)
	//*   0    0:aload_0         
	//*   1    1:getfield        #278 <Field long sampleOffsetUs>
	//*   2    4:lload_1         
	//*   3    5:lcmp            
	//*   4    6:ifeq            19
		{
			sampleOffsetUs = l;
	//    5    9:aload_0         
	//    6   10:lload_1         
	//    7   11:putfield        #278 <Field long sampleOffsetUs>
			pendingFormatAdjustment = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #287 <Field boolean pendingFormatAdjustment>
		}
	//   11   19:return          
	}

	public void setUpstreamFormatChangeListener(UpstreamFormatChangedListener upstreamformatchangedlistener)
	{
		upstreamFormatChangeListener = upstreamformatchangedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #289 <Field SampleQueue$UpstreamFormatChangedListener upstreamFormatChangeListener>
	//    3    5:return          
	}

	public void sourceId(int i)
	{
		metadataQueue.sourceId(i);
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field SampleMetadataQueue metadataQueue>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #413 <Method void SampleMetadataQueue.sourceId(int)>
	//    4    8:return          
	}

	public void splice()
	{
		pendingSplice = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #395 <Field boolean pendingSplice>
	//    3    5:return          
	}

	public static final int ADVANCE_FAILED = -1;
	private static final int INITIAL_SCRATCH_SIZE = 32;
	private final int allocationLength;
	private final Allocator allocator;
	private Format downstreamFormat;
	private final SampleMetadataQueue.SampleExtrasHolder extrasHolder = new SampleMetadataQueue.SampleExtrasHolder();
	private AllocationNode firstAllocationNode;
	private Format lastUnadjustedFormat;
	private final SampleMetadataQueue metadataQueue = new SampleMetadataQueue();
	private boolean pendingFormatAdjustment;
	private boolean pendingSplice;
	private AllocationNode readAllocationNode;
	private long sampleOffsetUs;
	private final ParsableByteArray scratch = new ParsableByteArray(32);
	private long totalBytesWritten;
	private UpstreamFormatChangedListener upstreamFormatChangeListener;
	private AllocationNode writeAllocationNode;
}
