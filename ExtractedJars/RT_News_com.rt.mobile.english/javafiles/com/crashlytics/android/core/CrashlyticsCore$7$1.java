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

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsCore, DialogStringResolver

class CrashlyticsCore$7$1
	implements android.content.ickListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		val$latch.setOptIn(true);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field CrashlyticsCore$7 this$1>
	//    2    4:getfield        #26  <Field CrashlyticsCore$OptInLatch CrashlyticsCore$7.val$latch>
	//    3    7:iconst_1        
	//    4    8:invokevirtual   #32  <Method void CrashlyticsCore$OptInLatch.setOptIn(boolean)>
		dialoginterface.dismiss();
	//    5   11:aload_1         
	//    6   12:invokeinterface #37  <Method void DialogInterface.dismiss()>
	//    7   17:return          
	}

	final CrashlyticsCore._cls7 this$1;

	CrashlyticsCore$7$1()
	{
		this$1 = CrashlyticsCore._cls7.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field CrashlyticsCore$7 this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class com/crashlytics/android/core/CrashlyticsCore$7

/* anonymous class */
	class CrashlyticsCore._cls7
		implements Runnable
	{

		public void run()
		{
			android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(((android.content.Context) (activity)));
		//    0    0:new             #46  <Class android.app.AlertDialog$Builder>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #33  <Field Activity val$activity>
		//    4    8:invokespecial   #49  <Method void android.app.AlertDialog$Builder(android.content.Context)>
		//    5   11:astore_3        
			CrashlyticsCore._cls7._cls1 _lcls1 = new CrashlyticsCore._cls7._cls1();
		//    6   12:new             #13  <Class CrashlyticsCore$7$1>
		//    7   15:dup             
		//    8   16:aload_0         
		//    9   17:invokespecial   #52  <Method void CrashlyticsCore$7$1(CrashlyticsCore$7)>
		//   10   20:astore          4
			float f = activity.getResources().getDisplayMetrics().density;
		//   11   22:aload_0         
		//   12   23:getfield        #33  <Field Activity val$activity>
		//   13   26:invokevirtual   #58  <Method Resources Activity.getResources()>
		//   14   29:invokevirtual   #64  <Method DisplayMetrics Resources.getDisplayMetrics()>
		//   15   32:getfield        #70  <Field float DisplayMetrics.density>
		//   16   35:fstore_1        
			int i = CrashlyticsCore.access$400(f, 5);
		//   17   36:fload_1         
		//   18   37:iconst_5        
		//   19   38:invokestatic    #74  <Method int CrashlyticsCore.access$400(float, int)>
		//   20   41:istore_2        
			TextView textview = new TextView(((android.content.Context) (activity)));
		//   21   42:new             #76  <Class TextView>
		//   22   45:dup             
		//   23   46:aload_0         
		//   24   47:getfield        #33  <Field Activity val$activity>
		//   25   50:invokespecial   #77  <Method void TextView(android.content.Context)>
		//   26   53:astore          5
			textview.setAutoLinkMask(15);
		//   27   55:aload           5
		//   28   57:bipush          15
		//   29   59:invokevirtual   #81  <Method void TextView.setAutoLinkMask(int)>
			textview.setText(((CharSequence) (stringResolver.getMessage())));
		//   30   62:aload           5
		//   31   64:aload_0         
		//   32   65:getfield        #37  <Field DialogStringResolver val$stringResolver>
		//   33   68:invokevirtual   #87  <Method String DialogStringResolver.getMessage()>
		//   34   71:invokevirtual   #91  <Method void TextView.setText(CharSequence)>
			textview.setTextAppearance(((android.content.Context) (activity)), 0x1030044);
		//   35   74:aload           5
		//   36   76:aload_0         
		//   37   77:getfield        #33  <Field Activity val$activity>
		//   38   80:ldc1            #92  <Int 0x1030044>
		//   39   82:invokevirtual   #96  <Method void TextView.setTextAppearance(android.content.Context, int)>
			textview.setPadding(i, i, i, i);
		//   40   85:aload           5
		//   41   87:iload_2         
		//   42   88:iload_2         
		//   43   89:iload_2         
		//   44   90:iload_2         
		//   45   91:invokevirtual   #100 <Method void TextView.setPadding(int, int, int, int)>
			textview.setFocusable(false);
		//   46   94:aload           5
		//   47   96:iconst_0        
		//   48   97:invokevirtual   #104 <Method void TextView.setFocusable(boolean)>
			ScrollView scrollview = new ScrollView(((android.content.Context) (activity)));
		//   49  100:new             #106 <Class ScrollView>
		//   50  103:dup             
		//   51  104:aload_0         
		//   52  105:getfield        #33  <Field Activity val$activity>
		//   53  108:invokespecial   #107 <Method void ScrollView(android.content.Context)>
		//   54  111:astore          6
			scrollview.setPadding(CrashlyticsCore.access$400(f, 14), CrashlyticsCore.access$400(f, 2), CrashlyticsCore.access$400(f, 10), CrashlyticsCore.access$400(f, 12));
		//   55  113:aload           6
		//   56  115:fload_1         
		//   57  116:bipush          14
		//   58  118:invokestatic    #74  <Method int CrashlyticsCore.access$400(float, int)>
		//   59  121:fload_1         
		//   60  122:iconst_2        
		//   61  123:invokestatic    #74  <Method int CrashlyticsCore.access$400(float, int)>
		//   62  126:fload_1         
		//   63  127:bipush          10
		//   64  129:invokestatic    #74  <Method int CrashlyticsCore.access$400(float, int)>
		//   65  132:fload_1         
		//   66  133:bipush          12
		//   67  135:invokestatic    #74  <Method int CrashlyticsCore.access$400(float, int)>
		//   68  138:invokevirtual   #108 <Method void ScrollView.setPadding(int, int, int, int)>
			scrollview.addView(((android.view.View) (textview)));
		//   69  141:aload           6
		//   70  143:aload           5
		//   71  145:invokevirtual   #112 <Method void ScrollView.addView(android.view.View)>
			builder.setView(((android.view.View) (scrollview))).setTitle(((CharSequence) (stringResolver.getTitle()))).setCancelable(false).setNeutralButton(((CharSequence) (stringResolver.getSendButtonTitle())), ((android.content.DialogInterface.OnClickListener) (_lcls1)));
		//   72  148:aload_3         
		//   73  149:aload           6
		//   74  151:invokevirtual   #116 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setView(android.view.View)>
		//   75  154:aload_0         
		//   76  155:getfield        #37  <Field DialogStringResolver val$stringResolver>
		//   77  158:invokevirtual   #119 <Method String DialogStringResolver.getTitle()>
		//   78  161:invokevirtual   #123 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
		//   79  164:iconst_0        
		//   80  165:invokevirtual   #127 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setCancelable(boolean)>
		//   81  168:aload_0         
		//   82  169:getfield        #37  <Field DialogStringResolver val$stringResolver>
		//   83  172:invokevirtual   #130 <Method String DialogStringResolver.getSendButtonTitle()>
		//   84  175:aload           4
		//   85  177:invokevirtual   #134 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNeutralButton(CharSequence, android.content.DialogInterface$OnClickListener)>
		//   86  180:pop             
			if(promptData.showCancelButton)
		//*  87  181:aload_0         
		//*  88  182:getfield        #39  <Field PromptSettingsData val$promptData>
		//*  89  185:getfield        #140 <Field boolean PromptSettingsData.showCancelButton>
		//*  90  188:ifeq            215
			{
				android.content.DialogInterface.OnClickListener onclicklistener = new CrashlyticsCore._cls7._cls2();
		//   91  191:new             #15  <Class CrashlyticsCore$7$2>
		//   92  194:dup             
		//   93  195:aload_0         
		//   94  196:invokespecial   #141 <Method void CrashlyticsCore$7$2(CrashlyticsCore$7)>
		//   95  199:astore          4
				builder.setNegativeButton(((CharSequence) (stringResolver.getCancelButtonTitle())), onclicklistener);
		//   96  201:aload_3         
		//   97  202:aload_0         
		//   98  203:getfield        #37  <Field DialogStringResolver val$stringResolver>
		//   99  206:invokevirtual   #144 <Method String DialogStringResolver.getCancelButtonTitle()>
		//  100  209:aload           4
		//  101  211:invokevirtual   #147 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(CharSequence, android.content.DialogInterface$OnClickListener)>
		//  102  214:pop             
			}
			if(promptData.showAlwaysSendButton)
		//* 103  215:aload_0         
		//* 104  216:getfield        #39  <Field PromptSettingsData val$promptData>
		//* 105  219:getfield        #150 <Field boolean PromptSettingsData.showAlwaysSendButton>
		//* 106  222:ifeq            249
			{
				android.content.DialogInterface.OnClickListener onclicklistener1 = new CrashlyticsCore._cls7._cls3();
		//  107  225:new             #17  <Class CrashlyticsCore$7$3>
		//  108  228:dup             
		//  109  229:aload_0         
		//  110  230:invokespecial   #151 <Method void CrashlyticsCore$7$3(CrashlyticsCore$7)>
		//  111  233:astore          4
				builder.setPositiveButton(((CharSequence) (stringResolver.getAlwaysSendButtonTitle())), onclicklistener1);
		//  112  235:aload_3         
		//  113  236:aload_0         
		//  114  237:getfield        #37  <Field DialogStringResolver val$stringResolver>
		//  115  240:invokevirtual   #154 <Method String DialogStringResolver.getAlwaysSendButtonTitle()>
		//  116  243:aload           4
		//  117  245:invokevirtual   #157 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
		//  118  248:pop             
			}
			builder.show();
		//  119  249:aload_3         
		//  120  250:invokevirtual   #161 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
		//  121  253:pop             
		//  122  254:return          
		}

		final CrashlyticsCore this$0;
		final Activity val$activity;
		final CrashlyticsCore.OptInLatch val$latch;
		final PromptSettingsData val$promptData;
		final DialogStringResolver val$stringResolver;

			
			{
				this$0 = final_crashlyticscore;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #31  <Field CrashlyticsCore this$0>
				activity = activity1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #33  <Field Activity val$activity>
				latch = optinlatch;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #35  <Field CrashlyticsCore$OptInLatch val$latch>
				stringResolver = dialogstringresolver;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #37  <Field DialogStringResolver val$stringResolver>
				promptData = PromptSettingsData.this;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #39  <Field PromptSettingsData val$promptData>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #42  <Method void Object()>
			//   17   31:return          
			}

		// Unreferenced inner class com/crashlytics/android/core/CrashlyticsCore$7$2

/* anonymous class */
		class CrashlyticsCore._cls7._cls2
			implements android.content.DialogInterface.OnClickListener
		{

			public void onClick(DialogInterface dialoginterface, int i)
			{
				latch.setOptIn(false);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field CrashlyticsCore$7 this$1>
			//    2    4:getfield        #26  <Field CrashlyticsCore$OptInLatch CrashlyticsCore$7.val$latch>
			//    3    7:iconst_0        
			//    4    8:invokevirtual   #32  <Method void CrashlyticsCore$OptInLatch.setOptIn(boolean)>
				dialoginterface.dismiss();
			//    5   11:aload_1         
			//    6   12:invokeinterface #37  <Method void DialogInterface.dismiss()>
			//    7   17:return          
			}

			final CrashlyticsCore._cls7 this$1;

					
					{
						this$1 = CrashlyticsCore._cls7.this;
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:putfield        #17  <Field CrashlyticsCore$7 this$1>
						super();
					//    3    5:aload_0         
					//    4    6:invokespecial   #19  <Method void Object()>
					//    5    9:return          
					}
		}


		// Unreferenced inner class com/crashlytics/android/core/CrashlyticsCore$7$3

/* anonymous class */
		class CrashlyticsCore._cls7._cls3
			implements android.content.DialogInterface.OnClickListener
		{

			public void onClick(DialogInterface dialoginterface, int i)
			{
				setShouldSendUserReportsWithoutPrompting(true);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field CrashlyticsCore$7 this$1>
			//    2    4:getfield        #26  <Field CrashlyticsCore CrashlyticsCore$7.this$0>
			//    3    7:iconst_1        
			//    4    8:invokevirtual   #32  <Method void CrashlyticsCore.setShouldSendUserReportsWithoutPrompting(boolean)>
				latch.setOptIn(true);
			//    5   11:aload_0         
			//    6   12:getfield        #17  <Field CrashlyticsCore$7 this$1>
			//    7   15:getfield        #36  <Field CrashlyticsCore$OptInLatch CrashlyticsCore$7.val$latch>
			//    8   18:iconst_1        
			//    9   19:invokevirtual   #41  <Method void CrashlyticsCore$OptInLatch.setOptIn(boolean)>
				dialoginterface.dismiss();
			//   10   22:aload_1         
			//   11   23:invokeinterface #46  <Method void DialogInterface.dismiss()>
			//   12   28:return          
			}

			final CrashlyticsCore._cls7 this$1;

					
					{
						this$1 = CrashlyticsCore._cls7.this;
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:putfield        #17  <Field CrashlyticsCore$7 this$1>
						super();
					//    3    5:aload_0         
					//    4    6:invokespecial   #19  <Method void Object()>
					//    5    9:return          
					}
		}

	}

}
