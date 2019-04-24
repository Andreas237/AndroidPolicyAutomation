// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import java.util.ArrayList;

// Referenced classes of package com.google.android.exoplayer2.extractor.ogg:
//			StreamReader, VorbisUtil

final class VorbisReader extends StreamReader
{
	static final class VorbisSetup
	{

		public final VorbisUtil.CommentHeader commentHeader;
		public final int iLogModes;
		public final VorbisUtil.VorbisIdHeader idHeader;
		public final VorbisUtil.Mode modes[];
		public final byte setupHeaderData[];

		public VorbisSetup(VorbisUtil.VorbisIdHeader vorbisidheader, VorbisUtil.CommentHeader commentheader, byte abyte0[], VorbisUtil.Mode amode[], int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			idHeader = vorbisidheader;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #24  <Field VorbisUtil$VorbisIdHeader idHeader>
			commentHeader = commentheader;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #26  <Field VorbisUtil$CommentHeader commentHeader>
			setupHeaderData = abyte0;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #28  <Field byte[] setupHeaderData>
			modes = amode;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #30  <Field VorbisUtil$Mode[] modes>
			iLogModes = i;
		//   14   25:aload_0         
		//   15   26:iload           5
		//   16   28:putfield        #32  <Field int iLogModes>
		//   17   31:return          
		}
	}


