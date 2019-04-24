// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.net.Uri;

// Referenced classes of package com.google.android.gms.common.internal:
//			Preconditions

public final class ResourceUtils
{
	public static interface SignInResources
	{

		public static final String BUTTON_DARK_TEXT_DEFAULT = "common_google_signin_btn_text_dark_normal";
	}


	private ResourceUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
	//    2    4:return          
	}

	public static Uri getDrawableUri(String s)
	{
		Preconditions.checkNotNull(((Object) (s)), "Resource name must not be null.");
	//    0    0:aload_0         
	//    1    1:ldc1            #44  <String "Resource name must not be null.">
	//    2    3:invokestatic    #50  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		return zzuw.buildUpon().appendPath(s).build();
	//    4    7:getstatic       #38  <Field Uri zzuw>
	//    5   10:invokevirtual   #56  <Method android.net.Uri$Builder Uri.buildUpon()>
	//    6   13:aload_0         
	//    7   14:invokevirtual   #32  <Method android.net.Uri$Builder android.net.Uri$Builder.appendPath(String)>
	//    8   17:invokevirtual   #36  <Method Uri android.net.Uri$Builder.build()>
	//    9   20:areturn         
	}

	private static final Uri zzuw = (new android.net.Uri.Builder()).scheme("android.resource").authority("com.google.android.gms").appendPath("drawable").build();

	static 
	{
	//    0    0:new             #13  <Class android.net.Uri$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void android.net.Uri$Builder()>
	//    3    7:ldc1            #18  <String "android.resource">
	//    4    9:invokevirtual   #22  <Method android.net.Uri$Builder android.net.Uri$Builder.scheme(String)>
	//    5   12:ldc1            #24  <String "com.google.android.gms">
	//    6   14:invokevirtual   #27  <Method android.net.Uri$Builder android.net.Uri$Builder.authority(String)>
	//    7   17:ldc1            #29  <String "drawable">
	//    8   19:invokevirtual   #32  <Method android.net.Uri$Builder android.net.Uri$Builder.appendPath(String)>
	//    9   22:invokevirtual   #36  <Method Uri android.net.Uri$Builder.build()>
	//   10   25:putstatic       #38  <Field Uri zzuw>
	//*  11   28:return          
	}
}
