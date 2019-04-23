// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.media;

import android.support.v4.media.AudioAttributesCompat;
import android.support.v4.media.AudioAttributesImpl;
import androidx.versionedparcelable.VersionedParcel;

public final class AudioAttributesCompatParcelizer
{

	public AudioAttributesCompatParcelizer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static AudioAttributesCompat read(VersionedParcel versionedparcel)
	{
		AudioAttributesCompat audioattributescompat = new AudioAttributesCompat();
	//    0    0:new             #17  <Class AudioAttributesCompat>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void AudioAttributesCompat()>
	//    3    7:astore_1        
		audioattributescompat.mImpl = (AudioAttributesImpl)versionedparcel.readVersionedParcelable(((androidx.versionedparcelable.VersionedParcelable) (audioattributescompat.mImpl)), 1);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #22  <Field AudioAttributesImpl AudioAttributesCompat.mImpl>
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #28  <Method androidx.versionedparcelable.VersionedParcelable VersionedParcel.readVersionedParcelable(androidx.versionedparcelable.VersionedParcelable, int)>
	//   10   18:checkcast       #30  <Class AudioAttributesImpl>
	//   11   21:putfield        #22  <Field AudioAttributesImpl AudioAttributesCompat.mImpl>
		return audioattributescompat;
	//   12   24:aload_1         
	//   13   25:areturn         
	}

	public static void write(AudioAttributesCompat audioattributescompat, VersionedParcel versionedparcel)
	{
		versionedparcel.setSerializationFlags(false, false);
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #36  <Method void VersionedParcel.setSerializationFlags(boolean, boolean)>
		versionedparcel.writeVersionedParcelable(((androidx.versionedparcelable.VersionedParcelable) (audioattributescompat.mImpl)), 1);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #22  <Field AudioAttributesImpl AudioAttributesCompat.mImpl>
	//    7   11:iconst_1        
	//    8   12:invokevirtual   #40  <Method void VersionedParcel.writeVersionedParcelable(androidx.versionedparcelable.VersionedParcelable, int)>
	//    9   15:return          
	}
}
