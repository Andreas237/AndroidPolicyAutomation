// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.arch.lifecycle.b;
import android.arch.lifecycle.d;
import android.content.*;
import android.content.res.Configuration;
import android.os.*;
import android.support.v4.f.m;
import android.support.v4.f.n;
import android.util.AttributeSet;
import android.util.Log;
import android.view.*;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package android.support.v4.app:
//			BaseFragmentActivityApi16, FragmentController, Fragment, FragmentManager, 
//			ActivityCompat, LoaderManager, SharedElementCallback, FragmentHostCallback, 
//			FragmentManagerNonConfig

public class FragmentActivity extends BaseFragmentActivityApi16
	implements ActivityCompat.OnRequestPermissionsResultCallback, ActivityCompat.RequestPermissionsRequestCodeValidator
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
			return getLayoutInflater().cloneInContext(((Context) (FragmentActivity.this)));
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field FragmentActivity this$0>
		//    2    4:invokevirtual   #41  <Method LayoutInflater FragmentActivity.getLayoutInflater()>
		//    3    7:aload_0         
		//    4    8:getfield        #14  <Field FragmentActivity this$0>
		//    5   11:invokevirtual   #47  <Method LayoutInflater LayoutInflater.cloneInContext(Context)>
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
		m loaders;

		NonConfigurationInstances()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
		//    2    4:return          
		}
	}


	public FragmentActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void BaseFragmentActivityApi16()>
	//    2    4:aload_0         
	//    3    5:new             #10  <Class FragmentActivity$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #61  <Method void FragmentActivity$1(FragmentActivity)>
	//    7   13:putfield        #63  <Field Handler mHandler>
	//    8   16:aload_0         
	//    9   17:new             #12  <Class FragmentActivity$HostCallbacks>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #64  <Method void FragmentActivity$HostCallbacks(FragmentActivity)>
	//   13   25:invokestatic    #70  <Method FragmentController FragmentController.createController(FragmentHostCallback)>
	//   14   28:putfield        #72  <Field FragmentController mFragments>
		mStopped = true;
	//   15   31:aload_0         
	//   16   32:iconst_1        
	//   17   33:putfield        #74  <Field boolean mStopped>
		mReallyStopped = true;
	//   18   36:aload_0         
	//   19   37:iconst_1        
	//   20   38:putfield        #76  <Field boolean mReallyStopped>
	//   21   41:return          
	}

	private int allocateRequestIndex(Fragment fragment)
	{
		if(mPendingFragmentActivityResults.b() >= 65534)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field n mPendingFragmentActivityResults>
	//*   2    4:invokevirtual   #87  <Method int n.b()>
	//*   3    7:ldc1            #26  <Int 65534>
	//*   4    9:icmplt          22
			throw new IllegalStateException("Too many pending Fragment activity results.");
	//    5   12:new             #89  <Class IllegalStateException>
	//    6   15:dup             
	//    7   16:ldc1            #91  <String "Too many pending Fragment activity results.">
	//    8   18:invokespecial   #94  <Method void IllegalStateException(String)>
	//    9   21:athrow          
		for(; mPendingFragmentActivityResults.g(mNextCandidateRequestIndex) >= 0; mNextCandidateRequestIndex = (mNextCandidateRequestIndex + 1) % 65534);
	//   10   22:aload_0         
	//   11   23:getfield        #81  <Field n mPendingFragmentActivityResults>
	//   12   26:aload_0         
	//   13   27:getfield        #96  <Field int mNextCandidateRequestIndex>
	//   14   30:invokevirtual   #100 <Method int n.g(int)>
	//   15   33:iflt            52
	//   16   36:aload_0         
	//   17   37:aload_0         
	//   18   38:getfield        #96  <Field int mNextCandidateRequestIndex>
	//   19   41:iconst_1        
	//   20   42:iadd            
	//   21   43:ldc1            #26  <Int 65534>
	//   22   45:irem            
	//   23   46:putfield        #96  <Field int mNextCandidateRequestIndex>
	//*  24   49:goto            22
		int i = mNextCandidateRequestIndex;
	//   25   52:aload_0         
	//   26   53:getfield        #96  <Field int mNextCandidateRequestIndex>
	//   27   56:istore_2        
		mPendingFragmentActivityResults.b(i, ((Object) (fragment.mWho)));
	//   28   57:aload_0         
	//   29   58:getfield        #81  <Field n mPendingFragmentActivityResults>
	//   30   61:iload_2         
	//   31   62:aload_1         
	//   32   63:getfield        #105 <Field String Fragment.mWho>
	//   33   66:invokevirtual   #108 <Method void n.b(int, Object)>
		mNextCandidateRequestIndex = (mNextCandidateRequestIndex + 1) % 65534;
	//   34   69:aload_0         
	//   35   70:aload_0         
	//   36   71:getfield        #96  <Field int mNextCandidateRequestIndex>
	//   37   74:iconst_1        
	//   38   75:iadd            
	//   39   76:ldc1            #26  <Int 65534>
	//   40   78:irem            
	//   41   79:putfield        #96  <Field int mNextCandidateRequestIndex>
		return i;
	//   42   82:iload_2         
	//   43   83:ireturn         
	}

	private static void markState(FragmentManager fragmentmanager, android.arch.lifecycle.b.b b)
	{
		fragmentmanager = ((FragmentManager) (((Collection) (fragmentmanager.getFragments())).iterator()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #116 <Method java.util.List FragmentManager.getFragments()>
	//    2    4:invokeinterface #122 <Method Iterator Collection.iterator()>
	//    3    9:astore_0        
		do
		{
			if(!((Iterator) (fragmentmanager)).hasNext())
				break;
	//    4   10:aload_0         
	//    5   11:invokeinterface #128 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            55
			Fragment fragment = (Fragment)((Iterator) (fragmentmanager)).next();
	//    7   19:aload_0         
	//    8   20:invokeinterface #132 <Method Object Iterator.next()>
	//    9   25:checkcast       #102 <Class Fragment>
	//   10   28:astore_2        
			if(fragment != null)
	//*  11   29:aload_2         
	//*  12   30:ifnonnull       36
	//*  13   33:goto            10
			{
				fragment.mLifecycleRegistry.a(b);
	//   14   36:aload_2         
	//   15   37:getfield        #136 <Field d Fragment.mLifecycleRegistry>
	//   16   40:aload_1         
	//   17   41:invokevirtual   #142 <Method void d.a(android.arch.lifecycle.b$b)>
				markState(fragment.getChildFragmentManager(), b);
	//   18   44:aload_2         
	//   19   45:invokevirtual   #146 <Method FragmentManager Fragment.getChildFragmentManager()>
	//   20   48:aload_1         
	//   21   49:invokestatic    #148 <Method void markState(FragmentManager, android.arch.lifecycle.b$b)>
			}
		} while(true);
	//   22   52:goto            10
	//   23   55:return          
	}

	final View dispatchFragmentsOnCreateView(View view, String s, Context context, AttributeSet attributeset)
	{
		return mFragments.onCreateView(view, s, context, attributeset);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field FragmentController mFragments>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #153 <Method View FragmentController.onCreateView(View, String, Context, AttributeSet)>
	//    7   12:areturn         
	}

	void doReallyStop(boolean flag)
	{
		if(!mReallyStopped)
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field boolean mReallyStopped>
	//*   2    4:ifne            30
		{
			mReallyStopped = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #76  <Field boolean mReallyStopped>
			mRetaining = flag;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #157 <Field boolean mRetaining>
			mHandler.removeMessages(1);
	//    9   17:aload_0         
	//   10   18:getfield        #63  <Field Handler mHandler>
	//   11   21:iconst_1        
	//   12   22:invokevirtual   #163 <Method void Handler.removeMessages(int)>
			onReallyStop();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #166 <Method void onReallyStop()>
			return;
	//   15   29:return          
		}
		if(flag)
	//*  16   30:iload_1         
	//*  17   31:ifeq            49
		{
			mFragments.doLoaderStart();
	//   18   34:aload_0         
	//   19   35:getfield        #72  <Field FragmentController mFragments>
	//   20   38:invokevirtual   #169 <Method void FragmentController.doLoaderStart()>
			mFragments.doLoaderStop(true);
	//   21   41:aload_0         
	//   22   42:getfield        #72  <Field FragmentController mFragments>
	//   23   45:iconst_1        
	//   24   46:invokevirtual   #172 <Method void FragmentController.doLoaderStop(boolean)>
		}
	//   25   49:return          
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		super.dump(s, filedescriptor, printwriter, as);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #176 <Method void BaseFragmentActivityApi16.dump(String, FileDescriptor, PrintWriter, String[])>
		printwriter.print(s);
	//    6    9:aload_3         
	//    7   10:aload_1         
	//    8   11:invokevirtual   #181 <Method void PrintWriter.print(String)>
		printwriter.print("Local FragmentActivity ");
	//    9   14:aload_3         
	//   10   15:ldc1            #183 <String "Local FragmentActivity ">
	//   11   17:invokevirtual   #181 <Method void PrintWriter.print(String)>
		printwriter.print(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//   12   20:aload_3         
	//   13   21:aload_0         
	//   14   22:invokestatic    #189 <Method int System.identityHashCode(Object)>
	//   15   25:invokestatic    #195 <Method String Integer.toHexString(int)>
	//   16   28:invokevirtual   #181 <Method void PrintWriter.print(String)>
		printwriter.println(" State:");
	//   17   31:aload_3         
	//   18   32:ldc1            #197 <String " State:">
	//   19   34:invokevirtual   #200 <Method void PrintWriter.println(String)>
		Object obj = ((Object) (new StringBuilder()));
	//   20   37:new             #202 <Class StringBuilder>
	//   21   40:dup             
	//   22   41:invokespecial   #203 <Method void StringBuilder()>
	//   23   44:astore          5
		((StringBuilder) (obj)).append(s);
	//   24   46:aload           5
	//   25   48:aload_1         
	//   26   49:invokevirtual   #207 <Method StringBuilder StringBuilder.append(String)>
	//   27   52:pop             
		((StringBuilder) (obj)).append("  ");
	//   28   53:aload           5
	//   29   55:ldc1            #209 <String "  ">
	//   30   57:invokevirtual   #207 <Method StringBuilder StringBuilder.append(String)>
	//   31   60:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   32   61:aload           5
	//   33   63:invokevirtual   #213 <Method String StringBuilder.toString()>
	//   34   66:astore          5
		printwriter.print(((String) (obj)));
	//   35   68:aload_3         
	//   36   69:aload           5
	//   37   71:invokevirtual   #181 <Method void PrintWriter.print(String)>
		printwriter.print("mCreated=");
	//   38   74:aload_3         
	//   39   75:ldc1            #215 <String "mCreated=">
	//   40   77:invokevirtual   #181 <Method void PrintWriter.print(String)>
		printwriter.print(mCreated);
	//   41   80:aload_3         
	//   42   81:aload_0         
	//   43   82:getfield        #217 <Field boolean mCreated>
	//   44   85:invokevirtual   #219 <Method void PrintWriter.print(boolean)>
		printwriter.print("mResumed=");
	//   45   88:aload_3         
	//   46   89:ldc1            #221 <String "mResumed=">
	//   47   91:invokevirtual   #181 <Method void PrintWriter.print(String)>
		printwriter.print(mResumed);
	//   48   94:aload_3         
	//   49   95:aload_0         
	//   50   96:getfield        #223 <Field boolean mResumed>
	//   51   99:invokevirtual   #219 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mStopped=");
	//   52  102:aload_3         
	//   53  103:ldc1            #225 <String " mStopped=">
	//   54  105:invokevirtual   #181 <Method void PrintWriter.print(String)>
		printwriter.print(mStopped);
	//   55  108:aload_3         
	//   56  109:aload_0         
	//   57  110:getfield        #74  <Field boolean mStopped>
	//   58  113:invokevirtual   #219 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mReallyStopped=");
	//   59  116:aload_3         
	//   60  117:ldc1            #227 <String " mReallyStopped=">
	//   61  119:invokevirtual   #181 <Method void PrintWriter.print(String)>
		printwriter.println(mReallyStopped);
	//   62  122:aload_3         
	//   63  123:aload_0         
	//   64  124:getfield        #76  <Field boolean mReallyStopped>
	//   65  127:invokevirtual   #229 <Method void PrintWriter.println(boolean)>
		mFragments.dumpLoaders(((String) (obj)), filedescriptor, printwriter, as);
	//   66  130:aload_0         
	//   67  131:getfield        #72  <Field FragmentController mFragments>
	//   68  134:aload           5
	//   69  136:aload_2         
	//   70  137:aload_3         
	//   71  138:aload           4
	//   72  140:invokevirtual   #232 <Method void FragmentController.dumpLoaders(String, FileDescriptor, PrintWriter, String[])>
		mFragments.getSupportFragmentManager().dump(s, filedescriptor, printwriter, as);
	//   73  143:aload_0         
	//   74  144:getfield        #72  <Field FragmentController mFragments>
	//   75  147:invokevirtual   #235 <Method FragmentManager FragmentController.getSupportFragmentManager()>
	//   76  150:aload_1         
	//   77  151:aload_2         
	//   78  152:aload_3         
	//   79  153:aload           4
	//   80  155:invokevirtual   #236 <Method void FragmentManager.dump(String, FileDescriptor, PrintWriter, String[])>
	//   81  158:return          
	}

	public Object getLastCustomNonConfigurationInstance()
	{
		NonConfigurationInstances nonconfigurationinstances = (NonConfigurationInstances)getLastNonConfigurationInstance();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #240 <Method Object getLastNonConfigurationInstance()>
	//    2    4:checkcast       #15  <Class FragmentActivity$NonConfigurationInstances>
	//    3    7:astore_1        
		if(nonconfigurationinstances != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          17
			return nonconfigurationinstances.custom;
	//    6   12:aload_1         
	//    7   13:getfield        #244 <Field Object FragmentActivity$NonConfigurationInstances.custom>
	//    8   16:areturn         
		else
			return ((Object) (null));
	//    9   17:aconst_null     
	//   10   18:areturn         
	}

	public b getLifecycle()
	{
		return super.getLifecycle();
	//    0    0:aload_0         
	//    1    1:invokespecial   #248 <Method b BaseFragmentActivityApi16.getLifecycle()>
	//    2    4:areturn         
	}

	public FragmentManager getSupportFragmentManager()
	{
		return mFragments.getSupportFragmentManager();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field FragmentController mFragments>
	//    2    4:invokevirtual   #235 <Method FragmentManager FragmentController.getSupportFragmentManager()>
	//    3    7:areturn         
	}

	public LoaderManager getSupportLoaderManager()
	{
		return mFragments.getSupportLoaderManager();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field FragmentController mFragments>
	//    2    4:invokevirtual   #252 <Method LoaderManager FragmentController.getSupportLoaderManager()>
	//    3    7:areturn         
	}

	protected void onActivityResult(int i, int j, Intent intent)
	{
		mFragments.noteStateNotSaved();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field FragmentController mFragments>
	//    2    4:invokevirtual   #257 <Method void FragmentController.noteStateNotSaved()>
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
			String s = (String)mPendingFragmentActivityResults.a(k);
	//   13   24:aload_0         
	//   14   25:getfield        #81  <Field n mPendingFragmentActivityResults>
	//   15   28:iload           4
	//   16   30:invokevirtual   #260 <Method Object n.a(int)>
	//   17   33:checkcast       #262 <Class String>
	//   18   36:astore          5
			mPendingFragmentActivityResults.c(k);
	//   19   38:aload_0         
	//   20   39:getfield        #81  <Field n mPendingFragmentActivityResults>
	//   21   42:iload           4
	//   22   44:invokevirtual   #265 <Method void n.c(int)>
			if(s == null)
	//*  23   47:aload           5
	//*  24   49:ifnonnull       62
			{
				Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
	//   25   52:ldc1            #39  <String "FragmentActivity">
	//   26   54:ldc2            #267 <String "Activity result delivered for unknown Fragment.">
	//   27   57:invokestatic    #273 <Method int Log.w(String, String)>
	//   28   60:pop             
				return;
	//   29   61:return          
			}
			Fragment fragment = mFragments.findFragmentByWho(s);
	//   30   62:aload_0         
	//   31   63:getfield        #72  <Field FragmentController mFragments>
	//   32   66:aload           5
	//   33   68:invokevirtual   #277 <Method Fragment FragmentController.findFragmentByWho(String)>
	//   34   71:astore          6
			if(fragment == null)
	//*  35   73:aload           6
	//*  36   75:ifnonnull       112
			{
				intent = ((Intent) (new StringBuilder()));
	//   37   78:new             #202 <Class StringBuilder>
	//   38   81:dup             
	//   39   82:invokespecial   #203 <Method void StringBuilder()>
	//   40   85:astore_3        
				((StringBuilder) (intent)).append("Activity result no fragment exists for who: ");
	//   41   86:aload_3         
	//   42   87:ldc2            #279 <String "Activity result no fragment exists for who: ">
	//   43   90:invokevirtual   #207 <Method StringBuilder StringBuilder.append(String)>
	//   44   93:pop             
				((StringBuilder) (intent)).append(s);
	//   45   94:aload_3         
	//   46   95:aload           5
	//   47   97:invokevirtual   #207 <Method StringBuilder StringBuilder.append(String)>
	//   48  100:pop             
				Log.w("FragmentActivity", ((StringBuilder) (intent)).toString());
	//   49  101:ldc1            #39  <String "FragmentActivity">
	//   50  103:aload_3         
	//   51  104:invokevirtual   #213 <Method String StringBuilder.toString()>
	//   52  107:invokestatic    #273 <Method int Log.w(String, String)>
	//   53  110:pop             
				return;
	//   54  111:return          
			} else
			{
				fragment.onActivityResult(i & 0xffff, j, intent);
	//   55  112:aload           6
	//   56  114:iload_1         
	//   57  115:ldc2            #280 <Int 65535>
	//   58  118:iand            
	//   59  119:iload_2         
	//   60  120:aload_3         
	//   61  121:invokevirtual   #282 <Method void Fragment.onActivityResult(int, int, Intent)>
				return;
	//   62  124:return          
			}
		} else
		{
			super.onActivityResult(i, j, intent);
	//   63  125:aload_0         
	//   64  126:iload_1         
	//   65  127:iload_2         
	//   66  128:aload_3         
	//   67  129:invokespecial   #283 <Method void BaseFragmentActivityApi16.onActivityResult(int, int, Intent)>
			return;
	//   68  132:return          
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
	//    1    1:getfield        #72  <Field FragmentController mFragments>
	//    2    4:invokevirtual   #235 <Method FragmentManager FragmentController.getSupportFragmentManager()>
	//    3    7:astore_2        
		boolean flag = fragmentmanager.isStateSaved();
	//    4    8:aload_2         
	//    5    9:invokevirtual   #289 <Method boolean FragmentManager.isStateSaved()>
	//    6   12:istore_1        
		if(flag && android.os.Build.VERSION.SDK_INT <= 25)
	//*   7   13:iload_1         
	//*   8   14:ifeq            26
	//*   9   17:getstatic       #294 <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   20:bipush          25
	//*  11   22:icmpgt          26
			return;
	//   12   25:return          
		if(flag || !fragmentmanager.popBackStackImmediate())
	//*  13   26:iload_1         
	//*  14   27:ifne            37
	//*  15   30:aload_2         
	//*  16   31:invokevirtual   #297 <Method boolean FragmentManager.popBackStackImmediate()>
	//*  17   34:ifne            41
			super.onBackPressed();
	//   18   37:aload_0         
	//   19   38:invokespecial   #299 <Method void BaseFragmentActivityApi16.onBackPressed()>
	//   20   41:return          
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #303 <Method void BaseFragmentActivityApi16.onConfigurationChanged(Configuration)>
		mFragments.dispatchConfigurationChanged(configuration);
	//    3    5:aload_0         
	//    4    6:getfield        #72  <Field FragmentController mFragments>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #306 <Method void FragmentController.dispatchConfigurationChanged(Configuration)>
	//    7   13:return          
	}

	protected void onCreate(Bundle bundle)
	{
		FragmentController fragmentcontroller = mFragments;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field FragmentController mFragments>
	//    2    4:astore          4
		FragmentManagerNonConfig fragmentmanagernonconfig = null;
	//    3    6:aconst_null     
	//    4    7:astore_3        
		fragmentcontroller.attachHost(((Fragment) (null)));
	//    5    8:aload           4
	//    6   10:aconst_null     
	//    7   11:invokevirtual   #311 <Method void FragmentController.attachHost(Fragment)>
		super.onCreate(bundle);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #313 <Method void BaseFragmentActivityApi16.onCreate(Bundle)>
		NonConfigurationInstances nonconfigurationinstances = (NonConfigurationInstances)getLastNonConfigurationInstance();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #240 <Method Object getLastNonConfigurationInstance()>
	//   13   23:checkcast       #15  <Class FragmentActivity$NonConfigurationInstances>
	//   14   26:astore          6
		if(nonconfigurationinstances != null)
	//*  15   28:aload           6
	//*  16   30:ifnull          45
			mFragments.restoreLoaderNonConfig(nonconfigurationinstances.loaders);
	//   17   33:aload_0         
	//   18   34:getfield        #72  <Field FragmentController mFragments>
	//   19   37:aload           6
	//   20   39:getfield        #317 <Field m FragmentActivity$NonConfigurationInstances.loaders>
	//   21   42:invokevirtual   #321 <Method void FragmentController.restoreLoaderNonConfig(m)>
		if(bundle != null)
	//*  22   45:aload_1         
	//*  23   46:ifnull          183
		{
			android.os.Parcelable parcelable = bundle.getParcelable("android:support:fragments");
	//   24   49:aload_1         
	//   25   50:ldc1            #23  <String "android:support:fragments">
	//   26   52:invokevirtual   #327 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   27   55:astore          4
			FragmentController fragmentcontroller1 = mFragments;
	//   28   57:aload_0         
	//   29   58:getfield        #72  <Field FragmentController mFragments>
	//   30   61:astore          5
			if(nonconfigurationinstances != null)
	//*  31   63:aload           6
	//*  32   65:ifnull          74
				fragmentmanagernonconfig = nonconfigurationinstances.fragments;
	//   33   68:aload           6
	//   34   70:getfield        #331 <Field FragmentManagerNonConfig FragmentActivity$NonConfigurationInstances.fragments>
	//   35   73:astore_3        
			fragmentcontroller1.restoreAllState(parcelable, fragmentmanagernonconfig);
	//   36   74:aload           5
	//   37   76:aload           4
	//   38   78:aload_3         
	//   39   79:invokevirtual   #335 <Method void FragmentController.restoreAllState(android.os.Parcelable, FragmentManagerNonConfig)>
			if(bundle.containsKey("android:support:next_request_index"))
	//*  40   82:aload_1         
	//*  41   83:ldc1            #33  <String "android:support:next_request_index">
	//*  42   85:invokevirtual   #339 <Method boolean Bundle.containsKey(String)>
	//*  43   88:ifeq            183
			{
				mNextCandidateRequestIndex = bundle.getInt("android:support:next_request_index");
	//   44   91:aload_0         
	//   45   92:aload_1         
	//   46   93:ldc1            #33  <String "android:support:next_request_index">
	//   47   95:invokevirtual   #343 <Method int Bundle.getInt(String)>
	//   48   98:putfield        #96  <Field int mNextCandidateRequestIndex>
				int ai[] = bundle.getIntArray("android:support:request_indicies");
	//   49  101:aload_1         
	//   50  102:ldc1            #20  <String "android:support:request_indicies">
	//   51  104:invokevirtual   #347 <Method int[] Bundle.getIntArray(String)>
	//   52  107:astore_3        
				bundle = ((Bundle) (bundle.getStringArray("android:support:request_fragment_who")));
	//   53  108:aload_1         
	//   54  109:ldc1            #36  <String "android:support:request_fragment_who">
	//   55  111:invokevirtual   #351 <Method String[] Bundle.getStringArray(String)>
	//   56  114:astore_1        
				if(ai != null && bundle != null && ai.length == bundle.length)
	//*  57  115:aload_3         
	//*  58  116:ifnull          174
	//*  59  119:aload_1         
	//*  60  120:ifnull          174
	//*  61  123:aload_3         
	//*  62  124:arraylength     
	//*  63  125:aload_1         
	//*  64  126:arraylength     
	//*  65  127:icmpeq          133
	//*  66  130:goto            174
				{
					mPendingFragmentActivityResults = new n(ai.length);
	//   67  133:aload_0         
	//   68  134:new             #83  <Class n>
	//   69  137:dup             
	//   70  138:aload_3         
	//   71  139:arraylength     
	//   72  140:invokespecial   #353 <Method void n(int)>
	//   73  143:putfield        #81  <Field n mPendingFragmentActivityResults>
					for(int i = 0; i < ai.length; i++)
	//*  74  146:iconst_0        
	//*  75  147:istore_2        
	//*  76  148:iload_2         
	//*  77  149:aload_3         
	//*  78  150:arraylength     
	//*  79  151:icmpge          183
						mPendingFragmentActivityResults.b(ai[i], ((Object) (bundle[i])));
	//   80  154:aload_0         
	//   81  155:getfield        #81  <Field n mPendingFragmentActivityResults>
	//   82  158:aload_3         
	//   83  159:iload_2         
	//   84  160:iaload          
	//   85  161:aload_1         
	//   86  162:iload_2         
	//   87  163:aaload          
	//   88  164:invokevirtual   #108 <Method void n.b(int, Object)>

	//   89  167:iload_2         
	//   90  168:iconst_1        
	//   91  169:iadd            
	//   92  170:istore_2        
				} else
	//*  93  171:goto            148
				{
					Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
	//   94  174:ldc1            #39  <String "FragmentActivity">
	//   95  176:ldc2            #355 <String "Invalid requestCode mapping in savedInstanceState.">
	//   96  179:invokestatic    #273 <Method int Log.w(String, String)>
	//   97  182:pop             
				}
			}
		}
		if(mPendingFragmentActivityResults == null)
	//*  98  183:aload_0         
	//*  99  184:getfield        #81  <Field n mPendingFragmentActivityResults>
	//* 100  187:ifnonnull       206
		{
			mPendingFragmentActivityResults = new n();
	//  101  190:aload_0         
	//  102  191:new             #83  <Class n>
	//  103  194:dup             
	//  104  195:invokespecial   #356 <Method void n()>
	//  105  198:putfield        #81  <Field n mPendingFragmentActivityResults>
			mNextCandidateRequestIndex = 0;
	//  106  201:aload_0         
	//  107  202:iconst_0        
	//  108  203:putfield        #96  <Field int mNextCandidateRequestIndex>
		}
		mFragments.dispatchCreate();
	//  109  206:aload_0         
	//  110  207:getfield        #72  <Field FragmentController mFragments>
	//  111  210:invokevirtual   #359 <Method void FragmentController.dispatchCreate()>
	//  112  213:return          
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
	//    5    7:invokespecial   #363 <Method boolean BaseFragmentActivityApi16.onCreatePanelMenu(int, Menu)>
	//    6   10:aload_0         
	//    7   11:getfield        #72  <Field FragmentController mFragments>
	//    8   14:aload_2         
	//    9   15:aload_0         
	//   10   16:invokevirtual   #367 <Method android.view.MenuInflater getMenuInflater()>
	//   11   19:invokevirtual   #371 <Method boolean FragmentController.dispatchCreateOptionsMenu(Menu, android.view.MenuInflater)>
	//   12   22:ior             
	//   13   23:ireturn         
		else
			return super.onCreatePanelMenu(i, menu);
	//   14   24:aload_0         
	//   15   25:iload_1         
	//   16   26:aload_2         
	//   17   27:invokespecial   #363 <Method boolean BaseFragmentActivityApi16.onCreatePanelMenu(int, Menu)>
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
	//    5    6:invokespecial   #372 <Method View BaseFragmentActivityApi16.onCreateView(View, String, Context, AttributeSet)>
	//    6    9:areturn         
	}

	public volatile View onCreateView(String s, Context context, AttributeSet attributeset)
	{
		return super.onCreateView(s, context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #375 <Method View BaseFragmentActivityApi16.onCreateView(String, Context, AttributeSet)>
	//    5    7:areturn         
	}

	protected void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #378 <Method void BaseFragmentActivityApi16.onDestroy()>
		doReallyStop(false);
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #380 <Method void doReallyStop(boolean)>
		mFragments.dispatchDestroy();
	//    5    9:aload_0         
	//    6   10:getfield        #72  <Field FragmentController mFragments>
	//    7   13:invokevirtual   #383 <Method void FragmentController.dispatchDestroy()>
		mFragments.doLoaderDestroy();
	//    8   16:aload_0         
	//    9   17:getfield        #72  <Field FragmentController mFragments>
	//   10   20:invokevirtual   #386 <Method void FragmentController.doLoaderDestroy()>
	//   11   23:return          
	}

	public void onLowMemory()
	{
		super.onLowMemory();
	//    0    0:aload_0         
	//    1    1:invokespecial   #389 <Method void BaseFragmentActivityApi16.onLowMemory()>
		mFragments.dispatchLowMemory();
	//    2    4:aload_0         
	//    3    5:getfield        #72  <Field FragmentController mFragments>
	//    4    8:invokevirtual   #392 <Method void FragmentController.dispatchLowMemory()>
	//    5   11:return          
	}

	public boolean onMenuItemSelected(int i, MenuItem menuitem)
	{
		if(super.onMenuItemSelected(i, menuitem))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:aload_2         
	//*   3    3:invokespecial   #396 <Method boolean BaseFragmentActivityApi16.onMenuItemSelected(int, MenuItem)>
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
	//   15   24:getfield        #72  <Field FragmentController mFragments>
	//   16   27:aload_2         
	//   17   28:invokevirtual   #400 <Method boolean FragmentController.dispatchContextItemSelected(MenuItem)>
	//   18   31:ireturn         
		} else
		{
			return mFragments.dispatchOptionsItemSelected(menuitem);
	//   19   32:aload_0         
	//   20   33:getfield        #72  <Field FragmentController mFragments>
	//   21   36:aload_2         
	//   22   37:invokevirtual   #403 <Method boolean FragmentController.dispatchOptionsItemSelected(MenuItem)>
	//   23   40:ireturn         
		}
	}

	public void onMultiWindowModeChanged(boolean flag)
	{
		mFragments.dispatchMultiWindowModeChanged(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field FragmentController mFragments>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #407 <Method void FragmentController.dispatchMultiWindowModeChanged(boolean)>
	//    4    8:return          
	}

	protected void onNewIntent(Intent intent)
	{
		super.onNewIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #411 <Method void BaseFragmentActivityApi16.onNewIntent(Intent)>
		mFragments.noteStateNotSaved();
	//    3    5:aload_0         
	//    4    6:getfield        #72  <Field FragmentController mFragments>
	//    5    9:invokevirtual   #257 <Method void FragmentController.noteStateNotSaved()>
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
	//    4    8:getfield        #72  <Field FragmentController mFragments>
	//    5   11:aload_2         
	//    6   12:invokevirtual   #417 <Method void FragmentController.dispatchOptionsMenuClosed(Menu)>
		super.onPanelClosed(i, menu);
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:aload_2         
	//   10   18:invokespecial   #419 <Method void BaseFragmentActivityApi16.onPanelClosed(int, Menu)>
	//   11   21:return          
	}

	protected void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #422 <Method void BaseFragmentActivityApi16.onPause()>
		mResumed = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #223 <Field boolean mResumed>
		if(mHandler.hasMessages(2))
	//*   5    9:aload_0         
	//*   6   10:getfield        #63  <Field Handler mHandler>
	//*   7   13:iconst_2        
	//*   8   14:invokevirtual   #426 <Method boolean Handler.hasMessages(int)>
	//*   9   17:ifeq            32
		{
			mHandler.removeMessages(2);
	//   10   20:aload_0         
	//   11   21:getfield        #63  <Field Handler mHandler>
	//   12   24:iconst_2        
	//   13   25:invokevirtual   #163 <Method void Handler.removeMessages(int)>
			onResumeFragments();
	//   14   28:aload_0         
	//   15   29:invokevirtual   #429 <Method void onResumeFragments()>
		}
		mFragments.dispatchPause();
	//   16   32:aload_0         
	//   17   33:getfield        #72  <Field FragmentController mFragments>
	//   18   36:invokevirtual   #432 <Method void FragmentController.dispatchPause()>
	//   19   39:return          
	}

	public void onPictureInPictureModeChanged(boolean flag)
	{
		mFragments.dispatchPictureInPictureModeChanged(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field FragmentController mFragments>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #436 <Method void FragmentController.dispatchPictureInPictureModeChanged(boolean)>
	//    4    8:return          
	}

	protected void onPostResume()
	{
		super.onPostResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #439 <Method void BaseFragmentActivityApi16.onPostResume()>
		mHandler.removeMessages(2);
	//    2    4:aload_0         
	//    3    5:getfield        #63  <Field Handler mHandler>
	//    4    8:iconst_2        
	//    5    9:invokevirtual   #163 <Method void Handler.removeMessages(int)>
		onResumeFragments();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #429 <Method void onResumeFragments()>
		mFragments.execPendingActions();
	//    8   16:aload_0         
	//    9   17:getfield        #72  <Field FragmentController mFragments>
	//   10   20:invokevirtual   #442 <Method boolean FragmentController.execPendingActions()>
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
	//    4    4:invokespecial   #448 <Method boolean BaseFragmentActivityApi16.onPreparePanel(int, View, Menu)>
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
	//    7   11:invokevirtual   #450 <Method boolean onPrepareOptionsPanel(View, Menu)>
	//    8   14:aload_0         
	//    9   15:getfield        #72  <Field FragmentController mFragments>
	//   10   18:aload_3         
	//   11   19:invokevirtual   #454 <Method boolean FragmentController.dispatchPrepareOptionsMenu(Menu)>
	//   12   22:ior             
	//   13   23:ireturn         
		else
			return super.onPreparePanel(i, view, menu);
	//   14   24:aload_0         
	//   15   25:iload_1         
	//   16   26:aload_2         
	//   17   27:aload_3         
	//   18   28:invokespecial   #448 <Method boolean BaseFragmentActivityApi16.onPreparePanel(int, View, Menu)>
	//   19   31:ireturn         
	}

	void onReallyStop()
	{
		mFragments.doLoaderStop(mRetaining);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field FragmentController mFragments>
	//    2    4:aload_0         
	//    3    5:getfield        #157 <Field boolean mRetaining>
	//    4    8:invokevirtual   #172 <Method void FragmentController.doLoaderStop(boolean)>
		mFragments.dispatchReallyStop();
	//    5   11:aload_0         
	//    6   12:getfield        #72  <Field FragmentController mFragments>
	//    7   15:invokevirtual   #457 <Method void FragmentController.dispatchReallyStop()>
	//    8   18:return          
	}

	public void onRequestPermissionsResult(int i, String as[], int ai[])
	{
		int j = i >> 16 & 0xffff;
	//    0    0:iload_1         
	//    1    1:bipush          16
	//    2    3:ishr            
	//    3    4:ldc2            #280 <Int 65535>
	//    4    7:iand            
	//    5    8:istore          4
		if(j != 0)
	//*   6   10:iload           4
	//*   7   12:ifeq            121
		{
			j--;
	//    8   15:iload           4
	//    9   17:iconst_1        
	//   10   18:isub            
	//   11   19:istore          4
			String s = (String)mPendingFragmentActivityResults.a(j);
	//   12   21:aload_0         
	//   13   22:getfield        #81  <Field n mPendingFragmentActivityResults>
	//   14   25:iload           4
	//   15   27:invokevirtual   #260 <Method Object n.a(int)>
	//   16   30:checkcast       #262 <Class String>
	//   17   33:astore          5
			mPendingFragmentActivityResults.c(j);
	//   18   35:aload_0         
	//   19   36:getfield        #81  <Field n mPendingFragmentActivityResults>
	//   20   39:iload           4
	//   21   41:invokevirtual   #265 <Method void n.c(int)>
			if(s == null)
	//*  22   44:aload           5
	//*  23   46:ifnonnull       59
			{
				Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
	//   24   49:ldc1            #39  <String "FragmentActivity">
	//   25   51:ldc2            #267 <String "Activity result delivered for unknown Fragment.">
	//   26   54:invokestatic    #273 <Method int Log.w(String, String)>
	//   27   57:pop             
				return;
	//   28   58:return          
			}
			Fragment fragment = mFragments.findFragmentByWho(s);
	//   29   59:aload_0         
	//   30   60:getfield        #72  <Field FragmentController mFragments>
	//   31   63:aload           5
	//   32   65:invokevirtual   #277 <Method Fragment FragmentController.findFragmentByWho(String)>
	//   33   68:astore          6
			if(fragment == null)
	//*  34   70:aload           6
	//*  35   72:ifnonnull       109
			{
				as = ((String []) (new StringBuilder()));
	//   36   75:new             #202 <Class StringBuilder>
	//   37   78:dup             
	//   38   79:invokespecial   #203 <Method void StringBuilder()>
	//   39   82:astore_2        
				((StringBuilder) (as)).append("Activity result no fragment exists for who: ");
	//   40   83:aload_2         
	//   41   84:ldc2            #279 <String "Activity result no fragment exists for who: ">
	//   42   87:invokevirtual   #207 <Method StringBuilder StringBuilder.append(String)>
	//   43   90:pop             
				((StringBuilder) (as)).append(s);
	//   44   91:aload_2         
	//   45   92:aload           5
	//   46   94:invokevirtual   #207 <Method StringBuilder StringBuilder.append(String)>
	//   47   97:pop             
				Log.w("FragmentActivity", ((StringBuilder) (as)).toString());
	//   48   98:ldc1            #39  <String "FragmentActivity">
	//   49  100:aload_2         
	//   50  101:invokevirtual   #213 <Method String StringBuilder.toString()>
	//   51  104:invokestatic    #273 <Method int Log.w(String, String)>
	//   52  107:pop             
				return;
	//   53  108:return          
			}
			fragment.onRequestPermissionsResult(i & 0xffff, as, ai);
	//   54  109:aload           6
	//   55  111:iload_1         
	//   56  112:ldc2            #280 <Int 65535>
	//   57  115:iand            
	//   58  116:aload_2         
	//   59  117:aload_3         
	//   60  118:invokevirtual   #461 <Method void Fragment.onRequestPermissionsResult(int, String[], int[])>
		}
	//   61  121:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #464 <Method void BaseFragmentActivityApi16.onResume()>
		mHandler.sendEmptyMessage(2);
	//    2    4:aload_0         
	//    3    5:getfield        #63  <Field Handler mHandler>
	//    4    8:iconst_2        
	//    5    9:invokevirtual   #467 <Method boolean Handler.sendEmptyMessage(int)>
	//    6   12:pop             
		mResumed = true;
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:putfield        #223 <Field boolean mResumed>
		mFragments.execPendingActions();
	//   10   18:aload_0         
	//   11   19:getfield        #72  <Field FragmentController mFragments>
	//   12   22:invokevirtual   #442 <Method boolean FragmentController.execPendingActions()>
	//   13   25:pop             
	//   14   26:return          
	}

	protected void onResumeFragments()
	{
		mFragments.dispatchResume();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field FragmentController mFragments>
	//    2    4:invokevirtual   #470 <Method void FragmentController.dispatchResume()>
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
	//*   1    1:getfield        #74  <Field boolean mStopped>
	//*   2    4:ifeq            12
			doReallyStop(true);
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:invokevirtual   #380 <Method void doReallyStop(boolean)>
		Object obj = onRetainCustomNonConfigurationInstance();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #474 <Method Object onRetainCustomNonConfigurationInstance()>
	//    8   16:astore_1        
		FragmentManagerNonConfig fragmentmanagernonconfig = mFragments.retainNestedNonConfig();
	//    9   17:aload_0         
	//   10   18:getfield        #72  <Field FragmentController mFragments>
	//   11   21:invokevirtual   #478 <Method FragmentManagerNonConfig FragmentController.retainNestedNonConfig()>
	//   12   24:astore_2        
		m m = mFragments.retainLoaderNonConfig();
	//   13   25:aload_0         
	//   14   26:getfield        #72  <Field FragmentController mFragments>
	//   15   29:invokevirtual   #482 <Method m FragmentController.retainLoaderNonConfig()>
	//   16   32:astore_3        
		if(fragmentmanagernonconfig == null && m == null && obj == null)
	//*  17   33:aload_2         
	//*  18   34:ifnonnull       47
	//*  19   37:aload_3         
	//*  20   38:ifnonnull       47
	//*  21   41:aload_1         
	//*  22   42:ifnonnull       47
		{
			return ((Object) (null));
	//   23   45:aconst_null     
	//   24   46:areturn         
		} else
		{
			NonConfigurationInstances nonconfigurationinstances = new NonConfigurationInstances();
	//   25   47:new             #15  <Class FragmentActivity$NonConfigurationInstances>
	//   26   50:dup             
	//   27   51:invokespecial   #483 <Method void FragmentActivity$NonConfigurationInstances()>
	//   28   54:astore          4
			nonconfigurationinstances.custom = obj;
	//   29   56:aload           4
	//   30   58:aload_1         
	//   31   59:putfield        #244 <Field Object FragmentActivity$NonConfigurationInstances.custom>
			nonconfigurationinstances.fragments = fragmentmanagernonconfig;
	//   32   62:aload           4
	//   33   64:aload_2         
	//   34   65:putfield        #331 <Field FragmentManagerNonConfig FragmentActivity$NonConfigurationInstances.fragments>
			nonconfigurationinstances.loaders = m;
	//   35   68:aload           4
	//   36   70:aload_3         
	//   37   71:putfield        #317 <Field m FragmentActivity$NonConfigurationInstances.loaders>
			return ((Object) (nonconfigurationinstances));
	//   38   74:aload           4
	//   39   76:areturn         
		}
	}

	protected void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #486 <Method void BaseFragmentActivityApi16.onSaveInstanceState(Bundle)>
		markState(getSupportFragmentManager(), android.arch.lifecycle.b.b.CREATED);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #487 <Method FragmentManager getSupportFragmentManager()>
	//    5    9:getstatic       #493 <Field android.arch.lifecycle.b$b android.arch.lifecycle.b$b.CREATED>
	//    6   12:invokestatic    #148 <Method void markState(FragmentManager, android.arch.lifecycle.b$b)>
		android.os.Parcelable parcelable = mFragments.saveAllState();
	//    7   15:aload_0         
	//    8   16:getfield        #72  <Field FragmentController mFragments>
	//    9   19:invokevirtual   #497 <Method android.os.Parcelable FragmentController.saveAllState()>
	//   10   22:astore_3        
		if(parcelable != null)
	//*  11   23:aload_3         
	//*  12   24:ifnull          34
			bundle.putParcelable("android:support:fragments", parcelable);
	//   13   27:aload_1         
	//   14   28:ldc1            #23  <String "android:support:fragments">
	//   15   30:aload_3         
	//   16   31:invokevirtual   #501 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		if(mPendingFragmentActivityResults.b() > 0)
	//*  17   34:aload_0         
	//*  18   35:getfield        #81  <Field n mPendingFragmentActivityResults>
	//*  19   38:invokevirtual   #87  <Method int n.b()>
	//*  20   41:ifle            137
		{
			bundle.putInt("android:support:next_request_index", mNextCandidateRequestIndex);
	//   21   44:aload_1         
	//   22   45:ldc1            #33  <String "android:support:next_request_index">
	//   23   47:aload_0         
	//   24   48:getfield        #96  <Field int mNextCandidateRequestIndex>
	//   25   51:invokevirtual   #505 <Method void Bundle.putInt(String, int)>
			int ai[] = new int[mPendingFragmentActivityResults.b()];
	//   26   54:aload_0         
	//   27   55:getfield        #81  <Field n mPendingFragmentActivityResults>
	//   28   58:invokevirtual   #87  <Method int n.b()>
	//   29   61:newarray        int[]
	//   30   63:astore_3        
			String as[] = new String[mPendingFragmentActivityResults.b()];
	//   31   64:aload_0         
	//   32   65:getfield        #81  <Field n mPendingFragmentActivityResults>
	//   33   68:invokevirtual   #87  <Method int n.b()>
	//   34   71:anewarray       String[]
	//   35   74:astore          4
			for(int i = 0; i < mPendingFragmentActivityResults.b(); i++)
	//*  36   76:iconst_0        
	//*  37   77:istore_2        
	//*  38   78:iload_2         
	//*  39   79:aload_0         
	//*  40   80:getfield        #81  <Field n mPendingFragmentActivityResults>
	//*  41   83:invokevirtual   #87  <Method int n.b()>
	//*  42   86:icmpge          122
			{
				ai[i] = mPendingFragmentActivityResults.e(i);
	//   43   89:aload_3         
	//   44   90:iload_2         
	//   45   91:aload_0         
	//   46   92:getfield        #81  <Field n mPendingFragmentActivityResults>
	//   47   95:iload_2         
	//   48   96:invokevirtual   #508 <Method int n.e(int)>
	//   49   99:iastore         
				as[i] = (String)mPendingFragmentActivityResults.f(i);
	//   50  100:aload           4
	//   51  102:iload_2         
	//   52  103:aload_0         
	//   53  104:getfield        #81  <Field n mPendingFragmentActivityResults>
	//   54  107:iload_2         
	//   55  108:invokevirtual   #511 <Method Object n.f(int)>
	//   56  111:checkcast       #262 <Class String>
	//   57  114:aastore         
			}

	//   58  115:iload_2         
	//   59  116:iconst_1        
	//   60  117:iadd            
	//   61  118:istore_2        
	//*  62  119:goto            78
			bundle.putIntArray("android:support:request_indicies", ai);
	//   63  122:aload_1         
	//   64  123:ldc1            #20  <String "android:support:request_indicies">
	//   65  125:aload_3         
	//   66  126:invokevirtual   #515 <Method void Bundle.putIntArray(String, int[])>
			bundle.putStringArray("android:support:request_fragment_who", as);
	//   67  129:aload_1         
	//   68  130:ldc1            #36  <String "android:support:request_fragment_who">
	//   69  132:aload           4
	//   70  134:invokevirtual   #519 <Method void Bundle.putStringArray(String, String[])>
		}
	//   71  137:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #522 <Method void BaseFragmentActivityApi16.onStart()>
		mStopped = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #74  <Field boolean mStopped>
		mReallyStopped = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #76  <Field boolean mReallyStopped>
		mHandler.removeMessages(1);
	//    8   14:aload_0         
	//    9   15:getfield        #63  <Field Handler mHandler>
	//   10   18:iconst_1        
	//   11   19:invokevirtual   #163 <Method void Handler.removeMessages(int)>
		if(!mCreated)
	//*  12   22:aload_0         
	//*  13   23:getfield        #217 <Field boolean mCreated>
	//*  14   26:ifne            41
		{
			mCreated = true;
	//   15   29:aload_0         
	//   16   30:iconst_1        
	//   17   31:putfield        #217 <Field boolean mCreated>
			mFragments.dispatchActivityCreated();
	//   18   34:aload_0         
	//   19   35:getfield        #72  <Field FragmentController mFragments>
	//   20   38:invokevirtual   #525 <Method void FragmentController.dispatchActivityCreated()>
		}
		mFragments.noteStateNotSaved();
	//   21   41:aload_0         
	//   22   42:getfield        #72  <Field FragmentController mFragments>
	//   23   45:invokevirtual   #257 <Method void FragmentController.noteStateNotSaved()>
		mFragments.execPendingActions();
	//   24   48:aload_0         
	//   25   49:getfield        #72  <Field FragmentController mFragments>
	//   26   52:invokevirtual   #442 <Method boolean FragmentController.execPendingActions()>
	//   27   55:pop             
		mFragments.doLoaderStart();
	//   28   56:aload_0         
	//   29   57:getfield        #72  <Field FragmentController mFragments>
	//   30   60:invokevirtual   #169 <Method void FragmentController.doLoaderStart()>
		mFragments.dispatchStart();
	//   31   63:aload_0         
	//   32   64:getfield        #72  <Field FragmentController mFragments>
	//   33   67:invokevirtual   #528 <Method void FragmentController.dispatchStart()>
		mFragments.reportLoaderStart();
	//   34   70:aload_0         
	//   35   71:getfield        #72  <Field FragmentController mFragments>
	//   36   74:invokevirtual   #531 <Method void FragmentController.reportLoaderStart()>
	//   37   77:return          
	}

	public void onStateNotSaved()
	{
		mFragments.noteStateNotSaved();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field FragmentController mFragments>
	//    2    4:invokevirtual   #257 <Method void FragmentController.noteStateNotSaved()>
	//    3    7:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #535 <Method void BaseFragmentActivityApi16.onStop()>
		mStopped = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #74  <Field boolean mStopped>
		markState(getSupportFragmentManager(), android.arch.lifecycle.b.b.CREATED);
	//    5    9:aload_0         
	//    6   10:invokevirtual   #487 <Method FragmentManager getSupportFragmentManager()>
	//    7   13:getstatic       #493 <Field android.arch.lifecycle.b$b android.arch.lifecycle.b$b.CREATED>
	//    8   16:invokestatic    #148 <Method void markState(FragmentManager, android.arch.lifecycle.b$b)>
		mHandler.sendEmptyMessage(1);
	//    9   19:aload_0         
	//   10   20:getfield        #63  <Field Handler mHandler>
	//   11   23:iconst_1        
	//   12   24:invokevirtual   #467 <Method boolean Handler.sendEmptyMessage(int)>
	//   13   27:pop             
		mFragments.dispatchStop();
	//   14   28:aload_0         
	//   15   29:getfield        #72  <Field FragmentController mFragments>
	//   16   32:invokevirtual   #538 <Method void FragmentController.dispatchStop()>
	//   17   35:return          
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
	//    6    8:invokestatic    #546 <Method void ActivityCompat.requestPermissions(android.app.Activity, String[], int)>
			return;
	//    7   11:return          
		}
		checkForValidRequestCode(i);
	//    8   12:iload_3         
	//    9   13:invokestatic    #549 <Method void checkForValidRequestCode(int)>
		mRequestedPermissionsFromFragment = true;
	//   10   16:aload_0         
	//   11   17:iconst_1        
	//   12   18:putfield        #551 <Field boolean mRequestedPermissionsFromFragment>
		ActivityCompat.requestPermissions(((android.app.Activity) (this)), as, (allocateRequestIndex(fragment) + 1 << 16) + (i & 0xffff));
	//   13   21:aload_0         
	//   14   22:aload_2         
	//   15   23:aload_0         
	//   16   24:aload_1         
	//   17   25:invokespecial   #553 <Method int allocateRequestIndex(Fragment)>
	//   18   28:iconst_1        
	//   19   29:iadd            
	//   20   30:bipush          16
	//   21   32:ishl            
	//   22   33:iload_3         
	//   23   34:ldc2            #280 <Int 65535>
	//   24   37:iand            
	//   25   38:iadd            
	//   26   39:invokestatic    #546 <Method void ActivityCompat.requestPermissions(android.app.Activity, String[], int)>
		mRequestedPermissionsFromFragment = false;
	//   27   42:aload_0         
	//   28   43:iconst_0        
	//   29   44:putfield        #551 <Field boolean mRequestedPermissionsFromFragment>
		return;
	//   30   47:return          
		fragment;
	//   31   48:astore_1        
		mRequestedPermissionsFromFragment = false;
	//   32   49:aload_0         
	//   33   50:iconst_0        
	//   34   51:putfield        #551 <Field boolean mRequestedPermissionsFromFragment>
		throw fragment;
	//   35   54:aload_1         
	//   36   55:athrow          
	}

	public void setEnterSharedElementCallback(SharedElementCallback sharedelementcallback)
	{
		ActivityCompat.setEnterSharedElementCallback(((android.app.Activity) (this)), sharedelementcallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #558 <Method void ActivityCompat.setEnterSharedElementCallback(android.app.Activity, SharedElementCallback)>
	//    3    5:return          
	}

	public void setExitSharedElementCallback(SharedElementCallback sharedelementcallback)
	{
		ActivityCompat.setExitSharedElementCallback(((android.app.Activity) (this)), sharedelementcallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #561 <Method void ActivityCompat.setExitSharedElementCallback(android.app.Activity, SharedElementCallback)>
	//    3    5:return          
	}

	public void startActivityForResult(Intent intent, int i)
	{
		if(!mStartedActivityFromFragment && i != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #566 <Field boolean mStartedActivityFromFragment>
	//*   2    4:ifne            16
	//*   3    7:iload_2         
	//*   4    8:iconst_m1       
	//*   5    9:icmpeq          16
			checkForValidRequestCode(i);
	//    6   12:iload_2         
	//    7   13:invokestatic    #549 <Method void checkForValidRequestCode(int)>
		super.startActivityForResult(intent, i);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:iload_2         
	//   11   19:invokespecial   #568 <Method void BaseFragmentActivityApi16.startActivityForResult(Intent, int)>
	//   12   22:return          
	}

	public volatile void startActivityForResult(Intent intent, int i, Bundle bundle)
	{
		super.startActivityForResult(intent, i, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #571 <Method void BaseFragmentActivityApi16.startActivityForResult(Intent, int, Bundle)>
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
	//    5    5:invokevirtual   #576 <Method void startActivityFromFragment(Fragment, Intent, int, Bundle)>
	//    6    8:return          
	}

	public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle)
	{
		mStartedActivityFromFragment = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #566 <Field boolean mStartedActivityFromFragment>
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
	//   10   15:invokestatic    #579 <Method void ActivityCompat.startActivityForResult(android.app.Activity, Intent, int, Bundle)>
		mStartedActivityFromFragment = false;
	//   11   18:aload_0         
	//   12   19:iconst_0        
	//   13   20:putfield        #566 <Field boolean mStartedActivityFromFragment>
		return;
	//   14   23:return          
		fragment;
	//   15   24:astore_1        
		break MISSING_BLOCK_LABEL_61;
	//   16   25:goto            61
		checkForValidRequestCode(i);
	//   17   28:iload_3         
	//   18   29:invokestatic    #549 <Method void checkForValidRequestCode(int)>
		ActivityCompat.startActivityForResult(((android.app.Activity) (this)), intent, (allocateRequestIndex(fragment) + 1 << 16) + (i & 0xffff), bundle);
	//   19   32:aload_0         
	//   20   33:aload_2         
	//   21   34:aload_0         
	//   22   35:aload_1         
	//   23   36:invokespecial   #553 <Method int allocateRequestIndex(Fragment)>
	//   24   39:iconst_1        
	//   25   40:iadd            
	//   26   41:bipush          16
	//   27   43:ishl            
	//   28   44:iload_3         
	//   29   45:ldc2            #280 <Int 65535>
	//   30   48:iand            
	//   31   49:iadd            
	//   32   50:aload           4
	//   33   52:invokestatic    #579 <Method void ActivityCompat.startActivityForResult(android.app.Activity, Intent, int, Bundle)>
		mStartedActivityFromFragment = false;
	//   34   55:aload_0         
	//   35   56:iconst_0        
	//   36   57:putfield        #566 <Field boolean mStartedActivityFromFragment>
		return;
	//   37   60:return          
		mStartedActivityFromFragment = false;
	//   38   61:aload_0         
	//   39   62:iconst_0        
	//   40   63:putfield        #566 <Field boolean mStartedActivityFromFragment>
		throw fragment;
	//   41   66:aload_1         
	//   42   67:athrow          
	}

	public volatile void startIntentSenderForResult(IntentSender intentsender, int i, Intent intent, int j, int k, int l)
	{
		super.startIntentSenderForResult(intentsender, i, intent, j, k, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iload           6
	//    7   10:invokespecial   #583 <Method void BaseFragmentActivityApi16.startIntentSenderForResult(IntentSender, int, Intent, int, int, int)>
	//    8   13:return          
	}

	public volatile void startIntentSenderForResult(IntentSender intentsender, int i, Intent intent, int j, int k, int l, Bundle bundle)
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
	//    8   12:invokespecial   #586 <Method void BaseFragmentActivityApi16.startIntentSenderForResult(IntentSender, int, Intent, int, int, int, Bundle)>
	//    9   15:return          
	}

	public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentsender, int i, Intent intent, int j, int k, int l, 
			Bundle bundle)
	{
		mStartedIntentSenderFromFragment = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #591 <Field boolean mStartedIntentSenderFromFragment>
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
	//   14   23:invokestatic    #594 <Method void ActivityCompat.startIntentSenderForResult(android.app.Activity, IntentSender, int, Intent, int, int, int, Bundle)>
		mStartedIntentSenderFromFragment = false;
	//   15   26:aload_0         
	//   16   27:iconst_0        
	//   17   28:putfield        #591 <Field boolean mStartedIntentSenderFromFragment>
		return;
	//   18   31:return          
		fragment;
	//   19   32:astore_1        
		break MISSING_BLOCK_LABEL_77;
	//   20   33:goto            77
		checkForValidRequestCode(i);
	//   21   36:iload_3         
	//   22   37:invokestatic    #549 <Method void checkForValidRequestCode(int)>
		ActivityCompat.startIntentSenderForResult(((android.app.Activity) (this)), intentsender, (allocateRequestIndex(fragment) + 1 << 16) + (0xffff & i), intent, j, k, l, bundle);
	//   23   40:aload_0         
	//   24   41:aload_2         
	//   25   42:aload_0         
	//   26   43:aload_1         
	//   27   44:invokespecial   #553 <Method int allocateRequestIndex(Fragment)>
	//   28   47:iconst_1        
	//   29   48:iadd            
	//   30   49:bipush          16
	//   31   51:ishl            
	//   32   52:ldc2            #280 <Int 65535>
	//   33   55:iload_3         
	//   34   56:iand            
	//   35   57:iadd            
	//   36   58:aload           4
	//   37   60:iload           5
	//   38   62:iload           6
	//   39   64:iload           7
	//   40   66:aload           8
	//   41   68:invokestatic    #594 <Method void ActivityCompat.startIntentSenderForResult(android.app.Activity, IntentSender, int, Intent, int, int, int, Bundle)>
		mStartedIntentSenderFromFragment = false;
	//   42   71:aload_0         
	//   43   72:iconst_0        
	//   44   73:putfield        #591 <Field boolean mStartedIntentSenderFromFragment>
		return;
	//   45   76:return          
		mStartedIntentSenderFromFragment = false;
	//   46   77:aload_0         
	//   47   78:iconst_0        
	//   48   79:putfield        #591 <Field boolean mStartedIntentSenderFromFragment>
		throw fragment;
	//   49   82:aload_1         
	//   50   83:athrow          
	}

	public void supportFinishAfterTransition()
	{
		ActivityCompat.finishAfterTransition(((android.app.Activity) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #599 <Method void ActivityCompat.finishAfterTransition(android.app.Activity)>
	//    2    4:return          
	}

	public void supportInvalidateOptionsMenu()
	{
		invalidateOptionsMenu();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #604 <Method void invalidateOptionsMenu()>
	//    2    4:return          
	}

	public void supportPostponeEnterTransition()
	{
		ActivityCompat.postponeEnterTransition(((android.app.Activity) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #609 <Method void ActivityCompat.postponeEnterTransition(android.app.Activity)>
	//    2    4:return          
	}

	public void supportStartPostponedEnterTransition()
	{
		ActivityCompat.startPostponedEnterTransition(((android.app.Activity) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #613 <Method void ActivityCompat.startPostponedEnterTransition(android.app.Activity)>
	//    2    4:return          
	}

	public final void validateRequestPermissionsRequestCode(int i)
	{
		if(!mRequestedPermissionsFromFragment && i != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #551 <Field boolean mRequestedPermissionsFromFragment>
	//*   2    4:ifne            16
	//*   3    7:iload_1         
	//*   4    8:iconst_m1       
	//*   5    9:icmpeq          16
			checkForValidRequestCode(i);
	//    6   12:iload_1         
	//    7   13:invokestatic    #549 <Method void checkForValidRequestCode(int)>
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
	int mNextCandidateRequestIndex;
	n mPendingFragmentActivityResults;
	boolean mReallyStopped;
	boolean mRequestedPermissionsFromFragment;
	boolean mResumed;
	boolean mRetaining;
	boolean mStopped;
}
