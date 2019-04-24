// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.databinding;

import android.databinding.*;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.util.SparseIntArray;
import android.view.*;
import android.widget.LinearLayout;

public class ActivityDashboardBinding extends ViewDataBinding
{

	public ActivityDashboardBinding(DataBindingComponent databindingcomponent, View view)
	{
		super(databindingcomponent, view, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #44  <Method void ViewDataBinding(DataBindingComponent, View, int)>
		mDirtyFlags = -1L;
	//    5    7:aload_0         
	//    6    8:ldc2w           #45  <Long -1L>
	//    7   11:putfield        #48  <Field long mDirtyFlags>
		databindingcomponent = ((DataBindingComponent) (mapBindings(databindingcomponent, view, 5, sIncludes, sViewsWithIds)));
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:iconst_5        
	//   11   17:getstatic       #24  <Field android.databinding.ViewDataBinding$IncludedLayouts sIncludes>
	//   12   20:getstatic       #31  <Field SparseIntArray sViewsWithIds>
	//   13   23:invokestatic    #52  <Method Object[] mapBindings(DataBindingComponent, View, int, android.databinding.ViewDataBinding$IncludedLayouts, SparseIntArray)>
	//   14   26:astore_1        
		activityDashboard = (LinearLayout)databindingcomponent[0];
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:iconst_0        
	//   18   30:aaload          
	//   19   31:checkcast       #54  <Class LinearLayout>
	//   20   34:putfield        #56  <Field LinearLayout activityDashboard>
		activityDashboard.setTag(((Object) (null)));
	//   21   37:aload_0         
	//   22   38:getfield        #56  <Field LinearLayout activityDashboard>
	//   23   41:aconst_null     
	//   24   42:invokevirtual   #60  <Method void LinearLayout.setTag(Object)>
		appBarLayout = (AppBarLayout)databindingcomponent[1];
	//   25   45:aload_0         
	//   26   46:aload_1         
	//   27   47:iconst_1        
	//   28   48:aaload          
	//   29   49:checkcast       #62  <Class AppBarLayout>
	//   30   52:putfield        #64  <Field AppBarLayout appBarLayout>
		tabs = (TabLayout)databindingcomponent[3];
	//   31   55:aload_0         
	//   32   56:aload_1         
	//   33   57:iconst_3        
	//   34   58:aaload          
	//   35   59:checkcast       #66  <Class TabLayout>
	//   36   62:putfield        #68  <Field TabLayout tabs>
		toolbar = (Toolbar)databindingcomponent[2];
	//   37   65:aload_0         
	//   38   66:aload_1         
	//   39   67:iconst_2        
	//   40   68:aaload          
	//   41   69:checkcast       #70  <Class Toolbar>
	//   42   72:putfield        #72  <Field Toolbar toolbar>
		viewPager = (ViewPager)databindingcomponent[4];
	//   43   75:aload_0         
	//   44   76:aload_1         
	//   45   77:iconst_4        
	//   46   78:aaload          
	//   47   79:checkcast       #74  <Class ViewPager>
	//   48   82:putfield        #76  <Field ViewPager viewPager>
		setRootTag(view);
	//   49   85:aload_0         
	//   50   86:aload_2         
	//   51   87:invokevirtual   #80  <Method void setRootTag(View)>
		invalidateAll();
	//   52   90:aload_0         
	//   53   91:invokevirtual   #83  <Method void invalidateAll()>
	//   54   94:return          
	}

	public static ActivityDashboardBinding bind(View view)
	{
		return bind(view, DataBindingUtil.getDefaultComponent());
	//    0    0:aload_0         
	//    1    1:invokestatic    #91  <Method DataBindingComponent DataBindingUtil.getDefaultComponent()>
	//    2    4:invokestatic    #94  <Method ActivityDashboardBinding bind(View, DataBindingComponent)>
	//    3    7:areturn         
	}

	public static ActivityDashboardBinding bind(View view, DataBindingComponent databindingcomponent)
	{
		if(!"layout/activity_dashboard_0".equals(view.getTag()))
	//*   0    0:ldc1            #96  <String "layout/activity_dashboard_0">
	//*   1    2:aload_0         
	//*   2    3:invokevirtual   #102 <Method Object View.getTag()>
	//*   3    6:invokevirtual   #108 <Method boolean String.equals(Object)>
	//*   4    9:ifne            42
			throw new RuntimeException((new StringBuilder()).append("view tag isn't correct on view:").append(view.getTag()).toString());
	//    5   12:new             #110 <Class RuntimeException>
	//    6   15:dup             
	//    7   16:new             #112 <Class StringBuilder>
	//    8   19:dup             
	//    9   20:invokespecial   #113 <Method void StringBuilder()>
	//   10   23:ldc1            #115 <String "view tag isn't correct on view:">
	//   11   25:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//   12   28:aload_0         
	//   13   29:invokevirtual   #102 <Method Object View.getTag()>
	//   14   32:invokevirtual   #122 <Method StringBuilder StringBuilder.append(Object)>
	//   15   35:invokevirtual   #126 <Method String StringBuilder.toString()>
	//   16   38:invokespecial   #129 <Method void RuntimeException(String)>
	//   17   41:athrow          
		else
			return new ActivityDashboardBinding(databindingcomponent, view);
	//   18   42:new             #2   <Class ActivityDashboardBinding>
	//   19   45:dup             
	//   20   46:aload_1         
	//   21   47:aload_0         
	//   22   48:invokespecial   #131 <Method void ActivityDashboardBinding(DataBindingComponent, View)>
	//   23   51:areturn         
	}

	public static ActivityDashboardBinding inflate(LayoutInflater layoutinflater)
	{
		return inflate(layoutinflater, DataBindingUtil.getDefaultComponent());
	//    0    0:aload_0         
	//    1    1:invokestatic    #91  <Method DataBindingComponent DataBindingUtil.getDefaultComponent()>
	//    2    4:invokestatic    #136 <Method ActivityDashboardBinding inflate(LayoutInflater, DataBindingComponent)>
	//    3    7:areturn         
	}

	public static ActivityDashboardBinding inflate(LayoutInflater layoutinflater, DataBindingComponent databindingcomponent)
	{
		return bind(layoutinflater.inflate(0x7f04001d, ((ViewGroup) (null)), false), databindingcomponent);
	//    0    0:aload_0         
	//    1    1:ldc1            #137 <Int 0x7f04001d>
	//    2    3:aconst_null     
	//    3    4:iconst_0        
	//    4    5:invokevirtual   #142 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//    5    8:aload_1         
	//    6    9:invokestatic    #94  <Method ActivityDashboardBinding bind(View, DataBindingComponent)>
	//    7   12:areturn         
	}

	public static ActivityDashboardBinding inflate(LayoutInflater layoutinflater, ViewGroup viewgroup, boolean flag)
	{
		return inflate(layoutinflater, viewgroup, flag, DataBindingUtil.getDefaultComponent());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #91  <Method DataBindingComponent DataBindingUtil.getDefaultComponent()>
	//    4    6:invokestatic    #146 <Method ActivityDashboardBinding inflate(LayoutInflater, ViewGroup, boolean, DataBindingComponent)>
	//    5    9:areturn         
	}

	public static ActivityDashboardBinding inflate(LayoutInflater layoutinflater, ViewGroup viewgroup, boolean flag, DataBindingComponent databindingcomponent)
	{
		return (ActivityDashboardBinding)DataBindingUtil.inflate(layoutinflater, 0x7f04001d, viewgroup, flag, databindingcomponent);
	//    0    0:aload_0         
	//    1    1:ldc1            #137 <Int 0x7f04001d>
	//    2    3:aload_1         
	//    3    4:iload_2         
	//    4    5:aload_3         
	//    5    6:invokestatic    #149 <Method ViewDataBinding DataBindingUtil.inflate(LayoutInflater, int, ViewGroup, boolean, DataBindingComponent)>
	//    6    9:checkcast       #2   <Class ActivityDashboardBinding>
	//    7   12:areturn         
	}

	protected void executeBindings()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		long l = mDirtyFlags;
	//    2    2:aload_0         
	//    3    3:getfield        #48  <Field long mDirtyFlags>
	//    4    6:lstore_1        
		mDirtyFlags = 0L;
	//    5    7:aload_0         
	//    6    8:lconst_0        
	//    7    9:putfield        #48  <Field long mDirtyFlags>
		this;
	//    8   12:aload_0         
		JVM INSTR monitorexit ;
	//    9   13:monitorexit     
		return;
	//   10   14:return          
		Exception exception;
		exception;
	//   11   15:astore_3        
		this;
	//   12   16:aload_0         
		JVM INSTR monitorexit ;
	//   13   17:monitorexit     
		throw exception;
	//   14   18:aload_3         
	//   15   19:athrow          
	}

