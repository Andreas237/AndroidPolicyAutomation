// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookCallback;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.DialogFeature;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.NativeAppCallAttachmentStore;
import com.facebook.internal.Utility;
import com.facebook.share.Sharer;
import com.facebook.share.internal.CameraEffectFeature;
import com.facebook.share.internal.LegacyNativeDialogParameters;
import com.facebook.share.internal.NativeDialogParameters;
import com.facebook.share.internal.OpenGraphActionDialogFeature;
import com.facebook.share.internal.ShareContentValidation;
import com.facebook.share.internal.ShareDialogFeature;
import com.facebook.share.internal.ShareFeedContent;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.internal.ShareStoryFeature;
import com.facebook.share.internal.WebDialogParameters;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class ShareDialog extends FacebookDialogBase
	implements Sharer
{
	private class CameraEffectHandler extends com.facebook.internal.FacebookDialogBase.ModeHandler
	{

		public boolean canShow(ShareContent sharecontent, boolean flag)
		{
			return (sharecontent instanceof ShareCameraEffectContent) && ShareDialog.canShowNative(((Object) (sharecontent)).getClass());
		//    0    0:aload_1         
		//    1    1:instanceof      #27  <Class ShareCameraEffectContent>
		//    2    4:ifeq            19
		//    3    7:aload_1         
		//    4    8:invokevirtual   #33  <Method Class Object.getClass()>
		//    5   11:invokestatic    #37  <Method boolean ShareDialog.access$500(Class)>
		//    6   14:ifeq            19
		//    7   17:iconst_1        
		//    8   18:ireturn         
		//    9   19:iconst_0        
		//   10   20:ireturn         
		}

		public volatile boolean canShow(Object obj, boolean flag)
		{
			return canShow((ShareContent)obj, flag);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #40  <Class ShareContent>
		//    3    5:iload_2         
		//    4    6:invokevirtual   #42  <Method boolean canShow(ShareContent, boolean)>
		//    5    9:ireturn         
		}

		public AppCall createAppCall(final ShareContent content)
		{
			ShareContentValidation.validateForNativeShare(content);
		//    0    0:aload_1         
		//    1    1:invokestatic    #50  <Method void ShareContentValidation.validateForNativeShare(ShareContent)>
			final AppCall appCall = createBaseAppCall();
		//    2    4:aload_0         
		//    3    5:getfield        #16  <Field ShareDialog this$0>
		//    4    8:invokevirtual   #54  <Method AppCall ShareDialog.createBaseAppCall()>
		//    5   11:astore_2        
			DialogPresenter.setupAppCallForNativeDialog(appCall, ((_cls1) (getShouldFailOnDataError())). new com.facebook.internal.DialogPresenter.ParameterProvider() {

				public Bundle getLegacyParameters()
				{
					return LegacyNativeDialogParameters.create(appCall.getCallId(), content, shouldFailOnDataError);
				//    0    0:aload_0         
				//    1    1:getfield        #28  <Field AppCall val$appCall>
				//    2    4:invokevirtual   #44  <Method UUID AppCall.getCallId()>
				//    3    7:aload_0         
				//    4    8:getfield        #30  <Field ShareContent val$content>
				//    5   11:aload_0         
				//    6   12:getfield        #32  <Field boolean val$shouldFailOnDataError>
				//    7   15:invokestatic    #50  <Method Bundle LegacyNativeDialogParameters.create(UUID, ShareContent, boolean)>
				//    8   18:areturn         
				}

				public Bundle getParameters()
				{
					return NativeDialogParameters.create(appCall.getCallId(), content, shouldFailOnDataError);
				//    0    0:aload_0         
				//    1    1:getfield        #28  <Field AppCall val$appCall>
				//    2    4:invokevirtual   #44  <Method UUID AppCall.getCallId()>
				//    3    7:aload_0         
				//    4    8:getfield        #30  <Field ShareContent val$content>
				//    5   11:aload_0         
				//    6   12:getfield        #32  <Field boolean val$shouldFailOnDataError>
				//    7   15:invokestatic    #54  <Method Bundle NativeDialogParameters.create(UUID, ShareContent, boolean)>
				//    8   18:areturn         
				}

				final CameraEffectHandler this$1;
				final AppCall val$appCall;
				final ShareContent val$content;
				final boolean val$shouldFailOnDataError;

			
			{
				this$1 = final_cameraeffecthandler;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field ShareDialog$CameraEffectHandler this$1>
				appCall = appcall;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field AppCall val$appCall>
				content = sharecontent;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field ShareContent val$content>
				shouldFailOnDataError = Z.this;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #32  <Field boolean val$shouldFailOnDataError>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #35  <Method void Object()>
			//   14   25:return          
			}
			}
, ShareDialog.getFeature(((Object) (content)).getClass()));
		//    6   12:aload_2         
		//    7   13:new             #10  <Class ShareDialog$CameraEffectHandler$1>
		//    8   16:dup             
		//    9   17:aload_0         
		//   10   18:aload_2         
		//   11   19:aload_1         
		//   12   20:aload_0         
		//   13   21:getfield        #16  <Field ShareDialog this$0>
		//   14   24:invokevirtual   #58  <Method boolean ShareDialog.getShouldFailOnDataError()>
		//   15   27:invokespecial   #61  <Method void ShareDialog$CameraEffectHandler$1(ShareDialog$CameraEffectHandler, AppCall, ShareContent, boolean)>
		//   16   30:aload_1         
		//   17   31:invokevirtual   #33  <Method Class Object.getClass()>
		//   18   34:invokestatic    #65  <Method DialogFeature ShareDialog.access$800(Class)>
		//   19   37:invokestatic    #71  <Method void DialogPresenter.setupAppCallForNativeDialog(AppCall, com.facebook.internal.DialogPresenter$ParameterProvider, DialogFeature)>
			return appCall;
		//   20   40:aload_2         
		//   21   41:areturn         
		}

		public volatile AppCall createAppCall(Object obj)
		{
			return createAppCall((ShareContent)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #40  <Class ShareContent>
		//    3    5:invokevirtual   #74  <Method AppCall createAppCall(ShareContent)>
		//    4    8:areturn         
		}

		public Object getMode()
		{
			return ((Object) (Mode.NATIVE));
		//    0    0:getstatic       #82  <Field ShareDialog$Mode ShareDialog$Mode.NATIVE>
		//    1    3:areturn         
		}

		final ShareDialog this$0;

		private CameraEffectHandler()
		{
			this$0 = ShareDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field ShareDialog this$0>
			super(((FacebookDialogBase) (ShareDialog.this)));
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #19  <Method void com.facebook.internal.FacebookDialogBase$ModeHandler(FacebookDialogBase)>
		//    6   10:return          
		}

	}

	private class FeedHandler extends com.facebook.internal.FacebookDialogBase.ModeHandler
	{

		public boolean canShow(ShareContent sharecontent, boolean flag)
		{
			return (sharecontent instanceof ShareLinkContent) || (sharecontent instanceof ShareFeedContent);
		//    0    0:aload_1         
		//    1    1:instanceof      #25  <Class ShareLinkContent>
		//    2    4:ifne            19
		//    3    7:aload_1         
		//    4    8:instanceof      #27  <Class ShareFeedContent>
		//    5   11:ifeq            17
		//    6   14:goto            19
		//    7   17:iconst_0        
		//    8   18:ireturn         
		//    9   19:iconst_1        
		//   10   20:ireturn         
		}

		public volatile boolean canShow(Object obj, boolean flag)
		{
			return canShow((ShareContent)obj, flag);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #30  <Class ShareContent>
		//    3    5:iload_2         
		//    4    6:invokevirtual   #32  <Method boolean canShow(ShareContent, boolean)>
		//    5    9:ireturn         
		}

		public AppCall createAppCall(ShareContent sharecontent)
		{
			Object obj = ((Object) (ShareDialog.this));
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field ShareDialog this$0>
		//    2    4:astore_2        
			((ShareDialog) (obj)).logDialogShare(((Context) (((ShareDialog) (obj)).getActivityContext())), sharecontent, Mode.FEED);
		//    3    5:aload_2         
		//    4    6:aload_2         
		//    5    7:invokestatic    #38  <Method Activity ShareDialog.access$1100(ShareDialog)>
		//    6   10:aload_1         
		//    7   11:getstatic       #44  <Field ShareDialog$Mode ShareDialog$Mode.FEED>
		//    8   14:invokestatic    #48  <Method void ShareDialog.access$700(ShareDialog, Context, ShareContent, ShareDialog$Mode)>
			obj = ((Object) (createBaseAppCall()));
		//    9   17:aload_0         
		//   10   18:getfield        #14  <Field ShareDialog this$0>
		//   11   21:invokevirtual   #52  <Method AppCall ShareDialog.createBaseAppCall()>
		//   12   24:astore_2        
			if(sharecontent instanceof ShareLinkContent)
		//*  13   25:aload_1         
		//*  14   26:instanceof      #25  <Class ShareLinkContent>
		//*  15   29:ifeq            49
			{
				sharecontent = ((ShareContent) ((ShareLinkContent)sharecontent));
		//   16   32:aload_1         
		//   17   33:checkcast       #25  <Class ShareLinkContent>
		//   18   36:astore_1        
				ShareContentValidation.validateForWebShare(sharecontent);
		//   19   37:aload_1         
		//   20   38:invokestatic    #58  <Method void ShareContentValidation.validateForWebShare(ShareContent)>
				sharecontent = ((ShareContent) (WebDialogParameters.createForFeed(((ShareLinkContent) (sharecontent)))));
		//   21   41:aload_1         
		//   22   42:invokestatic    #64  <Method Bundle WebDialogParameters.createForFeed(ShareLinkContent)>
		//   23   45:astore_1        
			} else
		//*  24   46:goto            57
			{
				sharecontent = ((ShareContent) (WebDialogParameters.createForFeed((ShareFeedContent)sharecontent)));
		//   25   49:aload_1         
		//   26   50:checkcast       #27  <Class ShareFeedContent>
		//   27   53:invokestatic    #67  <Method Bundle WebDialogParameters.createForFeed(ShareFeedContent)>
		//   28   56:astore_1        
			}
			DialogPresenter.setupAppCallForWebDialog(((AppCall) (obj)), "feed", ((Bundle) (sharecontent)));
		//   29   57:aload_2         
		//   30   58:ldc1            #69  <String "feed">
		//   31   60:aload_1         
		//   32   61:invokestatic    #75  <Method void DialogPresenter.setupAppCallForWebDialog(AppCall, String, Bundle)>
			return ((AppCall) (obj));
		//   33   64:aload_2         
		//   34   65:areturn         
		}

		public volatile AppCall createAppCall(Object obj)
		{
			return createAppCall((ShareContent)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #30  <Class ShareContent>
		//    3    5:invokevirtual   #78  <Method AppCall createAppCall(ShareContent)>
		//    4    8:areturn         
		}

		public Object getMode()
		{
			return ((Object) (Mode.FEED));
		//    0    0:getstatic       #44  <Field ShareDialog$Mode ShareDialog$Mode.FEED>
		//    1    3:areturn         
		}

		final ShareDialog this$0;

		private FeedHandler()
		{
			this$0 = ShareDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field ShareDialog this$0>
			super(((FacebookDialogBase) (ShareDialog.this)));
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #17  <Method void com.facebook.internal.FacebookDialogBase$ModeHandler(FacebookDialogBase)>
		//    6   10:return          
		}

	}

	public static final class Mode extends Enum
	{

		public static Mode valueOf(String s)
		{
			return (Mode)Enum.valueOf(com/facebook/share/widget/ShareDialog$Mode, s);
		//    0    0:ldc1            #2   <Class ShareDialog$Mode>
		//    1    2:aload_0         
		//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ShareDialog$Mode>
		//    4    9:areturn         
		}

		public static Mode[] values()
		{
			return (Mode[])((Mode []) ($VALUES)).clone();
		//    0    0:getstatic       #35  <Field ShareDialog$Mode[] $VALUES>
		//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.facebook.share.widget.ShareDialog$Mode_3B_.clone()>
		//    2    6:checkcast       #46  <Class ShareDialog$Mode[]>
		//    3    9:areturn         
		}

		private static final Mode $VALUES[];
		public static final Mode AUTOMATIC;
		public static final Mode FEED;
		public static final Mode NATIVE;
		public static final Mode WEB;

		static 
		{
			AUTOMATIC = new Mode("AUTOMATIC", 0);
		//    0    0:new             #2   <Class ShareDialog$Mode>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "AUTOMATIC">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void ShareDialog$Mode(String, int)>
		//    5   10:putstatic       #24  <Field ShareDialog$Mode AUTOMATIC>
			NATIVE = new Mode("NATIVE", 1);
		//    6   13:new             #2   <Class ShareDialog$Mode>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "NATIVE">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void ShareDialog$Mode(String, int)>
		//   11   23:putstatic       #27  <Field ShareDialog$Mode NATIVE>
			WEB = new Mode("WEB", 2);
		//   12   26:new             #2   <Class ShareDialog$Mode>
		//   13   29:dup             
		//   14   30:ldc1            #28  <String "WEB">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void ShareDialog$Mode(String, int)>
		//   17   36:putstatic       #30  <Field ShareDialog$Mode WEB>
			FEED = new Mode("FEED", 3);
		//   18   39:new             #2   <Class ShareDialog$Mode>
		//   19   42:dup             
		//   20   43:ldc1            #31  <String "FEED">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void ShareDialog$Mode(String, int)>
		//   23   49:putstatic       #33  <Field ShareDialog$Mode FEED>
			$VALUES = (new Mode[] {
				AUTOMATIC, NATIVE, WEB, FEED
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       Mode[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field ShareDialog$Mode AUTOMATIC>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #27  <Field ShareDialog$Mode NATIVE>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #30  <Field ShareDialog$Mode WEB>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #33  <Field ShareDialog$Mode FEED>
		//   41   79:aastore         
		//   42   80:putstatic       #35  <Field ShareDialog$Mode[] $VALUES>
		//*  43   83:return          
		}

		private Mode(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	private class NativeHandler extends com.facebook.internal.FacebookDialogBase.ModeHandler
	{

		public boolean canShow(ShareContent sharecontent, boolean flag)
		{
			boolean flag3 = false;
		//    0    0:iconst_0        
		//    1    1:istore          4
			if(sharecontent != null && !(sharecontent instanceof ShareCameraEffectContent))
		//*   2    3:aload_1         
		//*   3    4:ifnull          108
		//*   4    7:aload_1         
		//*   5    8:instanceof      #27  <Class ShareCameraEffectContent>
		//*   6   11:ifne            108
			{
				if(sharecontent instanceof ShareStoryContent)
		//*   7   14:aload_1         
		//*   8   15:instanceof      #29  <Class ShareStoryContent>
		//*   9   18:ifeq            23
					return false;
		//   10   21:iconst_0        
		//   11   22:ireturn         
				if(!flag)
		//*  12   23:iload_2         
		//*  13   24:ifne            82
				{
					boolean flag1;
					if(sharecontent.getShareHashtag() != null)
		//*  14   27:aload_1         
		//*  15   28:invokevirtual   #35  <Method com.facebook.share.model.ShareHashtag ShareContent.getShareHashtag()>
		//*  16   31:ifnull          44
						flag1 = DialogPresenter.canPresentNativeDialogWithFeature(((DialogFeature) (ShareDialogFeature.HASHTAG)));
		//   17   34:getstatic       #41  <Field ShareDialogFeature ShareDialogFeature.HASHTAG>
		//   18   37:invokestatic    #47  <Method boolean DialogPresenter.canPresentNativeDialogWithFeature(DialogFeature)>
		//   19   40:istore_3        
					else
		//*  20   41:goto            46
						flag1 = true;
		//   21   44:iconst_1        
		//   22   45:istore_3        
					flag = flag1;
		//   23   46:iload_3         
		//   24   47:istore_2        
					if(sharecontent instanceof ShareLinkContent)
		//*  25   48:aload_1         
		//*  26   49:instanceof      #49  <Class ShareLinkContent>
		//*  27   52:ifeq            84
					{
						flag = flag1;
		//   28   55:iload_3         
		//   29   56:istore_2        
						if(!Utility.isNullOrEmpty(((ShareLinkContent)sharecontent).getQuote()))
		//*  30   57:aload_1         
		//*  31   58:checkcast       #49  <Class ShareLinkContent>
		//*  32   61:invokevirtual   #53  <Method String ShareLinkContent.getQuote()>
		//*  33   64:invokestatic    #59  <Method boolean Utility.isNullOrEmpty(String)>
		//*  34   67:ifne            84
							flag = flag1 & DialogPresenter.canPresentNativeDialogWithFeature(((DialogFeature) (ShareDialogFeature.LINK_SHARE_QUOTES)));
		//   35   70:iload_3         
		//   36   71:getstatic       #62  <Field ShareDialogFeature ShareDialogFeature.LINK_SHARE_QUOTES>
		//   37   74:invokestatic    #47  <Method boolean DialogPresenter.canPresentNativeDialogWithFeature(DialogFeature)>
		//   38   77:iand            
		//   39   78:istore_2        
					}
				} else
		//*  40   79:goto            84
				{
					flag = true;
		//   41   82:iconst_1        
		//   42   83:istore_2        
				}
				boolean flag2 = flag3;
		//   43   84:iload           4
		//   44   86:istore_3        
				if(flag)
		//*  45   87:iload_2         
		//*  46   88:ifeq            106
				{
					flag2 = flag3;
		//   47   91:iload           4
		//   48   93:istore_3        
					if(ShareDialog.canShowNative(((Object) (sharecontent)).getClass()))
		//*  49   94:aload_1         
		//*  50   95:invokevirtual   #68  <Method Class Object.getClass()>
		//*  51   98:invokestatic    #72  <Method boolean ShareDialog.access$500(Class)>
		//*  52  101:ifeq            106
						flag2 = true;
		//   53  104:iconst_1        
		//   54  105:istore_3        
				}
				return flag2;
		//   55  106:iload_3         
		//   56  107:ireturn         
			} else
			{
				return false;
		//   57  108:iconst_0        
		//   58  109:ireturn         
			}
		}

		public volatile boolean canShow(Object obj, boolean flag)
		{
			return canShow((ShareContent)obj, flag);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #31  <Class ShareContent>
		//    3    5:iload_2         
		//    4    6:invokevirtual   #75  <Method boolean canShow(ShareContent, boolean)>
		//    5    9:ireturn         
		}

		public AppCall createAppCall(final ShareContent content)
		{
			final AppCall appCall = ((AppCall) (ShareDialog.this));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field ShareDialog this$0>
		//    2    4:astore_2        
			((ShareDialog) (appCall)).logDialogShare(((Context) (((ShareDialog) (appCall)).getActivityContext())), content, Mode.NATIVE);
		//    3    5:aload_2         
		//    4    6:aload_2         
		//    5    7:invokestatic    #81  <Method Activity ShareDialog.access$600(ShareDialog)>
		//    6   10:aload_1         
		//    7   11:getstatic       #87  <Field ShareDialog$Mode ShareDialog$Mode.NATIVE>
		//    8   14:invokestatic    #91  <Method void ShareDialog.access$700(ShareDialog, Context, ShareContent, ShareDialog$Mode)>
			ShareContentValidation.validateForNativeShare(content);
		//    9   17:aload_1         
		//   10   18:invokestatic    #97  <Method void ShareContentValidation.validateForNativeShare(ShareContent)>
			appCall = createBaseAppCall();
		//   11   21:aload_0         
		//   12   22:getfield        #16  <Field ShareDialog this$0>
		//   13   25:invokevirtual   #101 <Method AppCall ShareDialog.createBaseAppCall()>
		//   14   28:astore_2        
			DialogPresenter.setupAppCallForNativeDialog(appCall, ((_cls1) (getShouldFailOnDataError())). new com.facebook.internal.DialogPresenter.ParameterProvider() {

				public Bundle getLegacyParameters()
				{
					return LegacyNativeDialogParameters.create(appCall.getCallId(), content, shouldFailOnDataError);
				//    0    0:aload_0         
				//    1    1:getfield        #28  <Field AppCall val$appCall>
				//    2    4:invokevirtual   #44  <Method UUID AppCall.getCallId()>
				//    3    7:aload_0         
				//    4    8:getfield        #30  <Field ShareContent val$content>
				//    5   11:aload_0         
				//    6   12:getfield        #32  <Field boolean val$shouldFailOnDataError>
				//    7   15:invokestatic    #50  <Method Bundle LegacyNativeDialogParameters.create(UUID, ShareContent, boolean)>
				//    8   18:areturn         
				}

				public Bundle getParameters()
				{
					return NativeDialogParameters.create(appCall.getCallId(), content, shouldFailOnDataError);
				//    0    0:aload_0         
				//    1    1:getfield        #28  <Field AppCall val$appCall>
				//    2    4:invokevirtual   #44  <Method UUID AppCall.getCallId()>
				//    3    7:aload_0         
				//    4    8:getfield        #30  <Field ShareContent val$content>
				//    5   11:aload_0         
				//    6   12:getfield        #32  <Field boolean val$shouldFailOnDataError>
				//    7   15:invokestatic    #54  <Method Bundle NativeDialogParameters.create(UUID, ShareContent, boolean)>
				//    8   18:areturn         
				}

				final NativeHandler this$1;
				final AppCall val$appCall;
				final ShareContent val$content;
				final boolean val$shouldFailOnDataError;

			
			{
				this$1 = final_nativehandler;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field ShareDialog$NativeHandler this$1>
				appCall = appcall;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field AppCall val$appCall>
				content = sharecontent;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field ShareContent val$content>
				shouldFailOnDataError = Z.this;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #32  <Field boolean val$shouldFailOnDataError>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #35  <Method void Object()>
			//   14   25:return          
			}
			}
, ShareDialog.getFeature(((Object) (content)).getClass()));
		//   15   29:aload_2         
		//   16   30:new             #10  <Class ShareDialog$NativeHandler$1>
		//   17   33:dup             
		//   18   34:aload_0         
		//   19   35:aload_2         
		//   20   36:aload_1         
		//   21   37:aload_0         
		//   22   38:getfield        #16  <Field ShareDialog this$0>
		//   23   41:invokevirtual   #105 <Method boolean ShareDialog.getShouldFailOnDataError()>
		//   24   44:invokespecial   #108 <Method void ShareDialog$NativeHandler$1(ShareDialog$NativeHandler, AppCall, ShareContent, boolean)>
		//   25   47:aload_1         
		//   26   48:invokevirtual   #68  <Method Class Object.getClass()>
		//   27   51:invokestatic    #112 <Method DialogFeature ShareDialog.access$800(Class)>
		//   28   54:invokestatic    #116 <Method void DialogPresenter.setupAppCallForNativeDialog(AppCall, com.facebook.internal.DialogPresenter$ParameterProvider, DialogFeature)>
			return appCall;
		//   29   57:aload_2         
		//   30   58:areturn         
		}

		public volatile AppCall createAppCall(Object obj)
		{
			return createAppCall((ShareContent)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #31  <Class ShareContent>
		//    3    5:invokevirtual   #119 <Method AppCall createAppCall(ShareContent)>
		//    4    8:areturn         
		}

		public Object getMode()
		{
			return ((Object) (Mode.NATIVE));
		//    0    0:getstatic       #87  <Field ShareDialog$Mode ShareDialog$Mode.NATIVE>
		//    1    3:areturn         
		}

		final ShareDialog this$0;

		private NativeHandler()
		{
			this$0 = ShareDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field ShareDialog this$0>
			super(((FacebookDialogBase) (ShareDialog.this)));
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #19  <Method void com.facebook.internal.FacebookDialogBase$ModeHandler(FacebookDialogBase)>
		//    6   10:return          
		}

	}

	private class ShareStoryHandler extends com.facebook.internal.FacebookDialogBase.ModeHandler
	{

		public boolean canShow(ShareContent sharecontent, boolean flag)
		{
			return (sharecontent instanceof ShareStoryContent) && ShareDialog.canShowNative(((Object) (sharecontent)).getClass());
		//    0    0:aload_1         
		//    1    1:instanceof      #27  <Class ShareStoryContent>
		//    2    4:ifeq            19
		//    3    7:aload_1         
		//    4    8:invokevirtual   #33  <Method Class Object.getClass()>
		//    5   11:invokestatic    #37  <Method boolean ShareDialog.access$500(Class)>
		//    6   14:ifeq            19
		//    7   17:iconst_1        
		//    8   18:ireturn         
		//    9   19:iconst_0        
		//   10   20:ireturn         
		}

		public volatile boolean canShow(Object obj, boolean flag)
		{
			return canShow((ShareContent)obj, flag);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #40  <Class ShareContent>
		//    3    5:iload_2         
		//    4    6:invokevirtual   #42  <Method boolean canShow(ShareContent, boolean)>
		//    5    9:ireturn         
		}

		public AppCall createAppCall(final ShareContent content)
		{
			ShareContentValidation.validateForStoryShare(content);
		//    0    0:aload_1         
		//    1    1:invokestatic    #50  <Method void ShareContentValidation.validateForStoryShare(ShareContent)>
			final AppCall appCall = createBaseAppCall();
		//    2    4:aload_0         
		//    3    5:getfield        #16  <Field ShareDialog this$0>
		//    4    8:invokevirtual   #54  <Method AppCall ShareDialog.createBaseAppCall()>
		//    5   11:astore_2        
			DialogPresenter.setupAppCallForNativeDialog(appCall, ((_cls1) (getShouldFailOnDataError())). new com.facebook.internal.DialogPresenter.ParameterProvider() {

				public Bundle getLegacyParameters()
				{
					return LegacyNativeDialogParameters.create(appCall.getCallId(), content, shouldFailOnDataError);
				//    0    0:aload_0         
				//    1    1:getfield        #28  <Field AppCall val$appCall>
				//    2    4:invokevirtual   #44  <Method UUID AppCall.getCallId()>
				//    3    7:aload_0         
				//    4    8:getfield        #30  <Field ShareContent val$content>
				//    5   11:aload_0         
				//    6   12:getfield        #32  <Field boolean val$shouldFailOnDataError>
				//    7   15:invokestatic    #50  <Method Bundle LegacyNativeDialogParameters.create(UUID, ShareContent, boolean)>
				//    8   18:areturn         
				}

				public Bundle getParameters()
				{
					return NativeDialogParameters.create(appCall.getCallId(), content, shouldFailOnDataError);
				//    0    0:aload_0         
				//    1    1:getfield        #28  <Field AppCall val$appCall>
				//    2    4:invokevirtual   #44  <Method UUID AppCall.getCallId()>
				//    3    7:aload_0         
				//    4    8:getfield        #30  <Field ShareContent val$content>
				//    5   11:aload_0         
				//    6   12:getfield        #32  <Field boolean val$shouldFailOnDataError>
				//    7   15:invokestatic    #54  <Method Bundle NativeDialogParameters.create(UUID, ShareContent, boolean)>
				//    8   18:areturn         
				}

				final ShareStoryHandler this$1;
				final AppCall val$appCall;
				final ShareContent val$content;
				final boolean val$shouldFailOnDataError;

			
			{
				this$1 = final_sharestoryhandler;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field ShareDialog$ShareStoryHandler this$1>
				appCall = appcall;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field AppCall val$appCall>
				content = sharecontent;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field ShareContent val$content>
				shouldFailOnDataError = Z.this;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #32  <Field boolean val$shouldFailOnDataError>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #35  <Method void Object()>
			//   14   25:return          
			}
			}
, ShareDialog.getFeature(((Object) (content)).getClass()));
		//    6   12:aload_2         
		//    7   13:new             #10  <Class ShareDialog$ShareStoryHandler$1>
		//    8   16:dup             
		//    9   17:aload_0         
		//   10   18:aload_2         
		//   11   19:aload_1         
		//   12   20:aload_0         
		//   13   21:getfield        #16  <Field ShareDialog this$0>
		//   14   24:invokevirtual   #58  <Method boolean ShareDialog.getShouldFailOnDataError()>
		//   15   27:invokespecial   #61  <Method void ShareDialog$ShareStoryHandler$1(ShareDialog$ShareStoryHandler, AppCall, ShareContent, boolean)>
		//   16   30:aload_1         
		//   17   31:invokevirtual   #33  <Method Class Object.getClass()>
		//   18   34:invokestatic    #65  <Method DialogFeature ShareDialog.access$800(Class)>
		//   19   37:invokestatic    #71  <Method void DialogPresenter.setupAppCallForNativeDialog(AppCall, com.facebook.internal.DialogPresenter$ParameterProvider, DialogFeature)>
			return appCall;
		//   20   40:aload_2         
		//   21   41:areturn         
		}

		public volatile AppCall createAppCall(Object obj)
		{
			return createAppCall((ShareContent)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #40  <Class ShareContent>
		//    3    5:invokevirtual   #74  <Method AppCall createAppCall(ShareContent)>
		//    4    8:areturn         
		}

		public Object getMode()
		{
			return ((Object) (Mode.NATIVE));
		//    0    0:getstatic       #82  <Field ShareDialog$Mode ShareDialog$Mode.NATIVE>
		//    1    3:areturn         
		}

		final ShareDialog this$0;

		private ShareStoryHandler()
		{
			this$0 = ShareDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field ShareDialog this$0>
			super(((FacebookDialogBase) (ShareDialog.this)));
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #19  <Method void com.facebook.internal.FacebookDialogBase$ModeHandler(FacebookDialogBase)>
		//    6   10:return          
		}

	}

	private class WebShareHandler extends com.facebook.internal.FacebookDialogBase.ModeHandler
	{

		private SharePhotoContent createAndMapAttachments(SharePhotoContent sharephotocontent, UUID uuid)
		{
			com.facebook.share.model.SharePhotoContent.Builder builder = (new com.facebook.share.model.SharePhotoContent.Builder()).readFrom(sharephotocontent);
		//    0    0:new             #25  <Class com.facebook.share.model.SharePhotoContent$Builder>
		//    1    3:dup             
		//    2    4:invokespecial   #28  <Method void com.facebook.share.model.SharePhotoContent$Builder()>
		//    3    7:aload_1         
		//    4    8:invokevirtual   #32  <Method com.facebook.share.model.SharePhotoContent$Builder com.facebook.share.model.SharePhotoContent$Builder.readFrom(SharePhotoContent)>
		//    5   11:astore          6
			ArrayList arraylist = new ArrayList();
		//    6   13:new             #34  <Class ArrayList>
		//    7   16:dup             
		//    8   17:invokespecial   #35  <Method void ArrayList()>
		//    9   20:astore          7
			ArrayList arraylist1 = new ArrayList();
		//   10   22:new             #34  <Class ArrayList>
		//   11   25:dup             
		//   12   26:invokespecial   #35  <Method void ArrayList()>
		//   13   29:astore          8
			for(int i = 0; i < sharephotocontent.getPhotos().size(); i++)
		//*  14   31:iconst_0        
		//*  15   32:istore_3        
		//*  16   33:iload_3         
		//*  17   34:aload_1         
		//*  18   35:invokevirtual   #41  <Method List SharePhotoContent.getPhotos()>
		//*  19   38:invokeinterface #47  <Method int List.size()>
		//*  20   43:icmpge          144
			{
				SharePhoto sharephoto1 = (SharePhoto)sharephotocontent.getPhotos().get(i);
		//   21   46:aload_1         
		//   22   47:invokevirtual   #41  <Method List SharePhotoContent.getPhotos()>
		//   23   50:iload_3         
		//   24   51:invokeinterface #51  <Method Object List.get(int)>
		//   25   56:checkcast       #53  <Class SharePhoto>
		//   26   59:astore          5
				Object obj = ((Object) (sharephoto1.getBitmap()));
		//   27   61:aload           5
		//   28   63:invokevirtual   #57  <Method android.graphics.Bitmap SharePhoto.getBitmap()>
		//   29   66:astore          9
				SharePhoto sharephoto = sharephoto1;
		//   30   68:aload           5
		//   31   70:astore          4
				if(obj != null)
		//*  32   72:aload           9
		//*  33   74:ifnull          127
				{
					obj = ((Object) (NativeAppCallAttachmentStore.createAttachment(uuid, ((android.graphics.Bitmap) (obj)))));
		//   34   77:aload_2         
		//   35   78:aload           9
		//   36   80:invokestatic    #63  <Method com.facebook.internal.NativeAppCallAttachmentStore$Attachment NativeAppCallAttachmentStore.createAttachment(UUID, android.graphics.Bitmap)>
		//   37   83:astore          9
					sharephoto = (new com.facebook.share.model.SharePhoto.Builder()).readFrom(sharephoto1).setImageUrl(Uri.parse(((com.facebook.internal.NativeAppCallAttachmentStore.Attachment) (obj)).getAttachmentUrl())).setBitmap(((android.graphics.Bitmap) (null))).build();
		//   38   85:new             #65  <Class com.facebook.share.model.SharePhoto$Builder>
		//   39   88:dup             
		//   40   89:invokespecial   #66  <Method void com.facebook.share.model.SharePhoto$Builder()>
		//   41   92:aload           5
		//   42   94:invokevirtual   #69  <Method com.facebook.share.model.SharePhoto$Builder com.facebook.share.model.SharePhoto$Builder.readFrom(SharePhoto)>
		//   43   97:aload           9
		//   44   99:invokevirtual   #75  <Method String com.facebook.internal.NativeAppCallAttachmentStore$Attachment.getAttachmentUrl()>
		//   45  102:invokestatic    #81  <Method Uri Uri.parse(String)>
		//   46  105:invokevirtual   #85  <Method com.facebook.share.model.SharePhoto$Builder com.facebook.share.model.SharePhoto$Builder.setImageUrl(Uri)>
		//   47  108:aconst_null     
		//   48  109:invokevirtual   #89  <Method com.facebook.share.model.SharePhoto$Builder com.facebook.share.model.SharePhoto$Builder.setBitmap(android.graphics.Bitmap)>
		//   49  112:invokevirtual   #93  <Method SharePhoto com.facebook.share.model.SharePhoto$Builder.build()>
		//   50  115:astore          4
					((List) (arraylist1)).add(obj);
		//   51  117:aload           8
		//   52  119:aload           9
		//   53  121:invokeinterface #97  <Method boolean List.add(Object)>
		//   54  126:pop             
				}
				((List) (arraylist)).add(((Object) (sharephoto)));
		//   55  127:aload           7
		//   56  129:aload           4
		//   57  131:invokeinterface #97  <Method boolean List.add(Object)>
		//   58  136:pop             
			}

		//   59  137:iload_3         
		//   60  138:iconst_1        
		//   61  139:iadd            
		//   62  140:istore_3        
		//*  63  141:goto            33
			builder.setPhotos(((List) (arraylist)));
		//   64  144:aload           6
		//   65  146:aload           7
		//   66  148:invokevirtual   #101 <Method com.facebook.share.model.SharePhotoContent$Builder com.facebook.share.model.SharePhotoContent$Builder.setPhotos(List)>
		//   67  151:pop             
			NativeAppCallAttachmentStore.addAttachments(((java.util.Collection) (arraylist1)));
		//   68  152:aload           8
		//   69  154:invokestatic    #105 <Method void NativeAppCallAttachmentStore.addAttachments(java.util.Collection)>
			return builder.build();
		//   70  157:aload           6
		//   71  159:invokevirtual   #108 <Method SharePhotoContent com.facebook.share.model.SharePhotoContent$Builder.build()>
		//   72  162:areturn         
		}

		private String getActionName(ShareContent sharecontent)
		{
			if(!(sharecontent instanceof ShareLinkContent) && !(sharecontent instanceof SharePhotoContent))
		//*   0    0:aload_1         
		//*   1    1:instanceof      #112 <Class ShareLinkContent>
		//*   2    4:ifne            29
		//*   3    7:aload_1         
		//*   4    8:instanceof      #37  <Class SharePhotoContent>
		//*   5   11:ifeq            17
		//*   6   14:goto            29
			{
				if(sharecontent instanceof ShareOpenGraphContent)
		//*   7   17:aload_1         
		//*   8   18:instanceof      #114 <Class ShareOpenGraphContent>
		//*   9   21:ifeq            27
					return "share_open_graph";
		//   10   24:ldc1            #116 <String "share_open_graph">
		//   11   26:areturn         
				else
					return null;
		//   12   27:aconst_null     
		//   13   28:areturn         
			} else
			{
				return "share";
		//   14   29:ldc1            #118 <String "share">
		//   15   31:areturn         
			}
		}

		public boolean canShow(ShareContent sharecontent, boolean flag)
		{
			return sharecontent != null && ShareDialog.canShowWebCheck(sharecontent);
		//    0    0:aload_1         
		//    1    1:ifnull          13
		//    2    4:aload_1         
		//    3    5:invokestatic    #124 <Method boolean ShareDialog.access$900(ShareContent)>
		//    4    8:ifeq            13
		//    5   11:iconst_1        
		//    6   12:ireturn         
		//    7   13:iconst_0        
		//    8   14:ireturn         
		}

		public volatile boolean canShow(Object obj, boolean flag)
		{
			return canShow((ShareContent)obj, flag);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #127 <Class ShareContent>
		//    3    5:iload_2         
		//    4    6:invokevirtual   #129 <Method boolean canShow(ShareContent, boolean)>
		//    5    9:ireturn         
		}

		public AppCall createAppCall(ShareContent sharecontent)
		{
			Object obj = ((Object) (ShareDialog.this));
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field ShareDialog this$0>
		//    2    4:astore_2        
			((ShareDialog) (obj)).logDialogShare(((Context) (((ShareDialog) (obj)).getActivityContext())), sharecontent, Mode.WEB);
		//    3    5:aload_2         
		//    4    6:aload_2         
		//    5    7:invokestatic    #135 <Method Activity ShareDialog.access$1000(ShareDialog)>
		//    6   10:aload_1         
		//    7   11:getstatic       #141 <Field ShareDialog$Mode ShareDialog$Mode.WEB>
		//    8   14:invokestatic    #145 <Method void ShareDialog.access$700(ShareDialog, Context, ShareContent, ShareDialog$Mode)>
			AppCall appcall = createBaseAppCall();
		//    9   17:aload_0         
		//   10   18:getfield        #14  <Field ShareDialog this$0>
		//   11   21:invokevirtual   #149 <Method AppCall ShareDialog.createBaseAppCall()>
		//   12   24:astore_3        
			ShareContentValidation.validateForWebShare(sharecontent);
		//   13   25:aload_1         
		//   14   26:invokestatic    #155 <Method void ShareContentValidation.validateForWebShare(ShareContent)>
			if(sharecontent instanceof ShareLinkContent)
		//*  15   29:aload_1         
		//*  16   30:instanceof      #112 <Class ShareLinkContent>
		//*  17   33:ifeq            47
				obj = ((Object) (WebDialogParameters.create((ShareLinkContent)sharecontent)));
		//   18   36:aload_1         
		//   19   37:checkcast       #112 <Class ShareLinkContent>
		//   20   40:invokestatic    #161 <Method Bundle WebDialogParameters.create(ShareLinkContent)>
		//   21   43:astore_2        
			else
		//*  22   44:goto            81
			if(sharecontent instanceof SharePhotoContent)
		//*  23   47:aload_1         
		//*  24   48:instanceof      #37  <Class SharePhotoContent>
		//*  25   51:ifeq            73
				obj = ((Object) (WebDialogParameters.create(createAndMapAttachments((SharePhotoContent)sharecontent, appcall.getCallId()))));
		//   26   54:aload_0         
		//   27   55:aload_1         
		//   28   56:checkcast       #37  <Class SharePhotoContent>
		//   29   59:aload_3         
		//   30   60:invokevirtual   #167 <Method UUID AppCall.getCallId()>
		//   31   63:invokespecial   #169 <Method SharePhotoContent createAndMapAttachments(SharePhotoContent, UUID)>
		//   32   66:invokestatic    #172 <Method Bundle WebDialogParameters.create(SharePhotoContent)>
		//   33   69:astore_2        
			else
		//*  34   70:goto            81
				obj = ((Object) (WebDialogParameters.create((ShareOpenGraphContent)sharecontent)));
		//   35   73:aload_1         
		//   36   74:checkcast       #114 <Class ShareOpenGraphContent>
		//   37   77:invokestatic    #175 <Method Bundle WebDialogParameters.create(ShareOpenGraphContent)>
		//   38   80:astore_2        
			DialogPresenter.setupAppCallForWebDialog(appcall, getActionName(sharecontent), ((Bundle) (obj)));
		//   39   81:aload_3         
		//   40   82:aload_0         
		//   41   83:aload_1         
		//   42   84:invokespecial   #177 <Method String getActionName(ShareContent)>
		//   43   87:aload_2         
		//   44   88:invokestatic    #183 <Method void DialogPresenter.setupAppCallForWebDialog(AppCall, String, Bundle)>
			return appcall;
		//   45   91:aload_3         
		//   46   92:areturn         
		}

		public volatile AppCall createAppCall(Object obj)
		{
			return createAppCall((ShareContent)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #127 <Class ShareContent>
		//    3    5:invokevirtual   #186 <Method AppCall createAppCall(ShareContent)>
		//    4    8:areturn         
		}

		public Object getMode()
		{
			return ((Object) (Mode.WEB));
		//    0    0:getstatic       #141 <Field ShareDialog$Mode ShareDialog$Mode.WEB>
		//    1    3:areturn         
		}

		final ShareDialog this$0;

		private WebShareHandler()
		{
			this$0 = ShareDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field ShareDialog this$0>
			super(((FacebookDialogBase) (ShareDialog.this)));
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #17  <Method void com.facebook.internal.FacebookDialogBase$ModeHandler(FacebookDialogBase)>
		//    6   10:return          
		}

	}


	public ShareDialog(Activity activity)
	{
		super(activity, DEFAULT_REQUEST_CODE);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #65  <Field int DEFAULT_REQUEST_CODE>
	//    3    5:invokespecial   #71  <Method void FacebookDialogBase(Activity, int)>
		shouldFailOnDataError = false;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #73  <Field boolean shouldFailOnDataError>
		isAutomaticMode = true;
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:putfield        #75  <Field boolean isAutomaticMode>
		ShareInternalUtility.registerStaticShareCallback(DEFAULT_REQUEST_CODE);
	//   10   18:getstatic       #65  <Field int DEFAULT_REQUEST_CODE>
	//   11   21:invokestatic    #81  <Method void ShareInternalUtility.registerStaticShareCallback(int)>
	//   12   24:return          
	}

	ShareDialog(Activity activity, int i)
	{
		super(activity, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #71  <Method void FacebookDialogBase(Activity, int)>
		shouldFailOnDataError = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #73  <Field boolean shouldFailOnDataError>
		isAutomaticMode = true;
	//    7   11:aload_0         
	//    8   12:iconst_1        
	//    9   13:putfield        #75  <Field boolean isAutomaticMode>
		ShareInternalUtility.registerStaticShareCallback(i);
	//   10   16:iload_2         
	//   11   17:invokestatic    #81  <Method void ShareInternalUtility.registerStaticShareCallback(int)>
	//   12   20:return          
	}

	public ShareDialog(Fragment fragment)
	{
		this(new FragmentWrapper(fragment));
	//    0    0:aload_0         
	//    1    1:new             #84  <Class FragmentWrapper>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #86  <Method void FragmentWrapper(Fragment)>
	//    5    9:invokespecial   #89  <Method void ShareDialog(FragmentWrapper)>
	//    6   12:return          
	}

	ShareDialog(Fragment fragment, int i)
	{
		this(new FragmentWrapper(fragment), i);
	//    0    0:aload_0         
	//    1    1:new             #84  <Class FragmentWrapper>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #86  <Method void FragmentWrapper(Fragment)>
	//    5    9:iload_2         
	//    6   10:invokespecial   #93  <Method void ShareDialog(FragmentWrapper, int)>
	//    7   13:return          
	}

	public ShareDialog(android.support.v4.app.Fragment fragment)
	{
		this(new FragmentWrapper(fragment));
	//    0    0:aload_0         
	//    1    1:new             #84  <Class FragmentWrapper>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #96  <Method void FragmentWrapper(android.support.v4.app.Fragment)>
	//    5    9:invokespecial   #89  <Method void ShareDialog(FragmentWrapper)>
	//    6   12:return          
	}

	ShareDialog(android.support.v4.app.Fragment fragment, int i)
	{
		this(new FragmentWrapper(fragment), i);
	//    0    0:aload_0         
	//    1    1:new             #84  <Class FragmentWrapper>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #96  <Method void FragmentWrapper(android.support.v4.app.Fragment)>
	//    5    9:iload_2         
	//    6   10:invokespecial   #93  <Method void ShareDialog(FragmentWrapper, int)>
	//    7   13:return          
	}

	private ShareDialog(FragmentWrapper fragmentwrapper)
	{
		super(fragmentwrapper, DEFAULT_REQUEST_CODE);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #65  <Field int DEFAULT_REQUEST_CODE>
	//    3    5:invokespecial   #98  <Method void FacebookDialogBase(FragmentWrapper, int)>
		shouldFailOnDataError = false;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #73  <Field boolean shouldFailOnDataError>
		isAutomaticMode = true;
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:putfield        #75  <Field boolean isAutomaticMode>
		ShareInternalUtility.registerStaticShareCallback(DEFAULT_REQUEST_CODE);
	//   10   18:getstatic       #65  <Field int DEFAULT_REQUEST_CODE>
	//   11   21:invokestatic    #81  <Method void ShareInternalUtility.registerStaticShareCallback(int)>
	//   12   24:return          
	}

	private ShareDialog(FragmentWrapper fragmentwrapper, int i)
	{
		super(fragmentwrapper, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #98  <Method void FacebookDialogBase(FragmentWrapper, int)>
		shouldFailOnDataError = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #73  <Field boolean shouldFailOnDataError>
		isAutomaticMode = true;
	//    7   11:aload_0         
	//    8   12:iconst_1        
	//    9   13:putfield        #75  <Field boolean isAutomaticMode>
		ShareInternalUtility.registerStaticShareCallback(i);
	//   10   16:iload_2         
	//   11   17:invokestatic    #81  <Method void ShareInternalUtility.registerStaticShareCallback(int)>
	//   12   20:return          
	}

	public static boolean canShow(Class class1)
	{
		return canShowWebTypeCheck(class1) || canShowNative(class1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #131 <Method boolean canShowWebTypeCheck(Class)>
	//    2    4:ifne            19
	//    3    7:aload_0         
	//    4    8:invokestatic    #110 <Method boolean canShowNative(Class)>
	//    5   11:ifeq            17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	private static boolean canShowNative(Class class1)
	{
		class1 = ((Class) (getFeature(class1)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #122 <Method DialogFeature getFeature(Class)>
	//    2    4:astore_0        
		return class1 != null && DialogPresenter.canPresentNativeDialogWithFeature(((DialogFeature) (class1)));
	//    3    5:aload_0         
	//    4    6:ifnull          18
	//    5    9:aload_0         
	//    6   10:invokestatic    #139 <Method boolean DialogPresenter.canPresentNativeDialogWithFeature(DialogFeature)>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	private static boolean canShowWebCheck(ShareContent sharecontent)
	{
		if(!canShowWebTypeCheck(((Object) (sharecontent)).getClass()))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #147 <Method Class Object.getClass()>
	//*   2    4:invokestatic    #131 <Method boolean canShowWebTypeCheck(Class)>
	//*   3    7:ifne            12
			return false;
	//    4   10:iconst_0        
	//    5   11:ireturn         
		if(sharecontent instanceof ShareOpenGraphContent)
	//*   6   12:aload_0         
	//*   7   13:instanceof      #149 <Class ShareOpenGraphContent>
	//*   8   16:ifeq            44
		{
			sharecontent = ((ShareContent) ((ShareOpenGraphContent)sharecontent));
	//    9   19:aload_0         
	//   10   20:checkcast       #149 <Class ShareOpenGraphContent>
	//   11   23:astore_0        
			try
			{
				ShareInternalUtility.toJSONObjectForWeb(((ShareOpenGraphContent) (sharecontent)));
	//   12   24:aload_0         
	//   13   25:invokestatic    #153 <Method org.json.JSONObject ShareInternalUtility.toJSONObjectForWeb(ShareOpenGraphContent)>
	//   14   28:pop             
			}
	//*  15   29:goto            44
			// Misplaced declaration of an exception variable
			catch(ShareContent sharecontent)
	//*  16   32:astore_0        
			{
				Utility.logd(TAG, "canShow returned false because the content of the Opem Graph object can't be shared via the web dialog", ((Throwable) (sharecontent)));
	//   17   33:getstatic       #155 <Field String TAG>
	//   18   36:ldc1            #157 <String "canShow returned false because the content of the Opem Graph object can't be shared via the web dialog">
	//   19   38:aload_0         
	//   20   39:invokestatic    #163 <Method void Utility.logd(String, String, Throwable)>
				return false;
	//   21   42:iconst_0        
	//   22   43:ireturn         
			}
		}
		return true;
	//   23   44:iconst_1        
	//   24   45:ireturn         
	}

	private static boolean canShowWebTypeCheck(Class class1)
	{
		return ((Class) (com/facebook/share/model/ShareLinkContent)).isAssignableFrom(class1) || ((Class) (com/facebook/share/model/ShareOpenGraphContent)).isAssignableFrom(class1) || ((Class) (com/facebook/share/model/SharePhotoContent)).isAssignableFrom(class1) && AccessToken.isCurrentAccessTokenActive();
	//    0    0:ldc1            #165 <Class ShareLinkContent>
	//    1    2:aload_0         
	//    2    3:invokevirtual   #170 <Method boolean Class.isAssignableFrom(Class)>
	//    3    6:ifne            38
	//    4    9:ldc1            #149 <Class ShareOpenGraphContent>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #170 <Method boolean Class.isAssignableFrom(Class)>
	//    7   15:ifne            38
	//    8   18:ldc1            #172 <Class SharePhotoContent>
	//    9   20:aload_0         
	//   10   21:invokevirtual   #170 <Method boolean Class.isAssignableFrom(Class)>
	//   11   24:ifeq            36
	//   12   27:invokestatic    #178 <Method boolean AccessToken.isCurrentAccessTokenActive()>
	//   13   30:ifeq            36
	//   14   33:goto            38
	//   15   36:iconst_0        
	//   16   37:ireturn         
	//   17   38:iconst_1        
	//   18   39:ireturn         
	}

	private static DialogFeature getFeature(Class class1)
	{
		if(((Class) (com/facebook/share/model/ShareLinkContent)).isAssignableFrom(class1))
	//*   0    0:ldc1            #165 <Class ShareLinkContent>
	//*   1    2:aload_0         
	//*   2    3:invokevirtual   #170 <Method boolean Class.isAssignableFrom(Class)>
	//*   3    6:ifeq            13
			return ((DialogFeature) (ShareDialogFeature.SHARE_DIALOG));
	//    4    9:getstatic       #184 <Field ShareDialogFeature ShareDialogFeature.SHARE_DIALOG>
	//    5   12:areturn         
		if(((Class) (com/facebook/share/model/SharePhotoContent)).isAssignableFrom(class1))
	//*   6   13:ldc1            #172 <Class SharePhotoContent>
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #170 <Method boolean Class.isAssignableFrom(Class)>
	//*   9   19:ifeq            26
			return ((DialogFeature) (ShareDialogFeature.PHOTOS));
	//   10   22:getstatic       #187 <Field ShareDialogFeature ShareDialogFeature.PHOTOS>
	//   11   25:areturn         
		if(((Class) (com/facebook/share/model/ShareVideoContent)).isAssignableFrom(class1))
	//*  12   26:ldc1            #189 <Class ShareVideoContent>
	//*  13   28:aload_0         
	//*  14   29:invokevirtual   #170 <Method boolean Class.isAssignableFrom(Class)>
	//*  15   32:ifeq            39
			return ((DialogFeature) (ShareDialogFeature.VIDEO));
	//   16   35:getstatic       #192 <Field ShareDialogFeature ShareDialogFeature.VIDEO>
	//   17   38:areturn         
		if(((Class) (com/facebook/share/model/ShareOpenGraphContent)).isAssignableFrom(class1))
	//*  18   39:ldc1            #149 <Class ShareOpenGraphContent>
	//*  19   41:aload_0         
	//*  20   42:invokevirtual   #170 <Method boolean Class.isAssignableFrom(Class)>
	//*  21   45:ifeq            52
			return ((DialogFeature) (OpenGraphActionDialogFeature.OG_ACTION_DIALOG));
	//   22   48:getstatic       #198 <Field OpenGraphActionDialogFeature OpenGraphActionDialogFeature.OG_ACTION_DIALOG>
	//   23   51:areturn         
		if(((Class) (com/facebook/share/model/ShareMediaContent)).isAssignableFrom(class1))
	//*  24   52:ldc1            #200 <Class ShareMediaContent>
	//*  25   54:aload_0         
	//*  26   55:invokevirtual   #170 <Method boolean Class.isAssignableFrom(Class)>
	//*  27   58:ifeq            65
			return ((DialogFeature) (ShareDialogFeature.MULTIMEDIA));
	//   28   61:getstatic       #203 <Field ShareDialogFeature ShareDialogFeature.MULTIMEDIA>
	//   29   64:areturn         
		if(((Class) (com/facebook/share/model/ShareCameraEffectContent)).isAssignableFrom(class1))
	//*  30   65:ldc1            #205 <Class ShareCameraEffectContent>
	//*  31   67:aload_0         
	//*  32   68:invokevirtual   #170 <Method boolean Class.isAssignableFrom(Class)>
	//*  33   71:ifeq            78
			return ((DialogFeature) (CameraEffectFeature.SHARE_CAMERA_EFFECT));
	//   34   74:getstatic       #211 <Field CameraEffectFeature CameraEffectFeature.SHARE_CAMERA_EFFECT>
	//   35   77:areturn         
		if(((Class) (com/facebook/share/model/ShareStoryContent)).isAssignableFrom(class1))
	//*  36   78:ldc1            #213 <Class ShareStoryContent>
	//*  37   80:aload_0         
	//*  38   81:invokevirtual   #170 <Method boolean Class.isAssignableFrom(Class)>
	//*  39   84:ifeq            91
			return ((DialogFeature) (ShareStoryFeature.SHARE_STORY_ASSET));
	//   40   87:getstatic       #219 <Field ShareStoryFeature ShareStoryFeature.SHARE_STORY_ASSET>
	//   41   90:areturn         
		else
			return null;
	//   42   91:aconst_null     
	//   43   92:areturn         
	}

	private void logDialogShare(Context context, ShareContent sharecontent, Mode mode)
	{
		if(isAutomaticMode)
	//*   0    0:aload_0         
	//*   1    1:getfield        #75  <Field boolean isAutomaticMode>
	//*   2    4:ifeq            11
			mode = Mode.AUTOMATIC;
	//    3    7:getstatic       #224 <Field ShareDialog$Mode ShareDialog$Mode.AUTOMATIC>
	//    4   10:astore_3        
		static class _cls1
		{

			static final int $SwitchMap$com$facebook$share$widget$ShareDialog$Mode[];

			static 
			{
				$SwitchMap$com$facebook$share$widget$ShareDialog$Mode = new int[Mode.values().length];
			//    0    0:invokestatic    #18  <Method ShareDialog$Mode[] ShareDialog$Mode.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$facebook$share$widget$ShareDialog$Mode>
				try
				{
					$SwitchMap$com$facebook$share$widget$ShareDialog$Mode[Mode.AUTOMATIC.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$facebook$share$widget$ShareDialog$Mode>
			//    5   12:getstatic       #24  <Field ShareDialog$Mode ShareDialog$Mode.AUTOMATIC>
			//    6   15:invokevirtual   #28  <Method int ShareDialog$Mode.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$facebook$share$widget$ShareDialog$Mode>
			//*  10   23:getstatic       #31  <Field ShareDialog$Mode ShareDialog$Mode.WEB>
			//*  11   26:invokevirtual   #28  <Method int ShareDialog$Mode.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$facebook$share$widget$ShareDialog$Mode>
			//*  15   34:getstatic       #34  <Field ShareDialog$Mode ShareDialog$Mode.NATIVE>
			//*  16   37:invokevirtual   #28  <Method int ShareDialog$Mode.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   20   43:astore_0        
				try
				{
					$SwitchMap$com$facebook$share$widget$ShareDialog$Mode[Mode.WEB.ordinal()] = 2;
				}
			//*  21   44:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   22   47:astore_0        
				try
				{
					$SwitchMap$com$facebook$share$widget$ShareDialog$Mode[Mode.NATIVE.ordinal()] = 3;
				}
			//*  23   48:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   24   51:astore_0        
			//*  25   52:return          
			}
		}

		switch(_cls1..SwitchMap.com.facebook.share.widget.ShareDialog.Mode[mode.ordinal()])
	//*   5   11:getstatic       #228 <Field int[] ShareDialog$1.$SwitchMap$com$facebook$share$widget$ShareDialog$Mode>
	//*   6   14:aload_3         
	//*   7   15:invokevirtual   #231 <Method int ShareDialog$Mode.ordinal()>
	//*   8   18:iaload          
		{
	//*   9   19:tableswitch     1 3: default 44
	//	               1 62
	//	               2 56
	//	               3 50
		default:
			mode = "unknown";
	//   10   44:ldc1            #233 <String "unknown">
	//   11   46:astore_3        
			break;

	//*  12   47:goto            65
		case 3: // '\003'
			mode = "native";
	//   13   50:ldc1            #235 <String "native">
	//   14   52:astore_3        
			break;

	//*  15   53:goto            65
		case 2: // '\002'
			mode = "web";
	//   16   56:ldc1            #237 <String "web">
	//   17   58:astore_3        
			break;

	//*  18   59:goto            65
		case 1: // '\001'
			mode = "automatic";
	//   19   62:ldc1            #239 <String "automatic">
	//   20   64:astore_3        
			break;
		}
		sharecontent = ((ShareContent) (getFeature(((Object) (sharecontent)).getClass())));
	//   21   65:aload_2         
	//   22   66:invokevirtual   #147 <Method Class Object.getClass()>
	//   23   69:invokestatic    #122 <Method DialogFeature getFeature(Class)>
	//   24   72:astore_2        
		if(sharecontent == ShareDialogFeature.SHARE_DIALOG)
	//*  25   73:aload_2         
	//*  26   74:getstatic       #184 <Field ShareDialogFeature ShareDialogFeature.SHARE_DIALOG>
	//*  27   77:if_acmpne       86
			sharecontent = "status";
	//   28   80:ldc1            #241 <String "status">
	//   29   82:astore_2        
		else
	//*  30   83:goto            128
		if(sharecontent == ShareDialogFeature.PHOTOS)
	//*  31   86:aload_2         
	//*  32   87:getstatic       #187 <Field ShareDialogFeature ShareDialogFeature.PHOTOS>
	//*  33   90:if_acmpne       99
			sharecontent = "photo";
	//   34   93:ldc1            #243 <String "photo">
	//   35   95:astore_2        
		else
	//*  36   96:goto            128
		if(sharecontent == ShareDialogFeature.VIDEO)
	//*  37   99:aload_2         
	//*  38  100:getstatic       #192 <Field ShareDialogFeature ShareDialogFeature.VIDEO>
	//*  39  103:if_acmpne       112
			sharecontent = "video";
	//   40  106:ldc1            #245 <String "video">
	//   41  108:astore_2        
		else
	//*  42  109:goto            128
		if(sharecontent == OpenGraphActionDialogFeature.OG_ACTION_DIALOG)
	//*  43  112:aload_2         
	//*  44  113:getstatic       #198 <Field OpenGraphActionDialogFeature OpenGraphActionDialogFeature.OG_ACTION_DIALOG>
	//*  45  116:if_acmpne       125
			sharecontent = "open_graph";
	//   46  119:ldc1            #247 <String "open_graph">
	//   47  121:astore_2        
		else
	//*  48  122:goto            128
			sharecontent = "unknown";
	//   49  125:ldc1            #233 <String "unknown">
	//   50  127:astore_2        
		context = ((Context) (AppEventsLogger.newLogger(context)));
	//   51  128:aload_1         
	//   52  129:invokestatic    #253 <Method AppEventsLogger AppEventsLogger.newLogger(Context)>
	//   53  132:astore_1        
		Bundle bundle = new Bundle();
	//   54  133:new             #255 <Class Bundle>
	//   55  136:dup             
	//   56  137:invokespecial   #257 <Method void Bundle()>
	//   57  140:astore          4
		bundle.putString("fb_share_dialog_show", ((String) (mode)));
	//   58  142:aload           4
	//   59  144:ldc2            #259 <String "fb_share_dialog_show">
	//   60  147:aload_3         
	//   61  148:invokevirtual   #263 <Method void Bundle.putString(String, String)>
		bundle.putString("fb_share_dialog_content_type", ((String) (sharecontent)));
	//   62  151:aload           4
	//   63  153:ldc2            #265 <String "fb_share_dialog_content_type">
	//   64  156:aload_2         
	//   65  157:invokevirtual   #263 <Method void Bundle.putString(String, String)>
		((AppEventsLogger) (context)).logSdkEvent("fb_share_dialog_show", ((Double) (null)), bundle);
	//   66  160:aload_1         
	//   67  161:ldc2            #259 <String "fb_share_dialog_show">
	//   68  164:aconst_null     
	//   69  165:aload           4
	//   70  167:invokevirtual   #269 <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
	//   71  170:return          
	}

	public static void show(Activity activity, ShareContent sharecontent)
	{
		(new ShareDialog(activity)).show(((Object) (sharecontent)));
	//    0    0:new             #2   <Class ShareDialog>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #273 <Method void ShareDialog(Activity)>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #276 <Method void show(Object)>
	//    6   12:return          
	}

	public static void show(Fragment fragment, ShareContent sharecontent)
	{
		show(new FragmentWrapper(fragment), sharecontent);
	//    0    0:new             #84  <Class FragmentWrapper>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #86  <Method void FragmentWrapper(Fragment)>
	//    4    8:aload_1         
	//    5    9:invokestatic    #280 <Method void show(FragmentWrapper, ShareContent)>
	//    6   12:return          
	}

	public static void show(android.support.v4.app.Fragment fragment, ShareContent sharecontent)
	{
		show(new FragmentWrapper(fragment), sharecontent);
	//    0    0:new             #84  <Class FragmentWrapper>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #96  <Method void FragmentWrapper(android.support.v4.app.Fragment)>
	//    4    8:aload_1         
	//    5    9:invokestatic    #280 <Method void show(FragmentWrapper, ShareContent)>
	//    6   12:return          
	}

	private static void show(FragmentWrapper fragmentwrapper, ShareContent sharecontent)
	{
		(new ShareDialog(fragmentwrapper)).show(((Object) (sharecontent)));
	//    0    0:new             #2   <Class ShareDialog>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #89  <Method void ShareDialog(FragmentWrapper)>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #276 <Method void show(Object)>
	//    6   12:return          
	}

	public boolean canShow(ShareContent sharecontent, Mode mode)
	{
		Object obj = ((Object) (mode));
	//    0    0:aload_2         
	//    1    1:astore_3        
		if(mode == Mode.AUTOMATIC)
	//*   2    2:aload_2         
	//*   3    3:getstatic       #224 <Field ShareDialog$Mode ShareDialog$Mode.AUTOMATIC>
	//*   4    6:if_acmpne       13
			obj = BASE_AUTOMATIC_MODE;
	//    5    9:getstatic       #286 <Field Object BASE_AUTOMATIC_MODE>
	//    6   12:astore_3        
		return canShowImpl(((Object) (sharecontent)), obj);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:aload_3         
	//   10   16:invokevirtual   #290 <Method boolean canShowImpl(Object, Object)>
	//   11   19:ireturn         
	}

	protected AppCall createBaseAppCall()
	{
		return new AppCall(getRequestCode());
	//    0    0:new             #294 <Class AppCall>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #297 <Method int getRequestCode()>
	//    4    8:invokespecial   #299 <Method void AppCall(int)>
	//    5   11:areturn         
	}

	protected List getOrderedModeHandlers()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #303 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #304 <Method void ArrayList()>
	//    3    7:astore_1        
		arraylist.add(((Object) (new NativeHandler(((_cls1) (null))))));
	//    4    8:aload_1         
	//    5    9:new             #22  <Class ShareDialog$NativeHandler>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:invokespecial   #307 <Method void ShareDialog$NativeHandler(ShareDialog, ShareDialog$1)>
	//   10   18:invokevirtual   #311 <Method boolean ArrayList.add(Object)>
	//   11   21:pop             
		arraylist.add(((Object) (new FeedHandler(((_cls1) (null))))));
	//   12   22:aload_1         
	//   13   23:new             #16  <Class ShareDialog$FeedHandler>
	//   14   26:dup             
	//   15   27:aload_0         
	//   16   28:aconst_null     
	//   17   29:invokespecial   #312 <Method void ShareDialog$FeedHandler(ShareDialog, ShareDialog$1)>
	//   18   32:invokevirtual   #311 <Method boolean ArrayList.add(Object)>
	//   19   35:pop             
		arraylist.add(((Object) (new WebShareHandler(((_cls1) (null))))));
	//   20   36:aload_1         
	//   21   37:new             #32  <Class ShareDialog$WebShareHandler>
	//   22   40:dup             
	//   23   41:aload_0         
	//   24   42:aconst_null     
	//   25   43:invokespecial   #313 <Method void ShareDialog$WebShareHandler(ShareDialog, ShareDialog$1)>
	//   26   46:invokevirtual   #311 <Method boolean ArrayList.add(Object)>
	//   27   49:pop             
		arraylist.add(((Object) (new CameraEffectHandler(((_cls1) (null))))));
	//   28   50:aload_1         
	//   29   51:new             #11  <Class ShareDialog$CameraEffectHandler>
	//   30   54:dup             
	//   31   55:aload_0         
	//   32   56:aconst_null     
	//   33   57:invokespecial   #314 <Method void ShareDialog$CameraEffectHandler(ShareDialog, ShareDialog$1)>
	//   34   60:invokevirtual   #311 <Method boolean ArrayList.add(Object)>
	//   35   63:pop             
		arraylist.add(((Object) (new ShareStoryHandler(((_cls1) (null))))));
	//   36   64:aload_1         
	//   37   65:new             #27  <Class ShareDialog$ShareStoryHandler>
	//   38   68:dup             
	//   39   69:aload_0         
	//   40   70:aconst_null     
	//   41   71:invokespecial   #315 <Method void ShareDialog$ShareStoryHandler(ShareDialog, ShareDialog$1)>
	//   42   74:invokevirtual   #311 <Method boolean ArrayList.add(Object)>
	//   43   77:pop             
		return ((List) (arraylist));
	//   44   78:aload_1         
	//   45   79:areturn         
	}

	public boolean getShouldFailOnDataError()
	{
		return shouldFailOnDataError;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field boolean shouldFailOnDataError>
	//    2    4:ireturn         
	}

	protected void registerCallbackImpl(CallbackManagerImpl callbackmanagerimpl, FacebookCallback facebookcallback)
	{
		ShareInternalUtility.registerSharerCallback(getRequestCode(), ((com.facebook.CallbackManager) (callbackmanagerimpl)), facebookcallback);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #297 <Method int getRequestCode()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #323 <Method void ShareInternalUtility.registerSharerCallback(int, com.facebook.CallbackManager, FacebookCallback)>
	//    5    9:return          
	}

	public void setShouldFailOnDataError(boolean flag)
	{
		shouldFailOnDataError = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #73  <Field boolean shouldFailOnDataError>
	//    3    5:return          
	}

	public void show(ShareContent sharecontent, Mode mode)
	{
		boolean flag;
		if(mode == Mode.AUTOMATIC)
	//*   0    0:aload_2         
	//*   1    1:getstatic       #224 <Field ShareDialog$Mode ShareDialog$Mode.AUTOMATIC>
	//*   2    4:if_acmpne       12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_3        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_3        
		isAutomaticMode = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #75  <Field boolean isAutomaticMode>
		if(isAutomaticMode)
	//*  11   19:aload_0         
	//*  12   20:getfield        #75  <Field boolean isAutomaticMode>
	//*  13   23:ifeq            30
			mode = ((Mode) (BASE_AUTOMATIC_MODE));
	//   14   26:getstatic       #286 <Field Object BASE_AUTOMATIC_MODE>
	//   15   29:astore_2        
		showImpl(((Object) (sharecontent)), ((Object) (mode)));
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:aload_2         
	//   19   33:invokevirtual   #331 <Method void showImpl(Object, Object)>
	//   20   36:return          
	}

	private static final int DEFAULT_REQUEST_CODE;
	private static final String FEED_DIALOG = "feed";
	private static final String TAG = "ShareDialog";
	private static final String WEB_OG_SHARE_DIALOG = "share_open_graph";
	public static final String WEB_SHARE_DIALOG = "share";
	private boolean isAutomaticMode;
	private boolean shouldFailOnDataError;

	static 
	{
		DEFAULT_REQUEST_CODE = com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Share.toRequestCode();
	//    0    0:getstatic       #59  <Field com.facebook.internal.CallbackManagerImpl$RequestCodeOffset com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.Share>
	//    1    3:invokevirtual   #63  <Method int com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.toRequestCode()>
	//    2    6:putstatic       #65  <Field int DEFAULT_REQUEST_CODE>
	//*   3    9:return          
	}


/*
	static Activity access$1000(ShareDialog sharedialog)
	{
		return sharedialog.getActivityContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #104 <Method Activity getActivityContext()>
	//    2    4:areturn         
	}

*/


/*
	static Activity access$1100(ShareDialog sharedialog)
	{
		return sharedialog.getActivityContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #104 <Method Activity getActivityContext()>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$500(Class class1)
	{
		return canShowNative(class1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #110 <Method boolean canShowNative(Class)>
	//    2    4:ireturn         
	}

*/


/*
	static Activity access$600(ShareDialog sharedialog)
	{
		return sharedialog.getActivityContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #104 <Method Activity getActivityContext()>
	//    2    4:areturn         
	}

*/


/*
	static void access$700(ShareDialog sharedialog, Context context, ShareContent sharecontent, Mode mode)
	{
		sharedialog.logDialogShare(context, sharecontent, mode);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #117 <Method void logDialogShare(Context, ShareContent, ShareDialog$Mode)>
		return;
	//    5    7:return          
	}

*/


/*
	static DialogFeature access$800(Class class1)
	{
		return getFeature(class1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #122 <Method DialogFeature getFeature(Class)>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$900(ShareContent sharecontent)
	{
		return canShowWebCheck(sharecontent);
	//    0    0:aload_0         
	//    1    1:invokestatic    #127 <Method boolean canShowWebCheck(ShareContent)>
	//    2    4:ireturn         
	}

*/
}
