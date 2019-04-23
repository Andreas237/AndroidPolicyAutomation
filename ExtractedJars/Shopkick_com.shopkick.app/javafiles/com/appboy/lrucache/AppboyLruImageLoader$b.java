// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.lrucache;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.widget.ImageView;
import com.appboy.enums.AppboyViewBounds;

// Referenced classes of package com.appboy.lrucache:
//			AppboyLruImageLoader

class AppboyLruImageLoader$b extends AsyncTask
{

	protected transient Bitmap a(Void avoid[])
	{
		return a.getBitmapFromUrl(c, e, d);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AppboyLruImageLoader a>
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field Context c>
	//    4    8:aload_0         
	//    5    9:getfield        #32  <Field String e>
	//    6   12:aload_0         
	//    7   13:getfield        #30  <Field AppboyViewBounds d>
	//    8   16:invokevirtual   #47  <Method Bitmap AppboyLruImageLoader.getBitmapFromUrl(Context, String, AppboyViewBounds)>
	//    9   19:areturn         
	}

	protected void a(Bitmap bitmap)
	{
		ImageView imageview = b;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field ImageView b>
	//    2    4:astore_2        
		if(imageview != null && ((String)imageview.getTag()).equals(((Object) (e))))
	//*   3    5:aload_2         
	//*   4    6:ifnull          34
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #52  <Method Object ImageView.getTag()>
	//*   7   13:checkcast       #54  <Class String>
	//*   8   16:aload_0         
	//*   9   17:getfield        #32  <Field String e>
	//*  10   20:invokevirtual   #58  <Method boolean String.equals(Object)>
	//*  11   23:ifeq            34
			b.setImageBitmap(bitmap);
	//   12   26:aload_0         
	//   13   27:getfield        #26  <Field ImageView b>
	//   14   30:aload_1         
	//   15   31:invokevirtual   #61  <Method void ImageView.setImageBitmap(Bitmap)>
	//   16   34:return          
	}

	protected Object doInBackground(Object aobj[])
	{
		return ((Object) (a((Void[])aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #65  <Class Void[]>
	//    3    5:invokevirtual   #67  <Method Bitmap a(Void[])>
	//    4    8:areturn         
	}

	protected void onPostExecute(Object obj)
	{
		a((Bitmap)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #70  <Class Bitmap>
	//    3    5:invokevirtual   #72  <Method void a(Bitmap)>
	//    4    8:return          
	}

	final AppboyLruImageLoader a;
	private final ImageView b;
	private final Context c;
	private final AppboyViewBounds d;
	private final String e;

	private AppboyLruImageLoader$b(AppboyLruImageLoader appboylruimageloader, Context context, ImageView imageview, AppboyViewBounds appboyviewbounds, String s)
	{
		a = appboylruimageloader;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field AppboyLruImageLoader a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void AsyncTask()>
		b = imageview;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #26  <Field ImageView b>
		c = context;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #28  <Field Context c>
		d = appboyviewbounds;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #30  <Field AppboyViewBounds d>
		e = s;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #32  <Field String e>
		imageview.setTag(((Object) (s)));
	//   17   31:aload_3         
	//   18   32:aload           5
	//   19   34:invokevirtual   #38  <Method void ImageView.setTag(Object)>
	//   20   37:return          
	}

	AppboyLruImageLoader$b(AppboyLruImageLoader appboylruimageloader, Context context, ImageView imageview, AppboyViewBounds appboyviewbounds, String s, AppboyLruImageLoader$1 appboylruimageloader$1)
	{
		this(appboylruimageloader, context, imageview, appboyviewbounds, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokespecial   #42  <Method void AppboyLruImageLoader$b(AppboyLruImageLoader, Context, ImageView, AppboyViewBounds, String)>
	//    7   11:return          
	}
}
