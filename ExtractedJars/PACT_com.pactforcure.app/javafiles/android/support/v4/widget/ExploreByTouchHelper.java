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
	private class MyNodeProvider extends AccessibilityNodeProviderCompat
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
		//*   2    2:icmpne          21
				i = mAccessibilityFocusedVirtualViewId;
		//    3    5:aload_0         
		//    4    6:getfield        #13  <Field ExploreByTouchHelper this$0>
		//    5    9:invokestatic    #33  <Method int ExploreByTouchHelper.access$000(ExploreByTouchHelper)>
		//    6   12:istore_1        
			else
		//*   7   13:iload_1         
		//*   8   14:ldc1            #34  <Int 0x80000000>
		//*   9   16:icmpne          32
		//*  10   19:aconst_null     
		//*  11   20:areturn         
				i = mKeyboardFocusedVirtualViewId;
		//   12   21:aload_0         
		//   13   22:getfield        #13  <Field ExploreByTouchHelper this$0>
		//   14   25:invokestatic    #37  <Method int ExploreByTouchHelper.access$100(ExploreByTouchHelper)>
		//   15   28:istore_1        
			if(i == 0x80000000)
				return null;
			else
		//*  16   29:goto            13
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
	//*   1    1:tableswitch     -1 -1: default 20
	//	               -1 27
		default:
			return createEventForChild(i, j);
	//    2   20:aload_0         
	//    3   21:iload_1         
	//    4   22:iload_2         
	//    5   23:invokespecial   #143 <Method AccessibilityEvent createEventForChild(int, int)>
	//    6   26:areturn         

		case -1: 
			return createEventForHost(j);
	//    7   27:aload_0         
	//    8   28:iload_2         
	//    9   29:invokespecial   #147 <Method AccessibilityEvent createEventForHost(int)>
	//   10   32:areturn         
		}
	}

	private AccessibilityEvent createEventForChild(int i, int j)
	{
		AccessibilityEvent accessibilityevent = AccessibilityEvent.obtain(j);
	//    0    0:iload_2         
	//    1    1:invokestatic    #152 <Method AccessibilityEvent AccessibilityEvent.obtain(int)>
	//    2    4:astore_3        
		AccessibilityNodeInfoCompat accessibilitynodeinfocompat = obtainAccessibilityNodeInfo(i);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokevirtual   #156 <Method AccessibilityNodeInfoCompat obtainAccessibilityNodeInfo(int)>
	//    6   10:astore          4
		accessibilityevent.getText().add(((Object) (accessibilitynodeinfocompat.getText())));
	//    7   12:aload_3         
	//    8   13:invokevirtual   #160 <Method List AccessibilityEvent.getText()>
	//    9   16:aload           4
	//   10   18:invokevirtual   #165 <Method CharSequence AccessibilityNodeInfoCompat.getText()>
	//   11   21:invokeinterface #171 <Method boolean List.add(Object)>
	//   12   26:pop             
		accessibilityevent.setContentDescription(accessibilitynodeinfocompat.getContentDescription());
	//   13   27:aload_3         
	//   14   28:aload           4
	//   15   30:invokevirtual   #174 <Method CharSequence AccessibilityNodeInfoCompat.getContentDescription()>
	//   16   33:invokevirtual   #178 <Method void AccessibilityEvent.setContentDescription(CharSequence)>
		accessibilityevent.setScrollable(accessibilitynodeinfocompat.isScrollable());
	//   17   36:aload_3         
	//   18   37:aload           4
	//   19   39:invokevirtual   #181 <Method boolean AccessibilityNodeInfoCompat.isScrollable()>
	//   20   42:invokevirtual   #184 <Method void AccessibilityEvent.setScrollable(boolean)>
		accessibilityevent.setPassword(accessibilitynodeinfocompat.isPassword());
	//   21   45:aload_3         
	//   22   46:aload           4
	//   23   48:invokevirtual   #187 <Method boolean AccessibilityNodeInfoCompat.isPassword()>
	//   24   51:invokevirtual   #190 <Method void AccessibilityEvent.setPassword(boolean)>
		accessibilityevent.setEnabled(accessibilitynodeinfocompat.isEnabled());
	//   25   54:aload_3         
	//   26   55:aload           4
	//   27   57:invokevirtual   #193 <Method boolean AccessibilityNodeInfoCompat.isEnabled()>
	//   28   60:invokevirtual   #196 <Method void AccessibilityEvent.setEnabled(boolean)>
		accessibilityevent.setChecked(accessibilitynodeinfocompat.isChecked());
	//   29   63:aload_3         
	//   30   64:aload           4
	//   31   66:invokevirtual   #199 <Method boolean AccessibilityNodeInfoCompat.isChecked()>
	//   32   69:invokevirtual   #202 <Method void AccessibilityEvent.setChecked(boolean)>
		onPopulateEventForVirtualView(i, accessibilityevent);
	//   33   72:aload_0         
	//   34   73:iload_1         
	//   35   74:aload_3         
	//   36   75:invokevirtual   #206 <Method void onPopulateEventForVirtualView(int, AccessibilityEvent)>
		if(accessibilityevent.getText().isEmpty() && accessibilityevent.getContentDescription() == null)
	//*  37   78:aload_3         
	//*  38   79:invokevirtual   #160 <Method List AccessibilityEvent.getText()>
	//*  39   82:invokeinterface #209 <Method boolean List.isEmpty()>
	//*  40   87:ifeq            107
	//*  41   90:aload_3         
	//*  42   91:invokevirtual   #210 <Method CharSequence AccessibilityEvent.getContentDescription()>
	//*  43   94:ifnonnull       107
		{
			throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
	//   44   97:new             #212 <Class RuntimeException>
	//   45  100:dup             
	//   46  101:ldc1            #214 <String "Callbacks must add text or a content description in populateEventForVirtualViewId()">
	//   47  103:invokespecial   #215 <Method void RuntimeException(String)>
	//   48  106:athrow          
		} else
		{
			accessibilityevent.setClassName(accessibilitynodeinfocompat.getClassName());
	//   49  107:aload_3         
	//   50  108:aload           4
	//   51  110:invokevirtual   #218 <Method CharSequence AccessibilityNodeInfoCompat.getClassName()>
	//   52  113:invokevirtual   #221 <Method void AccessibilityEvent.setClassName(CharSequence)>
			AccessibilityRecordCompat.setSource(((android.view.accessibility.AccessibilityRecord) (accessibilityevent)), mHost, i);
	//   53  116:aload_3         
	//   54  117:aload_0         
	//   55  118:getfield        #87  <Field View mHost>
	//   56  121:iload_1         
	//   57  122:invokestatic    #227 <Method void AccessibilityRecordCompat.setSource(android.view.accessibility.AccessibilityRecord, View, int)>
			accessibilityevent.setPackageName(((CharSequence) (mHost.getContext().getPackageName())));
	//   58  125:aload_3         
	//   59  126:aload_0         
	//   60  127:getfield        #87  <Field View mHost>
	//   61  130:invokevirtual   #93  <Method Context View.getContext()>
	//   62  133:invokevirtual   #231 <Method String Context.getPackageName()>
	//   63  136:invokevirtual   #234 <Method void AccessibilityEvent.setPackageName(CharSequence)>
			return accessibilityevent;
	//   64  139:aload_3         
	//   65  140:areturn         
		}
	}

	private AccessibilityEvent createEventForHost(int i)
	{
		AccessibilityEvent accessibilityevent = AccessibilityEvent.obtain(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #152 <Method AccessibilityEvent AccessibilityEvent.obtain(int)>
	//    2    4:astore_2        
		mHost.onInitializeAccessibilityEvent(accessibilityevent);
	//    3    5:aload_0         
	//    4    6:getfield        #87  <Field View mHost>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #238 <Method void View.onInitializeAccessibilityEvent(AccessibilityEvent)>
		return accessibilityevent;
	//    7   13:aload_2         
	//    8   14:areturn         
	}

	private AccessibilityNodeInfoCompat createNodeForChild(int i)
	{
		AccessibilityNodeInfoCompat accessibilitynodeinfocompat = AccessibilityNodeInfoCompat.obtain();
	//    0    0:invokestatic    #243 <Method AccessibilityNodeInfoCompat AccessibilityNodeInfoCompat.obtain()>
	//    1    3:astore          4
		accessibilitynodeinfocompat.setEnabled(true);
	//    2    5:aload           4
	//    3    7:iconst_1        
	//    4    8:invokevirtual   #244 <Method void AccessibilityNodeInfoCompat.setEnabled(boolean)>
		accessibilitynodeinfocompat.setFocusable(true);
	//    5   11:aload           4
	//    6   13:iconst_1        
	//    7   14:invokevirtual   #245 <Method void AccessibilityNodeInfoCompat.setFocusable(boolean)>
		accessibilitynodeinfocompat.setClassName("android.view.View");
	//    8   17:aload           4
	//    9   19:ldc1            #15  <String "android.view.View">
	//   10   21:invokevirtual   #246 <Method void AccessibilityNodeInfoCompat.setClassName(CharSequence)>
		accessibilitynodeinfocompat.setBoundsInParent(INVALID_PARENT_BOUNDS);
	//   11   24:aload           4
	//   12   26:getstatic       #53  <Field Rect INVALID_PARENT_BOUNDS>
	//   13   29:invokevirtual   #250 <Method void AccessibilityNodeInfoCompat.setBoundsInParent(Rect)>
		accessibilitynodeinfocompat.setBoundsInScreen(INVALID_PARENT_BOUNDS);
	//   14   32:aload           4
	//   15   34:getstatic       #53  <Field Rect INVALID_PARENT_BOUNDS>
	//   16   37:invokevirtual   #253 <Method void AccessibilityNodeInfoCompat.setBoundsInScreen(Rect)>
		accessibilitynodeinfocompat.setParent(mHost);
	//   17   40:aload           4
	//   18   42:aload_0         
	//   19   43:getfield        #87  <Field View mHost>
	//   20   46:invokevirtual   #256 <Method void AccessibilityNodeInfoCompat.setParent(View)>
		onPopulateNodeForVirtualView(i, accessibilitynodeinfocompat);
	//   21   49:aload_0         
	//   22   50:iload_1         
	//   23   51:aload           4
	//   24   53:invokevirtual   #260 <Method void onPopulateNodeForVirtualView(int, AccessibilityNodeInfoCompat)>
		if(accessibilitynodeinfocompat.getText() == null && accessibilitynodeinfocompat.getContentDescription() == null)
	//*  25   56:aload           4
	//*  26   58:invokevirtual   #165 <Method CharSequence AccessibilityNodeInfoCompat.getText()>
	//*  27   61:ifnonnull       83
	//*  28   64:aload           4
	//*  29   66:invokevirtual   #174 <Method CharSequence AccessibilityNodeInfoCompat.getContentDescription()>
	//*  30   69:ifnonnull       83
			throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
	//   31   72:new             #212 <Class RuntimeException>
	//   32   75:dup             
	//   33   76:ldc2            #262 <String "Callbacks must add text or a content description in populateNodeForVirtualViewId()">
	//   34   79:invokespecial   #215 <Method void RuntimeException(String)>
	//   35   82:athrow          
		accessibilitynodeinfocompat.getBoundsInParent(mTempParentRect);
	//   36   83:aload           4
	//   37   85:aload_0         
	//   38   86:getfield        #68  <Field Rect mTempParentRect>
	//   39   89:invokevirtual   #265 <Method void AccessibilityNodeInfoCompat.getBoundsInParent(Rect)>
		if(mTempParentRect.equals(((Object) (INVALID_PARENT_BOUNDS))))
	//*  40   92:aload_0         
	//*  41   93:getfield        #68  <Field Rect mTempParentRect>
	//*  42   96:getstatic       #53  <Field Rect INVALID_PARENT_BOUNDS>
	//*  43   99:invokevirtual   #268 <Method boolean Rect.equals(Object)>
	//*  44  102:ifeq            116
			throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
	//   45  105:new             #212 <Class RuntimeException>
	//   46  108:dup             
	//   47  109:ldc2            #270 <String "Callbacks must set parent bounds in populateNodeForVirtualViewId()">
	//   48  112:invokespecial   #215 <Method void RuntimeException(String)>
	//   49  115:athrow          
		int j = accessibilitynodeinfocompat.getActions();
	//   50  116:aload           4
	//   51  118:invokevirtual   #274 <Method int AccessibilityNodeInfoCompat.getActions()>
	//   52  121:istore_2        
		if((j & 0x40) != 0)
	//*  53  122:iload_2         
	//*  54  123:bipush          64
	//*  55  125:iand            
	//*  56  126:ifeq            140
			throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
	//   57  129:new             #212 <Class RuntimeException>
	//   58  132:dup             
	//   59  133:ldc2            #276 <String "Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()">
	//   60  136:invokespecial   #215 <Method void RuntimeException(String)>
	//   61  139:athrow          
		if((j & 0x80) != 0)
	//*  62  140:iload_2         
	//*  63  141:sipush          128
	//*  64  144:iand            
	//*  65  145:ifeq            159
			throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
	//   66  148:new             #212 <Class RuntimeException>
	//   67  151:dup             
	//   68  152:ldc2            #278 <String "Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()">
	//   69  155:invokespecial   #215 <Method void RuntimeException(String)>
	//   70  158:athrow          
		accessibilitynodeinfocompat.setPackageName(((CharSequence) (mHost.getContext().getPackageName())));
	//   71  159:aload           4
	//   72  161:aload_0         
	//   73  162:getfield        #87  <Field View mHost>
	//   74  165:invokevirtual   #93  <Method Context View.getContext()>
	//   75  168:invokevirtual   #231 <Method String Context.getPackageName()>
	//   76  171:invokevirtual   #279 <Method void AccessibilityNodeInfoCompat.setPackageName(CharSequence)>
		accessibilitynodeinfocompat.setSource(mHost, i);
	//   77  174:aload           4
	//   78  176:aload_0         
	//   79  177:getfield        #87  <Field View mHost>
	//   80  180:iload_1         
	//   81  181:invokevirtual   #281 <Method void AccessibilityNodeInfoCompat.setSource(View, int)>
		boolean flag;
		if(mAccessibilityFocusedVirtualViewId == i)
	//*  82  184:aload_0         
	//*  83  185:getfield        #74  <Field int mAccessibilityFocusedVirtualViewId>
	//*  84  188:iload_1         
	//*  85  189:icmpne          363
		{
			accessibilitynodeinfocompat.setAccessibilityFocused(true);
	//   86  192:aload           4
	//   87  194:iconst_1        
	//   88  195:invokevirtual   #284 <Method void AccessibilityNodeInfoCompat.setAccessibilityFocused(boolean)>
			accessibilitynodeinfocompat.addAction(128);
	//   89  198:aload           4
	//   90  200:sipush          128
	//   91  203:invokevirtual   #288 <Method void AccessibilityNodeInfoCompat.addAction(int)>
		} else
	//*  92  206:aload_0         
	//*  93  207:getfield        #76  <Field int mKeyboardFocusedVirtualViewId>
	//*  94  210:iload_1         
	//*  95  211:icmpne          379
	//*  96  214:iconst_1        
	//*  97  215:istore_3        
	//*  98  216:iload_3         
	//*  99  217:ifeq            384
	//* 100  220:aload           4
	//* 101  222:iconst_2        
	//* 102  223:invokevirtual   #288 <Method void AccessibilityNodeInfoCompat.addAction(int)>
	//* 103  226:aload           4
	//* 104  228:iload_3         
	//* 105  229:invokevirtual   #291 <Method void AccessibilityNodeInfoCompat.setFocused(boolean)>
	//* 106  232:aload_0         
	//* 107  233:getfield        #87  <Field View mHost>
	//* 108  236:aload_0         
	//* 109  237:getfield        #72  <Field int[] mTempGlobalRect>
	//* 110  240:invokevirtual   #295 <Method void View.getLocationOnScreen(int[])>
	//* 111  243:aload           4
	//* 112  245:aload_0         
	//* 113  246:getfield        #66  <Field Rect mTempScreenRect>
	//* 114  249:invokevirtual   #298 <Method void AccessibilityNodeInfoCompat.getBoundsInScreen(Rect)>
	//* 115  252:aload_0         
	//* 116  253:getfield        #66  <Field Rect mTempScreenRect>
	//* 117  256:getstatic       #53  <Field Rect INVALID_PARENT_BOUNDS>
	//* 118  259:invokevirtual   #268 <Method boolean Rect.equals(Object)>
	//* 119  262:ifeq            441
	//* 120  265:aload           4
	//* 121  267:aload_0         
	//* 122  268:getfield        #66  <Field Rect mTempScreenRect>
	//* 123  271:invokevirtual   #265 <Method void AccessibilityNodeInfoCompat.getBoundsInParent(Rect)>
	//* 124  274:aload           4
	//* 125  276:getfield        #301 <Field int AccessibilityNodeInfoCompat.mParentVirtualDescendantId>
	//* 126  279:iconst_m1       
	//* 127  280:icmpeq          406
	//* 128  283:invokestatic    #243 <Method AccessibilityNodeInfoCompat AccessibilityNodeInfoCompat.obtain()>
	//* 129  286:astore          5
	//* 130  288:aload           4
	//* 131  290:getfield        #301 <Field int AccessibilityNodeInfoCompat.mParentVirtualDescendantId>
	//* 132  293:istore_1        
	//* 133  294:iload_1         
	//* 134  295:iconst_m1       
	//* 135  296:icmpeq          401
	//* 136  299:aload           5
	//* 137  301:aload_0         
	//* 138  302:getfield        #87  <Field View mHost>
	//* 139  305:iconst_m1       
	//* 140  306:invokevirtual   #303 <Method void AccessibilityNodeInfoCompat.setParent(View, int)>
	//* 141  309:aload           5
	//* 142  311:getstatic       #53  <Field Rect INVALID_PARENT_BOUNDS>
	//* 143  314:invokevirtual   #250 <Method void AccessibilityNodeInfoCompat.setBoundsInParent(Rect)>
	//* 144  317:aload_0         
	//* 145  318:iload_1         
	//* 146  319:aload           5
	//* 147  321:invokevirtual   #260 <Method void onPopulateNodeForVirtualView(int, AccessibilityNodeInfoCompat)>
	//* 148  324:aload           5
	//* 149  326:aload_0         
	//* 150  327:getfield        #68  <Field Rect mTempParentRect>
	//* 151  330:invokevirtual   #265 <Method void AccessibilityNodeInfoCompat.getBoundsInParent(Rect)>
	//* 152  333:aload_0         
	//* 153  334:getfield        #66  <Field Rect mTempScreenRect>
	//* 154  337:aload_0         
	//* 155  338:getfield        #68  <Field Rect mTempParentRect>
	//* 156  341:getfield        #306 <Field int Rect.left>
	//* 157  344:aload_0         
	//* 158  345:getfield        #68  <Field Rect mTempParentRect>
	//* 159  348:getfield        #309 <Field int Rect.top>
	//* 160  351:invokevirtual   #313 <Method void Rect.offset(int, int)>
	//* 161  354:aload           5
	//* 162  356:getfield        #301 <Field int AccessibilityNodeInfoCompat.mParentVirtualDescendantId>
	//* 163  359:istore_1        
	//* 164  360:goto            294
		{
			accessibilitynodeinfocompat.setAccessibilityFocused(false);
	//  165  363:aload           4
	//  166  365:iconst_0        
	//  167  366:invokevirtual   #284 <Method void AccessibilityNodeInfoCompat.setAccessibilityFocused(boolean)>
			accessibilitynodeinfocompat.addAction(64);
	//  168  369:aload           4
	//  169  371:bipush          64
	//  170  373:invokevirtual   #288 <Method void AccessibilityNodeInfoCompat.addAction(int)>
		}
		if(mKeyboardFocusedVirtualViewId == i)
			flag = true;
		else
	//* 171  376:goto            206
			flag = false;
	//  172  379:iconst_0        
	//  173  380:istore_3        
		if(flag)
			accessibilitynodeinfocompat.addAction(2);
		else
	//* 174  381:goto            216
		if(accessibilitynodeinfocompat.isFocusable())
	//* 175  384:aload           4
	//* 176  386:invokevirtual   #316 <Method boolean AccessibilityNodeInfoCompat.isFocusable()>
	//* 177  389:ifeq            226
			accessibilitynodeinfocompat.addAction(1);
	//  178  392:aload           4
	//  179  394:iconst_1        
	//  180  395:invokevirtual   #288 <Method void AccessibilityNodeInfoCompat.addAction(int)>
		accessibilitynodeinfocompat.setFocused(flag);
		mHost.getLocationOnScreen(mTempGlobalRect);
		accessibilitynodeinfocompat.getBoundsInScreen(mTempScreenRect);
		if(mTempScreenRect.equals(((Object) (INVALID_PARENT_BOUNDS))))
		{
			accessibilitynodeinfocompat.getBoundsInParent(mTempScreenRect);
			if(accessibilitynodeinfocompat.mParentVirtualDescendantId != -1)
			{
				AccessibilityNodeInfoCompat accessibilitynodeinfocompat1 = AccessibilityNodeInfoCompat.obtain();
				for(i = accessibilitynodeinfocompat.mParentVirtualDescendantId; i != -1; i = accessibilitynodeinfocompat1.mParentVirtualDescendantId)
				{
					accessibilitynodeinfocompat1.setParent(mHost, -1);
					accessibilitynodeinfocompat1.setBoundsInParent(INVALID_PARENT_BOUNDS);
					onPopulateNodeForVirtualView(i, accessibilitynodeinfocompat1);
					accessibilitynodeinfocompat1.getBoundsInParent(mTempParentRect);
					mTempScreenRect.offset(mTempParentRect.left, mTempParentRect.top);
				}

	//* 181  398:goto            226
				accessibilitynodeinfocompat1.recycle();
	//  182  401:aload           5
	//  183  403:invokevirtual   #319 <Method void AccessibilityNodeInfoCompat.recycle()>
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
	//  192  420:invokevirtual   #322 <Method int View.getScrollX()>
	//  193  423:isub            
	//  194  424:aload_0         
	//  195  425:getfield        #72  <Field int[] mTempGlobalRect>
	//  196  428:iconst_1        
	//  197  429:iaload          
	//  198  430:aload_0         
	//  199  431:getfield        #87  <Field View mHost>
	//  200  434:invokevirtual   #325 <Method int View.getScrollY()>
	//  201  437:isub            
	//  202  438:invokevirtual   #313 <Method void Rect.offset(int, int)>
		}
		if(mHost.getLocalVisibleRect(mTempVisibleRect))
	//* 203  441:aload_0         
	//* 204  442:getfield        #87  <Field View mHost>
	//* 205  445:aload_0         
	//* 206  446:getfield        #70  <Field Rect mTempVisibleRect>
	//* 207  449:invokevirtual   #329 <Method boolean View.getLocalVisibleRect(Rect)>
	//* 208  452:ifeq            530
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
	//  217  469:invokevirtual   #322 <Method int View.getScrollX()>
	//  218  472:isub            
	//  219  473:aload_0         
	//  220  474:getfield        #72  <Field int[] mTempGlobalRect>
	//  221  477:iconst_1        
	//  222  478:iaload          
	//  223  479:aload_0         
	//  224  480:getfield        #87  <Field View mHost>
	//  225  483:invokevirtual   #325 <Method int View.getScrollY()>
	//  226  486:isub            
	//  227  487:invokevirtual   #313 <Method void Rect.offset(int, int)>
			if(mTempScreenRect.intersect(mTempVisibleRect))
	//* 228  490:aload_0         
	//* 229  491:getfield        #66  <Field Rect mTempScreenRect>
	//* 230  494:aload_0         
	//* 231  495:getfield        #70  <Field Rect mTempVisibleRect>
	//* 232  498:invokevirtual   #332 <Method boolean Rect.intersect(Rect)>
	//* 233  501:ifeq            530
			{
				accessibilitynodeinfocompat.setBoundsInScreen(mTempScreenRect);
	//  234  504:aload           4
	//  235  506:aload_0         
	//  236  507:getfield        #66  <Field Rect mTempScreenRect>
	//  237  510:invokevirtual   #253 <Method void AccessibilityNodeInfoCompat.setBoundsInScreen(Rect)>
				if(isVisibleToUser(mTempScreenRect))
	//* 238  513:aload_0         
	//* 239  514:aload_0         
	//* 240  515:getfield        #66  <Field Rect mTempScreenRect>
	//* 241  518:invokespecial   #335 <Method boolean isVisibleToUser(Rect)>
	//* 242  521:ifeq            530
					accessibilitynodeinfocompat.setVisibleToUser(true);
	//  243  524:aload           4
	//  244  526:iconst_1        
	//  245  527:invokevirtual   #338 <Method void AccessibilityNodeInfoCompat.setVisibleToUser(boolean)>
			}
		}
		return accessibilitynodeinfocompat;
	//  246  530:aload           4
	//  247  532:areturn         
	}

	private AccessibilityNodeInfoCompat createNodeForHost()
	{
		AccessibilityNodeInfoCompat accessibilitynodeinfocompat = AccessibilityNodeInfoCompat.obtain(mHost);
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field View mHost>
	//    2    4:invokestatic    #343 <Method AccessibilityNodeInfoCompat AccessibilityNodeInfoCompat.obtain(View)>
	//    3    7:astore_3        
		ViewCompat.onInitializeAccessibilityNodeInfo(mHost, accessibilitynodeinfocompat);
	//    4    8:aload_0         
	//    5    9:getfield        #87  <Field View mHost>
	//    6   12:aload_3         
	//    7   13:invokestatic    #347 <Method void ViewCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
		ArrayList arraylist = new ArrayList();
	//    8   16:new             #349 <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #350 <Method void ArrayList()>
	//   11   23:astore          4
		getVisibleVirtualViews(((List) (arraylist)));
	//   12   25:aload_0         
	//   13   26:aload           4
	//   14   28:invokevirtual   #354 <Method void getVisibleVirtualViews(List)>
		if(accessibilitynodeinfocompat.getChildCount() > 0 && arraylist.size() > 0)
	//*  15   31:aload_3         
	//*  16   32:invokevirtual   #357 <Method int AccessibilityNodeInfoCompat.getChildCount()>
	//*  17   35:ifle            57
	//*  18   38:aload           4
	//*  19   40:invokevirtual   #360 <Method int ArrayList.size()>
	//*  20   43:ifle            57
			throw new RuntimeException("Views cannot have both real and virtual children");
	//   21   46:new             #212 <Class RuntimeException>
	//   22   49:dup             
	//   23   50:ldc2            #362 <String "Views cannot have both real and virtual children">
	//   24   53:invokespecial   #215 <Method void RuntimeException(String)>
	//   25   56:athrow          
		int i = 0;
	//   26   57:iconst_0        
	//   27   58:istore_1        
		for(int j = arraylist.size(); i < j; i++)
	//*  28   59:aload           4
	//*  29   61:invokevirtual   #360 <Method int ArrayList.size()>
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
	//   39   78:invokevirtual   #366 <Method Object ArrayList.get(int)>
	//   40   81:checkcast       #368 <Class Integer>
	//   41   84:invokevirtual   #371 <Method int Integer.intValue()>
	//   42   87:invokevirtual   #374 <Method void AccessibilityNodeInfoCompat.addChild(View, int)>

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
	//    0    0:new             #349 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #350 <Method void ArrayList()>
	//    3    7:astore_2        
		getVisibleVirtualViews(((List) (arraylist)));
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #354 <Method void getVisibleVirtualViews(List)>
		SparseArrayCompat sparsearraycompat = new SparseArrayCompat();
	//    7   13:new             #378 <Class SparseArrayCompat>
	//    8   16:dup             
	//    9   17:invokespecial   #379 <Method void SparseArrayCompat()>
	//   10   20:astore_3        
		for(int i = 0; i < ((List) (arraylist)).size(); i++)
	//*  11   21:iconst_0        
	//*  12   22:istore_1        
	//*  13   23:iload_1         
	//*  14   24:aload_2         
	//*  15   25:invokeinterface #380 <Method int List.size()>
	//*  16   30:icmpge          50
			sparsearraycompat.put(i, ((Object) (createNodeForChild(i))));
	//   17   33:aload_3         
	//   18   34:iload_1         
	//   19   35:aload_0         
	//   20   36:iload_1         
	//   21   37:invokespecial   #382 <Method AccessibilityNodeInfoCompat createNodeForChild(int)>
	//   22   40:invokevirtual   #386 <Method void SparseArrayCompat.put(int, Object)>

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
	//    2    2:invokevirtual   #156 <Method AccessibilityNodeInfoCompat obtainAccessibilityNodeInfo(int)>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #265 <Method void AccessibilityNodeInfoCompat.getBoundsInParent(Rect)>
	//    5    9:return          
	}

	private static Rect guessPreviouslyFocusedRect(View view, int i, Rect rect)
	{
		int j = view.getWidth();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #394 <Method int View.getWidth()>
	//    2    4:istore_3        
		int k = view.getHeight();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #397 <Method int View.getHeight()>
	//    5    9:istore          4
		switch(i)
	//*   6   11:iload_1         
		{
	//*   7   12:lookupswitch    4: default 56
	//	               17: 67
	//	               33: 78
	//	               66: 90
	//	               130: 101
		default:
			throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
	//    8   56:new             #80  <Class IllegalArgumentException>
	//    9   59:dup             
	//   10   60:ldc2            #399 <String "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.">
	//   11   63:invokespecial   #85  <Method void IllegalArgumentException(String)>
	//   12   66:athrow          

		case 17: // '\021'
			rect.set(j, 0, j, k);
	//   13   67:aload_2         
	//   14   68:iload_3         
	//   15   69:iconst_0        
	//   16   70:iload_3         
	//   17   71:iload           4
	//   18   73:invokevirtual   #402 <Method void Rect.set(int, int, int, int)>
			return rect;
	//   19   76:aload_2         
	//   20   77:areturn         

		case 33: // '!'
			rect.set(0, k, j, k);
	//   21   78:aload_2         
	//   22   79:iconst_0        
	//   23   80:iload           4
	//   24   82:iload_3         
	//   25   83:iload           4
	//   26   85:invokevirtual   #402 <Method void Rect.set(int, int, int, int)>
			return rect;
	//   27   88:aload_2         
	//   28   89:areturn         

		case 66: // 'B'
			rect.set(-1, 0, -1, k);
	//   29   90:aload_2         
	//   30   91:iconst_m1       
	//   31   92:iconst_0        
	//   32   93:iconst_m1       
	//   33   94:iload           4
	//   34   96:invokevirtual   #402 <Method void Rect.set(int, int, int, int)>
			return rect;
	//   35   99:aload_2         
	//   36  100:areturn         

		case 130: 
			rect.set(0, -1, j, -1);
	//   37  101:aload_2         
	//   38  102:iconst_0        
	//   39  103:iconst_m1       
	//   40  104:iload_3         
	//   41  105:iconst_m1       
	//   42  106:invokevirtual   #402 <Method void Rect.set(int, int, int, int)>
			break;
		}
		return rect;
	//   43  109:aload_2         
	//   44  110:areturn         
	}

	private boolean isVisibleToUser(Rect rect)
	{
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #404 <Method boolean Rect.isEmpty()>
	//*   4    8:ifeq            13
_L2:
		return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		if(rect == null || rect.isEmpty() || mHost.getWindowVisibility() != 0) goto _L2; else goto _L1
	//    7   13:aload_0         
	//    8   14:getfield        #87  <Field View mHost>
	//    9   17:invokevirtual   #407 <Method int View.getWindowVisibility()>
	//   10   20:ifne            11
_L1:
		rect = ((Rect) (mHost.getParent()));
	//   11   23:aload_0         
	//   12   24:getfield        #87  <Field View mHost>
	//   13   27:invokevirtual   #411 <Method android.view.ViewParent View.getParent()>
	//   14   30:astore_1        
_L4:
		if(!(rect instanceof View))
			continue; /* Loop/switch isn't completed */
	//   15   31:aload_1         
	//   16   32:instanceof      #89  <Class View>
	//   17   35:ifeq            67
		rect = ((Rect) ((View)rect));
	//   18   38:aload_1         
	//   19   39:checkcast       #89  <Class View>
	//   20   42:astore_1        
		if(((View) (rect)).getAlpha() <= 0.0F || ((View) (rect)).getVisibility() != 0) goto _L2; else goto _L3
	//   21   43:aload_1         
	//   22   44:invokevirtual   #415 <Method float View.getAlpha()>
	//   23   47:fconst_0        
	//   24   48:fcmpg           
	//   25   49:ifle            11
	//   26   52:aload_1         
	//   27   53:invokevirtual   #418 <Method int View.getVisibility()>
	//   28   56:ifne            11
_L3:
		rect = ((Rect) (((View) (rect)).getParent()));
	//   29   59:aload_1         
	//   30   60:invokevirtual   #411 <Method android.view.ViewParent View.getParent()>
	//   31   63:astore_1        
		  goto _L4
	//*  32   64:goto            31
		if(rect == null) goto _L2; else goto _L5
	//   33   67:aload_1         
	//   34   68:ifnull          11
_L5:
		return true;
	//   35   71:iconst_1        
	//   36   72:ireturn         
	}

	private static int keyToDirection(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     19 22: default 32
	//	               19 39
	//	               20 32
	//	               21 36
	//	               22 42
		case 20: // '\024'
		default:
			return 130;
	//    2   32:sipush          130
	//    3   35:ireturn         

		case 21: // '\025'
			return 17;
	//    4   36:bipush          17
	//    5   38:ireturn         

		case 19: // '\023'
			return 33;
	//    6   39:bipush          33
	//    7   41:ireturn         

		case 22: // '\026'
			return 66;
	//    8   42:bipush          66
	//    9   44:ireturn         
		}
	}

	private boolean moveFocus(int i, Rect rect)
	{
		AccessibilityNodeInfoCompat accessibilitynodeinfocompat;
		SparseArrayCompat sparsearraycompat;
		sparsearraycompat = getAllNodes();
	//    0    0:aload_0         
	//    1    1:invokespecial   #425 <Method SparseArrayCompat getAllNodes()>
	//    2    4:astore          6
		int j = mKeyboardFocusedVirtualViewId;
	//    3    6:aload_0         
	//    4    7:getfield        #76  <Field int mKeyboardFocusedVirtualViewId>
	//    5   10:istore_3        
		if(j == 0x80000000)
	//*   6   11:iload_3         
	//*   7   12:ldc1            #20  <Int 0x80000000>
	//*   8   14:icmpne          91
			accessibilitynodeinfocompat = null;
	//    9   17:aconst_null     
	//   10   18:astore          5
		else
	//*  11   20:iload_1         
	//*  12   21:lookupswitch    6: default 80
	//	               1: 105
	//	               2: 105
	//	               17: 159
	//	               33: 159
	//	               66: 159
	//	               130: 159
	//*  13   80:new             #80  <Class IllegalArgumentException>
	//*  14   83:dup             
	//*  15   84:ldc2            #427 <String "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.">
	//*  16   87:invokespecial   #85  <Method void IllegalArgumentException(String)>
	//*  17   90:athrow          
			accessibilitynodeinfocompat = (AccessibilityNodeInfoCompat)sparsearraycompat.get(j);
	//   18   91:aload           6
	//   19   93:iload_3         
	//   20   94:invokevirtual   #428 <Method Object SparseArrayCompat.get(int)>
	//   21   97:checkcast       #162 <Class AccessibilityNodeInfoCompat>
	//   22  100:astore          5
		switch(i)
		{
		default:
			throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");

		case 17: // '\021'
		case 33: // '!'
		case 66: // 'B'
		case 130: 
			break MISSING_BLOCK_LABEL_159;

	//*  23  102:goto            20
		case 1: // '\001'
		case 2: // '\002'
			boolean flag;
			if(ViewCompat.getLayoutDirection(mHost) == 1)
	//*  24  105:aload_0         
	//*  25  106:getfield        #87  <Field View mHost>
	//*  26  109:invokestatic    #431 <Method int ViewCompat.getLayoutDirection(View)>
	//*  27  112:iconst_1        
	//*  28  113:icmpne          153
				flag = true;
	//   29  116:iconst_1        
	//   30  117:istore          4
			else
	//*  31  119:aload           6
	//*  32  121:getstatic       #60  <Field FocusStrategy$CollectionAdapter SPARSE_VALUES_ADAPTER>
	//*  33  124:getstatic       #57  <Field FocusStrategy$BoundsAdapter NODE_ADAPTER>
	//*  34  127:aload           5
	//*  35  129:iload_1         
	//*  36  130:iload           4
	//*  37  132:iconst_0        
	//*  38  133:invokestatic    #437 <Method Object FocusStrategy.findNextFocusInRelativeDirection(Object, FocusStrategy$CollectionAdapter, FocusStrategy$BoundsAdapter, Object, int, boolean, boolean)>
	//*  39  136:checkcast       #162 <Class AccessibilityNodeInfoCompat>
	//*  40  139:astore_2        
	//*  41  140:aload_2         
	//*  42  141:ifnonnull       237
	//*  43  144:ldc1            #20  <Int 0x80000000>
	//*  44  146:istore_1        
	//*  45  147:aload_0         
	//*  46  148:iload_1         
	//*  47  149:invokevirtual   #440 <Method boolean requestKeyboardFocusForVirtualView(int)>
	//*  48  152:ireturn         
				flag = false;
	//   49  153:iconst_0        
	//   50  154:istore          4
			rect = ((Rect) ((AccessibilityNodeInfoCompat)FocusStrategy.findNextFocusInRelativeDirection(((Object) (sparsearraycompat)), SPARSE_VALUES_ADAPTER, NODE_ADAPTER, ((Object) (accessibilitynodeinfocompat)), i, flag, false)));
			break;
		}
_L1:
		Rect rect1;
		if(rect == null)
			i = 0x80000000;
		else
	//*  51  156:goto            119
	//*  52  159:new             #46  <Class Rect>
	//*  53  162:dup             
	//*  54  163:invokespecial   #64  <Method void Rect()>
	//*  55  166:astore          7
	//*  56  168:aload_0         
	//*  57  169:getfield        #76  <Field int mKeyboardFocusedVirtualViewId>
	//*  58  172:ldc1            #20  <Int 0x80000000>
	//*  59  174:icmpeq          210
	//*  60  177:aload_0         
	//*  61  178:aload_0         
	//*  62  179:getfield        #76  <Field int mKeyboardFocusedVirtualViewId>
	//*  63  182:aload           7
	//*  64  184:invokespecial   #442 <Method void getBoundsInParent(int, Rect)>
	//*  65  187:aload           6
	//*  66  189:getstatic       #60  <Field FocusStrategy$CollectionAdapter SPARSE_VALUES_ADAPTER>
	//*  67  192:getstatic       #57  <Field FocusStrategy$BoundsAdapter NODE_ADAPTER>
	//*  68  195:aload           5
	//*  69  197:aload           7
	//*  70  199:iload_1         
	//*  71  200:invokestatic    #446 <Method Object FocusStrategy.findNextFocusInAbsoluteDirection(Object, FocusStrategy$CollectionAdapter, FocusStrategy$BoundsAdapter, Object, Rect, int)>
	//*  72  203:checkcast       #162 <Class AccessibilityNodeInfoCompat>
	//*  73  206:astore_2        
	//*  74  207:goto            140
	//*  75  210:aload_2         
	//*  76  211:ifnull          223
	//*  77  214:aload           7
	//*  78  216:aload_2         
	//*  79  217:invokevirtual   #448 <Method void Rect.set(Rect)>
	//*  80  220:goto            187
	//*  81  223:aload_0         
	//*  82  224:getfield        #87  <Field View mHost>
	//*  83  227:iload_1         
	//*  84  228:aload           7
	//*  85  230:invokestatic    #450 <Method Rect guessPreviouslyFocusedRect(View, int, Rect)>
	//*  86  233:pop             
	//*  87  234:goto            187
			i = sparsearraycompat.keyAt(sparsearraycompat.indexOfValue(((Object) (rect))));
	//   88  237:aload           6
	//   89  239:aload           6
	//   90  241:aload_2         
	//   91  242:invokevirtual   #454 <Method int SparseArrayCompat.indexOfValue(Object)>
	//   92  245:invokevirtual   #457 <Method int SparseArrayCompat.keyAt(int)>
	//   93  248:istore_1        
		return requestKeyboardFocusForVirtualView(i);
		rect1 = new Rect();
		if(mKeyboardFocusedVirtualViewId != 0x80000000)
			getBoundsInParent(mKeyboardFocusedVirtualViewId, rect1);
		else
		if(rect != null)
			rect1.set(rect);
		else
			guessPreviouslyFocusedRect(mHost, i, rect1);
		rect = ((Rect) ((AccessibilityNodeInfoCompat)FocusStrategy.findNextFocusInAbsoluteDirection(((Object) (sparsearraycompat)), SPARSE_VALUES_ADAPTER, NODE_ADAPTER, ((Object) (accessibilitynodeinfocompat)), rect1, i)));
		  goto _L1
	//*  94  249:goto            147
	}

	private boolean performActionForChild(int i, int j, Bundle bundle)
	{
		switch(j)
	//*   0    0:iload_2         
		{
	//*   1    1:lookupswitch    4: default 44
	//	               1: 64
	//	               2: 70
	//	               64: 52
	//	               128: 58
		default:
			return onPerformActionForVirtualView(i, j, bundle);
	//    2   44:aload_0         
	//    3   45:iload_1         
	//    4   46:iload_2         
	//    5   47:aload_3         
	//    6   48:invokevirtual   #138 <Method boolean onPerformActionForVirtualView(int, int, Bundle)>
	//    7   51:ireturn         

		case 64: // '@'
			return requestAccessibilityFocus(i);
	//    8   52:aload_0         
	//    9   53:iload_1         
	//   10   54:invokespecial   #461 <Method boolean requestAccessibilityFocus(int)>
	//   11   57:ireturn         

		case 128: 
			return clearAccessibilityFocus(i);
	//   12   58:aload_0         
	//   13   59:iload_1         
	//   14   60:invokespecial   #463 <Method boolean clearAccessibilityFocus(int)>
	//   15   63:ireturn         

		case 1: // '\001'
			return requestKeyboardFocusForVirtualView(i);
	//   16   64:aload_0         
	//   17   65:iload_1         
	//   18   66:invokevirtual   #440 <Method boolean requestKeyboardFocusForVirtualView(int)>
	//   19   69:ireturn         

		case 2: // '\002'
			return clearKeyboardFocusForVirtualView(i);
	//   20   70:aload_0         
	//   21   71:iload_1         
	//   22   72:invokevirtual   #466 <Method boolean clearKeyboardFocusForVirtualView(int)>
	//   23   75:ireturn         
		}
	}

	private boolean performActionForHost(int i, Bundle bundle)
	{
		return ViewCompat.performAccessibilityAction(mHost, i, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field View mHost>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #472 <Method boolean ViewCompat.performAccessibilityAction(View, int, Bundle)>
	//    5    9:ireturn         
	}

	private boolean requestAccessibilityFocus(int i)
	{
		while(!mManager.isEnabled() || !mManager.isTouchExplorationEnabled() || mAccessibilityFocusedVirtualViewId == i) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #105 <Field AccessibilityManager mManager>
	//*   2    4:invokevirtual   #473 <Method boolean AccessibilityManager.isEnabled()>
	//*   3    7:ifeq            20
	//*   4   10:aload_0         
	//*   5   11:getfield        #105 <Field AccessibilityManager mManager>
	//*   6   14:invokevirtual   #476 <Method boolean AccessibilityManager.isTouchExplorationEnabled()>
	//*   7   17:ifne            22
			return false;
	//    8   20:iconst_0        
	//    9   21:ireturn         
	//   10   22:aload_0         
	//   11   23:getfield        #74  <Field int mAccessibilityFocusedVirtualViewId>
	//   12   26:iload_1         
	//   13   27:icmpeq          20
		if(mAccessibilityFocusedVirtualViewId != 0x80000000)
	//*  14   30:aload_0         
	//*  15   31:getfield        #74  <Field int mAccessibilityFocusedVirtualViewId>
	//*  16   34:ldc1            #20  <Int 0x80000000>
	//*  17   36:icmpeq          48
			clearAccessibilityFocus(mAccessibilityFocusedVirtualViewId);
	//   18   39:aload_0         
	//   19   40:aload_0         
	//   20   41:getfield        #74  <Field int mAccessibilityFocusedVirtualViewId>
	//   21   44:invokespecial   #463 <Method boolean clearAccessibilityFocus(int)>
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
	//   31   62:ldc2            #477 <Int 32768>
	//   32   65:invokevirtual   #132 <Method boolean sendEventForVirtualView(int, int)>
	//   33   68:pop             
		return true;
	//   34   69:iconst_1        
	//   35   70:ireturn         
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
	//   12   19:invokevirtual   #482 <Method void onVirtualViewKeyboardFocusChanged(int, boolean)>
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
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		if(mManager.isEnabled() && mManager.isTouchExplorationEnabled())
	//*   2    2:aload_0         
	//*   3    3:getfield        #105 <Field AccessibilityManager mManager>
	//*   4    6:invokevirtual   #473 <Method boolean AccessibilityManager.isEnabled()>
	//*   5    9:ifeq            22
	//*   6   12:aload_0         
	//*   7   13:getfield        #105 <Field AccessibilityManager mManager>
	//*   8   16:invokevirtual   #476 <Method boolean AccessibilityManager.isTouchExplorationEnabled()>
	//*   9   19:ifne            24
	//*  10   22:iconst_0        
	//*  11   23:ireturn         
		{
			switch(motionevent.getAction())
	//*  12   24:aload_1         
	//*  13   25:invokevirtual   #489 <Method int MotionEvent.getAction()>
			{
	//*  14   28:tableswitch     7 10: default 60
	//	               7 62
	//	               8 60
	//	               9 62
	//	               10 93
			case 8: // '\b'
			default:
				return false;
	//   15   60:iconst_0        
	//   16   61:ireturn         

			case 7: // '\007'
			case 9: // '\t'
				int i = getVirtualViewAt(motionevent.getX(), motionevent.getY());
	//   17   62:aload_0         
	//   18   63:aload_1         
	//   19   64:invokevirtual   #492 <Method float MotionEvent.getX()>
	//   20   67:aload_1         
	//   21   68:invokevirtual   #495 <Method float MotionEvent.getY()>
	//   22   71:invokevirtual   #499 <Method int getVirtualViewAt(float, float)>
	//   23   74:istore_2        
				updateHoveredVirtualView(i);
	//   24   75:aload_0         
	//   25   76:iload_2         
	//   26   77:invokespecial   #501 <Method void updateHoveredVirtualView(int)>
				if(i == 0x80000000)
	//*  27   80:iload_2         
	//*  28   81:ldc1            #20  <Int 0x80000000>
	//*  29   83:icmpeq          88
	//*  30   86:iload_3         
	//*  31   87:ireturn         
					flag = false;
	//   32   88:iconst_0        
	//   33   89:istore_3        
				return flag;

			case 10: // '\n'
				break;
			}
	//*  34   90:goto            86
			if(mAccessibilityFocusedVirtualViewId != 0x80000000)
	//*  35   93:aload_0         
	//*  36   94:getfield        #74  <Field int mAccessibilityFocusedVirtualViewId>
	//*  37   97:ldc1            #20  <Int 0x80000000>
	//*  38   99:icmpeq          22
			{
				updateHoveredVirtualView(0x80000000);
	//   39  102:aload_0         
	//   40  103:ldc1            #20  <Int 0x80000000>
	//   41  105:invokespecial   #501 <Method void updateHoveredVirtualView(int)>
				return true;
	//   42  108:iconst_1        
	//   43  109:ireturn         
			}
		}
		return false;
	}

	public final boolean dispatchKeyEvent(KeyEvent keyevent)
	{
		boolean flag;
		boolean flag1;
		boolean flag2;
		flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore          7
		flag = false;
	//    2    3:iconst_0        
	//    3    4:istore          5
		flag1 = flag;
	//    4    6:iload           5
	//    5    8:istore          6
		if(keyevent.getAction() == 1) goto _L2; else goto _L1
	//    6   10:aload_1         
	//    7   11:invokevirtual   #506 <Method int KeyEvent.getAction()>
	//    8   14:iconst_1        
	//    9   15:icmpeq          96
_L1:
		int i = keyevent.getKeyCode();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #509 <Method int KeyEvent.getKeyCode()>
	//   12   22:istore_2        
		i;
	//   13   23:iload_2         
		JVM INSTR lookupswitch 7: default 92
	//	               19: 99
	//	               20: 99
	//	               21: 99
	//	               22: 99
	//	               23: 162
	//	               61: 191
	//	               66: 162;
	//   14   24:lookupswitch    7: default 92
	//	               19: 99
	//	               20: 99
	//	               21: 99
	//	               22: 99
	//	               23: 162
	//	               61: 191
	//	               66: 162
		   goto _L3 _L4 _L4 _L4 _L4 _L5 _L6 _L5
_L3:
		flag1 = flag;
	//   15   92:iload           5
	//   16   94:istore          6
_L2:
		return flag1;
	//   17   96:iload           6
	//   18   98:ireturn         
_L4:
		flag1 = flag;
	//   19   99:iload           5
	//   20  101:istore          6
		if(!keyevent.hasNoModifiers())
			continue; /* Loop/switch isn't completed */
	//   21  103:aload_1         
	//   22  104:invokevirtual   #512 <Method boolean KeyEvent.hasNoModifiers()>
	//   23  107:ifeq            96
		int j = keyToDirection(i);
	//   24  110:iload_2         
	//   25  111:invokestatic    #514 <Method int keyToDirection(int)>
	//   26  114:istore_3        
		int k = keyevent.getRepeatCount();
	//   27  115:aload_1         
	//   28  116:invokevirtual   #517 <Method int KeyEvent.getRepeatCount()>
	//   29  119:istore          4
		i = 0;
	//   30  121:iconst_0        
	//   31  122:istore_2        
		flag = flag2;
	//   32  123:iload           7
	//   33  125:istore          5
		do
		{
			flag1 = flag;
	//   34  127:iload           5
	//   35  129:istore          6
			if(i >= k + 1)
				continue; /* Loop/switch isn't completed */
	//   36  131:iload_2         
	//   37  132:iload           4
	//   38  134:iconst_1        
	//   39  135:iadd            
	//   40  136:icmpge          96
			flag1 = flag;
	//   41  139:iload           5
	//   42  141:istore          6
			if(!moveFocus(j, ((Rect) (null))))
				continue; /* Loop/switch isn't completed */
	//   43  143:aload_0         
	//   44  144:iload_3         
	//   45  145:aconst_null     
	//   46  146:invokespecial   #519 <Method boolean moveFocus(int, Rect)>
	//   47  149:ifeq            96
			flag = true;
	//   48  152:iconst_1        
	//   49  153:istore          5
			i++;
	//   50  155:iload_2         
	//   51  156:iconst_1        
	//   52  157:iadd            
	//   53  158:istore_2        
		} while(true);
	//   54  159:goto            127
_L5:
		flag1 = flag;
	//   55  162:iload           5
	//   56  164:istore          6
		if(keyevent.hasNoModifiers())
	//*  57  166:aload_1         
	//*  58  167:invokevirtual   #512 <Method boolean KeyEvent.hasNoModifiers()>
	//*  59  170:ifeq            96
		{
			flag1 = flag;
	//   60  173:iload           5
	//   61  175:istore          6
			if(keyevent.getRepeatCount() == 0)
	//*  62  177:aload_1         
	//*  63  178:invokevirtual   #517 <Method int KeyEvent.getRepeatCount()>
	//*  64  181:ifne            96
			{
				clickKeyboardFocusedVirtualView();
	//   65  184:aload_0         
	//   66  185:invokespecial   #521 <Method boolean clickKeyboardFocusedVirtualView()>
	//   67  188:pop             
				return true;
	//   68  189:iconst_1        
	//   69  190:ireturn         
			}
		}
		continue; /* Loop/switch isn't completed */
_L6:
		if(keyevent.hasNoModifiers())
	//*  70  191:aload_1         
	//*  71  192:invokevirtual   #512 <Method boolean KeyEvent.hasNoModifiers()>
	//*  72  195:ifeq            205
			return moveFocus(2, ((Rect) (null)));
	//   73  198:aload_0         
	//   74  199:iconst_2        
	//   75  200:aconst_null     
	//   76  201:invokespecial   #519 <Method boolean moveFocus(int, Rect)>
	//   77  204:ireturn         
		flag1 = flag;
	//   78  205:iload           5
	//   79  207:istore          6
		if(keyevent.hasModifiers(1))
	//*  80  209:aload_1         
	//*  81  210:iconst_1        
	//*  82  211:invokevirtual   #524 <Method boolean KeyEvent.hasModifiers(int)>
	//*  83  214:ifeq            96
			return moveFocus(1, ((Rect) (null)));
	//   84  217:aload_0         
	//   85  218:iconst_1        
	//   86  219:aconst_null     
	//   87  220:invokespecial   #519 <Method boolean moveFocus(int, Rect)>
	//   88  223:ireturn         
		if(true) goto _L2; else goto _L7
_L7:
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
	//*   1    1:getfield        #529 <Field ExploreByTouchHelper$MyNodeProvider mNodeProvider>
	//*   2    4:ifnonnull       19
			mNodeProvider = new MyNodeProvider();
	//    3    7:aload_0         
	//    4    8:new             #10  <Class ExploreByTouchHelper$MyNodeProvider>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #532 <Method void ExploreByTouchHelper$MyNodeProvider(ExploreByTouchHelper)>
	//    8   16:putfield        #529 <Field ExploreByTouchHelper$MyNodeProvider mNodeProvider>
		return ((AccessibilityNodeProviderCompat) (mNodeProvider));
	//    9   19:aload_0         
	//   10   20:getfield        #529 <Field ExploreByTouchHelper$MyNodeProvider mNodeProvider>
	//   11   23:areturn         
	}

	public int getFocusedVirtualView()
	{
		return getAccessibilityFocusedVirtualViewId();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #536 <Method int getAccessibilityFocusedVirtualViewId()>
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
	//    3    3:invokevirtual   #542 <Method void invalidateVirtualView(int, int)>
	//    4    6:return          
	}

	public final void invalidateVirtualView(int i)
	{
		invalidateVirtualView(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #542 <Method void invalidateVirtualView(int, int)>
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
	//*   5   10:invokevirtual   #473 <Method boolean AccessibilityManager.isEnabled()>
	//*   6   13:ifeq            55
		{
			android.view.ViewParent viewparent = mHost.getParent();
	//    7   16:aload_0         
	//    8   17:getfield        #87  <Field View mHost>
	//    9   20:invokevirtual   #411 <Method android.view.ViewParent View.getParent()>
	//   10   23:astore_3        
			if(viewparent != null)
	//*  11   24:aload_3         
	//*  12   25:ifnull          55
			{
				AccessibilityEvent accessibilityevent = createEvent(i, 2048);
	//   13   28:aload_0         
	//   14   29:iload_1         
	//   15   30:sipush          2048
	//   16   33:invokespecial   #544 <Method AccessibilityEvent createEvent(int, int)>
	//   17   36:astore          4
				AccessibilityEventCompat.setContentChangeTypes(accessibilityevent, j);
	//   18   38:aload           4
	//   19   40:iload_2         
	//   20   41:invokestatic    #550 <Method void AccessibilityEventCompat.setContentChangeTypes(AccessibilityEvent, int)>
				ViewParentCompat.requestSendAccessibilityEvent(viewparent, mHost, accessibilityevent);
	//   21   44:aload_3         
	//   22   45:aload_0         
	//   23   46:getfield        #87  <Field View mHost>
	//   24   49:aload           4
	//   25   51:invokestatic    #556 <Method boolean ViewParentCompat.requestSendAccessibilityEvent(android.view.ViewParent, View, AccessibilityEvent)>
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
	//    4    6:invokespecial   #558 <Method AccessibilityNodeInfoCompat createNodeForHost()>
	//    5    9:areturn         
		else
			return createNodeForChild(i);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:invokespecial   #382 <Method AccessibilityNodeInfoCompat createNodeForChild(int)>
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
	//    7   14:invokevirtual   #466 <Method boolean clearKeyboardFocusForVirtualView(int)>
	//    8   17:pop             
		if(flag)
	//*   9   18:iload_1         
	//*  10   19:ifeq            29
			moveFocus(i, rect);
	//   11   22:aload_0         
	//   12   23:iload_2         
	//   13   24:aload_3         
	//   14   25:invokespecial   #519 <Method boolean moveFocus(int, Rect)>
	//   15   28:pop             
	//   16   29:return          
	}

	public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
	{
		super.onInitializeAccessibilityEvent(view, accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #563 <Method void AccessibilityDelegateCompat.onInitializeAccessibilityEvent(View, AccessibilityEvent)>
		onPopulateEventForHost(accessibilityevent);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #566 <Method void onPopulateEventForHost(AccessibilityEvent)>
	//    7   11:return          
	}

	public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #567 <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
		onPopulateNodeForHost(accessibilitynodeinfocompat);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #571 <Method void onPopulateNodeForHost(AccessibilityNodeInfoCompat)>
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
	//*   1    1:tableswitch     -1 -1: default 20
	//	               -1 28
		default:
			return performActionForChild(i, j, bundle);
	//    2   20:aload_0         
	//    3   21:iload_1         
	//    4   22:iload_2         
	//    5   23:aload_3         
	//    6   24:invokespecial   #574 <Method boolean performActionForChild(int, int, Bundle)>
	//    7   27:ireturn         

		case -1: 
			return performActionForHost(j, bundle);
	//    8   28:aload_0         
	//    9   29:iload_2         
	//   10   30:aload_3         
	//   11   31:invokespecial   #576 <Method boolean performActionForHost(int, Bundle)>
	//   12   34:ireturn         
		}
	}

	public final boolean requestKeyboardFocusForVirtualView(int i)
	{
		while(!mHost.isFocused() && !mHost.requestFocus() || mKeyboardFocusedVirtualViewId == i) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field View mHost>
	//*   2    4:invokevirtual   #579 <Method boolean View.isFocused()>
	//*   3    7:ifne            22
	//*   4   10:aload_0         
	//*   5   11:getfield        #87  <Field View mHost>
	//*   6   14:invokevirtual   #582 <Method boolean View.requestFocus()>
	//*   7   17:ifne            22
			return false;
	//    8   20:iconst_0        
	//    9   21:ireturn         
	//   10   22:aload_0         
	//   11   23:getfield        #76  <Field int mKeyboardFocusedVirtualViewId>
	//   12   26:iload_1         
	//   13   27:icmpeq          20
		if(mKeyboardFocusedVirtualViewId != 0x80000000)
	//*  14   30:aload_0         
	//*  15   31:getfield        #76  <Field int mKeyboardFocusedVirtualViewId>
	//*  16   34:ldc1            #20  <Int 0x80000000>
	//*  17   36:icmpeq          48
			clearKeyboardFocusForVirtualView(mKeyboardFocusedVirtualViewId);
	//   18   39:aload_0         
	//   19   40:aload_0         
	//   20   41:getfield        #76  <Field int mKeyboardFocusedVirtualViewId>
	//   21   44:invokevirtual   #466 <Method boolean clearKeyboardFocusForVirtualView(int)>
	//   22   47:pop             
		mKeyboardFocusedVirtualViewId = i;
	//   23   48:aload_0         
	//   24   49:iload_1         
	//   25   50:putfield        #76  <Field int mKeyboardFocusedVirtualViewId>
		onVirtualViewKeyboardFocusChanged(i, true);
	//   26   53:aload_0         
	//   27   54:iload_1         
	//   28   55:iconst_1        
	//   29   56:invokevirtual   #482 <Method void onVirtualViewKeyboardFocusChanged(int, boolean)>
		sendEventForVirtualView(i, 8);
	//   30   59:aload_0         
	//   31   60:iload_1         
	//   32   61:bipush          8
	//   33   63:invokevirtual   #132 <Method boolean sendEventForVirtualView(int, int)>
	//   34   66:pop             
		return true;
	//   35   67:iconst_1        
	//   36   68:ireturn         
	}

	public final boolean sendEventForVirtualView(int i, int j)
	{
		android.view.ViewParent viewparent;
		if(i != 0x80000000 && mManager.isEnabled())
	//*   0    0:iload_1         
	//*   1    1:ldc1            #20  <Int 0x80000000>
	//*   2    3:icmpeq          16
	//*   3    6:aload_0         
	//*   4    7:getfield        #105 <Field AccessibilityManager mManager>
	//*   5   10:invokevirtual   #473 <Method boolean AccessibilityManager.isEnabled()>
	//*   6   13:ifne            18
	//*   7   16:iconst_0        
	//*   8   17:ireturn         
	//*   9   18:aload_0         
	//*  10   19:getfield        #87  <Field View mHost>
	//*  11   22:invokevirtual   #411 <Method android.view.ViewParent View.getParent()>
	//*  12   25:astore_3        
			if((viewparent = mHost.getParent()) != null)
	//*  13   26:aload_3         
	//*  14   27:ifnull          16
			{
				AccessibilityEvent accessibilityevent = createEvent(i, j);
	//   15   30:aload_0         
	//   16   31:iload_1         
	//   17   32:iload_2         
	//   18   33:invokespecial   #544 <Method AccessibilityEvent createEvent(int, int)>
	//   19   36:astore          4
				return ViewParentCompat.requestSendAccessibilityEvent(viewparent, mHost, accessibilityevent);
	//   20   38:aload_3         
	//   21   39:aload_0         
	//   22   40:getfield        #87  <Field View mHost>
	//   23   43:aload           4
	//   24   45:invokestatic    #556 <Method boolean ViewParentCompat.requestSendAccessibilityEvent(android.view.ViewParent, View, AccessibilityEvent)>
	//   25   48:ireturn         
			}
		return false;
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
