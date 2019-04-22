// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics.drawable;

import androidx.versionedparcelable.VersionedParcel;

// Referenced classes of package android.support.v4.graphics.drawable:
//			IconCompat

public final class IconCompatParcelizer extends androidx.core.graphics.drawable.IconCompatParcelizer
{

	public IconCompatParcelizer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void androidx.core.graphics.drawable.IconCompatParcelizer()>
	//    2    4:return          
	}

	public static IconCompat read(VersionedParcel versionedparcel)
	{
		return androidx.core.graphics.drawable.IconCompatParcelizer.read(versionedparcel);
	//    0    0:aload_0         
	//    1    1:invokestatic    #17  <Method IconCompat androidx.core.graphics.drawable.IconCompatParcelizer.read(VersionedParcel)>
	//    2    4:areturn         
	}

	public static void write(IconCompat iconcompat, VersionedParcel versionedparcel)
	{
		androidx.core.graphics.drawable.IconCompatParcelizer.write(iconcompat, versionedparcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #21  <Method void androidx.core.graphics.drawable.IconCompatParcelizer.write(IconCompat, VersionedParcel)>
	//    3    5:return          
	}
}
