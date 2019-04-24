// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.*;
import android.content.pm.*;
import android.util.Log;
import android.view.KeyEvent;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//			PlaybackStateCompat, MediaSessionCompat, MediaControllerCompat

public class MediaButtonReceiver extends BroadcastReceiver
{

	public MediaButtonReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	public static PendingIntent buildMediaButtonPendingIntent(Context context, long l)
	{
		ComponentName componentname = getMediaButtonReceiverComponent(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #19  <Method ComponentName getMediaButtonReceiverComponent(Context)>
	//    2    4:astore_3        
		if(componentname == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       19
		{
			Log.w("MediaButtonReceiver", "A unique media button receiver could not be found in the given context, so couldn't build a pending intent.");
	//    5    9:ldc1            #8   <String "MediaButtonReceiver">
	//    6   11:ldc1            #21  <String "A unique media button receiver could not be found in the given context, so couldn't build a pending intent.">
	//    7   13:invokestatic    #27  <Method int Log.w(String, String)>
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
	//   14   22:invokestatic    #30  <Method PendingIntent buildMediaButtonPendingIntent(Context, ComponentName, long)>
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
	//    2    4:ldc1            #8   <String "MediaButtonReceiver">
	//    3    6:ldc1            #32  <String "The component name of media button receiver should be provided.">
	//    4    8:invokestatic    #27  <Method int Log.w(String, String)>
	//    5   11:pop             
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		}
		int i = PlaybackStateCompat.toKeyCode(l);
	//    8   14:lload_2         
	//    9   15:invokestatic    #38  <Method int PlaybackStateCompat.toKeyCode(long)>
	//   10   18:istore          4
		if(i == 0)
	//*  11   20:iload           4
	//*  12   22:ifne            52
		{
			Log.w("MediaButtonReceiver", (new StringBuilder()).append("Cannot build a media button pending intent with the given action: ").append(l).toString());
	//   13   25:ldc1            #8   <String "MediaButtonReceiver">
	//   14   27:new             #40  <Class StringBuilder>
	//   15   30:dup             
	//   16   31:invokespecial   #41  <Method void StringBuilder()>
	//   17   34:ldc1            #43  <String "Cannot build a media button pending intent with the given action: ">
	//   18   36:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   19   39:lload_2         
	//   20   40:invokevirtual   #50  <Method StringBuilder StringBuilder.append(long)>
	//   21   43:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   22   46:invokestatic    #27  <Method int Log.w(String, String)>
	//   23   49:pop             
			return null;
	//   24   50:aconst_null     
	//   25   51:areturn         
		} else
		{
			Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
	//   26   52:new             #56  <Class Intent>
	//   27   55:dup             
	//   28   56:ldc1            #58  <String "android.intent.action.MEDIA_BUTTON">
	//   29   58:invokespecial   #61  <Method void Intent(String)>
	//   30   61:astore          5
			intent.setComponent(componentname);
	//   31   63:aload           5
	//   32   65:aload_1         
	//   33   66:invokevirtual   #65  <Method Intent Intent.setComponent(ComponentName)>
	//   34   69:pop             
			intent.putExtra("android.intent.extra.KEY_EVENT", ((android.os.Parcelable) (new KeyEvent(0, i))));
	//   35   70:aload           5
	//   36   72:ldc1            #67  <String "android.intent.extra.KEY_EVENT">
	//   37   74:new             #69  <Class KeyEvent>
	//   38   77:dup             
	//   39   78:iconst_0        
	//   40   79:iload           4
	//   41   81:invokespecial   #72  <Method void KeyEvent(int, int)>
	//   42   84:invokevirtual   #76  <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   43   87:pop             
			return PendingIntent.getBroadcast(context, i, intent, 0);
	//   44   88:aload_0         
	//   45   89:iload           4
	//   46   91:aload           5
	//   47   93:iconst_0        
	//   48   94:invokestatic    #82  <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   49   97:areturn         
		}
	}

	static ComponentName getMediaButtonReceiverComponent(Context context)
	{
		Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
	//    0    0:new             #56  <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #58  <String "android.intent.action.MEDIA_BUTTON">
	//    3    6:invokespecial   #61  <Method void Intent(String)>
	//    4    9:astore_1        
		intent.setPackage(context.getPackageName());
	//    5   10:aload_1         
	//    6   11:aload_0         
	//    7   12:invokevirtual   #87  <Method String Context.getPackageName()>
	//    8   15:invokevirtual   #91  <Method Intent Intent.setPackage(String)>
	//    9   18:pop             
		context = ((Context) (context.getPackageManager().queryBroadcastReceivers(intent, 0)));
	//   10   19:aload_0         
	//   11   20:invokevirtual   #95  <Method PackageManager Context.getPackageManager()>
	//   12   23:aload_1         
	//   13   24:iconst_0        
	//   14   25:invokevirtual   #101 <Method List PackageManager.queryBroadcastReceivers(Intent, int)>
	//   15   28:astore_0        
		if(((List) (context)).size() == 1)
	//*  16   29:aload_0         
	//*  17   30:invokeinterface #107 <Method int List.size()>
	//*  18   35:iconst_1        
	//*  19   36:icmpne          72
		{
			context = ((Context) ((ResolveInfo)((List) (context)).get(0)));
	//   20   39:aload_0         
	//   21   40:iconst_0        
	//   22   41:invokeinterface #111 <Method Object List.get(int)>
	//   23   46:checkcast       #113 <Class ResolveInfo>
	//   24   49:astore_0        
			return new ComponentName(((ResolveInfo) (context)).activityInfo.packageName, ((ResolveInfo) (context)).activityInfo.name);
	//   25   50:new             #115 <Class ComponentName>
	//   26   53:dup             
	//   27   54:aload_0         
	//   28   55:getfield        #119 <Field ActivityInfo ResolveInfo.activityInfo>
	//   29   58:getfield        #124 <Field String ActivityInfo.packageName>
	//   30   61:aload_0         
	//   31   62:getfield        #119 <Field ActivityInfo ResolveInfo.activityInfo>
	//   32   65:getfield        #127 <Field String ActivityInfo.name>
	//   33   68:invokespecial   #130 <Method void ComponentName(String, String)>
	//   34   71:areturn         
		}
		if(((List) (context)).size() > 1)
	//*  35   72:aload_0         
	//*  36   73:invokeinterface #107 <Method int List.size()>
	//*  37   78:iconst_1        
	//*  38   79:icmple          90
			Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
	//   39   82:ldc1            #8   <String "MediaButtonReceiver">
	//   40   84:ldc1            #132 <String "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.">
	//   41   86:invokestatic    #27  <Method int Log.w(String, String)>
	//   42   89:pop             
		return null;
	//   43   90:aconst_null     
	//   44   91:areturn         
	}

	public static KeyEvent handleIntent(MediaSessionCompat mediasessioncompat, Intent intent)
	{
		if(mediasessioncompat == null || intent == null || !"android.intent.action.MEDIA_BUTTON".equals(((Object) (intent.getAction()))) || !intent.hasExtra("android.intent.extra.KEY_EVENT"))
	//*   0    0:aload_0         
	//*   1    1:ifnull          29
	//*   2    4:aload_1         
	//*   3    5:ifnull          29
	//*   4    8:ldc1            #58  <String "android.intent.action.MEDIA_BUTTON">
	//*   5   10:aload_1         
	//*   6   11:invokevirtual   #137 <Method String Intent.getAction()>
	//*   7   14:invokevirtual   #143 <Method boolean String.equals(Object)>
	//*   8   17:ifeq            29
	//*   9   20:aload_1         
	//*  10   21:ldc1            #67  <String "android.intent.extra.KEY_EVENT">
	//*  11   23:invokevirtual   #147 <Method boolean Intent.hasExtra(String)>
	//*  12   26:ifne            31
		{
			return null;
	//   13   29:aconst_null     
	//   14   30:areturn         
		} else
		{
			intent = ((Intent) ((KeyEvent)intent.getParcelableExtra("android.intent.extra.KEY_EVENT")));
	//   15   31:aload_1         
	//   16   32:ldc1            #67  <String "android.intent.extra.KEY_EVENT">
	//   17   34:invokevirtual   #151 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   18   37:checkcast       #69  <Class KeyEvent>
	//   19   40:astore_1        
			mediasessioncompat.getController().dispatchMediaButtonEvent(((KeyEvent) (intent)));
	//   20   41:aload_0         
	//   21   42:invokevirtual   #157 <Method MediaControllerCompat MediaSessionCompat.getController()>
	//   22   45:aload_1         
	//   23   46:invokevirtual   #163 <Method boolean MediaControllerCompat.dispatchMediaButtonEvent(KeyEvent)>
	//   24   49:pop             
			return ((KeyEvent) (intent));
	//   25   50:aload_1         
	//   26   51:areturn         
		}
	}

	public void onReceive(Context context, Intent intent)
	{
		Intent intent1 = new Intent("android.intent.action.MEDIA_BUTTON");
	//    0    0:new             #56  <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #58  <String "android.intent.action.MEDIA_BUTTON">
	//    3    6:invokespecial   #61  <Method void Intent(String)>
	//    4    9:astore          5
		intent1.setPackage(context.getPackageName());
	//    5   11:aload           5
	//    6   13:aload_1         
	//    7   14:invokevirtual   #87  <Method String Context.getPackageName()>
	//    8   17:invokevirtual   #91  <Method Intent Intent.setPackage(String)>
	//    9   20:pop             
		PackageManager packagemanager = context.getPackageManager();
	//   10   21:aload_1         
	//   11   22:invokevirtual   #95  <Method PackageManager Context.getPackageManager()>
	//   12   25:astore          6
		List list = packagemanager.queryIntentServices(intent1, 0);
	//   13   27:aload           6
	//   14   29:aload           5
	//   15   31:iconst_0        
	//   16   32:invokevirtual   #168 <Method List PackageManager.queryIntentServices(Intent, int)>
	//   17   35:astore          4
		Object obj = ((Object) (list));
	//   18   37:aload           4
	//   19   39:astore_3        
		if(list.isEmpty())
	//*  20   40:aload           4
	//*  21   42:invokeinterface #172 <Method boolean List.isEmpty()>
	//*  22   47:ifeq            67
		{
			intent1.setAction("android.media.browse.MediaBrowserService");
	//   23   50:aload           5
	//   24   52:ldc1            #174 <String "android.media.browse.MediaBrowserService">
	//   25   54:invokevirtual   #177 <Method Intent Intent.setAction(String)>
	//   26   57:pop             
			obj = ((Object) (packagemanager.queryIntentServices(intent1, 0)));
	//   27   58:aload           6
	//   28   60:aload           5
	//   29   62:iconst_0        
	//   30   63:invokevirtual   #168 <Method List PackageManager.queryIntentServices(Intent, int)>
	//   31   66:astore_3        
		}
		if(((List) (obj)).isEmpty())
	//*  32   67:aload_3         
	//*  33   68:invokeinterface #172 <Method boolean List.isEmpty()>
	//*  34   73:ifeq            86
			throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or a media browser service implementation");
	//   35   76:new             #179 <Class IllegalStateException>
	//   36   79:dup             
	//   37   80:ldc1            #181 <String "Could not find any Service that handles android.intent.action.MEDIA_BUTTON or a media browser service implementation">
	//   38   82:invokespecial   #182 <Method void IllegalStateException(String)>
	//   39   85:athrow          
		if(((List) (obj)).size() != 1)
	//*  40   86:aload_3         
	//*  41   87:invokeinterface #107 <Method int List.size()>
	//*  42   92:iconst_1        
	//*  43   93:icmpeq          141
		{
			throw new IllegalStateException((new StringBuilder()).append("Expected 1 Service that handles ").append(intent1.getAction()).append(", found ").append(((List) (obj)).size()).toString());
	//   44   96:new             #179 <Class IllegalStateException>
	//   45   99:dup             
	//   46  100:new             #40  <Class StringBuilder>
	//   47  103:dup             
	//   48  104:invokespecial   #41  <Method void StringBuilder()>
	//   49  107:ldc1            #184 <String "Expected 1 Service that handles ">
	//   50  109:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   51  112:aload           5
	//   52  114:invokevirtual   #137 <Method String Intent.getAction()>
	//   53  117:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   54  120:ldc1            #186 <String ", found ">
	//   55  122:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   56  125:aload_3         
	//   57  126:invokeinterface #107 <Method int List.size()>
	//   58  131:invokevirtual   #189 <Method StringBuilder StringBuilder.append(int)>
	//   59  134:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   60  137:invokespecial   #182 <Method void IllegalStateException(String)>
	//   61  140:athrow          
		} else
		{
			obj = ((Object) ((ResolveInfo)((List) (obj)).get(0)));
	//   62  141:aload_3         
	//   63  142:iconst_0        
	//   64  143:invokeinterface #111 <Method Object List.get(int)>
	//   65  148:checkcast       #113 <Class ResolveInfo>
	//   66  151:astore_3        
			intent.setComponent(new ComponentName(((ResolveInfo) (obj)).serviceInfo.packageName, ((ResolveInfo) (obj)).serviceInfo.name));
	//   67  152:aload_2         
	//   68  153:new             #115 <Class ComponentName>
	//   69  156:dup             
	//   70  157:aload_3         
	//   71  158:getfield        #193 <Field ServiceInfo ResolveInfo.serviceInfo>
	//   72  161:getfield        #196 <Field String ServiceInfo.packageName>
	//   73  164:aload_3         
	//   74  165:getfield        #193 <Field ServiceInfo ResolveInfo.serviceInfo>
	//   75  168:getfield        #197 <Field String ServiceInfo.name>
	//   76  171:invokespecial   #130 <Method void ComponentName(String, String)>
	//   77  174:invokevirtual   #65  <Method Intent Intent.setComponent(ComponentName)>
	//   78  177:pop             
			context.startService(intent);
	//   79  178:aload_1         
	//   80  179:aload_2         
	//   81  180:invokevirtual   #201 <Method ComponentName Context.startService(Intent)>
	//   82  183:pop             
			return;
	//   83  184:return          
		}
	}

	private static final String TAG = "MediaButtonReceiver";
}
