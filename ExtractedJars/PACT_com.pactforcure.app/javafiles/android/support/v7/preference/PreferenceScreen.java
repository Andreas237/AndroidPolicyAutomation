// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.preference;

import android.content.Context;
import android.support.v4.content.res.TypedArrayUtils;
import android.util.AttributeSet;

// Referenced classes of package android.support.v7.preference:
//			PreferenceGroup, PreferenceManager

public final class PreferenceScreen extends PreferenceGroup
{

	public PreferenceScreen(Context context, AttributeSet attributeset)
	{
		super(context, attributeset, TypedArrayUtils.getAttr(context, R.attr.preferenceScreenStyle, 0x101008b));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_1         
	//    4    4:getstatic       #18  <Field int R$attr.preferenceScreenStyle>
	//    5    7:ldc1            #19  <Int 0x101008b>
	//    6    9:invokestatic    #25  <Method int TypedArrayUtils.getAttr(Context, int, int)>
	//    7   12:invokespecial   #28  <Method void PreferenceGroup(Context, AttributeSet, int)>
		mShouldUseGeneratedIds = true;
	//    8   15:aload_0         
	//    9   16:iconst_1        
	//   10   17:putfield        #30  <Field boolean mShouldUseGeneratedIds>
	//   11   20:return          
	}

	protected boolean isOnSameScreenAsChildren()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected void onClick()
	{
		PreferenceManager.OnNavigateToScreenListener onnavigatetoscreenlistener;
		if(getIntent() == null && getFragment() == null && getPreferenceCount() != 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #40  <Method android.content.Intent getIntent()>
	//*   2    4:ifnonnull       21
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #44  <Method String getFragment()>
	//*   5   11:ifnonnull       21
	//*   6   14:aload_0         
	//*   7   15:invokevirtual   #48  <Method int getPreferenceCount()>
	//*   8   18:ifne            22
	//*   9   21:return          
	//*  10   22:aload_0         
	//*  11   23:invokevirtual   #52  <Method PreferenceManager getPreferenceManager()>
	//*  12   26:invokevirtual   #58  <Method PreferenceManager$OnNavigateToScreenListener PreferenceManager.getOnNavigateToScreenListener()>
	//*  13   29:astore_1        
			if((onnavigatetoscreenlistener = getPreferenceManager().getOnNavigateToScreenListener()) != null)
	//*  14   30:aload_1         
	//*  15   31:ifnull          21
			{
				onnavigatetoscreenlistener.onNavigateToScreen(this);
	//   16   34:aload_1         
	//   17   35:aload_0         
	//   18   36:invokeinterface #64  <Method void PreferenceManager$OnNavigateToScreenListener.onNavigateToScreen(PreferenceScreen)>
				return;
	//   19   41:return          
			}
	}

	public void setShouldUseGeneratedIds(boolean flag)
	{
		if(isAttached())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #69  <Method boolean isAttached()>
	//*   2    4:ifeq            17
		{
			throw new IllegalStateException("Cannot change the usage of generated IDs while attached to the preference hierarchy");
	//    3    7:new             #71  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #73  <String "Cannot change the usage of generated IDs while attached to the preference hierarchy">
	//    6   13:invokespecial   #76  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		} else
		{
			mShouldUseGeneratedIds = flag;
	//    8   17:aload_0         
	//    9   18:iload_1         
	//   10   19:putfield        #30  <Field boolean mShouldUseGeneratedIds>
			return;
	//   11   22:return          
		}
	}

	public boolean shouldUseGeneratedIds()
	{
		return mShouldUseGeneratedIds;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field boolean mShouldUseGeneratedIds>
	//    2    4:ireturn         
	}

	private boolean mShouldUseGeneratedIds;
}
