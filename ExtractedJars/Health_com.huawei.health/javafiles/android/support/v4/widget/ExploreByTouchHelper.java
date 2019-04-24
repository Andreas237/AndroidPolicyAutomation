// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.util.SparseArrayCompat;
import android.support.v4.view.*;
import android.support.v4.view.accessibility.*;
import android.view.*;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.widget:
//			FocusStrategy

public abstract class ExploreByTouchHelper extends AccessibilityDelegateCompat
{
	class MyNodeProvider extends AccessibilityNodeProviderCompat
	{

		public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i)
		{
			return AccessibilityNodeInfoCompat.obtain(obtainAccessibilityNodeInfo(i));
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field ExploreByTouchHelper this$0>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #22  <Method AccessibilityNodeInfoCompat ExploreByTouchHelper.obtainAccessibilityNodeInfo(int)>
		//    4    8:invokestatic    #28  <Method AccessibilityNodeInfoCompat AccessibilityNodeInfoCompat.obtain(AccessibilityNodeInfoCompat)>
		//    5   11:areturn         
		}

		public AccessibilityNodeInfoCompat findFocus(int i)
		{
			if(i == 2)
		//*   0    0:iload_1         
		//*   1    1:iconst_2        
		//*   2    2:icmpne          16
				i = mAccessibilityFocusedVirtualViewId;
		//    3    5:aload_0         
		//    4    6:getfield        #13  <Field ExploreByTouchHelper this$0>
		//    5    9:invokestatic    #33  <Method int ExploreByTouchHelper.access$000(ExploreByTouchHelper)>
		//    6   12:istore_1        
			else
		//*   7   13:goto            24
				i = mKeyboardFocusedVirtualViewId;
		//    8   16:aload_0         
		//    9   17:getfield        #13  <Field ExploreByTouchHelper this$0>
		//   10   20:invokestatic    #36  <Method int ExploreByTouchHelper.access$100(ExploreByTouchHelper)>
		//   11   23:istore_1        
			if(i == 0x80000000)
		//*  12   24:iload_1         
		//*  13   25:ldc1            #37  <Int 0x80000000>
		//*  14   27:icmpne          32
				return null;
		//   15   30:aconst_null     
		//   16   31:areturn         
			else
				return createAccessibilityNodeInfo(i);
		//   17   32:aload_0         
		//   18   33:iload_1         
		//   19   34:invokevirtual   #39  <Method AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int)>
		//   20   37:areturn         
		}

		public boolean performAction(int i, int j, Bundle bundle)
		{
			return ExploreByTouchHelper.this.performAction(i, j, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field ExploreByTouchHelper this$0>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #43  <Method boolean ExploreByTouchHelper.performAction(int, int, Bundle)>
		//    6   10:ireturn         
		}

		final ExploreByTouchHelper this$0;

		MyNodeProvider()
		{
			this$0 = ExploreByTouchHelper.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field ExploreByTouchHelper this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void AccessibilityNodeProviderCompat()>
		//    5    9:return          
		}
	}


	public ExploreByTouchHelper(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method void AccessibilityDelegateCompat()>
	//    2    4:aload_0         
	//    3    5:new             #46  <Class Rect>
	//    4    8:dup             
	//    5    9:invokespecial   #64  <Method void Rect()>
	//    6   12:putfield        #66  <Field Rect mTempScreenRect>
	//    7   15:aload_0         
	//    8   16:new             #46  <Class Rect>
	//    9   19:dup             
	//   10   20:invokespecial   #64  <Method void Rect()>
	//   11   23:putfield        #68  <Field Rect mTempParentRect>
	//   12   26:aload_0         
	//   13   27:new             #46  <Class Rect>
	//   14   30:dup             
	//   15   31:invokespecial   #64  <Method void Rect()>
	//   16   34:putfield        #70  <Field Rect mTempVisibleRect>
	//   17   37:aload_0         
	//   18   38:iconst_2        
	//   19   39:newarray        int[]
	//   20   41:putfield        #72  <Field int[] mTempGlobalRect>
		mAccessibilityFocusedVirtualViewId = 0x80000000;
	//   21   44:aload_0         
	//   22   45:ldc1            #20  <Int 0x80000000>
	//   23   47:putfield        #74  <Field int mAccessibilityFocusedVirtualViewId>
		mKeyboardFocusedVirtualViewId = 0x80000000;
	//   24   50:aload_0         
	//   25   51:ldc1            #20  <Int 0x80000000>
	//   26   53:putfield        #76  <Field int mKeyboardFocusedVirtualViewId>
		mHoveredVirtualViewId = 0x80000000;
	//   27   56:aload_0         
	//   28   57:ldc1            #20  <Int 0x80000000>
	//   29   59:putfield        #78  <Field int mHoveredVirtualViewId>
		if(view == null)
	//*  30   62:aload_1         
	//*  31   63:ifnonnull       76
			throw new IllegalArgumentException("View may not be null");
	//   32   66:new             #80  <Class IllegalArgumentException>
	//   33   69:dup             
	//   34   70:ldc1            #82  <String "View may not be null">
	//   35   72:invokespecial   #85  <Method void IllegalArgumentException(String)>
	//   36   75:athrow          
		mHost = view;
	//   37   76:aload_0         
	//   38   77:aload_1         
	//   39   78:putfield        #87  <Field View mHost>
		mManager = (AccessibilityManager)view.getContext().getSystemService("accessibility");
	//   40   81:aload_0         
	//   41   82:aload_1         
	//   42   83:invokevirtual   #93  <Method Context View.getContext()>
	//   43   86:ldc1            #95  <String "accessibility">
	//   44   88:invokevirtual   #101 <Method Object Context.getSystemService(String)>
	//   45   91:checkcast       #103 <Class AccessibilityManager>
	//   46   94:putfield        #105 <Field AccessibilityManager mManager>
		view.setFocusable(true);
	//   47   97:aload_1         
	//   48   98:iconst_1        
	//   49   99:invokevirtual   #109 <Method void View.setFocusable(boolean)>
		if(ViewCompat.getImportantForAccessibility(view) == 0)
	//*  50  102:aload_1         
	//*  51  103:invokestatic    #115 <Method int ViewCompat.getImportantForAccessibility(View)>
	//*  52  106:ifne            114
			ViewCompat.setImportantForAccessibility(view, 1);
	//   53  109:aload_1         
	//   54  110:iconst_1        
	//   55  111:invokestatic    #119 <Method void ViewCompat.setImportantForAccessibility(View, int)>
	//   56  114:return          
	}

