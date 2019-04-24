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
	//    4    6:invokevirtual   #140 <Method View CoordinatorLayout.findViewById(int)>
	//    5    9:putfield        #142 <Field View mAnchorView>
		if(mAnchorView != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #142 <Field View mAnchorView>
	//*   8   16:ifnull          141
		{
			if(mAnchorView == coordinatorlayout)
	//*   9   19:aload_0         
	//*  10   20:getfield        #142 <Field View mAnchorView>
	//*  11   23:aload_2         
	//*  12   24:if_acmpne       55
				if(coordinatorlayout.isInEditMode())
	//*  13   27:aload_2         
	//*  14   28:invokevirtual   #146 <Method boolean CoordinatorLayout.isInEditMode()>
	//*  15   31:ifeq            45
				{
					mAnchorDirectChild = null;
	//   16   34:aload_0         
	//   17   35:aconst_null     
	//   18   36:putfield        #148 <Field View mAnchorDirectChild>
					mAnchorView = null;
	//   19   39:aload_0         
	//   20   40:aconst_null     
	//   21   41:putfield        #142 <Field View mAnchorView>
					return;
	//   22   44:return          
				} else
				{
					throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
	//   23   45:new             #150 <Class IllegalStateException>
	//   24   48:dup             
	//   25   49:ldc1            #152 <String "View can not be anchored to the the parent CoordinatorLayout">
	//   26   51:invokespecial   #155 <Method void IllegalStateException(String)>
	//   27   54:athrow          
				}
			View view1 = mAnchorView;
	//   28   55:aload_0         
	//   29   56:getfield        #142 <Field View mAnchorView>
	//   30   59:astore          4
			for(ViewParent viewparent = mAnchorView.getParent(); viewparent != coordinatorlayout && viewparent != null; viewparent = viewparent.getParent())
	//*  31   61:aload_0         
	//*  32   62:getfield        #142 <Field View mAnchorView>
	//*  33   65:invokevirtual   #161 <Method ViewParent View.getParent()>
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
	//*  44   84:invokevirtual   #146 <Method boolean CoordinatorLayout.isInEditMode()>
	//*  45   87:ifeq            101
					{
						mAnchorDirectChild = null;
	//   46   90:aload_0         
	//   47   91:aconst_null     
	//   48   92:putfield        #148 <Field View mAnchorDirectChild>
						mAnchorView = null;
	//   49   95:aload_0         
	//   50   96:aconst_null     
	//   51   97:putfield        #142 <Field View mAnchorView>
						return;
	//   52  100:return          
					} else
					{
						throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
	//   53  101:new             #150 <Class IllegalStateException>
	//   54  104:dup             
	//   55  105:ldc1            #163 <String "Anchor must not be a descendant of the anchored view">
	//   56  107:invokespecial   #155 <Method void IllegalStateException(String)>
	//   57  110:athrow          
					}
				if(viewparent instanceof View)
	//*  58  111:aload_3         
	//*  59  112:instanceof      #157 <Class View>
	//*  60  115:ifeq            124
					view1 = (View)viewparent;
	//   61  118:aload_3         
	//   62  119:checkcast       #157 <Class View>
	//   63  122:astore          4
			}

	//   64  124:aload_3         
	//   65  125:invokeinterface #166 <Method ViewParent ViewParent.getParent()>
	//   66  130:astore_3        
	//*  67  131:goto            69
			mAnchorDirectChild = view1;
	//   68  134:aload_0         
	//   69  135:aload           4
	//   70  137:putfield        #148 <Field View mAnchorDirectChild>
			return;
	//   71  140:return          
		}
		if(coordinatorlayout.isInEditMode())
	//*  72  141:aload_2         
	//*  73  142:invokevirtual   #146 <Method boolean CoordinatorLayout.isInEditMode()>
	//*  74  145:ifeq            159
		{
			mAnchorDirectChild = null;
	//   75  148:aload_0         
	//   76  149:aconst_null     
	//   77  150:putfield        #148 <Field View mAnchorDirectChild>
			mAnchorView = null;
	//   78  153:aload_0         
	//   79  154:aconst_null     
	//   80  155:putfield        #142 <Field View mAnchorView>
			return;
	//   81  158:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   82  159:new             #168 <Class StringBuilder>
	//   83  162:dup             
	//   84  163:invokespecial   #169 <Method void StringBuilder()>
	//   85  166:astore_3        
			stringbuilder.append("Could not find CoordinatorLayout descendant view with id ");
	//   86  167:aload_3         
	//   87  168:ldc1            #171 <String "Could not find CoordinatorLayout descendant view with id ">
	//   88  170:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   89  173:pop             
			stringbuilder.append(coordinatorlayout.getResources().getResourceName(mAnchorId));
	//   90  174:aload_3         
	//   91  175:aload_2         
	//   92  176:invokevirtual   #179 <Method Resources CoordinatorLayout.getResources()>
	//   93  179:aload_0         
	//   94  180:getfield        #45  <Field int mAnchorId>
	//   95  183:invokevirtual   #184 <Method String Resources.getResourceName(int)>
	//   96  186:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   97  189:pop             
			stringbuilder.append(" to anchor view ");
	//   98  190:aload_3         
	//   99  191:ldc1            #186 <String " to anchor view ">
	//  100  193:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//  101  196:pop             
			stringbuilder.append(((Object) (view)));
	//  102  197:aload_3         
	//  103  198:aload_1         
	//  104  199:invokevirtual   #189 <Method StringBuilder StringBuilder.append(Object)>
	//  105  202:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//  106  203:new             #150 <Class IllegalStateException>
	//  107  206:dup             
	//  108  207:aload_3         
	//  109  208:invokevirtual   #193 <Method String StringBuilder.toString()>
	//  110  211:invokespecial   #155 <Method void IllegalStateException(String)>
	//  111  214:athrow          
		}
	}

	private boolean shouldDodge(View view, int i)
	{
		int j = GravityCompat.getAbsoluteGravity(((CoordinatorLayout$LayoutParams)view.getLayoutParams()).insetEdge, i);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #199 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #2   <Class CoordinatorLayout$LayoutParams>
	//    3    7:getfield        #47  <Field int insetEdge>
	//    4   10:iload_2         
	//    5   11:invokestatic    #204 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//    6   14:istore_3        
		return j != 0 && (GravityCompat.getAbsoluteGravity(dodgeInsetEdges, i) & j) == j;
	//    7   15:iload_3         
	//    8   16:ifeq            35
	//    9   19:aload_0         
	//   10   20:getfield        #49  <Field int dodgeInsetEdges>
	//   11   23:iload_2         
	//   12   24:invokestatic    #204 <Method int GravityCompat.getAbsoluteGravity(int, int)>
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
	//*   1    1:getfield        #142 <Field View mAnchorView>
	//*   2    4:invokevirtual   #210 <Method int View.getId()>
	//*   3    7:aload_0         
	//*   4    8:getfield        #45  <Field int mAnchorId>
	//*   5   11:icmpeq          16
			return false;
	//    6   14:iconst_0        
	//    7   15:ireturn         
		View view1 = mAnchorView;
	//    8   16:aload_0         
	//    9   17:getfield        #142 <Field View mAnchorView>
	//   10   20:astore          4
		for(ViewParent viewparent = mAnchorView.getParent(); viewparent != coordinatorlayout;)
	//*  11   22:aload_0         
	//*  12   23:getfield        #142 <Field View mAnchorView>
	//*  13   26:invokevirtual   #161 <Method ViewParent View.getParent()>
	//*  14   29:astore_3        
	//*  15   30:aload_3         
	//*  16   31:aload_2         
	//*  17   32:if_acmpeq       82
			if(viewparent != null && viewparent != view)
	//*  18   35:aload_3         
	//*  19   36:ifnull          70
	//*  20   39:aload_3         
	//*  21   40:aload_1         
	//*  22   41:if_acmpne       47
	//*  23   44:goto            70
			{
				if(viewparent instanceof View)
	//*  24   47:aload_3         
	//*  25   48:instanceof      #157 <Class View>
	//*  26   51:ifeq            60
					view1 = (View)viewparent;
	//   27   54:aload_3         
	//   28   55:checkcast       #157 <Class View>
	//   29   58:astore          4
				viewparent = viewparent.getParent();
	//   30   60:aload_3         
	//   31   61:invokeinterface #166 <Method ViewParent ViewParent.getParent()>
	//   32   66:astore_3        
			} else
	//*  33   67:goto            30
			{
				mAnchorDirectChild = null;
	//   34   70:aload_0         
	//   35   71:aconst_null     
	//   36   72:putfield        #148 <Field View mAnchorDirectChild>
				mAnchorView = null;
	//   37   75:aload_0         
	//   38   76:aconst_null     
	//   39   77:putfield        #142 <Field View mAnchorView>
				return false;
	//   40   80:iconst_0        
	//   41   81:ireturn         
			}

		mAnchorDirectChild = view1;
	//   42   82:aload_0         
	//   43   83:aload           4
	//   44   85:putfield        #148 <Field View mAnchorDirectChild>
		return true;
	//   45   88:iconst_1        
	//   46   89:ireturn         
	}

	boolean checkAnchorChanged()
	{
		return mAnchorView == null && mAnchorId != -1;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field View mAnchorView>
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
		return view1 == mAnchorDirectChild || shouldDodge(view1, ViewCompat.getLayoutDirection(((View) (coordinatorlayout)))) || mBehavior != null && mBehavior.layoutDependsOn(coordinatorlayout, view, view1);
	//    0    0:aload_3         
	//    1    1:aload_0         
	//    2    2:getfield        #148 <Field View mAnchorDirectChild>
	//    3    5:if_acmpeq       45
	//    4    8:aload_0         
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:invokestatic    #219 <Method int ViewCompat.getLayoutDirection(View)>
	//    8   14:invokespecial   #221 <Method boolean shouldDodge(View, int)>
	//    9   17:ifne            45
	//   10   20:aload_0         
	//   11   21:getfield        #119 <Field CoordinatorLayout$Behavior mBehavior>
	//   12   24:ifnull          43
	//   13   27:aload_0         
	//   14   28:getfield        #119 <Field CoordinatorLayout$Behavior mBehavior>
	//   15   31:aload_1         
	//   16   32:aload_2         
	//   17   33:aload_3         
	//   18   34:invokevirtual   #224 <Method boolean CoordinatorLayout$Behavior.layoutDependsOn(CoordinatorLayout, View, View)>
	//   19   37:ifeq            43
	//   20   40:goto            45
	//   21   43:iconst_0        
	//   22   44:ireturn         
	//   23   45:iconst_1        
	//   24   46:ireturn         
	}

	boolean didBlockInteraction()
	{
		if(mBehavior == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #119 <Field CoordinatorLayout$Behavior mBehavior>
	//*   2    4:ifnonnull       12
			mDidBlockInteraction = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #227 <Field boolean mDidBlockInteraction>
		return mDidBlockInteraction;
	//    6   12:aload_0         
	//    7   13:getfield        #227 <Field boolean mDidBlockInteraction>
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
	//    6   10:putfield        #148 <Field View mAnchorDirectChild>
			mAnchorView = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #142 <Field View mAnchorView>
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
		}
		if(mAnchorView == null || !verifyAnchorView(view, coordinatorlayout))
	//*  12   20:aload_0         
	//*  13   21:getfield        #142 <Field View mAnchorView>
	//*  14   24:ifnull          36
	//*  15   27:aload_0         
	//*  16   28:aload_2         
	//*  17   29:aload_1         
	//*  18   30:invokespecial   #231 <Method boolean verifyAnchorView(View, CoordinatorLayout)>
	//*  19   33:ifne            42
			resolveAnchorView(view, coordinatorlayout);
	//   20   36:aload_0         
	//   21   37:aload_2         
	//   22   38:aload_1         
	//   23   39:invokespecial   #233 <Method void resolveAnchorView(View, CoordinatorLayout)>
		return mAnchorView;
	//   24   42:aload_0         
	//   25   43:getfield        #142 <Field View mAnchorView>
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
	//    1    1:getfield        #119 <Field CoordinatorLayout$Behavior mBehavior>
	//    2    4:areturn         
	}

	boolean getChangedAfterNestedScroll()
	{
		return mDidChangeAfterNestedScroll;
	//    0    0:aload_0         
	//    1    1:getfield        #242 <Field boolean mDidChangeAfterNestedScroll>
	//    2    4:ireturn         
	}

	Rect getLastChildRect()
	{
		return mLastChildRect;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Rect mLastChildRect>
	//    2    4:areturn         
	}

	void invalidateAnchor()
	{
		mAnchorDirectChild = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #148 <Field View mAnchorDirectChild>
		mAnchorView = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #142 <Field View mAnchorView>
	//    6   10:return          
	}

	boolean isBlockingInteractionBelow(CoordinatorLayout coordinatorlayout, View view)
	{
		if(mDidBlockInteraction)
	//*   0    0:aload_0         
	//*   1    1:getfield        #227 <Field boolean mDidBlockInteraction>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		boolean flag1 = mDidBlockInteraction;
	//    5    9:aload_0         
	//    6   10:getfield        #227 <Field boolean mDidBlockInteraction>
	//    7   13:istore          4
		boolean flag;
		if(mBehavior != null)
	//*   8   15:aload_0         
	//*   9   16:getfield        #119 <Field CoordinatorLayout$Behavior mBehavior>
	//*  10   19:ifnull          35
			flag = mBehavior.blocksInteractionBelow(coordinatorlayout, view);
	//   11   22:aload_0         
	//   12   23:getfield        #119 <Field CoordinatorLayout$Behavior mBehavior>
	//   13   26:aload_1         
	//   14   27:aload_2         
	//   15   28:invokevirtual   #250 <Method boolean CoordinatorLayout$Behavior.blocksInteractionBelow(CoordinatorLayout, View)>
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
	//   26   44:putfield        #227 <Field boolean mDidBlockInteraction>
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
	//    5   27:getfield        #253 <Field boolean mDidAcceptNestedScrollNonTouch>
	//    6   30:ireturn         

		case 0: // '\0'
			return mDidAcceptNestedScrollTouch;
	//    7   31:aload_0         
	//    8   32:getfield        #255 <Field boolean mDidAcceptNestedScrollTouch>
	//    9   35:ireturn         
		}
	}

	void resetChangedAfterNestedScroll()
	{
		mDidChangeAfterNestedScroll = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #242 <Field boolean mDidChangeAfterNestedScroll>
	//    3    5:return          
	}

	void resetNestedScroll(int i)
	{
		setNestedScrollAccepted(i, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #262 <Method void setNestedScrollAccepted(int, boolean)>
	//    4    6:return          
	}

	void resetTouchBehaviorTracking()
	{
		mDidBlockInteraction = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #227 <Field boolean mDidBlockInteraction>
	//    3    5:return          
	}

	public void setAnchorId(int i)
	{
		invalidateAnchor();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #266 <Method void invalidateAnchor()>
		mAnchorId = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #45  <Field int mAnchorId>
	//    5    9:return          
	}

	public void setBehavior(CoordinatorLayout.Behavior behavior)
	{
		if(mBehavior != behavior)
	//*   0    0:aload_0         
	//*   1    1:getfield        #119 <Field CoordinatorLayout$Behavior mBehavior>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       46
		{
			if(mBehavior != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #119 <Field CoordinatorLayout$Behavior mBehavior>
	//*   6   12:ifnull          22
				mBehavior.onDetachedFromLayoutParams();
	//    7   15:aload_0         
	//    8   16:getfield        #119 <Field CoordinatorLayout$Behavior mBehavior>
	//    9   19:invokevirtual   #272 <Method void CoordinatorLayout$Behavior.onDetachedFromLayoutParams()>
			mBehavior = behavior;
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:putfield        #119 <Field CoordinatorLayout$Behavior mBehavior>
			mBehaviorTag = null;
	//   13   27:aload_0         
	//   14   28:aconst_null     
	//   15   29:putfield        #274 <Field Object mBehaviorTag>
			mBehaviorResolved = true;
	//   16   32:aload_0         
	//   17   33:iconst_1        
	//   18   34:putfield        #37  <Field boolean mBehaviorResolved>
			if(behavior != null)
	//*  19   37:aload_1         
	//*  20   38:ifnull          46
				behavior.onAttachedToLayoutParams(this);
	//   21   41:aload_1         
	//   22   42:aload_0         
	//   23   43:invokevirtual   #128 <Method void CoordinatorLayout$Behavior.onAttachedToLayoutParams(CoordinatorLayout$LayoutParams)>
		}
	//   24   46:return          
	}

	void setChangedAfterNestedScroll(boolean flag)
	{
		mDidChangeAfterNestedScroll = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #242 <Field boolean mDidChangeAfterNestedScroll>
	//    3    5:return          
	}

	void setLastChildRect(Rect rect)
	{
		mLastChildRect.set(rect);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Rect mLastChildRect>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #281 <Method void Rect.set(Rect)>
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
	//    5   27:putfield        #253 <Field boolean mDidAcceptNestedScrollNonTouch>
			return;
	//    6   30:return          

		case 0: // '\0'
			mDidAcceptNestedScrollTouch = flag;
	//    7   31:aload_0         
	//    8   32:iload_2         
	//    9   33:putfield        #255 <Field boolean mDidAcceptNestedScrollTouch>
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
	//    3    3:invokespecial   #60  <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
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
		TypedArray typedarray = context.obtainStyledAttributes(attributeset, android.support.coreui.R.styleable.CoordinatorLayout_Layout);
	//   30   52:aload_1         
	//   31   53:aload_2         
	//   32   54:getstatic       #66  <Field int[] android.support.coreui.R$styleable.CoordinatorLayout_Layout>
	//   33   57:invokevirtual   #72  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   34   60:astore_3        
		gravity = typedarray.getInteger(android.support.coreui.R.styleable.CoordinatorLayout_Layout_android_layout_gravity, 0);
	//   35   61:aload_0         
	//   36   62:aload_3         
	//   37   63:getstatic       #75  <Field int android.support.coreui.R$styleable.CoordinatorLayout_Layout_android_layout_gravity>
	//   38   66:iconst_0        
	//   39   67:invokevirtual   #81  <Method int TypedArray.getInteger(int, int)>
	//   40   70:putfield        #39  <Field int gravity>
		mAnchorId = typedarray.getResourceId(android.support.coreui.R.styleable.CoordinatorLayout_Layout_layout_anchor, -1);
	//   41   73:aload_0         
	//   42   74:aload_3         
	//   43   75:getstatic       #84  <Field int android.support.coreui.R$styleable.CoordinatorLayout_Layout_layout_anchor>
	//   44   78:iconst_m1       
	//   45   79:invokevirtual   #87  <Method int TypedArray.getResourceId(int, int)>
	//   46   82:putfield        #45  <Field int mAnchorId>
		anchorGravity = typedarray.getInteger(android.support.coreui.R.styleable.CoordinatorLayout_Layout_layout_anchorGravity, 0);
	//   47   85:aload_0         
	//   48   86:aload_3         
	//   49   87:getstatic       #90  <Field int android.support.coreui.R$styleable.CoordinatorLayout_Layout_layout_anchorGravity>
	//   50   90:iconst_0        
	//   51   91:invokevirtual   #81  <Method int TypedArray.getInteger(int, int)>
	//   52   94:putfield        #41  <Field int anchorGravity>
		keyline = typedarray.getInteger(android.support.coreui.R.styleable.CoordinatorLayout_Layout_layout_keyline, -1);
	//   53   97:aload_0         
	//   54   98:aload_3         
	//   55   99:getstatic       #93  <Field int android.support.coreui.R$styleable.CoordinatorLayout_Layout_layout_keyline>
	//   56  102:iconst_m1       
	//   57  103:invokevirtual   #81  <Method int TypedArray.getInteger(int, int)>
	//   58  106:putfield        #43  <Field int keyline>
		insetEdge = typedarray.getInt(android.support.coreui.R.styleable.CoordinatorLayout_Layout_layout_insetEdge, 0);
	//   59  109:aload_0         
	//   60  110:aload_3         
	//   61  111:getstatic       #96  <Field int android.support.coreui.R$styleable.CoordinatorLayout_Layout_layout_insetEdge>
	//   62  114:iconst_0        
	//   63  115:invokevirtual   #99  <Method int TypedArray.getInt(int, int)>
	//   64  118:putfield        #47  <Field int insetEdge>
		dodgeInsetEdges = typedarray.getInt(android.support.coreui.R.styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
	//   65  121:aload_0         
	//   66  122:aload_3         
	//   67  123:getstatic       #102 <Field int android.support.coreui.R$styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges>
	//   68  126:iconst_0        
	//   69  127:invokevirtual   #99  <Method int TypedArray.getInt(int, int)>
	//   70  130:putfield        #49  <Field int dodgeInsetEdges>
		mBehaviorResolved = typedarray.hasValue(android.support.coreui.R.styleable.CoordinatorLayout_Layout_layout_behavior);
	//   71  133:aload_0         
	//   72  134:aload_3         
	//   73  135:getstatic       #105 <Field int android.support.coreui.R$styleable.CoordinatorLayout_Layout_layout_behavior>
	//   74  138:invokevirtual   #109 <Method boolean TypedArray.hasValue(int)>
	//   75  141:putfield        #37  <Field boolean mBehaviorResolved>
		if(mBehaviorResolved)
	//*  76  144:aload_0         
	//*  77  145:getfield        #37  <Field boolean mBehaviorResolved>
	//*  78  148:ifeq            167
			mBehavior = CoordinatorLayout.parseBehavior(context, attributeset, typedarray.getString(android.support.coreui.R.styleable.CoordinatorLayout_Layout_layout_behavior));
	//   79  151:aload_0         
	//   80  152:aload_1         
	//   81  153:aload_2         
	//   82  154:aload_3         
	//   83  155:getstatic       #105 <Field int android.support.coreui.R$styleable.CoordinatorLayout_Layout_layout_behavior>
	//   84  158:invokevirtual   #113 <Method String TypedArray.getString(int)>
	//   85  161:invokestatic    #117 <Method CoordinatorLayout$Behavior CoordinatorLayout.parseBehavior(Context, AttributeSet, String)>
	//   86  164:putfield        #119 <Field CoordinatorLayout$Behavior mBehavior>
		typedarray.recycle();
	//   87  167:aload_3         
	//   88  168:invokevirtual   #122 <Method void TypedArray.recycle()>
		if(mBehavior != null)
	//*  89  171:aload_0         
	//*  90  172:getfield        #119 <Field CoordinatorLayout$Behavior mBehavior>
	//*  91  175:ifnull          186
			mBehavior.onAttachedToLayoutParams(this);
	//   92  178:aload_0         
	//   93  179:getfield        #119 <Field CoordinatorLayout$Behavior mBehavior>
	//   94  182:aload_0         
	//   95  183:invokevirtual   #128 <Method void CoordinatorLayout$Behavior.onAttachedToLayoutParams(CoordinatorLayout$LayoutParams)>
	//   96  186:return          
	}

	public CoordinatorLayout$LayoutParams(CoordinatorLayout$LayoutParams coordinatorlayout$layoutparams)
	{
		super(((android.view.ViewGroup.MarginLayoutParams) (coordinatorlayout$layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #131 <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
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
	//    2    2:invokespecial   #134 <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$LayoutParams)>
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
	//    2    2:invokespecial   #131 <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
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
