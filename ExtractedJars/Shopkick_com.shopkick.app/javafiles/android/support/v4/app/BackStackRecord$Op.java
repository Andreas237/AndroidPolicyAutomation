// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;


// Referenced classes of package android.support.v4.app:
//			BackStackRecord, Fragment

static final class BackStackRecord$Op
{

	int cmd;
	int enterAnim;
	int exitAnim;
	Fragment fragment;
	int popEnterAnim;
	int popExitAnim;

	BackStackRecord$Op()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}

	BackStackRecord$Op(int i, Fragment fragment1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		cmd = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #23  <Field int cmd>
		fragment = fragment1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field Fragment fragment>
	//    8   14:return          
	}
}