	VorbisReader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void StreamReader()>
	//    2    4:return          
	}

	static void appendNumberOfSamples(ParsableByteArray parsablebytearray, long l)
	{
		parsablebytearray.setLimit(parsablebytearray.limit() + 4);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #30  <Method int ParsableByteArray.limit()>
	//    3    5:iconst_4        
	//    4    6:iadd            
	//    5    7:invokevirtual   #34  <Method void ParsableByteArray.setLimit(int)>
		parsablebytearray.data[parsablebytearray.limit() - 4] = (byte)(int)(l & 255L);
	//    6   10:aload_0         
	//    7   11:getfield        #38  <Field byte[] ParsableByteArray.data>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #30  <Method int ParsableByteArray.limit()>
	//   10   18:iconst_4        
	//   11   19:isub            
	//   12   20:lload_1         
	//   13   21:ldc2w           #39  <Long 255L>
	//   14   24:land            
	//   15   25:l2i             
	//   16   26:int2byte        
	//   17   27:bastore         
		parsablebytearray.data[parsablebytearray.limit() - 3] = (byte)(int)(l >>> 8 & 255L);
	//   18   28:aload_0         
	//   19   29:getfield        #38  <Field byte[] ParsableByteArray.data>
	//   20   32:aload_0         
	//   21   33:invokevirtual   #30  <Method int ParsableByteArray.limit()>
	//   22   36:iconst_3        
	//   23   37:isub            
	//   24   38:lload_1         
	//   25   39:bipush          8
	//   26   41:lushr           
	//   27   42:ldc2w           #39  <Long 255L>
	//   28   45:land            
	//   29   46:l2i             
	//   30   47:int2byte        
	//   31   48:bastore         
		parsablebytearray.data[parsablebytearray.limit() - 2] = (byte)(int)(l >>> 16 & 255L);
	//   32   49:aload_0         
	//   33   50:getfield        #38  <Field byte[] ParsableByteArray.data>
	//   34   53:aload_0         
	//   35   54:invokevirtual   #30  <Method int ParsableByteArray.limit()>
	//   36   57:iconst_2        
	//   37   58:isub            
	//   38   59:lload_1         
	//   39   60:bipush          16
	//   40   62:lushr           
	//   41   63:ldc2w           #39  <Long 255L>
	//   42   66:land            
	//   43   67:l2i             
	//   44   68:int2byte        
	//   45   69:bastore         
		parsablebytearray.data[parsablebytearray.limit() - 1] = (byte)(int)(l >>> 24 & 255L);
	//   46   70:aload_0         
	//   47   71:getfield        #38  <Field byte[] ParsableByteArray.data>
	//   48   74:aload_0         
	//   49   75:invokevirtual   #30  <Method int ParsableByteArray.limit()>
	//   50   78:iconst_1        
	//   51   79:isub            
	//   52   80:lload_1         
	//   53   81:bipush          24
	//   54   83:lushr           
	//   55   84:ldc2w           #39  <Long 255L>
	//   56   87:land            
	//   57   88:l2i             
	//   58   89:int2byte        
	//   59   90:bastore         
	//   60   91:return          
	}

	private static int decodeBlockSize(byte byte0, VorbisSetup vorbissetup)
	{
		int i = readBits(byte0, vorbissetup.iLogModes, 1);
	//    0    0:iload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #45  <Field int VorbisReader$VorbisSetup.iLogModes>
	//    3    5:iconst_1        
	//    4    6:invokestatic    #49  <Method int readBits(byte, int, int)>
	//    5    9:istore_2        
		if(!vorbissetup.modes[i].blockFlag)
	//*   6   10:aload_1         
	//*   7   11:getfield        #53  <Field VorbisUtil$Mode[] VorbisReader$VorbisSetup.modes>
	//*   8   14:iload_2         
	//*   9   15:aaload          
	//*  10   16:getfield        #58  <Field boolean VorbisUtil$Mode.blockFlag>
	//*  11   19:ifne            30
			return vorbissetup.idHeader.blockSize0;
	//   12   22:aload_1         
	//   13   23:getfield        #61  <Field VorbisUtil$VorbisIdHeader VorbisReader$VorbisSetup.idHeader>
	//   14   26:getfield        #66  <Field int VorbisUtil$VorbisIdHeader.blockSize0>
	//   15   29:ireturn         
		else
			return vorbissetup.idHeader.blockSize1;
	//   16   30:aload_1         
	//   17   31:getfield        #61  <Field VorbisUtil$VorbisIdHeader VorbisReader$VorbisSetup.idHeader>
	//   18   34:getfield        #69  <Field int VorbisUtil$VorbisIdHeader.blockSize1>
	//   19   37:ireturn         
	}

	static int readBits(byte byte0, int i, int j)
	{
		return byte0 >> j & 255 >>> 8 - i;
	//    0    0:iload_0         
	//    1    1:iload_2         
	//    2    2:ishr            
	//    3    3:sipush          255
	//    4    6:bipush          8
	//    5    8:iload_1         
	//    6    9:isub            
	//    7   10:iushr           
	//    8   11:iand            
	//    9   12:ireturn         
	}

	public static boolean verifyBitstreamType(ParsableByteArray parsablebytearray)
	{
		boolean flag;
		try
		{
			flag = VorbisUtil.verifyVorbisHeaderCapturePattern(1, parsablebytearray, true);
	//    0    0:iconst_1        
	//    1    1:aload_0         
	//    2    2:iconst_1        
	//    3    3:invokestatic    #79  <Method boolean VorbisUtil.verifyVorbisHeaderCapturePattern(int, ParsableByteArray, boolean)>
	//    4    6:istore_1        
		}
	//*   5    7:iload_1         
	//*   6    8:ireturn         
	//*   7    9:iconst_0        
	//*   8   10:ireturn         
		// Misplaced declaration of an exception variable
		catch(ParsableByteArray parsablebytearray)
		{
			return false;
		}
		return flag;
	//*   9   11:astore_0        
	//*  10   12:goto            9
	}

	protected void onSeekEnd(long l)
	{
		super.onSeekEnd(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #83  <Method void StreamReader.onSeekEnd(long)>
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		boolean flag;
		if(l != 0L)
	//*   5    7:lload_1         
	//*   6    8:lconst_0        
	//*   7    9:lcmp            
	//*   8   10:ifeq            19
			flag = true;
	//    9   13:iconst_1        
	//   10   14:istore          4
		else
	//*  11   16:goto            22
			flag = false;
	//   12   19:iconst_0        
	//   13   20:istore          4
		seenFirstAudioPacket = flag;
	//   14   22:aload_0         
	//   15   23:iload           4
	//   16   25:putfield        #85  <Field boolean seenFirstAudioPacket>
		if(vorbisIdHeader != null)
	//*  17   28:aload_0         
	//*  18   29:getfield        #87  <Field VorbisUtil$VorbisIdHeader vorbisIdHeader>
	//*  19   32:ifnull          43
			i = vorbisIdHeader.blockSize0;
	//   20   35:aload_0         
	//   21   36:getfield        #87  <Field VorbisUtil$VorbisIdHeader vorbisIdHeader>
	//   22   39:getfield        #66  <Field int VorbisUtil$VorbisIdHeader.blockSize0>
	//   23   42:istore_3        
		previousPacketBlockSize = i;
	//   24   43:aload_0         
	//   25   44:iload_3         
	//   26   45:putfield        #89  <Field int previousPacketBlockSize>
	//   27   48:return          
	}

	protected long preparePayload(ParsableByteArray parsablebytearray)
	{
		byte abyte0[] = parsablebytearray.data;
	//    0    0:aload_1         
	//    1    1:getfield        #38  <Field byte[] ParsableByteArray.data>
	//    2    4:astore          6
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore_2        
		if((abyte0[0] & 1) == 1)
	//*   5    8:aload           6
	//*   6   10:iconst_0        
	//*   7   11:baload          
	//*   8   12:iconst_1        
	//*   9   13:iand            
	//*  10   14:iconst_1        
	//*  11   15:icmpne          22
			return -1L;
	//   12   18:ldc2w           #92  <Long -1L>
	//   13   21:lreturn         
		int j = decodeBlockSize(parsablebytearray.data[0], vorbisSetup);
	//   14   22:aload_1         
	//   15   23:getfield        #38  <Field byte[] ParsableByteArray.data>
	//   16   26:iconst_0        
	//   17   27:baload          
	//   18   28:aload_0         
	//   19   29:getfield        #95  <Field VorbisReader$VorbisSetup vorbisSetup>
	//   20   32:invokestatic    #97  <Method int decodeBlockSize(byte, VorbisReader$VorbisSetup)>
	//   21   35:istore_3        
		if(seenFirstAudioPacket)
	//*  22   36:aload_0         
	//*  23   37:getfield        #85  <Field boolean seenFirstAudioPacket>
	//*  24   40:ifeq            52
			i = (previousPacketBlockSize + j) / 4;
	//   25   43:aload_0         
	//   26   44:getfield        #89  <Field int previousPacketBlockSize>
	//   27   47:iload_3         
	//   28   48:iadd            
	//   29   49:iconst_4        
	//   30   50:idiv            
	//   31   51:istore_2        
		long l = i;
	//   32   52:iload_2         
	//   33   53:i2l             
	//   34   54:lstore          4
		appendNumberOfSamples(parsablebytearray, l);
	//   35   56:aload_1         
	//   36   57:lload           4
	//   37   59:invokestatic    #99  <Method void appendNumberOfSamples(ParsableByteArray, long)>
		seenFirstAudioPacket = true;
	//   38   62:aload_0         
	//   39   63:iconst_1        
	//   40   64:putfield        #85  <Field boolean seenFirstAudioPacket>
		previousPacketBlockSize = j;
	//   41   67:aload_0         
	//   42   68:iload_3         
	//   43   69:putfield        #89  <Field int previousPacketBlockSize>
		return l;
	//   44   72:lload           4
	//   45   74:lreturn         
	}

	protected boolean readHeaders(ParsableByteArray parsablebytearray, long l, StreamReader.SetupData setupdata)
		throws IOException, InterruptedException
	{
		if(vorbisSetup != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field VorbisReader$VorbisSetup vorbisSetup>
	//*   2    4:ifnull          9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		vorbisSetup = readSetupHeaders(parsablebytearray);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #109 <Method VorbisReader$VorbisSetup readSetupHeaders(ParsableByteArray)>
	//    9   15:putfield        #95  <Field VorbisReader$VorbisSetup vorbisSetup>
		if(vorbisSetup == null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #95  <Field VorbisReader$VorbisSetup vorbisSetup>
	//*  12   22:ifnonnull       27
		{
			return true;
	//   13   25:iconst_1        
	//   14   26:ireturn         
		} else
		{
			parsablebytearray = ((ParsableByteArray) (new ArrayList()));
	//   15   27:new             #111 <Class ArrayList>
	//   16   30:dup             
	//   17   31:invokespecial   #112 <Method void ArrayList()>
	//   18   34:astore_1        
			((ArrayList) (parsablebytearray)).add(((Object) (vorbisSetup.idHeader.data)));
	//   19   35:aload_1         
	//   20   36:aload_0         
	//   21   37:getfield        #95  <Field VorbisReader$VorbisSetup vorbisSetup>
	//   22   40:getfield        #61  <Field VorbisUtil$VorbisIdHeader VorbisReader$VorbisSetup.idHeader>
	//   23   43:getfield        #113 <Field byte[] VorbisUtil$VorbisIdHeader.data>
	//   24   46:invokevirtual   #117 <Method boolean ArrayList.add(Object)>
	//   25   49:pop             
			((ArrayList) (parsablebytearray)).add(((Object) (vorbisSetup.setupHeaderData)));
	//   26   50:aload_1         
	//   27   51:aload_0         
	//   28   52:getfield        #95  <Field VorbisReader$VorbisSetup vorbisSetup>
	//   29   55:getfield        #120 <Field byte[] VorbisReader$VorbisSetup.setupHeaderData>
	//   30   58:invokevirtual   #117 <Method boolean ArrayList.add(Object)>
	//   31   61:pop             
			setupdata.format = Format.createAudioSampleFormat(((String) (null)), "audio/vorbis", ((String) (null)), vorbisSetup.idHeader.bitrateNominal, -1, vorbisSetup.idHeader.channels, (int)vorbisSetup.idHeader.sampleRate, ((java.util.List) (parsablebytearray)), ((com.google.android.exoplayer2.drm.DrmInitData) (null)), 0, ((String) (null)));
	//   32   62:aload           4
	//   33   64:aconst_null     
	//   34   65:ldc1            #122 <String "audio/vorbis">
	//   35   67:aconst_null     
	//   36   68:aload_0         
	//   37   69:getfield        #95  <Field VorbisReader$VorbisSetup vorbisSetup>
	//   38   72:getfield        #61  <Field VorbisUtil$VorbisIdHeader VorbisReader$VorbisSetup.idHeader>
	//   39   75:getfield        #125 <Field int VorbisUtil$VorbisIdHeader.bitrateNominal>
	//   40   78:iconst_m1       
	//   41   79:aload_0         
	//   42   80:getfield        #95  <Field VorbisReader$VorbisSetup vorbisSetup>
	//   43   83:getfield        #61  <Field VorbisUtil$VorbisIdHeader VorbisReader$VorbisSetup.idHeader>
	//   44   86:getfield        #128 <Field int VorbisUtil$VorbisIdHeader.channels>
	//   45   89:aload_0         
	//   46   90:getfield        #95  <Field VorbisReader$VorbisSetup vorbisSetup>
	//   47   93:getfield        #61  <Field VorbisUtil$VorbisIdHeader VorbisReader$VorbisSetup.idHeader>
	//   48   96:getfield        #132 <Field long VorbisUtil$VorbisIdHeader.sampleRate>
	//   49   99:l2i             
	//   50  100:aload_1         
	//   51  101:aconst_null     
	//   52  102:iconst_0        
	//   53  103:aconst_null     
	//   54  104:invokestatic    #138 <Method Format Format.createAudioSampleFormat(String, String, String, int, int, int, int, java.util.List, com.google.android.exoplayer2.drm.DrmInitData, int, String)>
	//   55  107:putfield        #144 <Field Format StreamReader$SetupData.format>
			return true;
	//   56  110:iconst_1        
	//   57  111:ireturn         
		}
	}

	VorbisSetup readSetupHeaders(ParsableByteArray parsablebytearray)
		throws IOException
	{
		if(vorbisIdHeader == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field VorbisUtil$VorbisIdHeader vorbisIdHeader>
	//*   2    4:ifnonnull       17
		{
			vorbisIdHeader = VorbisUtil.readVorbisIdentificationHeader(parsablebytearray);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokestatic    #149 <Method VorbisUtil$VorbisIdHeader VorbisUtil.readVorbisIdentificationHeader(ParsableByteArray)>
	//    6   12:putfield        #87  <Field VorbisUtil$VorbisIdHeader vorbisIdHeader>
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
		}
		if(commentHeader == null)
	//*   9   17:aload_0         
	//*  10   18:getfield        #151 <Field VorbisUtil$CommentHeader commentHeader>
	//*  11   21:ifnonnull       34
		{
			commentHeader = VorbisUtil.readVorbisCommentHeader(parsablebytearray);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokestatic    #155 <Method VorbisUtil$CommentHeader VorbisUtil.readVorbisCommentHeader(ParsableByteArray)>
	//   15   29:putfield        #151 <Field VorbisUtil$CommentHeader commentHeader>
			return null;
	//   16   32:aconst_null     
	//   17   33:areturn         
		} else
		{
			byte abyte0[] = new byte[parsablebytearray.limit()];
	//   18   34:aload_1         
	//   19   35:invokevirtual   #30  <Method int ParsableByteArray.limit()>
	//   20   38:newarray        byte[]
	//   21   40:astore_3        
			System.arraycopy(((Object) (parsablebytearray.data)), 0, ((Object) (abyte0)), 0, parsablebytearray.limit());
	//   22   41:aload_1         
	//   23   42:getfield        #38  <Field byte[] ParsableByteArray.data>
	//   24   45:iconst_0        
	//   25   46:aload_3         
	//   26   47:iconst_0        
	//   27   48:aload_1         
	//   28   49:invokevirtual   #30  <Method int ParsableByteArray.limit()>
	//   29   52:invokestatic    #161 <Method void System.arraycopy(Object, int, Object, int, int)>
			parsablebytearray = ((ParsableByteArray) (VorbisUtil.readVorbisModes(parsablebytearray, vorbisIdHeader.channels)));
	//   30   55:aload_1         
	//   31   56:aload_0         
	//   32   57:getfield        #87  <Field VorbisUtil$VorbisIdHeader vorbisIdHeader>
	//   33   60:getfield        #128 <Field int VorbisUtil$VorbisIdHeader.channels>
	//   34   63:invokestatic    #165 <Method VorbisUtil$Mode[] VorbisUtil.readVorbisModes(ParsableByteArray, int)>
	//   35   66:astore_1        
			int i = VorbisUtil.iLog(parsablebytearray.length - 1);
	//   36   67:aload_1         
	//   37   68:arraylength     
	//   38   69:iconst_1        
	//   39   70:isub            
	//   40   71:invokestatic    #169 <Method int VorbisUtil.iLog(int)>
	//   41   74:istore_2        
			return new VorbisSetup(vorbisIdHeader, commentHeader, abyte0, ((VorbisUtil.Mode []) (parsablebytearray)), i);
	//   42   75:new             #6   <Class VorbisReader$VorbisSetup>
	//   43   78:dup             
	//   44   79:aload_0         
	//   45   80:getfield        #87  <Field VorbisUtil$VorbisIdHeader vorbisIdHeader>
	//   46   83:aload_0         
	//   47   84:getfield        #151 <Field VorbisUtil$CommentHeader commentHeader>
	//   48   87:aload_3         
	//   49   88:aload_1         
	//   50   89:iload_2         
	//   51   90:invokespecial   #172 <Method void VorbisReader$VorbisSetup(VorbisUtil$VorbisIdHeader, VorbisUtil$CommentHeader, byte[], VorbisUtil$Mode[], int)>
	//   52   93:areturn         
		}
	}

	protected void reset(boolean flag)
	{
		super.reset(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #176 <Method void StreamReader.reset(boolean)>
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            24
		{
			vorbisSetup = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #95  <Field VorbisReader$VorbisSetup vorbisSetup>
			vorbisIdHeader = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #87  <Field VorbisUtil$VorbisIdHeader vorbisIdHeader>
			commentHeader = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #151 <Field VorbisUtil$CommentHeader commentHeader>
		}
		previousPacketBlockSize = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #89  <Field int previousPacketBlockSize>
		seenFirstAudioPacket = false;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #85  <Field boolean seenFirstAudioPacket>
	//   20   34:return          
	}

	private VorbisUtil.CommentHeader commentHeader;
	private int previousPacketBlockSize;
	private boolean seenFirstAudioPacket;
	private VorbisUtil.VorbisIdHeader vorbisIdHeader;
	private VorbisSetup vorbisSetup;
}
