// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics.drawable;

import androidx.versionedparcelable.b;

// Referenced classes of package android.support.v4.graphics.drawable:
//			IconCompat

public final class IconCompatParcelizer extends androidx.core.graphics.drawable.IconCompatParcelizer
{

	public IconCompatParcelizer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void androidx.core.graphics.drawable.IconCompatParcelizer()>
	//    2    4:return          
	}

	public static IconCompat read(b b)
	{
		return androidx.core.graphics.drawable.IconCompatParcelizer.read(b);
	//    0    0:aload_0         
	//    1    1:invokestatic    #13  <Method IconCompat androidx.core.graphics.drawable.IconCompatParcelizer.read(b)>
	//    2    4:areturn         
	}

	public static void write(IconCompat iconcompat, b b)
	{
		androidx.core.graphics.drawable.IconCompatParcelizer.write(iconcompat, b);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #17  <Method void androidx.core.graphics.drawable.IconCompatParcelizer.write(IconCompat, b)>
	//    3    5:return          
	}
}
