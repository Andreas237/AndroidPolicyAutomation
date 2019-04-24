// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.amr;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.*;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

public final class AmrExtractor
	implements Extractor
{

	public AmrExtractor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:newarray        byte[]
	//    5    8:putfield        #65  <Field byte[] scratch>
	//    6   11:return          
	}

	static byte[] amrSignatureNb()
	{
		return Arrays.copyOf(amrSignatureNb, amrSignatureNb.length);
	//    0    0:getstatic       #55  <Field byte[] amrSignatureNb>
	//    1    3:getstatic       #55  <Field byte[] amrSignatureNb>
	//    2    6:arraylength     
	//    3    7:invokestatic    #72  <Method byte[] Arrays.copyOf(byte[], int)>
	//    4   10:areturn         
	}

	static byte[] amrSignatureWb()
	{
		return Arrays.copyOf(amrSignatureWb, amrSignatureWb.length);
	//    0    0:getstatic       #59  <Field byte[] amrSignatureWb>
	//    1    3:getstatic       #59  <Field byte[] amrSignatureWb>
	//    2    6:arraylength     
	//    3    7:invokestatic    #72  <Method byte[] Arrays.copyOf(byte[], int)>
	//    4   10:areturn         
	}

	static int frameSizeBytesByTypeNb(int i)
	{
		return frameSizeBytesByTypeNb[i];
	//    0    0:getstatic       #43  <Field int[] frameSizeBytesByTypeNb>
	//    1    3:iload_0         
	//    2    4:iaload          
	//    3    5:ireturn         
	}

	static int frameSizeBytesByTypeWb(int i)
	{
		return frameSizeBytesByTypeWb[i];
	//    0    0:getstatic       #45  <Field int[] frameSizeBytesByTypeWb>
	//    1    3:iload_0         
	//    2    4:iaload          
	//    3    5:ireturn         
	}

	private int getFrameSizeInBytes(int i)
		throws ParserException
	{
		if(!isValidFrameType(i))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:invokespecial   #80  <Method boolean isValidFrameType(int)>
	//*   3    5:ifne            70
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #82  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #83  <Method void StringBuilder()>
	//    7   15:astore_3        
			stringbuilder.append("Illegal AMR ");
	//    8   16:aload_3         
	//    9   17:ldc1            #85  <String "Illegal AMR ">
	//   10   19:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
			String s;
			if(isWideBand)
	//*  12   23:aload_0         
	//*  13   24:getfield        #91  <Field boolean isWideBand>
	//*  14   27:ifeq            36
				s = "WB";
	//   15   30:ldc1            #93  <String "WB">
	//   16   32:astore_2        
			else
	//*  17   33:goto            39
				s = "NB";
	//   18   36:ldc1            #95  <String "NB">
	//   19   38:astore_2        
			stringbuilder.append(s);
	//   20   39:aload_3         
	//   21   40:aload_2         
	//   22   41:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
			stringbuilder.append(" frame type ");
	//   24   45:aload_3         
	//   25   46:ldc1            #97  <String " frame type ">
	//   26   48:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   27   51:pop             
			stringbuilder.append(i);
	//   28   52:aload_3         
	//   29   53:iload_1         
	//   30   54:invokevirtual   #100 <Method StringBuilder StringBuilder.append(int)>
	//   31   57:pop             
			throw new ParserException(stringbuilder.toString());
	//   32   58:new             #76  <Class ParserException>
	//   33   61:dup             
	//   34   62:aload_3         
	//   35   63:invokevirtual   #104 <Method String StringBuilder.toString()>
	//   36   66:invokespecial   #107 <Method void ParserException(String)>
	//   37   69:athrow          
		}
		if(isWideBand)
	//*  38   70:aload_0         
	//*  39   71:getfield        #91  <Field boolean isWideBand>
	//*  40   74:ifeq            83
			return frameSizeBytesByTypeWb[i];
	//   41   77:getstatic       #45  <Field int[] frameSizeBytesByTypeWb>
	//   42   80:iload_1         
	//   43   81:iaload          
	//   44   82:ireturn         
		else
			return frameSizeBytesByTypeNb[i];
	//   45   83:getstatic       #43  <Field int[] frameSizeBytesByTypeNb>
	//   46   86:iload_1         
	//   47   87:iaload          
	//   48   88:ireturn         
	}

	private boolean isNarrowBandValidFrameType(int i)
	{
		return !isWideBand && (i < 12 || i > 14);
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field boolean isWideBand>
	//    2    4:ifne            21
	//    3    7:iload_1         
	//    4    8:bipush          12
	//    5   10:icmplt          19
	//    6   13:iload_1         
	//    7   14:bipush          14
	//    8   16:icmple          21
	//    9   19:iconst_1        
	//   10   20:ireturn         
	//   11   21:iconst_0        
	//   12   22:ireturn         
	}

	private boolean isValidFrameType(int i)
	{
		return i >= 0 && i <= 15 && (isWideBandValidFrameType(i) || isNarrowBandValidFrameType(i));
	//    0    0:iload_1         
	//    1    1:iflt            28
	//    2    4:iload_1         
	//    3    5:bipush          15
	//    4    7:icmpgt          28
	//    5   10:aload_0         
	//    6   11:iload_1         
	//    7   12:invokespecial   #112 <Method boolean isWideBandValidFrameType(int)>
	//    8   15:ifne            26
	//    9   18:aload_0         
	//   10   19:iload_1         
	//   11   20:invokespecial   #114 <Method boolean isNarrowBandValidFrameType(int)>
	//   12   23:ifeq            28
	//   13   26:iconst_1        
	//   14   27:ireturn         
	//   15   28:iconst_0        
	//   16   29:ireturn         
	}

	private boolean isWideBandValidFrameType(int i)
	{
		return isWideBand && (i < 10 || i > 13);
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field boolean isWideBand>
	//    2    4:ifeq            21
	//    3    7:iload_1         
	//    4    8:bipush          10
	//    5   10:icmplt          19
	//    6   13:iload_1         
	//    7   14:bipush          13
	//    8   16:icmple          21
	//    9   19:iconst_1        
	//   10   20:ireturn         
	//   11   21:iconst_0        
	//   12   22:ireturn         
	}

	private void maybeOutputFormat()
	{
		if(!hasOutputFormat)
	//*   0    0:aload_0         
	//*   1    1:getfield        #117 <Field boolean hasOutputFormat>
	//*   2    4:ifne            78
		{
			hasOutputFormat = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #117 <Field boolean hasOutputFormat>
			String s;
			if(isWideBand)
	//*   6   12:aload_0         
	//*   7   13:getfield        #91  <Field boolean isWideBand>
	//*   8   16:ifeq            25
				s = "audio/amr-wb";
	//    9   19:ldc1            #119 <String "audio/amr-wb">
	//   10   21:astore_2        
			else
	//*  11   22:goto            31
				s = "audio/3gpp";
	//   12   25:ldc1            #121 <String "audio/3gpp">
	//   13   27:astore_2        
	//*  14   28:goto            22
			char c;
			if(isWideBand)
	//*  15   31:aload_0         
	//*  16   32:getfield        #91  <Field boolean isWideBand>
	//*  17   35:ifeq            45
				c = '\u3E80';
	//   18   38:sipush          16000
	//   19   41:istore_1        
			else
	//*  20   42:goto            52
				c = '\u1F40';
	//   21   45:sipush          8000
	//   22   48:istore_1        
	//*  23   49:goto            42
			trackOutput.format(Format.createAudioSampleFormat(((String) (null)), s, ((String) (null)), -1, MAX_FRAME_SIZE_BYTES, 1, ((int) (c)), -1, ((java.util.List) (null)), ((com.google.android.exoplayer2.drm.DrmInitData) (null)), 0, ((String) (null))));
	//   24   52:aload_0         
	//   25   53:getfield        #123 <Field TrackOutput trackOutput>
	//   26   56:aconst_null     
	//   27   57:aload_2         
	//   28   58:aconst_null     
	//   29   59:iconst_m1       
	//   30   60:getstatic       #61  <Field int MAX_FRAME_SIZE_BYTES>
	//   31   63:iconst_1        
	//   32   64:iload_1         
	//   33   65:iconst_m1       
	//   34   66:aconst_null     
	//   35   67:aconst_null     
	//   36   68:iconst_0        
	//   37   69:aconst_null     
	//   38   70:invokestatic    #129 <Method Format Format.createAudioSampleFormat(String, String, String, int, int, int, int, int, java.util.List, com.google.android.exoplayer2.drm.DrmInitData, int, String)>
	//   39   73:invokeinterface #135 <Method void TrackOutput.format(Format)>
		}
	//   40   78:return          
	}

	private boolean peekAmrSignature(ExtractorInput extractorinput, byte abyte0[])
		throws IOException, InterruptedException
	{
		extractorinput.resetPeekPosition();
	//    0    0:aload_1         
	//    1    1:invokeinterface #146 <Method void ExtractorInput.resetPeekPosition()>
		byte abyte1[] = new byte[abyte0.length];
	//    2    6:aload_2         
	//    3    7:arraylength     
	//    4    8:newarray        byte[]
	//    5   10:astore_3        
		extractorinput.peekFully(abyte1, 0, abyte0.length);
	//    6   11:aload_1         
	//    7   12:aload_3         
	//    8   13:iconst_0        
	//    9   14:aload_2         
	//   10   15:arraylength     
	//   11   16:invokeinterface #150 <Method void ExtractorInput.peekFully(byte[], int, int)>
		return Arrays.equals(abyte1, abyte0);
	//   12   21:aload_3         
	//   13   22:aload_2         
	//   14   23:invokestatic    #154 <Method boolean Arrays.equals(byte[], byte[])>
	//   15   26:ireturn         
	}

	private boolean readAmrHeader(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		if(peekAmrSignature(extractorinput, amrSignatureNb))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:getstatic       #55  <Field byte[] amrSignatureNb>
	//*   3    5:invokespecial   #158 <Method boolean peekAmrSignature(ExtractorInput, byte[])>
	//*   4    8:ifeq            28
		{
			isWideBand = false;
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:putfield        #91  <Field boolean isWideBand>
			extractorinput.skipFully(amrSignatureNb.length);
	//    8   16:aload_1         
	//    9   17:getstatic       #55  <Field byte[] amrSignatureNb>
	//   10   20:arraylength     
	//   11   21:invokeinterface #162 <Method void ExtractorInput.skipFully(int)>
			return true;
	//   12   26:iconst_1        
	//   13   27:ireturn         
		}
		if(peekAmrSignature(extractorinput, amrSignatureWb))
	//*  14   28:aload_0         
	//*  15   29:aload_1         
	//*  16   30:getstatic       #59  <Field byte[] amrSignatureWb>
	//*  17   33:invokespecial   #158 <Method boolean peekAmrSignature(ExtractorInput, byte[])>
	//*  18   36:ifeq            56
		{
			isWideBand = true;
	//   19   39:aload_0         
	//   20   40:iconst_1        
	//   21   41:putfield        #91  <Field boolean isWideBand>
			extractorinput.skipFully(amrSignatureWb.length);
	//   22   44:aload_1         
	//   23   45:getstatic       #59  <Field byte[] amrSignatureWb>
	//   24   48:arraylength     
	//   25   49:invokeinterface #162 <Method void ExtractorInput.skipFully(int)>
			return true;
	//   26   54:iconst_1        
	//   27   55:ireturn         
		} else
		{
			return false;
	//   28   56:iconst_0        
	//   29   57:ireturn         
		}
	}

	private int readNextSampleSize(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		extractorinput.resetPeekPosition();
	//    0    0:aload_1         
	//    1    1:invokeinterface #146 <Method void ExtractorInput.resetPeekPosition()>
		extractorinput.peekFully(scratch, 0, 1);
	//    2    6:aload_1         
	//    3    7:aload_0         
	//    4    8:getfield        #65  <Field byte[] scratch>
	//    5   11:iconst_0        
	//    6   12:iconst_1        
	//    7   13:invokeinterface #150 <Method void ExtractorInput.peekFully(byte[], int, int)>
		byte byte0 = scratch[0];
	//    8   18:aload_0         
	//    9   19:getfield        #65  <Field byte[] scratch>
	//   10   22:iconst_0        
	//   11   23:baload          
	//   12   24:istore_2        
		if((byte0 & 0x83) > 0)
	//*  13   25:iload_2         
	//*  14   26:sipush          131
	//*  15   29:iand            
	//*  16   30:ifle            66
		{
			extractorinput = ((ExtractorInput) (new StringBuilder()));
	//   17   33:new             #82  <Class StringBuilder>
	//   18   36:dup             
	//   19   37:invokespecial   #83  <Method void StringBuilder()>
	//   20   40:astore_1        
			((StringBuilder) (extractorinput)).append("Invalid padding bits for frame header ");
	//   21   41:aload_1         
	//   22   42:ldc1            #166 <String "Invalid padding bits for frame header ">
	//   23   44:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   24   47:pop             
			((StringBuilder) (extractorinput)).append(((int) (byte0)));
	//   25   48:aload_1         
	//   26   49:iload_2         
	//   27   50:invokevirtual   #100 <Method StringBuilder StringBuilder.append(int)>
	//   28   53:pop             
			throw new ParserException(((StringBuilder) (extractorinput)).toString());
	//   29   54:new             #76  <Class ParserException>
	//   30   57:dup             
	//   31   58:aload_1         
	//   32   59:invokevirtual   #104 <Method String StringBuilder.toString()>
	//   33   62:invokespecial   #107 <Method void ParserException(String)>
	//   34   65:athrow          
		} else
		{
			return getFrameSizeInBytes(byte0 >> 3 & 0xf);
	//   35   66:aload_0         
	//   36   67:iload_2         
	//   37   68:iconst_3        
	//   38   69:ishr            
	//   39   70:bipush          15
	//   40   72:iand            
	//   41   73:invokespecial   #168 <Method int getFrameSizeInBytes(int)>
	//   42   76:ireturn         
		}
	}

	private int readSample(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		if(currentSampleBytesRemaining == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #173 <Field int currentSampleBytesRemaining>
	//*   2    4:ifne            27
		{
			int i;
			try
			{
				currentSampleTotalBytes = readNextSampleSize(extractorinput);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #175 <Method int readNextSampleSize(ExtractorInput)>
	//    7   13:putfield        #177 <Field int currentSampleTotalBytes>
			}
	//*   8   16:aload_0         
	//*   9   17:aload_0         
	//*  10   18:getfield        #177 <Field int currentSampleTotalBytes>
	//*  11   21:putfield        #173 <Field int currentSampleBytesRemaining>
	//*  12   24:goto            27
	//*  13   27:aload_0         
	//*  14   28:getfield        #123 <Field TrackOutput trackOutput>
	//*  15   31:aload_1         
	//*  16   32:aload_0         
	//*  17   33:getfield        #173 <Field int currentSampleBytesRemaining>
	//*  18   36:iconst_1        
	//*  19   37:invokeinterface #181 <Method int TrackOutput.sampleData(ExtractorInput, int, boolean)>
	//*  20   42:istore_2        
	//*  21   43:iload_2         
	//*  22   44:iconst_m1       
	//*  23   45:icmpne          50
	//*  24   48:iconst_m1       
	//*  25   49:ireturn         
	//*  26   50:aload_0         
	//*  27   51:aload_0         
	//*  28   52:getfield        #173 <Field int currentSampleBytesRemaining>
	//*  29   55:iload_2         
	//*  30   56:isub            
	//*  31   57:putfield        #173 <Field int currentSampleBytesRemaining>
	//*  32   60:aload_0         
	//*  33   61:getfield        #173 <Field int currentSampleBytesRemaining>
	//*  34   64:ifle            69
	//*  35   67:iconst_0        
	//*  36   68:ireturn         
	//*  37   69:aload_0         
	//*  38   70:getfield        #123 <Field TrackOutput trackOutput>
	//*  39   73:aload_0         
	//*  40   74:getfield        #183 <Field long currentSampleTimeUs>
	//*  41   77:iconst_1        
	//*  42   78:aload_0         
	//*  43   79:getfield        #177 <Field int currentSampleTotalBytes>
	//*  44   82:iconst_0        
	//*  45   83:aconst_null     
	//*  46   84:invokeinterface #187 <Method void TrackOutput.sampleMetadata(long, int, int, int, com.google.android.exoplayer2.extractor.TrackOutput$CryptoData)>
	//*  47   89:aload_0         
	//*  48   90:aload_0         
	//*  49   91:getfield        #183 <Field long currentSampleTimeUs>
	//*  50   94:ldc2w           #188 <Long 20000L>
	//*  51   97:ladd            
	//*  52   98:putfield        #183 <Field long currentSampleTimeUs>
	//*  53  101:iconst_0        
	//*  54  102:ireturn         
			// Misplaced declaration of an exception variable
			catch(ExtractorInput extractorinput)
	//*  55  103:astore_1        
			{
				return -1;
	//   56  104:iconst_m1       
	//   57  105:ireturn         
			}
			currentSampleBytesRemaining = currentSampleTotalBytes;
		}
		i = trackOutput.sampleData(extractorinput, currentSampleBytesRemaining, true);
		if(i == -1)
			return -1;
		currentSampleBytesRemaining = currentSampleBytesRemaining - i;
		if(currentSampleBytesRemaining > 0)
		{
			return 0;
		} else
		{
			trackOutput.sampleMetadata(currentSampleTimeUs, 1, currentSampleTotalBytes, 0, ((com.google.android.exoplayer2.extractor.TrackOutput.CryptoData) (null)));
			currentSampleTimeUs = currentSampleTimeUs + 20000L;
			return 0;
		}
	}

	public void init(ExtractorOutput extractoroutput)
	{
		extractoroutput.seekMap(((com.google.android.exoplayer2.extractor.SeekMap) (new com.google.android.exoplayer2.extractor.SeekMap.Unseekable(0x1L))));
	//    0    0:aload_1         
	//    1    1:new             #193 <Class com.google.android.exoplayer2.extractor.SeekMap$Unseekable>
	//    2    4:dup             
	//    3    5:ldc2w           #194 <Long 0x1L>
	//    4    8:invokespecial   #198 <Method void com.google.android.exoplayer2.extractor.SeekMap$Unseekable(long)>
	//    5   11:invokeinterface #204 <Method void ExtractorOutput.seekMap(com.google.android.exoplayer2.extractor.SeekMap)>
		trackOutput = extractoroutput.track(0, 1);
	//    6   16:aload_0         
	//    7   17:aload_1         
	//    8   18:iconst_0        
	//    9   19:iconst_1        
	//   10   20:invokeinterface #208 <Method TrackOutput ExtractorOutput.track(int, int)>
	//   11   25:putfield        #123 <Field TrackOutput trackOutput>
		extractoroutput.endTracks();
	//   12   28:aload_1         
	//   13   29:invokeinterface #211 <Method void ExtractorOutput.endTracks()>
	//   14   34:return          
	}

	public int read(ExtractorInput extractorinput, PositionHolder positionholder)
		throws IOException, InterruptedException
	{
		if(extractorinput.getPosition() == 0L && !readAmrHeader(extractorinput))
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #217 <Method long ExtractorInput.getPosition()>
	//*   2    6:lconst_0        
	//*   3    7:lcmp            
	//*   4    8:ifne            29
	//*   5   11:aload_0         
	//*   6   12:aload_1         
	//*   7   13:invokespecial   #219 <Method boolean readAmrHeader(ExtractorInput)>
	//*   8   16:ifne            29
		{
			throw new ParserException("Could not find AMR header.");
	//    9   19:new             #76  <Class ParserException>
	//   10   22:dup             
	//   11   23:ldc1            #221 <String "Could not find AMR header.">
	//   12   25:invokespecial   #107 <Method void ParserException(String)>
	//   13   28:athrow          
		} else
		{
			maybeOutputFormat();
	//   14   29:aload_0         
	//   15   30:invokespecial   #223 <Method void maybeOutputFormat()>
			return readSample(extractorinput);
	//   16   33:aload_0         
	//   17   34:aload_1         
	//   18   35:invokespecial   #225 <Method int readSample(ExtractorInput)>
	//   19   38:ireturn         
		}
	}

	public void release()
	{
	//    0    0:return          
	}

	public void seek(long l, long l1)
	{
		currentSampleTimeUs = 0L;
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:putfield        #183 <Field long currentSampleTimeUs>
		currentSampleTotalBytes = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #177 <Field int currentSampleTotalBytes>
		currentSampleBytesRemaining = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #173 <Field int currentSampleBytesRemaining>
	//    9   15:return          
	}

	public boolean sniff(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		return readAmrHeader(extractorinput);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #219 <Method boolean readAmrHeader(ExtractorInput)>
	//    3    5:ireturn         
	}

	public static final ExtractorsFactory FACTORY = new ExtractorsFactory() {

		public Extractor[] createExtractors()
		{
			return (new Extractor[] {
				new AmrExtractor()
			});
		//    0    0:iconst_1        
		//    1    1:anewarray       Extractor[]
		//    2    4:dup             
		//    3    5:iconst_0        
		//    4    6:new             #8   <Class AmrExtractor>
		//    5    9:dup             
		//    6   10:invokespecial   #18  <Method void AmrExtractor()>
		//    7   13:aastore         
		//    8   14:areturn         
		}

	}
;
	private static final int MAX_FRAME_SIZE_BYTES = frameSizeBytesByTypeWb[8];
	private static final int SAMPLE_RATE_NB = 8000;
	private static final int SAMPLE_RATE_WB = 16000;
	private static final int SAMPLE_TIME_PER_FRAME_US = 20000;
	private static final byte amrSignatureNb[] = Util.getUtf8Bytes("#!AMR\n");
	private static final byte amrSignatureWb[] = Util.getUtf8Bytes("#!AMR-WB\n");
	private static final int frameSizeBytesByTypeNb[] = {
		13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 
		6, 6, 1, 1, 1, 1
	};
	private static final int frameSizeBytesByTypeWb[] = {
		18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 
		1, 1, 1, 1, 1, 1
	};
	private int currentSampleBytesRemaining;
	private long currentSampleTimeUs;
	private int currentSampleTotalBytes;
	private boolean hasOutputFormat;
	private boolean isWideBand;
	private final byte scratch[] = new byte[1];
	private TrackOutput trackOutput;

	static 
	{
	//    0    0:new             #8   <Class AmrExtractor$1>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void AmrExtractor$1()>
	//    3    7:putstatic       #41  <Field ExtractorsFactory FACTORY>
	//    4   10:bipush          16
	//    5   12:newarray        int[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:bipush          13
	//    9   18:iastore         
	//   10   19:dup             
	//   11   20:iconst_1        
	//   12   21:bipush          14
	//   13   23:iastore         
	//   14   24:dup             
	//   15   25:iconst_2        
	//   16   26:bipush          16
	//   17   28:iastore         
	//   18   29:dup             
	//   19   30:iconst_3        
	//   20   31:bipush          18
	//   21   33:iastore         
	//   22   34:dup             
	//   23   35:iconst_4        
	//   24   36:bipush          20
	//   25   38:iastore         
	//   26   39:dup             
	//   27   40:iconst_5        
	//   28   41:bipush          21
	//   29   43:iastore         
	//   30   44:dup             
	//   31   45:bipush          6
	//   32   47:bipush          27
	//   33   49:iastore         
	//   34   50:dup             
	//   35   51:bipush          7
	//   36   53:bipush          32
	//   37   55:iastore         
	//   38   56:dup             
	//   39   57:bipush          8
	//   40   59:bipush          6
	//   41   61:iastore         
	//   42   62:dup             
	//   43   63:bipush          9
	//   44   65:bipush          7
	//   45   67:iastore         
	//   46   68:dup             
	//   47   69:bipush          10
	//   48   71:bipush          6
	//   49   73:iastore         
	//   50   74:dup             
	//   51   75:bipush          11
	//   52   77:bipush          6
	//   53   79:iastore         
	//   54   80:dup             
	//   55   81:bipush          12
	//   56   83:iconst_1        
	//   57   84:iastore         
	//   58   85:dup             
	//   59   86:bipush          13
	//   60   88:iconst_1        
	//   61   89:iastore         
	//   62   90:dup             
	//   63   91:bipush          14
	//   64   93:iconst_1        
	//   65   94:iastore         
	//   66   95:dup             
	//   67   96:bipush          15
	//   68   98:iconst_1        
	//   69   99:iastore         
	//   70  100:putstatic       #43  <Field int[] frameSizeBytesByTypeNb>
	//   71  103:bipush          16
	//   72  105:newarray        int[]
	//   73  107:dup             
	//   74  108:iconst_0        
	//   75  109:bipush          18
	//   76  111:iastore         
	//   77  112:dup             
	//   78  113:iconst_1        
	//   79  114:bipush          24
	//   80  116:iastore         
	//   81  117:dup             
	//   82  118:iconst_2        
	//   83  119:bipush          33
	//   84  121:iastore         
	//   85  122:dup             
	//   86  123:iconst_3        
	//   87  124:bipush          37
	//   88  126:iastore         
	//   89  127:dup             
	//   90  128:iconst_4        
	//   91  129:bipush          41
	//   92  131:iastore         
	//   93  132:dup             
	//   94  133:iconst_5        
	//   95  134:bipush          47
	//   96  136:iastore         
	//   97  137:dup             
	//   98  138:bipush          6
	//   99  140:bipush          51
	//  100  142:iastore         
	//  101  143:dup             
	//  102  144:bipush          7
	//  103  146:bipush          59
	//  104  148:iastore         
	//  105  149:dup             
	//  106  150:bipush          8
	//  107  152:bipush          61
	//  108  154:iastore         
	//  109  155:dup             
	//  110  156:bipush          9
	//  111  158:bipush          6
	//  112  160:iastore         
	//  113  161:dup             
	//  114  162:bipush          10
	//  115  164:iconst_1        
	//  116  165:iastore         
	//  117  166:dup             
	//  118  167:bipush          11
	//  119  169:iconst_1        
	//  120  170:iastore         
	//  121  171:dup             
	//  122  172:bipush          12
	//  123  174:iconst_1        
	//  124  175:iastore         
	//  125  176:dup             
	//  126  177:bipush          13
	//  127  179:iconst_1        
	//  128  180:iastore         
	//  129  181:dup             
	//  130  182:bipush          14
	//  131  184:iconst_1        
	//  132  185:iastore         
	//  133  186:dup             
	//  134  187:bipush          15
	//  135  189:iconst_1        
	//  136  190:iastore         
	//  137  191:putstatic       #45  <Field int[] frameSizeBytesByTypeWb>
	//  138  194:ldc1            #47  <String "#!AMR\n">
	//  139  196:invokestatic    #53  <Method byte[] Util.getUtf8Bytes(String)>
	//  140  199:putstatic       #55  <Field byte[] amrSignatureNb>
	//  141  202:ldc1            #57  <String "#!AMR-WB\n">
	//  142  204:invokestatic    #53  <Method byte[] Util.getUtf8Bytes(String)>
	//  143  207:putstatic       #59  <Field byte[] amrSignatureWb>
	//  144  210:getstatic       #45  <Field int[] frameSizeBytesByTypeWb>
	//  145  213:bipush          8
	//  146  215:iaload          
	//  147  216:putstatic       #61  <Field int MAX_FRAME_SIZE_BYTES>
	//* 148  219:return          
	}
}
