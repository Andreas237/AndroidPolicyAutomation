// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.animation.ValueAnimator;
import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.util.ArrayMap;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityNodeProviderCompat;
import android.util.Log;
import android.util.SparseArray;
import android.view.*;
import android.view.accessibility.AccessibilityEvent;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.lang.reflect.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package android.support.v4.view:
//			ViewPropertyAnimatorCompat, WindowInsetsCompat, NestedScrollingChild, NestedScrollingChild2, 
//			TintableBackgroundView, AccessibilityDelegateCompat, PointerIconCompat, OnApplyWindowInsetsListener

public class ViewCompat
{
	public static interface FocusDirection
		extends Annotation
	{
	}

	public static interface FocusRealDirection
		extends Annotation
	{
	}

	public static interface FocusRelativeDirection
		extends Annotation
	{
	}

	public static interface NestedScrollType
		extends Annotation
	{
	}

	public static interface OnUnhandledKeyEventListenerCompat
	{

		public abstract boolean onUnhandledKeyEvent(View view, KeyEvent keyevent);
	}

	private static class OnUnhandledKeyEventListenerWrapper
		implements android.view.View.OnUnhandledKeyEventListener
	{

		public boolean onUnhandledKeyEvent(View view, KeyEvent keyevent)
		{
			return mCompatListener.onUnhandledKeyEvent(view, keyevent);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field ViewCompat$OnUnhandledKeyEventListenerCompat mCompatListener>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokeinterface #28  <Method boolean ViewCompat$OnUnhandledKeyEventListenerCompat.onUnhandledKeyEvent(View, KeyEvent)>
		//    5   11:ireturn         
		}

		private OnUnhandledKeyEventListenerCompat mCompatListener;

		OnUnhandledKeyEventListenerWrapper(OnUnhandledKeyEventListenerCompat onunhandledkeyeventlistenercompat)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			mCompatListener = onunhandledkeyeventlistenercompat;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field ViewCompat$OnUnhandledKeyEventListenerCompat mCompatListener>
		//    5    9:return          
		}
	}

	public static interface ScrollAxis
		extends Annotation
	{
	}

	public static interface ScrollIndicators
		extends Annotation
	{
	}

	static class UnhandledKeyEventManager
	{

		static UnhandledKeyEventManager at(View view)
		{
			UnhandledKeyEventManager unhandledkeyeventmanager1 = (UnhandledKeyEventManager)view.getTag(android.support.compat.R.id.tag_unhandled_key_event_manager);
		//    0    0:aload_0         
		//    1    1:getstatic       #45  <Field int android.support.compat.R$id.tag_unhandled_key_event_manager>
		//    2    4:invokevirtual   #51  <Method Object View.getTag(int)>
		//    3    7:checkcast       #2   <Class ViewCompat$UnhandledKeyEventManager>
		//    4   10:astore_2        
			UnhandledKeyEventManager unhandledkeyeventmanager = unhandledkeyeventmanager1;
		//    5   11:aload_2         
		//    6   12:astore_1        
			if(unhandledkeyeventmanager1 == null)
		//*   7   13:aload_2         
		//*   8   14:ifnonnull       33
			{
				unhandledkeyeventmanager = new UnhandledKeyEventManager();
		//    9   17:new             #2   <Class ViewCompat$UnhandledKeyEventManager>
		//   10   20:dup             
		//   11   21:invokespecial   #52  <Method void ViewCompat$UnhandledKeyEventManager()>
		//   12   24:astore_1        
				view.setTag(android.support.compat.R.id.tag_unhandled_key_event_manager, ((Object) (unhandledkeyeventmanager)));
		//   13   25:aload_0         
		//   14   26:getstatic       #45  <Field int android.support.compat.R$id.tag_unhandled_key_event_manager>
		//   15   29:aload_1         
		//   16   30:invokevirtual   #56  <Method void View.setTag(int, Object)>
			}
			return unhandledkeyeventmanager;
		//   17   33:aload_1         
		//   18   34:areturn         
		}

		private View dispatchInOrder(View view, KeyEvent keyevent)
		{
			WeakHashMap weakhashmap = mViewsContainingListeners;
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field WeakHashMap mViewsContainingListeners>
		//    2    4:astore          4
			if(weakhashmap != null)
		//*   3    6:aload           4
		//*   4    8:ifnull          88
			{
				if(!weakhashmap.containsKey(((Object) (view))))
		//*   5   11:aload           4
		//*   6   13:aload_1         
		//*   7   14:invokevirtual   #64  <Method boolean WeakHashMap.containsKey(Object)>
		//*   8   17:ifne            22
					return null;
		//    9   20:aconst_null     
		//   10   21:areturn         
				if(view instanceof ViewGroup)
		//*  11   22:aload_1         
		//*  12   23:instanceof      #66  <Class ViewGroup>
		//*  13   26:ifeq            75
				{
					ViewGroup viewgroup = (ViewGroup)view;
		//   14   29:aload_1         
		//   15   30:checkcast       #66  <Class ViewGroup>
		//   16   33:astore          4
					for(int i = viewgroup.getChildCount() - 1; i >= 0; i--)
		//*  17   35:aload           4
		//*  18   37:invokevirtual   #70  <Method int ViewGroup.getChildCount()>
		//*  19   40:iconst_1        
		//*  20   41:isub            
		//*  21   42:istore_3        
		//*  22   43:iload_3         
		//*  23   44:iflt            75
					{
						View view1 = dispatchInOrder(viewgroup.getChildAt(i), keyevent);
		//   24   47:aload_0         
		//   25   48:aload           4
		//   26   50:iload_3         
		//   27   51:invokevirtual   #74  <Method View ViewGroup.getChildAt(int)>
		//   28   54:aload_2         
		//   29   55:invokespecial   #76  <Method View dispatchInOrder(View, KeyEvent)>
		//   30   58:astore          5
						if(view1 != null)
		//*  31   60:aload           5
		//*  32   62:ifnull          68
							return view1;
		//   33   65:aload           5
		//   34   67:areturn         
					}

		//   35   68:iload_3         
		//   36   69:iconst_1        
		//   37   70:isub            
		//   38   71:istore_3        
				}
		//*  39   72:goto            43
				if(onUnhandledKeyEvent(view, keyevent))
		//*  40   75:aload_0         
		//*  41   76:aload_1         
		//*  42   77:aload_2         
		//*  43   78:invokespecial   #80  <Method boolean onUnhandledKeyEvent(View, KeyEvent)>
		//*  44   81:ifeq            86
					return view;
		//   45   84:aload_1         
		//   46   85:areturn         
				else
					return null;
		//   47   86:aconst_null     
		//   48   87:areturn         
			} else
			{
				return null;
		//   49   88:aconst_null     
		//   50   89:areturn         
			}
		}

		private SparseArray getCapturedKeys()
		{
			if(mCapturedKeys == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #35  <Field SparseArray mCapturedKeys>
		//*   2    4:ifnonnull       18
				mCapturedKeys = new SparseArray();
		//    3    7:aload_0         
		//    4    8:new             #85  <Class SparseArray>
		//    5   11:dup             
		//    6   12:invokespecial   #86  <Method void SparseArray()>
		//    7   15:putfield        #35  <Field SparseArray mCapturedKeys>
			return mCapturedKeys;
		//    8   18:aload_0         
		//    9   19:getfield        #35  <Field SparseArray mCapturedKeys>
		//   10   22:areturn         
		}

		private boolean onUnhandledKeyEvent(View view, KeyEvent keyevent)
		{
			ArrayList arraylist = (ArrayList)view.getTag(android.support.compat.R.id.tag_unhandled_key_listeners);
		//    0    0:aload_1         
		//    1    1:getstatic       #92  <Field int android.support.compat.R$id.tag_unhandled_key_listeners>
		//    2    4:invokevirtual   #51  <Method Object View.getTag(int)>
		//    3    7:checkcast       #24  <Class ArrayList>
		//    4   10:astore          4
			if(arraylist != null)
		//*   5   12:aload           4
		//*   6   14:ifnull          57
			{
				for(int i = arraylist.size() - 1; i >= 0; i--)
		//*   7   17:aload           4
		//*   8   19:invokevirtual   #95  <Method int ArrayList.size()>
		//*   9   22:iconst_1        
		//*  10   23:isub            
		//*  11   24:istore_3        
		//*  12   25:iload_3         
		//*  13   26:iflt            57
					if(((OnUnhandledKeyEventListenerCompat)arraylist.get(i)).onUnhandledKeyEvent(view, keyevent))
		//*  14   29:aload           4
		//*  15   31:iload_3         
		//*  16   32:invokevirtual   #98  <Method Object ArrayList.get(int)>
		//*  17   35:checkcast       #100 <Class ViewCompat$OnUnhandledKeyEventListenerCompat>
		//*  18   38:aload_1         
		//*  19   39:aload_2         
		//*  20   40:invokeinterface #101 <Method boolean ViewCompat$OnUnhandledKeyEventListenerCompat.onUnhandledKeyEvent(View, KeyEvent)>
		//*  21   45:ifeq            50
						return true;
		//   22   48:iconst_1        
		//   23   49:ireturn         

		//   24   50:iload_3         
		//   25   51:iconst_1        
		//   26   52:isub            
		//   27   53:istore_3        
			}
		//*  28   54:goto            25
			return false;
		//   29   57:iconst_0        
		//   30   58:ireturn         
		}

		private void recalcViewsWithUnhandled()
		{
			WeakHashMap weakhashmap = mViewsContainingListeners;
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field WeakHashMap mViewsContainingListeners>
		//    2    4:astore_2        
			if(weakhashmap != null)
		//*   3    5:aload_2         
		//*   4    6:ifnull          13
				weakhashmap.clear();
		//    5    9:aload_2         
		//    6   10:invokevirtual   #106 <Method void WeakHashMap.clear()>
			if(sViewsWithListeners.isEmpty())
		//*   7   13:getstatic       #29  <Field ArrayList sViewsWithListeners>
		//*   8   16:invokevirtual   #110 <Method boolean ArrayList.isEmpty()>
		//*   9   19:ifeq            23
				return;
		//   10   22:return          
			ArrayList arraylist = sViewsWithListeners;
		//   11   23:getstatic       #29  <Field ArrayList sViewsWithListeners>
		//   12   26:astore_3        
			arraylist;
		//   13   27:aload_3         
			JVM INSTR monitorenter ;
		//   14   28:monitorenter    
			int i;
			if(mViewsContainingListeners == null)
		//*  15   29:aload_0         
		//*  16   30:getfield        #33  <Field WeakHashMap mViewsContainingListeners>
		//*  17   33:ifnonnull       47
				mViewsContainingListeners = new WeakHashMap();
		//   18   36:aload_0         
		//   19   37:new             #60  <Class WeakHashMap>
		//   20   40:dup             
		//   21   41:invokespecial   #111 <Method void WeakHashMap()>
		//   22   44:putfield        #33  <Field WeakHashMap mViewsContainingListeners>
			i = sViewsWithListeners.size() - 1;
		//   23   47:getstatic       #29  <Field ArrayList sViewsWithListeners>
		//   24   50:invokevirtual   #95  <Method int ArrayList.size()>
		//   25   53:iconst_1        
		//   26   54:isub            
		//   27   55:istore_1        
_L2:
			if(i < 0)
				break MISSING_BLOCK_LABEL_141;
		//   28   56:iload_1         
		//   29   57:iflt            141
			Object obj = ((Object) ((View)((WeakReference)sViewsWithListeners.get(i)).get()));
		//   30   60:getstatic       #29  <Field ArrayList sViewsWithListeners>
		//   31   63:iload_1         
		//   32   64:invokevirtual   #98  <Method Object ArrayList.get(int)>
		//   33   67:checkcast       #113 <Class WeakReference>
		//   34   70:invokevirtual   #116 <Method Object WeakReference.get()>
		//   35   73:checkcast       #47  <Class View>
		//   36   76:astore_2        
			if(obj != null)
				break MISSING_BLOCK_LABEL_92;
		//   37   77:aload_2         
		//   38   78:ifnonnull       92
			sViewsWithListeners.remove(i);
		//   39   81:getstatic       #29  <Field ArrayList sViewsWithListeners>
		//   40   84:iload_1         
		//   41   85:invokevirtual   #119 <Method Object ArrayList.remove(int)>
		//   42   88:pop             
			break MISSING_BLOCK_LABEL_149;
		//   43   89:goto            149
			mViewsContainingListeners.put(obj, ((Object) (Boolean.TRUE)));
		//   44   92:aload_0         
		//   45   93:getfield        #33  <Field WeakHashMap mViewsContainingListeners>
		//   46   96:aload_2         
		//   47   97:getstatic       #125 <Field Boolean Boolean.TRUE>
		//   48  100:invokevirtual   #129 <Method Object WeakHashMap.put(Object, Object)>
		//   49  103:pop             
			for(obj = ((Object) (((View) (obj)).getParent())); obj instanceof View; obj = ((Object) (((ViewParent) (obj)).getParent())))
		//*  50  104:aload_2         
		//*  51  105:invokevirtual   #133 <Method ViewParent View.getParent()>
		//*  52  108:astore_2        
		//*  53  109:aload_2         
		//*  54  110:instanceof      #47  <Class View>
		//*  55  113:ifeq            149
				mViewsContainingListeners.put(((Object) ((View)obj)), ((Object) (Boolean.TRUE)));
		//   56  116:aload_0         
		//   57  117:getfield        #33  <Field WeakHashMap mViewsContainingListeners>
		//   58  120:aload_2         
		//   59  121:checkcast       #47  <Class View>
		//   60  124:getstatic       #125 <Field Boolean Boolean.TRUE>
		//   61  127:invokevirtual   #129 <Method Object WeakHashMap.put(Object, Object)>
		//   62  130:pop             

		//   63  131:aload_2         
		//   64  132:invokeinterface #136 <Method ViewParent ViewParent.getParent()>
		//   65  137:astore_2        
			break MISSING_BLOCK_LABEL_149;
		//   66  138:goto            109
			arraylist;
		//   67  141:aload_3         
			JVM INSTR monitorexit ;
		//   68  142:monitorexit     
			return;
		//   69  143:return          
			Exception exception;
			exception;
		//   70  144:astore_2        
			arraylist;
		//   71  145:aload_3         
			JVM INSTR monitorexit ;
		//   72  146:monitorexit     
			throw exception;
		//   73  147:aload_2         
		//   74  148:athrow          
			i--;
		//   75  149:iload_1         
		//   76  150:iconst_1        
		//   77  151:isub            
		//   78  152:istore_1        
			if(true) goto _L2; else goto _L1
		//   79  153:goto            56
_L1:
		}

		static void registerListeningView(View view)
		{
label0:
			{
				synchronized(sViewsWithListeners)
		//*   0    0:getstatic       #29  <Field ArrayList sViewsWithListeners>
		//*   1    3:astore_1        
		//*   2    4:aload_1         
		//*   3    5:monitorenter    
				{
					Iterator iterator = sViewsWithListeners.iterator();
		//    4    6:getstatic       #29  <Field ArrayList sViewsWithListeners>
		//    5    9:invokevirtual   #142 <Method Iterator ArrayList.iterator()>
		//    6   12:astore_2        
					do
						if(!iterator.hasNext())
							break label0;
		//    7   13:aload_2         
		//    8   14:invokeinterface #147 <Method boolean Iterator.hasNext()>
		//    9   19:ifeq            41
					while(((WeakReference)iterator.next()).get() != view);
		//   10   22:aload_2         
		//   11   23:invokeinterface #150 <Method Object Iterator.next()>
		//   12   28:checkcast       #113 <Class WeakReference>
		//   13   31:invokevirtual   #116 <Method Object WeakReference.get()>
		//   14   34:aload_0         
		//   15   35:if_acmpne       13
				}
		//   16   38:aload_1         
		//   17   39:monitorexit     
				return;
		//   18   40:return          
			}
			sViewsWithListeners.add(((Object) (new WeakReference(((Object) (view))))));
		//   19   41:getstatic       #29  <Field ArrayList sViewsWithListeners>
		//   20   44:new             #113 <Class WeakReference>
		//   21   47:dup             
		//   22   48:aload_0         
		//   23   49:invokespecial   #153 <Method void WeakReference(Object)>
		//   24   52:invokevirtual   #156 <Method boolean ArrayList.add(Object)>
		//   25   55:pop             
			arraylist;
		//   26   56:aload_1         
			JVM INSTR monitorexit ;
		//   27   57:monitorexit     
			return;
		//   28   58:return          
			view;
		//   29   59:astore_0        
			arraylist;
		//   30   60:aload_1         
			JVM INSTR monitorexit ;
		//   31   61:monitorexit     
			throw view;
		//   32   62:aload_0         
		//   33   63:athrow          
		}

		static void unregisterListeningView(View view)
		{
			ArrayList arraylist = sViewsWithListeners;
		//    0    0:getstatic       #29  <Field ArrayList sViewsWithListeners>
		//    1    3:astore_2        
			arraylist;
		//    2    4:aload_2         
			JVM INSTR monitorenter ;
		//    3    5:monitorenter    
			int i = 0;
		//    4    6:iconst_0        
		//    5    7:istore_1        
_L2:
			if(i < sViewsWithListeners.size())
		//*   6    8:iload_1         
		//*   7    9:getstatic       #29  <Field ArrayList sViewsWithListeners>
		//*   8   12:invokevirtual   #95  <Method int ArrayList.size()>
		//*   9   15:icmpge          46
			{
				if(((WeakReference)sViewsWithListeners.get(i)).get() != view)
					break MISSING_BLOCK_LABEL_54;
		//   10   18:getstatic       #29  <Field ArrayList sViewsWithListeners>
		//   11   21:iload_1         
		//   12   22:invokevirtual   #98  <Method Object ArrayList.get(int)>
		//   13   25:checkcast       #113 <Class WeakReference>
		//   14   28:invokevirtual   #116 <Method Object WeakReference.get()>
		//   15   31:aload_0         
		//   16   32:if_acmpne       54
				sViewsWithListeners.remove(i);
		//   17   35:getstatic       #29  <Field ArrayList sViewsWithListeners>
		//   18   38:iload_1         
		//   19   39:invokevirtual   #119 <Method Object ArrayList.remove(int)>
		//   20   42:pop             
		//*  21   43:aload_2         
		//*  22   44:monitorexit     
				return;
		//   23   45:return          
			}
			arraylist;
		//   24   46:aload_2         
			JVM INSTR monitorexit ;
		//   25   47:monitorexit     
			return;
		//   26   48:return          
			view;
		//   27   49:astore_0        
			arraylist;
		//   28   50:aload_2         
			JVM INSTR monitorexit ;
		//   29   51:monitorexit     
			throw view;
		//   30   52:aload_0         
		//   31   53:athrow          
			i++;
		//   32   54:iload_1         
		//   33   55:iconst_1        
		//   34   56:iadd            
		//   35   57:istore_1        
			if(true) goto _L2; else goto _L1
		//   36   58:goto            8
_L1:
		}

		boolean dispatch(View view, KeyEvent keyevent)
		{
			if(keyevent.getAction() == 0)
		//*   0    0:aload_2         
		//*   1    1:invokevirtual   #163 <Method int KeyEvent.getAction()>
		//*   2    4:ifne            11
				recalcViewsWithUnhandled();
		//    3    7:aload_0         
		//    4    8:invokespecial   #165 <Method void recalcViewsWithUnhandled()>
			view = dispatchInOrder(view, keyevent);
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:aload_2         
		//    8   14:invokespecial   #76  <Method View dispatchInOrder(View, KeyEvent)>
		//    9   17:astore_1        
			if(keyevent.getAction() == 0)
		//*  10   18:aload_2         
		//*  11   19:invokevirtual   #163 <Method int KeyEvent.getAction()>
		//*  12   22:ifne            57
			{
				int i = keyevent.getKeyCode();
		//   13   25:aload_2         
		//   14   26:invokevirtual   #168 <Method int KeyEvent.getKeyCode()>
		//   15   29:istore_3        
				if(view != null && !KeyEvent.isModifierKey(i))
		//*  16   30:aload_1         
		//*  17   31:ifnull          57
		//*  18   34:iload_3         
		//*  19   35:invokestatic    #172 <Method boolean KeyEvent.isModifierKey(int)>
		//*  20   38:ifne            57
					getCapturedKeys().put(i, ((Object) (new WeakReference(((Object) (view))))));
		//   21   41:aload_0         
		//   22   42:invokespecial   #174 <Method SparseArray getCapturedKeys()>
		//   23   45:iload_3         
		//   24   46:new             #113 <Class WeakReference>
		//   25   49:dup             
		//   26   50:aload_1         
		//   27   51:invokespecial   #153 <Method void WeakReference(Object)>
		//   28   54:invokevirtual   #176 <Method void SparseArray.put(int, Object)>
			}
			return view != null;
		//   29   57:aload_1         
		//   30   58:ifnull          63
		//   31   61:iconst_1        
		//   32   62:ireturn         
		//   33   63:iconst_0        
		//   34   64:ireturn         
		}

		boolean preDispatch(KeyEvent keyevent)
		{
			WeakReference weakreference = mLastDispatchedPreViewKeyEvent;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field WeakReference mLastDispatchedPreViewKeyEvent>
		//    2    4:astore_3        
			if(weakreference != null && weakreference.get() == keyevent)
		//*   3    5:aload_3         
		//*   4    6:ifnull          19
		//*   5    9:aload_3         
		//*   6   10:invokevirtual   #116 <Method Object WeakReference.get()>
		//*   7   13:aload_1         
		//*   8   14:if_acmpne       19
				return false;
		//    9   17:iconst_0        
		//   10   18:ireturn         
			mLastDispatchedPreViewKeyEvent = new WeakReference(((Object) (keyevent)));
		//   11   19:aload_0         
		//   12   20:new             #113 <Class WeakReference>
		//   13   23:dup             
		//   14   24:aload_1         
		//   15   25:invokespecial   #153 <Method void WeakReference(Object)>
		//   16   28:putfield        #37  <Field WeakReference mLastDispatchedPreViewKeyEvent>
			WeakReference weakreference1 = null;
		//   17   31:aconst_null     
		//   18   32:astore          4
			SparseArray sparsearray = getCapturedKeys();
		//   19   34:aload_0         
		//   20   35:invokespecial   #174 <Method SparseArray getCapturedKeys()>
		//   21   38:astore          5
			weakreference = weakreference1;
		//   22   40:aload           4
		//   23   42:astore_3        
			if(keyevent.getAction() == 1)
		//*  24   43:aload_1         
		//*  25   44:invokevirtual   #163 <Method int KeyEvent.getAction()>
		//*  26   47:iconst_1        
		//*  27   48:icmpne          84
			{
				int i = sparsearray.indexOfKey(keyevent.getKeyCode());
		//   28   51:aload           5
		//   29   53:aload_1         
		//   30   54:invokevirtual   #168 <Method int KeyEvent.getKeyCode()>
		//   31   57:invokevirtual   #182 <Method int SparseArray.indexOfKey(int)>
		//   32   60:istore_2        
				weakreference = weakreference1;
		//   33   61:aload           4
		//   34   63:astore_3        
				if(i >= 0)
		//*  35   64:iload_2         
		//*  36   65:iflt            84
				{
					weakreference = (WeakReference)sparsearray.valueAt(i);
		//   37   68:aload           5
		//   38   70:iload_2         
		//   39   71:invokevirtual   #185 <Method Object SparseArray.valueAt(int)>
		//   40   74:checkcast       #113 <Class WeakReference>
		//   41   77:astore_3        
					sparsearray.removeAt(i);
		//   42   78:aload           5
		//   43   80:iload_2         
		//   44   81:invokevirtual   #189 <Method void SparseArray.removeAt(int)>
				}
			}
			weakreference1 = weakreference;
		//   45   84:aload_3         
		//   46   85:astore          4
			if(weakreference == null)
		//*  47   87:aload_3         
		//*  48   88:ifnonnull       105
				weakreference1 = (WeakReference)sparsearray.get(keyevent.getKeyCode());
		//   49   91:aload           5
		//   50   93:aload_1         
		//   51   94:invokevirtual   #168 <Method int KeyEvent.getKeyCode()>
		//   52   97:invokevirtual   #190 <Method Object SparseArray.get(int)>
		//   53  100:checkcast       #113 <Class WeakReference>
		//   54  103:astore          4
			if(weakreference1 != null)
		//*  55  105:aload           4
		//*  56  107:ifnull          139
			{
				View view = (View)weakreference1.get();
		//   57  110:aload           4
		//   58  112:invokevirtual   #116 <Method Object WeakReference.get()>
		//   59  115:checkcast       #47  <Class View>
		//   60  118:astore_3        
				if(view != null && ViewCompat.isAttachedToWindow(view))
		//*  61  119:aload_3         
		//*  62  120:ifnull          137
		//*  63  123:aload_3         
		//*  64  124:invokestatic    #194 <Method boolean ViewCompat.isAttachedToWindow(View)>
		//*  65  127:ifeq            137
					onUnhandledKeyEvent(view, keyevent);
		//   66  130:aload_0         
		//   67  131:aload_3         
		//   68  132:aload_1         
		//   69  133:invokespecial   #80  <Method boolean onUnhandledKeyEvent(View, KeyEvent)>
		//   70  136:pop             
				return true;
		//   71  137:iconst_1        
		//   72  138:ireturn         
			} else
			{
				return false;
		//   73  139:iconst_0        
		//   74  140:ireturn         
			}
		}

		private static final ArrayList sViewsWithListeners = new ArrayList();
		private SparseArray mCapturedKeys;
		private WeakReference mLastDispatchedPreViewKeyEvent;
		private WeakHashMap mViewsContainingListeners;

		static 
		{
		//    0    0:new             #24  <Class ArrayList>
		//    1    3:dup             
		//    2    4:invokespecial   #27  <Method void ArrayList()>
		//    3    7:putstatic       #29  <Field ArrayList sViewsWithListeners>
		//*   4   10:return          
		}

		UnhandledKeyEventManager()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #31  <Method void Object()>
			mViewsContainingListeners = null;
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:putfield        #33  <Field WeakHashMap mViewsContainingListeners>
			mCapturedKeys = null;
		//    5    9:aload_0         
		//    6   10:aconst_null     
		//    7   11:putfield        #35  <Field SparseArray mCapturedKeys>
			mLastDispatchedPreViewKeyEvent = null;
		//    8   14:aload_0         
		//    9   15:aconst_null     
		//   10   16:putfield        #37  <Field WeakReference mLastDispatchedPreViewKeyEvent>
		//   11   19:return          
		}
	}


	protected ViewCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #122 <Method void Object()>
	//    2    4:return          
	}

	public static void addKeyboardNavigationClusters(View view, Collection collection, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          14
			view.addKeyboardNavigationClusters(collection, i);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:iload_2         
	//    6   11:invokevirtual   #135 <Method void View.addKeyboardNavigationClusters(Collection, int)>
	//    7   14:return          
	}

	public static void addOnUnhandledKeyEventListener(View view, OnUnhandledKeyEventListenerCompat onunhandledkeyeventlistenercompat)
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          65
		{
			Object obj1 = ((Object) ((Map)view.getTag(android.support.compat.R.id.tag_unhandled_key_listeners)));
	//    3    8:aload_0         
	//    4    9:getstatic       #145 <Field int android.support.compat.R$id.tag_unhandled_key_listeners>
	//    5   12:invokevirtual   #149 <Method Object View.getTag(int)>
	//    6   15:checkcast       #151 <Class Map>
	//    7   18:astore_3        
			Object obj = obj1;
	//    8   19:aload_3         
	//    9   20:astore_2        
			if(obj1 == null)
	//*  10   21:aload_3         
	//*  11   22:ifnonnull       41
			{
				obj = ((Object) (new ArrayMap()));
	//   12   25:new             #153 <Class ArrayMap>
	//   13   28:dup             
	//   14   29:invokespecial   #154 <Method void ArrayMap()>
	//   15   32:astore_2        
				view.setTag(android.support.compat.R.id.tag_unhandled_key_listeners, obj);
	//   16   33:aload_0         
	//   17   34:getstatic       #145 <Field int android.support.compat.R$id.tag_unhandled_key_listeners>
	//   18   37:aload_2         
	//   19   38:invokevirtual   #158 <Method void View.setTag(int, Object)>
			}
			obj1 = ((Object) (new OnUnhandledKeyEventListenerWrapper(onunhandledkeyeventlistenercompat)));
	//   20   41:new             #23  <Class ViewCompat$OnUnhandledKeyEventListenerWrapper>
	//   21   44:dup             
	//   22   45:aload_1         
	//   23   46:invokespecial   #161 <Method void ViewCompat$OnUnhandledKeyEventListenerWrapper(ViewCompat$OnUnhandledKeyEventListenerCompat)>
	//   24   49:astore_3        
			((Map) (obj)).put(((Object) (onunhandledkeyeventlistenercompat)), obj1);
	//   25   50:aload_2         
	//   26   51:aload_1         
	//   27   52:aload_3         
	//   28   53:invokeinterface #165 <Method Object Map.put(Object, Object)>
	//   29   58:pop             
			view.addOnUnhandledKeyEventListener(((android.view.View.OnUnhandledKeyEventListener) (obj1)));
	//   30   59:aload_0         
	//   31   60:aload_3         
	//   32   61:invokevirtual   #168 <Method void View.addOnUnhandledKeyEventListener(android.view.View$OnUnhandledKeyEventListener)>
			return;
	//   33   64:return          
		}
		ArrayList arraylist1 = (ArrayList)view.getTag(android.support.compat.R.id.tag_unhandled_key_listeners);
	//   34   65:aload_0         
	//   35   66:getstatic       #145 <Field int android.support.compat.R$id.tag_unhandled_key_listeners>
	//   36   69:invokevirtual   #149 <Method Object View.getTag(int)>
	//   37   72:checkcast       #170 <Class ArrayList>
	//   38   75:astore_3        
		ArrayList arraylist = arraylist1;
	//   39   76:aload_3         
	//   40   77:astore_2        
		if(arraylist1 == null)
	//*  41   78:aload_3         
	//*  42   79:ifnonnull       98
		{
			arraylist = new ArrayList();
	//   43   82:new             #170 <Class ArrayList>
	//   44   85:dup             
	//   45   86:invokespecial   #171 <Method void ArrayList()>
	//   46   89:astore_2        
			view.setTag(android.support.compat.R.id.tag_unhandled_key_listeners, ((Object) (arraylist)));
	//   47   90:aload_0         
	//   48   91:getstatic       #145 <Field int android.support.compat.R$id.tag_unhandled_key_listeners>
	//   49   94:aload_2         
	//   50   95:invokevirtual   #158 <Method void View.setTag(int, Object)>
		}
		arraylist.add(((Object) (onunhandledkeyeventlistenercompat)));
	//   51   98:aload_2         
	//   52   99:aload_1         
	//   53  100:invokevirtual   #175 <Method boolean ArrayList.add(Object)>
	//   54  103:pop             
		if(arraylist.size() == 1)
	//*  55  104:aload_2         
	//*  56  105:invokevirtual   #179 <Method int ArrayList.size()>
	//*  57  108:iconst_1        
	//*  58  109:icmpne          116
			UnhandledKeyEventManager.registerListeningView(view);
	//   59  112:aload_0         
	//   60  113:invokestatic    #183 <Method void ViewCompat$UnhandledKeyEventManager.registerListeningView(View)>
	//   61  116:return          
	}

	public static ViewPropertyAnimatorCompat animate(View view)
	{
		if(sViewPropertyAnimatorMap == null)
	//*   0    0:getstatic       #117 <Field WeakHashMap sViewPropertyAnimatorMap>
	//*   1    3:ifnonnull       16
			sViewPropertyAnimatorMap = new WeakHashMap();
	//    2    6:new             #187 <Class WeakHashMap>
	//    3    9:dup             
	//    4   10:invokespecial   #188 <Method void WeakHashMap()>
	//    5   13:putstatic       #117 <Field WeakHashMap sViewPropertyAnimatorMap>
		ViewPropertyAnimatorCompat viewpropertyanimatorcompat1 = (ViewPropertyAnimatorCompat)sViewPropertyAnimatorMap.get(((Object) (view)));
	//    6   16:getstatic       #117 <Field WeakHashMap sViewPropertyAnimatorMap>
	//    7   19:aload_0         
	//    8   20:invokevirtual   #192 <Method Object WeakHashMap.get(Object)>
	//    9   23:checkcast       #194 <Class ViewPropertyAnimatorCompat>
	//   10   26:astore_2        
		ViewPropertyAnimatorCompat viewpropertyanimatorcompat = viewpropertyanimatorcompat1;
	//   11   27:aload_2         
	//   12   28:astore_1        
		if(viewpropertyanimatorcompat1 == null)
	//*  13   29:aload_2         
	//*  14   30:ifnonnull       51
		{
			viewpropertyanimatorcompat = new ViewPropertyAnimatorCompat(view);
	//   15   33:new             #194 <Class ViewPropertyAnimatorCompat>
	//   16   36:dup             
	//   17   37:aload_0         
	//   18   38:invokespecial   #196 <Method void ViewPropertyAnimatorCompat(View)>
	//   19   41:astore_1        
			sViewPropertyAnimatorMap.put(((Object) (view)), ((Object) (viewpropertyanimatorcompat)));
	//   20   42:getstatic       #117 <Field WeakHashMap sViewPropertyAnimatorMap>
	//   21   45:aload_0         
	//   22   46:aload_1         
	//   23   47:invokevirtual   #197 <Method Object WeakHashMap.put(Object, Object)>
	//   24   50:pop             
		}
		return viewpropertyanimatorcompat;
	//   25   51:aload_1         
	//   26   52:areturn         
	}

	private static void bindTempDetach()
	{
		try
		{
			sDispatchStartTemporaryDetach = ((Class) (android/view/View)).getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);
	//    0    0:ldc1            #132 <Class View>
	//    1    2:ldc1            #203 <String "dispatchStartTemporaryDetach">
	//    2    4:iconst_0        
	//    3    5:anewarray       Class[]
	//    4    8:invokevirtual   #209 <Method Method Class.getDeclaredMethod(String, Class[])>
	//    5   11:putstatic       #211 <Field Method sDispatchStartTemporaryDetach>
			sDispatchFinishTemporaryDetach = ((Class) (android/view/View)).getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);
	//    6   14:ldc1            #132 <Class View>
	//    7   16:ldc1            #213 <String "dispatchFinishTemporaryDetach">
	//    8   18:iconst_0        
	//    9   19:anewarray       Class[]
	//   10   22:invokevirtual   #209 <Method Method Class.getDeclaredMethod(String, Class[])>
	//   11   25:putstatic       #215 <Field Method sDispatchFinishTemporaryDetach>
		}
	//*  12   28:goto            41
		catch(NoSuchMethodException nosuchmethodexception)
	//*  13   31:astore_0        
		{
			Log.e("ViewCompat", "Couldn't find method", ((Throwable) (nosuchmethodexception)));
	//   14   32:ldc1            #80  <String "ViewCompat">
	//   15   34:ldc1            #217 <String "Couldn't find method">
	//   16   36:aload_0         
	//   17   37:invokestatic    #223 <Method int Log.e(String, String, Throwable)>
	//   18   40:pop             
		}
		sTempDetachBound = true;
	//   19   41:iconst_1        
	//   20   42:putstatic       #225 <Field boolean sTempDetachBound>
	//   21   45:return          
	}

	public static boolean canScrollHorizontally(View view, int i)
	{
		return view.canScrollHorizontally(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #230 <Method boolean View.canScrollHorizontally(int)>
	//    3    5:ireturn         
	}

	public static boolean canScrollVertically(View view, int i)
	{
		return view.canScrollVertically(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #234 <Method boolean View.canScrollVertically(int)>
	//    3    5:ireturn         
	}

	public static void cancelDragAndDrop(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          12
			view.cancelDragAndDrop();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #237 <Method void View.cancelDragAndDrop()>
	//    5   12:return          
	}

	public static int combineMeasuredStates(int i, int j)
	{
		return View.combineMeasuredStates(i, j);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #241 <Method int View.combineMeasuredStates(int, int)>
	//    3    5:ireturn         
	}

	private static void compatOffsetLeftAndRight(View view, int i)
	{
		view.offsetLeftAndRight(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #246 <Method void View.offsetLeftAndRight(int)>
		if(view.getVisibility() == 0)
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #249 <Method int View.getVisibility()>
	//*   5    9:ifne            35
		{
			tickleInvalidationFlag(view);
	//    6   12:aload_0         
	//    7   13:invokestatic    #252 <Method void tickleInvalidationFlag(View)>
			view = ((View) (view.getParent()));
	//    8   16:aload_0         
	//    9   17:invokevirtual   #256 <Method ViewParent View.getParent()>
	//   10   20:astore_0        
			if(view instanceof View)
	//*  11   21:aload_0         
	//*  12   22:instanceof      #132 <Class View>
	//*  13   25:ifeq            35
				tickleInvalidationFlag((View)view);
	//   14   28:aload_0         
	//   15   29:checkcast       #132 <Class View>
	//   16   32:invokestatic    #252 <Method void tickleInvalidationFlag(View)>
		}
	//   17   35:return          
	}

	private static void compatOffsetTopAndBottom(View view, int i)
	{
		view.offsetTopAndBottom(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #260 <Method void View.offsetTopAndBottom(int)>
		if(view.getVisibility() == 0)
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #249 <Method int View.getVisibility()>
	//*   5    9:ifne            35
		{
			tickleInvalidationFlag(view);
	//    6   12:aload_0         
	//    7   13:invokestatic    #252 <Method void tickleInvalidationFlag(View)>
			view = ((View) (view.getParent()));
	//    8   16:aload_0         
	//    9   17:invokevirtual   #256 <Method ViewParent View.getParent()>
	//   10   20:astore_0        
			if(view instanceof View)
	//*  11   21:aload_0         
	//*  12   22:instanceof      #132 <Class View>
	//*  13   25:ifeq            35
				tickleInvalidationFlag((View)view);
	//   14   28:aload_0         
	//   15   29:checkcast       #132 <Class View>
	//   16   32:invokestatic    #252 <Method void tickleInvalidationFlag(View)>
		}
	//   17   35:return          
	}

	public static WindowInsetsCompat dispatchApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          43
		{
			windowinsetscompat = ((WindowInsetsCompat) ((WindowInsets)WindowInsetsCompat.unwrap(windowinsetscompat)));
	//    3    8:aload_1         
	//    4    9:invokestatic    #268 <Method Object WindowInsetsCompat.unwrap(WindowInsetsCompat)>
	//    5   12:checkcast       #270 <Class WindowInsets>
	//    6   15:astore_1        
			WindowInsets windowinsets = view.dispatchApplyWindowInsets(((WindowInsets) (windowinsetscompat)));
	//    7   16:aload_0         
	//    8   17:aload_1         
	//    9   18:invokevirtual   #273 <Method WindowInsets View.dispatchApplyWindowInsets(WindowInsets)>
	//   10   21:astore_2        
			view = ((View) (windowinsetscompat));
	//   11   22:aload_1         
	//   12   23:astore_0        
			if(windowinsets != windowinsetscompat)
	//*  13   24:aload_2         
	//*  14   25:aload_1         
	//*  15   26:if_acmpeq       38
				view = ((View) (new WindowInsets(windowinsets)));
	//   16   29:new             #270 <Class WindowInsets>
	//   17   32:dup             
	//   18   33:aload_2         
	//   19   34:invokespecial   #276 <Method void WindowInsets(WindowInsets)>
	//   20   37:astore_0        
			return WindowInsetsCompat.wrap(((Object) (view)));
	//   21   38:aload_0         
	//   22   39:invokestatic    #280 <Method WindowInsetsCompat WindowInsetsCompat.wrap(Object)>
	//   23   42:areturn         
		} else
		{
			return windowinsetscompat;
	//   24   43:aload_1         
	//   25   44:areturn         
		}
	}

	public static void dispatchFinishTemporaryDetach(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          13
		{
			view.dispatchFinishTemporaryDetach();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #284 <Method void View.dispatchFinishTemporaryDetach()>
			return;
	//    5   12:return          
		}
		if(!sTempDetachBound)
	//*   6   13:getstatic       #225 <Field boolean sTempDetachBound>
	//*   7   16:ifne            22
			bindTempDetach();
	//    8   19:invokestatic    #286 <Method void bindTempDetach()>
		Method method = sDispatchFinishTemporaryDetach;
	//    9   22:getstatic       #215 <Field Method sDispatchFinishTemporaryDetach>
	//   10   25:astore_1        
		if(method != null)
	//*  11   26:aload_1         
	//*  12   27:ifnull          53
		{
			try
			{
				method.invoke(((Object) (view)), new Object[0]);
	//   13   30:aload_1         
	//   14   31:aload_0         
	//   15   32:iconst_0        
	//   16   33:anewarray       Object[]
	//   17   36:invokevirtual   #292 <Method Object Method.invoke(Object, Object[])>
	//   18   39:pop             
				return;
	//   19   40:return          
			}
			// Misplaced declaration of an exception variable
			catch(View view)
	//*  20   41:astore_0        
			{
				Log.d("ViewCompat", "Error calling dispatchFinishTemporaryDetach", ((Throwable) (view)));
	//   21   42:ldc1            #80  <String "ViewCompat">
	//   22   44:ldc2            #294 <String "Error calling dispatchFinishTemporaryDetach">
	//   23   47:aload_0         
	//   24   48:invokestatic    #297 <Method int Log.d(String, String, Throwable)>
	//   25   51:pop             
			}
			return;
	//   26   52:return          
		} else
		{
			view.onFinishTemporaryDetach();
	//   27   53:aload_0         
	//   28   54:invokevirtual   #300 <Method void View.onFinishTemporaryDetach()>
			return;
	//   29   57:return          
		}
	}

	public static boolean dispatchNestedFling(View view, float f, float f1, boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          16
			return view.dispatchNestedFling(f, f1, flag);
	//    3    8:aload_0         
	//    4    9:fload_1         
	//    5   10:fload_2         
	//    6   11:iload_3         
	//    7   12:invokevirtual   #305 <Method boolean View.dispatchNestedFling(float, float, boolean)>
	//    8   15:ireturn         
		if(view instanceof NestedScrollingChild)
	//*   9   16:aload_0         
	//*  10   17:instanceof      #307 <Class NestedScrollingChild>
	//*  11   20:ifeq            36
			return ((NestedScrollingChild)view).dispatchNestedFling(f, f1, flag);
	//   12   23:aload_0         
	//   13   24:checkcast       #307 <Class NestedScrollingChild>
	//   14   27:fload_1         
	//   15   28:fload_2         
	//   16   29:iload_3         
	//   17   30:invokeinterface #308 <Method boolean NestedScrollingChild.dispatchNestedFling(float, float, boolean)>
	//   18   35:ireturn         
		else
			return false;
	//   19   36:iconst_0        
	//   20   37:ireturn         
	}

	public static boolean dispatchNestedPreFling(View view, float f, float f1)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          15
			return view.dispatchNestedPreFling(f, f1);
	//    3    8:aload_0         
	//    4    9:fload_1         
	//    5   10:fload_2         
	//    6   11:invokevirtual   #313 <Method boolean View.dispatchNestedPreFling(float, float)>
	//    7   14:ireturn         
		if(view instanceof NestedScrollingChild)
	//*   8   15:aload_0         
	//*   9   16:instanceof      #307 <Class NestedScrollingChild>
	//*  10   19:ifeq            34
			return ((NestedScrollingChild)view).dispatchNestedPreFling(f, f1);
	//   11   22:aload_0         
	//   12   23:checkcast       #307 <Class NestedScrollingChild>
	//   13   26:fload_1         
	//   14   27:fload_2         
	//   15   28:invokeinterface #314 <Method boolean NestedScrollingChild.dispatchNestedPreFling(float, float)>
	//   16   33:ireturn         
		else
			return false;
	//   17   34:iconst_0        
	//   18   35:ireturn         
	}

	public static boolean dispatchNestedPreScroll(View view, int i, int j, int ai[], int ai1[])
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          18
			return view.dispatchNestedPreScroll(i, j, ai, ai1);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:iload_2         
	//    6   11:aload_3         
	//    7   12:aload           4
	//    8   14:invokevirtual   #320 <Method boolean View.dispatchNestedPreScroll(int, int, int[], int[])>
	//    9   17:ireturn         
		if(view instanceof NestedScrollingChild)
	//*  10   18:aload_0         
	//*  11   19:instanceof      #307 <Class NestedScrollingChild>
	//*  12   22:ifeq            40
			return ((NestedScrollingChild)view).dispatchNestedPreScroll(i, j, ai, ai1);
	//   13   25:aload_0         
	//   14   26:checkcast       #307 <Class NestedScrollingChild>
	//   15   29:iload_1         
	//   16   30:iload_2         
	//   17   31:aload_3         
	//   18   32:aload           4
	//   19   34:invokeinterface #321 <Method boolean NestedScrollingChild.dispatchNestedPreScroll(int, int, int[], int[])>
	//   20   39:ireturn         
		else
			return false;
	//   21   40:iconst_0        
	//   22   41:ireturn         
	}

	public static boolean dispatchNestedPreScroll(View view, int i, int j, int ai[], int ai1[], int k)
	{
		if(view instanceof NestedScrollingChild2)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #324 <Class NestedScrollingChild2>
	//*   2    4:ifeq            24
			return ((NestedScrollingChild2)view).dispatchNestedPreScroll(i, j, ai, ai1, k);
	//    3    7:aload_0         
	//    4    8:checkcast       #324 <Class NestedScrollingChild2>
	//    5   11:iload_1         
	//    6   12:iload_2         
	//    7   13:aload_3         
	//    8   14:aload           4
	//    9   16:iload           5
	//   10   18:invokeinterface #327 <Method boolean NestedScrollingChild2.dispatchNestedPreScroll(int, int, int[], int[], int)>
	//   11   23:ireturn         
		if(k == 0)
	//*  12   24:iload           5
	//*  13   26:ifne            39
			return dispatchNestedPreScroll(view, i, j, ai, ai1);
	//   14   29:aload_0         
	//   15   30:iload_1         
	//   16   31:iload_2         
	//   17   32:aload_3         
	//   18   33:aload           4
	//   19   35:invokestatic    #329 <Method boolean dispatchNestedPreScroll(View, int, int, int[], int[])>
	//   20   38:ireturn         
		else
			return false;
	//   21   39:iconst_0        
	//   22   40:ireturn         
	}

	public static boolean dispatchNestedScroll(View view, int i, int j, int k, int l, int ai[])
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          20
			return view.dispatchNestedScroll(i, j, k, l, ai);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:iload_2         
	//    6   11:iload_3         
	//    7   12:iload           4
	//    8   14:aload           5
	//    9   16:invokevirtual   #334 <Method boolean View.dispatchNestedScroll(int, int, int, int, int[])>
	//   10   19:ireturn         
		if(view instanceof NestedScrollingChild)
	//*  11   20:aload_0         
	//*  12   21:instanceof      #307 <Class NestedScrollingChild>
	//*  13   24:ifeq            44
			return ((NestedScrollingChild)view).dispatchNestedScroll(i, j, k, l, ai);
	//   14   27:aload_0         
	//   15   28:checkcast       #307 <Class NestedScrollingChild>
	//   16   31:iload_1         
	//   17   32:iload_2         
	//   18   33:iload_3         
	//   19   34:iload           4
	//   20   36:aload           5
	//   21   38:invokeinterface #335 <Method boolean NestedScrollingChild.dispatchNestedScroll(int, int, int, int, int[])>
	//   22   43:ireturn         
		else
			return false;
	//   23   44:iconst_0        
	//   24   45:ireturn         
	}

	public static boolean dispatchNestedScroll(View view, int i, int j, int k, int l, int ai[], int i1)
	{
		if(view instanceof NestedScrollingChild2)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #324 <Class NestedScrollingChild2>
	//*   2    4:ifeq            26
			return ((NestedScrollingChild2)view).dispatchNestedScroll(i, j, k, l, ai, i1);
	//    3    7:aload_0         
	//    4    8:checkcast       #324 <Class NestedScrollingChild2>
	//    5   11:iload_1         
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:iload           4
	//    9   16:aload           5
	//   10   18:iload           6
	//   11   20:invokeinterface #339 <Method boolean NestedScrollingChild2.dispatchNestedScroll(int, int, int, int, int[], int)>
	//   12   25:ireturn         
		if(i1 == 0)
	//*  13   26:iload           6
	//*  14   28:ifne            43
			return dispatchNestedScroll(view, i, j, k, l, ai);
	//   15   31:aload_0         
	//   16   32:iload_1         
	//   17   33:iload_2         
	//   18   34:iload_3         
	//   19   35:iload           4
	//   20   37:aload           5
	//   21   39:invokestatic    #341 <Method boolean dispatchNestedScroll(View, int, int, int, int, int[])>
	//   22   42:ireturn         
		else
			return false;
	//   23   43:iconst_0        
	//   24   44:ireturn         
	}

	public static void dispatchStartTemporaryDetach(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          13
		{
			view.dispatchStartTemporaryDetach();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #343 <Method void View.dispatchStartTemporaryDetach()>
			return;
	//    5   12:return          
		}
		if(!sTempDetachBound)
	//*   6   13:getstatic       #225 <Field boolean sTempDetachBound>
	//*   7   16:ifne            22
			bindTempDetach();
	//    8   19:invokestatic    #286 <Method void bindTempDetach()>
		Method method = sDispatchStartTemporaryDetach;
	//    9   22:getstatic       #211 <Field Method sDispatchStartTemporaryDetach>
	//   10   25:astore_1        
		if(method != null)
	//*  11   26:aload_1         
	//*  12   27:ifnull          53
		{
			try
			{
				method.invoke(((Object) (view)), new Object[0]);
	//   13   30:aload_1         
	//   14   31:aload_0         
	//   15   32:iconst_0        
	//   16   33:anewarray       Object[]
	//   17   36:invokevirtual   #292 <Method Object Method.invoke(Object, Object[])>
	//   18   39:pop             
				return;
	//   19   40:return          
			}
			// Misplaced declaration of an exception variable
			catch(View view)
	//*  20   41:astore_0        
			{
				Log.d("ViewCompat", "Error calling dispatchStartTemporaryDetach", ((Throwable) (view)));
	//   21   42:ldc1            #80  <String "ViewCompat">
	//   22   44:ldc2            #345 <String "Error calling dispatchStartTemporaryDetach">
	//   23   47:aload_0         
	//   24   48:invokestatic    #297 <Method int Log.d(String, String, Throwable)>
	//   25   51:pop             
			}
			return;
	//   26   52:return          
		} else
		{
			view.onStartTemporaryDetach();
	//   27   53:aload_0         
	//   28   54:invokevirtual   #348 <Method void View.onStartTemporaryDetach()>
			return;
	//   29   57:return          
		}
	}

	static boolean dispatchUnhandledKeyEventBeforeCallback(View view, KeyEvent keyevent)
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          10
			return false;
	//    3    8:iconst_0        
	//    4    9:ireturn         
		else
			return UnhandledKeyEventManager.at(view).dispatch(view, keyevent);
	//    5   10:aload_0         
	//    6   11:invokestatic    #355 <Method ViewCompat$UnhandledKeyEventManager ViewCompat$UnhandledKeyEventManager.at(View)>
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #358 <Method boolean ViewCompat$UnhandledKeyEventManager.dispatch(View, KeyEvent)>
	//   10   19:ireturn         
	}

	static boolean dispatchUnhandledKeyEventBeforeHierarchy(View view, KeyEvent keyevent)
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          10
			return false;
	//    3    8:iconst_0        
	//    4    9:ireturn         
		else
			return UnhandledKeyEventManager.at(view).preDispatch(keyevent);
	//    5   10:aload_0         
	//    6   11:invokestatic    #355 <Method ViewCompat$UnhandledKeyEventManager ViewCompat$UnhandledKeyEventManager.at(View)>
	//    7   14:aload_1         
	//    8   15:invokevirtual   #363 <Method boolean ViewCompat$UnhandledKeyEventManager.preDispatch(KeyEvent)>
	//    9   18:ireturn         
	}

	public static int generateViewId()
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          12
			return View.generateViewId();
	//    3    8:invokestatic    #366 <Method int View.generateViewId()>
	//    4   11:ireturn         
		int i;
		int k;
		do
		{
			k = sNextGeneratedId.get();
	//    5   12:getstatic       #115 <Field AtomicInteger sNextGeneratedId>
	//    6   15:invokevirtual   #368 <Method int AtomicInteger.get()>
	//    7   18:istore_2        
			int j = k + 1;
	//    8   19:iload_2         
	//    9   20:iconst_1        
	//   10   21:iadd            
	//   11   22:istore_1        
			i = j;
	//   12   23:iload_1         
	//   13   24:istore_0        
			if(j > 0xffffff)
	//*  14   25:iload_1         
	//*  15   26:ldc1            #58  <Int 0xffffff>
	//*  16   28:icmple          33
				i = 1;
	//   17   31:iconst_1        
	//   18   32:istore_0        
		} while(!sNextGeneratedId.compareAndSet(k, i));
	//   19   33:getstatic       #115 <Field AtomicInteger sNextGeneratedId>
	//   20   36:iload_2         
	//   21   37:iload_0         
	//   22   38:invokevirtual   #372 <Method boolean AtomicInteger.compareAndSet(int, int)>
	//   23   41:ifeq            12
		return k;
	//   24   44:iload_2         
	//   25   45:ireturn         
	}

	public static int getAccessibilityLiveRegion(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          13
			return view.getAccessibilityLiveRegion();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #376 <Method int View.getAccessibilityLiveRegion()>
	//    5   12:ireturn         
		else
			return 0;
	//    6   13:iconst_0        
	//    7   14:ireturn         
	}

	public static AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          26
		{
			view = ((View) (view.getAccessibilityNodeProvider()));
	//    3    8:aload_0         
	//    4    9:invokevirtual   #381 <Method android.view.accessibility.AccessibilityNodeProvider View.getAccessibilityNodeProvider()>
	//    5   12:astore_0        
			if(view != null)
	//*   6   13:aload_0         
	//*   7   14:ifnull          26
				return new AccessibilityNodeProviderCompat(((Object) (view)));
	//    8   17:new             #383 <Class AccessibilityNodeProviderCompat>
	//    9   20:dup             
	//   10   21:aload_0         
	//   11   22:invokespecial   #386 <Method void AccessibilityNodeProviderCompat(Object)>
	//   12   25:areturn         
		}
		return null;
	//   13   26:aconst_null     
	//   14   27:areturn         
	}

	public static float getAlpha(View view)
	{
		return view.getAlpha();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #391 <Method float View.getAlpha()>
	//    2    4:freturn         
	}

	public static ColorStateList getBackgroundTintList(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			return view.getBackgroundTintList();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #396 <Method ColorStateList View.getBackgroundTintList()>
	//    5   12:areturn         
		if(view instanceof TintableBackgroundView)
	//*   6   13:aload_0         
	//*   7   14:instanceof      #398 <Class TintableBackgroundView>
	//*   8   17:ifeq            30
			return ((TintableBackgroundView)view).getSupportBackgroundTintList();
	//    9   20:aload_0         
	//   10   21:checkcast       #398 <Class TintableBackgroundView>
	//   11   24:invokeinterface #401 <Method ColorStateList TintableBackgroundView.getSupportBackgroundTintList()>
	//   12   29:areturn         
		else
			return null;
	//   13   30:aconst_null     
	//   14   31:areturn         
	}

	public static android.graphics.PorterDuff.Mode getBackgroundTintMode(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			return view.getBackgroundTintMode();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #406 <Method android.graphics.PorterDuff$Mode View.getBackgroundTintMode()>
	//    5   12:areturn         
		if(view instanceof TintableBackgroundView)
	//*   6   13:aload_0         
	//*   7   14:instanceof      #398 <Class TintableBackgroundView>
	//*   8   17:ifeq            30
			return ((TintableBackgroundView)view).getSupportBackgroundTintMode();
	//    9   20:aload_0         
	//   10   21:checkcast       #398 <Class TintableBackgroundView>
	//   11   24:invokeinterface #409 <Method android.graphics.PorterDuff$Mode TintableBackgroundView.getSupportBackgroundTintMode()>
	//   12   29:areturn         
		else
			return null;
	//   13   30:aconst_null     
	//   14   31:areturn         
	}

	public static Rect getClipBounds(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          13
			return view.getClipBounds();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #414 <Method Rect View.getClipBounds()>
	//    5   12:areturn         
		else
			return null;
	//    6   13:aconst_null     
	//    7   14:areturn         
	}

	public static Display getDisplay(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          13
			return view.getDisplay();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #419 <Method Display View.getDisplay()>
	//    5   12:areturn         
		if(isAttachedToWindow(view))
	//*   6   13:aload_0         
	//*   7   14:invokestatic    #423 <Method boolean isAttachedToWindow(View)>
	//*   8   17:ifeq            39
			return ((WindowManager)view.getContext().getSystemService("window")).getDefaultDisplay();
	//    9   20:aload_0         
	//   10   21:invokevirtual   #427 <Method Context View.getContext()>
	//   11   24:ldc2            #429 <String "window">
	//   12   27:invokevirtual   #435 <Method Object Context.getSystemService(String)>
	//   13   30:checkcast       #437 <Class WindowManager>
	//   14   33:invokeinterface #440 <Method Display WindowManager.getDefaultDisplay()>
	//   15   38:areturn         
		else
			return null;
	//   16   39:aconst_null     
	//   17   40:areturn         
	}

	public static float getElevation(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			return view.getElevation();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #443 <Method float View.getElevation()>
	//    5   12:freturn         
		else
			return 0.0F;
	//    6   13:fconst_0        
	//    7   14:freturn         
	}

	private static Rect getEmptyTempRect()
	{
		if(sThreadLocalRect == null)
	//*   0    0:getstatic       #446 <Field ThreadLocal sThreadLocalRect>
	//*   1    3:ifnonnull       16
			sThreadLocalRect = new ThreadLocal();
	//    2    6:new             #448 <Class ThreadLocal>
	//    3    9:dup             
	//    4   10:invokespecial   #449 <Method void ThreadLocal()>
	//    5   13:putstatic       #446 <Field ThreadLocal sThreadLocalRect>
		Rect rect1 = (Rect)sThreadLocalRect.get();
	//    6   16:getstatic       #446 <Field ThreadLocal sThreadLocalRect>
	//    7   19:invokevirtual   #452 <Method Object ThreadLocal.get()>
	//    8   22:checkcast       #454 <Class Rect>
	//    9   25:astore_1        
		Rect rect = rect1;
	//   10   26:aload_1         
	//   11   27:astore_0        
		if(rect1 == null)
	//*  12   28:aload_1         
	//*  13   29:ifnonnull       47
		{
			rect = new Rect();
	//   14   32:new             #454 <Class Rect>
	//   15   35:dup             
	//   16   36:invokespecial   #455 <Method void Rect()>
	//   17   39:astore_0        
			sThreadLocalRect.set(((Object) (rect)));
	//   18   40:getstatic       #446 <Field ThreadLocal sThreadLocalRect>
	//   19   43:aload_0         
	//   20   44:invokevirtual   #458 <Method void ThreadLocal.set(Object)>
		}
		rect.setEmpty();
	//   21   47:aload_0         
	//   22   48:invokevirtual   #461 <Method void Rect.setEmpty()>
		return rect;
	//   23   51:aload_0         
	//   24   52:areturn         
	}

	public static boolean getFitsSystemWindows(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          13
			return view.getFitsSystemWindows();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #465 <Method boolean View.getFitsSystemWindows()>
	//    5   12:ireturn         
		else
			return false;
	//    6   13:iconst_0        
	//    7   14:ireturn         
	}

	public static int getImportantForAccessibility(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          13
			return view.getImportantForAccessibility();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #468 <Method int View.getImportantForAccessibility()>
	//    5   12:ireturn         
		else
			return 0;
	//    6   13:iconst_0        
	//    7   14:ireturn         
	}

	public static int getImportantForAutofill(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          13
			return view.getImportantForAutofill();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #474 <Method int View.getImportantForAutofill()>
	//    5   12:ireturn         
		else
			return 0;
	//    6   13:iconst_0        
	//    7   14:ireturn         
	}

	public static int getLabelFor(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          13
			return view.getLabelFor();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #477 <Method int View.getLabelFor()>
	//    5   12:ireturn         
		else
			return 0;
	//    6   13:iconst_0        
	//    7   14:ireturn         
	}

	public static int getLayerType(View view)
	{
		return view.getLayerType();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #480 <Method int View.getLayerType()>
	//    2    4:ireturn         
	}

	public static int getLayoutDirection(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          13
			return view.getLayoutDirection();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #483 <Method int View.getLayoutDirection()>
	//    5   12:ireturn         
		else
			return 0;
	//    6   13:iconst_0        
	//    7   14:ireturn         
	}

	public static Matrix getMatrix(View view)
	{
		return view.getMatrix();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #488 <Method Matrix View.getMatrix()>
	//    2    4:areturn         
	}

	public static int getMeasuredHeightAndState(View view)
	{
		return view.getMeasuredHeightAndState();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #491 <Method int View.getMeasuredHeightAndState()>
	//    2    4:ireturn         
	}

	public static int getMeasuredState(View view)
	{
		return view.getMeasuredState();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #494 <Method int View.getMeasuredState()>
	//    2    4:ireturn         
	}

	public static int getMeasuredWidthAndState(View view)
	{
		return view.getMeasuredWidthAndState();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #497 <Method int View.getMeasuredWidthAndState()>
	//    2    4:ireturn         
	}

	public static int getMinimumHeight(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          13
			return view.getMinimumHeight();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #502 <Method int View.getMinimumHeight()>
	//    5   12:ireturn         
		if(!sMinHeightFieldFetched)
	//*   6   13:getstatic       #504 <Field boolean sMinHeightFieldFetched>
	//*   7   16:ifne            41
		{
			int i;
			Field field;
			try
			{
				sMinHeightField = ((Class) (android/view/View)).getDeclaredField("mMinHeight");
	//    8   19:ldc1            #132 <Class View>
	//    9   21:ldc2            #506 <String "mMinHeight">
	//   10   24:invokevirtual   #510 <Method Field Class.getDeclaredField(String)>
	//   11   27:putstatic       #512 <Field Field sMinHeightField>
				sMinHeightField.setAccessible(true);
	//   12   30:getstatic       #512 <Field Field sMinHeightField>
	//   13   33:iconst_1        
	//   14   34:invokevirtual   #518 <Method void Field.setAccessible(boolean)>
			}
	//*  15   37:iconst_1        
	//*  16   38:putstatic       #504 <Field boolean sMinHeightFieldFetched>
	//*  17   41:getstatic       #512 <Field Field sMinHeightField>
	//*  18   44:astore_2        
	//*  19   45:aload_2         
	//*  20   46:ifnull          63
	//*  21   49:aload_2         
	//*  22   50:aload_0         
	//*  23   51:invokevirtual   #519 <Method Object Field.get(Object)>
	//*  24   54:checkcast       #521 <Class Integer>
	//*  25   57:invokevirtual   #524 <Method int Integer.intValue()>
	//*  26   60:istore_1        
	//*  27   61:iload_1         
	//*  28   62:ireturn         
	//*  29   63:iconst_0        
	//*  30   64:ireturn         
			catch(NoSuchFieldException nosuchfieldexception) { }
	//   31   65:astore_2        
			sMinHeightFieldFetched = true;
		}
		field = sMinHeightField;
		if(field == null)
			break MISSING_BLOCK_LABEL_63;
		i = ((Integer)field.get(((Object) (view)))).intValue();
		return i;
_L2:
		return 0;
	//*  32   66:goto            37
		view;
	//   33   69:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  34   70:goto            63
	}

	public static int getMinimumWidth(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          13
			return view.getMinimumWidth();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #527 <Method int View.getMinimumWidth()>
	//    5   12:ireturn         
		if(!sMinWidthFieldFetched)
	//*   6   13:getstatic       #529 <Field boolean sMinWidthFieldFetched>
	//*   7   16:ifne            41
		{
			int i;
			Field field;
			try
			{
				sMinWidthField = ((Class) (android/view/View)).getDeclaredField("mMinWidth");
	//    8   19:ldc1            #132 <Class View>
	//    9   21:ldc2            #531 <String "mMinWidth">
	//   10   24:invokevirtual   #510 <Method Field Class.getDeclaredField(String)>
	//   11   27:putstatic       #533 <Field Field sMinWidthField>
				sMinWidthField.setAccessible(true);
	//   12   30:getstatic       #533 <Field Field sMinWidthField>
	//   13   33:iconst_1        
	//   14   34:invokevirtual   #518 <Method void Field.setAccessible(boolean)>
			}
	//*  15   37:iconst_1        
	//*  16   38:putstatic       #529 <Field boolean sMinWidthFieldFetched>
	//*  17   41:getstatic       #533 <Field Field sMinWidthField>
	//*  18   44:astore_2        
	//*  19   45:aload_2         
	//*  20   46:ifnull          63
	//*  21   49:aload_2         
	//*  22   50:aload_0         
	//*  23   51:invokevirtual   #519 <Method Object Field.get(Object)>
	//*  24   54:checkcast       #521 <Class Integer>
	//*  25   57:invokevirtual   #524 <Method int Integer.intValue()>
	//*  26   60:istore_1        
	//*  27   61:iload_1         
	//*  28   62:ireturn         
	//*  29   63:iconst_0        
	//*  30   64:ireturn         
			catch(NoSuchFieldException nosuchfieldexception) { }
	//   31   65:astore_2        
			sMinWidthFieldFetched = true;
		}
		field = sMinWidthField;
		if(field == null)
			break MISSING_BLOCK_LABEL_63;
		i = ((Integer)field.get(((Object) (view)))).intValue();
		return i;
_L2:
		return 0;
	//*  32   66:goto            37
		view;
	//   33   69:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  34   70:goto            63
	}

	public static int getNextClusterForwardId(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          13
			return view.getNextClusterForwardId();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #536 <Method int View.getNextClusterForwardId()>
	//    5   12:ireturn         
		else
			return -1;
	//    6   13:iconst_m1       
	//    7   14:ireturn         
	}

	public static int getOverScrollMode(View view)
	{
		return view.getOverScrollMode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #539 <Method int View.getOverScrollMode()>
	//    2    4:ireturn         
	}

	public static int getPaddingEnd(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          13
			return view.getPaddingEnd();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #543 <Method int View.getPaddingEnd()>
	//    5   12:ireturn         
		else
			return view.getPaddingRight();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #546 <Method int View.getPaddingRight()>
	//    8   17:ireturn         
	}

	public static int getPaddingStart(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          13
			return view.getPaddingStart();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #549 <Method int View.getPaddingStart()>
	//    5   12:ireturn         
		else
			return view.getPaddingLeft();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #552 <Method int View.getPaddingLeft()>
	//    8   17:ireturn         
	}

	public static ViewParent getParentForAccessibility(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          13
			return view.getParentForAccessibility();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #556 <Method ViewParent View.getParentForAccessibility()>
	//    5   12:areturn         
		else
			return view.getParent();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #256 <Method ViewParent View.getParent()>
	//    8   17:areturn         
	}

	public static float getPivotX(View view)
	{
		return view.getPivotX();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #559 <Method float View.getPivotX()>
	//    2    4:freturn         
	}

	public static float getPivotY(View view)
	{
		return view.getPivotY();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #562 <Method float View.getPivotY()>
	//    2    4:freturn         
	}

	public static float getRotation(View view)
	{
		return view.getRotation();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #565 <Method float View.getRotation()>
	//    2    4:freturn         
	}

	public static float getRotationX(View view)
	{
		return view.getRotationX();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #568 <Method float View.getRotationX()>
	//    2    4:freturn         
	}

	public static float getRotationY(View view)
	{
		return view.getRotationY();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #571 <Method float View.getRotationY()>
	//    2    4:freturn         
	}

	public static float getScaleX(View view)
	{
		return view.getScaleX();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #574 <Method float View.getScaleX()>
	//    2    4:freturn         
	}

	public static float getScaleY(View view)
	{
		return view.getScaleY();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #577 <Method float View.getScaleY()>
	//    2    4:freturn         
	}

	public static int getScrollIndicators(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          13
			return view.getScrollIndicators();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #580 <Method int View.getScrollIndicators()>
	//    5   12:ireturn         
		else
			return 0;
	//    6   13:iconst_0        
	//    7   14:ireturn         
	}

	public static String getTransitionName(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			return view.getTransitionName();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #585 <Method String View.getTransitionName()>
	//    5   12:areturn         
		WeakHashMap weakhashmap = sTransitionNameMap;
	//    6   13:getstatic       #587 <Field WeakHashMap sTransitionNameMap>
	//    7   16:astore_1        
		if(weakhashmap == null)
	//*   8   17:aload_1         
	//*   9   18:ifnonnull       23
			return null;
	//   10   21:aconst_null     
	//   11   22:areturn         
		else
			return (String)weakhashmap.get(((Object) (view)));
	//   12   23:aload_1         
	//   13   24:aload_0         
	//   14   25:invokevirtual   #192 <Method Object WeakHashMap.get(Object)>
	//   15   28:checkcast       #589 <Class String>
	//   16   31:areturn         
	}

	public static float getTranslationX(View view)
	{
		return view.getTranslationX();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #592 <Method float View.getTranslationX()>
	//    2    4:freturn         
	}

	public static float getTranslationY(View view)
	{
		return view.getTranslationY();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #595 <Method float View.getTranslationY()>
	//    2    4:freturn         
	}

	public static float getTranslationZ(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			return view.getTranslationZ();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #598 <Method float View.getTranslationZ()>
	//    5   12:freturn         
		else
			return 0.0F;
	//    6   13:fconst_0        
	//    7   14:freturn         
	}

	public static int getWindowSystemUiVisibility(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          13
			return view.getWindowSystemUiVisibility();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #601 <Method int View.getWindowSystemUiVisibility()>
	//    5   12:ireturn         
		else
			return 0;
	//    6   13:iconst_0        
	//    7   14:ireturn         
	}

	public static float getX(View view)
	{
		return view.getX();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #604 <Method float View.getX()>
	//    2    4:freturn         
	}

	public static float getY(View view)
	{
		return view.getY();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #607 <Method float View.getY()>
	//    2    4:freturn         
	}

	public static float getZ(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			return view.getZ();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #610 <Method float View.getZ()>
	//    5   12:freturn         
		else
			return 0.0F;
	//    6   13:fconst_0        
	//    7   14:freturn         
	}

	public static boolean hasAccessibilityDelegate(View view)
	{
		boolean flag1 = sAccessibilityDelegateCheckFailed;
	//    0    0:getstatic       #119 <Field boolean sAccessibilityDelegateCheckFailed>
	//    1    3:istore_2        
		boolean flag = false;
	//    2    4:iconst_0        
	//    3    5:istore_1        
		if(flag1)
	//*   4    6:iload_2         
	//*   5    7:ifeq            12
			return false;
	//    6   10:iconst_0        
	//    7   11:ireturn         
		if(sAccessibilityDelegateField == null)
	//*   8   12:getstatic       #615 <Field Field sAccessibilityDelegateField>
	//*   9   15:ifnonnull       45
			try
			{
				sAccessibilityDelegateField = ((Class) (android/view/View)).getDeclaredField("mAccessibilityDelegate");
	//   10   18:ldc1            #132 <Class View>
	//   11   20:ldc2            #617 <String "mAccessibilityDelegate">
	//   12   23:invokevirtual   #510 <Method Field Class.getDeclaredField(String)>
	//   13   26:putstatic       #615 <Field Field sAccessibilityDelegateField>
				sAccessibilityDelegateField.setAccessible(true);
	//   14   29:getstatic       #615 <Field Field sAccessibilityDelegateField>
	//   15   32:iconst_1        
	//   16   33:invokevirtual   #518 <Method void Field.setAccessible(boolean)>
			}
	//*  17   36:goto            45
	//*  18   39:iconst_1        
	//*  19   40:putstatic       #119 <Field boolean sAccessibilityDelegateCheckFailed>
	//*  20   43:iconst_0        
	//*  21   44:ireturn         
	//*  22   45:getstatic       #615 <Field Field sAccessibilityDelegateField>
	//*  23   48:aload_0         
	//*  24   49:invokevirtual   #519 <Method Object Field.get(Object)>
	//*  25   52:astore_0        
	//*  26   53:aload_0         
	//*  27   54:ifnull          59
	//*  28   57:iconst_1        
	//*  29   58:istore_1        
	//*  30   59:iload_1         
	//*  31   60:ireturn         
	//*  32   61:iconst_1        
	//*  33   62:putstatic       #119 <Field boolean sAccessibilityDelegateCheckFailed>
	//*  34   65:iconst_0        
	//*  35   66:ireturn         
			// Misplaced declaration of an exception variable
			catch(View view)
			{
				sAccessibilityDelegateCheckFailed = true;
				return false;
			}
		try
		{
			view = ((View) (sAccessibilityDelegateField.get(((Object) (view)))));
		}
	//*  36   67:astore_0        
	//*  37   68:goto            39
		// Misplaced declaration of an exception variable
		catch(View view)
		{
			sAccessibilityDelegateCheckFailed = true;
			return false;
		}
		if(view != null)
			flag = true;
		return flag;
	//*  38   71:astore_0        
	//*  39   72:goto            61
	}

	public static boolean hasExplicitFocusable(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          13
			return view.hasExplicitFocusable();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #620 <Method boolean View.hasExplicitFocusable()>
	//    5   12:ireturn         
		else
			return view.hasFocusable();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #623 <Method boolean View.hasFocusable()>
	//    8   17:ireturn         
	}

	public static boolean hasNestedScrollingParent(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			return view.hasNestedScrollingParent();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #626 <Method boolean View.hasNestedScrollingParent()>
	//    5   12:ireturn         
		if(view instanceof NestedScrollingChild)
	//*   6   13:aload_0         
	//*   7   14:instanceof      #307 <Class NestedScrollingChild>
	//*   8   17:ifeq            30
			return ((NestedScrollingChild)view).hasNestedScrollingParent();
	//    9   20:aload_0         
	//   10   21:checkcast       #307 <Class NestedScrollingChild>
	//   11   24:invokeinterface #627 <Method boolean NestedScrollingChild.hasNestedScrollingParent()>
	//   12   29:ireturn         
		else
			return false;
	//   13   30:iconst_0        
	//   14   31:ireturn         
	}

	public static boolean hasNestedScrollingParent(View view, int i)
	{
		if(view instanceof NestedScrollingChild2)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #324 <Class NestedScrollingChild2>
	//*   2    4:ifeq            21
			((NestedScrollingChild2)view).hasNestedScrollingParent(i);
	//    3    7:aload_0         
	//    4    8:checkcast       #324 <Class NestedScrollingChild2>
	//    5   11:iload_1         
	//    6   12:invokeinterface #629 <Method boolean NestedScrollingChild2.hasNestedScrollingParent(int)>
	//    7   17:pop             
		else
	//*   8   18:goto            30
		if(i == 0)
	//*   9   21:iload_1         
	//*  10   22:ifne            30
			return hasNestedScrollingParent(view);
	//   11   25:aload_0         
	//   12   26:invokestatic    #631 <Method boolean hasNestedScrollingParent(View)>
	//   13   29:ireturn         
		return false;
	//   14   30:iconst_0        
	//   15   31:ireturn         
	}

	public static boolean hasOnClickListeners(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 15)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          15
	//*   2    5:icmplt          13
			return view.hasOnClickListeners();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #634 <Method boolean View.hasOnClickListeners()>
	//    5   12:ireturn         
		else
			return false;
	//    6   13:iconst_0        
	//    7   14:ireturn         
	}

	public static boolean hasOverlappingRendering(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          13
			return view.hasOverlappingRendering();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #637 <Method boolean View.hasOverlappingRendering()>
	//    5   12:ireturn         
		else
			return true;
	//    6   13:iconst_1        
	//    7   14:ireturn         
	}

	public static boolean hasTransientState(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          13
			return view.hasTransientState();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #640 <Method boolean View.hasTransientState()>
	//    5   12:ireturn         
		else
			return false;
	//    6   13:iconst_0        
	//    7   14:ireturn         
	}

	public static boolean isAttachedToWindow(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          13
			return view.isAttachedToWindow();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #642 <Method boolean View.isAttachedToWindow()>
	//    5   12:ireturn         
		return view.getWindowToken() != null;
	//    6   13:aload_0         
	//    7   14:invokevirtual   #646 <Method android.os.IBinder View.getWindowToken()>
	//    8   17:ifnull          22
	//    9   20:iconst_1        
	//   10   21:ireturn         
	//   11   22:iconst_0        
	//   12   23:ireturn         
	}

	public static boolean isFocusedByDefault(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          13
			return view.isFocusedByDefault();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #649 <Method boolean View.isFocusedByDefault()>
	//    5   12:ireturn         
		else
			return false;
	//    6   13:iconst_0        
	//    7   14:ireturn         
	}

	public static boolean isImportantForAccessibility(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			return view.isImportantForAccessibility();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #652 <Method boolean View.isImportantForAccessibility()>
	//    5   12:ireturn         
		else
			return true;
	//    6   13:iconst_1        
	//    7   14:ireturn         
	}

	public static boolean isImportantForAutofill(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          13
			return view.isImportantForAutofill();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #655 <Method boolean View.isImportantForAutofill()>
	//    5   12:ireturn         
		else
			return true;
	//    6   13:iconst_1        
	//    7   14:ireturn         
	}

	public static boolean isInLayout(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          13
			return view.isInLayout();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #658 <Method boolean View.isInLayout()>
	//    5   12:ireturn         
		else
			return false;
	//    6   13:iconst_0        
	//    7   14:ireturn         
	}

	public static boolean isKeyboardNavigationCluster(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          13
			return view.isKeyboardNavigationCluster();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #661 <Method boolean View.isKeyboardNavigationCluster()>
	//    5   12:ireturn         
		else
			return false;
	//    6   13:iconst_0        
	//    7   14:ireturn         
	}

	public static boolean isLaidOut(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          13
			return view.isLaidOut();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #664 <Method boolean View.isLaidOut()>
	//    5   12:ireturn         
		return view.getWidth() > 0 && view.getHeight() > 0;
	//    6   13:aload_0         
	//    7   14:invokevirtual   #667 <Method int View.getWidth()>
	//    8   17:ifle            29
	//    9   20:aload_0         
	//   10   21:invokevirtual   #670 <Method int View.getHeight()>
	//   11   24:ifle            29
	//   12   27:iconst_1        
	//   13   28:ireturn         
	//   14   29:iconst_0        
	//   15   30:ireturn         
	}

	public static boolean isLayoutDirectionResolved(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          13
			return view.isLayoutDirectionResolved();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #673 <Method boolean View.isLayoutDirectionResolved()>
	//    5   12:ireturn         
		else
			return false;
	//    6   13:iconst_0        
	//    7   14:ireturn         
	}

	public static boolean isNestedScrollingEnabled(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			return view.isNestedScrollingEnabled();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #676 <Method boolean View.isNestedScrollingEnabled()>
	//    5   12:ireturn         
		if(view instanceof NestedScrollingChild)
	//*   6   13:aload_0         
	//*   7   14:instanceof      #307 <Class NestedScrollingChild>
	//*   8   17:ifeq            30
			return ((NestedScrollingChild)view).isNestedScrollingEnabled();
	//    9   20:aload_0         
	//   10   21:checkcast       #307 <Class NestedScrollingChild>
	//   11   24:invokeinterface #677 <Method boolean NestedScrollingChild.isNestedScrollingEnabled()>
	//   12   29:ireturn         
		else
			return false;
	//   13   30:iconst_0        
	//   14   31:ireturn         
	}

	public static boolean isOpaque(View view)
	{
		return view.isOpaque();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #680 <Method boolean View.isOpaque()>
	//    2    4:ireturn         
	}

	public static boolean isPaddingRelative(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          13
			return view.isPaddingRelative();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #683 <Method boolean View.isPaddingRelative()>
	//    5   12:ireturn         
		else
			return false;
	//    6   13:iconst_0        
	//    7   14:ireturn         
	}

	public static void jumpDrawablesToCurrentState(View view)
	{
		view.jumpDrawablesToCurrentState();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #686 <Method void View.jumpDrawablesToCurrentState()>
	//    2    4:return          
	}

	public static View keyboardNavigationClusterSearch(View view, View view1, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          15
			return view.keyboardNavigationClusterSearch(view1, i);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:iload_2         
	//    6   11:invokevirtual   #691 <Method View View.keyboardNavigationClusterSearch(View, int)>
	//    7   14:areturn         
		else
			return null;
	//    8   15:aconst_null     
	//    9   16:areturn         
	}

	public static void offsetLeftAndRight(View view, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          14
		{
			view.offsetLeftAndRight(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #246 <Method void View.offsetLeftAndRight(int)>
			return;
	//    6   13:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   7   14:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   17:bipush          21
	//*   9   19:icmplt          138
		{
			Rect rect = getEmptyTempRect();
	//   10   22:invokestatic    #693 <Method Rect getEmptyTempRect()>
	//   11   25:astore_3        
			boolean flag = false;
	//   12   26:iconst_0        
	//   13   27:istore_2        
			ViewParent viewparent = view.getParent();
	//   14   28:aload_0         
	//   15   29:invokevirtual   #256 <Method ViewParent View.getParent()>
	//   16   32:astore          4
			if(viewparent instanceof View)
	//*  17   34:aload           4
	//*  18   36:instanceof      #132 <Class View>
	//*  19   39:ifeq            96
			{
				View view1 = (View)viewparent;
	//   20   42:aload           4
	//   21   44:checkcast       #132 <Class View>
	//   22   47:astore          5
				rect.set(view1.getLeft(), view1.getTop(), view1.getRight(), view1.getBottom());
	//   23   49:aload_3         
	//   24   50:aload           5
	//   25   52:invokevirtual   #696 <Method int View.getLeft()>
	//   26   55:aload           5
	//   27   57:invokevirtual   #699 <Method int View.getTop()>
	//   28   60:aload           5
	//   29   62:invokevirtual   #702 <Method int View.getRight()>
	//   30   65:aload           5
	//   31   67:invokevirtual   #705 <Method int View.getBottom()>
	//   32   70:invokevirtual   #708 <Method void Rect.set(int, int, int, int)>
				flag = rect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) ^ true;
	//   33   73:aload_3         
	//   34   74:aload_0         
	//   35   75:invokevirtual   #696 <Method int View.getLeft()>
	//   36   78:aload_0         
	//   37   79:invokevirtual   #699 <Method int View.getTop()>
	//   38   82:aload_0         
	//   39   83:invokevirtual   #702 <Method int View.getRight()>
	//   40   86:aload_0         
	//   41   87:invokevirtual   #705 <Method int View.getBottom()>
	//   42   90:invokevirtual   #712 <Method boolean Rect.intersects(int, int, int, int)>
	//   43   93:iconst_1        
	//   44   94:ixor            
	//   45   95:istore_2        
			}
			compatOffsetLeftAndRight(view, i);
	//   46   96:aload_0         
	//   47   97:iload_1         
	//   48   98:invokestatic    #714 <Method void compatOffsetLeftAndRight(View, int)>
			if(flag && rect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()))
	//*  49  101:iload_2         
	//*  50  102:ifeq            143
	//*  51  105:aload_3         
	//*  52  106:aload_0         
	//*  53  107:invokevirtual   #696 <Method int View.getLeft()>
	//*  54  110:aload_0         
	//*  55  111:invokevirtual   #699 <Method int View.getTop()>
	//*  56  114:aload_0         
	//*  57  115:invokevirtual   #702 <Method int View.getRight()>
	//*  58  118:aload_0         
	//*  59  119:invokevirtual   #705 <Method int View.getBottom()>
	//*  60  122:invokevirtual   #717 <Method boolean Rect.intersect(int, int, int, int)>
	//*  61  125:ifeq            143
			{
				((View)viewparent).invalidate(rect);
	//   62  128:aload           4
	//   63  130:checkcast       #132 <Class View>
	//   64  133:aload_3         
	//   65  134:invokevirtual   #721 <Method void View.invalidate(Rect)>
				return;
	//   66  137:return          
			}
		} else
		{
			compatOffsetLeftAndRight(view, i);
	//   67  138:aload_0         
	//   68  139:iload_1         
	//   69  140:invokestatic    #714 <Method void compatOffsetLeftAndRight(View, int)>
		}
	//   70  143:return          
	}

	public static void offsetTopAndBottom(View view, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          14
		{
			view.offsetTopAndBottom(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #260 <Method void View.offsetTopAndBottom(int)>
			return;
	//    6   13:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   7   14:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   17:bipush          21
	//*   9   19:icmplt          138
		{
			Rect rect = getEmptyTempRect();
	//   10   22:invokestatic    #693 <Method Rect getEmptyTempRect()>
	//   11   25:astore_3        
			boolean flag = false;
	//   12   26:iconst_0        
	//   13   27:istore_2        
			ViewParent viewparent = view.getParent();
	//   14   28:aload_0         
	//   15   29:invokevirtual   #256 <Method ViewParent View.getParent()>
	//   16   32:astore          4
			if(viewparent instanceof View)
	//*  17   34:aload           4
	//*  18   36:instanceof      #132 <Class View>
	//*  19   39:ifeq            96
			{
				View view1 = (View)viewparent;
	//   20   42:aload           4
	//   21   44:checkcast       #132 <Class View>
	//   22   47:astore          5
				rect.set(view1.getLeft(), view1.getTop(), view1.getRight(), view1.getBottom());
	//   23   49:aload_3         
	//   24   50:aload           5
	//   25   52:invokevirtual   #696 <Method int View.getLeft()>
	//   26   55:aload           5
	//   27   57:invokevirtual   #699 <Method int View.getTop()>
	//   28   60:aload           5
	//   29   62:invokevirtual   #702 <Method int View.getRight()>
	//   30   65:aload           5
	//   31   67:invokevirtual   #705 <Method int View.getBottom()>
	//   32   70:invokevirtual   #708 <Method void Rect.set(int, int, int, int)>
				flag = rect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) ^ true;
	//   33   73:aload_3         
	//   34   74:aload_0         
	//   35   75:invokevirtual   #696 <Method int View.getLeft()>
	//   36   78:aload_0         
	//   37   79:invokevirtual   #699 <Method int View.getTop()>
	//   38   82:aload_0         
	//   39   83:invokevirtual   #702 <Method int View.getRight()>
	//   40   86:aload_0         
	//   41   87:invokevirtual   #705 <Method int View.getBottom()>
	//   42   90:invokevirtual   #712 <Method boolean Rect.intersects(int, int, int, int)>
	//   43   93:iconst_1        
	//   44   94:ixor            
	//   45   95:istore_2        
			}
			compatOffsetTopAndBottom(view, i);
	//   46   96:aload_0         
	//   47   97:iload_1         
	//   48   98:invokestatic    #723 <Method void compatOffsetTopAndBottom(View, int)>
			if(flag && rect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()))
	//*  49  101:iload_2         
	//*  50  102:ifeq            143
	//*  51  105:aload_3         
	//*  52  106:aload_0         
	//*  53  107:invokevirtual   #696 <Method int View.getLeft()>
	//*  54  110:aload_0         
	//*  55  111:invokevirtual   #699 <Method int View.getTop()>
	//*  56  114:aload_0         
	//*  57  115:invokevirtual   #702 <Method int View.getRight()>
	//*  58  118:aload_0         
	//*  59  119:invokevirtual   #705 <Method int View.getBottom()>
	//*  60  122:invokevirtual   #717 <Method boolean Rect.intersect(int, int, int, int)>
	//*  61  125:ifeq            143
			{
				((View)viewparent).invalidate(rect);
	//   62  128:aload           4
	//   63  130:checkcast       #132 <Class View>
	//   64  133:aload_3         
	//   65  134:invokevirtual   #721 <Method void View.invalidate(Rect)>
				return;
	//   66  137:return          
			}
		} else
		{
			compatOffsetTopAndBottom(view, i);
	//   67  138:aload_0         
	//   68  139:iload_1         
	//   69  140:invokestatic    #723 <Method void compatOffsetTopAndBottom(View, int)>
		}
	//   70  143:return          
	}

	public static WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          43
		{
			windowinsetscompat = ((WindowInsetsCompat) ((WindowInsets)WindowInsetsCompat.unwrap(windowinsetscompat)));
	//    3    8:aload_1         
	//    4    9:invokestatic    #268 <Method Object WindowInsetsCompat.unwrap(WindowInsetsCompat)>
	//    5   12:checkcast       #270 <Class WindowInsets>
	//    6   15:astore_1        
			WindowInsets windowinsets = view.onApplyWindowInsets(((WindowInsets) (windowinsetscompat)));
	//    7   16:aload_0         
	//    8   17:aload_1         
	//    9   18:invokevirtual   #726 <Method WindowInsets View.onApplyWindowInsets(WindowInsets)>
	//   10   21:astore_2        
			view = ((View) (windowinsetscompat));
	//   11   22:aload_1         
	//   12   23:astore_0        
			if(windowinsets != windowinsetscompat)
	//*  13   24:aload_2         
	//*  14   25:aload_1         
	//*  15   26:if_acmpeq       38
				view = ((View) (new WindowInsets(windowinsets)));
	//   16   29:new             #270 <Class WindowInsets>
	//   17   32:dup             
	//   18   33:aload_2         
	//   19   34:invokespecial   #276 <Method void WindowInsets(WindowInsets)>
	//   20   37:astore_0        
			return WindowInsetsCompat.wrap(((Object) (view)));
	//   21   38:aload_0         
	//   22   39:invokestatic    #280 <Method WindowInsetsCompat WindowInsetsCompat.wrap(Object)>
	//   23   42:areturn         
		} else
		{
			return windowinsetscompat;
	//   24   43:aload_1         
	//   25   44:areturn         
		}
	}

	public static void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
	{
		view.onInitializeAccessibilityEvent(accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #731 <Method void View.onInitializeAccessibilityEvent(AccessibilityEvent)>
	//    3    5:return          
	}

	public static void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		view.onInitializeAccessibilityNodeInfo(accessibilitynodeinfocompat.unwrap());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #738 <Method android.view.accessibility.AccessibilityNodeInfo AccessibilityNodeInfoCompat.unwrap()>
	//    3    5:invokevirtual   #741 <Method void View.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo)>
	//    4    8:return          
	}

	public static void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
	{
		view.onPopulateAccessibilityEvent(accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #744 <Method void View.onPopulateAccessibilityEvent(AccessibilityEvent)>
	//    3    5:return          
	}

	public static boolean performAccessibilityAction(View view, int i, Bundle bundle)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          15
			return view.performAccessibilityAction(i, bundle);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:aload_2         
	//    6   11:invokevirtual   #749 <Method boolean View.performAccessibilityAction(int, Bundle)>
	//    7   14:ireturn         
		else
			return false;
	//    8   15:iconst_0        
	//    9   16:ireturn         
	}

	public static void postInvalidateOnAnimation(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          13
		{
			view.postInvalidateOnAnimation();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #752 <Method void View.postInvalidateOnAnimation()>
			return;
	//    5   12:return          
		} else
		{
			view.postInvalidate();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #755 <Method void View.postInvalidate()>
			return;
	//    8   17:return          
		}
	}

	public static void postInvalidateOnAnimation(View view, int i, int j, int k, int l)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          18
		{
			view.postInvalidateOnAnimation(i, j, k, l);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:iload_2         
	//    6   11:iload_3         
	//    7   12:iload           4
	//    8   14:invokevirtual   #758 <Method void View.postInvalidateOnAnimation(int, int, int, int)>
			return;
	//    9   17:return          
		} else
		{
			view.postInvalidate(i, j, k, l);
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:iload_2         
	//   13   21:iload_3         
	//   14   22:iload           4
	//   15   24:invokevirtual   #760 <Method void View.postInvalidate(int, int, int, int)>
			return;
	//   16   27:return          
		}
	}

	public static void postOnAnimation(View view, Runnable runnable)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          14
		{
			view.postOnAnimation(runnable);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #765 <Method void View.postOnAnimation(Runnable)>
			return;
	//    6   13:return          
		} else
		{
			view.postDelayed(runnable, ValueAnimator.getFrameDelay());
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokestatic    #771 <Method long ValueAnimator.getFrameDelay()>
	//   10   19:invokevirtual   #775 <Method boolean View.postDelayed(Runnable, long)>
	//   11   22:pop             
			return;
	//   12   23:return          
		}
	}

	public static void postOnAnimationDelayed(View view, Runnable runnable, long l)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          15
		{
			view.postOnAnimationDelayed(runnable, l);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:lload_2         
	//    6   11:invokevirtual   #780 <Method void View.postOnAnimationDelayed(Runnable, long)>
			return;
	//    7   14:return          
		} else
		{
			view.postDelayed(runnable, ValueAnimator.getFrameDelay() + l);
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:invokestatic    #771 <Method long ValueAnimator.getFrameDelay()>
	//   11   20:lload_2         
	//   12   21:ladd            
	//   13   22:invokevirtual   #775 <Method boolean View.postDelayed(Runnable, long)>
	//   14   25:pop             
			return;
	//   15   26:return          
		}
	}

	public static void removeOnUnhandledKeyEventListener(View view, OnUnhandledKeyEventListenerCompat onunhandledkeyeventlistenercompat)
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          45
		{
			Map map = (Map)view.getTag(android.support.compat.R.id.tag_unhandled_key_listeners);
	//    3    8:aload_0         
	//    4    9:getstatic       #145 <Field int android.support.compat.R$id.tag_unhandled_key_listeners>
	//    5   12:invokevirtual   #149 <Method Object View.getTag(int)>
	//    6   15:checkcast       #151 <Class Map>
	//    7   18:astore_2        
			if(map == null)
	//*   8   19:aload_2         
	//*   9   20:ifnonnull       24
				return;
	//   10   23:return          
			onunhandledkeyeventlistenercompat = ((OnUnhandledKeyEventListenerCompat) ((android.view.View.OnUnhandledKeyEventListener)map.get(((Object) (onunhandledkeyeventlistenercompat)))));
	//   11   24:aload_2         
	//   12   25:aload_1         
	//   13   26:invokeinterface #782 <Method Object Map.get(Object)>
	//   14   31:checkcast       #784 <Class android.view.View$OnUnhandledKeyEventListener>
	//   15   34:astore_1        
			if(onunhandledkeyeventlistenercompat != null)
	//*  16   35:aload_1         
	//*  17   36:ifnull          44
				view.removeOnUnhandledKeyEventListener(((android.view.View.OnUnhandledKeyEventListener) (onunhandledkeyeventlistenercompat)));
	//   18   39:aload_0         
	//   19   40:aload_1         
	//   20   41:invokevirtual   #786 <Method void View.removeOnUnhandledKeyEventListener(android.view.View$OnUnhandledKeyEventListener)>
			return;
	//   21   44:return          
		}
		ArrayList arraylist = (ArrayList)view.getTag(android.support.compat.R.id.tag_unhandled_key_listeners);
	//   22   45:aload_0         
	//   23   46:getstatic       #145 <Field int android.support.compat.R$id.tag_unhandled_key_listeners>
	//   24   49:invokevirtual   #149 <Method Object View.getTag(int)>
	//   25   52:checkcast       #170 <Class ArrayList>
	//   26   55:astore_2        
		if(arraylist != null)
	//*  27   56:aload_2         
	//*  28   57:ifnull          77
		{
			arraylist.remove(((Object) (onunhandledkeyeventlistenercompat)));
	//   29   60:aload_2         
	//   30   61:aload_1         
	//   31   62:invokevirtual   #789 <Method boolean ArrayList.remove(Object)>
	//   32   65:pop             
			if(arraylist.size() == 0)
	//*  33   66:aload_2         
	//*  34   67:invokevirtual   #179 <Method int ArrayList.size()>
	//*  35   70:ifne            77
				UnhandledKeyEventManager.unregisterListeningView(view);
	//   36   73:aload_0         
	//   37   74:invokestatic    #792 <Method void ViewCompat$UnhandledKeyEventManager.unregisterListeningView(View)>
		}
	//   38   77:return          
	}

	public static void requestApplyInsets(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 20)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          20
	//*   2    5:icmplt          13
		{
			view.requestApplyInsets();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #795 <Method void View.requestApplyInsets()>
			return;
	//    5   12:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   6   13:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   16:bipush          16
	//*   8   18:icmplt          25
			view.requestFitSystemWindows();
	//    9   21:aload_0         
	//   10   22:invokevirtual   #798 <Method void View.requestFitSystemWindows()>
	//   11   25:return          
	}

	public static View requireViewById(View view, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          14
			return view.requireViewById(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #803 <Method View View.requireViewById(int)>
	//    6   13:areturn         
		view = view.findViewById(i);
	//    7   14:aload_0         
	//    8   15:iload_1         
	//    9   16:invokevirtual   #806 <Method View View.findViewById(int)>
	//   10   19:astore_0        
		if(view != null)
	//*  11   20:aload_0         
	//*  12   21:ifnull          26
			return view;
	//   13   24:aload_0         
	//   14   25:areturn         
		else
			throw new IllegalArgumentException("ID does not reference a View inside this View");
	//   15   26:new             #808 <Class IllegalArgumentException>
	//   16   29:dup             
	//   17   30:ldc2            #810 <String "ID does not reference a View inside this View">
	//   18   33:invokespecial   #813 <Method void IllegalArgumentException(String)>
	//   19   36:athrow          
	}

	public static int resolveSizeAndState(int i, int j, int k)
	{
		return View.resolveSizeAndState(i, j, k);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #818 <Method int View.resolveSizeAndState(int, int, int)>
	//    4    6:ireturn         
	}

	public static boolean restoreDefaultFocus(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          13
			return view.restoreDefaultFocus();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #821 <Method boolean View.restoreDefaultFocus()>
	//    5   12:ireturn         
		else
			return view.requestFocus();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #824 <Method boolean View.requestFocus()>
	//    8   17:ireturn         
	}

	public static void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilitydelegatecompat)
	{
		if(accessibilitydelegatecompat == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			accessibilitydelegatecompat = null;
	//    2    4:aconst_null     
	//    3    5:astore_1        
		else
	//*   4    6:goto            14
			accessibilitydelegatecompat = ((AccessibilityDelegateCompat) (accessibilitydelegatecompat.getBridge()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #832 <Method android.view.View$AccessibilityDelegate AccessibilityDelegateCompat.getBridge()>
	//    7   13:astore_1        
		view.setAccessibilityDelegate(((android.view.View.AccessibilityDelegate) (accessibilitydelegatecompat)));
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #835 <Method void View.setAccessibilityDelegate(android.view.View$AccessibilityDelegate)>
	//   11   19:return          
	}

	public static void setAccessibilityLiveRegion(View view, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          13
			view.setAccessibilityLiveRegion(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #838 <Method void View.setAccessibilityLiveRegion(int)>
	//    6   13:return          
	}

	public static void setActivated(View view, boolean flag)
	{
		view.setActivated(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #842 <Method void View.setActivated(boolean)>
	//    3    5:return          
	}

	public static void setAlpha(View view, float f)
	{
		view.setAlpha(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokevirtual   #854 <Method void View.setAlpha(float)>
	//    3    5:return          
	}

	public static transient void setAutofillHints(View view, String as[])
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          13
			view.setAutofillHints(as);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #859 <Method void View.setAutofillHints(String[])>
	//    6   13:return          
	}

	public static void setBackground(View view, Drawable drawable)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          14
		{
			view.setBackground(drawable);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #864 <Method void View.setBackground(Drawable)>
			return;
	//    6   13:return          
		} else
		{
			view.setBackgroundDrawable(drawable);
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #867 <Method void View.setBackgroundDrawable(Drawable)>
			return;
	//   10   19:return          
		}
	}

	public static void setBackgroundTintList(View view, ColorStateList colorstatelist)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          80
		{
			view.setBackgroundTintList(colorstatelist);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #872 <Method void View.setBackgroundTintList(ColorStateList)>
			if(android.os.Build.VERSION.SDK_INT == 21)
	//*   6   13:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   16:bipush          21
	//*   8   18:icmpne          97
			{
				colorstatelist = ((ColorStateList) (view.getBackground()));
	//    9   21:aload_0         
	//   10   22:invokevirtual   #876 <Method Drawable View.getBackground()>
	//   11   25:astore_1        
				boolean flag;
				if(view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null)
	//*  12   26:aload_0         
	//*  13   27:invokevirtual   #396 <Method ColorStateList View.getBackgroundTintList()>
	//*  14   30:ifnonnull       48
	//*  15   33:aload_0         
	//*  16   34:invokevirtual   #406 <Method android.graphics.PorterDuff$Mode View.getBackgroundTintMode()>
	//*  17   37:ifnull          43
	//*  18   40:goto            48
					flag = false;
	//   19   43:iconst_0        
	//   20   44:istore_2        
				else
	//*  21   45:goto            50
					flag = true;
	//   22   48:iconst_1        
	//   23   49:istore_2        
				if(colorstatelist != null && flag)
	//*  24   50:aload_1         
	//*  25   51:ifnull          97
	//*  26   54:iload_2         
	//*  27   55:ifeq            97
				{
					if(((Drawable) (colorstatelist)).isStateful())
	//*  28   58:aload_1         
	//*  29   59:invokevirtual   #881 <Method boolean Drawable.isStateful()>
	//*  30   62:ifeq            74
						((Drawable) (colorstatelist)).setState(view.getDrawableState());
	//   31   65:aload_1         
	//   32   66:aload_0         
	//   33   67:invokevirtual   #885 <Method int[] View.getDrawableState()>
	//   34   70:invokevirtual   #889 <Method boolean Drawable.setState(int[])>
	//   35   73:pop             
					view.setBackground(((Drawable) (colorstatelist)));
	//   36   74:aload_0         
	//   37   75:aload_1         
	//   38   76:invokevirtual   #864 <Method void View.setBackground(Drawable)>
					return;
	//   39   79:return          
				}
			}
		} else
		if(view instanceof TintableBackgroundView)
	//*  40   80:aload_0         
	//*  41   81:instanceof      #398 <Class TintableBackgroundView>
	//*  42   84:ifeq            97
			((TintableBackgroundView)view).setSupportBackgroundTintList(colorstatelist);
	//   43   87:aload_0         
	//   44   88:checkcast       #398 <Class TintableBackgroundView>
	//   45   91:aload_1         
	//   46   92:invokeinterface #892 <Method void TintableBackgroundView.setSupportBackgroundTintList(ColorStateList)>
	//   47   97:return          
	}

	public static void setBackgroundTintMode(View view, android.graphics.PorterDuff.Mode mode)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          80
		{
			view.setBackgroundTintMode(mode);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #897 <Method void View.setBackgroundTintMode(android.graphics.PorterDuff$Mode)>
			if(android.os.Build.VERSION.SDK_INT == 21)
	//*   6   13:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   16:bipush          21
	//*   8   18:icmpne          97
			{
				mode = ((android.graphics.PorterDuff.Mode) (view.getBackground()));
	//    9   21:aload_0         
	//   10   22:invokevirtual   #876 <Method Drawable View.getBackground()>
	//   11   25:astore_1        
				boolean flag;
				if(view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null)
	//*  12   26:aload_0         
	//*  13   27:invokevirtual   #396 <Method ColorStateList View.getBackgroundTintList()>
	//*  14   30:ifnonnull       48
	//*  15   33:aload_0         
	//*  16   34:invokevirtual   #406 <Method android.graphics.PorterDuff$Mode View.getBackgroundTintMode()>
	//*  17   37:ifnull          43
	//*  18   40:goto            48
					flag = false;
	//   19   43:iconst_0        
	//   20   44:istore_2        
				else
	//*  21   45:goto            50
					flag = true;
	//   22   48:iconst_1        
	//   23   49:istore_2        
				if(mode != null && flag)
	//*  24   50:aload_1         
	//*  25   51:ifnull          97
	//*  26   54:iload_2         
	//*  27   55:ifeq            97
				{
					if(((Drawable) (mode)).isStateful())
	//*  28   58:aload_1         
	//*  29   59:invokevirtual   #881 <Method boolean Drawable.isStateful()>
	//*  30   62:ifeq            74
						((Drawable) (mode)).setState(view.getDrawableState());
	//   31   65:aload_1         
	//   32   66:aload_0         
	//   33   67:invokevirtual   #885 <Method int[] View.getDrawableState()>
	//   34   70:invokevirtual   #889 <Method boolean Drawable.setState(int[])>
	//   35   73:pop             
					view.setBackground(((Drawable) (mode)));
	//   36   74:aload_0         
	//   37   75:aload_1         
	//   38   76:invokevirtual   #864 <Method void View.setBackground(Drawable)>
					return;
	//   39   79:return          
				}
			}
		} else
		if(view instanceof TintableBackgroundView)
	//*  40   80:aload_0         
	//*  41   81:instanceof      #398 <Class TintableBackgroundView>
	//*  42   84:ifeq            97
			((TintableBackgroundView)view).setSupportBackgroundTintMode(mode);
	//   43   87:aload_0         
	//   44   88:checkcast       #398 <Class TintableBackgroundView>
	//   45   91:aload_1         
	//   46   92:invokeinterface #900 <Method void TintableBackgroundView.setSupportBackgroundTintMode(android.graphics.PorterDuff$Mode)>
	//   47   97:return          
	}

	public static void setChildrenDrawingOrderEnabled(ViewGroup viewgroup, boolean flag)
	{
		if(sChildrenDrawingOrderMethod == null)
	//*   0    0:getstatic       #908 <Field Method sChildrenDrawingOrderMethod>
	//*   1    3:ifnonnull       49
		{
			try
			{
				sChildrenDrawingOrderMethod = ((Class) (android/view/ViewGroup)).getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[] {
					Boolean.TYPE
				});
	//    2    6:ldc2            #910 <Class ViewGroup>
	//    3    9:ldc2            #911 <String "setChildrenDrawingOrderEnabled">
	//    4   12:iconst_1        
	//    5   13:anewarray       Class[]
	//    6   16:dup             
	//    7   17:iconst_0        
	//    8   18:getstatic       #917 <Field Class Boolean.TYPE>
	//    9   21:aastore         
	//   10   22:invokevirtual   #209 <Method Method Class.getDeclaredMethod(String, Class[])>
	//   11   25:putstatic       #908 <Field Method sChildrenDrawingOrderMethod>
			}
	//*  12   28:goto            42
			catch(NoSuchMethodException nosuchmethodexception)
	//*  13   31:astore_2        
			{
				Log.e("ViewCompat", "Unable to find childrenDrawingOrderEnabled", ((Throwable) (nosuchmethodexception)));
	//   14   32:ldc1            #80  <String "ViewCompat">
	//   15   34:ldc2            #919 <String "Unable to find childrenDrawingOrderEnabled">
	//   16   37:aload_2         
	//   17   38:invokestatic    #223 <Method int Log.e(String, String, Throwable)>
	//   18   41:pop             
			}
			sChildrenDrawingOrderMethod.setAccessible(true);
	//   19   42:getstatic       #908 <Field Method sChildrenDrawingOrderMethod>
	//   20   45:iconst_1        
	//   21   46:invokevirtual   #920 <Method void Method.setAccessible(boolean)>
		}
		try
		{
			sChildrenDrawingOrderMethod.invoke(((Object) (viewgroup)), new Object[] {
				Boolean.valueOf(flag)
			});
	//   22   49:getstatic       #908 <Field Method sChildrenDrawingOrderMethod>
	//   23   52:aload_0         
	//   24   53:iconst_1        
	//   25   54:anewarray       Object[]
	//   26   57:dup             
	//   27   58:iconst_0        
	//   28   59:iload_1         
	//   29   60:invokestatic    #924 <Method Boolean Boolean.valueOf(boolean)>
	//   30   63:aastore         
	//   31   64:invokevirtual   #292 <Method Object Method.invoke(Object, Object[])>
	//   32   67:pop             
			return;
	//   33   68:return          
		}
	//*  34   69:astore_0        
	//*  35   70:ldc1            #80  <String "ViewCompat">
	//*  36   72:ldc2            #926 <String "Unable to invoke childrenDrawingOrderEnabled">
	//*  37   75:aload_0         
	//*  38   76:invokestatic    #223 <Method int Log.e(String, String, Throwable)>
	//*  39   79:pop             
	//*  40   80:return          
	//*  41   81:astore_0        
	//*  42   82:ldc1            #80  <String "ViewCompat">
	//*  43   84:ldc2            #926 <String "Unable to invoke childrenDrawingOrderEnabled">
	//*  44   87:aload_0         
	//*  45   88:invokestatic    #223 <Method int Log.e(String, String, Throwable)>
	//*  46   91:pop             
	//*  47   92:return          
		// Misplaced declaration of an exception variable
		catch(ViewGroup viewgroup)
	//*  48   93:astore_0        
		{
			Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", ((Throwable) (viewgroup)));
	//   49   94:ldc1            #80  <String "ViewCompat">
	//   50   96:ldc2            #926 <String "Unable to invoke childrenDrawingOrderEnabled">
	//   51   99:aload_0         
	//   52  100:invokestatic    #223 <Method int Log.e(String, String, Throwable)>
	//   53  103:pop             
		}
		// Misplaced declaration of an exception variable
		catch(ViewGroup viewgroup)
		{
			Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", ((Throwable) (viewgroup)));
			return;
		}
		// Misplaced declaration of an exception variable
		catch(ViewGroup viewgroup)
		{
			Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", ((Throwable) (viewgroup)));
			return;
		}
	//   54  104:return          
	}

	public static void setClipBounds(View view, Rect rect)
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          13
			view.setClipBounds(rect);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #930 <Method void View.setClipBounds(Rect)>
	//    6   13:return          
	}

	public static void setElevation(View view, float f)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			view.setElevation(f);
	//    3    8:aload_0         
	//    4    9:fload_1         
	//    5   10:invokevirtual   #933 <Method void View.setElevation(float)>
	//    6   13:return          
	}

	public static void setFitsSystemWindows(View view, boolean flag)
	{
		view.setFitsSystemWindows(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #936 <Method void View.setFitsSystemWindows(boolean)>
	//    3    5:return          
	}

	public static void setFocusedByDefault(View view, boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          13
			view.setFocusedByDefault(flag);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #939 <Method void View.setFocusedByDefault(boolean)>
	//    6   13:return          
	}

	public static void setHasTransientState(View view, boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          13
			view.setHasTransientState(flag);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #942 <Method void View.setHasTransientState(boolean)>
	//    6   13:return          
	}

	public static void setImportantForAccessibility(View view, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          14
		{
			view.setImportantForAccessibility(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #945 <Method void View.setImportantForAccessibility(int)>
			return;
	//    6   13:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   7   14:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   17:bipush          16
	//*   9   19:icmplt          36
		{
			int j = i;
	//   10   22:iload_1         
	//   11   23:istore_2        
			if(i == 4)
	//*  12   24:iload_1         
	//*  13   25:iconst_4        
	//*  14   26:icmpne          31
				j = 2;
	//   15   29:iconst_2        
	//   16   30:istore_2        
			view.setImportantForAccessibility(j);
	//   17   31:aload_0         
	//   18   32:iload_2         
	//   19   33:invokevirtual   #945 <Method void View.setImportantForAccessibility(int)>
		}
	//   20   36:return          
	}

	public static void setImportantForAutofill(View view, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          13
			view.setImportantForAutofill(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #948 <Method void View.setImportantForAutofill(int)>
	//    6   13:return          
	}

	public static void setKeyboardNavigationCluster(View view, boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          13
			view.setKeyboardNavigationCluster(flag);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #951 <Method void View.setKeyboardNavigationCluster(boolean)>
	//    6   13:return          
	}

	public static void setLabelFor(View view, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          13
			view.setLabelFor(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #954 <Method void View.setLabelFor(int)>
	//    6   13:return          
	}

	public static void setLayerPaint(View view, Paint paint)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          14
		{
			view.setLayerPaint(paint);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #959 <Method void View.setLayerPaint(Paint)>
			return;
	//    6   13:return          
		} else
		{
			view.setLayerType(view.getLayerType(), paint);
	//    7   14:aload_0         
	//    8   15:aload_0         
	//    9   16:invokevirtual   #480 <Method int View.getLayerType()>
	//   10   19:aload_1         
	//   11   20:invokevirtual   #963 <Method void View.setLayerType(int, Paint)>
			view.invalidate();
	//   12   23:aload_0         
	//   13   24:invokevirtual   #965 <Method void View.invalidate()>
			return;
	//   14   27:return          
		}
	}

	public static void setLayerType(View view, int i, Paint paint)
	{
		view.setLayerType(i, paint);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #963 <Method void View.setLayerType(int, Paint)>
	//    4    6:return          
	}

	public static void setLayoutDirection(View view, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          13
			view.setLayoutDirection(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #969 <Method void View.setLayoutDirection(int)>
	//    6   13:return          
	}

	public static void setNestedScrollingEnabled(View view, boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          14
		{
			view.setNestedScrollingEnabled(flag);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #972 <Method void View.setNestedScrollingEnabled(boolean)>
			return;
	//    6   13:return          
		}
		if(view instanceof NestedScrollingChild)
	//*   7   14:aload_0         
	//*   8   15:instanceof      #307 <Class NestedScrollingChild>
	//*   9   18:ifeq            31
			((NestedScrollingChild)view).setNestedScrollingEnabled(flag);
	//   10   21:aload_0         
	//   11   22:checkcast       #307 <Class NestedScrollingChild>
	//   12   25:iload_1         
	//   13   26:invokeinterface #973 <Method void NestedScrollingChild.setNestedScrollingEnabled(boolean)>
	//   14   31:return          
	}

	public static void setNextClusterForwardId(View view, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          13
			view.setNextClusterForwardId(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #976 <Method void View.setNextClusterForwardId(int)>
	//    6   13:return          
	}

	public static void setOnApplyWindowInsetsListener(View view, OnApplyWindowInsetsListener onapplywindowinsetslistener)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          30
		{
			if(onapplywindowinsetslistener == null)
	//*   3    8:aload_1         
	//*   4    9:ifnonnull       18
			{
				view.setOnApplyWindowInsetsListener(((android.view.View.OnApplyWindowInsetsListener) (null)));
	//    5   12:aload_0         
	//    6   13:aconst_null     
	//    7   14:invokevirtual   #981 <Method void View.setOnApplyWindowInsetsListener(android.view.View$OnApplyWindowInsetsListener)>
				return;
	//    8   17:return          
			}
			view.setOnApplyWindowInsetsListener(new android.view.View.OnApplyWindowInsetsListener(onapplywindowinsetslistener) {

				public WindowInsets onApplyWindowInsets(View view1, WindowInsets windowinsets)
				{
					windowinsets = ((WindowInsets) (WindowInsetsCompat.wrap(((Object) (windowinsets)))));
				//    0    0:aload_2         
				//    1    1:invokestatic    #29  <Method WindowInsetsCompat WindowInsetsCompat.wrap(Object)>
				//    2    4:astore_2        
					return (WindowInsets)WindowInsetsCompat.unwrap(listener.onApplyWindowInsets(view1, ((WindowInsetsCompat) (windowinsets))));
				//    3    5:aload_0         
				//    4    6:getfield        #17  <Field OnApplyWindowInsetsListener val$listener>
				//    5    9:aload_1         
				//    6   10:aload_2         
				//    7   11:invokeinterface #34  <Method WindowInsetsCompat OnApplyWindowInsetsListener.onApplyWindowInsets(View, WindowInsetsCompat)>
				//    8   16:invokestatic    #38  <Method Object WindowInsetsCompat.unwrap(WindowInsetsCompat)>
				//    9   19:checkcast       #40  <Class WindowInsets>
				//   10   22:areturn         
				}

				final OnApplyWindowInsetsListener val$listener;

			
			{
				listener = onapplywindowinsetslistener;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field OnApplyWindowInsetsListener val$listener>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    9   18:aload_0         
	//   10   19:new             #6   <Class ViewCompat$1>
	//   11   22:dup             
	//   12   23:aload_1         
	//   13   24:invokespecial   #984 <Method void ViewCompat$1(OnApplyWindowInsetsListener)>
	//   14   27:invokevirtual   #981 <Method void View.setOnApplyWindowInsetsListener(android.view.View$OnApplyWindowInsetsListener)>
		}
	//   15   30:return          
	}

	public static void setOverScrollMode(View view, int i)
	{
		view.setOverScrollMode(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #987 <Method void View.setOverScrollMode(int)>
	//    3    5:return          
	}

	public static void setPaddingRelative(View view, int i, int j, int k, int l)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          18
		{
			view.setPaddingRelative(i, j, k, l);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:iload_2         
	//    6   11:iload_3         
	//    7   12:iload           4
	//    8   14:invokevirtual   #990 <Method void View.setPaddingRelative(int, int, int, int)>
			return;
	//    9   17:return          
		} else
		{
			view.setPadding(i, j, k, l);
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:iload_2         
	//   13   21:iload_3         
	//   14   22:iload           4
	//   15   24:invokevirtual   #993 <Method void View.setPadding(int, int, int, int)>
			return;
	//   16   27:return          
		}
	}

	public static void setPivotX(View view, float f)
	{
		view.setPivotX(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokevirtual   #996 <Method void View.setPivotX(float)>
	//    3    5:return          
	}

	public static void setPivotY(View view, float f)
	{
		view.setPivotY(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokevirtual   #999 <Method void View.setPivotY(float)>
	//    3    5:return          
	}

	public static void setPointerIcon(View view, PointerIconCompat pointericoncompat)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          30
		{
			if(pointericoncompat != null)
	//*   3    8:aload_1         
	//*   4    9:ifnull          20
				pointericoncompat = ((PointerIconCompat) (pointericoncompat.getPointerIcon()));
	//    5   12:aload_1         
	//    6   13:invokevirtual   #1006 <Method Object PointerIconCompat.getPointerIcon()>
	//    7   16:astore_1        
			else
	//*   8   17:goto            22
				pointericoncompat = null;
	//    9   20:aconst_null     
	//   10   21:astore_1        
			view.setPointerIcon((PointerIcon)pointericoncompat);
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:checkcast       #1008 <Class PointerIcon>
	//   14   27:invokevirtual   #1011 <Method void View.setPointerIcon(PointerIcon)>
		}
	//   15   30:return          
	}

	public static void setRotation(View view, float f)
	{
		view.setRotation(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokevirtual   #1014 <Method void View.setRotation(float)>
	//    3    5:return          
	}

	public static void setRotationX(View view, float f)
	{
		view.setRotationX(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokevirtual   #1017 <Method void View.setRotationX(float)>
	//    3    5:return          
	}

	public static void setRotationY(View view, float f)
	{
		view.setRotationY(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokevirtual   #1020 <Method void View.setRotationY(float)>
	//    3    5:return          
	}

	public static void setSaveFromParentEnabled(View view, boolean flag)
	{
		view.setSaveFromParentEnabled(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #1023 <Method void View.setSaveFromParentEnabled(boolean)>
	//    3    5:return          
	}

	public static void setScaleX(View view, float f)
	{
		view.setScaleX(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokevirtual   #1026 <Method void View.setScaleX(float)>
	//    3    5:return          
	}

	public static void setScaleY(View view, float f)
	{
		view.setScaleY(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokevirtual   #1029 <Method void View.setScaleY(float)>
	//    3    5:return          
	}

	public static void setScrollIndicators(View view, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          13
			view.setScrollIndicators(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #1032 <Method void View.setScrollIndicators(int)>
	//    6   13:return          
	}

	public static void setScrollIndicators(View view, int i, int j)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          14
			view.setScrollIndicators(i, j);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:iload_2         
	//    6   11:invokevirtual   #1036 <Method void View.setScrollIndicators(int, int)>
	//    7   14:return          
	}

	public static void setTooltipText(View view, CharSequence charsequence)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          13
			view.setTooltipText(charsequence);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #1041 <Method void View.setTooltipText(CharSequence)>
	//    6   13:return          
	}

	public static void setTransitionName(View view, String s)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          14
		{
			view.setTransitionName(s);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #1045 <Method void View.setTransitionName(String)>
			return;
	//    6   13:return          
		}
		if(sTransitionNameMap == null)
	//*   7   14:getstatic       #587 <Field WeakHashMap sTransitionNameMap>
	//*   8   17:ifnonnull       30
			sTransitionNameMap = new WeakHashMap();
	//    9   20:new             #187 <Class WeakHashMap>
	//   10   23:dup             
	//   11   24:invokespecial   #188 <Method void WeakHashMap()>
	//   12   27:putstatic       #587 <Field WeakHashMap sTransitionNameMap>
		sTransitionNameMap.put(((Object) (view)), ((Object) (s)));
	//   13   30:getstatic       #587 <Field WeakHashMap sTransitionNameMap>
	//   14   33:aload_0         
	//   15   34:aload_1         
	//   16   35:invokevirtual   #197 <Method Object WeakHashMap.put(Object, Object)>
	//   17   38:pop             
	//   18   39:return          
	}

	public static void setTranslationX(View view, float f)
	{
		view.setTranslationX(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokevirtual   #1048 <Method void View.setTranslationX(float)>
	//    3    5:return          
	}

	public static void setTranslationY(View view, float f)
	{
		view.setTranslationY(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokevirtual   #1051 <Method void View.setTranslationY(float)>
	//    3    5:return          
	}

	public static void setTranslationZ(View view, float f)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			view.setTranslationZ(f);
	//    3    8:aload_0         
	//    4    9:fload_1         
	//    5   10:invokevirtual   #1054 <Method void View.setTranslationZ(float)>
	//    6   13:return          
	}

	public static void setX(View view, float f)
	{
		view.setX(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokevirtual   #1057 <Method void View.setX(float)>
	//    3    5:return          
	}

	public static void setY(View view, float f)
	{
		view.setY(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokevirtual   #1060 <Method void View.setY(float)>
	//    3    5:return          
	}

	public static void setZ(View view, float f)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			view.setZ(f);
	//    3    8:aload_0         
	//    4    9:fload_1         
	//    5   10:invokevirtual   #1063 <Method void View.setZ(float)>
	//    6   13:return          
	}

	public static boolean startDragAndDrop(View view, ClipData clipdata, android.view.View.DragShadowBuilder dragshadowbuilder, Object obj, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          18
			return view.startDragAndDrop(clipdata, dragshadowbuilder, obj, i);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:aload_3         
	//    7   12:iload           4
	//    8   14:invokevirtual   #1068 <Method boolean View.startDragAndDrop(ClipData, android.view.View$DragShadowBuilder, Object, int)>
	//    9   17:ireturn         
		else
			return view.startDrag(clipdata, dragshadowbuilder, obj, i);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:aload_3         
	//   14   22:iload           4
	//   15   24:invokevirtual   #1071 <Method boolean View.startDrag(ClipData, android.view.View$DragShadowBuilder, Object, int)>
	//   16   27:ireturn         
	}

	public static boolean startNestedScroll(View view, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          14
			return view.startNestedScroll(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #1074 <Method boolean View.startNestedScroll(int)>
	//    6   13:ireturn         
		if(view instanceof NestedScrollingChild)
	//*   7   14:aload_0         
	//*   8   15:instanceof      #307 <Class NestedScrollingChild>
	//*   9   18:ifeq            32
			return ((NestedScrollingChild)view).startNestedScroll(i);
	//   10   21:aload_0         
	//   11   22:checkcast       #307 <Class NestedScrollingChild>
	//   12   25:iload_1         
	//   13   26:invokeinterface #1075 <Method boolean NestedScrollingChild.startNestedScroll(int)>
	//   14   31:ireturn         
		else
			return false;
	//   15   32:iconst_0        
	//   16   33:ireturn         
	}

	public static boolean startNestedScroll(View view, int i, int j)
	{
		if(view instanceof NestedScrollingChild2)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #324 <Class NestedScrollingChild2>
	//*   2    4:ifeq            19
			return ((NestedScrollingChild2)view).startNestedScroll(i, j);
	//    3    7:aload_0         
	//    4    8:checkcast       #324 <Class NestedScrollingChild2>
	//    5   11:iload_1         
	//    6   12:iload_2         
	//    7   13:invokeinterface #1078 <Method boolean NestedScrollingChild2.startNestedScroll(int, int)>
	//    8   18:ireturn         
		if(j == 0)
	//*   9   19:iload_2         
	//*  10   20:ifne            29
			return startNestedScroll(view, i);
	//   11   23:aload_0         
	//   12   24:iload_1         
	//   13   25:invokestatic    #1080 <Method boolean startNestedScroll(View, int)>
	//   14   28:ireturn         
		else
			return false;
	//   15   29:iconst_0        
	//   16   30:ireturn         
	}

	public static void stopNestedScroll(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
		{
			view.stopNestedScroll();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #1083 <Method void View.stopNestedScroll()>
			return;
	//    5   12:return          
		}
		if(view instanceof NestedScrollingChild)
	//*   6   13:aload_0         
	//*   7   14:instanceof      #307 <Class NestedScrollingChild>
	//*   8   17:ifeq            29
			((NestedScrollingChild)view).stopNestedScroll();
	//    9   20:aload_0         
	//   10   21:checkcast       #307 <Class NestedScrollingChild>
	//   11   24:invokeinterface #1084 <Method void NestedScrollingChild.stopNestedScroll()>
	//   12   29:return          
	}

	public static void stopNestedScroll(View view, int i)
	{
		if(view instanceof NestedScrollingChild2)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #324 <Class NestedScrollingChild2>
	//*   2    4:ifeq            18
		{
			((NestedScrollingChild2)view).stopNestedScroll(i);
	//    3    7:aload_0         
	//    4    8:checkcast       #324 <Class NestedScrollingChild2>
	//    5   11:iload_1         
	//    6   12:invokeinterface #1086 <Method void NestedScrollingChild2.stopNestedScroll(int)>
			return;
	//    7   17:return          
		}
		if(i == 0)
	//*   8   18:iload_1         
	//*   9   19:ifne            26
			stopNestedScroll(view);
	//   10   22:aload_0         
	//   11   23:invokestatic    #1088 <Method void stopNestedScroll(View)>
	//   12   26:return          
	}

	private static void tickleInvalidationFlag(View view)
	{
		float f = view.getTranslationY();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #595 <Method float View.getTranslationY()>
	//    2    4:fstore_1        
		view.setTranslationY(1.0F + f);
	//    3    5:aload_0         
	//    4    6:fconst_1        
	//    5    7:fload_1         
	//    6    8:fadd            
	//    7    9:invokevirtual   #1051 <Method void View.setTranslationY(float)>
		view.setTranslationY(f);
	//    8   12:aload_0         
	//    9   13:fload_1         
	//   10   14:invokevirtual   #1051 <Method void View.setTranslationY(float)>
	//   11   17:return          
	}

	public static void updateDragShadow(View view, android.view.View.DragShadowBuilder dragshadowbuilder)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          13
			view.updateDragShadow(dragshadowbuilder);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #1093 <Method void View.updateDragShadow(android.view.View$DragShadowBuilder)>
	//    6   13:return          
	}

	public static final int ACCESSIBILITY_LIVE_REGION_ASSERTIVE = 2;
	public static final int ACCESSIBILITY_LIVE_REGION_NONE = 0;
	public static final int ACCESSIBILITY_LIVE_REGION_POLITE = 1;
	public static final int IMPORTANT_FOR_ACCESSIBILITY_AUTO = 0;
	public static final int IMPORTANT_FOR_ACCESSIBILITY_NO = 2;
	public static final int IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS = 4;
	public static final int IMPORTANT_FOR_ACCESSIBILITY_YES = 1;
	public static final int LAYER_TYPE_HARDWARE = 2;
	public static final int LAYER_TYPE_NONE = 0;
	public static final int LAYER_TYPE_SOFTWARE = 1;
	public static final int LAYOUT_DIRECTION_INHERIT = 2;
	public static final int LAYOUT_DIRECTION_LOCALE = 3;
	public static final int LAYOUT_DIRECTION_LTR = 0;
	public static final int LAYOUT_DIRECTION_RTL = 1;
	public static final int MEASURED_HEIGHT_STATE_SHIFT = 16;
	public static final int MEASURED_SIZE_MASK = 0xffffff;
	public static final int MEASURED_STATE_MASK = 0xff000000;
	public static final int MEASURED_STATE_TOO_SMALL = 0x1000000;
	public static final int OVER_SCROLL_ALWAYS = 0;
	public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;
	public static final int OVER_SCROLL_NEVER = 2;
	public static final int SCROLL_AXIS_HORIZONTAL = 1;
	public static final int SCROLL_AXIS_NONE = 0;
	public static final int SCROLL_AXIS_VERTICAL = 2;
	public static final int SCROLL_INDICATOR_BOTTOM = 2;
	public static final int SCROLL_INDICATOR_END = 32;
	public static final int SCROLL_INDICATOR_LEFT = 4;
	public static final int SCROLL_INDICATOR_RIGHT = 8;
	public static final int SCROLL_INDICATOR_START = 16;
	public static final int SCROLL_INDICATOR_TOP = 1;
	private static final String TAG = "ViewCompat";
	public static final int TYPE_NON_TOUCH = 1;
	public static final int TYPE_TOUCH = 0;
	private static boolean sAccessibilityDelegateCheckFailed = false;
	private static Field sAccessibilityDelegateField;
	private static Method sChildrenDrawingOrderMethod;
	private static Method sDispatchFinishTemporaryDetach;
	private static Method sDispatchStartTemporaryDetach;
	private static Field sMinHeightField;
	private static boolean sMinHeightFieldFetched;
	private static Field sMinWidthField;
	private static boolean sMinWidthFieldFetched;
	private static final AtomicInteger sNextGeneratedId = new AtomicInteger(1);
	private static boolean sTempDetachBound;
	private static ThreadLocal sThreadLocalRect;
	private static WeakHashMap sTransitionNameMap;
	private static WeakHashMap sViewPropertyAnimatorMap = null;

	static 
	{
	//    0    0:new             #109 <Class AtomicInteger>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:invokespecial   #113 <Method void AtomicInteger(int)>
	//    4    8:putstatic       #115 <Field AtomicInteger sNextGeneratedId>
	//    5   11:aconst_null     
	//    6   12:putstatic       #117 <Field WeakHashMap sViewPropertyAnimatorMap>
	//    7   15:iconst_0        
	//    8   16:putstatic       #119 <Field boolean sAccessibilityDelegateCheckFailed>
	//*   9   19:return          
	}
}
