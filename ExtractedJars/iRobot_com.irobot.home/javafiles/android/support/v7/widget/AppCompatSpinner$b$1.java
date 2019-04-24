// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.widget:
//			AppCompatSpinner

class AppCompatSpinner$b$1
	implements android.widget.ckListener
{

	public void onItemClick(AdapterView adapterview, View view, int i, long l)
	{
		b.b.setSelection(i);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AppCompatSpinner$b b>
	//    2    4:getfield        #30  <Field AppCompatSpinner AppCompatSpinner$b.b>
	//    3    7:iload_3         
	//    4    8:invokevirtual   #34  <Method void AppCompatSpinner.setSelection(int)>
		if(b.b.getOnItemClickListener() != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #20  <Field AppCompatSpinner$b b>
	//*   7   15:getfield        #30  <Field AppCompatSpinner AppCompatSpinner$b.b>
	//*   8   18:invokevirtual   #38  <Method android.widget.AdapterView$OnItemClickListener AppCompatSpinner.getOnItemClickListener()>
	//*   9   21:ifnull          50
			b.b.performItemClick(view, i, b.a.getItemId(i));
	//   10   24:aload_0         
	//   11   25:getfield        #20  <Field AppCompatSpinner$b b>
	//   12   28:getfield        #30  <Field AppCompatSpinner AppCompatSpinner$b.b>
	//   13   31:aload_2         
	//   14   32:iload_3         
	//   15   33:aload_0         
	//   16   34:getfield        #20  <Field AppCompatSpinner$b b>
	//   17   37:getfield        #41  <Field ListAdapter AppCompatSpinner$b.a>
	//   18   40:iload_3         
	//   19   41:invokeinterface #47  <Method long ListAdapter.getItemId(int)>
	//   20   46:invokevirtual   #51  <Method boolean AppCompatSpinner.performItemClick(View, int, long)>
	//   21   49:pop             
		b.e();
	//   22   50:aload_0         
	//   23   51:getfield        #20  <Field AppCompatSpinner$b b>
	//   24   54:invokevirtual   #54  <Method void AppCompatSpinner$b.e()>
	//   25   57:return          
	}

	final AppCompatSpinner a;
	final AppCompatSpinner.b b;

	AppCompatSpinner$b$1(AppCompatSpinner.b b1, AppCompatSpinner appcompatspinner)
	{
		b = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field AppCompatSpinner$b b>
		a = appcompatspinner;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field AppCompatSpinner a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
