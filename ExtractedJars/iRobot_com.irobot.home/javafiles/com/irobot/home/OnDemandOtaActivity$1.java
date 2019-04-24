// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.support.v4.app.*;
import android.widget.ImageButton;
import android.widget.TextView;
import com.irobot.home.fragments.SoftwareUpdateAvailableFragment;
import com.irobot.home.fragments.cf;
import com.irobot.home.fragments.ch;

// Referenced classes of package com.irobot.home:
//			OnDemandOtaActivity

class OnDemandOtaActivity$1
	implements Runnable
{

	public void run()
	{
		if(a != null && !a.equals(((Object) (OnDemandOtaActivity.a(c)))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field Fragment a>
	//*   2    4:ifnull          170
	//*   3    7:aload_0         
	//*   4    8:getfield        #22  <Field Fragment a>
	//*   5   11:aload_0         
	//*   6   12:getfield        #20  <Field OnDemandOtaActivity c>
	//*   7   15:invokestatic    #32  <Method Fragment OnDemandOtaActivity.a(OnDemandOtaActivity)>
	//*   8   18:invokevirtual   #38  <Method boolean Fragment.equals(Object)>
	//*   9   21:ifne            170
		{
			OnDemandOtaActivity.a(c, a);
	//   10   24:aload_0         
	//   11   25:getfield        #20  <Field OnDemandOtaActivity c>
	//   12   28:aload_0         
	//   13   29:getfield        #22  <Field Fragment a>
	//   14   32:invokestatic    #41  <Method Fragment OnDemandOtaActivity.a(OnDemandOtaActivity, Fragment)>
	//   15   35:pop             
			Object obj = ((Object) (c.getSupportFragmentManager().beginTransaction()));
	//   16   36:aload_0         
	//   17   37:getfield        #20  <Field OnDemandOtaActivity c>
	//   18   40:invokevirtual   #45  <Method FragmentManager OnDemandOtaActivity.getSupportFragmentManager()>
	//   19   43:invokevirtual   #51  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   20   46:astore          4
			((FragmentTransaction) (obj)).replace(0x7f09022f, a);
	//   21   48:aload           4
	//   22   50:ldc1            #52  <Int 0x7f09022f>
	//   23   52:aload_0         
	//   24   53:getfield        #22  <Field Fragment a>
	//   25   56:invokevirtual   #58  <Method FragmentTransaction FragmentTransaction.replace(int, Fragment)>
	//   26   59:pop             
			((FragmentTransaction) (obj)).commitNow();
	//   27   60:aload           4
	//   28   62:invokevirtual   #61  <Method void FragmentTransaction.commitNow()>
			OnDemandOtaActivity.a(c, b);
	//   29   65:aload_0         
	//   30   66:getfield        #20  <Field OnDemandOtaActivity c>
	//   31   69:aload_0         
	//   32   70:getfield        #24  <Field String b>
	//   33   73:invokestatic    #64  <Method String OnDemandOtaActivity.a(OnDemandOtaActivity, String)>
	//   34   76:pop             
			c.g.setText(((CharSequence) (b)));
	//   35   77:aload_0         
	//   36   78:getfield        #20  <Field OnDemandOtaActivity c>
	//   37   81:getfield        #68  <Field TextView OnDemandOtaActivity.g>
	//   38   84:aload_0         
	//   39   85:getfield        #24  <Field String b>
	//   40   88:invokevirtual   #74  <Method void TextView.setText(CharSequence)>
			boolean flag2 = OnDemandOtaActivity.a(c) instanceof SoftwareUpdateAvailableFragment;
	//   41   91:aload_0         
	//   42   92:getfield        #20  <Field OnDemandOtaActivity c>
	//   43   95:invokestatic    #32  <Method Fragment OnDemandOtaActivity.a(OnDemandOtaActivity)>
	//   44   98:instanceof      #76  <Class SoftwareUpdateAvailableFragment>
	//   45  101:istore_3        
			boolean flag1 = false;
	//   46  102:iconst_0        
	//   47  103:istore_2        
			boolean flag;
			if(!flag2 && !(OnDemandOtaActivity.a(c) instanceof ch) && !(OnDemandOtaActivity.a(c) instanceof cf))
	//*  48  104:iload_3         
	//*  49  105:ifne            142
	//*  50  108:aload_0         
	//*  51  109:getfield        #20  <Field OnDemandOtaActivity c>
	//*  52  112:invokestatic    #32  <Method Fragment OnDemandOtaActivity.a(OnDemandOtaActivity)>
	//*  53  115:instanceof      #78  <Class ch>
	//*  54  118:ifne            142
	//*  55  121:aload_0         
	//*  56  122:getfield        #20  <Field OnDemandOtaActivity c>
	//*  57  125:invokestatic    #32  <Method Fragment OnDemandOtaActivity.a(OnDemandOtaActivity)>
	//*  58  128:instanceof      #80  <Class cf>
	//*  59  131:ifeq            137
	//*  60  134:goto            142
				flag = false;
	//   61  137:iconst_0        
	//   62  138:istore_1        
			else
	//*  63  139:goto            144
				flag = true;
	//   64  142:iconst_1        
	//   65  143:istore_1        
			obj = ((Object) (c.h));
	//   66  144:aload_0         
	//   67  145:getfield        #20  <Field OnDemandOtaActivity c>
	//   68  148:getfield        #84  <Field ImageButton OnDemandOtaActivity.h>
	//   69  151:astore          4
			byte byte0;
			if(flag)
	//*  70  153:iload_1         
	//*  71  154:ifeq            162
				byte0 = ((byte) (flag1));
	//   72  157:iload_2         
	//   73  158:istore_1        
			else
	//*  74  159:goto            164
				byte0 = 4;
	//   75  162:iconst_4        
	//   76  163:istore_1        
			((ImageButton) (obj)).setVisibility(((int) (byte0)));
	//   77  164:aload           4
	//   78  166:iload_1         
	//   79  167:invokevirtual   #90  <Method void ImageButton.setVisibility(int)>
		}
	//   80  170:return          
	}

	final Fragment a;
	final String b;
	final OnDemandOtaActivity c;

	OnDemandOtaActivity$1(OnDemandOtaActivity ondemandotaactivity, Fragment fragment, String s)
	{
		c = ondemandotaactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field OnDemandOtaActivity c>
		a = fragment;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field Fragment a>
		b = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field String b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
