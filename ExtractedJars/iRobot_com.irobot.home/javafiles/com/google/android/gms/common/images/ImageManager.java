// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.*;
import android.support.v4.f.g;
import android.util.Log;
import android.widget.ImageView;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zak;
import com.google.android.gms.internal.base.zal;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.*;

// Referenced classes of package com.google.android.gms.common.images:
//			zac, zaa, zad, zab

public final class ImageManager
{
	private final class ImageReceiver extends ResultReceiver
	{

		static ArrayList zaa(ImageReceiver imagereceiver)
		{
			return imagereceiver.zamp;
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field ArrayList zamp>
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
			ImageManager.zaf(zamq).execute(((Runnable) (((zab) (zamq)). new zab(mUri, ((ParcelFileDescriptor) (bundle))))));
		//    5   10:aload_0         
		//    6   11:getfield        #19  <Field ImageManager zamq>
		//    7   14:invokestatic    #61  <Method ExecutorService ImageManager.zaf(ImageManager)>
		//    8   17:new             #63  <Class ImageManager$zab>
		//    9   20:dup             
		//   10   21:aload_0         
		//   11   22:getfield        #19  <Field ImageManager zamq>
		//   12   25:aload_0         
		//   13   26:getfield        #35  <Field Uri mUri>
		//   14   29:aload_2         
		//   15   30:invokespecial   #66  <Method void ImageManager$zab(ImageManager, Uri, ParcelFileDescriptor)>
		//   16   33:invokeinterface #72  <Method void ExecutorService.execute(Runnable)>
		//   17   38:return          
		}

		public final void zab(com.google.android.gms.common.images.zaa zaa1)
		{
			Asserts.checkMainThread("ImageReceiver.addImageRequest() must be called in the main thread");
		//    0    0:ldc1            #76  <String "ImageReceiver.addImageRequest() must be called in the main thread">
		//    1    2:invokestatic    #82  <Method void Asserts.checkMainThread(String)>
			zamp.add(((Object) (zaa1)));
		//    2    5:aload_0         
		//    3    6:getfield        #42  <Field ArrayList zamp>
		//    4    9:aload_1         
		//    5   10:invokevirtual   #86  <Method boolean ArrayList.add(Object)>
		//    6   13:pop             
		//    7   14:return          
		}

		public final void zac(com.google.android.gms.common.images.zaa zaa1)
		{
			Asserts.checkMainThread("ImageReceiver.removeImageRequest() must be called in the main thread");
		//    0    0:ldc1            #89  <String "ImageReceiver.removeImageRequest() must be called in the main thread">
		//    1    2:invokestatic    #82  <Method void Asserts.checkMainThread(String)>
			zamp.remove(((Object) (zaa1)));
		//    2    5:aload_0         
		//    3    6:getfield        #42  <Field ArrayList zamp>
		//    4    9:aload_1         
		//    5   10:invokevirtual   #92  <Method boolean ArrayList.remove(Object)>
		//    6   13:pop             
		//    7   14:return          
		}

		public final void zace()
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
			ImageManager.zab(zamq).sendBroadcast(intent);
		//   21   37:aload_0         
		//   22   38:getfield        #19  <Field ImageManager zamq>
		//   23   41:invokestatic    #115 <Method Context ImageManager.zab(ImageManager)>
		//   24   44:aload_1         
		//   25   45:invokevirtual   #121 <Method void Context.sendBroadcast(Intent)>
		//   26   48:return          
		}

		private final Uri mUri;
		private final ArrayList zamp = new ArrayList();
		private final ImageManager zamq;

