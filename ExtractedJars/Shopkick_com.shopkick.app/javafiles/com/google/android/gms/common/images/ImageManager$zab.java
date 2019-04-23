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

private final class ImageManager$zab
	implements Runnable
{

	public final void run()
	{
		boolean flag;
		Object obj;
		Object obj1;
		Asserts.checkNotMainThread("LoadBitmapFromDiskRunnable can't be executed in the main thread");
	//    0    0:ldc1            #36  <String "LoadBitmapFromDiskRunnable can't be executed in the main thread">
	//    1    2:invokestatic    #42  <Method void Asserts.checkNotMainThread(String)>
		obj1 = ((Object) (zamr));
	//    2    5:aload_0         
	//    3    6:getfield        #26  <Field ParcelFileDescriptor zamr>
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
		obj1 = ((Object) (BitmapFactory.decodeFileDescriptor(((ParcelFileDescriptor) (obj1)).getFileDescriptor())));
	//   11   18:aload_3         
	//   12   19:invokevirtual   #48  <Method java.io.FileDescriptor ParcelFileDescriptor.getFileDescriptor()>
	//   13   22:invokestatic    #54  <Method android.graphics.Bitmap BitmapFactory.decodeFileDescriptor(java.io.FileDescriptor)>
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
	//   20   33:getfield        #24  <Field Uri mUri>
	//   21   36:invokestatic    #60  <Method String String.valueOf(Object)>
	//   22   39:astore          4
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 34);
	//   23   41:new             #62  <Class StringBuilder>
	//   24   44:dup             
	//   25   45:aload           4
	//   26   47:invokestatic    #60  <Method String String.valueOf(Object)>
	//   27   50:invokevirtual   #66  <Method int String.length()>
	//   28   53:bipush          34
	//   29   55:iadd            
	//   30   56:invokespecial   #69  <Method void StringBuilder(int)>
	//   31   59:astore          5
		stringbuilder.append("OOM while loading bitmap for uri: ");
	//   32   61:aload           5
	//   33   63:ldc1            #71  <String "OOM while loading bitmap for uri: ">
	//   34   65:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   35   68:pop             
		stringbuilder.append(s);
	//   36   69:aload           5
	//   37   71:aload           4
	//   38   73:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   39   76:pop             
		Log.e("ImageManager", stringbuilder.toString(), ((Throwable) (outofmemoryerror)));
	//   40   77:ldc1            #77  <String "ImageManager">
	//   41   79:aload           5
	//   42   81:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   43   84:aload_3         
	//   44   85:invokestatic    #87  <Method int Log.e(String, String, Throwable)>
	//   45   88:pop             
		flag = true;
	//   46   89:iconst_1        
	//   47   90:istore_1        
		try
		{
			zamr.close();
	//   48   91:aload_0         
	//   49   92:getfield        #26  <Field ParcelFileDescriptor zamr>
	//   50   95:invokevirtual   #90  <Method void ParcelFileDescriptor.close()>
		}
	//*  51   98:goto            111
		catch(IOException ioexception)
	//*  52  101:astore_3        
		{
			Log.e("ImageManager", "closed failed", ((Throwable) (ioexception)));
	//   53  102:ldc1            #77  <String "ImageManager">
	//   54  104:ldc1            #92  <String "closed failed">
	//   55  106:aload_3         
	//   56  107:invokestatic    #87  <Method int Log.e(String, String, Throwable)>
	//   57  110:pop             
		}
		break MISSING_BLOCK_LABEL_118;
	//   58  111:goto            118
		flag = false;
	//   59  114:iconst_0        
	//   60  115:istore_1        
		obj = null;
	//   61  116:aconst_null     
	//   62  117:astore_2        
		InterruptedException interruptedexception;
		Object obj2 = ((Object) (new CountDownLatch(1)));
	//   63  118:new             #94  <Class CountDownLatch>
	//   64  121:dup             
	//   65  122:iconst_1        
	//   66  123:invokespecial   #95  <Method void CountDownLatch(int)>
	//   67  126:astore_3        
		ImageManager.zag(zamq).post(((Runnable) (new ImageManager$zad(zamq, mUri, ((android.graphics.Bitmap) (obj)), flag, ((CountDownLatch) (obj2))))));
	//   68  127:aload_0         
	//   69  128:getfield        #19  <Field ImageManager zamq>
	//   70  131:invokestatic    #99  <Method Handler ImageManager.zag(ImageManager)>
	//   71  134:new             #101 <Class ImageManager$zad>
	//   72  137:dup             
	//   73  138:aload_0         
	//   74  139:getfield        #19  <Field ImageManager zamq>
	//   75  142:aload_0         
	//   76  143:getfield        #24  <Field Uri mUri>
	//   77  146:aload_2         
	//   78  147:iload_1         
	//   79  148:aload_3         
	//   80  149:invokespecial   #104 <Method void ImageManager$zad(ImageManager, Uri, android.graphics.Bitmap, boolean, CountDownLatch)>
	//   81  152:invokevirtual   #110 <Method boolean Handler.post(Runnable)>
	//   82  155:pop             
		try
		{
			((CountDownLatch) (obj2)).await();
	//   83  156:aload_3         
	//   84  157:invokevirtual   #113 <Method void CountDownLatch.await()>
			return;
	//   85  160:return          
		}
	//*  86  161:aload_0         
	//*  87  162:getfield        #24  <Field Uri mUri>
	//*  88  165:invokestatic    #60  <Method String String.valueOf(Object)>
	//*  89  168:astore_2        
	//*  90  169:new             #62  <Class StringBuilder>
	//*  91  172:dup             
	//*  92  173:aload_2         
	//*  93  174:invokestatic    #60  <Method String String.valueOf(Object)>
	//*  94  177:invokevirtual   #66  <Method int String.length()>
	//*  95  180:bipush          32
	//*  96  182:iadd            
	//*  97  183:invokespecial   #69  <Method void StringBuilder(int)>
	//*  98  186:astore_3        
	//*  99  187:aload_3         
	//* 100  188:ldc1            #115 <String "Latch interrupted while posting ">
	//* 101  190:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//* 102  193:pop             
	//* 103  194:aload_3         
	//* 104  195:aload_2         
	//* 105  196:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//* 106  199:pop             
	//* 107  200:ldc1            #77  <String "ImageManager">
	//* 108  202:aload_3         
	//* 109  203:invokevirtual   #81  <Method String StringBuilder.toString()>
	//* 110  206:invokestatic    #119 <Method int Log.w(String, String)>
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
	private final ImageManager zamq;
	private final ParcelFileDescriptor zamr;

	public ImageManager$zab(ImageManager imagemanager, Uri uri, ParcelFileDescriptor parcelfiledescriptor)
	{
		zamq = imagemanager;
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
