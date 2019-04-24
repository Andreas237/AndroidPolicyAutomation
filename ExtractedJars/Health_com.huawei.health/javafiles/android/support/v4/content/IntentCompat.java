// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;

import android.content.ComponentName;
import android.content.Intent;

public final class IntentCompat
{
	static class IntentCompatApi15Impl extends IntentCompatBaseImpl
	{

		public Intent makeMainSelectorActivity(String s, String s1)
		{
			return Intent.makeMainSelectorActivity(s, s1);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokestatic    #21  <Method Intent Intent.makeMainSelectorActivity(String, String)>
		//    3    5:areturn         
		}

		IntentCompatApi15Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void IntentCompat$IntentCompatBaseImpl()>
		//    2    4:return          
		}
	}

	static class IntentCompatBaseImpl
	{

		public Intent makeMainSelectorActivity(String s, String s1)
		{
			s = ((String) (new Intent(s)));
		//    0    0:new             #16  <Class Intent>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void Intent(String)>
		//    4    8:astore_1        
			((Intent) (s)).addCategory(s1);
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:invokevirtual   #23  <Method Intent Intent.addCategory(String)>
		//    8   14:pop             
			return ((Intent) (s));
		//    9   15:aload_1         
		//   10   16:areturn         
		}

		IntentCompatBaseImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	private IntentCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void Object()>
	//    2    4:return          
	}

	public static Intent makeMainActivity(ComponentName componentname)
	{
		return Intent.makeMainActivity(componentname);
	//    0    0:aload_0         
	//    1    1:invokestatic    #58  <Method Intent Intent.makeMainActivity(ComponentName)>
	//    2    4:areturn         
	}

	public static Intent makeMainSelectorActivity(String s, String s1)
	{
		return IMPL.makeMainSelectorActivity(s, s1);
	//    0    0:getstatic       #49  <Field IntentCompat$IntentCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokevirtual   #63  <Method Intent IntentCompat$IntentCompatBaseImpl.makeMainSelectorActivity(String, String)>
	//    4    8:areturn         
	}

	public static Intent makeRestartActivityTask(ComponentName componentname)
	{
		return Intent.makeRestartActivityTask(componentname);
	//    0    0:aload_0         
	//    1    1:invokestatic    #66  <Method Intent Intent.makeRestartActivityTask(ComponentName)>
	//    2    4:areturn         
	}

	public static final String ACTION_EXTERNAL_APPLICATIONS_AVAILABLE = "android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE";
	public static final String ACTION_EXTERNAL_APPLICATIONS_UNAVAILABLE = "android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE";
	public static final String CATEGORY_LEANBACK_LAUNCHER = "android.intent.category.LEANBACK_LAUNCHER";
	public static final String EXTRA_CHANGED_PACKAGE_LIST = "android.intent.extra.changed_package_list";
	public static final String EXTRA_CHANGED_UID_LIST = "android.intent.extra.changed_uid_list";
	public static final String EXTRA_HTML_TEXT = "android.intent.extra.HTML_TEXT";
	public static final int FLAG_ACTIVITY_CLEAR_TASK = 32768;
	public static final int FLAG_ACTIVITY_TASK_ON_HOME = 16384;
	private static final IntentCompatBaseImpl IMPL;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 15)
	//*   0    0:getstatic       #44  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          15
	//*   2    5:icmplt          19
			IMPL = ((IntentCompatBaseImpl) (new IntentCompatApi15Impl()));
	//    3    8:new             #6   <Class IntentCompat$IntentCompatApi15Impl>
	//    4   11:dup             
	//    5   12:invokespecial   #47  <Method void IntentCompat$IntentCompatApi15Impl()>
	//    6   15:putstatic       #49  <Field IntentCompat$IntentCompatBaseImpl IMPL>
	//    7   18:return          
		else
			IMPL = new IntentCompatBaseImpl();
	//    8   19:new             #9   <Class IntentCompat$IntentCompatBaseImpl>
	//    9   22:dup             
	//   10   23:invokespecial   #50  <Method void IntentCompat$IntentCompatBaseImpl()>
	//   11   26:putstatic       #49  <Field IntentCompat$IntentCompatBaseImpl IMPL>
	//*  12   29:return          
	}
}
