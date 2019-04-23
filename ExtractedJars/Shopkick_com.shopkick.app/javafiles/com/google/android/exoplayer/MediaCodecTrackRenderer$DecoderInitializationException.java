// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;

import com.google.android.exoplayer.util.Util;

// Referenced classes of package com.google.android.exoplayer:
//			MediaCodecTrackRenderer, MediaFormat

public static class MediaCodecTrackRenderer$DecoderInitializationException extends Exception
{

	private static String buildCustomDiagnosticInfo(int i)
	{
		String s;
		if(i < 0)
	//*   0    0:iload_0         
	//*   1    1:ifge            10
			s = "neg_";
	//    2    4:ldc1            #80  <String "neg_">
	//    3    6:astore_1        
		else
	//*   4    7:goto            13
			s = "";
	//    5   10:ldc1            #82  <String "">
	//    6   12:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    7   13:new             #24  <Class StringBuilder>
	//    8   16:dup             
	//    9   17:invokespecial   #27  <Method void StringBuilder()>
	//   10   20:astore_2        
		stringbuilder.append("com.google.android.exoplayer.MediaCodecTrackRenderer_");
	//   11   21:aload_2         
	//   12   22:ldc1            #84  <String "com.google.android.exoplayer.MediaCodecTrackRenderer_">
	//   13   24:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
		stringbuilder.append(s);
	//   15   28:aload_2         
	//   16   29:aload_1         
	//   17   30:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   18   33:pop             
		stringbuilder.append(Math.abs(i));
	//   19   34:aload_2         
	//   20   35:iload_0         
	//   21   36:invokestatic    #90  <Method int Math.abs(int)>
	//   22   39:invokevirtual   #36  <Method StringBuilder StringBuilder.append(int)>
	//   23   42:pop             
		return stringbuilder.toString();
	//   24   43:aload_2         
	//   25   44:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   26   47:areturn         
	}

	private static String getDiagnosticInfoV21(Throwable throwable)
	{
		if(throwable instanceof android.media.MediaCodec.CodecException)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #95  <Class android.media.MediaCodec$CodecException>
	//*   2    4:ifeq            15
			return ((android.media.MediaCodec.CodecException)throwable).getDiagnosticInfo();
	//    3    7:aload_0         
	//    4    8:checkcast       #95  <Class android.media.MediaCodec$CodecException>
	//    5   11:invokevirtual   #98  <Method String android.media.MediaCodec$CodecException.getDiagnosticInfo()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	private static final int CUSTOM_ERROR_CODE_BASE = -50000;
	private static final int DECODER_QUERY_ERROR = -49998;
	private static final int NO_SUITABLE_DECODER_ERROR = -49999;
	public final String decoderName;
	public final String diagnosticInfo;
	public final String mimeType;
	public final boolean secureDecoderRequired;

	public MediaCodecTrackRenderer$DecoderInitializationException(MediaFormat mediaformat, Throwable throwable, boolean flag, int i)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #24  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void StringBuilder()>
	//    3    7:astore          5
		stringbuilder.append("Decoder init failed: [");
	//    4    9:aload           5
	//    5   11:ldc1            #29  <String "Decoder init failed: [">
	//    6   13:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		stringbuilder.append(i);
	//    8   17:aload           5
	//    9   19:iload           4
	//   10   21:invokevirtual   #36  <Method StringBuilder StringBuilder.append(int)>
	//   11   24:pop             
		stringbuilder.append("], ");
	//   12   25:aload           5
	//   13   27:ldc1            #38  <String "], ">
	//   14   29:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   15   32:pop             
		stringbuilder.append(((Object) (mediaformat)));
	//   16   33:aload           5
	//   17   35:aload_1         
	//   18   36:invokevirtual   #41  <Method StringBuilder StringBuilder.append(Object)>
	//   19   39:pop             
		super(stringbuilder.toString(), throwable);
	//   20   40:aload_0         
	//   21   41:aload           5
	//   22   43:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   23   46:aload_2         
	//   24   47:invokespecial   #48  <Method void Exception(String, Throwable)>
		mimeType = mediaformat.mimeType;
	//   25   50:aload_0         
	//   26   51:aload_1         
	//   27   52:getfield        #52  <Field String MediaFormat.mimeType>
	//   28   55:putfield        #53  <Field String mimeType>
		secureDecoderRequired = flag;
	//   29   58:aload_0         
	//   30   59:iload_3         
	//   31   60:putfield        #55  <Field boolean secureDecoderRequired>
		decoderName = null;
	//   32   63:aload_0         
	//   33   64:aconst_null     
	//   34   65:putfield        #57  <Field String decoderName>
		diagnosticInfo = buildCustomDiagnosticInfo(i);
	//   35   68:aload_0         
	//   36   69:iload           4
	//   37   71:invokestatic    #61  <Method String buildCustomDiagnosticInfo(int)>
	//   38   74:putfield        #63  <Field String diagnosticInfo>
	//   39   77:return          
	}

	public MediaCodecTrackRenderer$DecoderInitializationException(MediaFormat mediaformat, Throwable throwable, boolean flag, String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #24  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void StringBuilder()>
	//    3    7:astore          5
		stringbuilder.append("Decoder init failed: ");
	//    4    9:aload           5
	//    5   11:ldc1            #67  <String "Decoder init failed: ">
	//    6   13:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		stringbuilder.append(s);
	//    8   17:aload           5
	//    9   19:aload           4
	//   10   21:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:pop             
		stringbuilder.append(", ");
	//   12   25:aload           5
	//   13   27:ldc1            #69  <String ", ">
	//   14   29:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   15   32:pop             
		stringbuilder.append(((Object) (mediaformat)));
	//   16   33:aload           5
	//   17   35:aload_1         
	//   18   36:invokevirtual   #41  <Method StringBuilder StringBuilder.append(Object)>
	//   19   39:pop             
		super(stringbuilder.toString(), throwable);
	//   20   40:aload_0         
	//   21   41:aload           5
	//   22   43:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   23   46:aload_2         
	//   24   47:invokespecial   #48  <Method void Exception(String, Throwable)>
		mimeType = mediaformat.mimeType;
	//   25   50:aload_0         
	//   26   51:aload_1         
	//   27   52:getfield        #52  <Field String MediaFormat.mimeType>
	//   28   55:putfield        #53  <Field String mimeType>
		secureDecoderRequired = flag;
	//   29   58:aload_0         
	//   30   59:iload_3         
	//   31   60:putfield        #55  <Field boolean secureDecoderRequired>
		decoderName = s;
	//   32   63:aload_0         
	//   33   64:aload           4
	//   34   66:putfield        #57  <Field String decoderName>
		if(Util.SDK_INT >= 21)
	//*  35   69:getstatic       #74  <Field int Util.SDK_INT>
	//*  36   72:bipush          21
	//*  37   74:icmplt          85
			mediaformat = ((MediaFormat) (getDiagnosticInfoV21(throwable)));
	//   38   77:aload_2         
	//   39   78:invokestatic    #78  <Method String getDiagnosticInfoV21(Throwable)>
	//   40   81:astore_1        
		else
	//*  41   82:goto            87
			mediaformat = null;
	//   42   85:aconst_null     
	//   43   86:astore_1        
		diagnosticInfo = ((String) (mediaformat));
	//   44   87:aload_0         
	//   45   88:aload_1         
	//   46   89:putfield        #63  <Field String diagnosticInfo>
	//   47   92:return          
	}
}
