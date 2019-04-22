// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;

// Referenced classes of package android.support.design.widget:
//			CoordinatorLayout

public static class CoordinatorLayout$LayoutParams extends android.view.ViewGroup.MarginLayoutParams
{

	private void resolveAnchorView(View view, CoordinatorLayout coordinatorlayout)
	{
		mAnchorView = coordinatorlayout.findViewById(mAnchorId);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_0         
	//    3    3:getfield        #45  <Field int mAnchorId>
	//    4    6:invokevirtual   #143 <Method View CoordinatorLayout.findViewById(int)>
	//    5    9:putfield        #145 <Field View mAnchorView>
		View view1 = mAnchorView;
	//    6   12:aload_0         
	//    7   13:getfield        #145 <Field View mAnchorView>
	//    8   16:astore          4
		if(view1 != null)
	//*   9   18:aload           4
	//*  10   20:ifnull          135
		{
			if(view1 == coordinatorlayout)
	//*  11   23:aload           4
	//*  12   25:aload_2         
	//*  13   26:if_acmpne       57
				if(coordinatorlayout.isInEditMode())
	//*  14   29:aload_2         
	//*  15   30:invokevirtual   #149 <Method boolean CoordinatorLayout.isInEditMode()>
	//*  16   33:ifeq            47
				{
					mAnchorDirectChild = null;
	//   17   36:aload_0         
	//   18   37:aconst_null     
	//   19   38:putfield        #151 <Field View mAnchorDirectChild>
					mAnchorView = null;
	//   20   41:aload_0         
	//   21   42:aconst_null     
	//   22   43:putfield        #145 <Field View mAnchorView>
					return;
	//   23   46:return          
				} else
				{
					throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
	//   24   47:new             #153 <Class IllegalStateException>
	//   25   50:dup             
	//   26   51:ldc1            #155 <String "View can not be anchored to the the parent CoordinatorLayout">
	//   27   53:invokespecial   #158 <Method void IllegalStateException(String)>
	//   28   56:athrow          
				}
			for(ViewParent viewparent = view1.getParent(); viewparent != coordinatorlayout && viewparent != null; viewparent = viewparent.getParent())
	//*  29   57:aload           4
	//*  30   59:invokevirtual   #164 <Method ViewParent View.getParent()>
	//*  31   62:astore_3        
	//*  32   63:aload_3         
	//*  33   64:aload_2         
	//*  34   65:if_acmpeq       128
	//*  35   68:aload_3         
	//*  36   69:ifnull          128
			{
				if(viewparent == view)
	//*  37   72:aload_3         
	//*  38   73:aload_1         
	//*  39   74:if_acmpne       105
					if(coordinatorlayout.isInEditMode())
	//*  40   77:aload_2         
	//*  41   78:invokevirtual   #149 <Method boolean CoordinatorLayout.isInEditMode()>
	//*  42   81:ifeq            95
					{
						mAnchorDirectChild = null;
	//   43   84:aload_0         
	//   44   85:aconst_null     
	//   45   86:putfield        #151 <Field View mAnchorDirectChild>
						mAnchorView = null;
	//   46   89:aload_0         
	//   47   90:aconst_null     
	//   48   91:putfield        #145 <Field View mAnchorView>
						return;
	//   49   94:return          
					} else
					{
						throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
	//   50   95:new             #153 <Class IllegalStateException>
	//   51   98:dup             
	//   52   99:ldc1            #166 <String "Anchor must not be a descendant of the anchored view">
	//   53  101:invokespecial   #158 <Method void IllegalStateException(String)>
	//   54  104:athrow          
					}
				if(viewparent instanceof View)
	//*  55  105:aload_3         
	//*  56  106:instanceof      #160 <Class View>
	//*  57  109:ifeq            118
					view1 = (View)viewparent;
	//   58  112:aload_3         
	//   59  113:checkcast       #160 <Class View>
	//   60  116:astore          4
			}

	//   61  118:aload_3         
	//   62  119:invokeinterface #169 <Method ViewParent ViewParent.getParent()>
	//   63  124:astore_3        
	//*  64  125:goto            63
			mAnchorDirectChild = view1;
	//   65  128:aload_0         
	//   66  129:aload           4
	//   67  131:putfield        #151 <Field View mAnchorDirectChild>
			return;
	//   68  134:return          
		}
		if(coordinatorlayout.isInEditMode())
	//*  69  135:aload_2         
	//*  70  136:invokevirtual   #149 <Method boolean CoordinatorLayout.isInEditMode()>
	//*  71  139:ifeq            153
		{
			mAnchorDirectChild = null;
	//   72  142:aload_0         
	//   73  143:aconst_null     
	//   74  144:putfield        #151 <Field View mAnchorDirectChild>
			mAnchorView = null;
	//   75  147:aload_0         
	//   76  148:aconst_null     
	//   77  149:putfield        #145 <Field View mAnchorView>
			return;
	//   78  152:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   79  153:new             #171 <Class StringBuilder>
	//   80  156:dup             
	//   81  157:invokespecial   #172 <Method void StringBuilder()>
	//   82  160:astore_3        
			stringbuilder.append("Could not find CoordinatorLayout descendant view with id ");
	//   83  161:aload_3         
	//   84  162:ldc1            #174 <String "Could not find CoordinatorLayout descendant view with id ">
	//   85  164:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//   86  167:pop             
			stringbuilder.append(coordinatorlayout.getResources().getResourceName(mAnchorId));
	//   87  168:aload_3         
	//   88  169:aload_2         
	//   89  170:invokevirtual   #182 <Method Resources CoordinatorLayout.getResources()>
	//   90  173:aload_0         
	//   91  174:getfield        #45  <Field int mAnchorId>
	//   92  177:invokevirtual   #187 <Method String Resources.getResourceName(int)>
	//   93  180:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//   94  183:pop             
			stringbuilder.append(" to anchor view ");
	//   95  184:aload_3         
	//   96  185:ldc1            #189 <String " to anchor view ">
	//   97  187:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//   98  190:pop             
			stringbuilder.append(((Object) (view)));
	//   99  191:aload_3         
	//  100  192:aload_1         
	//  101  193:invokevirtual   #192 <Method StringBuilder StringBuilder.append(Object)>
	//  102  196:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//  103  197:new             #153 <Class IllegalStateException>
	//  104  200:dup             
	//  105  201:aload_3         
	//  106  202:invokevirtual   #196 <Method String StringBuilder.toString()>
	//  107  205:invokespecial   #158 <Method void IllegalStateException(String)>
	//  108  208:athrow          
		}
	}

