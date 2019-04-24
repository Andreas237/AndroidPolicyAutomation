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
	//    1    1:invokespecial   #64  <Method void AccessibilityDelegateCompat()>
	//    2    4:aload_0         
	//    3    5:new             #46  <Class Rect>
	//    4    8:dup             
	//    5    9:invokespecial   #65  <Method void Rect()>
	//    6   12:putfield        #67  <Field Rect mTempScreenRect>
	//    7   15:aload_0         
	//    8   16:new             #46  <Class Rect>
	//    9   19:dup             
	//   10   20:invokespecial   #65  <Method void Rect()>
	//   11   23:putfield        #69  <Field Rect mTempParentRect>
	//   12   26:aload_0         
	//   13   27:new             #46  <Class Rect>
	//   14   30:dup             
	//   15   31:invokespecial   #65  <Method void Rect()>
	//   16   34:putfield        #71  <Field Rect mTempVisibleRect>
	//   17   37:aload_0         
	//   18   38:iconst_2        
	//   19   39:newarray        int[]
	//   20   41:putfield        #73  <Field int[] mTempGlobalRect>
		mAccessibilityFocusedVirtualViewId = 0x80000000;
	//   21   44:aload_0         
	//   22   45:ldc1            #20  <Int 0x80000000>
	//   23   47:putfield        #75  <Field int mAccessibilityFocusedVirtualViewId>
		mKeyboardFocusedVirtualViewId = 0x80000000;
	//   24   50:aload_0         
	//   25   51:ldc1            #20  <Int 0x80000000>
	//   26   53:putfield        #77  <Field int mKeyboardFocusedVirtualViewId>
		mHoveredVirtualViewId = 0x80000000;
	//   27   56:aload_0         
	//   28   57:ldc1            #20  <Int 0x80000000>
	//   29   59:putfield        #79  <Field int mHoveredVirtualViewId>
		if(view == null)
	//*  30   62:aload_1         
	//*  31   63:ifnonnull       76
			throw new IllegalArgumentException("View may not be null");
	//   32   66:new             #81  <Class IllegalArgumentException>
	//   33   69:dup             
	//   34   70:ldc1            #83  <String "View may not be null">
	//   35   72:invokespecial   #86  <Method void IllegalArgumentException(String)>
	//   36   75:athrow          
		mHost = view;
	//   37   76:aload_0         
	//   38   77:aload_1         
	//   39   78:putfield        #88  <Field View mHost>
		mManager = (AccessibilityManager)view.getContext().getSystemService("accessibility");
	//   40   81:aload_0         
	//   41   82:aload_1         
	//   42   83:invokevirtual   #94  <Method Context View.getContext()>
	//   43   86:ldc1            #96  <String "accessibility">
	//   44   88:invokevirtual   #102 <Method Object Context.getSystemService(String)>
	//   45   91:checkcast       #104 <Class AccessibilityManager>
	//   46   94:putfield        #106 <Field AccessibilityManager mManager>
		view.setFocusable(true);
	//   47   97:aload_1         
	//   48   98:iconst_1        
	//   49   99:invokevirtual   #110 <Method void View.setFocusable(boolean)>
		if(ViewCompat.getImportantForAccessibility(view) == 0)
	//*  50  102:aload_1         
	//*  51  103:invokestatic    #116 <Method int ViewCompat.getImportantForAccessibility(View)>
	//*  52  106:ifne            114
			ViewCompat.setImportantForAccessibility(view, 1);
	//   53  109:aload_1         
	//   54  110:iconst_1        
	//   55  111:invokestatic    #120 <Method void ViewCompat.setImportantForAccessibility(View, int)>
	//   56  114:return          
	}

	private boolean clearAccessibilityFocus(int i)
	{
		if(mAccessibilityFocusedVirtualViewId == i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #75  <Field int mAccessibilityFocusedVirtualViewId>
	//*   2    4:iload_1         
	//*   3    5:icmpne          31
		{
			mAccessibilityFocusedVirtualViewId = 0x80000000;
	//    4    8:aload_0         
	//    5    9:ldc1            #20  <Int 0x80000000>
	//    6   11:putfield        #75  <Field int mAccessibilityFocusedVirtualViewId>
			mHost.invalidate();
	//    7   14:aload_0         
	//    8   15:getfield        #88  <Field View mHost>
	//    9   18:invokevirtual   #129 <Method void View.invalidate()>
			sendEventForVirtualView(i, 0x10000);
	//   10   21:aload_0         
	//   11   22:iload_1         
	//   12   23:ldc1            #130 <Int 0x10000>
	//   13   25:invokevirtual   #134 <Method boolean sendEventForVirtualView(int, int)>
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
	//    1    1:getfield        #77  <Field int mKeyboardFocusedVirtualViewId>
	//    2    4:ldc1            #20  <Int 0x80000000>
	//    3    6:icmpeq          25
	//    4    9:aload_0         
	//    5   10:aload_0         
	//    6   11:getfield        #77  <Field int mKeyboardFocusedVirtualViewId>
	//    7   14:bipush          16
	//    8   16:aconst_null     
	//    9   17:invokevirtual   #140 <Method boolean onPerformActionForVirtualView(int, int, Bundle)>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	private AccessibilityEvent createEvent(int i, int j)
	{
		if(i != -1)
	//*   0    0:iload_1         
	//*   1    1:iconst_m1       
	//*   2    2:icmpeq          12
			return createEventForChild(i, j);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iload_2         
	//    6    8:invokespecial   #145 <Method AccessibilityEvent createEventForChild(int, int)>
	//    7   11:areturn         
		else
			return createEventForHost(j);
	//    8   12:aload_0         
	//    9   13:iload_2         
	//   10   14:invokespecial   #149 <Method AccessibilityEvent createEventForHost(int)>
	//   11   17:areturn         
	}

	private AccessibilityEvent createEventForChild(int i, int j)
	{
		AccessibilityEvent accessibilityevent = AccessibilityEvent.obtain(j);
	//    0    0:iload_2         
	//    1    1:invokestatic    #154 <Method AccessibilityEvent AccessibilityEvent.obtain(int)>
	//    2    4:astore_3        
		AccessibilityNodeInfoCompat accessibilitynodeinfocompat = obtainAccessibilityNodeInfo(i);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokevirtual   #158 <Method AccessibilityNodeInfoCompat obtainAccessibilityNodeInfo(int)>
	//    6   10:astore          4
		accessibilityevent.getText().add(((Object) (accessibilitynodeinfocompat.getText())));
	//    7   12:aload_3         
	//    8   13:invokevirtual   #162 <Method List AccessibilityEvent.getText()>
	//    9   16:aload           4
	//   10   18:invokevirtual   #167 <Method CharSequence AccessibilityNodeInfoCompat.getText()>
	//   11   21:invokeinterface #173 <Method boolean List.add(Object)>
	//   12   26:pop             
		accessibilityevent.setContentDescription(accessibilitynodeinfocompat.getContentDescription());
	//   13   27:aload_3         
	//   14   28:aload           4
	//   15   30:invokevirtual   #176 <Method CharSequence AccessibilityNodeInfoCompat.getContentDescription()>
	//   16   33:invokevirtual   #180 <Method void AccessibilityEvent.setContentDescription(CharSequence)>
		accessibilityevent.setScrollable(accessibilitynodeinfocompat.isScrollable());
	//   17   36:aload_3         
	//   18   37:aload           4
	//   19   39:invokevirtual   #183 <Method boolean AccessibilityNodeInfoCompat.isScrollable()>
	//   20   42:invokevirtual   #186 <Method void AccessibilityEvent.setScrollable(boolean)>
		accessibilityevent.setPassword(accessibilitynodeinfocompat.isPassword());
	//   21   45:aload_3         
	//   22   46:aload           4
	//   23   48:invokevirtual   #189 <Method boolean AccessibilityNodeInfoCompat.isPassword()>
	//   24   51:invokevirtual   #192 <Method void AccessibilityEvent.setPassword(boolean)>
		accessibilityevent.setEnabled(accessibilitynodeinfocompat.isEnabled());
	//   25   54:aload_3         
	//   26   55:aload           4
	//   27   57:invokevirtual   #195 <Method boolean AccessibilityNodeInfoCompat.isEnabled()>
	//   28   60:invokevirtual   #198 <Method void AccessibilityEvent.setEnabled(boolean)>
		accessibilityevent.setChecked(accessibilitynodeinfocompat.isChecked());
	//   29   63:aload_3         
	//   30   64:aload           4
	//   31   66:invokevirtual   #201 <Method boolean AccessibilityNodeInfoCompat.isChecked()>
	//   32   69:invokevirtual   #204 <Method void AccessibilityEvent.setChecked(boolean)>
		onPopulateEventForVirtualView(i, accessibilityevent);
	//   33   72:aload_0         
	//   34   73:iload_1         
	//   35   74:aload_3         
	//   36   75:invokevirtual   #208 <Method void onPopulateEventForVirtualView(int, AccessibilityEvent)>
		if(accessibilityevent.getText().isEmpty() && accessibilityevent.getContentDescription() == null)
	//*  37   78:aload_3         
	//*  38   79:invokevirtual   #162 <Method List AccessibilityEvent.getText()>
	//*  39   82:invokeinterface #211 <Method boolean List.isEmpty()>
	//*  40   87:ifeq            107
	//*  41   90:aload_3         
	//*  42   91:invokevirtual   #212 <Method CharSequence AccessibilityEvent.getContentDescription()>
	//*  43   94:ifnonnull       107
		{
			throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
	//   44   97:new             #214 <Class RuntimeException>
	//   45  100:dup             
	//   46  101:ldc1            #216 <String "Callbacks must add text or a content description in populateEventForVirtualViewId()">
	//   47  103:invokespecial   #217 <Method void RuntimeException(String)>
	//   48  106:athrow          
		} else
		{
			accessibilityevent.setClassName(accessibilitynodeinfocompat.getClassName());
	//   49  107:aload_3         
	//   50  108:aload           4
	//   51  110:invokevirtual   #220 <Method CharSequence AccessibilityNodeInfoCompat.getClassName()>
	//   52  113:invokevirtual   #223 <Method void AccessibilityEvent.setClassName(CharSequence)>
			AccessibilityRecordCompat.setSource(((android.view.accessibility.AccessibilityRecord) (accessibilityevent)), mHost, i);
	//   53  116:aload_3         
	//   54  117:aload_0         
	//   55  118:getfield        #88  <Field View mHost>
	//   56  121:iload_1         
	//   57  122:invokestatic    #229 <Method void AccessibilityRecordCompat.setSource(android.view.accessibility.AccessibilityRecord, View, int)>
			accessibilityevent.setPackageName(((CharSequence) (mHost.getContext().getPackageName())));
	//   58  125:aload_3         
	//   59  126:aload_0         
	//   60  127:getfield        #88  <Field View mHost>
	//   61  130:invokevirtual   #94  <Method Context View.getContext()>
	//   62  133:invokevirtual   #233 <Method String Context.getPackageName()>
	//   63  136:invokevirtual   #236 <Method void AccessibilityEvent.setPackageName(CharSequence)>
			return accessibilityevent;
	//   64  139:aload_3         
	//   65  140:areturn         
		}
	}

	private AccessibilityEvent createEventForHost(int i)
	{
		AccessibilityEvent accessibilityevent = AccessibilityEvent.obtain(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #154 <Method AccessibilityEvent AccessibilityEvent.obtain(int)>
	//    2    4:astore_2        
		mHost.onInitializeAccessibilityEvent(accessibilityevent);
	//    3    5:aload_0         
	//    4    6:getfield        #88  <Field View mHost>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #240 <Method void View.onInitializeAccessibilityEvent(AccessibilityEvent)>
		return accessibilityevent;
	//    7   13:aload_2         
	//    8   14:areturn         
	}

	private AccessibilityNodeInfoCompat createNodeForChild(int i)
	{
		AccessibilityNodeInfoCompat accessibilitynodeinfocompat = AccessibilityNodeInfoCompat.obtain();
	//    0    0:invokestatic    #244 <Method AccessibilityNodeInfoCompat AccessibilityNodeInfoCompat.obtain()>
	//    1    3:astore          4
		accessibilitynodeinfocompat.setEnabled(true);
	//    2    5:aload           4
	//    3    7:iconst_1        
	//    4    8:invokevirtual   #245 <Method void AccessibilityNodeInfoCompat.setEnabled(boolean)>
		accessibilitynodeinfocompat.setFocusable(true);
	//    5   11:aload           4
	//    6   13:iconst_1        
	//    7   14:invokevirtual   #246 <Method void AccessibilityNodeInfoCompat.setFocusable(boolean)>
		accessibilitynodeinfocompat.setClassName("android.view.View");
	//    8   17:aload           4
	//    9   19:ldc1            #15  <String "android.view.View">
	//   10   21:invokevirtual   #247 <Method void AccessibilityNodeInfoCompat.setClassName(CharSequence)>
		accessibilitynodeinfocompat.setBoundsInParent(INVALID_PARENT_BOUNDS);
	//   11   24:aload           4
	//   12   26:getstatic       #53  <Field Rect INVALID_PARENT_BOUNDS>
	//   13   29:invokevirtual   #251 <Method void AccessibilityNodeInfoCompat.setBoundsInParent(Rect)>
		accessibilitynodeinfocompat.setBoundsInScreen(INVALID_PARENT_BOUNDS);
	//   14   32:aload           4
	//   15   34:getstatic       #53  <Field Rect INVALID_PARENT_BOUNDS>
	//   16   37:invokevirtual   #254 <Method void AccessibilityNodeInfoCompat.setBoundsInScreen(Rect)>
		accessibilitynodeinfocompat.setParent(mHost);
	//   17   40:aload           4
	//   18   42:aload_0         
	//   19   43:getfield        #88  <Field View mHost>
	//   20   46:invokevirtual   #257 <Method void AccessibilityNodeInfoCompat.setParent(View)>
		onPopulateNodeForVirtualView(i, accessibilitynodeinfocompat);
	//   21   49:aload_0         
	//   22   50:iload_1         
	//   23   51:aload           4
	//   24   53:invokevirtual   #261 <Method void onPopulateNodeForVirtualView(int, AccessibilityNodeInfoCompat)>
		if(accessibilitynodeinfocompat.getText() == null && accessibilitynodeinfocompat.getContentDescription() == null)
	//*  25   56:aload           4
	//*  26   58:invokevirtual   #167 <Method CharSequence AccessibilityNodeInfoCompat.getText()>
	//*  27   61:ifnonnull       83
	//*  28   64:aload           4
	//*  29   66:invokevirtual   #176 <Method CharSequence AccessibilityNodeInfoCompat.getContentDescription()>
	//*  30   69:ifnonnull       83
			throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
	//   31   72:new             #214 <Class RuntimeException>
	//   32   75:dup             
	//   33   76:ldc2            #263 <String "Callbacks must add text or a content description in populateNodeForVirtualViewId()">
	//   34   79:invokespecial   #217 <Method void RuntimeException(String)>
	//   35   82:athrow          
		accessibilitynodeinfocompat.getBoundsInParent(mTempParentRect);
	//   36   83:aload           4
	//   37   85:aload_0         
	//   38   86:getfield        #69  <Field Rect mTempParentRect>
	//   39   89:invokevirtual   #266 <Method void AccessibilityNodeInfoCompat.getBoundsInParent(Rect)>
		if(mTempParentRect.equals(((Object) (INVALID_PARENT_BOUNDS))))
	//*  40   92:aload_0         
	//*  41   93:getfield        #69  <Field Rect mTempParentRect>
	//*  42   96:getstatic       #53  <Field Rect INVALID_PARENT_BOUNDS>
	//*  43   99:invokevirtual   #269 <Method boolean Rect.equals(Object)>
	//*  44  102:ifeq            116
			throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
	//   45  105:new             #214 <Class RuntimeException>
	//   46  108:dup             
	//   47  109:ldc2            #271 <String "Callbacks must set parent bounds in populateNodeForVirtualViewId()">
	//   48  112:invokespecial   #217 <Method void RuntimeException(String)>
	//   49  115:athrow          
		int j = accessibilitynodeinfocompat.getActions();
	//   50  116:aload           4
	//   51  118:invokevirtual   #275 <Method int AccessibilityNodeInfoCompat.getActions()>
	//   52  121:istore_2        
		if((j & 0x40) != 0)
	//*  53  122:iload_2         
	//*  54  123:bipush          64
	//*  55  125:iand            
	//*  56  126:ifeq            140
			throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
	//   57  129:new             #214 <Class RuntimeException>
	//   58  132:dup             
	//   59  133:ldc2            #277 <String "Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()">
	//   60  136:invokespecial   #217 <Method void RuntimeException(String)>
	//   61  139:athrow          
		if((j & 0x80) != 0)
	//*  62  140:iload_2         
	//*  63  141:sipush          128
	//*  64  144:iand            
	//*  65  145:ifeq            159
			throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
	//   66  148:new             #214 <Class RuntimeException>
	//   67  151:dup             
	//   68  152:ldc2            #279 <String "Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()">
	//   69  155:invokespecial   #217 <Method void RuntimeException(String)>
	//   70  158:athrow          
		accessibilitynodeinfocompat.setPackageName(((CharSequence) (mHost.getContext().getPackageName())));
	//   71  159:aload           4
	//   72  161:aload_0         
	//   73  162:getfield        #88  <Field View mHost>
	//   74  165:invokevirtual   #94  <Method Context View.getContext()>
	//   75  168:invokevirtual   #233 <Method String Context.getPackageName()>
	//   76  171:invokevirtual   #280 <Method void AccessibilityNodeInfoCompat.setPackageName(CharSequence)>
		accessibilitynodeinfocompat.setSource(mHost, i);
	//   77  174:aload           4
	//   78  176:aload_0         
	//   79  177:getfield        #88  <Field View mHost>
	//   80  180:iload_1         
	//   81  181:invokevirtual   #282 <Method void AccessibilityNodeInfoCompat.setSource(View, int)>
		if(mAccessibilityFocusedVirtualViewId == i)
	//*  82  184:aload_0         
	//*  83  185:getfield        #75  <Field int mAccessibilityFocusedVirtualViewId>
	//*  84  188:iload_1         
	//*  85  189:icmpne          209
		{
			accessibilitynodeinfocompat.setAccessibilityFocused(true);
	//   86  192:aload           4
	//   87  194:iconst_1        
	//   88  195:invokevirtual   #285 <Method void AccessibilityNodeInfoCompat.setAccessibilityFocused(boolean)>
			accessibilitynodeinfocompat.addAction(128);
	//   89  198:aload           4
	//   90  200:sipush          128
	//   91  203:invokevirtual   #289 <Method void AccessibilityNodeInfoCompat.addAction(int)>
		} else
	//*  92  206:goto            222
		{
			accessibilitynodeinfocompat.setAccessibilityFocused(false);
	//   93  209:aload           4
	//   94  211:iconst_0        
	//   95  212:invokevirtual   #285 <Method void AccessibilityNodeInfoCompat.setAccessibilityFocused(boolean)>
			accessibilitynodeinfocompat.addAction(64);
	//   96  215:aload           4
	//   97  217:bipush          64
	//   98  219:invokevirtual   #289 <Method void AccessibilityNodeInfoCompat.addAction(int)>
		}
		boolean flag;
		if(mKeyboardFocusedVirtualViewId == i)
	//*  99  222:aload_0         
	//* 100  223:getfield        #77  <Field int mKeyboardFocusedVirtualViewId>
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
	//  112  244:invokevirtual   #289 <Method void AccessibilityNodeInfoCompat.addAction(int)>
		else
	//* 113  247:goto            264
		if(accessibilitynodeinfocompat.isFocusable())
	//* 114  250:aload           4
	//* 115  252:invokevirtual   #292 <Method boolean AccessibilityNodeInfoCompat.isFocusable()>
	//* 116  255:ifeq            264
			accessibilitynodeinfocompat.addAction(1);
	//  117  258:aload           4
	//  118  260:iconst_1        
	//  119  261:invokevirtual   #289 <Method void AccessibilityNodeInfoCompat.addAction(int)>
		accessibilitynodeinfocompat.setFocused(flag);
	//  120  264:aload           4
	//  121  266:iload_3         
	//  122  267:invokevirtual   #295 <Method void AccessibilityNodeInfoCompat.setFocused(boolean)>
		mHost.getLocationOnScreen(mTempGlobalRect);
	//  123  270:aload_0         
	//  124  271:getfield        #88  <Field View mHost>
	//  125  274:aload_0         
	//  126  275:getfield        #73  <Field int[] mTempGlobalRect>
	//  127  278:invokevirtual   #299 <Method void View.getLocationOnScreen(int[])>
		accessibilitynodeinfocompat.getBoundsInScreen(mTempScreenRect);
	//  128  281:aload           4
	//  129  283:aload_0         
	//  130  284:getfield        #67  <Field Rect mTempScreenRect>
	//  131  287:invokevirtual   #302 <Method void AccessibilityNodeInfoCompat.getBoundsInScreen(Rect)>
		if(mTempScreenRect.equals(((Object) (INVALID_PARENT_BOUNDS))))
	//* 132  290:aload_0         
	//* 133  291:getfield        #67  <Field Rect mTempScreenRect>
	//* 134  294:getstatic       #53  <Field Rect INVALID_PARENT_BOUNDS>
	//* 135  297:invokevirtual   #269 <Method boolean Rect.equals(Object)>
	//* 136  300:ifeq            441
		{
			accessibilitynodeinfocompat.getBoundsInParent(mTempScreenRect);
	//  137  303:aload           4
	//  138  305:aload_0         
	//  139  306:getfield        #67  <Field Rect mTempScreenRect>
	//  140  309:invokevirtual   #266 <Method void AccessibilityNodeInfoCompat.getBoundsInParent(Rect)>
			if(accessibilitynodeinfocompat.mParentVirtualDescendantId != -1)
	//* 141  312:aload           4
	//* 142  314:getfield        #305 <Field int AccessibilityNodeInfoCompat.mParentVirtualDescendantId>
	//* 143  317:iconst_m1       
	//* 144  318:icmpeq          406
			{
				AccessibilityNodeInfoCompat accessibilitynodeinfocompat1 = AccessibilityNodeInfoCompat.obtain();
	//  145  321:invokestatic    #244 <Method AccessibilityNodeInfoCompat AccessibilityNodeInfoCompat.obtain()>
	//  146  324:astore          5
				for(i = accessibilitynodeinfocompat.mParentVirtualDescendantId; i != -1; i = accessibilitynodeinfocompat1.mParentVirtualDescendantId)
	//* 147  326:aload           4
	//* 148  328:getfield        #305 <Field int AccessibilityNodeInfoCompat.mParentVirtualDescendantId>
	//* 149  331:istore_1        
	//* 150  332:iload_1         
	//* 151  333:iconst_m1       
	//* 152  334:icmpeq          401
				{
					accessibilitynodeinfocompat1.setParent(mHost, -1);
	//  153  337:aload           5
	//  154  339:aload_0         
	//  155  340:getfield        #88  <Field View mHost>
	//  156  343:iconst_m1       
	//  157  344:invokevirtual   #307 <Method void AccessibilityNodeInfoCompat.setParent(View, int)>
					accessibilitynodeinfocompat1.setBoundsInParent(INVALID_PARENT_BOUNDS);
	//  158  347:aload           5
	//  159  349:getstatic       #53  <Field Rect INVALID_PARENT_BOUNDS>
	//  160  352:invokevirtual   #251 <Method void AccessibilityNodeInfoCompat.setBoundsInParent(Rect)>
					onPopulateNodeForVirtualView(i, accessibilitynodeinfocompat1);
	//  161  355:aload_0         
	//  162  356:iload_1         
	//  163  357:aload           5
	//  164  359:invokevirtual   #261 <Method void onPopulateNodeForVirtualView(int, AccessibilityNodeInfoCompat)>
					accessibilitynodeinfocompat1.getBoundsInParent(mTempParentRect);
	//  165  362:aload           5
	//  166  364:aload_0         
	//  167  365:getfield        #69  <Field Rect mTempParentRect>
	//  168  368:invokevirtual   #266 <Method void AccessibilityNodeInfoCompat.getBoundsInParent(Rect)>
					mTempScreenRect.offset(mTempParentRect.left, mTempParentRect.top);
	//  169  371:aload_0         
	//  170  372:getfield        #67  <Field Rect mTempScreenRect>
	//  171  375:aload_0         
	//  172  376:getfield        #69  <Field Rect mTempParentRect>
	//  173  379:getfield        #310 <Field int Rect.left>
	//  174  382:aload_0         
	//  175  383:getfield        #69  <Field Rect mTempParentRect>
	//  176  386:getfield        #313 <Field int Rect.top>
	//  177  389:invokevirtual   #317 <Method void Rect.offset(int, int)>
				}

	//  178  392:aload           5
	//  179  394:getfield        #305 <Field int AccessibilityNodeInfoCompat.mParentVirtualDescendantId>
	//  180  397:istore_1        
	//* 181  398:goto            332
				accessibilitynodeinfocompat1.recycle();
	//  182  401:aload           5
	//  183  403:invokevirtual   #320 <Method void AccessibilityNodeInfoCompat.recycle()>
			}
			mTempScreenRect.offset(mTempGlobalRect[0] - mHost.getScrollX(), mTempGlobalRect[1] - mHost.getScrollY());
	//  184  406:aload_0         
	//  185  407:getfield        #67  <Field Rect mTempScreenRect>
	//  186  410:aload_0         
	//  187  411:getfield        #73  <Field int[] mTempGlobalRect>
	//  188  414:iconst_0        
	//  189  415:iaload          
	//  190  416:aload_0         
	//  191  417:getfield        #88  <Field View mHost>
	//  192  420:invokevirtual   #323 <Method int View.getScrollX()>
	//  193  423:isub            
	//  194  424:aload_0         
	//  195  425:getfield        #73  <Field int[] mTempGlobalRect>
	//  196  428:iconst_1        
	//  197  429:iaload          
	//  198  430:aload_0         
	//  199  431:getfield        #88  <Field View mHost>
	//  200  434:invokevirtual   #326 <Method int View.getScrollY()>
	//  201  437:isub            
	//  202  438:invokevirtual   #317 <Method void Rect.offset(int, int)>
		}
		if(mHost.getLocalVisibleRect(mTempVisibleRect))
	//* 203  441:aload_0         
	//* 204  442:getfield        #88  <Field View mHost>
	//* 205  445:aload_0         
	//* 206  446:getfield        #71  <Field Rect mTempVisibleRect>
	//* 207  449:invokevirtual   #330 <Method boolean View.getLocalVisibleRect(Rect)>
	//* 208  452:ifeq            530
		{
			mTempVisibleRect.offset(mTempGlobalRect[0] - mHost.getScrollX(), mTempGlobalRect[1] - mHost.getScrollY());
	//  209  455:aload_0         
	//  210  456:getfield        #71  <Field Rect mTempVisibleRect>
	//  211  459:aload_0         
	//  212  460:getfield        #73  <Field int[] mTempGlobalRect>
	//  213  463:iconst_0        
	//  214  464:iaload          
	//  215  465:aload_0         
	//  216  466:getfield        #88  <Field View mHost>
	//  217  469:invokevirtual   #323 <Method int View.getScrollX()>
	//  218  472:isub            
	//  219  473:aload_0         
	//  220  474:getfield        #73  <Field int[] mTempGlobalRect>
	//  221  477:iconst_1        
	//  222  478:iaload          
	//  223  479:aload_0         
	//  224  480:getfield        #88  <Field View mHost>
	//  225  483:invokevirtual   #326 <Method int View.getScrollY()>
	//  226  486:isub            
	//  227  487:invokevirtual   #317 <Method void Rect.offset(int, int)>
			if(mTempScreenRect.intersect(mTempVisibleRect))
	//* 228  490:aload_0         
	//* 229  491:getfield        #67  <Field Rect mTempScreenRect>
	//* 230  494:aload_0         
	//* 231  495:getfield        #71  <Field Rect mTempVisibleRect>
	//* 232  498:invokevirtual   #333 <Method boolean Rect.intersect(Rect)>
	//* 233  501:ifeq            530
			{
				accessibilitynodeinfocompat.setBoundsInScreen(mTempScreenRect);
	//  234  504:aload           4
	//  235  506:aload_0         
	//  236  507:getfield        #67  <Field Rect mTempScreenRect>
	//  237  510:invokevirtual   #254 <Method void AccessibilityNodeInfoCompat.setBoundsInScreen(Rect)>
				if(isVisibleToUser(mTempScreenRect))
	//* 238  513:aload_0         
	//* 239  514:aload_0         
	//* 240  515:getfield        #67  <Field Rect mTempScreenRect>
	//* 241  518:invokespecial   #336 <Method boolean isVisibleToUser(Rect)>
	//* 242  521:ifeq            530
					accessibilitynodeinfocompat.setVisibleToUser(true);
	//  243  524:aload           4
	//  244  526:iconst_1        
	//  245  527:invokevirtual   #339 <Method void AccessibilityNodeInfoCompat.setVisibleToUser(boolean)>
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
	//    1    1:getfield        #88  <Field View mHost>
	//    2    4:invokestatic    #344 <Method AccessibilityNodeInfoCompat AccessibilityNodeInfoCompat.obtain(View)>
	//    3    7:astore_3        
		ViewCompat.onInitializeAccessibilityNodeInfo(mHost, accessibilitynodeinfocompat);
	//    4    8:aload_0         
	//    5    9:getfield        #88  <Field View mHost>
	//    6   12:aload_3         
	//    7   13:invokestatic    #348 <Method void ViewCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
		ArrayList arraylist = new ArrayList();
	//    8   16:new             #350 <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #351 <Method void ArrayList()>
	//   11   23:astore          4
		getVisibleVirtualViews(((List) (arraylist)));
	//   12   25:aload_0         
	//   13   26:aload           4
	//   14   28:invokevirtual   #355 <Method void getVisibleVirtualViews(List)>
		if(accessibilitynodeinfocompat.getChildCount() > 0 && arraylist.size() > 0)
	//*  15   31:aload_3         
	//*  16   32:invokevirtual   #358 <Method int AccessibilityNodeInfoCompat.getChildCount()>
	//*  17   35:ifle            57
	//*  18   38:aload           4
	//*  19   40:invokevirtual   #361 <Method int ArrayList.size()>
	//*  20   43:ifle            57
			throw new RuntimeException("Views cannot have both real and virtual children");
	//   21   46:new             #214 <Class RuntimeException>
	//   22   49:dup             
	//   23   50:ldc2            #363 <String "Views cannot have both real and virtual children">
	//   24   53:invokespecial   #217 <Method void RuntimeException(String)>
	//   25   56:athrow          
		int i = 0;
	//   26   57:iconst_0        
	//   27   58:istore_1        
		for(int j = arraylist.size(); i < j; i++)
	//*  28   59:aload           4
	//*  29   61:invokevirtual   #361 <Method int ArrayList.size()>
	//*  30   64:istore_2        
	//*  31   65:iload_1         
	//*  32   66:iload_2         
	//*  33   67:icmpge          97
			accessibilitynodeinfocompat.addChild(mHost, ((Integer)arraylist.get(i)).intValue());
	//   34   70:aload_3         
	//   35   71:aload_0         
	//   36   72:getfield        #88  <Field View mHost>
	//   37   75:aload           4
	//   38   77:iload_1         
	//   39   78:invokevirtual   #367 <Method Object ArrayList.get(int)>
	//   40   81:checkcast       #369 <Class Integer>
	//   41   84:invokevirtual   #372 <Method int Integer.intValue()>
	//   42   87:invokevirtual   #375 <Method void AccessibilityNodeInfoCompat.addChild(View, int)>

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
	//    0    0:new             #350 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #351 <Method void ArrayList()>
	//    3    7:astore_2        
		getVisibleVirtualViews(((List) (arraylist)));
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #355 <Method void getVisibleVirtualViews(List)>
		SparseArrayCompat sparsearraycompat = new SparseArrayCompat();
	//    7   13:new             #379 <Class SparseArrayCompat>
	//    8   16:dup             
	//    9   17:invokespecial   #380 <Method void SparseArrayCompat()>
	//   10   20:astore_3        
		for(int i = 0; i < ((List) (arraylist)).size(); i++)
	//*  11   21:iconst_0        
	//*  12   22:istore_1        
	//*  13   23:iload_1         
	//*  14   24:aload_2         
	//*  15   25:invokeinterface #381 <Method int List.size()>
	//*  16   30:icmpge          50
			sparsearraycompat.put(i, ((Object) (createNodeForChild(i))));
	//   17   33:aload_3         
	//   18   34:iload_1         
	//   19   35:aload_0         
	//   20   36:iload_1         
	//   21   37:invokespecial   #383 <Method AccessibilityNodeInfoCompat createNodeForChild(int)>
	//   22   40:invokevirtual   #387 <Method void SparseArrayCompat.put(int, Object)>

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
	//    2    2:invokevirtual   #158 <Method AccessibilityNodeInfoCompat obtainAccessibilityNodeInfo(int)>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #266 <Method void AccessibilityNodeInfoCompat.getBoundsInParent(Rect)>
	//    5    9:return          
	}

	private static Rect guessPreviouslyFocusedRect(View view, int i, Rect rect)
	{
		int j = view.getWidth();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #395 <Method int View.getWidth()>
	//    2    4:istore_3        
		int k = view.getHeight();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #398 <Method int View.getHeight()>
	//    5    9:istore          4
		if(i != 17)
	//*   6   11:iload_1         
	//*   7   12:bipush          17
	//*   8   14:icmpeq          80
		{
			if(i != 33)
	//*   9   17:iload_1         
	//*  10   18:bipush          33
	//*  11   20:icmpeq          68
			{
				if(i != 66)
	//*  12   23:iload_1         
	//*  13   24:bipush          66
	//*  14   26:icmpeq          57
				{
					if(i != 130)
	//*  15   29:iload_1         
	//*  16   30:sipush          130
	//*  17   33:icmpeq          47
					{
						throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
	//   18   36:new             #81  <Class IllegalArgumentException>
	//   19   39:dup             
	//   20   40:ldc2            #400 <String "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.">
	//   21   43:invokespecial   #86  <Method void IllegalArgumentException(String)>
	//   22   46:athrow          
					} else
					{
						rect.set(0, -1, j, -1);
	//   23   47:aload_2         
	//   24   48:iconst_0        
	//   25   49:iconst_m1       
	//   26   50:iload_3         
	//   27   51:iconst_m1       
	//   28   52:invokevirtual   #403 <Method void Rect.set(int, int, int, int)>
						return rect;
	//   29   55:aload_2         
	//   30   56:areturn         
					}
				} else
				{
					rect.set(-1, 0, -1, k);
	//   31   57:aload_2         
	//   32   58:iconst_m1       
	//   33   59:iconst_0        
	//   34   60:iconst_m1       
	//   35   61:iload           4
	//   36   63:invokevirtual   #403 <Method void Rect.set(int, int, int, int)>
					return rect;
	//   37   66:aload_2         
	//   38   67:areturn         
				}
			} else
			{
				rect.set(0, k, j, k);
	//   39   68:aload_2         
	//   40   69:iconst_0        
	//   41   70:iload           4
	//   42   72:iload_3         
	//   43   73:iload           4
	//   44   75:invokevirtual   #403 <Method void Rect.set(int, int, int, int)>
				return rect;
	//   45   78:aload_2         
	//   46   79:areturn         
			}
		} else
		{
			rect.set(j, 0, j, k);
	//   47   80:aload_2         
	//   48   81:iload_3         
	//   49   82:iconst_0        
	//   50   83:iload_3         
	//   51   84:iload           4
	//   52   86:invokevirtual   #403 <Method void Rect.set(int, int, int, int)>
			return rect;
	//   53   89:aload_2         
	//   54   90:areturn         
		}
	}

	private boolean isVisibleToUser(Rect rect)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(rect != null)
	//*   2    2:aload_1         
	//*   3    3:ifnull          83
		{
			if(rect.isEmpty())
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #404 <Method boolean Rect.isEmpty()>
	//*   6   10:ifeq            15
				return false;
	//    7   13:iconst_0        
	//    8   14:ireturn         
			if(mHost.getWindowVisibility() != 0)
	//*   9   15:aload_0         
	//*  10   16:getfield        #88  <Field View mHost>
	//*  11   19:invokevirtual   #407 <Method int View.getWindowVisibility()>
	//*  12   22:ifeq            27
				return false;
	//   13   25:iconst_0        
	//   14   26:ireturn         
			for(rect = ((Rect) (mHost.getParent())); rect instanceof View;)
	//*  15   27:aload_0         
	//*  16   28:getfield        #88  <Field View mHost>
	//*  17   31:invokevirtual   #411 <Method android.view.ViewParent View.getParent()>
	//*  18   34:astore_1        
	//*  19   35:aload_1         
	//*  20   36:instanceof      #90  <Class View>
	//*  21   39:ifeq            75
			{
				rect = ((Rect) ((View)rect));
	//   22   42:aload_1         
	//   23   43:checkcast       #90  <Class View>
	//   24   46:astore_1        
				if(((View) (rect)).getAlpha() > 0.0F)
	//*  25   47:aload_1         
	//*  26   48:invokevirtual   #415 <Method float View.getAlpha()>
	//*  27   51:fconst_0        
	//*  28   52:fcmpg           
	//*  29   53:ifle            73
				{
					if(((View) (rect)).getVisibility() != 0)
	//*  30   56:aload_1         
	//*  31   57:invokevirtual   #418 <Method int View.getVisibility()>
	//*  32   60:ifeq            65
						return false;
	//   33   63:iconst_0        
	//   34   64:ireturn         
					rect = ((Rect) (((View) (rect)).getParent()));
	//   35   65:aload_1         
	//   36   66:invokevirtual   #411 <Method android.view.ViewParent View.getParent()>
	//   37   69:astore_1        
				} else
	//*  38   70:goto            35
				{
					return false;
	//   39   73:iconst_0        
	//   40   74:ireturn         
				}
			}

			if(rect != null)
	//*  41   75:aload_1         
	//*  42   76:ifnull          81
				flag = true;
	//   43   79:iconst_1        
	//   44   80:istore_2        
			return flag;
	//   45   81:iload_2         
	//   46   82:ireturn         
		} else
		{
			return false;
	//   47   83:iconst_0        
	//   48   84:ireturn         
		}
	}

	private static int keyToDirection(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     19 22: default 32
	//	               19 42
	//	               20 32
	//	               21 39
	//	               22 36
		case 20: // '\024'
		default:
			return 130;
	//    2   32:sipush          130
	//    3   35:ireturn         

		case 22: // '\026'
			return 66;
	//    4   36:bipush          66
	//    5   38:ireturn         

		case 21: // '\025'
			return 17;
	//    6   39:bipush          17
	//    7   41:ireturn         

		case 19: // '\023'
			return 33;
	//    8   42:bipush          33
	//    9   44:ireturn         
		}
	}

	private boolean moveFocus(int i, Rect rect)
	{
		SparseArrayCompat sparsearraycompat = getAllNodes();
	//    0    0:aload_0         
	//    1    1:invokespecial   #425 <Method SparseArrayCompat getAllNodes()>
	//    2    4:astore          7
		int k = mKeyboardFocusedVirtualViewId;
	//    3    6:aload_0         
	//    4    7:getfield        #77  <Field int mKeyboardFocusedVirtualViewId>
	//    5   10:istore          4
		int j = 0x80000000;
	//    6   12:ldc1            #20  <Int 0x80000000>
	//    7   14:istore_3        
		AccessibilityNodeInfoCompat accessibilitynodeinfocompat;
		if(k == 0x80000000)
	//*   8   15:iload           4
	//*   9   17:ldc1            #20  <Int 0x80000000>
	//*  10   19:icmpne          28
			accessibilitynodeinfocompat = null;
	//   11   22:aconst_null     
	//   12   23:astore          6
		else
	//*  13   25:goto            43
			accessibilitynodeinfocompat = (AccessibilityNodeInfoCompat)sparsearraycompat.get(k);
	//   14   28:aload           7
	//   15   30:iload           4
	//   16   32:invokevirtual   #426 <Method Object SparseArrayCompat.get(int)>
	//   17   35:checkcast       #164 <Class AccessibilityNodeInfoCompat>
	//   18   38:astore          6
	//*  19   40:goto            25
		if(i != 17 && i != 33 && i != 66 && i != 130)
	//*  20   43:iload_1         
	//*  21   44:bipush          17
	//*  22   46:icmpeq          147
	//*  23   49:iload_1         
	//*  24   50:bipush          33
	//*  25   52:icmpeq          147
	//*  26   55:iload_1         
	//*  27   56:bipush          66
	//*  28   58:icmpeq          147
	//*  29   61:iload_1         
	//*  30   62:sipush          130
	//*  31   65:icmpeq          147
		{
			switch(i)
	//*  32   68:iload_1         
			{
	//*  33   69:tableswitch     1 2: default 92
	//	               1 103
	//	               2 103
			default:
				throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
	//   34   92:new             #81  <Class IllegalArgumentException>
	//   35   95:dup             
	//   36   96:ldc2            #428 <String "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.">
	//   37   99:invokespecial   #86  <Method void IllegalArgumentException(String)>
	//   38  102:athrow          

			case 1: // '\001'
			case 2: // '\002'
				break;
			}
			boolean flag;
			if(ViewCompat.getLayoutDirection(mHost) == 1)
	//*  39  103:aload_0         
	//*  40  104:getfield        #88  <Field View mHost>
	//*  41  107:invokestatic    #431 <Method int ViewCompat.getLayoutDirection(View)>
	//*  42  110:iconst_1        
	//*  43  111:icmpne          120
				flag = true;
	//   44  114:iconst_1        
	//   45  115:istore          5
			else
	//*  46  117:goto            123
				flag = false;
	//   47  120:iconst_0        
	//   48  121:istore          5
			rect = ((Rect) ((AccessibilityNodeInfoCompat)FocusStrategy.findNextFocusInRelativeDirection(((Object) (sparsearraycompat)), SPARSE_VALUES_ADAPTER, NODE_ADAPTER, ((Object) (accessibilitynodeinfocompat)), i, flag, false)));
	//   49  123:aload           7
	//   50  125:getstatic       #60  <Field FocusStrategy$CollectionAdapter SPARSE_VALUES_ADAPTER>
	//   51  128:getstatic       #57  <Field FocusStrategy$BoundsAdapter NODE_ADAPTER>
	//   52  131:aload           6
	//   53  133:iload_1         
	//   54  134:iload           5
	//   55  136:iconst_0        
	//   56  137:invokestatic    #437 <Method Object FocusStrategy.findNextFocusInRelativeDirection(Object, FocusStrategy$CollectionAdapter, FocusStrategy$BoundsAdapter, Object, int, boolean, boolean)>
	//   57  140:checkcast       #164 <Class AccessibilityNodeInfoCompat>
	//   58  143:astore_2        
		} else
	//*  59  144:goto            222
		{
			Rect rect1 = new Rect();
	//   60  147:new             #46  <Class Rect>
	//   61  150:dup             
	//   62  151:invokespecial   #65  <Method void Rect()>
	//   63  154:astore          8
			if(mKeyboardFocusedVirtualViewId != 0x80000000)
	//*  64  156:aload_0         
	//*  65  157:getfield        #77  <Field int mKeyboardFocusedVirtualViewId>
	//*  66  160:ldc1            #20  <Int 0x80000000>
	//*  67  162:icmpeq          178
				getBoundsInParent(mKeyboardFocusedVirtualViewId, rect1);
	//   68  165:aload_0         
	//   69  166:aload_0         
	//   70  167:getfield        #77  <Field int mKeyboardFocusedVirtualViewId>
	//   71  170:aload           8
	//   72  172:invokespecial   #439 <Method void getBoundsInParent(int, Rect)>
			else
	//*  73  175:goto            202
			if(rect != null)
	//*  74  178:aload_2         
	//*  75  179:ifnull          191
				rect1.set(rect);
	//   76  182:aload           8
	//   77  184:aload_2         
	//   78  185:invokevirtual   #441 <Method void Rect.set(Rect)>
			else
	//*  79  188:goto            202
				guessPreviouslyFocusedRect(mHost, i, rect1);
	//   80  191:aload_0         
	//   81  192:getfield        #88  <Field View mHost>
	//   82  195:iload_1         
	//   83  196:aload           8
	//   84  198:invokestatic    #443 <Method Rect guessPreviouslyFocusedRect(View, int, Rect)>
	//   85  201:pop             
			rect = ((Rect) ((AccessibilityNodeInfoCompat)FocusStrategy.findNextFocusInAbsoluteDirection(((Object) (sparsearraycompat)), SPARSE_VALUES_ADAPTER, NODE_ADAPTER, ((Object) (accessibilitynodeinfocompat)), rect1, i)));
	//   86  202:aload           7
	//   87  204:getstatic       #60  <Field FocusStrategy$CollectionAdapter SPARSE_VALUES_ADAPTER>
	//   88  207:getstatic       #57  <Field FocusStrategy$BoundsAdapter NODE_ADAPTER>
	//   89  210:aload           6
	//   90  212:aload           8
	//   91  214:iload_1         
	//   92  215:invokestatic    #447 <Method Object FocusStrategy.findNextFocusInAbsoluteDirection(Object, FocusStrategy$CollectionAdapter, FocusStrategy$BoundsAdapter, Object, Rect, int)>
	//   93  218:checkcast       #164 <Class AccessibilityNodeInfoCompat>
	//   94  221:astore_2        
		}
		if(rect == null)
	//*  95  222:aload_2         
	//*  96  223:ifnonnull       231
			i = j;
	//   97  226:iload_3         
	//   98  227:istore_1        
		else
	//*  99  228:goto            243
			i = sparsearraycompat.keyAt(sparsearraycompat.indexOfValue(((Object) (rect))));
	//  100  231:aload           7
	//  101  233:aload           7
	//  102  235:aload_2         
	//  103  236:invokevirtual   #451 <Method int SparseArrayCompat.indexOfValue(Object)>
	//  104  239:invokevirtual   #454 <Method int SparseArrayCompat.keyAt(int)>
	//  105  242:istore_1        
		return requestKeyboardFocusForVirtualView(i);
	//  106  243:aload_0         
	//  107  244:iload_1         
	//  108  245:invokevirtual   #457 <Method boolean requestKeyboardFocusForVirtualView(int)>
	//  109  248:ireturn         
	}

	private boolean performActionForChild(int i, int j, Bundle bundle)
	{
		if(j != 64)
	//*   0    0:iload_2         
	//*   1    1:bipush          64
	//*   2    3:icmpeq          62
		{
			if(j != 128)
	//*   3    6:iload_2         
	//*   4    7:sipush          128
	//*   5   10:icmpeq          56
				switch(j)
	//*   6   13:iload_2         
				{
	//*   7   14:tableswitch     1 2: default 36
	//	               1 50
	//	               2 44
				default:
					return onPerformActionForVirtualView(i, j, bundle);
	//    8   36:aload_0         
	//    9   37:iload_1         
	//   10   38:iload_2         
	//   11   39:aload_3         
	//   12   40:invokevirtual   #140 <Method boolean onPerformActionForVirtualView(int, int, Bundle)>
	//   13   43:ireturn         

				case 2: // '\002'
					return clearKeyboardFocusForVirtualView(i);
	//   14   44:aload_0         
	//   15   45:iload_1         
	//   16   46:invokevirtual   #461 <Method boolean clearKeyboardFocusForVirtualView(int)>
	//   17   49:ireturn         

				case 1: // '\001'
					return requestKeyboardFocusForVirtualView(i);
	//   18   50:aload_0         
	//   19   51:iload_1         
	//   20   52:invokevirtual   #457 <Method boolean requestKeyboardFocusForVirtualView(int)>
	//   21   55:ireturn         
				}
			else
				return clearAccessibilityFocus(i);
	//   22   56:aload_0         
	//   23   57:iload_1         
	//   24   58:invokespecial   #463 <Method boolean clearAccessibilityFocus(int)>
	//   25   61:ireturn         
		} else
		{
			return requestAccessibilityFocus(i);
	//   26   62:aload_0         
	//   27   63:iload_1         
	//   28   64:invokespecial   #466 <Method boolean requestAccessibilityFocus(int)>
	//   29   67:ireturn         
		}
	}

	private boolean performActionForHost(int i, Bundle bundle)
	{
		return ViewCompat.performAccessibilityAction(mHost, i, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field View mHost>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #472 <Method boolean ViewCompat.performAccessibilityAction(View, int, Bundle)>
	//    5    9:ireturn         
	}

	private boolean requestAccessibilityFocus(int i)
	{
		if(mManager.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #106 <Field AccessibilityManager mManager>
	//*   2    4:invokevirtual   #473 <Method boolean AccessibilityManager.isEnabled()>
	//*   3    7:ifeq            73
		{
			if(!mManager.isTouchExplorationEnabled())
	//*   4   10:aload_0         
	//*   5   11:getfield        #106 <Field AccessibilityManager mManager>
	//*   6   14:invokevirtual   #476 <Method boolean AccessibilityManager.isTouchExplorationEnabled()>
	//*   7   17:ifne            22
				return false;
	//    8   20:iconst_0        
	//    9   21:ireturn         
			if(mAccessibilityFocusedVirtualViewId != i)
	//*  10   22:aload_0         
	//*  11   23:getfield        #75  <Field int mAccessibilityFocusedVirtualViewId>
	//*  12   26:iload_1         
	//*  13   27:icmpeq          71
			{
				if(mAccessibilityFocusedVirtualViewId != 0x80000000)
	//*  14   30:aload_0         
	//*  15   31:getfield        #75  <Field int mAccessibilityFocusedVirtualViewId>
	//*  16   34:ldc1            #20  <Int 0x80000000>
	//*  17   36:icmpeq          48
					clearAccessibilityFocus(mAccessibilityFocusedVirtualViewId);
	//   18   39:aload_0         
	//   19   40:aload_0         
	//   20   41:getfield        #75  <Field int mAccessibilityFocusedVirtualViewId>
	//   21   44:invokespecial   #463 <Method boolean clearAccessibilityFocus(int)>
	//   22   47:pop             
				mAccessibilityFocusedVirtualViewId = i;
	//   23   48:aload_0         
	//   24   49:iload_1         
	//   25   50:putfield        #75  <Field int mAccessibilityFocusedVirtualViewId>
				mHost.invalidate();
	//   26   53:aload_0         
	//   27   54:getfield        #88  <Field View mHost>
	//   28   57:invokevirtual   #129 <Method void View.invalidate()>
				sendEventForVirtualView(i, 32768);
	//   29   60:aload_0         
	//   30   61:iload_1         
	//   31   62:ldc2            #477 <Int 32768>
	//   32   65:invokevirtual   #134 <Method boolean sendEventForVirtualView(int, int)>
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
		} else
		{
			return false;
	//   38   73:iconst_0        
	//   39   74:ireturn         
		}
	}

	private void updateHoveredVirtualView(int i)
	{
		if(mHoveredVirtualViewId == i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field int mHoveredVirtualViewId>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
		{
			return;
	//    4    8:return          
		} else
		{
			int j = mHoveredVirtualViewId;
	//    5    9:aload_0         
	//    6   10:getfield        #79  <Field int mHoveredVirtualViewId>
	//    7   13:istore_2        
			mHoveredVirtualViewId = i;
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:putfield        #79  <Field int mHoveredVirtualViewId>
			sendEventForVirtualView(i, 128);
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:sipush          128
	//   14   24:invokevirtual   #134 <Method boolean sendEventForVirtualView(int, int)>
	//   15   27:pop             
			sendEventForVirtualView(j, 256);
	//   16   28:aload_0         
	//   17   29:iload_2         
	//   18   30:sipush          256
	//   19   33:invokevirtual   #134 <Method boolean sendEventForVirtualView(int, int)>
	//   20   36:pop             
			return;
	//   21   37:return          
		}
	}

	public final boolean clearKeyboardFocusForVirtualView(int i)
	{
		if(mKeyboardFocusedVirtualViewId != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field int mKeyboardFocusedVirtualViewId>
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
	//    8   13:putfield        #77  <Field int mKeyboardFocusedVirtualViewId>
			onVirtualViewKeyboardFocusChanged(i, false);
	//    9   16:aload_0         
	//   10   17:iload_1         
	//   11   18:iconst_0        
	//   12   19:invokevirtual   #482 <Method void onVirtualViewKeyboardFocusChanged(int, boolean)>
			sendEventForVirtualView(i, 8);
	//   13   22:aload_0         
	//   14   23:iload_1         
	//   15   24:bipush          8
	//   16   26:invokevirtual   #134 <Method boolean sendEventForVirtualView(int, int)>
	//   17   29:pop             
			return true;
	//   18   30:iconst_1        
	//   19   31:ireturn         
		}
	}

	public final boolean dispatchHoverEvent(MotionEvent motionevent)
	{
		boolean flag1 = mManager.isEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field AccessibilityManager mManager>
	//    2    4:invokevirtual   #473 <Method boolean AccessibilityManager.isEnabled()>
	//    3    7:istore          4
		boolean flag = false;
	//    4    9:iconst_0        
	//    5   10:istore_3        
		if(flag1)
	//*   6   11:iload           4
	//*   7   13:ifeq            113
		{
			if(!mManager.isTouchExplorationEnabled())
	//*   8   16:aload_0         
	//*   9   17:getfield        #106 <Field AccessibilityManager mManager>
	//*  10   20:invokevirtual   #476 <Method boolean AccessibilityManager.isTouchExplorationEnabled()>
	//*  11   23:ifne            28
				return false;
	//   12   26:iconst_0        
	//   13   27:ireturn         
			int i = motionevent.getAction();
	//   14   28:aload_1         
	//   15   29:invokevirtual   #489 <Method int MotionEvent.getAction()>
	//   16   32:istore_2        
			if(i != 7)
	//*  17   33:iload_2         
	//*  18   34:bipush          7
	//*  19   36:icmpeq          85
				switch(i)
	//*  20   39:iload_2         
				{
	//*  21   40:tableswitch     9 10: default 64
	//	               9 85
	//	               10 66
				default:
					return false;
	//   22   64:iconst_0        
	//   23   65:ireturn         

				case 10: // '\n'
					if(mAccessibilityFocusedVirtualViewId != 0x80000000)
	//*  24   66:aload_0         
	//*  25   67:getfield        #75  <Field int mAccessibilityFocusedVirtualViewId>
	//*  26   70:ldc1            #20  <Int 0x80000000>
	//*  27   72:icmpeq          83
					{
						updateHoveredVirtualView(0x80000000);
	//   28   75:aload_0         
	//   29   76:ldc1            #20  <Int 0x80000000>
	//   30   78:invokespecial   #491 <Method void updateHoveredVirtualView(int)>
						return true;
	//   31   81:iconst_1        
	//   32   82:ireturn         
					} else
					{
						return false;
	//   33   83:iconst_0        
	//   34   84:ireturn         
					}

				case 9: // '\t'
					break;
				}
			i = getVirtualViewAt(motionevent.getX(), motionevent.getY());
	//   35   85:aload_0         
	//   36   86:aload_1         
	//   37   87:invokevirtual   #494 <Method float MotionEvent.getX()>
	//   38   90:aload_1         
	//   39   91:invokevirtual   #497 <Method float MotionEvent.getY()>
	//   40   94:invokevirtual   #501 <Method int getVirtualViewAt(float, float)>
	//   41   97:istore_2        
			updateHoveredVirtualView(i);
	//   42   98:aload_0         
	//   43   99:iload_2         
	//   44  100:invokespecial   #491 <Method void updateHoveredVirtualView(int)>
			if(i != 0x80000000)
	//*  45  103:iload_2         
	//*  46  104:ldc1            #20  <Int 0x80000000>
	//*  47  106:icmpeq          111
				flag = true;
	//   48  109:iconst_1        
	//   49  110:istore_3        
			return flag;
	//   50  111:iload_3         
	//   51  112:ireturn         
		} else
		{
			return false;
	//   52  113:iconst_0        
	//   53  114:ireturn         
		}
	}

	public final boolean dispatchKeyEvent(KeyEvent keyevent)
	{
		int i;
		int j;
		boolean flag;
		boolean flag1;
		j = keyevent.getAction();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #506 <Method int KeyEvent.getAction()>
	//    2    4:istore_3        
		flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore          6
		i = 0;
	//    5    8:iconst_0        
	//    6    9:istore_2        
		flag = flag1;
	//    7   10:iload           6
	//    8   12:istore          5
		if(j == 1) goto _L2; else goto _L1
	//    9   14:iload_3         
	//   10   15:iconst_1        
	//   11   16:icmpeq          192
_L1:
		j = keyevent.getKeyCode();
	//   12   19:aload_1         
	//   13   20:invokevirtual   #509 <Method int KeyEvent.getKeyCode()>
	//   14   23:istore_3        
		if(j == 61) goto _L4; else goto _L3
	//   15   24:iload_3         
	//   16   25:bipush          61
	//   17   27:icmpeq          158
_L3:
		if(j == 66) goto _L6; else goto _L5
	//   18   30:iload_3         
	//   19   31:bipush          66
	//   20   33:icmpeq          129
_L5:
		j;
	//   21   36:iload_3         
		JVM INSTR tableswitch 19 23: default 72
	//	               19 74
	//	               20 74
	//	               21 74
	//	               22 74
	//	               23 129;
	//   22   37:tableswitch     19 23: default 72
	//	               19 74
	//	               20 74
	//	               21 74
	//	               22 74
	//	               23 129
		   goto _L7 _L8 _L8 _L8 _L8 _L6
_L7:
		return false;
	//   23   72:iconst_0        
	//   24   73:ireturn         
_L8:
		flag = flag1;
	//   25   74:iload           6
	//   26   76:istore          5
		if(keyevent.hasNoModifiers())
	//*  27   78:aload_1         
	//*  28   79:invokevirtual   #512 <Method boolean KeyEvent.hasNoModifiers()>
	//*  29   82:ifeq            192
		{
			j = keyToDirection(j);
	//   30   85:iload_3         
	//   31   86:invokestatic    #514 <Method int keyToDirection(int)>
	//   32   89:istore_3        
			int k = keyevent.getRepeatCount();
	//   33   90:aload_1         
	//   34   91:invokevirtual   #517 <Method int KeyEvent.getRepeatCount()>
	//   35   94:istore          4
			for(flag = false; i < k + 1 && moveFocus(j, ((Rect) (null))); flag = true)
	//*  36   96:iconst_0        
	//*  37   97:istore          5
	//*  38   99:iload_2         
	//*  39  100:iload           4
	//*  40  102:iconst_1        
	//*  41  103:iadd            
	//*  42  104:icmpge          126
	//*  43  107:aload_0         
	//*  44  108:iload_3         
	//*  45  109:aconst_null     
	//*  46  110:invokespecial   #519 <Method boolean moveFocus(int, Rect)>
	//*  47  113:ifeq            126
				i++;
	//   48  116:iload_2         
	//   49  117:iconst_1        
	//   50  118:iadd            
	//   51  119:istore_2        

	//   52  120:iconst_1        
	//   53  121:istore          5
	//*  54  123:goto            99
			return flag;
	//   55  126:iload           5
	//   56  128:ireturn         
		}
		break; /* Loop/switch isn't completed */
_L6:
		flag = flag1;
	//   57  129:iload           6
	//   58  131:istore          5
		if(keyevent.hasNoModifiers())
	//*  59  133:aload_1         
	//*  60  134:invokevirtual   #512 <Method boolean KeyEvent.hasNoModifiers()>
	//*  61  137:ifeq            192
		{
			flag = flag1;
	//   62  140:iload           6
	//   63  142:istore          5
			if(keyevent.getRepeatCount() == 0)
	//*  64  144:aload_1         
	//*  65  145:invokevirtual   #517 <Method int KeyEvent.getRepeatCount()>
	//*  66  148:ifne            192
			{
				clickKeyboardFocusedVirtualView();
	//   67  151:aload_0         
	//   68  152:invokespecial   #521 <Method boolean clickKeyboardFocusedVirtualView()>
	//   69  155:pop             
				return true;
	//   70  156:iconst_1        
	//   71  157:ireturn         
			}
		}
		break; /* Loop/switch isn't completed */
_L4:
		if(keyevent.hasNoModifiers())
	//*  72  158:aload_1         
	//*  73  159:invokevirtual   #512 <Method boolean KeyEvent.hasNoModifiers()>
	//*  74  162:ifeq            172
			return moveFocus(2, ((Rect) (null)));
	//   75  165:aload_0         
	//   76  166:iconst_2        
	//   77  167:aconst_null     
	//   78  168:invokespecial   #519 <Method boolean moveFocus(int, Rect)>
	//   79  171:ireturn         
		flag = flag1;
	//   80  172:iload           6
	//   81  174:istore          5
		if(keyevent.hasModifiers(1))
	//*  82  176:aload_1         
	//*  83  177:iconst_1        
	//*  84  178:invokevirtual   #524 <Method boolean KeyEvent.hasModifiers(int)>
	//*  85  181:ifeq            192
			flag = moveFocus(1, ((Rect) (null)));
	//   86  184:aload_0         
	//   87  185:iconst_1        
	//   88  186:aconst_null     
	//   89  187:invokespecial   #519 <Method boolean moveFocus(int, Rect)>
	//   90  190:istore          5
_L2:
		return flag;
	//   91  192:iload           5
	//   92  194:ireturn         
	}

	public final int getAccessibilityFocusedVirtualViewId()
	{
		return mAccessibilityFocusedVirtualViewId;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field int mAccessibilityFocusedVirtualViewId>
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
	//    1    1:getfield        #77  <Field int mKeyboardFocusedVirtualViewId>
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
	//*   4    7:getfield        #106 <Field AccessibilityManager mManager>
	//*   5   10:invokevirtual   #473 <Method boolean AccessibilityManager.isEnabled()>
	//*   6   13:ifeq            55
		{
			android.view.ViewParent viewparent = mHost.getParent();
	//    7   16:aload_0         
	//    8   17:getfield        #88  <Field View mHost>
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
	//   23   46:getfield        #88  <Field View mHost>
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
	//    8   12:invokespecial   #383 <Method AccessibilityNodeInfoCompat createNodeForChild(int)>
	//    9   15:areturn         
	}

	public final void onFocusChanged(boolean flag, int i, Rect rect)
	{
		if(mKeyboardFocusedVirtualViewId != 0x80000000)
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field int mKeyboardFocusedVirtualViewId>
	//*   2    4:ldc1            #20  <Int 0x80000000>
	//*   3    6:icmpeq          18
			clearKeyboardFocusForVirtualView(mKeyboardFocusedVirtualViewId);
	//    4    9:aload_0         
	//    5   10:aload_0         
	//    6   11:getfield        #77  <Field int mKeyboardFocusedVirtualViewId>
	//    7   14:invokevirtual   #461 <Method boolean clearKeyboardFocusForVirtualView(int)>
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
		if(i != -1)
	//*   0    0:iload_1         
	//*   1    1:iconst_m1       
	//*   2    2:icmpeq          13
			return performActionForChild(i, j, bundle);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iload_2         
	//    6    8:aload_3         
	//    7    9:invokespecial   #574 <Method boolean performActionForChild(int, int, Bundle)>
	//    8   12:ireturn         
		else
			return performActionForHost(j, bundle);
	//    9   13:aload_0         
	//   10   14:iload_2         
	//   11   15:aload_3         
	//   12   16:invokespecial   #576 <Method boolean performActionForHost(int, Bundle)>
	//   13   19:ireturn         
	}

	public final boolean requestKeyboardFocusForVirtualView(int i)
	{
		if(!mHost.isFocused() && !mHost.requestFocus())
	//*   0    0:aload_0         
	//*   1    1:getfield        #88  <Field View mHost>
	//*   2    4:invokevirtual   #579 <Method boolean View.isFocused()>
	//*   3    7:ifne            22
	//*   4   10:aload_0         
	//*   5   11:getfield        #88  <Field View mHost>
	//*   6   14:invokevirtual   #582 <Method boolean View.requestFocus()>
	//*   7   17:ifne            22
			return false;
	//    8   20:iconst_0        
	//    9   21:ireturn         
		if(mKeyboardFocusedVirtualViewId == i)
	//*  10   22:aload_0         
	//*  11   23:getfield        #77  <Field int mKeyboardFocusedVirtualViewId>
	//*  12   26:iload_1         
	//*  13   27:icmpne          32
			return false;
	//   14   30:iconst_0        
	//   15   31:ireturn         
		if(mKeyboardFocusedVirtualViewId != 0x80000000)
	//*  16   32:aload_0         
	//*  17   33:getfield        #77  <Field int mKeyboardFocusedVirtualViewId>
	//*  18   36:ldc1            #20  <Int 0x80000000>
	//*  19   38:icmpeq          50
			clearKeyboardFocusForVirtualView(mKeyboardFocusedVirtualViewId);
	//   20   41:aload_0         
	//   21   42:aload_0         
	//   22   43:getfield        #77  <Field int mKeyboardFocusedVirtualViewId>
	//   23   46:invokevirtual   #461 <Method boolean clearKeyboardFocusForVirtualView(int)>
	//   24   49:pop             
		mKeyboardFocusedVirtualViewId = i;
	//   25   50:aload_0         
	//   26   51:iload_1         
	//   27   52:putfield        #77  <Field int mKeyboardFocusedVirtualViewId>
		onVirtualViewKeyboardFocusChanged(i, true);
	//   28   55:aload_0         
	//   29   56:iload_1         
	//   30   57:iconst_1        
	//   31   58:invokevirtual   #482 <Method void onVirtualViewKeyboardFocusChanged(int, boolean)>
		sendEventForVirtualView(i, 8);
	//   32   61:aload_0         
	//   33   62:iload_1         
	//   34   63:bipush          8
	//   35   65:invokevirtual   #134 <Method boolean sendEventForVirtualView(int, int)>
	//   36   68:pop             
		return true;
	//   37   69:iconst_1        
	//   38   70:ireturn         
	}

	public final boolean sendEventForVirtualView(int i, int j)
	{
		if(i != 0x80000000)
	//*   0    0:iload_1         
	//*   1    1:ldc1            #20  <Int 0x80000000>
	//*   2    3:icmpeq          51
		{
			if(!mManager.isEnabled())
	//*   3    6:aload_0         
	//*   4    7:getfield        #106 <Field AccessibilityManager mManager>
	//*   5   10:invokevirtual   #473 <Method boolean AccessibilityManager.isEnabled()>
	//*   6   13:ifne            18
				return false;
	//    7   16:iconst_0        
	//    8   17:ireturn         
			android.view.ViewParent viewparent = mHost.getParent();
	//    9   18:aload_0         
	//   10   19:getfield        #88  <Field View mHost>
	//   11   22:invokevirtual   #411 <Method android.view.ViewParent View.getParent()>
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
	//   20   35:invokespecial   #544 <Method AccessibilityEvent createEvent(int, int)>
	//   21   38:astore          4
				return ViewParentCompat.requestSendAccessibilityEvent(viewparent, mHost, accessibilityevent);
	//   22   40:aload_3         
	//   23   41:aload_0         
	//   24   42:getfield        #88  <Field View mHost>
	//   25   45:aload           4
	//   26   47:invokestatic    #556 <Method boolean ViewParentCompat.requestSendAccessibilityEvent(android.view.ViewParent, View, AccessibilityEvent)>
	//   27   50:ireturn         
			}
		} else
		{
			return false;
	//   28   51:iconst_0        
	//   29   52:ireturn         
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
	//    1    1:getfield        #75  <Field int mAccessibilityFocusedVirtualViewId>
	//    2    4:ireturn         
	}

*/


/*
	static int access$100(ExploreByTouchHelper explorebytouchhelper)
	{
		return explorebytouchhelper.mKeyboardFocusedVirtualViewId;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field int mKeyboardFocusedVirtualViewId>
	//    2    4:ireturn         
	}

*/
}
