// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.facebook.*;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.*;
import com.facebook.share.model.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import org.json.*;

// Referenced classes of package com.facebook.share.internal:
//			ResultProcessor, OpenGraphJSONUtility

public final class ShareInternalUtility
{

	public ShareInternalUtility()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
	//    2    4:return          
	}

	private static AppCall getAppCallFromActivityResult(int i, int j, Intent intent)
	{
		intent = ((Intent) (NativeProtocol.getCallIdFromIntent(intent)));
	//    0    0:aload_2         
	//    1    1:invokestatic    #46  <Method UUID NativeProtocol.getCallIdFromIntent(Intent)>
	//    2    4:astore_2        
		if(intent == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return AppCall.finishPendingCall(((UUID) (intent)), i);
	//    7   11:aload_2         
	//    8   12:iload_0         
	//    9   13:invokestatic    #52  <Method AppCall AppCall.finishPendingCall(UUID, int)>
	//   10   16:areturn         
	}

	private static com.facebook.internal.NativeAppCallAttachmentStore.Attachment getAttachment(UUID uuid, SharePhoto sharephoto)
	{
		Bitmap bitmap = sharephoto.getBitmap();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #58  <Method Bitmap SharePhoto.getBitmap()>
	//    2    4:astore_2        
		sharephoto = ((SharePhoto) (sharephoto.getImageUrl()));
	//    3    5:aload_1         
	//    4    6:invokevirtual   #62  <Method Uri SharePhoto.getImageUrl()>
	//    5    9:astore_1        
		if(bitmap != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          20
			return NativeAppCallAttachmentStore.createAttachment(uuid, bitmap);
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:invokestatic    #68  <Method com.facebook.internal.NativeAppCallAttachmentStore$Attachment NativeAppCallAttachmentStore.createAttachment(UUID, Bitmap)>
	//   11   19:areturn         
		if(sharephoto != null)
	//*  12   20:aload_1         
	//*  13   21:ifnull          30
			return NativeAppCallAttachmentStore.createAttachment(uuid, ((Uri) (sharephoto)));
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:invokestatic    #71  <Method com.facebook.internal.NativeAppCallAttachmentStore$Attachment NativeAppCallAttachmentStore.createAttachment(UUID, Uri)>
	//   17   29:areturn         
		else
			return null;
	//   18   30:aconst_null     
	//   19   31:areturn         
	}

	public static Pair getFieldNameAndNamespaceFromFullName(String s)
	{
		String s1;
label0:
		{
			int i = s.indexOf(':');
	//    0    0:aload_0         
	//    1    1:bipush          58
	//    2    3:invokevirtual   #79  <Method int String.indexOf(int)>
	//    3    6:istore_1        
			if(i != -1)
	//*   4    7:iload_1         
	//*   5    8:iconst_m1       
	//*   6    9:icmpeq          51
			{
				int j = s.length();
	//    7   12:aload_0         
	//    8   13:invokevirtual   #83  <Method int String.length()>
	//    9   16:istore_2        
				int k = i + 1;
	//   10   17:iload_1         
	//   11   18:iconst_1        
	//   12   19:iadd            
	//   13   20:istore_3        
				if(j > k)
	//*  14   21:iload_2         
	//*  15   22:iload_3         
	//*  16   23:icmple          51
				{
					s1 = s.substring(0, i);
	//   17   26:aload_0         
	//   18   27:iconst_0        
	//   19   28:iload_1         
	//   20   29:invokevirtual   #87  <Method String String.substring(int, int)>
	//   21   32:astore          4
					String s2 = s.substring(k);
	//   22   34:aload_0         
	//   23   35:iload_3         
	//   24   36:invokevirtual   #90  <Method String String.substring(int)>
	//   25   39:astore          5
					s = s1;
	//   26   41:aload           4
	//   27   43:astore_0        
					s1 = s2;
	//   28   44:aload           5
	//   29   46:astore          4
					break label0;
	//   30   48:goto            60
				}
			}
			Object obj = null;
	//   31   51:aconst_null     
	//   32   52:astore          5
			s1 = s;
	//   33   54:aload_0         
	//   34   55:astore          4
			s = ((String) (obj));
	//   35   57:aload           5
	//   36   59:astore_0        
		}
		return new Pair(((Object) (s)), ((Object) (s1)));
	//   37   60:new             #92  <Class Pair>
	//   38   63:dup             
	//   39   64:aload_0         
	//   40   65:aload           4
	//   41   67:invokespecial   #95  <Method void Pair(Object, Object)>
	//   42   70:areturn         
	}

	public static com.facebook.share.widget.LikeView.ObjectType getMostSpecificObjectType(com.facebook.share.widget.LikeView.ObjectType objecttype, com.facebook.share.widget.LikeView.ObjectType objecttype1)
	{
		if(objecttype == objecttype1)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return objecttype;
	//    3    5:aload_0         
	//    4    6:areturn         
		if(objecttype == com.facebook.share.widget.LikeView.ObjectType.UNKNOWN)
	//*   5    7:aload_0         
	//*   6    8:getstatic       #106 <Field com.facebook.share.widget.LikeView$ObjectType com.facebook.share.widget.LikeView$ObjectType.UNKNOWN>
	//*   7   11:if_acmpne       16
			return objecttype1;
	//    8   14:aload_1         
	//    9   15:areturn         
		if(objecttype1 == com.facebook.share.widget.LikeView.ObjectType.UNKNOWN)
	//*  10   16:aload_1         
	//*  11   17:getstatic       #106 <Field com.facebook.share.widget.LikeView$ObjectType com.facebook.share.widget.LikeView$ObjectType.UNKNOWN>
	//*  12   20:if_acmpne       25
			return objecttype;
	//   13   23:aload_0         
	//   14   24:areturn         
		else
			return null;
	//   15   25:aconst_null     
	//   16   26:areturn         
	}

	public static String getNativeDialogCompletionGesture(Bundle bundle)
	{
		if(bundle.containsKey("completionGesture"))
	//*   0    0:aload_0         
	//*   1    1:ldc1            #111 <String "completionGesture">
	//*   2    3:invokevirtual   #117 <Method boolean Bundle.containsKey(String)>
	//*   3    6:ifeq            16
			return bundle.getString("completionGesture");
	//    4    9:aload_0         
	//    5   10:ldc1            #111 <String "completionGesture">
	//    6   12:invokevirtual   #121 <Method String Bundle.getString(String)>
	//    7   15:areturn         
		else
			return bundle.getString("com.facebook.platform.extra.COMPLETION_GESTURE");
	//    8   16:aload_0         
	//    9   17:ldc1            #123 <String "com.facebook.platform.extra.COMPLETION_GESTURE">
	//   10   19:invokevirtual   #121 <Method String Bundle.getString(String)>
	//   11   22:areturn         
	}

	public static List getPhotoUrls(SharePhotoContent sharephotocontent, UUID uuid)
	{
		if(sharephotocontent != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          47
		{
			sharephotocontent = ((SharePhotoContent) (sharephotocontent.getPhotos()));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #131 <Method List SharePhotoContent.getPhotos()>
	//    4    8:astore_0        
			if(sharephotocontent != null)
	//*   5    9:aload_0         
	//*   6   10:ifnonnull       16
	//*   7   13:goto            47
			{
				sharephotocontent = ((SharePhotoContent) (Utility.map(((List) (sharephotocontent)), new com.facebook.internal.Utility.Mapper(uuid) {

					public com.facebook.internal.NativeAppCallAttachmentStore.Attachment apply(SharePhoto sharephoto)
					{
						return ShareInternalUtility.getAttachment(appCallId, sharephoto);
					//    0    0:aload_0         
					//    1    1:getfield        #18  <Field UUID val$appCallId>
					//    2    4:aload_1         
					//    3    5:invokestatic    #28  <Method com.facebook.internal.NativeAppCallAttachmentStore$Attachment ShareInternalUtility.access$000(UUID, SharePhoto)>
					//    4    8:areturn         
					}

					public volatile Object apply(Object obj)
					{
						return ((Object) (apply((SharePhoto)obj)));
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:checkcast       #31  <Class SharePhoto>
					//    3    5:invokevirtual   #33  <Method com.facebook.internal.NativeAppCallAttachmentStore$Attachment apply(SharePhoto)>
					//    4    8:areturn         
					}

					final UUID val$appCallId;

			
			{
				appCallId = uuid;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field UUID val$appCallId>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
				}
)));
	//    8   16:aload_0         
	//    9   17:new             #12  <Class ShareInternalUtility$4>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:invokespecial   #134 <Method void ShareInternalUtility$4(UUID)>
	//   13   25:invokestatic    #140 <Method List Utility.map(List, com.facebook.internal.Utility$Mapper)>
	//   14   28:astore_0        
				uuid = ((UUID) (Utility.map(((List) (sharephotocontent)), new com.facebook.internal.Utility.Mapper() {

					public volatile Object apply(Object obj)
					{
						return ((Object) (apply((com.facebook.internal.NativeAppCallAttachmentStore.Attachment)obj)));
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:checkcast       #21  <Class com.facebook.internal.NativeAppCallAttachmentStore$Attachment>
					//    3    5:invokevirtual   #24  <Method String apply(com.facebook.internal.NativeAppCallAttachmentStore$Attachment)>
					//    4    8:areturn         
					}

					public String apply(com.facebook.internal.NativeAppCallAttachmentStore.Attachment attachment)
					{
						return attachment.getAttachmentUrl();
					//    0    0:aload_1         
					//    1    1:invokevirtual   #28  <Method String com.facebook.internal.NativeAppCallAttachmentStore$Attachment.getAttachmentUrl()>
					//    2    4:areturn         
					}

				}
)));
	//   15   29:aload_0         
	//   16   30:new             #14  <Class ShareInternalUtility$5>
	//   17   33:dup             
	//   18   34:invokespecial   #141 <Method void ShareInternalUtility$5()>
	//   19   37:invokestatic    #140 <Method List Utility.map(List, com.facebook.internal.Utility$Mapper)>
	//   20   40:astore_1        
				NativeAppCallAttachmentStore.addAttachments(((java.util.Collection) (sharephotocontent)));
	//   21   41:aload_0         
	//   22   42:invokestatic    #145 <Method void NativeAppCallAttachmentStore.addAttachments(java.util.Collection)>
				return ((List) (uuid));
	//   23   45:aload_1         
	//   24   46:areturn         
			}
		}
		return null;
	//   25   47:aconst_null     
	//   26   48:areturn         
	}

	public static String getShareDialogPostId(Bundle bundle)
	{
		if(bundle.containsKey("postId"))
	//*   0    0:aload_0         
	//*   1    1:ldc1            #149 <String "postId">
	//*   2    3:invokevirtual   #117 <Method boolean Bundle.containsKey(String)>
	//*   3    6:ifeq            16
			return bundle.getString("postId");
	//    4    9:aload_0         
	//    5   10:ldc1            #149 <String "postId">
	//    6   12:invokevirtual   #121 <Method String Bundle.getString(String)>
	//    7   15:areturn         
		if(bundle.containsKey("com.facebook.platform.extra.POST_ID"))
	//*   8   16:aload_0         
	//*   9   17:ldc1            #151 <String "com.facebook.platform.extra.POST_ID">
	//*  10   19:invokevirtual   #117 <Method boolean Bundle.containsKey(String)>
	//*  11   22:ifeq            32
			return bundle.getString("com.facebook.platform.extra.POST_ID");
	//   12   25:aload_0         
	//   13   26:ldc1            #151 <String "com.facebook.platform.extra.POST_ID">
	//   14   28:invokevirtual   #121 <Method String Bundle.getString(String)>
	//   15   31:areturn         
		else
			return bundle.getString("post_id");
	//   16   32:aload_0         
	//   17   33:ldc1            #153 <String "post_id">
	//   18   35:invokevirtual   #121 <Method String Bundle.getString(String)>
	//   19   38:areturn         
	}

	public static ResultProcessor getShareResultProcessor(FacebookCallback facebookcallback)
	{
		return ((ResultProcessor) (new ResultProcessor(facebookcallback, facebookcallback) {

			public void onCancel(AppCall appcall)
			{
				ShareInternalUtility.invokeOnCancelCallback(callback);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field FacebookCallback val$callback>
			//    2    4:invokestatic    #24  <Method void ShareInternalUtility.invokeOnCancelCallback(FacebookCallback)>
			//    3    7:return          
			}

			public void onError(AppCall appcall, FacebookException facebookexception)
			{
				ShareInternalUtility.invokeOnErrorCallback(callback, facebookexception);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field FacebookCallback val$callback>
			//    2    4:aload_2         
			//    3    5:invokestatic    #30  <Method void ShareInternalUtility.invokeOnErrorCallback(FacebookCallback, FacebookException)>
			//    4    8:return          
			}

			public void onSuccess(AppCall appcall, Bundle bundle)
			{
				if(bundle != null)
			//*   0    0:aload_2         
			//*   1    1:ifnull          72
				{
					appcall = ((AppCall) (ShareInternalUtility.getNativeDialogCompletionGesture(bundle)));
			//    2    4:aload_2         
			//    3    5:invokestatic    #36  <Method String ShareInternalUtility.getNativeDialogCompletionGesture(Bundle)>
			//    4    8:astore_1        
					if(appcall != null && !"post".equalsIgnoreCase(((String) (appcall))))
			//*   5    9:aload_1         
			//*   6   10:ifnull          59
			//*   7   13:ldc1            #38  <String "post">
			//*   8   15:aload_1         
			//*   9   16:invokevirtual   #44  <Method boolean String.equalsIgnoreCase(String)>
			//*  10   19:ifeq            25
			//*  11   22:goto            59
						if("cancel".equalsIgnoreCase(((String) (appcall))))
			//*  12   25:ldc1            #46  <String "cancel">
			//*  13   27:aload_1         
			//*  14   28:invokevirtual   #44  <Method boolean String.equalsIgnoreCase(String)>
			//*  15   31:ifeq            42
						{
							ShareInternalUtility.invokeOnCancelCallback(callback);
			//   16   34:aload_0         
			//   17   35:getfield        #15  <Field FacebookCallback val$callback>
			//   18   38:invokestatic    #24  <Method void ShareInternalUtility.invokeOnCancelCallback(FacebookCallback)>
							return;
			//   19   41:return          
						} else
						{
							ShareInternalUtility.invokeOnErrorCallback(callback, new FacebookException("UnknownError"));
			//   20   42:aload_0         
			//   21   43:getfield        #15  <Field FacebookCallback val$callback>
			//   22   46:new             #48  <Class FacebookException>
			//   23   49:dup             
			//   24   50:ldc1            #50  <String "UnknownError">
			//   25   52:invokespecial   #53  <Method void FacebookException(String)>
			//   26   55:invokestatic    #30  <Method void ShareInternalUtility.invokeOnErrorCallback(FacebookCallback, FacebookException)>
							return;
			//   27   58:return          
						}
					appcall = ((AppCall) (ShareInternalUtility.getShareDialogPostId(bundle)));
			//   28   59:aload_2         
			//   29   60:invokestatic    #56  <Method String ShareInternalUtility.getShareDialogPostId(Bundle)>
			//   30   63:astore_1        
					ShareInternalUtility.invokeOnSuccessCallback(callback, ((String) (appcall)));
			//   31   64:aload_0         
			//   32   65:getfield        #15  <Field FacebookCallback val$callback>
			//   33   68:aload_1         
			//   34   69:invokestatic    #60  <Method void ShareInternalUtility.invokeOnSuccessCallback(FacebookCallback, String)>
				}
			//   35   72:return          
			}

			final FacebookCallback val$callback;

			
			{
				callback = facebookcallback1;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #15  <Field FacebookCallback val$callback>
				super(facebookcallback);
			//    3    5:aload_0         
			//    4    6:aload_1         
			//    5    7:invokespecial   #18  <Method void ResultProcessor(FacebookCallback)>
			//    6   10:return          
			}
		}
));
	//    0    0:new             #6   <Class ShareInternalUtility$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokespecial   #158 <Method void ShareInternalUtility$1(FacebookCallback, FacebookCallback)>
	//    5    9:areturn         
	}

	public static String getVideoUrl(ShareVideoContent sharevideocontent, UUID uuid)
	{
		if(sharevideocontent != null && sharevideocontent.getVideo() != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          50
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #167 <Method ShareVideo ShareVideoContent.getVideo()>
	//*   4    8:ifnonnull       14
	//*   5   11:goto            50
		{
			sharevideocontent = ((ShareVideoContent) (NativeAppCallAttachmentStore.createAttachment(uuid, sharevideocontent.getVideo().getLocalUrl())));
	//    6   14:aload_1         
	//    7   15:aload_0         
	//    8   16:invokevirtual   #167 <Method ShareVideo ShareVideoContent.getVideo()>
	//    9   19:invokevirtual   #172 <Method Uri ShareVideo.getLocalUrl()>
	//   10   22:invokestatic    #71  <Method com.facebook.internal.NativeAppCallAttachmentStore$Attachment NativeAppCallAttachmentStore.createAttachment(UUID, Uri)>
	//   11   25:astore_0        
			uuid = ((UUID) (new ArrayList(1)));
	//   12   26:new             #174 <Class ArrayList>
	//   13   29:dup             
	//   14   30:iconst_1        
	//   15   31:invokespecial   #177 <Method void ArrayList(int)>
	//   16   34:astore_1        
			((ArrayList) (uuid)).add(((Object) (sharevideocontent)));
	//   17   35:aload_1         
	//   18   36:aload_0         
	//   19   37:invokevirtual   #181 <Method boolean ArrayList.add(Object)>
	//   20   40:pop             
			NativeAppCallAttachmentStore.addAttachments(((java.util.Collection) (uuid)));
	//   21   41:aload_1         
	//   22   42:invokestatic    #145 <Method void NativeAppCallAttachmentStore.addAttachments(java.util.Collection)>
			return ((com.facebook.internal.NativeAppCallAttachmentStore.Attachment) (sharevideocontent)).getAttachmentUrl();
	//   23   45:aload_0         
	//   24   46:invokevirtual   #187 <Method String com.facebook.internal.NativeAppCallAttachmentStore$Attachment.getAttachmentUrl()>
	//   25   49:areturn         
		} else
		{
			return null;
	//   26   50:aconst_null     
	//   27   51:areturn         
		}
	}

	public static boolean handleActivityResult(int i, int j, Intent intent, ResultProcessor resultprocessor)
	{
		AppCall appcall = getAppCallFromActivityResult(i, j, intent);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #191 <Method AppCall getAppCallFromActivityResult(int, int, Intent)>
	//    4    6:astore          4
		if(appcall == null)
	//*   5    8:aload           4
	//*   6   10:ifnonnull       15
			return false;
	//    7   13:iconst_0        
	//    8   14:ireturn         
		NativeAppCallAttachmentStore.cleanupAttachmentsForCall(appcall.getCallId());
	//    9   15:aload           4
	//   10   17:invokevirtual   #195 <Method UUID AppCall.getCallId()>
	//   11   20:invokestatic    #198 <Method void NativeAppCallAttachmentStore.cleanupAttachmentsForCall(UUID)>
		if(resultprocessor == null)
	//*  12   23:aload_3         
	//*  13   24:ifnonnull       29
			return true;
	//   14   27:iconst_1        
	//   15   28:ireturn         
		FacebookException facebookexception = NativeProtocol.getExceptionFromErrorData(NativeProtocol.getErrorDataFromResultIntent(intent));
	//   16   29:aload_2         
	//   17   30:invokestatic    #202 <Method Bundle NativeProtocol.getErrorDataFromResultIntent(Intent)>
	//   18   33:invokestatic    #206 <Method FacebookException NativeProtocol.getExceptionFromErrorData(Bundle)>
	//   19   36:astore          5
		if(facebookexception != null)
	//*  20   38:aload           5
	//*  21   40:ifnull          69
		{
			if(facebookexception instanceof FacebookOperationCanceledException)
	//*  22   43:aload           5
	//*  23   45:instanceof      #208 <Class FacebookOperationCanceledException>
	//*  24   48:ifeq            59
			{
				resultprocessor.onCancel(appcall);
	//   25   51:aload_3         
	//   26   52:aload           4
	//   27   54:invokevirtual   #214 <Method void ResultProcessor.onCancel(AppCall)>
				return true;
	//   28   57:iconst_1        
	//   29   58:ireturn         
			} else
			{
				resultprocessor.onError(appcall, facebookexception);
	//   30   59:aload_3         
	//   31   60:aload           4
	//   32   62:aload           5
	//   33   64:invokevirtual   #218 <Method void ResultProcessor.onError(AppCall, FacebookException)>
				return true;
	//   34   67:iconst_1        
	//   35   68:ireturn         
			}
		} else
		{
			resultprocessor.onSuccess(appcall, NativeProtocol.getSuccessResultsFromIntent(intent));
	//   36   69:aload_3         
	//   37   70:aload           4
	//   38   72:aload_2         
	//   39   73:invokestatic    #221 <Method Bundle NativeProtocol.getSuccessResultsFromIntent(Intent)>
	//   40   76:invokevirtual   #225 <Method void ResultProcessor.onSuccess(AppCall, Bundle)>
			return true;
	//   41   79:iconst_1        
	//   42   80:ireturn         
		}
	}

	public static void invokeCallbackWithError(FacebookCallback facebookcallback, String s)
	{
		invokeOnErrorCallback(facebookcallback, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #230 <Method void invokeOnErrorCallback(FacebookCallback, String)>
	//    3    5:return          
	}

	public static void invokeCallbackWithException(FacebookCallback facebookcallback, Exception exception)
	{
		if(exception instanceof FacebookException)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #235 <Class FacebookException>
	//*   2    4:ifeq            16
		{
			invokeOnErrorCallback(facebookcallback, (FacebookException)exception);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #235 <Class FacebookException>
	//    6   12:invokestatic    #238 <Method void invokeOnErrorCallback(FacebookCallback, FacebookException)>
			return;
	//    7   15:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    8   16:new             #240 <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #241 <Method void StringBuilder()>
	//   11   23:astore_2        
			stringbuilder.append("Error preparing share content: ");
	//   12   24:aload_2         
	//   13   25:ldc1            #243 <String "Error preparing share content: ">
	//   14   27:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
			stringbuilder.append(exception.getLocalizedMessage());
	//   16   31:aload_2         
	//   17   32:aload_1         
	//   18   33:invokevirtual   #252 <Method String Exception.getLocalizedMessage()>
	//   19   36:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
			invokeCallbackWithError(facebookcallback, stringbuilder.toString());
	//   21   40:aload_0         
	//   22   41:aload_2         
	//   23   42:invokevirtual   #255 <Method String StringBuilder.toString()>
	//   24   45:invokestatic    #257 <Method void invokeCallbackWithError(FacebookCallback, String)>
			return;
	//   25   48:return          
		}
	}

	public static void invokeCallbackWithResults(FacebookCallback facebookcallback, String s, GraphResponse graphresponse)
	{
		Object obj = ((Object) (graphresponse.getError()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #266 <Method FacebookRequestError GraphResponse.getError()>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          34
		{
			obj = ((Object) (((FacebookRequestError) (obj)).getErrorMessage()));
	//    5    9:aload_3         
	//    6   10:invokevirtual   #271 <Method String FacebookRequestError.getErrorMessage()>
	//    7   13:astore_3        
			s = ((String) (obj));
	//    8   14:aload_3         
	//    9   15:astore_1        
			if(Utility.isNullOrEmpty(((String) (obj))))
	//*  10   16:aload_3         
	//*  11   17:invokestatic    #274 <Method boolean Utility.isNullOrEmpty(String)>
	//*  12   20:ifeq            27
				s = "Unexpected error sharing.";
	//   13   23:ldc2            #276 <String "Unexpected error sharing.">
	//   14   26:astore_1        
			invokeOnErrorCallback(facebookcallback, graphresponse, s);
	//   15   27:aload_0         
	//   16   28:aload_2         
	//   17   29:aload_1         
	//   18   30:invokestatic    #279 <Method void invokeOnErrorCallback(FacebookCallback, GraphResponse, String)>
			return;
	//   19   33:return          
		} else
		{
			invokeOnSuccessCallback(facebookcallback, s);
	//   20   34:aload_0         
	//   21   35:aload_1         
	//   22   36:invokestatic    #282 <Method void invokeOnSuccessCallback(FacebookCallback, String)>
			return;
	//   23   39:return          
		}
	}

	static void invokeOnCancelCallback(FacebookCallback facebookcallback)
	{
		logShareResult("cancelled", ((String) (null)));
	//    0    0:ldc2            #287 <String "cancelled">
	//    1    3:aconst_null     
	//    2    4:invokestatic    #291 <Method void logShareResult(String, String)>
		if(facebookcallback != null)
	//*   3    7:aload_0         
	//*   4    8:ifnull          17
			facebookcallback.onCancel();
	//    5   11:aload_0         
	//    6   12:invokeinterface #295 <Method void FacebookCallback.onCancel()>
	//    7   17:return          
	}

	static void invokeOnErrorCallback(FacebookCallback facebookcallback, FacebookException facebookexception)
	{
		logShareResult("error", facebookexception.getMessage());
	//    0    0:ldc2            #298 <String "error">
	//    1    3:aload_1         
	//    2    4:invokevirtual   #301 <Method String FacebookException.getMessage()>
	//    3    7:invokestatic    #291 <Method void logShareResult(String, String)>
		if(facebookcallback != null)
	//*   4   10:aload_0         
	//*   5   11:ifnull          21
			facebookcallback.onError(facebookexception);
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokeinterface #304 <Method void FacebookCallback.onError(FacebookException)>
	//    9   21:return          
	}

	static void invokeOnErrorCallback(FacebookCallback facebookcallback, GraphResponse graphresponse, String s)
	{
		logShareResult("error", s);
	//    0    0:ldc2            #298 <String "error">
	//    1    3:aload_2         
	//    2    4:invokestatic    #291 <Method void logShareResult(String, String)>
		if(facebookcallback != null)
	//*   3    7:aload_0         
	//*   4    8:ifnull          26
			facebookcallback.onError(((FacebookException) (new FacebookGraphResponseException(graphresponse, s))));
	//    5   11:aload_0         
	//    6   12:new             #307 <Class FacebookGraphResponseException>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokespecial   #310 <Method void FacebookGraphResponseException(GraphResponse, String)>
	//   11   21:invokeinterface #304 <Method void FacebookCallback.onError(FacebookException)>
	//   12   26:return          
	}

	static void invokeOnErrorCallback(FacebookCallback facebookcallback, String s)
	{
		logShareResult("error", s);
	//    0    0:ldc2            #298 <String "error">
	//    1    3:aload_1         
	//    2    4:invokestatic    #291 <Method void logShareResult(String, String)>
		if(facebookcallback != null)
	//*   3    7:aload_0         
	//*   4    8:ifnull          25
			facebookcallback.onError(new FacebookException(s));
	//    5   11:aload_0         
	//    6   12:new             #235 <Class FacebookException>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokespecial   #314 <Method void FacebookException(String)>
	//   10   20:invokeinterface #304 <Method void FacebookCallback.onError(FacebookException)>
	//   11   25:return          
	}

	static void invokeOnSuccessCallback(FacebookCallback facebookcallback, String s)
	{
		logShareResult("succeeded", ((String) (null)));
	//    0    0:ldc2            #316 <String "succeeded">
	//    1    3:aconst_null     
	//    2    4:invokestatic    #291 <Method void logShareResult(String, String)>
		if(facebookcallback != null)
	//*   3    7:aload_0         
	//*   4    8:ifnull          25
			facebookcallback.onSuccess(((Object) (new com.facebook.share.Sharer.Result(s))));
	//    5   11:aload_0         
	//    6   12:new             #318 <Class com.facebook.share.Sharer$Result>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokespecial   #319 <Method void com.facebook.share.Sharer$Result(String)>
	//   10   20:invokeinterface #322 <Method void FacebookCallback.onSuccess(Object)>
	//   11   25:return          
	}

	private static void logShareResult(String s, String s1)
	{
		AppEventsLogger appeventslogger = AppEventsLogger.newLogger(FacebookSdk.getApplicationContext());
	//    0    0:invokestatic    #328 <Method android.content.Context FacebookSdk.getApplicationContext()>
	//    1    3:invokestatic    #334 <Method AppEventsLogger AppEventsLogger.newLogger(android.content.Context)>
	//    2    6:astore_2        
		Bundle bundle = new Bundle();
	//    3    7:new             #113 <Class Bundle>
	//    4   10:dup             
	//    5   11:invokespecial   #335 <Method void Bundle()>
	//    6   14:astore_3        
		bundle.putString("fb_share_dialog_outcome", s);
	//    7   15:aload_3         
	//    8   16:ldc2            #337 <String "fb_share_dialog_outcome">
	//    9   19:aload_0         
	//   10   20:invokevirtual   #340 <Method void Bundle.putString(String, String)>
		if(s1 != null)
	//*  11   23:aload_1         
	//*  12   24:ifnull          35
			bundle.putString("error_message", s1);
	//   13   27:aload_3         
	//   14   28:ldc2            #342 <String "error_message">
	//   15   31:aload_1         
	//   16   32:invokevirtual   #340 <Method void Bundle.putString(String, String)>
		appeventslogger.logSdkEvent("fb_share_dialog_result", ((Double) (null)), bundle);
	//   17   35:aload_2         
	//   18   36:ldc2            #344 <String "fb_share_dialog_result">
	//   19   39:aconst_null     
	//   20   40:aload_3         
	//   21   41:invokevirtual   #348 <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
	//   22   44:return          
	}

	public static GraphRequest newUploadStagingResourceWithImageRequest(AccessToken accesstoken, Bitmap bitmap, com.facebook.GraphRequest.Callback callback)
	{
		Bundle bundle = new Bundle(1);
	//    0    0:new             #113 <Class Bundle>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:invokespecial   #351 <Method void Bundle(int)>
	//    4    8:astore_3        
		bundle.putParcelable("file", ((android.os.Parcelable) (bitmap)));
	//    5    9:aload_3         
	//    6   10:ldc1            #28  <String "file">
	//    7   12:aload_1         
	//    8   13:invokevirtual   #355 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		return new GraphRequest(accesstoken, "me/staging_resources", bundle, HttpMethod.POST, callback);
	//    9   16:new             #357 <Class GraphRequest>
	//   10   19:dup             
	//   11   20:aload_0         
	//   12   21:ldc1            #25  <String "me/staging_resources">
	//   13   23:aload_3         
	//   14   24:getstatic       #363 <Field HttpMethod HttpMethod.POST>
	//   15   27:aload_2         
	//   16   28:invokespecial   #366 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, com.facebook.GraphRequest$Callback)>
	//   17   31:areturn         
	}

	public static GraphRequest newUploadStagingResourceWithImageRequest(AccessToken accesstoken, Uri uri, com.facebook.GraphRequest.Callback callback)
		throws FileNotFoundException
	{
		if(Utility.isFileUri(uri))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #373 <Method boolean Utility.isFileUri(Uri)>
	//*   2    4:ifeq            24
			return newUploadStagingResourceWithImageRequest(accesstoken, new File(uri.getPath()), callback);
	//    3    7:aload_0         
	//    4    8:new             #375 <Class File>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokevirtual   #380 <Method String Uri.getPath()>
	//    8   16:invokespecial   #381 <Method void File(String)>
	//    9   19:aload_2         
	//   10   20:invokestatic    #384 <Method GraphRequest newUploadStagingResourceWithImageRequest(AccessToken, File, com.facebook.GraphRequest$Callback)>
	//   11   23:areturn         
		if(!Utility.isContentUri(uri))
	//*  12   24:aload_1         
	//*  13   25:invokestatic    #387 <Method boolean Utility.isContentUri(Uri)>
	//*  14   28:ifne            42
		{
			throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
	//   15   31:new             #235 <Class FacebookException>
	//   16   34:dup             
	//   17   35:ldc2            #389 <String "The image Uri must be either a file:// or content:// Uri">
	//   18   38:invokespecial   #314 <Method void FacebookException(String)>
	//   19   41:athrow          
		} else
		{
			uri = ((Uri) (new com.facebook.GraphRequest.ParcelableResourceWithMimeType(((android.os.Parcelable) (uri)), "image/png")));
	//   20   42:new             #391 <Class com.facebook.GraphRequest$ParcelableResourceWithMimeType>
	//   21   45:dup             
	//   22   46:aload_1         
	//   23   47:ldc2            #393 <String "image/png">
	//   24   50:invokespecial   #396 <Method void com.facebook.GraphRequest$ParcelableResourceWithMimeType(android.os.Parcelable, String)>
	//   25   53:astore_1        
			Bundle bundle = new Bundle(1);
	//   26   54:new             #113 <Class Bundle>
	//   27   57:dup             
	//   28   58:iconst_1        
	//   29   59:invokespecial   #351 <Method void Bundle(int)>
	//   30   62:astore_3        
			bundle.putParcelable("file", ((android.os.Parcelable) (uri)));
	//   31   63:aload_3         
	//   32   64:ldc1            #28  <String "file">
	//   33   66:aload_1         
	//   34   67:invokevirtual   #355 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			return new GraphRequest(accesstoken, "me/staging_resources", bundle, HttpMethod.POST, callback);
	//   35   70:new             #357 <Class GraphRequest>
	//   36   73:dup             
	//   37   74:aload_0         
	//   38   75:ldc1            #25  <String "me/staging_resources">
	//   39   77:aload_3         
	//   40   78:getstatic       #363 <Field HttpMethod HttpMethod.POST>
	//   41   81:aload_2         
	//   42   82:invokespecial   #366 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, com.facebook.GraphRequest$Callback)>
	//   43   85:areturn         
		}
	}

	public static GraphRequest newUploadStagingResourceWithImageRequest(AccessToken accesstoken, File file, com.facebook.GraphRequest.Callback callback)
		throws FileNotFoundException
	{
		file = ((File) (new com.facebook.GraphRequest.ParcelableResourceWithMimeType(((android.os.Parcelable) (ParcelFileDescriptor.open(file, 0x10000000))), "image/png")));
	//    0    0:new             #391 <Class com.facebook.GraphRequest$ParcelableResourceWithMimeType>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:ldc2            #398 <Int 0x10000000>
	//    4    8:invokestatic    #404 <Method ParcelFileDescriptor ParcelFileDescriptor.open(File, int)>
	//    5   11:ldc2            #393 <String "image/png">
	//    6   14:invokespecial   #396 <Method void com.facebook.GraphRequest$ParcelableResourceWithMimeType(android.os.Parcelable, String)>
	//    7   17:astore_1        
		Bundle bundle = new Bundle(1);
	//    8   18:new             #113 <Class Bundle>
	//    9   21:dup             
	//   10   22:iconst_1        
	//   11   23:invokespecial   #351 <Method void Bundle(int)>
	//   12   26:astore_3        
		bundle.putParcelable("file", ((android.os.Parcelable) (file)));
	//   13   27:aload_3         
	//   14   28:ldc1            #28  <String "file">
	//   15   30:aload_1         
	//   16   31:invokevirtual   #355 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		return new GraphRequest(accesstoken, "me/staging_resources", bundle, HttpMethod.POST, callback);
	//   17   34:new             #357 <Class GraphRequest>
	//   18   37:dup             
	//   19   38:aload_0         
	//   20   39:ldc1            #25  <String "me/staging_resources">
	//   21   41:aload_3         
	//   22   42:getstatic       #363 <Field HttpMethod HttpMethod.POST>
	//   23   45:aload_2         
	//   24   46:invokespecial   #366 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, com.facebook.GraphRequest$Callback)>
	//   25   49:areturn         
	}

	public static void registerSharerCallback(int i, CallbackManager callbackmanager, FacebookCallback facebookcallback)
	{
		if(!(callbackmanager instanceof CallbackManagerImpl))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #408 <Class CallbackManagerImpl>
	//*   2    4:ifne            18
		{
			throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
	//    3    7:new             #235 <Class FacebookException>
	//    4   10:dup             
	//    5   11:ldc2            #410 <String "Unexpected CallbackManager, please use the provided Factory.">
	//    6   14:invokespecial   #314 <Method void FacebookException(String)>
	//    7   17:athrow          
		} else
		{
			((CallbackManagerImpl)callbackmanager).registerCallback(i, new com.facebook.internal.CallbackManagerImpl.Callback(i, facebookcallback) {

				public boolean onActivityResult(int j, Intent intent)
				{
					return ShareInternalUtility.handleActivityResult(requestCode, j, intent, ShareInternalUtility.getShareResultProcessor(callback));
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field int val$requestCode>
				//    2    4:iload_1         
				//    3    5:aload_2         
				//    4    6:aload_0         
				//    5    7:getfield        #21  <Field FacebookCallback val$callback>
				//    6   10:invokestatic    #31  <Method ResultProcessor ShareInternalUtility.getShareResultProcessor(FacebookCallback)>
				//    7   13:invokestatic    #35  <Method boolean ShareInternalUtility.handleActivityResult(int, int, Intent, ResultProcessor)>
				//    8   16:ireturn         
				}

				final FacebookCallback val$callback;
				final int val$requestCode;

			
			{
				requestCode = i;
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:putfield        #19  <Field int val$requestCode>
				callback = facebookcallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field FacebookCallback val$callback>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    8   18:aload_1         
	//    9   19:checkcast       #408 <Class CallbackManagerImpl>
	//   10   22:iload_0         
	//   11   23:new             #10  <Class ShareInternalUtility$3>
	//   12   26:dup             
	//   13   27:iload_0         
	//   14   28:aload_2         
	//   15   29:invokespecial   #413 <Method void ShareInternalUtility$3(int, FacebookCallback)>
	//   16   32:invokevirtual   #417 <Method void CallbackManagerImpl.registerCallback(int, com.facebook.internal.CallbackManagerImpl$Callback)>
			return;
	//   17   35:return          
		}
	}

	public static void registerStaticShareCallback(int i)
	{
		CallbackManagerImpl.registerStaticCallback(i, new com.facebook.internal.CallbackManagerImpl.Callback(i) {

			public boolean onActivityResult(int j, Intent intent)
			{
				return ShareInternalUtility.handleActivityResult(requestCode, j, intent, ShareInternalUtility.getShareResultProcessor(((FacebookCallback) (null))));
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field int val$requestCode>
			//    2    4:iload_1         
			//    3    5:aload_2         
			//    4    6:aconst_null     
			//    5    7:invokestatic    #26  <Method ResultProcessor ShareInternalUtility.getShareResultProcessor(FacebookCallback)>
			//    6   10:invokestatic    #30  <Method boolean ShareInternalUtility.handleActivityResult(int, int, Intent, ResultProcessor)>
			//    7   13:ireturn         
			}

			final int val$requestCode;

			
			{
				requestCode = i;
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:putfield        #16  <Field int val$requestCode>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:iload_0         
	//    1    1:new             #8   <Class ShareInternalUtility$2>
	//    2    4:dup             
	//    3    5:iload_0         
	//    4    6:invokespecial   #420 <Method void ShareInternalUtility$2(int)>
	//    5    9:invokestatic    #423 <Method void CallbackManagerImpl.registerStaticCallback(int, com.facebook.internal.CallbackManagerImpl$Callback)>
	//    6   12:return          
	}

	public static JSONArray removeNamespacesFromOGJsonArray(JSONArray jsonarray, boolean flag)
		throws JSONException
	{
		JSONArray jsonarray1 = new JSONArray();
	//    0    0:new             #429 <Class JSONArray>
	//    1    3:dup             
	//    2    4:invokespecial   #430 <Method void JSONArray()>
	//    3    7:astore          5
		for(int i = 0; i < jsonarray.length(); i++)
	//*   4    9:iconst_0        
	//*   5   10:istore_2        
	//*   6   11:iload_2         
	//*   7   12:aload_0         
	//*   8   13:invokevirtual   #431 <Method int JSONArray.length()>
	//*   9   16:icmpge          82
		{
			Object obj1 = jsonarray.get(i);
	//   10   19:aload_0         
	//   11   20:iload_2         
	//   12   21:invokevirtual   #435 <Method Object JSONArray.get(int)>
	//   13   24:astore          4
			Object obj;
			if(obj1 instanceof JSONArray)
	//*  14   26:aload           4
	//*  15   28:instanceof      #429 <Class JSONArray>
	//*  16   31:ifeq            47
			{
				obj = ((Object) (removeNamespacesFromOGJsonArray((JSONArray)obj1, flag)));
	//   17   34:aload           4
	//   18   36:checkcast       #429 <Class JSONArray>
	//   19   39:iload_1         
	//   20   40:invokestatic    #437 <Method JSONArray removeNamespacesFromOGJsonArray(JSONArray, boolean)>
	//   21   43:astore_3        
			} else
	//*  22   44:goto            68
			{
				obj = obj1;
	//   23   47:aload           4
	//   24   49:astore_3        
				if(obj1 instanceof JSONObject)
	//*  25   50:aload           4
	//*  26   52:instanceof      #439 <Class JSONObject>
	//*  27   55:ifeq            68
					obj = ((Object) (removeNamespacesFromOGJsonObject((JSONObject)obj1, flag)));
	//   28   58:aload           4
	//   29   60:checkcast       #439 <Class JSONObject>
	//   30   63:iload_1         
	//   31   64:invokestatic    #443 <Method JSONObject removeNamespacesFromOGJsonObject(JSONObject, boolean)>
	//   32   67:astore_3        
			}
			jsonarray1.put(obj);
	//   33   68:aload           5
	//   34   70:aload_3         
	//   35   71:invokevirtual   #447 <Method JSONArray JSONArray.put(Object)>
	//   36   74:pop             
		}

	//   37   75:iload_2         
	//   38   76:iconst_1        
	//   39   77:iadd            
	//   40   78:istore_2        
	//*  41   79:goto            11
		return jsonarray1;
	//   42   82:aload           5
	//   43   84:areturn         
	}

	public static JSONObject removeNamespacesFromOGJsonObject(JSONObject jsonobject, boolean flag)
	{
		int i;
		if(jsonobject == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		Object obj;
		Object obj1;
		JSONObject jsonobject1;
		JSONObject jsonobject2;
		JSONArray jsonarray;
		String s;
		Object obj2;
		try
		{
			jsonobject1 = new JSONObject();
	//    4    6:new             #439 <Class JSONObject>
	//    5    9:dup             
	//    6   10:invokespecial   #448 <Method void JSONObject()>
	//    7   13:astore          5
			jsonobject2 = new JSONObject();
	//    8   15:new             #439 <Class JSONObject>
	//    9   18:dup             
	//   10   19:invokespecial   #448 <Method void JSONObject()>
	//   11   22:astore          6
			jsonarray = jsonobject.names();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #452 <Method JSONArray JSONObject.names()>
	//   14   28:astore          7
		}
	//*  15   30:iconst_0        
	//*  16   31:istore_2        
	//*  17   32:iload_2         
	//*  18   33:aload           7
	//*  19   35:invokevirtual   #431 <Method int JSONArray.length()>
	//*  20   38:icmpge          241
	//*  21   41:aload           7
	//*  22   43:iload_2         
	//*  23   44:invokevirtual   #454 <Method String JSONArray.getString(int)>
	//*  24   47:astore          8
	//*  25   49:aload_0         
	//*  26   50:aload           8
	//*  27   52:invokevirtual   #457 <Method Object JSONObject.get(String)>
	//*  28   55:astore          4
	//*  29   57:aload           4
	//*  30   59:instanceof      #439 <Class JSONObject>
	//*  31   62:ifeq            78
	//*  32   65:aload           4
	//*  33   67:checkcast       #439 <Class JSONObject>
	//*  34   70:iconst_1        
	//*  35   71:invokestatic    #443 <Method JSONObject removeNamespacesFromOGJsonObject(JSONObject, boolean)>
	//*  36   74:astore_3        
	//*  37   75:goto            99
	//*  38   78:aload           4
	//*  39   80:astore_3        
	//*  40   81:aload           4
	//*  41   83:instanceof      #429 <Class JSONArray>
	//*  42   86:ifeq            99
	//*  43   89:aload           4
	//*  44   91:checkcast       #429 <Class JSONArray>
	//*  45   94:iconst_1        
	//*  46   95:invokestatic    #437 <Method JSONArray removeNamespacesFromOGJsonArray(JSONArray, boolean)>
	//*  47   98:astore_3        
	//*  48   99:aload           8
	//*  49  101:invokestatic    #459 <Method Pair getFieldNameAndNamespaceFromFullName(String)>
	//*  50  104:astore          9
	//*  51  106:aload           9
	//*  52  108:getfield        #463 <Field Object Pair.first>
	//*  53  111:checkcast       #75  <Class String>
	//*  54  114:astore          4
	//*  55  116:aload           9
	//*  56  118:getfield        #466 <Field Object Pair.second>
	//*  57  121:checkcast       #75  <Class String>
	//*  58  124:astore          9
	//*  59  126:iload_1         
	//*  60  127:ifeq            201
	//*  61  130:aload           4
	//*  62  132:ifnull          158
	//*  63  135:aload           4
	//*  64  137:ldc2            #468 <String "fbsdk">
	//*  65  140:invokevirtual   #471 <Method boolean String.equals(Object)>
	//*  66  143:ifeq            158
	//*  67  146:aload           5
	//*  68  148:aload           8
	//*  69  150:aload_3         
	//*  70  151:invokevirtual   #474 <Method JSONObject JSONObject.put(String, Object)>
	//*  71  154:pop             
	//*  72  155:goto            278
	//*  73  158:aload           4
	//*  74  160:ifnull          189
	//*  75  163:aload           4
	//*  76  165:ldc2            #476 <String "og">
	//*  77  168:invokevirtual   #471 <Method boolean String.equals(Object)>
	//*  78  171:ifeq            177
	//*  79  174:goto            189
	//*  80  177:aload           6
	//*  81  179:aload           9
	//*  82  181:aload_3         
	//*  83  182:invokevirtual   #474 <Method JSONObject JSONObject.put(String, Object)>
	//*  84  185:pop             
	//*  85  186:goto            278
	//*  86  189:aload           5
	//*  87  191:aload           9
	//*  88  193:aload_3         
	//*  89  194:invokevirtual   #474 <Method JSONObject JSONObject.put(String, Object)>
	//*  90  197:pop             
	//*  91  198:goto            278
	//*  92  201:aload           4
	//*  93  203:ifnull          229
	//*  94  206:aload           4
	//*  95  208:ldc2            #478 <String "fb">
	//*  96  211:invokevirtual   #471 <Method boolean String.equals(Object)>
	//*  97  214:ifeq            229
	//*  98  217:aload           5
	//*  99  219:aload           8
	//* 100  221:aload_3         
	//* 101  222:invokevirtual   #474 <Method JSONObject JSONObject.put(String, Object)>
	//* 102  225:pop             
	//* 103  226:goto            278
	//* 104  229:aload           5
	//* 105  231:aload           9
	//* 106  233:aload_3         
	//* 107  234:invokevirtual   #474 <Method JSONObject JSONObject.put(String, Object)>
	//* 108  237:pop             
	//* 109  238:goto            278
	//* 110  241:aload           6
	//* 111  243:invokevirtual   #479 <Method int JSONObject.length()>
	//* 112  246:ifle            260
	//* 113  249:aload           5
	//* 114  251:ldc2            #481 <String "data">
	//* 115  254:aload           6
	//* 116  256:invokevirtual   #474 <Method JSONObject JSONObject.put(String, Object)>
	//* 117  259:pop             
	//* 118  260:aload           5
	//* 119  262:areturn         
	//* 120  263:new             #235 <Class FacebookException>
	//* 121  266:dup             
	//* 122  267:ldc2            #483 <String "Failed to create json object from share content">
	//* 123  270:invokespecial   #314 <Method void FacebookException(String)>
	//* 124  273:athrow          
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
		{
			throw new FacebookException("Failed to create json object from share content");
		}
		i = 0;
_L2:
		if(i >= jsonarray.length())
			break MISSING_BLOCK_LABEL_241;
		s = jsonarray.getString(i);
		obj1 = jsonobject.get(s);
		if(obj1 instanceof JSONObject)
		{
			obj = ((Object) (removeNamespacesFromOGJsonObject((JSONObject)obj1, true)));
			break MISSING_BLOCK_LABEL_99;
		}
		obj = obj1;
		if(obj1 instanceof JSONArray)
			obj = ((Object) (removeNamespacesFromOGJsonArray((JSONArray)obj1, true)));
		obj2 = ((Object) (getFieldNameAndNamespaceFromFullName(s)));
		obj1 = ((Object) ((String)((Pair) (obj2)).first));
		obj2 = ((Object) ((String)((Pair) (obj2)).second));
		if(!flag)
			break MISSING_BLOCK_LABEL_201;
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_158;
		if(((String) (obj1)).equals("fbsdk"))
		{
			jsonobject1.put(s, obj);
			break MISSING_BLOCK_LABEL_278;
		}
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_189;
		if(((String) (obj1)).equals("og"))
			break MISSING_BLOCK_LABEL_189;
		jsonobject2.put(((String) (obj2)), obj);
		break MISSING_BLOCK_LABEL_278;
		jsonobject1.put(((String) (obj2)), obj);
		break MISSING_BLOCK_LABEL_278;
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_229;
		if(((String) (obj1)).equals("fb"))
		{
			jsonobject1.put(s, obj);
			break MISSING_BLOCK_LABEL_278;
		}
		jsonobject1.put(((String) (obj2)), obj);
		break MISSING_BLOCK_LABEL_278;
		if(jsonobject2.length() > 0)
			jsonobject1.put("data", ((Object) (jsonobject2)));
		return jsonobject1;
	//* 125  274:astore_0        
	//* 126  275:goto            263
		i++;
	//  127  278:iload_2         
	//  128  279:iconst_1        
	//  129  280:iadd            
	//  130  281:istore_2        
		if(true) goto _L2; else goto _L1
	//  131  282:goto            32
_L1:
	}

	public static JSONObject toJSONObjectForCall(UUID uuid, ShareOpenGraphContent shareopengraphcontent)
		throws JSONException
	{
		Object obj = ((Object) (shareopengraphcontent.getAction()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #491 <Method com.facebook.share.model.ShareOpenGraphAction ShareOpenGraphContent.getAction()>
	//    2    4:astore_2        
		ArrayList arraylist = new ArrayList();
	//    3    5:new             #174 <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #492 <Method void ArrayList()>
	//    6   12:astore_3        
		obj = ((Object) (OpenGraphJSONUtility.toJSONObject(((com.facebook.share.model.ShareOpenGraphAction) (obj)), new OpenGraphJSONUtility.PhotoJSONProcessor(uuid, arraylist) {

			public JSONObject toJSONObject(SharePhoto sharephoto)
			{
				com.facebook.internal.NativeAppCallAttachmentStore.Attachment attachment = ShareInternalUtility.getAttachment(callId, sharephoto);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field UUID val$callId>
			//    2    4:aload_1         
			//    3    5:invokestatic    #33  <Method com.facebook.internal.NativeAppCallAttachmentStore$Attachment ShareInternalUtility.access$000(UUID, SharePhoto)>
			//    4    8:astore_2        
				if(attachment == null)
			//*   5    9:aload_2         
			//*   6   10:ifnonnull       15
					return null;
			//    7   13:aconst_null     
			//    8   14:areturn         
				attachments.add(((Object) (attachment)));
			//    9   15:aload_0         
			//   10   16:getfield        #21  <Field ArrayList val$attachments>
			//   11   19:aload_2         
			//   12   20:invokevirtual   #39  <Method boolean ArrayList.add(Object)>
			//   13   23:pop             
				JSONObject jsonobject = new JSONObject();
			//   14   24:new             #41  <Class JSONObject>
			//   15   27:dup             
			//   16   28:invokespecial   #42  <Method void JSONObject()>
			//   17   31:astore_3        
				try
				{
					jsonobject.put("url", ((Object) (attachment.getAttachmentUrl())));
			//   18   32:aload_3         
			//   19   33:ldc1            #44  <String "url">
			//   20   35:aload_2         
			//   21   36:invokevirtual   #50  <Method String com.facebook.internal.NativeAppCallAttachmentStore$Attachment.getAttachmentUrl()>
			//   22   39:invokevirtual   #54  <Method JSONObject JSONObject.put(String, Object)>
			//   23   42:pop             
					if(sharephoto.getUserGenerated())
			//*  24   43:aload_1         
			//*  25   44:invokevirtual   #60  <Method boolean SharePhoto.getUserGenerated()>
			//*  26   47:ifeq            58
						jsonobject.put("user_generated", true);
			//   27   50:aload_3         
			//   28   51:ldc1            #62  <String "user_generated">
			//   29   53:iconst_1        
			//   30   54:invokevirtual   #65  <Method JSONObject JSONObject.put(String, boolean)>
			//   31   57:pop             
				}
			//*  32   58:aload_3         
			//*  33   59:areturn         
				// Misplaced declaration of an exception variable
				catch(SharePhoto sharephoto)
			//*  34   60:astore_1        
				{
					throw new FacebookException("Unable to attach images", ((Throwable) (sharephoto)));
			//   35   61:new             #67  <Class FacebookException>
			//   36   64:dup             
			//   37   65:ldc1            #69  <String "Unable to attach images">
			//   38   67:aload_1         
			//   39   68:invokespecial   #72  <Method void FacebookException(String, Throwable)>
			//   40   71:athrow          
				}
				return jsonobject;
			}

			final ArrayList val$attachments;
			final UUID val$callId;

			
			{
				callId = uuid;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field UUID val$callId>
				attachments = arraylist;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field ArrayList val$attachments>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
)));
	//    7   13:aload_2         
	//    8   14:new             #16  <Class ShareInternalUtility$6>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:aload_3         
	//   12   20:invokespecial   #495 <Method void ShareInternalUtility$6(UUID, ArrayList)>
	//   13   23:invokestatic    #501 <Method JSONObject OpenGraphJSONUtility.toJSONObject(com.facebook.share.model.ShareOpenGraphAction, OpenGraphJSONUtility$PhotoJSONProcessor)>
	//   14   26:astore_2        
		NativeAppCallAttachmentStore.addAttachments(((java.util.Collection) (arraylist)));
	//   15   27:aload_3         
	//   16   28:invokestatic    #145 <Method void NativeAppCallAttachmentStore.addAttachments(java.util.Collection)>
		if(shareopengraphcontent.getPlaceId() != null && Utility.isNullOrEmpty(((JSONObject) (obj)).optString("place")))
	//*  17   31:aload_1         
	//*  18   32:invokevirtual   #504 <Method String ShareOpenGraphContent.getPlaceId()>
	//*  19   35:ifnull          63
	//*  20   38:aload_2         
	//*  21   39:ldc2            #506 <String "place">
	//*  22   42:invokevirtual   #509 <Method String JSONObject.optString(String)>
	//*  23   45:invokestatic    #274 <Method boolean Utility.isNullOrEmpty(String)>
	//*  24   48:ifeq            63
			((JSONObject) (obj)).put("place", ((Object) (shareopengraphcontent.getPlaceId())));
	//   25   51:aload_2         
	//   26   52:ldc2            #506 <String "place">
	//   27   55:aload_1         
	//   28   56:invokevirtual   #504 <Method String ShareOpenGraphContent.getPlaceId()>
	//   29   59:invokevirtual   #474 <Method JSONObject JSONObject.put(String, Object)>
	//   30   62:pop             
		if(shareopengraphcontent.getPeopleIds() != null)
	//*  31   63:aload_1         
	//*  32   64:invokevirtual   #512 <Method List ShareOpenGraphContent.getPeopleIds()>
	//*  33   67:ifnull          152
		{
			uuid = ((UUID) (((JSONObject) (obj)).optJSONArray("tags")));
	//   34   70:aload_2         
	//   35   71:ldc2            #514 <String "tags">
	//   36   74:invokevirtual   #518 <Method JSONArray JSONObject.optJSONArray(String)>
	//   37   77:astore_0        
			if(uuid == null)
	//*  38   78:aload_0         
	//*  39   79:ifnonnull       93
				uuid = ((UUID) (new HashSet()));
	//   40   82:new             #520 <Class HashSet>
	//   41   85:dup             
	//   42   86:invokespecial   #521 <Method void HashSet()>
	//   43   89:astore_0        
			else
	//*  44   90:goto            98
				uuid = ((UUID) (Utility.jsonArrayToSet(((JSONArray) (uuid)))));
	//   45   93:aload_0         
	//   46   94:invokestatic    #525 <Method Set Utility.jsonArrayToSet(JSONArray)>
	//   47   97:astore_0        
			for(shareopengraphcontent = ((ShareOpenGraphContent) (shareopengraphcontent.getPeopleIds().iterator())); ((Iterator) (shareopengraphcontent)).hasNext(); ((Set) (uuid)).add(((Object) ((String)((Iterator) (shareopengraphcontent)).next()))));
	//   48   98:aload_1         
	//   49   99:invokevirtual   #512 <Method List ShareOpenGraphContent.getPeopleIds()>
	//   50  102:invokeinterface #531 <Method Iterator List.iterator()>
	//   51  107:astore_1        
	//   52  108:aload_1         
	//   53  109:invokeinterface #537 <Method boolean Iterator.hasNext()>
	//   54  114:ifeq            136
	//   55  117:aload_0         
	//   56  118:aload_1         
	//   57  119:invokeinterface #541 <Method Object Iterator.next()>
	//   58  124:checkcast       #75  <Class String>
	//   59  127:invokeinterface #544 <Method boolean Set.add(Object)>
	//   60  132:pop             
	//*  61  133:goto            108
			((JSONObject) (obj)).put("tags", ((Object) (new ArrayList(((java.util.Collection) (uuid))))));
	//   62  136:aload_2         
	//   63  137:ldc2            #514 <String "tags">
	//   64  140:new             #174 <Class ArrayList>
	//   65  143:dup             
	//   66  144:aload_0         
	//   67  145:invokespecial   #546 <Method void ArrayList(java.util.Collection)>
	//   68  148:invokevirtual   #474 <Method JSONObject JSONObject.put(String, Object)>
	//   69  151:pop             
		}
		return ((JSONObject) (obj));
	//   70  152:aload_2         
	//   71  153:areturn         
	}

	public static JSONObject toJSONObjectForWeb(ShareOpenGraphContent shareopengraphcontent)
		throws JSONException
	{
		return OpenGraphJSONUtility.toJSONObject(shareopengraphcontent.getAction(), new OpenGraphJSONUtility.PhotoJSONProcessor() {

			public JSONObject toJSONObject(SharePhoto sharephoto)
			{
				sharephoto = ((SharePhoto) (sharephoto.getImageUrl()));
			//    0    0:aload_1         
			//    1    1:invokevirtual   #26  <Method Uri SharePhoto.getImageUrl()>
			//    2    4:astore_1        
				JSONObject jsonobject = new JSONObject();
			//    3    5:new             #28  <Class JSONObject>
			//    4    8:dup             
			//    5    9:invokespecial   #29  <Method void JSONObject()>
			//    6   12:astore_2        
				try
				{
					jsonobject.put("url", ((Object) (((Uri) (sharephoto)).toString())));
			//    7   13:aload_2         
			//    8   14:ldc1            #31  <String "url">
			//    9   16:aload_1         
			//   10   17:invokevirtual   #37  <Method String Uri.toString()>
			//   11   20:invokevirtual   #41  <Method JSONObject JSONObject.put(String, Object)>
			//   12   23:pop             
				}
			//*  13   24:aload_2         
			//*  14   25:areturn         
				// Misplaced declaration of an exception variable
				catch(SharePhoto sharephoto)
			//*  15   26:astore_1        
				{
					throw new FacebookException("Unable to attach images", ((Throwable) (sharephoto)));
			//   16   27:new             #43  <Class FacebookException>
			//   17   30:dup             
			//   18   31:ldc1            #45  <String "Unable to attach images">
			//   19   33:aload_1         
			//   20   34:invokespecial   #48  <Method void FacebookException(String, Throwable)>
			//   21   37:athrow          
				}
				return jsonobject;
			}

		}
);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #491 <Method com.facebook.share.model.ShareOpenGraphAction ShareOpenGraphContent.getAction()>
	//    2    4:new             #18  <Class ShareInternalUtility$7>
	//    3    7:dup             
	//    4    8:invokespecial   #549 <Method void ShareInternalUtility$7()>
	//    5   11:invokestatic    #501 <Method JSONObject OpenGraphJSONUtility.toJSONObject(com.facebook.share.model.ShareOpenGraphAction, OpenGraphJSONUtility$PhotoJSONProcessor)>
	//    6   14:areturn         
	}

	public static final String MY_PHOTOS = "me/photos";
	private static final String MY_STAGING_RESOURCES = "me/staging_resources";
	private static final String STAGING_PARAM = "file";


/*
	static com.facebook.internal.NativeAppCallAttachmentStore.Attachment access$000(UUID uuid, SharePhoto sharephoto)
	{
		return getAttachment(uuid, sharephoto);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #38  <Method com.facebook.internal.NativeAppCallAttachmentStore$Attachment getAttachment(UUID, SharePhoto)>
	//    3    5:areturn         
	}

*/
}