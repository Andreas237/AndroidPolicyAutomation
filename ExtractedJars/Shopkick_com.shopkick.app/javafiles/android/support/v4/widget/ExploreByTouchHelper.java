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
		//    5    9:getfield        #33  <Field int ExploreByTouchHelper.mAccessibilityFocusedVirtualViewId>
		//    6   12:istore_1        
			else
		//*   7   13:goto            24
				i = mKeyboardFocusedVirtualViewId;
		//    8   16:aload_0         
		//    9   17:getfield        #13  <Field ExploreByTouchHelper this$0>
		//   10   20:getfield        #36  <Field int ExploreByTouchHelper.mKeyboardFocusedVirtualViewId>
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
		if(view != null)
	//*  30   62:aload_1         
	//*  31   63:ifnull          105
		{
			mHost = view;
	//   32   66:aload_0         
	//   33   67:aload_1         
	//   34   68:putfield        #81  <Field View mHost>
			mManager = (AccessibilityManager)view.getContext().getSystemService("accessibility");
	//   35   71:aload_0         
	//   36   72:aload_1         
	//   37   73:invokevirtual   #87  <Method Context View.getContext()>
	//   38   76:ldc1            #89  <String "accessibility">
	//   39   78:invokevirtual   #95  <Method Object Context.getSystemService(String)>
	//   40   81:checkcast       #97  <Class AccessibilityManager>
	//   41   84:putfield        #99  <Field AccessibilityManager mManager>
			view.setFocusable(true);
	//   42   87:aload_1         
	//   43   88:iconst_1        
	//   44   89:invokevirtual   #103 <Method void View.setFocusable(boolean)>
			if(ViewCompat.getImportantForAccessibility(view) == 0)
	//*  45   92:aload_1         
	//*  46   93:invokestatic    #109 <Method int ViewCompat.getImportantForAccessibility(View)>
	//*  47   96:ifne            104
				ViewCompat.setImportantForAccessibility(view, 1);
	//   48   99:aload_1         
	//   49  100:iconst_1        
	//   50  101:invokestatic    #113 <Method void ViewCompat.setImportantForAccessibility(View, int)>
			return;
	//   51  104:return          
		} else
		{
			throw new IllegalArgumentException("View may not be null");
	//   52  105:new             #115 <Class IllegalArgumentException>
	//   53  108:dup             
	//   54  109:ldc1            #117 <String "View may not be null">
	//   55  111:invokespecial   #120 <Method void IllegalArgumentException(String)>
	//   56  114:athrow          
		}
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
	//    8   15:getfield        #81  <Field View mHost>
	//    9   18:invokevirtual   #126 <Method void View.invalidate()>
			sendEventForVirtualView(i, 0x10000);
	//   10   21:aload_0         
	//   11   22:iload_1         
	//   12   23:ldc1            #127 <Int 0x10000>
	//   13   25:invokevirtual   #131 <Method boolean sendEventForVirtualView(int, int)>
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
		int i = mKeyboardFocusedVirtualViewId;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field int mKeyboardFocusedVirtualViewId>
	//    2    4:istore_1        
		return i != 0x80000000 && onPerformActionForVirtualView(i, 16, ((Bundle) (null)));
	//    3    5:iload_1         
	//    4    6:ldc1            #20  <Int 0x80000000>
	//    5    8:icmpeq          24
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:bipush          16
	//    9   15:aconst_null     
	//   10   16:invokevirtual   #137 <Method boolean onPerformActionForVirtualView(int, int, Bundle)>
	//   11   19:ifeq            24
	//   12   22:iconst_1        
	//   13   23:ireturn         
	//   14   24:iconst_0        
	//   15   25:ireturn         
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
	//    6    8:invokespecial   #142 <Method AccessibilityEvent createEventForChild(int, int)>
	//    7   11:areturn         
		else
			return createEventForHost(j);
	//    8   12:aload_0         
	//    9   13:iload_2         
	//   10   14:invokespecial   #146 <Method AccessibilityEvent createEventForHost(int)>
	//   11   17:areturn         
	}

	private AccessibilityEvent createEventForChild(int i, int j)
	{
		AccessibilityEvent accessibilityevent = AccessibilityEvent.obtain(j);
	//    0    0:iload_2         
	//    1    1:invokestatic    #151 <Method AccessibilityEvent AccessibilityEvent.obtain(int)>
	//    2    4:astore_3        
		AccessibilityNodeInfoCompat accessibilitynodeinfocompat = obtainAccessibilityNodeInfo(i);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokevirtual   #155 <Method AccessibilityNodeInfoCompat obtainAccessibilityNodeInfo(int)>
	//    6   10:astore          4
		accessibilityevent.getText().add(((Object) (accessibilitynodeinfocompat.getText())));
	//    7   12:aload_3         
	//    8   13:invokevirtual   #159 <Method List AccessibilityEvent.getText()>
	//    9   16:aload           4
	//   10   18:invokevirtual   #164 <Method CharSequence AccessibilityNodeInfoCompat.getText()>
	//   11   21:invokeinterface #170 <Method boolean List.add(Object)>
	//   12   26:pop             
		accessibilityevent.setContentDescription(accessibilitynodeinfocompat.getContentDescription());
	//   13   27:aload_3         
	//   14   28:aload           4
	//   15   30:invokevirtual   #173 <Method CharSequence AccessibilityNodeInfoCompat.getContentDescription()>
	//   16   33:invokevirtual   #177 <Method void AccessibilityEvent.setContentDescription(CharSequence)>
		accessibilityevent.setScrollable(accessibilitynodeinfocompat.isScrollable());
	//   17   36:aload_3         
	//   18   37:aload           4
	//   19   39:invokevirtual   #180 <Method boolean AccessibilityNodeInfoCompat.isScrollable()>
	//   20   42:invokevirtual   #183 <Method void AccessibilityEvent.setScrollable(boolean)>
		accessibilityevent.setPassword(accessibilitynodeinfocompat.isPassword());
	//   21   45:aload_3         
	//   22   46:aload           4
	//   23   48:invokevirtual   #186 <Method boolean AccessibilityNodeInfoCompat.isPassword()>
	//   24   51:invokevirtual   #189 <Method void AccessibilityEvent.setPassword(boolean)>
		accessibilityevent.setEnabled(accessibilitynodeinfocompat.isEnabled());
	//   25   54:aload_3         
	//   26   55:aload           4
	//   27   57:invokevirtual   #192 <Method boolean AccessibilityNodeInfoCompat.isEnabled()>
	//   28   60:invokevirtual   #195 <Method void AccessibilityEvent.setEnabled(boolean)>
		accessibilityevent.setChecked(accessibilitynodeinfocompat.isChecked());
	//   29   63:aload_3         
	//   30   64:aload           4
	//   31   66:invokevirtual   #198 <Method boolean AccessibilityNodeInfoCompat.isChecked()>
	//   32   69:invokevirtual   #201 <Method void AccessibilityEvent.setChecked(boolean)>
		onPopulateEventForVirtualView(i, accessibilityevent);
	//   33   72:aload_0         
	//   34   73:iload_1         
	//   35   74:aload_3         
	//   36   75:invokevirtual   #205 <Method void onPopulateEventForVirtualView(int, AccessibilityEvent)>
		if(accessibilityevent.getText().isEmpty() && accessibilityevent.getContentDescription() == null)
	//*  37   78:aload_3         
	//*  38   79:invokevirtual   #159 <Method List AccessibilityEvent.getText()>
	//*  39   82:invokeinterface #208 <Method boolean List.isEmpty()>
	//*  40   87:ifeq            110
	//*  41   90:aload_3         
	//*  42   91:invokevirtual   #209 <Method CharSequence AccessibilityEvent.getContentDescription()>
	//*  43   94:ifnull          100
	//*  44   97:goto            110
		{
			throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
	//   45  100:new             #211 <Class RuntimeException>
	//   46  103:dup             
	//   47  104:ldc1            #213 <String "Callbacks must add text or a content description in populateEventForVirtualViewId()">
	//   48  106:invokespecial   #214 <Method void RuntimeException(String)>
	//   49  109:athrow          
		} else
		{
			accessibilityevent.setClassName(accessibilitynodeinfocompat.getClassName());
	//   50  110:aload_3         
	//   51  111:aload           4
	//   52  113:invokevirtual   #217 <Method CharSequence AccessibilityNodeInfoCompat.getClassName()>
	//   53  116:invokevirtual   #220 <Method void AccessibilityEvent.setClassName(CharSequence)>
			AccessibilityRecordCompat.setSource(((android.view.accessibility.AccessibilityRecord) (accessibilityevent)), mHost, i);
	//   54  119:aload_3         
	//   55  120:aload_0         
	//   56  121:getfield        #81  <Field View mHost>
	//   57  124:iload_1         
	//   58  125:invokestatic    #226 <Method void AccessibilityRecordCompat.setSource(android.view.accessibility.AccessibilityRecord, View, int)>
			accessibilityevent.setPackageName(((CharSequence) (mHost.getContext().getPackageName())));
	//   59  128:aload_3         
	//   60  129:aload_0         
	//   61  130:getfield        #81  <Field View mHost>
	//   62  133:invokevirtual   #87  <Method Context View.getContext()>
	//   63  136:invokevirtual   #230 <Method String Context.getPackageName()>
	//   64  139:invokevirtual   #233 <Method void AccessibilityEvent.setPackageName(CharSequence)>
			return accessibilityevent;
	//   65  142:aload_3         
	//   66  143:areturn         
		}
	}

	private AccessibilityEvent createEventForHost(int i)
	{
		AccessibilityEvent accessibilityevent = AccessibilityEvent.obtain(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #151 <Method AccessibilityEvent AccessibilityEvent.obtain(int)>
	//    2    4:astore_2        
		mHost.onInitializeAccessibilityEvent(accessibilityevent);
	//    3    5:aload_0         
	//    4    6:getfield        #81  <Field View mHost>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #237 <Method void View.onInitializeAccessibilityEvent(AccessibilityEvent)>
		return accessibilityevent;
	//    7   13:aload_2         
	//    8   14:areturn         
	}

	private AccessibilityNodeInfoCompat createNodeForChild(int i)
	{
		AccessibilityNodeInfoCompat accessibilitynodeinfocompat = AccessibilityNodeInfoCompat.obtain();
	//    0    0:invokestatic    #241 <Method AccessibilityNodeInfoCompat AccessibilityNodeInfoCompat.obtain()>
	//    1    3:astore          4
		accessibilitynodeinfocompat.setEnabled(true);
	//    2    5:aload           4
	//    3    7:iconst_1        
	//    4    8:invokevirtual   #242 <Method void AccessibilityNodeInfoCompat.setEnabled(boolean)>
		accessibilitynodeinfocompat.setFocusable(true);
	//    5   11:aload           4
	//    6   13:iconst_1        
	//    7   14:invokevirtual   #243 <Method void AccessibilityNodeInfoCompat.setFocusable(boolean)>
		accessibilitynodeinfocompat.setClassName("android.view.View");
	//    8   17:aload           4
	//    9   19:ldc1            #15  <String "android.view.View">
	//   10   21:invokevirtual   #244 <Method void AccessibilityNodeInfoCompat.setClassName(CharSequence)>
		accessibilitynodeinfocompat.setBoundsInParent(INVALID_PARENT_BOUNDS);
	//   11   24:aload           4
	//   12   26:getstatic       #53  <Field Rect INVALID_PARENT_BOUNDS>
	//   13   29:invokevirtual   #248 <Method void AccessibilityNodeInfoCompat.setBoundsInParent(Rect)>
		accessibilitynodeinfocompat.setBoundsInScreen(INVALID_PARENT_BOUNDS);
	//   14   32:aload           4
	//   15   34:getstatic       #53  <Field Rect INVALID_PARENT_BOUNDS>
	//   16   37:invokevirtual   #251 <Method void AccessibilityNodeInfoCompat.setBoundsInScreen(Rect)>
		accessibilitynodeinfocompat.setParent(mHost);
	//   17   40:aload           4
	//   18   42:aload_0         
	//   19   43:getfield        #81  <Field View mHost>
	//   20   46:invokevirtual   #254 <Method void AccessibilityNodeInfoCompat.setParent(View)>
		onPopulateNodeForVirtualView(i, accessibilitynodeinfocompat);
	//   21   49:aload_0         
	//   22   50:iload_1         
	//   23   51:aload           4
	//   24   53:invokevirtual   #258 <Method void onPopulateNodeForVirtualView(int, AccessibilityNodeInfoCompat)>
		if(accessibilitynodeinfocompat.getText() == null && accessibilitynodeinfocompat.getContentDescription() == null)
	//*  25   56:aload           4
	//*  26   58:invokevirtual   #164 <Method CharSequence AccessibilityNodeInfoCompat.getText()>
	//*  27   61:ifnonnull       86
	//*  28   64:aload           4
	//*  29   66:invokevirtual   #173 <Method CharSequence AccessibilityNodeInfoCompat.getContentDescription()>
	//*  30   69:ifnull          75
	//*  31   72:goto            86
			throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
	//   32   75:new             #211 <Class RuntimeException>
	//   33   78:dup             
	//   34   79:ldc2            #260 <String "Callbacks must add text or a content description in populateNodeForVirtualViewId()">
	//   35   82:invokespecial   #214 <Method void RuntimeException(String)>
	//   36   85:athrow          
		accessibilitynodeinfocompat.getBoundsInParent(mTempParentRect);
	//   37   86:aload           4
	//   38   88:aload_0         
	//   39   89:getfield        #69  <Field Rect mTempParentRect>
	//   40   92:invokevirtual   #263 <Method void AccessibilityNodeInfoCompat.getBoundsInParent(Rect)>
		if(!mTempParentRect.equals(((Object) (INVALID_PARENT_BOUNDS))))
	//*  41   95:aload_0         
	//*  42   96:getfield        #69  <Field Rect mTempParentRect>
	//*  43   99:getstatic       #53  <Field Rect INVALID_PARENT_BOUNDS>
	//*  44  102:invokevirtual   #266 <Method boolean Rect.equals(Object)>
	//*  45  105:ifne            525
		{
			int j = accessibilitynodeinfocompat.getActions();
	//   46  108:aload           4
	//   47  110:invokevirtual   #270 <Method int AccessibilityNodeInfoCompat.getActions()>
	//   48  113:istore_2        
			if((j & 0x40) == 0)
	//*  49  114:iload_2         
	//*  50  115:bipush          64
	//*  51  117:iand            
	//*  52  118:ifne            514
			{
				if((j & 0x80) == 0)
	//*  53  121:iload_2         
	//*  54  122:sipush          128
	//*  55  125:iand            
	//*  56  126:ifne            503
				{
					accessibilitynodeinfocompat.setPackageName(((CharSequence) (mHost.getContext().getPackageName())));
	//   57  129:aload           4
	//   58  131:aload_0         
	//   59  132:getfield        #81  <Field View mHost>
	//   60  135:invokevirtual   #87  <Method Context View.getContext()>
	//   61  138:invokevirtual   #230 <Method String Context.getPackageName()>
	//   62  141:invokevirtual   #271 <Method void AccessibilityNodeInfoCompat.setPackageName(CharSequence)>
					accessibilitynodeinfocompat.setSource(mHost, i);
	//   63  144:aload           4
	//   64  146:aload_0         
	//   65  147:getfield        #81  <Field View mHost>
	//   66  150:iload_1         
	//   67  151:invokevirtual   #273 <Method void AccessibilityNodeInfoCompat.setSource(View, int)>
					if(mAccessibilityFocusedVirtualViewId == i)
	//*  68  154:aload_0         
	//*  69  155:getfield        #75  <Field int mAccessibilityFocusedVirtualViewId>
	//*  70  158:iload_1         
	//*  71  159:icmpne          179
					{
						accessibilitynodeinfocompat.setAccessibilityFocused(true);
	//   72  162:aload           4
	//   73  164:iconst_1        
	//   74  165:invokevirtual   #276 <Method void AccessibilityNodeInfoCompat.setAccessibilityFocused(boolean)>
						accessibilitynodeinfocompat.addAction(128);
	//   75  168:aload           4
	//   76  170:sipush          128
	//   77  173:invokevirtual   #280 <Method void AccessibilityNodeInfoCompat.addAction(int)>
					} else
	//*  78  176:goto            192
					{
						accessibilitynodeinfocompat.setAccessibilityFocused(false);
	//   79  179:aload           4
	//   80  181:iconst_0        
	//   81  182:invokevirtual   #276 <Method void AccessibilityNodeInfoCompat.setAccessibilityFocused(boolean)>
						accessibilitynodeinfocompat.addAction(64);
	//   82  185:aload           4
	//   83  187:bipush          64
	//   84  189:invokevirtual   #280 <Method void AccessibilityNodeInfoCompat.addAction(int)>
					}
					boolean flag;
					if(mKeyboardFocusedVirtualViewId == i)
	//*  85  192:aload_0         
	//*  86  193:getfield        #77  <Field int mKeyboardFocusedVirtualViewId>
	//*  87  196:iload_1         
	//*  88  197:icmpne          205
						flag = true;
	//   89  200:iconst_1        
	//   90  201:istore_3        
					else
	//*  91  202:goto            207
						flag = false;
	//   92  205:iconst_0        
	//   93  206:istore_3        
					if(flag)
	//*  94  207:iload_3         
	//*  95  208:ifeq            220
						accessibilitynodeinfocompat.addAction(2);
	//   96  211:aload           4
	//   97  213:iconst_2        
	//   98  214:invokevirtual   #280 <Method void AccessibilityNodeInfoCompat.addAction(int)>
					else
	//*  99  217:goto            234
					if(accessibilitynodeinfocompat.isFocusable())
	//* 100  220:aload           4
	//* 101  222:invokevirtual   #283 <Method boolean AccessibilityNodeInfoCompat.isFocusable()>
	//* 102  225:ifeq            234
						accessibilitynodeinfocompat.addAction(1);
	//  103  228:aload           4
	//  104  230:iconst_1        
	//  105  231:invokevirtual   #280 <Method void AccessibilityNodeInfoCompat.addAction(int)>
					accessibilitynodeinfocompat.setFocused(flag);
	//  106  234:aload           4
	//  107  236:iload_3         
	//  108  237:invokevirtual   #286 <Method void AccessibilityNodeInfoCompat.setFocused(boolean)>
					mHost.getLocationOnScreen(mTempGlobalRect);
	//  109  240:aload_0         
	//  110  241:getfield        #81  <Field View mHost>
	//  111  244:aload_0         
	//  112  245:getfield        #73  <Field int[] mTempGlobalRect>
	//  113  248:invokevirtual   #290 <Method void View.getLocationOnScreen(int[])>
					accessibilitynodeinfocompat.getBoundsInScreen(mTempScreenRect);
	//  114  251:aload           4
	//  115  253:aload_0         
	//  116  254:getfield        #67  <Field Rect mTempScreenRect>
	//  117  257:invokevirtual   #293 <Method void AccessibilityNodeInfoCompat.getBoundsInScreen(Rect)>
					if(mTempScreenRect.equals(((Object) (INVALID_PARENT_BOUNDS))))
	//* 118  260:aload_0         
	//* 119  261:getfield        #67  <Field Rect mTempScreenRect>
	//* 120  264:getstatic       #53  <Field Rect INVALID_PARENT_BOUNDS>
	//* 121  267:invokevirtual   #266 <Method boolean Rect.equals(Object)>
	//* 122  270:ifeq            411
					{
						accessibilitynodeinfocompat.getBoundsInParent(mTempScreenRect);
	//  123  273:aload           4
	//  124  275:aload_0         
	//  125  276:getfield        #67  <Field Rect mTempScreenRect>
	//  126  279:invokevirtual   #263 <Method void AccessibilityNodeInfoCompat.getBoundsInParent(Rect)>
						if(accessibilitynodeinfocompat.mParentVirtualDescendantId != -1)
	//* 127  282:aload           4
	//* 128  284:getfield        #296 <Field int AccessibilityNodeInfoCompat.mParentVirtualDescendantId>
	//* 129  287:iconst_m1       
	//* 130  288:icmpeq          376
						{
							AccessibilityNodeInfoCompat accessibilitynodeinfocompat1 = AccessibilityNodeInfoCompat.obtain();
	//  131  291:invokestatic    #241 <Method AccessibilityNodeInfoCompat AccessibilityNodeInfoCompat.obtain()>
	//  132  294:astore          5
							for(i = accessibilitynodeinfocompat.mParentVirtualDescendantId; i != -1; i = accessibilitynodeinfocompat1.mParentVirtualDescendantId)
	//* 133  296:aload           4
	//* 134  298:getfield        #296 <Field int AccessibilityNodeInfoCompat.mParentVirtualDescendantId>
	//* 135  301:istore_1        
	//* 136  302:iload_1         
	//* 137  303:iconst_m1       
	//* 138  304:icmpeq          371
							{
								accessibilitynodeinfocompat1.setParent(mHost, -1);
	//  139  307:aload           5
	//  140  309:aload_0         
	//  141  310:getfield        #81  <Field View mHost>
	//  142  313:iconst_m1       
	//  143  314:invokevirtual   #298 <Method void AccessibilityNodeInfoCompat.setParent(View, int)>
								accessibilitynodeinfocompat1.setBoundsInParent(INVALID_PARENT_BOUNDS);
	//  144  317:aload           5
	//  145  319:getstatic       #53  <Field Rect INVALID_PARENT_BOUNDS>
	//  146  322:invokevirtual   #248 <Method void AccessibilityNodeInfoCompat.setBoundsInParent(Rect)>
								onPopulateNodeForVirtualView(i, accessibilitynodeinfocompat1);
	//  147  325:aload_0         
	//  148  326:iload_1         
	//  149  327:aload           5
	//  150  329:invokevirtual   #258 <Method void onPopulateNodeForVirtualView(int, AccessibilityNodeInfoCompat)>
								accessibilitynodeinfocompat1.getBoundsInParent(mTempParentRect);
	//  151  332:aload           5
	//  152  334:aload_0         
	//  153  335:getfield        #69  <Field Rect mTempParentRect>
	//  154  338:invokevirtual   #263 <Method void AccessibilityNodeInfoCompat.getBoundsInParent(Rect)>
								mTempScreenRect.offset(mTempParentRect.left, mTempParentRect.top);
	//  155  341:aload_0         
	//  156  342:getfield        #67  <Field Rect mTempScreenRect>
	//  157  345:aload_0         
	//  158  346:getfield        #69  <Field Rect mTempParentRect>
	//  159  349:getfield        #301 <Field int Rect.left>
	//  160  352:aload_0         
	//  161  353:getfield        #69  <Field Rect mTempParentRect>
	//  162  356:getfield        #304 <Field int Rect.top>
	//  163  359:invokevirtual   #308 <Method void Rect.offset(int, int)>
							}

	//  164  362:aload           5
	//  165  364:getfield        #296 <Field int AccessibilityNodeInfoCompat.mParentVirtualDescendantId>
	//  166  367:istore_1        
	//* 167  368:goto            302
							accessibilitynodeinfocompat1.recycle();
	//  168  371:aload           5
	//  169  373:invokevirtual   #311 <Method void AccessibilityNodeInfoCompat.recycle()>
						}
						mTempScreenRect.offset(mTempGlobalRect[0] - mHost.getScrollX(), mTempGlobalRect[1] - mHost.getScrollY());
	//  170  376:aload_0         
	//  171  377:getfield        #67  <Field Rect mTempScreenRect>
	//  172  380:aload_0         
	//  173  381:getfield        #73  <Field int[] mTempGlobalRect>
	//  174  384:iconst_0        
	//  175  385:iaload          
	//  176  386:aload_0         
	//  177  387:getfield        #81  <Field View mHost>
	//  178  390:invokevirtual   #314 <Method int View.getScrollX()>
	//  179  393:isub            
	//  180  394:aload_0         
	//  181  395:getfield        #73  <Field int[] mTempGlobalRect>
	//  182  398:iconst_1        
	//  183  399:iaload          
	//  184  400:aload_0         
	//  185  401:getfield        #81  <Field View mHost>
	//  186  404:invokevirtual   #317 <Method int View.getScrollY()>
	//  187  407:isub            
	//  188  408:invokevirtual   #308 <Method void Rect.offset(int, int)>
					}
					if(mHost.getLocalVisibleRect(mTempVisibleRect))
	//* 189  411:aload_0         
	//* 190  412:getfield        #81  <Field View mHost>
	//* 191  415:aload_0         
	//* 192  416:getfield        #71  <Field Rect mTempVisibleRect>
	//* 193  419:invokevirtual   #321 <Method boolean View.getLocalVisibleRect(Rect)>
	//* 194  422:ifeq            500
					{
						mTempVisibleRect.offset(mTempGlobalRect[0] - mHost.getScrollX(), mTempGlobalRect[1] - mHost.getScrollY());
	//  195  425:aload_0         
	//  196  426:getfield        #71  <Field Rect mTempVisibleRect>
	//  197  429:aload_0         
	//  198  430:getfield        #73  <Field int[] mTempGlobalRect>
	//  199  433:iconst_0        
	//  200  434:iaload          
	//  201  435:aload_0         
	//  202  436:getfield        #81  <Field View mHost>
	//  203  439:invokevirtual   #314 <Method int View.getScrollX()>
	//  204  442:isub            
	//  205  443:aload_0         
	//  206  444:getfield        #73  <Field int[] mTempGlobalRect>
	//  207  447:iconst_1        
	//  208  448:iaload          
	//  209  449:aload_0         
	//  210  450:getfield        #81  <Field View mHost>
	//  211  453:invokevirtual   #317 <Method int View.getScrollY()>
	//  212  456:isub            
	//  213  457:invokevirtual   #308 <Method void Rect.offset(int, int)>
						if(mTempScreenRect.intersect(mTempVisibleRect))
	//* 214  460:aload_0         
	//* 215  461:getfield        #67  <Field Rect mTempScreenRect>
	//* 216  464:aload_0         
	//* 217  465:getfield        #71  <Field Rect mTempVisibleRect>
	//* 218  468:invokevirtual   #324 <Method boolean Rect.intersect(Rect)>
	//* 219  471:ifeq            500
						{
							accessibilitynodeinfocompat.setBoundsInScreen(mTempScreenRect);
	//  220  474:aload           4
	//  221  476:aload_0         
	//  222  477:getfield        #67  <Field Rect mTempScreenRect>
	//  223  480:invokevirtual   #251 <Method void AccessibilityNodeInfoCompat.setBoundsInScreen(Rect)>
							if(isVisibleToUser(mTempScreenRect))
	//* 224  483:aload_0         
	//* 225  484:aload_0         
	//* 226  485:getfield        #67  <Field Rect mTempScreenRect>
	//* 227  488:invokespecial   #327 <Method boolean isVisibleToUser(Rect)>
	//* 228  491:ifeq            500
								accessibilitynodeinfocompat.setVisibleToUser(true);
	//  229  494:aload           4
	//  230  496:iconst_1        
	//  231  497:invokevirtual   #330 <Method void AccessibilityNodeInfoCompat.setVisibleToUser(boolean)>
						}
					}
					return accessibilitynodeinfocompat;
	//  232  500:aload           4
	//  233  502:areturn         
				} else
				{
					throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
	//  234  503:new             #211 <Class RuntimeException>
	//  235  506:dup             
	//  236  507:ldc2            #332 <String "Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()">
	//  237  510:invokespecial   #214 <Method void RuntimeException(String)>
	//  238  513:athrow          
				}
			} else
			{
				throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
	//  239  514:new             #211 <Class RuntimeException>
	//  240  517:dup             
	//  241  518:ldc2            #334 <String "Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()">
	//  242  521:invokespecial   #214 <Method void RuntimeException(String)>
	//  243  524:athrow          
			}
		} else
		{
			throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
	//  244  525:new             #211 <Class RuntimeException>
	//  245  528:dup             
	//  246  529:ldc2            #336 <String "Callbacks must set parent bounds in populateNodeForVirtualViewId()">
	//  247  532:invokespecial   #214 <Method void RuntimeException(String)>
	//  248  535:athrow          
		}
	}

	private AccessibilityNodeInfoCompat createNodeForHost()
	{
		AccessibilityNodeInfoCompat accessibilitynodeinfocompat = AccessibilityNodeInfoCompat.obtain(mHost);
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field View mHost>
	//    2    4:invokestatic    #341 <Method AccessibilityNodeInfoCompat AccessibilityNodeInfoCompat.obtain(View)>
	//    3    7:astore_3        
		ViewCompat.onInitializeAccessibilityNodeInfo(mHost, accessibilitynodeinfocompat);
	//    4    8:aload_0         
	//    5    9:getfield        #81  <Field View mHost>
	//    6   12:aload_3         
	//    7   13:invokestatic    #345 <Method void ViewCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
		ArrayList arraylist = new ArrayList();
	//    8   16:new             #347 <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #348 <Method void ArrayList()>
	//   11   23:astore          4
		getVisibleVirtualViews(((List) (arraylist)));
	//   12   25:aload_0         
	//   13   26:aload           4
	//   14   28:invokevirtual   #352 <Method void getVisibleVirtualViews(List)>
		if(accessibilitynodeinfocompat.getChildCount() > 0 && arraylist.size() > 0)
	//*  15   31:aload_3         
	//*  16   32:invokevirtual   #355 <Method int AccessibilityNodeInfoCompat.getChildCount()>
	//*  17   35:ifle            60
	//*  18   38:aload           4
	//*  19   40:invokevirtual   #358 <Method int ArrayList.size()>
	//*  20   43:ifgt            49
	//*  21   46:goto            60
			throw new RuntimeException("Views cannot have both real and virtual children");
	//   22   49:new             #211 <Class RuntimeException>
	//   23   52:dup             
	//   24   53:ldc2            #360 <String "Views cannot have both real and virtual children">
	//   25   56:invokespecial   #214 <Method void RuntimeException(String)>
	//   26   59:athrow          
		int i = 0;
	//   27   60:iconst_0        
	//   28   61:istore_1        
		for(int j = arraylist.size(); i < j; i++)
	//*  29   62:aload           4
	//*  30   64:invokevirtual   #358 <Method int ArrayList.size()>
	//*  31   67:istore_2        
	//*  32   68:iload_1         
	//*  33   69:iload_2         
	//*  34   70:icmpge          100
			accessibilitynodeinfocompat.addChild(mHost, ((Integer)arraylist.get(i)).intValue());
	//   35   73:aload_3         
	//   36   74:aload_0         
	//   37   75:getfield        #81  <Field View mHost>
	//   38   78:aload           4
	//   39   80:iload_1         
	//   40   81:invokevirtual   #364 <Method Object ArrayList.get(int)>
	//   41   84:checkcast       #366 <Class Integer>
	//   42   87:invokevirtual   #369 <Method int Integer.intValue()>
	//   43   90:invokevirtual   #372 <Method void AccessibilityNodeInfoCompat.addChild(View, int)>

	//   44   93:iload_1         
	//   45   94:iconst_1        
	//   46   95:iadd            
	//   47   96:istore_1        
	//*  48   97:goto            68
		return accessibilitynodeinfocompat;
	//   49  100:aload_3         
	//   50  101:areturn         
	}

	private SparseArrayCompat getAllNodes()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #347 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #348 <Method void ArrayList()>
	//    3    7:astore_2        
		getVisibleVirtualViews(((List) (arraylist)));
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #352 <Method void getVisibleVirtualViews(List)>
		SparseArrayCompat sparsearraycompat = new SparseArrayCompat();
	//    7   13:new             #376 <Class SparseArrayCompat>
	//    8   16:dup             
	//    9   17:invokespecial   #377 <Method void SparseArrayCompat()>
	//   10   20:astore_3        
		for(int i = 0; i < ((List) (arraylist)).size(); i++)
	//*  11   21:iconst_0        
	//*  12   22:istore_1        
	//*  13   23:iload_1         
	//*  14   24:aload_2         
	//*  15   25:invokeinterface #378 <Method int List.size()>
	//*  16   30:icmpge          50
			sparsearraycompat.put(i, ((Object) (createNodeForChild(i))));
	//   17   33:aload_3         
	//   18   34:iload_1         
	//   19   35:aload_0         
	//   20   36:iload_1         
	//   21   37:invokespecial   #380 <Method AccessibilityNodeInfoCompat createNodeForChild(int)>
	//   22   40:invokevirtual   #384 <Method void SparseArrayCompat.put(int, Object)>

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
	//    2    2:invokevirtual   #155 <Method AccessibilityNodeInfoCompat obtainAccessibilityNodeInfo(int)>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #263 <Method void AccessibilityNodeInfoCompat.getBoundsInParent(Rect)>
	//    5    9:return          
	}

	private static Rect guessPreviouslyFocusedRect(View view, int i, Rect rect)
	{
		int j = view.getWidth();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #392 <Method int View.getWidth()>
	//    2    4:istore_3        
		int k = view.getHeight();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #395 <Method int View.getHeight()>
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
					if(i == 130)
	//*  15   29:iload_1         
	//*  16   30:sipush          130
	//*  17   33:icmpne          46
					{
						rect.set(0, -1, j, -1);
	//   18   36:aload_2         
	//   19   37:iconst_0        
	//   20   38:iconst_m1       
	//   21   39:iload_3         
	//   22   40:iconst_m1       
	//   23   41:invokevirtual   #398 <Method void Rect.set(int, int, int, int)>
						return rect;
	//   24   44:aload_2         
	//   25   45:areturn         
					} else
					{
						throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
	//   26   46:new             #115 <Class IllegalArgumentException>
	//   27   49:dup             
	//   28   50:ldc2            #400 <String "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.">
	//   29   53:invokespecial   #120 <Method void IllegalArgumentException(String)>
	//   30   56:athrow          
					}
				} else
				{
					rect.set(-1, 0, -1, k);
	//   31   57:aload_2         
	//   32   58:iconst_m1       
	//   33   59:iconst_0        
	//   34   60:iconst_m1       
	//   35   61:iload           4
	//   36   63:invokevirtual   #398 <Method void Rect.set(int, int, int, int)>
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
	//   44   75:invokevirtual   #398 <Method void Rect.set(int, int, int, int)>
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
	//   52   86:invokevirtual   #398 <Method void Rect.set(int, int, int, int)>
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
	//*   5    7:invokevirtual   #401 <Method boolean Rect.isEmpty()>
	//*   6   10:ifeq            15
				return false;
	//    7   13:iconst_0        
	//    8   14:ireturn         
			if(mHost.getWindowVisibility() != 0)
	//*   9   15:aload_0         
	//*  10   16:getfield        #81  <Field View mHost>
	//*  11   19:invokevirtual   #404 <Method int View.getWindowVisibility()>
	//*  12   22:ifeq            27
				return false;
	//   13   25:iconst_0        
	//   14   26:ireturn         
			for(rect = ((Rect) (mHost.getParent())); rect instanceof View;)
	//*  15   27:aload_0         
	//*  16   28:getfield        #81  <Field View mHost>
	//*  17   31:invokevirtual   #408 <Method android.view.ViewParent View.getParent()>
	//*  18   34:astore_1        
	//*  19   35:aload_1         
	//*  20   36:instanceof      #83  <Class View>
	//*  21   39:ifeq            75
			{
				rect = ((Rect) ((View)rect));
	//   22   42:aload_1         
	//   23   43:checkcast       #83  <Class View>
	//   24   46:astore_1        
				if(((View) (rect)).getAlpha() > 0.0F)
	//*  25   47:aload_1         
	//*  26   48:invokevirtual   #412 <Method float View.getAlpha()>
	//*  27   51:fconst_0        
	//*  28   52:fcmpg           
	//*  29   53:ifle            73
				{
					if(((View) (rect)).getVisibility() != 0)
	//*  30   56:aload_1         
	//*  31   57:invokevirtual   #415 <Method int View.getVisibility()>
	//*  32   60:ifeq            65
						return false;
	//   33   63:iconst_0        
	//   34   64:ireturn         
					rect = ((Rect) (((View) (rect)).getParent()));
	//   35   65:aload_1         
	//   36   66:invokevirtual   #408 <Method android.view.ViewParent View.getParent()>
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
	//    1    1:invokespecial   #422 <Method SparseArrayCompat getAllNodes()>
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
	//*  13   25:goto            40
			accessibilitynodeinfocompat = (AccessibilityNodeInfoCompat)sparsearraycompat.get(k);
	//   14   28:aload           7
	//   15   30:iload           4
	//   16   32:invokevirtual   #423 <Method Object SparseArrayCompat.get(int)>
	//   17   35:checkcast       #161 <Class AccessibilityNodeInfoCompat>
	//   18   38:astore          6
		if(i != 17 && i != 33 && i != 66 && i != 130)
	//*  19   40:iload_1         
	//*  20   41:bipush          17
	//*  21   43:icmpeq          143
	//*  22   46:iload_1         
	//*  23   47:bipush          33
	//*  24   49:icmpeq          143
	//*  25   52:iload_1         
	//*  26   53:bipush          66
	//*  27   55:icmpeq          143
	//*  28   58:iload_1         
	//*  29   59:sipush          130
	//*  30   62:icmpeq          143
		{
			switch(i)
	//*  31   65:iload_1         
			{
	//*  32   66:tableswitch     1 2: default 88
	//	               1 99
	//	               2 99
			default:
				throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
	//   33   88:new             #115 <Class IllegalArgumentException>
	//   34   91:dup             
	//   35   92:ldc2            #425 <String "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.">
	//   36   95:invokespecial   #120 <Method void IllegalArgumentException(String)>
	//   37   98:athrow          

			case 1: // '\001'
			case 2: // '\002'
				break;
			}
			boolean flag;
			if(ViewCompat.getLayoutDirection(mHost) == 1)
	//*  38   99:aload_0         
	//*  39  100:getfield        #81  <Field View mHost>
	//*  40  103:invokestatic    #428 <Method int ViewCompat.getLayoutDirection(View)>
	//*  41  106:iconst_1        
	//*  42  107:icmpne          116
				flag = true;
	//   43  110:iconst_1        
	//   44  111:istore          5
			else
	//*  45  113:goto            119
				flag = false;
	//   46  116:iconst_0        
	//   47  117:istore          5
			rect = ((Rect) ((AccessibilityNodeInfoCompat)FocusStrategy.findNextFocusInRelativeDirection(((Object) (sparsearraycompat)), SPARSE_VALUES_ADAPTER, NODE_ADAPTER, ((Object) (accessibilitynodeinfocompat)), i, flag, false)));
	//   48  119:aload           7
	//   49  121:getstatic       #60  <Field FocusStrategy$CollectionAdapter SPARSE_VALUES_ADAPTER>
	//   50  124:getstatic       #57  <Field FocusStrategy$BoundsAdapter NODE_ADAPTER>
	//   51  127:aload           6
	//   52  129:iload_1         
	//   53  130:iload           5
	//   54  132:iconst_0        
	//   55  133:invokestatic    #434 <Method Object FocusStrategy.findNextFocusInRelativeDirection(Object, FocusStrategy$CollectionAdapter, FocusStrategy$BoundsAdapter, Object, int, boolean, boolean)>
	//   56  136:checkcast       #161 <Class AccessibilityNodeInfoCompat>
	//   57  139:astore_2        
		} else
	//*  58  140:goto            220
		{
			Rect rect1 = new Rect();
	//   59  143:new             #46  <Class Rect>
	//   60  146:dup             
	//   61  147:invokespecial   #65  <Method void Rect()>
	//   62  150:astore          8
			int l = mKeyboardFocusedVirtualViewId;
	//   63  152:aload_0         
	//   64  153:getfield        #77  <Field int mKeyboardFocusedVirtualViewId>
	//   65  156:istore          4
			if(l != 0x80000000)
	//*  66  158:iload           4
	//*  67  160:ldc1            #20  <Int 0x80000000>
	//*  68  162:icmpeq          176
				getBoundsInParent(l, rect1);
	//   69  165:aload_0         
	//   70  166:iload           4
	//   71  168:aload           8
	//   72  170:invokespecial   #436 <Method void getBoundsInParent(int, Rect)>
			else
	//*  73  173:goto            200
			if(rect != null)
	//*  74  176:aload_2         
	//*  75  177:ifnull          189
				rect1.set(rect);
	//   76  180:aload           8
	//   77  182:aload_2         
	//   78  183:invokevirtual   #438 <Method void Rect.set(Rect)>
			else
	//*  79  186:goto            200
				guessPreviouslyFocusedRect(mHost, i, rect1);
	//   80  189:aload_0         
	//   81  190:getfield        #81  <Field View mHost>
	//   82  193:iload_1         
	//   83  194:aload           8
	//   84  196:invokestatic    #440 <Method Rect guessPreviouslyFocusedRect(View, int, Rect)>
	//   85  199:pop             
			rect = ((Rect) ((AccessibilityNodeInfoCompat)FocusStrategy.findNextFocusInAbsoluteDirection(((Object) (sparsearraycompat)), SPARSE_VALUES_ADAPTER, NODE_ADAPTER, ((Object) (accessibilitynodeinfocompat)), rect1, i)));
	//   86  200:aload           7
	//   87  202:getstatic       #60  <Field FocusStrategy$CollectionAdapter SPARSE_VALUES_ADAPTER>
	//   88  205:getstatic       #57  <Field FocusStrategy$BoundsAdapter NODE_ADAPTER>
	//   89  208:aload           6
	//   90  210:aload           8
	//   91  212:iload_1         
	//   92  213:invokestatic    #444 <Method Object FocusStrategy.findNextFocusInAbsoluteDirection(Object, FocusStrategy$CollectionAdapter, FocusStrategy$BoundsAdapter, Object, Rect, int)>
	//   93  216:checkcast       #161 <Class AccessibilityNodeInfoCompat>
	//   94  219:astore_2        
		}
		if(rect == null)
	//*  95  220:aload_2         
	//*  96  221:ifnonnull       229
			i = j;
	//   97  224:iload_3         
	//   98  225:istore_1        
		else
	//*  99  226:goto            241
			i = sparsearraycompat.keyAt(sparsearraycompat.indexOfValue(((Object) (rect))));
	//  100  229:aload           7
	//  101  231:aload           7
	//  102  233:aload_2         
	//  103  234:invokevirtual   #448 <Method int SparseArrayCompat.indexOfValue(Object)>
	//  104  237:invokevirtual   #451 <Method int SparseArrayCompat.keyAt(int)>
	//  105  240:istore_1        
		return requestKeyboardFocusForVirtualView(i);
	//  106  241:aload_0         
	//  107  242:iload_1         
	//  108  243:invokevirtual   #454 <Method boolean requestKeyboardFocusForVirtualView(int)>
	//  109  246:ireturn         
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
	//   12   40:invokevirtual   #137 <Method boolean onPerformActionForVirtualView(int, int, Bundle)>
	//   13   43:ireturn         

				case 2: // '\002'
					return clearKeyboardFocusForVirtualView(i);
	//   14   44:aload_0         
	//   15   45:iload_1         
	//   16   46:invokevirtual   #458 <Method boolean clearKeyboardFocusForVirtualView(int)>
	//   17   49:ireturn         

				case 1: // '\001'
					return requestKeyboardFocusForVirtualView(i);
	//   18   50:aload_0         
	//   19   51:iload_1         
	//   20   52:invokevirtual   #454 <Method boolean requestKeyboardFocusForVirtualView(int)>
	//   21   55:ireturn         
				}
			else
				return clearAccessibilityFocus(i);
	//   22   56:aload_0         
	//   23   57:iload_1         
	//   24   58:invokespecial   #460 <Method boolean clearAccessibilityFocus(int)>
	//   25   61:ireturn         
		} else
		{
			return requestAccessibilityFocus(i);
	//   26   62:aload_0         
	//   27   63:iload_1         
	//   28   64:invokespecial   #463 <Method boolean requestAccessibilityFocus(int)>
	//   29   67:ireturn         
		}
	}

	private boolean performActionForHost(int i, Bundle bundle)
	{
		return ViewCompat.performAccessibilityAction(mHost, i, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field View mHost>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #469 <Method boolean ViewCompat.performAccessibilityAction(View, int, Bundle)>
	//    5    9:ireturn         
	}

	private boolean requestAccessibilityFocus(int i)
	{
		if(mManager.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #99  <Field AccessibilityManager mManager>
	//*   2    4:invokevirtual   #470 <Method boolean AccessibilityManager.isEnabled()>
	//*   3    7:ifeq            69
		{
			if(!mManager.isTouchExplorationEnabled())
	//*   4   10:aload_0         
	//*   5   11:getfield        #99  <Field AccessibilityManager mManager>
	//*   6   14:invokevirtual   #473 <Method boolean AccessibilityManager.isTouchExplorationEnabled()>
	//*   7   17:ifne            22
				return false;
	//    8   20:iconst_0        
	//    9   21:ireturn         
			int j = mAccessibilityFocusedVirtualViewId;
	//   10   22:aload_0         
	//   11   23:getfield        #75  <Field int mAccessibilityFocusedVirtualViewId>
	//   12   26:istore_2        
			if(j != i)
	//*  13   27:iload_2         
	//*  14   28:iload_1         
	//*  15   29:icmpeq          67
			{
				if(j != 0x80000000)
	//*  16   32:iload_2         
	//*  17   33:ldc1            #20  <Int 0x80000000>
	//*  18   35:icmpeq          44
					clearAccessibilityFocus(j);
	//   19   38:aload_0         
	//   20   39:iload_2         
	//   21   40:invokespecial   #460 <Method boolean clearAccessibilityFocus(int)>
	//   22   43:pop             
				mAccessibilityFocusedVirtualViewId = i;
	//   23   44:aload_0         
	//   24   45:iload_1         
	//   25   46:putfield        #75  <Field int mAccessibilityFocusedVirtualViewId>
				mHost.invalidate();
	//   26   49:aload_0         
	//   27   50:getfield        #81  <Field View mHost>
	//   28   53:invokevirtual   #126 <Method void View.invalidate()>
				sendEventForVirtualView(i, 32768);
	//   29   56:aload_0         
	//   30   57:iload_1         
	//   31   58:ldc2            #474 <Int 32768>
	//   32   61:invokevirtual   #131 <Method boolean sendEventForVirtualView(int, int)>
	//   33   64:pop             
				return true;
	//   34   65:iconst_1        
	//   35   66:ireturn         
			} else
			{
				return false;
	//   36   67:iconst_0        
	//   37   68:ireturn         
			}
		} else
		{
			return false;
	//   38   69:iconst_0        
	//   39   70:ireturn         
		}
	}

	private void updateHoveredVirtualView(int i)
	{
		int j = mHoveredVirtualViewId;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field int mHoveredVirtualViewId>
	//    2    4:istore_2        
		if(j == i)
	//*   3    5:iload_2         
	//*   4    6:iload_1         
	//*   5    7:icmpne          11
		{
			return;
	//    6   10:return          
		} else
		{
			mHoveredVirtualViewId = i;
	//    7   11:aload_0         
	//    8   12:iload_1         
	//    9   13:putfield        #79  <Field int mHoveredVirtualViewId>
			sendEventForVirtualView(i, 128);
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:sipush          128
	//   13   21:invokevirtual   #131 <Method boolean sendEventForVirtualView(int, int)>
	//   14   24:pop             
			sendEventForVirtualView(j, 256);
	//   15   25:aload_0         
	//   16   26:iload_2         
	//   17   27:sipush          256
	//   18   30:invokevirtual   #131 <Method boolean sendEventForVirtualView(int, int)>
	//   19   33:pop             
			return;
	//   20   34:return          
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
	//   12   19:invokevirtual   #479 <Method void onVirtualViewKeyboardFocusChanged(int, boolean)>
			sendEventForVirtualView(i, 8);
	//   13   22:aload_0         
	//   14   23:iload_1         
	//   15   24:bipush          8
	//   16   26:invokevirtual   #131 <Method boolean sendEventForVirtualView(int, int)>
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
	//    1    1:getfield        #99  <Field AccessibilityManager mManager>
	//    2    4:invokevirtual   #470 <Method boolean AccessibilityManager.isEnabled()>
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
	//*   9   17:getfield        #99  <Field AccessibilityManager mManager>
	//*  10   20:invokevirtual   #473 <Method boolean AccessibilityManager.isTouchExplorationEnabled()>
	//*  11   23:ifne            28
				return false;
	//   12   26:iconst_0        
	//   13   27:ireturn         
			int i = motionevent.getAction();
	//   14   28:aload_1         
	//   15   29:invokevirtual   #486 <Method int MotionEvent.getAction()>
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
					if(mHoveredVirtualViewId != 0x80000000)
	//*  24   66:aload_0         
	//*  25   67:getfield        #79  <Field int mHoveredVirtualViewId>
	//*  26   70:ldc1            #20  <Int 0x80000000>
	//*  27   72:icmpeq          83
					{
						updateHoveredVirtualView(0x80000000);
	//   28   75:aload_0         
	//   29   76:ldc1            #20  <Int 0x80000000>
	//   30   78:invokespecial   #488 <Method void updateHoveredVirtualView(int)>
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
	//   37   87:invokevirtual   #491 <Method float MotionEvent.getX()>
	//   38   90:aload_1         
	//   39   91:invokevirtual   #494 <Method float MotionEvent.getY()>
	//   40   94:invokevirtual   #498 <Method int getVirtualViewAt(float, float)>
	//   41   97:istore_2        
			updateHoveredVirtualView(i);
	//   42   98:aload_0         
	//   43   99:iload_2         
	//   44  100:invokespecial   #488 <Method void updateHoveredVirtualView(int)>
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
	//    1    1:invokevirtual   #503 <Method int KeyEvent.getAction()>
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
	//   13   20:invokevirtual   #506 <Method int KeyEvent.getKeyCode()>
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
	//*  28   79:invokevirtual   #509 <Method boolean KeyEvent.hasNoModifiers()>
	//*  29   82:ifeq            192
		{
			j = keyToDirection(j);
	//   30   85:iload_3         
	//   31   86:invokestatic    #511 <Method int keyToDirection(int)>
	//   32   89:istore_3        
			int k = keyevent.getRepeatCount();
	//   33   90:aload_1         
	//   34   91:invokevirtual   #514 <Method int KeyEvent.getRepeatCount()>
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
	//*  46  110:invokespecial   #516 <Method boolean moveFocus(int, Rect)>
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
	//*  60  134:invokevirtual   #509 <Method boolean KeyEvent.hasNoModifiers()>
	//*  61  137:ifeq            192
		{
			flag = flag1;
	//   62  140:iload           6
	//   63  142:istore          5
			if(keyevent.getRepeatCount() == 0)
	//*  64  144:aload_1         
	//*  65  145:invokevirtual   #514 <Method int KeyEvent.getRepeatCount()>
	//*  66  148:ifne            192
			{
				clickKeyboardFocusedVirtualView();
	//   67  151:aload_0         
	//   68  152:invokespecial   #518 <Method boolean clickKeyboardFocusedVirtualView()>
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
	//*  73  159:invokevirtual   #509 <Method boolean KeyEvent.hasNoModifiers()>
	//*  74  162:ifeq            172
			return moveFocus(2, ((Rect) (null)));
	//   75  165:aload_0         
	//   76  166:iconst_2        
	//   77  167:aconst_null     
	//   78  168:invokespecial   #516 <Method boolean moveFocus(int, Rect)>
	//   79  171:ireturn         
		flag = flag1;
	//   80  172:iload           6
	//   81  174:istore          5
		if(keyevent.hasModifiers(1))
	//*  82  176:aload_1         
	//*  83  177:iconst_1        
	//*  84  178:invokevirtual   #521 <Method boolean KeyEvent.hasModifiers(int)>
	//*  85  181:ifeq            192
			flag = moveFocus(1, ((Rect) (null)));
	//   86  184:aload_0         
	//   87  185:iconst_1        
	//   88  186:aconst_null     
	//   89  187:invokespecial   #516 <Method boolean moveFocus(int, Rect)>
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
	//*   1    1:getfield        #526 <Field ExploreByTouchHelper$MyNodeProvider mNodeProvider>
	//*   2    4:ifnonnull       19
			mNodeProvider = new MyNodeProvider();
	//    3    7:aload_0         
	//    4    8:new             #10  <Class ExploreByTouchHelper$MyNodeProvider>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #529 <Method void ExploreByTouchHelper$MyNodeProvider(ExploreByTouchHelper)>
	//    8   16:putfield        #526 <Field ExploreByTouchHelper$MyNodeProvider mNodeProvider>
		return ((AccessibilityNodeProviderCompat) (mNodeProvider));
	//    9   19:aload_0         
	//   10   20:getfield        #526 <Field ExploreByTouchHelper$MyNodeProvider mNodeProvider>
	//   11   23:areturn         
	}

	public int getFocusedVirtualView()
	{
		return getAccessibilityFocusedVirtualViewId();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #533 <Method int getAccessibilityFocusedVirtualViewId()>
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
	//    3    3:invokevirtual   #539 <Method void invalidateVirtualView(int, int)>
	//    4    6:return          
	}

	public final void invalidateVirtualView(int i)
	{
		invalidateVirtualView(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #539 <Method void invalidateVirtualView(int, int)>
	//    4    6:return          
	}

	public final void invalidateVirtualView(int i, int j)
	{
		if(i != 0x80000000 && mManager.isEnabled())
	//*   0    0:iload_1         
	//*   1    1:ldc1            #20  <Int 0x80000000>
	//*   2    3:icmpeq          55
	//*   3    6:aload_0         
	//*   4    7:getfield        #99  <Field AccessibilityManager mManager>
	//*   5   10:invokevirtual   #470 <Method boolean AccessibilityManager.isEnabled()>
	//*   6   13:ifeq            55
		{
			android.view.ViewParent viewparent = mHost.getParent();
	//    7   16:aload_0         
	//    8   17:getfield        #81  <Field View mHost>
	//    9   20:invokevirtual   #408 <Method android.view.ViewParent View.getParent()>
	//   10   23:astore_3        
			if(viewparent != null)
	//*  11   24:aload_3         
	//*  12   25:ifnull          55
			{
				AccessibilityEvent accessibilityevent = createEvent(i, 2048);
	//   13   28:aload_0         
	//   14   29:iload_1         
	//   15   30:sipush          2048
	//   16   33:invokespecial   #541 <Method AccessibilityEvent createEvent(int, int)>
	//   17   36:astore          4
				AccessibilityEventCompat.setContentChangeTypes(accessibilityevent, j);
	//   18   38:aload           4
	//   19   40:iload_2         
	//   20   41:invokestatic    #547 <Method void AccessibilityEventCompat.setContentChangeTypes(AccessibilityEvent, int)>
				ViewParentCompat.requestSendAccessibilityEvent(viewparent, mHost, accessibilityevent);
	//   21   44:aload_3         
	//   22   45:aload_0         
	//   23   46:getfield        #81  <Field View mHost>
	//   24   49:aload           4
	//   25   51:invokestatic    #553 <Method boolean ViewParentCompat.requestSendAccessibilityEvent(android.view.ViewParent, View, AccessibilityEvent)>
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
	//    4    6:invokespecial   #555 <Method AccessibilityNodeInfoCompat createNodeForHost()>
	//    5    9:areturn         
		else
			return createNodeForChild(i);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:invokespecial   #380 <Method AccessibilityNodeInfoCompat createNodeForChild(int)>
	//    9   15:areturn         
	}

	public final void onFocusChanged(boolean flag, int i, Rect rect)
	{
		int j = mKeyboardFocusedVirtualViewId;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field int mKeyboardFocusedVirtualViewId>
	//    2    4:istore          4
		if(j != 0x80000000)
	//*   3    6:iload           4
	//*   4    8:ldc1            #20  <Int 0x80000000>
	//*   5   10:icmpeq          20
			clearKeyboardFocusForVirtualView(j);
	//    6   13:aload_0         
	//    7   14:iload           4
	//    8   16:invokevirtual   #458 <Method boolean clearKeyboardFocusForVirtualView(int)>
	//    9   19:pop             
		if(flag)
	//*  10   20:iload_1         
	//*  11   21:ifeq            31
			moveFocus(i, rect);
	//   12   24:aload_0         
	//   13   25:iload_2         
	//   14   26:aload_3         
	//   15   27:invokespecial   #516 <Method boolean moveFocus(int, Rect)>
	//   16   30:pop             
	//   17   31:return          
	}

	public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
	{
		super.onInitializeAccessibilityEvent(view, accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #560 <Method void AccessibilityDelegateCompat.onInitializeAccessibilityEvent(View, AccessibilityEvent)>
		onPopulateEventForHost(accessibilityevent);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #563 <Method void onPopulateEventForHost(AccessibilityEvent)>
	//    7   11:return          
	}

	public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #564 <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
		onPopulateNodeForHost(accessibilitynodeinfocompat);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #568 <Method void onPopulateNodeForHost(AccessibilityNodeInfoCompat)>
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
	//    7    9:invokespecial   #571 <Method boolean performActionForChild(int, int, Bundle)>
	//    8   12:ireturn         
		else
			return performActionForHost(j, bundle);
	//    9   13:aload_0         
	//   10   14:iload_2         
	//   11   15:aload_3         
	//   12   16:invokespecial   #573 <Method boolean performActionForHost(int, Bundle)>
	//   13   19:ireturn         
	}

	public final boolean requestKeyboardFocusForVirtualView(int i)
	{
		if(!mHost.isFocused() && !mHost.requestFocus())
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field View mHost>
	//*   2    4:invokevirtual   #576 <Method boolean View.isFocused()>
	//*   3    7:ifne            22
	//*   4   10:aload_0         
	//*   5   11:getfield        #81  <Field View mHost>
	//*   6   14:invokevirtual   #579 <Method boolean View.requestFocus()>
	//*   7   17:ifne            22
			return false;
	//    8   20:iconst_0        
	//    9   21:ireturn         
		int j = mKeyboardFocusedVirtualViewId;
	//   10   22:aload_0         
	//   11   23:getfield        #77  <Field int mKeyboardFocusedVirtualViewId>
	//   12   26:istore_2        
		if(j == i)
	//*  13   27:iload_2         
	//*  14   28:iload_1         
	//*  15   29:icmpne          34
			return false;
	//   16   32:iconst_0        
	//   17   33:ireturn         
		if(j != 0x80000000)
	//*  18   34:iload_2         
	//*  19   35:ldc1            #20  <Int 0x80000000>
	//*  20   37:icmpeq          46
			clearKeyboardFocusForVirtualView(j);
	//   21   40:aload_0         
	//   22   41:iload_2         
	//   23   42:invokevirtual   #458 <Method boolean clearKeyboardFocusForVirtualView(int)>
	//   24   45:pop             
		mKeyboardFocusedVirtualViewId = i;
	//   25   46:aload_0         
	//   26   47:iload_1         
	//   27   48:putfield        #77  <Field int mKeyboardFocusedVirtualViewId>
		onVirtualViewKeyboardFocusChanged(i, true);
	//   28   51:aload_0         
	//   29   52:iload_1         
	//   30   53:iconst_1        
	//   31   54:invokevirtual   #479 <Method void onVirtualViewKeyboardFocusChanged(int, boolean)>
		sendEventForVirtualView(i, 8);
	//   32   57:aload_0         
	//   33   58:iload_1         
	//   34   59:bipush          8
	//   35   61:invokevirtual   #131 <Method boolean sendEventForVirtualView(int, int)>
	//   36   64:pop             
		return true;
	//   37   65:iconst_1        
	//   38   66:ireturn         
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
	//*   4    7:getfield        #99  <Field AccessibilityManager mManager>
	//*   5   10:invokevirtual   #470 <Method boolean AccessibilityManager.isEnabled()>
	//*   6   13:ifne            18
				return false;
	//    7   16:iconst_0        
	//    8   17:ireturn         
			android.view.ViewParent viewparent = mHost.getParent();
	//    9   18:aload_0         
	//   10   19:getfield        #81  <Field View mHost>
	//   11   22:invokevirtual   #408 <Method android.view.ViewParent View.getParent()>
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
	//   20   35:invokespecial   #541 <Method AccessibilityEvent createEvent(int, int)>
	//   21   38:astore          4
				return ViewParentCompat.requestSendAccessibilityEvent(viewparent, mHost, accessibilityevent);
	//   22   40:aload_3         
	//   23   41:aload_0         
	//   24   42:getfield        #81  <Field View mHost>
	//   25   45:aload           4
	//   26   47:invokestatic    #553 <Method boolean ViewParentCompat.requestSendAccessibilityEvent(android.view.ViewParent, View, AccessibilityEvent)>
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
	int mAccessibilityFocusedVirtualViewId;
	private final View mHost;
	private int mHoveredVirtualViewId;
	int mKeyboardFocusedVirtualViewId;
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
}
