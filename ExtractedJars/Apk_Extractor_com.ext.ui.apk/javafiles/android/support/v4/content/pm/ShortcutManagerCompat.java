// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content.pm;

import android.content.*;
import android.content.pm.*;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.support.v4.content.pm:
//			ShortcutInfoCompat

public class ShortcutManagerCompat
{

	private ShortcutManagerCompat()
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
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   2    2:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    5:bipush          26
	//*   4    7:icmplt          27
			intent = ((ShortcutManager)context.getSystemService(android/content/pm/ShortcutManager)).createShortcutResultIntent(shortcutinfocompat.toShortcutInfo());
	//    5   10:aload_0         
	//    6   11:ldc1            #30  <Class ShortcutManager>
	//    7   13:invokevirtual   #36  <Method Object Context.getSystemService(Class)>
	//    8   16:checkcast       #30  <Class ShortcutManager>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #42  <Method android.content.pm.ShortcutInfo ShortcutInfoCompat.toShortcutInfo()>
	//   11   23:invokevirtual   #45  <Method Intent ShortcutManager.createShortcutResultIntent(android.content.pm.ShortcutInfo)>
	//   12   26:astore_2        
		context = ((Context) (intent));
	//   13   27:aload_2         
	//   14   28:astore_0        
		if(intent == null)
	//*  15   29:aload_2         
	//*  16   30:ifnonnull       41
			context = ((Context) (new Intent()));
	//   17   33:new             #47  <Class Intent>
	//   18   36:dup             
	//   19   37:invokespecial   #48  <Method void Intent()>
	//   20   40:astore_0        
		return shortcutinfocompat.addToIntent(((Intent) (context)));
	//   21   41:aload_1         
	//   22   42:aload_0         
	//   23   43:invokevirtual   #52  <Method Intent ShortcutInfoCompat.addToIntent(Intent)>
	//   24   46:areturn         
	}

	public static boolean isRequestPinShortcutSupported(Context context)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          21
			return ((ShortcutManager)context.getSystemService(android/content/pm/ShortcutManager)).isRequestPinShortcutSupported();
	//    3    8:aload_0         
	//    4    9:ldc1            #30  <Class ShortcutManager>
	//    5   11:invokevirtual   #36  <Method Object Context.getSystemService(Class)>
	//    6   14:checkcast       #30  <Class ShortcutManager>
	//    7   17:invokevirtual   #59  <Method boolean ShortcutManager.isRequestPinShortcutSupported()>
	//    8   20:ireturn         
		if(ContextCompat.checkSelfPermission(context, "com.android.launcher.permission.INSTALL_SHORTCUT") != 0)
	//*   9   21:aload_0         
	//*  10   22:ldc1            #14  <String "com.android.launcher.permission.INSTALL_SHORTCUT">
	//*  11   24:invokestatic    #65  <Method int ContextCompat.checkSelfPermission(Context, String)>
	//*  12   27:ifeq            32
			return false;
	//   13   30:iconst_0        
	//   14   31:ireturn         
		for(context = ((Context) (context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"), 0).iterator())); ((Iterator) (context)).hasNext();)
	//*  15   32:aload_0         
	//*  16   33:invokevirtual   #69  <Method PackageManager Context.getPackageManager()>
	//*  17   36:new             #47  <Class Intent>
	//*  18   39:dup             
	//*  19   40:ldc1            #10  <String "com.android.launcher.action.INSTALL_SHORTCUT">
	//*  20   42:invokespecial   #72  <Method void Intent(String)>
	//*  21   45:iconst_0        
	//*  22   46:invokevirtual   #78  <Method List PackageManager.queryBroadcastReceivers(Intent, int)>
	//*  23   49:invokeinterface #84  <Method Iterator List.iterator()>
	//*  24   54:astore_0        
	//*  25   55:aload_0         
	//*  26   56:invokeinterface #89  <Method boolean Iterator.hasNext()>
	//*  27   61:ifeq            98
		{
			String s = ((ResolveInfo)((Iterator) (context)).next()).activityInfo.permission;
	//   28   64:aload_0         
	//   29   65:invokeinterface #93  <Method Object Iterator.next()>
	//   30   70:checkcast       #95  <Class ResolveInfo>
	//   31   73:getfield        #99  <Field ActivityInfo ResolveInfo.activityInfo>
	//   32   76:getfield        #104 <Field String ActivityInfo.permission>
	//   33   79:astore_1        
			if(TextUtils.isEmpty(((CharSequence) (s))) || "com.android.launcher.permission.INSTALL_SHORTCUT".equals(((Object) (s))))
	//*  34   80:aload_1         
	//*  35   81:invokestatic    #110 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  36   84:ifne            96
	//*  37   87:ldc1            #14  <String "com.android.launcher.permission.INSTALL_SHORTCUT">
	//*  38   89:aload_1         
	//*  39   90:invokevirtual   #116 <Method boolean String.equals(Object)>
	//*  40   93:ifeq            55
				return true;
	//   41   96:iconst_1        
	//   42   97:ireturn         
		}

		return false;
	//   43   98:iconst_0        
	//   44   99:ireturn         
	}

	public static boolean requestPinShortcut(Context context, ShortcutInfoCompat shortcutinfocompat, IntentSender intentsender)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          26
			return ((ShortcutManager)context.getSystemService(android/content/pm/ShortcutManager)).requestPinShortcut(shortcutinfocompat.toShortcutInfo(), intentsender);
	//    3    8:aload_0         
	//    4    9:ldc1            #30  <Class ShortcutManager>
	//    5   11:invokevirtual   #36  <Method Object Context.getSystemService(Class)>
	//    6   14:checkcast       #30  <Class ShortcutManager>
	//    7   17:aload_1         
	//    8   18:invokevirtual   #42  <Method android.content.pm.ShortcutInfo ShortcutInfoCompat.toShortcutInfo()>
	//    9   21:aload_2         
	//   10   22:invokevirtual   #122 <Method boolean ShortcutManager.requestPinShortcut(android.content.pm.ShortcutInfo, IntentSender)>
	//   11   25:ireturn         
		if(!isRequestPinShortcutSupported(context))
	//*  12   26:aload_0         
	//*  13   27:invokestatic    #124 <Method boolean isRequestPinShortcutSupported(Context)>
	//*  14   30:ifne            35
			return false;
	//   15   33:iconst_0        
	//   16   34:ireturn         
		shortcutinfocompat = ((ShortcutInfoCompat) (shortcutinfocompat.addToIntent(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"))));
	//   17   35:aload_1         
	//   18   36:new             #47  <Class Intent>
	//   19   39:dup             
	//   20   40:ldc1            #10  <String "com.android.launcher.action.INSTALL_SHORTCUT">
	//   21   42:invokespecial   #72  <Method void Intent(String)>
	//   22   45:invokevirtual   #52  <Method Intent ShortcutInfoCompat.addToIntent(Intent)>
	//   23   48:astore_1        
		if(intentsender == null)
	//*  24   49:aload_2         
	//*  25   50:ifnonnull       60
		{
			context.sendBroadcast(((Intent) (shortcutinfocompat)));
	//   26   53:aload_0         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #128 <Method void Context.sendBroadcast(Intent)>
			return true;
	//   29   58:iconst_1        
	//   30   59:ireturn         
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
	//   31   60:aload_0         
	//   32   61:aload_1         
	//   33   62:aconst_null     
	//   34   63:new             #6   <Class ShortcutManagerCompat$1>
	//   35   66:dup             
	//   36   67:aload_2         
	//   37   68:invokespecial   #131 <Method void ShortcutManagerCompat$1(IntentSender)>
	//   38   71:aconst_null     
	//   39   72:iconst_m1       
	//   40   73:aconst_null     
	//   41   74:aconst_null     
	//   42   75:invokevirtual   #135 <Method void Context.sendOrderedBroadcast(Intent, String, BroadcastReceiver, android.os.Handler, int, String, android.os.Bundle)>
			return true;
	//   43   78:iconst_1        
	//   44   79:ireturn         
		}
	}

	static final String ACTION_INSTALL_SHORTCUT = "com.android.launcher.action.INSTALL_SHORTCUT";
	static final String INSTALL_SHORTCUT_PERMISSION = "com.android.launcher.permission.INSTALL_SHORTCUT";
}
