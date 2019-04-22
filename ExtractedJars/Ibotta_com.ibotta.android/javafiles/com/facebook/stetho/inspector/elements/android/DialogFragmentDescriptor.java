// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.view.View;
import com.facebook.stetho.common.*;
import com.facebook.stetho.common.android.DialogFragmentAccessor;
import com.facebook.stetho.common.android.FragmentCompat;
import com.facebook.stetho.inspector.elements.*;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			HighlightableDescriptor, AndroidDescriptorHost

final class DialogFragmentDescriptor extends Descriptor
	implements ChainedDescriptor, HighlightableDescriptor
{

	private DialogFragmentDescriptor(FragmentCompat fragmentcompat)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Descriptor()>
		mAccessor = fragmentcompat.forDialogFragment();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #23  <Method DialogFragmentAccessor FragmentCompat.forDialogFragment()>
	//    5    9:putfield        #25  <Field DialogFragmentAccessor mAccessor>
	//    6   12:return          
	}

	private static void maybeRegister(DescriptorMap descriptormap, FragmentCompat fragmentcompat)
	{
		if(fragmentcompat != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          36
		{
			Class class1 = fragmentcompat.getDialogFragmentClass();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #33  <Method Class FragmentCompat.getDialogFragmentClass()>
	//    4    8:astore_2        
			LogUtil.d("Adding support for %s", new Object[] {
				class1
			});
	//    5    9:ldc1            #35  <String "Adding support for %s">
	//    6   11:iconst_1        
	//    7   12:anewarray       Object[]
	//    8   15:dup             
	//    9   16:iconst_0        
	//   10   17:aload_2         
	//   11   18:aastore         
	//   12   19:invokestatic    #43  <Method void LogUtil.d(String, Object[])>
			descriptormap.register(class1, ((Descriptor) (new DialogFragmentDescriptor(fragmentcompat))));
	//   13   22:aload_0         
	//   14   23:aload_2         
	//   15   24:new             #2   <Class DialogFragmentDescriptor>
	//   16   27:dup             
	//   17   28:aload_1         
	//   18   29:invokespecial   #45  <Method void DialogFragmentDescriptor(FragmentCompat)>
	//   19   32:invokevirtual   #51  <Method DescriptorMap DescriptorMap.register(Class, Descriptor)>
	//   20   35:pop             
		}
	//   21   36:return          
	}

	public static DescriptorMap register(DescriptorMap descriptormap)
	{
		maybeRegister(descriptormap, FragmentCompat.getSupportLibInstance());
	//    0    0:aload_0         
	//    1    1:invokestatic    #57  <Method FragmentCompat FragmentCompat.getSupportLibInstance()>
	//    2    4:invokestatic    #59  <Method void maybeRegister(DescriptorMap, FragmentCompat)>
		maybeRegister(descriptormap, FragmentCompat.getFrameworkInstance());
	//    3    7:aload_0         
	//    4    8:invokestatic    #62  <Method FragmentCompat FragmentCompat.getFrameworkInstance()>
	//    5   11:invokestatic    #59  <Method void maybeRegister(DescriptorMap, FragmentCompat)>
		return descriptormap;
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public void getAttributes(Object obj, AttributeAccumulator attributeaccumulator)
	{
		mSuper.getAttributes(obj, attributeaccumulator);
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Descriptor mSuper>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #68  <Method void Descriptor.getAttributes(Object, AttributeAccumulator)>
	//    5    9:return          
	}

	public void getChildren(Object obj, Accumulator accumulator)
	{
		accumulator.store(((Object) (mAccessor.getDialog(obj))));
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #25  <Field DialogFragmentAccessor mAccessor>
	//    3    5:aload_1         
	//    4    6:invokeinterface #76  <Method android.app.Dialog DialogFragmentAccessor.getDialog(Object)>
	//    5   11:invokeinterface #82  <Method void Accumulator.store(Object)>
	//    6   16:return          
	}

	public String getLocalName(Object obj)
	{
		return mSuper.getLocalName(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Descriptor mSuper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #88  <Method String Descriptor.getLocalName(Object)>
	//    4    8:areturn         
	}

	public String getNodeName(Object obj)
	{
		return mSuper.getNodeName(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Descriptor mSuper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #91  <Method String Descriptor.getNodeName(Object)>
	//    4    8:areturn         
	}

	public NodeType getNodeType(Object obj)
	{
		return mSuper.getNodeType(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Descriptor mSuper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #95  <Method NodeType Descriptor.getNodeType(Object)>
	//    4    8:areturn         
	}

	public String getNodeValue(Object obj)
	{
		return mSuper.getNodeValue(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Descriptor mSuper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #98  <Method String Descriptor.getNodeValue(Object)>
	//    4    8:areturn         
	}

	public void getStyles(Object obj, StyleAccumulator styleaccumulator)
	{
	//    0    0:return          
	}

	public View getViewForHighlighting(Object obj)
	{
		com.facebook.stetho.inspector.elements.Descriptor.Host host = getHost();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #107 <Method com.facebook.stetho.inspector.elements.Descriptor$Host getHost()>
	//    2    4:astore_2        
		if(host instanceof AndroidDescriptorHost)
	//*   3    5:aload_2         
	//*   4    6:instanceof      #109 <Class AndroidDescriptorHost>
	//*   5    9:ifeq            34
		{
			obj = ((Object) (mAccessor.getDialog(obj)));
	//    6   12:aload_0         
	//    7   13:getfield        #25  <Field DialogFragmentAccessor mAccessor>
	//    8   16:aload_1         
	//    9   17:invokeinterface #76  <Method android.app.Dialog DialogFragmentAccessor.getDialog(Object)>
	//   10   22:astore_1        
			return ((AndroidDescriptorHost)host).getHighlightingView(obj);
	//   11   23:aload_2         
	//   12   24:checkcast       #109 <Class AndroidDescriptorHost>
	//   13   27:aload_1         
	//   14   28:invokeinterface #112 <Method View AndroidDescriptorHost.getHighlightingView(Object)>
	//   15   33:areturn         
		} else
		{
			return null;
	//   16   34:aconst_null     
	//   17   35:areturn         
		}
	}

	public void hook(Object obj)
	{
		mSuper.hook(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Descriptor mSuper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #115 <Method void Descriptor.hook(Object)>
	//    4    8:return          
	}

	public void setAttributesAsText(Object obj, String s)
	{
		mSuper.setAttributesAsText(obj, s);
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Descriptor mSuper>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #119 <Method void Descriptor.setAttributesAsText(Object, String)>
	//    5    9:return          
	}

	public void setSuper(Descriptor descriptor)
	{
		Util.throwIfNull(((Object) (descriptor)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #127 <Method Object Util.throwIfNull(Object)>
	//    2    4:pop             
		Descriptor descriptor1 = mSuper;
	//    3    5:aload_0         
	//    4    6:getfield        #66  <Field Descriptor mSuper>
	//    5    9:astore_2        
		if(descriptor != descriptor1)
	//*   6   10:aload_1         
	//*   7   11:aload_2         
	//*   8   12:if_acmpeq       33
		{
			if(descriptor1 == null)
	//*   9   15:aload_2         
	//*  10   16:ifnonnull       25
			{
				mSuper = descriptor;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #66  <Field Descriptor mSuper>
				return;
	//   14   24:return          
			} else
			{
				throw new IllegalStateException();
	//   15   25:new             #129 <Class IllegalStateException>
	//   16   28:dup             
	//   17   29:invokespecial   #130 <Method void IllegalStateException()>
	//   18   32:athrow          
			}
		} else
		{
			return;
	//   19   33:return          
		}
	}

	public void unhook(Object obj)
	{
		mSuper.unhook(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Descriptor mSuper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #133 <Method void Descriptor.unhook(Object)>
	//    4    8:return          
	}

	private final DialogFragmentAccessor mAccessor;
	private Descriptor mSuper;
}
