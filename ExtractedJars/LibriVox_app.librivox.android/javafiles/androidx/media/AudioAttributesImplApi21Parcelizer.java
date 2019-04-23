// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.media;

import android.media.AudioAttributes;
import android.support.v4.media.b;

public final class AudioAttributesImplApi21Parcelizer
{

	public AudioAttributesImplApi21Parcelizer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static b read(androidx.versionedparcelable.b b1)
	{
		b b2 = new b();
	//    0    0:new             #13  <Class b>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void b()>
	//    3    7:astore_1        
		b2.mAudioAttributes = (AudioAttributes)b1.b(((android.os.Parcelable) (b2.mAudioAttributes)), 1);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #18  <Field AudioAttributes b.mAudioAttributes>
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #24  <Method android.os.Parcelable androidx.versionedparcelable.b.b(android.os.Parcelable, int)>
	//   10   18:checkcast       #26  <Class AudioAttributes>
	//   11   21:putfield        #18  <Field AudioAttributes b.mAudioAttributes>
		b2.mLegacyStreamType = b1.b(b2.mLegacyStreamType, 2);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:getfield        #30  <Field int b.mLegacyStreamType>
	//   16   30:iconst_2        
	//   17   31:invokevirtual   #33  <Method int androidx.versionedparcelable.b.b(int, int)>
	//   18   34:putfield        #30  <Field int b.mLegacyStreamType>
		return b2;
	//   19   37:aload_1         
	//   20   38:areturn         
	}

	public static void write(b b1, androidx.versionedparcelable.b b2)
	{
		b2.a(false, false);
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #39  <Method void androidx.versionedparcelable.b.a(boolean, boolean)>
		b2.a(((android.os.Parcelable) (b1.mAudioAttributes)), 1);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #18  <Field AudioAttributes b.mAudioAttributes>
	//    7   11:iconst_1        
	//    8   12:invokevirtual   #42  <Method void androidx.versionedparcelable.b.a(android.os.Parcelable, int)>
		b2.a(b1.mLegacyStreamType, 2);
	//    9   15:aload_1         
	//   10   16:aload_0         
	//   11   17:getfield        #30  <Field int b.mLegacyStreamType>
	//   12   20:iconst_2        
	//   13   21:invokevirtual   #45  <Method void androidx.versionedparcelable.b.a(int, int)>
	//   14   24:return          
	}
}
