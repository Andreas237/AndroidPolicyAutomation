// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.view.MenuItem;
import android.widget.ShareActionProvider;

class ShareCompatICS
{

	ShareCompatICS()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public static void configureMenuItem(MenuItem menuitem, Activity activity, Intent intent)
	{
		Object obj = ((Object) (menuitem.getActionProvider()));
	//    0    0:aload_0         
	//    1    1:invokeinterface #24  <Method android.view.ActionProvider MenuItem.getActionProvider()>
	//    2    6:astore_3        
		if(!(obj instanceof ShareActionProvider))
	//*   3    7:aload_3         
	//*   4    8:instanceof      #26  <Class ShareActionProvider>
	//*   5   11:ifne            26
			obj = ((Object) (new ShareActionProvider(((android.content.Context) (activity)))));
	//    6   14:new             #26  <Class ShareActionProvider>
	//    7   17:dup             
	//    8   18:aload_1         
	//    9   19:invokespecial   #29  <Method void ShareActionProvider(android.content.Context)>
	//   10   22:astore_3        
		else
	//*  11   23:goto            31
			obj = ((Object) ((ShareActionProvider)obj));
	//   12   26:aload_3         
	//   13   27:checkcast       #26  <Class ShareActionProvider>
	//   14   30:astore_3        
		((ShareActionProvider) (obj)).setShareHistoryFileName((new StringBuilder()).append(".sharecompat_").append(((Object) (activity)).getClass().getName()).toString());
	//   15   31:aload_3         
	//   16   32:new             #31  <Class StringBuilder>
	//   17   35:dup             
	//   18   36:invokespecial   #32  <Method void StringBuilder()>
	//   19   39:ldc1            #11  <String ".sharecompat_">
	//   20   41:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   21   44:aload_1         
	//   22   45:invokevirtual   #40  <Method Class Object.getClass()>
	//   23   48:invokevirtual   #46  <Method String Class.getName()>
	//   24   51:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   25   54:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   26   57:invokevirtual   #53  <Method void ShareActionProvider.setShareHistoryFileName(String)>
		((ShareActionProvider) (obj)).setShareIntent(intent);
	//   27   60:aload_3         
	//   28   61:aload_2         
	//   29   62:invokevirtual   #57  <Method void ShareActionProvider.setShareIntent(Intent)>
		menuitem.setActionProvider(((android.view.ActionProvider) (obj)));
	//   30   65:aload_0         
	//   31   66:aload_3         
	//   32   67:invokeinterface #61  <Method MenuItem MenuItem.setActionProvider(android.view.ActionProvider)>
	//   33   72:pop             
	//   34   73:return          
	}

	private static final String HISTORY_FILENAME_PREFIX = ".sharecompat_";
}
