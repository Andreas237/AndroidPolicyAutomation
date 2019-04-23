// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.*;
import android.content.pm.*;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.util.Log;
import android.view.KeyEvent;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//			PlaybackStateCompat, MediaSessionCompat, MediaControllerCompat

public class MediaButtonReceiver extends BroadcastReceiver
{
	private static class MediaButtonConnectionCallback extends android.support.v4.media.MediaBrowserCompat.ConnectionCallback
	{

		private void finish()
		{
			mMediaBrowser.disconnect();
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field MediaBrowserCompat mMediaBrowser>
		//    2    4:invokevirtual   #35  <Method void MediaBrowserCompat.disconnect()>
			mPendingResult.finish();
		//    3    7:aload_0         
		//    4    8:getfield        #26  <Field android.content.BroadcastReceiver$PendingResult mPendingResult>
		//    5   11:invokevirtual   #39  <Method void android.content.BroadcastReceiver$PendingResult.finish()>
		//    6   14:return          
		}

		public void onConnected()
		{
			try
			{
				(new MediaControllerCompat(mContext, mMediaBrowser.getSessionToken())).dispatchMediaButtonEvent((KeyEvent)mIntent.getParcelableExtra("android.intent.extra.KEY_EVENT"));
		//    0    0:new             #44  <Class MediaControllerCompat>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #22  <Field Context mContext>
		//    4    8:aload_0         
		//    5    9:getfield        #30  <Field MediaBrowserCompat mMediaBrowser>
		//    6   12:invokevirtual   #48  <Method MediaSessionCompat$Token MediaBrowserCompat.getSessionToken()>
		//    7   15:invokespecial   #51  <Method void MediaControllerCompat(Context, MediaSessionCompat$Token)>
		//    8   18:aload_0         
		//    9   19:getfield        #24  <Field Intent mIntent>
		//   10   22:ldc1            #53  <String "android.intent.extra.KEY_EVENT">
		//   11   24:invokevirtual   #59  <Method android.os.Parcelable Intent.getParcelableExtra(String)>
		//   12   27:checkcast       #61  <Class KeyEvent>
		//   13   30:invokevirtual   #65  <Method boolean MediaControllerCompat.dispatchMediaButtonEvent(KeyEvent)>
		//   14   33:pop             
			}
		//*  15   34:goto            47
			catch(RemoteException remoteexception)
		//*  16   37:astore_1        
			{
				Log.e("MediaButtonReceiver", "Failed to create a media controller", ((Throwable) (remoteexception)));
		//   17   38:ldc1            #67  <String "MediaButtonReceiver">
		//   18   40:ldc1            #69  <String "Failed to create a media controller">
		//   19   42:aload_1         
		//   20   43:invokestatic    #75  <Method int Log.e(String, String, Throwable)>
		//   21   46:pop             
			}
			finish();
		//   22   47:aload_0         
		//   23   48:invokespecial   #76  <Method void finish()>
		//   24   51:return          
		}

		public void onConnectionFailed()
		{
			finish();
		//    0    0:aload_0         
		//    1    1:invokespecial   #76  <Method void finish()>
		//    2    4:return          
		}

		public void onConnectionSuspended()
		{
			finish();
		//    0    0:aload_0         
		//    1    1:invokespecial   #76  <Method void finish()>
		//    2    4:return          
		}

		void setMediaBrowser(MediaBrowserCompat mediabrowsercompat)
		{
			mMediaBrowser = mediabrowsercompat;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #30  <Field MediaBrowserCompat mMediaBrowser>
		//    3    5:return          
		}

		private final Context mContext;
		private final Intent mIntent;
		private MediaBrowserCompat mMediaBrowser;
		private final android.content.BroadcastReceiver.PendingResult mPendingResult;

