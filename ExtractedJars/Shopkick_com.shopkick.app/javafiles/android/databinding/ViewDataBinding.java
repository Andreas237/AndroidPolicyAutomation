// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.util.LongSparseArray;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

// Referenced classes of package android.databinding:
//			BaseObservable, DataBindingUtil, CallbackRegistry, DataBindingComponent, 
//			InverseBindingListener, OnRebindCallback, Observable, ObservableList, 
//			ObservableMap

public abstract class ViewDataBinding extends BaseObservable
{
	private static interface CreateWeakListener
	{

		public abstract WeakListener create(ViewDataBinding viewdatabinding, int i);
	}

	protected static class IncludedLayouts
	{

		public void setIncludes(int i, String as[], int ai[], int ai1[])
		{
			layouts[i] = as;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field String[][] layouts>
		//    2    4:iload_1         
		//    3    5:aload_2         
		//    4    6:aastore         
			indexes[i] = ai;
		//    5    7:aload_0         
		//    6    8:getfield        #25  <Field int[][] indexes>
		//    7   11:iload_1         
		//    8   12:aload_3         
		//    9   13:aastore         
			layoutIds[i] = ai1;
		//   10   14:aload_0         
		//   11   15:getfield        #27  <Field int[][] layoutIds>
		//   12   18:iload_1         
		//   13   19:aload           4
		//   14   21:aastore         
		//   15   22:return          
		}

		public final int indexes[][];
		public final int layoutIds[][];
		public final String layouts[][];

		public IncludedLayouts(int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			layouts = new String[i][];
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:anewarray       String[][]
		//    5    9:putfield        #21  <Field String[][] layouts>
			indexes = new int[i][];
		//    6   12:aload_0         
		//    7   13:iload_1         
		//    8   14:anewarray       int[][]
		//    9   17:putfield        #25  <Field int[][] indexes>
			layoutIds = new int[i][];
		//   10   20:aload_0         
		//   11   21:iload_1         
		//   12   22:anewarray       int[][]
		//   13   25:putfield        #27  <Field int[][] layoutIds>
		//   14   28:return          
		}
	}

