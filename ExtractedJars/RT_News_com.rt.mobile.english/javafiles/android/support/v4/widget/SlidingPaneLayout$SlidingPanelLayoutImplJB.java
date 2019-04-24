// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v4.widget:
//			SlidingPaneLayout

static class SlidingPaneLayout$SlidingPanelLayoutImplJB extends e
{

	public void invalidateChildRegion(SlidingPaneLayout slidingpanelayout, View view)
	{
		if(mGetDisplayList != null && mRecreateDisplayList != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field Method mGetDisplayList>
	//*   2    4:ifnull          56
	//*   3    7:aload_0         
	//*   4    8:getfield        #53  <Field Field mRecreateDisplayList>
	//*   5   11:ifnull          56
		{
			try
			{
				mRecreateDisplayList.setBoolean(((Object) (view)), true);
	//    6   14:aload_0         
	//    7   15:getfield        #53  <Field Field mRecreateDisplayList>
	//    8   18:aload_2         
	//    9   19:iconst_1        
	//   10   20:invokevirtual   #70  <Method void Field.setBoolean(Object, boolean)>
				mGetDisplayList.invoke(((Object) (view)), (Object[])null);
	//   11   23:aload_0         
	//   12   24:getfield        #36  <Field Method mGetDisplayList>
	//   13   27:aload_2         
	//   14   28:aconst_null     
	//   15   29:checkcast       #72  <Class Object[]>
	//   16   32:invokevirtual   #78  <Method Object Method.invoke(Object, Object[])>
	//   17   35:pop             
			}
	//*  18   36:goto            49
			catch(Exception exception)
	//*  19   39:astore_3        
			{
				Log.e("SlidingPaneLayout", "Error refreshing display list state", ((Throwable) (exception)));
	//   20   40:ldc1            #38  <String "SlidingPaneLayout">
	//   21   42:ldc1            #80  <String "Error refreshing display list state">
	//   22   44:aload_3         
	//   23   45:invokestatic    #46  <Method int Log.e(String, String, Throwable)>
	//   24   48:pop             
			}
			super.invalidateChildRegion(slidingpanelayout, view);
	//   25   49:aload_0         
	//   26   50:aload_1         
	//   27   51:aload_2         
	//   28   52:invokespecial   #82  <Method void SlidingPaneLayout$SlidingPanelLayoutImplBase.invalidateChildRegion(SlidingPaneLayout, View)>
			return;
	//   29   55:return          
		} else
		{
			view.invalidate();
	//   30   56:aload_2         
	//   31   57:invokevirtual   #85  <Method void View.invalidate()>
			return;
	//   32   60:return          
		}
	}

	private Method mGetDisplayList;
	private Field mRecreateDisplayList;

	SlidingPaneLayout$SlidingPanelLayoutImplJB()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void SlidingPaneLayout$SlidingPanelLayoutImplBase()>
		try
		{
			mGetDisplayList = ((Class) (android/view/View)).getDeclaredMethod("getDisplayList", (Class[])null);
	//    2    4:aload_0         
	//    3    5:ldc1            #24  <Class View>
	//    4    7:ldc1            #26  <String "getDisplayList">
	//    5    9:aconst_null     
	//    6   10:checkcast       #28  <Class Class[]>
	//    7   13:invokevirtual   #34  <Method Method Class.getDeclaredMethod(String, Class[])>
	//    8   16:putfield        #36  <Field Method mGetDisplayList>
		}
	//*   9   19:goto            32
		catch(NoSuchMethodException nosuchmethodexception)
	//*  10   22:astore_1        
		{
			Log.e("SlidingPaneLayout", "Couldn't fetch getDisplayList method; dimming won't work right.", ((Throwable) (nosuchmethodexception)));
	//   11   23:ldc1            #38  <String "SlidingPaneLayout">
	//   12   25:ldc1            #40  <String "Couldn't fetch getDisplayList method; dimming won't work right.">
	//   13   27:aload_1         
	//   14   28:invokestatic    #46  <Method int Log.e(String, String, Throwable)>
	//   15   31:pop             
		}
		try
		{
			mRecreateDisplayList = ((Class) (android/view/View)).getDeclaredField("mRecreateDisplayList");
	//   16   32:aload_0         
	//   17   33:ldc1            #24  <Class View>
	//   18   35:ldc1            #47  <String "mRecreateDisplayList">
	//   19   37:invokevirtual   #51  <Method Field Class.getDeclaredField(String)>
	//   20   40:putfield        #53  <Field Field mRecreateDisplayList>
			mRecreateDisplayList.setAccessible(true);
	//   21   43:aload_0         
	//   22   44:getfield        #53  <Field Field mRecreateDisplayList>
	//   23   47:iconst_1        
	//   24   48:invokevirtual   #59  <Method void Field.setAccessible(boolean)>
			return;
	//   25   51:return          
		}
		catch(NoSuchFieldException nosuchfieldexception)
	//*  26   52:astore_1        
		{
			Log.e("SlidingPaneLayout", "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", ((Throwable) (nosuchfieldexception)));
	//   27   53:ldc1            #38  <String "SlidingPaneLayout">
	//   28   55:ldc1            #61  <String "Couldn't fetch mRecreateDisplayList field; dimming will be slow.">
	//   29   57:aload_1         
	//   30   58:invokestatic    #46  <Method int Log.e(String, String, Throwable)>
	//   31   61:pop             
		}
	//   32   62:return          
	}
}
