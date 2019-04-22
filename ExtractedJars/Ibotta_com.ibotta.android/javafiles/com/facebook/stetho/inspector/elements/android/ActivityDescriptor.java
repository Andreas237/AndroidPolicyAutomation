// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.app.Activity;
import android.view.View;
import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.common.StringUtil;
import com.facebook.stetho.common.android.*;
import com.facebook.stetho.inspector.elements.AbstractChainedDescriptor;
import java.util.List;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			HighlightableDescriptor, AndroidDescriptorHost

final class ActivityDescriptor extends AbstractChainedDescriptor
	implements HighlightableDescriptor
{

	ActivityDescriptor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void AbstractChainedDescriptor()>
	//    2    4:return          
	}

	private static void getDialogFragments(FragmentCompat fragmentcompat, Activity activity, Accumulator accumulator)
	{
		if(fragmentcompat != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          101
		{
			if(!fragmentcompat.getFragmentActivityClass().isInstance(((Object) (activity))))
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #21  <Method Class FragmentCompat.getFragmentActivityClass()>
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #27  <Method boolean Class.isInstance(Object)>
	//*   6   12:ifne            16
				return;
	//    7   15:return          
			activity = ((Activity) (fragmentcompat.forFragmentActivity().getFragmentManager(activity)));
	//    8   16:aload_0         
	//    9   17:invokevirtual   #31  <Method FragmentActivityAccessor FragmentCompat.forFragmentActivity()>
	//   10   20:aload_1         
	//   11   21:invokeinterface #37  <Method Object FragmentActivityAccessor.getFragmentManager(Activity)>
	//   12   26:astore_1        
			if(activity == null)
	//*  13   27:aload_1         
	//*  14   28:ifnonnull       32
				return;
	//   15   31:return          
			activity = ((Activity) (fragmentcompat.forFragmentManager().getAddedFragments(((Object) (activity)))));
	//   16   32:aload_0         
	//   17   33:invokevirtual   #41  <Method FragmentManagerAccessor FragmentCompat.forFragmentManager()>
	//   18   36:aload_1         
	//   19   37:invokeinterface #47  <Method List FragmentManagerAccessor.getAddedFragments(Object)>
	//   20   42:astore_1        
			if(activity == null)
	//*  21   43:aload_1         
	//*  22   44:ifnonnull       48
				return;
	//   23   47:return          
			int i = 0;
	//   24   48:iconst_0        
	//   25   49:istore_3        
			for(int j = ((List) (activity)).size(); i < j; i++)
	//*  26   50:aload_1         
	//*  27   51:invokeinterface #53  <Method int List.size()>
	//*  28   56:istore          4
	//*  29   58:iload_3         
	//*  30   59:iload           4
	//*  31   61:icmpge          100
			{
				Object obj = ((List) (activity)).get(i);
	//   32   64:aload_1         
	//   33   65:iload_3         
	//   34   66:invokeinterface #57  <Method Object List.get(int)>
	//   35   71:astore          5
				if(fragmentcompat.getDialogFragmentClass().isInstance(obj))
	//*  36   73:aload_0         
	//*  37   74:invokevirtual   #60  <Method Class FragmentCompat.getDialogFragmentClass()>
	//*  38   77:aload           5
	//*  39   79:invokevirtual   #27  <Method boolean Class.isInstance(Object)>
	//*  40   82:ifeq            93
					accumulator.store(obj);
	//   41   85:aload_2         
	//   42   86:aload           5
	//   43   88:invokeinterface #66  <Method void Accumulator.store(Object)>
			}

	//   44   93:iload_3         
	//   45   94:iconst_1        
	//   46   95:iadd            
	//   47   96:istore_3        
	//*  48   97:goto            58
			return;
	//   49  100:return          
		} else
		{
			return;
	//   50  101:return          
		}
	}

	public View getViewForHighlighting(Object obj)
	{
		com.facebook.stetho.inspector.elements.Descriptor.Host host = getHost();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method com.facebook.stetho.inspector.elements.Descriptor$Host getHost()>
	//    2    4:astore_2        
		if(host instanceof AndroidDescriptorHost)
	//*   3    5:aload_2         
	//*   4    6:instanceof      #77  <Class AndroidDescriptorHost>
	//*   5    9:ifeq            31
		{
			obj = ((Object) (((Activity)obj).getWindow()));
	//    6   12:aload_1         
	//    7   13:checkcast       #79  <Class Activity>
	//    8   16:invokevirtual   #83  <Method android.view.Window Activity.getWindow()>
	//    9   19:astore_1        
			return ((AndroidDescriptorHost)host).getHighlightingView(obj);
	//   10   20:aload_2         
	//   11   21:checkcast       #77  <Class AndroidDescriptorHost>
	//   12   24:aload_1         
	//   13   25:invokeinterface #86  <Method View AndroidDescriptorHost.getHighlightingView(Object)>
	//   14   30:areturn         
		} else
		{
			return null;
	//   15   31:aconst_null     
	//   16   32:areturn         
		}
	}

	protected void onGetChildren(Activity activity, Accumulator accumulator)
	{
		getDialogFragments(FragmentCompat.getSupportLibInstance(), activity, accumulator);
	//    0    0:invokestatic    #92  <Method FragmentCompat FragmentCompat.getSupportLibInstance()>
	//    1    3:aload_1         
	//    2    4:aload_2         
	//    3    5:invokestatic    #94  <Method void getDialogFragments(FragmentCompat, Activity, Accumulator)>
		getDialogFragments(FragmentCompat.getFrameworkInstance(), activity, accumulator);
	//    4    8:invokestatic    #97  <Method FragmentCompat FragmentCompat.getFrameworkInstance()>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokestatic    #94  <Method void getDialogFragments(FragmentCompat, Activity, Accumulator)>
		activity = ((Activity) (activity.getWindow()));
	//    8   16:aload_1         
	//    9   17:invokevirtual   #83  <Method android.view.Window Activity.getWindow()>
	//   10   20:astore_1        
		if(activity != null)
	//*  11   21:aload_1         
	//*  12   22:ifnull          32
			accumulator.store(((Object) (activity)));
	//   13   25:aload_2         
	//   14   26:aload_1         
	//   15   27:invokeinterface #66  <Method void Accumulator.store(Object)>
	//   16   32:return          
	}

	protected volatile void onGetChildren(Object obj, Accumulator accumulator)
	{
		onGetChildren((Activity)obj, accumulator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #79  <Class Activity>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #101 <Method void onGetChildren(Activity, Accumulator)>
	//    5    9:return          
	}

	protected String onGetNodeName(Activity activity)
	{
		return StringUtil.removePrefix(((Object) (activity)).getClass().getName(), "android.app.");
	//    0    0:aload_1         
	//    1    1:invokevirtual   #108 <Method Class Object.getClass()>
	//    2    4:invokevirtual   #112 <Method String Class.getName()>
	//    3    7:ldc1            #114 <String "android.app.">
	//    4    9:invokestatic    #120 <Method String StringUtil.removePrefix(String, String)>
	//    5   12:areturn         
	}

	protected volatile String onGetNodeName(Object obj)
	{
		return onGetNodeName((Activity)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #79  <Class Activity>
	//    3    5:invokevirtual   #123 <Method String onGetNodeName(Activity)>
	//    4    8:areturn         
	}
}
