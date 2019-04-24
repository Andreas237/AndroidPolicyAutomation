// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.decoder;


// Referenced classes of package com.google.android.exoplayer2.decoder:
//			CryptoInfo

private static final class CryptoInfo$PatternHolderV24
{

	private void set(int i, int j)
	{
		pattern.set(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field android.media.MediaCodec$CryptoInfo$Pattern pattern>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #38  <Method void android.media.MediaCodec$CryptoInfo$Pattern.set(int, int)>
		frameworkCryptoInfo.setPattern(pattern);
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field android.media.MediaCodec$CryptoInfo frameworkCryptoInfo>
	//    7   13:aload_0         
	//    8   14:getfield        #28  <Field android.media.MediaCodec$CryptoInfo$Pattern pattern>
	//    9   17:invokevirtual   #44  <Method void android.media.MediaCodec$CryptoInfo.setPattern(android.media.MediaCodec$CryptoInfo$Pattern)>
	//   10   20:return          
	}

	private final android.media.MediaCodec.CryptoInfo frameworkCryptoInfo;
	private final android.media.n pattern;


/*
	static void access$100(CryptoInfo$PatternHolderV24 cryptoinfo$patternholderv24, int i, int j)
	{
		cryptoinfo$patternholderv24.set(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void set(int, int)>
		return;
	//    4    6:return          
	}

*/

	private CryptoInfo$PatternHolderV24(android.media.MediaCodec.CryptoInfo cryptoinfo)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		frameworkCryptoInfo = cryptoinfo;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field android.media.MediaCodec$CryptoInfo frameworkCryptoInfo>
		pattern = new android.media.n(0, 0);
	//    5    9:aload_0         
	//    6   10:new             #23  <Class android.media.MediaCodec$CryptoInfo$Pattern>
	//    7   13:dup             
	//    8   14:iconst_0        
	//    9   15:iconst_0        
	//   10   16:invokespecial   #26  <Method void android.media.MediaCodec$CryptoInfo$Pattern(int, int)>
	//   11   19:putfield        #28  <Field android.media.MediaCodec$CryptoInfo$Pattern pattern>
	//   12   22:return          
	}

	CryptoInfo$PatternHolderV24(android.media.MediaCodec.CryptoInfo cryptoinfo, CryptoInfo._cls1 _pcls1)
	{
		this(cryptoinfo);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #32  <Method void CryptoInfo$PatternHolderV24(android.media.MediaCodec$CryptoInfo)>
	//    3    5:return          
	}
}
