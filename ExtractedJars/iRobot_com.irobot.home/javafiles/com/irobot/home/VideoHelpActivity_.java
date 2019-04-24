// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			VideoHelpActivity

public final class VideoHelpActivity_ extends VideoHelpActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public a a(ArrayList arraylist)
		{
			return (a)super.a("infoText", ((java.io.Serializable) (arraylist)));
		//    0    0:aload_0         
		//    1    1:ldc1            #21  <String "infoText">
		//    2    3:aload_1         
		//    3    4:invokespecial   #24  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, java.io.Serializable)>
		//    4    7:checkcast       #2   <Class VideoHelpActivity_$a>
		//    5   10:areturn         
		}

		public a a(boolean flag)
		{
			return (a)super.a("isImageRes", flag);
		//    0    0:aload_0         
		//    1    1:ldc1            #29  <String "isImageRes">
		//    2    3:iload_1         
		//    3    4:invokespecial   #32  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, boolean)>
		//    4    7:checkcast       #2   <Class VideoHelpActivity_$a>
		//    5   10:areturn         
		}

		public e a(int i)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #35  <Field Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, i);
		//    3    7:aload_0         
		//    4    8:getfield        #35  <Field Fragment e>
		//    5   11:aload_0         
		//    6   12:getfield        #39  <Field Intent c>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #45  <Method void Fragment.startActivityForResult(Intent, int)>
			else
		//*   9   19:goto            95
			if(d != null)
		//*  10   22:aload_0         
		//*  11   23:getfield        #47  <Field android.app.Fragment d>
		//*  12   26:ifnull          48
				d.startActivityForResult(c, i, a);
		//   13   29:aload_0         
		//   14   30:getfield        #47  <Field android.app.Fragment d>
		//   15   33:aload_0         
		//   16   34:getfield        #39  <Field Intent c>
		//   17   37:iload_1         
		//   18   38:aload_0         
		//   19   39:getfield        #50  <Field Bundle a>
		//   20   42:invokevirtual   #55  <Method void android.app.Fragment.startActivityForResult(Intent, int, Bundle)>
			else
		//*  21   45:goto            95
			if(b instanceof Activity)
		//*  22   48:aload_0         
		//*  23   49:getfield        #59  <Field Context b>
		//*  24   52:instanceof      #61  <Class Activity>
		//*  25   55:ifeq            80
				ActivityCompat.startActivityForResult((Activity)b, c, i, a);
		//   26   58:aload_0         
		//   27   59:getfield        #59  <Field Context b>
		//   28   62:checkcast       #61  <Class Activity>
		//   29   65:aload_0         
		//   30   66:getfield        #39  <Field Intent c>
		//   31   69:iload_1         
		//   32   70:aload_0         
		//   33   71:getfield        #50  <Field Bundle a>
		//   34   74:invokestatic    #66  <Method void ActivityCompat.startActivityForResult(Activity, Intent, int, Bundle)>
			else
		//*  35   77:goto            95
				b.startActivity(c, a);
		//   36   80:aload_0         
		//   37   81:getfield        #59  <Field Context b>
		//   38   84:aload_0         
		//   39   85:getfield        #39  <Field Intent c>
		//   40   88:aload_0         
		//   41   89:getfield        #50  <Field Bundle a>
		//   42   92:invokevirtual   #72  <Method void Context.startActivity(Intent, Bundle)>
			return new e(b);
		//   43   95:new             #74  <Class e>
		//   44   98:dup             
		//   45   99:aload_0         
		//   46  100:getfield        #59  <Field Context b>
		//   47  103:invokespecial   #76  <Method void e(Context)>
		//   48  106:areturn         
		}

		public a b(int i)
		{
			return (a)super.a("titleId", i);
		//    0    0:aload_0         
		//    1    1:ldc1            #79  <String "titleId">
		//    2    3:iload_1         
		//    3    4:invokespecial   #82  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, int)>
		//    4    7:checkcast       #2   <Class VideoHelpActivity_$a>
		//    5   10:areturn         
		}

		public a b(boolean flag)
		{
			return (a)super.a("proceedToCleanScreen", flag);
		//    0    0:aload_0         
		//    1    1:ldc1            #84  <String "proceedToCleanScreen">
		//    2    3:iload_1         
		//    3    4:invokespecial   #32  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, boolean)>
		//    4    7:checkcast       #2   <Class VideoHelpActivity_$a>
		//    5   10:areturn         
		}

		public a c(int i)
		{
			return (a)super.a("resId", i);
		//    0    0:aload_0         
		//    1    1:ldc1            #86  <String "resId">
		//    2    3:iload_1         
		//    3    4:invokespecial   #82  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, int)>
		//    4    7:checkcast       #2   <Class VideoHelpActivity_$a>
		//    5   10:areturn         
		}

		public a c(boolean flag)
		{
			return (a)super.a("showActionButton", flag);
		//    0    0:aload_0         
		//    1    1:ldc1            #88  <String "showActionButton">
		//    2    3:iload_1         
		//    3    4:invokespecial   #32  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, boolean)>
		//    4    7:checkcast       #2   <Class VideoHelpActivity_$a>
		//    5   10:areturn         
		}

		public a d(boolean flag)
		{
			return (a)super.a("shouldBackActAsActionButton", flag);
		//    0    0:aload_0         
		//    1    1:ldc1            #90  <String "shouldBackActAsActionButton">
		//    2    3:iload_1         
		//    3    4:invokespecial   #32  <Method org.androidannotations.api.a.d org.androidannotations.api.a.a.a(String, boolean)>
		//    4    7:checkcast       #2   <Class VideoHelpActivity_$a>
		//    5   10:areturn         
		}

		private android.app.Fragment d;
		private Fragment e;

		public a(Context context)
		{
			super(context, com/irobot/home/VideoHelpActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class VideoHelpActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public VideoHelpActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void VideoHelpActivity()>
	//    2    4:aload_0         
	//    3    5:new             #20  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void c()>
	//    6   12:putfield        #23  <Field c a>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #12  <Class VideoHelpActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #28  <Method void VideoHelpActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #32  <Method void c.a(b)>
		g();
	//    2    4:aload_0         
	//    3    5:invokespecial   #35  <Method void g()>
	//    4    8:return          
	}

	private void g()
	{
		Bundle bundle = getIntent().getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method Intent getIntent()>
	//    2    4:invokevirtual   #45  <Method Bundle Intent.getExtras()>
	//    3    7:astore_1        
		if(bundle != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          202
		{
			if(bundle.containsKey("infoText"))
	//*   6   12:aload_1         
	//*   7   13:ldc1            #47  <String "infoText">
	//*   8   15:invokevirtual   #53  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifeq            31
				e = bundle.getStringArrayList("infoText");
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #47  <String "infoText">
	//   13   25:invokevirtual   #57  <Method ArrayList Bundle.getStringArrayList(String)>
	//   14   28:putfield        #61  <Field ArrayList e>
			if(bundle.containsKey("titleId"))
	//*  15   31:aload_1         
	//*  16   32:ldc1            #63  <String "titleId">
	//*  17   34:invokevirtual   #53  <Method boolean Bundle.containsKey(String)>
	//*  18   37:ifeq            50
				f = bundle.getInt("titleId");
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:ldc1            #63  <String "titleId">
	//   22   44:invokevirtual   #67  <Method int Bundle.getInt(String)>
	//   23   47:putfield        #71  <Field int f>
			if(bundle.containsKey("resId"))
	//*  24   50:aload_1         
	//*  25   51:ldc1            #73  <String "resId">
	//*  26   53:invokevirtual   #53  <Method boolean Bundle.containsKey(String)>
	//*  27   56:ifeq            69
				g = bundle.getInt("resId");
	//   28   59:aload_0         
	//   29   60:aload_1         
	//   30   61:ldc1            #73  <String "resId">
	//   31   63:invokevirtual   #67  <Method int Bundle.getInt(String)>
	//   32   66:putfield        #75  <Field int g>
			if(bundle.containsKey("buttonTextResource"))
	//*  33   69:aload_1         
	//*  34   70:ldc1            #77  <String "buttonTextResource">
	//*  35   72:invokevirtual   #53  <Method boolean Bundle.containsKey(String)>
	//*  36   75:ifeq            88
				h = bundle.getInt("buttonTextResource");
	//   37   78:aload_0         
	//   38   79:aload_1         
	//   39   80:ldc1            #77  <String "buttonTextResource">
	//   40   82:invokevirtual   #67  <Method int Bundle.getInt(String)>
	//   41   85:putfield        #80  <Field int h>
			if(bundle.containsKey("replayButtonResId"))
	//*  42   88:aload_1         
	//*  43   89:ldc1            #82  <String "replayButtonResId">
	//*  44   91:invokevirtual   #53  <Method boolean Bundle.containsKey(String)>
	//*  45   94:ifeq            107
				i = bundle.getInt("replayButtonResId");
	//   46   97:aload_0         
	//   47   98:aload_1         
	//   48   99:ldc1            #82  <String "replayButtonResId">
	//   49  101:invokevirtual   #67  <Method int Bundle.getInt(String)>
	//   50  104:putfield        #85  <Field int i>
			if(bundle.containsKey("isImageRes"))
	//*  51  107:aload_1         
	//*  52  108:ldc1            #87  <String "isImageRes">
	//*  53  110:invokevirtual   #53  <Method boolean Bundle.containsKey(String)>
	//*  54  113:ifeq            126
				j = bundle.getBoolean("isImageRes");
	//   55  116:aload_0         
	//   56  117:aload_1         
	//   57  118:ldc1            #87  <String "isImageRes">
	//   58  120:invokevirtual   #90  <Method boolean Bundle.getBoolean(String)>
	//   59  123:putfield        #94  <Field boolean j>
			if(bundle.containsKey("loopBack"))
	//*  60  126:aload_1         
	//*  61  127:ldc1            #96  <String "loopBack">
	//*  62  129:invokevirtual   #53  <Method boolean Bundle.containsKey(String)>
	//*  63  132:ifeq            145
				k = bundle.getBoolean("loopBack");
	//   64  135:aload_0         
	//   65  136:aload_1         
	//   66  137:ldc1            #96  <String "loopBack">
	//   67  139:invokevirtual   #90  <Method boolean Bundle.getBoolean(String)>
	//   68  142:putfield        #99  <Field boolean k>
			if(bundle.containsKey("proceedToCleanScreen"))
	//*  69  145:aload_1         
	//*  70  146:ldc1            #101 <String "proceedToCleanScreen">
	//*  71  148:invokevirtual   #53  <Method boolean Bundle.containsKey(String)>
	//*  72  151:ifeq            164
				l = bundle.getBoolean("proceedToCleanScreen");
	//   73  154:aload_0         
	//   74  155:aload_1         
	//   75  156:ldc1            #101 <String "proceedToCleanScreen">
	//   76  158:invokevirtual   #90  <Method boolean Bundle.getBoolean(String)>
	//   77  161:putfield        #104 <Field boolean l>
			if(bundle.containsKey("showActionButton"))
	//*  78  164:aload_1         
	//*  79  165:ldc1            #106 <String "showActionButton">
	//*  80  167:invokevirtual   #53  <Method boolean Bundle.containsKey(String)>
	//*  81  170:ifeq            183
				m = bundle.getBoolean("showActionButton");
	//   82  173:aload_0         
	//   83  174:aload_1         
	//   84  175:ldc1            #106 <String "showActionButton">
	//   85  177:invokevirtual   #90  <Method boolean Bundle.getBoolean(String)>
	//   86  180:putfield        #109 <Field boolean m>
			if(bundle.containsKey("shouldBackActAsActionButton"))
	//*  87  183:aload_1         
	//*  88  184:ldc1            #111 <String "shouldBackActAsActionButton">
	//*  89  186:invokevirtual   #53  <Method boolean Bundle.containsKey(String)>
	//*  90  189:ifeq            202
				n = bundle.getBoolean("shouldBackActAsActionButton");
	//   91  192:aload_0         
	//   92  193:aload_1         
	//   93  194:ldc1            #111 <String "shouldBackActAsActionButton">
	//   94  196:invokevirtual   #90  <Method boolean Bundle.getBoolean(String)>
	//   95  199:putfield        #114 <Field boolean n>
		}
	//   96  202:return          
	}

	public View a(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #118 <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		o = (Button)a1.a(0x7f09001e);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #122 <Int 0x7f09001e>
	//    3    4:invokeinterface #124 <Method View a.a(int)>
	//    4    9:checkcast       #126 <Class Button>
	//    5   12:putfield        #130 <Field Button o>
		if(o != null)
	//*   6   15:aload_0         
	//*   7   16:getfield        #130 <Field Button o>
	//*   8   19:ifnull          37
			o.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.e();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field VideoHelpActivity_ a>
				//    2    4:invokevirtual   #25  <Method void com.irobot.home.VideoHelpActivity_.e()>
				//    3    7:return          
				}

				final VideoHelpActivity_ a;

			
			{
				a = VideoHelpActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field VideoHelpActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    9   22:aload_0         
	//   10   23:getfield        #130 <Field Button o>
	//   11   26:new             #10  <Class VideoHelpActivity_$1>
	//   12   29:dup             
	//   13   30:aload_0         
	//   14   31:invokespecial   #133 <Method void VideoHelpActivity_$1(VideoHelpActivity_)>
	//   15   34:invokevirtual   #137 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		f();
	//   16   37:aload_0         
	//   17   38:invokevirtual   #139 <Method void f()>
	//   18   41:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field c a>
	//    2    4:invokestatic    #143 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #145 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #147 <Method void VideoHelpActivity.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #143 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b007a);
	//   13   23:aload_0         
	//   14   24:ldc1            #148 <Int 0x7f0b007a>
	//   15   26:invokevirtual   #152 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #153 <Method void VideoHelpActivity.setContentView(int)>
		a.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #23  <Field c a>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #155 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #158 <Method void VideoHelpActivity.setContentView(View)>
		a.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #23  <Field c a>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #155 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #161 <Method void VideoHelpActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		a.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #23  <Field c a>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #155 <Method void c.a(a)>
	//    8   14:return          
	}

	public void setIntent(Intent intent)
	{
		super.setIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #165 <Method void VideoHelpActivity.setIntent(Intent)>
		g();
	//    3    5:aload_0         
	//    4    6:invokespecial   #35  <Method void g()>
	//    5    9:return          
	}

	private final c a = new c();
}
