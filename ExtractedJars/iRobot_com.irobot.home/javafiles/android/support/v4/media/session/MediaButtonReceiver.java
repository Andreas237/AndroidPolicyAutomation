// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.content.*;
import android.content.pm.*;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.util.Log;
import android.view.KeyEvent;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat

public class MediaButtonReceiver extends BroadcastReceiver
{
	private static class a extends android.support.v4.media.MediaBrowserCompat.b
	{

		private void d()
		{
			f.b();
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field MediaBrowserCompat f>
		//    2    4:invokevirtual   #34  <Method void MediaBrowserCompat.b()>
			e.finish();
		//    3    7:aload_0         
		//    4    8:getfield        #26  <Field android.content.BroadcastReceiver$PendingResult e>
		//    5   11:invokevirtual   #39  <Method void android.content.BroadcastReceiver$PendingResult.finish()>
		//    6   14:return          
		}

		public void a()
		{
			try
			{
				(new MediaControllerCompat(c, f.c())).a((KeyEvent)d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
		//    0    0:new             #43  <Class MediaControllerCompat>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #22  <Field Context c>
		//    4    8:aload_0         
		//    5    9:getfield        #29  <Field MediaBrowserCompat f>
		//    6   12:invokevirtual   #46  <Method MediaSessionCompat$Token MediaBrowserCompat.c()>
		//    7   15:invokespecial   #49  <Method void MediaControllerCompat(Context, MediaSessionCompat$Token)>
		//    8   18:aload_0         
		//    9   19:getfield        #24  <Field Intent d>
		//   10   22:ldc1            #51  <String "android.intent.extra.KEY_EVENT">
		//   11   24:invokevirtual   #57  <Method android.os.Parcelable Intent.getParcelableExtra(String)>
		//   12   27:checkcast       #59  <Class KeyEvent>
		//   13   30:invokevirtual   #62  <Method boolean MediaControllerCompat.a(KeyEvent)>
		//   14   33:pop             
			}
		//*  15   34:goto            47
			catch(RemoteException remoteexception)
		//*  16   37:astore_1        
			{
				Log.e("MediaButtonReceiver", "Failed to create a media controller", ((Throwable) (remoteexception)));
		//   17   38:ldc1            #64  <String "MediaButtonReceiver">
		//   18   40:ldc1            #66  <String "Failed to create a media controller">
		//   19   42:aload_1         
		//   20   43:invokestatic    #71  <Method int Log.e(String, String, Throwable)>
		//   21   46:pop             
			}
			d();
		//   22   47:aload_0         
		//   23   48:invokespecial   #73  <Method void d()>
		//   24   51:return          
		}

		void a(MediaBrowserCompat mediabrowsercompat)
		{
			f = mediabrowsercompat;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #29  <Field MediaBrowserCompat f>
		//    3    5:return          
		}

		public void b()
		{
			d();
		//    0    0:aload_0         
		//    1    1:invokespecial   #73  <Method void d()>
		//    2    4:return          
		}

		public void c()
		{
			d();
		//    0    0:aload_0         
		//    1    1:invokespecial   #73  <Method void d()>
		//    2    4:return          
		}

		private final Context c;
		private final Intent d;
		private final android.content.BroadcastReceiver.PendingResult e;
		private MediaBrowserCompat f;

		a(Context context, Intent intent, android.content.BroadcastReceiver.PendingResult pendingresult)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void android.support.v4.media.MediaBrowserCompat$b()>
			c = context;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field Context c>
			d = intent;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field Intent d>
			e = pendingresult;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #26  <Field android.content.BroadcastReceiver$PendingResult e>
		//   11   19:return          
		}
	}


