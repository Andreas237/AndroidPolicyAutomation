// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.content.*;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package android.support.v4.app:
//			SupportActivity

abstract class BaseFragmentActivityApi14 extends SupportActivity
{

	BaseFragmentActivityApi14()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void SupportActivity()>
	//    2    4:return          
	}

	static void checkForValidRequestCode(int i)
	{
		if((0xffff0000 & i) != 0)
	//*   0    0:ldc1            #17  <Int 0xffff0000>
	//*   1    2:iload_0         
	//*   2    3:iand            
	//*   3    4:ifeq            17
			throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
	//    4    7:new             #19  <Class IllegalArgumentException>
	//    5   10:dup             
	//    6   11:ldc1            #21  <String "Can only use lower 16 bits for requestCode">
	//    7   13:invokespecial   #24  <Method void IllegalArgumentException(String)>
	//    8   16:athrow          
		else
			return;
	//    9   17:return          
	}

	abstract View dispatchFragmentsOnCreateView(View view, String s, Context context, AttributeSet attributeset);

	public View onCreateView(View view, String s, Context context, AttributeSet attributeset)
	{
		View view1 = dispatchFragmentsOnCreateView(view, s, context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokevirtual   #29  <Method View dispatchFragmentsOnCreateView(View, String, Context, AttributeSet)>
	//    6    9:astore          5
		if(view1 == null)
	//*   7   11:aload           5
	//*   8   13:ifnonnull       26
			return super.onCreateView(view, s, context, attributeset);
	//    9   16:aload_0         
	//   10   17:aload_1         
	//   11   18:aload_2         
	//   12   19:aload_3         
	//   13   20:aload           4
	//   14   22:invokespecial   #31  <Method View SupportActivity.onCreateView(View, String, Context, AttributeSet)>
	//   15   25:areturn         
		else
			return view1;
	//   16   26:aload           5
	//   17   28:areturn         
	}

	public View onCreateView(String s, Context context, AttributeSet attributeset)
	{
		View view = dispatchFragmentsOnCreateView(((View) (null)), s, context, attributeset);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokevirtual   #29  <Method View dispatchFragmentsOnCreateView(View, String, Context, AttributeSet)>
	//    6    8:astore          4
		if(view == null)
	//*   7   10:aload           4
	//*   8   12:ifnonnull       23
			return super.onCreateView(s, context, attributeset);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:aload_2         
	//   12   18:aload_3         
	//   13   19:invokespecial   #34  <Method View SupportActivity.onCreateView(String, Context, AttributeSet)>
	//   14   22:areturn         
		else
			return view;
	//   15   23:aload           4
	//   16   25:areturn         
	}

	public void startIntentSenderForResult(IntentSender intentsender, int i, Intent intent, int j, int k, int l)
		throws android.content.IntentSender.SendIntentException
	{
		if(!mStartedIntentSenderFromFragment && i != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field boolean mStartedIntentSenderFromFragment>
	//*   2    4:ifne            16
	//*   3    7:iload_2         
	//*   4    8:iconst_m1       
	//*   5    9:icmpeq          16
			checkForValidRequestCode(i);
	//    6   12:iload_2         
	//    7   13:invokestatic    #43  <Method void checkForValidRequestCode(int)>
		super.startIntentSenderForResult(intentsender, i, intent, j, k, l);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:iload_2         
	//   11   19:aload_3         
	//   12   20:iload           4
	//   13   22:iload           5
	//   14   24:iload           6
	//   15   26:invokespecial   #45  <Method void SupportActivity.startIntentSenderForResult(IntentSender, int, Intent, int, int, int)>
	//   16   29:return          
	}

	boolean mStartedIntentSenderFromFragment;
}
