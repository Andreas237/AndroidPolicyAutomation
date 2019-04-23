// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bnw, bfa

public final class bey
{

	public bey()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		Object obj;
		if(bnw.a >= 16)
	//*   2    4:getstatic       #27  <Field int bnw.a>
	//*   3    7:bipush          16
	//*   4    9:icmplt          23
			obj = ((Object) (new android.media.MediaCodec.CryptoInfo()));
	//    5   12:new             #29  <Class android.media.MediaCodec$CryptoInfo>
	//    6   15:dup             
	//    7   16:invokespecial   #30  <Method void android.media.MediaCodec$CryptoInfo()>
	//    8   19:astore_1        
		else
	//*   9   20:goto            25
			obj = null;
	//   10   23:aconst_null     
	//   11   24:astore_1        
		i = ((android.media.MediaCodec.CryptoInfo) (obj));
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:putfield        #32  <Field android.media.MediaCodec$CryptoInfo i>
		if(bnw.a >= 24)
	//*  15   30:getstatic       #27  <Field int bnw.a>
	//*  16   33:bipush          24
	//*  17   35:icmplt          54
			obj = ((Object) (new bfa(i, ((bez) (null)))));
	//   18   38:new             #34  <Class bfa>
	//   19   41:dup             
	//   20   42:aload_0         
	//   21   43:getfield        #32  <Field android.media.MediaCodec$CryptoInfo i>
	//   22   46:aconst_null     
	//   23   47:invokespecial   #37  <Method void bfa(android.media.MediaCodec$CryptoInfo, bez)>
	//   24   50:astore_1        
		else
	//*  25   51:goto            56
			obj = null;
	//   26   54:aconst_null     
	//   27   55:astore_1        
		j = ((bfa) (obj));
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:putfield        #39  <Field bfa j>
	//   31   61:return          
	}

	public final android.media.MediaCodec.CryptoInfo a()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field android.media.MediaCodec$CryptoInfo i>
	//    2    4:areturn         
	}

	public final void a(int k, int ai[], int ai1[], byte abyte0[], byte abyte1[], int l)
	{
		f = k;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #48  <Field int f>
		b = ai;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #50  <Field int[] b>
		c = ai1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #52  <Field int[] c>
		d = abyte0;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #54  <Field byte[] d>
		a = abyte1;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #56  <Field byte[] a>
		e = l;
	//   15   27:aload_0         
	//   16   28:iload           6
	//   17   30:putfield        #58  <Field int e>
		g = 0;
	//   18   33:aload_0         
	//   19   34:iconst_0        
	//   20   35:putfield        #60  <Field int g>
		h = 0;
	//   21   38:aload_0         
	//   22   39:iconst_0        
	//   23   40:putfield        #62  <Field int h>
		if(bnw.a >= 16)
	//*  24   43:getstatic       #27  <Field int bnw.a>
	//*  25   46:bipush          16
	//*  26   48:icmplt          121
		{
			ai = ((int []) (i));
	//   27   51:aload_0         
	//   28   52:getfield        #32  <Field android.media.MediaCodec$CryptoInfo i>
	//   29   55:astore_2        
			ai.numSubSamples = f;
	//   30   56:aload_2         
	//   31   57:aload_0         
	//   32   58:getfield        #48  <Field int f>
	//   33   61:putfield        #65  <Field int android.media.MediaCodec$CryptoInfo.numSubSamples>
			ai.numBytesOfClearData = b;
	//   34   64:aload_2         
	//   35   65:aload_0         
	//   36   66:getfield        #50  <Field int[] b>
	//   37   69:putfield        #68  <Field int[] android.media.MediaCodec$CryptoInfo.numBytesOfClearData>
			ai.numBytesOfEncryptedData = c;
	//   38   72:aload_2         
	//   39   73:aload_0         
	//   40   74:getfield        #52  <Field int[] c>
	//   41   77:putfield        #71  <Field int[] android.media.MediaCodec$CryptoInfo.numBytesOfEncryptedData>
			ai.key = d;
	//   42   80:aload_2         
	//   43   81:aload_0         
	//   44   82:getfield        #54  <Field byte[] d>
	//   45   85:putfield        #74  <Field byte[] android.media.MediaCodec$CryptoInfo.key>
			ai.iv = a;
	//   46   88:aload_2         
	//   47   89:aload_0         
	//   48   90:getfield        #56  <Field byte[] a>
	//   49   93:putfield        #77  <Field byte[] android.media.MediaCodec$CryptoInfo.iv>
			ai.mode = e;
	//   50   96:aload_2         
	//   51   97:aload_0         
	//   52   98:getfield        #58  <Field int e>
	//   53  101:putfield        #80  <Field int android.media.MediaCodec$CryptoInfo.mode>
			if(bnw.a >= 24)
	//*  54  104:getstatic       #27  <Field int bnw.a>
	//*  55  107:bipush          24
	//*  56  109:icmplt          121
				bfa.a(j, 0, 0);
	//   57  112:aload_0         
	//   58  113:getfield        #39  <Field bfa j>
	//   59  116:iconst_0        
	//   60  117:iconst_0        
	//   61  118:invokestatic    #83  <Method void bfa.a(bfa, int, int)>
		}
	//   62  121:return          
	}

	public byte a[];
	public int b[];
	public int c[];
	private byte d[];
	private int e;
	private int f;
	private int g;
	private int h;
	private final android.media.MediaCodec.CryptoInfo i;
	private final bfa j;
}
