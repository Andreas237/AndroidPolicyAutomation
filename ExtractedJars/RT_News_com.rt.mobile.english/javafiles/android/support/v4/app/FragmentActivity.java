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
//			BaseFragmentActivityApi16, FragmentController, Fragment, FragmentManager, 
//			LoaderManager, LoaderManagerImpl, ActivityCompat, SharedElementCallback, 
//			FragmentHostCallback, FragmentManagerNonConfig

public class FragmentActivity extends BaseFragmentActivityApi16
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

		public void onStartActivityFromFragment(Fragment fragment, Intent intent, int i)
		{
			startActivityFromFragment(fragment, intent, i);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field FragmentActivity this$0>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:iload_3         
		//    5    7:invokevirtual   #99  <Method void FragmentActivity.startActivityFromFragment(Fragment, Intent, int)>
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
		//    6    9:invokevirtual   #102 <Method void FragmentActivity.startActivityFromFragment(Fragment, Intent, int, Bundle)>
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
		//   10   17:invokevirtual   #109 <Method void FragmentActivity.startIntentSenderFromFragment(Fragment, IntentSender, int, Intent, int, int, int, Bundle)>
		//   11   20:return          
		}

		public void onSupportInvalidateOptionsMenu()
		{
			supportInvalidateOptionsMenu();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field FragmentActivity this$0>
		//    2    4:invokevirtual   #115 <Method void FragmentActivity.supportInvalidateOptionsMenu()>
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
	//    1    1:invokespecial   #64  <Method void BaseFragmentActivityApi16()>
	//    2    4:aload_0         
	//    3    5:new             #12  <Class FragmentActivity$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #67  <Method void FragmentActivity$1(FragmentActivity)>
	//    7   13:putfield        #69  <Field Handler mHandler>
	//    8   16:aload_0         
	//    9   17:new             #14  <Class FragmentActivity$HostCallbacks>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #70  <Method void FragmentActivity$HostCallbacks(FragmentActivity)>
	//   13   25:invokestatic    #76  <Method FragmentController FragmentController.createController(FragmentHostCallback)>
	//   14   28:putfield        #78  <Field FragmentController mFragments>
		mStopped = true;
	//   15   31:aload_0         
	//   16   32:iconst_1        
	//   17   33:putfield        #80  <Field boolean mStopped>
		mReallyStopped = true;
	//   18   36:aload_0         
	//   19   37:iconst_1        
	//   20   38:putfield        #82  <Field boolean mReallyStopped>
	//   21   41:return          
	}

	private int allocateRequestIndex(Fragment fragment)
	{
		if(mPendingFragmentActivityResults.size() >= 65534)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//*   2    4:invokevirtual   #93  <Method int SparseArrayCompat.size()>
	//*   3    7:ldc1            #28  <Int 65534>
	//*   4    9:icmplt          22
			throw new IllegalStateException("Too many pending Fragment activity results.");
	//    5   12:new             #95  <Class IllegalStateException>
	//    6   15:dup             
	//    7   16:ldc1            #97  <String "Too many pending Fragment activity results.">
	//    8   18:invokespecial   #100 <Method void IllegalStateException(String)>
	//    9   21:athrow          
		for(; mPendingFragmentActivityResults.indexOfKey(mNextCandidateRequestIndex) >= 0; mNextCandidateRequestIndex = (mNextCandidateRequestIndex + 1) % 65534);
	//   10   22:aload_0         
	//   11   23:getfield        #87  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//   12   26:aload_0         
	//   13   27:getfield        #102 <Field int mNextCandidateRequestIndex>
	//   14   30:invokevirtual   #106 <Method int SparseArrayCompat.indexOfKey(int)>
	//   15   33:iflt            52
	//   16   36:aload_0         
	//   17   37:aload_0         
	//   18   38:getfield        #102 <Field int mNextCandidateRequestIndex>
	//   19   41:iconst_1        
	//   20   42:iadd            
	//   21   43:ldc1            #28  <Int 65534>
	//   22   45:irem            
	//   23   46:putfield        #102 <Field int mNextCandidateRequestIndex>
	//*  24   49:goto            22
		int i = mNextCandidateRequestIndex;
	//   25   52:aload_0         
	//   26   53:getfield        #102 <Field int mNextCandidateRequestIndex>
	//   27   56:istore_2        
		mPendingFragmentActivityResults.put(i, ((Object) (fragment.mWho)));
	//   28   57:aload_0         
	//   29   58:getfield        #87  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//   30   61:iload_2         
	//   31   62:aload_1         
	//   32   63:getfield        #111 <Field String Fragment.mWho>
	//   33   66:invokevirtual   #115 <Method void SparseArrayCompat.put(int, Object)>
		mNextCandidateRequestIndex = (mNextCandidateRequestIndex + 1) % 65534;
	//   34   69:aload_0         
	//   35   70:aload_0         
	//   36   71:getfield        #102 <Field int mNextCandidateRequestIndex>
	//   37   74:iconst_1        
	//   38   75:iadd            
	//   39   76:ldc1            #28  <Int 65534>
	//   40   78:irem            
	//   41   79:putfield        #102 <Field int mNextCandidateRequestIndex>
		return i;
	//   42   82:iload_2         
	//   43   83:ireturn         
	}

	private void markFragmentsCreated()
	{
		while(markState(getSupportFragmentManager(), android.arch.lifecycle.Lifecycle.State.CREATED)) ;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #120 <Method FragmentManager getSupportFragmentManager()>
	//    2    4:getstatic       #126 <Field android.arch.lifecycle.Lifecycle$State android.arch.lifecycle.Lifecycle$State.CREATED>
	//    3    7:invokestatic    #130 <Method boolean markState(FragmentManager, android.arch.lifecycle.Lifecycle$State)>
	//    4   10:ifne            0
	//    5   13:return          
	}

	private static boolean markState(FragmentManager fragmentmanager, android.arch.lifecycle.Lifecycle.State state)
	{
		fragmentmanager = ((FragmentManager) (((Collection) (fragmentmanager.getFragments())).iterator()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #136 <Method java.util.List FragmentManager.getFragments()>
	//    2    4:invokeinterface #142 <Method Iterator Collection.iterator()>
	//    3    9:astore_0        
		boolean flag = false;
	//    4   10:iconst_0        
	//    5   11:istore_2        
		do
		{
			if(!((Iterator) (fragmentmanager)).hasNext())
				break;
	//    6   12:aload_0         
	//    7   13:invokeinterface #148 <Method boolean Iterator.hasNext()>
	//    8   18:ifeq            96
			Object obj = ((Object) ((Fragment)((Iterator) (fragmentmanager)).next()));
	//    9   21:aload_0         
	//   10   22:invokeinterface #152 <Method Object Iterator.next()>
	//   11   27:checkcast       #108 <Class Fragment>
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
	//*  19   44:invokevirtual   #156 <Method Lifecycle Fragment.getLifecycle()>
	//*  20   47:invokevirtual   #162 <Method android.arch.lifecycle.Lifecycle$State Lifecycle.getCurrentState()>
	//*  21   50:getstatic       #165 <Field android.arch.lifecycle.Lifecycle$State android.arch.lifecycle.Lifecycle$State.STARTED>
	//*  22   53:invokevirtual   #169 <Method boolean android.arch.lifecycle.Lifecycle$State.isAtLeast(android.arch.lifecycle.Lifecycle$State)>
	//*  23   56:ifeq            70
				{
					((Fragment) (obj)).mLifecycleRegistry.markState(state);
	//   24   59:aload           4
	//   25   61:getfield        #173 <Field LifecycleRegistry Fragment.mLifecycleRegistry>
	//   26   64:aload_1         
	//   27   65:invokevirtual   #178 <Method void LifecycleRegistry.markState(android.arch.lifecycle.Lifecycle$State)>
					flag1 = true;
	//   28   68:iconst_1        
	//   29   69:istore_3        
				}
				obj = ((Object) (((Fragment) (obj)).peekChildFragmentManager()));
	//   30   70:aload           4
	//   31   72:invokevirtual   #181 <Method FragmentManager Fragment.peekChildFragmentManager()>
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
	//   40   88:invokestatic    #130 <Method boolean markState(FragmentManager, android.arch.lifecycle.Lifecycle$State)>
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
	//    1    1:getfield        #78  <Field FragmentController mFragments>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #186 <Method View FragmentController.onCreateView(View, String, Context, AttributeSet)>
	//    7   12:areturn         
	}

	void doReallyStop(boolean flag)
	{
		if(!mReallyStopped)
	//*   0    0:aload_0         
	//*   1    1:getfield        #82  <Field boolean mReallyStopped>
	//*   2    4:ifne            29
		{
			mReallyStopped = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #82  <Field boolean mReallyStopped>
			mRetaining = flag;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #190 <Field boolean mRetaining>
			mHandler.removeMessages(1);
	//    9   17:aload_0         
	//   10   18:getfield        #69  <Field Handler mHandler>
	//   11   21:iconst_1        
	//   12   22:invokevirtual   #196 <Method void Handler.removeMessages(int)>
			onReallyStop();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #199 <Method void onReallyStop()>
		}
	//   15   29:return          
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		super.dump(s, filedescriptor, printwriter, as);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #203 <Method void BaseFragmentActivityApi16.dump(String, FileDescriptor, PrintWriter, String[])>
		printwriter.print(s);
	//    6    9:aload_3         
	//    7   10:aload_1         
	//    8   11:invokevirtual   #208 <Method void PrintWriter.print(String)>
		printwriter.print("Local FragmentActivity ");
	//    9   14:aload_3         
	//   10   15:ldc1            #210 <String "Local FragmentActivity ">
	//   11   17:invokevirtual   #208 <Method void PrintWriter.print(String)>
		printwriter.print(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//   12   20:aload_3         
	//   13   21:aload_0         
	//   14   22:invokestatic    #216 <Method int System.identityHashCode(Object)>
	//   15   25:invokestatic    #222 <Method String Integer.toHexString(int)>
	//   16   28:invokevirtual   #208 <Method void PrintWriter.print(String)>
		printwriter.println(" State:");
	//   17   31:aload_3         
	//   18   32:ldc1            #224 <String " State:">
	//   19   34:invokevirtual   #227 <Method void PrintWriter.println(String)>
		Object obj = ((Object) (new StringBuilder()));
	//   20   37:new             #229 <Class StringBuilder>
	//   21   40:dup             
	//   22   41:invokespecial   #230 <Method void StringBuilder()>
	//   23   44:astore          5
		((StringBuilder) (obj)).append(s);
	//   24   46:aload           5
	//   25   48:aload_1         
	//   26   49:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   27   52:pop             
		((StringBuilder) (obj)).append("  ");
	//   28   53:aload           5
	//   29   55:ldc1            #236 <String "  ">
	//   30   57:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   31   60:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   32   61:aload           5
	//   33   63:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   34   66:astore          5
		printwriter.print(((String) (obj)));
	//   35   68:aload_3         
	//   36   69:aload           5
	//   37   71:invokevirtual   #208 <Method void PrintWriter.print(String)>
		printwriter.print("mCreated=");
	//   38   74:aload_3         
	//   39   75:ldc1            #242 <String "mCreated=">
	//   40   77:invokevirtual   #208 <Method void PrintWriter.print(String)>
		printwriter.print(mCreated);
	//   41   80:aload_3         
	//   42   81:aload_0         
	//   43   82:getfield        #244 <Field boolean mCreated>
	//   44   85:invokevirtual   #246 <Method void PrintWriter.print(boolean)>
		printwriter.print("mResumed=");
	//   45   88:aload_3         
	//   46   89:ldc1            #248 <String "mResumed=">
	//   47   91:invokevirtual   #208 <Method void PrintWriter.print(String)>
		printwriter.print(mResumed);
	//   48   94:aload_3         
	//   49   95:aload_0         
	//   50   96:getfield        #250 <Field boolean mResumed>
	//   51   99:invokevirtual   #246 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mStopped=");
	//   52  102:aload_3         
	//   53  103:ldc1            #252 <String " mStopped=">
	//   54  105:invokevirtual   #208 <Method void PrintWriter.print(String)>
		printwriter.print(mStopped);
	//   55  108:aload_3         
	//   56  109:aload_0         
	//   57  110:getfield        #80  <Field boolean mStopped>
	//   58  113:invokevirtual   #246 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mReallyStopped=");
	//   59  116:aload_3         
	//   60  117:ldc1            #254 <String " mReallyStopped=">
	//   61  119:invokevirtual   #208 <Method void PrintWriter.print(String)>
		printwriter.println(mReallyStopped);
	//   62  122:aload_3         
	//   63  123:aload_0         
	//   64  124:getfield        #82  <Field boolean mReallyStopped>
	//   65  127:invokevirtual   #256 <Method void PrintWriter.println(boolean)>
		if(mLoaderManager != null)
	//*  66  130:aload_0         
	//*  67  131:getfield        #258 <Field LoaderManager mLoaderManager>
	//*  68  134:ifnull          150
			mLoaderManager.dump(((String) (obj)), filedescriptor, printwriter, as);
	//   69  137:aload_0         
	//   70  138:getfield        #258 <Field LoaderManager mLoaderManager>
	//   71  141:aload           5
	//   72  143:aload_2         
	//   73  144:aload_3         
	//   74  145:aload           4
	//   75  147:invokevirtual   #261 <Method void LoaderManager.dump(String, FileDescriptor, PrintWriter, String[])>
		mFragments.getSupportFragmentManager().dump(s, filedescriptor, printwriter, as);
	//   76  150:aload_0         
	//   77  151:getfield        #78  <Field FragmentController mFragments>
	//   78  154:invokevirtual   #262 <Method FragmentManager FragmentController.getSupportFragmentManager()>
	//   79  157:aload_1         
	//   80  158:aload_2         
	//   81  159:aload_3         
	//   82  160:aload           4
	//   83  162:invokevirtual   #263 <Method void FragmentManager.dump(String, FileDescriptor, PrintWriter, String[])>
	//   84  165:return          
	}

	public Object getLastCustomNonConfigurationInstance()
	{
		NonConfigurationInstances nonconfigurationinstances = (NonConfigurationInstances)getLastNonConfigurationInstance();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #267 <Method Object getLastNonConfigurationInstance()>
	//    2    4:checkcast       #17  <Class FragmentActivity$NonConfigurationInstances>
	//    3    7:astore_1        
		if(nonconfigurationinstances != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          17
			return nonconfigurationinstances.custom;
	//    6   12:aload_1         
	//    7   13:getfield        #271 <Field Object FragmentActivity$NonConfigurationInstances.custom>
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
	//    1    1:invokespecial   #272 <Method Lifecycle BaseFragmentActivityApi16.getLifecycle()>
	//    2    4:areturn         
	}

	public FragmentManager getSupportFragmentManager()
	{
		return mFragments.getSupportFragmentManager();
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field FragmentController mFragments>
	//    2    4:invokevirtual   #262 <Method FragmentManager FragmentController.getSupportFragmentManager()>
	//    3    7:areturn         
	}

	public LoaderManager getSupportLoaderManager()
	{
		if(mLoaderManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #258 <Field LoaderManager mLoaderManager>
	//*   2    4:ifnull          12
		{
			return mLoaderManager;
	//    3    7:aload_0         
	//    4    8:getfield        #258 <Field LoaderManager mLoaderManager>
	//    5   11:areturn         
		} else
		{
			mLoaderManager = ((LoaderManager) (new LoaderManagerImpl(((android.arch.lifecycle.LifecycleOwner) (this)), getViewModelStore())));
	//    6   12:aload_0         
	//    7   13:new             #276 <Class LoaderManagerImpl>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #280 <Method ViewModelStore getViewModelStore()>
	//   12   22:invokespecial   #283 <Method void LoaderManagerImpl(android.arch.lifecycle.LifecycleOwner, ViewModelStore)>
	//   13   25:putfield        #258 <Field LoaderManager mLoaderManager>
			return mLoaderManager;
	//   14   28:aload_0         
	//   15   29:getfield        #258 <Field LoaderManager mLoaderManager>
	//   16   32:areturn         
		}
	}

	public ViewModelStore getViewModelStore()
	{
		if(getApplication() == null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #288 <Method android.app.Application getApplication()>
	//*   2    4:ifnonnull       18
			throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
	//    3    7:new             #95  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #290 <String "Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.">
	//    6   14:invokespecial   #100 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		if(mViewModelStore == null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #292 <Field ViewModelStore mViewModelStore>
	//*  10   22:ifnonnull       36
			mViewModelStore = new ViewModelStore();
	//   11   25:aload_0         
	//   12   26:new             #294 <Class ViewModelStore>
	//   13   29:dup             
	//   14   30:invokespecial   #295 <Method void ViewModelStore()>
	//   15   33:putfield        #292 <Field ViewModelStore mViewModelStore>
		return mViewModelStore;
	//   16   36:aload_0         
	//   17   37:getfield        #292 <Field ViewModelStore mViewModelStore>
	//   18   40:areturn         
	}

	protected void onActivityResult(int i, int j, Intent intent)
	{
		mFragments.noteStateNotSaved();
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field FragmentController mFragments>
	//    2    4:invokevirtual   #301 <Method void FragmentController.noteStateNotSaved()>
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
	//   14   25:getfield        #87  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//   15   28:iload           4
	//   16   30:invokevirtual   #305 <Method Object SparseArrayCompat.get(int)>
	//   17   33:checkcast       #307 <Class String>
	//   18   36:astore          5
			mPendingFragmentActivityResults.remove(k);
	//   19   38:aload_0         
	//   20   39:getfield        #87  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//   21   42:iload           4
	//   22   44:invokevirtual   #310 <Method void SparseArrayCompat.remove(int)>
			if(s == null)
	//*  23   47:aload           5
	//*  24   49:ifnonnull       62
			{
				Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
	//   25   52:ldc1            #41  <String "FragmentActivity">
	//   26   54:ldc2            #312 <String "Activity result delivered for unknown Fragment.">
	//   27   57:invokestatic    #318 <Method int Log.w(String, String)>
	//   28   60:pop             
				return;
	//   29   61:return          
			}
			Fragment fragment = mFragments.findFragmentByWho(s);
	//   30   62:aload_0         
	//   31   63:getfield        #78  <Field FragmentController mFragments>
	//   32   66:aload           5
	//   33   68:invokevirtual   #322 <Method Fragment FragmentController.findFragmentByWho(String)>
	//   34   71:astore          6
			if(fragment == null)
	//*  35   73:aload           6
	//*  36   75:ifnonnull       112
			{
				intent = ((Intent) (new StringBuilder()));
	//   37   78:new             #229 <Class StringBuilder>
	//   38   81:dup             
	//   39   82:invokespecial   #230 <Method void StringBuilder()>
	//   40   85:astore_3        
				((StringBuilder) (intent)).append("Activity result no fragment exists for who: ");
	//   41   86:aload_3         
	//   42   87:ldc2            #324 <String "Activity result no fragment exists for who: ">
	//   43   90:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   44   93:pop             
				((StringBuilder) (intent)).append(s);
	//   45   94:aload_3         
	//   46   95:aload           5
	//   47   97:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   48  100:pop             
				Log.w("FragmentActivity", ((StringBuilder) (intent)).toString());
	//   49  101:ldc1            #41  <String "FragmentActivity">
	//   50  103:aload_3         
	//   51  104:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   52  107:invokestatic    #318 <Method int Log.w(String, String)>
	//   53  110:pop             
				return;
	//   54  111:return          
			} else
			{
				fragment.onActivityResult(i & 0xffff, j, intent);
	//   55  112:aload           6
	//   56  114:iload_1         
	//   57  115:ldc2            #325 <Int 65535>
	//   58  118:iand            
	//   59  119:iload_2         
	//   60  120:aload_3         
	//   61  121:invokevirtual   #327 <Method void Fragment.onActivityResult(int, int, Intent)>
				return;
	//   62  124:return          
			}
		}
		ActivityCompat.PermissionCompatDelegate permissioncompatdelegate = ActivityCompat.getPermissionCompatDelegate();
	//   63  125:invokestatic    #333 <Method ActivityCompat$PermissionCompatDelegate ActivityCompat.getPermissionCompatDelegate()>
	//   64  128:astore          5
		if(permissioncompatdelegate != null && permissioncompatdelegate.onActivityResult(((android.app.Activity) (this)), i, j, intent))
	//*  65  130:aload           5
	//*  66  132:ifnull          150
	//*  67  135:aload           5
	//*  68  137:aload_0         
	//*  69  138:iload_1         
	//*  70  139:iload_2         
	//*  71  140:aload_3         
	//*  72  141:invokeinterface #338 <Method boolean ActivityCompat$PermissionCompatDelegate.onActivityResult(android.app.Activity, int, int, Intent)>
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
	//   79  154:invokespecial   #339 <Method void BaseFragmentActivityApi16.onActivityResult(int, int, Intent)>
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
	//    1    1:getfield        #78  <Field FragmentController mFragments>
	//    2    4:invokevirtual   #262 <Method FragmentManager FragmentController.getSupportFragmentManager()>
	//    3    7:astore_2        
		boolean flag = fragmentmanager.isStateSaved();
	//    4    8:aload_2         
	//    5    9:invokevirtual   #345 <Method boolean FragmentManager.isStateSaved()>
	//    6   12:istore_1        
		if(flag && android.os.Build.VERSION.SDK_INT <= 25)
	//*   7   13:iload_1         
	//*   8   14:ifeq            26
	//*   9   17:getstatic       #350 <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   20:bipush          25
	//*  11   22:icmpgt          26
			return;
	//   12   25:return          
		if(flag || !fragmentmanager.popBackStackImmediate())
	//*  13   26:iload_1         
	//*  14   27:ifne            37
	//*  15   30:aload_2         
	//*  16   31:invokevirtual   #353 <Method boolean FragmentManager.popBackStackImmediate()>
	//*  17   34:ifne            41
			super.onBackPressed();
	//   18   37:aload_0         
	//   19   38:invokespecial   #355 <Method void BaseFragmentActivityApi16.onBackPressed()>
	//   20   41:return          
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #359 <Method void BaseFragmentActivityApi16.onConfigurationChanged(Configuration)>
		mFragments.noteStateNotSaved();
	//    3    5:aload_0         
	//    4    6:getfield        #78  <Field FragmentController mFragments>
	//    5    9:invokevirtual   #301 <Method void FragmentController.noteStateNotSaved()>
		mFragments.dispatchConfigurationChanged(configuration);
	//    6   12:aload_0         
	//    7   13:getfield        #78  <Field FragmentController mFragments>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #362 <Method void FragmentController.dispatchConfigurationChanged(Configuration)>
	//   10   20:return          
	}

	protected void onCreate(Bundle bundle)
	{
		FragmentController fragmentcontroller = mFragments;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field FragmentController mFragments>
	//    2    4:astore          4
		FragmentManagerNonConfig fragmentmanagernonconfig = null;
	//    3    6:aconst_null     
	//    4    7:astore_3        
		fragmentcontroller.attachHost(((Fragment) (null)));
	//    5    8:aload           4
	//    6   10:aconst_null     
	//    7   11:invokevirtual   #368 <Method void FragmentController.attachHost(Fragment)>
		super.onCreate(bundle);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #370 <Method void BaseFragmentActivityApi16.onCreate(Bundle)>
		NonConfigurationInstances nonconfigurationinstances = (NonConfigurationInstances)getLastNonConfigurationInstance();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #267 <Method Object getLastNonConfigurationInstance()>
	//   13   23:checkcast       #17  <Class FragmentActivity$NonConfigurationInstances>
	//   14   26:astore          6
		if(nonconfigurationinstances != null)
	//*  15   28:aload           6
	//*  16   30:ifnull          42
			mViewModelStore = nonconfigurationinstances.viewModelStore;
	//   17   33:aload_0         
	//   18   34:aload           6
	//   19   36:getfield        #373 <Field ViewModelStore FragmentActivity$NonConfigurationInstances.viewModelStore>
	//   20   39:putfield        #292 <Field ViewModelStore mViewModelStore>
		if(bundle != null)
	//*  21   42:aload_1         
	//*  22   43:ifnull          180
		{
			android.os.Parcelable parcelable = bundle.getParcelable("android:support:fragments");
	//   23   46:aload_1         
	//   24   47:ldc1            #25  <String "android:support:fragments">
	//   25   49:invokevirtual   #379 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   26   52:astore          4
			FragmentController fragmentcontroller1 = mFragments;
	//   27   54:aload_0         
	//   28   55:getfield        #78  <Field FragmentController mFragments>
	//   29   58:astore          5
			if(nonconfigurationinstances != null)
	//*  30   60:aload           6
	//*  31   62:ifnull          71
				fragmentmanagernonconfig = nonconfigurationinstances.fragments;
	//   32   65:aload           6
	//   33   67:getfield        #383 <Field FragmentManagerNonConfig FragmentActivity$NonConfigurationInstances.fragments>
	//   34   70:astore_3        
			fragmentcontroller1.restoreAllState(parcelable, fragmentmanagernonconfig);
	//   35   71:aload           5
	//   36   73:aload           4
	//   37   75:aload_3         
	//   38   76:invokevirtual   #387 <Method void FragmentController.restoreAllState(android.os.Parcelable, FragmentManagerNonConfig)>
			if(bundle.containsKey("android:support:next_request_index"))
	//*  39   79:aload_1         
	//*  40   80:ldc1            #35  <String "android:support:next_request_index">
	//*  41   82:invokevirtual   #391 <Method boolean Bundle.containsKey(String)>
	//*  42   85:ifeq            180
			{
				mNextCandidateRequestIndex = bundle.getInt("android:support:next_request_index");
	//   43   88:aload_0         
	//   44   89:aload_1         
	//   45   90:ldc1            #35  <String "android:support:next_request_index">
	//   46   92:invokevirtual   #395 <Method int Bundle.getInt(String)>
	//   47   95:putfield        #102 <Field int mNextCandidateRequestIndex>
				int ai[] = bundle.getIntArray("android:support:request_indicies");
	//   48   98:aload_1         
	//   49   99:ldc1            #22  <String "android:support:request_indicies">
	//   50  101:invokevirtual   #399 <Method int[] Bundle.getIntArray(String)>
	//   51  104:astore_3        
				bundle = ((Bundle) (bundle.getStringArray("android:support:request_fragment_who")));
	//   52  105:aload_1         
	//   53  106:ldc1            #38  <String "android:support:request_fragment_who">
	//   54  108:invokevirtual   #403 <Method String[] Bundle.getStringArray(String)>
	//   55  111:astore_1        
				if(ai != null && bundle != null && ai.length == bundle.length)
	//*  56  112:aload_3         
	//*  57  113:ifnull          171
	//*  58  116:aload_1         
	//*  59  117:ifnull          171
	//*  60  120:aload_3         
	//*  61  121:arraylength     
	//*  62  122:aload_1         
	//*  63  123:arraylength     
	//*  64  124:icmpeq          130
	//*  65  127:goto            171
				{
					mPendingFragmentActivityResults = new SparseArrayCompat(ai.length);
	//   66  130:aload_0         
	//   67  131:new             #89  <Class SparseArrayCompat>
	//   68  134:dup             
	//   69  135:aload_3         
	//   70  136:arraylength     
	//   71  137:invokespecial   #405 <Method void SparseArrayCompat(int)>
	//   72  140:putfield        #87  <Field SparseArrayCompat mPendingFragmentActivityResults>
					for(int i = 0; i < ai.length; i++)
	//*  73  143:iconst_0        
	//*  74  144:istore_2        
	//*  75  145:iload_2         
	//*  76  146:aload_3         
	//*  77  147:arraylength     
	//*  78  148:icmpge          180
						mPendingFragmentActivityResults.put(ai[i], ((Object) (bundle[i])));
	//   79  151:aload_0         
	//   80  152:getfield        #87  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//   81  155:aload_3         
	//   82  156:iload_2         
	//   83  157:iaload          
	//   84  158:aload_1         
	//   85  159:iload_2         
	//   86  160:aaload          
	//   87  161:invokevirtual   #115 <Method void SparseArrayCompat.put(int, Object)>

	//   88  164:iload_2         
	//   89  165:iconst_1        
	//   90  166:iadd            
	//   91  167:istore_2        
				} else
	//*  92  168:goto            145
				{
					Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
	//   93  171:ldc1            #41  <String "FragmentActivity">
	//   94  173:ldc2            #407 <String "Invalid requestCode mapping in savedInstanceState.">
	//   95  176:invokestatic    #318 <Method int Log.w(String, String)>
	//   96  179:pop             
				}
			}
		}
		if(mPendingFragmentActivityResults == null)
	//*  97  180:aload_0         
	//*  98  181:getfield        #87  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//*  99  184:ifnonnull       203
		{
			mPendingFragmentActivityResults = new SparseArrayCompat();
	//  100  187:aload_0         
	//  101  188:new             #89  <Class SparseArrayCompat>
	//  102  191:dup             
	//  103  192:invokespecial   #408 <Method void SparseArrayCompat()>
	//  104  195:putfield        #87  <Field SparseArrayCompat mPendingFragmentActivityResults>
			mNextCandidateRequestIndex = 0;
	//  105  198:aload_0         
	//  106  199:iconst_0        
	//  107  200:putfield        #102 <Field int mNextCandidateRequestIndex>
		}
		mFragments.dispatchCreate();
	//  108  203:aload_0         
	//  109  204:getfield        #78  <Field FragmentController mFragments>
	//  110  207:invokevirtual   #411 <Method void FragmentController.dispatchCreate()>
	//  111  210:return          
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
	//    5    7:invokespecial   #416 <Method boolean BaseFragmentActivityApi16.onCreatePanelMenu(int, Menu)>
	//    6   10:aload_0         
	//    7   11:getfield        #78  <Field FragmentController mFragments>
	//    8   14:aload_2         
	//    9   15:aload_0         
	//   10   16:invokevirtual   #420 <Method android.view.MenuInflater getMenuInflater()>
	//   11   19:invokevirtual   #424 <Method boolean FragmentController.dispatchCreateOptionsMenu(Menu, android.view.MenuInflater)>
	//   12   22:ior             
	//   13   23:ireturn         
		else
			return super.onCreatePanelMenu(i, menu);
	//   14   24:aload_0         
	//   15   25:iload_1         
	//   16   26:aload_2         
	//   17   27:invokespecial   #416 <Method boolean BaseFragmentActivityApi16.onCreatePanelMenu(int, Menu)>
	//   18   30:ireturn         
	}

	public volatile View onCreateView(View view, String s, Context context, AttributeSet attributeset)
	{
		return super.onCreateView(view, s, context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #425 <Method View BaseFragmentActivityApi16.onCreateView(View, String, Context, AttributeSet)>
	//    6    9:areturn         
	}

	public volatile View onCreateView(String s, Context context, AttributeSet attributeset)
	{
		return super.onCreateView(s, context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #428 <Method View BaseFragmentActivityApi16.onCreateView(String, Context, AttributeSet)>
	//    5    7:areturn         
	}

	protected void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #431 <Method void BaseFragmentActivityApi16.onDestroy()>
		doReallyStop(false);
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #433 <Method void doReallyStop(boolean)>
		if(mViewModelStore != null && !mRetaining)
	//*   5    9:aload_0         
	//*   6   10:getfield        #292 <Field ViewModelStore mViewModelStore>
	//*   7   13:ifnull          30
	//*   8   16:aload_0         
	//*   9   17:getfield        #190 <Field boolean mRetaining>
	//*  10   20:ifne            30
			mViewModelStore.clear();
	//   11   23:aload_0         
	//   12   24:getfield        #292 <Field ViewModelStore mViewModelStore>
	//   13   27:invokevirtual   #436 <Method void ViewModelStore.clear()>
		mFragments.dispatchDestroy();
	//   14   30:aload_0         
	//   15   31:getfield        #78  <Field FragmentController mFragments>
	//   16   34:invokevirtual   #439 <Method void FragmentController.dispatchDestroy()>
	//   17   37:return          
	}

	public void onLowMemory()
	{
		super.onLowMemory();
	//    0    0:aload_0         
	//    1    1:invokespecial   #442 <Method void BaseFragmentActivityApi16.onLowMemory()>
		mFragments.dispatchLowMemory();
	//    2    4:aload_0         
	//    3    5:getfield        #78  <Field FragmentController mFragments>
	//    4    8:invokevirtual   #445 <Method void FragmentController.dispatchLowMemory()>
	//    5   11:return          
	}

	public boolean onMenuItemSelected(int i, MenuItem menuitem)
	{
		if(super.onMenuItemSelected(i, menuitem))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:aload_2         
	//*   3    3:invokespecial   #449 <Method boolean BaseFragmentActivityApi16.onMenuItemSelected(int, MenuItem)>
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
	//   15   24:getfield        #78  <Field FragmentController mFragments>
	//   16   27:aload_2         
	//   17   28:invokevirtual   #453 <Method boolean FragmentController.dispatchContextItemSelected(MenuItem)>
	//   18   31:ireturn         
		} else
		{
			return mFragments.dispatchOptionsItemSelected(menuitem);
	//   19   32:aload_0         
	//   20   33:getfield        #78  <Field FragmentController mFragments>
	//   21   36:aload_2         
	//   22   37:invokevirtual   #456 <Method boolean FragmentController.dispatchOptionsItemSelected(MenuItem)>
	//   23   40:ireturn         
		}
	}

	public void onMultiWindowModeChanged(boolean flag)
	{
		mFragments.dispatchMultiWindowModeChanged(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field FragmentController mFragments>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #461 <Method void FragmentController.dispatchMultiWindowModeChanged(boolean)>
	//    4    8:return          
	}

	protected void onNewIntent(Intent intent)
	{
		super.onNewIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #465 <Method void BaseFragmentActivityApi16.onNewIntent(Intent)>
		mFragments.noteStateNotSaved();
	//    3    5:aload_0         
	//    4    6:getfield        #78  <Field FragmentController mFragments>
	//    5    9:invokevirtual   #301 <Method void FragmentController.noteStateNotSaved()>
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
	//    4    8:getfield        #78  <Field FragmentController mFragments>
	//    5   11:aload_2         
	//    6   12:invokevirtual   #471 <Method void FragmentController.dispatchOptionsMenuClosed(Menu)>
		super.onPanelClosed(i, menu);
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:aload_2         
	//   10   18:invokespecial   #473 <Method void BaseFragmentActivityApi16.onPanelClosed(int, Menu)>
	//   11   21:return          
	}

	protected void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #476 <Method void BaseFragmentActivityApi16.onPause()>
		mResumed = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #250 <Field boolean mResumed>
		if(mHandler.hasMessages(2))
	//*   5    9:aload_0         
	//*   6   10:getfield        #69  <Field Handler mHandler>
	//*   7   13:iconst_2        
	//*   8   14:invokevirtual   #480 <Method boolean Handler.hasMessages(int)>
	//*   9   17:ifeq            32
		{
			mHandler.removeMessages(2);
	//   10   20:aload_0         
	//   11   21:getfield        #69  <Field Handler mHandler>
	//   12   24:iconst_2        
	//   13   25:invokevirtual   #196 <Method void Handler.removeMessages(int)>
			onResumeFragments();
	//   14   28:aload_0         
	//   15   29:invokevirtual   #483 <Method void onResumeFragments()>
		}
		mFragments.dispatchPause();
	//   16   32:aload_0         
	//   17   33:getfield        #78  <Field FragmentController mFragments>
	//   18   36:invokevirtual   #486 <Method void FragmentController.dispatchPause()>
	//   19   39:return          
	}

	public void onPictureInPictureModeChanged(boolean flag)
	{
		mFragments.dispatchPictureInPictureModeChanged(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field FragmentController mFragments>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #490 <Method void FragmentController.dispatchPictureInPictureModeChanged(boolean)>
	//    4    8:return          
	}

	protected void onPostResume()
	{
		super.onPostResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #493 <Method void BaseFragmentActivityApi16.onPostResume()>
		mHandler.removeMessages(2);
	//    2    4:aload_0         
	//    3    5:getfield        #69  <Field Handler mHandler>
	//    4    8:iconst_2        
	//    5    9:invokevirtual   #196 <Method void Handler.removeMessages(int)>
		onResumeFragments();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #483 <Method void onResumeFragments()>
		mFragments.execPendingActions();
	//    8   16:aload_0         
	//    9   17:getfield        #78  <Field FragmentController mFragments>
	//   10   20:invokevirtual   #496 <Method boolean FragmentController.execPendingActions()>
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
	//    4    4:invokespecial   #506 <Method boolean BaseFragmentActivityApi16.onPreparePanel(int, View, Menu)>
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
	//    7   11:invokevirtual   #508 <Method boolean onPrepareOptionsPanel(View, Menu)>
	//    8   14:aload_0         
	//    9   15:getfield        #78  <Field FragmentController mFragments>
	//   10   18:aload_3         
	//   11   19:invokevirtual   #512 <Method boolean FragmentController.dispatchPrepareOptionsMenu(Menu)>
	//   12   22:ior             
	//   13   23:ireturn         
		else
			return super.onPreparePanel(i, view, menu);
	//   14   24:aload_0         
	//   15   25:iload_1         
	//   16   26:aload_2         
	//   17   27:aload_3         
	//   18   28:invokespecial   #506 <Method boolean BaseFragmentActivityApi16.onPreparePanel(int, View, Menu)>
	//   19   31:ireturn         
	}

	void onReallyStop()
	{
		mFragments.dispatchReallyStop();
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field FragmentController mFragments>
	//    2    4:invokevirtual   #515 <Method void FragmentController.dispatchReallyStop()>
	//    3    7:return          
	}

	public void onRequestPermissionsResult(int i, String as[], int ai[])
	{
		mFragments.noteStateNotSaved();
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field FragmentController mFragments>
	//    2    4:invokevirtual   #301 <Method void FragmentController.noteStateNotSaved()>
		int j = i >> 16 & 0xffff;
	//    3    7:iload_1         
	//    4    8:bipush          16
	//    5   10:ishr            
	//    6   11:ldc2            #325 <Int 65535>
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
	//   16   29:getfield        #87  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//   17   32:iload           4
	//   18   34:invokevirtual   #305 <Method Object SparseArrayCompat.get(int)>
	//   19   37:checkcast       #307 <Class String>
	//   20   40:astore          5
			mPendingFragmentActivityResults.remove(j);
	//   21   42:aload_0         
	//   22   43:getfield        #87  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//   23   46:iload           4
	//   24   48:invokevirtual   #310 <Method void SparseArrayCompat.remove(int)>
			if(s == null)
	//*  25   51:aload           5
	//*  26   53:ifnonnull       66
			{
				Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
	//   27   56:ldc1            #41  <String "FragmentActivity">
	//   28   58:ldc2            #312 <String "Activity result delivered for unknown Fragment.">
	//   29   61:invokestatic    #318 <Method int Log.w(String, String)>
	//   30   64:pop             
				return;
	//   31   65:return          
			}
			Fragment fragment = mFragments.findFragmentByWho(s);
	//   32   66:aload_0         
	//   33   67:getfield        #78  <Field FragmentController mFragments>
	//   34   70:aload           5
	//   35   72:invokevirtual   #322 <Method Fragment FragmentController.findFragmentByWho(String)>
	//   36   75:astore          6
			if(fragment == null)
	//*  37   77:aload           6
	//*  38   79:ifnonnull       116
			{
				as = ((String []) (new StringBuilder()));
	//   39   82:new             #229 <Class StringBuilder>
	//   40   85:dup             
	//   41   86:invokespecial   #230 <Method void StringBuilder()>
	//   42   89:astore_2        
				((StringBuilder) (as)).append("Activity result no fragment exists for who: ");
	//   43   90:aload_2         
	//   44   91:ldc2            #324 <String "Activity result no fragment exists for who: ">
	//   45   94:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   46   97:pop             
				((StringBuilder) (as)).append(s);
	//   47   98:aload_2         
	//   48   99:aload           5
	//   49  101:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   50  104:pop             
				Log.w("FragmentActivity", ((StringBuilder) (as)).toString());
	//   51  105:ldc1            #41  <String "FragmentActivity">
	//   52  107:aload_2         
	//   53  108:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   54  111:invokestatic    #318 <Method int Log.w(String, String)>
	//   55  114:pop             
				return;
	//   56  115:return          
			}
			fragment.onRequestPermissionsResult(i & 0xffff, as, ai);
	//   57  116:aload           6
	//   58  118:iload_1         
	//   59  119:ldc2            #325 <Int 65535>
	//   60  122:iand            
	//   61  123:aload_2         
	//   62  124:aload_3         
	//   63  125:invokevirtual   #519 <Method void Fragment.onRequestPermissionsResult(int, String[], int[])>
		}
	//   64  128:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #522 <Method void BaseFragmentActivityApi16.onResume()>
		mHandler.sendEmptyMessage(2);
	//    2    4:aload_0         
	//    3    5:getfield        #69  <Field Handler mHandler>
	//    4    8:iconst_2        
	//    5    9:invokevirtual   #525 <Method boolean Handler.sendEmptyMessage(int)>
	//    6   12:pop             
		mResumed = true;
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:putfield        #250 <Field boolean mResumed>
		mFragments.execPendingActions();
	//   10   18:aload_0         
	//   11   19:getfield        #78  <Field FragmentController mFragments>
	//   12   22:invokevirtual   #496 <Method boolean FragmentController.execPendingActions()>
	//   13   25:pop             
	//   14   26:return          
	}

	protected void onResumeFragments()
	{
		mFragments.dispatchResume();
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field FragmentController mFragments>
	//    2    4:invokevirtual   #528 <Method void FragmentController.dispatchResume()>
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
		if(mStopped)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field boolean mStopped>
	//*   2    4:ifeq            12
			doReallyStop(true);
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:invokevirtual   #433 <Method void doReallyStop(boolean)>
		Object obj = onRetainCustomNonConfigurationInstance();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #532 <Method Object onRetainCustomNonConfigurationInstance()>
	//    8   16:astore_1        
		FragmentManagerNonConfig fragmentmanagernonconfig = mFragments.retainNestedNonConfig();
	//    9   17:aload_0         
	//   10   18:getfield        #78  <Field FragmentController mFragments>
	//   11   21:invokevirtual   #536 <Method FragmentManagerNonConfig FragmentController.retainNestedNonConfig()>
	//   12   24:astore_2        
		if(fragmentmanagernonconfig == null && mViewModelStore == null && obj == null)
	//*  13   25:aload_2         
	//*  14   26:ifnonnull       42
	//*  15   29:aload_0         
	//*  16   30:getfield        #292 <Field ViewModelStore mViewModelStore>
	//*  17   33:ifnonnull       42
	//*  18   36:aload_1         
	//*  19   37:ifnonnull       42
		{
			return ((Object) (null));
	//   20   40:aconst_null     
	//   21   41:areturn         
		} else
		{
			NonConfigurationInstances nonconfigurationinstances = new NonConfigurationInstances();
	//   22   42:new             #17  <Class FragmentActivity$NonConfigurationInstances>
	//   23   45:dup             
	//   24   46:invokespecial   #537 <Method void FragmentActivity$NonConfigurationInstances()>
	//   25   49:astore_3        
			nonconfigurationinstances.custom = obj;
	//   26   50:aload_3         
	//   27   51:aload_1         
	//   28   52:putfield        #271 <Field Object FragmentActivity$NonConfigurationInstances.custom>
			nonconfigurationinstances.viewModelStore = mViewModelStore;
	//   29   55:aload_3         
	//   30   56:aload_0         
	//   31   57:getfield        #292 <Field ViewModelStore mViewModelStore>
	//   32   60:putfield        #373 <Field ViewModelStore FragmentActivity$NonConfigurationInstances.viewModelStore>
			nonconfigurationinstances.fragments = fragmentmanagernonconfig;
	//   33   63:aload_3         
	//   34   64:aload_2         
	//   35   65:putfield        #383 <Field FragmentManagerNonConfig FragmentActivity$NonConfigurationInstances.fragments>
			return ((Object) (nonconfigurationinstances));
	//   36   68:aload_3         
	//   37   69:areturn         
		}
	}

	protected void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #540 <Method void BaseFragmentActivityApi16.onSaveInstanceState(Bundle)>
		markFragmentsCreated();
	//    3    5:aload_0         
	//    4    6:invokespecial   #542 <Method void markFragmentsCreated()>
		android.os.Parcelable parcelable = mFragments.saveAllState();
	//    5    9:aload_0         
	//    6   10:getfield        #78  <Field FragmentController mFragments>
	//    7   13:invokevirtual   #546 <Method android.os.Parcelable FragmentController.saveAllState()>
	//    8   16:astore_3        
		if(parcelable != null)
	//*   9   17:aload_3         
	//*  10   18:ifnull          28
			bundle.putParcelable("android:support:fragments", parcelable);
	//   11   21:aload_1         
	//   12   22:ldc1            #25  <String "android:support:fragments">
	//   13   24:aload_3         
	//   14   25:invokevirtual   #550 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		if(mPendingFragmentActivityResults.size() > 0)
	//*  15   28:aload_0         
	//*  16   29:getfield        #87  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//*  17   32:invokevirtual   #93  <Method int SparseArrayCompat.size()>
	//*  18   35:ifle            131
		{
			bundle.putInt("android:support:next_request_index", mNextCandidateRequestIndex);
	//   19   38:aload_1         
	//   20   39:ldc1            #35  <String "android:support:next_request_index">
	//   21   41:aload_0         
	//   22   42:getfield        #102 <Field int mNextCandidateRequestIndex>
	//   23   45:invokevirtual   #554 <Method void Bundle.putInt(String, int)>
			int ai[] = new int[mPendingFragmentActivityResults.size()];
	//   24   48:aload_0         
	//   25   49:getfield        #87  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//   26   52:invokevirtual   #93  <Method int SparseArrayCompat.size()>
	//   27   55:newarray        int[]
	//   28   57:astore_3        
			String as[] = new String[mPendingFragmentActivityResults.size()];
	//   29   58:aload_0         
	//   30   59:getfield        #87  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//   31   62:invokevirtual   #93  <Method int SparseArrayCompat.size()>
	//   32   65:anewarray       String[]
	//   33   68:astore          4
			for(int i = 0; i < mPendingFragmentActivityResults.size(); i++)
	//*  34   70:iconst_0        
	//*  35   71:istore_2        
	//*  36   72:iload_2         
	//*  37   73:aload_0         
	//*  38   74:getfield        #87  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//*  39   77:invokevirtual   #93  <Method int SparseArrayCompat.size()>
	//*  40   80:icmpge          116
			{
				ai[i] = mPendingFragmentActivityResults.keyAt(i);
	//   41   83:aload_3         
	//   42   84:iload_2         
	//   43   85:aload_0         
	//   44   86:getfield        #87  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//   45   89:iload_2         
	//   46   90:invokevirtual   #557 <Method int SparseArrayCompat.keyAt(int)>
	//   47   93:iastore         
				as[i] = (String)mPendingFragmentActivityResults.valueAt(i);
	//   48   94:aload           4
	//   49   96:iload_2         
	//   50   97:aload_0         
	//   51   98:getfield        #87  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//   52  101:iload_2         
	//   53  102:invokevirtual   #560 <Method Object SparseArrayCompat.valueAt(int)>
	//   54  105:checkcast       #307 <Class String>
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
	//   64  120:invokevirtual   #564 <Method void Bundle.putIntArray(String, int[])>
			bundle.putStringArray("android:support:request_fragment_who", as);
	//   65  123:aload_1         
	//   66  124:ldc1            #38  <String "android:support:request_fragment_who">
	//   67  126:aload           4
	//   68  128:invokevirtual   #568 <Method void Bundle.putStringArray(String, String[])>
		}
	//   69  131:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #571 <Method void BaseFragmentActivityApi16.onStart()>
		mStopped = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #80  <Field boolean mStopped>
		mReallyStopped = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #82  <Field boolean mReallyStopped>
		mHandler.removeMessages(1);
	//    8   14:aload_0         
	//    9   15:getfield        #69  <Field Handler mHandler>
	//   10   18:iconst_1        
	//   11   19:invokevirtual   #196 <Method void Handler.removeMessages(int)>
		if(!mCreated)
	//*  12   22:aload_0         
	//*  13   23:getfield        #244 <Field boolean mCreated>
	//*  14   26:ifne            41
		{
			mCreated = true;
	//   15   29:aload_0         
	//   16   30:iconst_1        
	//   17   31:putfield        #244 <Field boolean mCreated>
			mFragments.dispatchActivityCreated();
	//   18   34:aload_0         
	//   19   35:getfield        #78  <Field FragmentController mFragments>
	//   20   38:invokevirtual   #574 <Method void FragmentController.dispatchActivityCreated()>
		}
		mFragments.noteStateNotSaved();
	//   21   41:aload_0         
	//   22   42:getfield        #78  <Field FragmentController mFragments>
	//   23   45:invokevirtual   #301 <Method void FragmentController.noteStateNotSaved()>
		mFragments.execPendingActions();
	//   24   48:aload_0         
	//   25   49:getfield        #78  <Field FragmentController mFragments>
	//   26   52:invokevirtual   #496 <Method boolean FragmentController.execPendingActions()>
	//   27   55:pop             
		mFragments.dispatchStart();
	//   28   56:aload_0         
	//   29   57:getfield        #78  <Field FragmentController mFragments>
	//   30   60:invokevirtual   #577 <Method void FragmentController.dispatchStart()>
	//   31   63:return          
	}

	public void onStateNotSaved()
	{
		mFragments.noteStateNotSaved();
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field FragmentController mFragments>
	//    2    4:invokevirtual   #301 <Method void FragmentController.noteStateNotSaved()>
	//    3    7:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #581 <Method void BaseFragmentActivityApi16.onStop()>
		mStopped = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #80  <Field boolean mStopped>
		markFragmentsCreated();
	//    5    9:aload_0         
	//    6   10:invokespecial   #542 <Method void markFragmentsCreated()>
		mHandler.sendEmptyMessage(1);
	//    7   13:aload_0         
	//    8   14:getfield        #69  <Field Handler mHandler>
	//    9   17:iconst_1        
	//   10   18:invokevirtual   #525 <Method boolean Handler.sendEmptyMessage(int)>
	//   11   21:pop             
		mFragments.dispatchStop();
	//   12   22:aload_0         
	//   13   23:getfield        #78  <Field FragmentController mFragments>
	//   14   26:invokevirtual   #584 <Method void FragmentController.dispatchStop()>
	//   15   29:return          
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
	//    6    8:invokestatic    #590 <Method void ActivityCompat.requestPermissions(android.app.Activity, String[], int)>
			return;
	//    7   11:return          
		}
		checkForValidRequestCode(i);
	//    8   12:iload_3         
	//    9   13:invokestatic    #593 <Method void checkForValidRequestCode(int)>
		mRequestedPermissionsFromFragment = true;
	//   10   16:aload_0         
	//   11   17:iconst_1        
	//   12   18:putfield        #595 <Field boolean mRequestedPermissionsFromFragment>
		ActivityCompat.requestPermissions(((android.app.Activity) (this)), as, (allocateRequestIndex(fragment) + 1 << 16) + (i & 0xffff));
	//   13   21:aload_0         
	//   14   22:aload_2         
	//   15   23:aload_0         
	//   16   24:aload_1         
	//   17   25:invokespecial   #597 <Method int allocateRequestIndex(Fragment)>
	//   18   28:iconst_1        
	//   19   29:iadd            
	//   20   30:bipush          16
	//   21   32:ishl            
	//   22   33:iload_3         
	//   23   34:ldc2            #325 <Int 65535>
	//   24   37:iand            
	//   25   38:iadd            
	//   26   39:invokestatic    #590 <Method void ActivityCompat.requestPermissions(android.app.Activity, String[], int)>
		mRequestedPermissionsFromFragment = false;
	//   27   42:aload_0         
	//   28   43:iconst_0        
	//   29   44:putfield        #595 <Field boolean mRequestedPermissionsFromFragment>
		return;
	//   30   47:return          
		fragment;
	//   31   48:astore_1        
		mRequestedPermissionsFromFragment = false;
	//   32   49:aload_0         
	//   33   50:iconst_0        
	//   34   51:putfield        #595 <Field boolean mRequestedPermissionsFromFragment>
		throw fragment;
	//   35   54:aload_1         
	//   36   55:athrow          
	}

	public void setEnterSharedElementCallback(SharedElementCallback sharedelementcallback)
	{
		ActivityCompat.setEnterSharedElementCallback(((android.app.Activity) (this)), sharedelementcallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #602 <Method void ActivityCompat.setEnterSharedElementCallback(android.app.Activity, SharedElementCallback)>
	//    3    5:return          
	}

	public void setExitSharedElementCallback(SharedElementCallback sharedelementcallback)
	{
		ActivityCompat.setExitSharedElementCallback(((android.app.Activity) (this)), sharedelementcallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #605 <Method void ActivityCompat.setExitSharedElementCallback(android.app.Activity, SharedElementCallback)>
	//    3    5:return          
	}

	public void startActivityForResult(Intent intent, int i)
	{
		if(!mStartedActivityFromFragment && i != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #610 <Field boolean mStartedActivityFromFragment>
	//*   2    4:ifne            16
	//*   3    7:iload_2         
	//*   4    8:iconst_m1       
	//*   5    9:icmpeq          16
			checkForValidRequestCode(i);
	//    6   12:iload_2         
	//    7   13:invokestatic    #593 <Method void checkForValidRequestCode(int)>
		super.startActivityForResult(intent, i);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:iload_2         
	//   11   19:invokespecial   #612 <Method void BaseFragmentActivityApi16.startActivityForResult(Intent, int)>
	//   12   22:return          
	}

	public volatile void startActivityForResult(Intent intent, int i, Bundle bundle)
	{
		super.startActivityForResult(intent, i, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #617 <Method void BaseFragmentActivityApi16.startActivityForResult(Intent, int, Bundle)>
	//    5    7:return          
	}

	public void startActivityFromFragment(Fragment fragment, Intent intent, int i)
	{
		startActivityFromFragment(fragment, intent, i, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aconst_null     
	//    5    5:invokevirtual   #622 <Method void startActivityFromFragment(Fragment, Intent, int, Bundle)>
	//    6    8:return          
	}

	public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle)
	{
		mStartedActivityFromFragment = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #610 <Field boolean mStartedActivityFromFragment>
		if(i != -1)
			break MISSING_BLOCK_LABEL_28;
	//    3    5:iload_3         
	//    4    6:iconst_m1       
	//    5    7:icmpne          28
		ActivityCompat.startActivityForResult(((android.app.Activity) (this)), intent, -1, bundle);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:iconst_m1       
	//    9   13:aload           4
	//   10   15:invokestatic    #625 <Method void ActivityCompat.startActivityForResult(android.app.Activity, Intent, int, Bundle)>
		mStartedActivityFromFragment = false;
	//   11   18:aload_0         
	//   12   19:iconst_0        
	//   13   20:putfield        #610 <Field boolean mStartedActivityFromFragment>
		return;
	//   14   23:return          
		fragment;
	//   15   24:astore_1        
		break MISSING_BLOCK_LABEL_61;
	//   16   25:goto            61
		checkForValidRequestCode(i);
	//   17   28:iload_3         
	//   18   29:invokestatic    #593 <Method void checkForValidRequestCode(int)>
		ActivityCompat.startActivityForResult(((android.app.Activity) (this)), intent, (allocateRequestIndex(fragment) + 1 << 16) + (i & 0xffff), bundle);
	//   19   32:aload_0         
	//   20   33:aload_2         
	//   21   34:aload_0         
	//   22   35:aload_1         
	//   23   36:invokespecial   #597 <Method int allocateRequestIndex(Fragment)>
	//   24   39:iconst_1        
	//   25   40:iadd            
	//   26   41:bipush          16
	//   27   43:ishl            
	//   28   44:iload_3         
	//   29   45:ldc2            #325 <Int 65535>
	//   30   48:iand            
	//   31   49:iadd            
	//   32   50:aload           4
	//   33   52:invokestatic    #625 <Method void ActivityCompat.startActivityForResult(android.app.Activity, Intent, int, Bundle)>
		mStartedActivityFromFragment = false;
	//   34   55:aload_0         
	//   35   56:iconst_0        
	//   36   57:putfield        #610 <Field boolean mStartedActivityFromFragment>
		return;
	//   37   60:return          
		mStartedActivityFromFragment = false;
	//   38   61:aload_0         
	//   39   62:iconst_0        
	//   40   63:putfield        #610 <Field boolean mStartedActivityFromFragment>
		throw fragment;
	//   41   66:aload_1         
	//   42   67:athrow          
	}

	public volatile void startIntentSenderForResult(IntentSender intentsender, int i, Intent intent, int j, int k, int l)
		throws android.content.IntentSender.SendIntentException
	{
		super.startIntentSenderForResult(intentsender, i, intent, j, k, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iload           6
	//    7   10:invokespecial   #631 <Method void BaseFragmentActivityApi16.startIntentSenderForResult(IntentSender, int, Intent, int, int, int)>
	//    8   13:return          
	}

	public volatile void startIntentSenderForResult(IntentSender intentsender, int i, Intent intent, int j, int k, int l, Bundle bundle)
		throws android.content.IntentSender.SendIntentException
	{
		super.startIntentSenderForResult(intentsender, i, intent, j, k, l, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iload           6
	//    7   10:aload           7
	//    8   12:invokespecial   #635 <Method void BaseFragmentActivityApi16.startIntentSenderForResult(IntentSender, int, Intent, int, int, int, Bundle)>
	//    9   15:return          
	}

	public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentsender, int i, Intent intent, int j, int k, int l, 
			Bundle bundle)
		throws android.content.IntentSender.SendIntentException
	{
		mStartedIntentSenderFromFragment = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #640 <Field boolean mStartedIntentSenderFromFragment>
		if(i != -1)
			break MISSING_BLOCK_LABEL_36;
	//    3    5:iload_3         
	//    4    6:iconst_m1       
	//    5    7:icmpne          36
		ActivityCompat.startIntentSenderForResult(((android.app.Activity) (this)), intentsender, i, intent, j, k, l, bundle);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:iload_3         
	//    9   13:aload           4
	//   10   15:iload           5
	//   11   17:iload           6
	//   12   19:iload           7
	//   13   21:aload           8
	//   14   23:invokestatic    #643 <Method void ActivityCompat.startIntentSenderForResult(android.app.Activity, IntentSender, int, Intent, int, int, int, Bundle)>
		mStartedIntentSenderFromFragment = false;
	//   15   26:aload_0         
	//   16   27:iconst_0        
	//   17   28:putfield        #640 <Field boolean mStartedIntentSenderFromFragment>
		return;
	//   18   31:return          
		fragment;
	//   19   32:astore_1        
		break MISSING_BLOCK_LABEL_77;
	//   20   33:goto            77
		checkForValidRequestCode(i);
	//   21   36:iload_3         
	//   22   37:invokestatic    #593 <Method void checkForValidRequestCode(int)>
		ActivityCompat.startIntentSenderForResult(((android.app.Activity) (this)), intentsender, (allocateRequestIndex(fragment) + 1 << 16) + (0xffff & i), intent, j, k, l, bundle);
	//   23   40:aload_0         
	//   24   41:aload_2         
	//   25   42:aload_0         
	//   26   43:aload_1         
	//   27   44:invokespecial   #597 <Method int allocateRequestIndex(Fragment)>
	//   28   47:iconst_1        
	//   29   48:iadd            
	//   30   49:bipush          16
	//   31   51:ishl            
	//   32   52:ldc2            #325 <Int 65535>
	//   33   55:iload_3         
	//   34   56:iand            
	//   35   57:iadd            
	//   36   58:aload           4
	//   37   60:iload           5
	//   38   62:iload           6
	//   39   64:iload           7
	//   40   66:aload           8
	//   41   68:invokestatic    #643 <Method void ActivityCompat.startIntentSenderForResult(android.app.Activity, IntentSender, int, Intent, int, int, int, Bundle)>
		mStartedIntentSenderFromFragment = false;
	//   42   71:aload_0         
	//   43   72:iconst_0        
	//   44   73:putfield        #640 <Field boolean mStartedIntentSenderFromFragment>
		return;
	//   45   76:return          
		mStartedIntentSenderFromFragment = false;
	//   46   77:aload_0         
	//   47   78:iconst_0        
	//   48   79:putfield        #640 <Field boolean mStartedIntentSenderFromFragment>
		throw fragment;
	//   49   82:aload_1         
	//   50   83:athrow          
	}

	public void supportFinishAfterTransition()
	{
		ActivityCompat.finishAfterTransition(((android.app.Activity) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #648 <Method void ActivityCompat.finishAfterTransition(android.app.Activity)>
	//    2    4:return          
	}

	public void supportInvalidateOptionsMenu()
	{
		invalidateOptionsMenu();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #653 <Method void invalidateOptionsMenu()>
	//    2    4:return          
	}

	public void supportPostponeEnterTransition()
	{
		ActivityCompat.postponeEnterTransition(((android.app.Activity) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #658 <Method void ActivityCompat.postponeEnterTransition(android.app.Activity)>
	//    2    4:return          
	}

	public void supportStartPostponedEnterTransition()
	{
		ActivityCompat.startPostponedEnterTransition(((android.app.Activity) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #662 <Method void ActivityCompat.startPostponedEnterTransition(android.app.Activity)>
	//    2    4:return          
	}

	public final void validateRequestPermissionsRequestCode(int i)
	{
		if(!mRequestedPermissionsFromFragment && i != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #595 <Field boolean mRequestedPermissionsFromFragment>
	//*   2    4:ifne            16
	//*   3    7:iload_1         
	//*   4    8:iconst_m1       
	//*   5    9:icmpeq          16
			checkForValidRequestCode(i);
	//    6   12:iload_1         
	//    7   13:invokestatic    #593 <Method void checkForValidRequestCode(int)>
	//    8   16:return          
	}

	static final String ALLOCATED_REQUEST_INDICIES_TAG = "android:support:request_indicies";
	static final String FRAGMENTS_TAG = "android:support:fragments";
	static final int MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS = 65534;
	static final int MSG_REALLY_STOPPED = 1;
	static final int MSG_RESUME_PENDING = 2;
	static final String NEXT_CANDIDATE_REQUEST_INDEX_TAG = "android:support:next_request_index";
	static final String REQUEST_FRAGMENT_WHO_TAG = "android:support:request_fragment_who";
	private static final String TAG = "FragmentActivity";
	boolean mCreated;
	final FragmentController mFragments = FragmentController.createController(((FragmentHostCallback) (new HostCallbacks())));
	final Handler mHandler = new Handler() {

		public void handleMessage(Message message)
		{
			switch(message.what)
		//*   0    0:aload_1         
		//*   1    1:getfield        #24  <Field int Message.what>
			{
		//*   2    4:tableswitch     1 2: default 28
		//		               1 53
		//		               2 34
			default:
				super.handleMessage(message);
		//    3   28:aload_0         
		//    4   29:aload_1         
		//    5   30:invokespecial   #26  <Method void Handler.handleMessage(Message)>
				return;
		//    6   33:return          

			case 2: // '\002'
				onResumeFragments();
		//    7   34:aload_0         
		//    8   35:getfield        #12  <Field FragmentActivity this$0>
		//    9   38:invokevirtual   #29  <Method void FragmentActivity.onResumeFragments()>
				mFragments.execPendingActions();
		//   10   41:aload_0         
		//   11   42:getfield        #12  <Field FragmentActivity this$0>
		//   12   45:getfield        #33  <Field FragmentController FragmentActivity.mFragments>
		//   13   48:invokevirtual   #39  <Method boolean FragmentController.execPendingActions()>
		//   14   51:pop             
				return;
		//   15   52:return          

			case 1: // '\001'
				break;
			}
			if(mStopped)
		//*  16   53:aload_0         
		//*  17   54:getfield        #12  <Field FragmentActivity this$0>
		//*  18   57:getfield        #43  <Field boolean FragmentActivity.mStopped>
		//*  19   60:ifeq            71
				doReallyStop(false);
		//   20   63:aload_0         
		//   21   64:getfield        #12  <Field FragmentActivity this$0>
		//   22   67:iconst_0        
		//   23   68:invokevirtual   #47  <Method void FragmentActivity.doReallyStop(boolean)>
		//   24   71:return          
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
	LoaderManager mLoaderManager;
	int mNextCandidateRequestIndex;
	SparseArrayCompat mPendingFragmentActivityResults;
	boolean mReallyStopped;
	boolean mRequestedPermissionsFromFragment;
	boolean mResumed;
	boolean mRetaining;
	boolean mStopped;
	private ViewModelStore mViewModelStore;
}
