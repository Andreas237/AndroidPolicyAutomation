// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.TintTypedArray;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplBase, ActionBar

private class AppCompatDelegateImplBase$ActionBarDrawableToggleImpl
	implements ActionBarDrawerToggle.Delegate
{

	public Context getActionBarThemedContext()
	{
		return AppCompatDelegateImplBase.this.getActionBarThemedContext();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field AppCompatDelegateImplBase this$0>
	//    2    4:invokevirtual   #23  <Method Context AppCompatDelegateImplBase.getActionBarThemedContext()>
	//    3    7:areturn         
	}

	public Drawable getThemeUpIndicator()
	{
		TintTypedArray tinttypedarray = TintTypedArray.obtainStyledAttributes(getActionBarThemedContext(), ((android.util.AttributeSet) (null)), new int[] {
			android.support.v7.appcompat.R.attr.homeAsUpIndicator
		});
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method Context getActionBarThemedContext()>
	//    2    4:aconst_null     
	//    3    5:iconst_1        
	//    4    6:newarray        int[]
	//    5    8:dup             
	//    6    9:iconst_0        
	//    7   10:getstatic       #32  <Field int android.support.v7.appcompat.R$attr.homeAsUpIndicator>
	//    8   13:iastore         
	//    9   14:invokestatic    #38  <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, android.util.AttributeSet, int[])>
	//   10   17:astore_1        
		Drawable drawable = tinttypedarray.getDrawable(0);
	//   11   18:aload_1         
	//   12   19:iconst_0        
	//   13   20:invokevirtual   #42  <Method Drawable TintTypedArray.getDrawable(int)>
	//   14   23:astore_2        
		tinttypedarray.recycle();
	//   15   24:aload_1         
	//   16   25:invokevirtual   #45  <Method void TintTypedArray.recycle()>
		return drawable;
	//   17   28:aload_2         
	//   18   29:areturn         
	}

	public boolean isNavigationVisible()
	{
		ActionBar actionbar = getSupportActionBar();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field AppCompatDelegateImplBase this$0>
	//    2    4:invokevirtual   #51  <Method ActionBar AppCompatDelegateImplBase.getSupportActionBar()>
	//    3    7:astore_1        
		return actionbar != null && (actionbar.getDisplayOptions() & 4) != 0;
	//    4    8:aload_1         
	//    5    9:ifnull          23
	//    6   12:aload_1         
	//    7   13:invokevirtual   #57  <Method int ActionBar.getDisplayOptions()>
	//    8   16:iconst_4        
	//    9   17:iand            
	//   10   18:ifeq            23
	//   11   21:iconst_1        
	//   12   22:ireturn         
	//   13   23:iconst_0        
	//   14   24:ireturn         
	}

	public void setActionBarDescription(int i)
	{
		ActionBar actionbar = getSupportActionBar();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field AppCompatDelegateImplBase this$0>
	//    2    4:invokevirtual   #51  <Method ActionBar AppCompatDelegateImplBase.getSupportActionBar()>
	//    3    7:astore_2        
		if(actionbar != null)
	//*   4    8:aload_2         
	//*   5    9:ifnull          17
			actionbar.setHomeActionContentDescription(i);
	//    6   12:aload_2         
	//    7   13:iload_1         
	//    8   14:invokevirtual   #62  <Method void ActionBar.setHomeActionContentDescription(int)>
	//    9   17:return          
	}

	public void setActionBarUpIndicator(Drawable drawable, int i)
	{
		ActionBar actionbar = getSupportActionBar();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field AppCompatDelegateImplBase this$0>
	//    2    4:invokevirtual   #51  <Method ActionBar AppCompatDelegateImplBase.getSupportActionBar()>
	//    3    7:astore_3        
		if(actionbar != null)
	//*   4    8:aload_3         
	//*   5    9:ifnull          22
		{
			actionbar.setHomeAsUpIndicator(drawable);
	//    6   12:aload_3         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #68  <Method void ActionBar.setHomeAsUpIndicator(Drawable)>
			actionbar.setHomeActionContentDescription(i);
	//    9   17:aload_3         
	//   10   18:iload_2         
	//   11   19:invokevirtual   #62  <Method void ActionBar.setHomeActionContentDescription(int)>
		}
	//   12   22:return          
	}

	final AppCompatDelegateImplBase this$0;

	AppCompatDelegateImplBase$ActionBarDrawableToggleImpl()
	{
		this$0 = AppCompatDelegateImplBase.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field AppCompatDelegateImplBase this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
