// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.*;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zal;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.common.images:
//			ImageManager, zaa

private final class ImageManager$ImageReceiver extends ResultReceiver
{

	static ArrayList zaa(ImageManager$ImageReceiver imagemanager$imagereceiver)
	{
		return imagemanager$imagereceiver.zamp;
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
		ImageManager.zaf(zamq).execute(((Runnable) (new ImageManager.zab(zamq, mUri, ((ParcelFileDescriptor) (bundle))))));
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

	public final void zab(zaa zaa1)
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

	public final void zac(zaa zaa1)
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

	ImageManager$ImageReceiver(ImageManager imagemanager, Uri uri)
	{
		zamq = imagemanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ImageManager zamq>
		super(((android.os.Handler) (new zal(Looper.getMainLooper()))));
	//    3    5:aload_0         
	//    4    6:new             #21  <Class zal>
	//    5    9:dup             
	//    6   10:invokestatic    #27  <Method Looper Looper.getMainLooper()>
	//    7   13:invokespecial   #30  <Method void zal(Looper)>
	//    8   16:invokespecial   #33  <Method void ResultReceiver(android.os.Handler)>
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
