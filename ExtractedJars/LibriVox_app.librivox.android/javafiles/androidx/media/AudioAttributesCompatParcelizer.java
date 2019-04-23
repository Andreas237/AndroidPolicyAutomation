// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.media;

import android.support.v4.media.AudioAttributesCompat;
import android.support.v4.media.a;
import androidx.versionedparcelable.b;

public final class AudioAttributesCompatParcelizer
{

	public AudioAttributesCompatParcelizer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static AudioAttributesCompat read(b b1)
	{
		AudioAttributesCompat audioattributescompat = new AudioAttributesCompat();
	//    0    0:new             #13  <Class AudioAttributesCompat>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void AudioAttributesCompat()>
	//    3    7:astore_1        
		audioattributescompat.mImpl = ((android.support.v4.media.AudioAttributesImpl) ((a)b1.b(((androidx.versionedparcelable.d) (audioattributescompat.mImpl)), 1)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #18  <Field android.support.v4.media.AudioAttributesImpl AudioAttributesCompat.mImpl>
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #24  <Method androidx.versionedparcelable.d b.b(androidx.versionedparcelable.d, int)>
	//   10   18:checkcast       #26  <Class a>
	//   11   21:putfield        #18  <Field android.support.v4.media.AudioAttributesImpl AudioAttributesCompat.mImpl>
		return audioattributescompat;
	//   12   24:aload_1         
	//   13   25:areturn         
	}

	public static void write(AudioAttributesCompat audioattributescompat, b b1)
	{
		b1.a(false, false);
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #32  <Method void b.a(boolean, boolean)>
		b1.a(((androidx.versionedparcelable.d) (audioattributescompat.mImpl)), 1);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #18  <Field android.support.v4.media.AudioAttributesImpl AudioAttributesCompat.mImpl>
	//    7   11:iconst_1        
	//    8   12:invokevirtual   #35  <Method void b.a(androidx.versionedparcelable.d, int)>
	//    9   15:return          
	}
}
