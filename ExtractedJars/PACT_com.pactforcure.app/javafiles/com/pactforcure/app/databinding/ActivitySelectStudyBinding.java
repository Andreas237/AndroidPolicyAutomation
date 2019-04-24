// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.databinding;

import android.databinding.*;
import android.util.SparseIntArray;
import android.view.*;
import android.widget.*;

public class ActivitySelectStudyBinding extends ViewDataBinding
{

	public ActivitySelectStudyBinding(DataBindingComponent databindingcomponent, View view)
	{
		super(databindingcomponent, view, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #46  <Method void ViewDataBinding(DataBindingComponent, View, int)>
		mDirtyFlags = -1L;
	//    5    7:aload_0         
	//    6    8:ldc2w           #47  <Long -1L>
	//    7   11:putfield        #50  <Field long mDirtyFlags>
		databindingcomponent = ((DataBindingComponent) (mapBindings(databindingcomponent, view, 7, sIncludes, sViewsWithIds)));
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:bipush          7
	//   11   18:getstatic       #24  <Field android.databinding.ViewDataBinding$IncludedLayouts sIncludes>
	//   12   21:getstatic       #31  <Field SparseIntArray sViewsWithIds>
	//   13   24:invokestatic    #54  <Method Object[] mapBindings(DataBindingComponent, View, int, android.databinding.ViewDataBinding$IncludedLayouts, SparseIntArray)>
	//   14   27:astore_1        
		auBtn = (TextView)databindingcomponent[5];
	//   15   28:aload_0         
	//   16   29:aload_1         
	//   17   30:iconst_5        
	//   18   31:aaload          
	//   19   32:checkcast       #56  <Class TextView>
	//   20   35:putfield        #58  <Field TextView auBtn>
		imageView2 = (ImageView)databindingcomponent[1];
	//   21   38:aload_0         
	//   22   39:aload_1         
	//   23   40:iconst_1        
	//   24   41:aaload          
	//   25   42:checkcast       #60  <Class ImageView>
	//   26   45:putfield        #62  <Field ImageView imageView2>
		mboundView0 = (LinearLayout)databindingcomponent[0];
	//   27   48:aload_0         
	//   28   49:aload_1         
	//   29   50:iconst_0        
	//   30   51:aaload          
	//   31   52:checkcast       #64  <Class LinearLayout>
	//   32   55:putfield        #66  <Field LinearLayout mboundView0>
		mboundView0.setTag(((Object) (null)));
	//   33   58:aload_0         
	//   34   59:getfield        #66  <Field LinearLayout mboundView0>
	//   35   62:aconst_null     
	//   36   63:invokevirtual   #70  <Method void LinearLayout.setTag(Object)>
		otherBtn = (TextView)databindingcomponent[6];
	//   37   66:aload_0         
	//   38   67:aload_1         
	//   39   68:bipush          6
	//   40   70:aaload          
	//   41   71:checkcast       #56  <Class TextView>
	//   42   74:putfield        #72  <Field TextView otherBtn>
		ppdLabel1 = (TextView)databindingcomponent[2];
	//   43   77:aload_0         
	//   44   78:aload_1         
	//   45   79:iconst_2        
	//   46   80:aaload          
	//   47   81:checkcast       #56  <Class TextView>
	//   48   84:putfield        #74  <Field TextView ppdLabel1>
		ppdLabel2 = (TextView)databindingcomponent[3];
	//   49   87:aload_0         
	//   50   88:aload_1         
	//   51   89:iconst_3        
	//   52   90:aaload          
	//   53   91:checkcast       #56  <Class TextView>
	//   54   94:putfield        #76  <Field TextView ppdLabel2>
		usBtn = (TextView)databindingcomponent[4];
	//   55   97:aload_0         
	//   56   98:aload_1         
	//   57   99:iconst_4        
	//   58  100:aaload          
	//   59  101:checkcast       #56  <Class TextView>
	//   60  104:putfield        #78  <Field TextView usBtn>
		setRootTag(view);
	//   61  107:aload_0         
	//   62  108:aload_2         
	//   63  109:invokevirtual   #82  <Method void setRootTag(View)>
		invalidateAll();
	//   64  112:aload_0         
	//   65  113:invokevirtual   #85  <Method void invalidateAll()>
	//   66  116:return          
	}

	public static ActivitySelectStudyBinding bind(View view)
	{
		return bind(view, DataBindingUtil.getDefaultComponent());
	//    0    0:aload_0         
	//    1    1:invokestatic    #93  <Method DataBindingComponent DataBindingUtil.getDefaultComponent()>
	//    2    4:invokestatic    #96  <Method ActivitySelectStudyBinding bind(View, DataBindingComponent)>
	//    3    7:areturn         
	}

	public static ActivitySelectStudyBinding bind(View view, DataBindingComponent databindingcomponent)
	{
		if(!"layout/activity_select_study_0".equals(view.getTag()))
	//*   0    0:ldc1            #98  <String "layout/activity_select_study_0">
	//*   1    2:aload_0         
	//*   2    3:invokevirtual   #104 <Method Object View.getTag()>
	//*   3    6:invokevirtual   #110 <Method boolean String.equals(Object)>
	//*   4    9:ifne            42
			throw new RuntimeException((new StringBuilder()).append("view tag isn't correct on view:").append(view.getTag()).toString());
	//    5   12:new             #112 <Class RuntimeException>
	//    6   15:dup             
	//    7   16:new             #114 <Class StringBuilder>
	//    8   19:dup             
	//    9   20:invokespecial   #115 <Method void StringBuilder()>
	//   10   23:ldc1            #117 <String "view tag isn't correct on view:">
	//   11   25:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   12   28:aload_0         
	//   13   29:invokevirtual   #104 <Method Object View.getTag()>
	//   14   32:invokevirtual   #124 <Method StringBuilder StringBuilder.append(Object)>
	//   15   35:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   16   38:invokespecial   #131 <Method void RuntimeException(String)>
	//   17   41:athrow          
		else
			return new ActivitySelectStudyBinding(databindingcomponent, view);
	//   18   42:new             #2   <Class ActivitySelectStudyBinding>
	//   19   45:dup             
	//   20   46:aload_1         
	//   21   47:aload_0         
	//   22   48:invokespecial   #133 <Method void ActivitySelectStudyBinding(DataBindingComponent, View)>
	//   23   51:areturn         
	}

	public static ActivitySelectStudyBinding inflate(LayoutInflater layoutinflater)
	{
		return inflate(layoutinflater, DataBindingUtil.getDefaultComponent());
	//    0    0:aload_0         
	//    1    1:invokestatic    #93  <Method DataBindingComponent DataBindingUtil.getDefaultComponent()>
	//    2    4:invokestatic    #138 <Method ActivitySelectStudyBinding inflate(LayoutInflater, DataBindingComponent)>
	//    3    7:areturn         
	}

	public static ActivitySelectStudyBinding inflate(LayoutInflater layoutinflater, DataBindingComponent databindingcomponent)
	{
		return bind(layoutinflater.inflate(0x7f04002b, ((ViewGroup) (null)), false), databindingcomponent);
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <Int 0x7f04002b>
	//    2    3:aconst_null     
	//    3    4:iconst_0        
	//    4    5:invokevirtual   #144 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//    5    8:aload_1         
	//    6    9:invokestatic    #96  <Method ActivitySelectStudyBinding bind(View, DataBindingComponent)>
	//    7   12:areturn         
	}

	public static ActivitySelectStudyBinding inflate(LayoutInflater layoutinflater, ViewGroup viewgroup, boolean flag)
	{
		return inflate(layoutinflater, viewgroup, flag, DataBindingUtil.getDefaultComponent());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #93  <Method DataBindingComponent DataBindingUtil.getDefaultComponent()>
	//    4    6:invokestatic    #148 <Method ActivitySelectStudyBinding inflate(LayoutInflater, ViewGroup, boolean, DataBindingComponent)>
	//    5    9:areturn         
	}

	public static ActivitySelectStudyBinding inflate(LayoutInflater layoutinflater, ViewGroup viewgroup, boolean flag, DataBindingComponent databindingcomponent)
	{
		return (ActivitySelectStudyBinding)DataBindingUtil.inflate(layoutinflater, 0x7f04002b, viewgroup, flag, databindingcomponent);
	//    0    0:aload_0         
	//    1    1:ldc1            #139 <Int 0x7f04002b>
	//    2    3:aload_1         
	//    3    4:iload_2         
	//    4    5:aload_3         
	//    5    6:invokestatic    #151 <Method ViewDataBinding DataBindingUtil.inflate(LayoutInflater, int, ViewGroup, boolean, DataBindingComponent)>
	//    6    9:checkcast       #2   <Class ActivitySelectStudyBinding>
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
	//    3    3:getfield        #50  <Field long mDirtyFlags>
	//    4    6:lstore_1        
		mDirtyFlags = 0L;
	//    5    7:aload_0         
	//    6    8:lconst_0        
	//    7    9:putfield        #50  <Field long mDirtyFlags>
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
	//*   3    3:getfield        #50  <Field long mDirtyFlags>
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
	//    4    4:putfield        #50  <Field long mDirtyFlags>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		requestRebind();
	//    7    9:aload_0         
	//    8   10:invokevirtual   #157 <Method void requestRebind()>
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
	public final TextView auBtn;
	public final ImageView imageView2;
	private long mDirtyFlags;
	private final LinearLayout mboundView0;
	public final TextView otherBtn;
	public final TextView ppdLabel1;
	public final TextView ppdLabel2;
	public final TextView usBtn;

	static 
	{
	//    0    0:aconst_null     
	//    1    1:putstatic       #24  <Field android.databinding.ViewDataBinding$IncludedLayouts sIncludes>
		sViewsWithIds = new SparseIntArray();
	//    2    4:new             #26  <Class SparseIntArray>
	//    3    7:dup             
	//    4    8:invokespecial   #29  <Method void SparseIntArray()>
	//    5   11:putstatic       #31  <Field SparseIntArray sViewsWithIds>
		sViewsWithIds.put(0x7f0e00ce, 1);
	//    6   14:getstatic       #31  <Field SparseIntArray sViewsWithIds>
	//    7   17:ldc1            #32  <Int 0x7f0e00ce>
	//    8   19:iconst_1        
	//    9   20:invokevirtual   #36  <Method void SparseIntArray.put(int, int)>
		sViewsWithIds.put(0x7f0e00cf, 2);
	//   10   23:getstatic       #31  <Field SparseIntArray sViewsWithIds>
	//   11   26:ldc1            #37  <Int 0x7f0e00cf>
	//   12   28:iconst_2        
	//   13   29:invokevirtual   #36  <Method void SparseIntArray.put(int, int)>
		sViewsWithIds.put(0x7f0e00f0, 3);
	//   14   32:getstatic       #31  <Field SparseIntArray sViewsWithIds>
	//   15   35:ldc1            #38  <Int 0x7f0e00f0>
	//   16   37:iconst_3        
	//   17   38:invokevirtual   #36  <Method void SparseIntArray.put(int, int)>
		sViewsWithIds.put(0x7f0e00f1, 4);
	//   18   41:getstatic       #31  <Field SparseIntArray sViewsWithIds>
	//   19   44:ldc1            #39  <Int 0x7f0e00f1>
	//   20   46:iconst_4        
	//   21   47:invokevirtual   #36  <Method void SparseIntArray.put(int, int)>
		sViewsWithIds.put(0x7f0e00f2, 5);
	//   22   50:getstatic       #31  <Field SparseIntArray sViewsWithIds>
	//   23   53:ldc1            #40  <Int 0x7f0e00f2>
	//   24   55:iconst_5        
	//   25   56:invokevirtual   #36  <Method void SparseIntArray.put(int, int)>
		sViewsWithIds.put(0x7f0e00f3, 6);
	//   26   59:getstatic       #31  <Field SparseIntArray sViewsWithIds>
	//   27   62:ldc1            #41  <Int 0x7f0e00f3>
	//   28   64:bipush          6
	//   29   66:invokevirtual   #36  <Method void SparseIntArray.put(int, int)>
	//*  30   69:return          
	}
}
