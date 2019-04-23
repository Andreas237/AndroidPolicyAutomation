// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.media;

import android.support.v4.media.AudioAttributesImplBase;
import androidx.versionedparcelable.VersionedParcel;

public final class AudioAttributesImplBaseParcelizer
{

	public AudioAttributesImplBaseParcelizer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static AudioAttributesImplBase read(VersionedParcel versionedparcel)
	{
		AudioAttributesImplBase audioattributesimplbase = new AudioAttributesImplBase();
	//    0    0:new             #17  <Class AudioAttributesImplBase>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void AudioAttributesImplBase()>
	//    3    7:astore_1        
		audioattributesimplbase.mUsage = versionedparcel.readInt(audioattributesimplbase.mUsage, 1);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #22  <Field int AudioAttributesImplBase.mUsage>
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #28  <Method int VersionedParcel.readInt(int, int)>
	//   10   18:putfield        #22  <Field int AudioAttributesImplBase.mUsage>
		audioattributesimplbase.mContentType = versionedparcel.readInt(audioattributesimplbase.mContentType, 2);
	//   11   21:aload_1         
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:getfield        #31  <Field int AudioAttributesImplBase.mContentType>
	//   15   27:iconst_2        
	//   16   28:invokevirtual   #28  <Method int VersionedParcel.readInt(int, int)>
	//   17   31:putfield        #31  <Field int AudioAttributesImplBase.mContentType>
		audioattributesimplbase.mFlags = versionedparcel.readInt(audioattributesimplbase.mFlags, 3);
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:getfield        #34  <Field int AudioAttributesImplBase.mFlags>
	//   22   40:iconst_3        
	//   23   41:invokevirtual   #28  <Method int VersionedParcel.readInt(int, int)>
	//   24   44:putfield        #34  <Field int AudioAttributesImplBase.mFlags>
		audioattributesimplbase.mLegacyStream = versionedparcel.readInt(audioattributesimplbase.mLegacyStream, 4);
	//   25   47:aload_1         
	//   26   48:aload_0         
	//   27   49:aload_1         
	//   28   50:getfield        #37  <Field int AudioAttributesImplBase.mLegacyStream>
	//   29   53:iconst_4        
	//   30   54:invokevirtual   #28  <Method int VersionedParcel.readInt(int, int)>
	//   31   57:putfield        #37  <Field int AudioAttributesImplBase.mLegacyStream>
		return audioattributesimplbase;
	//   32   60:aload_1         
	//   33   61:areturn         
	}

	public static void write(AudioAttributesImplBase audioattributesimplbase, VersionedParcel versionedparcel)
	{
		versionedparcel.setSerializationFlags(false, false);
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #43  <Method void VersionedParcel.setSerializationFlags(boolean, boolean)>
		versionedparcel.writeInt(audioattributesimplbase.mUsage, 1);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #22  <Field int AudioAttributesImplBase.mUsage>
	//    7   11:iconst_1        
	//    8   12:invokevirtual   #47  <Method void VersionedParcel.writeInt(int, int)>
		versionedparcel.writeInt(audioattributesimplbase.mContentType, 2);
	//    9   15:aload_1         
	//   10   16:aload_0         
	//   11   17:getfield        #31  <Field int AudioAttributesImplBase.mContentType>
	//   12   20:iconst_2        
	//   13   21:invokevirtual   #47  <Method void VersionedParcel.writeInt(int, int)>
		versionedparcel.writeInt(audioattributesimplbase.mFlags, 3);
	//   14   24:aload_1         
	//   15   25:aload_0         
	//   16   26:getfield        #34  <Field int AudioAttributesImplBase.mFlags>
	//   17   29:iconst_3        
	//   18   30:invokevirtual   #47  <Method void VersionedParcel.writeInt(int, int)>
		versionedparcel.writeInt(audioattributesimplbase.mLegacyStream, 4);
	//   19   33:aload_1         
	//   20   34:aload_0         
	//   21   35:getfield        #37  <Field int AudioAttributesImplBase.mLegacyStream>
	//   22   38:iconst_4        
	//   23   39:invokevirtual   #47  <Method void VersionedParcel.writeInt(int, int)>
	//   24   42:return          
	}
}
