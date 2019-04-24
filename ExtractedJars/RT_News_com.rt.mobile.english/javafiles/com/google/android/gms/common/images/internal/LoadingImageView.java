// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.images.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.images.ImageRequest;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.util.PlatformVersion;

// Referenced classes of package com.google.android.gms.common.images.internal:
//			ColorFilters

public final class LoadingImageView extends ImageView
{
	public static interface ClipPathProvider
	{

		public abstract Path getClipPath(int i, int j);
	}


	public LoadingImageView(Context context)
	{
		this(context, ((AttributeSet) (null)), 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:iconst_0        
	//    4    4:invokespecial   #37  <Method void LoadingImageView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public LoadingImageView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #37  <Method void LoadingImageView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public LoadingImageView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #40  <Method void ImageView(Context, AttributeSet, int)>
		zzqo = 0;
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:putfield        #42  <Field int zzqo>
		zzpl = true;
	//    8   12:aload_0         
	//    9   13:iconst_1        
	//   10   14:putfield        #44  <Field boolean zzpl>
		zzpm = false;
	//   11   17:aload_0         
	//   12   18:iconst_0        
	//   13   19:putfield        #46  <Field boolean zzpm>
		zzqp = false;
	//   14   22:aload_0         
	//   15   23:iconst_0        
	//   16   24:putfield        #48  <Field boolean zzqp>
		zzqq = 0;
	//   17   27:aload_0         
	//   18   28:iconst_0        
	//   19   29:putfield        #50  <Field int zzqq>
		mPostProcessingFlags = 0;
	//   20   32:aload_0         
	//   21   33:iconst_0        
	//   22   34:putfield        #52  <Field int mPostProcessingFlags>
		zzqs = 0;
	//   23   37:aload_0         
	//   24   38:iconst_0        
	//   25   39:putfield        #54  <Field int zzqs>
		zzqt = 1.0F;
	//   26   42:aload_0         
	//   27   43:fconst_1        
	//   28   44:putfield        #56  <Field float zzqt>
		context = ((Context) (context.obtainStyledAttributes(attributeset, com.google.android.gms.base.R.styleable.LoadingImageView)));
	//   29   47:aload_1         
	//   30   48:aload_2         
	//   31   49:getstatic       #62  <Field int[] com.google.android.gms.base.R$styleable.LoadingImageView>
	//   32   52:invokevirtual   #68  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   33   55:astore_1        
		zzqs = ((TypedArray) (context)).getInt(com.google.android.gms.base.R.styleable.LoadingImageView_imageAspectRatioAdjust, 0);
	//   34   56:aload_0         
	//   35   57:aload_1         
	//   36   58:getstatic       #71  <Field int com.google.android.gms.base.R$styleable.LoadingImageView_imageAspectRatioAdjust>
	//   37   61:iconst_0        
	//   38   62:invokevirtual   #77  <Method int TypedArray.getInt(int, int)>
	//   39   65:putfield        #54  <Field int zzqs>
		zzqt = ((TypedArray) (context)).getFloat(com.google.android.gms.base.R.styleable.LoadingImageView_imageAspectRatio, 1.0F);
	//   40   68:aload_0         
	//   41   69:aload_1         
	//   42   70:getstatic       #80  <Field int com.google.android.gms.base.R$styleable.LoadingImageView_imageAspectRatio>
	//   43   73:fconst_1        
	//   44   74:invokevirtual   #84  <Method float TypedArray.getFloat(int, float)>
	//   45   77:putfield        #56  <Field float zzqt>
		setCircleCropEnabled(((TypedArray) (context)).getBoolean(com.google.android.gms.base.R.styleable.LoadingImageView_circleCrop, false));
	//   46   80:aload_0         
	//   47   81:aload_1         
	//   48   82:getstatic       #87  <Field int com.google.android.gms.base.R$styleable.LoadingImageView_circleCrop>
	//   49   85:iconst_0        
	//   50   86:invokevirtual   #91  <Method boolean TypedArray.getBoolean(int, boolean)>
	//   51   89:invokevirtual   #95  <Method void setCircleCropEnabled(boolean)>
		((TypedArray) (context)).recycle();
	//   52   92:aload_1         
	//   53   93:invokevirtual   #99  <Method void TypedArray.recycle()>
	//   54   96:return          
	}

	private final void zzc(boolean flag)
	{
		if(mOnImageLoadedListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field com.google.android.gms.common.images.ImageManager$OnImageLoadedListener mOnImageLoadedListener>
	//*   2    4:ifnull          22
			mOnImageLoadedListener.onImageLoaded(zzqn, ((android.graphics.drawable.Drawable) (null)), flag);
	//    3    7:aload_0         
	//    4    8:getfield        #102 <Field com.google.android.gms.common.images.ImageManager$OnImageLoadedListener mOnImageLoadedListener>
	//    5   11:aload_0         
	//    6   12:getfield        #104 <Field Uri zzqn>
	//    7   15:aconst_null     
	//    8   16:iload_1         
	//    9   17:invokeinterface #110 <Method void com.google.android.gms.common.images.ImageManager$OnImageLoadedListener.onImageLoaded(Uri, android.graphics.drawable.Drawable, boolean)>
	//   10   22:return          
	}

	public final void clearAspectRatioAdjust()
	{
		if(zzqs != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field int zzqs>
	//*   2    4:ifeq            16
		{
			zzqs = 0;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #54  <Field int zzqs>
			requestLayout();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #114 <Method void requestLayout()>
		}
	//    8   16:return          
	}

	public final void clearImage()
	{
		loadUri(((Uri) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #119 <Method void loadUri(Uri)>
		zzqp = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #48  <Field boolean zzqp>
	//    6   10:return          
	}

	public final int getLoadedNoDataPlaceholderResId()
	{
		return zzqo;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int zzqo>
	//    2    4:ireturn         
	}

	public final Uri getLoadedUri()
	{
		return zzqn;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field Uri zzqn>
	//    2    4:areturn         
	}

	public final void loadUri(Uri uri)
	{
		loadUri(uri, 0, true, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:iconst_1        
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #126 <Method void loadUri(Uri, int, boolean, boolean)>
	//    6    8:return          
	}

	public final void loadUri(Uri uri, int i)
	{
		loadUri(uri, i, true, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_1        
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #126 <Method void loadUri(Uri, int, boolean, boolean)>
	//    6    8:return          
	}

	public final void loadUri(Uri uri, int i, boolean flag)
	{
		loadUri(uri, i, flag, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #126 <Method void loadUri(Uri, int, boolean, boolean)>
	//    6    8:return          
	}

	public final void loadUri(Uri uri, int i, boolean flag, boolean flag1)
	{
		boolean flag3 = true;
	//    0    0:iconst_1        
	//    1    1:istore          6
		boolean flag2;
		if(uri != null)
	//*   2    3:aload_1         
	//*   3    4:ifnull          20
			flag2 = uri.equals(((Object) (zzqn)));
	//    4    7:aload_1         
	//    5    8:aload_0         
	//    6    9:getfield        #104 <Field Uri zzqn>
	//    7   12:invokevirtual   #134 <Method boolean Uri.equals(Object)>
	//    8   15:istore          5
		else
	//*   9   17:goto            36
		if(zzqn == null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #104 <Field Uri zzqn>
	//*  12   24:ifnonnull       33
			flag2 = true;
	//   13   27:iconst_1        
	//   14   28:istore          5
		else
	//*  15   30:goto            36
			flag2 = false;
	//   16   33:iconst_0        
	//   17   34:istore          5
		if(flag2)
	//*  18   36:iload           5
	//*  19   38:ifeq            68
		{
			if(zzqn != null)
	//*  20   41:aload_0         
	//*  21   42:getfield        #104 <Field Uri zzqn>
	//*  22   45:ifnull          54
			{
				zzc(true);
	//   23   48:aload_0         
	//   24   49:iconst_1        
	//   25   50:invokespecial   #136 <Method void zzc(boolean)>
				return;
	//   26   53:return          
			}
			if(zzqo == i)
	//*  27   54:aload_0         
	//*  28   55:getfield        #42  <Field int zzqo>
	//*  29   58:iload_2         
	//*  30   59:icmpne          68
			{
				zzc(false);
	//   31   62:aload_0         
	//   32   63:iconst_0        
	//   33   64:invokespecial   #136 <Method void zzc(boolean)>
				return;
	//   34   67:return          
			}
		}
		if(zzqm == null)
	//*  35   68:getstatic       #138 <Field ImageManager zzqm>
	//*  36   71:ifnonnull       103
		{
			flag2 = getContext().getApplicationContext().getPackageName().equals("com.google.android.play.games");
	//   37   74:aload_0         
	//   38   75:invokevirtual   #142 <Method Context getContext()>
	//   39   78:invokevirtual   #145 <Method Context Context.getApplicationContext()>
	//   40   81:invokevirtual   #149 <Method String Context.getPackageName()>
	//   41   84:ldc1            #151 <String "com.google.android.play.games">
	//   42   86:invokevirtual   #154 <Method boolean String.equals(Object)>
	//   43   89:istore          5
			zzqm = ImageManager.create(getContext(), flag2);
	//   44   91:aload_0         
	//   45   92:invokevirtual   #142 <Method Context getContext()>
	//   46   95:iload           5
	//   47   97:invokestatic    #160 <Method ImageManager ImageManager.create(Context, boolean)>
	//   48  100:putstatic       #138 <Field ImageManager zzqm>
		}
		flag2 = flag3;
	//   49  103:iload           6
	//   50  105:istore          5
		if(!zzpm)
	//*  51  107:aload_0         
	//*  52  108:getfield        #46  <Field boolean zzpm>
	//*  53  111:ifne            131
			if(zzqp)
	//*  54  114:aload_0         
	//*  55  115:getfield        #48  <Field boolean zzqp>
	//*  56  118:ifeq            128
				flag2 = flag3;
	//   57  121:iload           6
	//   58  123:istore          5
			else
	//*  59  125:goto            131
				flag2 = false;
	//   60  128:iconst_0        
	//   61  129:istore          5
		zzqp = false;
	//   62  131:aload_0         
	//   63  132:iconst_0        
	//   64  133:putfield        #48  <Field boolean zzqp>
		uri = ((Uri) (new com.google.android.gms.common.images.ImageRequest.ImageViewImageRequest(((ImageView) (this)), uri)));
	//   65  136:new             #162 <Class com.google.android.gms.common.images.ImageRequest$ImageViewImageRequest>
	//   66  139:dup             
	//   67  140:aload_0         
	//   68  141:aload_1         
	//   69  142:invokespecial   #165 <Method void com.google.android.gms.common.images.ImageRequest$ImageViewImageRequest(ImageView, Uri)>
	//   70  145:astore_1        
		((ImageRequest) (uri)).setNoDataPlaceholder(i);
	//   71  146:aload_1         
	//   72  147:iload_2         
	//   73  148:invokevirtual   #171 <Method void ImageRequest.setNoDataPlaceholder(int)>
		((ImageRequest) (uri)).setCrossFadeEnabled(zzpl);
	//   74  151:aload_1         
	//   75  152:aload_0         
	//   76  153:getfield        #44  <Field boolean zzpl>
	//   77  156:invokevirtual   #174 <Method void ImageRequest.setCrossFadeEnabled(boolean)>
		((ImageRequest) (uri)).setCrossFadeAlwaysEnabled(flag2);
	//   78  159:aload_1         
	//   79  160:iload           5
	//   80  162:invokevirtual   #177 <Method void ImageRequest.setCrossFadeAlwaysEnabled(boolean)>
		((ImageRequest) (uri)).setLoadingPlaceholderEnabled(flag);
	//   81  165:aload_1         
	//   82  166:iload_3         
	//   83  167:invokevirtual   #180 <Method void ImageRequest.setLoadingPlaceholderEnabled(boolean)>
		((ImageRequest) (uri)).setPostProcessingFlags(mPostProcessingFlags);
	//   84  170:aload_1         
	//   85  171:aload_0         
	//   86  172:getfield        #52  <Field int mPostProcessingFlags>
	//   87  175:invokevirtual   #183 <Method void ImageRequest.setPostProcessingFlags(int)>
		((ImageRequest) (uri)).setOnImageLoadedListener(mOnImageLoadedListener);
	//   88  178:aload_1         
	//   89  179:aload_0         
	//   90  180:getfield        #102 <Field com.google.android.gms.common.images.ImageManager$OnImageLoadedListener mOnImageLoadedListener>
	//   91  183:invokevirtual   #187 <Method void ImageRequest.setOnImageLoadedListener(com.google.android.gms.common.images.ImageManager$OnImageLoadedListener)>
		((ImageRequest) (uri)).setUseNewDrawable(flag1);
	//   92  186:aload_1         
	//   93  187:iload           4
	//   94  189:invokevirtual   #190 <Method void ImageRequest.setUseNewDrawable(boolean)>
		zzqm.loadImage(((ImageRequest) (uri)));
	//   95  192:getstatic       #138 <Field ImageManager zzqm>
	//   96  195:aload_1         
	//   97  196:invokevirtual   #194 <Method void ImageManager.loadImage(ImageRequest)>
	//   98  199:return          
	}

	protected final void onDraw(Canvas canvas)
	{
		if(zzqr != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #198 <Field LoadingImageView$ClipPathProvider zzqr>
	//*   2    4:ifnull          29
			canvas.clipPath(zzqr.getClipPath(getWidth(), getHeight()));
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #198 <Field LoadingImageView$ClipPathProvider zzqr>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #201 <Method int getWidth()>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #204 <Method int getHeight()>
	//   10   20:invokeinterface #208 <Method Path LoadingImageView$ClipPathProvider.getClipPath(int, int)>
	//   11   25:invokevirtual   #214 <Method boolean Canvas.clipPath(Path)>
	//   12   28:pop             
		super.onDraw(canvas);
	//   13   29:aload_0         
	//   14   30:aload_1         
	//   15   31:invokespecial   #216 <Method void ImageView.onDraw(Canvas)>
		if(zzqq != 0)
	//*  16   34:aload_0         
	//*  17   35:getfield        #50  <Field int zzqq>
	//*  18   38:ifeq            49
			canvas.drawColor(zzqq);
	//   19   41:aload_1         
	//   20   42:aload_0         
	//   21   43:getfield        #50  <Field int zzqq>
	//   22   46:invokevirtual   #219 <Method void Canvas.drawColor(int)>
	//   23   49:return          
	}

	protected final void onMeasure(int i, int j)
	{
		super.onMeasure(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #223 <Method void ImageView.onMeasure(int, int)>
		switch(zzqs)
	//*   4    6:aload_0         
	//*   5    7:getfield        #54  <Field int zzqs>
		{
	//*   6   10:tableswitch     1 2: default 32
	//	               1 50
	//	               2 33
		default:
			return;
	//    7   32:return          

		case 2: // '\002'
			i = getMeasuredWidth();
	//    8   33:aload_0         
	//    9   34:invokevirtual   #226 <Method int getMeasuredWidth()>
	//   10   37:istore_1        
			j = (int)((float)i / zzqt);
	//   11   38:iload_1         
	//   12   39:i2f             
	//   13   40:aload_0         
	//   14   41:getfield        #56  <Field float zzqt>
	//   15   44:fdiv            
	//   16   45:f2i             
	//   17   46:istore_2        
			break;

	//*  18   47:goto            64
		case 1: // '\001'
			j = getMeasuredHeight();
	//   19   50:aload_0         
	//   20   51:invokevirtual   #229 <Method int getMeasuredHeight()>
	//   21   54:istore_2        
			i = (int)((float)j * zzqt);
	//   22   55:iload_2         
	//   23   56:i2f             
	//   24   57:aload_0         
	//   25   58:getfield        #56  <Field float zzqt>
	//   26   61:fmul            
	//   27   62:f2i             
	//   28   63:istore_1        
			break;
		}
		setMeasuredDimension(i, j);
	//   29   64:aload_0         
	//   30   65:iload_1         
	//   31   66:iload_2         
	//   32   67:invokevirtual   #232 <Method void setMeasuredDimension(int, int)>
	//   33   70:return          
	}

	public final void setCircleCropEnabled(boolean flag)
	{
		int i;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            17
			i = mPostProcessingFlags | 1;
	//    2    4:aload_0         
	//    3    5:getfield        #52  <Field int mPostProcessingFlags>
	//    4    8:iconst_1        
	//    5    9:ior             
	//    6   10:istore_2        
		else
	//*   7   11:aload_0         
	//*   8   12:iload_2         
	//*   9   13:putfield        #52  <Field int mPostProcessingFlags>
	//*  10   16:return          
			i = mPostProcessingFlags & -2;
	//   11   17:aload_0         
	//   12   18:getfield        #52  <Field int mPostProcessingFlags>
	//   13   21:bipush          -2
	//   14   23:iand            
	//   15   24:istore_2        
		mPostProcessingFlags = i;
	//*  16   25:goto            11
	}

	public final void setClipPathProvider(ClipPathProvider clippathprovider)
	{
		zzqr = clippathprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #198 <Field LoadingImageView$ClipPathProvider zzqr>
		if(!PlatformVersion.isAtLeastJellyBean())
	//*   3    5:invokestatic    #240 <Method boolean PlatformVersion.isAtLeastJellyBean()>
	//*   4    8:ifne            17
			setLayerType(1, ((android.graphics.Paint) (null)));
	//    5   11:aload_0         
	//    6   12:iconst_1        
	//    7   13:aconst_null     
	//    8   14:invokevirtual   #244 <Method void setLayerType(int, android.graphics.Paint)>
	//    9   17:return          
	}

	public final void setCrossFadeAlwaysEnabled(boolean flag)
	{
		zzpm = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #46  <Field boolean zzpm>
	//    3    5:return          
	}

	public final void setCrossFadeEnabled(boolean flag)
	{
		zzpl = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #44  <Field boolean zzpl>
	//    3    5:return          
	}

	public final void setImageAspectRatioAdjust(int i, float f)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		boolean flag;
		if(i != 0 && i != 1 && i != 2)
	//*   2    3:iload_1         
	//*   3    4:ifeq            25
	//*   4    7:iload_1         
	//*   5    8:iconst_1        
	//*   6    9:icmpeq          25
	//*   7   12:iload_1         
	//*   8   13:iconst_2        
	//*   9   14:icmpne          20
	//*  10   17:goto            25
			flag = false;
	//   11   20:iconst_0        
	//   12   21:istore_3        
		else
	//*  13   22:goto            27
			flag = true;
	//   14   25:iconst_1        
	//   15   26:istore_3        
		Asserts.checkState(flag);
	//   16   27:iload_3         
	//   17   28:invokestatic    #251 <Method void Asserts.checkState(boolean)>
		flag = flag1;
	//   18   31:iload           4
	//   19   33:istore_3        
		if(f > 0.0F)
	//*  20   34:fload_2         
	//*  21   35:fconst_0        
	//*  22   36:fcmpl           
	//*  23   37:ifle            42
			flag = true;
	//   24   40:iconst_1        
	//   25   41:istore_3        
		Asserts.checkState(flag);
	//   26   42:iload_3         
	//   27   43:invokestatic    #251 <Method void Asserts.checkState(boolean)>
		zzqs = i;
	//   28   46:aload_0         
	//   29   47:iload_1         
	//   30   48:putfield        #54  <Field int zzqs>
		zzqt = f;
	//   31   51:aload_0         
	//   32   52:fload_2         
	//   33   53:putfield        #56  <Field float zzqt>
		requestLayout();
	//   34   56:aload_0         
	//   35   57:invokevirtual   #114 <Method void requestLayout()>
	//   36   60:return          
	}

	public final void setLoadedNoDataPlaceholderResId(int i)
	{
		zzqo = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #42  <Field int zzqo>
	//    3    5:return          
	}

	public final void setLoadedUri(Uri uri)
	{
		zzqn = uri;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #104 <Field Uri zzqn>
	//    3    5:return          
	}

	public final void setOnImageLoadedListener(com.google.android.gms.common.images.ImageManager.OnImageLoadedListener onimageloadedlistener)
	{
		mOnImageLoadedListener = onimageloadedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #102 <Field com.google.android.gms.common.images.ImageManager$OnImageLoadedListener mOnImageLoadedListener>
	//    3    5:return          
	}

	public final void setTintColor(int i)
	{
		zzqq = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #50  <Field int zzqq>
		android.graphics.ColorFilter colorfilter;
		if(zzqq != 0)
	//*   3    5:aload_0         
	//*   4    6:getfield        #50  <Field int zzqq>
	//*   5    9:ifeq            24
			colorfilter = ColorFilters.COLOR_FILTER_BW;
	//    6   12:getstatic       #260 <Field android.graphics.ColorFilter ColorFilters.COLOR_FILTER_BW>
	//    7   15:astore_2        
		else
	//*   8   16:aload_0         
	//*   9   17:aload_2         
	//*  10   18:invokevirtual   #264 <Method void setColorFilter(android.graphics.ColorFilter)>
	//*  11   21:goto            29
			colorfilter = null;
	//   12   24:aconst_null     
	//   13   25:astore_2        
		setColorFilter(colorfilter);
	//*  14   26:goto            16
		invalidate();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #267 <Method void invalidate()>
	//   17   33:return          
	}

	public final void setTintColorId(int i)
	{
label0:
		{
			if(i > 0)
	//*   0    0:iload_1         
	//*   1    1:ifle            22
			{
				Resources resources = getResources();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #272 <Method Resources getResources()>
	//    4    8:astore_2        
				if(resources != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          22
				{
					i = resources.getColor(i);
	//    7   13:aload_2         
	//    8   14:iload_1         
	//    9   15:invokevirtual   #278 <Method int Resources.getColor(int)>
	//   10   18:istore_1        
					break label0;
	//   11   19:goto            24
				}
			}
			i = 0;
	//   12   22:iconst_0        
	//   13   23:istore_1        
		}
		setTintColor(i);
	//   14   24:aload_0         
	//   15   25:iload_1         
	//   16   26:invokevirtual   #280 <Method void setTintColor(int)>
	//   17   29:return          
	}

	public static final int ASPECT_RATIO_ADJUST_HEIGHT = 2;
	public static final int ASPECT_RATIO_ADJUST_NONE = 0;
	public static final int ASPECT_RATIO_ADJUST_WIDTH = 1;
	private static ImageManager zzqm;
	private com.google.android.gms.common.images.ImageManager.OnImageLoadedListener mOnImageLoadedListener;
	private int mPostProcessingFlags;
	private boolean zzpl;
	private boolean zzpm;
	private Uri zzqn;
	private int zzqo;
	private boolean zzqp;
	private int zzqq;
	private ClipPathProvider zzqr;
	private int zzqs;
	private float zzqt;
}
