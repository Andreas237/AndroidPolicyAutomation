// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content.pm;

import android.content.*;
import android.content.pm.*;
import android.support.v4.content.ContextCompat;
import android.support.v4.os.BuildCompat;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.support.v4.content.pm:
//			ShortcutManagerCompatApi26, ShortcutInfoCompat

public class ShortcutManagerCompat
{

	public ShortcutManagerCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	public static Intent createShortcutResultIntent(Context context, ShortcutInfoCompat shortcutinfocompat)
	{
		Intent intent = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		if(BuildCompat.isAtLeastO())
	//*   2    2:invokestatic    #28  <Method boolean BuildCompat.isAtLeastO()>
	//*   3    5:ifeq            14
			intent = ShortcutManagerCompatApi26.createShortcutResultIntent(context, shortcutinfocompat);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokestatic    #32  <Method Intent ShortcutManagerCompatApi26.createShortcutResultIntent(Context, ShortcutInfoCompat)>
	//    7   13:astore_2        
		context = ((Context) (intent));
	//    8   14:aload_2         
	//    9   15:astore_0        
		if(intent == null)
	//*  10   16:aload_2         
	//*  11   17:ifnonnull       28
			context = ((Context) (new Intent()));
	//   12   20:new             #34  <Class Intent>
	//   13   23:dup             
	//   14   24:invokespecial   #35  <Method void Intent()>
	//   15   27:astore_0        
		return shortcutinfocompat.addToIntent(((Intent) (context)));
	//   16   28:aload_1         
	//   17   29:aload_0         
	//   18   30:invokevirtual   #41  <Method Intent ShortcutInfoCompat.addToIntent(Intent)>
	//   19   33:areturn         
	}

