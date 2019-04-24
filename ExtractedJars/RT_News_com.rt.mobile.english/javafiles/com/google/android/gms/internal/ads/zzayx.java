// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzatz, zzazi, zzayk, zzauk

public final class zzayx
	implements zzatz
{

	public zzayx(zzazi zzazi1, zzauk zzauk1, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzdnv = zzazi1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field zzazi zzdnv>
		zzdnw = zzauk1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field zzauk zzdnw>
		zzdnx = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #23  <Field int zzdnx>
	//   11   19:return          
	}

	public final byte[] zzc(byte abyte0[], byte abyte1[])
		throws GeneralSecurityException
	{
		byte abyte2[] = zzdnv.zzk(abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzazi zzdnv>
	//    2    4:aload_1         
	//    3    5:invokeinterface #34  <Method byte[] zzazi.zzk(byte[])>
	//    4   10:astore_3        
		abyte0 = abyte1;
	//    5   11:aload_2         
	//    6   12:astore_1        
		if(abyte1 == null)
	//*   7   13:aload_2         
	//*   8   14:ifnonnull       21
			abyte0 = new byte[0];
	//    9   17:iconst_0        
	//   10   18:newarray        byte[]
	//   11   20:astore_1        
		abyte1 = Arrays.copyOf(ByteBuffer.allocate(8).putLong(8L * (long)abyte0.length).array(), 8);
	//   12   21:bipush          8
	//   13   23:invokestatic    #40  <Method ByteBuffer ByteBuffer.allocate(int)>
	//   14   26:ldc2w           #41  <Long 8L>
	//   15   29:aload_1         
	//   16   30:arraylength     
	//   17   31:i2l             
	//   18   32:lmul            
	//   19   33:invokevirtual   #46  <Method ByteBuffer ByteBuffer.putLong(long)>
	//   20   36:invokevirtual   #50  <Method byte[] ByteBuffer.array()>
	//   21   39:bipush          8
	//   22   41:invokestatic    #56  <Method byte[] Arrays.copyOf(byte[], int)>
	//   23   44:astore_2        
		return zzayk.zza(new byte[][] {
			abyte2, zzdnw.zzg(zzayk.zza(new byte[][] {
				abyte0, abyte2, abyte1
			}))
		});
	//   24   45:iconst_2        
	//   25   46:anewarray       byte[][]
	//   26   49:dup             
	//   27   50:iconst_0        
	//   28   51:aload_3         
	//   29   52:aastore         
	//   30   53:dup             
	//   31   54:iconst_1        
	//   32   55:aload_0         
	//   33   56:getfield        #21  <Field zzauk zzdnw>
	//   34   59:iconst_3        
	//   35   60:anewarray       byte[][]
	//   36   63:dup             
	//   37   64:iconst_0        
	//   38   65:aload_1         
	//   39   66:aastore         
	//   40   67:dup             
	//   41   68:iconst_1        
	//   42   69:aload_3         
	//   43   70:aastore         
	//   44   71:dup             
	//   45   72:iconst_2        
	//   46   73:aload_2         
	//   47   74:aastore         
	//   48   75:invokestatic    #64  <Method byte[] zzayk.zza(byte[][])>
	//   49   78:invokeinterface #69  <Method byte[] zzauk.zzg(byte[])>
	//   50   83:aastore         
	//   51   84:invokestatic    #64  <Method byte[] zzayk.zza(byte[][])>
	//   52   87:areturn         
	}

	private final zzazi zzdnv;
	private final zzauk zzdnw;
	private final int zzdnx;
}
