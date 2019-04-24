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
			return !isFinishing();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field FragmentActivity this$0>
		//    2    4:invokevirtual   #86  <Method boolean FragmentActivity.isFinishing()>
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
		} else
	//*  15   29:return          
		if(flag)
	//*  16   30:iload_1         
	//*  17   31:ifeq            29
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
			return;
	//   25   49:return          
		}
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		super.dump(s, filedescriptor, printwriter, as);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #137 <Method void BaseFragmentActivityApi16.dump(String, FileDescriptor, PrintWriter, String[])>
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
	//   61  120:invokespecial   #245 <Method void BaseFragmentActivityApi16.onActivityResult(int, int, Intent)>
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
		FragmentManager fragmentmanager = mFragments.getSupportFragmentManager();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field FragmentController mFragments>
	//    2    4:invokevirtual   #197 <Method FragmentManager FragmentController.getSupportFragmentManager()>
	//    3    7:astore_2        
		for(boolean flag = fragmentmanager.isStateSaved(); flag && android.os.Build.VERSION.SDK_INT <= 25 || !flag && fragmentmanager.popBackStackImmediate();)
	//*   4    8:aload_2         
	//*   5    9:invokevirtual   #252 <Method boolean FragmentManager.isStateSaved()>
	//*   6   12:istore_1        
	//*   7   13:iload_1         
	//*   8   14:ifeq            26
	//*   9   17:getstatic       #257 <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   20:bipush          25
	//*  11   22:icmpgt          26
			return;
	//   12   25:return          

	//   13   26:iload_1         
	//   14   27:ifne            37
	//   15   30:aload_2         
	//   16   31:invokevirtual   #260 <Method boolean FragmentManager.popBackStackImmediate()>
	//   17   34:ifne            25
		super.onBackPressed();
	//   18   37:aload_0         
	//   19   38:invokespecial   #262 <Method void BaseFragmentActivityApi16.onBackPressed()>
	//   20   41:return          
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #266 <Method void BaseFragmentActivityApi16.onConfigurationChanged(Configuration)>
		mFragments.dispatchConfigurationChanged(configuration);
	//    3    5:aload_0         
	//    4    6:getfield        #72  <Field FragmentController mFragments>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #269 <Method void FragmentController.dispatchConfigurationChanged(Configuration)>
	//    7   13:return          
	}

	protected void onCreate(Bundle bundle)
	{
		FragmentManagerNonConfig fragmentmanagernonconfig = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		mFragments.attachHost(((Fragment) (null)));
	//    2    2:aload_0         
	//    3    3:getfield        #72  <Field FragmentController mFragments>
	//    4    6:aconst_null     
	//    5    7:invokevirtual   #275 <Method void FragmentController.attachHost(Fragment)>
		super.onCreate(bundle);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #277 <Method void BaseFragmentActivityApi16.onCreate(Bundle)>
		NonConfigurationInstances nonconfigurationinstances = (NonConfigurationInstances)getLastNonConfigurationInstance();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #205 <Method Object getLastNonConfigurationInstance()>
	//   11   19:checkcast       #15  <Class FragmentActivity$NonConfigurationInstances>
	//   12   22:astore          6
		if(nonconfigurationinstances != null)
	//*  13   24:aload           6
	//*  14   26:ifnull          41
			mFragments.restoreLoaderNonConfig(nonconfigurationinstances.loaders);
	//   15   29:aload_0         
	//   16   30:getfield        #72  <Field FragmentController mFragments>
	//   17   33:aload           6
	//   18   35:getfield        #281 <Field SimpleArrayMap FragmentActivity$NonConfigurationInstances.loaders>
	//   19   38:invokevirtual   #285 <Method void FragmentController.restoreLoaderNonConfig(SimpleArrayMap)>
		if(bundle != null)
	//*  20   41:aload_1         
	//*  21   42:ifnull          135
		{
			android.os.Parcelable parcelable = bundle.getParcelable("android:support:fragments");
	//   22   45:aload_1         
	//   23   46:ldc1            #23  <String "android:support:fragments">
	//   24   48:invokevirtual   #291 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   25   51:astore          4
			FragmentController fragmentcontroller = mFragments;
	//   26   53:aload_0         
	//   27   54:getfield        #72  <Field FragmentController mFragments>
	//   28   57:astore          5
			if(nonconfigurationinstances != null)
	//*  29   59:aload           6
	//*  30   61:ifnull          70
				fragmentmanagernonconfig = nonconfigurationinstances.fragments;
	//   31   64:aload           6
	//   32   66:getfield        #295 <Field FragmentManagerNonConfig FragmentActivity$NonConfigurationInstances.fragments>
	//   33   69:astore_3        
			fragmentcontroller.restoreAllState(parcelable, fragmentmanagernonconfig);
	//   34   70:aload           5
	//   35   72:aload           4
	//   36   74:aload_3         
	//   37   75:invokevirtual   #299 <Method void FragmentController.restoreAllState(android.os.Parcelable, FragmentManagerNonConfig)>
			if(bundle.containsKey("android:support:next_request_index"))
	//*  38   78:aload_1         
	//*  39   79:ldc1            #33  <String "android:support:next_request_index">
	//*  40   81:invokevirtual   #303 <Method boolean Bundle.containsKey(String)>
	//*  41   84:ifeq            135
			{
				mNextCandidateRequestIndex = bundle.getInt("android:support:next_request_index");
	//   42   87:aload_0         
	//   43   88:aload_1         
	//   44   89:ldc1            #33  <String "android:support:next_request_index">
	//   45   91:invokevirtual   #307 <Method int Bundle.getInt(String)>
	//   46   94:putfield        #96  <Field int mNextCandidateRequestIndex>
				int ai[] = bundle.getIntArray("android:support:request_indicies");
	//   47   97:aload_1         
	//   48   98:ldc1            #20  <String "android:support:request_indicies">
	//   49  100:invokevirtual   #311 <Method int[] Bundle.getIntArray(String)>
	//   50  103:astore_3        
				bundle = ((Bundle) (bundle.getStringArray("android:support:request_fragment_who")));
	//   51  104:aload_1         
	//   52  105:ldc1            #36  <String "android:support:request_fragment_who">
	//   53  107:invokevirtual   #315 <Method String[] Bundle.getStringArray(String)>
	//   54  110:astore_1        
				if(ai == null || bundle == null || ai.length != bundle.length)
	//*  55  111:aload_3         
	//*  56  112:ifnull          126
	//*  57  115:aload_1         
	//*  58  116:ifnull          126
	//*  59  119:aload_3         
	//*  60  120:arraylength     
	//*  61  121:aload_1         
	//*  62  122:arraylength     
	//*  63  123:icmpeq          166
				{
					Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
	//   64  126:ldc1            #39  <String "FragmentActivity">
	//   65  128:ldc2            #317 <String "Invalid requestCode mapping in savedInstanceState.">
	//   66  131:invokestatic    #235 <Method int Log.w(String, String)>
	//   67  134:pop             
				} else
	//*  68  135:aload_0         
	//*  69  136:getfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//*  70  139:ifnonnull       158
	//*  71  142:aload_0         
	//*  72  143:new             #83  <Class SparseArrayCompat>
	//*  73  146:dup             
	//*  74  147:invokespecial   #318 <Method void SparseArrayCompat()>
	//*  75  150:putfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//*  76  153:aload_0         
	//*  77  154:iconst_0        
	//*  78  155:putfield        #96  <Field int mNextCandidateRequestIndex>
	//*  79  158:aload_0         
	//*  80  159:getfield        #72  <Field FragmentController mFragments>
	//*  81  162:invokevirtual   #321 <Method void FragmentController.dispatchCreate()>
	//*  82  165:return          
				{
					mPendingFragmentActivityResults = new SparseArrayCompat(ai.length);
	//   83  166:aload_0         
	//   84  167:new             #83  <Class SparseArrayCompat>
	//   85  170:dup             
	//   86  171:aload_3         
	//   87  172:arraylength     
	//   88  173:invokespecial   #323 <Method void SparseArrayCompat(int)>
	//   89  176:putfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
					int i = 0;
	//   90  179:iconst_0        
	//   91  180:istore_2        
					while(i < ai.length) 
	//*  92  181:iload_2         
	//*  93  182:aload_3         
	//*  94  183:arraylength     
	//*  95  184:icmpge          135
					{
						mPendingFragmentActivityResults.put(ai[i], ((Object) (bundle[i])));
	//   96  187:aload_0         
	//   97  188:getfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//   98  191:aload_3         
	//   99  192:iload_2         
	//  100  193:iaload          
	//  101  194:aload_1         
	//  102  195:iload_2         
	//  103  196:aaload          
	//  104  197:invokevirtual   #109 <Method void SparseArrayCompat.put(int, Object)>
						i++;
	//  105  200:iload_2         
	//  106  201:iconst_1        
	//  107  202:iadd            
	//  108  203:istore_2        
					}
				}
			}
		}
		if(mPendingFragmentActivityResults == null)
		{
			mPendingFragmentActivityResults = new SparseArrayCompat();
			mNextCandidateRequestIndex = 0;
		}
		mFragments.dispatchCreate();
	//* 109  204:goto            181
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
	//    5    7:invokespecial   #328 <Method boolean BaseFragmentActivityApi16.onCreatePanelMenu(int, Menu)>
	//    6   10:aload_0         
	//    7   11:getfield        #72  <Field FragmentController mFragments>
	//    8   14:aload_2         
	//    9   15:aload_0         
	//   10   16:invokevirtual   #332 <Method android.view.MenuInflater getMenuInflater()>
	//   11   19:invokevirtual   #336 <Method boolean FragmentController.dispatchCreateOptionsMenu(Menu, android.view.MenuInflater)>
	//   12   22:ior             
	//   13   23:ireturn         
		else
			return super.onCreatePanelMenu(i, menu);
	//   14   24:aload_0         
	//   15   25:iload_1         
	//   16   26:aload_2         
	//   17   27:invokespecial   #328 <Method boolean BaseFragmentActivityApi16.onCreatePanelMenu(int, Menu)>
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
	//    5    6:invokespecial   #337 <Method View BaseFragmentActivityApi16.onCreateView(View, String, Context, AttributeSet)>
	//    6    9:areturn         
	}

	public volatile View onCreateView(String s, Context context, AttributeSet attributeset)
	{
		return super.onCreateView(s, context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #340 <Method View BaseFragmentActivityApi16.onCreateView(String, Context, AttributeSet)>
	//    5    7:areturn         
	}

	protected void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #343 <Method void BaseFragmentActivityApi16.onDestroy()>
		doReallyStop(false);
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #345 <Method void doReallyStop(boolean)>
		mFragments.dispatchDestroy();
	//    5    9:aload_0         
	//    6   10:getfield        #72  <Field FragmentController mFragments>
	//    7   13:invokevirtual   #348 <Method void FragmentController.dispatchDestroy()>
		mFragments.doLoaderDestroy();
	//    8   16:aload_0         
	//    9   17:getfield        #72  <Field FragmentController mFragments>
	//   10   20:invokevirtual   #351 <Method void FragmentController.doLoaderDestroy()>
	//   11   23:return          
	}

	public void onLowMemory()
	{
		super.onLowMemory();
	//    0    0:aload_0         
	//    1    1:invokespecial   #354 <Method void BaseFragmentActivityApi16.onLowMemory()>
		mFragments.dispatchLowMemory();
	//    2    4:aload_0         
	//    3    5:getfield        #72  <Field FragmentController mFragments>
	//    4    8:invokevirtual   #357 <Method void FragmentController.dispatchLowMemory()>
	//    5   11:return          
	}

	public boolean onMenuItemSelected(int i, MenuItem menuitem)
	{
		if(super.onMenuItemSelected(i, menuitem))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:aload_2         
	//*   3    3:invokespecial   #361 <Method boolean BaseFragmentActivityApi16.onMenuItemSelected(int, MenuItem)>
	//*   4    6:ifeq            11
			return true;
	//    5    9:iconst_1        
	//    6   10:ireturn         
		switch(i)
	//*   7   11:iload_1         
		{
	//*   8   12:lookupswitch    2: default 40
	//	               0: 42
	//	               6: 51
		default:
			return false;
	//    9   40:iconst_0        
	//   10   41:ireturn         

		case 0: // '\0'
			return mFragments.dispatchOptionsItemSelected(menuitem);
	//   11   42:aload_0         
	//   12   43:getfield        #72  <Field FragmentController mFragments>
	//   13   46:aload_2         
	//   14   47:invokevirtual   #365 <Method boolean FragmentController.dispatchOptionsItemSelected(MenuItem)>
	//   15   50:ireturn         

		case 6: // '\006'
			return mFragments.dispatchContextItemSelected(menuitem);
	//   16   51:aload_0         
	//   17   52:getfield        #72  <Field FragmentController mFragments>
	//   18   55:aload_2         
	//   19   56:invokevirtual   #368 <Method boolean FragmentController.dispatchContextItemSelected(MenuItem)>
	//   20   59:ireturn         
		}
	}

	public void onMultiWindowModeChanged(boolean flag)
	{
		mFragments.dispatchMultiWindowModeChanged(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field FragmentController mFragments>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #373 <Method void FragmentController.dispatchMultiWindowModeChanged(boolean)>
	//    4    8:return          
	}

	protected void onNewIntent(Intent intent)
	{
		super.onNewIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #378 <Method void BaseFragmentActivityApi16.onNewIntent(Intent)>
		mFragments.noteStateNotSaved();
	//    3    5:aload_0         
	//    4    6:getfield        #72  <Field FragmentController mFragments>
	//    5    9:invokevirtual   #218 <Method void FragmentController.noteStateNotSaved()>
	//    6   12:return          
	}

	public void onPanelClosed(int i, Menu menu)
	{
		i;
	//    0    0:iload_1         
		JVM INSTR tableswitch 0 0: default 20
	//	               0 27;
	//    1    1:tableswitch     0 0: default 20
	//	               0 27
		   goto _L1 _L2
_L1:
		super.onPanelClosed(i, menu);
	//    2   20:aload_0         
	//    3   21:iload_1         
	//    4   22:aload_2         
	//    5   23:invokespecial   #382 <Method void BaseFragmentActivityApi16.onPanelClosed(int, Menu)>
		return;
	//    6   26:return          
_L2:
		mFragments.dispatchOptionsMenuClosed(menu);
	//    7   27:aload_0         
	//    8   28:getfield        #72  <Field FragmentController mFragments>
	//    9   31:aload_2         
	//   10   32:invokevirtual   #386 <Method void FragmentController.dispatchOptionsMenuClosed(Menu)>
		if(true) goto _L1; else goto _L3
	//   11   35:goto            20
_L3:
	}

	protected void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #389 <Method void BaseFragmentActivityApi16.onPause()>
		mResumed = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #184 <Field boolean mResumed>
		if(mHandler.hasMessages(2))
	//*   5    9:aload_0         
	//*   6   10:getfield        #63  <Field Handler mHandler>
	//*   7   13:iconst_2        
	//*   8   14:invokevirtual   #393 <Method boolean Handler.hasMessages(int)>
	//*   9   17:ifeq            32
		{
			mHandler.removeMessages(2);
	//   10   20:aload_0         
	//   11   21:getfield        #63  <Field Handler mHandler>
	//   12   24:iconst_2        
	//   13   25:invokevirtual   #124 <Method void Handler.removeMessages(int)>
			onResumeFragments();
	//   14   28:aload_0         
	//   15   29:invokevirtual   #396 <Method void onResumeFragments()>
		}
		mFragments.dispatchPause();
	//   16   32:aload_0         
	//   17   33:getfield        #72  <Field FragmentController mFragments>
	//   18   36:invokevirtual   #399 <Method void FragmentController.dispatchPause()>
	//   19   39:return          
	}

	public void onPictureInPictureModeChanged(boolean flag)
	{
		mFragments.dispatchPictureInPictureModeChanged(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field FragmentController mFragments>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #403 <Method void FragmentController.dispatchPictureInPictureModeChanged(boolean)>
	//    4    8:return          
	}

	protected void onPostResume()
	{
		super.onPostResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #406 <Method void BaseFragmentActivityApi16.onPostResume()>
		mHandler.removeMessages(2);
	//    2    4:aload_0         
	//    3    5:getfield        #63  <Field Handler mHandler>
	//    4    8:iconst_2        
	//    5    9:invokevirtual   #124 <Method void Handler.removeMessages(int)>
		onResumeFragments();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #396 <Method void onResumeFragments()>
		mFragments.execPendingActions();
	//    8   16:aload_0         
	//    9   17:getfield        #72  <Field FragmentController mFragments>
	//   10   20:invokevirtual   #409 <Method boolean FragmentController.execPendingActions()>
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
	//    4    4:invokespecial   #419 <Method boolean BaseFragmentActivityApi16.onPreparePanel(int, View, Menu)>
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
	//    7   11:invokevirtual   #421 <Method boolean onPrepareOptionsPanel(View, Menu)>
	//    8   14:aload_0         
	//    9   15:getfield        #72  <Field FragmentController mFragments>
	//   10   18:aload_3         
	//   11   19:invokevirtual   #425 <Method boolean FragmentController.dispatchPrepareOptionsMenu(Menu)>
	//   12   22:ior             
	//   13   23:ireturn         
		else
			return super.onPreparePanel(i, view, menu);
	//   14   24:aload_0         
	//   15   25:iload_1         
	//   16   26:aload_2         
	//   17   27:aload_3         
	//   18   28:invokespecial   #419 <Method boolean BaseFragmentActivityApi16.onPreparePanel(int, View, Menu)>
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
	//    7   15:invokevirtual   #428 <Method void FragmentController.dispatchReallyStop()>
	//    8   18:return          
	}

	public void onRequestPermissionsResult(int i, String as[], int ai[])
	{
		String s;
label0:
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
	//*   7   11:ifeq            56
			{
				j--;
	//    8   14:iload           4
	//    9   16:iconst_1        
	//   10   17:isub            
	//   11   18:istore          4
				s = (String)mPendingFragmentActivityResults.get(j);
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
				if(s != null)
					break label0;
	//   22   43:aload           5
	//   23   45:ifnonnull       57
				Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
	//   24   48:ldc1            #39  <String "FragmentActivity">
	//   25   50:ldc1            #229 <String "Activity result delivered for unknown Fragment.">
	//   26   52:invokestatic    #235 <Method int Log.w(String, String)>
	//   27   55:pop             
			}
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
		} else
		{
			fragment.onRequestPermissionsResult(i & 0xffff, as, ai);
	//   48  100:aload           6
	//   49  102:iload_1         
	//   50  103:ldc1            #242 <Int 65535>
	//   51  105:iand            
	//   52  106:aload_2         
	//   53  107:aload_3         
	//   54  108:invokevirtual   #433 <Method void Fragment.onRequestPermissionsResult(int, String[], int[])>
			return;
	//   55  111:return          
		}
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #436 <Method void BaseFragmentActivityApi16.onResume()>
		mHandler.sendEmptyMessage(2);
	//    2    4:aload_0         
	//    3    5:getfield        #63  <Field Handler mHandler>
	//    4    8:iconst_2        
	//    5    9:invokevirtual   #439 <Method boolean Handler.sendEmptyMessage(int)>
	//    6   12:pop             
		mResumed = true;
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:putfield        #184 <Field boolean mResumed>
		mFragments.execPendingActions();
	//   10   18:aload_0         
	//   11   19:getfield        #72  <Field FragmentController mFragments>
	//   12   22:invokevirtual   #409 <Method boolean FragmentController.execPendingActions()>
	//   13   25:pop             
	//   14   26:return          
	}

	protected void onResumeFragments()
	{
		mFragments.dispatchResume();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field FragmentController mFragments>
	//    2    4:invokevirtual   #442 <Method void FragmentController.dispatchResume()>
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
	//    5    9:invokevirtual   #345 <Method void doReallyStop(boolean)>
		Object obj = onRetainCustomNonConfigurationInstance();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #446 <Method Object onRetainCustomNonConfigurationInstance()>
	//    8   16:astore_1        
		FragmentManagerNonConfig fragmentmanagernonconfig = mFragments.retainNestedNonConfig();
	//    9   17:aload_0         
	//   10   18:getfield        #72  <Field FragmentController mFragments>
	//   11   21:invokevirtual   #450 <Method FragmentManagerNonConfig FragmentController.retainNestedNonConfig()>
	//   12   24:astore_2        
		SimpleArrayMap simplearraymap = mFragments.retainLoaderNonConfig();
	//   13   25:aload_0         
	//   14   26:getfield        #72  <Field FragmentController mFragments>
	//   15   29:invokevirtual   #454 <Method SimpleArrayMap FragmentController.retainLoaderNonConfig()>
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
	//   27   51:invokespecial   #455 <Method void FragmentActivity$NonConfigurationInstances()>
	//   28   54:astore          4
			nonconfigurationinstances.custom = obj;
	//   29   56:aload           4
	//   30   58:aload_1         
	//   31   59:putfield        #209 <Field Object FragmentActivity$NonConfigurationInstances.custom>
			nonconfigurationinstances.fragments = fragmentmanagernonconfig;
	//   32   62:aload           4
	//   33   64:aload_2         
	//   34   65:putfield        #295 <Field FragmentManagerNonConfig FragmentActivity$NonConfigurationInstances.fragments>
			nonconfigurationinstances.loaders = simplearraymap;
	//   35   68:aload           4
	//   36   70:aload_3         
	//   37   71:putfield        #281 <Field SimpleArrayMap FragmentActivity$NonConfigurationInstances.loaders>
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
	//    2    2:invokespecial   #458 <Method void BaseFragmentActivityApi16.onSaveInstanceState(Bundle)>
		android.os.Parcelable parcelable = mFragments.saveAllState();
	//    3    5:aload_0         
	//    4    6:getfield        #72  <Field FragmentController mFragments>
	//    5    9:invokevirtual   #462 <Method android.os.Parcelable FragmentController.saveAllState()>
	//    6   12:astore_3        
		if(parcelable != null)
	//*   7   13:aload_3         
	//*   8   14:ifnull          24
			bundle.putParcelable("android:support:fragments", parcelable);
	//    9   17:aload_1         
	//   10   18:ldc1            #23  <String "android:support:fragments">
	//   11   20:aload_3         
	//   12   21:invokevirtual   #466 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
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
	//   21   41:invokevirtual   #470 <Method void Bundle.putInt(String, int)>
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
	//   44   86:invokevirtual   #473 <Method int SparseArrayCompat.keyAt(int)>
	//   45   89:iastore         
				as[i] = (String)mPendingFragmentActivityResults.valueAt(i);
	//   46   90:aload           4
	//   47   92:iload_2         
	//   48   93:aload_0         
	//   49   94:getfield        #81  <Field SparseArrayCompat mPendingFragmentActivityResults>
	//   50   97:iload_2         
	//   51   98:invokevirtual   #476 <Method Object SparseArrayCompat.valueAt(int)>
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
	//   62  116:invokevirtual   #480 <Method void Bundle.putIntArray(String, int[])>
			bundle.putStringArray("android:support:request_fragment_who", as);
	//   63  119:aload_1         
	//   64  120:ldc1            #36  <String "android:support:request_fragment_who">
	//   65  122:aload           4
	//   66  124:invokevirtual   #484 <Method void Bundle.putStringArray(String, String[])>
		}
	//   67  127:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #487 <Method void BaseFragmentActivityApi16.onStart()>
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
	//   20   38:invokevirtual   #490 <Method void FragmentController.dispatchActivityCreated()>
		}
		mFragments.noteStateNotSaved();
	//   21   41:aload_0         
	//   22   42:getfield        #72  <Field FragmentController mFragments>
	//   23   45:invokevirtual   #218 <Method void FragmentController.noteStateNotSaved()>
		mFragments.execPendingActions();
	//   24   48:aload_0         
	//   25   49:getfield        #72  <Field FragmentController mFragments>
	//   26   52:invokevirtual   #409 <Method boolean FragmentController.execPendingActions()>
	//   27   55:pop             
		mFragments.doLoaderStart();
	//   28   56:aload_0         
	//   29   57:getfield        #72  <Field FragmentController mFragments>
	//   30   60:invokevirtual   #130 <Method void FragmentController.doLoaderStart()>
		mFragments.dispatchStart();
	//   31   63:aload_0         
	//   32   64:getfield        #72  <Field FragmentController mFragments>
	//   33   67:invokevirtual   #493 <Method void FragmentController.dispatchStart()>
		mFragments.reportLoaderStart();
	//   34   70:aload_0         
	//   35   71:getfield        #72  <Field FragmentController mFragments>
	//   36   74:invokevirtual   #496 <Method void FragmentController.reportLoaderStart()>
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
	//    1    1:invokespecial   #500 <Method void BaseFragmentActivityApi16.onStop()>
		mStopped = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #74  <Field boolean mStopped>
		mHandler.sendEmptyMessage(1);
	//    5    9:aload_0         
	//    6   10:getfield        #63  <Field Handler mHandler>
	//    7   13:iconst_1        
	//    8   14:invokevirtual   #439 <Method boolean Handler.sendEmptyMessage(int)>
	//    9   17:pop             
		mFragments.dispatchStop();
	//   10   18:aload_0         
	//   11   19:getfield        #72  <Field FragmentController mFragments>
	//   12   22:invokevirtual   #503 <Method void FragmentController.dispatchStop()>
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
	//    6    8:invokestatic    #511 <Method void ActivityCompat.requestPermissions(android.app.Activity, String[], int)>
			return;
	//    7   11:return          
		}
		checkForValidRequestCode(i);
	//    8   12:iload_3         
	//    9   13:invokestatic    #514 <Method void checkForValidRequestCode(int)>
		mRequestedPermissionsFromFragment = true;
	//   10   16:aload_0         
	//   11   17:iconst_1        
	//   12   18:putfield        #516 <Field boolean mRequestedPermissionsFromFragment>
		ActivityCompat.requestPermissions(((android.app.Activity) (this)), as, (allocateRequestIndex(fragment) + 1 << 16) + (0xffff & i));
	//   13   21:aload_0         
	//   14   22:aload_2         
	//   15   23:aload_0         
	//   16   24:aload_1         
	//   17   25:invokespecial   #518 <Method int allocateRequestIndex(Fragment)>
	//   18   28:iconst_1        
	//   19   29:iadd            
	//   20   30:bipush          16
	//   21   32:ishl            
	//   22   33:ldc1            #242 <Int 65535>
	//   23   35:iload_3         
	//   24   36:iand            
	//   25   37:iadd            
	//   26   38:invokestatic    #511 <Method void ActivityCompat.requestPermissions(android.app.Activity, String[], int)>
		mRequestedPermissionsFromFragment = false;
	//   27   41:aload_0         
	//   28   42:iconst_0        
	//   29   43:putfield        #516 <Field boolean mRequestedPermissionsFromFragment>
		return;
	//   30   46:return          
		fragment;
	//   31   47:astore_1        
		mRequestedPermissionsFromFragment = false;
	//   32   48:aload_0         
	//   33   49:iconst_0        
	//   34   50:putfield        #516 <Field boolean mRequestedPermissionsFromFragment>
		throw fragment;
	//   35   53:aload_1         
	//   36   54:athrow          
	}

	public void setEnterSharedElementCallback(SharedElementCallback sharedelementcallback)
	{
		ActivityCompat.setEnterSharedElementCallback(((android.app.Activity) (this)), sharedelementcallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #523 <Method void ActivityCompat.setEnterSharedElementCallback(android.app.Activity, SharedElementCallback)>
	//    3    5:return          
	}

	public void setExitSharedElementCallback(SharedElementCallback sharedelementcallback)
	{
		ActivityCompat.setExitSharedElementCallback(((android.app.Activity) (this)), sharedelementcallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #526 <Method void ActivityCompat.setExitSharedElementCallback(android.app.Activity, SharedElementCallback)>
	//    3    5:return          
	}

	public void startActivityForResult(Intent intent, int i)
	{
		if(!mStartedActivityFromFragment && i != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #531 <Field boolean mStartedActivityFromFragment>
	//*   2    4:ifne            16
	//*   3    7:iload_2         
	//*   4    8:iconst_m1       
	//*   5    9:icmpeq          16
			checkForValidRequestCode(i);
	//    6   12:iload_2         
	//    7   13:invokestatic    #514 <Method void checkForValidRequestCode(int)>
		super.startActivityForResult(intent, i);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:iload_2         
	//   11   19:invokespecial   #533 <Method void BaseFragmentActivityApi16.startActivityForResult(Intent, int)>
	//   12   22:return          
	}

	public volatile void startActivityForResult(Intent intent, int i, Bundle bundle)
	{
		super.startActivityForResult(intent, i, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #538 <Method void BaseFragmentActivityApi16.startActivityForResult(Intent, int, Bundle)>
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
	//    5    5:invokevirtual   #543 <Method void startActivityFromFragment(Fragment, Intent, int, Bundle)>
	//    6    8:return          
	}

	public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle)
	{
		mStartedActivityFromFragment = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #531 <Field boolean mStartedActivityFromFragment>
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
	//   10   15:invokestatic    #546 <Method void ActivityCompat.startActivityForResult(android.app.Activity, Intent, int, Bundle)>
		mStartedActivityFromFragment = false;
	//   11   18:aload_0         
	//   12   19:iconst_0        
	//   13   20:putfield        #531 <Field boolean mStartedActivityFromFragment>
		return;
	//   14   23:return          
		checkForValidRequestCode(i);
	//   15   24:iload_3         
	//   16   25:invokestatic    #514 <Method void checkForValidRequestCode(int)>
		ActivityCompat.startActivityForResult(((android.app.Activity) (this)), intent, (allocateRequestIndex(fragment) + 1 << 16) + (0xffff & i), bundle);
	//   17   28:aload_0         
	//   18   29:aload_2         
	//   19   30:aload_0         
	//   20   31:aload_1         
	//   21   32:invokespecial   #518 <Method int allocateRequestIndex(Fragment)>
	//   22   35:iconst_1        
	//   23   36:iadd            
	//   24   37:bipush          16
	//   25   39:ishl            
	//   26   40:ldc1            #242 <Int 65535>
	//   27   42:iload_3         
	//   28   43:iand            
	//   29   44:iadd            
	//   30   45:aload           4
	//   31   47:invokestatic    #546 <Method void ActivityCompat.startActivityForResult(android.app.Activity, Intent, int, Bundle)>
		mStartedActivityFromFragment = false;
	//   32   50:aload_0         
	//   33   51:iconst_0        
	//   34   52:putfield        #531 <Field boolean mStartedActivityFromFragment>
		return;
	//   35   55:return          
		fragment;
	//   36   56:astore_1        
		mStartedActivityFromFragment = false;
	//   37   57:aload_0         
	//   38   58:iconst_0        
	//   39   59:putfield        #531 <Field boolean mStartedActivityFromFragment>
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
	//    7   10:invokespecial   #552 <Method void BaseFragmentActivityApi16.startIntentSenderForResult(IntentSender, int, Intent, int, int, int)>
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
	//    8   12:invokespecial   #556 <Method void BaseFragmentActivityApi16.startIntentSenderForResult(IntentSender, int, Intent, int, int, int, Bundle)>
	//    9   15:return          
	}

	public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentsender, int i, Intent intent, int j, int k, int l, 
			Bundle bundle)
		throws android.content.IntentSender.SendIntentException
	{
		mStartedIntentSenderFromFragment = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #561 <Field boolean mStartedIntentSenderFromFragment>
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
	//   14   23:invokestatic    #564 <Method void ActivityCompat.startIntentSenderForResult(android.app.Activity, IntentSender, int, Intent, int, int, int, Bundle)>
		mStartedIntentSenderFromFragment = false;
	//   15   26:aload_0         
	//   16   27:iconst_0        
	//   17   28:putfield        #561 <Field boolean mStartedIntentSenderFromFragment>
		return;
	//   18   31:return          
		checkForValidRequestCode(i);
	//   19   32:iload_3         
	//   20   33:invokestatic    #514 <Method void checkForValidRequestCode(int)>
		ActivityCompat.startIntentSenderForResult(((android.app.Activity) (this)), intentsender, (allocateRequestIndex(fragment) + 1 << 16) + (0xffff & i), intent, j, k, l, bundle);
	//   21   36:aload_0         
	//   22   37:aload_2         
	//   23   38:aload_0         
	//   24   39:aload_1         
	//   25   40:invokespecial   #518 <Method int allocateRequestIndex(Fragment)>
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
	//   39   63:invokestatic    #564 <Method void ActivityCompat.startIntentSenderForResult(android.app.Activity, IntentSender, int, Intent, int, int, int, Bundle)>
		mStartedIntentSenderFromFragment = false;
	//   40   66:aload_0         
	//   41   67:iconst_0        
	//   42   68:putfield        #561 <Field boolean mStartedIntentSenderFromFragment>
		return;
	//   43   71:return          
		fragment;
	//   44   72:astore_1        
		mStartedIntentSenderFromFragment = false;
	//   45   73:aload_0         
	//   46   74:iconst_0        
	//   47   75:putfield        #561 <Field boolean mStartedIntentSenderFromFragment>
		throw fragment;
	//   48   78:aload_1         
	//   49   79:athrow          
	}

	public void supportFinishAfterTransition()
	{
		ActivityCompat.finishAfterTransition(((android.app.Activity) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #569 <Method void ActivityCompat.finishAfterTransition(android.app.Activity)>
	//    2    4:return          
	}

	public void supportInvalidateOptionsMenu()
	{
		invalidateOptionsMenu();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #574 <Method void invalidateOptionsMenu()>
	//    2    4:return          
	}

	public void supportPostponeEnterTransition()
	{
		ActivityCompat.postponeEnterTransition(((android.app.Activity) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #579 <Method void ActivityCompat.postponeEnterTransition(android.app.Activity)>
	//    2    4:return          
	}

	public void supportStartPostponedEnterTransition()
	{
		ActivityCompat.startPostponedEnterTransition(((android.app.Activity) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #583 <Method void ActivityCompat.startPostponedEnterTransition(android.app.Activity)>
	//    2    4:return          
	}

	public final void validateRequestPermissionsRequestCode(int i)
	{
		if(!mRequestedPermissionsFromFragment && i != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #516 <Field boolean mRequestedPermissionsFromFragment>
	//*   2    4:ifne            16
	//*   3    7:iload_1         
	//*   4    8:iconst_m1       
	//*   5    9:icmpeq          16
			checkForValidRequestCode(i);
	//    6   12:iload_1         
	//    7   13:invokestatic    #514 <Method void checkForValidRequestCode(int)>
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
			message.what;
		//    0    0:aload_1         
		//    1    1:getfield        #24  <Field int Message.what>
			JVM INSTR tableswitch 1 2: default 28
		//		               1 34
		//		               2 53;
		//    2    4:tableswitch     1 2: default 28
		//		               1 34
		//		               2 53
			   goto _L1 _L2 _L3
_L1:
			super.handleMessage(message);
		//    3   28:aload_0         
		//    4   29:aload_1         
		//    5   30:invokespecial   #26  <Method void Handler.handleMessage(Message)>
_L5:
			return;
		//    6   33:return          
_L2:
			if(!mStopped) goto _L5; else goto _L4
		//    7   34:aload_0         
		//    8   35:getfield        #12  <Field FragmentActivity this$0>
		//    9   38:getfield        #30  <Field boolean FragmentActivity.mStopped>
		//   10   41:ifeq            33
_L4:
			doReallyStop(false);
		//   11   44:aload_0         
		//   12   45:getfield        #12  <Field FragmentActivity this$0>
		//   13   48:iconst_0        
		//   14   49:invokevirtual   #34  <Method void FragmentActivity.doReallyStop(boolean)>
			return;
		//   15   52:return          
_L3:
			onResumeFragments();
		//   16   53:aload_0         
		//   17   54:getfield        #12  <Field FragmentActivity this$0>
		//   18   57:invokevirtual   #37  <Method void FragmentActivity.onResumeFragments()>
			mFragments.execPendingActions();
		//   19   60:aload_0         
		//   20   61:getfield        #12  <Field FragmentActivity this$0>
		//   21   64:getfield        #41  <Field FragmentController FragmentActivity.mFragments>
		//   22   67:invokevirtual   #47  <Method boolean FragmentController.execPendingActions()>
		//   23   70:pop             
			return;
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
	SparseArrayCompat mPendingFragmentActivityResults;
	boolean mReallyStopped;
	boolean mRequestedPermissionsFromFragment;
	boolean mResumed;
	boolean mRetaining;
	boolean mStopped;
}