	public MediaButtonReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	private static ComponentName a(Context context, String s)
	{
		PackageManager packagemanager = context.getPackageManager();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #19  <Method PackageManager Context.getPackageManager()>
	//    2    4:astore_2        
		Intent intent = new Intent(s);
	//    3    5:new             #21  <Class Intent>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #24  <Method void Intent(String)>
	//    7   13:astore_3        
		intent.setPackage(context.getPackageName());
	//    8   14:aload_3         
	//    9   15:aload_0         
	//   10   16:invokevirtual   #28  <Method String Context.getPackageName()>
	//   11   19:invokevirtual   #32  <Method Intent Intent.setPackage(String)>
	//   12   22:pop             
		context = ((Context) (packagemanager.queryIntentServices(intent, 0)));
	//   13   23:aload_2         
	//   14   24:aload_3         
	//   15   25:iconst_0        
	//   16   26:invokevirtual   #38  <Method List PackageManager.queryIntentServices(Intent, int)>
	//   17   29:astore_0        
		if(((List) (context)).size() == 1)
	//*  18   30:aload_0         
	//*  19   31:invokeinterface #44  <Method int List.size()>
	//*  20   36:iconst_1        
	//*  21   37:icmpne          73
		{
			context = ((Context) ((ResolveInfo)((List) (context)).get(0)));
	//   22   40:aload_0         
	//   23   41:iconst_0        
	//   24   42:invokeinterface #48  <Method Object List.get(int)>
	//   25   47:checkcast       #50  <Class ResolveInfo>
	//   26   50:astore_0        
			return new ComponentName(((ResolveInfo) (context)).serviceInfo.packageName, ((ResolveInfo) (context)).serviceInfo.name);
	//   27   51:new             #52  <Class ComponentName>
	//   28   54:dup             
	//   29   55:aload_0         
	//   30   56:getfield        #56  <Field ServiceInfo ResolveInfo.serviceInfo>
	//   31   59:getfield        #62  <Field String ServiceInfo.packageName>
	//   32   62:aload_0         
	//   33   63:getfield        #56  <Field ServiceInfo ResolveInfo.serviceInfo>
	//   34   66:getfield        #65  <Field String ServiceInfo.name>
	//   35   69:invokespecial   #68  <Method void ComponentName(String, String)>
	//   36   72:areturn         
		}
		if(((List) (context)).isEmpty())
	//*  37   73:aload_0         
	//*  38   74:invokeinterface #72  <Method boolean List.isEmpty()>
	//*  39   79:ifeq            84
		{
			return null;
	//   40   82:aconst_null     
	//   41   83:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   42   84:new             #74  <Class StringBuilder>
	//   43   87:dup             
	//   44   88:invokespecial   #75  <Method void StringBuilder()>
	//   45   91:astore_2        
			stringbuilder.append("Expected 1 service that handles ");
	//   46   92:aload_2         
	//   47   93:ldc1            #77  <String "Expected 1 service that handles ">
	//   48   95:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   49   98:pop             
			stringbuilder.append(s);
	//   50   99:aload_2         
	//   51  100:aload_1         
	//   52  101:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   53  104:pop             
			stringbuilder.append(", found ");
	//   54  105:aload_2         
	//   55  106:ldc1            #83  <String ", found ">
	//   56  108:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   57  111:pop             
			stringbuilder.append(((List) (context)).size());
	//   58  112:aload_2         
	//   59  113:aload_0         
	//   60  114:invokeinterface #44  <Method int List.size()>
	//   61  119:invokevirtual   #86  <Method StringBuilder StringBuilder.append(int)>
	//   62  122:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   63  123:new             #88  <Class IllegalStateException>
	//   64  126:dup             
	//   65  127:aload_2         
	//   66  128:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   67  131:invokespecial   #92  <Method void IllegalStateException(String)>
	//   68  134:athrow          
		}
	}

