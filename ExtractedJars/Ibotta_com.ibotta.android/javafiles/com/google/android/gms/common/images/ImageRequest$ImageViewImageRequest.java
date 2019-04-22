// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.common.images.internal.CrossFadingDrawable;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.common.images:
//			ImageRequest

public static final class ImageRequest$ImageViewImageRequest extends ImageRequest
{

	public final boolean equals(Object obj)
	{
		if(!(obj instanceof ImageRequest$ImageViewImageRequest))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class ImageRequest$ImageViewImageRequest>
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
		Object obj1 = ((Object) ((ImageRequest$ImageViewImageRequest)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class ImageRequest$ImageViewImageRequest>
	//   12   20:astore_2        
		obj = ((Object) ((ImageView)zzpo.get()));
	//   13   21:aload_0         
	//   14   22:getfield        #25  <Field WeakReference zzpo>
	//   15   25:invokevirtual   #33  <Method Object WeakReference.get()>
	//   16   28:checkcast       #35  <Class ImageView>
	//   17   31:astore_1        
		obj1 = ((Object) ((ImageView)((ImageRequest$ImageViewImageRequest) (obj1)).zzpo.get()));
	//   18   32:aload_2         
	//   19   33:getfield        #25  <Field WeakReference zzpo>
	//   20   36:invokevirtual   #33  <Method Object WeakReference.get()>
	//   21   39:checkcast       #35  <Class ImageView>
	//   22   42:astore_2        
		return obj1 != null && obj != null && Objects.equal(obj1, obj);
	//   23   43:aload_2         
	//   24   44:ifnull          61
	//   25   47:aload_1         
	//   26   48:ifnull          61
	//   27   51:aload_2         
	//   28   52:aload_1         
	//   29   53:invokestatic    #41  <Method boolean Objects.equal(Object, Object)>
	//   30   56:ifeq            61
	//   31   59:iconst_1        
	//   32   60:ireturn         
	//   33   61:iconst_0        
	//   34   62:ireturn         
	}

	public final int hashCode()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected final void loadImage(Drawable drawable, boolean flag, boolean flag1, boolean flag2)
	{
label0:
		{
			Object obj = ((Object) ((ImageView)zzpo.get()));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field WeakReference zzpo>
	//    2    4:invokevirtual   #33  <Method Object WeakReference.get()>
	//    3    7:checkcast       #35  <Class ImageView>
	//    4   10:astore          9
			if(obj == null)
				break label0;
	//    5   12:aload           9
	//    6   14:ifnull          209
			int i = 0;
	//    7   17:iconst_0        
	//    8   18:istore          6
			boolean flag3;
			if(!flag1 && !flag2)
	//*   9   20:iload_3         
	//*  10   21:ifne            35
	//*  11   24:iload           4
	//*  12   26:ifne            35
				flag3 = true;
	//   13   29:iconst_1        
	//   14   30:istore          5
			else
	//*  15   32:goto            38
				flag3 = false;
	//   16   35:iconst_0        
	//   17   36:istore          5
			if(flag3 && (obj instanceof LoadingImageView))
	//*  18   38:iload           5
	//*  19   40:ifeq            77
	//*  20   43:aload           9
	//*  21   45:instanceof      #47  <Class LoadingImageView>
	//*  22   48:ifeq            77
			{
				int j = ((LoadingImageView)obj).getLoadedNoDataPlaceholderResId();
	//   23   51:aload           9
	//   24   53:checkcast       #47  <Class LoadingImageView>
	//   25   56:invokevirtual   #50  <Method int LoadingImageView.getLoadedNoDataPlaceholderResId()>
	//   26   59:istore          7
				if(mNoDataPlaceholderResId != 0 && j == mNoDataPlaceholderResId)
					break label0;
	//   27   61:aload_0         
	//   28   62:getfield        #54  <Field int mNoDataPlaceholderResId>
	//   29   65:ifeq            77
	//   30   68:iload           7
	//   31   70:aload_0         
	//   32   71:getfield        #54  <Field int mNoDataPlaceholderResId>
	//   33   74:icmpeq          209
			}
			flag = ((ImageRequest)this).shouldCrossFade(flag, flag1);
	//   34   77:aload_0         
	//   35   78:iload_2         
	//   36   79:iload_3         
	//   37   80:invokevirtual   #58  <Method boolean ImageRequest.shouldCrossFade(boolean, boolean)>
	//   38   83:istore_2        
			Drawable drawable1 = drawable;
	//   39   84:aload_1         
	//   40   85:astore          8
			if(mUseNewDrawable)
	//*  41   87:aload_0         
	//*  42   88:getfield        #62  <Field boolean mUseNewDrawable>
	//*  43   91:ifeq            110
			{
				drawable1 = drawable;
	//   44   94:aload_1         
	//   45   95:astore          8
				if(drawable != null)
	//*  46   97:aload_1         
	//*  47   98:ifnull          110
					drawable1 = drawable.getConstantState().newDrawable();
	//   48  101:aload_1         
	//   49  102:invokevirtual   #68  <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   50  105:invokevirtual   #74  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
	//   51  108:astore          8
			}
			drawable = drawable1;
	//   52  110:aload           8
	//   53  112:astore_1        
			if(flag)
	//*  54  113:iload_2         
	//*  55  114:ifeq            129
				drawable = ((Drawable) (((ImageRequest)this).createTransitionDrawable(((ImageView) (obj)).getDrawable(), drawable1)));
	//   56  117:aload_0         
	//   57  118:aload           9
	//   58  120:invokevirtual   #77  <Method Drawable ImageView.getDrawable()>
	//   59  123:aload           8
	//   60  125:invokevirtual   #81  <Method CrossFadingDrawable ImageRequest.createTransitionDrawable(Drawable, Drawable)>
	//   61  128:astore_1        
			((ImageView) (obj)).setImageDrawable(drawable);
	//   62  129:aload           9
	//   63  131:aload_1         
	//   64  132:invokevirtual   #85  <Method void ImageView.setImageDrawable(Drawable)>
			if(obj instanceof LoadingImageView)
	//*  65  135:aload           9
	//*  66  137:instanceof      #47  <Class LoadingImageView>
	//*  67  140:ifeq            195
			{
				obj = ((Object) ((LoadingImageView)obj));
	//   68  143:aload           9
	//   69  145:checkcast       #47  <Class LoadingImageView>
	//   70  148:astore          9
				Uri uri;
				if(flag2)
	//*  71  150:iload           4
	//*  72  152:ifeq            167
					uri = zzpk.uri;
	//   73  155:aload_0         
	//   74  156:getfield        #89  <Field ImageRequest$zza zzpk>
	//   75  159:getfield        #95  <Field Uri ImageRequest$zza.uri>
	//   76  162:astore          8
				else
	//*  77  164:goto            170
					uri = null;
	//   78  167:aconst_null     
	//   79  168:astore          8
				((LoadingImageView) (obj)).setLoadedUri(uri);
	//   80  170:aload           9
	//   81  172:aload           8
	//   82  174:invokevirtual   #99  <Method void LoadingImageView.setLoadedUri(Uri)>
				if(flag3)
	//*  83  177:iload           5
	//*  84  179:ifeq            188
					i = mNoDataPlaceholderResId;
	//   85  182:aload_0         
	//   86  183:getfield        #54  <Field int mNoDataPlaceholderResId>
	//   87  186:istore          6
				((LoadingImageView) (obj)).setLoadedNoDataPlaceholderResId(i);
	//   88  188:aload           9
	//   89  190:iload           6
	//   90  192:invokevirtual   #103 <Method void LoadingImageView.setLoadedNoDataPlaceholderResId(int)>
			}
			if(flag)
	//*  91  195:iload_2         
	//*  92  196:ifeq            209
				((CrossFadingDrawable)drawable).startTransition(250);
	//   93  199:aload_1         
	//   94  200:checkcast       #105 <Class CrossFadingDrawable>
	//   95  203:sipush          250
	//   96  206:invokevirtual   #108 <Method void CrossFadingDrawable.startTransition(int)>
		}
	//   97  209:return          
	}

	private WeakReference zzpo;

	public ImageRequest$ImageViewImageRequest(ImageView imageview, int i)
	{
		super(((Uri) (null)), i);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:iload_2         
	//    3    3:invokespecial   #13  <Method void ImageRequest(Uri, int)>
		Asserts.checkNotNull(((Object) (imageview)));
	//    4    6:aload_1         
	//    5    7:invokestatic    #19  <Method void Asserts.checkNotNull(Object)>
		zzpo = new WeakReference(((Object) (imageview)));
	//    6   10:aload_0         
	//    7   11:new             #21  <Class WeakReference>
	//    8   14:dup             
	//    9   15:aload_1         
	//   10   16:invokespecial   #23  <Method void WeakReference(Object)>
	//   11   19:putfield        #25  <Field WeakReference zzpo>
	//   12   22:return          
	}

	public ImageRequest$ImageViewImageRequest(ImageView imageview, Uri uri)
	{
		super(uri, 0);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #13  <Method void ImageRequest(Uri, int)>
		Asserts.checkNotNull(((Object) (imageview)));
	//    4    6:aload_1         
	//    5    7:invokestatic    #19  <Method void Asserts.checkNotNull(Object)>
		zzpo = new WeakReference(((Object) (imageview)));
	//    6   10:aload_0         
	//    7   11:new             #21  <Class WeakReference>
	//    8   14:dup             
	//    9   15:aload_1         
	//   10   16:invokespecial   #23  <Method void WeakReference(Object)>
	//   11   19:putfield        #25  <Field WeakReference zzpo>
	//   12   22:return          
	}
}