	private static class LiveDataListener
		implements Observer, ObservableReference
	{

		public void addListener(LiveData livedata)
		{
			LifecycleOwner lifecycleowner = mLifecycleOwner;
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field LifecycleOwner mLifecycleOwner>
		//    2    4:astore_2        
			if(lifecycleowner != null)
		//*   3    5:aload_2         
		//*   4    6:ifnull          15
				livedata.observe(lifecycleowner, ((Observer) (this)));
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:aload_0         
		//    8   12:invokevirtual   #40  <Method void LiveData.observe(LifecycleOwner, Observer)>
		//    9   15:return          
		}

		public volatile void addListener(Object obj)
		{
			addListener((LiveData)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #36  <Class LiveData>
		//    3    5:invokevirtual   #45  <Method void addListener(LiveData)>
		//    4    8:return          
		}

		public WeakListener getListener()
		{
			return mListener;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field ViewDataBinding$WeakListener mListener>
		//    2    4:areturn         
		}

		public void onChanged(Object obj)
		{
			mListener.getBinder().handleFieldChange(mListener.mLocalFieldId, mListener.getTarget(), 0);
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field ViewDataBinding$WeakListener mListener>
		//    2    4:invokevirtual   #54  <Method ViewDataBinding ViewDataBinding$WeakListener.getBinder()>
		//    3    7:aload_0         
		//    4    8:getfield        #29  <Field ViewDataBinding$WeakListener mListener>
		//    5   11:getfield        #58  <Field int ViewDataBinding$WeakListener.mLocalFieldId>
		//    6   14:aload_0         
		//    7   15:getfield        #29  <Field ViewDataBinding$WeakListener mListener>
		//    8   18:invokevirtual   #62  <Method Object ViewDataBinding$WeakListener.getTarget()>
		//    9   21:iconst_0        
		//   10   22:invokestatic    #66  <Method void ViewDataBinding.access$800(ViewDataBinding, int, Object, int)>
		//   11   25:return          
		}

		public void removeListener(LiveData livedata)
		{
			livedata.removeObserver(((Observer) (this)));
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokevirtual   #72  <Method void LiveData.removeObserver(Observer)>
		//    3    5:return          
		}

		public volatile void removeListener(Object obj)
		{
			removeListener((LiveData)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #36  <Class LiveData>
		//    3    5:invokevirtual   #74  <Method void removeListener(LiveData)>
		//    4    8:return          
		}

		public void setLifecycleOwner(LifecycleOwner lifecycleowner)
		{
			LiveData livedata = (LiveData)mListener.getTarget();
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field ViewDataBinding$WeakListener mListener>
		//    2    4:invokevirtual   #62  <Method Object ViewDataBinding$WeakListener.getTarget()>
		//    3    7:checkcast       #36  <Class LiveData>
		//    4   10:astore_2        
			if(livedata != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          37
			{
				if(mLifecycleOwner != null)
		//*   7   15:aload_0         
		//*   8   16:getfield        #34  <Field LifecycleOwner mLifecycleOwner>
		//*   9   19:ifnull          27
					livedata.removeObserver(((Observer) (this)));
		//   10   22:aload_2         
		//   11   23:aload_0         
		//   12   24:invokevirtual   #72  <Method void LiveData.removeObserver(Observer)>
				if(lifecycleowner != null)
		//*  13   27:aload_1         
		//*  14   28:ifnull          37
					livedata.observe(lifecycleowner, ((Observer) (this)));
		//   15   31:aload_2         
		//   16   32:aload_1         
		//   17   33:aload_0         
		//   18   34:invokevirtual   #40  <Method void LiveData.observe(LifecycleOwner, Observer)>
			}
			mLifecycleOwner = lifecycleowner;
		//   19   37:aload_0         
		//   20   38:aload_1         
		//   21   39:putfield        #34  <Field LifecycleOwner mLifecycleOwner>
		//   22   42:return          
		}

		LifecycleOwner mLifecycleOwner;
		final WeakListener mListener;

		public LiveDataListener(ViewDataBinding viewdatabinding, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			mListener = new WeakListener(viewdatabinding, i, ((ObservableReference) (this)));
		//    2    4:aload_0         
		//    3    5:new             #24  <Class ViewDataBinding$WeakListener>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:iload_2         
		//    7   11:aload_0         
		//    8   12:invokespecial   #27  <Method void ViewDataBinding$WeakListener(ViewDataBinding, int, ViewDataBinding$ObservableReference)>
		//    9   15:putfield        #29  <Field ViewDataBinding$WeakListener mListener>
		//   10   18:return          
		}
	}

	private static interface ObservableReference
	{

		public abstract void addListener(Object obj);

		public abstract WeakListener getListener();

		public abstract void removeListener(Object obj);

		public abstract void setLifecycleOwner(LifecycleOwner lifecycleowner);
	}

	public class OnStartListener
		implements LifecycleObserver
	{

		public void onStart()
		{
			executePendingBindings();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field ViewDataBinding this$0>
		//    2    4:invokevirtual   #30  <Method void ViewDataBinding.executePendingBindings()>
		//    3    7:return          
		}

		final ViewDataBinding this$0;

		private OnStartListener()
		{
			this$0 = ViewDataBinding.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field ViewDataBinding this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}

	protected static abstract class PropertyChangedInverseListener extends Observable.OnPropertyChangedCallback
		implements InverseBindingListener
	{

		public void onPropertyChanged(Observable observable, int i)
		{
			if(i == mPropertyId || i == 0)
		//*   0    0:iload_2         
		//*   1    1:aload_0         
		//*   2    2:getfield        #18  <Field int mPropertyId>
		//*   3    5:icmpeq          12
		//*   4    8:iload_2         
		//*   5    9:ifne            16
				onChange();
		//    6   12:aload_0         
		//    7   13:invokevirtual   #24  <Method void onChange()>
		//    8   16:return          
		}

		final int mPropertyId;

		public PropertyChangedInverseListener(int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Observable$OnPropertyChangedCallback()>
			mPropertyId = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #18  <Field int mPropertyId>
		//    5    9:return          
		}
	}

	private static class WeakListListener extends ObservableList.OnListChangedCallback
		implements ObservableReference
	{

		public void addListener(ObservableList observablelist)
		{
			observablelist.addOnListChangedCallback(((ObservableList.OnListChangedCallback) (this)));
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokeinterface #34  <Method void ObservableList.addOnListChangedCallback(ObservableList$OnListChangedCallback)>
		//    3    7:return          
		}

		public volatile void addListener(Object obj)
		{
			addListener((ObservableList)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #30  <Class ObservableList>
		//    3    5:invokevirtual   #37  <Method void addListener(ObservableList)>
		//    4    8:return          
		}

		public WeakListener getListener()
		{
			return mListener;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field ViewDataBinding$WeakListener mListener>
		//    2    4:areturn         
		}

		public void onChanged(ObservableList observablelist)
		{
			ViewDataBinding viewdatabinding = mListener.getBinder();
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field ViewDataBinding$WeakListener mListener>
		//    2    4:invokevirtual   #46  <Method ViewDataBinding ViewDataBinding$WeakListener.getBinder()>
		//    3    7:astore_2        
			if(viewdatabinding == null)
		//*   4    8:aload_2         
		//*   5    9:ifnonnull       13
				return;
		//    6   12:return          
			ObservableList observablelist1 = (ObservableList)mListener.getTarget();
		//    7   13:aload_0         
		//    8   14:getfield        #25  <Field ViewDataBinding$WeakListener mListener>
		//    9   17:invokevirtual   #50  <Method Object ViewDataBinding$WeakListener.getTarget()>
		//   10   20:checkcast       #30  <Class ObservableList>
		//   11   23:astore_3        
			if(observablelist1 != observablelist)
		//*  12   24:aload_3         
		//*  13   25:aload_1         
		//*  14   26:if_acmpeq       30
			{
				return;
		//   15   29:return          
			} else
			{
				viewdatabinding.handleFieldChange(mListener.mLocalFieldId, ((Object) (observablelist1)), 0);
		//   16   30:aload_2         
		//   17   31:aload_0         
		//   18   32:getfield        #25  <Field ViewDataBinding$WeakListener mListener>
		//   19   35:getfield        #54  <Field int ViewDataBinding$WeakListener.mLocalFieldId>
		//   20   38:aload_3         
		//   21   39:iconst_0        
		//   22   40:invokestatic    #58  <Method void ViewDataBinding.access$800(ViewDataBinding, int, Object, int)>
				return;
		//   23   43:return          
			}
		}

		public void onItemRangeChanged(ObservableList observablelist, int i, int j)
		{
			onChanged(observablelist);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #62  <Method void onChanged(ObservableList)>
		//    3    5:return          
		}

		public void onItemRangeInserted(ObservableList observablelist, int i, int j)
		{
			onChanged(observablelist);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #62  <Method void onChanged(ObservableList)>
		//    3    5:return          
		}

		public void onItemRangeMoved(ObservableList observablelist, int i, int j, int k)
		{
			onChanged(observablelist);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #62  <Method void onChanged(ObservableList)>
		//    3    5:return          
		}

		public void onItemRangeRemoved(ObservableList observablelist, int i, int j)
		{
			onChanged(observablelist);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #62  <Method void onChanged(ObservableList)>
		//    3    5:return          
		}

		public void removeListener(ObservableList observablelist)
		{
			observablelist.removeOnListChangedCallback(((ObservableList.OnListChangedCallback) (this)));
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokeinterface #70  <Method void ObservableList.removeOnListChangedCallback(ObservableList$OnListChangedCallback)>
		//    3    7:return          
		}

		public volatile void removeListener(Object obj)
		{
			removeListener((ObservableList)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #30  <Class ObservableList>
		//    3    5:invokevirtual   #72  <Method void removeListener(ObservableList)>
		//    4    8:return          
		}

		public void setLifecycleOwner(LifecycleOwner lifecycleowner)
		{
		//    0    0:return          
		}

		final WeakListener mListener;

		public WeakListListener(ViewDataBinding viewdatabinding, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void ObservableList$OnListChangedCallback()>
			mListener = new WeakListener(viewdatabinding, i, ((ObservableReference) (this)));
		//    2    4:aload_0         
		//    3    5:new             #20  <Class ViewDataBinding$WeakListener>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:iload_2         
		//    7   11:aload_0         
		//    8   12:invokespecial   #23  <Method void ViewDataBinding$WeakListener(ViewDataBinding, int, ViewDataBinding$ObservableReference)>
		//    9   15:putfield        #25  <Field ViewDataBinding$WeakListener mListener>
		//   10   18:return          
		}
	}

	private static class WeakListener extends WeakReference
	{

		protected ViewDataBinding getBinder()
		{
			ViewDataBinding viewdatabinding = (ViewDataBinding)get();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #38  <Method Object get()>
		//    2    4:checkcast       #7   <Class ViewDataBinding>
		//    3    7:astore_1        
			if(viewdatabinding == null)
		//*   4    8:aload_1         
		//*   5    9:ifnonnull       17
				unregister();
		//    6   12:aload_0         
		//    7   13:invokevirtual   #42  <Method boolean unregister()>
		//    8   16:pop             
			return viewdatabinding;
		//    9   17:aload_1         
		//   10   18:areturn         
		}

		public Object getTarget()
		{
			return mTarget;
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field Object mTarget>
		//    2    4:areturn         
		}

		public void setLifecycleOwner(LifecycleOwner lifecycleowner)
		{
			mObservable.setLifecycleOwner(lifecycleowner);
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field ViewDataBinding$ObservableReference mObservable>
		//    2    4:aload_1         
		//    3    5:invokeinterface #52  <Method void ViewDataBinding$ObservableReference.setLifecycleOwner(LifecycleOwner)>
		//    4   10:return          
		}

		public void setTarget(Object obj)
		{
			unregister();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #42  <Method boolean unregister()>
		//    2    4:pop             
			mTarget = obj;
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:putfield        #45  <Field Object mTarget>
			obj = mTarget;
		//    6   10:aload_0         
		//    7   11:getfield        #45  <Field Object mTarget>
		//    8   14:astore_1        
			if(obj != null)
		//*   9   15:aload_1         
		//*  10   16:ifnull          29
				mObservable.addListener(obj);
		//   11   19:aload_0         
		//   12   20:getfield        #29  <Field ViewDataBinding$ObservableReference mObservable>
		//   13   23:aload_1         
		//   14   24:invokeinterface #57  <Method void ViewDataBinding$ObservableReference.addListener(Object)>
		//   15   29:return          
		}

		public boolean unregister()
		{
			Object obj = mTarget;
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field Object mTarget>
		//    2    4:astore_2        
			boolean flag;
			if(obj != null)
		//*   3    5:aload_2         
		//*   4    6:ifnull          24
			{
				mObservable.removeListener(obj);
		//    5    9:aload_0         
		//    6   10:getfield        #29  <Field ViewDataBinding$ObservableReference mObservable>
		//    7   13:aload_2         
		//    8   14:invokeinterface #61  <Method void ViewDataBinding$ObservableReference.removeListener(Object)>
				flag = true;
		//    9   19:iconst_1        
		//   10   20:istore_1        
			} else
		//*  11   21:goto            26
			{
				flag = false;
		//   12   24:iconst_0        
		//   13   25:istore_1        
			}
			mTarget = null;
		//   14   26:aload_0         
		//   15   27:aconst_null     
		//   16   28:putfield        #45  <Field Object mTarget>
			return flag;
		//   17   31:iload_1         
		//   18   32:ireturn         
		}

		protected final int mLocalFieldId;
		private final ObservableReference mObservable;
		private Object mTarget;

		public WeakListener(ViewDataBinding viewdatabinding, int i, ObservableReference observablereference)
		{
			super(((Object) (viewdatabinding)), ViewDataBinding.sReferenceQueue);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #22  <Method ReferenceQueue ViewDataBinding.access$700()>
		//    3    5:invokespecial   #25  <Method void WeakReference(Object, ReferenceQueue)>
			mLocalFieldId = i;
		//    4    8:aload_0         
		//    5    9:iload_2         
		//    6   10:putfield        #27  <Field int mLocalFieldId>
			mObservable = observablereference;
		//    7   13:aload_0         
		//    8   14:aload_3         
		//    9   15:putfield        #29  <Field ViewDataBinding$ObservableReference mObservable>
		//   10   18:return          
		}
	}

	private static class WeakMapListener extends ObservableMap.OnMapChangedCallback
		implements ObservableReference
	{

		public void addListener(ObservableMap observablemap)
		{
			observablemap.addOnMapChangedCallback(((ObservableMap.OnMapChangedCallback) (this)));
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokeinterface #34  <Method void ObservableMap.addOnMapChangedCallback(ObservableMap$OnMapChangedCallback)>
		//    3    7:return          
		}

		public volatile void addListener(Object obj)
		{
			addListener((ObservableMap)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #30  <Class ObservableMap>
		//    3    5:invokevirtual   #37  <Method void addListener(ObservableMap)>
		//    4    8:return          
		}

		public WeakListener getListener()
		{
			return mListener;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field ViewDataBinding$WeakListener mListener>
		//    2    4:areturn         
		}

		public void onMapChanged(ObservableMap observablemap, Object obj)
		{
			obj = ((Object) (mListener.getBinder()));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field ViewDataBinding$WeakListener mListener>
		//    2    4:invokevirtual   #47  <Method ViewDataBinding ViewDataBinding$WeakListener.getBinder()>
		//    3    7:astore_2        
			if(obj != null)
		//*   4    8:aload_2         
		//*   5    9:ifnull          38
			{
				if(observablemap != mListener.getTarget())
		//*   6   12:aload_1         
		//*   7   13:aload_0         
		//*   8   14:getfield        #25  <Field ViewDataBinding$WeakListener mListener>
		//*   9   17:invokevirtual   #51  <Method Object ViewDataBinding$WeakListener.getTarget()>
		//*  10   20:if_acmpeq       24
				{
					return;
		//   11   23:return          
				} else
				{
					((ViewDataBinding) (obj)).handleFieldChange(mListener.mLocalFieldId, ((Object) (observablemap)), 0);
		//   12   24:aload_2         
		//   13   25:aload_0         
		//   14   26:getfield        #25  <Field ViewDataBinding$WeakListener mListener>
		//   15   29:getfield        #55  <Field int ViewDataBinding$WeakListener.mLocalFieldId>
		//   16   32:aload_1         
		//   17   33:iconst_0        
		//   18   34:invokestatic    #59  <Method void ViewDataBinding.access$800(ViewDataBinding, int, Object, int)>
					return;
		//   19   37:return          
				}
			} else
			{
				return;
		//   20   38:return          
			}
		}

		public void removeListener(ObservableMap observablemap)
		{
			observablemap.removeOnMapChangedCallback(((ObservableMap.OnMapChangedCallback) (this)));
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokeinterface #63  <Method void ObservableMap.removeOnMapChangedCallback(ObservableMap$OnMapChangedCallback)>
		//    3    7:return          
		}

		public volatile void removeListener(Object obj)
		{
			removeListener((ObservableMap)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #30  <Class ObservableMap>
		//    3    5:invokevirtual   #65  <Method void removeListener(ObservableMap)>
		//    4    8:return          
		}

		public void setLifecycleOwner(LifecycleOwner lifecycleowner)
		{
		//    0    0:return          
		}

		final WeakListener mListener;

		public WeakMapListener(ViewDataBinding viewdatabinding, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void ObservableMap$OnMapChangedCallback()>
			mListener = new WeakListener(viewdatabinding, i, ((ObservableReference) (this)));
		//    2    4:aload_0         
		//    3    5:new             #20  <Class ViewDataBinding$WeakListener>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:iload_2         
		//    7   11:aload_0         
		//    8   12:invokespecial   #23  <Method void ViewDataBinding$WeakListener(ViewDataBinding, int, ViewDataBinding$ObservableReference)>
		//    9   15:putfield        #25  <Field ViewDataBinding$WeakListener mListener>
		//   10   18:return          
		}
	}

	private static class WeakPropertyListener extends Observable.OnPropertyChangedCallback
		implements ObservableReference
	{

		public void addListener(Observable observable)
		{
			observable.addOnPropertyChangedCallback(((Observable.OnPropertyChangedCallback) (this)));
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokeinterface #34  <Method void Observable.addOnPropertyChangedCallback(Observable$OnPropertyChangedCallback)>
		//    3    7:return          
		}

		public volatile void addListener(Object obj)
		{
			addListener((Observable)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #30  <Class Observable>
		//    3    5:invokevirtual   #37  <Method void addListener(Observable)>
		//    4    8:return          
		}

		public WeakListener getListener()
		{
			return mListener;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field ViewDataBinding$WeakListener mListener>
		//    2    4:areturn         
		}

		public void onPropertyChanged(Observable observable, int i)
		{
			ViewDataBinding viewdatabinding = mListener.getBinder();
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field ViewDataBinding$WeakListener mListener>
		//    2    4:invokevirtual   #47  <Method ViewDataBinding ViewDataBinding$WeakListener.getBinder()>
		//    3    7:astore_3        
			if(viewdatabinding == null)
		//*   4    8:aload_3         
		//*   5    9:ifnonnull       13
				return;
		//    6   12:return          
			if((Observable)mListener.getTarget() != observable)
		//*   7   13:aload_0         
		//*   8   14:getfield        #25  <Field ViewDataBinding$WeakListener mListener>
		//*   9   17:invokevirtual   #51  <Method Object ViewDataBinding$WeakListener.getTarget()>
		//*  10   20:checkcast       #30  <Class Observable>
		//*  11   23:aload_1         
		//*  12   24:if_acmpeq       28
			{
				return;
		//   13   27:return          
			} else
			{
				viewdatabinding.handleFieldChange(mListener.mLocalFieldId, ((Object) (observable)), i);
		//   14   28:aload_3         
		//   15   29:aload_0         
		//   16   30:getfield        #25  <Field ViewDataBinding$WeakListener mListener>
		//   17   33:getfield        #55  <Field int ViewDataBinding$WeakListener.mLocalFieldId>
		//   18   36:aload_1         
		//   19   37:iload_2         
		//   20   38:invokestatic    #59  <Method void ViewDataBinding.access$800(ViewDataBinding, int, Object, int)>
				return;
		//   21   41:return          
			}
		}

		public void removeListener(Observable observable)
		{
			observable.removeOnPropertyChangedCallback(((Observable.OnPropertyChangedCallback) (this)));
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokeinterface #63  <Method void Observable.removeOnPropertyChangedCallback(Observable$OnPropertyChangedCallback)>
		//    3    7:return          
		}

		public volatile void removeListener(Object obj)
		{
			removeListener((Observable)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #30  <Class Observable>
		//    3    5:invokevirtual   #65  <Method void removeListener(Observable)>
		//    4    8:return          
		}

		public void setLifecycleOwner(LifecycleOwner lifecycleowner)
		{
		//    0    0:return          
		}

		final WeakListener mListener;

		public WeakPropertyListener(ViewDataBinding viewdatabinding, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Observable$OnPropertyChangedCallback()>
			mListener = new WeakListener(viewdatabinding, i, ((ObservableReference) (this)));
		//    2    4:aload_0         
		//    3    5:new             #20  <Class ViewDataBinding$WeakListener>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:iload_2         
		//    7   11:aload_0         
		//    8   12:invokespecial   #23  <Method void ViewDataBinding$WeakListener(ViewDataBinding, int, ViewDataBinding$ObservableReference)>
		//    9   15:putfield        #25  <Field ViewDataBinding$WeakListener mListener>
		//   10   18:return          
		}
	}


	protected ViewDataBinding(DataBindingComponent databindingcomponent, View view, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #144 <Method void BaseObservable()>
	//    2    4:aload_0         
	//    3    5:new             #18  <Class ViewDataBinding$7>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #147 <Method void ViewDataBinding$7(ViewDataBinding)>
	//    7   13:putfield        #149 <Field Runnable mRebindRunnable>
		mPendingRebind = false;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #151 <Field boolean mPendingRebind>
		mRebindHalted = false;
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:putfield        #153 <Field boolean mRebindHalted>
		mBindingComponent = databindingcomponent;
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:putfield        #155 <Field DataBindingComponent mBindingComponent>
		mLocalFieldObservers = new WeakListener[i];
	//   17   31:aload_0         
	//   18   32:iload_3         
	//   19   33:anewarray       WeakListener[]
	//   20   36:putfield        #157 <Field ViewDataBinding$WeakListener[] mLocalFieldObservers>
		mRoot = view;
	//   21   39:aload_0         
	//   22   40:aload_2         
	//   23   41:putfield        #159 <Field View mRoot>
		if(Looper.myLooper() != null)
	//*  24   44:invokestatic    #165 <Method Looper Looper.myLooper()>
	//*  25   47:ifnull          96
		{
			if(USE_CHOREOGRAPHER)
	//*  26   50:getstatic       #116 <Field boolean USE_CHOREOGRAPHER>
	//*  27   53:ifeq            76
			{
				mChoreographer = Choreographer.getInstance();
	//   28   56:aload_0         
	//   29   57:invokestatic    #171 <Method Choreographer Choreographer.getInstance()>
	//   30   60:putfield        #173 <Field Choreographer mChoreographer>
				mFrameCallback = new android.view.Choreographer.FrameCallback() {

					public void doFrame(long l)
					{
						mRebindRunnable.run();
					//    0    0:aload_0         
					//    1    1:getfield        #16  <Field ViewDataBinding this$0>
					//    2    4:invokestatic    #26  <Method Runnable ViewDataBinding.access$100(ViewDataBinding)>
					//    3    7:invokeinterface #31  <Method void Runnable.run()>
					//    4   12:return          
					}

					final ViewDataBinding this$0;

			
			{
				this$0 = ViewDataBinding.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field ViewDataBinding this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
				}
;
	//   31   63:aload_0         
	//   32   64:new             #20  <Class ViewDataBinding$8>
	//   33   67:dup             
	//   34   68:aload_0         
	//   35   69:invokespecial   #174 <Method void ViewDataBinding$8(ViewDataBinding)>
	//   36   72:putfield        #176 <Field android.view.Choreographer$FrameCallback mFrameCallback>
				return;
	//   37   75:return          
			} else
			{
				mFrameCallback = null;
	//   38   76:aload_0         
	//   39   77:aconst_null     
	//   40   78:putfield        #176 <Field android.view.Choreographer$FrameCallback mFrameCallback>
				mUIThreadHandler = new Handler(Looper.myLooper());
	//   41   81:aload_0         
	//   42   82:new             #178 <Class Handler>
	//   43   85:dup             
	//   44   86:invokestatic    #165 <Method Looper Looper.myLooper()>
	//   45   89:invokespecial   #181 <Method void Handler(Looper)>
	//   46   92:putfield        #183 <Field Handler mUIThreadHandler>
				return;
	//   47   95:return          
			}
		} else
		{
			throw new IllegalStateException("DataBinding must be created in view's UI Thread");
	//   48   96:new             #185 <Class IllegalStateException>
	//   49   99:dup             
	//   50  100:ldc1            #187 <String "DataBinding must be created in view's UI Thread">
	//   51  102:invokespecial   #190 <Method void IllegalStateException(String)>
	//   52  105:athrow          
		}
	}

	protected static ViewDataBinding bind(DataBindingComponent databindingcomponent, View view, int i)
	{
		return DataBindingUtil.bind(databindingcomponent, view, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #217 <Method ViewDataBinding DataBindingUtil.bind(DataBindingComponent, View, int)>
	//    4    6:areturn         
	}

	private void executeBindingsInternal()
	{
		if(mIsExecutingPendingBindings)
	//*   0    0:aload_0         
	//*   1    1:getfield        #220 <Field boolean mIsExecutingPendingBindings>
	//*   2    4:ifeq            12
		{
			requestRebind();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #223 <Method void requestRebind()>
			return;
	//    5   11:return          
		}
		if(!hasPendingBindings())
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #227 <Method boolean hasPendingBindings()>
	//*   8   16:ifne            20
			return;
	//    9   19:return          
		mIsExecutingPendingBindings = true;
	//   10   20:aload_0         
	//   11   21:iconst_1        
	//   12   22:putfield        #220 <Field boolean mIsExecutingPendingBindings>
		mRebindHalted = false;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #153 <Field boolean mRebindHalted>
		CallbackRegistry callbackregistry = mRebindCallbacks;
	//   16   30:aload_0         
	//   17   31:getfield        #229 <Field CallbackRegistry mRebindCallbacks>
	//   18   34:astore_1        
		if(callbackregistry != null)
	//*  19   35:aload_1         
	//*  20   36:ifnull          63
		{
			callbackregistry.notifyCallbacks(((Object) (this)), 1, ((Object) (null)));
	//   21   39:aload_1         
	//   22   40:aload_0         
	//   23   41:iconst_1        
	//   24   42:aconst_null     
	//   25   43:invokevirtual   #235 <Method void CallbackRegistry.notifyCallbacks(Object, int, Object)>
			if(mRebindHalted)
	//*  26   46:aload_0         
	//*  27   47:getfield        #153 <Field boolean mRebindHalted>
	//*  28   50:ifeq            63
				mRebindCallbacks.notifyCallbacks(((Object) (this)), 2, ((Object) (null)));
	//   29   53:aload_0         
	//   30   54:getfield        #229 <Field CallbackRegistry mRebindCallbacks>
	//   31   57:aload_0         
	//   32   58:iconst_2        
	//   33   59:aconst_null     
	//   34   60:invokevirtual   #235 <Method void CallbackRegistry.notifyCallbacks(Object, int, Object)>
		}
		if(!mRebindHalted)
	//*  35   63:aload_0         
	//*  36   64:getfield        #153 <Field boolean mRebindHalted>
	//*  37   67:ifne            90
		{
			executeBindings();
	//   38   70:aload_0         
	//   39   71:invokevirtual   #238 <Method void executeBindings()>
			CallbackRegistry callbackregistry1 = mRebindCallbacks;
	//   40   74:aload_0         
	//   41   75:getfield        #229 <Field CallbackRegistry mRebindCallbacks>
	//   42   78:astore_1        
			if(callbackregistry1 != null)
	//*  43   79:aload_1         
	//*  44   80:ifnull          90
				callbackregistry1.notifyCallbacks(((Object) (this)), 3, ((Object) (null)));
	//   45   83:aload_1         
	//   46   84:aload_0         
	//   47   85:iconst_3        
	//   48   86:aconst_null     
	//   49   87:invokevirtual   #235 <Method void CallbackRegistry.notifyCallbacks(Object, int, Object)>
		}
		mIsExecutingPendingBindings = false;
	//   50   90:aload_0         
	//   51   91:iconst_0        
	//   52   92:putfield        #220 <Field boolean mIsExecutingPendingBindings>
	//   53   95:return          
	}

	protected static void executeBindingsOn(ViewDataBinding viewdatabinding)
	{
		viewdatabinding.executeBindingsInternal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #241 <Method void executeBindingsInternal()>
	//    2    4:return          
	}

	private static int findIncludeIndex(String s, int i, IncludedLayouts includedlayouts, int j)
	{
		s = ((String) (s.subSequence(s.indexOf('/') + 1, s.length() - 2)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:bipush          47
	//    3    4:invokevirtual   #249 <Method int String.indexOf(int)>
	//    4    7:iconst_1        
	//    5    8:iadd            
	//    6    9:aload_0         
	//    7   10:invokevirtual   #253 <Method int String.length()>
	//    8   13:iconst_2        
	//    9   14:isub            
	//   10   15:invokevirtual   #257 <Method CharSequence String.subSequence(int, int)>
	//   11   18:astore_0        
		includedlayouts = ((IncludedLayouts) (includedlayouts.layouts[j]));
	//   12   19:aload_2         
	//   13   20:getfield        #261 <Field String[][] ViewDataBinding$IncludedLayouts.layouts>
	//   14   23:iload_3         
	//   15   24:aaload          
	//   16   25:astore_2        
		for(j = includedlayouts.length; i < j; i++)
	//*  17   26:aload_2         
	//*  18   27:arraylength     
	//*  19   28:istore_3        
	//*  20   29:iload_1         
	//*  21   30:iload_3         
	//*  22   31:icmpge          53
			if(TextUtils.equals(((CharSequence) (s)), ((CharSequence) (includedlayouts[i]))))
	//*  23   34:aload_0         
	//*  24   35:aload_2         
	//*  25   36:iload_1         
	//*  26   37:aaload          
	//*  27   38:invokestatic    #267 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//*  28   41:ifeq            46
				return i;
	//   29   44:iload_1         
	//   30   45:ireturn         

	//   31   46:iload_1         
	//   32   47:iconst_1        
	//   33   48:iadd            
	//   34   49:istore_1        
	//*  35   50:goto            29
		return -1;
	//   36   53:iconst_m1       
	//   37   54:ireturn         
	}

	private static int findLastMatching(ViewGroup viewgroup, int i)
	{
		String s = (String)viewgroup.getChildAt(i).getTag();
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #275 <Method View ViewGroup.getChildAt(int)>
	//    3    5:invokevirtual   #281 <Method Object View.getTag()>
	//    4    8:checkcast       #245 <Class String>
	//    5   11:astore          7
		String s1 = s.substring(0, s.length() - 1);
	//    6   13:aload           7
	//    7   15:iconst_0        
	//    8   16:aload           7
	//    9   18:invokevirtual   #253 <Method int String.length()>
	//   10   21:iconst_1        
	//   11   22:isub            
	//   12   23:invokevirtual   #285 <Method String String.substring(int, int)>
	//   13   26:astore          8
		int i1 = s1.length();
	//   14   28:aload           8
	//   15   30:invokevirtual   #253 <Method int String.length()>
	//   16   33:istore          4
		int j1 = viewgroup.getChildCount();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #288 <Method int ViewGroup.getChildCount()>
	//   19   39:istore          5
		int k = i + 1;
	//   20   41:iload_1         
	//   21   42:iconst_1        
	//   22   43:iadd            
	//   23   44:istore_3        
		int j = i;
	//   24   45:iload_1         
	//   25   46:istore_2        
		for(i = k; i < j1;)
	//*  26   47:iload_3         
	//*  27   48:istore_1        
	//*  28   49:iload_1         
	//*  29   50:iload           5
	//*  30   52:icmpge          163
		{
			Object obj = ((Object) (viewgroup.getChildAt(i)));
	//   31   55:aload_0         
	//   32   56:iload_1         
	//   33   57:invokevirtual   #275 <Method View ViewGroup.getChildAt(int)>
	//   34   60:astore          6
			if(((View) (obj)).getTag() instanceof String)
	//*  35   62:aload           6
	//*  36   64:invokevirtual   #281 <Method Object View.getTag()>
	//*  37   67:instanceof      #245 <Class String>
	//*  38   70:ifeq            86
				obj = ((Object) ((String)((View) (obj)).getTag()));
	//   39   73:aload           6
	//   40   75:invokevirtual   #281 <Method Object View.getTag()>
	//   41   78:checkcast       #245 <Class String>
	//   42   81:astore          6
			else
	//*  43   83:goto            89
				obj = null;
	//   44   86:aconst_null     
	//   45   87:astore          6
			int l = j;
	//   46   89:iload_2         
	//   47   90:istore_3        
			if(obj != null)
	//*  48   91:aload           6
	//*  49   93:ifnull          154
			{
				l = j;
	//   50   96:iload_2         
	//   51   97:istore_3        
				if(((String) (obj)).startsWith(s1))
	//*  52   98:aload           6
	//*  53  100:aload           8
	//*  54  102:invokevirtual   #292 <Method boolean String.startsWith(String)>
	//*  55  105:ifeq            154
				{
					if(((String) (obj)).length() == s.length() && ((String) (obj)).charAt(((String) (obj)).length() - 1) == '0')
	//*  56  108:aload           6
	//*  57  110:invokevirtual   #253 <Method int String.length()>
	//*  58  113:aload           7
	//*  59  115:invokevirtual   #253 <Method int String.length()>
	//*  60  118:icmpne          140
	//*  61  121:aload           6
	//*  62  123:aload           6
	//*  63  125:invokevirtual   #253 <Method int String.length()>
	//*  64  128:iconst_1        
	//*  65  129:isub            
	//*  66  130:invokevirtual   #296 <Method char String.charAt(int)>
	//*  67  133:bipush          48
	//*  68  135:icmpne          140
						return j;
	//   69  138:iload_2         
	//   70  139:ireturn         
					l = j;
	//   71  140:iload_2         
	//   72  141:istore_3        
					if(isNumeric(((String) (obj)), i1))
	//*  73  142:aload           6
	//*  74  144:iload           4
	//*  75  146:invokestatic    #300 <Method boolean isNumeric(String, int)>
	//*  76  149:ifeq            154
						l = i;
	//   77  152:iload_1         
	//   78  153:istore_3        
				}
			}
			i++;
	//   79  154:iload_1         
	//   80  155:iconst_1        
	//   81  156:iadd            
	//   82  157:istore_1        
			j = l;
	//   83  158:iload_3         
	//   84  159:istore_2        
		}

	//*  85  160:goto            49
		return j;
	//   86  163:iload_2         
	//   87  164:ireturn         
	}

	static ViewDataBinding getBinding(View view)
	{
		if(view != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          15
			return (ViewDataBinding)view.getTag(com.android.databinding.library.R.id.dataBinding);
	//    2    4:aload_0         
	//    3    5:getstatic       #307 <Field int com.android.databinding.library.R$id.dataBinding>
	//    4    8:invokevirtual   #310 <Method Object View.getTag(int)>
	//    5   11:checkcast       #2   <Class ViewDataBinding>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public static int getBuildSdkInt()
	{
		return SDK_INT;
	//    0    0:getstatic       #112 <Field int SDK_INT>
	//    1    3:ireturn         
	}

	protected static int getColorFromResource(View view, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #111 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          17
			return view.getContext().getColor(i);
	//    3    8:aload_0         
	//    4    9:invokevirtual   #317 <Method Context View.getContext()>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #322 <Method int Context.getColor(int)>
	//    7   16:ireturn         
		else
			return view.getResources().getColor(i);
	//    8   17:aload_0         
	//    9   18:invokevirtual   #326 <Method Resources View.getResources()>
	//   10   21:iload_1         
	//   11   22:invokevirtual   #329 <Method int Resources.getColor(int)>
	//   12   25:ireturn         
	}

	protected static ColorStateList getColorStateListFromResource(View view, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #111 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          17
			return view.getContext().getColorStateList(i);
	//    3    8:aload_0         
	//    4    9:invokevirtual   #317 <Method Context View.getContext()>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #335 <Method ColorStateList Context.getColorStateList(int)>
	//    7   16:areturn         
		else
			return view.getResources().getColorStateList(i);
	//    8   17:aload_0         
	//    9   18:invokevirtual   #326 <Method Resources View.getResources()>
	//   10   21:iload_1         
	//   11   22:invokevirtual   #336 <Method ColorStateList Resources.getColorStateList(int)>
	//   12   25:areturn         
	}

	protected static Drawable getDrawableFromResource(View view, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #111 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          17
			return view.getContext().getDrawable(i);
	//    3    8:aload_0         
	//    4    9:invokevirtual   #317 <Method Context View.getContext()>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #342 <Method Drawable Context.getDrawable(int)>
	//    7   16:areturn         
		else
			return view.getResources().getDrawable(i);
	//    8   17:aload_0         
	//    9   18:invokevirtual   #326 <Method Resources View.getResources()>
	//   10   21:iload_1         
	//   11   22:invokevirtual   #343 <Method Drawable Resources.getDrawable(int)>
	//   12   25:areturn         
	}

	protected static Object getFrom(Map map, Object obj)
	{
		if(map == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return map.get(obj);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokeinterface #351 <Method Object Map.get(Object)>
	//    7   13:areturn         
	}

	protected static byte getFromArray(byte abyte0[], int i)
	{
		if(abyte0 != null && i >= 0 && i < abyte0.length)
	//*   0    0:aload_0         
	//*   1    1:ifnull          21
	//*   2    4:iload_1         
	//*   3    5:iflt            21
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:arraylength     
	//*   7   11:icmplt          17
	//*   8   14:goto            21
			return abyte0[i];
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:baload          
	//   12   20:ireturn         
		else
			return 0;
	//   13   21:iconst_0        
	//   14   22:ireturn         
	}

	protected static char getFromArray(char ac[], int i)
	{
		if(ac != null && i >= 0 && i < ac.length)
	//*   0    0:aload_0         
	//*   1    1:ifnull          21
	//*   2    4:iload_1         
	//*   3    5:iflt            21
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:arraylength     
	//*   7   11:icmplt          17
	//*   8   14:goto            21
			return ac[i];
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:caload          
	//   12   20:ireturn         
		else
			return '\0';
	//   13   21:iconst_0        
	//   14   22:ireturn         
	}

	protected static double getFromArray(double ad[], int i)
	{
		if(ad != null && i >= 0 && i < ad.length)
	//*   0    0:aload_0         
	//*   1    1:ifnull          21
	//*   2    4:iload_1         
	//*   3    5:iflt            21
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:arraylength     
	//*   7   11:icmplt          17
	//*   8   14:goto            21
			return ad[i];
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:daload          
	//   12   20:dreturn         
		else
			return 0.0D;
	//   13   21:dconst_0        
	//   14   22:dreturn         
	}

	protected static float getFromArray(float af[], int i)
	{
		if(af != null && i >= 0 && i < af.length)
	//*   0    0:aload_0         
	//*   1    1:ifnull          21
	//*   2    4:iload_1         
	//*   3    5:iflt            21
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:arraylength     
	//*   7   11:icmplt          17
	//*   8   14:goto            21
			return af[i];
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:faload          
	//   12   20:freturn         
		else
			return 0.0F;
	//   13   21:fconst_0        
	//   14   22:freturn         
	}

	protected static int getFromArray(int ai[], int i)
	{
		if(ai != null && i >= 0 && i < ai.length)
	//*   0    0:aload_0         
	//*   1    1:ifnull          21
	//*   2    4:iload_1         
	//*   3    5:iflt            21
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:arraylength     
	//*   7   11:icmplt          17
	//*   8   14:goto            21
			return ai[i];
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:iaload          
	//   12   20:ireturn         
		else
			return 0;
	//   13   21:iconst_0        
	//   14   22:ireturn         
	}

	protected static long getFromArray(long al[], int i)
	{
		if(al != null && i >= 0 && i < al.length)
	//*   0    0:aload_0         
	//*   1    1:ifnull          21
	//*   2    4:iload_1         
	//*   3    5:iflt            21
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:arraylength     
	//*   7   11:icmplt          17
	//*   8   14:goto            21
			return al[i];
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:laload          
	//   12   20:lreturn         
		else
			return 0L;
	//   13   21:lconst_0        
	//   14   22:lreturn         
	}

	protected static Object getFromArray(Object aobj[], int i)
	{
		if(aobj != null && i >= 0 && i < aobj.length)
	//*   0    0:aload_0         
	//*   1    1:ifnull          21
	//*   2    4:iload_1         
	//*   3    5:iflt            21
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:arraylength     
	//*   7   11:icmplt          17
	//*   8   14:goto            21
			return aobj[i];
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:aaload          
	//   12   20:areturn         
		else
			return ((Object) (null));
	//   13   21:aconst_null     
	//   14   22:areturn         
	}

	protected static short getFromArray(short aword0[], int i)
	{
		if(aword0 != null && i >= 0 && i < aword0.length)
	//*   0    0:aload_0         
	//*   1    1:ifnull          21
	//*   2    4:iload_1         
	//*   3    5:iflt            21
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:arraylength     
	//*   7   11:icmplt          17
	//*   8   14:goto            21
			return aword0[i];
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:saload          
	//   12   20:ireturn         
		else
			return 0;
	//   13   21:iconst_0        
	//   14   22:ireturn         
	}

	protected static boolean getFromArray(boolean aflag[], int i)
	{
		if(aflag != null && i >= 0 && i < aflag.length)
	//*   0    0:aload_0         
	//*   1    1:ifnull          21
	//*   2    4:iload_1         
	//*   3    5:iflt            21
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:arraylength     
	//*   7   11:icmplt          17
	//*   8   14:goto            21
			return aflag[i];
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:baload          
	//   12   20:ireturn         
		else
			return false;
	//   13   21:iconst_0        
	//   14   22:ireturn         
	}

	protected static int getFromList(SparseIntArray sparseintarray, int i)
	{
		if(sparseintarray != null && i >= 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          17
	//*   2    4:iload_1         
	//*   3    5:ifge            11
	//*   4    8:goto            17
			return sparseintarray.get(i);
	//    5   11:aload_0         
	//    6   12:iload_1         
	//    7   13:invokevirtual   #370 <Method int SparseIntArray.get(int)>
	//    8   16:ireturn         
		else
			return 0;
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	protected static long getFromList(SparseLongArray sparselongarray, int i)
	{
		if(sparselongarray != null && i >= 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          17
	//*   2    4:iload_1         
	//*   3    5:ifge            11
	//*   4    8:goto            17
			return sparselongarray.get(i);
	//    5   11:aload_0         
	//    6   12:iload_1         
	//    7   13:invokevirtual   #379 <Method long SparseLongArray.get(int)>
	//    8   16:lreturn         
		else
			return 0L;
	//    9   17:lconst_0        
	//   10   18:lreturn         
	}

	protected static Object getFromList(LongSparseArray longsparsearray, int i)
	{
		if(longsparsearray != null && i >= 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          18
	//*   2    4:iload_1         
	//*   3    5:ifge            11
	//*   4    8:goto            18
			return longsparsearray.get(i);
	//    5   11:aload_0         
	//    6   12:iload_1         
	//    7   13:i2l             
	//    8   14:invokevirtual   #386 <Method Object LongSparseArray.get(long)>
	//    9   17:areturn         
		else
			return ((Object) (null));
	//   10   18:aconst_null     
	//   11   19:areturn         
	}

	protected static Object getFromList(android.util.LongSparseArray longsparsearray, int i)
	{
		if(longsparsearray != null && i >= 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          18
	//*   2    4:iload_1         
	//*   3    5:ifge            11
	//*   4    8:goto            18
			return longsparsearray.get(i);
	//    5   11:aload_0         
	//    6   12:iload_1         
	//    7   13:i2l             
	//    8   14:invokevirtual   #392 <Method Object android.util.LongSparseArray.get(long)>
	//    9   17:areturn         
		else
			return ((Object) (null));
	//   10   18:aconst_null     
	//   11   19:areturn         
	}

	protected static Object getFromList(SparseArray sparsearray, int i)
	{
		if(sparsearray != null && i >= 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          17
	//*   2    4:iload_1         
	//*   3    5:ifge            11
	//*   4    8:goto            17
			return sparsearray.get(i);
	//    5   11:aload_0         
	//    6   12:iload_1         
	//    7   13:invokevirtual   #398 <Method Object SparseArray.get(int)>
	//    8   16:areturn         
		else
			return ((Object) (null));
	//    9   17:aconst_null     
	//   10   18:areturn         
	}

	protected static Object getFromList(List list, int i)
	{
		if(list != null && i >= 0 && i < list.size())
	//*   0    0:aload_0         
	//*   1    1:ifnull          29
	//*   2    4:iload_1         
	//*   3    5:iflt            29
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:invokeinterface #405 <Method int List.size()>
	//*   7   15:icmplt          21
	//*   8   18:goto            29
			return list.get(i);
	//    9   21:aload_0         
	//   10   22:iload_1         
	//   11   23:invokeinterface #406 <Method Object List.get(int)>
	//   12   28:areturn         
		else
			return ((Object) (null));
	//   13   29:aconst_null     
	//   14   30:areturn         
	}

	protected static boolean getFromList(SparseBooleanArray sparsebooleanarray, int i)
	{
		if(sparsebooleanarray != null && i >= 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          17
	//*   2    4:iload_1         
	//*   3    5:ifge            11
	//*   4    8:goto            17
			return sparsebooleanarray.get(i);
	//    5   11:aload_0         
	//    6   12:iload_1         
	//    7   13:invokevirtual   #413 <Method boolean SparseBooleanArray.get(int)>
	//    8   16:ireturn         
		else
			return false;
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	private void handleFieldChange(int i, Object obj, int j)
	{
		if(mInLiveDataRegisterObserver)
	//*   0    0:aload_0         
	//*   1    1:getfield        #415 <Field boolean mInLiveDataRegisterObserver>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(onFieldChange(i, obj, j))
	//*   4    8:aload_0         
	//*   5    9:iload_1         
	//*   6   10:aload_2         
	//*   7   11:iload_3         
	//*   8   12:invokevirtual   #419 <Method boolean onFieldChange(int, Object, int)>
	//*   9   15:ifeq            22
			requestRebind();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #223 <Method void requestRebind()>
	//   12   22:return          
	}

	private static boolean isNumeric(String s, int i)
	{
		int k = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #253 <Method int String.length()>
	//    2    4:istore_3        
		int j = i;
	//    3    5:iload_1         
	//    4    6:istore_2        
		if(k == i)
	//*   5    7:iload_3         
	//*   6    8:iload_1         
	//*   7    9:icmpne          14
			return false;
	//    8   12:iconst_0        
	//    9   13:ireturn         
		for(; j < k; j++)
	//*  10   14:iload_2         
	//*  11   15:iload_3         
	//*  12   16:icmpge          39
			if(!Character.isDigit(s.charAt(j)))
	//*  13   19:aload_0         
	//*  14   20:iload_2         
	//*  15   21:invokevirtual   #296 <Method char String.charAt(int)>
	//*  16   24:invokestatic    #425 <Method boolean Character.isDigit(char)>
	//*  17   27:ifne            32
				return false;
	//   18   30:iconst_0        
	//   19   31:ireturn         

	//   20   32:iload_2         
	//   21   33:iconst_1        
	//   22   34:iadd            
	//   23   35:istore_2        
	//*  24   36:goto            14
		return true;
	//   25   39:iconst_1        
	//   26   40:ireturn         
	}

	private static void mapBindings(DataBindingComponent databindingcomponent, View view, Object aobj[], IncludedLayouts includedlayouts, SparseIntArray sparseintarray, boolean flag)
	{
		int i;
		int j;
label0:
		{
			if(getBinding(view) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #429 <Method ViewDataBinding getBinding(View)>
	//*   2    4:ifnull          8
				return;
	//    3    7:return          
			Object obj = view.getTag();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #281 <Method Object View.getTag()>
	//    6   12:astore          14
			if(obj instanceof String)
	//*   7   14:aload           14
	//*   8   16:instanceof      #245 <Class String>
	//*   9   19:ifeq            32
				obj = ((Object) ((String)obj));
	//   10   22:aload           14
	//   11   24:checkcast       #245 <Class String>
	//   12   27:astore          14
			else
	//*  13   29:goto            35
				obj = null;
	//   14   32:aconst_null     
	//   15   33:astore          14
			if(flag && obj != null && ((String) (obj)).startsWith("layout"))
	//*  16   35:iload           5
	//*  17   37:ifeq            133
	//*  18   40:aload           14
	//*  19   42:ifnull          133
	//*  20   45:aload           14
	//*  21   47:ldc2            #431 <String "layout">
	//*  22   50:invokevirtual   #292 <Method boolean String.startsWith(String)>
	//*  23   53:ifeq            133
			{
				i = ((String) (obj)).lastIndexOf('_');
	//   24   56:aload           14
	//   25   58:bipush          95
	//   26   60:invokevirtual   #434 <Method int String.lastIndexOf(int)>
	//   27   63:istore          6
				if(i > 0)
	//*  28   65:iload           6
	//*  29   67:ifle            124
				{
					i++;
	//   30   70:iload           6
	//   31   72:iconst_1        
	//   32   73:iadd            
	//   33   74:istore          6
					if(isNumeric(((String) (obj)), i))
	//*  34   76:aload           14
	//*  35   78:iload           6
	//*  36   80:invokestatic    #300 <Method boolean isNumeric(String, int)>
	//*  37   83:ifeq            124
					{
						i = parseTagInt(((String) (obj)), i);
	//   38   86:aload           14
	//   39   88:iload           6
	//   40   90:invokestatic    #438 <Method int parseTagInt(String, int)>
	//   41   93:istore          6
						if(aobj[i] == null)
	//*  42   95:aload_2         
	//*  43   96:iload           6
	//*  44   98:aaload          
	//*  45   99:ifnonnull       107
							aobj[i] = ((Object) (view));
	//   46  102:aload_2         
	//   47  103:iload           6
	//   48  105:aload_1         
	//   49  106:aastore         
						if(includedlayouts == null)
	//*  50  107:aload_3         
	//*  51  108:ifnonnull       114
							i = -1;
	//   52  111:iconst_m1       
	//   53  112:istore          6
						j = i;
	//   54  114:iload           6
	//   55  116:istore          7
						i = 1;
	//   56  118:iconst_1        
	//   57  119:istore          6
						break label0;
	//   58  121:goto            130
					}
				}
				j = -1;
	//   59  124:iconst_m1       
	//   60  125:istore          7
				i = 0;
	//   61  127:iconst_0        
	//   62  128:istore          6
			} else
	//*  63  130:goto            193
			if(obj != null && ((String) (obj)).startsWith("binding_"))
	//*  64  133:aload           14
	//*  65  135:ifnull          187
	//*  66  138:aload           14
	//*  67  140:ldc1            #56  <String "binding_">
	//*  68  142:invokevirtual   #292 <Method boolean String.startsWith(String)>
	//*  69  145:ifeq            187
			{
				i = parseTagInt(((String) (obj)), BINDING_NUMBER_START);
	//   70  148:aload           14
	//   71  150:getstatic       #114 <Field int BINDING_NUMBER_START>
	//   72  153:invokestatic    #438 <Method int parseTagInt(String, int)>
	//   73  156:istore          6
				if(aobj[i] == null)
	//*  74  158:aload_2         
	//*  75  159:iload           6
	//*  76  161:aaload          
	//*  77  162:ifnonnull       170
					aobj[i] = ((Object) (view));
	//   78  165:aload_2         
	//   79  166:iload           6
	//   80  168:aload_1         
	//   81  169:aastore         
				if(includedlayouts == null)
	//*  82  170:aload_3         
	//*  83  171:ifnonnull       177
					i = -1;
	//   84  174:iconst_m1       
	//   85  175:istore          6
				j = i;
	//   86  177:iload           6
	//   87  179:istore          7
				i = 1;
	//   88  181:iconst_1        
	//   89  182:istore          6
			} else
	//*  90  184:goto            193
			{
				j = -1;
	//   91  187:iconst_m1       
	//   92  188:istore          7
				i = 0;
	//   93  190:iconst_0        
	//   94  191:istore          6
			}
		}
label1:
		{
			if(i == 0)
	//*  95  193:iload           6
	//*  96  195:ifne            241
			{
				i = view.getId();
	//   97  198:aload_1         
	//   98  199:invokevirtual   #441 <Method int View.getId()>
	//   99  202:istore          6
				if(i > 0 && sparseintarray != null)
	//* 100  204:iload           6
	//* 101  206:ifle            241
	//* 102  209:aload           4
	//* 103  211:ifnull          241
				{
					i = sparseintarray.get(i, -1);
	//  104  214:aload           4
	//  105  216:iload           6
	//  106  218:iconst_m1       
	//  107  219:invokevirtual   #444 <Method int SparseIntArray.get(int, int)>
	//  108  222:istore          6
					if(i >= 0 && aobj[i] == null)
	//* 109  224:iload           6
	//* 110  226:iflt            241
	//* 111  229:aload_2         
	//* 112  230:iload           6
	//* 113  232:aaload          
	//* 114  233:ifnonnull       241
						aobj[i] = ((Object) (view));
	//  115  236:aload_2         
	//  116  237:iload           6
	//  117  239:aload_1         
	//  118  240:aastore         
				}
			}
			if(!(view instanceof ViewGroup))
				break label1;
	//  119  241:aload_1         
	//  120  242:instanceof      #271 <Class ViewGroup>
	//  121  245:ifeq            554
			view = ((View) ((ViewGroup)view));
	//  122  248:aload_1         
	//  123  249:checkcast       #271 <Class ViewGroup>
	//  124  252:astore_1        
			int j1 = ((ViewGroup) (view)).getChildCount();
	//  125  253:aload_1         
	//  126  254:invokevirtual   #288 <Method int ViewGroup.getChildCount()>
	//  127  257:istore          11
			i = 0;
	//  128  259:iconst_0        
	//  129  260:istore          6
			int k = 0;
	//  130  262:iconst_0        
	//  131  263:istore          8
			int l;
			for(; i < j1; i = l)
	//* 132  265:iload           6
	//* 133  267:iload           11
	//* 134  269:icmpge          554
			{
				View view1;
label2:
				{
					view1 = ((ViewGroup) (view)).getChildAt(i);
	//  135  272:aload_1         
	//  136  273:iload           6
	//  137  275:invokevirtual   #275 <Method View ViewGroup.getChildAt(int)>
	//  138  278:astore          14
					if(j >= 0 && (view1.getTag() instanceof String))
	//* 139  280:iload           7
	//* 140  282:iflt            510
	//* 141  285:aload           14
	//* 142  287:invokevirtual   #281 <Method Object View.getTag()>
	//* 143  290:instanceof      #245 <Class String>
	//* 144  293:ifeq            510
					{
						String s = (String)view1.getTag();
	//  145  296:aload           14
	//  146  298:invokevirtual   #281 <Method Object View.getTag()>
	//  147  301:checkcast       #245 <Class String>
	//  148  304:astore          15
						if(s.endsWith("_0") && s.startsWith("layout") && s.indexOf('/') > 0)
	//* 149  306:aload           15
	//* 150  308:ldc2            #446 <String "_0">
	//* 151  311:invokevirtual   #449 <Method boolean String.endsWith(String)>
	//* 152  314:ifeq            510
	//* 153  317:aload           15
	//* 154  319:ldc2            #431 <String "layout">
	//* 155  322:invokevirtual   #292 <Method boolean String.startsWith(String)>
	//* 156  325:ifeq            510
	//* 157  328:aload           15
	//* 158  330:bipush          47
	//* 159  332:invokevirtual   #249 <Method int String.indexOf(int)>
	//* 160  335:ifle            510
						{
							l = findIncludeIndex(s, k, includedlayouts, j);
	//  161  338:aload           15
	//  162  340:iload           8
	//  163  342:aload_3         
	//  164  343:iload           7
	//  165  345:invokestatic    #451 <Method int findIncludeIndex(String, int, ViewDataBinding$IncludedLayouts, int)>
	//  166  348:istore          9
							if(l >= 0)
	//* 167  350:iload           9
	//* 168  352:iflt            510
							{
								k = l + 1;
	//  169  355:iload           9
	//  170  357:iconst_1        
	//  171  358:iadd            
	//  172  359:istore          8
								int i1 = includedlayouts.indexes[j][l];
	//  173  361:aload_3         
	//  174  362:getfield        #455 <Field int[][] ViewDataBinding$IncludedLayouts.indexes>
	//  175  365:iload           7
	//  176  367:aaload          
	//  177  368:iload           9
	//  178  370:iaload          
	//  179  371:istore          10
								int k1 = includedlayouts.layoutIds[j][l];
	//  180  373:aload_3         
	//  181  374:getfield        #458 <Field int[][] ViewDataBinding$IncludedLayouts.layoutIds>
	//  182  377:iload           7
	//  183  379:aaload          
	//  184  380:iload           9
	//  185  382:iaload          
	//  186  383:istore          12
								l = findLastMatching(((ViewGroup) (view)), i);
	//  187  385:aload_1         
	//  188  386:iload           6
	//  189  388:invokestatic    #460 <Method int findLastMatching(ViewGroup, int)>
	//  190  391:istore          9
								if(l == i)
	//* 191  393:iload           9
	//* 192  395:iload           6
	//* 193  397:icmpne          430
								{
									aobj[i1] = ((Object) (DataBindingUtil.bind(databindingcomponent, view1, k1)));
	//  194  400:aload_2         
	//  195  401:iload           10
	//  196  403:aload_0         
	//  197  404:aload           14
	//  198  406:iload           12
	//  199  408:invokestatic    #217 <Method ViewDataBinding DataBindingUtil.bind(DataBindingComponent, View, int)>
	//  200  411:aastore         
									i1 = k;
	//  201  412:iload           8
	//  202  414:istore          10
									k = 1;
	//  203  416:iconst_1        
	//  204  417:istore          8
									l = i;
	//  205  419:iload           6
	//  206  421:istore          9
									i = i1;
	//  207  423:iload           10
	//  208  425:istore          6
								} else
	//* 209  427:goto            521
								{
									int l1 = (l - i) + 1;
	//  210  430:iload           9
	//  211  432:iload           6
	//  212  434:isub            
	//  213  435:iconst_1        
	//  214  436:iadd            
	//  215  437:istore          13
									View aview[] = new View[l1];
	//  216  439:iload           13
	//  217  441:anewarray       View[]
	//  218  444:astore          15
									for(l = 0; l < l1; l++)
	//* 219  446:iconst_0        
	//* 220  447:istore          9
	//* 221  449:iload           9
	//* 222  451:iload           13
	//* 223  453:icmpge          479
										aview[l] = ((ViewGroup) (view)).getChildAt(i + l);
	//  224  456:aload           15
	//  225  458:iload           9
	//  226  460:aload_1         
	//  227  461:iload           6
	//  228  463:iload           9
	//  229  465:iadd            
	//  230  466:invokevirtual   #275 <Method View ViewGroup.getChildAt(int)>
	//  231  469:aastore         

	//  232  470:iload           9
	//  233  472:iconst_1        
	//  234  473:iadd            
	//  235  474:istore          9
	//* 236  476:goto            449
									aobj[i1] = ((Object) (DataBindingUtil.bind(databindingcomponent, aview, k1)));
	//  237  479:aload_2         
	//  238  480:iload           10
	//  239  482:aload_0         
	//  240  483:aload           15
	//  241  485:iload           12
	//  242  487:invokestatic    #463 <Method ViewDataBinding DataBindingUtil.bind(DataBindingComponent, View[], int)>
	//  243  490:aastore         
									l = i + (l1 - 1);
	//  244  491:iload           6
	//  245  493:iload           13
	//  246  495:iconst_1        
	//  247  496:isub            
	//  248  497:iadd            
	//  249  498:istore          9
									i = k;
	//  250  500:iload           8
	//  251  502:istore          6
									k = 1;
	//  252  504:iconst_1        
	//  253  505:istore          8
								}
								break label2;
	//  254  507:goto            521
							}
						}
					}
					l = i;
	//  255  510:iload           6
	//  256  512:istore          9
					i = k;
	//  257  514:iload           8
	//  258  516:istore          6
					k = 0;
	//  259  518:iconst_0        
	//  260  519:istore          8
				}
				if(k == 0)
	//* 261  521:iload           8
	//* 262  523:ifne            537
					mapBindings(databindingcomponent, view1, aobj, includedlayouts, sparseintarray, false);
	//  263  526:aload_0         
	//  264  527:aload           14
	//  265  529:aload_2         
	//  266  530:aload_3         
	//  267  531:aload           4
	//  268  533:iconst_0        
	//  269  534:invokestatic    #465 <Method void mapBindings(DataBindingComponent, View, Object[], ViewDataBinding$IncludedLayouts, SparseIntArray, boolean)>
				l++;
	//  270  537:iload           9
	//  271  539:iconst_1        
	//  272  540:iadd            
	//  273  541:istore          9
				k = i;
	//  274  543:iload           6
	//  275  545:istore          8
			}

	//  276  547:iload           9
	//  277  549:istore          6
		}
	//* 278  551:goto            265
	//  279  554:return          
	}

	protected static Object[] mapBindings(DataBindingComponent databindingcomponent, View view, int i, IncludedLayouts includedlayouts, SparseIntArray sparseintarray)
	{
		Object aobj[] = new Object[i];
	//    0    0:iload_2         
	//    1    1:anewarray       Object[]
	//    2    4:astore          5
		mapBindings(databindingcomponent, view, aobj, includedlayouts, sparseintarray, true);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:aload           5
	//    6   10:aload_3         
	//    7   11:aload           4
	//    8   13:iconst_1        
	//    9   14:invokestatic    #465 <Method void mapBindings(DataBindingComponent, View, Object[], ViewDataBinding$IncludedLayouts, SparseIntArray, boolean)>
		return aobj;
	//   10   17:aload           5
	//   11   19:areturn         
	}

	protected static Object[] mapBindings(DataBindingComponent databindingcomponent, View aview[], int i, IncludedLayouts includedlayouts, SparseIntArray sparseintarray)
	{
		Object aobj[] = new Object[i];
	//    0    0:iload_2         
	//    1    1:anewarray       Object[]
	//    2    4:astore          5
		for(i = 0; i < aview.length; i++)
	//*   3    6:iconst_0        
	//*   4    7:istore_2        
	//*   5    8:iload_2         
	//*   6    9:aload_1         
	//*   7   10:arraylength     
	//*   8   11:icmpge          34
			mapBindings(databindingcomponent, aview[i], aobj, includedlayouts, sparseintarray, true);
	//    9   14:aload_0         
	//   10   15:aload_1         
	//   11   16:iload_2         
	//   12   17:aaload          
	//   13   18:aload           5
	//   14   20:aload_3         
	//   15   21:aload           4
	//   16   23:iconst_1        
	//   17   24:invokestatic    #465 <Method void mapBindings(DataBindingComponent, View, Object[], ViewDataBinding$IncludedLayouts, SparseIntArray, boolean)>

	//   18   27:iload_2         
	//   19   28:iconst_1        
	//   20   29:iadd            
	//   21   30:istore_2        
	//*  22   31:goto            8
		return aobj;
	//   23   34:aload           5
	//   24   36:areturn         
	}

	protected static byte parse(String s, byte byte0)
	{
		byte byte1;
		try
		{
			byte1 = Byte.parseByte(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #479 <Method byte Byte.parseByte(String)>
	//    2    4:istore_2        
		}
	//*   3    5:iload_2         
	//*   4    6:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   5    7:astore_0        
		{
			return byte0;
	//    6    8:iload_1         
	//    7    9:ireturn         
		}
		return byte1;
	}

	protected static char parse(String s, char c)
	{
		if(s != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          19
		{
			if(s.isEmpty())
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #483 <Method boolean String.isEmpty()>
	//*   4    8:ifeq            13
				return c;
	//    5   11:iload_1         
	//    6   12:ireturn         
			else
				return s.charAt(0);
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:invokevirtual   #296 <Method char String.charAt(int)>
	//   10   18:ireturn         
		} else
		{
			return c;
	//   11   19:iload_1         
	//   12   20:ireturn         
		}
	}

	protected static double parse(String s, double d)
	{
		double d1;
		try
		{
			d1 = Double.parseDouble(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #490 <Method double Double.parseDouble(String)>
	//    2    4:dstore_3        
		}
	//*   3    5:dload_3         
	//*   4    6:dreturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   5    7:astore_0        
		{
			return d;
	//    6    8:dload_1         
	//    7    9:dreturn         
		}
		return d1;
	}

	protected static float parse(String s, float f)
	{
		float f1;
		try
		{
			f1 = Float.parseFloat(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #497 <Method float Float.parseFloat(String)>
	//    2    4:fstore_2        
		}
	//*   3    5:fload_2         
	//*   4    6:freturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   5    7:astore_0        
		{
			return f;
	//    6    8:fload_1         
	//    7    9:freturn         
		}
		return f1;
	}

	protected static int parse(String s, int i)
	{
		int j;
		try
		{
			j = Integer.parseInt(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #503 <Method int Integer.parseInt(String)>
	//    2    4:istore_2        
		}
	//*   3    5:iload_2         
	//*   4    6:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   5    7:astore_0        
		{
			return i;
	//    6    8:iload_1         
	//    7    9:ireturn         
		}
		return j;
	}

	protected static long parse(String s, long l)
	{
		long l1;
		try
		{
			l1 = Long.parseLong(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #510 <Method long Long.parseLong(String)>
	//    2    4:lstore_3        
		}
	//*   3    5:lload_3         
	//*   4    6:lreturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   5    7:astore_0        
		{
			return l;
	//    6    8:lload_1         
	//    7    9:lreturn         
		}
		return l1;
	}

	protected static short parse(String s, short word0)
	{
		short word1;
		try
		{
			word1 = Short.parseShort(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #517 <Method short Short.parseShort(String)>
	//    2    4:istore_2        
		}
	//*   3    5:iload_2         
	//*   4    6:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   5    7:astore_0        
		{
			return word0;
	//    6    8:iload_1         
	//    7    9:ireturn         
		}
		return word1;
	}

	protected static boolean parse(String s, boolean flag)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return flag;
	//    2    4:iload_1         
	//    3    5:ireturn         
		else
			return Boolean.parseBoolean(s);
	//    4    6:aload_0         
	//    5    7:invokestatic    #523 <Method boolean Boolean.parseBoolean(String)>
	//    6   10:ireturn         
	}

	private static int parseTagInt(String s, int i)
	{
		int k = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #253 <Method int String.length()>
	//    2    4:istore_3        
		int j = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		for(; i < k; i++)
	//*   5    7:iload_1         
	//*   6    8:iload_3         
	//*   7    9:icmpge          33
			j = j * 10 + (s.charAt(i) - 48);
	//    8   12:iload_2         
	//    9   13:bipush          10
	//   10   15:imul            
	//   11   16:aload_0         
	//   12   17:iload_1         
	//   13   18:invokevirtual   #296 <Method char String.charAt(int)>
	//   14   21:bipush          48
	//   15   23:isub            
	//   16   24:iadd            
	//   17   25:istore_2        

	//   18   26:iload_1         
	//   19   27:iconst_1        
	//   20   28:iadd            
	//   21   29:istore_1        
	//*  22   30:goto            7
		return j;
	//   23   33:iload_2         
	//   24   34:ireturn         
	}

	private static void processReferenceQueue()
	{
		do
		{
			java.lang.ref.Reference reference = sReferenceQueue.poll();
	//    0    0:getstatic       #138 <Field ReferenceQueue sReferenceQueue>
	//    1    3:invokevirtual   #527 <Method java.lang.ref.Reference ReferenceQueue.poll()>
	//    2    6:astore_0        
			if(reference == null)
				break;
	//    3    7:aload_0         
	//    4    8:ifnull          29
			if(reference instanceof WeakListener)
	//*   5   11:aload_0         
	//*   6   12:instanceof      #43  <Class ViewDataBinding$WeakListener>
	//*   7   15:ifeq            0
				((WeakListener)reference).unregister();
	//    8   18:aload_0         
	//    9   19:checkcast       #43  <Class ViewDataBinding$WeakListener>
	//   10   22:invokevirtual   #530 <Method boolean ViewDataBinding$WeakListener.unregister()>
	//   11   25:pop             
		} while(true);
	//   12   26:goto            0
	//   13   29:return          
	}

	protected static byte safeUnbox(Byte byte1)
	{
		if(byte1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return 0;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		else
			return byte1.byteValue();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #536 <Method byte Byte.byteValue()>
	//    6   10:ireturn         
	}

	protected static char safeUnbox(Character character)
	{
		if(character == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return '\0';
	//    2    4:iconst_0        
	//    3    5:ireturn         
		else
			return character.charValue();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #541 <Method char Character.charValue()>
	//    6   10:ireturn         
	}

	protected static double safeUnbox(Double double1)
	{
		if(double1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return 0.0D;
	//    2    4:dconst_0        
	//    3    5:dreturn         
		else
			return double1.doubleValue();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #546 <Method double Double.doubleValue()>
	//    6   10:dreturn         
	}

	protected static float safeUnbox(Float float1)
	{
		if(float1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return 0.0F;
	//    2    4:fconst_0        
	//    3    5:freturn         
		else
			return float1.floatValue();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #551 <Method float Float.floatValue()>
	//    6   10:freturn         
	}

	protected static int safeUnbox(Integer integer)
	{
		if(integer == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return 0;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		else
			return integer.intValue();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #555 <Method int Integer.intValue()>
	//    6   10:ireturn         
	}

	protected static long safeUnbox(Long long1)
	{
		if(long1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return 0L;
	//    2    4:lconst_0        
	//    3    5:lreturn         
		else
			return long1.longValue();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #560 <Method long Long.longValue()>
	//    6   10:lreturn         
	}

	protected static short safeUnbox(Short short1)
	{
		if(short1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return 0;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		else
			return short1.shortValue();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #565 <Method short Short.shortValue()>
	//    6   10:ireturn         
	}

	protected static boolean safeUnbox(Boolean boolean1)
	{
		if(boolean1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		else
			return boolean1.booleanValue();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #569 <Method boolean Boolean.booleanValue()>
	//    6   10:ireturn         
	}

	protected static void setBindingInverseListener(ViewDataBinding viewdatabinding, InverseBindingListener inversebindinglistener, PropertyChangedInverseListener propertychangedinverselistener)
	{
		if(inversebindinglistener != propertychangedinverselistener)
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:if_acmpeq       26
		{
			if(inversebindinglistener != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          17
				viewdatabinding.removeOnPropertyChangedCallback(((Observable.OnPropertyChangedCallback) ((PropertyChangedInverseListener)inversebindinglistener)));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:checkcast       #37  <Class ViewDataBinding$PropertyChangedInverseListener>
	//    8   14:invokevirtual   #575 <Method void removeOnPropertyChangedCallback(Observable$OnPropertyChangedCallback)>
			if(propertychangedinverselistener != null)
	//*   9   17:aload_2         
	//*  10   18:ifnull          26
				viewdatabinding.addOnPropertyChangedCallback(((Observable.OnPropertyChangedCallback) (propertychangedinverselistener)));
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:invokevirtual   #578 <Method void addOnPropertyChangedCallback(Observable$OnPropertyChangedCallback)>
		}
	//   14   26:return          
	}

	protected static void setTo(LongSparseArray longsparsearray, int i, Object obj)
	{
		if(longsparsearray != null && i >= 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          25
	//*   2    4:iload_1         
	//*   3    5:iflt            25
		{
			if(i >= longsparsearray.size())
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #581 <Method int LongSparseArray.size()>
	//*   7   13:icmplt          17
			{
				return;
	//    8   16:return          
			} else
			{
				longsparsearray.put(i, obj);
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:i2l             
	//   12   20:aload_2         
	//   13   21:invokevirtual   #585 <Method void LongSparseArray.put(long, Object)>
				return;
	//   14   24:return          
			}
		} else
		{
			return;
	//   15   25:return          
		}
	}

	protected static void setTo(android.util.LongSparseArray longsparsearray, int i, Object obj)
	{
		if(longsparsearray != null && i >= 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          25
	//*   2    4:iload_1         
	//*   3    5:iflt            25
		{
			if(i >= longsparsearray.size())
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #588 <Method int android.util.LongSparseArray.size()>
	//*   7   13:icmplt          17
			{
				return;
	//    8   16:return          
			} else
			{
				longsparsearray.put(i, obj);
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:i2l             
	//   12   20:aload_2         
	//   13   21:invokevirtual   #589 <Method void android.util.LongSparseArray.put(long, Object)>
				return;
	//   14   24:return          
			}
		} else
		{
			return;
	//   15   25:return          
		}
	}

	protected static void setTo(SparseArray sparsearray, int i, Object obj)
	{
		if(sparsearray != null && i >= 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          24
	//*   2    4:iload_1         
	//*   3    5:iflt            24
		{
			if(i >= sparsearray.size())
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #592 <Method int SparseArray.size()>
	//*   7   13:icmplt          17
			{
				return;
	//    8   16:return          
			} else
			{
				sparsearray.put(i, obj);
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #595 <Method void SparseArray.put(int, Object)>
				return;
	//   13   23:return          
			}
		} else
		{
			return;
	//   14   24:return          
		}
	}

	protected static void setTo(SparseBooleanArray sparsebooleanarray, int i, boolean flag)
	{
		if(sparsebooleanarray != null && i >= 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          24
	//*   2    4:iload_1         
	//*   3    5:iflt            24
		{
			if(i >= sparsebooleanarray.size())
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #598 <Method int SparseBooleanArray.size()>
	//*   7   13:icmplt          17
			{
				return;
	//    8   16:return          
			} else
			{
				sparsebooleanarray.put(i, flag);
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:iload_2         
	//   12   20:invokevirtual   #601 <Method void SparseBooleanArray.put(int, boolean)>
				return;
	//   13   23:return          
			}
		} else
		{
			return;
	//   14   24:return          
		}
	}

	protected static void setTo(SparseIntArray sparseintarray, int i, int j)
	{
		if(sparseintarray != null && i >= 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          24
	//*   2    4:iload_1         
	//*   3    5:iflt            24
		{
			if(i >= sparseintarray.size())
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #603 <Method int SparseIntArray.size()>
	//*   7   13:icmplt          17
			{
				return;
	//    8   16:return          
			} else
			{
				sparseintarray.put(i, j);
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:iload_2         
	//   12   20:invokevirtual   #606 <Method void SparseIntArray.put(int, int)>
				return;
	//   13   23:return          
			}
		} else
		{
			return;
	//   14   24:return          
		}
	}

	protected static void setTo(SparseLongArray sparselongarray, int i, long l)
	{
		if(sparselongarray != null && i >= 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          24
	//*   2    4:iload_1         
	//*   3    5:iflt            24
		{
			if(i >= sparselongarray.size())
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #608 <Method int SparseLongArray.size()>
	//*   7   13:icmplt          17
			{
				return;
	//    8   16:return          
			} else
			{
				sparselongarray.put(i, l);
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:lload_2         
	//   12   20:invokevirtual   #611 <Method void SparseLongArray.put(int, long)>
				return;
	//   13   23:return          
			}
		} else
		{
			return;
	//   14   24:return          
		}
	}

	protected static void setTo(List list, int i, Object obj)
	{
		if(list != null && i >= 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          29
	//*   2    4:iload_1         
	//*   3    5:iflt            29
		{
			if(i >= list.size())
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:invokeinterface #405 <Method int List.size()>
	//*   7   15:icmplt          19
			{
				return;
	//    8   18:return          
			} else
			{
				list.set(i, obj);
	//    9   19:aload_0         
	//   10   20:iload_1         
	//   11   21:aload_2         
	//   12   22:invokeinterface #616 <Method Object List.set(int, Object)>
	//   13   27:pop             
				return;
	//   14   28:return          
			}
		} else
		{
			return;
	//   15   29:return          
		}
	}

	protected static void setTo(Map map, Object obj, Object obj1)
	{
		if(map == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			map.put(obj, obj1);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokeinterface #621 <Method Object Map.put(Object, Object)>
	//    7   13:pop             
			return;
	//    8   14:return          
		}
	}

	protected static void setTo(byte abyte0[], int i, byte byte0)
	{
		if(abyte0 != null && i >= 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          20
	//*   2    4:iload_1         
	//*   3    5:iflt            20
		{
			if(i >= abyte0.length)
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:arraylength     
	//*   7   11:icmplt          15
			{
				return;
	//    8   14:return          
			} else
			{
				abyte0[i] = byte0;
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:iload_2         
	//   12   18:bastore         
				return;
	//   13   19:return          
			}
		} else
		{
			return;
	//   14   20:return          
		}
	}

	protected static void setTo(char ac[], int i, char c)
	{
		if(ac != null && i >= 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          20
	//*   2    4:iload_1         
	//*   3    5:iflt            20
		{
			if(i >= ac.length)
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:arraylength     
	//*   7   11:icmplt          15
			{
				return;
	//    8   14:return          
			} else
			{
				ac[i] = c;
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:iload_2         
	//   12   18:castore         
				return;
	//   13   19:return          
			}
		} else
		{
			return;
	//   14   20:return          
		}
	}

	protected static void setTo(double ad[], int i, double d)
	{
		if(ad != null && i >= 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          20
	//*   2    4:iload_1         
	//*   3    5:iflt            20
		{
			if(i >= ad.length)
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:arraylength     
	//*   7   11:icmplt          15
			{
				return;
	//    8   14:return          
			} else
			{
				ad[i] = d;
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:dload_2         
	//   12   18:dastore         
				return;
	//   13   19:return          
			}
		} else
		{
			return;
	//   14   20:return          
		}
	}

	protected static void setTo(float af[], int i, float f)
	{
		if(af != null && i >= 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          20
	//*   2    4:iload_1         
	//*   3    5:iflt            20
		{
			if(i >= af.length)
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:arraylength     
	//*   7   11:icmplt          15
			{
				return;
	//    8   14:return          
			} else
			{
				af[i] = f;
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:fload_2         
	//   12   18:fastore         
				return;
	//   13   19:return          
			}
		} else
		{
			return;
	//   14   20:return          
		}
	}

	protected static void setTo(int ai[], int i, int j)
	{
		if(ai != null && i >= 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          20
	//*   2    4:iload_1         
	//*   3    5:iflt            20
		{
			if(i >= ai.length)
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:arraylength     
	//*   7   11:icmplt          15
			{
				return;
	//    8   14:return          
			} else
			{
				ai[i] = j;
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:iload_2         
	//   12   18:iastore         
				return;
	//   13   19:return          
			}
		} else
		{
			return;
	//   14   20:return          
		}
	}

	protected static void setTo(long al[], int i, long l)
	{
		if(al != null && i >= 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          20
	//*   2    4:iload_1         
	//*   3    5:iflt            20
		{
			if(i >= al.length)
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:arraylength     
	//*   7   11:icmplt          15
			{
				return;
	//    8   14:return          
			} else
			{
				al[i] = l;
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:lload_2         
	//   12   18:lastore         
				return;
	//   13   19:return          
			}
		} else
		{
			return;
	//   14   20:return          
		}
	}

	protected static void setTo(Object aobj[], int i, Object obj)
	{
		if(aobj != null && i >= 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          20
	//*   2    4:iload_1         
	//*   3    5:iflt            20
		{
			if(i >= aobj.length)
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:arraylength     
	//*   7   11:icmplt          15
			{
				return;
	//    8   14:return          
			} else
			{
				aobj[i] = obj;
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:aload_2         
	//   12   18:aastore         
				return;
	//   13   19:return          
			}
		} else
		{
			return;
	//   14   20:return          
		}
	}

	protected static void setTo(short aword0[], int i, short word0)
	{
		if(aword0 != null && i >= 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          20
	//*   2    4:iload_1         
	//*   3    5:iflt            20
		{
			if(i >= aword0.length)
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:arraylength     
	//*   7   11:icmplt          15
			{
				return;
	//    8   14:return          
			} else
			{
				aword0[i] = word0;
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:iload_2         
	//   12   18:sastore         
				return;
	//   13   19:return          
			}
		} else
		{
			return;
	//   14   20:return          
		}
	}

	protected static void setTo(boolean aflag[], int i, boolean flag)
	{
		if(aflag != null && i >= 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          20
	//*   2    4:iload_1         
	//*   3    5:iflt            20
		{
			if(i >= aflag.length)
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:arraylength     
	//*   7   11:icmplt          15
			{
				return;
	//    8   14:return          
			} else
			{
				aflag[i] = flag;
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:iload_2         
	//   12   18:bastore         
				return;
	//   13   19:return          
			}
		} else
		{
			return;
	//   14   20:return          
		}
	}

	private boolean updateRegistration(int i, Object obj, CreateWeakListener createweaklistener)
	{
		if(obj == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
			return unregisterFrom(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #637 <Method boolean unregisterFrom(int)>
	//    5    9:ireturn         
		WeakListener weaklistener = mLocalFieldObservers[i];
	//    6   10:aload_0         
	//    7   11:getfield        #157 <Field ViewDataBinding$WeakListener[] mLocalFieldObservers>
	//    8   14:iload_1         
	//    9   15:aaload          
	//   10   16:astore          4
		if(weaklistener == null)
	//*  11   18:aload           4
	//*  12   20:ifnonnull       32
		{
			registerTo(i, obj, createweaklistener);
	//   13   23:aload_0         
	//   14   24:iload_1         
	//   15   25:aload_2         
	//   16   26:aload_3         
	//   17   27:invokevirtual   #641 <Method void registerTo(int, Object, ViewDataBinding$CreateWeakListener)>
			return true;
	//   18   30:iconst_1        
	//   19   31:ireturn         
		}
		if(weaklistener.getTarget() == obj)
	//*  20   32:aload           4
	//*  21   34:invokevirtual   #644 <Method Object ViewDataBinding$WeakListener.getTarget()>
	//*  22   37:aload_2         
	//*  23   38:if_acmpne       43
		{
			return false;
	//   24   41:iconst_0        
	//   25   42:ireturn         
		} else
		{
			unregisterFrom(i);
	//   26   43:aload_0         
	//   27   44:iload_1         
	//   28   45:invokevirtual   #637 <Method boolean unregisterFrom(int)>
	//   29   48:pop             
			registerTo(i, obj, createweaklistener);
	//   30   49:aload_0         
	//   31   50:iload_1         
	//   32   51:aload_2         
	//   33   52:aload_3         
	//   34   53:invokevirtual   #641 <Method void registerTo(int, Object, ViewDataBinding$CreateWeakListener)>
			return true;
	//   35   56:iconst_1        
	//   36   57:ireturn         
		}
	}

	public void addOnRebindCallback(OnRebindCallback onrebindcallback)
	{
		if(mRebindCallbacks == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #229 <Field CallbackRegistry mRebindCallbacks>
	//*   2    4:ifnonnull       21
			mRebindCallbacks = new CallbackRegistry(REBIND_NOTIFIER);
	//    3    7:aload_0         
	//    4    8:new             #231 <Class CallbackRegistry>
	//    5   11:dup             
	//    6   12:getstatic       #133 <Field CallbackRegistry$NotifierCallback REBIND_NOTIFIER>
	//    7   15:invokespecial   #650 <Method void CallbackRegistry(CallbackRegistry$NotifierCallback)>
	//    8   18:putfield        #229 <Field CallbackRegistry mRebindCallbacks>
		mRebindCallbacks.add(((Object) (onrebindcallback)));
	//    9   21:aload_0         
	//   10   22:getfield        #229 <Field CallbackRegistry mRebindCallbacks>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #654 <Method void CallbackRegistry.add(Object)>
	//   13   29:return          
	}

	protected void ensureBindingComponentIsNotNull(Class class1)
	{
		if(mBindingComponent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #155 <Field DataBindingComponent mBindingComponent>
	//*   2    4:ifnull          8
		{
			return;
	//    3    7:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #659 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #660 <Method void StringBuilder()>
	//    7   15:astore_2        
			stringbuilder.append("Required DataBindingComponent is null in class ");
	//    8   16:aload_2         
	//    9   17:ldc2            #662 <String "Required DataBindingComponent is null in class ">
	//   10   20:invokevirtual   #666 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
			stringbuilder.append(((Object)this).getClass().getSimpleName());
	//   12   24:aload_2         
	//   13   25:aload_0         
	//   14   26:invokevirtual   #670 <Method Class Object.getClass()>
	//   15   29:invokevirtual   #676 <Method String Class.getSimpleName()>
	//   16   32:invokevirtual   #666 <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
			stringbuilder.append(". A BindingAdapter in ");
	//   18   36:aload_2         
	//   19   37:ldc2            #678 <String ". A BindingAdapter in ">
	//   20   40:invokevirtual   #666 <Method StringBuilder StringBuilder.append(String)>
	//   21   43:pop             
			stringbuilder.append(class1.getCanonicalName());
	//   22   44:aload_2         
	//   23   45:aload_1         
	//   24   46:invokevirtual   #681 <Method String Class.getCanonicalName()>
	//   25   49:invokevirtual   #666 <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
			stringbuilder.append(" is not static and requires an object to use, retrieved from the DataBindingComponent. If you don't use an inflation method taking a DataBindingComponent, use DataBindingUtil.setDefaultComponent or make all BindingAdapter methods static.");
	//   27   53:aload_2         
	//   28   54:ldc2            #683 <String " is not static and requires an object to use, retrieved from the DataBindingComponent. If you don't use an inflation method taking a DataBindingComponent, use DataBindingUtil.setDefaultComponent or make all BindingAdapter methods static.">
	//   29   57:invokevirtual   #666 <Method StringBuilder StringBuilder.append(String)>
	//   30   60:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   31   61:new             #185 <Class IllegalStateException>
	//   32   64:dup             
	//   33   65:aload_2         
	//   34   66:invokevirtual   #686 <Method String StringBuilder.toString()>
	//   35   69:invokespecial   #190 <Method void IllegalStateException(String)>
	//   36   72:athrow          
		}
	}

	protected abstract void executeBindings();

	public void executePendingBindings()
	{
		ViewDataBinding viewdatabinding = mContainingBinding;
	//    0    0:aload_0         
	//    1    1:getfield        #690 <Field ViewDataBinding mContainingBinding>
	//    2    4:astore_1        
		if(viewdatabinding == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       14
		{
			executeBindingsInternal();
	//    5    9:aload_0         
	//    6   10:invokespecial   #241 <Method void executeBindingsInternal()>
			return;
	//    7   13:return          
		} else
		{
			viewdatabinding.executePendingBindings();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #692 <Method void executePendingBindings()>
			return;
	//   10   18:return          
		}
	}

	void forceExecuteBindings()
	{
		executeBindings();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #238 <Method void executeBindings()>
	//    2    4:return          
	}

	public LifecycleOwner getLifecycleOwner()
	{
		return mLifecycleOwner;
	//    0    0:aload_0         
	//    1    1:getfield        #698 <Field LifecycleOwner mLifecycleOwner>
	//    2    4:areturn         
	}

	protected Object getObservedField(int i)
	{
		WeakListener weaklistener = mLocalFieldObservers[i];
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field ViewDataBinding$WeakListener[] mLocalFieldObservers>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:astore_2        
		if(weaklistener == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       13
			return ((Object) (null));
	//    7   11:aconst_null     
	//    8   12:areturn         
		else
			return weaklistener.getTarget();
	//    9   13:aload_2         
	//   10   14:invokevirtual   #644 <Method Object ViewDataBinding$WeakListener.getTarget()>
	//   11   17:areturn         
	}

	public View getRoot()
	{
		return mRoot;
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field View mRoot>
	//    2    4:areturn         
	}

	public abstract boolean hasPendingBindings();

	public abstract void invalidateAll();

	protected abstract boolean onFieldChange(int i, Object obj, int j);

	protected void registerTo(int i, Object obj, CreateWeakListener createweaklistener)
	{
		if(obj == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		WeakListener weaklistener = mLocalFieldObservers[i];
	//    3    5:aload_0         
	//    4    6:getfield        #157 <Field ViewDataBinding$WeakListener[] mLocalFieldObservers>
	//    5    9:iload_1         
	//    6   10:aaload          
	//    7   11:astore          5
		Object obj1 = ((Object) (weaklistener));
	//    8   13:aload           5
	//    9   15:astore          4
		if(weaklistener == null)
	//*  10   17:aload           5
	//*  11   19:ifnonnull       61
		{
			createweaklistener = ((CreateWeakListener) (createweaklistener.create(this, i)));
	//   12   22:aload_3         
	//   13   23:aload_0         
	//   14   24:iload_1         
	//   15   25:invokeinterface #706 <Method ViewDataBinding$WeakListener ViewDataBinding$CreateWeakListener.create(ViewDataBinding, int)>
	//   16   30:astore_3        
			mLocalFieldObservers[i] = ((WeakListener) (createweaklistener));
	//   17   31:aload_0         
	//   18   32:getfield        #157 <Field ViewDataBinding$WeakListener[] mLocalFieldObservers>
	//   19   35:iload_1         
	//   20   36:aload_3         
	//   21   37:aastore         
			LifecycleOwner lifecycleowner = mLifecycleOwner;
	//   22   38:aload_0         
	//   23   39:getfield        #698 <Field LifecycleOwner mLifecycleOwner>
	//   24   42:astore          5
			obj1 = ((Object) (createweaklistener));
	//   25   44:aload_3         
	//   26   45:astore          4
			if(lifecycleowner != null)
	//*  27   47:aload           5
	//*  28   49:ifnull          61
			{
				((WeakListener) (createweaklistener)).setLifecycleOwner(lifecycleowner);
	//   29   52:aload_3         
	//   30   53:aload           5
	//   31   55:invokevirtual   #710 <Method void ViewDataBinding$WeakListener.setLifecycleOwner(LifecycleOwner)>
				obj1 = ((Object) (createweaklistener));
	//   32   58:aload_3         
	//   33   59:astore          4
			}
		}
		((WeakListener) (obj1)).setTarget(obj);
	//   34   61:aload           4
	//   35   63:aload_2         
	//   36   64:invokevirtual   #713 <Method void ViewDataBinding$WeakListener.setTarget(Object)>
	//   37   67:return          
	}

	public void removeOnRebindCallback(OnRebindCallback onrebindcallback)
	{
		CallbackRegistry callbackregistry = mRebindCallbacks;
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field CallbackRegistry mRebindCallbacks>
	//    2    4:astore_2        
		if(callbackregistry != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			callbackregistry.remove(((Object) (onrebindcallback)));
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #717 <Method void CallbackRegistry.remove(Object)>
	//    8   14:return          
	}

	protected void requestRebind()
	{
		Object obj = ((Object) (mContainingBinding));
	//    0    0:aload_0         
	//    1    1:getfield        #690 <Field ViewDataBinding mContainingBinding>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
		{
			((ViewDataBinding) (obj)).requestRebind();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #223 <Method void requestRebind()>
			return;
	//    7   13:return          
		}
		obj = ((Object) (mLifecycleOwner));
	//    8   14:aload_0         
	//    9   15:getfield        #698 <Field LifecycleOwner mLifecycleOwner>
	//   10   18:astore_1        
		if(obj != null && !((LifecycleOwner) (obj)).getLifecycle().getCurrentState().isAtLeast(android.arch.lifecycle.Lifecycle.State.STARTED))
	//*  11   19:aload_1         
	//*  12   20:ifnull          42
	//*  13   23:aload_1         
	//*  14   24:invokeinterface #723 <Method Lifecycle LifecycleOwner.getLifecycle()>
	//*  15   29:invokevirtual   #729 <Method android.arch.lifecycle.Lifecycle$State Lifecycle.getCurrentState()>
	//*  16   32:getstatic       #735 <Field android.arch.lifecycle.Lifecycle$State android.arch.lifecycle.Lifecycle$State.STARTED>
	//*  17   35:invokevirtual   #739 <Method boolean android.arch.lifecycle.Lifecycle$State.isAtLeast(android.arch.lifecycle.Lifecycle$State)>
	//*  18   38:ifne            42
			return;
	//   19   41:return          
		this;
	//   20   42:aload_0         
		JVM INSTR monitorenter ;
	//   21   43:monitorenter    
		if(!mPendingRebind)
			break MISSING_BLOCK_LABEL_54;
	//   22   44:aload_0         
	//   23   45:getfield        #151 <Field boolean mPendingRebind>
	//   24   48:ifeq            54
		this;
	//   25   51:aload_0         
		JVM INSTR monitorexit ;
	//   26   52:monitorexit     
		return;
	//   27   53:return          
		mPendingRebind = true;
	//   28   54:aload_0         
	//   29   55:iconst_1        
	//   30   56:putfield        #151 <Field boolean mPendingRebind>
		this;
	//   31   59:aload_0         
		JVM INSTR monitorexit ;
	//   32   60:monitorexit     
		if(USE_CHOREOGRAPHER)
	//*  33   61:getstatic       #116 <Field boolean USE_CHOREOGRAPHER>
	//*  34   64:ifeq            79
		{
			mChoreographer.postFrameCallback(mFrameCallback);
	//   35   67:aload_0         
	//   36   68:getfield        #173 <Field Choreographer mChoreographer>
	//   37   71:aload_0         
	//   38   72:getfield        #176 <Field android.view.Choreographer$FrameCallback mFrameCallback>
	//   39   75:invokevirtual   #743 <Method void Choreographer.postFrameCallback(android.view.Choreographer$FrameCallback)>
			return;
	//   40   78:return          
		} else
		{
			mUIThreadHandler.post(mRebindRunnable);
	//   41   79:aload_0         
	//   42   80:getfield        #183 <Field Handler mUIThreadHandler>
	//   43   83:aload_0         
	//   44   84:getfield        #149 <Field Runnable mRebindRunnable>
	//   45   87:invokevirtual   #747 <Method boolean Handler.post(Runnable)>
	//   46   90:pop             
			return;
	//   47   91:return          
		}
		Exception exception;
		exception;
	//   48   92:astore_1        
		this;
	//   49   93:aload_0         
		JVM INSTR monitorexit ;
	//   50   94:monitorexit     
		throw exception;
	//   51   95:aload_1         
	//   52   96:athrow          
	}

	protected void setContainedBinding(ViewDataBinding viewdatabinding)
	{
		if(viewdatabinding != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          9
			viewdatabinding.mContainingBinding = this;
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:putfield        #690 <Field ViewDataBinding mContainingBinding>
	//    5    9:return          
	}

	public void setLifecycleOwner(LifecycleOwner lifecycleowner)
	{
		LifecycleOwner lifecycleowner1 = mLifecycleOwner;
	//    0    0:aload_0         
	//    1    1:getfield        #698 <Field LifecycleOwner mLifecycleOwner>
	//    2    4:astore          4
		if(lifecycleowner1 == lifecycleowner)
	//*   3    6:aload           4
	//*   4    8:aload_1         
	//*   5    9:if_acmpne       13
			return;
	//    6   12:return          
		if(lifecycleowner1 != null)
	//*   7   13:aload           4
	//*   8   15:ifnull          32
			lifecycleowner1.getLifecycle().removeObserver(((LifecycleObserver) (mOnStartListener)));
	//    9   18:aload           4
	//   10   20:invokeinterface #723 <Method Lifecycle LifecycleOwner.getLifecycle()>
	//   11   25:aload_0         
	//   12   26:getfield        #751 <Field ViewDataBinding$OnStartListener mOnStartListener>
	//   13   29:invokevirtual   #755 <Method void Lifecycle.removeObserver(LifecycleObserver)>
		mLifecycleOwner = lifecycleowner;
	//   14   32:aload_0         
	//   15   33:aload_1         
	//   16   34:putfield        #698 <Field LifecycleOwner mLifecycleOwner>
		if(lifecycleowner != null)
	//*  17   37:aload_1         
	//*  18   38:ifnull          74
		{
			if(mOnStartListener == null)
	//*  19   41:aload_0         
	//*  20   42:getfield        #751 <Field ViewDataBinding$OnStartListener mOnStartListener>
	//*  21   45:ifnonnull       61
				mOnStartListener = new OnStartListener();
	//   22   48:aload_0         
	//   23   49:new             #34  <Class ViewDataBinding$OnStartListener>
	//   24   52:dup             
	//   25   53:aload_0         
	//   26   54:aconst_null     
	//   27   55:invokespecial   #758 <Method void ViewDataBinding$OnStartListener(ViewDataBinding, ViewDataBinding$1)>
	//   28   58:putfield        #751 <Field ViewDataBinding$OnStartListener mOnStartListener>
			lifecycleowner.getLifecycle().addObserver(((LifecycleObserver) (mOnStartListener)));
	//   29   61:aload_1         
	//   30   62:invokeinterface #723 <Method Lifecycle LifecycleOwner.getLifecycle()>
	//   31   67:aload_0         
	//   32   68:getfield        #751 <Field ViewDataBinding$OnStartListener mOnStartListener>
	//   33   71:invokevirtual   #761 <Method void Lifecycle.addObserver(LifecycleObserver)>
		}
		WeakListener aweaklistener[] = mLocalFieldObservers;
	//   34   74:aload_0         
	//   35   75:getfield        #157 <Field ViewDataBinding$WeakListener[] mLocalFieldObservers>
	//   36   78:astore          4
		int j = aweaklistener.length;
	//   37   80:aload           4
	//   38   82:arraylength     
	//   39   83:istore_3        
		for(int i = 0; i < j; i++)
	//*  40   84:iconst_0        
	//*  41   85:istore_2        
	//*  42   86:iload_2         
	//*  43   87:iload_3         
	//*  44   88:icmpge          115
		{
			WeakListener weaklistener = aweaklistener[i];
	//   45   91:aload           4
	//   46   93:iload_2         
	//   47   94:aaload          
	//   48   95:astore          5
			if(weaklistener != null)
	//*  49   97:aload           5
	//*  50   99:ifnull          108
				weaklistener.setLifecycleOwner(lifecycleowner);
	//   51  102:aload           5
	//   52  104:aload_1         
	//   53  105:invokevirtual   #710 <Method void ViewDataBinding$WeakListener.setLifecycleOwner(LifecycleOwner)>
		}

	//   54  108:iload_2         
	//   55  109:iconst_1        
	//   56  110:iadd            
	//   57  111:istore_2        
	//*  58  112:goto            86
	//   59  115:return          
	}

	protected void setRootTag(View view)
	{
		view.setTag(com.android.databinding.library.R.id.dataBinding, ((Object) (this)));
	//    0    0:aload_1         
	//    1    1:getstatic       #307 <Field int com.android.databinding.library.R$id.dataBinding>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #766 <Method void View.setTag(int, Object)>
	//    4    8:return          
	}

	protected void setRootTag(View aview[])
	{
		int j = aview.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          27
			aview[i].setTag(com.android.databinding.library.R.id.dataBinding, ((Object) (this)));
	//    8   10:aload_1         
	//    9   11:iload_2         
	//   10   12:aaload          
	//   11   13:getstatic       #307 <Field int com.android.databinding.library.R$id.dataBinding>
	//   12   16:aload_0         
	//   13   17:invokevirtual   #766 <Method void View.setTag(int, Object)>

	//   14   20:iload_2         
	//   15   21:iconst_1        
	//   16   22:iadd            
	//   17   23:istore_2        
	//*  18   24:goto            5
	//   19   27:return          
	}

	public abstract boolean setVariable(int i, Object obj);

	public void unbind()
	{
		WeakListener aweaklistener[] = mLocalFieldObservers;
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field ViewDataBinding$WeakListener[] mLocalFieldObservers>
	//    2    4:astore_3        
		int j = aweaklistener.length;
	//    3    5:aload_3         
	//    4    6:arraylength     
	//    5    7:istore_2        
		for(int i = 0; i < j; i++)
	//*   6    8:iconst_0        
	//*   7    9:istore_1        
	//*   8   10:iload_1         
	//*   9   11:iload_2         
	//*  10   12:icmpge          38
		{
			WeakListener weaklistener = aweaklistener[i];
	//   11   15:aload_3         
	//   12   16:iload_1         
	//   13   17:aaload          
	//   14   18:astore          4
			if(weaklistener != null)
	//*  15   20:aload           4
	//*  16   22:ifnull          31
				weaklistener.unregister();
	//   17   25:aload           4
	//   18   27:invokevirtual   #530 <Method boolean ViewDataBinding$WeakListener.unregister()>
	//   19   30:pop             
		}

	//   20   31:iload_1         
	//   21   32:iconst_1        
	//   22   33:iadd            
	//   23   34:istore_1        
	//*  24   35:goto            10
	//   25   38:return          
	}

	protected boolean unregisterFrom(int i)
	{
		WeakListener weaklistener = mLocalFieldObservers[i];
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field ViewDataBinding$WeakListener[] mLocalFieldObservers>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:astore_2        
		if(weaklistener != null)
	//*   5    7:aload_2         
	//*   6    8:ifnull          16
			return weaklistener.unregister();
	//    7   11:aload_2         
	//    8   12:invokevirtual   #530 <Method boolean ViewDataBinding$WeakListener.unregister()>
	//    9   15:ireturn         
		else
			return false;
	//   10   16:iconst_0        
	//   11   17:ireturn         
	}

	protected boolean updateLiveDataRegistration(int i, LiveData livedata)
	{
		mInLiveDataRegisterObserver = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #415 <Field boolean mInLiveDataRegisterObserver>
		boolean flag = updateRegistration(i, ((Object) (livedata)), CREATE_LIVE_DATA_LISTENER);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:aload_2         
	//    6    8:getstatic       #130 <Field ViewDataBinding$CreateWeakListener CREATE_LIVE_DATA_LISTENER>
	//    7   11:invokespecial   #774 <Method boolean updateRegistration(int, Object, ViewDataBinding$CreateWeakListener)>
	//    8   14:istore_3        
		mInLiveDataRegisterObserver = false;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #415 <Field boolean mInLiveDataRegisterObserver>
		return flag;
	//   12   20:iload_3         
	//   13   21:ireturn         
		livedata;
	//   14   22:astore_2        
		mInLiveDataRegisterObserver = false;
	//   15   23:aload_0         
	//   16   24:iconst_0        
	//   17   25:putfield        #415 <Field boolean mInLiveDataRegisterObserver>
		throw livedata;
	//   18   28:aload_2         
	//   19   29:athrow          
	}

	protected boolean updateRegistration(int i, Observable observable)
	{
		return updateRegistration(i, ((Object) (observable)), CREATE_PROPERTY_LISTENER);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #121 <Field ViewDataBinding$CreateWeakListener CREATE_PROPERTY_LISTENER>
	//    4    6:invokespecial   #774 <Method boolean updateRegistration(int, Object, ViewDataBinding$CreateWeakListener)>
	//    5    9:ireturn         
	}

	protected boolean updateRegistration(int i, ObservableList observablelist)
	{
		return updateRegistration(i, ((Object) (observablelist)), CREATE_LIST_LISTENER);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #124 <Field ViewDataBinding$CreateWeakListener CREATE_LIST_LISTENER>
	//    4    6:invokespecial   #774 <Method boolean updateRegistration(int, Object, ViewDataBinding$CreateWeakListener)>
	//    5    9:ireturn         
	}

	protected boolean updateRegistration(int i, ObservableMap observablemap)
	{
		return updateRegistration(i, ((Object) (observablemap)), CREATE_MAP_LISTENER);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #127 <Field ViewDataBinding$CreateWeakListener CREATE_MAP_LISTENER>
	//    4    6:invokespecial   #774 <Method boolean updateRegistration(int, Object, ViewDataBinding$CreateWeakListener)>
	//    5    9:ireturn         
	}

	private static final int BINDING_NUMBER_START = 8;
	public static final String BINDING_TAG_PREFIX = "binding_";
	private static final CreateWeakListener CREATE_LIST_LISTENER = new CreateWeakListener() {

		public WeakListener create(ViewDataBinding viewdatabinding, int i)
		{
			return (new WeakListListener(viewdatabinding, i)).getListener();
		//    0    0:new             #17  <Class ViewDataBinding$WeakListListener>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:iload_2         
		//    4    6:invokespecial   #20  <Method void ViewDataBinding$WeakListListener(ViewDataBinding, int)>
		//    5    9:invokevirtual   #24  <Method ViewDataBinding$WeakListener ViewDataBinding$WeakListListener.getListener()>
		//    6   12:areturn         
		}

	}
;
	private static final CreateWeakListener CREATE_LIVE_DATA_LISTENER = new CreateWeakListener() {

		public WeakListener create(ViewDataBinding viewdatabinding, int i)
		{
			return (new LiveDataListener(viewdatabinding, i)).getListener();
		//    0    0:new             #17  <Class ViewDataBinding$LiveDataListener>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:iload_2         
		//    4    6:invokespecial   #20  <Method void ViewDataBinding$LiveDataListener(ViewDataBinding, int)>
		//    5    9:invokevirtual   #24  <Method ViewDataBinding$WeakListener ViewDataBinding$LiveDataListener.getListener()>
		//    6   12:areturn         
		}

	}
;
	private static final CreateWeakListener CREATE_MAP_LISTENER = new CreateWeakListener() {

		public WeakListener create(ViewDataBinding viewdatabinding, int i)
		{
			return (new WeakMapListener(viewdatabinding, i)).getListener();
		//    0    0:new             #17  <Class ViewDataBinding$WeakMapListener>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:iload_2         
		//    4    6:invokespecial   #20  <Method void ViewDataBinding$WeakMapListener(ViewDataBinding, int)>
		//    5    9:invokevirtual   #24  <Method ViewDataBinding$WeakListener ViewDataBinding$WeakMapListener.getListener()>
		//    6   12:areturn         
		}

	}
;
	private static final CreateWeakListener CREATE_PROPERTY_LISTENER = new CreateWeakListener() {

		public WeakListener create(ViewDataBinding viewdatabinding, int i)
		{
			return (new WeakPropertyListener(viewdatabinding, i)).getListener();
		//    0    0:new             #17  <Class ViewDataBinding$WeakPropertyListener>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:iload_2         
		//    4    6:invokespecial   #20  <Method void ViewDataBinding$WeakPropertyListener(ViewDataBinding, int)>
		//    5    9:invokevirtual   #24  <Method ViewDataBinding$WeakListener ViewDataBinding$WeakPropertyListener.getListener()>
		//    6   12:areturn         
		}

	}
;
	private static final int HALTED = 2;
	private static final int REBIND = 1;
	private static final CallbackRegistry.NotifierCallback REBIND_NOTIFIER = new CallbackRegistry.NotifierCallback() {

		public void onNotifyCallback(OnRebindCallback onrebindcallback, ViewDataBinding viewdatabinding, int i, Void void1)
		{
			switch(i)
		//*   0    0:iload_3         
			{
		//*   1    1:tableswitch     1 3: default 28
		//		               1 41
		//		               2 35
		//		               3 29
			default:
				return;
		//    2   28:return          

			case 3: // '\003'
				onrebindcallback.onBound(viewdatabinding);
		//    3   29:aload_1         
		//    4   30:aload_2         
		//    5   31:invokevirtual   #20  <Method void OnRebindCallback.onBound(ViewDataBinding)>
				return;
		//    6   34:return          

			case 2: // '\002'
				onrebindcallback.onCanceled(viewdatabinding);
		//    7   35:aload_1         
		//    8   36:aload_2         
		//    9   37:invokevirtual   #23  <Method void OnRebindCallback.onCanceled(ViewDataBinding)>
				return;
		//   10   40:return          

			case 1: // '\001'
				break;
			}
			if(!onrebindcallback.onPreBind(viewdatabinding))
		//*  11   41:aload_1         
		//*  12   42:aload_2         
		//*  13   43:invokevirtual   #27  <Method boolean OnRebindCallback.onPreBind(ViewDataBinding)>
		//*  14   46:ifne            55
				viewdatabinding.mRebindHalted = true;
		//   15   49:aload_2         
		//   16   50:iconst_1        
		//   17   51:invokestatic    #31  <Method boolean ViewDataBinding.access$002(ViewDataBinding, boolean)>
		//   18   54:pop             
		//   19   55:return          
		}

		public volatile void onNotifyCallback(Object obj, Object obj1, int i, Object obj2)
		{
			onNotifyCallback((OnRebindCallback)obj, (ViewDataBinding)obj1, i, (Void)obj2);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #16  <Class OnRebindCallback>
		//    3    5:aload_2         
		//    4    6:checkcast       #7   <Class ViewDataBinding>
		//    5    9:iload_3         
		//    6   10:aload           4
		//    7   12:checkcast       #34  <Class Void>
		//    8   15:invokevirtual   #36  <Method void onNotifyCallback(OnRebindCallback, ViewDataBinding, int, Void)>
		//    9   18:return          
		}

	}
;
	private static final int REBOUND = 3;
	private static final android.view.View.OnAttachStateChangeListener ROOT_REATTACHED_LISTENER;
	static int SDK_INT;
	private static final boolean USE_CHOREOGRAPHER;
	private static final ReferenceQueue sReferenceQueue = new ReferenceQueue();
	protected final DataBindingComponent mBindingComponent;
	private Choreographer mChoreographer;
	private ViewDataBinding mContainingBinding;
	private final android.view.Choreographer.FrameCallback mFrameCallback;
	private boolean mInLiveDataRegisterObserver;
	private boolean mIsExecutingPendingBindings;
	private LifecycleOwner mLifecycleOwner;
	private WeakListener mLocalFieldObservers[];
	private OnStartListener mOnStartListener;
	private boolean mPendingRebind;
	private CallbackRegistry mRebindCallbacks;
	private boolean mRebindHalted;
	private final Runnable mRebindRunnable = new Runnable() {

		public void run()
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			mPendingRebind = false;
		//    2    2:aload_0         
		//    3    3:getfield        #14  <Field ViewDataBinding this$0>
		//    4    6:iconst_0        
		//    5    7:invokestatic    #23  <Method boolean ViewDataBinding.access$202(ViewDataBinding, boolean)>
		//    6   10:pop             
			this;
		//    7   11:aload_0         
			JVM INSTR monitorexit ;
		//    8   12:monitorexit     
			ViewDataBinding.processReferenceQueue();
		//    9   13:invokestatic    #26  <Method void ViewDataBinding.access$300()>
			if(android.os.Build.VERSION.SDK_INT >= 19 && !mRoot.isAttachedToWindow())
		//*  10   16:getstatic       #32  <Field int android.os.Build$VERSION.SDK_INT>
		//*  11   19:bipush          19
		//*  12   21:icmplt          64
		//*  13   24:aload_0         
		//*  14   25:getfield        #14  <Field ViewDataBinding this$0>
		//*  15   28:invokestatic    #36  <Method View ViewDataBinding.access$400(ViewDataBinding)>
		//*  16   31:invokevirtual   #42  <Method boolean View.isAttachedToWindow()>
		//*  17   34:ifne            64
			{
				mRoot.removeOnAttachStateChangeListener(ViewDataBinding.ROOT_REATTACHED_LISTENER);
		//   18   37:aload_0         
		//   19   38:getfield        #14  <Field ViewDataBinding this$0>
		//   20   41:invokestatic    #36  <Method View ViewDataBinding.access$400(ViewDataBinding)>
		//   21   44:invokestatic    #46  <Method android.view.View$OnAttachStateChangeListener ViewDataBinding.access$500()>
		//   22   47:invokevirtual   #50  <Method void View.removeOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
				mRoot.addOnAttachStateChangeListener(ViewDataBinding.ROOT_REATTACHED_LISTENER);
		//   23   50:aload_0         
		//   24   51:getfield        #14  <Field ViewDataBinding this$0>
		//   25   54:invokestatic    #36  <Method View ViewDataBinding.access$400(ViewDataBinding)>
		//   26   57:invokestatic    #46  <Method android.view.View$OnAttachStateChangeListener ViewDataBinding.access$500()>
		//   27   60:invokevirtual   #53  <Method void View.addOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
				return;
		//   28   63:return          
			} else
			{
				executePendingBindings();
		//   29   64:aload_0         
		//   30   65:getfield        #14  <Field ViewDataBinding this$0>
		//   31   68:invokevirtual   #56  <Method void ViewDataBinding.executePendingBindings()>
				return;
		//   32   71:return          
			}
			Exception exception;
			exception;
		//   33   72:astore_1        
			this;
		//   34   73:aload_0         
			JVM INSTR monitorexit ;
		//   35   74:monitorexit     
			throw exception;
		//   36   75:aload_1         
		//   37   76:athrow          
		}

		final ViewDataBinding this$0;

			
			{
				this$0 = ViewDataBinding.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ViewDataBinding this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private final View mRoot;
	private Handler mUIThreadHandler;

	static 
	{
		SDK_INT = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #111 <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:putstatic       #112 <Field int SDK_INT>
	//    2    6:bipush          8
	//    3    8:putstatic       #114 <Field int BINDING_NUMBER_START>
		boolean flag;
		if(SDK_INT >= 16)
	//*   4   11:getstatic       #112 <Field int SDK_INT>
	//*   5   14:bipush          16
	//*   6   16:icmplt          24
			flag = true;
	//    7   19:iconst_1        
	//    8   20:istore_0        
		else
	//*   9   21:goto            26
			flag = false;
	//   10   24:iconst_0        
	//   11   25:istore_0        
		USE_CHOREOGRAPHER = flag;
	//   12   26:iload_0         
	//   13   27:putstatic       #116 <Field boolean USE_CHOREOGRAPHER>
	//   14   30:new             #6   <Class ViewDataBinding$1>
	//   15   33:dup             
	//   16   34:invokespecial   #119 <Method void ViewDataBinding$1()>
	//   17   37:putstatic       #121 <Field ViewDataBinding$CreateWeakListener CREATE_PROPERTY_LISTENER>
	//   18   40:new             #8   <Class ViewDataBinding$2>
	//   19   43:dup             
	//   20   44:invokespecial   #122 <Method void ViewDataBinding$2()>
	//   21   47:putstatic       #124 <Field ViewDataBinding$CreateWeakListener CREATE_LIST_LISTENER>
	//   22   50:new             #10  <Class ViewDataBinding$3>
	//   23   53:dup             
	//   24   54:invokespecial   #125 <Method void ViewDataBinding$3()>
	//   25   57:putstatic       #127 <Field ViewDataBinding$CreateWeakListener CREATE_MAP_LISTENER>
	//   26   60:new             #12  <Class ViewDataBinding$4>
	//   27   63:dup             
	//   28   64:invokespecial   #128 <Method void ViewDataBinding$4()>
	//   29   67:putstatic       #130 <Field ViewDataBinding$CreateWeakListener CREATE_LIVE_DATA_LISTENER>
	//   30   70:new             #14  <Class ViewDataBinding$5>
	//   31   73:dup             
	//   32   74:invokespecial   #131 <Method void ViewDataBinding$5()>
	//   33   77:putstatic       #133 <Field CallbackRegistry$NotifierCallback REBIND_NOTIFIER>
	//   34   80:new             #135 <Class ReferenceQueue>
	//   35   83:dup             
	//   36   84:invokespecial   #136 <Method void ReferenceQueue()>
	//   37   87:putstatic       #138 <Field ReferenceQueue sReferenceQueue>
		if(android.os.Build.VERSION.SDK_INT < 19)
	//*  38   90:getstatic       #111 <Field int android.os.Build$VERSION.SDK_INT>
	//*  39   93:bipush          19
	//*  40   95:icmpge          103
			ROOT_REATTACHED_LISTENER = null;
	//   41   98:aconst_null     
	//   42   99:putstatic       #140 <Field android.view.View$OnAttachStateChangeListener ROOT_REATTACHED_LISTENER>
	//   43  102:return          
		else
			ROOT_REATTACHED_LISTENER = new android.view.View.OnAttachStateChangeListener() {

				public void onViewAttachedToWindow(View view)
				{
					ViewDataBinding.getBinding(view).mRebindRunnable.run();
				//    0    0:aload_1         
				//    1    1:invokestatic    #22  <Method ViewDataBinding ViewDataBinding.getBinding(View)>
				//    2    4:invokestatic    #26  <Method Runnable ViewDataBinding.access$100(ViewDataBinding)>
				//    3    7:invokeinterface #31  <Method void Runnable.run()>
					view.removeOnAttachStateChangeListener(((android.view.View.OnAttachStateChangeListener) (this)));
				//    4   12:aload_1         
				//    5   13:aload_0         
				//    6   14:invokevirtual   #37  <Method void View.removeOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
				//    7   17:return          
				}

				public void onViewDetachedFromWindow(View view)
				{
				//    0    0:return          
				}

			}
;
	//   44  103:new             #16  <Class ViewDataBinding$6>
	//   45  106:dup             
	//   46  107:invokespecial   #141 <Method void ViewDataBinding$6()>
	//   47  110:putstatic       #140 <Field android.view.View$OnAttachStateChangeListener ROOT_REATTACHED_LISTENER>
	//*  48  113:return          
	}


/*
	static boolean access$002(ViewDataBinding viewdatabinding, boolean flag)
	{
		viewdatabinding.mRebindHalted = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #153 <Field boolean mRebindHalted>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static Runnable access$100(ViewDataBinding viewdatabinding)
	{
		return viewdatabinding.mRebindRunnable;
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field Runnable mRebindRunnable>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$202(ViewDataBinding viewdatabinding, boolean flag)
	{
		viewdatabinding.mPendingRebind = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #151 <Field boolean mPendingRebind>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static void access$300()
	{
		processReferenceQueue();
	//    0    0:invokestatic    #199 <Method void processReferenceQueue()>
		return;
	//    1    3:return          
	}

*/


/*
	static View access$400(ViewDataBinding viewdatabinding)
	{
		return viewdatabinding.mRoot;
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field View mRoot>
	//    2    4:areturn         
	}

*/


/*
	static android.view.View.OnAttachStateChangeListener access$500()
	{
		return ROOT_REATTACHED_LISTENER;
	//    0    0:getstatic       #140 <Field android.view.View$OnAttachStateChangeListener ROOT_REATTACHED_LISTENER>
	//    1    3:areturn         
	}

*/


/*
	static ReferenceQueue access$700()
	{
		return sReferenceQueue;
	//    0    0:getstatic       #138 <Field ReferenceQueue sReferenceQueue>
	//    1    3:areturn         
	}

*/


/*
	static void access$800(ViewDataBinding viewdatabinding, int i, Object obj, int j)
	{
		viewdatabinding.handleFieldChange(i, obj, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #211 <Method void handleFieldChange(int, Object, int)>
		return;
	//    5    7:return          
	}

*/
}
