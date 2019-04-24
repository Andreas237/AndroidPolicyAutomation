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
	class SupportFragmentRequestManagerTreeNode
		implements RequestManagerTreeNode
	{

		public Set getDescendants()
		{
			Object obj = ((Object) (getDescendantRequestManagerFragments()));
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field SupportRequestManagerFragment this$0>
		//    2    4:invokevirtual   #24  <Method Set SupportRequestManagerFragment.getDescendantRequestManagerFragments()>
		//    3    7:astore_2        
			HashSet hashset = new HashSet(((Set) (obj)).size());
		//    4    8:new             #26  <Class HashSet>
		//    5   11:dup             
		//    6   12:aload_2         
		//    7   13:invokeinterface #32  <Method int Set.size()>
		//    8   18:invokespecial   #35  <Method void HashSet(int)>
		//    9   21:astore_1        
			obj = ((Object) (((Set) (obj)).iterator()));
		//   10   22:aload_2         
		//   11   23:invokeinterface #39  <Method Iterator Set.iterator()>
		//   12   28:astore_2        
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
		//   13   29:aload_2         
		//   14   30:invokeinterface #45  <Method boolean Iterator.hasNext()>
		//   15   35:ifeq            67
				SupportRequestManagerFragment supportrequestmanagerfragment = (SupportRequestManagerFragment)((Iterator) (obj)).next();
		//   16   38:aload_2         
		//   17   39:invokeinterface #49  <Method Object Iterator.next()>
		//   18   44:checkcast       #8   <Class SupportRequestManagerFragment>
		//   19   47:astore_3        
				if(supportrequestmanagerfragment.getRequestManager() != null)
		//*  20   48:aload_3         
		//*  21   49:invokevirtual   #53  <Method RequestManager SupportRequestManagerFragment.getRequestManager()>
		//*  22   52:ifnull          64
					hashset.add(((Object) (supportrequestmanagerfragment.getRequestManager())));
		//   23   55:aload_1         
		//   24   56:aload_3         
		//   25   57:invokevirtual   #53  <Method RequestManager SupportRequestManagerFragment.getRequestManager()>
		//   26   60:invokevirtual   #57  <Method boolean HashSet.add(Object)>
		//   27   63:pop             
			} while(true);
		//   28   64:goto            29
			return ((Set) (hashset));
		//   29   67:aload_1         
		//   30   68:areturn         
		}

		public String toString()
		{
			return (new StringBuilder()).append(super.toString()).append("{fragment=").append(((Object) (SupportRequestManagerFragment.this))).append("}").toString();
		//    0    0:new             #63  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #64  <Method void StringBuilder()>
		//    3    7:aload_0         
		//    4    8:invokespecial   #66  <Method String Object.toString()>
		//    5   11:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
		//    6   14:ldc1            #72  <String "{fragment=">
		//    7   16:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
		//    8   19:aload_0         
		//    9   20:getfield        #15  <Field SupportRequestManagerFragment this$0>
		//   10   23:invokevirtual   #75  <Method StringBuilder StringBuilder.append(Object)>
		//   11   26:ldc1            #77  <String "}">
		//   12   28:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
		//   13   31:invokevirtual   #78  <Method String StringBuilder.toString()>
		//   14   34:areturn         
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
	//    1    1:invokespecial   #39  <Method void Fragment()>
		requestManagerTreeNode = ((RequestManagerTreeNode) (new SupportFragmentRequestManagerTreeNode()));
	//    2    4:aload_0         
	//    3    5:new             #6   <Class SupportRequestManagerFragment$SupportFragmentRequestManagerTreeNode>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #42  <Method void SupportRequestManagerFragment$SupportFragmentRequestManagerTreeNode(SupportRequestManagerFragment)>
	//    7   13:putfield        #44  <Field RequestManagerTreeNode requestManagerTreeNode>
		childRequestManagerFragments = new HashSet();
	//    8   16:aload_0         
	//    9   17:new             #46  <Class HashSet>
	//   10   20:dup             
	//   11   21:invokespecial   #47  <Method void HashSet()>
	//   12   24:putfield        #49  <Field HashSet childRequestManagerFragments>
		lifecycle = activityfragmentlifecycle;
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:putfield        #51  <Field ActivityFragmentLifecycle lifecycle>
	//   16   32:return          
	}

	private void addChildRequestManagerFragment(SupportRequestManagerFragment supportrequestmanagerfragment)
	{
		childRequestManagerFragments.add(((Object) (supportrequestmanagerfragment)));
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field HashSet childRequestManagerFragments>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #57  <Method boolean HashSet.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	private Fragment getParentFragmentUsingHint()
	{
		Fragment fragment = getParentFragment();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #62  <Method Fragment getParentFragment()>
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
	//    8   12:getfield        #64  <Field Fragment parentFragmentHint>
	//    9   15:areturn         
	}

	private boolean isDescendant(Fragment fragment)
	{
		Fragment fragment1 = getParentFragmentUsingHint();
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method Fragment getParentFragmentUsingHint()>
	//    2    4:astore_2        
		for(; fragment.getParentFragment() != null; fragment = fragment.getParentFragment())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #69  <Method Fragment Fragment.getParentFragment()>
	//*   5    9:ifnull          30
			if(fragment.getParentFragment() == fragment1)
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #69  <Method Fragment Fragment.getParentFragment()>
	//*   8   16:aload_2         
	//*   9   17:if_acmpne       22
				return true;
	//   10   20:iconst_1        
	//   11   21:ireturn         

	//   12   22:aload_1         
	//   13   23:invokevirtual   #69  <Method Fragment Fragment.getParentFragment()>
	//   14   26:astore_1        
	//*  15   27:goto            5
		return false;
	//   16   30:iconst_0        
	//   17   31:ireturn         
	}

	private void registerFragmentWithRoot(FragmentActivity fragmentactivity)
	{
		unregisterFragmentWithRoot();
	//    0    0:aload_0         
	//    1    1:invokespecial   #74  <Method void unregisterFragmentWithRoot()>
		rootRequestManagerFragment = Glide.get(((Context) (fragmentactivity))).getRequestManagerRetriever().getSupportRequestManagerFragment(fragmentactivity.getSupportFragmentManager(), ((Fragment) (null)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #80  <Method Glide Glide.get(Context)>
	//    5    9:invokevirtual   #84  <Method RequestManagerRetriever Glide.getRequestManagerRetriever()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #90  <Method android.support.v4.app.FragmentManager FragmentActivity.getSupportFragmentManager()>
	//    8   16:aconst_null     
	//    9   17:invokevirtual   #96  <Method SupportRequestManagerFragment RequestManagerRetriever.getSupportRequestManagerFragment(android.support.v4.app.FragmentManager, Fragment)>
	//   10   20:putfield        #98  <Field SupportRequestManagerFragment rootRequestManagerFragment>
		if(rootRequestManagerFragment != this)
	//*  11   23:aload_0         
	//*  12   24:getfield        #98  <Field SupportRequestManagerFragment rootRequestManagerFragment>
	//*  13   27:aload_0         
	//*  14   28:if_acmpeq       39
			rootRequestManagerFragment.addChildRequestManagerFragment(this);
	//   15   31:aload_0         
	//   16   32:getfield        #98  <Field SupportRequestManagerFragment rootRequestManagerFragment>
	//   17   35:aload_0         
	//   18   36:invokespecial   #100 <Method void addChildRequestManagerFragment(SupportRequestManagerFragment)>
	//   19   39:return          
	}

	private void removeChildRequestManagerFragment(SupportRequestManagerFragment supportrequestmanagerfragment)
	{
		childRequestManagerFragments.remove(((Object) (supportrequestmanagerfragment)));
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field HashSet childRequestManagerFragments>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #104 <Method boolean HashSet.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	private void unregisterFragmentWithRoot()
	{
		if(rootRequestManagerFragment != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field SupportRequestManagerFragment rootRequestManagerFragment>
	//*   2    4:ifnull          20
		{
			rootRequestManagerFragment.removeChildRequestManagerFragment(this);
	//    3    7:aload_0         
	//    4    8:getfield        #98  <Field SupportRequestManagerFragment rootRequestManagerFragment>
	//    5   11:aload_0         
	//    6   12:invokespecial   #106 <Method void removeChildRequestManagerFragment(SupportRequestManagerFragment)>
			rootRequestManagerFragment = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #98  <Field SupportRequestManagerFragment rootRequestManagerFragment>
		}
	//   10   20:return          
	}

	public Set getDescendantRequestManagerFragments()
	{
		if(rootRequestManagerFragment == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field SupportRequestManagerFragment rootRequestManagerFragment>
	//*   2    4:ifnonnull       11
			return Collections.emptySet();
	//    3    7:invokestatic    #113 <Method Set Collections.emptySet()>
	//    4   10:areturn         
		if(rootRequestManagerFragment == this)
	//*   5   11:aload_0         
	//*   6   12:getfield        #98  <Field SupportRequestManagerFragment rootRequestManagerFragment>
	//*   7   15:aload_0         
	//*   8   16:if_acmpne       27
			return Collections.unmodifiableSet(((Set) (childRequestManagerFragments)));
	//    9   19:aload_0         
	//   10   20:getfield        #49  <Field HashSet childRequestManagerFragments>
	//   11   23:invokestatic    #117 <Method Set Collections.unmodifiableSet(Set)>
	//   12   26:areturn         
		HashSet hashset = new HashSet();
	//   13   27:new             #46  <Class HashSet>
	//   14   30:dup             
	//   15   31:invokespecial   #47  <Method void HashSet()>
	//   16   34:astore_1        
		Iterator iterator = rootRequestManagerFragment.getDescendantRequestManagerFragments().iterator();
	//   17   35:aload_0         
	//   18   36:getfield        #98  <Field SupportRequestManagerFragment rootRequestManagerFragment>
	//   19   39:invokevirtual   #119 <Method Set getDescendantRequestManagerFragments()>
	//   20   42:invokeinterface #125 <Method Iterator Set.iterator()>
	//   21   47:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//   22   48:aload_2         
	//   23   49:invokeinterface #131 <Method boolean Iterator.hasNext()>
	//   24   54:ifeq            87
			SupportRequestManagerFragment supportrequestmanagerfragment = (SupportRequestManagerFragment)iterator.next();
	//   25   57:aload_2         
	//   26   58:invokeinterface #135 <Method Object Iterator.next()>
	//   27   63:checkcast       #2   <Class SupportRequestManagerFragment>
	//   28   66:astore_3        
			if(isDescendant(supportrequestmanagerfragment.getParentFragmentUsingHint()))
	//*  29   67:aload_0         
	//*  30   68:aload_3         
	//*  31   69:invokespecial   #68  <Method Fragment getParentFragmentUsingHint()>
	//*  32   72:invokespecial   #137 <Method boolean isDescendant(Fragment)>
	//*  33   75:ifeq            84
				hashset.add(((Object) (supportrequestmanagerfragment)));
	//   34   78:aload_1         
	//   35   79:aload_3         
	//   36   80:invokevirtual   #57  <Method boolean HashSet.add(Object)>
	//   37   83:pop             
		} while(true);
	//   38   84:goto            48
		return Collections.unmodifiableSet(((Set) (hashset)));
	//   39   87:aload_1         
	//   40   88:invokestatic    #117 <Method Set Collections.unmodifiableSet(Set)>
	//   41   91:areturn         
	}

	ActivityFragmentLifecycle getGlideLifecycle()
	{
		return lifecycle;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field ActivityFragmentLifecycle lifecycle>
	//    2    4:areturn         
	}

	public RequestManager getRequestManager()
	{
		return requestManager;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field RequestManager requestManager>
	//    2    4:areturn         
	}

	public RequestManagerTreeNode getRequestManagerTreeNode()
	{
		return requestManagerTreeNode;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field RequestManagerTreeNode requestManagerTreeNode>
	//    2    4:areturn         
	}

	public void onAttach(Context context)
	{
		super.onAttach(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #153 <Method void Fragment.onAttach(Context)>
		try
		{
			registerFragmentWithRoot(getActivity());
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #157 <Method FragmentActivity getActivity()>
	//    6   10:invokespecial   #159 <Method void registerFragmentWithRoot(FragmentActivity)>
			return;
	//    7   13:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context) { }
	//    8   14:astore_1        
		if(Log.isLoggable("SupportRMFragment", 5))
	//*   9   15:ldc1            #11  <String "SupportRMFragment">
	//*  10   17:iconst_5        
	//*  11   18:invokestatic    #165 <Method boolean Log.isLoggable(String, int)>
	//*  12   21:ifeq            33
			Log.w("SupportRMFragment", "Unable to register fragment with root", ((Throwable) (context)));
	//   13   24:ldc1            #11  <String "SupportRMFragment">
	//   14   26:ldc1            #167 <String "Unable to register fragment with root">
	//   15   28:aload_1         
	//   16   29:invokestatic    #171 <Method int Log.w(String, String, Throwable)>
	//   17   32:pop             
	//   18   33:return          
	}

	public void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #174 <Method void Fragment.onDestroy()>
		lifecycle.onDestroy();
	//    2    4:aload_0         
	//    3    5:getfield        #51  <Field ActivityFragmentLifecycle lifecycle>
	//    4    8:invokevirtual   #175 <Method void ActivityFragmentLifecycle.onDestroy()>
		unregisterFragmentWithRoot();
	//    5   11:aload_0         
	//    6   12:invokespecial   #74  <Method void unregisterFragmentWithRoot()>
	//    7   15:return          
	}

	public void onDetach()
	{
		super.onDetach();
	//    0    0:aload_0         
	//    1    1:invokespecial   #178 <Method void Fragment.onDetach()>
		parentFragmentHint = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #64  <Field Fragment parentFragmentHint>
		unregisterFragmentWithRoot();
	//    5    9:aload_0         
	//    6   10:invokespecial   #74  <Method void unregisterFragmentWithRoot()>
	//    7   13:return          
	}

	public void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #181 <Method void Fragment.onStart()>
		lifecycle.onStart();
	//    2    4:aload_0         
	//    3    5:getfield        #51  <Field ActivityFragmentLifecycle lifecycle>
	//    4    8:invokevirtual   #182 <Method void ActivityFragmentLifecycle.onStart()>
	//    5   11:return          
	}

	public void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #185 <Method void Fragment.onStop()>
		lifecycle.onStop();
	//    2    4:aload_0         
	//    3    5:getfield        #51  <Field ActivityFragmentLifecycle lifecycle>
	//    4    8:invokevirtual   #186 <Method void ActivityFragmentLifecycle.onStop()>
	//    5   11:return          
	}

	void setParentFragmentHint(Fragment fragment)
	{
		parentFragmentHint = fragment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #64  <Field Fragment parentFragmentHint>
		if(fragment != null && fragment.getActivity() != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          24
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #189 <Method FragmentActivity Fragment.getActivity()>
	//*   7   13:ifnull          24
			registerFragmentWithRoot(fragment.getActivity());
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #189 <Method FragmentActivity Fragment.getActivity()>
	//   11   21:invokespecial   #159 <Method void registerFragmentWithRoot(FragmentActivity)>
	//   12   24:return          
	}

	public void setRequestManager(RequestManager requestmanager)
	{
		requestManager = requestmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #145 <Field RequestManager requestManager>
	//    3    5:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append(super.toString()).append("{parent=").append(((Object) (getParentFragmentUsingHint()))).append("}").toString();
	//    0    0:new             #195 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #196 <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokespecial   #198 <Method String Fragment.toString()>
	//    5   11:invokevirtual   #202 <Method StringBuilder StringBuilder.append(String)>
	//    6   14:ldc1            #204 <String "{parent=">
	//    7   16:invokevirtual   #202 <Method StringBuilder StringBuilder.append(String)>
	//    8   19:aload_0         
	//    9   20:invokespecial   #68  <Method Fragment getParentFragmentUsingHint()>
	//   10   23:invokevirtual   #207 <Method StringBuilder StringBuilder.append(Object)>
	//   11   26:ldc1            #209 <String "}">
	//   12   28:invokevirtual   #202 <Method StringBuilder StringBuilder.append(String)>
	//   13   31:invokevirtual   #210 <Method String StringBuilder.toString()>
	//   14   34:areturn         
	}

	private static final String TAG = "SupportRMFragment";
	private final HashSet childRequestManagerFragments;
	private final ActivityFragmentLifecycle lifecycle;
	private Fragment parentFragmentHint;
	private RequestManager requestManager;
	private final RequestManagerTreeNode requestManagerTreeNode;
	private SupportRequestManagerFragment rootRequestManagerFragment;
}
