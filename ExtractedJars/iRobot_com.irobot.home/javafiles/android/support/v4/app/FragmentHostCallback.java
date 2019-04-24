// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
import android.content.*;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.f.m;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//			FragmentContainer, FragmentManagerImpl, FragmentActivity, LoaderManagerImpl, 
//			ActivityCompat, Fragment

public abstract class FragmentHostCallback extends FragmentContainer
{

	FragmentHostCallback(Activity activity, Context context, Handler handler, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void FragmentContainer()>
		mFragmentManager = new FragmentManagerImpl();
	//    2    4:aload_0         
	//    3    5:new             #31  <Class FragmentManagerImpl>
	//    4    8:dup             
	//    5    9:invokespecial   #32  <Method void FragmentManagerImpl()>
	//    6   12:putfield        #34  <Field FragmentManagerImpl mFragmentManager>
		mActivity = activity;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #36  <Field Activity mActivity>
		mContext = context;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #38  <Field Context mContext>
		mHandler = handler;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #40  <Field Handler mHandler>
		mWindowAnimations = i;
	//   16   30:aload_0         
	//   17   31:iload           4
	//   18   33:putfield        #42  <Field int mWindowAnimations>
	//   19   36:return          
	}

	public FragmentHostCallback(Context context, Handler handler, int i)
	{
		Activity activity;
		if(context instanceof Activity)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #46  <Class Activity>
	//*   2    4:ifeq            16
			activity = (Activity)context;
	//    3    7:aload_1         
	//    4    8:checkcast       #46  <Class Activity>
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
	//   14   25:invokespecial   #48  <Method void FragmentHostCallback(Activity, Context, Handler, int)>
	//   15   28:return          
	}

