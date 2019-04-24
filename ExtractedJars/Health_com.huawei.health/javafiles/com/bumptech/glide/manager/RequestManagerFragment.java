// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import java.util.*;

// Referenced classes of package com.bumptech.glide.manager:
//			ActivityFragmentLifecycle, RequestManagerRetriever, RequestManagerTreeNode

public class RequestManagerFragment extends Fragment
{
	class FragmentRequestManagerTreeNode
		implements RequestManagerTreeNode
	{

		public Set getDescendants()
		{
			Object obj = ((Object) (getDescendantRequestManagerFragments()));
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field RequestManagerFragment this$0>
		//    2    4:invokevirtual   #24  <Method Set RequestManagerFragment.getDescendantRequestManagerFragments()>
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
				RequestManagerFragment requestmanagerfragment = (RequestManagerFragment)((Iterator) (obj)).next();
		//   16   38:aload_2         
		//   17   39:invokeinterface #49  <Method Object Iterator.next()>
		//   18   44:checkcast       #8   <Class RequestManagerFragment>
		//   19   47:astore_3        
				if(requestmanagerfragment.getRequestManager() != null)
		//*  20   48:aload_3         
		//*  21   49:invokevirtual   #53  <Method RequestManager RequestManagerFragment.getRequestManager()>
		//*  22   52:ifnull          64
					hashset.add(((Object) (requestmanagerfragment.getRequestManager())));
		//   23   55:aload_1         
		//   24   56:aload_3         
		//   25   57:invokevirtual   #53  <Method RequestManager RequestManagerFragment.getRequestManager()>
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
			return (new StringBuilder()).append(super.toString()).append("{fragment=").append(((Object) (RequestManagerFragment.this))).append("}").toString();
		//    0    0:new             #63  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #64  <Method void StringBuilder()>
		//    3    7:aload_0         
		//    4    8:invokespecial   #66  <Method String Object.toString()>
		//    5   11:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
		//    6   14:ldc1            #72  <String "{fragment=">
		//    7   16:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
		//    8   19:aload_0         
		//    9   20:getfield        #15  <Field RequestManagerFragment this$0>
		//   10   23:invokevirtual   #75  <Method StringBuilder StringBuilder.append(Object)>
		//   11   26:ldc1            #77  <String "}">
		//   12   28:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
		//   13   31:invokevirtual   #78  <Method String StringBuilder.toString()>
		//   14   34:areturn         
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
	//    1    1:invokespecial   #39  <Method void Fragment()>
		requestManagerTreeNode = ((RequestManagerTreeNode) (new FragmentRequestManagerTreeNode()));
	//    2    4:aload_0         
	//    3    5:new             #6   <Class RequestManagerFragment$FragmentRequestManagerTreeNode>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #42  <Method void RequestManagerFragment$FragmentRequestManagerTreeNode(RequestManagerFragment)>
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

	private void addChildRequestManagerFragment(RequestManagerFragment requestmanagerfragment)
	{
		childRequestManagerFragments.add(((Object) (requestmanagerfragment)));
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field HashSet childRequestManagerFragments>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #57  <Method boolean HashSet.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	private Fragment getParentFragmentUsingHint()
	{
		Fragment fragment;
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #67  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          16
			fragment = getParentFragment();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #70  <Method Fragment getParentFragment()>
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
	//   14   25:getfield        #72  <Field Fragment parentFragmentHint>
	//   15   28:areturn         
	}

	private boolean isDescendant(Fragment fragment)
	{
		Fragment fragment1 = getParentFragment();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method Fragment getParentFragment()>
	//    2    4:astore_2        
		for(; fragment.getParentFragment() != null; fragment = fragment.getParentFragment())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #75  <Method Fragment Fragment.getParentFragment()>
	//*   5    9:ifnull          30
			if(fragment.getParentFragment() == fragment1)
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #75  <Method Fragment Fragment.getParentFragment()>
	//*   8   16:aload_2         
	//*   9   17:if_acmpne       22
				return true;
	//   10   20:iconst_1        
	//   11   21:ireturn         

	//   12   22:aload_1         
	//   13   23:invokevirtual   #75  <Method Fragment Fragment.getParentFragment()>
	//   14   26:astore_1        
	//*  15   27:goto            5
		return false;
	//   16   30:iconst_0        
	//   17   31:ireturn         
	}

	private void registerFragmentWithRoot(Activity activity)
	{
		unregisterFragmentWithRoot();
	//    0    0:aload_0         
	//    1    1:invokespecial   #80  <Method void unregisterFragmentWithRoot()>
		rootRequestManagerFragment = Glide.get(((android.content.Context) (activity))).getRequestManagerRetriever().getRequestManagerFragment(activity.getFragmentManager(), ((Fragment) (null)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #86  <Method Glide Glide.get(android.content.Context)>
	//    5    9:invokevirtual   #90  <Method RequestManagerRetriever Glide.getRequestManagerRetriever()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #96  <Method android.app.FragmentManager Activity.getFragmentManager()>
	//    8   16:aconst_null     
	//    9   17:invokevirtual   #102 <Method RequestManagerFragment RequestManagerRetriever.getRequestManagerFragment(android.app.FragmentManager, Fragment)>
	//   10   20:putfield        #104 <Field RequestManagerFragment rootRequestManagerFragment>
		if(rootRequestManagerFragment != this)
	//*  11   23:aload_0         
	//*  12   24:getfield        #104 <Field RequestManagerFragment rootRequestManagerFragment>
	//*  13   27:aload_0         
	//*  14   28:if_acmpeq       39
			rootRequestManagerFragment.addChildRequestManagerFragment(this);
	//   15   31:aload_0         
	//   16   32:getfield        #104 <Field RequestManagerFragment rootRequestManagerFragment>
	//   17   35:aload_0         
	//   18   36:invokespecial   #106 <Method void addChildRequestManagerFragment(RequestManagerFragment)>
	//   19   39:return          
	}

	private void removeChildRequestManagerFragment(RequestManagerFragment requestmanagerfragment)
	{
		childRequestManagerFragments.remove(((Object) (requestmanagerfragment)));
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field HashSet childRequestManagerFragments>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #110 <Method boolean HashSet.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	private void unregisterFragmentWithRoot()
	{
		if(rootRequestManagerFragment != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #104 <Field RequestManagerFragment rootRequestManagerFragment>
	//*   2    4:ifnull          20
		{
			rootRequestManagerFragment.removeChildRequestManagerFragment(this);
	//    3    7:aload_0         
	//    4    8:getfield        #104 <Field RequestManagerFragment rootRequestManagerFragment>
	//    5   11:aload_0         
	//    6   12:invokespecial   #112 <Method void removeChildRequestManagerFragment(RequestManagerFragment)>
			rootRequestManagerFragment = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #104 <Field RequestManagerFragment rootRequestManagerFragment>
		}
	//   10   20:return          
	}

	public Set getDescendantRequestManagerFragments()
	{
		if(rootRequestManagerFragment == this)
	//*   0    0:aload_0         
	//*   1    1:getfield        #104 <Field RequestManagerFragment rootRequestManagerFragment>
	//*   2    4:aload_0         
	//*   3    5:if_acmpne       16
			return Collections.unmodifiableSet(((Set) (childRequestManagerFragments)));
	//    4    8:aload_0         
	//    5    9:getfield        #49  <Field HashSet childRequestManagerFragments>
	//    6   12:invokestatic    #120 <Method Set Collections.unmodifiableSet(Set)>
	//    7   15:areturn         
		if(rootRequestManagerFragment == null || android.os.Build.VERSION.SDK_INT < 17)
	//*   8   16:aload_0         
	//*   9   17:getfield        #104 <Field RequestManagerFragment rootRequestManagerFragment>
	//*  10   20:ifnull          31
	//*  11   23:getstatic       #67  <Field int android.os.Build$VERSION.SDK_INT>
	//*  12   26:bipush          17
	//*  13   28:icmpge          35
			return Collections.emptySet();
	//   14   31:invokestatic    #123 <Method Set Collections.emptySet()>
	//   15   34:areturn         
		HashSet hashset = new HashSet();
	//   16   35:new             #46  <Class HashSet>
	//   17   38:dup             
	//   18   39:invokespecial   #47  <Method void HashSet()>
	//   19   42:astore_1        
		Iterator iterator = rootRequestManagerFragment.getDescendantRequestManagerFragments().iterator();
	//   20   43:aload_0         
	//   21   44:getfield        #104 <Field RequestManagerFragment rootRequestManagerFragment>
	//   22   47:invokevirtual   #125 <Method Set getDescendantRequestManagerFragments()>
	//   23   50:invokeinterface #131 <Method Iterator Set.iterator()>
	//   24   55:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//   25   56:aload_2         
	//   26   57:invokeinterface #137 <Method boolean Iterator.hasNext()>
	//   27   62:ifeq            95
			RequestManagerFragment requestmanagerfragment = (RequestManagerFragment)iterator.next();
	//   28   65:aload_2         
	//   29   66:invokeinterface #141 <Method Object Iterator.next()>
	//   30   71:checkcast       #2   <Class RequestManagerFragment>
	//   31   74:astore_3        
			if(isDescendant(requestmanagerfragment.getParentFragment()))
	//*  32   75:aload_0         
	//*  33   76:aload_3         
	//*  34   77:invokevirtual   #70  <Method Fragment getParentFragment()>
	//*  35   80:invokespecial   #143 <Method boolean isDescendant(Fragment)>
	//*  36   83:ifeq            92
				hashset.add(((Object) (requestmanagerfragment)));
	//   37   86:aload_1         
	//   38   87:aload_3         
	//   39   88:invokevirtual   #57  <Method boolean HashSet.add(Object)>
	//   40   91:pop             
		} while(true);
	//   41   92:goto            56
		return Collections.unmodifiableSet(((Set) (hashset)));
	//   42   95:aload_1         
	//   43   96:invokestatic    #120 <Method Set Collections.unmodifiableSet(Set)>
	//   44   99:areturn         
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
	//    1    1:getfield        #151 <Field RequestManager requestManager>
	//    2    4:areturn         
	}

	public RequestManagerTreeNode getRequestManagerTreeNode()
	{
		return requestManagerTreeNode;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field RequestManagerTreeNode requestManagerTreeNode>
	//    2    4:areturn         
	}

	public void onAttach(Activity activity)
	{
		super.onAttach(activity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #158 <Method void Fragment.onAttach(Activity)>
		try
		{
			registerFragmentWithRoot(activity);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #160 <Method void registerFragmentWithRoot(Activity)>
			return;
	//    6   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(Activity activity) { }
	//    7   11:astore_1        
		if(Log.isLoggable("RMFragment", 5))
	//*   8   12:ldc1            #11  <String "RMFragment">
	//*   9   14:iconst_5        
	//*  10   15:invokestatic    #166 <Method boolean Log.isLoggable(String, int)>
	//*  11   18:ifeq            30
			Log.w("RMFragment", "Unable to register fragment with root", ((Throwable) (activity)));
	//   12   21:ldc1            #11  <String "RMFragment">
	//   13   23:ldc1            #168 <String "Unable to register fragment with root">
	//   14   25:aload_1         
	//   15   26:invokestatic    #172 <Method int Log.w(String, String, Throwable)>
	//   16   29:pop             
	//   17   30:return          
	}

	public void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #175 <Method void Fragment.onDestroy()>
		lifecycle.onDestroy();
	//    2    4:aload_0         
	//    3    5:getfield        #51  <Field ActivityFragmentLifecycle lifecycle>
	//    4    8:invokevirtual   #176 <Method void ActivityFragmentLifecycle.onDestroy()>
		unregisterFragmentWithRoot();
	//    5   11:aload_0         
	//    6   12:invokespecial   #80  <Method void unregisterFragmentWithRoot()>
	//    7   15:return          
	}

	public void onDetach()
	{
		super.onDetach();
	//    0    0:aload_0         
	//    1    1:invokespecial   #179 <Method void Fragment.onDetach()>
		unregisterFragmentWithRoot();
	//    2    4:aload_0         
	//    3    5:invokespecial   #80  <Method void unregisterFragmentWithRoot()>
	//    4    8:return          
	}

	public void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #182 <Method void Fragment.onStart()>
		lifecycle.onStart();
	//    2    4:aload_0         
	//    3    5:getfield        #51  <Field ActivityFragmentLifecycle lifecycle>
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
	//    3    5:getfield        #51  <Field ActivityFragmentLifecycle lifecycle>
	//    4    8:invokevirtual   #187 <Method void ActivityFragmentLifecycle.onStop()>
	//    5   11:return          
	}

	void setParentFragmentHint(Fragment fragment)
	{
		parentFragmentHint = fragment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #72  <Field Fragment parentFragmentHint>
		if(fragment != null && fragment.getActivity() != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          24
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #193 <Method Activity Fragment.getActivity()>
	//*   7   13:ifnull          24
			registerFragmentWithRoot(fragment.getActivity());
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #193 <Method Activity Fragment.getActivity()>
	//   11   21:invokespecial   #160 <Method void registerFragmentWithRoot(Activity)>
	//   12   24:return          
	}

	public void setRequestManager(RequestManager requestmanager)
	{
		requestManager = requestmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #151 <Field RequestManager requestManager>
	//    3    5:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append(super.toString()).append("{parent=").append(((Object) (getParentFragmentUsingHint()))).append("}").toString();
	//    0    0:new             #199 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #200 <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokespecial   #202 <Method String Fragment.toString()>
	//    5   11:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//    6   14:ldc1            #208 <String "{parent=">
	//    7   16:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//    8   19:aload_0         
	//    9   20:invokespecial   #210 <Method Fragment getParentFragmentUsingHint()>
	//   10   23:invokevirtual   #213 <Method StringBuilder StringBuilder.append(Object)>
	//   11   26:ldc1            #215 <String "}">
	//   12   28:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   13   31:invokevirtual   #216 <Method String StringBuilder.toString()>
	//   14   34:areturn         
	}

	private static final String TAG = "RMFragment";
	private final HashSet childRequestManagerFragments;
	private final ActivityFragmentLifecycle lifecycle;
	private Fragment parentFragmentHint;
	private RequestManager requestManager;
	private final RequestManagerTreeNode requestManagerTreeNode;
	private RequestManagerFragment rootRequestManagerFragment;
}
