// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bez

final class bfa
{

	private bfa(android.media.MediaCodec.CryptoInfo cryptoinfo)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		a = cryptoinfo;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field android.media.MediaCodec$CryptoInfo a>
		b = new android.media.MediaCodec.CryptoInfo.Pattern(0, 0);
	//    5    9:aload_0         
	//    6   10:new             #20  <Class android.media.MediaCodec$CryptoInfo$Pattern>
	//    7   13:dup             
	//    8   14:iconst_0        
	//    9   15:iconst_0        
	//   10   16:invokespecial   #23  <Method void android.media.MediaCodec$CryptoInfo$Pattern(int, int)>
	//   11   19:putfield        #25  <Field android.media.MediaCodec$CryptoInfo$Pattern b>
	//   12   22:return          
	}

	bfa(android.media.MediaCodec.CryptoInfo cryptoinfo, bez bez)
	{
		this(cryptoinfo);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #29  <Method void bfa(android.media.MediaCodec$CryptoInfo)>
	//    3    5:return          
	}

	private final void a(int i, int j)
	{
		b.set(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field android.media.MediaCodec$CryptoInfo$Pattern b>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #32  <Method void android.media.MediaCodec$CryptoInfo$Pattern.set(int, int)>
		a.setPattern(b);
	//    5    9:aload_0         
	//    6   10:getfield        #18  <Field android.media.MediaCodec$CryptoInfo a>
	//    7   13:aload_0         
	//    8   14:getfield        #25  <Field android.media.MediaCodec$CryptoInfo$Pattern b>
	//    9   17:invokevirtual   #38  <Method void android.media.MediaCodec$CryptoInfo.setPattern(android.media.MediaCodec$CryptoInfo$Pattern)>
	//   10   20:return          
	}

	static void a(bfa bfa1, int i, int j)
	{
		bfa1.a(0, 0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:invokespecial   #41  <Method void a(int, int)>
	//    4    6:return          
	}

	private final android.media.MediaCodec.CryptoInfo a;
	private final android.media.MediaCodec.CryptoInfo.Pattern b;
}
