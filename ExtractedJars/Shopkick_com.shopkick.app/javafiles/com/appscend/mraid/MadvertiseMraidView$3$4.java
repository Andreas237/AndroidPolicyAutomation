// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.mraid;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

// Referenced classes of package com.appscend.mraid:
//			MadvertiseMraidView, MadvertiseActivity, MadvertiseUtil, MadvertiseView

class MadvertiseMraidView$3$4
	implements Runnable
{

	public void run()
	{
		if(MadvertiseMraidView.access$000(this$0) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field MadvertiseMraidView$3 this$1>
	//*   2    4:getfield        #30  <Field MadvertiseMraidView MadvertiseMraidView$3.this$0>
	//*   3    7:invokestatic    #36  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseMraidView.access$000(MadvertiseMraidView)>
	//*   4   10:ifnull          28
			MadvertiseMraidView.access$000(this$0).onAdClicked();
	//    5   13:aload_0         
	//    6   14:getfield        #19  <Field MadvertiseMraidView$3 this$1>
	//    7   17:getfield        #30  <Field MadvertiseMraidView MadvertiseMraidView$3.this$0>
	//    8   20:invokestatic    #36  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseMraidView.access$000(MadvertiseMraidView)>
	//    9   23:invokeinterface #41  <Method void MadvertiseView$MadvertiseViewCallbackListener.onAdClicked()>
		Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(val$url), getContext().getApplicationContext(), com/appscend/mraid/MadvertiseActivity);
	//   10   28:new             #43  <Class Intent>
	//   11   31:dup             
	//   12   32:ldc1            #45  <String "android.intent.action.VIEW">
	//   13   34:aload_0         
	//   14   35:getfield        #21  <Field String val$url>
	//   15   38:invokestatic    #51  <Method Uri Uri.parse(String)>
	//   16   41:aload_0         
	//   17   42:getfield        #19  <Field MadvertiseMraidView$3 this$1>
	//   18   45:getfield        #30  <Field MadvertiseMraidView MadvertiseMraidView$3.this$0>
	//   19   48:invokevirtual   #55  <Method Context MadvertiseMraidView.getContext()>
	//   20   51:invokevirtual   #60  <Method Context Context.getApplicationContext()>
	//   21   54:ldc1            #62  <Class MadvertiseActivity>
	//   22   56:invokespecial   #65  <Method void Intent(String, Uri, Context, Class)>
	//   23   59:astore_1        
		intent.setFlags(0x10000000);
	//   24   60:aload_1         
	//   25   61:ldc1            #66  <Int 0x10000000>
	//   26   63:invokevirtual   #70  <Method Intent Intent.setFlags(int)>
	//   27   66:pop             
		getContext().startActivity(intent);
	//   28   67:aload_0         
	//   29   68:getfield        #19  <Field MadvertiseMraidView$3 this$1>
	//   30   71:getfield        #30  <Field MadvertiseMraidView MadvertiseMraidView$3.this$0>
	//   31   74:invokevirtual   #55  <Method Context MadvertiseMraidView.getContext()>
	//   32   77:aload_1         
	//   33   78:invokevirtual   #74  <Method void Context.startActivity(Intent)>
	//   34   81:return          
	}

	final MadvertiseMraidView._cls3 this$1;
	final String val$url;

	MadvertiseMraidView$3$4()
	{
		this$1 = final__pcls3;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field MadvertiseMraidView$3 this$1>
		val$url = String.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field String val$url>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}

	// Unreferenced inner class com/appscend/mraid/MadvertiseMraidView$3

/* anonymous class */
	class MadvertiseMraidView._cls3
	{

		public void close()
		{
			MadvertiseUtil.logMessage(((String) (null)), 4, "Called close from Ad with.");
		//    0    0:aconst_null     
		//    1    1:iconst_4        
		//    2    2:ldc1            #27  <String "Called close from Ad with.">
		//    3    4:invokestatic    #33  <Method void MadvertiseUtil.logMessage(String, int, String)>
			post(new MadvertiseMraidView._cls3._cls3());
		//    4    7:aload_0         
		//    5    8:getfield        #20  <Field MadvertiseMraidView this$0>
		//    6   11:new             #12  <Class MadvertiseMraidView$3$3>
		//    7   14:dup             
		//    8   15:aload_0         
		//    9   16:invokespecial   #36  <Method void MadvertiseMraidView$3$3(MadvertiseMraidView$3)>
		//   10   19:invokevirtual   #40  <Method boolean MadvertiseMraidView.post(Runnable)>
		//   11   22:pop             
		//   12   23:return          
		}

		public void expand()
		{
			MadvertiseUtil.logMessage(((String) (null)), 4, "Called expand from Ad or Java.");
		//    0    0:aconst_null     
		//    1    1:iconst_4        
		//    2    2:ldc1            #43  <String "Called expand from Ad or Java.">
		//    3    4:invokestatic    #33  <Method void MadvertiseUtil.logMessage(String, int, String)>
			post(new MadvertiseMraidView._cls3._cls1());
		//    4    7:aload_0         
		//    5    8:getfield        #20  <Field MadvertiseMraidView this$0>
		//    6   11:new             #8   <Class MadvertiseMraidView$3$1>
		//    7   14:dup             
		//    8   15:aload_0         
		//    9   16:invokespecial   #44  <Method void MadvertiseMraidView$3$1(MadvertiseMraidView$3)>
		//   10   19:invokevirtual   #40  <Method boolean MadvertiseMraidView.post(Runnable)>
		//   11   22:pop             
			setState(3);
		//   12   23:aload_0         
		//   13   24:getfield        #20  <Field MadvertiseMraidView this$0>
		//   14   27:iconst_3        
		//   15   28:invokevirtual   #48  <Method void MadvertiseMraidView.setState(int)>
			if(MadvertiseMraidView.access$000(MadvertiseMraidView.this) != null)
		//*  16   31:aload_0         
		//*  17   32:getfield        #20  <Field MadvertiseMraidView this$0>
		//*  18   35:invokestatic    #52  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseMraidView.access$000(MadvertiseMraidView)>
		//*  19   38:ifnull          53
				MadvertiseMraidView.access$000(MadvertiseMraidView.this).onApplicationPause();
		//   20   41:aload_0         
		//   21   42:getfield        #20  <Field MadvertiseMraidView this$0>
		//   22   45:invokestatic    #52  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseMraidView.access$000(MadvertiseMraidView)>
		//   23   48:invokeinterface #57  <Method void MadvertiseView$MadvertiseViewCallbackListener.onApplicationPause()>
			if(MadvertiseMraidView.access$800(MadvertiseMraidView.this) != null)
		//*  24   53:aload_0         
		//*  25   54:getfield        #20  <Field MadvertiseMraidView this$0>
		//*  26   57:invokestatic    #61  <Method MadvertiseView MadvertiseMraidView.access$800(MadvertiseMraidView)>
		//*  27   60:ifnull          74
				MadvertiseMraidView.access$800(MadvertiseMraidView.this).setFetchingAdsEnabled(false);
		//   28   63:aload_0         
		//   29   64:getfield        #20  <Field MadvertiseMraidView this$0>
		//   30   67:invokestatic    #61  <Method MadvertiseView MadvertiseMraidView.access$800(MadvertiseMraidView)>
		//   31   70:iconst_0        
		//   32   71:invokevirtual   #67  <Method void MadvertiseView.setFetchingAdsEnabled(boolean)>
		//   33   74:return          
		}

		public void expand(final String url)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #70  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #71  <Method void StringBuilder()>
		//    3    7:astore_2        
			stringbuilder.append("Called expand from Ad with : ");
		//    4    8:aload_2         
		//    5    9:ldc1            #73  <String "Called expand from Ad with : ">
		//    6   11:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(url);
		//    8   15:aload_2         
		//    9   16:aload_1         
		//   10   17:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   11   20:pop             
			MadvertiseUtil.logMessage(((String) (null)), 4, stringbuilder.toString());
		//   12   21:aconst_null     
		//   13   22:iconst_4        
		//   14   23:aload_2         
		//   15   24:invokevirtual   #81  <Method String StringBuilder.toString()>
		//   16   27:invokestatic    #33  <Method void MadvertiseUtil.logMessage(String, int, String)>
			expand();
		//   17   30:aload_0         
		//   18   31:invokevirtual   #83  <Method void expand()>
			post(new MadvertiseMraidView._cls3._cls2());
		//   19   34:aload_0         
		//   20   35:getfield        #20  <Field MadvertiseMraidView this$0>
		//   21   38:new             #10  <Class MadvertiseMraidView$3$2>
		//   22   41:dup             
		//   23   42:aload_0         
		//   24   43:aload_1         
		//   25   44:invokespecial   #86  <Method void MadvertiseMraidView$3$2(MadvertiseMraidView$3, String)>
		//   26   47:invokevirtual   #40  <Method boolean MadvertiseMraidView.post(Runnable)>
		//   27   50:pop             
		//   28   51:return          
		}

		public void logMessage(String s)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #70  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #71  <Method void StringBuilder()>
		//    3    7:astore_2        
			stringbuilder.append("Called logMessage from Ad with : ");
		//    4    8:aload_2         
		//    5    9:ldc1            #88  <String "Called logMessage from Ad with : ">
		//    6   11:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(s);
		//    8   15:aload_2         
		//    9   16:aload_1         
		//   10   17:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   11   20:pop             
			MadvertiseUtil.logMessage(((String) (null)), 4, stringbuilder.toString());
		//   12   21:aconst_null     
		//   13   22:iconst_4        
		//   14   23:aload_2         
		//   15   24:invokevirtual   #81  <Method String StringBuilder.toString()>
		//   16   27:invokestatic    #33  <Method void MadvertiseUtil.logMessage(String, int, String)>
		//   17   30:return          
		}

		public void open(String s)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #70  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #71  <Method void StringBuilder()>
		//    3    7:astore_2        
			stringbuilder.append("Called open from Ad with : ");
		//    4    8:aload_2         
		//    5    9:ldc1            #91  <String "Called open from Ad with : ">
		//    6   11:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(s);
		//    8   15:aload_2         
		//    9   16:aload_1         
		//   10   17:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   11   20:pop             
			MadvertiseUtil.logMessage(((String) (null)), 4, stringbuilder.toString());
		//   12   21:aconst_null     
		//   13   22:iconst_4        
		//   14   23:aload_2         
		//   15   24:invokevirtual   #81  <Method String StringBuilder.toString()>
		//   16   27:invokestatic    #33  <Method void MadvertiseUtil.logMessage(String, int, String)>
			post(((Runnable) (((MadvertiseMraidView._cls3._cls4) (s)). new MadvertiseMraidView._cls3._cls4())));
		//   17   30:aload_0         
		//   18   31:getfield        #20  <Field MadvertiseMraidView this$0>
		//   19   34:new             #14  <Class MadvertiseMraidView$3$4>
		//   20   37:dup             
		//   21   38:aload_0         
		//   22   39:aload_1         
		//   23   40:invokespecial   #92  <Method void MadvertiseMraidView$3$4(MadvertiseMraidView$3, String)>
		//   24   43:invokevirtual   #40  <Method boolean MadvertiseMraidView.post(Runnable)>
		//   25   46:pop             
		//   26   47:return          
		}

		public void setExpandProperties(String s)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #70  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #71  <Method void StringBuilder()>
		//    3    7:astore_2        
			stringbuilder.append("Called setExpandProperties from Ad with : ");
		//    4    8:aload_2         
		//    5    9:ldc1            #95  <String "Called setExpandProperties from Ad with : ">
		//    6   11:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(s);
		//    8   15:aload_2         
		//    9   16:aload_1         
		//   10   17:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   11   20:pop             
			MadvertiseUtil.logMessage(((String) (null)), 4, stringbuilder.toString());
		//   12   21:aconst_null     
		//   13   22:iconst_4        
		//   14   23:aload_2         
		//   15   24:invokevirtual   #81  <Method String StringBuilder.toString()>
		//   16   27:invokestatic    #33  <Method void MadvertiseUtil.logMessage(String, int, String)>
			MadvertiseMraidView.access$600(MadvertiseMraidView.this).readJson(s);
		//   17   30:aload_0         
		//   18   31:getfield        #20  <Field MadvertiseMraidView this$0>
		//   19   34:invokestatic    #99  <Method MadvertiseMraidView$ExpandProperties MadvertiseMraidView.access$600(MadvertiseMraidView)>
		//   20   37:aload_1         
		//   21   38:invokevirtual   #104 <Method void MadvertiseMraidView$ExpandProperties.readJson(String)>
		//   22   41:return          
		}

		final MadvertiseMraidView this$0;

			
			{
				this$0 = MadvertiseMraidView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field MadvertiseMraidView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}

		// Unreferenced inner class com/appscend/mraid/MadvertiseMraidView$3$1

