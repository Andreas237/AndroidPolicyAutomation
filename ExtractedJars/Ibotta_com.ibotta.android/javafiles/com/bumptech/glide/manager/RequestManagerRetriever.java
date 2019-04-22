// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.support.v4.util.ArrayMap;
import android.util.Log;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.util.Util;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.bumptech.glide.manager:
//			RequestManagerFragment, ApplicationLifecycle, EmptyRequestManagerTreeNode, ActivityFragmentLifecycle, 
//			SupportRequestManagerFragment, Lifecycle, RequestManagerTreeNode

public class RequestManagerRetriever
	implements android.os.Handler.Callback
{
	public static interface RequestManagerFactory
	{

		public abstract RequestManager build(Glide glide, Lifecycle lifecycle, RequestManagerTreeNode requestmanagertreenode, Context context);
	}


	public RequestManagerRetriever(RequestManagerFactory requestmanagerfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #44  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #45  <Method void HashMap()>
	//    6   12:putfield        #47  <Field Map pendingRequestManagerFragments>
	//    7   15:aload_0         
	//    8   16:new             #44  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #45  <Method void HashMap()>
	//   11   23:putfield        #49  <Field Map pendingSupportRequestManagerFragments>
	//   12   26:aload_0         
	//   13   27:new             #51  <Class ArrayMap>
	//   14   30:dup             
	//   15   31:invokespecial   #52  <Method void ArrayMap()>
	//   16   34:putfield        #54  <Field ArrayMap tempViewToSupportFragment>
	//   17   37:aload_0         
	//   18   38:new             #51  <Class ArrayMap>
	//   19   41:dup             
	//   20   42:invokespecial   #52  <Method void ArrayMap()>
	//   21   45:putfield        #56  <Field ArrayMap tempViewToFragment>
	//   22   48:aload_0         
	//   23   49:new             #58  <Class Bundle>
	//   24   52:dup             
	//   25   53:invokespecial   #59  <Method void Bundle()>
	//   26   56:putfield        #61  <Field Bundle tempBundle>
		if(requestmanagerfactory == null)
	//*  27   59:aload_1         
	//*  28   60:ifnull          66
	//*  29   63:goto            70
			requestmanagerfactory = DEFAULT_FACTORY;
	//   30   66:getstatic       #38  <Field RequestManagerRetriever$RequestManagerFactory DEFAULT_FACTORY>
	//   31   69:astore_1        
		factory = requestmanagerfactory;
	//   32   70:aload_0         
	//   33   71:aload_1         
	//   34   72:putfield        #63  <Field RequestManagerRetriever$RequestManagerFactory factory>
	//   35   75:aload_0         
	//   36   76:new             #65  <Class Handler>
	//   37   79:dup             
	//   38   80:invokestatic    #71  <Method Looper Looper.getMainLooper()>
	//   39   83:aload_0         
	//   40   84:invokespecial   #74  <Method void Handler(Looper, android.os.Handler$Callback)>
	//   41   87:putfield        #76  <Field Handler handler>
	//   42   90:return          
	}

	private static void assertNotDestroyed(Activity activity)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #89  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          26
		{
			if(!activity.isDestroyed())
	//*   3    8:aload_0         
	//*   4    9:invokevirtual   #95  <Method boolean Activity.isDestroyed()>
	//*   5   12:ifne            16
				return;
	//    6   15:return          
			else
				throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
	//    7   16:new             #97  <Class IllegalArgumentException>
	//    8   19:dup             
	//    9   20:ldc1            #99  <String "You cannot start a load for a destroyed activity">
	//   10   22:invokespecial   #102 <Method void IllegalArgumentException(String)>
	//   11   25:athrow          
		} else
		{
			return;
	//   12   26:return          
		}
	}

	private RequestManager fragmentGet(Context context, FragmentManager fragmentmanager, Fragment fragment, boolean flag)
	{
		RequestManagerFragment requestmanagerfragment = getRequestManagerFragment(fragmentmanager, fragment, flag);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:iload           4
	//    4    5:invokespecial   #110 <Method RequestManagerFragment getRequestManagerFragment(FragmentManager, Fragment, boolean)>
	//    5    8:astore          5
		fragment = ((Fragment) (requestmanagerfragment.getRequestManager()));
	//    6   10:aload           5
	//    7   12:invokevirtual   #116 <Method RequestManager RequestManagerFragment.getRequestManager()>
	//    8   15:astore_3        
		fragmentmanager = ((FragmentManager) (fragment));
	//    9   16:aload_3         
	//   10   17:astore_2        
		if(fragment == null)
	//*  11   18:aload_3         
	//*  12   19:ifnonnull       55
		{
			fragmentmanager = ((FragmentManager) (Glide.get(context)));
	//   13   22:aload_1         
	//   14   23:invokestatic    #122 <Method Glide Glide.get(Context)>
	//   15   26:astore_2        
			fragmentmanager = ((FragmentManager) (factory.build(((Glide) (fragmentmanager)), ((Lifecycle) (requestmanagerfragment.getGlideLifecycle())), requestmanagerfragment.getRequestManagerTreeNode(), context)));
	//   16   27:aload_0         
	//   17   28:getfield        #63  <Field RequestManagerRetriever$RequestManagerFactory factory>
	//   18   31:aload_2         
	//   19   32:aload           5
	//   20   34:invokevirtual   #126 <Method ActivityFragmentLifecycle RequestManagerFragment.getGlideLifecycle()>
	//   21   37:aload           5
	//   22   39:invokevirtual   #130 <Method RequestManagerTreeNode RequestManagerFragment.getRequestManagerTreeNode()>
	//   23   42:aload_1         
	//   24   43:invokeinterface #134 <Method RequestManager RequestManagerRetriever$RequestManagerFactory.build(Glide, Lifecycle, RequestManagerTreeNode, Context)>
	//   25   48:astore_2        
			requestmanagerfragment.setRequestManager(((RequestManager) (fragmentmanager)));
	//   26   49:aload           5
	//   27   51:aload_2         
	//   28   52:invokevirtual   #138 <Method void RequestManagerFragment.setRequestManager(RequestManager)>
		}
		return ((RequestManager) (fragmentmanager));
	//   29   55:aload_2         
	//   30   56:areturn         
	}

	private RequestManager getApplicationManager(Context context)
	{
		if(applicationManager != null)
			break MISSING_BLOCK_LABEL_66;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field RequestManager applicationManager>
	//    2    4:ifnonnull       66
		this;
	//    3    7:aload_0         
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		if(applicationManager == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #143 <Field RequestManager applicationManager>
	//*   7   13:ifnonnull       56
		{
			Glide glide = Glide.get(context.getApplicationContext());
	//    8   16:aload_1         
	//    9   17:invokevirtual   #149 <Method Context Context.getApplicationContext()>
	//   10   20:invokestatic    #122 <Method Glide Glide.get(Context)>
	//   11   23:astore_2        
			applicationManager = factory.build(glide, ((Lifecycle) (new ApplicationLifecycle())), ((RequestManagerTreeNode) (new EmptyRequestManagerTreeNode())), context.getApplicationContext());
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getfield        #63  <Field RequestManagerRetriever$RequestManagerFactory factory>
	//   15   29:aload_2         
	//   16   30:new             #151 <Class ApplicationLifecycle>
	//   17   33:dup             
	//   18   34:invokespecial   #152 <Method void ApplicationLifecycle()>
	//   19   37:new             #154 <Class EmptyRequestManagerTreeNode>
	//   20   40:dup             
	//   21   41:invokespecial   #155 <Method void EmptyRequestManagerTreeNode()>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #149 <Method Context Context.getApplicationContext()>
	//   24   48:invokeinterface #134 <Method RequestManager RequestManagerRetriever$RequestManagerFactory.build(Glide, Lifecycle, RequestManagerTreeNode, Context)>
	//   25   53:putfield        #143 <Field RequestManager applicationManager>
		}
		this;
	//   26   56:aload_0         
		JVM INSTR monitorexit ;
	//   27   57:monitorexit     
		break MISSING_BLOCK_LABEL_66;
	//   28   58:goto            66
		context;
	//   29   61:astore_1        
		this;
	//   30   62:aload_0         
		JVM INSTR monitorexit ;
	//   31   63:monitorexit     
		throw context;
	//   32   64:aload_1         
	//   33   65:athrow          
		return applicationManager;
	//   34   66:aload_0         
	//   35   67:getfield        #143 <Field RequestManager applicationManager>
	//   36   70:areturn         
	}

	private RequestManagerFragment getRequestManagerFragment(FragmentManager fragmentmanager, Fragment fragment, boolean flag)
	{
		RequestManagerFragment requestmanagerfragment1 = (RequestManagerFragment)fragmentmanager.findFragmentByTag("com.bumptech.glide.manager");
	//    0    0:aload_1         
	//    1    1:ldc1            #157 <String "com.bumptech.glide.manager">
	//    2    3:invokevirtual   #163 <Method Fragment FragmentManager.findFragmentByTag(String)>
	//    3    6:checkcast       #112 <Class RequestManagerFragment>
	//    4    9:astore          5
		RequestManagerFragment requestmanagerfragment = requestmanagerfragment1;
	//    5   11:aload           5
	//    6   13:astore          4
		if(requestmanagerfragment1 == null)
	//*   7   15:aload           5
	//*   8   17:ifnonnull       111
		{
			RequestManagerFragment requestmanagerfragment2 = (RequestManagerFragment)pendingRequestManagerFragments.get(((Object) (fragmentmanager)));
	//    9   20:aload_0         
	//   10   21:getfield        #47  <Field Map pendingRequestManagerFragments>
	//   11   24:aload_1         
	//   12   25:invokeinterface #168 <Method Object Map.get(Object)>
	//   13   30:checkcast       #112 <Class RequestManagerFragment>
	//   14   33:astore          5
			requestmanagerfragment = requestmanagerfragment2;
	//   15   35:aload           5
	//   16   37:astore          4
			if(requestmanagerfragment2 == null)
	//*  17   39:aload           5
	//*  18   41:ifnonnull       111
			{
				requestmanagerfragment = new RequestManagerFragment();
	//   19   44:new             #112 <Class RequestManagerFragment>
	//   20   47:dup             
	//   21   48:invokespecial   #169 <Method void RequestManagerFragment()>
	//   22   51:astore          4
				requestmanagerfragment.setParentFragmentHint(fragment);
	//   23   53:aload           4
	//   24   55:aload_2         
	//   25   56:invokevirtual   #173 <Method void RequestManagerFragment.setParentFragmentHint(Fragment)>
				if(flag)
	//*  26   59:iload_3         
	//*  27   60:ifeq            71
					requestmanagerfragment.getGlideLifecycle().onStart();
	//   28   63:aload           4
	//   29   65:invokevirtual   #126 <Method ActivityFragmentLifecycle RequestManagerFragment.getGlideLifecycle()>
	//   30   68:invokevirtual   #178 <Method void ActivityFragmentLifecycle.onStart()>
				pendingRequestManagerFragments.put(((Object) (fragmentmanager)), ((Object) (requestmanagerfragment)));
	//   31   71:aload_0         
	//   32   72:getfield        #47  <Field Map pendingRequestManagerFragments>
	//   33   75:aload_1         
	//   34   76:aload           4
	//   35   78:invokeinterface #182 <Method Object Map.put(Object, Object)>
	//   36   83:pop             
				fragmentmanager.beginTransaction().add(((Fragment) (requestmanagerfragment)), "com.bumptech.glide.manager").commitAllowingStateLoss();
	//   37   84:aload_1         
	//   38   85:invokevirtual   #186 <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   39   88:aload           4
	//   40   90:ldc1            #157 <String "com.bumptech.glide.manager">
	//   41   92:invokevirtual   #192 <Method FragmentTransaction FragmentTransaction.add(Fragment, String)>
	//   42   95:invokevirtual   #196 <Method int FragmentTransaction.commitAllowingStateLoss()>
	//   43   98:pop             
				handler.obtainMessage(1, ((Object) (fragmentmanager))).sendToTarget();
	//   44   99:aload_0         
	//   45  100:getfield        #76  <Field Handler handler>
	//   46  103:iconst_1        
	//   47  104:aload_1         
	//   48  105:invokevirtual   #200 <Method Message Handler.obtainMessage(int, Object)>
	//   49  108:invokevirtual   #205 <Method void Message.sendToTarget()>
			}
		}
		return requestmanagerfragment;
	//   50  111:aload           4
	//   51  113:areturn         
	}

	private SupportRequestManagerFragment getSupportRequestManagerFragment(android.support.v4.app.FragmentManager fragmentmanager, android.support.v4.app.Fragment fragment, boolean flag)
	{
		SupportRequestManagerFragment supportrequestmanagerfragment1 = (SupportRequestManagerFragment)fragmentmanager.findFragmentByTag("com.bumptech.glide.manager");
	//    0    0:aload_1         
	//    1    1:ldc1            #157 <String "com.bumptech.glide.manager">
	//    2    3:invokevirtual   #212 <Method android.support.v4.app.Fragment android.support.v4.app.FragmentManager.findFragmentByTag(String)>
	//    3    6:checkcast       #214 <Class SupportRequestManagerFragment>
	//    4    9:astore          5
		SupportRequestManagerFragment supportrequestmanagerfragment = supportrequestmanagerfragment1;
	//    5   11:aload           5
	//    6   13:astore          4
		if(supportrequestmanagerfragment1 == null)
	//*   7   15:aload           5
	//*   8   17:ifnonnull       111
		{
			SupportRequestManagerFragment supportrequestmanagerfragment2 = (SupportRequestManagerFragment)pendingSupportRequestManagerFragments.get(((Object) (fragmentmanager)));
	//    9   20:aload_0         
	//   10   21:getfield        #49  <Field Map pendingSupportRequestManagerFragments>
	//   11   24:aload_1         
	//   12   25:invokeinterface #168 <Method Object Map.get(Object)>
	//   13   30:checkcast       #214 <Class SupportRequestManagerFragment>
	//   14   33:astore          5
			supportrequestmanagerfragment = supportrequestmanagerfragment2;
	//   15   35:aload           5
	//   16   37:astore          4
			if(supportrequestmanagerfragment2 == null)
	//*  17   39:aload           5
	//*  18   41:ifnonnull       111
			{
				supportrequestmanagerfragment = new SupportRequestManagerFragment();
	//   19   44:new             #214 <Class SupportRequestManagerFragment>
	//   20   47:dup             
	//   21   48:invokespecial   #215 <Method void SupportRequestManagerFragment()>
	//   22   51:astore          4
				supportrequestmanagerfragment.setParentFragmentHint(fragment);
	//   23   53:aload           4
	//   24   55:aload_2         
	//   25   56:invokevirtual   #218 <Method void SupportRequestManagerFragment.setParentFragmentHint(android.support.v4.app.Fragment)>
				if(flag)
	//*  26   59:iload_3         
	//*  27   60:ifeq            71
					supportrequestmanagerfragment.getGlideLifecycle().onStart();
	//   28   63:aload           4
	//   29   65:invokevirtual   #219 <Method ActivityFragmentLifecycle SupportRequestManagerFragment.getGlideLifecycle()>
	//   30   68:invokevirtual   #178 <Method void ActivityFragmentLifecycle.onStart()>
				pendingSupportRequestManagerFragments.put(((Object) (fragmentmanager)), ((Object) (supportrequestmanagerfragment)));
	//   31   71:aload_0         
	//   32   72:getfield        #49  <Field Map pendingSupportRequestManagerFragments>
	//   33   75:aload_1         
	//   34   76:aload           4
	//   35   78:invokeinterface #182 <Method Object Map.put(Object, Object)>
	//   36   83:pop             
				fragmentmanager.beginTransaction().add(((android.support.v4.app.Fragment) (supportrequestmanagerfragment)), "com.bumptech.glide.manager").commitAllowingStateLoss();
	//   37   84:aload_1         
	//   38   85:invokevirtual   #222 <Method android.support.v4.app.FragmentTransaction android.support.v4.app.FragmentManager.beginTransaction()>
	//   39   88:aload           4
	//   40   90:ldc1            #157 <String "com.bumptech.glide.manager">
	//   41   92:invokevirtual   #227 <Method android.support.v4.app.FragmentTransaction android.support.v4.app.FragmentTransaction.add(android.support.v4.app.Fragment, String)>
	//   42   95:invokevirtual   #228 <Method int android.support.v4.app.FragmentTransaction.commitAllowingStateLoss()>
	//   43   98:pop             
				handler.obtainMessage(2, ((Object) (fragmentmanager))).sendToTarget();
	//   44   99:aload_0         
	//   45  100:getfield        #76  <Field Handler handler>
	//   46  103:iconst_2        
	//   47  104:aload_1         
	//   48  105:invokevirtual   #200 <Method Message Handler.obtainMessage(int, Object)>
	//   49  108:invokevirtual   #205 <Method void Message.sendToTarget()>
			}
		}
		return supportrequestmanagerfragment;
	//   50  111:aload           4
	//   51  113:areturn         
	}

	private static boolean isActivityVisible(Activity activity)
	{
		return activity.isFinishing() ^ true;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #233 <Method boolean Activity.isFinishing()>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:ireturn         
	}

	private RequestManager supportFragmentGet(Context context, android.support.v4.app.FragmentManager fragmentmanager, android.support.v4.app.Fragment fragment, boolean flag)
	{
		SupportRequestManagerFragment supportrequestmanagerfragment = getSupportRequestManagerFragment(fragmentmanager, fragment, flag);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:iload           4
	//    4    5:invokespecial   #237 <Method SupportRequestManagerFragment getSupportRequestManagerFragment(android.support.v4.app.FragmentManager, android.support.v4.app.Fragment, boolean)>
	//    5    8:astore          5
		fragment = ((android.support.v4.app.Fragment) (supportrequestmanagerfragment.getRequestManager()));
	//    6   10:aload           5
	//    7   12:invokevirtual   #238 <Method RequestManager SupportRequestManagerFragment.getRequestManager()>
	//    8   15:astore_3        
		fragmentmanager = ((android.support.v4.app.FragmentManager) (fragment));
	//    9   16:aload_3         
	//   10   17:astore_2        
		if(fragment == null)
	//*  11   18:aload_3         
	//*  12   19:ifnonnull       55
		{
			fragmentmanager = ((android.support.v4.app.FragmentManager) (Glide.get(context)));
	//   13   22:aload_1         
	//   14   23:invokestatic    #122 <Method Glide Glide.get(Context)>
	//   15   26:astore_2        
			fragmentmanager = ((android.support.v4.app.FragmentManager) (factory.build(((Glide) (fragmentmanager)), ((Lifecycle) (supportrequestmanagerfragment.getGlideLifecycle())), supportrequestmanagerfragment.getRequestManagerTreeNode(), context)));
	//   16   27:aload_0         
	//   17   28:getfield        #63  <Field RequestManagerRetriever$RequestManagerFactory factory>
	//   18   31:aload_2         
	//   19   32:aload           5
	//   20   34:invokevirtual   #219 <Method ActivityFragmentLifecycle SupportRequestManagerFragment.getGlideLifecycle()>
	//   21   37:aload           5
	//   22   39:invokevirtual   #239 <Method RequestManagerTreeNode SupportRequestManagerFragment.getRequestManagerTreeNode()>
	//   23   42:aload_1         
	//   24   43:invokeinterface #134 <Method RequestManager RequestManagerRetriever$RequestManagerFactory.build(Glide, Lifecycle, RequestManagerTreeNode, Context)>
	//   25   48:astore_2        
			supportrequestmanagerfragment.setRequestManager(((RequestManager) (fragmentmanager)));
	//   26   49:aload           5
	//   27   51:aload_2         
	//   28   52:invokevirtual   #240 <Method void SupportRequestManagerFragment.setRequestManager(RequestManager)>
		}
		return ((RequestManager) (fragmentmanager));
	//   29   55:aload_2         
	//   30   56:areturn         
	}

	public RequestManager get(Activity activity)
	{
		if(Util.isOnBackgroundThread())
	//*   0    0:invokestatic    #246 <Method boolean Util.isOnBackgroundThread()>
	//*   1    3:ifeq            15
		{
			return get(activity.getApplicationContext());
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:invokevirtual   #247 <Method Context Activity.getApplicationContext()>
	//    5   11:invokevirtual   #249 <Method RequestManager get(Context)>
	//    6   14:areturn         
		} else
		{
			assertNotDestroyed(activity);
	//    7   15:aload_1         
	//    8   16:invokestatic    #251 <Method void assertNotDestroyed(Activity)>
			return fragmentGet(((Context) (activity)), activity.getFragmentManager(), ((Fragment) (null)), isActivityVisible(activity));
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #255 <Method FragmentManager Activity.getFragmentManager()>
	//   13   25:aconst_null     
	//   14   26:aload_1         
	//   15   27:invokestatic    #257 <Method boolean isActivityVisible(Activity)>
	//   16   30:invokespecial   #259 <Method RequestManager fragmentGet(Context, FragmentManager, Fragment, boolean)>
	//   17   33:areturn         
		}
	}

	public RequestManager get(Context context)
	{
		if(context != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          74
		{
			if(Util.isOnMainThread() && !(context instanceof Application))
	//*   2    4:invokestatic    #262 <Method boolean Util.isOnMainThread()>
	//*   3    7:ifeq            68
	//*   4   10:aload_1         
	//*   5   11:instanceof      #264 <Class Application>
	//*   6   14:ifne            68
			{
				if(context instanceof FragmentActivity)
	//*   7   17:aload_1         
	//*   8   18:instanceof      #266 <Class FragmentActivity>
	//*   9   21:ifeq            33
					return get((FragmentActivity)context);
	//   10   24:aload_0         
	//   11   25:aload_1         
	//   12   26:checkcast       #266 <Class FragmentActivity>
	//   13   29:invokevirtual   #269 <Method RequestManager get(FragmentActivity)>
	//   14   32:areturn         
				if(context instanceof Activity)
	//*  15   33:aload_1         
	//*  16   34:instanceof      #91  <Class Activity>
	//*  17   37:ifeq            49
					return get((Activity)context);
	//   18   40:aload_0         
	//   19   41:aload_1         
	//   20   42:checkcast       #91  <Class Activity>
	//   21   45:invokevirtual   #271 <Method RequestManager get(Activity)>
	//   22   48:areturn         
				if(context instanceof ContextWrapper)
	//*  23   49:aload_1         
	//*  24   50:instanceof      #273 <Class ContextWrapper>
	//*  25   53:ifeq            68
					return get(((ContextWrapper)context).getBaseContext());
	//   26   56:aload_0         
	//   27   57:aload_1         
	//   28   58:checkcast       #273 <Class ContextWrapper>
	//   29   61:invokevirtual   #276 <Method Context ContextWrapper.getBaseContext()>
	//   30   64:invokevirtual   #249 <Method RequestManager get(Context)>
	//   31   67:areturn         
			}
			return getApplicationManager(context);
	//   32   68:aload_0         
	//   33   69:aload_1         
	//   34   70:invokespecial   #278 <Method RequestManager getApplicationManager(Context)>
	//   35   73:areturn         
		} else
		{
			throw new IllegalArgumentException("You cannot start a load on a null Context");
	//   36   74:new             #97  <Class IllegalArgumentException>
	//   37   77:dup             
	//   38   78:ldc2            #280 <String "You cannot start a load on a null Context">
	//   39   81:invokespecial   #102 <Method void IllegalArgumentException(String)>
	//   40   84:athrow          
		}
	}

	public RequestManager get(FragmentActivity fragmentactivity)
	{
		if(Util.isOnBackgroundThread())
	//*   0    0:invokestatic    #246 <Method boolean Util.isOnBackgroundThread()>
	//*   1    3:ifeq            15
		{
			return get(fragmentactivity.getApplicationContext());
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:invokevirtual   #281 <Method Context FragmentActivity.getApplicationContext()>
	//    5   11:invokevirtual   #249 <Method RequestManager get(Context)>
	//    6   14:areturn         
		} else
		{
			assertNotDestroyed(((Activity) (fragmentactivity)));
	//    7   15:aload_1         
	//    8   16:invokestatic    #251 <Method void assertNotDestroyed(Activity)>
			return supportFragmentGet(((Context) (fragmentactivity)), fragmentactivity.getSupportFragmentManager(), ((android.support.v4.app.Fragment) (null)), isActivityVisible(((Activity) (fragmentactivity))));
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #285 <Method android.support.v4.app.FragmentManager FragmentActivity.getSupportFragmentManager()>
	//   13   25:aconst_null     
	//   14   26:aload_1         
	//   15   27:invokestatic    #257 <Method boolean isActivityVisible(Activity)>
	//   16   30:invokespecial   #287 <Method RequestManager supportFragmentGet(Context, android.support.v4.app.FragmentManager, android.support.v4.app.Fragment, boolean)>
	//   17   33:areturn         
		}
	}

	RequestManagerFragment getRequestManagerFragment(Activity activity)
	{
		return getRequestManagerFragment(activity.getFragmentManager(), ((Fragment) (null)), isActivityVisible(activity));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #255 <Method FragmentManager Activity.getFragmentManager()>
	//    3    5:aconst_null     
	//    4    6:aload_1         
	//    5    7:invokestatic    #257 <Method boolean isActivityVisible(Activity)>
	//    6   10:invokespecial   #110 <Method RequestManagerFragment getRequestManagerFragment(FragmentManager, Fragment, boolean)>
	//    7   13:areturn         
	}

	SupportRequestManagerFragment getSupportRequestManagerFragment(FragmentActivity fragmentactivity)
	{
		return getSupportRequestManagerFragment(fragmentactivity.getSupportFragmentManager(), ((android.support.v4.app.Fragment) (null)), isActivityVisible(((Activity) (fragmentactivity))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #285 <Method android.support.v4.app.FragmentManager FragmentActivity.getSupportFragmentManager()>
	//    3    5:aconst_null     
	//    4    6:aload_1         
	//    5    7:invokestatic    #257 <Method boolean isActivityVisible(Activity)>
	//    6   10:invokespecial   #237 <Method SupportRequestManagerFragment getSupportRequestManagerFragment(android.support.v4.app.FragmentManager, android.support.v4.app.Fragment, boolean)>
	//    7   13:areturn         
	}

	public boolean handleMessage(Message message)
	{
		int i = message.what;
	//    0    0:aload_1         
	//    1    1:getfield        #294 <Field int Message.what>
	//    2    4:istore_2        
		Object obj = null;
	//    3    5:aconst_null     
	//    4    6:astore          4
		boolean flag = true;
	//    5    8:iconst_1        
	//    6    9:istore_3        
		switch(i)
	//*   7   10:iload_2         
		{
	//*   8   11:tableswitch     1 2: default 32
	//	               1 70
	//	               2 47
		default:
			flag = false;
	//    9   32:iconst_0        
	//   10   33:istore_3        
			Object obj1 = null;
	//   11   34:aconst_null     
	//   12   35:astore          5
			message = ((Message) (obj));
	//   13   37:aload           4
	//   14   39:astore_1        
			obj = ((Object) (obj1));
	//   15   40:aload           5
	//   16   42:astore          4
			break;

	//*  17   44:goto            90
		case 2: // '\002'
			message = ((Message) ((android.support.v4.app.FragmentManager)message.obj));
	//   18   47:aload_1         
	//   19   48:getfield        #298 <Field Object Message.obj>
	//   20   51:checkcast       #209 <Class android.support.v4.app.FragmentManager>
	//   21   54:astore_1        
			obj = pendingSupportRequestManagerFragments.remove(((Object) (message)));
	//   22   55:aload_0         
	//   23   56:getfield        #49  <Field Map pendingSupportRequestManagerFragments>
	//   24   59:aload_1         
	//   25   60:invokeinterface #301 <Method Object Map.remove(Object)>
	//   26   65:astore          4
			break;

	//*  27   67:goto            90
		case 1: // '\001'
			message = ((Message) ((FragmentManager)message.obj));
	//   28   70:aload_1         
	//   29   71:getfield        #298 <Field Object Message.obj>
	//   30   74:checkcast       #159 <Class FragmentManager>
	//   31   77:astore_1        
			obj = pendingRequestManagerFragments.remove(((Object) (message)));
	//   32   78:aload_0         
	//   33   79:getfield        #47  <Field Map pendingRequestManagerFragments>
	//   34   82:aload_1         
	//   35   83:invokeinterface #301 <Method Object Map.remove(Object)>
	//   36   88:astore          4
			break;
		}
		if(flag && obj == null && Log.isLoggable("RMRetriever", 5))
	//*  37   90:iload_3         
	//*  38   91:ifeq            146
	//*  39   94:aload           4
	//*  40   96:ifnonnull       146
	//*  41   99:ldc2            #303 <String "RMRetriever">
	//*  42  102:iconst_5        
	//*  43  103:invokestatic    #309 <Method boolean Log.isLoggable(String, int)>
	//*  44  106:ifeq            146
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   45  109:new             #311 <Class StringBuilder>
	//   46  112:dup             
	//   47  113:invokespecial   #312 <Method void StringBuilder()>
	//   48  116:astore          4
			stringbuilder.append("Failed to remove expected request manager fragment, manager: ");
	//   49  118:aload           4
	//   50  120:ldc2            #314 <String "Failed to remove expected request manager fragment, manager: ">
	//   51  123:invokevirtual   #318 <Method StringBuilder StringBuilder.append(String)>
	//   52  126:pop             
			stringbuilder.append(((Object) (message)));
	//   53  127:aload           4
	//   54  129:aload_1         
	//   55  130:invokevirtual   #321 <Method StringBuilder StringBuilder.append(Object)>
	//   56  133:pop             
			Log.w("RMRetriever", stringbuilder.toString());
	//   57  134:ldc2            #303 <String "RMRetriever">
	//   58  137:aload           4
	//   59  139:invokevirtual   #325 <Method String StringBuilder.toString()>
	//   60  142:invokestatic    #329 <Method int Log.w(String, String)>
	//   61  145:pop             
		}
		return flag;
	//   62  146:iload_3         
	//   63  147:ireturn         
	}

	private static final RequestManagerFactory DEFAULT_FACTORY = new RequestManagerFactory() {

		public RequestManager build(Glide glide, Lifecycle lifecycle, RequestManagerTreeNode requestmanagertreenode, Context context)
		{
			return new RequestManager(glide, lifecycle, requestmanagertreenode, context);
		//    0    0:new             #18  <Class RequestManager>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:aload           4
		//    6    9:invokespecial   #21  <Method void RequestManager(Glide, Lifecycle, RequestManagerTreeNode, Context)>
		//    7   12:areturn         
		}

	}
;
	private volatile RequestManager applicationManager;
	private final RequestManagerFactory factory;
	private final Handler handler = new Handler(Looper.getMainLooper(), ((android.os.Handler.Callback) (this)));
	final Map pendingRequestManagerFragments = new HashMap();
	final Map pendingSupportRequestManagerFragments = new HashMap();
	private final Bundle tempBundle = new Bundle();
	private final ArrayMap tempViewToFragment = new ArrayMap();
	private final ArrayMap tempViewToSupportFragment = new ArrayMap();

	static 
	{
	//    0    0:new             #8   <Class RequestManagerRetriever$1>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void RequestManagerRetriever$1()>
	//    3    7:putstatic       #38  <Field RequestManagerRetriever$RequestManagerFactory DEFAULT_FACTORY>
	//*   4   10:return          
	}
}
