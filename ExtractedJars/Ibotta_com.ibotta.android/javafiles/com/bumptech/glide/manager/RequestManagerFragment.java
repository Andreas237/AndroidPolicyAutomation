// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.gestures.GestureObserver;
import java.util.*;

// Referenced classes of package com.bumptech.glide.manager:
//			ActivityFragmentLifecycle, RequestManagerRetriever, RequestManagerTreeNode

public class RequestManagerFragment extends Fragment
	implements TraceFieldInterface
{
	private class FragmentRequestManagerTreeNode
		implements RequestManagerTreeNode
	{

		public Set getDescendants()
		{
			Object obj = ((Object) (getDescendantRequestManagerFragments()));
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field RequestManagerFragment this$0>
		//    2    4:invokevirtual   #25  <Method Set RequestManagerFragment.getDescendantRequestManagerFragments()>
		//    3    7:astore_2        
			HashSet hashset = new HashSet(((Set) (obj)).size());
		//    4    8:new             #27  <Class HashSet>
		//    5   11:dup             
		//    6   12:aload_2         
		//    7   13:invokeinterface #33  <Method int Set.size()>
		//    8   18:invokespecial   #36  <Method void HashSet(int)>
		//    9   21:astore_1        
			obj = ((Object) (((Set) (obj)).iterator()));
		//   10   22:aload_2         
		//   11   23:invokeinterface #40  <Method Iterator Set.iterator()>
		//   12   28:astore_2        
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
		//   13   29:aload_2         
		//   14   30:invokeinterface #46  <Method boolean Iterator.hasNext()>
		//   15   35:ifeq            69
				RequestManagerFragment requestmanagerfragment = (RequestManagerFragment)((Iterator) (obj)).next();
		//   16   38:aload_2         
		//   17   39:invokeinterface #50  <Method Object Iterator.next()>
		//   18   44:checkcast       #8   <Class RequestManagerFragment>
		//   19   47:astore_3        
				if(requestmanagerfragment.getRequestManager() != null)
		//*  20   48:aload_3         
		//*  21   49:invokevirtual   #54  <Method RequestManager RequestManagerFragment.getRequestManager()>
		//*  22   52:ifnull          29
					((Set) (hashset)).add(((Object) (requestmanagerfragment.getRequestManager())));
		//   23   55:aload_1         
		//   24   56:aload_3         
		//   25   57:invokevirtual   #54  <Method RequestManager RequestManagerFragment.getRequestManager()>
		//   26   60:invokeinterface #58  <Method boolean Set.add(Object)>
		//   27   65:pop             
			} while(true);
		//   28   66:goto            29
			return ((Set) (hashset));
		//   29   69:aload_1         
		//   30   70:areturn         
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #65  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #66  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append(super.toString());
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:invokespecial   #68  <Method String Object.toString()>
		//    7   13:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
		//    8   16:pop             
			stringbuilder.append("{fragment=");
		//    9   17:aload_1         
		//   10   18:ldc1            #74  <String "{fragment=">
		//   11   20:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
		//   12   23:pop             
			stringbuilder.append(((Object) (RequestManagerFragment.this)));
		//   13   24:aload_1         
		//   14   25:aload_0         
		//   15   26:getfield        #15  <Field RequestManagerFragment this$0>
		//   16   29:invokevirtual   #77  <Method StringBuilder StringBuilder.append(Object)>
		//   17   32:pop             
			stringbuilder.append("}");
		//   18   33:aload_1         
		//   19   34:ldc1            #79  <String "}">
		//   20   36:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
		//   21   39:pop             
			return stringbuilder.toString();
		//   22   40:aload_1         
		//   23   41:invokevirtual   #80  <Method String StringBuilder.toString()>
		//   24   44:areturn         
		}

		final RequestManagerFragment this$0;

		FragmentRequestManagerTreeNode()
		{
			this$0 = RequestManagerFragment.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field RequestManagerFragment this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}


	public RequestManagerFragment()
	{
		this(new ActivityFragmentLifecycle());
	//    0    0:aload_0         
	//    1    1:new             #29  <Class ActivityFragmentLifecycle>
	//    2    4:dup             
	//    3    5:invokespecial   #31  <Method void ActivityFragmentLifecycle()>
	//    4    8:invokespecial   #34  <Method void RequestManagerFragment(ActivityFragmentLifecycle)>
	//    5   11:return          
	}

	RequestManagerFragment(ActivityFragmentLifecycle activityfragmentlifecycle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Fragment()>
		requestManagerTreeNode = ((RequestManagerTreeNode) (new FragmentRequestManagerTreeNode()));
	//    2    4:aload_0         
	//    3    5:new             #8   <Class RequestManagerFragment$FragmentRequestManagerTreeNode>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #44  <Method void RequestManagerFragment$FragmentRequestManagerTreeNode(RequestManagerFragment)>
	//    7   13:putfield        #46  <Field RequestManagerTreeNode requestManagerTreeNode>
		childRequestManagerFragments = ((Set) (new HashSet()));
	//    8   16:aload_0         
	//    9   17:new             #48  <Class HashSet>
	//   10   20:dup             
	//   11   21:invokespecial   #49  <Method void HashSet()>
	//   12   24:putfield        #51  <Field Set childRequestManagerFragments>
		lifecycle = activityfragmentlifecycle;
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:putfield        #53  <Field ActivityFragmentLifecycle lifecycle>
	//   16   32:return          
	}

	private void addChildRequestManagerFragment(RequestManagerFragment requestmanagerfragment)
	{
		childRequestManagerFragments.add(((Object) (requestmanagerfragment)));
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Set childRequestManagerFragments>
	//    2    4:aload_1         
	//    3    5:invokeinterface #62  <Method boolean Set.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	private Fragment getParentFragmentUsingHint()
	{
		Fragment fragment;
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #72  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          16
			fragment = getParentFragment();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #75  <Method Fragment getParentFragment()>
	//    5   12:astore_1        
		else
	//*   6   13:goto            18
			fragment = null;
	//    7   16:aconst_null     
	//    8   17:astore_1        
		if(fragment != null)
	//*   9   18:aload_1         
	//*  10   19:ifnull          24
			return fragment;
	//   11   22:aload_1         
	//   12   23:areturn         
		else
			return parentFragmentHint;
	//   13   24:aload_0         
	//   14   25:getfield        #77  <Field Fragment parentFragmentHint>
	//   15   28:areturn         
	}

	private boolean isDescendant(Fragment fragment)
	{
		Fragment fragment1 = getParentFragment();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method Fragment getParentFragment()>
	//    2    4:astore_2        
		do
		{
			Fragment fragment2 = fragment.getParentFragment();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #80  <Method Fragment Fragment.getParentFragment()>
	//    5    9:astore_3        
			if(fragment2 != null)
	//*   6   10:aload_3         
	//*   7   11:ifnull          32
			{
				if(fragment2.equals(((Object) (fragment1))))
	//*   8   14:aload_3         
	//*   9   15:aload_2         
	//*  10   16:invokevirtual   #83  <Method boolean Fragment.equals(Object)>
	//*  11   19:ifeq            24
					return true;
	//   12   22:iconst_1        
	//   13   23:ireturn         
				fragment = fragment.getParentFragment();
	//   14   24:aload_1         
	//   15   25:invokevirtual   #80  <Method Fragment Fragment.getParentFragment()>
	//   16   28:astore_1        
			} else
	//*  17   29:goto            5
			{
				return false;
	//   18   32:iconst_0        
	//   19   33:ireturn         
			}
		} while(true);
	}

	private void registerFragmentWithRoot(Activity activity)
	{
		unregisterFragmentWithRoot();
	//    0    0:aload_0         
	//    1    1:invokespecial   #88  <Method void unregisterFragmentWithRoot()>
		rootRequestManagerFragment = Glide.get(((android.content.Context) (activity))).getRequestManagerRetriever().getRequestManagerFragment(activity);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #94  <Method Glide Glide.get(android.content.Context)>
	//    5    9:invokevirtual   #98  <Method RequestManagerRetriever Glide.getRequestManagerRetriever()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #104 <Method RequestManagerFragment RequestManagerRetriever.getRequestManagerFragment(Activity)>
	//    8   16:putfield        #106 <Field RequestManagerFragment rootRequestManagerFragment>
		if(!equals(((Object) (rootRequestManagerFragment))))
	//*   9   19:aload_0         
	//*  10   20:aload_0         
	//*  11   21:getfield        #106 <Field RequestManagerFragment rootRequestManagerFragment>
	//*  12   24:invokevirtual   #107 <Method boolean equals(Object)>
	//*  13   27:ifne            38
			rootRequestManagerFragment.addChildRequestManagerFragment(this);
	//   14   30:aload_0         
	//   15   31:getfield        #106 <Field RequestManagerFragment rootRequestManagerFragment>
	//   16   34:aload_0         
	//   17   35:invokespecial   #109 <Method void addChildRequestManagerFragment(RequestManagerFragment)>
	//   18   38:return          
	}

	private void removeChildRequestManagerFragment(RequestManagerFragment requestmanagerfragment)
	{
		childRequestManagerFragments.remove(((Object) (requestmanagerfragment)));
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Set childRequestManagerFragments>
	//    2    4:aload_1         
	//    3    5:invokeinterface #113 <Method boolean Set.remove(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	private void unregisterFragmentWithRoot()
	{
		RequestManagerFragment requestmanagerfragment = rootRequestManagerFragment;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field RequestManagerFragment rootRequestManagerFragment>
	//    2    4:astore_1        
		if(requestmanagerfragment != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          19
		{
			requestmanagerfragment.removeChildRequestManagerFragment(this);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokespecial   #115 <Method void removeChildRequestManagerFragment(RequestManagerFragment)>
			rootRequestManagerFragment = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #106 <Field RequestManagerFragment rootRequestManagerFragment>
		}
	//   11   19:return          
	}

	Set getDescendantRequestManagerFragments()
	{
		if(equals(((Object) (rootRequestManagerFragment))))
	//*   0    0:aload_0         
	//*   1    1:aload_0         
	//*   2    2:getfield        #106 <Field RequestManagerFragment rootRequestManagerFragment>
	//*   3    5:invokevirtual   #107 <Method boolean equals(Object)>
	//*   4    8:ifeq            19
			return Collections.unmodifiableSet(childRequestManagerFragments);
	//    5   11:aload_0         
	//    6   12:getfield        #51  <Field Set childRequestManagerFragments>
	//    7   15:invokestatic    #123 <Method Set Collections.unmodifiableSet(Set)>
	//    8   18:areturn         
		if(rootRequestManagerFragment != null && android.os.Build.VERSION.SDK_INT >= 17)
	//*   9   19:aload_0         
	//*  10   20:getfield        #106 <Field RequestManagerFragment rootRequestManagerFragment>
	//*  11   23:ifnull          104
	//*  12   26:getstatic       #72  <Field int android.os.Build$VERSION.SDK_INT>
	//*  13   29:bipush          17
	//*  14   31:icmpge          37
	//*  15   34:goto            104
		{
			HashSet hashset = new HashSet();
	//   16   37:new             #48  <Class HashSet>
	//   17   40:dup             
	//   18   41:invokespecial   #49  <Method void HashSet()>
	//   19   44:astore_1        
			Iterator iterator = rootRequestManagerFragment.getDescendantRequestManagerFragments().iterator();
	//   20   45:aload_0         
	//   21   46:getfield        #106 <Field RequestManagerFragment rootRequestManagerFragment>
	//   22   49:invokevirtual   #125 <Method Set getDescendantRequestManagerFragments()>
	//   23   52:invokeinterface #129 <Method Iterator Set.iterator()>
	//   24   57:astore_2        
			do
			{
				if(!iterator.hasNext())
					break;
	//   25   58:aload_2         
	//   26   59:invokeinterface #135 <Method boolean Iterator.hasNext()>
	//   27   64:ifeq            99
				RequestManagerFragment requestmanagerfragment = (RequestManagerFragment)iterator.next();
	//   28   67:aload_2         
	//   29   68:invokeinterface #139 <Method Object Iterator.next()>
	//   30   73:checkcast       #2   <Class RequestManagerFragment>
	//   31   76:astore_3        
				if(isDescendant(requestmanagerfragment.getParentFragment()))
	//*  32   77:aload_0         
	//*  33   78:aload_3         
	//*  34   79:invokevirtual   #75  <Method Fragment getParentFragment()>
	//*  35   82:invokespecial   #141 <Method boolean isDescendant(Fragment)>
	//*  36   85:ifeq            58
					((Set) (hashset)).add(((Object) (requestmanagerfragment)));
	//   37   88:aload_1         
	//   38   89:aload_3         
	//   39   90:invokeinterface #62  <Method boolean Set.add(Object)>
	//   40   95:pop             
			} while(true);
	//   41   96:goto            58
			return Collections.unmodifiableSet(((Set) (hashset)));
	//   42   99:aload_1         
	//   43  100:invokestatic    #123 <Method Set Collections.unmodifiableSet(Set)>
	//   44  103:areturn         
		} else
		{
			return Collections.emptySet();
	//   45  104:invokestatic    #144 <Method Set Collections.emptySet()>
	//   46  107:areturn         
		}
	}

	ActivityFragmentLifecycle getGlideLifecycle()
	{
		return lifecycle;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ActivityFragmentLifecycle lifecycle>
	//    2    4:areturn         
	}

	public RequestManager getRequestManager()
	{
		return requestManager;
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field RequestManager requestManager>
	//    2    4:areturn         
	}

	public RequestManagerTreeNode getRequestManagerTreeNode()
	{
		return requestManagerTreeNode;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field RequestManagerTreeNode requestManagerTreeNode>
	//    2    4:areturn         
	}

	public void onAttach(Activity activity)
	{
		super.onAttach(activity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #159 <Method void Fragment.onAttach(Activity)>
		try
		{
			registerFragmentWithRoot(activity);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #161 <Method void registerFragmentWithRoot(Activity)>
			return;
	//    6   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(Activity activity) { }
	//    7   11:astore_1        
		if(Log.isLoggable("RMFragment", 5))
	//*   8   12:ldc1            #163 <String "RMFragment">
	//*   9   14:iconst_5        
	//*  10   15:invokestatic    #169 <Method boolean Log.isLoggable(String, int)>
	//*  11   18:ifeq            30
			Log.w("RMFragment", "Unable to register fragment with root", ((Throwable) (activity)));
	//   12   21:ldc1            #163 <String "RMFragment">
	//   13   23:ldc1            #171 <String "Unable to register fragment with root">
	//   14   25:aload_1         
	//   15   26:invokestatic    #175 <Method int Log.w(String, String, Throwable)>
	//   16   29:pop             
	//   17   30:return          
	}

	public void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #178 <Method void Fragment.onDestroy()>
		lifecycle.onDestroy();
	//    2    4:aload_0         
	//    3    5:getfield        #53  <Field ActivityFragmentLifecycle lifecycle>
	//    4    8:invokevirtual   #179 <Method void ActivityFragmentLifecycle.onDestroy()>
		unregisterFragmentWithRoot();
	//    5   11:aload_0         
	//    6   12:invokespecial   #88  <Method void unregisterFragmentWithRoot()>
	//    7   15:return          
	}

	public void onDetach()
	{
		super.onDetach();
	//    0    0:aload_0         
	//    1    1:invokespecial   #182 <Method void Fragment.onDetach()>
		unregisterFragmentWithRoot();
	//    2    4:aload_0         
	//    3    5:invokespecial   #88  <Method void unregisterFragmentWithRoot()>
	//    4    8:return          
	}

	public void onStart()
	{
		GestureObserver.getInstance().onActivityOrFragmentStarted(((Object) (this)));
	//    0    0:invokestatic    #189 <Method GestureObserver GestureObserver.getInstance()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #193 <Method void GestureObserver.onActivityOrFragmentStarted(Object)>
		super.onStart();
	//    3    7:aload_0         
	//    4    8:invokespecial   #195 <Method void Fragment.onStart()>
		lifecycle.onStart();
	//    5   11:aload_0         
	//    6   12:getfield        #53  <Field ActivityFragmentLifecycle lifecycle>
	//    7   15:invokevirtual   #196 <Method void ActivityFragmentLifecycle.onStart()>
	//    8   18:return          
	}

	public void onStop()
	{
		GestureObserver.getInstance().onActivityOrFragmentStopped(((Object) (this)));
	//    0    0:invokestatic    #189 <Method GestureObserver GestureObserver.getInstance()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #200 <Method void GestureObserver.onActivityOrFragmentStopped(Object)>
		super.onStop();
	//    3    7:aload_0         
	//    4    8:invokespecial   #202 <Method void Fragment.onStop()>
		lifecycle.onStop();
	//    5   11:aload_0         
	//    6   12:getfield        #53  <Field ActivityFragmentLifecycle lifecycle>
	//    7   15:invokevirtual   #203 <Method void ActivityFragmentLifecycle.onStop()>
	//    8   18:return          
	}

	void setParentFragmentHint(Fragment fragment)
	{
		parentFragmentHint = fragment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #77  <Field Fragment parentFragmentHint>
		if(fragment != null && fragment.getActivity() != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          24
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #209 <Method Activity Fragment.getActivity()>
	//*   7   13:ifnull          24
			registerFragmentWithRoot(fragment.getActivity());
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #209 <Method Activity Fragment.getActivity()>
	//   11   21:invokespecial   #161 <Method void registerFragmentWithRoot(Activity)>
	//   12   24:return          
	}

	public void setRequestManager(RequestManager requestmanager)
	{
		requestManager = requestmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #152 <Field RequestManager requestManager>
	//    3    5:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #215 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #216 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(super.toString());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokespecial   #218 <Method String Fragment.toString()>
	//    7   13:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append("{parent=");
	//    9   17:aload_1         
	//   10   18:ldc1            #224 <String "{parent=">
	//   11   20:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(((Object) (getParentFragmentUsingHint())));
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:invokespecial   #226 <Method Fragment getParentFragmentUsingHint()>
	//   16   29:invokevirtual   #229 <Method StringBuilder StringBuilder.append(Object)>
	//   17   32:pop             
		stringbuilder.append("}");
	//   18   33:aload_1         
	//   19   34:ldc1            #231 <String "}">
	//   20   36:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		return stringbuilder.toString();
	//   22   40:aload_1         
	//   23   41:invokevirtual   #232 <Method String StringBuilder.toString()>
	//   24   44:areturn         
	}

	private final Set childRequestManagerFragments;
	private final ActivityFragmentLifecycle lifecycle;
	private Fragment parentFragmentHint;
	private RequestManager requestManager;
	private final RequestManagerTreeNode requestManagerTreeNode;
	private RequestManagerFragment rootRequestManagerFragment;
}
