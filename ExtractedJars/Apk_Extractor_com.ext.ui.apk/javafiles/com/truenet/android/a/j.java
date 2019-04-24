// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.truenet.android.a;

import android.graphics.Bitmap;
import android.support.v7.ae;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebView;

// Referenced classes of package com.truenet.android.a:
//			c

public final class j
{

	public static final Bitmap a(WebView webview)
	{
		ae.b(((Object) (webview)), "$receiver");
	//    0    0:aload_0         
	//    1    1:ldc1            #9   <String "$receiver">
	//    2    3:invokestatic    #15  <Method void ae.b(Object, String)>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   3    6:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    9:bipush          21
	//*   5   11:icmplt          17
			WebView.enableSlowWholeDocumentDraw();
	//    6   14:invokestatic    #27  <Method void WebView.enableSlowWholeDocumentDraw()>
		Object obj = ((Object) (new DisplayMetrics()));
	//    7   17:new             #29  <Class DisplayMetrics>
	//    8   20:dup             
	//    9   21:invokespecial   #32  <Method void DisplayMetrics()>
	//   10   24:astore_3        
		android.content.Context context = webview.getContext();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #36  <Method android.content.Context WebView.getContext()>
	//   13   29:astore          4
		ae.a(((Object) (context)), "context");
	//   14   31:aload           4
	//   15   33:ldc1            #38  <String "context">
	//   16   35:invokestatic    #40  <Method void ae.a(Object, String)>
		c.b(context).getDefaultDisplay().getMetrics(((DisplayMetrics) (obj)));
	//   17   38:aload           4
	//   18   40:invokestatic    #45  <Method WindowManager c.b(android.content.Context)>
	//   19   43:invokeinterface #51  <Method Display WindowManager.getDefaultDisplay()>
	//   20   48:aload_3         
	//   21   49:invokevirtual   #57  <Method void Display.getMetrics(DisplayMetrics)>
		int i = ((DisplayMetrics) (obj)).widthPixels;
	//   22   52:aload_3         
	//   23   53:getfield        #60  <Field int DisplayMetrics.widthPixels>
	//   24   56:istore_1        
		int k = ((DisplayMetrics) (obj)).heightPixels;
	//   25   57:aload_3         
	//   26   58:getfield        #63  <Field int DisplayMetrics.heightPixels>
	//   27   61:istore_2        
		webview.measure(i, k);
	//   28   62:aload_0         
	//   29   63:iload_1         
	//   30   64:iload_2         
	//   31   65:invokevirtual   #67  <Method void WebView.measure(int, int)>
		webview.layout(0, 0, i, k);
	//   32   68:aload_0         
	//   33   69:iconst_0        
	//   34   70:iconst_0        
	//   35   71:iload_1         
	//   36   72:iload_2         
	//   37   73:invokevirtual   #71  <Method void WebView.layout(int, int, int, int)>
		webview.setDrawingCacheEnabled(true);
	//   38   76:aload_0         
	//   39   77:iconst_1        
	//   40   78:invokevirtual   #75  <Method void WebView.setDrawingCacheEnabled(boolean)>
		webview.buildDrawingCache(true);
	//   41   81:aload_0         
	//   42   82:iconst_1        
	//   43   83:invokevirtual   #78  <Method void WebView.buildDrawingCache(boolean)>
		Thread.sleep(500L);
	//   44   86:ldc2w           #79  <Long 500L>
	//   45   89:invokestatic    #86  <Method void Thread.sleep(long)>
		obj = ((Object) (Bitmap.createBitmap(webview.getDrawingCache())));
	//   46   92:aload_0         
	//   47   93:invokevirtual   #90  <Method Bitmap WebView.getDrawingCache()>
	//   48   96:invokestatic    #96  <Method Bitmap Bitmap.createBitmap(Bitmap)>
	//   49   99:astore_3        
		webview.setDrawingCacheEnabled(false);
	//   50  100:aload_0         
	//   51  101:iconst_0        
	//   52  102:invokevirtual   #75  <Method void WebView.setDrawingCacheEnabled(boolean)>
		ae.a(obj, "bitmap");
	//   53  105:aload_3         
	//   54  106:ldc1            #98  <String "bitmap">
	//   55  108:invokestatic    #40  <Method void ae.a(Object, String)>
		return ((Bitmap) (obj));
	//   56  111:aload_3         
	//   57  112:areturn         
	}
}
