// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import com.appboy.Appboy;
import com.appboy.IAppboyImageLoader;
import com.appboy.enums.AppboyViewBounds;
import com.appboy.enums.inappmessage.InAppMessageFailureType;
import com.appboy.models.*;
import com.appboy.support.*;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;
import java.io.File;

// Referenced classes of package com.appboy.ui.inappmessage:
//			AppboyInAppMessageManager

public class AppboyAsyncInAppMessageDisplayer extends AsyncTask
	implements TraceFieldInterface
{

	public AppboyAsyncInAppMessageDisplayer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void AsyncTask()>
	//    2    4:return          
	}

	public void _nr_setTrace(Trace trace)
	{
		try
		{
			_nr_trace = trace;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field Trace _nr_trace>
			return;
	//    3    5:return          
		}
		// Misplaced declaration of an exception variable
		catch(Trace trace)
	//*   4    6:astore_1        
		{
			return;
	//    5    7:return          
		}
	}

	protected transient IInAppMessage doInBackground(IInAppMessage aiinappmessage[])
	{
		aiinappmessage = ((IInAppMessage []) (aiinappmessage[0]));
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:aaload          
	//    3    3:astore_1        
		if(!((IInAppMessage) (aiinappmessage)).isControl())
			break MISSING_BLOCK_LABEL_24;
	//    4    4:aload_1         
	//    5    5:invokeinterface #44  <Method boolean IInAppMessage.isControl()>
	//    6   10:ifeq            24
		AppboyLogger.d(TAG, "Skipping in-app message preparation for control in-app message.");
	//    7   13:getstatic       #24  <Field String TAG>
	//    8   16:ldc1            #46  <String "Skipping in-app message preparation for control in-app message.">
	//    9   18:invokestatic    #50  <Method int AppboyLogger.d(String, String)>
	//   10   21:pop             
		return ((IInAppMessage) (aiinappmessage));
	//   11   22:aload_1         
	//   12   23:areturn         
		AppboyLogger.d(TAG, "Starting asynchronous in-app message preparation.");
	//   13   24:getstatic       #24  <Field String TAG>
	//   14   27:ldc1            #52  <String "Starting asynchronous in-app message preparation.">
	//   15   29:invokestatic    #50  <Method int AppboyLogger.d(String, String)>
	//   16   32:pop             
		if(!(aiinappmessage instanceof InAppMessageHtmlFull))
			break MISSING_BLOCK_LABEL_60;
	//   17   33:aload_1         
	//   18   34:instanceof      #54  <Class InAppMessageHtmlFull>
	//   19   37:ifeq            60
		if(prepareInAppMessageWithHtml(((IInAppMessage) (aiinappmessage))))
			break MISSING_BLOCK_LABEL_80;
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:invokevirtual   #58  <Method boolean prepareInAppMessageWithHtml(IInAppMessage)>
	//   23   45:ifne            80
		((IInAppMessage) (aiinappmessage)).logDisplayFailure(InAppMessageFailureType.ZIP_ASSET_DOWNLOAD);
	//   24   48:aload_1         
	//   25   49:getstatic       #64  <Field InAppMessageFailureType InAppMessageFailureType.ZIP_ASSET_DOWNLOAD>
	//   26   52:invokeinterface #68  <Method boolean IInAppMessage.logDisplayFailure(InAppMessageFailureType)>
	//   27   57:pop             
		return null;
	//   28   58:aconst_null     
	//   29   59:areturn         
		try
		{
			if(prepareInAppMessageWithBitmapDownload(((IInAppMessage) (aiinappmessage))))
				break MISSING_BLOCK_LABEL_80;
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:invokevirtual   #71  <Method boolean prepareInAppMessageWithBitmapDownload(IInAppMessage)>
	//   33   65:ifne            80
			((IInAppMessage) (aiinappmessage)).logDisplayFailure(InAppMessageFailureType.IMAGE_DOWNLOAD);
	//   34   68:aload_1         
	//   35   69:getstatic       #74  <Field InAppMessageFailureType InAppMessageFailureType.IMAGE_DOWNLOAD>
	//   36   72:invokeinterface #68  <Method boolean IInAppMessage.logDisplayFailure(InAppMessageFailureType)>
	//   37   77:pop             
		}
	//*  38   78:aconst_null     
	//*  39   79:areturn         
	//*  40   80:aload_1         
	//*  41   81:areturn         
		// Misplaced declaration of an exception variable
		catch(IInAppMessage aiinappmessage[])
	//*  42   82:astore_1        
		{
			AppboyLogger.e(TAG, "Error running AsyncInAppMessageDisplayer", ((Throwable) (aiinappmessage)));
	//   43   83:getstatic       #24  <Field String TAG>
	//   44   86:ldc1            #76  <String "Error running AsyncInAppMessageDisplayer">
	//   45   88:aload_1         
	//   46   89:invokestatic    #80  <Method int AppboyLogger.e(String, String, Throwable)>
	//   47   92:pop             
			return null;
	//   48   93:aconst_null     
	//   49   94:areturn         
		}
		return null;
		return ((IInAppMessage) (aiinappmessage));
	}

	protected volatile Object doInBackground(Object aobj[])
	{
		TraceMachine.enterMethod(_nr_trace, "AppboyAsyncInAppMessageDisplayer#doInBackground", ((java.util.ArrayList) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Trace _nr_trace>
	//    2    4:ldc1            #85  <String "AppboyAsyncInAppMessageDisplayer#doInBackground">
	//    3    6:aconst_null     
	//    4    7:invokestatic    #91  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
		  goto _L1
	//*   5   10:goto            20
_L3:
		TraceMachine.enterMethod(((Trace) (null)), "AppboyAsyncInAppMessageDisplayer#doInBackground", ((java.util.ArrayList) (null)));
	//    6   13:aconst_null     
	//    7   14:ldc1            #85  <String "AppboyAsyncInAppMessageDisplayer#doInBackground">
	//    8   16:aconst_null     
	//    9   17:invokestatic    #91  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
		aobj = ((Object []) (doInBackground((IInAppMessage[])aobj)));
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:checkcast       #93  <Class IInAppMessage[]>
	//   13   25:invokevirtual   #95  <Method IInAppMessage doInBackground(IInAppMessage[])>
	//   14   28:astore_1        
		TraceMachine.exitMethod();
	//   15   29:invokestatic    #98  <Method void TraceMachine.exitMethod()>
		TraceMachine.unloadTraceContext(((Object) (this)));
	//   16   32:aload_0         
	//   17   33:invokestatic    #102 <Method void TraceMachine.unloadTraceContext(Object)>
		return ((Object) (aobj));
	//   18   36:aload_1         
	//   19   37:areturn         
		NoSuchFieldError nosuchfielderror;
		nosuchfielderror;
	//   20   38:astore_2        
		if(true) goto _L3; else goto _L2
_L2:
	//*  21   39:goto            13
	}

	protected void onPostExecute(final IInAppMessage inAppMessage)
	{
		if(inAppMessage != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          43
		{
			try
			{
				AppboyLogger.d(TAG, "Finished asynchronous in-app message preparation. Attempting to display in-app message.");
	//    2    4:getstatic       #24  <Field String TAG>
	//    3    7:ldc1            #106 <String "Finished asynchronous in-app message preparation. Attempting to display in-app message.">
	//    4    9:invokestatic    #50  <Method int AppboyLogger.d(String, String)>
	//    5   12:pop             
				(new Handler(AppboyInAppMessageManager.getInstance().getApplicationContext().getMainLooper())).post(new Runnable() {

					public void run()
					{
						AppboyLogger.d(AppboyAsyncInAppMessageDisplayer.TAG, "Displaying in-app message.");
					//    0    0:invokestatic    #30  <Method String AppboyAsyncInAppMessageDisplayer.access$000()>
					//    1    3:ldc1            #32  <String "Displaying in-app message.">
					//    2    5:invokestatic    #38  <Method int AppboyLogger.d(String, String)>
					//    3    8:pop             
						AppboyInAppMessageManager.getInstance().displayInAppMessage(inAppMessage, false);
					//    4    9:invokestatic    #44  <Method AppboyInAppMessageManager AppboyInAppMessageManager.getInstance()>
					//    5   12:aload_0         
					//    6   13:getfield        #21  <Field IInAppMessage val$inAppMessage>
					//    7   16:iconst_0        
					//    8   17:invokevirtual   #48  <Method boolean AppboyInAppMessageManager.displayInAppMessage(IInAppMessage, boolean)>
					//    9   20:pop             
					//   10   21:return          
					}

					final AppboyAsyncInAppMessageDisplayer this$0;
					final IInAppMessage val$inAppMessage;

			
			{
				this$0 = AppboyAsyncInAppMessageDisplayer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AppboyAsyncInAppMessageDisplayer this$0>
				inAppMessage = iinappmessage;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field IInAppMessage val$inAppMessage>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
				}
);
	//    6   13:new             #108 <Class Handler>
	//    7   16:dup             
	//    8   17:invokestatic    #114 <Method AppboyInAppMessageManager AppboyInAppMessageManager.getInstance()>
	//    9   20:invokevirtual   #118 <Method Context AppboyInAppMessageManager.getApplicationContext()>
	//   10   23:invokevirtual   #124 <Method android.os.Looper Context.getMainLooper()>
	//   11   26:invokespecial   #127 <Method void Handler(android.os.Looper)>
	//   12   29:new             #9   <Class AppboyAsyncInAppMessageDisplayer$1>
	//   13   32:dup             
	//   14   33:aload_0         
	//   15   34:aload_1         
	//   16   35:invokespecial   #130 <Method void AppboyAsyncInAppMessageDisplayer$1(AppboyAsyncInAppMessageDisplayer, IInAppMessage)>
	//   17   38:invokevirtual   #134 <Method boolean Handler.post(Runnable)>
	//   18   41:pop             
				return;
	//   19   42:return          
			}
	//*  20   43:getstatic       #24  <Field String TAG>
	//*  21   46:ldc1            #136 <String "Cannot display the in-app message because the in-app message was null.">
	//*  22   48:invokestatic    #138 <Method int AppboyLogger.e(String, String)>
	//*  23   51:pop             
	//*  24   52:return          
			// Misplaced declaration of an exception variable
			catch(final IInAppMessage inAppMessage)
	//*  25   53:astore_1        
			{
				AppboyLogger.e(TAG, "Error running onPostExecute", ((Throwable) (inAppMessage)));
	//   26   54:getstatic       #24  <Field String TAG>
	//   27   57:ldc1            #140 <String "Error running onPostExecute">
	//   28   59:aload_1         
	//   29   60:invokestatic    #80  <Method int AppboyLogger.e(String, String, Throwable)>
	//   30   63:pop             
			}
			break MISSING_BLOCK_LABEL_64;
		}
		AppboyLogger.e(TAG, "Cannot display the in-app message because the in-app message was null.");
		return;
	//   31   64:return          
	}

	protected volatile void onPostExecute(Object obj)
	{
		TraceMachine.enterMethod(_nr_trace, "AppboyAsyncInAppMessageDisplayer#onPostExecute", ((java.util.ArrayList) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Trace _nr_trace>
	//    2    4:ldc1            #142 <String "AppboyAsyncInAppMessageDisplayer#onPostExecute">
	//    3    6:aconst_null     
	//    4    7:invokestatic    #91  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
		  goto _L1
	//*   5   10:goto            20
_L3:
		TraceMachine.enterMethod(((Trace) (null)), "AppboyAsyncInAppMessageDisplayer#onPostExecute", ((java.util.ArrayList) (null)));
	//    6   13:aconst_null     
	//    7   14:ldc1            #142 <String "AppboyAsyncInAppMessageDisplayer#onPostExecute">
	//    8   16:aconst_null     
	//    9   17:invokestatic    #91  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
		onPostExecute((IInAppMessage)obj);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:checkcast       #40  <Class IInAppMessage>
	//   13   25:invokevirtual   #144 <Method void onPostExecute(IInAppMessage)>
		TraceMachine.exitMethod();
	//   14   28:invokestatic    #98  <Method void TraceMachine.exitMethod()>
		return;
	//   15   31:return          
		NoSuchFieldError nosuchfielderror;
		nosuchfielderror;
	//   16   32:astore_2        
		if(true) goto _L3; else goto _L2
_L2:
	//*  17   33:goto            13
	}

	boolean prepareInAppMessageWithBitmapDownload(IInAppMessage iinappmessage)
	{
		if(iinappmessage.getBitmap() != null)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #148 <Method android.graphics.Bitmap IInAppMessage.getBitmap()>
	//*   2    6:ifnull          27
		{
			AppboyLogger.i(TAG, "In-app message already contains image bitmap. Not downloading image from URL.");
	//    3    9:getstatic       #24  <Field String TAG>
	//    4   12:ldc1            #150 <String "In-app message already contains image bitmap. Not downloading image from URL.">
	//    5   14:invokestatic    #153 <Method int AppboyLogger.i(String, String)>
	//    6   17:pop             
			iinappmessage.setImageDownloadSuccessful(true);
	//    7   18:aload_1         
	//    8   19:iconst_1        
	//    9   20:invokeinterface #157 <Method void IInAppMessage.setImageDownloadSuccessful(boolean)>
			return true;
	//   10   25:iconst_1        
	//   11   26:ireturn         
		}
		String s = iinappmessage.getLocalImageUrl();
	//   12   27:aload_1         
	//   13   28:invokeinterface #160 <Method String IInAppMessage.getLocalImageUrl()>
	//   14   33:astore_2        
		if(!StringUtils.isNullOrBlank(s) && (new File(s)).exists())
	//*  15   34:aload_2         
	//*  16   35:invokestatic    #166 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  17   38:ifne            77
	//*  18   41:new             #168 <Class File>
	//*  19   44:dup             
	//*  20   45:aload_2         
	//*  21   46:invokespecial   #171 <Method void File(String)>
	//*  22   49:invokevirtual   #174 <Method boolean File.exists()>
	//*  23   52:ifeq            77
		{
			AppboyLogger.i(TAG, "In-app message has local image url.");
	//   24   55:getstatic       #24  <Field String TAG>
	//   25   58:ldc1            #176 <String "In-app message has local image url.">
	//   26   60:invokestatic    #153 <Method int AppboyLogger.i(String, String)>
	//   27   63:pop             
			iinappmessage.setBitmap(AppboyImageUtils.getBitmap(Uri.parse(s)));
	//   28   64:aload_1         
	//   29   65:aload_2         
	//   30   66:invokestatic    #182 <Method Uri Uri.parse(String)>
	//   31   69:invokestatic    #187 <Method android.graphics.Bitmap AppboyImageUtils.getBitmap(Uri)>
	//   32   72:invokeinterface #191 <Method void IInAppMessage.setBitmap(android.graphics.Bitmap)>
		}
		if(iinappmessage.getBitmap() == null)
	//*  33   77:aload_1         
	//*  34   78:invokeinterface #148 <Method android.graphics.Bitmap IInAppMessage.getBitmap()>
	//*  35   83:ifnonnull       183
		{
			String s1 = iinappmessage.getRemoteImageUrl();
	//   36   86:aload_1         
	//   37   87:invokeinterface #194 <Method String IInAppMessage.getRemoteImageUrl()>
	//   38   92:astore_3        
			if(!StringUtils.isNullOrBlank(s1))
	//*  39   93:aload_3         
	//*  40   94:invokestatic    #166 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  41   97:ifne            172
			{
				AppboyLogger.i(TAG, "In-app message has remote image url. Downloading.");
	//   42  100:getstatic       #24  <Field String TAG>
	//   43  103:ldc1            #196 <String "In-app message has remote image url. Downloading.">
	//   44  105:invokestatic    #153 <Method int AppboyLogger.i(String, String)>
	//   45  108:pop             
				AppboyViewBounds appboyviewbounds = AppboyViewBounds.NO_BOUNDS;
	//   46  109:getstatic       #202 <Field AppboyViewBounds AppboyViewBounds.NO_BOUNDS>
	//   47  112:astore_2        
				if(iinappmessage instanceof InAppMessageSlideup)
	//*  48  113:aload_1         
	//*  49  114:instanceof      #204 <Class InAppMessageSlideup>
	//*  50  117:ifeq            127
					appboyviewbounds = AppboyViewBounds.IN_APP_MESSAGE_SLIDEUP;
	//   51  120:getstatic       #207 <Field AppboyViewBounds AppboyViewBounds.IN_APP_MESSAGE_SLIDEUP>
	//   52  123:astore_2        
				else
	//*  53  124:goto            138
				if(iinappmessage instanceof InAppMessageModal)
	//*  54  127:aload_1         
	//*  55  128:instanceof      #209 <Class InAppMessageModal>
	//*  56  131:ifeq            138
					appboyviewbounds = AppboyViewBounds.IN_APP_MESSAGE_MODAL;
	//   57  134:getstatic       #212 <Field AppboyViewBounds AppboyViewBounds.IN_APP_MESSAGE_MODAL>
	//   58  137:astore_2        
				Context context = AppboyInAppMessageManager.getInstance().getApplicationContext();
	//   59  138:invokestatic    #114 <Method AppboyInAppMessageManager AppboyInAppMessageManager.getInstance()>
	//   60  141:invokevirtual   #118 <Method Context AppboyInAppMessageManager.getApplicationContext()>
	//   61  144:astore          4
				iinappmessage.setBitmap(Appboy.getInstance(context).getAppboyImageLoader().getBitmapFromUrl(context, s1, appboyviewbounds));
	//   62  146:aload_1         
	//   63  147:aload           4
	//   64  149:invokestatic    #217 <Method Appboy Appboy.getInstance(Context)>
	//   65  152:invokevirtual   #221 <Method IAppboyImageLoader Appboy.getAppboyImageLoader()>
	//   66  155:aload           4
	//   67  157:aload_3         
	//   68  158:aload_2         
	//   69  159:invokeinterface #227 <Method android.graphics.Bitmap IAppboyImageLoader.getBitmapFromUrl(Context, String, AppboyViewBounds)>
	//   70  164:invokeinterface #191 <Method void IInAppMessage.setBitmap(android.graphics.Bitmap)>
			} else
	//*  71  169:goto            183
			{
				AppboyLogger.w(TAG, "In-app message has no remote image url. Not downloading image.");
	//   72  172:getstatic       #24  <Field String TAG>
	//   73  175:ldc1            #229 <String "In-app message has no remote image url. Not downloading image.">
	//   74  177:invokestatic    #232 <Method int AppboyLogger.w(String, String)>
	//   75  180:pop             
				return true;
	//   76  181:iconst_1        
	//   77  182:ireturn         
			}
		}
		if(iinappmessage.getBitmap() != null)
	//*  78  183:aload_1         
	//*  79  184:invokeinterface #148 <Method android.graphics.Bitmap IInAppMessage.getBitmap()>
	//*  80  189:ifnull          201
		{
			iinappmessage.setImageDownloadSuccessful(true);
	//   81  192:aload_1         
	//   82  193:iconst_1        
	//   83  194:invokeinterface #157 <Method void IInAppMessage.setImageDownloadSuccessful(boolean)>
			return true;
	//   84  199:iconst_1        
	//   85  200:ireturn         
		} else
		{
			return false;
	//   86  201:iconst_0        
	//   87  202:ireturn         
		}
	}

	boolean prepareInAppMessageWithHtml(IInAppMessage iinappmessage)
	{
		iinappmessage = ((IInAppMessage) ((InAppMessageHtmlBase)iinappmessage));
	//    0    0:aload_1         
	//    1    1:checkcast       #234 <Class InAppMessageHtmlBase>
	//    2    4:astore_1        
		String s = ((InAppMessageHtmlBase) (iinappmessage)).getLocalAssetsDirectoryUrl();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #237 <Method String InAppMessageHtmlBase.getLocalAssetsDirectoryUrl()>
	//    5    9:astore_2        
		if(!StringUtils.isNullOrBlank(s) && (new File(s)).exists())
	//*   6   10:aload_2         
	//*   7   11:invokestatic    #166 <Method boolean StringUtils.isNullOrBlank(String)>
	//*   8   14:ifne            42
	//*   9   17:new             #168 <Class File>
	//*  10   20:dup             
	//*  11   21:aload_2         
	//*  12   22:invokespecial   #171 <Method void File(String)>
	//*  13   25:invokevirtual   #174 <Method boolean File.exists()>
	//*  14   28:ifeq            42
		{
			AppboyLogger.i(TAG, "Local assets for html in-app message are already populated. Not downloading assets.");
	//   15   31:getstatic       #24  <Field String TAG>
	//   16   34:ldc1            #239 <String "Local assets for html in-app message are already populated. Not downloading assets.">
	//   17   36:invokestatic    #153 <Method int AppboyLogger.i(String, String)>
	//   18   39:pop             
			return true;
	//   19   40:iconst_1        
	//   20   41:ireturn         
		}
		if(StringUtils.isNullOrBlank(((InAppMessageHtmlBase) (iinappmessage)).getAssetsZipRemoteUrl()))
	//*  21   42:aload_1         
	//*  22   43:invokevirtual   #242 <Method String InAppMessageHtmlBase.getAssetsZipRemoteUrl()>
	//*  23   46:invokestatic    #166 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  24   49:ifeq            63
		{
			AppboyLogger.i(TAG, "Html in-app message has no remote asset zip. Continuing with in-app message preparation.");
	//   25   52:getstatic       #24  <Field String TAG>
	//   26   55:ldc1            #244 <String "Html in-app message has no remote asset zip. Continuing with in-app message preparation.">
	//   27   57:invokestatic    #153 <Method int AppboyLogger.i(String, String)>
	//   28   60:pop             
			return true;
	//   29   61:iconst_1        
	//   30   62:ireturn         
		}
		s = WebContentUtils.getLocalHtmlUrlFromRemoteUrl(WebContentUtils.getHtmlInAppMessageAssetCacheDirectory(AppboyInAppMessageManager.getInstance().getApplicationContext()), ((InAppMessageHtmlBase) (iinappmessage)).getAssetsZipRemoteUrl());
	//   31   63:invokestatic    #114 <Method AppboyInAppMessageManager AppboyInAppMessageManager.getInstance()>
	//   32   66:invokevirtual   #118 <Method Context AppboyInAppMessageManager.getApplicationContext()>
	//   33   69:invokestatic    #250 <Method File WebContentUtils.getHtmlInAppMessageAssetCacheDirectory(Context)>
	//   34   72:aload_1         
	//   35   73:invokevirtual   #242 <Method String InAppMessageHtmlBase.getAssetsZipRemoteUrl()>
	//   36   76:invokestatic    #254 <Method String WebContentUtils.getLocalHtmlUrlFromRemoteUrl(File, String)>
	//   37   79:astore_2        
		if(!StringUtils.isNullOrBlank(s))
	//*  38   80:aload_2         
	//*  39   81:invokestatic    #166 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  40   84:ifne            133
		{
			String s1 = TAG;
	//   41   87:getstatic       #24  <Field String TAG>
	//   42   90:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   43   91:new             #256 <Class StringBuilder>
	//   44   94:dup             
	//   45   95:invokespecial   #257 <Method void StringBuilder()>
	//   46   98:astore          4
			stringbuilder.append("Local url for html in-app message assets is ");
	//   47  100:aload           4
	//   48  102:ldc2            #259 <String "Local url for html in-app message assets is ">
	//   49  105:invokevirtual   #263 <Method StringBuilder StringBuilder.append(String)>
	//   50  108:pop             
			stringbuilder.append(s);
	//   51  109:aload           4
	//   52  111:aload_2         
	//   53  112:invokevirtual   #263 <Method StringBuilder StringBuilder.append(String)>
	//   54  115:pop             
			AppboyLogger.d(s1, stringbuilder.toString());
	//   55  116:aload_3         
	//   56  117:aload           4
	//   57  119:invokevirtual   #266 <Method String StringBuilder.toString()>
	//   58  122:invokestatic    #50  <Method int AppboyLogger.d(String, String)>
	//   59  125:pop             
			((InAppMessageHtmlBase) (iinappmessage)).setLocalAssetsDirectoryUrl(s);
	//   60  126:aload_1         
	//   61  127:aload_2         
	//   62  128:invokevirtual   #269 <Method void InAppMessageHtmlBase.setLocalAssetsDirectoryUrl(String)>
			return true;
	//   63  131:iconst_1        
	//   64  132:ireturn         
		} else
		{
			String s2 = TAG;
	//   65  133:getstatic       #24  <Field String TAG>
	//   66  136:astore_3        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   67  137:new             #256 <Class StringBuilder>
	//   68  140:dup             
	//   69  141:invokespecial   #257 <Method void StringBuilder()>
	//   70  144:astore          4
			stringbuilder1.append("Download of html content to local directory failed for remote url: ");
	//   71  146:aload           4
	//   72  148:ldc2            #271 <String "Download of html content to local directory failed for remote url: ">
	//   73  151:invokevirtual   #263 <Method StringBuilder StringBuilder.append(String)>
	//   74  154:pop             
			stringbuilder1.append(((InAppMessageHtmlBase) (iinappmessage)).getAssetsZipRemoteUrl());
	//   75  155:aload           4
	//   76  157:aload_1         
	//   77  158:invokevirtual   #242 <Method String InAppMessageHtmlBase.getAssetsZipRemoteUrl()>
	//   78  161:invokevirtual   #263 <Method StringBuilder StringBuilder.append(String)>
	//   79  164:pop             
			stringbuilder1.append(" . Returned local url is: ");
	//   80  165:aload           4
	//   81  167:ldc2            #273 <String " . Returned local url is: ">
	//   82  170:invokevirtual   #263 <Method StringBuilder StringBuilder.append(String)>
	//   83  173:pop             
			stringbuilder1.append(s);
	//   84  174:aload           4
	//   85  176:aload_2         
	//   86  177:invokevirtual   #263 <Method StringBuilder StringBuilder.append(String)>
	//   87  180:pop             
			AppboyLogger.w(s2, stringbuilder1.toString());
	//   88  181:aload_3         
	//   89  182:aload           4
	//   90  184:invokevirtual   #266 <Method String StringBuilder.toString()>
	//   91  187:invokestatic    #232 <Method int AppboyLogger.w(String, String)>
	//   92  190:pop             
			return false;
	//   93  191:iconst_0        
	//   94  192:ireturn         
		}
	}

	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/inappmessage/AppboyAsyncInAppMessageDisplayer);
	public Trace _nr_trace;

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyAsyncInAppMessageDisplayer>
	//    1    2:invokestatic    #22  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #24  <Field String TAG>
	//*   3    8:return          
	}


/*
	static String access$000()
	{
		return TAG;
	//    0    0:getstatic       #24  <Field String TAG>
	//    1    3:areturn         
	}

*/
}