	private boolean shouldDodge(View view, int i)
	{
		int j = GravityCompat.getAbsoluteGravity(((CoordinatorLayout$LayoutParams)view.getLayoutParams()).insetEdge, i);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #202 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #2   <Class CoordinatorLayout$LayoutParams>
	//    3    7:getfield        #47  <Field int insetEdge>
	//    4   10:iload_2         
	//    5   11:invokestatic    #207 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//    6   14:istore_3        
		return j != 0 && (GravityCompat.getAbsoluteGravity(dodgeInsetEdges, i) & j) == j;
	//    7   15:iload_3         
	//    8   16:ifeq            35
	//    9   19:aload_0         
	//   10   20:getfield        #49  <Field int dodgeInsetEdges>
	//   11   23:iload_2         
	//   12   24:invokestatic    #207 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//   13   27:iload_3         
	//   14   28:iand            
	//   15   29:iload_3         
	//   16   30:icmpne          35
	//   17   33:iconst_1        
	//   18   34:ireturn         
	//   19   35:iconst_0        
	//   20   36:ireturn         
	}

	private boolean verifyAnchorView(View view, CoordinatorLayout coordinatorlayout)
	{
		if(mAnchorView.getId() != mAnchorId)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field View mAnchorView>
	//*   2    4:invokevirtual   #213 <Method int View.getId()>
	//*   3    7:aload_0         
	//*   4    8:getfield        #45  <Field int mAnchorId>
	//*   5   11:icmpeq          16
			return false;
	//    6   14:iconst_0        
	//    7   15:ireturn         
		View view1 = mAnchorView;
	//    8   16:aload_0         
	//    9   17:getfield        #145 <Field View mAnchorView>
	//   10   20:astore          4
		for(ViewParent viewparent = view1.getParent(); viewparent != coordinatorlayout;)
	//*  11   22:aload           4
	//*  12   24:invokevirtual   #164 <Method ViewParent View.getParent()>
	//*  13   27:astore_3        
	//*  14   28:aload_3         
	//*  15   29:aload_2         
	//*  16   30:if_acmpeq       80
			if(viewparent != null && viewparent != view)
	//*  17   33:aload_3         
	//*  18   34:ifnull          68
	//*  19   37:aload_3         
	//*  20   38:aload_1         
	//*  21   39:if_acmpne       45
	//*  22   42:goto            68
			{
				if(viewparent instanceof View)
	//*  23   45:aload_3         
	//*  24   46:instanceof      #160 <Class View>
	//*  25   49:ifeq            58
					view1 = (View)viewparent;
	//   26   52:aload_3         
	//   27   53:checkcast       #160 <Class View>
	//   28   56:astore          4
				viewparent = viewparent.getParent();
	//   29   58:aload_3         
	//   30   59:invokeinterface #169 <Method ViewParent ViewParent.getParent()>
	//   31   64:astore_3        
			} else
	//*  32   65:goto            28
			{
				mAnchorDirectChild = null;
	//   33   68:aload_0         
	//   34   69:aconst_null     
	//   35   70:putfield        #151 <Field View mAnchorDirectChild>
				mAnchorView = null;
	//   36   73:aload_0         
	//   37   74:aconst_null     
	//   38   75:putfield        #145 <Field View mAnchorView>
				return false;
	//   39   78:iconst_0        
	//   40   79:ireturn         
			}

		mAnchorDirectChild = view1;
	//   41   80:aload_0         
	//   42   81:aload           4
	//   43   83:putfield        #151 <Field View mAnchorDirectChild>
		return true;
	//   44   86:iconst_1        
	//   45   87:ireturn         
	}

