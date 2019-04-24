// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.ParsableByteArray;

// Referenced classes of package com.google.android.exoplayer2.extractor.mp4:
//			AtomParsers

static final class AtomParsers$Stz2SampleSizeBox
	implements AtomParsers.SampleSizeBox
{

	public int getSampleCount()
	{
		return sampleCount;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int sampleCount>
	//    2    4:ireturn         
	}

	public boolean isFixedSampleSize()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int readNextSampleSize()
	{
		if(fieldSize == 8)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field int fieldSize>
	//*   2    4:bipush          8
	//*   3    6:icmpne          17
			return data.readUnsignedByte();
	//    4    9:aload_0         
	//    5   10:getfield        #26  <Field ParsableByteArray data>
	//    6   13:invokevirtual   #48  <Method int ParsableByteArray.readUnsignedByte()>
	//    7   16:ireturn         
		if(fieldSize == 16)
	//*   8   17:aload_0         
	//*   9   18:getfield        #38  <Field int fieldSize>
	//*  10   21:bipush          16
	//*  11   23:icmpne          34
			return data.readUnsignedShort();
	//   12   26:aload_0         
	//   13   27:getfield        #26  <Field ParsableByteArray data>
	//   14   30:invokevirtual   #51  <Method int ParsableByteArray.readUnsignedShort()>
	//   15   33:ireturn         
		int i = sampleIndex;
	//   16   34:aload_0         
	//   17   35:getfield        #53  <Field int sampleIndex>
	//   18   38:istore_1        
		sampleIndex = i + 1;
	//   19   39:aload_0         
	//   20   40:iload_1         
	//   21   41:iconst_1        
	//   22   42:iadd            
	//   23   43:putfield        #53  <Field int sampleIndex>
		if(i % 2 == 0)
	//*  24   46:iload_1         
	//*  25   47:iconst_2        
	//*  26   48:irem            
	//*  27   49:ifne            74
		{
			currentByte = data.readUnsignedByte();
	//   28   52:aload_0         
	//   29   53:aload_0         
	//   30   54:getfield        #26  <Field ParsableByteArray data>
	//   31   57:invokevirtual   #48  <Method int ParsableByteArray.readUnsignedByte()>
	//   32   60:putfield        #55  <Field int currentByte>
			return (currentByte & 0xf0) >> 4;
	//   33   63:aload_0         
	//   34   64:getfield        #55  <Field int currentByte>
	//   35   67:sipush          240
	//   36   70:iand            
	//   37   71:iconst_4        
	//   38   72:ishr            
	//   39   73:ireturn         
		} else
		{
			return currentByte & 0xf;
	//   40   74:aload_0         
	//   41   75:getfield        #55  <Field int currentByte>
	//   42   78:bipush          15
	//   43   80:iand            
	//   44   81:ireturn         
		}
	}

	private int currentByte;
	private final ParsableByteArray data;
	private final int fieldSize;
	private final int sampleCount;
	private int sampleIndex;

	public AtomParsers$Stz2SampleSizeBox(Atom.LeafAtom leafatom)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		data = leafatom.data;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #25  <Field ParsableByteArray Atom$LeafAtom.data>
	//    5    9:putfield        #26  <Field ParsableByteArray data>
		data.setPosition(12);
	//    6   12:aload_0         
	//    7   13:getfield        #26  <Field ParsableByteArray data>
	//    8   16:bipush          12
	//    9   18:invokevirtual   #32  <Method void ParsableByteArray.setPosition(int)>
		fieldSize = data.readUnsignedIntToInt() & 0xff;
	//   10   21:aload_0         
	//   11   22:aload_0         
	//   12   23:getfield        #26  <Field ParsableByteArray data>
	//   13   26:invokevirtual   #36  <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   14   29:sipush          255
	//   15   32:iand            
	//   16   33:putfield        #38  <Field int fieldSize>
		sampleCount = data.readUnsignedIntToInt();
	//   17   36:aload_0         
	//   18   37:aload_0         
	//   19   38:getfield        #26  <Field ParsableByteArray data>
	//   20   41:invokevirtual   #36  <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   21   44:putfield        #40  <Field int sampleCount>
	//   22   47:return          
	}
}
