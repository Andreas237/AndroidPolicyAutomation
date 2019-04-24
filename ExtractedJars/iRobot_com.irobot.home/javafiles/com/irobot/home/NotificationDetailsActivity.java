// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Base64;
import android.view.*;
import android.webkit.*;
import android.widget.*;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomTextView;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, CustomVideoWebViewActivity_

public class NotificationDetailsActivity extends BaseFragmentActivity
{
	private class a extends AsyncTask
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
		//   13   23:invokevirtual   #42  <Method InputStream com.irobot.home.NotificationDetailsActivity.a(String)>
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
				com.irobot.home.util.o.e(((String) (bitmap)), stringbuilder.toString());
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

		a(String s, ImageView imageview, ProgressBar progressbar)
		{
			a = NotificationDetailsActivity.this;
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


	public NotificationDetailsActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void BaseFragmentActivity()>
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class NotificationDetailsActivity>
	//    4    7:invokevirtual   #60  <Method String Class.getSimpleName()>
	//    5   10:invokestatic    #66  <Method String j.r(String)>
	//    6   13:putfield        #68  <Field String v>
		c = "";
	//    7   16:aload_0         
	//    8   17:ldc1            #70  <String "">
	//    9   19:putfield        #72  <Field String c>
		d = "";
	//   10   22:aload_0         
	//   11   23:ldc1            #70  <String "">
	//   12   25:putfield        #74  <Field String d>
		e = "";
	//   13   28:aload_0         
	//   14   29:ldc1            #70  <String "">
	//   15   31:putfield        #76  <Field String e>
		g = "";
	//   16   34:aload_0         
	//   17   35:ldc1            #70  <String "">
	//   18   37:putfield        #78  <Field String g>
	//   19   40:aload_0         
	//   20   41:ldc1            #80  <String "content_text">
	//   21   43:putfield        #82  <Field String w>
	//   22   46:aload_0         
	//   23   47:ldc1            #84  <String "content_id">
	//   24   49:putfield        #86  <Field String x>
	//   25   52:aload_0         
	//   26   53:ldc1            #88  <String "video_url">
	//   27   55:putfield        #90  <Field String y>
	//   28   58:aload_0         
	//   29   59:ldc1            #92  <String "video_id">
	//   30   61:putfield        #94  <Field String z>
	//   31   64:aload_0         
	//   32   65:ldc1            #96  <String "internal_video_url">
	//   33   67:putfield        #98  <Field String A>
	//   34   70:aload_0         
	//   35   71:ldc1            #100 <String "image">
	//   36   73:putfield        #102 <Field String B>
	//   37   76:aload_0         
	//   38   77:ldc1            #104 <String "internal_image_url">
	//   39   79:putfield        #106 <Field String C>
	//   40   82:aload_0         
	//   41   83:ldc1            #108 <String "image_url">
	//   42   85:putfield        #110 <Field String D>
	//   43   88:aload_0         
	//   44   89:ldc1            #112 <String "image_id">
	//   45   91:putfield        #114 <Field String E>
	//   46   94:aload_0         
	//   47   95:ldc1            #116 <String "html">
	//   48   97:putfield        #118 <Field String F>
		G = true;
	//   49  100:aload_0         
	//   50  101:iconst_1        
	//   51  102:putfield        #120 <Field boolean G>
	//   52  105:return          
	}

	private int a(android.graphics.BitmapFactory.Options options, int i1, int j1)
	{
		int i2 = options.outHeight;
	//    0    0:aload_1         
	//    1    1:getfield        #127 <Field int android.graphics.BitmapFactory$Options.outHeight>
	//    2    4:istore          6
		int j2 = options.outWidth;
	//    3    6:aload_1         
	//    4    7:getfield        #130 <Field int android.graphics.BitmapFactory$Options.outWidth>
	//    5   10:istore          7
		int l1 = 1;
	//    6   12:iconst_1        
	//    7   13:istore          5
		int k1 = 1;
	//    8   15:iconst_1        
	//    9   16:istore          4
		if(i2 > j1 || j2 > i1)
	//*  10   18:iload           6
	//*  11   20:iload_3         
	//*  12   21:icmpgt          30
	//*  13   24:iload           7
	//*  14   26:iload_2         
	//*  15   27:icmple          77
		{
			i2 /= 2;
	//   16   30:iload           6
	//   17   32:iconst_2        
	//   18   33:idiv            
	//   19   34:istore          6
			j2 /= 2;
	//   20   36:iload           7
	//   21   38:iconst_2        
	//   22   39:idiv            
	//   23   40:istore          7
			do
			{
				l1 = k1;
	//   24   42:iload           4
	//   25   44:istore          5
				if(i2 / k1 < j1)
					break;
	//   26   46:iload           6
	//   27   48:iload           4
	//   28   50:idiv            
	//   29   51:iload_3         
	//   30   52:icmplt          77
				l1 = k1;
	//   31   55:iload           4
	//   32   57:istore          5
				if(j2 / k1 < i1)
					break;
	//   33   59:iload           7
	//   34   61:iload           4
	//   35   63:idiv            
	//   36   64:iload_2         
	//   37   65:icmplt          77
				k1 *= 2;
	//   38   68:iload           4
	//   39   70:iconst_2        
	//   40   71:imul            
	//   41   72:istore          4
			} while(true);
	//   42   74:goto            42
		}
		return l1;
	//   43   77:iload           5
	//   44   79:ireturn         
	}

	private Bitmap a(String s, int i1, int j1)
	{
		s = ((String) (Base64.decode(s, 2)));
	//    0    0:aload_1         
	//    1    1:iconst_2        
	//    2    2:invokestatic    #137 <Method byte[] Base64.decode(String, int)>
	//    3    5:astore_1        
		android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
	//    4    6:new             #124 <Class android.graphics.BitmapFactory$Options>
	//    5    9:dup             
	//    6   10:invokespecial   #138 <Method void android.graphics.BitmapFactory$Options()>
	//    7   13:astore          4
		options.inJustDecodeBounds = true;
	//    8   15:aload           4
	//    9   17:iconst_1        
	//   10   18:putfield        #141 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
		BitmapFactory.decodeByteArray(((byte []) (s)), 0, s.length, options);
	//   11   21:aload_1         
	//   12   22:iconst_0        
	//   13   23:aload_1         
	//   14   24:arraylength     
	//   15   25:aload           4
	//   16   27:invokestatic    #147 <Method Bitmap BitmapFactory.decodeByteArray(byte[], int, int, android.graphics.BitmapFactory$Options)>
	//   17   30:pop             
		options.inSampleSize = a(options, i1, j1);
	//   18   31:aload           4
	//   19   33:aload_0         
	//   20   34:aload           4
	//   21   36:iload_2         
	//   22   37:iload_3         
	//   23   38:invokespecial   #149 <Method int a(android.graphics.BitmapFactory$Options, int, int)>
	//   24   41:putfield        #152 <Field int android.graphics.BitmapFactory$Options.inSampleSize>
		options.inJustDecodeBounds = false;
	//   25   44:aload           4
	//   26   46:iconst_0        
	//   27   47:putfield        #141 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
		return BitmapFactory.decodeByteArray(((byte []) (s)), 0, s.length, options);
	//   28   50:aload_1         
	//   29   51:iconst_0        
	//   30   52:aload_1         
	//   31   53:arraylength     
	//   32   54:aload           4
	//   33   56:invokestatic    #147 <Method Bitmap BitmapFactory.decodeByteArray(byte[], int, int, android.graphics.BitmapFactory$Options)>
	//   34   59:areturn         
	}

