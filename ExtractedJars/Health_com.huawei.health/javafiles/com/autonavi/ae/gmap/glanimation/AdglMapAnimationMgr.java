// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.ae.gmap.glanimation;

import com.autonavi.ae.gmap.GLMapState;
import java.util.*;

// Referenced classes of package com.autonavi.ae.gmap.glanimation:
//			AbstractAdglAnimation, AdglMapAnimGroup

public class AdglMapAnimationMgr
{
	public static interface MapAnimationListener
	{

		public abstract void onMapAnimationFinish(com.amap.api.maps.AMap.CancelableCallback cancelablecallback);
	}


	public AdglMapAnimationMgr()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		list = Collections.synchronizedList(((List) (new ArrayList())));
	//    2    4:aload_0         
	//    3    5:new             #20  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void ArrayList()>
	//    6   12:invokestatic    #27  <Method List Collections.synchronizedList(List)>
	//    7   15:putfield        #29  <Field List list>
	//    8   18:return          
	}

	public void addAnimation(AbstractAdglAnimation abstractadglanimation, com.amap.api.maps.AMap.CancelableCallback cancelablecallback)
	{
		if(abstractadglanimation == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		List list1 = list;
	//    3    5:aload_0         
	//    4    6:getfield        #29  <Field List list>
	//    5    9:astore_3        
		list1;
	//    6   10:aload_3         
		JVM INSTR monitorenter ;
	//    7   11:monitorenter    
		AbstractAdglAnimation abstractadglanimation1;
		if(abstractadglanimation.isOver() || list.size() <= 0)
			break MISSING_BLOCK_LABEL_113;
	//    8   12:aload_1         
	//    9   13:invokevirtual   #38  <Method boolean AbstractAdglAnimation.isOver()>
	//   10   16:ifne            113
	//   11   19:aload_0         
	//   12   20:getfield        #29  <Field List list>
	//   13   23:invokeinterface #44  <Method int List.size()>
	//   14   28:ifle            113
		abstractadglanimation1 = (AbstractAdglAnimation)list.get(list.size() - 1);
	//   15   31:aload_0         
	//   16   32:getfield        #29  <Field List list>
	//   17   35:aload_0         
	//   18   36:getfield        #29  <Field List list>
	//   19   39:invokeinterface #44  <Method int List.size()>
	//   20   44:iconst_1        
	//   21   45:isub            
	//   22   46:invokeinterface #48  <Method Object List.get(int)>
	//   23   51:checkcast       #34  <Class AbstractAdglAnimation>
	//   24   54:astore          4
		if(abstractadglanimation1 == null)
			break MISSING_BLOCK_LABEL_113;
	//   25   56:aload           4
	//   26   58:ifnull          113
		if((abstractadglanimation instanceof AdglMapAnimGroup) && (abstractadglanimation1 instanceof AdglMapAnimGroup) && ((AdglMapAnimGroup)abstractadglanimation).typeEqueal((AdglMapAnimGroup)abstractadglanimation1) && !((AdglMapAnimGroup)abstractadglanimation).needMove)
	//*  27   61:aload_1         
	//*  28   62:instanceof      #50  <Class AdglMapAnimGroup>
	//*  29   65:ifeq            113
	//*  30   68:aload           4
	//*  31   70:instanceof      #50  <Class AdglMapAnimGroup>
	//*  32   73:ifeq            113
	//*  33   76:aload_1         
	//*  34   77:checkcast       #50  <Class AdglMapAnimGroup>
	//*  35   80:aload           4
	//*  36   82:checkcast       #50  <Class AdglMapAnimGroup>
	//*  37   85:invokevirtual   #54  <Method boolean AdglMapAnimGroup.typeEqueal(AdglMapAnimGroup)>
	//*  38   88:ifeq            113
	//*  39   91:aload_1         
	//*  40   92:checkcast       #50  <Class AdglMapAnimGroup>
	//*  41   95:getfield        #58  <Field boolean AdglMapAnimGroup.needMove>
	//*  42   98:ifne            113
			list.remove(((Object) (abstractadglanimation1)));
	//   43  101:aload_0         
	//   44  102:getfield        #29  <Field List list>
	//   45  105:aload           4
	//   46  107:invokeinterface #62  <Method boolean List.remove(Object)>
	//   47  112:pop             
		list.add(((Object) (abstractadglanimation)));
	//   48  113:aload_0         
	//   49  114:getfield        #29  <Field List list>
	//   50  117:aload_1         
	//   51  118:invokeinterface #65  <Method boolean List.add(Object)>
	//   52  123:pop             
		mCancelCallback = cancelablecallback;
	//   53  124:aload_0         
	//   54  125:aload_2         
	//   55  126:putfield        #67  <Field com.amap.api.maps.AMap$CancelableCallback mCancelCallback>
		list1;
	//   56  129:aload_3         
		JVM INSTR monitorexit ;
	//   57  130:monitorexit     
		return;
	//   58  131:return          
		abstractadglanimation;
	//   59  132:astore_1        
	//*  60  133:aload_3         
		throw abstractadglanimation;
	//   61  134:monitorexit     
	//   62  135:aload_1         
	//   63  136:athrow          
	}

	public void clearAnimations()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		list.clear();
	//    2    2:aload_0         
	//    3    3:getfield        #29  <Field List list>
	//    4    6:invokeinterface #71  <Method void List.clear()>
		this;
	//    5   11:aload_0         
		JVM INSTR monitorexit ;
	//    6   12:monitorexit     
		return;
	//    7   13:return          
		Exception exception;
		exception;
	//    8   14:astore_1        
	//*   9   15:aload_0         
		throw exception;
	//   10   16:monitorexit     
	//   11   17:aload_1         
	//   12   18:athrow          
	}

	public void doAnimations(GLMapState glmapstate)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(glmapstate == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       9
	//*   4    6:aload_0         
			return;
	//    5    7:monitorexit     
	//    6    8:return          
		if(list.size() > 0)
			break MISSING_BLOCK_LABEL_24;
	//    7    9:aload_0         
	//    8   10:getfield        #29  <Field List list>
	//    9   13:invokeinterface #44  <Method int List.size()>
	//   10   18:ifgt            24
		this;
	//   11   21:aload_0         
		JVM INSTR monitorexit ;
	//   12   22:monitorexit     
		return;
	//   13   23:return          
		AbstractAdglAnimation abstractadglanimation = (AbstractAdglAnimation)list.get(0);
	//   14   24:aload_0         
	//   15   25:getfield        #29  <Field List list>
	//   16   28:iconst_0        
	//   17   29:invokeinterface #48  <Method Object List.get(int)>
	//   18   34:checkcast       #34  <Class AbstractAdglAnimation>
	//   19   37:astore_2        
		if(abstractadglanimation != null)
			break MISSING_BLOCK_LABEL_45;
	//   20   38:aload_2         
	//   21   39:ifnonnull       45
		this;
	//   22   42:aload_0         
		JVM INSTR monitorexit ;
	//   23   43:monitorexit     
		return;
	//   24   44:return          
		if(abstractadglanimation.isOver())
	//*  25   45:aload_2         
	//*  26   46:invokevirtual   #38  <Method boolean AbstractAdglAnimation.isOver()>
	//*  27   49:ifeq            86
		{
			if(mMapAnimationListener != null)
	//*  28   52:aload_0         
	//*  29   53:getfield        #75  <Field AdglMapAnimationMgr$MapAnimationListener mMapAnimationListener>
	//*  30   56:ifnull          72
				mMapAnimationListener.onMapAnimationFinish(mCancelCallback);
	//   31   59:aload_0         
	//   32   60:getfield        #75  <Field AdglMapAnimationMgr$MapAnimationListener mMapAnimationListener>
	//   33   63:aload_0         
	//   34   64:getfield        #67  <Field com.amap.api.maps.AMap$CancelableCallback mCancelCallback>
	//   35   67:invokeinterface #79  <Method void AdglMapAnimationMgr$MapAnimationListener.onMapAnimationFinish(com.amap.api.maps.AMap$CancelableCallback)>
			list.remove(((Object) (abstractadglanimation)));
	//   36   72:aload_0         
	//   37   73:getfield        #29  <Field List list>
	//   38   76:aload_2         
	//   39   77:invokeinterface #62  <Method boolean List.remove(Object)>
	//   40   82:pop             
			break MISSING_BLOCK_LABEL_91;
	//   41   83:goto            91
		}
		abstractadglanimation.doAnimation(((Object) (glmapstate)));
	//   42   86:aload_2         
	//   43   87:aload_1         
	//   44   88:invokevirtual   #83  <Method void AbstractAdglAnimation.doAnimation(Object)>
		this;
	//   45   91:aload_0         
		JVM INSTR monitorexit ;
	//   46   92:monitorexit     
		return;
	//   47   93:return          
		glmapstate;
	//   48   94:astore_1        
	//*  49   95:aload_0         
		throw glmapstate;
	//   50   96:monitorexit     
	//   51   97:aload_1         
	//   52   98:athrow          
	}

	public int getAnimationsCount()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = list.size();
	//    2    2:aload_0         
	//    3    3:getfield        #29  <Field List list>
	//    4    6:invokeinterface #44  <Method int List.size()>
	//    5   11:istore_1        
		this;
	//    6   12:aload_0         
		JVM INSTR monitorexit ;
	//    7   13:monitorexit     
		return i;
	//    8   14:iload_1         
	//    9   15:ireturn         
		Exception exception;
		exception;
	//   10   16:astore_2        
	//*  11   17:aload_0         
		throw exception;
	//   12   18:monitorexit     
	//   13   19:aload_2         
	//   14   20:athrow          
	}

	public com.amap.api.maps.AMap.CancelableCallback getCancelCallback()
	{
		return mCancelCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field com.amap.api.maps.AMap$CancelableCallback mCancelCallback>
	//    2    4:areturn         
	}

	public void setMapAnimationListener(MapAnimationListener mapanimationlistener)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		mMapAnimationListener = mapanimationlistener;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:putfield        #75  <Field AdglMapAnimationMgr$MapAnimationListener mMapAnimationListener>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return;
	//    7    9:return          
		mapanimationlistener;
	//    8   10:astore_1        
	//*   9   11:aload_0         
		throw mapanimationlistener;
	//   10   12:monitorexit     
	//   11   13:aload_1         
	//   12   14:athrow          
	}

	public void setMapCoreListener()
	{
	//    0    0:return          
	}

	private List list;
	private com.amap.api.maps.AMap.CancelableCallback mCancelCallback;
	private MapAnimationListener mMapAnimationListener;
}
