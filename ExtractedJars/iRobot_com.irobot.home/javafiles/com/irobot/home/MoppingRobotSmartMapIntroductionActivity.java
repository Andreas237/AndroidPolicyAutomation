// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.Intent;
import android.widget.ImageButton;
import com.irobot.core.AssetInfo;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.view.CustomButton;
import com.irobot.home.view.CustomTextView;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, TrainRobotActivity_

public class MoppingRobotSmartMapIntroductionActivity extends BaseFragmentActivity
{

	public MoppingRobotSmartMapIntroductionActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void BaseFragmentActivity()>
	//    2    4:return          
	}

	public void e()
	{
		a a1 = j.j();
	//    0    0:invokestatic    #23  <Method a j.j()>
	//    1    3:astore_2        
		String s = "";
	//    2    4:ldc1            #25  <String "">
	//    3    6:astore_1        
		if(a1 != null)
	//*   4    7:aload_2         
	//*   5    8:ifnull          19
			s = a1.a().getName();
	//    6   11:aload_2         
	//    7   12:invokevirtual   #30  <Method AssetInfo a.a()>
	//    8   15:invokevirtual   #36  <Method String AssetInfo.getName()>
	//    9   18:astore_1        
		d.setText(((CharSequence) (getString(0x7f0f0655, new Object[] {
			s
		}))));
	//   10   19:aload_0         
	//   11   20:getfield        #38  <Field CustomTextView d>
	//   12   23:aload_0         
	//   13   24:ldc1            #39  <Int 0x7f0f0655>
	//   14   26:iconst_1        
	//   15   27:anewarray       Object[]
	//   16   30:dup             
	//   17   31:iconst_0        
	//   18   32:aload_1         
	//   19   33:aastore         
	//   20   34:invokevirtual   #45  <Method String getString(int, Object[])>
	//   21   37:invokevirtual   #51  <Method void CustomTextView.setText(CharSequence)>
	//   22   40:return          
	}

	void f()
	{
		startActivity(new Intent(((android.content.Context) (this)), com/irobot/home/TrainRobotActivity_));
	//    0    0:aload_0         
	//    1    1:new             #54  <Class Intent>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:ldc1            #56  <Class TrainRobotActivity_>
	//    5    8:invokespecial   #59  <Method void Intent(android.content.Context, Class)>
	//    6   11:invokevirtual   #63  <Method void startActivity(Intent)>
		finish();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #66  <Method void finish()>
	//    9   18:return          
	}

	void g()
	{
		j.a(((android.app.Activity) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #70  <Method void j.a(android.app.Activity)>
	//    2    4:return          
	}

	void h()
	{
		j.a(((android.app.Activity) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #70  <Method void j.a(android.app.Activity)>
	//    2    4:return          
	}

	ImageButton a;
	CustomButton b;
	CustomTextView c;
	CustomTextView d;
}
