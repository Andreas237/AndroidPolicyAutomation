// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver.widgets;

import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package android.support.constraint.solver.widgets:
//			ResolutionAnchor, ResolutionDimension

public class ResolutionNode
{

	public ResolutionNode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		dependents = new HashSet(2);
	//    2    4:aload_0         
	//    3    5:new             #21  <Class HashSet>
	//    4    8:dup             
	//    5    9:iconst_2        
	//    6   10:invokespecial   #24  <Method void HashSet(int)>
	//    7   13:putfield        #26  <Field HashSet dependents>
		state = 0;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #28  <Field int state>
	//   11   21:return          
	}

	public void addDependent(ResolutionNode resolutionnode)
	{
		dependents.add(((Object) (resolutionnode)));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field HashSet dependents>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #35  <Method boolean HashSet.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void didResolve()
	{
		state = 1;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #28  <Field int state>
		for(Iterator iterator = dependents.iterator(); iterator.hasNext(); ((ResolutionNode)iterator.next()).resolve());
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field HashSet dependents>
	//    5    9:invokevirtual   #40  <Method Iterator HashSet.iterator()>
	//    6   12:astore_1        
	//    7   13:aload_1         
	//    8   14:invokeinterface #46  <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            37
	//   10   22:aload_1         
	//   11   23:invokeinterface #50  <Method Object Iterator.next()>
	//   12   28:checkcast       #2   <Class ResolutionNode>
	//   13   31:invokevirtual   #53  <Method void resolve()>
	//*  14   34:goto            13
	//   15   37:return          
	}

	public void invalidate()
	{
		state = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #28  <Field int state>
		for(Iterator iterator = dependents.iterator(); iterator.hasNext(); ((ResolutionNode)iterator.next()).invalidate());
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field HashSet dependents>
	//    5    9:invokevirtual   #40  <Method Iterator HashSet.iterator()>
	//    6   12:astore_1        
	//    7   13:aload_1         
	//    8   14:invokeinterface #46  <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            37
	//   10   22:aload_1         
	//   11   23:invokeinterface #50  <Method Object Iterator.next()>
	//   12   28:checkcast       #2   <Class ResolutionNode>
	//   13   31:invokevirtual   #56  <Method void invalidate()>
	//*  14   34:goto            13
	//   15   37:return          
	}

	public void invalidateAnchors()
	{
		if(this instanceof ResolutionAnchor)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #59  <Class ResolutionAnchor>
	//*   2    4:ifeq            12
			state = 0;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #28  <Field int state>
		for(Iterator iterator = dependents.iterator(); iterator.hasNext(); ((ResolutionNode)iterator.next()).invalidateAnchors());
	//    6   12:aload_0         
	//    7   13:getfield        #26  <Field HashSet dependents>
	//    8   16:invokevirtual   #40  <Method Iterator HashSet.iterator()>
	//    9   19:astore_1        
	//   10   20:aload_1         
	//   11   21:invokeinterface #46  <Method boolean Iterator.hasNext()>
	//   12   26:ifeq            44
	//   13   29:aload_1         
	//   14   30:invokeinterface #50  <Method Object Iterator.next()>
	//   15   35:checkcast       #2   <Class ResolutionNode>
	//   16   38:invokevirtual   #61  <Method void invalidateAnchors()>
	//*  17   41:goto            20
	//   18   44:return          
	}

	public boolean isResolved()
	{
		return state == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int state>
	//    2    4:iconst_1        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public void remove(ResolutionDimension resolutiondimension)
	{
	//    0    0:return          
	}

	public void reset()
	{
		state = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #28  <Field int state>
		dependents.clear();
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field HashSet dependents>
	//    5    9:invokevirtual   #68  <Method void HashSet.clear()>
	//    6   12:return          
	}

	public void resolve()
	{
	//    0    0:return          
	}

	public static final int REMOVED = 2;
	public static final int RESOLVED = 1;
	public static final int UNRESOLVED = 0;
	HashSet dependents;
	int state;
}
