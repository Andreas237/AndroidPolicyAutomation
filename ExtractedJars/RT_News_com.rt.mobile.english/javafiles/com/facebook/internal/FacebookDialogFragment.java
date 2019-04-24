// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;

// Referenced classes of package com.facebook.internal:
//			NativeProtocol, WebDialog, Utility, FacebookWebFallbackDialog

public class FacebookDialogFragment extends DialogFragment
{

	public FacebookDialogFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void DialogFragment()>
	//    2    4:return          
	}

	private void onCompleteWebDialog(Bundle bundle, FacebookException facebookexception)
	{
		FragmentActivity fragmentactivity = getActivity();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #35  <Method FragmentActivity getActivity()>
	//    2    4:astore          4
		bundle = ((Bundle) (NativeProtocol.createProtocolResultIntent(fragmentactivity.getIntent(), bundle, facebookexception)));
	//    3    6:aload           4
	//    4    8:invokevirtual   #41  <Method Intent FragmentActivity.getIntent()>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokestatic    #47  <Method Intent NativeProtocol.createProtocolResultIntent(Intent, Bundle, FacebookException)>
	//    8   16:astore_1        
		byte byte0;
		if(facebookexception == null)
	//*   9   17:aload_2         
	//*  10   18:ifnonnull       26
			byte0 = -1;
	//   11   21:iconst_m1       
	//   12   22:istore_3        
		else
	//*  13   23:goto            28
			byte0 = 0;
	//   14   26:iconst_0        
	//   15   27:istore_3        
		fragmentactivity.setResult(((int) (byte0)), ((Intent) (bundle)));
	//   16   28:aload           4
	//   17   30:iload_3         
	//   18   31:aload_1         
	//   19   32:invokevirtual   #51  <Method void FragmentActivity.setResult(int, Intent)>
		fragmentactivity.finish();
	//   20   35:aload           4
	//   21   37:invokevirtual   #54  <Method void FragmentActivity.finish()>
	//   22   40:return          
	}

	private void onCompleteWebFallbackDialog(Bundle bundle)
	{
		FragmentActivity fragmentactivity = getActivity();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #35  <Method FragmentActivity getActivity()>
	//    2    4:astore_3        
		Intent intent = new Intent();
	//    3    5:new             #56  <Class Intent>
	//    4    8:dup             
	//    5    9:invokespecial   #57  <Method void Intent()>
	//    6   12:astore          4
		Bundle bundle1 = bundle;
	//    7   14:aload_1         
	//    8   15:astore_2        
		if(bundle == null)
	//*   9   16:aload_1         
	//*  10   17:ifnonnull       28
			bundle1 = new Bundle();
	//   11   20:new             #59  <Class Bundle>
	//   12   23:dup             
	//   13   24:invokespecial   #60  <Method void Bundle()>
	//   14   27:astore_2        
		intent.putExtras(bundle1);
	//   15   28:aload           4
	//   16   30:aload_2         
	//   17   31:invokevirtual   #64  <Method Intent Intent.putExtras(Bundle)>
	//   18   34:pop             
		fragmentactivity.setResult(-1, intent);
	//   19   35:aload_3         
	//   20   36:iconst_m1       
	//   21   37:aload           4
	//   22   39:invokevirtual   #51  <Method void FragmentActivity.setResult(int, Intent)>
		fragmentactivity.finish();
	//   23   42:aload_3         
	//   24   43:invokevirtual   #54  <Method void FragmentActivity.finish()>
	//   25   46:return          
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #68  <Method void DialogFragment.onConfigurationChanged(Configuration)>
		if(dialog instanceof WebDialog)
	//*   3    5:aload_0         
	//*   4    6:getfield        #70  <Field Dialog dialog>
	//*   5    9:instanceof      #72  <Class WebDialog>
	//*   6   12:ifeq            25
			((WebDialog)dialog).resize();
	//    7   15:aload_0         
	//    8   16:getfield        #70  <Field Dialog dialog>
	//    9   19:checkcast       #72  <Class WebDialog>
	//   10   22:invokevirtual   #75  <Method void WebDialog.resize()>
	//   11   25:return          
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #78  <Method void DialogFragment.onCreate(Bundle)>
		if(dialog == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #70  <Field Dialog dialog>
	//*   5    9:ifnonnull       164
		{
			bundle = ((Bundle) (getActivity()));
	//    6   12:aload_0         
	//    7   13:invokevirtual   #35  <Method FragmentActivity getActivity()>
	//    8   16:astore_1        
			Bundle bundle1 = NativeProtocol.getMethodArgumentsFromIntent(((FragmentActivity) (bundle)).getIntent());
	//    9   17:aload_1         
	//   10   18:invokevirtual   #41  <Method Intent FragmentActivity.getIntent()>
	//   11   21:invokestatic    #82  <Method Bundle NativeProtocol.getMethodArgumentsFromIntent(Intent)>
	//   12   24:astore_3        
			if(!bundle1.getBoolean("is_fallback", false))
	//*  13   25:aload_3         
	//*  14   26:ldc1            #84  <String "is_fallback">
	//*  15   28:iconst_0        
	//*  16   29:invokevirtual   #88  <Method boolean Bundle.getBoolean(String, boolean)>
	//*  17   32:ifne            96
			{
				String s = bundle1.getString("action");
	//   18   35:aload_3         
	//   19   36:ldc1            #90  <String "action">
	//   20   38:invokevirtual   #94  <Method String Bundle.getString(String)>
	//   21   41:astore_2        
				bundle1 = bundle1.getBundle("params");
	//   22   42:aload_3         
	//   23   43:ldc1            #96  <String "params">
	//   24   45:invokevirtual   #100 <Method Bundle Bundle.getBundle(String)>
	//   25   48:astore_3        
				if(Utility.isNullOrEmpty(s))
	//*  26   49:aload_2         
	//*  27   50:invokestatic    #106 <Method boolean Utility.isNullOrEmpty(String)>
	//*  28   53:ifeq            68
				{
					Utility.logd("FacebookDialogFragment", "Cannot start a WebDialog with an empty/missing 'actionName'");
	//   29   56:ldc1            #12  <String "FacebookDialogFragment">
	//   30   58:ldc1            #108 <String "Cannot start a WebDialog with an empty/missing 'actionName'">
	//   31   60:invokestatic    #112 <Method void Utility.logd(String, String)>
					((FragmentActivity) (bundle)).finish();
	//   32   63:aload_1         
	//   33   64:invokevirtual   #54  <Method void FragmentActivity.finish()>
					return;
	//   34   67:return          
				}
				bundle = ((Bundle) ((new WebDialog.Builder(((android.content.Context) (bundle)), s, bundle1)).setOnCompleteListener(new WebDialog.OnCompleteListener() {

					public void onComplete(Bundle bundle2, FacebookException facebookexception)
					{
						onCompleteWebDialog(bundle2, facebookexception);
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field FacebookDialogFragment this$0>
					//    2    4:aload_1         
					//    3    5:aload_2         
					//    4    6:invokestatic    #27  <Method void FacebookDialogFragment.access$000(FacebookDialogFragment, Bundle, FacebookException)>
					//    5    9:return          
					}

					final FacebookDialogFragment this$0;

			
			{
				this$0 = FacebookDialogFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field FacebookDialogFragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
				}
).build()));
	//   35   68:new             #114 <Class WebDialog$Builder>
	//   36   71:dup             
	//   37   72:aload_1         
	//   38   73:aload_2         
	//   39   74:aload_3         
	//   40   75:invokespecial   #117 <Method void WebDialog$Builder(android.content.Context, String, Bundle)>
	//   41   78:new             #6   <Class FacebookDialogFragment$1>
	//   42   81:dup             
	//   43   82:aload_0         
	//   44   83:invokespecial   #120 <Method void FacebookDialogFragment$1(FacebookDialogFragment)>
	//   45   86:invokevirtual   #124 <Method WebDialog$Builder WebDialog$Builder.setOnCompleteListener(WebDialog$OnCompleteListener)>
	//   46   89:invokevirtual   #128 <Method WebDialog WebDialog$Builder.build()>
	//   47   92:astore_1        
			} else
	//*  48   93:goto            159
			{
				String s1 = bundle1.getString("url");
	//   49   96:aload_3         
	//   50   97:ldc1            #130 <String "url">
	//   51   99:invokevirtual   #94  <Method String Bundle.getString(String)>
	//   52  102:astore_2        
				if(Utility.isNullOrEmpty(s1))
	//*  53  103:aload_2         
	//*  54  104:invokestatic    #106 <Method boolean Utility.isNullOrEmpty(String)>
	//*  55  107:ifeq            122
				{
					Utility.logd("FacebookDialogFragment", "Cannot start a fallback WebDialog with an empty/missing 'url'");
	//   56  110:ldc1            #12  <String "FacebookDialogFragment">
	//   57  112:ldc1            #132 <String "Cannot start a fallback WebDialog with an empty/missing 'url'">
	//   58  114:invokestatic    #112 <Method void Utility.logd(String, String)>
					((FragmentActivity) (bundle)).finish();
	//   59  117:aload_1         
	//   60  118:invokevirtual   #54  <Method void FragmentActivity.finish()>
					return;
	//   61  121:return          
				}
				bundle = ((Bundle) (new FacebookWebFallbackDialog(((android.content.Context) (bundle)), s1, String.format("fb%s://bridge/", new Object[] {
					FacebookSdk.getApplicationId()
				}))));
	//   62  122:new             #134 <Class FacebookWebFallbackDialog>
	//   63  125:dup             
	//   64  126:aload_1         
	//   65  127:aload_2         
	//   66  128:ldc1            #136 <String "fb%s://bridge/">
	//   67  130:iconst_1        
	//   68  131:anewarray       Object[]
	//   69  134:dup             
	//   70  135:iconst_0        
	//   71  136:invokestatic    #144 <Method String FacebookSdk.getApplicationId()>
	//   72  139:aastore         
	//   73  140:invokestatic    #150 <Method String String.format(String, Object[])>
	//   74  143:invokespecial   #153 <Method void FacebookWebFallbackDialog(android.content.Context, String, String)>
	//   75  146:astore_1        
				((WebDialog) (bundle)).setOnCompleteListener(new WebDialog.OnCompleteListener() {

					public void onComplete(Bundle bundle2, FacebookException facebookexception)
					{
						onCompleteWebFallbackDialog(bundle2);
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field FacebookDialogFragment this$0>
					//    2    4:aload_1         
					//    3    5:invokestatic    #27  <Method void FacebookDialogFragment.access$100(FacebookDialogFragment, Bundle)>
					//    4    8:return          
					}

					final FacebookDialogFragment this$0;

			
			{
				this$0 = FacebookDialogFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field FacebookDialogFragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
				}
);
	//   76  147:aload_1         
	//   77  148:new             #8   <Class FacebookDialogFragment$2>
	//   78  151:dup             
	//   79  152:aload_0         
	//   80  153:invokespecial   #154 <Method void FacebookDialogFragment$2(FacebookDialogFragment)>
	//   81  156:invokevirtual   #157 <Method void WebDialog.setOnCompleteListener(WebDialog$OnCompleteListener)>
			}
			dialog = ((Dialog) (bundle));
	//   82  159:aload_0         
	//   83  160:aload_1         
	//   84  161:putfield        #70  <Field Dialog dialog>
		}
	//   85  164:return          
	}

	public Dialog onCreateDialog(Bundle bundle)
	{
		if(dialog == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field Dialog dialog>
	//*   2    4:ifnonnull       18
		{
			onCompleteWebDialog(((Bundle) (null)), ((FacebookException) (null)));
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:aconst_null     
	//    6   10:invokespecial   #25  <Method void onCompleteWebDialog(Bundle, FacebookException)>
			setShowsDialog(false);
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:invokevirtual   #164 <Method void setShowsDialog(boolean)>
		}
		return dialog;
	//   10   18:aload_0         
	//   11   19:getfield        #70  <Field Dialog dialog>
	//   12   22:areturn         
	}

	public void onDestroyView()
	{
		if(getDialog() != null && getRetainInstance())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #170 <Method Dialog getDialog()>
	//*   2    4:ifnull          22
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #174 <Method boolean getRetainInstance()>
	//*   5   11:ifeq            22
			getDialog().setDismissMessage(((android.os.Message) (null)));
	//    6   14:aload_0         
	//    7   15:invokevirtual   #170 <Method Dialog getDialog()>
	//    8   18:aconst_null     
	//    9   19:invokevirtual   #180 <Method void Dialog.setDismissMessage(android.os.Message)>
		super.onDestroyView();
	//   10   22:aload_0         
	//   11   23:invokespecial   #182 <Method void DialogFragment.onDestroyView()>
	//   12   26:return          
	}

	public void setDialog(Dialog dialog1)
	{
		dialog = dialog1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #70  <Field Dialog dialog>
	//    3    5:return          
	}

	public static final String TAG = "FacebookDialogFragment";
	private Dialog dialog;


/*
	static void access$000(FacebookDialogFragment facebookdialogfragment, Bundle bundle, FacebookException facebookexception)
	{
		facebookdialogfragment.onCompleteWebDialog(bundle, facebookexception);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #25  <Method void onCompleteWebDialog(Bundle, FacebookException)>
		return;
	//    4    6:return          
	}

*/


/*
	static void access$100(FacebookDialogFragment facebookdialogfragment, Bundle bundle)
	{
		facebookdialogfragment.onCompleteWebFallbackDialog(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #31  <Method void onCompleteWebFallbackDialog(Bundle)>
		return;
	//    3    5:return          
	}

*/
}
