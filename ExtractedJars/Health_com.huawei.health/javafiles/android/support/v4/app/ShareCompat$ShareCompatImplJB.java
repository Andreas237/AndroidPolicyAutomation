// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.view.MenuItem;

// Referenced classes of package android.support.v4.app:
//			ShareCompat, ShareCompatJB

static class ShareCompat$ShareCompatImplJB extends 
{

	public String escapeHtml(CharSequence charsequence)
	{
		return ShareCompatJB.escapeHtml(charsequence);
	//    0    0:aload_1         
	//    1    1:invokestatic    #18  <Method String ShareCompatJB.escapeHtml(CharSequence)>
	//    2    4:areturn         
	}

	boolean shouldAddChooserIntent(MenuItem menuitem)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	ShareCompat$ShareCompatImplJB()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void ShareCompat$ShareCompatImplICS()>
	//    2    4:return          
	}
}
