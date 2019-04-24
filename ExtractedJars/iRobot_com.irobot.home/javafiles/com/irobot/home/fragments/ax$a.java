// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import com.irobot.core.ScheduleLocationType;
import java.util.ArrayList;
import org.androidannotations.api.a.c;

// Referenced classes of package com.irobot.home.fragments:
//			ax, aw

public static class ax$a extends c
{

	public aw a()
	{
		ax ax1 = new ax();
	//    0    0:new             #7   <Class ax>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void ax()>
	//    3    7:astore_1        
		ax1.setArguments(a);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #18  <Field Bundle a>
	//    7   13:invokevirtual   #22  <Method void ax.setArguments(Bundle)>
		return ((aw) (ax1));
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public ax$a a(int i)
	{
		a.putInt("selectedTextColor", i);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #25  <String "selectedTextColor">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #31  <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public ax$a a(ScheduleLocationType schedulelocationtype)
	{
		a.putSerializable("locationType", ((java.io.Serializable) (schedulelocationtype)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #34  <String "locationType">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #38  <Method void Bundle.putSerializable(String, java.io.Serializable)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public ax$a a(String s)
	{
		a.putString("incomingMapId", s);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #41  <String "incomingMapId">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #45  <Method void Bundle.putString(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public ax$a a(ArrayList arraylist)
	{
		a.putStringArrayList("incomingSelectedRegionIds", arraylist);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #48  <String "incomingSelectedRegionIds">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #52  <Method void Bundle.putStringArrayList(String, ArrayList)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public ax$a a(boolean flag)
	{
		a.putBoolean("incomingIsOrdered", flag);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #57  <String "incomingIsOrdered">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #61  <Method void Bundle.putBoolean(String, boolean)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public ax$a b(int i)
	{
		a.putInt("unselectedTextColor", i);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #64  <String "unselectedTextColor">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #31  <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public ax$a b(boolean flag)
	{
		a.putBoolean("isMapUploadEnabled", flag);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #66  <String "isMapUploadEnabled">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #61  <Method void Bundle.putBoolean(String, boolean)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public ax$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void c()>
	//    2    4:return          
	}
}
