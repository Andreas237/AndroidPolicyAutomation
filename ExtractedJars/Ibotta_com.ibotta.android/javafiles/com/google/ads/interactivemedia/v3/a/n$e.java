// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.a;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

// Referenced classes of package com.google.ads.interactivemedia.v3.a:
//			n

private static final class n$e
	implements n$c
{

	private void c()
	{
		if(b == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field MediaCodecInfo[] b>
	//*   2    4:ifnonnull       25
			b = (new MediaCodecList(a)).getCodecInfos();
	//    3    7:aload_0         
	//    4    8:new             #34  <Class MediaCodecList>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #36  <Field int a>
	//    8   16:invokespecial   #39  <Method void MediaCodecList(int)>
	//    9   19:invokevirtual   #43  <Method MediaCodecInfo[] MediaCodecList.getCodecInfos()>
	//   10   22:putfield        #32  <Field MediaCodecInfo[] b>
	//   11   25:return          
	}

	public int a()
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void c()>
		return b.length;
	//    2    4:aload_0         
	//    3    5:getfield        #32  <Field MediaCodecInfo[] b>
	//    4    8:arraylength     
	//    5    9:ireturn         
	}

	public MediaCodecInfo a(int i)
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void c()>
		return b[i];
	//    2    4:aload_0         
	//    3    5:getfield        #32  <Field MediaCodecInfo[] b>
	//    4    8:iload_1         
	//    5    9:aaload          
	//    6   10:areturn         
	}

	public boolean a(String s, android.media.aCodecInfo.CodecCapabilities codeccapabilities)
	{
		return codeccapabilities.isFeatureSupported("secure-playback");
	//    0    0:aload_2         
	//    1    1:ldc1            #50  <String "secure-playback">
	//    2    3:invokevirtual   #56  <Method boolean android.media.MediaCodecInfo$CodecCapabilities.isFeatureSupported(String)>
	//    3    6:ireturn         
	}

	public boolean b()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private final int a;
	private MediaCodecInfo b[];

	public n$e(boolean flag)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #20  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #27  <Method void Runtime(String)>
	//    4    9:athrow          
	}
}
