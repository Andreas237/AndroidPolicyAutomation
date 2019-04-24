// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

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
//			BaseObservable, DataBinderMapper, DataBindingUtil, CallbackRegistry, 
//			DataBindingComponent, InverseBindingListener, OnRebindCallback, Observable, 
//			ObservableList, ObservableMap

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

	private static interface ObservableReference
	{

		public abstract void addListener(Object obj);

		public abstract WeakListener getListener();

		public abstract void removeListener(Object obj);
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
			ObservableList observablelist1;
			if(viewdatabinding != null)
		//*   4    8:aload_2         
		//*   5    9:ifnonnull       13
		//*   6   12:return          
		//*   7   13:aload_0         
		//*   8   14:getfield        #25  <Field ViewDataBinding$WeakListener mListener>
		//*   9   17:invokevirtual   #50  <Method Object ViewDataBinding$WeakListener.getTarget()>
		//*  10   20:checkcast       #30  <Class ObservableList>
		//*  11   23:astore_3        
				if((observablelist1 = (ObservableList)mListener.getTarget()) == observablelist)
		//*  12   24:aload_3         
		//*  13   25:aload_1         
		//*  14   26:if_acmpne       12
				{
					viewdatabinding.handleFieldChange(mListener.mLocalFieldId, ((Object) (observablelist1)), 0);
		//   15   29:aload_2         
		//   16   30:aload_0         
		//   17   31:getfield        #25  <Field ViewDataBinding$WeakListener mListener>
		//   18   34:getfield        #54  <Field int ViewDataBinding$WeakListener.mLocalFieldId>
		//   19   37:aload_3         
		//   20   38:iconst_0        
		//   21   39:invokestatic    #58  <Method void ViewDataBinding.access$700(ViewDataBinding, int, Object, int)>
					return;
		//   22   42:return          
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
			if(mTarget != null)
		//*   6   10:aload_0         
		//*   7   11:getfield        #45  <Field Object mTarget>
		//*   8   14:ifnull          30
				mObservable.addListener(mTarget);
		//    9   17:aload_0         
		//   10   18:getfield        #29  <Field ViewDataBinding$ObservableReference mObservable>
		//   11   21:aload_0         
		//   12   22:getfield        #45  <Field Object mTarget>
		//   13   25:invokeinterface #53  <Method void ViewDataBinding$ObservableReference.addListener(Object)>
		//   14   30:return          
		}

		public boolean unregister()
		{
			boolean flag = false;
		//    0    0:iconst_0        
		//    1    1:istore_1        
			if(mTarget != null)
		//*   2    2:aload_0         
		//*   3    3:getfield        #45  <Field Object mTarget>
		//*   4    6:ifnull          24
			{
				mObservable.removeListener(mTarget);
		//    5    9:aload_0         
		//    6   10:getfield        #29  <Field ViewDataBinding$ObservableReference mObservable>
		//    7   13:aload_0         
		//    8   14:getfield        #45  <Field Object mTarget>
		//    9   17:invokeinterface #57  <Method void ViewDataBinding$ObservableReference.removeListener(Object)>
				flag = true;
		//   10   22:iconst_1        
		//   11   23:istore_1        
			}
			mTarget = null;
		//   12   24:aload_0         
		//   13   25:aconst_null     
		//   14   26:putfield        #45  <Field Object mTarget>
			return flag;
		//   15   29:iload_1         
		//   16   30:ireturn         
		}

		protected final int mLocalFieldId;
		private final ObservableReference mObservable;
		private Object mTarget;

		public WeakListener(ViewDataBinding viewdatabinding, int i, ObservableReference observablereference)
		{
			super(((Object) (viewdatabinding)), ViewDataBinding.sReferenceQueue);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #22  <Method ReferenceQueue ViewDataBinding.access$600()>
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
			if(obj == null || observablemap != mListener.getTarget())
		//*   4    8:aload_2         
		//*   5    9:ifnull          23
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
		//   18   34:invokestatic    #59  <Method void ViewDataBinding.access$700(ViewDataBinding, int, Object, int)>
				return;
		//   19   37:return          
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
			ViewDataBinding viewdatabinding;
			for(viewdatabinding = mListener.getBinder(); viewdatabinding == null || (Observable)mListener.getTarget() != observable;)
		//*   0    0:aload_0         
		//*   1    1:getfield        #25  <Field ViewDataBinding$WeakListener mListener>
		//*   2    4:invokevirtual   #47  <Method ViewDataBinding ViewDataBinding$WeakListener.getBinder()>
		//*   3    7:astore_3        
		//*   4    8:aload_3         
		//*   5    9:ifnonnull       13
				return;
		//    6   12:return          

		//    7   13:aload_0         
		//    8   14:getfield        #25  <Field ViewDataBinding$WeakListener mListener>
		//    9   17:invokevirtual   #51  <Method Object ViewDataBinding$WeakListener.getTarget()>
		//   10   20:checkcast       #30  <Class Observable>
		//   11   23:aload_1         
		//   12   24:if_acmpne       12
			viewdatabinding.handleFieldChange(mListener.mLocalFieldId, ((Object) (observable)), i);
		//   13   27:aload_3         
		//   14   28:aload_0         
		//   15   29:getfield        #25  <Field ViewDataBinding$WeakListener mListener>
		//   16   32:getfield        #55  <Field int ViewDataBinding$WeakListener.mLocalFieldId>
		//   17   35:aload_1         
		//   18   36:iload_2         
		//   19   37:invokestatic    #59  <Method void ViewDataBinding.access$700(ViewDataBinding, int, Object, int)>
		//   20   40:return          
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
	//    1    1:invokespecial   #141 <Method void BaseObservable()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class ViewDataBinding$6>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #144 <Method void ViewDataBinding$6(ViewDataBinding)>
	//    7   13:putfield        #146 <Field Runnable mRebindRunnable>
		mPendingRebind = false;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #148 <Field boolean mPendingRebind>
		mRebindHalted = false;
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:putfield        #150 <Field boolean mRebindHalted>
		mBindingComponent = databindingcomponent;
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:putfield        #152 <Field DataBindingComponent mBindingComponent>
		mLocalFieldObservers = new WeakListener[i];
	//   17   31:aload_0         
	//   18   32:iload_3         
	//   19   33:anewarray       WeakListener[]
	//   20   36:putfield        #154 <Field ViewDataBinding$WeakListener[] mLocalFieldObservers>
		mRoot = view;
	//   21   39:aload_0         
	//   22   40:aload_2         
	//   23   41:putfield        #156 <Field View mRoot>
		if(Looper.myLooper() == null)
	//*  24   44:invokestatic    #162 <Method Looper Looper.myLooper()>
	//*  25   47:ifnonnull       60
			throw new IllegalStateException("DataBinding must be created in view's UI Thread");
	//   26   50:new             #164 <Class IllegalStateException>
	//   27   53:dup             
	//   28   54:ldc1            #166 <String "DataBinding must be created in view's UI Thread">
	//   29   56:invokespecial   #169 <Method void IllegalStateException(String)>
	//   30   59:athrow          
		if(USE_CHOREOGRAPHER)
	//*  31   60:getstatic       #116 <Field boolean USE_CHOREOGRAPHER>
	//*  32   63:ifeq            86
		{
			mChoreographer = Choreographer.getInstance();
	//   33   66:aload_0         
	//   34   67:invokestatic    #175 <Method Choreographer Choreographer.getInstance()>
	//   35   70:putfield        #177 <Field Choreographer mChoreographer>
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
	//   36   73:aload_0         
	//   37   74:new             #18  <Class ViewDataBinding$7>
	//   38   77:dup             
	//   39   78:aload_0         
	//   40   79:invokespecial   #178 <Method void ViewDataBinding$7(ViewDataBinding)>
	//   41   82:putfield        #180 <Field android.view.Choreographer$FrameCallback mFrameCallback>
			return;
	//   42   85:return          
		} else
		{
			mFrameCallback = null;
	//   43   86:aload_0         
	//   44   87:aconst_null     
	//   45   88:putfield        #180 <Field android.view.Choreographer$FrameCallback mFrameCallback>
			mUIThreadHandler = new Handler(Looper.myLooper());
	//   46   91:aload_0         
	//   47   92:new             #182 <Class Handler>
	//   48   95:dup             
	//   49   96:invokestatic    #162 <Method Looper Looper.myLooper()>
	//   50   99:invokespecial   #185 <Method void Handler(Looper)>
	//   51  102:putfield        #187 <Field Handler mUIThreadHandler>
			return;
	//   52  105:return          
		}
	}

	protected static ViewDataBinding bind(DataBindingComponent databindingcomponent, View view, int i)
	{
		return DataBindingUtil.bind(databindingcomponent, view, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #214 <Method ViewDataBinding DataBindingUtil.bind(DataBindingComponent, View, int)>
	//    4    6:areturn         
	}

	private void executeBindingsInternal()
	{
		if(mIsExecutingPendingBindings)
	//*   0    0:aload_0         
	//*   1    1:getfield        #217 <Field boolean mIsExecutingPendingBindings>
	//*   2    4:ifeq            12
			requestRebind();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #220 <Method void requestRebind()>
		else
	//*   5   11:return          
		if(hasPendingBindings())
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #224 <Method boolean hasPendingBindings()>
	//*   8   16:ifeq            11
		{
			mIsExecutingPendingBindings = true;
	//    9   19:aload_0         
	//   10   20:iconst_1        
	//   11   21:putfield        #217 <Field boolean mIsExecutingPendingBindings>
			mRebindHalted = false;
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:putfield        #150 <Field boolean mRebindHalted>
			if(mRebindCallbacks != null)
	//*  15   29:aload_0         
	//*  16   30:getfield        #226 <Field CallbackRegistry mRebindCallbacks>
	//*  17   33:ifnull          63
			{
				mRebindCallbacks.notifyCallbacks(((Object) (this)), 1, ((Object) (null)));
	//   18   36:aload_0         
	//   19   37:getfield        #226 <Field CallbackRegistry mRebindCallbacks>
	//   20   40:aload_0         
	//   21   41:iconst_1        
	//   22   42:aconst_null     
	//   23   43:invokevirtual   #232 <Method void CallbackRegistry.notifyCallbacks(Object, int, Object)>
				if(mRebindHalted)
	//*  24   46:aload_0         
	//*  25   47:getfield        #150 <Field boolean mRebindHalted>
	//*  26   50:ifeq            63
					mRebindCallbacks.notifyCallbacks(((Object) (this)), 2, ((Object) (null)));
	//   27   53:aload_0         
	//   28   54:getfield        #226 <Field CallbackRegistry mRebindCallbacks>
	//   29   57:aload_0         
	//   30   58:iconst_2        
	//   31   59:aconst_null     
	//   32   60:invokevirtual   #232 <Method void CallbackRegistry.notifyCallbacks(Object, int, Object)>
			}
			if(!mRebindHalted)
	//*  33   63:aload_0         
	//*  34   64:getfield        #150 <Field boolean mRebindHalted>
	//*  35   67:ifne            91
			{
				executeBindings();
	//   36   70:aload_0         
	//   37   71:invokevirtual   #235 <Method void executeBindings()>
				if(mRebindCallbacks != null)
	//*  38   74:aload_0         
	//*  39   75:getfield        #226 <Field CallbackRegistry mRebindCallbacks>
	//*  40   78:ifnull          91
					mRebindCallbacks.notifyCallbacks(((Object) (this)), 3, ((Object) (null)));
	//   41   81:aload_0         
	//   42   82:getfield        #226 <Field CallbackRegistry mRebindCallbacks>
	//   43   85:aload_0         
	//   44   86:iconst_3        
	//   45   87:aconst_null     
	//   46   88:invokevirtual   #232 <Method void CallbackRegistry.notifyCallbacks(Object, int, Object)>
			}
			mIsExecutingPendingBindings = false;
	//   47   91:aload_0         
	//   48   92:iconst_0        
	//   49   93:putfield        #217 <Field boolean mIsExecutingPendingBindings>
			return;
	//   50   96:return          
		}
	}

	protected static void executeBindingsOn(ViewDataBinding viewdatabinding)
	{
		viewdatabinding.executeBindingsInternal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method void executeBindingsInternal()>
	//    2    4:return          
	}

	private static int findIncludeIndex(String s, int i, IncludedLayouts includedlayouts, int j)
	{
		s = ((String) (s.subSequence(s.indexOf('/') + 1, s.length() - 2)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:bipush          47
	//    3    4:invokevirtual   #244 <Method int String.indexOf(int)>
	//    4    7:iconst_1        
	//    5    8:iadd            
	//    6    9:aload_0         
	//    7   10:invokevirtual   #105 <Method int String.length()>
	//    8   13:iconst_2        
	//    9   14:isub            
	//   10   15:invokevirtual   #248 <Method CharSequence String.subSequence(int, int)>
	//   11   18:astore_0        
		includedlayouts = ((IncludedLayouts) (includedlayouts.layouts[j]));
	//   12   19:aload_2         
	//   13   20:getfield        #252 <Field String[][] ViewDataBinding$IncludedLayouts.layouts>
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
	//*  27   38:invokestatic    #258 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
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
	//    2    2:invokevirtual   #266 <Method View ViewGroup.getChildAt(int)>
	//    3    5:invokevirtual   #272 <Method Object View.getTag()>
	//    4    8:checkcast       #101 <Class String>
	//    5   11:astore          7
		String s1 = s.substring(0, s.length() - 1);
	//    6   13:aload           7
	//    7   15:iconst_0        
	//    8   16:aload           7
	//    9   18:invokevirtual   #105 <Method int String.length()>
	//   10   21:iconst_1        
	//   11   22:isub            
	//   12   23:invokevirtual   #276 <Method String String.substring(int, int)>
	//   13   26:astore          8
		int l = s1.length();
	//   14   28:aload           8
	//   15   30:invokevirtual   #105 <Method int String.length()>
	//   16   33:istore          4
		int i1 = viewgroup.getChildCount();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #279 <Method int ViewGroup.getChildCount()>
	//   19   39:istore          5
		int j = i;
	//   20   41:iload_1         
	//   21   42:istore_2        
		i++;
	//   22   43:iload_1         
	//   23   44:iconst_1        
	//   24   45:iadd            
	//   25   46:istore_1        
		do
		{
			int k;
label0:
			{
				Object obj;
label1:
				{
					if(i < i1)
	//*  26   47:iload_1         
	//*  27   48:iload           5
	//*  28   50:icmpge          130
					{
						obj = ((Object) (viewgroup.getChildAt(i)));
	//   29   53:aload_0         
	//   30   54:iload_1         
	//   31   55:invokevirtual   #266 <Method View ViewGroup.getChildAt(int)>
	//   32   58:astore          6
						if(((View) (obj)).getTag() instanceof String)
	//*  33   60:aload           6
	//*  34   62:invokevirtual   #272 <Method Object View.getTag()>
	//*  35   65:instanceof      #101 <Class String>
	//*  36   68:ifeq            132
							obj = ((Object) ((String)((View) (obj)).getTag()));
	//   37   71:aload           6
	//   38   73:invokevirtual   #272 <Method Object View.getTag()>
	//   39   76:checkcast       #101 <Class String>
	//   40   79:astore          6
						else
	//*  41   81:iload_2         
	//*  42   82:istore_3        
	//*  43   83:aload           6
	//*  44   85:ifnull          152
	//*  45   88:iload_2         
	//*  46   89:istore_3        
	//*  47   90:aload           6
	//*  48   92:aload           8
	//*  49   94:invokevirtual   #283 <Method boolean String.startsWith(String)>
	//*  50   97:ifeq            152
	//*  51  100:aload           6
	//*  52  102:invokevirtual   #105 <Method int String.length()>
	//*  53  105:aload           7
	//*  54  107:invokevirtual   #105 <Method int String.length()>
	//*  55  110:icmpne          138
	//*  56  113:aload           6
	//*  57  115:aload           6
	//*  58  117:invokevirtual   #105 <Method int String.length()>
	//*  59  120:iconst_1        
	//*  60  121:isub            
	//*  61  122:invokevirtual   #287 <Method char String.charAt(int)>
	//*  62  125:bipush          48
	//*  63  127:icmpne          138
	//*  64  130:iload_2         
	//*  65  131:ireturn         
							obj = null;
	//   66  132:aconst_null     
	//   67  133:astore          6
						k = j;
						if(obj == null)
							break label0;
						k = j;
						if(!((String) (obj)).startsWith(s1))
							break label0;
						if(((String) (obj)).length() != s.length() || ((String) (obj)).charAt(((String) (obj)).length() - 1) != '0')
							break label1;
					}
					return j;
				}
	//*  68  135:goto            81
				k = j;
	//   69  138:iload_2         
	//   70  139:istore_3        
				if(isNumeric(((String) (obj)), l))
	//*  71  140:aload           6
	//*  72  142:iload           4
	//*  73  144:invokestatic    #291 <Method boolean isNumeric(String, int)>
	//*  74  147:ifeq            152
					k = i;
	//   75  150:iload_1         
	//   76  151:istore_3        
			}
			i++;
	//   77  152:iload_1         
	//   78  153:iconst_1        
	//   79  154:iadd            
	//   80  155:istore_1        
			j = k;
	//   81  156:iload_3         
	//   82  157:istore_2        
		} while(true);
	//   83  158:goto            47
	}

	static ViewDataBinding getBinding(View view)
	{
		if(view != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          38
		{
			if(USE_TAG_ID)
	//*   2    4:getstatic       #114 <Field boolean USE_TAG_ID>
	//*   3    7:ifeq            21
				return (ViewDataBinding)view.getTag(com.android.databinding.library.R.id.dataBinding);
	//    4   10:aload_0         
	//    5   11:getstatic       #298 <Field int com.android.databinding.library.R$id.dataBinding>
	//    6   14:invokevirtual   #301 <Method Object View.getTag(int)>
	//    7   17:checkcast       #2   <Class ViewDataBinding>
	//    8   20:areturn         
			view = ((View) (view.getTag()));
	//    9   21:aload_0         
	//   10   22:invokevirtual   #272 <Method Object View.getTag()>
	//   11   25:astore_0        
			if(view instanceof ViewDataBinding)
	//*  12   26:aload_0         
	//*  13   27:instanceof      #2   <Class ViewDataBinding>
	//*  14   30:ifeq            38
				return (ViewDataBinding)view;
	//   15   33:aload_0         
	//   16   34:checkcast       #2   <Class ViewDataBinding>
	//   17   37:areturn         
		}
		return null;
	//   18   38:aconst_null     
	//   19   39:areturn         
	}

	public static int getBuildSdkInt()
	{
		return SDK_INT;
	//    0    0:getstatic       #99  <Field int SDK_INT>
	//    1    3:ireturn         
	}

	protected static int getColorFromResource(View view, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #98  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          17
			return view.getContext().getColor(i);
	//    3    8:aload_0         
	//    4    9:invokevirtual   #308 <Method Context View.getContext()>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #313 <Method int Context.getColor(int)>
	//    7   16:ireturn         
		else
			return view.getResources().getColor(i);
	//    8   17:aload_0         
	//    9   18:invokevirtual   #317 <Method Resources View.getResources()>
	//   10   21:iload_1         
	//   11   22:invokevirtual   #320 <Method int Resources.getColor(int)>
	//   12   25:ireturn         
	}

	protected static ColorStateList getColorStateListFromResource(View view, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #98  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          17
			return view.getContext().getColorStateList(i);
	//    3    8:aload_0         
	//    4    9:invokevirtual   #308 <Method Context View.getContext()>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #326 <Method ColorStateList Context.getColorStateList(int)>
	//    7   16:areturn         
		else
			return view.getResources().getColorStateList(i);
	//    8   17:aload_0         
	//    9   18:invokevirtual   #317 <Method Resources View.getResources()>
	//   10   21:iload_1         
	//   11   22:invokevirtual   #327 <Method ColorStateList Resources.getColorStateList(int)>
	//   12   25:areturn         
	}

	protected static Drawable getDrawableFromResource(View view, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #98  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          17
			return view.getContext().getDrawable(i);
	//    3    8:aload_0         
	//    4    9:invokevirtual   #308 <Method Context View.getContext()>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #333 <Method Drawable Context.getDrawable(int)>
	//    7   16:areturn         
		else
			return view.getResources().getDrawable(i);
	//    8   17:aload_0         
	//    9   18:invokevirtual   #317 <Method Resources View.getResources()>
	//   10   21:iload_1         
	//   11   22:invokevirtual   #334 <Method Drawable Resources.getDrawable(int)>
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
	//    6    8:invokeinterface #342 <Method Object Map.get(Object)>
	//    7   13:areturn         
	}

	protected static byte getFromArray(byte abyte0[], int i)
	{
		if(abyte0 == null || i < 0 || i >= abyte0.length)
	//*   0    0:aload_0         
	//*   1    1:ifnull          14
	//*   2    4:iload_1         
	//*   3    5:iflt            14
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:arraylength     
	//*   7   11:icmplt          16
			return 0;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		else
			return abyte0[i];
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:baload          
	//   13   19:ireturn         
	}

	protected static char getFromArray(char ac[], int i)
	{
		if(ac == null || i < 0 || i >= ac.length)
	//*   0    0:aload_0         
	//*   1    1:ifnull          14
	//*   2    4:iload_1         
	//*   3    5:iflt            14
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:arraylength     
	//*   7   11:icmplt          16
			return '\0';
	//    8   14:iconst_0        
	//    9   15:ireturn         
		else
			return ac[i];
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:caload          
	//   13   19:ireturn         
	}

	protected static double getFromArray(double ad[], int i)
	{
		if(ad == null || i < 0 || i >= ad.length)
	//*   0    0:aload_0         
	//*   1    1:ifnull          14
	//*   2    4:iload_1         
	//*   3    5:iflt            14
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:arraylength     
	//*   7   11:icmplt          16
			return 0.0D;
	//    8   14:dconst_0        
	//    9   15:dreturn         
		else
			return ad[i];
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:daload          
	//   13   19:dreturn         
	}

	protected static float getFromArray(float af[], int i)
	{
		if(af == null || i < 0 || i >= af.length)
	//*   0    0:aload_0         
	//*   1    1:ifnull          14
	//*   2    4:iload_1         
	//*   3    5:iflt            14
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:arraylength     
	//*   7   11:icmplt          16
			return 0.0F;
	//    8   14:fconst_0        
	//    9   15:freturn         
		else
			return af[i];
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:faload          
	//   13   19:freturn         
	}

	protected static int getFromArray(int ai[], int i)
	{
		if(ai == null || i < 0 || i >= ai.length)
	//*   0    0:aload_0         
	//*   1    1:ifnull          14
	//*   2    4:iload_1         
	//*   3    5:iflt            14
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:arraylength     
	//*   7   11:icmplt          16
			return 0;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		else
			return ai[i];
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:iaload          
	//   13   19:ireturn         
	}

	protected static long getFromArray(long al[], int i)
	{
		if(al == null || i < 0 || i >= al.length)
	//*   0    0:aload_0         
	//*   1    1:ifnull          14
	//*   2    4:iload_1         
	//*   3    5:iflt            14
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:arraylength     
	//*   7   11:icmplt          16
			return 0L;
	//    8   14:lconst_0        
	//    9   15:lreturn         
		else
			return al[i];
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:laload          
	//   13   19:lreturn         
	}

	protected static Object getFromArray(Object aobj[], int i)
	{
		if(aobj == null || i < 0 || i >= aobj.length)
	//*   0    0:aload_0         
	//*   1    1:ifnull          14
	//*   2    4:iload_1         
	//*   3    5:iflt            14
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:arraylength     
	//*   7   11:icmplt          16
			return ((Object) (null));
	//    8   14:aconst_null     
	//    9   15:areturn         
		else
			return aobj[i];
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:aaload          
	//   13   19:areturn         
	}

	protected static short getFromArray(short aword0[], int i)
	{
		if(aword0 == null || i < 0 || i >= aword0.length)
	//*   0    0:aload_0         
	//*   1    1:ifnull          14
	//*   2    4:iload_1         
	//*   3    5:iflt            14
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:arraylength     
	//*   7   11:icmplt          16
			return 0;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		else
			return aword0[i];
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:saload          
	//   13   19:ireturn         
	}

	protected static boolean getFromArray(boolean aflag[], int i)
	{
		if(aflag == null || i < 0 || i >= aflag.length)
	//*   0    0:aload_0         
	//*   1    1:ifnull          14
	//*   2    4:iload_1         
	//*   3    5:iflt            14
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:arraylength     
	//*   7   11:icmplt          16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		else
			return aflag[i];
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:baload          
	//   13   19:ireturn         
	}

	protected static int getFromList(SparseIntArray sparseintarray, int i)
	{
		if(sparseintarray == null || i < 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          8
	//*   2    4:iload_1         
	//*   3    5:ifge            10
			return 0;
	//    4    8:iconst_0        
	//    5    9:ireturn         
		else
			return sparseintarray.get(i);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:invokevirtual   #361 <Method int SparseIntArray.get(int)>
	//    9   15:ireturn         
	}

	protected static long getFromList(SparseLongArray sparselongarray, int i)
	{
		if(sparselongarray == null || i < 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          8
	//*   2    4:iload_1         
	//*   3    5:ifge            10
			return 0L;
	//    4    8:lconst_0        
	//    5    9:lreturn         
		else
			return sparselongarray.get(i);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:invokevirtual   #370 <Method long SparseLongArray.get(int)>
	//    9   15:lreturn         
	}

	protected static Object getFromList(LongSparseArray longsparsearray, int i)
	{
		if(longsparsearray == null || i < 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          8
	//*   2    4:iload_1         
	//*   3    5:ifge            10
			return ((Object) (null));
	//    4    8:aconst_null     
	//    5    9:areturn         
		else
			return longsparsearray.get(i);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:i2l             
	//    9   13:invokevirtual   #377 <Method Object LongSparseArray.get(long)>
	//   10   16:areturn         
	}

	protected static Object getFromList(android.util.LongSparseArray longsparsearray, int i)
	{
		if(longsparsearray == null || i < 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          8
	//*   2    4:iload_1         
	//*   3    5:ifge            10
			return ((Object) (null));
	//    4    8:aconst_null     
	//    5    9:areturn         
		else
			return longsparsearray.get(i);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:i2l             
	//    9   13:invokevirtual   #383 <Method Object android.util.LongSparseArray.get(long)>
	//   10   16:areturn         
	}

	protected static Object getFromList(SparseArray sparsearray, int i)
	{
		if(sparsearray == null || i < 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          8
	//*   2    4:iload_1         
	//*   3    5:ifge            10
			return ((Object) (null));
	//    4    8:aconst_null     
	//    5    9:areturn         
		else
			return sparsearray.get(i);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:invokevirtual   #389 <Method Object SparseArray.get(int)>
	//    9   15:areturn         
	}

	protected static Object getFromList(List list, int i)
	{
		if(list == null || i < 0 || i >= list.size())
	//*   0    0:aload_0         
	//*   1    1:ifnull          18
	//*   2    4:iload_1         
	//*   3    5:iflt            18
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:invokeinterface #396 <Method int List.size()>
	//*   7   15:icmplt          20
			return ((Object) (null));
	//    8   18:aconst_null     
	//    9   19:areturn         
		else
			return list.get(i);
	//   10   20:aload_0         
	//   11   21:iload_1         
	//   12   22:invokeinterface #397 <Method Object List.get(int)>
	//   13   27:areturn         
	}

	protected static boolean getFromList(SparseBooleanArray sparsebooleanarray, int i)
	{
		if(sparsebooleanarray == null || i < 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          8
	//*   2    4:iload_1         
	//*   3    5:ifge            10
			return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
		else
			return sparsebooleanarray.get(i);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:invokevirtual   #404 <Method boolean SparseBooleanArray.get(int)>
	//    9   15:ireturn         
	}

	private void handleFieldChange(int i, Object obj, int j)
	{
		if(onFieldChange(i, obj, j))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:aload_2         
	//*   3    3:iload_3         
	//*   4    4:invokevirtual   #408 <Method boolean onFieldChange(int, Object, int)>
	//*   5    7:ifeq            14
			requestRebind();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #220 <Method void requestRebind()>
	//    8   14:return          
	}

	private static boolean isNumeric(String s, int i)
	{
		int j = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #105 <Method int String.length()>
	//    2    4:istore_2        
		if(j != i) goto _L2; else goto _L1
	//    3    5:iload_2         
	//    4    6:iload_1         
	//    5    7:icmpne          12
_L1:
		return false;
	//    6   10:iconst_0        
	//    7   11:ireturn         
_L2:
label0:
		do
		{
label1:
			{
				if(i >= j)
					break label1;
	//    8   12:iload_1         
	//    9   13:iload_2         
	//   10   14:icmpge          35
				if(!Character.isDigit(s.charAt(i)))
					break label0;
	//   11   17:aload_0         
	//   12   18:iload_1         
	//   13   19:invokevirtual   #287 <Method char String.charAt(int)>
	//   14   22:invokestatic    #414 <Method boolean Character.isDigit(char)>
	//   15   25:ifeq            10
				i++;
	//   16   28:iload_1         
	//   17   29:iconst_1        
	//   18   30:iadd            
	//   19   31:istore_1        
			}
		} while(true);
	//   20   32:goto            12
		if(true) goto _L1; else goto _L3
_L3:
		return true;
	//   21   35:iconst_1        
	//   22   36:ireturn         
	}

	private static void mapBindings(DataBindingComponent databindingcomponent, View view, Object aobj[], IncludedLayouts includedlayouts, SparseIntArray sparseintarray, boolean flag)
	{
		if(getBinding(view) == null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:invokestatic    #418 <Method ViewDataBinding getBinding(View)>
	//    2    4:ifnull          8
_L1:
		return;
	//    3    7:return          
_L2:
		int i;
		int j;
		Object obj;
		obj = view.getTag();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #272 <Method Object View.getTag()>
	//    6   12:astore          15
		int l;
		boolean flag1;
		boolean flag2;
		int k1;
		int l1;
		String s;
		if(obj instanceof String)
	//*   7   14:aload           15
	//*   8   16:instanceof      #101 <Class String>
	//*   9   19:ifeq            442
			obj = ((Object) ((String)obj));
	//   10   22:aload           15
	//   11   24:checkcast       #101 <Class String>
	//   12   27:astore          15
		else
	//*  13   29:iconst_0        
	//*  14   30:istore          7
	//*  15   32:iload           5
	//*  16   34:ifeq            457
	//*  17   37:aload           15
	//*  18   39:ifnull          457
	//*  19   42:aload           15
	//*  20   44:ldc2            #420 <String "layout">
	//*  21   47:invokevirtual   #283 <Method boolean String.startsWith(String)>
	//*  22   50:ifeq            457
	//*  23   53:aload           15
	//*  24   55:bipush          95
	//*  25   57:invokevirtual   #423 <Method int String.lastIndexOf(int)>
	//*  26   60:istore          6
	//*  27   62:iload           6
	//*  28   64:ifle            451
	//*  29   67:aload           15
	//*  30   69:iload           6
	//*  31   71:iconst_1        
	//*  32   72:iadd            
	//*  33   73:invokestatic    #291 <Method boolean isNumeric(String, int)>
	//*  34   76:ifeq            451
	//*  35   79:aload           15
	//*  36   81:iload           6
	//*  37   83:iconst_1        
	//*  38   84:iadd            
	//*  39   85:invokestatic    #427 <Method int parseTagInt(String, int)>
	//*  40   88:istore          6
	//*  41   90:aload_2         
	//*  42   91:iload           6
	//*  43   93:aaload          
	//*  44   94:ifnonnull       102
	//*  45   97:aload_2         
	//*  46   98:iload           6
	//*  47  100:aload_1         
	//*  48  101:aastore         
	//*  49  102:aload_3         
	//*  50  103:ifnonnull       448
	//*  51  106:iconst_m1       
	//*  52  107:istore          6
	//*  53  109:iconst_1        
	//*  54  110:istore          7
	//*  55  112:iload           7
	//*  56  114:ifne            160
	//*  57  117:aload_1         
	//*  58  118:invokevirtual   #430 <Method int View.getId()>
	//*  59  121:istore          7
	//*  60  123:iload           7
	//*  61  125:ifle            160
	//*  62  128:aload           4
	//*  63  130:ifnull          160
	//*  64  133:aload           4
	//*  65  135:iload           7
	//*  66  137:iconst_m1       
	//*  67  138:invokevirtual   #433 <Method int SparseIntArray.get(int, int)>
	//*  68  141:istore          7
	//*  69  143:iload           7
	//*  70  145:iflt            160
	//*  71  148:aload_2         
	//*  72  149:iload           7
	//*  73  151:aaload          
	//*  74  152:ifnonnull       160
	//*  75  155:aload_2         
	//*  76  156:iload           7
	//*  77  158:aload_1         
	//*  78  159:aastore         
	//*  79  160:aload_1         
	//*  80  161:instanceof      #262 <Class ViewGroup>
	//*  81  164:ifeq            7
	//*  82  167:aload_1         
	//*  83  168:checkcast       #262 <Class ViewGroup>
	//*  84  171:astore_1        
	//*  85  172:aload_1         
	//*  86  173:invokevirtual   #279 <Method int ViewGroup.getChildCount()>
	//*  87  176:istore          13
	//*  88  178:iconst_0        
	//*  89  179:istore          10
	//*  90  181:iconst_0        
	//*  91  182:istore          7
	//*  92  184:iload           7
	//*  93  186:iload           13
	//*  94  188:icmpge          7
	//*  95  191:aload_1         
	//*  96  192:iload           7
	//*  97  194:invokevirtual   #266 <Method View ViewGroup.getChildAt(int)>
	//*  98  197:astore          15
	//*  99  199:iconst_0        
	//* 100  200:istore          12
	//* 101  202:iload           7
	//* 102  204:istore          8
	//* 103  206:iload           12
	//* 104  208:istore          11
	//* 105  210:iload           10
	//* 106  212:istore          9
	//* 107  214:iload           6
	//* 108  216:iflt            413
	//* 109  219:iload           7
	//* 110  221:istore          8
	//* 111  223:iload           12
	//* 112  225:istore          11
	//* 113  227:iload           10
	//* 114  229:istore          9
	//* 115  231:aload           15
	//* 116  233:invokevirtual   #272 <Method Object View.getTag()>
	//* 117  236:instanceof      #101 <Class String>
	//* 118  239:ifeq            413
	//* 119  242:aload           15
	//* 120  244:invokevirtual   #272 <Method Object View.getTag()>
	//* 121  247:checkcast       #101 <Class String>
	//* 122  250:astore          16
	//* 123  252:iload           7
	//* 124  254:istore          8
	//* 125  256:iload           12
	//* 126  258:istore          11
	//* 127  260:iload           10
	//* 128  262:istore          9
	//* 129  264:aload           16
	//* 130  266:ldc2            #435 <String "_0">
	//* 131  269:invokevirtual   #438 <Method boolean String.endsWith(String)>
	//* 132  272:ifeq            413
	//* 133  275:iload           7
	//* 134  277:istore          8
	//* 135  279:iload           12
	//* 136  281:istore          11
	//* 137  283:iload           10
	//* 138  285:istore          9
	//* 139  287:aload           16
	//* 140  289:ldc2            #420 <String "layout">
	//* 141  292:invokevirtual   #283 <Method boolean String.startsWith(String)>
	//* 142  295:ifeq            413
	//* 143  298:iload           7
	//* 144  300:istore          8
	//* 145  302:iload           12
	//* 146  304:istore          11
	//* 147  306:iload           10
	//* 148  308:istore          9
	//* 149  310:aload           16
	//* 150  312:bipush          47
	//* 151  314:invokevirtual   #244 <Method int String.indexOf(int)>
	//* 152  317:ifle            413
	//* 153  320:aload           16
	//* 154  322:iload           10
	//* 155  324:aload_3         
	//* 156  325:iload           6
	//* 157  327:invokestatic    #440 <Method int findIncludeIndex(String, int, ViewDataBinding$IncludedLayouts, int)>
	//* 158  330:istore          14
	//* 159  332:iload           7
	//* 160  334:istore          8
	//* 161  336:iload           12
	//* 162  338:istore          11
	//* 163  340:iload           10
	//* 164  342:istore          9
	//* 165  344:iload           14
	//* 166  346:iflt            413
	//* 167  349:iconst_1        
	//* 168  350:istore          11
	//* 169  352:iload           14
	//* 170  354:iconst_1        
	//* 171  355:iadd            
	//* 172  356:istore          9
	//* 173  358:aload_3         
	//* 174  359:getfield        #444 <Field int[][] ViewDataBinding$IncludedLayouts.indexes>
	//* 175  362:iload           6
	//* 176  364:aaload          
	//* 177  365:iload           14
	//* 178  367:iaload          
	//* 179  368:istore          10
	//* 180  370:aload_3         
	//* 181  371:getfield        #447 <Field int[][] ViewDataBinding$IncludedLayouts.layoutIds>
	//* 182  374:iload           6
	//* 183  376:aaload          
	//* 184  377:iload           14
	//* 185  379:iaload          
	//* 186  380:istore          12
	//* 187  382:aload_1         
	//* 188  383:iload           7
	//* 189  385:invokestatic    #449 <Method int findLastMatching(ViewGroup, int)>
	//* 190  388:istore          8
	//* 191  390:iload           8
	//* 192  392:iload           7
	//* 193  394:icmpne          516
	//* 194  397:aload_2         
	//* 195  398:iload           10
	//* 196  400:aload_0         
	//* 197  401:aload           15
	//* 198  403:iload           12
	//* 199  405:invokestatic    #214 <Method ViewDataBinding DataBindingUtil.bind(DataBindingComponent, View, int)>
	//* 200  408:aastore         
	//* 201  409:iload           7
	//* 202  411:istore          8
	//* 203  413:iload           11
	//* 204  415:ifne            429
	//* 205  418:aload_0         
	//* 206  419:aload           15
	//* 207  421:aload_2         
	//* 208  422:aload_3         
	//* 209  423:aload           4
	//* 210  425:iconst_0        
	//* 211  426:invokestatic    #451 <Method void mapBindings(DataBindingComponent, View, Object[], ViewDataBinding$IncludedLayouts, SparseIntArray, boolean)>
	//* 212  429:iload           8
	//* 213  431:iconst_1        
	//* 214  432:iadd            
	//* 215  433:istore          7
	//* 216  435:iload           9
	//* 217  437:istore          10
	//* 218  439:goto            184
			obj = null;
	//  219  442:aconst_null     
	//  220  443:astore          15
		j = 0;
		if(!flag || obj == null || !((String) (obj)).startsWith("layout")) goto _L4; else goto _L3
_L3:
		i = ((String) (obj)).lastIndexOf('_');
		if(i > 0 && isNumeric(((String) (obj)), i + 1))
		{
			i = parseTagInt(((String) (obj)), i + 1);
			if(aobj[i] == null)
				aobj[i] = ((Object) (view));
			if(includedlayouts == null)
				i = -1;
			j = 1;
		} else
	//* 221  445:goto            29
	//* 222  448:goto            109
		{
			i = -1;
	//  223  451:iconst_m1       
	//  224  452:istore          6
		}
_L5:
		if(j == 0)
		{
			j = view.getId();
			if(j > 0 && sparseintarray != null)
			{
				j = sparseintarray.get(j, -1);
				if(j >= 0 && aobj[j] == null)
					aobj[j] = ((Object) (view));
			}
		}
		if(view instanceof ViewGroup)
		{
			view = ((View) ((ViewGroup)view));
			k1 = ((ViewGroup) (view)).getChildCount();
			int i1 = 0;
			j = 0;
			while(j < k1) 
			{
				obj = ((Object) (((ViewGroup) (view)).getChildAt(j)));
				flag2 = false;
				int k = j;
				flag1 = flag2;
				l = i1;
				if(i >= 0)
				{
					k = j;
					flag1 = flag2;
					l = i1;
					if(((View) (obj)).getTag() instanceof String)
					{
						s = (String)((View) (obj)).getTag();
						k = j;
						flag1 = flag2;
						l = i1;
						if(s.endsWith("_0"))
						{
							k = j;
							flag1 = flag2;
							l = i1;
							if(s.startsWith("layout"))
							{
								k = j;
								flag1 = flag2;
								l = i1;
								if(s.indexOf('/') > 0)
								{
									l1 = findIncludeIndex(s, i1, includedlayouts, i);
									k = j;
									flag1 = flag2;
									l = i1;
									if(l1 >= 0)
									{
										flag1 = true;
										l = l1 + 1;
										i1 = includedlayouts.indexes[i][l1];
										int j1 = includedlayouts.layoutIds[i][l1];
										k = findLastMatching(((ViewGroup) (view)), j);
										if(k == j)
										{
											aobj[i1] = ((Object) (DataBindingUtil.bind(databindingcomponent, ((View) (obj)), j1)));
											k = j;
										} else
	//* 225  454:goto            112
	//* 226  457:aload           15
	//* 227  459:ifnull          510
	//* 228  462:aload           15
	//* 229  464:ldc1            #48  <String "binding_">
	//* 230  466:invokevirtual   #283 <Method boolean String.startsWith(String)>
	//* 231  469:ifeq            510
	//* 232  472:aload           15
	//* 233  474:getstatic       #107 <Field int BINDING_NUMBER_START>
	//* 234  477:invokestatic    #427 <Method int parseTagInt(String, int)>
	//* 235  480:istore          6
	//* 236  482:aload_2         
	//* 237  483:iload           6
	//* 238  485:aaload          
	//* 239  486:ifnonnull       494
	//* 240  489:aload_2         
	//* 241  490:iload           6
	//* 242  492:aload_1         
	//* 243  493:aastore         
	//* 244  494:iconst_1        
	//* 245  495:istore          7
	//* 246  497:aload_3         
	//* 247  498:ifnonnull       507
	//* 248  501:iconst_m1       
	//* 249  502:istore          6
	//* 250  504:goto            112
	//* 251  507:goto            504
	//* 252  510:iconst_m1       
	//* 253  511:istore          6
	//* 254  513:goto            112
										{
											int i2 = (k - j) + 1;
	//  255  516:iload           8
	//  256  518:iload           7
	//  257  520:isub            
	//  258  521:iconst_1        
	//  259  522:iadd            
	//  260  523:istore          14
											View aview[] = new View[i2];
	//  261  525:iload           14
	//  262  527:anewarray       View[]
	//  263  530:astore          16
											for(k = 0; k < i2; k++)
	//* 264  532:iconst_0        
	//* 265  533:istore          8
	//* 266  535:iload           8
	//* 267  537:iload           14
	//* 268  539:icmpge          565
												aview[k] = ((ViewGroup) (view)).getChildAt(j + k);
	//  269  542:aload           16
	//  270  544:iload           8
	//  271  546:aload_1         
	//  272  547:iload           7
	//  273  549:iload           8
	//  274  551:iadd            
	//  275  552:invokevirtual   #266 <Method View ViewGroup.getChildAt(int)>
	//  276  555:aastore         

	//  277  556:iload           8
	//  278  558:iconst_1        
	//  279  559:iadd            
	//  280  560:istore          8
	//* 281  562:goto            535
											aobj[i1] = ((Object) (DataBindingUtil.bind(databindingcomponent, aview, j1)));
	//  282  565:aload_2         
	//  283  566:iload           10
	//  284  568:aload_0         
	//  285  569:aload           16
	//  286  571:iload           12
	//  287  573:invokestatic    #454 <Method ViewDataBinding DataBindingUtil.bind(DataBindingComponent, View[], int)>
	//  288  576:aastore         
											k = j + (i2 - 1);
	//  289  577:iload           7
	//  290  579:iload           14
	//  291  581:iconst_1        
	//  292  582:isub            
	//  293  583:iadd            
	//  294  584:istore          8
										}
									}
								}
							}
						}
					}
				}
				if(!flag1)
					mapBindings(databindingcomponent, ((View) (obj)), aobj, includedlayouts, sparseintarray, false);
				j = k + 1;
				i1 = l;
			}
		}
		if(true) goto _L1; else goto _L4
	//  295  586:goto            413
_L4:
		if(obj != null && ((String) (obj)).startsWith("binding_"))
		{
			i = parseTagInt(((String) (obj)), BINDING_NUMBER_START);
			if(aobj[i] == null)
				aobj[i] = ((Object) (view));
			j = 1;
			if(includedlayouts == null)
				i = -1;
		} else
		{
			i = -1;
		}
		  goto _L5
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
	//    9   14:invokestatic    #451 <Method void mapBindings(DataBindingComponent, View, Object[], ViewDataBinding$IncludedLayouts, SparseIntArray, boolean)>
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
	//   17   24:invokestatic    #451 <Method void mapBindings(DataBindingComponent, View, Object[], ViewDataBinding$IncludedLayouts, SparseIntArray, boolean)>

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
	//    1    1:invokestatic    #468 <Method byte Byte.parseByte(String)>
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
		if(s == null || s.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:ifnull          11
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #472 <Method boolean String.isEmpty()>
	//*   4    8:ifeq            13
			return c;
	//    5   11:iload_1         
	//    6   12:ireturn         
		else
			return s.charAt(0);
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:invokevirtual   #287 <Method char String.charAt(int)>
	//   10   18:ireturn         
	}

	protected static double parse(String s, double d)
	{
		double d1;
		try
		{
			d1 = Double.parseDouble(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #479 <Method double Double.parseDouble(String)>
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
	//    1    1:invokestatic    #486 <Method float Float.parseFloat(String)>
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
	//    1    1:invokestatic    #492 <Method int Integer.parseInt(String)>
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
	//    1    1:invokestatic    #499 <Method long Long.parseLong(String)>
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
	//    1    1:invokestatic    #506 <Method short Short.parseShort(String)>
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
	//    5    7:invokestatic    #512 <Method boolean Boolean.parseBoolean(String)>
	//    6   10:ireturn         
	}

	private static int parseTagInt(String s, int i)
	{
		int k = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #105 <Method int String.length()>
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
	//   13   18:invokevirtual   #287 <Method char String.charAt(int)>
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
	//    0    0:getstatic       #135 <Field ReferenceQueue sReferenceQueue>
	//    1    3:invokevirtual   #516 <Method java.lang.ref.Reference ReferenceQueue.poll()>
	//    2    6:astore_0        
			if(reference == null)
				break;
	//    3    7:aload_0         
	//    4    8:ifnull          29
			if(reference instanceof WeakListener)
	//*   5   11:aload_0         
	//*   6   12:instanceof      #35  <Class ViewDataBinding$WeakListener>
	//*   7   15:ifeq            0
				((WeakListener)reference).unregister();
	//    8   18:aload_0         
	//    9   19:checkcast       #35  <Class ViewDataBinding$WeakListener>
	//   10   22:invokevirtual   #519 <Method boolean ViewDataBinding$WeakListener.unregister()>
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
	//    5    7:invokevirtual   #525 <Method byte Byte.byteValue()>
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
	//    5    7:invokevirtual   #530 <Method char Character.charValue()>
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
	//    5    7:invokevirtual   #535 <Method double Double.doubleValue()>
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
	//    5    7:invokevirtual   #540 <Method float Float.floatValue()>
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
	//    5    7:invokevirtual   #544 <Method int Integer.intValue()>
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
	//    5    7:invokevirtual   #549 <Method long Long.longValue()>
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
	//    5    7:invokevirtual   #554 <Method short Short.shortValue()>
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
	//    5    7:invokevirtual   #558 <Method boolean Boolean.booleanValue()>
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
	//    7   11:checkcast       #29  <Class ViewDataBinding$PropertyChangedInverseListener>
	//    8   14:invokevirtual   #564 <Method void removeOnPropertyChangedCallback(Observable$OnPropertyChangedCallback)>
			if(propertychangedinverselistener != null)
	//*   9   17:aload_2         
	//*  10   18:ifnull          26
				viewdatabinding.addOnPropertyChangedCallback(((Observable.OnPropertyChangedCallback) (propertychangedinverselistener)));
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:invokevirtual   #567 <Method void addOnPropertyChangedCallback(Observable$OnPropertyChangedCallback)>
		}
	//   14   26:return          
	}

	protected static void setTo(LongSparseArray longsparsearray, int i, Object obj)
	{
		if(longsparsearray == null || i < 0 || i >= longsparsearray.size())
	//*   0    0:aload_0         
	//*   1    1:ifnull          16
	//*   2    4:iload_1         
	//*   3    5:iflt            16
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #570 <Method int LongSparseArray.size()>
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
	//   13   21:invokevirtual   #574 <Method void LongSparseArray.put(long, Object)>
			return;
	//   14   24:return          
		}
	}

	protected static void setTo(android.util.LongSparseArray longsparsearray, int i, Object obj)
	{
		if(longsparsearray == null || i < 0 || i >= longsparsearray.size())
	//*   0    0:aload_0         
	//*   1    1:ifnull          16
	//*   2    4:iload_1         
	//*   3    5:iflt            16
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #577 <Method int android.util.LongSparseArray.size()>
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
	//   13   21:invokevirtual   #578 <Method void android.util.LongSparseArray.put(long, Object)>
			return;
	//   14   24:return          
		}
	}

	protected static void setTo(SparseArray sparsearray, int i, Object obj)
	{
		if(sparsearray == null || i < 0 || i >= sparsearray.size())
	//*   0    0:aload_0         
	//*   1    1:ifnull          16
	//*   2    4:iload_1         
	//*   3    5:iflt            16
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #581 <Method int SparseArray.size()>
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
	//   12   20:invokevirtual   #584 <Method void SparseArray.put(int, Object)>
			return;
	//   13   23:return          
		}
	}

	protected static void setTo(SparseBooleanArray sparsebooleanarray, int i, boolean flag)
	{
		if(sparsebooleanarray == null || i < 0 || i >= sparsebooleanarray.size())
	//*   0    0:aload_0         
	//*   1    1:ifnull          16
	//*   2    4:iload_1         
	//*   3    5:iflt            16
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #587 <Method int SparseBooleanArray.size()>
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
	//   12   20:invokevirtual   #590 <Method void SparseBooleanArray.put(int, boolean)>
			return;
	//   13   23:return          
		}
	}

	protected static void setTo(SparseIntArray sparseintarray, int i, int j)
	{
		if(sparseintarray == null || i < 0 || i >= sparseintarray.size())
	//*   0    0:aload_0         
	//*   1    1:ifnull          16
	//*   2    4:iload_1         
	//*   3    5:iflt            16
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #592 <Method int SparseIntArray.size()>
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
	//   12   20:invokevirtual   #595 <Method void SparseIntArray.put(int, int)>
			return;
	//   13   23:return          
		}
	}

	protected static void setTo(SparseLongArray sparselongarray, int i, long l)
	{
		if(sparselongarray == null || i < 0 || i >= sparselongarray.size())
	//*   0    0:aload_0         
	//*   1    1:ifnull          16
	//*   2    4:iload_1         
	//*   3    5:iflt            16
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #597 <Method int SparseLongArray.size()>
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
	//   12   20:invokevirtual   #600 <Method void SparseLongArray.put(int, long)>
			return;
	//   13   23:return          
		}
	}

	protected static void setTo(List list, int i, Object obj)
	{
		if(list == null || i < 0 || i >= list.size())
	//*   0    0:aload_0         
	//*   1    1:ifnull          18
	//*   2    4:iload_1         
	//*   3    5:iflt            18
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:invokeinterface #396 <Method int List.size()>
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
	//   12   22:invokeinterface #605 <Method Object List.set(int, Object)>
	//   13   27:pop             
			return;
	//   14   28:return          
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
	//    6    8:invokeinterface #610 <Method Object Map.put(Object, Object)>
	//    7   13:pop             
			return;
	//    8   14:return          
		}
	}

	protected static void setTo(byte abyte0[], int i, byte byte0)
	{
		if(abyte0 == null || i < 0 || i >= abyte0.length)
	//*   0    0:aload_0         
	//*   1    1:ifnull          14
	//*   2    4:iload_1         
	//*   3    5:iflt            14
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
	}

	protected static void setTo(char ac[], int i, char c)
	{
		if(ac == null || i < 0 || i >= ac.length)
	//*   0    0:aload_0         
	//*   1    1:ifnull          14
	//*   2    4:iload_1         
	//*   3    5:iflt            14
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
	}

	protected static void setTo(double ad[], int i, double d)
	{
		if(ad == null || i < 0 || i >= ad.length)
	//*   0    0:aload_0         
	//*   1    1:ifnull          14
	//*   2    4:iload_1         
	//*   3    5:iflt            14
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
	}

	protected static void setTo(float af[], int i, float f)
	{
		if(af == null || i < 0 || i >= af.length)
	//*   0    0:aload_0         
	//*   1    1:ifnull          14
	//*   2    4:iload_1         
	//*   3    5:iflt            14
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
	}

	protected static void setTo(int ai[], int i, int j)
	{
		if(ai == null || i < 0 || i >= ai.length)
	//*   0    0:aload_0         
	//*   1    1:ifnull          14
	//*   2    4:iload_1         
	//*   3    5:iflt            14
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
	}

	protected static void setTo(long al[], int i, long l)
	{
		if(al == null || i < 0 || i >= al.length)
	//*   0    0:aload_0         
	//*   1    1:ifnull          14
	//*   2    4:iload_1         
	//*   3    5:iflt            14
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
	}

	protected static void setTo(Object aobj[], int i, Object obj)
	{
		if(aobj == null || i < 0 || i >= aobj.length)
	//*   0    0:aload_0         
	//*   1    1:ifnull          14
	//*   2    4:iload_1         
	//*   3    5:iflt            14
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
	}

	protected static void setTo(short aword0[], int i, short word0)
	{
		if(aword0 == null || i < 0 || i >= aword0.length)
	//*   0    0:aload_0         
	//*   1    1:ifnull          14
	//*   2    4:iload_1         
	//*   3    5:iflt            14
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
	}

	protected static void setTo(boolean aflag[], int i, boolean flag)
	{
		if(aflag == null || i < 0 || i >= aflag.length)
	//*   0    0:aload_0         
	//*   1    1:ifnull          14
	//*   2    4:iload_1         
	//*   3    5:iflt            14
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
	}

	private boolean updateRegistration(int i, Object obj, CreateWeakListener createweaklistener)
	{
		if(obj == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
			return unregisterFrom(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #626 <Method boolean unregisterFrom(int)>
	//    5    9:ireturn         
		WeakListener weaklistener = mLocalFieldObservers[i];
	//    6   10:aload_0         
	//    7   11:getfield        #154 <Field ViewDataBinding$WeakListener[] mLocalFieldObservers>
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
	//   17   27:invokevirtual   #630 <Method void registerTo(int, Object, ViewDataBinding$CreateWeakListener)>
			return true;
	//   18   30:iconst_1        
	//   19   31:ireturn         
		}
		if(weaklistener.getTarget() == obj)
	//*  20   32:aload           4
	//*  21   34:invokevirtual   #633 <Method Object ViewDataBinding$WeakListener.getTarget()>
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
	//   28   45:invokevirtual   #626 <Method boolean unregisterFrom(int)>
	//   29   48:pop             
			registerTo(i, obj, createweaklistener);
	//   30   49:aload_0         
	//   31   50:iload_1         
	//   32   51:aload_2         
	//   33   52:aload_3         
	//   34   53:invokevirtual   #630 <Method void registerTo(int, Object, ViewDataBinding$CreateWeakListener)>
			return true;
	//   35   56:iconst_1        
	//   36   57:ireturn         
		}
	}

	public void addOnRebindCallback(OnRebindCallback onrebindcallback)
	{
		if(mRebindCallbacks == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #226 <Field CallbackRegistry mRebindCallbacks>
	//*   2    4:ifnonnull       21
			mRebindCallbacks = new CallbackRegistry(REBIND_NOTIFIER);
	//    3    7:aload_0         
	//    4    8:new             #228 <Class CallbackRegistry>
	//    5   11:dup             
	//    6   12:getstatic       #130 <Field CallbackRegistry$NotifierCallback REBIND_NOTIFIER>
	//    7   15:invokespecial   #638 <Method void CallbackRegistry(CallbackRegistry$NotifierCallback)>
	//    8   18:putfield        #226 <Field CallbackRegistry mRebindCallbacks>
		mRebindCallbacks.add(((Object) (onrebindcallback)));
	//    9   21:aload_0         
	//   10   22:getfield        #226 <Field CallbackRegistry mRebindCallbacks>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #642 <Method void CallbackRegistry.add(Object)>
	//   13   29:return          
	}

	protected void ensureBindingComponentIsNotNull(Class class1)
	{
		if(mBindingComponent == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field DataBindingComponent mBindingComponent>
	//*   2    4:ifnonnull       78
			throw new IllegalStateException((new StringBuilder()).append("Required DataBindingComponent is null in class ").append(((Object)this).getClass().getSimpleName()).append(". A BindingAdapter in ").append(class1.getCanonicalName()).append(" is not static and requires an object to use, retrieved from the ").append("DataBindingComponent. If you don't use an inflation method taking a ").append("DataBindingComponent, use DataBindingUtil.setDefaultComponent or ").append("make all BindingAdapter methods static.").toString());
	//    3    7:new             #164 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:new             #646 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #647 <Method void StringBuilder()>
	//    8   18:ldc2            #649 <String "Required DataBindingComponent is null in class ">
	//    9   21:invokevirtual   #653 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:invokevirtual   #657 <Method Class Object.getClass()>
	//   12   28:invokevirtual   #663 <Method String Class.getSimpleName()>
	//   13   31:invokevirtual   #653 <Method StringBuilder StringBuilder.append(String)>
	//   14   34:ldc2            #665 <String ". A BindingAdapter in ">
	//   15   37:invokevirtual   #653 <Method StringBuilder StringBuilder.append(String)>
	//   16   40:aload_1         
	//   17   41:invokevirtual   #668 <Method String Class.getCanonicalName()>
	//   18   44:invokevirtual   #653 <Method StringBuilder StringBuilder.append(String)>
	//   19   47:ldc2            #670 <String " is not static and requires an object to use, retrieved from the ">
	//   20   50:invokevirtual   #653 <Method StringBuilder StringBuilder.append(String)>
	//   21   53:ldc2            #672 <String "DataBindingComponent. If you don't use an inflation method taking a ">
	//   22   56:invokevirtual   #653 <Method StringBuilder StringBuilder.append(String)>
	//   23   59:ldc2            #674 <String "DataBindingComponent, use DataBindingUtil.setDefaultComponent or ">
	//   24   62:invokevirtual   #653 <Method StringBuilder StringBuilder.append(String)>
	//   25   65:ldc2            #676 <String "make all BindingAdapter methods static.">
	//   26   68:invokevirtual   #653 <Method StringBuilder StringBuilder.append(String)>
	//   27   71:invokevirtual   #679 <Method String StringBuilder.toString()>
	//   28   74:invokespecial   #169 <Method void IllegalStateException(String)>
	//   29   77:athrow          
		else
			return;
	//   30   78:return          
	}

	protected abstract void executeBindings();

	public void executePendingBindings()
	{
		if(mContainingBinding == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #683 <Field ViewDataBinding mContainingBinding>
	//*   2    4:ifnonnull       12
		{
			executeBindingsInternal();
	//    3    7:aload_0         
	//    4    8:invokespecial   #238 <Method void executeBindingsInternal()>
			return;
	//    5   11:return          
		} else
		{
			mContainingBinding.executePendingBindings();
	//    6   12:aload_0         
	//    7   13:getfield        #683 <Field ViewDataBinding mContainingBinding>
	//    8   16:invokevirtual   #685 <Method void executePendingBindings()>
			return;
	//    9   19:return          
		}
	}

	void forceExecuteBindings()
	{
		executeBindings();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #235 <Method void executeBindings()>
	//    2    4:return          
	}

	protected Object getObservedField(int i)
	{
		WeakListener weaklistener = mLocalFieldObservers[i];
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field ViewDataBinding$WeakListener[] mLocalFieldObservers>
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
	//   10   14:invokevirtual   #633 <Method Object ViewDataBinding$WeakListener.getTarget()>
	//   11   17:areturn         
	}

	public View getRoot()
	{
		return mRoot;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field View mRoot>
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
		WeakListener weaklistener1 = mLocalFieldObservers[i];
	//    3    5:aload_0         
	//    4    6:getfield        #154 <Field ViewDataBinding$WeakListener[] mLocalFieldObservers>
	//    5    9:iload_1         
	//    6   10:aaload          
	//    7   11:astore          5
		WeakListener weaklistener = weaklistener1;
	//    8   13:aload           5
	//    9   15:astore          4
		if(weaklistener1 == null)
	//*  10   17:aload           5
	//*  11   19:ifnonnull       40
		{
			weaklistener = createweaklistener.create(this, i);
	//   12   22:aload_3         
	//   13   23:aload_0         
	//   14   24:iload_1         
	//   15   25:invokeinterface #694 <Method ViewDataBinding$WeakListener ViewDataBinding$CreateWeakListener.create(ViewDataBinding, int)>
	//   16   30:astore          4
			mLocalFieldObservers[i] = weaklistener;
	//   17   32:aload_0         
	//   18   33:getfield        #154 <Field ViewDataBinding$WeakListener[] mLocalFieldObservers>
	//   19   36:iload_1         
	//   20   37:aload           4
	//   21   39:aastore         
		}
		weaklistener.setTarget(obj);
	//   22   40:aload           4
	//   23   42:aload_2         
	//   24   43:invokevirtual   #697 <Method void ViewDataBinding$WeakListener.setTarget(Object)>
	//   25   46:return          
	}

	public void removeOnRebindCallback(OnRebindCallback onrebindcallback)
	{
		if(mRebindCallbacks != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #226 <Field CallbackRegistry mRebindCallbacks>
	//*   2    4:ifnull          15
			mRebindCallbacks.remove(((Object) (onrebindcallback)));
	//    3    7:aload_0         
	//    4    8:getfield        #226 <Field CallbackRegistry mRebindCallbacks>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #701 <Method void CallbackRegistry.remove(Object)>
	//    7   15:return          
	}

	protected void requestRebind()
	{
		if(mContainingBinding != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #683 <Field ViewDataBinding mContainingBinding>
	//*   2    4:ifnull          15
		{
			mContainingBinding.requestRebind();
	//    3    7:aload_0         
	//    4    8:getfield        #683 <Field ViewDataBinding mContainingBinding>
	//    5   11:invokevirtual   #220 <Method void requestRebind()>
			return;
	//    6   14:return          
		}
		this;
	//    7   15:aload_0         
		JVM INSTR monitorenter ;
	//    8   16:monitorenter    
		if(!mPendingRebind)
			break MISSING_BLOCK_LABEL_32;
	//    9   17:aload_0         
	//   10   18:getfield        #148 <Field boolean mPendingRebind>
	//   11   21:ifeq            32
		this;
	//   12   24:aload_0         
		JVM INSTR monitorexit ;
	//   13   25:monitorexit     
		return;
	//   14   26:return          
		Exception exception;
		exception;
	//   15   27:astore_1        
		this;
	//   16   28:aload_0         
		JVM INSTR monitorexit ;
	//   17   29:monitorexit     
		throw exception;
	//   18   30:aload_1         
	//   19   31:athrow          
		mPendingRebind = true;
	//   20   32:aload_0         
	//   21   33:iconst_1        
	//   22   34:putfield        #148 <Field boolean mPendingRebind>
		this;
	//   23   37:aload_0         
		JVM INSTR monitorexit ;
	//   24   38:monitorexit     
		if(USE_CHOREOGRAPHER)
	//*  25   39:getstatic       #116 <Field boolean USE_CHOREOGRAPHER>
	//*  26   42:ifeq            57
		{
			mChoreographer.postFrameCallback(mFrameCallback);
	//   27   45:aload_0         
	//   28   46:getfield        #177 <Field Choreographer mChoreographer>
	//   29   49:aload_0         
	//   30   50:getfield        #180 <Field android.view.Choreographer$FrameCallback mFrameCallback>
	//   31   53:invokevirtual   #705 <Method void Choreographer.postFrameCallback(android.view.Choreographer$FrameCallback)>
			return;
	//   32   56:return          
		} else
		{
			mUIThreadHandler.post(mRebindRunnable);
	//   33   57:aload_0         
	//   34   58:getfield        #187 <Field Handler mUIThreadHandler>
	//   35   61:aload_0         
	//   36   62:getfield        #146 <Field Runnable mRebindRunnable>
	//   37   65:invokevirtual   #709 <Method boolean Handler.post(Runnable)>
	//   38   68:pop             
			return;
	//   39   69:return          
		}
	}

	protected void setContainedBinding(ViewDataBinding viewdatabinding)
	{
		if(viewdatabinding != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          9
			viewdatabinding.mContainingBinding = this;
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:putfield        #683 <Field ViewDataBinding mContainingBinding>
	//    5    9:return          
	}

	protected void setRootTag(View view)
	{
		if(USE_TAG_ID)
	//*   0    0:getstatic       #114 <Field boolean USE_TAG_ID>
	//*   1    3:ifeq            15
		{
			view.setTag(com.android.databinding.library.R.id.dataBinding, ((Object) (this)));
	//    2    6:aload_1         
	//    3    7:getstatic       #298 <Field int com.android.databinding.library.R$id.dataBinding>
	//    4   10:aload_0         
	//    5   11:invokevirtual   #715 <Method void View.setTag(int, Object)>
			return;
	//    6   14:return          
		} else
		{
			view.setTag(((Object) (this)));
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:invokevirtual   #717 <Method void View.setTag(Object)>
			return;
	//   10   20:return          
		}
	}

	protected void setRootTag(View aview[])
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int i = 0;
	//    2    2:iconst_0        
	//    3    3:istore_2        
		if(USE_TAG_ID)
	//*   4    4:getstatic       #114 <Field boolean USE_TAG_ID>
	//*   5    7:ifeq            35
		{
			for(k = aview.length; i < k; i++)
	//*   6   10:aload_1         
	//*   7   11:arraylength     
	//*   8   12:istore_3        
	//*   9   13:iload_2         
	//*  10   14:iload_3         
	//*  11   15:icmpge          61
				aview[i].setTag(com.android.databinding.library.R.id.dataBinding, ((Object) (this)));
	//   12   18:aload_1         
	//   13   19:iload_2         
	//   14   20:aaload          
	//   15   21:getstatic       #298 <Field int com.android.databinding.library.R$id.dataBinding>
	//   16   24:aload_0         
	//   17   25:invokevirtual   #715 <Method void View.setTag(int, Object)>

	//   18   28:iload_2         
	//   19   29:iconst_1        
	//   20   30:iadd            
	//   21   31:istore_2        
		} else
	//*  22   32:goto            13
		{
			int l = aview.length;
	//   23   35:aload_1         
	//   24   36:arraylength     
	//   25   37:istore          4
			for(int j = k; j < l; j++)
	//*  26   39:iload_3         
	//*  27   40:istore_2        
	//*  28   41:iload_2         
	//*  29   42:iload           4
	//*  30   44:icmpge          61
				aview[j].setTag(((Object) (this)));
	//   31   47:aload_1         
	//   32   48:iload_2         
	//   33   49:aaload          
	//   34   50:aload_0         
	//   35   51:invokevirtual   #717 <Method void View.setTag(Object)>

	//   36   54:iload_2         
	//   37   55:iconst_1        
	//   38   56:iadd            
	//   39   57:istore_2        
		}
	//*  40   58:goto            41
	//   41   61:return          
	}

	public abstract boolean setVariable(int i, Object obj);

	public void unbind()
	{
		WeakListener aweaklistener[] = mLocalFieldObservers;
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field ViewDataBinding$WeakListener[] mLocalFieldObservers>
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
	//   18   27:invokevirtual   #519 <Method boolean ViewDataBinding$WeakListener.unregister()>
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
	//    1    1:getfield        #154 <Field ViewDataBinding$WeakListener[] mLocalFieldObservers>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:astore_2        
		if(weaklistener != null)
	//*   5    7:aload_2         
	//*   6    8:ifnull          16
			return weaklistener.unregister();
	//    7   11:aload_2         
	//    8   12:invokevirtual   #519 <Method boolean ViewDataBinding$WeakListener.unregister()>
	//    9   15:ireturn         
		else
			return false;
	//   10   16:iconst_0        
	//   11   17:ireturn         
	}

	protected boolean updateRegistration(int i, Observable observable)
	{
		return updateRegistration(i, ((Object) (observable)), CREATE_PROPERTY_LISTENER);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #121 <Field ViewDataBinding$CreateWeakListener CREATE_PROPERTY_LISTENER>
	//    4    6:invokespecial   #724 <Method boolean updateRegistration(int, Object, ViewDataBinding$CreateWeakListener)>
	//    5    9:ireturn         
	}

	protected boolean updateRegistration(int i, ObservableList observablelist)
	{
		return updateRegistration(i, ((Object) (observablelist)), CREATE_LIST_LISTENER);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #124 <Field ViewDataBinding$CreateWeakListener CREATE_LIST_LISTENER>
	//    4    6:invokespecial   #724 <Method boolean updateRegistration(int, Object, ViewDataBinding$CreateWeakListener)>
	//    5    9:ireturn         
	}

	protected boolean updateRegistration(int i, ObservableMap observablemap)
	{
		return updateRegistration(i, ((Object) (observablemap)), CREATE_MAP_LISTENER);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #127 <Field ViewDataBinding$CreateWeakListener CREATE_MAP_LISTENER>
	//    4    6:invokespecial   #724 <Method boolean updateRegistration(int, Object, ViewDataBinding$CreateWeakListener)>
	//    5    9:ireturn         
	}

	private static final int BINDING_NUMBER_START = "binding_".length();
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
			i;
		//    0    0:iload_3         
			JVM INSTR tableswitch 1 3: default 28
		//		               1 29
		//		               2 44
		//		               3 50;
		//    1    1:tableswitch     1 3: default 28
		//		               1 29
		//		               2 44
		//		               3 50
			   goto _L1 _L2 _L3 _L4
_L1:
			return;
		//    2   28:return          
_L2:
			if(!onrebindcallback.onPreBind(viewdatabinding))
		//*   3   29:aload_1         
		//*   4   30:aload_2         
		//*   5   31:invokevirtual   #20  <Method boolean OnRebindCallback.onPreBind(ViewDataBinding)>
		//*   6   34:ifne            28
			{
				viewdatabinding.mRebindHalted = true;
		//    7   37:aload_2         
		//    8   38:iconst_1        
		//    9   39:invokestatic    #24  <Method boolean ViewDataBinding.access$002(ViewDataBinding, boolean)>
		//   10   42:pop             
				return;
		//   11   43:return          
			}
			  goto _L1
_L3:
			onrebindcallback.onCanceled(viewdatabinding);
		//   12   44:aload_1         
		//   13   45:aload_2         
		//   14   46:invokevirtual   #28  <Method void OnRebindCallback.onCanceled(ViewDataBinding)>
			return;
		//   15   49:return          
_L4:
			onrebindcallback.onBound(viewdatabinding);
		//   16   50:aload_1         
		//   17   51:aload_2         
		//   18   52:invokevirtual   #31  <Method void OnRebindCallback.onBound(ViewDataBinding)>
			return;
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
	private static final boolean USE_TAG_ID;
	private static final ReferenceQueue sReferenceQueue = new ReferenceQueue();
	protected final DataBindingComponent mBindingComponent;
	private Choreographer mChoreographer;
	private ViewDataBinding mContainingBinding;
	private final android.view.Choreographer.FrameCallback mFrameCallback;
	private boolean mIsExecutingPendingBindings;
	private WeakListener mLocalFieldObservers[];
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
			Exception exception;
			if(android.os.Build.VERSION.SDK_INT >= 19 && !mRoot.isAttachedToWindow())
		//*  10   16:getstatic       #32  <Field int android.os.Build$VERSION.SDK_INT>
		//*  11   19:bipush          19
		//*  12   21:icmplt          69
		//*  13   24:aload_0         
		//*  14   25:getfield        #14  <Field ViewDataBinding this$0>
		//*  15   28:invokestatic    #36  <Method View ViewDataBinding.access$400(ViewDataBinding)>
		//*  16   31:invokevirtual   #42  <Method boolean View.isAttachedToWindow()>
		//*  17   34:ifne            69
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
		//*  29   64:astore_1        
		//*  30   65:aload_0         
		//*  31   66:monitorexit     
		//*  32   67:aload_1         
		//*  33   68:athrow          
			{
				executePendingBindings();
		//   34   69:aload_0         
		//   35   70:getfield        #14  <Field ViewDataBinding this$0>
		//   36   73:invokevirtual   #56  <Method void ViewDataBinding.executePendingBindings()>
				return;
		//   37   76:return          
			}
			exception;
			this;
			JVM INSTR monitorexit ;
			throw exception;
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
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_1        
		SDK_INT = android.os.Build.VERSION.SDK_INT;
	//    2    2:getstatic       #98  <Field int android.os.Build$VERSION.SDK_INT>
	//    3    5:putstatic       #99  <Field int SDK_INT>
	//    4    8:ldc1            #48  <String "binding_">
	//    5   10:invokevirtual   #105 <Method int String.length()>
	//    6   13:putstatic       #107 <Field int BINDING_NUMBER_START>
		boolean flag;
		if(DataBinderMapper.TARGET_MIN_SDK >= 14)
	//*   7   16:getstatic       #112 <Field int DataBinderMapper.TARGET_MIN_SDK>
	//*   8   19:bipush          14
	//*   9   21:icmplt          107
			flag = true;
	//   10   24:iconst_1        
	//   11   25:istore_0        
		else
	//*  12   26:iload_0         
	//*  13   27:putstatic       #114 <Field boolean USE_TAG_ID>
	//*  14   30:getstatic       #99  <Field int SDK_INT>
	//*  15   33:bipush          16
	//*  16   35:icmplt          112
	//*  17   38:iload_1         
	//*  18   39:istore_0        
	//*  19   40:iload_0         
	//*  20   41:putstatic       #116 <Field boolean USE_CHOREOGRAPHER>
	//*  21   44:new             #6   <Class ViewDataBinding$1>
	//*  22   47:dup             
	//*  23   48:invokespecial   #119 <Method void ViewDataBinding$1()>
	//*  24   51:putstatic       #121 <Field ViewDataBinding$CreateWeakListener CREATE_PROPERTY_LISTENER>
	//*  25   54:new             #8   <Class ViewDataBinding$2>
	//*  26   57:dup             
	//*  27   58:invokespecial   #122 <Method void ViewDataBinding$2()>
	//*  28   61:putstatic       #124 <Field ViewDataBinding$CreateWeakListener CREATE_LIST_LISTENER>
	//*  29   64:new             #10  <Class ViewDataBinding$3>
	//*  30   67:dup             
	//*  31   68:invokespecial   #125 <Method void ViewDataBinding$3()>
	//*  32   71:putstatic       #127 <Field ViewDataBinding$CreateWeakListener CREATE_MAP_LISTENER>
	//*  33   74:new             #12  <Class ViewDataBinding$4>
	//*  34   77:dup             
	//*  35   78:invokespecial   #128 <Method void ViewDataBinding$4()>
	//*  36   81:putstatic       #130 <Field CallbackRegistry$NotifierCallback REBIND_NOTIFIER>
	//*  37   84:new             #132 <Class ReferenceQueue>
	//*  38   87:dup             
	//*  39   88:invokespecial   #133 <Method void ReferenceQueue()>
	//*  40   91:putstatic       #135 <Field ReferenceQueue sReferenceQueue>
	//*  41   94:getstatic       #98  <Field int android.os.Build$VERSION.SDK_INT>
	//*  42   97:bipush          19
	//*  43   99:icmpge          117
	//*  44  102:aconst_null     
	//*  45  103:putstatic       #137 <Field android.view.View$OnAttachStateChangeListener ROOT_REATTACHED_LISTENER>
	//*  46  106:return          
			flag = false;
	//   47  107:iconst_0        
	//   48  108:istore_0        
		USE_TAG_ID = flag;
		if(SDK_INT >= 16)
			flag = flag1;
		else
	//*  49  109:goto            26
			flag = false;
	//   50  112:iconst_0        
	//   51  113:istore_0        
		USE_CHOREOGRAPHER = flag;
		if(android.os.Build.VERSION.SDK_INT < 19)
			ROOT_REATTACHED_LISTENER = null;
		else
	//*  52  114:goto            40
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
	//   53  117:new             #14  <Class ViewDataBinding$5>
	//   54  120:dup             
	//   55  121:invokespecial   #138 <Method void ViewDataBinding$5()>
	//   56  124:putstatic       #137 <Field android.view.View$OnAttachStateChangeListener ROOT_REATTACHED_LISTENER>
	//*  57  127:return          
	}


/*
	static boolean access$002(ViewDataBinding viewdatabinding, boolean flag)
	{
		viewdatabinding.mRebindHalted = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #150 <Field boolean mRebindHalted>
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
	//    1    1:getfield        #146 <Field Runnable mRebindRunnable>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$202(ViewDataBinding viewdatabinding, boolean flag)
	{
		viewdatabinding.mPendingRebind = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #148 <Field boolean mPendingRebind>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static void access$300()
	{
		processReferenceQueue();
	//    0    0:invokestatic    #196 <Method void processReferenceQueue()>
		return;
	//    1    3:return          
	}

*/


/*
	static View access$400(ViewDataBinding viewdatabinding)
	{
		return viewdatabinding.mRoot;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field View mRoot>
	//    2    4:areturn         
	}

*/


/*
	static android.view.View.OnAttachStateChangeListener access$500()
	{
		return ROOT_REATTACHED_LISTENER;
	//    0    0:getstatic       #137 <Field android.view.View$OnAttachStateChangeListener ROOT_REATTACHED_LISTENER>
	//    1    3:areturn         
	}

*/


/*
	static ReferenceQueue access$600()
	{
		return sReferenceQueue;
	//    0    0:getstatic       #135 <Field ReferenceQueue sReferenceQueue>
	//    1    3:areturn         
	}

*/


/*
	static void access$700(ViewDataBinding viewdatabinding, int i, Object obj, int j)
	{
		viewdatabinding.handleFieldChange(i, obj, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #208 <Method void handleFieldChange(int, Object, int)>
		return;
	//    5    7:return          
	}

*/
}
