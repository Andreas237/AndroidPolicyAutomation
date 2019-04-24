// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.*;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.source.hls:
//			HlsSampleStreamWrapper, SampleQueueMappingException

final class HlsSampleStream
	implements SampleStream
{

	public HlsSampleStream(HlsSampleStreamWrapper hlssamplestreamwrapper, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		sampleStreamWrapper = hlssamplestreamwrapper;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field HlsSampleStreamWrapper sampleStreamWrapper>
		trackGroupIndex = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #20  <Field int trackGroupIndex>
		sampleQueueIndex = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #22  <Field int sampleQueueIndex>
	//   11   19:return          
	}

	private boolean hasValidSampleQueueIndex()
	{
		return sampleQueueIndex != -1 && sampleQueueIndex != -3 && sampleQueueIndex != -2;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int sampleQueueIndex>
	//    2    4:iconst_m1       
	//    3    5:icmpeq          28
	//    4    8:aload_0         
	//    5    9:getfield        #22  <Field int sampleQueueIndex>
	//    6   12:bipush          -3
	//    7   14:icmpeq          28
	//    8   17:aload_0         
	//    9   18:getfield        #22  <Field int sampleQueueIndex>
	//   10   21:bipush          -2
	//   11   23:icmpeq          28
	//   12   26:iconst_1        
	//   13   27:ireturn         
	//   14   28:iconst_0        
	//   15   29:ireturn         
	}

	public void bindSampleQueue()
	{
		boolean flag;
		if(sampleQueueIndex == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field int sampleQueueIndex>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          13
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_1        
		else
	//*   6   10:goto            15
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_1        
		Assertions.checkArgument(flag);
	//    9   15:iload_1         
	//   10   16:invokestatic    #32  <Method void Assertions.checkArgument(boolean)>
		sampleQueueIndex = sampleStreamWrapper.bindSampleQueueToSampleStream(trackGroupIndex);
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:getfield        #18  <Field HlsSampleStreamWrapper sampleStreamWrapper>
	//   14   24:aload_0         
	//   15   25:getfield        #20  <Field int trackGroupIndex>
	//   16   28:invokevirtual   #38  <Method int HlsSampleStreamWrapper.bindSampleQueueToSampleStream(int)>
	//   17   31:putfield        #22  <Field int sampleQueueIndex>
	//   18   34:return          
	}

	public boolean isReady()
	{
		return sampleQueueIndex == -3 || hasValidSampleQueueIndex() && sampleStreamWrapper.isReady(sampleQueueIndex);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int sampleQueueIndex>
	//    2    4:bipush          -3
	//    3    6:icmpeq          35
	//    4    9:aload_0         
	//    5   10:invokespecial   #41  <Method boolean hasValidSampleQueueIndex()>
	//    6   13:ifeq            33
	//    7   16:aload_0         
	//    8   17:getfield        #18  <Field HlsSampleStreamWrapper sampleStreamWrapper>
	//    9   20:aload_0         
	//   10   21:getfield        #22  <Field int sampleQueueIndex>
	//   11   24:invokevirtual   #44  <Method boolean HlsSampleStreamWrapper.isReady(int)>
	//   12   27:ifeq            33
	//   13   30:goto            35
	//   14   33:iconst_0        
	//   15   34:ireturn         
	//   16   35:iconst_1        
	//   17   36:ireturn         
	}

	public void maybeThrowError()
		throws IOException
	{
		if(sampleQueueIndex == -2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field int sampleQueueIndex>
	//*   2    4:bipush          -2
	//*   3    6:icmpne          38
		{
			throw new SampleQueueMappingException(sampleStreamWrapper.getTrackGroups().get(trackGroupIndex).getFormat(0).sampleMimeType);
	//    4    9:new             #49  <Class SampleQueueMappingException>
	//    5   12:dup             
	//    6   13:aload_0         
	//    7   14:getfield        #18  <Field HlsSampleStreamWrapper sampleStreamWrapper>
	//    8   17:invokevirtual   #53  <Method TrackGroupArray HlsSampleStreamWrapper.getTrackGroups()>
	//    9   20:aload_0         
	//   10   21:getfield        #20  <Field int trackGroupIndex>
	//   11   24:invokevirtual   #59  <Method TrackGroup TrackGroupArray.get(int)>
	//   12   27:iconst_0        
	//   13   28:invokevirtual   #65  <Method Format TrackGroup.getFormat(int)>
	//   14   31:getfield        #71  <Field String Format.sampleMimeType>
	//   15   34:invokespecial   #74  <Method void SampleQueueMappingException(String)>
	//   16   37:athrow          
		} else
		{
			sampleStreamWrapper.maybeThrowError();
	//   17   38:aload_0         
	//   18   39:getfield        #18  <Field HlsSampleStreamWrapper sampleStreamWrapper>
	//   19   42:invokevirtual   #76  <Method void HlsSampleStreamWrapper.maybeThrowError()>
			return;
	//   20   45:return          
		}
	}

	public int readData(FormatHolder formatholder, DecoderInputBuffer decoderinputbuffer, boolean flag)
	{
		if(hasValidSampleQueueIndex())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #41  <Method boolean hasValidSampleQueueIndex()>
	//*   2    4:ifeq            22
			return sampleStreamWrapper.readData(sampleQueueIndex, formatholder, decoderinputbuffer, flag);
	//    3    7:aload_0         
	//    4    8:getfield        #18  <Field HlsSampleStreamWrapper sampleStreamWrapper>
	//    5   11:aload_0         
	//    6   12:getfield        #22  <Field int sampleQueueIndex>
	//    7   15:aload_1         
	//    8   16:aload_2         
	//    9   17:iload_3         
	//   10   18:invokevirtual   #82  <Method int HlsSampleStreamWrapper.readData(int, FormatHolder, DecoderInputBuffer, boolean)>
	//   11   21:ireturn         
		else
			return -3;
	//   12   22:bipush          -3
	//   13   24:ireturn         
	}

	public int skipData(long l)
	{
		if(hasValidSampleQueueIndex())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #41  <Method boolean hasValidSampleQueueIndex()>
	//*   2    4:ifeq            20
			return sampleStreamWrapper.skipData(sampleQueueIndex, l);
	//    3    7:aload_0         
	//    4    8:getfield        #18  <Field HlsSampleStreamWrapper sampleStreamWrapper>
	//    5   11:aload_0         
	//    6   12:getfield        #22  <Field int sampleQueueIndex>
	//    7   15:lload_1         
	//    8   16:invokevirtual   #87  <Method int HlsSampleStreamWrapper.skipData(int, long)>
	//    9   19:ireturn         
		else
			return 0;
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public void unbindSampleQueue()
	{
		if(sampleQueueIndex != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field int sampleQueueIndex>
	//*   2    4:iconst_m1       
	//*   3    5:icmpeq          24
		{
			sampleStreamWrapper.unbindSampleQueue(trackGroupIndex);
	//    4    8:aload_0         
	//    5    9:getfield        #18  <Field HlsSampleStreamWrapper sampleStreamWrapper>
	//    6   12:aload_0         
	//    7   13:getfield        #20  <Field int trackGroupIndex>
	//    8   16:invokevirtual   #91  <Method void HlsSampleStreamWrapper.unbindSampleQueue(int)>
			sampleQueueIndex = -1;
	//    9   19:aload_0         
	//   10   20:iconst_m1       
	//   11   21:putfield        #22  <Field int sampleQueueIndex>
		}
	//   12   24:return          
	}

	private int sampleQueueIndex;
	private final HlsSampleStreamWrapper sampleStreamWrapper;
	private final int trackGroupIndex;
}