/* anonymous class */
		class MadvertiseMraidView._cls3._cls1
			implements Runnable
		{

			public void run()
			{
				MadvertiseMraidView.access$700(this$0, MadvertiseMraidView.access$600(this$0).width, MadvertiseMraidView.access$600(this$0).height);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field MadvertiseMraidView$3 this$1>
			//    2    4:getfield        #25  <Field MadvertiseMraidView MadvertiseMraidView$3.this$0>
			//    3    7:aload_0         
			//    4    8:getfield        #17  <Field MadvertiseMraidView$3 this$1>
			//    5   11:getfield        #25  <Field MadvertiseMraidView MadvertiseMraidView$3.this$0>
			//    6   14:invokestatic    #31  <Method MadvertiseMraidView$ExpandProperties MadvertiseMraidView.access$600(MadvertiseMraidView)>
			//    7   17:getfield        #37  <Field int MadvertiseMraidView$ExpandProperties.width>
			//    8   20:aload_0         
			//    9   21:getfield        #17  <Field MadvertiseMraidView$3 this$1>
			//   10   24:getfield        #25  <Field MadvertiseMraidView MadvertiseMraidView$3.this$0>
			//   11   27:invokestatic    #31  <Method MadvertiseMraidView$ExpandProperties MadvertiseMraidView.access$600(MadvertiseMraidView)>
			//   12   30:getfield        #40  <Field int MadvertiseMraidView$ExpandProperties.height>
			//   13   33:invokestatic    #44  <Method void MadvertiseMraidView.access$700(MadvertiseMraidView, int, int)>
			//   14   36:return          
			}

			final MadvertiseMraidView._cls3 this$1;

					
					{
						this$1 = MadvertiseMraidView._cls3.this;
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:putfield        #17  <Field MadvertiseMraidView$3 this$1>
						super();
					//    3    5:aload_0         
					//    4    6:invokespecial   #19  <Method void Object()>
					//    5    9:return          
					}
		}


		// Unreferenced inner class com/appscend/mraid/MadvertiseMraidView$3$2

