// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.common.android.FragmentCompatUtil;
import com.facebook.stetho.inspector.elements.AbstractChainedDescriptor;
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			DocumentHiddenView

final class ViewGroupDescriptor extends AbstractChainedDescriptor
{

	public ViewGroupDescriptor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void AbstractChainedDescriptor()>
	//    2    4:aload_0         
	//    3    5:new             #14  <Class WeakHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #15  <Method void WeakHashMap()>
	//    6   12:invokestatic    #21  <Method Map Collections.synchronizedMap(Map)>
	//    7   15:putfield        #23  <Field Map mViewToElementMap>
	//    8   18:return          
	}

	private Object getElement(View view, Object obj)
	{
		if(obj == this)
	//*   0    0:aload_2         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return ((Object) (view));
	//    3    5:aload_1         
	//    4    6:areturn         
		else
			return ((WeakReference)obj).get();
	//    5    7:aload_2         
	//    6    8:checkcast       #28  <Class WeakReference>
	//    7   11:invokevirtual   #32  <Method Object WeakReference.get()>
	//    8   14:areturn         
	}

	private Object getElementForView(ViewGroup viewgroup, View view)
	{
		Object obj = mViewToElementMap.get(((Object) (view)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Map mViewToElementMap>
	//    2    4:aload_2         
	//    3    5:invokeinterface #39  <Method Object Map.get(Object)>
	//    4   10:astore_3        
		if(obj != null)
	//*   5   11:aload_3         
	//*   6   12:ifnull          47
		{
			obj = getElement(view, obj);
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:aload_3         
	//   10   18:invokespecial   #41  <Method Object getElement(View, Object)>
	//   11   21:astore_3        
			if(obj != null && view.getParent() == viewgroup)
	//*  12   22:aload_3         
	//*  13   23:ifnull          36
	//*  14   26:aload_2         
	//*  15   27:invokevirtual   #47  <Method android.view.ViewParent View.getParent()>
	//*  16   30:aload_1         
	//*  17   31:if_acmpne       36
				return obj;
	//   18   34:aload_3         
	//   19   35:areturn         
			mViewToElementMap.remove(((Object) (view)));
	//   20   36:aload_0         
	//   21   37:getfield        #23  <Field Map mViewToElementMap>
	//   22   40:aload_2         
	//   23   41:invokeinterface #50  <Method Object Map.remove(Object)>
	//   24   46:pop             
		}
		viewgroup = ((ViewGroup) (FragmentCompatUtil.findFragmentForView(view)));
	//   25   47:aload_2         
	//   26   48:invokestatic    #56  <Method Object FragmentCompatUtil.findFragmentForView(View)>
	//   27   51:astore_1        
		if(viewgroup != null && !FragmentCompatUtil.isDialogFragment(((Object) (viewgroup))))
	//*  28   52:aload_1         
	//*  29   53:ifnull          84
	//*  30   56:aload_1         
	//*  31   57:invokestatic    #60  <Method boolean FragmentCompatUtil.isDialogFragment(Object)>
	//*  32   60:ifne            84
		{
			mViewToElementMap.put(((Object) (view)), ((Object) (new WeakReference(((Object) (viewgroup))))));
	//   33   63:aload_0         
	//   34   64:getfield        #23  <Field Map mViewToElementMap>
	//   35   67:aload_2         
	//   36   68:new             #28  <Class WeakReference>
	//   37   71:dup             
	//   38   72:aload_1         
	//   39   73:invokespecial   #63  <Method void WeakReference(Object)>
	//   40   76:invokeinterface #67  <Method Object Map.put(Object, Object)>
	//   41   81:pop             
			return ((Object) (viewgroup));
	//   42   82:aload_1         
	//   43   83:areturn         
		} else
		{
			mViewToElementMap.put(((Object) (view)), ((Object) (this)));
	//   44   84:aload_0         
	//   45   85:getfield        #23  <Field Map mViewToElementMap>
	//   46   88:aload_2         
	//   47   89:aload_0         
	//   48   90:invokeinterface #67  <Method Object Map.put(Object, Object)>
	//   49   95:pop             
			return ((Object) (view));
	//   50   96:aload_2         
	//   51   97:areturn         
		}
	}

	private boolean isChildVisible(View view)
	{
		return !(view instanceof DocumentHiddenView);
	//    0    0:aload_1         
	//    1    1:instanceof      #71  <Class DocumentHiddenView>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	protected void onGetChildren(ViewGroup viewgroup, Accumulator accumulator)
	{
		int j = viewgroup.getChildCount();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #79  <Method int ViewGroup.getChildCount()>
	//    2    4:istore          4
		for(int i = 0; i < j; i++)
	//*   3    6:iconst_0        
	//*   4    7:istore_3        
	//*   5    8:iload_3         
	//*   6    9:iload           4
	//*   7   11:icmpge          50
		{
			View view = viewgroup.getChildAt(i);
	//    8   14:aload_1         
	//    9   15:iload_3         
	//   10   16:invokevirtual   #83  <Method View ViewGroup.getChildAt(int)>
	//   11   19:astore          5
			if(isChildVisible(view))
	//*  12   21:aload_0         
	//*  13   22:aload           5
	//*  14   24:invokespecial   #85  <Method boolean isChildVisible(View)>
	//*  15   27:ifeq            43
				accumulator.store(getElementForView(viewgroup, view));
	//   16   30:aload_2         
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:aload           5
	//   20   35:invokespecial   #87  <Method Object getElementForView(ViewGroup, View)>
	//   21   38:invokeinterface #92  <Method void Accumulator.store(Object)>
		}

	//   22   43:iload_3         
	//   23   44:iconst_1        
	//   24   45:iadd            
	//   25   46:istore_3        
	//*  26   47:goto            8
	//   27   50:return          
	}

	protected volatile void onGetChildren(Object obj, Accumulator accumulator)
	{
		onGetChildren((ViewGroup)obj, accumulator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #75  <Class ViewGroup>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #97  <Method void onGetChildren(ViewGroup, Accumulator)>
	//    5    9:return          
	}

	private final Map mViewToElementMap = Collections.synchronizedMap(((Map) (new WeakHashMap())));
}