	private boolean clearAccessibilityFocus(int i)
	{
		if(mAccessibilityFocusedVirtualViewId == i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field int mAccessibilityFocusedVirtualViewId>
	//*   2    4:iload_1         
	//*   3    5:icmpne          31
		{
			mAccessibilityFocusedVirtualViewId = 0x80000000;
	//    4    8:aload_0         
	//    5    9:ldc1            #20  <Int 0x80000000>
	//    6   11:putfield        #74  <Field int mAccessibilityFocusedVirtualViewId>
			mHost.invalidate();
	//    7   14:aload_0         
	//    8   15:getfield        #87  <Field View mHost>
	//    9   18:invokevirtual   #127 <Method void View.invalidate()>
			sendEventForVirtualView(i, 0x10000);
	//   10   21:aload_0         
	//   11   22:iload_1         
	//   12   23:ldc1            #128 <Int 0x10000>
	//   13   25:invokevirtual   #132 <Method boolean sendEventForVirtualView(int, int)>
	//   14   28:pop             
			return true;
	//   15   29:iconst_1        
	//   16   30:ireturn         
		} else
		{
			return false;
	//   17   31:iconst_0        
	//   18   32:ireturn         
		}
	}

	private boolean clickKeyboardFocusedVirtualView()
	{
		return mKeyboardFocusedVirtualViewId != 0x80000000 && onPerformActionForVirtualView(mKeyboardFocusedVirtualViewId, 16, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field int mKeyboardFocusedVirtualViewId>
	//    2    4:ldc1            #20  <Int 0x80000000>
	//    3    6:icmpeq          25
	//    4    9:aload_0         
	//    5   10:aload_0         
	//    6   11:getfield        #76  <Field int mKeyboardFocusedVirtualViewId>
	//    7   14:bipush          16
	//    8   16:aconst_null     
	//    9   17:invokevirtual   #138 <Method boolean onPerformActionForVirtualView(int, int, Bundle)>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	private AccessibilityEvent createEvent(int i, int j)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    1: default 20
	//	               -1: 23
	//*   2   20:goto            29
		case -1: 
			return createEventForHost(j);
	//    3   23:aload_0         
	//    4   24:iload_2         
	//    5   25:invokespecial   #144 <Method AccessibilityEvent createEventForHost(int)>
	//    6   28:areturn         
		}
		return createEventForChild(i, j);
	//    7   29:aload_0         
	//    8   30:iload_1         
	//    9   31:iload_2         
	//   10   32:invokespecial   #147 <Method AccessibilityEvent createEventForChild(int, int)>
	//   11   35:areturn         
	}

	private AccessibilityEvent createEventForChild(int i, int j)
	{
		AccessibilityEvent accessibilityevent = AccessibilityEvent.obtain(j);
	//    0    0:iload_2         
	//    1    1:invokestatic    #152 <Method AccessibilityEvent AccessibilityEvent.obtain(int)>
	//    2    4:astore_3        
		AccessibilityRecordCompat accessibilityrecordcompat = AccessibilityEventCompat.asRecord(accessibilityevent);
	//    3    5:aload_3         
	//    4    6:invokestatic    #158 <Method AccessibilityRecordCompat AccessibilityEventCompat.asRecord(AccessibilityEvent)>
	//    5    9:astore          4
		AccessibilityNodeInfoCompat accessibilitynodeinfocompat = obtainAccessibilityNodeInfo(i);
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:invokevirtual   #162 <Method AccessibilityNodeInfoCompat obtainAccessibilityNodeInfo(int)>
	//    9   16:astore          5
		accessibilityrecordcompat.getText().add(((Object) (accessibilitynodeinfocompat.getText())));
	//   10   18:aload           4
	//   11   20:invokevirtual   #168 <Method List AccessibilityRecordCompat.getText()>
	//   12   23:aload           5
	//   13   25:invokevirtual   #173 <Method CharSequence AccessibilityNodeInfoCompat.getText()>
	//   14   28:invokeinterface #179 <Method boolean List.add(Object)>
	//   15   33:pop             
		accessibilityrecordcompat.setContentDescription(accessibilitynodeinfocompat.getContentDescription());
	//   16   34:aload           4
	//   17   36:aload           5
	//   18   38:invokevirtual   #182 <Method CharSequence AccessibilityNodeInfoCompat.getContentDescription()>
	//   19   41:invokevirtual   #186 <Method void AccessibilityRecordCompat.setContentDescription(CharSequence)>
		accessibilityrecordcompat.setScrollable(accessibilitynodeinfocompat.isScrollable());
	//   20   44:aload           4
	//   21   46:aload           5
	//   22   48:invokevirtual   #189 <Method boolean AccessibilityNodeInfoCompat.isScrollable()>
	//   23   51:invokevirtual   #192 <Method void AccessibilityRecordCompat.setScrollable(boolean)>
		accessibilityrecordcompat.setPassword(accessibilitynodeinfocompat.isPassword());
	//   24   54:aload           4
	//   25   56:aload           5
	//   26   58:invokevirtual   #195 <Method boolean AccessibilityNodeInfoCompat.isPassword()>
	//   27   61:invokevirtual   #198 <Method void AccessibilityRecordCompat.setPassword(boolean)>
		accessibilityrecordcompat.setEnabled(accessibilitynodeinfocompat.isEnabled());
	//   28   64:aload           4
	//   29   66:aload           5
	//   30   68:invokevirtual   #201 <Method boolean AccessibilityNodeInfoCompat.isEnabled()>
	//   31   71:invokevirtual   #204 <Method void AccessibilityRecordCompat.setEnabled(boolean)>
		accessibilityrecordcompat.setChecked(accessibilitynodeinfocompat.isChecked());
	//   32   74:aload           4
	//   33   76:aload           5
	//   34   78:invokevirtual   #207 <Method boolean AccessibilityNodeInfoCompat.isChecked()>
	//   35   81:invokevirtual   #210 <Method void AccessibilityRecordCompat.setChecked(boolean)>
		onPopulateEventForVirtualView(i, accessibilityevent);
	//   36   84:aload_0         
	//   37   85:iload_1         
	//   38   86:aload_3         
	//   39   87:invokevirtual   #214 <Method void onPopulateEventForVirtualView(int, AccessibilityEvent)>
		if(accessibilityevent.getText().isEmpty() && accessibilityevent.getContentDescription() == null)
	//*  40   90:aload_3         
	//*  41   91:invokevirtual   #215 <Method List AccessibilityEvent.getText()>
	//*  42   94:invokeinterface #218 <Method boolean List.isEmpty()>
	//*  43   99:ifeq            119
	//*  44  102:aload_3         
	//*  45  103:invokevirtual   #219 <Method CharSequence AccessibilityEvent.getContentDescription()>
	//*  46  106:ifnonnull       119
		{
			throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
	//   47  109:new             #221 <Class RuntimeException>
	//   48  112:dup             
	//   49  113:ldc1            #223 <String "Callbacks must add text or a content description in populateEventForVirtualViewId()">
	//   50  115:invokespecial   #224 <Method void RuntimeException(String)>
	//   51  118:athrow          
		} else
		{
			accessibilityrecordcompat.setClassName(accessibilitynodeinfocompat.getClassName());
	//   52  119:aload           4
	//   53  121:aload           5
	//   54  123:invokevirtual   #227 <Method CharSequence AccessibilityNodeInfoCompat.getClassName()>
	//   55  126:invokevirtual   #230 <Method void AccessibilityRecordCompat.setClassName(CharSequence)>
			accessibilityrecordcompat.setSource(mHost, i);
	//   56  129:aload           4
	//   57  131:aload_0         
	//   58  132:getfield        #87  <Field View mHost>
	//   59  135:iload_1         
	//   60  136:invokevirtual   #233 <Method void AccessibilityRecordCompat.setSource(View, int)>
			accessibilityevent.setPackageName(((CharSequence) (mHost.getContext().getPackageName())));
	//   61  139:aload_3         
	//   62  140:aload_0         
	//   63  141:getfield        #87  <Field View mHost>
	//   64  144:invokevirtual   #93  <Method Context View.getContext()>
	//   65  147:invokevirtual   #237 <Method String Context.getPackageName()>
	//   66  150:invokevirtual   #240 <Method void AccessibilityEvent.setPackageName(CharSequence)>
			return accessibilityevent;
	//   67  153:aload_3         
	//   68  154:areturn         
		}
	}

	private AccessibilityEvent createEventForHost(int i)
	{
		AccessibilityEvent accessibilityevent = AccessibilityEvent.obtain(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #152 <Method AccessibilityEvent AccessibilityEvent.obtain(int)>
	//    2    4:astore_2        
		ViewCompat.onInitializeAccessibilityEvent(mHost, accessibilityevent);
	//    3    5:aload_0         
	//    4    6:getfield        #87  <Field View mHost>
	//    5    9:aload_2         
	//    6   10:invokestatic    #244 <Method void ViewCompat.onInitializeAccessibilityEvent(View, AccessibilityEvent)>
		return accessibilityevent;
	//    7   13:aload_2         
	//    8   14:areturn         
	}

	private AccessibilityNodeInfoCompat createNodeForChild(int i)
	{
		AccessibilityNodeInfoCompat accessibilitynodeinfocompat = AccessibilityNodeInfoCompat.obtain();
	//    0    0:invokestatic    #249 <Method AccessibilityNodeInfoCompat AccessibilityNodeInfoCompat.obtain()>
	//    1    3:astore          4
		accessibilitynodeinfocompat.setEnabled(true);
	//    2    5:aload           4
	//    3    7:iconst_1        
	//    4    8:invokevirtual   #250 <Method void AccessibilityNodeInfoCompat.setEnabled(boolean)>
		accessibilitynodeinfocompat.setFocusable(true);
	//    5   11:aload           4
	//    6   13:iconst_1        
	//    7   14:invokevirtual   #251 <Method void AccessibilityNodeInfoCompat.setFocusable(boolean)>
		accessibilitynodeinfocompat.setClassName("android.view.View");
	//    8   17:aload           4
	//    9   19:ldc1            #15  <String "android.view.View">
	//   10   21:invokevirtual   #252 <Method void AccessibilityNodeInfoCompat.setClassName(CharSequence)>
		accessibilitynodeinfocompat.setBoundsInParent(INVALID_PARENT_BOUNDS);
	//   11   24:aload           4
	//   12   26:getstatic       #53  <Field Rect INVALID_PARENT_BOUNDS>
	//   13   29:invokevirtual   #256 <Method void AccessibilityNodeInfoCompat.setBoundsInParent(Rect)>
		accessibilitynodeinfocompat.setBoundsInScreen(INVALID_PARENT_BOUNDS);
	//   14   32:aload           4
	//   15   34:getstatic       #53  <Field Rect INVALID_PARENT_BOUNDS>
	//   16   37:invokevirtual   #259 <Method void AccessibilityNodeInfoCompat.setBoundsInScreen(Rect)>
		accessibilitynodeinfocompat.setParent(mHost);
	//   17   40:aload           4
	//   18   42:aload_0         
	//   19   43:getfield        #87  <Field View mHost>
	//   20   46:invokevirtual   #262 <Method void AccessibilityNodeInfoCompat.setParent(View)>
		onPopulateNodeForVirtualView(i, accessibilitynodeinfocompat);
	//   21   49:aload_0         
	//   22   50:iload_1         
	//   23   51:aload           4
	//   24   53:invokevirtual   #266 <Method void onPopulateNodeForVirtualView(int, AccessibilityNodeInfoCompat)>
		if(accessibilitynodeinfocompat.getText() == null && accessibilitynodeinfocompat.getContentDescription() == null)
	//*  25   56:aload           4
	//*  26   58:invokevirtual   #173 <Method CharSequence AccessibilityNodeInfoCompat.getText()>
	//*  27   61:ifnonnull       83
	//*  28   64:aload           4
	//*  29   66:invokevirtual   #182 <Method CharSequence AccessibilityNodeInfoCompat.getContentDescription()>
	//*  30   69:ifnonnull       83
			throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
	//   31   72:new             #221 <Class RuntimeException>
	//   32   75:dup             
	//   33   76:ldc2            #268 <String "Callbacks must add text or a content description in populateNodeForVirtualViewId()">
	//   34   79:invokespecial   #224 <Method void RuntimeException(String)>
	//   35   82:athrow          
		accessibilitynodeinfocompat.getBoundsInParent(mTempParentRect);
	//   36   83:aload           4
	//   37   85:aload_0         
	//   38   86:getfield        #68  <Field Rect mTempParentRect>
	//   39   89:invokevirtual   #271 <Method void AccessibilityNodeInfoCompat.getBoundsInParent(Rect)>
		if(mTempParentRect.equals(((Object) (INVALID_PARENT_BOUNDS))))
	//*  40   92:aload_0         
	//*  41   93:getfield        #68  <Field Rect mTempParentRect>
	//*  42   96:getstatic       #53  <Field Rect INVALID_PARENT_BOUNDS>
	//*  43   99:invokevirtual   #274 <Method boolean Rect.equals(Object)>
	//*  44  102:ifeq            116
			throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
	//   45  105:new             #221 <Class RuntimeException>
	//   46  108:dup             
	//   47  109:ldc2            #276 <String "Callbacks must set parent bounds in populateNodeForVirtualViewId()">
	//   48  112:invokespecial   #224 <Method void RuntimeException(String)>
	//   49  115:athrow          
		int j = accessibilitynodeinfocompat.getActions();
	//   50  116:aload           4
	//   51  118:invokevirtual   #280 <Method int AccessibilityNodeInfoCompat.getActions()>
	//   52  121:istore_2        
		if((j & 0x40) != 0)
	//*  53  122:iload_2         
	//*  54  123:bipush          64
	//*  55  125:iand            
	//*  56  126:ifeq            140
			throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
	//   57  129:new             #221 <Class RuntimeException>
	//   58  132:dup             
	//   59  133:ldc2            #282 <String "Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()">
	//   60  136:invokespecial   #224 <Method void RuntimeException(String)>
	//   61  139:athrow          
		if((j & 0x80) != 0)
	//*  62  140:iload_2         
	//*  63  141:sipush          128
	//*  64  144:iand            
	//*  65  145:ifeq            159
			throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
	//   66  148:new             #221 <Class RuntimeException>
	//   67  151:dup             
	//   68  152:ldc2            #284 <String "Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()">
	//   69  155:invokespecial   #224 <Method void RuntimeException(String)>
	//   70  158:athrow          
		accessibilitynodeinfocompat.setPackageName(((CharSequence) (mHost.getContext().getPackageName())));
	//   71  159:aload           4
	//   72  161:aload_0         
	//   73  162:getfield        #87  <Field View mHost>
	//   74  165:invokevirtual   #93  <Method Context View.getContext()>
	//   75  168:invokevirtual   #237 <Method String Context.getPackageName()>
	//   76  171:invokevirtual   #285 <Method void AccessibilityNodeInfoCompat.setPackageName(CharSequence)>
		accessibilitynodeinfocompat.setSource(mHost, i);
	//   77  174:aload           4
	//   78  176:aload_0         
	//   79  177:getfield        #87  <Field View mHost>
	//   80  180:iload_1         
	//   81  181:invokevirtual   #286 <Method void AccessibilityNodeInfoCompat.setSource(View, int)>
		if(mAccessibilityFocusedVirtualViewId == i)
	//*  82  184:aload_0         
	//*  83  185:getfield        #74  <Field int mAccessibilityFocusedVirtualViewId>
	//*  84  188:iload_1         
	//*  85  189:icmpne          209
		{
			accessibilitynodeinfocompat.setAccessibilityFocused(true);
	//   86  192:aload           4
	//   87  194:iconst_1        
	//   88  195:invokevirtual   #289 <Method void AccessibilityNodeInfoCompat.setAccessibilityFocused(boolean)>
			accessibilitynodeinfocompat.addAction(128);
	//   89  198:aload           4
	//   90  200:sipush          128
	//   91  203:invokevirtual   #293 <Method void AccessibilityNodeInfoCompat.addAction(int)>
		} else
	//*  92  206:goto            222
		{
			accessibilitynodeinfocompat.setAccessibilityFocused(false);
	//   93  209:aload           4
	//   94  211:iconst_0        
	//   95  212:invokevirtual   #289 <Method void AccessibilityNodeInfoCompat.setAccessibilityFocused(boolean)>
			accessibilitynodeinfocompat.addAction(64);
	//   96  215:aload           4
	//   97  217:bipush          64
	//   98  219:invokevirtual   #293 <Method void AccessibilityNodeInfoCompat.addAction(int)>
		}
		boolean flag;
		if(mKeyboardFocusedVirtualViewId == i)
	//*  99  222:aload_0         
	//* 100  223:getfield        #76  <Field int mKeyboardFocusedVirtualViewId>
	//* 101  226:iload_1         
	//* 102  227:icmpne          235
			flag = true;
	//  103  230:iconst_1        
	//  104  231:istore_3        
		else
	//* 105  232:goto            237
			flag = false;
	//  106  235:iconst_0        
	//  107  236:istore_3        
		if(flag)
	//* 108  237:iload_3         
	//* 109  238:ifeq            250
			accessibilitynodeinfocompat.addAction(2);
	//  110  241:aload           4
	//  111  243:iconst_2        
	//  112  244:invokevirtual   #293 <Method void AccessibilityNodeInfoCompat.addAction(int)>
		else
	//* 113  247:goto            264
		if(accessibilitynodeinfocompat.isFocusable())
	//* 114  250:aload           4
	//* 115  252:invokevirtual   #296 <Method boolean AccessibilityNodeInfoCompat.isFocusable()>
	//* 116  255:ifeq            264
			accessibilitynodeinfocompat.addAction(1);
	//  117  258:aload           4
	//  118  260:iconst_1        
	//  119  261:invokevirtual   #293 <Method void AccessibilityNodeInfoCompat.addAction(int)>
		accessibilitynodeinfocompat.setFocused(flag);
	//  120  264:aload           4
	//  121  266:iload_3         
	//  122  267:invokevirtual   #299 <Method void AccessibilityNodeInfoCompat.setFocused(boolean)>
		mHost.getLocationOnScreen(mTempGlobalRect);
	//  123  270:aload_0         
	//  124  271:getfield        #87  <Field View mHost>
	//  125  274:aload_0         
	//  126  275:getfield        #72  <Field int[] mTempGlobalRect>
	//  127  278:invokevirtual   #303 <Method void View.getLocationOnScreen(int[])>
		accessibilitynodeinfocompat.getBoundsInScreen(mTempScreenRect);
	//  128  281:aload           4
	//  129  283:aload_0         
	//  130  284:getfield        #66  <Field Rect mTempScreenRect>
	//  131  287:invokevirtual   #306 <Method void AccessibilityNodeInfoCompat.getBoundsInScreen(Rect)>
		if(mTempScreenRect.equals(((Object) (INVALID_PARENT_BOUNDS))))
	//* 132  290:aload_0         
	//* 133  291:getfield        #66  <Field Rect mTempScreenRect>
	//* 134  294:getstatic       #53  <Field Rect INVALID_PARENT_BOUNDS>
	//* 135  297:invokevirtual   #274 <Method boolean Rect.equals(Object)>
	//* 136  300:ifeq            441
		{
			accessibilitynodeinfocompat.getBoundsInParent(mTempScreenRect);
	//  137  303:aload           4
	//  138  305:aload_0         
	//  139  306:getfield        #66  <Field Rect mTempScreenRect>
	//  140  309:invokevirtual   #271 <Method void AccessibilityNodeInfoCompat.getBoundsInParent(Rect)>
			if(accessibilitynodeinfocompat.mParentVirtualDescendantId != -1)
	//* 141  312:aload           4
	//* 142  314:getfield        #309 <Field int AccessibilityNodeInfoCompat.mParentVirtualDescendantId>
	//* 143  317:iconst_m1       
	//* 144  318:icmpeq          406
			{
				AccessibilityNodeInfoCompat accessibilitynodeinfocompat1 = AccessibilityNodeInfoCompat.obtain();
	//  145  321:invokestatic    #249 <Method AccessibilityNodeInfoCompat AccessibilityNodeInfoCompat.obtain()>
	//  146  324:astore          5
				for(i = accessibilitynodeinfocompat.mParentVirtualDescendantId; i != -1; i = accessibilitynodeinfocompat1.mParentVirtualDescendantId)
	//* 147  326:aload           4
	//* 148  328:getfield        #309 <Field int AccessibilityNodeInfoCompat.mParentVirtualDescendantId>
	//* 149  331:istore_1        
	//* 150  332:iload_1         
	//* 151  333:iconst_m1       
	//* 152  334:icmpeq          401
				{
					accessibilitynodeinfocompat1.setParent(mHost, -1);
	//  153  337:aload           5
	//  154  339:aload_0         
	//  155  340:getfield        #87  <Field View mHost>
	//  156  343:iconst_m1       
	//  157  344:invokevirtual   #311 <Method void AccessibilityNodeInfoCompat.setParent(View, int)>
					accessibilitynodeinfocompat1.setBoundsInParent(INVALID_PARENT_BOUNDS);
	//  158  347:aload           5
	//  159  349:getstatic       #53  <Field Rect INVALID_PARENT_BOUNDS>
	//  160  352:invokevirtual   #256 <Method void AccessibilityNodeInfoCompat.setBoundsInParent(Rect)>
					onPopulateNodeForVirtualView(i, accessibilitynodeinfocompat1);
	//  161  355:aload_0         
	//  162  356:iload_1         
	//  163  357:aload           5
	//  164  359:invokevirtual   #266 <Method void onPopulateNodeForVirtualView(int, AccessibilityNodeInfoCompat)>
					accessibilitynodeinfocompat1.getBoundsInParent(mTempParentRect);
	//  165  362:aload           5
	//  166  364:aload_0         
	//  167  365:getfield        #68  <Field Rect mTempParentRect>
	//  168  368:invokevirtual   #271 <Method void AccessibilityNodeInfoCompat.getBoundsInParent(Rect)>
					mTempScreenRect.offset(mTempParentRect.left, mTempParentRect.top);
	//  169  371:aload_0         
	//  170  372:getfield        #66  <Field Rect mTempScreenRect>
	//  171  375:aload_0         
	//  172  376:getfield        #68  <Field Rect mTempParentRect>
	//  173  379:getfield        #314 <Field int Rect.left>
	//  174  382:aload_0         
	//  175  383:getfield        #68  <Field Rect mTempParentRect>
	//  176  386:getfield        #317 <Field int Rect.top>
	//  177  389:invokevirtual   #321 <Method void Rect.offset(int, int)>
				}

	//  178  392:aload           5
	//  179  394:getfield        #309 <Field int AccessibilityNodeInfoCompat.mParentVirtualDescendantId>
	//  180  397:istore_1        
	//* 181  398:goto            332
				accessibilitynodeinfocompat1.recycle();
	//  182  401:aload           5
	//  183  403:invokevirtual   #324 <Method void AccessibilityNodeInfoCompat.recycle()>
			}
			mTempScreenRect.offset(mTempGlobalRect[0] - mHost.getScrollX(), mTempGlobalRect[1] - mHost.getScrollY());
	//  184  406:aload_0         
	//  185  407:getfield        #66  <Field Rect mTempScreenRect>
	//  186  410:aload_0         
	//  187  411:getfield        #72  <Field int[] mTempGlobalRect>
	//  188  414:iconst_0        
	//  189  415:iaload          
	//  190  416:aload_0         
	//  191  417:getfield        #87  <Field View mHost>
	//  192  420:invokevirtual   #327 <Method int View.getScrollX()>
	//  193  423:isub            
	//  194  424:aload_0         
	//  195  425:getfield        #72  <Field int[] mTempGlobalRect>
	//  196  428:iconst_1        
	//  197  429:iaload          
	//  198  430:aload_0         
	//  199  431:getfield        #87  <Field View mHost>
	//  200  434:invokevirtual   #330 <Method int View.getScrollY()>
	//  201  437:isub            
	//  202  438:invokevirtual   #321 <Method void Rect.offset(int, int)>
		}
		if(mHost.getLocalVisibleRect(mTempVisibleRect))
	//* 203  441:aload_0         
	//* 204  442:getfield        #87  <Field View mHost>
	//* 205  445:aload_0         
	//* 206  446:getfield        #70  <Field Rect mTempVisibleRect>
	//* 207  449:invokevirtual   #334 <Method boolean View.getLocalVisibleRect(Rect)>
	//* 208  452:ifeq            528
		{
			mTempVisibleRect.offset(mTempGlobalRect[0] - mHost.getScrollX(), mTempGlobalRect[1] - mHost.getScrollY());
	//  209  455:aload_0         
	//  210  456:getfield        #70  <Field Rect mTempVisibleRect>
	//  211  459:aload_0         
	//  212  460:getfield        #72  <Field int[] mTempGlobalRect>
	//  213  463:iconst_0        
	//  214  464:iaload          
	//  215  465:aload_0         
	//  216  466:getfield        #87  <Field View mHost>
	//  217  469:invokevirtual   #327 <Method int View.getScrollX()>
	//  218  472:isub            
	//  219  473:aload_0         
	//  220  474:getfield        #72  <Field int[] mTempGlobalRect>
	//  221  477:iconst_1        
	//  222  478:iaload          
	//  223  479:aload_0         
	//  224  480:getfield        #87  <Field View mHost>
	//  225  483:invokevirtual   #330 <Method int View.getScrollY()>
	//  226  486:isub            
	//  227  487:invokevirtual   #321 <Method void Rect.offset(int, int)>
			mTempScreenRect.intersect(mTempVisibleRect);
	//  228  490:aload_0         
	//  229  491:getfield        #66  <Field Rect mTempScreenRect>
	//  230  494:aload_0         
	//  231  495:getfield        #70  <Field Rect mTempVisibleRect>
	//  232  498:invokevirtual   #337 <Method boolean Rect.intersect(Rect)>
	//  233  501:pop             
			accessibilitynodeinfocompat.setBoundsInScreen(mTempScreenRect);
	//  234  502:aload           4
	//  235  504:aload_0         
	//  236  505:getfield        #66  <Field Rect mTempScreenRect>
	//  237  508:invokevirtual   #259 <Method void AccessibilityNodeInfoCompat.setBoundsInScreen(Rect)>
			if(isVisibleToUser(mTempScreenRect))
	//* 238  511:aload_0         
	//* 239  512:aload_0         
	//* 240  513:getfield        #66  <Field Rect mTempScreenRect>
	//* 241  516:invokespecial   #340 <Method boolean isVisibleToUser(Rect)>
	//* 242  519:ifeq            528
				accessibilitynodeinfocompat.setVisibleToUser(true);
	//  243  522:aload           4
	//  244  524:iconst_1        
	//  245  525:invokevirtual   #343 <Method void AccessibilityNodeInfoCompat.setVisibleToUser(boolean)>
		}
		return accessibilitynodeinfocompat;
	//  246  528:aload           4
	//  247  530:areturn         
	}

	private AccessibilityNodeInfoCompat createNodeForHost()
	{
		AccessibilityNodeInfoCompat accessibilitynodeinfocompat = AccessibilityNodeInfoCompat.obtain(mHost);
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field View mHost>
	//    2    4:invokestatic    #348 <Method AccessibilityNodeInfoCompat AccessibilityNodeInfoCompat.obtain(View)>
	//    3    7:astore_3        
		ViewCompat.onInitializeAccessibilityNodeInfo(mHost, accessibilitynodeinfocompat);
	//    4    8:aload_0         
	//    5    9:getfield        #87  <Field View mHost>
	//    6   12:aload_3         
	//    7   13:invokestatic    #352 <Method void ViewCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
		ArrayList arraylist = new ArrayList();
	//    8   16:new             #354 <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #355 <Method void ArrayList()>
	//   11   23:astore          4
		getVisibleVirtualViews(((List) (arraylist)));
	//   12   25:aload_0         
	//   13   26:aload           4
	//   14   28:invokevirtual   #359 <Method void getVisibleVirtualViews(List)>
		if(accessibilitynodeinfocompat.getChildCount() > 0 && arraylist.size() > 0)
	//*  15   31:aload_3         
	//*  16   32:invokevirtual   #362 <Method int AccessibilityNodeInfoCompat.getChildCount()>
	//*  17   35:ifle            57
	//*  18   38:aload           4
	//*  19   40:invokevirtual   #365 <Method int ArrayList.size()>
	//*  20   43:ifle            57
			throw new RuntimeException("Views cannot have both real and virtual children");
	//   21   46:new             #221 <Class RuntimeException>
	//   22   49:dup             
	//   23   50:ldc2            #367 <String "Views cannot have both real and virtual children">
	//   24   53:invokespecial   #224 <Method void RuntimeException(String)>
	//   25   56:athrow          
		int i = 0;
	//   26   57:iconst_0        
	//   27   58:istore_1        
		for(int j = arraylist.size(); i < j; i++)
	//*  28   59:aload           4
	//*  29   61:invokevirtual   #365 <Method int ArrayList.size()>
	//*  30   64:istore_2        
	//*  31   65:iload_1         
	//*  32   66:iload_2         
	//*  33   67:icmpge          97
			accessibilitynodeinfocompat.addChild(mHost, ((Integer)arraylist.get(i)).intValue());
	//   34   70:aload_3         
	//   35   71:aload_0         
	//   36   72:getfield        #87  <Field View mHost>
	//   37   75:aload           4
	//   38   77:iload_1         
	//   39   78:invokevirtual   #371 <Method Object ArrayList.get(int)>
	//   40   81:checkcast       #373 <Class Integer>
	//   41   84:invokevirtual   #376 <Method int Integer.intValue()>
	//   42   87:invokevirtual   #379 <Method void AccessibilityNodeInfoCompat.addChild(View, int)>

	//   43   90:iload_1         
	//   44   91:iconst_1        
	//   45   92:iadd            
	//   46   93:istore_1        
	//*  47   94:goto            65
		return accessibilitynodeinfocompat;
	//   48   97:aload_3         
	//   49   98:areturn         
	}

	private SparseArrayCompat getAllNodes()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #354 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #355 <Method void ArrayList()>
	//    3    7:astore_2        
		getVisibleVirtualViews(((List) (arraylist)));
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #359 <Method void getVisibleVirtualViews(List)>
		SparseArrayCompat sparsearraycompat = new SparseArrayCompat();
	//    7   13:new             #383 <Class SparseArrayCompat>
	//    8   16:dup             
	//    9   17:invokespecial   #384 <Method void SparseArrayCompat()>
	//   10   20:astore_3        
		for(int i = 0; i < ((List) (arraylist)).size(); i++)
	//*  11   21:iconst_0        
	//*  12   22:istore_1        
	//*  13   23:iload_1         
	//*  14   24:aload_2         
	//*  15   25:invokeinterface #385 <Method int List.size()>
	//*  16   30:icmpge          50
			sparsearraycompat.put(i, ((Object) (createNodeForChild(i))));
	//   17   33:aload_3         
	//   18   34:iload_1         
	//   19   35:aload_0         
	//   20   36:iload_1         
	//   21   37:invokespecial   #387 <Method AccessibilityNodeInfoCompat createNodeForChild(int)>
	//   22   40:invokevirtual   #391 <Method void SparseArrayCompat.put(int, Object)>

	//   23   43:iload_1         
	//   24   44:iconst_1        
	//   25   45:iadd            
	//   26   46:istore_1        
	//*  27   47:goto            23
		return sparsearraycompat;
	//   28   50:aload_3         
	//   29   51:areturn         
	}

	private void getBoundsInParent(int i, Rect rect)
	{
		obtainAccessibilityNodeInfo(i).getBoundsInParent(rect);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #162 <Method AccessibilityNodeInfoCompat obtainAccessibilityNodeInfo(int)>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #271 <Method void AccessibilityNodeInfoCompat.getBoundsInParent(Rect)>
	//    5    9:return          
	}

	private static Rect guessPreviouslyFocusedRect(View view, int i, Rect rect)
	{
		int j = view.getWidth();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #399 <Method int View.getWidth()>
	//    2    4:istore_3        
		int k = view.getHeight();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #402 <Method int View.getHeight()>
	//    5    9:istore          4
		switch(i)
	//*   6   11:iload_1         
		{
	//*   7   12:lookupswitch    4: default 56
	//	               17: 59
	//	               33: 70
	//	               66: 82
	//	               130: 93
	//*   8   56:goto            103
		case 17: // '\021'
			rect.set(j, 0, j, k);
	//    9   59:aload_2         
	//   10   60:iload_3         
	//   11   61:iconst_0        
	//   12   62:iload_3         
	//   13   63:iload           4
	//   14   65:invokevirtual   #405 <Method void Rect.set(int, int, int, int)>
			return rect;
	//   15   68:aload_2         
	//   16   69:areturn         

		case 33: // '!'
			rect.set(0, k, j, k);
	//   17   70:aload_2         
	//   18   71:iconst_0        
	//   19   72:iload           4
	//   20   74:iload_3         
	//   21   75:iload           4
	//   22   77:invokevirtual   #405 <Method void Rect.set(int, int, int, int)>
			return rect;
	//   23   80:aload_2         
	//   24   81:areturn         

		case 66: // 'B'
			rect.set(-1, 0, -1, k);
	//   25   82:aload_2         
	//   26   83:iconst_m1       
	//   27   84:iconst_0        
	//   28   85:iconst_m1       
	//   29   86:iload           4
	//   30   88:invokevirtual   #405 <Method void Rect.set(int, int, int, int)>
			return rect;
	//   31   91:aload_2         
	//   32   92:areturn         

		case 130: 
			rect.set(0, -1, j, -1);
	//   33   93:aload_2         
	//   34   94:iconst_0        
	//   35   95:iconst_m1       
	//   36   96:iload_3         
	//   37   97:iconst_m1       
	//   38   98:invokevirtual   #405 <Method void Rect.set(int, int, int, int)>
			return rect;
	//   39  101:aload_2         
	//   40  102:areturn         
		}
		throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
	//   41  103:new             #80  <Class IllegalArgumentException>
	//   42  106:dup             
	//   43  107:ldc2            #407 <String "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.">
	//   44  110:invokespecial   #85  <Method void IllegalArgumentException(String)>
	//   45  113:athrow          
	}

	private boolean isVisibleToUser(Rect rect)
	{
		if(rect == null || rect.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #409 <Method boolean Rect.isEmpty()>
	//*   4    8:ifeq            13
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		if(mHost.getWindowVisibility() != 0)
	//*   7   13:aload_0         
	//*   8   14:getfield        #87  <Field View mHost>
	//*   9   17:invokevirtual   #412 <Method int View.getWindowVisibility()>
	//*  10   20:ifeq            25
			return false;
	//   11   23:iconst_0        
	//   12   24:ireturn         
		for(rect = ((Rect) (mHost.getParent())); rect instanceof View; rect = ((Rect) (((View) (rect)).getParent())))
	//*  13   25:aload_0         
	//*  14   26:getfield        #87  <Field View mHost>
	//*  15   29:invokevirtual   #416 <Method android.view.ViewParent View.getParent()>
	//*  16   32:astore_1        
	//*  17   33:aload_1         
	//*  18   34:instanceof      #89  <Class View>
	//*  19   37:ifeq            71
		{
			rect = ((Rect) ((View)rect));
	//   20   40:aload_1         
	//   21   41:checkcast       #89  <Class View>
	//   22   44:astore_1        
			if(ViewCompat.getAlpha(((View) (rect))) <= 0.0F || ((View) (rect)).getVisibility() != 0)
	//*  23   45:aload_1         
	//*  24   46:invokestatic    #420 <Method float ViewCompat.getAlpha(View)>
	//*  25   49:fconst_0        
	//*  26   50:fcmpg           
	//*  27   51:ifle            61
	//*  28   54:aload_1         
	//*  29   55:invokevirtual   #423 <Method int View.getVisibility()>
	//*  30   58:ifeq            63
				return false;
	//   31   61:iconst_0        
	//   32   62:ireturn         
		}

	//   33   63:aload_1         
	//   34   64:invokevirtual   #416 <Method android.view.ViewParent View.getParent()>
	//   35   67:astore_1        
	//*  36   68:goto            33
		return rect != null;
	//   37   71:aload_1         
	//   38   72:ifnull          77
	//   39   75:iconst_1        
	//   40   76:ireturn         
	//   41   77:iconst_0        
	//   42   78:ireturn         
	}

	private static int keyToDirection(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     19 22: default 32
	//	               19 38
	//	               20 44
	//	               21 35
	//	               22 41
	//*   2   32:goto            44
		case 21: // '\025'
			return 17;
	//    3   35:bipush          17
	//    4   37:ireturn         

		case 19: // '\023'
			return 33;
	//    5   38:bipush          33
	//    6   40:ireturn         

		case 22: // '\026'
			return 66;
	//    7   41:bipush          66
	//    8   43:ireturn         
		}
		return 130;
	//    9   44:sipush          130
	//   10   47:ireturn         
	}

	private boolean moveFocus(int i, Rect rect)
	{
		SparseArrayCompat sparsearraycompat = getAllNodes();
	//    0    0:aload_0         
	//    1    1:invokespecial   #430 <Method SparseArrayCompat getAllNodes()>
	//    2    4:astore          6
		int j = mKeyboardFocusedVirtualViewId;
	//    3    6:aload_0         
	//    4    7:getfield        #76  <Field int mKeyboardFocusedVirtualViewId>
	//    5   10:istore_3        
		AccessibilityNodeInfoCompat accessibilitynodeinfocompat;
		if(j == 0x80000000)
	//*   6   11:iload_3         
	//*   7   12:ldc1            #20  <Int 0x80000000>
	//*   8   14:icmpne          23
			accessibilitynodeinfocompat = null;
	//    9   17:aconst_null     
	//   10   18:astore          5
		else
	//*  11   20:goto            34
			accessibilitynodeinfocompat = (AccessibilityNodeInfoCompat)sparsearraycompat.get(j);
	//   12   23:aload           6
	//   13   25:iload_3         
	//   14   26:invokevirtual   #431 <Method Object SparseArrayCompat.get(int)>
	//   15   29:checkcast       #170 <Class AccessibilityNodeInfoCompat>
	//   16   32:astore          5
		switch(i)
	//*  17   34:iload_1         
		{
	//*  18   35:lookupswitch    6: default 92
	//	               1: 95
	//	               2: 95
	//	               17: 139
	//	               33: 139
	//	               66: 139
	//	               130: 139
	//*  19   92:goto            217
		case 1: // '\001'
		case 2: // '\002'
			boolean flag;
			if(ViewCompat.getLayoutDirection(mHost) == 1)
	//*  20   95:aload_0         
	//*  21   96:getfield        #87  <Field View mHost>
	//*  22   99:invokestatic    #434 <Method int ViewCompat.getLayoutDirection(View)>
	//*  23  102:iconst_1        
	//*  24  103:icmpne          112
				flag = true;
	//   25  106:iconst_1        
	//   26  107:istore          4
			else
	//*  27  109:goto            115
				flag = false;
	//   28  112:iconst_0        
	//   29  113:istore          4
			rect = ((Rect) ((AccessibilityNodeInfoCompat)FocusStrategy.findNextFocusInRelativeDirection(((Object) (sparsearraycompat)), SPARSE_VALUES_ADAPTER, NODE_ADAPTER, ((Object) (accessibilitynodeinfocompat)), i, flag, false)));
	//   30  115:aload           6
	//   31  117:getstatic       #60  <Field FocusStrategy$CollectionAdapter SPARSE_VALUES_ADAPTER>
	//   32  120:getstatic       #57  <Field FocusStrategy$BoundsAdapter NODE_ADAPTER>
	//   33  123:aload           5
	//   34  125:iload_1         
	//   35  126:iload           4
	//   36  128:iconst_0        
	//   37  129:invokestatic    #440 <Method Object FocusStrategy.findNextFocusInRelativeDirection(Object, FocusStrategy$CollectionAdapter, FocusStrategy$BoundsAdapter, Object, int, boolean, boolean)>
	//   38  132:checkcast       #170 <Class AccessibilityNodeInfoCompat>
	//   39  135:astore_2        
			break;

	//*  40  136:goto            228
		case 17: // '\021'
		case 33: // '!'
		case 66: // 'B'
		case 130: 
			Rect rect1 = new Rect();
	//   41  139:new             #46  <Class Rect>
	//   42  142:dup             
	//   43  143:invokespecial   #64  <Method void Rect()>
	//   44  146:astore          7
			if(mKeyboardFocusedVirtualViewId != 0x80000000)
	//*  45  148:aload_0         
	//*  46  149:getfield        #76  <Field int mKeyboardFocusedVirtualViewId>
	//*  47  152:ldc1            #20  <Int 0x80000000>
	//*  48  154:icmpeq          170
				getBoundsInParent(mKeyboardFocusedVirtualViewId, rect1);
	//   49  157:aload_0         
	//   50  158:aload_0         
	//   51  159:getfield        #76  <Field int mKeyboardFocusedVirtualViewId>
	//   52  162:aload           7
	//   53  164:invokespecial   #442 <Method void getBoundsInParent(int, Rect)>
			else
	//*  54  167:goto            194
			if(rect != null)
	//*  55  170:aload_2         
	//*  56  171:ifnull          183
				rect1.set(rect);
	//   57  174:aload           7
	//   58  176:aload_2         
	//   59  177:invokevirtual   #444 <Method void Rect.set(Rect)>
			else
	//*  60  180:goto            194
				guessPreviouslyFocusedRect(mHost, i, rect1);
	//   61  183:aload_0         
	//   62  184:getfield        #87  <Field View mHost>
	//   63  187:iload_1         
	//   64  188:aload           7
	//   65  190:invokestatic    #446 <Method Rect guessPreviouslyFocusedRect(View, int, Rect)>
	//   66  193:pop             
			rect = ((Rect) ((AccessibilityNodeInfoCompat)FocusStrategy.findNextFocusInAbsoluteDirection(((Object) (sparsearraycompat)), SPARSE_VALUES_ADAPTER, NODE_ADAPTER, ((Object) (accessibilitynodeinfocompat)), rect1, i)));
	//   67  194:aload           6
	//   68  196:getstatic       #60  <Field FocusStrategy$CollectionAdapter SPARSE_VALUES_ADAPTER>
	//   69  199:getstatic       #57  <Field FocusStrategy$BoundsAdapter NODE_ADAPTER>
	//   70  202:aload           5
	//   71  204:aload           7
	//   72  206:iload_1         
	//   73  207:invokestatic    #450 <Method Object FocusStrategy.findNextFocusInAbsoluteDirection(Object, FocusStrategy$CollectionAdapter, FocusStrategy$BoundsAdapter, Object, Rect, int)>
	//   74  210:checkcast       #170 <Class AccessibilityNodeInfoCompat>
	//   75  213:astore_2        
			break;

	//*  76  214:goto            228
		default:
			throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
	//   77  217:new             #80  <Class IllegalArgumentException>
	//   78  220:dup             
	//   79  221:ldc2            #452 <String "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.">
	//   80  224:invokespecial   #85  <Method void IllegalArgumentException(String)>
	//   81  227:athrow          
		}
		if(rect == null)
	//*  82  228:aload_2         
	//*  83  229:ifnonnull       238
			i = 0x80000000;
	//   84  232:ldc1            #20  <Int 0x80000000>
	//   85  234:istore_1        
		else
	//*  86  235:goto            250
			i = sparsearraycompat.keyAt(sparsearraycompat.indexOfValue(((Object) (rect))));
	//   87  238:aload           6
	//   88  240:aload           6
	//   89  242:aload_2         
	//   90  243:invokevirtual   #456 <Method int SparseArrayCompat.indexOfValue(Object)>
	//   91  246:invokevirtual   #459 <Method int SparseArrayCompat.keyAt(int)>
	//   92  249:istore_1        
		return requestKeyboardFocusForVirtualView(i);
	//   93  250:aload_0         
	//   94  251:iload_1         
	//   95  252:invokevirtual   #462 <Method boolean requestKeyboardFocusForVirtualView(int)>
	//   96  255:ireturn         
	}

	private boolean performActionForChild(int i, int j, Bundle bundle)
	{
		switch(j)
	//*   0    0:iload_2         
		{
	//*   1    1:lookupswitch    4: default 44
	//	               1: 59
	//	               2: 65
	//	               64: 47
	//	               128: 53
	//*   2   44:goto            71
		case 64: // '@'
			return requestAccessibilityFocus(i);
	//    3   47:aload_0         
	//    4   48:iload_1         
	//    5   49:invokespecial   #466 <Method boolean requestAccessibilityFocus(int)>
	//    6   52:ireturn         

		case 128: 
			return clearAccessibilityFocus(i);
	//    7   53:aload_0         
	//    8   54:iload_1         
	//    9   55:invokespecial   #468 <Method boolean clearAccessibilityFocus(int)>
	//   10   58:ireturn         

		case 1: // '\001'
			return requestKeyboardFocusForVirtualView(i);
	//   11   59:aload_0         
	//   12   60:iload_1         
	//   13   61:invokevirtual   #462 <Method boolean requestKeyboardFocusForVirtualView(int)>
	//   14   64:ireturn         

		case 2: // '\002'
			return clearKeyboardFocusForVirtualView(i);
	//   15   65:aload_0         
	//   16   66:iload_1         
	//   17   67:invokevirtual   #471 <Method boolean clearKeyboardFocusForVirtualView(int)>
	//   18   70:ireturn         
		}
		return onPerformActionForVirtualView(i, j, bundle);
	//   19   71:aload_0         
	//   20   72:iload_1         
	//   21   73:iload_2         
	//   22   74:aload_3         
	//   23   75:invokevirtual   #138 <Method boolean onPerformActionForVirtualView(int, int, Bundle)>
	//   24   78:ireturn         
	}

	private boolean performActionForHost(int i, Bundle bundle)
	{
		return ViewCompat.performAccessibilityAction(mHost, i, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field View mHost>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #477 <Method boolean ViewCompat.performAccessibilityAction(View, int, Bundle)>
	//    5    9:ireturn         
	}

	private boolean requestAccessibilityFocus(int i)
	{
		if(!mManager.isEnabled() || !AccessibilityManagerCompat.isTouchExplorationEnabled(mManager))
	//*   0    0:aload_0         
	//*   1    1:getfield        #105 <Field AccessibilityManager mManager>
	//*   2    4:invokevirtual   #478 <Method boolean AccessibilityManager.isEnabled()>
	//*   3    7:ifeq            20
	//*   4   10:aload_0         
	//*   5   11:getfield        #105 <Field AccessibilityManager mManager>
	//*   6   14:invokestatic    #484 <Method boolean AccessibilityManagerCompat.isTouchExplorationEnabled(AccessibilityManager)>
	//*   7   17:ifne            22
			return false;
	//    8   20:iconst_0        
	//    9   21:ireturn         
		if(mAccessibilityFocusedVirtualViewId != i)
	//*  10   22:aload_0         
	//*  11   23:getfield        #74  <Field int mAccessibilityFocusedVirtualViewId>
	//*  12   26:iload_1         
	//*  13   27:icmpeq          71
		{
			if(mAccessibilityFocusedVirtualViewId != 0x80000000)
	//*  14   30:aload_0         
	//*  15   31:getfield        #74  <Field int mAccessibilityFocusedVirtualViewId>
	//*  16   34:ldc1            #20  <Int 0x80000000>
	//*  17   36:icmpeq          48
				clearAccessibilityFocus(mAccessibilityFocusedVirtualViewId);
	//   18   39:aload_0         
	//   19   40:aload_0         
	//   20   41:getfield        #74  <Field int mAccessibilityFocusedVirtualViewId>
	//   21   44:invokespecial   #468 <Method boolean clearAccessibilityFocus(int)>
	//   22   47:pop             
			mAccessibilityFocusedVirtualViewId = i;
	//   23   48:aload_0         
	//   24   49:iload_1         
	//   25   50:putfield        #74  <Field int mAccessibilityFocusedVirtualViewId>
			mHost.invalidate();
	//   26   53:aload_0         
	//   27   54:getfield        #87  <Field View mHost>
	//   28   57:invokevirtual   #127 <Method void View.invalidate()>
			sendEventForVirtualView(i, 32768);
	//   29   60:aload_0         
	//   30   61:iload_1         
	//   31   62:ldc2            #485 <Int 32768>
	//   32   65:invokevirtual   #132 <Method boolean sendEventForVirtualView(int, int)>
	//   33   68:pop             
			return true;
	//   34   69:iconst_1        
	//   35   70:ireturn         
		} else
		{
			return false;
	//   36   71:iconst_0        
	//   37   72:ireturn         
		}
	}

	private void updateHoveredVirtualView(int i)
	{
		if(mHoveredVirtualViewId == i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field int mHoveredVirtualViewId>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
		{
			return;
	//    4    8:return          
		} else
		{
			int j = mHoveredVirtualViewId;
	//    5    9:aload_0         
	//    6   10:getfield        #78  <Field int mHoveredVirtualViewId>
	//    7   13:istore_2        
			mHoveredVirtualViewId = i;
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:putfield        #78  <Field int mHoveredVirtualViewId>
			sendEventForVirtualView(i, 128);
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:sipush          128
	//   14   24:invokevirtual   #132 <Method boolean sendEventForVirtualView(int, int)>
	//   15   27:pop             
			sendEventForVirtualView(j, 256);
	//   16   28:aload_0         
	//   17   29:iload_2         
	//   18   30:sipush          256
	//   19   33:invokevirtual   #132 <Method boolean sendEventForVirtualView(int, int)>
	//   20   36:pop             
			return;
	//   21   37:return          
		}
	}

	public final boolean clearKeyboardFocusForVirtualView(int i)
	{
		if(mKeyboardFocusedVirtualViewId != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field int mKeyboardFocusedVirtualViewId>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          10
		{
			return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
		} else
		{
			mKeyboardFocusedVirtualViewId = 0x80000000;
	//    6   10:aload_0         
	//    7   11:ldc1            #20  <Int 0x80000000>
	//    8   13:putfield        #76  <Field int mKeyboardFocusedVirtualViewId>
			onVirtualViewKeyboardFocusChanged(i, false);
	//    9   16:aload_0         
	//   10   17:iload_1         
	//   11   18:iconst_0        
	//   12   19:invokevirtual   #490 <Method void onVirtualViewKeyboardFocusChanged(int, boolean)>
			sendEventForVirtualView(i, 8);
	//   13   22:aload_0         
	//   14   23:iload_1         
	//   15   24:bipush          8
	//   16   26:invokevirtual   #132 <Method boolean sendEventForVirtualView(int, int)>
	//   17   29:pop             
			return true;
	//   18   30:iconst_1        
	//   19   31:ireturn         
		}
	}

	public final boolean dispatchHoverEvent(MotionEvent motionevent)
	{
		if(!mManager.isEnabled() || !AccessibilityManagerCompat.isTouchExplorationEnabled(mManager))
	//*   0    0:aload_0         
	//*   1    1:getfield        #105 <Field AccessibilityManager mManager>
	//*   2    4:invokevirtual   #478 <Method boolean AccessibilityManager.isEnabled()>
	//*   3    7:ifeq            20
	//*   4   10:aload_0         
	//*   5   11:getfield        #105 <Field AccessibilityManager mManager>
	//*   6   14:invokestatic    #484 <Method boolean AccessibilityManagerCompat.isTouchExplorationEnabled(AccessibilityManager)>
	//*   7   17:ifne            22
			return false;
	//    8   20:iconst_0        
	//    9   21:ireturn         
		switch(motionevent.getAction())
	//*  10   22:aload_1         
	//*  11   23:invokevirtual   #497 <Method int MotionEvent.getAction()>
		{
	//*  12   26:tableswitch     7 10: default 56
	//	               7 59
	//	               8 106
	//	               9 59
	//	               10 87
	//*  13   56:goto            106
		case 7: // '\007'
		case 9: // '\t'
			int i = getVirtualViewAt(motionevent.getX(), motionevent.getY());
	//   14   59:aload_0         
	//   15   60:aload_1         
	//   16   61:invokevirtual   #501 <Method float MotionEvent.getX()>
	//   17   64:aload_1         
	//   18   65:invokevirtual   #504 <Method float MotionEvent.getY()>
	//   19   68:invokevirtual   #508 <Method int getVirtualViewAt(float, float)>
	//   20   71:istore_2        
			updateHoveredVirtualView(i);
	//   21   72:aload_0         
	//   22   73:iload_2         
	//   23   74:invokespecial   #510 <Method void updateHoveredVirtualView(int)>
			return i != 0x80000000;
	//   24   77:iload_2         
	//   25   78:ldc1            #20  <Int 0x80000000>
	//   26   80:icmpeq          85
	//   27   83:iconst_1        
	//   28   84:ireturn         
	//   29   85:iconst_0        
	//   30   86:ireturn         

		case 10: // '\n'
			if(mAccessibilityFocusedVirtualViewId != 0x80000000)
	//*  31   87:aload_0         
	//*  32   88:getfield        #74  <Field int mAccessibilityFocusedVirtualViewId>
	//*  33   91:ldc1            #20  <Int 0x80000000>
	//*  34   93:icmpeq          104
			{
				updateHoveredVirtualView(0x80000000);
	//   35   96:aload_0         
	//   36   97:ldc1            #20  <Int 0x80000000>
	//   37   99:invokespecial   #510 <Method void updateHoveredVirtualView(int)>
				return true;
	//   38  102:iconst_1        
	//   39  103:ireturn         
			} else
			{
				return false;
	//   40  104:iconst_0        
	//   41  105:ireturn         
			}
		}
		return false;
	//   42  106:iconst_0        
	//   43  107:ireturn         
	}

	public final boolean dispatchKeyEvent(KeyEvent keyevent)
	{
		boolean flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore          7
		boolean flag1 = false;
	//    2    3:iconst_0        
	//    3    4:istore          6
		boolean flag = flag2;
	//    4    6:iload           7
	//    5    8:istore          5
		if(keyevent.getAction() != 1)
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #515 <Method int KeyEvent.getAction()>
	//*   8   14:iconst_1        
	//*   9   15:icmpeq          215
		{
			int i = keyevent.getKeyCode();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #518 <Method int KeyEvent.getKeyCode()>
	//   12   22:istore_2        
			switch(i)
	//*  13   23:iload_2         
			{
	//*  14   24:lookupswitch    7: default 92
	//	               19: 94
	//	               20: 94
	//	               21: 94
	//	               22: 94
	//	               23: 152
	//	               61: 181
	//	               66: 152
			default:
				return false;
	//   15   92:iconst_0        
	//   16   93:ireturn         

			case 19: // '\023'
			case 20: // '\024'
			case 21: // '\025'
			case 22: // '\026'
				flag = flag2;
	//   17   94:iload           7
	//   18   96:istore          5
				if(keyevent.hasNoModifiers())
	//*  19   98:aload_1         
	//*  20   99:invokevirtual   #521 <Method boolean KeyEvent.hasNoModifiers()>
	//*  21  102:ifeq            215
				{
					int j = keyToDirection(i);
	//   22  105:iload_2         
	//   23  106:invokestatic    #523 <Method int keyToDirection(int)>
	//   24  109:istore_3        
					int k = keyevent.getRepeatCount();
	//   25  110:aload_1         
	//   26  111:invokevirtual   #526 <Method int KeyEvent.getRepeatCount()>
	//   27  114:istore          4
					i = 0;
	//   28  116:iconst_0        
	//   29  117:istore_2        
					flag = flag1;
	//   30  118:iload           6
	//   31  120:istore          5
					for(; i < k + 1 && moveFocus(j, ((Rect) (null))); i++)
	//*  32  122:iload_2         
	//*  33  123:iload           4
	//*  34  125:iconst_1        
	//*  35  126:iadd            
	//*  36  127:icmpge          149
	//*  37  130:aload_0         
	//*  38  131:iload_3         
	//*  39  132:aconst_null     
	//*  40  133:invokespecial   #528 <Method boolean moveFocus(int, Rect)>
	//*  41  136:ifeq            149
						flag = true;
	//   42  139:iconst_1        
	//   43  140:istore          5

	//   44  142:iload_2         
	//   45  143:iconst_1        
	//   46  144:iadd            
	//   47  145:istore_2        
	//*  48  146:goto            122
					return flag;
	//   49  149:iload           5
	//   50  151:ireturn         
				}
				break;

			case 23: // '\027'
			case 66: // 'B'
				flag = flag2;
	//   51  152:iload           7
	//   52  154:istore          5
				if(!keyevent.hasNoModifiers())
					break;
	//   53  156:aload_1         
	//   54  157:invokevirtual   #521 <Method boolean KeyEvent.hasNoModifiers()>
	//   55  160:ifeq            215
				flag = flag2;
	//   56  163:iload           7
	//   57  165:istore          5
				if(keyevent.getRepeatCount() == 0)
	//*  58  167:aload_1         
	//*  59  168:invokevirtual   #526 <Method int KeyEvent.getRepeatCount()>
	//*  60  171:ifne            215
				{
					clickKeyboardFocusedVirtualView();
	//   61  174:aload_0         
	//   62  175:invokespecial   #530 <Method boolean clickKeyboardFocusedVirtualView()>
	//   63  178:pop             
					return true;
	//   64  179:iconst_1        
	//   65  180:ireturn         
				}
				break;

			case 61: // '='
				if(keyevent.hasNoModifiers())
	//*  66  181:aload_1         
	//*  67  182:invokevirtual   #521 <Method boolean KeyEvent.hasNoModifiers()>
	//*  68  185:ifeq            195
					return moveFocus(2, ((Rect) (null)));
	//   69  188:aload_0         
	//   70  189:iconst_2        
	//   71  190:aconst_null     
	//   72  191:invokespecial   #528 <Method boolean moveFocus(int, Rect)>
	//   73  194:ireturn         
				flag = flag2;
	//   74  195:iload           7
	//   75  197:istore          5
				if(keyevent.hasModifiers(1))
	//*  76  199:aload_1         
	//*  77  200:iconst_1        
	//*  78  201:invokevirtual   #533 <Method boolean KeyEvent.hasModifiers(int)>
	//*  79  204:ifeq            215
					flag = moveFocus(1, ((Rect) (null)));
	//   80  207:aload_0         
	//   81  208:iconst_1        
	//   82  209:aconst_null     
	//   83  210:invokespecial   #528 <Method boolean moveFocus(int, Rect)>
	//   84  213:istore          5
				break;
			}
		}
		return flag;
	//   85  215:iload           5
	//   86  217:ireturn         
	}

	public final int getAccessibilityFocusedVirtualViewId()
	{
		return mAccessibilityFocusedVirtualViewId;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field int mAccessibilityFocusedVirtualViewId>
	//    2    4:ireturn         
	}

	public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view)
	{
		if(mNodeProvider == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #538 <Field ExploreByTouchHelper$MyNodeProvider mNodeProvider>
	//*   2    4:ifnonnull       19
			mNodeProvider = new MyNodeProvider();
	//    3    7:aload_0         
	//    4    8:new             #10  <Class ExploreByTouchHelper$MyNodeProvider>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #541 <Method void ExploreByTouchHelper$MyNodeProvider(ExploreByTouchHelper)>
	//    8   16:putfield        #538 <Field ExploreByTouchHelper$MyNodeProvider mNodeProvider>
		return ((AccessibilityNodeProviderCompat) (mNodeProvider));
	//    9   19:aload_0         
	//   10   20:getfield        #538 <Field ExploreByTouchHelper$MyNodeProvider mNodeProvider>
	//   11   23:areturn         
	}

	public int getFocusedVirtualView()
	{
		return getAccessibilityFocusedVirtualViewId();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #545 <Method int getAccessibilityFocusedVirtualViewId()>
	//    2    4:ireturn         
	}

	public final int getKeyboardFocusedVirtualViewId()
	{
		return mKeyboardFocusedVirtualViewId;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field int mKeyboardFocusedVirtualViewId>
	//    2    4:ireturn         
	}

	protected abstract int getVirtualViewAt(float f, float f1);

	protected abstract void getVisibleVirtualViews(List list);

	public final void invalidateRoot()
	{
		invalidateVirtualView(-1, 1);
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #551 <Method void invalidateVirtualView(int, int)>
	//    4    6:return          
	}

	public final void invalidateVirtualView(int i)
	{
		invalidateVirtualView(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #551 <Method void invalidateVirtualView(int, int)>
	//    4    6:return          
	}

	public final void invalidateVirtualView(int i, int j)
	{
		if(i != 0x80000000 && mManager.isEnabled())
	//*   0    0:iload_1         
	//*   1    1:ldc1            #20  <Int 0x80000000>
	//*   2    3:icmpeq          55
	//*   3    6:aload_0         
	//*   4    7:getfield        #105 <Field AccessibilityManager mManager>
	//*   5   10:invokevirtual   #478 <Method boolean AccessibilityManager.isEnabled()>
	//*   6   13:ifeq            55
		{
			android.view.ViewParent viewparent = mHost.getParent();
	//    7   16:aload_0         
	//    8   17:getfield        #87  <Field View mHost>
	//    9   20:invokevirtual   #416 <Method android.view.ViewParent View.getParent()>
	//   10   23:astore_3        
			if(viewparent != null)
	//*  11   24:aload_3         
	//*  12   25:ifnull          55
			{
				AccessibilityEvent accessibilityevent = createEvent(i, 2048);
	//   13   28:aload_0         
	//   14   29:iload_1         
	//   15   30:sipush          2048
	//   16   33:invokespecial   #553 <Method AccessibilityEvent createEvent(int, int)>
	//   17   36:astore          4
				AccessibilityEventCompat.setContentChangeTypes(accessibilityevent, j);
	//   18   38:aload           4
	//   19   40:iload_2         
	//   20   41:invokestatic    #557 <Method void AccessibilityEventCompat.setContentChangeTypes(AccessibilityEvent, int)>
				ViewParentCompat.requestSendAccessibilityEvent(viewparent, mHost, accessibilityevent);
	//   21   44:aload_3         
	//   22   45:aload_0         
	//   23   46:getfield        #87  <Field View mHost>
	//   24   49:aload           4
	//   25   51:invokestatic    #563 <Method boolean ViewParentCompat.requestSendAccessibilityEvent(android.view.ViewParent, View, AccessibilityEvent)>
	//   26   54:pop             
			}
		}
	//   27   55:return          
	}

	AccessibilityNodeInfoCompat obtainAccessibilityNodeInfo(int i)
	{
		if(i == -1)
	//*   0    0:iload_1         
	//*   1    1:iconst_m1       
	//*   2    2:icmpne          10
			return createNodeForHost();
	//    3    5:aload_0         
	//    4    6:invokespecial   #565 <Method AccessibilityNodeInfoCompat createNodeForHost()>
	//    5    9:areturn         
		else
			return createNodeForChild(i);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:invokespecial   #387 <Method AccessibilityNodeInfoCompat createNodeForChild(int)>
	//    9   15:areturn         
	}

	public final void onFocusChanged(boolean flag, int i, Rect rect)
	{
		if(mKeyboardFocusedVirtualViewId != 0x80000000)
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field int mKeyboardFocusedVirtualViewId>
	//*   2    4:ldc1            #20  <Int 0x80000000>
	//*   3    6:icmpeq          18
			clearKeyboardFocusForVirtualView(mKeyboardFocusedVirtualViewId);
	//    4    9:aload_0         
	//    5   10:aload_0         
	//    6   11:getfield        #76  <Field int mKeyboardFocusedVirtualViewId>
	//    7   14:invokevirtual   #471 <Method boolean clearKeyboardFocusForVirtualView(int)>
	//    8   17:pop             
		if(flag)
	//*   9   18:iload_1         
	//*  10   19:ifeq            29
			moveFocus(i, rect);
	//   11   22:aload_0         
	//   12   23:iload_2         
	//   13   24:aload_3         
	//   14   25:invokespecial   #528 <Method boolean moveFocus(int, Rect)>
	//   15   28:pop             
	//   16   29:return          
	}

	public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
	{
		super.onInitializeAccessibilityEvent(view, accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #568 <Method void AccessibilityDelegateCompat.onInitializeAccessibilityEvent(View, AccessibilityEvent)>
		onPopulateEventForHost(accessibilityevent);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #572 <Method void onPopulateEventForHost(AccessibilityEvent)>
	//    7   11:return          
	}

	public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #573 <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
		onPopulateNodeForHost(accessibilitynodeinfocompat);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #577 <Method void onPopulateNodeForHost(AccessibilityNodeInfoCompat)>
	//    7   11:return          
	}

	protected abstract boolean onPerformActionForVirtualView(int i, int j, Bundle bundle);

	protected void onPopulateEventForHost(AccessibilityEvent accessibilityevent)
	{
	//    0    0:return          
	}

	protected void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityevent)
	{
	//    0    0:return          
	}

	protected void onPopulateNodeForHost(AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
	//    0    0:return          
	}

	protected abstract void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilitynodeinfocompat);

	protected void onVirtualViewKeyboardFocusChanged(int i, boolean flag)
	{
	//    0    0:return          
	}

	boolean performAction(int i, int j, Bundle bundle)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    1: default 20
	//	               -1: 23
	//*   2   20:goto            30
		case -1: 
			return performActionForHost(j, bundle);
	//    3   23:aload_0         
	//    4   24:iload_2         
	//    5   25:aload_3         
	//    6   26:invokespecial   #580 <Method boolean performActionForHost(int, Bundle)>
	//    7   29:ireturn         
		}
		return performActionForChild(i, j, bundle);
	//    8   30:aload_0         
	//    9   31:iload_1         
	//   10   32:iload_2         
	//   11   33:aload_3         
	//   12   34:invokespecial   #582 <Method boolean performActionForChild(int, int, Bundle)>
	//   13   37:ireturn         
	}

	public final boolean requestKeyboardFocusForVirtualView(int i)
	{
		if(!mHost.isFocused() && !mHost.requestFocus())
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field View mHost>
	//*   2    4:invokevirtual   #585 <Method boolean View.isFocused()>
	//*   3    7:ifne            22
	//*   4   10:aload_0         
	//*   5   11:getfield        #87  <Field View mHost>
	//*   6   14:invokevirtual   #588 <Method boolean View.requestFocus()>
	//*   7   17:ifne            22
			return false;
	//    8   20:iconst_0        
	//    9   21:ireturn         
		if(mKeyboardFocusedVirtualViewId == i)
	//*  10   22:aload_0         
	//*  11   23:getfield        #76  <Field int mKeyboardFocusedVirtualViewId>
	//*  12   26:iload_1         
	//*  13   27:icmpne          32
			return false;
	//   14   30:iconst_0        
	//   15   31:ireturn         
		if(mKeyboardFocusedVirtualViewId != 0x80000000)
	//*  16   32:aload_0         
	//*  17   33:getfield        #76  <Field int mKeyboardFocusedVirtualViewId>
	//*  18   36:ldc1            #20  <Int 0x80000000>
	//*  19   38:icmpeq          50
			clearKeyboardFocusForVirtualView(mKeyboardFocusedVirtualViewId);
	//   20   41:aload_0         
	//   21   42:aload_0         
	//   22   43:getfield        #76  <Field int mKeyboardFocusedVirtualViewId>
	//   23   46:invokevirtual   #471 <Method boolean clearKeyboardFocusForVirtualView(int)>
	//   24   49:pop             
		mKeyboardFocusedVirtualViewId = i;
	//   25   50:aload_0         
	//   26   51:iload_1         
	//   27   52:putfield        #76  <Field int mKeyboardFocusedVirtualViewId>
		onVirtualViewKeyboardFocusChanged(i, true);
	//   28   55:aload_0         
	//   29   56:iload_1         
	//   30   57:iconst_1        
	//   31   58:invokevirtual   #490 <Method void onVirtualViewKeyboardFocusChanged(int, boolean)>
		sendEventForVirtualView(i, 8);
	//   32   61:aload_0         
	//   33   62:iload_1         
	//   34   63:bipush          8
	//   35   65:invokevirtual   #132 <Method boolean sendEventForVirtualView(int, int)>
	//   36   68:pop             
		return true;
	//   37   69:iconst_1        
	//   38   70:ireturn         
	}

	public final boolean sendEventForVirtualView(int i, int j)
	{
		if(i == 0x80000000 || !mManager.isEnabled())
	//*   0    0:iload_1         
	//*   1    1:ldc1            #20  <Int 0x80000000>
	//*   2    3:icmpeq          16
	//*   3    6:aload_0         
	//*   4    7:getfield        #105 <Field AccessibilityManager mManager>
	//*   5   10:invokevirtual   #478 <Method boolean AccessibilityManager.isEnabled()>
	//*   6   13:ifne            18
			return false;
	//    7   16:iconst_0        
	//    8   17:ireturn         
		android.view.ViewParent viewparent = mHost.getParent();
	//    9   18:aload_0         
	//   10   19:getfield        #87  <Field View mHost>
	//   11   22:invokevirtual   #416 <Method android.view.ViewParent View.getParent()>
	//   12   25:astore_3        
		if(viewparent == null)
	//*  13   26:aload_3         
	//*  14   27:ifnonnull       32
		{
			return false;
	//   15   30:iconst_0        
	//   16   31:ireturn         
		} else
		{
			AccessibilityEvent accessibilityevent = createEvent(i, j);
	//   17   32:aload_0         
	//   18   33:iload_1         
	//   19   34:iload_2         
	//   20   35:invokespecial   #553 <Method AccessibilityEvent createEvent(int, int)>
	//   21   38:astore          4
			return ViewParentCompat.requestSendAccessibilityEvent(viewparent, mHost, accessibilityevent);
	//   22   40:aload_3         
	//   23   41:aload_0         
	//   24   42:getfield        #87  <Field View mHost>
	//   25   45:aload           4
	//   26   47:invokestatic    #563 <Method boolean ViewParentCompat.requestSendAccessibilityEvent(android.view.ViewParent, View, AccessibilityEvent)>
	//   27   50:ireturn         
		}
	}

	private static final String DEFAULT_CLASS_NAME = "android.view.View";
	public static final int HOST_ID = -1;
	public static final int INVALID_ID = 0x80000000;
	private static final Rect INVALID_PARENT_BOUNDS = new Rect(0x7fffffff, 0x7fffffff, 0x80000000, 0x80000000);
	private static final FocusStrategy.BoundsAdapter NODE_ADAPTER = new FocusStrategy.BoundsAdapter() {

		public void obtainBounds(AccessibilityNodeInfoCompat accessibilitynodeinfocompat, Rect rect)
		{
			accessibilitynodeinfocompat.getBoundsInParent(rect);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #22  <Method void AccessibilityNodeInfoCompat.getBoundsInParent(Rect)>
		//    3    5:return          
		}

		public volatile void obtainBounds(Object obj, Rect rect)
		{
			obtainBounds((AccessibilityNodeInfoCompat)obj, rect);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #18  <Class AccessibilityNodeInfoCompat>
		//    3    5:aload_2         
		//    4    6:invokevirtual   #25  <Method void obtainBounds(AccessibilityNodeInfoCompat, Rect)>
		//    5    9:return          
		}

	}
;
	private static final FocusStrategy.CollectionAdapter SPARSE_VALUES_ADAPTER = new FocusStrategy.CollectionAdapter() {

		public AccessibilityNodeInfoCompat get(SparseArrayCompat sparsearraycompat, int i)
		{
			return (AccessibilityNodeInfoCompat)sparsearraycompat.valueAt(i);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokevirtual   #22  <Method Object SparseArrayCompat.valueAt(int)>
		//    3    5:checkcast       #24  <Class AccessibilityNodeInfoCompat>
		//    4    8:areturn         
		}

		public volatile Object get(Object obj, int i)
		{
			return ((Object) (get((SparseArrayCompat)obj, i)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #18  <Class SparseArrayCompat>
		//    3    5:iload_2         
		//    4    6:invokevirtual   #29  <Method AccessibilityNodeInfoCompat get(SparseArrayCompat, int)>
		//    5    9:areturn         
		}

		public int size(SparseArrayCompat sparsearraycompat)
		{
			return sparsearraycompat.size();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #34  <Method int SparseArrayCompat.size()>
		//    2    4:ireturn         
		}

		public volatile int size(Object obj)
		{
			return size((SparseArrayCompat)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #18  <Class SparseArrayCompat>
		//    3    5:invokevirtual   #38  <Method int size(SparseArrayCompat)>
		//    4    8:ireturn         
		}

	}
;
	private int mAccessibilityFocusedVirtualViewId;
	private final View mHost;
	private int mHoveredVirtualViewId;
	private int mKeyboardFocusedVirtualViewId;
	private final AccessibilityManager mManager;
	private MyNodeProvider mNodeProvider;
	private final int mTempGlobalRect[] = new int[2];
	private final Rect mTempParentRect = new Rect();
	private final Rect mTempScreenRect = new Rect();
	private final Rect mTempVisibleRect = new Rect();

	static 
	{
	//    0    0:new             #46  <Class Rect>
	//    1    3:dup             
	//    2    4:ldc1            #47  <Int 0x7fffffff>
	//    3    6:ldc1            #47  <Int 0x7fffffff>
	//    4    8:ldc1            #20  <Int 0x80000000>
	//    5   10:ldc1            #20  <Int 0x80000000>
	//    6   12:invokespecial   #51  <Method void Rect(int, int, int, int)>
	//    7   15:putstatic       #53  <Field Rect INVALID_PARENT_BOUNDS>
	//    8   18:new             #6   <Class ExploreByTouchHelper$1>
	//    9   21:dup             
	//   10   22:invokespecial   #55  <Method void ExploreByTouchHelper$1()>
	//   11   25:putstatic       #57  <Field FocusStrategy$BoundsAdapter NODE_ADAPTER>
	//   12   28:new             #8   <Class ExploreByTouchHelper$2>
	//   13   31:dup             
	//   14   32:invokespecial   #58  <Method void ExploreByTouchHelper$2()>
	//   15   35:putstatic       #60  <Field FocusStrategy$CollectionAdapter SPARSE_VALUES_ADAPTER>
	//*  16   38:return          
	}


/*
	static int access$000(ExploreByTouchHelper explorebytouchhelper)
	{
		return explorebytouchhelper.mAccessibilityFocusedVirtualViewId;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field int mAccessibilityFocusedVirtualViewId>
	//    2    4:ireturn         
	}

*/


/*
	static int access$100(ExploreByTouchHelper explorebytouchhelper)
	{
		return explorebytouchhelper.mKeyboardFocusedVirtualViewId;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field int mKeyboardFocusedVirtualViewId>
	//    2    4:ireturn         
	}

*/
}
