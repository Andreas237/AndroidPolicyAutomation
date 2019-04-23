// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.ogg;

import com.google.android.exoplayer.extractor.ExtractorInput;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.ParsableByteArray;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.extractor.ogg:
//			OggUtil

final class OggSeeker
{

	OggSeeker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #20  <Class OggUtil$PageHeader>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void OggUtil$PageHeader()>
	//    6   12:putfield        #23  <Field OggUtil$PageHeader pageHeader>
	//    7   15:aload_0         
	//    8   16:new             #25  <Class ParsableByteArray>
	//    9   19:dup             
	//   10   20:sipush          282
	//   11   23:invokespecial   #28  <Method void ParsableByteArray(int)>
	//   12   26:putfield        #30  <Field ParsableByteArray headerArray>
		audioDataLength = -1L;
	//   13   29:aload_0         
	//   14   30:ldc2w           #31  <Long -1L>
	//   15   33:putfield        #34  <Field long audioDataLength>
	//   16   36:return          
	}

	public long getNextSeekPosition(long l, ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		long l1 = audioDataLength;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field long audioDataLength>
	//    2    4:lstore          8
		byte byte0 = 1;
	//    3    6:iconst_1        
	//    4    7:istore          4
		boolean flag;
		if(l1 != -1L && totalSamples != 0L)
	//*   5    9:lload           8
	//*   6   11:ldc2w           #31  <Long -1L>
	//*   7   14:lcmp            
	//*   8   15:ifeq            33
	//*   9   18:aload_0         
	//*  10   19:getfield        #43  <Field long totalSamples>
	//*  11   22:lconst_0        
	//*  12   23:lcmp            
	//*  13   24:ifeq            33
			flag = true;
	//   14   27:iconst_1        
	//   15   28:istore          10
		else
	//*  16   30:goto            36
			flag = false;
	//   17   33:iconst_0        
	//   18   34:istore          10
		Assertions.checkState(flag);
	//   19   36:iload           10
	//   20   38:invokestatic    #49  <Method void Assertions.checkState(boolean)>
		OggUtil.populatePageHeader(extractorinput, pageHeader, headerArray, false);
	//   21   41:aload_3         
	//   22   42:aload_0         
	//   23   43:getfield        #23  <Field OggUtil$PageHeader pageHeader>
	//   24   46:aload_0         
	//   25   47:getfield        #30  <Field ParsableByteArray headerArray>
	//   26   50:iconst_0        
	//   27   51:invokestatic    #55  <Method boolean OggUtil.populatePageHeader(ExtractorInput, OggUtil$PageHeader, ParsableByteArray, boolean)>
	//   28   54:pop             
		l -= pageHeader.granulePosition;
	//   29   55:lload_1         
	//   30   56:aload_0         
	//   31   57:getfield        #23  <Field OggUtil$PageHeader pageHeader>
	//   32   60:getfield        #58  <Field long OggUtil$PageHeader.granulePosition>
	//   33   63:lsub            
	//   34   64:lstore_1        
		int k = l != 0L;
	//   35   65:lload_1         
	//   36   66:lconst_0        
	//   37   67:lcmp            
	//   38   68:istore          7
		if(k > 0 && l <= 0x11940L)
	//*  39   70:iload           7
	//*  40   72:ifle            96
	//*  41   75:lload_1         
	//*  42   76:ldc2w           #59  <Long 0x11940L>
	//*  43   79:lcmp            
	//*  44   80:ifle            86
	//*  45   83:goto            96
		{
			extractorinput.resetPeekPosition();
	//   46   86:aload_3         
	//   47   87:invokeinterface #65  <Method void ExtractorInput.resetPeekPosition()>
			return -1L;
	//   48   92:ldc2w           #31  <Long -1L>
	//   49   95:lreturn         
		}
		int i = pageHeader.bodySize;
	//   50   96:aload_0         
	//   51   97:getfield        #23  <Field OggUtil$PageHeader pageHeader>
	//   52  100:getfield        #68  <Field int OggUtil$PageHeader.bodySize>
	//   53  103:istore          5
		int j = pageHeader.headerSize;
	//   54  105:aload_0         
	//   55  106:getfield        #23  <Field OggUtil$PageHeader pageHeader>
	//   56  109:getfield        #71  <Field int OggUtil$PageHeader.headerSize>
	//   57  112:istore          6
		if(k <= 0)
	//*  58  114:iload           7
	//*  59  116:ifgt            122
			byte0 = 2;
	//   60  119:iconst_2        
	//   61  120:istore          4
		l1 = (i + j) * byte0;
	//   62  122:iload           5
	//   63  124:iload           6
	//   64  126:iadd            
	//   65  127:iload           4
	//   66  129:imul            
	//   67  130:i2l             
	//   68  131:lstore          8
		return (extractorinput.getPosition() - l1) + (l * audioDataLength) / totalSamples;
	//   69  133:aload_3         
	//   70  134:invokeinterface #75  <Method long ExtractorInput.getPosition()>
	//   71  139:lload           8
	//   72  141:lsub            
	//   73  142:lload_1         
	//   74  143:aload_0         
	//   75  144:getfield        #34  <Field long audioDataLength>
	//   76  147:lmul            
	//   77  148:aload_0         
	//   78  149:getfield        #43  <Field long totalSamples>
	//   79  152:ldiv            
	//   80  153:ladd            
	//   81  154:lreturn         
	}

	public void setup(long l, long l1)
	{
		boolean flag;
		if(l > 0L && l1 > 0L)
	//*   0    0:lload_1         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifle            18
	//*   4    6:lload_3         
	//*   5    7:lconst_0        
	//*   6    8:lcmp            
	//*   7    9:ifle            18
			flag = true;
	//    8   12:iconst_1        
	//    9   13:istore          5
		else
	//*  10   15:goto            21
			flag = false;
	//   11   18:iconst_0        
	//   12   19:istore          5
		Assertions.checkArgument(flag);
	//   13   21:iload           5
	//   14   23:invokestatic    #81  <Method void Assertions.checkArgument(boolean)>
		audioDataLength = l;
	//   15   26:aload_0         
	//   16   27:lload_1         
	//   17   28:putfield        #34  <Field long audioDataLength>
		totalSamples = l1;
	//   18   31:aload_0         
	//   19   32:lload_3         
	//   20   33:putfield        #43  <Field long totalSamples>
	//   21   36:return          
	}

	private static final int MATCH_RANGE = 0x11940;
	private long audioDataLength;
	private final ParsableByteArray headerArray = new ParsableByteArray(282);
	private final OggUtil.PageHeader pageHeader = new OggUtil.PageHeader();
	private long totalSamples;
}
