// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.internal.*;

public class ProfilePictureView extends FrameLayout
{
	public static interface OnErrorListener
	{

		public abstract void onError(FacebookException facebookexception);
	}


	public ProfilePictureView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #71  <Method void FrameLayout(Context)>
		queryHeight = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #73  <Field int queryHeight>
		queryWidth = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #75  <Field int queryWidth>
		isCropped = true;
	//    9   15:aload_0         
	//   10   16:iconst_1        
	//   11   17:putfield        #77  <Field boolean isCropped>
		presetSizeType = -1;
	//   12   20:aload_0         
	//   13   21:iconst_m1       
	//   14   22:putfield        #79  <Field int presetSizeType>
		customizedDefaultProfilePicture = null;
	//   15   25:aload_0         
	//   16   26:aconst_null     
	//   17   27:putfield        #81  <Field Bitmap customizedDefaultProfilePicture>
		initialize(context);
	//   18   30:aload_0         
	//   19   31:aload_1         
	//   20   32:invokespecial   #84  <Method void initialize(Context)>
	//   21   35:return          
	}

	public ProfilePictureView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #87  <Method void FrameLayout(Context, AttributeSet)>
		queryHeight = 0;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #73  <Field int queryHeight>
		queryWidth = 0;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #75  <Field int queryWidth>
		isCropped = true;
	//   10   16:aload_0         
	//   11   17:iconst_1        
	//   12   18:putfield        #77  <Field boolean isCropped>
		presetSizeType = -1;
	//   13   21:aload_0         
	//   14   22:iconst_m1       
	//   15   23:putfield        #79  <Field int presetSizeType>
		customizedDefaultProfilePicture = null;
	//   16   26:aload_0         
	//   17   27:aconst_null     
	//   18   28:putfield        #81  <Field Bitmap customizedDefaultProfilePicture>
		initialize(context);
	//   19   31:aload_0         
	//   20   32:aload_1         
	//   21   33:invokespecial   #84  <Method void initialize(Context)>
		parseAttributes(attributeset);
	//   22   36:aload_0         
	//   23   37:aload_2         
	//   24   38:invokespecial   #91  <Method void parseAttributes(AttributeSet)>
	//   25   41:return          
	}

	public ProfilePictureView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #94  <Method void FrameLayout(Context, AttributeSet, int)>
		queryHeight = 0;
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:putfield        #73  <Field int queryHeight>
		queryWidth = 0;
	//    8   12:aload_0         
	//    9   13:iconst_0        
	//   10   14:putfield        #75  <Field int queryWidth>
		isCropped = true;
	//   11   17:aload_0         
	//   12   18:iconst_1        
	//   13   19:putfield        #77  <Field boolean isCropped>
		presetSizeType = -1;
	//   14   22:aload_0         
	//   15   23:iconst_m1       
	//   16   24:putfield        #79  <Field int presetSizeType>
		customizedDefaultProfilePicture = null;
	//   17   27:aload_0         
	//   18   28:aconst_null     
	//   19   29:putfield        #81  <Field Bitmap customizedDefaultProfilePicture>
		initialize(context);
	//   20   32:aload_0         
	//   21   33:aload_1         
	//   22   34:invokespecial   #84  <Method void initialize(Context)>
		parseAttributes(attributeset);
	//   23   37:aload_0         
	//   24   38:aload_2         
	//   25   39:invokespecial   #91  <Method void parseAttributes(AttributeSet)>
	//   26   42:return          
	}

	private int getPresetSizeInPixels(boolean flag)
	{
		int i;
		switch(presetSizeType)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field int presetSizeType>
		{
	//*   2    4:tableswitch     -4 -1: default 36
	//	               -4 65
	//	               -3 58
	//	               -2 51
	//	               -1 38
		default:
			return 0;
	//    3   36:iconst_0        
	//    4   37:ireturn         

		case -1: 
			if(!flag)
	//*   5   38:iload_1         
	//*   6   39:ifne            44
				return 0;
	//    7   42:iconst_0        
	//    8   43:ireturn         
			i = com.facebook.R.dimen.com_facebook_profilepictureview_preset_size_normal;
	//    9   44:getstatic       #107 <Field int com.facebook.R$dimen.com_facebook_profilepictureview_preset_size_normal>
	//   10   47:istore_2        
			break;

	//*  11   48:goto            69
		case -2: 
			i = com.facebook.R.dimen.com_facebook_profilepictureview_preset_size_small;
	//   12   51:getstatic       #110 <Field int com.facebook.R$dimen.com_facebook_profilepictureview_preset_size_small>
	//   13   54:istore_2        
			break;

	//*  14   55:goto            69
		case -3: 
			i = com.facebook.R.dimen.com_facebook_profilepictureview_preset_size_normal;
	//   15   58:getstatic       #107 <Field int com.facebook.R$dimen.com_facebook_profilepictureview_preset_size_normal>
	//   16   61:istore_2        
			break;

	//*  17   62:goto            69
		case -4: 
			i = com.facebook.R.dimen.com_facebook_profilepictureview_preset_size_large;
	//   18   65:getstatic       #113 <Field int com.facebook.R$dimen.com_facebook_profilepictureview_preset_size_large>
	//   19   68:istore_2        
			break;
		}
		return getResources().getDimensionPixelSize(i);
	//   20   69:aload_0         
	//   21   70:invokevirtual   #117 <Method Resources getResources()>
	//   22   73:iload_2         
	//   23   74:invokevirtual   #123 <Method int Resources.getDimensionPixelSize(int)>
	//   24   77:ireturn         
	}

	private void initialize(Context context)
	{
		removeAllViews();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #126 <Method void removeAllViews()>
		image = new ImageView(context);
	//    2    4:aload_0         
	//    3    5:new             #128 <Class ImageView>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #129 <Method void ImageView(Context)>
	//    7   13:putfield        #131 <Field ImageView image>
		context = ((Context) (new android.widget.FrameLayout.LayoutParams(-1, -1)));
	//    8   16:new             #133 <Class android.widget.FrameLayout$LayoutParams>
	//    9   19:dup             
	//   10   20:iconst_m1       
	//   11   21:iconst_m1       
	//   12   22:invokespecial   #136 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   13   25:astore_1        
		image.setLayoutParams(((android.view.ViewGroup.LayoutParams) (context)));
	//   14   26:aload_0         
	//   15   27:getfield        #131 <Field ImageView image>
	//   16   30:aload_1         
	//   17   31:invokevirtual   #140 <Method void ImageView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		image.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
	//   18   34:aload_0         
	//   19   35:getfield        #131 <Field ImageView image>
	//   20   38:getstatic       #146 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER_INSIDE>
	//   21   41:invokevirtual   #150 <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
		addView(((android.view.View) (image)));
	//   22   44:aload_0         
	//   23   45:aload_0         
	//   24   46:getfield        #131 <Field ImageView image>
	//   25   49:invokevirtual   #154 <Method void addView(android.view.View)>
	//   26   52:return          
	}

	private void parseAttributes(AttributeSet attributeset)
	{
		attributeset = ((AttributeSet) (getContext().obtainStyledAttributes(attributeset, com.facebook.R.styleable.com_facebook_profile_picture_view)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #158 <Method Context getContext()>
	//    2    4:aload_1         
	//    3    5:getstatic       #164 <Field int[] com.facebook.R$styleable.com_facebook_profile_picture_view>
	//    4    8:invokevirtual   #170 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//    5   11:astore_1        
		setPresetSize(((TypedArray) (attributeset)).getInt(com.facebook.R.styleable.com_facebook_profile_picture_view_com_facebook_preset_size, -1));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getstatic       #173 <Field int com.facebook.R$styleable.com_facebook_profile_picture_view_com_facebook_preset_size>
	//    9   17:iconst_m1       
	//   10   18:invokevirtual   #179 <Method int TypedArray.getInt(int, int)>
	//   11   21:invokevirtual   #183 <Method void setPresetSize(int)>
		isCropped = ((TypedArray) (attributeset)).getBoolean(com.facebook.R.styleable.com_facebook_profile_picture_view_com_facebook_is_cropped, true);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:getstatic       #186 <Field int com.facebook.R$styleable.com_facebook_profile_picture_view_com_facebook_is_cropped>
	//   15   29:iconst_1        
	//   16   30:invokevirtual   #190 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   17   33:putfield        #77  <Field boolean isCropped>
		((TypedArray) (attributeset)).recycle();
	//   18   36:aload_1         
	//   19   37:invokevirtual   #193 <Method void TypedArray.recycle()>
	//   20   40:return          
	}

	private void processResponse(ImageResponse imageresponse)
	{
		if(imageresponse.getRequest() == lastRequest)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #199 <Method ImageRequest ImageResponse.getRequest()>
	//*   2    4:aload_0         
	//*   3    5:getfield        #201 <Field ImageRequest lastRequest>
	//*   4    8:if_acmpne       119
		{
			lastRequest = null;
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:putfield        #201 <Field ImageRequest lastRequest>
			Object obj = ((Object) (imageresponse.getBitmap()));
	//    8   16:aload_1         
	//    9   17:invokevirtual   #205 <Method Bitmap ImageResponse.getBitmap()>
	//   10   20:astore_3        
			Exception exception = imageresponse.getError();
	//   11   21:aload_1         
	//   12   22:invokevirtual   #209 <Method Exception ImageResponse.getError()>
	//   13   25:astore_2        
			if(exception != null)
	//*  14   26:aload_2         
	//*  15   27:ifnull          98
			{
				imageresponse = ((ImageResponse) (onErrorListener));
	//   16   30:aload_0         
	//   17   31:getfield        #211 <Field ProfilePictureView$OnErrorListener onErrorListener>
	//   18   34:astore_1        
				if(imageresponse != null)
	//*  19   35:aload_1         
	//*  20   36:ifnull          82
				{
					obj = ((Object) (new StringBuilder()));
	//   21   39:new             #213 <Class StringBuilder>
	//   22   42:dup             
	//   23   43:invokespecial   #215 <Method void StringBuilder()>
	//   24   46:astore_3        
					((StringBuilder) (obj)).append("Error in downloading profile picture for profileId: ");
	//   25   47:aload_3         
	//   26   48:ldc1            #217 <String "Error in downloading profile picture for profileId: ">
	//   27   50:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
	//   28   53:pop             
					((StringBuilder) (obj)).append(getProfileId());
	//   29   54:aload_3         
	//   30   55:aload_0         
	//   31   56:invokevirtual   #225 <Method String getProfileId()>
	//   32   59:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
	//   33   62:pop             
					((OnErrorListener) (imageresponse)).onError(new FacebookException(((StringBuilder) (obj)).toString(), ((Throwable) (exception))));
	//   34   63:aload_1         
	//   35   64:new             #227 <Class FacebookException>
	//   36   67:dup             
	//   37   68:aload_3         
	//   38   69:invokevirtual   #230 <Method String StringBuilder.toString()>
	//   39   72:aload_2         
	//   40   73:invokespecial   #233 <Method void FacebookException(String, Throwable)>
	//   41   76:invokeinterface #237 <Method void ProfilePictureView$OnErrorListener.onError(FacebookException)>
					return;
	//   42   81:return          
				} else
				{
					Logger.log(LoggingBehavior.REQUESTS, 6, TAG, exception.toString());
	//   43   82:getstatic       #243 <Field LoggingBehavior LoggingBehavior.REQUESTS>
	//   44   85:bipush          6
	//   45   87:getstatic       #245 <Field String TAG>
	//   46   90:aload_2         
	//   47   91:invokevirtual   #248 <Method String Exception.toString()>
	//   48   94:invokestatic    #254 <Method void Logger.log(LoggingBehavior, int, String, String)>
					return;
	//   49   97:return          
				}
			}
			if(obj != null)
	//*  50   98:aload_3         
	//*  51   99:ifnull          119
			{
				setImageBitmap(((Bitmap) (obj)));
	//   52  102:aload_0         
	//   53  103:aload_3         
	//   54  104:invokespecial   #258 <Method void setImageBitmap(Bitmap)>
				if(imageresponse.isCachedRedirect())
	//*  55  107:aload_1         
	//*  56  108:invokevirtual   #262 <Method boolean ImageResponse.isCachedRedirect()>
	//*  57  111:ifeq            119
					sendImageRequest(false);
	//   58  114:aload_0         
	//   59  115:iconst_0        
	//   60  116:invokespecial   #266 <Method void sendImageRequest(boolean)>
			}
		}
	//   61  119:return          
	}

	private void refreshImage(boolean flag)
	{
		boolean flag1 = updateImageQueryParameters();
	//    0    0:aload_0         
	//    1    1:invokespecial   #270 <Method boolean updateImageQueryParameters()>
	//    2    4:istore_2        
		if(profileId != null && profileId.length() != 0 && (queryWidth != 0 || queryHeight != 0))
	//*   3    5:aload_0         
	//*   4    6:getfield        #272 <Field String profileId>
	//*   5    9:ifnull          53
	//*   6   12:aload_0         
	//*   7   13:getfield        #272 <Field String profileId>
	//*   8   16:invokevirtual   #278 <Method int String.length()>
	//*   9   19:ifeq            53
	//*  10   22:aload_0         
	//*  11   23:getfield        #75  <Field int queryWidth>
	//*  12   26:ifne            39
	//*  13   29:aload_0         
	//*  14   30:getfield        #73  <Field int queryHeight>
	//*  15   33:ifne            39
	//*  16   36:goto            53
		{
			if(flag1 || flag)
	//*  17   39:iload_2         
	//*  18   40:ifne            47
	//*  19   43:iload_1         
	//*  20   44:ifeq            57
			{
				sendImageRequest(true);
	//   21   47:aload_0         
	//   22   48:iconst_1        
	//   23   49:invokespecial   #266 <Method void sendImageRequest(boolean)>
				return;
	//   24   52:return          
			}
		} else
		{
			setBlankProfilePicture();
	//   25   53:aload_0         
	//   26   54:invokespecial   #281 <Method void setBlankProfilePicture()>
		}
	//   27   57:return          
	}

	private void sendImageRequest(boolean flag)
	{
		ImageRequest imagerequest = (new com.facebook.internal.ImageRequest.Builder(getContext(), ImageRequest.getProfilePictureUri(profileId, queryWidth, queryHeight))).setAllowCachedRedirects(flag).setCallerTag(((Object) (this))).setCallback(new com.facebook.internal.ImageRequest.Callback() {

			public void onCompleted(ImageResponse imageresponse)
			{
				processResponse(imageresponse);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field ProfilePictureView this$0>
			//    2    4:aload_1         
			//    3    5:invokestatic    #27  <Method void ProfilePictureView.access$000(ProfilePictureView, ImageResponse)>
			//    4    8:return          
			}

			final ProfilePictureView this$0;

			
			{
				this$0 = ProfilePictureView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ProfilePictureView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
).build();
	//    0    0:new             #283 <Class com.facebook.internal.ImageRequest$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #158 <Method Context getContext()>
	//    4    8:aload_0         
	//    5    9:getfield        #272 <Field String profileId>
	//    6   12:aload_0         
	//    7   13:getfield        #75  <Field int queryWidth>
	//    8   16:aload_0         
	//    9   17:getfield        #73  <Field int queryHeight>
	//   10   20:invokestatic    #289 <Method android.net.Uri ImageRequest.getProfilePictureUri(String, int, int)>
	//   11   23:invokespecial   #292 <Method void com.facebook.internal.ImageRequest$Builder(Context, android.net.Uri)>
	//   12   26:iload_1         
	//   13   27:invokevirtual   #296 <Method com.facebook.internal.ImageRequest$Builder com.facebook.internal.ImageRequest$Builder.setAllowCachedRedirects(boolean)>
	//   14   30:aload_0         
	//   15   31:invokevirtual   #300 <Method com.facebook.internal.ImageRequest$Builder com.facebook.internal.ImageRequest$Builder.setCallerTag(Object)>
	//   16   34:new             #6   <Class ProfilePictureView$1>
	//   17   37:dup             
	//   18   38:aload_0         
	//   19   39:invokespecial   #303 <Method void ProfilePictureView$1(ProfilePictureView)>
	//   20   42:invokevirtual   #307 <Method com.facebook.internal.ImageRequest$Builder com.facebook.internal.ImageRequest$Builder.setCallback(com.facebook.internal.ImageRequest$Callback)>
	//   21   45:invokevirtual   #310 <Method ImageRequest com.facebook.internal.ImageRequest$Builder.build()>
	//   22   48:astore_2        
		if(lastRequest != null)
	//*  23   49:aload_0         
	//*  24   50:getfield        #201 <Field ImageRequest lastRequest>
	//*  25   53:ifnull          64
			ImageDownloader.cancelRequest(lastRequest);
	//   26   56:aload_0         
	//   27   57:getfield        #201 <Field ImageRequest lastRequest>
	//   28   60:invokestatic    #316 <Method boolean ImageDownloader.cancelRequest(ImageRequest)>
	//   29   63:pop             
		lastRequest = imagerequest;
	//   30   64:aload_0         
	//   31   65:aload_2         
	//   32   66:putfield        #201 <Field ImageRequest lastRequest>
		ImageDownloader.downloadAsync(imagerequest);
	//   33   69:aload_2         
	//   34   70:invokestatic    #320 <Method void ImageDownloader.downloadAsync(ImageRequest)>
	//   35   73:return          
	}

	private void setBlankProfilePicture()
	{
		if(lastRequest != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #201 <Field ImageRequest lastRequest>
	//*   2    4:ifnull          15
			ImageDownloader.cancelRequest(lastRequest);
	//    3    7:aload_0         
	//    4    8:getfield        #201 <Field ImageRequest lastRequest>
	//    5   11:invokestatic    #316 <Method boolean ImageDownloader.cancelRequest(ImageRequest)>
	//    6   14:pop             
		if(customizedDefaultProfilePicture == null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #81  <Field Bitmap customizedDefaultProfilePicture>
	//*   9   19:ifnonnull       53
		{
			int i;
			if(isCropped())
	//*  10   22:aload_0         
	//*  11   23:invokevirtual   #322 <Method boolean isCropped()>
	//*  12   26:ifeq            36
				i = com.facebook.R.drawable.com_facebook_profile_picture_blank_square;
	//   13   29:getstatic       #327 <Field int com.facebook.R$drawable.com_facebook_profile_picture_blank_square>
	//   14   32:istore_1        
			else
	//*  15   33:goto            40
				i = com.facebook.R.drawable.com_facebook_profile_picture_blank_portrait;
	//   16   36:getstatic       #330 <Field int com.facebook.R$drawable.com_facebook_profile_picture_blank_portrait>
	//   17   39:istore_1        
			setImageBitmap(BitmapFactory.decodeResource(getResources(), i));
	//   18   40:aload_0         
	//   19   41:aload_0         
	//   20   42:invokevirtual   #117 <Method Resources getResources()>
	//   21   45:iload_1         
	//   22   46:invokestatic    #336 <Method Bitmap BitmapFactory.decodeResource(Resources, int)>
	//   23   49:invokespecial   #258 <Method void setImageBitmap(Bitmap)>
			return;
	//   24   52:return          
		} else
		{
			updateImageQueryParameters();
	//   25   53:aload_0         
	//   26   54:invokespecial   #270 <Method boolean updateImageQueryParameters()>
	//   27   57:pop             
			setImageBitmap(Bitmap.createScaledBitmap(customizedDefaultProfilePicture, queryWidth, queryHeight, false));
	//   28   58:aload_0         
	//   29   59:aload_0         
	//   30   60:getfield        #81  <Field Bitmap customizedDefaultProfilePicture>
	//   31   63:aload_0         
	//   32   64:getfield        #75  <Field int queryWidth>
	//   33   67:aload_0         
	//   34   68:getfield        #73  <Field int queryHeight>
	//   35   71:iconst_0        
	//   36   72:invokestatic    #342 <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
	//   37   75:invokespecial   #258 <Method void setImageBitmap(Bitmap)>
			return;
	//   38   78:return          
		}
	}

	private void setImageBitmap(Bitmap bitmap)
	{
		if(image != null && bitmap != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field ImageView image>
	//*   2    4:ifnull          24
	//*   3    7:aload_1         
	//*   4    8:ifnull          24
		{
			imageContents = bitmap;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #344 <Field Bitmap imageContents>
			image.setImageBitmap(bitmap);
	//    8   16:aload_0         
	//    9   17:getfield        #131 <Field ImageView image>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #345 <Method void ImageView.setImageBitmap(Bitmap)>
		}
	//   12   24:return          
	}

	private boolean updateImageQueryParameters()
	{
		int i = getHeight();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #348 <Method int getHeight()>
	//    2    4:istore_1        
		int j = getWidth();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #351 <Method int getWidth()>
	//    5    9:istore_2        
		boolean flag1 = true;
	//    6   10:iconst_1        
	//    7   11:istore          5
		if(j >= 1)
	//*   8   13:iload_2         
	//*   9   14:iconst_1        
	//*  10   15:icmplt          118
		{
			if(i < 1)
	//*  11   18:iload_1         
	//*  12   19:iconst_1        
	//*  13   20:icmpge          25
				return false;
	//   14   23:iconst_0        
	//   15   24:ireturn         
			int k = getPresetSizeInPixels(false);
	//   16   25:aload_0         
	//   17   26:iconst_0        
	//   18   27:invokespecial   #353 <Method int getPresetSizeInPixels(boolean)>
	//   19   30:istore_3        
			if(k != 0)
	//*  20   31:iload_3         
	//*  21   32:ifeq            39
			{
				i = k;
	//   22   35:iload_3         
	//   23   36:istore_1        
				j = i;
	//   24   37:iload_1         
	//   25   38:istore_2        
			}
			if(j <= i)
	//*  26   39:iload_2         
	//*  27   40:iload_1         
	//*  28   41:icmpgt          61
			{
				if(isCropped())
	//*  29   44:aload_0         
	//*  30   45:invokevirtual   #322 <Method boolean isCropped()>
	//*  31   48:ifeq            56
					i = j;
	//   32   51:iload_2         
	//   33   52:istore_1        
				else
	//*  34   53:goto            75
					i = 0;
	//   35   56:iconst_0        
	//   36   57:istore_1        
			} else
	//*  37   58:goto            75
			if(isCropped())
	//*  38   61:aload_0         
	//*  39   62:invokevirtual   #322 <Method boolean isCropped()>
	//*  40   65:ifeq            73
				j = i;
	//   41   68:iload_1         
	//   42   69:istore_2        
			else
	//*  43   70:goto            75
				j = 0;
	//   44   73:iconst_0        
	//   45   74:istore_2        
			boolean flag = flag1;
	//   46   75:iload           5
	//   47   77:istore          4
			if(j == queryWidth)
	//*  48   79:iload_2         
	//*  49   80:aload_0         
	//*  50   81:getfield        #75  <Field int queryWidth>
	//*  51   84:icmpne          105
				if(i != queryHeight)
	//*  52   87:iload_1         
	//*  53   88:aload_0         
	//*  54   89:getfield        #73  <Field int queryHeight>
	//*  55   92:icmpeq          102
					flag = flag1;
	//   56   95:iload           5
	//   57   97:istore          4
				else
	//*  58   99:goto            105
					flag = false;
	//   59  102:iconst_0        
	//   60  103:istore          4
			queryWidth = j;
	//   61  105:aload_0         
	//   62  106:iload_2         
	//   63  107:putfield        #75  <Field int queryWidth>
			queryHeight = i;
	//   64  110:aload_0         
	//   65  111:iload_1         
	//   66  112:putfield        #73  <Field int queryHeight>
			return flag;
	//   67  115:iload           4
	//   68  117:ireturn         
		} else
		{
			return false;
	//   69  118:iconst_0        
	//   70  119:ireturn         
		}
	}

	public final OnErrorListener getOnErrorListener()
	{
		return onErrorListener;
	//    0    0:aload_0         
	//    1    1:getfield        #211 <Field ProfilePictureView$OnErrorListener onErrorListener>
	//    2    4:areturn         
	}

	public final int getPresetSize()
	{
		return presetSizeType;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field int presetSizeType>
	//    2    4:ireturn         
	}

	public final String getProfileId()
	{
		return profileId;
	//    0    0:aload_0         
	//    1    1:getfield        #272 <Field String profileId>
	//    2    4:areturn         
	}

	public final boolean isCropped()
	{
		return isCropped;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field boolean isCropped>
	//    2    4:ireturn         
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #359 <Method void FrameLayout.onDetachedFromWindow()>
		lastRequest = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #201 <Field ImageRequest lastRequest>
	//    5    9:return          
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
	//    6    8:invokespecial   #363 <Method void FrameLayout.onLayout(boolean, int, int, int, int)>
		refreshImage(false);
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:invokespecial   #365 <Method void refreshImage(boolean)>
	//   10   16:return          
	}

	protected void onMeasure(int i, int j)
	{
		android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #370 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//    2    4:astore          9
		int k = android.view.View.MeasureSpec.getSize(j);
	//    3    6:iload_2         
	//    4    7:invokestatic    #375 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    5   10:istore_3        
		int l1 = android.view.View.MeasureSpec.getSize(i);
	//    6   11:iload_1         
	//    7   12:invokestatic    #375 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    8   15:istore          8
		int l;
		if(android.view.View.MeasureSpec.getMode(j) != 0x40000000 && layoutparams.height == -2)
	//*   9   17:iload_2         
	//*  10   18:invokestatic    #378 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*  11   21:ldc2            #379 <Int 0x40000000>
	//*  12   24:icmpeq          57
	//*  13   27:aload           9
	//*  14   29:getfield        #384 <Field int android.view.ViewGroup$LayoutParams.height>
	//*  15   32:bipush          -2
	//*  16   34:icmpne          57
		{
			k = getPresetSizeInPixels(true);
	//   17   37:aload_0         
	//   18   38:iconst_1        
	//   19   39:invokespecial   #353 <Method int getPresetSizeInPixels(boolean)>
	//   20   42:istore_3        
			l = android.view.View.MeasureSpec.makeMeasureSpec(k, 0x40000000);
	//   21   43:iload_3         
	//   22   44:ldc2            #379 <Int 0x40000000>
	//   23   47:invokestatic    #387 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   24   50:istore          4
			j = 1;
	//   25   52:iconst_1        
	//   26   53:istore_2        
		} else
	//*  27   54:goto            66
		{
			boolean flag = false;
	//   28   57:iconst_0        
	//   29   58:istore          5
			l = j;
	//   30   60:iload_2         
	//   31   61:istore          4
			j = ((int) (flag));
	//   32   63:iload           5
	//   33   65:istore_2        
		}
		int k1 = l1;
	//   34   66:iload           8
	//   35   68:istore          7
		int j1 = j;
	//   36   70:iload_2         
	//   37   71:istore          6
		int i1 = i;
	//   38   73:iload_1         
	//   39   74:istore          5
		if(android.view.View.MeasureSpec.getMode(i) != 0x40000000)
	//*  40   76:iload_1         
	//*  41   77:invokestatic    #378 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*  42   80:ldc2            #379 <Int 0x40000000>
	//*  43   83:icmpeq          126
		{
			k1 = l1;
	//   44   86:iload           8
	//   45   88:istore          7
			j1 = j;
	//   46   90:iload_2         
	//   47   91:istore          6
			i1 = i;
	//   48   93:iload_1         
	//   49   94:istore          5
			if(layoutparams.width == -2)
	//*  50   96:aload           9
	//*  51   98:getfield        #390 <Field int android.view.ViewGroup$LayoutParams.width>
	//*  52  101:bipush          -2
	//*  53  103:icmpne          126
			{
				k1 = getPresetSizeInPixels(true);
	//   54  106:aload_0         
	//   55  107:iconst_1        
	//   56  108:invokespecial   #353 <Method int getPresetSizeInPixels(boolean)>
	//   57  111:istore          7
				i1 = android.view.View.MeasureSpec.makeMeasureSpec(k1, 0x40000000);
	//   58  113:iload           7
	//   59  115:ldc2            #379 <Int 0x40000000>
	//   60  118:invokestatic    #387 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   61  121:istore          5
				j1 = 1;
	//   62  123:iconst_1        
	//   63  124:istore          6
			}
		}
		if(j1 != 0)
	//*  64  126:iload           6
	//*  65  128:ifeq            147
		{
			setMeasuredDimension(k1, k);
	//   66  131:aload_0         
	//   67  132:iload           7
	//   68  134:iload_3         
	//   69  135:invokevirtual   #393 <Method void setMeasuredDimension(int, int)>
			measureChildren(i1, l);
	//   70  138:aload_0         
	//   71  139:iload           5
	//   72  141:iload           4
	//   73  143:invokevirtual   #396 <Method void measureChildren(int, int)>
			return;
	//   74  146:return          
		} else
		{
			super.onMeasure(i1, l);
	//   75  147:aload_0         
	//   76  148:iload           5
	//   77  150:iload           4
	//   78  152:invokespecial   #398 <Method void FrameLayout.onMeasure(int, int)>
			return;
	//   79  155:return          
		}
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(((Object) (parcelable)).getClass() != android/os/Bundle)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #406 <Method Class Object.getClass()>
	//*   2    4:ldc2            #408 <Class Bundle>
	//*   3    7:if_acmpeq       16
		{
			super.onRestoreInstanceState(parcelable);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:invokespecial   #410 <Method void FrameLayout.onRestoreInstanceState(Parcelable)>
			return;
	//    7   15:return          
		}
		parcelable = ((Parcelable) ((Bundle)parcelable));
	//    8   16:aload_1         
	//    9   17:checkcast       #408 <Class Bundle>
	//   10   20:astore_1        
		super.onRestoreInstanceState(((Bundle) (parcelable)).getParcelable("ProfilePictureView_superState"));
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:ldc1            #47  <String "ProfilePictureView_superState">
	//   14   25:invokevirtual   #414 <Method Parcelable Bundle.getParcelable(String)>
	//   15   28:invokespecial   #410 <Method void FrameLayout.onRestoreInstanceState(Parcelable)>
		profileId = ((Bundle) (parcelable)).getString("ProfilePictureView_profileId");
	//   16   31:aload_0         
	//   17   32:aload_1         
	//   18   33:ldc1            #42  <String "ProfilePictureView_profileId">
	//   19   35:invokevirtual   #418 <Method String Bundle.getString(String)>
	//   20   38:putfield        #272 <Field String profileId>
		presetSizeType = ((Bundle) (parcelable)).getInt("ProfilePictureView_presetSize");
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:ldc1            #39  <String "ProfilePictureView_presetSize">
	//   24   45:invokevirtual   #421 <Method int Bundle.getInt(String)>
	//   25   48:putfield        #79  <Field int presetSizeType>
		isCropped = ((Bundle) (parcelable)).getBoolean("ProfilePictureView_isCropped");
	//   26   51:aload_0         
	//   27   52:aload_1         
	//   28   53:ldc1            #28  <String "ProfilePictureView_isCropped">
	//   29   55:invokevirtual   #424 <Method boolean Bundle.getBoolean(String)>
	//   30   58:putfield        #77  <Field boolean isCropped>
		queryWidth = ((Bundle) (parcelable)).getInt("ProfilePictureView_width");
	//   31   61:aload_0         
	//   32   62:aload_1         
	//   33   63:ldc1            #19  <String "ProfilePictureView_width">
	//   34   65:invokevirtual   #421 <Method int Bundle.getInt(String)>
	//   35   68:putfield        #75  <Field int queryWidth>
		queryHeight = ((Bundle) (parcelable)).getInt("ProfilePictureView_height");
	//   36   71:aload_0         
	//   37   72:aload_1         
	//   38   73:ldc1            #13  <String "ProfilePictureView_height">
	//   39   75:invokevirtual   #421 <Method int Bundle.getInt(String)>
	//   40   78:putfield        #73  <Field int queryHeight>
		setImageBitmap((Bitmap)((Bundle) (parcelable)).getParcelable("ProfilePictureView_bitmap"));
	//   41   81:aload_0         
	//   42   82:aload_1         
	//   43   83:ldc1            #16  <String "ProfilePictureView_bitmap">
	//   44   85:invokevirtual   #414 <Method Parcelable Bundle.getParcelable(String)>
	//   45   88:checkcast       #338 <Class Bitmap>
	//   46   91:invokespecial   #258 <Method void setImageBitmap(Bitmap)>
		if(((Bundle) (parcelable)).getBoolean("ProfilePictureView_refresh"))
	//*  47   94:aload_1         
	//*  48   95:ldc1            #36  <String "ProfilePictureView_refresh">
	//*  49   97:invokevirtual   #424 <Method boolean Bundle.getBoolean(String)>
	//*  50  100:ifeq            108
			refreshImage(true);
	//   51  103:aload_0         
	//   52  104:iconst_1        
	//   53  105:invokespecial   #365 <Method void refreshImage(boolean)>
	//   54  108:return          
	}

	protected Parcelable onSaveInstanceState()
	{
		Parcelable parcelable = super.onSaveInstanceState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #428 <Method Parcelable FrameLayout.onSaveInstanceState()>
	//    2    4:astore_2        
		Bundle bundle = new Bundle();
	//    3    5:new             #408 <Class Bundle>
	//    4    8:dup             
	//    5    9:invokespecial   #429 <Method void Bundle()>
	//    6   12:astore_3        
		bundle.putParcelable("ProfilePictureView_superState", parcelable);
	//    7   13:aload_3         
	//    8   14:ldc1            #47  <String "ProfilePictureView_superState">
	//    9   16:aload_2         
	//   10   17:invokevirtual   #433 <Method void Bundle.putParcelable(String, Parcelable)>
		bundle.putString("ProfilePictureView_profileId", profileId);
	//   11   20:aload_3         
	//   12   21:ldc1            #42  <String "ProfilePictureView_profileId">
	//   13   23:aload_0         
	//   14   24:getfield        #272 <Field String profileId>
	//   15   27:invokevirtual   #437 <Method void Bundle.putString(String, String)>
		bundle.putInt("ProfilePictureView_presetSize", presetSizeType);
	//   16   30:aload_3         
	//   17   31:ldc1            #39  <String "ProfilePictureView_presetSize">
	//   18   33:aload_0         
	//   19   34:getfield        #79  <Field int presetSizeType>
	//   20   37:invokevirtual   #441 <Method void Bundle.putInt(String, int)>
		bundle.putBoolean("ProfilePictureView_isCropped", isCropped);
	//   21   40:aload_3         
	//   22   41:ldc1            #28  <String "ProfilePictureView_isCropped">
	//   23   43:aload_0         
	//   24   44:getfield        #77  <Field boolean isCropped>
	//   25   47:invokevirtual   #445 <Method void Bundle.putBoolean(String, boolean)>
		bundle.putParcelable("ProfilePictureView_bitmap", ((Parcelable) (imageContents)));
	//   26   50:aload_3         
	//   27   51:ldc1            #16  <String "ProfilePictureView_bitmap">
	//   28   53:aload_0         
	//   29   54:getfield        #344 <Field Bitmap imageContents>
	//   30   57:invokevirtual   #433 <Method void Bundle.putParcelable(String, Parcelable)>
		bundle.putInt("ProfilePictureView_width", queryWidth);
	//   31   60:aload_3         
	//   32   61:ldc1            #19  <String "ProfilePictureView_width">
	//   33   63:aload_0         
	//   34   64:getfield        #75  <Field int queryWidth>
	//   35   67:invokevirtual   #441 <Method void Bundle.putInt(String, int)>
		bundle.putInt("ProfilePictureView_height", queryHeight);
	//   36   70:aload_3         
	//   37   71:ldc1            #13  <String "ProfilePictureView_height">
	//   38   73:aload_0         
	//   39   74:getfield        #73  <Field int queryHeight>
	//   40   77:invokevirtual   #441 <Method void Bundle.putInt(String, int)>
		boolean flag;
		if(lastRequest != null)
	//*  41   80:aload_0         
	//*  42   81:getfield        #201 <Field ImageRequest lastRequest>
	//*  43   84:ifnull          92
			flag = true;
	//   44   87:iconst_1        
	//   45   88:istore_1        
		else
	//*  46   89:goto            94
			flag = false;
	//   47   92:iconst_0        
	//   48   93:istore_1        
		bundle.putBoolean("ProfilePictureView_refresh", flag);
	//   49   94:aload_3         
	//   50   95:ldc1            #36  <String "ProfilePictureView_refresh">
	//   51   97:iload_1         
	//   52   98:invokevirtual   #445 <Method void Bundle.putBoolean(String, boolean)>
		return ((Parcelable) (bundle));
	//   53  101:aload_3         
	//   54  102:areturn         
	}

	public final void setCropped(boolean flag)
	{
		isCropped = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #77  <Field boolean isCropped>
		refreshImage(false);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokespecial   #365 <Method void refreshImage(boolean)>
	//    6   10:return          
	}

	public final void setDefaultProfilePicture(Bitmap bitmap)
	{
		customizedDefaultProfilePicture = bitmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #81  <Field Bitmap customizedDefaultProfilePicture>
	//    3    5:return          
	}

	public final void setOnErrorListener(OnErrorListener onerrorlistener)
	{
		onErrorListener = onerrorlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #211 <Field ProfilePictureView$OnErrorListener onErrorListener>
	//    3    5:return          
	}

	public final void setPresetSize(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     -4 -1: default 32
	//	               -4 43
	//	               -3 43
	//	               -2 43
	//	               -1 43
		default:
			throw new IllegalArgumentException("Must use a predefined preset size");
	//    2   32:new             #451 <Class IllegalArgumentException>
	//    3   35:dup             
	//    4   36:ldc2            #453 <String "Must use a predefined preset size">
	//    5   39:invokespecial   #456 <Method void IllegalArgumentException(String)>
	//    6   42:athrow          

		case -4: 
		case -3: 
		case -2: 
		case -1: 
			presetSizeType = i;
	//    7   43:aload_0         
	//    8   44:iload_1         
	//    9   45:putfield        #79  <Field int presetSizeType>
			break;
		}
		requestLayout();
	//   10   48:aload_0         
	//   11   49:invokevirtual   #459 <Method void requestLayout()>
	//   12   52:return          
	}

	public final void setProfileId(String s)
	{
		boolean flag;
		if(!Utility.isNullOrEmpty(profileId) && profileId.equalsIgnoreCase(s))
	//*   0    0:aload_0         
	//*   1    1:getfield        #272 <Field String profileId>
	//*   2    4:invokestatic    #465 <Method boolean Utility.isNullOrEmpty(String)>
	//*   3    7:ifne            29
	//*   4   10:aload_0         
	//*   5   11:getfield        #272 <Field String profileId>
	//*   6   14:aload_1         
	//*   7   15:invokevirtual   #468 <Method boolean String.equalsIgnoreCase(String)>
	//*   8   18:ifne            24
	//*   9   21:goto            29
		{
			flag = false;
	//   10   24:iconst_0        
	//   11   25:istore_2        
		} else
	//*  12   26:goto            35
		{
			setBlankProfilePicture();
	//   13   29:aload_0         
	//   14   30:invokespecial   #281 <Method void setBlankProfilePicture()>
			flag = true;
	//   15   33:iconst_1        
	//   16   34:istore_2        
		}
		profileId = s;
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:putfield        #272 <Field String profileId>
		refreshImage(flag);
	//   20   40:aload_0         
	//   21   41:iload_2         
	//   22   42:invokespecial   #365 <Method void refreshImage(boolean)>
	//   23   45:return          
	}

	private static final String BITMAP_HEIGHT_KEY = "ProfilePictureView_height";
	private static final String BITMAP_KEY = "ProfilePictureView_bitmap";
	private static final String BITMAP_WIDTH_KEY = "ProfilePictureView_width";
	public static final int CUSTOM = -1;
	private static final boolean IS_CROPPED_DEFAULT_VALUE = true;
	private static final String IS_CROPPED_KEY = "ProfilePictureView_isCropped";
	public static final int LARGE = -4;
	private static final int MIN_SIZE = 1;
	public static final int NORMAL = -3;
	private static final String PENDING_REFRESH_KEY = "ProfilePictureView_refresh";
	private static final String PRESET_SIZE_KEY = "ProfilePictureView_presetSize";
	private static final String PROFILE_ID_KEY = "ProfilePictureView_profileId";
	public static final int SMALL = -2;
	private static final String SUPER_STATE_KEY = "ProfilePictureView_superState";
	public static final String TAG = "ProfilePictureView";
	private Bitmap customizedDefaultProfilePicture;
	private ImageView image;
	private Bitmap imageContents;
	private boolean isCropped;
	private ImageRequest lastRequest;
	private OnErrorListener onErrorListener;
	private int presetSizeType;
	private String profileId;
	private int queryHeight;
	private int queryWidth;

	static 
	{
	//    0    0:return          
	}


/*
	static void access$000(ProfilePictureView profilepictureview, ImageResponse imageresponse)
	{
		profilepictureview.processResponse(imageresponse);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #100 <Method void processResponse(ImageResponse)>
		return;
	//    3    5:return          
	}

*/
}
