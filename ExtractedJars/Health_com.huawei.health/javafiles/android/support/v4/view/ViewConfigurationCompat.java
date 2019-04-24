// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.ViewConfiguration;

// Referenced classes of package android.support.v4.view:
//			ViewConfigurationCompatICS

public final class ViewConfigurationCompat
{
	static class BaseViewConfigurationVersionImpl
		implements ViewConfigurationVersionImpl
	{

		public boolean hasPermanentMenuKey(ViewConfiguration viewconfiguration)
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		BaseViewConfigurationVersionImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	static class HoneycombViewConfigurationVersionImpl extends BaseViewConfigurationVersionImpl
	{

		public boolean hasPermanentMenuKey(ViewConfiguration viewconfiguration)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		HoneycombViewConfigurationVersionImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void ViewConfigurationCompat$BaseViewConfigurationVersionImpl()>
		//    2    4:return          
		}
	}

	static class IcsViewConfigurationVersionImpl extends HoneycombViewConfigurationVersionImpl
	{

		public boolean hasPermanentMenuKey(ViewConfiguration viewconfiguration)
		{
			return ViewConfigurationCompatICS.hasPermanentMenuKey(viewconfiguration);
		//    0    0:aload_1         
		//    1    1:invokestatic    #18  <Method boolean ViewConfigurationCompatICS.hasPermanentMenuKey(ViewConfiguration)>
		//    2    4:ireturn         
		}

		IcsViewConfigurationVersionImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void ViewConfigurationCompat$HoneycombViewConfigurationVersionImpl()>
		//    2    4:return          
		}
	}

	static interface ViewConfigurationVersionImpl
	{

		public abstract boolean hasPermanentMenuKey(ViewConfiguration viewconfiguration);
	}


	private ViewConfigurationCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
	//    2    4:return          
	}

	public static int getScaledPagingTouchSlop(ViewConfiguration viewconfiguration)
	{
		return viewconfiguration.getScaledPagingTouchSlop();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #43  <Method int ViewConfiguration.getScaledPagingTouchSlop()>
	//    2    4:ireturn         
	}

	public static boolean hasPermanentMenuKey(ViewConfiguration viewconfiguration)
	{
		return IMPL.hasPermanentMenuKey(viewconfiguration);
	//    0    0:getstatic       #31  <Field ViewConfigurationCompat$ViewConfigurationVersionImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokeinterface #48  <Method boolean ViewConfigurationCompat$ViewConfigurationVersionImpl.hasPermanentMenuKey(ViewConfiguration)>
	//    3    9:ireturn         
	}

	static final ViewConfigurationVersionImpl IMPL;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*   0    0:getstatic       #26  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          14
	//*   2    5:icmplt          19
			IMPL = ((ViewConfigurationVersionImpl) (new IcsViewConfigurationVersionImpl()));
	//    3    8:new             #12  <Class ViewConfigurationCompat$IcsViewConfigurationVersionImpl>
	//    4   11:dup             
	//    5   12:invokespecial   #29  <Method void ViewConfigurationCompat$IcsViewConfigurationVersionImpl()>
	//    6   15:putstatic       #31  <Field ViewConfigurationCompat$ViewConfigurationVersionImpl IMPL>
	//    7   18:return          
		else
		if(android.os.Build.VERSION.SDK_INT >= 11)
	//*   8   19:getstatic       #26  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   22:bipush          11
	//*  10   24:icmplt          38
			IMPL = ((ViewConfigurationVersionImpl) (new HoneycombViewConfigurationVersionImpl()));
	//   11   27:new             #9   <Class ViewConfigurationCompat$HoneycombViewConfigurationVersionImpl>
	//   12   30:dup             
	//   13   31:invokespecial   #32  <Method void ViewConfigurationCompat$HoneycombViewConfigurationVersionImpl()>
	//   14   34:putstatic       #31  <Field ViewConfigurationCompat$ViewConfigurationVersionImpl IMPL>
	//   15   37:return          
		else
			IMPL = ((ViewConfigurationVersionImpl) (new BaseViewConfigurationVersionImpl()));
	//   16   38:new             #6   <Class ViewConfigurationCompat$BaseViewConfigurationVersionImpl>
	//   17   41:dup             
	//   18   42:invokespecial   #33  <Method void ViewConfigurationCompat$BaseViewConfigurationVersionImpl()>
	//   19   45:putstatic       #31  <Field ViewConfigurationCompat$ViewConfigurationVersionImpl IMPL>
	//*  20   48:return          
	}
}
