// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.volley.VolleyError;

// Referenced classes of package com.android.volley.toolbox:
//			ImageLoader

public class NetworkImageView extends ImageView
{

	public NetworkImageView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #22  <Method void NetworkImageView(Context, AttributeSet)>
	//    4    6:return          
	}

	public NetworkImageView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #26  <Method void NetworkImageView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public NetworkImageView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #27  <Method void ImageView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	private void setDefaultImageOrNull()
	{
		if(mDefaultImageId != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field int mDefaultImageId>
	//*   2    4:ifeq            16
		{
			setImageResource(mDefaultImageId);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #34  <Field int mDefaultImageId>
	//    6   12:invokevirtual   #40  <Method void setImageResource(int)>
			return;
	//    7   15:return          
		} else
		{
			setImageBitmap(((android.graphics.Bitmap) (null)));
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:invokevirtual   #44  <Method void setImageBitmap(android.graphics.Bitmap)>
			return;
	//   11   21:return          
		}
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void ImageView.drawableStateChanged()>
		invalidate();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #50  <Method void invalidate()>
	//    4    8:return          
	}

	public String getImageURL()
	{
		return mUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field String mUrl>
	//    2    4:areturn         
	}

	void loadImageIfNecessary(final boolean isInLayoutPass)
	{
		int l = getWidth();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #60  <Method int getWidth()>
	//    2    4:istore          6
		int k = getHeight();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #63  <Method int getHeight()>
	//    5   10:istore          5
		android.widget.ImageView.ScaleType scaletype = getScaleType();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #67  <Method android.widget.ImageView$ScaleType getScaleType()>
	//    8   16:astore          7
		boolean flag1 = false;
	//    9   18:iconst_0        
	//   10   19:istore_3        
		boolean flag = false;
	//   11   20:iconst_0        
	//   12   21:istore_2        
		if(getLayoutParams() != null)
	//*  13   22:aload_0         
	//*  14   23:invokevirtual   #71  <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//*  15   26:ifnull          67
		{
			if(getLayoutParams().width == -2)
	//*  16   29:aload_0         
	//*  17   30:invokevirtual   #71  <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//*  18   33:getfield        #76  <Field int android.view.ViewGroup$LayoutParams.width>
	//*  19   36:bipush          -2
	//*  20   38:icmpne          46
				flag1 = true;
	//   21   41:iconst_1        
	//   22   42:istore_3        
			else
	//*  23   43:goto            48
				flag1 = false;
	//   24   46:iconst_0        
	//   25   47:istore_3        
			if(getLayoutParams().height == -2)
	//*  26   48:aload_0         
	//*  27   49:invokevirtual   #71  <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//*  28   52:getfield        #79  <Field int android.view.ViewGroup$LayoutParams.height>
	//*  29   55:bipush          -2
	//*  30   57:icmpne          65
				flag = true;
	//   31   60:iconst_1        
	//   32   61:istore_2        
			else
	//*  33   62:goto            67
				flag = false;
	//   34   65:iconst_0        
	//   35   66:istore_2        
		}
		boolean flag2;
		if(flag1 && flag)
	//*  36   67:iload_3         
	//*  37   68:ifeq            81
	//*  38   71:iload_2         
	//*  39   72:ifeq            81
			flag2 = true;
	//   40   75:iconst_1        
	//   41   76:istore          4
		else
	//*  42   78:goto            84
			flag2 = false;
	//   43   81:iconst_0        
	//   44   82:istore          4
		if(l == 0 && k == 0 && !flag2)
	//*  45   84:iload           6
	//*  46   86:ifne            100
	//*  47   89:iload           5
	//*  48   91:ifne            100
	//*  49   94:iload           4
	//*  50   96:ifne            100
			return;
	//   51   99:return          
		if(TextUtils.isEmpty(((CharSequence) (mUrl))))
	//*  52  100:aload_0         
	//*  53  101:getfield        #54  <Field String mUrl>
	//*  54  104:invokestatic    #85  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  55  107:ifeq            134
		{
			if(mImageContainer != null)
	//*  56  110:aload_0         
	//*  57  111:getfield        #87  <Field ImageLoader$ImageContainer mImageContainer>
	//*  58  114:ifnull          129
			{
				mImageContainer.cancelRequest();
	//   59  117:aload_0         
	//   60  118:getfield        #87  <Field ImageLoader$ImageContainer mImageContainer>
	//   61  121:invokevirtual   #92  <Method void ImageLoader$ImageContainer.cancelRequest()>
				mImageContainer = null;
	//   62  124:aload_0         
	//   63  125:aconst_null     
	//   64  126:putfield        #87  <Field ImageLoader$ImageContainer mImageContainer>
			}
			setDefaultImageOrNull();
	//   65  129:aload_0         
	//   66  130:invokespecial   #94  <Method void setDefaultImageOrNull()>
			return;
	//   67  133:return          
		}
		if(mImageContainer != null && mImageContainer.getRequestUrl() != null)
	//*  68  134:aload_0         
	//*  69  135:getfield        #87  <Field ImageLoader$ImageContainer mImageContainer>
	//*  70  138:ifnull          180
	//*  71  141:aload_0         
	//*  72  142:getfield        #87  <Field ImageLoader$ImageContainer mImageContainer>
	//*  73  145:invokevirtual   #97  <Method String ImageLoader$ImageContainer.getRequestUrl()>
	//*  74  148:ifnull          180
		{
			if(mImageContainer.getRequestUrl().equals(((Object) (mUrl))))
	//*  75  151:aload_0         
	//*  76  152:getfield        #87  <Field ImageLoader$ImageContainer mImageContainer>
	//*  77  155:invokevirtual   #97  <Method String ImageLoader$ImageContainer.getRequestUrl()>
	//*  78  158:aload_0         
	//*  79  159:getfield        #54  <Field String mUrl>
	//*  80  162:invokevirtual   #103 <Method boolean String.equals(Object)>
	//*  81  165:ifeq            169
				return;
	//   82  168:return          
			mImageContainer.cancelRequest();
	//   83  169:aload_0         
	//   84  170:getfield        #87  <Field ImageLoader$ImageContainer mImageContainer>
	//   85  173:invokevirtual   #92  <Method void ImageLoader$ImageContainer.cancelRequest()>
			setDefaultImageOrNull();
	//   86  176:aload_0         
	//   87  177:invokespecial   #94  <Method void setDefaultImageOrNull()>
		}
		int j;
		if(flag1)
	//*  88  180:iload_3         
	//*  89  181:ifeq            189
			j = 0;
	//   90  184:iconst_0        
	//   91  185:istore_3        
		else
	//*  92  186:goto            192
			j = l;
	//   93  189:iload           6
	//   94  191:istore_3        
		int i;
		if(flag)
	//*  95  192:iload_2         
	//*  96  193:ifeq            201
			i = 0;
	//   97  196:iconst_0        
	//   98  197:istore_2        
		else
	//*  99  198:goto            204
			i = k;
	//  100  201:iload           5
	//  101  203:istore_2        
		mImageContainer = mImageLoader.get(mUrl, new ImageLoader.ImageListener() {

			public void onErrorResponse(VolleyError volleyerror)
			{
				if(mErrorImageId != 0)
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field NetworkImageView this$0>
			//*   2    4:invokestatic    #33  <Method int NetworkImageView.access$000(NetworkImageView)>
			//*   3    7:ifeq            24
					setImageResource(mErrorImageId);
			//    4   10:aload_0         
			//    5   11:getfield        #21  <Field NetworkImageView this$0>
			//    6   14:aload_0         
			//    7   15:getfield        #21  <Field NetworkImageView this$0>
			//    8   18:invokestatic    #33  <Method int NetworkImageView.access$000(NetworkImageView)>
			//    9   21:invokevirtual   #37  <Method void NetworkImageView.setImageResource(int)>
			//   10   24:return          
			}

			public void onResponse(ImageLoader.ImageContainer imagecontainer, boolean flag3)
			{
				if(flag3 && isInLayoutPass)
			//*   0    0:iload_2         
			//*   1    1:ifeq            29
			//*   2    4:aload_0         
			//*   3    5:getfield        #23  <Field boolean val$isInLayoutPass>
			//*   4    8:ifeq            29
				{
					post(((_cls1) (imagecontainer)). new Runnable() {

						public void run()
						{
							onResponse(response, false);
						//    0    0:aload_0         
						//    1    1:getfield        #19  <Field NetworkImageView$1 this$1>
						//    2    4:aload_0         
						//    3    5:getfield        #21  <Field ImageLoader$ImageContainer val$response>
						//    4    8:iconst_0        
						//    5    9:invokevirtual   #27  <Method void NetworkImageView$1.onResponse(ImageLoader$ImageContainer, boolean)>
						//    6   12:return          
						}

						final _cls1 this$1;
						final ImageLoader.ImageContainer val$response;

			
			{
				this$1 = final__pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field NetworkImageView$1 this$1>
				response = ImageLoader.ImageContainer.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field ImageLoader$ImageContainer val$response>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
					}
);
			//    5   11:aload_0         
			//    6   12:getfield        #21  <Field NetworkImageView this$0>
			//    7   15:new             #13  <Class NetworkImageView$1$1>
			//    8   18:dup             
			//    9   19:aload_0         
			//   10   20:aload_1         
			//   11   21:invokespecial   #42  <Method void NetworkImageView$1$1(NetworkImageView$1, ImageLoader$ImageContainer)>
			//   12   24:invokevirtual   #46  <Method boolean NetworkImageView.post(Runnable)>
			//   13   27:pop             
					return;
			//   14   28:return          
				}
				if(imagecontainer.getBitmap() != null)
			//*  15   29:aload_1         
			//*  16   30:invokevirtual   #52  <Method android.graphics.Bitmap ImageLoader$ImageContainer.getBitmap()>
			//*  17   33:ifnull          48
				{
					setImageBitmap(imagecontainer.getBitmap());
			//   18   36:aload_0         
			//   19   37:getfield        #21  <Field NetworkImageView this$0>
			//   20   40:aload_1         
			//   21   41:invokevirtual   #52  <Method android.graphics.Bitmap ImageLoader$ImageContainer.getBitmap()>
			//   22   44:invokevirtual   #56  <Method void NetworkImageView.setImageBitmap(android.graphics.Bitmap)>
					return;
			//   23   47:return          
				}
				if(mDefaultImageId != 0)
			//*  24   48:aload_0         
			//*  25   49:getfield        #21  <Field NetworkImageView this$0>
			//*  26   52:invokestatic    #59  <Method int NetworkImageView.access$100(NetworkImageView)>
			//*  27   55:ifeq            72
					setImageResource(mDefaultImageId);
			//   28   58:aload_0         
			//   29   59:getfield        #21  <Field NetworkImageView this$0>
			//   30   62:aload_0         
			//   31   63:getfield        #21  <Field NetworkImageView this$0>
			//   32   66:invokestatic    #59  <Method int NetworkImageView.access$100(NetworkImageView)>
			//   33   69:invokevirtual   #37  <Method void NetworkImageView.setImageResource(int)>
			//   34   72:return          
			}

			final NetworkImageView this$0;
			final boolean val$isInLayoutPass;

			
			{
				this$0 = NetworkImageView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field NetworkImageView this$0>
				isInLayoutPass = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #23  <Field boolean val$isInLayoutPass>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
		}
, j, i, scaletype);
	//  102  204:aload_0         
	//  103  205:aload_0         
	//  104  206:getfield        #105 <Field ImageLoader mImageLoader>
	//  105  209:aload_0         
	//  106  210:getfield        #54  <Field String mUrl>
	//  107  213:new             #6   <Class NetworkImageView$1>
	//  108  216:dup             
	//  109  217:aload_0         
	//  110  218:iload_1         
	//  111  219:invokespecial   #108 <Method void NetworkImageView$1(NetworkImageView, boolean)>
	//  112  222:iload_3         
	//  113  223:iload_2         
	//  114  224:aload           7
	//  115  226:invokevirtual   #114 <Method ImageLoader$ImageContainer ImageLoader.get(String, ImageLoader$ImageListener, int, int, android.widget.ImageView$ScaleType)>
	//  116  229:putfield        #87  <Field ImageLoader$ImageContainer mImageContainer>
	//  117  232:return          
	}

	protected void onDetachedFromWindow()
	{
		if(mImageContainer != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field ImageLoader$ImageContainer mImageContainer>
	//*   2    4:ifnull          24
		{
			mImageContainer.cancelRequest();
	//    3    7:aload_0         
	//    4    8:getfield        #87  <Field ImageLoader$ImageContainer mImageContainer>
	//    5   11:invokevirtual   #92  <Method void ImageLoader$ImageContainer.cancelRequest()>
			setImageBitmap(((android.graphics.Bitmap) (null)));
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:invokevirtual   #44  <Method void setImageBitmap(android.graphics.Bitmap)>
			mImageContainer = null;
	//    9   19:aload_0         
	//   10   20:aconst_null     
	//   11   21:putfield        #87  <Field ImageLoader$ImageContainer mImageContainer>
		}
		super.onDetachedFromWindow();
	//   12   24:aload_0         
	//   13   25:invokespecial   #117 <Method void ImageView.onDetachedFromWindow()>
	//   14   28:return          
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		super.onLayout(flag, i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokespecial   #121 <Method void ImageView.onLayout(boolean, int, int, int, int)>
		loadImageIfNecessary(true);
	//    7   11:aload_0         
	//    8   12:iconst_1        
	//    9   13:invokevirtual   #123 <Method void loadImageIfNecessary(boolean)>
	//   10   16:return          
	}

	public void setDefaultImageResId(int i)
	{
		mDefaultImageId = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #34  <Field int mDefaultImageId>
	//    3    5:return          
	}

	public void setErrorImageResId(int i)
	{
		mErrorImageId = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #31  <Field int mErrorImageId>
	//    3    5:return          
	}

	public void setImageUrl(String s, ImageLoader imageloader)
	{
		mUrl = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field String mUrl>
		mImageLoader = imageloader;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #105 <Field ImageLoader mImageLoader>
		loadImageIfNecessary(false);
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #123 <Method void loadImageIfNecessary(boolean)>
	//    9   15:return          
	}

	private int mDefaultImageId;
	private int mErrorImageId;
	private ImageLoader.ImageContainer mImageContainer;
	private ImageLoader mImageLoader;
	private String mUrl;


/*
	static int access$000(NetworkImageView networkimageview)
	{
		return networkimageview.mErrorImageId;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int mErrorImageId>
	//    2    4:ireturn         
	}

*/


/*
	static int access$100(NetworkImageView networkimageview)
	{
		return networkimageview.mDefaultImageId;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int mDefaultImageId>
	//    2    4:ireturn         
	}

*/
}
