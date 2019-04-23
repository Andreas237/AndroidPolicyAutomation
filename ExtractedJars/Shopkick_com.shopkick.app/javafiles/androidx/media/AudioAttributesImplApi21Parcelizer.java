// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.media;

import android.media.AudioAttributes;
import android.support.v4.media.AudioAttributesImplApi21;
import androidx.versionedparcelable.VersionedParcel;

public final class AudioAttributesImplApi21Parcelizer
{

	public AudioAttributesImplApi21Parcelizer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static AudioAttributesImplApi21 read(VersionedParcel versionedparcel)
	{
		AudioAttributesImplApi21 audioattributesimplapi21 = new AudioAttributesImplApi21();
	//    0    0:new             #17  <Class AudioAttributesImplApi21>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void AudioAttributesImplApi21()>
	//    3    7:astore_1        
		audioattributesimplapi21.mAudioAttributes = (AudioAttributes)versionedparcel.readParcelable(((android.os.Parcelable) (audioattributesimplapi21.mAudioAttributes)), 1);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #22  <Field AudioAttributes AudioAttributesImplApi21.mAudioAttributes>
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #28  <Method android.os.Parcelable VersionedParcel.readParcelable(android.os.Parcelable, int)>
	//   10   18:checkcast       #30  <Class AudioAttributes>
	//   11   21:putfield        #22  <Field AudioAttributes AudioAttributesImplApi21.mAudioAttributes>
		audioattributesimplapi21.mLegacyStreamType = versionedparcel.readInt(audioattributesimplapi21.mLegacyStreamType, 2);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:getfield        #34  <Field int AudioAttributesImplApi21.mLegacyStreamType>
	//   16   30:iconst_2        
	//   17   31:invokevirtual   #38  <Method int VersionedParcel.readInt(int, int)>
	//   18   34:putfield        #34  <Field int AudioAttributesImplApi21.mLegacyStreamType>
		return audioattributesimplapi21;
	//   19   37:aload_1         
	//   20   38:areturn         
	}

	public static void write(AudioAttributesImplApi21 audioattributesimplapi21, VersionedParcel versionedparcel)
	{
		versionedparcel.setSerializationFlags(false, false);
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #44  <Method void VersionedParcel.setSerializationFlags(boolean, boolean)>
		versionedparcel.writeParcelable(((android.os.Parcelable) (audioattributesimplapi21.mAudioAttributes)), 1);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #22  <Field AudioAttributes AudioAttributesImplApi21.mAudioAttributes>
	//    7   11:iconst_1        
	//    8   12:invokevirtual   #48  <Method void VersionedParcel.writeParcelable(android.os.Parcelable, int)>
		versionedparcel.writeInt(audioattributesimplapi21.mLegacyStreamType, 2);
	//    9   15:aload_1         
	//   10   16:aload_0         
	//   11   17:getfield        #34  <Field int AudioAttributesImplApi21.mLegacyStreamType>
	//   12   20:iconst_2        
	//   13   21:invokevirtual   #52  <Method void VersionedParcel.writeInt(int, int)>
	//   14   24:return          
	}
}
