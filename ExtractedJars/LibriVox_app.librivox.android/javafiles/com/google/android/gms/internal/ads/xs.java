// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebSettings;
import java.io.File;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal.ads:
//			xr

final class xs
	implements Callable
{

	xs(xr xr, Context context, WebSettings websettings)
	{
		a = context;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #14  <Field Context a>
		b = websettings;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #16  <Field WebSettings b>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final Object call()
	{
		if(a.getCacheDir() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field Context a>
	//*   2    4:invokevirtual   #28  <Method File Context.getCacheDir()>
	//*   3    7:ifnull          43
		{
			b.setAppCachePath(a.getCacheDir().getAbsolutePath());
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field WebSettings b>
	//    6   14:aload_0         
	//    7   15:getfield        #14  <Field Context a>
	//    8   18:invokevirtual   #28  <Method File Context.getCacheDir()>
	//    9   21:invokevirtual   #34  <Method String File.getAbsolutePath()>
	//   10   24:invokevirtual   #40  <Method void WebSettings.setAppCachePath(String)>
			b.setAppCacheMaxSize(0L);
	//   11   27:aload_0         
	//   12   28:getfield        #16  <Field WebSettings b>
	//   13   31:lconst_0        
	//   14   32:invokevirtual   #44  <Method void WebSettings.setAppCacheMaxSize(long)>
			b.setAppCacheEnabled(true);
	//   15   35:aload_0         
	//   16   36:getfield        #16  <Field WebSettings b>
	//   17   39:iconst_1        
	//   18   40:invokevirtual   #48  <Method void WebSettings.setAppCacheEnabled(boolean)>
		}
		b.setDatabasePath(a.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
	//   19   43:aload_0         
	//   20   44:getfield        #16  <Field WebSettings b>
	//   21   47:aload_0         
	//   22   48:getfield        #14  <Field Context a>
	//   23   51:ldc1            #50  <String "com.google.android.gms.ads.db">
	//   24   53:invokevirtual   #54  <Method File Context.getDatabasePath(String)>
	//   25   56:invokevirtual   #34  <Method String File.getAbsolutePath()>
	//   26   59:invokevirtual   #57  <Method void WebSettings.setDatabasePath(String)>
		b.setDatabaseEnabled(true);
	//   27   62:aload_0         
	//   28   63:getfield        #16  <Field WebSettings b>
	//   29   66:iconst_1        
	//   30   67:invokevirtual   #60  <Method void WebSettings.setDatabaseEnabled(boolean)>
		b.setDomStorageEnabled(true);
	//   31   70:aload_0         
	//   32   71:getfield        #16  <Field WebSettings b>
	//   33   74:iconst_1        
	//   34   75:invokevirtual   #63  <Method void WebSettings.setDomStorageEnabled(boolean)>
		b.setDisplayZoomControls(false);
	//   35   78:aload_0         
	//   36   79:getfield        #16  <Field WebSettings b>
	//   37   82:iconst_0        
	//   38   83:invokevirtual   #66  <Method void WebSettings.setDisplayZoomControls(boolean)>
		b.setBuiltInZoomControls(true);
	//   39   86:aload_0         
	//   40   87:getfield        #16  <Field WebSettings b>
	//   41   90:iconst_1        
	//   42   91:invokevirtual   #69  <Method void WebSettings.setBuiltInZoomControls(boolean)>
		b.setSupportZoom(true);
	//   43   94:aload_0         
	//   44   95:getfield        #16  <Field WebSettings b>
	//   45   98:iconst_1        
	//   46   99:invokevirtual   #72  <Method void WebSettings.setSupportZoom(boolean)>
		b.setAllowContentAccess(false);
	//   47  102:aload_0         
	//   48  103:getfield        #16  <Field WebSettings b>
	//   49  106:iconst_0        
	//   50  107:invokevirtual   #75  <Method void WebSettings.setAllowContentAccess(boolean)>
		return ((Object) (Boolean.valueOf(true)));
	//   51  110:iconst_1        
	//   52  111:invokestatic    #81  <Method Boolean Boolean.valueOf(boolean)>
	//   53  114:areturn         
	}

	private final Context a;
	private final WebSettings b;
}
