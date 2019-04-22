// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.firebase.client.core.Path;
import com.firebase.client.core.Repo;
import com.firebase.client.core.ValidationPath;
import com.firebase.client.snapshot.Node;
import com.firebase.client.snapshot.NodeUtilities;
import com.firebase.client.snapshot.PriorityUtilities;
import com.firebase.client.utilities.Validation;
import com.firebase.client.utilities.encoding.JsonHelpers;
import java.util.Map;

// Referenced classes of package com.firebase.client:
//			FirebaseException

public class OnDisconnect
{

	OnDisconnect(Repo repo1, Path path1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		repo = repo1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field Repo repo>
		path = path1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field Path path>
	//    8   14:return          
	}

	private void onDisconnectSetInternal(final Object node, Node node1, final Firebase.CompletionListener onComplete)
	{
		Validation.validateWritablePath(path);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Path path>
	//    2    4:invokestatic    #38  <Method void Validation.validateWritablePath(Path)>
		ValidationPath.validateWithObject(path, node);
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field Path path>
	//    5   11:aload_1         
	//    6   12:invokestatic    #44  <Method void ValidationPath.validateWithObject(Path, Object)>
		try
		{
			node = JsonHelpers.getMapper().convertValue(node, java/lang/Object);
	//    7   15:invokestatic    #50  <Method ObjectMapper JsonHelpers.getMapper()>
	//    8   18:aload_1         
	//    9   19:ldc1            #4   <Class Object>
	//   10   21:invokevirtual   #56  <Method Object ObjectMapper.convertValue(Object, Class)>
	//   11   24:astore_1        
			Validation.validateWritableObject(node);
	//   12   25:aload_1         
	//   13   26:invokestatic    #60  <Method void Validation.validateWritableObject(Object)>
			node = ((Object) (NodeUtilities.NodeFromJSON(node, node1)));
	//   14   29:aload_1         
	//   15   30:aload_2         
	//   16   31:invokestatic    #66  <Method Node NodeUtilities.NodeFromJSON(Object, Node)>
	//   17   34:astore_1        
			repo.scheduleNow(new Runnable() {

				public void run()
				{
					repo.onDisconnectSetValue(path, node, onComplete);
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field OnDisconnect this$0>
				//    2    4:invokestatic    #34  <Method Repo OnDisconnect.access$100(OnDisconnect)>
				//    3    7:aload_0         
				//    4    8:getfield        #21  <Field OnDisconnect this$0>
				//    5   11:invokestatic    #38  <Method Path OnDisconnect.access$000(OnDisconnect)>
				//    6   14:aload_0         
				//    7   15:getfield        #23  <Field Node val$node>
				//    8   18:aload_0         
				//    9   19:getfield        #25  <Field Firebase$CompletionListener val$onComplete>
				//   10   22:invokevirtual   #44  <Method void Repo.onDisconnectSetValue(Path, Node, Firebase$CompletionListener)>
				//   11   25:return          
				}

				final OnDisconnect this$0;
				final Node val$node;
				final Firebase.CompletionListener val$onComplete;

			
			{
				this$0 = OnDisconnect.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field OnDisconnect this$0>
				node = node1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field Node val$node>
				onComplete = completionlistener;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field Firebase$CompletionListener val$onComplete>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//   18   35:aload_0         
	//   19   36:getfield        #21  <Field Repo repo>
	//   20   39:new             #6   <Class OnDisconnect$1>
	//   21   42:dup             
	//   22   43:aload_0         
	//   23   44:aload_1         
	//   24   45:aload_3         
	//   25   46:invokespecial   #69  <Method void OnDisconnect$1(OnDisconnect, Node, Firebase$CompletionListener)>
	//   26   49:invokevirtual   #75  <Method void Repo.scheduleNow(Runnable)>
			return;
	//   27   52:return          
		}
		// Misplaced declaration of an exception variable
		catch(final Object node)
	//*  28   53:astore_1        
		{
			throw new FirebaseException("Failed to parse to snapshot", ((Throwable) (node)));
	//   29   54:new             #77  <Class FirebaseException>
	//   30   57:dup             
	//   31   58:ldc1            #79  <String "Failed to parse to snapshot">
	//   32   60:aload_1         
	//   33   61:invokespecial   #82  <Method void FirebaseException(String, Throwable)>
	//   34   64:athrow          
		}
	}

	public void cancel()
	{
		cancel(((Firebase.CompletionListener) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #86  <Method void cancel(Firebase$CompletionListener)>
	//    3    5:return          
	}

	public void cancel(final Firebase.CompletionListener listener)
	{
		repo.scheduleNow(new Runnable() {

			public void run()
			{
				repo.onDisconnectCancel(path, listener);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field OnDisconnect this$0>
			//    2    4:invokestatic    #30  <Method Repo OnDisconnect.access$100(OnDisconnect)>
			//    3    7:aload_0         
			//    4    8:getfield        #19  <Field OnDisconnect this$0>
			//    5   11:invokestatic    #34  <Method Path OnDisconnect.access$000(OnDisconnect)>
			//    6   14:aload_0         
			//    7   15:getfield        #21  <Field Firebase$CompletionListener val$listener>
			//    8   18:invokevirtual   #40  <Method void Repo.onDisconnectCancel(Path, Firebase$CompletionListener)>
			//    9   21:return          
			}

			final OnDisconnect this$0;
			final Firebase.CompletionListener val$listener;

			
			{
				this$0 = OnDisconnect.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field OnDisconnect this$0>
				listener = completionlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Firebase$CompletionListener val$listener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Repo repo>
	//    2    4:new             #10  <Class OnDisconnect$3>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #89  <Method void OnDisconnect$3(OnDisconnect, Firebase$CompletionListener)>
	//    7   13:invokevirtual   #75  <Method void Repo.scheduleNow(Runnable)>
	//    8   16:return          
	}

	public void removeValue()
	{
		setValue(((Object) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #93  <Method void setValue(Object)>
	//    3    5:return          
	}

	public void removeValue(Firebase.CompletionListener completionlistener)
	{
		setValue(((Object) (null)), completionlistener);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokevirtual   #96  <Method void setValue(Object, Firebase$CompletionListener)>
	//    4    6:return          
	}

	public void setValue(Object obj)
	{
		onDisconnectSetInternal(obj, PriorityUtilities.NullPriority(), ((Firebase.CompletionListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #102 <Method Node PriorityUtilities.NullPriority()>
	//    3    5:aconst_null     
	//    4    6:invokespecial   #104 <Method void onDisconnectSetInternal(Object, Node, Firebase$CompletionListener)>
	//    5    9:return          
	}

	public void setValue(Object obj, double d)
	{
		onDisconnectSetInternal(obj, PriorityUtilities.parsePriority(((Object) (Double.valueOf(d)))), ((Firebase.CompletionListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:dload_2         
	//    3    3:invokestatic    #111 <Method Double Double.valueOf(double)>
	//    4    6:invokestatic    #115 <Method Node PriorityUtilities.parsePriority(Object)>
	//    5    9:aconst_null     
	//    6   10:invokespecial   #104 <Method void onDisconnectSetInternal(Object, Node, Firebase$CompletionListener)>
	//    7   13:return          
	}

	public void setValue(Object obj, double d, Firebase.CompletionListener completionlistener)
	{
		onDisconnectSetInternal(obj, PriorityUtilities.parsePriority(((Object) (Double.valueOf(d)))), completionlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:dload_2         
	//    3    3:invokestatic    #111 <Method Double Double.valueOf(double)>
	//    4    6:invokestatic    #115 <Method Node PriorityUtilities.parsePriority(Object)>
	//    5    9:aload           4
	//    6   11:invokespecial   #104 <Method void onDisconnectSetInternal(Object, Node, Firebase$CompletionListener)>
	//    7   14:return          
	}

	public void setValue(Object obj, Firebase.CompletionListener completionlistener)
	{
		onDisconnectSetInternal(obj, PriorityUtilities.NullPriority(), completionlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #102 <Method Node PriorityUtilities.NullPriority()>
	//    3    5:aload_2         
	//    4    6:invokespecial   #104 <Method void onDisconnectSetInternal(Object, Node, Firebase$CompletionListener)>
	//    5    9:return          
	}

	public void setValue(Object obj, String s)
	{
		onDisconnectSetInternal(obj, PriorityUtilities.parsePriority(((Object) (s))), ((Firebase.CompletionListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #115 <Method Node PriorityUtilities.parsePriority(Object)>
	//    4    6:aconst_null     
	//    5    7:invokespecial   #104 <Method void onDisconnectSetInternal(Object, Node, Firebase$CompletionListener)>
	//    6   10:return          
	}

	public void setValue(Object obj, String s, Firebase.CompletionListener completionlistener)
	{
		onDisconnectSetInternal(obj, PriorityUtilities.parsePriority(((Object) (s))), completionlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #115 <Method Node PriorityUtilities.parsePriority(Object)>
	//    4    6:aload_3         
	//    5    7:invokespecial   #104 <Method void onDisconnectSetInternal(Object, Node, Firebase$CompletionListener)>
	//    6   10:return          
	}

	public void setValue(Object obj, Map map, Firebase.CompletionListener completionlistener)
	{
		onDisconnectSetInternal(obj, PriorityUtilities.parsePriority(((Object) (map))), completionlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #115 <Method Node PriorityUtilities.parsePriority(Object)>
	//    4    6:aload_3         
	//    5    7:invokespecial   #104 <Method void onDisconnectSetInternal(Object, Node, Firebase$CompletionListener)>
	//    6   10:return          
	}

	public void updateChildren(Map map)
	{
		updateChildren(map, ((Firebase.CompletionListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #124 <Method void updateChildren(Map, Firebase$CompletionListener)>
	//    4    6:return          
	}

	public void updateChildren(final Map update, final Firebase.CompletionListener listener)
	{
		final Map parsedUpdate = Validation.parseAndValidateUpdate(path, update);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Path path>
	//    2    4:aload_1         
	//    3    5:invokestatic    #130 <Method Map Validation.parseAndValidateUpdate(Path, Map)>
	//    4    8:astore_3        
		repo.scheduleNow(new Runnable() {

			public void run()
			{
				repo.onDisconnectUpdate(path, parsedUpdate, listener, update);
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field OnDisconnect this$0>
			//    2    4:invokestatic    #37  <Method Repo OnDisconnect.access$100(OnDisconnect)>
			//    3    7:aload_0         
			//    4    8:getfield        #22  <Field OnDisconnect this$0>
			//    5   11:invokestatic    #41  <Method Path OnDisconnect.access$000(OnDisconnect)>
			//    6   14:aload_0         
			//    7   15:getfield        #24  <Field Map val$parsedUpdate>
			//    8   18:aload_0         
			//    9   19:getfield        #26  <Field Firebase$CompletionListener val$listener>
			//   10   22:aload_0         
			//   11   23:getfield        #28  <Field Map val$update>
			//   12   26:invokevirtual   #47  <Method void Repo.onDisconnectUpdate(Path, Map, Firebase$CompletionListener, Map)>
			//   13   29:return          
			}

			final OnDisconnect this$0;
			final Firebase.CompletionListener val$listener;
			final Map val$parsedUpdate;
			final Map val$update;

			
			{
				this$0 = OnDisconnect.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field OnDisconnect this$0>
				parsedUpdate = map;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field Map val$parsedUpdate>
				listener = completionlistener;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field Firebase$CompletionListener val$listener>
				update = map1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #28  <Field Map val$update>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #31  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field Repo repo>
	//    7   13:new             #8   <Class OnDisconnect$2>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:aload_2         
	//   12   20:aload_1         
	//   13   21:invokespecial   #133 <Method void OnDisconnect$2(OnDisconnect, Map, Firebase$CompletionListener, Map)>
	//   14   24:invokevirtual   #75  <Method void Repo.scheduleNow(Runnable)>
	//   15   27:return          
	}

	private Path path;
	private Repo repo;


/*
	static Path access$000(OnDisconnect ondisconnect)
	{
		return ondisconnect.path;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Path path>
	//    2    4:areturn         
	}

*/


/*
	static Repo access$100(OnDisconnect ondisconnect)
	{
		return ondisconnect.repo;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Repo repo>
	//    2    4:areturn         
	}

*/
}
