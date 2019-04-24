// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.images;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

// Referenced classes of package com.google.android.gms.common.images:
//			ImageManager

static final class ImageManager$zzd
	implements ComponentCallbacks2
{

	public void onConfigurationChanged(Configuration configuration)
	{
	//    0    0:return          
	}

	public void onLowMemory()
	{
		zzaEk.evictAll();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ImageManager$zza zzaEk>
	//    2    4:invokevirtual   #27  <Method void ImageManager$zza.evictAll()>
	//    3    7:return          
	}

	public void onTrimMemory(int i)
	{
		if(i >= 60)
	//*   0    0:iload_1         
	//*   1    1:bipush          60
	//*   2    3:icmplt          14
		{
			zzaEk.evictAll();
	//    3    6:aload_0         
	//    4    7:getfield        #18  <Field ImageManager$zza zzaEk>
	//    5   10:invokevirtual   #27  <Method void ImageManager$zza.evictAll()>
			return;
	//    6   13:return          
		}
		if(i >= 20)
	//*   7   14:iload_1         
	//*   8   15:bipush          20
	//*   9   17:icmplt          36
			zzaEk.trimToSize(zzaEk.size() / 2);
	//   10   20:aload_0         
	//   11   21:getfield        #18  <Field ImageManager$zza zzaEk>
	//   12   24:aload_0         
	//   13   25:getfield        #18  <Field ImageManager$zza zzaEk>
	//   14   28:invokevirtual   #33  <Method int ImageManager$zza.size()>
	//   15   31:iconst_2        
	//   16   32:idiv            
	//   17   33:invokevirtual   #36  <Method void ImageManager$zza.trimToSize(int)>
	//   18   36:return          
	}

	private final ImageManager$zza zzaEk;

	public ImageManager$zzd(ImageManager$zza imagemanager$zza)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		zzaEk = imagemanager$zza;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field ImageManager$zza zzaEk>
	//    5    9:return          
	}
}
