// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.Intent;
import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.irobot.home:
//			DuplicateRegionNameActivity

class DuplicateRegionNameActivity$2
	implements android.widget.r
{

	public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
	{
		if(i == 6)
	//*   0    0:iload_2         
	//*   1    1:bipush          6
	//*   2    3:icmpne          80
		{
			if(DuplicateRegionNameActivity.a(a))
	//*   3    6:aload_0         
	//*   4    7:getfield        #17  <Field DuplicateRegionNameActivity a>
	//*   5   10:invokestatic    #25  <Method boolean DuplicateRegionNameActivity.a(DuplicateRegionNameActivity)>
	//*   6   13:ifeq            71
			{
				textview = ((TextView) (new Intent()));
	//    7   16:new             #27  <Class Intent>
	//    8   19:dup             
	//    9   20:invokespecial   #28  <Method void Intent()>
	//   10   23:astore_1        
				((Intent) (textview)).putExtra("validRegionName", DuplicateRegionNameActivity.b(a));
	//   11   24:aload_1         
	//   12   25:ldc1            #30  <String "validRegionName">
	//   13   27:aload_0         
	//   14   28:getfield        #17  <Field DuplicateRegionNameActivity a>
	//   15   31:invokestatic    #34  <Method String DuplicateRegionNameActivity.b(DuplicateRegionNameActivity)>
	//   16   34:invokevirtual   #38  <Method Intent Intent.putExtra(String, String)>
	//   17   37:pop             
				((Intent) (textview)).putExtra("shouldRenamePrevious", false);
	//   18   38:aload_1         
	//   19   39:ldc1            #40  <String "shouldRenamePrevious">
	//   20   41:iconst_0        
	//   21   42:invokevirtual   #43  <Method Intent Intent.putExtra(String, boolean)>
	//   22   45:pop             
				a.setResult(-1, ((Intent) (textview)));
	//   23   46:aload_0         
	//   24   47:getfield        #17  <Field DuplicateRegionNameActivity a>
	//   25   50:iconst_m1       
	//   26   51:aload_1         
	//   27   52:invokevirtual   #47  <Method void DuplicateRegionNameActivity.setResult(int, Intent)>
				a.w();
	//   28   55:aload_0         
	//   29   56:getfield        #17  <Field DuplicateRegionNameActivity a>
	//   30   59:invokevirtual   #50  <Method void DuplicateRegionNameActivity.w()>
				a.finish();
	//   31   62:aload_0         
	//   32   63:getfield        #17  <Field DuplicateRegionNameActivity a>
	//   33   66:invokevirtual   #53  <Method void DuplicateRegionNameActivity.finish()>
				return true;
	//   34   69:iconst_1        
	//   35   70:ireturn         
			} else
			{
				DuplicateRegionNameActivity.c(a);
	//   36   71:aload_0         
	//   37   72:getfield        #17  <Field DuplicateRegionNameActivity a>
	//   38   75:invokestatic    #56  <Method void DuplicateRegionNameActivity.c(DuplicateRegionNameActivity)>
				return true;
	//   39   78:iconst_1        
	//   40   79:ireturn         
			}
		} else
		{
			return false;
	//   41   80:iconst_0        
	//   42   81:ireturn         
		}
	}

	final DuplicateRegionNameActivity a;

	DuplicateRegionNameActivity$2(DuplicateRegionNameActivity duplicateregionnameactivity)
	{
		a = duplicateregionnameactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field DuplicateRegionNameActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
