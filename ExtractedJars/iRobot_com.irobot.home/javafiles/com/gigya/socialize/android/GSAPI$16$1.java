// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;

// Referenced classes of package com.gigya.socialize.android:
//			GSAPI

class GSAPI$16$1
	implements android.content.face.OnKeyListener
{

	public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
	{
		if(i == 4 && keyevent.getRepeatCount() == 0)
	//*   0    0:iload_2         
	//*   1    1:iconst_4        
	//*   2    2:icmpne          66
	//*   3    5:aload_3         
	//*   4    6:invokevirtual   #29  <Method int KeyEvent.getRepeatCount()>
	//*   5    9:ifne            66
		{
			if(GSAPI.access$1200(this$0) != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #17  <Field GSAPI$16 this$1>
	//*   8   16:getfield        #33  <Field GSAPI GSAPI$16.this$0>
	//*   9   19:invokestatic    #39  <Method ProgressDialog GSAPI.access$1200(GSAPI)>
	//*  10   22:ifnull          38
				GSAPI.access$1200(this$0).dismiss();
	//   11   25:aload_0         
	//   12   26:getfield        #17  <Field GSAPI$16 this$1>
	//   13   29:getfield        #33  <Field GSAPI GSAPI$16.this$0>
	//   14   32:invokestatic    #39  <Method ProgressDialog GSAPI.access$1200(GSAPI)>
	//   15   35:invokevirtual   #44  <Method void ProgressDialog.dismiss()>
			if(GSAPI.access$1100(this$0) != null)
	//*  16   38:aload_0         
	//*  17   39:getfield        #17  <Field GSAPI$16 this$1>
	//*  18   42:getfield        #33  <Field GSAPI GSAPI$16.this$0>
	//*  19   45:invokestatic    #48  <Method FragmentActivity GSAPI.access$1100(GSAPI)>
	//*  20   48:ifnull          64
				GSAPI.access$1100(this$0).finish();
	//   21   51:aload_0         
	//   22   52:getfield        #17  <Field GSAPI$16 this$1>
	//   23   55:getfield        #33  <Field GSAPI GSAPI$16.this$0>
	//   24   58:invokestatic    #48  <Method FragmentActivity GSAPI.access$1100(GSAPI)>
	//   25   61:invokevirtual   #53  <Method void FragmentActivity.finish()>
			return true;
	//   26   64:iconst_1        
	//   27   65:ireturn         
		} else
		{
			return false;
	//   28   66:iconst_0        
	//   29   67:ireturn         
		}
	}

	final GSAPI._cls16 this$1;

	GSAPI$16$1()
	{
		this$1 = GSAPI._cls16.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field GSAPI$16 this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class com/gigya/socialize/android/GSAPI$16

/* anonymous class */
	class GSAPI._cls16
		implements com.gigya.socialize.android.ui.HostActivity.HostActivityHandler
	{

		public void onActivityResult(FragmentActivity fragmentactivity, int i, int j, Intent intent)
		{
		//    0    0:return          
		}

		public void onCancel(FragmentActivity fragmentactivity)
		{
			GSAPI.access$1200(GSAPI.this).dismiss();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field GSAPI this$0>
		//    2    4:invokestatic    #35  <Method ProgressDialog GSAPI.access$1200(GSAPI)>
		//    3    7:invokevirtual   #40  <Method void ProgressDialog.dismiss()>
			GSAPI.access$1102(GSAPI.this, ((FragmentActivity) (null)));
		//    4   10:aload_0         
		//    5   11:getfield        #21  <Field GSAPI this$0>
		//    6   14:aconst_null     
		//    7   15:invokestatic    #44  <Method FragmentActivity GSAPI.access$1102(GSAPI, FragmentActivity)>
		//    8   18:pop             
		//    9   19:return          
		}

		public void onCreate(FragmentActivity fragmentactivity, Bundle bundle)
		{
			if(GSAPI.access$1100(GSAPI.this) != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field GSAPI this$0>
		//*   2    4:invokestatic    #52  <Method FragmentActivity GSAPI.access$1100(GSAPI)>
		//*   3    7:ifnull          21
				showProgress(Boolean.valueOf(false));
		//    4   10:aload_0         
		//    5   11:getfield        #21  <Field GSAPI this$0>
		//    6   14:iconst_0        
		//    7   15:invokestatic    #58  <Method Boolean Boolean.valueOf(boolean)>
		//    8   18:invokevirtual   #61  <Method void GSAPI.showProgress(Boolean)>
			GSAPI.access$1102(GSAPI.this, fragmentactivity);
		//    9   21:aload_0         
		//   10   22:getfield        #21  <Field GSAPI this$0>
		//   11   25:aload_1         
		//   12   26:invokestatic    #44  <Method FragmentActivity GSAPI.access$1102(GSAPI, FragmentActivity)>
		//   13   29:pop             
			FragmentActivity fragmentactivity1;
			bundle = ((Bundle) (GSAPI.this));
		//   14   30:aload_0         
		//   15   31:getfield        #21  <Field GSAPI this$0>
		//   16   34:astore_2        
			fragmentactivity1 = GSAPI.access$1100(GSAPI.this);
		//   17   35:aload_0         
		//   18   36:getfield        #21  <Field GSAPI this$0>
		//   19   39:invokestatic    #52  <Method FragmentActivity GSAPI.access$1100(GSAPI)>
		//   20   42:astore_3        
			if(text == null || text.equals("")) goto _L2; else goto _L1
		//   21   43:aload_0         
		//   22   44:getfield        #23  <Field String val$text>
		//   23   47:ifnull          104
		//   24   50:aload_0         
		//   25   51:getfield        #23  <Field String val$text>
		//   26   54:ldc1            #63  <String "">
		//   27   56:invokevirtual   #69  <Method boolean String.equals(Object)>
		//   28   59:ifne            104
_L1:
			fragmentactivity = ((FragmentActivity) (text));
		//   29   62:aload_0         
		//   30   63:getfield        #23  <Field String val$text>
		//   31   66:astore_1        
		//*  32   67:goto            70
_L4:
			try
			{
				GSAPI.access$1202(((GSAPI) (bundle)), ProgressDialog.show(((android.content.Context) (fragmentactivity1)), "", ((CharSequence) (fragmentactivity)), true));
		//   33   70:aload_2         
		//   34   71:aload_3         
		//   35   72:ldc1            #63  <String "">
		//   36   74:aload_1         
		//   37   75:iconst_1        
		//   38   76:invokestatic    #73  <Method ProgressDialog ProgressDialog.show(android.content.Context, CharSequence, CharSequence, boolean)>
		//   39   79:invokestatic    #77  <Method ProgressDialog GSAPI.access$1202(GSAPI, ProgressDialog)>
		//   40   82:pop             
				GSAPI.access$1200(GSAPI.this).setOnKeyListener(((android.content.DialogInterface.OnKeyListener) (new GSAPI._cls16._cls1())));
		//   41   83:aload_0         
		//   42   84:getfield        #21  <Field GSAPI this$0>
		//   43   87:invokestatic    #35  <Method ProgressDialog GSAPI.access$1200(GSAPI)>
		//   44   90:new             #13  <Class GSAPI$16$1>
		//   45   93:dup             
		//   46   94:aload_0         
		//   47   95:invokespecial   #80  <Method void GSAPI$16$1(GSAPI$16)>
		//   48   98:invokevirtual   #84  <Method void ProgressDialog.setOnKeyListener(android.content.DialogInterface$OnKeyListener)>
				return;
		//   49  101:return          
			}
			// Misplaced declaration of an exception variable
			catch(FragmentActivity fragmentactivity)
		//*  50  102:astore_1        
			{
				return;
		//   51  103:return          
			}
_L2:
			fragmentactivity = "Please wait...";
		//   52  104:ldc1            #86  <String "Please wait...">
		//   53  106:astore_1        
			if(true) goto _L4; else goto _L3
		//   54  107:goto            70
_L3:
		}

		public void onResume(FragmentActivity fragmentactivity)
		{
		//    0    0:return          
		}

		public void onStart(FragmentActivity fragmentactivity)
		{
		//    0    0:return          
		}

		final GSAPI this$0;
		final String val$text;

			
			{
				this$0 = final_gsapi;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field GSAPI this$0>
				text = String.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field String val$text>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
	}

}
