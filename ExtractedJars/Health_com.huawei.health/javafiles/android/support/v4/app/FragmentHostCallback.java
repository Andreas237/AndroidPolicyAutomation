// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
import android.content.*;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.util.SimpleArrayMap;
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
		if(mLoaderManager != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #55  <Field LoaderManagerImpl mLoaderManager>
	//*   9   17:ifnull          30
			mLoaderManager.doStart();
	//   10   20:aload_0         
	//   11   21:getfield        #55  <Field LoaderManagerImpl mLoaderManager>
	//   12   24:invokevirtual   #70  <Method void LoaderManagerImpl.doStart()>
		else
	//*  13   27:goto            76
		if(!mCheckedForLoaderManager)
	//*  14   30:aload_0         
	//*  15   31:getfield        #72  <Field boolean mCheckedForLoaderManager>
	//*  16   34:ifne            76
		{
			mLoaderManager = getLoaderManager("(root)", mLoadersStarted, false);
	//   17   37:aload_0         
	//   18   38:aload_0         
	//   19   39:ldc1            #74  <String "(root)">
	//   20   41:aload_0         
	//   21   42:getfield        #67  <Field boolean mLoadersStarted>
	//   22   45:iconst_0        
	//   23   46:invokevirtual   #78  <Method LoaderManagerImpl getLoaderManager(String, boolean, boolean)>
	//   24   49:putfield        #55  <Field LoaderManagerImpl mLoaderManager>
			if(mLoaderManager != null && !mLoaderManager.mStarted)
	//*  25   52:aload_0         
	//*  26   53:getfield        #55  <Field LoaderManagerImpl mLoaderManager>
	//*  27   56:ifnull          76
	//*  28   59:aload_0         
	//*  29   60:getfield        #55  <Field LoaderManagerImpl mLoaderManager>
	//*  30   63:getfield        #81  <Field boolean LoaderManagerImpl.mStarted>
	//*  31   66:ifne            76
				mLoaderManager.doStart();
	//   32   69:aload_0         
	//   33   70:getfield        #55  <Field LoaderManagerImpl mLoaderManager>
	//   34   73:invokevirtual   #70  <Method void LoaderManagerImpl.doStart()>
		}
		mCheckedForLoaderManager = true;
	//   35   76:aload_0         
	//   36   77:iconst_1        
	//   37   78:putfield        #72  <Field boolean mCheckedForLoaderManager>
	//   38   81:return          
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
	//*  12   23:ifnull          87
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
			mLoaderManager.dump((new StringBuilder()).append(s).append("  ").toString(), filedescriptor, printwriter, as);
	//   28   57:aload_0         
	//   29   58:getfield        #55  <Field LoaderManagerImpl mLoaderManager>
	//   30   61:new             #121 <Class StringBuilder>
	//   31   64:dup             
	//   32   65:invokespecial   #122 <Method void StringBuilder()>
	//   33   68:aload_1         
	//   34   69:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   35   72:ldc1            #128 <String "  ">
	//   36   74:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   37   77:invokevirtual   #132 <Method String StringBuilder.toString()>
	//   38   80:aload_2         
	//   39   81:aload_3         
	//   40   82:aload           4
	//   41   84:invokevirtual   #135 <Method void LoaderManagerImpl.dump(String, FileDescriptor, PrintWriter, String[])>
		}
	//   42   87:return          
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
	//*   1    1:getfield        #145 <Field SimpleArrayMap mAllLoaderManagers>
	//*   2    4:ifnonnull       18
			mAllLoaderManagers = new SimpleArrayMap();
	//    3    7:aload_0         
	//    4    8:new             #147 <Class SimpleArrayMap>
	//    5   11:dup             
	//    6   12:invokespecial   #148 <Method void SimpleArrayMap()>
	//    7   15:putfield        #145 <Field SimpleArrayMap mAllLoaderManagers>
		LoaderManagerImpl loadermanagerimpl = (LoaderManagerImpl)mAllLoaderManagers.get(((Object) (s)));
	//    8   18:aload_0         
	//    9   19:getfield        #145 <Field SimpleArrayMap mAllLoaderManagers>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #152 <Method Object SimpleArrayMap.get(Object)>
	//   12   26:checkcast       #57  <Class LoaderManagerImpl>
	//   13   29:astore          4
		if(loadermanagerimpl == null)
	//*  14   31:aload           4
	//*  15   33:ifnonnull       66
		{
			if(flag1)
	//*  16   36:iload_3         
	//*  17   37:ifeq            72
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
	//   26   53:getfield        #145 <Field SimpleArrayMap mAllLoaderManagers>
	//   27   56:aload_1         
	//   28   57:aload           4
	//   29   59:invokevirtual   #159 <Method Object SimpleArrayMap.put(Object, Object)>
	//   30   62:pop             
				return loadermanagerimpl;
	//   31   63:aload           4
	//   32   65:areturn         
			}
		} else
		{
			loadermanagerimpl.updateHostController(this);
	//   33   66:aload           4
	//   34   68:aload_0         
	//   35   69:invokevirtual   #163 <Method void LoaderManagerImpl.updateHostController(FragmentHostCallback)>
		}
		return loadermanagerimpl;
	//   36   72:aload           4
	//   37   74:areturn         
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
	//*   1    1:getfield        #145 <Field SimpleArrayMap mAllLoaderManagers>
	//*   2    4:ifnull          43
		{
			LoaderManagerImpl loadermanagerimpl = (LoaderManagerImpl)mAllLoaderManagers.get(((Object) (s)));
	//    3    7:aload_0         
	//    4    8:getfield        #145 <Field SimpleArrayMap mAllLoaderManagers>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #152 <Method Object SimpleArrayMap.get(Object)>
	//    7   15:checkcast       #57  <Class LoaderManagerImpl>
	//    8   18:astore_2        
			if(loadermanagerimpl != null && !loadermanagerimpl.mRetaining)
	//*   9   19:aload_2         
	//*  10   20:ifnull          43
	//*  11   23:aload_2         
	//*  12   24:getfield        #171 <Field boolean LoaderManagerImpl.mRetaining>
	//*  13   27:ifne            43
			{
				loadermanagerimpl.doDestroy();
	//   14   30:aload_2         
	//   15   31:invokevirtual   #60  <Method void LoaderManagerImpl.doDestroy()>
				mAllLoaderManagers.remove(((Object) (s)));
	//   16   34:aload_0         
	//   17   35:getfield        #145 <Field SimpleArrayMap mAllLoaderManagers>
	//   18   38:aload_1         
	//   19   39:invokevirtual   #174 <Method Object SimpleArrayMap.remove(Object)>
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
	//    2    4:ldc1            #187 <String "layout_inflater">
	//    3    6:invokevirtual   #193 <Method Object Context.getSystemService(String)>
	//    4    9:checkcast       #195 <Class LayoutInflater>
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
	//    5    5:invokevirtual   #212 <Method void onStartActivityFromFragment(Fragment, Intent, int, Bundle)>
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
	//    3    5:new             #214 <Class IllegalStateException>
	//    4    8:dup             
	//    5    9:ldc1            #216 <String "Starting activity with a requestCode requires a FragmentActivity host">
	//    6   11:invokespecial   #218 <Method void IllegalStateException(String)>
	//    7   14:athrow          
		} else
		{
			mContext.startActivity(intent);
	//    8   15:aload_0         
	//    9   16:getfield        #38  <Field Context mContext>
	//   10   19:aload_2         
	//   11   20:invokevirtual   #222 <Method void Context.startActivity(Intent)>
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
	//    3    5:new             #214 <Class IllegalStateException>
	//    4    8:dup             
	//    5    9:ldc1            #228 <String "Starting intent sender with a requestCode requires a FragmentActivity host">
	//    6   11:invokespecial   #218 <Method void IllegalStateException(String)>
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
	//   17   31:invokestatic    #234 <Method void ActivityCompat.startIntentSenderForResult(Activity, IntentSender, int, Intent, int, int, int, Bundle)>
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
	//*   1    1:getfield        #145 <Field SimpleArrayMap mAllLoaderManagers>
	//*   2    4:ifnull          78
		{
			int k = mAllLoaderManagers.size();
	//    3    7:aload_0         
	//    4    8:getfield        #145 <Field SimpleArrayMap mAllLoaderManagers>
	//    5   11:invokevirtual   #240 <Method int SimpleArrayMap.size()>
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
				aloadermanagerimpl[i] = (LoaderManagerImpl)mAllLoaderManagers.valueAt(i);
	//   16   28:aload_3         
	//   17   29:iload_1         
	//   18   30:aload_0         
	//   19   31:getfield        #145 <Field SimpleArrayMap mAllLoaderManagers>
	//   20   34:iload_1         
	//   21   35:invokevirtual   #244 <Method Object SimpleArrayMap.valueAt(int)>
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
	//   39   63:invokevirtual   #247 <Method void LoaderManagerImpl.finishRetain()>
				loadermanagerimpl.doReportStart();
	//   40   66:aload           4
	//   41   68:invokevirtual   #250 <Method void LoaderManagerImpl.doReportStart()>
			}

	//   42   71:iload_1         
	//   43   72:iconst_1        
	//   44   73:iadd            
	//   45   74:istore_1        
		}
	//*  46   75:goto            51
	//   47   78:return          
	}

	void restoreLoaderNonConfig(SimpleArrayMap simplearraymap)
	{
		mAllLoaderManagers = simplearraymap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #145 <Field SimpleArrayMap mAllLoaderManagers>
	//    3    5:return          
	}

	SimpleArrayMap retainLoaderNonConfig()
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag2 = false;
	//    2    2:iconst_0        
	//    3    3:istore          4
		if(mAllLoaderManagers != null)
	//*   4    5:aload_0         
	//*   5    6:getfield        #145 <Field SimpleArrayMap mAllLoaderManagers>
	//*   6    9:ifnull          153
		{
			int k = mAllLoaderManagers.size();
	//    7   12:aload_0         
	//    8   13:getfield        #145 <Field SimpleArrayMap mAllLoaderManagers>
	//    9   16:invokevirtual   #240 <Method int SimpleArrayMap.size()>
	//   10   19:istore          5
			LoaderManagerImpl aloadermanagerimpl[] = new LoaderManagerImpl[k];
	//   11   21:iload           5
	//   12   23:anewarray       LoaderManagerImpl[]
	//   13   26:astore          7
			for(int i = k - 1; i >= 0; i--)
	//*  14   28:iload           5
	//*  15   30:iconst_1        
	//*  16   31:isub            
	//*  17   32:istore_1        
	//*  18   33:iload_1         
	//*  19   34:iflt            59
				aloadermanagerimpl[i] = (LoaderManagerImpl)mAllLoaderManagers.valueAt(i);
	//   20   37:aload           7
	//   21   39:iload_1         
	//   22   40:aload_0         
	//   23   41:getfield        #145 <Field SimpleArrayMap mAllLoaderManagers>
	//   24   44:iload_1         
	//   25   45:invokevirtual   #244 <Method Object SimpleArrayMap.valueAt(int)>
	//   26   48:checkcast       #57  <Class LoaderManagerImpl>
	//   27   51:aastore         

	//   28   52:iload_1         
	//   29   53:iconst_1        
	//   30   54:isub            
	//   31   55:istore_1        
	//*  32   56:goto            33
			boolean flag3 = getRetainLoaders();
	//   33   59:aload_0         
	//   34   60:invokevirtual   #258 <Method boolean getRetainLoaders()>
	//   35   63:istore          6
			int j = 0;
	//   36   65:iconst_0        
	//   37   66:istore_2        
			boolean flag = flag2;
	//   38   67:iload           4
	//   39   69:istore_1        
			do
			{
				flag1 = flag;
	//   40   70:iload_1         
	//   41   71:istore_3        
				if(j >= k)
					break;
	//   42   72:iload_2         
	//   43   73:iload           5
	//   44   75:icmpge          153
				LoaderManagerImpl loadermanagerimpl = aloadermanagerimpl[j];
	//   45   78:aload           7
	//   46   80:iload_2         
	//   47   81:aaload          
	//   48   82:astore          8
				if(!loadermanagerimpl.mRetaining && flag3)
	//*  49   84:aload           8
	//*  50   86:getfield        #171 <Field boolean LoaderManagerImpl.mRetaining>
	//*  51   89:ifne            115
	//*  52   92:iload           6
	//*  53   94:ifeq            115
				{
					if(!loadermanagerimpl.mStarted)
	//*  54   97:aload           8
	//*  55   99:getfield        #81  <Field boolean LoaderManagerImpl.mStarted>
	//*  56  102:ifne            110
						loadermanagerimpl.doStart();
	//   57  105:aload           8
	//   58  107:invokevirtual   #70  <Method void LoaderManagerImpl.doStart()>
					loadermanagerimpl.doRetain();
	//   59  110:aload           8
	//   60  112:invokevirtual   #64  <Method void LoaderManagerImpl.doRetain()>
				}
				if(loadermanagerimpl.mRetaining)
	//*  61  115:aload           8
	//*  62  117:getfield        #171 <Field boolean LoaderManagerImpl.mRetaining>
	//*  63  120:ifeq            128
				{
					flag = true;
	//   64  123:iconst_1        
	//   65  124:istore_1        
				} else
	//*  66  125:goto            146
				{
					loadermanagerimpl.doDestroy();
	//   67  128:aload           8
	//   68  130:invokevirtual   #60  <Method void LoaderManagerImpl.doDestroy()>
					mAllLoaderManagers.remove(((Object) (loadermanagerimpl.mWho)));
	//   69  133:aload_0         
	//   70  134:getfield        #145 <Field SimpleArrayMap mAllLoaderManagers>
	//   71  137:aload           8
	//   72  139:getfield        #262 <Field String LoaderManagerImpl.mWho>
	//   73  142:invokevirtual   #174 <Method Object SimpleArrayMap.remove(Object)>
	//   74  145:pop             
				}
				j++;
	//   75  146:iload_2         
	//   76  147:iconst_1        
	//   77  148:iadd            
	//   78  149:istore_2        
			} while(true);
	//   79  150:goto            70
		}
		if(flag1)
	//*  80  153:iload_3         
	//*  81  154:ifeq            162
			return mAllLoaderManagers;
	//   82  157:aload_0         
	//   83  158:getfield        #145 <Field SimpleArrayMap mAllLoaderManagers>
	//   84  161:areturn         
		else
			return null;
	//   85  162:aconst_null     
	//   86  163:areturn         
	}

	private final Activity mActivity;
	private SimpleArrayMap mAllLoaderManagers;
	private boolean mCheckedForLoaderManager;
	final Context mContext;
	final FragmentManagerImpl mFragmentManager;
	private final Handler mHandler;
	private LoaderManagerImpl mLoaderManager;
	private boolean mLoadersStarted;
	private boolean mRetainLoaders;
	final int mWindowAnimations;
}
