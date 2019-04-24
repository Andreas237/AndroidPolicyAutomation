// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.Assembler;
import com.irobot.core.AssetInfo;
import com.irobot.core.OTAUIServiceCommand;
import com.irobot.core.OTAUIServiceData;
import com.irobot.core.OTAUIServiceDataCallback;
import com.irobot.core.OTAUIServiceDataState;
import com.irobot.core.OnDemandOTAEntryType;
import com.irobot.core.OnDemandOTAError;
import com.irobot.core.OnDemandOTAPathType;
import com.irobot.core.OnDemandOtaPath;
import com.irobot.core.OtaUpdateStatus;
import com.irobot.core.UpdateUIService;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomTextView;
import com.irobot.home.view.CustomVideoView;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home.fragments:
//			j

public class ch extends com.irobot.home.fragments.j
{
	private class a extends OTAUIServiceDataCallback
	{

		public void onOTAUIServiceDataChanged(OTAUIServiceData otauiservicedata)
		{
			if(otauiservicedata == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       13
			{
				com.irobot.home.util.o.b(ch.e(), "null service data");
		//    2    4:invokestatic    #25  <Method String ch.e()>
		//    3    7:ldc1            #27  <String "null service data">
		//    4    9:invokestatic    #33  <Method void o.b(String, String)>
				return;
		//    5   12:return          
			}
			Object obj = ((Object) (otauiservicedata.getDataStates()));
		//    6   13:aload_1         
		//    7   14:invokevirtual   #39  <Method ArrayList OTAUIServiceData.getDataStates()>
		//    8   17:astore_2        
			String s1 = ch.e();
		//    9   18:invokestatic    #25  <Method String ch.e()>
		//   10   21:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
		//   11   22:new             #41  <Class StringBuilder>
		//   12   25:dup             
		//   13   26:invokespecial   #42  <Method void StringBuilder()>
		//   14   29:astore          4
			stringbuilder.append("Change list: ");
		//   15   31:aload           4
		//   16   33:ldc1            #44  <String "Change list: ">
		//   17   35:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
		//   18   38:pop             
			stringbuilder.append(((ArrayList) (obj)).toString());
		//   19   39:aload           4
		//   20   41:aload_2         
		//   21   42:invokevirtual   #53  <Method String ArrayList.toString()>
		//   22   45:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
		//   23   48:pop             
			com.irobot.home.util.o.a(s1, stringbuilder.toString());
		//   24   49:aload_3         
		//   25   50:aload           4
		//   26   52:invokevirtual   #54  <Method String StringBuilder.toString()>
		//   27   55:invokestatic    #56  <Method void o.a(String, String)>
			obj = ((Object) (((ArrayList) (obj)).iterator()));
		//   28   58:aload_2         
		//   29   59:invokevirtual   #60  <Method Iterator ArrayList.iterator()>
		//   30   62:astore_2        
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
		//   31   63:aload_2         
		//   32   64:invokeinterface #66  <Method boolean Iterator.hasNext()>
		//   33   69:ifeq            171
				OTAUIServiceDataState otauiservicedatastate = (OTAUIServiceDataState)((Iterator) (obj)).next();
		//   34   72:aload_2         
		//   35   73:invokeinterface #70  <Method Object Iterator.next()>
		//   36   78:checkcast       #72  <Class OTAUIServiceDataState>
		//   37   81:astore_3        
				static class _cls3
				{

					static final int a[];
					static final int b[];

					static 
					{
						b = new int[OtaUpdateStatus.values().length];
					//    0    0:invokestatic    #19  <Method OtaUpdateStatus[] OtaUpdateStatus.values()>
					//    1    3:arraylength     
					//    2    4:newarray        int[]
					//    3    6:putstatic       #21  <Field int[] b>
						try
						{
							b[OtaUpdateStatus.Downloading.ordinal()] = 1;
					//    4    9:getstatic       #21  <Field int[] b>
					//    5   12:getstatic       #25  <Field OtaUpdateStatus OtaUpdateStatus.Downloading>
					//    6   15:invokevirtual   #29  <Method int OtaUpdateStatus.ordinal()>
					//    7   18:iconst_1        
					//    8   19:iastore         
						}
					//*   9   20:getstatic       #21  <Field int[] b>
					//*  10   23:getstatic       #32  <Field OtaUpdateStatus OtaUpdateStatus.Installing>
					//*  11   26:invokevirtual   #29  <Method int OtaUpdateStatus.ordinal()>
					//*  12   29:iconst_2        
					//*  13   30:iastore         
					//*  14   31:invokestatic    #37  <Method OTAUIServiceDataState[] OTAUIServiceDataState.values()>
					//*  15   34:arraylength     
					//*  16   35:newarray        int[]
					//*  17   37:putstatic       #39  <Field int[] a>
					//*  18   40:getstatic       #39  <Field int[] a>
					//*  19   43:getstatic       #43  <Field OTAUIServiceDataState OTAUIServiceDataState.OnDemandOTAStatus>
					//*  20   46:invokevirtual   #44  <Method int OTAUIServiceDataState.ordinal()>
					//*  21   49:iconst_1        
					//*  22   50:iastore         
					//*  23   51:getstatic       #39  <Field int[] a>
					//*  24   54:getstatic       #47  <Field OTAUIServiceDataState OTAUIServiceDataState.OnDemandOTACompleted>
					//*  25   57:invokevirtual   #44  <Method int OTAUIServiceDataState.ordinal()>
					//*  26   60:iconst_2        
					//*  27   61:iastore         
					//*  28   62:getstatic       #39  <Field int[] a>
					//*  29   65:getstatic       #50  <Field OTAUIServiceDataState OTAUIServiceDataState.OnDemandOTAError>
					//*  30   68:invokevirtual   #44  <Method int OTAUIServiceDataState.ordinal()>
					//*  31   71:iconst_3        
					//*  32   72:iastore         
					//*  33   73:getstatic       #39  <Field int[] a>
					//*  34   76:getstatic       #53  <Field OTAUIServiceDataState OTAUIServiceDataState.OnDemandOTACommError>
					//*  35   79:invokevirtual   #44  <Method int OTAUIServiceDataState.ordinal()>
					//*  36   82:iconst_4        
					//*  37   83:iastore         
					//*  38   84:return          
						catch(NoSuchFieldError nosuchfielderror) { }
					//   39   85:astore_0        
						try
						{
							b[OtaUpdateStatus.Installing.ordinal()] = 2;
						}
					//*  40   86:goto            20
						catch(NoSuchFieldError nosuchfielderror1) { }
					//   41   89:astore_0        
						a = new int[OTAUIServiceDataState.values().length];
						try
						{
							a[OTAUIServiceDataState.OnDemandOTAStatus.ordinal()] = 1;
						}
					//*  42   90:goto            31
						catch(NoSuchFieldError nosuchfielderror2) { }
					//   43   93:astore_0        
						try
						{
							a[OTAUIServiceDataState.OnDemandOTACompleted.ordinal()] = 2;
						}
					//*  44   94:goto            51
						catch(NoSuchFieldError nosuchfielderror3) { }
					//   45   97:astore_0        
						try
						{
							a[OTAUIServiceDataState.OnDemandOTAError.ordinal()] = 3;
						}
					//*  46   98:goto            62
						catch(NoSuchFieldError nosuchfielderror4) { }
					//   47  101:astore_0        
						try
						{
							a[OTAUIServiceDataState.OnDemandOTACommError.ordinal()] = 4;
						}
					//*  48  102:goto            73
						catch(NoSuchFieldError nosuchfielderror5) { }
					//   49  105:astore_0        
					//*  50  106:return          
					}
				}

				switch(com.irobot.home.fragments._cls3.a[otauiservicedatastate.ordinal()])
		//*  38   82:getstatic       #77  <Field int[] com.irobot.home.fragments.ch$3.a>
		//*  39   85:aload_3         
		//*  40   86:invokevirtual   #81  <Method int OTAUIServiceDataState.ordinal()>
		//*  41   89:iaload          
				{
		//*  42   90:tableswitch     1 4: default 120
		//		               1 157
		//		               2 147
		//		               3 133
		//		               4 123
		//*  43  120:goto            63
				case 4: // '\004'
					ch.b(a);
		//   44  123:aload_0         
		//   45  124:getfield        #12  <Field ch a>
		//   46  127:invokestatic    #83  <Method void ch.b(ch)>
					break;

		//*  47  130:goto            63
				case 3: // '\003'
					com.irobot.home.fragments.ch.a(a, otauiservicedata.getOnDemandOTAError());
		//   48  133:aload_0         
		//   49  134:getfield        #12  <Field ch a>
		//   50  137:aload_1         
		//   51  138:invokevirtual   #87  <Method OnDemandOTAError OTAUIServiceData.getOnDemandOTAError()>
		//   52  141:invokestatic    #90  <Method void com.irobot.home.fragments.ch.a(ch, OnDemandOTAError)>
					break;

		//*  53  144:goto            63
				case 2: // '\002'
					com.irobot.home.fragments.ch.a(a);
		//   54  147:aload_0         
		//   55  148:getfield        #12  <Field ch a>
		//   56  151:invokestatic    #92  <Method void com.irobot.home.fragments.ch.a(ch)>
					break;

		//*  57  154:goto            63
				case 1: // '\001'
					com.irobot.home.fragments.ch.a(a, otauiservicedata.getOnDemandOTAStatus());
		//   58  157:aload_0         
		//   59  158:getfield        #12  <Field ch a>
		//   60  161:aload_1         
		//   61  162:invokevirtual   #96  <Method OtaUpdateStatus OTAUIServiceData.getOnDemandOTAStatus()>
		//   62  165:invokestatic    #99  <Method void com.irobot.home.fragments.ch.a(ch, OtaUpdateStatus)>
					break;
				}
			} while(true);
		//*  63  168:goto            63
		//   64  171:return          
		}