/* anonymous class */
		class MadvertiseMraidView._cls3._cls2
			implements Runnable
		{

			public void run()
			{
				loadUrl(url);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field MadvertiseMraidView$3 this$1>
			//    2    4:getfield        #30  <Field MadvertiseMraidView MadvertiseMraidView$3.this$0>
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field String val$url>
			//    5   11:invokevirtual   #35  <Method void MadvertiseMraidView.loadUrl(String)>
			//    6   14:return          
			}

			final MadvertiseMraidView._cls3 this$1;
			final String val$url;

					
					{
						this$1 = MadvertiseMraidView._cls3.this;
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:putfield        #19  <Field MadvertiseMraidView$3 this$1>
						url = s;
					//    3    5:aload_0         
					//    4    6:aload_2         
					//    5    7:putfield        #21  <Field String val$url>
						super();
					//    6   10:aload_0         
					//    7   11:invokespecial   #24  <Method void Object()>
					//    8   14:return          
					}
		}


		// Unreferenced inner class com/appscend/mraid/MadvertiseMraidView$3$3

/* anonymous class */
		class MadvertiseMraidView._cls3._cls3
			implements Runnable
		{

			public void run()
			{
				MadvertiseMraidView.access$900(this$0);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field MadvertiseMraidView$3 this$1>
			//    2    4:getfield        #25  <Field MadvertiseMraidView MadvertiseMraidView$3.this$0>
			//    3    7:invokestatic    #31  <Method void MadvertiseMraidView.access$900(MadvertiseMraidView)>
			//    4   10:return          
			}

			final MadvertiseMraidView._cls3 this$1;

					
					{
						this$1 = MadvertiseMraidView._cls3.this;
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:putfield        #17  <Field MadvertiseMraidView$3 this$1>
						super();
					//    3    5:aload_0         
					//    4    6:invokespecial   #19  <Method void Object()>
					//    5    9:return          
					}
		}

	}

}
