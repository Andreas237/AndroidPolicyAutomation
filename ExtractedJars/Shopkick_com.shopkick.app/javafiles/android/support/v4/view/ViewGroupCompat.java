// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view:
//			NestedScrollingParent, ViewCompat

public final class ViewGroupCompat
{

	private ViewGroupCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public static int getLayoutMode(ViewGroup viewgroup)
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #22  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          13
			return viewgroup.getLayoutMode();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #27  <Method int ViewGroup.getLayoutMode()>
	//    5   12:ireturn         
		else
			return 0;
	//    6   13:iconst_0        
	//    7   14:ireturn         
	}

	public static int getNestedScrollAxes(ViewGroup viewgroup)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #22  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			return viewgroup.getNestedScrollAxes();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #31  <Method int ViewGroup.getNestedScrollAxes()>
	//    5   12:ireturn         
		if(viewgroup instanceof NestedScrollingParent)
	//*   6   13:aload_0         
	//*   7   14:instanceof      #33  <Class NestedScrollingParent>
	//*   8   17:ifeq            30
			return ((NestedScrollingParent)viewgroup).getNestedScrollAxes();
	//    9   20:aload_0         
	//   10   21:checkcast       #33  <Class NestedScrollingParent>
	//   11   24:invokeinterface #34  <Method int NestedScrollingParent.getNestedScrollAxes()>
	//   12   29:ireturn         
		else
			return 0;
	//   13   30:iconst_0        
	//   14   31:ireturn         
	}

	public static boolean isTransitionGroup(ViewGroup viewgroup)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #22  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			return viewgroup.isTransitionGroup();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #39  <Method boolean ViewGroup.isTransitionGroup()>
	//    5   12:ireturn         
		Boolean boolean1 = (Boolean)viewgroup.getTag(android.support.compat.R.id.tag_transition_group);
	//    6   13:aload_0         
	//    7   14:getstatic       #44  <Field int android.support.compat.R$id.tag_transition_group>
	//    8   17:invokevirtual   #48  <Method Object ViewGroup.getTag(int)>
	//    9   20:checkcast       #50  <Class Boolean>
	//   10   23:astore_1        
		return boolean1 != null && boolean1.booleanValue() || viewgroup.getBackground() != null || ViewCompat.getTransitionName(((View) (viewgroup))) != null;
	//   11   24:aload_1         
	//   12   25:ifnull          35
	//   13   28:aload_1         
	//   14   29:invokevirtual   #53  <Method boolean Boolean.booleanValue()>
	//   15   32:ifne            54
	//   16   35:aload_0         
	//   17   36:invokevirtual   #57  <Method android.graphics.drawable.Drawable ViewGroup.getBackground()>
	//   18   39:ifnonnull       54
	//   19   42:aload_0         
	//   20   43:invokestatic    #63  <Method String ViewCompat.getTransitionName(View)>
	//   21   46:ifnull          52
	//   22   49:goto            54
	//   23   52:iconst_0        
	//   24   53:ireturn         
	//   25   54:iconst_1        
	//   26   55:ireturn         
	}

	public static boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
	{
		return viewgroup.onRequestSendAccessibilityEvent(view, accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #69  <Method boolean ViewGroup.onRequestSendAccessibilityEvent(View, AccessibilityEvent)>
	//    4    6:ireturn         
	}

	public static void setLayoutMode(ViewGroup viewgroup, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #22  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          13
			viewgroup.setLayoutMode(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #75  <Method void ViewGroup.setLayoutMode(int)>
	//    6   13:return          
	}

	public static void setMotionEventSplittingEnabled(ViewGroup viewgroup, boolean flag)
	{
		viewgroup.setMotionEventSplittingEnabled(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #80  <Method void ViewGroup.setMotionEventSplittingEnabled(boolean)>
	//    3    5:return          
	}

	public static void setTransitionGroup(ViewGroup viewgroup, boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #22  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          14
		{
			viewgroup.setTransitionGroup(flag);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #83  <Method void ViewGroup.setTransitionGroup(boolean)>
			return;
	//    6   13:return          
		} else
		{
			viewgroup.setTag(android.support.compat.R.id.tag_transition_group, ((Object) (Boolean.valueOf(flag))));
	//    7   14:aload_0         
	//    8   15:getstatic       #44  <Field int android.support.compat.R$id.tag_transition_group>
	//    9   18:iload_1         
	//   10   19:invokestatic    #87  <Method Boolean Boolean.valueOf(boolean)>
	//   11   22:invokevirtual   #91  <Method void ViewGroup.setTag(int, Object)>
			return;
	//   12   25:return          
		}
	}

	public static final int LAYOUT_MODE_CLIP_BOUNDS = 0;
	public static final int LAYOUT_MODE_OPTICAL_BOUNDS = 1;
}
