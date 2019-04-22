// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.marketing;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.Base64;
import android.view.View;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

// Referenced classes of package com.facebook.marketing:
//			ViewIndexer

private static class ViewIndexer$ScreenshotTaker
	implements Callable
{

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #33  <Method String call()>
	//    2    4:areturn         
	}

	public String call()
		throws Exception
	{
		Object obj = ((Object) ((View)rootView.get()));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field WeakReference rootView>
	//    2    4:invokevirtual   #37  <Method Object WeakReference.get()>
	//    3    7:checkcast       #39  <Class View>
	//    4   10:astore_2        
		if(obj != null && ((View) (obj)).getWidth() != 0 && ((View) (obj)).getHeight() != 0)
	//*   5   11:aload_2         
	//*   6   12:ifnull          87
	//*   7   15:aload_2         
	//*   8   16:invokevirtual   #43  <Method int View.getWidth()>
	//*   9   19:ifeq            87
	//*  10   22:aload_2         
	//*  11   23:invokevirtual   #46  <Method int View.getHeight()>
	//*  12   26:ifne            32
	//*  13   29:goto            87
		{
			Bitmap bitmap = Bitmap.createBitmap(((View) (obj)).getWidth(), ((View) (obj)).getHeight(), android.graphics.Bitmap.Config.RGB_565);
	//   14   32:aload_2         
	//   15   33:invokevirtual   #43  <Method int View.getWidth()>
	//   16   36:aload_2         
	//   17   37:invokevirtual   #46  <Method int View.getHeight()>
	//   18   40:getstatic       #52  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
	//   19   43:invokestatic    #58  <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   20   46:astore_1        
			((View) (obj)).draw(new Canvas(bitmap));
	//   21   47:aload_2         
	//   22   48:new             #60  <Class Canvas>
	//   23   51:dup             
	//   24   52:aload_1         
	//   25   53:invokespecial   #63  <Method void Canvas(Bitmap)>
	//   26   56:invokevirtual   #67  <Method void View.draw(Canvas)>
			obj = ((Object) (new ByteArrayOutputStream()));
	//   27   59:new             #69  <Class ByteArrayOutputStream>
	//   28   62:dup             
	//   29   63:invokespecial   #70  <Method void ByteArrayOutputStream()>
	//   30   66:astore_2        
			bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 10, ((java.io.OutputStream) (obj)));
	//   31   67:aload_1         
	//   32   68:getstatic       #76  <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.JPEG>
	//   33   71:bipush          10
	//   34   73:aload_2         
	//   35   74:invokevirtual   #80  <Method boolean Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, java.io.OutputStream)>
	//   36   77:pop             
			return Base64.encodeToString(((ByteArrayOutputStream) (obj)).toByteArray(), 2);
	//   37   78:aload_2         
	//   38   79:invokevirtual   #84  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   39   82:iconst_2        
	//   40   83:invokestatic    #90  <Method String Base64.encodeToString(byte[], int)>
	//   41   86:areturn         
		} else
		{
			return "";
	//   42   87:ldc1            #92  <String "">
	//   43   89:areturn         
		}
	}

	private WeakReference rootView;

	public ViewIndexer$ScreenshotTaker(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		rootView = new WeakReference(((Object) (view)));
	//    2    4:aload_0         
	//    3    5:new             #20  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #23  <Method void WeakReference(Object)>
	//    7   13:putfield        #25  <Field WeakReference rootView>
	//    8   16:return          
	}
}
