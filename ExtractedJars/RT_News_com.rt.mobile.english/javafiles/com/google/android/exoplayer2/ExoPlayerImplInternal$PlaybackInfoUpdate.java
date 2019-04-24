// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.Assertions;

// Referenced classes of package com.google.android.exoplayer2:
//			ExoPlayerImplInternal, PlaybackInfo

private static final class ExoPlayerImplInternal$PlaybackInfoUpdate
{

	public boolean hasPendingUpdate(PlaybackInfo playbackinfo)
	{
		return playbackinfo != lastPlaybackInfo || operationAcks > 0 || positionDiscontinuity;
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #36  <Field PlaybackInfo lastPlaybackInfo>
	//    3    5:if_acmpne       27
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field int operationAcks>
	//    6   12:ifgt            27
	//    7   15:aload_0         
	//    8   16:getfield        #29  <Field boolean positionDiscontinuity>
	//    9   19:ifeq            25
	//   10   22:goto            27
	//   11   25:iconst_0        
	//   12   26:ireturn         
	//   13   27:iconst_1        
	//   14   28:ireturn         
	}

	public void incrementPendingOperationAcks(int i)
	{
		operationAcks = operationAcks + i;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #25  <Field int operationAcks>
	//    3    5:iload_1         
	//    4    6:iadd            
	//    5    7:putfield        #25  <Field int operationAcks>
	//    6   10:return          
	}

	public void reset(PlaybackInfo playbackinfo)
	{
		lastPlaybackInfo = playbackinfo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field PlaybackInfo lastPlaybackInfo>
		operationAcks = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #25  <Field int operationAcks>
		positionDiscontinuity = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #29  <Field boolean positionDiscontinuity>
	//    9   15:return          
	}

	public void setPositionDiscontinuity(int i)
	{
		boolean flag1 = positionDiscontinuity;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field boolean positionDiscontinuity>
	//    2    4:istore_3        
		boolean flag = true;
	//    3    5:iconst_1        
	//    4    6:istore_2        
		if(flag1 && discontinuityReason != 4)
	//*   5    7:iload_3         
	//*   6    8:ifeq            34
	//*   7   11:aload_0         
	//*   8   12:getfield        #32  <Field int discontinuityReason>
	//*   9   15:iconst_4        
	//*  10   16:icmpeq          34
		{
			if(i != 4)
	//*  11   19:iload_1         
	//*  12   20:iconst_4        
	//*  13   21:icmpne          27
	//*  14   24:goto            29
				flag = false;
	//   15   27:iconst_0        
	//   16   28:istore_2        
			Assertions.checkArgument(flag);
	//   17   29:iload_2         
	//   18   30:invokestatic    #47  <Method void Assertions.checkArgument(boolean)>
			return;
	//   19   33:return          
		} else
		{
			positionDiscontinuity = true;
	//   20   34:aload_0         
	//   21   35:iconst_1        
	//   22   36:putfield        #29  <Field boolean positionDiscontinuity>
			discontinuityReason = i;
	//   23   39:aload_0         
	//   24   40:iload_1         
	//   25   41:putfield        #32  <Field int discontinuityReason>
			return;
	//   26   44:return          
		}
	}

	private int discontinuityReason;
	private PlaybackInfo lastPlaybackInfo;
	private int operationAcks;
	private boolean positionDiscontinuity;


/*
	static int access$100(ExoPlayerImplInternal$PlaybackInfoUpdate exoplayerimplinternal$playbackinfoupdate)
	{
		return exoplayerimplinternal$playbackinfoupdate.operationAcks;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int operationAcks>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$200(ExoPlayerImplInternal$PlaybackInfoUpdate exoplayerimplinternal$playbackinfoupdate)
	{
		return exoplayerimplinternal$playbackinfoupdate.positionDiscontinuity;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field boolean positionDiscontinuity>
	//    2    4:ireturn         
	}

*/


/*
	static int access$300(ExoPlayerImplInternal$PlaybackInfoUpdate exoplayerimplinternal$playbackinfoupdate)
	{
		return exoplayerimplinternal$playbackinfoupdate.discontinuityReason;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int discontinuityReason>
	//    2    4:ireturn         
	}

*/

	private ExoPlayerImplInternal$PlaybackInfoUpdate()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	ExoPlayerImplInternal$PlaybackInfoUpdate(ExoPlayerImplInternal._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void ExoPlayerImplInternal$PlaybackInfoUpdate()>
	//    2    4:return          
	}
}
