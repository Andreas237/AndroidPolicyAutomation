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
import com.google.android.gms.internal.zzacd;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.*;

// Referenced classes of package com.google.android.gms.common.images:
//			zza

public final class ImageManager
{
	final class ImageReceiver extends ResultReceiver
	{

		static ArrayList zza(ImageReceiver imagereceiver)
		{
			return imagereceiver.zzaEp;
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field ArrayList zzaEp>
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
			ImageManager.zzf(zzaEq).execute(((Runnable) (((zzb) (zzaEq)). new zzb(mUri, ((ParcelFileDescriptor) (bundle))))));
		//    5   10:aload_0         
		//    6   11:getfield        #19  <Field ImageManager zzaEq>
		//    7   14:invokestatic    #61  <Method ExecutorService ImageManager.zzf(ImageManager)>
		//    8   17:new             #63  <Class ImageManager$zzb>
		//    9   20:dup             
		//   10   21:aload_0         
		//   11   22:getfield        #19  <Field ImageManager zzaEq>
		//   12   25:aload_0         
		//   13   26:getfield        #35  <Field Uri mUri>
		//   14   29:aload_2         
		//   15   30:invokespecial   #66  <Method void ImageManager$zzb(ImageManager, Uri, ParcelFileDescriptor)>
		//   16   33:invokeinterface #72  <Method void ExecutorService.execute(Runnable)>
		//   17   38:return          
		}

		public void zzb(com.google.android.gms.common.images.zza zza1)
		{
			com.google.android.gms.common.internal.zzc.zzdj("ImageReceiver.addImageRequest() must be called in the main thread");
		//    0    0:ldc1            #76  <String "ImageReceiver.addImageRequest() must be called in the main thread">
		//    1    2:invokestatic    #82  <Method void zzc.zzdj(String)>
			zzaEp.add(((Object) (zza1)));
		//    2    5:aload_0         
		//    3    6:getfield        #42  <Field ArrayList zzaEp>
		//    4    9:aload_1         
		//    5   10:invokevirtual   #86  <Method boolean ArrayList.add(Object)>
		//    6   13:pop             
		//    7   14:return          
		}

		public void zzc(com.google.android.gms.common.images.zza zza1)
		{
			com.google.android.gms.common.internal.zzc.zzdj("ImageReceiver.removeImageRequest() must be called in the main thread");
		//    0    0:ldc1            #89  <String "ImageReceiver.removeImageRequest() must be called in the main thread">
		//    1    2:invokestatic    #82  <Method void zzc.zzdj(String)>
			zzaEp.remove(((Object) (zza1)));
		//    2    5:aload_0         
		//    3    6:getfield        #42  <Field ArrayList zzaEp>
		//    4    9:aload_1         
		//    5   10:invokevirtual   #92  <Method boolean ArrayList.remove(Object)>
		//    6   13:pop             
		//    7   14:return          
		}

		public void zzxr()
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
			ImageManager.zzb(zzaEq).sendBroadcast(intent);
		//   21   37:aload_0         
		//   22   38:getfield        #19  <Field ImageManager zzaEq>
		//   23   41:invokestatic    #115 <Method Context ImageManager.zzb(ImageManager)>
		//   24   44:aload_1         
		//   25   45:invokevirtual   #121 <Method void Context.sendBroadcast(Intent)>
		//   26   48:return          
		}

		private final Uri mUri;
		private final ArrayList zzaEp = new ArrayList();
		final ImageManager zzaEq;

