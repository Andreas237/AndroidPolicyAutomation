// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;


// Referenced classes of package android.support.v4.view:
//			ScaleGestureDetectorCompatKitKat

public final class ScaleGestureDetectorCompat
{
	static class BaseScaleGestureDetectorImpl
		implements ScaleGestureDetectorImpl
	{

		public boolean isQuickScaleEnabled(Object obj)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void setQuickScaleEnabled(Object obj, boolean flag)
		{
		//    0    0:return          
		}

		BaseScaleGestureDetectorImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	static class ScaleGestureDetectorCompatKitKatImpl
		implements ScaleGestureDetectorImpl
	{

		public boolean isQuickScaleEnabled(Object obj)
		{
			return ScaleGestureDetectorCompatKitKat.isQuickScaleEnabled(obj);
		//    0    0:aload_1         
		//    1    1:invokestatic    #20  <Method boolean ScaleGestureDetectorCompatKitKat.isQuickScaleEnabled(Object)>
		//    2    4:ireturn         
		}

		public void setQuickScaleEnabled(Object obj, boolean flag)
		{
			ScaleGestureDetectorCompatKitKat.setQuickScaleEnabled(obj, flag);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokestatic    #24  <Method void ScaleGestureDetectorCompatKitKat.setQuickScaleEnabled(Object, boolean)>
		//    3    5:return          
		}

		ScaleGestureDetectorCompatKitKatImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	static interface ScaleGestureDetectorImpl
	{

		public abstract boolean isQuickScaleEnabled(Object obj);

		public abstract void setQuickScaleEnabled(Object obj, boolean flag);
	}


	private ScaleGestureDetectorCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
	//    2    4:return          
	}

	public static boolean isQuickScaleEnabled(Object obj)
	{
		return IMPL.isQuickScaleEnabled(obj);
	//    0    0:getstatic       #28  <Field ScaleGestureDetectorCompat$ScaleGestureDetectorImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokeinterface #35  <Method boolean ScaleGestureDetectorCompat$ScaleGestureDetectorImpl.isQuickScaleEnabled(Object)>
	//    3    9:ireturn         
	}

	public static void setQuickScaleEnabled(Object obj, boolean flag)
	{
		IMPL.setQuickScaleEnabled(obj, flag);
	//    0    0:getstatic       #28  <Field ScaleGestureDetectorCompat$ScaleGestureDetectorImpl IMPL>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:invokeinterface #39  <Method void ScaleGestureDetectorCompat$ScaleGestureDetectorImpl.setQuickScaleEnabled(Object, boolean)>
	//    4   10:return          
	}

	static final ScaleGestureDetectorImpl IMPL;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #23  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          19
			IMPL = ((ScaleGestureDetectorImpl) (new ScaleGestureDetectorCompatKitKatImpl()));
	//    3    8:new             #9   <Class ScaleGestureDetectorCompat$ScaleGestureDetectorCompatKitKatImpl>
	//    4   11:dup             
	//    5   12:invokespecial   #26  <Method void ScaleGestureDetectorCompat$ScaleGestureDetectorCompatKitKatImpl()>
	//    6   15:putstatic       #28  <Field ScaleGestureDetectorCompat$ScaleGestureDetectorImpl IMPL>
	//    7   18:return          
		else
			IMPL = ((ScaleGestureDetectorImpl) (new BaseScaleGestureDetectorImpl()));
	//    8   19:new             #6   <Class ScaleGestureDetectorCompat$BaseScaleGestureDetectorImpl>
	//    9   22:dup             
	//   10   23:invokespecial   #29  <Method void ScaleGestureDetectorCompat$BaseScaleGestureDetectorImpl()>
	//   11   26:putstatic       #28  <Field ScaleGestureDetectorCompat$ScaleGestureDetectorImpl IMPL>
	//*  12   29:return          
	}
}
