// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.images;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.internal.zzc;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.common.images:
//			ImageManager

final class ImageManager$zzb
	implements Runnable
{

	public void run()
	{
		boolean flag;
		boolean flag1;
		Object obj;
		Object obj1;
		zzc.zzdk("LoadBitmapFromDiskRunnable can't be executed in the main thread");
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
	//   16   28:invokestatic    #54  <Method android.graphics.Bitmap BitmapFactory.decodeFileDescriptor(java.io.FileDescriptor)>
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
		ImageManager.zzg(zzaEq).post(((Runnable) (new ImageManager$zze(zzaEq, mUri, ((android.graphics.Bitmap) (obj)), flag, countdownlatch))));
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
	//   74  145:invokespecial   #104 <Method void ImageManager$zze(ImageManager, Uri, android.graphics.Bitmap, boolean, CountDownLatch)>
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

	public ImageManager$zzb(ImageManager imagemanager, Uri uri, ParcelFileDescriptor parcelfiledescriptor)
	{
		zzaEq = imagemanager;
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
