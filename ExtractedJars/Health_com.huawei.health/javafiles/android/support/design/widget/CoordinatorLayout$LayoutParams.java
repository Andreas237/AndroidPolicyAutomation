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
	//    3    3:getfield        #44  <Field int mAnchorId>
	//    4    6:invokevirtual   #139 <Method View CoordinatorLayout.findViewById(int)>
	//    5    9:putfield        #141 <Field View mAnchorView>
		if(mAnchorView != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #141 <Field View mAnchorView>
	//*   8   16:ifnull          141
		{
			if(mAnchorView == coordinatorlayout)
	//*   9   19:aload_0         
	//*  10   20:getfield        #141 <Field View mAnchorView>
	//*  11   23:aload_2         
	//*  12   24:if_acmpne       55
				if(coordinatorlayout.isInEditMode())
	//*  13   27:aload_2         
	//*  14   28:invokevirtual   #145 <Method boolean CoordinatorLayout.isInEditMode()>
	//*  15   31:ifeq            45
				{
					mAnchorDirectChild = null;
	//   16   34:aload_0         
	//   17   35:aconst_null     
	//   18   36:putfield        #147 <Field View mAnchorDirectChild>
					mAnchorView = null;
	//   19   39:aload_0         
	//   20   40:aconst_null     
	//   21   41:putfield        #141 <Field View mAnchorView>
					return;
	//   22   44:return          
				} else
				{
					throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
	//   23   45:new             #149 <Class IllegalStateException>
	//   24   48:dup             
	//   25   49:ldc1            #151 <String "View can not be anchored to the the parent CoordinatorLayout">
	//   26   51:invokespecial   #154 <Method void IllegalStateException(String)>
	//   27   54:athrow          
				}
			View view1 = mAnchorView;
	//   28   55:aload_0         
	//   29   56:getfield        #141 <Field View mAnchorView>
	//   30   59:astore          4
			for(ViewParent viewparent = mAnchorView.getParent(); viewparent != coordinatorlayout && viewparent != null; viewparent = viewparent.getParent())
	//*  31   61:aload_0         
	//*  32   62:getfield        #141 <Field View mAnchorView>
	//*  33   65:invokevirtual   #160 <Method ViewParent View.getParent()>
	//*  34   68:astore_3        
	//*  35   69:aload_3         
	//*  36   70:aload_2         
	//*  37   71:if_acmpeq       134
	//*  38   74:aload_3         
	//*  39   75:ifnull          134
			{
				if(viewparent == view)
	//*  40   78:aload_3         
	//*  41   79:aload_1         
	//*  42   80:if_acmpne       111
					if(coordinatorlayout.isInEditMode())
	//*  43   83:aload_2         
	//*  44   84:invokevirtual   #145 <Method boolean CoordinatorLayout.isInEditMode()>
	//*  45   87:ifeq            101
					{
						mAnchorDirectChild = null;
	//   46   90:aload_0         
	//   47   91:aconst_null     
	//   48   92:putfield        #147 <Field View mAnchorDirectChild>
						mAnchorView = null;
	//   49   95:aload_0         
	//   50   96:aconst_null     
	//   51   97:putfield        #141 <Field View mAnchorView>
						return;
	//   52  100:return          
					} else
					{
						throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
	//   53  101:new             #149 <Class IllegalStateException>
	//   54  104:dup             
	//   55  105:ldc1            #162 <String "Anchor must not be a descendant of the anchored view">
	//   56  107:invokespecial   #154 <Method void IllegalStateException(String)>
	//   57  110:athrow          
					}
				if(viewparent instanceof View)
	//*  58  111:aload_3         
	//*  59  112:instanceof      #156 <Class View>
	//*  60  115:ifeq            124
					view1 = (View)viewparent;
	//   61  118:aload_3         
	//   62  119:checkcast       #156 <Class View>
	//   63  122:astore          4
			}

	//   64  124:aload_3         
	//   65  125:invokeinterface #165 <Method ViewParent ViewParent.getParent()>
	//   66  130:astore_3        
	//*  67  131:goto            69
			mAnchorDirectChild = view1;
	//   68  134:aload_0         
	//   69  135:aload           4
	//   70  137:putfield        #147 <Field View mAnchorDirectChild>
			return;
	//   71  140:return          
		}
		if(coordinatorlayout.isInEditMode())
	//*  72  141:aload_2         
	//*  73  142:invokevirtual   #145 <Method boolean CoordinatorLayout.isInEditMode()>
	//*  74  145:ifeq            159
		{
			mAnchorDirectChild = null;
	//   75  148:aload_0         
	//   76  149:aconst_null     
	//   77  150:putfield        #147 <Field View mAnchorDirectChild>
			mAnchorView = null;
	//   78  153:aload_0         
	//   79  154:aconst_null     
	//   80  155:putfield        #141 <Field View mAnchorView>
			return;
	//   81  158:return          
		} else
		{
			throw new IllegalStateException((new StringBuilder()).append("Could not find CoordinatorLayout descendant view with id ").append(coordinatorlayout.getResources().getResourceName(mAnchorId)).append(" to anchor view ").append(((Object) (view))).toString());
	//   82  159:new             #149 <Class IllegalStateException>
	//   83  162:dup             
	//   84  163:new             #167 <Class StringBuilder>
	//   85  166:dup             
	//   86  167:invokespecial   #168 <Method void StringBuilder()>
	//   87  170:ldc1            #170 <String "Could not find CoordinatorLayout descendant view with id ">
	//   88  172:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   89  175:aload_2         
	//   90  176:invokevirtual   #178 <Method Resources CoordinatorLayout.getResources()>
	//   91  179:aload_0         
	//   92  180:getfield        #44  <Field int mAnchorId>
	//   93  183:invokevirtual   #183 <Method String Resources.getResourceName(int)>
	//   94  186:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   95  189:ldc1            #185 <String " to anchor view ">
	//   96  191:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   97  194:aload_1         
	//   98  195:invokevirtual   #188 <Method StringBuilder StringBuilder.append(Object)>
	//   99  198:invokevirtual   #192 <Method String StringBuilder.toString()>
	//  100  201:invokespecial   #154 <Method void IllegalStateException(String)>
	//  101  204:athrow          
		}
	}

	private boolean shouldDodge(View view, int i)
	{
		int j = GravityCompat.getAbsoluteGravity(((CoordinatorLayout$LayoutParams)view.getLayoutParams()).insetEdge, i);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #198 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #2   <Class CoordinatorLayout$LayoutParams>
	//    3    7:getfield        #46  <Field int insetEdge>
	//    4   10:iload_2         
	//    5   11:invokestatic    #203 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//    6   14:istore_3        
		return j != 0 && (GravityCompat.getAbsoluteGravity(dodgeInsetEdges, i) & j) == j;
	//    7   15:iload_3         
	//    8   16:ifeq            35
	//    9   19:aload_0         
	//   10   20:getfield        #48  <Field int dodgeInsetEdges>
	//   11   23:iload_2         
	//   12   24:invokestatic    #203 <Method int GravityCompat.getAbsoluteGravity(int, int)>
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
	//*   1    1:getfield        #141 <Field View mAnchorView>
	//*   2    4:invokevirtual   #209 <Method int View.getId()>
	//*   3    7:aload_0         
	//*   4    8:getfield        #44  <Field int mAnchorId>
	//*   5   11:icmpeq          16
			return false;
	//    6   14:iconst_0        
	//    7   15:ireturn         
		View view1 = mAnchorView;
	//    8   16:aload_0         
	//    9   17:getfield        #141 <Field View mAnchorView>
	//   10   20:astore          4
		for(ViewParent viewparent = mAnchorView.getParent(); viewparent != coordinatorlayout; viewparent = viewparent.getParent())
	//*  11   22:aload_0         
	//*  12   23:getfield        #141 <Field View mAnchorView>
	//*  13   26:invokevirtual   #160 <Method ViewParent View.getParent()>
	//*  14   29:astore_3        
	//*  15   30:aload_3         
	//*  16   31:aload_2         
	//*  17   32:if_acmpeq       79
		{
			if(viewparent == null || viewparent == view)
	//*  18   35:aload_3         
	//*  19   36:ifnull          44
	//*  20   39:aload_3         
	//*  21   40:aload_1         
	//*  22   41:if_acmpne       56
			{
				mAnchorDirectChild = null;
	//   23   44:aload_0         
	//   24   45:aconst_null     
	//   25   46:putfield        #147 <Field View mAnchorDirectChild>
				mAnchorView = null;
	//   26   49:aload_0         
	//   27   50:aconst_null     
	//   28   51:putfield        #141 <Field View mAnchorView>
				return false;
	//   29   54:iconst_0        
	//   30   55:ireturn         
			}
			if(viewparent instanceof View)
	//*  31   56:aload_3         
	//*  32   57:instanceof      #156 <Class View>
	//*  33   60:ifeq            69
				view1 = (View)viewparent;
	//   34   63:aload_3         
	//   35   64:checkcast       #156 <Class View>
	//   36   67:astore          4
		}

	//   37   69:aload_3         
	//   38   70:invokeinterface #165 <Method ViewParent ViewParent.getParent()>
	//   39   75:astore_3        
	//*  40   76:goto            30
		mAnchorDirectChild = view1;
	//   41   79:aload_0         
	//   42   80:aload           4
	//   43   82:putfield        #147 <Field View mAnchorDirectChild>
		return true;
	//   44   85:iconst_1        
	//   45   86:ireturn         
	}

	void acceptNestedScroll(boolean flag)
	{
		mDidAcceptNestedScroll = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #213 <Field boolean mDidAcceptNestedScroll>
	//    3    5:return          
	}

	boolean checkAnchorChanged()
	{
		return mAnchorView == null && mAnchorId != -1;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field View mAnchorView>
	//    2    4:ifnonnull       17
	//    3    7:aload_0         
	//    4    8:getfield        #44  <Field int mAnchorId>
	//    5   11:iconst_m1       
	//    6   12:icmpeq          17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	boolean dependsOn(CoordinatorLayout coordinatorlayout, View view, View view1)
	{
		return view1 == mAnchorDirectChild || shouldDodge(view1, ViewCompat.getLayoutDirection(((View) (coordinatorlayout)))) || mBehavior != null && mBehavior.layoutDependsOn(coordinatorlayout, view, view1);
	//    0    0:aload_3         
	//    1    1:aload_0         
	//    2    2:getfield        #147 <Field View mAnchorDirectChild>
	//    3    5:if_acmpeq       40
	//    4    8:aload_0         
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:invokestatic    #222 <Method int ViewCompat.getLayoutDirection(View)>
	//    8   14:invokespecial   #224 <Method boolean shouldDodge(View, int)>
	//    9   17:ifne            40
	//   10   20:aload_0         
	//   11   21:getfield        #118 <Field CoordinatorLayout$Behavior mBehavior>
	//   12   24:ifnull          42
	//   13   27:aload_0         
	//   14   28:getfield        #118 <Field CoordinatorLayout$Behavior mBehavior>
	//   15   31:aload_1         
	//   16   32:aload_2         
	//   17   33:aload_3         
	//   18   34:invokevirtual   #227 <Method boolean CoordinatorLayout$Behavior.layoutDependsOn(CoordinatorLayout, View, View)>
	//   19   37:ifeq            42
	//   20   40:iconst_1        
	//   21   41:ireturn         
	//   22   42:iconst_0        
	//   23   43:ireturn         
	}

	boolean didBlockInteraction()
	{
		if(mBehavior == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field CoordinatorLayout$Behavior mBehavior>
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
	//*   1    1:getfield        #44  <Field int mAnchorId>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          20
		{
			mAnchorDirectChild = null;
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:putfield        #147 <Field View mAnchorDirectChild>
			mAnchorView = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #141 <Field View mAnchorView>
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
		}
		if(mAnchorView == null || !verifyAnchorView(view, coordinatorlayout))
	//*  12   20:aload_0         
	//*  13   21:getfield        #141 <Field View mAnchorView>
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
	//   25   43:getfield        #141 <Field View mAnchorView>
	//   26   46:areturn         
	}

	public int getAnchorId()
	{
		return mAnchorId;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int mAnchorId>
	//    2    4:ireturn         
	}

	public CoordinatorLayout.Behavior getBehavior()
	{
		return mBehavior;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field CoordinatorLayout$Behavior mBehavior>
	//    2    4:areturn         
	}

	boolean getChangedAfterNestedScroll()
	{
		return mDidChangeAfterNestedScroll;
	//    0    0:aload_0         
	//    1    1:getfield        #245 <Field boolean mDidChangeAfterNestedScroll>
	//    2    4:ireturn         
	}

	Rect getLastChildRect()
	{
		return mLastChildRect;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Rect mLastChildRect>
	//    2    4:areturn         
	}

	void invalidateAnchor()
	{
		mAnchorDirectChild = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #147 <Field View mAnchorDirectChild>
		mAnchorView = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #141 <Field View mAnchorView>
	//    6   10:return          
	}

	boolean isBlockingInteractionBelow(CoordinatorLayout coordinatorlayout, View view)
	{
		if(mDidBlockInteraction)
	//*   0    0:aload_0         
	//*   1    1:getfield        #230 <Field boolean mDidBlockInteraction>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		boolean flag1 = mDidBlockInteraction;
	//    5    9:aload_0         
	//    6   10:getfield        #230 <Field boolean mDidBlockInteraction>
	//    7   13:istore          4
		boolean flag;
		if(mBehavior != null)
	//*   8   15:aload_0         
	//*   9   16:getfield        #118 <Field CoordinatorLayout$Behavior mBehavior>
	//*  10   19:ifnull          35
			flag = mBehavior.blocksInteractionBelow(coordinatorlayout, view);
	//   11   22:aload_0         
	//   12   23:getfield        #118 <Field CoordinatorLayout$Behavior mBehavior>
	//   13   26:aload_1         
	//   14   27:aload_2         
	//   15   28:invokevirtual   #253 <Method boolean CoordinatorLayout$Behavior.blocksInteractionBelow(CoordinatorLayout, View)>
	//   16   31:istore_3        
		else
	//*  17   32:goto            37
			flag = false;
	//   18   35:iconst_0        
	//   19   36:istore_3        
		flag = flag1 | flag;
	//   20   37:iload           4
	//   21   39:iload_3         
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

	boolean isNestedScrollAccepted()
	{
		return mDidAcceptNestedScroll;
	//    0    0:aload_0         
	//    1    1:getfield        #213 <Field boolean mDidAcceptNestedScroll>
	//    2    4:ireturn         
	}

	void resetChangedAfterNestedScroll()
	{
		mDidChangeAfterNestedScroll = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #245 <Field boolean mDidChangeAfterNestedScroll>
	//    3    5:return          
	}

	void resetNestedScroll()
	{
		mDidAcceptNestedScroll = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #213 <Field boolean mDidAcceptNestedScroll>
	//    3    5:return          
	}

	void resetTouchBehaviorTracking()
	{
		mDidBlockInteraction = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #230 <Field boolean mDidBlockInteraction>
	//    3    5:return          
	}

	public void setAnchorId(int i)
	{
		invalidateAnchor();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #261 <Method void invalidateAnchor()>
		mAnchorId = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #44  <Field int mAnchorId>
	//    5    9:return          
	}

	public void setBehavior(CoordinatorLayout.Behavior behavior)
	{
		if(mBehavior != behavior)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field CoordinatorLayout$Behavior mBehavior>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       46
		{
			if(mBehavior != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #118 <Field CoordinatorLayout$Behavior mBehavior>
	//*   6   12:ifnull          22
				mBehavior.onDetachedFromLayoutParams();
	//    7   15:aload_0         
	//    8   16:getfield        #118 <Field CoordinatorLayout$Behavior mBehavior>
	//    9   19:invokevirtual   #267 <Method void CoordinatorLayout$Behavior.onDetachedFromLayoutParams()>
			mBehavior = behavior;
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:putfield        #118 <Field CoordinatorLayout$Behavior mBehavior>
			mBehaviorTag = null;
	//   13   27:aload_0         
	//   14   28:aconst_null     
	//   15   29:putfield        #269 <Field Object mBehaviorTag>
			mBehaviorResolved = true;
	//   16   32:aload_0         
	//   17   33:iconst_1        
	//   18   34:putfield        #36  <Field boolean mBehaviorResolved>
			if(behavior != null)
	//*  19   37:aload_1         
	//*  20   38:ifnull          46
				behavior.onAttachedToLayoutParams(this);
	//   21   41:aload_1         
	//   22   42:aload_0         
	//   23   43:invokevirtual   #127 <Method void CoordinatorLayout$Behavior.onAttachedToLayoutParams(CoordinatorLayout$LayoutParams)>
		}
	//   24   46:return          
	}

	void setChangedAfterNestedScroll(boolean flag)
	{
		mDidChangeAfterNestedScroll = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #245 <Field boolean mDidChangeAfterNestedScroll>
	//    3    5:return          
	}

	void setLastChildRect(Rect rect)
	{
		mLastChildRect.set(rect);
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Rect mLastChildRect>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #275 <Method void Rect.set(Rect)>
	//    4    8:return          
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
	private boolean mDidAcceptNestedScroll;
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
	//    3    3:invokespecial   #34  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
		mBehaviorResolved = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #36  <Field boolean mBehaviorResolved>
		gravity = 0;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #38  <Field int gravity>
		anchorGravity = 0;
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:putfield        #40  <Field int anchorGravity>
		keyline = -1;
	//   13   21:aload_0         
	//   14   22:iconst_m1       
	//   15   23:putfield        #42  <Field int keyline>
		mAnchorId = -1;
	//   16   26:aload_0         
	//   17   27:iconst_m1       
	//   18   28:putfield        #44  <Field int mAnchorId>
		insetEdge = 0;
	//   19   31:aload_0         
	//   20   32:iconst_0        
	//   21   33:putfield        #46  <Field int insetEdge>
		dodgeInsetEdges = 0;
	//   22   36:aload_0         
	//   23   37:iconst_0        
	//   24   38:putfield        #48  <Field int dodgeInsetEdges>
		mLastChildRect = new Rect();
	//   25   41:aload_0         
	//   26   42:new             #50  <Class Rect>
	//   27   45:dup             
	//   28   46:invokespecial   #53  <Method void Rect()>
	//   29   49:putfield        #55  <Field Rect mLastChildRect>
	//   30   52:return          
	}

	CoordinatorLayout$LayoutParams(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #59  <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
		mBehaviorResolved = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #36  <Field boolean mBehaviorResolved>
		gravity = 0;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #38  <Field int gravity>
		anchorGravity = 0;
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:putfield        #40  <Field int anchorGravity>
		keyline = -1;
	//   13   21:aload_0         
	//   14   22:iconst_m1       
	//   15   23:putfield        #42  <Field int keyline>
		mAnchorId = -1;
	//   16   26:aload_0         
	//   17   27:iconst_m1       
	//   18   28:putfield        #44  <Field int mAnchorId>
		insetEdge = 0;
	//   19   31:aload_0         
	//   20   32:iconst_0        
	//   21   33:putfield        #46  <Field int insetEdge>
		dodgeInsetEdges = 0;
	//   22   36:aload_0         
	//   23   37:iconst_0        
	//   24   38:putfield        #48  <Field int dodgeInsetEdges>
		mLastChildRect = new Rect();
	//   25   41:aload_0         
	//   26   42:new             #50  <Class Rect>
	//   27   45:dup             
	//   28   46:invokespecial   #53  <Method void Rect()>
	//   29   49:putfield        #55  <Field Rect mLastChildRect>
		TypedArray typedarray = context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.CoordinatorLayout_Layout);
	//   30   52:aload_1         
	//   31   53:aload_2         
	//   32   54:getstatic       #65  <Field int[] android.support.design.R$styleable.CoordinatorLayout_Layout>
	//   33   57:invokevirtual   #71  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   34   60:astore_3        
		gravity = typedarray.getInteger(android.support.design.R.styleable.CoordinatorLayout_Layout_android_layout_gravity, 0);
	//   35   61:aload_0         
	//   36   62:aload_3         
	//   37   63:getstatic       #74  <Field int android.support.design.R$styleable.CoordinatorLayout_Layout_android_layout_gravity>
	//   38   66:iconst_0        
	//   39   67:invokevirtual   #80  <Method int TypedArray.getInteger(int, int)>
	//   40   70:putfield        #38  <Field int gravity>
		mAnchorId = typedarray.getResourceId(android.support.design.R.styleable.CoordinatorLayout_Layout_layout_anchor, -1);
	//   41   73:aload_0         
	//   42   74:aload_3         
	//   43   75:getstatic       #83  <Field int android.support.design.R$styleable.CoordinatorLayout_Layout_layout_anchor>
	//   44   78:iconst_m1       
	//   45   79:invokevirtual   #86  <Method int TypedArray.getResourceId(int, int)>
	//   46   82:putfield        #44  <Field int mAnchorId>
		anchorGravity = typedarray.getInteger(android.support.design.R.styleable.CoordinatorLayout_Layout_layout_anchorGravity, 0);
	//   47   85:aload_0         
	//   48   86:aload_3         
	//   49   87:getstatic       #89  <Field int android.support.design.R$styleable.CoordinatorLayout_Layout_layout_anchorGravity>
	//   50   90:iconst_0        
	//   51   91:invokevirtual   #80  <Method int TypedArray.getInteger(int, int)>
	//   52   94:putfield        #40  <Field int anchorGravity>
		keyline = typedarray.getInteger(android.support.design.R.styleable.CoordinatorLayout_Layout_layout_keyline, -1);
	//   53   97:aload_0         
	//   54   98:aload_3         
	//   55   99:getstatic       #92  <Field int android.support.design.R$styleable.CoordinatorLayout_Layout_layout_keyline>
	//   56  102:iconst_m1       
	//   57  103:invokevirtual   #80  <Method int TypedArray.getInteger(int, int)>
	//   58  106:putfield        #42  <Field int keyline>
		insetEdge = typedarray.getInt(android.support.design.R.styleable.CoordinatorLayout_Layout_layout_insetEdge, 0);
	//   59  109:aload_0         
	//   60  110:aload_3         
	//   61  111:getstatic       #95  <Field int android.support.design.R$styleable.CoordinatorLayout_Layout_layout_insetEdge>
	//   62  114:iconst_0        
	//   63  115:invokevirtual   #98  <Method int TypedArray.getInt(int, int)>
	//   64  118:putfield        #46  <Field int insetEdge>
		dodgeInsetEdges = typedarray.getInt(android.support.design.R.styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
	//   65  121:aload_0         
	//   66  122:aload_3         
	//   67  123:getstatic       #101 <Field int android.support.design.R$styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges>
	//   68  126:iconst_0        
	//   69  127:invokevirtual   #98  <Method int TypedArray.getInt(int, int)>
	//   70  130:putfield        #48  <Field int dodgeInsetEdges>
		mBehaviorResolved = typedarray.hasValue(android.support.design.R.styleable.CoordinatorLayout_Layout_layout_behavior);
	//   71  133:aload_0         
	//   72  134:aload_3         
	//   73  135:getstatic       #104 <Field int android.support.design.R$styleable.CoordinatorLayout_Layout_layout_behavior>
	//   74  138:invokevirtual   #108 <Method boolean TypedArray.hasValue(int)>
	//   75  141:putfield        #36  <Field boolean mBehaviorResolved>
		if(mBehaviorResolved)
	//*  76  144:aload_0         
	//*  77  145:getfield        #36  <Field boolean mBehaviorResolved>
	//*  78  148:ifeq            167
			mBehavior = CoordinatorLayout.parseBehavior(context, attributeset, typedarray.getString(android.support.design.R.styleable.CoordinatorLayout_Layout_layout_behavior));
	//   79  151:aload_0         
	//   80  152:aload_1         
	//   81  153:aload_2         
	//   82  154:aload_3         
	//   83  155:getstatic       #104 <Field int android.support.design.R$styleable.CoordinatorLayout_Layout_layout_behavior>
	//   84  158:invokevirtual   #112 <Method String TypedArray.getString(int)>
	//   85  161:invokestatic    #116 <Method CoordinatorLayout$Behavior CoordinatorLayout.parseBehavior(Context, AttributeSet, String)>
	//   86  164:putfield        #118 <Field CoordinatorLayout$Behavior mBehavior>
		typedarray.recycle();
	//   87  167:aload_3         
	//   88  168:invokevirtual   #121 <Method void TypedArray.recycle()>
		if(mBehavior != null)
	//*  89  171:aload_0         
	//*  90  172:getfield        #118 <Field CoordinatorLayout$Behavior mBehavior>
	//*  91  175:ifnull          186
			mBehavior.onAttachedToLayoutParams(this);
	//   92  178:aload_0         
	//   93  179:getfield        #118 <Field CoordinatorLayout$Behavior mBehavior>
	//   94  182:aload_0         
	//   95  183:invokevirtual   #127 <Method void CoordinatorLayout$Behavior.onAttachedToLayoutParams(CoordinatorLayout$LayoutParams)>
	//   96  186:return          
	}

	public CoordinatorLayout$LayoutParams(CoordinatorLayout$LayoutParams coordinatorlayout$layoutparams)
	{
		super(((android.view.ViewGroup.MarginLayoutParams) (coordinatorlayout$layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #130 <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
		mBehaviorResolved = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #36  <Field boolean mBehaviorResolved>
		gravity = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #38  <Field int gravity>
		anchorGravity = 0;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #40  <Field int anchorGravity>
		keyline = -1;
	//   12   20:aload_0         
	//   13   21:iconst_m1       
	//   14   22:putfield        #42  <Field int keyline>
		mAnchorId = -1;
	//   15   25:aload_0         
	//   16   26:iconst_m1       
	//   17   27:putfield        #44  <Field int mAnchorId>
		insetEdge = 0;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #46  <Field int insetEdge>
		dodgeInsetEdges = 0;
	//   21   35:aload_0         
	//   22   36:iconst_0        
	//   23   37:putfield        #48  <Field int dodgeInsetEdges>
		mLastChildRect = new Rect();
	//   24   40:aload_0         
	//   25   41:new             #50  <Class Rect>
	//   26   44:dup             
	//   27   45:invokespecial   #53  <Method void Rect()>
	//   28   48:putfield        #55  <Field Rect mLastChildRect>
	//   29   51:return          
	}

	public CoordinatorLayout$LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		super(layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #133 <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$LayoutParams)>
		mBehaviorResolved = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #36  <Field boolean mBehaviorResolved>
		gravity = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #38  <Field int gravity>
		anchorGravity = 0;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #40  <Field int anchorGravity>
		keyline = -1;
	//   12   20:aload_0         
	//   13   21:iconst_m1       
	//   14   22:putfield        #42  <Field int keyline>
		mAnchorId = -1;
	//   15   25:aload_0         
	//   16   26:iconst_m1       
	//   17   27:putfield        #44  <Field int mAnchorId>
		insetEdge = 0;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #46  <Field int insetEdge>
		dodgeInsetEdges = 0;
	//   21   35:aload_0         
	//   22   36:iconst_0        
	//   23   37:putfield        #48  <Field int dodgeInsetEdges>
		mLastChildRect = new Rect();
	//   24   40:aload_0         
	//   25   41:new             #50  <Class Rect>
	//   26   44:dup             
	//   27   45:invokespecial   #53  <Method void Rect()>
	//   28   48:putfield        #55  <Field Rect mLastChildRect>
	//   29   51:return          
	}

	public CoordinatorLayout$LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
	{
		super(marginlayoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #130 <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
		mBehaviorResolved = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #36  <Field boolean mBehaviorResolved>
		gravity = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #38  <Field int gravity>
		anchorGravity = 0;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #40  <Field int anchorGravity>
		keyline = -1;
	//   12   20:aload_0         
	//   13   21:iconst_m1       
	//   14   22:putfield        #42  <Field int keyline>
		mAnchorId = -1;
	//   15   25:aload_0         
	//   16   26:iconst_m1       
	//   17   27:putfield        #44  <Field int mAnchorId>
		insetEdge = 0;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #46  <Field int insetEdge>
		dodgeInsetEdges = 0;
	//   21   35:aload_0         
	//   22   36:iconst_0        
	//   23   37:putfield        #48  <Field int dodgeInsetEdges>
		mLastChildRect = new Rect();
	//   24   40:aload_0         
	//   25   41:new             #50  <Class Rect>
	//   26   44:dup             
	//   27   45:invokespecial   #53  <Method void Rect()>
	//   28   48:putfield        #55  <Field Rect mLastChildRect>
	//   29   51:return          
	}
}
