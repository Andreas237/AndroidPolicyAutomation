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
import com.google.android.gms.common.images.internal.PostProcessedResourceCache;
import com.google.android.gms.common.internal.Asserts;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.*;

// Referenced classes of package com.google.android.gms.common.images:
//			ImageRequest

public final class ImageManager
{
	private final class ImageReceiver extends ResultReceiver
	{

		static ArrayList zza(ImageReceiver imagereceiver)
		{
			return imagereceiver.zzpf;
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field ArrayList zzpf>
		//    2    4:areturn         
		}

		public final void onReceiveResult(int i, Bundle bundle)
		{
			bundle = ((Bundle) ((ParcelFileDescriptor)bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
		//    0    0:aload_2         
		//    1    1:ldc1            #49  <String "com.google.android.gms.extra.fileDescriptor">
		//    2    3:invokevirtual   #55  <Method android.os.Parcelable Bundle.getParcelable(String)>
		//    3    6:checkcast       #57  <Class ParcelFileDescriptor>
		//    4    9:astore_2        
			ImageManager.zzf(zzpg).execute(((Runnable) (((zzb) (zzpg)). new zzb(mUri, ((ParcelFileDescriptor) (bundle))))));
		//    5   10:aload_0         
		//    6   11:getfield        #19  <Field ImageManager zzpg>
		//    7   14:invokestatic    #61  <Method ExecutorService ImageManager.zzf(ImageManager)>
		//    8   17:new             #63  <Class ImageManager$zzb>
		//    9   20:dup             
		//   10   21:aload_0         
		//   11   22:getfield        #19  <Field ImageManager zzpg>
		//   12   25:aload_0         
		//   13   26:getfield        #35  <Field Uri mUri>
		//   14   29:aload_2         
		//   15   30:invokespecial   #66  <Method void ImageManager$zzb(ImageManager, Uri, ParcelFileDescriptor)>
		//   16   33:invokeinterface #72  <Method void ExecutorService.execute(Runnable)>
		//   17   38:return          
		}

		public final void zza(ImageRequest imagerequest)
		{
			Asserts.checkMainThread("ImageReceiver.addImageRequest() must be called in the main thread");
		//    0    0:ldc1            #75  <String "ImageReceiver.addImageRequest() must be called in the main thread">
		//    1    2:invokestatic    #81  <Method void Asserts.checkMainThread(String)>
			zzpf.add(((Object) (imagerequest)));
		//    2    5:aload_0         
		//    3    6:getfield        #42  <Field ArrayList zzpf>
		//    4    9:aload_1         
		//    5   10:invokevirtual   #85  <Method boolean ArrayList.add(Object)>
		//    6   13:pop             
		//    7   14:return          
		}

		public final void zzb(ImageRequest imagerequest)
		{
			Asserts.checkMainThread("ImageReceiver.removeImageRequest() must be called in the main thread");
		//    0    0:ldc1            #88  <String "ImageReceiver.removeImageRequest() must be called in the main thread">
		//    1    2:invokestatic    #81  <Method void Asserts.checkMainThread(String)>
			zzpf.remove(((Object) (imagerequest)));
		//    2    5:aload_0         
		//    3    6:getfield        #42  <Field ArrayList zzpf>
		//    4    9:aload_1         
		//    5   10:invokevirtual   #91  <Method boolean ArrayList.remove(Object)>
		//    6   13:pop             
		//    7   14:return          
		}

		public final void zzco()
		{
			Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
		//    0    0:new             #94  <Class Intent>
		//    1    3:dup             
		//    2    4:ldc1            #96  <String "com.google.android.gms.common.images.LOAD_IMAGE">
		//    3    6:invokespecial   #98  <Method void Intent(String)>
		//    4    9:astore_1        
			intent.putExtra("com.google.android.gms.extras.uri", ((android.os.Parcelable) (mUri)));
		//    5   10:aload_1         
		//    6   11:ldc1            #100 <String "com.google.android.gms.extras.uri">
		//    7   13:aload_0         
		//    8   14:getfield        #35  <Field Uri mUri>
		//    9   17:invokevirtual   #104 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
		//   10   20:pop             
			intent.putExtra("com.google.android.gms.extras.resultReceiver", ((android.os.Parcelable) (this)));
		//   11   21:aload_1         
		//   12   22:ldc1            #106 <String "com.google.android.gms.extras.resultReceiver">
		//   13   24:aload_0         
		//   14   25:invokevirtual   #104 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
		//   15   28:pop             
			intent.putExtra("com.google.android.gms.extras.priority", 3);
		//   16   29:aload_1         
		//   17   30:ldc1            #108 <String "com.google.android.gms.extras.priority">
		//   18   32:iconst_3        
		//   19   33:invokevirtual   #111 <Method Intent Intent.putExtra(String, int)>
		//   20   36:pop             
			ImageManager.zzb(zzpg).sendBroadcast(intent);
		//   21   37:aload_0         
		//   22   38:getfield        #19  <Field ImageManager zzpg>
		//   23   41:invokestatic    #114 <Method Context ImageManager.zzb(ImageManager)>
		//   24   44:aload_1         
		//   25   45:invokevirtual   #120 <Method void Context.sendBroadcast(Intent)>
		//   26   48:return          
		}

		private final Uri mUri;
		private final ArrayList zzpf = new ArrayList();
		private final ImageManager zzpg;

		ImageReceiver(Uri uri)
		{
			zzpg = ImageManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field ImageManager zzpg>
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
		//   16   32:putfield        #42  <Field ArrayList zzpf>
		//   17   35:return          
		}
	}

	public static interface OnImageLoadedListener
	{

		public abstract void onImageLoaded(Uri uri, Drawable drawable, boolean flag);
	}

	private static final class zza extends LruCache
	{

		protected final void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
		{
			super.entryRemoved(flag, ((Object) ((ImageRequest.zza)obj)), ((Object) ((Bitmap)obj1)), ((Object) ((Bitmap)obj2)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #47  <Class ImageRequest$zza>
		//    4    6:aload_3         
		//    5    7:checkcast       #49  <Class Bitmap>
		//    6   10:aload           4
		//    7   12:checkcast       #49  <Class Bitmap>
		//    8   15:invokespecial   #51  <Method void LruCache.entryRemoved(boolean, Object, Object, Object)>
		//    9   18:return          
		}

		protected final int sizeOf(Object obj, Object obj1)
		{
			obj = ((Object) ((Bitmap)obj1));
		//    0    0:aload_2         
		//    1    1:checkcast       #49  <Class Bitmap>
		//    2    4:astore_1        
			return ((Bitmap) (obj)).getHeight() * ((Bitmap) (obj)).getRowBytes();
		//    3    5:aload_1         
		//    4    6:invokevirtual   #56  <Method int Bitmap.getHeight()>
		//    5    9:aload_1         
		//    6   10:invokevirtual   #59  <Method int Bitmap.getRowBytes()>
		//    7   13:imul            
		//    8   14:ireturn         
		}

		public zza(Context context)
		{
			ActivityManager activitymanager = (ActivityManager)context.getSystemService("activity");
		//    0    0:aload_1         
		//    1    1:ldc1            #12  <String "activity">
		//    2    3:invokevirtual   #18  <Method Object Context.getSystemService(String)>
		//    3    6:checkcast       #20  <Class ActivityManager>
		//    4    9:astore_3        
			boolean flag;
			if((context.getApplicationInfo().flags & 0x100000) != 0)
		//*   5   10:aload_1         
		//*   6   11:invokevirtual   #24  <Method ApplicationInfo Context.getApplicationInfo()>
		//*   7   14:getfield        #30  <Field int ApplicationInfo.flags>
		//*   8   17:ldc1            #31  <Int 0x100000>
		//*   9   19:iand            
		//*  10   20:ifeq            28
				flag = true;
		//   11   23:iconst_1        
		//   12   24:istore_2        
			else
		//*  13   25:goto            30
				flag = false;
		//   14   28:iconst_0        
		//   15   29:istore_2        
			int i;
			if(flag)
		//*  16   30:iload_2         
		//*  17   31:ifeq            42
				i = activitymanager.getLargeMemoryClass();
		//   18   34:aload_3         
		//   19   35:invokevirtual   #35  <Method int ActivityManager.getLargeMemoryClass()>
		//   20   38:istore_2        
			else
		//*  21   39:goto            47
				i = activitymanager.getMemoryClass();
		//   22   42:aload_3         
		//   23   43:invokevirtual   #38  <Method int ActivityManager.getMemoryClass()>
		//   24   46:istore_2        
			super((int)(0.33F * (float)(i * 0x100000)));
		//   25   47:aload_0         
		//   26   48:ldc1            #39  <Float 0.33F>
		//   27   50:iload_2         
		//   28   51:ldc1            #31  <Int 0x100000>
		//   29   53:imul            
		//   30   54:i2f             
		//   31   55:fmul            
		//   32   56:f2i             
		//   33   57:invokespecial   #42  <Method void LruCache(int)>
		//   34   60:return          
		}
	}

	private final class zzb
		implements Runnable
	{

		public final void run()
		{
			boolean flag;
			boolean flag1;
			Object obj;
			Object obj1;
			Asserts.checkNotMainThread("LoadBitmapFromDiskRunnable can't be executed in the main thread");
		//    0    0:ldc1            #36  <String "LoadBitmapFromDiskRunnable can't be executed in the main thread">
		//    1    2:invokestatic    #42  <Method void Asserts.checkNotMainThread(String)>
			ParcelFileDescriptor parcelfiledescriptor = zzph;
		//    2    5:aload_0         
		//    3    6:getfield        #26  <Field ParcelFileDescriptor zzph>
		//    4    9:astore          5
			flag = false;
		//    5   11:iconst_0        
		//    6   12:istore_1        
			flag1 = false;
		//    7   13:iconst_0        
		//    8   14:istore_2        
			obj = null;
		//    9   15:aconst_null     
		//   10   16:astore_3        
			obj1 = null;
		//   11   17:aconst_null     
		//   12   18:astore          4
			if(parcelfiledescriptor == null)
				break MISSING_BLOCK_LABEL_126;
		//   13   20:aload           5
		//   14   22:ifnull          126
			obj = ((Object) (BitmapFactory.decodeFileDescriptor(zzph.getFileDescriptor())));
		//   15   25:aload_0         
		//   16   26:getfield        #26  <Field ParcelFileDescriptor zzph>
		//   17   29:invokevirtual   #48  <Method java.io.FileDescriptor ParcelFileDescriptor.getFileDescriptor()>
		//   18   32:invokestatic    #54  <Method Bitmap BitmapFactory.decodeFileDescriptor(java.io.FileDescriptor)>
		//   19   35:astore_3        
			flag = flag1;
		//   20   36:iload_2         
		//   21   37:istore_1        
			break MISSING_BLOCK_LABEL_104;
		//   22   38:goto            104
			obj;
		//   23   41:astore_3        
			String s = String.valueOf(((Object) (mUri)));
		//   24   42:aload_0         
		//   25   43:getfield        #24  <Field Uri mUri>
		//   26   46:invokestatic    #60  <Method String String.valueOf(Object)>
		//   27   49:astore          5
			StringBuilder stringbuilder = new StringBuilder(34 + String.valueOf(((Object) (s))).length());
		//   28   51:new             #62  <Class StringBuilder>
		//   29   54:dup             
		//   30   55:bipush          34
		//   31   57:aload           5
		//   32   59:invokestatic    #60  <Method String String.valueOf(Object)>
		//   33   62:invokevirtual   #66  <Method int String.length()>
		//   34   65:iadd            
		//   35   66:invokespecial   #69  <Method void StringBuilder(int)>
		//   36   69:astore          6
			stringbuilder.append("OOM while loading bitmap for uri: ");
		//   37   71:aload           6
		//   38   73:ldc1            #71  <String "OOM while loading bitmap for uri: ">
		//   39   75:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//   40   78:pop             
			stringbuilder.append(s);
		//   41   79:aload           6
		//   42   81:aload           5
		//   43   83:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//   44   86:pop             
			Log.e("ImageManager", stringbuilder.toString(), ((Throwable) (obj)));
		//   45   87:ldc1            #77  <String "ImageManager">
		//   46   89:aload           6
		//   47   91:invokevirtual   #81  <Method String StringBuilder.toString()>
		//   48   94:aload_3         
		//   49   95:invokestatic    #87  <Method int Log.e(String, String, Throwable)>
		//   50   98:pop             
			flag = true;
		//   51   99:iconst_1        
		//   52  100:istore_1        
			obj = ((Object) (obj1));
		//   53  101:aload           4
		//   54  103:astore_3        
			try
			{
				zzph.close();
		//   55  104:aload_0         
		//   56  105:getfield        #26  <Field ParcelFileDescriptor zzph>
		//   57  108:invokevirtual   #90  <Method void ParcelFileDescriptor.close()>
			}
		//*  58  111:goto            126
			catch(IOException ioexception)
		//*  59  114:astore          4
			{
				Log.e("ImageManager", "closed failed", ((Throwable) (ioexception)));
		//   60  116:ldc1            #77  <String "ImageManager">
		//   61  118:ldc1            #92  <String "closed failed">
		//   62  120:aload           4
		//   63  122:invokestatic    #87  <Method int Log.e(String, String, Throwable)>
		//   64  125:pop             
			}
			InterruptedException interruptedexception;
			Object obj2 = ((Object) (new CountDownLatch(1)));
		//   65  126:new             #94  <Class CountDownLatch>
		//   66  129:dup             
		//   67  130:iconst_1        
		//   68  131:invokespecial   #95  <Method void CountDownLatch(int)>
		//   69  134:astore          4
			ImageManager.zzg(zzpg).post(((Runnable) (((zze) (zzpg)). new zze(mUri, ((Bitmap) (obj)), flag, ((CountDownLatch) (obj2))))));
		//   70  136:aload_0         
		//   71  137:getfield        #19  <Field ImageManager zzpg>
		//   72  140:invokestatic    #99  <Method Handler ImageManager.zzg(ImageManager)>
		//   73  143:new             #101 <Class ImageManager$zze>
		//   74  146:dup             
		//   75  147:aload_0         
		//   76  148:getfield        #19  <Field ImageManager zzpg>
		//   77  151:aload_0         
		//   78  152:getfield        #24  <Field Uri mUri>
		//   79  155:aload_3         
		//   80  156:iload_1         
		//   81  157:aload           4
		//   82  159:invokespecial   #104 <Method void ImageManager$zze(ImageManager, Uri, Bitmap, boolean, CountDownLatch)>
		//   83  162:invokevirtual   #110 <Method boolean Handler.post(Runnable)>
		//   84  165:pop             
			try
			{
				((CountDownLatch) (obj2)).await();
		//   85  166:aload           4
		//   86  168:invokevirtual   #113 <Method void CountDownLatch.await()>
				return;
		//   87  171:return          
			}
		//*  88  172:aload_0         
		//*  89  173:getfield        #24  <Field Uri mUri>
		//*  90  176:invokestatic    #60  <Method String String.valueOf(Object)>
		//*  91  179:astore_3        
		//*  92  180:new             #62  <Class StringBuilder>
		//*  93  183:dup             
		//*  94  184:bipush          32
		//*  95  186:aload_3         
		//*  96  187:invokestatic    #60  <Method String String.valueOf(Object)>
		//*  97  190:invokevirtual   #66  <Method int String.length()>
		//*  98  193:iadd            
		//*  99  194:invokespecial   #69  <Method void StringBuilder(int)>
		//* 100  197:astore          4
		//* 101  199:aload           4
		//* 102  201:ldc1            #115 <String "Latch interrupted while posting ">
		//* 103  203:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//* 104  206:pop             
		//* 105  207:aload           4
		//* 106  209:aload_3         
		//* 107  210:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//* 108  213:pop             
		//* 109  214:ldc1            #77  <String "ImageManager">
		//* 110  216:aload           4
		//* 111  218:invokevirtual   #81  <Method String StringBuilder.toString()>
		//* 112  221:invokestatic    #119 <Method int Log.w(String, String)>
		//* 113  224:pop             
		//* 114  225:return          
			// Misplaced declaration of an exception variable
			catch(InterruptedException interruptedexception)
			{
				obj = ((Object) (String.valueOf(((Object) (mUri)))));
			}
			obj2 = ((Object) (new StringBuilder(32 + String.valueOf(obj).length())));
			((StringBuilder) (obj2)).append("Latch interrupted while posting ");
			((StringBuilder) (obj2)).append(((String) (obj)));
			Log.w("ImageManager", ((StringBuilder) (obj2)).toString());
			return;
		//* 115  226:astore_3        
		//* 116  227:goto            172
		}

		private final Uri mUri;
		private final ImageManager zzpg;
		private final ParcelFileDescriptor zzph;

		public zzb(Uri uri, ParcelFileDescriptor parcelfiledescriptor)
		{
			zzpg = ImageManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field ImageManager zzpg>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #22  <Method void Object()>
			mUri = uri;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field Uri mUri>
			zzph = parcelfiledescriptor;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #26  <Field ParcelFileDescriptor zzph>
		//   11   19:return          
		}
	}

	private final class zzc
		implements Runnable
	{

		public final void run()
		{
			Asserts.checkMainThread("LoadImageRunnable must be executed on the main thread");
		//    0    0:ldc1            #26  <String "LoadImageRunnable must be executed on the main thread">
		//    1    2:invokestatic    #32  <Method void Asserts.checkMainThread(String)>
			Object obj = ((Object) ((ImageReceiver)ImageManager.zza(zzpg).get(((Object) (zzpi)))));
		//    2    5:aload_0         
		//    3    6:getfield        #17  <Field ImageManager zzpg>
		//    4    9:invokestatic    #36  <Method Map ImageManager.zza(ImageManager)>
		//    5   12:aload_0         
		//    6   13:getfield        #22  <Field ImageRequest zzpi>
		//    7   16:invokeinterface #42  <Method Object Map.get(Object)>
		//    8   21:checkcast       #44  <Class ImageManager$ImageReceiver>
		//    9   24:astore_1        
			if(obj != null)
		//*  10   25:aload_1         
		//*  11   26:ifnull          54
			{
				ImageManager.zza(zzpg).remove(((Object) (zzpi)));
		//   12   29:aload_0         
		//   13   30:getfield        #17  <Field ImageManager zzpg>
		//   14   33:invokestatic    #36  <Method Map ImageManager.zza(ImageManager)>
		//   15   36:aload_0         
		//   16   37:getfield        #22  <Field ImageRequest zzpi>
		//   17   40:invokeinterface #47  <Method Object Map.remove(Object)>
		//   18   45:pop             
				((ImageReceiver) (obj)).zzb(zzpi);
		//   19   46:aload_1         
		//   20   47:aload_0         
		//   21   48:getfield        #22  <Field ImageRequest zzpi>
		//   22   51:invokevirtual   #51  <Method void ImageManager$ImageReceiver.zzb(ImageRequest)>
			}
			ImageRequest.zza zza1 = zzpi.zzpk;
		//   23   54:aload_0         
		//   24   55:getfield        #22  <Field ImageRequest zzpi>
		//   25   58:getfield        #57  <Field ImageRequest$zza ImageRequest.zzpk>
		//   26   61:astore_3        
			if(zza1.uri == null)
		//*  27   62:aload_3         
		//*  28   63:getfield        #63  <Field Uri ImageRequest$zza.uri>
		//*  29   66:ifnonnull       92
			{
				zzpi.zza(ImageManager.zzb(zzpg), ImageManager.zzc(zzpg), true);
		//   30   69:aload_0         
		//   31   70:getfield        #22  <Field ImageRequest zzpi>
		//   32   73:aload_0         
		//   33   74:getfield        #17  <Field ImageManager zzpg>
		//   34   77:invokestatic    #66  <Method Context ImageManager.zzb(ImageManager)>
		//   35   80:aload_0         
		//   36   81:getfield        #17  <Field ImageManager zzpg>
		//   37   84:invokestatic    #69  <Method PostProcessedResourceCache ImageManager.zzc(ImageManager)>
		//   38   87:iconst_1        
		//   39   88:invokevirtual   #72  <Method void ImageRequest.zza(Context, PostProcessedResourceCache, boolean)>
				return;
		//   40   91:return          
			}
			obj = ((Object) (ImageManager.zza(zzpg, zza1)));
		//   41   92:aload_0         
		//   42   93:getfield        #17  <Field ImageManager zzpg>
		//   43   96:aload_3         
		//   44   97:invokestatic    #75  <Method Bitmap ImageManager.zza(ImageManager, ImageRequest$zza)>
		//   45  100:astore_1        
			if(obj != null)
		//*  46  101:aload_1         
		//*  47  102:ifnull          122
			{
				zzpi.zza(ImageManager.zzb(zzpg), ((Bitmap) (obj)), true);
		//   48  105:aload_0         
		//   49  106:getfield        #22  <Field ImageRequest zzpi>
		//   50  109:aload_0         
		//   51  110:getfield        #17  <Field ImageManager zzpg>
		//   52  113:invokestatic    #66  <Method Context ImageManager.zzb(ImageManager)>
		//   53  116:aload_1         
		//   54  117:iconst_1        
		//   55  118:invokevirtual   #78  <Method void ImageRequest.zza(Context, Bitmap, boolean)>
				return;
		//   56  121:return          
			}
			obj = ((Object) ((Long)ImageManager.zzd(zzpg).get(((Object) (zza1.uri)))));
		//   57  122:aload_0         
		//   58  123:getfield        #17  <Field ImageManager zzpg>
		//   59  126:invokestatic    #81  <Method Map ImageManager.zzd(ImageManager)>
		//   60  129:aload_3         
		//   61  130:getfield        #63  <Field Uri ImageRequest$zza.uri>
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
					zzpi.zza(ImageManager.zzb(zzpg), ImageManager.zzc(zzpg), true);
		//   74  161:aload_0         
		//   75  162:getfield        #22  <Field ImageRequest zzpi>
		//   76  165:aload_0         
		//   77  166:getfield        #17  <Field ImageManager zzpg>
		//   78  169:invokestatic    #66  <Method Context ImageManager.zzb(ImageManager)>
		//   79  172:aload_0         
		//   80  173:getfield        #17  <Field ImageManager zzpg>
		//   81  176:invokestatic    #69  <Method PostProcessedResourceCache ImageManager.zzc(ImageManager)>
		//   82  179:iconst_1        
		//   83  180:invokevirtual   #72  <Method void ImageRequest.zza(Context, PostProcessedResourceCache, boolean)>
					return;
		//   84  183:return          
				}
				ImageManager.zzd(zzpg).remove(((Object) (zza1.uri)));
		//   85  184:aload_0         
		//   86  185:getfield        #17  <Field ImageManager zzpg>
		//   87  188:invokestatic    #81  <Method Map ImageManager.zzd(ImageManager)>
		//   88  191:aload_3         
		//   89  192:getfield        #63  <Field Uri ImageRequest$zza.uri>
		//   90  195:invokeinterface #47  <Method Object Map.remove(Object)>
		//   91  200:pop             
			}
			zzpi.zza(ImageManager.zzb(zzpg), ImageManager.zzc(zzpg));
		//   92  201:aload_0         
		//   93  202:getfield        #22  <Field ImageRequest zzpi>
		//   94  205:aload_0         
		//   95  206:getfield        #17  <Field ImageManager zzpg>
		//   96  209:invokestatic    #66  <Method Context ImageManager.zzb(ImageManager)>
		//   97  212:aload_0         
		//   98  213:getfield        #17  <Field ImageManager zzpg>
		//   99  216:invokestatic    #69  <Method PostProcessedResourceCache ImageManager.zzc(ImageManager)>
		//  100  219:invokevirtual   #97  <Method void ImageRequest.zza(Context, PostProcessedResourceCache)>
			ImageReceiver imagereceiver = (ImageReceiver)ImageManager.zze(zzpg).get(((Object) (zza1.uri)));
		//  101  222:aload_0         
		//  102  223:getfield        #17  <Field ImageManager zzpg>
		//  103  226:invokestatic    #100 <Method Map ImageManager.zze(ImageManager)>
		//  104  229:aload_3         
		//  105  230:getfield        #63  <Field Uri ImageRequest$zza.uri>
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
				obj = ((Object) (((ImageReceiver) (zzpg)). new ImageReceiver(zza1.uri)));
		//  113  248:new             #44  <Class ImageManager$ImageReceiver>
		//  114  251:dup             
		//  115  252:aload_0         
		//  116  253:getfield        #17  <Field ImageManager zzpg>
		//  117  256:aload_3         
		//  118  257:getfield        #63  <Field Uri ImageRequest$zza.uri>
		//  119  260:invokespecial   #103 <Method void ImageManager$ImageReceiver(ImageManager, Uri)>
		//  120  263:astore_1        
				ImageManager.zze(zzpg).put(((Object) (zza1.uri)), obj);
		//  121  264:aload_0         
		//  122  265:getfield        #17  <Field ImageManager zzpg>
		//  123  268:invokestatic    #100 <Method Map ImageManager.zze(ImageManager)>
		//  124  271:aload_3         
		//  125  272:getfield        #63  <Field Uri ImageRequest$zza.uri>
		//  126  275:aload_1         
		//  127  276:invokeinterface #107 <Method Object Map.put(Object, Object)>
		//  128  281:pop             
			}
			((ImageReceiver) (obj)).zza(zzpi);
		//  129  282:aload_1         
		//  130  283:aload_0         
		//  131  284:getfield        #22  <Field ImageRequest zzpi>
		//  132  287:invokevirtual   #109 <Method void ImageManager$ImageReceiver.zza(ImageRequest)>
			if(!(zzpi instanceof ImageRequest.ListenerImageRequest))
		//* 133  290:aload_0         
		//* 134  291:getfield        #22  <Field ImageRequest zzpi>
		//* 135  294:instanceof      #111 <Class ImageRequest$ListenerImageRequest>
		//* 136  297:ifne            318
				ImageManager.zza(zzpg).put(((Object) (zzpi)), obj);
		//  137  300:aload_0         
		//  138  301:getfield        #17  <Field ImageManager zzpg>
		//  139  304:invokestatic    #36  <Method Map ImageManager.zza(ImageManager)>
		//  140  307:aload_0         
		//  141  308:getfield        #22  <Field ImageRequest zzpi>
		//  142  311:aload_1         
		//  143  312:invokeinterface #107 <Method Object Map.put(Object, Object)>
		//  144  317:pop             
			synchronized(ImageManager.zzcm())
		//* 145  318:invokestatic    #115 <Method Object ImageManager.zzcm()>
		//* 146  321:astore_2        
		//* 147  322:aload_2         
		//* 148  323:monitorenter    
			{
				if(!ImageManager.zzcn().contains(((Object) (zza1.uri))))
		//* 149  324:invokestatic    #119 <Method HashSet ImageManager.zzcn()>
		//* 150  327:aload_3         
		//* 151  328:getfield        #63  <Field Uri ImageRequest$zza.uri>
		//* 152  331:invokevirtual   #125 <Method boolean HashSet.contains(Object)>
		//* 153  334:ifne            352
				{
					ImageManager.zzcn().add(((Object) (zza1.uri)));
		//  154  337:invokestatic    #119 <Method HashSet ImageManager.zzcn()>
		//  155  340:aload_3         
		//  156  341:getfield        #63  <Field Uri ImageRequest$zza.uri>
		//  157  344:invokevirtual   #128 <Method boolean HashSet.add(Object)>
		//  158  347:pop             
					((ImageReceiver) (obj)).zzco();
		//  159  348:aload_1         
		//  160  349:invokevirtual   #131 <Method void ImageManager$ImageReceiver.zzco()>
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

		private final ImageManager zzpg;
		private final ImageRequest zzpi;

		public zzc(ImageRequest imagerequest)
		{
			zzpg = ImageManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field ImageManager zzpg>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
			zzpi = imagerequest;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field ImageRequest zzpi>
		//    8   14:return          
		}
	}

	private static final class zzd
		implements ComponentCallbacks2
	{

		public final void onConfigurationChanged(Configuration configuration)
		{
		//    0    0:return          
		}

		public final void onLowMemory()
		{
			zzpa.evictAll();
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field ImageManager$zza zzpa>
		//    2    4:invokevirtual   #27  <Method void ImageManager$zza.evictAll()>
		//    3    7:return          
		}

		public final void onTrimMemory(int i)
		{
			if(i >= 60)
		//*   0    0:iload_1         
		//*   1    1:bipush          60
		//*   2    3:icmplt          14
			{
				zzpa.evictAll();
		//    3    6:aload_0         
		//    4    7:getfield        #18  <Field ImageManager$zza zzpa>
		//    5   10:invokevirtual   #27  <Method void ImageManager$zza.evictAll()>
				return;
		//    6   13:return          
			}
			if(i >= 20)
		//*   7   14:iload_1         
		//*   8   15:bipush          20
		//*   9   17:icmplt          36
				zzpa.trimToSize(zzpa.size() / 2);
		//   10   20:aload_0         
		//   11   21:getfield        #18  <Field ImageManager$zza zzpa>
		//   12   24:aload_0         
		//   13   25:getfield        #18  <Field ImageManager$zza zzpa>
		//   14   28:invokevirtual   #33  <Method int ImageManager$zza.size()>
		//   15   31:iconst_2        
		//   16   32:idiv            
		//   17   33:invokevirtual   #36  <Method void ImageManager$zza.trimToSize(int)>
		//   18   36:return          
		}

		private final zza zzpa;

		public zzd(zza zza1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			zzpa = zza1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field ImageManager$zza zzpa>
		//    5    9:return          
		}
	}

	private final class zze
		implements Runnable
	{

		public final void run()
		{
			Asserts.checkMainThread("OnBitmapLoadedRunnable must be executed in the main thread");
		//    0    0:ldc1            #38  <String "OnBitmapLoadedRunnable must be executed in the main thread">
		//    1    2:invokestatic    #44  <Method void Asserts.checkMainThread(String)>
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
			if(ImageManager.zzh(zzpg) != null)
		//*  10   19:aload_0         
		//*  11   20:getfield        #23  <Field ImageManager zzpg>
		//*  12   23:invokestatic    #48  <Method ImageManager$zza ImageManager.zzh(ImageManager)>
		//*  13   26:ifnull          97
			{
				if(zzpj)
		//*  14   29:aload_0         
		//*  15   30:getfield        #32  <Field boolean zzpj>
		//*  16   33:ifeq            67
				{
					ImageManager.zzh(zzpg).evictAll();
		//   17   36:aload_0         
		//   18   37:getfield        #23  <Field ImageManager zzpg>
		//   19   40:invokestatic    #48  <Method ImageManager$zza ImageManager.zzh(ImageManager)>
		//   20   43:invokevirtual   #53  <Method void ImageManager$zza.evictAll()>
					System.gc();
		//   21   46:invokestatic    #58  <Method void System.gc()>
					zzpj = false;
		//   22   49:aload_0         
		//   23   50:iconst_0        
		//   24   51:putfield        #32  <Field boolean zzpj>
					ImageManager.zzg(zzpg).post(((Runnable) (this)));
		//   25   54:aload_0         
		//   26   55:getfield        #23  <Field ImageManager zzpg>
		//   27   58:invokestatic    #62  <Method Handler ImageManager.zzg(ImageManager)>
		//   28   61:aload_0         
		//   29   62:invokevirtual   #68  <Method boolean Handler.post(Runnable)>
		//   30   65:pop             
					return;
		//   31   66:return          
				}
				if(flag)
		//*  32   67:iload_1         
		//*  33   68:ifeq            97
					ImageManager.zzh(zzpg).put(((Object) (new ImageRequest.zza(mUri))), ((Object) (mBitmap)));
		//   34   71:aload_0         
		//   35   72:getfield        #23  <Field ImageManager zzpg>
		//   36   75:invokestatic    #48  <Method ImageManager$zza ImageManager.zzh(ImageManager)>
		//   37   78:new             #70  <Class ImageRequest$zza>
		//   38   81:dup             
		//   39   82:aload_0         
		//   40   83:getfield        #28  <Field Uri mUri>
		//   41   86:invokespecial   #73  <Method void ImageRequest$zza(Uri)>
		//   42   89:aload_0         
		//   43   90:getfield        #30  <Field Bitmap mBitmap>
		//   44   93:invokevirtual   #77  <Method Object ImageManager$zza.put(Object, Object)>
		//   45   96:pop             
			}
			Object obj = ((Object) ((ImageReceiver)ImageManager.zze(zzpg).remove(((Object) (mUri)))));
		//   46   97:aload_0         
		//   47   98:getfield        #23  <Field ImageManager zzpg>
		//   48  101:invokestatic    #80  <Method Map ImageManager.zze(ImageManager)>
		//   49  104:aload_0         
		//   50  105:getfield        #28  <Field Uri mUri>
		//   51  108:invokeinterface #86  <Method Object Map.remove(Object)>
		//   52  113:checkcast       #88  <Class ImageManager$ImageReceiver>
		//   53  116:astore          4
			if(obj != null)
		//*  54  118:aload           4
		//*  55  120:ifnull          251
			{
				obj = ((Object) (ImageReceiver.zza(((ImageReceiver) (obj)))));
		//   56  123:aload           4
		//   57  125:invokestatic    #92  <Method ArrayList ImageManager$ImageReceiver.zza(ImageManager$ImageReceiver)>
		//   58  128:astore          4
				int j = ((ArrayList) (obj)).size();
		//   59  130:aload           4
		//   60  132:invokevirtual   #98  <Method int ArrayList.size()>
		//   61  135:istore_3        
				for(int i = 0; i < j; i++)
		//*  62  136:iconst_0        
		//*  63  137:istore_2        
		//*  64  138:iload_2         
		//*  65  139:iload_3         
		//*  66  140:icmpge          251
				{
					ImageRequest imagerequest = (ImageRequest)((ArrayList) (obj)).get(i);
		//   67  143:aload           4
		//   68  145:iload_2         
		//   69  146:invokevirtual   #102 <Method Object ArrayList.get(int)>
		//   70  149:checkcast       #104 <Class ImageRequest>
		//   71  152:astore          5
					if(flag)
		//*  72  154:iload_1         
		//*  73  155:ifeq            178
					{
						imagerequest.zza(ImageManager.zzb(zzpg), mBitmap, false);
		//   74  158:aload           5
		//   75  160:aload_0         
		//   76  161:getfield        #23  <Field ImageManager zzpg>
		//   77  164:invokestatic    #108 <Method Context ImageManager.zzb(ImageManager)>
		//   78  167:aload_0         
		//   79  168:getfield        #30  <Field Bitmap mBitmap>
		//   80  171:iconst_0        
		//   81  172:invokevirtual   #111 <Method void ImageRequest.zza(Context, Bitmap, boolean)>
					} else
		//*  82  175:goto            221
					{
						ImageManager.zzd(zzpg).put(((Object) (mUri)), ((Object) (Long.valueOf(SystemClock.elapsedRealtime()))));
		//   83  178:aload_0         
		//   84  179:getfield        #23  <Field ImageManager zzpg>
		//   85  182:invokestatic    #114 <Method Map ImageManager.zzd(ImageManager)>
		//   86  185:aload_0         
		//   87  186:getfield        #28  <Field Uri mUri>
		//   88  189:invokestatic    #120 <Method long SystemClock.elapsedRealtime()>
		//   89  192:invokestatic    #126 <Method Long Long.valueOf(long)>
		//   90  195:invokeinterface #127 <Method Object Map.put(Object, Object)>
		//   91  200:pop             
						imagerequest.zza(ImageManager.zzb(zzpg), ImageManager.zzc(zzpg), false);
		//   92  201:aload           5
		//   93  203:aload_0         
		//   94  204:getfield        #23  <Field ImageManager zzpg>
		//   95  207:invokestatic    #108 <Method Context ImageManager.zzb(ImageManager)>
		//   96  210:aload_0         
		//   97  211:getfield        #23  <Field ImageManager zzpg>
		//   98  214:invokestatic    #131 <Method PostProcessedResourceCache ImageManager.zzc(ImageManager)>
		//   99  217:iconst_0        
		//  100  218:invokevirtual   #134 <Method void ImageRequest.zza(Context, PostProcessedResourceCache, boolean)>
					}
					if(!(imagerequest instanceof ImageRequest.ListenerImageRequest))
		//* 101  221:aload           5
		//* 102  223:instanceof      #136 <Class ImageRequest$ListenerImageRequest>
		//* 103  226:ifne            244
						ImageManager.zza(zzpg).remove(((Object) (imagerequest)));
		//  104  229:aload_0         
		//  105  230:getfield        #23  <Field ImageManager zzpg>
		//  106  233:invokestatic    #138 <Method Map ImageManager.zza(ImageManager)>
		//  107  236:aload           5
		//  108  238:invokeinterface #86  <Method Object Map.remove(Object)>
		//  109  243:pop             
				}

		//  110  244:iload_2         
		//  111  245:iconst_1        
		//  112  246:iadd            
		//  113  247:istore_2        
			}
		//* 114  248:goto            138
			zzfd.countDown();
		//  115  251:aload_0         
		//  116  252:getfield        #34  <Field CountDownLatch zzfd>
		//  117  255:invokevirtual   #143 <Method void CountDownLatch.countDown()>
			synchronized(ImageManager.zzcm())
		//* 118  258:invokestatic    #147 <Method Object ImageManager.zzcm()>
		//* 119  261:astore          4
		//* 120  263:aload           4
		//* 121  265:monitorenter    
			{
				ImageManager.zzcn().remove(((Object) (mUri)));
		//  122  266:invokestatic    #151 <Method HashSet ImageManager.zzcn()>
		//  123  269:aload_0         
		//  124  270:getfield        #28  <Field Uri mUri>
		//  125  273:invokevirtual   #156 <Method boolean HashSet.remove(Object)>
		//  126  276:pop             
			}
		//  127  277:aload           4
		//  128  279:monitorexit     
			return;
		//  129  280:return          
			exception;
		//  130  281:astore          5
			obj1;
		//  131  283:aload           4
			JVM INSTR monitorexit ;
		//  132  285:monitorexit     
			throw exception;
		//  133  286:aload           5
		//  134  288:athrow          
		}

		private final Bitmap mBitmap;
		private final Uri mUri;
		private final CountDownLatch zzfd;
		private final ImageManager zzpg;
		private boolean zzpj;

		public zze(Uri uri, Bitmap bitmap, boolean flag, CountDownLatch countdownlatch)
		{
			zzpg = ImageManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #23  <Field ImageManager zzpg>
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
			zzpj = flag;
		//   11   19:aload_0         
		//   12   20:iload           4
		//   13   22:putfield        #32  <Field boolean zzpj>
			zzfd = countdownlatch;
		//   14   25:aload_0         
		//   15   26:aload           5
		//   16   28:putfield        #34  <Field CountDownLatch zzfd>
		//   17   31:return          
		}
	}


	private ImageManager(Context context, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void Object()>
		mContext = context.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #77  <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #79  <Field Context mContext>
	//    6   12:aload_0         
	//    7   13:new             #81  <Class Handler>
	//    8   16:dup             
	//    9   17:invokestatic    #87  <Method Looper Looper.getMainLooper()>
	//   10   20:invokespecial   #90  <Method void Handler(Looper)>
	//   11   23:putfield        #92  <Field Handler mHandler>
	//   12   26:aload_0         
	//   13   27:iconst_4        
	//   14   28:invokestatic    #98  <Method ExecutorService Executors.newFixedThreadPool(int)>
	//   15   31:putfield        #100 <Field ExecutorService zzoz>
		if(flag)
	//*  16   34:iload_2         
	//*  17   35:ifeq            74
		{
			zzpa = new zza(mContext);
	//   18   38:aload_0         
	//   19   39:new             #12  <Class ImageManager$zza>
	//   20   42:dup             
	//   21   43:aload_0         
	//   22   44:getfield        #79  <Field Context mContext>
	//   23   47:invokespecial   #103 <Method void ImageManager$zza(Context)>
	//   24   50:putfield        #105 <Field ImageManager$zza zzpa>
			mContext.registerComponentCallbacks(((android.content.ComponentCallbacks) (new zzd(zzpa))));
	//   25   53:aload_0         
	//   26   54:getfield        #79  <Field Context mContext>
	//   27   57:new             #21  <Class ImageManager$zzd>
	//   28   60:dup             
	//   29   61:aload_0         
	//   30   62:getfield        #105 <Field ImageManager$zza zzpa>
	//   31   65:invokespecial   #108 <Method void ImageManager$zzd(ImageManager$zza)>
	//   32   68:invokevirtual   #112 <Method void Context.registerComponentCallbacks(android.content.ComponentCallbacks)>
		} else
	//*  33   71:goto            79
		{
			zzpa = null;
	//   34   74:aload_0         
	//   35   75:aconst_null     
	//   36   76:putfield        #105 <Field ImageManager$zza zzpa>
		}
	//   37   79:aload_0         
	//   38   80:new             #114 <Class PostProcessedResourceCache>
	//   39   83:dup             
	//   40   84:invokespecial   #115 <Method void PostProcessedResourceCache()>
	//   41   87:putfield        #117 <Field PostProcessedResourceCache zzpb>
	//   42   90:aload_0         
	//   43   91:new             #119 <Class HashMap>
	//   44   94:dup             
	//   45   95:invokespecial   #120 <Method void HashMap()>
	//   46   98:putfield        #122 <Field Map zzpc>
	//   47  101:aload_0         
	//   48  102:new             #119 <Class HashMap>
	//   49  105:dup             
	//   50  106:invokespecial   #120 <Method void HashMap()>
	//   51  109:putfield        #124 <Field Map zzpd>
	//   52  112:aload_0         
	//   53  113:new             #119 <Class HashMap>
	//   54  116:dup             
	//   55  117:invokespecial   #120 <Method void HashMap()>
	//   56  120:putfield        #126 <Field Map zzpe>
	//   57  123:return          
	}

	public static ImageManager create(Context context)
	{
		return create(context, false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #131 <Method ImageManager create(Context, boolean)>
	//    3    5:areturn         
	}

	public static ImageManager create(Context context, boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            26
		{
			if(zzoy == null)
	//*   2    4:getstatic       #133 <Field ImageManager zzoy>
	//*   3    7:ifnonnull       22
				zzoy = new ImageManager(context, true);
	//    4   10:new             #2   <Class ImageManager>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:invokespecial   #135 <Method void ImageManager(Context, boolean)>
	//    9   19:putstatic       #133 <Field ImageManager zzoy>
			return zzoy;
	//   10   22:getstatic       #133 <Field ImageManager zzoy>
	//   11   25:areturn         
		}
		if(zzox == null)
	//*  12   26:getstatic       #137 <Field ImageManager zzox>
	//*  13   29:ifnonnull       44
			zzox = new ImageManager(context, false);
	//   14   32:new             #2   <Class ImageManager>
	//   15   35:dup             
	//   16   36:aload_0         
	//   17   37:iconst_0        
	//   18   38:invokespecial   #135 <Method void ImageManager(Context, boolean)>
	//   19   41:putstatic       #137 <Field ImageManager zzox>
		return zzox;
	//   20   44:getstatic       #137 <Field ImageManager zzox>
	//   21   47:areturn         
	}

	static Bitmap zza(ImageManager imagemanager, ImageRequest.zza zza1)
	{
		return imagemanager.zza(zza1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #141 <Method Bitmap zza(ImageRequest$zza)>
	//    3    5:areturn         
	}

	private final Bitmap zza(ImageRequest.zza zza1)
	{
		if(zzpa == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #105 <Field ImageManager$zza zzpa>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return (Bitmap)zzpa.get(((Object) (zza1)));
	//    5    9:aload_0         
	//    6   10:getfield        #105 <Field ImageManager$zza zzpa>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #145 <Method Object ImageManager$zza.get(Object)>
	//    9   17:checkcast       #147 <Class Bitmap>
	//   10   20:areturn         
	}

	static Map zza(ImageManager imagemanager)
	{
		return imagemanager.zzpc;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field Map zzpc>
	//    2    4:areturn         
	}

	static Context zzb(ImageManager imagemanager)
	{
		return imagemanager.mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Context mContext>
	//    2    4:areturn         
	}

	static PostProcessedResourceCache zzc(ImageManager imagemanager)
	{
		return imagemanager.zzpb;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field PostProcessedResourceCache zzpb>
	//    2    4:areturn         
	}

	static Object zzcm()
	{
		return zzov;
	//    0    0:getstatic       #64  <Field Object zzov>
	//    1    3:areturn         
	}

	static HashSet zzcn()
	{
		return zzow;
	//    0    0:getstatic       #69  <Field HashSet zzow>
	//    1    3:areturn         
	}

	static Map zzd(ImageManager imagemanager)
	{
		return imagemanager.zzpe;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field Map zzpe>
	//    2    4:areturn         
	}

	static Map zze(ImageManager imagemanager)
	{
		return imagemanager.zzpd;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field Map zzpd>
	//    2    4:areturn         
	}

	static ExecutorService zzf(ImageManager imagemanager)
	{
		return imagemanager.zzoz;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field ExecutorService zzoz>
	//    2    4:areturn         
	}

	static Handler zzg(ImageManager imagemanager)
	{
		return imagemanager.mHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field Handler mHandler>
	//    2    4:areturn         
	}

	static zza zzh(ImageManager imagemanager)
	{
		return imagemanager.zzpa;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field ImageManager$zza zzpa>
	//    2    4:areturn         
	}

	public final void loadImage(ImageView imageview, int i)
	{
		loadImage(((ImageRequest) (new ImageRequest.ImageViewImageRequest(imageview, i))));
	//    0    0:aload_0         
	//    1    1:new             #164 <Class ImageRequest$ImageViewImageRequest>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #166 <Method void ImageRequest$ImageViewImageRequest(ImageView, int)>
	//    6   10:invokevirtual   #169 <Method void loadImage(ImageRequest)>
	//    7   13:return          
	}

	public final void loadImage(ImageView imageview, Uri uri)
	{
		loadImage(((ImageRequest) (new ImageRequest.ImageViewImageRequest(imageview, uri))));
	//    0    0:aload_0         
	//    1    1:new             #164 <Class ImageRequest$ImageViewImageRequest>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #172 <Method void ImageRequest$ImageViewImageRequest(ImageView, Uri)>
	//    6   10:invokevirtual   #169 <Method void loadImage(ImageRequest)>
	//    7   13:return          
	}

	public final void loadImage(ImageView imageview, Uri uri, int i)
	{
		imageview = ((ImageView) (new ImageRequest.ImageViewImageRequest(imageview, uri)));
	//    0    0:new             #164 <Class ImageRequest$ImageViewImageRequest>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #172 <Method void ImageRequest$ImageViewImageRequest(ImageView, Uri)>
	//    5    9:astore_1        
		((ImageRequest) (imageview)).setNoDataPlaceholder(i);
	//    6   10:aload_1         
	//    7   11:iload_3         
	//    8   12:invokevirtual   #179 <Method void ImageRequest.setNoDataPlaceholder(int)>
		loadImage(((ImageRequest) (imageview)));
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #169 <Method void loadImage(ImageRequest)>
	//   12   20:return          
	}

	public final void loadImage(OnImageLoadedListener onimageloadedlistener, Uri uri)
	{
		loadImage(((ImageRequest) (new ImageRequest.ListenerImageRequest(onimageloadedlistener, uri))));
	//    0    0:aload_0         
	//    1    1:new             #182 <Class ImageRequest$ListenerImageRequest>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #184 <Method void ImageRequest$ListenerImageRequest(ImageManager$OnImageLoadedListener, Uri)>
	//    6   10:invokevirtual   #169 <Method void loadImage(ImageRequest)>
	//    7   13:return          
	}

	public final void loadImage(OnImageLoadedListener onimageloadedlistener, Uri uri, int i)
	{
		onimageloadedlistener = ((OnImageLoadedListener) (new ImageRequest.ListenerImageRequest(onimageloadedlistener, uri)));
	//    0    0:new             #182 <Class ImageRequest$ListenerImageRequest>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #184 <Method void ImageRequest$ListenerImageRequest(ImageManager$OnImageLoadedListener, Uri)>
	//    5    9:astore_1        
		((ImageRequest) (onimageloadedlistener)).setNoDataPlaceholder(i);
	//    6   10:aload_1         
	//    7   11:iload_3         
	//    8   12:invokevirtual   #179 <Method void ImageRequest.setNoDataPlaceholder(int)>
		loadImage(((ImageRequest) (onimageloadedlistener)));
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #169 <Method void loadImage(ImageRequest)>
	//   12   20:return          
	}

	public final void loadImage(ImageRequest imagerequest)
	{
		Asserts.checkMainThread("ImageManager.loadImage() must be called in the main thread");
	//    0    0:ldc1            #187 <String "ImageManager.loadImage() must be called in the main thread">
	//    1    2:invokestatic    #193 <Method void Asserts.checkMainThread(String)>
		((Runnable) (new zzc(imagerequest))).run();
	//    2    5:new             #18  <Class ImageManager$zzc>
	//    3    8:dup             
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:invokespecial   #196 <Method void ImageManager$zzc(ImageManager, ImageRequest)>
	//    7   14:invokeinterface #201 <Method void Runnable.run()>
	//    8   19:return          
	}

	public static final int PRIORITY_HIGH = 3;
	public static final int PRIORITY_LOW = 1;
	public static final int PRIORITY_MEDIUM = 2;
	private static final Object zzov = new Object();
	private static HashSet zzow = new HashSet();
	private static ImageManager zzox;
	private static ImageManager zzoy;
	private final Context mContext;
	private final Handler mHandler = new Handler(Looper.getMainLooper());
	private final ExecutorService zzoz = Executors.newFixedThreadPool(4);
	private final zza zzpa;
	private final PostProcessedResourceCache zzpb = new PostProcessedResourceCache();
	private final Map zzpc = new HashMap();
	private final Map zzpd = new HashMap();
	private final Map zzpe = new HashMap();

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #62  <Method void Object()>
	//    3    7:putstatic       #64  <Field Object zzov>
	//    4   10:new             #66  <Class HashSet>
	//    5   13:dup             
	//    6   14:invokespecial   #67  <Method void HashSet()>
	//    7   17:putstatic       #69  <Field HashSet zzow>
	//*   8   20:return          
	}
}