	static boolean a(NotificationDetailsActivity notificationdetailsactivity)
	{
		return notificationdetailsactivity.G;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field boolean G>
	//    2    4:ireturn         
	}

	static boolean a(NotificationDetailsActivity notificationdetailsactivity, boolean flag)
	{
		notificationdetailsactivity.G = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #120 <Field boolean G>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static String b(NotificationDetailsActivity notificationdetailsactivity)
	{
		return notificationdetailsactivity.v;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field String v>
	//    2    4:areturn         
	}

	private void b(String s)
	{
		View view = getLayoutInflater().inflate(0x7f0b00f7, ((android.view.ViewGroup) (null)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #160 <Method LayoutInflater getLayoutInflater()>
	//    2    4:ldc1            #161 <Int 0x7f0b00f7>
	//    3    6:aconst_null     
	//    4    7:invokevirtual   #167 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//    5   10:astore_2        
		if(view == null)
	//*   6   11:aload_2         
	//*   7   12:ifnonnull       25
		{
			com.irobot.home.util.o.e(v, "Cannot inflate title view");
	//    8   15:aload_0         
	//    9   16:getfield        #68  <Field String v>
	//   10   19:ldc1            #169 <String "Cannot inflate title view">
	//   11   21:invokestatic    #174 <Method void o.e(String, String)>
			return;
	//   12   24:return          
		}
		CustomTextView customtextview = (CustomTextView)view.findViewById(0x7f09029d);
	//   13   25:aload_2         
	//   14   26:ldc1            #175 <Int 0x7f09029d>
	//   15   28:invokevirtual   #181 <Method View View.findViewById(int)>
	//   16   31:checkcast       #183 <Class CustomTextView>
	//   17   34:astore_3        
		if(customtextview != null)
	//*  18   35:aload_3         
	//*  19   36:ifnull          52
		{
			customtextview.setText(((CharSequence) (s)));
	//   20   39:aload_3         
	//   21   40:aload_1         
	//   22   41:invokevirtual   #187 <Method void CustomTextView.setText(CharSequence)>
			a.addView(view);
	//   23   44:aload_0         
	//   24   45:getfield        #189 <Field LinearLayout a>
	//   25   48:aload_2         
	//   26   49:invokevirtual   #195 <Method void LinearLayout.addView(View)>
		}
	//   27   52:return          
	}

	private void c(String s)
	{
		View view = getLayoutInflater().inflate(0x7f0b00f4, ((android.view.ViewGroup) (null)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #160 <Method LayoutInflater getLayoutInflater()>
	//    2    4:ldc1            #196 <Int 0x7f0b00f4>
	//    3    6:aconst_null     
	//    4    7:invokevirtual   #167 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//    5   10:astore_2        
		if(view == null)
	//*   6   11:aload_2         
	//*   7   12:ifnonnull       25
		{
			com.irobot.home.util.o.e(v, "Cannot inflate content view");
	//    8   15:aload_0         
	//    9   16:getfield        #68  <Field String v>
	//   10   19:ldc1            #198 <String "Cannot inflate content view">
	//   11   21:invokestatic    #174 <Method void o.e(String, String)>
			return;
	//   12   24:return          
		}
		CustomTextView customtextview = (CustomTextView)view.findViewById(0x7f090292);
	//   13   25:aload_2         
	//   14   26:ldc1            #199 <Int 0x7f090292>
	//   15   28:invokevirtual   #181 <Method View View.findViewById(int)>
	//   16   31:checkcast       #183 <Class CustomTextView>
	//   17   34:astore_3        
		if(customtextview != null)
	//*  18   35:aload_3         
	//*  19   36:ifnull          52
		{
			customtextview.setText(((CharSequence) (s)));
	//   20   39:aload_3         
	//   21   40:aload_1         
	//   22   41:invokevirtual   #187 <Method void CustomTextView.setText(CharSequence)>
			a.addView(view);
	//   23   44:aload_0         
	//   24   45:getfield        #189 <Field LinearLayout a>
	//   25   48:aload_2         
	//   26   49:invokevirtual   #195 <Method void LinearLayout.addView(View)>
		}
	//   27   52:return          
	}

	private void d(String s)
	{
		View view = getLayoutInflater().inflate(0x7f0b00f6, ((android.view.ViewGroup) (null)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #160 <Method LayoutInflater getLayoutInflater()>
	//    2    4:ldc1            #200 <Int 0x7f0b00f6>
	//    3    6:aconst_null     
	//    4    7:invokevirtual   #167 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//    5   10:astore_2        
		if(view == null)
	//*   6   11:aload_2         
	//*   7   12:ifnonnull       25
		{
			com.irobot.home.util.o.e(v, "Cannot inflate media view for image");
	//    8   15:aload_0         
	//    9   16:getfield        #68  <Field String v>
	//   10   19:ldc1            #202 <String "Cannot inflate media view for image">
	//   11   21:invokestatic    #174 <Method void o.e(String, String)>
			return;
	//   12   24:return          
		} else
		{
			ImageView imageview = (ImageView)view.findViewById(0x7f090299);
	//   13   25:aload_2         
	//   14   26:ldc1            #203 <Int 0x7f090299>
	//   15   28:invokevirtual   #181 <Method View View.findViewById(int)>
	//   16   31:checkcast       #205 <Class ImageView>
	//   17   34:astore_3        
			imageview.setVisibility(8);
	//   18   35:aload_3         
	//   19   36:bipush          8
	//   20   38:invokevirtual   #209 <Method void ImageView.setVisibility(int)>
			ProgressBar progressbar = (ProgressBar)view.findViewById(0x7f090224);
	//   21   41:aload_2         
	//   22   42:ldc1            #210 <Int 0x7f090224>
	//   23   44:invokevirtual   #181 <Method View View.findViewById(int)>
	//   24   47:checkcast       #212 <Class ProgressBar>
	//   25   50:astore          4
			progressbar.setVisibility(0);
	//   26   52:aload           4
	//   27   54:iconst_0        
	//   28   55:invokevirtual   #213 <Method void ProgressBar.setVisibility(int)>
			(new a(s, imageview, progressbar)).execute(((Object []) (new String[0])));
	//   29   58:new             #12  <Class NotificationDetailsActivity$a>
	//   30   61:dup             
	//   31   62:aload_0         
	//   32   63:aload_1         
	//   33   64:aload_3         
	//   34   65:aload           4
	//   35   67:invokespecial   #216 <Method void NotificationDetailsActivity$a(NotificationDetailsActivity, String, ImageView, ProgressBar)>
	//   36   70:iconst_0        
	//   37   71:anewarray       String[]
	//   38   74:invokevirtual   #222 <Method AsyncTask NotificationDetailsActivity$a.execute(Object[])>
	//   39   77:pop             
			a.addView(view);
	//   40   78:aload_0         
	//   41   79:getfield        #189 <Field LinearLayout a>
	//   42   82:aload_2         
	//   43   83:invokevirtual   #195 <Method void LinearLayout.addView(View)>
			return;
	//   44   86:return          
		}
	}

	private void f(String s)
	{
		View view = getLayoutInflater().inflate(0x7f0b00f6, ((android.view.ViewGroup) (null)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #160 <Method LayoutInflater getLayoutInflater()>
	//    2    4:ldc1            #200 <Int 0x7f0b00f6>
	//    3    6:aconst_null     
	//    4    7:invokevirtual   #167 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//    5   10:astore_2        
		if(view == null)
	//*   6   11:aload_2         
	//*   7   12:ifnonnull       25
		{
			com.irobot.home.util.o.e(v, "Cannot inflate media view for image");
	//    8   15:aload_0         
	//    9   16:getfield        #68  <Field String v>
	//   10   19:ldc1            #202 <String "Cannot inflate media view for image">
	//   11   21:invokestatic    #174 <Method void o.e(String, String)>
			return;
	//   12   24:return          
		}
		ImageView imageview = (ImageView)view.findViewById(0x7f090299);
	//   13   25:aload_2         
	//   14   26:ldc1            #203 <Int 0x7f090299>
	//   15   28:invokevirtual   #181 <Method View View.findViewById(int)>
	//   16   31:checkcast       #205 <Class ImageView>
	//   17   34:astore_3        
		ProgressBar progressbar = (ProgressBar)view.findViewById(0x7f090224);
	//   18   35:aload_2         
	//   19   36:ldc1            #210 <Int 0x7f090224>
	//   20   38:invokevirtual   #181 <Method View View.findViewById(int)>
	//   21   41:checkcast       #212 <Class ProgressBar>
	//   22   44:astore          4
		s = ((String) (a(s, imageview.getMaxWidth(), imageview.getMaxWidth())));
	//   23   46:aload_0         
	//   24   47:aload_1         
	//   25   48:aload_3         
	//   26   49:invokevirtual   #226 <Method int ImageView.getMaxWidth()>
	//   27   52:aload_3         
	//   28   53:invokevirtual   #226 <Method int ImageView.getMaxWidth()>
	//   29   56:invokespecial   #228 <Method Bitmap a(String, int, int)>
	//   30   59:astore_1        
		if(s != null)
	//*  31   60:aload_1         
	//*  32   61:ifnull          84
		{
			imageview.setImageBitmap(((Bitmap) (s)));
	//   33   64:aload_3         
	//   34   65:aload_1         
	//   35   66:invokevirtual   #232 <Method void ImageView.setImageBitmap(Bitmap)>
			progressbar.setVisibility(8);
	//   36   69:aload           4
	//   37   71:bipush          8
	//   38   73:invokevirtual   #213 <Method void ProgressBar.setVisibility(int)>
			a.addView(view);
	//   39   76:aload_0         
	//   40   77:getfield        #189 <Field LinearLayout a>
	//   41   80:aload_2         
	//   42   81:invokevirtual   #195 <Method void LinearLayout.addView(View)>
		}
	//   43   84:return          
	}

	private void g(String s)
	{
		View view = getLayoutInflater().inflate(0x7f0b00fa, ((android.view.ViewGroup) (null)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #160 <Method LayoutInflater getLayoutInflater()>
	//    2    4:ldc1            #233 <Int 0x7f0b00fa>
	//    3    6:aconst_null     
	//    4    7:invokevirtual   #167 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//    5   10:astore_2        
		if(view == null)
	//*   6   11:aload_2         
	//*   7   12:ifnonnull       25
		{
			com.irobot.home.util.o.e(v, "Cannot inflate webViewGroup");
	//    8   15:aload_0         
	//    9   16:getfield        #68  <Field String v>
	//   10   19:ldc1            #235 <String "Cannot inflate webViewGroup">
	//   11   21:invokestatic    #174 <Method void o.e(String, String)>
			return;
	//   12   24:return          
		}
		WebView webview = (WebView)view.findViewById(0x7f090492);
	//   13   25:aload_2         
	//   14   26:ldc1            #236 <Int 0x7f090492>
	//   15   28:invokevirtual   #181 <Method View View.findViewById(int)>
	//   16   31:checkcast       #238 <Class WebView>
	//   17   34:astore_3        
		if(webview == null)
	//*  18   35:aload_3         
	//*  19   36:ifnonnull       49
		{
			com.irobot.home.util.o.e(v, "Cannot inflate web thumbnails");
	//   20   39:aload_0         
	//   21   40:getfield        #68  <Field String v>
	//   22   43:ldc1            #240 <String "Cannot inflate web thumbnails">
	//   23   45:invokestatic    #174 <Method void o.e(String, String)>
			return;
	//   24   48:return          
		} else
		{
			webview.getSettings().setPluginState(android.webkit.WebSettings.PluginState.ON);
	//   25   49:aload_3         
	//   26   50:invokevirtual   #244 <Method WebSettings WebView.getSettings()>
	//   27   53:getstatic       #250 <Field android.webkit.WebSettings$PluginState android.webkit.WebSettings$PluginState.ON>
	//   28   56:invokevirtual   #256 <Method void WebSettings.setPluginState(android.webkit.WebSettings$PluginState)>
			webview.setWebChromeClient(new WebChromeClient());
	//   29   59:aload_3         
	//   30   60:new             #258 <Class WebChromeClient>
	//   31   63:dup             
	//   32   64:invokespecial   #259 <Method void WebChromeClient()>
	//   33   67:invokevirtual   #263 <Method void WebView.setWebChromeClient(WebChromeClient)>
			webview.setInitialScale(1);
	//   34   70:aload_3         
	//   35   71:iconst_1        
	//   36   72:invokevirtual   #266 <Method void WebView.setInitialScale(int)>
			webview.getSettings().setAppCacheEnabled(true);
	//   37   75:aload_3         
	//   38   76:invokevirtual   #244 <Method WebSettings WebView.getSettings()>
	//   39   79:iconst_1        
	//   40   80:invokevirtual   #270 <Method void WebSettings.setAppCacheEnabled(boolean)>
			webview.getSettings().setLoadWithOverviewMode(true);
	//   41   83:aload_3         
	//   42   84:invokevirtual   #244 <Method WebSettings WebView.getSettings()>
	//   43   87:iconst_1        
	//   44   88:invokevirtual   #273 <Method void WebSettings.setLoadWithOverviewMode(boolean)>
			webview.getSettings().setUseWideViewPort(true);
	//   45   91:aload_3         
	//   46   92:invokevirtual   #244 <Method WebSettings WebView.getSettings()>
	//   47   95:iconst_1        
	//   48   96:invokevirtual   #276 <Method void WebSettings.setUseWideViewPort(boolean)>
			webview.getSettings().setLoadsImagesAutomatically(true);
	//   49   99:aload_3         
	//   50  100:invokevirtual   #244 <Method WebSettings WebView.getSettings()>
	//   51  103:iconst_1        
	//   52  104:invokevirtual   #279 <Method void WebSettings.setLoadsImagesAutomatically(boolean)>
			webview.getSettings().setSupportZoom(false);
	//   53  107:aload_3         
	//   54  108:invokevirtual   #244 <Method WebSettings WebView.getSettings()>
	//   55  111:iconst_0        
	//   56  112:invokevirtual   #282 <Method void WebSettings.setSupportZoom(boolean)>
			webview.getSettings().setJavaScriptEnabled(true);
	//   57  115:aload_3         
	//   58  116:invokevirtual   #244 <Method WebSettings WebView.getSettings()>
	//   59  119:iconst_1        
	//   60  120:invokevirtual   #285 <Method void WebSettings.setJavaScriptEnabled(boolean)>
			view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.LinearLayout.LayoutParams(-1, -1))));
	//   61  123:aload_2         
	//   62  124:new             #287 <Class android.widget.LinearLayout$LayoutParams>
	//   63  127:dup             
	//   64  128:iconst_m1       
	//   65  129:iconst_m1       
	//   66  130:invokespecial   #290 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//   67  133:invokevirtual   #294 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			webview.loadDataWithBaseURL(((String) (null)), s, "text/html", "UTF-8", "");
	//   68  136:aload_3         
	//   69  137:aconst_null     
	//   70  138:aload_1         
	//   71  139:ldc2            #296 <String "text/html">
	//   72  142:ldc2            #298 <String "UTF-8">
	//   73  145:ldc1            #70  <String "">
	//   74  147:invokevirtual   #302 <Method void WebView.loadDataWithBaseURL(String, String, String, String, String)>
			a.addView(view);
	//   75  150:aload_0         
	//   76  151:getfield        #189 <Field LinearLayout a>
	//   77  154:aload_2         
	//   78  155:invokevirtual   #195 <Method void LinearLayout.addView(View)>
			return;
	//   79  158:return          
		}
	}

	private void h(String s)
	{
		s = ((String) (getLayoutInflater().inflate(0x7f0b00f6, ((android.view.ViewGroup) (null)))));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #160 <Method LayoutInflater getLayoutInflater()>
	//    2    4:ldc1            #200 <Int 0x7f0b00f6>
	//    3    6:aconst_null     
	//    4    7:invokevirtual   #167 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//    5   10:astore_1        
		if(s == null)
	//*   6   11:aload_1         
	//*   7   12:ifnonnull       25
		{
			com.irobot.home.util.o.e(v, "Cannot inflate media view for image");
	//    8   15:aload_0         
	//    9   16:getfield        #68  <Field String v>
	//   10   19:ldc1            #202 <String "Cannot inflate media view for image">
	//   11   21:invokestatic    #174 <Method void o.e(String, String)>
			return;
	//   12   24:return          
		} else
		{
			((ProgressBar)((View) (s)).findViewById(0x7f090224)).setVisibility(8);
	//   13   25:aload_1         
	//   14   26:ldc1            #210 <Int 0x7f090224>
	//   15   28:invokevirtual   #181 <Method View View.findViewById(int)>
	//   16   31:checkcast       #212 <Class ProgressBar>
	//   17   34:bipush          8
	//   18   36:invokevirtual   #213 <Method void ProgressBar.setVisibility(int)>
			((ImageView)((View) (s)).findViewById(0x7f090299)).setVisibility(0);
	//   19   39:aload_1         
	//   20   40:ldc1            #203 <Int 0x7f090299>
	//   21   42:invokevirtual   #181 <Method View View.findViewById(int)>
	//   22   45:checkcast       #205 <Class ImageView>
	//   23   48:iconst_0        
	//   24   49:invokevirtual   #209 <Method void ImageView.setVisibility(int)>
			return;
	//   25   52:return          
		}
	}

	private void i(String s)
	{
		View view = getLayoutInflater().inflate(0x7f0b00f9, ((android.view.ViewGroup) (null)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #160 <Method LayoutInflater getLayoutInflater()>
	//    2    4:ldc2            #306 <Int 0x7f0b00f9>
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #167 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//    5   11:astore_2        
		if(view == null)
	//*   6   12:aload_2         
	//*   7   13:ifnonnull       27
		{
			com.irobot.home.util.o.e(v, "Cannot inflate media view for video");
	//    8   16:aload_0         
	//    9   17:getfield        #68  <Field String v>
	//   10   20:ldc2            #308 <String "Cannot inflate media view for video">
	//   11   23:invokestatic    #174 <Method void o.e(String, String)>
			return;
	//   12   26:return          
		} else
		{
			WebView webview = (WebView)view.findViewById(0x7f090487);
	//   13   27:aload_2         
	//   14   28:ldc2            #309 <Int 0x7f090487>
	//   15   31:invokevirtual   #181 <Method View View.findViewById(int)>
	//   16   34:checkcast       #238 <Class WebView>
	//   17   37:astore_3        
			com.irobot.home.util.j.a(webview, s);
	//   18   38:aload_3         
	//   19   39:aload_1         
	//   20   40:invokestatic    #312 <Method void j.a(WebView, String)>
			webview.setOnTouchListener(new android.view.View.OnTouchListener(view) {

				public boolean onTouch(View view1, MotionEvent motionevent)
				{
					if(motionevent.getAction() == 0 && com.irobot.home.NotificationDetailsActivity.a(b))
				//*   0    0:aload_2         
				//*   1    1:invokevirtual   #33  <Method int MotionEvent.getAction()>
				//*   2    4:ifne            34
				//*   3    7:aload_0         
				//*   4    8:getfield        #19  <Field NotificationDetailsActivity b>
				//*   5   11:invokestatic    #36  <Method boolean com.irobot.home.NotificationDetailsActivity.a(NotificationDetailsActivity)>
				//*   6   14:ifeq            34
					{
						a.performClick();
				//    7   17:aload_0         
				//    8   18:getfield        #21  <Field View a>
				//    9   21:invokevirtual   #42  <Method boolean View.performClick()>
				//   10   24:pop             
						com.irobot.home.NotificationDetailsActivity.a(b, false);
				//   11   25:aload_0         
				//   12   26:getfield        #19  <Field NotificationDetailsActivity b>
				//   13   29:iconst_0        
				//   14   30:invokestatic    #45  <Method boolean com.irobot.home.NotificationDetailsActivity.a(NotificationDetailsActivity, boolean)>
				//   15   33:pop             
					}
					return true;
				//   16   34:iconst_1        
				//   17   35:ireturn         
				}

				final View a;
				final NotificationDetailsActivity b;

			
			{
				b = NotificationDetailsActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field NotificationDetailsActivity b>
				a = view;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field View a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   21   43:aload_3         
	//   22   44:new             #6   <Class NotificationDetailsActivity$1>
	//   23   47:dup             
	//   24   48:aload_0         
	//   25   49:aload_2         
	//   26   50:invokespecial   #315 <Method void NotificationDetailsActivity$1(NotificationDetailsActivity, View)>
	//   27   53:invokevirtual   #319 <Method void WebView.setOnTouchListener(android.view.View$OnTouchListener)>
			view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.LinearLayout.LayoutParams(-1, (int)getResources().getDimension(0x7f07012f)))));
	//   28   56:aload_2         
	//   29   57:new             #287 <Class android.widget.LinearLayout$LayoutParams>
	//   30   60:dup             
	//   31   61:iconst_m1       
	//   32   62:aload_0         
	//   33   63:invokevirtual   #323 <Method Resources getResources()>
	//   34   66:ldc2            #324 <Int 0x7f07012f>
	//   35   69:invokevirtual   #330 <Method float Resources.getDimension(int)>
	//   36   72:f2i             
	//   37   73:invokespecial   #290 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//   38   76:invokevirtual   #294 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			view.setOnClickListener(new android.view.View.OnClickListener(s) {

				public void onClick(View view1)
				{
					com.irobot.home.CustomVideoWebViewActivity_.a(((android.content.Context) (b))).a(a).a(true).b(b.g).b(b.h).c(b.i).a();
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field NotificationDetailsActivity b>
				//    2    4:invokestatic    #32  <Method CustomVideoWebViewActivity_$a com.irobot.home.CustomVideoWebViewActivity_.a(android.content.Context)>
				//    3    7:aload_0         
				//    4    8:getfield        #21  <Field String a>
				//    5   11:invokevirtual   #37  <Method CustomVideoWebViewActivity_$a com.irobot.home.CustomVideoWebViewActivity_$a.a(String)>
				//    6   14:iconst_1        
				//    7   15:invokevirtual   #40  <Method CustomVideoWebViewActivity_$a com.irobot.home.CustomVideoWebViewActivity_$a.a(boolean)>
				//    8   18:aload_0         
				//    9   19:getfield        #19  <Field NotificationDetailsActivity b>
				//   10   22:getfield        #43  <Field String NotificationDetailsActivity.g>
				//   11   25:invokevirtual   #45  <Method CustomVideoWebViewActivity_$a CustomVideoWebViewActivity_$a.b(String)>
				//   12   28:aload_0         
				//   13   29:getfield        #19  <Field NotificationDetailsActivity b>
				//   14   32:getfield        #49  <Field int NotificationDetailsActivity.h>
				//   15   35:invokevirtual   #52  <Method CustomVideoWebViewActivity_$a CustomVideoWebViewActivity_$a.b(int)>
				//   16   38:aload_0         
				//   17   39:getfield        #19  <Field NotificationDetailsActivity b>
				//   18   42:getfield        #54  <Field int NotificationDetailsActivity.i>
				//   19   45:invokevirtual   #57  <Method CustomVideoWebViewActivity_$a CustomVideoWebViewActivity_$a.c(int)>
				//   20   48:invokevirtual   #60  <Method org.androidannotations.api.a.e com.irobot.home.CustomVideoWebViewActivity_$a.a()>
				//   21   51:pop             
				//   22   52:return          
				}

				final String a;
				final NotificationDetailsActivity b;

			
			{
				b = NotificationDetailsActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field NotificationDetailsActivity b>
				a = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   39   79:aload_2         
	//   40   80:new             #8   <Class NotificationDetailsActivity$2>
	//   41   83:dup             
	//   42   84:aload_0         
	//   43   85:aload_1         
	//   44   86:invokespecial   #333 <Method void NotificationDetailsActivity$2(NotificationDetailsActivity, String)>
	//   45   89:invokevirtual   #337 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
			a.addView(view);
	//   46   92:aload_0         
	//   47   93:getfield        #189 <Field LinearLayout a>
	//   48   96:aload_2         
	//   49   97:invokevirtual   #195 <Method void LinearLayout.addView(View)>
			return;
	//   50  100:return          
		}
	}

	private void j()
	{
		m.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #340 <Field CustomTextView m>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #341 <Method void CustomTextView.setVisibility(int)>
		u.setVisibility(8);
	//    4    8:aload_0         
	//    5    9:getfield        #343 <Field LinearLayout u>
	//    6   12:bipush          8
	//    7   14:invokevirtual   #344 <Method void LinearLayout.setVisibility(int)>
	//    8   17:return          
	}

	private void j(String s)
	{
		s = ((String) (getLayoutInflater().inflate(0x7f0b00f9, ((android.view.ViewGroup) (null)))));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #160 <Method LayoutInflater getLayoutInflater()>
	//    2    4:ldc2            #306 <Int 0x7f0b00f9>
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #167 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//    5   11:astore_1        
		if(s == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       27
		{
			com.irobot.home.util.o.e(v, "Cannot inflate media view for video");
	//    8   16:aload_0         
	//    9   17:getfield        #68  <Field String v>
	//   10   20:ldc2            #308 <String "Cannot inflate media view for video">
	//   11   23:invokestatic    #174 <Method void o.e(String, String)>
			return;
	//   12   26:return          
		} else
		{
			((View) (s)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.LinearLayout.LayoutParams(-1, (int)getResources().getDimension(0x7f07012f)))));
	//   13   27:aload_1         
	//   14   28:new             #287 <Class android.widget.LinearLayout$LayoutParams>
	//   15   31:dup             
	//   16   32:iconst_m1       
	//   17   33:aload_0         
	//   18   34:invokevirtual   #323 <Method Resources getResources()>
	//   19   37:ldc2            #324 <Int 0x7f07012f>
	//   20   40:invokevirtual   #330 <Method float Resources.getDimension(int)>
	//   21   43:f2i             
	//   22   44:invokespecial   #290 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//   23   47:invokevirtual   #294 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			((View) (s)).setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
				//    0    0:return          
				}

				final NotificationDetailsActivity a;

			
			{
				a = NotificationDetailsActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field NotificationDetailsActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   24   50:aload_1         
	//   25   51:new             #10  <Class NotificationDetailsActivity$3>
	//   26   54:dup             
	//   27   55:aload_0         
	//   28   56:invokespecial   #347 <Method void NotificationDetailsActivity$3(NotificationDetailsActivity)>
	//   29   59:invokevirtual   #337 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
			a.addView(((View) (s)));
	//   30   62:aload_0         
	//   31   63:getfield        #189 <Field LinearLayout a>
	//   32   66:aload_1         
	//   33   67:invokevirtual   #195 <Method void LinearLayout.addView(View)>
			return;
	//   34   70:return          
		}
	}

	protected InputStream a(String s)
	{
		s = ((String) ((new URL(s)).openConnection()));
	//    0    0:new             #352 <Class URL>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #354 <Method void URL(String)>
	//    4    8:invokevirtual   #358 <Method java.net.URLConnection URL.openConnection()>
	//    5   11:astore_1        
		s = ((String) ((HttpURLConnection)s));
	//    6   12:aload_1         
	//    7   13:checkcast       #360 <Class HttpURLConnection>
	//    8   16:astore_1        
		((HttpURLConnection) (s)).setRequestMethod("GET");
	//    9   17:aload_1         
	//   10   18:ldc2            #362 <String "GET">
	//   11   21:invokevirtual   #365 <Method void HttpURLConnection.setRequestMethod(String)>
		((HttpURLConnection) (s)).connect();
	//   12   24:aload_1         
	//   13   25:invokevirtual   #368 <Method void HttpURLConnection.connect()>
		if(((HttpURLConnection) (s)).getResponseCode() != 200)
			break MISSING_BLOCK_LABEL_50;
	//   14   28:aload_1         
	//   15   29:invokevirtual   #371 <Method int HttpURLConnection.getResponseCode()>
	//   16   32:sipush          200
	//   17   35:icmpne          50
		s = ((String) (((HttpURLConnection) (s)).getInputStream()));
	//   18   38:aload_1         
	//   19   39:invokevirtual   #375 <Method InputStream HttpURLConnection.getInputStream()>
	//   20   42:astore_1        
		return ((InputStream) (s));
	//   21   43:aload_1         
	//   22   44:areturn         
		s;
	//   23   45:astore_1        
		((Exception) (s)).printStackTrace();
	//   24   46:aload_1         
	//   25   47:invokevirtual   #378 <Method void Exception.printStackTrace()>
		return null;
	//   26   50:aconst_null     
	//   27   51:areturn         
	}

	public void a(boolean flag)
	{
		if(com.irobot.home.util.j.j() == null)
	//*   0    0:invokestatic    #381 <Method a j.j()>
	//*   1    3:ifnonnull       17
		{
			com.irobot.home.util.o.e(v, "Unexpected empty asset on notification feedback!");
	//    2    6:aload_0         
	//    3    7:getfield        #68  <Field String v>
	//    4   10:ldc2            #383 <String "Unexpected empty asset on notification feedback!">
	//    5   13:invokestatic    #174 <Method void o.e(String, String)>
			return;
	//    6   16:return          
		} else
		{
			com.irobot.core.AssetInfo assetinfo = com.irobot.home.util.j.j().a();
	//    7   17:invokestatic    #381 <Method a j.j()>
	//    8   20:invokevirtual   #388 <Method com.irobot.core.AssetInfo a.a()>
	//    9   23:astore_2        
			AnalyticsSubsystem.getInstance().trackNotificationFeedback(assetinfo, flag, g, h, i);
	//   10   24:invokestatic    #394 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   11   27:aload_2         
	//   12   28:iload_1         
	//   13   29:aload_0         
	//   14   30:getfield        #78  <Field String g>
	//   15   33:aload_0         
	//   16   34:getfield        #396 <Field int h>
	//   17   37:aload_0         
	//   18   38:getfield        #398 <Field int i>
	//   19   41:invokevirtual   #402 <Method void AnalyticsSubsystem.trackNotificationFeedback(com.irobot.core.AssetInfo, boolean, String, int, int)>
			return;
	//   20   44:return          
		}
	}

	public void e()
	{
		if(c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field String c>
	//*   2    4:ifnull          33
		{
			k.setText(((CharSequence) (c)));
	//    3    7:aload_0         
	//    4    8:getfield        #404 <Field CustomTextView k>
	//    5   11:aload_0         
	//    6   12:getfield        #72  <Field String c>
	//    7   15:invokevirtual   #187 <Method void CustomTextView.setText(CharSequence)>
			n.setImageDrawable(com.irobot.home.util.j.c(((android.content.Context) (this)), d));
	//    8   18:aload_0         
	//    9   19:getfield        #406 <Field ImageView n>
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #74  <Field String d>
	//   13   27:invokestatic    #409 <Method android.graphics.drawable.Drawable j.c(android.content.Context, String)>
	//   14   30:invokevirtual   #413 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
		}
		if(e != null)
	//*  15   33:aload_0         
	//*  16   34:getfield        #76  <Field String e>
	//*  17   37:ifnull          48
			b(e);
	//   18   40:aload_0         
	//   19   41:aload_0         
	//   20   42:getfield        #76  <Field String e>
	//   21   45:invokespecial   #415 <Method void b(String)>
		if(f != 0L)
	//*  22   48:aload_0         
	//*  23   49:getfield        #417 <Field long f>
	//*  24   52:lconst_0        
	//*  25   53:lcmp            
	//*  26   54:ifeq            79
		{
			l.setText(((CharSequence) (com.irobot.home.util.j.a(f))));
	//   27   57:aload_0         
	//   28   58:getfield        #419 <Field CustomTextView l>
	//   29   61:aload_0         
	//   30   62:getfield        #417 <Field long f>
	//   31   65:invokestatic    #422 <Method String j.a(long)>
	//   32   68:invokevirtual   #187 <Method void CustomTextView.setText(CharSequence)>
			l.setVisibility(0);
	//   33   71:aload_0         
	//   34   72:getfield        #419 <Field CustomTextView l>
	//   35   75:iconst_0        
	//   36   76:invokevirtual   #341 <Method void CustomTextView.setVisibility(int)>
		}
		if(j != null)
	//*  37   79:aload_0         
	//*  38   80:getfield        #424 <Field ArrayList j>
	//*  39   83:ifnull          566
		{
			Iterator iterator = j.iterator();
	//   40   86:aload_0         
	//   41   87:getfield        #424 <Field ArrayList j>
	//   42   90:invokevirtual   #430 <Method Iterator ArrayList.iterator()>
	//   43   93:astore          4
			do
			{
				if(!iterator.hasNext())
					break;
	//   44   95:aload           4
	//   45   97:invokeinterface #436 <Method boolean Iterator.hasNext()>
	//   46  102:ifeq            566
				Object obj = ((Object) ((java.util.Map.Entry)((HashMap)iterator.next()).entrySet().iterator().next()));
	//   47  105:aload           4
	//   48  107:invokeinterface #440 <Method Object Iterator.next()>
	//   49  112:checkcast       #442 <Class HashMap>
	//   50  115:invokevirtual   #446 <Method Set HashMap.entrySet()>
	//   51  118:invokeinterface #449 <Method Iterator Set.iterator()>
	//   52  123:invokeinterface #440 <Method Object Iterator.next()>
	//   53  128:checkcast       #451 <Class java.util.Map$Entry>
	//   54  131:astore_2        
				String s = (String)((java.util.Map.Entry) (obj)).getKey();
	//   55  132:aload_2         
	//   56  133:invokeinterface #454 <Method Object java.util.Map$Entry.getKey()>
	//   57  138:checkcast       #218 <Class String>
	//   58  141:astore          5
				Object obj1 = ((Object) ((String)((java.util.Map.Entry) (obj)).getValue()));
	//   59  143:aload_2         
	//   60  144:invokeinterface #457 <Method Object java.util.Map$Entry.getValue()>
	//   61  149:checkcast       #218 <Class String>
	//   62  152:astore_3        
				byte byte0 = -1;
	//   63  153:iconst_m1       
	//   64  154:istore_1        
				switch(s.hashCode())
	//*  65  155:aload           5
	//*  66  157:invokevirtual   #460 <Method int String.hashCode()>
				{
				default:
					break;

	//*  67  160:lookupswitch    10: default 252
	//	               -1257141079: 394
	//	               -877823861: 378
	//	               -859601281: 362
	//	               3213227: 346
	//	               100313435: 330
	//	               264552097: 315
	//	               826716553: 300
	//	               831827251: 285
	//	               1151387487: 270
	//	               1333285803: 255
	//*  68  252:goto            406
				case 1333285803: 
					if(s.equals("video_url"))
	//*  69  255:aload           5
	//*  70  257:ldc1            #88  <String "video_url">
	//*  71  259:invokevirtual   #464 <Method boolean String.equals(Object)>
	//*  72  262:ifeq            406
						byte0 = 3;
	//   73  265:iconst_3        
	//   74  266:istore_1        
					break;
	//   75  267:goto            406

				case 1151387487: 
					if(s.equals("video_id"))
	//*  76  270:aload           5
	//*  77  272:ldc1            #92  <String "video_id">
	//*  78  274:invokevirtual   #464 <Method boolean String.equals(Object)>
	//*  79  277:ifeq            406
						byte0 = 4;
	//   80  280:iconst_4        
	//   81  281:istore_1        
					break;
	//   82  282:goto            406

				case 831827251: 
					if(s.equals("content_text"))
	//*  83  285:aload           5
	//*  84  287:ldc1            #80  <String "content_text">
	//*  85  289:invokevirtual   #464 <Method boolean String.equals(Object)>
	//*  86  292:ifeq            406
						byte0 = 0;
	//   87  295:iconst_0        
	//   88  296:istore_1        
					break;
	//   89  297:goto            406

				case 826716553: 
					if(s.equals("internal_image_url"))
	//*  90  300:aload           5
	//*  91  302:ldc1            #104 <String "internal_image_url">
	//*  92  304:invokevirtual   #464 <Method boolean String.equals(Object)>
	//*  93  307:ifeq            406
						byte0 = 5;
	//   94  310:iconst_5        
	//   95  311:istore_1        
					break;
	//   96  312:goto            406

				case 264552097: 
					if(s.equals("content_id"))
	//*  97  315:aload           5
	//*  98  317:ldc1            #84  <String "content_id">
	//*  99  319:invokevirtual   #464 <Method boolean String.equals(Object)>
	//* 100  322:ifeq            406
						byte0 = 1;
	//  101  325:iconst_1        
	//  102  326:istore_1        
					break;
	//  103  327:goto            406

				case 100313435: 
					if(s.equals("image"))
	//* 104  330:aload           5
	//* 105  332:ldc1            #100 <String "image">
	//* 106  334:invokevirtual   #464 <Method boolean String.equals(Object)>
	//* 107  337:ifeq            406
						byte0 = 8;
	//  108  340:bipush          8
	//  109  342:istore_1        
					break;
	//  110  343:goto            406

				case 3213227: 
					if(s.equals("html"))
	//* 111  346:aload           5
	//* 112  348:ldc1            #116 <String "html">
	//* 113  350:invokevirtual   #464 <Method boolean String.equals(Object)>
	//* 114  353:ifeq            406
						byte0 = 9;
	//  115  356:bipush          9
	//  116  358:istore_1        
					break;
	//  117  359:goto            406

				case -859601281: 
					if(s.equals("image_id"))
	//* 118  362:aload           5
	//* 119  364:ldc1            #112 <String "image_id">
	//* 120  366:invokevirtual   #464 <Method boolean String.equals(Object)>
	//* 121  369:ifeq            406
						byte0 = 7;
	//  122  372:bipush          7
	//  123  374:istore_1        
					break;
	//  124  375:goto            406

				case -877823861: 
					if(s.equals("image_url"))
	//* 125  378:aload           5
	//* 126  380:ldc1            #108 <String "image_url">
	//* 127  382:invokevirtual   #464 <Method boolean String.equals(Object)>
	//* 128  385:ifeq            406
						byte0 = 6;
	//  129  388:bipush          6
	//  130  390:istore_1        
					break;
	//  131  391:goto            406

				case -1257141079: 
					if(s.equals("internal_video_url"))
	//* 132  394:aload           5
	//* 133  396:ldc1            #96  <String "internal_video_url">
	//* 134  398:invokevirtual   #464 <Method boolean String.equals(Object)>
	//* 135  401:ifeq            406
						byte0 = 2;
	//  136  404:iconst_2        
	//  137  405:istore_1        
					break;
				}
				obj = obj1;
	//  138  406:aload_3         
	//  139  407:astore_2        
				switch(byte0)
	//* 140  408:iload_1         
				{
	//* 141  409:tableswitch     0 9: default 464
	//	               0 558
	//	               1 551
	//	               2 543
	//	               3 543
	//	               4 535
	//	               5 527
	//	               6 527
	//	               7 519
	//	               8 511
	//	               9 503
				default:
					obj = ((Object) (v));
	//  142  464:aload_0         
	//  143  465:getfield        #68  <Field String v>
	//  144  468:astore_2        
					obj1 = ((Object) (new StringBuilder()));
	//  145  469:new             #466 <Class StringBuilder>
	//  146  472:dup             
	//  147  473:invokespecial   #467 <Method void StringBuilder()>
	//  148  476:astore_3        
					((StringBuilder) (obj1)).append("Unexpected payload key type of ");
	//  149  477:aload_3         
	//  150  478:ldc2            #469 <String "Unexpected payload key type of ">
	//  151  481:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//  152  484:pop             
					((StringBuilder) (obj1)).append(s);
	//  153  485:aload_3         
	//  154  486:aload           5
	//  155  488:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//  156  491:pop             
					com.irobot.home.util.o.e(((String) (obj)), ((StringBuilder) (obj1)).toString());
	//  157  492:aload_2         
	//  158  493:aload_3         
	//  159  494:invokevirtual   #476 <Method String StringBuilder.toString()>
	//  160  497:invokestatic    #174 <Method void o.e(String, String)>
					break;

	//* 161  500:goto            95
				case 9: // '\t'
					g(((String) (obj1)));
	//  162  503:aload_0         
	//  163  504:aload_3         
	//  164  505:invokespecial   #478 <Method void g(String)>
					break;

	//* 165  508:goto            95
				case 8: // '\b'
					f(((String) (obj1)));
	//  166  511:aload_0         
	//  167  512:aload_3         
	//  168  513:invokespecial   #480 <Method void f(String)>
					break;

	//* 169  516:goto            95
				case 7: // '\007'
					h(((String) (obj1)));
	//  170  519:aload_0         
	//  171  520:aload_3         
	//  172  521:invokespecial   #482 <Method void h(String)>
					break;

	//* 173  524:goto            95
				case 5: // '\005'
				case 6: // '\006'
					d(((String) (obj1)));
	//  174  527:aload_0         
	//  175  528:aload_3         
	//  176  529:invokespecial   #484 <Method void d(String)>
					break;

	//* 177  532:goto            95
				case 4: // '\004'
					j(((String) (obj1)));
	//  178  535:aload_0         
	//  179  536:aload_3         
	//  180  537:invokespecial   #486 <Method void j(String)>
					break;

	//* 181  540:goto            95
				case 2: // '\002'
				case 3: // '\003'
					i(((String) (obj1)));
	//  182  543:aload_0         
	//  183  544:aload_3         
	//  184  545:invokespecial   #488 <Method void i(String)>
					break;

	//* 185  548:goto            95
				case 1: // '\001'
					obj = ((Object) (com.irobot.home.util.j.a(((android.content.Context) (this)), ((String) (obj1)), ((ArrayList) (null)))));
	//  186  551:aload_0         
	//  187  552:aload_3         
	//  188  553:aconst_null     
	//  189  554:invokestatic    #491 <Method String j.a(android.content.Context, String, ArrayList)>
	//  190  557:astore_2        
					// fall through

				case 0: // '\0'
					c(((String) (obj)));
	//  191  558:aload_0         
	//  192  559:aload_2         
	//  193  560:invokespecial   #493 <Method void c(String)>
					break;
				}
			} while(true);
	//  194  563:goto            95
		}
	//  195  566:return          
	}

	public void f()
	{
		onBackPressed();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #496 <Method void onBackPressed()>
	//    2    4:return          
	}

	public void g()
	{
		if(com.irobot.home.util.j.j() == null)
	//*   0    0:invokestatic    #381 <Method a j.j()>
	//*   1    3:ifnonnull       17
		{
			com.irobot.home.util.o.e(v, "Unexpected empty asset on notification on-back-selected!");
	//    2    6:aload_0         
	//    3    7:getfield        #68  <Field String v>
	//    4   10:ldc2            #498 <String "Unexpected empty asset on notification on-back-selected!">
	//    5   13:invokestatic    #174 <Method void o.e(String, String)>
			return;
	//    6   16:return          
		} else
		{
			com.irobot.core.AssetInfo assetinfo = com.irobot.home.util.j.j().a();
	//    7   17:invokestatic    #381 <Method a j.j()>
	//    8   20:invokevirtual   #388 <Method com.irobot.core.AssetInfo a.a()>
	//    9   23:astore_1        
			AnalyticsSubsystem.getInstance().trackNotificationBackSelected(assetinfo, g, h, i);
	//   10   24:invokestatic    #394 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   11   27:aload_1         
	//   12   28:aload_0         
	//   13   29:getfield        #78  <Field String g>
	//   14   32:aload_0         
	//   15   33:getfield        #396 <Field int h>
	//   16   36:aload_0         
	//   17   37:getfield        #398 <Field int i>
	//   18   40:invokevirtual   #502 <Method void AnalyticsSubsystem.trackNotificationBackSelected(com.irobot.core.AssetInfo, String, int, int)>
			return;
	//   19   43:return          
		}
	}

	protected void h()
	{
		j();
	//    0    0:aload_0         
	//    1    1:invokespecial   #504 <Method void j()>
		a(true);
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #506 <Method void a(boolean)>
	//    5    9:return          
	}

	protected void i()
	{
		j();
	//    0    0:aload_0         
	//    1    1:invokespecial   #504 <Method void j()>
		a(false);
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #506 <Method void a(boolean)>
	//    5    9:return          
	}

	public void onBackPressed()
	{
		super.onBackPressed();
	//    0    0:aload_0         
	//    1    1:invokespecial   #507 <Method void BaseFragmentActivity.onBackPressed()>
		g();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #509 <Method void g()>
	//    4    8:return          
	}

	protected void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #512 <Method void BaseFragmentActivity.onPause()>
	//    2    4:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #515 <Method void BaseFragmentActivity.onResume()>
		G = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #120 <Field boolean G>
	//    5    9:return          
	}

	private final String A = "internal_video_url";
	private final String B = "image";
	private final String C = "internal_image_url";
	private final String D = "image_url";
	private final String E = "image_id";
	private final String F = "html";
	private boolean G;
	LinearLayout a;
	ImageView b;
	String c;
	String d;
	String e;
	long f;
	String g;
	int h;
	int i;
	ArrayList j;
	CustomTextView k;
	CustomTextView l;
	CustomTextView m;
	ImageView n;
	LinearLayout o;
	LinearLayout t;
	LinearLayout u;
	private final String v = com.irobot.home.util.j.r(((Class) (com/irobot/home/NotificationDetailsActivity)).getSimpleName());
	private final String w = "content_text";
	private final String x = "content_id";
	private final String y = "video_url";
	private final String z = "video_id";
}
