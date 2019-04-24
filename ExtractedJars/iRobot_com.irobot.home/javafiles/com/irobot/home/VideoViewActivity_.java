// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.VideoView;
import org.androidannotations.api.c.*;

// Referenced classes of package com.irobot.home:
//			VideoViewActivity

public final class VideoViewActivity_ extends VideoViewActivity
	implements a, b
{

	public VideoViewActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void VideoViewActivity()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void c()>
	//    6   12:putfield        #19  <Field c f>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #25  <Method void c.a(b)>
		f();
	//    2    4:aload_0         
	//    3    5:invokespecial   #27  <Method void f()>
	//    4    8:return          
	}

	private void f()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #31  <Method Intent getIntent()>
	//    2    4:invokevirtual   #37  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          50
		{
			if(bundle.containsKey("url"))
	//*   6   12:aload_1         
	//*   7   13:ldc1            #39  <String "url">
	//*   8   15:invokevirtual   #45  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
				b = bundle.getString("url");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #39  <String "url">
	//   13   25:invokevirtual   #49  <Method String Bundle.getString(String)>
	//   14   28:putfield        #53  <Field String b>
			if(bundle.containsKey("finishAfter"))
	//*  15   31:aload_1         
	//*  16   32:ldc1            #55  <String "finishAfter">
	//*  17   34:invokevirtual   #45  <Method boolean Bundle.containsKey(String)>
	//*  18   37:ifeq            50
				c = bundle.getBoolean("finishAfter");
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:ldc1            #55  <String "finishAfter">
	//   22   44:invokevirtual   #58  <Method boolean Bundle.getBoolean(String)>
	//   23   47:putfield        #62  <Field boolean c>
		}
	//   24   50:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #66  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(a a1)
	{
		d = (VideoView)a1.a(0x7f0901e7);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #70  <Int 0x7f0901e7>
	//    3    4:invokeinterface #72  <Method View a.a(int)>
	//    4    9:checkcast       #74  <Class VideoView>
	//    5   12:putfield        #78  <Field VideoView d>
		e = (ImageView)a1.a(0x7f0902fa);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #79  <Int 0x7f0902fa>
	//    9   19:invokeinterface #72  <Method View a.a(int)>
	//   10   24:checkcast       #81  <Class ImageView>
	//   11   27:putfield        #85  <Field ImageView e>
		e();
	//   12   30:aload_0         
	//   13   31:invokevirtual   #87  <Method void e()>
	//   14   34:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(f);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field c f>
	//    2    4:invokestatic    #91  <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #93  <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #95  <Method void VideoViewActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #91  <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b007b);
	//   13   23:aload_0         
	//   14   24:ldc1            #96  <Int 0x7f0b007b>
	//   15   26:invokevirtual   #100 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #101 <Method void VideoViewActivity.setContentView(int)>
		f.a(((a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field c f>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #103 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #106 <Method void VideoViewActivity.setContentView(View)>
		f.a(((a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field c f>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #103 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #109 <Method void VideoViewActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		f.a(((a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #19  <Field c f>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #103 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #113 <Method void VideoViewActivity.setIntent(Intent)>
		f();
	//    3    5:aload_0         
	//    4    6:invokespecial   #27  <Method void f()>
	//    5    9:return          
	}

	private final c f = new c();
}
