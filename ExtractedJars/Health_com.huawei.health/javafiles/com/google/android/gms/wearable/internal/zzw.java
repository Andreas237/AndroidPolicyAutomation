// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.wearable.ChannelIOException;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzr, zzad

public final class zzw extends InputStream
{

	public zzw(InputStream inputstream)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void InputStream()>
		zzbUd = (InputStream)zzac.zzw(((Object) (inputstream)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #21  <Method Object zzac.zzw(Object)>
	//    5    9:checkcast       #4   <Class InputStream>
	//    6   12:putfield        #23  <Field InputStream zzbUd>
	//    7   15:return          
	}

	private int zzpv(int i)
		throws ChannelIOException
	{
		if(i == -1)
	//*   0    0:iload_1         
	//*   1    1:iconst_m1       
	//*   2    2:icmpne          32
		{
			zzr zzr1 = zzbUe;
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field zzr zzbUe>
	//    5    9:astore_2        
			if(zzr1 != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          32
				throw new ChannelIOException("Channel closed unexpectedly before stream was finished", zzr1.zzbTU, zzr1.zzbTV);
	//    8   14:new             #28  <Class ChannelIOException>
	//    9   17:dup             
	//   10   18:ldc1            #32  <String "Channel closed unexpectedly before stream was finished">
	//   11   20:aload_2         
	//   12   21:getfield        #38  <Field int zzr.zzbTU>
	//   13   24:aload_2         
	//   14   25:getfield        #41  <Field int zzr.zzbTV>
	//   15   28:invokespecial   #44  <Method void ChannelIOException(String, int, int)>
	//   16   31:athrow          
		}
		return i;
	//   17   32:iload_1         
	//   18   33:ireturn         
	}

	public int available()
		throws IOException
	{
		return zzbUd.available();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field InputStream zzbUd>
	//    2    4:invokevirtual   #51  <Method int InputStream.available()>
	//    3    7:ireturn         
	}

	public void close()
		throws IOException
	{
		zzbUd.close();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field InputStream zzbUd>
	//    2    4:invokevirtual   #54  <Method void InputStream.close()>
	//    3    7:return          
	}

	public void mark(int i)
	{
		zzbUd.mark(i);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field InputStream zzbUd>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #58  <Method void InputStream.mark(int)>
	//    4    8:return          
	}

	public boolean markSupported()
	{
		return zzbUd.markSupported();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field InputStream zzbUd>
	//    2    4:invokevirtual   #62  <Method boolean InputStream.markSupported()>
	//    3    7:ireturn         
	}

	public int read()
		throws IOException
	{
		return zzpv(zzbUd.read());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #23  <Field InputStream zzbUd>
	//    3    5:invokevirtual   #65  <Method int InputStream.read()>
	//    4    8:invokespecial   #67  <Method int zzpv(int)>
	//    5   11:ireturn         
	}

	public int read(byte abyte0[])
		throws IOException
	{
		return zzpv(zzbUd.read(abyte0));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #23  <Field InputStream zzbUd>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #70  <Method int InputStream.read(byte[])>
	//    5    9:invokespecial   #67  <Method int zzpv(int)>
	//    6   12:ireturn         
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		return zzpv(zzbUd.read(abyte0, i, j));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #23  <Field InputStream zzbUd>
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:invokevirtual   #73  <Method int InputStream.read(byte[], int, int)>
	//    7   11:invokespecial   #67  <Method int zzpv(int)>
	//    8   14:ireturn         
	}

	public void reset()
		throws IOException
	{
		zzbUd.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field InputStream zzbUd>
	//    2    4:invokevirtual   #76  <Method void InputStream.reset()>
	//    3    7:return          
	}

	public long skip(long l)
		throws IOException
	{
		return zzbUd.skip(l);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field InputStream zzbUd>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #80  <Method long InputStream.skip(long)>
	//    4    8:lreturn         
	}

	zzad zzUu()
	{
		return new zzad() {

			public void zzb(zzr zzr1)
			{
				zzbUf.zza(zzr1);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field zzw zzbUf>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #26  <Method void zzw.zza(zzr)>
			//    4    8:return          
			}

			final zzw zzbUf;

			
			{
				zzbUf = zzw.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field zzw zzbUf>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #6   <Class zzw$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #85  <Method void zzw$1(zzw)>
	//    4    8:areturn         
	}

	void zza(zzr zzr1)
	{
		zzbUe = (zzr)zzac.zzw(((Object) (zzr1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #21  <Method Object zzac.zzw(Object)>
	//    3    5:checkcast       #34  <Class zzr>
	//    4    8:putfield        #30  <Field zzr zzbUe>
	//    5   11:return          
	}

	private final InputStream zzbUd;
	private volatile zzr zzbUe;
}
