// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import java.util.List;

public class FragmentManagerNonConfig
{

	FragmentManagerNonConfig(List list, List list1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		mFragments = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field List mFragments>
		mChildNonConfigs = list1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #18  <Field List mChildNonConfigs>
	//    8   14:return          
	}

	List getChildNonConfigs()
	{
		return mChildNonConfigs;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field List mChildNonConfigs>
	//    2    4:areturn         
	}

	List getFragments()
	{
		return mFragments;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field List mFragments>
	//    2    4:areturn         
	}

	private final List mChildNonConfigs;
	private final List mFragments;
}
