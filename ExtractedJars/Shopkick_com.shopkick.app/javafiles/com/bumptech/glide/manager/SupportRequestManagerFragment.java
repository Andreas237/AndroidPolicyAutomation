// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.manager;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import java.util.*;

// Referenced classes of package com.bumptech.glide.manager:
//			ActivityFragmentLifecycle, RequestManagerRetriever, RequestManagerTreeNode

public class SupportRequestManagerFragment extends Fragment
{
	private class SupportFragmentRequestManagerTreeNode
		implements RequestManagerTreeNode
	{

		public Set getDescendants()
		{
			Object obj = ((Object) (getDescendantRequestManagerFragments()));
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field SupportRequestManagerFragment this$0>
		//    2    4:invokevirtual   #25  <Method Set SupportRequestManagerFragment.getDescendantRequestManagerFragments()>
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
				SupportRequestManagerFragment supportrequestmanagerfragment = (SupportRequestManagerFragment)((Iterator) (obj)).next();
		//   16   38:aload_2         
		//   17   39:invokeinterface #50  <Method Object Iterator.next()>
		//   18   44:checkcast       #8   <Class SupportRequestManagerFragment>
		//   19   47:astore_3        
				if(supportrequestmanagerfragment.getRequestManager() != null)
		//*  20   48:aload_3         
		//*  21   49:invokevirtual   #54  <Method RequestManager SupportRequestManagerFragment.getRequestManager()>
		//*  22   52:ifnull          29
					((Set) (hashset)).add(((Object) (supportrequestmanagerfragment.getRequestManager())));
		//   23   55:aload_1         
		//   24   56:aload_3         
		//   25   57:invokevirtual   #54  <Method RequestManager SupportRequestManagerFragment.getRequestManager()>
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
			stringbuilder.append(((Object) (SupportRequestManagerFragment.this)));
		//   13   24:aload_1         
		//   14   25:aload_0         
		//   15   26:getfield        #15  <Field SupportRequestManagerFragment this$0>
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

		final SupportRequestManagerFragment this$0;

		SupportFragmentRequestManagerTreeNode()
		{
			this$0 = SupportRequestManagerFragment.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field SupportRequestManagerFragment this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}


	public SupportRequestManagerFragment()
	{
		this(new ActivityFragmentLifecycle());
	//    0    0:aload_0         
	//    1    1:new             #29  <Class ActivityFragmentLifecycle>
	//    2    4:dup             
	//    3    5:invokespecial   #31  <Method void ActivityFragmentLifecycle()>
	//    4    8:invokespecial   #34  <Method void SupportRequestManagerFragment(ActivityFragmentLifecycle)>
	//    5   11:return          
	}

	public SupportRequestManagerFragment(ActivityFragmentLifecycle activityfragmentlifecycle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Fragment()>
		requestManagerTreeNode = ((RequestManagerTreeNode) (new SupportFragmentRequestManagerTreeNode()));
	//    2    4:aload_0         
	//    3    5:new             #6   <Class SupportRequestManagerFragment$SupportFragmentRequestManagerTreeNode>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #44  <Method void SupportRequestManagerFragment$SupportFragmentRequestManagerTreeNode(SupportRequestManagerFragment)>
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

	private void addChildRequestManagerFragment(SupportRequestManagerFragment supportrequestmanagerfragment)
	{
		childRequestManagerFragments.add(((Object) (supportrequestmanagerfragment)));
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Set childRequestManagerFragments>
	//    2    4:aload_1         
	//    3    5:invokeinterface #62  <Method boolean Set.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	private Fragment getParentFragmentUsingHint()
	{
		Fragment fragment = getParentFragment();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #67  <Method Fragment getParentFragment()>
	//    2    4:astore_1        
		if(fragment != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return fragment;
	//    5    9:aload_1         
	//    6   10:areturn         
		else
			return parentFragmentHint;
	//    7   11:aload_0         
	//    8   12:getfield        #69  <Field Fragment parentFragmentHint>
	//    9   15:areturn         
	}

	private boolean isDescendant(Fragment fragment)
	{
		Fragment fragment1 = getParentFragmentUsingHint();
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method Fragment getParentFragmentUsingHint()>
	//    2    4:astore_2        
		do
		{
			Fragment fragment2 = fragment.getParentFragment();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #74  <Method Fragment Fragment.getParentFragment()>
	//    5    9:astore_3        
			if(fragment2 != null)
	//*   6   10:aload_3         
	//*   7   11:ifnull          32
			{
				if(fragment2.equals(((Object) (fragment1))))
	//*   8   14:aload_3         
	//*   9   15:aload_2         
	//*  10   16:invokevirtual   #77  <Method boolean Fragment.equals(Object)>
	//*  11   19:ifeq            24
					return true;
	//   12   22:iconst_1        
	//   13   23:ireturn         
				fragment = fragment.getParentFragment();
	//   14   24:aload_1         
	//   15   25:invokevirtual   #74  <Method Fragment Fragment.getParentFragment()>
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

	private void registerFragmentWithRoot(FragmentActivity fragmentactivity)
	{
		unregisterFragmentWithRoot();
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method void unregisterFragmentWithRoot()>
		rootRequestManagerFragment = Glide.get(((Context) (fragmentactivity))).getRequestManagerRetriever().getSupportRequestManagerFragment(fragmentactivity);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #88  <Method Glide Glide.get(Context)>
	//    5    9:invokevirtual   #92  <Method RequestManagerRetriever Glide.getRequestManagerRetriever()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #98  <Method SupportRequestManagerFragment RequestManagerRetriever.getSupportRequestManagerFragment(FragmentActivity)>
	//    8   16:putfield        #100 <Field SupportRequestManagerFragment rootRequestManagerFragment>
		if(!equals(((Object) (rootRequestManagerFragment))))
	//*   9   19:aload_0         
	//*  10   20:aload_0         
	//*  11   21:getfield        #100 <Field SupportRequestManagerFragment rootRequestManagerFragment>
	//*  12   24:invokevirtual   #101 <Method boolean equals(Object)>
	//*  13   27:ifne            38
			rootRequestManagerFragment.addChildRequestManagerFragment(this);
	//   14   30:aload_0         
	//   15   31:getfield        #100 <Field SupportRequestManagerFragment rootRequestManagerFragment>
	//   16   34:aload_0         
	//   17   35:invokespecial   #103 <Method void addChildRequestManagerFragment(SupportRequestManagerFragment)>
	//   18   38:return          
	}

	private void removeChildRequestManagerFragment(SupportRequestManagerFragment supportrequestmanagerfragment)
	{
		childRequestManagerFragments.remove(((Object) (supportrequestmanagerfragment)));
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Set childRequestManagerFragments>
	//    2    4:aload_1         
	//    3    5:invokeinterface #107 <Method boolean Set.remove(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	private void unregisterFragmentWithRoot()
	{
		SupportRequestManagerFragment supportrequestmanagerfragment = rootRequestManagerFragment;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field SupportRequestManagerFragment rootRequestManagerFragment>
	//    2    4:astore_1        
		if(supportrequestmanagerfragment != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          19
		{
			supportrequestmanagerfragment.removeChildRequestManagerFragment(this);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokespecial   #109 <Method void removeChildRequestManagerFragment(SupportRequestManagerFragment)>
			rootRequestManagerFragment = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #100 <Field SupportRequestManagerFragment rootRequestManagerFragment>
		}
	//   11   19:return          
	}

	Set getDescendantRequestManagerFragments()
	{
		Object obj = ((Object) (rootRequestManagerFragment));
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field SupportRequestManagerFragment rootRequestManagerFragment>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       13
			return Collections.emptySet();
	//    5    9:invokestatic    #116 <Method Set Collections.emptySet()>
	//    6   12:areturn         
		if(equals(obj))
	//*   7   13:aload_0         
	//*   8   14:aload_1         
	//*   9   15:invokevirtual   #101 <Method boolean equals(Object)>
	//*  10   18:ifeq            29
			return Collections.unmodifiableSet(childRequestManagerFragments);
	//   11   21:aload_0         
	//   12   22:getfield        #51  <Field Set childRequestManagerFragments>
	//   13   25:invokestatic    #120 <Method Set Collections.unmodifiableSet(Set)>
	//   14   28:areturn         
		obj = ((Object) (new HashSet()));
	//   15   29:new             #48  <Class HashSet>
	//   16   32:dup             
	//   17   33:invokespecial   #49  <Method void HashSet()>
	//   18   36:astore_1        
		Iterator iterator = rootRequestManagerFragment.getDescendantRequestManagerFragments().iterator();
	//   19   37:aload_0         
	//   20   38:getfield        #100 <Field SupportRequestManagerFragment rootRequestManagerFragment>
	//   21   41:invokevirtual   #122 <Method Set getDescendantRequestManagerFragments()>
	//   22   44:invokeinterface #126 <Method Iterator Set.iterator()>
	//   23   49:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//   24   50:aload_2         
	//   25   51:invokeinterface #132 <Method boolean Iterator.hasNext()>
	//   26   56:ifeq            91
			SupportRequestManagerFragment supportrequestmanagerfragment = (SupportRequestManagerFragment)iterator.next();
	//   27   59:aload_2         
	//   28   60:invokeinterface #136 <Method Object Iterator.next()>
	//   29   65:checkcast       #2   <Class SupportRequestManagerFragment>
	//   30   68:astore_3        
			if(isDescendant(supportrequestmanagerfragment.getParentFragmentUsingHint()))
	//*  31   69:aload_0         
	//*  32   70:aload_3         
	//*  33   71:invokespecial   #73  <Method Fragment getParentFragmentUsingHint()>
	//*  34   74:invokespecial   #138 <Method boolean isDescendant(Fragment)>
	//*  35   77:ifeq            50
				((Set) (obj)).add(((Object) (supportrequestmanagerfragment)));
	//   36   80:aload_1         
	//   37   81:aload_3         
	//   38   82:invokeinterface #62  <Method boolean Set.add(Object)>
	//   39   87:pop             
		} while(true);
	//   40   88:goto            50
		return Collections.unmodifiableSet(((Set) (obj)));
	//   41   91:aload_1         
	//   42   92:invokestatic    #120 <Method Set Collections.unmodifiableSet(Set)>
	//   43   95:areturn         
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
	//    1    1:getfield        #146 <Field RequestManager requestManager>
	//    2    4:areturn         
	}

	public RequestManagerTreeNode getRequestManagerTreeNode()
	{
		return requestManagerTreeNode;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field RequestManagerTreeNode requestManagerTreeNode>
	//    2    4:areturn         
	}

	public void onAttach(Context context)
	{
		super.onAttach(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #154 <Method void Fragment.onAttach(Context)>
		try
		{
			registerFragmentWithRoot(getActivity());
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #158 <Method FragmentActivity getActivity()>
	//    6   10:invokespecial   #160 <Method void registerFragmentWithRoot(FragmentActivity)>
			return;
	//    7   13:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context) { }
	//    8   14:astore_1        
		if(Log.isLoggable("SupportRMFragment", 5))
	//*   9   15:ldc1            #11  <String "SupportRMFragment">
	//*  10   17:iconst_5        
	//*  11   18:invokestatic    #166 <Method boolean Log.isLoggable(String, int)>
	//*  12   21:ifeq            33
			Log.w("SupportRMFragment", "Unable to register fragment with root", ((Throwable) (context)));
	//   13   24:ldc1            #11  <String "SupportRMFragment">
	//   14   26:ldc1            #168 <String "Unable to register fragment with root">
	//   15   28:aload_1         
	//   16   29:invokestatic    #172 <Method int Log.w(String, String, Throwable)>
	//   17   32:pop             
	//   18   33:return          
	}

	public void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #175 <Method void Fragment.onDestroy()>
		lifecycle.onDestroy();
	//    2    4:aload_0         
	//    3    5:getfield        #53  <Field ActivityFragmentLifecycle lifecycle>
	//    4    8:invokevirtual   #176 <Method void ActivityFragmentLifecycle.onDestroy()>
		unregisterFragmentWithRoot();
	//    5   11:aload_0         
	//    6   12:invokespecial   #82  <Method void unregisterFragmentWithRoot()>
	//    7   15:return          
	}

	public void onDetach()
	{
		super.onDetach();
	//    0    0:aload_0         
	//    1    1:invokespecial   #179 <Method void Fragment.onDetach()>
		parentFragmentHint = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #69  <Field Fragment parentFragmentHint>
		unregisterFragmentWithRoot();
	//    5    9:aload_0         
	//    6   10:invokespecial   #82  <Method void unregisterFragmentWithRoot()>
	//    7   13:return          
	}

	public void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #182 <Method void Fragment.onStart()>
		lifecycle.onStart();
	//    2    4:aload_0         
	//    3    5:getfield        #53  <Field ActivityFragmentLifecycle lifecycle>
	//    4    8:invokevirtual   #183 <Method void ActivityFragmentLifecycle.onStart()>
	//    5   11:return          
	}

	public void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #186 <Method void Fragment.onStop()>
		lifecycle.onStop();
	//    2    4:aload_0         
	//    3    5:getfield        #53  <Field ActivityFragmentLifecycle lifecycle>
	//    4    8:invokevirtual   #187 <Method void ActivityFragmentLifecycle.onStop()>
	//    5   11:return          
	}

	void setParentFragmentHint(Fragment fragment)
	{
		parentFragmentHint = fragment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #69  <Field Fragment parentFragmentHint>
		if(fragment != null && fragment.getActivity() != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          24
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #190 <Method FragmentActivity Fragment.getActivity()>
	//*   7   13:ifnull          24
			registerFragmentWithRoot(fragment.getActivity());
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #190 <Method FragmentActivity Fragment.getActivity()>
	//   11   21:invokespecial   #160 <Method void registerFragmentWithRoot(FragmentActivity)>
	//   12   24:return          
	}

	public void setRequestManager(RequestManager requestmanager)
	{
		requestManager = requestmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #146 <Field RequestManager requestManager>
	//    3    5:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #196 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #197 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(super.toString());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokespecial   #199 <Method String Fragment.toString()>
	//    7   13:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append("{parent=");
	//    9   17:aload_1         
	//   10   18:ldc1            #205 <String "{parent=">
	//   11   20:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(((Object) (getParentFragmentUsingHint())));
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:invokespecial   #73  <Method Fragment getParentFragmentUsingHint()>
	//   16   29:invokevirtual   #208 <Method StringBuilder StringBuilder.append(Object)>
	//   17   32:pop             
		stringbuilder.append("}");
	//   18   33:aload_1         
	//   19   34:ldc1            #210 <String "}">
	//   20   36:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		return stringbuilder.toString();
	//   22   40:aload_1         
	//   23   41:invokevirtual   #211 <Method String StringBuilder.toString()>
	//   24   44:areturn         
	}

	private static final String TAG = "SupportRMFragment";
	private final Set childRequestManagerFragments;
	private final ActivityFragmentLifecycle lifecycle;
	private Fragment parentFragmentHint;
	private RequestManager requestManager;
	private final RequestManagerTreeNode requestManagerTreeNode;
	private SupportRequestManagerFragment rootRequestManagerFragment;
}
