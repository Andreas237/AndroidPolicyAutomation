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
	//*   2    4:ifeq            23
			activity = (Activity)context;
	//    3    7:aload_1         
	//    4    8:checkcast       #46  <Class Activity>
	//    5   11:astore          4
		else
	//*   6   13:aload_0         
	//*   7   14:aload           4
	//*   8   16:aload_1         
	//*   9   17:aload_2         
	//*  10   18:iload_3         
	//*  11   19:invokespecial   #48  <Method void FragmentHostCallback(Activity, Context, Handler, int)>
	//*  12   22:return          
			activity = null;
	//   13   23:aconst_null     
	//   14   24:astore          4
		this(activity, context, handler, i);
	//*  15   26:goto            13
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
	//    9   17:ifnull          33
_L1:
		mLoaderManager.doStart();
	//   10   20:aload_0         
	//   11   21:getfield        #55  <Field LoaderManagerImpl mLoaderManager>
	//   12   24:invokevirtual   #70  <Method void LoaderManagerImpl.doStart()>
_L4:
		mCheckedForLoaderManager = true;
	//   13   27:aload_0         
	//   14   28:iconst_1        
	//   15   29:putfield        #72  <Field boolean mCheckedForLoaderManager>
		return;
	//   16   32:return          
_L2:
		if(!mCheckedForLoaderManager)
	//*  17   33:aload_0         
	//*  18   34:getfield        #72  <Field boolean mCheckedForLoaderManager>
	//*  19   37:ifne            27
		{
			mLoaderManager = getLoaderManager("(root)", mLoadersStarted, false);
	//   20   40:aload_0         
	//   21   41:aload_0         
	//   22   42:ldc1            #74  <String "(root)">
	//   23   44:aload_0         
	//   24   45:getfield        #67  <Field boolean mLoadersStarted>
	//   25   48:iconst_0        
	//   26   49:invokevirtual   #78  <Method LoaderManagerImpl getLoaderManager(String, boolean, boolean)>
	//   27   52:putfield        #55  <Field LoaderManagerImpl mLoaderManager>
			if(mLoaderManager != null && !mLoaderManager.mStarted)
	//*  28   55:aload_0         
	//*  29   56:getfield        #55  <Field LoaderManagerImpl mLoaderManager>
	//*  30   59:ifnull          27
	//*  31   62:aload_0         
	//*  32   63:getfield        #55  <Field LoaderManagerImpl mLoaderManager>
	//*  33   66:getfield        #81  <Field boolean LoaderManagerImpl.mStarted>
	//*  34   69:ifne            27
				mLoaderManager.doStart();
	//   35   72:aload_0         
	//   36   73:getfield        #55  <Field LoaderManagerImpl mLoaderManager>
	//   37   76:invokevirtual   #70  <Method void LoaderManagerImpl.doStart()>
		}
		if(true) goto _L4; else goto _L3
	//   38   79:goto            27
