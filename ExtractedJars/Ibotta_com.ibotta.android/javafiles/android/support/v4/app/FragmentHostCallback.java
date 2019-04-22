// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
import android.content.*;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.util.Preconditions;
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
	//    1    1:invokespecial   #22  <Method void FragmentContainer()>
		mFragmentManager = new FragmentManagerImpl();
	//    2    4:aload_0         
	//    3    5:new             #24  <Class FragmentManagerImpl>
	//    4    8:dup             
	//    5    9:invokespecial   #25  <Method void FragmentManagerImpl()>
	//    6   12:putfield        #27  <Field FragmentManagerImpl mFragmentManager>
		mActivity = activity;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #29  <Field Activity mActivity>
		mContext = (Context)Preconditions.checkNotNull(((Object) (context)), "context == null");
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:ldc1            #31  <String "context == null">
	//   13   24:invokestatic    #37  <Method Object Preconditions.checkNotNull(Object, Object)>
	//   14   27:checkcast       #39  <Class Context>
	//   15   30:putfield        #41  <Field Context mContext>
		mHandler = (Handler)Preconditions.checkNotNull(((Object) (handler)), "handler == null");
	//   16   33:aload_0         
	//   17   34:aload_3         
	//   18   35:ldc1            #43  <String "handler == null">
	//   19   37:invokestatic    #37  <Method Object Preconditions.checkNotNull(Object, Object)>
	//   20   40:checkcast       #45  <Class Handler>
	//   21   43:putfield        #47  <Field Handler mHandler>
		mWindowAnimations = i;
	//   22   46:aload_0         
	//   23   47:iload           4
	//   24   49:putfield        #49  <Field int mWindowAnimations>
	//   25   52:return          
	}

	FragmentHostCallback(FragmentActivity fragmentactivity)
	{
		this(((Activity) (fragmentactivity)), ((Context) (fragmentactivity)), fragmentactivity.mHandler, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:aload_1         
	//    4    4:getfield        #55  <Field Handler FragmentActivity.mHandler>
	//    5    7:iconst_0        
	//    6    8:invokespecial   #57  <Method void FragmentHostCallback(Activity, Context, Handler, int)>
	//    7   11:return          
	}

	Activity getActivity()
	{
		return mActivity;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Activity mActivity>
	//    2    4:areturn         
	}

	Context getContext()
	{
		return mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Context mContext>
	//    2    4:areturn         
	}

	FragmentManagerImpl getFragmentManagerImpl()
	{
		return mFragmentManager;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field FragmentManagerImpl mFragmentManager>
	//    2    4:areturn         
	}

	Handler getHandler()
	{
		return mHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Handler mHandler>
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
	//    1    1:getfield        #41  <Field Context mContext>
	//    2    4:invokestatic    #82  <Method LayoutInflater LayoutInflater.from(Context)>
	//    3    7:areturn         
	}

	public int onGetWindowAnimations()
	{
		return mWindowAnimations;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int mWindowAnimations>
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

	public void onStartActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle)
	{
		if(i == -1)
	//*   0    0:iload_3         
	//*   1    1:iconst_m1       
	//*   2    2:icmpne          14
		{
			mContext.startActivity(intent);
	//    3    5:aload_0         
	//    4    6:getfield        #41  <Field Context mContext>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #99  <Method void Context.startActivity(Intent)>
			return;
	//    7   13:return          
		} else
		{
			throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
	//    8   14:new             #101 <Class IllegalStateException>
	//    9   17:dup             
	//   10   18:ldc1            #103 <String "Starting activity with a requestCode requires a FragmentActivity host">
	//   11   20:invokespecial   #106 <Method void IllegalStateException(String)>
	//   12   23:athrow          
		}
	}

	public void onStartIntentSenderFromFragment(Fragment fragment, IntentSender intentsender, int i, Intent intent, int j, int k, int l, 
			Bundle bundle)
		throws android.content.IntentSender.SendIntentException
	{
		if(i == -1)
	//*   0    0:iload_3         
	//*   1    1:iconst_m1       
	//*   2    2:icmpne          25
		{
			ActivityCompat.startIntentSenderForResult(mActivity, intentsender, i, intent, j, k, l, bundle);
	//    3    5:aload_0         
	//    4    6:getfield        #29  <Field Activity mActivity>
	//    5    9:aload_2         
	//    6   10:iload_3         
	//    7   11:aload           4
	//    8   13:iload           5
	//    9   15:iload           6
	//   10   17:iload           7
	//   11   19:aload           8
	//   12   21:invokestatic    #116 <Method void ActivityCompat.startIntentSenderForResult(Activity, IntentSender, int, Intent, int, int, int, Bundle)>
			return;
	//   13   24:return          
		} else
		{
			throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
	//   14   25:new             #101 <Class IllegalStateException>
	//   15   28:dup             
	//   16   29:ldc1            #118 <String "Starting intent sender with a requestCode requires a FragmentActivity host">
	//   17   31:invokespecial   #106 <Method void IllegalStateException(String)>
	//   18   34:athrow          
		}
	}

	public void onSupportInvalidateOptionsMenu()
	{
	//    0    0:return          
	}

	private final Activity mActivity;
	private final Context mContext;
	final FragmentManagerImpl mFragmentManager;
	private final Handler mHandler;
	private final int mWindowAnimations;
}