		MediaButtonConnectionCallback(Context context, Intent intent, android.content.BroadcastReceiver.PendingResult pendingresult)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void android.support.v4.media.MediaBrowserCompat$ConnectionCallback()>
			mContext = context;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field Context mContext>
			mIntent = intent;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field Intent mIntent>
			mPendingResult = pendingresult;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #26  <Field android.content.BroadcastReceiver$PendingResult mPendingResult>
		//   11   19:return          
		}
	}


	public MediaButtonReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	public static PendingIntent buildMediaButtonPendingIntent(Context context, long l)
	{
		ComponentName componentname = getMediaButtonReceiverComponent(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #22  <Method ComponentName getMediaButtonReceiverComponent(Context)>
	//    2    4:astore_3        
		if(componentname == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       19
		{
			Log.w("MediaButtonReceiver", "A unique media button receiver could not be found in the given context, so couldn't build a pending intent.");
	//    5    9:ldc1            #11  <String "MediaButtonReceiver">
	//    6   11:ldc1            #24  <String "A unique media button receiver could not be found in the given context, so couldn't build a pending intent.">
	//    7   13:invokestatic    #30  <Method int Log.w(String, String)>
	//    8   16:pop             
			return null;
	//    9   17:aconst_null     
	//   10   18:areturn         
		} else
		{
			return buildMediaButtonPendingIntent(context, componentname, l);
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:lload_1         
	//   14   22:invokestatic    #33  <Method PendingIntent buildMediaButtonPendingIntent(Context, ComponentName, long)>
	//   15   25:areturn         
		}
	}

	public static PendingIntent buildMediaButtonPendingIntent(Context context, ComponentName componentname, long l)
	{
		if(componentname == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			Log.w("MediaButtonReceiver", "The component name of media button receiver should be provided.");
	//    2    4:ldc1            #11  <String "MediaButtonReceiver">
	//    3    6:ldc1            #35  <String "The component name of media button receiver should be provided.">
	//    4    8:invokestatic    #30  <Method int Log.w(String, String)>
	//    5   11:pop             
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		}
		int i = PlaybackStateCompat.toKeyCode(l);
	//    8   14:lload_2         
	//    9   15:invokestatic    #41  <Method int PlaybackStateCompat.toKeyCode(long)>
	//   10   18:istore          4
		if(i == 0)
	//*  11   20:iload           4
	//*  12   22:ifne            58
		{
			context = ((Context) (new StringBuilder()));
	//   13   25:new             #43  <Class StringBuilder>
	//   14   28:dup             
	//   15   29:invokespecial   #44  <Method void StringBuilder()>
	//   16   32:astore_0        
			((StringBuilder) (context)).append("Cannot build a media button pending intent with the given action: ");
	//   17   33:aload_0         
	//   18   34:ldc1            #46  <String "Cannot build a media button pending intent with the given action: ">
	//   19   36:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
			((StringBuilder) (context)).append(l);
	//   21   40:aload_0         
	//   22   41:lload_2         
	//   23   42:invokevirtual   #53  <Method StringBuilder StringBuilder.append(long)>
	//   24   45:pop             
			Log.w("MediaButtonReceiver", ((StringBuilder) (context)).toString());
	//   25   46:ldc1            #11  <String "MediaButtonReceiver">
	//   26   48:aload_0         
	//   27   49:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   28   52:invokestatic    #30  <Method int Log.w(String, String)>
	//   29   55:pop             
			return null;
	//   30   56:aconst_null     
	//   31   57:areturn         
		} else
		{
			Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
	//   32   58:new             #59  <Class Intent>
	//   33   61:dup             
	//   34   62:ldc1            #61  <String "android.intent.action.MEDIA_BUTTON">
	//   35   64:invokespecial   #64  <Method void Intent(String)>
	//   36   67:astore          5
			intent.setComponent(componentname);
	//   37   69:aload           5
	//   38   71:aload_1         
	//   39   72:invokevirtual   #68  <Method Intent Intent.setComponent(ComponentName)>
	//   40   75:pop             
			intent.putExtra("android.intent.extra.KEY_EVENT", ((android.os.Parcelable) (new KeyEvent(0, i))));
	//   41   76:aload           5
	//   42   78:ldc1            #70  <String "android.intent.extra.KEY_EVENT">
	//   43   80:new             #72  <Class KeyEvent>
	//   44   83:dup             
	//   45   84:iconst_0        
	//   46   85:iload           4
	//   47   87:invokespecial   #75  <Method void KeyEvent(int, int)>
	//   48   90:invokevirtual   #79  <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   49   93:pop             
			return PendingIntent.getBroadcast(context, i, intent, 0);
	//   50   94:aload_0         
	//   51   95:iload           4
	//   52   97:aload           5
	//   53   99:iconst_0        
	//   54  100:invokestatic    #85  <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   55  103:areturn         
		}
	}

	public static ComponentName getMediaButtonReceiverComponent(Context context)
	{
		Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
	//    0    0:new             #59  <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #61  <String "android.intent.action.MEDIA_BUTTON">
	//    3    6:invokespecial   #64  <Method void Intent(String)>
	//    4    9:astore_1        
		intent.setPackage(context.getPackageName());
	//    5   10:aload_1         
	//    6   11:aload_0         
	//    7   12:invokevirtual   #94  <Method String Context.getPackageName()>
	//    8   15:invokevirtual   #98  <Method Intent Intent.setPackage(String)>
	//    9   18:pop             
		context = ((Context) (context.getPackageManager().queryBroadcastReceivers(intent, 0)));
	//   10   19:aload_0         
	//   11   20:invokevirtual   #102 <Method PackageManager Context.getPackageManager()>
	//   12   23:aload_1         
	//   13   24:iconst_0        
	//   14   25:invokevirtual   #108 <Method List PackageManager.queryBroadcastReceivers(Intent, int)>
	//   15   28:astore_0        
		if(((List) (context)).size() == 1)
	//*  16   29:aload_0         
	//*  17   30:invokeinterface #114 <Method int List.size()>
	//*  18   35:iconst_1        
	//*  19   36:icmpne          72
		{
			context = ((Context) ((ResolveInfo)((List) (context)).get(0)));
	//   20   39:aload_0         
	//   21   40:iconst_0        
	//   22   41:invokeinterface #118 <Method Object List.get(int)>
	//   23   46:checkcast       #120 <Class ResolveInfo>
	//   24   49:astore_0        
			return new ComponentName(((ResolveInfo) (context)).activityInfo.packageName, ((ResolveInfo) (context)).activityInfo.name);
	//   25   50:new             #122 <Class ComponentName>
	//   26   53:dup             
	//   27   54:aload_0         
	//   28   55:getfield        #126 <Field ActivityInfo ResolveInfo.activityInfo>
	//   29   58:getfield        #131 <Field String ActivityInfo.packageName>
	//   30   61:aload_0         
	//   31   62:getfield        #126 <Field ActivityInfo ResolveInfo.activityInfo>
	//   32   65:getfield        #134 <Field String ActivityInfo.name>
	//   33   68:invokespecial   #137 <Method void ComponentName(String, String)>
	//   34   71:areturn         
		}
		if(((List) (context)).size() > 1)
	//*  35   72:aload_0         
	//*  36   73:invokeinterface #114 <Method int List.size()>
	//*  37   78:iconst_1        
	//*  38   79:icmple          90
			Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
	//   39   82:ldc1            #11  <String "MediaButtonReceiver">
	//   40   84:ldc1            #139 <String "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.">
	//   41   86:invokestatic    #30  <Method int Log.w(String, String)>
	//   42   89:pop             
		return null;
	//   43   90:aconst_null     
	//   44   91:areturn         
	}

	private static ComponentName getServiceComponentByAction(Context context, String s)
	{
		PackageManager packagemanager = context.getPackageManager();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #102 <Method PackageManager Context.getPackageManager()>
	//    2    4:astore_2        
		Intent intent = new Intent(s);
	//    3    5:new             #59  <Class Intent>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #64  <Method void Intent(String)>
	//    7   13:astore_3        
		intent.setPackage(context.getPackageName());
	//    8   14:aload_3         
	//    9   15:aload_0         
	//   10   16:invokevirtual   #94  <Method String Context.getPackageName()>
	//   11   19:invokevirtual   #98  <Method Intent Intent.setPackage(String)>
	//   12   22:pop             
		context = ((Context) (packagemanager.queryIntentServices(intent, 0)));
	//   13   23:aload_2         
	//   14   24:aload_3         
	//   15   25:iconst_0        
	//   16   26:invokevirtual   #145 <Method List PackageManager.queryIntentServices(Intent, int)>
	//   17   29:astore_0        
		if(((List) (context)).size() == 1)
	//*  18   30:aload_0         
	//*  19   31:invokeinterface #114 <Method int List.size()>
	//*  20   36:iconst_1        
	//*  21   37:icmpne          73
		{
			context = ((Context) ((ResolveInfo)((List) (context)).get(0)));
	//   22   40:aload_0         
	//   23   41:iconst_0        
	//   24   42:invokeinterface #118 <Method Object List.get(int)>
	//   25   47:checkcast       #120 <Class ResolveInfo>
	//   26   50:astore_0        
			return new ComponentName(((ResolveInfo) (context)).serviceInfo.packageName, ((ResolveInfo) (context)).serviceInfo.name);
	//   27   51:new             #122 <Class ComponentName>
	//   28   54:dup             
	//   29   55:aload_0         
	//   30   56:getfield        #149 <Field ServiceInfo ResolveInfo.serviceInfo>
	//   31   59:getfield        #152 <Field String ServiceInfo.packageName>
	//   32   62:aload_0         
	//   33   63:getfield        #149 <Field ServiceInfo ResolveInfo.serviceInfo>
	//   34   66:getfield        #153 <Field String ServiceInfo.name>
	//   35   69:invokespecial   #137 <Method void ComponentName(String, String)>
	//   36   72:areturn         
		}
		if(((List) (context)).isEmpty())
	//*  37   73:aload_0         
	//*  38   74:invokeinterface #157 <Method boolean List.isEmpty()>
	//*  39   79:ifeq            84
		{
			return null;
	//   40   82:aconst_null     
	//   41   83:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   42   84:new             #43  <Class StringBuilder>
	//   43   87:dup             
	//   44   88:invokespecial   #44  <Method void StringBuilder()>
	//   45   91:astore_2        
			stringbuilder.append("Expected 1 service that handles ");
	//   46   92:aload_2         
	//   47   93:ldc1            #159 <String "Expected 1 service that handles ">
	//   48   95:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   49   98:pop             
			stringbuilder.append(s);
	//   50   99:aload_2         
	//   51  100:aload_1         
	//   52  101:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   53  104:pop             
			stringbuilder.append(", found ");
	//   54  105:aload_2         
	//   55  106:ldc1            #161 <String ", found ">
	//   56  108:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   57  111:pop             
			stringbuilder.append(((List) (context)).size());
	//   58  112:aload_2         
	//   59  113:aload_0         
	//   60  114:invokeinterface #114 <Method int List.size()>
	//   61  119:invokevirtual   #164 <Method StringBuilder StringBuilder.append(int)>
	//   62  122:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   63  123:new             #166 <Class IllegalStateException>
	//   64  126:dup             
	//   65  127:aload_2         
	//   66  128:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   67  131:invokespecial   #167 <Method void IllegalStateException(String)>
	//   68  134:athrow          
		}
	}

	public static KeyEvent handleIntent(MediaSessionCompat mediasessioncompat, Intent intent)
	{
		if(mediasessioncompat != null && intent != null && "android.intent.action.MEDIA_BUTTON".equals(((Object) (intent.getAction()))) && intent.hasExtra("android.intent.extra.KEY_EVENT"))
	//*   0    0:aload_0         
	//*   1    1:ifnull          53
	//*   2    4:aload_1         
	//*   3    5:ifnull          53
	//*   4    8:ldc1            #61  <String "android.intent.action.MEDIA_BUTTON">
	//*   5   10:aload_1         
	//*   6   11:invokevirtual   #172 <Method String Intent.getAction()>
	//*   7   14:invokevirtual   #178 <Method boolean String.equals(Object)>
	//*   8   17:ifeq            53
	//*   9   20:aload_1         
	//*  10   21:ldc1            #70  <String "android.intent.extra.KEY_EVENT">
	//*  11   23:invokevirtual   #182 <Method boolean Intent.hasExtra(String)>
	//*  12   26:ifne            32
	//*  13   29:goto            53
		{
			intent = ((Intent) ((KeyEvent)intent.getParcelableExtra("android.intent.extra.KEY_EVENT")));
	//   14   32:aload_1         
	//   15   33:ldc1            #70  <String "android.intent.extra.KEY_EVENT">
	//   16   35:invokevirtual   #186 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   17   38:checkcast       #72  <Class KeyEvent>
	//   18   41:astore_1        
			mediasessioncompat.getController().dispatchMediaButtonEvent(((KeyEvent) (intent)));
	//   19   42:aload_0         
	//   20   43:invokevirtual   #192 <Method MediaControllerCompat MediaSessionCompat.getController()>
	//   21   46:aload_1         
	//   22   47:invokevirtual   #198 <Method boolean MediaControllerCompat.dispatchMediaButtonEvent(KeyEvent)>
	//   23   50:pop             
			return ((KeyEvent) (intent));
	//   24   51:aload_1         
	//   25   52:areturn         
		} else
		{
			return null;
	//   26   53:aconst_null     
	//   27   54:areturn         
		}
	}

	private static void startForegroundService(Context context, Intent intent)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #206 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          15
		{
			context.startForegroundService(intent);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #209 <Method ComponentName Context.startForegroundService(Intent)>
	//    6   13:pop             
			return;
	//    7   14:return          
		} else
		{
			context.startService(intent);
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #212 <Method ComponentName Context.startService(Intent)>
	//   11   20:pop             
			return;
	//   12   21:return          
		}
	}

	public void onReceive(Context context, Intent intent)
	{
		if(intent != null && "android.intent.action.MEDIA_BUTTON".equals(((Object) (intent.getAction()))) && intent.hasExtra("android.intent.extra.KEY_EVENT"))
	//*   0    0:aload_2         
	//*   1    1:ifnull          117
	//*   2    4:ldc1            #61  <String "android.intent.action.MEDIA_BUTTON">
	//*   3    6:aload_2         
	//*   4    7:invokevirtual   #172 <Method String Intent.getAction()>
	//*   5   10:invokevirtual   #178 <Method boolean String.equals(Object)>
	//*   6   13:ifeq            117
	//*   7   16:aload_2         
	//*   8   17:ldc1            #70  <String "android.intent.extra.KEY_EVENT">
	//*   9   19:invokevirtual   #182 <Method boolean Intent.hasExtra(String)>
	//*  10   22:ifne            28
	//*  11   25:goto            117
		{
			ComponentName componentname = getServiceComponentByAction(context, "android.intent.action.MEDIA_BUTTON");
	//   12   28:aload_1         
	//   13   29:ldc1            #61  <String "android.intent.action.MEDIA_BUTTON">
	//   14   31:invokestatic    #215 <Method ComponentName getServiceComponentByAction(Context, String)>
	//   15   34:astore_3        
			if(componentname != null)
	//*  16   35:aload_3         
	//*  17   36:ifnull          51
			{
				intent.setComponent(componentname);
	//   18   39:aload_2         
	//   19   40:aload_3         
	//   20   41:invokevirtual   #68  <Method Intent Intent.setComponent(ComponentName)>
	//   21   44:pop             
				startForegroundService(context, intent);
	//   22   45:aload_1         
	//   23   46:aload_2         
	//   24   47:invokestatic    #217 <Method void startForegroundService(Context, Intent)>
				return;
	//   25   50:return          
			}
			componentname = getServiceComponentByAction(context, "android.media.browse.MediaBrowserService");
	//   26   51:aload_1         
	//   27   52:ldc1            #219 <String "android.media.browse.MediaBrowserService">
	//   28   54:invokestatic    #215 <Method ComponentName getServiceComponentByAction(Context, String)>
	//   29   57:astore_3        
			if(componentname != null)
	//*  30   58:aload_3         
	//*  31   59:ifnull          107
			{
				android.content.BroadcastReceiver.PendingResult pendingresult = goAsync();
	//   32   62:aload_0         
	//   33   63:invokevirtual   #223 <Method android.content.BroadcastReceiver$PendingResult goAsync()>
	//   34   66:astore          4
				context = context.getApplicationContext();
	//   35   68:aload_1         
	//   36   69:invokevirtual   #227 <Method Context Context.getApplicationContext()>
	//   37   72:astore_1        
				intent = ((Intent) (new MediaButtonConnectionCallback(context, intent, pendingresult)));
	//   38   73:new             #6   <Class MediaButtonReceiver$MediaButtonConnectionCallback>
	//   39   76:dup             
	//   40   77:aload_1         
	//   41   78:aload_2         
	//   42   79:aload           4
	//   43   81:invokespecial   #230 <Method void MediaButtonReceiver$MediaButtonConnectionCallback(Context, Intent, android.content.BroadcastReceiver$PendingResult)>
	//   44   84:astore_2        
				context = ((Context) (new MediaBrowserCompat(context, componentname, ((android.support.v4.media.MediaBrowserCompat.ConnectionCallback) (intent)), ((android.os.Bundle) (null)))));
	//   45   85:new             #232 <Class MediaBrowserCompat>
	//   46   88:dup             
	//   47   89:aload_1         
	//   48   90:aload_3         
	//   49   91:aload_2         
	//   50   92:aconst_null     
	//   51   93:invokespecial   #235 <Method void MediaBrowserCompat(Context, ComponentName, android.support.v4.media.MediaBrowserCompat$ConnectionCallback, android.os.Bundle)>
	//   52   96:astore_1        
				((MediaButtonConnectionCallback) (intent)).setMediaBrowser(((MediaBrowserCompat) (context)));
	//   53   97:aload_2         
	//   54   98:aload_1         
	//   55   99:invokevirtual   #239 <Method void MediaButtonReceiver$MediaButtonConnectionCallback.setMediaBrowser(MediaBrowserCompat)>
				((MediaBrowserCompat) (context)).connect();
	//   56  102:aload_1         
	//   57  103:invokevirtual   #242 <Method void MediaBrowserCompat.connect()>
				return;
	//   58  106:return          
			} else
			{
				throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
	//   59  107:new             #166 <Class IllegalStateException>
	//   60  110:dup             
	//   61  111:ldc1            #244 <String "Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.">
	//   62  113:invokespecial   #167 <Method void IllegalStateException(String)>
	//   63  116:athrow          
			}
		} else
		{
			context = ((Context) (new StringBuilder()));
	//   64  117:new             #43  <Class StringBuilder>
	//   65  120:dup             
	//   66  121:invokespecial   #44  <Method void StringBuilder()>
	//   67  124:astore_1        
			((StringBuilder) (context)).append("Ignore unsupported intent: ");
	//   68  125:aload_1         
	//   69  126:ldc1            #246 <String "Ignore unsupported intent: ">
	//   70  128:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   71  131:pop             
			((StringBuilder) (context)).append(((Object) (intent)));
	//   72  132:aload_1         
	//   73  133:aload_2         
	//   74  134:invokevirtual   #249 <Method StringBuilder StringBuilder.append(Object)>
	//   75  137:pop             
			Log.d("MediaButtonReceiver", ((StringBuilder) (context)).toString());
	//   76  138:ldc1            #11  <String "MediaButtonReceiver">
	//   77  140:aload_1         
	//   78  141:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   79  144:invokestatic    #252 <Method int Log.d(String, String)>
	//   80  147:pop             
			return;
	//   81  148:return          
		}
	}

	private static final String TAG = "MediaButtonReceiver";
}
