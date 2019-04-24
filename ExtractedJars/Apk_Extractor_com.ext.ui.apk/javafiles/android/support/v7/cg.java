// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import android.content.Context;
import android.content.pm.*;
import android.graphics.*;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.widget.ImageView;
import com.ext.ui.ExtractorApplication;
import java.io.*;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package android.support.v7:
//			ch, cf, bv, ck

public class cg
{
	class a
		implements Runnable
	{

		public void run()
		{
			while(c.a(b) || a == null) 
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field cg c>
		//*   2    4:aload_0         
		//*   3    5:getfield        #25  <Field cg$b b>
		//*   4    8:invokevirtual   #30  <Method boolean cg.a(cg$b)>
		//*   5   11:ifeq            15
				return;
		//    6   14:return          
		//    7   15:aload_0         
		//    8   16:getfield        #23  <Field Bitmap a>
		//    9   19:ifnull          14
			b.b.setImageBitmap(a);
		//   10   22:aload_0         
		//   11   23:getfield        #25  <Field cg$b b>
		//   12   26:getfield        #35  <Field ImageView cg$b.b>
		//   13   29:aload_0         
		//   14   30:getfield        #23  <Field Bitmap a>
		//   15   33:invokevirtual   #41  <Method void ImageView.setImageBitmap(Bitmap)>
		//   16   36:return          
		}

		Bitmap a;
		b b;
		final cg c;

		public a(Bitmap bitmap, b b1)
		{
			c = cg.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field cg c>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
			a = bitmap;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field Bitmap a>
			b = b1;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #25  <Field cg$b b>
		//   11   19:return          
		}
	}

	private class b
	{

		public String a;
		public ImageView b;
		final cg c;

		public b(String s, ImageView imageview)
		{
			c = cg.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field cg c>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void Object()>
			a = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #21  <Field String a>
			b = imageview;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #23  <Field ImageView b>
		//   11   19:return          
		}
	}

	class c
		implements Runnable
	{

		public void run()
		{
			if(b.a(a))
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field cg b>
		//*   2    4:aload_0         
		//*   3    5:getfield        #22  <Field cg$b a>
		//*   4    8:invokevirtual   #29  <Method boolean cg.a(cg$b)>
		//*   5   11:ifeq            15
				return;
		//    6   14:return          
			try
			{
				Object obj = ((Object) (cg.a(b, a.a)));
		//    7   15:aload_0         
		//    8   16:getfield        #17  <Field cg b>
		//    9   19:aload_0         
		//   10   20:getfield        #22  <Field cg$b a>
		//   11   23:getfield        #34  <Field String cg$b.a>
		//   12   26:invokestatic    #37  <Method Bitmap cg.a(cg, String)>
		//   13   29:astore_1        
				b.b.a(a.a, ((Bitmap) (obj)));
		//   14   30:aload_0         
		//   15   31:getfield        #17  <Field cg b>
		//   16   34:getfield        #40  <Field ch cg.b>
		//   17   37:aload_0         
		//   18   38:getfield        #22  <Field cg$b a>
		//   19   41:getfield        #34  <Field String cg$b.a>
		//   20   44:aload_1         
		//   21   45:invokevirtual   #45  <Method void ch.a(String, Bitmap)>
				if(!b.a(a))
		//*  22   48:aload_0         
		//*  23   49:getfield        #17  <Field cg b>
		//*  24   52:aload_0         
		//*  25   53:getfield        #22  <Field cg$b a>
		//*  26   56:invokevirtual   #29  <Method boolean cg.a(cg$b)>
		//*  27   59:ifne            97
				{
					obj = ((Object) (((a) (b)). new a(((Bitmap) (obj)), a)));
		//   28   62:new             #47  <Class cg$a>
		//   29   65:dup             
		//   30   66:aload_0         
		//   31   67:getfield        #17  <Field cg b>
		//   32   70:aload_1         
		//   33   71:aload_0         
		//   34   72:getfield        #22  <Field cg$b a>
		//   35   75:invokespecial   #50  <Method void cg$a(cg, Bitmap, cg$b)>
		//   36   78:astore_1        
					b.e.post(((Runnable) (obj)));
		//   37   79:aload_0         
		//   38   80:getfield        #17  <Field cg b>
		//   39   83:getfield        #54  <Field Handler cg.e>
		//   40   86:aload_1         
		//   41   87:invokevirtual   #60  <Method boolean Handler.post(Runnable)>
		//   42   90:pop             
					return;
		//   43   91:return          
				}
			}
			catch(Throwable throwable)
		//*  44   92:astore_1        
			{
				throwable.printStackTrace();
		//   45   93:aload_1         
		//   46   94:invokevirtual   #63  <Method void Throwable.printStackTrace()>
			}
			return;
		//   47   97:return          
		}

		b a;
		final cg b;

		c(b b1)
		{
			b = cg.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field cg b>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
			a = b1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field cg$b a>
		//    8   14:return          
		}
	}


