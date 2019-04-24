// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.view.animation.Animation;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.pactforcure.app.studies.Res;
import com.pactforcure.app.util.VersionUtils;

// Referenced classes of package com.pactforcure.app.ui:
//			MainActivity

class MainActivity$1
	implements android.view.animation.tionListener
{

	public void onAnimationEnd(Animation animation)
	{
	//    0    0:return          
	}

	public void onAnimationRepeat(Animation animation)
	{
	//    0    0:return          
	}

	public void onAnimationStart(Animation animation)
	{
		int i = MainActivity.access$000(MainActivity.this).getDisplayedChild();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field MainActivity this$0>
	//    2    4:invokestatic    #29  <Method ViewFlipper MainActivity.access$000(MainActivity)>
	//    3    7:invokevirtual   #35  <Method int ViewFlipper.getDisplayedChild()>
	//    4   10:istore_2        
		if(i == 0)
	//*   5   11:iload_2         
	//*   6   12:ifne            54
		{
			MainActivity.access$100(MainActivity.this).setVisibility(0);
	//    7   15:aload_0         
	//    8   16:getfield        #17  <Field MainActivity this$0>
	//    9   19:invokestatic    #39  <Method TextView MainActivity.access$100(MainActivity)>
	//   10   22:iconst_0        
	//   11   23:invokevirtual   #45  <Method void TextView.setVisibility(int)>
			MainActivity.access$100(MainActivity.this).setText(((CharSequence) (Res.getStudySpecificString(0x7f080343))));
	//   12   26:aload_0         
	//   13   27:getfield        #17  <Field MainActivity this$0>
	//   14   30:invokestatic    #39  <Method TextView MainActivity.access$100(MainActivity)>
	//   15   33:ldc1            #46  <Int 0x7f080343>
	//   16   35:invokestatic    #52  <Method String Res.getStudySpecificString(int)>
	//   17   38:invokevirtual   #56  <Method void TextView.setText(CharSequence)>
			MainActivity.access$100(MainActivity.this).setTypeface(((android.graphics.Typeface) (null)), 0);
	//   18   41:aload_0         
	//   19   42:getfield        #17  <Field MainActivity this$0>
	//   20   45:invokestatic    #39  <Method TextView MainActivity.access$100(MainActivity)>
	//   21   48:aconst_null     
	//   22   49:iconst_0        
	//   23   50:invokevirtual   #60  <Method void TextView.setTypeface(android.graphics.Typeface, int)>
			return;
	//   24   53:return          
		}
		if(i == 4)
	//*  25   54:iload_2         
	//*  26   55:iconst_4        
	//*  27   56:icmpne          113
		{
			MainActivity.access$100(MainActivity.this).setVisibility(0);
	//   28   59:aload_0         
	//   29   60:getfield        #17  <Field MainActivity this$0>
	//   30   63:invokestatic    #39  <Method TextView MainActivity.access$100(MainActivity)>
	//   31   66:iconst_0        
	//   32   67:invokevirtual   #45  <Method void TextView.setVisibility(int)>
			MainActivity.access$100(MainActivity.this).setTypeface(((android.graphics.Typeface) (null)), 2);
	//   33   70:aload_0         
	//   34   71:getfield        #17  <Field MainActivity this$0>
	//   35   74:invokestatic    #39  <Method TextView MainActivity.access$100(MainActivity)>
	//   36   77:aconst_null     
	//   37   78:iconst_2        
	//   38   79:invokevirtual   #60  <Method void TextView.setTypeface(android.graphics.Typeface, int)>
			animation = ((Animation) (Res.getStudySpecificString(0x7f08002a)));
	//   39   82:ldc1            #61  <Int 0x7f08002a>
	//   40   84:invokestatic    #52  <Method String Res.getStudySpecificString(int)>
	//   41   87:astore_1        
			MainActivity.access$100(MainActivity.this).setText(((CharSequence) (String.format(((String) (animation)), new Object[] {
				VersionUtils.getVersionName()
			}))));
	//   42   88:aload_0         
	//   43   89:getfield        #17  <Field MainActivity this$0>
	//   44   92:invokestatic    #39  <Method TextView MainActivity.access$100(MainActivity)>
	//   45   95:aload_1         
	//   46   96:iconst_1        
	//   47   97:anewarray       Object[]
	//   48  100:dup             
	//   49  101:iconst_0        
	//   50  102:invokestatic    #67  <Method String VersionUtils.getVersionName()>
	//   51  105:aastore         
	//   52  106:invokestatic    #73  <Method String String.format(String, Object[])>
	//   53  109:invokevirtual   #56  <Method void TextView.setText(CharSequence)>
			return;
	//   54  112:return          
		} else
		{
			MainActivity.access$100(MainActivity.this).setVisibility(8);
	//   55  113:aload_0         
	//   56  114:getfield        #17  <Field MainActivity this$0>
	//   57  117:invokestatic    #39  <Method TextView MainActivity.access$100(MainActivity)>
	//   58  120:bipush          8
	//   59  122:invokevirtual   #45  <Method void TextView.setVisibility(int)>
			return;
	//   60  125:return          
		}
	}

	final MainActivity this$0;

	MainActivity$1()
	{
		this$0 = MainActivity.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field MainActivity this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
