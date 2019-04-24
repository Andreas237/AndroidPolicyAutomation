// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.upstream.Allocator;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.source:
//			MediaSourceEventListener, MediaPeriod

public interface MediaSource
{
	public static final class MediaPeriodId
	{

		public MediaPeriodId copyWithPeriodIndex(int i)
		{
			if(periodIndex == i)
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field int periodIndex>
		//*   2    4:iload_1         
		//*   3    5:icmpne          10
				return this;
		//    4    8:aload_0         
		//    5    9:areturn         
			else
				return new MediaPeriodId(i, adGroupIndex, adIndexInAdGroup, windowSequenceNumber);
		//    6   10:new             #2   <Class MediaSource$MediaPeriodId>
		//    7   13:dup             
		//    8   14:iload_1         
		//    9   15:aload_0         
		//   10   16:getfield        #29  <Field int adGroupIndex>
		//   11   19:aload_0         
		//   12   20:getfield        #31  <Field int adIndexInAdGroup>
		//   13   23:aload_0         
		//   14   24:getfield        #33  <Field long windowSequenceNumber>
		//   15   27:invokespecial   #35  <Method void MediaSource$MediaPeriodId(int, int, int, long)>
		//   16   30:areturn         
		}

		public boolean equals(Object obj)
		{
			if(this == obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
				return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
			if(obj != null)
		//*   5    7:aload_1         
		//*   6    8:ifnull          78
			{
				if(((Object)this).getClass() != obj.getClass())
		//*   7   11:aload_0         
		//*   8   12:invokevirtual   #44  <Method Class Object.getClass()>
		//*   9   15:aload_1         
		//*  10   16:invokevirtual   #44  <Method Class Object.getClass()>
		//*  11   19:if_acmpeq       24
					return false;
		//   12   22:iconst_0        
		//   13   23:ireturn         
				obj = ((Object) ((MediaPeriodId)obj));
		//   14   24:aload_1         
		//   15   25:checkcast       #2   <Class MediaSource$MediaPeriodId>
		//   16   28:astore_1        
				return periodIndex == ((MediaPeriodId) (obj)).periodIndex && adGroupIndex == ((MediaPeriodId) (obj)).adGroupIndex && adIndexInAdGroup == ((MediaPeriodId) (obj)).adIndexInAdGroup && windowSequenceNumber == ((MediaPeriodId) (obj)).windowSequenceNumber;
		//   17   29:aload_0         
		//   18   30:getfield        #27  <Field int periodIndex>
		//   19   33:aload_1         
		//   20   34:getfield        #27  <Field int periodIndex>
		//   21   37:icmpne          76
		//   22   40:aload_0         
		//   23   41:getfield        #29  <Field int adGroupIndex>
		//   24   44:aload_1         
		//   25   45:getfield        #29  <Field int adGroupIndex>
		//   26   48:icmpne          76
		//   27   51:aload_0         
		//   28   52:getfield        #31  <Field int adIndexInAdGroup>
		//   29   55:aload_1         
		//   30   56:getfield        #31  <Field int adIndexInAdGroup>
		//   31   59:icmpne          76
		//   32   62:aload_0         
		//   33   63:getfield        #33  <Field long windowSequenceNumber>
		//   34   66:aload_1         
		//   35   67:getfield        #33  <Field long windowSequenceNumber>
		//   36   70:lcmp            
		//   37   71:ifne            76
		//   38   74:iconst_1        
		//   39   75:ireturn         
		//   40   76:iconst_0        
		//   41   77:ireturn         
			} else
			{
				return false;
		//   42   78:iconst_0        
		//   43   79:ireturn         
			}
		}

		public int hashCode()
		{
			return 31 * (((527 + periodIndex) * 31 + adGroupIndex) * 31 + adIndexInAdGroup) + (int)windowSequenceNumber;
		//    0    0:bipush          31
		//    1    2:sipush          527
		//    2    5:aload_0         
		//    3    6:getfield        #27  <Field int periodIndex>
		//    4    9:iadd            
		//    5   10:bipush          31
		//    6   12:imul            
		//    7   13:aload_0         
		//    8   14:getfield        #29  <Field int adGroupIndex>
		//    9   17:iadd            
		//   10   18:bipush          31
		//   11   20:imul            
		//   12   21:aload_0         
		//   13   22:getfield        #31  <Field int adIndexInAdGroup>
		//   14   25:iadd            
		//   15   26:imul            
		//   16   27:aload_0         
		//   17   28:getfield        #33  <Field long windowSequenceNumber>
		//   18   31:l2i             
		//   19   32:iadd            
		//   20   33:ireturn         
		}

		public boolean isAd()
		{
			return adGroupIndex != -1;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field int adGroupIndex>
		//    2    4:iconst_m1       
		//    3    5:icmpeq          10
		//    4    8:iconst_1        
		//    5    9:ireturn         
		//    6   10:iconst_0        
		//    7   11:ireturn         
		}

		public final int adGroupIndex;
		public final int adIndexInAdGroup;
		public final int periodIndex;
		public final long windowSequenceNumber;

		public MediaPeriodId(int i)
		{
			this(i, -1L);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:ldc2w           #16  <Long -1L>
		//    3    5:invokespecial   #20  <Method void MediaSource$MediaPeriodId(int, long)>
		//    4    8:return          
		}

		public MediaPeriodId(int i, int j, int k, long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
			periodIndex = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #27  <Field int periodIndex>
			adGroupIndex = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #29  <Field int adGroupIndex>
			adIndexInAdGroup = k;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #31  <Field int adIndexInAdGroup>
			windowSequenceNumber = l;
		//   11   19:aload_0         
		//   12   20:lload           4
		//   13   22:putfield        #33  <Field long windowSequenceNumber>
		//   14   25:return          
		}

		public MediaPeriodId(int i, long l)
		{
			this(i, -1, -1, l);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_m1       
		//    3    3:iconst_m1       
		//    4    4:lload_2         
		//    5    5:invokespecial   #35  <Method void MediaSource$MediaPeriodId(int, int, int, long)>
		//    6    8:return          
		}
	}

	public static interface SourceInfoRefreshListener
	{

		public abstract void onSourceInfoRefreshed(MediaSource mediasource, Timeline timeline, Object obj);
	}


	public abstract void addEventListener(Handler handler, MediaSourceEventListener mediasourceeventlistener);

	public abstract MediaPeriod createPeriod(MediaPeriodId mediaperiodid, Allocator allocator);

	public abstract void maybeThrowSourceInfoRefreshError()
		throws IOException;

	public abstract void prepareSource(ExoPlayer exoplayer, boolean flag, SourceInfoRefreshListener sourceinforefreshlistener);

	public abstract void releasePeriod(MediaPeriod mediaperiod);

	public abstract void releaseSource(SourceInfoRefreshListener sourceinforefreshlistener);

	public abstract void removeEventListener(MediaSourceEventListener mediasourceeventlistener);
}
