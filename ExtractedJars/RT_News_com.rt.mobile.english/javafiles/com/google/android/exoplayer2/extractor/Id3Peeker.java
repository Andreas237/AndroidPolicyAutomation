// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.EOFException;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.extractor:
//			ExtractorInput

public final class Id3Peeker
{

	public Id3Peeker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #12  <Class ParsableByteArray>
	//    4    8:dup             
	//    5    9:bipush          10
	//    6   11:invokespecial   #15  <Method void ParsableByteArray(int)>
	//    7   14:putfield        #17  <Field ParsableByteArray scratch>
	//    8   17:return          
	}

	public Metadata peekId3Data(ExtractorInput extractorinput, com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate framepredicate)
		throws IOException, InterruptedException
	{
		int i;
		Object obj;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		i = 0;
	//    2    3:iconst_0        
	//    3    4:istore_3        
_L2:
		extractorinput.peekFully(scratch.data, 0, 10);
	//    4    5:aload_1         
	//    5    6:aload_0         
	//    6    7:getfield        #17  <Field ParsableByteArray scratch>
	//    7   10:getfield        #31  <Field byte[] ParsableByteArray.data>
	//    8   13:iconst_0        
	//    9   14:bipush          10
	//   10   16:invokeinterface #37  <Method void ExtractorInput.peekFully(byte[], int, int)>
		scratch.setPosition(0);
	//   11   21:aload_0         
	//   12   22:getfield        #17  <Field ParsableByteArray scratch>
	//   13   25:iconst_0        
	//   14   26:invokevirtual   #40  <Method void ParsableByteArray.setPosition(int)>
		if(scratch.readUnsignedInt24() != Id3Decoder.ID3_TAG)
	//*  15   29:aload_0         
	//*  16   30:getfield        #17  <Field ParsableByteArray scratch>
	//*  17   33:invokevirtual   #44  <Method int ParsableByteArray.readUnsignedInt24()>
	//*  18   36:getstatic       #50  <Field int Id3Decoder.ID3_TAG>
	//*  19   39:icmpeq          45
			break; /* Loop/switch isn't completed */
	//   20   42:goto            144
		scratch.skipBytes(3);
	//   21   45:aload_0         
	//   22   46:getfield        #17  <Field ParsableByteArray scratch>
	//   23   49:iconst_3        
	//   24   50:invokevirtual   #53  <Method void ParsableByteArray.skipBytes(int)>
		int j = scratch.readSynchSafeInt();
	//   25   53:aload_0         
	//   26   54:getfield        #17  <Field ParsableByteArray scratch>
	//   27   57:invokevirtual   #56  <Method int ParsableByteArray.readSynchSafeInt()>
	//   28   60:istore          4
		int k = 10 + j;
	//   29   62:bipush          10
	//   30   64:iload           4
	//   31   66:iadd            
	//   32   67:istore          5
		if(obj == null)
	//*  33   69:aload           6
	//*  34   71:ifnonnull       128
		{
			obj = ((Object) (new byte[k]));
	//   35   74:iload           5
	//   36   76:newarray        byte[]
	//   37   78:astore          6
			System.arraycopy(((Object) (scratch.data)), 0, obj, 0, 10);
	//   38   80:aload_0         
	//   39   81:getfield        #17  <Field ParsableByteArray scratch>
	//   40   84:getfield        #31  <Field byte[] ParsableByteArray.data>
	//   41   87:iconst_0        
	//   42   88:aload           6
	//   43   90:iconst_0        
	//   44   91:bipush          10
	//   45   93:invokestatic    #62  <Method void System.arraycopy(Object, int, Object, int, int)>
			extractorinput.peekFully(((byte []) (obj)), 10, j);
	//   46   96:aload_1         
	//   47   97:aload           6
	//   48   99:bipush          10
	//   49  101:iload           4
	//   50  103:invokeinterface #37  <Method void ExtractorInput.peekFully(byte[], int, int)>
			obj = ((Object) ((new Id3Decoder(framepredicate)).decode(((byte []) (obj)), k)));
	//   51  108:new             #46  <Class Id3Decoder>
	//   52  111:dup             
	//   53  112:aload_2         
	//   54  113:invokespecial   #65  <Method void Id3Decoder(com.google.android.exoplayer2.metadata.id3.Id3Decoder$FramePredicate)>
	//   55  116:aload           6
	//   56  118:iload           5
	//   57  120:invokevirtual   #69  <Method Metadata Id3Decoder.decode(byte[], int)>
	//   58  123:astore          6
		} else
	//*  59  125:goto            136
		{
			extractorinput.advancePeekPosition(j);
	//   60  128:aload_1         
	//   61  129:iload           4
	//   62  131:invokeinterface #72  <Method void ExtractorInput.advancePeekPosition(int)>
		}
		i += k;
	//   63  136:iload_3         
	//   64  137:iload           5
	//   65  139:iadd            
	//   66  140:istore_3        
		if(true) goto _L2; else goto _L1
	//   67  141:goto            5
_L1:
		extractorinput.resetPeekPosition();
	//   68  144:aload_1         
	//   69  145:invokeinterface #75  <Method void ExtractorInput.resetPeekPosition()>
		extractorinput.advancePeekPosition(i);
	//   70  150:aload_1         
	//   71  151:iload_3         
	//   72  152:invokeinterface #72  <Method void ExtractorInput.advancePeekPosition(int)>
		return ((Metadata) (obj));
	//   73  157:aload           6
	//   74  159:areturn         
		framepredicate;
	//   75  160:astore_2        
		if(true) goto _L1; else goto _L3
_L3:
	//*  76  161:goto            144
	}

	private final ParsableByteArray scratch = new ParsableByteArray(10);
}
