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
import android.view.View;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.bumptech.glide.manager:
//			RequestManagerFragment, ApplicationLifecycle, EmptyRequestManagerTreeNode, SupportRequestManagerFragment, 
//			Lifecycle, RequestManagerTreeNode

public class RequestManagerRetriever
	implements android.os.Handler.Callback
{
	public static interface RequestManagerFactory
	{

		public abstract RequestManager build(Glide glide, Lifecycle lifecycle, RequestManagerTreeNode requestmanagertreenode);
	}


	public RequestManagerRetriever(RequestManagerFactory requestmanagerfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #61  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #62  <Method void HashMap()>
	//    6   12:putfield        #64  <Field Map pendingRequestManagerFragments>
	//    7   15:aload_0         
	//    8   16:new             #61  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #62  <Method void HashMap()>
	//   11   23:putfield        #66  <Field Map pendingSupportRequestManagerFragments>
	//   12   26:aload_0         
	//   13   27:new             #68  <Class ArrayMap>
	//   14   30:dup             
	//   15   31:invokespecial   #69  <Method void ArrayMap()>
	//   16   34:putfield        #71  <Field ArrayMap tempViewToSupportFragment>
	//   17   37:aload_0         
	//   18   38:new             #68  <Class ArrayMap>
	//   19   41:dup             
	//   20   42:invokespecial   #69  <Method void ArrayMap()>
	//   21   45:putfield        #73  <Field ArrayMap tempViewToFragment>
	//   22   48:aload_0         
	//   23   49:new             #75  <Class Bundle>
	//   24   52:dup             
	//   25   53:invokespecial   #76  <Method void Bundle()>
	//   26   56:putfield        #78  <Field Bundle tempBundle>
		if(requestmanagerfactory == null)
	//*  27   59:aload_1         
	//*  28   60:ifnull          66
	//*  29   63:goto            70
			requestmanagerfactory = DEFAULT_FACTORY;
	//   30   66:getstatic       #55  <Field RequestManagerRetriever$RequestManagerFactory DEFAULT_FACTORY>
	//   31   69:astore_1        
		factory = requestmanagerfactory;
	//   32   70:aload_0         
	//   33   71:aload_1         
	//   34   72:putfield        #80  <Field RequestManagerRetriever$RequestManagerFactory factory>
	//   35   75:aload_0         
	//   36   76:new             #82  <Class Handler>
	//   37   79:dup             
	//   38   80:invokestatic    #88  <Method Looper Looper.getMainLooper()>
	//   39   83:aload_0         
	//   40   84:invokespecial   #91  <Method void Handler(Looper, android.os.Handler$Callback)>
	//   41   87:putfield        #93  <Field Handler handler>
	//   42   90:return          
	}

	private static void assertNotDestroyed(Activity activity)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17 && activity.isDestroyed())
	//*   0    0:getstatic       #104 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          25
	//*   3    8:aload_0         
	//*   4    9:invokevirtual   #110 <Method boolean Activity.isDestroyed()>
	//*   5   12:ifeq            25
			throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
	//    6   15:new             #112 <Class IllegalArgumentException>
	//    7   18:dup             
	//    8   19:ldc1            #114 <String "You cannot start a load for a destroyed activity">
	//    9   21:invokespecial   #117 <Method void IllegalArgumentException(String)>
	//   10   24:athrow          
		else
			return;
	//   11   25:return          
	}

	private Activity findActivity(Context context)
	{
		if(context instanceof Activity)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #106 <Class Activity>
	//*   2    4:ifeq            12
			return (Activity)context;
	//    3    7:aload_1         
	//    4    8:checkcast       #106 <Class Activity>
	//    5   11:areturn         
		if(context instanceof ContextWrapper)
	//*   6   12:aload_1         
	//*   7   13:instanceof      #122 <Class ContextWrapper>
	//*   8   16:ifeq            31
			return findActivity(((ContextWrapper)context).getBaseContext());
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:checkcast       #122 <Class ContextWrapper>
	//   12   24:invokevirtual   #126 <Method Context ContextWrapper.getBaseContext()>
	//   13   27:invokespecial   #128 <Method Activity findActivity(Context)>
	//   14   30:areturn         
		else
			return null;
	//   15   31:aconst_null     
	//   16   32:areturn         
	}

	private void findAllFragmentsWithViews(FragmentManager fragmentmanager, ArrayMap arraymap)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
_L2:
		int j;
		Object obj;
		obj = ((Object) (tempBundle));
	//    2    2:aload_0         
	//    3    3:getfield        #78  <Field Bundle tempBundle>
	//    4    6:astore          5
		j = i + 1;
	//    5    8:iload_3         
	//    6    9:iconst_1        
	//    7   10:iadd            
	//    8   11:istore          4
		((Bundle) (obj)).putInt("key", i);
	//    9   13:aload           5
	//   10   15:ldc1            #17  <String "key">
	//   11   17:iload_3         
	//   12   18:invokevirtual   #136 <Method void Bundle.putInt(String, int)>
		obj = null;
	//   13   21:aconst_null     
	//   14   22:astore          5
		Fragment fragment = fragmentmanager.getFragment(tempBundle, "i");
	//   15   24:aload_1         
	//   16   25:aload_0         
	//   17   26:getfield        #78  <Field Bundle tempBundle>
	//   18   29:ldc1            #20  <String "i">
	//   19   31:invokevirtual   #142 <Method Fragment FragmentManager.getFragment(Bundle, String)>
	//   20   34:astore          6
		obj = ((Object) (fragment));
	//   21   36:aload           6
	//   22   38:astore          5
		break MISSING_BLOCK_LABEL_45;
	//   23   40:goto            45
		Exception exception;
		exception;
	//   24   43:astore          6
		if(obj == null)
	//*  25   45:aload           5
	//*  26   47:ifnonnull       51
			return;
	//   27   50:return          
		if(((Fragment) (obj)).getView() != null)
	//*  28   51:aload           5
	//*  29   53:invokevirtual   #148 <Method View Fragment.getView()>
	//*  30   56:ifnull          89
		{
			arraymap.put(((Object) (((Fragment) (obj)).getView())), obj);
	//   31   59:aload_2         
	//   32   60:aload           5
	//   33   62:invokevirtual   #148 <Method View Fragment.getView()>
	//   34   65:aload           5
	//   35   67:invokevirtual   #152 <Method Object ArrayMap.put(Object, Object)>
	//   36   70:pop             
			if(android.os.Build.VERSION.SDK_INT >= 17)
	//*  37   71:getstatic       #104 <Field int android.os.Build$VERSION.SDK_INT>
	//*  38   74:bipush          17
	//*  39   76:icmplt          89
				findAllFragmentsWithViews(((Fragment) (obj)).getChildFragmentManager(), arraymap);
	//   40   79:aload_0         
	//   41   80:aload           5
	//   42   82:invokevirtual   #156 <Method FragmentManager Fragment.getChildFragmentManager()>
	//   43   85:aload_2         
	//   44   86:invokespecial   #158 <Method void findAllFragmentsWithViews(FragmentManager, ArrayMap)>
		}
		i = j;
	//   45   89:iload           4
	//   46   91:istore_3        
		if(true) goto _L2; else goto _L1
	//   47   92:goto            2
