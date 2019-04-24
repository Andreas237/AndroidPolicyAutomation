// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzatz, zzauo, zzbcu, zzaxn

public final class zzauy
	implements zzatz
{

	public zzauy(zzaxn zzaxn1, zzatz zzatz1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		zzdhw = zzaxn1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field zzaxn zzdhw>
		zzdhx = zzatz1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field zzatz zzdhx>
	//    8   14:return          
	}

	public final byte[] zzc(byte abyte0[], byte abyte1[])
		throws GeneralSecurityException
	{
		byte abyte3[] = zzauo.zzb(zzdhw).toByteArray();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field zzaxn zzdhw>
	//    2    4:invokestatic    #35  <Method zzbcu zzauo.zzb(zzaxn)>
	//    3    7:invokeinterface #41  <Method byte[] zzbcu.toByteArray()>
	//    4   12:astore          4
		byte abyte2[] = zzdhx.zzc(abyte3, zzdhv);
	//    5   14:aload_0         
	//    6   15:getfield        #25  <Field zzatz zzdhx>
	//    7   18:aload           4
	//    8   20:getstatic       #16  <Field byte[] zzdhv>
	//    9   23:invokeinterface #43  <Method byte[] zzatz.zzc(byte[], byte[])>
	//   10   28:astore_3        
		abyte0 = ((zzatz)zzauo.zza(zzdhw.zzyw(), abyte3)).zzc(abyte0, abyte1);
	//   11   29:aload_0         
	//   12   30:getfield        #23  <Field zzaxn zzdhw>
	//   13   33:invokevirtual   #49  <Method String zzaxn.zzyw()>
	//   14   36:aload           4
	//   15   38:invokestatic    #53  <Method Object zzauo.zza(String, byte[])>
	//   16   41:checkcast       #6   <Class zzatz>
	//   17   44:aload_1         
	//   18   45:aload_2         
	//   19   46:invokeinterface #43  <Method byte[] zzatz.zzc(byte[], byte[])>
	//   20   51:astore_1        
		return ByteBuffer.allocate(4 + abyte2.length + abyte0.length).putInt(abyte2.length).put(abyte2).put(abyte0).array();
	//   21   52:iconst_4        
	//   22   53:aload_3         
	//   23   54:arraylength     
	//   24   55:iadd            
	//   25   56:aload_1         
	//   26   57:arraylength     
	//   27   58:iadd            
	//   28   59:invokestatic    #59  <Method ByteBuffer ByteBuffer.allocate(int)>
	//   29   62:aload_3         
	//   30   63:arraylength     
	//   31   64:invokevirtual   #62  <Method ByteBuffer ByteBuffer.putInt(int)>
	//   32   67:aload_3         
	//   33   68:invokevirtual   #66  <Method ByteBuffer ByteBuffer.put(byte[])>
	//   34   71:aload_1         
	//   35   72:invokevirtual   #66  <Method ByteBuffer ByteBuffer.put(byte[])>
	//   36   75:invokevirtual   #69  <Method byte[] ByteBuffer.array()>
	//   37   78:areturn         
	}

	private static final byte zzdhv[] = new byte[0];
	private final zzaxn zzdhw;
	private final zzatz zzdhx;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:newarray        byte[]
	//    2    3:putstatic       #16  <Field byte[] zzdhv>
	//*   3    6:return          
	}
}
