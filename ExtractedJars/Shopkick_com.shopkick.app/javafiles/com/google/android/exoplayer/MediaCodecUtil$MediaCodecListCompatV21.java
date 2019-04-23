// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

// Referenced classes of package com.google.android.exoplayer:
//			MediaCodecUtil

private static final class MediaCodecUtil$MediaCodecListCompatV21
	implements MediaCodecUtil.MediaCodecListCompat
{

	private void ensureMediaCodecInfosInitialized()
	{
		if(mediaCodecInfos == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field MediaCodecInfo[] mediaCodecInfos>
	//*   2    4:ifnonnull       25
			mediaCodecInfos = (new MediaCodecList(codecKind)).getCodecInfos();
	//    3    7:aload_0         
	//    4    8:new             #34  <Class MediaCodecList>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #36  <Field int codecKind>
	//    8   16:invokespecial   #39  <Method void MediaCodecList(int)>
	//    9   19:invokevirtual   #43  <Method MediaCodecInfo[] MediaCodecList.getCodecInfos()>
	//   10   22:putfield        #32  <Field MediaCodecInfo[] mediaCodecInfos>
	//   11   25:return          
	}

	public int getCodecCount()
	{
		ensureMediaCodecInfosInitialized();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void ensureMediaCodecInfosInitialized()>
		return mediaCodecInfos.length;
	//    2    4:aload_0         
	//    3    5:getfield        #32  <Field MediaCodecInfo[] mediaCodecInfos>
	//    4    8:arraylength     
	//    5    9:ireturn         
	}

	public MediaCodecInfo getCodecInfoAt(int i)
	{
		ensureMediaCodecInfosInitialized();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void ensureMediaCodecInfosInitialized()>
		return mediaCodecInfos[i];
	//    2    4:aload_0         
	//    3    5:getfield        #32  <Field MediaCodecInfo[] mediaCodecInfos>
	//    4    8:iload_1         
	//    5    9:aaload          
	//    6   10:areturn         
	}

	public boolean isSecurePlaybackSupported(String s, android.media.MediaCodecInfo.CodecCapabilities codeccapabilities)
	{
		return codeccapabilities.isFeatureSupported("secure-playback");
	//    0    0:aload_2         
	//    1    1:ldc1            #53  <String "secure-playback">
	//    2    3:invokevirtual   #59  <Method boolean android.media.MediaCodecInfo$CodecCapabilities.isFeatureSupported(String)>
	//    3    6:ireturn         
	}

	public boolean secureDecodersExplicit()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private final int codecKind;
	private MediaCodecInfo mediaCodecInfos[];

	public MediaCodecUtil$MediaCodecListCompatV21(boolean flag)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #20  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #27  <Method void Runtime(String)>
	//    4    9:athrow          
	}
}
