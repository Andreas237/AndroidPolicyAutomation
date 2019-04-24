// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.common.images:
//			ImageRequest

public static final class ImageRequest$ListenerImageRequest extends ImageRequest
{

	public final boolean equals(Object obj)
	{
		if(!(obj instanceof ImageRequest$ListenerImageRequest))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class ImageRequest$ListenerImageRequest>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(this == obj)
	//*   5    9:aload_0         
	//*   6   10:aload_1         
	//*   7   11:if_acmpne       16
			return true;
	//    8   14:iconst_1        
	//    9   15:ireturn         
		obj = ((Object) ((ImageRequest$ListenerImageRequest)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class ImageRequest$ListenerImageRequest>
	//   12   20:astore_1        
		  = ()zzpp.get();
	//   13   21:aload_0         
	//   14   22:getfield        #25  <Field WeakReference zzpp>
	//   15   25:invokevirtual   #32  <Method Object WeakReference.get()>
	//   16   28:checkcast       #34  <Class ImageManager$OnImageLoadedListener>
	//   17   31:astore_2        
		 1 = ()((ImageRequest$ListenerImageRequest) (obj)).zzpp.get();
	//   18   32:aload_1         
	//   19   33:getfield        #25  <Field WeakReference zzpp>
	//   20   36:invokevirtual   #32  <Method Object WeakReference.get()>
	//   21   39:checkcast       #34  <Class ImageManager$OnImageLoadedListener>
	//   22   42:astore_3        
		return 1 != null &&  != null && Objects.equal(((Object) (1)), ((Object) ())) && Objects.equal(((Object) (((ImageRequest$ListenerImageRequest) (obj)).zzpk)), ((Object) (zzpk)));
	//   23   43:aload_3         
	//   24   44:ifnull          75
	//   25   47:aload_2         
	//   26   48:ifnull          75
	//   27   51:aload_3         
	//   28   52:aload_2         
	//   29   53:invokestatic    #40  <Method boolean Objects.equal(Object, Object)>
	//   30   56:ifeq            75
	//   31   59:aload_1         
	//   32   60:getfield        #44  <Field ImageRequest$zza zzpk>
	//   33   63:aload_0         
	//   34   64:getfield        #44  <Field ImageRequest$zza zzpk>
	//   35   67:invokestatic    #40  <Method boolean Objects.equal(Object, Object)>
	//   36   70:ifeq            75
	//   37   73:iconst_1        
	//   38   74:ireturn         
	//   39   75:iconst_0        
	//   40   76:ireturn         
	}

	public final int hashCode()
	{
		return Objects.hashCode(new Object[] {
			zzpk
		});
	//    0    0:iconst_1        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #44  <Field ImageRequest$zza zzpk>
	//    6   10:aastore         
	//    7   11:invokestatic    #51  <Method int Objects.hashCode(Object[])>
	//    8   14:ireturn         
	}

	protected final void loadImage(Drawable drawable, boolean flag, boolean flag1, boolean flag2)
	{
		if(!flag1)
	//*   0    0:iload_3         
	//*   1    1:ifne            38
		{
			  = ()zzpp.get();
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field WeakReference zzpp>
	//    4    8:invokevirtual   #32  <Method Object WeakReference.get()>
	//    5   11:checkcast       #34  <Class ImageManager$OnImageLoadedListener>
	//    6   14:astore          5
			if( != null)
	//*   7   16:aload           5
	//*   8   18:ifnull          38
				.onImageLoaded(zzpk.uri, drawable, flag2);
	//    9   21:aload           5
	//   10   23:aload_0         
	//   11   24:getfield        #44  <Field ImageRequest$zza zzpk>
	//   12   27:getfield        #59  <Field Uri ImageRequest$zza.uri>
	//   13   30:aload_1         
	//   14   31:iload           4
	//   15   33:invokeinterface #63  <Method void ImageManager$OnImageLoadedListener.onImageLoaded(Uri, Drawable, boolean)>
		}
	//   16   38:return          
	}

	private WeakReference zzpp;

	public ImageRequest$ListenerImageRequest( , Uri uri)
	{
		super(uri, 0);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #13  <Method void ImageRequest(Uri, int)>
		Asserts.checkNotNull(((Object) ()));
	//    4    6:aload_1         
	//    5    7:invokestatic    #19  <Method void Asserts.checkNotNull(Object)>
		zzpp = new WeakReference(((Object) ()));
	//    6   10:aload_0         
	//    7   11:new             #21  <Class WeakReference>
	//    8   14:dup             
	//    9   15:aload_1         
	//   10   16:invokespecial   #23  <Method void WeakReference(Object)>
	//   11   19:putfield        #25  <Field WeakReference zzpp>
	//   12   22:return          
	}
}
