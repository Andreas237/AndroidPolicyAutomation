// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.widget.TextView;
import com.irobot.home.util.i;
import com.irobot.home.util.j;
import com.irobot.home.view.CustomVideoView;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, PickABraavaActivity_

public class BraavaSetupConnectActivity extends BaseFragmentActivity
	implements com.irobot.home.view.CustomVideoView.a
{

	public BraavaSetupConnectActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void BaseFragmentActivity()>
	//    2    4:return          
	}

	public void a(int k, int l)
	{
	//    0    0:return          
	}

	void e()
	{
		b(0x7f0f021a);
	//    0    0:aload_0         
	//    1    1:ldc1            #18  <Int 0x7f0f021a>
	//    2    3:invokevirtual   #21  <Method void b(int)>
		a.setSource(j.a(((android.content.Context) (this)), 0x7f0e0007));
	//    3    6:aload_0         
	//    4    7:getfield        #23  <Field CustomVideoView a>
	//    5   10:aload_0         
	//    6   11:ldc1            #24  <Int 0x7f0e0007>
	//    7   13:invokestatic    #29  <Method android.net.Uri j.a(android.content.Context, int)>
	//    8   16:invokevirtual   #35  <Method void CustomVideoView.setSource(android.net.Uri)>
		a.setVideoStatusListener(((com.irobot.home.view.CustomVideoView.a) (this)));
	//    9   19:aload_0         
	//   10   20:getfield        #23  <Field CustomVideoView a>
	//   11   23:aload_0         
	//   12   24:invokevirtual   #39  <Method void CustomVideoView.setVideoStatusListener(com.irobot.home.view.CustomVideoView$a)>
		a.setLooping(true);
	//   13   27:aload_0         
	//   14   28:getfield        #23  <Field CustomVideoView a>
	//   15   31:iconst_1        
	//   16   32:invokevirtual   #43  <Method void CustomVideoView.setLooping(boolean)>
		TextView textview = b;
	//   17   35:aload_0         
	//   18   36:getfield        #45  <Field TextView b>
	//   19   39:astore_2        
		int k;
		if(i.f)
	//*  20   40:getstatic       #51  <Field boolean i.f>
	//*  21   43:ifeq            52
			k = 0x7f0f0151;
	//   22   46:ldc1            #52  <Int 0x7f0f0151>
	//   23   48:istore_1        
		else
	//*  24   49:goto            55
			k = 0x7f0f0150;
	//   25   52:ldc1            #53  <Int 0x7f0f0150>
	//   26   54:istore_1        
		textview.setText(k);
	//   27   55:aload_2         
	//   28   56:iload_1         
	//   29   57:invokevirtual   #58  <Method void TextView.setText(int)>
	//   30   60:return          
	}

	public void e_()
	{
	//    0    0:return          
	}

	public void f()
	{
		PickABraavaActivity_.a(((android.content.Context) (this))).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #64  <Method PickABraavaActivity_$a PickABraavaActivity_.a(android.content.Context)>
	//    2    4:invokevirtual   #69  <Method org.androidannotations.api.a.e PickABraavaActivity_$a.a()>
	//    3    7:pop             
	//    4    8:return          
	}

	public void f_()
	{
	//    0    0:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method void BaseFragmentActivity.onResume()>
		a.a();
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field CustomVideoView a>
	//    4    8:invokevirtual   #75  <Method void CustomVideoView.a()>
	//    5   11:return          
	}

	CustomVideoView a;
	TextView b;
}
