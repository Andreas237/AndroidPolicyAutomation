// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			aiy, ajf, ajh, aoq

final class aka
	implements aiy
{

	aka(ajf ajf1)
	{
		a = ajf1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field ajf a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final byte[] a(byte abyte0[], byte abyte1[])
	{
		return aoq.a(new byte[][] {
			a.a().b(), ((aiy)a.a().a()).a(abyte0, abyte1)
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       byte[][]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #12  <Field ajf a>
	//    6   10:invokevirtual   #24  <Method ajh ajf.a()>
	//    7   13:invokevirtual   #30  <Method byte[] ajh.b()>
	//    8   16:aastore         
	//    9   17:dup             
	//   10   18:iconst_1        
	//   11   19:aload_0         
	//   12   20:getfield        #12  <Field ajf a>
	//   13   23:invokevirtual   #24  <Method ajh ajf.a()>
	//   14   26:invokevirtual   #33  <Method Object ajh.a()>
	//   15   29:checkcast       #6   <Class aiy>
	//   16   32:aload_1         
	//   17   33:aload_2         
	//   18   34:invokeinterface #35  <Method byte[] aiy.a(byte[], byte[])>
	//   19   39:aastore         
	//   20   40:invokestatic    #40  <Method byte[] aoq.a(byte[][])>
	//   21   43:areturn         
	}

	private final ajf a;
}
