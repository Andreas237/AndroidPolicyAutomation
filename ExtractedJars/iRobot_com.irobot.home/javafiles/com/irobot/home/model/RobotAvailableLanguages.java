// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.irobot.core.RobotLanguagesAvailableEvent;
import com.irobot.home.util.j;
import java.util.*;

// Referenced classes of package com.irobot.home.model:
//			RobotLanguage

public class RobotAvailableLanguages
	implements Parcelable
{

	public RobotAvailableLanguages()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		a = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #25  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void ArrayList()>
	//    6   12:putfield        #28  <Field List a>
	//    7   15:return          
	}

	public RobotAvailableLanguages(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		a = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #25  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void ArrayList()>
	//    6   12:putfield        #28  <Field List a>
		parcel.readTypedList(a, RobotLanguage.CREATOR);
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #28  <Field List a>
	//   10   20:getstatic       #32  <Field android.os.Parcelable$Creator RobotLanguage.CREATOR>
	//   11   23:invokevirtual   #38  <Method void Parcel.readTypedList(List, android.os.Parcelable$Creator)>
	//   12   26:return          
	}

	public RobotAvailableLanguages(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		a = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #25  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void ArrayList()>
	//    6   12:putfield        #28  <Field List a>
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); a((RobotLanguage)((Iterator) (list)).next()));
	//    7   15:aload_1         
	//    8   16:invokeinterface #45  <Method Iterator List.iterator()>
	//    9   21:astore_1        
	//   10   22:aload_1         
	//   11   23:invokeinterface #51  <Method boolean Iterator.hasNext()>
	//   12   28:ifeq            47
	//   13   31:aload_0         
	//   14   32:aload_1         
	//   15   33:invokeinterface #55  <Method Object Iterator.next()>
	//   16   38:checkcast       #31  <Class RobotLanguage>
	//   17   41:invokevirtual   #58  <Method void a(RobotLanguage)>
	//*  18   44:goto            22
	//   19   47:return          
	}

	public List a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List a>
	//    2    4:areturn         
	}

	public void a(RobotLanguagesAvailableEvent robotlanguagesavailableevent)
	{
		a = j.a(robotlanguagesavailableevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #68  <Method List j.a(RobotLanguagesAvailableEvent)>
	//    3    5:putfield        #28  <Field List a>
	//    4    8:return          
	}

	public void a(RobotLanguage robotlanguage)
	{
		if(!a.contains(((Object) (robotlanguage))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field List a>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #72  <Method boolean List.contains(Object)>
	//*   4   10:ifne            24
			a.add(((Object) (robotlanguage)));
	//    5   13:aload_0         
	//    6   14:getfield        #28  <Field List a>
	//    7   17:aload_1         
	//    8   18:invokeinterface #75  <Method boolean List.add(Object)>
	//    9   23:pop             
	//   10   24:return          
	}

	public int b()
	{
		return a.size();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List a>
	//    2    4:invokeinterface #80  <Method int List.size()>
	//    3    9:ireturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeTypedList(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #28  <Field List a>
	//    3    5:invokevirtual   #86  <Method void Parcel.writeTypedList(List)>
	//    4    8:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public RobotAvailableLanguages a(Parcel parcel)
		{
			return new RobotAvailableLanguages(parcel);
		//    0    0:new             #9   <Class RobotAvailableLanguages>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void RobotAvailableLanguages(Parcel)>
		//    4    8:areturn         
		}

		public RobotAvailableLanguages[] a(int i)
		{
			return new RobotAvailableLanguages[i];
		//    0    0:iload_1         
		//    1    1:anewarray       RobotAvailableLanguages[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method RobotAvailableLanguages a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method RobotAvailableLanguages[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private List a;

	static 
	{
	//    0    0:new             #8   <Class RobotAvailableLanguages$1>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void RobotAvailableLanguages$1()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
