// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;

import android.media.MediaExtractor;
import com.google.android.exoplayer.util.Util;

public final class CryptoInfo
{

	public CryptoInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		android.media.MediaCodec.CryptoInfo cryptoinfo;
		if(Util.SDK_INT >= 16)
	//*   2    4:getstatic       #24  <Field int Util.SDK_INT>
	//*   3    7:bipush          16
	//*   4    9:icmplt          20
			cryptoinfo = newFrameworkCryptoInfoV16();
	//    5   12:aload_0         
	//    6   13:invokespecial   #28  <Method android.media.MediaCodec$CryptoInfo newFrameworkCryptoInfoV16()>
	//    7   16:astore_1        
		else
	//*   8   17:goto            22
			cryptoinfo = null;
	//    9   20:aconst_null     
	//   10   21:astore_1        
		frameworkCryptoInfo = cryptoinfo;
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:putfield        #30  <Field android.media.MediaCodec$CryptoInfo frameworkCryptoInfo>
	//   14   27:return          
	}

	private android.media.MediaCodec.CryptoInfo newFrameworkCryptoInfoV16()
	{
		return new android.media.MediaCodec.CryptoInfo();
	//    0    0:new             #36  <Class android.media.MediaCodec$CryptoInfo>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void android.media.MediaCodec$CryptoInfo()>
	//    3    7:areturn         
	}

	private void updateFrameworkCryptoInfoV16()
	{
		frameworkCryptoInfo.set(numSubSamples, numBytesOfClearData, numBytesOfEncryptedData, key, iv, mode);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field android.media.MediaCodec$CryptoInfo frameworkCryptoInfo>
	//    2    4:aload_0         
	//    3    5:getfield        #41  <Field int numSubSamples>
	//    4    8:aload_0         
	//    5    9:getfield        #43  <Field int[] numBytesOfClearData>
	//    6   12:aload_0         
	//    7   13:getfield        #45  <Field int[] numBytesOfEncryptedData>
	//    8   16:aload_0         
	//    9   17:getfield        #47  <Field byte[] key>
	//   10   20:aload_0         
	//   11   21:getfield        #49  <Field byte[] iv>
	//   12   24:aload_0         
	//   13   25:getfield        #51  <Field int mode>
	//   14   28:invokevirtual   #55  <Method void android.media.MediaCodec$CryptoInfo.set(int, int[], int[], byte[], byte[], int)>
	//   15   31:return          
	}

	public android.media.MediaCodec.CryptoInfo getFrameworkCryptoInfoV16()
	{
		return frameworkCryptoInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field android.media.MediaCodec$CryptoInfo frameworkCryptoInfo>
	//    2    4:areturn         
	}

	public void set(int i, int ai[], int ai1[], byte abyte0[], byte abyte1[], int j)
	{
		numSubSamples = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #41  <Field int numSubSamples>
		numBytesOfClearData = ai;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #43  <Field int[] numBytesOfClearData>
		numBytesOfEncryptedData = ai1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #45  <Field int[] numBytesOfEncryptedData>
		key = abyte0;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #47  <Field byte[] key>
		iv = abyte1;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #49  <Field byte[] iv>
		mode = j;
	//   15   27:aload_0         
	//   16   28:iload           6
	//   17   30:putfield        #51  <Field int mode>
		if(Util.SDK_INT >= 16)
	//*  18   33:getstatic       #24  <Field int Util.SDK_INT>
	//*  19   36:bipush          16
	//*  20   38:icmplt          45
			updateFrameworkCryptoInfoV16();
	//   21   41:aload_0         
	//   22   42:invokespecial   #58  <Method void updateFrameworkCryptoInfoV16()>
	//   23   45:return          
	}

	public void setFromExtractorV16(MediaExtractor mediaextractor)
	{
		mediaextractor.getSampleCryptoInfo(frameworkCryptoInfo);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #30  <Field android.media.MediaCodec$CryptoInfo frameworkCryptoInfo>
	//    3    5:invokevirtual   #66  <Method boolean MediaExtractor.getSampleCryptoInfo(android.media.MediaCodec$CryptoInfo)>
	//    4    8:pop             
		numSubSamples = frameworkCryptoInfo.numSubSamples;
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #30  <Field android.media.MediaCodec$CryptoInfo frameworkCryptoInfo>
	//    8   14:getfield        #67  <Field int android.media.MediaCodec$CryptoInfo.numSubSamples>
	//    9   17:putfield        #41  <Field int numSubSamples>
		numBytesOfClearData = frameworkCryptoInfo.numBytesOfClearData;
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:getfield        #30  <Field android.media.MediaCodec$CryptoInfo frameworkCryptoInfo>
	//   13   25:getfield        #68  <Field int[] android.media.MediaCodec$CryptoInfo.numBytesOfClearData>
	//   14   28:putfield        #43  <Field int[] numBytesOfClearData>
		numBytesOfEncryptedData = frameworkCryptoInfo.numBytesOfEncryptedData;
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:getfield        #30  <Field android.media.MediaCodec$CryptoInfo frameworkCryptoInfo>
	//   18   36:getfield        #69  <Field int[] android.media.MediaCodec$CryptoInfo.numBytesOfEncryptedData>
	//   19   39:putfield        #45  <Field int[] numBytesOfEncryptedData>
		key = frameworkCryptoInfo.key;
	//   20   42:aload_0         
	//   21   43:aload_0         
	//   22   44:getfield        #30  <Field android.media.MediaCodec$CryptoInfo frameworkCryptoInfo>
	//   23   47:getfield        #70  <Field byte[] android.media.MediaCodec$CryptoInfo.key>
	//   24   50:putfield        #47  <Field byte[] key>
		iv = frameworkCryptoInfo.iv;
	//   25   53:aload_0         
	//   26   54:aload_0         
	//   27   55:getfield        #30  <Field android.media.MediaCodec$CryptoInfo frameworkCryptoInfo>
	//   28   58:getfield        #71  <Field byte[] android.media.MediaCodec$CryptoInfo.iv>
	//   29   61:putfield        #49  <Field byte[] iv>
		mode = frameworkCryptoInfo.mode;
	//   30   64:aload_0         
	//   31   65:aload_0         
	//   32   66:getfield        #30  <Field android.media.MediaCodec$CryptoInfo frameworkCryptoInfo>
	//   33   69:getfield        #72  <Field int android.media.MediaCodec$CryptoInfo.mode>
	//   34   72:putfield        #51  <Field int mode>
	//   35   75:return          
	}

	private final android.media.MediaCodec.CryptoInfo frameworkCryptoInfo;
	public byte iv[];
	public byte key[];
	public int mode;
	public int numBytesOfClearData[];
	public int numBytesOfEncryptedData[];
	public int numSubSamples;
}
