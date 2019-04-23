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
import com.appboy.ui.support.FrescoLibraryUtils;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.File;

// Referenced classes of package com.appboy.ui.inappmessage:
//			AppboyInAppMessageManager

public class AppboyAsyncInAppMessageDisplayer extends AsyncTask
{

	public AppboyAsyncInAppMessageDisplayer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void AsyncTask()>
	//    2    4:return          
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
	//    5    5:invokeinterface #35  <Method boolean IInAppMessage.isControl()>
	//    6   10:ifeq            24
		AppboyLogger.d(TAG, "Skipping in-app message preparation for control in-app message.");
	//    7   13:getstatic       #19  <Field String TAG>
	//    8   16:ldc1            #37  <String "Skipping in-app message preparation for control in-app message.">
	//    9   18:invokestatic    #41  <Method int AppboyLogger.d(String, String)>
	//   10   21:pop             
		return ((IInAppMessage) (aiinappmessage));
	//   11   22:aload_1         
	//   12   23:areturn         
		Context context;
		AppboyLogger.d(TAG, "Starting asynchronous in-app message preparation.");
	//   13   24:getstatic       #19  <Field String TAG>
	//   14   27:ldc1            #43  <String "Starting asynchronous in-app message preparation.">
	//   15   29:invokestatic    #41  <Method int AppboyLogger.d(String, String)>
	//   16   32:pop             
		context = AppboyInAppMessageManager.getInstance().getApplicationContext();
	//   17   33:invokestatic    #49  <Method AppboyInAppMessageManager AppboyInAppMessageManager.getInstance()>
	//   18   36:invokevirtual   #53  <Method Context AppboyInAppMessageManager.getApplicationContext()>
	//   19   39:astore_3        
		if(!(aiinappmessage instanceof InAppMessageHtmlFull))
			break MISSING_BLOCK_LABEL_67;
	//   20   40:aload_1         
	//   21   41:instanceof      #55  <Class InAppMessageHtmlFull>
	//   22   44:ifeq            67
		if(prepareInAppMessageWithHtml(((IInAppMessage) (aiinappmessage))))
			break MISSING_BLOCK_LABEL_105;
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:invokevirtual   #59  <Method boolean prepareInAppMessageWithHtml(IInAppMessage)>
	//   26   52:ifne            105
		((IInAppMessage) (aiinappmessage)).logDisplayFailure(InAppMessageFailureType.ZIP_ASSET_DOWNLOAD);
	//   27   55:aload_1         
	//   28   56:getstatic       #65  <Field InAppMessageFailureType InAppMessageFailureType.ZIP_ASSET_DOWNLOAD>
	//   29   59:invokeinterface #69  <Method boolean IInAppMessage.logDisplayFailure(InAppMessageFailureType)>
	//   30   64:pop             
		return null;
	//   31   65:aconst_null     
	//   32   66:areturn         
label0:
		{
			boolean flag;
			if(FrescoLibraryUtils.canUseFresco(context))
	//*  33   67:aload_3         
	//*  34   68:invokestatic    #75  <Method boolean FrescoLibraryUtils.canUseFresco(Context)>
	//*  35   71:ifeq            83
			{
				flag = prepareInAppMessageWithFresco(((IInAppMessage) (aiinappmessage)));
	//   36   74:aload_0         
	//   37   75:aload_1         
	//   38   76:invokevirtual   #78  <Method boolean prepareInAppMessageWithFresco(IInAppMessage)>
	//   39   79:istore_2        
				break label0;
	//   40   80:goto            89
			}
			try
			{
				flag = prepareInAppMessageWithBitmapDownload(((IInAppMessage) (aiinappmessage)));
	//   41   83:aload_0         
	//   42   84:aload_1         
	//   43   85:invokevirtual   #81  <Method boolean prepareInAppMessageWithBitmapDownload(IInAppMessage)>
	//   44   88:istore_2        
			}
	//*  45   89:iload_2         
	//*  46   90:ifne            105
	//*  47   93:aload_1         
	//*  48   94:getstatic       #84  <Field InAppMessageFailureType InAppMessageFailureType.IMAGE_DOWNLOAD>
	//*  49   97:invokeinterface #69  <Method boolean IInAppMessage.logDisplayFailure(InAppMessageFailureType)>
	//*  50  102:pop             
	//*  51  103:aconst_null     
	//*  52  104:areturn         
	//*  53  105:aload_1         
	//*  54  106:areturn         
			// Misplaced declaration of an exception variable
			catch(IInAppMessage aiinappmessage[])
	//*  55  107:astore_1        
			{
				AppboyLogger.e(TAG, "Error running AsyncInAppMessageDisplayer", ((Throwable) (aiinappmessage)));
	//   56  108:getstatic       #19  <Field String TAG>
	//   57  111:ldc1            #86  <String "Error running AsyncInAppMessageDisplayer">
	//   58  113:aload_1         
	//   59  114:invokestatic    #90  <Method int AppboyLogger.e(String, String, Throwable)>
	//   60  117:pop             
				return null;
	//   61  118:aconst_null     
	//   62  119:areturn         
			}
		}
		if(flag)
			break MISSING_BLOCK_LABEL_105;
		((IInAppMessage) (aiinappmessage)).logDisplayFailure(InAppMessageFailureType.IMAGE_DOWNLOAD);
		return null;
		return ((IInAppMessage) (aiinappmessage));
	}

	protected volatile Object doInBackground(Object aobj[])
	{
		return ((Object) (doInBackground((IInAppMessage[])aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #93  <Class IInAppMessage[]>
	//    3    5:invokevirtual   #95  <Method IInAppMessage doInBackground(IInAppMessage[])>
	//    4    8:areturn         
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
	//    2    4:getstatic       #19  <Field String TAG>
	//    3    7:ldc1            #99  <String "Finished asynchronous in-app message preparation. Attempting to display in-app message.">
	//    4    9:invokestatic    #41  <Method int AppboyLogger.d(String, String)>
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
	//    6   13:new             #101 <Class Handler>
	//    7   16:dup             
	//    8   17:invokestatic    #49  <Method AppboyInAppMessageManager AppboyInAppMessageManager.getInstance()>
	//    9   20:invokevirtual   #53  <Method Context AppboyInAppMessageManager.getApplicationContext()>
	//   10   23:invokevirtual   #107 <Method android.os.Looper Context.getMainLooper()>
	//   11   26:invokespecial   #110 <Method void Handler(android.os.Looper)>
	//   12   29:new             #7   <Class AppboyAsyncInAppMessageDisplayer$1>
	//   13   32:dup             
	//   14   33:aload_0         
	//   15   34:aload_1         
	//   16   35:invokespecial   #113 <Method void AppboyAsyncInAppMessageDisplayer$1(AppboyAsyncInAppMessageDisplayer, IInAppMessage)>
	//   17   38:invokevirtual   #117 <Method boolean Handler.post(Runnable)>
	//   18   41:pop             
				return;
	//   19   42:return          
			}
	//*  20   43:getstatic       #19  <Field String TAG>
	//*  21   46:ldc1            #119 <String "Cannot display the in-app message because the in-app message was null.">
	//*  22   48:invokestatic    #121 <Method int AppboyLogger.e(String, String)>
	//*  23   51:pop             
	//*  24   52:return          
			// Misplaced declaration of an exception variable
			catch(final IInAppMessage inAppMessage)
	//*  25   53:astore_1        
			{
				AppboyLogger.e(TAG, "Error running onPostExecute", ((Throwable) (inAppMessage)));
	//   26   54:getstatic       #19  <Field String TAG>
	//   27   57:ldc1            #123 <String "Error running onPostExecute">
	//   28   59:aload_1         
	//   29   60:invokestatic    #90  <Method int AppboyLogger.e(String, String, Throwable)>
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
		onPostExecute((IInAppMessage)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #31  <Class IInAppMessage>
	//    3    5:invokevirtual   #126 <Method void onPostExecute(IInAppMessage)>
	//    4    8:return          
	}

	boolean prepareInAppMessageWithBitmapDownload(IInAppMessage iinappmessage)
	{
		if(iinappmessage.getBitmap() != null)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #130 <Method android.graphics.Bitmap IInAppMessage.getBitmap()>
	//*   2    6:ifnull          27
		{
			AppboyLogger.i(TAG, "In-app message already contains image bitmap. Not downloading image from URL.");
	//    3    9:getstatic       #19  <Field String TAG>
	//    4   12:ldc1            #132 <String "In-app message already contains image bitmap. Not downloading image from URL.">
	//    5   14:invokestatic    #135 <Method int AppboyLogger.i(String, String)>
	//    6   17:pop             
			iinappmessage.setImageDownloadSuccessful(true);
	//    7   18:aload_1         
	//    8   19:iconst_1        
	//    9   20:invokeinterface #139 <Method void IInAppMessage.setImageDownloadSuccessful(boolean)>
			return true;
	//   10   25:iconst_1        
	//   11   26:ireturn         
		}
		String s = iinappmessage.getLocalImageUrl();
	//   12   27:aload_1         
	//   13   28:invokeinterface #142 <Method String IInAppMessage.getLocalImageUrl()>
	//   14   33:astore_2        
		if(!StringUtils.isNullOrBlank(s) && (new File(s)).exists())
	//*  15   34:aload_2         
	//*  16   35:invokestatic    #148 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  17   38:ifne            77
	//*  18   41:new             #150 <Class File>
	//*  19   44:dup             
	//*  20   45:aload_2         
	//*  21   46:invokespecial   #153 <Method void File(String)>
	//*  22   49:invokevirtual   #156 <Method boolean File.exists()>
	//*  23   52:ifeq            77
		{
			AppboyLogger.i(TAG, "In-app message has local image url.");
	//   24   55:getstatic       #19  <Field String TAG>
	//   25   58:ldc1            #158 <String "In-app message has local image url.">
	//   26   60:invokestatic    #135 <Method int AppboyLogger.i(String, String)>
	//   27   63:pop             
			iinappmessage.setBitmap(AppboyImageUtils.getBitmap(Uri.parse(s)));
	//   28   64:aload_1         
	//   29   65:aload_2         
	//   30   66:invokestatic    #164 <Method Uri Uri.parse(String)>
	//   31   69:invokestatic    #169 <Method android.graphics.Bitmap AppboyImageUtils.getBitmap(Uri)>
	//   32   72:invokeinterface #173 <Method void IInAppMessage.setBitmap(android.graphics.Bitmap)>
		}
		if(iinappmessage.getBitmap() == null)
	//*  33   77:aload_1         
	//*  34   78:invokeinterface #130 <Method android.graphics.Bitmap IInAppMessage.getBitmap()>
	//*  35   83:ifnonnull       183
		{
			String s1 = iinappmessage.getRemoteImageUrl();
	//   36   86:aload_1         
	//   37   87:invokeinterface #176 <Method String IInAppMessage.getRemoteImageUrl()>
	//   38   92:astore_3        
			if(!StringUtils.isNullOrBlank(s1))
	//*  39   93:aload_3         
	//*  40   94:invokestatic    #148 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  41   97:ifne            172
			{
				AppboyLogger.i(TAG, "In-app message has remote image url. Downloading.");
	//   42  100:getstatic       #19  <Field String TAG>
	//   43  103:ldc1            #178 <String "In-app message has remote image url. Downloading.">
	//   44  105:invokestatic    #135 <Method int AppboyLogger.i(String, String)>
	//   45  108:pop             
				AppboyViewBounds appboyviewbounds = AppboyViewBounds.NO_BOUNDS;
	//   46  109:getstatic       #184 <Field AppboyViewBounds AppboyViewBounds.NO_BOUNDS>
	//   47  112:astore_2        
				if(iinappmessage instanceof InAppMessageSlideup)
	//*  48  113:aload_1         
	//*  49  114:instanceof      #186 <Class InAppMessageSlideup>
	//*  50  117:ifeq            127
					appboyviewbounds = AppboyViewBounds.IN_APP_MESSAGE_SLIDEUP;
	//   51  120:getstatic       #189 <Field AppboyViewBounds AppboyViewBounds.IN_APP_MESSAGE_SLIDEUP>
	//   52  123:astore_2        
				else
	//*  53  124:goto            138
				if(iinappmessage instanceof InAppMessageModal)
	//*  54  127:aload_1         
	//*  55  128:instanceof      #191 <Class InAppMessageModal>
	//*  56  131:ifeq            138
					appboyviewbounds = AppboyViewBounds.IN_APP_MESSAGE_MODAL;
	//   57  134:getstatic       #194 <Field AppboyViewBounds AppboyViewBounds.IN_APP_MESSAGE_MODAL>
	//   58  137:astore_2        
				Context context = AppboyInAppMessageManager.getInstance().getApplicationContext();
	//   59  138:invokestatic    #49  <Method AppboyInAppMessageManager AppboyInAppMessageManager.getInstance()>
	//   60  141:invokevirtual   #53  <Method Context AppboyInAppMessageManager.getApplicationContext()>
	//   61  144:astore          4
				iinappmessage.setBitmap(Appboy.getInstance(context).getAppboyImageLoader().getBitmapFromUrl(context, s1, appboyviewbounds));
	//   62  146:aload_1         
	//   63  147:aload           4
	//   64  149:invokestatic    #199 <Method Appboy Appboy.getInstance(Context)>
	//   65  152:invokevirtual   #203 <Method IAppboyImageLoader Appboy.getAppboyImageLoader()>
	//   66  155:aload           4
	//   67  157:aload_3         
	//   68  158:aload_2         
	//   69  159:invokeinterface #209 <Method android.graphics.Bitmap IAppboyImageLoader.getBitmapFromUrl(Context, String, AppboyViewBounds)>
	//   70  164:invokeinterface #173 <Method void IInAppMessage.setBitmap(android.graphics.Bitmap)>
			} else
	//*  71  169:goto            183
			{
				AppboyLogger.w(TAG, "In-app message has no remote image url. Not downloading image.");
	//   72  172:getstatic       #19  <Field String TAG>
	//   73  175:ldc1            #211 <String "In-app message has no remote image url. Not downloading image.">
	//   74  177:invokestatic    #214 <Method int AppboyLogger.w(String, String)>
	//   75  180:pop             
				return true;
	//   76  181:iconst_1        
	//   77  182:ireturn         
			}
		}
		if(iinappmessage.getBitmap() != null)
	//*  78  183:aload_1         
	//*  79  184:invokeinterface #130 <Method android.graphics.Bitmap IInAppMessage.getBitmap()>
	//*  80  189:ifnull          201
		{
			iinappmessage.setImageDownloadSuccessful(true);
	//   81  192:aload_1         
	//   82  193:iconst_1        
	//   83  194:invokeinterface #139 <Method void IInAppMessage.setImageDownloadSuccessful(boolean)>
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

	boolean prepareInAppMessageWithFresco(IInAppMessage iinappmessage)
	{
		String s = iinappmessage.getLocalImageUrl();
	//    0    0:aload_1         
	//    1    1:invokeinterface #142 <Method String IInAppMessage.getLocalImageUrl()>
	//    2    6:astore_3        
		if(!StringUtils.isNullOrBlank(s) && (new File(s)).exists())
	//*   3    7:aload_3         
	//*   4    8:invokestatic    #148 <Method boolean StringUtils.isNullOrBlank(String)>
	//*   5   11:ifne            46
	//*   6   14:new             #150 <Class File>
	//*   7   17:dup             
	//*   8   18:aload_3         
	//*   9   19:invokespecial   #153 <Method void File(String)>
	//*  10   22:invokevirtual   #156 <Method boolean File.exists()>
	//*  11   25:ifeq            46
		{
			AppboyLogger.i(TAG, "In-app message has local image url for Fresco display. Not downloading image.");
	//   12   28:getstatic       #19  <Field String TAG>
	//   13   31:ldc1            #216 <String "In-app message has local image url for Fresco display. Not downloading image.">
	//   14   33:invokestatic    #135 <Method int AppboyLogger.i(String, String)>
	//   15   36:pop             
			iinappmessage.setImageDownloadSuccessful(true);
	//   16   37:aload_1         
	//   17   38:iconst_1        
	//   18   39:invokeinterface #139 <Method void IInAppMessage.setImageDownloadSuccessful(boolean)>
			return true;
	//   19   44:iconst_1        
	//   20   45:ireturn         
		}
		iinappmessage.setLocalImageUrl(((String) (null)));
	//   21   46:aload_1         
	//   22   47:aconst_null     
	//   23   48:invokeinterface #219 <Method void IInAppMessage.setLocalImageUrl(String)>
		s = iinappmessage.getRemoteImageUrl();
	//   24   53:aload_1         
	//   25   54:invokeinterface #176 <Method String IInAppMessage.getRemoteImageUrl()>
	//   26   59:astore_3        
		if(StringUtils.isNullOrBlank(s))
	//*  27   60:aload_3         
	//*  28   61:invokestatic    #148 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  29   64:ifeq            78
		{
			AppboyLogger.w(TAG, "In-app message has no remote image url. Not downloading image.");
	//   30   67:getstatic       #19  <Field String TAG>
	//   31   70:ldc1            #211 <String "In-app message has no remote image url. Not downloading image.">
	//   32   72:invokestatic    #214 <Method int AppboyLogger.w(String, String)>
	//   33   75:pop             
			return true;
	//   34   76:iconst_1        
	//   35   77:ireturn         
		}
		DataSource datasource;
		for(datasource = Fresco.getImagePipeline().prefetchToDiskCache(ImageRequest.fromUri(s), new Object()); !datasource.isFinished(););
	//   36   78:invokestatic    #225 <Method ImagePipeline Fresco.getImagePipeline()>
	//   37   81:aload_3         
	//   38   82:invokestatic    #231 <Method ImageRequest ImageRequest.fromUri(String)>
	//   39   85:new             #233 <Class Object>
	//   40   88:dup             
	//   41   89:invokespecial   #234 <Method void Object()>
	//   42   92:invokevirtual   #240 <Method DataSource ImagePipeline.prefetchToDiskCache(ImageRequest, Object)>
	//   43   95:astore          4
	//   44   97:aload           4
	//   45   99:invokeinterface #245 <Method boolean DataSource.isFinished()>
	//   46  104:ifne            110
	//*  47  107:goto            97
		boolean flag = datasource.hasFailed() ^ true;
	//   48  110:aload           4
	//   49  112:invokeinterface #248 <Method boolean DataSource.hasFailed()>
	//   50  117:iconst_1        
	//   51  118:ixor            
	//   52  119:istore_2        
		if(flag)
	//*  53  120:iload_2         
	//*  54  121:ifeq            134
			iinappmessage.setImageDownloadSuccessful(true);
	//   55  124:aload_1         
	//   56  125:iconst_1        
	//   57  126:invokeinterface #139 <Method void IInAppMessage.setImageDownloadSuccessful(boolean)>
		else
	//*  58  131:goto            250
		if(datasource.getFailureCause() == null)
	//*  59  134:aload           4
	//*  60  136:invokeinterface #252 <Method Throwable DataSource.getFailureCause()>
	//*  61  141:ifnonnull       186
		{
			iinappmessage = ((IInAppMessage) (TAG));
	//   62  144:getstatic       #19  <Field String TAG>
	//   63  147:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   64  148:new             #254 <Class StringBuilder>
	//   65  151:dup             
	//   66  152:invokespecial   #255 <Method void StringBuilder()>
	//   67  155:astore          5
			stringbuilder.append("Fresco disk prefetch failed with null cause for remote image url:");
	//   68  157:aload           5
	//   69  159:ldc2            #257 <String "Fresco disk prefetch failed with null cause for remote image url:">
	//   70  162:invokevirtual   #261 <Method StringBuilder StringBuilder.append(String)>
	//   71  165:pop             
			stringbuilder.append(s);
	//   72  166:aload           5
	//   73  168:aload_3         
	//   74  169:invokevirtual   #261 <Method StringBuilder StringBuilder.append(String)>
	//   75  172:pop             
			AppboyLogger.w(((String) (iinappmessage)), stringbuilder.toString());
	//   76  173:aload_1         
	//   77  174:aload           5
	//   78  176:invokevirtual   #264 <Method String StringBuilder.toString()>
	//   79  179:invokestatic    #214 <Method int AppboyLogger.w(String, String)>
	//   80  182:pop             
		} else
	//*  81  183:goto            250
		{
			iinappmessage = ((IInAppMessage) (TAG));
	//   82  186:getstatic       #19  <Field String TAG>
	//   83  189:astore_1        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   84  190:new             #254 <Class StringBuilder>
	//   85  193:dup             
	//   86  194:invokespecial   #255 <Method void StringBuilder()>
	//   87  197:astore          5
			stringbuilder1.append("Fresco disk prefetch failed with cause: ");
	//   88  199:aload           5
	//   89  201:ldc2            #266 <String "Fresco disk prefetch failed with cause: ">
	//   90  204:invokevirtual   #261 <Method StringBuilder StringBuilder.append(String)>
	//   91  207:pop             
			stringbuilder1.append(datasource.getFailureCause().getMessage());
	//   92  208:aload           5
	//   93  210:aload           4
	//   94  212:invokeinterface #252 <Method Throwable DataSource.getFailureCause()>
	//   95  217:invokevirtual   #271 <Method String Throwable.getMessage()>
	//   96  220:invokevirtual   #261 <Method StringBuilder StringBuilder.append(String)>
	//   97  223:pop             
			stringbuilder1.append(" with remote image url: ");
	//   98  224:aload           5
	//   99  226:ldc2            #273 <String " with remote image url: ">
	//  100  229:invokevirtual   #261 <Method StringBuilder StringBuilder.append(String)>
	//  101  232:pop             
			stringbuilder1.append(s);
	//  102  233:aload           5
	//  103  235:aload_3         
	//  104  236:invokevirtual   #261 <Method StringBuilder StringBuilder.append(String)>
	//  105  239:pop             
			AppboyLogger.w(((String) (iinappmessage)), stringbuilder1.toString());
	//  106  240:aload_1         
	//  107  241:aload           5
	//  108  243:invokevirtual   #264 <Method String StringBuilder.toString()>
	//  109  246:invokestatic    #214 <Method int AppboyLogger.w(String, String)>
	//  110  249:pop             
		}
		datasource.close();
	//  111  250:aload           4
	//  112  252:invokeinterface #276 <Method boolean DataSource.close()>
	//  113  257:pop             
		return flag;
	//  114  258:iload_2         
	//  115  259:ireturn         
	}

	boolean prepareInAppMessageWithHtml(IInAppMessage iinappmessage)
	{
		iinappmessage = ((IInAppMessage) ((InAppMessageHtmlBase)iinappmessage));
	//    0    0:aload_1         
	//    1    1:checkcast       #278 <Class InAppMessageHtmlBase>
	//    2    4:astore_1        
		String s = ((InAppMessageHtmlBase) (iinappmessage)).getLocalAssetsDirectoryUrl();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #281 <Method String InAppMessageHtmlBase.getLocalAssetsDirectoryUrl()>
	//    5    9:astore_2        
		if(!StringUtils.isNullOrBlank(s) && (new File(s)).exists())
	//*   6   10:aload_2         
	//*   7   11:invokestatic    #148 <Method boolean StringUtils.isNullOrBlank(String)>
	//*   8   14:ifne            43
	//*   9   17:new             #150 <Class File>
	//*  10   20:dup             
	//*  11   21:aload_2         
	//*  12   22:invokespecial   #153 <Method void File(String)>
	//*  13   25:invokevirtual   #156 <Method boolean File.exists()>
	//*  14   28:ifeq            43
		{
			AppboyLogger.i(TAG, "Local assets for html in-app message are already populated. Not downloading assets.");
	//   15   31:getstatic       #19  <Field String TAG>
	//   16   34:ldc2            #283 <String "Local assets for html in-app message are already populated. Not downloading assets.">
	//   17   37:invokestatic    #135 <Method int AppboyLogger.i(String, String)>
	//   18   40:pop             
			return true;
	//   19   41:iconst_1        
	//   20   42:ireturn         
		}
		if(StringUtils.isNullOrBlank(((InAppMessageHtmlBase) (iinappmessage)).getAssetsZipRemoteUrl()))
	//*  21   43:aload_1         
	//*  22   44:invokevirtual   #286 <Method String InAppMessageHtmlBase.getAssetsZipRemoteUrl()>
	//*  23   47:invokestatic    #148 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  24   50:ifeq            65
		{
			AppboyLogger.i(TAG, "Html in-app message has no remote asset zip. Continuing with in-app message preparation.");
	//   25   53:getstatic       #19  <Field String TAG>
	//   26   56:ldc2            #288 <String "Html in-app message has no remote asset zip. Continuing with in-app message preparation.">
	//   27   59:invokestatic    #135 <Method int AppboyLogger.i(String, String)>
	//   28   62:pop             
			return true;
	//   29   63:iconst_1        
	//   30   64:ireturn         
		}
		s = WebContentUtils.getLocalHtmlUrlFromRemoteUrl(WebContentUtils.getHtmlInAppMessageAssetCacheDirectory(AppboyInAppMessageManager.getInstance().getApplicationContext()), ((InAppMessageHtmlBase) (iinappmessage)).getAssetsZipRemoteUrl());
	//   31   65:invokestatic    #49  <Method AppboyInAppMessageManager AppboyInAppMessageManager.getInstance()>
	//   32   68:invokevirtual   #53  <Method Context AppboyInAppMessageManager.getApplicationContext()>
	//   33   71:invokestatic    #294 <Method File WebContentUtils.getHtmlInAppMessageAssetCacheDirectory(Context)>
	//   34   74:aload_1         
	//   35   75:invokevirtual   #286 <Method String InAppMessageHtmlBase.getAssetsZipRemoteUrl()>
	//   36   78:invokestatic    #298 <Method String WebContentUtils.getLocalHtmlUrlFromRemoteUrl(File, String)>
	//   37   81:astore_2        
		if(!StringUtils.isNullOrBlank(s))
	//*  38   82:aload_2         
	//*  39   83:invokestatic    #148 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  40   86:ifne            135
		{
			String s1 = TAG;
	//   41   89:getstatic       #19  <Field String TAG>
	//   42   92:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   43   93:new             #254 <Class StringBuilder>
	//   44   96:dup             
	//   45   97:invokespecial   #255 <Method void StringBuilder()>
	//   46  100:astore          4
			stringbuilder.append("Local url for html in-app message assets is ");
	//   47  102:aload           4
	//   48  104:ldc2            #300 <String "Local url for html in-app message assets is ">
	//   49  107:invokevirtual   #261 <Method StringBuilder StringBuilder.append(String)>
	//   50  110:pop             
			stringbuilder.append(s);
	//   51  111:aload           4
	//   52  113:aload_2         
	//   53  114:invokevirtual   #261 <Method StringBuilder StringBuilder.append(String)>
	//   54  117:pop             
			AppboyLogger.d(s1, stringbuilder.toString());
	//   55  118:aload_3         
	//   56  119:aload           4
	//   57  121:invokevirtual   #264 <Method String StringBuilder.toString()>
	//   58  124:invokestatic    #41  <Method int AppboyLogger.d(String, String)>
	//   59  127:pop             
			((InAppMessageHtmlBase) (iinappmessage)).setLocalAssetsDirectoryUrl(s);
	//   60  128:aload_1         
	//   61  129:aload_2         
	//   62  130:invokevirtual   #303 <Method void InAppMessageHtmlBase.setLocalAssetsDirectoryUrl(String)>
			return true;
	//   63  133:iconst_1        
	//   64  134:ireturn         
		} else
		{
			String s2 = TAG;
	//   65  135:getstatic       #19  <Field String TAG>
	//   66  138:astore_3        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   67  139:new             #254 <Class StringBuilder>
	//   68  142:dup             
	//   69  143:invokespecial   #255 <Method void StringBuilder()>
	//   70  146:astore          4
			stringbuilder1.append("Download of html content to local directory failed for remote url: ");
	//   71  148:aload           4
	//   72  150:ldc2            #305 <String "Download of html content to local directory failed for remote url: ">
	//   73  153:invokevirtual   #261 <Method StringBuilder StringBuilder.append(String)>
	//   74  156:pop             
			stringbuilder1.append(((InAppMessageHtmlBase) (iinappmessage)).getAssetsZipRemoteUrl());
	//   75  157:aload           4
	//   76  159:aload_1         
	//   77  160:invokevirtual   #286 <Method String InAppMessageHtmlBase.getAssetsZipRemoteUrl()>
	//   78  163:invokevirtual   #261 <Method StringBuilder StringBuilder.append(String)>
	//   79  166:pop             
			stringbuilder1.append(" . Returned local url is: ");
	//   80  167:aload           4
	//   81  169:ldc2            #307 <String " . Returned local url is: ">
	//   82  172:invokevirtual   #261 <Method StringBuilder StringBuilder.append(String)>
	//   83  175:pop             
			stringbuilder1.append(s);
	//   84  176:aload           4
	//   85  178:aload_2         
	//   86  179:invokevirtual   #261 <Method StringBuilder StringBuilder.append(String)>
	//   87  182:pop             
			AppboyLogger.w(s2, stringbuilder1.toString());
	//   88  183:aload_3         
	//   89  184:aload           4
	//   90  186:invokevirtual   #264 <Method String StringBuilder.toString()>
	//   91  189:invokestatic    #214 <Method int AppboyLogger.w(String, String)>
	//   92  192:pop             
			return false;
	//   93  193:iconst_0        
	//   94  194:ireturn         
		}
	}

	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/inappmessage/AppboyAsyncInAppMessageDisplayer);

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyAsyncInAppMessageDisplayer>
	//    1    2:invokestatic    #17  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #19  <Field String TAG>
	//*   3    8:return          
	}


/*
	static String access$000()
	{
		return TAG;
	//    0    0:getstatic       #19  <Field String TAG>
	//    1    3:areturn         
	}

*/
}
