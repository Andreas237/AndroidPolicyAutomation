// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.*;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//			FragmentHostCallback, FragmentActivity, ActivityCompat, Fragment

class FragmentActivity$HostCallbacks extends FragmentHostCallback
{

	public void onAttachFragment(Fragment fragment)
	{
		FragmentActivity.this.onAttachFragment(fragment);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentActivity this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #21  <Method void FragmentActivity.onAttachFragment(Fragment)>
	//    4    8:return          
	}

	public void onDump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		dump(s, filedescriptor, printwriter, as);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentActivity this$0>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #26  <Method void FragmentActivity.dump(String, FileDescriptor, PrintWriter, String[])>
	//    7   12:return          
	}

	public View onFindViewById(int i)
	{
		return findViewById(i);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentActivity this$0>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #31  <Method View FragmentActivity.findViewById(int)>
	//    4    8:areturn         
	}

	public FragmentActivity onGetHost()
	{
		return FragmentActivity.this;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentActivity this$0>
	//    2    4:areturn         
	}

	public volatile Object onGetHost()
	{
		return ((Object) (onGetHost()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #36  <Method FragmentActivity onGetHost()>
	//    2    4:areturn         
	}

	public LayoutInflater onGetLayoutInflater()
	{
		return getLayoutInflater().cloneInContext(((android.content.Context) (FragmentActivity.this)));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentActivity this$0>
	//    2    4:invokevirtual   #41  <Method LayoutInflater FragmentActivity.getLayoutInflater()>
	//    3    7:aload_0         
	//    4    8:getfield        #14  <Field FragmentActivity this$0>
	//    5   11:invokevirtual   #47  <Method LayoutInflater LayoutInflater.cloneInContext(android.content.Context)>
	//    6   14:areturn         
	}

	public int onGetWindowAnimations()
	{
		Window window = getWindow();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentActivity this$0>
	//    2    4:invokevirtual   #53  <Method Window FragmentActivity.getWindow()>
	//    3    7:astore_1        
		if(window == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       14
			return 0;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		else
			return window.getAttributes().windowAnimations;
	//    8   14:aload_1         
	//    9   15:invokevirtual   #59  <Method android.view.WindowManager$LayoutParams Window.getAttributes()>
	//   10   18:getfield        #65  <Field int android.view.WindowManager$LayoutParams.windowAnimations>
	//   11   21:ireturn         
	}

	public boolean onHasView()
	{
		Window window = getWindow();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentActivity this$0>
	//    2    4:invokevirtual   #53  <Method Window FragmentActivity.getWindow()>
	//    3    7:astore_1        
		return window != null && window.peekDecorView() != null;
	//    4    8:aload_1         
	//    5    9:ifnull          21
	//    6   12:aload_1         
	//    7   13:invokevirtual   #71  <Method View Window.peekDecorView()>
	//    8   16:ifnull          21
	//    9   19:iconst_1        
	//   10   20:ireturn         
	//   11   21:iconst_0        
	//   12   22:ireturn         
	}

	public boolean onHasWindowAnimations()
	{
		return getWindow() != null;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentActivity this$0>
	//    2    4:invokevirtual   #53  <Method Window FragmentActivity.getWindow()>
	//    3    7:ifnull          12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public void onRequestPermissionsFromFragment(Fragment fragment, String as[], int i)
	{
		requestPermissionsFromFragment(fragment, as, i);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentActivity this$0>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #77  <Method void FragmentActivity.requestPermissionsFromFragment(Fragment, String[], int)>
	//    6   10:return          
	}

	public boolean onShouldSaveFragmentState(Fragment fragment)
	{
		return isFinishing() ^ true;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentActivity this$0>
	//    2    4:invokevirtual   #82  <Method boolean FragmentActivity.isFinishing()>
	//    3    7:iconst_1        
	//    4    8:ixor            
	//    5    9:ireturn         
	}

	public boolean onShouldShowRequestPermissionRationale(String s)
	{
		return ActivityCompat.shouldShowRequestPermissionRationale(((android.app.Activity) (FragmentActivity.this)), s);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentActivity this$0>
	//    2    4:aload_1         
	//    3    5:invokestatic    #90  <Method boolean ActivityCompat.shouldShowRequestPermissionRationale(android.app.Activity, String)>
	//    4    8:ireturn         
	}

	public void onStartActivityFromFragment(Fragment fragment, Intent intent, int i)
	{
		startActivityFromFragment(fragment, intent, i);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentActivity this$0>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #95  <Method void FragmentActivity.startActivityFromFragment(Fragment, Intent, int)>
	//    6   10:return          
	}

	public void onStartActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle)
	{
		startActivityFromFragment(fragment, intent, i, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentActivity this$0>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #98  <Method void FragmentActivity.startActivityFromFragment(Fragment, Intent, int, Bundle)>
	//    7   12:return          
	}

	public void onStartIntentSenderFromFragment(Fragment fragment, IntentSender intentsender, int i, Intent intent, int j, int k, int l, 
			Bundle bundle)
	{
		startIntentSenderFromFragment(fragment, intentsender, i, intent, j, k, l, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentActivity this$0>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:iload           5
	//    7   11:iload           6
	//    8   13:iload           7
	//    9   15:aload           8
	//   10   17:invokevirtual   #103 <Method void FragmentActivity.startIntentSenderFromFragment(Fragment, IntentSender, int, Intent, int, int, int, Bundle)>
	//   11   20:return          
	}

	public void onSupportInvalidateOptionsMenu()
	{
		supportInvalidateOptionsMenu();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentActivity this$0>
	//    2    4:invokevirtual   #108 <Method void FragmentActivity.supportInvalidateOptionsMenu()>
	//    3    7:return          
	}

	final FragmentActivity this$0;

	public FragmentActivity$HostCallbacks()
	{
		this$0 = FragmentActivity.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field FragmentActivity this$0>
		super(FragmentActivity.this);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #16  <Method void FragmentHostCallback(FragmentActivity)>
	//    6   10:return          
	}
}
