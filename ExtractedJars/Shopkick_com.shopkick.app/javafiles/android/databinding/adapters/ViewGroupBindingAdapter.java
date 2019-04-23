// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

public class ViewGroupBindingAdapter
{
	public static interface OnAnimationEnd
	{

		public abstract void onAnimationEnd(Animation animation);
	}

	public static interface OnAnimationRepeat
	{

		public abstract void onAnimationRepeat(Animation animation);
	}

	public static interface OnAnimationStart
	{

		public abstract void onAnimationStart(Animation animation);
	}

	public static interface OnChildViewAdded
	{

		public abstract void onChildViewAdded(View view, View view1);
	}

	public static interface OnChildViewRemoved
	{

		public abstract void onChildViewRemoved(View view, View view1);
	}


	public ViewGroupBindingAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
	//    2    4:return          
	}

	public static void setAnimateLayoutChanges(ViewGroup viewgroup, boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            16
		{
			viewgroup.setLayoutTransition(new LayoutTransition());
	//    2    4:aload_0         
	//    3    5:new             #52  <Class LayoutTransition>
	//    4    8:dup             
	//    5    9:invokespecial   #53  <Method void LayoutTransition()>
	//    6   12:invokevirtual   #59  <Method void ViewGroup.setLayoutTransition(LayoutTransition)>
			return;
	//    7   15:return          
		} else
		{
			viewgroup.setLayoutTransition(((LayoutTransition) (null)));
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:invokevirtual   #59  <Method void ViewGroup.setLayoutTransition(LayoutTransition)>
			return;
	//   11   21:return          
		}
	}

	public static void setListener(ViewGroup viewgroup, OnAnimationStart onanimationstart, OnAnimationEnd onanimationend, OnAnimationRepeat onanimationrepeat)
	{
		if(onanimationstart == null && onanimationend == null && onanimationrepeat == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       18
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       18
	//*   4    8:aload_3         
	//*   5    9:ifnonnull       18
		{
			viewgroup.setLayoutAnimationListener(((android.view.animation.Animation.AnimationListener) (null)));
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:invokevirtual   #71  <Method void ViewGroup.setLayoutAnimationListener(android.view.animation.Animation$AnimationListener)>
			return;
	//    9   17:return          
		} else
		{
			viewgroup.setLayoutAnimationListener(new android.view.animation.Animation.AnimationListener(onanimationstart, onanimationend, onanimationrepeat) {

				public void onAnimationEnd(Animation animation)
				{
					OnAnimationEnd onanimationend1 = end;
				//    0    0:aload_0         
				//    1    1:getfield        #23  <Field ViewGroupBindingAdapter$OnAnimationEnd val$end>
				//    2    4:astore_2        
					if(onanimationend1 != null)
				//*   3    5:aload_2         
				//*   4    6:ifnull          16
						onanimationend1.onAnimationEnd(animation);
				//    5    9:aload_2         
				//    6   10:aload_1         
				//    7   11:invokeinterface #35  <Method void ViewGroupBindingAdapter$OnAnimationEnd.onAnimationEnd(Animation)>
				//    8   16:return          
				}

				public void onAnimationRepeat(Animation animation)
				{
					OnAnimationRepeat onanimationrepeat1 = repeat;
				//    0    0:aload_0         
				//    1    1:getfield        #25  <Field ViewGroupBindingAdapter$OnAnimationRepeat val$repeat>
				//    2    4:astore_2        
					if(onanimationrepeat1 != null)
				//*   3    5:aload_2         
				//*   4    6:ifnull          16
						onanimationrepeat1.onAnimationRepeat(animation);
				//    5    9:aload_2         
				//    6   10:aload_1         
				//    7   11:invokeinterface #40  <Method void ViewGroupBindingAdapter$OnAnimationRepeat.onAnimationRepeat(Animation)>
				//    8   16:return          
				}

				public void onAnimationStart(Animation animation)
				{
					OnAnimationStart onanimationstart1 = start;
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field ViewGroupBindingAdapter$OnAnimationStart val$start>
				//    2    4:astore_2        
					if(onanimationstart1 != null)
				//*   3    5:aload_2         
				//*   4    6:ifnull          16
						onanimationstart1.onAnimationStart(animation);
				//    5    9:aload_2         
				//    6   10:aload_1         
				//    7   11:invokeinterface #45  <Method void ViewGroupBindingAdapter$OnAnimationStart.onAnimationStart(Animation)>
				//    8   16:return          
				}

				final OnAnimationEnd val$end;
				final OnAnimationRepeat val$repeat;
				final OnAnimationStart val$start;

			
			{
				start = onanimationstart;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field ViewGroupBindingAdapter$OnAnimationStart val$start>
				end = onanimationend;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field ViewGroupBindingAdapter$OnAnimationEnd val$end>
				repeat = onanimationrepeat;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field ViewGroupBindingAdapter$OnAnimationRepeat val$repeat>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//   10   18:aload_0         
	//   11   19:new             #8   <Class ViewGroupBindingAdapter$2>
	//   12   22:dup             
	//   13   23:aload_1         
	//   14   24:aload_2         
	//   15   25:aload_3         
	//   16   26:invokespecial   #74  <Method void ViewGroupBindingAdapter$2(ViewGroupBindingAdapter$OnAnimationStart, ViewGroupBindingAdapter$OnAnimationEnd, ViewGroupBindingAdapter$OnAnimationRepeat)>
	//   17   29:invokevirtual   #71  <Method void ViewGroup.setLayoutAnimationListener(android.view.animation.Animation$AnimationListener)>
			return;
	//   18   32:return          
		}
	}

	public static void setListener(ViewGroup viewgroup, OnChildViewAdded onchildviewadded, OnChildViewRemoved onchildviewremoved)
	{
		if(onchildviewadded == null && onchildviewremoved == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       14
		{
			viewgroup.setOnHierarchyChangeListener(((android.view.ViewGroup.OnHierarchyChangeListener) (null)));
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:invokevirtual   #81  <Method void ViewGroup.setOnHierarchyChangeListener(android.view.ViewGroup$OnHierarchyChangeListener)>
			return;
	//    7   13:return          
		} else
		{
			viewgroup.setOnHierarchyChangeListener(new android.view.ViewGroup.OnHierarchyChangeListener(onchildviewadded, onchildviewremoved) {

				public void onChildViewAdded(View view, View view1)
				{
					OnChildViewAdded onchildviewadded1 = added;
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field ViewGroupBindingAdapter$OnChildViewAdded val$added>
				//    2    4:astore_3        
					if(onchildviewadded1 != null)
				//*   3    5:aload_3         
				//*   4    6:ifnull          17
						onchildviewadded1.onChildViewAdded(view, view1);
				//    5    9:aload_3         
				//    6   10:aload_1         
				//    7   11:aload_2         
				//    8   12:invokeinterface #31  <Method void ViewGroupBindingAdapter$OnChildViewAdded.onChildViewAdded(View, View)>
				//    9   17:return          
				}

				public void onChildViewRemoved(View view, View view1)
				{
					OnChildViewRemoved onchildviewremoved1 = removed;
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field ViewGroupBindingAdapter$OnChildViewRemoved val$removed>
				//    2    4:astore_3        
					if(onchildviewremoved1 != null)
				//*   3    5:aload_3         
				//*   4    6:ifnull          17
						onchildviewremoved1.onChildViewRemoved(view, view1);
				//    5    9:aload_3         
				//    6   10:aload_1         
				//    7   11:aload_2         
				//    8   12:invokeinterface #36  <Method void ViewGroupBindingAdapter$OnChildViewRemoved.onChildViewRemoved(View, View)>
				//    9   17:return          
				}

				final OnChildViewAdded val$added;
				final OnChildViewRemoved val$removed;

			
			{
				added = onchildviewadded;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ViewGroupBindingAdapter$OnChildViewAdded val$added>
				removed = onchildviewremoved;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field ViewGroupBindingAdapter$OnChildViewRemoved val$removed>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    8   14:aload_0         
	//    9   15:new             #6   <Class ViewGroupBindingAdapter$1>
	//   10   18:dup             
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:invokespecial   #84  <Method void ViewGroupBindingAdapter$1(ViewGroupBindingAdapter$OnChildViewAdded, ViewGroupBindingAdapter$OnChildViewRemoved)>
	//   14   24:invokevirtual   #81  <Method void ViewGroup.setOnHierarchyChangeListener(android.view.ViewGroup$OnHierarchyChangeListener)>
			return;
	//   15   27:return          
		}
	}
}
