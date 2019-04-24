// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view:
//			NestedScrollingParent

public final class ViewGroupCompat
{
	static class ViewGroupCompatApi18Impl extends ViewGroupCompatBaseImpl
	{

		public int getLayoutMode(ViewGroup viewgroup)
		{
			return viewgroup.getLayoutMode();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method int ViewGroup.getLayoutMode()>
		//    2    4:ireturn         
		}

		public void setLayoutMode(ViewGroup viewgroup, int i)
		{
			viewgroup.setLayoutMode(i);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokevirtual   #27  <Method void ViewGroup.setLayoutMode(int)>
		//    3    5:return          
		}

		ViewGroupCompatApi18Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void ViewGroupCompat$ViewGroupCompatBaseImpl()>
		//    2    4:return          
		}
	}

	static class ViewGroupCompatApi21Impl extends ViewGroupCompatApi18Impl
	{

		public int getNestedScrollAxes(ViewGroup viewgroup)
		{
			return viewgroup.getNestedScrollAxes();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method int ViewGroup.getNestedScrollAxes()>
		//    2    4:ireturn         
		}

		public boolean isTransitionGroup(ViewGroup viewgroup)
		{
			return viewgroup.isTransitionGroup();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #27  <Method boolean ViewGroup.isTransitionGroup()>
		//    2    4:ireturn         
		}

		public void setTransitionGroup(ViewGroup viewgroup, boolean flag)
		{
			viewgroup.setTransitionGroup(flag);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokevirtual   #32  <Method void ViewGroup.setTransitionGroup(boolean)>
		//    3    5:return          
		}

		ViewGroupCompatApi21Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void ViewGroupCompat$ViewGroupCompatApi18Impl()>
		//    2    4:return          
		}
	}

	static class ViewGroupCompatBaseImpl
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
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void setLayoutMode(ViewGroup viewgroup, int i)
		{
		//    0    0:return          
		}

		public void setTransitionGroup(ViewGroup viewgroup, boolean flag)
		{
		//    0    0:return          
		}

		ViewGroupCompatBaseImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	private ViewGroupCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
	//    2    4:return          
	}

	public static int getLayoutMode(ViewGroup viewgroup)
	{
		return IMPL.getLayoutMode(viewgroup);
	//    0    0:getstatic       #32  <Field ViewGroupCompat$ViewGroupCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #40  <Method int ViewGroupCompat$ViewGroupCompatBaseImpl.getLayoutMode(ViewGroup)>
	//    3    7:ireturn         
	}

	public static int getNestedScrollAxes(ViewGroup viewgroup)
	{
		return IMPL.getNestedScrollAxes(viewgroup);
	//    0    0:getstatic       #32  <Field ViewGroupCompat$ViewGroupCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #44  <Method int ViewGroupCompat$ViewGroupCompatBaseImpl.getNestedScrollAxes(ViewGroup)>
	//    3    7:ireturn         
	}

	public static boolean isTransitionGroup(ViewGroup viewgroup)
	{
		return IMPL.isTransitionGroup(viewgroup);
	//    0    0:getstatic       #32  <Field ViewGroupCompat$ViewGroupCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #49  <Method boolean ViewGroupCompat$ViewGroupCompatBaseImpl.isTransitionGroup(ViewGroup)>
	//    3    7:ireturn         
	}

	public static boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
	{
		return viewgroup.onRequestSendAccessibilityEvent(view, accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #57  <Method boolean ViewGroup.onRequestSendAccessibilityEvent(View, AccessibilityEvent)>
	//    4    6:ireturn         
	}

	public static void setLayoutMode(ViewGroup viewgroup, int i)
	{
		IMPL.setLayoutMode(viewgroup, i);
	//    0    0:getstatic       #32  <Field ViewGroupCompat$ViewGroupCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:invokevirtual   #62  <Method void ViewGroupCompat$ViewGroupCompatBaseImpl.setLayoutMode(ViewGroup, int)>
	//    4    8:return          
	}

	public static void setMotionEventSplittingEnabled(ViewGroup viewgroup, boolean flag)
	{
		viewgroup.setMotionEventSplittingEnabled(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #67  <Method void ViewGroup.setMotionEventSplittingEnabled(boolean)>
	//    3    5:return          
	}

	public static void setTransitionGroup(ViewGroup viewgroup, boolean flag)
	{
		IMPL.setTransitionGroup(viewgroup, flag);
	//    0    0:getstatic       #32  <Field ViewGroupCompat$ViewGroupCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:invokevirtual   #70  <Method void ViewGroupCompat$ViewGroupCompatBaseImpl.setTransitionGroup(ViewGroup, boolean)>
	//    4    8:return          
	}

	static final ViewGroupCompatBaseImpl IMPL;
	public static final int LAYOUT_MODE_CLIP_BOUNDS = 0;
	public static final int LAYOUT_MODE_OPTICAL_BOUNDS = 1;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #27  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          19
			IMPL = ((ViewGroupCompatBaseImpl) (new ViewGroupCompatApi21Impl()));
	//    3    8:new             #9   <Class ViewGroupCompat$ViewGroupCompatApi21Impl>
	//    4   11:dup             
	//    5   12:invokespecial   #30  <Method void ViewGroupCompat$ViewGroupCompatApi21Impl()>
	//    6   15:putstatic       #32  <Field ViewGroupCompat$ViewGroupCompatBaseImpl IMPL>
	//    7   18:return          
		else
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   8   19:getstatic       #27  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   22:bipush          18
	//*  10   24:icmplt          38
			IMPL = ((ViewGroupCompatBaseImpl) (new ViewGroupCompatApi18Impl()));
	//   11   27:new             #6   <Class ViewGroupCompat$ViewGroupCompatApi18Impl>
	//   12   30:dup             
	//   13   31:invokespecial   #33  <Method void ViewGroupCompat$ViewGroupCompatApi18Impl()>
	//   14   34:putstatic       #32  <Field ViewGroupCompat$ViewGroupCompatBaseImpl IMPL>
	//   15   37:return          
		else
			IMPL = new ViewGroupCompatBaseImpl();
	//   16   38:new             #12  <Class ViewGroupCompat$ViewGroupCompatBaseImpl>
	//   17   41:dup             
	//   18   42:invokespecial   #34  <Method void ViewGroupCompat$ViewGroupCompatBaseImpl()>
	//   19   45:putstatic       #32  <Field ViewGroupCompat$ViewGroupCompatBaseImpl IMPL>
	//*  20   48:return          
	}
}
