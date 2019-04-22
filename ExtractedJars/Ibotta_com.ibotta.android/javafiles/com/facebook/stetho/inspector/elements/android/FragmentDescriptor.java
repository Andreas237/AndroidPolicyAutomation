// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.view.View;
import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.common.android.*;
import com.facebook.stetho.inspector.elements.*;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			HighlightableDescriptor

final class FragmentDescriptor extends AbstractChainedDescriptor
	implements HighlightableDescriptor
{

	private FragmentDescriptor(FragmentCompat fragmentcompat)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void AbstractChainedDescriptor()>
		mAccessor = fragmentcompat.forFragment();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #27  <Method FragmentAccessor FragmentCompat.forFragment()>
	//    5    9:putfield        #29  <Field FragmentAccessor mAccessor>
	//    6   12:return          
	}

	private static void maybeRegister(DescriptorMap descriptormap, FragmentCompat fragmentcompat)
	{
		if(fragmentcompat != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          39
		{
			Class class1 = fragmentcompat.getFragmentClass();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #37  <Method Class FragmentCompat.getFragmentClass()>
	//    4    8:astore_2        
			LogUtil.d("Adding support for %s", new Object[] {
				class1.getName()
			});
	//    5    9:ldc1            #39  <String "Adding support for %s">
	//    6   11:iconst_1        
	//    7   12:anewarray       Object[]
	//    8   15:dup             
	//    9   16:iconst_0        
	//   10   17:aload_2         
	//   11   18:invokevirtual   #47  <Method String Class.getName()>
	//   12   21:aastore         
	//   13   22:invokestatic    #53  <Method void LogUtil.d(String, Object[])>
			descriptormap.register(class1, ((com.facebook.stetho.inspector.elements.Descriptor) (new FragmentDescriptor(fragmentcompat))));
	//   14   25:aload_0         
	//   15   26:aload_2         
	//   16   27:new             #2   <Class FragmentDescriptor>
	//   17   30:dup             
	//   18   31:aload_1         
	//   19   32:invokespecial   #55  <Method void FragmentDescriptor(FragmentCompat)>
	//   20   35:invokevirtual   #61  <Method DescriptorMap DescriptorMap.register(Class, com.facebook.stetho.inspector.elements.Descriptor)>
	//   21   38:pop             
		}
	//   22   39:return          
	}

	public static DescriptorMap register(DescriptorMap descriptormap)
	{
		maybeRegister(descriptormap, FragmentCompat.getSupportLibInstance());
	//    0    0:aload_0         
	//    1    1:invokestatic    #67  <Method FragmentCompat FragmentCompat.getSupportLibInstance()>
	//    2    4:invokestatic    #69  <Method void maybeRegister(DescriptorMap, FragmentCompat)>
		maybeRegister(descriptormap, FragmentCompat.getFrameworkInstance());
	//    3    7:aload_0         
	//    4    8:invokestatic    #72  <Method FragmentCompat FragmentCompat.getFrameworkInstance()>
	//    5   11:invokestatic    #69  <Method void maybeRegister(DescriptorMap, FragmentCompat)>
		return descriptormap;
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public View getViewForHighlighting(Object obj)
	{
		return mAccessor.getView(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field FragmentAccessor mAccessor>
	//    2    4:aload_1         
	//    3    5:invokeinterface #79  <Method View FragmentAccessor.getView(Object)>
	//    4   10:areturn         
	}

	protected void onGetAttributes(Object obj, AttributeAccumulator attributeaccumulator)
	{
		int i = mAccessor.getId(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field FragmentAccessor mAccessor>
	//    2    4:aload_1         
	//    3    5:invokeinterface #85  <Method int FragmentAccessor.getId(Object)>
	//    4   10:istore_3        
		if(i != 0)
	//*   5   11:iload_3         
	//*   6   12:ifeq            38
			attributeaccumulator.store("id", ResourcesUtil.getIdStringQuietly(obj, mAccessor.getResources(obj), i));
	//    7   15:aload_2         
	//    8   16:ldc1            #11  <String "id">
	//    9   18:aload_1         
	//   10   19:aload_0         
	//   11   20:getfield        #29  <Field FragmentAccessor mAccessor>
	//   12   23:aload_1         
	//   13   24:invokeinterface #89  <Method android.content.res.Resources FragmentAccessor.getResources(Object)>
	//   14   29:iload_3         
	//   15   30:invokestatic    #95  <Method String ResourcesUtil.getIdStringQuietly(Object, android.content.res.Resources, int)>
	//   16   33:invokeinterface #101 <Method void AttributeAccumulator.store(String, String)>
		obj = ((Object) (mAccessor.getTag(obj)));
	//   17   38:aload_0         
	//   18   39:getfield        #29  <Field FragmentAccessor mAccessor>
	//   19   42:aload_1         
	//   20   43:invokeinterface #105 <Method String FragmentAccessor.getTag(Object)>
	//   21   48:astore_1        
		if(obj != null && ((String) (obj)).length() > 0)
	//*  22   49:aload_1         
	//*  23   50:ifnull          69
	//*  24   53:aload_1         
	//*  25   54:invokevirtual   #111 <Method int String.length()>
	//*  26   57:ifle            69
			attributeaccumulator.store("tag", ((String) (obj)));
	//   27   60:aload_2         
	//   28   61:ldc1            #14  <String "tag">
	//   29   63:aload_1         
	//   30   64:invokeinterface #101 <Method void AttributeAccumulator.store(String, String)>
	//   31   69:return          
	}

	protected void onGetChildren(Object obj, Accumulator accumulator)
	{
		obj = ((Object) (mAccessor.getView(obj)));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field FragmentAccessor mAccessor>
	//    2    4:aload_1         
	//    3    5:invokeinterface #79  <Method View FragmentAccessor.getView(Object)>
	//    4   10:astore_1        
		if(obj != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          22
			accumulator.store(obj);
	//    7   15:aload_2         
	//    8   16:aload_1         
	//    9   17:invokeinterface #118 <Method void Accumulator.store(Object)>
	//   10   22:return          
	}

	private static final String ID_ATTRIBUTE_NAME = "id";
	private static final String TAG_ATTRIBUTE_NAME = "tag";
	private final FragmentAccessor mAccessor;
}
