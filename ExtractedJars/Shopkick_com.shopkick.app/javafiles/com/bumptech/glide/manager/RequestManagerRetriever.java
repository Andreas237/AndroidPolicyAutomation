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
import java.util.List;
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
	//    1    1:invokespecial   #57  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #59  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #60  <Method void HashMap()>
	//    6   12:putfield        #62  <Field Map pendingRequestManagerFragments>
	//    7   15:aload_0         
	//    8   16:new             #59  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #60  <Method void HashMap()>
	//   11   23:putfield        #64  <Field Map pendingSupportRequestManagerFragments>
	//   12   26:aload_0         
	//   13   27:new             #66  <Class ArrayMap>
	//   14   30:dup             
	//   15   31:invokespecial   #67  <Method void ArrayMap()>
	//   16   34:putfield        #69  <Field ArrayMap tempViewToSupportFragment>
	//   17   37:aload_0         
	//   18   38:new             #66  <Class ArrayMap>
	//   19   41:dup             
	//   20   42:invokespecial   #67  <Method void ArrayMap()>
	//   21   45:putfield        #71  <Field ArrayMap tempViewToFragment>
	//   22   48:aload_0         
	//   23   49:new             #73  <Class Bundle>
	//   24   52:dup             
	//   25   53:invokespecial   #74  <Method void Bundle()>
	//   26   56:putfield        #76  <Field Bundle tempBundle>
		if(requestmanagerfactory == null)
	//*  27   59:aload_1         
	//*  28   60:ifnull          66
	//*  29   63:goto            70
			requestmanagerfactory = DEFAULT_FACTORY;
	//   30   66:getstatic       #53  <Field RequestManagerRetriever$RequestManagerFactory DEFAULT_FACTORY>
	//   31   69:astore_1        
		factory = requestmanagerfactory;
	//   32   70:aload_0         
	//   33   71:aload_1         
	//   34   72:putfield        #78  <Field RequestManagerRetriever$RequestManagerFactory factory>
	//   35   75:aload_0         
	//   36   76:new             #80  <Class Handler>
	//   37   79:dup             
	//   38   80:invokestatic    #86  <Method Looper Looper.getMainLooper()>
	//   39   83:aload_0         
	//   40   84:invokespecial   #89  <Method void Handler(Looper, android.os.Handler$Callback)>
	//   41   87:putfield        #91  <Field Handler handler>
	//   42   90:return          
	}

	private static void assertNotDestroyed(Activity activity)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #103 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          26
		{
			if(!activity.isDestroyed())
	//*   3    8:aload_0         
	//*   4    9:invokevirtual   #109 <Method boolean Activity.isDestroyed()>
	//*   5   12:ifne            16
				return;
	//    6   15:return          
			else
				throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
	//    7   16:new             #111 <Class IllegalArgumentException>
	//    8   19:dup             
	//    9   20:ldc1            #113 <String "You cannot start a load for a destroyed activity">
	//   10   22:invokespecial   #116 <Method void IllegalArgumentException(String)>
	//   11   25:athrow          
		} else
		{
			return;
	//   12   26:return          
		}
	}

	private Activity findActivity(Context context)
	{
		if(context instanceof Activity)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #105 <Class Activity>
	//*   2    4:ifeq            12
			return (Activity)context;
	//    3    7:aload_1         
	//    4    8:checkcast       #105 <Class Activity>
	//    5   11:areturn         
		if(context instanceof ContextWrapper)
	//*   6   12:aload_1         
	//*   7   13:instanceof      #121 <Class ContextWrapper>
	//*   8   16:ifeq            31
			return findActivity(((ContextWrapper)context).getBaseContext());
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:checkcast       #121 <Class ContextWrapper>
	//   12   24:invokevirtual   #125 <Method Context ContextWrapper.getBaseContext()>
	//   13   27:invokespecial   #127 <Method Activity findActivity(Context)>
	//   14   30:areturn         
		else
			return null;
	//   15   31:aconst_null     
	//   16   32:areturn         
	}

	private void findAllFragmentsWithViews(FragmentManager fragmentmanager, ArrayMap arraymap)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #103 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          66
		{
			fragmentmanager = ((FragmentManager) (fragmentmanager.getFragments().iterator()));
	//    3    8:aload_1         
	//    4    9:invokevirtual   #137 <Method List FragmentManager.getFragments()>
	//    5   12:invokeinterface #143 <Method Iterator List.iterator()>
	//    6   17:astore_1        
			do
			{
				if(!((Iterator) (fragmentmanager)).hasNext())
					break;
	//    7   18:aload_1         
	//    8   19:invokeinterface #148 <Method boolean Iterator.hasNext()>
	//    9   24:ifeq            72
				Fragment fragment = (Fragment)((Iterator) (fragmentmanager)).next();
	//   10   27:aload_1         
	//   11   28:invokeinterface #152 <Method Object Iterator.next()>
	//   12   33:checkcast       #154 <Class Fragment>
	//   13   36:astore_3        
				if(fragment.getView() != null)
	//*  14   37:aload_3         
	//*  15   38:invokevirtual   #158 <Method View Fragment.getView()>
	//*  16   41:ifnull          18
				{
					arraymap.put(((Object) (fragment.getView())), ((Object) (fragment)));
	//   17   44:aload_2         
	//   18   45:aload_3         
	//   19   46:invokevirtual   #158 <Method View Fragment.getView()>
	//   20   49:aload_3         
	//   21   50:invokevirtual   #162 <Method Object ArrayMap.put(Object, Object)>
	//   22   53:pop             
					findAllFragmentsWithViews(fragment.getChildFragmentManager(), arraymap);
	//   23   54:aload_0         
	//   24   55:aload_3         
	//   25   56:invokevirtual   #166 <Method FragmentManager Fragment.getChildFragmentManager()>
	//   26   59:aload_2         
	//   27   60:invokespecial   #168 <Method void findAllFragmentsWithViews(FragmentManager, ArrayMap)>
				}
			} while(true);
	//   28   63:goto            18
		} else
		{
			findAllFragmentsWithViewsPreO(fragmentmanager, arraymap);
	//   29   66:aload_0         
	//   30   67:aload_1         
	//   31   68:aload_2         
	//   32   69:invokespecial   #171 <Method void findAllFragmentsWithViewsPreO(FragmentManager, ArrayMap)>
		}
	//   33   72:return          
	}

	private void findAllFragmentsWithViewsPreO(FragmentManager fragmentmanager, ArrayMap arraymap)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
