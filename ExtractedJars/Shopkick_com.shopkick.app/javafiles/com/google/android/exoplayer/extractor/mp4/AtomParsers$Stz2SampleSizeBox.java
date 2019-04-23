// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.mp4;

import com.google.android.exoplayer.util.ParsableByteArray;

// Referenced classes of package com.google.android.exoplayer.extractor.mp4:
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
		int i = fieldSize;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int fieldSize>
	//    2    4:istore_1        
		if(i == 8)
	//*   3    5:iload_1         
	//*   4    6:bipush          8
	//*   5    8:icmpne          19
			return data.readUnsignedByte();
	//    6   11:aload_0         
	//    7   12:getfield        #26  <Field ParsableByteArray data>
	//    8   15:invokevirtual   #48  <Method int ParsableByteArray.readUnsignedByte()>
	//    9   18:ireturn         
		if(i == 16)
	//*  10   19:iload_1         
	//*  11   20:bipush          16
	//*  12   22:icmpne          33
			return data.readUnsignedShort();
	//   13   25:aload_0         
	//   14   26:getfield        #26  <Field ParsableByteArray data>
	//   15   29:invokevirtual   #51  <Method int ParsableByteArray.readUnsignedShort()>
	//   16   32:ireturn         
		i = sampleIndex;
	//   17   33:aload_0         
	//   18   34:getfield        #53  <Field int sampleIndex>
	//   19   37:istore_1        
		sampleIndex = i + 1;
	//   20   38:aload_0         
	//   21   39:iload_1         
	//   22   40:iconst_1        
	//   23   41:iadd            
	//   24   42:putfield        #53  <Field int sampleIndex>
		if(i % 2 == 0)
	//*  25   45:iload_1         
	//*  26   46:iconst_2        
	//*  27   47:irem            
	//*  28   48:ifne            73
		{
			currentByte = data.readUnsignedByte();
	//   29   51:aload_0         
	//   30   52:aload_0         
	//   31   53:getfield        #26  <Field ParsableByteArray data>
	//   32   56:invokevirtual   #48  <Method int ParsableByteArray.readUnsignedByte()>
	//   33   59:putfield        #55  <Field int currentByte>
			return (currentByte & 0xf0) >> 4;
	//   34   62:aload_0         
	//   35   63:getfield        #55  <Field int currentByte>
	//   36   66:sipush          240
	//   37   69:iand            
	//   38   70:iconst_4        
	//   39   71:ishr            
	//   40   72:ireturn         
		} else
		{
			return currentByte & 0xf;
	//   41   73:aload_0         
	//   42   74:getfield        #55  <Field int currentByte>
	//   43   77:bipush          15
	//   44   79:iand            
	//   45   80:ireturn         
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
