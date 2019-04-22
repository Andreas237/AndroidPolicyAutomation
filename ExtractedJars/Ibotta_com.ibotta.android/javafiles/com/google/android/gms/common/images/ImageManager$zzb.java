// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.internal.Asserts;
import com.newrelic.agent.android.instrumentation.BitmapFactoryInstrumentation;
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
		Object obj;
		Object obj1;
		Asserts.checkNotMainThread("LoadBitmapFromDiskRunnable can't be executed in the main thread");
	//    0    0:ldc1            #37  <String "LoadBitmapFromDiskRunnable can't be executed in the main thread">
	//    1    2:invokestatic    #43  <Method void Asserts.checkNotMainThread(String)>
		obj1 = ((Object) (zzph));
	//    2    5:aload_0         
	//    3    6:getfield        #27  <Field ParcelFileDescriptor zzph>
	//    4    9:astore_3        
		flag = false;
	//    5   10:iconst_0        
	//    6   11:istore_1        
		obj = null;
	//    7   12:aconst_null     
	//    8   13:astore_2        
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_114;
	//    9   14:aload_3         
	//   10   15:ifnull          114
		obj1 = ((Object) (BitmapFactoryInstrumentation.decodeFileDescriptor(((ParcelFileDescriptor) (obj1)).getFileDescriptor())));
	//   11   18:aload_3         
	//   12   19:invokevirtual   #49  <Method java.io.FileDescriptor ParcelFileDescriptor.getFileDescriptor()>
	//   13   22:invokestatic    #55  <Method android.graphics.Bitmap BitmapFactoryInstrumentation.decodeFileDescriptor(java.io.FileDescriptor)>
	//   14   25:astore_3        
		obj = obj1;
	//   15   26:aload_3         
	//   16   27:astore_2        
		break MISSING_BLOCK_LABEL_91;
	//   17   28:goto            91
		OutOfMemoryError outofmemoryerror;
		outofmemoryerror;
	//   18   31:astore_3        
		String s = String.valueOf(((Object) (mUri)));
	//   19   32:aload_0         
	//   20   33:getfield        #25  <Field Uri mUri>
	//   21   36:invokestatic    #61  <Method String String.valueOf(Object)>
	//   22   39:astore          4
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 34);
	//   23   41:new             #63  <Class StringBuilder>
	//   24   44:dup             
	//   25   45:aload           4
	//   26   47:invokestatic    #61  <Method String String.valueOf(Object)>
	//   27   50:invokevirtual   #67  <Method int String.length()>
	//   28   53:bipush          34
	//   29   55:iadd            
	//   30   56:invokespecial   #70  <Method void StringBuilder(int)>
	//   31   59:astore          5
		stringbuilder.append("OOM while loading bitmap for uri: ");
	//   32   61:aload           5
	//   33   63:ldc1            #72  <String "OOM while loading bitmap for uri: ">
	//   34   65:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   35   68:pop             
		stringbuilder.append(s);
	//   36   69:aload           5
	//   37   71:aload           4
	//   38   73:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   39   76:pop             
		Log.e("ImageManager", stringbuilder.toString(), ((Throwable) (outofmemoryerror)));
	//   40   77:ldc1            #78  <String "ImageManager">
	//   41   79:aload           5
	//   42   81:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   43   84:aload_3         
	//   44   85:invokestatic    #88  <Method int Log.e(String, String, Throwable)>
	//   45   88:pop             
		flag = true;
	//   46   89:iconst_1        
	//   47   90:istore_1        
		try
		{
			zzph.close();
	//   48   91:aload_0         
	//   49   92:getfield        #27  <Field ParcelFileDescriptor zzph>
	//   50   95:invokevirtual   #91  <Method void ParcelFileDescriptor.close()>
		}
	//*  51   98:goto            111
		catch(IOException ioexception)
	//*  52  101:astore_3        
		{
			Log.e("ImageManager", "closed failed", ((Throwable) (ioexception)));
	//   53  102:ldc1            #78  <String "ImageManager">
	//   54  104:ldc1            #93  <String "closed failed">
	//   55  106:aload_3         
	//   56  107:invokestatic    #88  <Method int Log.e(String, String, Throwable)>
	//   57  110:pop             
		}
		break MISSING_BLOCK_LABEL_118;
	//   58  111:goto            118
		obj = null;
	//   59  114:aconst_null     
	//   60  115:astore_2        
		flag = false;
	//   61  116:iconst_0        
	//   62  117:istore_1        
		InterruptedException interruptedexception;
		Object obj2 = ((Object) (new CountDownLatch(1)));
	//   63  118:new             #95  <Class CountDownLatch>
	//   64  121:dup             
	//   65  122:iconst_1        
	//   66  123:invokespecial   #96  <Method void CountDownLatch(int)>
	//   67  126:astore_3        
		ImageManager.zzg(zzpg).post(((Runnable) (new ImageManager$zze(zzpg, mUri, ((android.graphics.Bitmap) (obj)), flag, ((CountDownLatch) (obj2))))));
	//   68  127:aload_0         
	//   69  128:getfield        #20  <Field ImageManager zzpg>
	//   70  131:invokestatic    #100 <Method Handler ImageManager.zzg(ImageManager)>
	//   71  134:new             #102 <Class ImageManager$zze>
	//   72  137:dup             
	//   73  138:aload_0         
	//   74  139:getfield        #20  <Field ImageManager zzpg>
	//   75  142:aload_0         
	//   76  143:getfield        #25  <Field Uri mUri>
	//   77  146:aload_2         
	//   78  147:iload_1         
	//   79  148:aload_3         
	//   80  149:invokespecial   #105 <Method void ImageManager$zze(ImageManager, Uri, android.graphics.Bitmap, boolean, CountDownLatch)>
	//   81  152:invokevirtual   #111 <Method boolean Handler.post(Runnable)>
	//   82  155:pop             
		try
		{
			((CountDownLatch) (obj2)).await();
	//   83  156:aload_3         
	//   84  157:invokevirtual   #114 <Method void CountDownLatch.await()>
			return;
	//   85  160:return          
		}
	//*  86  161:aload_0         
	//*  87  162:getfield        #25  <Field Uri mUri>
	//*  88  165:invokestatic    #61  <Method String String.valueOf(Object)>
	//*  89  168:astore_2        
	//*  90  169:new             #63  <Class StringBuilder>
	//*  91  172:dup             
	//*  92  173:aload_2         
	//*  93  174:invokestatic    #61  <Method String String.valueOf(Object)>
	//*  94  177:invokevirtual   #67  <Method int String.length()>
	//*  95  180:bipush          32
	//*  96  182:iadd            
	//*  97  183:invokespecial   #70  <Method void StringBuilder(int)>
	//*  98  186:astore_3        
	//*  99  187:aload_3         
	//* 100  188:ldc1            #116 <String "Latch interrupted while posting ">
	//* 101  190:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//* 102  193:pop             
	//* 103  194:aload_3         
	//* 104  195:aload_2         
	//* 105  196:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//* 106  199:pop             
	//* 107  200:ldc1            #78  <String "ImageManager">
	//* 108  202:aload_3         
	//* 109  203:invokevirtual   #82  <Method String StringBuilder.toString()>
	//* 110  206:invokestatic    #120 <Method int Log.w(String, String)>
	//* 111  209:pop             
	//* 112  210:return          
		// Misplaced declaration of an exception variable
		catch(InterruptedException interruptedexception)
		{
			obj = ((Object) (String.valueOf(((Object) (mUri)))));
		}
		obj2 = ((Object) (new StringBuilder(String.valueOf(obj).length() + 32)));
		((StringBuilder) (obj2)).append("Latch interrupted while posting ");
		((StringBuilder) (obj2)).append(((String) (obj)));
		Log.w("ImageManager", ((StringBuilder) (obj2)).toString());
		return;
	//* 113  211:astore_2        
	//* 114  212:goto            161
	}

	private final Uri mUri;
	private final ImageManager zzpg;
	private final ParcelFileDescriptor zzph;

	public ImageManager$zzb(ImageManager imagemanager, Uri uri, ParcelFileDescriptor parcelfiledescriptor)
	{
		zzpg = imagemanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field ImageManager zzpg>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void Object()>
		mUri = uri;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field Uri mUri>
		zzph = parcelfiledescriptor;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #27  <Field ParcelFileDescriptor zzph>
	//   11   19:return          
	}
}
