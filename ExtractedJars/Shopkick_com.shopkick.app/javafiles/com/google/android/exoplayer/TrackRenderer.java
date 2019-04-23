// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;

import com.google.android.exoplayer.util.Assertions;

// Referenced classes of package com.google.android.exoplayer:
//			ExoPlaybackException, MediaFormat, MediaClock

public abstract class TrackRenderer
	implements ExoPlayer.ExoPlayerComponent
{

	public TrackRenderer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
	//    2    4:return          
	}

	final void disable()
		throws ExoPlaybackException
	{
		boolean flag;
		if(state == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field int state>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          13
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_1        
		else
	//*   6   10:goto            15
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_1        
		Assertions.checkState(flag);
	//    9   15:iload_1         
	//   10   16:invokestatic    #44  <Method void Assertions.checkState(boolean)>
		state = 1;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #38  <Field int state>
		onDisabled();
	//   14   24:aload_0         
	//   15   25:invokevirtual   #47  <Method void onDisabled()>
	//   16   28:return          
	}

	protected abstract boolean doPrepare(long l)
		throws ExoPlaybackException;

	protected abstract void doSomeWork(long l, long l1)
		throws ExoPlaybackException;

	final void enable(int i, long l, boolean flag)
		throws ExoPlaybackException
	{
		int j = state;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int state>
	//    2    4:istore          5
		boolean flag1 = true;
	//    3    6:iconst_1        
	//    4    7:istore          6
		if(j != 1)
	//*   5    9:iload           5
	//*   6   11:iconst_1        
	//*   7   12:icmpne          18
	//*   8   15:goto            21
			flag1 = false;
	//    9   18:iconst_0        
	//   10   19:istore          6
		Assertions.checkState(flag1);
	//   11   21:iload           6
	//   12   23:invokestatic    #44  <Method void Assertions.checkState(boolean)>
		state = 2;
	//   13   26:aload_0         
	//   14   27:iconst_2        
	//   15   28:putfield        #38  <Field int state>
		onEnabled(i, l, flag);
	//   16   31:aload_0         
	//   17   32:iload_1         
	//   18   33:lload_2         
	//   19   34:iload           4
	//   20   36:invokevirtual   #57  <Method void onEnabled(int, long, boolean)>
	//   21   39:return          
	}

	protected abstract long getBufferedPositionUs();

	protected abstract long getDurationUs();

	protected abstract MediaFormat getFormat(int i);

	protected MediaClock getMediaClock()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	protected final int getState()
	{
		return state;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int state>
	//    2    4:ireturn         
	}

	protected abstract int getTrackCount();

	public void handleMessage(int i, Object obj)
		throws ExoPlaybackException
	{
	//    0    0:return          
	}

	protected abstract boolean isEnded();

	protected abstract boolean isReady();

	protected abstract void maybeThrowError()
		throws ExoPlaybackException;

	protected void onDisabled()
		throws ExoPlaybackException
	{
	//    0    0:return          
	}

	protected void onEnabled(int i, long l, boolean flag)
		throws ExoPlaybackException
	{
	//    0    0:return          
	}

	protected void onReleased()
		throws ExoPlaybackException
	{
	//    0    0:return          
	}

	protected void onStarted()
		throws ExoPlaybackException
	{
	//    0    0:return          
	}

	protected void onStopped()
		throws ExoPlaybackException
	{
	//    0    0:return          
	}

	final int prepare(long l)
		throws ExoPlaybackException
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #80  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #82  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #87  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	final void release()
		throws ExoPlaybackException
	{
		int i = state;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int state>
	//    2    4:istore_1        
		boolean flag;
		if(i != 2 && i != 3 && i != -1)
	//*   3    5:iload_1         
	//*   4    6:iconst_2        
	//*   5    7:icmpeq          25
	//*   6   10:iload_1         
	//*   7   11:iconst_3        
	//*   8   12:icmpeq          25
	//*   9   15:iload_1         
	//*  10   16:iconst_m1       
	//*  11   17:icmpeq          25
			flag = true;
	//   12   20:iconst_1        
	//   13   21:istore_2        
		else
	//*  14   22:goto            27
			flag = false;
	//   15   25:iconst_0        
	//   16   26:istore_2        
		Assertions.checkState(flag);
	//   17   27:iload_2         
	//   18   28:invokestatic    #44  <Method void Assertions.checkState(boolean)>
		state = -1;
	//   19   31:aload_0         
	//   20   32:iconst_m1       
	//   21   33:putfield        #38  <Field int state>
		onReleased();
	//   22   36:aload_0         
	//   23   37:invokevirtual   #90  <Method void onReleased()>
	//   24   40:return          
	}

	protected abstract void seekTo(long l)
		throws ExoPlaybackException;

	final void start()
		throws ExoPlaybackException
	{
		boolean flag;
		if(state == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field int state>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          13
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_1        
		else
	//*   6   10:goto            15
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_1        
		Assertions.checkState(flag);
	//    9   15:iload_1         
	//   10   16:invokestatic    #44  <Method void Assertions.checkState(boolean)>
		state = 3;
	//   11   19:aload_0         
	//   12   20:iconst_3        
	//   13   21:putfield        #38  <Field int state>
		onStarted();
	//   14   24:aload_0         
	//   15   25:invokevirtual   #95  <Method void onStarted()>
	//   16   28:return          
	}

	final void stop()
		throws ExoPlaybackException
	{
		boolean flag;
		if(state == 3)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field int state>
	//*   2    4:iconst_3        
	//*   3    5:icmpne          13
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_1        
		else
	//*   6   10:goto            15
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_1        
		Assertions.checkState(flag);
	//    9   15:iload_1         
	//   10   16:invokestatic    #44  <Method void Assertions.checkState(boolean)>
		state = 2;
	//   11   19:aload_0         
	//   12   20:iconst_2        
	//   13   21:putfield        #38  <Field int state>
		onStopped();
	//   14   24:aload_0         
	//   15   25:invokevirtual   #98  <Method void onStopped()>
	//   16   28:return          
	}

	public static final long END_OF_TRACK_US = -3L;
	public static final long MATCH_LONGEST_US = -2L;
	protected static final int STATE_ENABLED = 2;
	protected static final int STATE_PREPARED = 1;
	protected static final int STATE_RELEASED = -1;
	protected static final int STATE_STARTED = 3;
	protected static final int STATE_UNPREPARED = 0;
	public static final long UNKNOWN_TIME_US = -1L;
	private int state;
}
