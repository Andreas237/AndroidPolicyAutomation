// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.constraints.controllers;

import android.content.Context;
import androidx.work.Constraints;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;

// Referenced classes of package androidx.work.impl.constraints.controllers:
//			ConstraintController

public class BatteryNotLowController extends ConstraintController
{

	public BatteryNotLowController(Context context)
	{
		super(((androidx.work.impl.constraints.trackers.ConstraintTracker) (Trackers.getInstance(context).getBatteryNotLowTracker())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #13  <Method Trackers Trackers.getInstance(Context)>
	//    3    5:invokevirtual   #17  <Method androidx.work.impl.constraints.trackers.BatteryNotLowTracker Trackers.getBatteryNotLowTracker()>
	//    4    8:invokespecial   #20  <Method void ConstraintController(androidx.work.impl.constraints.trackers.ConstraintTracker)>
	//    5   11:return          
	}

	boolean hasConstraint(WorkSpec workspec)
	{
		return workspec.constraints.requiresBatteryNotLow();
	//    0    0:aload_1         
	//    1    1:getfield        #30  <Field Constraints WorkSpec.constraints>
	//    2    4:invokevirtual   #36  <Method boolean Constraints.requiresBatteryNotLow()>
	//    3    7:ireturn         
	}

	boolean isConstrained(Boolean boolean1)
	{
		return boolean1.booleanValue() ^ true;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #44  <Method boolean Boolean.booleanValue()>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:ireturn         
	}

	volatile boolean isConstrained(Object obj)
	{
		return isConstrained((Boolean)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #41  <Class Boolean>
	//    3    5:invokevirtual   #47  <Method boolean isConstrained(Boolean)>
	//    4    8:ireturn         
	}
}
