// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.view.View;
import com.irobot.core.AssetUpdateAvailabilityEvent;
import com.irobot.core.CurrentConnectionStateEvent;
import com.irobot.home.util.AssetSoftwareUpdateUtils_;
import com.irobot.home.view.CustomButton;
import com.irobot.home.view.CustomTextView;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			BraavaSoftwareUpdateActivity

public final class BraavaSoftwareUpdateActivity_ extends BraavaSoftwareUpdateActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public e a(int i)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, i);
		//    3    7:aload_0         
		//    4    8:getfield        #21  <Field Fragment e>
		//    5   11:aload_0         
		//    6   12:getfield        #25  <Field android.content.Intent c>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #31  <Method void Fragment.startActivityForResult(android.content.Intent, int)>
			else
		//*   9   19:goto            95
			if(d != null)
		//*  10   22:aload_0         
		//*  11   23:getfield        #33  <Field android.app.Fragment d>
		//*  12   26:ifnull          48
				d.startActivityForResult(c, i, a);
		//   13   29:aload_0         
		//   14   30:getfield        #33  <Field android.app.Fragment d>
		//   15   33:aload_0         
		//   16   34:getfield        #25  <Field android.content.Intent c>
		//   17   37:iload_1         
		//   18   38:aload_0         
		//   19   39:getfield        #36  <Field Bundle a>
		//   20   42:invokevirtual   #41  <Method void android.app.Fragment.startActivityForResult(android.content.Intent, int, Bundle)>
			else
		//*  21   45:goto            95
			if(b instanceof Activity)
		//*  22   48:aload_0         
		//*  23   49:getfield        #45  <Field Context b>
		//*  24   52:instanceof      #47  <Class Activity>
		//*  25   55:ifeq            80
				ActivityCompat.startActivityForResult((Activity)b, c, i, a);
		//   26   58:aload_0         
		//   27   59:getfield        #45  <Field Context b>
		//   28   62:checkcast       #47  <Class Activity>
		//   29   65:aload_0         
		//   30   66:getfield        #25  <Field android.content.Intent c>
		//   31   69:iload_1         
		//   32   70:aload_0         
		//   33   71:getfield        #36  <Field Bundle a>
		//   34   74:invokestatic    #52  <Method void ActivityCompat.startActivityForResult(Activity, android.content.Intent, int, Bundle)>
			else
		//*  35   77:goto            95
				b.startActivity(c, a);
		//   36   80:aload_0         
		//   37   81:getfield        #45  <Field Context b>
		//   38   84:aload_0         
		//   39   85:getfield        #25  <Field android.content.Intent c>
		//   40   88:aload_0         
		//   41   89:getfield        #36  <Field Bundle a>
		//   42   92:invokevirtual   #58  <Method void Context.startActivity(android.content.Intent, Bundle)>
			return new e(b);
		//   43   95:new             #60  <Class e>
		//   44   98:dup             
		//   45   99:aload_0         
		//   46  100:getfield        #45  <Field Context b>
		//   47  103:invokespecial   #62  <Method void e(Context)>
		//   48  106:areturn         
		}

		private android.app.Fragment d;
		private Fragment e;

		public a(Context context)
		{
			super(context, com/irobot/home/BraavaSoftwareUpdateActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class BraavaSoftwareUpdateActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public BraavaSoftwareUpdateActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void BraavaSoftwareUpdateActivity()>
	//    2    4:aload_0         
	//    3    5:new             #25  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void c()>
	//    6   12:putfield        #28  <Field c e>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #16  <Class BraavaSoftwareUpdateActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #33  <Method void BraavaSoftwareUpdateActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #37  <Method void c.a(b)>
		c = ((com.irobot.home.util.AssetSoftwareUpdateUtils) (AssetSoftwareUpdateUtils_.a(((Context) (this)))));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokestatic    #42  <Method AssetSoftwareUpdateUtils_ AssetSoftwareUpdateUtils_.a(Context)>
	//    5    9:putfield        #46  <Field com.irobot.home.util.AssetSoftwareUpdateUtils c>
	//    6   12:return          
	}

	static void a(BraavaSoftwareUpdateActivity_ braavasoftwareupdateactivity_, AssetUpdateAvailabilityEvent assetupdateavailabilityevent)
	{
		((BraavaSoftwareUpdateActivity) (braavasoftwareupdateactivity_)).BraavaSoftwareUpdateActivity.onAssetUpdateAvailabilityEvent(assetupdateavailabilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #51  <Method void BraavaSoftwareUpdateActivity.onAssetUpdateAvailabilityEvent(AssetUpdateAvailabilityEvent)>
	//    3    5:return          
	}

	static void a(BraavaSoftwareUpdateActivity_ braavasoftwareupdateactivity_, CurrentConnectionStateEvent currentconnectionstateevent)
	{
		((BraavaSoftwareUpdateActivity) (braavasoftwareupdateactivity_)).BraavaSoftwareUpdateActivity.onCurrentConnectionStateEvent(currentconnectionstateevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #56  <Method void BraavaSoftwareUpdateActivity.onCurrentConnectionStateEvent(CurrentConnectionStateEvent)>
	//    3    5:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #60  <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		a = (CustomTextView)a1.a(0x7f09032c);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #64  <Int 0x7f09032c>
	//    3    4:invokeinterface #66  <Method View a.a(int)>
	//    4    9:checkcast       #68  <Class CustomTextView>
	//    5   12:putfield        #71  <Field CustomTextView a>
		b = (CustomButton)a1.a(0x7f090472);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #72  <Int 0x7f090472>
	//    9   19:invokeinterface #66  <Method View a.a(int)>
	//   10   24:checkcast       #74  <Class CustomButton>
	//   11   27:putfield        #78  <Field CustomButton b>
		if(b != null)
	//*  12   30:aload_0         
	//*  13   31:getfield        #78  <Field CustomButton b>
	//*  14   34:ifnull          52
			b.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BraavaSoftwareUpdateActivity_ a>
				//    2    4:invokevirtual   #25  <Method void BraavaSoftwareUpdateActivity_.f()>
				//    3    7:return          
				}

				final BraavaSoftwareUpdateActivity_ a;

			
			{
				a = BraavaSoftwareUpdateActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BraavaSoftwareUpdateActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   15   37:aload_0         
	//   16   38:getfield        #78  <Field CustomButton b>
	//   17   41:new             #10  <Class BraavaSoftwareUpdateActivity_$1>
	//   18   44:dup             
	//   19   45:aload_0         
	//   20   46:invokespecial   #81  <Method void BraavaSoftwareUpdateActivity_$1(BraavaSoftwareUpdateActivity_)>
	//   21   49:invokevirtual   #85  <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		e();
	//   22   52:aload_0         
	//   23   53:invokevirtual   #87  <Method void e()>
	//   24   56:return          
	}

	public void onAssetUpdateAvailabilityEvent(AssetUpdateAvailabilityEvent assetupdateavailabilityevent)
	{
		org.androidannotations.api.b.a("", new Runnable(assetupdateavailabilityevent) {

			public void run()
			{
				com.irobot.home.BraavaSoftwareUpdateActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field BraavaSoftwareUpdateActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field AssetUpdateAvailabilityEvent a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.BraavaSoftwareUpdateActivity_.a(BraavaSoftwareUpdateActivity_, AssetUpdateAvailabilityEvent)>
			//    5   11:return          
			}

			final AssetUpdateAvailabilityEvent a;
			final BraavaSoftwareUpdateActivity_ b;

			
			{
				b = BraavaSoftwareUpdateActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BraavaSoftwareUpdateActivity_ b>
				a = assetupdateavailabilityevent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field AssetUpdateAvailabilityEvent a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #90  <String "">
	//    1    2:new             #14  <Class BraavaSoftwareUpdateActivity_$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #92  <Method void BraavaSoftwareUpdateActivity_$3(BraavaSoftwareUpdateActivity_, AssetUpdateAvailabilityEvent)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #97  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(e);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field c e>
	//    2    4:invokestatic    #102 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #104 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #106 <Method void BraavaSoftwareUpdateActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #102 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0030);
	//   13   23:aload_0         
	//   14   24:ldc1            #107 <Int 0x7f0b0030>
	//   15   26:invokevirtual   #111 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void onCurrentConnectionStateEvent(CurrentConnectionStateEvent currentconnectionstateevent)
	{
		org.androidannotations.api.b.a("", new Runnable(currentconnectionstateevent) {

			public void run()
			{
				com.irobot.home.BraavaSoftwareUpdateActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field BraavaSoftwareUpdateActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field CurrentConnectionStateEvent a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.BraavaSoftwareUpdateActivity_.a(BraavaSoftwareUpdateActivity_, CurrentConnectionStateEvent)>
			//    5   11:return          
			}

			final CurrentConnectionStateEvent a;
			final BraavaSoftwareUpdateActivity_ b;

			
			{
				b = BraavaSoftwareUpdateActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BraavaSoftwareUpdateActivity_ b>
				a = currentconnectionstateevent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field CurrentConnectionStateEvent a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #90  <String "">
	//    1    2:new             #12  <Class BraavaSoftwareUpdateActivity_$2>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #113 <Method void BraavaSoftwareUpdateActivity_$2(BraavaSoftwareUpdateActivity_, CurrentConnectionStateEvent)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #97  <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #114 <Method void BraavaSoftwareUpdateActivity.setContentView(int)>
		e.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field c e>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #116 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #119 <Method void BraavaSoftwareUpdateActivity.setContentView(View)>
		e.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field c e>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #116 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #122 <Method void BraavaSoftwareUpdateActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		e.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #28  <Field c e>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #116 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c e = new c();
}
