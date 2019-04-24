// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//			AppCompatSpinner

class AppCompatSpinner$b$2
	implements android.view.obalLayoutListener
{

	public void onGlobalLayout()
	{
		if(!a.a(((android.view.View) (a.b))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field AppCompatSpinner$b a>
	//*   2    4:aload_0         
	//*   3    5:getfield        #20  <Field AppCompatSpinner$b a>
	//*   4    8:getfield        #27  <Field AppCompatSpinner AppCompatSpinner$b.b>
	//*   5   11:invokevirtual   #30  <Method boolean AppCompatSpinner$b.a(android.view.View)>
	//*   6   14:ifne            25
		{
			a.e();
	//    7   17:aload_0         
	//    8   18:getfield        #20  <Field AppCompatSpinner$b a>
	//    9   21:invokevirtual   #33  <Method void AppCompatSpinner$b.e()>
			return;
	//   10   24:return          
		} else
		{
			a.b();
	//   11   25:aload_0         
	//   12   26:getfield        #20  <Field AppCompatSpinner$b a>
	//   13   29:invokevirtual   #35  <Method void AppCompatSpinner$b.b()>
			AppCompatSpinner.b.a(a);
	//   14   32:aload_0         
	//   15   33:getfield        #20  <Field AppCompatSpinner$b a>
	//   16   36:invokestatic    #37  <Method void AppCompatSpinner$b.a(AppCompatSpinner$b)>
			return;
	//   17   39:return          
		}
	}

	final AppCompatSpinner.b a;

	AppCompatSpinner$b$2(AppCompatSpinner.b b1)
	{
		a = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field AppCompatSpinner$b a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
	//    5    9:return          
	}
}
