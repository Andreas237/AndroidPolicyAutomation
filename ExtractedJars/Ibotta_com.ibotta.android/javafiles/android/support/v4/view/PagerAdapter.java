// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class PagerAdapter
{

	public PagerAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #19  <Class DataSetObservable>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void DataSetObservable()>
	//    6   12:putfield        #22  <Field DataSetObservable mObservable>
	//    7   15:return          
	}

	public void destroyItem(View view, int i, Object obj)
	{
		throw new UnsupportedOperationException("Required method destroyItem was not overridden");
	//    0    0:new             #29  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #31  <String "Required method destroyItem was not overridden">
	//    3    6:invokespecial   #34  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public void destroyItem(ViewGroup viewgroup, int i, Object obj)
	{
		destroyItem(((View) (viewgroup)), i, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #39  <Method void destroyItem(View, int, Object)>
	//    5    7:return          
	}

	public void finishUpdate(View view)
	{
	//    0    0:return          
	}

	public void finishUpdate(ViewGroup viewgroup)
	{
		finishUpdate(((View) (viewgroup)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #44  <Method void finishUpdate(View)>
	//    3    5:return          
	}

	public abstract int getCount();

	public int getItemPosition(Object obj)
	{
		return -1;
	//    0    0:iconst_m1       
	//    1    1:ireturn         
	}

	public CharSequence getPageTitle(int i)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public float getPageWidth(int i)
	{
		return 1.0F;
	//    0    0:fconst_1        
	//    1    1:freturn         
	}

	public Object instantiateItem(View view, int i)
	{
		throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
	//    0    0:new             #29  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #58  <String "Required method instantiateItem was not overridden">
	//    3    6:invokespecial   #34  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public Object instantiateItem(ViewGroup viewgroup, int i)
	{
		return instantiateItem(((View) (viewgroup)), i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #61  <Method Object instantiateItem(View, int)>
	//    4    6:areturn         
	}

	public abstract boolean isViewFromObject(View view, Object obj);

	public void notifyDataSetChanged()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(mViewPagerObserver != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #66  <Field DataSetObserver mViewPagerObserver>
	//*   4    6:ifnull          16
			mViewPagerObserver.onChanged();
	//    5    9:aload_0         
	//    6   10:getfield        #66  <Field DataSetObserver mViewPagerObserver>
	//    7   13:invokevirtual   #71  <Method void DataSetObserver.onChanged()>
		this;
	//    8   16:aload_0         
		JVM INSTR monitorexit ;
	//    9   17:monitorexit     
		mObservable.notifyChanged();
	//   10   18:aload_0         
	//   11   19:getfield        #22  <Field DataSetObservable mObservable>
	//   12   22:invokevirtual   #74  <Method void DataSetObservable.notifyChanged()>
		return;
	//   13   25:return          
		Exception exception;
		exception;
	//   14   26:astore_1        
		this;
	//   15   27:aload_0         
		JVM INSTR monitorexit ;
	//   16   28:monitorexit     
		throw exception;
	//   17   29:aload_1         
	//   18   30:athrow          
	}

	public void registerDataSetObserver(DataSetObserver datasetobserver)
	{
		mObservable.registerObserver(((Object) (datasetobserver)));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field DataSetObservable mObservable>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #80  <Method void DataSetObservable.registerObserver(Object)>
	//    4    8:return          
	}

	public void restoreState(Parcelable parcelable, ClassLoader classloader)
	{
	//    0    0:return          
	}

	public Parcelable saveState()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void setPrimaryItem(View view, int i, Object obj)
	{
	//    0    0:return          
	}

	public void setPrimaryItem(ViewGroup viewgroup, int i, Object obj)
	{
		setPrimaryItem(((View) (viewgroup)), i, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #87  <Method void setPrimaryItem(View, int, Object)>
	//    5    7:return          
	}

	void setViewPagerObserver(DataSetObserver datasetobserver)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		mViewPagerObserver = datasetobserver;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:putfield        #66  <Field DataSetObserver mViewPagerObserver>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return;
	//    7    9:return          
		datasetobserver;
	//    8   10:astore_1        
		this;
	//    9   11:aload_0         
		JVM INSTR monitorexit ;
	//   10   12:monitorexit     
		throw datasetobserver;
	//   11   13:aload_1         
	//   12   14:athrow          
	}

	public void startUpdate(View view)
	{
	//    0    0:return          
	}

	public void startUpdate(ViewGroup viewgroup)
	{
		startUpdate(((View) (viewgroup)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #91  <Method void startUpdate(View)>
	//    3    5:return          
	}

	public void unregisterDataSetObserver(DataSetObserver datasetobserver)
	{
		mObservable.unregisterObserver(((Object) (datasetobserver)));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field DataSetObservable mObservable>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #95  <Method void DataSetObservable.unregisterObserver(Object)>
	//    4    8:return          
	}

	public static final int POSITION_NONE = -2;
	public static final int POSITION_UNCHANGED = -1;
	private final DataSetObservable mObservable = new DataSetObservable();
	private DataSetObserver mViewPagerObserver;
}