		ImageReceiver(Uri uri)
		{
			zamq = ImageManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field ImageManager zamq>
			super(((Handler) (new zal(Looper.getMainLooper()))));
		//    3    5:aload_0         
		//    4    6:new             #21  <Class zal>
		//    5    9:dup             
		//    6   10:invokestatic    #27  <Method Looper Looper.getMainLooper()>
		//    7   13:invokespecial   #30  <Method void zal(Looper)>
		//    8   16:invokespecial   #33  <Method void ResultReceiver(Handler)>
			mUri = uri;
		//    9   19:aload_0         
		//   10   20:aload_2         
		//   11   21:putfield        #35  <Field Uri mUri>
		//   12   24:aload_0         
		//   13   25:new             #37  <Class ArrayList>
		//   14   28:dup             
		//   15   29:invokespecial   #40  <Method void ArrayList()>
		//   16   32:putfield        #42  <Field ArrayList zamp>
		//   17   35:return          
		}
	}

	public static interface OnImageLoadedListener
	{

		public abstract void onImageLoaded(Uri uri, Drawable drawable, boolean flag);
	}

	private static final class zaa extends g
	{

		protected final void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
		{
			super.entryRemoved(flag, ((Object) ((com.google.android.gms.common.images.zab)obj)), ((Object) ((Bitmap)obj1)), ((Object) ((Bitmap)obj2)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #12  <Class zab>
		//    4    6:aload_3         
		//    5    7:checkcast       #14  <Class Bitmap>
		//    6   10:aload           4
		//    7   12:checkcast       #14  <Class Bitmap>
		//    8   15:invokespecial   #16  <Method void g.entryRemoved(boolean, Object, Object, Object)>
		//    9   18:return          
		}

		protected final int sizeOf(Object obj, Object obj1)
		{
			obj = ((Object) ((Bitmap)obj1));
		//    0    0:aload_2         
		//    1    1:checkcast       #14  <Class Bitmap>
		//    2    4:astore_1        
			return ((Bitmap) (obj)).getHeight() * ((Bitmap) (obj)).getRowBytes();
		//    3    5:aload_1         
		//    4    6:invokevirtual   #23  <Method int Bitmap.getHeight()>
		//    5    9:aload_1         
		//    6   10:invokevirtual   #26  <Method int Bitmap.getRowBytes()>
		//    7   13:imul            
		//    8   14:ireturn         
		}
	}

	private final class zab
		implements Runnable
	{

		public final void run()
		{
			boolean flag;
			Object obj;
			Asserts.checkNotMainThread("LoadBitmapFromDiskRunnable can't be executed in the main thread");
		//    0    0:ldc1            #36  <String "LoadBitmapFromDiskRunnable can't be executed in the main thread">
		//    1    2:invokestatic    #42  <Method void Asserts.checkNotMainThread(String)>
			ParcelFileDescriptor parcelfiledescriptor = zamr;
		//    2    5:aload_0         
		//    3    6:getfield        #26  <Field ParcelFileDescriptor zamr>
		//    4    9:astore_3        
			flag = false;
		//    5   10:iconst_0        
		//    6   11:istore_1        
			obj = null;
		//    7   12:aconst_null     
		//    8   13:astore_2        
			if(parcelfiledescriptor == null)
				break MISSING_BLOCK_LABEL_117;
		//    9   14:aload_3         
		//   10   15:ifnull          117
			Bitmap bitmap = BitmapFactory.decodeFileDescriptor(zamr.getFileDescriptor());
		//   11   18:aload_0         
		//   12   19:getfield        #26  <Field ParcelFileDescriptor zamr>
		//   13   22:invokevirtual   #48  <Method java.io.FileDescriptor ParcelFileDescriptor.getFileDescriptor()>
		//   14   25:invokestatic    #54  <Method Bitmap BitmapFactory.decodeFileDescriptor(java.io.FileDescriptor)>
		//   15   28:astore_3        
			obj = ((Object) (bitmap));
		//   16   29:aload_3         
		//   17   30:astore_2        
			break MISSING_BLOCK_LABEL_94;
		//   18   31:goto            94
			OutOfMemoryError outofmemoryerror;
			outofmemoryerror;
		//   19   34:astore_3        
			String s = String.valueOf(((Object) (mUri)));
		//   20   35:aload_0         
		//   21   36:getfield        #24  <Field Uri mUri>
		//   22   39:invokestatic    #60  <Method String String.valueOf(Object)>
		//   23   42:astore          4
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 34);
		//   24   44:new             #62  <Class StringBuilder>
		//   25   47:dup             
		//   26   48:aload           4
		//   27   50:invokestatic    #60  <Method String String.valueOf(Object)>
		//   28   53:invokevirtual   #66  <Method int String.length()>
		//   29   56:bipush          34
		//   30   58:iadd            
		//   31   59:invokespecial   #69  <Method void StringBuilder(int)>
		//   32   62:astore          5
			stringbuilder.append("OOM while loading bitmap for uri: ");
		//   33   64:aload           5
		//   34   66:ldc1            #71  <String "OOM while loading bitmap for uri: ">
		//   35   68:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//   36   71:pop             
			stringbuilder.append(s);
		//   37   72:aload           5
		//   38   74:aload           4
		//   39   76:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//   40   79:pop             
			Log.e("ImageManager", stringbuilder.toString(), ((Throwable) (outofmemoryerror)));
		//   41   80:ldc1            #77  <String "ImageManager">
		//   42   82:aload           5
		//   43   84:invokevirtual   #81  <Method String StringBuilder.toString()>
		//   44   87:aload_3         
		//   45   88:invokestatic    #87  <Method int Log.e(String, String, Throwable)>
		//   46   91:pop             
			flag = true;
		//   47   92:iconst_1        
		//   48   93:istore_1        
			try
			{
				zamr.close();
		//   49   94:aload_0         
		//   50   95:getfield        #26  <Field ParcelFileDescriptor zamr>
		//   51   98:invokevirtual   #90  <Method void ParcelFileDescriptor.close()>
			}
		//*  52  101:goto            114
			catch(IOException ioexception)
		//*  53  104:astore_3        
			{
				Log.e("ImageManager", "closed failed", ((Throwable) (ioexception)));
		//   54  105:ldc1            #77  <String "ImageManager">
		//   55  107:ldc1            #92  <String "closed failed">
		//   56  109:aload_3         
		//   57  110:invokestatic    #87  <Method int Log.e(String, String, Throwable)>
		//   58  113:pop             
			}
			break MISSING_BLOCK_LABEL_121;
		//   59  114:goto            121
			obj = null;
		//   60  117:aconst_null     
		//   61  118:astore_2        
			flag = false;
		//   62  119:iconst_0        
		//   63  120:istore_1        
			InterruptedException interruptedexception;
			Object obj1 = ((Object) (new CountDownLatch(1)));
		//   64  121:new             #94  <Class CountDownLatch>
		//   65  124:dup             
		//   66  125:iconst_1        
		//   67  126:invokespecial   #95  <Method void CountDownLatch(int)>
		//   68  129:astore_3        
			ImageManager.zag(zamq).post(((Runnable) (((zad) (zamq)). new zad(mUri, ((Bitmap) (obj)), flag, ((CountDownLatch) (obj1))))));
		//   69  130:aload_0         
		//   70  131:getfield        #19  <Field ImageManager zamq>
		//   71  134:invokestatic    #99  <Method Handler ImageManager.zag(ImageManager)>
		//   72  137:new             #101 <Class ImageManager$zad>
		//   73  140:dup             
		//   74  141:aload_0         
		//   75  142:getfield        #19  <Field ImageManager zamq>
		//   76  145:aload_0         
		//   77  146:getfield        #24  <Field Uri mUri>
		//   78  149:aload_2         
		//   79  150:iload_1         
		//   80  151:aload_3         
		//   81  152:invokespecial   #104 <Method void ImageManager$zad(ImageManager, Uri, Bitmap, boolean, CountDownLatch)>
		//   82  155:invokevirtual   #110 <Method boolean Handler.post(Runnable)>
		//   83  158:pop             
			try
			{
				((CountDownLatch) (obj1)).await();
		//   84  159:aload_3         
		//   85  160:invokevirtual   #113 <Method void CountDownLatch.await()>
				return;
		//   86  163:return          
			}
		//*  87  164:aload_0         
		//*  88  165:getfield        #24  <Field Uri mUri>
		//*  89  168:invokestatic    #60  <Method String String.valueOf(Object)>
		//*  90  171:astore_2        
		//*  91  172:new             #62  <Class StringBuilder>
		//*  92  175:dup             
		//*  93  176:aload_2         
		//*  94  177:invokestatic    #60  <Method String String.valueOf(Object)>
		//*  95  180:invokevirtual   #66  <Method int String.length()>
		//*  96  183:bipush          32
		//*  97  185:iadd            
		//*  98  186:invokespecial   #69  <Method void StringBuilder(int)>
		//*  99  189:astore_3        
		//* 100  190:aload_3         
		//* 101  191:ldc1            #115 <String "Latch interrupted while posting ">
		//* 102  193:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//* 103  196:pop             
		//* 104  197:aload_3         
		//* 105  198:aload_2         
		//* 106  199:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//* 107  202:pop             
		//* 108  203:ldc1            #77  <String "ImageManager">
		//* 109  205:aload_3         
		//* 110  206:invokevirtual   #81  <Method String StringBuilder.toString()>
		//* 111  209:invokestatic    #119 <Method int Log.w(String, String)>
		//* 112  212:pop             
		//* 113  213:return          
			// Misplaced declaration of an exception variable
			catch(InterruptedException interruptedexception)
			{
				obj = ((Object) (String.valueOf(((Object) (mUri)))));
			}
			obj1 = ((Object) (new StringBuilder(String.valueOf(obj).length() + 32)));
			((StringBuilder) (obj1)).append("Latch interrupted while posting ");
			((StringBuilder) (obj1)).append(((String) (obj)));
			Log.w("ImageManager", ((StringBuilder) (obj1)).toString());
			return;
		//* 114  214:astore_2        
		//* 115  215:goto            164
		}

		private final Uri mUri;
		private final ImageManager zamq;
		private final ParcelFileDescriptor zamr;

		public zab(Uri uri, ParcelFileDescriptor parcelfiledescriptor)
		{
			zamq = ImageManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field ImageManager zamq>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #22  <Method void Object()>
			mUri = uri;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field Uri mUri>
			zamr = parcelfiledescriptor;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #26  <Field ParcelFileDescriptor zamr>
		//   11   19:return          
		}
	}

	private final class zac
		implements Runnable
	{

		public final void run()
		{
			Asserts.checkMainThread("LoadImageRunnable must be executed on the main thread");
		//    0    0:ldc1            #26  <String "LoadImageRunnable must be executed on the main thread">
		//    1    2:invokestatic    #32  <Method void Asserts.checkMainThread(String)>
			Object obj = ((Object) ((ImageReceiver)ImageManager.zaa(zamq).get(((Object) (zams)))));
		//    2    5:aload_0         
		//    3    6:getfield        #17  <Field ImageManager zamq>
		//    4    9:invokestatic    #36  <Method Map ImageManager.zaa(ImageManager)>
		//    5   12:aload_0         
		//    6   13:getfield        #22  <Field zaa zams>
		//    7   16:invokeinterface #42  <Method Object Map.get(Object)>
		//    8   21:checkcast       #44  <Class ImageManager$ImageReceiver>
		//    9   24:astore_1        
			if(obj != null)
		//*  10   25:aload_1         
		//*  11   26:ifnull          54
			{
				ImageManager.zaa(zamq).remove(((Object) (zams)));
		//   12   29:aload_0         
		//   13   30:getfield        #17  <Field ImageManager zamq>
		//   14   33:invokestatic    #36  <Method Map ImageManager.zaa(ImageManager)>
		//   15   36:aload_0         
		//   16   37:getfield        #22  <Field zaa zams>
		//   17   40:invokeinterface #47  <Method Object Map.remove(Object)>
		//   18   45:pop             
				((ImageReceiver) (obj)).zac(zams);
		//   19   46:aload_1         
		//   20   47:aload_0         
		//   21   48:getfield        #22  <Field zaa zams>
		//   22   51:invokevirtual   #50  <Method void ImageManager$ImageReceiver.zac(zaa)>
			}
			com.google.android.gms.common.images.zab zab1 = zams.zamu;
		//   23   54:aload_0         
		//   24   55:getfield        #22  <Field zaa zams>
		//   25   58:getfield        #56  <Field zab zaa.zamu>
		//   26   61:astore_3        
			if(zab1.uri == null)
		//*  27   62:aload_3         
		//*  28   63:getfield        #62  <Field Uri zab.uri>
		//*  29   66:ifnonnull       92
			{
				zams.zaa(ImageManager.zab(zamq), ImageManager.zac(zamq), true);
		//   30   69:aload_0         
		//   31   70:getfield        #22  <Field zaa zams>
		//   32   73:aload_0         
		//   33   74:getfield        #17  <Field ImageManager zamq>
		//   34   77:invokestatic    #66  <Method Context ImageManager.zab(ImageManager)>
		//   35   80:aload_0         
		//   36   81:getfield        #17  <Field ImageManager zamq>
		//   37   84:invokestatic    #69  <Method zak ImageManager.zac(ImageManager)>
		//   38   87:iconst_1        
		//   39   88:invokevirtual   #72  <Method void zaa.zaa(Context, zak, boolean)>
				return;
		//   40   91:return          
			}
			obj = ((Object) (ImageManager.zaa(zamq, zab1)));
		//   41   92:aload_0         
		//   42   93:getfield        #17  <Field ImageManager zamq>
		//   43   96:aload_3         
		//   44   97:invokestatic    #75  <Method Bitmap ImageManager.zaa(ImageManager, zab)>
		//   45  100:astore_1        
			if(obj != null)
		//*  46  101:aload_1         
		//*  47  102:ifnull          122
			{
				zams.zaa(ImageManager.zab(zamq), ((Bitmap) (obj)), true);
		//   48  105:aload_0         
		//   49  106:getfield        #22  <Field zaa zams>
		//   50  109:aload_0         
		//   51  110:getfield        #17  <Field ImageManager zamq>
		//   52  113:invokestatic    #66  <Method Context ImageManager.zab(ImageManager)>
		//   53  116:aload_1         
		//   54  117:iconst_1        
		//   55  118:invokevirtual   #78  <Method void zaa.zaa(Context, Bitmap, boolean)>
				return;
		//   56  121:return          
			}
			obj = ((Object) ((Long)ImageManager.zad(zamq).get(((Object) (zab1.uri)))));
		//   57  122:aload_0         
		//   58  123:getfield        #17  <Field ImageManager zamq>
		//   59  126:invokestatic    #81  <Method Map ImageManager.zad(ImageManager)>
		//   60  129:aload_3         
		//   61  130:getfield        #62  <Field Uri zab.uri>
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
					zams.zaa(ImageManager.zab(zamq), ImageManager.zac(zamq), true);
		//   74  161:aload_0         
		//   75  162:getfield        #22  <Field zaa zams>
		//   76  165:aload_0         
		//   77  166:getfield        #17  <Field ImageManager zamq>
		//   78  169:invokestatic    #66  <Method Context ImageManager.zab(ImageManager)>
		//   79  172:aload_0         
		//   80  173:getfield        #17  <Field ImageManager zamq>
		//   81  176:invokestatic    #69  <Method zak ImageManager.zac(ImageManager)>
		//   82  179:iconst_1        
		//   83  180:invokevirtual   #72  <Method void zaa.zaa(Context, zak, boolean)>
					return;
		//   84  183:return          
				}
				ImageManager.zad(zamq).remove(((Object) (zab1.uri)));
		//   85  184:aload_0         
		//   86  185:getfield        #17  <Field ImageManager zamq>
		//   87  188:invokestatic    #81  <Method Map ImageManager.zad(ImageManager)>
		//   88  191:aload_3         
		//   89  192:getfield        #62  <Field Uri zab.uri>
		//   90  195:invokeinterface #47  <Method Object Map.remove(Object)>
		//   91  200:pop             
			}
			zams.zaa(ImageManager.zab(zamq), ImageManager.zac(zamq));
		//   92  201:aload_0         
		//   93  202:getfield        #22  <Field zaa zams>
		//   94  205:aload_0         
		//   95  206:getfield        #17  <Field ImageManager zamq>
		//   96  209:invokestatic    #66  <Method Context ImageManager.zab(ImageManager)>
		//   97  212:aload_0         
		//   98  213:getfield        #17  <Field ImageManager zamq>
		//   99  216:invokestatic    #69  <Method zak ImageManager.zac(ImageManager)>
		//  100  219:invokevirtual   #97  <Method void zaa.zaa(Context, zak)>
			ImageReceiver imagereceiver = (ImageReceiver)ImageManager.zae(zamq).get(((Object) (zab1.uri)));
		//  101  222:aload_0         
		//  102  223:getfield        #17  <Field ImageManager zamq>
		//  103  226:invokestatic    #100 <Method Map ImageManager.zae(ImageManager)>
		//  104  229:aload_3         
		//  105  230:getfield        #62  <Field Uri zab.uri>
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
				obj = ((Object) (((ImageReceiver) (zamq)). new ImageReceiver(zab1.uri)));
		//  113  248:new             #44  <Class ImageManager$ImageReceiver>
		//  114  251:dup             
		//  115  252:aload_0         
		//  116  253:getfield        #17  <Field ImageManager zamq>
		//  117  256:aload_3         
		//  118  257:getfield        #62  <Field Uri zab.uri>
		//  119  260:invokespecial   #103 <Method void ImageManager$ImageReceiver(ImageManager, Uri)>
		//  120  263:astore_1        
				ImageManager.zae(zamq).put(((Object) (zab1.uri)), obj);
		//  121  264:aload_0         
		//  122  265:getfield        #17  <Field ImageManager zamq>
		//  123  268:invokestatic    #100 <Method Map ImageManager.zae(ImageManager)>
		//  124  271:aload_3         
		//  125  272:getfield        #62  <Field Uri zab.uri>
		//  126  275:aload_1         
		//  127  276:invokeinterface #107 <Method Object Map.put(Object, Object)>
		//  128  281:pop             
			}
			((ImageReceiver) (obj)).zab(zams);
		//  129  282:aload_1         
		//  130  283:aload_0         
		//  131  284:getfield        #22  <Field zaa zams>
		//  132  287:invokevirtual   #109 <Method void ImageManager$ImageReceiver.zab(zaa)>
			if(!(zams instanceof com.google.android.gms.common.images.zad))
		//* 133  290:aload_0         
		//* 134  291:getfield        #22  <Field zaa zams>
		//* 135  294:instanceof      #111 <Class zad>
		//* 136  297:ifne            318
				ImageManager.zaa(zamq).put(((Object) (zams)), obj);
		//  137  300:aload_0         
		//  138  301:getfield        #17  <Field ImageManager zamq>
		//  139  304:invokestatic    #36  <Method Map ImageManager.zaa(ImageManager)>
		//  140  307:aload_0         
		//  141  308:getfield        #22  <Field zaa zams>
		//  142  311:aload_1         
		//  143  312:invokeinterface #107 <Method Object Map.put(Object, Object)>
		//  144  317:pop             
			synchronized(ImageManager.zacc())
		//* 145  318:invokestatic    #115 <Method Object ImageManager.zacc()>
		//* 146  321:astore_2        
		//* 147  322:aload_2         
		//* 148  323:monitorenter    
			{
				if(!ImageManager.zacd().contains(((Object) (zab1.uri))))
		//* 149  324:invokestatic    #119 <Method HashSet ImageManager.zacd()>
		//* 150  327:aload_3         
		//* 151  328:getfield        #62  <Field Uri zab.uri>
		//* 152  331:invokevirtual   #125 <Method boolean HashSet.contains(Object)>
		//* 153  334:ifne            352
				{
					ImageManager.zacd().add(((Object) (zab1.uri)));
		//  154  337:invokestatic    #119 <Method HashSet ImageManager.zacd()>
		//  155  340:aload_3         
		//  156  341:getfield        #62  <Field Uri zab.uri>
		//  157  344:invokevirtual   #128 <Method boolean HashSet.add(Object)>
		//  158  347:pop             
					((ImageReceiver) (obj)).zace();
		//  159  348:aload_1         
		//  160  349:invokevirtual   #131 <Method void ImageManager$ImageReceiver.zace()>
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

		private final ImageManager zamq;
		private final com.google.android.gms.common.images.zaa zams;

		public zac(com.google.android.gms.common.images.zaa zaa1)
		{
			zamq = ImageManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field ImageManager zamq>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
			zams = zaa1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field zaa zams>
		//    8   14:return          
		}
	}

	private final class zad
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
			if(ImageManager.zah(zamq) != null)
		//*  10   19:aload_0         
		//*  11   20:getfield        #23  <Field ImageManager zamq>
		//*  12   23:invokestatic    #48  <Method ImageManager$zaa ImageManager.zah(ImageManager)>
		//*  13   26:ifnull          97
			{
				if(zamt)
		//*  14   29:aload_0         
		//*  15   30:getfield        #32  <Field boolean zamt>
		//*  16   33:ifeq            67
				{
					ImageManager.zah(zamq).evictAll();
		//   17   36:aload_0         
		//   18   37:getfield        #23  <Field ImageManager zamq>
		//   19   40:invokestatic    #48  <Method ImageManager$zaa ImageManager.zah(ImageManager)>
		//   20   43:invokevirtual   #53  <Method void ImageManager$zaa.evictAll()>
					System.gc();
		//   21   46:invokestatic    #58  <Method void System.gc()>
					zamt = false;
		//   22   49:aload_0         
		//   23   50:iconst_0        
		//   24   51:putfield        #32  <Field boolean zamt>
					ImageManager.zag(zamq).post(((Runnable) (this)));
		//   25   54:aload_0         
		//   26   55:getfield        #23  <Field ImageManager zamq>
		//   27   58:invokestatic    #62  <Method Handler ImageManager.zag(ImageManager)>
		//   28   61:aload_0         
		//   29   62:invokevirtual   #68  <Method boolean Handler.post(Runnable)>
		//   30   65:pop             
					return;
		//   31   66:return          
				}
				if(flag)
		//*  32   67:iload_1         
		//*  33   68:ifeq            97
					ImageManager.zah(zamq).put(((Object) (new com.google.android.gms.common.images.zab(mUri))), ((Object) (mBitmap)));
		//   34   71:aload_0         
		//   35   72:getfield        #23  <Field ImageManager zamq>
		//   36   75:invokestatic    #48  <Method ImageManager$zaa ImageManager.zah(ImageManager)>
		//   37   78:new             #70  <Class zab>
		//   38   81:dup             
		//   39   82:aload_0         
		//   40   83:getfield        #28  <Field Uri mUri>
		//   41   86:invokespecial   #73  <Method void zab(Uri)>
		//   42   89:aload_0         
		//   43   90:getfield        #30  <Field Bitmap mBitmap>
		//   44   93:invokevirtual   #77  <Method Object ImageManager$zaa.put(Object, Object)>
		//   45   96:pop             
			}
			Object obj = ((Object) ((ImageReceiver)ImageManager.zae(zamq).remove(((Object) (mUri)))));
		//   46   97:aload_0         
		//   47   98:getfield        #23  <Field ImageManager zamq>
		//   48  101:invokestatic    #81  <Method Map ImageManager.zae(ImageManager)>
		//   49  104:aload_0         
		//   50  105:getfield        #28  <Field Uri mUri>
		//   51  108:invokeinterface #87  <Method Object Map.remove(Object)>
		//   52  113:checkcast       #89  <Class ImageManager$ImageReceiver>
		//   53  116:astore          4
			if(obj != null)
		//*  54  118:aload           4
		//*  55  120:ifnull          251
			{
				obj = ((Object) (ImageReceiver.zaa(((ImageReceiver) (obj)))));
		//   56  123:aload           4
		//   57  125:invokestatic    #93  <Method ArrayList ImageManager$ImageReceiver.zaa(ImageManager$ImageReceiver)>
		//   58  128:astore          4
				int j = ((ArrayList) (obj)).size();
		//   59  130:aload           4
		//   60  132:invokevirtual   #99  <Method int ArrayList.size()>
		//   61  135:istore_3        
				for(int i = 0; i < j; i++)
		//*  62  136:iconst_0        
		//*  63  137:istore_2        
		//*  64  138:iload_2         
		//*  65  139:iload_3         
		//*  66  140:icmpge          251
				{
					com.google.android.gms.common.images.zaa zaa1 = (com.google.android.gms.common.images.zaa)((ArrayList) (obj)).get(i);
		//   67  143:aload           4
		//   68  145:iload_2         
		//   69  146:invokevirtual   #103 <Method Object ArrayList.get(int)>
		//   70  149:checkcast       #105 <Class zaa>
		//   71  152:astore          5
					if(flag)
		//*  72  154:iload_1         
		//*  73  155:ifeq            178
					{
						zaa1.zaa(ImageManager.zab(zamq), mBitmap, false);
		//   74  158:aload           5
		//   75  160:aload_0         
		//   76  161:getfield        #23  <Field ImageManager zamq>
		//   77  164:invokestatic    #109 <Method Context ImageManager.zab(ImageManager)>
		//   78  167:aload_0         
		//   79  168:getfield        #30  <Field Bitmap mBitmap>
		//   80  171:iconst_0        
		//   81  172:invokevirtual   #112 <Method void zaa.zaa(Context, Bitmap, boolean)>
					} else
		//*  82  175:goto            221
					{
						ImageManager.zad(zamq).put(((Object) (mUri)), ((Object) (Long.valueOf(SystemClock.elapsedRealtime()))));
		//   83  178:aload_0         
		//   84  179:getfield        #23  <Field ImageManager zamq>
		//   85  182:invokestatic    #114 <Method Map ImageManager.zad(ImageManager)>
		//   86  185:aload_0         
		//   87  186:getfield        #28  <Field Uri mUri>
		//   88  189:invokestatic    #120 <Method long SystemClock.elapsedRealtime()>
		//   89  192:invokestatic    #126 <Method Long Long.valueOf(long)>
		//   90  195:invokeinterface #127 <Method Object Map.put(Object, Object)>
		//   91  200:pop             
						zaa1.zaa(ImageManager.zab(zamq), ImageManager.zac(zamq), false);
		//   92  201:aload           5
		//   93  203:aload_0         
		//   94  204:getfield        #23  <Field ImageManager zamq>
		//   95  207:invokestatic    #109 <Method Context ImageManager.zab(ImageManager)>
		//   96  210:aload_0         
		//   97  211:getfield        #23  <Field ImageManager zamq>
		//   98  214:invokestatic    #131 <Method zak ImageManager.zac(ImageManager)>
		//   99  217:iconst_0        
		//  100  218:invokevirtual   #134 <Method void zaa.zaa(Context, zak, boolean)>
					}
					if(!(zaa1 instanceof com.google.android.gms.common.images.zad))
		//* 101  221:aload           5
		//* 102  223:instanceof      #136 <Class zad>
		//* 103  226:ifne            244
						ImageManager.zaa(zamq).remove(((Object) (zaa1)));
		//  104  229:aload_0         
		//  105  230:getfield        #23  <Field ImageManager zamq>
		//  106  233:invokestatic    #138 <Method Map ImageManager.zaa(ImageManager)>
		//  107  236:aload           5
		//  108  238:invokeinterface #87  <Method Object Map.remove(Object)>
		//  109  243:pop             
				}

		//  110  244:iload_2         
		//  111  245:iconst_1        
		//  112  246:iadd            
		//  113  247:istore_2        
			}
		//* 114  248:goto            138
			zadq.countDown();
		//  115  251:aload_0         
		//  116  252:getfield        #34  <Field CountDownLatch zadq>
		//  117  255:invokevirtual   #143 <Method void CountDownLatch.countDown()>
			synchronized(ImageManager.zacc())
		//* 118  258:invokestatic    #147 <Method Object ImageManager.zacc()>
		//* 119  261:astore          4
		//* 120  263:aload           4
		//* 121  265:monitorenter    
			{
				ImageManager.zacd().remove(((Object) (mUri)));
		//  122  266:invokestatic    #151 <Method HashSet ImageManager.zacd()>
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
		private final CountDownLatch zadq;
		private final ImageManager zamq;
		private boolean zamt;

		public zad(Uri uri, Bitmap bitmap, boolean flag, CountDownLatch countdownlatch)
		{
			zamq = ImageManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #23  <Field ImageManager zamq>
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
			zamt = flag;
		//   11   19:aload_0         
		//   12   20:iload           4
		//   13   22:putfield        #32  <Field boolean zamt>
			zadq = countdownlatch;
		//   14   25:aload_0         
		//   15   26:aload           5
		//   16   28:putfield        #34  <Field CountDownLatch zadq>
		//   17   31:return          
		}
	}


	private ImageManager(Context context, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void Object()>
		mContext = context.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #66  <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #68  <Field Context mContext>
	//    6   12:aload_0         
	//    7   13:new             #70  <Class zal>
	//    8   16:dup             
	//    9   17:invokestatic    #76  <Method Looper Looper.getMainLooper()>
	//   10   20:invokespecial   #79  <Method void zal(Looper)>
	//   11   23:putfield        #81  <Field Handler mHandler>
	//   12   26:aload_0         
	//   13   27:iconst_4        
	//   14   28:invokestatic    #87  <Method ExecutorService Executors.newFixedThreadPool(int)>
	//   15   31:putfield        #89  <Field ExecutorService zamj>
	//   16   34:aload_0         
	//   17   35:aconst_null     
	//   18   36:putfield        #91  <Field ImageManager$zaa zamk>
	//   19   39:aload_0         
	//   20   40:new             #93  <Class zak>
	//   21   43:dup             
	//   22   44:invokespecial   #94  <Method void zak()>
	//   23   47:putfield        #96  <Field zak zaml>
	//   24   50:aload_0         
	//   25   51:new             #98  <Class HashMap>
	//   26   54:dup             
	//   27   55:invokespecial   #99  <Method void HashMap()>
	//   28   58:putfield        #101 <Field Map zamm>
	//   29   61:aload_0         
	//   30   62:new             #98  <Class HashMap>
	//   31   65:dup             
	//   32   66:invokespecial   #99  <Method void HashMap()>
	//   33   69:putfield        #103 <Field Map zamn>
	//   34   72:aload_0         
	//   35   73:new             #98  <Class HashMap>
	//   36   76:dup             
	//   37   77:invokespecial   #99  <Method void HashMap()>
	//   38   80:putfield        #105 <Field Map zamo>
	//   39   83:return          
	}

	public static ImageManager create(Context context)
	{
		if(zami == null)
	//*   0    0:getstatic       #109 <Field ImageManager zami>
	//*   1    3:ifnonnull       18
			zami = new ImageManager(context, false);
	//    2    6:new             #2   <Class ImageManager>
	//    3    9:dup             
	//    4   10:aload_0         
	//    5   11:iconst_0        
	//    6   12:invokespecial   #111 <Method void ImageManager(Context, boolean)>
	//    7   15:putstatic       #109 <Field ImageManager zami>
		return zami;
	//    8   18:getstatic       #109 <Field ImageManager zami>
	//    9   21:areturn         
	}

	static Bitmap zaa(ImageManager imagemanager, com.google.android.gms.common.images.zab zab1)
	{
		return imagemanager.zaa(zab1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #115 <Method Bitmap zaa(zab)>
	//    3    5:areturn         
	}

	private final Bitmap zaa(com.google.android.gms.common.images.zab zab1)
	{
		if(zamk == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #91  <Field ImageManager$zaa zamk>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return (Bitmap)zamk.get(((Object) (zab1)));
	//    5    9:aload_0         
	//    6   10:getfield        #91  <Field ImageManager$zaa zamk>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #119 <Method Object ImageManager$zaa.get(Object)>
	//    9   17:checkcast       #121 <Class Bitmap>
	//   10   20:areturn         
	}

	static Map zaa(ImageManager imagemanager)
	{
		return imagemanager.zamm;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field Map zamm>
	//    2    4:areturn         
	}

	private final void zaa(com.google.android.gms.common.images.zaa zaa1)
	{
		Asserts.checkMainThread("ImageManager.loadImage() must be called in the main thread");
	//    0    0:ldc1            #125 <String "ImageManager.loadImage() must be called in the main thread">
	//    1    2:invokestatic    #131 <Method void Asserts.checkMainThread(String)>
		((Runnable) (new zac(zaa1))).run();
	//    2    5:new             #18  <Class ImageManager$zac>
	//    3    8:dup             
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:invokespecial   #134 <Method void ImageManager$zac(ImageManager, zaa)>
	//    7   14:invokeinterface #139 <Method void Runnable.run()>
	//    8   19:return          
	}

	static Context zab(ImageManager imagemanager)
	{
		return imagemanager.mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field Context mContext>
	//    2    4:areturn         
	}

	static zak zac(ImageManager imagemanager)
	{
		return imagemanager.zaml;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field zak zaml>
	//    2    4:areturn         
	}

	static Object zacc()
	{
		return zamg;
	//    0    0:getstatic       #53  <Field Object zamg>
	//    1    3:areturn         
	}

	static HashSet zacd()
	{
		return zamh;
	//    0    0:getstatic       #58  <Field HashSet zamh>
	//    1    3:areturn         
	}

	static Map zad(ImageManager imagemanager)
	{
		return imagemanager.zamo;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field Map zamo>
	//    2    4:areturn         
	}

	static Map zae(ImageManager imagemanager)
	{
		return imagemanager.zamn;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field Map zamn>
	//    2    4:areturn         
	}

	static ExecutorService zaf(ImageManager imagemanager)
	{
		return imagemanager.zamj;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field ExecutorService zamj>
	//    2    4:areturn         
	}

	static Handler zag(ImageManager imagemanager)
	{
		return imagemanager.mHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field Handler mHandler>
	//    2    4:areturn         
	}

	static zaa zah(ImageManager imagemanager)
	{
		return imagemanager.zamk;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field ImageManager$zaa zamk>
	//    2    4:areturn         
	}

	public final void loadImage(ImageView imageview, int i)
	{
		zaa(((com.google.android.gms.common.images.zaa) (new com.google.android.gms.common.images.zac(imageview, i))));
	//    0    0:aload_0         
	//    1    1:new             #156 <Class zac>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #158 <Method void zac(ImageView, int)>
	//    6   10:invokespecial   #160 <Method void zaa(zaa)>
	//    7   13:return          
	}

	public final void loadImage(ImageView imageview, Uri uri)
	{
		zaa(((com.google.android.gms.common.images.zaa) (new com.google.android.gms.common.images.zac(imageview, uri))));
	//    0    0:aload_0         
	//    1    1:new             #156 <Class zac>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #163 <Method void zac(ImageView, Uri)>
	//    6   10:invokespecial   #160 <Method void zaa(zaa)>
	//    7   13:return          
	}

	public final void loadImage(ImageView imageview, Uri uri, int i)
	{
		imageview = ((ImageView) (new com.google.android.gms.common.images.zac(imageview, uri)));
	//    0    0:new             #156 <Class zac>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #163 <Method void zac(ImageView, Uri)>
	//    5    9:astore_1        
		imageview.zamw = i;
	//    6   10:aload_1         
	//    7   11:iload_3         
	//    8   12:putfield        #170 <Field int zaa.zamw>
		zaa(((com.google.android.gms.common.images.zaa) (imageview)));
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokespecial   #160 <Method void zaa(zaa)>
	//   12   20:return          
	}

	public final void loadImage(OnImageLoadedListener onimageloadedlistener, Uri uri)
	{
		zaa(((com.google.android.gms.common.images.zaa) (new com.google.android.gms.common.images.zad(onimageloadedlistener, uri))));
	//    0    0:aload_0         
	//    1    1:new             #173 <Class zad>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #175 <Method void zad(ImageManager$OnImageLoadedListener, Uri)>
	//    6   10:invokespecial   #160 <Method void zaa(zaa)>
	//    7   13:return          
	}

	public final void loadImage(OnImageLoadedListener onimageloadedlistener, Uri uri, int i)
	{
		onimageloadedlistener = ((OnImageLoadedListener) (new com.google.android.gms.common.images.zad(onimageloadedlistener, uri)));
	//    0    0:new             #173 <Class zad>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #175 <Method void zad(ImageManager$OnImageLoadedListener, Uri)>
	//    5    9:astore_1        
		onimageloadedlistener.zamw = i;
	//    6   10:aload_1         
	//    7   11:iload_3         
	//    8   12:putfield        #170 <Field int zaa.zamw>
		zaa(((com.google.android.gms.common.images.zaa) (onimageloadedlistener)));
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokespecial   #160 <Method void zaa(zaa)>
	//   12   20:return          
	}

	private static final Object zamg = new Object();
	private static HashSet zamh = new HashSet();
	private static ImageManager zami;
	private final Context mContext;
	private final Handler mHandler = new zal(Looper.getMainLooper());
	private final ExecutorService zamj = Executors.newFixedThreadPool(4);
	private final zaa zamk = null;
	private final zak zaml = new zak();
	private final Map zamm = new HashMap();
	private final Map zamn = new HashMap();
	private final Map zamo = new HashMap();

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void Object()>
	//    3    7:putstatic       #53  <Field Object zamg>
	//    4   10:new             #55  <Class HashSet>
	//    5   13:dup             
	//    6   14:invokespecial   #56  <Method void HashSet()>
	//    7   17:putstatic       #58  <Field HashSet zamh>
	//*   8   20:return          
	}
}