	private static void a(Context context, Intent intent)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #99  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          15
		{
			context.startForegroundService(intent);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #103 <Method ComponentName Context.startForegroundService(Intent)>
	//    6   13:pop             
			return;
	//    7   14:return          
		} else
		{
			context.startService(intent);
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #106 <Method ComponentName Context.startService(Intent)>
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
	//*   2    4:ldc1            #109 <String "android.intent.action.MEDIA_BUTTON">
	//*   3    6:aload_2         
	//*   4    7:invokevirtual   #112 <Method String Intent.getAction()>
	//*   5   10:invokevirtual   #118 <Method boolean String.equals(Object)>
	//*   6   13:ifeq            117
	//*   7   16:aload_2         
	//*   8   17:ldc1            #120 <String "android.intent.extra.KEY_EVENT">
	//*   9   19:invokevirtual   #124 <Method boolean Intent.hasExtra(String)>
	//*  10   22:ifne            28
	//*  11   25:goto            117
		{
			ComponentName componentname = a(context, "android.intent.action.MEDIA_BUTTON");
	//   12   28:aload_1         
	//   13   29:ldc1            #109 <String "android.intent.action.MEDIA_BUTTON">
	//   14   31:invokestatic    #126 <Method ComponentName a(Context, String)>
	//   15   34:astore_3        
			if(componentname != null)
	//*  16   35:aload_3         
	//*  17   36:ifnull          51
			{
				intent.setComponent(componentname);
	//   18   39:aload_2         
	//   19   40:aload_3         
	//   20   41:invokevirtual   #130 <Method Intent Intent.setComponent(ComponentName)>
	//   21   44:pop             
				a(context, intent);
	//   22   45:aload_1         
	//   23   46:aload_2         
	//   24   47:invokestatic    #132 <Method void a(Context, Intent)>
				return;
	//   25   50:return          
			}
			componentname = a(context, "android.media.browse.MediaBrowserService");
	//   26   51:aload_1         
	//   27   52:ldc1            #134 <String "android.media.browse.MediaBrowserService">
	//   28   54:invokestatic    #126 <Method ComponentName a(Context, String)>
	//   29   57:astore_3        
			if(componentname != null)
	//*  30   58:aload_3         
	//*  31   59:ifnull          107
			{
				android.content.BroadcastReceiver.PendingResult pendingresult = goAsync();
	//   32   62:aload_0         
	//   33   63:invokevirtual   #138 <Method android.content.BroadcastReceiver$PendingResult goAsync()>
	//   34   66:astore          4
				context = context.getApplicationContext();
	//   35   68:aload_1         
	//   36   69:invokevirtual   #142 <Method Context Context.getApplicationContext()>
	//   37   72:astore_1        
				intent = ((Intent) (new a(context, intent, pendingresult)));
	//   38   73:new             #6   <Class MediaButtonReceiver$a>
	//   39   76:dup             
	//   40   77:aload_1         
	//   41   78:aload_2         
	//   42   79:aload           4
	//   43   81:invokespecial   #145 <Method void MediaButtonReceiver$a(Context, Intent, android.content.BroadcastReceiver$PendingResult)>
	//   44   84:astore_2        
				context = ((Context) (new MediaBrowserCompat(context, componentname, ((android.support.v4.media.MediaBrowserCompat.b) (intent)), ((android.os.Bundle) (null)))));
	//   45   85:new             #147 <Class MediaBrowserCompat>
	//   46   88:dup             
	//   47   89:aload_1         
	//   48   90:aload_3         
	//   49   91:aload_2         
	//   50   92:aconst_null     
	//   51   93:invokespecial   #150 <Method void MediaBrowserCompat(Context, ComponentName, android.support.v4.media.MediaBrowserCompat$b, android.os.Bundle)>
	//   52   96:astore_1        
				((a) (intent)).a(((MediaBrowserCompat) (context)));
	//   53   97:aload_2         
	//   54   98:aload_1         
	//   55   99:invokevirtual   #153 <Method void MediaButtonReceiver$a.a(MediaBrowserCompat)>
				((MediaBrowserCompat) (context)).a();
	//   56  102:aload_1         
	//   57  103:invokevirtual   #155 <Method void MediaBrowserCompat.a()>
				return;
	//   58  106:return          
			} else
			{
				throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
	//   59  107:new             #88  <Class IllegalStateException>
	//   60  110:dup             
	//   61  111:ldc1            #157 <String "Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.">
	//   62  113:invokespecial   #92  <Method void IllegalStateException(String)>
	//   63  116:athrow          
			}
		} else
		{
			context = ((Context) (new StringBuilder()));
	//   64  117:new             #74  <Class StringBuilder>
	//   65  120:dup             
	//   66  121:invokespecial   #75  <Method void StringBuilder()>
	//   67  124:astore_1        
			((StringBuilder) (context)).append("Ignore unsupported intent: ");
	//   68  125:aload_1         
	//   69  126:ldc1            #159 <String "Ignore unsupported intent: ">
	//   70  128:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   71  131:pop             
			((StringBuilder) (context)).append(((Object) (intent)));
	//   72  132:aload_1         
	//   73  133:aload_2         
	//   74  134:invokevirtual   #162 <Method StringBuilder StringBuilder.append(Object)>
	//   75  137:pop             
			Log.d("MediaButtonReceiver", ((StringBuilder) (context)).toString());
	//   76  138:ldc1            #164 <String "MediaButtonReceiver">
	//   77  140:aload_1         
	//   78  141:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   79  144:invokestatic    #170 <Method int Log.d(String, String)>
	//   80  147:pop             
			return;
	//   81  148:return          
		}
	}
}
