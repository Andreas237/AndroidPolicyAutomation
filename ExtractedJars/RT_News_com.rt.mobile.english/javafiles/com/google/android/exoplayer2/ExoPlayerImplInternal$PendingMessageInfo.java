// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.Util;

// Referenced classes of package com.google.android.exoplayer2:
//			ExoPlayerImplInternal, PlayerMessage

private static final class ExoPlayerImplInternal$PendingMessageInfo
	implements Comparable
{

	public int compareTo(ExoPlayerImplInternal$PendingMessageInfo exoplayerimplinternal$pendingmessageinfo)
	{
		Object obj = resolvedPeriodUid;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Object resolvedPeriodUid>
	//    2    4:astore          5
		boolean flag1 = true;
	//    3    6:iconst_1        
	//    4    7:istore          4
		int i;
		if(obj == null)
	//*   5    9:aload           5
	//*   6   11:ifnonnull       19
			i = 1;
	//    7   14:iconst_1        
	//    8   15:istore_2        
		else
	//*   9   16:goto            21
			i = 0;
	//   10   19:iconst_0        
	//   11   20:istore_2        
		boolean flag;
		if(exoplayerimplinternal$pendingmessageinfo.resolvedPeriodUid == null)
	//*  12   21:aload_1         
	//*  13   22:getfield        #32  <Field Object resolvedPeriodUid>
	//*  14   25:ifnonnull       33
			flag = true;
	//   15   28:iconst_1        
	//   16   29:istore_3        
		else
	//*  17   30:goto            35
			flag = false;
	//   18   33:iconst_0        
	//   19   34:istore_3        
		if(i != flag)
	//*  20   35:iload_2         
	//*  21   36:iload_3         
	//*  22   37:icmpeq          54
		{
			i = ((int) (flag1));
	//   23   40:iload           4
	//   24   42:istore_2        
			if(resolvedPeriodUid != null)
	//*  25   43:aload_0         
	//*  26   44:getfield        #32  <Field Object resolvedPeriodUid>
	//*  27   47:ifnull          52
				i = -1;
	//   28   50:iconst_m1       
	//   29   51:istore_2        
			return i;
	//   30   52:iload_2         
	//   31   53:ireturn         
		}
		if(resolvedPeriodUid == null)
	//*  32   54:aload_0         
	//*  33   55:getfield        #32  <Field Object resolvedPeriodUid>
	//*  34   58:ifnonnull       63
			return 0;
	//   35   61:iconst_0        
	//   36   62:ireturn         
		i = resolvedPeriodIndex - exoplayerimplinternal$pendingmessageinfo.resolvedPeriodIndex;
	//   37   63:aload_0         
	//   38   64:getfield        #34  <Field int resolvedPeriodIndex>
	//   39   67:aload_1         
	//   40   68:getfield        #34  <Field int resolvedPeriodIndex>
	//   41   71:isub            
	//   42   72:istore_2        
		if(i != 0)
	//*  43   73:iload_2         
	//*  44   74:ifeq            79
			return i;
	//   45   77:iload_2         
	//   46   78:ireturn         
		else
			return Util.compareLong(resolvedPeriodTimeUs, exoplayerimplinternal$pendingmessageinfo.resolvedPeriodTimeUs);
	//   47   79:aload_0         
	//   48   80:getfield        #36  <Field long resolvedPeriodTimeUs>
	//   49   83:aload_1         
	//   50   84:getfield        #36  <Field long resolvedPeriodTimeUs>
	//   51   87:invokestatic    #42  <Method int Util.compareLong(long, long)>
	//   52   90:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((ExoPlayerImplInternal$PendingMessageInfo)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class ExoPlayerImplInternal$PendingMessageInfo>
	//    3    5:invokevirtual   #46  <Method int compareTo(ExoPlayerImplInternal$PendingMessageInfo)>
	//    4    8:ireturn         
	}

	public void setResolvedPosition(int i, long l, Object obj)
	{
		resolvedPeriodIndex = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #34  <Field int resolvedPeriodIndex>
		resolvedPeriodTimeUs = l;
	//    3    5:aload_0         
	//    4    6:lload_2         
	//    5    7:putfield        #36  <Field long resolvedPeriodTimeUs>
		resolvedPeriodUid = obj;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #32  <Field Object resolvedPeriodUid>
	//    9   16:return          
	}

	public final PlayerMessage message;
	public int resolvedPeriodIndex;
	public long resolvedPeriodTimeUs;
	public Object resolvedPeriodUid;

	public ExoPlayerImplInternal$PendingMessageInfo(PlayerMessage playermessage)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		message = playermessage;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field PlayerMessage message>
	//    5    9:return          
	}
}
