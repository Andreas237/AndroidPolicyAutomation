// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.ts;

import android.util.Log;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.extractor.TrackOutput;
import com.google.android.exoplayer.util.ParsableByteArray;

// Referenced classes of package com.google.android.exoplayer.extractor.ts:
//			ElementaryStreamReader

final class Id3Reader extends ElementaryStreamReader
{

	public Id3Reader(TrackOutput trackoutput)
	{
		super(trackoutput);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void ElementaryStreamReader(TrackOutput)>
		trackoutput.format(MediaFormat.createId3Format());
	//    3    5:aload_1         
	//    4    6:invokestatic    #29  <Method MediaFormat MediaFormat.createId3Format()>
	//    5    9:invokeinterface #35  <Method void TrackOutput.format(MediaFormat)>
	//    6   14:aload_0         
	//    7   15:new             #37  <Class ParsableByteArray>
	//    8   18:dup             
	//    9   19:bipush          10
	//   10   21:invokespecial   #40  <Method void ParsableByteArray(int)>
	//   11   24:putfield        #42  <Field ParsableByteArray id3Header>
	//   12   27:return          
	}

	public void consume(ParsableByteArray parsablebytearray)
	{
		if(!writingSample)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field boolean writingSample>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		int i = parsablebytearray.bytesLeft();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #51  <Method int ParsableByteArray.bytesLeft()>
	//    6   12:istore_2        
		int j = sampleBytesRead;
	//    7   13:aload_0         
	//    8   14:getfield        #53  <Field int sampleBytesRead>
	//    9   17:istore_3        
		if(j < 10)
	//*  10   18:iload_3         
	//*  11   19:bipush          10
	//*  12   21:icmpge          153
		{
			j = Math.min(i, 10 - j);
	//   13   24:iload_2         
	//   14   25:bipush          10
	//   15   27:iload_3         
	//   16   28:isub            
	//   17   29:invokestatic    #59  <Method int Math.min(int, int)>
	//   18   32:istore_3        
			System.arraycopy(((Object) (parsablebytearray.data)), parsablebytearray.getPosition(), ((Object) (id3Header.data)), sampleBytesRead, j);
	//   19   33:aload_1         
	//   20   34:getfield        #63  <Field byte[] ParsableByteArray.data>
	//   21   37:aload_1         
	//   22   38:invokevirtual   #66  <Method int ParsableByteArray.getPosition()>
	//   23   41:aload_0         
	//   24   42:getfield        #42  <Field ParsableByteArray id3Header>
	//   25   45:getfield        #63  <Field byte[] ParsableByteArray.data>
	//   26   48:aload_0         
	//   27   49:getfield        #53  <Field int sampleBytesRead>
	//   28   52:iload_3         
	//   29   53:invokestatic    #72  <Method void System.arraycopy(Object, int, Object, int, int)>
			if(sampleBytesRead + j == 10)
	//*  30   56:aload_0         
	//*  31   57:getfield        #53  <Field int sampleBytesRead>
	//*  32   60:iload_3         
	//*  33   61:iadd            
	//*  34   62:bipush          10
	//*  35   64:icmpne          153
			{
				id3Header.setPosition(0);
	//   36   67:aload_0         
	//   37   68:getfield        #42  <Field ParsableByteArray id3Header>
	//   38   71:iconst_0        
	//   39   72:invokevirtual   #75  <Method void ParsableByteArray.setPosition(int)>
				if(73 == id3Header.readUnsignedByte() && 68 == id3Header.readUnsignedByte() && 51 == id3Header.readUnsignedByte())
	//*  40   75:bipush          73
	//*  41   77:aload_0         
	//*  42   78:getfield        #42  <Field ParsableByteArray id3Header>
	//*  43   81:invokevirtual   #78  <Method int ParsableByteArray.readUnsignedByte()>
	//*  44   84:icmpne          139
	//*  45   87:bipush          68
	//*  46   89:aload_0         
	//*  47   90:getfield        #42  <Field ParsableByteArray id3Header>
	//*  48   93:invokevirtual   #78  <Method int ParsableByteArray.readUnsignedByte()>
	//*  49   96:icmpne          139
	//*  50   99:bipush          51
	//*  51  101:aload_0         
	//*  52  102:getfield        #42  <Field ParsableByteArray id3Header>
	//*  53  105:invokevirtual   #78  <Method int ParsableByteArray.readUnsignedByte()>
	//*  54  108:icmpeq          114
	//*  55  111:goto            139
				{
					id3Header.skipBytes(3);
	//   56  114:aload_0         
	//   57  115:getfield        #42  <Field ParsableByteArray id3Header>
	//   58  118:iconst_3        
	//   59  119:invokevirtual   #81  <Method void ParsableByteArray.skipBytes(int)>
					sampleSize = id3Header.readSynchSafeInt() + 10;
	//   60  122:aload_0         
	//   61  123:aload_0         
	//   62  124:getfield        #42  <Field ParsableByteArray id3Header>
	//   63  127:invokevirtual   #84  <Method int ParsableByteArray.readSynchSafeInt()>
	//   64  130:bipush          10
	//   65  132:iadd            
	//   66  133:putfield        #86  <Field int sampleSize>
				} else
	//*  67  136:goto            153
				{
					Log.w("Id3Reader", "Discarding invalid ID3 tag");
	//   68  139:ldc1            #11  <String "Id3Reader">
	//   69  141:ldc1            #88  <String "Discarding invalid ID3 tag">
	//   70  143:invokestatic    #94  <Method int Log.w(String, String)>
	//   71  146:pop             
					writingSample = false;
	//   72  147:aload_0         
	//   73  148:iconst_0        
	//   74  149:putfield        #47  <Field boolean writingSample>
					return;
	//   75  152:return          
				}
			}
		}
		i = Math.min(i, sampleSize - sampleBytesRead);
	//   76  153:iload_2         
	//   77  154:aload_0         
	//   78  155:getfield        #86  <Field int sampleSize>
	//   79  158:aload_0         
	//   80  159:getfield        #53  <Field int sampleBytesRead>
	//   81  162:isub            
	//   82  163:invokestatic    #59  <Method int Math.min(int, int)>
	//   83  166:istore_2        
		output.sampleData(parsablebytearray, i);
	//   84  167:aload_0         
	//   85  168:getfield        #98  <Field TrackOutput output>
	//   86  171:aload_1         
	//   87  172:iload_2         
	//   88  173:invokeinterface #102 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
		sampleBytesRead = sampleBytesRead + i;
	//   89  178:aload_0         
	//   90  179:aload_0         
	//   91  180:getfield        #53  <Field int sampleBytesRead>
	//   92  183:iload_2         
	//   93  184:iadd            
	//   94  185:putfield        #53  <Field int sampleBytesRead>
	//   95  188:return          
	}

