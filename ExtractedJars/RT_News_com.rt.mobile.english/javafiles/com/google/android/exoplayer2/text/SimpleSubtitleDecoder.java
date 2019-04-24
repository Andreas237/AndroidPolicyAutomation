// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.decoder.*;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.exoplayer2.text:
//			SubtitleDecoder, SubtitleInputBuffer, SubtitleOutputBuffer, SimpleSubtitleOutputBuffer, 
//			SubtitleDecoderException, Subtitle

public abstract class SimpleSubtitleDecoder extends SimpleDecoder
	implements SubtitleDecoder
{

	protected SimpleSubtitleDecoder(String s)
	{
		super(((DecoderInputBuffer []) (new SubtitleInputBuffer[2])), ((OutputBuffer []) (new SubtitleOutputBuffer[2])));
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:anewarray       SubtitleInputBuffer[]
	//    3    5:iconst_2        
	//    4    6:anewarray       SubtitleOutputBuffer[]
	//    5    9:invokespecial   #18  <Method void SimpleDecoder(DecoderInputBuffer[], OutputBuffer[])>
		name = s;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #20  <Field String name>
		setInitialInputBufferSize(1024);
	//    9   17:aload_0         
	//   10   18:sipush          1024
	//   11   21:invokevirtual   #24  <Method void setInitialInputBufferSize(int)>
	//   12   24:return          
	}

	protected volatile DecoderInputBuffer createInputBuffer()
	{
		return ((DecoderInputBuffer) (createInputBuffer()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #30  <Method SubtitleInputBuffer createInputBuffer()>
	//    2    4:areturn         
	}

	protected final SubtitleInputBuffer createInputBuffer()
	{
		return new SubtitleInputBuffer();
	//    0    0:new             #13  <Class SubtitleInputBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void SubtitleInputBuffer()>
	//    3    7:areturn         
	}

	protected volatile OutputBuffer createOutputBuffer()
	{
		return ((OutputBuffer) (createOutputBuffer()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #38  <Method SubtitleOutputBuffer createOutputBuffer()>
	//    2    4:areturn         
	}

	protected final SubtitleOutputBuffer createOutputBuffer()
	{
		return ((SubtitleOutputBuffer) (new SimpleSubtitleOutputBuffer(this)));
	//    0    0:new             #40  <Class SimpleSubtitleOutputBuffer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #43  <Method void SimpleSubtitleOutputBuffer(SimpleSubtitleDecoder)>
	//    4    8:areturn         
	}

	protected final SubtitleDecoderException createUnexpectedDecodeException(Throwable throwable)
	{
		return new SubtitleDecoderException("Unexpected decode error", throwable);
	//    0    0:new             #47  <Class SubtitleDecoderException>
	//    1    3:dup             
	//    2    4:ldc1            #49  <String "Unexpected decode error">
	//    3    6:aload_1         
	//    4    7:invokespecial   #52  <Method void SubtitleDecoderException(String, Throwable)>
	//    5   10:areturn         
	}

	protected volatile Exception createUnexpectedDecodeException(Throwable throwable)
	{
		return ((Exception) (createUnexpectedDecodeException(throwable)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #55  <Method SubtitleDecoderException createUnexpectedDecodeException(Throwable)>
	//    3    5:areturn         
	}

	protected abstract Subtitle decode(byte abyte0[], int i, boolean flag)
		throws SubtitleDecoderException;

	protected final SubtitleDecoderException decode(SubtitleInputBuffer subtitleinputbuffer, SubtitleOutputBuffer subtitleoutputbuffer, boolean flag)
	{
		try
		{
			Object obj = ((Object) (subtitleinputbuffer.data));
	//    0    0:aload_1         
	//    1    1:getfield        #62  <Field ByteBuffer SubtitleInputBuffer.data>
	//    2    4:astore          4
			obj = ((Object) (decode(((ByteBuffer) (obj)).array(), ((ByteBuffer) (obj)).limit(), flag)));
	//    3    6:aload_0         
	//    4    7:aload           4
	//    5    9:invokevirtual   #68  <Method byte[] ByteBuffer.array()>
	//    6   12:aload           4
	//    7   14:invokevirtual   #72  <Method int ByteBuffer.limit()>
	//    8   17:iload_3         
	//    9   18:invokevirtual   #74  <Method Subtitle decode(byte[], int, boolean)>
	//   10   21:astore          4
			subtitleoutputbuffer.setContent(subtitleinputbuffer.timeUs, ((Subtitle) (obj)), subtitleinputbuffer.subsampleOffsetUs);
	//   11   23:aload_2         
	//   12   24:aload_1         
	//   13   25:getfield        #78  <Field long SubtitleInputBuffer.timeUs>
	//   14   28:aload           4
	//   15   30:aload_1         
	//   16   31:getfield        #81  <Field long SubtitleInputBuffer.subsampleOffsetUs>
	//   17   34:invokevirtual   #85  <Method void SubtitleOutputBuffer.setContent(long, Subtitle, long)>
			subtitleoutputbuffer.clearFlag(0x80000000);
	//   18   37:aload_2         
	//   19   38:ldc1            #86  <Int 0x80000000>
	//   20   40:invokevirtual   #89  <Method void SubtitleOutputBuffer.clearFlag(int)>
		}
	//*  21   43:aconst_null     
	//*  22   44:areturn         
		// Misplaced declaration of an exception variable
		catch(SubtitleInputBuffer subtitleinputbuffer)
	//*  23   45:astore_1        
		{
			return ((SubtitleDecoderException) (subtitleinputbuffer));
	//   24   46:aload_1         
	//   25   47:areturn         
		}
		return null;
	}

	protected volatile Exception decode(DecoderInputBuffer decoderinputbuffer, OutputBuffer outputbuffer, boolean flag)
	{
		return ((Exception) (decode((SubtitleInputBuffer)decoderinputbuffer, (SubtitleOutputBuffer)outputbuffer, flag)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #13  <Class SubtitleInputBuffer>
	//    3    5:aload_2         
	//    4    6:checkcast       #15  <Class SubtitleOutputBuffer>
	//    5    9:iload_3         
	//    6   10:invokevirtual   #92  <Method SubtitleDecoderException decode(SubtitleInputBuffer, SubtitleOutputBuffer, boolean)>
	//    7   13:areturn         
	}

	public final String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String name>
	//    2    4:areturn         
	}

	protected volatile void releaseOutputBuffer(OutputBuffer outputbuffer)
	{
		releaseOutputBuffer((SubtitleOutputBuffer)outputbuffer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #15  <Class SubtitleOutputBuffer>
	//    3    5:invokevirtual   #99  <Method void releaseOutputBuffer(SubtitleOutputBuffer)>
	//    4    8:return          
	}

	protected final void releaseOutputBuffer(SubtitleOutputBuffer subtitleoutputbuffer)
	{
		super.releaseOutputBuffer(((OutputBuffer) (subtitleoutputbuffer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #101 <Method void SimpleDecoder.releaseOutputBuffer(OutputBuffer)>
	//    3    5:return          
	}

	public void setPositionUs(long l)
	{
	//    0    0:return          
	}

	private final String name;
}
