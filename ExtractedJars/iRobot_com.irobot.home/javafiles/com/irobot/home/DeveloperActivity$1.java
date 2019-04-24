// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.view.View;
import android.widget.AdapterView;
import com.irobot.home.util.j;
import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home:
//			DeveloperActivity

class DeveloperActivity$1
	implements android.widget.lectedListener
{

	public void onItemSelected(AdapterView adapterview, View view, int i, long l)
	{
		adapterview = ((AdapterView) (adapterview.getItemAtPosition(i).toString()));
	//    0    0:aload_1         
	//    1    1:iload_3         
	//    2    2:invokevirtual   #28  <Method Object AdapterView.getItemAtPosition(int)>
	//    3    5:invokevirtual   #32  <Method String Object.toString()>
	//    4    8:astore_1        
		if(j.i(((String) (adapterview))))
	//*   5    9:aload_1         
	//*   6   10:invokestatic    #38  <Method boolean j.i(String)>
	//*   7   13:ifeq            85
		{
			view = ((View) (new StringBuilder()));
	//    8   16:new             #40  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #41  <Method void StringBuilder()>
	//   11   23:astore_2        
			((StringBuilder) (view)).append("selected env: ");
	//   12   24:aload_2         
	//   13   25:ldc1            #43  <String "selected env: ">
	//   14   27:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
			((StringBuilder) (view)).append(((String) (adapterview)));
	//   16   31:aload_2         
	//   17   32:aload_1         
	//   18   33:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   19   36:pop             
			o.b("Developer", ((StringBuilder) (view)).toString());
	//   20   37:ldc1            #49  <String "Developer">
	//   21   39:aload_2         
	//   22   40:invokevirtual   #50  <Method String StringBuilder.toString()>
	//   23   43:invokestatic    #56  <Method void o.b(String, String)>
			j.p(((String) (adapterview)));
	//   24   46:aload_1         
	//   25   47:invokestatic    #60  <Method void j.p(String)>
			adapterview = ((AdapterView) (j.p()));
	//   26   50:invokestatic    #62  <Method String j.p()>
	//   27   53:astore_1        
			view = ((View) (new StringBuilder()));
	//   28   54:new             #40  <Class StringBuilder>
	//   29   57:dup             
	//   30   58:invokespecial   #41  <Method void StringBuilder()>
	//   31   61:astore_2        
			((StringBuilder) (view)).append("Axeda Simulator is");
	//   32   62:aload_2         
	//   33   63:ldc1            #64  <String "Axeda Simulator is">
	//   34   65:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   35   68:pop             
			((StringBuilder) (view)).append(((String) (adapterview)));
	//   36   69:aload_2         
	//   37   70:aload_1         
	//   38   71:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   39   74:pop             
			o.b("Developer", ((StringBuilder) (view)).toString());
	//   40   75:ldc1            #49  <String "Developer">
	//   41   77:aload_2         
	//   42   78:invokevirtual   #50  <Method String StringBuilder.toString()>
	//   43   81:invokestatic    #56  <Method void o.b(String, String)>
			return;
	//   44   84:return          
		} else
		{
			o.e("Developer", "AWS environment selector returned invalid string");
	//   45   85:ldc1            #49  <String "Developer">
	//   46   87:ldc1            #66  <String "AWS environment selector returned invalid string">
	//   47   89:invokestatic    #68  <Method void o.e(String, String)>
			return;
	//   48   92:return          
		}
	}

	public void onNothingSelected(AdapterView adapterview)
	{
	//    0    0:return          
	}

	final DeveloperActivity a;

	DeveloperActivity$1(DeveloperActivity developeractivity)
	{
		a = developeractivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field DeveloperActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