	public static boolean isRequestPinShortcutSupported(Context context)
	{
		if(BuildCompat.isAtLeastO())
	//*   0    0:invokestatic    #28  <Method boolean BuildCompat.isAtLeastO()>
	//*   1    3:ifeq            11
			return ShortcutManagerCompatApi26.isRequestPinShortcutSupported(context);
	//    2    6:aload_0         
	//    3    7:invokestatic    #47  <Method boolean ShortcutManagerCompatApi26.isRequestPinShortcutSupported(Context)>
	//    4   10:ireturn         
		if(ContextCompat.checkSelfPermission(context, "com.android.launcher.permission.INSTALL_SHORTCUT") != 0)
	//*   5   11:aload_0         
	//*   6   12:ldc1            #14  <String "com.android.launcher.permission.INSTALL_SHORTCUT">
	//*   7   14:invokestatic    #53  <Method int ContextCompat.checkSelfPermission(Context, String)>
	//*   8   17:ifeq            22
			return false;
	//    9   20:iconst_0        
	//   10   21:ireturn         
		for(context = ((Context) (context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"), 0).iterator())); ((Iterator) (context)).hasNext();)
	//*  11   22:aload_0         
	//*  12   23:invokevirtual   #59  <Method PackageManager Context.getPackageManager()>
	//*  13   26:new             #34  <Class Intent>
	//*  14   29:dup             
	//*  15   30:ldc1            #10  <String "com.android.launcher.action.INSTALL_SHORTCUT">
	//*  16   32:invokespecial   #62  <Method void Intent(String)>
	//*  17   35:iconst_0        
	//*  18   36:invokevirtual   #68  <Method List PackageManager.queryBroadcastReceivers(Intent, int)>
	//*  19   39:invokeinterface #74  <Method Iterator List.iterator()>
	//*  20   44:astore_0        
	//*  21   45:aload_0         
	//*  22   46:invokeinterface #79  <Method boolean Iterator.hasNext()>
	//*  23   51:ifeq            91
		{
			String s = ((ResolveInfo)((Iterator) (context)).next()).activityInfo.permission;
	//   24   54:aload_0         
	//   25   55:invokeinterface #83  <Method Object Iterator.next()>
	//   26   60:checkcast       #85  <Class ResolveInfo>
	//   27   63:getfield        #89  <Field ActivityInfo ResolveInfo.activityInfo>
	//   28   66:getfield        #94  <Field String ActivityInfo.permission>
	//   29   69:astore_1        
			if(TextUtils.isEmpty(((CharSequence) (s))) || "com.android.launcher.permission.INSTALL_SHORTCUT".equals(((Object) (s))))
	//*  30   70:aload_1         
	//*  31   71:invokestatic    #100 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  32   74:ifne            86
	//*  33   77:ldc1            #14  <String "com.android.launcher.permission.INSTALL_SHORTCUT">
	//*  34   79:aload_1         
	//*  35   80:invokevirtual   #106 <Method boolean String.equals(Object)>
	//*  36   83:ifeq            88
				return true;
	//   37   86:iconst_1        
	//   38   87:ireturn         
		}

	//*  39   88:goto            45
		return false;
	//   40   91:iconst_0        
	//   41   92:ireturn         
	}

	public static boolean requestPinShortcut(Context context, ShortcutInfoCompat shortcutinfocompat, IntentSender intentsender)
	{
		if(BuildCompat.isAtLeastO())
	//*   0    0:invokestatic    #28  <Method boolean BuildCompat.isAtLeastO()>
	//*   1    3:ifeq            13
			return ShortcutManagerCompatApi26.requestPinShortcut(context, shortcutinfocompat, intentsender);
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokestatic    #111 <Method boolean ShortcutManagerCompatApi26.requestPinShortcut(Context, ShortcutInfoCompat, IntentSender)>
	//    6   12:ireturn         
		if(!isRequestPinShortcutSupported(context))
	//*   7   13:aload_0         
	//*   8   14:invokestatic    #112 <Method boolean isRequestPinShortcutSupported(Context)>
	//*   9   17:ifne            22
			return false;
	//   10   20:iconst_0        
	//   11   21:ireturn         
		shortcutinfocompat = ((ShortcutInfoCompat) (shortcutinfocompat.addToIntent(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"))));
	//   12   22:aload_1         
	//   13   23:new             #34  <Class Intent>
	//   14   26:dup             
	//   15   27:ldc1            #10  <String "com.android.launcher.action.INSTALL_SHORTCUT">
	//   16   29:invokespecial   #62  <Method void Intent(String)>
	//   17   32:invokevirtual   #41  <Method Intent ShortcutInfoCompat.addToIntent(Intent)>
	//   18   35:astore_1        
		if(intentsender == null)
	//*  19   36:aload_2         
	//*  20   37:ifnonnull       47
		{
			context.sendBroadcast(((Intent) (shortcutinfocompat)));
	//   21   40:aload_0         
	//   22   41:aload_1         
	//   23   42:invokevirtual   #116 <Method void Context.sendBroadcast(Intent)>
			return true;
	//   24   45:iconst_1        
	//   25   46:ireturn         
		} else
		{
			context.sendOrderedBroadcast(((Intent) (shortcutinfocompat)), ((String) (null)), ((BroadcastReceiver) (new BroadcastReceiver(intentsender) {

				public void onReceive(Context context1, Intent intent)
				{
					try
					{
						callback.sendIntent(context1, 0, ((Intent) (null)), ((android.content.IntentSender.OnFinished) (null)), ((android.os.Handler) (null)));
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field IntentSender val$callback>
				//    2    4:aload_1         
				//    3    5:iconst_0        
				//    4    6:aconst_null     
				//    5    7:aconst_null     
				//    6    8:aconst_null     
				//    7    9:invokevirtual   #29  <Method void IntentSender.sendIntent(Context, int, Intent, android.content.IntentSender$OnFinished, android.os.Handler)>
						return;
				//    8   12:return          
					}
					// Misplaced declaration of an exception variable
					catch(Context context1)
				//*   9   13:astore_1        
					{
						return;
				//   10   14:return          
					}
				}

				final IntentSender val$callback;

			
			{
				callback = intentsender;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field IntentSender val$callback>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void BroadcastReceiver()>
			//    5    9:return          
			}
			}
)), ((android.os.Handler) (null)), -1, ((String) (null)), ((android.os.Bundle) (null)));
	//   26   47:aload_0         
	//   27   48:aload_1         
	//   28   49:aconst_null     
	//   29   50:new             #6   <Class ShortcutManagerCompat$1>
	//   30   53:dup             
	//   31   54:aload_2         
	//   32   55:invokespecial   #119 <Method void ShortcutManagerCompat$1(IntentSender)>
	//   33   58:aconst_null     
	//   34   59:iconst_m1       
	//   35   60:aconst_null     
	//   36   61:aconst_null     
	//   37   62:invokevirtual   #123 <Method void Context.sendOrderedBroadcast(Intent, String, BroadcastReceiver, android.os.Handler, int, String, android.os.Bundle)>
			return true;
	//   38   65:iconst_1        
	//   39   66:ireturn         
		}
	}

	static final String ACTION_INSTALL_SHORTCUT = "com.android.launcher.action.INSTALL_SHORTCUT";
	static final String INSTALL_SHORTCUT_PERMISSION = "com.android.launcher.permission.INSTALL_SHORTCUT";
}