	public cg()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:ldc1            #30  <Int 0x7f080068>
	//    4    7:putfield        #32  <Field int a>
		b = new ch();
	//    5   10:aload_0         
	//    6   11:new             #34  <Class ch>
	//    7   14:dup             
	//    8   15:invokespecial   #35  <Method void ch()>
	//    9   18:putfield        #37  <Field ch b>
		e = new Handler();
	//   10   21:aload_0         
	//   11   22:new             #39  <Class Handler>
	//   12   25:dup             
	//   13   26:invokespecial   #40  <Method void Handler()>
	//   14   29:putfield        #42  <Field Handler e>
		f = Collections.synchronizedMap(((Map) (new WeakHashMap())));
	//   15   32:aload_0         
	//   16   33:new             #44  <Class WeakHashMap>
	//   17   36:dup             
	//   18   37:invokespecial   #45  <Method void WeakHashMap()>
	//   19   40:invokestatic    #51  <Method Map Collections.synchronizedMap(Map)>
	//   20   43:putfield        #53  <Field Map f>
		c = new cf();
	//   21   46:aload_0         
	//   22   47:new             #55  <Class cf>
	//   23   50:dup             
	//   24   51:invokespecial   #56  <Method void cf()>
	//   25   54:putfield        #58  <Field cf c>
		d = Executors.newFixedThreadPool(5);
	//   26   57:aload_0         
	//   27   58:iconst_5        
	//   28   59:invokestatic    #64  <Method ExecutorService Executors.newFixedThreadPool(int)>
	//   29   62:putfield        #66  <Field ExecutorService d>
	//   30   65:return          
	}

	public static Bitmap a(Drawable drawable)
	{
		if(drawable instanceof BitmapDrawable)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #70  <Class BitmapDrawable>
	//*   2    4:ifeq            15
		{
			return ((BitmapDrawable)drawable).getBitmap();
	//    3    7:aload_0         
	//    4    8:checkcast       #70  <Class BitmapDrawable>
	//    5   11:invokevirtual   #74  <Method Bitmap BitmapDrawable.getBitmap()>
	//    6   14:areturn         
		} else
		{
			Bitmap bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), android.graphics.Bitmap.Config.ARGB_8888);
	//    7   15:aload_0         
	//    8   16:invokevirtual   #80  <Method int Drawable.getIntrinsicWidth()>
	//    9   19:aload_0         
	//   10   20:invokevirtual   #83  <Method int Drawable.getIntrinsicHeight()>
	//   11   23:getstatic       #89  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   12   26:invokestatic    #95  <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   13   29:astore_1        
			Canvas canvas = new Canvas(bitmap);
	//   14   30:new             #97  <Class Canvas>
	//   15   33:dup             
	//   16   34:aload_1         
	//   17   35:invokespecial   #100 <Method void Canvas(Bitmap)>
	//   18   38:astore_2        
			drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
	//   19   39:aload_0         
	//   20   40:iconst_0        
	//   21   41:iconst_0        
	//   22   42:aload_2         
	//   23   43:invokevirtual   #103 <Method int Canvas.getWidth()>
	//   24   46:aload_2         
	//   25   47:invokevirtual   #106 <Method int Canvas.getHeight()>
	//   26   50:invokevirtual   #110 <Method void Drawable.setBounds(int, int, int, int)>
			drawable.draw(canvas);
	//   27   53:aload_0         
	//   28   54:aload_2         
	//   29   55:invokevirtual   #114 <Method void Drawable.draw(Canvas)>
			return bitmap;
	//   30   58:aload_1         
	//   31   59:areturn         
		}
	}

	static Bitmap a(cg cg1, String s)
	{
		return cg1.a(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #118 <Method Bitmap a(String)>
	//    3    5:areturn         
	}

	private Bitmap a(File file)
	{
		int i = 1;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		int j;
		int k;
		android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
	//    2    2:new             #125 <Class android.graphics.BitmapFactory$Options>
	//    3    5:dup             
	//    4    6:invokespecial   #126 <Method void android.graphics.BitmapFactory$Options()>
	//    5    9:astore          5
		options.inJustDecodeBounds = true;
	//    6   11:aload           5
	//    7   13:iconst_1        
	//    8   14:putfield        #130 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
		FileInputStream fileinputstream = new FileInputStream(file);
	//    9   17:new             #132 <Class FileInputStream>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:invokespecial   #135 <Method void FileInputStream(File)>
	//   13   25:astore          6
		BitmapFactory.decodeStream(((java.io.InputStream) (fileinputstream)), ((android.graphics.Rect) (null)), options);
	//   14   27:aload           6
	//   15   29:aconst_null     
	//   16   30:aload           5
	//   17   32:invokestatic    #141 <Method Bitmap BitmapFactory.decodeStream(java.io.InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options)>
	//   18   35:pop             
		fileinputstream.close();
	//   19   36:aload           6
	//   20   38:invokevirtual   #144 <Method void FileInputStream.close()>
		k = options.outWidth;
	//   21   41:aload           5
	//   22   43:getfield        #147 <Field int android.graphics.BitmapFactory$Options.outWidth>
	//   23   46:istore          4
		j = options.outHeight;
	//   24   48:aload           5
	//   25   50:getfield        #150 <Field int android.graphics.BitmapFactory$Options.outHeight>
	//   26   53:istore_3        
		  goto _L1
	//*  27   54:goto            142
_L3:
		Object obj;
		obj = ((Object) (new android.graphics.BitmapFactory.Options()));
	//   28   57:new             #125 <Class android.graphics.BitmapFactory$Options>
	//   29   60:dup             
	//   30   61:invokespecial   #126 <Method void android.graphics.BitmapFactory$Options()>
	//   31   64:astore          5
		obj.inSampleSize = i;
	//   32   66:aload           5
	//   33   68:iload_2         
	//   34   69:putfield        #153 <Field int android.graphics.BitmapFactory$Options.inSampleSize>
		file = ((File) (new FileInputStream(file)));
	//   35   72:new             #132 <Class FileInputStream>
	//   36   75:dup             
	//   37   76:aload_1         
	//   38   77:invokespecial   #135 <Method void FileInputStream(File)>
	//   39   80:astore_1        
		obj = ((Object) (BitmapFactory.decodeStream(((java.io.InputStream) (file)), ((android.graphics.Rect) (null)), ((android.graphics.BitmapFactory.Options) (obj)))));
	//   40   81:aload_1         
	//   41   82:aconst_null     
	//   42   83:aload           5
	//   43   85:invokestatic    #141 <Method Bitmap BitmapFactory.decodeStream(java.io.InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options)>
	//   44   88:astore          5
		((FileInputStream) (file)).close();
	//   45   90:aload_1         
	//   46   91:invokevirtual   #144 <Method void FileInputStream.close()>
		return ((Bitmap) (obj));
	//   47   94:aload           5
	//   48   96:areturn         
_L4:
		if(k / 2 < 64 || j / 2 < 64)
			break; /* Loop/switch isn't completed */
	//   49   97:iload           4
	//   50   99:iconst_2        
	//   51  100:idiv            
	//   52  101:bipush          64
	//   53  103:icmplt          57
	//   54  106:iload_3         
	//   55  107:iconst_2        
	//   56  108:idiv            
	//   57  109:bipush          64
	//   58  111:icmplt          57
		k /= 2;
	//   59  114:iload           4
	//   60  116:iconst_2        
	//   61  117:idiv            
	//   62  118:istore          4
		j /= 2;
	//   63  120:iload_3         
	//   64  121:iconst_2        
	//   65  122:idiv            
	//   66  123:istore_3        
		i *= 2;
	//   67  124:iload_2         
	//   68  125:iconst_2        
	//   69  126:imul            
	//   70  127:istore_2        
		continue; /* Loop/switch isn't completed */
	//   71  128:goto            142
		file;
	//   72  131:astore_1        
		((IOException) (file)).printStackTrace();
	//   73  132:aload_1         
	//   74  133:invokevirtual   #156 <Method void IOException.printStackTrace()>
_L2:
		return null;
	//   75  136:aconst_null     
	//   76  137:areturn         
		file;
	//   77  138:astore_1        
		if(true) goto _L2; else goto _L1
	//   78  139:goto            136
_L1:
		if(k > 0 && j > 0) goto _L4; else goto _L3
	//   79  142:iload           4
	//   80  144:ifle            57
	//   81  147:iload_3         
	//   82  148:ifgt            97
	//*  83  151:goto            57
	}

	private Bitmap a(String s)
	{
		Bitmap bitmap;
		File file;
		file = c.a(s);
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field cf c>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #163 <Method File cf.a(String)>
	//    4    8:astore          4
		bitmap = a(file);
	//    5   10:aload_0         
	//    6   11:aload           4
	//    7   13:invokespecial   #165 <Method Bitmap a(File)>
	//    8   16:astore_3        
		if(bitmap != null)
	//*   9   17:aload_3         
	//*  10   18:ifnull          23
			return bitmap;
	//   11   21:aload_3         
	//   12   22:areturn         
label0:
		{
			Iterator iterator = g.a().iterator();
	//   13   23:aload_0         
	//   14   24:getfield        #167 <Field bv g>
	//   15   27:invokevirtual   #172 <Method List bv.a()>
	//   16   30:invokeinterface #178 <Method Iterator List.iterator()>
	//   17   35:astore_2        
			ck ck1;
			do
			{
				if(!iterator.hasNext())
					break label0;
	//   18   36:aload_2         
	//   19   37:invokeinterface #184 <Method boolean Iterator.hasNext()>
	//   20   42:ifeq            201
				ck1 = (ck)iterator.next();
	//   21   45:aload_2         
	//   22   46:invokeinterface #188 <Method Object Iterator.next()>
	//   23   51:checkcast       #190 <Class ck>
	//   24   54:astore          5
			} while(!ck1.e().equals(((Object) (s))));
	//   25   56:aload           5
	//   26   58:invokevirtual   #193 <Method String ck.e()>
	//   27   61:aload_1         
	//   28   62:invokevirtual   #199 <Method boolean String.equals(Object)>
	//   29   65:ifeq            36
			bitmap = a(ExtractorApplication.a.getPackageManager().getPackageInfo(ck1.e(), 0).applicationInfo.loadIcon(ExtractorApplication.a.getPackageManager()));
	//   30   68:getstatic       #204 <Field Context ExtractorApplication.a>
	//   31   71:invokevirtual   #210 <Method PackageManager Context.getPackageManager()>
	//   32   74:aload           5
	//   33   76:invokevirtual   #193 <Method String ck.e()>
	//   34   79:iconst_0        
	//   35   80:invokevirtual   #216 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   36   83:getfield        #222 <Field ApplicationInfo PackageInfo.applicationInfo>
	//   37   86:getstatic       #204 <Field Context ExtractorApplication.a>
	//   38   89:invokevirtual   #210 <Method PackageManager Context.getPackageManager()>
	//   39   92:invokevirtual   #228 <Method Drawable ApplicationInfo.loadIcon(PackageManager)>
	//   40   95:invokestatic    #230 <Method Bitmap a(Drawable)>
	//   41   98:astore_3        
		}
		FileOutputStream fileoutputstream = new FileOutputStream(file);
	//   42   99:new             #232 <Class FileOutputStream>
	//   43  102:dup             
	//   44  103:aload           4
	//   45  105:invokespecial   #233 <Method void FileOutputStream(File)>
	//   46  108:astore_2        
		s = ((String) (fileoutputstream));
	//   47  109:aload_2         
	//   48  110:astore_1        
		bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 90, ((java.io.OutputStream) (fileoutputstream)));
	//   49  111:aload_3         
	//   50  112:getstatic       #239 <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.PNG>
	//   51  115:bipush          90
	//   52  117:aload_2         
	//   53  118:invokevirtual   #243 <Method boolean Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, java.io.OutputStream)>
	//   54  121:pop             
		Exception exception;
		Exception exception1;
		try
		{
			fileoutputstream.close();
	//   55  122:aload_2         
	//   56  123:invokevirtual   #244 <Method void FileOutputStream.close()>
		}
	//*  57  126:aload_0         
	//*  58  127:aload           4
	//*  59  129:invokespecial   #165 <Method Bitmap a(File)>
	//*  60  132:astore_1        
	//*  61  133:aload_1         
	//*  62  134:areturn         
	//*  63  135:astore_3        
	//*  64  136:aconst_null     
	//*  65  137:astore_2        
	//*  66  138:aload_2         
	//*  67  139:astore_1        
	//*  68  140:aload_3         
	//*  69  141:invokevirtual   #245 <Method void Exception.printStackTrace()>
	//*  70  144:aload_2         
	//*  71  145:invokevirtual   #244 <Method void FileOutputStream.close()>
	//*  72  148:goto            126
	//*  73  151:astore_1        
	//*  74  152:goto            126
	//*  75  155:astore_2        
	//*  76  156:aconst_null     
	//*  77  157:astore_1        
	//*  78  158:aload_1         
	//*  79  159:invokevirtual   #244 <Method void FileOutputStream.close()>
	//*  80  162:aload_2         
	//*  81  163:athrow          
	//*  82  164:astore_1        
	//*  83  165:aload_1         
	//*  84  166:invokevirtual   #246 <Method void Throwable.printStackTrace()>
	//*  85  169:aload_1         
	//*  86  170:instanceof      #248 <Class OutOfMemoryError>
	//*  87  173:ifeq            183
	//*  88  176:aload_0         
	//*  89  177:getfield        #37  <Field ch b>
	//*  90  180:invokevirtual   #250 <Method void ch.a()>
	//*  91  183:aconst_null     
	//*  92  184:areturn         
		// Misplaced declaration of an exception variable
		catch(String s) { }
	//   93  185:astore_1        
		s = ((String) (a(file)));
		return ((Bitmap) (s));
		exception1;
		fileoutputstream = null;
_L4:
		s = ((String) (fileoutputstream));
		exception1.printStackTrace();
		try
		{
			fileoutputstream.close();
		}
		// Misplaced declaration of an exception variable
		catch(String s) { }
		break MISSING_BLOCK_LABEL_126;
		exception;
		s = null;
_L2:
		try
		{
			((FileOutputStream) (s)).close();
		}
	//*  94  186:goto            126
		// Misplaced declaration of an exception variable
		catch(String s) { }
	//   95  189:astore_1        
		try
		{
			throw exception;
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			((Throwable) (s)).printStackTrace();
		}
		if(s instanceof OutOfMemoryError)
			b.a();
		return null;
	//*  96  190:goto            162
		exception;
	//   97  193:astore_2        
		if(true) goto _L2; else goto _L1
	//   98  194:goto            158
_L1:
		exception1;
	//   99  197:astore_3        
		if(true) goto _L4; else goto _L3
_L3:
	//* 100  198:goto            138
	//* 101  201:goto            99
	}

	private void a(String s, ImageView imageview)
	{
		s = ((String) (new b(s, imageview)));
	//    0    0:new             #9   <Class cg$b>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #254 <Method void cg$b(cg, String, ImageView)>
	//    6   10:astore_1        
		d.submit(((Runnable) (new c(((b) (s))))));
	//    7   11:aload_0         
	//    8   12:getfield        #66  <Field ExecutorService d>
	//    9   15:new             #12  <Class cg$c>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokespecial   #257 <Method void cg$c(cg, cg$b)>
	//   14   24:invokeinterface #263 <Method java.util.concurrent.Future ExecutorService.submit(Runnable)>
	//   15   29:pop             
	//   16   30:return          
	}

	public void a()
	{
		b.a();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ch b>
	//    2    4:invokevirtual   #250 <Method void ch.a()>
		c.a();
	//    3    7:aload_0         
	//    4    8:getfield        #58  <Field cf c>
	//    5   11:invokevirtual   #264 <Method void cf.a()>
	//    6   14:return          
	}

	public void a(String s, ImageView imageview, bv bv1)
	{
		g = bv1;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #167 <Field bv g>
		f.put(((Object) (imageview)), ((Object) (s)));
	//    3    5:aload_0         
	//    4    6:getfield        #53  <Field Map f>
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #271 <Method Object Map.put(Object, Object)>
	//    8   16:pop             
		bv1 = ((bv) (b.a(s)));
	//    9   17:aload_0         
	//   10   18:getfield        #37  <Field ch b>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #272 <Method Bitmap ch.a(String)>
	//   13   25:astore_3        
		if(bv1 != null)
	//*  14   26:aload_3         
	//*  15   27:ifnull          36
		{
			imageview.setImageBitmap(((Bitmap) (bv1)));
	//   16   30:aload_2         
	//   17   31:aload_3         
	//   18   32:invokevirtual   #277 <Method void ImageView.setImageBitmap(Bitmap)>
			return;
	//   19   35:return          
		} else
		{
			a(s, imageview);
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:aload_2         
	//   23   39:invokespecial   #279 <Method void a(String, ImageView)>
			imageview.setImageResource(0x7f080068);
	//   24   42:aload_2         
	//   25   43:ldc1            #30  <Int 0x7f080068>
	//   26   45:invokevirtual   #283 <Method void ImageView.setImageResource(int)>
			return;
	//   27   48:return          
		}
	}

	boolean a(b b1)
	{
		String s = (String)f.get(((Object) (b1.b)));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Map f>
	//    2    4:aload_1         
	//    3    5:getfield        #287 <Field ImageView cg$b.b>
	//    4    8:invokeinterface #291 <Method Object Map.get(Object)>
	//    5   13:checkcast       #195 <Class String>
	//    6   16:astore_2        
		return s == null || !s.equals(((Object) (b1.a)));
	//    7   17:aload_2         
	//    8   18:ifnull          32
	//    9   21:aload_2         
	//   10   22:aload_1         
	//   11   23:getfield        #294 <Field String cg$b.a>
	//   12   26:invokevirtual   #199 <Method boolean String.equals(Object)>
	//   13   29:ifne            34
	//   14   32:iconst_1        
	//   15   33:ireturn         
	//   16   34:iconst_0        
	//   17   35:ireturn         
	}

	final int a = 0x7f080068;
	ch b;
	cf c;
	ExecutorService d;
	Handler e;
	private Map f;
	private bv g;
}