	public boolean hasPendingBindings()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(mDirtyFlags != 0L)
	//*   2    2:aload_0         
	//*   3    3:getfield        #48  <Field long mDirtyFlags>
	//*   4    6:lconst_0        
	//*   5    7:lcmp            
	//*   6    8:ifeq            15
	//*   7   11:aload_0         
	//*   8   12:monitorexit     
			return true;
	//    9   13:iconst_1        
	//   10   14:ireturn         
		this;
	//   11   15:aload_0         
		JVM INSTR monitorexit ;
	//   12   16:monitorexit     
		return false;
	//   13   17:iconst_0        
	//   14   18:ireturn         
		Exception exception;
		exception;
	//   15   19:astore_1        
		this;
	//   16   20:aload_0         
		JVM INSTR monitorexit ;
	//   17   21:monitorexit     
		throw exception;
	//   18   22:aload_1         
	//   19   23:athrow          
	}

	public void invalidateAll()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		mDirtyFlags = 1L;
	//    2    2:aload_0         
	//    3    3:lconst_1        
	//    4    4:putfield        #48  <Field long mDirtyFlags>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		requestRebind();
	//    7    9:aload_0         
	//    8   10:invokevirtual   #155 <Method void requestRebind()>
		return;
	//    9   13:return          
		Exception exception;
		exception;
	//   10   14:astore_1        
		this;
	//   11   15:aload_0         
		JVM INSTR monitorexit ;
	//   12   16:monitorexit     
		throw exception;
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	protected boolean onFieldChange(int i, Object obj, int j)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean setVariable(int i, Object obj)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
	private static final SparseIntArray sViewsWithIds;
	public final LinearLayout activityDashboard;
	public final AppBarLayout appBarLayout;
	private long mDirtyFlags;
	public final TabLayout tabs;
	public final Toolbar toolbar;
	public final ViewPager viewPager;

	static 
	{
	//    0    0:aconst_null     
	//    1    1:putstatic       #24  <Field android.databinding.ViewDataBinding$IncludedLayouts sIncludes>
		sViewsWithIds = new SparseIntArray();
	//    2    4:new             #26  <Class SparseIntArray>
	//    3    7:dup             
	//    4    8:invokespecial   #29  <Method void SparseIntArray()>
	//    5   11:putstatic       #31  <Field SparseIntArray sViewsWithIds>
		sViewsWithIds.put(0x7f0e00ae, 1);
	//    6   14:getstatic       #31  <Field SparseIntArray sViewsWithIds>
	//    7   17:ldc1            #32  <Int 0x7f0e00ae>
	//    8   19:iconst_1        
	//    9   20:invokevirtual   #36  <Method void SparseIntArray.put(int, int)>
		sViewsWithIds.put(0x7f0e00af, 2);
	//   10   23:getstatic       #31  <Field SparseIntArray sViewsWithIds>
	//   11   26:ldc1            #37  <Int 0x7f0e00af>
	//   12   28:iconst_2        
	//   13   29:invokevirtual   #36  <Method void SparseIntArray.put(int, int)>
		sViewsWithIds.put(0x7f0e00b0, 3);
	//   14   32:getstatic       #31  <Field SparseIntArray sViewsWithIds>
	//   15   35:ldc1            #38  <Int 0x7f0e00b0>
	//   16   37:iconst_3        
	//   17   38:invokevirtual   #36  <Method void SparseIntArray.put(int, int)>
		sViewsWithIds.put(0x7f0e00b1, 4);
	//   18   41:getstatic       #31  <Field SparseIntArray sViewsWithIds>
	//   19   44:ldc1            #39  <Int 0x7f0e00b1>
	//   20   46:iconst_4        
	//   21   47:invokevirtual   #36  <Method void SparseIntArray.put(int, int)>
	//*  22   50:return          
	}
}
