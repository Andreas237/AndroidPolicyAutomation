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
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.gestures.GestureObserver;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;

// Referenced classes of package com.facebook.internal:
//			NativeProtocol, WebDialog, Utility, FacebookWebFallbackDialog

public class FacebookDialogFragment extends DialogFragment
	implements TraceFieldInterface
{

	public FacebookDialogFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void DialogFragment()>
	//    2    4:return          
	}

	private void onCompleteWebDialog(Bundle bundle, FacebookException facebookexception)
	{
		FragmentActivity fragmentactivity = getActivity();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #36  <Method FragmentActivity getActivity()>
	//    2    4:astore          4
		bundle = ((Bundle) (NativeProtocol.createProtocolResultIntent(fragmentactivity.getIntent(), bundle, facebookexception)));
	//    3    6:aload           4
	//    4    8:invokevirtual   #42  <Method Intent FragmentActivity.getIntent()>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokestatic    #48  <Method Intent NativeProtocol.createProtocolResultIntent(Intent, Bundle, FacebookException)>
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
	//   19   32:invokevirtual   #52  <Method void FragmentActivity.setResult(int, Intent)>
		fragmentactivity.finish();
	//   20   35:aload           4
	//   21   37:invokevirtual   #55  <Method void FragmentActivity.finish()>
	//   22   40:return          
	}

	private void onCompleteWebFallbackDialog(Bundle bundle)
	{
		FragmentActivity fragmentactivity = getActivity();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #36  <Method FragmentActivity getActivity()>
	//    2    4:astore_3        
		Intent intent = new Intent();
	//    3    5:new             #57  <Class Intent>
	//    4    8:dup             
	//    5    9:invokespecial   #58  <Method void Intent()>
	//    6   12:astore          4
		Bundle bundle1 = bundle;
	//    7   14:aload_1         
	//    8   15:astore_2        
		if(bundle == null)
	//*   9   16:aload_1         
	//*  10   17:ifnonnull       28
			bundle1 = new Bundle();
	//   11   20:new             #60  <Class Bundle>
	//   12   23:dup             
	//   13   24:invokespecial   #61  <Method void Bundle()>
	//   14   27:astore_2        
		intent.putExtras(bundle1);
	//   15   28:aload           4
	//   16   30:aload_2         
	//   17   31:invokevirtual   #65  <Method Intent Intent.putExtras(Bundle)>
	//   18   34:pop             
		fragmentactivity.setResult(-1, intent);
	//   19   35:aload_3         
	//   20   36:iconst_m1       
	//   21   37:aload           4
	//   22   39:invokevirtual   #52  <Method void FragmentActivity.setResult(int, Intent)>
		fragmentactivity.finish();
	//   23   42:aload_3         
	//   24   43:invokevirtual   #55  <Method void FragmentActivity.finish()>
	//   25   46:return          
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #69  <Method void DialogFragment.onConfigurationChanged(Configuration)>
		if((dialog instanceof WebDialog) && isResumed())
	//*   3    5:aload_0         
	//*   4    6:getfield        #71  <Field Dialog dialog>
	//*   5    9:instanceof      #73  <Class WebDialog>
	//*   6   12:ifeq            32
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #77  <Method boolean isResumed()>
	//*   9   19:ifeq            32
			((WebDialog)dialog).resize();
	//   10   22:aload_0         
	//   11   23:getfield        #71  <Field Dialog dialog>
	//   12   26:checkcast       #73  <Class WebDialog>
	//   13   29:invokevirtual   #80  <Method void WebDialog.resize()>
	//   14   32:return          
	}

	public void onCreate(Bundle bundle)
	{
		TraceMachine.startTracing("FacebookDialogFragment");
	//    0    0:ldc1            #85  <String "FacebookDialogFragment">
	//    1    2:invokestatic    #91  <Method void TraceMachine.startTracing(String)>
		TraceMachine.enterMethod(_nr_trace, "FacebookDialogFragment#onCreate", ((java.util.ArrayList) (null)));
	//    2    5:aload_0         
	//    3    6:getfield        #93  <Field Trace _nr_trace>
	//    4    9:ldc1            #95  <String "FacebookDialogFragment#onCreate">
	//    5   11:aconst_null     
	//    6   12:invokestatic    #99  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
		  goto _L1
	//*   7   15:goto            25
_L3:
		TraceMachine.enterMethod(((Trace) (null)), "FacebookDialogFragment#onCreate", ((java.util.ArrayList) (null)));
	//    8   18:aconst_null     
	//    9   19:ldc1            #95  <String "FacebookDialogFragment#onCreate">
	//   10   21:aconst_null     
	//   11   22:invokestatic    #99  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
		super.onCreate(bundle);
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:invokespecial   #101 <Method void DialogFragment.onCreate(Bundle)>
		if(dialog == null)
	//*  15   30:aload_0         
	//*  16   31:getfield        #71  <Field Dialog dialog>
	//*  17   34:ifnonnull       191
		{
			bundle = ((Bundle) (getActivity()));
	//   18   37:aload_0         
	//   19   38:invokevirtual   #36  <Method FragmentActivity getActivity()>
	//   20   41:astore_1        
			Bundle bundle1 = NativeProtocol.getMethodArgumentsFromIntent(((FragmentActivity) (bundle)).getIntent());
	//   21   42:aload_1         
	//   22   43:invokevirtual   #42  <Method Intent FragmentActivity.getIntent()>
	//   23   46:invokestatic    #105 <Method Bundle NativeProtocol.getMethodArgumentsFromIntent(Intent)>
	//   24   49:astore_3        
			if(!bundle1.getBoolean("is_fallback", false))
	//*  25   50:aload_3         
	//*  26   51:ldc1            #107 <String "is_fallback">
	//*  27   53:iconst_0        
	//*  28   54:invokevirtual   #111 <Method boolean Bundle.getBoolean(String, boolean)>
	//*  29   57:ifne            124
			{
				String s = bundle1.getString("action");
	//   30   60:aload_3         
	//   31   61:ldc1            #113 <String "action">
	//   32   63:invokevirtual   #117 <Method String Bundle.getString(String)>
	//   33   66:astore_2        
				bundle1 = bundle1.getBundle("params");
	//   34   67:aload_3         
	//   35   68:ldc1            #119 <String "params">
	//   36   70:invokevirtual   #123 <Method Bundle Bundle.getBundle(String)>
	//   37   73:astore_3        
				if(Utility.isNullOrEmpty(s))
	//*  38   74:aload_2         
	//*  39   75:invokestatic    #129 <Method boolean Utility.isNullOrEmpty(String)>
	//*  40   78:ifeq            96
				{
					Utility.logd("FacebookDialogFragment", "Cannot start a WebDialog with an empty/missing 'actionName'");
	//   41   81:ldc1            #85  <String "FacebookDialogFragment">
	//   42   83:ldc1            #131 <String "Cannot start a WebDialog with an empty/missing 'actionName'">
	//   43   85:invokestatic    #135 <Method void Utility.logd(String, String)>
					((FragmentActivity) (bundle)).finish();
	//   44   88:aload_1         
	//   45   89:invokevirtual   #55  <Method void FragmentActivity.finish()>
					TraceMachine.exitMethod();
	//   46   92:invokestatic    #138 <Method void TraceMachine.exitMethod()>
					return;
	//   47   95:return          
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
	//   48   96:new             #140 <Class WebDialog$Builder>
	//   49   99:dup             
	//   50  100:aload_1         
	//   51  101:aload_2         
	//   52  102:aload_3         
	//   53  103:invokespecial   #143 <Method void WebDialog$Builder(android.content.Context, String, Bundle)>
	//   54  106:new             #8   <Class FacebookDialogFragment$1>
	//   55  109:dup             
	//   56  110:aload_0         
	//   57  111:invokespecial   #146 <Method void FacebookDialogFragment$1(FacebookDialogFragment)>
	//   58  114:invokevirtual   #150 <Method WebDialog$Builder WebDialog$Builder.setOnCompleteListener(WebDialog$OnCompleteListener)>
	//   59  117:invokevirtual   #154 <Method WebDialog WebDialog$Builder.build()>
	//   60  120:astore_1        
			} else
	//*  61  121:goto            186
			{
				String s1 = bundle1.getString("url");
	//   62  124:aload_3         
	//   63  125:ldc1            #156 <String "url">
	//   64  127:invokevirtual   #117 <Method String Bundle.getString(String)>
	//   65  130:astore_2        
				if(Utility.isNullOrEmpty(s1))
	//*  66  131:aload_2         
	//*  67  132:invokestatic    #129 <Method boolean Utility.isNullOrEmpty(String)>
	//*  68  135:ifeq            153
				{
					Utility.logd("FacebookDialogFragment", "Cannot start a fallback WebDialog with an empty/missing 'url'");
	//   69  138:ldc1            #85  <String "FacebookDialogFragment">
	//   70  140:ldc1            #158 <String "Cannot start a fallback WebDialog with an empty/missing 'url'">
	//   71  142:invokestatic    #135 <Method void Utility.logd(String, String)>
					((FragmentActivity) (bundle)).finish();
	//   72  145:aload_1         
	//   73  146:invokevirtual   #55  <Method void FragmentActivity.finish()>
					TraceMachine.exitMethod();
	//   74  149:invokestatic    #138 <Method void TraceMachine.exitMethod()>
					return;
	//   75  152:return          
				}
				bundle = ((Bundle) (FacebookWebFallbackDialog.newInstance(((android.content.Context) (bundle)), s1, String.format("fb%s://bridge/", new Object[] {
					FacebookSdk.getApplicationId()
				}))));
	//   76  153:aload_1         
	//   77  154:aload_2         
	//   78  155:ldc1            #160 <String "fb%s://bridge/">
	//   79  157:iconst_1        
	//   80  158:anewarray       Object[]
	//   81  161:dup             
	//   82  162:iconst_0        
	//   83  163:invokestatic    #168 <Method String FacebookSdk.getApplicationId()>
	//   84  166:aastore         
	//   85  167:invokestatic    #174 <Method String String.format(String, Object[])>
	//   86  170:invokestatic    #180 <Method FacebookWebFallbackDialog FacebookWebFallbackDialog.newInstance(android.content.Context, String, String)>
	//   87  173:astore_1        
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
	//   88  174:aload_1         
	//   89  175:new             #10  <Class FacebookDialogFragment$2>
	//   90  178:dup             
	//   91  179:aload_0         
	//   92  180:invokespecial   #181 <Method void FacebookDialogFragment$2(FacebookDialogFragment)>
	//   93  183:invokevirtual   #184 <Method void WebDialog.setOnCompleteListener(WebDialog$OnCompleteListener)>
			}
			dialog = ((Dialog) (bundle));
	//   94  186:aload_0         
	//   95  187:aload_1         
	//   96  188:putfield        #71  <Field Dialog dialog>
		}
		TraceMachine.exitMethod();
	//   97  191:invokestatic    #138 <Method void TraceMachine.exitMethod()>
		return;
	//   98  194:return          
		NoSuchFieldError nosuchfielderror;
		nosuchfielderror;
	//   99  195:astore_2        
		if(true) goto _L3; else goto _L2
_L2:
	//* 100  196:goto            18
	}

	public Dialog onCreateDialog(Bundle bundle)
	{
		if(dialog == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field Dialog dialog>
	//*   2    4:ifnonnull       18
		{
			onCompleteWebDialog(((Bundle) (null)), ((FacebookException) (null)));
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:aconst_null     
	//    6   10:invokespecial   #26  <Method void onCompleteWebDialog(Bundle, FacebookException)>
			setShowsDialog(false);
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:invokevirtual   #191 <Method void setShowsDialog(boolean)>
		}
		return dialog;
	//   10   18:aload_0         
	//   11   19:getfield        #71  <Field Dialog dialog>
	//   12   22:areturn         
	}

	public void onDestroyView()
	{
		if(getDialog() != null && getRetainInstance())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #197 <Method Dialog getDialog()>
	//*   2    4:ifnull          22
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #200 <Method boolean getRetainInstance()>
	//*   5   11:ifeq            22
			getDialog().setDismissMessage(((android.os.Message) (null)));
	//    6   14:aload_0         
	//    7   15:invokevirtual   #197 <Method Dialog getDialog()>
	//    8   18:aconst_null     
	//    9   19:invokevirtual   #206 <Method void Dialog.setDismissMessage(android.os.Message)>
		super.onDestroyView();
	//   10   22:aload_0         
	//   11   23:invokespecial   #208 <Method void DialogFragment.onDestroyView()>
	//   12   26:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #211 <Method void DialogFragment.onResume()>
		Dialog dialog1 = dialog;
	//    2    4:aload_0         
	//    3    5:getfield        #71  <Field Dialog dialog>
	//    4    8:astore_1        
		if(dialog1 instanceof WebDialog)
	//*   5    9:aload_1         
	//*   6   10:instanceof      #73  <Class WebDialog>
	//*   7   13:ifeq            23
			((WebDialog)dialog1).resize();
	//    8   16:aload_1         
	//    9   17:checkcast       #73  <Class WebDialog>
	//   10   20:invokevirtual   #80  <Method void WebDialog.resize()>
	//   11   23:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #214 <Method void DialogFragment.onStart()>
		GestureObserver.getInstance().onActivityOrFragmentStarted(((Object) (this)));
	//    2    4:invokestatic    #220 <Method GestureObserver GestureObserver.getInstance()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #224 <Method void GestureObserver.onActivityOrFragmentStarted(Object)>
	//    5   11:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #227 <Method void DialogFragment.onStop()>
		GestureObserver.getInstance().onActivityOrFragmentStopped(((Object) (this)));
	//    2    4:invokestatic    #220 <Method GestureObserver GestureObserver.getInstance()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #230 <Method void GestureObserver.onActivityOrFragmentStopped(Object)>
	//    5   11:return          
	}

	public void setDialog(Dialog dialog1)
	{
		dialog = dialog1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #71  <Field Dialog dialog>
	//    3    5:return          
	}

	public Trace _nr_trace;
	private Dialog dialog;


/*
	static void access$000(FacebookDialogFragment facebookdialogfragment, Bundle bundle, FacebookException facebookexception)
	{
		facebookdialogfragment.onCompleteWebDialog(bundle, facebookexception);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #26  <Method void onCompleteWebDialog(Bundle, FacebookException)>
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
	//    2    2:invokespecial   #32  <Method void onCompleteWebFallbackDialog(Bundle)>
		return;
	//    3    5:return          
	}

*/
}