_L2:
		Fragment fragment;
		tempBundle.putInt("key", i);
	//    2    2:aload_0         
	//    3    3:getfield        #76  <Field Bundle tempBundle>
	//    4    6:ldc1            #17  <String "key">
	//    5    8:iload_3         
	//    6    9:invokevirtual   #180 <Method void Bundle.putInt(String, int)>
		fragment = null;
	//    7   12:aconst_null     
	//    8   13:astore          4
		Fragment fragment1 = fragmentmanager.getFragment(tempBundle, "key");
	//    9   15:aload_1         
	//   10   16:aload_0         
	//   11   17:getfield        #76  <Field Bundle tempBundle>
	//   12   20:ldc1            #17  <String "key">
	//   13   22:invokevirtual   #184 <Method Fragment FragmentManager.getFragment(Bundle, String)>
	//   14   25:astore          5
		fragment = fragment1;
	//   15   27:aload           5
	//   16   29:astore          4
_L3:
		if(fragment == null)
	//*  17   31:aload           4
	//*  18   33:ifnonnull       37
			return;
	//   19   36:return          
		if(fragment.getView() != null)
	//*  20   37:aload           4
	//*  21   39:invokevirtual   #158 <Method View Fragment.getView()>
	//*  22   42:ifnull          75
		{
			arraymap.put(((Object) (fragment.getView())), ((Object) (fragment)));
	//   23   45:aload_2         
	//   24   46:aload           4
	//   25   48:invokevirtual   #158 <Method View Fragment.getView()>
	//   26   51:aload           4
	//   27   53:invokevirtual   #162 <Method Object ArrayMap.put(Object, Object)>
	//   28   56:pop             
			if(android.os.Build.VERSION.SDK_INT >= 17)
	//*  29   57:getstatic       #103 <Field int android.os.Build$VERSION.SDK_INT>
	//*  30   60:bipush          17
	//*  31   62:icmplt          75
				findAllFragmentsWithViews(fragment.getChildFragmentManager(), arraymap);
	//   32   65:aload_0         
	//   33   66:aload           4
	//   34   68:invokevirtual   #166 <Method FragmentManager Fragment.getChildFragmentManager()>
	//   35   71:aload_2         
	//   36   72:invokespecial   #168 <Method void findAllFragmentsWithViews(FragmentManager, ArrayMap)>
		}
		i++;
	//   37   75:iload_3         
	//   38   76:iconst_1        
	//   39   77:iadd            
	//   40   78:istore_3        
		if(true) goto _L2; else goto _L1
	//   41   79:goto            2
