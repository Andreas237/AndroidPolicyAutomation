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
		android.graphics.Bitmap bitmap = BitmapFactory.decodeFileDescriptor(zamr.getFileDescriptor());
	//   11   18:aload_0         
	//   12   19:getfield        #26  <Field ParcelFileDescriptor zamr>
	//   13   22:invokevirtual   #48  <Method java.io.FileDescriptor ParcelFileDescriptor.getFileDescriptor()>
	//   14   25:invokestatic    #54  <Method android.graphics.Bitmap BitmapFactory.decodeFileDescriptor(java.io.FileDescriptor)>
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
		ImageManager.zag(zamq).post(((Runnable) (new ImageManager$zad(zamq, mUri, ((android.graphics.Bitmap) (obj)), flag, ((CountDownLatch) (obj1))))));
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
	//   81  152:invokespecial   #104 <Method void ImageManager$zad(ImageManager, Uri, android.graphics.Bitmap, boolean, CountDownLatch)>
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
