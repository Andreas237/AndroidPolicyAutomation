// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.PlatformServiceClient;

final class GetTokenClient extends PlatformServiceClient
{

	GetTokenClient(Context context, String s)
	{
		super(context, 0x10000, 0x10001, 0x133060d, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #7   <Int 0x10000>
	//    3    4:ldc1            #8   <Int 0x10001>
	//    4    6:ldc1            #9   <Int 0x133060d>
	//    5    8:aload_2         
	//    6    9:invokespecial   #12  <Method void PlatformServiceClient(Context, int, int, int, String)>
	//    7   12:return          
	}

	protected void populateRequestBundle(Bundle bundle)
	{
	//    0    0:return          
	}
}