	public void packetFinished()
	{
		if(writingSample)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field boolean writingSample>
	//*   2    4:ifeq            51
		{
			int i = sampleSize;
	//    3    7:aload_0         
	//    4    8:getfield        #86  <Field int sampleSize>
	//    5   11:istore_1        
			if(i != 0)
	//*   6   12:iload_1         
	//*   7   13:ifeq            51
				if(sampleBytesRead != i)
	//*   8   16:aload_0         
	//*   9   17:getfield        #53  <Field int sampleBytesRead>
	//*  10   20:iload_1         
	//*  11   21:icmpeq          25
				{
					return;
	//   12   24:return          
				} else
				{
					output.sampleMetadata(sampleTimeUs, 1, sampleSize, 0, ((byte []) (null)));
	//   13   25:aload_0         
	//   14   26:getfield        #98  <Field TrackOutput output>
	//   15   29:aload_0         
	//   16   30:getfield        #106 <Field long sampleTimeUs>
	//   17   33:iconst_1        
	//   18   34:aload_0         
	//   19   35:getfield        #86  <Field int sampleSize>
	//   20   38:iconst_0        
	//   21   39:aconst_null     
	//   22   40:invokeinterface #110 <Method void TrackOutput.sampleMetadata(long, int, int, int, byte[])>
					writingSample = false;
	//   23   45:aload_0         
	//   24   46:iconst_0        
	//   25   47:putfield        #47  <Field boolean writingSample>
					return;
	//   26   50:return          
				}
		}
	//   27   51:return          
	}

	public void packetStarted(long l, boolean flag)
	{
		if(!flag)
	//*   0    0:iload_3         
	//*   1    1:ifne            5
		{
			return;
	//    2    4:return          
		} else
		{
			writingSample = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #47  <Field boolean writingSample>
			sampleTimeUs = l;
	//    6   10:aload_0         
	//    7   11:lload_1         
	//    8   12:putfield        #106 <Field long sampleTimeUs>
			sampleSize = 0;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #86  <Field int sampleSize>
			sampleBytesRead = 0;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #53  <Field int sampleBytesRead>
			return;
	//   15   25:return          
		}
	}

	public void seek()
	{
		writingSample = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #47  <Field boolean writingSample>
	//    3    5:return          
	}

	private static final int ID3_HEADER_SIZE = 10;
	private static final String TAG = "Id3Reader";
	private final ParsableByteArray id3Header = new ParsableByteArray(10);
	private int sampleBytesRead;
	private int sampleSize;
	private long sampleTimeUs;
	private boolean writingSample;
}
