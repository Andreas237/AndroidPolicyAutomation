// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplV9, AppCompatCallback

class AppCompatDelegateImplV11 extends AppCompatDelegateImplV9
{

	AppCompatDelegateImplV11(Context context, Window window, AppCompatCallback appcompatcallback)
	{
		super(context, window, appcompatcallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #11  <Method void AppCompatDelegateImplV9(Context, Window, AppCompatCallback)>
	//    5    7:return          
	}

	View callActivityOnCreateView(View view, String s, Context context, AttributeSet attributeset)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public boolean hasWindowFeature(int i)
	{
		return super.hasWindowFeature(i) || mWindow.hasFeature(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #18  <Method boolean AppCompatDelegateImplV9.hasWindowFeature(int)>
	//    3    5:ifne            19
	//    4    8:aload_0         
	//    5    9:getfield        #22  <Field Window mWindow>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #27  <Method boolean Window.hasFeature(int)>
	//    8   16:ifeq            21
	//    9   19:iconst_1        
	//   10   20:ireturn         
	//   11   21:iconst_0        
	//   12   22:ireturn         
	}
}
