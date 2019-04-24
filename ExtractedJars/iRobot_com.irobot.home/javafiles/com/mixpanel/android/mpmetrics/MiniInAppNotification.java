// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.mpmetrics;

import android.os.Parcel;
import com.mixpanel.android.a.e;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//			InAppNotification, b

public class MiniInAppNotification extends InAppNotification
{

	public MiniInAppNotification(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void InAppNotification(Parcel)>
		e = parcel.readString();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #31  <Method String Parcel.readString()>
	//    6   10:putfield        #33  <Field String e>
		f = parcel.readInt();
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #37  <Method int Parcel.readInt()>
	//   10   18:putfield        #39  <Field int f>
		g = parcel.readInt();
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #37  <Method int Parcel.readInt()>
	//   14   26:putfield        #41  <Field int g>
	//   15   29:return          
	}

	MiniInAppNotification(JSONObject jsonobject)
	{
		super(jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #46  <Method void InAppNotification(JSONObject)>
		try
		{
			e = com.mixpanel.android.a.e.a(jsonobject, "cta_url");
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #48  <String "cta_url">
	//    6    9:invokestatic    #54  <Method String e.a(JSONObject, String)>
	//    7   12:putfield        #33  <Field String e>
			f = jsonobject.getInt("image_tint_color");
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:ldc1            #56  <String "image_tint_color">
	//   11   19:invokevirtual   #62  <Method int JSONObject.getInt(String)>
	//   12   22:putfield        #39  <Field int f>
			g = jsonobject.getInt("border_color");
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:ldc1            #64  <String "border_color">
	//   16   29:invokevirtual   #62  <Method int JSONObject.getInt(String)>
	//   17   32:putfield        #41  <Field int g>
			return;
	//   18   35:return          
		}
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//*  19   36:astore_1        
		{
			throw new b("Notification JSON was unexpected or bad", ((Throwable) (jsonobject)));
	//   20   37:new             #66  <Class b>
	//   21   40:dup             
	//   22   41:ldc1            #68  <String "Notification JSON was unexpected or bad">
	//   23   43:aload_1         
	//   24   44:invokespecial   #71  <Method void b(String, Throwable)>
	//   25   47:athrow          
		}
	}

	public InAppNotification.a d()
	{
		return InAppNotification.a.MINI;
	//    0    0:getstatic       #79  <Field InAppNotification$a InAppNotification$a.MINI>
	//    1    3:areturn         
	}

	public String n()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String e>
	//    2    4:areturn         
	}

	public int o()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int f>
	//    2    4:ireturn         
	}

	public int p()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int g>
	//    2    4:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #86  <Method void InAppNotification.writeToParcel(Parcel, int)>
		parcel.writeString(e);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #33  <Field String e>
	//    7   11:invokevirtual   #90  <Method void Parcel.writeString(String)>
		parcel.writeInt(f);
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #39  <Field int f>
	//   11   19:invokevirtual   #94  <Method void Parcel.writeInt(int)>
		parcel.writeInt(g);
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #41  <Field int g>
	//   15   27:invokevirtual   #94  <Method void Parcel.writeInt(int)>
	//   16   30:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public MiniInAppNotification a(Parcel parcel)
		{
			return new MiniInAppNotification(parcel);
		//    0    0:new             #9   <Class MiniInAppNotification>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void MiniInAppNotification(Parcel)>
		//    4    8:areturn         
		}

		public MiniInAppNotification[] a(int i)
		{
			return new MiniInAppNotification[i];
		//    0    0:iload_1         
		//    1    1:anewarray       MiniInAppNotification[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method MiniInAppNotification a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method MiniInAppNotification[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private final String e;
	private final int f;
	private final int g;

	static 
	{
	//    0    0:new             #6   <Class MiniInAppNotification$1>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void MiniInAppNotification$1()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
