// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.widget.ScrollView;
import android.widget.TextView;
import io.fabric.sdk.android.services.settings.PromptSettingsData;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.crashlytics.android.core:
//			DialogStringResolver

class CrashPromptDialog
{
	static interface AlwaysSendCallback
	{

		public abstract void sendUserReportsWithoutPrompting(boolean flag);
	}

	private static class OptInLatch
	{

		void await()
		{
			try
			{
				latch.await();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field CountDownLatch latch>
		//    2    4:invokevirtual   #32  <Method void CountDownLatch.await()>
				return;
		//    3    7:return          
			}
			catch(InterruptedException interruptedexception)
		//*   4    8:astore_1        
			{
				return;
		//    5    9:return          
			}
		}

		boolean getOptIn()
		{
			return send;
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field boolean send>
		//    2    4:ireturn         
		}

		void setOptIn(boolean flag)
		{
			send = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #17  <Field boolean send>
			latch.countDown();
		//    3    5:aload_0         
		//    4    6:getfield        #24  <Field CountDownLatch latch>
		//    5    9:invokevirtual   #39  <Method void CountDownLatch.countDown()>
		//    6   12:return          
		}

		private final CountDownLatch latch;
		private boolean send;

		private OptInLatch()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			send = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #17  <Field boolean send>
			latch = new CountDownLatch(1);
		//    5    9:aload_0         
		//    6   10:new             #19  <Class CountDownLatch>
		//    7   13:dup             
		//    8   14:iconst_1        
		//    9   15:invokespecial   #22  <Method void CountDownLatch(int)>
		//   10   18:putfield        #24  <Field CountDownLatch latch>
		//   11   21:return          
		}

	}


	private CrashPromptDialog(android.app.AlertDialog.Builder builder, OptInLatch optinlatch)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		latch = optinlatch;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #27  <Field CrashPromptDialog$OptInLatch latch>
		dialog = builder;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #29  <Field android.app.AlertDialog$Builder dialog>
	//    8   14:return          
	}

	public static CrashPromptDialog create(Activity activity, PromptSettingsData promptsettingsdata, AlwaysSendCallback alwayssendcallback)
	{
		OptInLatch optinlatch = new OptInLatch();
	//    0    0:new             #15  <Class CrashPromptDialog$OptInLatch>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #35  <Method void CrashPromptDialog$OptInLatch(CrashPromptDialog$1)>
	//    4    8:astore_3        
		DialogStringResolver dialogstringresolver = new DialogStringResolver(((android.content.Context) (activity)), promptsettingsdata);
	//    5    9:new             #37  <Class DialogStringResolver>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #40  <Method void DialogStringResolver(android.content.Context, PromptSettingsData)>
	//   10   18:astore          4
		android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(((android.content.Context) (activity)));
	//   11   20:new             #42  <Class android.app.AlertDialog$Builder>
	//   12   23:dup             
	//   13   24:aload_0         
	//   14   25:invokespecial   #45  <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   15   28:astore          5
		activity = ((Activity) (createDialogView(activity, dialogstringresolver.getMessage())));
	//   16   30:aload_0         
	//   17   31:aload           4
	//   18   33:invokevirtual   #49  <Method String DialogStringResolver.getMessage()>
	//   19   36:invokestatic    #53  <Method ScrollView createDialogView(Activity, String)>
	//   20   39:astore_0        
		android.content.DialogInterface.OnClickListener onclicklistener = new android.content.DialogInterface.OnClickListener(optinlatch) {

			public void onClick(DialogInterface dialoginterface, int i)
			{
				latch.setOptIn(true);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field CrashPromptDialog$OptInLatch val$latch>
			//    2    4:iconst_1        
			//    3    5:invokevirtual   #29  <Method void CrashPromptDialog$OptInLatch.setOptIn(boolean)>
				dialoginterface.dismiss();
			//    4    8:aload_1         
			//    5    9:invokeinterface #34  <Method void DialogInterface.dismiss()>
			//    6   14:return          
			}

			final OptInLatch val$latch;

			
			{
				latch = optinlatch;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CrashPromptDialog$OptInLatch val$latch>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   21   40:new             #6   <Class CrashPromptDialog$1>
	//   22   43:dup             
	//   23   44:aload_3         
	//   24   45:invokespecial   #56  <Method void CrashPromptDialog$1(CrashPromptDialog$OptInLatch)>
	//   25   48:astore          6
		builder.setView(((android.view.View) (activity))).setTitle(((CharSequence) (dialogstringresolver.getTitle()))).setCancelable(false).setNeutralButton(((CharSequence) (dialogstringresolver.getSendButtonTitle())), onclicklistener);
	//   26   50:aload           5
	//   27   52:aload_0         
	//   28   53:invokevirtual   #60  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setView(android.view.View)>
	//   29   56:aload           4
	//   30   58:invokevirtual   #63  <Method String DialogStringResolver.getTitle()>
	//   31   61:invokevirtual   #67  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   32   64:iconst_0        
	//   33   65:invokevirtual   #71  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setCancelable(boolean)>
	//   34   68:aload           4
	//   35   70:invokevirtual   #74  <Method String DialogStringResolver.getSendButtonTitle()>
	//   36   73:aload           6
	//   37   75:invokevirtual   #78  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNeutralButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   38   78:pop             
		if(promptsettingsdata.showCancelButton)
	//*  39   79:aload_1         
	//*  40   80:getfield        #84  <Field boolean PromptSettingsData.showCancelButton>
	//*  41   83:ifeq            107
		{
			activity = ((Activity) (new android.content.DialogInterface.OnClickListener(optinlatch) {

				public void onClick(DialogInterface dialoginterface, int i)
				{
					latch.setOptIn(false);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field CrashPromptDialog$OptInLatch val$latch>
				//    2    4:iconst_0        
				//    3    5:invokevirtual   #29  <Method void CrashPromptDialog$OptInLatch.setOptIn(boolean)>
					dialoginterface.dismiss();
				//    4    8:aload_1         
				//    5    9:invokeinterface #34  <Method void DialogInterface.dismiss()>
				//    6   14:return          
				}

				final OptInLatch val$latch;

			
			{
				latch = optinlatch;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CrashPromptDialog$OptInLatch val$latch>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
));
	//   42   86:new             #8   <Class CrashPromptDialog$2>
	//   43   89:dup             
	//   44   90:aload_3         
	//   45   91:invokespecial   #85  <Method void CrashPromptDialog$2(CrashPromptDialog$OptInLatch)>
	//   46   94:astore_0        
			builder.setNegativeButton(((CharSequence) (dialogstringresolver.getCancelButtonTitle())), ((android.content.DialogInterface.OnClickListener) (activity)));
	//   47   95:aload           5
	//   48   97:aload           4
	//   49   99:invokevirtual   #88  <Method String DialogStringResolver.getCancelButtonTitle()>
	//   50  102:aload_0         
	//   51  103:invokevirtual   #91  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   52  106:pop             
		}
		if(promptsettingsdata.showAlwaysSendButton)
	//*  53  107:aload_1         
	//*  54  108:getfield        #94  <Field boolean PromptSettingsData.showAlwaysSendButton>
	//*  55  111:ifeq            136
		{
			activity = ((Activity) (new android.content.DialogInterface.OnClickListener(alwayssendcallback, optinlatch) {

				public void onClick(DialogInterface dialoginterface, int i)
				{
					alwaysSendCallback.sendUserReportsWithoutPrompting(true);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field CrashPromptDialog$AlwaysSendCallback val$alwaysSendCallback>
				//    2    4:iconst_1        
				//    3    5:invokeinterface #33  <Method void CrashPromptDialog$AlwaysSendCallback.sendUserReportsWithoutPrompting(boolean)>
					latch.setOptIn(true);
				//    4   10:aload_0         
				//    5   11:getfield        #21  <Field CrashPromptDialog$OptInLatch val$latch>
				//    6   14:iconst_1        
				//    7   15:invokevirtual   #38  <Method void CrashPromptDialog$OptInLatch.setOptIn(boolean)>
					dialoginterface.dismiss();
				//    8   18:aload_1         
				//    9   19:invokeinterface #43  <Method void DialogInterface.dismiss()>
				//   10   24:return          
				}

				final AlwaysSendCallback val$alwaysSendCallback;
				final OptInLatch val$latch;

			
			{
				alwaysSendCallback = alwayssendcallback;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CrashPromptDialog$AlwaysSendCallback val$alwaysSendCallback>
				latch = optinlatch;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field CrashPromptDialog$OptInLatch val$latch>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
));
	//   56  114:new             #10  <Class CrashPromptDialog$3>
	//   57  117:dup             
	//   58  118:aload_2         
	//   59  119:aload_3         
	//   60  120:invokespecial   #97  <Method void CrashPromptDialog$3(CrashPromptDialog$AlwaysSendCallback, CrashPromptDialog$OptInLatch)>
	//   61  123:astore_0        
			builder.setPositiveButton(((CharSequence) (dialogstringresolver.getAlwaysSendButtonTitle())), ((android.content.DialogInterface.OnClickListener) (activity)));
	//   62  124:aload           5
	//   63  126:aload           4
	//   64  128:invokevirtual   #100 <Method String DialogStringResolver.getAlwaysSendButtonTitle()>
	//   65  131:aload_0         
	//   66  132:invokevirtual   #103 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   67  135:pop             
		}
		return new CrashPromptDialog(builder, optinlatch);
	//   68  136:new             #2   <Class CrashPromptDialog>
	//   69  139:dup             
	//   70  140:aload           5
	//   71  142:aload_3         
	//   72  143:invokespecial   #105 <Method void CrashPromptDialog(android.app.AlertDialog$Builder, CrashPromptDialog$OptInLatch)>
	//   73  146:areturn         
	}

	private static ScrollView createDialogView(Activity activity, String s)
	{
		float f = activity.getResources().getDisplayMetrics().density;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #111 <Method Resources Activity.getResources()>
	//    2    4:invokevirtual   #117 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    3    7:getfield        #123 <Field float DisplayMetrics.density>
	//    4   10:fstore_2        
		int i = dipsToPixels(f, 5);
	//    5   11:fload_2         
	//    6   12:iconst_5        
	//    7   13:invokestatic    #127 <Method int dipsToPixels(float, int)>
	//    8   16:istore_3        
		TextView textview = new TextView(((android.content.Context) (activity)));
	//    9   17:new             #129 <Class TextView>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #130 <Method void TextView(android.content.Context)>
	//   13   25:astore          4
		textview.setAutoLinkMask(15);
	//   14   27:aload           4
	//   15   29:bipush          15
	//   16   31:invokevirtual   #134 <Method void TextView.setAutoLinkMask(int)>
		textview.setText(((CharSequence) (s)));
	//   17   34:aload           4
	//   18   36:aload_1         
	//   19   37:invokevirtual   #138 <Method void TextView.setText(CharSequence)>
		textview.setTextAppearance(((android.content.Context) (activity)), 0x1030044);
	//   20   40:aload           4
	//   21   42:aload_0         
	//   22   43:ldc1            #139 <Int 0x1030044>
	//   23   45:invokevirtual   #143 <Method void TextView.setTextAppearance(android.content.Context, int)>
		textview.setPadding(i, i, i, i);
	//   24   48:aload           4
	//   25   50:iload_3         
	//   26   51:iload_3         
	//   27   52:iload_3         
	//   28   53:iload_3         
	//   29   54:invokevirtual   #147 <Method void TextView.setPadding(int, int, int, int)>
		textview.setFocusable(false);
	//   30   57:aload           4
	//   31   59:iconst_0        
	//   32   60:invokevirtual   #151 <Method void TextView.setFocusable(boolean)>
		activity = ((Activity) (new ScrollView(((android.content.Context) (activity)))));
	//   33   63:new             #153 <Class ScrollView>
	//   34   66:dup             
	//   35   67:aload_0         
	//   36   68:invokespecial   #154 <Method void ScrollView(android.content.Context)>
	//   37   71:astore_0        
		((ScrollView) (activity)).setPadding(dipsToPixels(f, 14), dipsToPixels(f, 2), dipsToPixels(f, 10), dipsToPixels(f, 12));
	//   38   72:aload_0         
	//   39   73:fload_2         
	//   40   74:bipush          14
	//   41   76:invokestatic    #127 <Method int dipsToPixels(float, int)>
	//   42   79:fload_2         
	//   43   80:iconst_2        
	//   44   81:invokestatic    #127 <Method int dipsToPixels(float, int)>
	//   45   84:fload_2         
	//   46   85:bipush          10
	//   47   87:invokestatic    #127 <Method int dipsToPixels(float, int)>
	//   48   90:fload_2         
	//   49   91:bipush          12
	//   50   93:invokestatic    #127 <Method int dipsToPixels(float, int)>
	//   51   96:invokevirtual   #155 <Method void ScrollView.setPadding(int, int, int, int)>
		((ScrollView) (activity)).addView(((android.view.View) (textview)));
	//   52   99:aload_0         
	//   53  100:aload           4
	//   54  102:invokevirtual   #159 <Method void ScrollView.addView(android.view.View)>
		return ((ScrollView) (activity));
	//   55  105:aload_0         
	//   56  106:areturn         
	}

	private static int dipsToPixels(float f, int i)
	{
		return (int)(f * (float)i);
	//    0    0:fload_0         
	//    1    1:iload_1         
	//    2    2:i2f             
	//    3    3:fmul            
	//    4    4:f2i             
	//    5    5:ireturn         
	}

	public void await()
	{
		latch.await();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field CrashPromptDialog$OptInLatch latch>
	//    2    4:invokevirtual   #162 <Method void CrashPromptDialog$OptInLatch.await()>
	//    3    7:return          
	}

	public boolean getOptIn()
	{
		return latch.getOptIn();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field CrashPromptDialog$OptInLatch latch>
	//    2    4:invokevirtual   #166 <Method boolean CrashPromptDialog$OptInLatch.getOptIn()>
	//    3    7:ireturn         
	}

	public void show()
	{
		dialog.show();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field android.app.AlertDialog$Builder dialog>
	//    2    4:invokevirtual   #170 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//    3    7:pop             
	//    4    8:return          
	}

	private final android.app.AlertDialog.Builder dialog;
	private final OptInLatch latch;
}
