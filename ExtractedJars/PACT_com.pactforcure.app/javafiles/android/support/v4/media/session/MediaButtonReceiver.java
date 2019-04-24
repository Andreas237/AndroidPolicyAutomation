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
		//*  15   34:aload_0         
		//*  16   35:invokespecial   #66  <Method void finish()>
		//*  17   38:return          
			catch(RemoteException remoteexception)
		//*  18   39:astore_1        
			{
				Log.e("MediaButtonReceiver", "Failed to create a media controller", ((Throwable) (remoteexception)));
		//   19   40:ldc1            #68  <String "MediaButtonReceiver">
		//   20   42:ldc1            #70  <String "Failed to create a media controller">
		//   21   44:aload_1         
		//   22   45:invokestatic    #76  <Method int Log.e(String, String, Throwable)>
		//   23   48:pop             
			}
			finish();
		//*  24   49:goto            34
		}

		public void onConnectionFailed()
		{
			finish();
		//    0    0:aload_0         
		//    1    1:invokespecial   #66  <Method void finish()>
		//    2    4:return          
		}

		public void onConnectionSuspended()
		{
			finish();
		//    0    0:aload_0         
		//    1    1:invokespecial   #66  <Method void finish()>
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
	//*  12   22:ifne            52
		{
			Log.w("MediaButtonReceiver", (new StringBuilder()).append("Cannot build a media button pending intent with the given action: ").append(l).toString());
	//   13   25:ldc1            #11  <String "MediaButtonReceiver">
	//   14   27:new             #43  <Class StringBuilder>
	//   15   30:dup             
	//   16   31:invokespecial   #44  <Method void StringBuilder()>
	//   17   34:ldc1            #46  <String "Cannot build a media button pending intent with the given action: ">
	//   18   36:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   19   39:lload_2         
	//   20   40:invokevirtual   #53  <Method StringBuilder StringBuilder.append(long)>
	//   21   43:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   22   46:invokestatic    #30  <Method int Log.w(String, String)>
	//   23   49:pop             
			return null;
	//   24   50:aconst_null     
	//   25   51:areturn         
		} else
		{
			Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
	//   26   52:new             #59  <Class Intent>
	//   27   55:dup             
	//   28   56:ldc1            #61  <String "android.intent.action.MEDIA_BUTTON">
	//   29   58:invokespecial   #64  <Method void Intent(String)>
	//   30   61:astore          5
			intent.setComponent(componentname);
	//   31   63:aload           5
	//   32   65:aload_1         
	//   33   66:invokevirtual   #68  <Method Intent Intent.setComponent(ComponentName)>
	//   34   69:pop             
			intent.putExtra("android.intent.extra.KEY_EVENT", ((android.os.Parcelable) (new KeyEvent(0, i))));
	//   35   70:aload           5
	//   36   72:ldc1            #70  <String "android.intent.extra.KEY_EVENT">
	//   37   74:new             #72  <Class KeyEvent>
	//   38   77:dup             
	//   39   78:iconst_0        
	//   40   79:iload           4
	//   41   81:invokespecial   #75  <Method void KeyEvent(int, int)>
	//   42   84:invokevirtual   #79  <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   43   87:pop             
			return PendingIntent.getBroadcast(context, i, intent, 0);
	//   44   88:aload_0         
	//   45   89:iload           4
	//   46   91:aload           5
	//   47   93:iconst_0        
	//   48   94:invokestatic    #85  <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   49   97:areturn         
		}
	}

	static ComponentName getMediaButtonReceiverComponent(Context context)
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
	//    7   12:invokevirtual   #90  <Method String Context.getPackageName()>
	//    8   15:invokevirtual   #94  <Method Intent Intent.setPackage(String)>
	//    9   18:pop             
		context = ((Context) (context.getPackageManager().queryBroadcastReceivers(intent, 0)));
	//   10   19:aload_0         
	//   11   20:invokevirtual   #98  <Method PackageManager Context.getPackageManager()>
	//   12   23:aload_1         
	//   13   24:iconst_0        
	//   14   25:invokevirtual   #104 <Method List PackageManager.queryBroadcastReceivers(Intent, int)>
	//   15   28:astore_0        
		if(((List) (context)).size() == 1)
	//*  16   29:aload_0         
	//*  17   30:invokeinterface #110 <Method int List.size()>
	//*  18   35:iconst_1        
	//*  19   36:icmpne          72
		{
			context = ((Context) ((ResolveInfo)((List) (context)).get(0)));
	//   20   39:aload_0         
	//   21   40:iconst_0        
	//   22   41:invokeinterface #114 <Method Object List.get(int)>
	//   23   46:checkcast       #116 <Class ResolveInfo>
	//   24   49:astore_0        
			return new ComponentName(((ResolveInfo) (context)).activityInfo.packageName, ((ResolveInfo) (context)).activityInfo.name);
	//   25   50:new             #118 <Class ComponentName>
	//   26   53:dup             
	//   27   54:aload_0         
	//   28   55:getfield        #122 <Field ActivityInfo ResolveInfo.activityInfo>
	//   29   58:getfield        #127 <Field String ActivityInfo.packageName>
	//   30   61:aload_0         
	//   31   62:getfield        #122 <Field ActivityInfo ResolveInfo.activityInfo>
	//   32   65:getfield        #130 <Field String ActivityInfo.name>
	//   33   68:invokespecial   #133 <Method void ComponentName(String, String)>
	//   34   71:areturn         
		}
		if(((List) (context)).size() > 1)
	//*  35   72:aload_0         
	//*  36   73:invokeinterface #110 <Method int List.size()>
	//*  37   78:iconst_1        
	//*  38   79:icmple          90
			Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
	//   39   82:ldc1            #11  <String "MediaButtonReceiver">
	//   40   84:ldc1            #135 <String "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.">
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
	//    1    1:invokevirtual   #98  <Method PackageManager Context.getPackageManager()>
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
	//   10   16:invokevirtual   #90  <Method String Context.getPackageName()>
	//   11   19:invokevirtual   #94  <Method Intent Intent.setPackage(String)>
	//   12   22:pop             
		context = ((Context) (packagemanager.queryIntentServices(intent, 0)));
	//   13   23:aload_2         
	//   14   24:aload_3         
	//   15   25:iconst_0        
	//   16   26:invokevirtual   #140 <Method List PackageManager.queryIntentServices(Intent, int)>
	//   17   29:astore_0        
		if(((List) (context)).size() == 1)
	//*  18   30:aload_0         
	//*  19   31:invokeinterface #110 <Method int List.size()>
	//*  20   36:iconst_1        
	//*  21   37:icmpne          73
		{
			context = ((Context) ((ResolveInfo)((List) (context)).get(0)));
	//   22   40:aload_0         
	//   23   41:iconst_0        
	//   24   42:invokeinterface #114 <Method Object List.get(int)>
	//   25   47:checkcast       #116 <Class ResolveInfo>
	//   26   50:astore_0        
			return new ComponentName(((ResolveInfo) (context)).serviceInfo.packageName, ((ResolveInfo) (context)).serviceInfo.name);
	//   27   51:new             #118 <Class ComponentName>
	//   28   54:dup             
	//   29   55:aload_0         
	//   30   56:getfield        #144 <Field ServiceInfo ResolveInfo.serviceInfo>
	//   31   59:getfield        #147 <Field String ServiceInfo.packageName>
	//   32   62:aload_0         
	//   33   63:getfield        #144 <Field ServiceInfo ResolveInfo.serviceInfo>
	//   34   66:getfield        #148 <Field String ServiceInfo.name>
	//   35   69:invokespecial   #133 <Method void ComponentName(String, String)>
	//   36   72:areturn         
		}
		if(((List) (context)).isEmpty())
	//*  37   73:aload_0         
	//*  38   74:invokeinterface #152 <Method boolean List.isEmpty()>
	//*  39   79:ifeq            84
			return null;
	//   40   82:aconst_null     
	//   41   83:areturn         
		else
			throw new IllegalStateException((new StringBuilder()).append("Expected 1 service that handles ").append(s).append(", found ").append(((List) (context)).size()).toString());
	//   42   84:new             #154 <Class IllegalStateException>
	//   43   87:dup             
	//   44   88:new             #43  <Class StringBuilder>
	//   45   91:dup             
	//   46   92:invokespecial   #44  <Method void StringBuilder()>
	//   47   95:ldc1            #156 <String "Expected 1 service that handles ">
	//   48   97:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   49  100:aload_1         
	//   50  101:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   51  104:ldc1            #158 <String ", found ">
	//   52  106:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   53  109:aload_0         
	//   54  110:invokeinterface #110 <Method int List.size()>
	//   55  115:invokevirtual   #161 <Method StringBuilder StringBuilder.append(int)>
	//   56  118:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   57  121:invokespecial   #162 <Method void IllegalStateException(String)>
	//   58  124:athrow          
	}

	public static KeyEvent handleIntent(MediaSessionCompat mediasessioncompat, Intent intent)
	{
		if(mediasessioncompat == null || intent == null || !"android.intent.action.MEDIA_BUTTON".equals(((Object) (intent.getAction()))) || !intent.hasExtra("android.intent.extra.KEY_EVENT"))
	//*   0    0:aload_0         
	//*   1    1:ifnull          29
	//*   2    4:aload_1         
	//*   3    5:ifnull          29
	//*   4    8:ldc1            #61  <String "android.intent.action.MEDIA_BUTTON">
	//*   5   10:aload_1         
	//*   6   11:invokevirtual   #167 <Method String Intent.getAction()>
	//*   7   14:invokevirtual   #173 <Method boolean String.equals(Object)>
	//*   8   17:ifeq            29
	//*   9   20:aload_1         
	//*  10   21:ldc1            #70  <String "android.intent.extra.KEY_EVENT">
	//*  11   23:invokevirtual   #177 <Method boolean Intent.hasExtra(String)>
	//*  12   26:ifne            31
		{
			return null;
	//   13   29:aconst_null     
	//   14   30:areturn         
		} else
		{
			intent = ((Intent) ((KeyEvent)intent.getParcelableExtra("android.intent.extra.KEY_EVENT")));
	//   15   31:aload_1         
	//   16   32:ldc1            #70  <String "android.intent.extra.KEY_EVENT">
	//   17   34:invokevirtual   #181 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   18   37:checkcast       #72  <Class KeyEvent>
	//   19   40:astore_1        
			mediasessioncompat.getController().dispatchMediaButtonEvent(((KeyEvent) (intent)));
	//   20   41:aload_0         
	//   21   42:invokevirtual   #187 <Method MediaControllerCompat MediaSessionCompat.getController()>
	//   22   45:aload_1         
	//   23   46:invokevirtual   #193 <Method boolean MediaControllerCompat.dispatchMediaButtonEvent(KeyEvent)>
	//   24   49:pop             
			return ((KeyEvent) (intent));
	//   25   50:aload_1         
	//   26   51:areturn         
		}
	}

	private static void startForegroundService(Context context, Intent intent)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #201 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          15
		{
			context.startForegroundService(intent);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #204 <Method ComponentName Context.startForegroundService(Intent)>
	//    6   13:pop             
			return;
	//    7   14:return          
		} else
		{
			context.startService(intent);
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #207 <Method ComponentName Context.startService(Intent)>
	//   11   20:pop             
			return;
	//   12   21:return          
		}
	}

	public void onReceive(Context context, Intent intent)
	{
		if(intent == null || !"android.intent.action.MEDIA_BUTTON".equals(((Object) (intent.getAction()))) || !intent.hasExtra("android.intent.extra.KEY_EVENT"))
	//*   0    0:aload_2         
	//*   1    1:ifnull          25
	//*   2    4:ldc1            #61  <String "android.intent.action.MEDIA_BUTTON">
	//*   3    6:aload_2         
	//*   4    7:invokevirtual   #167 <Method String Intent.getAction()>
	//*   5   10:invokevirtual   #173 <Method boolean String.equals(Object)>
	//*   6   13:ifeq            25
	//*   7   16:aload_2         
	//*   8   17:ldc1            #70  <String "android.intent.extra.KEY_EVENT">
	//*   9   19:invokevirtual   #177 <Method boolean Intent.hasExtra(String)>
	//*  10   22:ifne            51
		{
			Log.d("MediaButtonReceiver", (new StringBuilder()).append("Ignore unsupported intent: ").append(((Object) (intent))).toString());
	//   11   25:ldc1            #11  <String "MediaButtonReceiver">
	//   12   27:new             #43  <Class StringBuilder>
	//   13   30:dup             
	//   14   31:invokespecial   #44  <Method void StringBuilder()>
	//   15   34:ldc1            #210 <String "Ignore unsupported intent: ">
	//   16   36:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   17   39:aload_2         
	//   18   40:invokevirtual   #213 <Method StringBuilder StringBuilder.append(Object)>
	//   19   43:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   20   46:invokestatic    #216 <Method int Log.d(String, String)>
	//   21   49:pop             
			return;
	//   22   50:return          
		}
		ComponentName componentname = getServiceComponentByAction(context, "android.intent.action.MEDIA_BUTTON");
	//   23   51:aload_1         
	//   24   52:ldc1            #61  <String "android.intent.action.MEDIA_BUTTON">
	//   25   54:invokestatic    #218 <Method ComponentName getServiceComponentByAction(Context, String)>
	//   26   57:astore_3        
		if(componentname != null)
	//*  27   58:aload_3         
	//*  28   59:ifnull          74
		{
			intent.setComponent(componentname);
	//   29   62:aload_2         
	//   30   63:aload_3         
	//   31   64:invokevirtual   #68  <Method Intent Intent.setComponent(ComponentName)>
	//   32   67:pop             
			startForegroundService(context, intent);
	//   33   68:aload_1         
	//   34   69:aload_2         
	//   35   70:invokestatic    #220 <Method void startForegroundService(Context, Intent)>
			return;
	//   36   73:return          
		}
		componentname = getServiceComponentByAction(context, "android.media.browse.MediaBrowserService");
	//   37   74:aload_1         
	//   38   75:ldc1            #222 <String "android.media.browse.MediaBrowserService">
	//   39   77:invokestatic    #218 <Method ComponentName getServiceComponentByAction(Context, String)>
	//   40   80:astore_3        
		if(componentname != null)
	//*  41   81:aload_3         
	//*  42   82:ifnull          130
		{
			android.content.BroadcastReceiver.PendingResult pendingresult = goAsync();
	//   43   85:aload_0         
	//   44   86:invokevirtual   #226 <Method android.content.BroadcastReceiver$PendingResult goAsync()>
	//   45   89:astore          4
			context = context.getApplicationContext();
	//   46   91:aload_1         
	//   47   92:invokevirtual   #230 <Method Context Context.getApplicationContext()>
	//   48   95:astore_1        
			intent = ((Intent) (new MediaButtonConnectionCallback(context, intent, pendingresult)));
	//   49   96:new             #6   <Class MediaButtonReceiver$MediaButtonConnectionCallback>
	//   50   99:dup             
	//   51  100:aload_1         
	//   52  101:aload_2         
	//   53  102:aload           4
	//   54  104:invokespecial   #233 <Method void MediaButtonReceiver$MediaButtonConnectionCallback(Context, Intent, android.content.BroadcastReceiver$PendingResult)>
	//   55  107:astore_2        
			context = ((Context) (new MediaBrowserCompat(context, componentname, ((android.support.v4.media.MediaBrowserCompat.ConnectionCallback) (intent)), ((android.os.Bundle) (null)))));
	//   56  108:new             #235 <Class MediaBrowserCompat>
	//   57  111:dup             
	//   58  112:aload_1         
	//   59  113:aload_3         
	//   60  114:aload_2         
	//   61  115:aconst_null     
	//   62  116:invokespecial   #238 <Method void MediaBrowserCompat(Context, ComponentName, android.support.v4.media.MediaBrowserCompat$ConnectionCallback, android.os.Bundle)>
	//   63  119:astore_1        
			((MediaButtonConnectionCallback) (intent)).setMediaBrowser(((MediaBrowserCompat) (context)));
	//   64  120:aload_2         
	//   65  121:aload_1         
	//   66  122:invokevirtual   #242 <Method void MediaButtonReceiver$MediaButtonConnectionCallback.setMediaBrowser(MediaBrowserCompat)>
			((MediaBrowserCompat) (context)).connect();
	//   67  125:aload_1         
	//   68  126:invokevirtual   #245 <Method void MediaBrowserCompat.connect()>
			return;
	//   69  129:return          
		} else
		{
			throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
	//   70  130:new             #154 <Class IllegalStateException>
	//   71  133:dup             
	//   72  134:ldc1            #247 <String "Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.">
	//   73  136:invokespecial   #162 <Method void IllegalStateException(String)>
	//   74  139:athrow          
		}
	}

	private static final String TAG = "MediaButtonReceiver";
}
