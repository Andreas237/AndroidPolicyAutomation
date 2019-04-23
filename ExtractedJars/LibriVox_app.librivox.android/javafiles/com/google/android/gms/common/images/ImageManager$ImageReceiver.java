// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.*;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.common.images:
//			ImageManager, c

final class ImageManager$ImageReceiver extends ResultReceiver
{

	static ArrayList a(ImageManager$ImageReceiver imagemanager$imagereceiver)
	{
		return imagemanager$imagereceiver.b;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field ArrayList b>
	//    2    4:areturn         
	}

	public final void onReceiveResult(int i, Bundle bundle)
	{
		bundle = ((Bundle) ((ParcelFileDescriptor)bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
	//    0    0:aload_2         
	//    1    1:ldc1            #19  <String "com.google.android.gms.extra.fileDescriptor">
	//    2    3:invokevirtual   #25  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//    3    6:checkcast       #27  <Class ParcelFileDescriptor>
	//    4    9:astore_2        
		ImageManager.f(c).execute(((Runnable) (new c(c, a, ((ParcelFileDescriptor) (bundle))))));
	//    5   10:aload_0         
	//    6   11:getfield        #29  <Field ImageManager c>
	//    7   14:invokestatic    #35  <Method ExecutorService ImageManager.f(ImageManager)>
	//    8   17:new             #37  <Class c>
	//    9   20:dup             
	//   10   21:aload_0         
	//   11   22:getfield        #29  <Field ImageManager c>
	//   12   25:aload_0         
	//   13   26:getfield        #39  <Field Uri a>
	//   14   29:aload_2         
	//   15   30:invokespecial   #43  <Method void c(ImageManager, Uri, ParcelFileDescriptor)>
	//   16   33:invokeinterface #49  <Method void ExecutorService.execute(Runnable)>
	//   17   38:return          
	}

	private final Uri a;
	private final ArrayList b;
	private final ImageManager c;
}
