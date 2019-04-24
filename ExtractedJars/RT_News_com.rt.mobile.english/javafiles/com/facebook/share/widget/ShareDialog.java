// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.facebook.FacebookCallback;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.*;
import com.facebook.share.Sharer;
import com.facebook.share.internal.*;
import com.facebook.share.model.*;
import java.util.ArrayList;
import java.util.List;

public final class ShareDialog extends FacebookDialogBase
	implements Sharer
{
	private class FeedHandler extends com.facebook.internal.FacebookDialogBase.ModeHandler
	{

		public boolean canShow(ShareContent sharecontent)
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

		public volatile boolean canShow(Object obj)
		{
			return canShow((ShareContent)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #30  <Class ShareContent>
		//    3    5:invokevirtual   #32  <Method boolean canShow(ShareContent)>
		//    4    8:ireturn         
		}

		public AppCall createAppCall(ShareContent sharecontent)
		{
			logDialogShare(((Context) (getActivityContext())), sharecontent, Mode.FEED);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field ShareDialog this$0>
		//    2    4:aload_0         
		//    3    5:getfield        #14  <Field ShareDialog this$0>
		//    4    8:invokestatic    #38  <Method Activity ShareDialog.access$900(ShareDialog)>
		//    5   11:aload_1         
		//    6   12:getstatic       #44  <Field ShareDialog$Mode ShareDialog$Mode.FEED>
		//    7   15:invokestatic    #48  <Method void ShareDialog.access$500(ShareDialog, Context, ShareContent, ShareDialog$Mode)>
			AppCall appcall = createBaseAppCall();
		//    8   18:aload_0         
		//    9   19:getfield        #14  <Field ShareDialog this$0>
		//   10   22:invokevirtual   #52  <Method AppCall ShareDialog.createBaseAppCall()>
		//   11   25:astore_2        
			if(sharecontent instanceof ShareLinkContent)
		//*  12   26:aload_1         
		//*  13   27:instanceof      #25  <Class ShareLinkContent>
		//*  14   30:ifeq            50
			{
				sharecontent = ((ShareContent) ((ShareLinkContent)sharecontent));
		//   15   33:aload_1         
		//   16   34:checkcast       #25  <Class ShareLinkContent>
		//   17   37:astore_1        
				ShareContentValidation.validateForWebShare(sharecontent);
		//   18   38:aload_1         
		//   19   39:invokestatic    #58  <Method void ShareContentValidation.validateForWebShare(ShareContent)>
				sharecontent = ((ShareContent) (WebDialogParameters.createForFeed(((ShareLinkContent) (sharecontent)))));
		//   20   42:aload_1         
		//   21   43:invokestatic    #64  <Method Bundle WebDialogParameters.createForFeed(ShareLinkContent)>
		//   22   46:astore_1        
			} else
		//*  23   47:goto            58
			{
				sharecontent = ((ShareContent) (WebDialogParameters.createForFeed((ShareFeedContent)sharecontent)));
		//   24   50:aload_1         
		//   25   51:checkcast       #27  <Class ShareFeedContent>
		//   26   54:invokestatic    #67  <Method Bundle WebDialogParameters.createForFeed(ShareFeedContent)>
		//   27   57:astore_1        
			}
			DialogPresenter.setupAppCallForWebDialog(appcall, "feed", ((Bundle) (sharecontent)));
		//   28   58:aload_2         
		//   29   59:ldc1            #69  <String "feed">
		//   30   61:aload_1         
		//   31   62:invokestatic    #75  <Method void DialogPresenter.setupAppCallForWebDialog(AppCall, String, Bundle)>
			return appcall;
		//   32   65:aload_2         
		//   33   66:areturn         
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

		public boolean canShow(ShareContent sharecontent)
		{
			return sharecontent != null && ShareDialog.canShowNative(((Object) (sharecontent)).getClass());
		//    0    0:aload_1         
		//    1    1:ifnull          16
		//    2    4:aload_1         
		//    3    5:invokevirtual   #31  <Method Class Object.getClass()>
		//    4    8:invokestatic    #35  <Method boolean ShareDialog.access$300(Class)>
		//    5   11:ifeq            16
		//    6   14:iconst_1        
		//    7   15:ireturn         
		//    8   16:iconst_0        
		//    9   17:ireturn         
		}

		public volatile boolean canShow(Object obj)
		{
			return canShow((ShareContent)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #38  <Class ShareContent>
		//    3    5:invokevirtual   #40  <Method boolean canShow(ShareContent)>
		//    4    8:ireturn         
		}

		public AppCall createAppCall(final ShareContent content)
		{
			logDialogShare(((Context) (getActivityContext())), content, Mode.NATIVE);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field ShareDialog this$0>
		//    2    4:aload_0         
		//    3    5:getfield        #16  <Field ShareDialog this$0>
		//    4    8:invokestatic    #46  <Method Activity ShareDialog.access$400(ShareDialog)>
		//    5   11:aload_1         
		//    6   12:getstatic       #52  <Field ShareDialog$Mode ShareDialog$Mode.NATIVE>
		//    7   15:invokestatic    #56  <Method void ShareDialog.access$500(ShareDialog, Context, ShareContent, ShareDialog$Mode)>
			ShareContentValidation.validateForNativeShare(content);
		//    8   18:aload_1         
		//    9   19:invokestatic    #62  <Method void ShareContentValidation.validateForNativeShare(ShareContent)>
			final AppCall appCall = createBaseAppCall();
		//   10   22:aload_0         
		//   11   23:getfield        #16  <Field ShareDialog this$0>
		//   12   26:invokevirtual   #66  <Method AppCall ShareDialog.createBaseAppCall()>
		//   13   29:astore_2        
			DialogPresenter.setupAppCallForNativeDialog(appCall, ((_cls1) (getShouldFailOnDataError())). new com.facebook.internal.DialogPresenter.ParameterProvider() {

				public Bundle getLegacyParameters()
				{
					return LegacyNativeDialogParameters.create(appCall.getCallId(), content, shouldFailOnDataError);
				//    0    0:aload_0         
				//    1    1:getfield        #28  <Field AppCall val$appCall>
				//    2    4:invokevirtual   #44  <Method java.util.UUID AppCall.getCallId()>
				//    3    7:aload_0         
				//    4    8:getfield        #30  <Field ShareContent val$content>
				//    5   11:aload_0         
				//    6   12:getfield        #32  <Field boolean val$shouldFailOnDataError>
				//    7   15:invokestatic    #50  <Method Bundle LegacyNativeDialogParameters.create(java.util.UUID, ShareContent, boolean)>
				//    8   18:areturn         
				}

				public Bundle getParameters()
				{
					return NativeDialogParameters.create(appCall.getCallId(), content, shouldFailOnDataError);
				//    0    0:aload_0         
				//    1    1:getfield        #28  <Field AppCall val$appCall>
				//    2    4:invokevirtual   #44  <Method java.util.UUID AppCall.getCallId()>
				//    3    7:aload_0         
				//    4    8:getfield        #30  <Field ShareContent val$content>
				//    5   11:aload_0         
				//    6   12:getfield        #32  <Field boolean val$shouldFailOnDataError>
				//    7   15:invokestatic    #54  <Method Bundle NativeDialogParameters.create(java.util.UUID, ShareContent, boolean)>
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
		//   14   30:aload_2         
		//   15   31:new             #10  <Class ShareDialog$NativeHandler$1>
		//   16   34:dup             
		//   17   35:aload_0         
		//   18   36:aload_2         
		//   19   37:aload_1         
		//   20   38:aload_0         
		//   21   39:getfield        #16  <Field ShareDialog this$0>
		//   22   42:invokevirtual   #70  <Method boolean ShareDialog.getShouldFailOnDataError()>
		//   23   45:invokespecial   #73  <Method void ShareDialog$NativeHandler$1(ShareDialog$NativeHandler, AppCall, ShareContent, boolean)>
		//   24   48:aload_1         
		//   25   49:invokevirtual   #31  <Method Class Object.getClass()>
		//   26   52:invokestatic    #77  <Method DialogFeature ShareDialog.access$600(Class)>
		//   27   55:invokestatic    #83  <Method void DialogPresenter.setupAppCallForNativeDialog(AppCall, com.facebook.internal.DialogPresenter$ParameterProvider, DialogFeature)>
			return appCall;
		//   28   58:aload_2         
		//   29   59:areturn         
		}

		public volatile AppCall createAppCall(Object obj)
		{
			return createAppCall((ShareContent)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #38  <Class ShareContent>
		//    3    5:invokevirtual   #86  <Method AppCall createAppCall(ShareContent)>
		//    4    8:areturn         
		}

		public Object getMode()
		{
			return ((Object) (Mode.NATIVE));
		//    0    0:getstatic       #52  <Field ShareDialog$Mode ShareDialog$Mode.NATIVE>
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

	private class WebShareHandler extends com.facebook.internal.FacebookDialogBase.ModeHandler
	{

		private String getActionName(ShareContent sharecontent)
		{
			if(sharecontent instanceof ShareLinkContent)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #25  <Class ShareLinkContent>
		//*   2    4:ifeq            10
				return "share";
		//    3    7:ldc1            #27  <String "share">
		//    4    9:areturn         
			if(sharecontent instanceof ShareOpenGraphContent)
		//*   5   10:aload_1         
		//*   6   11:instanceof      #29  <Class ShareOpenGraphContent>
		//*   7   14:ifeq            20
				return "share_open_graph";
		//    8   17:ldc1            #31  <String "share_open_graph">
		//    9   19:areturn         
			else
				return null;
		//   10   20:aconst_null     
		//   11   21:areturn         
		}

		public boolean canShow(ShareContent sharecontent)
		{
			return sharecontent != null && ShareDialog.canShowWebTypeCheck(((Object) (sharecontent)).getClass());
		//    0    0:aload_1         
		//    1    1:ifnull          16
		//    2    4:aload_1         
		//    3    5:invokevirtual   #39  <Method Class Object.getClass()>
		//    4    8:invokestatic    #43  <Method boolean ShareDialog.access$700(Class)>
		//    5   11:ifeq            16
		//    6   14:iconst_1        
		//    7   15:ireturn         
		//    8   16:iconst_0        
		//    9   17:ireturn         
		}

		public volatile boolean canShow(Object obj)
		{
			return canShow((ShareContent)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #46  <Class ShareContent>
		//    3    5:invokevirtual   #48  <Method boolean canShow(ShareContent)>
		//    4    8:ireturn         
		}

		public AppCall createAppCall(ShareContent sharecontent)
		{
			logDialogShare(((Context) (getActivityContext())), sharecontent, Mode.WEB);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field ShareDialog this$0>
		//    2    4:aload_0         
		//    3    5:getfield        #14  <Field ShareDialog this$0>
		//    4    8:invokestatic    #54  <Method Activity ShareDialog.access$800(ShareDialog)>
		//    5   11:aload_1         
		//    6   12:getstatic       #60  <Field ShareDialog$Mode ShareDialog$Mode.WEB>
		//    7   15:invokestatic    #64  <Method void ShareDialog.access$500(ShareDialog, Context, ShareContent, ShareDialog$Mode)>
			AppCall appcall = createBaseAppCall();
		//    8   18:aload_0         
		//    9   19:getfield        #14  <Field ShareDialog this$0>
		//   10   22:invokevirtual   #68  <Method AppCall ShareDialog.createBaseAppCall()>
		//   11   25:astore_3        
			ShareContentValidation.validateForWebShare(sharecontent);
		//   12   26:aload_1         
		//   13   27:invokestatic    #74  <Method void ShareContentValidation.validateForWebShare(ShareContent)>
			Bundle bundle;
			if(sharecontent instanceof ShareLinkContent)
		//*  14   30:aload_1         
		//*  15   31:instanceof      #25  <Class ShareLinkContent>
		//*  16   34:ifeq            48
				bundle = WebDialogParameters.create((ShareLinkContent)sharecontent);
		//   17   37:aload_1         
		//   18   38:checkcast       #25  <Class ShareLinkContent>
		//   19   41:invokestatic    #80  <Method Bundle WebDialogParameters.create(ShareLinkContent)>
		//   20   44:astore_2        
			else
		//*  21   45:goto            56
				bundle = WebDialogParameters.create((ShareOpenGraphContent)sharecontent);
		//   22   48:aload_1         
		//   23   49:checkcast       #29  <Class ShareOpenGraphContent>
		//   24   52:invokestatic    #83  <Method Bundle WebDialogParameters.create(ShareOpenGraphContent)>
		//   25   55:astore_2        
			DialogPresenter.setupAppCallForWebDialog(appcall, getActionName(sharecontent), bundle);
		//   26   56:aload_3         
		//   27   57:aload_0         
		//   28   58:aload_1         
		//   29   59:invokespecial   #85  <Method String getActionName(ShareContent)>
		//   30   62:aload_2         
		//   31   63:invokestatic    #91  <Method void DialogPresenter.setupAppCallForWebDialog(AppCall, String, Bundle)>
			return appcall;
		//   32   66:aload_3         
		//   33   67:areturn         
		}

		public volatile AppCall createAppCall(Object obj)
		{
			return createAppCall((ShareContent)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #46  <Class ShareContent>
		//    3    5:invokevirtual   #94  <Method AppCall createAppCall(ShareContent)>
		//    4    8:areturn         
		}

		public Object getMode()
		{
			return ((Object) (Mode.WEB));
		//    0    0:getstatic       #60  <Field ShareDialog$Mode ShareDialog$Mode.WEB>
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
	//    2    2:getstatic       #52  <Field int DEFAULT_REQUEST_CODE>
	//    3    5:invokespecial   #58  <Method void FacebookDialogBase(Activity, int)>
		shouldFailOnDataError = false;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #60  <Field boolean shouldFailOnDataError>
		isAutomaticMode = true;
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:putfield        #62  <Field boolean isAutomaticMode>
		ShareInternalUtility.registerStaticShareCallback(DEFAULT_REQUEST_CODE);
	//   10   18:getstatic       #52  <Field int DEFAULT_REQUEST_CODE>
	//   11   21:invokestatic    #68  <Method void ShareInternalUtility.registerStaticShareCallback(int)>
	//   12   24:return          
	}

	ShareDialog(Activity activity, int i)
	{
		super(activity, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #58  <Method void FacebookDialogBase(Activity, int)>
		shouldFailOnDataError = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #60  <Field boolean shouldFailOnDataError>
		isAutomaticMode = true;
	//    7   11:aload_0         
	//    8   12:iconst_1        
	//    9   13:putfield        #62  <Field boolean isAutomaticMode>
		ShareInternalUtility.registerStaticShareCallback(i);
	//   10   16:iload_2         
	//   11   17:invokestatic    #68  <Method void ShareInternalUtility.registerStaticShareCallback(int)>
	//   12   20:return          
	}

	public ShareDialog(Fragment fragment)
	{
		super(fragment, DEFAULT_REQUEST_CODE);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #52  <Field int DEFAULT_REQUEST_CODE>
	//    3    5:invokespecial   #72  <Method void FacebookDialogBase(Fragment, int)>
		shouldFailOnDataError = false;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #60  <Field boolean shouldFailOnDataError>
		isAutomaticMode = true;
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:putfield        #62  <Field boolean isAutomaticMode>
		ShareInternalUtility.registerStaticShareCallback(DEFAULT_REQUEST_CODE);
	//   10   18:getstatic       #52  <Field int DEFAULT_REQUEST_CODE>
	//   11   21:invokestatic    #68  <Method void ShareInternalUtility.registerStaticShareCallback(int)>
	//   12   24:return          
	}

	ShareDialog(Fragment fragment, int i)
	{
		super(fragment, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #72  <Method void FacebookDialogBase(Fragment, int)>
		shouldFailOnDataError = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #60  <Field boolean shouldFailOnDataError>
		isAutomaticMode = true;
	//    7   11:aload_0         
	//    8   12:iconst_1        
	//    9   13:putfield        #62  <Field boolean isAutomaticMode>
		ShareInternalUtility.registerStaticShareCallback(i);
	//   10   16:iload_2         
	//   11   17:invokestatic    #68  <Method void ShareInternalUtility.registerStaticShareCallback(int)>
	//   12   20:return          
	}

	public static boolean canShow(Class class1)
	{
		return canShowWebTypeCheck(class1) || canShowNative(class1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #98  <Method boolean canShowWebTypeCheck(Class)>
	//    2    4:ifne            19
	//    3    7:aload_0         
	//    4    8:invokestatic    #77  <Method boolean canShowNative(Class)>
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
	//    1    1:invokestatic    #94  <Method DialogFeature getFeature(Class)>
	//    2    4:astore_0        
		return class1 != null && DialogPresenter.canPresentNativeDialogWithFeature(((DialogFeature) (class1)));
	//    3    5:aload_0         
	//    4    6:ifnull          18
	//    5    9:aload_0         
	//    6   10:invokestatic    #109 <Method boolean DialogPresenter.canPresentNativeDialogWithFeature(DialogFeature)>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	private static boolean canShowWebTypeCheck(Class class1)
	{
		return ((Class) (com/facebook/share/model/ShareLinkContent)).isAssignableFrom(class1) || ((Class) (com/facebook/share/model/ShareOpenGraphContent)).isAssignableFrom(class1);
	//    0    0:ldc1            #111 <Class ShareLinkContent>
	//    1    2:aload_0         
	//    2    3:invokevirtual   #116 <Method boolean Class.isAssignableFrom(Class)>
	//    3    6:ifne            23
	//    4    9:ldc1            #118 <Class ShareOpenGraphContent>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #116 <Method boolean Class.isAssignableFrom(Class)>
	//    7   15:ifeq            21
	//    8   18:goto            23
	//    9   21:iconst_0        
	//   10   22:ireturn         
	//   11   23:iconst_1        
	//   12   24:ireturn         
	}

	private static DialogFeature getFeature(Class class1)
	{
		if(((Class) (com/facebook/share/model/ShareLinkContent)).isAssignableFrom(class1))
	//*   0    0:ldc1            #111 <Class ShareLinkContent>
	//*   1    2:aload_0         
	//*   2    3:invokevirtual   #116 <Method boolean Class.isAssignableFrom(Class)>
	//*   3    6:ifeq            13
			return ((DialogFeature) (ShareDialogFeature.SHARE_DIALOG));
	//    4    9:getstatic       #124 <Field ShareDialogFeature ShareDialogFeature.SHARE_DIALOG>
	//    5   12:areturn         
		if(((Class) (com/facebook/share/model/SharePhotoContent)).isAssignableFrom(class1))
	//*   6   13:ldc1            #126 <Class SharePhotoContent>
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #116 <Method boolean Class.isAssignableFrom(Class)>
	//*   9   19:ifeq            26
			return ((DialogFeature) (ShareDialogFeature.PHOTOS));
	//   10   22:getstatic       #129 <Field ShareDialogFeature ShareDialogFeature.PHOTOS>
	//   11   25:areturn         
		if(((Class) (com/facebook/share/model/ShareVideoContent)).isAssignableFrom(class1))
	//*  12   26:ldc1            #131 <Class ShareVideoContent>
	//*  13   28:aload_0         
	//*  14   29:invokevirtual   #116 <Method boolean Class.isAssignableFrom(Class)>
	//*  15   32:ifeq            39
			return ((DialogFeature) (ShareDialogFeature.VIDEO));
	//   16   35:getstatic       #134 <Field ShareDialogFeature ShareDialogFeature.VIDEO>
	//   17   38:areturn         
		if(((Class) (com/facebook/share/model/ShareOpenGraphContent)).isAssignableFrom(class1))
	//*  18   39:ldc1            #118 <Class ShareOpenGraphContent>
	//*  19   41:aload_0         
	//*  20   42:invokevirtual   #116 <Method boolean Class.isAssignableFrom(Class)>
	//*  21   45:ifeq            52
			return ((DialogFeature) (OpenGraphActionDialogFeature.OG_ACTION_DIALOG));
	//   22   48:getstatic       #140 <Field OpenGraphActionDialogFeature OpenGraphActionDialogFeature.OG_ACTION_DIALOG>
	//   23   51:areturn         
		else
			return null;
	//   24   52:aconst_null     
	//   25   53:areturn         
	}

	private void logDialogShare(Context context, ShareContent sharecontent, Mode mode)
	{
		if(isAutomaticMode)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field boolean isAutomaticMode>
	//*   2    4:ifeq            11
			mode = Mode.AUTOMATIC;
	//    3    7:getstatic       #145 <Field ShareDialog$Mode ShareDialog$Mode.AUTOMATIC>
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
	//*   5   11:getstatic       #149 <Field int[] ShareDialog$1.$SwitchMap$com$facebook$share$widget$ShareDialog$Mode>
	//*   6   14:aload_3         
	//*   7   15:invokevirtual   #152 <Method int ShareDialog$Mode.ordinal()>
	//*   8   18:iaload          
		{
	//*   9   19:tableswitch     1 3: default 44
	//	               1 62
	//	               2 56
	//	               3 50
		default:
			mode = "unknown";
	//   10   44:ldc1            #154 <String "unknown">
	//   11   46:astore_3        
			break;

	//*  12   47:goto            65
		case 3: // '\003'
			mode = "native";
	//   13   50:ldc1            #156 <String "native">
	//   14   52:astore_3        
			break;

	//*  15   53:goto            65
		case 2: // '\002'
			mode = "web";
	//   16   56:ldc1            #158 <String "web">
	//   17   58:astore_3        
			break;

	//*  18   59:goto            65
		case 1: // '\001'
			mode = "automatic";
	//   19   62:ldc1            #160 <String "automatic">
	//   20   64:astore_3        
			break;
		}
		sharecontent = ((ShareContent) (getFeature(((Object) (sharecontent)).getClass())));
	//   21   65:aload_2         
	//   22   66:invokevirtual   #166 <Method Class Object.getClass()>
	//   23   69:invokestatic    #94  <Method DialogFeature getFeature(Class)>
	//   24   72:astore_2        
		if(sharecontent == ShareDialogFeature.SHARE_DIALOG)
	//*  25   73:aload_2         
	//*  26   74:getstatic       #124 <Field ShareDialogFeature ShareDialogFeature.SHARE_DIALOG>
	//*  27   77:if_acmpne       86
			sharecontent = "status";
	//   28   80:ldc1            #168 <String "status">
	//   29   82:astore_2        
		else
	//*  30   83:goto            128
		if(sharecontent == ShareDialogFeature.PHOTOS)
	//*  31   86:aload_2         
	//*  32   87:getstatic       #129 <Field ShareDialogFeature ShareDialogFeature.PHOTOS>
	//*  33   90:if_acmpne       99
			sharecontent = "photo";
	//   34   93:ldc1            #170 <String "photo">
	//   35   95:astore_2        
		else
	//*  36   96:goto            128
		if(sharecontent == ShareDialogFeature.VIDEO)
	//*  37   99:aload_2         
	//*  38  100:getstatic       #134 <Field ShareDialogFeature ShareDialogFeature.VIDEO>
	//*  39  103:if_acmpne       112
			sharecontent = "video";
	//   40  106:ldc1            #172 <String "video">
	//   41  108:astore_2        
		else
	//*  42  109:goto            128
		if(sharecontent == OpenGraphActionDialogFeature.OG_ACTION_DIALOG)
	//*  43  112:aload_2         
	//*  44  113:getstatic       #140 <Field OpenGraphActionDialogFeature OpenGraphActionDialogFeature.OG_ACTION_DIALOG>
	//*  45  116:if_acmpne       125
			sharecontent = "open_graph";
	//   46  119:ldc1            #174 <String "open_graph">
	//   47  121:astore_2        
		else
	//*  48  122:goto            128
			sharecontent = "unknown";
	//   49  125:ldc1            #154 <String "unknown">
	//   50  127:astore_2        
		context = ((Context) (AppEventsLogger.newLogger(context)));
	//   51  128:aload_1         
	//   52  129:invokestatic    #180 <Method AppEventsLogger AppEventsLogger.newLogger(Context)>
	//   53  132:astore_1        
		Bundle bundle = new Bundle();
	//   54  133:new             #182 <Class Bundle>
	//   55  136:dup             
	//   56  137:invokespecial   #184 <Method void Bundle()>
	//   57  140:astore          4
		bundle.putString("fb_share_dialog_show", ((String) (mode)));
	//   58  142:aload           4
	//   59  144:ldc1            #186 <String "fb_share_dialog_show">
	//   60  146:aload_3         
	//   61  147:invokevirtual   #190 <Method void Bundle.putString(String, String)>
		bundle.putString("fb_share_dialog_content_type", ((String) (sharecontent)));
	//   62  150:aload           4
	//   63  152:ldc1            #192 <String "fb_share_dialog_content_type">
	//   64  154:aload_2         
	//   65  155:invokevirtual   #190 <Method void Bundle.putString(String, String)>
		((AppEventsLogger) (context)).logSdkEvent("fb_share_dialog_show", ((Double) (null)), bundle);
	//   66  158:aload_1         
	//   67  159:ldc1            #186 <String "fb_share_dialog_show">
	//   68  161:aconst_null     
	//   69  162:aload           4
	//   70  164:invokevirtual   #196 <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
	//   71  167:return          
	}

	public static void show(Activity activity, ShareContent sharecontent)
	{
		(new ShareDialog(activity)).show(((Object) (sharecontent)));
	//    0    0:new             #2   <Class ShareDialog>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #200 <Method void ShareDialog(Activity)>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #203 <Method void show(Object)>
	//    6   12:return          
	}

	public static void show(Fragment fragment, ShareContent sharecontent)
	{
		(new ShareDialog(fragment)).show(((Object) (sharecontent)));
	//    0    0:new             #2   <Class ShareDialog>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #206 <Method void ShareDialog(Fragment)>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #203 <Method void show(Object)>
	//    6   12:return          
	}

	public boolean canShow(ShareContent sharecontent, Mode mode)
	{
		Object obj = ((Object) (mode));
	//    0    0:aload_2         
	//    1    1:astore_3        
		if(mode == Mode.AUTOMATIC)
	//*   2    2:aload_2         
	//*   3    3:getstatic       #145 <Field ShareDialog$Mode ShareDialog$Mode.AUTOMATIC>
	//*   4    6:if_acmpne       13
			obj = BASE_AUTOMATIC_MODE;
	//    5    9:getstatic       #211 <Field Object BASE_AUTOMATIC_MODE>
	//    6   12:astore_3        
		return canShowImpl(((Object) (sharecontent)), obj);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:aload_3         
	//   10   16:invokevirtual   #215 <Method boolean canShowImpl(Object, Object)>
	//   11   19:ireturn         
	}

	protected AppCall createBaseAppCall()
	{
		return new AppCall(getRequestCode());
	//    0    0:new             #219 <Class AppCall>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #222 <Method int getRequestCode()>
	//    4    8:invokespecial   #224 <Method void AppCall(int)>
	//    5   11:areturn         
	}

	protected List getOrderedModeHandlers()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #228 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #229 <Method void ArrayList()>
	//    3    7:astore_1        
		arraylist.add(((Object) (new NativeHandler(((_cls1) (null))))));
	//    4    8:aload_1         
	//    5    9:new             #17  <Class ShareDialog$NativeHandler>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:invokespecial   #232 <Method void ShareDialog$NativeHandler(ShareDialog, ShareDialog$1)>
	//   10   18:invokevirtual   #236 <Method boolean ArrayList.add(Object)>
	//   11   21:pop             
		arraylist.add(((Object) (new FeedHandler(((_cls1) (null))))));
	//   12   22:aload_1         
	//   13   23:new             #11  <Class ShareDialog$FeedHandler>
	//   14   26:dup             
	//   15   27:aload_0         
	//   16   28:aconst_null     
	//   17   29:invokespecial   #237 <Method void ShareDialog$FeedHandler(ShareDialog, ShareDialog$1)>
	//   18   32:invokevirtual   #236 <Method boolean ArrayList.add(Object)>
	//   19   35:pop             
		arraylist.add(((Object) (new WebShareHandler(((_cls1) (null))))));
	//   20   36:aload_1         
	//   21   37:new             #22  <Class ShareDialog$WebShareHandler>
	//   22   40:dup             
	//   23   41:aload_0         
	//   24   42:aconst_null     
	//   25   43:invokespecial   #238 <Method void ShareDialog$WebShareHandler(ShareDialog, ShareDialog$1)>
	//   26   46:invokevirtual   #236 <Method boolean ArrayList.add(Object)>
	//   27   49:pop             
		return ((List) (arraylist));
	//   28   50:aload_1         
	//   29   51:areturn         
	}

	public boolean getShouldFailOnDataError()
	{
		return shouldFailOnDataError;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field boolean shouldFailOnDataError>
	//    2    4:ireturn         
	}

	protected void registerCallbackImpl(CallbackManagerImpl callbackmanagerimpl, FacebookCallback facebookcallback)
	{
		ShareInternalUtility.registerSharerCallback(getRequestCode(), ((com.facebook.CallbackManager) (callbackmanagerimpl)), facebookcallback);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #222 <Method int getRequestCode()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #247 <Method void ShareInternalUtility.registerSharerCallback(int, com.facebook.CallbackManager, FacebookCallback)>
	//    5    9:return          
	}

	public void setShouldFailOnDataError(boolean flag)
	{
		shouldFailOnDataError = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #60  <Field boolean shouldFailOnDataError>
	//    3    5:return          
	}

	public void show(ShareContent sharecontent, Mode mode)
	{
		boolean flag;
		if(mode == Mode.AUTOMATIC)
	//*   0    0:aload_2         
	//*   1    1:getstatic       #145 <Field ShareDialog$Mode ShareDialog$Mode.AUTOMATIC>
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
	//   10   16:putfield        #62  <Field boolean isAutomaticMode>
		if(isAutomaticMode)
	//*  11   19:aload_0         
	//*  12   20:getfield        #62  <Field boolean isAutomaticMode>
	//*  13   23:ifeq            30
			mode = ((Mode) (BASE_AUTOMATIC_MODE));
	//   14   26:getstatic       #211 <Field Object BASE_AUTOMATIC_MODE>
	//   15   29:astore_2        
		showImpl(((Object) (sharecontent)), ((Object) (mode)));
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:aload_2         
	//   19   33:invokevirtual   #255 <Method void showImpl(Object, Object)>
	//   20   36:return          
	}

	private static final int DEFAULT_REQUEST_CODE;
	private static final String FEED_DIALOG = "feed";
	private static final String WEB_OG_SHARE_DIALOG = "share_open_graph";
	private static final String WEB_SHARE_DIALOG = "share";
	private boolean isAutomaticMode;
	private boolean shouldFailOnDataError;

	static 
	{
		DEFAULT_REQUEST_CODE = com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Share.toRequestCode();
	//    0    0:getstatic       #46  <Field com.facebook.internal.CallbackManagerImpl$RequestCodeOffset com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.Share>
	//    1    3:invokevirtual   #50  <Method int com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.toRequestCode()>
	//    2    6:putstatic       #52  <Field int DEFAULT_REQUEST_CODE>
	//*   3    9:return          
	}


/*
	static boolean access$300(Class class1)
	{
		return canShowNative(class1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #77  <Method boolean canShowNative(Class)>
	//    2    4:ireturn         
	}

*/


/*
	static Activity access$400(ShareDialog sharedialog)
	{
		return sharedialog.getActivityContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #83  <Method Activity getActivityContext()>
	//    2    4:areturn         
	}

*/


/*
	static void access$500(ShareDialog sharedialog, Context context, ShareContent sharecontent, Mode mode)
	{
		sharedialog.logDialogShare(context, sharecontent, mode);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #89  <Method void logDialogShare(Context, ShareContent, ShareDialog$Mode)>
		return;
	//    5    7:return          
	}

*/


/*
	static DialogFeature access$600(Class class1)
	{
		return getFeature(class1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #94  <Method DialogFeature getFeature(Class)>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$700(Class class1)
	{
		return canShowWebTypeCheck(class1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #98  <Method boolean canShowWebTypeCheck(Class)>
	//    2    4:ireturn         
	}

*/


/*
	static Activity access$800(ShareDialog sharedialog)
	{
		return sharedialog.getActivityContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #83  <Method Activity getActivityContext()>
	//    2    4:areturn         
	}

*/


/*
	static Activity access$900(ShareDialog sharedialog)
	{
		return sharedialog.getActivityContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #83  <Method Activity getActivityContext()>
	//    2    4:areturn         
	}

*/
}