		final ch a;

		private a()
		{
			a = ch.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field ch a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void OTAUIServiceDataCallback()>
		//    5    9:return          
		}

	}

	public static interface b
	{

		public abstract void h();

		public abstract void i();
	}


	public ch()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void com.irobot.home.fragments.j()>
		b = OnDemandOTAEntryType.RequestOnDemandOTA;
	//    2    4:aload_0         
	//    3    5:getstatic       #70  <Field OnDemandOTAEntryType OnDemandOTAEntryType.RequestOnDemandOTA>
	//    4    8:putfield        #72  <Field OnDemandOTAEntryType b>
		c = OnDemandOTAPathType.None;
	//    5   11:aload_0         
	//    6   12:getstatic       #77  <Field OnDemandOTAPathType OnDemandOTAPathType.None>
	//    7   15:putfield        #79  <Field OnDemandOTAPathType c>
		t = null;
	//    8   18:aload_0         
	//    9   19:aconst_null     
	//   10   20:putfield        #81  <Field AlertDialog t>
		u = new a();
	//   11   23:aload_0         
	//   12   24:new             #12  <Class ch$a>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:aconst_null     
	//   16   30:invokespecial   #84  <Method void ch$a(ch, ch$1)>
	//   17   33:putfield        #86  <Field ch$a u>
	//   18   36:return          
	}

	private ImageView a(RelativeLayout relativelayout)
	{
		return (ImageView)relativelayout.findViewById(0x7f0901d0);
	//    0    0:aload_1         
	//    1    1:ldc1            #88  <Int 0x7f0901d0>
	//    2    3:invokevirtual   #94  <Method View RelativeLayout.findViewById(int)>
	//    3    6:checkcast       #96  <Class ImageView>
	//    4    9:areturn         
	}

	private CustomTextView a(RelativeLayout relativelayout, int i1)
	{
		relativelayout = ((RelativeLayout) ((CustomTextView)relativelayout.findViewById(0x7f090431)));
	//    0    0:aload_1         
	//    1    1:ldc1            #98  <Int 0x7f090431>
	//    2    3:invokevirtual   #94  <Method View RelativeLayout.findViewById(int)>
	//    3    6:checkcast       #100 <Class CustomTextView>
	//    4    9:astore_1        
		((CustomTextView) (relativelayout)).setText(i1);
	//    5   10:aload_1         
	//    6   11:iload_2         
	//    7   12:invokevirtual   #104 <Method void CustomTextView.setText(int)>
		return ((CustomTextView) (relativelayout));
	//    8   15:aload_1         
	//    9   16:areturn         
	}

	private CustomTextView a(RelativeLayout relativelayout, String s1)
	{
		relativelayout = ((RelativeLayout) ((CustomTextView)relativelayout.findViewById(0x7f0901cf)));
	//    0    0:aload_1         
	//    1    1:ldc1            #106 <Int 0x7f0901cf>
	//    2    3:invokevirtual   #94  <Method View RelativeLayout.findViewById(int)>
	//    3    6:checkcast       #100 <Class CustomTextView>
	//    4    9:astore_1        
		((CustomTextView) (relativelayout)).setText(((CharSequence) (s1)));
	//    5   10:aload_1         
	//    6   11:aload_2         
	//    7   12:invokevirtual   #109 <Method void CustomTextView.setText(CharSequence)>
		return ((CustomTextView) (relativelayout));
	//    8   15:aload_1         
	//    9   16:areturn         
	}

	private void a(int i1, int j1, Runnable runnable)
	{
		ObjectAnimator objectanimator = ObjectAnimator.ofInt(((Object) (d)), "progress", new int[] {
			i1, j1
		});
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field ProgressBar d>
	//    2    4:ldc1            #114 <String "progress">
	//    3    6:iconst_2        
	//    4    7:newarray        int[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:iload_1         
	//    8   12:iastore         
	//    9   13:dup             
	//   10   14:iconst_1        
	//   11   15:iload_2         
	//   12   16:iastore         
	//   13   17:invokestatic    #120 <Method ObjectAnimator ObjectAnimator.ofInt(Object, String, int[])>
	//   14   20:astore          4
		objectanimator.setDuration(2000L);
	//   15   22:aload           4
	//   16   24:ldc2w           #121 <Long 2000L>
	//   17   27:invokevirtual   #126 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   18   30:pop             
		objectanimator.start();
	//   19   31:aload           4
	//   20   33:invokevirtual   #129 <Method void ObjectAnimator.start()>
		(new Handler()).postDelayed(runnable, 2000L);
	//   21   36:new             #131 <Class Handler>
	//   22   39:dup             
	//   23   40:invokespecial   #132 <Method void Handler()>
	//   24   43:aload_3         
	//   25   44:ldc2w           #121 <Long 2000L>
	//   26   47:invokevirtual   #136 <Method boolean Handler.postDelayed(Runnable, long)>
	//   27   50:pop             
	//   28   51:return          
	}

	private void a(TextView textview, TextView textview1, ImageView imageview)
	{
		textview.setSelected(true);
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #143 <Method void TextView.setSelected(boolean)>
		textview1.setVisibility(4);
	//    3    5:aload_2         
	//    4    6:iconst_4        
	//    5    7:invokevirtual   #146 <Method void TextView.setVisibility(int)>
		imageview.setVisibility(4);
	//    6   10:aload_3         
	//    7   11:iconst_4        
	//    8   12:invokevirtual   #147 <Method void ImageView.setVisibility(int)>
		imageview.clearAnimation();
	//    9   15:aload_3         
	//   10   16:invokevirtual   #150 <Method void ImageView.clearAnimation()>
	//   11   19:return          
	}

	private void a(OnDemandOTAError ondemandotaerror)
	{
		String s1 = r;
	//    0    0:getstatic       #61  <Field String r>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #153 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #154 <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("onOTAError: ");
	//    6   12:aload_3         
	//    7   13:ldc1            #156 <String "onOTAError: ">
	//    8   15:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(((Object) (ondemandotaerror)));
	//   10   19:aload_3         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #163 <Method StringBuilder StringBuilder.append(Object)>
	//   13   24:pop             
		com.irobot.home.util.o.b(s1, stringbuilder.toString());
	//   14   25:aload_2         
	//   15   26:aload_3         
	//   16   27:invokevirtual   #166 <Method String StringBuilder.toString()>
	//   17   30:invokestatic    #171 <Method void o.b(String, String)>
		s.i();
	//   18   33:aload_0         
	//   19   34:getfield        #173 <Field ch$b s>
	//   20   37:invokeinterface #175 <Method void ch$b.i()>
	//   21   42:return          
	}

	private void a(OtaUpdateStatus otaupdatestatus)
	{
		String s1 = r;
	//    0    0:getstatic       #61  <Field String r>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #153 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #154 <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("onOTAStatusUpdate: ");
	//    6   12:aload_3         
	//    7   13:ldc1            #178 <String "onOTAStatusUpdate: ">
	//    8   15:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(((Object) (otaupdatestatus)));
	//   10   19:aload_3         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #163 <Method StringBuilder StringBuilder.append(Object)>
	//   13   24:pop             
		com.irobot.home.util.o.b(s1, stringbuilder.toString());
	//   14   25:aload_2         
	//   15   26:aload_3         
	//   16   27:invokevirtual   #166 <Method String StringBuilder.toString()>
	//   17   30:invokestatic    #171 <Method void o.b(String, String)>
		switch(_cls3.b[otaupdatestatus.ordinal()])
	//*  18   33:getstatic       #181 <Field int[] ch$3.b>
	//*  19   36:aload_1         
	//*  20   37:invokevirtual   #187 <Method int OtaUpdateStatus.ordinal()>
	//*  21   40:iaload          
		{
	//*  22   41:tableswitch     1 2: default 64
	//	               1 70
	//	               2 65
		default:
			return;
	//   23   64:return          

		case 2: // '\002'
			d();
	//   24   65:aload_0         
	//   25   66:invokevirtual   #189 <Method void d()>
			return;
	//   26   69:return          

		case 1: // '\001'
			c();
	//   27   70:aload_0         
	//   28   71:invokevirtual   #191 <Method void c()>
			return;
	//   29   74:return          
		}
	}

	static void a(ch ch1)
	{
		ch1.f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #194 <Method void f()>
	//    2    4:return          
	}

	static void a(ch ch1, TextView textview, TextView textview1, ImageView imageview)
	{
		ch1.c(textview, textview1, imageview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #197 <Method void c(TextView, TextView, ImageView)>
	//    5    7:return          
	}

	static void a(ch ch1, OnDemandOTAError ondemandotaerror)
	{
		ch1.a(ondemandotaerror);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #200 <Method void a(OnDemandOTAError)>
	//    3    5:return          
	}

	static void a(ch ch1, OtaUpdateStatus otaupdatestatus)
	{
		ch1.a(otaupdatestatus);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #203 <Method void a(OtaUpdateStatus)>
	//    3    5:return          
	}

	private void b(TextView textview, TextView textview1, ImageView imageview)
	{
		textview.setSelected(false);
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #143 <Method void TextView.setSelected(boolean)>
		textview1.setVisibility(4);
	//    3    5:aload_2         
	//    4    6:iconst_4        
	//    5    7:invokevirtual   #146 <Method void TextView.setVisibility(int)>
		imageview.setVisibility(4);
	//    6   10:aload_3         
	//    7   11:iconst_4        
	//    8   12:invokevirtual   #147 <Method void ImageView.setVisibility(int)>
		imageview.clearAnimation();
	//    9   15:aload_3         
	//   10   16:invokevirtual   #150 <Method void ImageView.clearAnimation()>
	//   11   19:return          
	}

	static void b(ch ch1)
	{
		ch1.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #206 <Method void g()>
	//    2    4:return          
	}

	private void c(TextView textview, TextView textview1, ImageView imageview)
	{
		textview.setSelected(true);
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #143 <Method void TextView.setSelected(boolean)>
		textview1.setVisibility(0);
	//    3    5:aload_2         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #146 <Method void TextView.setVisibility(int)>
		imageview.setVisibility(0);
	//    6   10:aload_3         
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #147 <Method void ImageView.setVisibility(int)>
		textview = ((TextView) (new AlphaAnimation(0.0F, 1.0F)));
	//    9   15:new             #208 <Class AlphaAnimation>
	//   10   18:dup             
	//   11   19:fconst_0        
	//   12   20:fconst_1        
	//   13   21:invokespecial   #211 <Method void AlphaAnimation(float, float)>
	//   14   24:astore_1        
		((AlphaAnimation) (textview)).setDuration(500L);
	//   15   25:aload_1         
	//   16   26:ldc2w           #212 <Long 500L>
	//   17   29:invokevirtual   #216 <Method void AlphaAnimation.setDuration(long)>
		((AlphaAnimation) (textview)).setRepeatMode(2);
	//   18   32:aload_1         
	//   19   33:iconst_2        
	//   20   34:invokevirtual   #219 <Method void AlphaAnimation.setRepeatMode(int)>
		((AlphaAnimation) (textview)).setRepeatCount(-1);
	//   21   37:aload_1         
	//   22   38:iconst_m1       
	//   23   39:invokevirtual   #222 <Method void AlphaAnimation.setRepeatCount(int)>
		imageview.startAnimation(((android.view.animation.Animation) (textview)));
	//   24   42:aload_3         
	//   25   43:aload_1         
	//   26   44:invokevirtual   #226 <Method void ImageView.startAnimation(android.view.animation.Animation)>
	//   27   47:return          
	}

	static String e()
	{
		return r;
	//    0    0:getstatic       #61  <Field String r>
	//    1    3:areturn         
	}

	private void f()
	{
		com.irobot.home.util.o.b(r, "onOTACompleted");
	//    0    0:getstatic       #61  <Field String r>
	//    1    3:ldc1            #228 <String "onOTACompleted">
	//    2    5:invokestatic    #171 <Method void o.b(String, String)>
		s.h();
	//    3    8:aload_0         
	//    4    9:getfield        #173 <Field ch$b s>
	//    5   12:invokeinterface #231 <Method void ch$b.h()>
	//    6   17:return          
	}

	private void g()
	{
		if(t == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field AlertDialog t>
	//*   2    4:ifnonnull       42
		{
			t = (new android.app.AlertDialog.Builder(((Context) (getActivity())))).setTitle(0x7f0f0203).setMessage(0x7f0f04db).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).create();
	//    3    7:aload_0         
	//    4    8:new             #233 <Class android.app.AlertDialog$Builder>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #237 <Method android.support.v4.app.FragmentActivity getActivity()>
	//    8   16:invokespecial   #240 <Method void android.app.AlertDialog$Builder(Context)>
	//    9   19:ldc1            #241 <Int 0x7f0f0203>
	//   10   21:invokevirtual   #245 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(int)>
	//   11   24:ldc1            #246 <Int 0x7f0f04db>
	//   12   26:invokevirtual   #249 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//   13   29:ldc1            #250 <Int 0x7f0f05bb>
	//   14   31:aconst_null     
	//   15   32:invokevirtual   #254 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   16   35:invokevirtual   #258 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//   17   38:putfield        #81  <Field AlertDialog t>
			return;
	//   18   41:return          
		}
		if(!t.isShowing())
	//*  19   42:aload_0         
	//*  20   43:getfield        #81  <Field AlertDialog t>
	//*  21   46:invokevirtual   #264 <Method boolean AlertDialog.isShowing()>
	//*  22   49:ifne            59
			t.show();
	//   23   52:aload_0         
	//   24   53:getfield        #81  <Field AlertDialog t>
	//   25   56:invokevirtual   #267 <Method void AlertDialog.show()>
	//   26   59:return          
	}

	protected void a()
	{
		AssetInfo assetinfo = com.irobot.home.util.j.a(a).a();
	//    0    0:aload_0         
	//    1    1:getfield        #269 <Field String a>
	//    2    4:invokestatic    #272 <Method a j.a(String)>
	//    3    7:invokevirtual   #277 <Method AssetInfo a.a()>
	//    4   10:astore_3        
		Object obj = ((Object) (e));
	//    5   11:aload_0         
	//    6   12:getfield        #279 <Field TextView e>
	//    7   15:astore_2        
		boolean flag = true;
	//    8   16:iconst_1        
	//    9   17:istore_1        
		((TextView) (obj)).setText(((CharSequence) (getString(0x7f0f0858, new Object[] {
			assetinfo.getName()
		}))));
	//   10   18:aload_2         
	//   11   19:aload_0         
	//   12   20:ldc2            #280 <Int 0x7f0f0858>
	//   13   23:iconst_1        
	//   14   24:anewarray       Object[]
	//   15   27:dup             
	//   16   28:iconst_0        
	//   17   29:aload_3         
	//   18   30:invokevirtual   #287 <Method String AssetInfo.getName()>
	//   19   33:aastore         
	//   20   34:invokevirtual   #291 <Method String getString(int, Object[])>
	//   21   37:invokevirtual   #292 <Method void TextView.setText(CharSequence)>
		obj = ((Object) (com.irobot.home.util.j.a(((Context) (getActivity())), 0x7f0e0213)));
	//   22   40:aload_0         
	//   23   41:invokevirtual   #237 <Method android.support.v4.app.FragmentActivity getActivity()>
	//   24   44:ldc2            #293 <Int 0x7f0e0213>
	//   25   47:invokestatic    #296 <Method android.net.Uri j.a(Context, int)>
	//   26   50:astore_2        
		f.setSource(((android.net.Uri) (obj)));
	//   27   51:aload_0         
	//   28   52:getfield        #298 <Field CustomVideoView f>
	//   29   55:aload_2         
	//   30   56:invokevirtual   #304 <Method void CustomVideoView.setSource(android.net.Uri)>
		f.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.RelativeLayout.LayoutParams(-1, com.irobot.home.util.j.a(((Activity) (getActivity())), ((android.net.Uri) (obj)))))));
	//   31   59:aload_0         
	//   32   60:getfield        #298 <Field CustomVideoView f>
	//   33   63:new             #306 <Class android.widget.RelativeLayout$LayoutParams>
	//   34   66:dup             
	//   35   67:iconst_m1       
	//   36   68:aload_0         
	//   37   69:invokevirtual   #237 <Method android.support.v4.app.FragmentActivity getActivity()>
	//   38   72:aload_2         
	//   39   73:invokestatic    #309 <Method int j.a(Activity, android.net.Uri)>
	//   40   76:invokespecial   #312 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//   41   79:invokevirtual   #316 <Method void CustomVideoView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		f.setLooping(true);
	//   42   82:aload_0         
	//   43   83:getfield        #298 <Field CustomVideoView f>
	//   44   86:iconst_1        
	//   45   87:invokevirtual   #319 <Method void CustomVideoView.setLooping(boolean)>
		f.a();
	//   46   90:aload_0         
	//   47   91:getfield        #298 <Field CustomVideoView f>
	//   48   94:invokevirtual   #321 <Method void CustomVideoView.a()>
		obj = ((Object) ((RelativeLayout)getView().findViewById(0x7f0902ff)));
	//   49   97:aload_0         
	//   50   98:invokevirtual   #325 <Method View getView()>
	//   51  101:ldc2            #326 <Int 0x7f0902ff>
	//   52  104:invokevirtual   #329 <Method View View.findViewById(int)>
	//   53  107:checkcast       #90  <Class RelativeLayout>
	//   54  110:astore_2        
		i = a(((RelativeLayout) (obj)), "1");
	//   55  111:aload_0         
	//   56  112:aload_0         
	//   57  113:aload_2         
	//   58  114:ldc2            #331 <String "1">
	//   59  117:invokespecial   #333 <Method CustomTextView a(RelativeLayout, String)>
	//   60  120:putfield        #335 <Field CustomTextView i>
		j = a(((RelativeLayout) (obj)), 0x7f0f06a8);
	//   61  123:aload_0         
	//   62  124:aload_0         
	//   63  125:aload_2         
	//   64  126:ldc2            #336 <Int 0x7f0f06a8>
	//   65  129:invokespecial   #338 <Method CustomTextView a(RelativeLayout, int)>
	//   66  132:putfield        #340 <Field CustomTextView j>
		o = a(((RelativeLayout) (obj)));
	//   67  135:aload_0         
	//   68  136:aload_0         
	//   69  137:aload_2         
	//   70  138:invokespecial   #342 <Method ImageView a(RelativeLayout)>
	//   71  141:putfield        #344 <Field ImageView o>
		obj = ((Object) ((RelativeLayout)getView().findViewById(0x7f09015d)));
	//   72  144:aload_0         
	//   73  145:invokevirtual   #325 <Method View getView()>
	//   74  148:ldc2            #345 <Int 0x7f09015d>
	//   75  151:invokevirtual   #329 <Method View View.findViewById(int)>
	//   76  154:checkcast       #90  <Class RelativeLayout>
	//   77  157:astore_2        
		k = a(((RelativeLayout) (obj)), "2");
	//   78  158:aload_0         
	//   79  159:aload_0         
	//   80  160:aload_2         
	//   81  161:ldc2            #347 <String "2">
	//   82  164:invokespecial   #333 <Method CustomTextView a(RelativeLayout, String)>
	//   83  167:putfield        #349 <Field CustomTextView k>
		l = a(((RelativeLayout) (obj)), 0x7f0f028d);
	//   84  170:aload_0         
	//   85  171:aload_0         
	//   86  172:aload_2         
	//   87  173:ldc2            #350 <Int 0x7f0f028d>
	//   88  176:invokespecial   #338 <Method CustomTextView a(RelativeLayout, int)>
	//   89  179:putfield        #352 <Field CustomTextView l>
		p = a(((RelativeLayout) (obj)));
	//   90  182:aload_0         
	//   91  183:aload_0         
	//   92  184:aload_2         
	//   93  185:invokespecial   #342 <Method ImageView a(RelativeLayout)>
	//   94  188:putfield        #354 <Field ImageView p>
		obj = ((Object) ((RelativeLayout)getView().findViewById(0x7f0901e3)));
	//   95  191:aload_0         
	//   96  192:invokevirtual   #325 <Method View getView()>
	//   97  195:ldc2            #355 <Int 0x7f0901e3>
	//   98  198:invokevirtual   #329 <Method View View.findViewById(int)>
	//   99  201:checkcast       #90  <Class RelativeLayout>
	//  100  204:astore_2        
		m = a(((RelativeLayout) (obj)), "3");
	//  101  205:aload_0         
	//  102  206:aload_0         
	//  103  207:aload_2         
	//  104  208:ldc2            #357 <String "3">
	//  105  211:invokespecial   #333 <Method CustomTextView a(RelativeLayout, String)>
	//  106  214:putfield        #359 <Field CustomTextView m>
		n = a(((RelativeLayout) (obj)), 0x7f0f0401);
	//  107  217:aload_0         
	//  108  218:aload_0         
	//  109  219:aload_2         
	//  110  220:ldc2            #360 <Int 0x7f0f0401>
	//  111  223:invokespecial   #338 <Method CustomTextView a(RelativeLayout, int)>
	//  112  226:putfield        #362 <Field CustomTextView n>
		q = a(((RelativeLayout) (obj)));
	//  113  229:aload_0         
	//  114  230:aload_0         
	//  115  231:aload_2         
	//  116  232:invokespecial   #342 <Method ImageView a(RelativeLayout)>
	//  117  235:putfield        #364 <Field ImageView q>
		v = Assembler.getInstance().getUpdateUIService(assetinfo.getAssetId());
	//  118  238:aload_0         
	//  119  239:invokestatic    #370 <Method Assembler Assembler.getInstance()>
	//  120  242:aload_3         
	//  121  243:invokevirtual   #374 <Method com.irobot.core.AssetId AssetInfo.getAssetId()>
	//  122  246:invokevirtual   #378 <Method UpdateUIService Assembler.getUpdateUIService(com.irobot.core.AssetId)>
	//  123  249:putfield        #380 <Field UpdateUIService v>
		b();
	//  124  252:aload_0         
	//  125  253:invokevirtual   #382 <Method void b()>
		if(c != OnDemandOTAPathType.None)
	//* 126  256:aload_0         
	//* 127  257:getfield        #79  <Field OnDemandOTAPathType c>
	//* 128  260:getstatic       #77  <Field OnDemandOTAPathType OnDemandOTAPathType.None>
	//* 129  263:if_acmpne       269
	//* 130  266:goto            271
			flag = false;
	//  131  269:iconst_0        
	//  132  270:istore_1        
		junit.b.a.b("On-demand OTA path type should not be none!", flag);
	//  133  271:ldc2            #384 <String "On-demand OTA path type should not be none!">
	//  134  274:iload_1         
	//  135  275:invokestatic    #389 <Method void junit.b.a.b(String, boolean)>
		AnalyticsSubsystem analyticssubsystem = AnalyticsSubsystem.getInstance();
	//  136  278:invokestatic    #394 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//  137  281:astore          4
		if(c == OnDemandOTAPathType.Settings)
	//* 138  283:aload_0         
	//* 139  284:getfield        #79  <Field OnDemandOTAPathType c>
	//* 140  287:getstatic       #397 <Field OnDemandOTAPathType OnDemandOTAPathType.Settings>
	//* 141  290:if_acmpne       300
			obj = ((Object) (OnDemandOtaPath.Settings));
	//  142  293:getstatic       #402 <Field OnDemandOtaPath OnDemandOtaPath.Settings>
	//  143  296:astore_2        
		else
	//* 144  297:goto            304
			obj = ((Object) (OnDemandOtaPath.Provisioning));
	//  145  300:getstatic       #405 <Field OnDemandOtaPath OnDemandOtaPath.Provisioning>
	//  146  303:astore_2        
		analyticssubsystem.trackOnDemandOtaInProgressViewed(assetinfo, ((OnDemandOtaPath) (obj)));
	//  147  304:aload           4
	//  148  306:aload_3         
	//  149  307:aload_2         
	//  150  308:invokevirtual   #409 <Method void AnalyticsSubsystem.trackOnDemandOtaInProgressViewed(AssetInfo, OnDemandOtaPath)>
	//  151  311:return          
	}

	protected void b()
	{
		d.setProgress(0);
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field ProgressBar d>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #414 <Method void ProgressBar.setProgress(int)>
		c(((TextView) (i)), ((TextView) (j)), o);
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #335 <Field CustomTextView i>
	//    7   13:aload_0         
	//    8   14:getfield        #340 <Field CustomTextView j>
	//    9   17:aload_0         
	//   10   18:getfield        #344 <Field ImageView o>
	//   11   21:invokespecial   #197 <Method void c(TextView, TextView, ImageView)>
		b(((TextView) (k)), ((TextView) (l)), p);
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getfield        #349 <Field CustomTextView k>
	//   15   29:aload_0         
	//   16   30:getfield        #352 <Field CustomTextView l>
	//   17   33:aload_0         
	//   18   34:getfield        #354 <Field ImageView p>
	//   19   37:invokespecial   #416 <Method void b(TextView, TextView, ImageView)>
		b(((TextView) (m)), ((TextView) (n)), q);
	//   20   40:aload_0         
	//   21   41:aload_0         
	//   22   42:getfield        #359 <Field CustomTextView m>
	//   23   45:aload_0         
	//   24   46:getfield        #362 <Field CustomTextView n>
	//   25   49:aload_0         
	//   26   50:getfield        #364 <Field ImageView q>
	//   27   53:invokespecial   #416 <Method void b(TextView, TextView, ImageView)>
	//   28   56:return          
	}

	protected void c()
	{
		if(d.getProgress() == 50)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field ProgressBar d>
	//*   2    4:invokevirtual   #419 <Method int ProgressBar.getProgress()>
	//*   3    7:bipush          50
	//*   4    9:icmpne          13
		{
			return;
	//    5   12:return          
		} else
		{
			a(((TextView) (i)), ((TextView) (j)), o);
	//    6   13:aload_0         
	//    7   14:aload_0         
	//    8   15:getfield        #335 <Field CustomTextView i>
	//    9   18:aload_0         
	//   10   19:getfield        #340 <Field CustomTextView j>
	//   11   22:aload_0         
	//   12   23:getfield        #344 <Field ImageView o>
	//   13   26:invokespecial   #421 <Method void a(TextView, TextView, ImageView)>
			b(((TextView) (m)), ((TextView) (n)), q);
	//   14   29:aload_0         
	//   15   30:aload_0         
	//   16   31:getfield        #359 <Field CustomTextView m>
	//   17   34:aload_0         
	//   18   35:getfield        #362 <Field CustomTextView n>
	//   19   38:aload_0         
	//   20   39:getfield        #364 <Field ImageView q>
	//   21   42:invokespecial   #416 <Method void b(TextView, TextView, ImageView)>
			a(0, 50, new Runnable() {

				public void run()
				{
					com.irobot.home.fragments.ch.a(a, ((TextView) (a.k)), ((TextView) (a.l)), a.p);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field ch a>
				//    2    4:aload_0         
				//    3    5:getfield        #17  <Field ch a>
				//    4    8:getfield        #25  <Field CustomTextView ch.k>
				//    5   11:aload_0         
				//    6   12:getfield        #17  <Field ch a>
				//    7   15:getfield        #28  <Field CustomTextView ch.l>
				//    8   18:aload_0         
				//    9   19:getfield        #17  <Field ch a>
				//   10   22:getfield        #32  <Field ImageView ch.p>
				//   11   25:invokestatic    #35  <Method void com.irobot.home.fragments.ch.a(ch, TextView, TextView, ImageView)>
				//   12   28:return          
				}

				final ch a;

			
			{
				a = ch.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ch a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   22   45:aload_0         
	//   23   46:iconst_0        
	//   24   47:bipush          50
	//   25   49:new             #6   <Class ch$1>
	//   26   52:dup             
	//   27   53:aload_0         
	//   28   54:invokespecial   #423 <Method void ch$1(ch)>
	//   29   57:invokespecial   #425 <Method void a(int, int, Runnable)>
			return;
	//   30   60:return          
		}
	}

	protected void d()
	{
		if(d.getProgress() == 100)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field ProgressBar d>
	//*   2    4:invokevirtual   #419 <Method int ProgressBar.getProgress()>
	//*   3    7:bipush          100
	//*   4    9:icmpne          13
		{
			return;
	//    5   12:return          
		} else
		{
			a(((TextView) (i)), ((TextView) (j)), o);
	//    6   13:aload_0         
	//    7   14:aload_0         
	//    8   15:getfield        #335 <Field CustomTextView i>
	//    9   18:aload_0         
	//   10   19:getfield        #340 <Field CustomTextView j>
	//   11   22:aload_0         
	//   12   23:getfield        #344 <Field ImageView o>
	//   13   26:invokespecial   #421 <Method void a(TextView, TextView, ImageView)>
			a(((TextView) (k)), ((TextView) (l)), p);
	//   14   29:aload_0         
	//   15   30:aload_0         
	//   16   31:getfield        #349 <Field CustomTextView k>
	//   17   34:aload_0         
	//   18   35:getfield        #352 <Field CustomTextView l>
	//   19   38:aload_0         
	//   20   39:getfield        #354 <Field ImageView p>
	//   21   42:invokespecial   #421 <Method void a(TextView, TextView, ImageView)>
			a(50, 100, new Runnable() {

				public void run()
				{
					com.irobot.home.fragments.ch.a(a, ((TextView) (a.m)), ((TextView) (a.n)), a.q);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field ch a>
				//    2    4:aload_0         
				//    3    5:getfield        #17  <Field ch a>
				//    4    8:getfield        #25  <Field CustomTextView ch.m>
				//    5   11:aload_0         
				//    6   12:getfield        #17  <Field ch a>
				//    7   15:getfield        #28  <Field CustomTextView ch.n>
				//    8   18:aload_0         
				//    9   19:getfield        #17  <Field ch a>
				//   10   22:getfield        #32  <Field ImageView ch.q>
				//   11   25:invokestatic    #35  <Method void com.irobot.home.fragments.ch.a(ch, TextView, TextView, ImageView)>
				//   12   28:return          
				}

				final ch a;

			
			{
				a = ch.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ch a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   22   45:aload_0         
	//   23   46:bipush          50
	//   24   48:bipush          100
	//   25   50:new             #8   <Class ch$2>
	//   26   53:dup             
	//   27   54:aload_0         
	//   28   55:invokespecial   #426 <Method void ch$2(ch)>
	//   29   58:invokespecial   #425 <Method void a(int, int, Runnable)>
			return;
	//   30   61:return          
		}
	}

	public void onAttach(Activity activity)
	{
		super.onAttach(activity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #430 <Method void j.onAttach(Activity)>
		if(activity instanceof b)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #15  <Class ch$b>
	//*   5    9:ifeq            21
		{
			s = (b)activity;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #15  <Class ch$b>
	//    9   17:putfield        #173 <Field ch$b s>
			return;
	//   10   20:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   21:new             #153 <Class StringBuilder>
	//   12   24:dup             
	//   13   25:invokespecial   #154 <Method void StringBuilder()>
	//   14   28:astore_2        
			stringbuilder.append(((Object) (activity)).toString());
	//   15   29:aload_2         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #431 <Method String Object.toString()>
	//   18   34:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			stringbuilder.append(" must implement OnUpdateInProgressListener");
	//   20   38:aload_2         
	//   21   39:ldc2            #433 <String " must implement OnUpdateInProgressListener">
	//   22   42:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
			throw new RuntimeException(stringbuilder.toString());
	//   24   46:new             #435 <Class RuntimeException>
	//   25   49:dup             
	//   26   50:aload_2         
	//   27   51:invokevirtual   #166 <Method String StringBuilder.toString()>
	//   28   54:invokespecial   #438 <Method void RuntimeException(String)>
	//   29   57:athrow          
		}
	}

	public void onAttach(Context context)
	{
		super.onAttach(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #440 <Method void j.onAttach(Context)>
		if(context instanceof b)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #15  <Class ch$b>
	//*   5    9:ifeq            21
		{
			s = (b)context;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #15  <Class ch$b>
	//    9   17:putfield        #173 <Field ch$b s>
			return;
	//   10   20:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   21:new             #153 <Class StringBuilder>
	//   12   24:dup             
	//   13   25:invokespecial   #154 <Method void StringBuilder()>
	//   14   28:astore_2        
			stringbuilder.append(((Object) (context)).toString());
	//   15   29:aload_2         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #431 <Method String Object.toString()>
	//   18   34:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			stringbuilder.append(" must implement OnUpdateInProgressListener");
	//   20   38:aload_2         
	//   21   39:ldc2            #433 <String " must implement OnUpdateInProgressListener">
	//   22   42:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
			throw new RuntimeException(stringbuilder.toString());
	//   24   46:new             #435 <Class RuntimeException>
	//   25   49:dup             
	//   26   50:aload_2         
	//   27   51:invokevirtual   #166 <Method String StringBuilder.toString()>
	//   28   54:invokespecial   #438 <Method void RuntimeException(String)>
	//   29   57:athrow          
		}
	}

	public void onDetach()
	{
		super.onDetach();
	//    0    0:aload_0         
	//    1    1:invokespecial   #443 <Method void j.onDetach()>
		s = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #173 <Field ch$b s>
	//    5    9:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #446 <Method void j.onResume()>
		OTAUIServiceData otauiservicedata = OTAUIServiceData.create();
	//    2    4:invokestatic    #451 <Method OTAUIServiceData OTAUIServiceData.create()>
	//    3    7:astore_3        
		otauiservicedata.setOnDemandOTAPathType(c);
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:getfield        #79  <Field OnDemandOTAPathType c>
	//    7   13:invokevirtual   #455 <Method void OTAUIServiceData.setOnDemandOTAPathType(OnDemandOTAPathType)>
		UpdateUIService updateuiservice;
		OTAUIServiceCommand otauiservicecommand;
		if(b == OnDemandOTAEntryType.RequestOnDemandOTA)
	//*   8   16:aload_0         
	//*   9   17:getfield        #72  <Field OnDemandOTAEntryType b>
	//*  10   20:getstatic       #70  <Field OnDemandOTAEntryType OnDemandOTAEntryType.RequestOnDemandOTA>
	//*  11   23:if_acmpne       42
		{
			updateuiservice = v;
	//   12   26:aload_0         
	//   13   27:getfield        #380 <Field UpdateUIService v>
	//   14   30:astore_1        
			otauiservicecommand = OTAUIServiceCommand.RequestOnDemandOTA;
	//   15   31:getstatic       #460 <Field OTAUIServiceCommand OTAUIServiceCommand.RequestOnDemandOTA>
	//   16   34:astore_2        
		} else
	//*  17   35:aload_1         
	//*  18   36:aload_2         
	//*  19   37:aload_3         
	//*  20   38:invokevirtual   #466 <Method void UpdateUIService.sendCommand(OTAUIServiceCommand, OTAUIServiceData)>
	//*  21   41:return          
		if(b == OnDemandOTAEntryType.ViewOnDemandOTA)
	//*  22   42:aload_0         
	//*  23   43:getfield        #72  <Field OnDemandOTAEntryType b>
	//*  24   46:getstatic       #469 <Field OnDemandOTAEntryType OnDemandOTAEntryType.ViewOnDemandOTA>
	//*  25   49:if_acmpne       64
		{
			updateuiservice = v;
	//   26   52:aload_0         
	//   27   53:getfield        #380 <Field UpdateUIService v>
	//   28   56:astore_1        
			otauiservicecommand = OTAUIServiceCommand.ViewOnDemandOTA;
	//   29   57:getstatic       #471 <Field OTAUIServiceCommand OTAUIServiceCommand.ViewOnDemandOTA>
	//   30   60:astore_2        
		} else
	//*  31   61:goto            35
		{
			return;
	//   32   64:return          
		}
		updateuiservice.sendCommand(otauiservicecommand, otauiservicedata);
	}

	public void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #474 <Method void j.onStart()>
		v.registerUISubscriber(((OTAUIServiceDataCallback) (u)));
	//    2    4:aload_0         
	//    3    5:getfield        #380 <Field UpdateUIService v>
	//    4    8:aload_0         
	//    5    9:getfield        #86  <Field ch$a u>
	//    6   12:invokevirtual   #478 <Method boolean UpdateUIService.registerUISubscriber(OTAUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	public void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #481 <Method void j.onStop()>
		v.unregisterSubscriber(((OTAUIServiceDataCallback) (u)));
	//    2    4:aload_0         
	//    3    5:getfield        #380 <Field UpdateUIService v>
	//    4    8:aload_0         
	//    5    9:getfield        #86  <Field ch$a u>
	//    6   12:invokevirtual   #484 <Method boolean UpdateUIService.unregisterSubscriber(OTAUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	private static final String r = com.irobot.home.util.j.r(((Class) (com/irobot/home/fragments/ch)).getSimpleName());
	String a;
	OnDemandOTAEntryType b;
	OnDemandOTAPathType c;
	ProgressBar d;
	TextView e;
	CustomVideoView f;
	CustomTextView i;
	CustomTextView j;
	CustomTextView k;
	CustomTextView l;
	CustomTextView m;
	CustomTextView n;
	ImageView o;
	ImageView p;
	ImageView q;
	private b s;
	private AlertDialog t;
	private a u;
	private UpdateUIService v;

	static 
	{
	//    0    0:ldc1            #2   <Class ch>
	//    1    2:invokevirtual   #54  <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #59  <Method String j.r(String)>
	//    3    8:putstatic       #61  <Field String r>
	//*   4   11:return          
	}
}
