// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login.widget;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.internal.*;
import com.newrelic.agent.android.instrumentation.BitmapFactoryInstrumentation;

public class ProfilePictureView extends FrameLayout
{
	public static interface OnErrorListener
	{

		public abstract void onError(FacebookException facebookexception);
	}


	private int getPresetSizeInPixels(boolean flag)
	{
		int i;
		switch(presetSizeType)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field int presetSizeType>
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
			i = com.facebook.login.R.dimen.com_facebook_profilepictureview_preset_size_normal;
	//    9   44:getstatic       #48  <Field int com.facebook.login.R$dimen.com_facebook_profilepictureview_preset_size_normal>
	//   10   47:istore_2        
			break;

	//*  11   48:goto            69
		case -2: 
			i = com.facebook.login.R.dimen.com_facebook_profilepictureview_preset_size_small;
	//   12   51:getstatic       #51  <Field int com.facebook.login.R$dimen.com_facebook_profilepictureview_preset_size_small>
	//   13   54:istore_2        
			break;

	//*  14   55:goto            69
		case -3: 
			i = com.facebook.login.R.dimen.com_facebook_profilepictureview_preset_size_normal;
	//   15   58:getstatic       #48  <Field int com.facebook.login.R$dimen.com_facebook_profilepictureview_preset_size_normal>
	//   16   61:istore_2        
			break;

	//*  17   62:goto            69
		case -4: 
			i = com.facebook.login.R.dimen.com_facebook_profilepictureview_preset_size_large;
	//   18   65:getstatic       #54  <Field int com.facebook.login.R$dimen.com_facebook_profilepictureview_preset_size_large>
	//   19   68:istore_2        
			break;
		}
		return getResources().getDimensionPixelSize(i);
	//   20   69:aload_0         
	//   21   70:invokevirtual   #58  <Method Resources getResources()>
	//   22   73:iload_2         
	//   23   74:invokevirtual   #64  <Method int Resources.getDimensionPixelSize(int)>
	//   24   77:ireturn         
	}

	private void processResponse(ImageResponse imageresponse)
	{
		if(imageresponse.getRequest() == lastRequest)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #70  <Method ImageRequest ImageResponse.getRequest()>
	//*   2    4:aload_0         
	//*   3    5:getfield        #72  <Field ImageRequest lastRequest>
	//*   4    8:if_acmpne       119
		{
			lastRequest = null;
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:putfield        #72  <Field ImageRequest lastRequest>
			Object obj = ((Object) (imageresponse.getBitmap()));
	//    8   16:aload_1         
	//    9   17:invokevirtual   #76  <Method Bitmap ImageResponse.getBitmap()>
	//   10   20:astore_3        
			Exception exception = imageresponse.getError();
	//   11   21:aload_1         
	//   12   22:invokevirtual   #80  <Method Exception ImageResponse.getError()>
	//   13   25:astore_2        
			if(exception != null)
	//*  14   26:aload_2         
	//*  15   27:ifnull          98
			{
				imageresponse = ((ImageResponse) (onErrorListener));
	//   16   30:aload_0         
	//   17   31:getfield        #82  <Field ProfilePictureView$OnErrorListener onErrorListener>
	//   18   34:astore_1        
				if(imageresponse != null)
	//*  19   35:aload_1         
	//*  20   36:ifnull          82
				{
					obj = ((Object) (new StringBuilder()));
	//   21   39:new             #84  <Class StringBuilder>
	//   22   42:dup             
	//   23   43:invokespecial   #87  <Method void StringBuilder()>
	//   24   46:astore_3        
					((StringBuilder) (obj)).append("Error in downloading profile picture for profileId: ");
	//   25   47:aload_3         
	//   26   48:ldc1            #89  <String "Error in downloading profile picture for profileId: ">
	//   27   50:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   28   53:pop             
					((StringBuilder) (obj)).append(getProfileId());
	//   29   54:aload_3         
	//   30   55:aload_0         
	//   31   56:invokevirtual   #97  <Method String getProfileId()>
	//   32   59:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   33   62:pop             
					((OnErrorListener) (imageresponse)).onError(new FacebookException(((StringBuilder) (obj)).toString(), ((Throwable) (exception))));
	//   34   63:aload_1         
	//   35   64:new             #99  <Class FacebookException>
	//   36   67:dup             
	//   37   68:aload_3         
	//   38   69:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   39   72:aload_2         
	//   40   73:invokespecial   #105 <Method void FacebookException(String, Throwable)>
	//   41   76:invokeinterface #109 <Method void ProfilePictureView$OnErrorListener.onError(FacebookException)>
					return;
	//   42   81:return          
				} else
				{
					Logger.log(LoggingBehavior.REQUESTS, 6, TAG, exception.toString());
	//   43   82:getstatic       #115 <Field LoggingBehavior LoggingBehavior.REQUESTS>
	//   44   85:bipush          6
	//   45   87:getstatic       #117 <Field String TAG>
	//   46   90:aload_2         
	//   47   91:invokevirtual   #120 <Method String Exception.toString()>
	//   48   94:invokestatic    #126 <Method void Logger.log(LoggingBehavior, int, String, String)>
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
	//   54  104:invokespecial   #130 <Method void setImageBitmap(Bitmap)>
				if(imageresponse.isCachedRedirect())
	//*  55  107:aload_1         
	//*  56  108:invokevirtual   #134 <Method boolean ImageResponse.isCachedRedirect()>
	//*  57  111:ifeq            119
					sendImageRequest(false);
	//   58  114:aload_0         
	//   59  115:iconst_0        
	//   60  116:invokespecial   #138 <Method void sendImageRequest(boolean)>
			}
		}
	//   61  119:return          
	}

	private void refreshImage(boolean flag)
	{
		boolean flag1 = updateImageQueryParameters();
	//    0    0:aload_0         
	//    1    1:invokespecial   #142 <Method boolean updateImageQueryParameters()>
	//    2    4:istore_2        
		String s = profileId;
	//    3    5:aload_0         
	//    4    6:getfield        #144 <Field String profileId>
	//    5    9:astore_3        
		if(s != null && s.length() != 0 && (queryWidth != 0 || queryHeight != 0))
	//*   6   10:aload_3         
	//*   7   11:ifnull          52
	//*   8   14:aload_3         
	//*   9   15:invokevirtual   #150 <Method int String.length()>
	//*  10   18:ifeq            52
	//*  11   21:aload_0         
	//*  12   22:getfield        #152 <Field int queryWidth>
	//*  13   25:ifne            38
	//*  14   28:aload_0         
	//*  15   29:getfield        #154 <Field int queryHeight>
	//*  16   32:ifne            38
	//*  17   35:goto            52
		{
			if(flag1 || flag)
	//*  18   38:iload_2         
	//*  19   39:ifne            46
	//*  20   42:iload_1         
	//*  21   43:ifeq            56
			{
				sendImageRequest(true);
	//   22   46:aload_0         
	//   23   47:iconst_1        
	//   24   48:invokespecial   #138 <Method void sendImageRequest(boolean)>
				return;
	//   25   51:return          
			}
		} else
		{
			setBlankProfilePicture();
	//   26   52:aload_0         
	//   27   53:invokespecial   #157 <Method void setBlankProfilePicture()>
		}
	//   28   56:return          
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
	//    0    0:new             #159 <Class com.facebook.internal.ImageRequest$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #163 <Method android.content.Context getContext()>
	//    4    8:aload_0         
	//    5    9:getfield        #144 <Field String profileId>
	//    6   12:aload_0         
	//    7   13:getfield        #152 <Field int queryWidth>
	//    8   16:aload_0         
	//    9   17:getfield        #154 <Field int queryHeight>
	//   10   20:invokestatic    #169 <Method android.net.Uri ImageRequest.getProfilePictureUri(String, int, int)>
	//   11   23:invokespecial   #172 <Method void com.facebook.internal.ImageRequest$Builder(android.content.Context, android.net.Uri)>
	//   12   26:iload_1         
	//   13   27:invokevirtual   #176 <Method com.facebook.internal.ImageRequest$Builder com.facebook.internal.ImageRequest$Builder.setAllowCachedRedirects(boolean)>
	//   14   30:aload_0         
	//   15   31:invokevirtual   #180 <Method com.facebook.internal.ImageRequest$Builder com.facebook.internal.ImageRequest$Builder.setCallerTag(Object)>
	//   16   34:new             #6   <Class ProfilePictureView$1>
	//   17   37:dup             
	//   18   38:aload_0         
	//   19   39:invokespecial   #183 <Method void ProfilePictureView$1(ProfilePictureView)>
	//   20   42:invokevirtual   #187 <Method com.facebook.internal.ImageRequest$Builder com.facebook.internal.ImageRequest$Builder.setCallback(com.facebook.internal.ImageRequest$Callback)>
	//   21   45:invokevirtual   #190 <Method ImageRequest com.facebook.internal.ImageRequest$Builder.build()>
	//   22   48:astore_2        
		ImageRequest imagerequest1 = lastRequest;
	//   23   49:aload_0         
	//   24   50:getfield        #72  <Field ImageRequest lastRequest>
	//   25   53:astore_3        
		if(imagerequest1 != null)
	//*  26   54:aload_3         
	//*  27   55:ifnull          63
			ImageDownloader.cancelRequest(imagerequest1);
	//   28   58:aload_3         
	//   29   59:invokestatic    #196 <Method boolean ImageDownloader.cancelRequest(ImageRequest)>
	//   30   62:pop             
		lastRequest = imagerequest;
	//   31   63:aload_0         
	//   32   64:aload_2         
	//   33   65:putfield        #72  <Field ImageRequest lastRequest>
		ImageDownloader.downloadAsync(imagerequest);
	//   34   68:aload_2         
	//   35   69:invokestatic    #200 <Method void ImageDownloader.downloadAsync(ImageRequest)>
	//   36   72:return          
	}

	private void setBlankProfilePicture()
	{
		ImageRequest imagerequest = lastRequest;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field ImageRequest lastRequest>
	//    2    4:astore_2        
		if(imagerequest != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			ImageDownloader.cancelRequest(imagerequest);
	//    5    9:aload_2         
	//    6   10:invokestatic    #196 <Method boolean ImageDownloader.cancelRequest(ImageRequest)>
	//    7   13:pop             
		if(customizedDefaultProfilePicture == null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #202 <Field Bitmap customizedDefaultProfilePicture>
	//*  10   18:ifnonnull       52
		{
			int i;
			if(isCropped())
	//*  11   21:aload_0         
	//*  12   22:invokevirtual   #204 <Method boolean isCropped()>
	//*  13   25:ifeq            35
				i = com.facebook.login.R.drawable.com_facebook_profile_picture_blank_square;
	//   14   28:getstatic       #209 <Field int com.facebook.login.R$drawable.com_facebook_profile_picture_blank_square>
	//   15   31:istore_1        
			else
	//*  16   32:goto            39
				i = com.facebook.login.R.drawable.com_facebook_profile_picture_blank_portrait;
	//   17   35:getstatic       #212 <Field int com.facebook.login.R$drawable.com_facebook_profile_picture_blank_portrait>
	//   18   38:istore_1        
			setImageBitmap(BitmapFactoryInstrumentation.decodeResource(getResources(), i));
	//   19   39:aload_0         
	//   20   40:aload_0         
	//   21   41:invokevirtual   #58  <Method Resources getResources()>
	//   22   44:iload_1         
	//   23   45:invokestatic    #218 <Method Bitmap BitmapFactoryInstrumentation.decodeResource(Resources, int)>
	//   24   48:invokespecial   #130 <Method void setImageBitmap(Bitmap)>
			return;
	//   25   51:return          
		} else
		{
			updateImageQueryParameters();
	//   26   52:aload_0         
	//   27   53:invokespecial   #142 <Method boolean updateImageQueryParameters()>
	//   28   56:pop             
			setImageBitmap(Bitmap.createScaledBitmap(customizedDefaultProfilePicture, queryWidth, queryHeight, false));
	//   29   57:aload_0         
	//   30   58:aload_0         
	//   31   59:getfield        #202 <Field Bitmap customizedDefaultProfilePicture>
	//   32   62:aload_0         
	//   33   63:getfield        #152 <Field int queryWidth>
	//   34   66:aload_0         
	//   35   67:getfield        #154 <Field int queryHeight>
	//   36   70:iconst_0        
	//   37   71:invokestatic    #224 <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
	//   38   74:invokespecial   #130 <Method void setImageBitmap(Bitmap)>
			return;
	//   39   77:return          
		}
	}

	private void setImageBitmap(Bitmap bitmap)
	{
		ImageView imageview = image;
	//    0    0:aload_0         
	//    1    1:getfield        #226 <Field ImageView image>
	//    2    4:astore_2        
		if(imageview != null && bitmap != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          23
	//*   5    9:aload_1         
	//*   6   10:ifnull          23
		{
			imageContents = bitmap;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:putfield        #228 <Field Bitmap imageContents>
			imageview.setImageBitmap(bitmap);
	//   10   18:aload_2         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #231 <Method void ImageView.setImageBitmap(Bitmap)>
		}
	//   13   23:return          
	}

	private boolean updateImageQueryParameters()
	{
		int i = getHeight();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #234 <Method int getHeight()>
	//    2    4:istore_1        
		int j = getWidth();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #237 <Method int getWidth()>
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
	//   18   27:invokespecial   #239 <Method int getPresetSizeInPixels(boolean)>
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
	//*  30   45:invokevirtual   #204 <Method boolean isCropped()>
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
	//*  39   62:invokevirtual   #204 <Method boolean isCropped()>
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
	//*  50   81:getfield        #152 <Field int queryWidth>
	//*  51   84:icmpne          105
				if(i != queryHeight)
	//*  52   87:iload_1         
	//*  53   88:aload_0         
	//*  54   89:getfield        #154 <Field int queryHeight>
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
	//   63  107:putfield        #152 <Field int queryWidth>
			queryHeight = i;
	//   64  110:aload_0         
	//   65  111:iload_1         
	//   66  112:putfield        #154 <Field int queryHeight>
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
	//    1    1:getfield        #82  <Field ProfilePictureView$OnErrorListener onErrorListener>
	//    2    4:areturn         
	}

	public final int getPresetSize()
	{
		return presetSizeType;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int presetSizeType>
	//    2    4:ireturn         
	}

	public final String getProfileId()
	{
		return profileId;
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field String profileId>
	//    2    4:areturn         
	}

	public final boolean isCropped()
	{
		return isCropped;
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field boolean isCropped>
	//    2    4:ireturn         
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #247 <Method void FrameLayout.onDetachedFromWindow()>
		lastRequest = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #72  <Field ImageRequest lastRequest>
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
	//    6    8:invokespecial   #251 <Method void FrameLayout.onLayout(boolean, int, int, int, int)>
		refreshImage(false);
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:invokespecial   #253 <Method void refreshImage(boolean)>
	//   10   16:return          
	}

	protected void onMeasure(int i, int j)
	{
		android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #259 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//    2    4:astore          9
		int k = android.view.View.MeasureSpec.getSize(j);
	//    3    6:iload_2         
	//    4    7:invokestatic    #264 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    5   10:istore_3        
		int l1 = android.view.View.MeasureSpec.getSize(i);
	//    6   11:iload_1         
	//    7   12:invokestatic    #264 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    8   15:istore          8
		int l;
		if(android.view.View.MeasureSpec.getMode(j) != 0x40000000 && layoutparams.height == -2)
	//*   9   17:iload_2         
	//*  10   18:invokestatic    #267 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*  11   21:ldc2            #268 <Int 0x40000000>
	//*  12   24:icmpeq          57
	//*  13   27:aload           9
	//*  14   29:getfield        #273 <Field int android.view.ViewGroup$LayoutParams.height>
	//*  15   32:bipush          -2
	//*  16   34:icmpne          57
		{
			k = getPresetSizeInPixels(true);
	//   17   37:aload_0         
	//   18   38:iconst_1        
	//   19   39:invokespecial   #239 <Method int getPresetSizeInPixels(boolean)>
	//   20   42:istore_3        
			l = android.view.View.MeasureSpec.makeMeasureSpec(k, 0x40000000);
	//   21   43:iload_3         
	//   22   44:ldc2            #268 <Int 0x40000000>
	//   23   47:invokestatic    #277 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
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
	//*  41   77:invokestatic    #267 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*  42   80:ldc2            #268 <Int 0x40000000>
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
	//*  51   98:getfield        #280 <Field int android.view.ViewGroup$LayoutParams.width>
	//*  52  101:bipush          -2
	//*  53  103:icmpne          126
			{
				k1 = getPresetSizeInPixels(true);
	//   54  106:aload_0         
	//   55  107:iconst_1        
	//   56  108:invokespecial   #239 <Method int getPresetSizeInPixels(boolean)>
	//   57  111:istore          7
				i1 = android.view.View.MeasureSpec.makeMeasureSpec(k1, 0x40000000);
	//   58  113:iload           7
	//   59  115:ldc2            #268 <Int 0x40000000>
	//   60  118:invokestatic    #277 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
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
	//   69  135:invokevirtual   #283 <Method void setMeasuredDimension(int, int)>
			measureChildren(i1, l);
	//   70  138:aload_0         
	//   71  139:iload           5
	//   72  141:iload           4
	//   73  143:invokevirtual   #286 <Method void measureChildren(int, int)>
			return;
	//   74  146:return          
		} else
		{
			super.onMeasure(i1, l);
	//   75  147:aload_0         
	//   76  148:iload           5
	//   77  150:iload           4
	//   78  152:invokespecial   #288 <Method void FrameLayout.onMeasure(int, int)>
			return;
	//   79  155:return          
		}
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(((Object) (parcelable)).getClass() != android/os/Bundle)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #296 <Method Class Object.getClass()>
	//*   2    4:ldc2            #298 <Class Bundle>
	//*   3    7:if_acmpeq       16
		{
			super.onRestoreInstanceState(parcelable);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:invokespecial   #300 <Method void FrameLayout.onRestoreInstanceState(Parcelable)>
			return;
	//    7   15:return          
		} else
		{
			parcelable = ((Parcelable) ((Bundle)parcelable));
	//    8   16:aload_1         
	//    9   17:checkcast       #298 <Class Bundle>
	//   10   20:astore_1        
			super.onRestoreInstanceState(((Bundle) (parcelable)).getParcelable("ProfilePictureView_superState"));
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:ldc2            #302 <String "ProfilePictureView_superState">
	//   14   26:invokevirtual   #306 <Method Parcelable Bundle.getParcelable(String)>
	//   15   29:invokespecial   #300 <Method void FrameLayout.onRestoreInstanceState(Parcelable)>
			profileId = ((Bundle) (parcelable)).getString("ProfilePictureView_profileId");
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:ldc2            #308 <String "ProfilePictureView_profileId">
	//   19   37:invokevirtual   #312 <Method String Bundle.getString(String)>
	//   20   40:putfield        #144 <Field String profileId>
			presetSizeType = ((Bundle) (parcelable)).getInt("ProfilePictureView_presetSize");
	//   21   43:aload_0         
	//   22   44:aload_1         
	//   23   45:ldc2            #314 <String "ProfilePictureView_presetSize">
	//   24   48:invokevirtual   #318 <Method int Bundle.getInt(String)>
	//   25   51:putfield        #43  <Field int presetSizeType>
			isCropped = ((Bundle) (parcelable)).getBoolean("ProfilePictureView_isCropped");
	//   26   54:aload_0         
	//   27   55:aload_1         
	//   28   56:ldc2            #320 <String "ProfilePictureView_isCropped">
	//   29   59:invokevirtual   #324 <Method boolean Bundle.getBoolean(String)>
	//   30   62:putfield        #244 <Field boolean isCropped>
			queryWidth = ((Bundle) (parcelable)).getInt("ProfilePictureView_width");
	//   31   65:aload_0         
	//   32   66:aload_1         
	//   33   67:ldc2            #326 <String "ProfilePictureView_width">
	//   34   70:invokevirtual   #318 <Method int Bundle.getInt(String)>
	//   35   73:putfield        #152 <Field int queryWidth>
			queryHeight = ((Bundle) (parcelable)).getInt("ProfilePictureView_height");
	//   36   76:aload_0         
	//   37   77:aload_1         
	//   38   78:ldc2            #328 <String "ProfilePictureView_height">
	//   39   81:invokevirtual   #318 <Method int Bundle.getInt(String)>
	//   40   84:putfield        #154 <Field int queryHeight>
			refreshImage(true);
	//   41   87:aload_0         
	//   42   88:iconst_1        
	//   43   89:invokespecial   #253 <Method void refreshImage(boolean)>
			return;
	//   44   92:return          
		}
	}

	protected Parcelable onSaveInstanceState()
	{
		Parcelable parcelable = super.onSaveInstanceState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #332 <Method Parcelable FrameLayout.onSaveInstanceState()>
	//    2    4:astore_2        
		Bundle bundle = new Bundle();
	//    3    5:new             #298 <Class Bundle>
	//    4    8:dup             
	//    5    9:invokespecial   #333 <Method void Bundle()>
	//    6   12:astore_3        
		bundle.putParcelable("ProfilePictureView_superState", parcelable);
	//    7   13:aload_3         
	//    8   14:ldc2            #302 <String "ProfilePictureView_superState">
	//    9   17:aload_2         
	//   10   18:invokevirtual   #337 <Method void Bundle.putParcelable(String, Parcelable)>
		bundle.putString("ProfilePictureView_profileId", profileId);
	//   11   21:aload_3         
	//   12   22:ldc2            #308 <String "ProfilePictureView_profileId">
	//   13   25:aload_0         
	//   14   26:getfield        #144 <Field String profileId>
	//   15   29:invokevirtual   #341 <Method void Bundle.putString(String, String)>
		bundle.putInt("ProfilePictureView_presetSize", presetSizeType);
	//   16   32:aload_3         
	//   17   33:ldc2            #314 <String "ProfilePictureView_presetSize">
	//   18   36:aload_0         
	//   19   37:getfield        #43  <Field int presetSizeType>
	//   20   40:invokevirtual   #345 <Method void Bundle.putInt(String, int)>
		bundle.putBoolean("ProfilePictureView_isCropped", isCropped);
	//   21   43:aload_3         
	//   22   44:ldc2            #320 <String "ProfilePictureView_isCropped">
	//   23   47:aload_0         
	//   24   48:getfield        #244 <Field boolean isCropped>
	//   25   51:invokevirtual   #349 <Method void Bundle.putBoolean(String, boolean)>
		bundle.putInt("ProfilePictureView_width", queryWidth);
	//   26   54:aload_3         
	//   27   55:ldc2            #326 <String "ProfilePictureView_width">
	//   28   58:aload_0         
	//   29   59:getfield        #152 <Field int queryWidth>
	//   30   62:invokevirtual   #345 <Method void Bundle.putInt(String, int)>
		bundle.putInt("ProfilePictureView_height", queryHeight);
	//   31   65:aload_3         
	//   32   66:ldc2            #328 <String "ProfilePictureView_height">
	//   33   69:aload_0         
	//   34   70:getfield        #154 <Field int queryHeight>
	//   35   73:invokevirtual   #345 <Method void Bundle.putInt(String, int)>
		boolean flag;
		if(lastRequest != null)
	//*  36   76:aload_0         
	//*  37   77:getfield        #72  <Field ImageRequest lastRequest>
	//*  38   80:ifnull          88
			flag = true;
	//   39   83:iconst_1        
	//   40   84:istore_1        
		else
	//*  41   85:goto            90
			flag = false;
	//   42   88:iconst_0        
	//   43   89:istore_1        
		bundle.putBoolean("ProfilePictureView_refresh", flag);
	//   44   90:aload_3         
	//   45   91:ldc2            #351 <String "ProfilePictureView_refresh">
	//   46   94:iload_1         
	//   47   95:invokevirtual   #349 <Method void Bundle.putBoolean(String, boolean)>
		return ((Parcelable) (bundle));
	//   48   98:aload_3         
	//   49   99:areturn         
	}

	public final void setCropped(boolean flag)
	{
		isCropped = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #244 <Field boolean isCropped>
		refreshImage(false);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokespecial   #253 <Method void refreshImage(boolean)>
	//    6   10:return          
	}

	public final void setDefaultProfilePicture(Bitmap bitmap)
	{
		customizedDefaultProfilePicture = bitmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #202 <Field Bitmap customizedDefaultProfilePicture>
	//    3    5:return          
	}

	public final void setOnErrorListener(OnErrorListener onerrorlistener)
	{
		onErrorListener = onerrorlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #82  <Field ProfilePictureView$OnErrorListener onErrorListener>
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
	//    2   32:new             #359 <Class IllegalArgumentException>
	//    3   35:dup             
	//    4   36:ldc2            #361 <String "Must use a predefined preset size">
	//    5   39:invokespecial   #364 <Method void IllegalArgumentException(String)>
	//    6   42:athrow          

		case -4: 
		case -3: 
		case -2: 
		case -1: 
			presetSizeType = i;
	//    7   43:aload_0         
	//    8   44:iload_1         
	//    9   45:putfield        #43  <Field int presetSizeType>
			break;
		}
		requestLayout();
	//   10   48:aload_0         
	//   11   49:invokevirtual   #367 <Method void requestLayout()>
	//   12   52:return          
	}

	public final void setProfileId(String s)
	{
		boolean flag;
		if(!Utility.isNullOrEmpty(profileId) && profileId.equalsIgnoreCase(s))
	//*   0    0:aload_0         
	//*   1    1:getfield        #144 <Field String profileId>
	//*   2    4:invokestatic    #374 <Method boolean Utility.isNullOrEmpty(String)>
	//*   3    7:ifne            29
	//*   4   10:aload_0         
	//*   5   11:getfield        #144 <Field String profileId>
	//*   6   14:aload_1         
	//*   7   15:invokevirtual   #377 <Method boolean String.equalsIgnoreCase(String)>
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
	//   14   30:invokespecial   #157 <Method void setBlankProfilePicture()>
			flag = true;
	//   15   33:iconst_1        
	//   16   34:istore_2        
		}
		profileId = s;
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:putfield        #144 <Field String profileId>
		refreshImage(flag);
	//   20   40:aload_0         
	//   21   41:iload_2         
	//   22   42:invokespecial   #253 <Method void refreshImage(boolean)>
	//   23   45:return          
	}

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
	//    2    2:invokespecial   #39  <Method void processResponse(ImageResponse)>
		return;
	//    3    5:return          
	}

*/
}
