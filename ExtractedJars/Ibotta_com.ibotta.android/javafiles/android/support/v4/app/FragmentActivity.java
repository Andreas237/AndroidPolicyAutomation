// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.arch.lifecycle.*;
import android.content.*;
import android.content.res.Configuration;
import android.os.*;
import android.support.v4.util.SparseArrayCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.*;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package android.support.v4.app:
//			SupportActivity, FragmentController, Fragment, FragmentManager, 
//			LoaderManager, ActivityCompat, SharedElementCallback, FragmentHostCallback, 
//			FragmentManagerNonConfig

public class FragmentActivity extends SupportActivity
	implements ViewModelStoreOwner, ActivityCompat.OnRequestPermissionsResultCallback, ActivityCompat.RequestPermissionsRequestCodeValidator
{
	class HostCallbacks extends FragmentHostCallback
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
		//    3    5:invokevirtual   #32  <Method View FragmentActivity.findViewById(int)>
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
		//    1    1:invokevirtual   #38  <Method FragmentActivity onGetHost()>
		//    2    4:areturn         
		}

		public LayoutInflater onGetLayoutInflater()
		{
			return getLayoutInflater().cloneInContext(((Context) (FragmentActivity.this)));
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field FragmentActivity this$0>
		//    2    4:invokevirtual   #43  <Method LayoutInflater FragmentActivity.getLayoutInflater()>
		//    3    7:aload_0         
		//    4    8:getfield        #14  <Field FragmentActivity this$0>
		//    5   11:invokevirtual   #49  <Method LayoutInflater LayoutInflater.cloneInContext(Context)>
		//    6   14:areturn         
		}

		public int onGetWindowAnimations()
		{
			Window window = getWindow();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field FragmentActivity this$0>
		//    2    4:invokevirtual   #55  <Method Window FragmentActivity.getWindow()>
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
		//    9   15:invokevirtual   #61  <Method android.view.WindowManager$LayoutParams Window.getAttributes()>
		//   10   18:getfield        #67  <Field int android.view.WindowManager$LayoutParams.windowAnimations>
		//   11   21:ireturn         
		}

		public boolean onHasView()
		{
			Window window = getWindow();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field FragmentActivity this$0>
		//    2    4:invokevirtual   #55  <Method Window FragmentActivity.getWindow()>
		//    3    7:astore_1        
			return window != null && window.peekDecorView() != null;
		//    4    8:aload_1         
		//    5    9:ifnull          21
		//    6   12:aload_1         
		//    7   13:invokevirtual   #73  <Method View Window.peekDecorView()>
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
		//    2    4:invokevirtual   #55  <Method Window FragmentActivity.getWindow()>
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
		//    5    7:invokevirtual   #80  <Method void FragmentActivity.requestPermissionsFromFragment(Fragment, String[], int)>
		//    6   10:return          
		}

		public boolean onShouldSaveFragmentState(Fragment fragment)
		{
			return isFinishing() ^ true;
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field FragmentActivity this$0>
		//    2    4:invokevirtual   #86  <Method boolean FragmentActivity.isFinishing()>
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
		//    3    5:invokestatic    #94  <Method boolean ActivityCompat.shouldShowRequestPermissionRationale(android.app.Activity, String)>
		//    4    8:ireturn         
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
		//    6    9:invokevirtual   #99  <Method void FragmentActivity.startActivityFromFragment(Fragment, Intent, int, Bundle)>
		//    7   12:return          
		}

		public void onStartIntentSenderFromFragment(Fragment fragment, IntentSender intentsender, int i, Intent intent, int j, int k, int l, 
				Bundle bundle)
			throws android.content.IntentSender.SendIntentException
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
		//   10   17:invokevirtual   #106 <Method void FragmentActivity.startIntentSenderFromFragment(Fragment, IntentSender, int, Intent, int, int, int, Bundle)>
		//   11   20:return          
		}

		public void onSupportInvalidateOptionsMenu()
		{
			supportInvalidateOptionsMenu();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field FragmentActivity this$0>
		//    2    4:invokevirtual   #112 <Method void FragmentActivity.supportInvalidateOptionsMenu()>
		//    3    7:return          
		}

		final FragmentActivity this$0;

		public HostCallbacks()
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

	static final class NonConfigurationInstances
	{

		Object custom;
		FragmentManagerNonConfig fragments;
		ViewModelStore viewModelStore;

		NonConfigurationInstances()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
		//    2    4:return          
		}
	}


	public FragmentActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void SupportActivity()>
	//    2    4:aload_0         
	//    3    5:new             #12  <Class FragmentActivity$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #63  <Method void FragmentActivity$1(FragmentActivity)>
	//    7   13:putfield        #65  <Field Handler mHandler>
	//    8   16:aload_0         
	//    9   17:new             #14  <Class FragmentActivity$HostCallbacks>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #66  <Method void FragmentActivity$HostCallbacks(FragmentActivity)>
	//   13   25:invokestatic    #72  <Method FragmentController FragmentController.createController(FragmentHostCallback)>
	//   14   28:putfield        #74  <Field FragmentController mFragments>
		mStopped = true;
	//   15   31:aload_0         
	//   16   32:iconst_1        
	//   17   33:putfield        #76  <Field boolean mStopped>
	//   18   36:return          
	}

	private int allocateRequestIndex(Fragment fragment)
	{
		if(mPendingFragmentActivityResults.size() < 65534)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//*   2    4:invokevirtual   #87  <Method int SparseArrayCompat.size()>
	//*   3    7:ldc1            #28  <Int 65534>
	//*   4    9:icmpge          74
		{
			for(; mPendingFragmentActivityResults.indexOfKey(mNextCandidateRequestIndex) >= 0; mNextCandidateRequestIndex = (mNextCandidateRequestIndex + 1) % 65534);
	//    5   12:aload_0         
	//    6   13:getfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//    7   16:aload_0         
	//    8   17:getfield        #89  <Field int mNextCandidateRequestIndex>
	//    9   20:invokevirtual   #93  <Method int SparseArrayCompat.indexOfKey(int)>
	//   10   23:iflt            42
	//   11   26:aload_0         
	//   12   27:aload_0         
	//   13   28:getfield        #89  <Field int mNextCandidateRequestIndex>
	//   14   31:iconst_1        
	//   15   32:iadd            
	//   16   33:ldc1            #28  <Int 65534>
	//   17   35:irem            
	//   18   36:putfield        #89  <Field int mNextCandidateRequestIndex>
	//*  19   39:goto            12
			int i = mNextCandidateRequestIndex;
	//   20   42:aload_0         
	//   21   43:getfield        #89  <Field int mNextCandidateRequestIndex>
	//   22   46:istore_2        
			mPendingFragmentActivityResults.put(i, ((Object) (fragment.mWho)));
	//   23   47:aload_0         
	//   24   48:getfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//   25   51:iload_2         
	//   26   52:aload_1         
	//   27   53:getfield        #98  <Field String Fragment.mWho>
	//   28   56:invokevirtual   #102 <Method void SparseArrayCompat.put(int, Object)>
			mNextCandidateRequestIndex = (mNextCandidateRequestIndex + 1) % 65534;
	//   29   59:aload_0         
	//   30   60:aload_0         
	//   31   61:getfield        #89  <Field int mNextCandidateRequestIndex>
	//   32   64:iconst_1        
	//   33   65:iadd            
	//   34   66:ldc1            #28  <Int 65534>
	//   35   68:irem            
	//   36   69:putfield        #89  <Field int mNextCandidateRequestIndex>
			return i;
	//   37   72:iload_2         
	//   38   73:ireturn         
		} else
		{
			throw new IllegalStateException("Too many pending Fragment activity results.");
	//   39   74:new             #104 <Class IllegalStateException>
	//   40   77:dup             
	//   41   78:ldc1            #106 <String "Too many pending Fragment activity results.">
	//   42   80:invokespecial   #109 <Method void IllegalStateException(String)>
	//   43   83:athrow          
		}
	}

	static void checkForValidRequestCode(int i)
	{
		if((i & 0xffff0000) == 0)
	//*   0    0:iload_0         
	//*   1    1:ldc1            #112 <Int 0xffff0000>
	//*   2    3:iand            
	//*   3    4:ifne            8
			return;
	//    4    7:return          
		else
			throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
	//    5    8:new             #114 <Class IllegalArgumentException>
	//    6   11:dup             
	//    7   12:ldc1            #116 <String "Can only use lower 16 bits for requestCode">
	//    8   14:invokespecial   #117 <Method void IllegalArgumentException(String)>
	//    9   17:athrow          
	}

	private void markFragmentsCreated()
	{
		while(markState(getSupportFragmentManager(), android.arch.lifecycle.Lifecycle.State.CREATED)) ;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #122 <Method FragmentManager getSupportFragmentManager()>
	//    2    4:getstatic       #128 <Field android.arch.lifecycle.Lifecycle$State android.arch.lifecycle.Lifecycle$State.CREATED>
	//    3    7:invokestatic    #132 <Method boolean markState(FragmentManager, android.arch.lifecycle.Lifecycle$State)>
	//    4   10:ifne            0
	//    5   13:return          
	}

	private static boolean markState(FragmentManager fragmentmanager, android.arch.lifecycle.Lifecycle.State state)
	{
		fragmentmanager = ((FragmentManager) (((Collection) (fragmentmanager.getFragments())).iterator()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #138 <Method java.util.List FragmentManager.getFragments()>
	//    2    4:invokeinterface #144 <Method Iterator Collection.iterator()>
	//    3    9:astore_0        
		boolean flag = false;
	//    4   10:iconst_0        
	//    5   11:istore_2        
		do
		{
			if(!((Iterator) (fragmentmanager)).hasNext())
				break;
	//    6   12:aload_0         
	//    7   13:invokeinterface #150 <Method boolean Iterator.hasNext()>
	//    8   18:ifeq            96
			Object obj = ((Object) ((Fragment)((Iterator) (fragmentmanager)).next()));
	//    9   21:aload_0         
	//   10   22:invokeinterface #154 <Method Object Iterator.next()>
	//   11   27:checkcast       #95  <Class Fragment>
	//   12   30:astore          4
			if(obj != null)
	//*  13   32:aload           4
	//*  14   34:ifnonnull       40
	//*  15   37:goto            12
			{
				boolean flag1 = flag;
	//   16   40:iload_2         
	//   17   41:istore_3        
				if(((Fragment) (obj)).getLifecycle().getCurrentState().isAtLeast(android.arch.lifecycle.Lifecycle.State.STARTED))
	//*  18   42:aload           4
	//*  19   44:invokevirtual   #158 <Method Lifecycle Fragment.getLifecycle()>
	//*  20   47:invokevirtual   #164 <Method android.arch.lifecycle.Lifecycle$State Lifecycle.getCurrentState()>
	//*  21   50:getstatic       #167 <Field android.arch.lifecycle.Lifecycle$State android.arch.lifecycle.Lifecycle$State.STARTED>
	//*  22   53:invokevirtual   #171 <Method boolean android.arch.lifecycle.Lifecycle$State.isAtLeast(android.arch.lifecycle.Lifecycle$State)>
	//*  23   56:ifeq            70
				{
					((Fragment) (obj)).mLifecycleRegistry.markState(state);
	//   24   59:aload           4
	//   25   61:getfield        #175 <Field LifecycleRegistry Fragment.mLifecycleRegistry>
	//   26   64:aload_1         
	//   27   65:invokevirtual   #180 <Method void LifecycleRegistry.markState(android.arch.lifecycle.Lifecycle$State)>
					flag1 = true;
	//   28   68:iconst_1        
	//   29   69:istore_3        
				}
				obj = ((Object) (((Fragment) (obj)).peekChildFragmentManager()));
	//   30   70:aload           4
	//   31   72:invokevirtual   #183 <Method FragmentManager Fragment.peekChildFragmentManager()>
	//   32   75:astore          4
				flag = flag1;
	//   33   77:iload_3         
	//   34   78:istore_2        
				if(obj != null)
	//*  35   79:aload           4
	//*  36   81:ifnull          12
					flag = flag1 | markState(((FragmentManager) (obj)), state);
	//   37   84:iload_3         
	//   38   85:aload           4
	//   39   87:aload_1         
	//   40   88:invokestatic    #132 <Method boolean markState(FragmentManager, android.arch.lifecycle.Lifecycle$State)>
	//   41   91:ior             
	//   42   92:istore_2        
			}
		} while(true);
	//   43   93:goto            12
		return flag;
	//   44   96:iload_2         
	//   45   97:ireturn         
	}

	final View dispatchFragmentsOnCreateView(View view, String s, Context context, AttributeSet attributeset)
	{
		return mFragments.onCreateView(view, s, context, attributeset);
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field FragmentController mFragments>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #188 <Method View FragmentController.onCreateView(View, String, Context, AttributeSet)>
	//    7   12:areturn         
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		super.dump(s, filedescriptor, printwriter, as);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #192 <Method void SupportActivity.dump(String, FileDescriptor, PrintWriter, String[])>
		printwriter.print(s);
	//    6    9:aload_3         
	//    7   10:aload_1         
	//    8   11:invokevirtual   #197 <Method void PrintWriter.print(String)>
		printwriter.print("Local FragmentActivity ");
	//    9   14:aload_3         
	//   10   15:ldc1            #199 <String "Local FragmentActivity ">
	//   11   17:invokevirtual   #197 <Method void PrintWriter.print(String)>
		printwriter.print(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//   12   20:aload_3         
	//   13   21:aload_0         
	//   14   22:invokestatic    #205 <Method int System.identityHashCode(Object)>
	//   15   25:invokestatic    #211 <Method String Integer.toHexString(int)>
	//   16   28:invokevirtual   #197 <Method void PrintWriter.print(String)>
		printwriter.println(" State:");
	//   17   31:aload_3         
	//   18   32:ldc1            #213 <String " State:">
	//   19   34:invokevirtual   #216 <Method void PrintWriter.println(String)>
		Object obj = ((Object) (new StringBuilder()));
	//   20   37:new             #218 <Class StringBuilder>
	//   21   40:dup             
	//   22   41:invokespecial   #219 <Method void StringBuilder()>
	//   23   44:astore          5
		((StringBuilder) (obj)).append(s);
	//   24   46:aload           5
	//   25   48:aload_1         
	//   26   49:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   27   52:pop             
		((StringBuilder) (obj)).append("  ");
	//   28   53:aload           5
	//   29   55:ldc1            #225 <String "  ">
	//   30   57:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   31   60:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   32   61:aload           5
	//   33   63:invokevirtual   #229 <Method String StringBuilder.toString()>
	//   34   66:astore          5
		printwriter.print(((String) (obj)));
	//   35   68:aload_3         
	//   36   69:aload           5
	//   37   71:invokevirtual   #197 <Method void PrintWriter.print(String)>
		printwriter.print("mCreated=");
	//   38   74:aload_3         
	//   39   75:ldc1            #231 <String "mCreated=">
	//   40   77:invokevirtual   #197 <Method void PrintWriter.print(String)>
		printwriter.print(mCreated);
	//   41   80:aload_3         
	//   42   81:aload_0         
	//   43   82:getfield        #233 <Field boolean mCreated>
	//   44   85:invokevirtual   #236 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mResumed=");
	//   45   88:aload_3         
	//   46   89:ldc1            #238 <String " mResumed=">
	//   47   91:invokevirtual   #197 <Method void PrintWriter.print(String)>
		printwriter.print(mResumed);
	//   48   94:aload_3         
	//   49   95:aload_0         
	//   50   96:getfield        #240 <Field boolean mResumed>
	//   51   99:invokevirtual   #236 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mStopped=");
	//   52  102:aload_3         
	//   53  103:ldc1            #242 <String " mStopped=">
	//   54  105:invokevirtual   #197 <Method void PrintWriter.print(String)>
		printwriter.print(mStopped);
	//   55  108:aload_3         
	//   56  109:aload_0         
	//   57  110:getfield        #76  <Field boolean mStopped>
	//   58  113:invokevirtual   #236 <Method void PrintWriter.print(boolean)>
		if(getApplication() != null)
	//*  59  116:aload_0         
	//*  60  117:invokevirtual   #246 <Method android.app.Application getApplication()>
	//*  61  120:ifnull          136
			LoaderManager.getInstance(((android.arch.lifecycle.LifecycleOwner) (this))).dump(((String) (obj)), filedescriptor, printwriter, as);
	//   62  123:aload_0         
	//   63  124:invokestatic    #252 <Method LoaderManager LoaderManager.getInstance(android.arch.lifecycle.LifecycleOwner)>
	//   64  127:aload           5
	//   65  129:aload_2         
	//   66  130:aload_3         
	//   67  131:aload           4
	//   68  133:invokevirtual   #253 <Method void LoaderManager.dump(String, FileDescriptor, PrintWriter, String[])>
		mFragments.getSupportFragmentManager().dump(s, filedescriptor, printwriter, as);
	//   69  136:aload_0         
	//   70  137:getfield        #74  <Field FragmentController mFragments>
	//   71  140:invokevirtual   #254 <Method FragmentManager FragmentController.getSupportFragmentManager()>
	//   72  143:aload_1         
	//   73  144:aload_2         
	//   74  145:aload_3         
	//   75  146:aload           4
	//   76  148:invokevirtual   #255 <Method void FragmentManager.dump(String, FileDescriptor, PrintWriter, String[])>
	//   77  151:return          
	}

	public Object getLastCustomNonConfigurationInstance()
	{
		NonConfigurationInstances nonconfigurationinstances = (NonConfigurationInstances)getLastNonConfigurationInstance();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #259 <Method Object getLastNonConfigurationInstance()>
	//    2    4:checkcast       #17  <Class FragmentActivity$NonConfigurationInstances>
	//    3    7:astore_1        
		if(nonconfigurationinstances != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          17
			return nonconfigurationinstances.custom;
	//    6   12:aload_1         
	//    7   13:getfield        #263 <Field Object FragmentActivity$NonConfigurationInstances.custom>
	//    8   16:areturn         
		else
			return ((Object) (null));
	//    9   17:aconst_null     
	//   10   18:areturn         
	}

	public Lifecycle getLifecycle()
	{
		return super.getLifecycle();
	//    0    0:aload_0         
	//    1    1:invokespecial   #264 <Method Lifecycle SupportActivity.getLifecycle()>
	//    2    4:areturn         
	}

	public FragmentManager getSupportFragmentManager()
	{
		return mFragments.getSupportFragmentManager();
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field FragmentController mFragments>
	//    2    4:invokevirtual   #254 <Method FragmentManager FragmentController.getSupportFragmentManager()>
	//    3    7:areturn         
	}

	public LoaderManager getSupportLoaderManager()
	{
		return LoaderManager.getInstance(((android.arch.lifecycle.LifecycleOwner) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #252 <Method LoaderManager LoaderManager.getInstance(android.arch.lifecycle.LifecycleOwner)>
	//    2    4:areturn         
	}

	public ViewModelStore getViewModelStore()
	{
		if(getApplication() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #246 <Method android.app.Application getApplication()>
	//*   2    4:ifnull          57
		{
			if(mViewModelStore == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #273 <Field ViewModelStore mViewModelStore>
	//*   5   11:ifnonnull       52
			{
				NonConfigurationInstances nonconfigurationinstances = (NonConfigurationInstances)getLastNonConfigurationInstance();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #259 <Method Object getLastNonConfigurationInstance()>
	//    8   18:checkcast       #17  <Class FragmentActivity$NonConfigurationInstances>
	//    9   21:astore_1        
				if(nonconfigurationinstances != null)
	//*  10   22:aload_1         
	//*  11   23:ifnull          34
					mViewModelStore = nonconfigurationinstances.viewModelStore;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:getfield        #276 <Field ViewModelStore FragmentActivity$NonConfigurationInstances.viewModelStore>
	//   15   31:putfield        #273 <Field ViewModelStore mViewModelStore>
				if(mViewModelStore == null)
	//*  16   34:aload_0         
	//*  17   35:getfield        #273 <Field ViewModelStore mViewModelStore>
	//*  18   38:ifnonnull       52
					mViewModelStore = new ViewModelStore();
	//   19   41:aload_0         
	//   20   42:new             #278 <Class ViewModelStore>
	//   21   45:dup             
	//   22   46:invokespecial   #279 <Method void ViewModelStore()>
	//   23   49:putfield        #273 <Field ViewModelStore mViewModelStore>
			}
			return mViewModelStore;
	//   24   52:aload_0         
	//   25   53:getfield        #273 <Field ViewModelStore mViewModelStore>
	//   26   56:areturn         
		} else
		{
			throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
	//   27   57:new             #104 <Class IllegalStateException>
	//   28   60:dup             
	//   29   61:ldc2            #281 <String "Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.">
	//   30   64:invokespecial   #109 <Method void IllegalStateException(String)>
	//   31   67:athrow          
		}
	}

	protected void onActivityResult(int i, int j, Intent intent)
	{
		mFragments.noteStateNotSaved();
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field FragmentController mFragments>
	//    2    4:invokevirtual   #288 <Method void FragmentController.noteStateNotSaved()>
		int k = i >> 16;
	//    3    7:iload_1         
	//    4    8:bipush          16
	//    5   10:ishr            
	//    6   11:istore          4
		if(k != 0)
	//*   7   13:iload           4
	//*   8   15:ifeq            125
		{
			k--;
	//    9   18:iload           4
	//   10   20:iconst_1        
	//   11   21:isub            
	//   12   22:istore          4
			String s = (String)mPendingFragmentActivityResults.get(k);
	//   13   24:aload_0         
	//   14   25:getfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//   15   28:iload           4
	//   16   30:invokevirtual   #292 <Method Object SparseArrayCompat.get(int)>
	//   17   33:checkcast       #294 <Class String>
	//   18   36:astore          5
			mPendingFragmentActivityResults.remove(k);
	//   19   38:aload_0         
	//   20   39:getfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//   21   42:iload           4
	//   22   44:invokevirtual   #297 <Method void SparseArrayCompat.remove(int)>
			if(s == null)
	//*  23   47:aload           5
	//*  24   49:ifnonnull       62
			{
				Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
	//   25   52:ldc1            #39  <String "FragmentActivity">
	//   26   54:ldc2            #299 <String "Activity result delivered for unknown Fragment.">
	//   27   57:invokestatic    #305 <Method int Log.w(String, String)>
	//   28   60:pop             
				return;
	//   29   61:return          
			}
			Fragment fragment = mFragments.findFragmentByWho(s);
	//   30   62:aload_0         
	//   31   63:getfield        #74  <Field FragmentController mFragments>
	//   32   66:aload           5
	//   33   68:invokevirtual   #309 <Method Fragment FragmentController.findFragmentByWho(String)>
	//   34   71:astore          6
			if(fragment == null)
	//*  35   73:aload           6
	//*  36   75:ifnonnull       112
			{
				intent = ((Intent) (new StringBuilder()));
	//   37   78:new             #218 <Class StringBuilder>
	//   38   81:dup             
	//   39   82:invokespecial   #219 <Method void StringBuilder()>
	//   40   85:astore_3        
				((StringBuilder) (intent)).append("Activity result no fragment exists for who: ");
	//   41   86:aload_3         
	//   42   87:ldc2            #311 <String "Activity result no fragment exists for who: ">
	//   43   90:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   44   93:pop             
				((StringBuilder) (intent)).append(s);
	//   45   94:aload_3         
	//   46   95:aload           5
	//   47   97:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   48  100:pop             
				Log.w("FragmentActivity", ((StringBuilder) (intent)).toString());
	//   49  101:ldc1            #39  <String "FragmentActivity">
	//   50  103:aload_3         
	//   51  104:invokevirtual   #229 <Method String StringBuilder.toString()>
	//   52  107:invokestatic    #305 <Method int Log.w(String, String)>
	//   53  110:pop             
				return;
	//   54  111:return          
			} else
			{
				fragment.onActivityResult(i & 0xffff, j, intent);
	//   55  112:aload           6
	//   56  114:iload_1         
	//   57  115:ldc2            #312 <Int 65535>
	//   58  118:iand            
	//   59  119:iload_2         
	//   60  120:aload_3         
	//   61  121:invokevirtual   #314 <Method void Fragment.onActivityResult(int, int, Intent)>
				return;
	//   62  124:return          
			}
		}
		ActivityCompat.PermissionCompatDelegate permissioncompatdelegate = ActivityCompat.getPermissionCompatDelegate();
	//   63  125:invokestatic    #320 <Method ActivityCompat$PermissionCompatDelegate ActivityCompat.getPermissionCompatDelegate()>
	//   64  128:astore          5
		if(permissioncompatdelegate != null && permissioncompatdelegate.onActivityResult(((android.app.Activity) (this)), i, j, intent))
	//*  65  130:aload           5
	//*  66  132:ifnull          150
	//*  67  135:aload           5
	//*  68  137:aload_0         
	//*  69  138:iload_1         
	//*  70  139:iload_2         
	//*  71  140:aload_3         
	//*  72  141:invokeinterface #325 <Method boolean ActivityCompat$PermissionCompatDelegate.onActivityResult(android.app.Activity, int, int, Intent)>
	//*  73  146:ifeq            150
		{
			return;
	//   74  149:return          
		} else
		{
			super.onActivityResult(i, j, intent);
	//   75  150:aload_0         
	//   76  151:iload_1         
	//   77  152:iload_2         
	//   78  153:aload_3         
	//   79  154:invokespecial   #326 <Method void SupportActivity.onActivityResult(int, int, Intent)>
			return;
	//   80  157:return          
		}
	}

	public void onAttachFragment(Fragment fragment)
	{
	//    0    0:return          
	}

	public void onBackPressed()
	{
		FragmentManager fragmentmanager = mFragments.getSupportFragmentManager();
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field FragmentController mFragments>
	//    2    4:invokevirtual   #254 <Method FragmentManager FragmentController.getSupportFragmentManager()>
	//    3    7:astore_2        
		boolean flag = fragmentmanager.isStateSaved();
	//    4    8:aload_2         
	//    5    9:invokevirtual   #333 <Method boolean FragmentManager.isStateSaved()>
	//    6   12:istore_1        
		if(flag && android.os.Build.VERSION.SDK_INT <= 25)
	//*   7   13:iload_1         
	//*   8   14:ifeq            26
	//*   9   17:getstatic       #338 <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   20:bipush          25
	//*  11   22:icmpgt          26
			return;
	//   12   25:return          
		if(flag || !fragmentmanager.popBackStackImmediate())
	//*  13   26:iload_1         
	//*  14   27:ifne            37
	//*  15   30:aload_2         
	//*  16   31:invokevirtual   #341 <Method boolean FragmentManager.popBackStackImmediate()>
	//*  17   34:ifne            41
			super.onBackPressed();
	//   18   37:aload_0         
	//   19   38:invokespecial   #343 <Method void SupportActivity.onBackPressed()>
	//   20   41:return          
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #347 <Method void SupportActivity.onConfigurationChanged(Configuration)>
		mFragments.noteStateNotSaved();
	//    3    5:aload_0         
	//    4    6:getfield        #74  <Field FragmentController mFragments>
	//    5    9:invokevirtual   #288 <Method void FragmentController.noteStateNotSaved()>
		mFragments.dispatchConfigurationChanged(configuration);
	//    6   12:aload_0         
	//    7   13:getfield        #74  <Field FragmentController mFragments>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #350 <Method void FragmentController.dispatchConfigurationChanged(Configuration)>
	//   10   20:return          
	}

	protected void onCreate(Bundle bundle)
	{
		FragmentController fragmentcontroller = mFragments;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field FragmentController mFragments>
	//    2    4:astore          4
		FragmentManagerNonConfig fragmentmanagernonconfig = null;
	//    3    6:aconst_null     
	//    4    7:astore_3        
		fragmentcontroller.attachHost(((Fragment) (null)));
	//    5    8:aload           4
	//    6   10:aconst_null     
	//    7   11:invokevirtual   #355 <Method void FragmentController.attachHost(Fragment)>
		super.onCreate(bundle);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #357 <Method void SupportActivity.onCreate(Bundle)>
		NonConfigurationInstances nonconfigurationinstances = (NonConfigurationInstances)getLastNonConfigurationInstance();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #259 <Method Object getLastNonConfigurationInstance()>
	//   13   23:checkcast       #17  <Class FragmentActivity$NonConfigurationInstances>
	//   14   26:astore          6
		if(nonconfigurationinstances != null && nonconfigurationinstances.viewModelStore != null && mViewModelStore == null)
	//*  15   28:aload           6
	//*  16   30:ifnull          57
	//*  17   33:aload           6
	//*  18   35:getfield        #276 <Field ViewModelStore FragmentActivity$NonConfigurationInstances.viewModelStore>
	//*  19   38:ifnull          57
	//*  20   41:aload_0         
	//*  21   42:getfield        #273 <Field ViewModelStore mViewModelStore>
	//*  22   45:ifnonnull       57
			mViewModelStore = nonconfigurationinstances.viewModelStore;
	//   23   48:aload_0         
	//   24   49:aload           6
	//   25   51:getfield        #276 <Field ViewModelStore FragmentActivity$NonConfigurationInstances.viewModelStore>
	//   26   54:putfield        #273 <Field ViewModelStore mViewModelStore>
		if(bundle != null)
	//*  27   57:aload_1         
	//*  28   58:ifnull          195
		{
			android.os.Parcelable parcelable = bundle.getParcelable("android:support:fragments");
	//   29   61:aload_1         
	//   30   62:ldc1            #25  <String "android:support:fragments">
	//   31   64:invokevirtual   #363 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   32   67:astore          4
			FragmentController fragmentcontroller1 = mFragments;
	//   33   69:aload_0         
	//   34   70:getfield        #74  <Field FragmentController mFragments>
	//   35   73:astore          5
			if(nonconfigurationinstances != null)
	//*  36   75:aload           6
	//*  37   77:ifnull          86
				fragmentmanagernonconfig = nonconfigurationinstances.fragments;
	//   38   80:aload           6
	//   39   82:getfield        #367 <Field FragmentManagerNonConfig FragmentActivity$NonConfigurationInstances.fragments>
	//   40   85:astore_3        
			fragmentcontroller1.restoreAllState(parcelable, fragmentmanagernonconfig);
	//   41   86:aload           5
	//   42   88:aload           4
	//   43   90:aload_3         
	//   44   91:invokevirtual   #371 <Method void FragmentController.restoreAllState(android.os.Parcelable, FragmentManagerNonConfig)>
			if(bundle.containsKey("android:support:next_request_index"))
	//*  45   94:aload_1         
	//*  46   95:ldc1            #33  <String "android:support:next_request_index">
	//*  47   97:invokevirtual   #375 <Method boolean Bundle.containsKey(String)>
	//*  48  100:ifeq            195
			{
				mNextCandidateRequestIndex = bundle.getInt("android:support:next_request_index");
	//   49  103:aload_0         
	//   50  104:aload_1         
	//   51  105:ldc1            #33  <String "android:support:next_request_index">
	//   52  107:invokevirtual   #379 <Method int Bundle.getInt(String)>
	//   53  110:putfield        #89  <Field int mNextCandidateRequestIndex>
				int ai[] = bundle.getIntArray("android:support:request_indicies");
	//   54  113:aload_1         
	//   55  114:ldc1            #22  <String "android:support:request_indicies">
	//   56  116:invokevirtual   #383 <Method int[] Bundle.getIntArray(String)>
	//   57  119:astore_3        
				bundle = ((Bundle) (bundle.getStringArray("android:support:request_fragment_who")));
	//   58  120:aload_1         
	//   59  121:ldc1            #36  <String "android:support:request_fragment_who">
	//   60  123:invokevirtual   #387 <Method String[] Bundle.getStringArray(String)>
	//   61  126:astore_1        
				if(ai != null && bundle != null && ai.length == bundle.length)
	//*  62  127:aload_3         
	//*  63  128:ifnull          186
	//*  64  131:aload_1         
	//*  65  132:ifnull          186
	//*  66  135:aload_3         
	//*  67  136:arraylength     
	//*  68  137:aload_1         
	//*  69  138:arraylength     
	//*  70  139:icmpeq          145
	//*  71  142:goto            186
				{
					mPendingFragmentActivityResults = new SparseArrayCompat(ai.length);
	//   72  145:aload_0         
	//   73  146:new             #83  <Class SparseArrayCompat>
	//   74  149:dup             
	//   75  150:aload_3         
	//   76  151:arraylength     
	//   77  152:invokespecial   #389 <Method void SparseArrayCompat(int)>
	//   78  155:putfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
					for(int i = 0; i < ai.length; i++)
	//*  79  158:iconst_0        
	//*  80  159:istore_2        
	//*  81  160:iload_2         
	//*  82  161:aload_3         
	//*  83  162:arraylength     
	//*  84  163:icmpge          195
						mPendingFragmentActivityResults.put(ai[i], ((Object) (bundle[i])));
	//   85  166:aload_0         
	//   86  167:getfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//   87  170:aload_3         
	//   88  171:iload_2         
	//   89  172:iaload          
	//   90  173:aload_1         
	//   91  174:iload_2         
	//   92  175:aaload          
	//   93  176:invokevirtual   #102 <Method void SparseArrayCompat.put(int, Object)>

	//   94  179:iload_2         
	//   95  180:iconst_1        
	//   96  181:iadd            
	//   97  182:istore_2        
				} else
	//*  98  183:goto            160
				{
					Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
	//   99  186:ldc1            #39  <String "FragmentActivity">
	//  100  188:ldc2            #391 <String "Invalid requestCode mapping in savedInstanceState.">
	//  101  191:invokestatic    #305 <Method int Log.w(String, String)>
	//  102  194:pop             
				}
			}
		}
		if(mPendingFragmentActivityResults == null)
	//* 103  195:aload_0         
	//* 104  196:getfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//* 105  199:ifnonnull       218
		{
			mPendingFragmentActivityResults = new SparseArrayCompat();
	//  106  202:aload_0         
	//  107  203:new             #83  <Class SparseArrayCompat>
	//  108  206:dup             
	//  109  207:invokespecial   #392 <Method void SparseArrayCompat()>
	//  110  210:putfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
			mNextCandidateRequestIndex = 0;
	//  111  213:aload_0         
	//  112  214:iconst_0        
	//  113  215:putfield        #89  <Field int mNextCandidateRequestIndex>
		}
		mFragments.dispatchCreate();
	//  114  218:aload_0         
	//  115  219:getfield        #74  <Field FragmentController mFragments>
	//  116  222:invokevirtual   #395 <Method void FragmentController.dispatchCreate()>
	//  117  225:return          
	}

	public boolean onCreatePanelMenu(int i, Menu menu)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            24
			return super.onCreatePanelMenu(i, menu) | mFragments.dispatchCreateOptionsMenu(menu, getMenuInflater());
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #399 <Method boolean SupportActivity.onCreatePanelMenu(int, Menu)>
	//    6   10:aload_0         
	//    7   11:getfield        #74  <Field FragmentController mFragments>
	//    8   14:aload_2         
	//    9   15:aload_0         
	//   10   16:invokevirtual   #403 <Method android.view.MenuInflater getMenuInflater()>
	//   11   19:invokevirtual   #407 <Method boolean FragmentController.dispatchCreateOptionsMenu(Menu, android.view.MenuInflater)>
	//   12   22:ior             
	//   13   23:ireturn         
		else
			return super.onCreatePanelMenu(i, menu);
	//   14   24:aload_0         
	//   15   25:iload_1         
	//   16   26:aload_2         
	//   17   27:invokespecial   #399 <Method boolean SupportActivity.onCreatePanelMenu(int, Menu)>
	//   18   30:ireturn         
	}

	public View onCreateView(View view, String s, Context context, AttributeSet attributeset)
	{
		View view1 = dispatchFragmentsOnCreateView(view, s, context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokevirtual   #409 <Method View dispatchFragmentsOnCreateView(View, String, Context, AttributeSet)>
	//    6    9:astore          5
		if(view1 == null)
	//*   7   11:aload           5
	//*   8   13:ifnonnull       26
			return super.onCreateView(view, s, context, attributeset);
	//    9   16:aload_0         
	//   10   17:aload_1         
	//   11   18:aload_2         
	//   12   19:aload_3         
	//   13   20:aload           4
	//   14   22:invokespecial   #410 <Method View SupportActivity.onCreateView(View, String, Context, AttributeSet)>
	//   15   25:areturn         
		else
			return view1;
	//   16   26:aload           5
	//   17   28:areturn         
	}

	public View onCreateView(String s, Context context, AttributeSet attributeset)
	{
		View view = dispatchFragmentsOnCreateView(((View) (null)), s, context, attributeset);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokevirtual   #409 <Method View dispatchFragmentsOnCreateView(View, String, Context, AttributeSet)>
	//    6    8:astore          4
		if(view == null)
	//*   7   10:aload           4
	//*   8   12:ifnonnull       23
			return super.onCreateView(s, context, attributeset);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:aload_2         
	//   12   18:aload_3         
	//   13   19:invokespecial   #413 <Method View SupportActivity.onCreateView(String, Context, AttributeSet)>
	//   14   22:areturn         
		else
			return view;
	//   15   23:aload           4
	//   16   25:areturn         
	}

	protected void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #416 <Method void SupportActivity.onDestroy()>
		if(mViewModelStore != null && !isChangingConfigurations())
	//*   2    4:aload_0         
	//*   3    5:getfield        #273 <Field ViewModelStore mViewModelStore>
	//*   4    8:ifnull          25
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #419 <Method boolean isChangingConfigurations()>
	//*   7   15:ifne            25
			mViewModelStore.clear();
	//    8   18:aload_0         
	//    9   19:getfield        #273 <Field ViewModelStore mViewModelStore>
	//   10   22:invokevirtual   #422 <Method void ViewModelStore.clear()>
		mFragments.dispatchDestroy();
	//   11   25:aload_0         
	//   12   26:getfield        #74  <Field FragmentController mFragments>
	//   13   29:invokevirtual   #425 <Method void FragmentController.dispatchDestroy()>
	//   14   32:return          
	}

	public void onLowMemory()
	{
		super.onLowMemory();
	//    0    0:aload_0         
	//    1    1:invokespecial   #428 <Method void SupportActivity.onLowMemory()>
		mFragments.dispatchLowMemory();
	//    2    4:aload_0         
	//    3    5:getfield        #74  <Field FragmentController mFragments>
	//    4    8:invokevirtual   #431 <Method void FragmentController.dispatchLowMemory()>
	//    5   11:return          
	}

	public boolean onMenuItemSelected(int i, MenuItem menuitem)
	{
		if(super.onMenuItemSelected(i, menuitem))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:aload_2         
	//*   3    3:invokespecial   #435 <Method boolean SupportActivity.onMenuItemSelected(int, MenuItem)>
	//*   4    6:ifeq            11
			return true;
	//    5    9:iconst_1        
	//    6   10:ireturn         
		if(i != 0)
	//*   7   11:iload_1         
	//*   8   12:ifeq            32
		{
			if(i != 6)
	//*   9   15:iload_1         
	//*  10   16:bipush          6
	//*  11   18:icmpeq          23
				return false;
	//   12   21:iconst_0        
	//   13   22:ireturn         
			else
				return mFragments.dispatchContextItemSelected(menuitem);
	//   14   23:aload_0         
	//   15   24:getfield        #74  <Field FragmentController mFragments>
	//   16   27:aload_2         
	//   17   28:invokevirtual   #439 <Method boolean FragmentController.dispatchContextItemSelected(MenuItem)>
	//   18   31:ireturn         
		} else
		{
			return mFragments.dispatchOptionsItemSelected(menuitem);
	//   19   32:aload_0         
	//   20   33:getfield        #74  <Field FragmentController mFragments>
	//   21   36:aload_2         
	//   22   37:invokevirtual   #442 <Method boolean FragmentController.dispatchOptionsItemSelected(MenuItem)>
	//   23   40:ireturn         
		}
	}

	public void onMultiWindowModeChanged(boolean flag)
	{
		mFragments.dispatchMultiWindowModeChanged(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field FragmentController mFragments>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #447 <Method void FragmentController.dispatchMultiWindowModeChanged(boolean)>
	//    4    8:return          
	}

	protected void onNewIntent(Intent intent)
	{
		super.onNewIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #451 <Method void SupportActivity.onNewIntent(Intent)>
		mFragments.noteStateNotSaved();
	//    3    5:aload_0         
	//    4    6:getfield        #74  <Field FragmentController mFragments>
	//    5    9:invokevirtual   #288 <Method void FragmentController.noteStateNotSaved()>
	//    6   12:return          
	}

	public void onPanelClosed(int i, Menu menu)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            7
	//*   2    4:goto            15
			mFragments.dispatchOptionsMenuClosed(menu);
	//    3    7:aload_0         
	//    4    8:getfield        #74  <Field FragmentController mFragments>
	//    5   11:aload_2         
	//    6   12:invokevirtual   #457 <Method void FragmentController.dispatchOptionsMenuClosed(Menu)>
		super.onPanelClosed(i, menu);
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:aload_2         
	//   10   18:invokespecial   #459 <Method void SupportActivity.onPanelClosed(int, Menu)>
	//   11   21:return          
	}

	protected void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #462 <Method void SupportActivity.onPause()>
		mResumed = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #240 <Field boolean mResumed>
		if(mHandler.hasMessages(2))
	//*   5    9:aload_0         
	//*   6   10:getfield        #65  <Field Handler mHandler>
	//*   7   13:iconst_2        
	//*   8   14:invokevirtual   #468 <Method boolean Handler.hasMessages(int)>
	//*   9   17:ifeq            32
		{
			mHandler.removeMessages(2);
	//   10   20:aload_0         
	//   11   21:getfield        #65  <Field Handler mHandler>
	//   12   24:iconst_2        
	//   13   25:invokevirtual   #471 <Method void Handler.removeMessages(int)>
			onResumeFragments();
	//   14   28:aload_0         
	//   15   29:invokevirtual   #474 <Method void onResumeFragments()>
		}
		mFragments.dispatchPause();
	//   16   32:aload_0         
	//   17   33:getfield        #74  <Field FragmentController mFragments>
	//   18   36:invokevirtual   #477 <Method void FragmentController.dispatchPause()>
	//   19   39:return          
	}

	public void onPictureInPictureModeChanged(boolean flag)
	{
		mFragments.dispatchPictureInPictureModeChanged(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field FragmentController mFragments>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #481 <Method void FragmentController.dispatchPictureInPictureModeChanged(boolean)>
	//    4    8:return          
	}

	protected void onPostResume()
	{
		super.onPostResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #484 <Method void SupportActivity.onPostResume()>
		mHandler.removeMessages(2);
	//    2    4:aload_0         
	//    3    5:getfield        #65  <Field Handler mHandler>
	//    4    8:iconst_2        
	//    5    9:invokevirtual   #471 <Method void Handler.removeMessages(int)>
		onResumeFragments();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #474 <Method void onResumeFragments()>
		mFragments.execPendingActions();
	//    8   16:aload_0         
	//    9   17:getfield        #74  <Field FragmentController mFragments>
	//   10   20:invokevirtual   #487 <Method boolean FragmentController.execPendingActions()>
	//   11   23:pop             
	//   12   24:return          
	}

	protected boolean onPrepareOptionsPanel(View view, Menu menu)
	{
		return super.onPreparePanel(0, view, menu);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:invokespecial   #497 <Method boolean SupportActivity.onPreparePanel(int, View, Menu)>
	//    5    7:ireturn         
	}

	public boolean onPreparePanel(int i, View view, Menu menu)
	{
		if(i == 0 && menu != null)
	//*   0    0:iload_1         
	//*   1    1:ifne            24
	//*   2    4:aload_3         
	//*   3    5:ifnull          24
			return onPrepareOptionsPanel(view, menu) | mFragments.dispatchPrepareOptionsMenu(menu);
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #499 <Method boolean onPrepareOptionsPanel(View, Menu)>
	//    8   14:aload_0         
	//    9   15:getfield        #74  <Field FragmentController mFragments>
	//   10   18:aload_3         
	//   11   19:invokevirtual   #503 <Method boolean FragmentController.dispatchPrepareOptionsMenu(Menu)>
	//   12   22:ior             
	//   13   23:ireturn         
		else
			return super.onPreparePanel(i, view, menu);
	//   14   24:aload_0         
	//   15   25:iload_1         
	//   16   26:aload_2         
	//   17   27:aload_3         
	//   18   28:invokespecial   #497 <Method boolean SupportActivity.onPreparePanel(int, View, Menu)>
	//   19   31:ireturn         
	}

	public void onRequestPermissionsResult(int i, String as[], int ai[])
	{
		mFragments.noteStateNotSaved();
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field FragmentController mFragments>
	//    2    4:invokevirtual   #288 <Method void FragmentController.noteStateNotSaved()>
		int j = i >> 16 & 0xffff;
	//    3    7:iload_1         
	//    4    8:bipush          16
	//    5   10:ishr            
	//    6   11:ldc2            #312 <Int 65535>
	//    7   14:iand            
	//    8   15:istore          4
		if(j != 0)
	//*   9   17:iload           4
	//*  10   19:ifeq            128
		{
			j--;
	//   11   22:iload           4
	//   12   24:iconst_1        
	//   13   25:isub            
	//   14   26:istore          4
			String s = (String)mPendingFragmentActivityResults.get(j);
	//   15   28:aload_0         
	//   16   29:getfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//   17   32:iload           4
	//   18   34:invokevirtual   #292 <Method Object SparseArrayCompat.get(int)>
	//   19   37:checkcast       #294 <Class String>
	//   20   40:astore          5
			mPendingFragmentActivityResults.remove(j);
	//   21   42:aload_0         
	//   22   43:getfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//   23   46:iload           4
	//   24   48:invokevirtual   #297 <Method void SparseArrayCompat.remove(int)>
			if(s == null)
	//*  25   51:aload           5
	//*  26   53:ifnonnull       66
			{
				Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
	//   27   56:ldc1            #39  <String "FragmentActivity">
	//   28   58:ldc2            #299 <String "Activity result delivered for unknown Fragment.">
	//   29   61:invokestatic    #305 <Method int Log.w(String, String)>
	//   30   64:pop             
				return;
	//   31   65:return          
			}
			Fragment fragment = mFragments.findFragmentByWho(s);
	//   32   66:aload_0         
	//   33   67:getfield        #74  <Field FragmentController mFragments>
	//   34   70:aload           5
	//   35   72:invokevirtual   #309 <Method Fragment FragmentController.findFragmentByWho(String)>
	//   36   75:astore          6
			if(fragment == null)
	//*  37   77:aload           6
	//*  38   79:ifnonnull       116
			{
				as = ((String []) (new StringBuilder()));
	//   39   82:new             #218 <Class StringBuilder>
	//   40   85:dup             
	//   41   86:invokespecial   #219 <Method void StringBuilder()>
	//   42   89:astore_2        
				((StringBuilder) (as)).append("Activity result no fragment exists for who: ");
	//   43   90:aload_2         
	//   44   91:ldc2            #311 <String "Activity result no fragment exists for who: ">
	//   45   94:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   46   97:pop             
				((StringBuilder) (as)).append(s);
	//   47   98:aload_2         
	//   48   99:aload           5
	//   49  101:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   50  104:pop             
				Log.w("FragmentActivity", ((StringBuilder) (as)).toString());
	//   51  105:ldc1            #39  <String "FragmentActivity">
	//   52  107:aload_2         
	//   53  108:invokevirtual   #229 <Method String StringBuilder.toString()>
	//   54  111:invokestatic    #305 <Method int Log.w(String, String)>
	//   55  114:pop             
				return;
	//   56  115:return          
			}
			fragment.onRequestPermissionsResult(i & 0xffff, as, ai);
	//   57  116:aload           6
	//   58  118:iload_1         
	//   59  119:ldc2            #312 <Int 65535>
	//   60  122:iand            
	//   61  123:aload_2         
	//   62  124:aload_3         
	//   63  125:invokevirtual   #507 <Method void Fragment.onRequestPermissionsResult(int, String[], int[])>
		}
	//   64  128:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #510 <Method void SupportActivity.onResume()>
		mHandler.sendEmptyMessage(2);
	//    2    4:aload_0         
	//    3    5:getfield        #65  <Field Handler mHandler>
	//    4    8:iconst_2        
	//    5    9:invokevirtual   #513 <Method boolean Handler.sendEmptyMessage(int)>
	//    6   12:pop             
		mResumed = true;
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:putfield        #240 <Field boolean mResumed>
		mFragments.execPendingActions();
	//   10   18:aload_0         
	//   11   19:getfield        #74  <Field FragmentController mFragments>
	//   12   22:invokevirtual   #487 <Method boolean FragmentController.execPendingActions()>
	//   13   25:pop             
	//   14   26:return          
	}

	protected void onResumeFragments()
	{
		mFragments.dispatchResume();
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field FragmentController mFragments>
	//    2    4:invokevirtual   #516 <Method void FragmentController.dispatchResume()>
	//    3    7:return          
	}

	public Object onRetainCustomNonConfigurationInstance()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final Object onRetainNonConfigurationInstance()
	{
		Object obj = onRetainCustomNonConfigurationInstance();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #520 <Method Object onRetainCustomNonConfigurationInstance()>
	//    2    4:astore_1        
		FragmentManagerNonConfig fragmentmanagernonconfig = mFragments.retainNestedNonConfig();
	//    3    5:aload_0         
	//    4    6:getfield        #74  <Field FragmentController mFragments>
	//    5    9:invokevirtual   #524 <Method FragmentManagerNonConfig FragmentController.retainNestedNonConfig()>
	//    6   12:astore_2        
		if(fragmentmanagernonconfig == null && mViewModelStore == null && obj == null)
	//*   7   13:aload_2         
	//*   8   14:ifnonnull       30
	//*   9   17:aload_0         
	//*  10   18:getfield        #273 <Field ViewModelStore mViewModelStore>
	//*  11   21:ifnonnull       30
	//*  12   24:aload_1         
	//*  13   25:ifnonnull       30
		{
			return ((Object) (null));
	//   14   28:aconst_null     
	//   15   29:areturn         
		} else
		{
			NonConfigurationInstances nonconfigurationinstances = new NonConfigurationInstances();
	//   16   30:new             #17  <Class FragmentActivity$NonConfigurationInstances>
	//   17   33:dup             
	//   18   34:invokespecial   #525 <Method void FragmentActivity$NonConfigurationInstances()>
	//   19   37:astore_3        
			nonconfigurationinstances.custom = obj;
	//   20   38:aload_3         
	//   21   39:aload_1         
	//   22   40:putfield        #263 <Field Object FragmentActivity$NonConfigurationInstances.custom>
			nonconfigurationinstances.viewModelStore = mViewModelStore;
	//   23   43:aload_3         
	//   24   44:aload_0         
	//   25   45:getfield        #273 <Field ViewModelStore mViewModelStore>
	//   26   48:putfield        #276 <Field ViewModelStore FragmentActivity$NonConfigurationInstances.viewModelStore>
			nonconfigurationinstances.fragments = fragmentmanagernonconfig;
	//   27   51:aload_3         
	//   28   52:aload_2         
	//   29   53:putfield        #367 <Field FragmentManagerNonConfig FragmentActivity$NonConfigurationInstances.fragments>
			return ((Object) (nonconfigurationinstances));
	//   30   56:aload_3         
	//   31   57:areturn         
		}
	}

	protected void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #528 <Method void SupportActivity.onSaveInstanceState(Bundle)>
		markFragmentsCreated();
	//    3    5:aload_0         
	//    4    6:invokespecial   #530 <Method void markFragmentsCreated()>
		android.os.Parcelable parcelable = mFragments.saveAllState();
	//    5    9:aload_0         
	//    6   10:getfield        #74  <Field FragmentController mFragments>
	//    7   13:invokevirtual   #534 <Method android.os.Parcelable FragmentController.saveAllState()>
	//    8   16:astore_3        
		if(parcelable != null)
	//*   9   17:aload_3         
	//*  10   18:ifnull          28
			bundle.putParcelable("android:support:fragments", parcelable);
	//   11   21:aload_1         
	//   12   22:ldc1            #25  <String "android:support:fragments">
	//   13   24:aload_3         
	//   14   25:invokevirtual   #538 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		if(mPendingFragmentActivityResults.size() > 0)
	//*  15   28:aload_0         
	//*  16   29:getfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//*  17   32:invokevirtual   #87  <Method int SparseArrayCompat.size()>
	//*  18   35:ifle            131
		{
			bundle.putInt("android:support:next_request_index", mNextCandidateRequestIndex);
	//   19   38:aload_1         
	//   20   39:ldc1            #33  <String "android:support:next_request_index">
	//   21   41:aload_0         
	//   22   42:getfield        #89  <Field int mNextCandidateRequestIndex>
	//   23   45:invokevirtual   #542 <Method void Bundle.putInt(String, int)>
			int ai[] = new int[mPendingFragmentActivityResults.size()];
	//   24   48:aload_0         
	//   25   49:getfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//   26   52:invokevirtual   #87  <Method int SparseArrayCompat.size()>
	//   27   55:newarray        int[]
	//   28   57:astore_3        
			String as[] = new String[mPendingFragmentActivityResults.size()];
	//   29   58:aload_0         
	//   30   59:getfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//   31   62:invokevirtual   #87  <Method int SparseArrayCompat.size()>
	//   32   65:anewarray       String[]
	//   33   68:astore          4
			for(int i = 0; i < mPendingFragmentActivityResults.size(); i++)
	//*  34   70:iconst_0        
	//*  35   71:istore_2        
	//*  36   72:iload_2         
	//*  37   73:aload_0         
	//*  38   74:getfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//*  39   77:invokevirtual   #87  <Method int SparseArrayCompat.size()>
	//*  40   80:icmpge          116
			{
				ai[i] = mPendingFragmentActivityResults.keyAt(i);
	//   41   83:aload_3         
	//   42   84:iload_2         
	//   43   85:aload_0         
	//   44   86:getfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//   45   89:iload_2         
	//   46   90:invokevirtual   #545 <Method int SparseArrayCompat.keyAt(int)>
	//   47   93:iastore         
				as[i] = (String)mPendingFragmentActivityResults.valueAt(i);
	//   48   94:aload           4
	//   49   96:iload_2         
	//   50   97:aload_0         
	//   51   98:getfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//   52  101:iload_2         
	//   53  102:invokevirtual   #548 <Method Object SparseArrayCompat.valueAt(int)>
	//   54  105:checkcast       #294 <Class String>
	//   55  108:aastore         
			}

	//   56  109:iload_2         
	//   57  110:iconst_1        
	//   58  111:iadd            
	//   59  112:istore_2        
	//*  60  113:goto            72
			bundle.putIntArray("android:support:request_indicies", ai);
	//   61  116:aload_1         
	//   62  117:ldc1            #22  <String "android:support:request_indicies">
	//   63  119:aload_3         
	//   64  120:invokevirtual   #552 <Method void Bundle.putIntArray(String, int[])>
			bundle.putStringArray("android:support:request_fragment_who", as);
	//   65  123:aload_1         
	//   66  124:ldc1            #36  <String "android:support:request_fragment_who">
	//   67  126:aload           4
	//   68  128:invokevirtual   #556 <Method void Bundle.putStringArray(String, String[])>
		}
	//   69  131:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #559 <Method void SupportActivity.onStart()>
		mStopped = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #76  <Field boolean mStopped>
		if(!mCreated)
	//*   5    9:aload_0         
	//*   6   10:getfield        #233 <Field boolean mCreated>
	//*   7   13:ifne            28
		{
			mCreated = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #233 <Field boolean mCreated>
			mFragments.dispatchActivityCreated();
	//   11   21:aload_0         
	//   12   22:getfield        #74  <Field FragmentController mFragments>
	//   13   25:invokevirtual   #562 <Method void FragmentController.dispatchActivityCreated()>
		}
		mFragments.noteStateNotSaved();
	//   14   28:aload_0         
	//   15   29:getfield        #74  <Field FragmentController mFragments>
	//   16   32:invokevirtual   #288 <Method void FragmentController.noteStateNotSaved()>
		mFragments.execPendingActions();
	//   17   35:aload_0         
	//   18   36:getfield        #74  <Field FragmentController mFragments>
	//   19   39:invokevirtual   #487 <Method boolean FragmentController.execPendingActions()>
	//   20   42:pop             
		mFragments.dispatchStart();
	//   21   43:aload_0         
	//   22   44:getfield        #74  <Field FragmentController mFragments>
	//   23   47:invokevirtual   #565 <Method void FragmentController.dispatchStart()>
	//   24   50:return          
	}

	public void onStateNotSaved()
	{
		mFragments.noteStateNotSaved();
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field FragmentController mFragments>
	//    2    4:invokevirtual   #288 <Method void FragmentController.noteStateNotSaved()>
	//    3    7:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #569 <Method void SupportActivity.onStop()>
		mStopped = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #76  <Field boolean mStopped>
		markFragmentsCreated();
	//    5    9:aload_0         
	//    6   10:invokespecial   #530 <Method void markFragmentsCreated()>
		mFragments.dispatchStop();
	//    7   13:aload_0         
	//    8   14:getfield        #74  <Field FragmentController mFragments>
	//    9   17:invokevirtual   #572 <Method void FragmentController.dispatchStop()>
	//   10   20:return          
	}

	void requestPermissionsFromFragment(Fragment fragment, String as[], int i)
	{
		if(i == -1)
	//*   0    0:iload_3         
	//*   1    1:iconst_m1       
	//*   2    2:icmpne          12
		{
			ActivityCompat.requestPermissions(((android.app.Activity) (this)), as, i);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:invokestatic    #578 <Method void ActivityCompat.requestPermissions(android.app.Activity, String[], int)>
			return;
	//    7   11:return          
		}
		checkForValidRequestCode(i);
	//    8   12:iload_3         
	//    9   13:invokestatic    #580 <Method void checkForValidRequestCode(int)>
		mRequestedPermissionsFromFragment = true;
	//   10   16:aload_0         
	//   11   17:iconst_1        
	//   12   18:putfield        #582 <Field boolean mRequestedPermissionsFromFragment>
		ActivityCompat.requestPermissions(((android.app.Activity) (this)), as, (allocateRequestIndex(fragment) + 1 << 16) + (i & 0xffff));
	//   13   21:aload_0         
	//   14   22:aload_2         
	//   15   23:aload_0         
	//   16   24:aload_1         
	//   17   25:invokespecial   #584 <Method int allocateRequestIndex(Fragment)>
	//   18   28:iconst_1        
	//   19   29:iadd            
	//   20   30:bipush          16
	//   21   32:ishl            
	//   22   33:iload_3         
	//   23   34:ldc2            #312 <Int 65535>
	//   24   37:iand            
	//   25   38:iadd            
	//   26   39:invokestatic    #578 <Method void ActivityCompat.requestPermissions(android.app.Activity, String[], int)>
		mRequestedPermissionsFromFragment = false;
	//   27   42:aload_0         
	//   28   43:iconst_0        
	//   29   44:putfield        #582 <Field boolean mRequestedPermissionsFromFragment>
		return;
	//   30   47:return          
		fragment;
	//   31   48:astore_1        
		mRequestedPermissionsFromFragment = false;
	//   32   49:aload_0         
	//   33   50:iconst_0        
	//   34   51:putfield        #582 <Field boolean mRequestedPermissionsFromFragment>
		throw fragment;
	//   35   54:aload_1         
	//   36   55:athrow          
	}

	public void setEnterSharedElementCallback(SharedElementCallback sharedelementcallback)
	{
		ActivityCompat.setEnterSharedElementCallback(((android.app.Activity) (this)), sharedelementcallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #589 <Method void ActivityCompat.setEnterSharedElementCallback(android.app.Activity, SharedElementCallback)>
	//    3    5:return          
	}

	public void setExitSharedElementCallback(SharedElementCallback sharedelementcallback)
	{
		ActivityCompat.setExitSharedElementCallback(((android.app.Activity) (this)), sharedelementcallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #592 <Method void ActivityCompat.setExitSharedElementCallback(android.app.Activity, SharedElementCallback)>
	//    3    5:return          
	}

	public void startActivityForResult(Intent intent, int i)
	{
		if(!mStartedActivityFromFragment && i != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #596 <Field boolean mStartedActivityFromFragment>
	//*   2    4:ifne            16
	//*   3    7:iload_2         
	//*   4    8:iconst_m1       
	//*   5    9:icmpeq          16
			checkForValidRequestCode(i);
	//    6   12:iload_2         
	//    7   13:invokestatic    #580 <Method void checkForValidRequestCode(int)>
		super.startActivityForResult(intent, i);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:iload_2         
	//   11   19:invokespecial   #598 <Method void SupportActivity.startActivityForResult(Intent, int)>
	//   12   22:return          
	}

	public void startActivityForResult(Intent intent, int i, Bundle bundle)
	{
		if(!mStartedActivityFromFragment && i != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #596 <Field boolean mStartedActivityFromFragment>
	//*   2    4:ifne            16
	//*   3    7:iload_2         
	//*   4    8:iconst_m1       
	//*   5    9:icmpeq          16
			checkForValidRequestCode(i);
	//    6   12:iload_2         
	//    7   13:invokestatic    #580 <Method void checkForValidRequestCode(int)>
		super.startActivityForResult(intent, i, bundle);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:iload_2         
	//   11   19:aload_3         
	//   12   20:invokespecial   #601 <Method void SupportActivity.startActivityForResult(Intent, int, Bundle)>
	//   13   23:return          
	}

	public void startActivityFromFragment(Fragment fragment, Intent intent, int i)
	{
		startActivityFromFragment(fragment, intent, i, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aconst_null     
	//    5    5:invokevirtual   #606 <Method void startActivityFromFragment(Fragment, Intent, int, Bundle)>
	//    6    8:return          
	}

	public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle)
	{
		mStartedActivityFromFragment = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #596 <Field boolean mStartedActivityFromFragment>
		if(i != -1)
			break MISSING_BLOCK_LABEL_24;
	//    3    5:iload_3         
	//    4    6:iconst_m1       
	//    5    7:icmpne          24
		ActivityCompat.startActivityForResult(((android.app.Activity) (this)), intent, -1, bundle);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:iconst_m1       
	//    9   13:aload           4
	//   10   15:invokestatic    #609 <Method void ActivityCompat.startActivityForResult(android.app.Activity, Intent, int, Bundle)>
		mStartedActivityFromFragment = false;
	//   11   18:aload_0         
	//   12   19:iconst_0        
	//   13   20:putfield        #596 <Field boolean mStartedActivityFromFragment>
		return;
	//   14   23:return          
		checkForValidRequestCode(i);
	//   15   24:iload_3         
	//   16   25:invokestatic    #580 <Method void checkForValidRequestCode(int)>
		ActivityCompat.startActivityForResult(((android.app.Activity) (this)), intent, (allocateRequestIndex(fragment) + 1 << 16) + (i & 0xffff), bundle);
	//   17   28:aload_0         
	//   18   29:aload_2         
	//   19   30:aload_0         
	//   20   31:aload_1         
	//   21   32:invokespecial   #584 <Method int allocateRequestIndex(Fragment)>
	//   22   35:iconst_1        
	//   23   36:iadd            
	//   24   37:bipush          16
	//   25   39:ishl            
	//   26   40:iload_3         
	//   27   41:ldc2            #312 <Int 65535>
	//   28   44:iand            
	//   29   45:iadd            
	//   30   46:aload           4
	//   31   48:invokestatic    #609 <Method void ActivityCompat.startActivityForResult(android.app.Activity, Intent, int, Bundle)>
		mStartedActivityFromFragment = false;
	//   32   51:aload_0         
	//   33   52:iconst_0        
	//   34   53:putfield        #596 <Field boolean mStartedActivityFromFragment>
		return;
	//   35   56:return          
		fragment;
	//   36   57:astore_1        
		mStartedActivityFromFragment = false;
	//   37   58:aload_0         
	//   38   59:iconst_0        
	//   39   60:putfield        #596 <Field boolean mStartedActivityFromFragment>
		throw fragment;
	//   40   63:aload_1         
	//   41   64:athrow          
	}

	public void startIntentSenderForResult(IntentSender intentsender, int i, Intent intent, int j, int k, int l)
		throws android.content.IntentSender.SendIntentException
	{
		if(!mStartedIntentSenderFromFragment && i != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #615 <Field boolean mStartedIntentSenderFromFragment>
	//*   2    4:ifne            16
	//*   3    7:iload_2         
	//*   4    8:iconst_m1       
	//*   5    9:icmpeq          16
			checkForValidRequestCode(i);
	//    6   12:iload_2         
	//    7   13:invokestatic    #580 <Method void checkForValidRequestCode(int)>
		super.startIntentSenderForResult(intentsender, i, intent, j, k, l);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:iload_2         
	//   11   19:aload_3         
	//   12   20:iload           4
	//   13   22:iload           5
	//   14   24:iload           6
	//   15   26:invokespecial   #617 <Method void SupportActivity.startIntentSenderForResult(IntentSender, int, Intent, int, int, int)>
	//   16   29:return          
	}

	public void startIntentSenderForResult(IntentSender intentsender, int i, Intent intent, int j, int k, int l, Bundle bundle)
		throws android.content.IntentSender.SendIntentException
	{
		if(!mStartedIntentSenderFromFragment && i != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #615 <Field boolean mStartedIntentSenderFromFragment>
	//*   2    4:ifne            16
	//*   3    7:iload_2         
	//*   4    8:iconst_m1       
	//*   5    9:icmpeq          16
			checkForValidRequestCode(i);
	//    6   12:iload_2         
	//    7   13:invokestatic    #580 <Method void checkForValidRequestCode(int)>
		super.startIntentSenderForResult(intentsender, i, intent, j, k, l, bundle);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:iload_2         
	//   11   19:aload_3         
	//   12   20:iload           4
	//   13   22:iload           5
	//   14   24:iload           6
	//   15   26:aload           7
	//   16   28:invokespecial   #621 <Method void SupportActivity.startIntentSenderForResult(IntentSender, int, Intent, int, int, int, Bundle)>
	//   17   31:return          
	}

	public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentsender, int i, Intent intent, int j, int k, int l, 
			Bundle bundle)
		throws android.content.IntentSender.SendIntentException
	{
		mStartedIntentSenderFromFragment = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #615 <Field boolean mStartedIntentSenderFromFragment>
		if(i != -1)
			break MISSING_BLOCK_LABEL_32;
	//    3    5:iload_3         
	//    4    6:iconst_m1       
	//    5    7:icmpne          32
		ActivityCompat.startIntentSenderForResult(((android.app.Activity) (this)), intentsender, i, intent, j, k, l, bundle);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:iload_3         
	//    9   13:aload           4
	//   10   15:iload           5
	//   11   17:iload           6
	//   12   19:iload           7
	//   13   21:aload           8
	//   14   23:invokestatic    #626 <Method void ActivityCompat.startIntentSenderForResult(android.app.Activity, IntentSender, int, Intent, int, int, int, Bundle)>
		mStartedIntentSenderFromFragment = false;
	//   15   26:aload_0         
	//   16   27:iconst_0        
	//   17   28:putfield        #615 <Field boolean mStartedIntentSenderFromFragment>
		return;
	//   18   31:return          
		checkForValidRequestCode(i);
	//   19   32:iload_3         
	//   20   33:invokestatic    #580 <Method void checkForValidRequestCode(int)>
		ActivityCompat.startIntentSenderForResult(((android.app.Activity) (this)), intentsender, (allocateRequestIndex(fragment) + 1 << 16) + (i & 0xffff), intent, j, k, l, bundle);
	//   21   36:aload_0         
	//   22   37:aload_2         
	//   23   38:aload_0         
	//   24   39:aload_1         
	//   25   40:invokespecial   #584 <Method int allocateRequestIndex(Fragment)>
	//   26   43:iconst_1        
	//   27   44:iadd            
	//   28   45:bipush          16
	//   29   47:ishl            
	//   30   48:iload_3         
	//   31   49:ldc2            #312 <Int 65535>
	//   32   52:iand            
	//   33   53:iadd            
	//   34   54:aload           4
	//   35   56:iload           5
	//   36   58:iload           6
	//   37   60:iload           7
	//   38   62:aload           8
	//   39   64:invokestatic    #626 <Method void ActivityCompat.startIntentSenderForResult(android.app.Activity, IntentSender, int, Intent, int, int, int, Bundle)>
		mStartedIntentSenderFromFragment = false;
	//   40   67:aload_0         
	//   41   68:iconst_0        
	//   42   69:putfield        #615 <Field boolean mStartedIntentSenderFromFragment>
		return;
	//   43   72:return          
		fragment;
	//   44   73:astore_1        
		mStartedIntentSenderFromFragment = false;
	//   45   74:aload_0         
	//   46   75:iconst_0        
	//   47   76:putfield        #615 <Field boolean mStartedIntentSenderFromFragment>
		throw fragment;
	//   48   79:aload_1         
	//   49   80:athrow          
	}

	public void supportFinishAfterTransition()
	{
		ActivityCompat.finishAfterTransition(((android.app.Activity) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #631 <Method void ActivityCompat.finishAfterTransition(android.app.Activity)>
	//    2    4:return          
	}

	public void supportInvalidateOptionsMenu()
	{
		invalidateOptionsMenu();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #635 <Method void invalidateOptionsMenu()>
	//    2    4:return          
	}

	public void supportPostponeEnterTransition()
	{
		ActivityCompat.postponeEnterTransition(((android.app.Activity) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #639 <Method void ActivityCompat.postponeEnterTransition(android.app.Activity)>
	//    2    4:return          
	}

	public void supportStartPostponedEnterTransition()
	{
		ActivityCompat.startPostponedEnterTransition(((android.app.Activity) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #643 <Method void ActivityCompat.startPostponedEnterTransition(android.app.Activity)>
	//    2    4:return          
	}

	public final void validateRequestPermissionsRequestCode(int i)
	{
		if(!mRequestedPermissionsFromFragment && i != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #582 <Field boolean mRequestedPermissionsFromFragment>
	//*   2    4:ifne            16
	//*   3    7:iload_1         
	//*   4    8:iconst_m1       
	//*   5    9:icmpeq          16
			checkForValidRequestCode(i);
	//    6   12:iload_1         
	//    7   13:invokestatic    #580 <Method void checkForValidRequestCode(int)>
	//    8   16:return          
	}

	static final String ALLOCATED_REQUEST_INDICIES_TAG = "android:support:request_indicies";
	static final String FRAGMENTS_TAG = "android:support:fragments";
	static final int MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS = 65534;
	static final int MSG_RESUME_PENDING = 2;
	static final String NEXT_CANDIDATE_REQUEST_INDEX_TAG = "android:support:next_request_index";
	static final String REQUEST_FRAGMENT_WHO_TAG = "android:support:request_fragment_who";
	private static final String TAG = "FragmentActivity";
	boolean mCreated;
	final FragmentController mFragments = FragmentController.createController(((FragmentHostCallback) (new HostCallbacks())));
	final Handler mHandler = new Handler() {

		public void handleMessage(Message message)
		{
			if(message.what != 2)
		//*   0    0:aload_1         
		//*   1    1:getfield        #24  <Field int Message.what>
		//*   2    4:iconst_2        
		//*   3    5:icmpeq          14
			{
				super.handleMessage(message);
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:invokespecial   #26  <Method void Handler.handleMessage(Message)>
				return;
		//    7   13:return          
			} else
			{
				onResumeFragments();
		//    8   14:aload_0         
		//    9   15:getfield        #12  <Field FragmentActivity this$0>
		//   10   18:invokevirtual   #29  <Method void FragmentActivity.onResumeFragments()>
				mFragments.execPendingActions();
		//   11   21:aload_0         
		//   12   22:getfield        #12  <Field FragmentActivity this$0>
		//   13   25:getfield        #33  <Field FragmentController FragmentActivity.mFragments>
		//   14   28:invokevirtual   #39  <Method boolean FragmentController.execPendingActions()>
		//   15   31:pop             
				return;
		//   16   32:return          
			}
		}

		final FragmentActivity this$0;

			
			{
				this$0 = FragmentActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field FragmentActivity this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void Handler()>
			//    5    9:return          
			}
	}
;
	int mNextCandidateRequestIndex;
	SparseArrayCompat mPendingFragmentActivityResults;
	boolean mRequestedPermissionsFromFragment;
	boolean mResumed;
	boolean mStartedActivityFromFragment;
	boolean mStartedIntentSenderFromFragment;
	boolean mStopped;
	private ViewModelStore mViewModelStore;
}
