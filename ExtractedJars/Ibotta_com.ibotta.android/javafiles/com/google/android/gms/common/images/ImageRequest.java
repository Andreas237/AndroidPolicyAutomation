// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.images;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.images.internal.CrossFadingDrawable;
import com.google.android.gms.common.images.internal.ImageUtils;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.common.images.internal.PostProcessedResourceCache;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.util.PlatformVersion;
import java.lang.ref.WeakReference;

public abstract class ImageRequest
{
	public static final class ImageViewImageRequest extends ImageRequest
	{

		public final boolean equals(Object obj)
		{
			if(!(obj instanceof ImageViewImageRequest))
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
			Object obj1 = ((Object) ((ImageViewImageRequest)obj));
		//   10   16:aload_1         
		//   11   17:checkcast       #2   <Class ImageRequest$ImageViewImageRequest>
		//   12   20:astore_2        
			obj = ((Object) ((ImageView)zzpo.get()));
		//   13   21:aload_0         
		//   14   22:getfield        #25  <Field WeakReference zzpo>
		//   15   25:invokevirtual   #33  <Method Object WeakReference.get()>
		//   16   28:checkcast       #35  <Class ImageView>
		//   17   31:astore_1        
			obj1 = ((Object) ((ImageView)((ImageViewImageRequest) (obj1)).zzpo.get()));
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

		public ImageViewImageRequest(ImageView imageview, int i)
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

		public ImageViewImageRequest(ImageView imageview, Uri uri)
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

	public static final class ListenerImageRequest extends ImageRequest
	{

		public final boolean equals(Object obj)
		{
			if(!(obj instanceof ListenerImageRequest))
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
			obj = ((Object) ((ListenerImageRequest)obj));
		//   10   16:aload_1         
		//   11   17:checkcast       #2   <Class ImageRequest$ListenerImageRequest>
		//   12   20:astore_1        
			ImageManager.OnImageLoadedListener onimageloadedlistener = (ImageManager.OnImageLoadedListener)zzpp.get();
		//   13   21:aload_0         
		//   14   22:getfield        #25  <Field WeakReference zzpp>
		//   15   25:invokevirtual   #32  <Method Object WeakReference.get()>
		//   16   28:checkcast       #34  <Class ImageManager$OnImageLoadedListener>
		//   17   31:astore_2        
			ImageManager.OnImageLoadedListener onimageloadedlistener1 = (ImageManager.OnImageLoadedListener)((ListenerImageRequest) (obj)).zzpp.get();
		//   18   32:aload_1         
		//   19   33:getfield        #25  <Field WeakReference zzpp>
		//   20   36:invokevirtual   #32  <Method Object WeakReference.get()>
		//   21   39:checkcast       #34  <Class ImageManager$OnImageLoadedListener>
		//   22   42:astore_3        
			return onimageloadedlistener1 != null && onimageloadedlistener != null && Objects.equal(((Object) (onimageloadedlistener1)), ((Object) (onimageloadedlistener))) && Objects.equal(((Object) (((ListenerImageRequest) (obj)).zzpk)), ((Object) (zzpk)));
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
				ImageManager.OnImageLoadedListener onimageloadedlistener = (ImageManager.OnImageLoadedListener)zzpp.get();
		//    2    4:aload_0         
		//    3    5:getfield        #25  <Field WeakReference zzpp>
		//    4    8:invokevirtual   #32  <Method Object WeakReference.get()>
		//    5   11:checkcast       #34  <Class ImageManager$OnImageLoadedListener>
		//    6   14:astore          5
				if(onimageloadedlistener != null)
		//*   7   16:aload           5
		//*   8   18:ifnull          38
					onimageloadedlistener.onImageLoaded(zzpk.uri, drawable, flag2);
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

		public ListenerImageRequest(ImageManager.OnImageLoadedListener onimageloadedlistener, Uri uri)
		{
			super(uri, 0);
		//    0    0:aload_0         
		//    1    1:aload_2         
		//    2    2:iconst_0        
		//    3    3:invokespecial   #13  <Method void ImageRequest(Uri, int)>
			Asserts.checkNotNull(((Object) (onimageloadedlistener)));
		//    4    6:aload_1         
		//    5    7:invokestatic    #19  <Method void Asserts.checkNotNull(Object)>
			zzpp = new WeakReference(((Object) (onimageloadedlistener)));
		//    6   10:aload_0         
		//    7   11:new             #21  <Class WeakReference>
		//    8   14:dup             
		//    9   15:aload_1         
		//   10   16:invokespecial   #23  <Method void WeakReference(Object)>
		//   11   19:putfield        #25  <Field WeakReference zzpp>
		//   12   22:return          
		}
	}

	public static final class PostProcessingFlags
	{

		public static final int CIRCLE_CROP = 1;

		public PostProcessingFlags()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}

	public static final class TextViewImageRequest extends ImageRequest
	{

		public final boolean equals(Object obj)
		{
			if(!(obj instanceof TextViewImageRequest))
		//*   0    0:aload_1         
		//*   1    1:instanceof      #2   <Class ImageRequest$TextViewImageRequest>
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
			obj = ((Object) ((TextViewImageRequest)obj));
		//   10   16:aload_1         
		//   11   17:checkcast       #2   <Class ImageRequest$TextViewImageRequest>
		//   12   20:astore_1        
			TextView textview = (TextView)zzpq.get();
		//   13   21:aload_0         
		//   14   22:getfield        #59  <Field WeakReference zzpq>
		//   15   25:invokevirtual   #67  <Method Object WeakReference.get()>
		//   16   28:checkcast       #69  <Class TextView>
		//   17   31:astore_2        
			TextView textview1 = (TextView)((TextViewImageRequest) (obj)).zzpq.get();
		//   18   32:aload_1         
		//   19   33:getfield        #59  <Field WeakReference zzpq>
		//   20   36:invokevirtual   #67  <Method Object WeakReference.get()>
		//   21   39:checkcast       #69  <Class TextView>
		//   22   42:astore_3        
			return textview1 != null && textview != null && Objects.equal(((Object) (textview1)), ((Object) (textview))) && Objects.equal(((Object) (Integer.valueOf(((TextViewImageRequest) (obj)).zzpr))), ((Object) (Integer.valueOf(zzpr))));
		//   23   43:aload_3         
		//   24   44:ifnull          81
		//   25   47:aload_2         
		//   26   48:ifnull          81
		//   27   51:aload_3         
		//   28   52:aload_2         
		//   29   53:invokestatic    #75  <Method boolean Objects.equal(Object, Object)>
		//   30   56:ifeq            81
		//   31   59:aload_1         
		//   32   60:getfield        #25  <Field int zzpr>
		//   33   63:invokestatic    #81  <Method Integer Integer.valueOf(int)>
		//   34   66:aload_0         
		//   35   67:getfield        #25  <Field int zzpr>
		//   36   70:invokestatic    #81  <Method Integer Integer.valueOf(int)>
		//   37   73:invokestatic    #75  <Method boolean Objects.equal(Object, Object)>
		//   38   76:ifeq            81
		//   39   79:iconst_1        
		//   40   80:ireturn         
		//   41   81:iconst_0        
		//   42   82:ireturn         
		}

		public final int hashCode()
		{
			return Objects.hashCode(new Object[] {
				Integer.valueOf(zzpr)
			});
		//    0    0:iconst_1        
		//    1    1:anewarray       Object[]
		//    2    4:dup             
		//    3    5:iconst_0        
		//    4    6:aload_0         
		//    5    7:getfield        #25  <Field int zzpr>
		//    6   10:invokestatic    #81  <Method Integer Integer.valueOf(int)>
		//    7   13:aastore         
		//    8   14:invokestatic    #88  <Method int Objects.hashCode(Object[])>
		//    9   17:ireturn         
		}

		protected final void loadImage(Drawable drawable, boolean flag, boolean flag1, boolean flag2)
		{
			TextView textview = (TextView)zzpq.get();
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field WeakReference zzpq>
		//    2    4:invokevirtual   #67  <Method Object WeakReference.get()>
		//    3    7:checkcast       #69  <Class TextView>
		//    4   10:astore          10
			if(textview != null)
		//*   5   12:aload           10
		//*   6   14:ifnull          197
			{
				int i = zzpr;
		//    7   17:aload_0         
		//    8   18:getfield        #25  <Field int zzpr>
		//    9   21:istore          5
				flag = ((ImageRequest)this).shouldCrossFade(flag, flag1);
		//   10   23:aload_0         
		//   11   24:iload_2         
		//   12   25:iload_3         
		//   13   26:invokevirtual   #94  <Method boolean ImageRequest.shouldCrossFade(boolean, boolean)>
		//   14   29:istore_2        
				Object obj1;
				if(PlatformVersion.isAtLeastJellyBeanMR1())
		//*  15   30:invokestatic    #100 <Method boolean PlatformVersion.isAtLeastJellyBeanMR1()>
		//*  16   33:ifeq            46
					obj1 = ((Object) (textview.getCompoundDrawablesRelative()));
		//   17   36:aload           10
		//   18   38:invokevirtual   #104 <Method Drawable[] TextView.getCompoundDrawablesRelative()>
		//   19   41:astore          7
				else
		//*  20   43:goto            53
					obj1 = ((Object) (textview.getCompoundDrawables()));
		//   21   46:aload           10
		//   22   48:invokevirtual   #107 <Method Drawable[] TextView.getCompoundDrawables()>
		//   23   51:astore          7
				Object obj2 = ((Object) (obj1[i]));
		//   24   53:aload           7
		//   25   55:iload           5
		//   26   57:aaload          
		//   27   58:astore          8
				Object obj = ((Object) (drawable));
		//   28   60:aload_1         
		//   29   61:astore          6
				if(flag)
		//*  30   63:iload_2         
		//*  31   64:ifeq            76
					obj = ((Object) (((ImageRequest)this).createTransitionDrawable(((Drawable) (obj2)), drawable)));
		//   32   67:aload_0         
		//   33   68:aload           8
		//   34   70:aload_1         
		//   35   71:invokevirtual   #111 <Method CrossFadingDrawable ImageRequest.createTransitionDrawable(Drawable, Drawable)>
		//   36   74:astore          6
				if(i == 0)
		//*  37   76:iload           5
		//*  38   78:ifne            87
					drawable = ((Drawable) (obj));
		//   39   81:aload           6
		//   40   83:astore_1        
				else
		//*  41   84:goto            92
					drawable = obj1[0];
		//   42   87:aload           7
		//   43   89:iconst_0        
		//   44   90:aaload          
		//   45   91:astore_1        
				if(i == 1)
		//*  46   92:iload           5
		//*  47   94:iconst_1        
		//*  48   95:icmpne          105
					obj2 = obj;
		//   49   98:aload           6
		//   50  100:astore          8
				else
		//*  51  102:goto            111
					obj2 = ((Object) (obj1[1]));
		//   52  105:aload           7
		//   53  107:iconst_1        
		//   54  108:aaload          
		//   55  109:astore          8
				Object obj3;
				if(i == 2)
		//*  56  111:iload           5
		//*  57  113:iconst_2        
		//*  58  114:icmpne          124
					obj3 = obj;
		//   59  117:aload           6
		//   60  119:astore          9
				else
		//*  61  121:goto            130
					obj3 = ((Object) (obj1[2]));
		//   62  124:aload           7
		//   63  126:iconst_2        
		//   64  127:aaload          
		//   65  128:astore          9
				if(i == 3)
		//*  66  130:iload           5
		//*  67  132:iconst_3        
		//*  68  133:icmpne          143
					obj1 = obj;
		//   69  136:aload           6
		//   70  138:astore          7
				else
		//*  71  140:goto            149
					obj1 = ((Object) (obj1[3]));
		//   72  143:aload           7
		//   73  145:iconst_3        
		//   74  146:aaload          
		//   75  147:astore          7
				if(PlatformVersion.isAtLeastJellyBeanMR1())
		//*  76  149:invokestatic    #100 <Method boolean PlatformVersion.isAtLeastJellyBeanMR1()>
		//*  77  152:ifeq            170
					textview.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, ((Drawable) (obj2)), ((Drawable) (obj3)), ((Drawable) (obj1)));
		//   78  155:aload           10
		//   79  157:aload_1         
		//   80  158:aload           8
		//   81  160:aload           9
		//   82  162:aload           7
		//   83  164:invokevirtual   #115 <Method void TextView.setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable, Drawable, Drawable, Drawable)>
				else
		//*  84  167:goto            182
					textview.setCompoundDrawablesWithIntrinsicBounds(drawable, ((Drawable) (obj2)), ((Drawable) (obj3)), ((Drawable) (obj1)));
		//   85  170:aload           10
		//   86  172:aload_1         
		//   87  173:aload           8
		//   88  175:aload           9
		//   89  177:aload           7
		//   90  179:invokevirtual   #118 <Method void TextView.setCompoundDrawablesWithIntrinsicBounds(Drawable, Drawable, Drawable, Drawable)>
				if(flag)
		//*  91  182:iload_2         
		//*  92  183:ifeq            197
					((CrossFadingDrawable)obj).startTransition(250);
		//   93  186:aload           6
		//   94  188:checkcast       #120 <Class CrossFadingDrawable>
		//   95  191:sipush          250
		//   96  194:invokevirtual   #123 <Method void CrossFadingDrawable.startTransition(int)>
			}
		//   97  197:return          
		}

		public static final int POSITION_BOTTOM = 3;
		public static final int POSITION_END = 2;
		public static final int POSITION_START = 0;
		public static final int POSITION_TOP = 1;
		private WeakReference zzpq;
		private int zzpr;

		public TextViewImageRequest(TextView textview, int i, int j)
		{
			super(((Uri) (null)), j);
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:iload_3         
		//    3    3:invokespecial   #23  <Method void ImageRequest(Uri, int)>
			zzpr = -1;
		//    4    6:aload_0         
		//    5    7:iconst_m1       
		//    6    8:putfield        #25  <Field int zzpr>
			Asserts.checkNotNull(((Object) (textview)));
		//    7   11:aload_1         
		//    8   12:invokestatic    #31  <Method void Asserts.checkNotNull(Object)>
			boolean flag = true;
		//    9   15:iconst_1        
		//   10   16:istore          4
			if(i == 0 || i == 1 || i == 2 || i == 3)
		//*  11   18:iload_2         
		//*  12   19:ifeq            40
		//*  13   22:iload_2         
		//*  14   23:iconst_1        
		//*  15   24:icmpeq          40
		//*  16   27:iload_2         
		//*  17   28:iconst_2        
		//*  18   29:icmpeq          40
		//*  19   32:iload_2         
		//*  20   33:iconst_3        
		//*  21   34:icmpeq          40
		//*  22   37:goto            43
				flag = false;
		//   23   40:iconst_0        
		//   24   41:istore          4
			StringBuilder stringbuilder = new StringBuilder(29);
		//   25   43:new             #33  <Class StringBuilder>
		//   26   46:dup             
		//   27   47:bipush          29
		//   28   49:invokespecial   #36  <Method void StringBuilder(int)>
		//   29   52:astore          5
			stringbuilder.append("Invalid position: ");
		//   30   54:aload           5
		//   31   56:ldc1            #38  <String "Invalid position: ">
		//   32   58:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
		//   33   61:pop             
			stringbuilder.append(i);
		//   34   62:aload           5
		//   35   64:iload_2         
		//   36   65:invokevirtual   #45  <Method StringBuilder StringBuilder.append(int)>
		//   37   68:pop             
			Asserts.checkState(flag, ((Object) (stringbuilder.toString())));
		//   38   69:iload           4
		//   39   71:aload           5
		//   40   73:invokevirtual   #49  <Method String StringBuilder.toString()>
		//   41   76:invokestatic    #53  <Method void Asserts.checkState(boolean, Object)>
			zzpq = new WeakReference(((Object) (textview)));
		//   42   79:aload_0         
		//   43   80:new             #55  <Class WeakReference>
		//   44   83:dup             
		//   45   84:aload_1         
		//   46   85:invokespecial   #57  <Method void WeakReference(Object)>
		//   47   88:putfield        #59  <Field WeakReference zzpq>
			zzpr = i;
		//   48   91:aload_0         
		//   49   92:iload_2         
		//   50   93:putfield        #25  <Field int zzpr>
		//   51   96:return          
		}

		public TextViewImageRequest(TextView textview, int i, Uri uri)
		{
			super(uri, 0);
		//    0    0:aload_0         
		//    1    1:aload_3         
		//    2    2:iconst_0        
		//    3    3:invokespecial   #23  <Method void ImageRequest(Uri, int)>
			zzpr = -1;
		//    4    6:aload_0         
		//    5    7:iconst_m1       
		//    6    8:putfield        #25  <Field int zzpr>
			Asserts.checkNotNull(((Object) (textview)));
		//    7   11:aload_1         
		//    8   12:invokestatic    #31  <Method void Asserts.checkNotNull(Object)>
			boolean flag = true;
		//    9   15:iconst_1        
		//   10   16:istore          4
			if(i == 0 || i == 1 || i == 2 || i == 3)
		//*  11   18:iload_2         
		//*  12   19:ifeq            40
		//*  13   22:iload_2         
		//*  14   23:iconst_1        
		//*  15   24:icmpeq          40
		//*  16   27:iload_2         
		//*  17   28:iconst_2        
		//*  18   29:icmpeq          40
		//*  19   32:iload_2         
		//*  20   33:iconst_3        
		//*  21   34:icmpeq          40
		//*  22   37:goto            43
				flag = false;
		//   23   40:iconst_0        
		//   24   41:istore          4
			uri = ((Uri) (new StringBuilder(29)));
		//   25   43:new             #33  <Class StringBuilder>
		//   26   46:dup             
		//   27   47:bipush          29
		//   28   49:invokespecial   #36  <Method void StringBuilder(int)>
		//   29   52:astore_3        
			((StringBuilder) (uri)).append("Invalid position: ");
		//   30   53:aload_3         
		//   31   54:ldc1            #38  <String "Invalid position: ">
		//   32   56:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
		//   33   59:pop             
			((StringBuilder) (uri)).append(i);
		//   34   60:aload_3         
		//   35   61:iload_2         
		//   36   62:invokevirtual   #45  <Method StringBuilder StringBuilder.append(int)>
		//   37   65:pop             
			Asserts.checkState(flag, ((Object) (((StringBuilder) (uri)).toString())));
		//   38   66:iload           4
		//   39   68:aload_3         
		//   40   69:invokevirtual   #49  <Method String StringBuilder.toString()>
		//   41   72:invokestatic    #53  <Method void Asserts.checkState(boolean, Object)>
			zzpq = new WeakReference(((Object) (textview)));
		//   42   75:aload_0         
		//   43   76:new             #55  <Class WeakReference>
		//   44   79:dup             
		//   45   80:aload_1         
		//   46   81:invokespecial   #57  <Method void WeakReference(Object)>
		//   47   84:putfield        #59  <Field WeakReference zzpq>
			zzpr = i;
		//   48   87:aload_0         
		//   49   88:iload_2         
		//   50   89:putfield        #25  <Field int zzpr>
		//   51   92:return          
		}
	}

	static final class zza
	{

		public final boolean equals(Object obj)
		{
			if(!(obj instanceof zza))
		//*   0    0:aload_1         
		//*   1    1:instanceof      #2   <Class ImageRequest$zza>
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
			else
				return Objects.equal(((Object) (((zza)obj).uri)), ((Object) (uri)));
		//   10   16:aload_1         
		//   11   17:checkcast       #2   <Class ImageRequest$zza>
		//   12   20:getfield        #16  <Field Uri uri>
		//   13   23:aload_0         
		//   14   24:getfield        #16  <Field Uri uri>
		//   15   27:invokestatic    #25  <Method boolean Objects.equal(Object, Object)>
		//   16   30:ireturn         
		}

		public final int hashCode()
		{
			return Objects.hashCode(new Object[] {
				uri
			});
		//    0    0:iconst_1        
		//    1    1:anewarray       Object[]
		//    2    4:dup             
		//    3    5:iconst_0        
		//    4    6:aload_0         
		//    5    7:getfield        #16  <Field Uri uri>
		//    6   10:aastore         
		//    7   11:invokestatic    #30  <Method int Objects.hashCode(Object[])>
		//    8   14:ireturn         
		}

		public final Uri uri;

		public zza(Uri uri1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
			uri = uri1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #16  <Field Uri uri>
		//    5    9:return          
		}
	}


	public ImageRequest(Uri uri, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		mLoadingPlaceholderResId = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #39  <Field int mLoadingPlaceholderResId>
		mNoDataPlaceholderResId = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #41  <Field int mNoDataPlaceholderResId>
		mUseNewDrawable = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #43  <Field boolean mUseNewDrawable>
		zzpl = true;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #45  <Field boolean zzpl>
		zzpm = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #47  <Field boolean zzpm>
		zzpn = true;
	//   17   29:aload_0         
	//   18   30:iconst_1        
	//   19   31:putfield        #49  <Field boolean zzpn>
		zzpk = new zza(uri);
	//   20   34:aload_0         
	//   21   35:new             #18  <Class ImageRequest$zza>
	//   22   38:dup             
	//   23   39:aload_1         
	//   24   40:invokespecial   #52  <Method void ImageRequest$zza(Uri)>
	//   25   43:putfield        #54  <Field ImageRequest$zza zzpk>
		mNoDataPlaceholderResId = i;
	//   26   46:aload_0         
	//   27   47:iload_2         
	//   28   48:putfield        #41  <Field int mNoDataPlaceholderResId>
	//   29   51:return          
	}

	private final Drawable zza(Context context, PostProcessedResourceCache postprocessedresourcecache, int i)
	{
		Resources resources = context.getResources();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #62  <Method Resources Context.getResources()>
	//    2    4:astore          7
		int j = mPostProcessingFlags;
	//    3    6:aload_0         
	//    4    7:getfield        #64  <Field int mPostProcessingFlags>
	//    5   10:istore          4
		if(j > 0)
	//*   6   12:iload           4
	//*   7   14:ifle            85
		{
			com.google.android.gms.common.images.internal.PostProcessedResourceCache.PostProcessedResource postprocessedresource = new com.google.android.gms.common.images.internal.PostProcessedResourceCache.PostProcessedResource(i, j);
	//    8   17:new             #66  <Class com.google.android.gms.common.images.internal.PostProcessedResourceCache$PostProcessedResource>
	//    9   20:dup             
	//   10   21:iload_3         
	//   11   22:iload           4
	//   12   24:invokespecial   #69  <Method void com.google.android.gms.common.images.internal.PostProcessedResourceCache$PostProcessedResource(int, int)>
	//   13   27:astore          6
			Drawable drawable = (Drawable)postprocessedresourcecache.get(((Object) (postprocessedresource)));
	//   14   29:aload_2         
	//   15   30:aload           6
	//   16   32:invokevirtual   #75  <Method Object PostProcessedResourceCache.get(Object)>
	//   17   35:checkcast       #77  <Class Drawable>
	//   18   38:astore          5
			context = ((Context) (drawable));
	//   19   40:aload           5
	//   20   42:astore_1        
			if(drawable == null)
	//*  21   43:aload           5
	//*  22   45:ifnonnull       83
			{
				context = ((Context) (resources.getDrawable(i)));
	//   23   48:aload           7
	//   24   50:iload_3         
	//   25   51:invokevirtual   #83  <Method Drawable Resources.getDrawable(int)>
	//   26   54:astore_1        
				if((mPostProcessingFlags & 1) != 0)
	//*  27   55:aload_0         
	//*  28   56:getfield        #64  <Field int mPostProcessingFlags>
	//*  29   59:iconst_1        
	//*  30   60:iand            
	//*  31   61:ifeq            75
					context = ((Context) (frameDrawableInCircle(resources, ((Drawable) (context)))));
	//   32   64:aload_0         
	//   33   65:aload           7
	//   34   67:aload_1         
	//   35   68:invokevirtual   #87  <Method Drawable frameDrawableInCircle(Resources, Drawable)>
	//   36   71:astore_1        
	//*  37   72:goto            75
				postprocessedresourcecache.put(((Object) (postprocessedresource)), ((Object) (context)));
	//   38   75:aload_2         
	//   39   76:aload           6
	//   40   78:aload_1         
	//   41   79:invokevirtual   #91  <Method Object PostProcessedResourceCache.put(Object, Object)>
	//   42   82:pop             
			}
			return ((Drawable) (context));
	//   43   83:aload_1         
	//   44   84:areturn         
		} else
		{
			return resources.getDrawable(i);
	//   45   85:aload           7
	//   46   87:iload_3         
	//   47   88:invokevirtual   #83  <Method Drawable Resources.getDrawable(int)>
	//   48   91:areturn         
		}
	}

	protected CrossFadingDrawable createTransitionDrawable(Drawable drawable, Drawable drawable1)
	{
		Drawable drawable2;
		if(drawable != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          24
		{
			drawable2 = drawable;
	//    2    4:aload_1         
	//    3    5:astore_3        
			if(drawable instanceof CrossFadingDrawable)
	//*   4    6:aload_1         
	//*   5    7:instanceof      #95  <Class CrossFadingDrawable>
	//*   6   10:ifeq            26
				drawable2 = ((CrossFadingDrawable)drawable).getEndDrawable();
	//    7   13:aload_1         
	//    8   14:checkcast       #95  <Class CrossFadingDrawable>
	//    9   17:invokevirtual   #99  <Method Drawable CrossFadingDrawable.getEndDrawable()>
	//   10   20:astore_3        
		} else
	//*  11   21:goto            26
		{
			drawable2 = null;
	//   12   24:aconst_null     
	//   13   25:astore_3        
		}
		return new CrossFadingDrawable(drawable2, drawable1);
	//   14   26:new             #95  <Class CrossFadingDrawable>
	//   15   29:dup             
	//   16   30:aload_3         
	//   17   31:aload_2         
	//   18   32:invokespecial   #102 <Method void CrossFadingDrawable(Drawable, Drawable)>
	//   19   35:areturn         
	}

	protected Drawable frameDrawableInCircle(Resources resources, Drawable drawable)
	{
		return ImageUtils.frameDrawableInCircle(resources, drawable);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #105 <Method Drawable ImageUtils.frameDrawableInCircle(Resources, Drawable)>
	//    3    5:areturn         
	}

	protected abstract void loadImage(Drawable drawable, boolean flag, boolean flag1, boolean flag2);

	public void setCrossFadeAlwaysEnabled(boolean flag)
	{
		zzpm = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #47  <Field boolean zzpm>
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            14
			setCrossFadeEnabled(true);
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #112 <Method void setCrossFadeEnabled(boolean)>
	//    8   14:return          
	}

	public void setCrossFadeEnabled(boolean flag)
	{
		zzpl = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #45  <Field boolean zzpl>
	//    3    5:return          
	}

	public void setLoadingPlaceholder(int i)
	{
		mLoadingPlaceholderResId = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #39  <Field int mLoadingPlaceholderResId>
	//    3    5:return          
	}

	public void setLoadingPlaceholderEnabled(boolean flag)
	{
		zzpn = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #49  <Field boolean zzpn>
	//    3    5:return          
	}

	public void setNoDataPlaceholder(int i)
	{
		mNoDataPlaceholderResId = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #41  <Field int mNoDataPlaceholderResId>
	//    3    5:return          
	}

	public void setOnImageLoadedListener(ImageManager.OnImageLoadedListener onimageloadedlistener)
	{
		mOnImageLoadedListener = onimageloadedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #120 <Field ImageManager$OnImageLoadedListener mOnImageLoadedListener>
	//    3    5:return          
	}

	public void setPostProcessingFlags(int i)
	{
		mPostProcessingFlags = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #64  <Field int mPostProcessingFlags>
	//    3    5:return          
	}

	public void setUseNewDrawable(boolean flag)
	{
		mUseNewDrawable = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #43  <Field boolean mUseNewDrawable>
	//    3    5:return          
	}

	protected boolean shouldCrossFade(boolean flag, boolean flag1)
	{
		return zzpl && !flag1 && (!flag || zzpm);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field boolean zzpl>
	//    2    4:ifeq            24
	//    3    7:iload_2         
	//    4    8:ifne            24
	//    5   11:iload_1         
	//    6   12:ifeq            22
	//    7   15:aload_0         
	//    8   16:getfield        #47  <Field boolean zzpm>
	//    9   19:ifeq            24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	final void zza(Context context, Bitmap bitmap, boolean flag)
	{
		Asserts.checkNotNull(((Object) (bitmap)));
	//    0    0:aload_2         
	//    1    1:invokestatic    #131 <Method void Asserts.checkNotNull(Object)>
		Bitmap bitmap1 = bitmap;
	//    2    4:aload_2         
	//    3    5:astore          4
		if((mPostProcessingFlags & 1) != 0)
	//*   4    7:aload_0         
	//*   5    8:getfield        #64  <Field int mPostProcessingFlags>
	//*   6   11:iconst_1        
	//*   7   12:iand            
	//*   8   13:ifeq            22
			bitmap1 = ImageUtils.frameBitmapInCircle(bitmap);
	//    9   16:aload_2         
	//   10   17:invokestatic    #135 <Method Bitmap ImageUtils.frameBitmapInCircle(Bitmap)>
	//   11   20:astore          4
		context = ((Context) (new BitmapDrawable(context.getResources(), bitmap1)));
	//   12   22:new             #137 <Class BitmapDrawable>
	//   13   25:dup             
	//   14   26:aload_1         
	//   15   27:invokevirtual   #62  <Method Resources Context.getResources()>
	//   16   30:aload           4
	//   17   32:invokespecial   #140 <Method void BitmapDrawable(Resources, Bitmap)>
	//   18   35:astore_1        
		bitmap = ((Bitmap) (mOnImageLoadedListener));
	//   19   36:aload_0         
	//   20   37:getfield        #120 <Field ImageManager$OnImageLoadedListener mOnImageLoadedListener>
	//   21   40:astore_2        
		if(bitmap != null)
	//*  22   41:aload_2         
	//*  23   42:ifnull          60
			((ImageManager.OnImageLoadedListener) (bitmap)).onImageLoaded(zzpk.uri, ((Drawable) (context)), true);
	//   24   45:aload_2         
	//   25   46:aload_0         
	//   26   47:getfield        #54  <Field ImageRequest$zza zzpk>
	//   27   50:getfield        #144 <Field Uri ImageRequest$zza.uri>
	//   28   53:aload_1         
	//   29   54:iconst_1        
	//   30   55:invokeinterface #150 <Method void ImageManager$OnImageLoadedListener.onImageLoaded(Uri, Drawable, boolean)>
		loadImage(((Drawable) (context)), flag, false, true);
	//   31   60:aload_0         
	//   32   61:aload_1         
	//   33   62:iload_3         
	//   34   63:iconst_0        
	//   35   64:iconst_1        
	//   36   65:invokevirtual   #152 <Method void loadImage(Drawable, boolean, boolean, boolean)>
	//   37   68:return          
	}

	final void zza(Context context, PostProcessedResourceCache postprocessedresourcecache)
	{
		if(zzpn)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field boolean zzpn>
	//*   2    4:ifeq            37
		{
			Drawable drawable = null;
	//    3    7:aconst_null     
	//    4    8:astore          4
			int i = mLoadingPlaceholderResId;
	//    5   10:aload_0         
	//    6   11:getfield        #39  <Field int mLoadingPlaceholderResId>
	//    7   14:istore_3        
			if(i != 0)
	//*   8   15:iload_3         
	//*   9   16:ifeq            28
				drawable = zza(context, postprocessedresourcecache, i);
	//   10   19:aload_0         
	//   11   20:aload_1         
	//   12   21:aload_2         
	//   13   22:iload_3         
	//   14   23:invokespecial   #155 <Method Drawable zza(Context, PostProcessedResourceCache, int)>
	//   15   26:astore          4
			loadImage(drawable, false, true, false);
	//   16   28:aload_0         
	//   17   29:aload           4
	//   18   31:iconst_0        
	//   19   32:iconst_1        
	//   20   33:iconst_0        
	//   21   34:invokevirtual   #152 <Method void loadImage(Drawable, boolean, boolean, boolean)>
		}
	//   22   37:return          
	}

	final void zza(Context context, PostProcessedResourceCache postprocessedresourcecache, boolean flag)
	{
		int i = mNoDataPlaceholderResId;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int mNoDataPlaceholderResId>
	//    2    4:istore          4
		if(i != 0)
	//*   3    6:iload           4
	//*   4    8:ifeq            23
			context = ((Context) (zza(context, postprocessedresourcecache, i)));
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:iload           4
	//    9   16:invokespecial   #155 <Method Drawable zza(Context, PostProcessedResourceCache, int)>
	//   10   19:astore_1        
		else
	//*  11   20:goto            25
			context = null;
	//   12   23:aconst_null     
	//   13   24:astore_1        
		postprocessedresourcecache = ((PostProcessedResourceCache) (mOnImageLoadedListener));
	//   14   25:aload_0         
	//   15   26:getfield        #120 <Field ImageManager$OnImageLoadedListener mOnImageLoadedListener>
	//   16   29:astore_2        
		if(postprocessedresourcecache != null)
	//*  17   30:aload_2         
	//*  18   31:ifnull          49
			((ImageManager.OnImageLoadedListener) (postprocessedresourcecache)).onImageLoaded(zzpk.uri, ((Drawable) (context)), false);
	//   19   34:aload_2         
	//   20   35:aload_0         
	//   21   36:getfield        #54  <Field ImageRequest$zza zzpk>
	//   22   39:getfield        #144 <Field Uri ImageRequest$zza.uri>
	//   23   42:aload_1         
	//   24   43:iconst_0        
	//   25   44:invokeinterface #150 <Method void ImageManager$OnImageLoadedListener.onImageLoaded(Uri, Drawable, boolean)>
		loadImage(((Drawable) (context)), flag, false, false);
	//   26   49:aload_0         
	//   27   50:aload_1         
	//   28   51:iload_3         
	//   29   52:iconst_0        
	//   30   53:iconst_0        
	//   31   54:invokevirtual   #152 <Method void loadImage(Drawable, boolean, boolean, boolean)>
	//   32   57:return          
	}

	protected int mLoadingPlaceholderResId;
	protected int mNoDataPlaceholderResId;
	protected ImageManager.OnImageLoadedListener mOnImageLoadedListener;
	protected int mPostProcessingFlags;
	protected boolean mUseNewDrawable;
	final zza zzpk;
	private boolean zzpl;
	private boolean zzpm;
	private boolean zzpn;
}
