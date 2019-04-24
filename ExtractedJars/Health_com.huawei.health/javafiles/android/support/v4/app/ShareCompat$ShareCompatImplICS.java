// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.view.MenuItem;

// Referenced classes of package android.support.v4.app:
//			ShareCompat, ShareCompatICS

static class ShareCompat$ShareCompatImplICS extends 
{

	public void configureMenuItem(MenuItem menuitem, ShareCompat.IntentBuilder intentbuilder)
	{
		ShareCompatICS.configureMenuItem(menuitem, intentbuilder.getActivity(), intentbuilder.getIntent());
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #20  <Method android.app.Activity ShareCompat$IntentBuilder.getActivity()>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #24  <Method android.content.Intent ShareCompat$IntentBuilder.getIntent()>
	//    5    9:invokestatic    #29  <Method void ShareCompatICS.configureMenuItem(MenuItem, android.app.Activity, android.content.Intent)>
		if(shouldAddChooserIntent(menuitem))
	//*   6   12:aload_0         
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #33  <Method boolean shouldAddChooserIntent(MenuItem)>
	//*   9   17:ifeq            31
			menuitem.setIntent(intentbuilder.createChooserIntent());
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:invokevirtual   #36  <Method android.content.Intent ShareCompat$IntentBuilder.createChooserIntent()>
	//   13   25:invokeinterface #42  <Method MenuItem MenuItem.setIntent(android.content.Intent)>
	//   14   30:pop             
	//   15   31:return          
	}

	boolean shouldAddChooserIntent(MenuItem menuitem)
	{
		return !menuitem.hasSubMenu();
	//    0    0:aload_1         
	//    1    1:invokeinterface #46  <Method boolean MenuItem.hasSubMenu()>
	//    2    6:ifne            11
	//    3    9:iconst_1        
	//    4   10:ireturn         
	//    5   11:iconst_0        
	//    6   12:ireturn         
	}

	ShareCompat$ShareCompatImplICS()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void ShareCompat$ShareCompatImplBase()>
	//    2    4:return          
	}
}
