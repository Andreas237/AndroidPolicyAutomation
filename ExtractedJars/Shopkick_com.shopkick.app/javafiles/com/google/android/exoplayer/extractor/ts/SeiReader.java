// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.ts;

import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.extractor.TrackOutput;
import com.google.android.exoplayer.text.eia608.Eia608Parser;
import com.google.android.exoplayer.util.ParsableByteArray;

final class SeiReader
{

	public SeiReader(TrackOutput trackoutput)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		output = trackoutput;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field TrackOutput output>
		trackoutput.format(MediaFormat.createTextFormat(((String) (null)), "application/eia-608", -1, -1L, ((String) (null))));
	//    5    9:aload_1         
	//    6   10:aconst_null     
	//    7   11:ldc1            #15  <String "application/eia-608">
	//    8   13:iconst_m1       
	//    9   14:ldc2w           #16  <Long -1L>
	//   10   17:aconst_null     
	//   11   18:invokestatic    #23  <Method MediaFormat MediaFormat.createTextFormat(String, String, int, long, String)>
	//   12   21:invokeinterface #29  <Method void TrackOutput.format(MediaFormat)>
	//   13   26:return          
	}

	public void consume(long l, ParsableByteArray parsablebytearray)
	{
		while(parsablebytearray.bytesLeft() > 1) 
	//*   0    0:aload_3         
	//*   1    1:invokevirtual   #38  <Method int ParsableByteArray.bytesLeft()>
	//*   2    4:iconst_1        
	//*   3    5:icmple          117
		{
			int k = 0;
	//    4    8:iconst_0        
	//    5    9:istore          6
			int i = 0;
	//    6   11:iconst_0        
	//    7   12:istore          4
			int j;
			int i1;
			do
			{
				i1 = parsablebytearray.readUnsignedByte();
	//    8   14:aload_3         
	//    9   15:invokevirtual   #41  <Method int ParsableByteArray.readUnsignedByte()>
	//   10   18:istore          7
				j = i + i1;
	//   11   20:iload           4
	//   12   22:iload           7
	//   13   24:iadd            
	//   14   25:istore          5
				i = j;
	//   15   27:iload           5
	//   16   29:istore          4
			} while(i1 == 255);
	//   17   31:iload           7
	//   18   33:sipush          255
	//   19   36:icmpeq          14
			i = k;
	//   20   39:iload           6
	//   21   41:istore          4
			do
			{
				k = parsablebytearray.readUnsignedByte();
	//   22   43:aload_3         
	//   23   44:invokevirtual   #41  <Method int ParsableByteArray.readUnsignedByte()>
	//   24   47:istore          6
				i += k;
	//   25   49:iload           4
	//   26   51:iload           6
	//   27   53:iadd            
	//   28   54:istore          4
			} while(k == 255);
	//   29   56:iload           6
	//   30   58:sipush          255
	//   31   61:icmpeq          114
			if(Eia608Parser.isSeiMessageEia608(j, i, parsablebytearray))
	//*  32   64:iload           5
	//*  33   66:iload           4
	//*  34   68:aload_3         
	//*  35   69:invokestatic    #47  <Method boolean Eia608Parser.isSeiMessageEia608(int, int, ParsableByteArray)>
	//*  36   72:ifeq            105
			{
				output.sampleData(parsablebytearray, i);
	//   37   75:aload_0         
	//   38   76:getfield        #13  <Field TrackOutput output>
	//   39   79:aload_3         
	//   40   80:iload           4
	//   41   82:invokeinterface #51  <Method void TrackOutput.sampleData(ParsableByteArray, int)>
				output.sampleMetadata(l, 1, i, 0, ((byte []) (null)));
	//   42   87:aload_0         
	//   43   88:getfield        #13  <Field TrackOutput output>
	//   44   91:lload_1         
	//   45   92:iconst_1        
	//   46   93:iload           4
	//   47   95:iconst_0        
	//   48   96:aconst_null     
	//   49   97:invokeinterface #55  <Method void TrackOutput.sampleMetadata(long, int, int, int, byte[])>
			} else
	//*  50  102:goto            0
			{
				parsablebytearray.skipBytes(i);
	//   51  105:aload_3         
	//   52  106:iload           4
	//   53  108:invokevirtual   #59  <Method void ParsableByteArray.skipBytes(int)>
			}
		}
	//*  54  111:goto            0
	//*  55  114:goto            43
	//   56  117:return          
	}

	private final TrackOutput output;
}
