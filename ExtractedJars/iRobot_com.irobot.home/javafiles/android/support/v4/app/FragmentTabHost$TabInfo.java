// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//			FragmentTabHost, Fragment

static final class FragmentTabHost$TabInfo
{

	final Bundle args;
	final Class clss;
	Fragment fragment;
	final String tag;

	FragmentTabHost$TabInfo(String s, Class class1, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		tag = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field String tag>
		clss = class1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field Class clss>
		args = bundle;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #27  <Field Bundle args>
	//   11   19:return          
	}
}
