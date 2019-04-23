// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.internal.ads:
//			beg

class beh
{

	private beh()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	beh(beg beg)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void beh()>
	//    2    4:return          
	}

	public final void a()
	{
		if(g != 0x1L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field long g>
	//*   2    4:ldc2w           #27  <Long 0x1L>
	//*   3    7:lcmp            
	//*   4    8:ifeq            12
		{
			return;
	//    5   11:return          
		} else
		{
			a.pause();
	//    6   12:aload_0         
	//    7   13:getfield        #30  <Field AudioTrack a>
	//    8   16:invokevirtual   #35  <Method void AudioTrack.pause()>
			return;
	//    9   19:return          
		}
	}

	public final void a(long l)
	{
		h = b();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #39  <Method long b()>
	//    3    5:putfield        #41  <Field long h>
		g = SystemClock.elapsedRealtime() * 1000L;
	//    4    8:aload_0         
	//    5    9:invokestatic    #46  <Method long SystemClock.elapsedRealtime()>
	//    6   12:ldc2w           #47  <Long 1000L>
	//    7   15:lmul            
	//    8   16:putfield        #26  <Field long g>
		i = l;
	//    9   19:aload_0         
	//   10   20:lload_1         
	//   11   21:putfield        #50  <Field long i>
		a.stop();
	//   12   24:aload_0         
	//   13   25:getfield        #30  <Field AudioTrack a>
	//   14   28:invokevirtual   #53  <Method void AudioTrack.stop()>
	//   15   31:return          
	}

	public void a(AudioTrack audiotrack, boolean flag)
	{
		a = audiotrack;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field AudioTrack a>
		b = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #56  <Field boolean b>
		g = 0x1L;
	//    6   10:aload_0         
	//    7   11:ldc2w           #27  <Long 0x1L>
	//    8   14:putfield        #26  <Field long g>
		d = 0L;
	//    9   17:aload_0         
	//   10   18:lconst_0        
	//   11   19:putfield        #58  <Field long d>
		e = 0L;
	//   12   22:aload_0         
	//   13   23:lconst_0        
	//   14   24:putfield        #60  <Field long e>
		f = 0L;
	//   15   27:aload_0         
	//   16   28:lconst_0        
	//   17   29:putfield        #62  <Field long f>
		if(audiotrack != null)
	//*  18   32:aload_1         
	//*  19   33:ifnull          44
			c = audiotrack.getSampleRate();
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:invokevirtual   #66  <Method int AudioTrack.getSampleRate()>
	//   23   41:putfield        #68  <Field int c>
	//   24   44:return          
	}

	public final long b()
	{
		if(g != 0x1L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field long g>
	//*   2    4:ldc2w           #27  <Long 0x1L>
	//*   3    7:lcmp            
	//*   4    8:ifeq            48
		{
			long l = ((SystemClock.elapsedRealtime() * 1000L - g) * (long)c) / 0xf4240L;
	//    5   11:invokestatic    #46  <Method long SystemClock.elapsedRealtime()>
	//    6   14:ldc2w           #47  <Long 1000L>
	//    7   17:lmul            
	//    8   18:aload_0         
	//    9   19:getfield        #26  <Field long g>
	//   10   22:lsub            
	//   11   23:aload_0         
	//   12   24:getfield        #68  <Field int c>
	//   13   27:i2l             
	//   14   28:lmul            
	//   15   29:ldc2w           #69  <Long 0xf4240L>
	//   16   32:ldiv            
	//   17   33:lstore_2        
			return Math.min(i, h + l);
	//   18   34:aload_0         
	//   19   35:getfield        #50  <Field long i>
	//   20   38:aload_0         
	//   21   39:getfield        #41  <Field long h>
	//   22   42:lload_2         
	//   23   43:ladd            
	//   24   44:invokestatic    #76  <Method long Math.min(long, long)>
	//   25   47:lreturn         
		}
		int j = a.getPlayState();
	//   26   48:aload_0         
	//   27   49:getfield        #30  <Field AudioTrack a>
	//   28   52:invokevirtual   #79  <Method int AudioTrack.getPlayState()>
	//   29   55:istore_1        
		if(j == 1)
	//*  30   56:iload_1         
	//*  31   57:iconst_1        
	//*  32   58:icmpne          63
			return 0L;
	//   33   61:lconst_0        
	//   34   62:lreturn         
		long l2 = 0xffffffffL & (long)a.getPlaybackHeadPosition();
	//   35   63:ldc2w           #80  <Long 0xffffffffL>
	//   36   66:aload_0         
	//   37   67:getfield        #30  <Field AudioTrack a>
	//   38   70:invokevirtual   #84  <Method int AudioTrack.getPlaybackHeadPosition()>
	//   39   73:i2l             
	//   40   74:land            
	//   41   75:lstore          4
		long l1 = l2;
	//   42   77:lload           4
	//   43   79:lstore_2        
		if(b)
	//*  44   80:aload_0         
	//*  45   81:getfield        #56  <Field boolean b>
	//*  46   84:ifeq            115
		{
			if(j == 2 && l2 == 0L)
	//*  47   87:iload_1         
	//*  48   88:iconst_2        
	//*  49   89:icmpne          107
	//*  50   92:lload           4
	//*  51   94:lconst_0        
	//*  52   95:lcmp            
	//*  53   96:ifne            107
				f = d;
	//   54   99:aload_0         
	//   55  100:aload_0         
	//   56  101:getfield        #58  <Field long d>
	//   57  104:putfield        #62  <Field long f>
			l1 = l2 + f;
	//   58  107:lload           4
	//   59  109:aload_0         
	//   60  110:getfield        #62  <Field long f>
	//   61  113:ladd            
	//   62  114:lstore_2        
		}
		if(d > l1)
	//*  63  115:aload_0         
	//*  64  116:getfield        #58  <Field long d>
	//*  65  119:lload_2         
	//*  66  120:lcmp            
	//*  67  121:ifle            134
			e = e + 1L;
	//   68  124:aload_0         
	//   69  125:aload_0         
	//   70  126:getfield        #60  <Field long e>
	//   71  129:lconst_1        
	//   72  130:ladd            
	//   73  131:putfield        #60  <Field long e>
		d = l1;
	//   74  134:aload_0         
	//   75  135:lload_2         
	//   76  136:putfield        #58  <Field long d>
		return l1 + (e << 32);
	//   77  139:lload_2         
	//   78  140:aload_0         
	//   79  141:getfield        #60  <Field long e>
	//   80  144:bipush          32
	//   81  146:lshl            
	//   82  147:ladd            
	//   83  148:lreturn         
	}

	public final long c()
	{
		return (b() * 0xf4240L) / (long)c;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method long b()>
	//    2    4:ldc2w           #69  <Long 0xf4240L>
	//    3    7:lmul            
	//    4    8:aload_0         
	//    5    9:getfield        #68  <Field int c>
	//    6   12:i2l             
	//    7   13:ldiv            
	//    8   14:lreturn         
	}

	public boolean d()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public long e()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #87  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #88  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public long f()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #87  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #88  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	protected AudioTrack a;
	private boolean b;
	private int c;
	private long d;
	private long e;
	private long f;
	private long g;
	private long h;
	private long i;
}
