// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.irobot.home.util.o;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.irobot.home:
//			NotificationDetailsActivity

private class NotificationDetailsActivity$a extends AsyncTask
{

	private Bitmap a()
	{
		Bitmap bitmap;
		Object obj;
		obj = ((Object) (new android.graphics.BitmapFactory.Options()));
	//    0    0:new             #34  <Class android.graphics.BitmapFactory$Options>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void android.graphics.BitmapFactory$Options()>
	//    3    7:astore_2        
		obj.inSampleSize = 1;
	//    4    8:aload_2         
	//    5    9:iconst_1        
	//    6   10:putfield        #39  <Field int android.graphics.BitmapFactory$Options.inSampleSize>
		bitmap = null;
	//    7   13:aconst_null     
	//    8   14:astore_1        
		InputStream inputstream;
		inputstream = a.a(b);
	//    9   15:aload_0         
	//   10   16:getfield        #19  <Field NotificationDetailsActivity a>
	//   11   19:aload_0         
	//   12   20:getfield        #24  <Field String b>
	//   13   23:invokevirtual   #42  <Method InputStream NotificationDetailsActivity.a(String)>
	//   14   26:astore_3        
		obj = ((Object) (BitmapFactory.decodeStream(inputstream, ((android.graphics.Rect) (null)), ((android.graphics.BitmapFactory.Options) (obj)))));
	//   15   27:aload_3         
	//   16   28:aconst_null     
	//   17   29:aload_2         
	//   18   30:invokestatic    #48  <Method Bitmap BitmapFactory.decodeStream(InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options)>
	//   19   33:astore_2        
		IOException ioexception;
		try
		{
			inputstream.close();
	//   20   34:aload_3         
	//   21   35:invokevirtual   #53  <Method void InputStream.close()>
		}
	//*  22   38:aload_2         
	//*  23   39:areturn         
		catch(IOException ioexception1)
	//*  24   40:astore_3        
		{
			bitmap = ((Bitmap) (obj));
	//   25   41:aload_2         
	//   26   42:astore_1        
			ioexception = ioexception1;
	//   27   43:aload_3         
	//   28   44:astore_2        
			break MISSING_BLOCK_LABEL_49;
	//   29   45:goto            49
		}
		return ((Bitmap) (obj));
		ioexception;
	//   30   48:astore_2        
		ioexception.printStackTrace();
	//   31   49:aload_2         
	//   32   50:invokevirtual   #56  <Method void IOException.printStackTrace()>
		return bitmap;
	//   33   53:aload_1         
	//   34   54:areturn         
	}

	protected transient Bitmap a(String as[])
	{
		return a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method Bitmap a()>
	//    2    4:areturn         
	}

	protected void a(Bitmap bitmap)
	{
		if(bitmap != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          30
		{
			c.setImageBitmap(bitmap);
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field ImageView c>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #65  <Method void ImageView.setImageBitmap(Bitmap)>
			c.setVisibility(0);
	//    6   12:aload_0         
	//    7   13:getfield        #26  <Field ImageView c>
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #69  <Method void ImageView.setVisibility(int)>
			d.setVisibility(8);
	//   10   20:aload_0         
	//   11   21:getfield        #28  <Field ProgressBar d>
	//   12   24:bipush          8
	//   13   26:invokevirtual   #72  <Method void ProgressBar.setVisibility(int)>
			return;
	//   14   29:return          
		} else
		{
			bitmap = ((Bitmap) (NotificationDetailsActivity.b(a)));
	//   15   30:aload_0         
	//   16   31:getfield        #19  <Field NotificationDetailsActivity a>
	//   17   34:invokestatic    #75  <Method String NotificationDetailsActivity.b(NotificationDetailsActivity)>
	//   18   37:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   19   38:new             #77  <Class StringBuilder>
	//   20   41:dup             
	//   21   42:invokespecial   #78  <Method void StringBuilder()>
	//   22   45:astore_2        
			stringbuilder.append("Unable to download image with URL: ");
	//   23   46:aload_2         
	//   24   47:ldc1            #80  <String "Unable to download image with URL: ">
	//   25   49:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
			stringbuilder.append(b);
	//   27   53:aload_2         
	//   28   54:aload_0         
	//   29   55:getfield        #24  <Field String b>
	//   30   58:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   31   61:pop             
			o.e(((String) (bitmap)), stringbuilder.toString());
	//   32   62:aload_1         
	//   33   63:aload_2         
	//   34   64:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   35   67:invokestatic    #94  <Method void o.e(String, String)>
			return;
	//   36   70:return          
		}
	}

	protected Object doInBackground(Object aobj[])
	{
		return ((Object) (a((String[])aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #98  <Class String[]>
	//    3    5:invokevirtual   #100 <Method Bitmap a(String[])>
	//    4    8:areturn         
	}

	protected void onPostExecute(Object obj)
	{
		a((Bitmap)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #104 <Class Bitmap>
	//    3    5:invokevirtual   #106 <Method void a(Bitmap)>
	//    4    8:return          
	}

	final NotificationDetailsActivity a;
	private String b;
	private ImageView c;
	private ProgressBar d;

	NotificationDetailsActivity$a(NotificationDetailsActivity notificationdetailsactivity, String s, ImageView imageview, ProgressBar progressbar)
	{
		a = notificationdetailsactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field NotificationDetailsActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void AsyncTask()>
		b = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field String b>
		c = imageview;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #26  <Field ImageView c>
		d = progressbar;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #28  <Field ProgressBar d>
	//   14   25:return          
	}
}