	FragmentHostCallback(FragmentActivity fragmentactivity)
	{
		this(((Activity) (fragmentactivity)), ((Context) (fragmentactivity)), fragmentactivity.mHandler, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:aload_1         
	//    4    4:getfield        #52  <Field Handler FragmentActivity.mHandler>
	//    5    7:iconst_0        
	//    6    8:invokespecial   #48  <Method void FragmentHostCallback(Activity, Context, Handler, int)>
	//    7   11:return          
	}

	void doLoaderDestroy()
	{
		if(mLoaderManager == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field LoaderManagerImpl mLoaderManager>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			mLoaderManager.doDestroy();
	//    4    8:aload_0         
	//    5    9:getfield        #55  <Field LoaderManagerImpl mLoaderManager>
	//    6   12:invokevirtual   #60  <Method void LoaderManagerImpl.doDestroy()>
			return;
	//    7   15:return          
		}
	}

	void doLoaderRetain()
	{
		if(mLoaderManager == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field LoaderManagerImpl mLoaderManager>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			mLoaderManager.doRetain();
	//    4    8:aload_0         
	//    5    9:getfield        #55  <Field LoaderManagerImpl mLoaderManager>
	//    6   12:invokevirtual   #64  <Method void LoaderManagerImpl.doRetain()>
			return;
	//    7   15:return          
		}
	}

	void doLoaderStart()
	{
		if(mLoadersStarted)
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field boolean mLoadersStarted>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		mLoadersStarted = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #67  <Field boolean mLoadersStarted>
		if(mLoaderManager == null) goto _L2; else goto _L1
	//    7   13:aload_0         
	//    8   14:getfield        #55  <Field LoaderManagerImpl mLoaderManager>
	//    9   17:ifnull          30
_L1:
		mLoaderManager.doStart();
	//   10   20:aload_0         
	//   11   21:getfield        #55  <Field LoaderManagerImpl mLoaderManager>
	//   12   24:invokevirtual   #70  <Method void LoaderManagerImpl.doStart()>
		break; /* Loop/switch isn't completed */
	//   13   27:goto            72
_L2:
		if(mCheckedForLoaderManager)
			break; /* Loop/switch isn't completed */
	//   14   30:aload_0         
	//   15   31:getfield        #72  <Field boolean mCheckedForLoaderManager>
	//   16   34:ifne            72
		mLoaderManager = getLoaderManager("(root)", mLoadersStarted, false);
	//   17   37:aload_0         
	//   18   38:aload_0         
	//   19   39:ldc1            #74  <String "(root)">
	//   20   41:aload_0         
	//   21   42:getfield        #67  <Field boolean mLoadersStarted>
	//   22   45:iconst_0        
	//   23   46:invokevirtual   #78  <Method LoaderManagerImpl getLoaderManager(String, boolean, boolean)>
	//   24   49:putfield        #55  <Field LoaderManagerImpl mLoaderManager>
		if(mLoaderManager == null || mLoaderManager.mStarted) goto _L3; else goto _L1
	//   25   52:aload_0         
	//   26   53:getfield        #55  <Field LoaderManagerImpl mLoaderManager>
	//   27   56:ifnull          72
	//   28   59:aload_0         
	//   29   60:getfield        #55  <Field LoaderManagerImpl mLoaderManager>
	//   30   63:getfield        #81  <Field boolean LoaderManagerImpl.mStarted>
	//   31   66:ifne            72
	//*  32   69:goto            20
_L3:
		mCheckedForLoaderManager = true;
	//   33   72:aload_0         
	//   34   73:iconst_1        
	//   35   74:putfield        #72  <Field boolean mCheckedForLoaderManager>
		return;
	//   36   77:return          
	}

	void doLoaderStop(boolean flag)
	{
		mRetainLoaders = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #85  <Field boolean mRetainLoaders>
		if(mLoaderManager == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #55  <Field LoaderManagerImpl mLoaderManager>
	//*   5    9:ifnonnull       13
			return;
	//    6   12:return          
		if(!mLoadersStarted)
	//*   7   13:aload_0         
	//*   8   14:getfield        #67  <Field boolean mLoadersStarted>
	//*   9   17:ifne            21
			return;
	//   10   20:return          
		mLoadersStarted = false;
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:putfield        #67  <Field boolean mLoadersStarted>
		if(flag)
	//*  14   26:iload_1         
	//*  15   27:ifeq            38
		{
			mLoaderManager.doRetain();
	//   16   30:aload_0         
	//   17   31:getfield        #55  <Field LoaderManagerImpl mLoaderManager>
	//   18   34:invokevirtual   #64  <Method void LoaderManagerImpl.doRetain()>
			return;
	//   19   37:return          
		} else
		{
			mLoaderManager.doStop();
	//   20   38:aload_0         
	//   21   39:getfield        #55  <Field LoaderManagerImpl mLoaderManager>
	//   22   42:invokevirtual   #88  <Method void LoaderManagerImpl.doStop()>
			return;
	//   23   45:return          
		}
	}

	void dumpLoaders(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		printwriter.print(s);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #96  <Method void PrintWriter.print(String)>
		printwriter.print("mLoadersStarted=");
	//    3    5:aload_3         
	//    4    6:ldc1            #98  <String "mLoadersStarted=">
	//    5    8:invokevirtual   #96  <Method void PrintWriter.print(String)>
		printwriter.println(mLoadersStarted);
	//    6   11:aload_3         
	//    7   12:aload_0         
	//    8   13:getfield        #67  <Field boolean mLoadersStarted>
	//    9   16:invokevirtual   #101 <Method void PrintWriter.println(boolean)>
		if(mLoaderManager != null)
	//*  10   19:aload_0         
	//*  11   20:getfield        #55  <Field LoaderManagerImpl mLoaderManager>
	//*  12   23:ifnull          101
		{
			printwriter.print(s);
	//   13   26:aload_3         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #96  <Method void PrintWriter.print(String)>
			printwriter.print("Loader Manager ");
	//   16   31:aload_3         
	//   17   32:ldc1            #103 <String "Loader Manager ">
	//   18   34:invokevirtual   #96  <Method void PrintWriter.print(String)>
			printwriter.print(Integer.toHexString(System.identityHashCode(((Object) (mLoaderManager)))));
	//   19   37:aload_3         
	//   20   38:aload_0         
	//   21   39:getfield        #55  <Field LoaderManagerImpl mLoaderManager>
	//   22   42:invokestatic    #109 <Method int System.identityHashCode(Object)>
	//   23   45:invokestatic    #115 <Method String Integer.toHexString(int)>
	//   24   48:invokevirtual   #96  <Method void PrintWriter.print(String)>
			printwriter.println(":");
	//   25   51:aload_3         
	//   26   52:ldc1            #117 <String ":">
	//   27   54:invokevirtual   #119 <Method void PrintWriter.println(String)>
			LoaderManagerImpl loadermanagerimpl = mLoaderManager;
	//   28   57:aload_0         
	//   29   58:getfield        #55  <Field LoaderManagerImpl mLoaderManager>
	//   30   61:astore          5
			StringBuilder stringbuilder = new StringBuilder();
	//   31   63:new             #121 <Class StringBuilder>
	//   32   66:dup             
	//   33   67:invokespecial   #122 <Method void StringBuilder()>
	//   34   70:astore          6
			stringbuilder.append(s);
	//   35   72:aload           6
	//   36   74:aload_1         
	//   37   75:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   38   78:pop             
			stringbuilder.append("  ");
	//   39   79:aload           6
	//   40   81:ldc1            #128 <String "  ">
	//   41   83:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   42   86:pop             
			loadermanagerimpl.dump(stringbuilder.toString(), filedescriptor, printwriter, as);
	//   43   87:aload           5
	//   44   89:aload           6
	//   45   91:invokevirtual   #132 <Method String StringBuilder.toString()>
	//   46   94:aload_2         
	//   47   95:aload_3         
	//   48   96:aload           4
	//   49   98:invokevirtual   #135 <Method void LoaderManagerImpl.dump(String, FileDescriptor, PrintWriter, String[])>
		}
	//   50  101:return          
	}

	Activity getActivity()
	{
		return mActivity;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Activity mActivity>
	//    2    4:areturn         
	}

	Context getContext()
	{
		return mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Context mContext>
	//    2    4:areturn         
	}

	FragmentManagerImpl getFragmentManagerImpl()
	{
		return mFragmentManager;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field FragmentManagerImpl mFragmentManager>
	//    2    4:areturn         
	}

	Handler getHandler()
	{
		return mHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Handler mHandler>
	//    2    4:areturn         
	}

	LoaderManagerImpl getLoaderManager(String s, boolean flag, boolean flag1)
	{
		if(mAllLoaderManagers == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field m mAllLoaderManagers>
	//*   2    4:ifnonnull       18
			mAllLoaderManagers = new m();
	//    3    7:aload_0         
	//    4    8:new             #147 <Class m>
	//    5   11:dup             
	//    6   12:invokespecial   #148 <Method void m()>
	//    7   15:putfield        #145 <Field m mAllLoaderManagers>
		LoaderManagerImpl loadermanagerimpl = (LoaderManagerImpl)mAllLoaderManagers.get(((Object) (s)));
	//    8   18:aload_0         
	//    9   19:getfield        #145 <Field m mAllLoaderManagers>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #152 <Method Object m.get(Object)>
	//   12   26:checkcast       #57  <Class LoaderManagerImpl>
	//   13   29:astore          4
		if(loadermanagerimpl == null && flag1)
	//*  14   31:aload           4
	//*  15   33:ifnonnull       66
	//*  16   36:iload_3         
	//*  17   37:ifeq            66
		{
			loadermanagerimpl = new LoaderManagerImpl(s, this, flag);
	//   18   40:new             #57  <Class LoaderManagerImpl>
	//   19   43:dup             
	//   20   44:aload_1         
	//   21   45:aload_0         
	//   22   46:iload_2         
	//   23   47:invokespecial   #155 <Method void LoaderManagerImpl(String, FragmentHostCallback, boolean)>
	//   24   50:astore          4
			mAllLoaderManagers.put(((Object) (s)), ((Object) (loadermanagerimpl)));
	//   25   52:aload_0         
	//   26   53:getfield        #145 <Field m mAllLoaderManagers>
	//   27   56:aload_1         
	//   28   57:aload           4
	//   29   59:invokevirtual   #159 <Method Object m.put(Object, Object)>
	//   30   62:pop             
			return loadermanagerimpl;
	//   31   63:aload           4
	//   32   65:areturn         
		}
		if(flag && loadermanagerimpl != null && !loadermanagerimpl.mStarted)
	//*  33   66:iload_2         
	//*  34   67:ifeq            88
	//*  35   70:aload           4
	//*  36   72:ifnull          88
	//*  37   75:aload           4
	//*  38   77:getfield        #81  <Field boolean LoaderManagerImpl.mStarted>
	//*  39   80:ifne            88
			loadermanagerimpl.doStart();
	//   40   83:aload           4
	//   41   85:invokevirtual   #70  <Method void LoaderManagerImpl.doStart()>
		return loadermanagerimpl;
	//   42   88:aload           4
	//   43   90:areturn         
	}

	LoaderManagerImpl getLoaderManagerImpl()
	{
		if(mLoaderManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field LoaderManagerImpl mLoaderManager>
	//*   2    4:ifnull          12
		{
			return mLoaderManager;
	//    3    7:aload_0         
	//    4    8:getfield        #55  <Field LoaderManagerImpl mLoaderManager>
	//    5   11:areturn         
		} else
		{
			mCheckedForLoaderManager = true;
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:putfield        #72  <Field boolean mCheckedForLoaderManager>
			mLoaderManager = getLoaderManager("(root)", mLoadersStarted, true);
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:ldc1            #74  <String "(root)">
	//   12   21:aload_0         
	//   13   22:getfield        #67  <Field boolean mLoadersStarted>
	//   14   25:iconst_1        
	//   15   26:invokevirtual   #78  <Method LoaderManagerImpl getLoaderManager(String, boolean, boolean)>
	//   16   29:putfield        #55  <Field LoaderManagerImpl mLoaderManager>
			return mLoaderManager;
	//   17   32:aload_0         
	//   18   33:getfield        #55  <Field LoaderManagerImpl mLoaderManager>
	//   19   36:areturn         
		}
	}

	boolean getRetainLoaders()
	{
		return mRetainLoaders;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field boolean mRetainLoaders>
	//    2    4:ireturn         
	}

	void inactivateFragment(String s)
	{
		if(mAllLoaderManagers != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field m mAllLoaderManagers>
	//*   2    4:ifnull          43
		{
			LoaderManagerImpl loadermanagerimpl = (LoaderManagerImpl)mAllLoaderManagers.get(((Object) (s)));
	//    3    7:aload_0         
	//    4    8:getfield        #145 <Field m mAllLoaderManagers>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #152 <Method Object m.get(Object)>
	//    7   15:checkcast       #57  <Class LoaderManagerImpl>
	//    8   18:astore_2        
			if(loadermanagerimpl != null && !loadermanagerimpl.mRetaining)
	//*   9   19:aload_2         
	//*  10   20:ifnull          43
	//*  11   23:aload_2         
	//*  12   24:getfield        #167 <Field boolean LoaderManagerImpl.mRetaining>
	//*  13   27:ifne            43
			{
				loadermanagerimpl.doDestroy();
	//   14   30:aload_2         
	//   15   31:invokevirtual   #60  <Method void LoaderManagerImpl.doDestroy()>
				mAllLoaderManagers.remove(((Object) (s)));
	//   16   34:aload_0         
	//   17   35:getfield        #145 <Field m mAllLoaderManagers>
	//   18   38:aload_1         
	//   19   39:invokevirtual   #170 <Method Object m.remove(Object)>
	//   20   42:pop             
			}
		}
	//   21   43:return          
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
		return (LayoutInflater)mContext.getSystemService("layout_inflater");
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Context mContext>
	//    2    4:ldc1            #181 <String "layout_inflater">
	//    3    6:invokevirtual   #187 <Method Object Context.getSystemService(String)>
	//    4    9:checkcast       #189 <Class LayoutInflater>
	//    5   12:areturn         
	}

	public int onGetWindowAnimations()
	{
		return mWindowAnimations;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int mWindowAnimations>
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
	//    5    5:invokevirtual   #204 <Method void onStartActivityFromFragment(Fragment, Intent, int, Bundle)>
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
	//    3    5:new             #206 <Class IllegalStateException>
	//    4    8:dup             
	//    5    9:ldc1            #208 <String "Starting activity with a requestCode requires a FragmentActivity host">
	//    6   11:invokespecial   #210 <Method void IllegalStateException(String)>
	//    7   14:athrow          
		} else
		{
			mContext.startActivity(intent);
	//    8   15:aload_0         
	//    9   16:getfield        #38  <Field Context mContext>
	//   10   19:aload_2         
	//   11   20:invokevirtual   #214 <Method void Context.startActivity(Intent)>
			return;
	//   12   23:return          
		}
	}

	public void onStartIntentSenderFromFragment(Fragment fragment, IntentSender intentsender, int i, Intent intent, int j, int k, int l, 
			Bundle bundle)
	{
		if(i != -1)
	//*   0    0:iload_3         
	//*   1    1:iconst_m1       
	//*   2    2:icmpeq          15
		{
			throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
	//    3    5:new             #206 <Class IllegalStateException>
	//    4    8:dup             
	//    5    9:ldc1            #218 <String "Starting intent sender with a requestCode requires a FragmentActivity host">
	//    6   11:invokespecial   #210 <Method void IllegalStateException(String)>
	//    7   14:athrow          
		} else
		{
			ActivityCompat.startIntentSenderForResult(mActivity, intentsender, i, intent, j, k, l, bundle);
	//    8   15:aload_0         
	//    9   16:getfield        #36  <Field Activity mActivity>
	//   10   19:aload_2         
	//   11   20:iload_3         
	//   12   21:aload           4
	//   13   23:iload           5
	//   14   25:iload           6
	//   15   27:iload           7
	//   16   29:aload           8
	//   17   31:invokestatic    #224 <Method void ActivityCompat.startIntentSenderForResult(Activity, IntentSender, int, Intent, int, int, int, Bundle)>
			return;
	//   18   34:return          
		}
	}

	public void onSupportInvalidateOptionsMenu()
	{
	//    0    0:return          
	}

	void reportLoaderStart()
	{
		if(mAllLoaderManagers != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field m mAllLoaderManagers>
	//*   2    4:ifnull          78
		{
			int k = mAllLoaderManagers.size();
	//    3    7:aload_0         
	//    4    8:getfield        #145 <Field m mAllLoaderManagers>
	//    5   11:invokevirtual   #229 <Method int m.size()>
	//    6   14:istore_2        
			LoaderManagerImpl aloadermanagerimpl[] = new LoaderManagerImpl[k];
	//    7   15:iload_2         
	//    8   16:anewarray       LoaderManagerImpl[]
	//    9   19:astore_3        
			for(int i = k - 1; i >= 0; i--)
	//*  10   20:iload_2         
	//*  11   21:iconst_1        
	//*  12   22:isub            
	//*  13   23:istore_1        
	//*  14   24:iload_1         
	//*  15   25:iflt            49
				aloadermanagerimpl[i] = (LoaderManagerImpl)mAllLoaderManagers.c(i);
	//   16   28:aload_3         
	//   17   29:iload_1         
	//   18   30:aload_0         
	//   19   31:getfield        #145 <Field m mAllLoaderManagers>
	//   20   34:iload_1         
	//   21   35:invokevirtual   #233 <Method Object m.c(int)>
	//   22   38:checkcast       #57  <Class LoaderManagerImpl>
	//   23   41:aastore         

	//   24   42:iload_1         
	//   25   43:iconst_1        
	//   26   44:isub            
	//   27   45:istore_1        
	//*  28   46:goto            24
			for(int j = 0; j < k; j++)
	//*  29   49:iconst_0        
	//*  30   50:istore_1        
	//*  31   51:iload_1         
	//*  32   52:iload_2         
	//*  33   53:icmpge          78
			{
				LoaderManagerImpl loadermanagerimpl = aloadermanagerimpl[j];
	//   34   56:aload_3         
	//   35   57:iload_1         
	//   36   58:aaload          
	//   37   59:astore          4
				loadermanagerimpl.finishRetain();
	//   38   61:aload           4
	//   39   63:invokevirtual   #236 <Method void LoaderManagerImpl.finishRetain()>
				loadermanagerimpl.doReportStart();
	//   40   66:aload           4
	//   41   68:invokevirtual   #239 <Method void LoaderManagerImpl.doReportStart()>
			}

	//   42   71:iload_1         
	//   43   72:iconst_1        
	//   44   73:iadd            
	//   45   74:istore_1        
		}
	//*  46   75:goto            51
	//   47   78:return          
	}

	void restoreLoaderNonConfig(m m1)
	{
		if(m1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          35
		{
			int i = 0;
	//    2    4:iconst_0        
	//    3    5:istore_2        
			for(int j = m1.size(); i < j; i++)
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #229 <Method int m.size()>
	//*   6   10:istore_3        
	//*   7   11:iload_2         
	//*   8   12:iload_3         
	//*   9   13:icmpge          35
				((LoaderManagerImpl)m1.c(i)).updateHostController(this);
	//   10   16:aload_1         
	//   11   17:iload_2         
	//   12   18:invokevirtual   #233 <Method Object m.c(int)>
	//   13   21:checkcast       #57  <Class LoaderManagerImpl>
	//   14   24:aload_0         
	//   15   25:invokevirtual   #245 <Method void LoaderManagerImpl.updateHostController(FragmentHostCallback)>

	//   16   28:iload_2         
	//   17   29:iconst_1        
	//   18   30:iadd            
	//   19   31:istore_2        
		}
	//*  20   32:goto            11
		mAllLoaderManagers = m1;
	//   21   35:aload_0         
	//   22   36:aload_1         
	//   23   37:putfield        #145 <Field m mAllLoaderManagers>
	//   24   40:return          
	}

	m retainLoaderNonConfig()
	{
		m m1 = mAllLoaderManagers;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field m mAllLoaderManagers>
	//    2    4:astore          5
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore_1        
		int j = 0;
	//    5    8:iconst_0        
	//    6    9:istore_2        
		if(m1 != null)
	//*   7   10:aload           5
	//*   8   12:ifnull          147
		{
			int k = mAllLoaderManagers.size();
	//    9   15:aload_0         
	//   10   16:getfield        #145 <Field m mAllLoaderManagers>
	//   11   19:invokevirtual   #229 <Method int m.size()>
	//   12   22:istore_3        
			LoaderManagerImpl aloadermanagerimpl[] = new LoaderManagerImpl[k];
	//   13   23:iload_3         
	//   14   24:anewarray       LoaderManagerImpl[]
	//   15   27:astore          5
			for(i = k - 1; i >= 0; i--)
	//*  16   29:iload_3         
	//*  17   30:iconst_1        
	//*  18   31:isub            
	//*  19   32:istore_1        
	//*  20   33:iload_1         
	//*  21   34:iflt            59
				aloadermanagerimpl[i] = (LoaderManagerImpl)mAllLoaderManagers.c(i);
	//   22   37:aload           5
	//   23   39:iload_1         
	//   24   40:aload_0         
	//   25   41:getfield        #145 <Field m mAllLoaderManagers>
	//   26   44:iload_1         
	//   27   45:invokevirtual   #233 <Method Object m.c(int)>
	//   28   48:checkcast       #57  <Class LoaderManagerImpl>
	//   29   51:aastore         

	//   30   52:iload_1         
	//   31   53:iconst_1        
	//   32   54:isub            
	//   33   55:istore_1        
	//*  34   56:goto            33
			boolean flag = getRetainLoaders();
	//   35   59:aload_0         
	//   36   60:invokevirtual   #251 <Method boolean getRetainLoaders()>
	//   37   63:istore          4
			i = 0;
	//   38   65:iconst_0        
	//   39   66:istore_1        
			for(; j < k; j++)
	//*  40   67:iload_2         
	//*  41   68:iload_3         
	//*  42   69:icmpge          147
			{
				LoaderManagerImpl loadermanagerimpl = aloadermanagerimpl[j];
	//   43   72:aload           5
	//   44   74:iload_2         
	//   45   75:aaload          
	//   46   76:astore          6
				if(!loadermanagerimpl.mRetaining && flag)
	//*  47   78:aload           6
	//*  48   80:getfield        #167 <Field boolean LoaderManagerImpl.mRetaining>
	//*  49   83:ifne            109
	//*  50   86:iload           4
	//*  51   88:ifeq            109
				{
					if(!loadermanagerimpl.mStarted)
	//*  52   91:aload           6
	//*  53   93:getfield        #81  <Field boolean LoaderManagerImpl.mStarted>
	//*  54   96:ifne            104
						loadermanagerimpl.doStart();
	//   55   99:aload           6
	//   56  101:invokevirtual   #70  <Method void LoaderManagerImpl.doStart()>
					loadermanagerimpl.doRetain();
	//   57  104:aload           6
	//   58  106:invokevirtual   #64  <Method void LoaderManagerImpl.doRetain()>
				}
				if(loadermanagerimpl.mRetaining)
	//*  59  109:aload           6
	//*  60  111:getfield        #167 <Field boolean LoaderManagerImpl.mRetaining>
	//*  61  114:ifeq            122
				{
					i = 1;
	//   62  117:iconst_1        
	//   63  118:istore_1        
				} else
	//*  64  119:goto            140
				{
					loadermanagerimpl.doDestroy();
	//   65  122:aload           6
	//   66  124:invokevirtual   #60  <Method void LoaderManagerImpl.doDestroy()>
					mAllLoaderManagers.remove(((Object) (loadermanagerimpl.mWho)));
	//   67  127:aload_0         
	//   68  128:getfield        #145 <Field m mAllLoaderManagers>
	//   69  131:aload           6
	//   70  133:getfield        #255 <Field String LoaderManagerImpl.mWho>
	//   71  136:invokevirtual   #170 <Method Object m.remove(Object)>
	//   72  139:pop             
				}
			}

	//   73  140:iload_2         
	//   74  141:iconst_1        
	//   75  142:iadd            
	//   76  143:istore_2        
		}
	//*  77  144:goto            67
		if(i != 0)
	//*  78  147:iload_1         
	//*  79  148:ifeq            156
			return mAllLoaderManagers;
	//   80  151:aload_0         
	//   81  152:getfield        #145 <Field m mAllLoaderManagers>
	//   82  155:areturn         
		else
			return null;
	//   83  156:aconst_null     
	//   84  157:areturn         
	}

	private final Activity mActivity;
	private m mAllLoaderManagers;
	private boolean mCheckedForLoaderManager;
	final Context mContext;
	final FragmentManagerImpl mFragmentManager;
	private final Handler mHandler;
	private LoaderManagerImpl mLoaderManager;
	private boolean mLoadersStarted;
	private boolean mRetainLoaders;
	final int mWindowAnimations;
}
