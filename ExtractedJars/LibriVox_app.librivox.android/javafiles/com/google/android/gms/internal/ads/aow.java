// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aiy, apa, aoy, aou, 
//			aoz, ais, apd

public final class aow
	implements aiy
{

	public aow(ECPublicKey ecpublickey, byte abyte0[], String s, apd apd, aou aou1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		apa.a(ecpublickey.getW(), ecpublickey.getParams().getCurve());
	//    2    4:aload_1         
	//    3    5:invokeinterface #32  <Method java.security.spec.ECPoint ECPublicKey.getW()>
	//    4   10:aload_1         
	//    5   11:invokeinterface #36  <Method ECParameterSpec ECPublicKey.getParams()>
	//    6   16:invokevirtual   #42  <Method java.security.spec.EllipticCurve ECParameterSpec.getCurve()>
	//    7   19:invokestatic    #47  <Method void apa.a(java.security.spec.ECPoint, java.security.spec.EllipticCurve)>
		b = new aoy(ecpublickey);
	//    8   22:aload_0         
	//    9   23:new             #49  <Class aoy>
	//   10   26:dup             
	//   11   27:aload_1         
	//   12   28:invokespecial   #52  <Method void aoy(ECPublicKey)>
	//   13   31:putfield        #54  <Field aoy b>
		d = abyte0;
	//   14   34:aload_0         
	//   15   35:aload_2         
	//   16   36:putfield        #56  <Field byte[] d>
		c = s;
	//   17   39:aload_0         
	//   18   40:aload_3         
	//   19   41:putfield        #58  <Field String c>
		e = apd;
	//   20   44:aload_0         
	//   21   45:aload           4
	//   22   47:putfield        #60  <Field apd e>
		f = aou1;
	//   23   50:aload_0         
	//   24   51:aload           5
	//   25   53:putfield        #62  <Field aou f>
	//   26   56:return          
	}

	public final byte[] a(byte abyte0[], byte abyte1[])
	{
		abyte1 = ((byte []) (b.a(c, d, abyte1, f.a(), e)));
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field aoy b>
	//    2    4:aload_0         
	//    3    5:getfield        #58  <Field String c>
	//    4    8:aload_0         
	//    5    9:getfield        #56  <Field byte[] d>
	//    6   12:aload_2         
	//    7   13:aload_0         
	//    8   14:getfield        #62  <Field aou f>
	//    9   17:invokeinterface #68  <Method int aou.a()>
	//   10   22:aload_0         
	//   11   23:getfield        #60  <Field apd e>
	//   12   26:invokevirtual   #71  <Method aoz aoy.a(String, byte[], byte[], int, apd)>
	//   13   29:astore_2        
		abyte0 = f.a(((aoz) (abyte1)).b()).a(abyte0, a);
	//   14   30:aload_0         
	//   15   31:getfield        #62  <Field aou f>
	//   16   34:aload_2         
	//   17   35:invokevirtual   #76  <Method byte[] aoz.b()>
	//   18   38:invokeinterface #79  <Method ais aou.a(byte[])>
	//   19   43:aload_1         
	//   20   44:getstatic       #21  <Field byte[] a>
	//   21   47:invokeinterface #83  <Method byte[] ais.a(byte[], byte[])>
	//   22   52:astore_1        
		abyte1 = ((aoz) (abyte1)).a();
	//   23   53:aload_2         
	//   24   54:invokevirtual   #85  <Method byte[] aoz.a()>
	//   25   57:astore_2        
		return ByteBuffer.allocate(abyte1.length + abyte0.length).put(abyte1).put(abyte0).array();
	//   26   58:aload_2         
	//   27   59:arraylength     
	//   28   60:aload_1         
	//   29   61:arraylength     
	//   30   62:iadd            
	//   31   63:invokestatic    #91  <Method ByteBuffer ByteBuffer.allocate(int)>
	//   32   66:aload_2         
	//   33   67:invokevirtual   #95  <Method ByteBuffer ByteBuffer.put(byte[])>
	//   34   70:aload_1         
	//   35   71:invokevirtual   #95  <Method ByteBuffer ByteBuffer.put(byte[])>
	//   36   74:invokevirtual   #98  <Method byte[] ByteBuffer.array()>
	//   37   77:areturn         
	}

	private static final byte a[] = new byte[0];
	private final aoy b;
	private final String c;
	private final byte d[];
	private final apd e;
	private final aou f;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:newarray        byte[]
	//    2    3:putstatic       #21  <Field byte[] a>
	//*   3    6:return          
	}
}
