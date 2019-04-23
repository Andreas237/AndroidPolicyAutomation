// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			xo

public class xq extends xo
{

	public xq()
	{
		super(((xp) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #12  <Method void xo(xp)>
	//    3    5:return          
	}

	public final int a()
	{
		return 6;
	//    0    0:bipush          6
	//    1    2:ireturn         
	}

	public boolean a(android.app.DownloadManager.Request request)
	{
		request.setShowRunningNotification(true);
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #22  <Method android.app.DownloadManager$Request android.app.DownloadManager$Request.setShowRunningNotification(boolean)>
	//    3    5:pop             
		return true;
	//    4    6:iconst_1        
	//    5    7:ireturn         
	}

	public final int b()
	{
		return 7;
	//    0    0:bipush          7
	//    1    2:ireturn         
	}
}
