// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.util.SparseArray;
import android.view.*;
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package android.support.v4.view:
//			ViewCompat

static class ViewCompat$UnhandledKeyEventManager
{

	static ViewCompat$UnhandledKeyEventManager at(View view)
	{
		ViewCompat$UnhandledKeyEventManager viewcompat$unhandledkeyeventmanager1 = (ViewCompat$UnhandledKeyEventManager)view.getTag(android.support.compat.R.id.tag_unhandled_key_event_manager);
	//    0    0:aload_0         
	//    1    1:getstatic       #45  <Field int android.support.compat.R$id.tag_unhandled_key_event_manager>
	//    2    4:invokevirtual   #51  <Method Object View.getTag(int)>
	//    3    7:checkcast       #2   <Class ViewCompat$UnhandledKeyEventManager>
	//    4   10:astore_2        
		ViewCompat$UnhandledKeyEventManager viewcompat$unhandledkeyeventmanager = viewcompat$unhandledkeyeventmanager1;
	//    5   11:aload_2         
	//    6   12:astore_1        
		if(viewcompat$unhandledkeyeventmanager1 == null)
	//*   7   13:aload_2         
	//*   8   14:ifnonnull       33
		{
			viewcompat$unhandledkeyeventmanager = new ViewCompat$UnhandledKeyEventManager();
	//    9   17:new             #2   <Class ViewCompat$UnhandledKeyEventManager>
	//   10   20:dup             
	//   11   21:invokespecial   #52  <Method void ViewCompat$UnhandledKeyEventManager()>
	//   12   24:astore_1        
			view.setTag(android.support.compat.R.id.tag_unhandled_key_event_manager, ((Object) (viewcompat$unhandledkeyeventmanager)));
	//   13   25:aload_0         
	//   14   26:getstatic       #45  <Field int android.support.compat.R$id.tag_unhandled_key_event_manager>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #56  <Method void View.setTag(int, Object)>
		}
		return viewcompat$unhandledkeyeventmanager;
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
				if(((erCompat)arraylist.get(i)).onUnhandledKeyEvent(view, keyevent))
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

	ViewCompat$UnhandledKeyEventManager()
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
