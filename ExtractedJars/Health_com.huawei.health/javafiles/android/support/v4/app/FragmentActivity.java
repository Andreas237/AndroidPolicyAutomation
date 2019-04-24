// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.content.*;
import android.content.res.Configuration;
import android.os.*;
import android.support.v4.util.SimpleArrayMap;
import android.support.v4.util.SparseArrayCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.*;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//			BaseFragmentActivityJB, FragmentController, Fragment, FragmentManager, 
//			ActivityCompat, LoaderManager, SharedElementCallback, FragmentHostCallback, 
//			FragmentManagerNonConfig

public class FragmentActivity extends BaseFragmentActivityJB
	implements ActivityCompat.OnRequestPermissionsResultCallback, ActivityCompatApi23.RequestPermissionsRequestCodeValidator
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
		//    6    9:invokevirtual   #29  <Method void FragmentActivity.dump(String, FileDescriptor, PrintWriter, String[])>
		//    7   12:return          
		}

		public View onFindViewById(int i)
		{
			return findViewById(i);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field FragmentActivity this$0>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #36  <Method View FragmentActivity.findViewById(int)>
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
		//    1    1:invokevirtual   #41  <Method FragmentActivity onGetHost()>
		//    2    4:areturn         
		}

		public LayoutInflater onGetLayoutInflater()
		{
			return getLayoutInflater().cloneInContext(((Context) (FragmentActivity.this)));
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field FragmentActivity this$0>
		//    2    4:invokevirtual   #46  <Method LayoutInflater FragmentActivity.getLayoutInflater()>
		//    3    7:aload_0         
		//    4    8:getfield        #14  <Field FragmentActivity this$0>
		//    5   11:invokevirtual   #52  <Method LayoutInflater LayoutInflater.cloneInContext(Context)>
		//    6   14:areturn         
		}

		public int onGetWindowAnimations()
		{
			Window window = getWindow();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field FragmentActivity this$0>
		//    2    4:invokevirtual   #58  <Method Window FragmentActivity.getWindow()>
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
		//    9   15:invokevirtual   #64  <Method android.view.WindowManager$LayoutParams Window.getAttributes()>
		//   10   18:getfield        #70  <Field int android.view.WindowManager$LayoutParams.windowAnimations>
		//   11   21:ireturn         
		}

		public boolean onHasView()
		{
			Window window = getWindow();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field FragmentActivity this$0>
		//    2    4:invokevirtual   #58  <Method Window FragmentActivity.getWindow()>
		//    3    7:astore_1        
			return window != null && window.peekDecorView() != null;
		//    4    8:aload_1         
		//    5    9:ifnull          21
		//    6   12:aload_1         
		//    7   13:invokevirtual   #76  <Method View Window.peekDecorView()>
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
		//    2    4:invokevirtual   #58  <Method Window FragmentActivity.getWindow()>
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
		//    5    7:invokevirtual   #83  <Method void FragmentActivity.requestPermissionsFromFragment(Fragment, String[], int)>
		//    6   10:return          
		}

		public boolean onShouldSaveFragmentState(Fragment fragment)
		{
			return !isFinishing();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field FragmentActivity this$0>
		//    2    4:invokevirtual   #89  <Method boolean FragmentActivity.isFinishing()>
		//    3    7:ifne            12
		//    4   10:iconst_1        
		//    5   11:ireturn         
		//    6   12:iconst_0        
		//    7   13:ireturn         
		}

		public boolean onShouldShowRequestPermissionRationale(String s)
		{
			return ActivityCompat.shouldShowRequestPermissionRationale(((android.app.Activity) (FragmentActivity.this)), s);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field FragmentActivity this$0>
		//    2    4:aload_1         
		//    3    5:invokestatic    #97  <Method boolean ActivityCompat.shouldShowRequestPermissionRationale(android.app.Activity, String)>
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
		//    5    7:invokevirtual   #102 <Method void FragmentActivity.startActivityFromFragment(Fragment, Intent, int)>
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
		//    6    9:invokevirtual   #105 <Method void FragmentActivity.startActivityFromFragment(Fragment, Intent, int, Bundle)>
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
		//   10   17:invokevirtual   #112 <Method void FragmentActivity.startIntentSenderFromFragment(Fragment, IntentSender, int, Intent, int, int, int, Bundle)>
		//   11   20:return          
		}

		public void onSupportInvalidateOptionsMenu()
		{
			supportInvalidateOptionsMenu();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field FragmentActivity this$0>
		//    2    4:invokevirtual   #118 <Method void FragmentActivity.supportInvalidateOptionsMenu()>
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
		SimpleArrayMap loaders;

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
	//    1    1:invokespecial   #58  <Method void BaseFragmentActivityJB()>
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
		if(mPendingFragmentActivityResults.size() >= 65534)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//*   2    4:invokevirtual   #87  <Method int SparseArrayCompat.size()>
	//*   3    7:ldc1            #26  <Int 65534>
	//*   4    9:icmplt          22
			throw new IllegalStateException("Too many pending Fragment activity results.");
	//    5   12:new             #89  <Class IllegalStateException>
	//    6   15:dup             
	//    7   16:ldc1            #91  <String "Too many pending Fragment activity results.">
	//    8   18:invokespecial   #94  <Method void IllegalStateException(String)>
	//    9   21:athrow          
		for(; mPendingFragmentActivityResults.indexOfKey(mNextCandidateRequestIndex) >= 0; mNextCandidateRequestIndex = (mNextCandidateRequestIndex + 1) % 65534);
	//   10   22:aload_0         
	//   11   23:getfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//   12   26:aload_0         
	//   13   27:getfield        #96  <Field int mNextCandidateRequestIndex>
	//   14   30:invokevirtual   #100 <Method int SparseArrayCompat.indexOfKey(int)>
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
		mPendingFragmentActivityResults.put(i, ((Object) (fragment.mWho)));
	//   28   57:aload_0         
	//   29   58:getfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//   30   61:iload_2         
	//   31   62:aload_1         
	//   32   63:getfield        #105 <Field String Fragment.mWho>
	//   33   66:invokevirtual   #109 <Method void SparseArrayCompat.put(int, Object)>
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

	final View dispatchFragmentsOnCreateView(View view, String s, Context context, AttributeSet attributeset)
	{
		return mFragments.onCreateView(view, s, context, attributeset);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field FragmentController mFragments>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #114 <Method View FragmentController.onCreateView(View, String, Context, AttributeSet)>
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
	//    8   14:putfield        #118 <Field boolean mRetaining>
			mHandler.removeMessages(1);
	//    9   17:aload_0         
	//   10   18:getfield        #63  <Field Handler mHandler>
	//   11   21:iconst_1        
	//   12   22:invokevirtual   #124 <Method void Handler.removeMessages(int)>
			onReallyStop();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #127 <Method void onReallyStop()>
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
	//   20   38:invokevirtual   #130 <Method void FragmentController.doLoaderStart()>
			mFragments.doLoaderStop(true);
	//   21   41:aload_0         
	//   22   42:getfield        #72  <Field FragmentController mFragments>
	//   23   45:iconst_1        
	//   24   46:invokevirtual   #133 <Method void FragmentController.doLoaderStop(boolean)>
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
	//    5    6:invokespecial   #137 <Method void BaseFragmentActivityJB.dump(String, FileDescriptor, PrintWriter, String[])>
		printwriter.print(s);
	//    6    9:aload_3         
	//    7   10:aload_1         
	//    8   11:invokevirtual   #142 <Method void PrintWriter.print(String)>
		printwriter.print("Local FragmentActivity ");
	//    9   14:aload_3         
	//   10   15:ldc1            #144 <String "Local FragmentActivity ">
	//   11   17:invokevirtual   #142 <Method void PrintWriter.print(String)>
		printwriter.print(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//   12   20:aload_3         
	//   13   21:aload_0         
	//   14   22:invokestatic    #150 <Method int System.identityHashCode(Object)>
	//   15   25:invokestatic    #156 <Method String Integer.toHexString(int)>
	//   16   28:invokevirtual   #142 <Method void PrintWriter.print(String)>
		printwriter.println(" State:");
	//   17   31:aload_3         
	//   18   32:ldc1            #158 <String " State:">
	//   19   34:invokevirtual   #161 <Method void PrintWriter.println(String)>
		String s1 = (new StringBuilder()).append(s).append("  ").toString();
	//   20   37:new             #163 <Class StringBuilder>
	//   21   40:dup             
	//   22   41:invokespecial   #164 <Method void StringBuilder()>
	//   23   44:aload_1         
	//   24   45:invokevirtual   #168 <Method StringBuilder StringBuilder.append(String)>
	//   25   48:ldc1            #170 <String "  ">
	//   26   50:invokevirtual   #168 <Method StringBuilder StringBuilder.append(String)>
	//   27   53:invokevirtual   #174 <Method String StringBuilder.toString()>
	//   28   56:astore          5
		printwriter.print(s1);
	//   29   58:aload_3         
	//   30   59:aload           5
	//   31   61:invokevirtual   #142 <Method void PrintWriter.print(String)>
		printwriter.print("mCreated=");
	//   32   64:aload_3         
	//   33   65:ldc1            #176 <String "mCreated=">
	//   34   67:invokevirtual   #142 <Method void PrintWriter.print(String)>
		printwriter.print(mCreated);
	//   35   70:aload_3         
	//   36   71:aload_0         
	//   37   72:getfield        #178 <Field boolean mCreated>
	//   38   75:invokevirtual   #180 <Method void PrintWriter.print(boolean)>
		printwriter.print("mResumed=");
	//   39   78:aload_3         
	//   40   79:ldc1            #182 <String "mResumed=">
	//   41   81:invokevirtual   #142 <Method void PrintWriter.print(String)>
		printwriter.print(mResumed);
	//   42   84:aload_3         
	//   43   85:aload_0         
	//   44   86:getfield        #184 <Field boolean mResumed>
	//   45   89:invokevirtual   #180 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mStopped=");
	//   46   92:aload_3         
	//   47   93:ldc1            #186 <String " mStopped=">
	//   48   95:invokevirtual   #142 <Method void PrintWriter.print(String)>
		printwriter.print(mStopped);
	//   49   98:aload_3         
	//   50   99:aload_0         
	//   51  100:getfield        #74  <Field boolean mStopped>
	//   52  103:invokevirtual   #180 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mReallyStopped=");
	//   53  106:aload_3         
	//   54  107:ldc1            #188 <String " mReallyStopped=">
	//   55  109:invokevirtual   #142 <Method void PrintWriter.print(String)>
		printwriter.println(mReallyStopped);
	//   56  112:aload_3         
	//   57  113:aload_0         
	//   58  114:getfield        #76  <Field boolean mReallyStopped>
	//   59  117:invokevirtual   #190 <Method void PrintWriter.println(boolean)>
		mFragments.dumpLoaders(s1, filedescriptor, printwriter, as);
	//   60  120:aload_0         
	//   61  121:getfield        #72  <Field FragmentController mFragments>
	//   62  124:aload           5
	//   63  126:aload_2         
	//   64  127:aload_3         
	//   65  128:aload           4
	//   66  130:invokevirtual   #193 <Method void FragmentController.dumpLoaders(String, FileDescriptor, PrintWriter, String[])>
		mFragments.getSupportFragmentManager().dump(s, filedescriptor, printwriter, as);
	//   67  133:aload_0         
	//   68  134:getfield        #72  <Field FragmentController mFragments>
	//   69  137:invokevirtual   #197 <Method FragmentManager FragmentController.getSupportFragmentManager()>
	//   70  140:aload_1         
	//   71  141:aload_2         
	//   72  142:aload_3         
	//   73  143:aload           4
	//   74  145:invokevirtual   #200 <Method void FragmentManager.dump(String, FileDescriptor, PrintWriter, String[])>
	//   75  148:return          
	}

	public Object getLastCustomNonConfigurationInstance()
	{
		NonConfigurationInstances nonconfigurationinstances = (NonConfigurationInstances)getLastNonConfigurationInstance();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #205 <Method Object getLastNonConfigurationInstance()>
	//    2    4:checkcast       #15  <Class FragmentActivity$NonConfigurationInstances>
	//    3    7:astore_1        
		if(nonconfigurationinstances != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          17
			return nonconfigurationinstances.custom;
	//    6   12:aload_1         
	//    7   13:getfield        #209 <Field Object FragmentActivity$NonConfigurationInstances.custom>
	//    8   16:areturn         
		else
			return ((Object) (null));
	//    9   17:aconst_null     
	//   10   18:areturn         
	}

	public FragmentManager getSupportFragmentManager()
	{
		return mFragments.getSupportFragmentManager();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field FragmentController mFragments>
	//    2    4:invokevirtual   #197 <Method FragmentManager FragmentController.getSupportFragmentManager()>
	//    3    7:areturn         
	}

	public LoaderManager getSupportLoaderManager()
	{
		return mFragments.getSupportLoaderManager();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field FragmentController mFragments>
	//    2    4:invokevirtual   #213 <Method LoaderManager FragmentController.getSupportLoaderManager()>
	//    3    7:areturn         
	}

	protected void onActivityResult(int i, int j, Intent intent)
	{
		mFragments.noteStateNotSaved();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field FragmentController mFragments>
	//    2    4:invokevirtual   #218 <Method void FragmentController.noteStateNotSaved()>
		int k = i >> 16;
	//    3    7:iload_1         
	//    4    8:bipush          16
	//    5   10:ishr            
	//    6   11:istore          4
		if(k != 0)
	//*   7   13:iload           4
	//*   8   15:ifeq            116
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
	//   16   30:invokevirtual   #222 <Method Object SparseArrayCompat.get(int)>
	//   17   33:checkcast       #224 <Class String>
	//   18   36:astore          5
			mPendingFragmentActivityResults.remove(k);
	//   19   38:aload_0         
	//   20   39:getfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//   21   42:iload           4
	//   22   44:invokevirtual   #227 <Method void SparseArrayCompat.remove(int)>
			if(s == null)
	//*  23   47:aload           5
	//*  24   49:ifnonnull       61
			{
				Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
	//   25   52:ldc1            #39  <String "FragmentActivity">
	//   26   54:ldc1            #229 <String "Activity result delivered for unknown Fragment.">
	//   27   56:invokestatic    #235 <Method int Log.w(String, String)>
	//   28   59:pop             
				return;
	//   29   60:return          
			}
			Fragment fragment = mFragments.findFragmentByWho(s);
	//   30   61:aload_0         
	//   31   62:getfield        #72  <Field FragmentController mFragments>
	//   32   65:aload           5
	//   33   67:invokevirtual   #239 <Method Fragment FragmentController.findFragmentByWho(String)>
	//   34   70:astore          6
			if(fragment == null)
	//*  35   72:aload           6
	//*  36   74:ifnonnull       104
			{
				Log.w("FragmentActivity", (new StringBuilder()).append("Activity result no fragment exists for who: ").append(s).toString());
	//   37   77:ldc1            #39  <String "FragmentActivity">
	//   38   79:new             #163 <Class StringBuilder>
	//   39   82:dup             
	//   40   83:invokespecial   #164 <Method void StringBuilder()>
	//   41   86:ldc1            #241 <String "Activity result no fragment exists for who: ">
	//   42   88:invokevirtual   #168 <Method StringBuilder StringBuilder.append(String)>
	//   43   91:aload           5
	//   44   93:invokevirtual   #168 <Method StringBuilder StringBuilder.append(String)>
	//   45   96:invokevirtual   #174 <Method String StringBuilder.toString()>
	//   46   99:invokestatic    #235 <Method int Log.w(String, String)>
	//   47  102:pop             
				return;
	//   48  103:return          
			} else
			{
				fragment.onActivityResult(0xffff & i, j, intent);
	//   49  104:aload           6
	//   50  106:ldc1            #242 <Int 65535>
	//   51  108:iload_1         
	//   52  109:iand            
	//   53  110:iload_2         
	//   54  111:aload_3         
	//   55  112:invokevirtual   #244 <Method void Fragment.onActivityResult(int, int, Intent)>
				return;
	//   56  115:return          
			}
		} else
		{
			super.onActivityResult(i, j, intent);
	//   57  116:aload_0         
	//   58  117:iload_1         
	//   59  118:iload_2         
	//   60  119:aload_3         
	//   61  120:invokespecial   #245 <Method void BaseFragmentActivityJB.onActivityResult(int, int, Intent)>
			return;
	//   62  123:return          
		}
	}

	public void onAttachFragment(Fragment fragment)
	{
	//    0    0:return          
	}

	public void onBackPressed()
	{
		if(!mFragments.getSupportFragmentManager().popBackStackImmediate())
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field FragmentController mFragments>
	//*   2    4:invokevirtual   #197 <Method FragmentManager FragmentController.getSupportFragmentManager()>
	//*   3    7:invokevirtual   #252 <Method boolean FragmentManager.popBackStackImmediate()>
	//*   4   10:ifne            17
			super.onBackPressed();
	//    5   13:aload_0         
	//    6   14:invokespecial   #254 <Method void BaseFragmentActivityJB.onBackPressed()>
	//    7   17:return          
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #258 <Method void BaseFragmentActivityJB.onConfigurationChanged(Configuration)>
		mFragments.dispatchConfigurationChanged(configuration);
	//    3    5:aload_0         
	//    4    6:getfield        #72  <Field FragmentController mFragments>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #261 <Method void FragmentController.dispatchConfigurationChanged(Configuration)>
	//    7   13:return          
	}

	protected void onCreate(Bundle bundle)
	{
		mFragments.attachHost(((Fragment) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field FragmentController mFragments>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #267 <Method void FragmentController.attachHost(Fragment)>
		super.onCreate(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #269 <Method void BaseFragmentActivityJB.onCreate(Bundle)>
		Object obj = ((Object) ((NonConfigurationInstances)getLastNonConfigurationInstance()));
	//    7   13:aload_0         
	//    8   14:invokevirtual   #205 <Method Object getLastNonConfigurationInstance()>
	//    9   17:checkcast       #15  <Class FragmentActivity$NonConfigurationInstances>
	//   10   20:astore_3        
		if(obj != null)
	//*  11   21:aload_3         
	//*  12   22:ifnull          36
			mFragments.restoreLoaderNonConfig(((NonConfigurationInstances) (obj)).loaders);
	//   13   25:aload_0         
	//   14   26:getfield        #72  <Field FragmentController mFragments>
	//   15   29:aload_3         
	//   16   30:getfield        #273 <Field SimpleArrayMap FragmentActivity$NonConfigurationInstances.loaders>
	//   17   33:invokevirtual   #277 <Method void FragmentController.restoreLoaderNonConfig(SimpleArrayMap)>
		if(bundle != null)
	//*  18   36:aload_1         
	//*  19   37:ifnull          177
		{
			android.os.Parcelable parcelable = bundle.getParcelable("android:support:fragments");
	//   20   40:aload_1         
	//   21   41:ldc1            #23  <String "android:support:fragments">
	//   22   43:invokevirtual   #283 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   23   46:astore          4
			FragmentController fragmentcontroller = mFragments;
	//   24   48:aload_0         
	//   25   49:getfield        #72  <Field FragmentController mFragments>
	//   26   52:astore          5
			if(obj != null)
	//*  27   54:aload_3         
	//*  28   55:ifnull          66
				obj = ((Object) (((NonConfigurationInstances) (obj)).fragments));
	//   29   58:aload_3         
	//   30   59:getfield        #287 <Field FragmentManagerNonConfig FragmentActivity$NonConfigurationInstances.fragments>
	//   31   62:astore_3        
			else
	//*  32   63:goto            68
				obj = null;
	//   33   66:aconst_null     
	//   34   67:astore_3        
			fragmentcontroller.restoreAllState(parcelable, ((FragmentManagerNonConfig) (obj)));
	//   35   68:aload           5
	//   36   70:aload           4
	//   37   72:aload_3         
	//   38   73:invokevirtual   #291 <Method void FragmentController.restoreAllState(android.os.Parcelable, FragmentManagerNonConfig)>
			if(bundle.containsKey("android:support:next_request_index"))
	//*  39   76:aload_1         
	//*  40   77:ldc1            #33  <String "android:support:next_request_index">
	//*  41   79:invokevirtual   #295 <Method boolean Bundle.containsKey(String)>
	//*  42   82:ifeq            177
			{
				mNextCandidateRequestIndex = bundle.getInt("android:support:next_request_index");
	//   43   85:aload_0         
	//   44   86:aload_1         
	//   45   87:ldc1            #33  <String "android:support:next_request_index">
	//   46   89:invokevirtual   #299 <Method int Bundle.getInt(String)>
	//   47   92:putfield        #96  <Field int mNextCandidateRequestIndex>
				int ai[] = bundle.getIntArray("android:support:request_indicies");
	//   48   95:aload_1         
	//   49   96:ldc1            #20  <String "android:support:request_indicies">
	//   50   98:invokevirtual   #303 <Method int[] Bundle.getIntArray(String)>
	//   51  101:astore_3        
				bundle = ((Bundle) (bundle.getStringArray("android:support:request_fragment_who")));
	//   52  102:aload_1         
	//   53  103:ldc1            #36  <String "android:support:request_fragment_who">
	//   54  105:invokevirtual   #307 <Method String[] Bundle.getStringArray(String)>
	//   55  108:astore_1        
				if(ai == null || bundle == null || ai.length != bundle.length)
	//*  56  109:aload_3         
	//*  57  110:ifnull          124
	//*  58  113:aload_1         
	//*  59  114:ifnull          124
	//*  60  117:aload_3         
	//*  61  118:arraylength     
	//*  62  119:aload_1         
	//*  63  120:arraylength     
	//*  64  121:icmpeq          136
				{
					Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
	//   65  124:ldc1            #39  <String "FragmentActivity">
	//   66  126:ldc2            #309 <String "Invalid requestCode mapping in savedInstanceState.">
	//   67  129:invokestatic    #235 <Method int Log.w(String, String)>
	//   68  132:pop             
				} else
	//*  69  133:goto            177
				{
					mPendingFragmentActivityResults = new SparseArrayCompat(ai.length);
	//   70  136:aload_0         
	//   71  137:new             #83  <Class SparseArrayCompat>
	//   72  140:dup             
	//   73  141:aload_3         
	//   74  142:arraylength     
	//   75  143:invokespecial   #311 <Method void SparseArrayCompat(int)>
	//   76  146:putfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
					for(int i = 0; i < ai.length; i++)
	//*  77  149:iconst_0        
	//*  78  150:istore_2        
	//*  79  151:iload_2         
	//*  80  152:aload_3         
	//*  81  153:arraylength     
	//*  82  154:icmpge          177
						mPendingFragmentActivityResults.put(ai[i], ((Object) (bundle[i])));
	//   83  157:aload_0         
	//   84  158:getfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//   85  161:aload_3         
	//   86  162:iload_2         
	//   87  163:iaload          
	//   88  164:aload_1         
	//   89  165:iload_2         
	//   90  166:aaload          
	//   91  167:invokevirtual   #109 <Method void SparseArrayCompat.put(int, Object)>

	//   92  170:iload_2         
	//   93  171:iconst_1        
	//   94  172:iadd            
	//   95  173:istore_2        
				}
			}
		}
	//*  96  174:goto            151
		if(mPendingFragmentActivityResults == null)
	//*  97  177:aload_0         
	//*  98  178:getfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//*  99  181:ifnonnull       200
		{
			mPendingFragmentActivityResults = new SparseArrayCompat();
	//  100  184:aload_0         
	//  101  185:new             #83  <Class SparseArrayCompat>
	//  102  188:dup             
	//  103  189:invokespecial   #312 <Method void SparseArrayCompat()>
	//  104  192:putfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
			mNextCandidateRequestIndex = 0;
	//  105  195:aload_0         
	//  106  196:iconst_0        
	//  107  197:putfield        #96  <Field int mNextCandidateRequestIndex>
		}
		mFragments.dispatchCreate();
	//  108  200:aload_0         
	//  109  201:getfield        #72  <Field FragmentController mFragments>
	//  110  204:invokevirtual   #315 <Method void FragmentController.dispatchCreate()>
	//  111  207:return          
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
	//    5    7:invokespecial   #320 <Method boolean BaseFragmentActivityJB.onCreatePanelMenu(int, Menu)>
	//    6   10:aload_0         
	//    7   11:getfield        #72  <Field FragmentController mFragments>
	//    8   14:aload_2         
	//    9   15:aload_0         
	//   10   16:invokevirtual   #324 <Method android.view.MenuInflater getMenuInflater()>
	//   11   19:invokevirtual   #328 <Method boolean FragmentController.dispatchCreateOptionsMenu(Menu, android.view.MenuInflater)>
	//   12   22:ior             
	//   13   23:ireturn         
		else
			return super.onCreatePanelMenu(i, menu);
	//   14   24:aload_0         
	//   15   25:iload_1         
	//   16   26:aload_2         
	//   17   27:invokespecial   #320 <Method boolean BaseFragmentActivityJB.onCreatePanelMenu(int, Menu)>
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
	//    5    6:invokespecial   #329 <Method View BaseFragmentActivityJB.onCreateView(View, String, Context, AttributeSet)>
	//    6    9:areturn         
	}

	public volatile View onCreateView(String s, Context context, AttributeSet attributeset)
	{
		return super.onCreateView(s, context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #332 <Method View BaseFragmentActivityJB.onCreateView(String, Context, AttributeSet)>
	//    5    7:areturn         
	}

	protected void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #335 <Method void BaseFragmentActivityJB.onDestroy()>
		doReallyStop(false);
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #337 <Method void doReallyStop(boolean)>
		mFragments.dispatchDestroy();
	//    5    9:aload_0         
	//    6   10:getfield        #72  <Field FragmentController mFragments>
	//    7   13:invokevirtual   #340 <Method void FragmentController.dispatchDestroy()>
		mFragments.doLoaderDestroy();
	//    8   16:aload_0         
	//    9   17:getfield        #72  <Field FragmentController mFragments>
	//   10   20:invokevirtual   #343 <Method void FragmentController.doLoaderDestroy()>
	//   11   23:return          
	}

	public void onLowMemory()
	{
		super.onLowMemory();
	//    0    0:aload_0         
	//    1    1:invokespecial   #346 <Method void BaseFragmentActivityJB.onLowMemory()>
		mFragments.dispatchLowMemory();
	//    2    4:aload_0         
	//    3    5:getfield        #72  <Field FragmentController mFragments>
	//    4    8:invokevirtual   #349 <Method void FragmentController.dispatchLowMemory()>
	//    5   11:return          
	}

	public boolean onMenuItemSelected(int i, MenuItem menuitem)
	{
		if(super.onMenuItemSelected(i, menuitem))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:aload_2         
	//*   3    3:invokespecial   #353 <Method boolean BaseFragmentActivityJB.onMenuItemSelected(int, MenuItem)>
	//*   4    6:ifeq            11
			return true;
	//    5    9:iconst_1        
	//    6   10:ireturn         
		switch(i)
	//*   7   11:iload_1         
		{
	//*   8   12:lookupswitch    2: default 40
	//	               0: 43
	//	               6: 52
	//*   9   40:goto            61
		case 0: // '\0'
			return mFragments.dispatchOptionsItemSelected(menuitem);
	//   10   43:aload_0         
	//   11   44:getfield        #72  <Field FragmentController mFragments>
	//   12   47:aload_2         
	//   13   48:invokevirtual   #357 <Method boolean FragmentController.dispatchOptionsItemSelected(MenuItem)>
	//   14   51:ireturn         

		case 6: // '\006'
			return mFragments.dispatchContextItemSelected(menuitem);
	//   15   52:aload_0         
	//   16   53:getfield        #72  <Field FragmentController mFragments>
	//   17   56:aload_2         
	//   18   57:invokevirtual   #360 <Method boolean FragmentController.dispatchContextItemSelected(MenuItem)>
	//   19   60:ireturn         
		}
		return false;
	//   20   61:iconst_0        
	//   21   62:ireturn         
	}

	public void onMultiWindowModeChanged(boolean flag)
	{
		mFragments.dispatchMultiWindowModeChanged(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field FragmentController mFragments>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #365 <Method void FragmentController.dispatchMultiWindowModeChanged(boolean)>
	//    4    8:return          
	}

	protected void onNewIntent(Intent intent)
	{
		super.onNewIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #370 <Method void BaseFragmentActivityJB.onNewIntent(Intent)>
		mFragments.noteStateNotSaved();
	//    3    5:aload_0         
	//    4    6:getfield        #72  <Field FragmentController mFragments>
	//    5    9:invokevirtual   #218 <Method void FragmentController.noteStateNotSaved()>
	//    6   12:return          
	}

	public void onPanelClosed(int i, Menu menu)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    1: default 20
	//	               0: 23
	//*   2   20:goto            31
		case 0: // '\0'
			mFragments.dispatchOptionsMenuClosed(menu);
	//    3   23:aload_0         
	//    4   24:getfield        #72  <Field FragmentController mFragments>
	//    5   27:aload_2         
	//    6   28:invokevirtual   #376 <Method void FragmentController.dispatchOptionsMenuClosed(Menu)>
			break;
		}
		super.onPanelClosed(i, menu);
	//    7   31:aload_0         
	//    8   32:iload_1         
	//    9   33:aload_2         
	//   10   34:invokespecial   #378 <Method void BaseFragmentActivityJB.onPanelClosed(int, Menu)>
	//   11   37:return          
	}

	protected void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #381 <Method void BaseFragmentActivityJB.onPause()>
		mResumed = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #184 <Field boolean mResumed>
		if(mHandler.hasMessages(2))
	//*   5    9:aload_0         
	//*   6   10:getfield        #63  <Field Handler mHandler>
	//*   7   13:iconst_2        
	//*   8   14:invokevirtual   #385 <Method boolean Handler.hasMessages(int)>
	//*   9   17:ifeq            32
		{
			mHandler.removeMessages(2);
	//   10   20:aload_0         
	//   11   21:getfield        #63  <Field Handler mHandler>
	//   12   24:iconst_2        
	//   13   25:invokevirtual   #124 <Method void Handler.removeMessages(int)>
			onResumeFragments();
	//   14   28:aload_0         
	//   15   29:invokevirtual   #388 <Method void onResumeFragments()>
		}
		mFragments.dispatchPause();
	//   16   32:aload_0         
	//   17   33:getfield        #72  <Field FragmentController mFragments>
	//   18   36:invokevirtual   #391 <Method void FragmentController.dispatchPause()>
	//   19   39:return          
	}

	public void onPictureInPictureModeChanged(boolean flag)
	{
		mFragments.dispatchPictureInPictureModeChanged(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field FragmentController mFragments>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #395 <Method void FragmentController.dispatchPictureInPictureModeChanged(boolean)>
	//    4    8:return          
	}

	protected void onPostResume()
	{
		super.onPostResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #398 <Method void BaseFragmentActivityJB.onPostResume()>
		mHandler.removeMessages(2);
	//    2    4:aload_0         
	//    3    5:getfield        #63  <Field Handler mHandler>
	//    4    8:iconst_2        
	//    5    9:invokevirtual   #124 <Method void Handler.removeMessages(int)>
		onResumeFragments();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #388 <Method void onResumeFragments()>
		mFragments.execPendingActions();
	//    8   16:aload_0         
	//    9   17:getfield        #72  <Field FragmentController mFragments>
	//   10   20:invokevirtual   #401 <Method boolean FragmentController.execPendingActions()>
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
	//    4    4:invokespecial   #411 <Method boolean BaseFragmentActivityJB.onPreparePanel(int, View, Menu)>
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
	//    7   11:invokevirtual   #413 <Method boolean onPrepareOptionsPanel(View, Menu)>
	//    8   14:aload_0         
	//    9   15:getfield        #72  <Field FragmentController mFragments>
	//   10   18:aload_3         
	//   11   19:invokevirtual   #417 <Method boolean FragmentController.dispatchPrepareOptionsMenu(Menu)>
	//   12   22:ior             
	//   13   23:ireturn         
		else
			return super.onPreparePanel(i, view, menu);
	//   14   24:aload_0         
	//   15   25:iload_1         
	//   16   26:aload_2         
	//   17   27:aload_3         
	//   18   28:invokespecial   #411 <Method boolean BaseFragmentActivityJB.onPreparePanel(int, View, Menu)>
	//   19   31:ireturn         
	}

	void onReallyStop()
	{
		mFragments.doLoaderStop(mRetaining);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field FragmentController mFragments>
	//    2    4:aload_0         
	//    3    5:getfield        #118 <Field boolean mRetaining>
	//    4    8:invokevirtual   #133 <Method void FragmentController.doLoaderStop(boolean)>
		mFragments.dispatchReallyStop();
	//    5   11:aload_0         
	//    6   12:getfield        #72  <Field FragmentController mFragments>
	//    7   15:invokevirtual   #420 <Method void FragmentController.dispatchReallyStop()>
	//    8   18:return          
	}

	public void onRequestPermissionsResult(int i, String as[], int ai[])
	{
		int j = i >> 16 & 0xffff;
	//    0    0:iload_1         
	//    1    1:bipush          16
	//    2    3:ishr            
	//    3    4:ldc1            #242 <Int 65535>
	//    4    6:iand            
	//    5    7:istore          4
		if(j != 0)
	//*   6    9:iload           4
	//*   7   11:ifeq            111
		{
			j--;
	//    8   14:iload           4
	//    9   16:iconst_1        
	//   10   17:isub            
	//   11   18:istore          4
			String s = (String)mPendingFragmentActivityResults.get(j);
	//   12   20:aload_0         
	//   13   21:getfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//   14   24:iload           4
	//   15   26:invokevirtual   #222 <Method Object SparseArrayCompat.get(int)>
	//   16   29:checkcast       #224 <Class String>
	//   17   32:astore          5
			mPendingFragmentActivityResults.remove(j);
	//   18   34:aload_0         
	//   19   35:getfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//   20   38:iload           4
	//   21   40:invokevirtual   #227 <Method void SparseArrayCompat.remove(int)>
			if(s == null)
	//*  22   43:aload           5
	//*  23   45:ifnonnull       57
			{
				Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
	//   24   48:ldc1            #39  <String "FragmentActivity">
	//   25   50:ldc1            #229 <String "Activity result delivered for unknown Fragment.">
	//   26   52:invokestatic    #235 <Method int Log.w(String, String)>
	//   27   55:pop             
				return;
	//   28   56:return          
			}
			Fragment fragment = mFragments.findFragmentByWho(s);
	//   29   57:aload_0         
	//   30   58:getfield        #72  <Field FragmentController mFragments>
	//   31   61:aload           5
	//   32   63:invokevirtual   #239 <Method Fragment FragmentController.findFragmentByWho(String)>
	//   33   66:astore          6
			if(fragment == null)
	//*  34   68:aload           6
	//*  35   70:ifnonnull       100
			{
				Log.w("FragmentActivity", (new StringBuilder()).append("Activity result no fragment exists for who: ").append(s).toString());
	//   36   73:ldc1            #39  <String "FragmentActivity">
	//   37   75:new             #163 <Class StringBuilder>
	//   38   78:dup             
	//   39   79:invokespecial   #164 <Method void StringBuilder()>
	//   40   82:ldc1            #241 <String "Activity result no fragment exists for who: ">
	//   41   84:invokevirtual   #168 <Method StringBuilder StringBuilder.append(String)>
	//   42   87:aload           5
	//   43   89:invokevirtual   #168 <Method StringBuilder StringBuilder.append(String)>
	//   44   92:invokevirtual   #174 <Method String StringBuilder.toString()>
	//   45   95:invokestatic    #235 <Method int Log.w(String, String)>
	//   46   98:pop             
				return;
	//   47   99:return          
			}
			fragment.onRequestPermissionsResult(0xffff & i, as, ai);
	//   48  100:aload           6
	//   49  102:ldc1            #242 <Int 65535>
	//   50  104:iload_1         
	//   51  105:iand            
	//   52  106:aload_2         
	//   53  107:aload_3         
	//   54  108:invokevirtual   #425 <Method void Fragment.onRequestPermissionsResult(int, String[], int[])>
		}
	//   55  111:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #428 <Method void BaseFragmentActivityJB.onResume()>
		mHandler.sendEmptyMessage(2);
	//    2    4:aload_0         
	//    3    5:getfield        #63  <Field Handler mHandler>
	//    4    8:iconst_2        
	//    5    9:invokevirtual   #431 <Method boolean Handler.sendEmptyMessage(int)>
	//    6   12:pop             
		mResumed = true;
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:putfield        #184 <Field boolean mResumed>
		mFragments.execPendingActions();
	//   10   18:aload_0         
	//   11   19:getfield        #72  <Field FragmentController mFragments>
	//   12   22:invokevirtual   #401 <Method boolean FragmentController.execPendingActions()>
	//   13   25:pop             
	//   14   26:return          
	}

	protected void onResumeFragments()
	{
		mFragments.dispatchResume();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field FragmentController mFragments>
	//    2    4:invokevirtual   #434 <Method void FragmentController.dispatchResume()>
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
	//    5    9:invokevirtual   #337 <Method void doReallyStop(boolean)>
		Object obj = onRetainCustomNonConfigurationInstance();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #438 <Method Object onRetainCustomNonConfigurationInstance()>
	//    8   16:astore_1        
		FragmentManagerNonConfig fragmentmanagernonconfig = mFragments.retainNestedNonConfig();
	//    9   17:aload_0         
	//   10   18:getfield        #72  <Field FragmentController mFragments>
	//   11   21:invokevirtual   #442 <Method FragmentManagerNonConfig FragmentController.retainNestedNonConfig()>
	//   12   24:astore_2        
		SimpleArrayMap simplearraymap = mFragments.retainLoaderNonConfig();
	//   13   25:aload_0         
	//   14   26:getfield        #72  <Field FragmentController mFragments>
	//   15   29:invokevirtual   #446 <Method SimpleArrayMap FragmentController.retainLoaderNonConfig()>
	//   16   32:astore_3        
		if(fragmentmanagernonconfig == null && simplearraymap == null && obj == null)
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
	//   27   51:invokespecial   #447 <Method void FragmentActivity$NonConfigurationInstances()>
	//   28   54:astore          4
			nonconfigurationinstances.custom = obj;
	//   29   56:aload           4
	//   30   58:aload_1         
	//   31   59:putfield        #209 <Field Object FragmentActivity$NonConfigurationInstances.custom>
			nonconfigurationinstances.fragments = fragmentmanagernonconfig;
	//   32   62:aload           4
	//   33   64:aload_2         
	//   34   65:putfield        #287 <Field FragmentManagerNonConfig FragmentActivity$NonConfigurationInstances.fragments>
			nonconfigurationinstances.loaders = simplearraymap;
	//   35   68:aload           4
	//   36   70:aload_3         
	//   37   71:putfield        #273 <Field SimpleArrayMap FragmentActivity$NonConfigurationInstances.loaders>
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
	//    2    2:invokespecial   #450 <Method void BaseFragmentActivityJB.onSaveInstanceState(Bundle)>
		android.os.Parcelable parcelable = mFragments.saveAllState();
	//    3    5:aload_0         
	//    4    6:getfield        #72  <Field FragmentController mFragments>
	//    5    9:invokevirtual   #454 <Method android.os.Parcelable FragmentController.saveAllState()>
	//    6   12:astore_3        
		if(parcelable != null)
	//*   7   13:aload_3         
	//*   8   14:ifnull          24
			bundle.putParcelable("android:support:fragments", parcelable);
	//    9   17:aload_1         
	//   10   18:ldc1            #23  <String "android:support:fragments">
	//   11   20:aload_3         
	//   12   21:invokevirtual   #458 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		if(mPendingFragmentActivityResults.size() > 0)
	//*  13   24:aload_0         
	//*  14   25:getfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//*  15   28:invokevirtual   #87  <Method int SparseArrayCompat.size()>
	//*  16   31:ifle            127
		{
			bundle.putInt("android:support:next_request_index", mNextCandidateRequestIndex);
	//   17   34:aload_1         
	//   18   35:ldc1            #33  <String "android:support:next_request_index">
	//   19   37:aload_0         
	//   20   38:getfield        #96  <Field int mNextCandidateRequestIndex>
	//   21   41:invokevirtual   #462 <Method void Bundle.putInt(String, int)>
			int ai[] = new int[mPendingFragmentActivityResults.size()];
	//   22   44:aload_0         
	//   23   45:getfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//   24   48:invokevirtual   #87  <Method int SparseArrayCompat.size()>
	//   25   51:newarray        int[]
	//   26   53:astore_3        
			String as[] = new String[mPendingFragmentActivityResults.size()];
	//   27   54:aload_0         
	//   28   55:getfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//   29   58:invokevirtual   #87  <Method int SparseArrayCompat.size()>
	//   30   61:anewarray       String[]
	//   31   64:astore          4
			for(int i = 0; i < mPendingFragmentActivityResults.size(); i++)
	//*  32   66:iconst_0        
	//*  33   67:istore_2        
	//*  34   68:iload_2         
	//*  35   69:aload_0         
	//*  36   70:getfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//*  37   73:invokevirtual   #87  <Method int SparseArrayCompat.size()>
	//*  38   76:icmpge          112
			{
				ai[i] = mPendingFragmentActivityResults.keyAt(i);
	//   39   79:aload_3         
	//   40   80:iload_2         
	//   41   81:aload_0         
	//   42   82:getfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//   43   85:iload_2         
	//   44   86:invokevirtual   #465 <Method int SparseArrayCompat.keyAt(int)>
	//   45   89:iastore         
				as[i] = (String)mPendingFragmentActivityResults.valueAt(i);
	//   46   90:aload           4
	//   47   92:iload_2         
	//   48   93:aload_0         
	//   49   94:getfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//   50   97:iload_2         
	//   51   98:invokevirtual   #468 <Method Object SparseArrayCompat.valueAt(int)>
	//   52  101:checkcast       #224 <Class String>
	//   53  104:aastore         
			}

	//   54  105:iload_2         
	//   55  106:iconst_1        
	//   56  107:iadd            
	//   57  108:istore_2        
	//*  58  109:goto            68
			bundle.putIntArray("android:support:request_indicies", ai);
	//   59  112:aload_1         
	//   60  113:ldc1            #20  <String "android:support:request_indicies">
	//   61  115:aload_3         
	//   62  116:invokevirtual   #472 <Method void Bundle.putIntArray(String, int[])>
			bundle.putStringArray("android:support:request_fragment_who", as);
	//   63  119:aload_1         
	//   64  120:ldc1            #36  <String "android:support:request_fragment_who">
	//   65  122:aload           4
	//   66  124:invokevirtual   #476 <Method void Bundle.putStringArray(String, String[])>
		}
	//   67  127:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #479 <Method void BaseFragmentActivityJB.onStart()>
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
	//   11   19:invokevirtual   #124 <Method void Handler.removeMessages(int)>
		if(!mCreated)
	//*  12   22:aload_0         
	//*  13   23:getfield        #178 <Field boolean mCreated>
	//*  14   26:ifne            41
		{
			mCreated = true;
	//   15   29:aload_0         
	//   16   30:iconst_1        
	//   17   31:putfield        #178 <Field boolean mCreated>
			mFragments.dispatchActivityCreated();
	//   18   34:aload_0         
	//   19   35:getfield        #72  <Field FragmentController mFragments>
	//   20   38:invokevirtual   #482 <Method void FragmentController.dispatchActivityCreated()>
		}
		mFragments.noteStateNotSaved();
	//   21   41:aload_0         
	//   22   42:getfield        #72  <Field FragmentController mFragments>
	//   23   45:invokevirtual   #218 <Method void FragmentController.noteStateNotSaved()>
		mFragments.execPendingActions();
	//   24   48:aload_0         
	//   25   49:getfield        #72  <Field FragmentController mFragments>
	//   26   52:invokevirtual   #401 <Method boolean FragmentController.execPendingActions()>
	//   27   55:pop             
		mFragments.doLoaderStart();
	//   28   56:aload_0         
	//   29   57:getfield        #72  <Field FragmentController mFragments>
	//   30   60:invokevirtual   #130 <Method void FragmentController.doLoaderStart()>
		mFragments.dispatchStart();
	//   31   63:aload_0         
	//   32   64:getfield        #72  <Field FragmentController mFragments>
	//   33   67:invokevirtual   #485 <Method void FragmentController.dispatchStart()>
		mFragments.reportLoaderStart();
	//   34   70:aload_0         
	//   35   71:getfield        #72  <Field FragmentController mFragments>
	//   36   74:invokevirtual   #488 <Method void FragmentController.reportLoaderStart()>
	//   37   77:return          
	}

	public void onStateNotSaved()
	{
		mFragments.noteStateNotSaved();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field FragmentController mFragments>
	//    2    4:invokevirtual   #218 <Method void FragmentController.noteStateNotSaved()>
	//    3    7:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #492 <Method void BaseFragmentActivityJB.onStop()>
		mStopped = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #74  <Field boolean mStopped>
		mHandler.sendEmptyMessage(1);
	//    5    9:aload_0         
	//    6   10:getfield        #63  <Field Handler mHandler>
	//    7   13:iconst_1        
	//    8   14:invokevirtual   #431 <Method boolean Handler.sendEmptyMessage(int)>
	//    9   17:pop             
		mFragments.dispatchStop();
	//   10   18:aload_0         
	//   11   19:getfield        #72  <Field FragmentController mFragments>
	//   12   22:invokevirtual   #495 <Method void FragmentController.dispatchStop()>
	//   13   25:return          
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
	//    6    8:invokestatic    #503 <Method void ActivityCompat.requestPermissions(android.app.Activity, String[], int)>
			return;
	//    7   11:return          
		}
		checkForValidRequestCode(i);
	//    8   12:iload_3         
	//    9   13:invokestatic    #506 <Method void checkForValidRequestCode(int)>
		mRequestedPermissionsFromFragment = true;
	//   10   16:aload_0         
	//   11   17:iconst_1        
	//   12   18:putfield        #508 <Field boolean mRequestedPermissionsFromFragment>
		ActivityCompat.requestPermissions(((android.app.Activity) (this)), as, (allocateRequestIndex(fragment) + 1 << 16) + (0xffff & i));
	//   13   21:aload_0         
	//   14   22:aload_2         
	//   15   23:aload_0         
	//   16   24:aload_1         
	//   17   25:invokespecial   #510 <Method int allocateRequestIndex(Fragment)>
	//   18   28:iconst_1        
	//   19   29:iadd            
	//   20   30:bipush          16
	//   21   32:ishl            
	//   22   33:ldc1            #242 <Int 65535>
	//   23   35:iload_3         
	//   24   36:iand            
	//   25   37:iadd            
	//   26   38:invokestatic    #503 <Method void ActivityCompat.requestPermissions(android.app.Activity, String[], int)>
		mRequestedPermissionsFromFragment = false;
	//   27   41:aload_0         
	//   28   42:iconst_0        
	//   29   43:putfield        #508 <Field boolean mRequestedPermissionsFromFragment>
		return;
	//   30   46:return          
		fragment;
	//   31   47:astore_1        
		mRequestedPermissionsFromFragment = false;
	//   32   48:aload_0         
	//   33   49:iconst_0        
	//   34   50:putfield        #508 <Field boolean mRequestedPermissionsFromFragment>
		throw fragment;
	//   35   53:aload_1         
	//   36   54:athrow          
	}

	public void setEnterSharedElementCallback(SharedElementCallback sharedelementcallback)
	{
		ActivityCompat.setEnterSharedElementCallback(((android.app.Activity) (this)), sharedelementcallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #515 <Method void ActivityCompat.setEnterSharedElementCallback(android.app.Activity, SharedElementCallback)>
	//    3    5:return          
	}

	public void setExitSharedElementCallback(SharedElementCallback sharedelementcallback)
	{
		ActivityCompat.setExitSharedElementCallback(((android.app.Activity) (this)), sharedelementcallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #518 <Method void ActivityCompat.setExitSharedElementCallback(android.app.Activity, SharedElementCallback)>
	//    3    5:return          
	}

	public void startActivityForResult(Intent intent, int i)
	{
		if(!mStartedActivityFromFragment && i != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #523 <Field boolean mStartedActivityFromFragment>
	//*   2    4:ifne            16
	//*   3    7:iload_2         
	//*   4    8:iconst_m1       
	//*   5    9:icmpeq          16
			checkForValidRequestCode(i);
	//    6   12:iload_2         
	//    7   13:invokestatic    #506 <Method void checkForValidRequestCode(int)>
		super.startActivityForResult(intent, i);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:iload_2         
	//   11   19:invokespecial   #525 <Method void BaseFragmentActivityJB.startActivityForResult(Intent, int)>
	//   12   22:return          
	}

	public volatile void startActivityForResult(Intent intent, int i, Bundle bundle)
	{
		super.startActivityForResult(intent, i, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #530 <Method void BaseFragmentActivityJB.startActivityForResult(Intent, int, Bundle)>
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
	//    5    5:invokevirtual   #535 <Method void startActivityFromFragment(Fragment, Intent, int, Bundle)>
	//    6    8:return          
	}

	public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle)
	{
		mStartedActivityFromFragment = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #523 <Field boolean mStartedActivityFromFragment>
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
	//   10   15:invokestatic    #538 <Method void ActivityCompat.startActivityForResult(android.app.Activity, Intent, int, Bundle)>
		mStartedActivityFromFragment = false;
	//   11   18:aload_0         
	//   12   19:iconst_0        
	//   13   20:putfield        #523 <Field boolean mStartedActivityFromFragment>
		return;
	//   14   23:return          
		checkForValidRequestCode(i);
	//   15   24:iload_3         
	//   16   25:invokestatic    #506 <Method void checkForValidRequestCode(int)>
		ActivityCompat.startActivityForResult(((android.app.Activity) (this)), intent, (allocateRequestIndex(fragment) + 1 << 16) + (0xffff & i), bundle);
	//   17   28:aload_0         
	//   18   29:aload_2         
	//   19   30:aload_0         
	//   20   31:aload_1         
	//   21   32:invokespecial   #510 <Method int allocateRequestIndex(Fragment)>
	//   22   35:iconst_1        
	//   23   36:iadd            
	//   24   37:bipush          16
	//   25   39:ishl            
	//   26   40:ldc1            #242 <Int 65535>
	//   27   42:iload_3         
	//   28   43:iand            
	//   29   44:iadd            
	//   30   45:aload           4
	//   31   47:invokestatic    #538 <Method void ActivityCompat.startActivityForResult(android.app.Activity, Intent, int, Bundle)>
		mStartedActivityFromFragment = false;
	//   32   50:aload_0         
	//   33   51:iconst_0        
	//   34   52:putfield        #523 <Field boolean mStartedActivityFromFragment>
		return;
	//   35   55:return          
		fragment;
	//   36   56:astore_1        
		mStartedActivityFromFragment = false;
	//   37   57:aload_0         
	//   38   58:iconst_0        
	//   39   59:putfield        #523 <Field boolean mStartedActivityFromFragment>
		throw fragment;
	//   40   62:aload_1         
	//   41   63:athrow          
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
	//    7   10:invokespecial   #544 <Method void BaseFragmentActivityJB.startIntentSenderForResult(IntentSender, int, Intent, int, int, int)>
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
	//    8   12:invokespecial   #548 <Method void BaseFragmentActivityJB.startIntentSenderForResult(IntentSender, int, Intent, int, int, int, Bundle)>
	//    9   15:return          
	}

	public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentsender, int i, Intent intent, int j, int k, int l, 
			Bundle bundle)
		throws android.content.IntentSender.SendIntentException
	{
		mStartedIntentSenderFromFragment = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #553 <Field boolean mStartedIntentSenderFromFragment>
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
	//   14   23:invokestatic    #556 <Method void ActivityCompat.startIntentSenderForResult(android.app.Activity, IntentSender, int, Intent, int, int, int, Bundle)>
		mStartedIntentSenderFromFragment = false;
	//   15   26:aload_0         
	//   16   27:iconst_0        
	//   17   28:putfield        #553 <Field boolean mStartedIntentSenderFromFragment>
		return;
	//   18   31:return          
		checkForValidRequestCode(i);
	//   19   32:iload_3         
	//   20   33:invokestatic    #506 <Method void checkForValidRequestCode(int)>
		ActivityCompat.startIntentSenderForResult(((android.app.Activity) (this)), intentsender, (allocateRequestIndex(fragment) + 1 << 16) + (0xffff & i), intent, j, k, l, bundle);
	//   21   36:aload_0         
	//   22   37:aload_2         
	//   23   38:aload_0         
	//   24   39:aload_1         
	//   25   40:invokespecial   #510 <Method int allocateRequestIndex(Fragment)>
	//   26   43:iconst_1        
	//   27   44:iadd            
	//   28   45:bipush          16
	//   29   47:ishl            
	//   30   48:ldc1            #242 <Int 65535>
	//   31   50:iload_3         
	//   32   51:iand            
	//   33   52:iadd            
	//   34   53:aload           4
	//   35   55:iload           5
	//   36   57:iload           6
	//   37   59:iload           7
	//   38   61:aload           8
	//   39   63:invokestatic    #556 <Method void ActivityCompat.startIntentSenderForResult(android.app.Activity, IntentSender, int, Intent, int, int, int, Bundle)>
		mStartedIntentSenderFromFragment = false;
	//   40   66:aload_0         
	//   41   67:iconst_0        
	//   42   68:putfield        #553 <Field boolean mStartedIntentSenderFromFragment>
		return;
	//   43   71:return          
		fragment;
	//   44   72:astore_1        
		mStartedIntentSenderFromFragment = false;
	//   45   73:aload_0         
	//   46   74:iconst_0        
	//   47   75:putfield        #553 <Field boolean mStartedIntentSenderFromFragment>
		throw fragment;
	//   48   78:aload_1         
	//   49   79:athrow          
	}

	public void supportFinishAfterTransition()
	{
		ActivityCompat.finishAfterTransition(((android.app.Activity) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #561 <Method void ActivityCompat.finishAfterTransition(android.app.Activity)>
	//    2    4:return          
	}

	public void supportInvalidateOptionsMenu()
	{
		invalidateOptionsMenu();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #566 <Method void invalidateOptionsMenu()>
	//    2    4:return          
	}

	public void supportPostponeEnterTransition()
	{
		ActivityCompat.postponeEnterTransition(((android.app.Activity) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #571 <Method void ActivityCompat.postponeEnterTransition(android.app.Activity)>
	//    2    4:return          
	}

	public void supportStartPostponedEnterTransition()
	{
		ActivityCompat.startPostponedEnterTransition(((android.app.Activity) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #575 <Method void ActivityCompat.startPostponedEnterTransition(android.app.Activity)>
	//    2    4:return          
	}

	public final void validateRequestPermissionsRequestCode(int i)
	{
		if(!mRequestedPermissionsFromFragment && i != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #508 <Field boolean mRequestedPermissionsFromFragment>
	//*   2    4:ifne            16
	//*   3    7:iload_1         
	//*   4    8:iconst_m1       
	//*   5    9:icmpeq          16
			checkForValidRequestCode(i);
	//    6   12:iload_1         
	//    7   13:invokestatic    #506 <Method void checkForValidRequestCode(int)>
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
		//*   2    4:lookupswitch    2: default 32
		//		               1: 35
		//		               2: 54
		//*   3   32:goto            73
			case 1: // '\001'
				if(mStopped)
		//*   4   35:aload_0         
		//*   5   36:getfield        #12  <Field FragmentActivity this$0>
		//*   6   39:getfield        #28  <Field boolean FragmentActivity.mStopped>
		//*   7   42:ifeq            78
				{
					doReallyStop(false);
		//    8   45:aload_0         
		//    9   46:getfield        #12  <Field FragmentActivity this$0>
		//   10   49:iconst_0        
		//   11   50:invokevirtual   #32  <Method void FragmentActivity.doReallyStop(boolean)>
					return;
		//   12   53:return          
				}
				break;

			case 2: // '\002'
				onResumeFragments();
		//   13   54:aload_0         
		//   14   55:getfield        #12  <Field FragmentActivity this$0>
		//   15   58:invokevirtual   #35  <Method void FragmentActivity.onResumeFragments()>
				mFragments.execPendingActions();
		//   16   61:aload_0         
		//   17   62:getfield        #12  <Field FragmentActivity this$0>
		//   18   65:getfield        #39  <Field FragmentController FragmentActivity.mFragments>
		//   19   68:invokevirtual   #45  <Method boolean FragmentController.execPendingActions()>
		//   20   71:pop             
				return;
		//   21   72:return          

			default:
				super.handleMessage(message);
		//   22   73:aload_0         
		//   23   74:aload_1         
		//   24   75:invokespecial   #47  <Method void Handler.handleMessage(Message)>
				break;
			}
		//   25   78:return          
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
	boolean mReallyStopped;
	boolean mRequestedPermissionsFromFragment;
	boolean mResumed;
	boolean mRetaining;
	boolean mStopped;
}
