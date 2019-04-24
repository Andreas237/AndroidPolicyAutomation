// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.view.View;

// Referenced classes of package com.pactforcure.app.ui:
//			SuicidalityActivity

final class SuicidalityActivity$$Lambda$1
	implements android.view.View.OnClickListener
{

	public static android.view.View.OnClickListener lambdaFactory$(SuicidalityActivity suicidalityactivity, int i, boolean flag, String s)
	{
		return ((android.view.View.OnClickListener) (new SuicidalityActivity$$Lambda$1(suicidalityactivity, i, flag, s)));
	//    0    0:new             #2   <Class SuicidalityActivity$$Lambda$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #32  <Method void SuicidalityActivity$$Lambda$1(SuicidalityActivity, int, boolean, String)>
	//    7   11:areturn         
	}

	public void onClick(View view)
	{
		SuicidalityActivity.lambda$onCreate$52(arg$1, arg$2, arg$3, arg$4, view);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field SuicidalityActivity arg$1>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field int arg$2>
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field boolean arg$3>
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field String arg$4>
	//    8   16:aload_1         
	//    9   17:invokestatic    #40  <Method void SuicidalityActivity.lambda$onCreate$52(SuicidalityActivity, int, boolean, String, View)>
	//   10   20:return          
	}

	private final SuicidalityActivity arg$1;
	private final int arg$2;
	private final boolean arg$3;
	private final String arg$4;

	private SuicidalityActivity$$Lambda$1(SuicidalityActivity suicidalityactivity, int i, boolean flag, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		arg$1 = suicidalityactivity;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field SuicidalityActivity arg$1>
		arg$2 = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #23  <Field int arg$2>
		arg$3 = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #25  <Field boolean arg$3>
		arg$4 = s;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #27  <Field String arg$4>
	//   14   25:return          
	}
}
