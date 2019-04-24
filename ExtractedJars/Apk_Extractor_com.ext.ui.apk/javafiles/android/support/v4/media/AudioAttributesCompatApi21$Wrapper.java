// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.media.AudioAttributes;

// Referenced classes of package android.support.v4.media:
//			AudioAttributesCompatApi21

static final class AudioAttributesCompatApi21$Wrapper
{

	public static AudioAttributesCompatApi21$Wrapper wrap(AudioAttributes audioattributes)
	{
		if(audioattributes == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("AudioAttributesApi21.Wrapper cannot wrap null");
	//    2    4:new             #22  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #24  <String "AudioAttributesApi21.Wrapper cannot wrap null">
	//    5   10:invokespecial   #27  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		else
			return new AudioAttributesCompatApi21$Wrapper(audioattributes);
	//    7   14:new             #2   <Class AudioAttributesCompatApi21$Wrapper>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:invokespecial   #29  <Method void AudioAttributesCompatApi21$Wrapper(AudioAttributes)>
	//   11   22:areturn         
	}

	public AudioAttributes unwrap()
	{
		return mWrapped;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field AudioAttributes mWrapped>
	//    2    4:areturn         
	}

	private AudioAttributes mWrapped;

	private AudioAttributesCompatApi21$Wrapper(AudioAttributes audioattributes)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		mWrapped = audioattributes;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field AudioAttributes mWrapped>
	//    5    9:return          
	}
}
