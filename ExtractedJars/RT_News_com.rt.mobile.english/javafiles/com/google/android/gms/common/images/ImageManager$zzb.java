// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.images;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.internal.Asserts;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.common.images:
//			ImageManager

private final class ImageManager$zzb
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
	//   18   32:invokestatic    #54  <Method android.graphics.Bitmap BitmapFactory.decodeFileDescriptor(java.io.FileDescriptor)>
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
		ImageManager.zzg(zzpg).post(((Runnable) (new ImageManager$zze(zzpg, mUri, ((android.graphics.Bitmap) (obj)), flag, ((CountDownLatch) (obj2))))));
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
	//   82  159:invokespecial   #104 <Method void ImageManager$zze(ImageManager, Uri, android.graphics.Bitmap, boolean, CountDownLatch)>
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

	public ImageManager$zzb(ImageManager imagemanager, Uri uri, ParcelFileDescriptor parcelfiledescriptor)
	{
		zzpg = imagemanager;
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
