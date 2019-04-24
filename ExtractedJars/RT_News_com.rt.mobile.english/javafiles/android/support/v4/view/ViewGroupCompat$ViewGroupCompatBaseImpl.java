// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.ViewGroup;

// Referenced classes of package android.support.v4.view:
//			ViewGroupCompat, NestedScrollingParent, ViewCompat

static class ViewGroupCompat$ViewGroupCompatBaseImpl
{

	public int getLayoutMode(ViewGroup viewgroup)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getNestedScrollAxes(ViewGroup viewgroup)
	{
		if(viewgroup instanceof NestedScrollingParent)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #17  <Class NestedScrollingParent>
	//*   2    4:ifeq            17
			return ((NestedScrollingParent)viewgroup).getNestedScrollAxes();
	//    3    7:aload_1         
	//    4    8:checkcast       #17  <Class NestedScrollingParent>
	//    5   11:invokeinterface #20  <Method int NestedScrollingParent.getNestedScrollAxes()>
	//    6   16:ireturn         
		else
			return 0;
	//    7   17:iconst_0        
	//    8   18:ireturn         
	}

	public boolean isTransitionGroup(ViewGroup viewgroup)
	{
		Boolean boolean1 = (Boolean)viewgroup.getTag(android.support.compat.R.id.tag_transition_group);
	//    0    0:aload_1         
	//    1    1:getstatic       #28  <Field int android.support.compat.R$id.tag_transition_group>
	//    2    4:invokevirtual   #34  <Method Object ViewGroup.getTag(int)>
	//    3    7:checkcast       #36  <Class Boolean>
	//    4   10:astore_2        
		return boolean1 != null && boolean1.booleanValue() || viewgroup.getBackground() != null || ViewCompat.getTransitionName(((android.view.View) (viewgroup))) != null;
	//    5   11:aload_2         
	//    6   12:ifnull          22
	//    7   15:aload_2         
	//    8   16:invokevirtual   #40  <Method boolean Boolean.booleanValue()>
	//    9   19:ifne            41
	//   10   22:aload_1         
	//   11   23:invokevirtual   #44  <Method android.graphics.drawable.Drawable ViewGroup.getBackground()>
	//   12   26:ifnonnull       41
	//   13   29:aload_1         
	//   14   30:invokestatic    #50  <Method String ViewCompat.getTransitionName(android.view.View)>
	//   15   33:ifnull          39
	//   16   36:goto            41
	//   17   39:iconst_0        
	//   18   40:ireturn         
	//   19   41:iconst_1        
	//   20   42:ireturn         
	}

	public void setLayoutMode(ViewGroup viewgroup, int i)
	{
	//    0    0:return          
	}

	public void setTransitionGroup(ViewGroup viewgroup, boolean flag)
	{
		viewgroup.setTag(android.support.compat.R.id.tag_transition_group, ((Object) (Boolean.valueOf(flag))));
	//    0    0:aload_1         
	//    1    1:getstatic       #28  <Field int android.support.compat.R$id.tag_transition_group>
	//    2    4:iload_2         
	//    3    5:invokestatic    #58  <Method Boolean Boolean.valueOf(boolean)>
	//    4    8:invokevirtual   #62  <Method void ViewGroup.setTag(int, Object)>
	//    5   11:return          
	}

	ViewGroupCompat$ViewGroupCompatBaseImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
