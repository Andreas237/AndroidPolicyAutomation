// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.mp4;

import com.google.android.exoplayer.util.ParsableByteArray;

// Referenced classes of package com.google.android.exoplayer.extractor.mp4:
//			AtomParsers

static final class AtomParsers$StszSampleSizeBox
	implements AtomParsers.SampleSizeBox
{

	public int getSampleCount()
	{
		return sampleCount;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int sampleCount>
	//    2    4:ireturn         
	}

	public boolean isFixedSampleSize()
	{
		return fixedSampleSize != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int fixedSampleSize>
	//    2    4:ifeq            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public int readNextSampleSize()
	{
		int j = fixedSampleSize;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int fixedSampleSize>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(j == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            19
			i = data.readUnsignedIntToInt();
	//    7   11:aload_0         
	//    8   12:getfield        #24  <Field ParsableByteArray data>
	//    9   15:invokevirtual   #34  <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   10   18:istore_1        
		return i;
	//   11   19:iload_1         
	//   12   20:ireturn         
	}

	private final ParsableByteArray data;
	private final int fixedSampleSize;
	private final int sampleCount;

	public AtomParsers$StszSampleSizeBox(Atom.LeafAtom leafatom)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		data = leafatom.data;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #23  <Field ParsableByteArray Atom$LeafAtom.data>
	//    5    9:putfield        #24  <Field ParsableByteArray data>
		data.setPosition(12);
	//    6   12:aload_0         
	//    7   13:getfield        #24  <Field ParsableByteArray data>
	//    8   16:bipush          12
	//    9   18:invokevirtual   #30  <Method void ParsableByteArray.setPosition(int)>
		fixedSampleSize = data.readUnsignedIntToInt();
	//   10   21:aload_0         
	//   11   22:aload_0         
	//   12   23:getfield        #24  <Field ParsableByteArray data>
	//   13   26:invokevirtual   #34  <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   14   29:putfield        #36  <Field int fixedSampleSize>
		sampleCount = data.readUnsignedIntToInt();
	//   15   32:aload_0         
	//   16   33:aload_0         
	//   17   34:getfield        #24  <Field ParsableByteArray data>
	//   18   37:invokevirtual   #34  <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   19   40:putfield        #38  <Field int sampleCount>
	//   20   43:return          
	}
}
