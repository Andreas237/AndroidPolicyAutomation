// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import android.content.Context;

// Referenced classes of package bolts:
//			Continuation, AppLinkNavigation, Task, AppLink

static final class AppLinkNavigation$1
	implements Continuation
{

	public vigationResult then(Task task)
		throws Exception
	{
		return AppLinkNavigation.navigate(val$context, (AppLink)task.getResult());
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context val$context>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #32  <Method Object Task.getResult()>
	//    4    8:checkcast       #34  <Class AppLink>
	//    5   11:invokestatic    #38  <Method AppLinkNavigation$NavigationResult AppLinkNavigation.navigate(Context, AppLink)>
	//    6   14:areturn         
	}

	public volatile Object then(Task task)
		throws Exception
	{
		return ((Object) (then(task)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #44  <Method AppLinkNavigation$NavigationResult then(Task)>
	//    3    5:areturn         
	}

	final Context val$context;

	AppLinkNavigation$1(Context context1)
	{
		val$context = context1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field Context val$context>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
