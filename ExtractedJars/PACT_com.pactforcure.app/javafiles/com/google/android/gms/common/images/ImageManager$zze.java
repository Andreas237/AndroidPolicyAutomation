// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.images;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

// Referenced classes of package com.google.android.gms.common.images:
//			ImageManager

private static final class ImageManager$zze
	implements ComponentCallbacks2
{

	public void onConfigurationChanged(Configuration configuration)
	{
	//    0    0:return          
	}

	public void onLowMemory()
	{
		zzaCL.evictAll();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ImageManager$zzb zzaCL>
	//    2    4:invokevirtual   #30  <Method void ImageManager$zzb.evictAll()>
	//    3    7:return          
	}

	public void onTrimMemory(int i)
	{
		if(i >= 60)
	//*   0    0:iload_1         
	//*   1    1:bipush          60
	//*   2    3:icmplt          14
			zzaCL.evictAll();
	//    3    6:aload_0         
	//    4    7:getfield        #21  <Field ImageManager$zzb zzaCL>
	//    5   10:invokevirtual   #30  <Method void ImageManager$zzb.evictAll()>
		else
	//*   6   13:return          
		if(i >= 20)
	//*   7   14:iload_1         
	//*   8   15:bipush          20
	//*   9   17:icmplt          13
		{
			zzaCL.trimToSize(zzaCL.size() / 2);
	//   10   20:aload_0         
	//   11   21:getfield        #21  <Field ImageManager$zzb zzaCL>
	//   12   24:aload_0         
	//   13   25:getfield        #21  <Field ImageManager$zzb zzaCL>
	//   14   28:invokevirtual   #36  <Method int ImageManager$zzb.size()>
	//   15   31:iconst_2        
	//   16   32:idiv            
	//   17   33:invokevirtual   #39  <Method void ImageManager$zzb.trimToSize(int)>
			return;
	//   18   36:return          
		}
	}

	private final ImageManager$zzb zzaCL;

	public ImageManager$zze(ImageManager$zzb imagemanager$zzb)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		zzaCL = imagemanager$zzb;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field ImageManager$zzb zzaCL>
	//    5    9:return          
	}
}
