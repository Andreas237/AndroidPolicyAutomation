// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import com.irobot.core.ScheduleMultipleMappingType;
import java.util.ArrayList;
import org.androidannotations.api.a.c;

// Referenced classes of package com.irobot.home.fragments:
//			bb, ba

public static class bb$a extends c
{

	public ba a()
	{
		bb bb1 = new bb();
	//    0    0:new             #7   <Class bb>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void bb()>
	//    3    7:astore_1        
		bb1.setArguments(a);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #18  <Field Bundle a>
	//    7   13:invokevirtual   #22  <Method void bb.setArguments(Bundle)>
		return ((ba) (bb1));
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public bb$a a(int i)
	{
		a.putInt("hourSelected", i);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #25  <String "hourSelected">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #31  <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public bb$a a(ScheduleMultipleMappingType schedulemultiplemappingtype)
	{
		a.putSerializable("typeSelected", ((java.io.Serializable) (schedulemultiplemappingtype)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #34  <String "typeSelected">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #38  <Method void Bundle.putSerializable(String, java.io.Serializable)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public bb$a a(ArrayList arraylist)
	{
		a.putIntegerArrayList("daysSelected", arraylist);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #41  <String "daysSelected">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #45  <Method void Bundle.putIntegerArrayList(String, ArrayList)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public bb$a b(int i)
	{
		a.putInt("minuteSelected", i);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #50  <String "minuteSelected">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #31  <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public bb$a c(int i)
	{
		a.putInt("selectedDayTextColor", i);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #53  <String "selectedDayTextColor">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #31  <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public bb$a d(int i)
	{
		a.putInt("selectedTypeTextColor", i);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #56  <String "selectedTypeTextColor">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #31  <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public bb$a e(int i)
	{
		a.putInt("unselectedTextColor", i);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #59  <String "unselectedTextColor">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #31  <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public bb$a f(int i)
	{
		a.putInt("selectedDayBackgroundResource", i);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #62  <String "selectedDayBackgroundResource">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #31  <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public bb$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void c()>
	//    2    4:return          
	}
}
