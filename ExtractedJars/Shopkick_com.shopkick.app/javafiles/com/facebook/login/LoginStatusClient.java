// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.PlatformServiceClient;

final class LoginStatusClient extends PlatformServiceClient
{

	LoginStatusClient(Context context, String s, String s1, String s2, long l)
	{
		super(context, 0x1000a, 0x1000b, 0x133c6ab, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #15  <Int 0x1000a>
	//    3    4:ldc1            #16  <Int 0x1000b>
	//    4    6:ldc1            #17  <Int 0x133c6ab>
	//    5    8:aload_2         
	//    6    9:invokespecial   #20  <Method void PlatformServiceClient(Context, int, int, int, String)>
		loggerRef = s1;
	//    7   12:aload_0         
	//    8   13:aload_3         
	//    9   14:putfield        #22  <Field String loggerRef>
		graphApiVersion = s2;
	//   10   17:aload_0         
	//   11   18:aload           4
	//   12   20:putfield        #24  <Field String graphApiVersion>
		toastDurationMs = l;
	//   13   23:aload_0         
	//   14   24:lload           5
	//   15   26:putfield        #26  <Field long toastDurationMs>
	//   16   29:return          
	}

	protected void populateRequestBundle(Bundle bundle)
	{
		bundle.putString("com.facebook.platform.extra.LOGGER_REF", loggerRef);
	//    0    0:aload_1         
	//    1    1:ldc1            #31  <String "com.facebook.platform.extra.LOGGER_REF">
	//    2    3:aload_0         
	//    3    4:getfield        #22  <Field String loggerRef>
	//    4    7:invokevirtual   #37  <Method void Bundle.putString(String, String)>
		bundle.putString("com.facebook.platform.extra.GRAPH_API_VERSION", graphApiVersion);
	//    5   10:aload_1         
	//    6   11:ldc1            #39  <String "com.facebook.platform.extra.GRAPH_API_VERSION">
	//    7   13:aload_0         
	//    8   14:getfield        #24  <Field String graphApiVersion>
	//    9   17:invokevirtual   #37  <Method void Bundle.putString(String, String)>
		bundle.putLong("com.facebook.platform.extra.EXTRA_TOAST_DURATION_MS", toastDurationMs);
	//   10   20:aload_1         
	//   11   21:ldc1            #41  <String "com.facebook.platform.extra.EXTRA_TOAST_DURATION_MS">
	//   12   23:aload_0         
	//   13   24:getfield        #26  <Field long toastDurationMs>
	//   14   27:invokevirtual   #45  <Method void Bundle.putLong(String, long)>
	//   15   30:return          
	}

	static final long DEFAULT_TOAST_DURATION_MS = 5000L;
	private final String graphApiVersion;
	private final String loggerRef;
	private final long toastDurationMs;
}
