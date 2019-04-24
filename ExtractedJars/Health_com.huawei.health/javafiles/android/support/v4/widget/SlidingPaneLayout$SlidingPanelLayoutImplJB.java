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
	//*   1    1:getfield        #31  <Field Method mGetDisplayList>
	//*   2    4:ifnull          49
	//*   3    7:aload_0         
	//*   4    8:getfield        #48  <Field Field mRecreateDisplayList>
	//*   5   11:ifnull          49
		{
			try
			{
				mRecreateDisplayList.setBoolean(((Object) (view)), true);
	//    6   14:aload_0         
	//    7   15:getfield        #48  <Field Field mRecreateDisplayList>
	//    8   18:aload_2         
	//    9   19:iconst_1        
	//   10   20:invokevirtual   #65  <Method void Field.setBoolean(Object, boolean)>
				mGetDisplayList.invoke(((Object) (view)), ((Object []) (null)));
	//   11   23:aload_0         
	//   12   24:getfield        #31  <Field Method mGetDisplayList>
	//   13   27:aload_2         
	//   14   28:aconst_null     
	//   15   29:invokevirtual   #71  <Method Object Method.invoke(Object, Object[])>
	//   16   32:pop             
			}
	//*  17   33:goto            54
			catch(Exception exception)
	//*  18   36:astore_3        
			{
				Log.e("SlidingPaneLayout", "Error refreshing display list state", ((Throwable) (exception)));
	//   19   37:ldc1            #33  <String "SlidingPaneLayout">
	//   20   39:ldc1            #73  <String "Error refreshing display list state">
	//   21   41:aload_3         
	//   22   42:invokestatic    #41  <Method int Log.e(String, String, Throwable)>
	//   23   45:pop             
			}
		} else
	//*  24   46:goto            54
		{
			view.invalidate();
	//   25   49:aload_2         
	//   26   50:invokevirtual   #76  <Method void View.invalidate()>
			return;
	//   27   53:return          
		}
		super.invalidateChildRegion(slidingpanelayout, view);
	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:aload_2         
	//   31   57:invokespecial   #78  <Method void SlidingPaneLayout$SlidingPanelLayoutImplBase.invalidateChildRegion(SlidingPaneLayout, View)>
	//   32   60:return          
	}

	private Method mGetDisplayList;
	private Field mRecreateDisplayList;

	SlidingPaneLayout$SlidingPanelLayoutImplJB()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void SlidingPaneLayout$SlidingPanelLayoutImplBase()>
		try
		{
			mGetDisplayList = ((Class) (android/view/View)).getDeclaredMethod("getDisplayList", ((Class []) (null)));
	//    2    4:aload_0         
	//    3    5:ldc1            #21  <Class View>
	//    4    7:ldc1            #23  <String "getDisplayList">
	//    5    9:aconst_null     
	//    6   10:invokevirtual   #29  <Method Method Class.getDeclaredMethod(String, Class[])>
	//    7   13:putfield        #31  <Field Method mGetDisplayList>
		}
	//*   8   16:goto            29
		catch(NoSuchMethodException nosuchmethodexception)
	//*   9   19:astore_1        
		{
			Log.e("SlidingPaneLayout", "Couldn't fetch getDisplayList method; dimming won't work right.", ((Throwable) (nosuchmethodexception)));
	//   10   20:ldc1            #33  <String "SlidingPaneLayout">
	//   11   22:ldc1            #35  <String "Couldn't fetch getDisplayList method; dimming won't work right.">
	//   12   24:aload_1         
	//   13   25:invokestatic    #41  <Method int Log.e(String, String, Throwable)>
	//   14   28:pop             
		}
		try
		{
			mRecreateDisplayList = ((Class) (android/view/View)).getDeclaredField("mRecreateDisplayList");
	//   15   29:aload_0         
	//   16   30:ldc1            #21  <Class View>
	//   17   32:ldc1            #42  <String "mRecreateDisplayList">
	//   18   34:invokevirtual   #46  <Method Field Class.getDeclaredField(String)>
	//   19   37:putfield        #48  <Field Field mRecreateDisplayList>
			mRecreateDisplayList.setAccessible(true);
	//   20   40:aload_0         
	//   21   41:getfield        #48  <Field Field mRecreateDisplayList>
	//   22   44:iconst_1        
	//   23   45:invokevirtual   #54  <Method void Field.setAccessible(boolean)>
			return;
	//   24   48:return          
		}
		catch(NoSuchFieldException nosuchfieldexception)
	//*  25   49:astore_1        
		{
			Log.e("SlidingPaneLayout", "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", ((Throwable) (nosuchfieldexception)));
	//   26   50:ldc1            #33  <String "SlidingPaneLayout">
	//   27   52:ldc1            #56  <String "Couldn't fetch mRecreateDisplayList field; dimming will be slow.">
	//   28   54:aload_1         
	//   29   55:invokestatic    #41  <Method int Log.e(String, String, Throwable)>
	//   30   58:pop             
		}
	//   31   59:return          
	}
}