		ImageReceiver(Uri uri)
		{
			zzaEq = ImageManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field ImageManager zzaEq>
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
		//   16   32:putfield        #42  <Field ArrayList zzaEp>
		//   17   35:return          
		}
	}

	public static interface OnImageLoadedListener
	{

		public abstract void onImageLoaded(Uri uri, Drawable drawable, boolean flag);
	}

	static final class zza extends LruCache
	{

		private static int zzaR(Context context)
		{
			ActivityManager activitymanager = (ActivityManager)context.getSystemService("activity");
		//    0    0:aload_0         
		//    1    1:ldc1            #20  <String "activity">
		//    2    3:invokevirtual   #26  <Method Object Context.getSystemService(String)>
		//    3    6:checkcast       #28  <Class ActivityManager>
		//    4    9:astore_2        
			boolean flag;
			if((context.getApplicationInfo().flags & 0x100000) != 0)
		//*   5   10:aload_0         
		//*   6   11:invokevirtual   #32  <Method ApplicationInfo Context.getApplicationInfo()>
		//*   7   14:getfield        #38  <Field int ApplicationInfo.flags>
		//*   8   17:ldc1            #39  <Int 0x100000>
		//*   9   19:iand            
		//*  10   20:ifeq            28
				flag = true;
		//   11   23:iconst_1        
		//   12   24:istore_1        
			else
		//*  13   25:goto            30
				flag = false;
		//   14   28:iconst_0        
		//   15   29:istore_1        
			int i;
			if(flag)
		//*  16   30:iload_1         
		//*  17   31:ifeq            42
				i = activitymanager.getLargeMemoryClass();
		//   18   34:aload_2         
		//   19   35:invokevirtual   #43  <Method int ActivityManager.getLargeMemoryClass()>
		//   20   38:istore_1        
			else
		//*  21   39:goto            47
				i = activitymanager.getMemoryClass();
		//   22   42:aload_2         
		//   23   43:invokevirtual   #46  <Method int ActivityManager.getMemoryClass()>
		//   24   46:istore_1        
			return (int)((float)(0x100000 * i) * 0.33F);
		//   25   47:ldc1            #39  <Int 0x100000>
		//   26   49:iload_1         
		//   27   50:imul            
		//   28   51:i2f             
		//   29   52:ldc1            #47  <Float 0.33F>
		//   30   54:fmul            
		//   31   55:f2i             
		//   32   56:ireturn         
		}

		public void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
		{
			zza(flag, (zza.zza)obj, (Bitmap)obj1, (Bitmap)obj2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #51  <Class zza$zza>
		//    4    6:aload_3         
		//    5    7:checkcast       #53  <Class Bitmap>
		//    6   10:aload           4
		//    7   12:checkcast       #53  <Class Bitmap>
		//    8   15:invokevirtual   #56  <Method void zza(boolean, zza$zza, Bitmap, Bitmap)>
		//    9   18:return          
		}

		public int sizeOf(Object obj, Object obj1)
		{
			return zza((zza.zza)obj, (Bitmap)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #51  <Class zza$zza>
		//    3    5:aload_2         
		//    4    6:checkcast       #53  <Class Bitmap>
		//    5    9:invokevirtual   #61  <Method int zza(zza$zza, Bitmap)>
		//    6   12:ireturn         
		}

		protected int zza(zza.zza zza1, Bitmap bitmap)
		{
			return bitmap.getHeight() * bitmap.getRowBytes();
		//    0    0:aload_2         
		//    1    1:invokevirtual   #64  <Method int Bitmap.getHeight()>
		//    2    4:aload_2         
		//    3    5:invokevirtual   #67  <Method int Bitmap.getRowBytes()>
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
		//    5    6:invokespecial   #69  <Method void LruCache.entryRemoved(boolean, Object, Object, Object)>
		//    6    9:return          
		}

		public zza(Context context)
		{
			super(zzaR(context));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #14  <Method int zzaR(Context)>
		//    3    5:invokespecial   #17  <Method void LruCache(int)>
		//    4    8:return          
		}
	}

	final class zzb
		implements Runnable
	{

		public void run()
		{
			boolean flag;
			boolean flag1;
			Object obj;
			Object obj1;
			com.google.android.gms.common.internal.zzc.zzdk("LoadBitmapFromDiskRunnable can't be executed in the main thread");
		//    0    0:ldc1            #36  <String "LoadBitmapFromDiskRunnable can't be executed in the main thread">
		//    1    2:invokestatic    #42  <Method void zzc.zzdk(String)>
			flag = false;
		//    2    5:iconst_0        
		//    3    6:istore_1        
			flag1 = false;
		//    4    7:iconst_0        
		//    5    8:istore_2        
			obj = null;
		//    6    9:aconst_null     
		//    7   10:astore_3        
			obj1 = null;
		//    8   11:aconst_null     
		//    9   12:astore          4
			if(zzaEr == null)
				break MISSING_BLOCK_LABEL_112;
		//   10   14:aload_0         
		//   11   15:getfield        #26  <Field ParcelFileDescriptor zzaEr>
		//   12   18:ifnull          112
			obj = ((Object) (BitmapFactory.decodeFileDescriptor(zzaEr.getFileDescriptor())));
		//   13   21:aload_0         
		//   14   22:getfield        #26  <Field ParcelFileDescriptor zzaEr>
		//   15   25:invokevirtual   #48  <Method java.io.FileDescriptor ParcelFileDescriptor.getFileDescriptor()>
		//   16   28:invokestatic    #54  <Method Bitmap BitmapFactory.decodeFileDescriptor(java.io.FileDescriptor)>
		//   17   31:astore_3        
			flag = flag1;
		//   18   32:iload_2         
		//   19   33:istore_1        
			break MISSING_BLOCK_LABEL_90;
		//   20   34:goto            90
			obj;
		//   21   37:astore_3        
			String s = String.valueOf(((Object) (mUri)));
		//   22   38:aload_0         
		//   23   39:getfield        #24  <Field Uri mUri>
		//   24   42:invokestatic    #60  <Method String String.valueOf(Object)>
		//   25   45:astore          5
			Log.e("ImageManager", (new StringBuilder(String.valueOf(((Object) (s))).length() + 34)).append("OOM while loading bitmap for uri: ").append(s).toString(), ((Throwable) (obj)));
		//   26   47:ldc1            #62  <String "ImageManager">
		//   27   49:new             #64  <Class StringBuilder>
		//   28   52:dup             
		//   29   53:aload           5
		//   30   55:invokestatic    #60  <Method String String.valueOf(Object)>
		//   31   58:invokevirtual   #68  <Method int String.length()>
		//   32   61:bipush          34
		//   33   63:iadd            
		//   34   64:invokespecial   #71  <Method void StringBuilder(int)>
		//   35   67:ldc1            #73  <String "OOM while loading bitmap for uri: ">
		//   36   69:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   37   72:aload           5
		//   38   74:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   39   77:invokevirtual   #81  <Method String StringBuilder.toString()>
		//   40   80:aload_3         
		//   41   81:invokestatic    #87  <Method int Log.e(String, String, Throwable)>
		//   42   84:pop             
			flag = true;
		//   43   85:iconst_1        
		//   44   86:istore_1        
			obj = ((Object) (obj1));
		//   45   87:aload           4
		//   46   89:astore_3        
			try
			{
				zzaEr.close();
		//   47   90:aload_0         
		//   48   91:getfield        #26  <Field ParcelFileDescriptor zzaEr>
		//   49   94:invokevirtual   #90  <Method void ParcelFileDescriptor.close()>
			}
		//*  50   97:goto            112
			catch(IOException ioexception)
		//*  51  100:astore          4
			{
				Log.e("ImageManager", "closed failed", ((Throwable) (ioexception)));
		//   52  102:ldc1            #62  <String "ImageManager">
		//   53  104:ldc1            #92  <String "closed failed">
		//   54  106:aload           4
		//   55  108:invokestatic    #87  <Method int Log.e(String, String, Throwable)>
		//   56  111:pop             
			}
			InterruptedException interruptedexception;
			CountDownLatch countdownlatch = new CountDownLatch(1);
		//   57  112:new             #94  <Class CountDownLatch>
		//   58  115:dup             
		//   59  116:iconst_1        
		//   60  117:invokespecial   #95  <Method void CountDownLatch(int)>
		//   61  120:astore          4
			ImageManager.zzg(zzaEq).post(((Runnable) (((zze) (zzaEq)). new zze(mUri, ((Bitmap) (obj)), flag, countdownlatch))));
		//   62  122:aload_0         
		//   63  123:getfield        #19  <Field ImageManager zzaEq>
		//   64  126:invokestatic    #99  <Method Handler ImageManager.zzg(ImageManager)>
		//   65  129:new             #101 <Class ImageManager$zze>
		//   66  132:dup             
		//   67  133:aload_0         
		//   68  134:getfield        #19  <Field ImageManager zzaEq>
		//   69  137:aload_0         
		//   70  138:getfield        #24  <Field Uri mUri>
		//   71  141:aload_3         
		//   72  142:iload_1         
		//   73  143:aload           4
		//   74  145:invokespecial   #104 <Method void ImageManager$zze(ImageManager, Uri, Bitmap, boolean, CountDownLatch)>
		//   75  148:invokevirtual   #110 <Method boolean Handler.post(Runnable)>
		//   76  151:pop             
			try
			{
				countdownlatch.await();
		//   77  152:aload           4
		//   78  154:invokevirtual   #113 <Method void CountDownLatch.await()>
				return;
		//   79  157:return          
			}
		//*  80  158:aload_0         
		//*  81  159:getfield        #24  <Field Uri mUri>
		//*  82  162:invokestatic    #60  <Method String String.valueOf(Object)>
		//*  83  165:astore_3        
		//*  84  166:ldc1            #62  <String "ImageManager">
		//*  85  168:new             #64  <Class StringBuilder>
		//*  86  171:dup             
		//*  87  172:aload_3         
		//*  88  173:invokestatic    #60  <Method String String.valueOf(Object)>
		//*  89  176:invokevirtual   #68  <Method int String.length()>
		//*  90  179:bipush          32
		//*  91  181:iadd            
		//*  92  182:invokespecial   #71  <Method void StringBuilder(int)>
		//*  93  185:ldc1            #115 <String "Latch interrupted while posting ">
		//*  94  187:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//*  95  190:aload_3         
		//*  96  191:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//*  97  194:invokevirtual   #81  <Method String StringBuilder.toString()>
		//*  98  197:invokestatic    #119 <Method int Log.w(String, String)>
		//*  99  200:pop             
		//* 100  201:return          
			// Misplaced declaration of an exception variable
			catch(InterruptedException interruptedexception)
			{
				obj = ((Object) (String.valueOf(((Object) (mUri)))));
			}
			Log.w("ImageManager", (new StringBuilder(String.valueOf(obj).length() + 32)).append("Latch interrupted while posting ").append(((String) (obj))).toString());
			return;
		//* 101  202:astore_3        
		//* 102  203:goto            158
		}

		private final Uri mUri;
		final ImageManager zzaEq;
		private final ParcelFileDescriptor zzaEr;

		public zzb(Uri uri, ParcelFileDescriptor parcelfiledescriptor)
		{
			zzaEq = ImageManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field ImageManager zzaEq>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #22  <Method void Object()>
			mUri = uri;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field Uri mUri>
			zzaEr = parcelfiledescriptor;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #26  <Field ParcelFileDescriptor zzaEr>
		//   11   19:return          
		}
	}

	final class zzc
		implements Runnable
	{

		public void run()
		{
			Object obj;
			zza.zza zza1;
			com.google.android.gms.common.internal.zzc.zzdj("LoadImageRunnable must be executed on the main thread");
		//    0    0:ldc1            #26  <String "LoadImageRunnable must be executed on the main thread">
		//    1    2:invokestatic    #32  <Method void zzc.zzdj(String)>
			obj = ((Object) ((ImageReceiver)ImageManager.zza(zzaEq).get(((Object) (zzaEs)))));
		//    2    5:aload_0         
		//    3    6:getfield        #17  <Field ImageManager zzaEq>
		//    4    9:invokestatic    #36  <Method Map ImageManager.zza(ImageManager)>
		//    5   12:aload_0         
		//    6   13:getfield        #22  <Field zza zzaEs>
		//    7   16:invokeinterface #42  <Method Object Map.get(Object)>
		//    8   21:checkcast       #44  <Class ImageManager$ImageReceiver>
		//    9   24:astore_1        
			if(obj != null)
		//*  10   25:aload_1         
		//*  11   26:ifnull          54
			{
				ImageManager.zza(zzaEq).remove(((Object) (zzaEs)));
		//   12   29:aload_0         
		//   13   30:getfield        #17  <Field ImageManager zzaEq>
		//   14   33:invokestatic    #36  <Method Map ImageManager.zza(ImageManager)>
		//   15   36:aload_0         
		//   16   37:getfield        #22  <Field zza zzaEs>
		//   17   40:invokeinterface #47  <Method Object Map.remove(Object)>
		//   18   45:pop             
				((ImageReceiver) (obj)).zzc(zzaEs);
		//   19   46:aload_1         
		//   20   47:aload_0         
		//   21   48:getfield        #22  <Field zza zzaEs>
		//   22   51:invokevirtual   #50  <Method void com.google.android.gms.common.images.ImageManager$ImageReceiver.zzc(zza)>
			}
			zza1 = zzaEs.zzaEu;
		//   23   54:aload_0         
		//   24   55:getfield        #22  <Field zza zzaEs>
		//   25   58:getfield        #56  <Field zza$zza zza.zzaEu>
		//   26   61:astore_3        
			if(zza1.uri == null)
		//*  27   62:aload_3         
		//*  28   63:getfield        #62  <Field Uri zza$zza.uri>
		//*  29   66:ifnonnull       92
			{
				zzaEs.zza(ImageManager.zzb(zzaEq), com.google.android.gms.common.images.ImageManager.zzc(zzaEq), true);
		//   30   69:aload_0         
		//   31   70:getfield        #22  <Field zza zzaEs>
		//   32   73:aload_0         
		//   33   74:getfield        #17  <Field ImageManager zzaEq>
		//   34   77:invokestatic    #66  <Method Context ImageManager.zzb(ImageManager)>
		//   35   80:aload_0         
		//   36   81:getfield        #17  <Field ImageManager zzaEq>
		//   37   84:invokestatic    #69  <Method zzacd com.google.android.gms.common.images.ImageManager.zzc(ImageManager)>
		//   38   87:iconst_1        
		//   39   88:invokevirtual   #72  <Method void zza.zza(Context, zzacd, boolean)>
				return;
		//   40   91:return          
			}
			obj = ((Object) (ImageManager.zza(zzaEq, zza1)));
		//   41   92:aload_0         
		//   42   93:getfield        #17  <Field ImageManager zzaEq>
		//   43   96:aload_3         
		//   44   97:invokestatic    #75  <Method Bitmap ImageManager.zza(ImageManager, zza$zza)>
		//   45  100:astore_1        
			if(obj != null)
		//*  46  101:aload_1         
		//*  47  102:ifnull          122
			{
				zzaEs.zza(ImageManager.zzb(zzaEq), ((Bitmap) (obj)), true);
		//   48  105:aload_0         
		//   49  106:getfield        #22  <Field zza zzaEs>
		//   50  109:aload_0         
		//   51  110:getfield        #17  <Field ImageManager zzaEq>
		//   52  113:invokestatic    #66  <Method Context ImageManager.zzb(ImageManager)>
		//   53  116:aload_1         
		//   54  117:iconst_1        
		//   55  118:invokevirtual   #78  <Method void zza.zza(Context, Bitmap, boolean)>
				return;
		//   56  121:return          
			}
			obj = ((Object) ((Long)ImageManager.zzd(zzaEq).get(((Object) (zza1.uri)))));
		//   57  122:aload_0         
		//   58  123:getfield        #17  <Field ImageManager zzaEq>
		//   59  126:invokestatic    #81  <Method Map ImageManager.zzd(ImageManager)>
		//   60  129:aload_3         
		//   61  130:getfield        #62  <Field Uri zza$zza.uri>
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
					zzaEs.zza(ImageManager.zzb(zzaEq), com.google.android.gms.common.images.ImageManager.zzc(zzaEq), true);
		//   74  161:aload_0         
		//   75  162:getfield        #22  <Field zza zzaEs>
		//   76  165:aload_0         
		//   77  166:getfield        #17  <Field ImageManager zzaEq>
		//   78  169:invokestatic    #66  <Method Context ImageManager.zzb(ImageManager)>
		//   79  172:aload_0         
		//   80  173:getfield        #17  <Field ImageManager zzaEq>
		//   81  176:invokestatic    #69  <Method zzacd com.google.android.gms.common.images.ImageManager.zzc(ImageManager)>
		//   82  179:iconst_1        
		//   83  180:invokevirtual   #72  <Method void zza.zza(Context, zzacd, boolean)>
					return;
		//   84  183:return          
				}
				ImageManager.zzd(zzaEq).remove(((Object) (zza1.uri)));
		//   85  184:aload_0         
		//   86  185:getfield        #17  <Field ImageManager zzaEq>
		//   87  188:invokestatic    #81  <Method Map ImageManager.zzd(ImageManager)>
		//   88  191:aload_3         
		//   89  192:getfield        #62  <Field Uri zza$zza.uri>
		//   90  195:invokeinterface #47  <Method Object Map.remove(Object)>
		//   91  200:pop             
			}
			zzaEs.zza(ImageManager.zzb(zzaEq), com.google.android.gms.common.images.ImageManager.zzc(zzaEq));
		//   92  201:aload_0         
		//   93  202:getfield        #22  <Field zza zzaEs>
		//   94  205:aload_0         
		//   95  206:getfield        #17  <Field ImageManager zzaEq>
		//   96  209:invokestatic    #66  <Method Context ImageManager.zzb(ImageManager)>
		//   97  212:aload_0         
		//   98  213:getfield        #17  <Field ImageManager zzaEq>
		//   99  216:invokestatic    #69  <Method zzacd com.google.android.gms.common.images.ImageManager.zzc(ImageManager)>
		//  100  219:invokevirtual   #97  <Method void zza.zza(Context, zzacd)>
			ImageReceiver imagereceiver = (ImageReceiver)ImageManager.zze(zzaEq).get(((Object) (zza1.uri)));
		//  101  222:aload_0         
		//  102  223:getfield        #17  <Field ImageManager zzaEq>
		//  103  226:invokestatic    #100 <Method Map ImageManager.zze(ImageManager)>
		//  104  229:aload_3         
		//  105  230:getfield        #62  <Field Uri zza$zza.uri>
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
				obj = ((Object) (((ImageReceiver) (zzaEq)). new ImageReceiver(zza1.uri)));
		//  113  248:new             #44  <Class ImageManager$ImageReceiver>
		//  114  251:dup             
		//  115  252:aload_0         
		//  116  253:getfield        #17  <Field ImageManager zzaEq>
		//  117  256:aload_3         
		//  118  257:getfield        #62  <Field Uri zza$zza.uri>
		//  119  260:invokespecial   #103 <Method void ImageManager$ImageReceiver(ImageManager, Uri)>
		//  120  263:astore_1        
				ImageManager.zze(zzaEq).put(((Object) (zza1.uri)), obj);
		//  121  264:aload_0         
		//  122  265:getfield        #17  <Field ImageManager zzaEq>
		//  123  268:invokestatic    #100 <Method Map ImageManager.zze(ImageManager)>
		//  124  271:aload_3         
		//  125  272:getfield        #62  <Field Uri zza$zza.uri>
		//  126  275:aload_1         
		//  127  276:invokeinterface #107 <Method Object Map.put(Object, Object)>
		//  128  281:pop             
			}
			((ImageReceiver) (obj)).zzb(zzaEs);
		//  129  282:aload_1         
		//  130  283:aload_0         
		//  131  284:getfield        #22  <Field zza zzaEs>
		//  132  287:invokevirtual   #109 <Method void ImageManager$ImageReceiver.zzb(zza)>
			if(!(zzaEs instanceof zza.zzc))
		//* 133  290:aload_0         
		//* 134  291:getfield        #22  <Field zza zzaEs>
		//* 135  294:instanceof      #111 <Class zza$zzc>
		//* 136  297:ifne            318
				ImageManager.zza(zzaEq).put(((Object) (zzaEs)), obj);
		//  137  300:aload_0         
		//  138  301:getfield        #17  <Field ImageManager zzaEq>
		//  139  304:invokestatic    #36  <Method Map ImageManager.zza(ImageManager)>
		//  140  307:aload_0         
		//  141  308:getfield        #22  <Field zza zzaEs>
		//  142  311:aload_1         
		//  143  312:invokeinterface #107 <Method Object Map.put(Object, Object)>
		//  144  317:pop             
			Object obj1 = ImageManager.zzuH();
		//  145  318:invokestatic    #115 <Method Object ImageManager.zzuH()>
		//  146  321:astore_2        
			obj1;
		//  147  322:aload_2         
			JVM INSTR monitorenter ;
		//  148  323:monitorenter    
			if(!ImageManager.zzxq().contains(((Object) (zza1.uri))))
		//* 149  324:invokestatic    #119 <Method HashSet ImageManager.zzxq()>
		//* 150  327:aload_3         
		//* 151  328:getfield        #62  <Field Uri zza$zza.uri>
		//* 152  331:invokevirtual   #125 <Method boolean HashSet.contains(Object)>
		//* 153  334:ifne            352
			{
				ImageManager.zzxq().add(((Object) (zza1.uri)));
		//  154  337:invokestatic    #119 <Method HashSet ImageManager.zzxq()>
		//  155  340:aload_3         
		//  156  341:getfield        #62  <Field Uri zza$zza.uri>
		//  157  344:invokevirtual   #128 <Method boolean HashSet.add(Object)>
		//  158  347:pop             
				((ImageReceiver) (obj)).zzxr();
		//  159  348:aload_1         
		//  160  349:invokevirtual   #131 <Method void ImageManager$ImageReceiver.zzxr()>
			}
			obj1;
		//  161  352:aload_2         
			JVM INSTR monitorexit ;
		//  162  353:monitorexit     
			return;
		//  163  354:return          
			Exception exception;
			exception;
		//  164  355:astore_1        
		//* 165  356:aload_2         
			throw exception;
		//  166  357:monitorexit     
		//  167  358:aload_1         
		//  168  359:athrow          
		}

		final ImageManager zzaEq;
		private final com.google.android.gms.common.images.zza zzaEs;

		public zzc(com.google.android.gms.common.images.zza zza1)
		{
			zzaEq = ImageManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field ImageManager zzaEq>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
			zzaEs = zza1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field zza zzaEs>
		//    8   14:return          
		}
	}

	static final class zzd
		implements ComponentCallbacks2
	{

		public void onConfigurationChanged(Configuration configuration)
		{
		//    0    0:return          
		}

		public void onLowMemory()
		{
			zzaEk.evictAll();
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field ImageManager$zza zzaEk>
		//    2    4:invokevirtual   #27  <Method void ImageManager$zza.evictAll()>
		//    3    7:return          
		}

		public void onTrimMemory(int i)
		{
			if(i >= 60)
		//*   0    0:iload_1         
		//*   1    1:bipush          60
		//*   2    3:icmplt          14
			{
				zzaEk.evictAll();
		//    3    6:aload_0         
		//    4    7:getfield        #18  <Field ImageManager$zza zzaEk>
		//    5   10:invokevirtual   #27  <Method void ImageManager$zza.evictAll()>
				return;
		//    6   13:return          
			}
			if(i >= 20)
		//*   7   14:iload_1         
		//*   8   15:bipush          20
		//*   9   17:icmplt          36
				zzaEk.trimToSize(zzaEk.size() / 2);
		//   10   20:aload_0         
		//   11   21:getfield        #18  <Field ImageManager$zza zzaEk>
		//   12   24:aload_0         
		//   13   25:getfield        #18  <Field ImageManager$zza zzaEk>
		//   14   28:invokevirtual   #33  <Method int ImageManager$zza.size()>
		//   15   31:iconst_2        
		//   16   32:idiv            
		//   17   33:invokevirtual   #36  <Method void ImageManager$zza.trimToSize(int)>
		//   18   36:return          
		}

		private final zza zzaEk;

		public zzd(zza zza1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			zzaEk = zza1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field ImageManager$zza zzaEk>
		//    5    9:return          
		}
	}

	final class zze
		implements Runnable
	{

		private void zza(ImageReceiver imagereceiver, boolean flag)
		{
			imagereceiver = ((ImageReceiver) (ImageReceiver.zza(imagereceiver)));
		//    0    0:aload_1         
		//    1    1:invokestatic    #42  <Method ArrayList ImageManager$ImageReceiver.zza(ImageManager$ImageReceiver)>
		//    2    4:astore_1        
			int i = 0;
		//    3    5:iconst_0        
		//    4    6:istore_3        
			for(int j = ((ArrayList) (imagereceiver)).size(); i < j; i++)
		//*   5    7:aload_1         
		//*   6    8:invokevirtual   #48  <Method int ArrayList.size()>
		//*   7   11:istore          4
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
		//*  17   30:ifeq            53
				{
					zza1.zza(ImageManager.zzb(zzaEq), mBitmap, false);
		//   18   33:aload           5
		//   19   35:aload_0         
		//   20   36:getfield        #23  <Field ImageManager zzaEq>
		//   21   39:invokestatic    #58  <Method Context ImageManager.zzb(ImageManager)>
		//   22   42:aload_0         
		//   23   43:getfield        #30  <Field Bitmap mBitmap>
		//   24   46:iconst_0        
		//   25   47:invokevirtual   #61  <Method void zza.zza(Context, Bitmap, boolean)>
				} else
		//*  26   50:goto            96
				{
					ImageManager.zzd(zzaEq).put(((Object) (mUri)), ((Object) (Long.valueOf(SystemClock.elapsedRealtime()))));
		//   27   53:aload_0         
		//   28   54:getfield        #23  <Field ImageManager zzaEq>
		//   29   57:invokestatic    #65  <Method Map ImageManager.zzd(ImageManager)>
		//   30   60:aload_0         
		//   31   61:getfield        #28  <Field Uri mUri>
		//   32   64:invokestatic    #71  <Method long SystemClock.elapsedRealtime()>
		//   33   67:invokestatic    #77  <Method Long Long.valueOf(long)>
		//   34   70:invokeinterface #83  <Method Object Map.put(Object, Object)>
		//   35   75:pop             
					zza1.zza(ImageManager.zzb(zzaEq), com.google.android.gms.common.images.ImageManager.zzc(zzaEq), false);
		//   36   76:aload           5
		//   37   78:aload_0         
		//   38   79:getfield        #23  <Field ImageManager zzaEq>
		//   39   82:invokestatic    #58  <Method Context ImageManager.zzb(ImageManager)>
		//   40   85:aload_0         
		//   41   86:getfield        #23  <Field ImageManager zzaEq>
		//   42   89:invokestatic    #87  <Method zzacd com.google.android.gms.common.images.ImageManager.zzc(ImageManager)>
		//   43   92:iconst_0        
		//   44   93:invokevirtual   #90  <Method void zza.zza(Context, zzacd, boolean)>
				}
				if(!(zza1 instanceof zza.zzc))
		//*  45   96:aload           5
		//*  46   98:instanceof      #92  <Class zza$zzc>
		//*  47  101:ifne            119
					ImageManager.zza(zzaEq).remove(((Object) (zza1)));
		//   48  104:aload_0         
		//   49  105:getfield        #23  <Field ImageManager zzaEq>
		//   50  108:invokestatic    #94  <Method Map ImageManager.zza(ImageManager)>
		//   51  111:aload           5
		//   52  113:invokeinterface #98  <Method Object Map.remove(Object)>
		//   53  118:pop             
			}

		//   54  119:iload_3         
		//   55  120:iconst_1        
		//   56  121:iadd            
		//   57  122:istore_3        
		//*  58  123:goto            13
		//   59  126:return          
		}

		public void run()
		{
			com.google.android.gms.common.internal.zzc.zzdj("OnBitmapLoadedRunnable must be executed in the main thread");
		//    0    0:ldc1            #101 <String "OnBitmapLoadedRunnable must be executed in the main thread">
		//    1    2:invokestatic    #107 <Method void zzc.zzdj(String)>
			boolean flag;
			if(mBitmap != null)
		//*   2    5:aload_0         
		//*   3    6:getfield        #30  <Field Bitmap mBitmap>
		//*   4    9:ifnull          17
				flag = true;
		//    5   12:iconst_1        
		//    6   13:istore_1        
			else
		//*   7   14:goto            19
				flag = false;
		//    8   17:iconst_0        
		//    9   18:istore_1        
			if(ImageManager.zzh(zzaEq) != null)
		//*  10   19:aload_0         
		//*  11   20:getfield        #23  <Field ImageManager zzaEq>
		//*  12   23:invokestatic    #111 <Method ImageManager$zza ImageManager.zzh(ImageManager)>
		//*  13   26:ifnull          97
			{
				if(zzaEt)
		//*  14   29:aload_0         
		//*  15   30:getfield        #32  <Field boolean zzaEt>
		//*  16   33:ifeq            67
				{
					ImageManager.zzh(zzaEq).evictAll();
		//   17   36:aload_0         
		//   18   37:getfield        #23  <Field ImageManager zzaEq>
		//   19   40:invokestatic    #111 <Method ImageManager$zza ImageManager.zzh(ImageManager)>
		//   20   43:invokevirtual   #116 <Method void ImageManager$zza.evictAll()>
					System.gc();
		//   21   46:invokestatic    #121 <Method void System.gc()>
					zzaEt = false;
		//   22   49:aload_0         
		//   23   50:iconst_0        
		//   24   51:putfield        #32  <Field boolean zzaEt>
					ImageManager.zzg(zzaEq).post(((Runnable) (this)));
		//   25   54:aload_0         
		//   26   55:getfield        #23  <Field ImageManager zzaEq>
		//   27   58:invokestatic    #125 <Method Handler ImageManager.zzg(ImageManager)>
		//   28   61:aload_0         
		//   29   62:invokevirtual   #131 <Method boolean Handler.post(Runnable)>
		//   30   65:pop             
					return;
		//   31   66:return          
				}
				if(flag)
		//*  32   67:iload_1         
		//*  33   68:ifeq            97
					ImageManager.zzh(zzaEq).put(((Object) (new zza.zza(mUri))), ((Object) (mBitmap)));
		//   34   71:aload_0         
		//   35   72:getfield        #23  <Field ImageManager zzaEq>
		//   36   75:invokestatic    #111 <Method ImageManager$zza ImageManager.zzh(ImageManager)>
		//   37   78:new             #133 <Class zza$zza>
		//   38   81:dup             
		//   39   82:aload_0         
		//   40   83:getfield        #28  <Field Uri mUri>
		//   41   86:invokespecial   #136 <Method void zza$zza(Uri)>
		//   42   89:aload_0         
		//   43   90:getfield        #30  <Field Bitmap mBitmap>
		//   44   93:invokevirtual   #137 <Method Object ImageManager$zza.put(Object, Object)>
		//   45   96:pop             
			}
			ImageReceiver imagereceiver = (ImageReceiver)ImageManager.zze(zzaEq).remove(((Object) (mUri)));
		//   46   97:aload_0         
		//   47   98:getfield        #23  <Field ImageManager zzaEq>
		//   48  101:invokestatic    #139 <Method Map ImageManager.zze(ImageManager)>
		//   49  104:aload_0         
		//   50  105:getfield        #28  <Field Uri mUri>
		//   51  108:invokeinterface #98  <Method Object Map.remove(Object)>
		//   52  113:checkcast       #39  <Class ImageManager$ImageReceiver>
		//   53  116:astore_2        
			if(imagereceiver != null)
		//*  54  117:aload_2         
		//*  55  118:ifnull          127
				zza(imagereceiver, flag);
		//   56  121:aload_0         
		//   57  122:aload_2         
		//   58  123:iload_1         
		//   59  124:invokespecial   #141 <Method void zza(ImageManager$ImageReceiver, boolean)>
			zztj.countDown();
		//   60  127:aload_0         
		//   61  128:getfield        #34  <Field CountDownLatch zztj>
		//   62  131:invokevirtual   #146 <Method void CountDownLatch.countDown()>
			Object obj = ImageManager.zzuH();
		//   63  134:invokestatic    #150 <Method Object ImageManager.zzuH()>
		//   64  137:astore_2        
			obj;
		//   65  138:aload_2         
			JVM INSTR monitorenter ;
		//   66  139:monitorenter    
			ImageManager.zzxq().remove(((Object) (mUri)));
		//   67  140:invokestatic    #154 <Method HashSet ImageManager.zzxq()>
		//   68  143:aload_0         
		//   69  144:getfield        #28  <Field Uri mUri>
		//   70  147:invokevirtual   #159 <Method boolean HashSet.remove(Object)>
		//   71  150:pop             
			obj;
		//   72  151:aload_2         
			JVM INSTR monitorexit ;
		//   73  152:monitorexit     
			return;
		//   74  153:return          
			Exception exception;
			exception;
		//   75  154:astore_3        
		//*  76  155:aload_2         
			throw exception;
		//   77  156:monitorexit     
		//   78  157:aload_3         
		//   79  158:athrow          
		}

		private final Bitmap mBitmap;
		private final Uri mUri;
		final ImageManager zzaEq;
		private boolean zzaEt;
		private final CountDownLatch zztj;

		public zze(Uri uri, Bitmap bitmap, boolean flag, CountDownLatch countdownlatch)
		{
			zzaEq = ImageManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #23  <Field ImageManager zzaEq>
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
			zzaEt = flag;
		//   11   19:aload_0         
		//   12   20:iload           4
		//   13   22:putfield        #32  <Field boolean zzaEt>
			zztj = countdownlatch;
		//   14   25:aload_0         
		//   15   26:aload           5
		//   16   28:putfield        #34  <Field CountDownLatch zztj>
		//   17   31:return          
		}
	}


	private ImageManager(Context context, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void Object()>
		mContext = context.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #70  <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #72  <Field Context mContext>
	//    6   12:aload_0         
	//    7   13:new             #74  <Class Handler>
	//    8   16:dup             
	//    9   17:invokestatic    #80  <Method Looper Looper.getMainLooper()>
	//   10   20:invokespecial   #83  <Method void Handler(Looper)>
	//   11   23:putfield        #85  <Field Handler mHandler>
	//   12   26:aload_0         
	//   13   27:iconst_4        
	//   14   28:invokestatic    #91  <Method ExecutorService Executors.newFixedThreadPool(int)>
	//   15   31:putfield        #93  <Field ExecutorService zzaEj>
		if(flag)
	//*  16   34:iload_2         
	//*  17   35:ifeq            74
		{
			zzaEk = new zza(mContext);
	//   18   38:aload_0         
	//   19   39:new             #12  <Class ImageManager$zza>
	//   20   42:dup             
	//   21   43:aload_0         
	//   22   44:getfield        #72  <Field Context mContext>
	//   23   47:invokespecial   #96  <Method void ImageManager$zza(Context)>
	//   24   50:putfield        #98  <Field ImageManager$zza zzaEk>
			mContext.registerComponentCallbacks(((android.content.ComponentCallbacks) (new zzd(zzaEk))));
	//   25   53:aload_0         
	//   26   54:getfield        #72  <Field Context mContext>
	//   27   57:new             #21  <Class ImageManager$zzd>
	//   28   60:dup             
	//   29   61:aload_0         
	//   30   62:getfield        #98  <Field ImageManager$zza zzaEk>
	//   31   65:invokespecial   #101 <Method void ImageManager$zzd(ImageManager$zza)>
	//   32   68:invokevirtual   #105 <Method void Context.registerComponentCallbacks(android.content.ComponentCallbacks)>
		} else
	//*  33   71:goto            79
		{
			zzaEk = null;
	//   34   74:aload_0         
	//   35   75:aconst_null     
	//   36   76:putfield        #98  <Field ImageManager$zza zzaEk>
		}
	//   37   79:aload_0         
	//   38   80:new             #107 <Class zzacd>
	//   39   83:dup             
	//   40   84:invokespecial   #108 <Method void zzacd()>
	//   41   87:putfield        #110 <Field zzacd zzaEl>
	//   42   90:aload_0         
	//   43   91:new             #112 <Class HashMap>
	//   44   94:dup             
	//   45   95:invokespecial   #113 <Method void HashMap()>
	//   46   98:putfield        #115 <Field Map zzaEm>
	//   47  101:aload_0         
	//   48  102:new             #112 <Class HashMap>
	//   49  105:dup             
	//   50  106:invokespecial   #113 <Method void HashMap()>
	//   51  109:putfield        #117 <Field Map zzaEn>
	//   52  112:aload_0         
	//   53  113:new             #112 <Class HashMap>
	//   54  116:dup             
	//   55  117:invokespecial   #113 <Method void HashMap()>
	//   56  120:putfield        #119 <Field Map zzaEo>
	//   57  123:return          
	}

	public static ImageManager create(Context context)
	{
		return zzg(context, false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #125 <Method ImageManager zzg(Context, boolean)>
	//    3    5:areturn         
	}

	static Bitmap zza(ImageManager imagemanager, zza.zza zza1)
	{
		return imagemanager.zza(zza1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #129 <Method Bitmap zza(zza$zza)>
	//    3    5:areturn         
	}

	private Bitmap zza(zza.zza zza1)
	{
		if(zzaEk == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field ImageManager$zza zzaEk>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return (Bitmap)zzaEk.get(((Object) (zza1)));
	//    5    9:aload_0         
	//    6   10:getfield        #98  <Field ImageManager$zza zzaEk>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #133 <Method Object ImageManager$zza.get(Object)>
	//    9   17:checkcast       #135 <Class Bitmap>
	//   10   20:areturn         
	}

	static Map zza(ImageManager imagemanager)
	{
		return imagemanager.zzaEm;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field Map zzaEm>
	//    2    4:areturn         
	}

	static Context zzb(ImageManager imagemanager)
	{
		return imagemanager.mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field Context mContext>
	//    2    4:areturn         
	}

	static zzacd zzc(ImageManager imagemanager)
	{
		return imagemanager.zzaEl;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field zzacd zzaEl>
	//    2    4:areturn         
	}

	static Map zzd(ImageManager imagemanager)
	{
		return imagemanager.zzaEo;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field Map zzaEo>
	//    2    4:areturn         
	}

	static Map zze(ImageManager imagemanager)
	{
		return imagemanager.zzaEn;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field Map zzaEn>
	//    2    4:areturn         
	}

	static ExecutorService zzf(ImageManager imagemanager)
	{
		return imagemanager.zzaEj;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field ExecutorService zzaEj>
	//    2    4:areturn         
	}

	static Handler zzg(ImageManager imagemanager)
	{
		return imagemanager.mHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field Handler mHandler>
	//    2    4:areturn         
	}

	public static ImageManager zzg(Context context, boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            26
		{
			if(zzaEi == null)
	//*   2    4:getstatic       #143 <Field ImageManager zzaEi>
	//*   3    7:ifnonnull       22
				zzaEi = new ImageManager(context, true);
	//    4   10:new             #2   <Class ImageManager>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:invokespecial   #145 <Method void ImageManager(Context, boolean)>
	//    9   19:putstatic       #143 <Field ImageManager zzaEi>
			return zzaEi;
	//   10   22:getstatic       #143 <Field ImageManager zzaEi>
	//   11   25:areturn         
		}
		if(zzaEh == null)
	//*  12   26:getstatic       #147 <Field ImageManager zzaEh>
	//*  13   29:ifnonnull       44
			zzaEh = new ImageManager(context, false);
	//   14   32:new             #2   <Class ImageManager>
	//   15   35:dup             
	//   16   36:aload_0         
	//   17   37:iconst_0        
	//   18   38:invokespecial   #145 <Method void ImageManager(Context, boolean)>
	//   19   41:putstatic       #147 <Field ImageManager zzaEh>
		return zzaEh;
	//   20   44:getstatic       #147 <Field ImageManager zzaEh>
	//   21   47:areturn         
	}

	static zza zzh(ImageManager imagemanager)
	{
		return imagemanager.zzaEk;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field ImageManager$zza zzaEk>
	//    2    4:areturn         
	}

	static Object zzuH()
	{
		return zzaEf;
	//    0    0:getstatic       #57  <Field Object zzaEf>
	//    1    3:areturn         
	}

	static HashSet zzxq()
	{
		return zzaEg;
	//    0    0:getstatic       #62  <Field HashSet zzaEg>
	//    1    3:areturn         
	}

	public void loadImage(ImageView imageview, int i)
	{
		zza(((com.google.android.gms.common.images.zza) (new zza.zzb(imageview, i))));
	//    0    0:aload_0         
	//    1    1:new             #157 <Class zza$zzb>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #159 <Method void zza$zzb(ImageView, int)>
	//    6   10:invokevirtual   #162 <Method void zza(zza)>
	//    7   13:return          
	}

	public void loadImage(ImageView imageview, Uri uri)
	{
		zza(((com.google.android.gms.common.images.zza) (new zza.zzb(imageview, uri))));
	//    0    0:aload_0         
	//    1    1:new             #157 <Class zza$zzb>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #165 <Method void zza$zzb(ImageView, Uri)>
	//    6   10:invokevirtual   #162 <Method void zza(zza)>
	//    7   13:return          
	}

	public void loadImage(ImageView imageview, Uri uri, int i)
	{
		imageview = ((ImageView) (new zza.zzb(imageview, uri)));
	//    0    0:new             #157 <Class zza$zzb>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #165 <Method void zza$zzb(ImageView, Uri)>
	//    5    9:astore_1        
		((com.google.android.gms.common.images.zza) (imageview)).zzcO(i);
	//    6   10:aload_1         
	//    7   11:iload_3         
	//    8   12:invokevirtual   #172 <Method void zza.zzcO(int)>
		zza(((com.google.android.gms.common.images.zza) (imageview)));
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #162 <Method void zza(zza)>
	//   12   20:return          
	}

	public void loadImage(OnImageLoadedListener onimageloadedlistener, Uri uri)
	{
		zza(((com.google.android.gms.common.images.zza) (new zza.zzc(onimageloadedlistener, uri))));
	//    0    0:aload_0         
	//    1    1:new             #175 <Class zza$zzc>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #177 <Method void zza$zzc(ImageManager$OnImageLoadedListener, Uri)>
	//    6   10:invokevirtual   #162 <Method void zza(zza)>
	//    7   13:return          
	}

	public void loadImage(OnImageLoadedListener onimageloadedlistener, Uri uri, int i)
	{
		onimageloadedlistener = ((OnImageLoadedListener) (new zza.zzc(onimageloadedlistener, uri)));
	//    0    0:new             #175 <Class zza$zzc>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #177 <Method void zza$zzc(ImageManager$OnImageLoadedListener, Uri)>
	//    5    9:astore_1        
		((com.google.android.gms.common.images.zza) (onimageloadedlistener)).zzcO(i);
	//    6   10:aload_1         
	//    7   11:iload_3         
	//    8   12:invokevirtual   #172 <Method void zza.zzcO(int)>
		zza(((com.google.android.gms.common.images.zza) (onimageloadedlistener)));
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #162 <Method void zza(zza)>
	//   12   20:return          
	}

	public void zza(com.google.android.gms.common.images.zza zza1)
	{
		com.google.android.gms.common.internal.zzc.zzdj("ImageManager.loadImage() must be called in the main thread");
	//    0    0:ldc1            #180 <String "ImageManager.loadImage() must be called in the main thread">
	//    1    2:invokestatic    #186 <Method void zzc.zzdj(String)>
		((Runnable) (new zzc(zza1))).run();
	//    2    5:new             #18  <Class ImageManager$zzc>
	//    3    8:dup             
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:invokespecial   #189 <Method void ImageManager$zzc(ImageManager, zza)>
	//    7   14:invokeinterface #194 <Method void Runnable.run()>
	//    8   19:return          
	}

	private static final Object zzaEf = new Object();
	private static HashSet zzaEg = new HashSet();
	private static ImageManager zzaEh;
	private static ImageManager zzaEi;
	private final Context mContext;
	private final Handler mHandler = new Handler(Looper.getMainLooper());
	private final ExecutorService zzaEj = Executors.newFixedThreadPool(4);
	private final zza zzaEk;
	private final zzacd zzaEl = new zzacd();
	private final Map zzaEm = new HashMap();
	private final Map zzaEn = new HashMap();
	private final Map zzaEo = new HashMap();

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #55  <Method void Object()>
	//    3    7:putstatic       #57  <Field Object zzaEf>
	//    4   10:new             #59  <Class HashSet>
	//    5   13:dup             
	//    6   14:invokespecial   #60  <Method void HashSet()>
	//    7   17:putstatic       #62  <Field HashSet zzaEg>
	//*   8   20:return          
	}
}
