// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.net.Uri;

public final class ResourceUtils
{

	private ResourceUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
	//    2    4:return          
	}

	private static final Uri zzet = (new android.net.Uri.Builder()).scheme("android.resource").authority("com.google.android.gms").appendPath("drawable").build();

	static 
	{
	//    0    0:new             #11  <Class android.net.Uri$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void android.net.Uri$Builder()>
	//    3    7:ldc1            #16  <String "android.resource">
	//    4    9:invokevirtual   #20  <Method android.net.Uri$Builder android.net.Uri$Builder.scheme(String)>
	//    5   12:ldc1            #22  <String "com.google.android.gms">
	//    6   14:invokevirtual   #25  <Method android.net.Uri$Builder android.net.Uri$Builder.authority(String)>
	//    7   17:ldc1            #27  <String "drawable">
	//    8   19:invokevirtual   #30  <Method android.net.Uri$Builder android.net.Uri$Builder.appendPath(String)>
	//    9   22:invokevirtual   #34  <Method Uri android.net.Uri$Builder.build()>
	//   10   25:putstatic       #36  <Field Uri zzet>
	//*  11   28:return          
	}
}
