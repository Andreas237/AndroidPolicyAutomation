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

private final class ImageManager$zzc
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
	//   16   28:invokestatic    #54  <Method android.graphics.Bitmap BitmapFactory.decodeFileDescriptor(java.io.FileDescriptor)>
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
	//*  40   74:invokespecial   #71  <Method void ImageManager$zzf(ImageManager, Uri, android.graphics.Bitmap, boolean, CountDownLatch)>
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
		ImageManager.zzg(zzaCR).post(((Runnable) (new ImageManager$zzf(zzaCR, mUri, ((android.graphics.Bitmap) (obj)), flag, countdownlatch))));
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

	public ImageManager$zzc(ImageManager imagemanager, Uri uri, ParcelFileDescriptor parcelfiledescriptor)
	{
		zzaCR = imagemanager;
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
