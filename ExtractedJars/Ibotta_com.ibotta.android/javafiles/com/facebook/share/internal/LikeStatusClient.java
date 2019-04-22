// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.PlatformServiceClient;

final class LikeStatusClient extends PlatformServiceClient
{

	LikeStatusClient(Context context, String s, String s1)
	{
		super(context, 0x10006, 0x10007, 0x13353c9, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <Int 0x10006>
	//    3    4:ldc1            #11  <Int 0x10007>
	//    4    6:ldc1            #12  <Int 0x13353c9>
	//    5    8:aload_2         
	//    6    9:invokespecial   #15  <Method void PlatformServiceClient(Context, int, int, int, String)>
		objectId = s1;
	//    7   12:aload_0         
	//    8   13:aload_3         
	//    9   14:putfield        #17  <Field String objectId>
	//   10   17:return          
	}

	protected void populateRequestBundle(Bundle bundle)
	{
		bundle.putString("com.facebook.platform.extra.OBJECT_ID", objectId);
	//    0    0:aload_1         
	//    1    1:ldc1            #22  <String "com.facebook.platform.extra.OBJECT_ID">
	//    2    3:aload_0         
	//    3    4:getfield        #17  <Field String objectId>
	//    4    7:invokevirtual   #28  <Method void Bundle.putString(String, String)>
	//    5   10:return          
	}

	private String objectId;
}
