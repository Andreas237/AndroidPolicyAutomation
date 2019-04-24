// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.drm;

import android.media.MediaCrypto;
import com.google.android.exoplayer2.util.Assertions;

// Referenced classes of package com.google.android.exoplayer2.drm:
//			ExoMediaCrypto

public final class FrameworkMediaCrypto
	implements ExoMediaCrypto
{

	public FrameworkMediaCrypto(MediaCrypto mediacrypto)
	{
		this(mediacrypto, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #18  <Method void FrameworkMediaCrypto(MediaCrypto, boolean)>
	//    4    6:return          
	}

	public FrameworkMediaCrypto(MediaCrypto mediacrypto, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		mediaCrypto = (MediaCrypto)Assertions.checkNotNull(((Object) (mediacrypto)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #28  <Method Object Assertions.checkNotNull(Object)>
	//    5    9:checkcast       #30  <Class MediaCrypto>
	//    6   12:putfield        #32  <Field MediaCrypto mediaCrypto>
		forceAllowInsecureDecoderComponents = flag;
	//    7   15:aload_0         
	//    8   16:iload_2         
	//    9   17:putfield        #34  <Field boolean forceAllowInsecureDecoderComponents>
	//   10   20:return          
	}

	public MediaCrypto getWrappedMediaCrypto()
	{
		return mediaCrypto;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field MediaCrypto mediaCrypto>
	//    2    4:areturn         
	}

	public boolean requiresSecureDecoderComponent(String s)
	{
		return !forceAllowInsecureDecoderComponents && mediaCrypto.requiresSecureDecoderComponent(s);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field boolean forceAllowInsecureDecoderComponents>
	//    2    4:ifne            20
	//    3    7:aload_0         
	//    4    8:getfield        #32  <Field MediaCrypto mediaCrypto>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #40  <Method boolean MediaCrypto.requiresSecureDecoderComponent(String)>
	//    7   15:ifeq            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	private final boolean forceAllowInsecureDecoderComponents;
	private final MediaCrypto mediaCrypto;
}