_L1:
		Exception exception;
		exception;
	//   42   82:astore          5
		  goto _L3
	//*  43   84:goto            31
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
	//    4    6:invokeinterface #189 <Method Iterator Collection.iterator()>
	//    5   11:astore_0        
		do
		{
			if(!((Iterator) (collection)).hasNext())
				break;
	//    6   12:aload_0         
	//    7   13:invokeinterface #148 <Method boolean Iterator.hasNext()>
	//    8   18:ifeq            71
			android.support.v4.app.Fragment fragment = (android.support.v4.app.Fragment)((Iterator) (collection)).next();
	//    9   21:aload_0         
	//   10   22:invokeinterface #152 <Method Object Iterator.next()>
	//   11   27:checkcast       #191 <Class android.support.v4.app.Fragment>
	//   12   30:astore_2        
			if(fragment != null && fragment.getView() != null)
	//*  13   31:aload_2         
	//*  14   32:ifnull          12
	//*  15   35:aload_2         
	//*  16   36:invokevirtual   #192 <Method View android.support.v4.app.Fragment.getView()>
	//*  17   39:ifnonnull       45
	//*  18   42:goto            12
			{
				map.put(((Object) (fragment.getView())), ((Object) (fragment)));
	//   19   45:aload_1         
	//   20   46:aload_2         
	//   21   47:invokevirtual   #192 <Method View android.support.v4.app.Fragment.getView()>
	//   22   50:aload_2         
	//   23   51:invokeinterface #195 <Method Object Map.put(Object, Object)>
	//   24   56:pop             
				findAllSupportFragmentsWithViews(((Collection) (fragment.getChildFragmentManager().getFragments())), map);
	//   25   57:aload_2         
	//   26   58:invokevirtual   #198 <Method android.support.v4.app.FragmentManager android.support.v4.app.Fragment.getChildFragmentManager()>
	//   27   61:invokevirtual   #201 <Method List android.support.v4.app.FragmentManager.getFragments()>
	//   28   64:aload_1         
	//   29   65:invokestatic    #203 <Method void findAllSupportFragmentsWithViews(Collection, Map)>
			}
		} while(true);
	//   30   68:goto            12
	//   31   71:return          
	}

	private Fragment findFragment(View view, Activity activity)
	{
		tempViewToFragment.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field ArrayMap tempViewToFragment>
	//    2    4:invokevirtual   #209 <Method void ArrayMap.clear()>
		findAllFragmentsWithViews(activity.getFragmentManager(), tempViewToFragment);
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:invokevirtual   #212 <Method FragmentManager Activity.getFragmentManager()>
	//    6   12:aload_0         
	//    7   13:getfield        #71  <Field ArrayMap tempViewToFragment>
	//    8   16:invokespecial   #168 <Method void findAllFragmentsWithViews(FragmentManager, ArrayMap)>
		View view2 = activity.findViewById(0x1020002);
	//    9   19:aload_2         
	//   10   20:ldc1            #213 <Int 0x1020002>
	//   11   22:invokevirtual   #217 <Method View Activity.findViewById(int)>
	//   12   25:astore          4
		View view1 = null;
	//   13   27:aconst_null     
	//   14   28:astore_3        
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
	//   23   38:invokevirtual   #221 <Method boolean Object.equals(Object)>
	//   24   41:ifne            88
			view = ((View) ((Fragment)tempViewToFragment.get(((Object) (activity)))));
	//   25   44:aload_0         
	//   26   45:getfield        #71  <Field ArrayMap tempViewToFragment>
	//   27   48:aload_2         
	//   28   49:invokevirtual   #225 <Method Object ArrayMap.get(Object)>
	//   29   52:checkcast       #154 <Class Fragment>
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
	//   39   68:invokevirtual   #231 <Method android.view.ViewParent View.getParent()>
	//   40   71:instanceof      #227 <Class View>
	//   41   74:ifeq            88
			activity = ((Activity) ((View)((View) (activity)).getParent()));
	//   42   77:aload_2         
	//   43   78:invokevirtual   #231 <Method android.view.ViewParent View.getParent()>
	//   44   81:checkcast       #227 <Class View>
	//   45   84:astore_2        
		} while(true);
	//   46   85:goto            33
		tempViewToFragment.clear();
	//   47   88:aload_0         
	//   48   89:getfield        #71  <Field ArrayMap tempViewToFragment>
	//   49   92:invokevirtual   #209 <Method void ArrayMap.clear()>
		return ((Fragment) (view1));
	//   50   95:aload_3         
	//   51   96:areturn         
	}

	private android.support.v4.app.Fragment findSupportFragment(View view, FragmentActivity fragmentactivity)
	{
		tempViewToSupportFragment.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field ArrayMap tempViewToSupportFragment>
	//    2    4:invokevirtual   #209 <Method void ArrayMap.clear()>
		findAllSupportFragmentsWithViews(((Collection) (fragmentactivity.getSupportFragmentManager().getFragments())), ((Map) (tempViewToSupportFragment)));
	//    3    7:aload_2         
	//    4    8:invokevirtual   #238 <Method android.support.v4.app.FragmentManager FragmentActivity.getSupportFragmentManager()>
	//    5   11:invokevirtual   #201 <Method List android.support.v4.app.FragmentManager.getFragments()>
	//    6   14:aload_0         
	//    7   15:getfield        #69  <Field ArrayMap tempViewToSupportFragment>
	//    8   18:invokestatic    #203 <Method void findAllSupportFragmentsWithViews(Collection, Map)>
		View view2 = fragmentactivity.findViewById(0x1020002);
	//    9   21:aload_2         
	//   10   22:ldc1            #213 <Int 0x1020002>
	//   11   24:invokevirtual   #239 <Method View FragmentActivity.findViewById(int)>
	//   12   27:astore          4
		View view1 = null;
	//   13   29:aconst_null     
	//   14   30:astore_3        
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
	//   23   40:invokevirtual   #221 <Method boolean Object.equals(Object)>
	//   24   43:ifne            90
			view = ((View) ((android.support.v4.app.Fragment)tempViewToSupportFragment.get(((Object) (fragmentactivity)))));
	//   25   46:aload_0         
	//   26   47:getfield        #69  <Field ArrayMap tempViewToSupportFragment>
	//   27   50:aload_2         
	//   28   51:invokevirtual   #225 <Method Object ArrayMap.get(Object)>
	//   29   54:checkcast       #191 <Class android.support.v4.app.Fragment>
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
	//   39   70:invokevirtual   #231 <Method android.view.ViewParent View.getParent()>
	//   40   73:instanceof      #227 <Class View>
	//   41   76:ifeq            90
			fragmentactivity = ((FragmentActivity) ((View)((View) (fragmentactivity)).getParent()));
	//   42   79:aload_2         
	//   43   80:invokevirtual   #231 <Method android.view.ViewParent View.getParent()>
	//   44   83:checkcast       #227 <Class View>
	//   45   86:astore_2        
		} while(true);
	//   46   87:goto            35
		tempViewToSupportFragment.clear();
	//   47   90:aload_0         
	//   48   91:getfield        #69  <Field ArrayMap tempViewToSupportFragment>
	//   49   94:invokevirtual   #209 <Method void ArrayMap.clear()>
		return ((android.support.v4.app.Fragment) (view1));
	//   50   97:aload_3         
	//   51   98:areturn         
	}

	private RequestManager fragmentGet(Context context, FragmentManager fragmentmanager, Fragment fragment, boolean flag)
	{
		RequestManagerFragment requestmanagerfragment = getRequestManagerFragment(fragmentmanager, fragment, flag);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:iload           4
	//    4    5:invokespecial   #245 <Method RequestManagerFragment getRequestManagerFragment(FragmentManager, Fragment, boolean)>
	//    5    8:astore          5
		fragment = ((Fragment) (requestmanagerfragment.getRequestManager()));
	//    6   10:aload           5
	//    7   12:invokevirtual   #251 <Method RequestManager RequestManagerFragment.getRequestManager()>
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
	//   14   23:invokestatic    #256 <Method Glide Glide.get(Context)>
	//   15   26:astore_2        
			fragmentmanager = ((FragmentManager) (factory.build(((Glide) (fragmentmanager)), ((Lifecycle) (requestmanagerfragment.getGlideLifecycle())), requestmanagerfragment.getRequestManagerTreeNode(), context)));
	//   16   27:aload_0         
	//   17   28:getfield        #78  <Field RequestManagerRetriever$RequestManagerFactory factory>
	//   18   31:aload_2         
	//   19   32:aload           5
	//   20   34:invokevirtual   #260 <Method ActivityFragmentLifecycle RequestManagerFragment.getGlideLifecycle()>
	//   21   37:aload           5
	//   22   39:invokevirtual   #264 <Method RequestManagerTreeNode RequestManagerFragment.getRequestManagerTreeNode()>
	//   23   42:aload_1         
	//   24   43:invokeinterface #268 <Method RequestManager RequestManagerRetriever$RequestManagerFactory.build(Glide, Lifecycle, RequestManagerTreeNode, Context)>
	//   25   48:astore_2        
			requestmanagerfragment.setRequestManager(((RequestManager) (fragmentmanager)));
	//   26   49:aload           5
	//   27   51:aload_2         
	//   28   52:invokevirtual   #272 <Method void RequestManagerFragment.setRequestManager(RequestManager)>
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
	//    1    1:getfield        #276 <Field RequestManager applicationManager>
	//    2    4:ifnonnull       66
		this;
	//    3    7:aload_0         
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		if(applicationManager == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #276 <Field RequestManager applicationManager>
	//*   7   13:ifnonnull       56
		{
			Glide glide = Glide.get(context.getApplicationContext());
	//    8   16:aload_1         
	//    9   17:invokevirtual   #281 <Method Context Context.getApplicationContext()>
	//   10   20:invokestatic    #256 <Method Glide Glide.get(Context)>
	//   11   23:astore_2        
			applicationManager = factory.build(glide, ((Lifecycle) (new ApplicationLifecycle())), ((RequestManagerTreeNode) (new EmptyRequestManagerTreeNode())), context.getApplicationContext());
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getfield        #78  <Field RequestManagerRetriever$RequestManagerFactory factory>
	//   15   29:aload_2         
	//   16   30:new             #283 <Class ApplicationLifecycle>
	//   17   33:dup             
	//   18   34:invokespecial   #284 <Method void ApplicationLifecycle()>
	//   19   37:new             #286 <Class EmptyRequestManagerTreeNode>
	//   20   40:dup             
	//   21   41:invokespecial   #287 <Method void EmptyRequestManagerTreeNode()>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #281 <Method Context Context.getApplicationContext()>
	//   24   48:invokeinterface #268 <Method RequestManager RequestManagerRetriever$RequestManagerFactory.build(Glide, Lifecycle, RequestManagerTreeNode, Context)>
	//   25   53:putfield        #276 <Field RequestManager applicationManager>
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
	//   35   67:getfield        #276 <Field RequestManager applicationManager>
	//   36   70:areturn         
	}

	private RequestManagerFragment getRequestManagerFragment(FragmentManager fragmentmanager, Fragment fragment, boolean flag)
	{
		RequestManagerFragment requestmanagerfragment1 = (RequestManagerFragment)fragmentmanager.findFragmentByTag("com.bumptech.glide.manager");
	//    0    0:aload_1         
	//    1    1:ldc1            #20  <String "com.bumptech.glide.manager">
	//    2    3:invokevirtual   #291 <Method Fragment FragmentManager.findFragmentByTag(String)>
	//    3    6:checkcast       #247 <Class RequestManagerFragment>
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
	//   10   21:getfield        #62  <Field Map pendingRequestManagerFragments>
	//   11   24:aload_1         
	//   12   25:invokeinterface #292 <Method Object Map.get(Object)>
	//   13   30:checkcast       #247 <Class RequestManagerFragment>
	//   14   33:astore          5
			requestmanagerfragment = requestmanagerfragment2;
	//   15   35:aload           5
	//   16   37:astore          4
			if(requestmanagerfragment2 == null)
	//*  17   39:aload           5
	//*  18   41:ifnonnull       111
			{
				requestmanagerfragment = new RequestManagerFragment();
	//   19   44:new             #247 <Class RequestManagerFragment>
	//   20   47:dup             
	//   21   48:invokespecial   #293 <Method void RequestManagerFragment()>
	//   22   51:astore          4
				requestmanagerfragment.setParentFragmentHint(fragment);
	//   23   53:aload           4
	//   24   55:aload_2         
	//   25   56:invokevirtual   #297 <Method void RequestManagerFragment.setParentFragmentHint(Fragment)>
				if(flag)
	//*  26   59:iload_3         
	//*  27   60:ifeq            71
					requestmanagerfragment.getGlideLifecycle().onStart();
	//   28   63:aload           4
	//   29   65:invokevirtual   #260 <Method ActivityFragmentLifecycle RequestManagerFragment.getGlideLifecycle()>
	//   30   68:invokevirtual   #302 <Method void ActivityFragmentLifecycle.onStart()>
				pendingRequestManagerFragments.put(((Object) (fragmentmanager)), ((Object) (requestmanagerfragment)));
	//   31   71:aload_0         
	//   32   72:getfield        #62  <Field Map pendingRequestManagerFragments>
	//   33   75:aload_1         
	//   34   76:aload           4
	//   35   78:invokeinterface #195 <Method Object Map.put(Object, Object)>
	//   36   83:pop             
				fragmentmanager.beginTransaction().add(((Fragment) (requestmanagerfragment)), "com.bumptech.glide.manager").commitAllowingStateLoss();
	//   37   84:aload_1         
	//   38   85:invokevirtual   #306 <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   39   88:aload           4
	//   40   90:ldc1            #20  <String "com.bumptech.glide.manager">
	//   41   92:invokevirtual   #312 <Method FragmentTransaction FragmentTransaction.add(Fragment, String)>
	//   42   95:invokevirtual   #316 <Method int FragmentTransaction.commitAllowingStateLoss()>
	//   43   98:pop             
				handler.obtainMessage(1, ((Object) (fragmentmanager))).sendToTarget();
	//   44   99:aload_0         
	//   45  100:getfield        #91  <Field Handler handler>
	//   46  103:iconst_1        
	//   47  104:aload_1         
	//   48  105:invokevirtual   #320 <Method Message Handler.obtainMessage(int, Object)>
	//   49  108:invokevirtual   #325 <Method void Message.sendToTarget()>
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
	//    1    1:ldc1            #20  <String "com.bumptech.glide.manager">
	//    2    3:invokevirtual   #330 <Method android.support.v4.app.Fragment android.support.v4.app.FragmentManager.findFragmentByTag(String)>
	//    3    6:checkcast       #332 <Class SupportRequestManagerFragment>
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
	//   10   21:getfield        #64  <Field Map pendingSupportRequestManagerFragments>
	//   11   24:aload_1         
	//   12   25:invokeinterface #292 <Method Object Map.get(Object)>
	//   13   30:checkcast       #332 <Class SupportRequestManagerFragment>
	//   14   33:astore          5
			supportrequestmanagerfragment = supportrequestmanagerfragment2;
	//   15   35:aload           5
	//   16   37:astore          4
			if(supportrequestmanagerfragment2 == null)
	//*  17   39:aload           5
	//*  18   41:ifnonnull       111
			{
				supportrequestmanagerfragment = new SupportRequestManagerFragment();
	//   19   44:new             #332 <Class SupportRequestManagerFragment>
	//   20   47:dup             
	//   21   48:invokespecial   #333 <Method void SupportRequestManagerFragment()>
	//   22   51:astore          4
				supportrequestmanagerfragment.setParentFragmentHint(fragment);
	//   23   53:aload           4
	//   24   55:aload_2         
	//   25   56:invokevirtual   #336 <Method void SupportRequestManagerFragment.setParentFragmentHint(android.support.v4.app.Fragment)>
				if(flag)
	//*  26   59:iload_3         
	//*  27   60:ifeq            71
					supportrequestmanagerfragment.getGlideLifecycle().onStart();
	//   28   63:aload           4
	//   29   65:invokevirtual   #337 <Method ActivityFragmentLifecycle SupportRequestManagerFragment.getGlideLifecycle()>
	//   30   68:invokevirtual   #302 <Method void ActivityFragmentLifecycle.onStart()>
				pendingSupportRequestManagerFragments.put(((Object) (fragmentmanager)), ((Object) (supportrequestmanagerfragment)));
	//   31   71:aload_0         
	//   32   72:getfield        #64  <Field Map pendingSupportRequestManagerFragments>
	//   33   75:aload_1         
	//   34   76:aload           4
	//   35   78:invokeinterface #195 <Method Object Map.put(Object, Object)>
	//   36   83:pop             
				fragmentmanager.beginTransaction().add(((android.support.v4.app.Fragment) (supportrequestmanagerfragment)), "com.bumptech.glide.manager").commitAllowingStateLoss();
	//   37   84:aload_1         
	//   38   85:invokevirtual   #340 <Method android.support.v4.app.FragmentTransaction android.support.v4.app.FragmentManager.beginTransaction()>
	//   39   88:aload           4
	//   40   90:ldc1            #20  <String "com.bumptech.glide.manager">
	//   41   92:invokevirtual   #345 <Method android.support.v4.app.FragmentTransaction android.support.v4.app.FragmentTransaction.add(android.support.v4.app.Fragment, String)>
	//   42   95:invokevirtual   #346 <Method int android.support.v4.app.FragmentTransaction.commitAllowingStateLoss()>
	//   43   98:pop             
				handler.obtainMessage(2, ((Object) (fragmentmanager))).sendToTarget();
	//   44   99:aload_0         
	//   45  100:getfield        #91  <Field Handler handler>
	//   46  103:iconst_2        
	//   47  104:aload_1         
	//   48  105:invokevirtual   #320 <Method Message Handler.obtainMessage(int, Object)>
	//   49  108:invokevirtual   #325 <Method void Message.sendToTarget()>
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
	//    1    1:invokevirtual   #351 <Method boolean Activity.isFinishing()>
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
	//    4    5:invokespecial   #355 <Method SupportRequestManagerFragment getSupportRequestManagerFragment(android.support.v4.app.FragmentManager, android.support.v4.app.Fragment, boolean)>
	//    5    8:astore          5
		fragment = ((android.support.v4.app.Fragment) (supportrequestmanagerfragment.getRequestManager()));
	//    6   10:aload           5
	//    7   12:invokevirtual   #356 <Method RequestManager SupportRequestManagerFragment.getRequestManager()>
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
	//   14   23:invokestatic    #256 <Method Glide Glide.get(Context)>
	//   15   26:astore_2        
			fragmentmanager = ((android.support.v4.app.FragmentManager) (factory.build(((Glide) (fragmentmanager)), ((Lifecycle) (supportrequestmanagerfragment.getGlideLifecycle())), supportrequestmanagerfragment.getRequestManagerTreeNode(), context)));
	//   16   27:aload_0         
	//   17   28:getfield        #78  <Field RequestManagerRetriever$RequestManagerFactory factory>
	//   18   31:aload_2         
	//   19   32:aload           5
	//   20   34:invokevirtual   #337 <Method ActivityFragmentLifecycle SupportRequestManagerFragment.getGlideLifecycle()>
	//   21   37:aload           5
	//   22   39:invokevirtual   #357 <Method RequestManagerTreeNode SupportRequestManagerFragment.getRequestManagerTreeNode()>
	//   23   42:aload_1         
	//   24   43:invokeinterface #268 <Method RequestManager RequestManagerRetriever$RequestManagerFactory.build(Glide, Lifecycle, RequestManagerTreeNode, Context)>
	//   25   48:astore_2        
			supportrequestmanagerfragment.setRequestManager(((RequestManager) (fragmentmanager)));
	//   26   49:aload           5
	//   27   51:aload_2         
	//   28   52:invokevirtual   #358 <Method void SupportRequestManagerFragment.setRequestManager(RequestManager)>
		}
		return ((RequestManager) (fragmentmanager));
	//   29   55:aload_2         
	//   30   56:areturn         
	}

	public RequestManager get(Activity activity)
	{
		if(Util.isOnBackgroundThread())
	//*   0    0:invokestatic    #364 <Method boolean Util.isOnBackgroundThread()>
	//*   1    3:ifeq            15
		{
			return get(activity.getApplicationContext());
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:invokevirtual   #365 <Method Context Activity.getApplicationContext()>
	//    5   11:invokevirtual   #367 <Method RequestManager get(Context)>
	//    6   14:areturn         
		} else
		{
			assertNotDestroyed(activity);
	//    7   15:aload_1         
	//    8   16:invokestatic    #369 <Method void assertNotDestroyed(Activity)>
			return fragmentGet(((Context) (activity)), activity.getFragmentManager(), ((Fragment) (null)), isActivityVisible(activity));
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #212 <Method FragmentManager Activity.getFragmentManager()>
	//   13   25:aconst_null     
	//   14   26:aload_1         
	//   15   27:invokestatic    #371 <Method boolean isActivityVisible(Activity)>
	//   16   30:invokespecial   #373 <Method RequestManager fragmentGet(Context, FragmentManager, Fragment, boolean)>
	//   17   33:areturn         
		}
	}

	public RequestManager get(Fragment fragment)
	{
		if(fragment.getActivity() != null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #378 <Method Activity Fragment.getActivity()>
	//*   2    4:ifnull          56
		{
			if(!Util.isOnBackgroundThread() && android.os.Build.VERSION.SDK_INT >= 17)
	//*   3    7:invokestatic    #364 <Method boolean Util.isOnBackgroundThread()>
	//*   4   10:ifne            44
	//*   5   13:getstatic       #103 <Field int android.os.Build$VERSION.SDK_INT>
	//*   6   16:bipush          17
	//*   7   18:icmpge          24
	//*   8   21:goto            44
			{
				FragmentManager fragmentmanager = fragment.getChildFragmentManager();
	//    9   24:aload_1         
	//   10   25:invokevirtual   #166 <Method FragmentManager Fragment.getChildFragmentManager()>
	//   11   28:astore_2        
				return fragmentGet(((Context) (fragment.getActivity())), fragmentmanager, fragment, fragment.isVisible());
	//   12   29:aload_0         
	//   13   30:aload_1         
	//   14   31:invokevirtual   #378 <Method Activity Fragment.getActivity()>
	//   15   34:aload_2         
	//   16   35:aload_1         
	//   17   36:aload_1         
	//   18   37:invokevirtual   #381 <Method boolean Fragment.isVisible()>
	//   19   40:invokespecial   #373 <Method RequestManager fragmentGet(Context, FragmentManager, Fragment, boolean)>
	//   20   43:areturn         
			} else
			{
				return get(fragment.getActivity().getApplicationContext());
	//   21   44:aload_0         
	//   22   45:aload_1         
	//   23   46:invokevirtual   #378 <Method Activity Fragment.getActivity()>
	//   24   49:invokevirtual   #365 <Method Context Activity.getApplicationContext()>
	//   25   52:invokevirtual   #367 <Method RequestManager get(Context)>
	//   26   55:areturn         
			}
		} else
		{
			throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
	//   27   56:new             #111 <Class IllegalArgumentException>
	//   28   59:dup             
	//   29   60:ldc2            #383 <String "You cannot start a load on a fragment before it is attached">
	//   30   63:invokespecial   #116 <Method void IllegalArgumentException(String)>
	//   31   66:athrow          
		}
	}

	public RequestManager get(Context context)
	{
		if(context != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          74
		{
			if(Util.isOnMainThread() && !(context instanceof Application))
	//*   2    4:invokestatic    #386 <Method boolean Util.isOnMainThread()>
	//*   3    7:ifeq            68
	//*   4   10:aload_1         
	//*   5   11:instanceof      #388 <Class Application>
	//*   6   14:ifne            68
			{
				if(context instanceof FragmentActivity)
	//*   7   17:aload_1         
	//*   8   18:instanceof      #235 <Class FragmentActivity>
	//*   9   21:ifeq            33
					return get((FragmentActivity)context);
	//   10   24:aload_0         
	//   11   25:aload_1         
	//   12   26:checkcast       #235 <Class FragmentActivity>
	//   13   29:invokevirtual   #391 <Method RequestManager get(FragmentActivity)>
	//   14   32:areturn         
				if(context instanceof Activity)
	//*  15   33:aload_1         
	//*  16   34:instanceof      #105 <Class Activity>
	//*  17   37:ifeq            49
					return get((Activity)context);
	//   18   40:aload_0         
	//   19   41:aload_1         
	//   20   42:checkcast       #105 <Class Activity>
	//   21   45:invokevirtual   #393 <Method RequestManager get(Activity)>
	//   22   48:areturn         
				if(context instanceof ContextWrapper)
	//*  23   49:aload_1         
	//*  24   50:instanceof      #121 <Class ContextWrapper>
	//*  25   53:ifeq            68
					return get(((ContextWrapper)context).getBaseContext());
	//   26   56:aload_0         
	//   27   57:aload_1         
	//   28   58:checkcast       #121 <Class ContextWrapper>
	//   29   61:invokevirtual   #125 <Method Context ContextWrapper.getBaseContext()>
	//   30   64:invokevirtual   #367 <Method RequestManager get(Context)>
	//   31   67:areturn         
			}
			return getApplicationManager(context);
	//   32   68:aload_0         
	//   33   69:aload_1         
	//   34   70:invokespecial   #395 <Method RequestManager getApplicationManager(Context)>
	//   35   73:areturn         
		} else
		{
			throw new IllegalArgumentException("You cannot start a load on a null Context");
	//   36   74:new             #111 <Class IllegalArgumentException>
	//   37   77:dup             
	//   38   78:ldc2            #397 <String "You cannot start a load on a null Context">
	//   39   81:invokespecial   #116 <Method void IllegalArgumentException(String)>
	//   40   84:athrow          
		}
	}

	public RequestManager get(android.support.v4.app.Fragment fragment)
	{
		Preconditions.checkNotNull(((Object) (fragment.getActivity())), "You cannot start a load on a fragment before it is attached or after it is destroyed");
	//    0    0:aload_1         
	//    1    1:invokevirtual   #401 <Method FragmentActivity android.support.v4.app.Fragment.getActivity()>
	//    2    4:ldc2            #403 <String "You cannot start a load on a fragment before it is attached or after it is destroyed">
	//    3    7:invokestatic    #409 <Method Object Preconditions.checkNotNull(Object, String)>
	//    4   10:pop             
		if(Util.isOnBackgroundThread())
	//*   5   11:invokestatic    #364 <Method boolean Util.isOnBackgroundThread()>
	//*   6   14:ifeq            29
		{
			return get(fragment.getActivity().getApplicationContext());
	//    7   17:aload_0         
	//    8   18:aload_1         
	//    9   19:invokevirtual   #401 <Method FragmentActivity android.support.v4.app.Fragment.getActivity()>
	//   10   22:invokevirtual   #410 <Method Context FragmentActivity.getApplicationContext()>
	//   11   25:invokevirtual   #367 <Method RequestManager get(Context)>
	//   12   28:areturn         
		} else
		{
			android.support.v4.app.FragmentManager fragmentmanager = fragment.getChildFragmentManager();
	//   13   29:aload_1         
	//   14   30:invokevirtual   #198 <Method android.support.v4.app.FragmentManager android.support.v4.app.Fragment.getChildFragmentManager()>
	//   15   33:astore_2        
			return supportFragmentGet(((Context) (fragment.getActivity())), fragmentmanager, fragment, fragment.isVisible());
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:invokevirtual   #401 <Method FragmentActivity android.support.v4.app.Fragment.getActivity()>
	//   19   39:aload_2         
	//   20   40:aload_1         
	//   21   41:aload_1         
	//   22   42:invokevirtual   #411 <Method boolean android.support.v4.app.Fragment.isVisible()>
	//   23   45:invokespecial   #413 <Method RequestManager supportFragmentGet(Context, android.support.v4.app.FragmentManager, android.support.v4.app.Fragment, boolean)>
	//   24   48:areturn         
		}
	}

	public RequestManager get(FragmentActivity fragmentactivity)
	{
		if(Util.isOnBackgroundThread())
	//*   0    0:invokestatic    #364 <Method boolean Util.isOnBackgroundThread()>
	//*   1    3:ifeq            15
		{
			return get(fragmentactivity.getApplicationContext());
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:invokevirtual   #410 <Method Context FragmentActivity.getApplicationContext()>
	//    5   11:invokevirtual   #367 <Method RequestManager get(Context)>
	//    6   14:areturn         
		} else
		{
			assertNotDestroyed(((Activity) (fragmentactivity)));
	//    7   15:aload_1         
	//    8   16:invokestatic    #369 <Method void assertNotDestroyed(Activity)>
			return supportFragmentGet(((Context) (fragmentactivity)), fragmentactivity.getSupportFragmentManager(), ((android.support.v4.app.Fragment) (null)), isActivityVisible(((Activity) (fragmentactivity))));
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #238 <Method android.support.v4.app.FragmentManager FragmentActivity.getSupportFragmentManager()>
	//   13   25:aconst_null     
	//   14   26:aload_1         
	//   15   27:invokestatic    #371 <Method boolean isActivityVisible(Activity)>
	//   16   30:invokespecial   #413 <Method RequestManager supportFragmentGet(Context, android.support.v4.app.FragmentManager, android.support.v4.app.Fragment, boolean)>
	//   17   33:areturn         
		}
	}

	public RequestManager get(View view)
	{
		if(Util.isOnBackgroundThread())
	//*   0    0:invokestatic    #364 <Method boolean Util.isOnBackgroundThread()>
	//*   1    3:ifeq            18
			return get(view.getContext().getApplicationContext());
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:invokevirtual   #417 <Method Context View.getContext()>
	//    5   11:invokevirtual   #281 <Method Context Context.getApplicationContext()>
	//    6   14:invokevirtual   #367 <Method RequestManager get(Context)>
	//    7   17:areturn         
		Preconditions.checkNotNull(((Object) (view)));
	//    8   18:aload_1         
	//    9   19:invokestatic    #419 <Method Object Preconditions.checkNotNull(Object)>
	//   10   22:pop             
		Preconditions.checkNotNull(((Object) (view.getContext())), "Unable to obtain a request manager for a view without a Context");
	//   11   23:aload_1         
	//   12   24:invokevirtual   #417 <Method Context View.getContext()>
	//   13   27:ldc2            #421 <String "Unable to obtain a request manager for a view without a Context">
	//   14   30:invokestatic    #409 <Method Object Preconditions.checkNotNull(Object, String)>
	//   15   33:pop             
		Activity activity = findActivity(view.getContext());
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:invokevirtual   #417 <Method Context View.getContext()>
	//   19   39:invokespecial   #127 <Method Activity findActivity(Context)>
	//   20   42:astore_2        
		if(activity == null)
	//*  21   43:aload_2         
	//*  22   44:ifnonnull       59
			return get(view.getContext().getApplicationContext());
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:invokevirtual   #417 <Method Context View.getContext()>
	//   26   52:invokevirtual   #281 <Method Context Context.getApplicationContext()>
	//   27   55:invokevirtual   #367 <Method RequestManager get(Context)>
	//   28   58:areturn         
		if(activity instanceof FragmentActivity)
	//*  29   59:aload_2         
	//*  30   60:instanceof      #235 <Class FragmentActivity>
	//*  31   63:ifeq            92
		{
			view = ((View) (findSupportFragment(view, (FragmentActivity)activity)));
	//   32   66:aload_0         
	//   33   67:aload_1         
	//   34   68:aload_2         
	//   35   69:checkcast       #235 <Class FragmentActivity>
	//   36   72:invokespecial   #423 <Method android.support.v4.app.Fragment findSupportFragment(View, FragmentActivity)>
	//   37   75:astore_1        
			if(view != null)
	//*  38   76:aload_1         
	//*  39   77:ifnull          86
				return get(((android.support.v4.app.Fragment) (view)));
	//   40   80:aload_0         
	//   41   81:aload_1         
	//   42   82:invokevirtual   #425 <Method RequestManager get(android.support.v4.app.Fragment)>
	//   43   85:areturn         
			else
				return get(activity);
	//   44   86:aload_0         
	//   45   87:aload_2         
	//   46   88:invokevirtual   #393 <Method RequestManager get(Activity)>
	//   47   91:areturn         
		}
		view = ((View) (findFragment(view, activity)));
	//   48   92:aload_0         
	//   49   93:aload_1         
	//   50   94:aload_2         
	//   51   95:invokespecial   #427 <Method Fragment findFragment(View, Activity)>
	//   52   98:astore_1        
		if(view == null)
	//*  53   99:aload_1         
	//*  54  100:ifnonnull       109
			return get(activity);
	//   55  103:aload_0         
	//   56  104:aload_2         
	//   57  105:invokevirtual   #393 <Method RequestManager get(Activity)>
	//   58  108:areturn         
		else
			return get(((Fragment) (view)));
	//   59  109:aload_0         
	//   60  110:aload_1         
	//   61  111:invokevirtual   #429 <Method RequestManager get(Fragment)>
	//   62  114:areturn         
	}

	RequestManagerFragment getRequestManagerFragment(Activity activity)
	{
		return getRequestManagerFragment(activity.getFragmentManager(), ((Fragment) (null)), isActivityVisible(activity));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #212 <Method FragmentManager Activity.getFragmentManager()>
	//    3    5:aconst_null     
	//    4    6:aload_1         
	//    5    7:invokestatic    #371 <Method boolean isActivityVisible(Activity)>
	//    6   10:invokespecial   #245 <Method RequestManagerFragment getRequestManagerFragment(FragmentManager, Fragment, boolean)>
	//    7   13:areturn         
	}

	SupportRequestManagerFragment getSupportRequestManagerFragment(FragmentActivity fragmentactivity)
	{
		return getSupportRequestManagerFragment(fragmentactivity.getSupportFragmentManager(), ((android.support.v4.app.Fragment) (null)), isActivityVisible(((Activity) (fragmentactivity))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #238 <Method android.support.v4.app.FragmentManager FragmentActivity.getSupportFragmentManager()>
	//    3    5:aconst_null     
	//    4    6:aload_1         
	//    5    7:invokestatic    #371 <Method boolean isActivityVisible(Activity)>
	//    6   10:invokespecial   #355 <Method SupportRequestManagerFragment getSupportRequestManagerFragment(android.support.v4.app.FragmentManager, android.support.v4.app.Fragment, boolean)>
	//    7   13:areturn         
	}

	public boolean handleMessage(Message message)
	{
		int i = message.what;
	//    0    0:aload_1         
	//    1    1:getfield        #436 <Field int Message.what>
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
	//   19   48:getfield        #440 <Field Object Message.obj>
	//   20   51:checkcast       #200 <Class android.support.v4.app.FragmentManager>
	//   21   54:astore_1        
			obj = pendingSupportRequestManagerFragments.remove(((Object) (message)));
	//   22   55:aload_0         
	//   23   56:getfield        #64  <Field Map pendingSupportRequestManagerFragments>
	//   24   59:aload_1         
	//   25   60:invokeinterface #443 <Method Object Map.remove(Object)>
	//   26   65:astore          4
			break;

	//*  27   67:goto            90
		case 1: // '\001'
			message = ((Message) ((FragmentManager)message.obj));
	//   28   70:aload_1         
	//   29   71:getfield        #440 <Field Object Message.obj>
	//   30   74:checkcast       #133 <Class FragmentManager>
	//   31   77:astore_1        
			obj = pendingRequestManagerFragments.remove(((Object) (message)));
	//   32   78:aload_0         
	//   33   79:getfield        #62  <Field Map pendingRequestManagerFragments>
	//   34   82:aload_1         
	//   35   83:invokeinterface #443 <Method Object Map.remove(Object)>
	//   36   88:astore          4
			break;
		}
		if(flag && obj == null && Log.isLoggable("RMRetriever", 5))
	//*  37   90:iload_3         
	//*  38   91:ifeq            144
	//*  39   94:aload           4
	//*  40   96:ifnonnull       144
	//*  41   99:ldc1            #29  <String "RMRetriever">
	//*  42  101:iconst_5        
	//*  43  102:invokestatic    #449 <Method boolean Log.isLoggable(String, int)>
	//*  44  105:ifeq            144
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   45  108:new             #451 <Class StringBuilder>
	//   46  111:dup             
	//   47  112:invokespecial   #452 <Method void StringBuilder()>
	//   48  115:astore          4
			stringbuilder.append("Failed to remove expected request manager fragment, manager: ");
	//   49  117:aload           4
	//   50  119:ldc2            #454 <String "Failed to remove expected request manager fragment, manager: ">
	//   51  122:invokevirtual   #458 <Method StringBuilder StringBuilder.append(String)>
	//   52  125:pop             
			stringbuilder.append(((Object) (message)));
	//   53  126:aload           4
	//   54  128:aload_1         
	//   55  129:invokevirtual   #461 <Method StringBuilder StringBuilder.append(Object)>
	//   56  132:pop             
			Log.w("RMRetriever", stringbuilder.toString());
	//   57  133:ldc1            #29  <String "RMRetriever">
	//   58  135:aload           4
	//   59  137:invokevirtual   #465 <Method String StringBuilder.toString()>
	//   60  140:invokestatic    #469 <Method int Log.w(String, String)>
	//   61  143:pop             
		}
		return flag;
	//   62  144:iload_3         
	//   63  145:ireturn         
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
	private static final String FRAGMENT_INDEX_KEY = "key";
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
	//    2    4:invokespecial   #51  <Method void RequestManagerRetriever$1()>
	//    3    7:putstatic       #53  <Field RequestManagerRetriever$RequestManagerFactory DEFAULT_FACTORY>
	//*   4   10:return          
	}
}
