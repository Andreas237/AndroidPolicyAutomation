// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
import android.content.*;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//			FragmentContainer, FragmentManagerImpl, FragmentActivity, ActivityCompat, 
//			Fragment

public abstract class FragmentHostCallback extends FragmentContainer
{

	FragmentHostCallback(Activity activity, Context context, Handler handler, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void FragmentContainer()>
		mFragmentManager = new FragmentManagerImpl();
	//    2    4:aload_0         
	//    3    5:new             #22  <Class FragmentManagerImpl>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void FragmentManagerImpl()>
	//    6   12:putfield        #25  <Field FragmentManagerImpl mFragmentManager>
		mActivity = activity;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #27  <Field Activity mActivity>
		mContext = context;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #29  <Field Context mContext>
		mHandler = handler;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #31  <Field Handler mHandler>
		mWindowAnimations = i;
	//   16   30:aload_0         
	//   17   31:iload           4
	//   18   33:putfield        #33  <Field int mWindowAnimations>
	//   19   36:return          
	}

	public FragmentHostCallback(Context context, Handler handler, int i)
	{
		Activity activity;
		if(context instanceof Activity)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #37  <Class Activity>
	//*   2    4:ifeq            16
			activity = (Activity)context;
	//    3    7:aload_1         
	//    4    8:checkcast       #37  <Class Activity>
	//    5   11:astore          4
		else
	//*   6   13:goto            19
			activity = null;
	//    7   16:aconst_null     
	//    8   17:astore          4
		this(activity, context, handler, i);
	//    9   19:aload_0         
	//   10   20:aload           4
	//   11   22:aload_1         
	//   12   23:aload_2         
	//   13   24:iload_3         
	//   14   25:invokespecial   #39  <Method void FragmentHostCallback(Activity, Context, Handler, int)>
	//   15   28:return          
	}

	FragmentHostCallback(FragmentActivity fragmentactivity)
	{
		this(((Activity) (fragmentactivity)), ((Context) (fragmentactivity)), fragmentactivity.mHandler, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:aload_1         
	//    4    4:getfield        #43  <Field Handler FragmentActivity.mHandler>
	//    5    7:iconst_0        
	//    6    8:invokespecial   #39  <Method void FragmentHostCallback(Activity, Context, Handler, int)>
	//    7   11:return          
	}

	Activity getActivity()
	{
		return mActivity;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Activity mActivity>
	//    2    4:areturn         
	}

	Context getContext()
	{
		return mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Context mContext>
	//    2    4:areturn         
	}

	FragmentManagerImpl getFragmentManagerImpl()
	{
		return mFragmentManager;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field FragmentManagerImpl mFragmentManager>
	//    2    4:areturn         
	}

	Handler getHandler()
	{
		return mHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Handler mHandler>
	//    2    4:areturn         
	}

	void onAttachFragment(Fragment fragment)
	{
	//    0    0:return          
	}

	public void onDump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
	//    0    0:return          
	}

	public View onFindViewById(int i)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public abstract Object onGetHost();

	public LayoutInflater onGetLayoutInflater()
	{
		return LayoutInflater.from(mContext);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Context mContext>
	//    2    4:invokestatic    #70  <Method LayoutInflater LayoutInflater.from(Context)>
	//    3    7:areturn         
	}

	public int onGetWindowAnimations()
	{
		return mWindowAnimations;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int mWindowAnimations>
	//    2    4:ireturn         
	}

	public boolean onHasView()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean onHasWindowAnimations()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void onRequestPermissionsFromFragment(Fragment fragment, String as[], int i)
	{
	//    0    0:return          
	}

	public boolean onShouldSaveFragmentState(Fragment fragment)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean onShouldShowRequestPermissionRationale(String s)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void onStartActivityFromFragment(Fragment fragment, Intent intent, int i)
	{
		onStartActivityFromFragment(fragment, intent, i, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aconst_null     
	//    5    5:invokevirtual   #87  <Method void onStartActivityFromFragment(Fragment, Intent, int, Bundle)>
	//    6    8:return          
	}

	public void onStartActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle)
	{
		if(i != -1)
	//*   0    0:iload_3         
	//*   1    1:iconst_m1       
	//*   2    2:icmpeq          15
		{
			throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
	//    3    5:new             #89  <Class IllegalStateException>
	//    4    8:dup             
	//    5    9:ldc1            #91  <String "Starting activity with a requestCode requires a FragmentActivity host">
	//    6   11:invokespecial   #94  <Method void IllegalStateException(String)>
	//    7   14:athrow          
		} else
		{
			mContext.startActivity(intent);
	//    8   15:aload_0         
	//    9   16:getfield        #29  <Field Context mContext>
	//   10   19:aload_2         
	//   11   20:invokevirtual   #100 <Method void Context.startActivity(Intent)>
			return;
	//   12   23:return          
		}
	}

	public void onStartIntentSenderFromFragment(Fragment fragment, IntentSender intentsender, int i, Intent intent, int j, int k, int l, 
			Bundle bundle)
		throws android.content.IntentSender.SendIntentException
	{
		if(i != -1)
	//*   0    0:iload_3         
	//*   1    1:iconst_m1       
	//*   2    2:icmpeq          15
		{
			throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
	//    3    5:new             #89  <Class IllegalStateException>
	//    4    8:dup             
	//    5    9:ldc1            #106 <String "Starting intent sender with a requestCode requires a FragmentActivity host">
	//    6   11:invokespecial   #94  <Method void IllegalStateException(String)>
	//    7   14:athrow          
		} else
		{
			ActivityCompat.startIntentSenderForResult(mActivity, intentsender, i, intent, j, k, l, bundle);
	//    8   15:aload_0         
	//    9   16:getfield        #27  <Field Activity mActivity>
	//   10   19:aload_2         
	//   11   20:iload_3         
	//   12   21:aload           4
	//   13   23:iload           5
	//   14   25:iload           6
	//   15   27:iload           7
	//   16   29:aload           8
	//   17   31:invokestatic    #112 <Method void ActivityCompat.startIntentSenderForResult(Activity, IntentSender, int, Intent, int, int, int, Bundle)>
			return;
	//   18   34:return          
		}
	}

	public void onSupportInvalidateOptionsMenu()
	{
	//    0    0:return          
	}

	private final Activity mActivity;
	final Context mContext;
	final FragmentManagerImpl mFragmentManager;
	private final Handler mHandler;
	final int mWindowAnimations;
}