	boolean checkAnchorChanged()
	{
		return mAnchorView == null && mAnchorId != -1;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field View mAnchorView>
	//    2    4:ifnonnull       17
	//    3    7:aload_0         
	//    4    8:getfield        #45  <Field int mAnchorId>
	//    5   11:iconst_m1       
	//    6   12:icmpeq          17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	boolean dependsOn(CoordinatorLayout coordinatorlayout, View view, View view1)
	{
		if(view1 != mAnchorDirectChild && !shouldDodge(view1, ViewCompat.getLayoutDirection(((View) (coordinatorlayout)))))
	//*   0    0:aload_3         
	//*   1    1:aload_0         
	//*   2    2:getfield        #151 <Field View mAnchorDirectChild>
	//*   3    5:if_acmpeq       47
	//*   4    8:aload_0         
	//*   5    9:aload_3         
	//*   6   10:aload_1         
	//*   7   11:invokestatic    #222 <Method int ViewCompat.getLayoutDirection(View)>
	//*   8   14:invokespecial   #224 <Method boolean shouldDodge(View, int)>
	//*   9   17:ifne            47
		{
			CoordinatorLayout.Behavior behavior = mBehavior;
	//   10   20:aload_0         
	//   11   21:getfield        #121 <Field CoordinatorLayout$Behavior mBehavior>
	//   12   24:astore          4
			if(behavior == null || !behavior.layoutDependsOn(coordinatorlayout, view, view1))
	//*  13   26:aload           4
	//*  14   28:ifnull          45
	//*  15   31:aload           4
	//*  16   33:aload_1         
	//*  17   34:aload_2         
	//*  18   35:aload_3         
	//*  19   36:invokevirtual   #227 <Method boolean CoordinatorLayout$Behavior.layoutDependsOn(CoordinatorLayout, View, View)>
	//*  20   39:ifeq            45
	//*  21   42:goto            47
				return false;
	//   22   45:iconst_0        
	//   23   46:ireturn         
		}
		return true;
	//   24   47:iconst_1        
	//   25   48:ireturn         
	}

	boolean didBlockInteraction()
	{
		if(mBehavior == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field CoordinatorLayout$Behavior mBehavior>
	//*   2    4:ifnonnull       12
			mDidBlockInteraction = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #230 <Field boolean mDidBlockInteraction>
		return mDidBlockInteraction;
	//    6   12:aload_0         
	//    7   13:getfield        #230 <Field boolean mDidBlockInteraction>
	//    8   16:ireturn         
	}

	View findAnchorView(CoordinatorLayout coordinatorlayout, View view)
	{
		if(mAnchorId == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field int mAnchorId>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          20
		{
			mAnchorDirectChild = null;
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:putfield        #151 <Field View mAnchorDirectChild>
			mAnchorView = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #145 <Field View mAnchorView>
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
		}
		if(mAnchorView == null || !verifyAnchorView(view, coordinatorlayout))
	//*  12   20:aload_0         
	//*  13   21:getfield        #145 <Field View mAnchorView>
	//*  14   24:ifnull          36
	//*  15   27:aload_0         
	//*  16   28:aload_2         
	//*  17   29:aload_1         
	//*  18   30:invokespecial   #234 <Method boolean verifyAnchorView(View, CoordinatorLayout)>
	//*  19   33:ifne            42
			resolveAnchorView(view, coordinatorlayout);
	//   20   36:aload_0         
	//   21   37:aload_2         
	//   22   38:aload_1         
	//   23   39:invokespecial   #236 <Method void resolveAnchorView(View, CoordinatorLayout)>
		return mAnchorView;
	//   24   42:aload_0         
	//   25   43:getfield        #145 <Field View mAnchorView>
	//   26   46:areturn         
	}

	public int getAnchorId()
	{
		return mAnchorId;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int mAnchorId>
	//    2    4:ireturn         
	}

	public CoordinatorLayout.Behavior getBehavior()
	{
		return mBehavior;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field CoordinatorLayout$Behavior mBehavior>
	//    2    4:areturn         
	}

	boolean getChangedAfterNestedScroll()
	{
		return mDidChangeAfterNestedScroll;
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field boolean mDidChangeAfterNestedScroll>
	//    2    4:ireturn         
	}

	Rect getLastChildRect()
	{
		return mLastChildRect;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Rect mLastChildRect>
	//    2    4:areturn         
	}

	boolean isBlockingInteractionBelow(CoordinatorLayout coordinatorlayout, View view)
	{
		boolean flag1 = mDidBlockInteraction;
	//    0    0:aload_0         
	//    1    1:getfield        #230 <Field boolean mDidBlockInteraction>
	//    2    4:istore          4
		if(flag1)
	//*   3    6:iload           4
	//*   4    8:ifeq            13
			return true;
	//    5   11:iconst_1        
	//    6   12:ireturn         
		CoordinatorLayout.Behavior behavior = mBehavior;
	//    7   13:aload_0         
	//    8   14:getfield        #121 <Field CoordinatorLayout$Behavior mBehavior>
	//    9   17:astore          5
		boolean flag;
		if(behavior != null)
	//*  10   19:aload           5
	//*  11   21:ifnull          35
			flag = behavior.blocksInteractionBelow(coordinatorlayout, view);
	//   12   24:aload           5
	//   13   26:aload_1         
	//   14   27:aload_2         
	//   15   28:invokevirtual   #251 <Method boolean CoordinatorLayout$Behavior.blocksInteractionBelow(CoordinatorLayout, View)>
	//   16   31:istore_3        
		else
	//*  17   32:goto            37
			flag = false;
	//   18   35:iconst_0        
	//   19   36:istore_3        
		flag |= flag1;
	//   20   37:iload_3         
	//   21   38:iload           4
	//   22   40:ior             
	//   23   41:istore_3        
		mDidBlockInteraction = flag;
	//   24   42:aload_0         
	//   25   43:iload_3         
	//   26   44:putfield        #230 <Field boolean mDidBlockInteraction>
		return flag;
	//   27   47:iload_3         
	//   28   48:ireturn         
	}

	boolean isNestedScrollAccepted(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 1: default 24
	//	               0 31
	//	               1 26
		default:
			return false;
	//    2   24:iconst_0        
	//    3   25:ireturn         

		case 1: // '\001'
			return mDidAcceptNestedScrollNonTouch;
	//    4   26:aload_0         
	//    5   27:getfield        #254 <Field boolean mDidAcceptNestedScrollNonTouch>
	//    6   30:ireturn         

		case 0: // '\0'
			return mDidAcceptNestedScrollTouch;
	//    7   31:aload_0         
	//    8   32:getfield        #256 <Field boolean mDidAcceptNestedScrollTouch>
	//    9   35:ireturn         
		}
	}

	void resetChangedAfterNestedScroll()
	{
		mDidChangeAfterNestedScroll = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #244 <Field boolean mDidChangeAfterNestedScroll>
	//    3    5:return          
	}

	void resetNestedScroll(int i)
	{
		setNestedScrollAccepted(i, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #263 <Method void setNestedScrollAccepted(int, boolean)>
	//    4    6:return          
	}

	void resetTouchBehaviorTracking()
	{
		mDidBlockInteraction = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #230 <Field boolean mDidBlockInteraction>
	//    3    5:return          
	}

	public void setBehavior(CoordinatorLayout.Behavior behavior)
	{
		CoordinatorLayout.Behavior behavior1 = mBehavior;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field CoordinatorLayout$Behavior mBehavior>
	//    2    4:astore_2        
		if(behavior1 != behavior)
	//*   3    5:aload_2         
	//*   4    6:aload_1         
	//*   5    7:if_acmpeq       42
		{
			if(behavior1 != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          18
				behavior1.onDetachedFromLayoutParams();
	//    8   14:aload_2         
	//    9   15:invokevirtual   #269 <Method void CoordinatorLayout$Behavior.onDetachedFromLayoutParams()>
			mBehavior = behavior;
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:putfield        #121 <Field CoordinatorLayout$Behavior mBehavior>
			mBehaviorTag = null;
	//   13   23:aload_0         
	//   14   24:aconst_null     
	//   15   25:putfield        #271 <Field Object mBehaviorTag>
			mBehaviorResolved = true;
	//   16   28:aload_0         
	//   17   29:iconst_1        
	//   18   30:putfield        #37  <Field boolean mBehaviorResolved>
			if(behavior != null)
	//*  19   33:aload_1         
	//*  20   34:ifnull          42
				behavior.onAttachedToLayoutParams(this);
	//   21   37:aload_1         
	//   22   38:aload_0         
	//   23   39:invokevirtual   #130 <Method void CoordinatorLayout$Behavior.onAttachedToLayoutParams(CoordinatorLayout$LayoutParams)>
		}
	//   24   42:return          
	}

	void setChangedAfterNestedScroll(boolean flag)
	{
		mDidChangeAfterNestedScroll = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #244 <Field boolean mDidChangeAfterNestedScroll>
	//    3    5:return          
	}

	void setLastChildRect(Rect rect)
	{
		mLastChildRect.set(rect);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Rect mLastChildRect>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #278 <Method void Rect.set(Rect)>
	//    4    8:return          
	}

	void setNestedScrollAccepted(int i, boolean flag)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 1: default 24
	//	               0 31
	//	               1 25
		default:
			return;
	//    2   24:return          

		case 1: // '\001'
			mDidAcceptNestedScrollNonTouch = flag;
	//    3   25:aload_0         
	//    4   26:iload_2         
	//    5   27:putfield        #254 <Field boolean mDidAcceptNestedScrollNonTouch>
			return;
	//    6   30:return          

		case 0: // '\0'
			mDidAcceptNestedScrollTouch = flag;
	//    7   31:aload_0         
	//    8   32:iload_2         
	//    9   33:putfield        #256 <Field boolean mDidAcceptNestedScrollTouch>
			return;
	//   10   36:return          
		}
	}

	public int anchorGravity;
	public int dodgeInsetEdges;
	public int gravity;
	public int insetEdge;
	public int keyline;
	View mAnchorDirectChild;
	int mAnchorId;
	View mAnchorView;
	CoordinatorLayout.Behavior mBehavior;
	boolean mBehaviorResolved;
	Object mBehaviorTag;
	private boolean mDidAcceptNestedScrollNonTouch;
	private boolean mDidAcceptNestedScrollTouch;
	private boolean mDidBlockInteraction;
	private boolean mDidChangeAfterNestedScroll;
	int mInsetOffsetX;
	int mInsetOffsetY;
	final Rect mLastChildRect;

	public CoordinatorLayout$LayoutParams(int i, int j)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #35  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
		mBehaviorResolved = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #37  <Field boolean mBehaviorResolved>
		gravity = 0;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #39  <Field int gravity>
		anchorGravity = 0;
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:putfield        #41  <Field int anchorGravity>
		keyline = -1;
	//   13   21:aload_0         
	//   14   22:iconst_m1       
	//   15   23:putfield        #43  <Field int keyline>
		mAnchorId = -1;
	//   16   26:aload_0         
	//   17   27:iconst_m1       
	//   18   28:putfield        #45  <Field int mAnchorId>
		insetEdge = 0;
	//   19   31:aload_0         
	//   20   32:iconst_0        
	//   21   33:putfield        #47  <Field int insetEdge>
		dodgeInsetEdges = 0;
	//   22   36:aload_0         
	//   23   37:iconst_0        
	//   24   38:putfield        #49  <Field int dodgeInsetEdges>
		mLastChildRect = new Rect();
	//   25   41:aload_0         
	//   26   42:new             #51  <Class Rect>
	//   27   45:dup             
	//   28   46:invokespecial   #54  <Method void Rect()>
	//   29   49:putfield        #56  <Field Rect mLastChildRect>
	//   30   52:return          
	}

	CoordinatorLayout$LayoutParams(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #62  <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
		mBehaviorResolved = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #37  <Field boolean mBehaviorResolved>
		gravity = 0;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #39  <Field int gravity>
		anchorGravity = 0;
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:putfield        #41  <Field int anchorGravity>
		keyline = -1;
	//   13   21:aload_0         
	//   14   22:iconst_m1       
	//   15   23:putfield        #43  <Field int keyline>
		mAnchorId = -1;
	//   16   26:aload_0         
	//   17   27:iconst_m1       
	//   18   28:putfield        #45  <Field int mAnchorId>
		insetEdge = 0;
	//   19   31:aload_0         
	//   20   32:iconst_0        
	//   21   33:putfield        #47  <Field int insetEdge>
		dodgeInsetEdges = 0;
	//   22   36:aload_0         
	//   23   37:iconst_0        
	//   24   38:putfield        #49  <Field int dodgeInsetEdges>
		mLastChildRect = new Rect();
	//   25   41:aload_0         
	//   26   42:new             #51  <Class Rect>
	//   27   45:dup             
	//   28   46:invokespecial   #54  <Method void Rect()>
	//   29   49:putfield        #56  <Field Rect mLastChildRect>
		TypedArray typedarray = context.obtainStyledAttributes(attributeset, android.support.coordinatorlayout.R.styleable.CoordinatorLayout_Layout);
	//   30   52:aload_1         
	//   31   53:aload_2         
	//   32   54:getstatic       #68  <Field int[] android.support.coordinatorlayout.R$styleable.CoordinatorLayout_Layout>
	//   33   57:invokevirtual   #74  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   34   60:astore_3        
		gravity = typedarray.getInteger(android.support.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_android_layout_gravity, 0);
	//   35   61:aload_0         
	//   36   62:aload_3         
	//   37   63:getstatic       #77  <Field int android.support.coordinatorlayout.R$styleable.CoordinatorLayout_Layout_android_layout_gravity>
	//   38   66:iconst_0        
	//   39   67:invokevirtual   #83  <Method int TypedArray.getInteger(int, int)>
	//   40   70:putfield        #39  <Field int gravity>
		mAnchorId = typedarray.getResourceId(android.support.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_anchor, -1);
	//   41   73:aload_0         
	//   42   74:aload_3         
	//   43   75:getstatic       #86  <Field int android.support.coordinatorlayout.R$styleable.CoordinatorLayout_Layout_layout_anchor>
	//   44   78:iconst_m1       
	//   45   79:invokevirtual   #89  <Method int TypedArray.getResourceId(int, int)>
	//   46   82:putfield        #45  <Field int mAnchorId>
		anchorGravity = typedarray.getInteger(android.support.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_anchorGravity, 0);
	//   47   85:aload_0         
	//   48   86:aload_3         
	//   49   87:getstatic       #92  <Field int android.support.coordinatorlayout.R$styleable.CoordinatorLayout_Layout_layout_anchorGravity>
	//   50   90:iconst_0        
	//   51   91:invokevirtual   #83  <Method int TypedArray.getInteger(int, int)>
	//   52   94:putfield        #41  <Field int anchorGravity>
		keyline = typedarray.getInteger(android.support.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_keyline, -1);
	//   53   97:aload_0         
	//   54   98:aload_3         
	//   55   99:getstatic       #95  <Field int android.support.coordinatorlayout.R$styleable.CoordinatorLayout_Layout_layout_keyline>
	//   56  102:iconst_m1       
	//   57  103:invokevirtual   #83  <Method int TypedArray.getInteger(int, int)>
	//   58  106:putfield        #43  <Field int keyline>
		insetEdge = typedarray.getInt(android.support.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_insetEdge, 0);
	//   59  109:aload_0         
	//   60  110:aload_3         
	//   61  111:getstatic       #98  <Field int android.support.coordinatorlayout.R$styleable.CoordinatorLayout_Layout_layout_insetEdge>
	//   62  114:iconst_0        
	//   63  115:invokevirtual   #101 <Method int TypedArray.getInt(int, int)>
	//   64  118:putfield        #47  <Field int insetEdge>
		dodgeInsetEdges = typedarray.getInt(android.support.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
	//   65  121:aload_0         
	//   66  122:aload_3         
	//   67  123:getstatic       #104 <Field int android.support.coordinatorlayout.R$styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges>
	//   68  126:iconst_0        
	//   69  127:invokevirtual   #101 <Method int TypedArray.getInt(int, int)>
	//   70  130:putfield        #49  <Field int dodgeInsetEdges>
		mBehaviorResolved = typedarray.hasValue(android.support.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_behavior);
	//   71  133:aload_0         
	//   72  134:aload_3         
	//   73  135:getstatic       #107 <Field int android.support.coordinatorlayout.R$styleable.CoordinatorLayout_Layout_layout_behavior>
	//   74  138:invokevirtual   #111 <Method boolean TypedArray.hasValue(int)>
	//   75  141:putfield        #37  <Field boolean mBehaviorResolved>
		if(mBehaviorResolved)
	//*  76  144:aload_0         
	//*  77  145:getfield        #37  <Field boolean mBehaviorResolved>
	//*  78  148:ifeq            167
			mBehavior = CoordinatorLayout.parseBehavior(context, attributeset, typedarray.getString(android.support.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_behavior));
	//   79  151:aload_0         
	//   80  152:aload_1         
	//   81  153:aload_2         
	//   82  154:aload_3         
	//   83  155:getstatic       #107 <Field int android.support.coordinatorlayout.R$styleable.CoordinatorLayout_Layout_layout_behavior>
	//   84  158:invokevirtual   #115 <Method String TypedArray.getString(int)>
	//   85  161:invokestatic    #119 <Method CoordinatorLayout$Behavior CoordinatorLayout.parseBehavior(Context, AttributeSet, String)>
	//   86  164:putfield        #121 <Field CoordinatorLayout$Behavior mBehavior>
		typedarray.recycle();
	//   87  167:aload_3         
	//   88  168:invokevirtual   #124 <Method void TypedArray.recycle()>
		context = ((Context) (mBehavior));
	//   89  171:aload_0         
	//   90  172:getfield        #121 <Field CoordinatorLayout$Behavior mBehavior>
	//   91  175:astore_1        
		if(context != null)
	//*  92  176:aload_1         
	//*  93  177:ifnull          185
			((CoordinatorLayout.Behavior) (context)).onAttachedToLayoutParams(this);
	//   94  180:aload_1         
	//   95  181:aload_0         
	//   96  182:invokevirtual   #130 <Method void CoordinatorLayout$Behavior.onAttachedToLayoutParams(CoordinatorLayout$LayoutParams)>
	//   97  185:return          
	}

	public CoordinatorLayout$LayoutParams(CoordinatorLayout$LayoutParams coordinatorlayout$layoutparams)
	{
		super(((android.view.ViewGroup.MarginLayoutParams) (coordinatorlayout$layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #134 <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
		mBehaviorResolved = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #37  <Field boolean mBehaviorResolved>
		gravity = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #39  <Field int gravity>
		anchorGravity = 0;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #41  <Field int anchorGravity>
		keyline = -1;
	//   12   20:aload_0         
	//   13   21:iconst_m1       
	//   14   22:putfield        #43  <Field int keyline>
		mAnchorId = -1;
	//   15   25:aload_0         
	//   16   26:iconst_m1       
	//   17   27:putfield        #45  <Field int mAnchorId>
		insetEdge = 0;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #47  <Field int insetEdge>
		dodgeInsetEdges = 0;
	//   21   35:aload_0         
	//   22   36:iconst_0        
	//   23   37:putfield        #49  <Field int dodgeInsetEdges>
		mLastChildRect = new Rect();
	//   24   40:aload_0         
	//   25   41:new             #51  <Class Rect>
	//   26   44:dup             
	//   27   45:invokespecial   #54  <Method void Rect()>
	//   28   48:putfield        #56  <Field Rect mLastChildRect>
	//   29   51:return          
	}

	public CoordinatorLayout$LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		super(layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #137 <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$LayoutParams)>
		mBehaviorResolved = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #37  <Field boolean mBehaviorResolved>
		gravity = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #39  <Field int gravity>
		anchorGravity = 0;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #41  <Field int anchorGravity>
		keyline = -1;
	//   12   20:aload_0         
	//   13   21:iconst_m1       
	//   14   22:putfield        #43  <Field int keyline>
		mAnchorId = -1;
	//   15   25:aload_0         
	//   16   26:iconst_m1       
	//   17   27:putfield        #45  <Field int mAnchorId>
		insetEdge = 0;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #47  <Field int insetEdge>
		dodgeInsetEdges = 0;
	//   21   35:aload_0         
	//   22   36:iconst_0        
	//   23   37:putfield        #49  <Field int dodgeInsetEdges>
		mLastChildRect = new Rect();
	//   24   40:aload_0         
	//   25   41:new             #51  <Class Rect>
	//   26   44:dup             
	//   27   45:invokespecial   #54  <Method void Rect()>
	//   28   48:putfield        #56  <Field Rect mLastChildRect>
	//   29   51:return          
	}

	public CoordinatorLayout$LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
	{
		super(marginlayoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #134 <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
		mBehaviorResolved = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #37  <Field boolean mBehaviorResolved>
		gravity = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #39  <Field int gravity>
		anchorGravity = 0;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #41  <Field int anchorGravity>
		keyline = -1;
	//   12   20:aload_0         
	//   13   21:iconst_m1       
	//   14   22:putfield        #43  <Field int keyline>
		mAnchorId = -1;
	//   15   25:aload_0         
	//   16   26:iconst_m1       
	//   17   27:putfield        #45  <Field int mAnchorId>
		insetEdge = 0;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #47  <Field int insetEdge>
		dodgeInsetEdges = 0;
	//   21   35:aload_0         
	//   22   36:iconst_0        
	//   23   37:putfield        #49  <Field int dodgeInsetEdges>
		mLastChildRect = new Rect();
	//   24   40:aload_0         
	//   25   41:new             #51  <Class Rect>
	//   26   44:dup             
	//   27   45:invokespecial   #54  <Method void Rect()>
	//   28   48:putfield        #56  <Field Rect mLastChildRect>
	//   29   51:return          
	}
}