_L1:
	}

	private static void findAllSupportFragmentsWithViews(Collection collection, Map map)
	{
		if(collection == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		collection = ((Collection) (collection.iterator()));
	//    3    5:aload_0         
	//    4    6:invokeinterface #168 <Method Iterator Collection.iterator()>
	//    5   11:astore_0        
		do
		{
			if(!((Iterator) (collection)).hasNext())
				break;
	//    6   12:aload_0         
	//    7   13:invokeinterface #173 <Method boolean Iterator.hasNext()>
	//    8   18:ifeq            71
			android.support.v4.app.Fragment fragment = (android.support.v4.app.Fragment)((Iterator) (collection)).next();
	//    9   21:aload_0         
	//   10   22:invokeinterface #177 <Method Object Iterator.next()>
	//   11   27:checkcast       #179 <Class android.support.v4.app.Fragment>
	//   12   30:astore_2        
			if(fragment != null && fragment.getView() != null)
	//*  13   31:aload_2         
	//*  14   32:ifnull          12
	//*  15   35:aload_2         
	//*  16   36:invokevirtual   #180 <Method View android.support.v4.app.Fragment.getView()>
	//*  17   39:ifnonnull       45
	//*  18   42:goto            12
			{
				map.put(((Object) (fragment.getView())), ((Object) (fragment)));
	//   19   45:aload_1         
	//   20   46:aload_2         
	//   21   47:invokevirtual   #180 <Method View android.support.v4.app.Fragment.getView()>
	//   22   50:aload_2         
	//   23   51:invokeinterface #183 <Method Object Map.put(Object, Object)>
	//   24   56:pop             
				findAllSupportFragmentsWithViews(((Collection) (fragment.getChildFragmentManager().getFragments())), map);
	//   25   57:aload_2         
	//   26   58:invokevirtual   #186 <Method android.support.v4.app.FragmentManager android.support.v4.app.Fragment.getChildFragmentManager()>
	//   27   61:invokevirtual   #192 <Method java.util.List android.support.v4.app.FragmentManager.getFragments()>
	//   28   64:aload_1         
	//   29   65:invokestatic    #194 <Method void findAllSupportFragmentsWithViews(Collection, Map)>
			}
		} while(true);
	//   30   68:goto            12
	//   31   71:return          
	}

	private Fragment findFragment(View view, Activity activity)
	{
		tempViewToFragment.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field ArrayMap tempViewToFragment>
	//    2    4:invokevirtual   #200 <Method void ArrayMap.clear()>
		findAllFragmentsWithViews(activity.getFragmentManager(), tempViewToFragment);
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:invokevirtual   #203 <Method FragmentManager Activity.getFragmentManager()>
	//    6   12:aload_0         
	//    7   13:getfield        #73  <Field ArrayMap tempViewToFragment>
	//    8   16:invokespecial   #158 <Method void findAllFragmentsWithViews(FragmentManager, ArrayMap)>
		View view1 = null;
	//    9   19:aconst_null     
	//   10   20:astore_3        
		View view2 = activity.findViewById(0x1020002);
	//   11   21:aload_2         
	//   12   22:ldc1            #204 <Int 0x1020002>
	//   13   24:invokevirtual   #208 <Method View Activity.findViewById(int)>
	//   14   27:astore          4
		activity = ((Activity) (view));
	//   15   29:aload_1         
	//   16   30:astore_2        
		view = view1;
	//   17   31:aload_3         
	//   18   32:astore_1        
		do
		{
			view1 = view;
	//   19   33:aload_1         
	//   20   34:astore_3        
			if(((Object) (activity)).equals(((Object) (view2))))
				break;
	//   21   35:aload_2         
	//   22   36:aload           4
	//   23   38:invokevirtual   #212 <Method boolean Object.equals(Object)>
	//   24   41:ifne            88
			view = ((View) ((Fragment)tempViewToFragment.get(((Object) (activity)))));
	//   25   44:aload_0         
	//   26   45:getfield        #73  <Field ArrayMap tempViewToFragment>
	//   27   48:aload_2         
	//   28   49:invokevirtual   #216 <Method Object ArrayMap.get(Object)>
	//   29   52:checkcast       #144 <Class Fragment>
	//   30   55:astore_1        
			if(view != null)
	//*  31   56:aload_1         
	//*  32   57:ifnull          65
			{
				view1 = view;
	//   33   60:aload_1         
	//   34   61:astore_3        
				break;
	//   35   62:goto            88
			}
			view1 = view;
	//   36   65:aload_1         
	//   37   66:astore_3        
			if(!(((View) (activity)).getParent() instanceof View))
				break;
	//   38   67:aload_2         
	//   39   68:invokevirtual   #222 <Method android.view.ViewParent View.getParent()>
	//   40   71:instanceof      #218 <Class View>
	//   41   74:ifeq            88
			activity = ((Activity) ((View)((View) (activity)).getParent()));
	//   42   77:aload_2         
	//   43   78:invokevirtual   #222 <Method android.view.ViewParent View.getParent()>
	//   44   81:checkcast       #218 <Class View>
	//   45   84:astore_2        
		} while(true);
	//   46   85:goto            33
		tempViewToFragment.clear();
	//   47   88:aload_0         
	//   48   89:getfield        #73  <Field ArrayMap tempViewToFragment>
	//   49   92:invokevirtual   #200 <Method void ArrayMap.clear()>
		return ((Fragment) (view1));
	//   50   95:aload_3         
	//   51   96:areturn         
	}

	private android.support.v4.app.Fragment findSupportFragment(View view, FragmentActivity fragmentactivity)
	{
		tempViewToSupportFragment.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field ArrayMap tempViewToSupportFragment>
	//    2    4:invokevirtual   #200 <Method void ArrayMap.clear()>
		findAllSupportFragmentsWithViews(((Collection) (fragmentactivity.getSupportFragmentManager().getFragments())), ((Map) (tempViewToSupportFragment)));
	//    3    7:aload_2         
	//    4    8:invokevirtual   #229 <Method android.support.v4.app.FragmentManager FragmentActivity.getSupportFragmentManager()>
	//    5   11:invokevirtual   #192 <Method java.util.List android.support.v4.app.FragmentManager.getFragments()>
	//    6   14:aload_0         
	//    7   15:getfield        #71  <Field ArrayMap tempViewToSupportFragment>
	//    8   18:invokestatic    #194 <Method void findAllSupportFragmentsWithViews(Collection, Map)>
		View view1 = null;
	//    9   21:aconst_null     
	//   10   22:astore_3        
		View view2 = fragmentactivity.findViewById(0x1020002);
	//   11   23:aload_2         
	//   12   24:ldc1            #204 <Int 0x1020002>
	//   13   26:invokevirtual   #230 <Method View FragmentActivity.findViewById(int)>
	//   14   29:astore          4
		fragmentactivity = ((FragmentActivity) (view));
	//   15   31:aload_1         
	//   16   32:astore_2        
		view = view1;
	//   17   33:aload_3         
	//   18   34:astore_1        
		do
		{
			view1 = view;
	//   19   35:aload_1         
	//   20   36:astore_3        
			if(((Object) (fragmentactivity)).equals(((Object) (view2))))
				break;
	//   21   37:aload_2         
	//   22   38:aload           4
	//   23   40:invokevirtual   #212 <Method boolean Object.equals(Object)>
	//   24   43:ifne            90
			view = ((View) ((android.support.v4.app.Fragment)tempViewToSupportFragment.get(((Object) (fragmentactivity)))));
	//   25   46:aload_0         
	//   26   47:getfield        #71  <Field ArrayMap tempViewToSupportFragment>
	//   27   50:aload_2         
	//   28   51:invokevirtual   #216 <Method Object ArrayMap.get(Object)>
	//   29   54:checkcast       #179 <Class android.support.v4.app.Fragment>
	//   30   57:astore_1        
			if(view != null)
	//*  31   58:aload_1         
	//*  32   59:ifnull          67
			{
				view1 = view;
	//   33   62:aload_1         
	//   34   63:astore_3        
				break;
	//   35   64:goto            90
			}
			view1 = view;
	//   36   67:aload_1         
	//   37   68:astore_3        
			if(!(((View) (fragmentactivity)).getParent() instanceof View))
				break;
	//   38   69:aload_2         
	//   39   70:invokevirtual   #222 <Method android.view.ViewParent View.getParent()>
	//   40   73:instanceof      #218 <Class View>
	//   41   76:ifeq            90
			fragmentactivity = ((FragmentActivity) ((View)((View) (fragmentactivity)).getParent()));
	//   42   79:aload_2         
	//   43   80:invokevirtual   #222 <Method android.view.ViewParent View.getParent()>
	//   44   83:checkcast       #218 <Class View>
	//   45   86:astore_2        
		} while(true);
	//   46   87:goto            35
		tempViewToSupportFragment.clear();
	//   47   90:aload_0         
	//   48   91:getfield        #71  <Field ArrayMap tempViewToSupportFragment>
	//   49   94:invokevirtual   #200 <Method void ArrayMap.clear()>
		return ((android.support.v4.app.Fragment) (view1));
	//   50   97:aload_3         
	//   51   98:areturn         
	}

	private RequestManager fragmentGet(Context context, FragmentManager fragmentmanager, Fragment fragment)
	{
		RequestManagerFragment requestmanagerfragment = getRequestManagerFragment(fragmentmanager, fragment);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #236 <Method RequestManagerFragment getRequestManagerFragment(FragmentManager, Fragment)>
	//    4    6:astore          4
		fragment = ((Fragment) (requestmanagerfragment.getRequestManager()));
	//    5    8:aload           4
	//    6   10:invokevirtual   #242 <Method RequestManager RequestManagerFragment.getRequestManager()>
	//    7   13:astore_3        
		fragmentmanager = ((FragmentManager) (fragment));
	//    8   14:aload_3         
	//    9   15:astore_2        
		if(fragment == null)
	//*  10   16:aload_3         
	//*  11   17:ifnonnull       52
		{
			context = ((Context) (Glide.get(context)));
	//   12   20:aload_1         
	//   13   21:invokestatic    #247 <Method Glide Glide.get(Context)>
	//   14   24:astore_1        
			fragmentmanager = ((FragmentManager) (factory.build(((Glide) (context)), ((Lifecycle) (requestmanagerfragment.getGlideLifecycle())), requestmanagerfragment.getRequestManagerTreeNode())));
	//   15   25:aload_0         
	//   16   26:getfield        #80  <Field RequestManagerRetriever$RequestManagerFactory factory>
	//   17   29:aload_1         
	//   18   30:aload           4
	//   19   32:invokevirtual   #251 <Method ActivityFragmentLifecycle RequestManagerFragment.getGlideLifecycle()>
	//   20   35:aload           4
	//   21   37:invokevirtual   #255 <Method RequestManagerTreeNode RequestManagerFragment.getRequestManagerTreeNode()>
	//   22   40:invokeinterface #259 <Method RequestManager RequestManagerRetriever$RequestManagerFactory.build(Glide, Lifecycle, RequestManagerTreeNode)>
	//   23   45:astore_2        
			requestmanagerfragment.setRequestManager(((RequestManager) (fragmentmanager)));
	//   24   46:aload           4
	//   25   48:aload_2         
	//   26   49:invokevirtual   #263 <Method void RequestManagerFragment.setRequestManager(RequestManager)>
		}
		return ((RequestManager) (fragmentmanager));
	//   27   52:aload_2         
	//   28   53:areturn         
	}

	private RequestManager getApplicationManager(Context context)
	{
		if(applicationManager != null)
			break MISSING_BLOCK_LABEL_59;
	//    0    0:aload_0         
	//    1    1:getfield        #267 <Field RequestManager applicationManager>
	//    2    4:ifnonnull       59
		this;
	//    3    7:aload_0         
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		if(applicationManager == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #267 <Field RequestManager applicationManager>
	//*   7   13:ifnonnull       49
		{
			context = ((Context) (Glide.get(context)));
	//    8   16:aload_1         
	//    9   17:invokestatic    #247 <Method Glide Glide.get(Context)>
	//   10   20:astore_1        
			applicationManager = factory.build(((Glide) (context)), ((Lifecycle) (new ApplicationLifecycle())), ((RequestManagerTreeNode) (new EmptyRequestManagerTreeNode())));
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #80  <Field RequestManagerRetriever$RequestManagerFactory factory>
	//   14   26:aload_1         
	//   15   27:new             #269 <Class ApplicationLifecycle>
	//   16   30:dup             
	//   17   31:invokespecial   #270 <Method void ApplicationLifecycle()>
	//   18   34:new             #272 <Class EmptyRequestManagerTreeNode>
	//   19   37:dup             
	//   20   38:invokespecial   #273 <Method void EmptyRequestManagerTreeNode()>
	//   21   41:invokeinterface #259 <Method RequestManager RequestManagerRetriever$RequestManagerFactory.build(Glide, Lifecycle, RequestManagerTreeNode)>
	//   22   46:putfield        #267 <Field RequestManager applicationManager>
		}
		this;
	//   23   49:aload_0         
		JVM INSTR monitorexit ;
	//   24   50:monitorexit     
		break MISSING_BLOCK_LABEL_59;
	//   25   51:goto            59
		context;
	//   26   54:astore_1        
	//*  27   55:aload_0         
		throw context;
	//   28   56:monitorexit     
	//   29   57:aload_1         
	//   30   58:athrow          
		return applicationManager;
	//   31   59:aload_0         
	//   32   60:getfield        #267 <Field RequestManager applicationManager>
	//   33   63:areturn         
	}

	private RequestManager supportFragmentGet(Context context, android.support.v4.app.FragmentManager fragmentmanager, android.support.v4.app.Fragment fragment)
	{
		SupportRequestManagerFragment supportrequestmanagerfragment = getSupportRequestManagerFragment(fragmentmanager, fragment);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #279 <Method SupportRequestManagerFragment getSupportRequestManagerFragment(android.support.v4.app.FragmentManager, android.support.v4.app.Fragment)>
	//    4    6:astore          4
		fragment = ((android.support.v4.app.Fragment) (supportrequestmanagerfragment.getRequestManager()));
	//    5    8:aload           4
	//    6   10:invokevirtual   #282 <Method RequestManager SupportRequestManagerFragment.getRequestManager()>
	//    7   13:astore_3        
		fragmentmanager = ((android.support.v4.app.FragmentManager) (fragment));
	//    8   14:aload_3         
	//    9   15:astore_2        
		if(fragment == null)
	//*  10   16:aload_3         
	//*  11   17:ifnonnull       52
		{
			context = ((Context) (Glide.get(context)));
	//   12   20:aload_1         
	//   13   21:invokestatic    #247 <Method Glide Glide.get(Context)>
	//   14   24:astore_1        
			fragmentmanager = ((android.support.v4.app.FragmentManager) (factory.build(((Glide) (context)), ((Lifecycle) (supportrequestmanagerfragment.getGlideLifecycle())), supportrequestmanagerfragment.getRequestManagerTreeNode())));
	//   15   25:aload_0         
	//   16   26:getfield        #80  <Field RequestManagerRetriever$RequestManagerFactory factory>
	//   17   29:aload_1         
	//   18   30:aload           4
	//   19   32:invokevirtual   #283 <Method ActivityFragmentLifecycle SupportRequestManagerFragment.getGlideLifecycle()>
	//   20   35:aload           4
	//   21   37:invokevirtual   #284 <Method RequestManagerTreeNode SupportRequestManagerFragment.getRequestManagerTreeNode()>
	//   22   40:invokeinterface #259 <Method RequestManager RequestManagerRetriever$RequestManagerFactory.build(Glide, Lifecycle, RequestManagerTreeNode)>
	//   23   45:astore_2        
			supportrequestmanagerfragment.setRequestManager(((RequestManager) (fragmentmanager)));
	//   24   46:aload           4
	//   25   48:aload_2         
	//   26   49:invokevirtual   #285 <Method void SupportRequestManagerFragment.setRequestManager(RequestManager)>
		}
		return ((RequestManager) (fragmentmanager));
	//   27   52:aload_2         
	//   28   53:areturn         
	}

	public RequestManager get(Activity activity)
	{
		if(Util.isOnBackgroundThread())
	//*   0    0:invokestatic    #291 <Method boolean Util.isOnBackgroundThread()>
	//*   1    3:ifeq            15
		{
			return get(activity.getApplicationContext());
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:invokevirtual   #294 <Method Context Activity.getApplicationContext()>
	//    5   11:invokevirtual   #296 <Method RequestManager get(Context)>
	//    6   14:areturn         
		} else
		{
			assertNotDestroyed(activity);
	//    7   15:aload_1         
	//    8   16:invokestatic    #298 <Method void assertNotDestroyed(Activity)>
			return fragmentGet(((Context) (activity)), activity.getFragmentManager(), ((Fragment) (null)));
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #203 <Method FragmentManager Activity.getFragmentManager()>
	//   13   25:aconst_null     
	//   14   26:invokespecial   #300 <Method RequestManager fragmentGet(Context, FragmentManager, Fragment)>
	//   15   29:areturn         
		}
	}

	public RequestManager get(Fragment fragment)
	{
		if(fragment.getActivity() == null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #305 <Method Activity Fragment.getActivity()>
	//*   2    4:ifnonnull       18
			throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
	//    3    7:new             #112 <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc2            #307 <String "You cannot start a load on a fragment before it is attached">
	//    6   14:invokespecial   #117 <Method void IllegalArgumentException(String)>
	//    7   17:athrow          
		if(Util.isOnBackgroundThread() || android.os.Build.VERSION.SDK_INT < 17)
	//*   8   18:invokestatic    #291 <Method boolean Util.isOnBackgroundThread()>
	//*   9   21:ifne            32
	//*  10   24:getstatic       #104 <Field int android.os.Build$VERSION.SDK_INT>
	//*  11   27:bipush          17
	//*  12   29:icmpge          44
		{
			return get(fragment.getActivity().getApplicationContext());
	//   13   32:aload_0         
	//   14   33:aload_1         
	//   15   34:invokevirtual   #305 <Method Activity Fragment.getActivity()>
	//   16   37:invokevirtual   #294 <Method Context Activity.getApplicationContext()>
	//   17   40:invokevirtual   #296 <Method RequestManager get(Context)>
	//   18   43:areturn         
		} else
		{
			FragmentManager fragmentmanager = fragment.getChildFragmentManager();
	//   19   44:aload_1         
	//   20   45:invokevirtual   #156 <Method FragmentManager Fragment.getChildFragmentManager()>
	//   21   48:astore_2        
			return fragmentGet(((Context) (fragment.getActivity())), fragmentmanager, fragment);
	//   22   49:aload_0         
	//   23   50:aload_1         
	//   24   51:invokevirtual   #305 <Method Activity Fragment.getActivity()>
	//   25   54:aload_2         
	//   26   55:aload_1         
	//   27   56:invokespecial   #300 <Method RequestManager fragmentGet(Context, FragmentManager, Fragment)>
	//   28   59:areturn         
		}
	}

	public RequestManager get(Context context)
	{
		if(context == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("You cannot start a load on a null Context");
	//    2    4:new             #112 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #309 <String "You cannot start a load on a null Context">
	//    5   11:invokespecial   #117 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		if(Util.isOnMainThread() && !(context instanceof Application))
	//*   7   15:invokestatic    #312 <Method boolean Util.isOnMainThread()>
	//*   8   18:ifeq            79
	//*   9   21:aload_1         
	//*  10   22:instanceof      #314 <Class Application>
	//*  11   25:ifne            79
		{
			if(context instanceof FragmentActivity)
	//*  12   28:aload_1         
	//*  13   29:instanceof      #226 <Class FragmentActivity>
	//*  14   32:ifeq            44
				return get((FragmentActivity)context);
	//   15   35:aload_0         
	//   16   36:aload_1         
	//   17   37:checkcast       #226 <Class FragmentActivity>
	//   18   40:invokevirtual   #317 <Method RequestManager get(FragmentActivity)>
	//   19   43:areturn         
			if(context instanceof Activity)
	//*  20   44:aload_1         
	//*  21   45:instanceof      #106 <Class Activity>
	//*  22   48:ifeq            60
				return get((Activity)context);
	//   23   51:aload_0         
	//   24   52:aload_1         
	//   25   53:checkcast       #106 <Class Activity>
	//   26   56:invokevirtual   #319 <Method RequestManager get(Activity)>
	//   27   59:areturn         
			if(context instanceof ContextWrapper)
	//*  28   60:aload_1         
	//*  29   61:instanceof      #122 <Class ContextWrapper>
	//*  30   64:ifeq            79
				return get(((ContextWrapper)context).getBaseContext());
	//   31   67:aload_0         
	//   32   68:aload_1         
	//   33   69:checkcast       #122 <Class ContextWrapper>
	//   34   72:invokevirtual   #126 <Method Context ContextWrapper.getBaseContext()>
	//   35   75:invokevirtual   #296 <Method RequestManager get(Context)>
	//   36   78:areturn         
		}
		return getApplicationManager(context);
	//   37   79:aload_0         
	//   38   80:aload_1         
	//   39   81:invokespecial   #321 <Method RequestManager getApplicationManager(Context)>
	//   40   84:areturn         
	}

	public RequestManager get(android.support.v4.app.Fragment fragment)
	{
		Preconditions.checkNotNull(((Object) (fragment.getActivity())), "You cannot start a load on a fragment before it is attached or after it is destroyed");
	//    0    0:aload_1         
	//    1    1:invokevirtual   #325 <Method FragmentActivity android.support.v4.app.Fragment.getActivity()>
	//    2    4:ldc2            #327 <String "You cannot start a load on a fragment before it is attached or after it is destroyed">
	//    3    7:invokestatic    #333 <Method Object Preconditions.checkNotNull(Object, String)>
	//    4   10:pop             
		if(Util.isOnBackgroundThread())
	//*   5   11:invokestatic    #291 <Method boolean Util.isOnBackgroundThread()>
	//*   6   14:ifeq            29
		{
			return get(fragment.getActivity().getApplicationContext());
	//    7   17:aload_0         
	//    8   18:aload_1         
	//    9   19:invokevirtual   #325 <Method FragmentActivity android.support.v4.app.Fragment.getActivity()>
	//   10   22:invokevirtual   #334 <Method Context FragmentActivity.getApplicationContext()>
	//   11   25:invokevirtual   #296 <Method RequestManager get(Context)>
	//   12   28:areturn         
		} else
		{
			android.support.v4.app.FragmentManager fragmentmanager = fragment.getChildFragmentManager();
	//   13   29:aload_1         
	//   14   30:invokevirtual   #186 <Method android.support.v4.app.FragmentManager android.support.v4.app.Fragment.getChildFragmentManager()>
	//   15   33:astore_2        
			return supportFragmentGet(((Context) (fragment.getActivity())), fragmentmanager, fragment);
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:invokevirtual   #325 <Method FragmentActivity android.support.v4.app.Fragment.getActivity()>
	//   19   39:aload_2         
	//   20   40:aload_1         
	//   21   41:invokespecial   #336 <Method RequestManager supportFragmentGet(Context, android.support.v4.app.FragmentManager, android.support.v4.app.Fragment)>
	//   22   44:areturn         
		}
	}

	public RequestManager get(FragmentActivity fragmentactivity)
	{
		if(Util.isOnBackgroundThread())
	//*   0    0:invokestatic    #291 <Method boolean Util.isOnBackgroundThread()>
	//*   1    3:ifeq            15
		{
			return get(fragmentactivity.getApplicationContext());
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:invokevirtual   #334 <Method Context FragmentActivity.getApplicationContext()>
	//    5   11:invokevirtual   #296 <Method RequestManager get(Context)>
	//    6   14:areturn         
		} else
		{
			assertNotDestroyed(((Activity) (fragmentactivity)));
	//    7   15:aload_1         
	//    8   16:invokestatic    #298 <Method void assertNotDestroyed(Activity)>
			return supportFragmentGet(((Context) (fragmentactivity)), fragmentactivity.getSupportFragmentManager(), ((android.support.v4.app.Fragment) (null)));
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #229 <Method android.support.v4.app.FragmentManager FragmentActivity.getSupportFragmentManager()>
	//   13   25:aconst_null     
	//   14   26:invokespecial   #336 <Method RequestManager supportFragmentGet(Context, android.support.v4.app.FragmentManager, android.support.v4.app.Fragment)>
	//   15   29:areturn         
		}
	}

	public RequestManager get(View view)
	{
		if(Util.isOnBackgroundThread())
	//*   0    0:invokestatic    #291 <Method boolean Util.isOnBackgroundThread()>
	//*   1    3:ifeq            18
			return get(view.getContext().getApplicationContext());
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:invokevirtual   #340 <Method Context View.getContext()>
	//    5   11:invokevirtual   #343 <Method Context Context.getApplicationContext()>
	//    6   14:invokevirtual   #296 <Method RequestManager get(Context)>
	//    7   17:areturn         
		Preconditions.checkNotNull(((Object) (view)));
	//    8   18:aload_1         
	//    9   19:invokestatic    #345 <Method Object Preconditions.checkNotNull(Object)>
	//   10   22:pop             
		Preconditions.checkNotNull(((Object) (view.getContext())), "Unable to obtain a request manager for a view without a Context");
	//   11   23:aload_1         
	//   12   24:invokevirtual   #340 <Method Context View.getContext()>
	//   13   27:ldc2            #347 <String "Unable to obtain a request manager for a view without a Context">
	//   14   30:invokestatic    #333 <Method Object Preconditions.checkNotNull(Object, String)>
	//   15   33:pop             
		Activity activity = findActivity(view.getContext());
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:invokevirtual   #340 <Method Context View.getContext()>
	//   19   39:invokespecial   #128 <Method Activity findActivity(Context)>
	//   20   42:astore_2        
		if(activity == null)
	//*  21   43:aload_2         
	//*  22   44:ifnonnull       59
			return get(view.getContext().getApplicationContext());
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:invokevirtual   #340 <Method Context View.getContext()>
	//   26   52:invokevirtual   #343 <Method Context Context.getApplicationContext()>
	//   27   55:invokevirtual   #296 <Method RequestManager get(Context)>
	//   28   58:areturn         
		if(activity instanceof FragmentActivity)
	//*  29   59:aload_2         
	//*  30   60:instanceof      #226 <Class FragmentActivity>
	//*  31   63:ifeq            92
		{
			view = ((View) (findSupportFragment(view, (FragmentActivity)activity)));
	//   32   66:aload_0         
	//   33   67:aload_1         
	//   34   68:aload_2         
	//   35   69:checkcast       #226 <Class FragmentActivity>
	//   36   72:invokespecial   #349 <Method android.support.v4.app.Fragment findSupportFragment(View, FragmentActivity)>
	//   37   75:astore_1        
			if(view == null)
	//*  38   76:aload_1         
	//*  39   77:ifnonnull       86
				return get(activity);
	//   40   80:aload_0         
	//   41   81:aload_2         
	//   42   82:invokevirtual   #319 <Method RequestManager get(Activity)>
	//   43   85:areturn         
			else
				return get(((android.support.v4.app.Fragment) (view)));
	//   44   86:aload_0         
	//   45   87:aload_1         
	//   46   88:invokevirtual   #351 <Method RequestManager get(android.support.v4.app.Fragment)>
	//   47   91:areturn         
		}
		view = ((View) (findFragment(view, activity)));
	//   48   92:aload_0         
	//   49   93:aload_1         
	//   50   94:aload_2         
	//   51   95:invokespecial   #353 <Method Fragment findFragment(View, Activity)>
	//   52   98:astore_1        
		if(view == null)
	//*  53   99:aload_1         
	//*  54  100:ifnonnull       109
			return get(activity);
	//   55  103:aload_0         
	//   56  104:aload_2         
	//   57  105:invokevirtual   #319 <Method RequestManager get(Activity)>
	//   58  108:areturn         
		else
			return get(((Fragment) (view)));
	//   59  109:aload_0         
	//   60  110:aload_1         
	//   61  111:invokevirtual   #355 <Method RequestManager get(Fragment)>
	//   62  114:areturn         
	}

	RequestManagerFragment getRequestManagerFragment(FragmentManager fragmentmanager, Fragment fragment)
	{
		RequestManagerFragment requestmanagerfragment1 = (RequestManagerFragment)fragmentmanager.findFragmentByTag("com.bumptech.glide.manager");
	//    0    0:aload_1         
	//    1    1:ldc1            #23  <String "com.bumptech.glide.manager">
	//    2    3:invokevirtual   #359 <Method Fragment FragmentManager.findFragmentByTag(String)>
	//    3    6:checkcast       #238 <Class RequestManagerFragment>
	//    4    9:astore          4
		RequestManagerFragment requestmanagerfragment = requestmanagerfragment1;
	//    5   11:aload           4
	//    6   13:astore_3        
		if(requestmanagerfragment1 == null)
	//*   7   14:aload           4
	//*   8   16:ifnonnull       93
		{
			RequestManagerFragment requestmanagerfragment2 = (RequestManagerFragment)pendingRequestManagerFragments.get(((Object) (fragmentmanager)));
	//    9   19:aload_0         
	//   10   20:getfield        #64  <Field Map pendingRequestManagerFragments>
	//   11   23:aload_1         
	//   12   24:invokeinterface #360 <Method Object Map.get(Object)>
	//   13   29:checkcast       #238 <Class RequestManagerFragment>
	//   14   32:astore          4
			requestmanagerfragment = requestmanagerfragment2;
	//   15   34:aload           4
	//   16   36:astore_3        
			if(requestmanagerfragment2 == null)
	//*  17   37:aload           4
	//*  18   39:ifnonnull       93
			{
				requestmanagerfragment = new RequestManagerFragment();
	//   19   42:new             #238 <Class RequestManagerFragment>
	//   20   45:dup             
	//   21   46:invokespecial   #361 <Method void RequestManagerFragment()>
	//   22   49:astore_3        
				requestmanagerfragment.setParentFragmentHint(fragment);
	//   23   50:aload_3         
	//   24   51:aload_2         
	//   25   52:invokevirtual   #365 <Method void RequestManagerFragment.setParentFragmentHint(Fragment)>
				pendingRequestManagerFragments.put(((Object) (fragmentmanager)), ((Object) (requestmanagerfragment)));
	//   26   55:aload_0         
	//   27   56:getfield        #64  <Field Map pendingRequestManagerFragments>
	//   28   59:aload_1         
	//   29   60:aload_3         
	//   30   61:invokeinterface #183 <Method Object Map.put(Object, Object)>
	//   31   66:pop             
				fragmentmanager.beginTransaction().add(((Fragment) (requestmanagerfragment)), "com.bumptech.glide.manager").commitAllowingStateLoss();
	//   32   67:aload_1         
	//   33   68:invokevirtual   #369 <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   34   71:aload_3         
	//   35   72:ldc1            #23  <String "com.bumptech.glide.manager">
	//   36   74:invokevirtual   #375 <Method FragmentTransaction FragmentTransaction.add(Fragment, String)>
	//   37   77:invokevirtual   #379 <Method int FragmentTransaction.commitAllowingStateLoss()>
	//   38   80:pop             
				handler.obtainMessage(1, ((Object) (fragmentmanager))).sendToTarget();
	//   39   81:aload_0         
	//   40   82:getfield        #93  <Field Handler handler>
	//   41   85:iconst_1        
	//   42   86:aload_1         
	//   43   87:invokevirtual   #383 <Method Message Handler.obtainMessage(int, Object)>
	//   44   90:invokevirtual   #388 <Method void Message.sendToTarget()>
			}
		}
		return requestmanagerfragment;
	//   45   93:aload_3         
	//   46   94:areturn         
	}

	SupportRequestManagerFragment getSupportRequestManagerFragment(android.support.v4.app.FragmentManager fragmentmanager, android.support.v4.app.Fragment fragment)
	{
		SupportRequestManagerFragment supportrequestmanagerfragment1 = (SupportRequestManagerFragment)fragmentmanager.findFragmentByTag("com.bumptech.glide.manager");
	//    0    0:aload_1         
	//    1    1:ldc1            #23  <String "com.bumptech.glide.manager">
	//    2    3:invokevirtual   #391 <Method android.support.v4.app.Fragment android.support.v4.app.FragmentManager.findFragmentByTag(String)>
	//    3    6:checkcast       #281 <Class SupportRequestManagerFragment>
	//    4    9:astore          4
		SupportRequestManagerFragment supportrequestmanagerfragment = supportrequestmanagerfragment1;
	//    5   11:aload           4
	//    6   13:astore_3        
		if(supportrequestmanagerfragment1 == null)
	//*   7   14:aload           4
	//*   8   16:ifnonnull       93
		{
			SupportRequestManagerFragment supportrequestmanagerfragment2 = (SupportRequestManagerFragment)pendingSupportRequestManagerFragments.get(((Object) (fragmentmanager)));
	//    9   19:aload_0         
	//   10   20:getfield        #66  <Field Map pendingSupportRequestManagerFragments>
	//   11   23:aload_1         
	//   12   24:invokeinterface #360 <Method Object Map.get(Object)>
	//   13   29:checkcast       #281 <Class SupportRequestManagerFragment>
	//   14   32:astore          4
			supportrequestmanagerfragment = supportrequestmanagerfragment2;
	//   15   34:aload           4
	//   16   36:astore_3        
			if(supportrequestmanagerfragment2 == null)
	//*  17   37:aload           4
	//*  18   39:ifnonnull       93
			{
				supportrequestmanagerfragment = new SupportRequestManagerFragment();
	//   19   42:new             #281 <Class SupportRequestManagerFragment>
	//   20   45:dup             
	//   21   46:invokespecial   #392 <Method void SupportRequestManagerFragment()>
	//   22   49:astore_3        
				supportrequestmanagerfragment.setParentFragmentHint(fragment);
	//   23   50:aload_3         
	//   24   51:aload_2         
	//   25   52:invokevirtual   #395 <Method void SupportRequestManagerFragment.setParentFragmentHint(android.support.v4.app.Fragment)>
				pendingSupportRequestManagerFragments.put(((Object) (fragmentmanager)), ((Object) (supportrequestmanagerfragment)));
	//   26   55:aload_0         
	//   27   56:getfield        #66  <Field Map pendingSupportRequestManagerFragments>
	//   28   59:aload_1         
	//   29   60:aload_3         
	//   30   61:invokeinterface #183 <Method Object Map.put(Object, Object)>
	//   31   66:pop             
				fragmentmanager.beginTransaction().add(((android.support.v4.app.Fragment) (supportrequestmanagerfragment)), "com.bumptech.glide.manager").commitAllowingStateLoss();
	//   32   67:aload_1         
	//   33   68:invokevirtual   #398 <Method android.support.v4.app.FragmentTransaction android.support.v4.app.FragmentManager.beginTransaction()>
	//   34   71:aload_3         
	//   35   72:ldc1            #23  <String "com.bumptech.glide.manager">
	//   36   74:invokevirtual   #403 <Method android.support.v4.app.FragmentTransaction android.support.v4.app.FragmentTransaction.add(android.support.v4.app.Fragment, String)>
	//   37   77:invokevirtual   #404 <Method int android.support.v4.app.FragmentTransaction.commitAllowingStateLoss()>
	//   38   80:pop             
				handler.obtainMessage(2, ((Object) (fragmentmanager))).sendToTarget();
	//   39   81:aload_0         
	//   40   82:getfield        #93  <Field Handler handler>
	//   41   85:iconst_2        
	//   42   86:aload_1         
	//   43   87:invokevirtual   #383 <Method Message Handler.obtainMessage(int, Object)>
	//   44   90:invokevirtual   #388 <Method void Message.sendToTarget()>
			}
		}
		return supportrequestmanagerfragment;
	//   45   93:aload_3         
	//   46   94:areturn         
	}

	public boolean handleMessage(Message message)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		Object obj = null;
	//    2    2:aconst_null     
	//    3    3:astore          4
		Message message1 = null;
	//    4    5:aconst_null     
	//    5    6:astore_3        
		switch(message.what)
	//*   6    7:aload_1         
	//*   7    8:getfield        #409 <Field int Message.what>
		{
	//*   8   11:lookupswitch    2: default 36
	//	               1: 39
	//	               2: 63
	//*   9   36:goto            87
		case 1: // '\001'
			message = ((Message) ((FragmentManager)message.obj));
	//   10   39:aload_1         
	//   11   40:getfield        #413 <Field Object Message.obj>
	//   12   43:checkcast       #138 <Class FragmentManager>
	//   13   46:astore_1        
			message1 = message;
	//   14   47:aload_1         
	//   15   48:astore_3        
			message = ((Message) (pendingRequestManagerFragments.remove(((Object) (message)))));
	//   16   49:aload_0         
	//   17   50:getfield        #64  <Field Map pendingRequestManagerFragments>
	//   18   53:aload_1         
	//   19   54:invokeinterface #416 <Method Object Map.remove(Object)>
	//   20   59:astore_1        
			break;

	//*  21   60:goto            92
		case 2: // '\002'
			message = ((Message) ((android.support.v4.app.FragmentManager)message.obj));
	//   22   63:aload_1         
	//   23   64:getfield        #413 <Field Object Message.obj>
	//   24   67:checkcast       #188 <Class android.support.v4.app.FragmentManager>
	//   25   70:astore_1        
			message1 = message;
	//   26   71:aload_1         
	//   27   72:astore_3        
			message = ((Message) (pendingSupportRequestManagerFragments.remove(((Object) (message)))));
	//   28   73:aload_0         
	//   29   74:getfield        #66  <Field Map pendingSupportRequestManagerFragments>
	//   30   77:aload_1         
	//   31   78:invokeinterface #416 <Method Object Map.remove(Object)>
	//   32   83:astore_1        
			break;

	//*  33   84:goto            92
		default:
			flag = false;
	//   34   87:iconst_0        
	//   35   88:istore_2        
			message = ((Message) (obj));
	//   36   89:aload           4
	//   37   91:astore_1        
			break;
		}
		if(flag && message == null && Log.isLoggable("RMRetriever", 5))
	//*  38   92:iload_2         
	//*  39   93:ifeq            135
	//*  40   96:aload_1         
	//*  41   97:ifnonnull       135
	//*  42  100:ldc1            #31  <String "RMRetriever">
	//*  43  102:iconst_5        
	//*  44  103:invokestatic    #422 <Method boolean Log.isLoggable(String, int)>
	//*  45  106:ifeq            135
			Log.w("RMRetriever", (new StringBuilder()).append("Failed to remove expected request manager fragment, manager: ").append(((Object) (message1))).toString());
	//   46  109:ldc1            #31  <String "RMRetriever">
	//   47  111:new             #424 <Class StringBuilder>
	//   48  114:dup             
	//   49  115:invokespecial   #425 <Method void StringBuilder()>
	//   50  118:ldc2            #427 <String "Failed to remove expected request manager fragment, manager: ">
	//   51  121:invokevirtual   #431 <Method StringBuilder StringBuilder.append(String)>
	//   52  124:aload_3         
	//   53  125:invokevirtual   #434 <Method StringBuilder StringBuilder.append(Object)>
	//   54  128:invokevirtual   #438 <Method String StringBuilder.toString()>
	//   55  131:invokestatic    #442 <Method int Log.w(String, String)>
	//   56  134:pop             
		return flag;
	//   57  135:iload_2         
	//   58  136:ireturn         
	}

	private static final RequestManagerFactory DEFAULT_FACTORY = new RequestManagerFactory() {

		public RequestManager build(Glide glide, Lifecycle lifecycle, RequestManagerTreeNode requestmanagertreenode)
		{
			return new RequestManager(glide, lifecycle, requestmanagertreenode);
		//    0    0:new             #17  <Class RequestManager>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokespecial   #20  <Method void RequestManager(Glide, Lifecycle, RequestManagerTreeNode)>
		//    6   10:areturn         
		}

	}
;
	private static final String FRAGMENT_INDEX_KEY = "key";
	private static final String FRAGMENT_MANAGER_GET_FRAGMENT_KEY = "i";
	static final String FRAGMENT_TAG = "com.bumptech.glide.manager";
	private static final int ID_REMOVE_FRAGMENT_MANAGER = 1;
	private static final int ID_REMOVE_SUPPORT_FRAGMENT_MANAGER = 2;
	private static final String TAG = "RMRetriever";
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
	//    2    4:invokespecial   #53  <Method void RequestManagerRetriever$1()>
	//    3    7:putstatic       #55  <Field RequestManagerRetriever$RequestManagerFactory DEFAULT_FACTORY>
	//*   4   10:return          
	}
}
