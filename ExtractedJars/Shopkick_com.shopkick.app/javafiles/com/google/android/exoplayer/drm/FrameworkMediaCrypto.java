// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.drm;

import android.media.MediaCrypto;
import com.google.android.exoplayer.util.Assertions;

// Referenced classes of package com.google.android.exoplayer.drm:
//			ExoMediaCrypto

public final class FrameworkMediaCrypto
	implements ExoMediaCrypto
{

	FrameworkMediaCrypto(MediaCrypto mediacrypto)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		mediaCrypto = (MediaCrypto)Assertions.checkNotNull(((Object) (mediacrypto)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #22  <Method Object Assertions.checkNotNull(Object)>
	//    5    9:checkcast       #24  <Class MediaCrypto>
	//    6   12:putfield        #26  <Field MediaCrypto mediaCrypto>
	//    7   15:return          
	}

	public MediaCrypto getWrappedMediaCrypto()
	{
		return mediaCrypto;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field MediaCrypto mediaCrypto>
	//    2    4:areturn         
	}

	public boolean requiresSecureDecoderComponent(String s)
	{
		return mediaCrypto.requiresSecureDecoderComponent(s);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field MediaCrypto mediaCrypto>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #33  <Method boolean MediaCrypto.requiresSecureDecoderComponent(String)>
	//    4    8:ireturn         
	}

	private final MediaCrypto mediaCrypto;
}
