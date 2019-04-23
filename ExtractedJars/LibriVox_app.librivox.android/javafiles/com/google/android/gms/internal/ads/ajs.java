// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ais, aji, atv, ang

public final class ajs
	implements ais
{

	public ajs(ang ang1, ais ais1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		b = ang1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field ang b>
		c = ais1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field ais c>
	//    8   14:return          
	}

	public final byte[] a(byte abyte0[], byte abyte1[])
	{
		byte abyte3[] = aji.b(b).i();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field ang b>
	//    2    4:invokestatic    #31  <Method atv aji.b(ang)>
	//    3    7:invokeinterface #37  <Method byte[] atv.i()>
	//    4   12:astore          4
		byte abyte2[] = c.a(abyte3, a);
	//    5   14:aload_0         
	//    6   15:getfield        #25  <Field ais c>
	//    7   18:aload           4
	//    8   20:getstatic       #16  <Field byte[] a>
	//    9   23:invokeinterface #39  <Method byte[] ais.a(byte[], byte[])>
	//   10   28:astore_3        
		abyte0 = ((ais)aji.a(b.a(), abyte3)).a(abyte0, abyte1);
	//   11   29:aload_0         
	//   12   30:getfield        #23  <Field ang b>
	//   13   33:invokevirtual   #44  <Method String ang.a()>
	//   14   36:aload           4
	//   15   38:invokestatic    #47  <Method Object aji.a(String, byte[])>
	//   16   41:checkcast       #6   <Class ais>
	//   17   44:aload_1         
	//   18   45:aload_2         
	//   19   46:invokeinterface #39  <Method byte[] ais.a(byte[], byte[])>
	//   20   51:astore_1        
		return ByteBuffer.allocate(abyte2.length + 4 + abyte0.length).putInt(abyte2.length).put(abyte2).put(abyte0).array();
	//   21   52:aload_3         
	//   22   53:arraylength     
	//   23   54:iconst_4        
	//   24   55:iadd            
	//   25   56:aload_1         
	//   26   57:arraylength     
	//   27   58:iadd            
	//   28   59:invokestatic    #53  <Method ByteBuffer ByteBuffer.allocate(int)>
	//   29   62:aload_3         
	//   30   63:arraylength     
	//   31   64:invokevirtual   #56  <Method ByteBuffer ByteBuffer.putInt(int)>
	//   32   67:aload_3         
	//   33   68:invokevirtual   #60  <Method ByteBuffer ByteBuffer.put(byte[])>
	//   34   71:aload_1         
	//   35   72:invokevirtual   #60  <Method ByteBuffer ByteBuffer.put(byte[])>
	//   36   75:invokevirtual   #63  <Method byte[] ByteBuffer.array()>
	//   37   78:areturn         
	}

	private static final byte a[] = new byte[0];
	private final ang b;
	private final ais c;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:newarray        byte[]
	//    2    3:putstatic       #16  <Field byte[] a>
	//*   3    6:return          
	}
}
