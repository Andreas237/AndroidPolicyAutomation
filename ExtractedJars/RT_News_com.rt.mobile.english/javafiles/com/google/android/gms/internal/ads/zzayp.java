// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzauf, zzayt, zzayr, zzayn, 
//			zzays, zzatz, zzayw

public final class zzayp
	implements zzauf
{

	public zzayp(ECPublicKey ecpublickey, byte abyte0[], String s, zzayw zzayw, zzayn zzayn1)
		throws GeneralSecurityException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		zzayt.zza(ecpublickey.getW(), ecpublickey.getParams().getCurve());
	//    2    4:aload_1         
	//    3    5:invokeinterface #34  <Method java.security.spec.ECPoint ECPublicKey.getW()>
	//    4   10:aload_1         
	//    5   11:invokeinterface #38  <Method ECParameterSpec ECPublicKey.getParams()>
	//    6   16:invokevirtual   #44  <Method java.security.spec.EllipticCurve ECParameterSpec.getCurve()>
	//    7   19:invokestatic    #50  <Method void zzayt.zza(java.security.spec.ECPoint, java.security.spec.EllipticCurve)>
		zzdni = new zzayr(ecpublickey);
	//    8   22:aload_0         
	//    9   23:new             #52  <Class zzayr>
	//   10   26:dup             
	//   11   27:aload_1         
	//   12   28:invokespecial   #55  <Method void zzayr(ECPublicKey)>
	//   13   31:putfield        #57  <Field zzayr zzdni>
		zzdnf = abyte0;
	//   14   34:aload_0         
	//   15   35:aload_2         
	//   16   36:putfield        #59  <Field byte[] zzdnf>
		zzdne = s;
	//   17   39:aload_0         
	//   18   40:aload_3         
	//   19   41:putfield        #61  <Field String zzdne>
		zzdng = zzayw;
	//   20   44:aload_0         
	//   21   45:aload           4
	//   22   47:putfield        #63  <Field zzayw zzdng>
		zzdnh = zzayn1;
	//   23   50:aload_0         
	//   24   51:aload           5
	//   25   53:putfield        #65  <Field zzayn zzdnh>
	//   26   56:return          
	}

	public final byte[] zzc(byte abyte0[], byte abyte1[])
		throws GeneralSecurityException
	{
		abyte1 = ((byte []) (zzdni.zza(zzdne, zzdnf, abyte1, zzdnh.zzwm(), zzdng)));
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field zzayr zzdni>
	//    2    4:aload_0         
	//    3    5:getfield        #61  <Field String zzdne>
	//    4    8:aload_0         
	//    5    9:getfield        #59  <Field byte[] zzdnf>
	//    6   12:aload_2         
	//    7   13:aload_0         
	//    8   14:getfield        #65  <Field zzayn zzdnh>
	//    9   17:invokeinterface #74  <Method int zzayn.zzwm()>
	//   10   22:aload_0         
	//   11   23:getfield        #63  <Field zzayw zzdng>
	//   12   26:invokevirtual   #77  <Method zzays zzayr.zza(String, byte[], byte[], int, zzayw)>
	//   13   29:astore_2        
		abyte0 = zzdnh.zzi(((zzays) (abyte1)).zzaaq()).zzc(abyte0, zzdhv);
	//   14   30:aload_0         
	//   15   31:getfield        #65  <Field zzayn zzdnh>
	//   16   34:aload_2         
	//   17   35:invokevirtual   #83  <Method byte[] zzays.zzaaq()>
	//   18   38:invokeinterface #87  <Method zzatz zzayn.zzi(byte[])>
	//   19   43:aload_1         
	//   20   44:getstatic       #21  <Field byte[] zzdhv>
	//   21   47:invokeinterface #91  <Method byte[] zzatz.zzc(byte[], byte[])>
	//   22   52:astore_1        
		abyte1 = ((zzays) (abyte1)).zzaap();
	//   23   53:aload_2         
	//   24   54:invokevirtual   #94  <Method byte[] zzays.zzaap()>
	//   25   57:astore_2        
		return ByteBuffer.allocate(abyte1.length + abyte0.length).put(abyte1).put(abyte0).array();
	//   26   58:aload_2         
	//   27   59:arraylength     
	//   28   60:aload_1         
	//   29   61:arraylength     
	//   30   62:iadd            
	//   31   63:invokestatic    #100 <Method ByteBuffer ByteBuffer.allocate(int)>
	//   32   66:aload_2         
	//   33   67:invokevirtual   #104 <Method ByteBuffer ByteBuffer.put(byte[])>
	//   34   70:aload_1         
	//   35   71:invokevirtual   #104 <Method ByteBuffer ByteBuffer.put(byte[])>
	//   36   74:invokevirtual   #107 <Method byte[] ByteBuffer.array()>
	//   37   77:areturn         
	}

	private static final byte zzdhv[] = new byte[0];
	private final String zzdne;
	private final byte zzdnf[];
	private final zzayw zzdng;
	private final zzayn zzdnh;
	private final zzayr zzdni;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:newarray        byte[]
	//    2    3:putstatic       #21  <Field byte[] zzdhv>
	//*   3    6:return          
	}
}
