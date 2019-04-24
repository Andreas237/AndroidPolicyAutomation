// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.images;

import android.app.ActivityManager;
import android.content.*;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.*;
import android.support.v4.util.LruCache;
import android.util.Log;
import android.widget.ImageView;
import com.google.android.gms.common.internal.zzc;
import com.google.android.gms.common.util.zzs;
import com.google.android.gms.internal.zzabv;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.*;

// Referenced classes of package com.google.android.gms.common.images:
//			zza

public final class ImageManager
{
	private final class ImageReceiver extends ResultReceiver
	{

		static ArrayList zza(ImageReceiver imagereceiver)
		{
			return imagereceiver.zzaCQ;
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field ArrayList zzaCQ>
		//    2    4:areturn         
		}

		public void onReceiveResult(int i, Bundle bundle)
		{
			bundle = ((Bundle) ((ParcelFileDescriptor)bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
		//    0    0:aload_2         
		//    1    1:ldc1            #49  <String "com.google.android.gms.extra.fileDescriptor">
		//    2    3:invokevirtual   #55  <Method android.os.Parcelable Bundle.getParcelable(String)>
		//    3    6:checkcast       #57  <Class ParcelFileDescriptor>
		//    4    9:astore_2        
			ImageManager.zzf(zzaCR).execute(((Runnable) (((zzc) (zzaCR)). new zzc(mUri, ((ParcelFileDescriptor) (bundle))))));
		//    5   10:aload_0         
		//    6   11:getfield        #19  <Field ImageManager zzaCR>
		//    7   14:invokestatic    #61  <Method ExecutorService ImageManager.zzf(ImageManager)>
		//    8   17:new             #63  <Class ImageManager$zzc>
		//    9   20:dup             
		//   10   21:aload_0         
		//   11   22:getfield        #19  <Field ImageManager zzaCR>
		//   12   25:aload_0         
		//   13   26:getfield        #35  <Field Uri mUri>
		//   14   29:aload_2         
		//   15   30:invokespecial   #66  <Method void ImageManager$zzc(ImageManager, Uri, ParcelFileDescriptor)>
		//   16   33:invokeinterface #72  <Method void ExecutorService.execute(Runnable)>
		//   17   38:return          
		}

		public void zzb(com.google.android.gms.common.images.zza zza1)
		{
			com.google.android.gms.common.internal.zzc.zzdn("ImageReceiver.addImageRequest() must be called in the main thread");
		//    0    0:ldc1            #76  <String "ImageReceiver.addImageRequest() must be called in the main thread">
		//    1    2:invokestatic    #82  <Method void zzc.zzdn(String)>
			zzaCQ.add(((Object) (zza1)));
		//    2    5:aload_0         
		//    3    6:getfield        #42  <Field ArrayList zzaCQ>
		//    4    9:aload_1         
		//    5   10:invokevirtual   #86  <Method boolean ArrayList.add(Object)>
		//    6   13:pop             
		//    7   14:return          
		}

		public void zzc(com.google.android.gms.common.images.zza zza1)
		{
			com.google.android.gms.common.internal.zzc.zzdn("ImageReceiver.removeImageRequest() must be called in the main thread");
		//    0    0:ldc1            #89  <String "ImageReceiver.removeImageRequest() must be called in the main thread">
		//    1    2:invokestatic    #82  <Method void zzc.zzdn(String)>
			zzaCQ.remove(((Object) (zza1)));
		//    2    5:aload_0         
		//    3    6:getfield        #42  <Field ArrayList zzaCQ>
		//    4    9:aload_1         
		//    5   10:invokevirtual   #92  <Method boolean ArrayList.remove(Object)>
		//    6   13:pop             
		//    7   14:return          
		}

		public void zzwL()
		{
			Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
		//    0    0:new             #95  <Class Intent>
		//    1    3:dup             
		//    2    4:ldc1            #97  <String "com.google.android.gms.common.images.LOAD_IMAGE">
		//    3    6:invokespecial   #99  <Method void Intent(String)>
		//    4    9:astore_1        
			intent.putExtra("com.google.android.gms.extras.uri", ((android.os.Parcelable) (mUri)));
		//    5   10:aload_1         
		//    6   11:ldc1            #101 <String "com.google.android.gms.extras.uri">
		//    7   13:aload_0         
		//    8   14:getfield        #35  <Field Uri mUri>
		//    9   17:invokevirtual   #105 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
		//   10   20:pop             
			intent.putExtra("com.google.android.gms.extras.resultReceiver", ((android.os.Parcelable) (this)));
		//   11   21:aload_1         
		//   12   22:ldc1            #107 <String "com.google.android.gms.extras.resultReceiver">
		//   13   24:aload_0         
		//   14   25:invokevirtual   #105 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
		//   15   28:pop             
			intent.putExtra("com.google.android.gms.extras.priority", 3);
		//   16   29:aload_1         
		//   17   30:ldc1            #109 <String "com.google.android.gms.extras.priority">
		//   18   32:iconst_3        
		//   19   33:invokevirtual   #112 <Method Intent Intent.putExtra(String, int)>
		//   20   36:pop             
			ImageManager.zzb(zzaCR).sendBroadcast(intent);
		//   21   37:aload_0         
		//   22   38:getfield        #19  <Field ImageManager zzaCR>
		//   23   41:invokestatic    #115 <Method Context ImageManager.zzb(ImageManager)>
		//   24   44:aload_1         
		//   25   45:invokevirtual   #121 <Method void Context.sendBroadcast(Intent)>
		//   26   48:return          
		}

		private final Uri mUri;
		private final ArrayList zzaCQ = new ArrayList();
		final ImageManager zzaCR;

		ImageReceiver(Uri uri)
		{
			zzaCR = ImageManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field ImageManager zzaCR>
			super(new Handler(Looper.getMainLooper()));
		//    3    5:aload_0         
		//    4    6:new             #21  <Class Handler>
		//    5    9:dup             
		//    6   10:invokestatic    #27  <Method Looper Looper.getMainLooper()>
		//    7   13:invokespecial   #30  <Method void Handler(Looper)>
		//    8   16:invokespecial   #33  <Method void ResultReceiver(Handler)>
			mUri = uri;
		//    9   19:aload_0         
		//   10   20:aload_2         
		//   11   21:putfield        #35  <Field Uri mUri>
		//   12   24:aload_0         
		//   13   25:new             #37  <Class ArrayList>
		//   14   28:dup             
		//   15   29:invokespecial   #40  <Method void ArrayList()>
		//   16   32:putfield        #42  <Field ArrayList zzaCQ>
		//   17   35:return          
		}
	}

	public static interface OnImageLoadedListener
	{

		public abstract void onImageLoaded(Uri uri, Drawable drawable, boolean flag);
	}

	private static final class zza
	{

		static int zza(ActivityManager activitymanager)
		{
			return activitymanager.getLargeMemoryClass();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #17  <Method int ActivityManager.getLargeMemoryClass()>
		//    2    4:ireturn         
		}
	}

	private static final class zzb extends LruCache
	{

		private static int zzaz(Context context)
		{
			ActivityManager activitymanager = (ActivityManager)context.getSystemService("activity");
		//    0    0:aload_0         
		//    1    1:ldc1            #23  <String "activity">
		//    2    3:invokevirtual   #29  <Method Object Context.getSystemService(String)>
		//    3    6:checkcast       #31  <Class ActivityManager>
		//    4    9:astore_2        
			int i;
			if((context.getApplicationInfo().flags & 0x100000) != 0)
		//*   5   10:aload_0         
		//*   6   11:invokevirtual   #35  <Method ApplicationInfo Context.getApplicationInfo()>
		//*   7   14:getfield        #41  <Field int ApplicationInfo.flags>
		//*   8   17:ldc1            #42  <Int 0x100000>
		//*   9   19:iand            
		//*  10   20:ifeq            50
				i = 1;
		//   11   23:iconst_1        
		//   12   24:istore_1        
			else
		//*  13   25:iload_1         
		//*  14   26:ifeq            55
		//*  15   29:invokestatic    #48  <Method boolean zzs.zzyx()>
		//*  16   32:ifeq            55
		//*  17   35:aload_2         
		//*  18   36:invokestatic    #54  <Method int ImageManager$zza.zza(ActivityManager)>
		//*  19   39:istore_1        
		//*  20   40:iload_1         
		//*  21   41:ldc1            #42  <Int 0x100000>
		//*  22   43:imul            
		//*  23   44:i2f             
		//*  24   45:ldc1            #55  <Float 0.33F>
		//*  25   47:fmul            
		//*  26   48:f2i             
		//*  27   49:ireturn         
				i = 0;
		//   28   50:iconst_0        
		//   29   51:istore_1        
			if(i != 0 && zzs.zzyx())
				i = zza.zza(activitymanager);
			else
		//*  30   52:goto            25
				i = activitymanager.getMemoryClass();
		//   31   55:aload_2         
		//   32   56:invokevirtual   #59  <Method int ActivityManager.getMemoryClass()>
		//   33   59:istore_1        
			return (int)((float)(i * 0x100000) * 0.33F);
		//*  34   60:goto            40
		}

		protected void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
		{
			zza(flag, (zza.zza)obj, (Bitmap)obj1, (Bitmap)obj2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #64  <Class zza$zza>
		//    4    6:aload_3         
		//    5    7:checkcast       #66  <Class Bitmap>
		//    6   10:aload           4
		//    7   12:checkcast       #66  <Class Bitmap>
		//    8   15:invokevirtual   #69  <Method void zza(boolean, zza$zza, Bitmap, Bitmap)>
		//    9   18:return          
		}

		protected int sizeOf(Object obj, Object obj1)
		{
			return zza((zza.zza)obj, (Bitmap)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #64  <Class zza$zza>
		//    3    5:aload_2         
		//    4    6:checkcast       #66  <Class Bitmap>
		//    5    9:invokevirtual   #74  <Method int zza(zza$zza, Bitmap)>
		//    6   12:ireturn         
		}

		protected int zza(zza.zza zza1, Bitmap bitmap)
		{
			return bitmap.getHeight() * bitmap.getRowBytes();
		//    0    0:aload_2         
		//    1    1:invokevirtual   #77  <Method int Bitmap.getHeight()>
		//    2    4:aload_2         
		//    3    5:invokevirtual   #80  <Method int Bitmap.getRowBytes()>
		//    4    8:imul            
		//    5    9:ireturn         
		}

		protected void zza(boolean flag, zza.zza zza1, Bitmap bitmap, Bitmap bitmap1)
		{
			super.entryRemoved(flag, ((Object) (zza1)), ((Object) (bitmap)), ((Object) (bitmap1)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aload           4
		//    5    6:invokespecial   #82  <Method void LruCache.entryRemoved(boolean, Object, Object, Object)>
		//    6    9:return          
		}

		public zzb(Context context)
		{
			super(zzaz(context));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #14  <Method int zzaz(Context)>
		//    3    5:invokespecial   #17  <Method void LruCache(int)>
		//    4    8:return          
		}
	}

	private final class zzc
		implements Runnable
	{

		public void run()
		{
			boolean flag;
			boolean flag1;
			Object obj;
			CountDownLatch countdownlatch;
			com.google.android.gms.common.internal.zzc.zzdo("LoadBitmapFromDiskRunnable can't be executed in the main thread");
		//    0    0:ldc1            #36  <String "LoadBitmapFromDiskRunnable can't be executed in the main thread">
		//    1    2:invokestatic    #42  <Method void zzc.zzdo(String)>
			flag = false;
		//    2    5:iconst_0        
		//    3    6:istore_1        
			flag1 = false;
		//    4    7:iconst_0        
		//    5    8:istore_2        
			obj = null;
		//    6    9:aconst_null     
		//    7   10:astore_3        
			countdownlatch = null;
		//    8   11:aconst_null     
		//    9   12:astore          4
			if(zzaCS == null) goto _L2; else goto _L1
		//   10   14:aload_0         
		//   11   15:getfield        #26  <Field ParcelFileDescriptor zzaCS>
		//   12   18:ifnull          41
_L1:
			obj = ((Object) (BitmapFactory.decodeFileDescriptor(zzaCS.getFileDescriptor())));
		//   13   21:aload_0         
		//   14   22:getfield        #26  <Field ParcelFileDescriptor zzaCS>
		//   15   25:invokevirtual   #48  <Method java.io.FileDescriptor ParcelFileDescriptor.getFileDescriptor()>
		//   16   28:invokestatic    #54  <Method Bitmap BitmapFactory.decodeFileDescriptor(java.io.FileDescriptor)>
		//   17   31:astore_3        
			flag = flag1;
		//   18   32:iload_2         
		//   19   33:istore_1        
_L3:
			OutOfMemoryError outofmemoryerror;
			try
			{
				zzaCS.close();
		//   20   34:aload_0         
		//   21   35:getfield        #26  <Field ParcelFileDescriptor zzaCS>
		//   22   38:invokevirtual   #57  <Method void ParcelFileDescriptor.close()>
			}
		//*  23   41:new             #59  <Class CountDownLatch>
		//*  24   44:dup             
		//*  25   45:iconst_1        
		//*  26   46:invokespecial   #62  <Method void CountDownLatch(int)>
		//*  27   49:astore          4
		//*  28   51:aload_0         
		//*  29   52:getfield        #19  <Field ImageManager zzaCR>
		//*  30   55:invokestatic    #66  <Method Handler ImageManager.zzg(ImageManager)>
		//*  31   58:new             #68  <Class ImageManager$zzf>
		//*  32   61:dup             
		//*  33   62:aload_0         
		//*  34   63:getfield        #19  <Field ImageManager zzaCR>
		//*  35   66:aload_0         
		//*  36   67:getfield        #24  <Field Uri mUri>
		//*  37   70:aload_3         
		//*  38   71:iload_1         
		//*  39   72:aload           4
		//*  40   74:invokespecial   #71  <Method void ImageManager$zzf(ImageManager, Uri, Bitmap, boolean, CountDownLatch)>
		//*  41   77:invokevirtual   #77  <Method boolean Handler.post(Runnable)>
		//*  42   80:pop             
		//*  43   81:aload           4
		//*  44   83:invokevirtual   #80  <Method void CountDownLatch.await()>
		//*  45   86:return          
		//*  46   87:astore_3        
		//*  47   88:aload_0         
		//*  48   89:getfield        #24  <Field Uri mUri>
		//*  49   92:invokestatic    #86  <Method String String.valueOf(Object)>
		//*  50   95:astore          5
		//*  51   97:ldc1            #88  <String "ImageManager">
		//*  52   99:new             #90  <Class StringBuilder>
		//*  53  102:dup             
		//*  54  103:aload           5
		//*  55  105:invokestatic    #86  <Method String String.valueOf(Object)>
		//*  56  108:invokevirtual   #94  <Method int String.length()>
		//*  57  111:bipush          34
		//*  58  113:iadd            
		//*  59  114:invokespecial   #95  <Method void StringBuilder(int)>
		//*  60  117:ldc1            #97  <String "OOM while loading bitmap for uri: ">
		//*  61  119:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
		//*  62  122:aload           5
		//*  63  124:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
		//*  64  127:invokevirtual   #105 <Method String StringBuilder.toString()>
		//*  65  130:aload_3         
		//*  66  131:invokestatic    #111 <Method int Log.e(String, String, Throwable)>
		//*  67  134:pop             
		//*  68  135:iconst_1        
		//*  69  136:istore_1        
		//*  70  137:aload           4
		//*  71  139:astore_3        
		//*  72  140:goto            34
			catch(IOException ioexception)
		//*  73  143:astore          4
			{
				Log.e("ImageManager", "closed failed", ((Throwable) (ioexception)));
		//   74  145:ldc1            #88  <String "ImageManager">
		//   75  147:ldc1            #113 <String "closed failed">
		//   76  149:aload           4
		//   77  151:invokestatic    #111 <Method int Log.e(String, String, Throwable)>
		//   78  154:pop             
			}
_L2:
			countdownlatch = new CountDownLatch(1);
			ImageManager.zzg(zzaCR).post(((Runnable) (((zzf) (zzaCR)). new zzf(mUri, ((Bitmap) (obj)), flag, countdownlatch))));
			try
			{
				countdownlatch.await();
				return;
			}
		//*  79  155:goto            41
			catch(InterruptedException interruptedexception)
		//*  80  158:astore_3        
			{
				interruptedexception = ((InterruptedException) (String.valueOf(((Object) (mUri)))));
		//   81  159:aload_0         
		//   82  160:getfield        #24  <Field Uri mUri>
		//   83  163:invokestatic    #86  <Method String String.valueOf(Object)>
		//   84  166:astore_3        
			}
			break MISSING_BLOCK_LABEL_167;
			outofmemoryerror;
			String s = String.valueOf(((Object) (mUri)));
			Log.e("ImageManager", (new StringBuilder(String.valueOf(((Object) (s))).length() + 34)).append("OOM while loading bitmap for uri: ").append(s).toString(), ((Throwable) (outofmemoryerror)));
			flag = true;
			outofmemoryerror = ((OutOfMemoryError) (countdownlatch));
			  goto _L3
			Log.w("ImageManager", (new StringBuilder(String.valueOf(((Object) (interruptedexception))).length() + 32)).append("Latch interrupted while posting ").append(((String) (interruptedexception))).toString());
		//   85  167:ldc1            #88  <String "ImageManager">
		//   86  169:new             #90  <Class StringBuilder>
		//   87  172:dup             
		//   88  173:aload_3         
		//   89  174:invokestatic    #86  <Method String String.valueOf(Object)>
		//   90  177:invokevirtual   #94  <Method int String.length()>
		//   91  180:bipush          32
		//   92  182:iadd            
		//   93  183:invokespecial   #95  <Method void StringBuilder(int)>
		//   94  186:ldc1            #115 <String "Latch interrupted while posting ">
		//   95  188:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
		//   96  191:aload_3         
		//   97  192:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
		//   98  195:invokevirtual   #105 <Method String StringBuilder.toString()>
		//   99  198:invokestatic    #119 <Method int Log.w(String, String)>
		//  100  201:pop             
			return;
		//  101  202:return          
		}

		private final Uri mUri;
		final ImageManager zzaCR;
		private final ParcelFileDescriptor zzaCS;

		public zzc(Uri uri, ParcelFileDescriptor parcelfiledescriptor)
		{
			zzaCR = ImageManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field ImageManager zzaCR>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #22  <Method void Object()>
			mUri = uri;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field Uri mUri>
			zzaCS = parcelfiledescriptor;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #26  <Field ParcelFileDescriptor zzaCS>
		//   11   19:return          
		}
	}

	private final class zzd
		implements Runnable
	{

		public void run()
		{
			com.google.android.gms.common.internal.zzc.zzdn("LoadImageRunnable must be executed on the main thread");
		//    0    0:ldc1            #26  <String "LoadImageRunnable must be executed on the main thread">
		//    1    2:invokestatic    #32  <Method void zzc.zzdn(String)>
			Object obj = ((Object) ((ImageReceiver)ImageManager.zza(zzaCR).get(((Object) (zzaCT)))));
		//    2    5:aload_0         
		//    3    6:getfield        #17  <Field ImageManager zzaCR>
		//    4    9:invokestatic    #36  <Method Map ImageManager.zza(ImageManager)>
		//    5   12:aload_0         
		//    6   13:getfield        #22  <Field zza zzaCT>
		//    7   16:invokeinterface #42  <Method Object Map.get(Object)>
		//    8   21:checkcast       #44  <Class ImageManager$ImageReceiver>
		//    9   24:astore_1        
			if(obj != null)
		//*  10   25:aload_1         
		//*  11   26:ifnull          54
			{
				ImageManager.zza(zzaCR).remove(((Object) (zzaCT)));
		//   12   29:aload_0         
		//   13   30:getfield        #17  <Field ImageManager zzaCR>
		//   14   33:invokestatic    #36  <Method Map ImageManager.zza(ImageManager)>
		//   15   36:aload_0         
		//   16   37:getfield        #22  <Field zza zzaCT>
		//   17   40:invokeinterface #47  <Method Object Map.remove(Object)>
		//   18   45:pop             
				((ImageReceiver) (obj)).zzc(zzaCT);
		//   19   46:aload_1         
		//   20   47:aload_0         
		//   21   48:getfield        #22  <Field zza zzaCT>
		//   22   51:invokevirtual   #51  <Method void com.google.android.gms.common.images.ImageManager$ImageReceiver.zzc(zza)>
			}
			zza.zza zza1 = zzaCT.zzaCV;
		//   23   54:aload_0         
		//   24   55:getfield        #22  <Field zza zzaCT>
		//   25   58:getfield        #57  <Field zza$zza zza.zzaCV>
		//   26   61:astore_3        
			if(zza1.uri == null)
		//*  27   62:aload_3         
		//*  28   63:getfield        #63  <Field Uri zza$zza.uri>
		//*  29   66:ifnonnull       92
			{
				zzaCT.zza(ImageManager.zzb(zzaCR), com.google.android.gms.common.images.ImageManager.zzc(zzaCR), true);
		//   30   69:aload_0         
		//   31   70:getfield        #22  <Field zza zzaCT>
		//   32   73:aload_0         
		//   33   74:getfield        #17  <Field ImageManager zzaCR>
		//   34   77:invokestatic    #67  <Method Context ImageManager.zzb(ImageManager)>
		//   35   80:aload_0         
		//   36   81:getfield        #17  <Field ImageManager zzaCR>
		//   37   84:invokestatic    #70  <Method zzabv com.google.android.gms.common.images.ImageManager.zzc(ImageManager)>
		//   38   87:iconst_1        
		//   39   88:invokevirtual   #73  <Method void zza.zza(Context, zzabv, boolean)>
				return;
		//   40   91:return          
			}
			obj = ((Object) (ImageManager.zza(zzaCR, zza1)));
		//   41   92:aload_0         
		//   42   93:getfield        #17  <Field ImageManager zzaCR>
		//   43   96:aload_3         
		//   44   97:invokestatic    #76  <Method Bitmap ImageManager.zza(ImageManager, zza$zza)>
		//   45  100:astore_1        
			if(obj != null)
		//*  46  101:aload_1         
		//*  47  102:ifnull          122
			{
				zzaCT.zza(ImageManager.zzb(zzaCR), ((Bitmap) (obj)), true);
		//   48  105:aload_0         
		//   49  106:getfield        #22  <Field zza zzaCT>
		//   50  109:aload_0         
		//   51  110:getfield        #17  <Field ImageManager zzaCR>
		//   52  113:invokestatic    #67  <Method Context ImageManager.zzb(ImageManager)>
		//   53  116:aload_1         
		//   54  117:iconst_1        
		//   55  118:invokevirtual   #79  <Method void zza.zza(Context, Bitmap, boolean)>
				return;
		//   56  121:return          
			}
			obj = ((Object) ((Long)ImageManager.zzd(zzaCR).get(((Object) (zza1.uri)))));
		//   57  122:aload_0         
		//   58  123:getfield        #17  <Field ImageManager zzaCR>
		//   59  126:invokestatic    #81  <Method Map ImageManager.zzd(ImageManager)>
		//   60  129:aload_3         
		//   61  130:getfield        #63  <Field Uri zza$zza.uri>
		//   62  133:invokeinterface #42  <Method Object Map.get(Object)>
		//   63  138:checkcast       #83  <Class Long>
		//   64  141:astore_1        
			if(obj != null)
		//*  65  142:aload_1         
		//*  66  143:ifnull          201
			{
				if(SystemClock.elapsedRealtime() - ((Long) (obj)).longValue() < 0x36ee80L)
		//*  67  146:invokestatic    #89  <Method long SystemClock.elapsedRealtime()>
		//*  68  149:aload_1         
		//*  69  150:invokevirtual   #92  <Method long Long.longValue()>
		//*  70  153:lsub            
		//*  71  154:ldc2w           #93  <Long 0x36ee80L>
		//*  72  157:lcmp            
		//*  73  158:ifge            184
				{
					zzaCT.zza(ImageManager.zzb(zzaCR), com.google.android.gms.common.images.ImageManager.zzc(zzaCR), true);
		//   74  161:aload_0         
		//   75  162:getfield        #22  <Field zza zzaCT>
		//   76  165:aload_0         
		//   77  166:getfield        #17  <Field ImageManager zzaCR>
		//   78  169:invokestatic    #67  <Method Context ImageManager.zzb(ImageManager)>
		//   79  172:aload_0         
		//   80  173:getfield        #17  <Field ImageManager zzaCR>
		//   81  176:invokestatic    #70  <Method zzabv com.google.android.gms.common.images.ImageManager.zzc(ImageManager)>
		//   82  179:iconst_1        
		//   83  180:invokevirtual   #73  <Method void zza.zza(Context, zzabv, boolean)>
					return;
		//   84  183:return          
				}
				ImageManager.zzd(zzaCR).remove(((Object) (zza1.uri)));
		//   85  184:aload_0         
		//   86  185:getfield        #17  <Field ImageManager zzaCR>
		//   87  188:invokestatic    #81  <Method Map ImageManager.zzd(ImageManager)>
		//   88  191:aload_3         
		//   89  192:getfield        #63  <Field Uri zza$zza.uri>
		//   90  195:invokeinterface #47  <Method Object Map.remove(Object)>
		//   91  200:pop             
			}
			zzaCT.zza(ImageManager.zzb(zzaCR), com.google.android.gms.common.images.ImageManager.zzc(zzaCR));
		//   92  201:aload_0         
		//   93  202:getfield        #22  <Field zza zzaCT>
		//   94  205:aload_0         
		//   95  206:getfield        #17  <Field ImageManager zzaCR>
		//   96  209:invokestatic    #67  <Method Context ImageManager.zzb(ImageManager)>
		//   97  212:aload_0         
		//   98  213:getfield        #17  <Field ImageManager zzaCR>
		//   99  216:invokestatic    #70  <Method zzabv com.google.android.gms.common.images.ImageManager.zzc(ImageManager)>
		//  100  219:invokevirtual   #97  <Method void zza.zza(Context, zzabv)>
			ImageReceiver imagereceiver = (ImageReceiver)ImageManager.zze(zzaCR).get(((Object) (zza1.uri)));
		//  101  222:aload_0         
		//  102  223:getfield        #17  <Field ImageManager zzaCR>
		//  103  226:invokestatic    #100 <Method Map ImageManager.zze(ImageManager)>
		//  104  229:aload_3         
		//  105  230:getfield        #63  <Field Uri zza$zza.uri>
		//  106  233:invokeinterface #42  <Method Object Map.get(Object)>
		//  107  238:checkcast       #44  <Class ImageManager$ImageReceiver>
		//  108  241:astore_2        
			obj = ((Object) (imagereceiver));
		//  109  242:aload_2         
		//  110  243:astore_1        
			if(imagereceiver == null)
		//* 111  244:aload_2         
		//* 112  245:ifnonnull       282
			{
				obj = ((Object) (((ImageReceiver) (zzaCR)). new ImageReceiver(zza1.uri)));
		//  113  248:new             #44  <Class ImageManager$ImageReceiver>
		//  114  251:dup             
		//  115  252:aload_0         
		//  116  253:getfield        #17  <Field ImageManager zzaCR>
		//  117  256:aload_3         
		//  118  257:getfield        #63  <Field Uri zza$zza.uri>
		//  119  260:invokespecial   #103 <Method void ImageManager$ImageReceiver(ImageManager, Uri)>
		//  120  263:astore_1        
				ImageManager.zze(zzaCR).put(((Object) (zza1.uri)), obj);
		//  121  264:aload_0         
		//  122  265:getfield        #17  <Field ImageManager zzaCR>
		//  123  268:invokestatic    #100 <Method Map ImageManager.zze(ImageManager)>
		//  124  271:aload_3         
		//  125  272:getfield        #63  <Field Uri zza$zza.uri>
		//  126  275:aload_1         
		//  127  276:invokeinterface #107 <Method Object Map.put(Object, Object)>
		//  128  281:pop             
			}
			((ImageReceiver) (obj)).zzb(zzaCT);
		//  129  282:aload_1         
		//  130  283:aload_0         
		//  131  284:getfield        #22  <Field zza zzaCT>
		//  132  287:invokevirtual   #109 <Method void ImageManager$ImageReceiver.zzb(zza)>
			if(!(zzaCT instanceof zza.zzc))
		//* 133  290:aload_0         
		//* 134  291:getfield        #22  <Field zza zzaCT>
		//* 135  294:instanceof      #111 <Class zza$zzc>
		//* 136  297:ifne            318
				ImageManager.zza(zzaCR).put(((Object) (zzaCT)), obj);
		//  137  300:aload_0         
		//  138  301:getfield        #17  <Field ImageManager zzaCR>
		//  139  304:invokestatic    #36  <Method Map ImageManager.zza(ImageManager)>
		//  140  307:aload_0         
		//  141  308:getfield        #22  <Field zza zzaCT>
		//  142  311:aload_1         
		//  143  312:invokeinterface #107 <Method Object Map.put(Object, Object)>
		//  144  317:pop             
			synchronized(ImageManager.zzui())
		//* 145  318:invokestatic    #115 <Method Object ImageManager.zzui()>
		//* 146  321:astore_2        
		//* 147  322:aload_2         
		//* 148  323:monitorenter    
			{
				if(!ImageManager.zzwK().contains(((Object) (zza1.uri))))
		//* 149  324:invokestatic    #119 <Method HashSet ImageManager.zzwK()>
		//* 150  327:aload_3         
		//* 151  328:getfield        #63  <Field Uri zza$zza.uri>
		//* 152  331:invokevirtual   #125 <Method boolean HashSet.contains(Object)>
		//* 153  334:ifne            352
				{
					ImageManager.zzwK().add(((Object) (zza1.uri)));
		//  154  337:invokestatic    #119 <Method HashSet ImageManager.zzwK()>
		//  155  340:aload_3         
		//  156  341:getfield        #63  <Field Uri zza$zza.uri>
		//  157  344:invokevirtual   #128 <Method boolean HashSet.add(Object)>
		//  158  347:pop             
					((ImageReceiver) (obj)).zzwL();
		//  159  348:aload_1         
		//  160  349:invokevirtual   #131 <Method void ImageManager$ImageReceiver.zzwL()>
				}
			}
		//  161  352:aload_2         
		//  162  353:monitorexit     
			return;
		//  163  354:return          
			exception;
		//  164  355:astore_1        
			obj1;
		//  165  356:aload_2         
			JVM INSTR monitorexit ;
		//  166  357:monitorexit     
			throw exception;
		//  167  358:aload_1         
		//  168  359:athrow          
		}

		final ImageManager zzaCR;
		private final com.google.android.gms.common.images.zza zzaCT;

		public zzd(com.google.android.gms.common.images.zza zza1)
		{
			zzaCR = ImageManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field ImageManager zzaCR>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
			zzaCT = zza1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field zza zzaCT>
		//    8   14:return          
		}
	}

	private static final class zze
		implements ComponentCallbacks2
	{

		public void onConfigurationChanged(Configuration configuration)
		{
		//    0    0:return          
		}

		public void onLowMemory()
		{
			zzaCL.evictAll();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field ImageManager$zzb zzaCL>
		//    2    4:invokevirtual   #30  <Method void ImageManager$zzb.evictAll()>
		//    3    7:return          
		}

		public void onTrimMemory(int i)
		{
			if(i >= 60)
		//*   0    0:iload_1         
		//*   1    1:bipush          60
		//*   2    3:icmplt          14
				zzaCL.evictAll();
		//    3    6:aload_0         
		//    4    7:getfield        #21  <Field ImageManager$zzb zzaCL>
		//    5   10:invokevirtual   #30  <Method void ImageManager$zzb.evictAll()>
			else
		//*   6   13:return          
			if(i >= 20)
		//*   7   14:iload_1         
		//*   8   15:bipush          20
		//*   9   17:icmplt          13
			{
				zzaCL.trimToSize(zzaCL.size() / 2);
		//   10   20:aload_0         
		//   11   21:getfield        #21  <Field ImageManager$zzb zzaCL>
		//   12   24:aload_0         
		//   13   25:getfield        #21  <Field ImageManager$zzb zzaCL>
		//   14   28:invokevirtual   #36  <Method int ImageManager$zzb.size()>
		//   15   31:iconst_2        
		//   16   32:idiv            
		//   17   33:invokevirtual   #39  <Method void ImageManager$zzb.trimToSize(int)>
				return;
		//   18   36:return          
			}
		}

		private final zzb zzaCL;

		public zze(zzb zzb1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			zzaCL = zzb1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field ImageManager$zzb zzaCL>
		//    5    9:return          
		}
	}

	private final class zzf
		implements Runnable
	{

		private void zza(ImageReceiver imagereceiver, boolean flag)
		{
			imagereceiver = ((ImageReceiver) (ImageReceiver.zza(imagereceiver)));
		//    0    0:aload_1         
		//    1    1:invokestatic    #42  <Method ArrayList ImageManager$ImageReceiver.zza(ImageManager$ImageReceiver)>
		//    2    4:astore_1        
			int j = ((ArrayList) (imagereceiver)).size();
		//    3    5:aload_1         
		//    4    6:invokevirtual   #48  <Method int ArrayList.size()>
		//    5    9:istore          4
			int i = 0;
		//    6   11:iconst_0        
		//    7   12:istore_3        
			while(i < j) 
		//*   8   13:iload_3         
		//*   9   14:iload           4
		//*  10   16:icmpge          126
			{
				com.google.android.gms.common.images.zza zza1 = (com.google.android.gms.common.images.zza)((ArrayList) (imagereceiver)).get(i);
		//   11   19:aload_1         
		//   12   20:iload_3         
		//   13   21:invokevirtual   #52  <Method Object ArrayList.get(int)>
		//   14   24:checkcast       #54  <Class zza>
		//   15   27:astore          5
				if(flag)
		//*  16   29:iload_2         
		//*  17   30:ifeq            80
				{
					zza1.zza(ImageManager.zzb(zzaCR), mBitmap, false);
		//   18   33:aload           5
		//   19   35:aload_0         
		//   20   36:getfield        #23  <Field ImageManager zzaCR>
		//   21   39:invokestatic    #58  <Method Context ImageManager.zzb(ImageManager)>
		//   22   42:aload_0         
		//   23   43:getfield        #30  <Field Bitmap mBitmap>
		//   24   46:iconst_0        
		//   25   47:invokevirtual   #61  <Method void zza.zza(Context, Bitmap, boolean)>
				} else
		//*  26   50:aload           5
		//*  27   52:instanceof      #63  <Class zza$zzc>
		//*  28   55:ifne            73
		//*  29   58:aload_0         
		//*  30   59:getfield        #23  <Field ImageManager zzaCR>
		//*  31   62:invokestatic    #66  <Method Map ImageManager.zza(ImageManager)>
		//*  32   65:aload           5
		//*  33   67:invokeinterface #72  <Method Object Map.remove(Object)>
		//*  34   72:pop             
		//*  35   73:iload_3         
		//*  36   74:iconst_1        
		//*  37   75:iadd            
		//*  38   76:istore_3        
		//*  39   77:goto            13
				{
					ImageManager.zzd(zzaCR).put(((Object) (mUri)), ((Object) (Long.valueOf(SystemClock.elapsedRealtime()))));
		//   40   80:aload_0         
		//   41   81:getfield        #23  <Field ImageManager zzaCR>
		//   42   84:invokestatic    #75  <Method Map ImageManager.zzd(ImageManager)>
		//   43   87:aload_0         
		//   44   88:getfield        #28  <Field Uri mUri>
		//   45   91:invokestatic    #81  <Method long SystemClock.elapsedRealtime()>
		//   46   94:invokestatic    #87  <Method Long Long.valueOf(long)>
		//   47   97:invokeinterface #91  <Method Object Map.put(Object, Object)>
		//   48  102:pop             
					zza1.zza(ImageManager.zzb(zzaCR), com.google.android.gms.common.images.ImageManager.zzc(zzaCR), false);
		//   49  103:aload           5
		//   50  105:aload_0         
		//   51  106:getfield        #23  <Field ImageManager zzaCR>
		//   52  109:invokestatic    #58  <Method Context ImageManager.zzb(ImageManager)>
		//   53  112:aload_0         
		//   54  113:getfield        #23  <Field ImageManager zzaCR>
		//   55  116:invokestatic    #95  <Method zzabv com.google.android.gms.common.images.ImageManager.zzc(ImageManager)>
		//   56  119:iconst_0        
		//   57  120:invokevirtual   #98  <Method void zza.zza(Context, zzabv, boolean)>
				}
				if(!(zza1 instanceof zza.zzc))
					ImageManager.zza(zzaCR).remove(((Object) (zza1)));
				i++;
			}
		//*  58  123:goto            50
		//   59  126:return          
		}

		public void run()
		{
			com.google.android.gms.common.internal.zzc.zzdn("OnBitmapLoadedRunnable must be executed in the main thread");
		//    0    0:ldc1            #101 <String "OnBitmapLoadedRunnable must be executed in the main thread">
		//    1    2:invokestatic    #107 <Method void zzc.zzdn(String)>
			boolean flag;
			if(mBitmap != null)
		//*   2    5:aload_0         
		//*   3    6:getfield        #30  <Field Bitmap mBitmap>
		//*   4    9:ifnull          62
				flag = true;
		//    5   12:iconst_1        
		//    6   13:istore_1        
			else
		//*   7   14:aload_0         
		//*   8   15:getfield        #23  <Field ImageManager zzaCR>
		//*   9   18:invokestatic    #111 <Method ImageManager$zzb ImageManager.zzh(ImageManager)>
		//*  10   21:ifnull          97
		//*  11   24:aload_0         
		//*  12   25:getfield        #32  <Field boolean zzaCU>
		//*  13   28:ifeq            67
		//*  14   31:aload_0         
		//*  15   32:getfield        #23  <Field ImageManager zzaCR>
		//*  16   35:invokestatic    #111 <Method ImageManager$zzb ImageManager.zzh(ImageManager)>
		//*  17   38:invokevirtual   #116 <Method void ImageManager$zzb.evictAll()>
		//*  18   41:invokestatic    #121 <Method void System.gc()>
		//*  19   44:aload_0         
		//*  20   45:iconst_0        
		//*  21   46:putfield        #32  <Field boolean zzaCU>
		//*  22   49:aload_0         
		//*  23   50:getfield        #23  <Field ImageManager zzaCR>
		//*  24   53:invokestatic    #125 <Method Handler ImageManager.zzg(ImageManager)>
		//*  25   56:aload_0         
		//*  26   57:invokevirtual   #131 <Method boolean Handler.post(Runnable)>
		//*  27   60:pop             
		//*  28   61:return          
				flag = false;
		//   29   62:iconst_0        
		//   30   63:istore_1        
			if(ImageManager.zzh(zzaCR) != null)
			{
				if(zzaCU)
				{
					ImageManager.zzh(zzaCR).evictAll();
					System.gc();
					zzaCU = false;
					ImageManager.zzg(zzaCR).post(((Runnable) (this)));
					return;
				}
		//*  31   64:goto            14
				if(flag)
		//*  32   67:iload_1         
		//*  33   68:ifeq            97
					ImageManager.zzh(zzaCR).put(((Object) (new zza.zza(mUri))), ((Object) (mBitmap)));
		//   34   71:aload_0         
		//   35   72:getfield        #23  <Field ImageManager zzaCR>
		//   36   75:invokestatic    #111 <Method ImageManager$zzb ImageManager.zzh(ImageManager)>
		//   37   78:new             #133 <Class zza$zza>
		//   38   81:dup             
		//   39   82:aload_0         
		//   40   83:getfield        #28  <Field Uri mUri>
		//   41   86:invokespecial   #136 <Method void zza$zza(Uri)>
		//   42   89:aload_0         
		//   43   90:getfield        #30  <Field Bitmap mBitmap>
		//   44   93:invokevirtual   #137 <Method Object ImageManager$zzb.put(Object, Object)>
		//   45   96:pop             
			}
			ImageReceiver imagereceiver = (ImageReceiver)ImageManager.zze(zzaCR).remove(((Object) (mUri)));
		//   46   97:aload_0         
		//   47   98:getfield        #23  <Field ImageManager zzaCR>
		//   48  101:invokestatic    #140 <Method Map ImageManager.zze(ImageManager)>
		//   49  104:aload_0         
		//   50  105:getfield        #28  <Field Uri mUri>
		//   51  108:invokeinterface #72  <Method Object Map.remove(Object)>
		//   52  113:checkcast       #39  <Class ImageManager$ImageReceiver>
		//   53  116:astore_2        
			if(imagereceiver != null)
		//*  54  117:aload_2         
		//*  55  118:ifnull          127
				zza(imagereceiver, flag);
		//   56  121:aload_0         
		//   57  122:aload_2         
		//   58  123:iload_1         
		//   59  124:invokespecial   #142 <Method void zza(ImageManager$ImageReceiver, boolean)>
			zzth.countDown();
		//   60  127:aload_0         
		//   61  128:getfield        #34  <Field CountDownLatch zzth>
		//   62  131:invokevirtual   #147 <Method void CountDownLatch.countDown()>
			synchronized(ImageManager.zzui())
		//*  63  134:invokestatic    #151 <Method Object ImageManager.zzui()>
		//*  64  137:astore_2        
		//*  65  138:aload_2         
		//*  66  139:monitorenter    
			{
				ImageManager.zzwK().remove(((Object) (mUri)));
		//   67  140:invokestatic    #155 <Method HashSet ImageManager.zzwK()>
		//   68  143:aload_0         
		//   69  144:getfield        #28  <Field Uri mUri>
		//   70  147:invokevirtual   #160 <Method boolean HashSet.remove(Object)>
		//   71  150:pop             
			}
		//   72  151:aload_2         
		//   73  152:monitorexit     
			return;
		//   74  153:return          
			exception;
		//   75  154:astore_3        
			obj;
		//   76  155:aload_2         
			JVM INSTR monitorexit ;
		//   77  156:monitorexit     
			throw exception;
		//   78  157:aload_3         
		//   79  158:athrow          
		}

		private final Bitmap mBitmap;
		private final Uri mUri;
		final ImageManager zzaCR;
		private boolean zzaCU;
		private final CountDownLatch zzth;

		public zzf(Uri uri, Bitmap bitmap, boolean flag, CountDownLatch countdownlatch)
		{
			zzaCR = ImageManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #23  <Field ImageManager zzaCR>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #26  <Method void Object()>
			mUri = uri;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #28  <Field Uri mUri>
			mBitmap = bitmap;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #30  <Field Bitmap mBitmap>
			zzaCU = flag;
		//   11   19:aload_0         
		//   12   20:iload           4
		//   13   22:putfield        #32  <Field boolean zzaCU>
			zzth = countdownlatch;
		//   14   25:aload_0         
		//   15   26:aload           5
		//   16   28:putfield        #34  <Field CountDownLatch zzth>
		//   17   31:return          
		}
	}


	private ImageManager(Context context, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void Object()>
		mContext = context.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #73  <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #75  <Field Context mContext>
	//    6   12:aload_0         
	//    7   13:new             #77  <Class Handler>
	//    8   16:dup             
	//    9   17:invokestatic    #83  <Method Looper Looper.getMainLooper()>
	//   10   20:invokespecial   #86  <Method void Handler(Looper)>
	//   11   23:putfield        #88  <Field Handler mHandler>
	//   12   26:aload_0         
	//   13   27:iconst_4        
	//   14   28:invokestatic    #94  <Method ExecutorService Executors.newFixedThreadPool(int)>
	//   15   31:putfield        #96  <Field ExecutorService zzaCK>
		if(flag)
	//*  16   34:iload_2         
	//*  17   35:ifeq            108
		{
			zzaCL = new zzb(mContext);
	//   18   38:aload_0         
	//   19   39:new             #15  <Class ImageManager$zzb>
	//   20   42:dup             
	//   21   43:aload_0         
	//   22   44:getfield        #75  <Field Context mContext>
	//   23   47:invokespecial   #99  <Method void ImageManager$zzb(Context)>
	//   24   50:putfield        #101 <Field ImageManager$zzb zzaCL>
			if(zzs.zzyA())
	//*  25   53:invokestatic    #107 <Method boolean zzs.zzyA()>
	//*  26   56:ifeq            63
				zzwJ();
	//   27   59:aload_0         
	//   28   60:invokespecial   #110 <Method void zzwJ()>
		} else
	//*  29   63:aload_0         
	//*  30   64:new             #112 <Class zzabv>
	//*  31   67:dup             
	//*  32   68:invokespecial   #113 <Method void zzabv()>
	//*  33   71:putfield        #115 <Field zzabv zzaCM>
	//*  34   74:aload_0         
	//*  35   75:new             #117 <Class HashMap>
	//*  36   78:dup             
	//*  37   79:invokespecial   #118 <Method void HashMap()>
	//*  38   82:putfield        #120 <Field Map zzaCN>
	//*  39   85:aload_0         
	//*  40   86:new             #117 <Class HashMap>
	//*  41   89:dup             
	//*  42   90:invokespecial   #118 <Method void HashMap()>
	//*  43   93:putfield        #122 <Field Map zzaCO>
	//*  44   96:aload_0         
	//*  45   97:new             #117 <Class HashMap>
	//*  46  100:dup             
	//*  47  101:invokespecial   #118 <Method void HashMap()>
	//*  48  104:putfield        #124 <Field Map zzaCP>
	//*  49  107:return          
		{
			zzaCL = null;
	//   50  108:aload_0         
	//   51  109:aconst_null     
	//   52  110:putfield        #101 <Field ImageManager$zzb zzaCL>
		}
	//*  53  113:goto            63
	}

	public static ImageManager create(Context context)
	{
		return zzg(context, false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #130 <Method ImageManager zzg(Context, boolean)>
	//    3    5:areturn         
	}

	static Bitmap zza(ImageManager imagemanager, zza.zza zza1)
	{
		return imagemanager.zza(zza1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #134 <Method Bitmap zza(zza$zza)>
	//    3    5:areturn         
	}

	private Bitmap zza(zza.zza zza1)
	{
		if(zzaCL == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field ImageManager$zzb zzaCL>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return (Bitmap)zzaCL.get(((Object) (zza1)));
	//    5    9:aload_0         
	//    6   10:getfield        #101 <Field ImageManager$zzb zzaCL>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #138 <Method Object ImageManager$zzb.get(Object)>
	//    9   17:checkcast       #140 <Class Bitmap>
	//   10   20:areturn         
	}

	static Map zza(ImageManager imagemanager)
	{
		return imagemanager.zzaCN;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field Map zzaCN>
	//    2    4:areturn         
	}

	static Context zzb(ImageManager imagemanager)
	{
		return imagemanager.mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field Context mContext>
	//    2    4:areturn         
	}

	static zzabv zzc(ImageManager imagemanager)
	{
		return imagemanager.zzaCM;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field zzabv zzaCM>
	//    2    4:areturn         
	}

	static Map zzd(ImageManager imagemanager)
	{
		return imagemanager.zzaCP;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field Map zzaCP>
	//    2    4:areturn         
	}

	static Map zze(ImageManager imagemanager)
	{
		return imagemanager.zzaCO;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field Map zzaCO>
	//    2    4:areturn         
	}

	static ExecutorService zzf(ImageManager imagemanager)
	{
		return imagemanager.zzaCK;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field ExecutorService zzaCK>
	//    2    4:areturn         
	}

	static Handler zzg(ImageManager imagemanager)
	{
		return imagemanager.mHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field Handler mHandler>
	//    2    4:areturn         
	}

	public static ImageManager zzg(Context context, boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            26
		{
			if(zzaCJ == null)
	//*   2    4:getstatic       #147 <Field ImageManager zzaCJ>
	//*   3    7:ifnonnull       22
				zzaCJ = new ImageManager(context, true);
	//    4   10:new             #2   <Class ImageManager>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:invokespecial   #149 <Method void ImageManager(Context, boolean)>
	//    9   19:putstatic       #147 <Field ImageManager zzaCJ>
			return zzaCJ;
	//   10   22:getstatic       #147 <Field ImageManager zzaCJ>
	//   11   25:areturn         
		}
		if(zzaCI == null)
	//*  12   26:getstatic       #151 <Field ImageManager zzaCI>
	//*  13   29:ifnonnull       44
			zzaCI = new ImageManager(context, false);
	//   14   32:new             #2   <Class ImageManager>
	//   15   35:dup             
	//   16   36:aload_0         
	//   17   37:iconst_0        
	//   18   38:invokespecial   #149 <Method void ImageManager(Context, boolean)>
	//   19   41:putstatic       #151 <Field ImageManager zzaCI>
		return zzaCI;
	//   20   44:getstatic       #151 <Field ImageManager zzaCI>
	//   21   47:areturn         
	}

	static zzb zzh(ImageManager imagemanager)
	{
		return imagemanager.zzaCL;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field ImageManager$zzb zzaCL>
	//    2    4:areturn         
	}

	static Object zzui()
	{
		return zzaCG;
	//    0    0:getstatic       #60  <Field Object zzaCG>
	//    1    3:areturn         
	}

	private void zzwJ()
	{
		mContext.registerComponentCallbacks(((android.content.ComponentCallbacks) (new zze(zzaCL))));
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field Context mContext>
	//    2    4:new             #24  <Class ImageManager$zze>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #101 <Field ImageManager$zzb zzaCL>
	//    6   12:invokespecial   #161 <Method void ImageManager$zze(ImageManager$zzb)>
	//    7   15:invokevirtual   #165 <Method void Context.registerComponentCallbacks(android.content.ComponentCallbacks)>
	//    8   18:return          
	}

	static HashSet zzwK()
	{
		return zzaCH;
	//    0    0:getstatic       #65  <Field HashSet zzaCH>
	//    1    3:areturn         
	}

	public void loadImage(ImageView imageview, int i)
	{
		zza(((com.google.android.gms.common.images.zza) (new zza.zzb(imageview, i))));
	//    0    0:aload_0         
	//    1    1:new             #172 <Class zza$zzb>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #174 <Method void zza$zzb(ImageView, int)>
	//    6   10:invokevirtual   #177 <Method void zza(zza)>
	//    7   13:return          
	}

	public void loadImage(ImageView imageview, Uri uri)
	{
		zza(((com.google.android.gms.common.images.zza) (new zza.zzb(imageview, uri))));
	//    0    0:aload_0         
	//    1    1:new             #172 <Class zza$zzb>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #180 <Method void zza$zzb(ImageView, Uri)>
	//    6   10:invokevirtual   #177 <Method void zza(zza)>
	//    7   13:return          
	}

	public void loadImage(ImageView imageview, Uri uri, int i)
	{
		imageview = ((ImageView) (new zza.zzb(imageview, uri)));
	//    0    0:new             #172 <Class zza$zzb>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #180 <Method void zza$zzb(ImageView, Uri)>
	//    5    9:astore_1        
		((com.google.android.gms.common.images.zza) (imageview)).zzcI(i);
	//    6   10:aload_1         
	//    7   11:iload_3         
	//    8   12:invokevirtual   #187 <Method void zza.zzcI(int)>
		zza(((com.google.android.gms.common.images.zza) (imageview)));
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #177 <Method void zza(zza)>
	//   12   20:return          
	}

	public void loadImage(OnImageLoadedListener onimageloadedlistener, Uri uri)
	{
		zza(((com.google.android.gms.common.images.zza) (new zza.zzc(onimageloadedlistener, uri))));
	//    0    0:aload_0         
	//    1    1:new             #190 <Class zza$zzc>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #192 <Method void zza$zzc(ImageManager$OnImageLoadedListener, Uri)>
	//    6   10:invokevirtual   #177 <Method void zza(zza)>
	//    7   13:return          
	}

	public void loadImage(OnImageLoadedListener onimageloadedlistener, Uri uri, int i)
	{
		onimageloadedlistener = ((OnImageLoadedListener) (new zza.zzc(onimageloadedlistener, uri)));
	//    0    0:new             #190 <Class zza$zzc>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #192 <Method void zza$zzc(ImageManager$OnImageLoadedListener, Uri)>
	//    5    9:astore_1        
		((com.google.android.gms.common.images.zza) (onimageloadedlistener)).zzcI(i);
	//    6   10:aload_1         
	//    7   11:iload_3         
	//    8   12:invokevirtual   #187 <Method void zza.zzcI(int)>
		zza(((com.google.android.gms.common.images.zza) (onimageloadedlistener)));
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #177 <Method void zza(zza)>
	//   12   20:return          
	}

	public void zza(com.google.android.gms.common.images.zza zza1)
	{
		com.google.android.gms.common.internal.zzc.zzdn("ImageManager.loadImage() must be called in the main thread");
	//    0    0:ldc1            #195 <String "ImageManager.loadImage() must be called in the main thread">
	//    1    2:invokestatic    #201 <Method void zzc.zzdn(String)>
		((Runnable) (new zzd(zza1))).run();
	//    2    5:new             #21  <Class ImageManager$zzd>
	//    3    8:dup             
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:invokespecial   #204 <Method void ImageManager$zzd(ImageManager, zza)>
	//    7   14:invokeinterface #209 <Method void Runnable.run()>
	//    8   19:return          
	}

	private static final Object zzaCG = new Object();
	private static HashSet zzaCH = new HashSet();
	private static ImageManager zzaCI;
	private static ImageManager zzaCJ;
	private final Context mContext;
	private final Handler mHandler = new Handler(Looper.getMainLooper());
	private final ExecutorService zzaCK = Executors.newFixedThreadPool(4);
	private final zzb zzaCL;
	private final zzabv zzaCM = new zzabv();
	private final Map zzaCN = new HashMap();
	private final Map zzaCO = new HashMap();
	private final Map zzaCP = new HashMap();

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #58  <Method void Object()>
	//    3    7:putstatic       #60  <Field Object zzaCG>
	//    4   10:new             #62  <Class HashSet>
	//    5   13:dup             
	//    6   14:invokespecial   #63  <Method void HashSet()>
	//    7   17:putstatic       #65  <Field HashSet zzaCH>
	//*   8   20:return          
	}
}