_L3:
	}

	void doLoaderStop(boolean flag)
	{
		for(mRetainLoaders = flag; mLoaderManager == null || !mLoadersStarted;)
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:putfield        #85  <Field boolean mRetainLoaders>
	//*   3    5:aload_0         
	//*   4    6:getfield        #55  <Field LoaderManagerImpl mLoaderManager>
	//*   5    9:ifnonnull       13
			return;
	//    6   12:return          

	//    7   13:aload_0         
	//    8   14:getfield        #67  <Field boolean mLoadersStarted>
	//    9   17:ifeq            12
		mLoadersStarted = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #67  <Field boolean mLoadersStarted>
		if(flag)
	//*  13   25:iload_1         
	//*  14   26:ifeq            37
		{
			mLoaderManager.doRetain();
	//   15   29:aload_0         
	//   16   30:getfield        #55  <Field LoaderManagerImpl mLoaderManager>
	//   17   33:invokevirtual   #64  <Method void LoaderManagerImpl.doRetain()>
			return;
	//   18   36:return          
		} else
		{
			mLoaderManager.doStop();
	//   19   37:aload_0         
	//   20   38:getfield        #55  <Field LoaderManagerImpl mLoaderManager>
	//   21   41:invokevirtual   #88  <Method void LoaderManagerImpl.doStop()>
			return;
	//   22   44:return          
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
		if(loadermanagerimpl == null && flag1)
	//*  14   31:aload           4
	//*  15   33:ifnonnull       68
	//*  16   36:iload_3         
	//*  17   37:ifeq            68
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
			s = ((String) (loadermanagerimpl));
	//   31   63:aload           4
	//   32   65:astore_1        
		} else
	//*  33   66:aload_1         
	//*  34   67:areturn         
		{
			s = ((String) (loadermanagerimpl));
	//   35   68:aload           4
	//   36   70:astore_1        
			if(flag)
	//*  37   71:iload_2         
	//*  38   72:ifeq            66
			{
				s = ((String) (loadermanagerimpl));
	//   39   75:aload           4
	//   40   77:astore_1        
				if(loadermanagerimpl != null)
	//*  41   78:aload           4
	//*  42   80:ifnull          66
				{
					s = ((String) (loadermanagerimpl));
	//   43   83:aload           4
	//   44   85:astore_1        
					if(!loadermanagerimpl.mStarted)
	//*  45   86:aload           4
	//*  46   88:getfield        #81  <Field boolean LoaderManagerImpl.mStarted>
	//*  47   91:ifne            66
					{
						loadermanagerimpl.doStart();
	//   48   94:aload           4
	//   49   96:invokevirtual   #70  <Method void LoaderManagerImpl.doStart()>
						return loadermanagerimpl;
	//   50   99:aload           4
	//   51  101:areturn         
					}
				}
			}
		}
		return ((LoaderManagerImpl) (s));
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
	//*  12   24:getfield        #167 <Field boolean LoaderManagerImpl.mRetaining>
	//*  13   27:ifne            43
			{
				loadermanagerimpl.doDestroy();
	//   14   30:aload_2         
	//   15   31:invokevirtual   #60  <Method void LoaderManagerImpl.doDestroy()>
				mAllLoaderManagers.remove(((Object) (s)));
	//   16   34:aload_0         
	//   17   35:getfield        #145 <Field SimpleArrayMap mAllLoaderManagers>
	//   18   38:aload_1         
	//   19   39:invokevirtual   #170 <Method Object SimpleArrayMap.remove(Object)>
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
	//    2    4:ldc1            #183 <String "layout_inflater">
	//    3    6:invokevirtual   #189 <Method Object Context.getSystemService(String)>
	//    4    9:checkcast       #191 <Class LayoutInflater>
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
	//    5    5:invokevirtual   #208 <Method void onStartActivityFromFragment(Fragment, Intent, int, Bundle)>
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
	//    3    5:new             #210 <Class IllegalStateException>
	//    4    8:dup             
	//    5    9:ldc1            #212 <String "Starting activity with a requestCode requires a FragmentActivity host">
	//    6   11:invokespecial   #214 <Method void IllegalStateException(String)>
	//    7   14:athrow          
		} else
		{
			mContext.startActivity(intent);
	//    8   15:aload_0         
	//    9   16:getfield        #38  <Field Context mContext>
	//   10   19:aload_2         
	//   11   20:invokevirtual   #218 <Method void Context.startActivity(Intent)>
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
	//    3    5:new             #210 <Class IllegalStateException>
	//    4    8:dup             
	//    5    9:ldc1            #224 <String "Starting intent sender with a requestCode requires a FragmentActivity host">
	//    6   11:invokespecial   #214 <Method void IllegalStateException(String)>
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
	//   17   31:invokestatic    #230 <Method void ActivityCompat.startIntentSenderForResult(Activity, IntentSender, int, Intent, int, int, int, Bundle)>
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
	//    5   11:invokevirtual   #236 <Method int SimpleArrayMap.size()>
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
	//   21   35:invokevirtual   #240 <Method Object SimpleArrayMap.valueAt(int)>
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
	//   39   63:invokevirtual   #243 <Method void LoaderManagerImpl.finishRetain()>
				loadermanagerimpl.doReportStart();
	//   40   66:aload           4
	//   41   68:invokevirtual   #246 <Method void LoaderManagerImpl.doReportStart()>
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
		if(simplearraymap != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          35
		{
			int i = 0;
	//    2    4:iconst_0        
	//    3    5:istore_2        
			for(int j = simplearraymap.size(); i < j; i++)
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #236 <Method int SimpleArrayMap.size()>
	//*   6   10:istore_3        
	//*   7   11:iload_2         
	//*   8   12:iload_3         
	//*   9   13:icmpge          35
				((LoaderManagerImpl)simplearraymap.valueAt(i)).updateHostController(this);
	//   10   16:aload_1         
	//   11   17:iload_2         
	//   12   18:invokevirtual   #240 <Method Object SimpleArrayMap.valueAt(int)>
	//   13   21:checkcast       #57  <Class LoaderManagerImpl>
	//   14   24:aload_0         
	//   15   25:invokevirtual   #252 <Method void LoaderManagerImpl.updateHostController(FragmentHostCallback)>

	//   16   28:iload_2         
	//   17   29:iconst_1        
	//   18   30:iadd            
	//   19   31:istore_2        
		}
	//*  20   32:goto            11
		mAllLoaderManagers = simplearraymap;
	//   21   35:aload_0         
	//   22   36:aload_1         
	//   23   37:putfield        #145 <Field SimpleArrayMap mAllLoaderManagers>
	//   24   40:return          
	}

	SimpleArrayMap retainLoaderNonConfig()
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int j = 0;
	//    2    2:iconst_0        
	//    3    3:istore_2        
		if(mAllLoaderManagers != null)
	//*   4    4:aload_0         
	//*   5    5:getfield        #145 <Field SimpleArrayMap mAllLoaderManagers>
	//*   6    8:ifnull          153
		{
			int k = mAllLoaderManagers.size();
	//    7   11:aload_0         
	//    8   12:getfield        #145 <Field SimpleArrayMap mAllLoaderManagers>
	//    9   15:invokevirtual   #236 <Method int SimpleArrayMap.size()>
	//   10   18:istore          4
			LoaderManagerImpl aloadermanagerimpl[] = new LoaderManagerImpl[k];
	//   11   20:iload           4
	//   12   22:anewarray       LoaderManagerImpl[]
	//   13   25:astore          6
			for(int i = k - 1; i >= 0; i--)
	//*  14   27:iload           4
	//*  15   29:iconst_1        
	//*  16   30:isub            
	//*  17   31:istore_1        
	//*  18   32:iload_1         
	//*  19   33:iflt            58
				aloadermanagerimpl[i] = (LoaderManagerImpl)mAllLoaderManagers.valueAt(i);
	//   20   36:aload           6
	//   21   38:iload_1         
	//   22   39:aload_0         
	//   23   40:getfield        #145 <Field SimpleArrayMap mAllLoaderManagers>
	//   24   43:iload_1         
	//   25   44:invokevirtual   #240 <Method Object SimpleArrayMap.valueAt(int)>
	//   26   47:checkcast       #57  <Class LoaderManagerImpl>
	//   27   50:aastore         

	//   28   51:iload_1         
	//   29   52:iconst_1        
	//   30   53:isub            
	//   31   54:istore_1        
	//*  32   55:goto            32
			boolean flag2 = getRetainLoaders();
	//   33   58:aload_0         
	//   34   59:invokevirtual   #258 <Method boolean getRetainLoaders()>
	//   35   62:istore          5
			flag1 = false;
	//   36   64:iconst_0        
	//   37   65:istore_3        
			boolean flag = ((boolean) (j));
	//   38   66:iload_2         
	//   39   67:istore_1        
			j = ((int) (flag1));
	//   40   68:iload_3         
	//   41   69:istore_2        
			do
			{
				flag1 = flag;
	//   42   70:iload_1         
	//   43   71:istore_3        
				if(j >= k)
					break;
	//   44   72:iload_2         
	//   45   73:iload           4
	//   46   75:icmpge          153
				LoaderManagerImpl loadermanagerimpl = aloadermanagerimpl[j];
	//   47   78:aload           6
	//   48   80:iload_2         
	//   49   81:aaload          
	//   50   82:astore          7
				if(!loadermanagerimpl.mRetaining && flag2)
	//*  51   84:aload           7
	//*  52   86:getfield        #167 <Field boolean LoaderManagerImpl.mRetaining>
	//*  53   89:ifne            115
	//*  54   92:iload           5
	//*  55   94:ifeq            115
				{
					if(!loadermanagerimpl.mStarted)
	//*  56   97:aload           7
	//*  57   99:getfield        #81  <Field boolean LoaderManagerImpl.mStarted>
	//*  58  102:ifne            110
						loadermanagerimpl.doStart();
	//   59  105:aload           7
	//   60  107:invokevirtual   #70  <Method void LoaderManagerImpl.doStart()>
					loadermanagerimpl.doRetain();
	//   61  110:aload           7
	//   62  112:invokevirtual   #64  <Method void LoaderManagerImpl.doRetain()>
				}
				if(loadermanagerimpl.mRetaining)
	//*  63  115:aload           7
	//*  64  117:getfield        #167 <Field boolean LoaderManagerImpl.mRetaining>
	//*  65  120:ifeq            132
				{
					flag = true;
	//   66  123:iconst_1        
	//   67  124:istore_1        
				} else
	//*  68  125:iload_2         
	//*  69  126:iconst_1        
	//*  70  127:iadd            
	//*  71  128:istore_2        
	//*  72  129:goto            70
				{
					loadermanagerimpl.doDestroy();
	//   73  132:aload           7
	//   74  134:invokevirtual   #60  <Method void LoaderManagerImpl.doDestroy()>
					mAllLoaderManagers.remove(((Object) (loadermanagerimpl.mWho)));
	//   75  137:aload_0         
	//   76  138:getfield        #145 <Field SimpleArrayMap mAllLoaderManagers>
	//   77  141:aload           7
	//   78  143:getfield        #262 <Field String LoaderManagerImpl.mWho>
	//   79  146:invokevirtual   #170 <Method Object SimpleArrayMap.remove(Object)>
	//   80  149:pop             
				}
				j++;
			} while(true);
	//   81  150:goto            125
		}
		if(flag1)
	//*  82  153:iload_3         
	//*  83  154:ifeq            162
			return mAllLoaderManagers;
	//   84  157:aload_0         
	//   85  158:getfield        #145 <Field SimpleArrayMap mAllLoaderManagers>
	//   86  161:areturn         
		else
			return null;
	//   87  162:aconst_null     
	//   88  163:areturn         
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
