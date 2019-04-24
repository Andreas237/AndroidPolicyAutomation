// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.decoder;

import com.google.android.exoplayer2.util.Util;

public final class CryptoInfo
{
	private static final class PatternHolderV24
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
		private final android.media.MediaCodec.CryptoInfo.Pattern pattern;


/*
		static void access$100(PatternHolderV24 patternholderv24, int i, int j)
		{
			patternholderv24.set(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void set(int, int)>
			return;
		//    4    6:return          
		}

*/

		private PatternHolderV24(android.media.MediaCodec.CryptoInfo cryptoinfo)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			frameworkCryptoInfo = cryptoinfo;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field android.media.MediaCodec$CryptoInfo frameworkCryptoInfo>
			pattern = new android.media.MediaCodec.CryptoInfo.Pattern(0, 0);
		//    5    9:aload_0         
		//    6   10:new             #23  <Class android.media.MediaCodec$CryptoInfo$Pattern>
		//    7   13:dup             
		//    8   14:iconst_0        
		//    9   15:iconst_0        
		//   10   16:invokespecial   #26  <Method void android.media.MediaCodec$CryptoInfo$Pattern(int, int)>
		//   11   19:putfield        #28  <Field android.media.MediaCodec$CryptoInfo$Pattern pattern>
		//   12   22:return          
		}

	}


	public CryptoInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		Object obj;
		if(Util.SDK_INT >= 16)
	//*   2    4:getstatic       #33  <Field int Util.SDK_INT>
	//*   3    7:bipush          16
	//*   4    9:icmplt          20
			obj = ((Object) (newFrameworkCryptoInfoV16()));
	//    5   12:aload_0         
	//    6   13:invokespecial   #37  <Method android.media.MediaCodec$CryptoInfo newFrameworkCryptoInfoV16()>
	//    7   16:astore_1        
		else
	//*   8   17:goto            22
			obj = null;
	//    9   20:aconst_null     
	//   10   21:astore_1        
		frameworkCryptoInfo = ((android.media.MediaCodec.CryptoInfo) (obj));
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:putfield        #39  <Field android.media.MediaCodec$CryptoInfo frameworkCryptoInfo>
		if(Util.SDK_INT >= 24)
	//*  14   27:getstatic       #33  <Field int Util.SDK_INT>
	//*  15   30:bipush          24
	//*  16   32:icmplt          51
			obj = ((Object) (new PatternHolderV24(frameworkCryptoInfo)));
	//   17   35:new             #8   <Class CryptoInfo$PatternHolderV24>
	//   18   38:dup             
	//   19   39:aload_0         
	//   20   40:getfield        #39  <Field android.media.MediaCodec$CryptoInfo frameworkCryptoInfo>
	//   21   43:aconst_null     
	//   22   44:invokespecial   #42  <Method void CryptoInfo$PatternHolderV24(android.media.MediaCodec$CryptoInfo, CryptoInfo$1)>
	//   23   47:astore_1        
		else
	//*  24   48:goto            53
			obj = null;
	//   25   51:aconst_null     
	//   26   52:astore_1        
		patternHolder = ((PatternHolderV24) (obj));
	//   27   53:aload_0         
	//   28   54:aload_1         
	//   29   55:putfield        #44  <Field CryptoInfo$PatternHolderV24 patternHolder>
	//   30   58:return          
	}

	private android.media.MediaCodec.CryptoInfo newFrameworkCryptoInfoV16()
	{
		return new android.media.MediaCodec.CryptoInfo();
	//    0    0:new             #50  <Class android.media.MediaCodec$CryptoInfo>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void android.media.MediaCodec$CryptoInfo()>
	//    3    7:areturn         
	}

	private void updateFrameworkCryptoInfoV16()
	{
		frameworkCryptoInfo.numSubSamples = numSubSamples;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field android.media.MediaCodec$CryptoInfo frameworkCryptoInfo>
	//    2    4:aload_0         
	//    3    5:getfield        #55  <Field int numSubSamples>
	//    4    8:putfield        #56  <Field int android.media.MediaCodec$CryptoInfo.numSubSamples>
		frameworkCryptoInfo.numBytesOfClearData = numBytesOfClearData;
	//    5   11:aload_0         
	//    6   12:getfield        #39  <Field android.media.MediaCodec$CryptoInfo frameworkCryptoInfo>
	//    7   15:aload_0         
	//    8   16:getfield        #58  <Field int[] numBytesOfClearData>
	//    9   19:putfield        #59  <Field int[] android.media.MediaCodec$CryptoInfo.numBytesOfClearData>
		frameworkCryptoInfo.numBytesOfEncryptedData = numBytesOfEncryptedData;
	//   10   22:aload_0         
	//   11   23:getfield        #39  <Field android.media.MediaCodec$CryptoInfo frameworkCryptoInfo>
	//   12   26:aload_0         
	//   13   27:getfield        #61  <Field int[] numBytesOfEncryptedData>
	//   14   30:putfield        #62  <Field int[] android.media.MediaCodec$CryptoInfo.numBytesOfEncryptedData>
		frameworkCryptoInfo.key = key;
	//   15   33:aload_0         
	//   16   34:getfield        #39  <Field android.media.MediaCodec$CryptoInfo frameworkCryptoInfo>
	//   17   37:aload_0         
	//   18   38:getfield        #64  <Field byte[] key>
	//   19   41:putfield        #65  <Field byte[] android.media.MediaCodec$CryptoInfo.key>
		frameworkCryptoInfo.iv = iv;
	//   20   44:aload_0         
	//   21   45:getfield        #39  <Field android.media.MediaCodec$CryptoInfo frameworkCryptoInfo>
	//   22   48:aload_0         
	//   23   49:getfield        #67  <Field byte[] iv>
	//   24   52:putfield        #68  <Field byte[] android.media.MediaCodec$CryptoInfo.iv>
		frameworkCryptoInfo.mode = mode;
	//   25   55:aload_0         
	//   26   56:getfield        #39  <Field android.media.MediaCodec$CryptoInfo frameworkCryptoInfo>
	//   27   59:aload_0         
	//   28   60:getfield        #70  <Field int mode>
	//   29   63:putfield        #71  <Field int android.media.MediaCodec$CryptoInfo.mode>
		if(Util.SDK_INT >= 24)
	//*  30   66:getstatic       #33  <Field int Util.SDK_INT>
	//*  31   69:bipush          24
	//*  32   71:icmplt          89
			patternHolder.set(encryptedBlocks, clearBlocks);
	//   33   74:aload_0         
	//   34   75:getfield        #44  <Field CryptoInfo$PatternHolderV24 patternHolder>
	//   35   78:aload_0         
	//   36   79:getfield        #73  <Field int encryptedBlocks>
	//   37   82:aload_0         
	//   38   83:getfield        #75  <Field int clearBlocks>
	//   39   86:invokestatic    #79  <Method void CryptoInfo$PatternHolderV24.access$100(CryptoInfo$PatternHolderV24, int, int)>
	//   40   89:return          
	}

	public android.media.MediaCodec.CryptoInfo getFrameworkCryptoInfoV16()
	{
		return frameworkCryptoInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field android.media.MediaCodec$CryptoInfo frameworkCryptoInfo>
	//    2    4:areturn         
	}

	public void set(int i, int ai[], int ai1[], byte abyte0[], byte abyte1[], int j, int k, 
			int l)
	{
		numSubSamples = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #55  <Field int numSubSamples>
		numBytesOfClearData = ai;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #58  <Field int[] numBytesOfClearData>
		numBytesOfEncryptedData = ai1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #61  <Field int[] numBytesOfEncryptedData>
		key = abyte0;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #64  <Field byte[] key>
		iv = abyte1;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #67  <Field byte[] iv>
		mode = j;
	//   15   27:aload_0         
	//   16   28:iload           6
	//   17   30:putfield        #70  <Field int mode>
		encryptedBlocks = k;
	//   18   33:aload_0         
	//   19   34:iload           7
	//   20   36:putfield        #73  <Field int encryptedBlocks>
		clearBlocks = l;
	//   21   39:aload_0         
	//   22   40:iload           8
	//   23   42:putfield        #75  <Field int clearBlocks>
		if(Util.SDK_INT >= 16)
	//*  24   45:getstatic       #33  <Field int Util.SDK_INT>
	//*  25   48:bipush          16
	//*  26   50:icmplt          57
			updateFrameworkCryptoInfoV16();
	//   27   53:aload_0         
	//   28   54:invokespecial   #84  <Method void updateFrameworkCryptoInfoV16()>
	//   29   57:return          
	}

	public int clearBlocks;
	public int encryptedBlocks;
	private final android.media.MediaCodec.CryptoInfo frameworkCryptoInfo;
	public byte iv[];
	public byte key[];
	public int mode;
	public int numBytesOfClearData[];
	public int numBytesOfEncryptedData[];
	public int numSubSamples;
	private final PatternHolderV24 patternHolder;
}
