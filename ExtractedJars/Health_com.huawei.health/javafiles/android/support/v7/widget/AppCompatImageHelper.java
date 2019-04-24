// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.graphics.drawable.RippleDrawable;
import android.support.v7.content.res.AppCompatResources;
import android.util.AttributeSet;
import android.widget.ImageView;

// Referenced classes of package android.support.v7.widget:
//			TintTypedArray, DrawableUtils

public class AppCompatImageHelper
{

	public AppCompatImageHelper(ImageView imageview)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		mView = imageview;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field ImageView mView>
	//    5    9:return          
	}

	boolean hasOverlappingRendering()
	{
		android.graphics.drawable.Drawable drawable = mView.getBackground();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ImageView mView>
	//    2    4:invokevirtual   #26  <Method android.graphics.drawable.Drawable ImageView.getBackground()>
	//    3    7:astore_1        
		return android.os.Build.VERSION.SDK_INT < 21 || !(drawable instanceof RippleDrawable);
	//    4    8:getstatic       #32  <Field int android.os.Build$VERSION.SDK_INT>
	//    5   11:bipush          21
	//    6   13:icmplt          25
	//    7   16:aload_1         
	//    8   17:instanceof      #34  <Class RippleDrawable>
	//    9   20:ifeq            25
	//   10   23:iconst_0        
	//   11   24:ireturn         
	//   12   25:iconst_1        
	//   13   26:ireturn         
	}

	public void loadFromAttributes(AttributeSet attributeset, int i)
	{
		AttributeSet attributeset1;
		AttributeSet attributeset2;
		Object obj;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          7
		attributeset2 = null;
	//    2    3:aconst_null     
	//    3    4:astore          4
		attributeset1 = ((AttributeSet) (obj));
	//    4    6:aload           7
	//    5    8:astore_3        
		android.graphics.drawable.Drawable drawable1 = mView.getDrawable();
	//    6    9:aload_0         
	//    7   10:getfield        #17  <Field ImageView mView>
	//    8   13:invokevirtual   #39  <Method android.graphics.drawable.Drawable ImageView.getDrawable()>
	//    9   16:astore          6
		android.graphics.drawable.Drawable drawable;
		drawable = drawable1;
	//   10   18:aload           6
	//   11   20:astore          5
		if(drawable1 != null)
			break MISSING_BLOCK_LABEL_115;
	//   12   22:aload           6
	//   13   24:ifnonnull       115
		attributeset1 = ((AttributeSet) (obj));
	//   14   27:aload           7
	//   15   29:astore_3        
		attributeset = ((AttributeSet) (TintTypedArray.obtainStyledAttributes(mView.getContext(), attributeset, android.support.v7.appcompat.R.styleable.AppCompatImageView, i, 0)));
	//   16   30:aload_0         
	//   17   31:getfield        #17  <Field ImageView mView>
	//   18   34:invokevirtual   #43  <Method android.content.Context ImageView.getContext()>
	//   19   37:aload_1         
	//   20   38:getstatic       #49  <Field int[] android.support.v7.appcompat.R$styleable.AppCompatImageView>
	//   21   41:iload_2         
	//   22   42:iconst_0        
	//   23   43:invokestatic    #55  <Method TintTypedArray TintTypedArray.obtainStyledAttributes(android.content.Context, AttributeSet, int[], int, int)>
	//   24   46:astore_1        
		attributeset1 = attributeset;
	//   25   47:aload_1         
	//   26   48:astore_3        
		i = ((TintTypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatImageView_srcCompat, -1);
	//   27   49:aload_1         
	//   28   50:getstatic       #58  <Field int android.support.v7.appcompat.R$styleable.AppCompatImageView_srcCompat>
	//   29   53:iconst_m1       
	//   30   54:invokevirtual   #62  <Method int TintTypedArray.getResourceId(int, int)>
	//   31   57:istore_2        
		attributeset2 = attributeset;
	//   32   58:aload_1         
	//   33   59:astore          4
		drawable = drawable1;
	//   34   61:aload           6
	//   35   63:astore          5
		if(i == -1)
			break MISSING_BLOCK_LABEL_115;
	//   36   65:iload_2         
	//   37   66:iconst_m1       
	//   38   67:icmpeq          115
		attributeset1 = attributeset;
	//   39   70:aload_1         
	//   40   71:astore_3        
		drawable1 = AppCompatResources.getDrawable(mView.getContext(), i);
	//   41   72:aload_0         
	//   42   73:getfield        #17  <Field ImageView mView>
	//   43   76:invokevirtual   #43  <Method android.content.Context ImageView.getContext()>
	//   44   79:iload_2         
	//   45   80:invokestatic    #67  <Method android.graphics.drawable.Drawable AppCompatResources.getDrawable(android.content.Context, int)>
	//   46   83:astore          6
		attributeset2 = attributeset;
	//   47   85:aload_1         
	//   48   86:astore          4
		drawable = drawable1;
	//   49   88:aload           6
	//   50   90:astore          5
		if(drawable1 == null)
			break MISSING_BLOCK_LABEL_115;
	//   51   92:aload           6
	//   52   94:ifnull          115
		attributeset1 = attributeset;
	//   53   97:aload_1         
	//   54   98:astore_3        
		mView.setImageDrawable(drawable1);
	//   55   99:aload_0         
	//   56  100:getfield        #17  <Field ImageView mView>
	//   57  103:aload           6
	//   58  105:invokevirtual   #71  <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
		drawable = drawable1;
	//   59  108:aload           6
	//   60  110:astore          5
		attributeset2 = attributeset;
	//   61  112:aload_1         
	//   62  113:astore          4
		if(drawable == null)
			break MISSING_BLOCK_LABEL_128;
	//   63  115:aload           5
	//   64  117:ifnull          128
		attributeset1 = attributeset2;
	//   65  120:aload           4
	//   66  122:astore_3        
		DrawableUtils.fixDrawable(drawable);
	//   67  123:aload           5
	//   68  125:invokestatic    #76  <Method void DrawableUtils.fixDrawable(android.graphics.drawable.Drawable)>
		if(attributeset2 != null)
	//*  69  128:aload           4
	//*  70  130:ifnull          150
		{
			((TintTypedArray) (attributeset2)).recycle();
	//   71  133:aload           4
	//   72  135:invokevirtual   #79  <Method void TintTypedArray.recycle()>
			return;
	//   73  138:return          
		} else
	//*  74  139:astore_1        
	//*  75  140:aload_3         
	//*  76  141:ifnull          148
	//*  77  144:aload_3         
	//*  78  145:invokevirtual   #79  <Method void TintTypedArray.recycle()>
	//*  79  148:aload_1         
	//*  80  149:athrow          
		{
			return;
	//   81  150:return          
		}
		attributeset;
		if(attributeset1 != null)
			((TintTypedArray) (attributeset1)).recycle();
		throw attributeset;
	}

	public void setImageResource(int i)
	{
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            33
		{
			android.graphics.drawable.Drawable drawable = AppCompatResources.getDrawable(mView.getContext(), i);
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field ImageView mView>
	//    4    8:invokevirtual   #43  <Method android.content.Context ImageView.getContext()>
	//    5   11:iload_1         
	//    6   12:invokestatic    #67  <Method android.graphics.drawable.Drawable AppCompatResources.getDrawable(android.content.Context, int)>
	//    7   15:astore_2        
			if(drawable != null)
	//*   8   16:aload_2         
	//*   9   17:ifnull          24
				DrawableUtils.fixDrawable(drawable);
	//   10   20:aload_2         
	//   11   21:invokestatic    #76  <Method void DrawableUtils.fixDrawable(android.graphics.drawable.Drawable)>
			mView.setImageDrawable(drawable);
	//   12   24:aload_0         
	//   13   25:getfield        #17  <Field ImageView mView>
	//   14   28:aload_2         
	//   15   29:invokevirtual   #71  <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
			return;
	//   16   32:return          
		} else
		{
			mView.setImageDrawable(((android.graphics.drawable.Drawable) (null)));
	//   17   33:aload_0         
	//   18   34:getfield        #17  <Field ImageView mView>
	//   19   37:aconst_null     
	//   20   38:invokevirtual   #71  <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
			return;
	//   21   41:return          
		}
	}

	private final ImageView mView;
}
