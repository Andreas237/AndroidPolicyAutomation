// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebSettings;
import java.io.File;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzakt

final class zzaku
	implements Callable
{

	zzaku(zzakt zzakt, Context context, WebSettings websettings)
	{
		val$context = context;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field Context val$context>
		zzcrw = websettings;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #17  <Field WebSettings zzcrw>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #20  <Method void Object()>
	//    8   14:return          
	}

	public final Object call()
		throws Exception
	{
		if(val$context.getCacheDir() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field Context val$context>
	//*   2    4:invokevirtual   #31  <Method File Context.getCacheDir()>
	//*   3    7:ifnull          43
		{
			zzcrw.setAppCachePath(val$context.getCacheDir().getAbsolutePath());
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field WebSettings zzcrw>
	//    6   14:aload_0         
	//    7   15:getfield        #15  <Field Context val$context>
	//    8   18:invokevirtual   #31  <Method File Context.getCacheDir()>
	//    9   21:invokevirtual   #37  <Method String File.getAbsolutePath()>
	//   10   24:invokevirtual   #43  <Method void WebSettings.setAppCachePath(String)>
			zzcrw.setAppCacheMaxSize(0L);
	//   11   27:aload_0         
	//   12   28:getfield        #17  <Field WebSettings zzcrw>
	//   13   31:lconst_0        
	//   14   32:invokevirtual   #47  <Method void WebSettings.setAppCacheMaxSize(long)>
			zzcrw.setAppCacheEnabled(true);
	//   15   35:aload_0         
	//   16   36:getfield        #17  <Field WebSettings zzcrw>
	//   17   39:iconst_1        
	//   18   40:invokevirtual   #51  <Method void WebSettings.setAppCacheEnabled(boolean)>
		}
		zzcrw.setDatabasePath(val$context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
	//   19   43:aload_0         
	//   20   44:getfield        #17  <Field WebSettings zzcrw>
	//   21   47:aload_0         
	//   22   48:getfield        #15  <Field Context val$context>
	//   23   51:ldc1            #53  <String "com.google.android.gms.ads.db">
	//   24   53:invokevirtual   #57  <Method File Context.getDatabasePath(String)>
	//   25   56:invokevirtual   #37  <Method String File.getAbsolutePath()>
	//   26   59:invokevirtual   #60  <Method void WebSettings.setDatabasePath(String)>
		zzcrw.setDatabaseEnabled(true);
	//   27   62:aload_0         
	//   28   63:getfield        #17  <Field WebSettings zzcrw>
	//   29   66:iconst_1        
	//   30   67:invokevirtual   #63  <Method void WebSettings.setDatabaseEnabled(boolean)>
		zzcrw.setDomStorageEnabled(true);
	//   31   70:aload_0         
	//   32   71:getfield        #17  <Field WebSettings zzcrw>
	//   33   74:iconst_1        
	//   34   75:invokevirtual   #66  <Method void WebSettings.setDomStorageEnabled(boolean)>
		zzcrw.setDisplayZoomControls(false);
	//   35   78:aload_0         
	//   36   79:getfield        #17  <Field WebSettings zzcrw>
	//   37   82:iconst_0        
	//   38   83:invokevirtual   #69  <Method void WebSettings.setDisplayZoomControls(boolean)>
		zzcrw.setBuiltInZoomControls(true);
	//   39   86:aload_0         
	//   40   87:getfield        #17  <Field WebSettings zzcrw>
	//   41   90:iconst_1        
	//   42   91:invokevirtual   #72  <Method void WebSettings.setBuiltInZoomControls(boolean)>
		zzcrw.setSupportZoom(true);
	//   43   94:aload_0         
	//   44   95:getfield        #17  <Field WebSettings zzcrw>
	//   45   98:iconst_1        
	//   46   99:invokevirtual   #75  <Method void WebSettings.setSupportZoom(boolean)>
		zzcrw.setAllowContentAccess(false);
	//   47  102:aload_0         
	//   48  103:getfield        #17  <Field WebSettings zzcrw>
	//   49  106:iconst_0        
	//   50  107:invokevirtual   #78  <Method void WebSettings.setAllowContentAccess(boolean)>
		return ((Object) (Boolean.valueOf(true)));
	//   51  110:iconst_1        
	//   52  111:invokestatic    #84  <Method Boolean Boolean.valueOf(boolean)>
	//   53  114:areturn         
	}

	private final Context val$context;
	private final WebSettings zzcrw;
}
