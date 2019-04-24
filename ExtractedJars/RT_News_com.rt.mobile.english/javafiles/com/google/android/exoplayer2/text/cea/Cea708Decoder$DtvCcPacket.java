// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.cea;


// Referenced classes of package com.google.android.exoplayer2.text.cea:
//			Cea708Decoder

private static final class Cea708Decoder$DtvCcPacket
{

	int currentIndex;
	public final byte packetData[];
	public final int packetSize;
	public final int sequenceNumber;

	public Cea708Decoder$DtvCcPacket(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		sequenceNumber = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #20  <Field int sequenceNumber>
		packetSize = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #22  <Field int packetSize>
		packetData = new byte[2 * j - 1];
	//    8   14:aload_0         
	//    9   15:iconst_2        
	//   10   16:iload_2         
	//   11   17:imul            
	//   12   18:iconst_1        
	//   13   19:isub            
	//   14   20:newarray        byte[]
	//   15   22:putfield        #24  <Field byte[] packetData>
		currentIndex = 0;
	//   16   25:aload_0         
	//   17   26:iconst_0        
	//   18   27:putfield        #26  <Field int currentIndex>
	//   19   30:return          
	}
}
