// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ogg;


// Referenced classes of package com.google.android.exoplayer2.extractor.ogg:
//			VorbisUtil

public static final class VorbisUtil$VorbisIdHeader
{

	public int getApproximateBitrate()
	{
		if(bitrateNominal == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field int bitrateNominal>
	//*   2    4:ifne            19
			return (bitrateMin + bitrateMax) / 2;
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field int bitrateMin>
	//    5   11:aload_0         
	//    6   12:getfield        #34  <Field int bitrateMax>
	//    7   15:iadd            
	//    8   16:iconst_2        
	//    9   17:idiv            
	//   10   18:ireturn         
		else
			return bitrateNominal;
	//   11   19:aload_0         
	//   12   20:getfield        #36  <Field int bitrateNominal>
	//   13   23:ireturn         
	}

	public final int bitrateMax;
	public final int bitrateMin;
	public final int bitrateNominal;
	public final int blockSize0;
	public final int blockSize1;
	public final int channels;
	public final byte data[];
	public final boolean framingFlag;
	public final long sampleRate;
	public final long version;

	public VorbisUtil$VorbisIdHeader(long l, int i, long l1, int j, int k, 
			int i1, int j1, int k1, boolean flag, byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		version = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #28  <Field long version>
		channels = i;
	//    5    9:aload_0         
	//    6   10:iload_3         
	//    7   11:putfield        #30  <Field int channels>
		sampleRate = l1;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #32  <Field long sampleRate>
		bitrateMax = j;
	//   11   20:aload_0         
	//   12   21:iload           6
	//   13   23:putfield        #34  <Field int bitrateMax>
		bitrateNominal = k;
	//   14   26:aload_0         
	//   15   27:iload           7
	//   16   29:putfield        #36  <Field int bitrateNominal>
		bitrateMin = i1;
	//   17   32:aload_0         
	//   18   33:iload           8
	//   19   35:putfield        #38  <Field int bitrateMin>
		blockSize0 = j1;
	//   20   38:aload_0         
	//   21   39:iload           9
	//   22   41:putfield        #40  <Field int blockSize0>
		blockSize1 = k1;
	//   23   44:aload_0         
	//   24   45:iload           10
	//   25   47:putfield        #42  <Field int blockSize1>
		framingFlag = flag;
	//   26   50:aload_0         
	//   27   51:iload           11
	//   28   53:putfield        #44  <Field boolean framingFlag>
		data = abyte0;
	//   29   56:aload_0         
	//   30   57:aload           12
	//   31   59:putfield        #46  <Field byte[] data>
	//   32   62:return          
	}
}
