// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content.pm;

import android.content.*;
import android.content.pm.ShortcutManager;

// Referenced classes of package android.support.v4.content.pm:
//			ShortcutInfoCompat

class ShortcutManagerCompatApi26
{

	ShortcutManagerCompatApi26()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static Intent createShortcutResultIntent(Context context, ShortcutInfoCompat shortcutinfocompat)
	{
		return ((ShortcutManager)context.getSystemService(android/content/pm/ShortcutManager)).createShortcutResultIntent(shortcutinfocompat.toShortcutInfo());
	//    0    0:aload_0         
	//    1    1:ldc1            #18  <Class ShortcutManager>
	//    2    3:invokevirtual   #24  <Method Object Context.getSystemService(Class)>
	//    3    6:checkcast       #18  <Class ShortcutManager>
	//    4    9:aload_1         
	//    5   10:invokevirtual   #30  <Method android.content.pm.ShortcutInfo ShortcutInfoCompat.toShortcutInfo()>
	//    6   13:invokevirtual   #33  <Method Intent ShortcutManager.createShortcutResultIntent(android.content.pm.ShortcutInfo)>
	//    7   16:areturn         
	}

	public static boolean isRequestPinShortcutSupported(Context context)
	{
		return ((ShortcutManager)context.getSystemService(android/content/pm/ShortcutManager)).isRequestPinShortcutSupported();
	//    0    0:aload_0         
	//    1    1:ldc1            #18  <Class ShortcutManager>
	//    2    3:invokevirtual   #24  <Method Object Context.getSystemService(Class)>
	//    3    6:checkcast       #18  <Class ShortcutManager>
	//    4    9:invokevirtual   #40  <Method boolean ShortcutManager.isRequestPinShortcutSupported()>
	//    5   12:ireturn         
	}

	public static boolean requestPinShortcut(Context context, ShortcutInfoCompat shortcutinfocompat, IntentSender intentsender)
	{
		return ((ShortcutManager)context.getSystemService(android/content/pm/ShortcutManager)).requestPinShortcut(shortcutinfocompat.toShortcutInfo(), intentsender);
	//    0    0:aload_0         
	//    1    1:ldc1            #18  <Class ShortcutManager>
	//    2    3:invokevirtual   #24  <Method Object Context.getSystemService(Class)>
	//    3    6:checkcast       #18  <Class ShortcutManager>
	//    4    9:aload_1         
	//    5   10:invokevirtual   #30  <Method android.content.pm.ShortcutInfo ShortcutInfoCompat.toShortcutInfo()>
	//    6   13:aload_2         
	//    7   14:invokevirtual   #45  <Method boolean ShortcutManager.requestPinShortcut(android.content.pm.ShortcutInfo, IntentSender)>
	//    8   17:ireturn         
	}
}
