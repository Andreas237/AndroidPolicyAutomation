// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.a.a;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

// Referenced classes of package com.google.ads.interactivemedia.v3.a.a:
//			b

private static class b$b extends b$a
{

	public void a(AudioTrack audiotrack, boolean flag)
	{
		super.a(audiotrack, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #31  <Method void b$a.a(AudioTrack, boolean)>
		c = 0L;
	//    4    6:aload_0         
	//    5    7:lconst_0        
	//    6    8:putfield        #33  <Field long c>
		d = 0L;
	//    7   11:aload_0         
	//    8   12:lconst_0        
	//    9   13:putfield        #35  <Field long d>
		e = 0L;
	//   10   16:aload_0         
	//   11   17:lconst_0        
	//   12   18:putfield        #37  <Field long e>
	//   13   21:return          
	}

	public boolean d()
	{
		boolean flag = a.getTimestamp(b);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field AudioTrack a>
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field AudioTimestamp b>
	//    4    8:invokevirtual   #47  <Method boolean AudioTrack.getTimestamp(AudioTimestamp)>
	//    5   11:istore_1        
		if(flag)
	//*   6   12:iload_1         
	//*   7   13:ifeq            61
		{
			long l = b.framePosition;
	//    8   16:aload_0         
	//    9   17:getfield        #26  <Field AudioTimestamp b>
	//   10   20:getfield        #50  <Field long AudioTimestamp.framePosition>
	//   11   23:lstore_2        
			if(d > l)
	//*  12   24:aload_0         
	//*  13   25:getfield        #35  <Field long d>
	//*  14   28:lload_2         
	//*  15   29:lcmp            
	//*  16   30:ifle            43
				c = c + 1L;
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:getfield        #33  <Field long c>
	//   20   38:lconst_1        
	//   21   39:ladd            
	//   22   40:putfield        #33  <Field long c>
			d = l;
	//   23   43:aload_0         
	//   24   44:lload_2         
	//   25   45:putfield        #35  <Field long d>
			e = l + (c << 32);
	//   26   48:aload_0         
	//   27   49:lload_2         
	//   28   50:aload_0         
	//   29   51:getfield        #33  <Field long c>
	//   30   54:bipush          32
	//   31   56:lshl            
	//   32   57:ladd            
	//   33   58:putfield        #37  <Field long e>
		}
		return flag;
	//   34   61:iload_1         
	//   35   62:ireturn         
	}

	public long e()
	{
		return b.nanoTime;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field AudioTimestamp b>
	//    2    4:getfield        #54  <Field long AudioTimestamp.nanoTime>
	//    3    7:lreturn         
	}

	public long f()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field long e>
	//    2    4:lreturn         
	}

	private final AudioTimestamp b = new AudioTimestamp();
	private long c;
	private long d;
	private long e;

	public b$b()
	{
		super(((b$1) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #20  <Method void b$a(b$1)>
	//    3    5:aload_0         
	//    4    6:new             #22  <Class AudioTimestamp>
	//    5    9:dup             
	//    6   10:invokespecial   #24  <Method void AudioTimestamp()>
	//    7   13:putfield        #26  <Field AudioTimestamp b>
	//    8   16:return          
	}
}
